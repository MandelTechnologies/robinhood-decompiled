package com.robinhood.android.directdeposit.p101ui.switcher.atomic;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.directdeposit.p101ui.switcher.atomic.TransactEvent;
import com.squareup.moshi.JsonAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactEvent_AdapterModule_ProvideAdapterFactoryFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent_AdapterModule_ProvideAdapterFactoryFactory;", "Ldagger/internal/Factory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideAdapterFactory", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class TransactEvent_AdapterModule_ProvideAdapterFactoryFactory implements Factory<JsonAdapter.Factory> {
    public static final int $stable = 0;
    public static final TransactEvent_AdapterModule_ProvideAdapterFactoryFactory INSTANCE = new TransactEvent_AdapterModule_ProvideAdapterFactoryFactory();

    private TransactEvent_AdapterModule_ProvideAdapterFactoryFactory() {
    }

    @Override // javax.inject.Provider
    public JsonAdapter.Factory get() {
        return provideAdapterFactory();
    }

    @JvmStatic
    public static final TransactEvent_AdapterModule_ProvideAdapterFactoryFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final JsonAdapter.Factory provideAdapterFactory() {
        Object objCheckNotNull = Preconditions.checkNotNull(TransactEvent.AdapterModule.INSTANCE.provideAdapterFactory(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (JsonAdapter.Factory) objCheckNotNull;
    }
}
