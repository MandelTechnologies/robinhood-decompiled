package com.google.maps.android.compose;

import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CameraPositionState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\" \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/google/maps/android/compose/CameraPositionState;", "LocalCameraPositionState", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalCameraPositionState", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "maps-compose_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class CameraPositionStateKt {
    private static final CompositionLocal6<CameraPositionState> LocalCameraPositionState = CompositionLocal3.staticCompositionLocalOf(new Function0<CameraPositionState>() { // from class: com.google.maps.android.compose.CameraPositionStateKt$LocalCameraPositionState$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CameraPositionState invoke() {
            return new CameraPositionState(null, 1, null);
        }
    });

    public static final CompositionLocal6<CameraPositionState> getLocalCameraPositionState() {
        return LocalCameraPositionState;
    }
}
