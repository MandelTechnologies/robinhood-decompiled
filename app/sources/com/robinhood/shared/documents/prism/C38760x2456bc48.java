package com.robinhood.shared.documents.prism;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.experiments.ExperimentDeclaration;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrismDeviceAttestationVerificationExperiment_HammerModule_ProvideFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0002¢\u0006\u0002\b\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u000b\u0012\u0002\b\u00030\u0002¢\u0006\u0002\b\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0000H\u0007J\u0011\u0010\b\u001a\u000b\u0012\u0002\b\u00030\u0002¢\u0006\u0002\b\u0003H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/PrismDeviceAttestationVerificationExperiment_HammerModule_ProvideFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/experiments/ExperimentDeclaration;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provide", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.documents.prism.PrismDeviceAttestationVerificationExperiment_HammerModule_ProvideFactory */
/* loaded from: classes6.dex */
public final class C38760x2456bc48 implements Factory<ExperimentDeclaration<?>> {
    public static final int $stable = 0;
    public static final C38760x2456bc48 INSTANCE = new C38760x2456bc48();

    private C38760x2456bc48() {
    }

    @Override // javax.inject.Provider
    public ExperimentDeclaration<?> get() {
        return provide();
    }

    @JvmStatic
    public static final C38760x2456bc48 create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final ExperimentDeclaration<?> provide() {
        Object objCheckNotNull = Preconditions.checkNotNull(PrismDeviceAttestationVerificationExperiment_HammerModule.INSTANCE.provide(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (ExperimentDeclaration) objCheckNotNull;
    }
}
