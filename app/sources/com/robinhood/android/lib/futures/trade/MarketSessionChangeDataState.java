package com.robinhood.android.lib.futures.trade;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarketSessionChangeDataState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;", "", "isOpen", "", "headerString", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Ljava/lang/Boolean;Lcom/robinhood/utils/resource/StringResource;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHeaderString", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Lcom/robinhood/utils/resource/StringResource;)Lcom/robinhood/android/lib/futures/trade/MarketSessionChangeDataState;", "equals", "other", "hashCode", "", "toString", "", "lib-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarketSessionChangeDataState {
    private final StringResource headerString;
    private final Boolean isOpen;

    /* JADX WARN: Multi-variable type inference failed */
    public MarketSessionChangeDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MarketSessionChangeDataState copy$default(MarketSessionChangeDataState marketSessionChangeDataState, Boolean bool, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = marketSessionChangeDataState.isOpen;
        }
        if ((i & 2) != 0) {
            stringResource = marketSessionChangeDataState.headerString;
        }
        return marketSessionChangeDataState.copy(bool, stringResource);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsOpen() {
        return this.isOpen;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getHeaderString() {
        return this.headerString;
    }

    public final MarketSessionChangeDataState copy(Boolean isOpen, StringResource headerString) {
        return new MarketSessionChangeDataState(isOpen, headerString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketSessionChangeDataState)) {
            return false;
        }
        MarketSessionChangeDataState marketSessionChangeDataState = (MarketSessionChangeDataState) other;
        return Intrinsics.areEqual(this.isOpen, marketSessionChangeDataState.isOpen) && Intrinsics.areEqual(this.headerString, marketSessionChangeDataState.headerString);
    }

    public int hashCode() {
        Boolean bool = this.isOpen;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        StringResource stringResource = this.headerString;
        return iHashCode + (stringResource != null ? stringResource.hashCode() : 0);
    }

    public String toString() {
        return "MarketSessionChangeDataState(isOpen=" + this.isOpen + ", headerString=" + this.headerString + ")";
    }

    public MarketSessionChangeDataState(Boolean bool, StringResource stringResource) {
        this.isOpen = bool;
        this.headerString = stringResource;
    }

    public /* synthetic */ MarketSessionChangeDataState(Boolean bool, StringResource stringResource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : stringResource);
    }

    public final Boolean isOpen() {
        return this.isOpen;
    }

    public final StringResource getHeaderString() {
        return this.headerString;
    }
}
