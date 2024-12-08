/**
 * Validação de formulario
 */

function validar() {
	const nome = document.querySelector('input[name="nome"]');
    const email = document.querySelector('input[name="email"]');
    
    const NOME_VALIDO = nome.value.trim().length  > 0;
    const EMAIL_VALIDO = email.value.trim().length > 0 && email.value.includes('@'); // Exemplo de validação básica para email

    
    if (!NOME_VALIDO){
		alert("Nome inválido");
		nome.focus();
		return
	}
	
	if (!EMAIL_VALIDO){
		alert("Email inválido");
		email.focus();
		return
	}    

}

 