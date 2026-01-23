package com.robinhood.shared.trade.crypto.p397ui.taxLots.input;

import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpadState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderHeaderState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRowState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderTypeDropdownSelectorState;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.account.CryptoTradeAccountSwitcherDropdownArgs;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.strategy.TaxLotStrategySelectionRowState;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.shared.trade.crypto.views.CryptoOrderInputDropdownRowState;
import com.robinhood.utils.resource.StringResource;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoTaxLotOrderInputViewState.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001`B½\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0014\u0012\b\u0010#\u001a\u0004\u0018\u00010$¢\u0006\u0004\b%\u0010&J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0007HÆ\u0003J\t\u0010J\u001a\u00020\tHÆ\u0003J\t\u0010K\u001a\u00020\u000bHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010N\u001a\u00020\tHÆ\u0003J\t\u0010O\u001a\u00020\u0012HÆ\u0003J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\t\u0010U\u001a\u00020\u001cHÆ\u0003J\t\u0010V\u001a\u00020\u001eHÆ\u0003J\t\u0010W\u001a\u00020 HÆ\u0003J\u000f\u0010X\u001a\b\u0012\u0004\u0012\u00020\"0\u0014HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010$HÆ\u0003Jå\u0001\u0010Z\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00142\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$HÆ\u0001J\u0013\u0010[\u001a\u00020\u001c2\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010]\u001a\u00020^HÖ\u0001J\t\u0010_\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b:\u00104R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b;\u00102R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b<\u00102R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010?R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0014¢\u0006\b\n\u0000\u001a\u0004\bD\u00109R\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bE\u0010F¨\u0006a"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputViewState;", "", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "requestInputs", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "cryptoOrderHeaderState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderHeaderState;", "orderTypeCryptoOrderInputDropdownRowState", "Lcom/robinhood/shared/trade/crypto/views/CryptoOrderInputDropdownRowState;", "orderTypeDropdownSelectorState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderTypeDropdownSelectorState;", "assetPriceRowState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "limitPriceRowState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState;", "taxLotStrategyDropdownRowState", "taxLotStrategyDropdownRowTapAction", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputViewState$TaxLotStrategyRowTapAction;", "taxLotStrategySelectionRowStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/strategy/TaxLotStrategySelectionRowState;", "assetOrderInputRowState", "feeRowState", "totalCreditRowState", "footerMessage", "Lcom/robinhood/utils/resource/StringResource;", "isCtaEnabled", "", "numpadState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "selectedTaxLotStrategyIdentifier", "", "bottomSheetTypeDtos", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "accountSwitcherArgs", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownArgs;", "<init>", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderHeaderState;Lcom/robinhood/shared/trade/crypto/views/CryptoOrderInputDropdownRowState;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderTypeDropdownSelectorState;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState;Lcom/robinhood/shared/trade/crypto/views/CryptoOrderInputDropdownRowState;Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputViewState$TaxLotStrategyRowTapAction;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownArgs;)V", "getCryptoOrderContext", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "getRequestInputs", "()Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "getCryptoOrderHeaderState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderHeaderState;", "getOrderTypeCryptoOrderInputDropdownRowState", "()Lcom/robinhood/shared/trade/crypto/views/CryptoOrderInputDropdownRowState;", "getOrderTypeDropdownSelectorState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderTypeDropdownSelectorState;", "getAssetPriceRowState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "getLimitPriceRowState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState;", "getTaxLotStrategyDropdownRowState", "getTaxLotStrategyDropdownRowTapAction", "()Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputViewState$TaxLotStrategyRowTapAction;", "getTaxLotStrategySelectionRowStates", "()Lkotlinx/collections/immutable/ImmutableList;", "getAssetOrderInputRowState", "getFeeRowState", "getTotalCreditRowState", "getFooterMessage", "()Lcom/robinhood/utils/resource/StringResource;", "()Z", "getNumpadState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "getSelectedTaxLotStrategyIdentifier", "()Ljava/lang/String;", "getBottomSheetTypeDtos", "getAccountSwitcherArgs", "()Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownArgs;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "other", "hashCode", "", "toString", "TaxLotStrategyRowTapAction", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoTaxLotOrderInputViewState {
    public static final int $stable = 8;
    private final CryptoTradeAccountSwitcherDropdownArgs accountSwitcherArgs;
    private final CryptoOrderInputRowState assetOrderInputRowState;
    private final CryptoOrderReviewRowState assetPriceRowState;
    private final ImmutableList<BottomSheetTypeDto> bottomSheetTypeDtos;
    private final CryptoOrderContext cryptoOrderContext;
    private final CryptoOrderHeaderState cryptoOrderHeaderState;
    private final CryptoOrderReviewRowState feeRowState;
    private final StringResource footerMessage;
    private final boolean isCtaEnabled;
    private final CryptoOrderInputRowState limitPriceRowState;
    private final CryptoOrderAnimatedBentoNumpadState numpadState;
    private final CryptoOrderInputDropdownRowState orderTypeCryptoOrderInputDropdownRowState;
    private final CryptoOrderTypeDropdownSelectorState orderTypeDropdownSelectorState;
    private final RequestInputs requestInputs;
    private final String selectedTaxLotStrategyIdentifier;
    private final CryptoOrderInputDropdownRowState taxLotStrategyDropdownRowState;
    private final TaxLotStrategyRowTapAction taxLotStrategyDropdownRowTapAction;
    private final ImmutableList<TaxLotStrategySelectionRowState> taxLotStrategySelectionRowStates;
    private final CryptoOrderReviewRowState totalCreditRowState;

    public static /* synthetic */ CryptoTaxLotOrderInputViewState copy$default(CryptoTaxLotOrderInputViewState cryptoTaxLotOrderInputViewState, CryptoOrderContext cryptoOrderContext, RequestInputs requestInputs, CryptoOrderHeaderState cryptoOrderHeaderState, CryptoOrderInputDropdownRowState cryptoOrderInputDropdownRowState, CryptoOrderTypeDropdownSelectorState cryptoOrderTypeDropdownSelectorState, CryptoOrderReviewRowState cryptoOrderReviewRowState, CryptoOrderInputRowState cryptoOrderInputRowState, CryptoOrderInputDropdownRowState cryptoOrderInputDropdownRowState2, TaxLotStrategyRowTapAction taxLotStrategyRowTapAction, ImmutableList immutableList, CryptoOrderInputRowState cryptoOrderInputRowState2, CryptoOrderReviewRowState cryptoOrderReviewRowState2, CryptoOrderReviewRowState cryptoOrderReviewRowState3, StringResource stringResource, boolean z, CryptoOrderAnimatedBentoNumpadState cryptoOrderAnimatedBentoNumpadState, String str, ImmutableList immutableList2, CryptoTradeAccountSwitcherDropdownArgs cryptoTradeAccountSwitcherDropdownArgs, int i, Object obj) {
        CryptoTradeAccountSwitcherDropdownArgs cryptoTradeAccountSwitcherDropdownArgs2;
        ImmutableList immutableList3;
        CryptoOrderContext cryptoOrderContext2 = (i & 1) != 0 ? cryptoTaxLotOrderInputViewState.cryptoOrderContext : cryptoOrderContext;
        RequestInputs requestInputs2 = (i & 2) != 0 ? cryptoTaxLotOrderInputViewState.requestInputs : requestInputs;
        CryptoOrderHeaderState cryptoOrderHeaderState2 = (i & 4) != 0 ? cryptoTaxLotOrderInputViewState.cryptoOrderHeaderState : cryptoOrderHeaderState;
        CryptoOrderInputDropdownRowState cryptoOrderInputDropdownRowState3 = (i & 8) != 0 ? cryptoTaxLotOrderInputViewState.orderTypeCryptoOrderInputDropdownRowState : cryptoOrderInputDropdownRowState;
        CryptoOrderTypeDropdownSelectorState cryptoOrderTypeDropdownSelectorState2 = (i & 16) != 0 ? cryptoTaxLotOrderInputViewState.orderTypeDropdownSelectorState : cryptoOrderTypeDropdownSelectorState;
        CryptoOrderReviewRowState cryptoOrderReviewRowState4 = (i & 32) != 0 ? cryptoTaxLotOrderInputViewState.assetPriceRowState : cryptoOrderReviewRowState;
        CryptoOrderInputRowState cryptoOrderInputRowState3 = (i & 64) != 0 ? cryptoTaxLotOrderInputViewState.limitPriceRowState : cryptoOrderInputRowState;
        CryptoOrderInputDropdownRowState cryptoOrderInputDropdownRowState4 = (i & 128) != 0 ? cryptoTaxLotOrderInputViewState.taxLotStrategyDropdownRowState : cryptoOrderInputDropdownRowState2;
        TaxLotStrategyRowTapAction taxLotStrategyRowTapAction2 = (i & 256) != 0 ? cryptoTaxLotOrderInputViewState.taxLotStrategyDropdownRowTapAction : taxLotStrategyRowTapAction;
        ImmutableList immutableList4 = (i & 512) != 0 ? cryptoTaxLotOrderInputViewState.taxLotStrategySelectionRowStates : immutableList;
        CryptoOrderInputRowState cryptoOrderInputRowState4 = (i & 1024) != 0 ? cryptoTaxLotOrderInputViewState.assetOrderInputRowState : cryptoOrderInputRowState2;
        CryptoOrderReviewRowState cryptoOrderReviewRowState5 = (i & 2048) != 0 ? cryptoTaxLotOrderInputViewState.feeRowState : cryptoOrderReviewRowState2;
        CryptoOrderReviewRowState cryptoOrderReviewRowState6 = (i & 4096) != 0 ? cryptoTaxLotOrderInputViewState.totalCreditRowState : cryptoOrderReviewRowState3;
        StringResource stringResource2 = (i & 8192) != 0 ? cryptoTaxLotOrderInputViewState.footerMessage : stringResource;
        CryptoOrderContext cryptoOrderContext3 = cryptoOrderContext2;
        boolean z2 = (i & 16384) != 0 ? cryptoTaxLotOrderInputViewState.isCtaEnabled : z;
        CryptoOrderAnimatedBentoNumpadState cryptoOrderAnimatedBentoNumpadState2 = (i & 32768) != 0 ? cryptoTaxLotOrderInputViewState.numpadState : cryptoOrderAnimatedBentoNumpadState;
        String str2 = (i & 65536) != 0 ? cryptoTaxLotOrderInputViewState.selectedTaxLotStrategyIdentifier : str;
        ImmutableList immutableList5 = (i & 131072) != 0 ? cryptoTaxLotOrderInputViewState.bottomSheetTypeDtos : immutableList2;
        if ((i & 262144) != 0) {
            immutableList3 = immutableList5;
            cryptoTradeAccountSwitcherDropdownArgs2 = cryptoTaxLotOrderInputViewState.accountSwitcherArgs;
        } else {
            cryptoTradeAccountSwitcherDropdownArgs2 = cryptoTradeAccountSwitcherDropdownArgs;
            immutableList3 = immutableList5;
        }
        return cryptoTaxLotOrderInputViewState.copy(cryptoOrderContext3, requestInputs2, cryptoOrderHeaderState2, cryptoOrderInputDropdownRowState3, cryptoOrderTypeDropdownSelectorState2, cryptoOrderReviewRowState4, cryptoOrderInputRowState3, cryptoOrderInputDropdownRowState4, taxLotStrategyRowTapAction2, immutableList4, cryptoOrderInputRowState4, cryptoOrderReviewRowState5, cryptoOrderReviewRowState6, stringResource2, z2, cryptoOrderAnimatedBentoNumpadState2, str2, immutableList3, cryptoTradeAccountSwitcherDropdownArgs2);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoOrderContext getCryptoOrderContext() {
        return this.cryptoOrderContext;
    }

    public final ImmutableList<TaxLotStrategySelectionRowState> component10() {
        return this.taxLotStrategySelectionRowStates;
    }

    /* renamed from: component11, reason: from getter */
    public final CryptoOrderInputRowState getAssetOrderInputRowState() {
        return this.assetOrderInputRowState;
    }

    /* renamed from: component12, reason: from getter */
    public final CryptoOrderReviewRowState getFeeRowState() {
        return this.feeRowState;
    }

    /* renamed from: component13, reason: from getter */
    public final CryptoOrderReviewRowState getTotalCreditRowState() {
        return this.totalCreditRowState;
    }

    /* renamed from: component14, reason: from getter */
    public final StringResource getFooterMessage() {
        return this.footerMessage;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsCtaEnabled() {
        return this.isCtaEnabled;
    }

    /* renamed from: component16, reason: from getter */
    public final CryptoOrderAnimatedBentoNumpadState getNumpadState() {
        return this.numpadState;
    }

    /* renamed from: component17, reason: from getter */
    public final String getSelectedTaxLotStrategyIdentifier() {
        return this.selectedTaxLotStrategyIdentifier;
    }

    public final ImmutableList<BottomSheetTypeDto> component18() {
        return this.bottomSheetTypeDtos;
    }

    /* renamed from: component19, reason: from getter */
    public final CryptoTradeAccountSwitcherDropdownArgs getAccountSwitcherArgs() {
        return this.accountSwitcherArgs;
    }

    /* renamed from: component2, reason: from getter */
    public final RequestInputs getRequestInputs() {
        return this.requestInputs;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoOrderHeaderState getCryptoOrderHeaderState() {
        return this.cryptoOrderHeaderState;
    }

    /* renamed from: component4, reason: from getter */
    public final CryptoOrderInputDropdownRowState getOrderTypeCryptoOrderInputDropdownRowState() {
        return this.orderTypeCryptoOrderInputDropdownRowState;
    }

    /* renamed from: component5, reason: from getter */
    public final CryptoOrderTypeDropdownSelectorState getOrderTypeDropdownSelectorState() {
        return this.orderTypeDropdownSelectorState;
    }

    /* renamed from: component6, reason: from getter */
    public final CryptoOrderReviewRowState getAssetPriceRowState() {
        return this.assetPriceRowState;
    }

    /* renamed from: component7, reason: from getter */
    public final CryptoOrderInputRowState getLimitPriceRowState() {
        return this.limitPriceRowState;
    }

    /* renamed from: component8, reason: from getter */
    public final CryptoOrderInputDropdownRowState getTaxLotStrategyDropdownRowState() {
        return this.taxLotStrategyDropdownRowState;
    }

    /* renamed from: component9, reason: from getter */
    public final TaxLotStrategyRowTapAction getTaxLotStrategyDropdownRowTapAction() {
        return this.taxLotStrategyDropdownRowTapAction;
    }

    public final CryptoTaxLotOrderInputViewState copy(CryptoOrderContext cryptoOrderContext, RequestInputs requestInputs, CryptoOrderHeaderState cryptoOrderHeaderState, CryptoOrderInputDropdownRowState orderTypeCryptoOrderInputDropdownRowState, CryptoOrderTypeDropdownSelectorState orderTypeDropdownSelectorState, CryptoOrderReviewRowState assetPriceRowState, CryptoOrderInputRowState limitPriceRowState, CryptoOrderInputDropdownRowState taxLotStrategyDropdownRowState, TaxLotStrategyRowTapAction taxLotStrategyDropdownRowTapAction, ImmutableList<TaxLotStrategySelectionRowState> taxLotStrategySelectionRowStates, CryptoOrderInputRowState assetOrderInputRowState, CryptoOrderReviewRowState feeRowState, CryptoOrderReviewRowState totalCreditRowState, StringResource footerMessage, boolean isCtaEnabled, CryptoOrderAnimatedBentoNumpadState numpadState, String selectedTaxLotStrategyIdentifier, ImmutableList<BottomSheetTypeDto> bottomSheetTypeDtos, CryptoTradeAccountSwitcherDropdownArgs accountSwitcherArgs) {
        Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
        Intrinsics.checkNotNullParameter(cryptoOrderHeaderState, "cryptoOrderHeaderState");
        Intrinsics.checkNotNullParameter(orderTypeCryptoOrderInputDropdownRowState, "orderTypeCryptoOrderInputDropdownRowState");
        Intrinsics.checkNotNullParameter(orderTypeDropdownSelectorState, "orderTypeDropdownSelectorState");
        Intrinsics.checkNotNullParameter(taxLotStrategyDropdownRowState, "taxLotStrategyDropdownRowState");
        Intrinsics.checkNotNullParameter(taxLotStrategyDropdownRowTapAction, "taxLotStrategyDropdownRowTapAction");
        Intrinsics.checkNotNullParameter(numpadState, "numpadState");
        Intrinsics.checkNotNullParameter(selectedTaxLotStrategyIdentifier, "selectedTaxLotStrategyIdentifier");
        Intrinsics.checkNotNullParameter(bottomSheetTypeDtos, "bottomSheetTypeDtos");
        return new CryptoTaxLotOrderInputViewState(cryptoOrderContext, requestInputs, cryptoOrderHeaderState, orderTypeCryptoOrderInputDropdownRowState, orderTypeDropdownSelectorState, assetPriceRowState, limitPriceRowState, taxLotStrategyDropdownRowState, taxLotStrategyDropdownRowTapAction, taxLotStrategySelectionRowStates, assetOrderInputRowState, feeRowState, totalCreditRowState, footerMessage, isCtaEnabled, numpadState, selectedTaxLotStrategyIdentifier, bottomSheetTypeDtos, accountSwitcherArgs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTaxLotOrderInputViewState)) {
            return false;
        }
        CryptoTaxLotOrderInputViewState cryptoTaxLotOrderInputViewState = (CryptoTaxLotOrderInputViewState) other;
        return Intrinsics.areEqual(this.cryptoOrderContext, cryptoTaxLotOrderInputViewState.cryptoOrderContext) && Intrinsics.areEqual(this.requestInputs, cryptoTaxLotOrderInputViewState.requestInputs) && Intrinsics.areEqual(this.cryptoOrderHeaderState, cryptoTaxLotOrderInputViewState.cryptoOrderHeaderState) && Intrinsics.areEqual(this.orderTypeCryptoOrderInputDropdownRowState, cryptoTaxLotOrderInputViewState.orderTypeCryptoOrderInputDropdownRowState) && Intrinsics.areEqual(this.orderTypeDropdownSelectorState, cryptoTaxLotOrderInputViewState.orderTypeDropdownSelectorState) && Intrinsics.areEqual(this.assetPriceRowState, cryptoTaxLotOrderInputViewState.assetPriceRowState) && Intrinsics.areEqual(this.limitPriceRowState, cryptoTaxLotOrderInputViewState.limitPriceRowState) && Intrinsics.areEqual(this.taxLotStrategyDropdownRowState, cryptoTaxLotOrderInputViewState.taxLotStrategyDropdownRowState) && this.taxLotStrategyDropdownRowTapAction == cryptoTaxLotOrderInputViewState.taxLotStrategyDropdownRowTapAction && Intrinsics.areEqual(this.taxLotStrategySelectionRowStates, cryptoTaxLotOrderInputViewState.taxLotStrategySelectionRowStates) && Intrinsics.areEqual(this.assetOrderInputRowState, cryptoTaxLotOrderInputViewState.assetOrderInputRowState) && Intrinsics.areEqual(this.feeRowState, cryptoTaxLotOrderInputViewState.feeRowState) && Intrinsics.areEqual(this.totalCreditRowState, cryptoTaxLotOrderInputViewState.totalCreditRowState) && Intrinsics.areEqual(this.footerMessage, cryptoTaxLotOrderInputViewState.footerMessage) && this.isCtaEnabled == cryptoTaxLotOrderInputViewState.isCtaEnabled && Intrinsics.areEqual(this.numpadState, cryptoTaxLotOrderInputViewState.numpadState) && Intrinsics.areEqual(this.selectedTaxLotStrategyIdentifier, cryptoTaxLotOrderInputViewState.selectedTaxLotStrategyIdentifier) && Intrinsics.areEqual(this.bottomSheetTypeDtos, cryptoTaxLotOrderInputViewState.bottomSheetTypeDtos) && Intrinsics.areEqual(this.accountSwitcherArgs, cryptoTaxLotOrderInputViewState.accountSwitcherArgs);
    }

    public int hashCode() {
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        int iHashCode = (((((((((cryptoOrderContext == null ? 0 : cryptoOrderContext.hashCode()) * 31) + this.requestInputs.hashCode()) * 31) + this.cryptoOrderHeaderState.hashCode()) * 31) + this.orderTypeCryptoOrderInputDropdownRowState.hashCode()) * 31) + this.orderTypeDropdownSelectorState.hashCode()) * 31;
        CryptoOrderReviewRowState cryptoOrderReviewRowState = this.assetPriceRowState;
        int iHashCode2 = (iHashCode + (cryptoOrderReviewRowState == null ? 0 : cryptoOrderReviewRowState.hashCode())) * 31;
        CryptoOrderInputRowState cryptoOrderInputRowState = this.limitPriceRowState;
        int iHashCode3 = (((((iHashCode2 + (cryptoOrderInputRowState == null ? 0 : cryptoOrderInputRowState.hashCode())) * 31) + this.taxLotStrategyDropdownRowState.hashCode()) * 31) + this.taxLotStrategyDropdownRowTapAction.hashCode()) * 31;
        ImmutableList<TaxLotStrategySelectionRowState> immutableList = this.taxLotStrategySelectionRowStates;
        int iHashCode4 = (iHashCode3 + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        CryptoOrderInputRowState cryptoOrderInputRowState2 = this.assetOrderInputRowState;
        int iHashCode5 = (iHashCode4 + (cryptoOrderInputRowState2 == null ? 0 : cryptoOrderInputRowState2.hashCode())) * 31;
        CryptoOrderReviewRowState cryptoOrderReviewRowState2 = this.feeRowState;
        int iHashCode6 = (iHashCode5 + (cryptoOrderReviewRowState2 == null ? 0 : cryptoOrderReviewRowState2.hashCode())) * 31;
        CryptoOrderReviewRowState cryptoOrderReviewRowState3 = this.totalCreditRowState;
        int iHashCode7 = (iHashCode6 + (cryptoOrderReviewRowState3 == null ? 0 : cryptoOrderReviewRowState3.hashCode())) * 31;
        StringResource stringResource = this.footerMessage;
        int iHashCode8 = (((((((((iHashCode7 + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + Boolean.hashCode(this.isCtaEnabled)) * 31) + this.numpadState.hashCode()) * 31) + this.selectedTaxLotStrategyIdentifier.hashCode()) * 31) + this.bottomSheetTypeDtos.hashCode()) * 31;
        CryptoTradeAccountSwitcherDropdownArgs cryptoTradeAccountSwitcherDropdownArgs = this.accountSwitcherArgs;
        return iHashCode8 + (cryptoTradeAccountSwitcherDropdownArgs != null ? cryptoTradeAccountSwitcherDropdownArgs.hashCode() : 0);
    }

    public String toString() {
        return "CryptoTaxLotOrderInputViewState(cryptoOrderContext=" + this.cryptoOrderContext + ", requestInputs=" + this.requestInputs + ", cryptoOrderHeaderState=" + this.cryptoOrderHeaderState + ", orderTypeCryptoOrderInputDropdownRowState=" + this.orderTypeCryptoOrderInputDropdownRowState + ", orderTypeDropdownSelectorState=" + this.orderTypeDropdownSelectorState + ", assetPriceRowState=" + this.assetPriceRowState + ", limitPriceRowState=" + this.limitPriceRowState + ", taxLotStrategyDropdownRowState=" + this.taxLotStrategyDropdownRowState + ", taxLotStrategyDropdownRowTapAction=" + this.taxLotStrategyDropdownRowTapAction + ", taxLotStrategySelectionRowStates=" + this.taxLotStrategySelectionRowStates + ", assetOrderInputRowState=" + this.assetOrderInputRowState + ", feeRowState=" + this.feeRowState + ", totalCreditRowState=" + this.totalCreditRowState + ", footerMessage=" + this.footerMessage + ", isCtaEnabled=" + this.isCtaEnabled + ", numpadState=" + this.numpadState + ", selectedTaxLotStrategyIdentifier=" + this.selectedTaxLotStrategyIdentifier + ", bottomSheetTypeDtos=" + this.bottomSheetTypeDtos + ", accountSwitcherArgs=" + this.accountSwitcherArgs + ")";
    }

    public CryptoTaxLotOrderInputViewState(CryptoOrderContext cryptoOrderContext, RequestInputs requestInputs, CryptoOrderHeaderState cryptoOrderHeaderState, CryptoOrderInputDropdownRowState orderTypeCryptoOrderInputDropdownRowState, CryptoOrderTypeDropdownSelectorState orderTypeDropdownSelectorState, CryptoOrderReviewRowState cryptoOrderReviewRowState, CryptoOrderInputRowState cryptoOrderInputRowState, CryptoOrderInputDropdownRowState taxLotStrategyDropdownRowState, TaxLotStrategyRowTapAction taxLotStrategyDropdownRowTapAction, ImmutableList<TaxLotStrategySelectionRowState> immutableList, CryptoOrderInputRowState cryptoOrderInputRowState2, CryptoOrderReviewRowState cryptoOrderReviewRowState2, CryptoOrderReviewRowState cryptoOrderReviewRowState3, StringResource stringResource, boolean z, CryptoOrderAnimatedBentoNumpadState numpadState, String selectedTaxLotStrategyIdentifier, ImmutableList<BottomSheetTypeDto> bottomSheetTypeDtos, CryptoTradeAccountSwitcherDropdownArgs cryptoTradeAccountSwitcherDropdownArgs) {
        Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
        Intrinsics.checkNotNullParameter(cryptoOrderHeaderState, "cryptoOrderHeaderState");
        Intrinsics.checkNotNullParameter(orderTypeCryptoOrderInputDropdownRowState, "orderTypeCryptoOrderInputDropdownRowState");
        Intrinsics.checkNotNullParameter(orderTypeDropdownSelectorState, "orderTypeDropdownSelectorState");
        Intrinsics.checkNotNullParameter(taxLotStrategyDropdownRowState, "taxLotStrategyDropdownRowState");
        Intrinsics.checkNotNullParameter(taxLotStrategyDropdownRowTapAction, "taxLotStrategyDropdownRowTapAction");
        Intrinsics.checkNotNullParameter(numpadState, "numpadState");
        Intrinsics.checkNotNullParameter(selectedTaxLotStrategyIdentifier, "selectedTaxLotStrategyIdentifier");
        Intrinsics.checkNotNullParameter(bottomSheetTypeDtos, "bottomSheetTypeDtos");
        this.cryptoOrderContext = cryptoOrderContext;
        this.requestInputs = requestInputs;
        this.cryptoOrderHeaderState = cryptoOrderHeaderState;
        this.orderTypeCryptoOrderInputDropdownRowState = orderTypeCryptoOrderInputDropdownRowState;
        this.orderTypeDropdownSelectorState = orderTypeDropdownSelectorState;
        this.assetPriceRowState = cryptoOrderReviewRowState;
        this.limitPriceRowState = cryptoOrderInputRowState;
        this.taxLotStrategyDropdownRowState = taxLotStrategyDropdownRowState;
        this.taxLotStrategyDropdownRowTapAction = taxLotStrategyDropdownRowTapAction;
        this.taxLotStrategySelectionRowStates = immutableList;
        this.assetOrderInputRowState = cryptoOrderInputRowState2;
        this.feeRowState = cryptoOrderReviewRowState2;
        this.totalCreditRowState = cryptoOrderReviewRowState3;
        this.footerMessage = stringResource;
        this.isCtaEnabled = z;
        this.numpadState = numpadState;
        this.selectedTaxLotStrategyIdentifier = selectedTaxLotStrategyIdentifier;
        this.bottomSheetTypeDtos = bottomSheetTypeDtos;
        this.accountSwitcherArgs = cryptoTradeAccountSwitcherDropdownArgs;
    }

    public final CryptoOrderContext getCryptoOrderContext() {
        return this.cryptoOrderContext;
    }

    public final RequestInputs getRequestInputs() {
        return this.requestInputs;
    }

    public final CryptoOrderHeaderState getCryptoOrderHeaderState() {
        return this.cryptoOrderHeaderState;
    }

    public final CryptoOrderInputDropdownRowState getOrderTypeCryptoOrderInputDropdownRowState() {
        return this.orderTypeCryptoOrderInputDropdownRowState;
    }

    public final CryptoOrderTypeDropdownSelectorState getOrderTypeDropdownSelectorState() {
        return this.orderTypeDropdownSelectorState;
    }

    public final CryptoOrderReviewRowState getAssetPriceRowState() {
        return this.assetPriceRowState;
    }

    public final CryptoOrderInputRowState getLimitPriceRowState() {
        return this.limitPriceRowState;
    }

    public final CryptoOrderInputDropdownRowState getTaxLotStrategyDropdownRowState() {
        return this.taxLotStrategyDropdownRowState;
    }

    public final TaxLotStrategyRowTapAction getTaxLotStrategyDropdownRowTapAction() {
        return this.taxLotStrategyDropdownRowTapAction;
    }

    public final ImmutableList<TaxLotStrategySelectionRowState> getTaxLotStrategySelectionRowStates() {
        return this.taxLotStrategySelectionRowStates;
    }

    public final CryptoOrderInputRowState getAssetOrderInputRowState() {
        return this.assetOrderInputRowState;
    }

    public final CryptoOrderReviewRowState getFeeRowState() {
        return this.feeRowState;
    }

    public final CryptoOrderReviewRowState getTotalCreditRowState() {
        return this.totalCreditRowState;
    }

    public final StringResource getFooterMessage() {
        return this.footerMessage;
    }

    public final boolean isCtaEnabled() {
        return this.isCtaEnabled;
    }

    public final CryptoOrderAnimatedBentoNumpadState getNumpadState() {
        return this.numpadState;
    }

    public final String getSelectedTaxLotStrategyIdentifier() {
        return this.selectedTaxLotStrategyIdentifier;
    }

    public final ImmutableList<BottomSheetTypeDto> getBottomSheetTypeDtos() {
        return this.bottomSheetTypeDtos;
    }

    public final CryptoTradeAccountSwitcherDropdownArgs getAccountSwitcherArgs() {
        return this.accountSwitcherArgs;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoTaxLotOrderInputViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputViewState$TaxLotStrategyRowTapAction;", "", "<init>", "(Ljava/lang/String;I)V", "DISPLAY_STRATEGY_SELECTION_BOTTOM_SHEET", "PROCEED_TO_LOT_SELECTION", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TaxLotStrategyRowTapAction {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TaxLotStrategyRowTapAction[] $VALUES;
        public static final TaxLotStrategyRowTapAction DISPLAY_STRATEGY_SELECTION_BOTTOM_SHEET = new TaxLotStrategyRowTapAction("DISPLAY_STRATEGY_SELECTION_BOTTOM_SHEET", 0);
        public static final TaxLotStrategyRowTapAction PROCEED_TO_LOT_SELECTION = new TaxLotStrategyRowTapAction("PROCEED_TO_LOT_SELECTION", 1);

        private static final /* synthetic */ TaxLotStrategyRowTapAction[] $values() {
            return new TaxLotStrategyRowTapAction[]{DISPLAY_STRATEGY_SELECTION_BOTTOM_SHEET, PROCEED_TO_LOT_SELECTION};
        }

        public static EnumEntries<TaxLotStrategyRowTapAction> getEntries() {
            return $ENTRIES;
        }

        private TaxLotStrategyRowTapAction(String str, int i) {
        }

        static {
            TaxLotStrategyRowTapAction[] taxLotStrategyRowTapActionArr$values = $values();
            $VALUES = taxLotStrategyRowTapActionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(taxLotStrategyRowTapActionArr$values);
        }

        public static TaxLotStrategyRowTapAction valueOf(String str) {
            return (TaxLotStrategyRowTapAction) Enum.valueOf(TaxLotStrategyRowTapAction.class, str);
        }

        public static TaxLotStrategyRowTapAction[] values() {
            return (TaxLotStrategyRowTapAction[]) $VALUES.clone();
        }
    }
}
