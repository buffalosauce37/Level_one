import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class FindLatestTweet implements ActionListener {
	JFrame framey = new JFrame("Latest Tweet Finder");
	JPanel pane = new JPanel();
	JButton butt = new JButton("Search The Twitterverse");
	JTextField texty = new JTextField();

	void Tweet() {
		framey.add(pane);
		pane.add(texty);
		pane.add(butt);
		butt.addActionListener(this);
		framey.setVisible(true);
		Dimension dime = new Dimension(200, 25);
		texty.setPreferredSize(dime);
		framey.pack();
	}

	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken("2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN", "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}

	public static void main(String[] args) {
		FindLatestTweet Tweet = new FindLatestTweet();
		Tweet.Tweet();
	} 

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text = texty.getText();
JOptionPane.showMessageDialog(null, getLatestTweet(text));
	}
}
