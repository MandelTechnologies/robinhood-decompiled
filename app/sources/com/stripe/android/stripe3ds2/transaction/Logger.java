package com.stripe.android.stripe3ds2.transaction;

import android.util.Log;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Logger.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \n2\u00020\u0001:\u0003\n\u000b\fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/Logger;", "", "()V", "error", "", "msg", "", "t", "", SduiFeatureDiscovery3.INFO_TAG, "Companion", "Noop", "Real", "Lcom/stripe/android/stripe3ds2/transaction/Logger$Noop;", "Lcom/stripe/android/stripe3ds2/transaction/Logger$Real;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public abstract class Logger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ Logger(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void error(String msg, Throwable t);

    public abstract void info(String msg);

    private Logger() {
    }

    /* compiled from: Logger.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/Logger$Real;", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "<init>", "()V", "", "msg", "", SduiFeatureDiscovery3.INFO_TAG, "(Ljava/lang/String;)V", "", "t", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Real extends Logger {
        public static final Real INSTANCE = new Real();

        private Real() {
            super(null);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.Logger
        public void info(String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            Log.i("StripeSdk", msg);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.Logger
        public void error(String msg, Throwable t) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            Log.e("StripeSdk", msg, t);
        }
    }

    /* compiled from: Logger.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/Logger$Noop;", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "()V", "error", "", "msg", "", "t", "", SduiFeatureDiscovery3.INFO_TAG, "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Noop extends Logger {
        public static final Noop INSTANCE = new Noop();

        @Override // com.stripe.android.stripe3ds2.transaction.Logger
        public void error(String msg, Throwable t) {
            Intrinsics.checkNotNullParameter(msg, "msg");
        }

        @Override // com.stripe.android.stripe3ds2.transaction.Logger
        public void info(String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
        }

        private Noop() {
            super(null);
        }
    }

    /* compiled from: Logger.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/Logger$Companion;", "", "()V", "get", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "enableLogging", "", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Logger get(boolean enableLogging) {
            if (enableLogging) {
                return Real.INSTANCE;
            }
            return Noop.INSTANCE;
        }
    }
}
