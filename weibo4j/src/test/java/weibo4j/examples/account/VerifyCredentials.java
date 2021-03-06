package weibo4j.examples.account;

import weibo4j.User;
import weibo4j.Weibo;
import weibo4j.WeiboException;

/**
 * @author sina
 *
 */
public class VerifyCredentials {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("weibo4j.oauth.consumerKey", Weibo.CONSUMER_KEY);
    	System.setProperty("weibo4j.oauth.consumerSecret", Weibo.CONSUMER_SECRET);
		try {
			Weibo weibo = new Weibo();
			weibo.setToken();
			User user = weibo.verifyCredentials();
			System.out.println(user.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
