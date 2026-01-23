package com.google.maps.android.compose;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import com.google.maps.android.compose.MapApplier7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InputHandler.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b/\b\u0000\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016RG\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dRG\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dRG\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dRG\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dRG\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dRG\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dRG\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dRG\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0019\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dRG\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u0019\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dRG\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\u0019\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dRG\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010\u0019\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001d¨\u0006<"}, m3636d2 = {"Lcom/google/maps/android/compose/InputHandlerNode;", "Lcom/google/maps/android/compose/MapNode;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Circle;", "", "onCircleClick", "Lcom/google/android/gms/maps/model/GroundOverlay;", "onGroundOverlayClick", "Lcom/google/android/gms/maps/model/Polygon;", "onPolygonClick", "Lcom/google/android/gms/maps/model/Polyline;", "onPolylineClick", "Lcom/google/android/gms/maps/model/Marker;", "", "onMarkerClick", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "onMarkerDrag", "onMarkerDragEnd", "onMarkerDragStart", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "<set-?>", "onCircleClick$delegate", "Landroidx/compose/runtime/MutableState;", "getOnCircleClick", "()Lkotlin/jvm/functions/Function1;", "setOnCircleClick", "(Lkotlin/jvm/functions/Function1;)V", "onGroundOverlayClick$delegate", "getOnGroundOverlayClick", "setOnGroundOverlayClick", "onPolygonClick$delegate", "getOnPolygonClick", "setOnPolygonClick", "onPolylineClick$delegate", "getOnPolylineClick", "setOnPolylineClick", "onMarkerClick$delegate", "getOnMarkerClick", "setOnMarkerClick", "onInfoWindowClick$delegate", "getOnInfoWindowClick", "setOnInfoWindowClick", "onInfoWindowClose$delegate", "getOnInfoWindowClose", "setOnInfoWindowClose", "onInfoWindowLongClick$delegate", "getOnInfoWindowLongClick", "setOnInfoWindowLongClick", "onMarkerDrag$delegate", "getOnMarkerDrag", "setOnMarkerDrag", "onMarkerDragEnd$delegate", "getOnMarkerDragEnd", "setOnMarkerDragEnd", "onMarkerDragStart$delegate", "getOnMarkerDragStart", "setOnMarkerDragStart", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.google.maps.android.compose.InputHandlerNode, reason: use source file name */
/* loaded from: classes27.dex */
public final class InputHandler implements MapApplier7 {

    /* renamed from: onCircleClick$delegate, reason: from kotlin metadata */
    private final SnapshotState onCircleClick;

    /* renamed from: onGroundOverlayClick$delegate, reason: from kotlin metadata */
    private final SnapshotState onGroundOverlayClick;

    /* renamed from: onInfoWindowClick$delegate, reason: from kotlin metadata */
    private final SnapshotState onInfoWindowClick;

    /* renamed from: onInfoWindowClose$delegate, reason: from kotlin metadata */
    private final SnapshotState onInfoWindowClose;

    /* renamed from: onInfoWindowLongClick$delegate, reason: from kotlin metadata */
    private final SnapshotState onInfoWindowLongClick;

    /* renamed from: onMarkerClick$delegate, reason: from kotlin metadata */
    private final SnapshotState onMarkerClick;

    /* renamed from: onMarkerDrag$delegate, reason: from kotlin metadata */
    private final SnapshotState onMarkerDrag;

    /* renamed from: onMarkerDragEnd$delegate, reason: from kotlin metadata */
    private final SnapshotState onMarkerDragEnd;

    /* renamed from: onMarkerDragStart$delegate, reason: from kotlin metadata */
    private final SnapshotState onMarkerDragStart;

    /* renamed from: onPolygonClick$delegate, reason: from kotlin metadata */
    private final SnapshotState onPolygonClick;

    /* renamed from: onPolylineClick$delegate, reason: from kotlin metadata */
    private final SnapshotState onPolylineClick;

