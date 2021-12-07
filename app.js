const btnMenu = document.querySelector('.btn-rond-menu') /* Classe pour gérer le boutton */
const nav = document.querySelector('.nav-gauche');
const allItemNav = document.querySelectorAll('.nav-menu-item');  /* Classe pour gérer le menu */
const ligne = document.querySelector('.cont-ligne'); /* Classe pour gérer les lignes */

btnMenu.addEventListener('click', () => {  /* Dès qu'on clique sur le boutton, on va activer le toggle*/

    ligne.classList.toggle('active')  /*  */
})


