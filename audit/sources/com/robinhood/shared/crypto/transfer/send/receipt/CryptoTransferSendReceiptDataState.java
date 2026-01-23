package com.robinhood.shared.crypto.transfer.send.receipt;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.models.api.ApiCurrency;
import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.models.api.transfer.ApiCryptoTransferWithdrawal;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.transfer.CryptoTransferWithdrawal;
import com.robinhood.models.util.Money;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.model.NetworkFeeData;
import com.robinhood.shared.crypto.transfer.send.receipt.CryptoTransferSendReceiptFragment;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendReceiptDataState.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0010\u0010\u0014J\t\u00106\u001a\u00020\u0003HÂ\u0003J\t\u00107\u001a\u00020\u0005HÂ\u0003J\t\u00108\u001a\u00020\u0007HÂ\u0003J\t\u00109\u001a\u00020\tHÂ\u0003J\t\u0010:\u001a\u00020\u000bHÂ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\rHÂ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J[\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010?\u001a\u00020\u00072\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u001fHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b'\u0010\u001bR\u0011\u0010(\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b)\u0010!R\u0011\u0010*\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b+\u0010\u001bR\u0011\u0010,\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u00100\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b1\u0010!R\u0013\u00102\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b3\u0010!R\u0011\u00104\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b5\u0010\u001b¨\u0006D"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/receipt/CryptoTransferSendReceiptDataState;", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "withdrawal", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;", "isFullAmount", "", "cryptoInputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "cryptoInstrumentInputHelper", "Lcom/robinhood/shared/formats/crypto/CryptoInstrumentInputHelper;", "selectedNetwork", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;", "isGoldRefundExperimentEnabled", "isFromGateway", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;ZLcom/robinhood/shared/formats/crypto/CryptoInputMode;Lcom/robinhood/shared/formats/crypto/CryptoInstrumentInputHelper;Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;ZZ)V", "args", "Lcom/robinhood/shared/crypto/transfer/send/receipt/CryptoTransferSendReceiptFragment$Args;", "(Lcom/robinhood/shared/crypto/transfer/send/receipt/CryptoTransferSendReceiptFragment$Args;)V", "()Z", "isErc20Token", "isMultiChain", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "subtitle", "getSubtitle", PlaceTypes.ADDRESS, "", "getAddress", "()Ljava/lang/String;", "networkFee", "Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData;", "getNetworkFee", "()Lcom/robinhood/shared/crypto/transfer/model/NetworkFeeData;", "totalLabel", "getTotalLabel", "totalValue", "getTotalValue", "helperText", "getHelperText", "withdrawalId", "Ljava/util/UUID;", "getWithdrawalId", "()Ljava/util/UUID;", "network", "getNetwork", MemoInputActivity.EXTRA_MEMO, "getMemo", "primaryCtaText", "getPrimaryCtaText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferSendReceiptDataState {
    public static final int $stable = 8;
    private final CryptoInputMode cryptoInputMode;
    private final CryptoInstrumentInputHelper cryptoInstrumentInputHelper;
    private final boolean isErc20Token;
    private final boolean isFromGateway;
    private final boolean isFullAmount;
    private final boolean isGoldRefundExperimentEnabled;
    private final boolean isMultiChain;
    private final ApiCryptoSupportedNetworks.CryptoNetwork selectedNetwork;
    private final UiCurrencyPair uiCurrencyPair;
    private final CryptoTransferWithdrawal withdrawal;

    /* compiled from: CryptoTransferSendReceiptDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCryptoTransferWithdrawal.Amount.NetworkFee.FeeRefundReason.values().length];
            try {
                iArr[ApiCryptoTransferWithdrawal.Amount.NetworkFee.FeeRefundReason.GOLD_ZERO_NETWORK_FEE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCryptoTransferWithdrawal.Amount.NetworkFee.FeeRefundReason.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    /* renamed from: component2, reason: from getter */
    private final CryptoTransferWithdrawal getWithdrawal() {
        return this.withdrawal;
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getIsFullAmount() {
        return this.isFullAmount;
    }

    /* renamed from: component4, reason: from getter */
    private final CryptoInputMode getCryptoInputMode() {
        return this.cryptoInputMode;
    }

    /* renamed from: component5, reason: from getter */
    private final CryptoInstrumentInputHelper getCryptoInstrumentInputHelper() {
        return this.cryptoInstrumentInputHelper;
    }

    /* renamed from: component6, reason: from getter */
    private final ApiCryptoSupportedNetworks.CryptoNetwork getSelectedNetwork() {
        return this.selectedNetwork;
    }

    public static /* synthetic */ CryptoTransferSendReceiptDataState copy$default(CryptoTransferSendReceiptDataState cryptoTransferSendReceiptDataState, UiCurrencyPair uiCurrencyPair, CryptoTransferWithdrawal cryptoTransferWithdrawal, boolean z, CryptoInputMode cryptoInputMode, CryptoInstrumentInputHelper cryptoInstrumentInputHelper, ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            uiCurrencyPair = cryptoTransferSendReceiptDataState.uiCurrencyPair;
        }
        if ((i & 2) != 0) {
            cryptoTransferWithdrawal = cryptoTransferSendReceiptDataState.withdrawal;
        }
        if ((i & 4) != 0) {
            z = cryptoTransferSendReceiptDataState.isFullAmount;
        }
        if ((i & 8) != 0) {
            cryptoInputMode = cryptoTransferSendReceiptDataState.cryptoInputMode;
        }
        if ((i & 16) != 0) {
            cryptoInstrumentInputHelper = cryptoTransferSendReceiptDataState.cryptoInstrumentInputHelper;
        }
        if ((i & 32) != 0) {
            cryptoNetwork = cryptoTransferSendReceiptDataState.selectedNetwork;
        }
        if ((i & 64) != 0) {
            z2 = cryptoTransferSendReceiptDataState.isGoldRefundExperimentEnabled;
        }
        if ((i & 128) != 0) {
            z3 = cryptoTransferSendReceiptDataState.isFromGateway;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        CryptoInstrumentInputHelper cryptoInstrumentInputHelper2 = cryptoInstrumentInputHelper;
        ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork2 = cryptoNetwork;
        return cryptoTransferSendReceiptDataState.copy(uiCurrencyPair, cryptoTransferWithdrawal, z, cryptoInputMode, cryptoInstrumentInputHelper2, cryptoNetwork2, z4, z5);
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsGoldRefundExperimentEnabled() {
        return this.isGoldRefundExperimentEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsFromGateway() {
        return this.isFromGateway;
    }

    public final CryptoTransferSendReceiptDataState copy(UiCurrencyPair uiCurrencyPair, CryptoTransferWithdrawal withdrawal, boolean isFullAmount, CryptoInputMode cryptoInputMode, CryptoInstrumentInputHelper cryptoInstrumentInputHelper, ApiCryptoSupportedNetworks.CryptoNetwork selectedNetwork, boolean isGoldRefundExperimentEnabled, boolean isFromGateway) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        Intrinsics.checkNotNullParameter(withdrawal, "withdrawal");
        Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
        Intrinsics.checkNotNullParameter(cryptoInstrumentInputHelper, "cryptoInstrumentInputHelper");
        return new CryptoTransferSendReceiptDataState(uiCurrencyPair, withdrawal, isFullAmount, cryptoInputMode, cryptoInstrumentInputHelper, selectedNetwork, isGoldRefundExperimentEnabled, isFromGateway);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferSendReceiptDataState)) {
            return false;
        }
        CryptoTransferSendReceiptDataState cryptoTransferSendReceiptDataState = (CryptoTransferSendReceiptDataState) other;
        return Intrinsics.areEqual(this.uiCurrencyPair, cryptoTransferSendReceiptDataState.uiCurrencyPair) && Intrinsics.areEqual(this.withdrawal, cryptoTransferSendReceiptDataState.withdrawal) && this.isFullAmount == cryptoTransferSendReceiptDataState.isFullAmount && this.cryptoInputMode == cryptoTransferSendReceiptDataState.cryptoInputMode && Intrinsics.areEqual(this.cryptoInstrumentInputHelper, cryptoTransferSendReceiptDataState.cryptoInstrumentInputHelper) && Intrinsics.areEqual(this.selectedNetwork, cryptoTransferSendReceiptDataState.selectedNetwork) && this.isGoldRefundExperimentEnabled == cryptoTransferSendReceiptDataState.isGoldRefundExperimentEnabled && this.isFromGateway == cryptoTransferSendReceiptDataState.isFromGateway;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.uiCurrencyPair.hashCode() * 31) + this.withdrawal.hashCode()) * 31) + Boolean.hashCode(this.isFullAmount)) * 31) + this.cryptoInputMode.hashCode()) * 31) + this.cryptoInstrumentInputHelper.hashCode()) * 31;
        ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork = this.selectedNetwork;
        return ((((iHashCode + (cryptoNetwork == null ? 0 : cryptoNetwork.hashCode())) * 31) + Boolean.hashCode(this.isGoldRefundExperimentEnabled)) * 31) + Boolean.hashCode(this.isFromGateway);
    }

    public String toString() {
        return "CryptoTransferSendReceiptDataState(uiCurrencyPair=" + this.uiCurrencyPair + ", withdrawal=" + this.withdrawal + ", isFullAmount=" + this.isFullAmount + ", cryptoInputMode=" + this.cryptoInputMode + ", cryptoInstrumentInputHelper=" + this.cryptoInstrumentInputHelper + ", selectedNetwork=" + this.selectedNetwork + ", isGoldRefundExperimentEnabled=" + this.isGoldRefundExperimentEnabled + ", isFromGateway=" + this.isFromGateway + ")";
    }

    public CryptoTransferSendReceiptDataState(UiCurrencyPair uiCurrencyPair, CryptoTransferWithdrawal withdrawal, boolean z, CryptoInputMode cryptoInputMode, CryptoInstrumentInputHelper cryptoInstrumentInputHelper, ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        Intrinsics.checkNotNullParameter(withdrawal, "withdrawal");
        Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
        Intrinsics.checkNotNullParameter(cryptoInstrumentInputHelper, "cryptoInstrumentInputHelper");
        this.uiCurrencyPair = uiCurrencyPair;
        this.withdrawal = withdrawal;
        this.isFullAmount = z;
        this.cryptoInputMode = cryptoInputMode;
        this.cryptoInstrumentInputHelper = cryptoInstrumentInputHelper;
        this.selectedNetwork = cryptoNetwork;
        this.isGoldRefundExperimentEnabled = z2;
        this.isFromGateway = z3;
        this.isErc20Token = uiCurrencyPair.getAssetCurrency().getCryptoType() == ApiCurrency.CryptoType.ERC20;
        this.isMultiChain = cryptoNetwork != null;
    }

    public /* synthetic */ CryptoTransferSendReceiptDataState(UiCurrencyPair uiCurrencyPair, CryptoTransferWithdrawal cryptoTransferWithdrawal, boolean z, CryptoInputMode cryptoInputMode, CryptoInstrumentInputHelper cryptoInstrumentInputHelper, ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiCurrencyPair, cryptoTransferWithdrawal, z, cryptoInputMode, cryptoInstrumentInputHelper, cryptoNetwork, (i & 64) != 0 ? false : z2, z3);
    }

    public final boolean isGoldRefundExperimentEnabled() {
        return this.isGoldRefundExperimentEnabled;
    }

    public final boolean isFromGateway() {
        return this.isFromGateway;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoTransferSendReceiptDataState(CryptoTransferSendReceiptFragment.Args args) {
        this(args.getUiCurrencyPair(), args.getWithdrawal(), args.isFullAmount(), args.getCryptoInputMode(), new CryptoInstrumentInputHelper(args.getUiCurrencyPair()), args.getSelectedNetwork(), false, args.isFromGateway(), 64, null);
        Intrinsics.checkNotNullParameter(args, "args");
    }

    public final StringResource getTitle() {
        if (this.isFullAmount) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_send_review_title_total, this.uiCurrencyPair.getAssetCurrency().getCode());
        }
        CryptoInputMode cryptoInputMode = this.cryptoInputMode;
        if (cryptoInputMode == CryptoInputMode.QUOTE_CURRENCY) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C37934R.string.crypto_send_fiat_amount;
            Money fiatEnteredAmountAtRequest = this.withdrawal.getFiatEnteredAmountAtRequest();
            Intrinsics.checkNotNull(fiatEnteredAmountAtRequest);
            return companion.invoke(i, Money.format$default(fiatEnteredAmountAtRequest, CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale(), true, null, false, 0, null, false, null, false, false, 1020, null), this.uiCurrencyPair.getAssetCurrency().getName());
        }
        CryptoInputMode cryptoInputMode2 = CryptoInputMode.ASSET_CURRENCY;
        if (cryptoInputMode == cryptoInputMode2) {
            return StringResource.INSTANCE.invoke((CharSequence) CryptoInstrumentInputHelper.processAmount$default(this.cryptoInstrumentInputHelper, this.withdrawal.getCryptoAmountTransferred(), null, cryptoInputMode2, true, false, false, false, 114, null).getFirst());
        }
        throw new IllegalStateException("This should not be programmatically possible");
    }

    public final StringResource getSubtitle() {
        if (this.isFullAmount) {
            return StringResource.INSTANCE.invoke((CharSequence) CryptoInstrumentInputHelper.processAmount$default(this.cryptoInstrumentInputHelper, this.withdrawal.getCryptoTotalAmountTransferred(), null, CryptoInputMode.ASSET_CURRENCY, true, false, false, false, 114, null).getFirst());
        }
        CryptoInputMode cryptoInputMode = this.cryptoInputMode;
        if (cryptoInputMode == CryptoInputMode.QUOTE_CURRENCY) {
            return StringResource.INSTANCE.invoke(CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getAssetCurrency(), (BigDecimal) CryptoInstrumentInputHelper.processAmount$default(this.cryptoInstrumentInputHelper, this.withdrawal.getCryptoAmountTransferred(), null, CryptoInputMode.ASSET_CURRENCY, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null).component2(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
        }
        if (cryptoInputMode == CryptoInputMode.ASSET_CURRENCY) {
            BigDecimal bigDecimalMultiply = this.withdrawal.getCryptoAmountTransferred().multiply(this.withdrawal.getFiatMarketRateAtRequest().getDecimalValue());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_send_fiat_amount_single_line, CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getQuoteCurrency(), bigDecimalMultiply, false, false, null, 0, null, null, false, false, false, true, 1022, null), this.uiCurrencyPair.getAssetCurrency().getName());
        }
        throw new IllegalStateException("This should not be programmatically possible");
    }

    public final String getAddress() {
        StringBuilder sb = new StringBuilder();
        String strSubstring = this.withdrawal.getWithdrawalAddress().substring(0, 5);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        sb.append("…");
        String strSubstring2 = this.withdrawal.getWithdrawalAddress().substring(this.withdrawal.getWithdrawalAddress().length() - 5, this.withdrawal.getWithdrawalAddress().length());
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb.append(strSubstring2);
        return sb.toString();
    }

    public final NetworkFeeData getNetworkFee() {
        Tuples2 tuples2M3642to;
        CryptoInputMode cryptoInputMode;
        if (this.isFullAmount || (cryptoInputMode = this.cryptoInputMode) == CryptoInputMode.ASSET_CURRENCY) {
            tuples2M3642to = Tuples4.m3642to(CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getAssetCurrency(), this.withdrawal.getCryptoNetworkBaseFee(), false, false, null, 0, null, null, false, false, false, false, 2026, null), CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getAssetCurrency(), this.withdrawal.getCryptoNetworkFee(), false, false, null, 0, null, null, false, false, false, false, 2026, null));
        } else if (cryptoInputMode == CryptoInputMode.QUOTE_CURRENCY) {
            tuples2M3642to = Tuples4.m3642to(CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getQuoteCurrency(), this.withdrawal.getCryptoNetworkBaseFeeInFiat(), false, false, null, 0, null, null, false, false, false, true, 1002, null), CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getQuoteCurrency(), this.withdrawal.getCryptoNetworkFeeInFiat(), false, false, null, 0, null, null, false, false, false, true, 1002, null));
        } else {
            throw new IllegalStateException("This should not be programmatically possible");
        }
        String str = (String) tuples2M3642to.component1();
        String str2 = (String) tuples2M3642to.component2();
        ApiCryptoTransferWithdrawal.Amount.NetworkFee.FeeRefundReason networkFeeRefundReason = this.withdrawal.getNetworkFeeRefundReason();
        int i = networkFeeRefundReason == null ? -1 : WhenMappings.$EnumSwitchMapping$0[networkFeeRefundReason.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return new NetworkFeeData.GoldRefund.Receipt(str2, str);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new NetworkFeeData.Default(str2);
    }

    public final StringResource getTotalLabel() {
        if (this.isFullAmount) {
            return StringResource.INSTANCE.invoke("");
        }
        return StringResource.INSTANCE.invoke(C37934R.string.crypt_send_review_total_row_label, new Object[0]);
    }

    public final String getTotalValue() {
        if (this.isFullAmount) {
            return "";
        }
        CryptoInputMode cryptoInputMode = this.cryptoInputMode;
        if (cryptoInputMode == CryptoInputMode.QUOTE_CURRENCY) {
            return Money.format$default(this.withdrawal.getFiatTotalAmountAtRequest(), CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale(), true, null, false, 0, null, false, null, false, false, 1020, null);
        }
        CryptoInputMode cryptoInputMode2 = CryptoInputMode.ASSET_CURRENCY;
        if (cryptoInputMode == cryptoInputMode2) {
            return (String) CryptoInstrumentInputHelper.processAmount$default(this.cryptoInstrumentInputHelper, this.withdrawal.getCryptoTotalAmountTransferred(), null, cryptoInputMode2, true, false, false, false, 114, null).getFirst();
        }
        throw new IllegalStateException("This should not be programmatically possible");
    }

    public final StringResource getHelperText() {
        boolean z = this.isMultiChain;
        if (z && this.isFullAmount) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C37934R.string.crypto_transfer_send_receipt_multi_chain_helper_text_full;
            String displaySymbol = this.uiCurrencyPair.getDisplaySymbol();
            ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork = this.selectedNetwork;
            Intrinsics.checkNotNull(cryptoNetwork);
            return companion.invoke(i, displaySymbol, cryptoNetwork.getNetwork_info().getName());
        }
        boolean z2 = this.isErc20Token;
        if (z2 && this.isFullAmount) {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            int i2 = C37934R.string.crypto_transfer_send_receipt_helper_text_full_erc;
            String displayName = this.uiCurrencyPair.getDisplayName();
            ApiCurrency.CryptoType cryptoType = ApiCurrency.CryptoType.ERC20;
            String nativeCurrencyName = cryptoType.getNativeCurrencyName();
            Intrinsics.checkNotNull(nativeCurrencyName);
            String cryptoTypeName = cryptoType.getCryptoTypeName();
            Intrinsics.checkNotNull(cryptoTypeName);
            return companion2.invoke(i2, displayName, nativeCurrencyName, cryptoTypeName);
        }
        if (!z2 && this.isFullAmount) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_transfer_send_receipt_helper_text_full, this.uiCurrencyPair.getDisplayName());
        }
        if (z && this.cryptoInputMode == CryptoInputMode.QUOTE_CURRENCY) {
            StringResource.Companion companion3 = StringResource.INSTANCE;
            int i3 = C37934R.string.crypto_transfer_send_receipt_multi_chain_helper_text_fiat;
            Money fiatEnteredAmountAtRequest = this.withdrawal.getFiatEnteredAmountAtRequest();
            Intrinsics.checkNotNull(fiatEnteredAmountAtRequest);
            String str = Money.format$default(fiatEnteredAmountAtRequest, CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale(), true, null, false, 0, null, false, null, false, false, 1020, null);
            String currency$default = CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getAssetCurrency(), this.withdrawal.getCryptoAmountTransferred(), false, false, null, 0, null, null, false, false, false, false, 2044, null);
            String displaySymbol2 = this.uiCurrencyPair.getDisplaySymbol();
            ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork2 = this.selectedNetwork;
            Intrinsics.checkNotNull(cryptoNetwork2);
            return companion3.invoke(i3, str, currency$default, displaySymbol2, cryptoNetwork2.getNetwork_info().getName());
        }
        if (z2 && this.cryptoInputMode == CryptoInputMode.QUOTE_CURRENCY) {
            StringResource.Companion companion4 = StringResource.INSTANCE;
            int i4 = C37934R.string.crypto_transfer_send_receipt_helper_text_fiat_erc;
            Money fiatEnteredAmountAtRequest2 = this.withdrawal.getFiatEnteredAmountAtRequest();
            Intrinsics.checkNotNull(fiatEnteredAmountAtRequest2);
            String str2 = Money.format$default(fiatEnteredAmountAtRequest2, CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale(), true, null, false, 0, null, false, null, false, false, 1020, null);
            String currency$default2 = CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getAssetCurrency(), this.withdrawal.getCryptoAmountTransferred(), false, false, null, 0, null, null, false, false, false, false, 2044, null);
            String displayName2 = this.uiCurrencyPair.getDisplayName();
            ApiCurrency.CryptoType cryptoType2 = ApiCurrency.CryptoType.ERC20;
            String nativeCurrencyName2 = cryptoType2.getNativeCurrencyName();
            Intrinsics.checkNotNull(nativeCurrencyName2);
            String cryptoTypeName2 = cryptoType2.getCryptoTypeName();
            Intrinsics.checkNotNull(cryptoTypeName2);
            return companion4.invoke(i4, str2, currency$default2, displayName2, nativeCurrencyName2, cryptoTypeName2);
        }
        if (!z2 && this.cryptoInputMode == CryptoInputMode.QUOTE_CURRENCY) {
            StringResource.Companion companion5 = StringResource.INSTANCE;
            int i5 = C37934R.string.crypto_transfer_send_receipt_helper_text_fiat;
            Money fiatEnteredAmountAtRequest3 = this.withdrawal.getFiatEnteredAmountAtRequest();
            Intrinsics.checkNotNull(fiatEnteredAmountAtRequest3);
            return companion5.invoke(i5, Money.format$default(fiatEnteredAmountAtRequest3, CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale(), true, null, false, 0, null, false, null, false, false, 1020, null), CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getAssetCurrency(), this.withdrawal.getCryptoAmountTransferred(), false, false, null, 0, null, null, false, false, false, false, 2044, null), this.uiCurrencyPair.getDisplayName());
        }
        if (z && this.cryptoInputMode == CryptoInputMode.ASSET_CURRENCY) {
            StringResource.Companion companion6 = StringResource.INSTANCE;
            int i6 = C37934R.string.crypto_transfer_send_receipt_multi_chain_helper_text_crypto;
            String currency$default3 = CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getAssetCurrency(), this.withdrawal.getCryptoAmountTransferred(), false, false, null, 0, null, null, false, false, false, false, 2044, null);
            String displaySymbol3 = this.uiCurrencyPair.getDisplaySymbol();
            ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork3 = this.selectedNetwork;
            Intrinsics.checkNotNull(cryptoNetwork3);
            return companion6.invoke(i6, currency$default3, displaySymbol3, cryptoNetwork3.getNetwork_info().getName());
        }
        if (z2 && this.cryptoInputMode == CryptoInputMode.ASSET_CURRENCY) {
            StringResource.Companion companion7 = StringResource.INSTANCE;
            int i7 = C37934R.string.crypto_transfer_send_receipt_helper_text_crypto_erc;
            String currency$default4 = CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getAssetCurrency(), this.withdrawal.getCryptoAmountTransferred(), false, false, null, 0, null, null, false, false, false, false, 2044, null);
            String displayName3 = this.uiCurrencyPair.getDisplayName();
            ApiCurrency.CryptoType cryptoType3 = ApiCurrency.CryptoType.ERC20;
            String nativeCurrencyName3 = cryptoType3.getNativeCurrencyName();
            Intrinsics.checkNotNull(nativeCurrencyName3);
            String cryptoTypeName3 = cryptoType3.getCryptoTypeName();
            Intrinsics.checkNotNull(cryptoTypeName3);
            return companion7.invoke(i7, currency$default4, displayName3, nativeCurrencyName3, cryptoTypeName3);
        }
        if (!z2 && this.cryptoInputMode == CryptoInputMode.ASSET_CURRENCY) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_transfer_send_receipt_helper_text_crypto, CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getAssetCurrency(), this.withdrawal.getCryptoAmountTransferred(), false, false, null, 0, null, null, false, false, false, false, 2044, null), this.uiCurrencyPair.getDisplayName());
        }
        throw new IllegalStateException("This should not be programmatically possible");
    }

    public final UUID getWithdrawalId() {
        return this.withdrawal.getWithdrawalId();
    }

    public final String getNetwork() {
        ApiCryptoSupportedNetworks.CryptoNetwork.NetworkInfo network_info;
        ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork = this.selectedNetwork;
        if (cryptoNetwork == null || (network_info = cryptoNetwork.getNetwork_info()) == null) {
            return null;
        }
        return network_info.getName();
    }

    public final String getMemo() {
        return this.withdrawal.getAddressTag();
    }

    public final StringResource getPrimaryCtaText() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        if (this.isFromGateway) {
            i = C37934R.string.crypto_send_confirmation_return_to_wallet_btn;
        } else {
            i = C11048R.string.general_label_done;
        }
        return companion.invoke(i, new Object[0]);
    }
}
