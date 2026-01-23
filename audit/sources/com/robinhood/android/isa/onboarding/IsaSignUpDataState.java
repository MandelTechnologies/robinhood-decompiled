package com.robinhood.android.isa.onboarding;

import com.robinhood.android.isa.models.isa.p163db.entity.IsaPromotion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaSignUpDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/isa/onboarding/IsaSignUpDataState;", "", "isCtaLoading", "", "promotion", "Lcom/robinhood/android/isa/models/isa/db/entity/IsaPromotion;", "<init>", "(ZLcom/robinhood/android/isa/models/isa/db/entity/IsaPromotion;)V", "()Z", "getPromotion", "()Lcom/robinhood/android/isa/models/isa/db/entity/IsaPromotion;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-isa-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IsaSignUpDataState {
    public static final int $stable = 8;
    private final boolean isCtaLoading;
    private final IsaPromotion promotion;

    /* JADX WARN: Multi-variable type inference failed */
    public IsaSignUpDataState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IsaSignUpDataState copy$default(IsaSignUpDataState isaSignUpDataState, boolean z, IsaPromotion isaPromotion, int i, Object obj) {
        if ((i & 1) != 0) {
            z = isaSignUpDataState.isCtaLoading;
        }
        if ((i & 2) != 0) {
            isaPromotion = isaSignUpDataState.promotion;
        }
        return isaSignUpDataState.copy(z, isaPromotion);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsCtaLoading() {
        return this.isCtaLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final IsaPromotion getPromotion() {
        return this.promotion;
    }

    public final IsaSignUpDataState copy(boolean isCtaLoading, IsaPromotion promotion) {
        return new IsaSignUpDataState(isCtaLoading, promotion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsaSignUpDataState)) {
            return false;
        }
        IsaSignUpDataState isaSignUpDataState = (IsaSignUpDataState) other;
        return this.isCtaLoading == isaSignUpDataState.isCtaLoading && Intrinsics.areEqual(this.promotion, isaSignUpDataState.promotion);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isCtaLoading) * 31;
        IsaPromotion isaPromotion = this.promotion;
        return iHashCode + (isaPromotion == null ? 0 : isaPromotion.hashCode());
    }

    public String toString() {
        return "IsaSignUpDataState(isCtaLoading=" + this.isCtaLoading + ", promotion=" + this.promotion + ")";
    }

    public IsaSignUpDataState(boolean z, IsaPromotion isaPromotion) {
        this.isCtaLoading = z;
        this.promotion = isaPromotion;
    }

    public /* synthetic */ IsaSignUpDataState(boolean z, IsaPromotion isaPromotion, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : isaPromotion);
    }

    public final boolean isCtaLoading() {
        return this.isCtaLoading;
    }

    public final IsaPromotion getPromotion() {
        return this.promotion;
    }
}
