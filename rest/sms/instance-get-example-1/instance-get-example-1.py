# Download the Python helper library from twilio.com/docs/python/install
from twilio.rest import TwilioRestClient

# Your Account Sid and Auth Token from twilio.com/user/account
account_sid = "{{ account_sid }}"
auth_token  = "{{ auth_token }}"
client = TwilioRestClient(account_sid, auth_token)

sms = client.sms.messages.get("SM800f449d0399ed014aae2bcc0cc2f2ec")
print sms.body
