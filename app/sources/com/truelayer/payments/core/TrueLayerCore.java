package com.truelayer.payments.core;

import android.content.Context;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.core.configuration.Configuration;
import com.truelayer.payments.core.domain.configuration.HttpConnectionConfiguration2;
import com.truelayer.payments.core.domain.configuration.TrueLayerConfiguration;
import com.truelayer.payments.core.domain.errors.TrueLayerConfigurationError;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.core.store.Store;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TrueLayerCore.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lcom/truelayer/payments/core/TrueLayerCore;", "", "network", "Lcom/truelayer/payments/core/network/Network;", "getNetwork", "()Lcom/truelayer/payments/core/network/Network;", PlaceTypes.STORE, "Lcom/truelayer/payments/core/store/Store;", "getStore", "()Lcom/truelayer/payments/core/store/Store;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface TrueLayerCore {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Network getNetwork();

    Store getStore();

    /* compiled from: TrueLayerCore.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0007R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, m3636d2 = {"Lcom/truelayer/payments/core/TrueLayerCore$Companion;", "", "()V", "Instance", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/TrueLayerCore;", "Lcom/truelayer/payments/core/domain/errors/TrueLayerConfigurationError;", "getInstance", "()Lcom/truelayer/payments/core/domain/utils/Outcome;", "InternalInstance", "analytics", "Lcom/truelayer/payments/analytics/TrueLayerAnalytics;", "getAnalytics$payments_core_release", "()Lcom/truelayer/payments/analytics/TrueLayerAnalytics;", "setAnalytics$payments_core_release", "(Lcom/truelayer/payments/analytics/TrueLayerAnalytics;)V", "loggingLevel", "Lcom/truelayer/payments/core/domain/configuration/HttpLoggingLevel;", "getLoggingLevel$payments_core_release", "()Lcom/truelayer/payments/core/domain/configuration/HttpLoggingLevel;", "setLoggingLevel$payments_core_release", "(Lcom/truelayer/payments/core/domain/configuration/HttpLoggingLevel;)V", "init", "applicationContext", "Landroid/content/Context;", "config", "Lcom/truelayer/payments/core/domain/configuration/TrueLayerConfiguration;", "isAnalyticsInitialized", "", "reset", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static TrueLayerAnalytics analytics;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static volatile Outcome<? extends TrueLayerCore, ? extends TrueLayerConfigurationError> InternalInstance = new Fail(new TrueLayerConfigurationError.NotInitialised("TrueLayerCore"));
        private static HttpConnectionConfiguration2 loggingLevel = HttpConnectionConfiguration2.None;

        private Companion() {
        }

        public final HttpConnectionConfiguration2 getLoggingLevel$payments_core_release() {
            return loggingLevel;
        }

        public final void setLoggingLevel$payments_core_release(HttpConnectionConfiguration2 httpConnectionConfiguration2) {
            Intrinsics.checkNotNullParameter(httpConnectionConfiguration2, "<set-?>");
            loggingLevel = httpConnectionConfiguration2;
        }

        public final TrueLayerAnalytics getAnalytics$payments_core_release() {
            TrueLayerAnalytics trueLayerAnalytics = analytics;
            if (trueLayerAnalytics != null) {
                return trueLayerAnalytics;
            }
            Intrinsics.throwUninitializedPropertyAccessException("analytics");
            return null;
        }

        public final void setAnalytics$payments_core_release(TrueLayerAnalytics trueLayerAnalytics) {
            Intrinsics.checkNotNullParameter(trueLayerAnalytics, "<set-?>");
            analytics = trueLayerAnalytics;
        }

        public final boolean isAnalyticsInitialized() {
            return analytics != null;
        }

        public final Outcome<TrueLayerCore, TrueLayerConfigurationError> getInstance() {
            return InternalInstance;
        }

        public final Outcome<TrueLayerCore, TrueLayerConfigurationError> init(Context applicationContext, TrueLayerAnalytics analytics2, TrueLayerConfiguration config) {
            Outcome outcome;
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(analytics2, "analytics");
            Intrinsics.checkNotNullParameter(config, "config");
            Outcome<? extends TrueLayerCore, ? extends TrueLayerConfigurationError> outcome2 = InternalInstance;
            if (outcome2 instanceof Ok) {
                return new Fail(new TrueLayerConfigurationError.AlreadyInitialised("TrueLayerCore"));
            }
            if (outcome2 instanceof Fail) {
                setAnalytics$payments_core_release(analytics2);
                synchronized (this) {
                    try {
                        TrueLayerCoreImpl trueLayerCoreImpl = new TrueLayerCoreImpl(Configuration.INSTANCE.init$payments_core_release(applicationContext, config), applicationContext);
                        HttpConnectionConfiguration2 httpDebugLoggingLevel = config.getHttpConfig().getHttpDebugLoggingLevel();
                        if (httpDebugLoggingLevel == null) {
                            httpDebugLoggingLevel = HttpConnectionConfiguration2.None;
                        }
                        loggingLevel = httpDebugLoggingLevel;
                        InternalInstance = new Ok(trueLayerCoreImpl);
                        outcome = InternalInstance;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return outcome;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final void reset() {
            InternalInstance = new Fail(new TrueLayerConfigurationError.NotInitialised("TrueLayerCore"));
        }
    }
}
