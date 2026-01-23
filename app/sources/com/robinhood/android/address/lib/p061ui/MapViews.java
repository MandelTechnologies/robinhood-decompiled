package com.robinhood.android.address.lib.p061ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MapViews.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"loadMapImage", "", "Lcom/google/android/gms/maps/MapView;", "lat", "", "lng", "hue", "", "bottomPadding", "", "(Lcom/google/android/gms/maps/MapView;DDLjava/lang/Float;Ljava/lang/Integer;)V", "feature-lib-address_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.address.lib.ui.MapViewsKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class MapViews {
    public static /* synthetic */ void loadMapImage$default(MapView mapView, double d, double d2, Float f, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            f = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        loadMapImage(mapView, d, d2, f, num);
    }

    public static final void loadMapImage(final MapView mapView, final double d, final double d2, final Float f, final Integer num) {
        Intrinsics.checkNotNullParameter(mapView, "<this>");
        mapView.getMapAsync(new OnMapReadyCallback() { // from class: com.robinhood.android.address.lib.ui.MapViewsKt.loadMapImage.1
            @Override // com.google.android.gms.maps.OnMapReadyCallback
            public final void onMapReady(GoogleMap googleMap) throws Resources.NotFoundException {
                float fFirst;
                Intrinsics.checkNotNullParameter(googleMap, "googleMap");
                LatLng latLng = new LatLng(d, d2);
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 15.0f));
                googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() { // from class: com.robinhood.android.address.lib.ui.MapViewsKt.loadMapImage.1.1
                    @Override // com.google.android.gms.maps.GoogleMap.OnMapClickListener
                    public final void onMapClick(LatLng it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }
                });
                googleMap.getUiSettings().setMapToolbarEnabled(false);
                Integer num2 = num;
                if (num2 != null) {
                    googleMap.setPadding(0, 0, 0, num2.intValue());
                }
                MarkerOptions markerOptions = new MarkerOptions();
                Float f2 = f;
                if (f2 != null) {
                    fFirst = f2.floatValue();
                } else {
                    Context context = mapView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    float[] fArr = new float[3];
                    Color.colorToHSV(ThemeColors.getThemeColor(context, C20690R.attr.colorPrimary), fArr);
                    fFirst = ArraysKt.first(fArr);
                }
                googleMap.addMarker(markerOptions.icon(BitmapDescriptorFactory.defaultMarker(fFirst)).position(latLng));
            }
        });
    }
}
