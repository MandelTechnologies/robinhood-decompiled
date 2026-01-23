package com.getkeepsafe.relinker;

import android.annotation.SuppressLint;
import android.os.Build;
import com.getkeepsafe.relinker.ReLinker;

/* loaded from: classes16.dex */
final class SystemLibraryLoader implements ReLinker.LibraryLoader {
    SystemLibraryLoader() {
    }

    @Override // com.getkeepsafe.relinker.ReLinker.LibraryLoader
    public void loadLibrary(final String libraryName) {
        System.loadLibrary(libraryName);
    }

    @Override // com.getkeepsafe.relinker.ReLinker.LibraryLoader
    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public void loadPath(final String libraryPath) {
        System.load(libraryPath);
    }

    @Override // com.getkeepsafe.relinker.ReLinker.LibraryLoader
    public String mapLibraryName(final String libraryName) {
        return (libraryName.startsWith("lib") && libraryName.endsWith(".so")) ? libraryName : System.mapLibraryName(libraryName);
    }

    @Override // com.getkeepsafe.relinker.ReLinker.LibraryLoader
    public String unmapLibraryName(String mappedLibraryName) {
        return mappedLibraryName.substring(3, mappedLibraryName.length() - 3);
    }

    @Override // com.getkeepsafe.relinker.ReLinker.LibraryLoader
    public String[] supportedAbis() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        if (!TextUtils.isEmpty(str)) {
            return new String[]{Build.CPU_ABI, str};
        }
        return new String[]{Build.CPU_ABI};
    }
}
