package com.stripe.android.payments.core.analytics;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ErrorReporter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule;", "", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.payments.core.analytics.DefaultErrorReporterModule, reason: use source file name */
/* loaded from: classes22.dex */
public interface ErrorReporter3 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: ErrorReporter.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule$Companion;", "", "()V", "provideIoContext", "Lkotlin/coroutines/CoroutineContext;", "provideLogger", "Lcom/stripe/android/core/Logger;", "providePublishableKey", "Lkotlin/Function0;", "", "context", "Landroid/content/Context;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.payments.core.analytics.DefaultErrorReporterModule$Companion, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Logger provideLogger() {
            return Logger.INSTANCE.getInstance(false);
        }

        public final CoroutineContext provideIoContext() {
            return Dispatchers.getIO();
        }

        public final Function0<String> providePublishableKey(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Function0<String>() { // from class: com.stripe.android.payments.core.analytics.DefaultErrorReporterModule$Companion$providePublishableKey$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return PaymentConfiguration.Companion.getInstance(context).getPublishableKey();
                }
            };
        }
    }
}
