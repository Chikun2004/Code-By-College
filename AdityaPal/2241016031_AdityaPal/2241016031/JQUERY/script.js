$(document).ready(function () {
    let animationInterval;
    let isAnimating = false;

    function startAnimation() {
        if (!isAnimating) {
            isAnimating = true;
            $('#startButton').prop('disabled', true);
            $('#stopButton').prop('disabled', false);

            const $box = $('.box');
            const containerWidth = $('.animation-container').width() - $box.width();

            animationInterval = setInterval(function () {
                const currentLeft = $box.position().left;
                if (currentLeft >= containerWidth) {
                    stopAnimation();
                    alert('Animation completed!');
                    if (typeof animationCallback === 'function') {
                        animationCallback();
                    }
                } else {
                    $box.css('left', currentLeft + 5);
                }
            }, 50);
        }
    }

    function stopAnimation() {
        if (isAnimating) {
            clearInterval(animationInterval);
            isAnimating = false;
            $('#startButton').prop('disabled', false);
            $('#stopButton').prop('disabled', true);
        }
    }

    $('#startButton').on('click', startAnimation);
    $('#stopButton').on('click', stopAnimation);

    function animationCallback() {
        console.log('Animation has finished!');
    }

    // Initial state
    $('#startButton').prop('disabled', false);
    $('#stopButton').prop('disabled', true);
});
