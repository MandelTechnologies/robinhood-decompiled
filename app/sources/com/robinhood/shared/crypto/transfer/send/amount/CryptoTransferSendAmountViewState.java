package com.robinhood.shared.crypto.transfer.send.amount;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.ErrorResponse3;
import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.models.api.transfer.ApiCryptoTransferWithdrawal;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferLimits;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.transfer.CryptoTransferWithdrawal;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendAmountViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001:\u0007wxyz{|}B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010Q\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010R\u001a\u00020\u00002\u0006\u0010S\u001a\u00020TJ(\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\r2\u0006\u0010X\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\u0007H\u0002J\u0006\u0010[\u001a\u00020\u0000J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010e\u001a\u00020\tHÆ\u0003J\t\u0010f\u001a\u00020\u000bHÆ\u0003J\t\u0010g\u001a\u00020\rHÆ\u0003J\t\u0010h\u001a\u00020\rHÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0011HÂ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0013HÂ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0015HÂ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0017HÂ\u0003J\t\u0010n\u001a\u00020\u0019HÂ\u0003J\t\u0010o\u001a\u00020\u0007HÂ\u0003J\t\u0010p\u001a\u00020\u0007HÂ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u001dHÂ\u0003J³\u0001\u0010r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001J\u0013\u0010s\u001a\u00020\u00032\b\u0010t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010u\u001a\u00020\u0005HÖ\u0001J\t\u0010v\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010-\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00105\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b6\u00100R\u000e\u00107\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u00109\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b:\u00100R\u0011\u0010;\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b<\u0010$R\u0011\u0010=\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b>\u00100R\u0011\u0010?\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b@\u00100R\u0011\u0010A\u001a\u00020B¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010E\u001a\u0004\u0018\u00010B¢\u0006\b\n\u0000\u001a\u0004\bF\u0010DR\u0011\u0010G\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\bH\u00100R\u0011\u0010I\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bI\u0010 R\u0011\u0010J\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bJ\u0010 R\u0011\u0010K\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bL\u0010*R\u0011\u0010M\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bM\u0010 R\u0011\u0010N\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bN\u0010 R\u0011\u0010O\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\bP\u00100R\u0014\u0010\\\u001a\u00020]8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0013\u0010`\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\ba\u0010$¨\u0006~"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState;", "", "isLoading", "", "shakeAnimationKey", "", "addressTag", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoInputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "cryptoAmount", "Ljava/math/BigDecimal;", "fiatAmount", "overTransferLimit", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "cryptoTransferConfig", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "cryptoTransferLimits", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferLimits;", "cryptoQuote", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "cryptoInstrumentInputHelper", "Lcom/robinhood/shared/formats/crypto/CryptoInstrumentInputHelper;", "cryptoAmountString", "fiatAmountString", "selectedNetwork", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;", "<init>", "(ZILjava/lang/String;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/formats/crypto/CryptoInputMode;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;Lcom/robinhood/models/crypto/db/transfer/CryptoTransferLimits;Lcom/robinhood/models/crypto/db/CryptoQuote;Lcom/robinhood/shared/formats/crypto/CryptoInstrumentInputHelper;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;)V", "()Z", "getShakeAnimationKey", "()I", "getAddressTag", "()Ljava/lang/String;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "getCryptoInputMode", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getCryptoAmount", "()Ljava/math/BigDecimal;", "getFiatAmount", "getOverTransferLimit", "availableText", "Lcom/robinhood/utils/resource/StringResource;", "getAvailableText", "()Lcom/robinhood/utils/resource/StringResource;", "typedAmount", "", "getTypedAmount", "()D", "typedAmountText", "getTypedAmountText", "isUserEligibleForHigherLimits", "isWithdrawalFiatMaximumUnlimited", "amountAvailableForWithdrawal", "getAmountAvailableForWithdrawal", "bodyTextLoggingIdentifier", "getBodyTextLoggingIdentifier", "estimatedAmountText", "getEstimatedAmountText", "overAvailableAmountText", "getOverAvailableAmountText", "amountAvailabilityPrimary", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountAvailableButtonType;", "getAmountAvailabilityPrimary", "()Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountAvailableButtonType;", "amountAvailabilitySecondary", "getAmountAvailabilitySecondary", "sendAllButtonText", "getSendAllButtonText", "isSendAllButtonEnabled", "isReviewButtonEnabled", "amount", "getAmount", "isAmountInFiat", "isFullAmount", "learnMoreUrl", "getLearnMoreUrl", "codeForInputMode", "mutateWith", "keyEvent", "Landroid/view/KeyEvent;", "checkForError", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$KeyPressError;", "newCryptoAmountToCheck", "newCryptoAmountStringToCheck", "newFiatAmountToCheck", "newFiatAmountStringToCheck", "mutateToSendAll", "amountState", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountState;", "getAmountState$feature_crypto_transfer_externalDebug", "()Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountState;", "networkCode", "getNetworkCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "toString", "AmountAvailableButtonType", "AmountState", "WithdrawalAttempt", "CryptoValidationErrorWrapper", "CryptoTransferSendWarningSheetState", "WithdrawalWarningButtonState", "KeyPressError", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferSendAmountViewState {
    public static final int $stable = 8;
    private final String addressTag;
    private final AmountAvailableButtonType amountAvailabilityPrimary;
    private final AmountAvailableButtonType amountAvailabilitySecondary;
    private final AppType appType;
    private final BigDecimal cryptoAmount;
    private final String cryptoAmountString;
    private final CryptoInputMode cryptoInputMode;
    private final CryptoInstrumentInputHelper cryptoInstrumentInputHelper;
    private final CryptoQuote cryptoQuote;
    private final CryptoTransferConfig cryptoTransferConfig;
    private final CryptoTransferLimits cryptoTransferLimits;
    private final BigDecimal fiatAmount;
    private final String fiatAmountString;
    private final boolean isLoading;
    private final boolean isUserEligibleForHigherLimits;
    private final boolean isWithdrawalFiatMaximumUnlimited;
    private final boolean overTransferLimit;
    private final ApiCryptoSupportedNetworks.CryptoNetwork selectedNetwork;
    private final int shakeAnimationKey;
    private final UiCurrencyPair uiCurrencyPair;

    /* compiled from: CryptoTransferSendAmountViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CryptoInputMode.values().length];
            try {
                iArr[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[KeyPressError.values().length];
            try {
                iArr2[KeyPressError.MAX_DECIMAL_REACHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[KeyPressError.OVER_WITHDRAWAL_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[KeyPressError.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: component10, reason: from getter */
    private final CryptoTransferConfig getCryptoTransferConfig() {
        return this.cryptoTransferConfig;
    }

    /* renamed from: component11, reason: from getter */
    private final CryptoTransferLimits getCryptoTransferLimits() {
        return this.cryptoTransferLimits;
    }

    /* renamed from: component12, reason: from getter */
    private final CryptoQuote getCryptoQuote() {
        return this.cryptoQuote;
    }

    /* renamed from: component13, reason: from getter */
    private final CryptoInstrumentInputHelper getCryptoInstrumentInputHelper() {
        return this.cryptoInstrumentInputHelper;
    }

    /* renamed from: component14, reason: from getter */
    private final String getCryptoAmountString() {
        return this.cryptoAmountString;
    }

    /* renamed from: component15, reason: from getter */
    private final String getFiatAmountString() {
        return this.fiatAmountString;
    }

    /* renamed from: component16, reason: from getter */
    private final ApiCryptoSupportedNetworks.CryptoNetwork getSelectedNetwork() {
        return this.selectedNetwork;
    }

    /* renamed from: component9, reason: from getter */
    private final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    public static /* synthetic */ CryptoTransferSendAmountViewState copy$default(CryptoTransferSendAmountViewState cryptoTransferSendAmountViewState, boolean z, int i, String str, AppType appType, CryptoInputMode cryptoInputMode, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z2, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig, CryptoTransferLimits cryptoTransferLimits, CryptoQuote cryptoQuote, CryptoInstrumentInputHelper cryptoInstrumentInputHelper, String str2, String str3, ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork, int i2, Object obj) {
        return cryptoTransferSendAmountViewState.copy((i2 & 1) != 0 ? cryptoTransferSendAmountViewState.isLoading : z, (i2 & 2) != 0 ? cryptoTransferSendAmountViewState.shakeAnimationKey : i, (i2 & 4) != 0 ? cryptoTransferSendAmountViewState.addressTag : str, (i2 & 8) != 0 ? cryptoTransferSendAmountViewState.appType : appType, (i2 & 16) != 0 ? cryptoTransferSendAmountViewState.cryptoInputMode : cryptoInputMode, (i2 & 32) != 0 ? cryptoTransferSendAmountViewState.cryptoAmount : bigDecimal, (i2 & 64) != 0 ? cryptoTransferSendAmountViewState.fiatAmount : bigDecimal2, (i2 & 128) != 0 ? cryptoTransferSendAmountViewState.overTransferLimit : z2, (i2 & 256) != 0 ? cryptoTransferSendAmountViewState.uiCurrencyPair : uiCurrencyPair, (i2 & 512) != 0 ? cryptoTransferSendAmountViewState.cryptoTransferConfig : cryptoTransferConfig, (i2 & 1024) != 0 ? cryptoTransferSendAmountViewState.cryptoTransferLimits : cryptoTransferLimits, (i2 & 2048) != 0 ? cryptoTransferSendAmountViewState.cryptoQuote : cryptoQuote, (i2 & 4096) != 0 ? cryptoTransferSendAmountViewState.cryptoInstrumentInputHelper : cryptoInstrumentInputHelper, (i2 & 8192) != 0 ? cryptoTransferSendAmountViewState.cryptoAmountString : str2, (i2 & 16384) != 0 ? cryptoTransferSendAmountViewState.fiatAmountString : str3, (i2 & 32768) != 0 ? cryptoTransferSendAmountViewState.selectedNetwork : cryptoNetwork);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final int getShakeAnimationKey() {
        return this.shakeAnimationKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAddressTag() {
        return this.addressTag;
    }

    /* renamed from: component4, reason: from getter */
    public final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component5, reason: from getter */
    public final CryptoInputMode getCryptoInputMode() {
        return this.cryptoInputMode;
    }

    /* renamed from: component6, reason: from getter */
    public final BigDecimal getCryptoAmount() {
        return this.cryptoAmount;
    }

    /* renamed from: component7, reason: from getter */
    public final BigDecimal getFiatAmount() {
        return this.fiatAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getOverTransferLimit() {
        return this.overTransferLimit;
    }

    public final CryptoTransferSendAmountViewState copy(boolean isLoading, int shakeAnimationKey, String addressTag, AppType appType, CryptoInputMode cryptoInputMode, BigDecimal cryptoAmount, BigDecimal fiatAmount, boolean overTransferLimit, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig, CryptoTransferLimits cryptoTransferLimits, CryptoQuote cryptoQuote, CryptoInstrumentInputHelper cryptoInstrumentInputHelper, String cryptoAmountString, String fiatAmountString, ApiCryptoSupportedNetworks.CryptoNetwork selectedNetwork) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
        Intrinsics.checkNotNullParameter(cryptoAmount, "cryptoAmount");
        Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        Intrinsics.checkNotNullParameter(cryptoInstrumentInputHelper, "cryptoInstrumentInputHelper");
        Intrinsics.checkNotNullParameter(cryptoAmountString, "cryptoAmountString");
        Intrinsics.checkNotNullParameter(fiatAmountString, "fiatAmountString");
        return new CryptoTransferSendAmountViewState(isLoading, shakeAnimationKey, addressTag, appType, cryptoInputMode, cryptoAmount, fiatAmount, overTransferLimit, uiCurrencyPair, cryptoTransferConfig, cryptoTransferLimits, cryptoQuote, cryptoInstrumentInputHelper, cryptoAmountString, fiatAmountString, selectedNetwork);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferSendAmountViewState)) {
            return false;
        }
        CryptoTransferSendAmountViewState cryptoTransferSendAmountViewState = (CryptoTransferSendAmountViewState) other;
        return this.isLoading == cryptoTransferSendAmountViewState.isLoading && this.shakeAnimationKey == cryptoTransferSendAmountViewState.shakeAnimationKey && Intrinsics.areEqual(this.addressTag, cryptoTransferSendAmountViewState.addressTag) && this.appType == cryptoTransferSendAmountViewState.appType && this.cryptoInputMode == cryptoTransferSendAmountViewState.cryptoInputMode && Intrinsics.areEqual(this.cryptoAmount, cryptoTransferSendAmountViewState.cryptoAmount) && Intrinsics.areEqual(this.fiatAmount, cryptoTransferSendAmountViewState.fiatAmount) && this.overTransferLimit == cryptoTransferSendAmountViewState.overTransferLimit && Intrinsics.areEqual(this.uiCurrencyPair, cryptoTransferSendAmountViewState.uiCurrencyPair) && Intrinsics.areEqual(this.cryptoTransferConfig, cryptoTransferSendAmountViewState.cryptoTransferConfig) && Intrinsics.areEqual(this.cryptoTransferLimits, cryptoTransferSendAmountViewState.cryptoTransferLimits) && Intrinsics.areEqual(this.cryptoQuote, cryptoTransferSendAmountViewState.cryptoQuote) && Intrinsics.areEqual(this.cryptoInstrumentInputHelper, cryptoTransferSendAmountViewState.cryptoInstrumentInputHelper) && Intrinsics.areEqual(this.cryptoAmountString, cryptoTransferSendAmountViewState.cryptoAmountString) && Intrinsics.areEqual(this.fiatAmountString, cryptoTransferSendAmountViewState.fiatAmountString) && Intrinsics.areEqual(this.selectedNetwork, cryptoTransferSendAmountViewState.selectedNetwork);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + Integer.hashCode(this.shakeAnimationKey)) * 31;
        String str = this.addressTag;
        int iHashCode2 = (((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.appType.hashCode()) * 31) + this.cryptoInputMode.hashCode()) * 31) + this.cryptoAmount.hashCode()) * 31) + this.fiatAmount.hashCode()) * 31) + Boolean.hashCode(this.overTransferLimit)) * 31) + this.uiCurrencyPair.hashCode()) * 31;
        CryptoTransferConfig cryptoTransferConfig = this.cryptoTransferConfig;
        int iHashCode3 = (iHashCode2 + (cryptoTransferConfig == null ? 0 : cryptoTransferConfig.hashCode())) * 31;
        CryptoTransferLimits cryptoTransferLimits = this.cryptoTransferLimits;
        int iHashCode4 = (iHashCode3 + (cryptoTransferLimits == null ? 0 : cryptoTransferLimits.hashCode())) * 31;
        CryptoQuote cryptoQuote = this.cryptoQuote;
        int iHashCode5 = (((((((iHashCode4 + (cryptoQuote == null ? 0 : cryptoQuote.hashCode())) * 31) + this.cryptoInstrumentInputHelper.hashCode()) * 31) + this.cryptoAmountString.hashCode()) * 31) + this.fiatAmountString.hashCode()) * 31;
        ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork = this.selectedNetwork;
        return iHashCode5 + (cryptoNetwork != null ? cryptoNetwork.hashCode() : 0);
    }

    public String toString() {
        return "CryptoTransferSendAmountViewState(isLoading=" + this.isLoading + ", shakeAnimationKey=" + this.shakeAnimationKey + ", addressTag=" + this.addressTag + ", appType=" + this.appType + ", cryptoInputMode=" + this.cryptoInputMode + ", cryptoAmount=" + this.cryptoAmount + ", fiatAmount=" + this.fiatAmount + ", overTransferLimit=" + this.overTransferLimit + ", uiCurrencyPair=" + this.uiCurrencyPair + ", cryptoTransferConfig=" + this.cryptoTransferConfig + ", cryptoTransferLimits=" + this.cryptoTransferLimits + ", cryptoQuote=" + this.cryptoQuote + ", cryptoInstrumentInputHelper=" + this.cryptoInstrumentInputHelper + ", cryptoAmountString=" + this.cryptoAmountString + ", fiatAmountString=" + this.fiatAmountString + ", selectedNetwork=" + this.selectedNetwork + ")";
    }

    public CryptoTransferSendAmountViewState(boolean z, int i, String str, AppType appType, CryptoInputMode cryptoInputMode, BigDecimal cryptoAmount, BigDecimal fiatAmount, boolean z2, UiCurrencyPair uiCurrencyPair, CryptoTransferConfig cryptoTransferConfig, CryptoTransferLimits cryptoTransferLimits, CryptoQuote cryptoQuote, CryptoInstrumentInputHelper cryptoInstrumentInputHelper, String cryptoAmountString, String fiatAmountString, ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork) {
        AmountAvailableButtonType done;
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
        Intrinsics.checkNotNullParameter(cryptoAmount, "cryptoAmount");
        Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        Intrinsics.checkNotNullParameter(cryptoInstrumentInputHelper, "cryptoInstrumentInputHelper");
        Intrinsics.checkNotNullParameter(cryptoAmountString, "cryptoAmountString");
        Intrinsics.checkNotNullParameter(fiatAmountString, "fiatAmountString");
        this.isLoading = z;
        this.shakeAnimationKey = i;
        this.addressTag = str;
        this.appType = appType;
        this.cryptoInputMode = cryptoInputMode;
        this.cryptoAmount = cryptoAmount;
        this.fiatAmount = fiatAmount;
        this.overTransferLimit = z2;
        this.uiCurrencyPair = uiCurrencyPair;
        this.cryptoTransferConfig = cryptoTransferConfig;
        this.cryptoTransferLimits = cryptoTransferLimits;
        this.cryptoQuote = cryptoQuote;
        this.cryptoInstrumentInputHelper = cryptoInstrumentInputHelper;
        this.cryptoAmountString = cryptoAmountString;
        this.fiatAmountString = fiatAmountString;
        this.selectedNetwork = cryptoNetwork;
        boolean z3 = cryptoTransferLimits != null && cryptoTransferLimits.getEligibleForHigherLimit();
        this.isUserEligibleForHigherLimits = z3;
        boolean z4 = cryptoTransferLimits != null && cryptoTransferLimits.getWithdrawalFiatMaximumUnlimited();
        this.isWithdrawalFiatMaximumUnlimited = z4;
        AppType appType2 = AppType.RHC;
        if (appType == appType2) {
            done = new AmountAvailableButtonType.Done(true);
        } else if (z3) {
            done = AmountAvailableButtonType.ReviewTransferLimits.INSTANCE;
        } else {
            done = new AmountAvailableButtonType.Done(false);
        }
        this.amountAvailabilityPrimary = done;
        AmountAvailableButtonType done2 = null;
        if (appType != appType2) {
            if (z3) {
                done2 = new AmountAvailableButtonType.Done(false);
            } else if (!z4 && !z3) {
                done2 = AmountAvailableButtonType.LearnMore.INSTANCE;
            }
        }
        this.amountAvailabilitySecondary = done2;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final int getShakeAnimationKey() {
        return this.shakeAnimationKey;
    }

    public final String getAddressTag() {
        return this.addressTag;
    }

    public final AppType getAppType() {
        return this.appType;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CryptoTransferSendAmountViewState(boolean r20, int r21, java.lang.String r22, com.robinhood.shared.app.type.AppType r23, com.robinhood.shared.formats.crypto.CryptoInputMode r24, java.math.BigDecimal r25, java.math.BigDecimal r26, boolean r27, com.robinhood.models.crypto.p315ui.UiCurrencyPair r28, com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig r29, com.robinhood.models.crypto.p314db.transfer.CryptoTransferLimits r30, com.robinhood.models.crypto.p314db.CryptoQuote r31, com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper r32, java.lang.String r33, java.lang.String r34, com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks.CryptoNetwork r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r19 = this;
            r0 = r36
            r1 = r0 & 16
            if (r1 == 0) goto La
            com.robinhood.shared.formats.crypto.CryptoInputMode r1 = com.robinhood.shared.formats.crypto.CryptoInputMode.ASSET_CURRENCY
            r7 = r1
            goto Lc
        La:
            r7 = r24
        Lc:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L13
            r1 = 0
            r10 = r1
            goto L15
        L13:
            r10 = r27
        L15:
            r1 = r0 & 512(0x200, float:7.175E-43)
            r2 = 0
            if (r1 == 0) goto L1c
            r12 = r2
            goto L1e
        L1c:
            r12 = r29
        L1e:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L24
            r13 = r2
            goto L26
        L24:
            r13 = r30
        L26:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L2c
            r14 = r2
            goto L2e
        L2c:
            r14 = r31
        L2e:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L4d
            r18 = r2
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r8 = r25
            r9 = r26
            r11 = r28
            r15 = r32
            r16 = r33
            r17 = r34
            r2 = r19
            goto L65
        L4d:
            r18 = r35
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r8 = r25
            r9 = r26
            r11 = r28
            r15 = r32
            r16 = r33
            r17 = r34
        L65:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState.<init>(boolean, int, java.lang.String, com.robinhood.shared.app.type.AppType, com.robinhood.shared.formats.crypto.CryptoInputMode, java.math.BigDecimal, java.math.BigDecimal, boolean, com.robinhood.models.crypto.ui.UiCurrencyPair, com.robinhood.models.crypto.db.transfer.CryptoTransferConfig, com.robinhood.models.crypto.db.transfer.CryptoTransferLimits, com.robinhood.models.crypto.db.CryptoQuote, com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper, java.lang.String, java.lang.String, com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks$CryptoNetwork, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final CryptoInputMode getCryptoInputMode() {
        return this.cryptoInputMode;
    }

    public final BigDecimal getCryptoAmount() {
        return this.cryptoAmount;
    }

    public final BigDecimal getFiatAmount() {
        return this.fiatAmount;
    }

    public final boolean getOverTransferLimit() {
        return this.overTransferLimit;
    }

    /* compiled from: CryptoTransferSendAmountViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00060\u000bj\u0002`\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0012\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountAvailableButtonType;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "loggingIdentifier", "", "getLoggingIdentifier", "()Ljava/lang/String;", "loggingAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "getLoggingAction", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "ReviewTransferLimits", "Done", "LearnMore", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountAvailableButtonType$Done;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountAvailableButtonType$LearnMore;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountAvailableButtonType$ReviewTransferLimits;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface AmountAvailableButtonType {
        UserInteractionEventData.Action getLoggingAction();

        String getLoggingIdentifier();

        StringResource getText();

        /* compiled from: CryptoTransferSendAmountViewState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00060\rj\u0002`\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountAvailableButtonType$ReviewTransferLimits;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountAvailableButtonType;", "<init>", "()V", "text", "Lcom/robinhood/utils/resource/StringResource;", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "loggingIdentifier", "", "getLoggingIdentifier", "()Ljava/lang/String;", "loggingAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "getLoggingAction", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ReviewTransferLimits implements AmountAvailableButtonType {
            public static final int $stable = 0;
            public static final ReviewTransferLimits INSTANCE = new ReviewTransferLimits();

            public boolean equals(Object other) {
                return this == other || (other instanceof ReviewTransferLimits);
            }

            public int hashCode() {
                return -1907852588;
            }

            public String toString() {
                return "ReviewTransferLimits";
            }

            private ReviewTransferLimits() {
            }

            @Override // com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState.AmountAvailableButtonType
            public StringResource getText() {
                return StringResource.INSTANCE.invoke(C37934R.string.crypto_review_transfer_limits, new Object[0]);
            }

            @Override // com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState.AmountAvailableButtonType
            public String getLoggingIdentifier() {
                return "review";
            }

            @Override // com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState.AmountAvailableButtonType
            public UserInteractionEventData.Action getLoggingAction() {
                return UserInteractionEventData.Action.REVIEW;
            }
        }

        /* compiled from: CryptoTransferSendAmountViewState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00060\u0010j\u0002`\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountAvailableButtonType$Done;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountAvailableButtonType;", "isRhc", "", "<init>", "(Z)V", "()Z", "text", "Lcom/robinhood/utils/resource/StringResource;", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "loggingIdentifier", "", "getLoggingIdentifier", "()Ljava/lang/String;", "loggingAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "getLoggingAction", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Done implements AmountAvailableButtonType {
            public static final int $stable = 0;
            private final boolean isRhc;

            public static /* synthetic */ Done copy$default(Done done, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = done.isRhc;
                }
                return done.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsRhc() {
                return this.isRhc;
            }

            public final Done copy(boolean isRhc) {
                return new Done(isRhc);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Done) && this.isRhc == ((Done) other).isRhc;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isRhc);
            }

            public String toString() {
                return "Done(isRhc=" + this.isRhc + ")";
            }

            public Done(boolean z) {
                this.isRhc = z;
            }

            public final boolean isRhc() {
                return this.isRhc;
            }

            @Override // com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState.AmountAvailableButtonType
            public StringResource getText() {
                if (this.isRhc) {
                    return StringResource.INSTANCE.invoke(C37934R.string.crypto_review_ok, new Object[0]);
                }
                return StringResource.INSTANCE.invoke(C37934R.string.crypto_review_got_it, new Object[0]);
            }

            @Override // com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState.AmountAvailableButtonType
            public String getLoggingIdentifier() {
                return "done";
            }

            @Override // com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState.AmountAvailableButtonType
            public UserInteractionEventData.Action getLoggingAction() {
                return UserInteractionEventData.Action.DONE;
            }
        }

        /* compiled from: CryptoTransferSendAmountViewState.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00060\rj\u0002`\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountAvailableButtonType$LearnMore;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountAvailableButtonType;", "<init>", "()V", "text", "Lcom/robinhood/utils/resource/StringResource;", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "loggingIdentifier", "", "getLoggingIdentifier", "()Ljava/lang/String;", "loggingAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "getLoggingAction", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LearnMore implements AmountAvailableButtonType {
            public static final int $stable = 0;
            public static final LearnMore INSTANCE = new LearnMore();

            public boolean equals(Object other) {
                return this == other || (other instanceof LearnMore);
            }

            public int hashCode() {
                return 1867083744;
            }

            public String toString() {
                return "LearnMore";
            }

            private LearnMore() {
            }

            @Override // com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState.AmountAvailableButtonType
            public StringResource getText() {
                return StringResource.INSTANCE.invoke(C37934R.string.crypto_transfer_label_learn_more, new Object[0]);
            }

            @Override // com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState.AmountAvailableButtonType
            public String getLoggingIdentifier() {
                return AnalyticsStrings.BUTTON_PROFIT_LOSS_CHART_LEARN_MORE;
            }

            @Override // com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState.AmountAvailableButtonType
            public UserInteractionEventData.Action getLoggingAction() {
                return UserInteractionEventData.Action.LEARN_MORE;
            }
        }
    }

    public final StringResource getAvailableText() {
        CryptoQuote cryptoQuote;
        CryptoTransferConfig cryptoTransferConfig = this.cryptoTransferConfig;
        BigDecimal transferableQuantity = cryptoTransferConfig != null ? cryptoTransferConfig.getTransferableQuantity() : null;
        if (transferableQuantity == null) {
            return StringResource.INSTANCE.invoke("");
        }
        if (!BigDecimals7.m2977eq(transferableQuantity, BigDecimal.ZERO) && BigDecimals7.m2977eq(this.cryptoAmount, transferableQuantity)) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_send_total_balance, new Object[0]);
        }
        CryptoInputMode cryptoInputMode = this.cryptoInputMode;
        if (cryptoInputMode == CryptoInputMode.QUOTE_CURRENCY && (cryptoQuote = this.cryptoQuote) != null) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_send_available, CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getQuoteCurrency(), BigDecimals7.safeMultiply(Money3.getBigDecimalCompat(cryptoQuote.getMarkPrice()), transferableQuantity), false, false, null, 0, null, null, false, false, false, false, 2046, null));
        }
        if (cryptoInputMode != CryptoInputMode.ASSET_CURRENCY) {
            return StringResource.INSTANCE.invoke("");
        }
        return StringResource.INSTANCE.invoke(C37934R.string.crypto_send_available, CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getAssetCurrency(), transferableQuantity, false, false, null, 0, null, null, false, false, false, false, 2046, null));
    }

    public final double getTypedAmount() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.cryptoInputMode.ordinal()];
        if (i == 1) {
            return this.fiatAmount.doubleValue();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.cryptoAmount.doubleValue();
    }

    public final StringResource getTypedAmountText() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.cryptoInputMode.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_send_fiat_amount, this.fiatAmountString, this.uiCurrencyPair.getAssetCurrency().getName());
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(this.cryptoAmountString);
    }

    public final StringResource getAmountAvailableForWithdrawal() {
        CryptoTransferConfig cryptoTransferConfig = this.cryptoTransferConfig;
        BigDecimal transferableQuantity = cryptoTransferConfig != null ? cryptoTransferConfig.getTransferableQuantity() : null;
        CryptoTransferLimits cryptoTransferLimits = this.cryptoTransferLimits;
        if (cryptoTransferLimits == null || transferableQuantity == null) {
            return null;
        }
        if (!BigDecimals7.m2977eq(transferableQuantity, BigDecimal.ZERO) && BigDecimals7.m2977eq(this.cryptoAmount, transferableQuantity)) {
            return null;
        }
        if (this.appType == AppType.RHC) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_amount_available_rhc, this.uiCurrencyPair.getAssetCurrency().getName());
        }
        if (cryptoTransferLimits.getWithdrawalFiatMaximumUnlimited()) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_amount_available_unlimited, this.uiCurrencyPair.getAssetCurrency().getName());
        }
        if (cryptoTransferLimits.getEligibleForHigherLimit()) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_amount_available_eligible_for_limits, this.uiCurrencyPair.getAssetCurrency().getName(), CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getQuoteCurrency(), cryptoTransferLimits.getWithdrawalFiatMaximum().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
        }
        return StringResource.INSTANCE.invoke(C37934R.string.crypto_amount_available_ineligible_for_limits, this.uiCurrencyPair.getAssetCurrency().getName(), CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getQuoteCurrency(), cryptoTransferLimits.getWithdrawalFiatMaximum().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
    }

    public final String getBodyTextLoggingIdentifier() {
        CryptoTransferLimits cryptoTransferLimits = this.cryptoTransferLimits;
        if (cryptoTransferLimits != null && cryptoTransferLimits.getEligibleForHigherLimit()) {
            return "available_to_send_eligilble";
        }
        return "available_to_send_ineligilble";
    }

    public final StringResource getEstimatedAmountText() {
        if (BigDecimals7.isPositive(this.cryptoAmount) && this.cryptoInputMode == CryptoInputMode.QUOTE_CURRENCY) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_send_est, this.cryptoAmountString);
        }
        if (BigDecimals7.isPositive(this.cryptoAmount) && this.cryptoInputMode == CryptoInputMode.ASSET_CURRENCY) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_send_est, this.fiatAmountString);
        }
        if (BigDecimals7.isZero(this.cryptoAmount) && this.cryptoInputMode == CryptoInputMode.QUOTE_CURRENCY) {
            return StringResource.INSTANCE.invoke(this.cryptoAmountString);
        }
        if (BigDecimals7.isZero(this.cryptoAmount) && this.cryptoInputMode == CryptoInputMode.ASSET_CURRENCY) {
            return StringResource.INSTANCE.invoke(this.fiatAmountString);
        }
        return StringResource.INSTANCE.invoke("");
    }

    public final StringResource getOverAvailableAmountText() {
        CryptoQuote cryptoQuote;
        CryptoTransferConfig cryptoTransferConfig = this.cryptoTransferConfig;
        BigDecimal transferableQuantity = cryptoTransferConfig != null ? cryptoTransferConfig.getTransferableQuantity() : null;
        if (transferableQuantity == null) {
            return StringResource.INSTANCE.invoke("");
        }
        CryptoInputMode cryptoInputMode = this.cryptoInputMode;
        if (cryptoInputMode == CryptoInputMode.QUOTE_CURRENCY && (cryptoQuote = this.cryptoQuote) != null) {
            return StringResource.INSTANCE.invoke(C37934R.string.crypto_order_status_too_large, CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getQuoteCurrency(), BigDecimals7.safeMultiply(Money3.getBigDecimalCompat(cryptoQuote.getMarkPrice()), transferableQuantity), false, false, null, 0, null, null, false, false, false, false, 2046, null));
        }
        if (cryptoInputMode != CryptoInputMode.ASSET_CURRENCY) {
            return StringResource.INSTANCE.invoke("");
        }
        return StringResource.INSTANCE.invoke(C37934R.string.crypto_order_status_too_large, CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getAssetCurrency(), transferableQuantity, false, false, null, 0, null, null, false, false, false, false, 2046, null));
    }

    public final AmountAvailableButtonType getAmountAvailabilityPrimary() {
        return this.amountAvailabilityPrimary;
    }

    public final AmountAvailableButtonType getAmountAvailabilitySecondary() {
        return this.amountAvailabilitySecondary;
    }

    public final StringResource getSendAllButtonText() {
        return StringResource.INSTANCE.invoke(C37934R.string.crypto_send_all_with_code, this.uiCurrencyPair.getAssetCurrency().getCode());
    }

    public final boolean isSendAllButtonEnabled() {
        CryptoTransferConfig cryptoTransferConfig;
        BigDecimal transferableQuantity;
        return (this.isLoading || (cryptoTransferConfig = this.cryptoTransferConfig) == null || (transferableQuantity = cryptoTransferConfig.getTransferableQuantity()) == null || !BigDecimals7.isPositive(transferableQuantity) || !BigDecimals7.m2979lt(this.cryptoAmount, this.cryptoTransferConfig.getTransferableQuantity())) ? false : true;
    }

    public final boolean isReviewButtonEnabled() {
        if (this.isLoading || !BigDecimals7.isPositive(this.cryptoAmount)) {
            return false;
        }
        BigDecimal bigDecimal = this.cryptoAmount;
        CryptoTransferConfig cryptoTransferConfig = this.cryptoTransferConfig;
        return BigDecimals7.lte(bigDecimal, cryptoTransferConfig != null ? cryptoTransferConfig.getTransferableQuantity() : null);
    }

    public final BigDecimal getAmount() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.cryptoInputMode.ordinal()];
        if (i == 1) {
            return this.fiatAmount;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.cryptoAmount;
    }

    public final boolean isAmountInFiat() {
        return this.cryptoInputMode == CryptoInputMode.QUOTE_CURRENCY;
    }

    public final boolean isFullAmount() {
        BigDecimal transferableQuantity;
        CryptoTransferConfig cryptoTransferConfig = this.cryptoTransferConfig;
        return cryptoTransferConfig != null && (transferableQuantity = cryptoTransferConfig.getTransferableQuantity()) != null && BigDecimals7.isPositive(transferableQuantity) && BigDecimals7.m2977eq(this.cryptoAmount, this.cryptoTransferConfig.getTransferableQuantity());
    }

    public final StringResource getLearnMoreUrl() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        if (this.appType == AppType.RHC) {
            i = C37934R.string.crypto_limits_learn_more_rhc;
        } else {
            i = C37934R.string.crypto_limits_learn_more;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final String codeForInputMode(CryptoInputMode cryptoInputMode) {
        Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
        int i = WhenMappings.$EnumSwitchMapping$0[cryptoInputMode.ordinal()];
        if (i == 1) {
            return this.uiCurrencyPair.getQuoteCurrency().getCode();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.uiCurrencyPair.getAssetCurrency().getCode();
    }

    public final CryptoTransferSendAmountViewState mutateWith(KeyEvent keyEvent) {
        String str;
        BigDecimal bigDecimal;
        String str2;
        BigDecimal bigDecimal2;
        String str3;
        Money markPrice;
        BigDecimal bigDecimal3;
        String str4;
        BigDecimal bigDecimal4;
        BigDecimal bigDecimal5;
        BigDecimal bigDecimalSafeMultiply;
        Money markPrice2;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        CryptoInputMode cryptoInputMode = this.cryptoInputMode;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[cryptoInputMode.ordinal()];
        if (i == 1) {
            str = this.fiatAmountString;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = this.cryptoAmountString;
        }
        String str5 = null;
        Tuples2 tuples2ProcessKeyEvent$default = CryptoInstrumentInputHelper.processKeyEvent$default(this.cryptoInstrumentInputHelper, keyEvent, str, this.cryptoInputMode, true, false, false, false, 112, null);
        String str6 = (String) tuples2ProcessKeyEvent$default.component1();
        BigDecimal bigDecimal6 = (BigDecimal) tuples2ProcessKeyEvent$default.component2();
        int i2 = iArr[this.cryptoInputMode.ordinal()];
        if (i2 == 1) {
            CryptoQuote cryptoQuote = this.cryptoQuote;
            BigDecimal bigDecimalSafeDivide$default = BigDecimals7.safeDivide$default(bigDecimal6, (cryptoQuote == null || (markPrice = cryptoQuote.getMarkPrice()) == null) ? null : Money3.getBigDecimalCompat(markPrice), this.uiCurrencyPair.getAssetCurrency().getDecimalScale(), null, 4, null);
            if (BigDecimals7.isZero(bigDecimalSafeDivide$default)) {
                str3 = "0 " + this.uiCurrencyPair.getDisplaySymbol();
                str2 = str6;
                bigDecimal2 = bigDecimal6;
                bigDecimal = new BigDecimal("0");
            } else {
                Tuples2 tuples2ProcessAmount$default = CryptoInstrumentInputHelper.processAmount$default(this.cryptoInstrumentInputHelper, bigDecimalSafeDivide$default, null, CryptoInputMode.ASSET_CURRENCY, true, false, false, false, 114, null);
                String str7 = (String) tuples2ProcessAmount$default.component1();
                bigDecimal = (BigDecimal) tuples2ProcessAmount$default.component2();
                str2 = str6;
                bigDecimal2 = bigDecimal6;
                str3 = str7;
            }
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (bigDecimal6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newCryptoAmount");
                bigDecimal5 = null;
            } else {
                bigDecimal5 = bigDecimal6;
            }
            if (BigDecimals7.isZero(bigDecimal5)) {
                bigDecimalSafeMultiply = new BigDecimal("0", new MathContext(0));
            } else {
                CryptoQuote cryptoQuote2 = this.cryptoQuote;
                bigDecimalSafeMultiply = BigDecimals7.safeMultiply(bigDecimal6, (cryptoQuote2 == null || (markPrice2 = cryptoQuote2.getMarkPrice()) == null) ? null : Money3.getBigDecimalCompat(markPrice2));
            }
            Tuples2 tuples2ProcessAmount$default2 = CryptoInstrumentInputHelper.processAmount$default(this.cryptoInstrumentInputHelper, bigDecimalSafeMultiply, RoundingMode.HALF_UP, CryptoInputMode.QUOTE_CURRENCY, false, false, false, false, 120, null);
            String str8 = (String) tuples2ProcessAmount$default2.component1();
            bigDecimal2 = (BigDecimal) tuples2ProcessAmount$default2.component2();
            str3 = str6;
            bigDecimal = bigDecimal6;
            str2 = str8;
        }
        if (bigDecimal == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newCryptoAmount");
            bigDecimal3 = null;
        } else {
            bigDecimal3 = bigDecimal;
        }
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newCryptoAmountString");
            str4 = null;
        } else {
            str4 = str3;
        }
        if (bigDecimal2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newFiatAmount");
            bigDecimal4 = null;
        } else {
            bigDecimal4 = bigDecimal2;
        }
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newFiatAmountString");
        } else {
            str5 = str2;
        }
        int i3 = WhenMappings.$EnumSwitchMapping$1[checkForError(bigDecimal3, str4, bigDecimal4, str5).ordinal()];
        if (i3 == 1) {
            return copy$default(this, false, this.shakeAnimationKey + 1, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 65533, null);
        }
        if (i3 == 2) {
            return copy$default(this, false, this.shakeAnimationKey + 1, null, null, null, null, null, true, null, null, null, null, null, null, null, null, 65405, null);
        }
        if (i3 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return copy$default(this, false, 0, null, null, null, bigDecimal, bigDecimal2, false, null, null, null, null, null, str3, str2, null, 40735, null);
    }

    private final KeyPressError checkForError(BigDecimal newCryptoAmountToCheck, String newCryptoAmountStringToCheck, BigDecimal newFiatAmountToCheck, String newFiatAmountStringToCheck) {
        BigDecimal transferableQuantity;
        Money markPrice;
        int i = WhenMappings.$EnumSwitchMapping$0[this.cryptoInputMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.areEqual(newCryptoAmountStringToCheck, this.cryptoAmountString)) {
                return KeyPressError.MAX_DECIMAL_REACHED;
            }
            CryptoTransferConfig cryptoTransferConfig = this.cryptoTransferConfig;
            return newCryptoAmountToCheck.compareTo(cryptoTransferConfig != null ? cryptoTransferConfig.getTransferableQuantity() : null) > 0 ? KeyPressError.OVER_WITHDRAWAL_LIMIT : KeyPressError.NONE;
        }
        if (Intrinsics.areEqual(newFiatAmountStringToCheck, this.fiatAmountString)) {
            return KeyPressError.MAX_DECIMAL_REACHED;
        }
        CryptoTransferConfig cryptoTransferConfig2 = this.cryptoTransferConfig;
        if (cryptoTransferConfig2 != null && (transferableQuantity = cryptoTransferConfig2.getTransferableQuantity()) != null) {
            CryptoQuote cryptoQuote = this.cryptoQuote;
            if (cryptoQuote != null && (markPrice = cryptoQuote.getMarkPrice()) != null) {
                bigDecimalSafeMultiply = Money3.getBigDecimalCompat(markPrice);
            }
            bigDecimalSafeMultiply = BigDecimals7.safeMultiply(transferableQuantity, bigDecimalSafeMultiply);
        }
        if (newFiatAmountToCheck.compareTo(bigDecimalSafeMultiply) > 0) {
            return KeyPressError.OVER_WITHDRAWAL_LIMIT;
        }
        return KeyPressError.NONE;
    }

    public final CryptoTransferSendAmountViewState mutateToSendAll() {
        CryptoQuote cryptoQuote;
        CryptoTransferConfig cryptoTransferConfig = this.cryptoTransferConfig;
        if (cryptoTransferConfig == null || cryptoTransferConfig.getTransferableQuantity() == null || (cryptoQuote = this.cryptoQuote) == null || cryptoQuote.getMarkPrice() == null) {
            return this;
        }
        BigDecimal transferableQuantity = this.cryptoTransferConfig.getTransferableQuantity();
        BigDecimal bigDecimalSafeMultiply = BigDecimals7.safeMultiply(transferableQuantity, Money3.getBigDecimalCompat(this.cryptoQuote.getMarkPrice()));
        CryptoInstrumentInputHelper cryptoInstrumentInputHelper = this.cryptoInstrumentInputHelper;
        BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(transferableQuantity);
        Intrinsics.checkNotNullExpressionValue(bigDecimalM822m, "stripTrailingZeros(...)");
        CryptoInputMode cryptoInputMode = CryptoInputMode.ASSET_CURRENCY;
        Tuples2 tuples2ProcessAmount$default = CryptoInstrumentInputHelper.processAmount$default(cryptoInstrumentInputHelper, bigDecimalM822m, null, cryptoInputMode, true, false, false, false, 114, null);
        String str = (String) tuples2ProcessAmount$default.component1();
        BigDecimal bigDecimal = (BigDecimal) tuples2ProcessAmount$default.component2();
        CryptoInstrumentInputHelper cryptoInstrumentInputHelper2 = this.cryptoInstrumentInputHelper;
        BigDecimal bigDecimalM822m2 = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimalSafeMultiply);
        Intrinsics.checkNotNullExpressionValue(bigDecimalM822m2, "stripTrailingZeros(...)");
        Tuples2 tuples2ProcessAmount$default2 = CryptoInstrumentInputHelper.processAmount$default(cryptoInstrumentInputHelper2, bigDecimalM822m2, RoundingMode.HALF_UP, CryptoInputMode.QUOTE_CURRENCY, false, false, false, false, 120, null);
        return copy$default(this, false, 0, null, null, cryptoInputMode, bigDecimal, (BigDecimal) tuples2ProcessAmount$default2.component2(), false, null, null, null, null, null, str, (String) tuples2ProcessAmount$default2.component1(), null, 40847, null);
    }

    public final AmountState getAmountState$feature_crypto_transfer_externalDebug() {
        return new AmountState(this.cryptoInputMode, this.cryptoAmount, this.fiatAmount);
    }

    public final String getNetworkCode() {
        ApiCryptoSupportedNetworks.CryptoNetwork.NetworkInfo network_info;
        ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork = this.selectedNetwork;
        if (cryptoNetwork == null || (network_info = cryptoNetwork.getNetwork_info()) == null) {
            return null;
        }
        return network_info.getCode();
    }

    /* compiled from: CryptoTransferSendAmountViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountState;", "Landroid/os/Parcelable;", "cryptoInputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "cryptoAmount", "Ljava/math/BigDecimal;", "fiatAmount", "<init>", "(Lcom/robinhood/shared/formats/crypto/CryptoInputMode;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCryptoInputMode", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getCryptoAmount", "()Ljava/math/BigDecimal;", "getFiatAmount", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static class AmountState implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<AmountState> CREATOR = new Creator();
        private final BigDecimal cryptoAmount;
        private final CryptoInputMode cryptoInputMode;
        private final BigDecimal fiatAmount;

        /* compiled from: CryptoTransferSendAmountViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<AmountState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AmountState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AmountState(CryptoInputMode.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AmountState[] newArray(int i) {
                return new AmountState[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.cryptoInputMode.name());
            dest.writeSerializable(this.cryptoAmount);
            dest.writeSerializable(this.fiatAmount);
        }

        public AmountState(CryptoInputMode cryptoInputMode, BigDecimal cryptoAmount, BigDecimal fiatAmount) {
            Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
            Intrinsics.checkNotNullParameter(cryptoAmount, "cryptoAmount");
            Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
            this.cryptoInputMode = cryptoInputMode;
            this.cryptoAmount = cryptoAmount;
            this.fiatAmount = fiatAmount;
        }

        public CryptoInputMode getCryptoInputMode() {
            return this.cryptoInputMode;
        }

        public BigDecimal getCryptoAmount() {
            return this.cryptoAmount;
        }

        public BigDecimal getFiatAmount() {
            return this.fiatAmount;
        }
    }

    /* compiled from: CryptoTransferSendAmountViewState.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006("}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalAttempt;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountState;", "cryptoInputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "cryptoAmount", "Ljava/math/BigDecimal;", "fiatAmount", "withdrawal", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;", "isFullAmount", "", "<init>", "(Lcom/robinhood/shared/formats/crypto/CryptoInputMode;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;Z)V", "getCryptoInputMode", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getCryptoAmount", "()Ljava/math/BigDecimal;", "getFiatAmount", "getWithdrawal", "()Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class WithdrawalAttempt extends AmountState {
        public static final int $stable = 8;
        public static final Parcelable.Creator<WithdrawalAttempt> CREATOR = new Creator();
        private final BigDecimal cryptoAmount;
        private final CryptoInputMode cryptoInputMode;
        private final BigDecimal fiatAmount;
        private final boolean isFullAmount;
        private final CryptoTransferWithdrawal withdrawal;

        /* compiled from: CryptoTransferSendAmountViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<WithdrawalAttempt> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithdrawalAttempt createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithdrawalAttempt(CryptoInputMode.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (CryptoTransferWithdrawal) parcel.readParcelable(WithdrawalAttempt.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithdrawalAttempt[] newArray(int i) {
                return new WithdrawalAttempt[i];
            }
        }

        public static /* synthetic */ WithdrawalAttempt copy$default(WithdrawalAttempt withdrawalAttempt, CryptoInputMode cryptoInputMode, BigDecimal bigDecimal, BigDecimal bigDecimal2, CryptoTransferWithdrawal cryptoTransferWithdrawal, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoInputMode = withdrawalAttempt.cryptoInputMode;
            }
            if ((i & 2) != 0) {
                bigDecimal = withdrawalAttempt.cryptoAmount;
            }
            if ((i & 4) != 0) {
                bigDecimal2 = withdrawalAttempt.fiatAmount;
            }
            if ((i & 8) != 0) {
                cryptoTransferWithdrawal = withdrawalAttempt.withdrawal;
            }
            if ((i & 16) != 0) {
                z = withdrawalAttempt.isFullAmount;
            }
            boolean z2 = z;
            BigDecimal bigDecimal3 = bigDecimal2;
            return withdrawalAttempt.copy(cryptoInputMode, bigDecimal, bigDecimal3, cryptoTransferWithdrawal, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoInputMode getCryptoInputMode() {
            return this.cryptoInputMode;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getCryptoAmount() {
            return this.cryptoAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getFiatAmount() {
            return this.fiatAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final CryptoTransferWithdrawal getWithdrawal() {
            return this.withdrawal;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsFullAmount() {
            return this.isFullAmount;
        }

        public final WithdrawalAttempt copy(CryptoInputMode cryptoInputMode, BigDecimal cryptoAmount, BigDecimal fiatAmount, CryptoTransferWithdrawal withdrawal, boolean isFullAmount) {
            Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
            Intrinsics.checkNotNullParameter(cryptoAmount, "cryptoAmount");
            Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
            Intrinsics.checkNotNullParameter(withdrawal, "withdrawal");
            return new WithdrawalAttempt(cryptoInputMode, cryptoAmount, fiatAmount, withdrawal, isFullAmount);
        }

        @Override // com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState.AmountState, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WithdrawalAttempt)) {
                return false;
            }
            WithdrawalAttempt withdrawalAttempt = (WithdrawalAttempt) other;
            return this.cryptoInputMode == withdrawalAttempt.cryptoInputMode && Intrinsics.areEqual(this.cryptoAmount, withdrawalAttempt.cryptoAmount) && Intrinsics.areEqual(this.fiatAmount, withdrawalAttempt.fiatAmount) && Intrinsics.areEqual(this.withdrawal, withdrawalAttempt.withdrawal) && this.isFullAmount == withdrawalAttempt.isFullAmount;
        }

        public int hashCode() {
            return (((((((this.cryptoInputMode.hashCode() * 31) + this.cryptoAmount.hashCode()) * 31) + this.fiatAmount.hashCode()) * 31) + this.withdrawal.hashCode()) * 31) + Boolean.hashCode(this.isFullAmount);
        }

        public String toString() {
            return "WithdrawalAttempt(cryptoInputMode=" + this.cryptoInputMode + ", cryptoAmount=" + this.cryptoAmount + ", fiatAmount=" + this.fiatAmount + ", withdrawal=" + this.withdrawal + ", isFullAmount=" + this.isFullAmount + ")";
        }

        @Override // com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState.AmountState, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.cryptoInputMode.name());
            dest.writeSerializable(this.cryptoAmount);
            dest.writeSerializable(this.fiatAmount);
            dest.writeParcelable(this.withdrawal, flags);
            dest.writeInt(this.isFullAmount ? 1 : 0);
        }

        @Override // com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState.AmountState
        public CryptoInputMode getCryptoInputMode() {
            return this.cryptoInputMode;
        }

        @Override // com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState.AmountState
        public BigDecimal getCryptoAmount() {
            return this.cryptoAmount;
        }

        @Override // com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState.AmountState
        public BigDecimal getFiatAmount() {
            return this.fiatAmount;
        }

        public final CryptoTransferWithdrawal getWithdrawal() {
            return this.withdrawal;
        }

        public final boolean isFullAmount() {
            return this.isFullAmount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithdrawalAttempt(CryptoInputMode cryptoInputMode, BigDecimal cryptoAmount, BigDecimal fiatAmount, CryptoTransferWithdrawal withdrawal, boolean z) {
            super(cryptoInputMode, cryptoAmount, fiatAmount);
            Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
            Intrinsics.checkNotNullParameter(cryptoAmount, "cryptoAmount");
            Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
            Intrinsics.checkNotNullParameter(withdrawal, "withdrawal");
            this.cryptoInputMode = cryptoInputMode;
            this.cryptoAmount = cryptoAmount;
            this.fiatAmount = fiatAmount;
            this.withdrawal = withdrawal;
            this.isFullAmount = z;
        }
    }

    /* compiled from: CryptoTransferSendAmountViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J^\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006-"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$CryptoValidationErrorWrapper;", "", "titleText", "Lcom/robinhood/utils/resource/StringResource;", "buttonText", "", "titleOverride", "", "errorCode", "Lcom/robinhood/models/api/ErrorCodedErrorResponse$ErrorCode;", "redirectDeepLink", "isErrorInAmount", "", "throwable", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;Ljava/lang/String;Lcom/robinhood/models/api/ErrorCodedErrorResponse$ErrorCode;Ljava/lang/String;ZLjava/lang/Throwable;)V", "getTitleText", "()Lcom/robinhood/utils/resource/StringResource;", "getButtonText", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitleOverride", "()Ljava/lang/String;", "setTitleOverride", "(Ljava/lang/String;)V", "getErrorCode", "()Lcom/robinhood/models/api/ErrorCodedErrorResponse$ErrorCode;", "getRedirectDeepLink", "()Z", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;Ljava/lang/String;Lcom/robinhood/models/api/ErrorCodedErrorResponse$ErrorCode;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$CryptoValidationErrorWrapper;", "equals", "other", "hashCode", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CryptoValidationErrorWrapper {
        public static final int $stable = 8;
        private final Integer buttonText;
        private final ErrorResponse3.ErrorCode errorCode;
        private final boolean isErrorInAmount;
        private final String redirectDeepLink;
        private final Throwable throwable;
        private String titleOverride;
        private final StringResource titleText;

        public static /* synthetic */ CryptoValidationErrorWrapper copy$default(CryptoValidationErrorWrapper cryptoValidationErrorWrapper, StringResource stringResource, Integer num, String str, ErrorResponse3.ErrorCode errorCode, String str2, boolean z, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = cryptoValidationErrorWrapper.titleText;
            }
            if ((i & 2) != 0) {
                num = cryptoValidationErrorWrapper.buttonText;
            }
            if ((i & 4) != 0) {
                str = cryptoValidationErrorWrapper.titleOverride;
            }
            if ((i & 8) != 0) {
                errorCode = cryptoValidationErrorWrapper.errorCode;
            }
            if ((i & 16) != 0) {
                str2 = cryptoValidationErrorWrapper.redirectDeepLink;
            }
            if ((i & 32) != 0) {
                z = cryptoValidationErrorWrapper.isErrorInAmount;
            }
            if ((i & 64) != 0) {
                th = cryptoValidationErrorWrapper.throwable;
            }
            boolean z2 = z;
            Throwable th2 = th;
            String str3 = str2;
            String str4 = str;
            return cryptoValidationErrorWrapper.copy(stringResource, num, str4, errorCode, str3, z2, th2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getTitleText() {
            return this.titleText;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getButtonText() {
            return this.buttonText;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitleOverride() {
            return this.titleOverride;
        }

        /* renamed from: component4, reason: from getter */
        public final ErrorResponse3.ErrorCode getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component5, reason: from getter */
        public final String getRedirectDeepLink() {
            return this.redirectDeepLink;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsErrorInAmount() {
            return this.isErrorInAmount;
        }

        /* renamed from: component7, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final CryptoValidationErrorWrapper copy(StringResource titleText, Integer buttonText, String titleOverride, ErrorResponse3.ErrorCode errorCode, String redirectDeepLink, boolean isErrorInAmount, Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new CryptoValidationErrorWrapper(titleText, buttonText, titleOverride, errorCode, redirectDeepLink, isErrorInAmount, throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CryptoValidationErrorWrapper)) {
                return false;
            }
            CryptoValidationErrorWrapper cryptoValidationErrorWrapper = (CryptoValidationErrorWrapper) other;
            return Intrinsics.areEqual(this.titleText, cryptoValidationErrorWrapper.titleText) && Intrinsics.areEqual(this.buttonText, cryptoValidationErrorWrapper.buttonText) && Intrinsics.areEqual(this.titleOverride, cryptoValidationErrorWrapper.titleOverride) && this.errorCode == cryptoValidationErrorWrapper.errorCode && Intrinsics.areEqual(this.redirectDeepLink, cryptoValidationErrorWrapper.redirectDeepLink) && this.isErrorInAmount == cryptoValidationErrorWrapper.isErrorInAmount && Intrinsics.areEqual(this.throwable, cryptoValidationErrorWrapper.throwable);
        }

        public int hashCode() {
            StringResource stringResource = this.titleText;
            int iHashCode = (stringResource == null ? 0 : stringResource.hashCode()) * 31;
            Integer num = this.buttonText;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.titleOverride;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            ErrorResponse3.ErrorCode errorCode = this.errorCode;
            int iHashCode4 = (iHashCode3 + (errorCode == null ? 0 : errorCode.hashCode())) * 31;
            String str2 = this.redirectDeepLink;
            return ((((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isErrorInAmount)) * 31) + this.throwable.hashCode();
        }

        public String toString() {
            return "CryptoValidationErrorWrapper(titleText=" + this.titleText + ", buttonText=" + this.buttonText + ", titleOverride=" + this.titleOverride + ", errorCode=" + this.errorCode + ", redirectDeepLink=" + this.redirectDeepLink + ", isErrorInAmount=" + this.isErrorInAmount + ", throwable=" + this.throwable + ")";
        }

        public CryptoValidationErrorWrapper(StringResource stringResource, Integer num, String str, ErrorResponse3.ErrorCode errorCode, String str2, boolean z, Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.titleText = stringResource;
            this.buttonText = num;
            this.titleOverride = str;
            this.errorCode = errorCode;
            this.redirectDeepLink = str2;
            this.isErrorInAmount = z;
            this.throwable = throwable;
        }

        public final StringResource getTitleText() {
            return this.titleText;
        }

        public final Integer getButtonText() {
            return this.buttonText;
        }

        public final String getTitleOverride() {
            return this.titleOverride;
        }

        public final void setTitleOverride(String str) {
            this.titleOverride = str;
        }

        public final ErrorResponse3.ErrorCode getErrorCode() {
            return this.errorCode;
        }

        public final String getRedirectDeepLink() {
            return this.redirectDeepLink;
        }

        public final boolean isErrorInAmount() {
            return this.isErrorInAmount;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: CryptoTransferSendAmountViewState.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$CryptoTransferSendWarningSheetState;", "", "withdrawalAttempt", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalAttempt;", "sheet", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferWithdrawal$PreReviewBottomSheet;", "<init>", "(Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalAttempt;Lcom/robinhood/models/api/transfer/ApiCryptoTransferWithdrawal$PreReviewBottomSheet;)V", "getWithdrawalAttempt", "()Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalAttempt;", "title", "", "getTitle", "()Ljava/lang/String;", "descriptionMarkdown", "getDescriptionMarkdown", "primaryCta", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalWarningButtonState;", "getPrimaryCta", "()Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalWarningButtonState;", "secondaryCta", "getSecondaryCta", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CryptoTransferSendWarningSheetState {
        public static final int $stable = 8;
        private final String descriptionMarkdown;
        private final WithdrawalWarningButtonState primaryCta;
        private final WithdrawalWarningButtonState secondaryCta;
        private final ApiCryptoTransferWithdrawal.PreReviewBottomSheet sheet;
        private final String title;
        private final WithdrawalAttempt withdrawalAttempt;

        /* renamed from: component2, reason: from getter */
        private final ApiCryptoTransferWithdrawal.PreReviewBottomSheet getSheet() {
            return this.sheet;
        }

        public static /* synthetic */ CryptoTransferSendWarningSheetState copy$default(CryptoTransferSendWarningSheetState cryptoTransferSendWarningSheetState, WithdrawalAttempt withdrawalAttempt, ApiCryptoTransferWithdrawal.PreReviewBottomSheet preReviewBottomSheet, int i, Object obj) {
            if ((i & 1) != 0) {
                withdrawalAttempt = cryptoTransferSendWarningSheetState.withdrawalAttempt;
            }
            if ((i & 2) != 0) {
                preReviewBottomSheet = cryptoTransferSendWarningSheetState.sheet;
            }
            return cryptoTransferSendWarningSheetState.copy(withdrawalAttempt, preReviewBottomSheet);
        }

        /* renamed from: component1, reason: from getter */
        public final WithdrawalAttempt getWithdrawalAttempt() {
            return this.withdrawalAttempt;
        }

        public final CryptoTransferSendWarningSheetState copy(WithdrawalAttempt withdrawalAttempt, ApiCryptoTransferWithdrawal.PreReviewBottomSheet sheet) {
            Intrinsics.checkNotNullParameter(withdrawalAttempt, "withdrawalAttempt");
            Intrinsics.checkNotNullParameter(sheet, "sheet");
            return new CryptoTransferSendWarningSheetState(withdrawalAttempt, sheet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CryptoTransferSendWarningSheetState)) {
                return false;
            }
            CryptoTransferSendWarningSheetState cryptoTransferSendWarningSheetState = (CryptoTransferSendWarningSheetState) other;
            return Intrinsics.areEqual(this.withdrawalAttempt, cryptoTransferSendWarningSheetState.withdrawalAttempt) && Intrinsics.areEqual(this.sheet, cryptoTransferSendWarningSheetState.sheet);
        }

        public int hashCode() {
            return (this.withdrawalAttempt.hashCode() * 31) + this.sheet.hashCode();
        }

        public String toString() {
            return "CryptoTransferSendWarningSheetState(withdrawalAttempt=" + this.withdrawalAttempt + ", sheet=" + this.sheet + ")";
        }

        public CryptoTransferSendWarningSheetState(WithdrawalAttempt withdrawalAttempt, ApiCryptoTransferWithdrawal.PreReviewBottomSheet sheet) {
            WithdrawalWarningButtonState withdrawalWarningButtonState;
            Intrinsics.checkNotNullParameter(withdrawalAttempt, "withdrawalAttempt");
            Intrinsics.checkNotNullParameter(sheet, "sheet");
            this.withdrawalAttempt = withdrawalAttempt;
            this.sheet = sheet;
            this.title = sheet.getTitle();
            this.descriptionMarkdown = sheet.getDescription_markdown();
            String primary_cta_text = sheet.getPrimary_cta_text();
            WithdrawalWarningButtonState withdrawalWarningButtonState2 = null;
            if (primary_cta_text != null) {
                ApiCryptoTransferWithdrawal.PreReviewBottomSheet.ActionType primary_cta_action = sheet.getPrimary_cta_action();
                withdrawalWarningButtonState = new WithdrawalWarningButtonState(primary_cta_text, primary_cta_action == null ? ApiCryptoTransferWithdrawal.PreReviewBottomSheet.ActionType.DISMISS : primary_cta_action, sheet.getPrimary_cta_deeplink());
            } else {
                withdrawalWarningButtonState = null;
            }
            this.primaryCta = withdrawalWarningButtonState;
            String secondary_cta_text = sheet.getSecondary_cta_text();
            if (secondary_cta_text != null) {
                ApiCryptoTransferWithdrawal.PreReviewBottomSheet.ActionType secondary_cta_action = sheet.getSecondary_cta_action();
                withdrawalWarningButtonState2 = new WithdrawalWarningButtonState(secondary_cta_text, secondary_cta_action == null ? ApiCryptoTransferWithdrawal.PreReviewBottomSheet.ActionType.DISMISS : secondary_cta_action, sheet.getSecondary_cta_deeplink());
            }
            this.secondaryCta = withdrawalWarningButtonState2;
        }

        public final WithdrawalAttempt getWithdrawalAttempt() {
            return this.withdrawalAttempt;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescriptionMarkdown() {
            return this.descriptionMarkdown;
        }

        public final WithdrawalWarningButtonState getPrimaryCta() {
            return this.primaryCta;
        }

        public final WithdrawalWarningButtonState getSecondaryCta() {
            return this.secondaryCta;
        }
    }

    /* compiled from: CryptoTransferSendAmountViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalWarningButtonState;", "", "text", "", "action", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferWithdrawal$PreReviewBottomSheet$ActionType;", "deeplink", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/transfer/ApiCryptoTransferWithdrawal$PreReviewBottomSheet$ActionType;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lcom/robinhood/models/api/transfer/ApiCryptoTransferWithdrawal$PreReviewBottomSheet$ActionType;", "getDeeplink", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class WithdrawalWarningButtonState {
        public static final int $stable = 0;
        private final ApiCryptoTransferWithdrawal.PreReviewBottomSheet.ActionType action;
        private final String deeplink;
        private final String text;

        public static /* synthetic */ WithdrawalWarningButtonState copy$default(WithdrawalWarningButtonState withdrawalWarningButtonState, String str, ApiCryptoTransferWithdrawal.PreReviewBottomSheet.ActionType actionType, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = withdrawalWarningButtonState.text;
            }
            if ((i & 2) != 0) {
                actionType = withdrawalWarningButtonState.action;
            }
            if ((i & 4) != 0) {
                str2 = withdrawalWarningButtonState.deeplink;
            }
            return withdrawalWarningButtonState.copy(str, actionType, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiCryptoTransferWithdrawal.PreReviewBottomSheet.ActionType getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final WithdrawalWarningButtonState copy(String text, ApiCryptoTransferWithdrawal.PreReviewBottomSheet.ActionType action, String deeplink) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            return new WithdrawalWarningButtonState(text, action, deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WithdrawalWarningButtonState)) {
                return false;
            }
            WithdrawalWarningButtonState withdrawalWarningButtonState = (WithdrawalWarningButtonState) other;
            return Intrinsics.areEqual(this.text, withdrawalWarningButtonState.text) && this.action == withdrawalWarningButtonState.action && Intrinsics.areEqual(this.deeplink, withdrawalWarningButtonState.deeplink);
        }

        public int hashCode() {
            int iHashCode = ((this.text.hashCode() * 31) + this.action.hashCode()) * 31;
            String str = this.deeplink;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "WithdrawalWarningButtonState(text=" + this.text + ", action=" + this.action + ", deeplink=" + this.deeplink + ")";
        }

        public WithdrawalWarningButtonState(String text, ApiCryptoTransferWithdrawal.PreReviewBottomSheet.ActionType action, String str) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            this.text = text;
            this.action = action;
            this.deeplink = str;
        }

        public /* synthetic */ WithdrawalWarningButtonState(String str, ApiCryptoTransferWithdrawal.PreReviewBottomSheet.ActionType actionType, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, actionType, (i & 4) != 0 ? null : str2);
        }

        public final String getText() {
            return this.text;
        }

        public final ApiCryptoTransferWithdrawal.PreReviewBottomSheet.ActionType getAction() {
            return this.action;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoTransferSendAmountViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$KeyPressError;", "", "<init>", "(Ljava/lang/String;I)V", "OVER_WITHDRAWAL_LIMIT", "MAX_DECIMAL_REACHED", "NONE", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class KeyPressError {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ KeyPressError[] $VALUES;
        public static final KeyPressError OVER_WITHDRAWAL_LIMIT = new KeyPressError("OVER_WITHDRAWAL_LIMIT", 0);
        public static final KeyPressError MAX_DECIMAL_REACHED = new KeyPressError("MAX_DECIMAL_REACHED", 1);
        public static final KeyPressError NONE = new KeyPressError("NONE", 2);

        private static final /* synthetic */ KeyPressError[] $values() {
            return new KeyPressError[]{OVER_WITHDRAWAL_LIMIT, MAX_DECIMAL_REACHED, NONE};
        }

        public static EnumEntries<KeyPressError> getEntries() {
            return $ENTRIES;
        }

        private KeyPressError(String str, int i) {
        }

        static {
            KeyPressError[] keyPressErrorArr$values = $values();
            $VALUES = keyPressErrorArr$values;
            $ENTRIES = EnumEntries2.enumEntries(keyPressErrorArr$values);
        }

        public static KeyPressError valueOf(String str) {
            return (KeyPressError) Enum.valueOf(KeyPressError.class, str);
        }

        public static KeyPressError[] values() {
            return (KeyPressError[]) $VALUES.clone();
        }
    }
}
