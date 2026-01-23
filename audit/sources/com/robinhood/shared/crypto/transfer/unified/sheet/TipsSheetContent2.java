package com.robinhood.shared.crypto.transfer.unified.sheet;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.models.api.transfer.ApiCryptoTransferDepositDetails;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.serverdriven.experimental.api.Money;
import com.robinhood.models.serverdriven.experimental.extensions.Format2;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TipsSheetContent.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent;", "", "isRhc", "", "()Z", "config", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "getConfig", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "compatibilitySubtitle", "Lcom/robinhood/utils/resource/StringResource;", "getCompatibilitySubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "startSmallSubtitle", "getStartSmallSubtitle", "transferLimitsSubtitle", "getTransferLimitsSubtitle", "learnMoreUrl", "getLearnMoreUrl", "Send", "Receive", "Stub", "Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent$Receive;", "Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent$Send;", "Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent$Stub;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.unified.sheet.TransferTipsSheetContent, reason: use source file name */
/* loaded from: classes6.dex */
public interface TipsSheetContent2 {
    StringResource getCompatibilitySubtitle();

    CryptoTransferConfig getConfig();

    StringResource getLearnMoreUrl();

    StringResource getStartSmallSubtitle();

    StringResource getTransferLimitsSubtitle();

    boolean isRhc();

    /* compiled from: TipsSheetContent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.unified.sheet.TransferTipsSheetContent$DefaultImpls */
    public static final class DefaultImpls {
        public static StringResource getTransferLimitsSubtitle(TipsSheetContent2 tipsSheetContent2) {
            Money travelRuleThresholdFiatAmount;
            CryptoTransferConfig config = tipsSheetContent2.getConfig();
            if (config == null || (travelRuleThresholdFiatAmount = config.getTravelRuleThresholdFiatAmount()) == null) {
                return null;
            }
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_unified_tips_sheet_limits_subtitle, com.robinhood.models.util.Money.format$default(Format2.toMoney(travelRuleThresholdFiatAmount), CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale(), false, null, false, 0, null, false, null, false, false, 1022, null));
        }

