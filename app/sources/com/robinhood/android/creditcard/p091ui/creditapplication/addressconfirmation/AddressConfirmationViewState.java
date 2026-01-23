package com.robinhood.android.creditcard.p091ui.creditapplication.addressconfirmation;

import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AddressConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/addressconfirmation/AddressConfirmationViewState;", "", "isLoading", "", "addresses", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "<init>", "(ZLkotlinx/collections/immutable/ImmutableList;)V", "()Z", "getAddresses", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AddressConfirmationViewState {
    public static final int $stable = 8;
    private final ImmutableList<AddressType> addresses;
    private final boolean isLoading;

    /* JADX WARN: Multi-variable type inference failed */
    public AddressConfirmationViewState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressConfirmationViewState copy$default(AddressConfirmationViewState addressConfirmationViewState, boolean z, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            z = addressConfirmationViewState.isLoading;
        }
        if ((i & 2) != 0) {
            immutableList = addressConfirmationViewState.addresses;
        }
        return addressConfirmationViewState.copy(z, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final ImmutableList<AddressType> component2() {
        return this.addresses;
    }

    public final AddressConfirmationViewState copy(boolean isLoading, ImmutableList<AddressType> addresses) {
        return new AddressConfirmationViewState(isLoading, addresses);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressConfirmationViewState)) {
            return false;
        }
        AddressConfirmationViewState addressConfirmationViewState = (AddressConfirmationViewState) other;
        return this.isLoading == addressConfirmationViewState.isLoading && Intrinsics.areEqual(this.addresses, addressConfirmationViewState.addresses);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        ImmutableList<AddressType> immutableList = this.addresses;
        return iHashCode + (immutableList == null ? 0 : immutableList.hashCode());
    }

    public String toString() {
        return "AddressConfirmationViewState(isLoading=" + this.isLoading + ", addresses=" + this.addresses + ")";
    }

    public AddressConfirmationViewState(boolean z, ImmutableList<AddressType> immutableList) {
        this.isLoading = z;
        this.addresses = immutableList;
    }

    public /* synthetic */ AddressConfirmationViewState(boolean z, ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : immutableList);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final ImmutableList<AddressType> getAddresses() {
        return this.addresses;
    }
}
