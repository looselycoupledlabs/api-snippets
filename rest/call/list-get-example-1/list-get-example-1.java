// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.instance.Call;
import com.twilio.sdk.resource.list.CallList;

public class Example { 

  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "{{ account_sid }}";
  public static final String AUTH_TOKEN = "{{ auth_token }}";

  public static void main(String[] args) throws TwilioRestException {
    TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

    
    
    CallList calls = client.getAccount().getCalls();
    
    // Loop over calls and print out a property for each one.
    for (Call call : calls) {
      System.out.println(call.getDirection());
    }
    
  }
}