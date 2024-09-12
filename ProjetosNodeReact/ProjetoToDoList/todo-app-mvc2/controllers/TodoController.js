import Todo from "@/models/Todo";
import dbConnect from "@/utils/dbConnect";
//import closeConnectionMongo from "@/utils/dbCloseConnection";

// CRUD

const getTodos = async()=> {
    await dbConnect();
    return await Todo.find({}) 
    //&& await closeConnectionMongo();
}

export const createTodo = async(data)=> {
 await dbConnect();
 return await Todo.create(data) 
 //&& await closeConnectionMongo();
};

export const updateTodo = async (id, data) => {
    await dbConnect();
    return await Todo.findByIdAndUpdate(id, data, {
      new: true,
      runValidators: true,
    });
  };
  
  
  export const deleteTodo = async (id) => {
    await dbConnect();
    return await Todo.deleteOne({ _id: id });
  };