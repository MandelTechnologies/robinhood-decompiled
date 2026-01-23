package com.robinhood.android.odyssey.lib.template.address;

import android.location.Location;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.robinhood.android.address.lib.p061ui.AddressViewType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdAddressTypeAheadViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÂ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÂ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/address/SdAddressTypeAheadViewState;", "", "predictions", "", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "isLoading", "", "isInInitialState", "location", "Landroid/location/Location;", "<init>", "(Ljava/util/List;ZZLandroid/location/Location;)V", "()Z", "getLocation", "()Landroid/location/Location;", "showProgressBar", "getShowProgressBar", "viewTypes", "Lcom/robinhood/android/address/lib/ui/AddressViewType;", "getViewTypes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class SdAddressTypeAheadViewState {
    public static final int $stable = 8;
    private final boolean isInInitialState;
    private final boolean isLoading;
    private final Location location;
    private final List<AutocompletePrediction> predictions;
    private final boolean showProgressBar;

    public SdAddressTypeAheadViewState() {
        this(null, false, false, null, 15, null);
    }

    private final List<AutocompletePrediction> component1() {
        return this.predictions;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SdAddressTypeAheadViewState copy$default(SdAddressTypeAheadViewState sdAddressTypeAheadViewState, List list, boolean z, boolean z2, Location location, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sdAddressTypeAheadViewState.predictions;
        }
        if ((i & 2) != 0) {
            z = sdAddressTypeAheadViewState.isLoading;
        }
        if ((i & 4) != 0) {
            z2 = sdAddressTypeAheadViewState.isInInitialState;
        }
        if ((i & 8) != 0) {
            location = sdAddressTypeAheadViewState.location;
        }
        return sdAddressTypeAheadViewState.copy(list, z, z2, location);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsInInitialState() {
        return this.isInInitialState;
    }

    /* renamed from: component4, reason: from getter */
    public final Location getLocation() {
        return this.location;
    }

    public final SdAddressTypeAheadViewState copy(List<? extends AutocompletePrediction> predictions, boolean isLoading, boolean isInInitialState, Location location) {
        Intrinsics.checkNotNullParameter(predictions, "predictions");
        return new SdAddressTypeAheadViewState(predictions, isLoading, isInInitialState, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdAddressTypeAheadViewState)) {
            return false;
        }
        SdAddressTypeAheadViewState sdAddressTypeAheadViewState = (SdAddressTypeAheadViewState) other;
        return Intrinsics.areEqual(this.predictions, sdAddressTypeAheadViewState.predictions) && this.isLoading == sdAddressTypeAheadViewState.isLoading && this.isInInitialState == sdAddressTypeAheadViewState.isInInitialState && Intrinsics.areEqual(this.location, sdAddressTypeAheadViewState.location);
    }

    public int hashCode() {
        int iHashCode = ((((this.predictions.hashCode() * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isInInitialState)) * 31;
        Location location = this.location;
        return iHashCode + (location == null ? 0 : location.hashCode());
    }

    public String toString() {
        return "SdAddressTypeAheadViewState(predictions=" + this.predictions + ", isLoading=" + this.isLoading + ", isInInitialState=" + this.isInInitialState + ", location=" + this.location + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SdAddressTypeAheadViewState(List<? extends AutocompletePrediction> predictions, boolean z, boolean z2, Location location) {
        Intrinsics.checkNotNullParameter(predictions, "predictions");
        this.predictions = predictions;
        this.isLoading = z;
        this.isInInitialState = z2;
        this.location = location;
        this.showProgressBar = z && predictions.isEmpty();
    }

    public /* synthetic */ SdAddressTypeAheadViewState(List list, boolean z, boolean z2, Location location, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? null : location);
    }

    public final boolean isInInitialState() {
        return this.isInInitialState;
    }

    public final Location getLocation() {
        return this.location;
    }

    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    public final List<AddressViewType> getViewTypes() {
        if (this.isInInitialState) {
            return CollectionsKt.emptyList();
        }
        List<AutocompletePrediction> list = this.predictions;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new AddressViewType.Prediction((AutocompletePrediction) it.next()));
        }
        return CollectionsKt.plus((Collection<? extends AddressViewType.ManualInput>) arrayList, AddressViewType.ManualInput.INSTANCE);
    }
}
