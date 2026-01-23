package com.robinhood.shared.crypto.transfer.send.address.manage;

import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoAddSavedAddressDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÂ\u0003J!\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0018HÖ\u0001J\t\u0010!\u001a\u00020\fHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressDataState;", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "cryptoTransferConfig", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;)V", "isLoading", "", "()Z", "currencyCode", "", "getCurrencyCode", "()Ljava/lang/String;", "apiCurrencyCode", "getApiCurrencyCode", "pageTitle", "Lcom/robinhood/utils/resource/StringResource;", "getPageTitle", "()Lcom/robinhood/utils/resource/StringResource;", "placeholderText", "getPlaceholderText", "maxAddressLength", "", "getMaxAddressLength", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class CryptoAddSavedAddressDataState {
    public static final int $stable = 8;
    private final CryptoTransferConfig cryptoTransferConfig;
    private final UiCurrencyPair uiCurrencyPair;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoAddSavedAddressDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    /* renamed from: component2, reason: from getter */
    private final CryptoTransferConfig getCryptoTransferConfig() {
        return this.cryptoTransferConfig;
    }

    public static /* synthetic */ CryptoAddSavedAddressDataState copy$default(CryptoAddSavedAddressDataState cryptoAddSavedAddressDataState, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            uiCurrencyPair = cryptoAddSavedAddressDataState.uiCurrencyPair;
        }
        if ((i & 2) != 0) {
            cryptoTransferConfig = cryptoAddSavedAddressDataState.cryptoTransferConfig;
        }
        return cryptoAddSavedAddressDataState.copy(uiCurrencyPair, cryptoTransferConfig);
    }

    public final CryptoAddSavedAddressDataState copy(UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig) {
        return new CryptoAddSavedAddressDataState(uiCurrencyPair, cryptoTransferConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoAddSavedAddressDataState)) {
            return false;
        }
        CryptoAddSavedAddressDataState cryptoAddSavedAddressDataState = (CryptoAddSavedAddressDataState) other;
        return Intrinsics.areEqual(this.uiCurrencyPair, cryptoAddSavedAddressDataState.uiCurrencyPair) && Intrinsics.areEqual(this.cryptoTransferConfig, cryptoAddSavedAddressDataState.cryptoTransferConfig);
    }

    public int hashCode() {
        UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
        int iHashCode = (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode()) * 31;
        CryptoTransferConfig cryptoTransferConfig = this.cryptoTransferConfig;
        return iHashCode + (cryptoTransferConfig != null ? cryptoTransferConfig.hashCode() : 0);
    }

    public String toString() {
        return "CryptoAddSavedAddressDataState(uiCurrencyPair=" + this.uiCurrencyPair + ", cryptoTransferConfig=" + this.cryptoTransferConfig + ")";
    }

    public CryptoAddSavedAddressDataState(UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig) {
        this.uiCurrencyPair = uiCurrencyPair;
        this.cryptoTransferConfig = cryptoTransferConfig;
    }

    public /* synthetic */ CryptoAddSavedAddressDataState(UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiCurrencyPair, (i & 2) != 0 ? null : cryptoTransferConfig);
    }

    public final boolean isLoading() {
        return this.uiCurrencyPair == null;
    }

    public final String getCurrencyCode() {
        UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
        if (uiCurrencyPair != null) {
            return uiCurrencyPair.getDisplaySymbol();
        }
        return null;
    }

    public final String getApiCurrencyCode() {
        Currency assetCurrency;
        UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
        if (uiCurrencyPair == null || (assetCurrency = uiCurrencyPair.getAssetCurrency()) == null) {
            return null;
        }
        return assetCurrency.getApiCode();
    }

    public final StringResource getPageTitle() {
        StringResource stringResourceInvoke;
        String currencyCode = getCurrencyCode();
        return (currencyCode == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(C37934R.string.crypto_add_saved_address_title, currencyCode)) == null) ? StringResource.INSTANCE.invoke("---------------------------") : stringResourceInvoke;
    }

    public final StringResource getPlaceholderText() {
        String currencyCode = getCurrencyCode();
        if (currencyCode != null) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_send_address_page_input_placeholder_text, currencyCode);
        }
        return null;
    }

    public final int getMaxAddressLength() {
        CryptoTransferConfig cryptoTransferConfig = this.cryptoTransferConfig;
        if (cryptoTransferConfig != null) {
            return cryptoTransferConfig.getMaxAddressLength();
        }
        return Integer.MAX_VALUE;
    }
}
