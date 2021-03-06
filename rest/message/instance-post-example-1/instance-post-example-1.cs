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

    string sid = "MM5ef8732a3c49700934481addd5ce1659";

    var message = twilio.RedactMessage(MessageSid);

    Console.WriteLine(message.Body); // will be empty
  }
}