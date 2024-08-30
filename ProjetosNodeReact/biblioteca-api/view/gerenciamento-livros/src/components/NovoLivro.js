import React, { useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';
import './novoLivro.css'; // Importe o CSS atualizado aqui

function NovoLivro() {
    const [titulo, setTitulo] = useState('');
    const [autor, setAutor] = useState('');
    const [ano, setAno] = useState('');
    const [genero, setGenero] = useState('');

    const navigate = useNavigate();

    const adicionarLivro = (e) => {
        e.preventDefault();

        axios.post('http://localhost:5000/livros', { titulo, autor, ano, genero })
            .then(() => navigate('/'))
            .catch(error => console.error('Erro ao adicionar livro:', error));
    };

    return (
        <div className="form-container">
            <h1>Novo Livro</h1>
            <form onSubmit={adicionarLivro}>
                <input
                    type="text"
                    value={titulo}
                    onChange={e => setTitulo(e.target.value)}
                    placeholder="Título"
                    required
                />
                <input
                    type="text"
                    value={autor}
                    onChange={e => setAutor(e.target.value)}
                    placeholder="Autor"
                    required
                />
                <input
                    type="number"
                    value={ano}
                    onChange={e => setAno(e.target.value)}
                    placeholder="Ano de Publicação"
                    required
                />
                <input
                    type="text"
                    value={genero}
                    onChange={e => setGenero(e.target.value)}
                    placeholder="Gênero"
                    required
                />
                <button type="submit">Adicionar</button>
            </form>
        </div>
    );
}

export default NovoLivro;
