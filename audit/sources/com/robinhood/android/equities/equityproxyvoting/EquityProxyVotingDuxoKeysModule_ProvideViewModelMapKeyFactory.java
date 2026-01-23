package com.robinhood.android.equities.equityproxyvoting;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityProxyVotingDuxoKeysModule_ProvideViewModelMapKeyFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equities/equityproxyvoting/EquityProxyVotingDuxoKeysModule_ProvideViewModelMapKeyFactory;", "Ldagger/internal/Factory;", "", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideViewModelMapKey", "lib-equity-proxy-voting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityProxyVotingDuxoKeysModule_ProvideViewModelMapKeyFactory implements Factory<String> {
    public static final int $stable = 0;
    public static final EquityProxyVotingDuxoKeysModule_ProvideViewModelMapKeyFactory INSTANCE = new EquityProxyVotingDuxoKeysModule_ProvideViewModelMapKeyFactory();

    private EquityProxyVotingDuxoKeysModule_ProvideViewModelMapKeyFactory() {
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideViewModelMapKey();
    }

    @JvmStatic
    public static final EquityProxyVotingDuxoKeysModule_ProvideViewModelMapKeyFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final String provideViewModelMapKey() {
        Object objCheckNotNull = Preconditions.checkNotNull(EquityProxyVotingDuxo_Hammer2.INSTANCE.provideViewModelMapKey(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (String) objCheckNotNull;
    }
}
