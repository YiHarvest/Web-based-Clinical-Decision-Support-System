new BufferedOutputStream(new FileOutputStream(outFilename));
JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
JPEGEncodeParam param = encoder.getDefaultJPEGEncodeParam(thumbImage);
quality = Math.max(0, Math.min(quality, 100));
param.setQuality((float)quality / 100.0f, false);
encoder.setJPEGEncodeParam(param);
encoder.encode(thumbImage);
out.close();
}
JAR   json-rpc-1.0.jar (75 kb)
