package com.robinhood.android.futures.assethome.sections;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetReturnsBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/sections/NetReturnsBottomSheetViewState;", "", "netReturnValue", "Lcom/robinhood/utils/resource/StringResource;", "currentSpanPnlTitle", "currentSpanPnlValue", "commissionsValue", "exchangeFeesValue", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getNetReturnValue", "()Lcom/robinhood/utils/resource/StringResource;", "getCurrentSpanPnlTitle", "getCurrentSpanPnlValue", "getCommissionsValue", "getExchangeFeesValue", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-futures-asset-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NetReturnsBottomSheetViewState {
    public static final int $stable = StringResource.$stable;
    private final StringResource commissionsValue;
    private final StringResource currentSpanPnlTitle;
    private final StringResource currentSpanPnlValue;
    private final StringResource exchangeFeesValue;
    private final StringResource netReturnValue;

    public static /* synthetic */ NetReturnsBottomSheetViewState copy$default(NetReturnsBottomSheetViewState netReturnsBottomSheetViewState, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = netReturnsBottomSheetViewState.netReturnValue;
        }
        if ((i & 2) != 0) {
            stringResource2 = netReturnsBottomSheetViewState.currentSpanPnlTitle;
        }
        if ((i & 4) != 0) {
            stringResource3 = netReturnsBottomSheetViewState.currentSpanPnlValue;
        }
        if ((i & 8) != 0) {
            stringResource4 = netReturnsBottomSheetViewState.commissionsValue;
        }
        if ((i & 16) != 0) {
            stringResource5 = netReturnsBottomSheetViewState.exchangeFeesValue;
        }
        StringResource stringResource6 = stringResource5;
        StringResource stringResource7 = stringResource3;
        return netReturnsBottomSheetViewState.copy(stringResource, stringResource2, stringResource7, stringResource4, stringResource6);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getNetReturnValue() {
        return this.netReturnValue;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getCurrentSpanPnlTitle() {
        return this.currentSpanPnlTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getCurrentSpanPnlValue() {
        return this.currentSpanPnlValue;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getCommissionsValue() {
        return this.commissionsValue;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getExchangeFeesValue() {
        return this.exchangeFeesValue;
    }

    public final NetReturnsBottomSheetViewState copy(StringResource netReturnValue, StringResource currentSpanPnlTitle, StringResource currentSpanPnlValue, StringResource commissionsValue, StringResource exchangeFeesValue) {
        Intrinsics.checkNotNullParameter(currentSpanPnlTitle, "currentSpanPnlTitle");
        return new NetReturnsBottomSheetViewState(netReturnValue, currentSpanPnlTitle, currentSpanPnlValue, commissionsValue, exchangeFeesValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetReturnsBottomSheetViewState)) {
            return false;
        }
        NetReturnsBottomSheetViewState netReturnsBottomSheetViewState = (NetReturnsBottomSheetViewState) other;
        return Intrinsics.areEqual(this.netReturnValue, netReturnsBottomSheetViewState.netReturnValue) && Intrinsics.areEqual(this.currentSpanPnlTitle, netReturnsBottomSheetViewState.currentSpanPnlTitle) && Intrinsics.areEqual(this.currentSpanPnlValue, netReturnsBottomSheetViewState.currentSpanPnlValue) && Intrinsics.areEqual(this.commissionsValue, netReturnsBottomSheetViewState.commissionsValue) && Intrinsics.areEqual(this.exchangeFeesValue, netReturnsBottomSheetViewState.exchangeFeesValue);
    }

    public int hashCode() {
        StringResource stringResource = this.netReturnValue;
        int iHashCode = (((stringResource == null ? 0 : stringResource.hashCode()) * 31) + this.currentSpanPnlTitle.hashCode()) * 31;
        StringResource stringResource2 = this.currentSpanPnlValue;
        int iHashCode2 = (iHashCode + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
        StringResource stringResource3 = this.commissionsValue;
        int iHashCode3 = (iHashCode2 + (stringResource3 == null ? 0 : stringResource3.hashCode())) * 31;
        StringResource stringResource4 = this.exchangeFeesValue;
        return iHashCode3 + (stringResource4 != null ? stringResource4.hashCode() : 0);
    }

    public String toString() {
        return "NetReturnsBottomSheetViewState(netReturnValue=" + this.netReturnValue + ", currentSpanPnlTitle=" + this.currentSpanPnlTitle + ", currentSpanPnlValue=" + this.currentSpanPnlValue + ", commissionsValue=" + this.commissionsValue + ", exchangeFeesValue=" + this.exchangeFeesValue + ")";
    }

    public NetReturnsBottomSheetViewState(StringResource stringResource, StringResource currentSpanPnlTitle, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4) {
        Intrinsics.checkNotNullParameter(currentSpanPnlTitle, "currentSpanPnlTitle");
        this.netReturnValue = stringResource;
        this.currentSpanPnlTitle = currentSpanPnlTitle;
        this.currentSpanPnlValue = stringResource2;
        this.commissionsValue = stringResource3;
        this.exchangeFeesValue = stringResource4;
    }

    public final StringResource getNetReturnValue() {
        return this.netReturnValue;
    }

    public final StringResource getCurrentSpanPnlTitle() {
        return this.currentSpanPnlTitle;
    }

    public final StringResource getCurrentSpanPnlValue() {
        return this.currentSpanPnlValue;
    }

    public final StringResource getCommissionsValue() {
        return this.commissionsValue;
    }

    public final StringResource getExchangeFeesValue() {
        return this.exchangeFeesValue;
    }
}
