package com.google.maps.android.compose;

import android.content.Context;
import android.view.View;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.Marker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposeInfoWindowAdapter.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/google/maps/android/compose/ComposeInfoWindowAdapter;", "Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;", "mapView", "Lcom/google/android/gms/maps/MapView;", "markerNodeFinder", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lcom/google/maps/android/compose/MarkerNode;", "(Lcom/google/android/gms/maps/MapView;Lkotlin/jvm/functions/Function1;)V", "getInfoContents", "Landroid/view/View;", "marker", "getInfoWindow", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class ComposeInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {
    private final MapView mapView;
    private final Function1<Marker, MarkerNode> markerNodeFinder;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposeInfoWindowAdapter(MapView mapView, Function1<? super Marker, MarkerNode> markerNodeFinder) {
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(markerNodeFinder, "markerNodeFinder");
        this.mapView = mapView;
        this.markerNodeFinder = markerNodeFinder;
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoContents(final Marker marker) {
        final Function3<Marker, Composer, Integer, Unit> infoContent;
        Intrinsics.checkNotNullParameter(marker, "marker");
        MarkerNode markerNodeInvoke = this.markerNodeFinder.invoke(marker);
        if (markerNodeInvoke == null || (infoContent = markerNodeInvoke.getInfoContent()) == null) {
            return null;
        }
        Context context = this.mapView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambda3.composableLambdaInstance(1508359207, true, new Function2<Composer, Integer, Unit>() { // from class: com.google.maps.android.compose.ComposeInfoWindowAdapter$getInfoContents$view$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1508359207, i, -1, "com.google.maps.android.compose.ComposeInfoWindowAdapter.getInfoContents.<anonymous>.<anonymous> (ComposeInfoWindowAdapter.kt:49)");
                }
                infoContent.invoke(marker, composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        MapComposeViewRender2.renderComposeViewOnce$default(this.mapView, composeView, null, markerNodeInvoke.getCompositionContext(), 2, null);
        return composeView;
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoWindow(final Marker marker) {
        final Function3<Marker, Composer, Integer, Unit> infoWindow;
        Intrinsics.checkNotNullParameter(marker, "marker");
        MarkerNode markerNodeInvoke = this.markerNodeFinder.invoke(marker);
        if (markerNodeInvoke == null || (infoWindow = markerNodeInvoke.getInfoWindow()) == null) {
            return null;
        }
        Context context = this.mapView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambda3.composableLambdaInstance(-742372995, true, new Function2<Composer, Integer, Unit>() { // from class: com.google.maps.android.compose.ComposeInfoWindowAdapter$getInfoWindow$view$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-742372995, i, -1, "com.google.maps.android.compose.ComposeInfoWindowAdapter.getInfoWindow.<anonymous>.<anonymous> (ComposeInfoWindowAdapter.kt:62)");
                }
                infoWindow.invoke(marker, composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        MapComposeViewRender2.renderComposeViewOnce$default(this.mapView, composeView, null, markerNodeInvoke.getCompositionContext(), 2, null);
        return composeView;
    }
}
