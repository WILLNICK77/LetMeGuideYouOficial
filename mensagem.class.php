<?php

Class Mensagem{

private $mensagem;
private $nome;
private $email;

public function __construct($mensagem,$nome,$email){
	$this->mensagem = $mensagem;
	$this->nome = $nome;
	$this->email = $email;

}

public function inserirMensagem(){
	$servidor = "localhost";
	$usuario = "root";
	$senha = "";
	$banco = "locatenow";

		$conexao = mysqli_connect($servidor,$usuario,$senha,$banco);

		mysqli_set_charset($conexao, "utf8");

		if(!$conexao){
			die("Falha na conexão:" .mysqli_connect_error());
		}
		$query = " INSERT INTO Mensagem VALUES ('". $this->mensagem."','". $this->nome."','". $this->email."')";

		$resultado = mysqli_query($conexao, $query);

		if($resultado){
				return "Usuario inserido com sucesso ";
		}else{
				return " Erro ";
		}
		echo "Conectado";


}

}

?>