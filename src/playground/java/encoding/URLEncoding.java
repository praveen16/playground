/**
 * 
 */
package playground.java.encoding;

import java.security.AccessController;

import sun.security.action.GetPropertyAction;

/**
 * @author pnuthulapati
 *
 */
public class URLEncoding {
	public static void printDefaultEncoding(){
		System.out.println("The default URL encoding is "
					+ (String)AccessController.doPrivileged (new GetPropertyAction("file.encoding")));
	}

	public static void main(String args[]){
		URLEncoding.printDefaultEncoding();
	}
}
