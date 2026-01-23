package com.robinhood.shared.crypto.transfer.send.address.base;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CryptoTransferSendAddressViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÂ\u0003J\t\u0010&\u001a\u00020\tHÂ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÂ\u0003JI\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010*\u001a\u00020\u001b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\t\u0010-\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006."}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/base/CryptoTransferSendAddressViewState;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "maxAddressLength", "", "previouslySavedAddress", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "typedAddress", "cryptoTransferConfig", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;ILjava/lang/String;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/lang/String;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;)V", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "getMaxAddressLength", "()I", PlaceTypes.ADDRESS, "getAddress", "()Ljava/lang/String;", "helperText", "Lcom/robinhood/utils/resource/StringResource;", "getHelperText", "()Lcom/robinhood/utils/resource/StringResource;", "shouldRequestFocus", "", "getShouldRequestFocus", "()Z", "isContinueEnabled", "transferSendTipsSheetContent", "Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent$Send;", "getTransferSendTipsSheetContent", "()Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent$Send;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferSendAddressViewState {
    public static final int $stable = 8;
    private final String address;
    private final AppType appType;
    private final CryptoTransferConfig cryptoTransferConfig;
    private final int maxAddressLength;
    private final String previouslySavedAddress;
    private final String typedAddress;
    private final UiCurrencyPair uiCurrencyPair;

    /* renamed from: component3, reason: from getter */
    private final String getPreviouslySavedAddress() {
        return this.previouslySavedAddress;
    }

    /* renamed from: component4, reason: from getter */
    private final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    /* renamed from: component5, reason: from getter */
    private final String getTypedAddress() {
        return this.typedAddress;
    }

    /* renamed from: component6, reason: from getter */
    private final CryptoTransferConfig getCryptoTransferConfig() {
        return this.cryptoTransferConfig;
    }

    public static /* synthetic */ CryptoTransferSendAddressViewState copy$default(CryptoTransferSendAddressViewState cryptoTransferSendAddressViewState, AppType appType, int i, String str, UiCurrencyPair uiCurrencyPair, String str2, CryptoTransferConfig cryptoTransferConfig, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            appType = cryptoTransferSendAddressViewState.appType;
        }
        if ((i2 & 2) != 0) {
            i = cryptoTransferSendAddressViewState.maxAddressLength;
        }
        if ((i2 & 4) != 0) {
            str = cryptoTransferSendAddressViewState.previouslySavedAddress;
        }
        if ((i2 & 8) != 0) {
            uiCurrencyPair = cryptoTransferSendAddressViewState.uiCurrencyPair;
        }
        if ((i2 & 16) != 0) {
            str2 = cryptoTransferSendAddressViewState.typedAddress;
        }
        if ((i2 & 32) != 0) {
            cryptoTransferConfig = cryptoTransferSendAddressViewState.cryptoTransferConfig;
        }
        String str3 = str2;
        CryptoTransferConfig cryptoTransferConfig2 = cryptoTransferConfig;
        return cryptoTransferSendAddressViewState.copy(appType, i, str, uiCurrencyPair, str3, cryptoTransferConfig2);
    }

    /* renamed from: component1, reason: from getter */
    public final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxAddressLength() {
        return this.maxAddressLength;
    }

    public final CryptoTransferSendAddressViewState copy(AppType appType, int maxAddressLength, String previouslySavedAddress, UiCurrencyPair uiCurrencyPair, String typedAddress, CryptoTransferConfig cryptoTransferConfig) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(previouslySavedAddress, "previouslySavedAddress");
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        return new CryptoTransferSendAddressViewState(appType, maxAddressLength, previouslySavedAddress, uiCurrencyPair, typedAddress, cryptoTransferConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferSendAddressViewState)) {
            return false;
        }
        CryptoTransferSendAddressViewState cryptoTransferSendAddressViewState = (CryptoTransferSendAddressViewState) other;
        return this.appType == cryptoTransferSendAddressViewState.appType && this.maxAddressLength == cryptoTransferSendAddressViewState.maxAddressLength && Intrinsics.areEqual(this.previouslySavedAddress, cryptoTransferSendAddressViewState.previouslySavedAddress) && Intrinsics.areEqual(this.uiCurrencyPair, cryptoTransferSendAddressViewState.uiCurrencyPair) && Intrinsics.areEqual(this.typedAddress, cryptoTransferSendAddressViewState.typedAddress) && Intrinsics.areEqual(this.cryptoTransferConfig, cryptoTransferSendAddressViewState.cryptoTransferConfig);
    }

    public int hashCode() {
        int iHashCode = ((((((this.appType.hashCode() * 31) + Integer.hashCode(this.maxAddressLength)) * 31) + this.previouslySavedAddress.hashCode()) * 31) + this.uiCurrencyPair.hashCode()) * 31;
        String str = this.typedAddress;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CryptoTransferConfig cryptoTransferConfig = this.cryptoTransferConfig;
        return iHashCode2 + (cryptoTransferConfig != null ? cryptoTransferConfig.hashCode() : 0);
    }

    public String toString() {
        return "CryptoTransferSendAddressViewState(appType=" + this.appType + ", maxAddressLength=" + this.maxAddressLength + ", previouslySavedAddress=" + this.previouslySavedAddress + ", uiCurrencyPair=" + this.uiCurrencyPair + ", typedAddress=" + this.typedAddress + ", cryptoTransferConfig=" + this.cryptoTransferConfig + ")";
    }

    public CryptoTransferSendAddressViewState(AppType appType, int i, String previouslySavedAddress, UiCurrencyPair uiCurrencyPair, String str, CryptoTransferConfig cryptoTransferConfig) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(previouslySavedAddress, "previouslySavedAddress");
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        this.appType = appType;
        this.maxAddressLength = i;
        this.previouslySavedAddress = previouslySavedAddress;
        this.uiCurrencyPair = uiCurrencyPair;
        this.typedAddress = str;
        this.cryptoTransferConfig = cryptoTransferConfig;
        this.address = str != null ? str : previouslySavedAddress;
    }

    public /* synthetic */ CryptoTransferSendAddressViewState(AppType appType, int i, String str, UiCurrencyPair uiCurrencyPair, String str2, CryptoTransferConfig cryptoTransferConfig, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(appType, i, str, uiCurrencyPair, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : cryptoTransferConfig);
    }

    public final AppType getAppType() {
        return this.appType;
    }

    public final int getMaxAddressLength() {
        return this.maxAddressLength;
    }

    public final String getAddress() {
        return this.address;
    }

    public final StringResource getHelperText() {
        if (this.address.length() == 0) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_send_address_v2_helper_scan, new Object[0]);
        }
        if (this.address.length() < 5) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_send_address_v2_helper_typing, this.uiCurrencyPair.getAssetCurrency().getCode());
        }
        return StringResource.INSTANCE.invoke(C37934R.string.crypto_send_address_v2_helper, new Object[0]);
    }

    public final boolean getShouldRequestFocus() {
        return this.address.length() == 0;
    }

    public final boolean isContinueEnabled() {
        return !StringsKt.isBlank(this.address);
    }

    public final TipsSheetContent2.Send getTransferSendTipsSheetContent() {
        return new TipsSheetContent2.Send(this.appType == AppType.RHC, this.cryptoTransferConfig, this.uiCurrencyPair);
    }
}
