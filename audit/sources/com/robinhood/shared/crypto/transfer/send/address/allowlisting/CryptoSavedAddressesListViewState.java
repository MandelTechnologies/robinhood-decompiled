package com.robinhood.shared.crypto.transfer.send.address.allowlisting;

import com.robinhood.shared.crypto.transfer.send.address.UiSavedAddress;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoSavedAddressesListViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00014Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\u0087\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\nHÆ\u0001J\u0013\u0010/\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001cR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001c¨\u00065"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListViewState;", "", "currencyCode", "", "currencyPairId", "Ljava/util/UUID;", "currencyId", "topBarState", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListViewState$TopBarState;", "isLoading", "", "isAllowlistingEnabled", "pendingSavedAddresses", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/transfer/send/address/UiSavedAddress;", "validSavedAddresses", "showEmptyState", "shouldShowSectionHeader", "showAddAddressButton", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListViewState$TopBarState;ZZLkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;ZZZ)V", "getCurrencyCode", "()Ljava/lang/String;", "getCurrencyPairId", "()Ljava/util/UUID;", "getCurrencyId", "getTopBarState", "()Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListViewState$TopBarState;", "()Z", "getPendingSavedAddresses", "()Lkotlinx/collections/immutable/ImmutableList;", "getValidSavedAddresses", "getShowEmptyState", "getShouldShowSectionHeader", "getShowAddAddressButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "TopBarState", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoSavedAddressesListViewState {
    public static final int $stable = 8;
    private final String currencyCode;
    private final UUID currencyId;
    private final UUID currencyPairId;
    private final boolean isAllowlistingEnabled;
    private final boolean isLoading;
    private final ImmutableList<UiSavedAddress> pendingSavedAddresses;
    private final boolean shouldShowSectionHeader;
    private final boolean showAddAddressButton;
    private final boolean showEmptyState;
    private final TopBarState topBarState;
    private final ImmutableList<UiSavedAddress> validSavedAddresses;

    public static /* synthetic */ CryptoSavedAddressesListViewState copy$default(CryptoSavedAddressesListViewState cryptoSavedAddressesListViewState, String str, UUID uuid, UUID uuid2, TopBarState topBarState, boolean z, boolean z2, ImmutableList immutableList, ImmutableList immutableList2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoSavedAddressesListViewState.currencyCode;
        }
        if ((i & 2) != 0) {
            uuid = cryptoSavedAddressesListViewState.currencyPairId;
        }
        if ((i & 4) != 0) {
            uuid2 = cryptoSavedAddressesListViewState.currencyId;
        }
        if ((i & 8) != 0) {
            topBarState = cryptoSavedAddressesListViewState.topBarState;
        }
        if ((i & 16) != 0) {
            z = cryptoSavedAddressesListViewState.isLoading;
        }
        if ((i & 32) != 0) {
            z2 = cryptoSavedAddressesListViewState.isAllowlistingEnabled;
        }
        if ((i & 64) != 0) {
            immutableList = cryptoSavedAddressesListViewState.pendingSavedAddresses;
        }
        if ((i & 128) != 0) {
            immutableList2 = cryptoSavedAddressesListViewState.validSavedAddresses;
        }
        if ((i & 256) != 0) {
            z3 = cryptoSavedAddressesListViewState.showEmptyState;
        }
        if ((i & 512) != 0) {
            z4 = cryptoSavedAddressesListViewState.shouldShowSectionHeader;
        }
        if ((i & 1024) != 0) {
            z5 = cryptoSavedAddressesListViewState.showAddAddressButton;
        }
        boolean z6 = z4;
        boolean z7 = z5;
        ImmutableList immutableList3 = immutableList2;
        boolean z8 = z3;
        boolean z9 = z2;
        ImmutableList immutableList4 = immutableList;
        boolean z10 = z;
        UUID uuid3 = uuid2;
        return cryptoSavedAddressesListViewState.copy(str, uuid, uuid3, topBarState, z10, z9, immutableList4, immutableList3, z8, z6, z7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShouldShowSectionHeader() {
        return this.shouldShowSectionHeader;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShowAddAddressButton() {
        return this.showAddAddressButton;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getCurrencyId() {
        return this.currencyId;
    }

    /* renamed from: component4, reason: from getter */
    public final TopBarState getTopBarState() {
        return this.topBarState;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsAllowlistingEnabled() {
        return this.isAllowlistingEnabled;
    }

    public final ImmutableList<UiSavedAddress> component7() {
        return this.pendingSavedAddresses;
    }

    public final ImmutableList<UiSavedAddress> component8() {
        return this.validSavedAddresses;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowEmptyState() {
        return this.showEmptyState;
    }

    public final CryptoSavedAddressesListViewState copy(String currencyCode, UUID currencyPairId, UUID currencyId, TopBarState topBarState, boolean isLoading, boolean isAllowlistingEnabled, ImmutableList<UiSavedAddress> pendingSavedAddresses, ImmutableList<UiSavedAddress> validSavedAddresses, boolean showEmptyState, boolean shouldShowSectionHeader, boolean showAddAddressButton) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(topBarState, "topBarState");
        Intrinsics.checkNotNullParameter(pendingSavedAddresses, "pendingSavedAddresses");
        Intrinsics.checkNotNullParameter(validSavedAddresses, "validSavedAddresses");
        return new CryptoSavedAddressesListViewState(currencyCode, currencyPairId, currencyId, topBarState, isLoading, isAllowlistingEnabled, pendingSavedAddresses, validSavedAddresses, showEmptyState, shouldShowSectionHeader, showAddAddressButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoSavedAddressesListViewState)) {
            return false;
        }
        CryptoSavedAddressesListViewState cryptoSavedAddressesListViewState = (CryptoSavedAddressesListViewState) other;
        return Intrinsics.areEqual(this.currencyCode, cryptoSavedAddressesListViewState.currencyCode) && Intrinsics.areEqual(this.currencyPairId, cryptoSavedAddressesListViewState.currencyPairId) && Intrinsics.areEqual(this.currencyId, cryptoSavedAddressesListViewState.currencyId) && Intrinsics.areEqual(this.topBarState, cryptoSavedAddressesListViewState.topBarState) && this.isLoading == cryptoSavedAddressesListViewState.isLoading && this.isAllowlistingEnabled == cryptoSavedAddressesListViewState.isAllowlistingEnabled && Intrinsics.areEqual(this.pendingSavedAddresses, cryptoSavedAddressesListViewState.pendingSavedAddresses) && Intrinsics.areEqual(this.validSavedAddresses, cryptoSavedAddressesListViewState.validSavedAddresses) && this.showEmptyState == cryptoSavedAddressesListViewState.showEmptyState && this.shouldShowSectionHeader == cryptoSavedAddressesListViewState.shouldShowSectionHeader && this.showAddAddressButton == cryptoSavedAddressesListViewState.showAddAddressButton;
    }

    public int hashCode() {
        int iHashCode = this.currencyCode.hashCode() * 31;
        UUID uuid = this.currencyPairId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.currencyId;
        return ((((((((((((((((iHashCode2 + (uuid2 != null ? uuid2.hashCode() : 0)) * 31) + this.topBarState.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isAllowlistingEnabled)) * 31) + this.pendingSavedAddresses.hashCode()) * 31) + this.validSavedAddresses.hashCode()) * 31) + Boolean.hashCode(this.showEmptyState)) * 31) + Boolean.hashCode(this.shouldShowSectionHeader)) * 31) + Boolean.hashCode(this.showAddAddressButton);
    }

    public String toString() {
        return "CryptoSavedAddressesListViewState(currencyCode=" + this.currencyCode + ", currencyPairId=" + this.currencyPairId + ", currencyId=" + this.currencyId + ", topBarState=" + this.topBarState + ", isLoading=" + this.isLoading + ", isAllowlistingEnabled=" + this.isAllowlistingEnabled + ", pendingSavedAddresses=" + this.pendingSavedAddresses + ", validSavedAddresses=" + this.validSavedAddresses + ", showEmptyState=" + this.showEmptyState + ", shouldShowSectionHeader=" + this.shouldShowSectionHeader + ", showAddAddressButton=" + this.showAddAddressButton + ")";
    }

    public CryptoSavedAddressesListViewState(String currencyCode, UUID uuid, UUID uuid2, TopBarState topBarState, boolean z, boolean z2, ImmutableList<UiSavedAddress> pendingSavedAddresses, ImmutableList<UiSavedAddress> validSavedAddresses, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(topBarState, "topBarState");
        Intrinsics.checkNotNullParameter(pendingSavedAddresses, "pendingSavedAddresses");
        Intrinsics.checkNotNullParameter(validSavedAddresses, "validSavedAddresses");
        this.currencyCode = currencyCode;
        this.currencyPairId = uuid;
        this.currencyId = uuid2;
        this.topBarState = topBarState;
        this.isLoading = z;
        this.isAllowlistingEnabled = z2;
        this.pendingSavedAddresses = pendingSavedAddresses;
        this.validSavedAddresses = validSavedAddresses;
        this.showEmptyState = z3;
        this.shouldShowSectionHeader = z4;
        this.showAddAddressButton = z5;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final UUID getCurrencyId() {
        return this.currencyId;
    }

    public final TopBarState getTopBarState() {
        return this.topBarState;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isAllowlistingEnabled() {
        return this.isAllowlistingEnabled;
    }

    public final ImmutableList<UiSavedAddress> getPendingSavedAddresses() {
        return this.pendingSavedAddresses;
    }

    public final ImmutableList<UiSavedAddress> getValidSavedAddresses() {
        return this.validSavedAddresses;
    }

    public final boolean getShowEmptyState() {
        return this.showEmptyState;
    }

    public final boolean getShouldShowSectionHeader() {
        return this.shouldShowSectionHeader;
    }

    public final boolean getShowAddAddressButton() {
        return this.showAddAddressButton;
    }

    /* compiled from: CryptoSavedAddressesListViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListViewState$TopBarState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "showProgressBar", "", "getShowProgressBar", "()Z", "Loading", "Loaded", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListViewState$TopBarState$Loaded;", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListViewState$TopBarState$Loading;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface TopBarState {
        boolean getShowProgressBar();

        StringResource getTitle();

        /* compiled from: CryptoSavedAddressesListViewState.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListViewState$TopBarState$Loading;", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListViewState$TopBarState;", "showProgressBar", "", "<init>", "(Z)V", "getShowProgressBar", "()Z", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements TopBarState {
            public static final int $stable = StringResource.$stable;
            private final boolean showProgressBar;
            private final StringResource title = StringResource.INSTANCE.invoke("Placeholder");

            public static /* synthetic */ Loading copy$default(Loading loading, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = loading.showProgressBar;
                }
                return loading.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowProgressBar() {
                return this.showProgressBar;
            }

            public final Loading copy(boolean showProgressBar) {
                return new Loading(showProgressBar);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && this.showProgressBar == ((Loading) other).showProgressBar;
            }

            public int hashCode() {
                return Boolean.hashCode(this.showProgressBar);
            }

            public String toString() {
                return "Loading(showProgressBar=" + this.showProgressBar + ")";
            }

            public Loading(boolean z) {
                this.showProgressBar = z;
            }

            @Override // com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListViewState.TopBarState
            public boolean getShowProgressBar() {
                return this.showProgressBar;
            }

            @Override // com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListViewState.TopBarState
            public StringResource getTitle() {
                return this.title;
            }
        }

        /* compiled from: CryptoSavedAddressesListViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListViewState$TopBarState$Loaded;", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListViewState$TopBarState;", "title", "Lcom/robinhood/utils/resource/StringResource;", "showProgressBar", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Z)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getShowProgressBar", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loaded implements TopBarState {
            public static final int $stable = StringResource.$stable;
            private final boolean showProgressBar;
            private final StringResource title;

            public static /* synthetic */ Loaded copy$default(Loaded loaded, StringResource stringResource, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = loaded.title;
                }
                if ((i & 2) != 0) {
                    z = loaded.showProgressBar;
                }
                return loaded.copy(stringResource, z);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowProgressBar() {
                return this.showProgressBar;
            }

            public final Loaded copy(StringResource title, boolean showProgressBar) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new Loaded(title, showProgressBar);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) other;
                return Intrinsics.areEqual(this.title, loaded.title) && this.showProgressBar == loaded.showProgressBar;
            }

            public int hashCode() {
                return (this.title.hashCode() * 31) + Boolean.hashCode(this.showProgressBar);
            }

            public String toString() {
                return "Loaded(title=" + this.title + ", showProgressBar=" + this.showProgressBar + ")";
            }

            public Loaded(StringResource title, boolean z) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.showProgressBar = z;
            }

            @Override // com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListViewState.TopBarState
            public StringResource getTitle() {
                return this.title;
            }

            @Override // com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListViewState.TopBarState
            public boolean getShowProgressBar() {
                return this.showProgressBar;
            }
        }
    }
}
