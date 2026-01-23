package com.robinhood.shared.trade.crypto.p397ui.taxLots.input;

import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.input.CryptoTaxLotOrderInputDataState;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nummus.p512v1.TaxLotStrategyTypeDto;

/* compiled from: CryptoTaxLotOrderInputDataStates.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¨\u0006\u0007"}, m3636d2 = {"newFocusedInputField", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState$InputField;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/input/CryptoTaxLotOrderInputDataState;", "newOrderType", "Lcom/robinhood/models/api/CryptoOrderType;", "newTaxLotStrategyTypeDto", "Lnummus/v1/TaxLotStrategyTypeDto;", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDataStatesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoTaxLotOrderInputDataStates {

    /* compiled from: CryptoTaxLotOrderInputDataStates.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.input.CryptoTaxLotOrderInputDataStatesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CryptoOrderType.values().length];
            try {
                iArr[CryptoOrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoOrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoOrderType.STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CryptoOrderType.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TaxLotStrategyTypeDto.values().length];
            try {
                iArr2[TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TaxLotStrategyTypeDto.TAX_LOT_STRATEGY_TYPE_CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final CryptoTaxLotOrderInputDataState.InputField newFocusedInputField(CryptoTaxLotOrderInputDataState cryptoTaxLotOrderInputDataState, CryptoOrderType newOrderType, TaxLotStrategyTypeDto taxLotStrategyTypeDto) {
        CryptoTaxLotOrderInputDataState.InputField inputField;
        Intrinsics.checkNotNullParameter(cryptoTaxLotOrderInputDataState, "<this>");
        Intrinsics.checkNotNullParameter(newOrderType, "newOrderType");
        int i = WhenMappings.$EnumSwitchMapping$0[newOrderType.ordinal()];
        if (i == 1) {
            inputField = null;
        } else {
            if (i != 2) {
                if (i == 3) {
                    throw new IllegalStateException("Tax lots for stop loss orders not supported");
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Tax lots for stop limit orders not supported");
            }
            inputField = CryptoTaxLotOrderInputDataState.InputField.LIMIT_PRICE;
        }
        int i2 = taxLotStrategyTypeDto == null ? -1 : WhenMappings.$EnumSwitchMapping$1[taxLotStrategyTypeDto.ordinal()];
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new CryptoTaxLotOrderInputDataState.InputField[]{inputField, (i2 == -1 || i2 == 1 || i2 == 2) ? null : CryptoTaxLotOrderInputDataState.InputField.ASSET_AMOUNT});
        if (listListOfNotNull.isEmpty()) {
            return null;
        }
        return CollectionsKt.contains(listListOfNotNull, cryptoTaxLotOrderInputDataState.getFocusedInputField$feature_trade_crypto_externalDebug()) ? cryptoTaxLotOrderInputDataState.getFocusedInputField$feature_trade_crypto_externalDebug() : (CryptoTaxLotOrderInputDataState.InputField) CollectionsKt.first(listListOfNotNull);
    }
}
