package com.google.maps.android.compose;

import com.google.android.gms.maps.GoogleMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MapClickListeners.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
/* synthetic */ class MapClickListenersKt$MapClickListenerUpdater$1$14$1 extends FunctionReferenceImpl implements Function2<GoogleMap, GoogleMap.OnPoiClickListener, Unit> {
    public static final MapClickListenersKt$MapClickListenerUpdater$1$14$1 INSTANCE = new MapClickListenersKt$MapClickListenerUpdater$1$14$1();

    MapClickListenersKt$MapClickListenerUpdater$1$14$1() {
        super(2, GoogleMap.class, "setOnPoiClickListener", "setOnPoiClickListener(Lcom/google/android/gms/maps/GoogleMap$OnPoiClickListener;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(GoogleMap googleMap, GoogleMap.OnPoiClickListener onPoiClickListener) {
        invoke2(googleMap, onPoiClickListener);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GoogleMap p0, GoogleMap.OnPoiClickListener onPoiClickListener) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        p0.setOnPoiClickListener(onPoiClickListener);
    }
}
