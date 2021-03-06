// Download the twilio-csharp library from twilio.com/docs/csharp/install
using System;
using Twilio;
class Example 
{
  static void Main(string[] args) 
  {
    // Find your Account Sid and Auth Token at twilio.com/user/account
    string AccountSid = "{{ account_sid }}";
    string AuthToken = "{{ auth_token }}";
    var twilio = new TwilioRestClient(AccountSid, AuthToken);

    var options = new ApplicationOptions();
    options.FriendlyName = "Phone Me";
    options.VoiceUrl = "http://demo.twilio.com/docs/voice.xml";
    options.VoiceMethod = "GET";
    var app = twilio.AddApplication(options);
    
    Console.WriteLine(app.Sid);
  }
}