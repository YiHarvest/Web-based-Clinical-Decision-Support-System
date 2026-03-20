magic number for Windows, 64Mb - 32Kb)
int maxCount = (64 * 1024 * 1024) - (32 * 1024);
long size = inChannel.size();
long position = 0;
while ( position < size )
{
position += inChannel.transferTo( position, maxCount, outChannel );
}
}
