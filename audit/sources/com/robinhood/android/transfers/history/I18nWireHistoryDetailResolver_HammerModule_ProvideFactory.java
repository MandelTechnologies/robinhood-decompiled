package com.robinhood.android.transfers.history;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.history.navigation.HistoryDetailResolver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: I18nWireHistoryDetailResolver_HammerModule_ProvideFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/history/I18nWireHistoryDetailResolver_HammerModule_ProvideFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/history/navigation/HistoryDetailResolver;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provide", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class I18nWireHistoryDetailResolver_HammerModule_ProvideFactory implements Factory<HistoryDetailResolver> {
    public static final int $stable = 0;
    public static final I18nWireHistoryDetailResolver_HammerModule_ProvideFactory INSTANCE = new I18nWireHistoryDetailResolver_HammerModule_ProvideFactory();

    private I18nWireHistoryDetailResolver_HammerModule_ProvideFactory() {
    }

    @Override // javax.inject.Provider
    public HistoryDetailResolver get() {
        return provide();
    }

    @JvmStatic
    public static final I18nWireHistoryDetailResolver_HammerModule_ProvideFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final HistoryDetailResolver provide() {
        Object objCheckNotNull = Preconditions.checkNotNull(I18nWireHistoryDetailResolver_HammerModule.INSTANCE.provide(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (HistoryDetailResolver) objCheckNotNull;
    }
}
