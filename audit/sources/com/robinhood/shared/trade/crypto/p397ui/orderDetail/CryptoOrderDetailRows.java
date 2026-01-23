package com.robinhood.shared.trade.crypto.p397ui.orderDetail;

import android.content.res.Resources;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import cbc.service.p048v1.TermTypeDto;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.crypto.lib.UiCryptoOrders;
import com.robinhood.android.crypto.lib.UiCryptoOrdersFormatter;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.common.strings.C32428R;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.crypto.p314db.BookGainLoss;
import com.robinhood.models.crypto.p314db.CryptoOrderTaxLotOverview;
import com.robinhood.models.crypto.p314db.CryptoOrderTradeBonus;
import com.robinhood.models.crypto.p314db.fee.CryptoFee;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.history.details.OrderDetailViewState;
import com.robinhood.shared.crypto.p375ui.extensions.TermTypeDtos;
import com.robinhood.shared.crypto.p375ui.trade.confirmation.BaseCryptoConfirmationState2;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.orderDetail.CryptoOrderDetailTapAction;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import contracts.crypto.trade.proto.p431v1.TokenizationFxFeeDto;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoOrderDetailRows.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\u001a\u001c\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u001f"}, m3636d2 = {"accountNameDataRowContent", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DataRowContent;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDataState;", "resources", "Landroid/content/res/Resources;", "linkedAppDataRowContent", "stateDataRowContent", "dateSubmittedDataRowContent", "timeInForceDataRowContent", "limitPriceDataRowContent", "tokenizedLimitPriceDataRowContent", "stopPriceDataRowContent", "amountDataRowContent", "quantityEnteredDataRowContent", "estimatedPriceDataRowContent", "dateFilledDataRowContent", "dateCanceledDataRowContent", "amountFilledDataRowContent", "amountCanceledDataRowContent", "assetTradeBonusDataRowContent", "fxRateDataRowContent", "fxFeeDataRowContent", "filledNotionalValueDataRowContent", "filledOrEstimatedNotionalValueDataRowContent", "quoteTradeBonusDataRowContent", "estimatedTotalCostCreditDataRowContent", "feeDataRowContent", "lotsFilledOrSelectedContent", "estimatedOrRealizedGainOrLossContent", "realizedGainLoss", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailRowsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoOrderDetailRows {

    /* compiled from: CryptoOrderDetailRows.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailRowsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
            int[] iArr2 = new int[OrderSide.values().length];
            try {
                iArr2[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OrderState.values().length];
            try {
                iArr3[OrderState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[OrderState.UNCONFIRMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[OrderState.CONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[OrderState.TRIGGERED.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[OrderState.QUEUED.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[OrderState.CANCELED.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> accountNameDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (!cryptoOrderDetailDataState.isCryptoMibExperimentEnabled()) {
            return null;
        }
        String string2 = resources.getString(C40095R.string.crypto_order_detail_account_name_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int i = 2;
        AnnotatedString annotatedString = new AnnotatedString(string2, null, 2, null);
        OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> dataRowContent = new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString("************", null, 2, null), null, null, null, null, false, true, 2013, null), defaultConstructorMarker, i, defaultConstructorMarker);
        Account account = cryptoOrderDetailDataState.getAccount();
        if (account != null) {
            String string3 = AccountDisplayNames.getDisplayNameWithoutNickname(account).getShort().getTitle().getText(resources).toString();
            String nickname = account.getNickname();
            if (nickname == null || !account.getHasNickname()) {
                nickname = null;
            }
            if (nickname != null) {
                Color colorM25902getFg2QN2ZGVo$feature_trade_crypto_externalDebug = cryptoOrderDetailDataState.m25902getFg2QN2ZGVo$feature_trade_crypto_externalDebug();
                if (colorM25902getFg2QN2ZGVo$feature_trade_crypto_externalDebug != null) {
                    long value = colorM25902getFg2QN2ZGVo$feature_trade_crypto_externalDebug.getValue();
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    builder.append(nickname);
                    int iPushStyle = builder.pushStyle(new SpanStyle(value, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(" · ");
                        builder.append(string3);
                        Unit unit = Unit.INSTANCE;
                        builder.pop(iPushStyle);
                        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, annotatedString, null, null, null, builder.toAnnotatedString(), null, null, null, null, false, false, 4061, null), defaultConstructorMarker, i, defaultConstructorMarker);
                    } catch (Throwable th) {
                        builder.pop(iPushStyle);
                        throw th;
                    }
                }
            } else {
                return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString(string3, null, 2, null), null, null, null, null, false, false, 4061, null), defaultConstructorMarker, i, defaultConstructorMarker);
            }
        }
        return dataRowContent;
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> linkedAppDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        String displayValue;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null || (displayValue = UiCryptoOrders.toDisplayValue(cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getInitiatorType(), resources)) == null) {
            return null;
        }
        String string2 = resources.getString(C40095R.string.crypto_order_detail_linked_app_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, new AnnotatedString(string2, null, 2, null), null, null, null, new AnnotatedString(displayValue, null, 2, null), null, null, null, null, false, false, 4061, null), defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> stateDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        AnnotatedString annotatedString;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null) {
            return OrderDetailViewState.DataRowContent.INSTANCE.generateLoadingDataRow();
        }
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getState() == OrderState.PARTIALLY_FILLED_REST_CANCELLED && cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getType() == CryptoOrderType.MARKET) {
            String string2 = resources.getString(C32428R.string.order_state_partially_filled_remainder_canceled);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            annotatedString = new AnnotatedString(string2, null, 2, null);
        } else {
            annotatedString = new AnnotatedString(UiCryptoOrders.getStateText(cryptoOrderDetailDataState.getUiCryptoOrder(), resources).toString(), null, 2, null);
        }
        AnnotatedString annotatedString2 = annotatedString;
        String string3 = resources.getString(C40095R.string.crypto_order_detail_state_label);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, new AnnotatedString(string3, null, 2, null), null, null, null, annotatedString2, null, null, null, null, false, false, 4061, null), defaultConstructorMarker, i, defaultConstructorMarker);
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> dateSubmittedDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        UiCryptoOrdersFormatter cryptoOrderFormatter$feature_trade_crypto_externalDebug = cryptoOrderDetailDataState.getCryptoOrderFormatter$feature_trade_crypto_externalDebug();
        if (cryptoOrderFormatter$feature_trade_crypto_externalDebug == null) {
            return OrderDetailViewState.DataRowContent.INSTANCE.generateLoadingDataRow();
        }
        String string2 = resources.getString(C40095R.string.crypto_order_detail_date_submitted_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, new AnnotatedString(string2, null, 2, null), null, null, null, new AnnotatedString(cryptoOrderFormatter$feature_trade_crypto_externalDebug.getSubmittedTextWithTime().toString(), null, 2, null), null, null, null, null, false, false, 4061, null), defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> timeInForceDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        CharSequence timeInForceText;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        UiCryptoOrdersFormatter cryptoOrderFormatter$feature_trade_crypto_externalDebug = cryptoOrderDetailDataState.getCryptoOrderFormatter$feature_trade_crypto_externalDebug();
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (cryptoOrderFormatter$feature_trade_crypto_externalDebug == null || (timeInForceText = cryptoOrderFormatter$feature_trade_crypto_externalDebug.getTimeInForceText(resources)) == null) {
            return null;
        }
        String string2 = resources.getString(C40095R.string.crypto_order_detail_time_in_force_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, new AnnotatedString(string2, null, 2, null), null, null, null, new AnnotatedString(timeInForceText.toString(), null, 2, null), null, null, null, null, false, false, 4061, null), defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> limitPriceDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null) {
            return null;
        }
        if (cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getType() != CryptoOrderType.LIMIT && cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getType() != CryptoOrderType.STOP_LIMIT) {
            return null;
        }
        String string2 = resources.getString(C40095R.string.crypto_order_detail_limit_price_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, new AnnotatedString(string2, null, 2, null), null, null, null, new AnnotatedString(UiCryptoOrders.getPriceText(cryptoOrderDetailDataState.getUiCryptoOrder()).toString(), null, 2, null), null, null, null, null, false, false, 4061, null), defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> tokenizedLimitPriceDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        BigDecimal equityInstrumentQuotePrice;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null || cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getType() != CryptoOrderType.LIMIT || (equityInstrumentQuotePrice = cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getEquityInstrumentQuotePrice()) == null) {
            return null;
        }
        String string2 = resources.getString(C40095R.string.crypto_order_detail_limit_price_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, new AnnotatedString(string2, null, 2, null), null, null, null, new AnnotatedString(Money.format$default(Money3.toMoney(equityInstrumentQuotePrice, Currencies.USD), CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale(), false, null, true, 0, null, true, null, false, false, 950, null), null, 2, null), null, null, null, null, false, false, 4061, null), defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> stopPriceDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getType().ordinal()];
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                String string2 = resources.getString(C40095R.string.crypto_order_detail_stop_price_label);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, new AnnotatedString(string2, null, 2, null), null, null, null, new AnnotatedString(UiCryptoOrders.getStopPriceText(cryptoOrderDetailDataState.getUiCryptoOrder()).toString(), null, 2, null), null, null, null, null, false, false, 4061, null), defaultConstructorMarker, i2, defaultConstructorMarker);
            }
        }
        return null;
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> amountDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null || cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getState() == OrderState.FILLED) {
            return null;
        }
        if (cryptoOrderDetailDataState.getUiCryptoOrder().getExecutions().isEmpty()) {
            i = C40095R.string.crypto_order_detail_estimated_amount_label;
        } else {
            i = C40095R.string.crypto_order_detail_amount_entered_label;
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, new AnnotatedString(string2, null, 2, null), null, null, null, new AnnotatedString(UiCryptoOrders.getEnteredAmountAsAssetText$default(cryptoOrderDetailDataState.getUiCryptoOrder(), false, 1, null), null, 2, null), null, null, null, null, false, false, 4061, null), defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> quantityEnteredDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null || cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getState() == OrderState.FILLED) {
            return null;
        }
        if (cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getType() == CryptoOrderType.LIMIT) {
            i = C40095R.string.crypto_order_detail_estimated_amount_label;
        } else {
            i = C40095R.string.crypto_order_detail_quantity_entered_label;
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, new AnnotatedString(string2, null, 2, null), null, null, null, new AnnotatedString(UiCryptoOrders.getEnteredAmountAsAssetText(cryptoOrderDetailDataState.getUiCryptoOrder(), false) + " " + ((Object) UiCryptoOrders.getSymbolWithType(cryptoOrderDetailDataState.getUiCryptoOrder()).getText(resources)), null, 2, null), null, null, null, null, false, false, 4061, null), defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> estimatedPriceDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null || !cryptoOrderDetailDataState.getUiCryptoOrder().getExecutions().isEmpty() || cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getType() == CryptoOrderType.LIMIT) {
            return null;
        }
        String string2 = resources.getString(C40095R.string.crypto_order_detail_estimated_price_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, new AnnotatedString(string2, null, 2, null), null, null, null, new AnnotatedString(CurrencyDefinitions.formatCurrency$default(cryptoOrderDetailDataState.getUiCryptoOrder().getQuoteCurrencyForPrice(), cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getDisplayPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null), null, 2, null), null, null, null, null, false, false, 4061, null), defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> dateFilledDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        UiCryptoOrdersFormatter cryptoOrderFormatter$feature_trade_crypto_externalDebug;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null || (cryptoOrderFormatter$feature_trade_crypto_externalDebug = cryptoOrderDetailDataState.getCryptoOrderFormatter$feature_trade_crypto_externalDebug()) == null || cryptoOrderDetailDataState.getUiCryptoOrder().getExecutions().isEmpty()) {
            return null;
        }
        String string2 = resources.getString(C40095R.string.crypto_order_detail_date_filled_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, new AnnotatedString(string2, null, 2, null), null, null, null, new AnnotatedString(cryptoOrderFormatter$feature_trade_crypto_externalDebug.getFilledDateText(resources).toString(), null, 2, null), null, null, null, null, false, false, 4061, null), defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> dateCanceledDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        UiCryptoOrdersFormatter cryptoOrderFormatter$feature_trade_crypto_externalDebug;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null || (cryptoOrderFormatter$feature_trade_crypto_externalDebug = cryptoOrderDetailDataState.getCryptoOrderFormatter$feature_trade_crypto_externalDebug()) == null || cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getState() != OrderState.PARTIALLY_FILLED_REST_CANCELLED || cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getType() != CryptoOrderType.MARKET) {
            return null;
        }
        String string2 = resources.getString(C40095R.string.crypto_order_detail_date_canceled_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, new AnnotatedString(string2, null, 2, null), null, null, null, new AnnotatedString(cryptoOrderFormatter$feature_trade_crypto_externalDebug.getCanceledDateText(resources).toString(), null, 2, null), null, null, null, null, false, false, 4061, null), defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> amountFilledDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null || cryptoOrderDetailDataState.getUiCryptoOrder().getExecutions().isEmpty()) {
            return null;
        }
        String string2 = resources.getString(C40095R.string.crypto_order_detail_amount_filled_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, new AnnotatedString(string2, null, 2, null), null, null, null, new AnnotatedString(UiCryptoOrders.getFilledQuantityText(cryptoOrderDetailDataState.getUiCryptoOrder(), resources).toString(), null, 2, null), null, null, null, null, false, false, 4061, null), defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> amountCanceledDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null || cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getState() != OrderState.PARTIALLY_FILLED_REST_CANCELLED || cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getType() != CryptoOrderType.MARKET || cryptoOrderDetailDataState.getUiCryptoOrder().getCanceledQuantity() == null) {
            return null;
        }
        String string2 = resources.getString(C40095R.string.crypto_order_detail_amount_canceled_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, new AnnotatedString(string2, null, 2, null), null, null, null, new AnnotatedString(UiCryptoOrders.getCanceledQuantityText(cryptoOrderDetailDataState.getUiCryptoOrder(), resources).toString(), null, 2, null), null, null, null, null, false, false, 4061, null), defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> assetTradeBonusDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        CryptoOrderTradeBonus assetTradeBonus;
        String currency$default;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null || (assetTradeBonus = cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getAssetTradeBonus()) == null || !cryptoOrderDetailDataState.isTradeBonusEnabled() || BigDecimals7.isZero(cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getCumulativeQuantity())) {
            return null;
        }
        String string2 = resources.getString(C40095R.string.crypto_order_detail_bonus_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        AnnotatedString annotatedString = new AnnotatedString(string2, null, 2, null);
        BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_FILLED_16);
        if (assetTradeBonus.isEstimate()) {
            currency$default = resources.getString(C40095R.string.crypto_order_detail_bonus_pending_label);
        } else {
            currency$default = CurrencyDefinitions.formatCurrency$default(cryptoOrderDetailDataState.getUiCryptoOrder().getAssetCurrency(), assetTradeBonus.getBonusAmount(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
        }
        Intrinsics.checkNotNull(currency$default);
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, annotatedString, null, size16, null, new AnnotatedString(currency$default, null, 2, null), null, null, null, null, false, false, 4053, null), new CryptoOrderDetailTapAction.ShowTradeBonusBottomSheet(cryptoOrderDetailDataState.getUiCryptoOrder(), assetTradeBonus.isEstimate()));
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> fxRateDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        BigDecimal averageFxRate;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null || (averageFxRate = cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getAverageFxRate()) == null) {
            return null;
        }
        String string2 = resources.getString(C40095R.string.crypto_order_detail_fx_rate_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        AnnotatedString annotatedString = new AnnotatedString(string2, null, 2, null);
        String string3 = resources.getString(C40095R.string.crypto_order_detail_fx_rate_value, averageFxRate.setScale(4, RoundingMode.HALF_DOWN), cryptoOrderDetailDataState.getUiCryptoOrder().getQuoteCurrency().getCode());
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString(string3, null, 2, null), null, null, null, null, false, false, 4061, null), defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> fxFeeDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        CryptoFee.FixedRateFee.FixedRateFeeData fxFee;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null) {
            return null;
        }
        if ((!cryptoOrderDetailDataState.getUiCryptoOrder().getIsPending() && cryptoOrderDetailDataState.getUiCryptoOrder().getExecutions().isEmpty()) || (fxFee = cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getFxFee()) == null) {
            return null;
        }
        String string2 = resources.getString(C40095R.string.crypto_order_detail_fx_fee_label, FormatsLocalized.getHundredthPercentFormat().format(fxFee.getFeeRatio()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        BentoDataRowState bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(string2, null, 2, null), null, new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), null, new AnnotatedString(UiCryptoOrders.getFxFeeAmount(cryptoOrderDetailDataState.getUiCryptoOrder()), null, 2, null), null, null, null, null, false, false, 4053, null);
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        IdlDecimal idlDecimal = IdlDecimal2.toIdlDecimal(ZERO);
        CryptoFee.FixedRateFee.FixedRateFeeData fxFee2 = cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getFxFee();
        if (fxFee2 != null) {
            return new OrderDetailViewState.DataRowContent<>(bentoDataRowState, new CryptoOrderDetailTapAction.ShowFxFeeBottomSheet(new TokenizationFxFeeDto(idlDecimal, IdlDecimal2.toIdlDecimal(fxFee2.getFeeRatio()), "", "", TokenizationFxFeeDto.TouchPointDto.ORDER_HISTORY_DETAILS, null, 32, null)));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> filledNotionalValueDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null || cryptoOrderDetailDataState.getUiCryptoOrder().getExecutions().isEmpty()) {
            return null;
        }
        String string2 = resources.getString(C40095R.string.crypto_order_detail_filled_notional_value_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, new AnnotatedString(string2, null, 2, null), null, null, null, new AnnotatedString(UiCryptoOrders.getTotalNotionalText(cryptoOrderDetailDataState.getUiCryptoOrder()), null, 2, null), null, null, null, null, false, false, 4061, null), defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> filledOrEstimatedNotionalValueDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        int i;
        String totalNotionalText;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null) {
            return OrderDetailViewState.DataRowContent.INSTANCE.generateLoadingDataRow();
        }
        CryptoOrderDetailTapAction.ShowNotionalPriceBottomSheet showNotionalPriceBottomSheet = (cryptoOrderDetailDataState.getAppType$feature_trade_crypto_externalDebug() != AppType.TRADER || (!cryptoOrderDetailDataState.getUiCryptoOrder().isFilledOutsideOfEnteredPrice() && (cryptoOrderDetailDataState.isRecurringVTExperimentEnabled() || !cryptoOrderDetailDataState.getUiCryptoOrder().isRecurringOrderFilledInsideOfEnteredPrice()))) ? null : new CryptoOrderDetailTapAction.ShowNotionalPriceBottomSheet(cryptoOrderDetailDataState.getUiCryptoOrder());
        if (cryptoOrderDetailDataState.getUiCryptoOrder().getExecutions().isEmpty()) {
            i = C40095R.string.crypto_order_detail_estimated_notional_value_label;
        } else {
            i = C40095R.string.crypto_order_detail_filled_notional_value_label;
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        AnnotatedString annotatedString = new AnnotatedString(string2, null, 2, null);
        BentoIcon4.Size16 size16 = showNotionalPriceBottomSheet != null ? new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16) : null;
        if (cryptoOrderDetailDataState.getUiCryptoOrder().getExecutions().isEmpty()) {
            totalNotionalText = UiCryptoOrders.getEnteredAmountAsQuoteText(cryptoOrderDetailDataState.getUiCryptoOrder());
        } else {
            totalNotionalText = UiCryptoOrders.getTotalNotionalText(cryptoOrderDetailDataState.getUiCryptoOrder());
        }
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, annotatedString, null, size16, null, new AnnotatedString(totalNotionalText, null, 2, null), null, null, null, null, false, false, 4053, null), showNotionalPriceBottomSheet);
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> quoteTradeBonusDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        CryptoOrderTradeBonus quoteTradeBonus;
        String currency$default;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null || (quoteTradeBonus = cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getQuoteTradeBonus()) == null || !cryptoOrderDetailDataState.isTradeBonusEnabled() || BigDecimals7.isZero(cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getCumulativeQuantity())) {
            return null;
        }
        String string2 = resources.getString(C40095R.string.crypto_order_detail_bonus_label);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        AnnotatedString annotatedString = new AnnotatedString(string2, null, 2, null);
        BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_FILLED_16);
        if (quoteTradeBonus.isEstimate()) {
            currency$default = resources.getString(C40095R.string.crypto_order_detail_bonus_pending_label);
        } else {
            currency$default = CurrencyDefinitions.formatCurrency$default(cryptoOrderDetailDataState.getUiCryptoOrder().getQuoteCurrency(), quoteTradeBonus.getBonusAmount(), false, false, null, 0, null, null, false, false, false, false, 2046, null);
        }
        Intrinsics.checkNotNull(currency$default);
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, annotatedString, null, size16, null, new AnnotatedString(currency$default, null, 2, null), null, null, null, null, false, false, 4053, null), new CryptoOrderDetailTapAction.ShowTradeBonusBottomSheet(cryptoOrderDetailDataState.getUiCryptoOrder(), quoteTradeBonus.isEstimate()));
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> estimatedTotalCostCreditDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        Object showEstimatedTotalValueBottomSheet;
        int i;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null) {
            return OrderDetailViewState.DataRowContent.INSTANCE.generateLoadingDataRow();
        }
        boolean z = cryptoOrderDetailDataState.getAppType$feature_trade_crypto_externalDebug() == AppType.TRADER && cryptoOrderDetailDataState.isRecurringVTExperimentEnabled() && cryptoOrderDetailDataState.getUiCryptoOrder().isRecurringOrderFilledInsideOfEnteredPrice();
        if (cryptoOrderDetailDataState.getUiCryptoOrder().getExecutions().isEmpty() && cryptoOrderDetailDataState.getUiCryptoOrder().getCurrencyPair().isTokenizedStock()) {
            showEstimatedTotalValueBottomSheet = new CryptoOrderDetailTapAction.ShowEstimatedTotalValueBottomSheet(BaseCryptoConfirmationState2.estimatedTotalCostDto(cryptoOrderDetailDataState.getUiCryptoOrder(), resources));
        } else {
            showEstimatedTotalValueBottomSheet = z ? CryptoOrderDetailTapAction.ShowRecurringCollarExplanationBottomSheet.INSTANCE : null;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getSide().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (cryptoOrderDetailDataState.getUiCryptoOrder().getExecutions().isEmpty()) {
                if (cryptoOrderDetailDataState.getUiCryptoOrder().getCurrencyPair().isTokenizedStock()) {
                    i = C40095R.string.crypto_order_detail_estimated_total_credit_label;
                } else {
                    i = C40095R.string.crypto_order_detail_estimated_credit_label;
                }
            } else {
                i = C40095R.string.crypto_order_detail_total_credit_label;
            }
        } else if (cryptoOrderDetailDataState.getUiCryptoOrder().getExecutions().isEmpty()) {
            if (cryptoOrderDetailDataState.getUiCryptoOrder().getCurrencyPair().isTokenizedStock()) {
                i = C40095R.string.crypto_order_detail_estimated_total_cost_label;
            } else {
                i = C40095R.string.crypto_order_detail_estimated_cost_label;
            }
        } else {
            i = C40095R.string.crypto_order_detail_total_cost_label;
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, new AnnotatedString(string2, null, 2, null), null, ((cryptoOrderDetailDataState.getUiCryptoOrder().getExecutions().isEmpty() && cryptoOrderDetailDataState.getUiCryptoOrder().getCurrencyPair().isTokenizedStock()) || z) ? new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16) : null, null, new AnnotatedString(UiCryptoOrders.getTotalText(cryptoOrderDetailDataState.getUiCryptoOrder()), null, 2, null), null, null, null, null, false, false, 4053, null), showEstimatedTotalValueBottomSheet);
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> feeDataRowContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        CryptoFee cryptoFee;
        BigDecimal feeAmount;
        int i;
        Object showFeeDefinitionBottomSheet;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null || (cryptoFee = UiCryptoOrders.getCryptoFee(cryptoOrderDetailDataState.getUiCryptoOrder())) == null) {
            return null;
        }
        if (cryptoFee instanceof CryptoFee.FixedRateFee) {
            feeAmount = ((CryptoFee.FixedRateFee) cryptoFee).getFeeData().getFeeAmount();
        } else {
            if (!(cryptoFee instanceof CryptoFee.VolumeTieredFee)) {
                if (cryptoFee instanceof CryptoFee.Unspecified) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            feeAmount = ((CryptoFee.VolumeTieredFee) cryptoFee).getFeeData().getFeeAmount();
        }
        boolean zIsZero = BigDecimals7.isZero(feeAmount);
        if (!zIsZero) {
            switch (WhenMappings.$EnumSwitchMapping$2[cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getState().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    i = C40095R.string.crypto_order_detail_estimated_fee_label;
                    break;
                default:
                    i = C40095R.string.crypto_order_detail_fee_label;
                    break;
            }
        } else {
            i = C40095R.string.crypto_order_detail_fee_label;
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        BentoDataRowState bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(string2, null, 2, null), null, !zIsZero ? new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16) : null, null, new AnnotatedString(UiCryptoOrders.feeAmountText(cryptoOrderDetailDataState.getUiCryptoOrder(), feeAmount), null, 2, null), null, null, null, null, false, false, 4053, null);
        if (!zIsZero) {
            showFeeDefinitionBottomSheet = new CryptoOrderDetailTapAction.ShowFeeDefinitionBottomSheet(cryptoOrderDetailDataState.getUiCryptoOrder());
        } else {
            showFeeDefinitionBottomSheet = CryptoOrderDetailTapAction.None.INSTANCE;
        }
        return new OrderDetailViewState.DataRowContent<>(bentoDataRowState, showFeeDefinitionBottomSheet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        r5.add(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> lotsFilledOrSelectedContent(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        CryptoOrderTaxLotOverview taxLotsOverview;
        int i;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null || (taxLotsOverview = cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getTaxLotsOverview()) == null) {
            return null;
        }
        ImmutableList<CryptoOrderTaxLotOverview.LotOverview> lotOverviews = taxLotsOverview.getLotOverviews();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lotOverviews, 10));
        for (CryptoOrderTaxLotOverview.LotOverview lotOverview : lotOverviews) {
            Iterator<TermTypeDto> it = TermTypeDto.getEntries().iterator();
            while (it.hasNext()) {
                TermTypeDto next = it.next();
                if (Intrinsics.areEqual(next.getJson_value(), lotOverview.getTermType())) {
                    break;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (taxLotsOverview.isConfirmed()) {
            i = C40095R.string.crypto_order_detail_lots_filled_label;
        } else {
            i = C40095R.string.crypto_order_detail_lots_selected_label;
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new OrderDetailViewState.DataRowContent<>(new BentoDataRowState(null, new AnnotatedString(string2, null, 2, null), null, null, null, new AnnotatedString(TermTypeDtos.getTermsLabel(arrayList).getText(resources).toString(), null, 2, null), null, null, new BentoIcon4.Size12(ServerToBentoAssetMapper2.CARET_RIGHT_12), null, false, false, 3805, null), new CryptoOrderDetailTapAction.ShowLotDetailsScreen(cryptoOrderDetailDataState.getUiCryptoOrder()));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final com.robinhood.shared.crypto.history.details.OrderDetailViewState.DataRowContent<com.robinhood.shared.trade.crypto.p397ui.orderDetail.CryptoOrderDetailTapAction> estimatedOrRealizedGainOrLossContent(com.robinhood.shared.trade.crypto.p397ui.orderDetail.CryptoOrderDetailDataState r22, android.content.res.Resources r23) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.trade.crypto.p397ui.orderDetail.CryptoOrderDetailRows.estimatedOrRealizedGainOrLossContent(com.robinhood.shared.trade.crypto.ui.orderDetail.CryptoOrderDetailDataState, android.content.res.Resources):com.robinhood.shared.crypto.history.details.OrderDetailViewState$DataRowContent");
    }

    public static final OrderDetailViewState.DataRowContent<CryptoOrderDetailTapAction> realizedGainLoss(CryptoOrderDetailDataState cryptoOrderDetailDataState, Resources resources) throws Resources.NotFoundException {
        BookGainLoss bookGainLoss;
        int i;
        String currency$default;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailDataState, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        CryptoOrderDetailTapAction.ShowPnlTradeDetailsBottomSheet showPnlTradeDetailsBottomSheet = null;
        if (cryptoOrderDetailDataState.getUiCryptoOrder() == null || !cryptoOrderDetailDataState.isCryptoPnlHubEnabled() || (bookGainLoss = cryptoOrderDetailDataState.getUiCryptoOrder().getCryptoOrder().getBookGainLoss()) == null) {
            return null;
        }
        if (bookGainLoss.getGainLossAmount() == null) {
            i = C40095R.string.crypto_order_details_realized_profit_and_loss;
        } else if (BigDecimals7.isNegative(bookGainLoss.getGainLossAmount())) {
            if (bookGainLoss.getExcludesTransfers()) {
                i = C40095R.string.crypto_order_details_realized_loss_excludes_transfers;
            } else {
                i = C40095R.string.crypto_order_details_realized_loss;
            }
        } else if (bookGainLoss.getExcludesTransfers()) {
            i = C40095R.string.crypto_order_details_realized_profit_excludes_transfers;
        } else {
            i = C40095R.string.crypto_order_details_realized_profit;
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        AnnotatedString annotatedString = new AnnotatedString(string2, null, 2, null);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
        try {
            BigDecimal gainLossAmount = bookGainLoss.getGainLossAmount();
            if (gainLossAmount == null) {
                currency$default = resources.getString(C40095R.string.crypto_order_details_realized_profit_and_loss_unavailable_text);
            } else {
                currency$default = CurrencyDefinitions.formatCurrency$default(cryptoOrderDetailDataState.getUiCryptoOrder().getQuoteCurrency(), gainLossAmount, false, false, null, 0, null, Boolean.TRUE, true, true, false, false, 1598, null);
            }
            Intrinsics.checkNotNull(currency$default);
            builder.append(currency$default);
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            BentoDataRowState bentoDataRowState = new BentoDataRowState(null, annotatedString, null, null, null, builder.toAnnotatedString(), null, null, new BentoIcon4.Size12(ServerToBentoAssetMapper2.CARET_RIGHT_12), null, false, false, 3805, null);
            ProfitAndLossTradeItem profitAndLossTradeItem = cryptoOrderDetailDataState.getProfitAndLossTradeItem();
            if (profitAndLossTradeItem != null) {
                boolean zIsPnlUpdatesEnabled = cryptoOrderDetailDataState.isPnlUpdatesEnabled();
                String accountNumber = cryptoOrderDetailDataState.getAccountNumber();
                if (accountNumber == null) {
                    accountNumber = "";
                }
                showPnlTradeDetailsBottomSheet = new CryptoOrderDetailTapAction.ShowPnlTradeDetailsBottomSheet(profitAndLossTradeItem, zIsPnlUpdatesEnabled, accountNumber);
            }
            return new OrderDetailViewState.DataRowContent<>(bentoDataRowState, showPnlTradeDetailsBottomSheet);
        } catch (Throwable th) {
            builder.pop(iPushStyle);
            throw th;
        }
    }
}
