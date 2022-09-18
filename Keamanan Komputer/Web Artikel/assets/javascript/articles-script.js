const daftarIsiOnClick = document.querySelector('.daftarIsiOnClick'),
  daftarIsi = document.querySelector('.daftar-isi');

// js code to toggle Daftar isi
daftarIsiOnClick.addEventListener('click', () => {
  daftarIsi.classList.toggle('active');
});
