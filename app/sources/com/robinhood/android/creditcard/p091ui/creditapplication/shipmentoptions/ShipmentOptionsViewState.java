package com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.ShipmentOption;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ShipmentOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JX\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsViewState;", "", "isLoading", "", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "lat", "", "long", "options", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;", "animate", "<init>", "(ZLcom/robinhood/android/models/creditcard/api/graphql/AddressType;Ljava/lang/Double;Ljava/lang/Double;Lkotlinx/collections/immutable/ImmutableList;Z)V", "()Z", "getAddress", "()Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "getLat", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLong", "getOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "getAnimate", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZLcom/robinhood/android/models/creditcard/api/graphql/AddressType;Ljava/lang/Double;Ljava/lang/Double;Lkotlinx/collections/immutable/ImmutableList;Z)Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsViewState;", "equals", "other", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ShipmentOptionsViewState {
    public static final int $stable = 8;
    private final AddressType address;
    private final boolean animate;
    private final boolean isLoading;
    private final Double lat;
    private final Double long;
    private final ImmutableList<ShipmentOption> options;

    public ShipmentOptionsViewState() {
        this(false, null, null, null, null, false, 63, null);
    }

    public static /* synthetic */ ShipmentOptionsViewState copy$default(ShipmentOptionsViewState shipmentOptionsViewState, boolean z, AddressType addressType, Double d, Double d2, ImmutableList immutableList, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = shipmentOptionsViewState.isLoading;
        }
        if ((i & 2) != 0) {
            addressType = shipmentOptionsViewState.address;
        }
        if ((i & 4) != 0) {
            d = shipmentOptionsViewState.lat;
        }
        if ((i & 8) != 0) {
            d2 = shipmentOptionsViewState.long;
        }
        if ((i & 16) != 0) {
            immutableList = shipmentOptionsViewState.options;
        }
        if ((i & 32) != 0) {
            z2 = shipmentOptionsViewState.animate;
        }
        ImmutableList immutableList2 = immutableList;
        boolean z3 = z2;
        return shipmentOptionsViewState.copy(z, addressType, d, d2, immutableList2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final AddressType getAddress() {
        return this.address;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getLat() {
        return this.lat;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getLong() {
        return this.long;
    }

    public final ImmutableList<ShipmentOption> component5() {
        return this.options;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAnimate() {
        return this.animate;
    }

    public final ShipmentOptionsViewState copy(boolean isLoading, AddressType address, Double lat, Double d, ImmutableList<ShipmentOption> options, boolean animate) {
        return new ShipmentOptionsViewState(isLoading, address, lat, d, options, animate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShipmentOptionsViewState)) {
            return false;
        }
        ShipmentOptionsViewState shipmentOptionsViewState = (ShipmentOptionsViewState) other;
        return this.isLoading == shipmentOptionsViewState.isLoading && Intrinsics.areEqual(this.address, shipmentOptionsViewState.address) && Intrinsics.areEqual((Object) this.lat, (Object) shipmentOptionsViewState.lat) && Intrinsics.areEqual((Object) this.long, (Object) shipmentOptionsViewState.long) && Intrinsics.areEqual(this.options, shipmentOptionsViewState.options) && this.animate == shipmentOptionsViewState.animate;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        AddressType addressType = this.address;
        int iHashCode2 = (iHashCode + (addressType == null ? 0 : addressType.hashCode())) * 31;
        Double d = this.lat;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.long;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        ImmutableList<ShipmentOption> immutableList = this.options;
        return ((iHashCode4 + (immutableList != null ? immutableList.hashCode() : 0)) * 31) + Boolean.hashCode(this.animate);
    }

    public String toString() {
        return "ShipmentOptionsViewState(isLoading=" + this.isLoading + ", address=" + this.address + ", lat=" + this.lat + ", long=" + this.long + ", options=" + this.options + ", animate=" + this.animate + ")";
    }

    public ShipmentOptionsViewState(boolean z, AddressType addressType, Double d, Double d2, ImmutableList<ShipmentOption> immutableList, boolean z2) {
        this.isLoading = z;
        this.address = addressType;
        this.lat = d;
        this.long = d2;
        this.options = immutableList;
        this.animate = z2;
    }

    public /* synthetic */ ShipmentOptionsViewState(boolean z, AddressType addressType, Double d, Double d2, ImmutableList immutableList, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : addressType, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : immutableList, (i & 32) != 0 ? false : z2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final AddressType getAddress() {
        return this.address;
    }

    public final Double getLat() {
        return this.lat;
    }

    public final Double getLong() {
        return this.long;
    }

    public final ImmutableList<ShipmentOption> getOptions() {
        return this.options;
    }

    public final boolean getAnimate() {
        return this.animate;
    }
}
