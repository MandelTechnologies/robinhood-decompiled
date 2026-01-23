package com.google.maps.android.compose;

import android.location.Location;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PointOfInterest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty3;

/* compiled from: MapClickListeners.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0003H\u0003¢\u0006\u0002\u0010\u0007\u001aP\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\b*\u00020\u00042\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u001f\u0010\t\u001a\u001b\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u0001H\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u0002H\bH\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"MapClickListenerComposeNode", "", "callback", "Lkotlin/Function0;", "", "factory", "Lcom/google/maps/android/compose/MapClickListenerNode;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "L", "setter", "Lkotlin/Function2;", "Lcom/google/android/gms/maps/GoogleMap;", "Lkotlin/ExtensionFunctionType;", "listener", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "MapClickListenerUpdater", "(Landroidx/compose/runtime/Composer;I)V", "maps-compose_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class MapClickListenersKt {
    public static final void MapClickListenerUpdater(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1792062778);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1792062778, i, -1, "com.google.maps.android.compose.MapClickListenerUpdater (MapClickListeners.kt:88)");
            }
            Applier<?> applier = composerStartRestartGroup.getApplier();
            Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
            final MapClickListeners mapClickListeners = ((MapApplier) applier).getMapClickListeners();
            composerStartRestartGroup.startReplaceableGroup(-918933839);
            final MutablePropertyReference0Impl mutablePropertyReference0Impl = new MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$1
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((MapClickListeners) this.receiver).getIndoorStateChangeListener();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setIndoorStateChangeListener((IndoorStateChangeListener) obj);
                }
            };
            MapClickListenerComposeNode(mutablePropertyReference0Impl, MapClickListenersKt$MapClickListenerUpdater$1$2$1.INSTANCE, new GoogleMap.OnIndoorStateChangeListener() { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$2$2
                @Override // com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
                public void onIndoorBuildingFocused() {
                    mutablePropertyReference0Impl.invoke().onIndoorBuildingFocused();
                }

                @Override // com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
                public void onIndoorLevelActivated(IndoorBuilding building) {
                    Intrinsics.checkNotNullParameter(building, "building");
                    mutablePropertyReference0Impl.invoke().onIndoorLevelActivated(building);
                }
            }, composerStartRestartGroup, 8);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-918933301);
            final MutablePropertyReference0Impl mutablePropertyReference0Impl2 = new MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$3
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((MapClickListeners) this.receiver).getOnMapClick();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setOnMapClick((Function1) obj);
                }
            };
            MapClickListenerComposeNode(mutablePropertyReference0Impl2, MapClickListenersKt$MapClickListenerUpdater$1$4$1.INSTANCE, new GoogleMap.OnMapClickListener() { // from class: com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.maps.GoogleMap.OnMapClickListener
                public final void onMapClick(LatLng latLng) {
                    MapClickListenersKt.MapClickListenerUpdater$lambda$13$lambda$2$lambda$1(mutablePropertyReference0Impl2, latLng);
                }
            }, composerStartRestartGroup, 520);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-918933054);
            final MutablePropertyReference0Impl mutablePropertyReference0Impl3 = new MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$5
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((MapClickListeners) this.receiver).getOnMapLongClick();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setOnMapLongClick((Function1) obj);
                }
            };
            MapClickListenerComposeNode(mutablePropertyReference0Impl3, MapClickListenersKt$MapClickListenerUpdater$1$6$1.INSTANCE, new GoogleMap.OnMapLongClickListener() { // from class: com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.maps.GoogleMap.OnMapLongClickListener
                public final void onMapLongClick(LatLng latLng) {
                    MapClickListenersKt.MapClickListenerUpdater$lambda$13$lambda$4$lambda$3(mutablePropertyReference0Impl3, latLng);
                }
            }, composerStartRestartGroup, 520);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-918932802);
            final MutablePropertyReference0Impl mutablePropertyReference0Impl4 = new MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$7
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((MapClickListeners) this.receiver).getOnMapLoaded();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setOnMapLoaded((Function0) obj);
                }
            };
            MapClickListenerComposeNode(mutablePropertyReference0Impl4, MapClickListenersKt$MapClickListenerUpdater$1$8$1.INSTANCE, new GoogleMap.OnMapLoadedCallback() { // from class: com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
                public final void onMapLoaded() {
                    MapClickListenersKt.MapClickListenerUpdater$lambda$13$lambda$6$lambda$5(mutablePropertyReference0Impl4);
                }
            }, composerStartRestartGroup, 520);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-918932546);
            final MutablePropertyReference0Impl mutablePropertyReference0Impl5 = new MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$9
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((MapClickListeners) this.receiver).getOnMyLocationButtonClick();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setOnMyLocationButtonClick((Function0) obj);
                }
            };
            MapClickListenerComposeNode(mutablePropertyReference0Impl5, MapClickListenersKt$MapClickListenerUpdater$1$10$1.INSTANCE, new GoogleMap.OnMyLocationButtonClickListener() { // from class: com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda3
                @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener
                public final boolean onMyLocationButtonClick() {
                    return MapClickListenersKt.MapClickListenerUpdater$lambda$13$lambda$8$lambda$7(mutablePropertyReference0Impl5);
                }
            }, composerStartRestartGroup, 520);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-918932263);
            final MutablePropertyReference0Impl mutablePropertyReference0Impl6 = new MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$11
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((MapClickListeners) this.receiver).getOnMyLocationClick();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setOnMyLocationClick((Function1) obj);
                }
            };
            MapClickListenerComposeNode(mutablePropertyReference0Impl6, MapClickListenersKt$MapClickListenerUpdater$1$12$1.INSTANCE, new GoogleMap.OnMyLocationClickListener() { // from class: com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda4
                @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener
                public final void onMyLocationClick(Location location) {
                    MapClickListenersKt.MapClickListenerUpdater$lambda$13$lambda$10$lambda$9(mutablePropertyReference0Impl6, location);
                }
            }, composerStartRestartGroup, 520);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-918932006);
            final MutablePropertyReference0Impl mutablePropertyReference0Impl7 = new MutablePropertyReference0Impl(mapClickListeners) { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$13
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((MapClickListeners) this.receiver).getOnPOIClick();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((MapClickListeners) this.receiver).setOnPOIClick((Function1) obj);
                }
            };
            MapClickListenerComposeNode(mutablePropertyReference0Impl7, MapClickListenersKt$MapClickListenerUpdater$1$14$1.INSTANCE, new GoogleMap.OnPoiClickListener() { // from class: com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda5
                @Override // com.google.android.gms.maps.GoogleMap.OnPoiClickListener
                public final void onPoiClick(PointOfInterest pointOfInterest) {
                    MapClickListenersKt.MapClickListenerUpdater$lambda$13$lambda$12$lambda$11(mutablePropertyReference0Impl7, pointOfInterest);
                }
            }, composerStartRestartGroup, 520);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.maps.android.compose.MapClickListenersKt.MapClickListenerUpdater.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    MapClickListenersKt.MapClickListenerUpdater(composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$13$lambda$2$lambda$1(KProperty3 callback, LatLng it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        Function1 function1 = (Function1) callback.invoke();
        if (function1 != null) {
            function1.invoke(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$13$lambda$4$lambda$3(KProperty3 callback, LatLng it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        Function1 function1 = (Function1) callback.invoke();
        if (function1 != null) {
            function1.invoke(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$13$lambda$6$lambda$5(KProperty3 callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Function0 function0 = (Function0) callback.invoke();
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MapClickListenerUpdater$lambda$13$lambda$8$lambda$7(KProperty3 callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Function0 function0 = (Function0) callback.invoke();
        if (function0 != null) {
            return ((Boolean) function0.invoke()).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$13$lambda$10$lambda$9(KProperty3 callback, Location it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        Function1 function1 = (Function1) callback.invoke();
        if (function1 != null) {
            function1.invoke(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerUpdater$lambda$13$lambda$12$lambda$11(KProperty3 callback, PointOfInterest it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        Function1 function1 = (Function1) callback.invoke();
        if (function1 != null) {
            function1.invoke(it);
        }
    }

    private static final <L> void MapClickListenerComposeNode(Function0<? extends Object> function0, final Function2<? super GoogleMap, ? super L, Unit> function2, final L l, Composer composer, int i) {
        composer.startReplaceableGroup(-649632125);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-649632125, i, -1, "com.google.maps.android.compose.MapClickListenerComposeNode (MapClickListeners.kt:176)");
        }
        Applier<?> applier = composer.getApplier();
        Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
        final MapApplier mapApplier = (MapApplier) applier;
        MapClickListenerComposeNode(function0, new Function0<MapClickListenerNode<?>>() { // from class: com.google.maps.android.compose.MapClickListenersKt.MapClickListenerComposeNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final MapClickListenerNode<?> invoke() {
                return new MapClickListenerNode<>(mapApplier.getMap(), function2, l);
            }
        }, composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapClickListenerComposeNode(final Function0<? extends Object> function0, final Function0<? extends MapClickListenerNode<?>> function02, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1042600347);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1042600347, i2, -1, "com.google.maps.android.compose.MapClickListenerComposeNode (MapClickListeners.kt:187)");
            }
            if (function0.invoke() != null) {
                composerStartRestartGroup.startReplaceableGroup(1886828752);
                if (!(composerStartRestartGroup.getApplier() instanceof MapApplier)) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(new Function0<MapClickListenerNode<?>>() { // from class: com.google.maps.android.compose.MapClickListenersKt$MapClickListenerComposeNode$$inlined$ComposeNode$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.maps.android.compose.MapClickListenerNode<?>, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function0
                        public final MapClickListenerNode<?> invoke() {
                            return function02.invoke();
                        }
                    });
                } else {
                    composerStartRestartGroup.useNode();
                }
                Updater.m6388constructorimpl(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.maps.android.compose.MapClickListenersKt.MapClickListenerComposeNode.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    MapClickListenersKt.MapClickListenerComposeNode(function0, function02, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
