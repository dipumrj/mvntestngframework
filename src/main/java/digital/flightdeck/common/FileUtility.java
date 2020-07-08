package digital.flightdeck.common;

import java.io.File;

public class FileUtility {
	
	private static File getLatestFilefromDir(String dirPath) {
		File dir = new File(dirPath);
		File[] files = dir.listFiles();
		if (files == null || files.length == 0) {
			return null;
		}

		File lastModifiedFile = files[0];
		for (int i = 1; i < files.length; i++) {
			if (lastModifiedFile.lastModified() < files[i].lastModified()) {
				lastModifiedFile = files[i];
			}
		}
		return lastModifiedFile;
	}

	public static String getLatestFileName() {
		File f = getLatestFilefromDir("C:\\Users\\dipesh.maharjan\\Downloads");
		return f.getName();

	}

}
