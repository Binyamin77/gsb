const btnMenu = document.querySelector('.btn-rond-menu') /* Classe pour gérer le boutton */
const nav = document.querySelector('.nav-gauche');
const allItemNav = document.querySelectorAll('.nav-menu-item');  /* Classe pour gérer le menu */
const ligne = document.querySelector('.cont-ligne'); /* Classe pour gérer les lignes */

btnMenu.addEventListener('click', () => {  /* Dès qu'on clique sur le boutton, on va activer le toggle*/

    ligne.classList.toggle('active')  /*  */
    nav.classList.toggle('menu-visible')
})


if(window.matchMedia('(max-widith: 1300px)')) {  /*Si on est en dessous de 1300px */

    allItemNav.forEach(item => {     /*Pour chaque élément */
        item.addEventListener('click', () => {  /* Si on clique */
            nav.classList.toggle('menu-visible')  /*Ca ferme le menu */
            ligne.classList.toggle('active')  /* Ca remet l'icone comme elle était */
        })
    })

}

//Animation écriture

const txtAnim= document.querySelector('.txt-animation');

let typewriter = new Typewriter(txtAnim, {
    loop: true,
    deleteSpeed: 20
})


typewriter
    .pauseFor(1800)
    .changeDelay(20)
    .typeString('Moi c\'est Benjamin Hayat')
    .pauseFor(300)
    .typeString('<strong>, Développeur Web </strong> !')
    .pauseFor(1000)
    .deleteChars(19)
    .typeString('<span style="color: #27ae60;"> HTML</span> !')
    .pauseFor(1000)
    .deleteChars(6)
    .typeString('<span style="color: #EA39ff;"> Symfony </span> !')
    .pauseFor(1000)
    .deleteChars(10)
    .typeString('<span style="color: midnightblue;">A completer </span> !')
    .pauseFor(1000)
    .deleteChars(15)
    .typeString('<span style="color: #ff6910;"> A completer </span> !')
    .start()



