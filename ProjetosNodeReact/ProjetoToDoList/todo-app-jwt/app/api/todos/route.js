import {jwtMiddleware} from "@/utils/middleware"
import { getTodos, addTodo, updateTodo, deleteTodo } from "@/controllers/TodoController"

//metodo get para listar as tarefas do usurio

export async function GET(req,res) {
    return jwtMiddleware(async(req,res) =>{
        await getTodos(req,res);
    })(req, res);
}

//metodo POST - nova tarefa

export async function POST(req,res) {
    return jwtMiddleware(async(req,res) =>{
        await addTodo(req,res);
    })(req, res);
}

//metodo PUT - atualizar tarefa

export async function PUT(req,res) {
    return jwtMiddleware(async(req,res) =>{
        await updateTodo(req,res);
    })(req, res);
}

//metodo DELETE - remover tarefa

export async function DELETE(req,res) {
    return jwtMiddleware(async(req,res) =>{
        await deleteTodo(req,res);
    })(req, res);
}