<?php

	require_once 'usuario.class.php';

	$codigo = $_POST["codigo"];
	$nome = $_POST["nome"];
	$email = $_POST["email"];
	$senha = $_POST["senha"];

	$objUsuario = new Usuario();
	$objUsuario-> editarUsuario($codigo,$nome,$email,$senha);



?>