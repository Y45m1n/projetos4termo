import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';
import './listaLivro.css'; // Importe o CSS atualizado aqui

function ListaLivros() {
    const [livros, setLivros] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:5000/livros')
            .then(response => setLivros(response.data))
            .catch(error => console.error('Erro ao buscar os livros:', error));
    }, []);

    const deletarLivro = (id) => {
        axios.delete(`http://localhost:5000/livros/${id}`)
            .then(() => setLivros(livros.filter(livro => livro._id !== id)))
            .catch(error => console.error('Erro ao deletar o livro:', error));
    };

    return (
        <div className="container">
            <h1>Lista de Livros</h1>
            <Link to="/novo" className="add-book">Adicionar Novo Livro</Link>
            <ul>
                {livros.map(livro => (
                    <li key={livro._id}>
                        <span>{livro.titulo} - {livro.autor}</span>
                        <div>
                            <Link to={`/editar/${livro._id}`} className="edit-link">Editar</Link>
                            <button onClick={() => deletarLivro(livro._id)}>Deletar</button>
                        </div>
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default ListaLivros;