package com.robinhood.shared.crypto.transfer.send.address.saved;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.models.api.transfer.ApiSavedAddress;
import com.robinhood.models.api.transfer.ApiSavedAddresses;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.crypto.transfer.send.address.UiSavedAddress;
import com.robinhood.shared.crypto.transfer.send.address.UiSavedAddress2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoTransferSendSavedAddressDataState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010;\u001a\u00020\fHÂ\u0003J\t\u0010<\u001a\u00020\u000eHÂ\u0003J\t\u0010=\u001a\u00020\u0003HÂ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0011HÂ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\fHÂ\u0003J\u007f\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010A\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\u0006HÖ\u0001J\t\u0010D\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010 \u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010\u0016R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b%\u0010\u0016R\u0011\u0010&\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0016R\u0011\u0010'\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b(\u0010\"R\u0011\u0010)\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u0016R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020-0,8F¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0011\u00102\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b3\u0010\u0016R\u0014\u00104\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0016¨\u0006E"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDataState;", "", "wasScanTooltipSavedAddressesShownBefore", "", "isInitialLoadingCompleted", "maxAddressLength", "", "isLoading", "apiSavedAddresses", "Lcom/robinhood/models/api/transfer/ApiSavedAddresses;", "apiRecentAddresses", "previouslySavedAddress", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "isRecentAddressListExpanded", "cryptoTransferConfig", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "typedAddress", "<init>", "(ZZIZLcom/robinhood/models/api/transfer/ApiSavedAddresses;Lcom/robinhood/models/api/transfer/ApiSavedAddresses;Ljava/lang/String;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;ZLcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;Ljava/lang/String;)V", "getWasScanTooltipSavedAddressesShownBefore", "()Z", "getMaxAddressLength", "()I", "getApiSavedAddresses", "()Lcom/robinhood/models/api/transfer/ApiSavedAddresses;", "getApiRecentAddresses", "shouldShowScanTooltipSavedAddresses", "getShouldShowScanTooltipSavedAddresses", "shouldShowAddressLists", "getShouldShowAddressLists", PlaceTypes.ADDRESS, "getAddress", "()Ljava/lang/String;", "shouldRequestFocus", "getShouldRequestFocus", "isContinueEnabled", "isContinueVisible", "currencyCode", "getCurrencyCode", CryptoTransferSendSavedAddressComposableKt.ExpandCtaItemKey, "getShowExpandRecentAddressesCta", "recentAddressesList", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/transfer/send/address/UiSavedAddress;", "getRecentAddressesList", "()Lkotlinx/collections/immutable/ImmutableList;", "savedAddressesList", "getSavedAddressesList", "showSavedAddressLoadingSpinner", "getShowSavedAddressLoadingSpinner", "isAddressValid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferSendSavedAddressDataState {
    public static final int $stable = 8;
    private final String address;
    private final ApiSavedAddresses apiRecentAddresses;
    private final ApiSavedAddresses apiSavedAddresses;
    private final CryptoTransferConfig cryptoTransferConfig;
    private final boolean isInitialLoadingCompleted;
    private final boolean isLoading;
    private final boolean isRecentAddressListExpanded;
    private final int maxAddressLength;
    private final String previouslySavedAddress;
    private final String typedAddress;
    private final UiCurrencyPair uiCurrencyPair;
    private final boolean wasScanTooltipSavedAddressesShownBefore;

    /* renamed from: component10, reason: from getter */
    private final CryptoTransferConfig getCryptoTransferConfig() {
        return this.cryptoTransferConfig;
    }

    /* renamed from: component11, reason: from getter */
    private final String getTypedAddress() {
        return this.typedAddress;
    }

    /* renamed from: component7, reason: from getter */
    private final String getPreviouslySavedAddress() {
        return this.previouslySavedAddress;
    }

    /* renamed from: component8, reason: from getter */
    private final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    /* renamed from: component9, reason: from getter */
    private final boolean getIsRecentAddressListExpanded() {
        return this.isRecentAddressListExpanded;
    }

    public static /* synthetic */ CryptoTransferSendSavedAddressDataState copy$default(CryptoTransferSendSavedAddressDataState cryptoTransferSendSavedAddressDataState, boolean z, boolean z2, int i, boolean z3, ApiSavedAddresses apiSavedAddresses, ApiSavedAddresses apiSavedAddresses2, String str, UiCurrencyPair uiCurrencyPair, boolean z4, CryptoTransferConfig cryptoTransferConfig, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = cryptoTransferSendSavedAddressDataState.wasScanTooltipSavedAddressesShownBefore;
        }
        if ((i2 & 2) != 0) {
            z2 = cryptoTransferSendSavedAddressDataState.isInitialLoadingCompleted;
        }
        if ((i2 & 4) != 0) {
            i = cryptoTransferSendSavedAddressDataState.maxAddressLength;
        }
        if ((i2 & 8) != 0) {
            z3 = cryptoTransferSendSavedAddressDataState.isLoading;
        }
        if ((i2 & 16) != 0) {
            apiSavedAddresses = cryptoTransferSendSavedAddressDataState.apiSavedAddresses;
        }
        if ((i2 & 32) != 0) {
            apiSavedAddresses2 = cryptoTransferSendSavedAddressDataState.apiRecentAddresses;
        }
        if ((i2 & 64) != 0) {
            str = cryptoTransferSendSavedAddressDataState.previouslySavedAddress;
        }
        if ((i2 & 128) != 0) {
            uiCurrencyPair = cryptoTransferSendSavedAddressDataState.uiCurrencyPair;
        }
        if ((i2 & 256) != 0) {
            z4 = cryptoTransferSendSavedAddressDataState.isRecentAddressListExpanded;
        }
        if ((i2 & 512) != 0) {
            cryptoTransferConfig = cryptoTransferSendSavedAddressDataState.cryptoTransferConfig;
        }
        if ((i2 & 1024) != 0) {
            str2 = cryptoTransferSendSavedAddressDataState.typedAddress;
        }
        CryptoTransferConfig cryptoTransferConfig2 = cryptoTransferConfig;
        String str3 = str2;
        UiCurrencyPair uiCurrencyPair2 = uiCurrencyPair;
        boolean z5 = z4;
        ApiSavedAddresses apiSavedAddresses3 = apiSavedAddresses2;
        String str4 = str;
        ApiSavedAddresses apiSavedAddresses4 = apiSavedAddresses;
        int i3 = i;
        return cryptoTransferSendSavedAddressDataState.copy(z, z2, i3, z3, apiSavedAddresses4, apiSavedAddresses3, str4, uiCurrencyPair2, z5, cryptoTransferConfig2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getWasScanTooltipSavedAddressesShownBefore() {
        return this.wasScanTooltipSavedAddressesShownBefore;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsInitialLoadingCompleted() {
        return this.isInitialLoadingCompleted;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxAddressLength() {
        return this.maxAddressLength;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiSavedAddresses getApiSavedAddresses() {
        return this.apiSavedAddresses;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiSavedAddresses getApiRecentAddresses() {
        return this.apiRecentAddresses;
    }

    public final CryptoTransferSendSavedAddressDataState copy(boolean wasScanTooltipSavedAddressesShownBefore, boolean isInitialLoadingCompleted, int maxAddressLength, boolean isLoading, ApiSavedAddresses apiSavedAddresses, ApiSavedAddresses apiRecentAddresses, String previouslySavedAddress, UiCurrencyPair uiCurrencyPair, boolean isRecentAddressListExpanded, CryptoTransferConfig cryptoTransferConfig, String typedAddress) {
        Intrinsics.checkNotNullParameter(previouslySavedAddress, "previouslySavedAddress");
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        return new CryptoTransferSendSavedAddressDataState(wasScanTooltipSavedAddressesShownBefore, isInitialLoadingCompleted, maxAddressLength, isLoading, apiSavedAddresses, apiRecentAddresses, previouslySavedAddress, uiCurrencyPair, isRecentAddressListExpanded, cryptoTransferConfig, typedAddress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferSendSavedAddressDataState)) {
            return false;
        }
        CryptoTransferSendSavedAddressDataState cryptoTransferSendSavedAddressDataState = (CryptoTransferSendSavedAddressDataState) other;
        return this.wasScanTooltipSavedAddressesShownBefore == cryptoTransferSendSavedAddressDataState.wasScanTooltipSavedAddressesShownBefore && this.isInitialLoadingCompleted == cryptoTransferSendSavedAddressDataState.isInitialLoadingCompleted && this.maxAddressLength == cryptoTransferSendSavedAddressDataState.maxAddressLength && this.isLoading == cryptoTransferSendSavedAddressDataState.isLoading && Intrinsics.areEqual(this.apiSavedAddresses, cryptoTransferSendSavedAddressDataState.apiSavedAddresses) && Intrinsics.areEqual(this.apiRecentAddresses, cryptoTransferSendSavedAddressDataState.apiRecentAddresses) && Intrinsics.areEqual(this.previouslySavedAddress, cryptoTransferSendSavedAddressDataState.previouslySavedAddress) && Intrinsics.areEqual(this.uiCurrencyPair, cryptoTransferSendSavedAddressDataState.uiCurrencyPair) && this.isRecentAddressListExpanded == cryptoTransferSendSavedAddressDataState.isRecentAddressListExpanded && Intrinsics.areEqual(this.cryptoTransferConfig, cryptoTransferSendSavedAddressDataState.cryptoTransferConfig) && Intrinsics.areEqual(this.typedAddress, cryptoTransferSendSavedAddressDataState.typedAddress);
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.wasScanTooltipSavedAddressesShownBefore) * 31) + Boolean.hashCode(this.isInitialLoadingCompleted)) * 31) + Integer.hashCode(this.maxAddressLength)) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        ApiSavedAddresses apiSavedAddresses = this.apiSavedAddresses;
        int iHashCode2 = (iHashCode + (apiSavedAddresses == null ? 0 : apiSavedAddresses.hashCode())) * 31;
        ApiSavedAddresses apiSavedAddresses2 = this.apiRecentAddresses;
        int iHashCode3 = (((((((iHashCode2 + (apiSavedAddresses2 == null ? 0 : apiSavedAddresses2.hashCode())) * 31) + this.previouslySavedAddress.hashCode()) * 31) + this.uiCurrencyPair.hashCode()) * 31) + Boolean.hashCode(this.isRecentAddressListExpanded)) * 31;
        CryptoTransferConfig cryptoTransferConfig = this.cryptoTransferConfig;
        int iHashCode4 = (iHashCode3 + (cryptoTransferConfig == null ? 0 : cryptoTransferConfig.hashCode())) * 31;
        String str = this.typedAddress;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CryptoTransferSendSavedAddressDataState(wasScanTooltipSavedAddressesShownBefore=" + this.wasScanTooltipSavedAddressesShownBefore + ", isInitialLoadingCompleted=" + this.isInitialLoadingCompleted + ", maxAddressLength=" + this.maxAddressLength + ", isLoading=" + this.isLoading + ", apiSavedAddresses=" + this.apiSavedAddresses + ", apiRecentAddresses=" + this.apiRecentAddresses + ", previouslySavedAddress=" + this.previouslySavedAddress + ", uiCurrencyPair=" + this.uiCurrencyPair + ", isRecentAddressListExpanded=" + this.isRecentAddressListExpanded + ", cryptoTransferConfig=" + this.cryptoTransferConfig + ", typedAddress=" + this.typedAddress + ")";
    }

    public CryptoTransferSendSavedAddressDataState(boolean z, boolean z2, int i, boolean z3, ApiSavedAddresses apiSavedAddresses, ApiSavedAddresses apiSavedAddresses2, String previouslySavedAddress, UiCurrencyPair uiCurrencyPair, boolean z4, CryptoTransferConfig cryptoTransferConfig, String str) {
        Intrinsics.checkNotNullParameter(previouslySavedAddress, "previouslySavedAddress");
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        this.wasScanTooltipSavedAddressesShownBefore = z;
        this.isInitialLoadingCompleted = z2;
        this.maxAddressLength = i;
        this.isLoading = z3;
        this.apiSavedAddresses = apiSavedAddresses;
        this.apiRecentAddresses = apiSavedAddresses2;
        this.previouslySavedAddress = previouslySavedAddress;
        this.uiCurrencyPair = uiCurrencyPair;
        this.isRecentAddressListExpanded = z4;
        this.cryptoTransferConfig = cryptoTransferConfig;
        this.typedAddress = str;
        this.address = str != null ? str : previouslySavedAddress;
    }

    public final boolean getWasScanTooltipSavedAddressesShownBefore() {
        return this.wasScanTooltipSavedAddressesShownBefore;
    }

    public final boolean isInitialLoadingCompleted() {
        return this.isInitialLoadingCompleted;
    }

    public final int getMaxAddressLength() {
        return this.maxAddressLength;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ CryptoTransferSendSavedAddressDataState(boolean z, boolean z2, int i, boolean z3, ApiSavedAddresses apiSavedAddresses, ApiSavedAddresses apiSavedAddresses2, String str, UiCurrencyPair uiCurrencyPair, boolean z4, CryptoTransferConfig cryptoTransferConfig, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? new ApiSavedAddresses(CollectionsKt.emptyList()) : apiSavedAddresses, (i2 & 32) != 0 ? new ApiSavedAddresses(CollectionsKt.emptyList()) : apiSavedAddresses2, str, uiCurrencyPair, (i2 & 256) != 0 ? false : z4, (i2 & 512) != 0 ? null : cryptoTransferConfig, (i2 & 1024) != 0 ? null : str2);
    }

    public final ApiSavedAddresses getApiSavedAddresses() {
        return this.apiSavedAddresses;
    }

    public final ApiSavedAddresses getApiRecentAddresses() {
        return this.apiRecentAddresses;
    }

    public final boolean getShouldShowScanTooltipSavedAddresses() {
        return !this.wasScanTooltipSavedAddressesShownBefore;
    }

    public final boolean getShouldShowAddressLists() {
        return this.address.length() == 0;
    }

    public final String getAddress() {
        return this.address;
    }

    public final boolean getShouldRequestFocus() {
        return this.address.length() == 0;
    }

    public final boolean isContinueEnabled() {
        return isAddressValid();
    }

    public final boolean isContinueVisible() {
        return isAddressValid();
    }

    public final String getCurrencyCode() {
        return this.uiCurrencyPair.getAssetCurrency().getCurrencyCode();
    }

    public final boolean getShowExpandRecentAddressesCta() {
        ApiSavedAddresses apiSavedAddresses = this.apiRecentAddresses;
        List<ApiSavedAddress> results = apiSavedAddresses != null ? apiSavedAddresses.getResults() : null;
        if (results == null) {
            results = CollectionsKt.emptyList();
        }
        return (results.isEmpty() || results.size() <= 10 || this.isRecentAddressListExpanded) ? false : true;
    }

    public final ImmutableList<UiSavedAddress> getRecentAddressesList() {
        List<ApiSavedAddress> results;
        ImmutableList<UiSavedAddress> immutableList;
        ApiSavedAddresses apiSavedAddresses = this.apiRecentAddresses;
        if (apiSavedAddresses != null && (results = apiSavedAddresses.getResults()) != null) {
            List<ApiSavedAddress> list = results;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(UiSavedAddress2.toUiModel((ApiSavedAddress) it.next()));
            }
            List listTake = CollectionsKt.take(arrayList, this.isRecentAddressListExpanded ? 30 : 10);
            if (listTake != null && (immutableList = extensions2.toImmutableList(listTake)) != null) {
                return immutableList;
            }
        }
        return extensions2.persistentListOf();
    }

    public final ImmutableList<UiSavedAddress> getSavedAddressesList() {
        List<ApiSavedAddress> results;
        ApiSavedAddresses apiSavedAddresses = this.apiSavedAddresses;
        if (apiSavedAddresses != null && (results = apiSavedAddresses.getResults()) != null) {
            List<ApiSavedAddress> list = results;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(UiSavedAddress2.toUiModel((ApiSavedAddress) it.next()));
            }
            ImmutableList<UiSavedAddress> immutableList = extensions2.toImmutableList(arrayList);
            if (immutableList != null) {
                return immutableList;
            }
        }
        return extensions2.persistentListOf();
    }

    public final boolean getShowSavedAddressLoadingSpinner() {
        return !this.isInitialLoadingCompleted;
    }

    private final boolean isAddressValid() {
        return !StringsKt.isBlank(this.address);
    }
}
