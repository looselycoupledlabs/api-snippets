# Download the Python helper library from twilio.com/docs/python/install
from twilio.rest import TwilioRestClient

# Your Account Sid and Auth Token from twilio.com/user/account
account_sid = "{{ account_sid }}"
auth_token  = "{{ auth_token }}"
client = TwilioRestClient(account_sid, auth_token)

call = client.calls.update("CAe1644a7eed5088b159577c5802d8be38", url="http://demo.twilio.com/docs/voice.xml",
    method="POST")
print call.to
