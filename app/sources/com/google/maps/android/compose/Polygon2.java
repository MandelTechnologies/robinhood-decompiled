package com.google.maps.android.compose;

import com.google.android.gms.maps.model.Polygon;
import com.google.maps.android.compose.MapApplier7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: Polygon.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR.\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/google/maps/android/compose/PolygonNode;", "Lcom/google/maps/android/compose/MapNode;", "", "onRemoved", "()V", "Lcom/google/android/gms/maps/model/Polygon;", "polygon", "Lcom/google/android/gms/maps/model/Polygon;", "getPolygon", "()Lcom/google/android/gms/maps/model/Polygon;", "Lkotlin/Function1;", "onPolygonClick", "Lkotlin/jvm/functions/Function1;", "getOnPolygonClick", "()Lkotlin/jvm/functions/Function1;", "setOnPolygonClick", "(Lkotlin/jvm/functions/Function1;)V", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.google.maps.android.compose.PolygonNode, reason: use source file name */
/* loaded from: classes27.dex */
public final class Polygon2 implements MapApplier7 {
    private Function1<? super Polygon, Unit> onPolygonClick;
    private final Polygon polygon;

    @Override // com.google.maps.android.compose.MapApplier7
    public void onAttached() {
        MapApplier7.DefaultImpls.onAttached(this);
    }

    @Override // com.google.maps.android.compose.MapApplier7
    public void onCleared() {
        MapApplier7.DefaultImpls.onCleared(this);
    }

    public final Polygon getPolygon() {
        return this.polygon;
    }

    public final Function1<Polygon, Unit> getOnPolygonClick() {
        return this.onPolygonClick;
    }

    @Override // com.google.maps.android.compose.MapApplier7
    public void onRemoved() {
        this.polygon.remove();
    }
}
