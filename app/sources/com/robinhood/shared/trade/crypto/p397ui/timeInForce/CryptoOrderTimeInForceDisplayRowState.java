package com.robinhood.shared.trade.crypto.p397ui.timeInForce;

import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderTimeInForceViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceDisplayRowState;", "", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "isSelected", "", "<init>", "(Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Z)V", "getTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderTimeInForceDisplayRowState {
    public static final int $stable = StringResource.$stable;
    private final boolean isSelected;
    private final StringResource primaryText;
    private final StringResource secondaryText;
    private final OrderTimeInForce timeInForce;

    public static /* synthetic */ CryptoOrderTimeInForceDisplayRowState copy$default(CryptoOrderTimeInForceDisplayRowState cryptoOrderTimeInForceDisplayRowState, OrderTimeInForce orderTimeInForce, StringResource stringResource, StringResource stringResource2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            orderTimeInForce = cryptoOrderTimeInForceDisplayRowState.timeInForce;
        }
        if ((i & 2) != 0) {
            stringResource = cryptoOrderTimeInForceDisplayRowState.primaryText;
        }
        if ((i & 4) != 0) {
            stringResource2 = cryptoOrderTimeInForceDisplayRowState.secondaryText;
        }
        if ((i & 8) != 0) {
            z = cryptoOrderTimeInForceDisplayRowState.isSelected;
        }
        return cryptoOrderTimeInForceDisplayRowState.copy(orderTimeInForce, stringResource, stringResource2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final CryptoOrderTimeInForceDisplayRowState copy(OrderTimeInForce timeInForce, StringResource primaryText, StringResource secondaryText, boolean isSelected) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        return new CryptoOrderTimeInForceDisplayRowState(timeInForce, primaryText, secondaryText, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderTimeInForceDisplayRowState)) {
            return false;
        }
        CryptoOrderTimeInForceDisplayRowState cryptoOrderTimeInForceDisplayRowState = (CryptoOrderTimeInForceDisplayRowState) other;
        return this.timeInForce == cryptoOrderTimeInForceDisplayRowState.timeInForce && Intrinsics.areEqual(this.primaryText, cryptoOrderTimeInForceDisplayRowState.primaryText) && Intrinsics.areEqual(this.secondaryText, cryptoOrderTimeInForceDisplayRowState.secondaryText) && this.isSelected == cryptoOrderTimeInForceDisplayRowState.isSelected;
    }

    public int hashCode() {
        return (((((this.timeInForce.hashCode() * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    public String toString() {
        return "CryptoOrderTimeInForceDisplayRowState(timeInForce=" + this.timeInForce + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", isSelected=" + this.isSelected + ")";
    }

    public CryptoOrderTimeInForceDisplayRowState(OrderTimeInForce timeInForce, StringResource primaryText, StringResource secondaryText, boolean z) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        this.timeInForce = timeInForce;
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;
        this.isSelected = z;
    }

    public final OrderTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }
}
