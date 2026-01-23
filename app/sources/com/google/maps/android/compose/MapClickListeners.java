package com.google.maps.android.compose;

import android.location.Location;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PointOfInterest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MapClickListeners.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tRG\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R;\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00152\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aRG\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R;\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00152\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u000b\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aRG\u0010&\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u000b\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013RG\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u000b\u001a\u0004\b,\u0010\u0011\"\u0004\b-\u0010\u0013¨\u0006/"}, m3636d2 = {"Lcom/google/maps/android/compose/MapClickListeners;", "", "()V", "<set-?>", "Lcom/google/maps/android/compose/IndoorStateChangeListener;", "indoorStateChangeListener", "getIndoorStateChangeListener", "()Lcom/google/maps/android/compose/IndoorStateChangeListener;", "setIndoorStateChangeListener", "(Lcom/google/maps/android/compose/IndoorStateChangeListener;)V", "indoorStateChangeListener$delegate", "Landroidx/compose/runtime/MutableState;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/LatLng;", "", "onMapClick", "getOnMapClick", "()Lkotlin/jvm/functions/Function1;", "setOnMapClick", "(Lkotlin/jvm/functions/Function1;)V", "onMapClick$delegate", "Lkotlin/Function0;", "onMapLoaded", "getOnMapLoaded", "()Lkotlin/jvm/functions/Function0;", "setOnMapLoaded", "(Lkotlin/jvm/functions/Function0;)V", "onMapLoaded$delegate", "onMapLongClick", "getOnMapLongClick", "setOnMapLongClick", "onMapLongClick$delegate", "", "onMyLocationButtonClick", "getOnMyLocationButtonClick", "setOnMyLocationButtonClick", "onMyLocationButtonClick$delegate", "Landroid/location/Location;", "onMyLocationClick", "getOnMyLocationClick", "setOnMyLocationClick", "onMyLocationClick$delegate", "Lcom/google/android/gms/maps/model/PointOfInterest;", "onPOIClick", "getOnPOIClick", "setOnPOIClick", "onPOIClick$delegate", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class MapClickListeners {

    /* renamed from: indoorStateChangeListener$delegate, reason: from kotlin metadata */
    private final SnapshotState indoorStateChangeListener = SnapshotState3.mutableStateOf$default(DefaultIndoorStateChangeListener.INSTANCE, null, 2, null);

    /* renamed from: onMapClick$delegate, reason: from kotlin metadata */
    private final SnapshotState onMapClick = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    /* renamed from: onMapLongClick$delegate, reason: from kotlin metadata */
    private final SnapshotState onMapLongClick = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    /* renamed from: onMapLoaded$delegate, reason: from kotlin metadata */
    private final SnapshotState onMapLoaded = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    /* renamed from: onMyLocationButtonClick$delegate, reason: from kotlin metadata */
    private final SnapshotState onMyLocationButtonClick = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    /* renamed from: onMyLocationClick$delegate, reason: from kotlin metadata */
    private final SnapshotState onMyLocationClick = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    /* renamed from: onPOIClick$delegate, reason: from kotlin metadata */
    private final SnapshotState onPOIClick = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    public final IndoorStateChangeListener getIndoorStateChangeListener() {
        return (IndoorStateChangeListener) this.indoorStateChangeListener.getValue();
    }

    public final void setIndoorStateChangeListener(IndoorStateChangeListener indoorStateChangeListener) {
        Intrinsics.checkNotNullParameter(indoorStateChangeListener, "<set-?>");
        this.indoorStateChangeListener.setValue(indoorStateChangeListener);
    }

    public final Function1<LatLng, Unit> getOnMapClick() {
        return (Function1) this.onMapClick.getValue();
    }

    public final void setOnMapClick(Function1<? super LatLng, Unit> function1) {
        this.onMapClick.setValue(function1);
    }

    public final Function1<LatLng, Unit> getOnMapLongClick() {
        return (Function1) this.onMapLongClick.getValue();
    }

    public final void setOnMapLongClick(Function1<? super LatLng, Unit> function1) {
        this.onMapLongClick.setValue(function1);
    }

    public final Function0<Unit> getOnMapLoaded() {
        return (Function0) this.onMapLoaded.getValue();
    }

    public final void setOnMapLoaded(Function0<Unit> function0) {
        this.onMapLoaded.setValue(function0);
    }

    public final Function0<Boolean> getOnMyLocationButtonClick() {
        return (Function0) this.onMyLocationButtonClick.getValue();
    }

    public final void setOnMyLocationButtonClick(Function0<Boolean> function0) {
        this.onMyLocationButtonClick.setValue(function0);
    }

    public final Function1<Location, Unit> getOnMyLocationClick() {
        return (Function1) this.onMyLocationClick.getValue();
    }

    public final void setOnMyLocationClick(Function1<? super Location, Unit> function1) {
        this.onMyLocationClick.setValue(function1);
    }

    public final Function1<PointOfInterest, Unit> getOnPOIClick() {
        return (Function1) this.onPOIClick.getValue();
    }

    public final void setOnPOIClick(Function1<? super PointOfInterest, Unit> function1) {
        this.onPOIClick.setValue(function1);
    }
}
