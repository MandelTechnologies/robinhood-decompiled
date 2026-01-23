package com.robinhood.utils.logging;

import com.robinhood.utils.logging.CrashReporter;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: CrashlyticsTree.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J,\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/utils/logging/CrashlyticsTree;", "Ltimber/log/Timber$Tree;", "<init>", "()V", "stringWriter", "Ljava/io/StringWriter;", "printWriter", "Ljava/io/PrintWriter;", "isLoggable", "", "tag", "", "priority", "", "log", "", "message", "t", "", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CrashlyticsTree extends Timber.Tree {
    public static final CrashlyticsTree INSTANCE = new CrashlyticsTree();
    private static final PrintWriter printWriter;
    private static final StringWriter stringWriter;

    @Override // timber.log.Timber.Tree
    protected boolean isLoggable(String tag, int priority) {
        return priority >= 4;
    }

    private CrashlyticsTree() {
    }

    static {
        StringWriter stringWriter2 = new StringWriter();
        stringWriter = stringWriter2;
        printWriter = new PrintWriter(stringWriter2);
    }

    @Override // timber.log.Timber.Tree
    protected void log(int priority, String tag, String message, Throwable t) {
        Intrinsics.checkNotNullParameter(message, "message");
        CrashReporter.Companion companion = CrashReporter.INSTANCE;
        companion.log(message);
        if (t != null) {
            t.printStackTrace(printWriter);
            StringWriter stringWriter2 = stringWriter;
            String string2 = stringWriter2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            companion.log(string2);
            stringWriter2.getBuffer().setLength(0);
        }
    }
}
