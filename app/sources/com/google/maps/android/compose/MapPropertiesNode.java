package com.google.maps.android.compose;

import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MapUpdater.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR.\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, m3636d2 = {"Lcom/google/maps/android/compose/MapPropertiesNode;", "Lcom/google/maps/android/compose/MapNode;", "Lcom/google/android/gms/maps/GoogleMap;", "map", "Lcom/google/maps/android/compose/CameraPositionState;", "cameraPositionState", "", "contentDescription", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/maps/android/compose/CameraPositionState;Ljava/lang/String;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)V", "", "onAttached", "()V", "onRemoved", "onCleared", "Lcom/google/android/gms/maps/GoogleMap;", "getMap", "()Lcom/google/android/gms/maps/GoogleMap;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "value", "Ljava/lang/String;", "getContentDescription", "()Ljava/lang/String;", "setContentDescription", "(Ljava/lang/String;)V", "Lcom/google/maps/android/compose/CameraPositionState;", "getCameraPositionState", "()Lcom/google/maps/android/compose/CameraPositionState;", "setCameraPositionState", "(Lcom/google/maps/android/compose/CameraPositionState;)V", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class MapPropertiesNode implements MapApplier7 {
    private CameraPositionState cameraPositionState;
    private String contentDescription;
    private Density density;
    private LayoutDirection layoutDirection;
    private final GoogleMap map;

    public MapPropertiesNode(GoogleMap map, CameraPositionState cameraPositionState, String str, Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(cameraPositionState, "cameraPositionState");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.map = map;
        this.density = density;
        this.layoutDirection = layoutDirection;
        cameraPositionState.setMap$maps_compose_release(map);
        if (str != null) {
            map.setContentDescription(str);
        }
        this.contentDescription = str;
        this.cameraPositionState = cameraPositionState;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final void setDensity(Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.density = density;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final void setLayoutDirection(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    public final void setContentDescription(String str) {
        this.contentDescription = str;
        this.map.setContentDescription(str);
    }

    public final void setCameraPositionState(CameraPositionState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(value, this.cameraPositionState)) {
            return;
        }
        this.cameraPositionState.setMap$maps_compose_release(null);
        this.cameraPositionState = value;
        value.setMap$maps_compose_release(this.map);
    }

    @Override // com.google.maps.android.compose.MapApplier7
    public void onAttached() {
        this.map.setOnCameraIdleListener(new GoogleMap.OnCameraIdleListener() { // from class: com.google.maps.android.compose.MapPropertiesNode$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
            public final void onCameraIdle() {
                MapPropertiesNode.onAttached$lambda$0(this.f$0);
            }
        });
        this.map.setOnCameraMoveCanceledListener(new GoogleMap.OnCameraMoveCanceledListener() { // from class: com.google.maps.android.compose.MapPropertiesNode$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener
            public final void onCameraMoveCanceled() {
                MapPropertiesNode.onAttached$lambda$1(this.f$0);
            }
        });
        this.map.setOnCameraMoveStartedListener(new GoogleMap.OnCameraMoveStartedListener() { // from class: com.google.maps.android.compose.MapPropertiesNode$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener
            public final void onCameraMoveStarted(int i) {
                MapPropertiesNode.onAttached$lambda$2(this.f$0, i);
            }
        });
        this.map.setOnCameraMoveListener(new GoogleMap.OnCameraMoveListener() { // from class: com.google.maps.android.compose.MapPropertiesNode$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
            public final void onCameraMove() {
                MapPropertiesNode.onAttached$lambda$3(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$0(MapPropertiesNode this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cameraPositionState.setMoving$maps_compose_release(false);
        CameraPositionState cameraPositionState = this$0.cameraPositionState;
        CameraPosition cameraPosition = this$0.map.getCameraPosition();
        Intrinsics.checkNotNullExpressionValue(cameraPosition, "getCameraPosition(...)");
        cameraPositionState.setRawPosition$maps_compose_release(cameraPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$1(MapPropertiesNode this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cameraPositionState.setMoving$maps_compose_release(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$2(MapPropertiesNode this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cameraPositionState.setCameraMoveStartedReason$maps_compose_release(CameraMoveStartedReason.INSTANCE.fromInt(i));
        this$0.cameraPositionState.setMoving$maps_compose_release(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttached$lambda$3(MapPropertiesNode this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CameraPositionState cameraPositionState = this$0.cameraPositionState;
        CameraPosition cameraPosition = this$0.map.getCameraPosition();
        Intrinsics.checkNotNullExpressionValue(cameraPosition, "getCameraPosition(...)");
        cameraPositionState.setRawPosition$maps_compose_release(cameraPosition);
    }

    @Override // com.google.maps.android.compose.MapApplier7
    public void onRemoved() {
        this.cameraPositionState.setMap$maps_compose_release(null);
    }

    @Override // com.google.maps.android.compose.MapApplier7
    public void onCleared() {
        this.cameraPositionState.setMap$maps_compose_release(null);
    }
}
