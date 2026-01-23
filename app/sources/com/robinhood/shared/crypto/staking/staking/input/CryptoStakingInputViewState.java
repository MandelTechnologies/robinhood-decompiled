package com.robinhood.shared.crypto.staking.staking.input;

import com.robinhood.models.api.staking.ApiCryptoStakingOrder;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.staking.AmountAvailableInfoScreen;
import com.robinhood.rosetta.eventlogging.CryptoStakingContext;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStakingInputViewState.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0012\u0012\u0006\u0010\u001e\u001a\u00020\u0012\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010!\u001a\u00020\"\u0012\b\u0010#\u001a\u0004\u0018\u00010$¢\u0006\u0004\b%\u0010&J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010H\u001a\u00020\bHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010J\u001a\u00020\fHÆ\u0003J\t\u0010K\u001a\u00020\u000eHÆ\u0003J\t\u0010L\u001a\u00020\u0010HÆ\u0003J\t\u0010M\u001a\u00020\u0012HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010S\u001a\u00020\u0010HÆ\u0003J\t\u0010T\u001a\u00020\u0010HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0012HÆ\u0003J\t\u0010W\u001a\u00020\u0012HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010Z\u001a\u00020\"HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010$HÆ\u0003Jû\u0001\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$HÆ\u0001J\u0013\u0010]\u001a\u00020\u00032\b\u0010^\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010_\u001a\u00020`HÖ\u0001J\t\u0010a\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010'R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010'R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010'R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010'R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010'R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u001a\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b:\u00103R\u0011\u0010\u001b\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010'R\u0011\u0010\u001d\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b=\u00105R\u0011\u0010\u001e\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b>\u00105R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010'R\u0013\u0010 \u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b@\u00103R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bC\u0010D¨\u0006b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputViewState;", "", "isLoading", "", "isRequestingOrder", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "cryptoInputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "stakingAmountInfoSheet", "Lcom/robinhood/models/crypto/ui/staking/AmountAvailableInfoScreen$InfoSheetData$StakingOrderFlow;", "orderType", "Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;", "idempotencyId", "Ljava/util/UUID;", "title", "Lcom/robinhood/utils/resource/StringResource;", "currencySymbol", "", "amount", "Ljava/math/BigDecimal;", "isReviewButtonVisible", "isReviewButtonEnabled", "isSuggestionPillTappable", "eventContext", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;", "availableText", "availableAmountSheetIconContentDescription", "rewardsEnabled", "typedAmountText", "estimatedApyText", "shouldShowApyText", "estimatedAmountText", "amountType", "Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$AmountType;", "suggestedInputAmountState", "Lcom/robinhood/shared/crypto/staking/staking/input/SuggestedInputAmountState;", "<init>", "(ZZLcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/shared/formats/crypto/CryptoInputMode;Lcom/robinhood/models/crypto/ui/staking/AmountAvailableInfoScreen$InfoSheetData$StakingOrderFlow;Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/math/BigDecimal;ZZZLcom/robinhood/rosetta/eventlogging/CryptoStakingContext;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZLjava/lang/String;Ljava/lang/String;ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$AmountType;Lcom/robinhood/shared/crypto/staking/staking/input/SuggestedInputAmountState;)V", "()Z", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getCryptoInputMode", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getStakingAmountInfoSheet", "()Lcom/robinhood/models/crypto/ui/staking/AmountAvailableInfoScreen$InfoSheetData$StakingOrderFlow;", "getOrderType", "()Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;", "getIdempotencyId", "()Ljava/util/UUID;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getCurrencySymbol", "()Ljava/lang/String;", "getAmount", "()Ljava/math/BigDecimal;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;", "getAvailableText", "getAvailableAmountSheetIconContentDescription", "getRewardsEnabled", "getTypedAmountText", "getEstimatedApyText", "getShouldShowApyText", "getEstimatedAmountText", "getAmountType", "()Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$AmountType;", "getSuggestedInputAmountState", "()Lcom/robinhood/shared/crypto/staking/staking/input/SuggestedInputAmountState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoStakingInputViewState {
    public static final int $stable = 8;
    private final BigDecimal amount;
    private final ApiCryptoStakingOrder.AmountType amountType;
    private final StringResource availableAmountSheetIconContentDescription;
    private final StringResource availableText;
    private final CryptoInputMode cryptoInputMode;
    private final String currencySymbol;
    private final StringResource estimatedAmountText;
    private final String estimatedApyText;
    private final CryptoStakingContext eventContext;
    private final UUID idempotencyId;
    private final boolean isLoading;
    private final boolean isRequestingOrder;
    private final boolean isReviewButtonEnabled;
    private final boolean isReviewButtonVisible;
    private final boolean isSuggestionPillTappable;
    private final ApiCryptoStakingOrder.OrderType orderType;
    private final boolean rewardsEnabled;
    private final boolean shouldShowApyText;
    private final AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow stakingAmountInfoSheet;
    private final SuggestedInputAmountState suggestedInputAmountState;
    private final StringResource title;
    private final String typedAmountText;
    private final UiCurrencyPair uiCurrencyPair;

    public static /* synthetic */ CryptoStakingInputViewState copy$default(CryptoStakingInputViewState cryptoStakingInputViewState, boolean z, boolean z2, UiCurrencyPair uiCurrencyPair, CryptoInputMode cryptoInputMode, AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow stakingOrderFlow, ApiCryptoStakingOrder.OrderType orderType, UUID uuid, StringResource stringResource, String str, BigDecimal bigDecimal, boolean z3, boolean z4, boolean z5, CryptoStakingContext cryptoStakingContext, StringResource stringResource2, StringResource stringResource3, boolean z6, String str2, String str3, boolean z7, StringResource stringResource4, ApiCryptoStakingOrder.AmountType amountType, SuggestedInputAmountState suggestedInputAmountState, int i, Object obj) {
        SuggestedInputAmountState suggestedInputAmountState2;
        ApiCryptoStakingOrder.AmountType amountType2;
        boolean z8 = (i & 1) != 0 ? cryptoStakingInputViewState.isLoading : z;
        boolean z9 = (i & 2) != 0 ? cryptoStakingInputViewState.isRequestingOrder : z2;
        UiCurrencyPair uiCurrencyPair2 = (i & 4) != 0 ? cryptoStakingInputViewState.uiCurrencyPair : uiCurrencyPair;
        CryptoInputMode cryptoInputMode2 = (i & 8) != 0 ? cryptoStakingInputViewState.cryptoInputMode : cryptoInputMode;
        AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow stakingOrderFlow2 = (i & 16) != 0 ? cryptoStakingInputViewState.stakingAmountInfoSheet : stakingOrderFlow;
        ApiCryptoStakingOrder.OrderType orderType2 = (i & 32) != 0 ? cryptoStakingInputViewState.orderType : orderType;
        UUID uuid2 = (i & 64) != 0 ? cryptoStakingInputViewState.idempotencyId : uuid;
        StringResource stringResource5 = (i & 128) != 0 ? cryptoStakingInputViewState.title : stringResource;
        String str4 = (i & 256) != 0 ? cryptoStakingInputViewState.currencySymbol : str;
        BigDecimal bigDecimal2 = (i & 512) != 0 ? cryptoStakingInputViewState.amount : bigDecimal;
        boolean z10 = (i & 1024) != 0 ? cryptoStakingInputViewState.isReviewButtonVisible : z3;
        boolean z11 = (i & 2048) != 0 ? cryptoStakingInputViewState.isReviewButtonEnabled : z4;
        boolean z12 = (i & 4096) != 0 ? cryptoStakingInputViewState.isSuggestionPillTappable : z5;
        CryptoStakingContext cryptoStakingContext2 = (i & 8192) != 0 ? cryptoStakingInputViewState.eventContext : cryptoStakingContext;
        boolean z13 = z8;
        StringResource stringResource6 = (i & 16384) != 0 ? cryptoStakingInputViewState.availableText : stringResource2;
        StringResource stringResource7 = (i & 32768) != 0 ? cryptoStakingInputViewState.availableAmountSheetIconContentDescription : stringResource3;
        boolean z14 = (i & 65536) != 0 ? cryptoStakingInputViewState.rewardsEnabled : z6;
        String str5 = (i & 131072) != 0 ? cryptoStakingInputViewState.typedAmountText : str2;
        String str6 = (i & 262144) != 0 ? cryptoStakingInputViewState.estimatedApyText : str3;
        boolean z15 = (i & 524288) != 0 ? cryptoStakingInputViewState.shouldShowApyText : z7;
        StringResource stringResource8 = (i & 1048576) != 0 ? cryptoStakingInputViewState.estimatedAmountText : stringResource4;
        ApiCryptoStakingOrder.AmountType amountType3 = (i & 2097152) != 0 ? cryptoStakingInputViewState.amountType : amountType;
        if ((i & 4194304) != 0) {
            amountType2 = amountType3;
            suggestedInputAmountState2 = cryptoStakingInputViewState.suggestedInputAmountState;
        } else {
            suggestedInputAmountState2 = suggestedInputAmountState;
            amountType2 = amountType3;
        }
        return cryptoStakingInputViewState.copy(z13, z9, uiCurrencyPair2, cryptoInputMode2, stakingOrderFlow2, orderType2, uuid2, stringResource5, str4, bigDecimal2, z10, z11, z12, cryptoStakingContext2, stringResource6, stringResource7, z14, str5, str6, z15, stringResource8, amountType2, suggestedInputAmountState2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component10, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsReviewButtonVisible() {
        return this.isReviewButtonVisible;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsReviewButtonEnabled() {
        return this.isReviewButtonEnabled;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsSuggestionPillTappable() {
        return this.isSuggestionPillTappable;
    }

    /* renamed from: component14, reason: from getter */
    public final CryptoStakingContext getEventContext() {
        return this.eventContext;
    }

    /* renamed from: component15, reason: from getter */
    public final StringResource getAvailableText() {
        return this.availableText;
    }

    /* renamed from: component16, reason: from getter */
    public final StringResource getAvailableAmountSheetIconContentDescription() {
        return this.availableAmountSheetIconContentDescription;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getRewardsEnabled() {
        return this.rewardsEnabled;
    }

    /* renamed from: component18, reason: from getter */
    public final String getTypedAmountText() {
        return this.typedAmountText;
    }

    /* renamed from: component19, reason: from getter */
    public final String getEstimatedApyText() {
        return this.estimatedApyText;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRequestingOrder() {
        return this.isRequestingOrder;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getShouldShowApyText() {
        return this.shouldShowApyText;
    }

    /* renamed from: component21, reason: from getter */
    public final StringResource getEstimatedAmountText() {
        return this.estimatedAmountText;
    }

    /* renamed from: component22, reason: from getter */
    public final ApiCryptoStakingOrder.AmountType getAmountType() {
        return this.amountType;
    }

    /* renamed from: component23, reason: from getter */
    public final SuggestedInputAmountState getSuggestedInputAmountState() {
        return this.suggestedInputAmountState;
    }

    /* renamed from: component3, reason: from getter */
    public final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    /* renamed from: component4, reason: from getter */
    public final CryptoInputMode getCryptoInputMode() {
        return this.cryptoInputMode;
    }

    /* renamed from: component5, reason: from getter */
    public final AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow getStakingAmountInfoSheet() {
        return this.stakingAmountInfoSheet;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiCryptoStakingOrder.OrderType getOrderType() {
        return this.orderType;
    }

    /* renamed from: component7, reason: from getter */
    public final UUID getIdempotencyId() {
        return this.idempotencyId;
    }

    /* renamed from: component8, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final CryptoStakingInputViewState copy(boolean isLoading, boolean isRequestingOrder, UiCurrencyPair uiCurrencyPair, CryptoInputMode cryptoInputMode, AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow stakingAmountInfoSheet, ApiCryptoStakingOrder.OrderType orderType, UUID idempotencyId, StringResource title, String currencySymbol, BigDecimal amount, boolean isReviewButtonVisible, boolean isReviewButtonEnabled, boolean isSuggestionPillTappable, CryptoStakingContext eventContext, StringResource availableText, StringResource availableAmountSheetIconContentDescription, boolean rewardsEnabled, String typedAmountText, String estimatedApyText, boolean shouldShowApyText, StringResource estimatedAmountText, ApiCryptoStakingOrder.AmountType amountType, SuggestedInputAmountState suggestedInputAmountState) {
        Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(idempotencyId, "idempotencyId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(currencySymbol, "currencySymbol");
        Intrinsics.checkNotNullParameter(availableText, "availableText");
        Intrinsics.checkNotNullParameter(availableAmountSheetIconContentDescription, "availableAmountSheetIconContentDescription");
        Intrinsics.checkNotNullParameter(typedAmountText, "typedAmountText");
        Intrinsics.checkNotNullParameter(estimatedApyText, "estimatedApyText");
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        return new CryptoStakingInputViewState(isLoading, isRequestingOrder, uiCurrencyPair, cryptoInputMode, stakingAmountInfoSheet, orderType, idempotencyId, title, currencySymbol, amount, isReviewButtonVisible, isReviewButtonEnabled, isSuggestionPillTappable, eventContext, availableText, availableAmountSheetIconContentDescription, rewardsEnabled, typedAmountText, estimatedApyText, shouldShowApyText, estimatedAmountText, amountType, suggestedInputAmountState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoStakingInputViewState)) {
            return false;
        }
        CryptoStakingInputViewState cryptoStakingInputViewState = (CryptoStakingInputViewState) other;
        return this.isLoading == cryptoStakingInputViewState.isLoading && this.isRequestingOrder == cryptoStakingInputViewState.isRequestingOrder && Intrinsics.areEqual(this.uiCurrencyPair, cryptoStakingInputViewState.uiCurrencyPair) && this.cryptoInputMode == cryptoStakingInputViewState.cryptoInputMode && Intrinsics.areEqual(this.stakingAmountInfoSheet, cryptoStakingInputViewState.stakingAmountInfoSheet) && this.orderType == cryptoStakingInputViewState.orderType && Intrinsics.areEqual(this.idempotencyId, cryptoStakingInputViewState.idempotencyId) && Intrinsics.areEqual(this.title, cryptoStakingInputViewState.title) && Intrinsics.areEqual(this.currencySymbol, cryptoStakingInputViewState.currencySymbol) && Intrinsics.areEqual(this.amount, cryptoStakingInputViewState.amount) && this.isReviewButtonVisible == cryptoStakingInputViewState.isReviewButtonVisible && this.isReviewButtonEnabled == cryptoStakingInputViewState.isReviewButtonEnabled && this.isSuggestionPillTappable == cryptoStakingInputViewState.isSuggestionPillTappable && Intrinsics.areEqual(this.eventContext, cryptoStakingInputViewState.eventContext) && Intrinsics.areEqual(this.availableText, cryptoStakingInputViewState.availableText) && Intrinsics.areEqual(this.availableAmountSheetIconContentDescription, cryptoStakingInputViewState.availableAmountSheetIconContentDescription) && this.rewardsEnabled == cryptoStakingInputViewState.rewardsEnabled && Intrinsics.areEqual(this.typedAmountText, cryptoStakingInputViewState.typedAmountText) && Intrinsics.areEqual(this.estimatedApyText, cryptoStakingInputViewState.estimatedApyText) && this.shouldShowApyText == cryptoStakingInputViewState.shouldShowApyText && Intrinsics.areEqual(this.estimatedAmountText, cryptoStakingInputViewState.estimatedAmountText) && this.amountType == cryptoStakingInputViewState.amountType && Intrinsics.areEqual(this.suggestedInputAmountState, cryptoStakingInputViewState.suggestedInputAmountState);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isRequestingOrder)) * 31;
        UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
        int iHashCode2 = (((iHashCode + (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode())) * 31) + this.cryptoInputMode.hashCode()) * 31;
        AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow stakingOrderFlow = this.stakingAmountInfoSheet;
        int iHashCode3 = (((((((((iHashCode2 + (stakingOrderFlow == null ? 0 : stakingOrderFlow.hashCode())) * 31) + this.orderType.hashCode()) * 31) + this.idempotencyId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.currencySymbol.hashCode()) * 31;
        BigDecimal bigDecimal = this.amount;
        int iHashCode4 = (((((((iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + Boolean.hashCode(this.isReviewButtonVisible)) * 31) + Boolean.hashCode(this.isReviewButtonEnabled)) * 31) + Boolean.hashCode(this.isSuggestionPillTappable)) * 31;
        CryptoStakingContext cryptoStakingContext = this.eventContext;
        int iHashCode5 = (((((((((((((iHashCode4 + (cryptoStakingContext == null ? 0 : cryptoStakingContext.hashCode())) * 31) + this.availableText.hashCode()) * 31) + this.availableAmountSheetIconContentDescription.hashCode()) * 31) + Boolean.hashCode(this.rewardsEnabled)) * 31) + this.typedAmountText.hashCode()) * 31) + this.estimatedApyText.hashCode()) * 31) + Boolean.hashCode(this.shouldShowApyText)) * 31;
        StringResource stringResource = this.estimatedAmountText;
        int iHashCode6 = (((iHashCode5 + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.amountType.hashCode()) * 31;
        SuggestedInputAmountState suggestedInputAmountState = this.suggestedInputAmountState;
        return iHashCode6 + (suggestedInputAmountState != null ? suggestedInputAmountState.hashCode() : 0);
    }

    public String toString() {
        return "CryptoStakingInputViewState(isLoading=" + this.isLoading + ", isRequestingOrder=" + this.isRequestingOrder + ", uiCurrencyPair=" + this.uiCurrencyPair + ", cryptoInputMode=" + this.cryptoInputMode + ", stakingAmountInfoSheet=" + this.stakingAmountInfoSheet + ", orderType=" + this.orderType + ", idempotencyId=" + this.idempotencyId + ", title=" + this.title + ", currencySymbol=" + this.currencySymbol + ", amount=" + this.amount + ", isReviewButtonVisible=" + this.isReviewButtonVisible + ", isReviewButtonEnabled=" + this.isReviewButtonEnabled + ", isSuggestionPillTappable=" + this.isSuggestionPillTappable + ", eventContext=" + this.eventContext + ", availableText=" + this.availableText + ", availableAmountSheetIconContentDescription=" + this.availableAmountSheetIconContentDescription + ", rewardsEnabled=" + this.rewardsEnabled + ", typedAmountText=" + this.typedAmountText + ", estimatedApyText=" + this.estimatedApyText + ", shouldShowApyText=" + this.shouldShowApyText + ", estimatedAmountText=" + this.estimatedAmountText + ", amountType=" + this.amountType + ", suggestedInputAmountState=" + this.suggestedInputAmountState + ")";
    }

    public CryptoStakingInputViewState(boolean z, boolean z2, UiCurrencyPair uiCurrencyPair, CryptoInputMode cryptoInputMode, AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow stakingOrderFlow, ApiCryptoStakingOrder.OrderType orderType, UUID idempotencyId, StringResource title, String currencySymbol, BigDecimal bigDecimal, boolean z3, boolean z4, boolean z5, CryptoStakingContext cryptoStakingContext, StringResource availableText, StringResource availableAmountSheetIconContentDescription, boolean z6, String typedAmountText, String estimatedApyText, boolean z7, StringResource stringResource, ApiCryptoStakingOrder.AmountType amountType, SuggestedInputAmountState suggestedInputAmountState) {
        Intrinsics.checkNotNullParameter(cryptoInputMode, "cryptoInputMode");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(idempotencyId, "idempotencyId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(currencySymbol, "currencySymbol");
        Intrinsics.checkNotNullParameter(availableText, "availableText");
        Intrinsics.checkNotNullParameter(availableAmountSheetIconContentDescription, "availableAmountSheetIconContentDescription");
        Intrinsics.checkNotNullParameter(typedAmountText, "typedAmountText");
        Intrinsics.checkNotNullParameter(estimatedApyText, "estimatedApyText");
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        this.isLoading = z;
        this.isRequestingOrder = z2;
        this.uiCurrencyPair = uiCurrencyPair;
        this.cryptoInputMode = cryptoInputMode;
        this.stakingAmountInfoSheet = stakingOrderFlow;
        this.orderType = orderType;
        this.idempotencyId = idempotencyId;
        this.title = title;
        this.currencySymbol = currencySymbol;
        this.amount = bigDecimal;
        this.isReviewButtonVisible = z3;
        this.isReviewButtonEnabled = z4;
        this.isSuggestionPillTappable = z5;
        this.eventContext = cryptoStakingContext;
        this.availableText = availableText;
        this.availableAmountSheetIconContentDescription = availableAmountSheetIconContentDescription;
        this.rewardsEnabled = z6;
        this.typedAmountText = typedAmountText;
        this.estimatedApyText = estimatedApyText;
        this.shouldShowApyText = z7;
        this.estimatedAmountText = stringResource;
        this.amountType = amountType;
        this.suggestedInputAmountState = suggestedInputAmountState;
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

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CryptoStakingInputViewState(boolean r26, boolean r27, com.robinhood.models.crypto.p315ui.UiCurrencyPair r28, com.robinhood.shared.formats.crypto.CryptoInputMode r29, com.robinhood.models.crypto.ui.staking.AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow r30, com.robinhood.models.api.staking.ApiCryptoStakingOrder.OrderType r31, java.util.UUID r32, com.robinhood.utils.resource.StringResource r33, java.lang.String r34, java.math.BigDecimal r35, boolean r36, boolean r37, boolean r38, com.robinhood.rosetta.eventlogging.CryptoStakingContext r39, com.robinhood.utils.resource.StringResource r40, com.robinhood.utils.resource.StringResource r41, boolean r42, java.lang.String r43, java.lang.String r44, boolean r45, com.robinhood.utils.resource.StringResource r46, com.robinhood.models.api.staking.ApiCryptoStakingOrder.AmountType r47, com.robinhood.shared.crypto.staking.staking.input.SuggestedInputAmountState r48, int r49, kotlin.jvm.internal.DefaultConstructorMarker r50) {
        /*
            r25 = this;
            r0 = r49 & 2
            if (r0 == 0) goto L7
            r0 = 0
            r3 = r0
            goto L9
        L7:
            r3 = r27
        L9:
            r0 = r49 & 4
            r1 = 0
            if (r0 == 0) goto L10
            r4 = r1
            goto L12
        L10:
            r4 = r28
        L12:
            r0 = r49 & 8
            if (r0 == 0) goto L1a
            com.robinhood.shared.formats.crypto.CryptoInputMode r0 = com.robinhood.shared.formats.crypto.CryptoInputMode.ASSET_CURRENCY
            r5 = r0
            goto L1c
        L1a:
            r5 = r29
        L1c:
            r0 = r49 & 16
            if (r0 == 0) goto L4a
            r6 = r1
            r2 = r26
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r13 = r37
            r14 = r38
            r15 = r39
            r16 = r40
            r17 = r41
            r18 = r42
            r19 = r43
            r20 = r44
            r21 = r45
            r22 = r46
            r23 = r47
            r24 = r48
            r1 = r25
            goto L74
        L4a:
            r6 = r30
            r1 = r25
            r2 = r26
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r13 = r37
            r14 = r38
            r15 = r39
            r16 = r40
            r17 = r41
            r18 = r42
            r19 = r43
            r20 = r44
            r21 = r45
            r22 = r46
            r23 = r47
            r24 = r48
        L74:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputViewState.<init>(boolean, boolean, com.robinhood.models.crypto.ui.UiCurrencyPair, com.robinhood.shared.formats.crypto.CryptoInputMode, com.robinhood.models.crypto.ui.staking.AmountAvailableInfoScreen$InfoSheetData$StakingOrderFlow, com.robinhood.models.api.staking.ApiCryptoStakingOrder$OrderType, java.util.UUID, com.robinhood.utils.resource.StringResource, java.lang.String, java.math.BigDecimal, boolean, boolean, boolean, com.robinhood.rosetta.eventlogging.CryptoStakingContext, com.robinhood.utils.resource.StringResource, com.robinhood.utils.resource.StringResource, boolean, java.lang.String, java.lang.String, boolean, com.robinhood.utils.resource.StringResource, com.robinhood.models.api.staking.ApiCryptoStakingOrder$AmountType, com.robinhood.shared.crypto.staking.staking.input.SuggestedInputAmountState, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final CryptoInputMode getCryptoInputMode() {
        return this.cryptoInputMode;
    }

    public final AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow getStakingAmountInfoSheet() {
        return this.stakingAmountInfoSheet;
    }

    public final ApiCryptoStakingOrder.OrderType getOrderType() {
        return this.orderType;
    }

    public final UUID getIdempotencyId() {
        return this.idempotencyId;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final boolean isReviewButtonVisible() {
        return this.isReviewButtonVisible;
    }

    public final boolean isReviewButtonEnabled() {
        return this.isReviewButtonEnabled;
    }

    public final boolean isSuggestionPillTappable() {
        return this.isSuggestionPillTappable;
    }

    public final CryptoStakingContext getEventContext() {
        return this.eventContext;
    }

    public final StringResource getAvailableText() {
        return this.availableText;
    }

    public final StringResource getAvailableAmountSheetIconContentDescription() {
        return this.availableAmountSheetIconContentDescription;
    }

    public final boolean getRewardsEnabled() {
        return this.rewardsEnabled;
    }

    public final String getTypedAmountText() {
        return this.typedAmountText;
    }

    public final String getEstimatedApyText() {
        return this.estimatedApyText;
    }

    public final boolean getShouldShowApyText() {
        return this.shouldShowApyText;
    }

    public final StringResource getEstimatedAmountText() {
        return this.estimatedAmountText;
    }

    public final ApiCryptoStakingOrder.AmountType getAmountType() {
        return this.amountType;
    }

    public final SuggestedInputAmountState getSuggestedInputAmountState() {
        return this.suggestedInputAmountState;
    }
}
