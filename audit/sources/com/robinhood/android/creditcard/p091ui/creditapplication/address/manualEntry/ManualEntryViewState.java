package com.robinhood.android.creditcard.p091ui.creditapplication.address.manualEntry;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ManualEntryDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/address/manualEntry/ManualEntryViewState;", "", "isLoading", "", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "<init>", "(ZLcom/robinhood/android/models/creditcard/api/graphql/AddressType;)V", "()Z", "getAddress", "()Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ManualEntryViewState {
    public static final int $stable = 8;
    private final AddressType address;
    private final boolean isLoading;

    /* JADX WARN: Multi-variable type inference failed */
    public ManualEntryViewState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ManualEntryViewState copy$default(ManualEntryViewState manualEntryViewState, boolean z, AddressType addressType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = manualEntryViewState.isLoading;
        }
        if ((i & 2) != 0) {
            addressType = manualEntryViewState.address;
        }
        return manualEntryViewState.copy(z, addressType);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final AddressType getAddress() {
        return this.address;
    }

    public final ManualEntryViewState copy(boolean isLoading, AddressType address) {
        return new ManualEntryViewState(isLoading, address);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManualEntryViewState)) {
            return false;
        }
        ManualEntryViewState manualEntryViewState = (ManualEntryViewState) other;
        return this.isLoading == manualEntryViewState.isLoading && Intrinsics.areEqual(this.address, manualEntryViewState.address);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        AddressType addressType = this.address;
        return iHashCode + (addressType == null ? 0 : addressType.hashCode());
    }

    public String toString() {
        return "ManualEntryViewState(isLoading=" + this.isLoading + ", address=" + this.address + ")";
    }

    public ManualEntryViewState(boolean z, AddressType addressType) {
        this.isLoading = z;
        this.address = addressType;
    }

    public /* synthetic */ ManualEntryViewState(boolean z, AddressType addressType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : addressType);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final AddressType getAddress() {
        return this.address;
    }
}
