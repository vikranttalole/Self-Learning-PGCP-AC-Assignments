const express = require("express");
const app = express();

// Route 1
app.get("/", (req, res) => {
    res.send("Home Page");
});

// Route 2
app.get("/about", (req, res) => {
    res.send("About Page");
});

// Route 3
app.get("/contact", (req, res) => {
    res.send("Contact Page");
});

// Route 4
app.get("/services", (req, res) => {
    res.send("Services Page");
});

// Route 5
app.get("/profile", (req, res) => {
    res.send("Profile Page");
});

app.listen(3000, () => {
    console.log("Express server running on http://localhost:3000");
});