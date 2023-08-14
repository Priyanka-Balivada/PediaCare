const express = require("express");
const app = express();

app.set('view engine', 'ejs');
app.use(express.static("public"));

app.get("/", function(req, res) {
  res.render("login");
});

app.get("/login", function(req, res) {
  res.render("login");
});

app.get("/register", function(req, res) {
  res.render("register");
});

let port = process.env.PORT;
if (port == null || port == "") {
  port = 3000;
}

app.listen(port, function() {
  console.log("Server started on port 3000");
});
