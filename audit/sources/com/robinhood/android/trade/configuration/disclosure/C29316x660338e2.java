package com.robinhood.android.trade.configuration.disclosure;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderConfigurationDisclosureDuxoKeysModule_ProvideViewModelMapKeyFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/disclosure/OrderConfigurationDisclosureDuxoKeysModule_ProvideViewModelMapKeyFactory;", "Ldagger/internal/Factory;", "", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideViewModelMapKey", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.configuration.disclosure.OrderConfigurationDisclosureDuxoKeysModule_ProvideViewModelMapKeyFactory */
/* loaded from: classes20.dex */
public final class C29316x660338e2 implements Factory<String> {
    public static final int $stable = 0;
    public static final C29316x660338e2 INSTANCE = new C29316x660338e2();

    private C29316x660338e2() {
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideViewModelMapKey();
    }

    @JvmStatic
    public static final C29316x660338e2 create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final String provideViewModelMapKey() {
        Object objCheckNotNull = Preconditions.checkNotNull(OrderConfigurationDisclosureDuxo_Hammer2.INSTANCE.provideViewModelMapKey(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (String) objCheckNotNull;
    }
}
