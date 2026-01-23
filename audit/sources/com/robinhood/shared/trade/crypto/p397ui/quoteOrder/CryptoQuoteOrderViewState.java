package com.robinhood.shared.trade.crypto.p397ui.quoteOrder;

import androidx.compose.p011ui.text.font.FontWeight;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.g11n.Locales2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCryptoTradeBonusEligibility;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p355ui.ServerDrivenAlert;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.rosetta.converters.orders.Orders2;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoQuickTradeButtonContext;
import com.robinhood.shared.common.lib.formats.currency.InputAmount;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpadState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.crypto.utils.UiCurrencyPairs2;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.extensions.CryptoOrderContexts;
import com.robinhood.shared.trade.crypto.p397ui.fee.FeeCryptoOrderReviewRowState;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.views.CryptoQuoteOrderRecurringHookChipState;
import com.robinhood.shared.trade.crypto.p397ui.tooltip.CryptoOrderTooltipData;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderUiEvent;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import com.singular.sdk.internal.Constants;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
import contracts.crypto.trade.proto.p431v1.CalculateCryptoMarketOrderPillsResponseDto;
import idl.recurring.proto.p474v1.GetScheduleConfigResponseDto;
import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.LocalDate;
import rosetta.order.Side;

/* compiled from: CryptoQuoteOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bT\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 Ê\u00012\u00020\u0001:\bË\u0001Ì\u0001Í\u0001Ê\u0001B\u0081\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001b\u001a\u00020\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001e\u001a\u00020\f\u0012\b\b\u0002\u0010\u001f\u001a\u00020\f\u0012\b\b\u0002\u0010 \u001a\u00020\f\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010&\u001a\u00020\f\u0012\b\b\u0002\u0010'\u001a\u00020\f¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\fHÂ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\fHÂ\u0003¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010\u0015HÂ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0017HÂ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010$HÂ\u0003¢\u0006\u0004\b1\u00102J)\u0010:\u001a\u000608j\u0002`92\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\f¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bF\u0010+J\u0012\u0010G\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0010\u0010L\u001a\u00020\fHÀ\u0003¢\u0006\u0004\bK\u0010+J\u0012\u0010O\u001a\u0004\u0018\u00010\u0019HÀ\u0003¢\u0006\u0004\bM\u0010NJ\u0010\u0010Q\u001a\u00020\fHÀ\u0003¢\u0006\u0004\bP\u0010+J\u0012\u0010T\u001a\u0004\u0018\u00010\u001cHÀ\u0003¢\u0006\u0004\bR\u0010SJ\u0010\u0010V\u001a\u00020\fHÀ\u0003¢\u0006\u0004\bU\u0010+J\u0010\u0010X\u001a\u00020\fHÀ\u0003¢\u0006\u0004\bW\u0010+J\u0010\u0010Z\u001a\u00020\fHÀ\u0003¢\u0006\u0004\bY\u0010+J\u0016\u0010]\u001a\b\u0012\u0004\u0012\u00020\"0!HÀ\u0003¢\u0006\u0004\b[\u0010\\J\u0010\u0010_\u001a\u00020\fHÀ\u0003¢\u0006\u0004\b^\u0010+J\u0010\u0010a\u001a\u00020\fHÀ\u0003¢\u0006\u0004\b`\u0010+J\u0092\u0002\u0010b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\f2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010&\u001a\u00020\f2\b\b\u0002\u0010'\u001a\u00020\fHÆ\u0001¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u000205HÖ\u0001¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u000203HÖ\u0001¢\u0006\u0004\bf\u0010gJ\u001a\u0010i\u001a\u00020\f2\b\u0010h\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bi\u0010jR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010k\u001a\u0004\bl\u0010=R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010m\u001a\u0004\bn\u0010?R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010o\u001a\u0004\bp\u0010AR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010q\u001a\u0004\br\u0010CR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010s\u001a\u0004\bt\u0010ER\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010u\u001a\u0004\b\r\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010v\u001a\u0004\bw\u0010HR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010x\u001a\u0004\by\u0010JR\u001a\u0010\u0012\u001a\u00020\f8AX\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010u\u001a\u0004\bz\u0010+R\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010uR\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010uR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010{R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010|R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198AX\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010}\u001a\u0004\b~\u0010NR\u001a\u0010\u001b\u001a\u00020\f8AX\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010u\u001a\u0004\b\u007f\u0010+R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010SR\u001b\u0010\u001e\u001a\u00020\f8AX\u0080\u0004¢\u0006\r\n\u0004\b\u001e\u0010u\u001a\u0005\b\u0082\u0001\u0010+R\u001b\u0010\u001f\u001a\u00020\f8AX\u0080\u0004¢\u0006\r\n\u0004\b\u001f\u0010u\u001a\u0005\b\u0083\u0001\u0010+R\u001b\u0010 \u001a\u00020\f8AX\u0080\u0004¢\u0006\r\n\u0004\b \u0010u\u001a\u0005\b\u0084\u0001\u0010+R\"\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8AX\u0080\u0004¢\u0006\u000e\n\u0005\b#\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010\\R\u0017\u0010%\u001a\u0004\u0018\u00010$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010\u0087\u0001R\u001b\u0010&\u001a\u00020\f8AX\u0080\u0004¢\u0006\r\n\u0004\b&\u0010u\u001a\u0005\b\u0088\u0001\u0010+R\u001b\u0010'\u001a\u00020\f8AX\u0080\u0004¢\u0006\r\n\u0004\b'\u0010u\u001a\u0005\b\u0089\u0001\u0010+R\u001e\u0010\u008d\u0001\u001a\u00020\f8@X\u0081\u0004¢\u0006\u000f\u0012\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0005\b\u008a\u0001\u0010+R\"\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008e\u00018@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b\u0091\u0001\u0010\u008c\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\"\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u008e\u00018@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b\u0094\u0001\u0010\u008c\u0001\u001a\u0006\b\u0093\u0001\u0010\u0090\u0001R\"\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u008e\u00018@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b\u0097\u0001\u0010\u008c\u0001\u001a\u0006\b\u0096\u0001\u0010\u0090\u0001R\"\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u008e\u00018@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b\u009a\u0001\u0010\u008c\u0001\u001a\u0006\b\u0099\u0001\u0010\u0090\u0001R\"\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u008e\u00018@X\u0081\u0004¢\u0006\u0010\u0012\u0006\b\u009d\u0001\u0010\u008c\u0001\u001a\u0006\b\u009c\u0001\u0010\u0090\u0001R\u0017\u0010¢\u0001\u001a\u0005\u0018\u00010\u009f\u00018F¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0013\u0010£\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010+R\u0013\u0010¥\u0001\u001a\u0002058F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010eR\u001a\u0010©\u0001\u001a\u0005\u0018\u00010¦\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0015\u0010\u00ad\u0001\u001a\u00030ª\u00018F¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R\u0017\u0010¯\u0001\u001a\u0005\u0018\u00010ª\u00018F¢\u0006\b\u001a\u0006\b®\u0001\u0010¬\u0001R\u0017\u0010±\u0001\u001a\u0005\u0018\u00010ª\u00018F¢\u0006\b\u001a\u0006\b°\u0001\u0010¬\u0001R\u0017\u0010³\u0001\u001a\u0005\u0018\u00010ª\u00018F¢\u0006\b\u001a\u0006\b²\u0001\u0010¬\u0001R\u001a\u0010µ\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010!8F¢\u0006\u0007\u001a\u0005\b´\u0001\u0010\\R\u0017\u0010¹\u0001\u001a\u0005\u0018\u00010¶\u00018F¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R\u0015\u0010½\u0001\u001a\u00030º\u00018F¢\u0006\b\u001a\u0006\b»\u0001\u0010¼\u0001R\u0015\u0010Á\u0001\u001a\u00030¾\u00018F¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0017\u0010Å\u0001\u001a\u0005\u0018\u00010Â\u00018F¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u001a\u0010È\u0001\u001a\t\u0012\u0005\u0012\u00030Æ\u00010!8F¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010\\R\u0013\u0010É\u0001\u001a\u00020\f8F¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010+¨\u0006Î\u0001"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;", "", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$CryptoOrderInput;", "input", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "recurringHookFrequency", "j$/time/LocalDate", "recurringHookStartDate", "Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;", "tradeBonusEligibility", "", "isReviewOrderButtonLoading", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$CryptoQuoteOrderError;", "error", "Lcom/robinhood/models/db/Account;", "account", "hasSeenPdtWarning", "isRecurringHookEnabled", "isRhcApp", "Lcom/robinhood/models/ui/ServerDrivenAlert;", "powerInfoAlert", "Lidl/recurring/proto/v1/GetScheduleConfigResponseDto;", "scheduleConfig", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;", "reviewOrderEvent", "hasSeenEuAdvancedOrdersTooltip", "Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "cryptoOrderMonetizationModel", "hasSeenTaxLotOrderTooltipPref", "isTaxLotsEnabled", "isMarketOrderPillsMicrogramMigrationEnabled", "Lkotlinx/collections/immutable/ImmutableList;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto;", "quickTradeButtons", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "_cryptoOrderReviewMessageAndDisclosuresState", "isMibExperimentEnabled", "isStableCoinOrdersExperimentEnabled", "<init>", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$CryptoOrderInput;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;ZLcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$CryptoQuoteOrderError;Lcom/robinhood/models/db/Account;ZZZLcom/robinhood/models/ui/ServerDrivenAlert;Lidl/recurring/proto/v1/GetScheduleConfigResponseDto;Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;ZLcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;ZZZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;ZZ)V", "component10", "()Z", "component11", "component12", "()Lcom/robinhood/models/ui/ServerDrivenAlert;", "component13", "()Lidl/recurring/proto/v1/GetScheduleConfigResponseDto;", "component21", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "text", "isRecurringOrder", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getLoggingOrderPillEventContext", "(ILjava/lang/String;Z)Lcom/robinhood/rosetta/eventlogging/Context;", "component1", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "component2", "()Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$CryptoOrderInput;", "component3", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "component4", "()Lj$/time/LocalDate;", "component5", "()Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;", "component6", "component7", "()Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$CryptoQuoteOrderError;", "component8", "()Lcom/robinhood/models/db/Account;", "component9$feature_trade_crypto_externalDebug", "component9", "component14$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;", "component14", "component15$feature_trade_crypto_externalDebug", "component15", "component16$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "component16", "component17$feature_trade_crypto_externalDebug", "component17", "component18$feature_trade_crypto_externalDebug", "component18", "component19$feature_trade_crypto_externalDebug", "component19", "component20$feature_trade_crypto_externalDebug", "()Lkotlinx/collections/immutable/ImmutableList;", "component20", "component22$feature_trade_crypto_externalDebug", "component22", "component23$feature_trade_crypto_externalDebug", "component23", "copy", "(Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$CryptoOrderInput;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;ZLcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$CryptoQuoteOrderError;Lcom/robinhood/models/db/Account;ZZZLcom/robinhood/models/ui/ServerDrivenAlert;Lidl/recurring/proto/v1/GetScheduleConfigResponseDto;Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;ZLcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;ZZZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;ZZ)Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "getCryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$CryptoOrderInput;", "getInput", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "getRecurringHookFrequency", "Lj$/time/LocalDate;", "getRecurringHookStartDate", "Lcom/robinhood/models/crypto/ui/UiCryptoTradeBonusEligibility;", "getTradeBonusEligibility", "Z", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$CryptoQuoteOrderError;", "getError", "Lcom/robinhood/models/db/Account;", "getAccount", "getHasSeenPdtWarning$feature_trade_crypto_externalDebug", "Lcom/robinhood/models/ui/ServerDrivenAlert;", "Lidl/recurring/proto/v1/GetScheduleConfigResponseDto;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderUiEvent;", "getReviewOrderEvent$feature_trade_crypto_externalDebug", "getHasSeenEuAdvancedOrdersTooltip$feature_trade_crypto_externalDebug", "Lcom/robinhood/models/crypto/ui/fee/CryptoOrderMonetizationModel;", "getCryptoOrderMonetizationModel$feature_trade_crypto_externalDebug", "getHasSeenTaxLotOrderTooltipPref$feature_trade_crypto_externalDebug", "isTaxLotsEnabled$feature_trade_crypto_externalDebug", "isMarketOrderPillsMicrogramMigrationEnabled$feature_trade_crypto_externalDebug", "Lkotlinx/collections/immutable/ImmutableList;", "getQuickTradeButtons$feature_trade_crypto_externalDebug", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "isMibExperimentEnabled$feature_trade_crypto_externalDebug", "isStableCoinOrdersExperimentEnabled$feature_trade_crypto_externalDebug", "isRecurringHookVisible$feature_trade_crypto_externalDebug", "isRecurringHookVisible$feature_trade_crypto_externalDebug$annotations", "()V", "isRecurringHookVisible", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "getFeeCryptoOrderReviewRowState$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "getFeeCryptoOrderReviewRowState$feature_trade_crypto_externalDebug$annotations", "feeCryptoOrderReviewRowState", "getAmountCryptoOrderReviewRowState$feature_trade_crypto_externalDebug", "getAmountCryptoOrderReviewRowState$feature_trade_crypto_externalDebug$annotations", "amountCryptoOrderReviewRowState", "getSpreadCryptoOrderReviewRowState$feature_trade_crypto_externalDebug", "getSpreadCryptoOrderReviewRowState$feature_trade_crypto_externalDebug$annotations", "spreadCryptoOrderReviewRowState", "getTotalCryptoOrderReviewRowState$feature_trade_crypto_externalDebug", "getTotalCryptoOrderReviewRowState$feature_trade_crypto_externalDebug$annotations", "totalCryptoOrderReviewRowState", "getAccountNameOrderReviewState$feature_trade_crypto_externalDebug", "getAccountNameOrderReviewState$feature_trade_crypto_externalDebug$annotations", "accountNameOrderReviewState", "Lcom/robinhood/utils/resource/StringResource;", "getToolbarTitle", "()Lcom/robinhood/utils/resource/StringResource;", "toolbarTitle", "isToolbarVisible", "getInputText", "inputText", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/views/CryptoQuoteOrderRecurringHookChipState;", "getRecurringHookState$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/views/CryptoQuoteOrderRecurringHookChipState;", "recurringHookState", "Lcom/robinhood/models/util/Money;", "getRecurringHookAmount", "()Lcom/robinhood/models/util/Money;", "recurringHookAmount", "getRecurringBuyingPower", "recurringBuyingPower", "getRecurringMinOrderSize", "recurringMinOrderSize", "getRecurringMaxOrderSize", "recurringMaxOrderSize", "getOrderReviewRowStates", "orderReviewRowStates", "Lcom/robinhood/shared/trade/crypto/ui/tooltip/CryptoOrderTooltipData;", "getTooltipData", "()Lcom/robinhood/shared/trade/crypto/ui/tooltip/CryptoOrderTooltipData;", "tooltipData", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "getCreateRequestInput", "()Lcom/robinhood/shared/trade/crypto/validation/RequestInputs;", "createRequestInput", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "getCryptoOrderAnimatedBentoNumpadState", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "cryptoOrderAnimatedBentoNumpadState", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$OrderContextViewState;", "getOrderContextViewState", "()Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$OrderContextViewState;", "orderContextViewState", "Lcontracts/crypto/trade/proto/v1/BottomSheetTypeDto;", "getBottomSheetTypeDtos", "bottomSheetTypeDtos", "isSelectedAccountVisible", "Companion", "OrderContextViewState", "CryptoOrderInput", "CryptoQuoteOrderError", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoQuoteOrderViewState {
    private final CryptoOrderReviewMessageAndDisclosuresState _cryptoOrderReviewMessageAndDisclosuresState;
    private final Account account;
    private final CryptoOrderContext cryptoOrderContext;
    private final CryptoOrderMonetizationModel cryptoOrderMonetizationModel;
    private final CryptoQuoteOrderError error;
    private final boolean hasSeenEuAdvancedOrdersTooltip;
    private final boolean hasSeenPdtWarning;
    private final boolean hasSeenTaxLotOrderTooltipPref;
    private final CryptoOrderInput input;
    private final boolean isMarketOrderPillsMicrogramMigrationEnabled;
    private final boolean isMibExperimentEnabled;
    private final boolean isRecurringHookEnabled;
    private final boolean isReviewOrderButtonLoading;
    private final boolean isRhcApp;
    private final boolean isStableCoinOrdersExperimentEnabled;
    private final boolean isTaxLotsEnabled;
    private final ServerDrivenAlert powerInfoAlert;
    private final ImmutableList<CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto> quickTradeButtons;
    private final ApiInvestmentSchedule.Frequency recurringHookFrequency;
    private final LocalDate recurringHookStartDate;
    private final CryptoOrderUiEvent reviewOrderEvent;
    private final GetScheduleConfigResponseDto scheduleConfig;
    private final UiCryptoTradeBonusEligibility tradeBonusEligibility;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<String> decimalSeparator$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderViewState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CryptoQuoteOrderViewState.decimalSeparator_delegate$lambda$2();
        }
    });
    private static final BigDecimal MIN_SELLING_POWER_FOR_QUICK_SELL = new BigDecimal(Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION);

    /* compiled from: CryptoQuoteOrderViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiInvestmentSchedule.Frequency.values().length];
            try {
                iArr[ApiInvestmentSchedule.Frequency.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.BIWEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderSide.values().length];
            try {
                iArr2[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: component10, reason: from getter */
    private final boolean getIsRecurringHookEnabled() {
        return this.isRecurringHookEnabled;
    }

    /* renamed from: component11, reason: from getter */
    private final boolean getIsRhcApp() {
        return this.isRhcApp;
    }

    /* renamed from: component12, reason: from getter */
    private final ServerDrivenAlert getPowerInfoAlert() {
        return this.powerInfoAlert;
    }

    /* renamed from: component13, reason: from getter */
    private final GetScheduleConfigResponseDto getScheduleConfig() {
        return this.scheduleConfig;
    }

    /* renamed from: component21, reason: from getter */
    private final CryptoOrderReviewMessageAndDisclosuresState get_cryptoOrderReviewMessageAndDisclosuresState() {
        return this._cryptoOrderReviewMessageAndDisclosuresState;
    }

    public static /* synthetic */ CryptoQuoteOrderViewState copy$default(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, CryptoOrderContext cryptoOrderContext, CryptoOrderInput cryptoOrderInput, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, boolean z, CryptoQuoteOrderError cryptoQuoteOrderError, Account account, boolean z2, boolean z3, boolean z4, ServerDrivenAlert serverDrivenAlert, GetScheduleConfigResponseDto getScheduleConfigResponseDto, CryptoOrderUiEvent cryptoOrderUiEvent, boolean z5, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, boolean z6, boolean z7, boolean z8, ImmutableList immutableList, CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, boolean z9, boolean z10, int i, Object obj) {
        boolean z11;
        boolean z12;
        CryptoOrderContext cryptoOrderContext2 = (i & 1) != 0 ? cryptoQuoteOrderViewState.cryptoOrderContext : cryptoOrderContext;
        CryptoOrderInput cryptoOrderInput2 = (i & 2) != 0 ? cryptoQuoteOrderViewState.input : cryptoOrderInput;
        ApiInvestmentSchedule.Frequency frequency2 = (i & 4) != 0 ? cryptoQuoteOrderViewState.recurringHookFrequency : frequency;
        LocalDate localDate2 = (i & 8) != 0 ? cryptoQuoteOrderViewState.recurringHookStartDate : localDate;
        UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility2 = (i & 16) != 0 ? cryptoQuoteOrderViewState.tradeBonusEligibility : uiCryptoTradeBonusEligibility;
        boolean z13 = (i & 32) != 0 ? cryptoQuoteOrderViewState.isReviewOrderButtonLoading : z;
        CryptoQuoteOrderError cryptoQuoteOrderError2 = (i & 64) != 0 ? cryptoQuoteOrderViewState.error : cryptoQuoteOrderError;
        Account account2 = (i & 128) != 0 ? cryptoQuoteOrderViewState.account : account;
        boolean z14 = (i & 256) != 0 ? cryptoQuoteOrderViewState.hasSeenPdtWarning : z2;
        boolean z15 = (i & 512) != 0 ? cryptoQuoteOrderViewState.isRecurringHookEnabled : z3;
        boolean z16 = (i & 1024) != 0 ? cryptoQuoteOrderViewState.isRhcApp : z4;
        ServerDrivenAlert serverDrivenAlert2 = (i & 2048) != 0 ? cryptoQuoteOrderViewState.powerInfoAlert : serverDrivenAlert;
        GetScheduleConfigResponseDto getScheduleConfigResponseDto2 = (i & 4096) != 0 ? cryptoQuoteOrderViewState.scheduleConfig : getScheduleConfigResponseDto;
        CryptoOrderUiEvent cryptoOrderUiEvent2 = (i & 8192) != 0 ? cryptoQuoteOrderViewState.reviewOrderEvent : cryptoOrderUiEvent;
        CryptoOrderContext cryptoOrderContext3 = cryptoOrderContext2;
        boolean z17 = (i & 16384) != 0 ? cryptoQuoteOrderViewState.hasSeenEuAdvancedOrdersTooltip : z5;
        CryptoOrderMonetizationModel cryptoOrderMonetizationModel2 = (i & 32768) != 0 ? cryptoQuoteOrderViewState.cryptoOrderMonetizationModel : cryptoOrderMonetizationModel;
        boolean z18 = (i & 65536) != 0 ? cryptoQuoteOrderViewState.hasSeenTaxLotOrderTooltipPref : z6;
        boolean z19 = (i & 131072) != 0 ? cryptoQuoteOrderViewState.isTaxLotsEnabled : z7;
        boolean z20 = (i & 262144) != 0 ? cryptoQuoteOrderViewState.isMarketOrderPillsMicrogramMigrationEnabled : z8;
        ImmutableList immutableList2 = (i & 524288) != 0 ? cryptoQuoteOrderViewState.quickTradeButtons : immutableList;
        CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState2 = (i & 1048576) != 0 ? cryptoQuoteOrderViewState._cryptoOrderReviewMessageAndDisclosuresState : cryptoOrderReviewMessageAndDisclosuresState;
        boolean z21 = (i & 2097152) != 0 ? cryptoQuoteOrderViewState.isMibExperimentEnabled : z9;
        if ((i & 4194304) != 0) {
            z12 = z21;
            z11 = cryptoQuoteOrderViewState.isStableCoinOrdersExperimentEnabled;
        } else {
            z11 = z10;
            z12 = z21;
        }
        return cryptoQuoteOrderViewState.copy(cryptoOrderContext3, cryptoOrderInput2, frequency2, localDate2, uiCryptoTradeBonusEligibility2, z13, cryptoQuoteOrderError2, account2, z14, z15, z16, serverDrivenAlert2, getScheduleConfigResponseDto2, cryptoOrderUiEvent2, z17, cryptoOrderMonetizationModel2, z18, z19, z20, immutableList2, cryptoOrderReviewMessageAndDisclosuresState2, z12, z11);
    }

    /* renamed from: getAccountNameOrderReviewState$feature_trade_crypto_externalDebug$annotations */
    public static /* synthetic */ void m2880xe015ad05() {
    }

    /* renamed from: getAmountCryptoOrderReviewRowState$feature_trade_crypto_externalDebug$annotations */
    public static /* synthetic */ void m2881x1c0e8d04() {
    }

    /* renamed from: getFeeCryptoOrderReviewRowState$feature_trade_crypto_externalDebug$annotations */
    public static /* synthetic */ void m2882xe13c2406() {
    }

    /* renamed from: getSpreadCryptoOrderReviewRowState$feature_trade_crypto_externalDebug$annotations */
    public static /* synthetic */ void m2883xa3798b1f() {
    }

    /* renamed from: getTotalCryptoOrderReviewRowState$feature_trade_crypto_externalDebug$annotations */
    public static /* synthetic */ void m2884x3f0d5b44() {
    }

    /* renamed from: isRecurringHookVisible$feature_trade_crypto_externalDebug$annotations */
    public static /* synthetic */ void m2885x572b0f56() {
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoOrderContext getCryptoOrderContext() {
        return this.cryptoOrderContext;
    }

    /* renamed from: component14$feature_trade_crypto_externalDebug, reason: from getter */
    public final CryptoOrderUiEvent getReviewOrderEvent() {
        return this.reviewOrderEvent;
    }

    /* renamed from: component15$feature_trade_crypto_externalDebug, reason: from getter */
    public final boolean getHasSeenEuAdvancedOrdersTooltip() {
        return this.hasSeenEuAdvancedOrdersTooltip;
    }

    /* renamed from: component16$feature_trade_crypto_externalDebug, reason: from getter */
    public final CryptoOrderMonetizationModel getCryptoOrderMonetizationModel() {
        return this.cryptoOrderMonetizationModel;
    }

    /* renamed from: component17$feature_trade_crypto_externalDebug, reason: from getter */
    public final boolean getHasSeenTaxLotOrderTooltipPref() {
        return this.hasSeenTaxLotOrderTooltipPref;
    }

    /* renamed from: component18$feature_trade_crypto_externalDebug, reason: from getter */
    public final boolean getIsTaxLotsEnabled() {
        return this.isTaxLotsEnabled;
    }

    /* renamed from: component19$feature_trade_crypto_externalDebug, reason: from getter */
    public final boolean getIsMarketOrderPillsMicrogramMigrationEnabled() {
        return this.isMarketOrderPillsMicrogramMigrationEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoOrderInput getInput() {
        return this.input;
    }

    public final ImmutableList<CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto> component20$feature_trade_crypto_externalDebug() {
        return this.quickTradeButtons;
    }

    /* renamed from: component22$feature_trade_crypto_externalDebug, reason: from getter */
    public final boolean getIsMibExperimentEnabled() {
        return this.isMibExperimentEnabled;
    }

    /* renamed from: component23$feature_trade_crypto_externalDebug, reason: from getter */
    public final boolean getIsStableCoinOrdersExperimentEnabled() {
        return this.isStableCoinOrdersExperimentEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiInvestmentSchedule.Frequency getRecurringHookFrequency() {
        return this.recurringHookFrequency;
    }

    /* renamed from: component4, reason: from getter */
    public final LocalDate getRecurringHookStartDate() {
        return this.recurringHookStartDate;
    }

    /* renamed from: component5, reason: from getter */
    public final UiCryptoTradeBonusEligibility getTradeBonusEligibility() {
        return this.tradeBonusEligibility;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsReviewOrderButtonLoading() {
        return this.isReviewOrderButtonLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final CryptoQuoteOrderError getError() {
        return this.error;
    }

    /* renamed from: component8, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component9$feature_trade_crypto_externalDebug, reason: from getter */
    public final boolean getHasSeenPdtWarning() {
        return this.hasSeenPdtWarning;
    }

    public final CryptoQuoteOrderViewState copy(CryptoOrderContext cryptoOrderContext, CryptoOrderInput input, ApiInvestmentSchedule.Frequency recurringHookFrequency, LocalDate recurringHookStartDate, UiCryptoTradeBonusEligibility tradeBonusEligibility, boolean isReviewOrderButtonLoading, CryptoQuoteOrderError error, Account account, boolean hasSeenPdtWarning, boolean isRecurringHookEnabled, boolean isRhcApp, ServerDrivenAlert powerInfoAlert, GetScheduleConfigResponseDto scheduleConfig, CryptoOrderUiEvent reviewOrderEvent, boolean hasSeenEuAdvancedOrdersTooltip, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, boolean hasSeenTaxLotOrderTooltipPref, boolean isTaxLotsEnabled, boolean isMarketOrderPillsMicrogramMigrationEnabled, ImmutableList<CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto> quickTradeButtons, CryptoOrderReviewMessageAndDisclosuresState _cryptoOrderReviewMessageAndDisclosuresState, boolean isMibExperimentEnabled, boolean isStableCoinOrdersExperimentEnabled) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(quickTradeButtons, "quickTradeButtons");
        return new CryptoQuoteOrderViewState(cryptoOrderContext, input, recurringHookFrequency, recurringHookStartDate, tradeBonusEligibility, isReviewOrderButtonLoading, error, account, hasSeenPdtWarning, isRecurringHookEnabled, isRhcApp, powerInfoAlert, scheduleConfig, reviewOrderEvent, hasSeenEuAdvancedOrdersTooltip, cryptoOrderMonetizationModel, hasSeenTaxLotOrderTooltipPref, isTaxLotsEnabled, isMarketOrderPillsMicrogramMigrationEnabled, quickTradeButtons, _cryptoOrderReviewMessageAndDisclosuresState, isMibExperimentEnabled, isStableCoinOrdersExperimentEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoQuoteOrderViewState)) {
            return false;
        }
        CryptoQuoteOrderViewState cryptoQuoteOrderViewState = (CryptoQuoteOrderViewState) other;
        return Intrinsics.areEqual(this.cryptoOrderContext, cryptoQuoteOrderViewState.cryptoOrderContext) && Intrinsics.areEqual(this.input, cryptoQuoteOrderViewState.input) && this.recurringHookFrequency == cryptoQuoteOrderViewState.recurringHookFrequency && Intrinsics.areEqual(this.recurringHookStartDate, cryptoQuoteOrderViewState.recurringHookStartDate) && Intrinsics.areEqual(this.tradeBonusEligibility, cryptoQuoteOrderViewState.tradeBonusEligibility) && this.isReviewOrderButtonLoading == cryptoQuoteOrderViewState.isReviewOrderButtonLoading && this.error == cryptoQuoteOrderViewState.error && Intrinsics.areEqual(this.account, cryptoQuoteOrderViewState.account) && this.hasSeenPdtWarning == cryptoQuoteOrderViewState.hasSeenPdtWarning && this.isRecurringHookEnabled == cryptoQuoteOrderViewState.isRecurringHookEnabled && this.isRhcApp == cryptoQuoteOrderViewState.isRhcApp && Intrinsics.areEqual(this.powerInfoAlert, cryptoQuoteOrderViewState.powerInfoAlert) && Intrinsics.areEqual(this.scheduleConfig, cryptoQuoteOrderViewState.scheduleConfig) && Intrinsics.areEqual(this.reviewOrderEvent, cryptoQuoteOrderViewState.reviewOrderEvent) && this.hasSeenEuAdvancedOrdersTooltip == cryptoQuoteOrderViewState.hasSeenEuAdvancedOrdersTooltip && Intrinsics.areEqual(this.cryptoOrderMonetizationModel, cryptoQuoteOrderViewState.cryptoOrderMonetizationModel) && this.hasSeenTaxLotOrderTooltipPref == cryptoQuoteOrderViewState.hasSeenTaxLotOrderTooltipPref && this.isTaxLotsEnabled == cryptoQuoteOrderViewState.isTaxLotsEnabled && this.isMarketOrderPillsMicrogramMigrationEnabled == cryptoQuoteOrderViewState.isMarketOrderPillsMicrogramMigrationEnabled && Intrinsics.areEqual(this.quickTradeButtons, cryptoQuoteOrderViewState.quickTradeButtons) && Intrinsics.areEqual(this._cryptoOrderReviewMessageAndDisclosuresState, cryptoQuoteOrderViewState._cryptoOrderReviewMessageAndDisclosuresState) && this.isMibExperimentEnabled == cryptoQuoteOrderViewState.isMibExperimentEnabled && this.isStableCoinOrdersExperimentEnabled == cryptoQuoteOrderViewState.isStableCoinOrdersExperimentEnabled;
    }

    public int hashCode() {
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        int iHashCode = (((cryptoOrderContext == null ? 0 : cryptoOrderContext.hashCode()) * 31) + this.input.hashCode()) * 31;
        ApiInvestmentSchedule.Frequency frequency = this.recurringHookFrequency;
        int iHashCode2 = (iHashCode + (frequency == null ? 0 : frequency.hashCode())) * 31;
        LocalDate localDate = this.recurringHookStartDate;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility = this.tradeBonusEligibility;
        int iHashCode4 = (((iHashCode3 + (uiCryptoTradeBonusEligibility == null ? 0 : uiCryptoTradeBonusEligibility.hashCode())) * 31) + Boolean.hashCode(this.isReviewOrderButtonLoading)) * 31;
        CryptoQuoteOrderError cryptoQuoteOrderError = this.error;
        int iHashCode5 = (iHashCode4 + (cryptoQuoteOrderError == null ? 0 : cryptoQuoteOrderError.hashCode())) * 31;
        Account account = this.account;
        int iHashCode6 = (((((((iHashCode5 + (account == null ? 0 : account.hashCode())) * 31) + Boolean.hashCode(this.hasSeenPdtWarning)) * 31) + Boolean.hashCode(this.isRecurringHookEnabled)) * 31) + Boolean.hashCode(this.isRhcApp)) * 31;
        ServerDrivenAlert serverDrivenAlert = this.powerInfoAlert;
        int iHashCode7 = (iHashCode6 + (serverDrivenAlert == null ? 0 : serverDrivenAlert.hashCode())) * 31;
        GetScheduleConfigResponseDto getScheduleConfigResponseDto = this.scheduleConfig;
        int iHashCode8 = (iHashCode7 + (getScheduleConfigResponseDto == null ? 0 : getScheduleConfigResponseDto.hashCode())) * 31;
        CryptoOrderUiEvent cryptoOrderUiEvent = this.reviewOrderEvent;
        int iHashCode9 = (((iHashCode8 + (cryptoOrderUiEvent == null ? 0 : cryptoOrderUiEvent.hashCode())) * 31) + Boolean.hashCode(this.hasSeenEuAdvancedOrdersTooltip)) * 31;
        CryptoOrderMonetizationModel cryptoOrderMonetizationModel = this.cryptoOrderMonetizationModel;
        int iHashCode10 = (((((((((iHashCode9 + (cryptoOrderMonetizationModel == null ? 0 : cryptoOrderMonetizationModel.hashCode())) * 31) + Boolean.hashCode(this.hasSeenTaxLotOrderTooltipPref)) * 31) + Boolean.hashCode(this.isTaxLotsEnabled)) * 31) + Boolean.hashCode(this.isMarketOrderPillsMicrogramMigrationEnabled)) * 31) + this.quickTradeButtons.hashCode()) * 31;
        CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState = this._cryptoOrderReviewMessageAndDisclosuresState;
        return ((((iHashCode10 + (cryptoOrderReviewMessageAndDisclosuresState != null ? cryptoOrderReviewMessageAndDisclosuresState.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMibExperimentEnabled)) * 31) + Boolean.hashCode(this.isStableCoinOrdersExperimentEnabled);
    }

    public String toString() {
        return "CryptoQuoteOrderViewState(cryptoOrderContext=" + this.cryptoOrderContext + ", input=" + this.input + ", recurringHookFrequency=" + this.recurringHookFrequency + ", recurringHookStartDate=" + this.recurringHookStartDate + ", tradeBonusEligibility=" + this.tradeBonusEligibility + ", isReviewOrderButtonLoading=" + this.isReviewOrderButtonLoading + ", error=" + this.error + ", account=" + this.account + ", hasSeenPdtWarning=" + this.hasSeenPdtWarning + ", isRecurringHookEnabled=" + this.isRecurringHookEnabled + ", isRhcApp=" + this.isRhcApp + ", powerInfoAlert=" + this.powerInfoAlert + ", scheduleConfig=" + this.scheduleConfig + ", reviewOrderEvent=" + this.reviewOrderEvent + ", hasSeenEuAdvancedOrdersTooltip=" + this.hasSeenEuAdvancedOrdersTooltip + ", cryptoOrderMonetizationModel=" + this.cryptoOrderMonetizationModel + ", hasSeenTaxLotOrderTooltipPref=" + this.hasSeenTaxLotOrderTooltipPref + ", isTaxLotsEnabled=" + this.isTaxLotsEnabled + ", isMarketOrderPillsMicrogramMigrationEnabled=" + this.isMarketOrderPillsMicrogramMigrationEnabled + ", quickTradeButtons=" + this.quickTradeButtons + ", _cryptoOrderReviewMessageAndDisclosuresState=" + this._cryptoOrderReviewMessageAndDisclosuresState + ", isMibExperimentEnabled=" + this.isMibExperimentEnabled + ", isStableCoinOrdersExperimentEnabled=" + this.isStableCoinOrdersExperimentEnabled + ")";
    }

    public CryptoQuoteOrderViewState(CryptoOrderContext cryptoOrderContext, CryptoOrderInput input, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility, boolean z, CryptoQuoteOrderError cryptoQuoteOrderError, Account account, boolean z2, boolean z3, boolean z4, ServerDrivenAlert serverDrivenAlert, GetScheduleConfigResponseDto getScheduleConfigResponseDto, CryptoOrderUiEvent cryptoOrderUiEvent, boolean z5, CryptoOrderMonetizationModel cryptoOrderMonetizationModel, boolean z6, boolean z7, boolean z8, ImmutableList<CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto> quickTradeButtons, CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(quickTradeButtons, "quickTradeButtons");
        this.cryptoOrderContext = cryptoOrderContext;
        this.input = input;
        this.recurringHookFrequency = frequency;
        this.recurringHookStartDate = localDate;
        this.tradeBonusEligibility = uiCryptoTradeBonusEligibility;
        this.isReviewOrderButtonLoading = z;
        this.error = cryptoQuoteOrderError;
        this.account = account;
        this.hasSeenPdtWarning = z2;
        this.isRecurringHookEnabled = z3;
        this.isRhcApp = z4;
        this.powerInfoAlert = serverDrivenAlert;
        this.scheduleConfig = getScheduleConfigResponseDto;
        this.reviewOrderEvent = cryptoOrderUiEvent;
        this.hasSeenEuAdvancedOrdersTooltip = z5;
        this.cryptoOrderMonetizationModel = cryptoOrderMonetizationModel;
        this.hasSeenTaxLotOrderTooltipPref = z6;
        this.isTaxLotsEnabled = z7;
        this.isMarketOrderPillsMicrogramMigrationEnabled = z8;
        this.quickTradeButtons = quickTradeButtons;
        this._cryptoOrderReviewMessageAndDisclosuresState = cryptoOrderReviewMessageAndDisclosuresState;
        this.isMibExperimentEnabled = z9;
        this.isStableCoinOrdersExperimentEnabled = z10;
    }

    public final CryptoOrderContext getCryptoOrderContext() {
        return this.cryptoOrderContext;
    }

    public final CryptoOrderInput getInput() {
        return this.input;
    }

    public final ApiInvestmentSchedule.Frequency getRecurringHookFrequency() {
        return this.recurringHookFrequency;
    }

    public final LocalDate getRecurringHookStartDate() {
        return this.recurringHookStartDate;
    }

    public final UiCryptoTradeBonusEligibility getTradeBonusEligibility() {
        return this.tradeBonusEligibility;
    }

    public final boolean isReviewOrderButtonLoading() {
        return this.isReviewOrderButtonLoading;
    }

    public final CryptoQuoteOrderError getError() {
        return this.error;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final boolean getHasSeenPdtWarning$feature_trade_crypto_externalDebug() {
        return this.hasSeenPdtWarning;
    }

    public final CryptoOrderUiEvent getReviewOrderEvent$feature_trade_crypto_externalDebug() {
        return this.reviewOrderEvent;
    }

    /* renamed from: getHasSeenEuAdvancedOrdersTooltip$feature_trade_crypto_externalDebug */
    public final boolean m2890x69fa2ea5() {
        return this.hasSeenEuAdvancedOrdersTooltip;
    }

    /* renamed from: getCryptoOrderMonetizationModel$feature_trade_crypto_externalDebug */
    public final CryptoOrderMonetizationModel m2888x5cfb4369() {
        return this.cryptoOrderMonetizationModel;
    }

    /* renamed from: getHasSeenTaxLotOrderTooltipPref$feature_trade_crypto_externalDebug */
    public final boolean m2891x8d8f77f5() {
        return this.hasSeenTaxLotOrderTooltipPref;
    }

    public final boolean isTaxLotsEnabled$feature_trade_crypto_externalDebug() {
        return this.isTaxLotsEnabled;
    }

    /* renamed from: isMarketOrderPillsMicrogramMigrationEnabled$feature_trade_crypto_externalDebug */
    public final boolean m2894xc360dc36() {
        return this.isMarketOrderPillsMicrogramMigrationEnabled;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CryptoQuoteOrderViewState(com.robinhood.shared.trade.crypto.context.CryptoOrderContext r28, com.robinhood.shared.trade.crypto.p397ui.quoteOrder.CryptoQuoteOrderViewState.CryptoOrderInput r29, com.robinhood.recurring.models.api.ApiInvestmentSchedule.Frequency r30, p479j$.time.LocalDate r31, com.robinhood.models.crypto.p315ui.UiCryptoTradeBonusEligibility r32, boolean r33, com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderViewState.CryptoQuoteOrderError r34, com.robinhood.models.p320db.Account r35, boolean r36, boolean r37, boolean r38, com.robinhood.models.p355ui.ServerDrivenAlert r39, idl.recurring.proto.p474v1.GetScheduleConfigResponseDto r40, com.robinhood.shared.trade.crypto.validation.CryptoOrderUiEvent r41, boolean r42, com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel r43, boolean r44, boolean r45, boolean r46, kotlinx.collections.immutable.ImmutableList r47, com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState r48, boolean r49, boolean r50, int r51, kotlin.jvm.internal.DefaultConstructorMarker r52) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.trade.crypto.p397ui.quoteOrder.CryptoQuoteOrderViewState.<init>(com.robinhood.shared.trade.crypto.context.CryptoOrderContext, com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderViewState$CryptoOrderInput, com.robinhood.recurring.models.api.ApiInvestmentSchedule$Frequency, j$.time.LocalDate, com.robinhood.models.crypto.ui.UiCryptoTradeBonusEligibility, boolean, com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderViewState$CryptoQuoteOrderError, com.robinhood.models.db.Account, boolean, boolean, boolean, com.robinhood.models.ui.ServerDrivenAlert, idl.recurring.proto.v1.GetScheduleConfigResponseDto, com.robinhood.shared.trade.crypto.validation.CryptoOrderUiEvent, boolean, com.robinhood.models.crypto.ui.fee.CryptoOrderMonetizationModel, boolean, boolean, boolean, kotlinx.collections.immutable.ImmutableList, com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final ImmutableList<CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto> getQuickTradeButtons$feature_trade_crypto_externalDebug() {
        return this.quickTradeButtons;
    }

    public final boolean isMibExperimentEnabled$feature_trade_crypto_externalDebug() {
        return this.isMibExperimentEnabled;
    }

    /* renamed from: isStableCoinOrdersExperimentEnabled$feature_trade_crypto_externalDebug */
    public final boolean m2895x47af51a9() {
        return this.isStableCoinOrdersExperimentEnabled;
    }

    public final StringResource getToolbarTitle() {
        if (this.input.getIsReviewing()) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C40095R.string.order_type_market_order, new Object[0]);
    }

    public final boolean isToolbarVisible() {
        return !this.input.getIsReviewing();
    }

    public final String getInputText() {
        return this.input.getCurrencyInputText$feature_trade_crypto_externalDebug();
    }

    public final CryptoQuoteOrderRecurringHookChipState getRecurringHookState$feature_trade_crypto_externalDebug() {
        int i;
        if (!isRecurringHookVisible$feature_trade_crypto_externalDebug()) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        ApiInvestmentSchedule.Frequency frequency = this.recurringHookFrequency;
        int i2 = frequency == null ? -1 : WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i2 == -1) {
            i = C40095R.string.crypto_order_recurring_hook_row_one_time_title;
        } else if (i2 == 1) {
            i = C11595R.string.investment_schedule_frequency_daily_crypto;
        } else if (i2 == 2) {
            i = C11595R.string.investment_schedule_frequency_weekly;
        } else if (i2 == 3) {
            i = C11595R.string.investment_schedule_frequency_biweekly;
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(("Invalid frequency for crypto recurring hook: " + this.recurringHookFrequency.name()).toString());
            }
            i = C11595R.string.investment_schedule_frequency_monthly;
        }
        return new CryptoQuoteOrderRecurringHookChipState(companion.invoke(i, new Object[0]), this.recurringHookFrequency != null);
    }

    public final boolean isRecurringHookVisible$feature_trade_crypto_externalDebug() {
        CryptoOrderContext.RequestData request;
        if (!this.isRecurringHookEnabled) {
            return false;
        }
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        return ((cryptoOrderContext == null || (request = cryptoOrderContext.getRequest()) == null) ? null : request.getSide()) == OrderSide.BUY && !this.input.getIsReviewing();
    }

    public final Money getRecurringHookAmount() {
        return Money3.toMoney(this.input.getAmount$feature_trade_crypto_externalDebug(), this.isRhcApp ? Currencies.EUR : Currencies.USD);
    }

    public final Money getRecurringBuyingPower() {
        MoneyDto buying_power;
        GetScheduleConfigResponseDto getScheduleConfigResponseDto = this.scheduleConfig;
        if (getScheduleConfigResponseDto == null || (buying_power = getScheduleConfigResponseDto.getBuying_power()) == null) {
            return null;
        }
        return Money3.toMoney(buying_power);
    }

    public final Money getRecurringMinOrderSize() {
        MoneyDto min_order_size;
        GetScheduleConfigResponseDto getScheduleConfigResponseDto = this.scheduleConfig;
        if (getScheduleConfigResponseDto == null || (min_order_size = getScheduleConfigResponseDto.getMin_order_size()) == null) {
            return null;
        }
        return Money3.toMoney(min_order_size);
    }

    public final Money getRecurringMaxOrderSize() {
        MoneyDto max_order_size;
        GetScheduleConfigResponseDto getScheduleConfigResponseDto = this.scheduleConfig;
        if (getScheduleConfigResponseDto == null || (max_order_size = getScheduleConfigResponseDto.getMax_order_size()) == null) {
            return null;
        }
        return Money3.toMoney(max_order_size);
    }

    public final ImmutableList<CryptoOrderReviewRowState> getOrderReviewRowStates() {
        CryptoOrderReviewRowState cryptoOrderReviewRowStateM2892x1e92851f;
        CryptoOrderReviewRowState cryptoOrderReviewRowStateM2887xaa577684 = m2887xaa577684();
        CryptoOrderMonetizationModel cryptoOrderMonetizationModel = this.cryptoOrderMonetizationModel;
        if (cryptoOrderMonetizationModel instanceof CryptoOrderMonetizationModel.Fee) {
            cryptoOrderReviewRowStateM2892x1e92851f = m2889x39fe0086();
        } else if (cryptoOrderMonetizationModel instanceof CryptoOrderMonetizationModel.Rebate) {
            cryptoOrderReviewRowStateM2892x1e92851f = m2892x1e92851f();
        } else {
            if (cryptoOrderMonetizationModel != null) {
                throw new NoWhenBranchMatchedException();
            }
            cryptoOrderReviewRowStateM2892x1e92851f = null;
        }
        return extensions2.toImmutableList(CollectionsKt.listOfNotNull((Object[]) new CryptoOrderReviewRowState[]{cryptoOrderReviewRowStateM2887xaa577684, cryptoOrderReviewRowStateM2892x1e92851f, m2893x2c69a4c4(), m2886x5e15d005()}));
    }

    public final CryptoOrderTooltipData getTooltipData() {
        if (this.isRhcApp && !this.hasSeenEuAdvancedOrdersTooltip && isToolbarVisible()) {
            return new CryptoOrderTooltipData(StringResource.INSTANCE.invoke(C40095R.string.crypto_order_eu_advanced_orders_tooltip, new Object[0]), CryptoOrderTooltipData.Type.EU_ADVANCED_ORDERS);
        }
        if (this.input.getOrderSide$feature_trade_crypto_externalDebug() == OrderSide.SELL && this.isTaxLotsEnabled && !this.hasSeenTaxLotOrderTooltipPref) {
            return new CryptoOrderTooltipData(StringResource.INSTANCE.invoke(C40095R.string.crypto_tax_lot_order_tooltip_text, new Object[0]), CryptoOrderTooltipData.Type.TAX_LOT_ORDERS);
        }
        return null;
    }

    /* renamed from: getFeeCryptoOrderReviewRowState$feature_trade_crypto_externalDebug */
    public final CryptoOrderReviewRowState m2889x39fe0086() {
        boolean z = this.isRhcApp;
        boolean isReviewing = this.input.getIsReviewing();
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        CryptoOrderMonetizationModel cryptoOrderMonetizationModel = this.cryptoOrderMonetizationModel;
        return FeeCryptoOrderReviewRowState.generateCryptoOrderReviewRowStateForFee(z, isReviewing, true, cryptoOrderContext, cryptoOrderMonetizationModel != null ? cryptoOrderMonetizationModel.getMonetizationModel() : null);
    }

    /* renamed from: getAmountCryptoOrderReviewRowState$feature_trade_crypto_externalDebug */
    public final CryptoOrderReviewRowState m2887xaa577684() {
        BigDecimal bigDecimalSafeAdd;
        int i;
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        ImmutableList3 immutableList3PersistentListOf = null;
        if (cryptoOrderContext == null) {
            return null;
        }
        UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility = this.tradeBonusEligibility;
        UiCryptoTradeBonusEligibility.TradeBonus assetBonus = uiCryptoTradeBonusEligibility != null ? uiCryptoTradeBonusEligibility.getAssetBonus() : null;
        BigDecimal bigDecimal = (BigDecimal) RangesKt.coerceAtLeast(BigDecimals7.safeMultiply(cryptoOrderContext.getOrderInfo().getDisplayQuantity(), BigDecimals7.orZero(assetBonus != null ? assetBonus.getBonusRatio() : null)), BigDecimals7.orZero(assetBonus != null ? assetBonus.getMinBonusAmount() : null));
        if (assetBonus == null) {
            bigDecimalSafeAdd = cryptoOrderContext.getOrderInfo().getDisplayQuantity();
        } else {
            bigDecimalSafeAdd = BigDecimals7.safeAdd(cryptoOrderContext.getOrderInfo().getDisplayQuantity(), bigDecimal);
        }
        BigDecimal bigDecimal2 = bigDecimalSafeAdd;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$1[cryptoOrderContext.getRequest().getSide().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C40095R.string.crypto_order_price_details_amount;
        } else if (assetBonus == null) {
            i = C40095R.string.crypto_order_price_details_asset_amount;
        } else {
            i = C40095R.string.crypto_order_price_details_total_asset;
        }
        CryptoOrderReviewRowState.TextContent textContent = new CryptoOrderReviewRowState.TextContent(companion.invoke(i, this.input.getUiCurrencyPair$feature_trade_crypto_externalDebug().getAssetCurrency().getCode()), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        CryptoOrderReviewRowState.TextContent textContent2 = new CryptoOrderReviewRowState.TextContent(companion.invoke(CurrencyDefinitions.formatCurrency$default(this.input.getUiCurrencyPair$feature_trade_crypto_externalDebug().getAssetCurrencyForCost(), bigDecimal2, false, false, null, 0, null, null, false, false, false, false, 2046, null)), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        if (assetBonus != null) {
            StringResource stringResourceInvoke = companion.invoke(C40095R.string.crypto_trade_bonus_order_review_bonus_percentage_included, FormatsLocalized.getPercentFormat().format(assetBonus.getBonusRatio()));
            CryptoOrderReviewRowState.TextStyleOverride textStyleOverride = CryptoOrderReviewRowState.TextStyleOverride.TEXT_S_HIGHLIGHT_GRADIENT;
            BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_FILLED_16);
            CryptoOrderReviewRowState.ColorOverride colorOverride = CryptoOrderReviewRowState.ColorOverride.DAY_PRIME;
            CryptoOrderReviewRowState.IconContent iconContent = new CryptoOrderReviewRowState.IconContent(size16, colorOverride);
            CryptoOrderReviewRowState.TapAction.ShowTradeBonusBottomSheet showTradeBonusBottomSheet = CryptoOrderReviewRowState.TapAction.ShowTradeBonusBottomSheet.INSTANCE;
            FontWeight.Companion companion2 = FontWeight.INSTANCE;
            immutableList3PersistentListOf = extensions2.persistentListOf(new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(stringResourceInvoke, null, iconContent, showTradeBonusBottomSheet, textStyleOverride, companion2.getBold(), false, 66, null), new CryptoOrderReviewRowState.TextContent(companion.invoke(CurrencyDefinitions.formatCurrency$default(this.input.getUiCurrencyPair$feature_trade_crypto_externalDebug().getAssetCurrencyForCost(), bigDecimal, false, false, null, 0, null, null, false, false, false, false, 2046, null)), colorOverride, null, null, null, companion2.getBold(), false, 92, null)));
        }
        return new CryptoOrderReviewRowState(textContent, textContent2, null, immutableList3PersistentListOf, null, false, null, false, null, null, 1012, null);
    }

    /* renamed from: getSpreadCryptoOrderReviewRowState$feature_trade_crypto_externalDebug */
    public final CryptoOrderReviewRowState m2892x1e92851f() {
        OrderContextViewState orderContextViewState = getOrderContextViewState();
        if (orderContextViewState == null || this.input.getUiCurrencyPair$feature_trade_crypto_externalDebug().getMarketOrdersOnly()) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[this.input.getOrderSide$feature_trade_crypto_externalDebug().ordinal()];
        if (i == 1) {
            StringResource.Companion companion = StringResource.INSTANCE;
            return new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion.invoke(C40095R.string.crypto_order_spread_label_buy, FormatsLocalized.getPercentFormat().format(orderContextViewState.getCryptoOrderContext().getBuySpreadFraction())), null, new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), CryptoOrderReviewRowState.ColorOverride.FG_2), CryptoOrderReviewRowState.TapAction.ShowSpreadBottomSheet.INSTANCE, null, null, false, 114, null), new CryptoOrderReviewRowState.TextContent(companion.invoke(CurrencyDefinitions.formatCurrency$default(orderContextViewState.getQuotePriceCurrency(), orderContextViewState.getBuySpread().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null)), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, extensions2.persistentListOf(new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(companion.invoke(C40095R.string.crypto_order_spread_secondary_included, this.input.getUiCurrencyPair$feature_trade_crypto_externalDebug().getAssetCurrency().getCode()), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, 2, null)), null, false, null, false, null, null, 1012, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        return new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion2.invoke(C40095R.string.crypto_order_spread_label_sell, FormatsLocalized.getPercentFormat().format(orderContextViewState.getCryptoOrderContext().getSellSpreadFraction())), null, new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), CryptoOrderReviewRowState.ColorOverride.FG_2), CryptoOrderReviewRowState.TapAction.ShowSpreadBottomSheet.INSTANCE, null, null, false, 114, null), new CryptoOrderReviewRowState.TextContent(companion2.invoke(CurrencyDefinitions.formatCurrency$default(orderContextViewState.getQuotePriceCurrency(), orderContextViewState.getSellSpread().getDecimalValue(), false, false, null, 0, null, null, false, false, false, false, 2046, null)), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, extensions2.persistentListOf(new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(companion2.invoke(C40095R.string.crypto_order_spread_secondary_included, this.input.getUiCurrencyPair$feature_trade_crypto_externalDebug().getAssetCurrency().getCode()), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, 2, null)), null, false, null, false, null, null, 1012, null);
    }

    /* renamed from: getTotalCryptoOrderReviewRowState$feature_trade_crypto_externalDebug */
    public final CryptoOrderReviewRowState m2893x2c69a4c4() {
        BigDecimal bigDecimalSafeAdd;
        int i;
        OrderContextViewState orderContextViewState = getOrderContextViewState();
        if (orderContextViewState == null) {
            return null;
        }
        UiCryptoTradeBonusEligibility uiCryptoTradeBonusEligibility = this.tradeBonusEligibility;
        UiCryptoTradeBonusEligibility.TradeBonus quoteBonus = uiCryptoTradeBonusEligibility != null ? uiCryptoTradeBonusEligibility.getQuoteBonus() : null;
        if (quoteBonus == null) {
            bigDecimalSafeAdd = orderContextViewState.getCryptoOrderContext().getOrderInfo().getUncollaredTotalCost();
        } else {
            bigDecimalSafeAdd = BigDecimals7.safeAdd(orderContextViewState.getInput().getAmount$feature_trade_crypto_externalDebug(), (BigDecimal) RangesKt.coerceAtLeast(BigDecimals7.safeMultiply(orderContextViewState.getInput().getAmount$feature_trade_crypto_externalDebug(), quoteBonus.getBonusRatio()), quoteBonus.getMinBonusAmount()));
        }
        BigDecimal bigDecimal = bigDecimalSafeAdd;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$1[orderContextViewState.getInput().getOrderSide$feature_trade_crypto_externalDebug().ordinal()];
        if (i2 == 1) {
            i = C40095R.string.crypto_order_price_details_total_cost;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C40095R.string.crypto_order_price_details_total_credit;
        }
        StringResource stringResourceInvoke = companion.invoke(i, new Object[0]);
        FontWeight.Companion companion2 = FontWeight.INSTANCE;
        return new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(stringResourceInvoke, null, null, null, null, companion2.getBold(), false, 94, null), new CryptoOrderReviewRowState.TextContent(companion.invoke(CurrencyDefinitions.formatCurrency$default(orderContextViewState.getQuoteCostCurrency(), bigDecimal, false, false, null, 0, null, null, false, false, false, false, 2046, null)), null, null, null, null, companion2.getBold(), false, 94, null), null, quoteBonus != null ? extensions2.persistentListOf(new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(companion.invoke(C40095R.string.crypto_trade_bonus_order_review_bonus_percentage_included, FormatsLocalized.getPercentFormat().format(quoteBonus.getBonusRatio())), null, new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_FILLED_16), CryptoOrderReviewRowState.ColorOverride.DAY_PRIME), CryptoOrderReviewRowState.TapAction.ShowTradeBonusBottomSheet.INSTANCE, CryptoOrderReviewRowState.TextStyleOverride.TEXT_S_HIGHLIGHT_GRADIENT, companion2.getBold(), false, 66, null), null, 2, null)) : null, null, m2886x5e15d005() != null, null, false, null, null, 980, null);
    }

    /* renamed from: getAccountNameOrderReviewState$feature_trade_crypto_externalDebug */
    public final CryptoOrderReviewRowState m2886x5e15d005() {
        if (!this.isMibExperimentEnabled || this.account == null || !this.input.getIsReviewing()) {
            return null;
        }
        return new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(StringResource.INSTANCE.invoke(C40095R.string.crypto_order_detail_account_name_label, new Object[0]), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), new CryptoOrderReviewRowState.TextContent(AccountDisplayNames.getDisplayName(this.account).getShort().getTitle(), null, null, null, null, FontWeight.INSTANCE.getBold(), false, 94, null), null, null, null, false, CryptoOrderReviewRowState.VerticalPadding.DEFAULT, false, null, null, 924, null);
    }

    public final RequestInputs getCreateRequestInput() {
        CryptoOrderContext.RequestContext requestContext;
        if (this.input.isSellAllOrder$feature_trade_crypto_externalDebug()) {
            CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
            if (((cryptoOrderContext == null || (requestContext = cryptoOrderContext.getRequestContext()) == null) ? null : requestContext.getHolding()) != null) {
                return new RequestInputs.AsAsset(this.cryptoOrderContext.getRequestContext().getHolding().getQuantityAvailable(), this.cryptoOrderMonetizationModel, CryptoOrderPrices.Market.INSTANCE, this.input.getOrderSide$feature_trade_crypto_externalDebug(), OrderTimeInForce.GTC, this.hasSeenPdtWarning, this.tradeBonusEligibility, this.reviewOrderEvent, true, null, 512, null);
            }
        }
        return new RequestInputs.AsQuote(this.input.getAmount$feature_trade_crypto_externalDebug(), this.cryptoOrderMonetizationModel, CryptoOrderPrices.Market.INSTANCE, this.input.getOrderSide$feature_trade_crypto_externalDebug(), OrderTimeInForce.GTC, this.hasSeenPdtWarning, this.tradeBonusEligibility, this.reviewOrderEvent);
    }

    public final CryptoOrderAnimatedBentoNumpadState getCryptoOrderAnimatedBentoNumpadState() {
        boolean z = false;
        if (!StringsKt.contains$default((CharSequence) this.input.getCurrencyInputText$feature_trade_crypto_externalDebug(), (CharSequence) INSTANCE.getDecimalSeparator$feature_trade_crypto_externalDebug(), false, 2, (Object) null) && UiCurrencyPairs2.allowDecimalInput(this.input.getUiCurrencyPair$feature_trade_crypto_externalDebug(), CryptoInputMode.QUOTE_CURRENCY)) {
            z = true;
        }
        return new CryptoOrderAnimatedBentoNumpadState(true, false, z, null, 10, null);
    }

    public final OrderContextViewState getOrderContextViewState() {
        if (this.cryptoOrderContext != null) {
            return new OrderContextViewState(this.input, this.isRhcApp, this.cryptoOrderContext, this.powerInfoAlert, this.isRecurringHookEnabled, isRecurringHookVisible$feature_trade_crypto_externalDebug(), this.recurringHookFrequency, this.error, this.isMarketOrderPillsMicrogramMigrationEnabled, this.quickTradeButtons, this._cryptoOrderReviewMessageAndDisclosuresState, this.isMibExperimentEnabled);
        }
        return null;
    }

    public final Context getLoggingOrderPillEventContext(int index, String text, boolean isRecurringOrder) {
        Side protobuf;
        CryptoOrderContext.RequestData request;
        OrderSide side;
        Intrinsics.checkNotNullParameter(text, "text");
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        if (cryptoOrderContext == null || (request = cryptoOrderContext.getRequest()) == null || (side = request.getSide()) == null || (protobuf = Orders2.toProtobuf(side)) == null) {
            protobuf = Side.SIDE_UNSPECIFIED;
        }
        CryptoQuickTradeButtonContext cryptoQuickTradeButtonContext = new CryptoQuickTradeButtonContext(protobuf, index, text, isRecurringOrder, null, 16, null);
        CryptoOrderContext cryptoOrderContext2 = this.cryptoOrderContext;
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoOrderContext2 != null ? cryptoOrderContext2.getLoggingCryptoOrderContext() : null, null, null, null, null, null, null, null, null, null, null, null, cryptoQuickTradeButtonContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -8390657, -1, -1, 16383, null);
    }

    public final ImmutableList<BottomSheetTypeDto> getBottomSheetTypeDtos() {
        CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
        return extensions2.toPersistentList(CollectionsKt.listOfNotNull(cryptoOrderContext != null ? CryptoOrderContexts.getSpreadBottomSheetTypeDto(cryptoOrderContext) : null));
    }

    public final boolean isSelectedAccountVisible() {
        return this.isMibExperimentEnabled && !this.input.getIsReviewing();
    }

    /* compiled from: CryptoQuoteOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010R\u001a\u00020M2\u0006\u0010S\u001a\u00020\u00052\u0006\u0010T\u001a\u00020\u0005H\u0002J\u0010\u0010U\u001a\u00020M2\u0006\u0010T\u001a\u00020\u0005H\u0002J\u0018\u0010V\u001a\u00020M2\u0006\u0010S\u001a\u00020\u00052\u0006\u0010T\u001a\u00020\u0005H\u0002J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0005HÆ\u0003J\t\u0010h\u001a\u00020\u0007HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010j\u001a\u00020\u0005HÂ\u0003J\t\u0010k\u001a\u00020\u0005HÂ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\rHÂ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010n\u001a\u00020\u0005HÆ\u0003J\u000f\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0015HÂ\u0003J\t\u0010q\u001a\u00020\u0005HÆ\u0003J\u008f\u0001\u0010r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0005HÆ\u0001J\u0013\u0010s\u001a\u00020\u00052\b\u0010t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010u\u001a\u00020XHÖ\u0001J\t\u0010v\u001a\u00020wHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001bR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u001bR\u0014\u0010$\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0014\u0010&\u001a\u00020'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020+8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00102\u001a\u000203X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u000203X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0014\u00108\u001a\u000209X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0014\u0010<\u001a\u000209X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010;R\u0011\u0010>\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010B\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u001bR\u0013\u0010D\u001a\u0004\u0018\u00010E8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020I8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020M8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020M8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u0011\u0010W\u001a\u00020X8F¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0013\u0010[\u001a\u0004\u0018\u00010E8F¢\u0006\u0006\u001a\u0004\b\\\u0010GR\u0011\u0010]\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b^\u0010;R\u0011\u0010_\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b`\u0010;R\u0013\u0010a\u001a\u0004\u0018\u00010?¢\u0006\b\n\u0000\u001a\u0004\bb\u0010AR\u0016\u0010c\u001a\u0004\u0018\u00010\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006x"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$OrderContextViewState;", "", "input", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$CryptoOrderInput;", "isRhcApp", "", "cryptoOrderContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "powerInfoAlert", "Lcom/robinhood/models/ui/ServerDrivenAlert;", "isRecurringHookEnabled", "isRecurringHookVisible", "recurringHookFrequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "error", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$CryptoQuoteOrderError;", "isMarketOrderPillsMicrogramMigrationEnabled", "quickTradeButtons", "Lkotlinx/collections/immutable/ImmutableList;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto;", "_cryptoOrderReviewMessageAndDisclosuresState", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "isMibExperimentEnabled", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$CryptoOrderInput;ZLcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;Lcom/robinhood/models/ui/ServerDrivenAlert;ZZLcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$CryptoQuoteOrderError;ZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;Z)V", "getInput", "()Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$CryptoOrderInput;", "()Z", "getCryptoOrderContext", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "getPowerInfoAlert", "()Lcom/robinhood/models/ui/ServerDrivenAlert;", "getError", "()Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$CryptoQuoteOrderError;", "getQuickTradeButtons", "()Lkotlinx/collections/immutable/ImmutableList;", "isRecurringOrder", "isRecurringOrder$feature_trade_crypto_externalDebug", "request", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestData;", "getRequest$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestData;", "requestContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestContext;", "getRequestContext$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$RequestContext;", "accountContext", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$AccountContext;", "getAccountContext$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext$AccountContext;", "quoteCostCurrency", "Lcom/robinhood/models/crypto/db/Currency;", "getQuoteCostCurrency$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/crypto/db/Currency;", "quotePriceCurrency", "getQuotePriceCurrency$feature_trade_crypto_externalDebug", "bidPrice", "Lcom/robinhood/models/util/Money;", "getBidPrice$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/util/Money;", "askPrice", "getAskPrice$feature_trade_crypto_externalDebug", "maxOrderAmount", "Ljava/math/BigDecimal;", "getMaxOrderAmount", "()Ljava/math/BigDecimal;", "resultShowsClickablePriceEstimate", "getResultShowsClickablePriceEstimate", "result", "Lcom/robinhood/utils/resource/StringResource;", "getResult", "()Lcom/robinhood/utils/resource/StringResource;", "quickTradeBuy", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrades;", "getQuickTradeBuy$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrades;", "quickTradeSell", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "getQuickTradeSell$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "actionViewState", "getActionViewState$feature_trade_crypto_externalDebug", "traderActionViewState", "hasMinHold", "inputAmountIsZero", "microgramMigrationExperimentViewState", "controlTraderActionViewState", "powerInfoIconRes", "", "getPowerInfoIconRes", "()I", "cryptoPowerText", "getCryptoPowerText", "buySpread", "getBuySpread", "sellSpread", "getSellSpread", "rebate", "getRebate", "cryptoOrderReviewMessageAndDisclosuresState", "getCryptoOrderReviewMessageAndDisclosuresState$feature_trade_crypto_externalDebug", "()Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderContextViewState {
        public static final int $stable = 8;
        private final CryptoOrderReviewMessageAndDisclosuresState _cryptoOrderReviewMessageAndDisclosuresState;
        private final Money askPrice;
        private final Money bidPrice;
        private final CryptoOrderContext cryptoOrderContext;
        private final CryptoQuoteOrderError error;
        private final CryptoOrderInput input;
        private final boolean isMarketOrderPillsMicrogramMigrationEnabled;
        private final boolean isMibExperimentEnabled;
        private final boolean isRecurringHookEnabled;
        private final boolean isRecurringHookVisible;
        private final boolean isRecurringOrder;
        private final boolean isRhcApp;
        private final ServerDrivenAlert powerInfoAlert;
        private final ImmutableList<CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto> quickTradeButtons;
        private final Currency quoteCostCurrency;
        private final Currency quotePriceCurrency;
        private final BigDecimal rebate;
        private final ApiInvestmentSchedule.Frequency recurringHookFrequency;
        private final boolean resultShowsClickablePriceEstimate;

        /* compiled from: CryptoQuoteOrderViewState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderSide.values().length];
                try {
                    iArr[OrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: component11, reason: from getter */
        private final CryptoOrderReviewMessageAndDisclosuresState get_cryptoOrderReviewMessageAndDisclosuresState() {
            return this._cryptoOrderReviewMessageAndDisclosuresState;
        }

        /* renamed from: component5, reason: from getter */
        private final boolean getIsRecurringHookEnabled() {
            return this.isRecurringHookEnabled;
        }

        /* renamed from: component6, reason: from getter */
        private final boolean getIsRecurringHookVisible() {
            return this.isRecurringHookVisible;
        }

        /* renamed from: component7, reason: from getter */
        private final ApiInvestmentSchedule.Frequency getRecurringHookFrequency() {
            return this.recurringHookFrequency;
        }

        public static /* synthetic */ OrderContextViewState copy$default(OrderContextViewState orderContextViewState, CryptoOrderInput cryptoOrderInput, boolean z, CryptoOrderContext cryptoOrderContext, ServerDrivenAlert serverDrivenAlert, boolean z2, boolean z3, ApiInvestmentSchedule.Frequency frequency, CryptoQuoteOrderError cryptoQuoteOrderError, boolean z4, ImmutableList immutableList, CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, boolean z5, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoOrderInput = orderContextViewState.input;
            }
            if ((i & 2) != 0) {
                z = orderContextViewState.isRhcApp;
            }
            if ((i & 4) != 0) {
                cryptoOrderContext = orderContextViewState.cryptoOrderContext;
            }
            if ((i & 8) != 0) {
                serverDrivenAlert = orderContextViewState.powerInfoAlert;
            }
            if ((i & 16) != 0) {
                z2 = orderContextViewState.isRecurringHookEnabled;
            }
            if ((i & 32) != 0) {
                z3 = orderContextViewState.isRecurringHookVisible;
            }
            if ((i & 64) != 0) {
                frequency = orderContextViewState.recurringHookFrequency;
            }
            if ((i & 128) != 0) {
                cryptoQuoteOrderError = orderContextViewState.error;
            }
            if ((i & 256) != 0) {
                z4 = orderContextViewState.isMarketOrderPillsMicrogramMigrationEnabled;
            }
            if ((i & 512) != 0) {
                immutableList = orderContextViewState.quickTradeButtons;
            }
            if ((i & 1024) != 0) {
                cryptoOrderReviewMessageAndDisclosuresState = orderContextViewState._cryptoOrderReviewMessageAndDisclosuresState;
            }
            if ((i & 2048) != 0) {
                z5 = orderContextViewState.isMibExperimentEnabled;
            }
            CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState2 = cryptoOrderReviewMessageAndDisclosuresState;
            boolean z6 = z5;
            boolean z7 = z4;
            ImmutableList immutableList2 = immutableList;
            ApiInvestmentSchedule.Frequency frequency2 = frequency;
            CryptoQuoteOrderError cryptoQuoteOrderError2 = cryptoQuoteOrderError;
            boolean z8 = z2;
            boolean z9 = z3;
            return orderContextViewState.copy(cryptoOrderInput, z, cryptoOrderContext, serverDrivenAlert, z8, z9, frequency2, cryptoQuoteOrderError2, z7, immutableList2, cryptoOrderReviewMessageAndDisclosuresState2, z6);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoOrderInput getInput() {
            return this.input;
        }

        public final ImmutableList<CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto> component10() {
            return this.quickTradeButtons;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getIsMibExperimentEnabled() {
            return this.isMibExperimentEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRhcApp() {
            return this.isRhcApp;
        }

        /* renamed from: component3, reason: from getter */
        public final CryptoOrderContext getCryptoOrderContext() {
            return this.cryptoOrderContext;
        }

        /* renamed from: component4, reason: from getter */
        public final ServerDrivenAlert getPowerInfoAlert() {
            return this.powerInfoAlert;
        }

        /* renamed from: component8, reason: from getter */
        public final CryptoQuoteOrderError getError() {
            return this.error;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsMarketOrderPillsMicrogramMigrationEnabled() {
            return this.isMarketOrderPillsMicrogramMigrationEnabled;
        }

        public final OrderContextViewState copy(CryptoOrderInput input, boolean isRhcApp, CryptoOrderContext cryptoOrderContext, ServerDrivenAlert powerInfoAlert, boolean isRecurringHookEnabled, boolean isRecurringHookVisible, ApiInvestmentSchedule.Frequency recurringHookFrequency, CryptoQuoteOrderError error, boolean isMarketOrderPillsMicrogramMigrationEnabled, ImmutableList<CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto> quickTradeButtons, CryptoOrderReviewMessageAndDisclosuresState _cryptoOrderReviewMessageAndDisclosuresState, boolean isMibExperimentEnabled) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(cryptoOrderContext, "cryptoOrderContext");
            Intrinsics.checkNotNullParameter(quickTradeButtons, "quickTradeButtons");
            return new OrderContextViewState(input, isRhcApp, cryptoOrderContext, powerInfoAlert, isRecurringHookEnabled, isRecurringHookVisible, recurringHookFrequency, error, isMarketOrderPillsMicrogramMigrationEnabled, quickTradeButtons, _cryptoOrderReviewMessageAndDisclosuresState, isMibExperimentEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderContextViewState)) {
                return false;
            }
            OrderContextViewState orderContextViewState = (OrderContextViewState) other;
            return Intrinsics.areEqual(this.input, orderContextViewState.input) && this.isRhcApp == orderContextViewState.isRhcApp && Intrinsics.areEqual(this.cryptoOrderContext, orderContextViewState.cryptoOrderContext) && Intrinsics.areEqual(this.powerInfoAlert, orderContextViewState.powerInfoAlert) && this.isRecurringHookEnabled == orderContextViewState.isRecurringHookEnabled && this.isRecurringHookVisible == orderContextViewState.isRecurringHookVisible && this.recurringHookFrequency == orderContextViewState.recurringHookFrequency && this.error == orderContextViewState.error && this.isMarketOrderPillsMicrogramMigrationEnabled == orderContextViewState.isMarketOrderPillsMicrogramMigrationEnabled && Intrinsics.areEqual(this.quickTradeButtons, orderContextViewState.quickTradeButtons) && Intrinsics.areEqual(this._cryptoOrderReviewMessageAndDisclosuresState, orderContextViewState._cryptoOrderReviewMessageAndDisclosuresState) && this.isMibExperimentEnabled == orderContextViewState.isMibExperimentEnabled;
        }

        public int hashCode() {
            int iHashCode = ((((this.input.hashCode() * 31) + Boolean.hashCode(this.isRhcApp)) * 31) + this.cryptoOrderContext.hashCode()) * 31;
            ServerDrivenAlert serverDrivenAlert = this.powerInfoAlert;
            int iHashCode2 = (((((iHashCode + (serverDrivenAlert == null ? 0 : serverDrivenAlert.hashCode())) * 31) + Boolean.hashCode(this.isRecurringHookEnabled)) * 31) + Boolean.hashCode(this.isRecurringHookVisible)) * 31;
            ApiInvestmentSchedule.Frequency frequency = this.recurringHookFrequency;
            int iHashCode3 = (iHashCode2 + (frequency == null ? 0 : frequency.hashCode())) * 31;
            CryptoQuoteOrderError cryptoQuoteOrderError = this.error;
            int iHashCode4 = (((((iHashCode3 + (cryptoQuoteOrderError == null ? 0 : cryptoQuoteOrderError.hashCode())) * 31) + Boolean.hashCode(this.isMarketOrderPillsMicrogramMigrationEnabled)) * 31) + this.quickTradeButtons.hashCode()) * 31;
            CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState = this._cryptoOrderReviewMessageAndDisclosuresState;
            return ((iHashCode4 + (cryptoOrderReviewMessageAndDisclosuresState != null ? cryptoOrderReviewMessageAndDisclosuresState.hashCode() : 0)) * 31) + Boolean.hashCode(this.isMibExperimentEnabled);
        }

        public String toString() {
            return "OrderContextViewState(input=" + this.input + ", isRhcApp=" + this.isRhcApp + ", cryptoOrderContext=" + this.cryptoOrderContext + ", powerInfoAlert=" + this.powerInfoAlert + ", isRecurringHookEnabled=" + this.isRecurringHookEnabled + ", isRecurringHookVisible=" + this.isRecurringHookVisible + ", recurringHookFrequency=" + this.recurringHookFrequency + ", error=" + this.error + ", isMarketOrderPillsMicrogramMigrationEnabled=" + this.isMarketOrderPillsMicrogramMigrationEnabled + ", quickTradeButtons=" + this.quickTradeButtons + ", _cryptoOrderReviewMessageAndDisclosuresState=" + this._cryptoOrderReviewMessageAndDisclosuresState + ", isMibExperimentEnabled=" + this.isMibExperimentEnabled + ")";
        }

        public OrderContextViewState(CryptoOrderInput input, boolean z, CryptoOrderContext cryptoOrderContext, ServerDrivenAlert serverDrivenAlert, boolean z2, boolean z3, ApiInvestmentSchedule.Frequency frequency, CryptoQuoteOrderError cryptoQuoteOrderError, boolean z4, ImmutableList<CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto> quickTradeButtons, CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, boolean z5) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(cryptoOrderContext, "cryptoOrderContext");
            Intrinsics.checkNotNullParameter(quickTradeButtons, "quickTradeButtons");
            this.input = input;
            this.isRhcApp = z;
            this.cryptoOrderContext = cryptoOrderContext;
            this.powerInfoAlert = serverDrivenAlert;
            this.isRecurringHookEnabled = z2;
            this.isRecurringHookVisible = z3;
            this.recurringHookFrequency = frequency;
            this.error = cryptoQuoteOrderError;
            this.isMarketOrderPillsMicrogramMigrationEnabled = z4;
            this.quickTradeButtons = quickTradeButtons;
            this._cryptoOrderReviewMessageAndDisclosuresState = cryptoOrderReviewMessageAndDisclosuresState;
            this.isMibExperimentEnabled = z5;
            this.isRecurringOrder = z2 && frequency != null;
            this.quoteCostCurrency = cryptoOrderContext.getRequestContext().getCurrencyPair().getQuoteCurrencyForCost();
            this.quotePriceCurrency = cryptoOrderContext.getRequestContext().getCurrencyPair().getQuoteCurrencyForPriceInput();
            this.bidPrice = cryptoOrderContext.getBidPrice();
            this.askPrice = cryptoOrderContext.getAskPrice();
            this.resultShowsClickablePriceEstimate = input.getIsReviewing();
            this.rebate = cryptoOrderContext.getRequestContext().getCurrencyPair().getRebate();
        }

        public /* synthetic */ OrderContextViewState(CryptoOrderInput cryptoOrderInput, boolean z, CryptoOrderContext cryptoOrderContext, ServerDrivenAlert serverDrivenAlert, boolean z2, boolean z3, ApiInvestmentSchedule.Frequency frequency, CryptoQuoteOrderError cryptoQuoteOrderError, boolean z4, ImmutableList immutableList, CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(cryptoOrderInput, z, cryptoOrderContext, (i & 8) != 0 ? null : serverDrivenAlert, z2, z3, (i & 64) != 0 ? null : frequency, (i & 128) != 0 ? null : cryptoQuoteOrderError, (i & 256) != 0 ? false : z4, immutableList, cryptoOrderReviewMessageAndDisclosuresState, z5);
        }

        public final CryptoOrderInput getInput() {
            return this.input;
        }

        public final boolean isRhcApp() {
            return this.isRhcApp;
        }

        public final CryptoOrderContext getCryptoOrderContext() {
            return this.cryptoOrderContext;
        }

        public final ServerDrivenAlert getPowerInfoAlert() {
            return this.powerInfoAlert;
        }

        public final CryptoQuoteOrderError getError() {
            return this.error;
        }

        public final boolean isMarketOrderPillsMicrogramMigrationEnabled() {
            return this.isMarketOrderPillsMicrogramMigrationEnabled;
        }

        public final ImmutableList<CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto> getQuickTradeButtons() {
            return this.quickTradeButtons;
        }

        public final boolean isMibExperimentEnabled() {
            return this.isMibExperimentEnabled;
        }

        /* renamed from: isRecurringOrder$feature_trade_crypto_externalDebug, reason: from getter */
        public final boolean getIsRecurringOrder() {
            return this.isRecurringOrder;
        }

        public final CryptoOrderContext.RequestData getRequest$feature_trade_crypto_externalDebug() {
            return this.cryptoOrderContext.getRequest();
        }

        public final CryptoOrderContext.RequestContext getRequestContext$feature_trade_crypto_externalDebug() {
            return this.cryptoOrderContext.getRequestContext();
        }

        public final CryptoOrderContext.AccountContext getAccountContext$feature_trade_crypto_externalDebug() {
            return this.cryptoOrderContext.getAccountContext();
        }

        /* renamed from: getQuoteCostCurrency$feature_trade_crypto_externalDebug, reason: from getter */
        public final Currency getQuoteCostCurrency() {
            return this.quoteCostCurrency;
        }

        /* renamed from: getQuotePriceCurrency$feature_trade_crypto_externalDebug, reason: from getter */
        public final Currency getQuotePriceCurrency() {
            return this.quotePriceCurrency;
        }

        /* renamed from: getBidPrice$feature_trade_crypto_externalDebug, reason: from getter */
        public final Money getBidPrice() {
            return this.bidPrice;
        }

        /* renamed from: getAskPrice$feature_trade_crypto_externalDebug, reason: from getter */
        public final Money getAskPrice() {
            return this.askPrice;
        }

        public final BigDecimal getMaxOrderAmount() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.input.getOrderSide$feature_trade_crypto_externalDebug().ordinal()];
            if (i == 1) {
                BigDecimal bigDecimalMultiply = this.askPrice.getDecimalValue().multiply(getRequestContext$feature_trade_crypto_externalDebug().getCurrencyPair().getMaxOrderSize());
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                return bigDecimalMultiply;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal bigDecimalMultiply2 = this.bidPrice.getDecimalValue().multiply(getRequestContext$feature_trade_crypto_externalDebug().getCurrencyPair().getMaxOrderSize());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            return bigDecimalMultiply2;
        }

        public final boolean getResultShowsClickablePriceEstimate() {
            return this.resultShowsClickablePriceEstimate;
        }

        public final StringResource getResult() {
            int i;
            if (this.isRecurringHookVisible || BigDecimals7.isZero(this.input.getAmount$feature_trade_crypto_externalDebug())) {
                return null;
            }
            if (this.error == CryptoQuoteOrderError.GREATER_THAN_MAX) {
                return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_status_too_large, CurrencyDefinitions.formatCurrency$default(this.input.getUiCurrencyPair$feature_trade_crypto_externalDebug().getQuoteCurrency(), getMaxOrderAmount(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
            }
            if (this.resultShowsClickablePriceEstimate) {
                StringResource.Companion companion = StringResource.INSTANCE;
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.input.getOrderSide$feature_trade_crypto_externalDebug().ordinal()];
                if (i2 == 1) {
                    i = C40095R.string.crypto_order_create_price_label_v2_with_symbol_and_value_ask;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C40095R.string.crypto_order_create_price_label_v2_with_symbol_and_value_bid;
                }
                return companion.invoke(i, this.input.getUiCurrencyPair$feature_trade_crypto_externalDebug().getAssetCurrency().getCode(), CurrencyDefinitions.formatCurrency$default(this.input.getUiCurrencyPair$feature_trade_crypto_externalDebug().getQuoteCurrencyForPriceInput(), this.cryptoOrderContext.getOrderInfo().getUncollaredPrice(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
            }
            return StringResource.INSTANCE.invoke(C40095R.string.crypto_order_create_result_m2, CurrencyDefinitions.formatCurrency$default(this.input.getUiCurrencyPair$feature_trade_crypto_externalDebug().getAssetCurrencyForCost(), this.cryptoOrderContext.getOrderInfo().getDisplayQuantity(), false, false, null, 0, null, null, false, false, false, false, 2046, null));
        }

        public final ActionViewState.QuickTrades getQuickTradeBuy$feature_trade_crypto_externalDebug() {
            Currency quoteCurrency = this.input.getUiCurrencyPair$feature_trade_crypto_externalDebug().getQuoteCurrency();
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            Currency currencyCopy$default = Currency.copy$default(quoteCurrency, null, null, null, ONE, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
            InputAmount.Companion companion = InputAmount.INSTANCE;
            ActionViewState.QuickTrade.AmountQuote amountQuote = new ActionViewState.QuickTrade.AmountQuote(currencyCopy$default, companion.fromAmount(new BigDecimal(Constants.SdidMigrationStatusCodes.ALREADY_SDID)), null, this.isRecurringOrder, 1, 4, null);
            Currency quoteCurrency2 = this.input.getUiCurrencyPair$feature_trade_crypto_externalDebug().getQuoteCurrency();
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            ActionViewState.QuickTrade.AmountQuote amountQuote2 = new ActionViewState.QuickTrade.AmountQuote(Currency.copy$default(quoteCurrency2, null, null, null, ONE, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null), companion.fromAmount(new BigDecimal("10")), null, this.isRecurringOrder, 2, 4, null);
            Currency quoteCurrency3 = this.input.getUiCurrencyPair$feature_trade_crypto_externalDebug().getQuoteCurrency();
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            return new ActionViewState.QuickTrades(CollectionsKt.listOf((Object[]) new ActionViewState.QuickTrade.AmountQuote[]{amountQuote, amountQuote2, new ActionViewState.QuickTrade.AmountQuote(Currency.copy$default(quoteCurrency3, null, null, null, ONE, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null), companion.fromAmount(new BigDecimal("100")), null, this.isRecurringOrder, 3, 4, null)}), false, 2, null);
        }

        public final ActionViewState getQuickTradeSell$feature_trade_crypto_externalDebug() {
            if (BigDecimals7.isZero(this.cryptoOrderContext.getRequestContext().getSellingPower())) {
                return ActionViewState.Empty.INSTANCE;
            }
            ActionViewState.QuickTrade.Companion companion = ActionViewState.QuickTrade.INSTANCE;
            CryptoOrderContext cryptoOrderContext = this.cryptoOrderContext;
            CryptoInputMode cryptoInputMode = CryptoInputMode.QUOTE_CURRENCY;
            return new ActionViewState.QuickTrades(CollectionsKt.listOf((Object[]) new ActionViewState.QuickTrade[]{companion.getSellFractionQuickTrade(cryptoOrderContext, cryptoInputMode, 4, 1), companion.getSellFractionQuickTrade(this.cryptoOrderContext, cryptoInputMode, 2, 2), new ActionViewState.QuickTrade.SellAll(3)}), false, 2, null);
        }

        public final ActionViewState getActionViewState$feature_trade_crypto_externalDebug() {
            boolean z = this.cryptoOrderContext.getRequestContext().getSellingPower().compareTo(CryptoQuoteOrderViewState.INSTANCE.m2897x672e282c()) >= 0;
            boolean zIsZero = BigDecimals7.isZero(this.input.getAmount$feature_trade_crypto_externalDebug());
            if (this.isRhcApp) {
                return CryptoQuoteOrderViewStates.rhcActionViewState(this, z, zIsZero, BigDecimals7.isZero(getRequestContext$feature_trade_crypto_externalDebug().getSellingPower()), this.isRecurringOrder);
            }
            return traderActionViewState(z, zIsZero);
        }

        private final ActionViewState traderActionViewState(boolean hasMinHold, boolean inputAmountIsZero) {
            if (!this.cryptoOrderContext.isMonetizationModelDataLoaded()) {
                boolean z = this.isRecurringOrder;
                if (z) {
                    return new ActionViewState.Continue(true, false);
                }
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                return new ActionViewState.Review(false);
            }
            if (this.isMarketOrderPillsMicrogramMigrationEnabled) {
                return microgramMigrationExperimentViewState(inputAmountIsZero);
            }
            return controlTraderActionViewState(hasMinHold, inputAmountIsZero);
        }

        private final ActionViewState microgramMigrationExperimentViewState(boolean inputAmountIsZero) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.input.getOrderSide$feature_trade_crypto_externalDebug().ordinal()];
            if (i == 1) {
                if (!inputAmountIsZero || this.quickTradeButtons.isEmpty()) {
                    return this.isRecurringOrder ? new ActionViewState.Continue(true, !inputAmountIsZero) : new ActionViewState.Review(!inputAmountIsZero);
                }
                return CryptoQuoteOrderTradePills.tradeButtonsToQuickTrade(this, this.quickTradeButtons);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (inputAmountIsZero && !this.quickTradeButtons.isEmpty()) {
                return CryptoQuoteOrderTradePills.tradeButtonsToQuickTrade(this, this.quickTradeButtons);
            }
            return new ActionViewState.Review(!inputAmountIsZero);
        }

        private final ActionViewState controlTraderActionViewState(boolean hasMinHold, boolean inputAmountIsZero) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.input.getOrderSide$feature_trade_crypto_externalDebug().ordinal()];
            if (i == 1) {
                if (inputAmountIsZero) {
                    return getQuickTradeBuy$feature_trade_crypto_externalDebug();
                }
                return this.isRecurringOrder ? new ActionViewState.Continue(true, false, 2, null) : new ActionViewState.Review(true);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (inputAmountIsZero && hasMinHold) {
                return getQuickTradeSell$feature_trade_crypto_externalDebug();
            }
            if (inputAmountIsZero) {
                return ActionViewState.SellAll.INSTANCE;
            }
            return new ActionViewState.Review(true);
        }

        public final int getPowerInfoIconRes() {
            if (this.powerInfoAlert == null || getCryptoPowerText() == null) {
                return 0;
            }
            return C20690R.drawable.ic_rds_question_16dp;
        }

        public final StringResource getCryptoPowerText() {
            if (this.input.getIsReviewing()) {
                return null;
            }
            return CryptoOrderContexts.getCryptoPowerText(this.cryptoOrderContext);
        }

        public final Money getBuySpread() {
            return this.askPrice.times(this.cryptoOrderContext.getOrderInfo().getDisplayQuantity()).times(this.cryptoOrderContext.getBuySpreadFraction());
        }

        public final Money getSellSpread() {
            return this.bidPrice.times(this.cryptoOrderContext.getOrderInfo().getDisplayQuantity()).times(this.cryptoOrderContext.getSellSpreadFraction());
        }

        public final BigDecimal getRebate() {
            return this.rebate;
        }

        /* renamed from: getCryptoOrderReviewMessageAndDisclosuresState$feature_trade_crypto_externalDebug */
        public final CryptoOrderReviewMessageAndDisclosuresState m2898xc5d7f028() {
            if (this.input.getIsReviewing()) {
                return this._cryptoOrderReviewMessageAndDisclosuresState;
            }
            return null;
        }
    }

    /* compiled from: CryptoQuoteOrderViewState.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u001d\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u001eJ\u000e\u0010\u001f\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b J\u000e\u0010!\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\"J\u000e\u0010#\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b$J\u000e\u0010%\u001a\u00020\u000bHÀ\u0003¢\u0006\u0002\b&J\u000e\u0010'\u001a\u00020\rHÀ\u0003¢\u0006\u0002\b(JE\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u0006/"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$CryptoOrderInput;", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "amount", "Ljava/math/BigDecimal;", "currencyInputText", "", "formState", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "isSellAllOrder", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/db/OrderSide;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/robinhood/android/lib/trade/DefaultOrderState;Z)V", "getUiCurrencyPair$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getOrderSide$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/db/OrderSide;", "getAmount$feature_trade_crypto_externalDebug", "()Ljava/math/BigDecimal;", "getCurrencyInputText$feature_trade_crypto_externalDebug", "()Ljava/lang/String;", "getFormState$feature_trade_crypto_externalDebug", "()Lcom/robinhood/android/lib/trade/DefaultOrderState;", "isSellAllOrder$feature_trade_crypto_externalDebug", "()Z", "isReviewing", "component1", "component1$feature_trade_crypto_externalDebug", "component2", "component2$feature_trade_crypto_externalDebug", "component3", "component3$feature_trade_crypto_externalDebug", "component4", "component4$feature_trade_crypto_externalDebug", "component5", "component5$feature_trade_crypto_externalDebug", "component6", "component6$feature_trade_crypto_externalDebug", "copy", "equals", "other", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CryptoOrderInput {
        public static final int $stable = 8;
        private final BigDecimal amount;
        private final String currencyInputText;
        private final DefaultOrderState formState;
        private final boolean isReviewing;
        private final boolean isSellAllOrder;
        private final OrderSide orderSide;
        private final UiCurrencyPair uiCurrencyPair;

        public static /* synthetic */ CryptoOrderInput copy$default(CryptoOrderInput cryptoOrderInput, UiCurrencyPair uiCurrencyPair, OrderSide orderSide, BigDecimal bigDecimal, String str, DefaultOrderState defaultOrderState, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCurrencyPair = cryptoOrderInput.uiCurrencyPair;
            }
            if ((i & 2) != 0) {
                orderSide = cryptoOrderInput.orderSide;
            }
            if ((i & 4) != 0) {
                bigDecimal = cryptoOrderInput.amount;
            }
            if ((i & 8) != 0) {
                str = cryptoOrderInput.currencyInputText;
            }
            if ((i & 16) != 0) {
                defaultOrderState = cryptoOrderInput.formState;
            }
            if ((i & 32) != 0) {
                z = cryptoOrderInput.isSellAllOrder;
            }
            DefaultOrderState defaultOrderState2 = defaultOrderState;
            boolean z2 = z;
            return cryptoOrderInput.copy(uiCurrencyPair, orderSide, bigDecimal, str, defaultOrderState2, z2);
        }

        /* renamed from: component1$feature_trade_crypto_externalDebug, reason: from getter */
        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        /* renamed from: component2$feature_trade_crypto_externalDebug, reason: from getter */
        public final OrderSide getOrderSide() {
            return this.orderSide;
        }

        /* renamed from: component3$feature_trade_crypto_externalDebug, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component4$feature_trade_crypto_externalDebug, reason: from getter */
        public final String getCurrencyInputText() {
            return this.currencyInputText;
        }

        /* renamed from: component5$feature_trade_crypto_externalDebug, reason: from getter */
        public final DefaultOrderState getFormState() {
            return this.formState;
        }

        /* renamed from: component6$feature_trade_crypto_externalDebug, reason: from getter */
        public final boolean getIsSellAllOrder() {
            return this.isSellAllOrder;
        }

        public final CryptoOrderInput copy(UiCurrencyPair uiCurrencyPair, OrderSide orderSide, BigDecimal amount, String currencyInputText, DefaultOrderState formState, boolean isSellAllOrder) {
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(currencyInputText, "currencyInputText");
            Intrinsics.checkNotNullParameter(formState, "formState");
            return new CryptoOrderInput(uiCurrencyPair, orderSide, amount, currencyInputText, formState, isSellAllOrder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CryptoOrderInput)) {
                return false;
            }
            CryptoOrderInput cryptoOrderInput = (CryptoOrderInput) other;
            return Intrinsics.areEqual(this.uiCurrencyPair, cryptoOrderInput.uiCurrencyPair) && this.orderSide == cryptoOrderInput.orderSide && Intrinsics.areEqual(this.amount, cryptoOrderInput.amount) && Intrinsics.areEqual(this.currencyInputText, cryptoOrderInput.currencyInputText) && this.formState == cryptoOrderInput.formState && this.isSellAllOrder == cryptoOrderInput.isSellAllOrder;
        }

        public int hashCode() {
            return (((((((((this.uiCurrencyPair.hashCode() * 31) + this.orderSide.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.currencyInputText.hashCode()) * 31) + this.formState.hashCode()) * 31) + Boolean.hashCode(this.isSellAllOrder);
        }

        public String toString() {
            return "CryptoOrderInput(uiCurrencyPair=" + this.uiCurrencyPair + ", orderSide=" + this.orderSide + ", amount=" + this.amount + ", currencyInputText=" + this.currencyInputText + ", formState=" + this.formState + ", isSellAllOrder=" + this.isSellAllOrder + ")";
        }

        public CryptoOrderInput(UiCurrencyPair uiCurrencyPair, OrderSide orderSide, BigDecimal amount, String currencyInputText, DefaultOrderState formState, boolean z) {
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(currencyInputText, "currencyInputText");
            Intrinsics.checkNotNullParameter(formState, "formState");
            this.uiCurrencyPair = uiCurrencyPair;
            this.orderSide = orderSide;
            this.amount = amount;
            this.currencyInputText = currencyInputText;
            this.formState = formState;
            this.isSellAllOrder = z;
            this.isReviewing = formState.getIsReviewingState();
        }

        public final UiCurrencyPair getUiCurrencyPair$feature_trade_crypto_externalDebug() {
            return this.uiCurrencyPair;
        }

        public final OrderSide getOrderSide$feature_trade_crypto_externalDebug() {
            return this.orderSide;
        }

        public /* synthetic */ CryptoOrderInput(UiCurrencyPair uiCurrencyPair, OrderSide orderSide, BigDecimal bigDecimal, String str, DefaultOrderState defaultOrderState, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uiCurrencyPair, orderSide, (i & 4) != 0 ? BigDecimal.ZERO : bigDecimal, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? DefaultOrderState.EDITING : defaultOrderState, (i & 32) != 0 ? false : z);
        }

        public final BigDecimal getAmount$feature_trade_crypto_externalDebug() {
            return this.amount;
        }

        public final String getCurrencyInputText$feature_trade_crypto_externalDebug() {
            return this.currencyInputText;
        }

        public final DefaultOrderState getFormState$feature_trade_crypto_externalDebug() {
            return this.formState;
        }

        public final boolean isSellAllOrder$feature_trade_crypto_externalDebug() {
            return this.isSellAllOrder;
        }

        /* renamed from: isReviewing, reason: from getter */
        public final boolean getIsReviewing() {
            return this.isReviewing;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoQuoteOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$CryptoQuoteOrderError;", "", "<init>", "(Ljava/lang/String;I)V", "LESS_THAN_MIN", "GREATER_THAN_MAX", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CryptoQuoteOrderError {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CryptoQuoteOrderError[] $VALUES;
        public static final CryptoQuoteOrderError LESS_THAN_MIN = new CryptoQuoteOrderError("LESS_THAN_MIN", 0);
        public static final CryptoQuoteOrderError GREATER_THAN_MAX = new CryptoQuoteOrderError("GREATER_THAN_MAX", 1);

        private static final /* synthetic */ CryptoQuoteOrderError[] $values() {
            return new CryptoQuoteOrderError[]{LESS_THAN_MIN, GREATER_THAN_MAX};
        }

        public static EnumEntries<CryptoQuoteOrderError> getEntries() {
            return $ENTRIES;
        }

        private CryptoQuoteOrderError(String str, int i) {
        }

        static {
            CryptoQuoteOrderError[] cryptoQuoteOrderErrorArr$values = $values();
            $VALUES = cryptoQuoteOrderErrorArr$values;
            $ENTRIES = EnumEntries2.enumEntries(cryptoQuoteOrderErrorArr$values);
        }

        public static CryptoQuoteOrderError valueOf(String str) {
            return (CryptoQuoteOrderError) Enum.valueOf(CryptoQuoteOrderError.class, str);
        }

        public static CryptoQuoteOrderError[] values() {
            return (CryptoQuoteOrderError[]) $VALUES.clone();
        }
    }

    /* compiled from: CryptoQuoteOrderViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0004\u001a\u00020\u00058@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState$Companion;", "", "<init>", "()V", "decimalSeparator", "", "getDecimalSeparator$feature_trade_crypto_externalDebug$annotations", "getDecimalSeparator$feature_trade_crypto_externalDebug", "()Ljava/lang/String;", "decimalSeparator$delegate", "Lkotlin/Lazy;", "MIN_SELLING_POWER_FOR_QUICK_SELL", "Ljava/math/BigDecimal;", "getMIN_SELLING_POWER_FOR_QUICK_SELL$feature_trade_crypto_externalDebug", "()Ljava/math/BigDecimal;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDecimalSeparator$feature_trade_crypto_externalDebug$annotations */
        public static /* synthetic */ void m2896x58636288() {
        }

        private Companion() {
        }

        public final String getDecimalSeparator$feature_trade_crypto_externalDebug() {
            return (String) CryptoQuoteOrderViewState.decimalSeparator$delegate.getValue();
        }

        /* renamed from: getMIN_SELLING_POWER_FOR_QUICK_SELL$feature_trade_crypto_externalDebug */
        public final BigDecimal m2897x672e282c() {
            return CryptoQuoteOrderViewState.MIN_SELLING_POWER_FOR_QUICK_SELL;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String decimalSeparator_delegate$lambda$2() {
        return String.valueOf(Locales2.getMonetaryDecimalSeparator(CurrencyFormatterLocale.INSTANCE.getInstance().getCryptoLocale()));
    }
}
