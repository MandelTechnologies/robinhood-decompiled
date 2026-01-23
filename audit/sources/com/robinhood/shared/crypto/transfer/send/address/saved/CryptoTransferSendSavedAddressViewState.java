package com.robinhood.shared.crypto.transfer.send.address.saved;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.shared.crypto.transfer.send.address.UiSavedAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoTransferSendSavedAddressViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u008d\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\rHÖ\u0001J\t\u00103\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u00064"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressViewState;", "", "showSavedAddressLoadingSpinner", "", "shouldShowScanTooltipSavedAddresses", "shouldShowAddressLists", "shouldRequestFocus", "isContinueEnabled", "isContinueVisible", "currencyCode", "", PlaceTypes.ADDRESS, "maxAddressLength", "", "recentAddressesList", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/transfer/send/address/UiSavedAddress;", "savedAddressesList", CryptoTransferSendSavedAddressComposableKt.ExpandCtaItemKey, "<init>", "(ZZZZZZLjava/lang/String;Ljava/lang/String;ILkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Z)V", "getShowSavedAddressLoadingSpinner", "()Z", "getShouldShowScanTooltipSavedAddresses", "getShouldShowAddressLists", "getShouldRequestFocus", "getCurrencyCode", "()Ljava/lang/String;", "getAddress", "getMaxAddressLength", "()I", "getRecentAddressesList", "()Lkotlinx/collections/immutable/ImmutableList;", "getSavedAddressesList", "getShowExpandRecentAddressesCta", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferSendSavedAddressViewState {
    public static final int $stable = 8;
    private final String address;
    private final String currencyCode;
    private final boolean isContinueEnabled;
    private final boolean isContinueVisible;
    private final int maxAddressLength;
    private final ImmutableList<UiSavedAddress> recentAddressesList;
    private final ImmutableList<UiSavedAddress> savedAddressesList;
    private final boolean shouldRequestFocus;
    private final boolean shouldShowAddressLists;
    private final boolean shouldShowScanTooltipSavedAddresses;
    private final boolean showExpandRecentAddressesCta;
    private final boolean showSavedAddressLoadingSpinner;

    public static /* synthetic */ CryptoTransferSendSavedAddressViewState copy$default(CryptoTransferSendSavedAddressViewState cryptoTransferSendSavedAddressViewState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, String str2, int i, ImmutableList immutableList, ImmutableList immutableList2, boolean z7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = cryptoTransferSendSavedAddressViewState.showSavedAddressLoadingSpinner;
        }
        if ((i2 & 2) != 0) {
            z2 = cryptoTransferSendSavedAddressViewState.shouldShowScanTooltipSavedAddresses;
        }
        if ((i2 & 4) != 0) {
            z3 = cryptoTransferSendSavedAddressViewState.shouldShowAddressLists;
        }
        if ((i2 & 8) != 0) {
            z4 = cryptoTransferSendSavedAddressViewState.shouldRequestFocus;
        }
        if ((i2 & 16) != 0) {
            z5 = cryptoTransferSendSavedAddressViewState.isContinueEnabled;
        }
        if ((i2 & 32) != 0) {
            z6 = cryptoTransferSendSavedAddressViewState.isContinueVisible;
        }
        if ((i2 & 64) != 0) {
            str = cryptoTransferSendSavedAddressViewState.currencyCode;
        }
        if ((i2 & 128) != 0) {
            str2 = cryptoTransferSendSavedAddressViewState.address;
        }
        if ((i2 & 256) != 0) {
            i = cryptoTransferSendSavedAddressViewState.maxAddressLength;
        }
        if ((i2 & 512) != 0) {
            immutableList = cryptoTransferSendSavedAddressViewState.recentAddressesList;
        }
        if ((i2 & 1024) != 0) {
            immutableList2 = cryptoTransferSendSavedAddressViewState.savedAddressesList;
        }
        if ((i2 & 2048) != 0) {
            z7 = cryptoTransferSendSavedAddressViewState.showExpandRecentAddressesCta;
        }
        ImmutableList immutableList3 = immutableList2;
        boolean z8 = z7;
        int i3 = i;
        ImmutableList immutableList4 = immutableList;
        String str3 = str;
        String str4 = str2;
        boolean z9 = z5;
        boolean z10 = z6;
        return cryptoTransferSendSavedAddressViewState.copy(z, z2, z3, z4, z9, z10, str3, str4, i3, immutableList4, immutableList3, z8);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowSavedAddressLoadingSpinner() {
        return this.showSavedAddressLoadingSpinner;
    }

    public final ImmutableList<UiSavedAddress> component10() {
        return this.recentAddressesList;
    }

    public final ImmutableList<UiSavedAddress> component11() {
        return this.savedAddressesList;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getShowExpandRecentAddressesCta() {
        return this.showExpandRecentAddressesCta;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldShowScanTooltipSavedAddresses() {
        return this.shouldShowScanTooltipSavedAddresses;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldShowAddressLists() {
        return this.shouldShowAddressLists;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShouldRequestFocus() {
        return this.shouldRequestFocus;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsContinueEnabled() {
        return this.isContinueEnabled;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsContinueVisible() {
        return this.isContinueVisible;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component9, reason: from getter */
    public final int getMaxAddressLength() {
        return this.maxAddressLength;
    }

    public final CryptoTransferSendSavedAddressViewState copy(boolean showSavedAddressLoadingSpinner, boolean shouldShowScanTooltipSavedAddresses, boolean shouldShowAddressLists, boolean shouldRequestFocus, boolean isContinueEnabled, boolean isContinueVisible, String currencyCode, String address, int maxAddressLength, ImmutableList<UiSavedAddress> recentAddressesList, ImmutableList<UiSavedAddress> savedAddressesList, boolean showExpandRecentAddressesCta) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(recentAddressesList, "recentAddressesList");
        Intrinsics.checkNotNullParameter(savedAddressesList, "savedAddressesList");
        return new CryptoTransferSendSavedAddressViewState(showSavedAddressLoadingSpinner, shouldShowScanTooltipSavedAddresses, shouldShowAddressLists, shouldRequestFocus, isContinueEnabled, isContinueVisible, currencyCode, address, maxAddressLength, recentAddressesList, savedAddressesList, showExpandRecentAddressesCta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferSendSavedAddressViewState)) {
            return false;
        }
        CryptoTransferSendSavedAddressViewState cryptoTransferSendSavedAddressViewState = (CryptoTransferSendSavedAddressViewState) other;
        return this.showSavedAddressLoadingSpinner == cryptoTransferSendSavedAddressViewState.showSavedAddressLoadingSpinner && this.shouldShowScanTooltipSavedAddresses == cryptoTransferSendSavedAddressViewState.shouldShowScanTooltipSavedAddresses && this.shouldShowAddressLists == cryptoTransferSendSavedAddressViewState.shouldShowAddressLists && this.shouldRequestFocus == cryptoTransferSendSavedAddressViewState.shouldRequestFocus && this.isContinueEnabled == cryptoTransferSendSavedAddressViewState.isContinueEnabled && this.isContinueVisible == cryptoTransferSendSavedAddressViewState.isContinueVisible && Intrinsics.areEqual(this.currencyCode, cryptoTransferSendSavedAddressViewState.currencyCode) && Intrinsics.areEqual(this.address, cryptoTransferSendSavedAddressViewState.address) && this.maxAddressLength == cryptoTransferSendSavedAddressViewState.maxAddressLength && Intrinsics.areEqual(this.recentAddressesList, cryptoTransferSendSavedAddressViewState.recentAddressesList) && Intrinsics.areEqual(this.savedAddressesList, cryptoTransferSendSavedAddressViewState.savedAddressesList) && this.showExpandRecentAddressesCta == cryptoTransferSendSavedAddressViewState.showExpandRecentAddressesCta;
    }

    public int hashCode() {
        return (((((((((((((((((((((Boolean.hashCode(this.showSavedAddressLoadingSpinner) * 31) + Boolean.hashCode(this.shouldShowScanTooltipSavedAddresses)) * 31) + Boolean.hashCode(this.shouldShowAddressLists)) * 31) + Boolean.hashCode(this.shouldRequestFocus)) * 31) + Boolean.hashCode(this.isContinueEnabled)) * 31) + Boolean.hashCode(this.isContinueVisible)) * 31) + this.currencyCode.hashCode()) * 31) + this.address.hashCode()) * 31) + Integer.hashCode(this.maxAddressLength)) * 31) + this.recentAddressesList.hashCode()) * 31) + this.savedAddressesList.hashCode()) * 31) + Boolean.hashCode(this.showExpandRecentAddressesCta);
    }

    public String toString() {
        return "CryptoTransferSendSavedAddressViewState(showSavedAddressLoadingSpinner=" + this.showSavedAddressLoadingSpinner + ", shouldShowScanTooltipSavedAddresses=" + this.shouldShowScanTooltipSavedAddresses + ", shouldShowAddressLists=" + this.shouldShowAddressLists + ", shouldRequestFocus=" + this.shouldRequestFocus + ", isContinueEnabled=" + this.isContinueEnabled + ", isContinueVisible=" + this.isContinueVisible + ", currencyCode=" + this.currencyCode + ", address=" + this.address + ", maxAddressLength=" + this.maxAddressLength + ", recentAddressesList=" + this.recentAddressesList + ", savedAddressesList=" + this.savedAddressesList + ", showExpandRecentAddressesCta=" + this.showExpandRecentAddressesCta + ")";
    }

    public CryptoTransferSendSavedAddressViewState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String currencyCode, String address, int i, ImmutableList<UiSavedAddress> recentAddressesList, ImmutableList<UiSavedAddress> savedAddressesList, boolean z7) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(recentAddressesList, "recentAddressesList");
        Intrinsics.checkNotNullParameter(savedAddressesList, "savedAddressesList");
        this.showSavedAddressLoadingSpinner = z;
        this.shouldShowScanTooltipSavedAddresses = z2;
        this.shouldShowAddressLists = z3;
        this.shouldRequestFocus = z4;
        this.isContinueEnabled = z5;
        this.isContinueVisible = z6;
        this.currencyCode = currencyCode;
        this.address = address;
        this.maxAddressLength = i;
        this.recentAddressesList = recentAddressesList;
        this.savedAddressesList = savedAddressesList;
        this.showExpandRecentAddressesCta = z7;
    }

    public final boolean getShowSavedAddressLoadingSpinner() {
        return this.showSavedAddressLoadingSpinner;
    }

    public final boolean getShouldShowScanTooltipSavedAddresses() {
        return this.shouldShowScanTooltipSavedAddresses;
    }

    public final boolean getShouldShowAddressLists() {
        return this.shouldShowAddressLists;
    }

    public final boolean getShouldRequestFocus() {
        return this.shouldRequestFocus;
    }

    public final boolean isContinueEnabled() {
        return this.isContinueEnabled;
    }

    public final boolean isContinueVisible() {
        return this.isContinueVisible;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getAddress() {
        return this.address;
    }

    public final int getMaxAddressLength() {
        return this.maxAddressLength;
    }

    public final ImmutableList<UiSavedAddress> getRecentAddressesList() {
        return this.recentAddressesList;
    }

    public final ImmutableList<UiSavedAddress> getSavedAddressesList() {
        return this.savedAddressesList;
    }

    public final boolean getShowExpandRecentAddressesCta() {
        return this.showExpandRecentAddressesCta;
    }
}
