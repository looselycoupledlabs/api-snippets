// Download the Node helper library from twilio.com/docs/node/install
// These vars are your accountSid and authToken from twilio.com/user/account
var accountSid = '{{ account_sid }}';
var authToken = "{{ auth_token }}";
var client = require('twilio')(accountSid, authToken);

client.calls.list({ status: "in-progress",
    "startTime>": "2009-07-04",
    "startTime<": "2009-07-06" }, function(err, data) {
    data.calls.forEach(function(call) {
        console.log(call.To);
    });
});