package com.stripe.android.core;

import android.util.Log;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.singular.sdk.internal.SLRemoteConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Logger.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\bg\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J#\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/core/Logger;", "", "", "msg", "", SLRemoteConfiguration.Constants.DEBUG_JSON_KEY, "(Ljava/lang/String;)V", SduiFeatureDiscovery3.INFO_TAG, "", "t", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Companion", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface Logger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void debug(String msg);

    void error(String msg, Throwable t);

    void info(String msg);

    /* compiled from: Logger.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0004*\u0002\f\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/stripe/android/core/Logger$Companion;", "", "<init>", "()V", "", "enableLogging", "Lcom/stripe/android/core/Logger;", "getInstance", "(Z)Lcom/stripe/android/core/Logger;", "real", "()Lcom/stripe/android/core/Logger;", "noop", "com/stripe/android/core/Logger$Companion$REAL_LOGGER$1", "REAL_LOGGER", "Lcom/stripe/android/core/Logger$Companion$REAL_LOGGER$1;", "com/stripe/android/core/Logger$Companion$NOOP_LOGGER$1", "NOOP_LOGGER", "Lcom/stripe/android/core/Logger$Companion$NOOP_LOGGER$1;", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Logger4 REAL_LOGGER = new Logger() { // from class: com.stripe.android.core.Logger$Companion$REAL_LOGGER$1
            @Override // com.stripe.android.core.Logger
            public void debug(String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                Log.d("StripeSdk", msg);
            }

            @Override // com.stripe.android.core.Logger
            public void info(String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                Log.i("StripeSdk", msg);
            }

            @Override // com.stripe.android.core.Logger
            public void error(String msg, Throwable t) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                Log.e("StripeSdk", msg, t);
            }
        };
        private static final Logger3 NOOP_LOGGER = new Logger() { // from class: com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1
            @Override // com.stripe.android.core.Logger
            public void debug(String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
            }

            @Override // com.stripe.android.core.Logger
            public void error(String msg, Throwable t) {
                Intrinsics.checkNotNullParameter(msg, "msg");
            }

            @Override // com.stripe.android.core.Logger
            public void info(String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
            }
        };

        private Companion() {
        }

        public final Logger getInstance(boolean enableLogging) {
            if (enableLogging) {
                return real();
            }
            return noop();
        }

        public final Logger real() {
            return REAL_LOGGER;
        }

        public final Logger noop() {
            return NOOP_LOGGER;
        }
    }
}
