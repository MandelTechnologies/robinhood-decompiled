package com.robinhood.android.regiongate.experiment;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.experiments.ExperimentDeclaration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: I18nSingaporeEnabled_HammerModule_ProvideFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0002¢\u0006\u0002\b\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u000b\u0012\u0002\b\u00030\u0002¢\u0006\u0002\b\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0000H\u0007J\u0011\u0010\b\u001a\u000b\u0012\u0002\b\u00030\u0002¢\u0006\u0002\b\u0003H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/regiongate/experiment/I18nSingaporeEnabled_HammerModule_ProvideFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/experiments/ExperimentDeclaration;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provide", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class I18nSingaporeEnabled_HammerModule_ProvideFactory implements Factory<ExperimentDeclaration<?>> {
    public static final I18nSingaporeEnabled_HammerModule_ProvideFactory INSTANCE = new I18nSingaporeEnabled_HammerModule_ProvideFactory();

    private I18nSingaporeEnabled_HammerModule_ProvideFactory() {
    }

    @Override // javax.inject.Provider
    public ExperimentDeclaration<?> get() {
        return provide();
    }

    @JvmStatic
    public static final I18nSingaporeEnabled_HammerModule_ProvideFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final ExperimentDeclaration<?> provide() {
        Object objCheckNotNull = Preconditions.checkNotNull(I18nSingaporeEnabled_HammerModule.INSTANCE.provide(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (ExperimentDeclaration) objCheckNotNull;
    }
}
