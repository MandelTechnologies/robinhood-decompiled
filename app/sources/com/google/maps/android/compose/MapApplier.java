package com.google.maps.android.compose;

import androidx.compose.runtime.Applier2;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MapApplier.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\r\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J \u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0014J\u0018\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017H\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, m3636d2 = {"Lcom/google/maps/android/compose/MapApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Lcom/google/maps/android/compose/MapNode;", "map", "Lcom/google/android/gms/maps/GoogleMap;", "mapView", "Lcom/google/android/gms/maps/MapView;", "mapClickListeners", "Lcom/google/maps/android/compose/MapClickListeners;", "(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/MapView;Lcom/google/maps/android/compose/MapClickListeners;)V", "decorations", "", "getMap", "()Lcom/google/android/gms/maps/GoogleMap;", "getMapClickListeners", "()Lcom/google/maps/android/compose/MapClickListeners;", "getMapView$maps_compose_release", "()Lcom/google/android/gms/maps/MapView;", "attachClickListeners", "", "attachClickListeners$maps_compose_release", "insertBottomUp", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "instance", "insertTopDown", "move", "from", "to", "count", "onClear", "remove", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class MapApplier extends Applier2<MapApplier7> {
    private final List<MapApplier7> decorations;
    private final GoogleMap map;
    private final MapClickListeners mapClickListeners;
    private final MapView mapView;

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int index, MapApplier7 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    public final GoogleMap getMap() {
        return this.map;
    }

    /* renamed from: getMapView$maps_compose_release, reason: from getter */
    public final MapView getMapView() {
        return this.mapView;
    }

    public final MapClickListeners getMapClickListeners() {
        return this.mapClickListeners;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapApplier(GoogleMap map, MapView mapView, MapClickListeners mapClickListeners) {
        super(MapApplier8.INSTANCE);
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(mapClickListeners, "mapClickListeners");
        this.map = map;
        this.mapView = mapView;
        this.mapClickListeners = mapClickListeners;
        this.decorations = new ArrayList();
        attachClickListeners$maps_compose_release();
    }

    @Override // androidx.compose.runtime.Applier2
    protected void onClear() {
        this.map.clear();
        Iterator<T> it = this.decorations.iterator();
        while (it.hasNext()) {
            ((MapApplier7) it.next()).onCleared();
        }
        this.decorations.clear();
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int index, MapApplier7 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.decorations.add(index, instance);
        instance.onAttached();
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int from, int to, int count) {
        move(this.decorations, from, to, count);
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int index, int count) {
        for (int i = 0; i < count; i++) {
            this.decorations.get(index + i).onRemoved();
        }
        remove(this.decorations, index, count);
    }

    public final void attachClickListeners$maps_compose_release() {
        this.map.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() { // from class: com.google.maps.android.compose.MapApplier$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.maps.GoogleMap.OnCircleClickListener
            public final void onCircleClick(Circle circle) {
                MapApplier.attachClickListeners$lambda$5(this.f$0, circle);
            }
        });
        this.map.setOnGroundOverlayClickListener(new GoogleMap.OnGroundOverlayClickListener() { // from class: com.google.maps.android.compose.MapApplier$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener
            public final void onGroundOverlayClick(GroundOverlay groundOverlay) {
                MapApplier.attachClickListeners$lambda$9(this.f$0, groundOverlay);
            }
        });
        this.map.setOnPolygonClickListener(new GoogleMap.OnPolygonClickListener() { // from class: com.google.maps.android.compose.MapApplier$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
            public final void onPolygonClick(Polygon polygon) {
                MapApplier.attachClickListeners$lambda$13(this.f$0, polygon);
            }
        });
        this.map.setOnPolylineClickListener(new GoogleMap.OnPolylineClickListener() { // from class: com.google.maps.android.compose.MapApplier$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
            public final void onPolylineClick(Polyline polyline) {
                MapApplier.attachClickListeners$lambda$17(this.f$0, polyline);
            }
        });
        this.map.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() { // from class: com.google.maps.android.compose.MapApplier$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public final boolean onMarkerClick(Marker marker) {
                return MapApplier.attachClickListeners$lambda$21(this.f$0, marker);
            }
        });
        this.map.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() { // from class: com.google.maps.android.compose.MapApplier$$ExternalSyntheticLambda5
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
            public final void onInfoWindowClick(Marker marker) {
                MapApplier.attachClickListeners$lambda$25(this.f$0, marker);
            }
        });
        this.map.setOnInfoWindowCloseListener(new GoogleMap.OnInfoWindowCloseListener() { // from class: com.google.maps.android.compose.MapApplier$$ExternalSyntheticLambda6
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener
            public final void onInfoWindowClose(Marker marker) {
                MapApplier.attachClickListeners$lambda$29(this.f$0, marker);
            }
        });
        this.map.setOnInfoWindowLongClickListener(new GoogleMap.OnInfoWindowLongClickListener() { // from class: com.google.maps.android.compose.MapApplier$$ExternalSyntheticLambda7
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
            public final void onInfoWindowLongClick(Marker marker) {
                MapApplier.attachClickListeners$lambda$33(this.f$0, marker);
            }
        });
        this.map.setOnMarkerDragListener(new GoogleMap.OnMarkerDragListener() { // from class: com.google.maps.android.compose.MapApplier$attachClickListeners$9
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
            public void onMarkerDragStart(Marker marker) {
                Intrinsics.checkNotNullParameter(marker, "marker");
                for (MapApplier7 mapApplier7 : this.this$0.decorations) {
                    if (mapApplier7 instanceof MarkerNode) {
                        final MarkerNode markerNode = (MarkerNode) mapApplier7;
                        if (Intrinsics.areEqual(markerNode.getMarker(), marker)) {
                            if (Intrinsics.areEqual(new Function1<Marker, Unit>() { // from class: com.google.maps.android.compose.MapApplier$attachClickListeners$9$onMarkerDragStart$2$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Marker marker2) {
                                    invoke2(marker2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Marker it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    LatLng position = it.getPosition();
                                    Intrinsics.checkNotNullExpressionValue(position, "getPosition(...)");
                                    markerNode.getMarkerState().setDragging$maps_compose_release(true);
                                    markerNode.getMarkerState().setPosition(position);
                                    markerNode.getMarkerState().setDragState$maps_compose_release(DragState.START);
                                }
                            }.invoke(marker), Boolean.TRUE)) {
                                return;
                            }
                        }
                    }
                    if (mapApplier7 instanceof InputHandler) {
                        Function1<Marker, Unit> onMarkerDragStart = ((InputHandler) mapApplier7).getOnMarkerDragStart();
                        if (onMarkerDragStart != null ? Intrinsics.areEqual(onMarkerDragStart.invoke(marker), Boolean.TRUE) : false) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
            public void onMarkerDrag(Marker marker) {
                Intrinsics.checkNotNullParameter(marker, "marker");
                for (MapApplier7 mapApplier7 : this.this$0.decorations) {
                    if (mapApplier7 instanceof MarkerNode) {
                        final MarkerNode markerNode = (MarkerNode) mapApplier7;
                        if (Intrinsics.areEqual(markerNode.getMarker(), marker)) {
                            if (Intrinsics.areEqual(new Function1<Marker, Unit>() { // from class: com.google.maps.android.compose.MapApplier$attachClickListeners$9$onMarkerDrag$2$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Marker marker2) {
                                    invoke2(marker2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Marker it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    LatLng position = it.getPosition();
                                    Intrinsics.checkNotNullExpressionValue(position, "getPosition(...)");
                                    markerNode.getMarkerState().setDragging$maps_compose_release(true);
                                    markerNode.getMarkerState().setPosition(position);
                                    markerNode.getMarkerState().setDragState$maps_compose_release(DragState.DRAG);
                                }
                            }.invoke(marker), Boolean.TRUE)) {
                                return;
                            }
                        }
                    }
                    if (mapApplier7 instanceof InputHandler) {
                        Function1<Marker, Unit> onMarkerDrag = ((InputHandler) mapApplier7).getOnMarkerDrag();
                        if (onMarkerDrag != null ? Intrinsics.areEqual(onMarkerDrag.invoke(marker), Boolean.TRUE) : false) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }

            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
            public void onMarkerDragEnd(Marker marker) {
                Intrinsics.checkNotNullParameter(marker, "marker");
                for (MapApplier7 mapApplier7 : this.this$0.decorations) {
                    if (mapApplier7 instanceof MarkerNode) {
                        final MarkerNode markerNode = (MarkerNode) mapApplier7;
                        if (Intrinsics.areEqual(markerNode.getMarker(), marker)) {
                            if (Intrinsics.areEqual(new Function1<Marker, Unit>() { // from class: com.google.maps.android.compose.MapApplier$attachClickListeners$9$onMarkerDragEnd$2$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Marker marker2) {
                                    invoke2(marker2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Marker it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    LatLng position = it.getPosition();
                                    Intrinsics.checkNotNullExpressionValue(position, "getPosition(...)");
                                    markerNode.getMarkerState().setDragging$maps_compose_release(true);
                                    markerNode.getMarkerState().setPosition(position);
                                    markerNode.getMarkerState().setDragging$maps_compose_release(false);
                                    markerNode.getMarkerState().setDragState$maps_compose_release(DragState.END);
                                }
                            }.invoke(marker), Boolean.TRUE)) {
                                return;
                            }
                        }
                    }
                    if (mapApplier7 instanceof InputHandler) {
                        Function1<Marker, Unit> onMarkerDragEnd = ((InputHandler) mapApplier7).getOnMarkerDragEnd();
                        if (onMarkerDragEnd != null ? Intrinsics.areEqual(onMarkerDragEnd.invoke(marker), Boolean.TRUE) : false) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
        });
        this.map.setInfoWindowAdapter(new ComposeInfoWindowAdapter(this.mapView, new Function1<Marker, MarkerNode>() { // from class: com.google.maps.android.compose.MapApplier$attachClickListeners$10
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final MarkerNode invoke(Marker marker) {
                Object next;
                Intrinsics.checkNotNullParameter(marker, "marker");
                Iterator it = this.this$0.decorations.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    MapApplier7 mapApplier7 = (MapApplier7) next;
                    if ((mapApplier7 instanceof MarkerNode) && Intrinsics.areEqual(((MarkerNode) mapApplier7).getMarker(), marker)) {
                        break;
                    }
                }
                return (MarkerNode) next;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$5(MapApplier this$0, Circle circle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(circle, "circle");
        for (MapApplier7 mapApplier7 : this$0.decorations) {
            if (mapApplier7 instanceof Circle2) {
                Circle2 circle2 = (Circle2) mapApplier7;
                if (Intrinsics.areEqual(circle2.getCircle(), circle)) {
                    Function1<Circle, Unit> onCircleClick = circle2.getOnCircleClick();
                    if (onCircleClick != null ? Intrinsics.areEqual(onCircleClick.invoke(circle), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapApplier7 instanceof InputHandler) {
                Function1<Circle, Unit> onCircleClick2 = ((InputHandler) mapApplier7).getOnCircleClick();
                if (onCircleClick2 != null ? Intrinsics.areEqual(onCircleClick2.invoke(circle), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$9(MapApplier this$0, GroundOverlay groundOverlay) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(groundOverlay, "groundOverlay");
        for (MapApplier7 mapApplier7 : this$0.decorations) {
            if (mapApplier7 instanceof GroundOverlay2) {
                GroundOverlay2 groundOverlay2 = (GroundOverlay2) mapApplier7;
                if (Intrinsics.areEqual(groundOverlay2.getGroundOverlay(), groundOverlay)) {
                    Function1<GroundOverlay, Unit> onGroundOverlayClick = groundOverlay2.getOnGroundOverlayClick();
                    if (onGroundOverlayClick != null ? Intrinsics.areEqual(onGroundOverlayClick.invoke(groundOverlay), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapApplier7 instanceof InputHandler) {
                Function1<GroundOverlay, Unit> onGroundOverlayClick2 = ((InputHandler) mapApplier7).getOnGroundOverlayClick();
                if (onGroundOverlayClick2 != null ? Intrinsics.areEqual(onGroundOverlayClick2.invoke(groundOverlay), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$13(MapApplier this$0, Polygon polygon) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(polygon, "polygon");
        for (MapApplier7 mapApplier7 : this$0.decorations) {
            if (mapApplier7 instanceof Polygon2) {
                Polygon2 polygon2 = (Polygon2) mapApplier7;
                if (Intrinsics.areEqual(polygon2.getPolygon(), polygon)) {
                    Function1<Polygon, Unit> onPolygonClick = polygon2.getOnPolygonClick();
                    if (onPolygonClick != null ? Intrinsics.areEqual(onPolygonClick.invoke(polygon), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapApplier7 instanceof InputHandler) {
                Function1<Polygon, Unit> onPolygonClick2 = ((InputHandler) mapApplier7).getOnPolygonClick();
                if (onPolygonClick2 != null ? Intrinsics.areEqual(onPolygonClick2.invoke(polygon), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$17(MapApplier this$0, Polyline polyline) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(polyline, "polyline");
        for (MapApplier7 mapApplier7 : this$0.decorations) {
            if (mapApplier7 instanceof Polyline2) {
                Polyline2 polyline2 = (Polyline2) mapApplier7;
                if (Intrinsics.areEqual(polyline2.getPolyline(), polyline)) {
                    Function1<Polyline, Unit> onPolylineClick = polyline2.getOnPolylineClick();
                    if (onPolylineClick != null ? Intrinsics.areEqual(onPolylineClick.invoke(polyline), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapApplier7 instanceof InputHandler) {
                Function1<Polyline, Unit> onPolylineClick2 = ((InputHandler) mapApplier7).getOnPolylineClick();
                if (onPolylineClick2 != null ? Intrinsics.areEqual(onPolylineClick2.invoke(polyline), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachClickListeners$lambda$21(MapApplier this$0, Marker marker) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(marker, "marker");
        Iterator<T> it = this$0.decorations.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            MapApplier7 mapApplier7 = (MapApplier7) it.next();
            if (mapApplier7 instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapApplier7;
                if (Intrinsics.areEqual(markerNode.getMarker(), marker)) {
                    Function1<Marker, Boolean> onMarkerClick = markerNode.getOnMarkerClick();
                    if (onMarkerClick != null ? Intrinsics.areEqual(onMarkerClick.invoke(marker), Boolean.TRUE) : false) {
                        return true;
                    }
                }
            }
            if (mapApplier7 instanceof InputHandler) {
                Function1<Marker, Boolean> onMarkerClick2 = ((InputHandler) mapApplier7).getOnMarkerClick();
                if (onMarkerClick2 != null ? Intrinsics.areEqual(onMarkerClick2.invoke(marker), Boolean.TRUE) : false) {
                    return true;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$25(MapApplier this$0, Marker marker) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(marker, "marker");
        for (MapApplier7 mapApplier7 : this$0.decorations) {
            if (mapApplier7 instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapApplier7;
                if (Intrinsics.areEqual(markerNode.getMarker(), marker)) {
                    Function1<Marker, Unit> onInfoWindowClick = markerNode.getOnInfoWindowClick();
                    if (onInfoWindowClick != null ? Intrinsics.areEqual(onInfoWindowClick.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapApplier7 instanceof InputHandler) {
                Function1<Marker, Unit> onInfoWindowClick2 = ((InputHandler) mapApplier7).getOnInfoWindowClick();
                if (onInfoWindowClick2 != null ? Intrinsics.areEqual(onInfoWindowClick2.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$29(MapApplier this$0, Marker marker) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(marker, "marker");
        for (MapApplier7 mapApplier7 : this$0.decorations) {
            if (mapApplier7 instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapApplier7;
                if (Intrinsics.areEqual(markerNode.getMarker(), marker)) {
                    Function1<Marker, Unit> onInfoWindowClose = markerNode.getOnInfoWindowClose();
                    if (onInfoWindowClose != null ? Intrinsics.areEqual(onInfoWindowClose.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapApplier7 instanceof InputHandler) {
                Function1<Marker, Unit> onInfoWindowClose2 = ((InputHandler) mapApplier7).getOnInfoWindowClose();
                if (onInfoWindowClose2 != null ? Intrinsics.areEqual(onInfoWindowClose2.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachClickListeners$lambda$33(MapApplier this$0, Marker marker) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(marker, "marker");
        for (MapApplier7 mapApplier7 : this$0.decorations) {
            if (mapApplier7 instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapApplier7;
                if (Intrinsics.areEqual(markerNode.getMarker(), marker)) {
                    Function1<Marker, Unit> onInfoWindowLongClick = markerNode.getOnInfoWindowLongClick();
                    if (onInfoWindowLongClick != null ? Intrinsics.areEqual(onInfoWindowLongClick.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapApplier7 instanceof InputHandler) {
                Function1<Marker, Unit> onInfoWindowLongClick2 = ((InputHandler) mapApplier7).getOnInfoWindowLongClick();
                if (onInfoWindowLongClick2 != null ? Intrinsics.areEqual(onInfoWindowLongClick2.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }
}
