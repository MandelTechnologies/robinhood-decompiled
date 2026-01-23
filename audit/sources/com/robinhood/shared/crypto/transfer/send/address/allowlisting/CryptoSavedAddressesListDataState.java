package com.robinhood.shared.crypto.transfer.send.address.allowlisting;

import com.robinhood.models.api.transfer.ApiAllowlistingStatus;
import com.robinhood.models.api.transfer.ApiSavedAddress;
import com.robinhood.models.api.transfer.ApiSavedAddresses;
import com.robinhood.models.api.transfer.ApiSavedAddresses2;
import com.robinhood.models.crypto.p314db.transfer.AllowlistStatus;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.send.address.UiSavedAddress;
import com.robinhood.shared.crypto.transfer.send.address.UiSavedAddress2;
import com.robinhood.shared.crypto.transfer.send.address.allowlisting.CryptoSavedAddressesListViewState;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoSavedAddressesListDataState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u00105\u001a\u00020\u00152\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0011\u0010\u001e\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8F¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0011\u0010*\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b+\u0010\u0016R\u0011\u0010,\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b-\u0010\u0016R\u0011\u0010.\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b/\u0010\u0016¨\u0006:"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDataState;", "", "currencyPairId", "Ljava/util/UUID;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "allowlistStatus", "Lcom/robinhood/models/crypto/db/transfer/AllowlistStatus;", "apiSavedAddresses", "Lcom/robinhood/models/api/transfer/ApiSavedAddresses;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/transfer/AllowlistStatus;Lcom/robinhood/models/api/transfer/ApiSavedAddresses;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getAllowlistStatus", "()Lcom/robinhood/models/crypto/db/transfer/AllowlistStatus;", "getApiSavedAddresses", "()Lcom/robinhood/models/api/transfer/ApiSavedAddresses;", "isShowingAggregatedList", "", "()Z", "isLoading", "currencyCode", "", "getCurrencyCode", "()Ljava/lang/String;", "currencyId", "getCurrencyId", "isAllowlistEnabled", "topBarState", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListViewState$TopBarState;", "getTopBarState", "()Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListViewState$TopBarState;", "pendingSavedAddresses", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/transfer/send/address/UiSavedAddress;", "getPendingSavedAddresses", "()Lkotlinx/collections/immutable/ImmutableList;", "validSavedAddresses", "getValidSavedAddresses", "showEmptyState", "getShowEmptyState", "shouldShowSectionHeader", "getShouldShowSectionHeader", "showAddAddressButton", "getShowAddAddressButton", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class CryptoSavedAddressesListDataState {
    public static final int $stable = 8;
    private final AllowlistStatus allowlistStatus;
    private final ApiSavedAddresses apiSavedAddresses;
    private final UiCurrencyPair currencyPair;
    private final UUID currencyPairId;

    /* compiled from: CryptoSavedAddressesListDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAllowlistingStatus.Status.values().length];
            try {
                iArr[ApiAllowlistingStatus.Status.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAllowlistingStatus.Status.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAllowlistingStatus.Status.GLOBAL_HOLD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiAllowlistingStatus.Status.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CryptoSavedAddressesListDataState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ CryptoSavedAddressesListDataState copy$default(CryptoSavedAddressesListDataState cryptoSavedAddressesListDataState, UUID uuid, UiCurrencyPair uiCurrencyPair, AllowlistStatus allowlistStatus, ApiSavedAddresses apiSavedAddresses, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cryptoSavedAddressesListDataState.currencyPairId;
        }
        if ((i & 2) != 0) {
            uiCurrencyPair = cryptoSavedAddressesListDataState.currencyPair;
        }
        if ((i & 4) != 0) {
            allowlistStatus = cryptoSavedAddressesListDataState.allowlistStatus;
        }
        if ((i & 8) != 0) {
            apiSavedAddresses = cryptoSavedAddressesListDataState.apiSavedAddresses;
        }
        return cryptoSavedAddressesListDataState.copy(uuid, uiCurrencyPair, allowlistStatus, apiSavedAddresses);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    /* renamed from: component2, reason: from getter */
    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    /* renamed from: component3, reason: from getter */
    public final AllowlistStatus getAllowlistStatus() {
        return this.allowlistStatus;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiSavedAddresses getApiSavedAddresses() {
        return this.apiSavedAddresses;
    }

    public final CryptoSavedAddressesListDataState copy(UUID currencyPairId, UiCurrencyPair currencyPair, AllowlistStatus allowlistStatus, ApiSavedAddresses apiSavedAddresses) {
        return new CryptoSavedAddressesListDataState(currencyPairId, currencyPair, allowlistStatus, apiSavedAddresses);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoSavedAddressesListDataState)) {
            return false;
        }
        CryptoSavedAddressesListDataState cryptoSavedAddressesListDataState = (CryptoSavedAddressesListDataState) other;
        return Intrinsics.areEqual(this.currencyPairId, cryptoSavedAddressesListDataState.currencyPairId) && Intrinsics.areEqual(this.currencyPair, cryptoSavedAddressesListDataState.currencyPair) && Intrinsics.areEqual(this.allowlistStatus, cryptoSavedAddressesListDataState.allowlistStatus) && Intrinsics.areEqual(this.apiSavedAddresses, cryptoSavedAddressesListDataState.apiSavedAddresses);
    }

    public int hashCode() {
        UUID uuid = this.currencyPairId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        int iHashCode2 = (iHashCode + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31;
        AllowlistStatus allowlistStatus = this.allowlistStatus;
        int iHashCode3 = (iHashCode2 + (allowlistStatus == null ? 0 : allowlistStatus.hashCode())) * 31;
        ApiSavedAddresses apiSavedAddresses = this.apiSavedAddresses;
        return iHashCode3 + (apiSavedAddresses != null ? apiSavedAddresses.hashCode() : 0);
    }

    public String toString() {
        return "CryptoSavedAddressesListDataState(currencyPairId=" + this.currencyPairId + ", currencyPair=" + this.currencyPair + ", allowlistStatus=" + this.allowlistStatus + ", apiSavedAddresses=" + this.apiSavedAddresses + ")";
    }

    public CryptoSavedAddressesListDataState(UUID uuid, UiCurrencyPair uiCurrencyPair, AllowlistStatus allowlistStatus, ApiSavedAddresses apiSavedAddresses) {
        this.currencyPairId = uuid;
        this.currencyPair = uiCurrencyPair;
        this.allowlistStatus = allowlistStatus;
        this.apiSavedAddresses = apiSavedAddresses;
    }

    public /* synthetic */ CryptoSavedAddressesListDataState(UUID uuid, UiCurrencyPair uiCurrencyPair, AllowlistStatus allowlistStatus, ApiSavedAddresses apiSavedAddresses, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : uiCurrencyPair, (i & 4) != 0 ? null : allowlistStatus, (i & 8) != 0 ? null : apiSavedAddresses);
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    public final AllowlistStatus getAllowlistStatus() {
        return this.allowlistStatus;
    }

    public final ApiSavedAddresses getApiSavedAddresses() {
        return this.apiSavedAddresses;
    }

    private final boolean isShowingAggregatedList() {
        return this.currencyPairId == null;
    }

    public final boolean isLoading() {
        return this.allowlistStatus == null || this.apiSavedAddresses == null;
    }

    public final String getCurrencyCode() {
        String displaySymbol;
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        return (uiCurrencyPair == null || (displaySymbol = uiCurrencyPair.getDisplaySymbol()) == null) ? "" : displaySymbol;
    }

    public final UUID getCurrencyId() {
        UiCurrencyPair uiCurrencyPair = this.currencyPair;
        if (uiCurrencyPair != null) {
            return uiCurrencyPair.getAssetCurrencyId();
        }
        return null;
    }

    public final boolean isAllowlistEnabled() {
        AllowlistStatus allowlistStatus = this.allowlistStatus;
        return allowlistStatus != null && allowlistStatus.isAllowlistEnabled();
    }

    public final CryptoSavedAddressesListViewState.TopBarState getTopBarState() {
        if (isShowingAggregatedList()) {
            return new CryptoSavedAddressesListViewState.TopBarState.Loaded(StringResource.INSTANCE.invoke(C37934R.string.crypto_settings_saved_addresses_title, new Object[0]), false);
        }
        if (this.currencyPair != null) {
            return new CryptoSavedAddressesListViewState.TopBarState.Loaded(StringResource.INSTANCE.invoke(C37934R.string.crypto_settings_saved_addresses_title_withdrawal, this.currencyPair.getDisplaySymbol()), true);
        }
        return new CryptoSavedAddressesListViewState.TopBarState.Loading(true ^ isShowingAggregatedList());
    }

    public final ImmutableList<UiSavedAddress> getPendingSavedAddresses() {
        ApiSavedAddresses apiSavedAddresses = this.apiSavedAddresses;
        List<ApiSavedAddress> results = apiSavedAddresses != null ? apiSavedAddresses.getResults() : null;
        if (results == null) {
            results = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : results) {
            if (((ApiSavedAddress) obj).getStatus() == ApiSavedAddresses2.PENDING) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(UiSavedAddress2.toUiModel((ApiSavedAddress) it.next()));
        }
        return extensions2.toPersistentList(arrayList2);
    }

    public final ImmutableList<UiSavedAddress> getValidSavedAddresses() {
        ApiSavedAddresses apiSavedAddresses = this.apiSavedAddresses;
        List<ApiSavedAddress> results = apiSavedAddresses != null ? apiSavedAddresses.getResults() : null;
        if (results == null) {
            results = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : results) {
            ApiSavedAddress apiSavedAddress = (ApiSavedAddress) obj;
            if (apiSavedAddress.getStatus() == ApiSavedAddresses2.UNRESTRICTED || apiSavedAddress.getStatus() == ApiSavedAddresses2.MATURED) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(UiSavedAddress2.toUiModel((ApiSavedAddress) it.next()));
        }
        return extensions2.toPersistentList(arrayList2);
    }

    public final boolean getShowEmptyState() {
        return !isLoading() && getPendingSavedAddresses().isEmpty() && getValidSavedAddresses().isEmpty();
    }

    public final boolean getShouldShowSectionHeader() {
        return !getPendingSavedAddresses().isEmpty();
    }

    public final boolean getShowAddAddressButton() {
        AllowlistStatus allowlistStatus = this.allowlistStatus;
        ApiAllowlistingStatus.Status status = allowlistStatus != null ? allowlistStatus.getStatus() : null;
        int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == -1) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
