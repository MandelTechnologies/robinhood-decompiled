package com.robinhood.shared.crypto.staking.staking.input;

import android.view.KeyEvent;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.staking.ApiCryptoStakingOrder;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.staking.CryptoStakingPosition;
import com.robinhood.models.crypto.p314db.staking.StakingConfig;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.staking.AmountAvailableInfoScreen;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.CryptoStakingContext;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.staking.staking.C37760R;
import com.robinhood.shared.crypto.staking.staking.input.SuggestedInputAmountState;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoStakingInputDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001BË\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\u000e\u0010m\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010n\u001a\u00020\u00002\u0006\u0010o\u001a\u00020\u0014J\u000e\u0010p\u001a\u00020\u00002\u0006\u0010q\u001a\u00020rJ\u0016\u0010m\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010m\u001a\u00020\u00002\u0006\u0010s\u001a\u00020tJ\u0014\u0010u\u001a\u0004\u0018\u00010\u00142\b\u0010v\u001a\u0004\u0018\u00010\u0014H\u0002J\u001e\u0010u\u001a\u0004\u0018\u00010\u00142\b\u0010h\u001a\u0004\u0018\u00010\u00142\b\u0010v\u001a\u0004\u0018\u00010\u0014H\u0002J\u0014\u0010v\u001a\u0004\u0018\u00010\u00142\b\u0010u\u001a\u0004\u0018\u00010\u0014H\u0002J(\u0010v\u001a\u0004\u0018\u00010\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010h\u001a\u0004\u0018\u00010\u00142\b\u0010u\u001a\u0004\u0018\u00010\u0014H\u0002J%\u0010w\u001a\u00020\t2\u0006\u0010x\u001a\u00020\u00162\u0006\u0010y\u001a\u00020\u00162\u0006\u0010z\u001a\u00020\u0014H\u0001¢\u0006\u0002\b{J\t\u0010|\u001a\u00020\u0003HÆ\u0003J\t\u0010}\u001a\u00020\u0005HÆ\u0003J\t\u0010~\u001a\u00020\u0007HÆ\u0003J\t\u0010\u007f\u001a\u00020\tHÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\tHÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u000eHÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0012HÂ\u0003J\u0012\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0014HÀ\u0003¢\u0006\u0003\b\u0086\u0001J\u0012\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0016HÀ\u0003¢\u0006\u0003\b\u0088\u0001J\u0012\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0014HÀ\u0003¢\u0006\u0003\b\u008a\u0001J\u0012\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0016HÀ\u0003¢\u0006\u0003\b\u008c\u0001J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u001aHÂ\u0003J\u0012\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u001cHÀ\u0003¢\u0006\u0003\b\u008f\u0001J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u001eHÂ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010 HÂ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\"HÂ\u0003JÔ\u0001\u0010\u0093\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"HÆ\u0001J\u0015\u0010\u0094\u0001\u001a\u00020\t2\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0005HÖ\u0001J\n\u0010\u0097\u0001\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010+R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010+R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010:\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010>\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b?\u00105R\u0016\u0010@\u001a\u0004\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u00105R\u001a\u0010B\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bC\u0010D\u001a\u0004\bE\u0010+R\u0013\u0010F\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bG\u00103R\u0011\u0010H\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bH\u0010+R\u0011\u0010I\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bI\u0010+R\u0011\u0010J\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bJ\u0010+R\u0016\u0010K\u001a\u0004\u0018\u00010L8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010O\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\bP\u0010=R\u0011\u0010Q\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\bR\u0010=R\u0011\u0010S\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bT\u0010+R\u0011\u0010U\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bV\u00105R\u0011\u0010W\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bX\u00105R\u0011\u0010Y\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bZ\u0010+R\u0013\u0010[\u001a\u0004\u0018\u00010;8F¢\u0006\u0006\u001a\u0004\b\\\u0010=R\u001c\u0010]\u001a\u0004\u0018\u00010\u00148@X\u0081\u0004¢\u0006\f\u0012\u0004\b^\u0010D\u001a\u0004\b_\u00103R\u0011\u0010`\u001a\u00020a8F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0013\u0010d\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0010\u0010h\u001a\u0004\u0018\u00010\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010i\u001a\u0004\u0018\u00010\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u00103R\u0016\u0010k\u001a\u0004\u0018\u00010\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u00103¨\u0006\u0098\u0001"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDataState;", "", "orderType", "Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;", "shakeInputKey", "", "idempotencyId", "Ljava/util/UUID;", "isLoading", "", "isRequestingOrder", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "cryptoInputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "stakingAmountInfoSheet", "Lcom/robinhood/models/crypto/ui/staking/AmountAvailableInfoScreen$InfoSheetData$StakingOrderFlow;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoAmount", "Ljava/math/BigDecimal;", "cryptoAmountString", "", "fiatAmount", "fiatAmountString", "cryptoInstrumentInputHelper", "Lcom/robinhood/shared/formats/crypto/CryptoInstrumentInputHelper;", "cryptoQuote", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "cryptoStakingPosition", "Lcom/robinhood/models/crypto/db/staking/CryptoStakingPosition;", "cryptoHolding", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "config", "Lcom/robinhood/models/crypto/db/staking/StakingConfig;", "<init>", "(Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;ILjava/util/UUID;ZZLcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/shared/formats/crypto/CryptoInputMode;Lcom/robinhood/models/crypto/ui/staking/AmountAvailableInfoScreen$InfoSheetData$StakingOrderFlow;Lcom/robinhood/shared/app/type/AppType;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/robinhood/shared/formats/crypto/CryptoInstrumentInputHelper;Lcom/robinhood/models/crypto/db/CryptoQuote;Lcom/robinhood/models/crypto/db/staking/CryptoStakingPosition;Lcom/robinhood/models/crypto/ui/UiCryptoHolding;Lcom/robinhood/models/crypto/db/staking/StakingConfig;)V", "getOrderType", "()Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;", "getShakeInputKey", "()I", "getIdempotencyId", "()Ljava/util/UUID;", "()Z", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getCryptoInputMode", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getStakingAmountInfoSheet", "()Lcom/robinhood/models/crypto/ui/staking/AmountAvailableInfoScreen$InfoSheetData$StakingOrderFlow;", "getCryptoAmount$feature_crypto_staking_externalDebug", "()Ljava/math/BigDecimal;", "getCryptoAmountString$feature_crypto_staking_externalDebug", "()Ljava/lang/String;", "getFiatAmount$feature_crypto_staking_externalDebug", "getFiatAmountString$feature_crypto_staking_externalDebug", "getCryptoQuote$feature_crypto_staking_externalDebug", "()Lcom/robinhood/models/crypto/db/CryptoQuote;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "currencySymbol", "getCurrencySymbol", "amountString", "getAmountString", "isAmountZero", "isAmountZero$feature_crypto_staking_externalDebug$annotations", "()V", "isAmountZero$feature_crypto_staking_externalDebug", "amount", "getAmount", "isReviewButtonVisible", "isReviewButtonEnabled", "isSuggestionPillTappable", "eventContext", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;", "getEventContext$feature_crypto_staking_externalDebug", "()Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;", "availableText", "getAvailableText", "availableAmountSheetIconContentDescription", "getAvailableAmountSheetIconContentDescription", "rewardsEnabled", "getRewardsEnabled", "typedAmountText", "getTypedAmountText", "estimatedApyText", "getEstimatedApyText", "shouldShowApyText", "getShouldShowApyText", "estimatedAmountText", "getEstimatedAmountText", "maxOrderPrice", "getMaxOrderPrice$feature_crypto_staking_externalDebug$annotations", "getMaxOrderPrice$feature_crypto_staking_externalDebug", "amountType", "Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$AmountType;", "getAmountType", "()Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$AmountType;", "suggestedInputAmountsState", "Lcom/robinhood/shared/crypto/staking/staking/input/SuggestedInputAmountState;", "getSuggestedInputAmountsState", "()Lcom/robinhood/shared/crypto/staking/staking/input/SuggestedInputAmountState;", "cryptoPrice", "fiatAvailable", "getFiatAvailable", "cryptoAvailable", "getCryptoAvailable", "mutateWith", "mutateWithFiatAmount", "amountInFiat", "mutateWithPercentage", "percentage", "", "keyEvent", "Landroid/view/KeyEvent;", "fiatValue", "cryptoValue", "checkForError", "newCryptoAmountStringToCheck", "newFiatAmountStringToCheck", "newFiatAmount", "checkForError$feature_crypto_staking_externalDebug", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component10$feature_crypto_staking_externalDebug", "component11", "component11$feature_crypto_staking_externalDebug", "component12", "component12$feature_crypto_staking_externalDebug", "component13", "component13$feature_crypto_staking_externalDebug", "component14", "component15", "component15$feature_crypto_staking_externalDebug", "component16", "component17", "component18", "copy", "equals", "other", "hashCode", "toString", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoStakingInputDataState {
    public static final int $stable = 8;
    private final AppType appType;
    private final StakingConfig config;
    private final BigDecimal cryptoAmount;
    private final String cryptoAmountString;
    private final UiCryptoHolding cryptoHolding;
    private final CryptoInputMode cryptoInputMode;
    private final CryptoInstrumentInputHelper cryptoInstrumentInputHelper;
    private final BigDecimal cryptoPrice;
    private final CryptoQuote cryptoQuote;
    private final CryptoStakingPosition cryptoStakingPosition;
    private final BigDecimal fiatAmount;
    private final String fiatAmountString;
    private final UUID idempotencyId;
    private final boolean isLoading;
    private final boolean isRequestingOrder;
    private final ApiCryptoStakingOrder.OrderType orderType;
    private final boolean rewardsEnabled;
    private final int shakeInputKey;
    private final AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow stakingAmountInfoSheet;
    private final UiCurrencyPair uiCurrencyPair;

    /* compiled from: CryptoStakingInputDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiCryptoStakingOrder.OrderType.values().length];
            try {
                iArr[ApiCryptoStakingOrder.OrderType.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCryptoStakingOrder.OrderType.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCryptoStakingOrder.OrderType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoInputMode.values().length];
            try {
                iArr2[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: component14, reason: from getter */
    private final CryptoInstrumentInputHelper getCryptoInstrumentInputHelper() {
        return this.cryptoInstrumentInputHelper;
    }

    /* renamed from: component16, reason: from getter */
    private final CryptoStakingPosition getCryptoStakingPosition() {
        return this.cryptoStakingPosition;
    }

    /* renamed from: component17, reason: from getter */
    private final UiCryptoHolding getCryptoHolding() {
        return this.cryptoHolding;
    }

    /* renamed from: component18, reason: from getter */
    private final StakingConfig getConfig() {
        return this.config;
    }

    /* renamed from: component9, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    public static /* synthetic */ CryptoStakingInputDataState copy$default(CryptoStakingInputDataState cryptoStakingInputDataState, ApiCryptoStakingOrder.OrderType orderType, int i, UUID uuid, boolean z, boolean z2, UiCurrencyPair uiCurrencyPair, CryptoInputMode cryptoInputMode, AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow stakingOrderFlow, AppType appType, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, CryptoInstrumentInputHelper cryptoInstrumentInputHelper, CryptoQuote cryptoQuote, CryptoStakingPosition cryptoStakingPosition, UiCryptoHolding uiCryptoHolding, StakingConfig stakingConfig, int i2, Object obj) {
        StakingConfig stakingConfig2;
        UiCryptoHolding uiCryptoHolding2;
        ApiCryptoStakingOrder.OrderType orderType2 = (i2 & 1) != 0 ? cryptoStakingInputDataState.orderType : orderType;
        int i3 = (i2 & 2) != 0 ? cryptoStakingInputDataState.shakeInputKey : i;
        UUID uuid2 = (i2 & 4) != 0 ? cryptoStakingInputDataState.idempotencyId : uuid;
        boolean z3 = (i2 & 8) != 0 ? cryptoStakingInputDataState.isLoading : z;
        boolean z4 = (i2 & 16) != 0 ? cryptoStakingInputDataState.isRequestingOrder : z2;
        UiCurrencyPair uiCurrencyPair2 = (i2 & 32) != 0 ? cryptoStakingInputDataState.uiCurrencyPair : uiCurrencyPair;
        CryptoInputMode cryptoInputMode2 = (i2 & 64) != 0 ? cryptoStakingInputDataState.cryptoInputMode : cryptoInputMode;
        AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow stakingOrderFlow2 = (i2 & 128) != 0 ? cryptoStakingInputDataState.stakingAmountInfoSheet : stakingOrderFlow;
        AppType appType2 = (i2 & 256) != 0 ? cryptoStakingInputDataState.appType : appType;
        BigDecimal bigDecimal3 = (i2 & 512) != 0 ? cryptoStakingInputDataState.cryptoAmount : bigDecimal;
        String str3 = (i2 & 1024) != 0 ? cryptoStakingInputDataState.cryptoAmountString : str;
        BigDecimal bigDecimal4 = (i2 & 2048) != 0 ? cryptoStakingInputDataState.fiatAmount : bigDecimal2;
        String str4 = (i2 & 4096) != 0 ? cryptoStakingInputDataState.fiatAmountString : str2;
        CryptoInstrumentInputHelper cryptoInstrumentInputHelper2 = (i2 & 8192) != 0 ? cryptoStakingInputDataState.cryptoInstrumentInputHelper : cryptoInstrumentInputHelper;
        ApiCryptoStakingOrder.OrderType orderType3 = orderType2;
        CryptoQuote cryptoQuote2 = (i2 & 16384) != 0 ? cryptoStakingInputDataState.cryptoQuote : cryptoQuote;
        CryptoStakingPosition cryptoStakingPosition2 = (i2 & 32768) != 0 ? cryptoStakingInputDataState.cryptoStakingPosition : cryptoStakingPosition;
        UiCryptoHolding uiCryptoHolding3 = (i2 & 65536) != 0 ? cryptoStakingInputDataState.cryptoHolding : uiCryptoHolding;
        if ((i2 & 131072) != 0) {
            uiCryptoHolding2 = uiCryptoHolding3;
            stakingConfig2 = cryptoStakingInputDataState.config;
        } else {
            stakingConfig2 = stakingConfig;
            uiCryptoHolding2 = uiCryptoHolding3;
        }
        return cryptoStakingInputDataState.copy(orderType3, i3, uuid2, z3, z4, uiCurrencyPair2, cryptoInputMode2, stakingOrderFlow2, appType2, bigDecimal3, str3, bigDecimal4, str4, cryptoInstrumentInputHelper2, cryptoQuote2, cryptoStakingPosition2, uiCryptoHolding2, stakingConfig2);
    }

    /* renamed from: getMaxOrderPrice$feature_crypto_staking_externalDebug$annotations */
    public static /* synthetic */ void m2776x7c514446() {
    }

    public static /* synthetic */ void isAmountZero$feature_crypto_staking_externalDebug$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final ApiCryptoStakingOrder.OrderType getOrderType() {
        return this.orderType;
    }

    /* renamed from: component10$feature_crypto_staking_externalDebug, reason: from getter */
    public final BigDecimal getCryptoAmount() {
        return this.cryptoAmount;
    }

    /* renamed from: component11$feature_crypto_staking_externalDebug, reason: from getter */
    public final String getCryptoAmountString() {
        return this.cryptoAmountString;
    }

    /* renamed from: component12$feature_crypto_staking_externalDebug, reason: from getter */
    public final BigDecimal getFiatAmount() {
        return this.fiatAmount;
    }

    /* renamed from: component13$feature_crypto_staking_externalDebug, reason: from getter */
    public final String getFiatAmountString() {
        return this.fiatAmountString;
    }

    /* renamed from: component15$feature_crypto_staking_externalDebug, reason: from getter */
    public final CryptoQuote getCryptoQuote() {
        return this.cryptoQuote;
    }

    /* renamed from: component2, reason: from getter */
    public final int getShakeInputKey() {
        return this.shakeInputKey;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getIdempotencyId() {
        return this.idempotencyId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsRequestingOrder() {
        return this.isRequestingOrder;
    }

    /* renamed from: component6, reason: from getter */
    public final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    /* renamed from: component7, reason: from getter */
    public final CryptoInputMode getCryptoInputMode() {
        return this.cryptoInputMode;
    }

    /* renamed from: component8, reason: from getter */
    public final AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow getStakingAmountInfoSheet() {
        return this.stakingAmountInfoSheet;
    }

    public final CryptoStakingInputDataState copy(ApiCryptoStakingOrder.OrderType orderType, int shakeInputKey, UUID idempotencyId, boolean isLoading, boolean isRequestingOrder, UiCurrencyPair uiCurrencyPair, CryptoInputMode cryptoInputMode, AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow stakingAmountInfoSheet, AppType appType, BigDecimal cryptoAmount, String cryptoAmountString, BigDecimal fiatAmount, String fiatAmountString, CryptoInstrumentInputHelper cryptoInstrumentInputHelper, CryptoQuote cryptoQuote, CryptoStakingPosition cryptoStakingPosition, UiCryptoHolding cryptoHolding, StakingConfig config) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(idempotencyId, "idempotencyId");
        Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new CryptoStakingInputDataState(orderType, shakeInputKey, idempotencyId, isLoading, isRequestingOrder, uiCurrencyPair, cryptoInputMode, stakingAmountInfoSheet, appType, cryptoAmount, cryptoAmountString, fiatAmount, fiatAmountString, cryptoInstrumentInputHelper, cryptoQuote, cryptoStakingPosition, cryptoHolding, config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoStakingInputDataState)) {
            return false;
        }
        CryptoStakingInputDataState cryptoStakingInputDataState = (CryptoStakingInputDataState) other;
        return this.orderType == cryptoStakingInputDataState.orderType && this.shakeInputKey == cryptoStakingInputDataState.shakeInputKey && Intrinsics.areEqual(this.idempotencyId, cryptoStakingInputDataState.idempotencyId) && this.isLoading == cryptoStakingInputDataState.isLoading && this.isRequestingOrder == cryptoStakingInputDataState.isRequestingOrder && Intrinsics.areEqual(this.uiCurrencyPair, cryptoStakingInputDataState.uiCurrencyPair) && this.cryptoInputMode == cryptoStakingInputDataState.cryptoInputMode && Intrinsics.areEqual(this.stakingAmountInfoSheet, cryptoStakingInputDataState.stakingAmountInfoSheet) && this.appType == cryptoStakingInputDataState.appType && Intrinsics.areEqual(this.cryptoAmount, cryptoStakingInputDataState.cryptoAmount) && Intrinsics.areEqual(this.cryptoAmountString, cryptoStakingInputDataState.cryptoAmountString) && Intrinsics.areEqual(this.fiatAmount, cryptoStakingInputDataState.fiatAmount) && Intrinsics.areEqual(this.fiatAmountString, cryptoStakingInputDataState.fiatAmountString) && Intrinsics.areEqual(this.cryptoInstrumentInputHelper, cryptoStakingInputDataState.cryptoInstrumentInputHelper) && Intrinsics.areEqual(this.cryptoQuote, cryptoStakingInputDataState.cryptoQuote) && Intrinsics.areEqual(this.cryptoStakingPosition, cryptoStakingInputDataState.cryptoStakingPosition) && Intrinsics.areEqual(this.cryptoHolding, cryptoStakingInputDataState.cryptoHolding) && Intrinsics.areEqual(this.config, cryptoStakingInputDataState.config);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.orderType.hashCode() * 31) + Integer.hashCode(this.shakeInputKey)) * 31) + this.idempotencyId.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isRequestingOrder)) * 31;
        UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
        int iHashCode2 = (((iHashCode + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31) + this.cryptoInputMode.hashCode()) * 31;
        AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow stakingOrderFlow = this.stakingAmountInfoSheet;
        int iHashCode3 = (((iHashCode2 + (stakingOrderFlow == null ? 0 : stakingOrderFlow.hashCode())) * 31) + this.appType.hashCode()) * 31;
        BigDecimal bigDecimal = this.cryptoAmount;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.cryptoAmountString;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.fiatAmount;
        int iHashCode6 = (iHashCode5 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str2 = this.fiatAmountString;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CryptoInstrumentInputHelper cryptoInstrumentInputHelper = this.cryptoInstrumentInputHelper;
        int iHashCode8 = (iHashCode7 + (cryptoInstrumentInputHelper == null ? 0 : cryptoInstrumentInputHelper.hashCode())) * 31;
        CryptoQuote cryptoQuote = this.cryptoQuote;
        int iHashCode9 = (iHashCode8 + (cryptoQuote == null ? 0 : cryptoQuote.hashCode())) * 31;
        CryptoStakingPosition cryptoStakingPosition = this.cryptoStakingPosition;
        int iHashCode10 = (iHashCode9 + (cryptoStakingPosition == null ? 0 : cryptoStakingPosition.hashCode())) * 31;
        UiCryptoHolding uiCryptoHolding = this.cryptoHolding;
        int iHashCode11 = (iHashCode10 + (uiCryptoHolding == null ? 0 : uiCryptoHolding.hashCode())) * 31;
        StakingConfig stakingConfig = this.config;
        return iHashCode11 + (stakingConfig != null ? stakingConfig.hashCode() : 0);
    }

    public String toString() {
        return "CryptoStakingInputDataState(orderType=" + this.orderType + ", shakeInputKey=" + this.shakeInputKey + ", idempotencyId=" + this.idempotencyId + ", isLoading=" + this.isLoading + ", isRequestingOrder=" + this.isRequestingOrder + ", uiCurrencyPair=" + this.uiCurrencyPair + ", cryptoInputMode=" + this.cryptoInputMode + ", stakingAmountInfoSheet=" + this.stakingAmountInfoSheet + ", appType=" + this.appType + ", cryptoAmount=" + this.cryptoAmount + ", cryptoAmountString=" + this.cryptoAmountString + ", fiatAmount=" + this.fiatAmount + ", fiatAmountString=" + this.fiatAmountString + ", cryptoInstrumentInputHelper=" + this.cryptoInstrumentInputHelper + ", cryptoQuote=" + this.cryptoQuote + ", cryptoStakingPosition=" + this.cryptoStakingPosition + ", cryptoHolding=" + this.cryptoHolding + ", config=" + this.config + ")";
    }

    public CryptoStakingInputDataState(ApiCryptoStakingOrder.OrderType orderType, int i, UUID idempotencyId, boolean z, boolean z2, UiCurrencyPair uiCurrencyPair, CryptoInputMode cryptoInputMode, AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow stakingOrderFlow, AppType appType, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, CryptoInstrumentInputHelper cryptoInstrumentInputHelper, CryptoQuote cryptoQuote, CryptoStakingPosition cryptoStakingPosition, UiCryptoHolding uiCryptoHolding, StakingConfig stakingConfig) {
        Money markPrice;
        CryptoStakingPosition.Staking staking;
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(idempotencyId, "idempotencyId");
        Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.orderType = orderType;
        this.shakeInputKey = i;
        this.idempotencyId = idempotencyId;
        this.isLoading = z;
        this.isRequestingOrder = z2;
        this.uiCurrencyPair = uiCurrencyPair;
        this.cryptoInputMode = cryptoInputMode;
        this.stakingAmountInfoSheet = stakingOrderFlow;
        this.appType = appType;
        this.cryptoAmount = bigDecimal;
        this.cryptoAmountString = str;
        this.fiatAmount = bigDecimal2;
        this.fiatAmountString = str2;
        this.cryptoInstrumentInputHelper = cryptoInstrumentInputHelper;
        this.cryptoQuote = cryptoQuote;
        this.cryptoStakingPosition = cryptoStakingPosition;
        this.cryptoHolding = uiCryptoHolding;
        this.config = stakingConfig;
        this.rewardsEnabled = (cryptoStakingPosition == null || (staking = cryptoStakingPosition.getStaking()) == null) ? false : Intrinsics.areEqual(staking.getBoostedRewardsEnabled(), Boolean.TRUE);
        this.cryptoPrice = (cryptoQuote == null || (markPrice = cryptoQuote.getMarkPrice()) == null) ? null : Money3.getBigDecimalCompat(markPrice);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CryptoStakingInputDataState(com.robinhood.models.api.staking.ApiCryptoStakingOrder.OrderType r22, int r23, java.util.UUID r24, boolean r25, boolean r26, com.robinhood.models.crypto.p315ui.UiCurrencyPair r27, com.robinhood.shared.formats.crypto.CryptoInputMode r28, com.robinhood.models.crypto.ui.staking.AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow r29, com.robinhood.shared.app.type.AppType r30, java.math.BigDecimal r31, java.lang.String r32, java.math.BigDecimal r33, java.lang.String r34, com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper r35, com.robinhood.models.crypto.p314db.CryptoQuote r36, com.robinhood.models.crypto.p314db.staking.CryptoStakingPosition r37, com.robinhood.models.crypto.p315ui.UiCryptoHolding r38, com.robinhood.models.crypto.p314db.staking.StakingConfig r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r21 = this;
            r0 = r40
            r1 = r0 & 1
            if (r1 == 0) goto La
            com.robinhood.models.api.staking.ApiCryptoStakingOrder$OrderType r1 = com.robinhood.models.api.staking.ApiCryptoStakingOrder.OrderType.UNKNOWN
            r3 = r1
            goto Lc
        La:
            r3 = r22
        Lc:
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L13
            r4 = r2
            goto L15
        L13:
            r4 = r23
        L15:
            r1 = r0 & 16
            if (r1 == 0) goto L1b
            r7 = r2
            goto L1d
        L1b:
            r7 = r26
        L1d:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L24
            r8 = r2
            goto L26
        L24:
            r8 = r27
        L26:
            r1 = r0 & 64
            if (r1 == 0) goto L2e
            com.robinhood.shared.formats.crypto.CryptoInputMode r1 = com.robinhood.shared.formats.crypto.CryptoInputMode.ASSET_CURRENCY
            r9 = r1
            goto L30
        L2e:
            r9 = r28
        L30:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L36
            r10 = r2
            goto L38
        L36:
            r10 = r29
        L38:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L3e
            r12 = r2
            goto L40
        L3e:
            r12 = r31
        L40:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L46
            r13 = r2
            goto L48
        L46:
            r13 = r32
        L48:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L4e
            r14 = r2
            goto L50
        L4e:
            r14 = r33
        L50:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L56
            r15 = r2
            goto L58
        L56:
            r15 = r34
        L58:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L5f
            r16 = r2
            goto L61
        L5f:
            r16 = r35
        L61:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L68
            r17 = r2
            goto L6a
        L68:
            r17 = r36
        L6a:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L73
            r18 = r2
            goto L75
        L73:
            r18 = r37
        L75:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L7d
            r19 = r2
            goto L7f
        L7d:
            r19 = r38
        L7f:
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L8f
            r20 = r2
            r5 = r24
            r6 = r25
            r11 = r30
            r2 = r21
            goto L99
        L8f:
            r20 = r39
            r2 = r21
            r5 = r24
            r6 = r25
            r11 = r30
        L99:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDataState.<init>(com.robinhood.models.api.staking.ApiCryptoStakingOrder$OrderType, int, java.util.UUID, boolean, boolean, com.robinhood.models.crypto.ui.UiCurrencyPair, com.robinhood.shared.formats.crypto.CryptoInputMode, com.robinhood.models.crypto.ui.staking.AmountAvailableInfoScreen$InfoSheetData$StakingOrderFlow, com.robinhood.shared.app.type.AppType, java.math.BigDecimal, java.lang.String, java.math.BigDecimal, java.lang.String, com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper, com.robinhood.models.crypto.db.CryptoQuote, com.robinhood.models.crypto.db.staking.CryptoStakingPosition, com.robinhood.models.crypto.ui.UiCryptoHolding, com.robinhood.models.crypto.db.staking.StakingConfig, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final ApiCryptoStakingOrder.OrderType getOrderType() {
        return this.orderType;
    }

    public final int getShakeInputKey() {
        return this.shakeInputKey;
    }

    public final UUID getIdempotencyId() {
        return this.idempotencyId;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isRequestingOrder() {
        return this.isRequestingOrder;
    }

    public final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    public final CryptoInputMode getCryptoInputMode() {
        return this.cryptoInputMode;
    }

    public final AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow getStakingAmountInfoSheet() {
        return this.stakingAmountInfoSheet;
    }

    public final BigDecimal getCryptoAmount$feature_crypto_staking_externalDebug() {
        return this.cryptoAmount;
    }

    public final String getCryptoAmountString$feature_crypto_staking_externalDebug() {
        return this.cryptoAmountString;
    }

    public final BigDecimal getFiatAmount$feature_crypto_staking_externalDebug() {
        return this.fiatAmount;
    }

    public final String getFiatAmountString$feature_crypto_staking_externalDebug() {
        return this.fiatAmountString;
    }

    public final CryptoQuote getCryptoQuote$feature_crypto_staking_externalDebug() {
        return this.cryptoQuote;
    }

    public final StringResource getTitle() {
        Currency assetCurrency;
        Currency assetCurrency2;
        int i = WhenMappings.$EnumSwitchMapping$0[this.orderType.ordinal()];
        String code = null;
        if (i == 1) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i2 = C37760R.string.staking_toolbar_deposit_title;
            UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
            if (uiCurrencyPair != null && (assetCurrency = uiCurrencyPair.getAssetCurrency()) != null) {
                code = assetCurrency.getCode();
            }
            return companion.invoke(i2, code);
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(this);
            throw new ExceptionsH();
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        int i3 = C37760R.string.staking_toolbar_withdraw_title;
        UiCurrencyPair uiCurrencyPair2 = this.uiCurrencyPair;
        if (uiCurrencyPair2 != null && (assetCurrency2 = uiCurrencyPair2.getAssetCurrency()) != null) {
            code = assetCurrency2.getCode();
        }
        return companion2.invoke(i3, code);
    }

    public final String getCurrencySymbol() {
        UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
        String displaySymbol = uiCurrencyPair != null ? uiCurrencyPair.getDisplaySymbol() : null;
        return displaySymbol == null ? "" : displaySymbol;
    }

    private final String getAmountString() {
        int i = WhenMappings.$EnumSwitchMapping$1[this.cryptoInputMode.ordinal()];
        if (i == 1) {
            return this.cryptoAmountString;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.fiatAmountString;
    }

    public final boolean isAmountZero$feature_crypto_staking_externalDebug() {
        BigDecimal amount = getAmount();
        return amount != null && BigDecimals7.m2977eq(amount, BigDecimal.ZERO);
    }

    public final BigDecimal getAmount() {
        return this.cryptoInputMode == CryptoInputMode.ASSET_CURRENCY ? this.cryptoAmount : this.fiatAmount;
    }

    public final boolean isReviewButtonVisible() {
        return getSuggestedInputAmountsState() == null;
    }

    public final boolean isReviewButtonEnabled() {
        return !isAmountZero$feature_crypto_staking_externalDebug();
    }

    public final boolean isSuggestionPillTappable() {
        BigDecimal scale;
        BigDecimal fiatAvailable = getFiatAvailable();
        return (fiatAvailable == null || (scale = fiatAvailable.setScale(2, RoundingMode.DOWN)) == null || !BigDecimals7.m2978gt(scale, BigDecimal.ZERO)) ? false : true;
    }

    public final CryptoStakingContext getEventContext$feature_crypto_staking_externalDebug() {
        CryptoStakingPosition.Staking staking;
        CryptoStakingPosition cryptoStakingPosition = this.cryptoStakingPosition;
        if (cryptoStakingPosition == null || (staking = cryptoStakingPosition.getStaking()) == null) {
            return null;
        }
        return new CryptoStakingContext(getCurrencySymbol(), staking.getEstimatedRateApy(), staking.getAvailableForDeposit().doubleValue(), staking.getAvailableForWithdrawal().doubleValue(), staking.getDeposited().doubleValue(), 0.0d, staking.getLifetimeRewarded().doubleValue(), new CryptoStakingContext.OrderContext(BigDecimals7.orZero(getAmount()).doubleValue(), this.cryptoInputMode.mapToEntryType(), null, null, 12, null), null, 288, null);
    }

    public final StringResource getAvailableText() {
        BigDecimal fiatAvailable;
        BigDecimal cryptoAvailable;
        int i;
        int i2;
        if (this.uiCurrencyPair != null && (fiatAvailable = getFiatAvailable()) != null && (cryptoAvailable = getCryptoAvailable()) != null) {
            int i3 = WhenMappings.$EnumSwitchMapping$1[this.cryptoInputMode.ordinal()];
            if (i3 == 1) {
                int i4 = WhenMappings.$EnumSwitchMapping$0[this.orderType.ordinal()];
                if (i4 == 1) {
                    i = C37760R.string.staking_available_to_deposit_asset;
                } else {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Preconditions.INSTANCE.failUnexpectedItemKotlin(this);
                        throw new ExceptionsH();
                    }
                    i = C37760R.string.staking_available_to_withdraw_asset;
                }
                return StringResource.INSTANCE.invoke(i, CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getAssetCurrency(), cryptoAvailable, false, false, null, 0, null, null, false, false, false, false, 2046, null));
            }
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = WhenMappings.$EnumSwitchMapping$0[this.orderType.ordinal()];
            if (i5 == 1) {
                i2 = C37760R.string.staking_available_to_deposit_fiat;
            } else {
                if (i5 != 2) {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Preconditions.INSTANCE.failUnexpectedItemKotlin(this);
                    throw new ExceptionsH();
                }
                i2 = C37760R.string.staking_available_to_withdraw_fiat;
            }
            return StringResource.INSTANCE.invoke(i2, CurrencyDefinitions.formatCurrency$default(this.uiCurrencyPair.getQuoteCurrency(), fiatAvailable, false, false, RoundingMode.DOWN, 0, null, null, false, false, false, false, 2038, null), getCurrencySymbol());
        }
        return StringResource.INSTANCE.invoke("");
    }

    public final StringResource getAvailableAmountSheetIconContentDescription() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orderType.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C37760R.string.staking_availability_sheet_available, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C37760R.string.staking_availability_sheet_available_to_unstake, new Object[0]);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(this);
        throw new ExceptionsH();
    }

    public final boolean getRewardsEnabled() {
        return this.rewardsEnabled;
    }

    public final String getTypedAmountText() {
        if (this.fiatAmountString != null && this.cryptoAmountString != null && this.uiCurrencyPair != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[this.cryptoInputMode.ordinal()];
            if (i == 1) {
                return this.cryptoAmountString;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return this.fiatAmountString;
        }
        return "";
    }

    public final String getEstimatedApyText() {
        StakingConfig.DepositInputPage depositInputPage;
        StakingConfig stakingConfig = this.config;
        String subtitle = (stakingConfig == null || (depositInputPage = stakingConfig.getDepositInputPage()) == null) ? null : depositInputPage.getSubtitle();
        return subtitle == null ? "" : subtitle;
    }

    public final boolean getShouldShowApyText() {
        return !StringsKt.isBlank(getEstimatedApyText()) && this.orderType == ApiCryptoStakingOrder.OrderType.DEPOSIT;
    }

    public final StringResource getEstimatedAmountText() {
        if (this.cryptoAmountString == null || this.fiatAmountString == null || this.cryptoInstrumentInputHelper == null || this.cryptoAmount == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[this.cryptoInputMode.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(this.fiatAmountString);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke((CharSequence) CryptoInstrumentInputHelper.processAmount$default(this.cryptoInstrumentInputHelper, this.cryptoAmount, null, CryptoInputMode.ASSET_CURRENCY, true, false, false, false, 114, null).getFirst());
    }

    public final BigDecimal getMaxOrderPrice$feature_crypto_staking_externalDebug() {
        UiCurrencyPair uiCurrencyPair;
        BigDecimal bigDecimal = this.cryptoPrice;
        if (bigDecimal == null || (uiCurrencyPair = this.uiCurrencyPair) == null) {
            return null;
        }
        return bigDecimal.multiply(uiCurrencyPair.getMaxOrderSize());
    }

    public final ApiCryptoStakingOrder.AmountType getAmountType() {
        int i = WhenMappings.$EnumSwitchMapping$1[this.cryptoInputMode.ordinal()];
        if (i == 1) {
            return ApiCryptoStakingOrder.AmountType.CRYPTOCURRENCY;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return ApiCryptoStakingOrder.AmountType.FIAT;
    }

    public final SuggestedInputAmountState getSuggestedInputAmountsState() {
        if (!this.isRequestingOrder && isAmountZero$feature_crypto_staking_externalDebug() && this.orderType == ApiCryptoStakingOrder.OrderType.DEPOSIT) {
            StakingConfig stakingConfig = this.config;
            ImmutableList<StakingConfig.SuggestedInputAmount> suggestedInputAmountsInFiat = stakingConfig != null ? stakingConfig.getSuggestedInputAmountsInFiat() : null;
            StakingConfig stakingConfig2 = this.config;
            ImmutableList<StakingConfig.SuggestedInputAmount> suggestedInputAmounts = stakingConfig2 != null ? stakingConfig2.getSuggestedInputAmounts() : null;
            if (suggestedInputAmountsInFiat != null && !suggestedInputAmountsInFiat.isEmpty() && this.cryptoInputMode == CryptoInputMode.QUOTE_CURRENCY) {
                return new SuggestedInputAmountState(SuggestedInputAmountState.Type.FIAT, suggestedInputAmountsInFiat);
            }
            if (suggestedInputAmounts != null && !suggestedInputAmounts.isEmpty() && this.appType == AppType.RHC) {
                return new SuggestedInputAmountState(SuggestedInputAmountState.Type.PERCENTAGE, suggestedInputAmounts);
            }
        }
        return null;
    }

    private final BigDecimal getFiatAvailable() {
        if (this.cryptoPrice == null || getCryptoAvailable() == null) {
            return null;
        }
        return fiatValue(getCryptoAvailable());
    }

    private final BigDecimal getCryptoAvailable() {
        CryptoStakingPosition.Staking staking;
        CryptoStakingPosition.Staking staking2;
        int i = WhenMappings.$EnumSwitchMapping$0[this.orderType.ordinal()];
        if (i == 1) {
            CryptoStakingPosition cryptoStakingPosition = this.cryptoStakingPosition;
            if (cryptoStakingPosition == null || (staking = cryptoStakingPosition.getStaking()) == null) {
                return null;
            }
            return staking.getAvailableForDeposit();
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(this);
            throw new ExceptionsH();
        }
        CryptoStakingPosition cryptoStakingPosition2 = this.cryptoStakingPosition;
        if (cryptoStakingPosition2 == null || (staking2 = cryptoStakingPosition2.getStaking()) == null) {
            return null;
        }
        return staking2.getAvailableForWithdrawal();
    }

    public final CryptoStakingInputDataState mutateWith(CryptoInputMode cryptoInputMode) {
        Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
        return copy$default(this, null, 0, null, false, false, null, cryptoInputMode, null, null, null, null, null, null, null, null, null, null, null, 262079, null);
    }

    public final CryptoStakingInputDataState mutateWithFiatAmount(BigDecimal amountInFiat) {
        Intrinsics.checkNotNullParameter(amountInFiat, "amountInFiat");
        CryptoInputMode cryptoInputMode = this.cryptoInputMode;
        CryptoInputMode cryptoInputMode2 = CryptoInputMode.ASSET_CURRENCY;
        if (cryptoInputMode == cryptoInputMode2) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Fiat amount cannot be selected in asset input mode."), true, null, 4, null);
            return this;
        }
        if (this.cryptoInstrumentInputHelper == null) {
            return this;
        }
        BigDecimal bigDecimalCryptoValue = cryptoValue(amountInFiat);
        CryptoInstrumentInputHelper cryptoInstrumentInputHelper = this.cryptoInstrumentInputHelper;
        if (bigDecimalCryptoValue == null) {
            bigDecimalCryptoValue = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = bigDecimalCryptoValue;
        Intrinsics.checkNotNull(bigDecimal);
        Tuples2 tuples2ProcessAmount$default = CryptoInstrumentInputHelper.processAmount$default(cryptoInstrumentInputHelper, bigDecimal, null, cryptoInputMode2, true, false, false, false, 98, null);
        String str = (String) tuples2ProcessAmount$default.component1();
        BigDecimal bigDecimal2 = (BigDecimal) tuples2ProcessAmount$default.component2();
        Tuples2 tuples2ProcessAmount$default2 = CryptoInstrumentInputHelper.processAmount$default(this.cryptoInstrumentInputHelper, amountInFiat, null, CryptoInputMode.QUOTE_CURRENCY, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
        return copy$default(this, null, 0, null, false, false, null, null, null, null, bigDecimal2, str, (BigDecimal) tuples2ProcessAmount$default2.component2(), (String) tuples2ProcessAmount$default2.component1(), null, null, null, null, null, 254463, null);
    }

    public final CryptoStakingInputDataState mutateWithPercentage(float percentage) {
        if (this.cryptoInstrumentInputHelper == null) {
            return this;
        }
        BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(BigDecimals7.safeMultiply(getCryptoAvailable(), new BigDecimal(String.valueOf(percentage / 100.0f))));
        BigDecimal bigDecimalFiatValue = fiatValue(bigDecimalM822m);
        CryptoInstrumentInputHelper cryptoInstrumentInputHelper = this.cryptoInstrumentInputHelper;
        Intrinsics.checkNotNull(bigDecimalM822m);
        Tuples2 tuples2ProcessAmount$default = CryptoInstrumentInputHelper.processAmount$default(cryptoInstrumentInputHelper, bigDecimalM822m, null, CryptoInputMode.ASSET_CURRENCY, true, false, false, false, 98, null);
        String str = (String) tuples2ProcessAmount$default.component1();
        BigDecimal bigDecimal = (BigDecimal) tuples2ProcessAmount$default.component2();
        CryptoInstrumentInputHelper cryptoInstrumentInputHelper2 = this.cryptoInstrumentInputHelper;
        if (bigDecimalFiatValue == null) {
            bigDecimalFiatValue = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal2 = bigDecimalFiatValue;
        Intrinsics.checkNotNull(bigDecimal2);
        Tuples2 tuples2ProcessAmount$default2 = CryptoInstrumentInputHelper.processAmount$default(cryptoInstrumentInputHelper2, bigDecimal2, null, CryptoInputMode.QUOTE_CURRENCY, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
        return copy$default(this, null, 0, null, false, false, null, null, null, null, bigDecimal, str, (BigDecimal) tuples2ProcessAmount$default2.component2(), (String) tuples2ProcessAmount$default2.component1(), null, null, null, null, null, 254463, null);
    }

    public final CryptoStakingInputDataState mutateWith(CryptoQuote cryptoQuote, UiCurrencyPair uiCurrencyPair) {
        BigDecimal ZERO;
        BigDecimal ZERO2;
        Intrinsics.checkNotNullParameter(cryptoQuote, "cryptoQuote");
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        int i = WhenMappings.$EnumSwitchMapping$1[this.cryptoInputMode.ordinal()];
        if (i == 1) {
            ZERO = this.cryptoAmount;
            if (ZERO == null) {
                ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            }
            ZERO2 = fiatValue(Money3.getBigDecimalCompat(cryptoQuote.getMarkPrice()), this.cryptoAmount);
            if (ZERO2 == null) {
                ZERO2 = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ZERO = cryptoValue(uiCurrencyPair, Money3.getBigDecimalCompat(cryptoQuote.getMarkPrice()), this.fiatAmount);
            if (ZERO == null) {
                ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            }
            ZERO2 = this.fiatAmount;
            if (ZERO2 == null) {
                ZERO2 = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
            }
        }
        BigDecimal bigDecimal = ZERO;
        CryptoInstrumentInputHelper cryptoInstrumentInputHelper = new CryptoInstrumentInputHelper(uiCurrencyPair);
        Tuples2 tuples2ProcessAmount$default = CryptoInstrumentInputHelper.processAmount$default(cryptoInstrumentInputHelper, bigDecimal, null, CryptoInputMode.ASSET_CURRENCY, true, false, false, false, 98, null);
        String str = (String) tuples2ProcessAmount$default.component1();
        BigDecimal bigDecimal2 = (BigDecimal) tuples2ProcessAmount$default.component2();
        Tuples2 tuples2ProcessAmount$default2 = CryptoInstrumentInputHelper.processAmount$default(cryptoInstrumentInputHelper, ZERO2, null, CryptoInputMode.QUOTE_CURRENCY, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
        String str2 = (String) tuples2ProcessAmount$default2.component1();
        return copy$default(this, null, 0, null, false, false, uiCurrencyPair, this.cryptoInputMode, null, null, bigDecimal2, str, (BigDecimal) tuples2ProcessAmount$default2.component2(), str2, cryptoInstrumentInputHelper, cryptoQuote, null, null, null, 229783, null);
    }

    public final CryptoStakingInputDataState mutateWith(KeyEvent keyEvent) {
        String amountString;
        BigDecimal bigDecimalFiatValue;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        if (this.uiCurrencyPair == null || (amountString = getAmountString()) == null || this.cryptoInstrumentInputHelper == null || getCryptoAvailable() == null || this.cryptoPrice == null) {
            return this;
        }
        CryptoInstrumentInputHelper cryptoInstrumentInputHelper = this.cryptoInstrumentInputHelper;
        CryptoInputMode cryptoInputMode = this.cryptoInputMode;
        CryptoInputMode cryptoInputMode2 = CryptoInputMode.QUOTE_CURRENCY;
        Tuples2 tuples2ProcessKeyEvent$default = CryptoInstrumentInputHelper.processKeyEvent$default(cryptoInstrumentInputHelper, keyEvent, amountString, cryptoInputMode, true, cryptoInputMode == cryptoInputMode2, false, false, 96, null);
        String str3 = (String) tuples2ProcessKeyEvent$default.component1();
        BigDecimal bigDecimal3 = (BigDecimal) tuples2ProcessKeyEvent$default.component2();
        int i = WhenMappings.$EnumSwitchMapping$1[this.cryptoInputMode.ordinal()];
        if (i == 1) {
            if (BigDecimals7.isZero(bigDecimal3)) {
                bigDecimalFiatValue = new BigDecimal("0", new MathContext(0));
            } else {
                bigDecimalFiatValue = fiatValue(bigDecimal3);
            }
            CryptoInstrumentInputHelper cryptoInstrumentInputHelper2 = this.cryptoInstrumentInputHelper;
            if (bigDecimalFiatValue == null) {
                bigDecimalFiatValue = BigDecimal.ZERO;
            }
            BigDecimal bigDecimal4 = bigDecimalFiatValue;
            Intrinsics.checkNotNull(bigDecimal4);
            Tuples2 tuples2ProcessAmount$default = CryptoInstrumentInputHelper.processAmount$default(cryptoInstrumentInputHelper2, bigDecimal4, null, cryptoInputMode2, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
            String str4 = (String) tuples2ProcessAmount$default.component1();
            bigDecimal = (BigDecimal) tuples2ProcessAmount$default.component2();
            bigDecimal2 = bigDecimal3;
            str = str3;
            str2 = str4;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal bigDecimalCryptoValue = cryptoValue(bigDecimal3);
            if (bigDecimalCryptoValue == null) {
                bigDecimalCryptoValue = BigDecimal.ZERO;
            }
            BigDecimal bigDecimal5 = bigDecimalCryptoValue;
            if (BigDecimals7.isZero(bigDecimal5)) {
                bigDecimal2 = new BigDecimal("0");
                str2 = str3;
                str = "0";
            } else {
                CryptoInstrumentInputHelper cryptoInstrumentInputHelper3 = this.cryptoInstrumentInputHelper;
                Intrinsics.checkNotNull(bigDecimal5);
                Tuples2 tuples2ProcessAmount$default2 = CryptoInstrumentInputHelper.processAmount$default(cryptoInstrumentInputHelper3, bigDecimal5, null, CryptoInputMode.ASSET_CURRENCY, true, false, false, false, 98, null);
                String str5 = (String) tuples2ProcessAmount$default2.component1();
                bigDecimal2 = (BigDecimal) tuples2ProcessAmount$default2.component2();
                str2 = str3;
                str = str5;
            }
            bigDecimal = bigDecimal3;
        }
        if (checkForError$feature_crypto_staking_externalDebug(str, str2, bigDecimal)) {
            return copy$default(this, null, this.shakeInputKey + 1, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 262141, null);
        }
        return copy$default(this, null, 0, null, false, false, null, null, null, null, bigDecimal2, str, bigDecimal, str2, null, null, null, null, null, 254461, null);
    }

    private final BigDecimal fiatValue(BigDecimal cryptoValue) {
        return fiatValue(this.cryptoPrice, cryptoValue);
    }

    private final BigDecimal fiatValue(BigDecimal cryptoPrice, BigDecimal cryptoValue) {
        if (cryptoValue == null && cryptoPrice == null) {
            return null;
        }
        return zzah$$ExternalSyntheticBackportWithForwarding0.m822m(BigDecimals7.safeMultiply(cryptoValue, cryptoPrice));
    }

    private final BigDecimal cryptoValue(BigDecimal fiatValue) {
        return cryptoValue(this.uiCurrencyPair, this.cryptoPrice, fiatValue);
    }

    private final BigDecimal cryptoValue(UiCurrencyPair uiCurrencyPair, BigDecimal cryptoPrice, BigDecimal fiatValue) {
        if (uiCurrencyPair != null) {
            return zzah$$ExternalSyntheticBackportWithForwarding0.m822m(BigDecimals7.safeDivide$default(fiatValue, cryptoPrice, uiCurrencyPair.getAssetCurrency().getDecimalScale(), null, 4, null));
        }
        return null;
    }

    public final boolean checkForError$feature_crypto_staking_externalDebug(String newCryptoAmountStringToCheck, String newFiatAmountStringToCheck, BigDecimal newFiatAmount) {
        Intrinsics.checkNotNullParameter(newCryptoAmountStringToCheck, "newCryptoAmountStringToCheck");
        Intrinsics.checkNotNullParameter(newFiatAmountStringToCheck, "newFiatAmountStringToCheck");
        Intrinsics.checkNotNullParameter(newFiatAmount, "newFiatAmount");
        if (BigDecimals7.m2978gt(newFiatAmount, getMaxOrderPrice$feature_crypto_staking_externalDebug())) {
            return true;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[this.cryptoInputMode.ordinal()];
        if (i == 1) {
            return Intrinsics.areEqual(newCryptoAmountStringToCheck, this.cryptoAmountString);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Intrinsics.areEqual(newFiatAmountStringToCheck, this.fiatAmountString);
    }
}
