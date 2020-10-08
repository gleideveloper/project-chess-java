# Project: Chess Game System
## Creating project and git repository
<b>Checklist</b>
1. Github: create a new project
    * <font color=red>NOTE:</font> choose .gitignore type as Java
2. Open terminal in project folder, and perform the following commands:
    <br>git init
    <br>git remote add origin https://github.com/gleideveloper/JavaCourse.git
    <br>git pull origin master
    <br>git add .
    <br>git commit -m "Project created"
    <br>git push -u origin master

## First class: Position
<b>Checklist:</b>
1. Class Position [public]
2. <b>OOP Topics:</b>
    * Encapsulation
    * Constructors
    * ToString (Object / overriding)
    
## Starting to implement Board and Piece
<b>Checklist:</b>
1. Classes Piece, Board [public]
2. <b>OOP Topics:</b>
    * Associations
    * Encapsulation / Access Modifiers
3. <b>Data Structures Topics:</b>
    * Matrix
    
## Chess layer and printing the board
<img src="/project-chess-game/resources/boardChess.png" alt="Board"/>

<b>Checklist:</b>
Methods: Board.Piece(row, column) and Board.Piece(position)
1. Enum Chess.Color
2. Class Chess.ChessPiece [public]
3. Class Chess.ChessMatch [public]
4. Class ChessConsole.UI
5. <b>OOP Topics:</b>
    * Enumerations
    * Encapsulation / Access Modifiers
    * Inheritance
    * Downcasting
    * Static members
    * Layers pattern
6. <b>Data Structures Topics:</b>
    * Matrix
    
## Placing pieces on the board
<b>Checklist:</b>
Methods: Board.PlacePiece(piece, position)
1. Classes: Rook, King [public]
2. Method: ChessMatch.InitialSetup
3. <b>OOP Topics:</b>
    * Inheritance
    * Overriding
    * Polymorphism (ToString)