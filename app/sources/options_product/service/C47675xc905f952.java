package options_product.service;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import options_product.service.UKL3EducationSpreadBenefitsResponseMetadataDto;

/* compiled from: UKL3EducationSpreadBenefitsResponseMetadataDto_MultibindingModule_ProvideIntoMapFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m3636d2 = {"Loptions_product/service/UKL3EducationSpreadBenefitsResponseMetadataDto_MultibindingModule_ProvideIntoMapFactory;", "Ldagger/internal/Factory;", "", "<init>", "()V", "provideIntoMap", "()Ljava/lang/String;", "get", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: options_product.service.UKL3EducationSpreadBenefitsResponseMetadataDto_MultibindingModule_ProvideIntoMapFactory */
/* loaded from: classes25.dex */
public final class C47675xc905f952 implements Factory<String> {
    public static final C47675xc905f952 INSTANCE = new C47675xc905f952();

    private C47675xc905f952() {
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideIntoMap();
    }

    @JvmStatic
    public static final String provideIntoMap() {
        Object objCheckNotNull = Preconditions.checkNotNull(UKL3EducationSpreadBenefitsResponseMetadataDto.MultibindingModule.INSTANCE.provideIntoMap(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (String) objCheckNotNull;
    }
}
