package com.toufiq;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class Fileupload
 */
public class Fileupload extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Fileupload() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
		
		try {
			List<FileItem> multifiles = sf.parseRequest(request);
		
			for (FileItem fileItem : multifiles) {	
				
				// constructs the directory path to store upload file
				String uploadPath = getServletContext().getRealPath("")
				     + "src\\";
				// creates the directory if it does not exist
				File uploadDir = new File(uploadPath);
				if (!uploadDir.exists()) {
				    uploadDir.mkdir();
				}
				
				fileItem.write(new File(uploadPath+fileItem.getName()));
				out.println("Uploaded");
				//out.println("Current folder: " + uploadPath);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.println("Not Uploaded");
			e.printStackTrace();
		}
		
		
	}

}
