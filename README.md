# Bucket List App

The **Bucket List** application is a refined Java console program designed to generate personalized bucket lists based on user input. It leverages core object-oriented programming principles such as **abstraction**, **inheritance**, and **encapsulation** to deliver an interactive and motivational experience.

---

## Features

- **Personalized Input**: Captures your name and age to tailor the bucket list to your life stage.
- **Dynamic Goals**: Suggests travel plans, life experiences, and aspirations based on your age group.
- **Motivational Messages**: Includes inspirational goals for personal growth, family, and career development.
- **Clean Code**: Modular design using constants, abstract classes, and structured logic for readability and maintainability.

---

## How to Run

### Prerequisites
Ensure you have the **Java Development Kit (JDK)** installed on your system.

### Steps

1. Save the source code in a file named `BucketList.java`.
2. Open a terminal or command prompt.
3. Compile the program:
   ```bash
   javac BucketList.java
   ```
4. Run the application:
   ```bash
   java bucketlist.BucketList
   ```
5. Follow the on-screen prompts to interact with the application and build your personalized bucket list.

---

## Project Structure

| Class    | Description                                                                 |
|----------|-----------------------------------------------------------------------------|
| **Travel** | Handles user input (name and age) and generates travel-related goals.       |
| **Become**  | Abstract base class defining fundamental life goals.                       |
| **Display** | Extends `Become` to implement personal and generational aspirations.        |
| **Hunt**    | Extends `Display` to include professional and career-specific objectives.   |

---

## Future Enhancements

- Add persistent storage to save and reload user data.
- Introduce a graphical user interface (GUI) for a more engaging experience.
- Expand goal categories (e.g., fitness, hobbies, relationships).
- Support for multiple users and session management.

---

## License

This project is open-source and free to use or modify for educational purposes. Attribution is appreciated but not required.

---

## Author

**Samuel Aemro Melese**  
Email: [samuelaemrowork12@gmail.com](mailto:samuelaemrowork12@gmail.com)

---

> "Your bucket list is not just a list — it's a map to the life you want to live."
```
