package com.robinhood.android.cash.lib.atm.p072ui.cluster;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.maps.android.clustering.ClusterItem;
import com.robinhood.models.api.minerva.Atm;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AtmClusterItem.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/cash/lib/atm/ui/cluster/AtmClusterItem;", "Lcom/google/maps/android/clustering/ClusterItem;", PlaceTypes.ATM, "Lcom/robinhood/models/api/minerva/Atm;", "isInitiallyHighlighted", "", "<init>", "(Lcom/robinhood/models/api/minerva/Atm;Z)V", "getAtm", "()Lcom/robinhood/models/api/minerva/Atm;", "()Z", "getPosition", "Lcom/google/android/gms/maps/model/LatLng;", "getTitle", "", "getSnippet", "getZIndex", "", "()Ljava/lang/Float;", "lib-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AtmClusterItem implements ClusterItem {
    public static final int $stable = 8;
    private final Atm atm;
    private final boolean isInitiallyHighlighted;

    @Override // com.google.maps.android.clustering.ClusterItem
    public Float getZIndex() {
        return null;
    }

    public AtmClusterItem(Atm atm, boolean z) {
        Intrinsics.checkNotNullParameter(atm, "atm");
        this.atm = atm;
        this.isInitiallyHighlighted = z;
    }

    public final Atm getAtm() {
        return this.atm;
    }

    /* renamed from: isInitiallyHighlighted, reason: from getter */
    public final boolean getIsInitiallyHighlighted() {
        return this.isInitiallyHighlighted;
    }

    @Override // com.google.maps.android.clustering.ClusterItem
    public LatLng getPosition() {
        return new LatLng(this.atm.getLatitude(), this.atm.getLongitude());
    }

    @Override // com.google.maps.android.clustering.ClusterItem
    public String getTitle() {
        return this.atm.getName();
    }

    @Override // com.google.maps.android.clustering.ClusterItem
    public String getSnippet() {
        return this.atm.getAddress();
    }
}
