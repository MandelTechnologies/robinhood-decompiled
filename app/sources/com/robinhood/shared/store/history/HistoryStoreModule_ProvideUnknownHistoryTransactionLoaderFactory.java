package com.robinhood.shared.store.history;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.history.HistoryTransactionLoader;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryStoreModule_ProvideUnknownHistoryTransactionLoaderFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/store/history/HistoryStoreModule_ProvideUnknownHistoryTransactionLoaderFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideUnknownHistoryTransactionLoader", "lib-store-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class HistoryStoreModule_ProvideUnknownHistoryTransactionLoaderFactory implements Factory<HistoryTransactionLoader> {
    public static final HistoryStoreModule_ProvideUnknownHistoryTransactionLoaderFactory INSTANCE = new HistoryStoreModule_ProvideUnknownHistoryTransactionLoaderFactory();

    private HistoryStoreModule_ProvideUnknownHistoryTransactionLoaderFactory() {
    }

    @Override // javax.inject.Provider
    public HistoryTransactionLoader get() {
        return provideUnknownHistoryTransactionLoader();
    }

    @JvmStatic
    public static final HistoryStoreModule_ProvideUnknownHistoryTransactionLoaderFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final HistoryTransactionLoader provideUnknownHistoryTransactionLoader() {
        Object objCheckNotNull = Preconditions.checkNotNull(HistoryStoreModule.INSTANCE.provideUnknownHistoryTransactionLoader(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (HistoryTransactionLoader) objCheckNotNull;
    }
}
