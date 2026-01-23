package com.robinhood.android.cash.lib.atm.p072ui.cluster;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.google.maps.android.p053ui.IconGenerator;
import com.robinhood.android.cash.lib.atm.C10113R;
import com.robinhood.android.cash.lib.atm.p072ui.MapPinDrawableFactory;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.p409ui.color.ThemeColors;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AtmClusterRenderer.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0015\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0014J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\u001e\u0010\u001d\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\u001e\u0010\u001e\u001a\u00020\u001f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00172\u0006\u0010 \u001a\u00020\u0010J\u000e\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/cash/lib/atm/ui/cluster/AtmClusterRenderer;", "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer;", "Lcom/robinhood/android/cash/lib/atm/ui/cluster/AtmClusterItem;", "context", "Landroid/content/Context;", "containerView", "Landroid/view/ViewGroup;", "map", "Lcom/google/android/gms/maps/GoogleMap;", "clusterManager", "Lcom/google/maps/android/clustering/ClusterManager;", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/google/android/gms/maps/GoogleMap;Lcom/google/maps/android/clustering/ClusterManager;)V", "mapPinDrawableFactory", "Lcom/robinhood/android/cash/lib/atm/ui/MapPinDrawableFactory;", "hasScrolledAfterReset", "", "getHasScrolledAfterReset", "()Z", "setHasScrolledAfterReset", "(Z)V", "shouldRenderAsCluster", "cluster", "Lcom/google/maps/android/clustering/Cluster;", "onBeforeClusterItemRendered", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "markerOptions", "Lcom/google/android/gms/maps/model/MarkerOptions;", "onBeforeClusterRendered", "createClusterIcon", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "isHighlighted", "createMarkerIcon", "Companion", "lib-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AtmClusterRenderer extends DefaultClusterRenderer<AtmClusterItem> {
    public static final int MAX_ATM_COUNT = 99;
    private final ViewGroup containerView;
    private final Context context;
    private boolean hasScrolledAfterReset;
    private final MapPinDrawableFactory mapPinDrawableFactory;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtmClusterRenderer(Context context, ViewGroup containerView, GoogleMap map, ClusterManager<AtmClusterItem> clusterManager) {
        super(context, map, clusterManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(clusterManager, "clusterManager");
        this.context = context;
        this.containerView = containerView;
        this.mapPinDrawableFactory = new MapPinDrawableFactory(context);
    }

    public final boolean getHasScrolledAfterReset() {
        return this.hasScrolledAfterReset;
    }

    public final void setHasScrolledAfterReset(boolean z) {
        this.hasScrolledAfterReset = z;
    }

    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
    protected boolean shouldRenderAsCluster(Cluster<AtmClusterItem> cluster) {
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        return cluster.getSize() >= 5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
    public void onBeforeClusterItemRendered(AtmClusterItem item, MarkerOptions markerOptions) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(markerOptions, "markerOptions");
        super.onBeforeClusterItemRendered((AtmClusterRenderer) item, markerOptions);
        boolean z = item.getIsInitiallyHighlighted() && !this.hasScrolledAfterReset;
        markerOptions.icon(createMarkerIcon(z));
        markerOptions.zIndex(z ? 1.0f : 0.0f);
    }

    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
    protected void onBeforeClusterRendered(Cluster<AtmClusterItem> cluster, MarkerOptions markerOptions) {
        boolean z;
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        Intrinsics.checkNotNullParameter(markerOptions, "markerOptions");
        super.onBeforeClusterRendered(cluster, markerOptions);
        Iterable items = cluster.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
        Iterable iterable = items;
        if (!((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AtmClusterItem) it.next()).getIsInitiallyHighlighted()) {
                    z = this.hasScrolledAfterReset ? false : true;
                }
            }
        }
        markerOptions.icon(createClusterIcon(cluster, z));
        markerOptions.zIndex(z ? 1.0f : 0.0f);
    }

    public final BitmapDescriptor createClusterIcon(Cluster<AtmClusterItem> cluster, boolean isHighlighted) {
        String strValueOf;
        View viewInflate = ContextSystemServices.getLayoutInflater(this.context).inflate(C10113R.layout.include_atm_map_cluster_icon, this.containerView, false);
        int size = cluster != null ? cluster.getSize() : 0;
        if (size > 99) {
            strValueOf = "99+";
        } else {
            strValueOf = String.valueOf(size);
        }
        ((TextView) viewInflate.findViewById(C10113R.id.atm_map_cluster_icon_text)).setText(strValueOf);
        if (isHighlighted) {
            ((ImageView) viewInflate.findViewById(C10113R.id.atm_map_cluster_icon_image)).setBackgroundTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(this.context, C20690R.attr.colorPrimary)));
        }
        IconGenerator iconGenerator = new IconGenerator(this.context);
        iconGenerator.setBackground(null);
        iconGenerator.setContentView(viewInflate);
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(iconGenerator.makeIcon());
        Intrinsics.checkNotNullExpressionValue(bitmapDescriptorFromBitmap, "fromBitmap(...)");
        return bitmapDescriptorFromBitmap;
    }

    public final BitmapDescriptor createMarkerIcon(boolean isHighlighted) {
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(this.mapPinDrawableFactory.generateBitmap(MapPinDrawableFactory.Type.INSTANCE.fromHighlighted(isHighlighted)));
        Intrinsics.checkNotNullExpressionValue(bitmapDescriptorFromBitmap, "fromBitmap(...)");
        return bitmapDescriptorFromBitmap;
    }
}
