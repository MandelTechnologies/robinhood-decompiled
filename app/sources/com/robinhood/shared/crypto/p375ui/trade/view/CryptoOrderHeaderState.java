package com.robinhood.shared.crypto.p375ui.trade.view;

import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.ServerDrivenAlert;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderHeaderComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderHeaderState;", "", "side", "Lcom/robinhood/models/db/OrderSide;", "assetCurrencyCode", "", "powerText", "Lcom/robinhood/utils/resource/StringResource;", "powerInfoAlert", "Lcom/robinhood/models/ui/ServerDrivenAlert;", "showInfoIcon", "", "<init>", "(Lcom/robinhood/models/db/OrderSide;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/models/ui/ServerDrivenAlert;Z)V", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getAssetCurrencyCode", "()Ljava/lang/String;", "getPowerText", "()Lcom/robinhood/utils/resource/StringResource;", "getPowerInfoAlert", "()Lcom/robinhood/models/ui/ServerDrivenAlert;", "getShowInfoIcon", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoOrderHeaderState {
    public static final int $stable = 8;
    private final String assetCurrencyCode;
    private final ServerDrivenAlert powerInfoAlert;
    private final StringResource powerText;
    private final boolean showInfoIcon;
    private final OrderSide side;

    public static /* synthetic */ CryptoOrderHeaderState copy$default(CryptoOrderHeaderState cryptoOrderHeaderState, OrderSide orderSide, String str, StringResource stringResource, ServerDrivenAlert serverDrivenAlert, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            orderSide = cryptoOrderHeaderState.side;
        }
        if ((i & 2) != 0) {
            str = cryptoOrderHeaderState.assetCurrencyCode;
        }
        if ((i & 4) != 0) {
            stringResource = cryptoOrderHeaderState.powerText;
        }
        if ((i & 8) != 0) {
            serverDrivenAlert = cryptoOrderHeaderState.powerInfoAlert;
        }
        if ((i & 16) != 0) {
            z = cryptoOrderHeaderState.showInfoIcon;
        }
        boolean z2 = z;
        StringResource stringResource2 = stringResource;
        return cryptoOrderHeaderState.copy(orderSide, str, stringResource2, serverDrivenAlert, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final OrderSide getSide() {
        return this.side;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAssetCurrencyCode() {
        return this.assetCurrencyCode;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getPowerText() {
        return this.powerText;
    }

    /* renamed from: component4, reason: from getter */
    public final ServerDrivenAlert getPowerInfoAlert() {
        return this.powerInfoAlert;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowInfoIcon() {
        return this.showInfoIcon;
    }

    public final CryptoOrderHeaderState copy(OrderSide side, String assetCurrencyCode, StringResource powerText, ServerDrivenAlert powerInfoAlert, boolean showInfoIcon) {
        Intrinsics.checkNotNullParameter(side, "side");
        return new CryptoOrderHeaderState(side, assetCurrencyCode, powerText, powerInfoAlert, showInfoIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderHeaderState)) {
            return false;
        }
        CryptoOrderHeaderState cryptoOrderHeaderState = (CryptoOrderHeaderState) other;
        return this.side == cryptoOrderHeaderState.side && Intrinsics.areEqual(this.assetCurrencyCode, cryptoOrderHeaderState.assetCurrencyCode) && Intrinsics.areEqual(this.powerText, cryptoOrderHeaderState.powerText) && Intrinsics.areEqual(this.powerInfoAlert, cryptoOrderHeaderState.powerInfoAlert) && this.showInfoIcon == cryptoOrderHeaderState.showInfoIcon;
    }

    public int hashCode() {
        int iHashCode = this.side.hashCode() * 31;
        String str = this.assetCurrencyCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        StringResource stringResource = this.powerText;
        int iHashCode3 = (iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        ServerDrivenAlert serverDrivenAlert = this.powerInfoAlert;
        return ((iHashCode3 + (serverDrivenAlert != null ? serverDrivenAlert.hashCode() : 0)) * 31) + Boolean.hashCode(this.showInfoIcon);
    }

    public String toString() {
        return "CryptoOrderHeaderState(side=" + this.side + ", assetCurrencyCode=" + this.assetCurrencyCode + ", powerText=" + this.powerText + ", powerInfoAlert=" + this.powerInfoAlert + ", showInfoIcon=" + this.showInfoIcon + ")";
    }

    public CryptoOrderHeaderState(OrderSide side, String str, StringResource stringResource, ServerDrivenAlert serverDrivenAlert, boolean z) {
        Intrinsics.checkNotNullParameter(side, "side");
        this.side = side;
        this.assetCurrencyCode = str;
        this.powerText = stringResource;
        this.powerInfoAlert = serverDrivenAlert;
        this.showInfoIcon = z;
    }

    public /* synthetic */ CryptoOrderHeaderState(OrderSide orderSide, String str, StringResource stringResource, ServerDrivenAlert serverDrivenAlert, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(orderSide, str, stringResource, serverDrivenAlert, (i & 16) != 0 ? false : z);
    }

    public final OrderSide getSide() {
        return this.side;
    }

    public final String getAssetCurrencyCode() {
        return this.assetCurrencyCode;
    }

    public final StringResource getPowerText() {
        return this.powerText;
    }

    public final ServerDrivenAlert getPowerInfoAlert() {
        return this.powerInfoAlert;
    }

    public final boolean getShowInfoIcon() {
        return this.showInfoIcon;
    }
}
