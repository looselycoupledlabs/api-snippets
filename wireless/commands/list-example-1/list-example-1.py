# Download the **Next-Gen** twilio-python library from:
# twilio.com/docs/libraries/python#installation-nextgen
from twilio.rest import Client

account_sid = "{{ account_sid }}" # Your Account SID from www.twilio.com/console
auth_token  = "{{ auth_token }}"  # Your Auth Token from www.twilio.com/console

client = Client(account_sid, auth_token)
wireless = client.preview.wireless

for cmd in wireless.commands.list():
    print(cmd.command)