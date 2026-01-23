package com.robinhood.shared.history.equities;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityHistoryLoggerProviderModule_ProvidesEquityHistoryLoggerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/history/equities/EquityHistoryLoggerProviderModule_ProvidesEquityHistoryLoggerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/history/equities/EquityHistoryLogger;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "providesEquityHistoryLogger", "lib-equity-history-logger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.equities.EquityHistoryLoggerProviderModule_ProvidesEquityHistoryLoggerFactory */
/* loaded from: classes6.dex */
public final class C39003x2e0c2460 implements Factory<EquityHistoryLogger> {
    public static final C39003x2e0c2460 INSTANCE = new C39003x2e0c2460();

    private C39003x2e0c2460() {
    }

    @Override // javax.inject.Provider
    public EquityHistoryLogger get() {
        return providesEquityHistoryLogger();
    }

    @JvmStatic
    public static final C39003x2e0c2460 create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final EquityHistoryLogger providesEquityHistoryLogger() {
        Object objCheckNotNull = Preconditions.checkNotNull(EquityHistoryLoggerProviderModule.INSTANCE.providesEquityHistoryLogger(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (EquityHistoryLogger) objCheckNotNull;
    }
}
