# Rock-Paper-Scissors
*** This is a task given by Kalvium ***
The three gestures used in base Rock Paper Scissors are rock, paper,
and scissors. The way these are scored is as such: Rock beats Scissors,
Scissors beats Paper, Paper beats Rock. It gets a lot more complicated
when you introduce new gestures, but let's keep it simple for now.
We're definitely going to need a way to decide who has won and who has lost, or
whether the round has ended in a draw. Using the rules provided, give us an
engine for deciding this based on the player's moves.
Rock Beats Scissors
As a player, I want rock to beat scissors. So that I can play with rules
I'm familiar with.
• Given I have chosen rock
When the opponent chooses scissors
Then I should win.
• Given I have chosen scissors
When the opponent chooses rock
Then they should win
Scissors Beats Paper
As a player, I want scissors to beat paper. So that I can play with rules
I'm familiar with.
• Given I have chosen scissors
When the opponent chooses paper
Then I should win.
• Given I have chosen paper
When the opponent chooses scissors
Then they should win.
Paper Beats Rock
As a player, I want paper to beat rock. So that I can play with rules I'm
familiar with.
• Given I have chosen paper
When the opponent chooses rock
Then I should win.
• Given I have chosen rock
When the opponent chooses paper
Then they should win.

Same move results in Draw
As a player, I want the same moves to draw. So that I can play with
rules I'm familiar with.
• Given I have chosen rock
When the opponent chooses rock
Then it should be a draw.
• Given I have chosen paper
When the opponent chooses paper
Then it should be a draw.
• Given I have chosen scissors
When the opponent chooses scissors
Then it should be a draw.
Some rules to keep in mind
• In a Single file the developer needs to store the player’s name and the
highest score
• Developer need to display the highest score when any person starts a new
game
• If any player beats the highest score then his/her score should be updated
as the highest score for the game
• The score cannot be in negative value and the file in which developer is
storing user’s data should provide the information when it is required to be
fetched and if not able to find then proper handling of this scenario should
be there
• Until and unless user wants to quit the game the playing option should be available
