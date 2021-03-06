<?php
// Get the PHP helper library from twilio.com/docs/php/install
require_once('/path/to/twilio-php/Services/Twilio.php'); // Loads the library

// Your Account Sid and Auth Token from twilio.com/user/account
$sid = "{{ account_sid }}"; 
$token = "{{ auth_token }}"; 
$client = new Services_Twilio($sid, $token);

// Get an object from its sid. If you do not have a sid,
// check out the list resource examples on this page
$member = $client->account->queues->get('QU5ef8732a3c49700934481addd5ce1659')->members->get("CA386025c9bf5d6052a1d1ea42b4d16662");
echo $member->wait_time;
