<?php


	require_once 'usuario.class.php';
	$codigo = $_GET['codigo'];

	$objUsuario = new Usuario();
	$objUsuario->excluirPorCodigo($codigo);





?>