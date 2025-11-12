# BridgeLabz 3rd Year – HTML Iframe & Forms Practice Repository

This repository contains *HTML practice assignments* for the **BridgeLabz 3rd Year program**, guided by **Deepak Prasad** and **Sahil Kumar**.
Each assignment focuses on understanding the fundamentals of HTML structure, forms, metadata, and iframe embedding — without using CSS or JavaScript.

---

## 📋 General Instructions

* Each question must be completed in a **separate `.html` file**.
* Use **only HTML** — **no CSS or JavaScript** is allowed.
* Maintain **proper indentation**, include a clear **`<title>`**, and use **HTML comments** where explanations are needed.
* Always use a valid HTML document structure: `<!DOCTYPE html>`, `<html>`, `<head>`, and `<body>`.

---

## 📁 Exercises Overview

### 1️⃣ Embed a YouTube Video

Embed a YouTube video using an `<iframe>` with width and height in **percentages** for responsiveness.

### 2️⃣ Embed a Google Map

Add a Google Map showing your **school or city** with attributes `title`, `width`, `height`, and `loading="lazy"`.
Include a comment explaining that *the loading attribute improves performance by delaying iframe loading*.

### 3️⃣ Two Iframes (Introduction & Hobby)

Create two iframes, one below another:

* First: displays an *introduction page*
* Second: displays a *favorite hobby page*
  Adjust the height and width proportionally.

### 4️⃣ Frameset Layout

Use `<frameset>` and `<frame>` tags:

* **Top frame:** Navigation links (*Home, About, Contact*)
* **Bottom frame:** Message “Welcome to My Website”
  Add a comment explaining that `<frameset>` is deprecated in HTML5.

### 5️⃣ UTF-8 Encoding Page

Include a full `<head>` with meta tags for charset, author, and viewport.
Add a paragraph containing **English**, **Hindi**, and **Japanese** text to test UTF-8 encoding.

### 6️⃣ User Registration Form

Include fields for Full Name, Email, Password, and Confirm Password.
Make all fields **required**.

### 7️⃣ Login Form with CSRF Token

Add a **username** and **password** field along with a hidden CSRF token input.
Include an HTML comment explaining that CSRF tokens protect against unauthorized form submissions.

### 8️⃣ Feedback Form

Include a `<textarea>` for feedback, radio buttons for ratings (*Good, Average, Poor*), and a submit button.
Use `method="post"` and `action="#"`.

### 9️⃣ File Upload Form

Allow uploads of only `.jpg` or `.png` files using the `accept` attribute.
Add a note describing allowed file types.

### 🔟 Contact Form

Include Full Name, Email, Subject, and Message fields.
Use `placeholder` and `required` attributes properly.

### 11️⃣ Student Information Form

Create a form to collect Name, Roll Number, and Course.
Use a `<select>` dropdown with a default *“Select Course”* option (disabled and selected).

### 12️⃣ HTML Entities Demonstration

Display entities for `<`, `>`, `&`, `"`, `'` and include symbols ©, ™, and ®.

### 13️⃣ Multilingual Page

Write text in **English**, **Hindi**, and **French**.
Use `<meta charset="UTF-8">` for proper rendering.

### 14️⃣ External Website Embed

Embed `https://www.wikipedia.org` using an `<iframe>` and write:

> “Some websites may not allow embedding for security reasons.”

### 15️⃣ Payment Form

Add required fields for Cardholder Name, Card Number, Expiry Date, and CVV with a **Pay Now** button.

### 16️⃣ URI Encoding Example

Show an unencoded and encoded URL:

* Example: `https://example.com/search?query=HTML & CSS`
* Encoded: `https://example.com/search?query=HTML%20%26%20CSS`

### 17️⃣ Form Submission with Iframe

Create two files:

* `form.html`: Form with a text input and submit button, targeting an `<iframe>`
* `result.html`: Displays “Form successfully submitted.”

### 18️⃣ Quotations and Entities

Use `<blockquote>` for long quotes and `<q>` for short inline quotes.
Include one HTML entity (e.g., `&amp;`).

### 19️⃣ Form Security Attributes

Use `autocomplete="off"` and mark all fields as required.
Explain that disabling autocomplete enhances security on shared devices.

### 20️⃣ Complete `<head>` Example

Add `<title>`, `<meta>` (charset, author, description), `<base>`, `<link>`, `<style>`, and `<script>`.
Include comments describing each tag’s purpose.

---

## 🧾 File Naming Suggestion

| Question | File Name                                |
| -------- | ---------------------------------------- |
| 1        | `01-embed-youtube.html`                  |
| 2        | `02-embed-googlemap.html`                |
| 3        | `03-two-iframes.html`                    |
| 4        | `04-frameset-layout.html`                |
| 5        | `05-head-utf8.html`                      |
| 6        | `06-registration-form.html`              |
| 7        | `07-login-form.html`                     |
| 8        | `08-feedback-form.html`                  |
| 9        | `09-file-upload.html`                    |
| 10       | `10-contact-form.html`                   |
| 11       | `11-student-info.html`                   |
| 12       | `12-html-entities.html`                  |
| 13       | `13-multilingual.html`                   |
| 14       | `14-external-iframe.html`                |
| 15       | `15-payment-form.html`                   |
| 16       | `16-uri-encoding.html`                   |
| 17       | `17-form-iframe.html` & `17-result.html` |
| 18       | `18-quotes.html`                         |
| 19       | `19-form-security.html`                  |
| 20       | `20-head-elements.html`                  |

---

👨‍💻 **Author:** Gautam Singh Dhakrey
🧑‍🏫 **Guided by:** Deepak Prasad & Sahil Kumar
📅 **Course:** BridgeLabz – 3rd Year HTML Practice Assignments

