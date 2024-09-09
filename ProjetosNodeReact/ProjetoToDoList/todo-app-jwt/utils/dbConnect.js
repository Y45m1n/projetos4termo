import mongoose from "mongoose";

const databaseUrl = process.env.DATABASE_URL;

if (!databaseUrl) {
    throw new Error("No MongoDB connection string provided.");
}

const connectMongo = async()=> {
    if (mongoose.connection.readyState>0){
return;
    } else{
return await mongoose.connect(databaseUrl)
.then("Mongo conectado")
.catch((err)=>console.error(err));
    }
}

export default connectMongo;
