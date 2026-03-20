BufferedImage thumbImage = new BufferedImage(thumbWidth, thumbHeight, BufferedImage.TYPE_INT_RGB);
Graphics2D graphics2D = thumbImage.createGraphics();
graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
graphics2D.drawImage(image, 0, 0, thumbWidth, thumbHeight, null);
