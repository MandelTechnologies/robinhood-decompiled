package com.google.maps.android.compose;

import com.google.maps.android.compose.MapApplier7;
import kotlin.Metadata;

/* compiled from: MapApplier.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/google/maps/android/compose/MapNodeRoot;", "Lcom/google/maps/android/compose/MapNode;", "()V", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.google.maps.android.compose.MapNodeRoot, reason: use source file name */
/* loaded from: classes27.dex */
final class MapApplier8 implements MapApplier7 {
    public static final MapApplier8 INSTANCE = new MapApplier8();

    private MapApplier8() {
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
}
