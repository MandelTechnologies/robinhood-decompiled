package com.google.maps.android.compose;

import com.google.android.gms.maps.model.IndoorBuilding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MapClickListeners.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m3636d2 = {"Lcom/google/maps/android/compose/IndoorStateChangeListener;", "", "onIndoorBuildingFocused", "", "onIndoorLevelActivated", "building", "Lcom/google/android/gms/maps/model/IndoorBuilding;", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public interface IndoorStateChangeListener {

    /* compiled from: MapClickListeners.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void onIndoorBuildingFocused(IndoorStateChangeListener indoorStateChangeListener) {
        }

        public static void onIndoorLevelActivated(IndoorStateChangeListener indoorStateChangeListener, IndoorBuilding building) {
            Intrinsics.checkNotNullParameter(building, "building");
        }
    }

    void onIndoorBuildingFocused();

    void onIndoorLevelActivated(IndoorBuilding building);
}
