package com.robinhood.rosetta.mainst;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.rosetta.mainst.OrderMetadataDto;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderMetadataDto_MultibindingModule_ProvideIntoMapFactory.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderMetadataDto_MultibindingModule_ProvideIntoMapFactory;", "Ldagger/internal/Factory;", "", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideIntoMap", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class OrderMetadataDto_MultibindingModule_ProvideIntoMapFactory implements Factory<String> {
    public static final OrderMetadataDto_MultibindingModule_ProvideIntoMapFactory INSTANCE = new OrderMetadataDto_MultibindingModule_ProvideIntoMapFactory();

    private OrderMetadataDto_MultibindingModule_ProvideIntoMapFactory() {
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideIntoMap();
    }

    @JvmStatic
    public static final OrderMetadataDto_MultibindingModule_ProvideIntoMapFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final String provideIntoMap() {
        Object objCheckNotNull = Preconditions.checkNotNull(OrderMetadataDto.MultibindingModule.INSTANCE.provideIntoMap(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (String) objCheckNotNull;
    }
}
