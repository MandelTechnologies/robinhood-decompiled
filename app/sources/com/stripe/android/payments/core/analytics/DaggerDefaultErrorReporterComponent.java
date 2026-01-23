package com.stripe.android.payments.core.analytics;

import android.content.Context;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.analytics.ErrorReporter2;
import dagger.internal.Preconditions;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes22.dex */
public final class DaggerDefaultErrorReporterComponent {
    public static ErrorReporter2.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements ErrorReporter2.Builder {
        private Context context;
        private Set<String> productUsage;

        private Builder() {
        }

        @Override // com.stripe.android.payments.core.analytics.ErrorReporter2.Builder
        public /* bridge */ /* synthetic */ ErrorReporter2.Builder productUsage(Set set) {
            return productUsage((Set<String>) set);
        }

        @Override // com.stripe.android.payments.core.analytics.ErrorReporter2.Builder
        public Builder context(Context context) {
            this.context = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.stripe.android.payments.core.analytics.ErrorReporter2.Builder
        public Builder productUsage(Set<String> set) {
            this.productUsage = (Set) Preconditions.checkNotNull(set);
            return this;
        }

        @Override // com.stripe.android.payments.core.analytics.ErrorReporter2.Builder
        public ErrorReporter2 build() {
            Preconditions.checkBuilderRequirement(this.context, Context.class);
            Preconditions.checkBuilderRequirement(this.productUsage, Set.class);
            return new DefaultErrorReporterComponentImpl(this.context, this.productUsage);
        }
    }

    private static final class DefaultErrorReporterComponentImpl implements ErrorReporter2 {
        private final Context context;
        private final DefaultErrorReporterComponentImpl defaultErrorReporterComponentImpl;
        private final Set<String> productUsage;

        private DefaultErrorReporterComponentImpl(Context context, Set<String> set) {
            this.defaultErrorReporterComponentImpl = this;
            this.context = context;
            this.productUsage = set;
        }

        private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(DefaultErrorReporterModule_Companion_ProvideLoggerFactory.provideLogger(), DefaultErrorReporterModule_Companion_ProvideIoContextFactory.provideIoContext());
        }

        private Function0<String> namedFunction0OfString() {
            return C42574x6d9a8591.providePublishableKey(this.context);
        }

        private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(this.context, namedFunction0OfString(), this.productUsage);
        }

        private RealErrorReporter realErrorReporter() {
            return new RealErrorReporter(defaultAnalyticsRequestExecutor(), paymentAnalyticsRequestFactory());
        }

        @Override // com.stripe.android.payments.core.analytics.ErrorReporter2
        public ErrorReporter getErrorReporter() {
            return realErrorReporter();
        }
    }
}
