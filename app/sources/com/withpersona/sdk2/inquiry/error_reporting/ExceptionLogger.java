package com.withpersona.sdk2.inquiry.error_reporting;

import android.content.Context;
import com.withpersona.sdk2.inquiry.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.text.StringsKt;

/* compiled from: ExceptionLogger.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\tJ\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0007H\u0002J\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u000e*\u00020\u000bH\u0002J\u000e\u0010\u0013\u001a\u0004\u0018\u00010\u000e*\u00020\u000bH\u0002J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/error_reporting/ExceptionLogger;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "errDir", "Ljava/io/File;", "logException", "", "error", "", "clearLastError", "getLastErrorMessage", "", "hasLastErrorMessage", "", "getLastErrorFile", "findRelevantCallInCallStack", "firstFromCallStack", "prepareDir", "file", "readTextFile", "writeTextFile", "text", "Companion", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class ExceptionLogger {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final File errDir;

    public ExceptionLogger(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.errDir = new File(new File(context.getFilesDir(), ".com.withpersona.sdk2.inquiry"), "errors");
    }

    public final void logException(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        prepareDir(this.errDir);
        File lastErrorFile = getLastErrorFile();
        if (lastErrorFile.isDirectory()) {
            lastErrorFile.delete();
        }
        String canonicalName = error.getClass().getCanonicalName();
        String strFindRelevantCallInCallStack = findRelevantCallInCallStack(error);
        if (strFindRelevantCallInCallStack == null) {
            strFindRelevantCallInCallStack = firstFromCallStack(error);
        }
        writeTextFile(lastErrorFile, canonicalName + " in " + strFindRelevantCallInCallStack);
    }

    public final void clearLastError() {
        getLastErrorFile().delete();
    }

    public final String getLastErrorMessage() {
        return readTextFile(getLastErrorFile());
    }

    public final boolean hasLastErrorMessage() {
        return getLastErrorFile().exists();
    }

    private final File getLastErrorFile() {
        return new File(this.errDir, "last_error.txt");
    }

    private final String findRelevantCallInCallStack(Throwable th) {
        while (th != null) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                if (StringsKt.startsWith$default(className, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, (Object) null)) {
                    return stackTraceElement.getClassName() + " in " + stackTraceElement.getMethodName() + " at line " + stackTraceElement.getLineNumber();
                }
            }
            th = th.getCause();
        }
        return null;
    }

    private final String firstFromCallStack(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt.firstOrNull(stackTrace);
        if (stackTraceElement == null) {
            return null;
        }
        return stackTraceElement.getClassName() + " in " + stackTraceElement.getMethodName() + " at line " + stackTraceElement.getLineNumber();
    }

    private final void prepareDir(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            } else {
                file.delete();
            }
        }
        file.mkdirs();
    }

    private final String readTextFile(File file) {
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i > 0) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                    Charset UTF_82 = UTF_8;
                    Intrinsics.checkNotNullExpressionValue(UTF_82, "UTF_8");
                    String str = new String(byteArray, UTF_82);
                    Closeable.closeFinally(fileInputStream, null);
                    return str;
                }
            } finally {
            }
        }
    }

    private final void writeTextFile(File file, String text) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), UTF_8);
        try {
            outputStreamWriter.write(text);
            Unit unit = Unit.INSTANCE;
            Closeable.closeFinally(outputStreamWriter, null);
        } finally {
        }
    }
}
