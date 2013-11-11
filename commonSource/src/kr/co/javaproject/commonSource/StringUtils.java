package kr.co.javaproject.commonSource;
/**
 * StringUtil 
 * String ó���� ���� Util
 * @author www.javaproject.co.kr 
 * �ҽ��� �����ο� ���,����,�� ������ �����մϴ�.
 * �ڹ�������Ʈ����Ʈ�� �� �ҽ� ����Կ� �־� ��� ������� ���� å���� ���� �ʽ��ϴ�.
 * �ҽ��� ���� ���� ������ ����Ʈ �Խ����� ���� �����ּ���.   
 */
public class StringUtils {
	
	
	/**
	 *  Null üƮ�� �Ѵ�
	 *  ���� : if(StringUtils.isNull(str)) { }
	 * @param val �� üũ�� ��  ��
	 * @return
	 */
	public static boolean isNull(String val){
		return (val==null);
	}
	
	/**
	 * String ������ ��ȯ�Ѵ�.
	 * ���� : String s = StringUtils.stringValue(str);
	 * @param val String value�� ��ȯ �� ��
	 * @return
	 */
	public static String stringValue(String val) {
		return stringValue(val,"");
	}
	
	/**
	 * String ������ ��ȯ�ϰ�  null�� ��� String ���� ���� �Ѵ�
	 * ���� : String s = StringUtils.stringValue(str,"abc");
	 * @param val
	 * @param val2
	 * @return
	 */
	public static String stringValue(String val,String val2){
		return  (val==null)?val2:val;
	}
	
	/**
	 * String ���� int ������ ��ȯ�Ѵ�
	 * ���� : int a = StringUtils.intValue(str);
	 * @param val
	 * @return
	 */
	public static int intValue(String val){
		return intValue(val,0);
	}
	
	
	/**
	 * String ���� int ������ ��ȯ�Ѵ�
	 * ���� : int a = StringUtils.intValue(str,5);
	 * @param val
	 * @return
	 */
	public static int intValue(String val,int val2){
		try{
			return Integer.parseInt(val);
		}catch(Exception e){
			return val2;
		}
	}		
}
