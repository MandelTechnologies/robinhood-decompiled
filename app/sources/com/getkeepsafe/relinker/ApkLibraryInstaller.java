package com.getkeepsafe.relinker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.getkeepsafe.relinker.ReLinker;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes16.dex */
public class ApkLibraryInstaller implements ReLinker.LibraryInstaller {
    private String[] sourceDirectories(final Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null && strArr.length != 0) {
            String[] strArr2 = new String[strArr.length + 1];
            strArr2[0] = applicationInfo.sourceDir;
            System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
            return strArr2;
        }
        return new String[]{applicationInfo.sourceDir};
    }

    private static class ZipFileInZipEntry {
        public ZipEntry zipEntry;
        public ZipFile zipFile;

        public ZipFileInZipEntry(ZipFile zipFile, ZipEntry zipEntry) {
            this.zipFile = zipFile;
            this.zipEntry = zipEntry;
        }
    }

    private ZipFileInZipEntry findAPKWithLibrary(final Context context, final String[] abis, final String mappedLibraryName, final ReLinkerInstance instance) throws IOException {
        String[] strArrSourceDirectories = sourceDirectories(context);
        int length = strArrSourceDirectories.length;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str = strArrSourceDirectories[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile != null) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 < 5) {
                        for (String str2 : abis) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("lib");
                            char c = File.separatorChar;
                            sb.append(c);
                            sb.append(str2);
                            sb.append(c);
                            sb.append(mappedLibraryName);
                            String string2 = sb.toString();
                            instance.log("Looking for %s in APK %s...", string2, str);
                            ZipEntry entry = zipFile.getEntry(string2);
                            if (entry != null) {
                                return new ZipFileInZipEntry(zipFile, entry);
                            }
                        }
                        i4 = i5;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
        }
    }

    private String[] getSupportedABIs(Context context, String mappedLibraryName) {
        StringBuilder sb = new StringBuilder();
        sb.append("lib");
        char c = File.separatorChar;
        sb.append(c);
        sb.append("([^\\");
        sb.append(c);
        sb.append("]*)");
        sb.append(c);
        sb.append(mappedLibraryName);
        Pattern patternCompile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str : sourceDirectories(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        return;
     */
    @Override // com.getkeepsafe.relinker.ReLinker.LibraryInstaller
    @SuppressLint({"SetWorldReadable"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void installLibrary(Context context, String[] strArr, String str, File file, ReLinkerInstance reLinkerInstance) throws Throwable {
        String[] supportedABIs;
        ZipFile zipFile;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        long jCopy;
        ZipFileInZipEntry zipFileInZipEntry = null;
        Closeable closeable = null;
        try {
            ZipFileInZipEntry zipFileInZipEntryFindAPKWithLibrary = findAPKWithLibrary(context, strArr, str, reLinkerInstance);
            try {
                if (zipFileInZipEntryFindAPKWithLibrary == null) {
                    try {
                        supportedABIs = getSupportedABIs(context, str);
                    } catch (Exception e) {
                        supportedABIs = new String[]{e.toString()};
                    }
                    throw new MissingLibraryException(str, strArr, supportedABIs);
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    try {
                        if (i < 5) {
                            reLinkerInstance.log("Found %s! Extracting...", str);
                            try {
                                if (file.exists() || file.createNewFile()) {
                                    try {
                                        inputStream = zipFileInZipEntryFindAPKWithLibrary.zipFile.getInputStream(zipFileInZipEntryFindAPKWithLibrary.zipEntry);
                                        try {
                                            fileOutputStream = new FileOutputStream(file);
                                        } catch (FileNotFoundException unused) {
                                            fileOutputStream = null;
                                        } catch (IOException unused2) {
                                            fileOutputStream = null;
                                        } catch (Throwable th) {
                                            th = th;
                                            fileOutputStream = null;
                                        }
                                    } catch (FileNotFoundException unused3) {
                                        inputStream = null;
                                        fileOutputStream = null;
                                    } catch (IOException unused4) {
                                        inputStream = null;
                                        fileOutputStream = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileOutputStream = null;
                                    }
                                    try {
                                        jCopy = copy(inputStream, fileOutputStream);
                                        fileOutputStream.getFD().sync();
                                    } catch (FileNotFoundException unused5) {
                                        closeSilently(inputStream);
                                        closeSilently(fileOutputStream);
                                        i = i2;
                                    } catch (IOException unused6) {
                                        closeSilently(inputStream);
                                        closeSilently(fileOutputStream);
                                        i = i2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        closeable = inputStream;
                                        closeSilently(closeable);
                                        closeSilently(fileOutputStream);
                                        throw th;
                                    }
                                    if (jCopy != file.length()) {
                                        closeSilently(inputStream);
                                        closeSilently(fileOutputStream);
                                    } else {
                                        closeSilently(inputStream);
                                        closeSilently(fileOutputStream);
                                        file.setReadable(true, false);
                                        file.setExecutable(true, false);
                                        file.setWritable(true);
                                        zipFile = zipFileInZipEntryFindAPKWithLibrary.zipFile;
                                        if (zipFile == null) {
                                            return;
                                        }
                                    }
                                }
                            } catch (IOException unused7) {
                            }
                            i = i2;
                        } else {
                            reLinkerInstance.log("FATAL! Couldn't extract the library from the APK!");
                            zipFile = zipFileInZipEntryFindAPKWithLibrary.zipFile;
                            if (zipFile == null) {
                                return;
                            }
                        }
                    } catch (IOException unused8) {
                        return;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                zipFileInZipEntry = zipFileInZipEntryFindAPKWithLibrary;
                if (zipFileInZipEntry != null) {
                    try {
                        ZipFile zipFile2 = zipFileInZipEntry.zipFile;
                        if (zipFile2 != null) {
                            zipFile2.close();
                        }
                    } catch (IOException unused9) {
                    }
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private long copy(InputStream in, OutputStream out) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int i = in.read(bArr);
            if (i != -1) {
                out.write(bArr, 0, i);
                j += i;
            } else {
                out.flush();
                return j;
            }
        }
    }

    private void closeSilently(final Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
