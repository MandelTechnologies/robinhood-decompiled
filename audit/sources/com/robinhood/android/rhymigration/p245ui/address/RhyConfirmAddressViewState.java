package com.robinhood.android.rhymigration.p245ui.address;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.models.p355ui.identi.ShippingAddress;
import com.robinhood.models.p355ui.identi.UiAddress;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyConfirmAddressViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/address/RhyConfirmAddressViewState;", "", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/UiAddress;", "shippingAddress", "Lcom/robinhood/models/ui/identi/ShippingAddress;", "isSubmittingShippingAddress", "", "shippingAddressError", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/models/ui/identi/UiAddress;Lcom/robinhood/models/ui/identi/ShippingAddress;ZLcom/robinhood/udf/UiEvent;)V", "getAddress", "()Lcom/robinhood/models/ui/identi/UiAddress;", "getShippingAddress", "()Lcom/robinhood/models/ui/identi/ShippingAddress;", "()Z", "getShippingAddressError", "()Lcom/robinhood/udf/UiEvent;", "isLoading", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhyConfirmAddressViewState {
    public static final int $stable = 8;
    private final UiAddress address;
    private final boolean isLoading;
    private final boolean isSubmittingShippingAddress;
    private final ShippingAddress shippingAddress;
    private final UiEvent<Throwable> shippingAddressError;

    public RhyConfirmAddressViewState() {
        this(null, null, false, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RhyConfirmAddressViewState copy$default(RhyConfirmAddressViewState rhyConfirmAddressViewState, UiAddress uiAddress, ShippingAddress shippingAddress, boolean z, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            uiAddress = rhyConfirmAddressViewState.address;
        }
        if ((i & 2) != 0) {
            shippingAddress = rhyConfirmAddressViewState.shippingAddress;
        }
        if ((i & 4) != 0) {
            z = rhyConfirmAddressViewState.isSubmittingShippingAddress;
        }
        if ((i & 8) != 0) {
            uiEvent = rhyConfirmAddressViewState.shippingAddressError;
        }
        return rhyConfirmAddressViewState.copy(uiAddress, shippingAddress, z, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final UiAddress getAddress() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final ShippingAddress getShippingAddress() {
        return this.shippingAddress;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSubmittingShippingAddress() {
        return this.isSubmittingShippingAddress;
    }

    public final UiEvent<Throwable> component4() {
        return this.shippingAddressError;
    }

    public final RhyConfirmAddressViewState copy(UiAddress address, ShippingAddress shippingAddress, boolean isSubmittingShippingAddress, UiEvent<Throwable> shippingAddressError) {
        return new RhyConfirmAddressViewState(address, shippingAddress, isSubmittingShippingAddress, shippingAddressError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyConfirmAddressViewState)) {
            return false;
        }
        RhyConfirmAddressViewState rhyConfirmAddressViewState = (RhyConfirmAddressViewState) other;
        return Intrinsics.areEqual(this.address, rhyConfirmAddressViewState.address) && Intrinsics.areEqual(this.shippingAddress, rhyConfirmAddressViewState.shippingAddress) && this.isSubmittingShippingAddress == rhyConfirmAddressViewState.isSubmittingShippingAddress && Intrinsics.areEqual(this.shippingAddressError, rhyConfirmAddressViewState.shippingAddressError);
    }

    public int hashCode() {
        UiAddress uiAddress = this.address;
        int iHashCode = (uiAddress == null ? 0 : uiAddress.hashCode()) * 31;
        ShippingAddress shippingAddress = this.shippingAddress;
        int iHashCode2 = (((iHashCode + (shippingAddress == null ? 0 : shippingAddress.hashCode())) * 31) + Boolean.hashCode(this.isSubmittingShippingAddress)) * 31;
        UiEvent<Throwable> uiEvent = this.shippingAddressError;
        return iHashCode2 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "RhyConfirmAddressViewState(address=" + this.address + ", shippingAddress=" + this.shippingAddress + ", isSubmittingShippingAddress=" + this.isSubmittingShippingAddress + ", shippingAddressError=" + this.shippingAddressError + ")";
    }

    public RhyConfirmAddressViewState(UiAddress uiAddress, ShippingAddress shippingAddress, boolean z, UiEvent<Throwable> uiEvent) {
        this.address = uiAddress;
        this.shippingAddress = shippingAddress;
        this.isSubmittingShippingAddress = z;
        this.shippingAddressError = uiEvent;
        this.isLoading = uiAddress == null || z;
    }

    public /* synthetic */ RhyConfirmAddressViewState(UiAddress uiAddress, ShippingAddress shippingAddress, boolean z, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiAddress, (i & 2) != 0 ? null : shippingAddress, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : uiEvent);
    }

    public final UiAddress getAddress() {
        return this.address;
    }

    public final ShippingAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public final boolean isSubmittingShippingAddress() {
        return this.isSubmittingShippingAddress;
    }

    public final UiEvent<Throwable> getShippingAddressError() {
        return this.shippingAddressError;
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }
}
