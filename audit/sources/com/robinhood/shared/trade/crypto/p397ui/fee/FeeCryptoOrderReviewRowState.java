package com.robinhood.shared.trade.crypto.p397ui.fee;

import androidx.compose.p011ui.text.font.FontWeight;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.UiFeeEstimation;
import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.shared.crypto.p375ui.feeTiers.FormatFeeRate;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeeCryptoOrderReviewRowState.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000\u001a\b\u0010\n\u001a\u00020\u0001H\u0001\u001a:\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a0\u0010\u0014\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a\"\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001aJ\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#H\u0002\u001a\u0018\u0010$\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0017H\u0001¨\u0006&"}, m3636d2 = {"generateCryptoOrderReviewRowStateForFee", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "isRhcApp", "", "isReviewing", "includeBottomDivider", "orderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "monetizationModel", "Lcom/robinhood/models/api/fee/MonetizationModel;", "loadingFeeRowState", "rhcFeeEstimationRowState", "uiFeeEstimation", "Lcom/robinhood/models/crypto/ui/fee/UiFeeEstimation;", "displayFeeAmount", "", "orderType", "Lcom/robinhood/models/api/CryptoOrderType;", "inputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "feeEstimationRowState", "quoteFeeRowState", "quoteFee", "Ljava/math/BigDecimal;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "reviewRowState", "labelText", "Lcom/robinhood/utils/resource/StringResource;", "feeAmountText", "isFeeColored", "isFeeAmountBold", "trailingIcon", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$IconContent;", "tapAction", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "feeRowLabelText", "feeRatio", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.fee.FeeCryptoOrderReviewRowStateKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FeeCryptoOrderReviewRowState {

    /* compiled from: FeeCryptoOrderReviewRowState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.fee.FeeCryptoOrderReviewRowStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MonetizationModel.values().length];
            try {
                iArr[MonetizationModel.FEE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MonetizationModel.REBATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoOrderType.values().length];
            try {
                iArr2[CryptoOrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CryptoOrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CryptoOrderType.STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CryptoOrderType.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final CryptoOrderReviewRowState generateCryptoOrderReviewRowStateForFee(boolean z, boolean z2, boolean z3, CryptoOrderContext cryptoOrderContext, MonetizationModel monetizationModel) {
        if (cryptoOrderContext == null) {
            return loadingFeeRowState();
        }
        UiCurrencyPair currencyPair = cryptoOrderContext.getRequestContext().getCurrencyPair();
        BigDecimal quoteFee = currencyPair.getQuoteFee();
        UiFeeEstimation uiFeeEstimation = cryptoOrderContext.getUiFeeEstimation();
        String displayFeeAmount = cryptoOrderContext.getOrderInfo().getDisplayFeeAmount();
        CryptoInputMode inputMode = cryptoOrderContext.getRequestContext().getRequestInputs().getInputMode();
        int i = monetizationModel == null ? -1 : WhenMappings.$EnumSwitchMapping$0[monetizationModel.ordinal()];
        if (i == -1) {
            return loadingFeeRowState();
        }
        if (i == 1) {
            if (uiFeeEstimation == null || displayFeeAmount == null) {
                return loadingFeeRowState();
            }
            if (z) {
                return rhcFeeEstimationRowState(uiFeeEstimation, displayFeeAmount, cryptoOrderContext.getRequest().getType(), inputMode, z3, z2);
            }
            return feeEstimationRowState(uiFeeEstimation, displayFeeAmount, cryptoOrderContext.getRequest().getType(), inputMode, z3);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z && z2 && quoteFee != null) {
            return quoteFeeRowState(quoteFee, currencyPair, z3);
        }
        return null;
    }

    public static final CryptoOrderReviewRowState loadingFeeRowState() {
        StringResource.Companion companion = StringResource.INSTANCE;
        return new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion.invoke("----------"), null, null, null, null, null, true, 62, null), new CryptoOrderReviewRowState.TextContent(companion.invoke("----"), null, null, null, null, null, true, 62, null), null, null, null, false, null, false, null, null, 1020, null);
    }

    private static final CryptoOrderReviewRowState rhcFeeEstimationRowState(UiFeeEstimation uiFeeEstimation, String str, CryptoOrderType cryptoOrderType, CryptoInputMode cryptoInputMode, boolean z, boolean z2) {
        if (z2 || BigDecimals7.isPositive(uiFeeEstimation.getFeeRatio())) {
            return feeEstimationRowState(uiFeeEstimation, str, cryptoOrderType, cryptoInputMode, z);
        }
        return null;
    }

    private static final CryptoOrderReviewRowState feeEstimationRowState(UiFeeEstimation uiFeeEstimation, String str, CryptoOrderType cryptoOrderType, CryptoInputMode cryptoInputMode, boolean z) {
        boolean zIsZero = BigDecimals7.isZero(uiFeeEstimation.getFeeRatio());
        return reviewRowState(feeRowLabelText(cryptoOrderType, uiFeeEstimation.getFeeRatio()), StringResource.INSTANCE.invoke(str), zIsZero, (!zIsZero && cryptoOrderType == CryptoOrderType.MARKET && cryptoInputMode == CryptoInputMode.QUOTE_CURRENCY) ? false : true, z, !zIsZero ? new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), CryptoOrderReviewRowState.ColorOverride.FG_2) : null, zIsZero ? null : new CryptoOrderReviewRowState.TapAction.ShowFeeDefinitionBottomSheet(uiFeeEstimation));
    }

    private static final CryptoOrderReviewRowState quoteFeeRowState(BigDecimal bigDecimal, UiCurrencyPair uiCurrencyPair, boolean z) {
        Tuples2 tuples2ProcessAmount$default = CryptoInstrumentInputHelper.processAmount$default(new CryptoInstrumentInputHelper(uiCurrencyPair), bigDecimal, null, CryptoInputMode.QUOTE_CURRENCY, false, true, false, false, 106, null);
        String str = (String) tuples2ProcessAmount$default.component1();
        BigDecimal bigDecimal2 = (BigDecimal) tuples2ProcessAmount$default.component2();
        if (BigDecimals7.isPositive(bigDecimal2)) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        return reviewRowState$default(companion.invoke(C38572R.string.crypto_order_robinhood_fee_label, new Object[0]), companion.invoke(str), BigDecimals7.isZero(bigDecimal2), false, z, null, null, 104, null);
    }

    static /* synthetic */ CryptoOrderReviewRowState reviewRowState$default(StringResource stringResource, StringResource stringResource2, boolean z, boolean z2, boolean z3, CryptoOrderReviewRowState.IconContent iconContent, CryptoOrderReviewRowState.TapAction tapAction, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = z;
        }
        if ((i & 32) != 0) {
            iconContent = null;
        }
        if ((i & 64) != 0) {
            tapAction = null;
        }
        return reviewRowState(stringResource, stringResource2, z, z2, z3, iconContent, tapAction);
    }

    private static final CryptoOrderReviewRowState reviewRowState(StringResource stringResource, StringResource stringResource2, boolean z, boolean z2, boolean z3, CryptoOrderReviewRowState.IconContent iconContent, CryptoOrderReviewRowState.TapAction tapAction) {
        return new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(stringResource, null, iconContent, tapAction, z ? CryptoOrderReviewRowState.TextStyleOverride.TEXT_M_HIGHLIGHT_GRADIENT : null, z ? FontWeight.INSTANCE.getBold() : null, false, 66, null), new CryptoOrderReviewRowState.TextContent(stringResource2, z ? CryptoOrderReviewRowState.ColorOverride.DAY_PRIME : null, null, null, null, z2 ? FontWeight.INSTANCE.getBold() : null, false, 92, null), null, null, null, z3, null, false, null, null, 988, null);
    }

    public static final StringResource feeRowLabelText(CryptoOrderType orderType, BigDecimal feeRatio) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(feeRatio, "feeRatio");
        if (BigDecimals7.isZero(feeRatio)) {
            return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_fee_label, new Object[0]);
        }
        String feeRate = FormatFeeRate.formatFeeRate(feeRatio);
        int i = WhenMappings.$EnumSwitchMapping$1[orderType.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_fee_percentage_label, feeRate);
        }
        if (i == 2 || i == 3 || i == 4) {
            return StringResource.INSTANCE.invoke(C38572R.string.crypto_order_estimated_fee_percentage_label, feeRate);
        }
        throw new NoWhenBranchMatchedException();
    }
}
