// Download the **Next-Gen** twilio-java library from:
// twilio.com/docs/libraries/java#installation-nextgen
import com.twilio.sdk.Twilio;
import com.twilio.sdk.resource.preview.wireless.device.Usage;

public class Example {

  // Find your Account Sid and Token at twilio.com/console
  public static final String ACCOUNT_SID = "{{ account_sid }}";
  public static final String AUTH_TOKEN = "{{ auth_token }}";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    Usage usage = Usage.fetch("DEb8eff34b248d066a31c4a953134e183e")
      .execute();
    System.out.println(usage.getPeriod().get("start"));
    System.out.println(usage.getPeriod().get("end"));
    System.out.println(usage.getDataCosts().get("total"));
  }
}