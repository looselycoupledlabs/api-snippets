# Get twilio-ruby from twilio.com/docs/ruby/install
require 'rubygems'          # This line not needed for ruby > 1.8
require 'twilio-ruby'

# Get your Account Sid and Auth Token from twilio.com/user/account
account_sid = '{{ account_sid }}'
auth_token = '{{ auth_token }}'
@client = Twilio::REST::Client.new account_sid, auth_token

# Get an object from its sid. If you do not have a sid,
# check out the list resource examples on this page
@domain = @client.account.sip.domains.get("SD32a3c49700934481addd5ce1659f04d2")
@domain.update(:friendly_name => "Little Kevin",
    :voice_method => "GET")
puts @domain.domain_name
