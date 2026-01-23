package com.twilio.util;

import android.util.Log;
import com.singular.sdk.internal.Constants;
import com.twilio.util.LoggingLevel;
import java.io.File;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.LogRecord;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: LogWriterImpl.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J*\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002J&\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/twilio/util/LogWriterImpl;", "Lcom/twilio/util/LogWriter;", "()V", "dir", "Ljava/io/File;", "getDir", "()Ljava/io/File;", "dir$delegate", "Lkotlin/Lazy;", "fh", "Ljava/util/logging/FileHandler;", "getFh", "()Ljava/util/logging/FileHandler;", "fh$delegate", "kCurrentLogFileName", "", "d", "", "tag", "msg", "t", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "printLogInFile", "loggingLevel", "Lcom/twilio/util/LoggingLevel;", "rotateLogFile", "v", "w", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class LogWriterImpl implements TwilioLogger2 {
    public static final LogWriterImpl INSTANCE = new LogWriterImpl();

    /* renamed from: dir$delegate, reason: from kotlin metadata */
    private static final Lazy dir = LazyKt.lazy(new Function0<File>() { // from class: com.twilio.util.LogWriterImpl$dir$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            return ApplicationContextHolder.getApplicationContext().getFilesDir();
        }
    });

    /* renamed from: fh$delegate, reason: from kotlin metadata */
    private static final Lazy fh = LazyKt.lazy(new Function0<FileHandler>() { // from class: com.twilio.util.LogWriterImpl$fh$2
        @Override // kotlin.jvm.functions.Function0
        public final FileHandler invoke() throws SecurityException {
            LogWriterImpl logWriterImpl = LogWriterImpl.INSTANCE;
            logWriterImpl.rotateLogFile();
            FileHandler fileHandler = new FileHandler(new File(logWriterImpl.getDir(), "current.log").getAbsolutePath());
            fileHandler.setFormatter(new CustomFormatter());
            return fileHandler;
        }
    });
    private static final String kCurrentLogFileName = "current.log";

    private LogWriterImpl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getDir() {
        Object value = dir.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (File) value;
    }

    private final FileHandler getFh() {
        return (FileHandler) fh.getValue();
    }

    @Override // com.twilio.util.TwilioLogger2
    /* renamed from: v */
    public void mo3181v(String tag, String msg, Throwable t) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.v(tag, msg, t);
        printLogInFile(LoggingLevel.VERBOSE.INSTANCE, tag, msg, t);
    }

    @Override // com.twilio.util.TwilioLogger2
    /* renamed from: d */
    public void mo3178d(String tag, String msg, Throwable t) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.d(tag, msg, t);
        printLogInFile(LoggingLevel.DEBUG.INSTANCE, tag, msg, t);
    }

    @Override // com.twilio.util.TwilioLogger2
    /* renamed from: i */
    public void mo3180i(String tag, String msg, Throwable t) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.i(tag, msg, t);
        printLogInFile(LoggingLevel.INFO.INSTANCE, tag, msg, t);
    }

    @Override // com.twilio.util.TwilioLogger2
    /* renamed from: w */
    public void mo3182w(String tag, String msg, Throwable t) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.w(tag, msg, t);
        printLogInFile(LoggingLevel.WARN.INSTANCE, tag, msg, t);
    }

    @Override // com.twilio.util.TwilioLogger2
    /* renamed from: e */
    public void mo3179e(String tag, String msg, Throwable t) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.e(tag, msg, t);
        printLogInFile(LoggingLevel.ERROR.INSTANCE, tag, msg, t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rotateLogFile() {
        File file = new File(getDir(), "log.bak");
        if (file.exists()) {
            file.delete();
        }
        File file2 = new File(getDir(), kCurrentLogFileName);
        if (file2.exists()) {
            file2.renameTo(new File(getDir(), "log.bak"));
        }
    }

    private final void printLogInFile(LoggingLevel loggingLevel, String tag, String msg, Throwable t) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s: %s", Arrays.copyOf(new Object[]{tag, msg}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        LogRecord logRecord = new LogRecord(loggingLevel, str);
        logRecord.setThrown(t);
        getFh().publish(logRecord);
    }
}
