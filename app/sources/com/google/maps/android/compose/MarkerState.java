package com.google.maps.android.compose;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.Saver2;
import androidx.compose.runtime.saveable.Saver5;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Marker.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005R+\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\f8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R1\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00128F@@X\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u0013\u0010\b\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\bR(\u0010#\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, m3636d2 = {"Lcom/google/maps/android/compose/MarkerState;", "", "Lcom/google/android/gms/maps/model/LatLng;", "position", "<init>", "(Lcom/google/android/gms/maps/model/LatLng;)V", "<set-?>", "position$delegate", "Landroidx/compose/runtime/MutableState;", "getPosition", "()Lcom/google/android/gms/maps/model/LatLng;", "setPosition", "", "isDragging$delegate", "isDragging", "()Z", "setDragging$maps_compose_release", "(Z)V", "Lcom/google/maps/android/compose/DragState;", "dragState$delegate", "getDragState", "()Lcom/google/maps/android/compose/DragState;", "setDragState$maps_compose_release", "(Lcom/google/maps/android/compose/DragState;)V", "getDragState$annotations", "()V", "dragState", "Landroidx/compose/runtime/MutableState;", "Lcom/google/android/gms/maps/model/Marker;", "markerState", "value", "getMarker$maps_compose_release", "()Lcom/google/android/gms/maps/model/Marker;", "setMarker$maps_compose_release", "(Lcom/google/android/gms/maps/model/Marker;)V", "marker", "Companion", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class MarkerState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<MarkerState, LatLng> Saver = Saver2.Saver(new Function2<Saver5, MarkerState, LatLng>() { // from class: com.google.maps.android.compose.MarkerState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final LatLng invoke(Saver5 Saver2, MarkerState it) {
            Intrinsics.checkNotNullParameter(Saver2, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getPosition();
        }
    }, new Function1<LatLng, MarkerState>() { // from class: com.google.maps.android.compose.MarkerState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public final MarkerState invoke(LatLng it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new MarkerState(it);
        }
    });

    /* renamed from: dragState$delegate, reason: from kotlin metadata */
    private final SnapshotState dragState;

    /* renamed from: isDragging$delegate, reason: from kotlin metadata */
    private final SnapshotState isDragging;
    private final SnapshotState<Marker> markerState;

    /* renamed from: position$delegate, reason: from kotlin metadata */
    private final SnapshotState position;

    /* JADX WARN: Multi-variable type inference failed */
    public MarkerState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public MarkerState(LatLng position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.position = SnapshotState3.mutableStateOf$default(position, null, 2, null);
        this.isDragging = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.dragState = SnapshotState3.mutableStateOf$default(DragState.END, null, 2, null);
        this.markerState = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    public /* synthetic */ MarkerState(LatLng latLng, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LatLng(0.0d, 0.0d) : latLng);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LatLng getPosition() {
        return (LatLng) this.position.getValue();
    }

    public final void setPosition(LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "<set-?>");
        this.position.setValue(latLng);
    }

    public final void setDragging$maps_compose_release(boolean z) {
        this.isDragging.setValue(Boolean.valueOf(z));
    }

    public final void setDragState$maps_compose_release(DragState dragState) {
        Intrinsics.checkNotNullParameter(dragState, "<set-?>");
        this.dragState.setValue(dragState);
    }

    public final void setMarker$maps_compose_release(Marker marker) {
        if (this.markerState.getValue() == null && marker == null) {
            return;
        }
        if (this.markerState.getValue() != null && marker != null) {
            throw new IllegalStateException("MarkerState may only be associated with one Marker at a time.");
        }
        this.markerState.setValue(marker);
    }

    /* compiled from: Marker.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/google/maps/android/compose/MarkerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/google/maps/android/compose/MarkerState;", "Lcom/google/android/gms/maps/model/LatLng;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<MarkerState, LatLng> getSaver() {
            return MarkerState.Saver;
        }
    }
}
