package microgram.contracts.mcw_cash_balances.proto.p497v1;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.mcw_cash_balances.proto.p497v1.GetCashBalancesDetailsPageFooterRequestDto;

/* compiled from: GetCashBalancesDetailsPageFooterRequestDto_MultibindingModule_ProvideIntoMapFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lmicrogram/contracts/mcw_cash_balances/proto/v1/GetCashBalancesDetailsPageFooterRequestDto_MultibindingModule_ProvideIntoMapFactory;", "Ldagger/internal/Factory;", "", "<init>", "()V", "provideIntoMap", "()Ljava/lang/String;", "get", "microgram.contracts.mcw_cash_balances.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.contracts.mcw_cash_balances.proto.v1.GetCashBalancesDetailsPageFooterRequestDto_MultibindingModule_ProvideIntoMapFactory */
/* loaded from: classes14.dex */
public final class C46672xe3c8512b implements Factory<String> {
    public static final C46672xe3c8512b INSTANCE = new C46672xe3c8512b();

    private C46672xe3c8512b() {
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideIntoMap();
    }

    @JvmStatic
    public static final String provideIntoMap() {
        Object objCheckNotNull = Preconditions.checkNotNull(GetCashBalancesDetailsPageFooterRequestDto.MultibindingModule.INSTANCE.provideIntoMap(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (String) objCheckNotNull;
    }
}
