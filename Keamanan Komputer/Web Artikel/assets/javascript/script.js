const body = document.querySelector('body'),
  nav = document.querySelector('nav'),
  main = document.querySelector('main'),
  modeToggle = document.querySelector('.dark-light'),
  sidebarOpen = document.querySelector('.sidebarOpen'),
  sidebarClose = document.querySelector('.sidebarClose'),
  btnToTop = document.querySelector('.btnToTop');

let getMode = localStorage.getItem('mode');
if (getMode && getMode === 'dark-mode') {
  body.classList.add('dark');
}

//   js code to toggle dark and light mode
modeToggle.addEventListener('click', () => {
  modeToggle.classList.toggle('active');
  body.classList.toggle('dark');

  // js code to keep user selected mode even page refresh or file reopen
  if (!body.classList.contains('dark')) {
    localStorage.setItem('mode', 'light-mode');
  } else {
    localStorage.setItem('mode', 'dark-mode');
  }
});

// js code to open sidebar
sidebarOpen.addEventListener('click', () => {
  nav.classList.add('active');
});

// Close sidebar
main.addEventListener('click', (e) => {
  let clickedElm = e.target;

  if (
    !clickedElm.classList.contains('sidebarOpen') &&
    !clickedElm.classList.contains('menu')
  ) {
    nav.classList.remove('active');
  }
});

sidebarClose.addEventListener('click', (e) => {
  let clickedElm = e.target;

  if (
    !clickedElm.classList.contains('sidebarOpen') &&
    !clickedElm.classList.contains('menu')
  ) {
    nav.classList.remove('active');
  }
});

// Button scroll to top
btnToTop.addEventListener('click', () => {
  document.body.scrollTop = 0;
  document.documentElement.scrollTop = 0;
});

window.onscroll = function () {
  scrollFunction();
};

function scrollFunction() {
  if (document.body.scrollTop > 50 || document.documentElement.scrollTop > 50) {
    nav.style.display = 'none';
    btnToTop.style.display = 'flex';
  } else {
    nav.style.display = 'block';
    btnToTop.style.display = 'none';
  }
}
