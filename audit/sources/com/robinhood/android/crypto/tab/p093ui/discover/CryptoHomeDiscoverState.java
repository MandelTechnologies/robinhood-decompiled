package com.robinhood.android.crypto.tab.p093ui.discover;

import com.robinhood.models.crypto.p314db.home.CryptoHomeDiscover;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: CryptoHomeDiscoverState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverState;", "", WebsocketGatewayConstants.DATA_KEY, "Lkotlinx/collections/immutable/ImmutableMap;", "", "Lcom/robinhood/models/crypto/db/home/CryptoHomeDiscover;", "isCurrentlySelectedTradeable", "<init>", "(Lkotlinx/collections/immutable/ImmutableMap;Z)V", "getData", "()Lkotlinx/collections/immutable/ImmutableMap;", "()Z", "currentData", "getCurrentData", "()Lcom/robinhood/models/crypto/db/home/CryptoHomeDiscover;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeDiscoverState {
    public static final int $stable = 8;
    private final ImmutableMap<Boolean, CryptoHomeDiscover> data;
    private final boolean isCurrentlySelectedTradeable;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoHomeDiscoverState copy$default(CryptoHomeDiscoverState cryptoHomeDiscoverState, ImmutableMap immutableMap, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableMap = cryptoHomeDiscoverState.data;
        }
        if ((i & 2) != 0) {
            z = cryptoHomeDiscoverState.isCurrentlySelectedTradeable;
        }
        return cryptoHomeDiscoverState.copy(immutableMap, z);
    }

    public final ImmutableMap<Boolean, CryptoHomeDiscover> component1() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCurrentlySelectedTradeable() {
        return this.isCurrentlySelectedTradeable;
    }

    public final CryptoHomeDiscoverState copy(ImmutableMap<Boolean, CryptoHomeDiscover> data, boolean isCurrentlySelectedTradeable) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new CryptoHomeDiscoverState(data, isCurrentlySelectedTradeable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHomeDiscoverState)) {
            return false;
        }
        CryptoHomeDiscoverState cryptoHomeDiscoverState = (CryptoHomeDiscoverState) other;
        return Intrinsics.areEqual(this.data, cryptoHomeDiscoverState.data) && this.isCurrentlySelectedTradeable == cryptoHomeDiscoverState.isCurrentlySelectedTradeable;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + Boolean.hashCode(this.isCurrentlySelectedTradeable);
    }

    public String toString() {
        return "CryptoHomeDiscoverState(data=" + this.data + ", isCurrentlySelectedTradeable=" + this.isCurrentlySelectedTradeable + ")";
    }

    public CryptoHomeDiscoverState(ImmutableMap<Boolean, CryptoHomeDiscover> data, boolean z) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.isCurrentlySelectedTradeable = z;
    }

    public final ImmutableMap<Boolean, CryptoHomeDiscover> getData() {
        return this.data;
    }

    public final boolean isCurrentlySelectedTradeable() {
        return this.isCurrentlySelectedTradeable;
    }

    public final CryptoHomeDiscover getCurrentData() {
        return this.data.get(Boolean.valueOf(this.isCurrentlySelectedTradeable));
    }
}
