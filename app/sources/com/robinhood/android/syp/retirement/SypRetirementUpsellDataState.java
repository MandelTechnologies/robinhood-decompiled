package com.robinhood.android.syp.retirement;

import com.robinhood.models.p320db.bonfire.SypRetirementUpsellDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: SypRetirementUpsellDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/syp/retirement/SypRetirementUpsellDataState;", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/models/db/bonfire/SypRetirementUpsellDetails;", "<init>", "(Lcom/robinhood/models/db/bonfire/SypRetirementUpsellDetails;)V", "getDetails", "()Lcom/robinhood/models/db/bonfire/SypRetirementUpsellDetails;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-rhy-syp-retirement-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SypRetirementUpsellDataState {
    public static final int $stable = 8;
    private final SypRetirementUpsellDetails details;

    /* JADX WARN: Multi-variable type inference failed */
    public SypRetirementUpsellDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SypRetirementUpsellDataState copy$default(SypRetirementUpsellDataState sypRetirementUpsellDataState, SypRetirementUpsellDetails sypRetirementUpsellDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            sypRetirementUpsellDetails = sypRetirementUpsellDataState.details;
        }
        return sypRetirementUpsellDataState.copy(sypRetirementUpsellDetails);
    }

    /* renamed from: component1, reason: from getter */
    public final SypRetirementUpsellDetails getDetails() {
        return this.details;
    }

    public final SypRetirementUpsellDataState copy(SypRetirementUpsellDetails details) {
        return new SypRetirementUpsellDataState(details);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SypRetirementUpsellDataState) && Intrinsics.areEqual(this.details, ((SypRetirementUpsellDataState) other).details);
    }

    public int hashCode() {
        SypRetirementUpsellDetails sypRetirementUpsellDetails = this.details;
        if (sypRetirementUpsellDetails == null) {
            return 0;
        }
        return sypRetirementUpsellDetails.hashCode();
    }

    public String toString() {
        return "SypRetirementUpsellDataState(details=" + this.details + ")";
    }

    public SypRetirementUpsellDataState(SypRetirementUpsellDetails sypRetirementUpsellDetails) {
        this.details = sypRetirementUpsellDetails;
    }

    public /* synthetic */ SypRetirementUpsellDataState(SypRetirementUpsellDetails sypRetirementUpsellDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sypRetirementUpsellDetails);
    }

    public final SypRetirementUpsellDetails getDetails() {
        return this.details;
    }
}
