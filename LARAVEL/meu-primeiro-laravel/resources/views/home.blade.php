@extends('layouts.master')
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link rel="stylesheet" href="{{asset('css/app.css')}}">
</head>
<body>
    @include('components.header')
    Home
    @include('components.footer')
</body>
</html>