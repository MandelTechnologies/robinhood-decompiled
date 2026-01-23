package com.robinhood.android.cash.lib.atm.p072ui.cluster;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.Marker;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterManager;
import com.robinhood.models.api.minerva.Atm;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AtmClusterManager.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*+B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u001f\u001a\u00020 H\u0016J\u000e\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#J\"\u0010$\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u0019H\u0002J\u0014\u0010(\u001a\u00020 *\u00020\u00172\u0006\u0010)\u001a\u00020\u0019H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/cash/lib/atm/ui/cluster/AtmClusterManager;", "Lcom/google/maps/android/clustering/ClusterManager;", "Lcom/robinhood/android/cash/lib/atm/ui/cluster/AtmClusterItem;", "context", "Landroid/content/Context;", "containerView", "Landroid/view/ViewGroup;", "map", "Lcom/google/android/gms/maps/GoogleMap;", "callbacks", "Lcom/robinhood/android/cash/lib/atm/ui/cluster/AtmClusterManager$Callbacks;", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/google/android/gms/maps/GoogleMap;Lcom/robinhood/android/cash/lib/atm/ui/cluster/AtmClusterManager$Callbacks;)V", "clusterRenderer", "Lcom/robinhood/android/cash/lib/atm/ui/cluster/AtmClusterRenderer;", "atmMarkers", "", "Lcom/google/android/gms/maps/model/Marker;", "getAtmMarkers", "()Ljava/util/List;", "atmClusters", "getAtmClusters", "highlightedItem", "Lcom/robinhood/android/cash/lib/atm/ui/cluster/AtmClusterManager$HighlightedItem;", "value", "", "hasScrolledAfterReset", "getHasScrolledAfterReset", "()Z", "setHasScrolledAfterReset", "(Z)V", "clearItems", "", "highlightFromAtmItem", PlaceTypes.ATM, "Lcom/robinhood/models/api/minerva/Atm;", "setHighlightedMarker", "marker", "isCluster", "scrollToPosition", "toggleHighlighted", "isHighlighted", "Callbacks", "HighlightedItem", "lib-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AtmClusterManager extends ClusterManager<AtmClusterItem> {
    public static final int $stable = 8;
    private final Callbacks callbacks;
    private final AtmClusterRenderer clusterRenderer;
    private HighlightedItem highlightedItem;

    /* compiled from: AtmClusterManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/lib/atm/ui/cluster/AtmClusterManager$Callbacks;", "", "onScrollToAtm", "", PlaceTypes.ATM, "Lcom/robinhood/models/api/minerva/Atm;", "lib-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onScrollToAtm(Atm atm);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtmClusterManager(Context context, ViewGroup containerView, final GoogleMap map, Callbacks callbacks) {
        super(context, map);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
        AtmClusterRenderer atmClusterRenderer = new AtmClusterRenderer(context, containerView, map, this);
        this.clusterRenderer = atmClusterRenderer;
        setRenderer(atmClusterRenderer);
        setOnClusterItemClickListener(new ClusterManager.OnClusterItemClickListener() { // from class: com.robinhood.android.cash.lib.atm.ui.cluster.AtmClusterManager.1
            @Override // com.google.maps.android.clustering.ClusterManager.OnClusterItemClickListener
            public final boolean onClusterItemClick(AtmClusterItem atmClusterItem) {
                AtmClusterManager atmClusterManager = AtmClusterManager.this;
                atmClusterManager.setHighlightedMarker(atmClusterManager.clusterRenderer.getMarker((AtmClusterRenderer) atmClusterItem), false, true);
                return true;
            }
        });
        setOnClusterClickListener(new ClusterManager.OnClusterClickListener() { // from class: com.robinhood.android.cash.lib.atm.ui.cluster.AtmClusterManager.2
            @Override // com.google.maps.android.clustering.ClusterManager.OnClusterClickListener
            public final boolean onClusterClick(Cluster<AtmClusterItem> cluster) {
                map.animateCamera(CameraUpdateFactory.newLatLngZoom(cluster.getPosition(), map.getCameraPosition().zoom * 1.1f));
                return true;
            }
        });
    }

    private final List<Marker> getAtmMarkers() {
        Collection<Marker> markers = getMarkerCollection().getMarkers();
        Intrinsics.checkNotNullExpressionValue(markers, "getMarkers(...)");
        return CollectionsKt.toList(markers);
    }

    private final List<Marker> getAtmClusters() {
        Collection<Marker> markers = getClusterMarkerCollection().getMarkers();
        Intrinsics.checkNotNullExpressionValue(markers, "getMarkers(...)");
        return CollectionsKt.toList(markers);
    }

    public final boolean getHasScrolledAfterReset() {
        return this.clusterRenderer.getHasScrolledAfterReset();
    }

    public final void setHasScrolledAfterReset(boolean z) {
        this.clusterRenderer.setHasScrolledAfterReset(z);
    }

    @Override // com.google.maps.android.clustering.ClusterManager
    public void clearItems() {
        this.highlightedItem = null;
        super.clearItems();
    }

    public final void highlightFromAtmItem(Atm atm) {
        Object obj;
        Object next;
        boolean z;
        Intrinsics.checkNotNullParameter(atm, "atm");
        Iterator<T> it = getAtmMarkers().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(this.clusterRenderer.getClusterItem((Marker) next).getAtm(), atm)) {
                break;
            }
        }
        Marker marker = (Marker) next;
        if (marker == null) {
            Iterator<T> it2 = getAtmClusters().iterator();
            loop1: while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Iterable items = this.clusterRenderer.getCluster((Marker) next2).getItems();
                Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
                Iterable iterable = items;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.areEqual(((AtmClusterItem) it3.next()).getAtm(), atm)) {
                            obj = next2;
                            break loop1;
                        }
                    }
                }
            }
            marker = (Marker) obj;
            z = true;
        } else {
            z = false;
        }
        setHighlightedMarker(marker, z, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHighlightedMarker(Marker marker, boolean isCluster, boolean scrollToPosition) {
        Atm atm;
        HighlightedItem highlightedItem = this.highlightedItem;
        if (Intrinsics.areEqual(highlightedItem != null ? highlightedItem.getMarker() : null, marker) || marker == null) {
            return;
        }
        HighlightedItem highlightedItem2 = this.highlightedItem;
        if (highlightedItem2 != null) {
            toggleHighlighted(highlightedItem2, false);
        }
        HighlightedItem highlightedItem3 = new HighlightedItem(marker, isCluster);
        toggleHighlighted(highlightedItem3, true);
        this.highlightedItem = highlightedItem3;
        if (!scrollToPosition || (atm = this.clusterRenderer.getClusterItem(marker).getAtm()) == null) {
            return;
        }
        this.callbacks.onScrollToAtm(atm);
    }

    private final void toggleHighlighted(HighlightedItem highlightedItem, boolean z) {
        BitmapDescriptor bitmapDescriptorCreateMarkerIcon;
        if (highlightedItem.isCluster()) {
            bitmapDescriptorCreateMarkerIcon = this.clusterRenderer.createClusterIcon(this.clusterRenderer.getCluster(highlightedItem.getMarker()), z);
        } else {
            bitmapDescriptorCreateMarkerIcon = this.clusterRenderer.createMarkerIcon(z);
        }
        try {
            Marker marker = highlightedItem.getMarker();
            marker.setIcon(bitmapDescriptorCreateMarkerIcon);
            marker.setZIndex(z ? 1.0f : 0.0f);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* compiled from: AtmClusterManager.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/cash/lib/atm/ui/cluster/AtmClusterManager$HighlightedItem;", "", "marker", "Lcom/google/android/gms/maps/model/Marker;", "isCluster", "", "<init>", "(Lcom/google/android/gms/maps/model/Marker;Z)V", "getMarker", "()Lcom/google/android/gms/maps/model/Marker;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HighlightedItem {
        public static final int $stable = 8;
        private final boolean isCluster;
        private final Marker marker;

        public static /* synthetic */ HighlightedItem copy$default(HighlightedItem highlightedItem, Marker marker, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                marker = highlightedItem.marker;
            }
            if ((i & 2) != 0) {
                z = highlightedItem.isCluster;
            }
            return highlightedItem.copy(marker, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Marker getMarker() {
            return this.marker;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCluster() {
            return this.isCluster;
        }

        public final HighlightedItem copy(Marker marker, boolean isCluster) {
            Intrinsics.checkNotNullParameter(marker, "marker");
            return new HighlightedItem(marker, isCluster);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HighlightedItem)) {
                return false;
            }
            HighlightedItem highlightedItem = (HighlightedItem) other;
            return Intrinsics.areEqual(this.marker, highlightedItem.marker) && this.isCluster == highlightedItem.isCluster;
        }

        public int hashCode() {
            return (this.marker.hashCode() * 31) + Boolean.hashCode(this.isCluster);
        }

        public String toString() {
            return "HighlightedItem(marker=" + this.marker + ", isCluster=" + this.isCluster + ")";
        }

        public HighlightedItem(Marker marker, boolean z) {
            Intrinsics.checkNotNullParameter(marker, "marker");
            this.marker = marker;
            this.isCluster = z;
        }

        public final Marker getMarker() {
            return this.marker;
        }

        public final boolean isCluster() {
            return this.isCluster;
        }
    }
}