    public InputHandler() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public InputHandler(Function1<? super Circle, Unit> function1, Function1<? super GroundOverlay, Unit> function12, Function1<? super Polygon, Unit> function13, Function1<? super Polyline, Unit> function14, Function1<? super Marker, Boolean> function15, Function1<? super Marker, Unit> function16, Function1<? super Marker, Unit> function17, Function1<? super Marker, Unit> function18, Function1<? super Marker, Unit> function19, Function1<? super Marker, Unit> function110, Function1<? super Marker, Unit> function111) {
        this.onCircleClick = SnapshotState3.mutableStateOf$default(function1, null, 2, null);
        this.onGroundOverlayClick = SnapshotState3.mutableStateOf$default(function12, null, 2, null);
        this.onPolygonClick = SnapshotState3.mutableStateOf$default(function13, null, 2, null);
        this.onPolylineClick = SnapshotState3.mutableStateOf$default(function14, null, 2, null);
        this.onMarkerClick = SnapshotState3.mutableStateOf$default(function15, null, 2, null);
        this.onInfoWindowClick = SnapshotState3.mutableStateOf$default(function16, null, 2, null);
        this.onInfoWindowClose = SnapshotState3.mutableStateOf$default(function17, null, 2, null);
        this.onInfoWindowLongClick = SnapshotState3.mutableStateOf$default(function18, null, 2, null);
        this.onMarkerDrag = SnapshotState3.mutableStateOf$default(function19, null, 2, null);
        this.onMarkerDragEnd = SnapshotState3.mutableStateOf$default(function110, null, 2, null);
        this.onMarkerDragStart = SnapshotState3.mutableStateOf$default(function111, null, 2, null);
    }

    public /* synthetic */ InputHandler(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18, Function1 function19, Function1 function110, Function1 function111, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? null : function14, (i & 16) != 0 ? null : function15, (i & 32) != 0 ? null : function16, (i & 64) != 0 ? null : function17, (i & 128) != 0 ? null : function18, (i & 256) != 0 ? null : function19, (i & 512) != 0 ? null : function110, (i & 1024) != 0 ? null : function111);
    }

    @Override // com.google.maps.android.compose.MapApplier7
    public void onAttached() {
        MapApplier7.DefaultImpls.onAttached(this);
    }

    @Override // com.google.maps.android.compose.MapApplier7
    public void onCleared() {
        MapApplier7.DefaultImpls.onCleared(this);
    }

    @Override // com.google.maps.android.compose.MapApplier7
    public void onRemoved() {
        MapApplier7.DefaultImpls.onRemoved(this);
    }

    public final Function1<Circle, Unit> getOnCircleClick() {
        return (Function1) this.onCircleClick.getValue();
    }

    public final Function1<GroundOverlay, Unit> getOnGroundOverlayClick() {
        return (Function1) this.onGroundOverlayClick.getValue();
    }

    public final Function1<Polygon, Unit> getOnPolygonClick() {
        return (Function1) this.onPolygonClick.getValue();
    }

    public final Function1<Polyline, Unit> getOnPolylineClick() {
        return (Function1) this.onPolylineClick.getValue();
    }

    public final Function1<Marker, Boolean> getOnMarkerClick() {
        return (Function1) this.onMarkerClick.getValue();
    }

    public final Function1<Marker, Unit> getOnInfoWindowClick() {
        return (Function1) this.onInfoWindowClick.getValue();
    }

    public final Function1<Marker, Unit> getOnInfoWindowClose() {
        return (Function1) this.onInfoWindowClose.getValue();
    }

    public final Function1<Marker, Unit> getOnInfoWindowLongClick() {
        return (Function1) this.onInfoWindowLongClick.getValue();
    }

    public final Function1<Marker, Unit> getOnMarkerDrag() {
        return (Function1) this.onMarkerDrag.getValue();
    }

    public final Function1<Marker, Unit> getOnMarkerDragEnd() {
        return (Function1) this.onMarkerDragEnd.getValue();
    }

    public final Function1<Marker, Unit> getOnMarkerDragStart() {
        return (Function1) this.onMarkerDragStart.getValue();
    }
}
