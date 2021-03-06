# Download the Python helper library from twilio.com/docs/python/install
from twilio.rest import TwilioTaskRouterClient

# Your Account Sid and Auth Token from twilio.com/user/account
account_sid = "{{ account_sid }}"
auth_token  = "{{ auth_token }}"
workspace_sid = "{{ workspace_sid }}"
worker_sid = "{{ worker_sid }}"
reservation_sid = "{{ reservation_sid }}"

client = TwilioTaskRouterClient(account_sid, auth_token)

# dequeue a reservation
reservation = client.workers(workspace_sid).get(worker_sid).reservations.update(reservation_sid, instruction='dequeue', dequeue_from='+18001231234')
print reservation.reservation_status
print reservation.worker_name

