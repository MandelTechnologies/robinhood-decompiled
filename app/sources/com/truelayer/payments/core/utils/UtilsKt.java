package com.truelayer.payments.core.utils;

import com.truelayer.payments.core.BuildConfig;
import com.truelayer.payments.core.domain.configuration.Environment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0007"}, m3636d2 = {"getAnalyticsServerApi", "Lcom/truelayer/payments/analytics/configuration/Environment;", "environment", "Lcom/truelayer/payments/core/domain/configuration/Environment;", "getPaymentServerApi", "", "getPaymentsExperienceServerApi", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class UtilsKt {

    /* compiled from: Utils.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Environment.values().length];
            try {
                iArr[Environment.PRODUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Environment.SANDBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getPaymentServerApi(Environment environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        int i = WhenMappings.$EnumSwitchMapping$0[environment.ordinal()];
        if (i == 1) {
            return BuildConfig.PAYMENTS_API_URI_PROD;
        }
        if (i == 2) {
            return BuildConfig.PAYMENTS_API_URI_SANDBOX;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String getPaymentsExperienceServerApi(Environment environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        int i = WhenMappings.$EnumSwitchMapping$0[environment.ordinal()];
        if (i == 1) {
            return BuildConfig.PAYMENTS_EXPERIENCE_API_URI_PROD;
        }
        if (i == 2) {
            return BuildConfig.PAYMENTS_EXPERIENCE_API_URI_SANDBOX;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final com.truelayer.payments.analytics.configuration.Environment getAnalyticsServerApi(Environment environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        int i = WhenMappings.$EnumSwitchMapping$0[environment.ordinal()];
        if (i == 1) {
            return com.truelayer.payments.analytics.configuration.Environment.PRODUCTION;
        }
        if (i == 2) {
            return com.truelayer.payments.analytics.configuration.Environment.SANDBOX;
        }
        throw new NoWhenBranchMatchedException();
    }
}
