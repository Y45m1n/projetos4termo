
const mongoose = require('mongoose'); //importando modulo mongoose
require('dotenv').config(); //modulo dotenv


mongoose.connect(process.env.DATABASE_URL) //criando conexao
.then(() => console.log('Conectado ao MongoDB'))
.catch(err => console.error('Erro ao conectar ao MongoDB', err));


module.exports = mongoose;
