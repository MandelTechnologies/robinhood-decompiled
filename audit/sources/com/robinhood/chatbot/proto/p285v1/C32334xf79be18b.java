package com.robinhood.chatbot.proto.p285v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.chatbot.proto.p285v1.CreateSimpleCashAdjustmentEventRequestDto;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateSimpleCashAdjustmentEventRequestDto_MultibindingModule_ProvideIntoMapFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/CreateSimpleCashAdjustmentEventRequestDto_MultibindingModule_ProvideIntoMapFactory;", "Ldagger/internal/Factory;", "", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideIntoMap", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.chatbot.proto.v1.CreateSimpleCashAdjustmentEventRequestDto_MultibindingModule_ProvideIntoMapFactory */
/* loaded from: classes15.dex */
public final class C32334xf79be18b implements Factory<String> {
    public static final C32334xf79be18b INSTANCE = new C32334xf79be18b();

    private C32334xf79be18b() {
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideIntoMap();
    }

    @JvmStatic
    public static final C32334xf79be18b create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final String provideIntoMap() {
        Object objCheckNotNull = Preconditions.checkNotNull(CreateSimpleCashAdjustmentEventRequestDto.MultibindingModule.INSTANCE.provideIntoMap(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (String) objCheckNotNull;
    }
}
