package in.ineuron.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Image")
public class ImageResponseApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ImageResponseApp() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Image Response App is instantiated.....");
        
    }

	
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Image Response App is initialized.....");
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Image Response App is destroyed.....");
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		response.setContentType("image/jpg");
//		
//		String path = getServletContext().getRealPath("bullet.jpg");
		
//		response.setContentType("video/mp4");
//		
//		String path = getServletContext().getRealPath("test_video.mp4");
		
		
		response.setContentType("application/pdf");
		
		String path = getServletContext().getRealPath("inv_127113.pdf");
		
		
         File f = new File(path);
         FileInputStream fis  = new FileInputStream(f);
         
         ServletOutputStream os = response.getOutputStream();
         
         byte[] b = new byte[(int)f.length()];
         
        fis.read(b);
        os.write(b);
        os.flush();
         
        fis.close();
        os.close();
	}

}




