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
    string WorkspaceSid = "{{ workspace_sid }}";
    var client = new TaskRouterClient(AccountSid, AuthToken);

    Workspace workspace = client.UpdateWorkspace(WorkspaceSid, "NewFriendlyName", "http://requestb.in/vh9reovh", null, null);
    Console.WriteLine(workspace.FriendlyName);
    Console.WriteLine(workspace.EventCallbackUrl);
  }
}