{
if ( inChannel != null )
{
inChannel.close();
}
if ( outChannel != null )
{
outChannel.close();
}
}
}
private void createThumbnail(String filename, int thumbWidth, int thumbHeight, int quality, String outFilename)
