<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Produto extends Model
{
    use HasFactory;
    //inserir atributos
    protected $fillable = [
        'nome',
        'descricao',
        'preco',
        'quantidade',
    ];
}
