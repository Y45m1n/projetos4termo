<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\ProdutoController;

Route::get('/', function () {
    return view('home');
});
// Rota para listar todos os produtos
Route::get('/produtos', [ProdutoController::class, 'index']);

Route::get('/contatos', function () {
    return view('contatos');
});