        public static StringResource getLearnMoreUrl(TipsSheetContent2 tipsSheetContent2) {
            int i;
            StringResource.Companion companion = StringResource.INSTANCE;
            if (tipsSheetContent2.isRhc()) {
                i = C37934R.string.crypto_transfer_support_url_rhc;
            } else {
                i = C37934R.string.crypto_transfer_support_url;
            }
            return companion.invoke(i, new Object[0]);
        }
    }

    /* compiled from: TipsSheetContent.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent$Send;", "Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent;", "isRhc", "", "config", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "<init>", "(ZLcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;)V", "()Z", "getConfig", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "compatibilitySubtitle", "Lcom/robinhood/utils/resource/StringResource;", "getCompatibilitySubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "startSmallSubtitle", "getStartSmallSubtitle", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.unified.sheet.TransferTipsSheetContent$Send, reason: from toString */
    public static final /* data */ class Send implements TipsSheetContent2 {
        public static final int $stable = 8;
        private final CryptoTransferConfig config;
        private final boolean isRhc;
        private final UiCurrencyPair uiCurrencyPair;

        public static /* synthetic */ Send copy$default(Send send, boolean z, CryptoTransferConfig cryptoTransferConfig, UiCurrencyPair uiCurrencyPair, int i, Object obj) {
            if ((i & 1) != 0) {
                z = send.isRhc;
            }
            if ((i & 2) != 0) {
                cryptoTransferConfig = send.config;
            }
            if ((i & 4) != 0) {
                uiCurrencyPair = send.uiCurrencyPair;
            }
            return send.copy(z, cryptoTransferConfig, uiCurrencyPair);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsRhc() {
            return this.isRhc;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoTransferConfig getConfig() {
            return this.config;
        }

        /* renamed from: component3, reason: from getter */
        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        public final Send copy(boolean isRhc, CryptoTransferConfig config, UiCurrencyPair uiCurrencyPair) {
            return new Send(isRhc, config, uiCurrencyPair);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Send)) {
                return false;
            }
            Send send = (Send) other;
            return this.isRhc == send.isRhc && Intrinsics.areEqual(this.config, send.config) && Intrinsics.areEqual(this.uiCurrencyPair, send.uiCurrencyPair);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isRhc) * 31;
            CryptoTransferConfig cryptoTransferConfig = this.config;
            int iHashCode2 = (iHashCode + (cryptoTransferConfig == null ? 0 : cryptoTransferConfig.hashCode())) * 31;
            UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
            return iHashCode2 + (uiCurrencyPair != null ? uiCurrencyPair.hashCode() : 0);
        }

        public String toString() {
            return "Send(isRhc=" + this.isRhc + ", config=" + this.config + ", uiCurrencyPair=" + this.uiCurrencyPair + ")";
        }

        public Send(boolean z, CryptoTransferConfig cryptoTransferConfig, UiCurrencyPair uiCurrencyPair) {
            this.isRhc = z;
            this.config = cryptoTransferConfig;
            this.uiCurrencyPair = uiCurrencyPair;
        }

        @Override // com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2
        public StringResource getLearnMoreUrl() {
            return DefaultImpls.getLearnMoreUrl(this);
        }

        @Override // com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2
        public StringResource getTransferLimitsSubtitle() {
            return DefaultImpls.getTransferLimitsSubtitle(this);
        }

        @Override // com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2
        public boolean isRhc() {
            return this.isRhc;
        }

        @Override // com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2
        public CryptoTransferConfig getConfig() {
            return this.config;
        }

        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        @Override // com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2
        public StringResource getCompatibilitySubtitle() {
            UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
            return uiCurrencyPair == null ? StringResource.INSTANCE.invoke("") : StringResource.INSTANCE.invoke(C37934R.string.crypto_unified_tips_sheet_compat_subtitle_send, uiCurrencyPair.getAssetCurrency().getCode());
        }

        @Override // com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2
        public StringResource getStartSmallSubtitle() {
            return this.uiCurrencyPair == null ? StringResource.INSTANCE.invoke("") : StringResource.INSTANCE.invoke(C37934R.string.crypto_unified_tips_sheet_small_subtitle_send, new Object[0]);
        }
    }

    /* compiled from: TipsSheetContent.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent$Receive;", "Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent;", "isRhc", "", "config", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", PlaceTypes.ADDRESS, "Lcom/robinhood/models/api/transfer/ApiCryptoTransferDepositDetails$ApiCryptoTransferDepositDetail;", "<init>", "(ZLcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;Lcom/robinhood/models/api/transfer/ApiCryptoTransferDepositDetails$ApiCryptoTransferDepositDetail;)V", "()Z", "getConfig", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "getAddress", "()Lcom/robinhood/models/api/transfer/ApiCryptoTransferDepositDetails$ApiCryptoTransferDepositDetail;", "compatibilitySubtitle", "Lcom/robinhood/utils/resource/StringResource;", "getCompatibilitySubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "startSmallSubtitle", "getStartSmallSubtitle", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.unified.sheet.TransferTipsSheetContent$Receive, reason: from toString */
    public static final /* data */ class Receive implements TipsSheetContent2 {
        public static final int $stable = 8;
        private final ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail address;
        private final CryptoTransferConfig config;
        private final boolean isRhc;

        public static /* synthetic */ Receive copy$default(Receive receive, boolean z, CryptoTransferConfig cryptoTransferConfig, ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail apiCryptoTransferDepositDetail, int i, Object obj) {
            if ((i & 1) != 0) {
                z = receive.isRhc;
            }
            if ((i & 2) != 0) {
                cryptoTransferConfig = receive.config;
            }
            if ((i & 4) != 0) {
                apiCryptoTransferDepositDetail = receive.address;
            }
            return receive.copy(z, cryptoTransferConfig, apiCryptoTransferDepositDetail);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsRhc() {
            return this.isRhc;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoTransferConfig getConfig() {
            return this.config;
        }

        /* renamed from: component3, reason: from getter */
        public final ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail getAddress() {
            return this.address;
        }

        public final Receive copy(boolean isRhc, CryptoTransferConfig config, ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail address) {
            Intrinsics.checkNotNullParameter(address, "address");
            return new Receive(isRhc, config, address);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Receive)) {
                return false;
            }
            Receive receive = (Receive) other;
            return this.isRhc == receive.isRhc && Intrinsics.areEqual(this.config, receive.config) && Intrinsics.areEqual(this.address, receive.address);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isRhc) * 31;
            CryptoTransferConfig cryptoTransferConfig = this.config;
            return ((iHashCode + (cryptoTransferConfig == null ? 0 : cryptoTransferConfig.hashCode())) * 31) + this.address.hashCode();
        }

        public String toString() {
            return "Receive(isRhc=" + this.isRhc + ", config=" + this.config + ", address=" + this.address + ")";
        }

        public Receive(boolean z, CryptoTransferConfig cryptoTransferConfig, ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail address) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.isRhc = z;
            this.config = cryptoTransferConfig;
            this.address = address;
        }

        @Override // com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2
        public StringResource getLearnMoreUrl() {
            return DefaultImpls.getLearnMoreUrl(this);
        }

        @Override // com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2
        public StringResource getTransferLimitsSubtitle() {
            return DefaultImpls.getTransferLimitsSubtitle(this);
        }

        @Override // com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2
        public boolean isRhc() {
            return this.isRhc;
        }

        @Override // com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2
        public CryptoTransferConfig getConfig() {
            return this.config;
        }

        public final ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail getAddress() {
            return this.address;
        }

        @Override // com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2
        public StringResource getCompatibilitySubtitle() {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_unified_tips_sheet_compat_subtitle_multi_chain_receive, this.address.getCurrency_code(), this.address.getNetwork_info().getName());
        }

        @Override // com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2
        public StringResource getStartSmallSubtitle() {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_unified_tips_sheet_small_subtitle_receive, this.address.getCurrency_code());
        }
    }

    /* compiled from: TipsSheetContent.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent$Stub;", "Lcom/robinhood/shared/crypto/transfer/unified/sheet/TransferTipsSheetContent;", "<init>", "()V", "isRhc", "", "()Z", "config", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "getConfig", "()Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "compatibilitySubtitle", "Lcom/robinhood/utils/resource/StringResource;", "getCompatibilitySubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "startSmallSubtitle", "getStartSmallSubtitle", "transferLimitsSubtitle", "getTransferLimitsSubtitle", "learnMoreUrl", "getLearnMoreUrl", "equals", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.unified.sheet.TransferTipsSheetContent$Stub */
    public static final /* data */ class Stub implements TipsSheetContent2 {
        public static final int $stable;
        public static final Stub INSTANCE = new Stub();
        private static final StringResource compatibilitySubtitle;
        private static final CryptoTransferConfig config = null;
        private static final boolean isRhc = false;
        private static final StringResource learnMoreUrl;
        private static final StringResource startSmallSubtitle;
        private static final StringResource transferLimitsSubtitle = null;

        public boolean equals(Object other) {
            return this == other || (other instanceof Stub);
        }

        public int hashCode() {
            return -1690289718;
        }

        public String toString() {
            return "Stub";
        }

        private Stub() {
        }

        @Override // com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2
        public boolean isRhc() {
            return isRhc;
        }

        @Override // com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2
        public CryptoTransferConfig getConfig() {
            return config;
        }

        static {
            StringResource.Companion companion = StringResource.INSTANCE;
            compatibilitySubtitle = companion.invoke("");
            startSmallSubtitle = companion.invoke("");
            learnMoreUrl = companion.invoke("");
            $stable = 8;
        }

        @Override // com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2
        public StringResource getCompatibilitySubtitle() {
            return compatibilitySubtitle;
        }

        @Override // com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2
        public StringResource getStartSmallSubtitle() {
            return startSmallSubtitle;
        }

        @Override // com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2
        public StringResource getTransferLimitsSubtitle() {
            return transferLimitsSubtitle;
        }

        @Override // com.robinhood.shared.crypto.transfer.unified.sheet.TipsSheetContent2
        public StringResource getLearnMoreUrl() {
            return learnMoreUrl;
        }
    }
}
