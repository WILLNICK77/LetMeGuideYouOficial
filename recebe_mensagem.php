<?php

require_once "mensagem.class.php";

$mensagem = $_POST["mensagem"];
$nome = $_POST["nome"];
$email = $_POST["email"];

$mensagem = new Mensagem($mensagem,$nome,$email);
echo $mensagem -> inserirMensagem();

?>