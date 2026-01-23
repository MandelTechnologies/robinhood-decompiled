package com.robinhood.shared.crypto.transfer.send.receipt;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.shared.crypto.transfer.model.NetworkFeeData;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendReceiptViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0012HÆ\u0003J\u0085\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00102\u001a\u00020\u00122\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010$¨\u00067"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/receipt/CryptoTransferSendReceiptViewState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", PlaceTypes.ADDRESS, "", "networkFee", "Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData;", "totalLabel", "totalValue", "helperText", "withdrawalId", "Ljava/util/UUID;", "network", MemoInputActivity.EXTRA_MEMO, "primaryCtaText", "isFromGateway", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Z)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "getAddress", "()Ljava/lang/String;", "getNetworkFee", "()Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData;", "getTotalLabel", "getTotalValue", "getHelperText", "getWithdrawalId", "()Ljava/util/UUID;", "getNetwork", "getMemo", "getPrimaryCtaText", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferSendReceiptViewState {
    public static final int $stable = 8;
    private final String address;
    private final StringResource helperText;
    private final boolean isFromGateway;
    private final String memo;
    private final String network;
    private final NetworkFeeData networkFee;
    private final StringResource primaryCtaText;
    private final StringResource subtitle;
    private final StringResource title;
    private final StringResource totalLabel;
    private final String totalValue;
    private final UUID withdrawalId;

    public static /* synthetic */ CryptoTransferSendReceiptViewState copy$default(CryptoTransferSendReceiptViewState cryptoTransferSendReceiptViewState, StringResource stringResource, StringResource stringResource2, String str, NetworkFeeData networkFeeData, StringResource stringResource3, String str2, StringResource stringResource4, UUID uuid, String str3, String str4, StringResource stringResource5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = cryptoTransferSendReceiptViewState.title;
        }
        if ((i & 2) != 0) {
            stringResource2 = cryptoTransferSendReceiptViewState.subtitle;
        }
        if ((i & 4) != 0) {
            str = cryptoTransferSendReceiptViewState.address;
        }
        if ((i & 8) != 0) {
            networkFeeData = cryptoTransferSendReceiptViewState.networkFee;
        }
        if ((i & 16) != 0) {
            stringResource3 = cryptoTransferSendReceiptViewState.totalLabel;
        }
        if ((i & 32) != 0) {
            str2 = cryptoTransferSendReceiptViewState.totalValue;
        }
        if ((i & 64) != 0) {
            stringResource4 = cryptoTransferSendReceiptViewState.helperText;
        }
        if ((i & 128) != 0) {
            uuid = cryptoTransferSendReceiptViewState.withdrawalId;
        }
        if ((i & 256) != 0) {
            str3 = cryptoTransferSendReceiptViewState.network;
        }
        if ((i & 512) != 0) {
            str4 = cryptoTransferSendReceiptViewState.memo;
        }
        if ((i & 1024) != 0) {
            stringResource5 = cryptoTransferSendReceiptViewState.primaryCtaText;
        }
        if ((i & 2048) != 0) {
            z = cryptoTransferSendReceiptViewState.isFromGateway;
        }
        StringResource stringResource6 = stringResource5;
        boolean z2 = z;
        String str5 = str3;
        String str6 = str4;
        StringResource stringResource7 = stringResource4;
        UUID uuid2 = uuid;
        StringResource stringResource8 = stringResource3;
        String str7 = str2;
        return cryptoTransferSendReceiptViewState.copy(stringResource, stringResource2, str, networkFeeData, stringResource8, str7, stringResource7, uuid2, str5, str6, stringResource6, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    /* renamed from: component11, reason: from getter */
    public final StringResource getPrimaryCtaText() {
        return this.primaryCtaText;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsFromGateway() {
        return this.isFromGateway;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component4, reason: from getter */
    public final NetworkFeeData getNetworkFee() {
        return this.networkFee;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getTotalLabel() {
        return this.totalLabel;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTotalValue() {
        return this.totalValue;
    }

    /* renamed from: component7, reason: from getter */
    public final StringResource getHelperText() {
        return this.helperText;
    }

    /* renamed from: component8, reason: from getter */
    public final UUID getWithdrawalId() {
        return this.withdrawalId;
    }

    /* renamed from: component9, reason: from getter */
    public final String getNetwork() {
        return this.network;
    }

    public final CryptoTransferSendReceiptViewState copy(StringResource title, StringResource subtitle, String address, NetworkFeeData networkFee, StringResource totalLabel, String totalValue, StringResource helperText, UUID withdrawalId, String network, String memo, StringResource primaryCtaText, boolean isFromGateway) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(networkFee, "networkFee");
        Intrinsics.checkNotNullParameter(totalLabel, "totalLabel");
        Intrinsics.checkNotNullParameter(totalValue, "totalValue");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        Intrinsics.checkNotNullParameter(withdrawalId, "withdrawalId");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        return new CryptoTransferSendReceiptViewState(title, subtitle, address, networkFee, totalLabel, totalValue, helperText, withdrawalId, network, memo, primaryCtaText, isFromGateway);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferSendReceiptViewState)) {
            return false;
        }
        CryptoTransferSendReceiptViewState cryptoTransferSendReceiptViewState = (CryptoTransferSendReceiptViewState) other;
        return Intrinsics.areEqual(this.title, cryptoTransferSendReceiptViewState.title) && Intrinsics.areEqual(this.subtitle, cryptoTransferSendReceiptViewState.subtitle) && Intrinsics.areEqual(this.address, cryptoTransferSendReceiptViewState.address) && Intrinsics.areEqual(this.networkFee, cryptoTransferSendReceiptViewState.networkFee) && Intrinsics.areEqual(this.totalLabel, cryptoTransferSendReceiptViewState.totalLabel) && Intrinsics.areEqual(this.totalValue, cryptoTransferSendReceiptViewState.totalValue) && Intrinsics.areEqual(this.helperText, cryptoTransferSendReceiptViewState.helperText) && Intrinsics.areEqual(this.withdrawalId, cryptoTransferSendReceiptViewState.withdrawalId) && Intrinsics.areEqual(this.network, cryptoTransferSendReceiptViewState.network) && Intrinsics.areEqual(this.memo, cryptoTransferSendReceiptViewState.memo) && Intrinsics.areEqual(this.primaryCtaText, cryptoTransferSendReceiptViewState.primaryCtaText) && this.isFromGateway == cryptoTransferSendReceiptViewState.isFromGateway;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.address.hashCode()) * 31) + this.networkFee.hashCode()) * 31) + this.totalLabel.hashCode()) * 31) + this.totalValue.hashCode()) * 31) + this.helperText.hashCode()) * 31) + this.withdrawalId.hashCode()) * 31;
        String str = this.network;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.memo;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.primaryCtaText.hashCode()) * 31) + Boolean.hashCode(this.isFromGateway);
    }

    public String toString() {
        return "CryptoTransferSendReceiptViewState(title=" + this.title + ", subtitle=" + this.subtitle + ", address=" + this.address + ", networkFee=" + this.networkFee + ", totalLabel=" + this.totalLabel + ", totalValue=" + this.totalValue + ", helperText=" + this.helperText + ", withdrawalId=" + this.withdrawalId + ", network=" + this.network + ", memo=" + this.memo + ", primaryCtaText=" + this.primaryCtaText + ", isFromGateway=" + this.isFromGateway + ")";
    }

    public CryptoTransferSendReceiptViewState(StringResource title, StringResource subtitle, String address, NetworkFeeData networkFee, StringResource totalLabel, String totalValue, StringResource helperText, UUID withdrawalId, String str, String str2, StringResource primaryCtaText, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(networkFee, "networkFee");
        Intrinsics.checkNotNullParameter(totalLabel, "totalLabel");
        Intrinsics.checkNotNullParameter(totalValue, "totalValue");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        Intrinsics.checkNotNullParameter(withdrawalId, "withdrawalId");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        this.title = title;
        this.subtitle = subtitle;
        this.address = address;
        this.networkFee = networkFee;
        this.totalLabel = totalLabel;
        this.totalValue = totalValue;
        this.helperText = helperText;
        this.withdrawalId = withdrawalId;
        this.network = str;
        this.memo = str2;
        this.primaryCtaText = primaryCtaText;
        this.isFromGateway = z;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final String getAddress() {
        return this.address;
    }

    public final NetworkFeeData getNetworkFee() {
        return this.networkFee;
    }

    public final StringResource getTotalLabel() {
        return this.totalLabel;
    }

    public final String getTotalValue() {
        return this.totalValue;
    }

    public final StringResource getHelperText() {
        return this.helperText;
    }

    public final UUID getWithdrawalId() {
        return this.withdrawalId;
    }

    public final String getNetwork() {
        return this.network;
    }

    public final String getMemo() {
        return this.memo;
    }

    public final StringResource getPrimaryCtaText() {
        return this.primaryCtaText;
    }

    public final boolean isFromGateway() {
        return this.isFromGateway;
    }
}
