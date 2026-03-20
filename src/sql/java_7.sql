double thumbRatio = (double)thumbWidth / (double)thumbHeight;
int imageWidth = image.getWidth(null);
int imageHeight = image.getHeight(null);
double imageRatio = (double)imageWidth / (double)imageHeight;
if (thumbRatio < imageRatio) {
thumbHeight = (int)(thumbWidth / imageRatio);
} else {
thumbWidth = (int)(thumbHeight * imageRatio);
}
