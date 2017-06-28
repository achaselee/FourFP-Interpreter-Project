# FourFP-Interpreter-Project

CSC413 final project developed using Android Studio by Adison Lee and Leopoldo Rodriguez.

FourFP Language Specifications:

1.  - Each line shall contain a statement. 
    - Each statement shall end with a semicolon.
    - A single statement shall not exceed one line.

2. - A minimum of one whitespace shall separate each lexeme (word)
   - Whitespace consists of either the space character or \t
   - Whitespace at the beginning of a line is ignored
   - Whitespace after a statement is ignored until the next statement begins

3. - Comments are denoted with a # sign
   - Starting at the # sign, everything is ignored until a \n is encountered

4. Variable names shall consist of all lowercase letters.

5. Variables shall be of only the integer type (for now).

6. - Variables shall be declared and initialized in one line;
   - Variables shall be initialized with a literal integer.
   - The int keyword shall be used to declare the variable. So, to declare variable a, we
     would say:
                         int a = 0;
                                 
7. - There shall be a predetermined number of styles
   - Styles shall be a combination of stroke color, stroke thickness, and fill color.
   - Styles shall be numbered, starting at 1
