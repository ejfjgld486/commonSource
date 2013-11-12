package kr.co.javaproject.commonSource;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtils {
	/**
	 * 파일을 복사 한다 
	 * <p>사용법  : FileUtils.copy(file ,target)</p>
	 * @param source
	 * @param target
	 * @return
	 */
	 @SuppressWarnings("finally")
	public static boolean copy(File source, String target) {
	        boolean copyAt = false;

	        BufferedInputStream bis = null;
	        BufferedOutputStream bos = null;
	        try {
	            bis = new BufferedInputStream(new FileInputStream(source));
	            bos = new BufferedOutputStream(new FileOutputStream(target));
	            int byteNumer;
	            try {
	                while ((byteNumer = bis.read()) != -1) {
	                    bos.write(byteNumer);
	                }
	                copyAt = true;
	            } catch (Exception e) {
	            	System.out.println("e" + e.toString());
	                e.printStackTrace();
	            }
	        } catch (Exception e) {
	        	System.out.println("e" + e.toString());
	            e.printStackTrace();
	        } finally {
	            try {
	                bis.close();
	                bos.flush();
	                bos.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            } finally {
	                return copyAt;
	            }
	        }
	    }
	 
	 /**
	  * 파일을 복사한다.
	  * <p>사용법  : FileUtils.copy(source ,target)</p>
	  * @param source
	  * @param target
	  * @return
	  */
	 public static boolean copy(String source, String target) {
	        File sourceFile = new File(source);
	        System.out.println(sourceFile.exists());
	        
	        if (sourceFile.exists()) {
	            return FileUtils.copy(sourceFile, target);
	        } else {
	            return false;
	        }
	    }
	 
	 /**
	  * 파일을 삭제 한다.
	  * <p>사용법  : FileUtils.delete(fileFullPath)</p>
	  * @param fileNm
	  * @return
	  */
	 public static boolean delete(String fileNm) {
	        File file = new File(fileNm);
	        if (file.exists()) {
	            file.delete();
	            return true;
	        } else {
	            return false;
	        }
	    }
	 
	 /**
	  * 파일을 이동한다.
	  * @param source
	  * @param target
	  * @return
	  */
	  public static boolean move(String source, String target) {
	        File sourceFile = new File(source);

	        if (sourceFile.exists()) {
	            FileUtils.createDir(target);
	            if (FileUtils.copy(source, target)) {
	                sourceFile.delete();
	                return true;
	            } else {
	                return false;
	            }
	        } else {
	            return false;
	        }
	    }
	  
	  
	  /**
	   * 드렉토리를 생성한다. 
	   * 
	   * @param path
	   */
	  public static void createDir(File path) {
	        if (!path.exists()) {
	            path.mkdirs();
	        }
	  }
	  
	  /**
	   * 
	   * @param path
	   */
	  public static void createDir(String path) {
		  createDir(new File(path));
	  }
	  
	  

}
