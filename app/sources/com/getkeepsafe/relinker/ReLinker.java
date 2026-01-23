package com.getkeepsafe.relinker;

import android.content.Context;
import java.io.File;

/* loaded from: classes16.dex */
public class ReLinker {

    public interface LibraryInstaller {
        void installLibrary(Context context, String[] abis, String mappedLibraryName, File destination, ReLinkerInstance logger);
    }

    public interface LibraryLoader {
        void loadLibrary(String libraryName);

        void loadPath(String libraryPath);

        String mapLibraryName(String libraryName);

        String[] supportedAbis();

        String unmapLibraryName(String mappedLibraryName);
    }

    public interface LoadListener {
    }

    public static void loadLibrary(final Context context, final String library) {
        loadLibrary(context, library, null, null);
    }

    public static void loadLibrary(final Context context, final String library, final String version, final LoadListener listener) {
        new ReLinkerInstance().loadLibrary(context, library, version, listener);
    }
}
