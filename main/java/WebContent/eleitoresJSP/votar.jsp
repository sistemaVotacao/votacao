<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/comum.css">
<link rel="stylesheet" type="text/css" href="../css/cssEleitores/votar.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="containerVotar" class="container containerVotar">
		<div class="centralizarItens">
			<label for="imgCandidato"><b>Deputado Estadual</b></label> <img
				alt="Candidato" src="../img/imgCandidatos/candidatoX.png"
				id="imgem" name="imgCandidato">
			<form  class="formCenter formCenterVotar">
				<label for="fVotar"><b>Nº Candidato:</b></label> 
				<input type="text" id="entrada" name="fVotar">
				<div id="conteinerBtnBrancoCorrigeConf"
					class="containerBotoesVotacao">
					<button id="btnBranco">
						<b>BRANCO</b>
					</button>
					<button id="btnCorrige">
						<b>CORRIGE</b>
					</button>
					<button id="btnConfirmar">
						<b>CONFIRMA</b>
					</button>
				</div>
				<button id="btnTecladoVirtual" onclick="criar10btn()">
					<b>TECLADO VIRTUAL</b>
				</button>
			</form>
		</div>
	</div>
	<script type="text/javascript" src="../js/votar.js"></script>
</body>
</html>