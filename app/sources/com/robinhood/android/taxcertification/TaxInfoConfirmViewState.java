package com.robinhood.android.taxcertification;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.taxcertification.TaxInfoConfirmViewState3;
import com.robinhood.models.p355ui.identi.UiAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TaxInfoConfirmViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/taxcertification/TaxInfoConfirmViewState;", "", "ssnDisplayState", "Lcom/robinhood/android/taxcertification/SsnDisplayState;", "ssnAttemptState", "Lcom/robinhood/android/taxcertification/SsnAttemptState;", "fullName", "", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/UiAddress;", "<init>", "(Lcom/robinhood/android/taxcertification/SsnDisplayState;Lcom/robinhood/android/taxcertification/SsnAttemptState;Ljava/lang/String;Lcom/robinhood/models/ui/identi/UiAddress;)V", "getSsnDisplayState", "()Lcom/robinhood/android/taxcertification/SsnDisplayState;", "getSsnAttemptState", "()Lcom/robinhood/android/taxcertification/SsnAttemptState;", "getFullName", "()Ljava/lang/String;", "getAddress", "()Lcom/robinhood/models/ui/identi/UiAddress;", "loading", "", "getLoading", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-tax-certification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TaxInfoConfirmViewState {
    private final UiAddress address;
    private final String fullName;
    private final TaxInfoConfirmViewState2 ssnAttemptState;
    private final TaxInfoConfirmViewState3 ssnDisplayState;

    public TaxInfoConfirmViewState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TaxInfoConfirmViewState copy$default(TaxInfoConfirmViewState taxInfoConfirmViewState, TaxInfoConfirmViewState3 taxInfoConfirmViewState3, TaxInfoConfirmViewState2 taxInfoConfirmViewState2, String str, UiAddress uiAddress, int i, Object obj) {
        if ((i & 1) != 0) {
            taxInfoConfirmViewState3 = taxInfoConfirmViewState.ssnDisplayState;
        }
        if ((i & 2) != 0) {
            taxInfoConfirmViewState2 = taxInfoConfirmViewState.ssnAttemptState;
        }
        if ((i & 4) != 0) {
            str = taxInfoConfirmViewState.fullName;
        }
        if ((i & 8) != 0) {
            uiAddress = taxInfoConfirmViewState.address;
        }
        return taxInfoConfirmViewState.copy(taxInfoConfirmViewState3, taxInfoConfirmViewState2, str, uiAddress);
    }

    /* renamed from: component1, reason: from getter */
    public final TaxInfoConfirmViewState3 getSsnDisplayState() {
        return this.ssnDisplayState;
    }

    /* renamed from: component2, reason: from getter */
    public final TaxInfoConfirmViewState2 getSsnAttemptState() {
        return this.ssnAttemptState;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* renamed from: component4, reason: from getter */
    public final UiAddress getAddress() {
        return this.address;
    }

    public final TaxInfoConfirmViewState copy(TaxInfoConfirmViewState3 ssnDisplayState, TaxInfoConfirmViewState2 ssnAttemptState, String fullName, UiAddress address) {
        Intrinsics.checkNotNullParameter(ssnDisplayState, "ssnDisplayState");
        Intrinsics.checkNotNullParameter(ssnAttemptState, "ssnAttemptState");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        return new TaxInfoConfirmViewState(ssnDisplayState, ssnAttemptState, fullName, address);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxInfoConfirmViewState)) {
            return false;
        }
        TaxInfoConfirmViewState taxInfoConfirmViewState = (TaxInfoConfirmViewState) other;
        return Intrinsics.areEqual(this.ssnDisplayState, taxInfoConfirmViewState.ssnDisplayState) && this.ssnAttemptState == taxInfoConfirmViewState.ssnAttemptState && Intrinsics.areEqual(this.fullName, taxInfoConfirmViewState.fullName) && Intrinsics.areEqual(this.address, taxInfoConfirmViewState.address);
    }

    public int hashCode() {
        int iHashCode = ((((this.ssnDisplayState.hashCode() * 31) + this.ssnAttemptState.hashCode()) * 31) + this.fullName.hashCode()) * 31;
        UiAddress uiAddress = this.address;
        return iHashCode + (uiAddress == null ? 0 : uiAddress.hashCode());
    }

    public String toString() {
        return "TaxInfoConfirmViewState(ssnDisplayState=" + this.ssnDisplayState + ", ssnAttemptState=" + this.ssnAttemptState + ", fullName=" + this.fullName + ", address=" + this.address + ")";
    }

    public TaxInfoConfirmViewState(TaxInfoConfirmViewState3 ssnDisplayState, TaxInfoConfirmViewState2 ssnAttemptState, String fullName, UiAddress uiAddress) {
        Intrinsics.checkNotNullParameter(ssnDisplayState, "ssnDisplayState");
        Intrinsics.checkNotNullParameter(ssnAttemptState, "ssnAttemptState");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        this.ssnDisplayState = ssnDisplayState;
        this.ssnAttemptState = ssnAttemptState;
        this.fullName = fullName;
        this.address = uiAddress;
    }

    public /* synthetic */ TaxInfoConfirmViewState(TaxInfoConfirmViewState3 taxInfoConfirmViewState3, TaxInfoConfirmViewState2 taxInfoConfirmViewState2, String str, UiAddress uiAddress, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TaxInfoConfirmViewState3.Loading.INSTANCE : taxInfoConfirmViewState3, (i & 2) != 0 ? TaxInfoConfirmViewState2.LOADING : taxInfoConfirmViewState2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : uiAddress);
    }

    public final TaxInfoConfirmViewState3 getSsnDisplayState() {
        return this.ssnDisplayState;
    }

    public final TaxInfoConfirmViewState2 getSsnAttemptState() {
        return this.ssnAttemptState;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final UiAddress getAddress() {
        return this.address;
    }

    public final boolean getLoading() {
        return StringsKt.isBlank(this.fullName) && this.address == null && Intrinsics.areEqual(this.ssnDisplayState, TaxInfoConfirmViewState3.Loading.INSTANCE) && this.ssnAttemptState == TaxInfoConfirmViewState2.LOADING;
    }
}
