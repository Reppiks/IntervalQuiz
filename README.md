# IntervalQuiz
Music Theory Interval Quiz:

Given root note and interval - must name resultant note

Some notes in the musical alphabet have more than one name (i.e. are enharmonically equivalent). 

To follow the conventions of modern music theory, Major (Ionian) and minor (Aeolian) scales contain 7 notes. 
Each letter name should be accounted for and to mixing of sharps and flats in the same scale deviates from convention.
Example:
A Major -> A, B, C#, D, E, F#, G# (Correct)
A Major -> A, B, Db, D, E, F#, Ab (Incorrect) there is a mixture of sharps and flats and C and G notes are unaccounted for.

As there are some irregularities in the way that certian keys and intervals behave regarding note names, the choice was made to declare and populate a 2-dimensional array in the QuizBuilder. Other ways of handling these irregularities and special occurences resulted in complicated logic (many if/else statements) that affected the readability and tidiness of the code.

The player is assigned a starting root note and an ascending interval for said root. 
The object of the quiz is to name the note that is n steps away from the given root.
There are 5 total questions per program execution.
The player has 3 chances to correctly answer each question. If the player fails to correctly answer the question after 3 attempts, the answer is displayed and the player does not recieve a point for that question.
At the end of 5 questions, a score is given (x out of 5) and the program terminates.
