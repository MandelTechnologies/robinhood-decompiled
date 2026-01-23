package com.getkeepsafe.relinker;

import android.content.Context;
import android.util.Log;
import com.getkeepsafe.relinker.ReLinker;
import com.getkeepsafe.relinker.elf.ElfParser;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes16.dex */
public class ReLinkerInstance {
    protected boolean force;
    protected final ReLinker.LibraryInstaller libraryInstaller;
    protected final ReLinker.LibraryLoader libraryLoader;
    protected final Set<String> loadedLibraries;
    protected boolean recursive;

    public void log(final String message) {
    }

    protected ReLinkerInstance() {
        this(new SystemLibraryLoader(), new ApkLibraryInstaller());
    }

    protected ReLinkerInstance(final ReLinker.LibraryLoader libraryLoader, final ReLinker.LibraryInstaller libraryInstaller) {
        this.loadedLibraries = new HashSet();
        if (libraryLoader == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (libraryInstaller == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.libraryLoader = libraryLoader;
        this.libraryInstaller = libraryInstaller;
    }

    public void loadLibrary(final Context context, final String library) {
        loadLibrary(context, library, null, null);
    }

    public void loadLibrary(final Context context, final String library, final String version, final ReLinker.LoadListener listener) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (TextUtils.isEmpty(library)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        log("Beginning load of %s...", library);
        if (listener == null) {
            loadLibraryInternal(context, library, version);
        } else {
            new Thread(new Runnable(context, library, version, listener) { // from class: com.getkeepsafe.relinker.ReLinkerInstance.1
                final /* synthetic */ Context val$context;
                final /* synthetic */ String val$library;
                final /* synthetic */ String val$version;

                /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
                
                    throw null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
                
                    throw null;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void run() throws Throwable {
                    try {
                        ReLinkerInstance.this.loadLibraryInternal(this.val$context, this.val$library, this.val$version);
                        throw null;
                    } catch (MissingLibraryException unused) {
                        throw null;
                    } catch (UnsatisfiedLinkError unused2) {
                        throw null;
                    }
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadLibraryInternal(final Context context, final String library, final String version) throws Throwable {
        ReLinkerInstance reLinkerInstance;
        Context context2;
        ElfParser elfParser;
        if (this.loadedLibraries.contains(library) && !this.force) {
            log("%s already loaded previously!", library);
            return;
        }
        try {
            this.libraryLoader.loadLibrary(library);
            this.loadedLibraries.add(library);
            log("%s (%s) was loaded normally!", library, version);
        } catch (UnsatisfiedLinkError e) {
            log("Loading the library normally failed: %s", Log.getStackTraceString(e));
            log("%s (%s) was not loaded normally, re-linking...", library, version);
            File workaroundLibFile = getWorkaroundLibFile(context, library, version);
            if (!workaroundLibFile.exists() || this.force) {
                if (this.force) {
                    log("Forcing a re-link of %s (%s)...", library, version);
                }
                cleanupOldLibFiles(context, library, version);
                reLinkerInstance = this;
                context2 = context;
                this.libraryInstaller.installLibrary(context2, this.libraryLoader.supportedAbis(), this.libraryLoader.mapLibraryName(library), workaroundLibFile, reLinkerInstance);
            } else {
                reLinkerInstance = this;
                context2 = context;
            }
            try {
                if (reLinkerInstance.recursive) {
                    try {
                        elfParser = new ElfParser(workaroundLibFile);
                        try {
                            List<String> neededDependencies = elfParser.parseNeededDependencies();
                            elfParser.close();
                            Iterator<String> it = neededDependencies.iterator();
                            while (it.hasNext()) {
                                loadLibrary(context2, reLinkerInstance.libraryLoader.unmapLibraryName(it.next()));
                            }
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (elfParser != null) {
                                elfParser.close();
                                throw th2;
                            }
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        elfParser = null;
                    }
                }
            } catch (IOException unused) {
            }
            reLinkerInstance.libraryLoader.loadPath(workaroundLibFile.getAbsolutePath());
            reLinkerInstance.loadedLibraries.add(library);
            log("%s (%s) was re-linked!", library, version);
        }
    }

    protected File getWorkaroundLibDir(final Context context) {
        return context.getDir("lib", 0);
    }

    protected File getWorkaroundLibFile(final Context context, final String library, final String version) {
        String strMapLibraryName = this.libraryLoader.mapLibraryName(library);
        if (TextUtils.isEmpty(version)) {
            return new File(getWorkaroundLibDir(context), strMapLibraryName);
        }
        return new File(getWorkaroundLibDir(context), strMapLibraryName + "." + version);
    }

    protected void cleanupOldLibFiles(final Context context, final String library, final String currentVersion) {
        File workaroundLibDir = getWorkaroundLibDir(context);
        File workaroundLibFile = getWorkaroundLibFile(context, library, currentVersion);
        final String strMapLibraryName = this.libraryLoader.mapLibraryName(library);
        File[] fileArrListFiles = workaroundLibDir.listFiles(new FilenameFilter() { // from class: com.getkeepsafe.relinker.ReLinkerInstance.2
            @Override // java.io.FilenameFilter
            public boolean accept(File dir, String filename) {
                return filename.startsWith(strMapLibraryName);
            }
        });
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.force || !file.getAbsolutePath().equals(workaroundLibFile.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public void log(final String format2, final Object... args) {
        log(String.format(Locale.US, format2, args));
    }
}
