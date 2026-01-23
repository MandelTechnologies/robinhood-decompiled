package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.rosetta.eventlogging.CryptoWalletAssetBalanceDto;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoWalletAssetBalanceDto_MultibindingModule_ProvideIntoMapFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto_MultibindingModule_ProvideIntoMapFactory;", "Ldagger/internal/Factory;", "", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideIntoMap", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.eventlogging.CryptoWalletAssetBalanceDto_MultibindingModule_ProvideIntoMapFactory */
/* loaded from: classes26.dex */
public final class C36503xb0da23ee implements Factory<String> {
    public static final C36503xb0da23ee INSTANCE = new C36503xb0da23ee();

    private C36503xb0da23ee() {
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideIntoMap();
    }

    @JvmStatic
    public static final C36503xb0da23ee create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final String provideIntoMap() {
        Object objCheckNotNull = Preconditions.checkNotNull(CryptoWalletAssetBalanceDto.MultibindingModule.INSTANCE.provideIntoMap(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (String) objCheckNotNull;
    }
}
