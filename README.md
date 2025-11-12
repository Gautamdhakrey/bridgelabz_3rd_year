BridgeLabz 3rd Year – Flexbox CSS Practice Repository

This branch contains CSS Flexbox practice assignments and examples for the BridgeLabz 3rd Year program,
created under the guidance of Sahil Kumar and Deepak Prasad.

It focuses on mastering the Flexbox Layout Module — a modern CSS feature for building responsive and flexible web layouts efficiently.

🎯 Objective

The goal of this branch is to help students:

Understand the core concepts of Flexbox

Learn how to align, center, and distribute elements

Create responsive layouts that adapt to all screen sizes

Use Flexbox properties effectively in real-world web projects

📘 Based On

The exercises are inspired by
📄 A Complete Guide to Flexbox – CSS-Tricks

and the official W3C Flexbox Specification
.

🧩 Topics Covered
Category	Key Properties
Flex Container	display, flex-direction, flex-wrap, flex-flow, justify-content, align-items, align-content
Flex Items	order, flex-grow, flex-shrink, flex-basis, flex, align-self
🧠 Core Concepts
Concept	Description
Main Axis	The primary direction of flex items (defined by flex-direction).
Cross Axis	The perpendicular axis to the main axis.
Main Start / End	Points where items begin and end on the main axis.
Cross Start / End	Points where items begin and end on the cross axis.
Responsive Alignment	Flexbox automatically adjusts items to available space.
💻 Example Snippets
✅ Basic Flexbox Setup
.container {
  display: flex;
}

✅ Centering Elements
.parent {
  display: flex;
  height: 300px;
}
.child {
  width: 100px;
  height: 100px;
  margin: auto;
}

✅ Responsive Navigation Bar
.navigation {
  display: flex;
  flex-flow: row wrap;
  justify-content: flex-end;
}

@media all and (max-width: 800px) {
  .navigation {
    justify-content: space-around;
  }
}

@media all and (max-width: 500px) {
  .navigation {
    flex-direction: column;
  }
}

🧾 Assignment Structure
Topic	File Name
Flexbox Basics	01-flexbox-basics.html
Flex Direction	02-flex-direction.html
Flex Wrap	03-flex-wrap.html
Justify Content	04-justify-content.html
Align Items	05-align-items.html
Align Content	06-align-content.html
Flex Grow & Shrink	07-flex-grow-shrink.html
Order Property	08-order.html
Centering Example	09-centering.html
Responsive Layout	10-responsive-layout.html
🌐 Browser Support
Browser	Version	Support
Chrome	21+	✅
Firefox	22+	✅
Safari	6.1+	✅
Edge	17+	✅
IE	10–11	⚠️ Partial
Android	4.4+	✅
iOS	7.1+	✅

💡 Use Autoprefixer
 to ensure better browser compatibility.

📚 Resources

A Complete Guide to Flexbox – CSS-Tricks

MDN Web Docs: Flexbox

Flexbugs (GitHub)
 – Known Flexbox issues

Flexplorer
 – Visualize Flexbox layouts

👨‍💻 Author & Mentors

👨‍💻 Author: Gautam Singh Dhakrey
🧑‍🏫 Guided by: Sahil Kumar & Deepak Prasad
📅 Course: BridgeLabz – 3rd Year CSS Flexbox Practice Repository
