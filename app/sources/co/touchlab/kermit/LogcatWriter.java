package co.touchlab.kermit;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogcatWriter.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lco/touchlab/kermit/LogcatWriter;", "Lco/touchlab/kermit/LogWriter;", "messageStringFormatter", "Lco/touchlab/kermit/MessageStringFormatter;", "(Lco/touchlab/kermit/MessageStringFormatter;)V", "testWriter", "Lco/touchlab/kermit/CommonWriter;", "log", "", "severity", "Lco/touchlab/kermit/Severity;", "message", "", "tag", "throwable", "", "kermit-core_debug"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class LogcatWriter extends LogWriter {
    private final MessageStringFormatter messageStringFormatter;
    private final CommonWriter testWriter;

    /* compiled from: LogcatWriter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Severity.values().length];
            try {
                iArr[Severity.Verbose.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Severity.Debug.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Severity.Info.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Severity.Warn.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Severity.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Severity.Assert.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LogcatWriter(MessageStringFormatter messageStringFormatter) {
        Intrinsics.checkNotNullParameter(messageStringFormatter, "messageStringFormatter");
        this.messageStringFormatter = messageStringFormatter;
        this.testWriter = new CommonWriter(messageStringFormatter);
    }

    public /* synthetic */ LogcatWriter(MessageStringFormatter messageStringFormatter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MessageStringFormatter2.INSTANCE : messageStringFormatter);
    }

    @Override // co.touchlab.kermit.LogWriter
    public void log(Severity severity, String message, String tag, Throwable throwable) {
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(tag, "tag");
        String strMo9093formatMessageSNKSsE8 = this.messageStringFormatter.mo9093formatMessageSNKSsE8(null, null, MessageStringFormatter3.m9095constructorimpl(message));
        try {
            if (throwable == null) {
                switch (WhenMappings.$EnumSwitchMapping$0[severity.ordinal()]) {
                    case 1:
                        Log.v(tag, strMo9093formatMessageSNKSsE8);
                        break;
                    case 2:
                        Log.d(tag, strMo9093formatMessageSNKSsE8);
                        break;
                    case 3:
                        Log.i(tag, strMo9093formatMessageSNKSsE8);
                        break;
                    case 4:
                        Log.w(tag, strMo9093formatMessageSNKSsE8);
                        break;
                    case 5:
                        Log.e(tag, strMo9093formatMessageSNKSsE8);
                        break;
                    case 6:
                        Log.wtf(tag, strMo9093formatMessageSNKSsE8);
                        break;
                }
            }
            switch (WhenMappings.$EnumSwitchMapping$0[severity.ordinal()]) {
                case 1:
                    Log.v(tag, strMo9093formatMessageSNKSsE8, throwable);
                    break;
                case 2:
                    Log.d(tag, strMo9093formatMessageSNKSsE8, throwable);
                    break;
                case 3:
                    Log.i(tag, strMo9093formatMessageSNKSsE8, throwable);
                    break;
                case 4:
                    Log.w(tag, strMo9093formatMessageSNKSsE8, throwable);
                    break;
                case 5:
                    Log.e(tag, strMo9093formatMessageSNKSsE8, throwable);
                    break;
                case 6:
                    Log.wtf(tag, strMo9093formatMessageSNKSsE8, throwable);
                    break;
            }
        } catch (Exception unused) {
            this.testWriter.log(severity, message, tag, throwable);
        }
    }
}
