# Get twilio-ruby from twilio.com/docs/ruby/install
require 'rubygems'          # This line not needed for ruby > 1.8
require 'twilio-ruby'

# Get your Account Sid and Auth Token from twilio.com/user/account
account_sid = '{{ account_sid }}'
auth_token = '{{ auth_token }}'
@client = Twilio::REST::Client.new account_sid, auth_token


# Loop over calls and print out a property for each one
@client.account.calls.list({
    :status => "in-progress",
    :"start_time>" => "2009-07-04",
    :"start_time<" => "2009-07-06"}).each do |call|
    puts call.to
end
