// Download the Node helper library from twilio.com/docs/node/install
// These vars are your accountSid and authToken from twilio.com/user/account
var accountSid = '{{ account_sid }}';
var authToken = "{{ auth_token }}";
var client = require('twilio')(accountSid, authToken);

client.calls.create({
    url: "http://www.example.com/sipdial.xml",
    to: "sip:kate@example.com",
    from: "Jack"
}, function(err, call) {
    process.stdout.write(call.sid);
});