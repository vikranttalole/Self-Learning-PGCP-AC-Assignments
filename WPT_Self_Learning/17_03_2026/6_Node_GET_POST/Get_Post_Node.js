const http = require("http");
const querystring = require("querystring");

const server = http.createServer((req, res) => {

    
    if (req.method === "GET") {
        res.writeHead(200, { "Content-Type": "text/html" });
        res.write(`
            <form method="POST">
                Name: <input type="text" name="name"/>
                <input type="submit" value="Submit"/>
            </form>
        `);
        res.end();
    }

    else if (req.method === "POST") {
        let body = "";

        req.on("data", chunk => {
            body += chunk.toString();
        });

        req.on("end", () => {
            const parsedData = querystring.parse(body);
            res.writeHead(200, { "Content-Type": "text/html" });
            res.write(`<h1>Hello ${parsedData.name}</h1>`);
            res.end();
        });
    }
});

server.listen(3000, () => {
    console.log("Server running at http://localhost:3000");
});