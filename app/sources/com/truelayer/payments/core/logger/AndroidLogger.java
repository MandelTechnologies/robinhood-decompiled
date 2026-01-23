package com.truelayer.payments.core.logger;

import android.util.Log;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AndroidLogger.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/truelayer/payments/core/logger/AndroidLogger;", "Lcom/truelayer/payments/core/logger/Logger;", "()V", "TAG", "", "logLevel", "Lcom/truelayer/payments/core/logger/LogLevel;", "getLogLevel", "()Lcom/truelayer/payments/core/logger/LogLevel;", "log", "", "level", "tag", "error", "", "message", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class AndroidLogger implements Logger {
    private static final String TAG = "[TL-%s]";
    public static final AndroidLogger INSTANCE = new AndroidLogger();
    private static final AndroidLogger2 logLevel = AndroidLogger2.Verbose;

    private AndroidLogger() {
    }

    @Override // com.truelayer.payments.core.logger.Logger
    public AndroidLogger2 getLogLevel() {
        return logLevel;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    @Override // com.truelayer.payments.core.logger.Logger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void log(AndroidLogger2 level, String tag, Throwable error, String message) {
        String str;
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (level.getPriority() < getLogLevel().getPriority()) {
            return;
        }
        if (error != null) {
            str = ":\n" + Log.getStackTraceString(error);
            if (str == null) {
                str = "";
            }
        }
        int priority = level.getPriority();
        String str2 = String.format(TAG, Arrays.copyOf(new Object[]{tag}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        Log.println(priority, str2, message + str);
    }
}
