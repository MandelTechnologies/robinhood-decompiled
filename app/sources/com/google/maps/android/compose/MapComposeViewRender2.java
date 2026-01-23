package com.google.maps.android.compose;

import android.content.Context;
import android.view.View;
import androidx.compose.p011ui.platform.AbstractComposeView;
import androidx.compose.runtime.CompositionContext;
import com.google.android.gms.maps.MapView;
import com.google.maps.android.compose.MapComposeViewRender;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;

/* compiled from: MapComposeViewRender.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/google/android/gms/maps/MapView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function1;", "Landroid/view/View;", "", "onAddedToWindow", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "renderComposeViewOnce", "(Lcom/google/android/gms/maps/MapView;Landroidx/compose/ui/platform/AbstractComposeView;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/CompositionContext;)V", "Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "startRenderingComposeView", "(Lcom/google/android/gms/maps/MapView;Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/compose/runtime/CompositionContext;)Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "Lcom/google/maps/android/compose/NoDrawContainerView;", "ensureContainerView", "(Lcom/google/android/gms/maps/MapView;)Lcom/google/maps/android/compose/NoDrawContainerView;", "maps-compose_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.google.maps.android.compose.MapComposeViewRenderKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class MapComposeViewRender2 {
    public static /* synthetic */ void renderComposeViewOnce$default(MapView mapView, AbstractComposeView abstractComposeView, Function1 function1, CompositionContext compositionContext, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        renderComposeViewOnce(mapView, abstractComposeView, function1, compositionContext);
    }

    public static final void renderComposeViewOnce(MapView mapView, AbstractComposeView view, Function1<? super View, Unit> function1, CompositionContext parentContext) {
        Intrinsics.checkNotNullParameter(mapView, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parentContext, "parentContext");
        MapComposeViewRender mapComposeViewRenderStartRenderingComposeView = startRenderingComposeView(mapView, view, parentContext);
        if (function1 != null) {
            try {
                function1.invoke(view);
                Unit unit = Unit.INSTANCE;
            } finally {
            }
        }
        Closeable.closeFinally(mapComposeViewRenderStartRenderingComposeView, null);
    }

    public static final MapComposeViewRender startRenderingComposeView(MapView mapView, final AbstractComposeView view, CompositionContext parentContext) {
        Intrinsics.checkNotNullParameter(mapView, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parentContext, "parentContext");
        final MapComposeViewRender3 mapComposeViewRender3EnsureContainerView = ensureContainerView(mapView);
        mapComposeViewRender3EnsureContainerView.addView(view);
        view.setParentCompositionContext(parentContext);
        return new MapComposeViewRender() { // from class: com.google.maps.android.compose.MapComposeViewRenderKt.startRenderingComposeView.2
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                MapComposeViewRender.DefaultImpls.close(this);
            }

            @Override // com.google.maps.android.compose.MapComposeViewRender
            public void dispose() {
                mapComposeViewRender3EnsureContainerView.removeView(view);
            }
        };
    }

    private static final MapComposeViewRender3 ensureContainerView(MapView mapView) {
        MapComposeViewRender3 mapComposeViewRender3 = (MapComposeViewRender3) mapView.findViewById(R$id.maps_compose_nodraw_container_view);
        if (mapComposeViewRender3 != null) {
            return mapComposeViewRender3;
        }
        Context context = mapView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MapComposeViewRender3 mapComposeViewRender32 = new MapComposeViewRender3(context);
        mapComposeViewRender32.setId(R$id.maps_compose_nodraw_container_view);
        mapView.addView(mapComposeViewRender32);
        return mapComposeViewRender32;
    }
}
