package com.twilio.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: TwilioLogger.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"logWriter", "Lcom/twilio/util/LogWriter;", "getLogWriter", "()Lcom/twilio/util/LogWriter;", "setLogWriter", "(Lcom/twilio/util/LogWriter;)V", "logger", "Lcom/twilio/util/TwilioLogger;", "", "getLogger", "(Ljava/lang/Object;)Lcom/twilio/util/TwilioLogger;", "shared-internal_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.util.TwilioLoggerKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class TwilioLogger3 {
    private static TwilioLogger2 logWriter = LogWriterImpl.INSTANCE;

    public static final TwilioLogger2 getLogWriter() {
        return logWriter;
    }

    public static final void setLogWriter(TwilioLogger2 twilioLogger2) {
        Intrinsics.checkNotNullParameter(twilioLogger2, "<set-?>");
        logWriter = twilioLogger2;
    }

    public static final TwilioLogger getLogger(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        return TwilioLogger.INSTANCE.getLogger(Reflection.getOrCreateKotlinClass(obj.getClass()));
    }
}
