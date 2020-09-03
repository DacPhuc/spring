db.createUser(
    {
        user: "dapu",
        pwd: "dapu",
        roles: [
            {
                role: "readWrite",
                db: "dapu_nosql"
            }
        ]
    }
);
