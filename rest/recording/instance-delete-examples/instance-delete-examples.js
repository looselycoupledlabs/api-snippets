// Download the Node helper library from twilio.com/docs/node/install
// These vars are your accountSid and authToken from twilio.com/user/account
var accountSid = '{{ account_sid }}';
var authToken = "{{ auth_token }}";
var client = require('twilio')(accountSid, authToken);

client.recordings("RE557ce644e5ab84fa21cc21112e22c485").delete(function(err, data) {
    if (err) {
        console.log(err.status);
        throw err.message;
    } else {
        console.log("Sid RE557ce644e5ab84fa21cc21112e22c485 deleted successfully.");
    }
});