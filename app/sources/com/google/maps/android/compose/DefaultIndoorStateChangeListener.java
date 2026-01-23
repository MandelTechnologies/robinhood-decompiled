package com.google.maps.android.compose;

import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.maps.android.compose.IndoorStateChangeListener;
import kotlin.Metadata;

/* compiled from: MapClickListeners.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/google/maps/android/compose/DefaultIndoorStateChangeListener;", "Lcom/google/maps/android/compose/IndoorStateChangeListener;", "()V", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class DefaultIndoorStateChangeListener implements IndoorStateChangeListener {
    public static final DefaultIndoorStateChangeListener INSTANCE = new DefaultIndoorStateChangeListener();

    private DefaultIndoorStateChangeListener() {
    }

    @Override // com.google.maps.android.compose.IndoorStateChangeListener
    public void onIndoorBuildingFocused() {
        IndoorStateChangeListener.DefaultImpls.onIndoorBuildingFocused(this);
    }

    @Override // com.google.maps.android.compose.IndoorStateChangeListener
    public void onIndoorLevelActivated(IndoorBuilding indoorBuilding) {
        IndoorStateChangeListener.DefaultImpls.onIndoorLevelActivated(this, indoorBuilding);
    }
}
