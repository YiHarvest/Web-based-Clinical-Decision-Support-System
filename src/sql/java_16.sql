Image image = Toolkit.getDefaultToolkit().getImage(filename);
MediaTracker mediaTracker = new MediaTracker(new Container());
mediaTracker.addImage(image, 0);
mediaTracker.waitForID(0);
use this to test for errors at this point: System.out.println(mediaTracker.isErrorAny());
