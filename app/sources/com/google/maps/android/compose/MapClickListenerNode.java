package com.google.maps.android.compose;

import com.google.android.gms.maps.GoogleMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MapClickListeners.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B6\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001f\u0010\u0006\u001a\u001b\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t\u0012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0002\u0010\u000bJ\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\u0017\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010\u0012R\u0010\u0010\n\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0006\u001a\u001b\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/google/maps/android/compose/MapClickListenerNode;", "L", "", "Lcom/google/maps/android/compose/MapNode;", "map", "Lcom/google/android/gms/maps/GoogleMap;", "setter", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "listener", "(Lcom/google/android/gms/maps/GoogleMap;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V", "Ljava/lang/Object;", "onAttached", "onCleared", "onRemoved", "setListener", "listenerOrNull", "(Ljava/lang/Object;)V", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class MapClickListenerNode<L> implements MapApplier7 {
    private final L listener;
    private final GoogleMap map;
    private final Function2<GoogleMap, L, Unit> setter;

    /* JADX WARN: Multi-variable type inference failed */
    public MapClickListenerNode(GoogleMap map, Function2<? super GoogleMap, ? super L, Unit> setter, L listener) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(setter, "setter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.map = map;
        this.setter = setter;
        this.listener = listener;
    }

    @Override // com.google.maps.android.compose.MapApplier7
    public void onAttached() {
        setListener(this.listener);
    }

    @Override // com.google.maps.android.compose.MapApplier7
    public void onRemoved() {
        setListener(null);
    }

    @Override // com.google.maps.android.compose.MapApplier7
    public void onCleared() {
        setListener(null);
    }

    private final void setListener(L listenerOrNull) {
        this.setter.invoke(this.map, listenerOrNull);
    }
}
