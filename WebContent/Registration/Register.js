const registerButton = document.querySelector('.btn');
const wrapper = document.querySelector('.wrapper');

registerButton.addEventListener('click', function() {
    wrapper.classList.add('animate');
});