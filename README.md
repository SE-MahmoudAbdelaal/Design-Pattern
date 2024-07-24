<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>Design Patterns</h1>
    <p>Design patterns are established solutions to common problems encountered in software design. They provide general, reusable solutions to typical issues that software developers face. By applying these patterns, developers can create more flexible, reusable, and maintainable code.</p>
    <h2>Categories:</h2>
    <ul>
        <li><strong>Creational Patterns:</strong> These patterns deal with object creation mechanisms. They simplify the process of creating objects while hiding the complexities of instantiation. Examples include:
            <ul>
                <li><strong>Singleton:</strong> Ensures a class has only one instance and provides a global point of access to it.</li>
                <li><strong>Factory Method:</strong> Defines an interface for creating an object but lets subclasses alter the type of objects that will be created.</li>
                <li><strong>Builder:</strong> Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.</li>
            </ul>
        </li>
        <li><strong>Structural Patterns:</strong> These patterns focus on how objects are composed to form larger structures. They help in organizing code to ensure that components are easy to understand and reuse. Examples include:
            <ul>
                <li><strong>Adapter:</strong> Allows objects with incompatible interfaces to work together by providing a wrapper that translates the interface of one class into another interface expected by the client.</li>
                <li><strong>Decorator:</strong> Adds new functionalities to an object dynamically without altering its structure. It provides a flexible alternative to subclassing for extending functionality.</li>
                <li><strong>Composite:</strong> Composes objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions of objects uniformly.</li>
            </ul>
        </li>
        <li><strong>Behavioral Patterns:</strong> These patterns focus on how objects interact and collaborate to perform tasks. They help in managing algorithms, relationships, and responsibilities between objects. Examples include:
            <ul>
                <li><strong>Observer:</strong> Defines a dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.</li>
                <li><strong>Strategy:</strong> Defines a family of algorithms, encapsulates each algorithm, and makes them interchangeable. The strategy pattern allows the algorithm to vary independently from clients that use it.</li>
                <li><strong>Command:</strong> Encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations. It also provides support for undoable operations.</li>
            </ul>
        </li>
    </ul>
</body>
</html>
