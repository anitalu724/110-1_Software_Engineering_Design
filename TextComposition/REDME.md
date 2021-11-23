# Text Composition (Strategy Pattern)
## Class Diagram
### Requirements Statements
1. The **Composition** class maintains a collection of **Component** instances, which represent **text** and **graphical** elements in a document. 
![](https://i.imgur.com/u7Tj8X5.png)

2. A composition *arranges* component objects into lines using a **linebreaking** strategy.
![](https://i.imgur.com/muzyKQT.png)

3. Each component has an associated **natural size**, **stretchability**, and **shrinkability**. The stretchability defines how much the component can grow beyond its natural size; shrinkability is how much it can shrink.
![](https://i.imgur.com/rcJxr88.png)

4. When a new layout is required, the composition calls its compose method to determine where to place linebreaks.
![](https://i.imgur.com/X8zI5Kb.png)

### Encapsulation
![](https://i.imgur.com/WAKY52q.png)

### Abstraction
![](https://i.imgur.com/5ItKgoG.png)

### Composition
![](https://i.imgur.com/qaeOJK9.png)

### Refactoring
![](https://i.imgur.com/CX9jhwh.png)

### Our final design
![](https://i.imgur.com/3VIdllt.png)

## Implementation
* An example
    ```
    javac Main.js
    java Main SPEC/sampleInput
    ```
* Output
    ```
    component 0 size changed to 10
    [10]Hi
    [1]<ParagraphEnd>
    [12]nice
    [12]to
    [12]meet
    [12]you
    [20]scared.jpg
    [1]<ParagraphEnd>
    [10]Hi [1]<ParagraphEnd>
    [12]nice [12]to [12]meet [12]you [20] scared.jpg [1]<ParagraphEnd>
    [10]Hi [1]<ParagraphEnd> [12]nice
    [12]to [12]meet [12]you
    [20]scared.jpg [1]<ParagraphEnd>

    ```



