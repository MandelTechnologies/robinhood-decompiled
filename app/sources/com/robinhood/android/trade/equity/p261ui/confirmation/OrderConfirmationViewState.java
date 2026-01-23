package com.robinhood.android.trade.equity.p261ui.confirmation;

import android.content.res.Resources;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.recurring.upsell.RecurringOrderUpsellManager;
import com.robinhood.android.equities.orderstatus.C14743R;
import com.robinhood.android.equities.orderstatus.OrderConfirmationDescription;
import com.robinhood.android.equities.orderstatus.OrderConfirmationStatusString;
import com.robinhood.android.lib.margin.api.ApiMarginUpsell;
import com.robinhood.android.margin.contracts.MarginAccountUpsellFragmentKey;
import com.robinhood.android.margin.contracts.SlipUpsellKey;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.models.api.AccountType;
import com.robinhood.models.api.EquityOrderState;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.ClientComponentAlert;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p320db.bonfire.WithholdingEstimatedAmount;
import com.robinhood.models.p320db.bonfire.WithholdingStatus;
import com.robinhood.models.p355ui.IacUpsell;
import com.robinhood.models.util.Money;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import equity_order_summary.proto.p459v1.StreamOrderConfirmationResponseDto;
import equity_trading_tax_lots.proto.p460v1.LotSourceType;
import equity_trading_tax_lots.proto.p460v1.OrderSummaryDetails;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSummaryResponse;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import microgram.android.Monitoring;

/* compiled from: OrderConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bD\b\u0087\b\u0018\u00002\u00020\u0001:\bÐ\u0001Ñ\u0001Ò\u0001Ó\u0001BÝ\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0007\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010\"\u001a\u00020\u0007\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010'\u001a\u00020\u0007\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010-\u001a\u00020\u0007\u0012\b\b\u0002\u0010.\u001a\u00020\u0007\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u00101\u001a\u00020\u0007\u0012\b\b\u0002\u00102\u001a\u00020\u0007\u0012\b\b\u0002\u00103\u001a\u00020\u0007¢\u0006\u0004\b4\u00105J\u0014\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u00012\b\u0010\u008f\u0001\u001a\u00030\u0090\u0001J\u0017\u0010\u0091\u0001\u001a\u00020u2\u0006\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0003\b\u0092\u0001J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010±\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0010HÂ\u0003J\u0011\u0010³\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010BJ\n\u0010´\u0001\u001a\u00020\u0007HÆ\u0003J\u0012\u0010µ\u0001\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\n\u0010¶\u0001\u001a\u00020\u0018HÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u0012\u0010¹\u0001\u001a\u0004\u0018\u00010\u001eHÀ\u0003¢\u0006\u0003\bº\u0001J\n\u0010»\u0001\u001a\u00020\u0007HÂ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010!HÆ\u0003J\n\u0010½\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\n\u0010À\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010,HÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010Å\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u000100HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010È\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010É\u0001\u001a\u00020\u0007HÆ\u0003Jæ\u0002\u0010Ê\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00072\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010'\u001a\u00020\u00072\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020\u00072\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\b\b\u0002\u00101\u001a\u00020\u00072\b\b\u0002\u00102\u001a\u00020\u00072\b\b\u0002\u00103\u001a\u00020\u0007HÆ\u0001¢\u0006\u0003\u0010Ë\u0001J\u0015\u0010Ì\u0001\u001a\u00020\u00072\t\u0010Í\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Î\u0001\u001a\u00020\u0012HÖ\u0001J\u000b\u0010Ï\u0001\u001a\u00030\u008a\u0001HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010:R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010:R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bD\u0010:R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u000e\u0010\u001f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0011\u0010\"\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010:R\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010'\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bU\u0010:R\u0013\u0010(\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bV\u0010>R\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0013\u0010+\u001a\u0004\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0011\u0010-\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b[\u0010:R\u0011\u0010.\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010:R\u0013\u0010/\u001a\u0004\u0018\u000100¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0011\u00101\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010:R\u0011\u00102\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010:R\u0011\u00103\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u0010:R\u0013\u0010_\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010b\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010:R\u0011\u0010d\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\be\u0010:R\u0011\u0010f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bg\u0010:R\u0013\u0010h\u001a\u0004\u0018\u00010i8F¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0013\u0010l\u001a\u0004\u0018\u00010m¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0011\u0010p\u001a\u00020q8F¢\u0006\u0006\u001a\u0004\br\u0010sR\u0011\u0010t\u001a\u00020u¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0011\u0010x\u001a\u00020y¢\u0006\b\n\u0000\u001a\u0004\bz\u0010{R\u001a\u0010|\u001a\n\u0012\u0004\u0012\u00020~\u0018\u00010}8F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u00018F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018F¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0084\u0001R\u0013\u0010\u0087\u0001\u001a\u00020\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010:R\u001a\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001a\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008a\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u008c\u0001R\u0015\u0010\u0095\u0001\u001a\u0004\u0018\u00010u8F¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010wR\u0013\u0010\u0097\u0001\u001a\u00020\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010:R\u001e\u0010\u0099\u0001\u001a\u00020\u00078@X\u0081\u0004¢\u0006\u000f\u0012\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010:R\u0015\u0010\u009d\u0001\u001a\u0004\u0018\u00010u8F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010wR\u0015\u0010\u009f\u0001\u001a\u0004\u0018\u00010u8F¢\u0006\u0007\u001a\u0005\b \u0001\u0010wR\u0015\u0010¡\u0001\u001a\u0004\u0018\u00010u8F¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010wR\u0013\u0010£\u0001\u001a\u00020u8F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010wR\u0013\u0010¥\u0001\u001a\u00020u8F¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010wR\u0015\u0010§\u0001\u001a\u0004\u0018\u00010u8F¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010wR\u0015\u0010©\u0001\u001a\u0004\u0018\u00010u8F¢\u0006\u0007\u001a\u0005\bª\u0001\u0010w¨\u0006Ô\u0001"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState;", "", "activeAccount", "Lcom/robinhood/models/db/Account;", "instrument", "Lcom/robinhood/models/db/Instrument;", "isPreIpo", "", "isRecurringOrderEnabled", "marketHours", "Lcom/robinhood/models/db/MarketHours;", "currentOrder", "Lcom/robinhood/models/db/Order;", "quote", "Lcom/robinhood/models/db/Quote;", "suggestedRecurringUpsell", "Lcom/robinhood/android/common/recurring/upsell/RecurringOrderUpsellManager$RecurringUpsell;", "orderCount", "", "orderReceived", "dayTradeWarningEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/models/db/ClientComponentAlert;", "estimatedRemainingFees", "Ljava/math/BigDecimal;", "backupWithholdingEstimateAmountResponse", "Lcom/robinhood/models/db/bonfire/WithholdingEstimatedAmount;", "backupWithholdingAmountResponse", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "withholdingStatus", "Lcom/robinhood/models/db/bonfire/WithholdingStatus;", "mlpExperimentMember", "marginInvestingUpsell", "Lcom/robinhood/android/lib/margin/api/ApiMarginUpsell;", "isEligibleForNotificationUpsell", "slipUpsell", "Lcom/robinhood/android/margin/contracts/SlipUpsellKey;", "iacUpsell", "Lcom/robinhood/models/ui/IacUpsell;", "showMarginAccountUpsell", "replacedOrder", "microgramState", "Lmicrogram/android/MicrogramState;", "microgramConfirmationResult", "Lequity_order_summary/proto/v1/StreamOrderConfirmationResponseDto;", "microgramConfirmationExperimentMember", "showTaxLotsM1", "taxLotSummary", "Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponse;", "isAggressiveRecurringUpsellEnabled", "isTaxLots", "isUk", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Instrument;ZZLcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/Order;Lcom/robinhood/models/db/Quote;Lcom/robinhood/android/common/recurring/upsell/RecurringOrderUpsellManager$RecurringUpsell;Ljava/lang/Integer;ZLcom/robinhood/udf/UiEvent;Ljava/math/BigDecimal;Lcom/robinhood/models/db/bonfire/WithholdingEstimatedAmount;Lcom/robinhood/models/db/bonfire/WithholdingAmount;Lcom/robinhood/models/db/bonfire/WithholdingStatus;ZLcom/robinhood/android/lib/margin/api/ApiMarginUpsell;ZLcom/robinhood/android/margin/contracts/SlipUpsellKey;Lcom/robinhood/models/ui/IacUpsell;ZLcom/robinhood/models/db/Order;Lmicrogram/android/MicrogramState;Lequity_order_summary/proto/v1/StreamOrderConfirmationResponseDto;ZZLequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponse;ZZZ)V", "getActiveAccount", "()Lcom/robinhood/models/db/Account;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "()Z", "getMarketHours", "()Lcom/robinhood/models/db/MarketHours;", "getCurrentOrder", "()Lcom/robinhood/models/db/Order;", "getQuote", "()Lcom/robinhood/models/db/Quote;", "getOrderCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOrderReceived", "getDayTradeWarningEvent", "()Lcom/robinhood/udf/UiEvent;", "getEstimatedRemainingFees", "()Ljava/math/BigDecimal;", "getBackupWithholdingEstimateAmountResponse", "()Lcom/robinhood/models/db/bonfire/WithholdingEstimatedAmount;", "getBackupWithholdingAmountResponse", "()Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "getWithholdingStatus$feature_trade_equity_externalDebug", "()Lcom/robinhood/models/db/bonfire/WithholdingStatus;", "getMarginInvestingUpsell", "()Lcom/robinhood/android/lib/margin/api/ApiMarginUpsell;", "getSlipUpsell", "()Lcom/robinhood/android/margin/contracts/SlipUpsellKey;", "getIacUpsell", "()Lcom/robinhood/models/ui/IacUpsell;", "getShowMarginAccountUpsell", "getReplacedOrder", "getMicrogramState", "()Lmicrogram/android/MicrogramState;", "getMicrogramConfirmationResult", "()Lequity_order_summary/proto/v1/StreamOrderConfirmationResponseDto;", "getMicrogramConfirmationExperimentMember", "getShowTaxLotsM1", "getTaxLotSummary", "()Lequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponse;", "recurringUpsell", "getRecurringUpsell", "()Lcom/robinhood/android/common/recurring/upsell/RecurringOrderUpsellManager$RecurringUpsell;", "showAggressiveRecurringUpsell", "getShowAggressiveRecurringUpsell", "showPassiveRecurringUpsell", "getShowPassiveRecurringUpsell", "showSlipUpsell", "getShowSlipUpsell", "viewOrderAction", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$ViewOrderAction;", "getViewOrderAction", "()Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$ViewOrderAction;", "marginAccountUpsell", "Lcom/robinhood/android/margin/contracts/MarginAccountUpsellFragmentKey;", "getMarginAccountUpsell", "()Lcom/robinhood/android/margin/contracts/MarginAccountUpsellFragmentKey;", "doneAction", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction;", "getDoneAction", "()Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction;", "doneLabel", "Lcom/robinhood/utils/resource/StringResource;", "getDoneLabel", "()Lcom/robinhood/utils/resource/StringResource;", "upsellAction", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$UpsellAction;", "getUpsellAction", "()Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$UpsellAction;", "items", "", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationRowType;", "getItems", "()Ljava/util/List;", "estimatedWithholdingAmount", "Lcom/robinhood/models/util/Money$Adjustment;", "getEstimatedWithholdingAmount", "()Lcom/robinhood/models/util/Money$Adjustment;", "withholdingAmount", "getWithholdingAmount", "shouldRedirectToMarginUpgradeSassyFlow", "getShouldRedirectToMarginUpgradeSassyFlow", "microgramConfirmation", "", "getMicrogramConfirmation", "()Ljava/lang/String;", "getOrderConfirmationDescription", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$Description;", "resources", "Landroid/content/res/Resources;", "getViewOrderLinkText", "getViewOrderLinkText$feature_trade_equity_externalDebug", "microgramTitle", "getMicrogramTitle", "orderConfirmationStatus", "getOrderConfirmationStatus", "viewOrderButtonIsVisible", "getViewOrderButtonIsVisible", "hideViewOrderForCancelNew", "getHideViewOrderForCancelNew$feature_trade_equity_externalDebug$annotations", "()V", "getHideViewOrderForCancelNew$feature_trade_equity_externalDebug", "taxLotRowTitle", "getTaxLotRowTitle", "taxLotsRowTrailingTitle", "getTaxLotsRowTrailingTitle", "taxLotsTrailingSubtitle", "getTaxLotsTrailingSubtitle", "withholdingLabelString", "getWithholdingLabelString", "withholdingEstimateLabelString", "getWithholdingEstimateLabelString", "accountNameTitle", "getAccountNameTitle", "accountNameSubtitle", "getAccountNameSubtitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component15$feature_trade_equity_externalDebug", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "copy", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Instrument;ZZLcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/Order;Lcom/robinhood/models/db/Quote;Lcom/robinhood/android/common/recurring/upsell/RecurringOrderUpsellManager$RecurringUpsell;Ljava/lang/Integer;ZLcom/robinhood/udf/UiEvent;Ljava/math/BigDecimal;Lcom/robinhood/models/db/bonfire/WithholdingEstimatedAmount;Lcom/robinhood/models/db/bonfire/WithholdingAmount;Lcom/robinhood/models/db/bonfire/WithholdingStatus;ZLcom/robinhood/android/lib/margin/api/ApiMarginUpsell;ZLcom/robinhood/android/margin/contracts/SlipUpsellKey;Lcom/robinhood/models/ui/IacUpsell;ZLcom/robinhood/models/db/Order;Lmicrogram/android/MicrogramState;Lequity_order_summary/proto/v1/StreamOrderConfirmationResponseDto;ZZLequity_trading_tax_lots/proto/v1/StreamTaxLotsSummaryResponse;ZZZ)Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState;", "equals", "other", "hashCode", "toString", "Description", "ViewOrderAction", "DoneAction", "UpsellAction", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class OrderConfirmationViewState {
    public static final int $stable = 8;
    private final Account activeAccount;
    private final WithholdingAmount backupWithholdingAmountResponse;
    private final WithholdingEstimatedAmount backupWithholdingEstimateAmountResponse;
    private final Order currentOrder;
    private final UiEvent<ClientComponentAlert> dayTradeWarningEvent;
    private final StringResource doneLabel;
    private final BigDecimal estimatedRemainingFees;
    private final IacUpsell iacUpsell;
    private final Instrument instrument;
    private final boolean isAggressiveRecurringUpsellEnabled;
    private final boolean isEligibleForNotificationUpsell;
    private final boolean isPreIpo;
    private final boolean isRecurringOrderEnabled;
    private final boolean isTaxLots;
    private final boolean isUk;
    private final MarginAccountUpsellFragmentKey marginAccountUpsell;
    private final ApiMarginUpsell marginInvestingUpsell;
    private final MarketHours marketHours;
    private final boolean microgramConfirmationExperimentMember;
    private final StreamOrderConfirmationResponseDto microgramConfirmationResult;
    private final Monitoring microgramState;
    private final boolean mlpExperimentMember;
    private final Integer orderCount;
    private final boolean orderReceived;
    private final Quote quote;
    private final Order replacedOrder;
    private final boolean shouldRedirectToMarginUpgradeSassyFlow;
    private final boolean showMarginAccountUpsell;
    private final boolean showTaxLotsM1;
    private final SlipUpsellKey slipUpsell;
    private final RecurringOrderUpsellManager.RecurringUpsell suggestedRecurringUpsell;
    private final StreamTaxLotsSummaryResponse taxLotSummary;
    private final UpsellAction upsellAction;
    private final boolean viewOrderButtonIsVisible;
    private final WithholdingStatus withholdingStatus;

    /* compiled from: OrderConfirmationViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RecurringOrderUpsellManager.RecurringUpsell.values().length];
            try {
                iArr[RecurringOrderUpsellManager.RecurringUpsell.PASSIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringOrderUpsellManager.RecurringUpsell.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringOrderUpsellManager.RecurringUpsell.AGGRESSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EquityOrderState.values().length];
            try {
                iArr2[EquityOrderState.UNCONFIRMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EquityOrderState.CONFIRMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EquityOrderState.QUEUED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EquityOrderState.PARTIALLY_FILLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EquityOrderState.FILLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EquityOrderState.PARTIALLY_FILLED_REST_CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EquityOrderState.REJECTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EquityOrderState.FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EquityOrderState.TRIGGERED.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[EquityOrderState.CANCELED.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[EquityOrderState.PENDING_CANCELLED.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[EquityOrderState.VOIDED.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[EquityOrderState.NEW.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[EquityOrderState.LOCATING.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[EquityOrderState.LOCATE_FAILED.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public OrderConfirmationViewState() {
        this(null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, false, null, false, null, null, false, null, null, null, false, false, null, false, false, false, 1073741823, null);
    }

    /* renamed from: component16, reason: from getter */
    private final boolean getMlpExperimentMember() {
        return this.mlpExperimentMember;
    }

    /* renamed from: component8, reason: from getter */
    private final RecurringOrderUpsellManager.RecurringUpsell getSuggestedRecurringUpsell() {
        return this.suggestedRecurringUpsell;
    }

    public static /* synthetic */ OrderConfirmationViewState copy$default(OrderConfirmationViewState orderConfirmationViewState, Account account, Instrument instrument, boolean z, boolean z2, MarketHours marketHours, Order order, Quote quote, RecurringOrderUpsellManager.RecurringUpsell recurringUpsell, Integer num, boolean z3, UiEvent uiEvent, BigDecimal bigDecimal, WithholdingEstimatedAmount withholdingEstimatedAmount, WithholdingAmount withholdingAmount, WithholdingStatus withholdingStatus, boolean z4, ApiMarginUpsell apiMarginUpsell, boolean z5, SlipUpsellKey slipUpsellKey, IacUpsell iacUpsell, boolean z6, Order order2, Monitoring monitoring, StreamOrderConfirmationResponseDto streamOrderConfirmationResponseDto, boolean z7, boolean z8, StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse, boolean z9, boolean z10, boolean z11, int i, Object obj) {
        boolean z12;
        boolean z13;
        Account account2 = (i & 1) != 0 ? orderConfirmationViewState.activeAccount : account;
        Instrument instrument2 = (i & 2) != 0 ? orderConfirmationViewState.instrument : instrument;
        boolean z14 = (i & 4) != 0 ? orderConfirmationViewState.isPreIpo : z;
        boolean z15 = (i & 8) != 0 ? orderConfirmationViewState.isRecurringOrderEnabled : z2;
        MarketHours marketHours2 = (i & 16) != 0 ? orderConfirmationViewState.marketHours : marketHours;
        Order order3 = (i & 32) != 0 ? orderConfirmationViewState.currentOrder : order;
        Quote quote2 = (i & 64) != 0 ? orderConfirmationViewState.quote : quote;
        RecurringOrderUpsellManager.RecurringUpsell recurringUpsell2 = (i & 128) != 0 ? orderConfirmationViewState.suggestedRecurringUpsell : recurringUpsell;
        Integer num2 = (i & 256) != 0 ? orderConfirmationViewState.orderCount : num;
        boolean z16 = (i & 512) != 0 ? orderConfirmationViewState.orderReceived : z3;
        UiEvent uiEvent2 = (i & 1024) != 0 ? orderConfirmationViewState.dayTradeWarningEvent : uiEvent;
        BigDecimal bigDecimal2 = (i & 2048) != 0 ? orderConfirmationViewState.estimatedRemainingFees : bigDecimal;
        WithholdingEstimatedAmount withholdingEstimatedAmount2 = (i & 4096) != 0 ? orderConfirmationViewState.backupWithholdingEstimateAmountResponse : withholdingEstimatedAmount;
        WithholdingAmount withholdingAmount2 = (i & 8192) != 0 ? orderConfirmationViewState.backupWithholdingAmountResponse : withholdingAmount;
        Account account3 = account2;
        WithholdingStatus withholdingStatus2 = (i & 16384) != 0 ? orderConfirmationViewState.withholdingStatus : withholdingStatus;
        boolean z17 = (i & 32768) != 0 ? orderConfirmationViewState.mlpExperimentMember : z4;
        ApiMarginUpsell apiMarginUpsell2 = (i & 65536) != 0 ? orderConfirmationViewState.marginInvestingUpsell : apiMarginUpsell;
        boolean z18 = (i & 131072) != 0 ? orderConfirmationViewState.isEligibleForNotificationUpsell : z5;
        SlipUpsellKey slipUpsellKey2 = (i & 262144) != 0 ? orderConfirmationViewState.slipUpsell : slipUpsellKey;
        IacUpsell iacUpsell2 = (i & 524288) != 0 ? orderConfirmationViewState.iacUpsell : iacUpsell;
        boolean z19 = (i & 1048576) != 0 ? orderConfirmationViewState.showMarginAccountUpsell : z6;
        Order order4 = (i & 2097152) != 0 ? orderConfirmationViewState.replacedOrder : order2;
        Monitoring monitoring2 = (i & 4194304) != 0 ? orderConfirmationViewState.microgramState : monitoring;
        StreamOrderConfirmationResponseDto streamOrderConfirmationResponseDto2 = (i & 8388608) != 0 ? orderConfirmationViewState.microgramConfirmationResult : streamOrderConfirmationResponseDto;
        boolean z20 = (i & 16777216) != 0 ? orderConfirmationViewState.microgramConfirmationExperimentMember : z7;
        boolean z21 = (i & 33554432) != 0 ? orderConfirmationViewState.showTaxLotsM1 : z8;
        StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse2 = (i & 67108864) != 0 ? orderConfirmationViewState.taxLotSummary : streamTaxLotsSummaryResponse;
        boolean z22 = (i & 134217728) != 0 ? orderConfirmationViewState.isAggressiveRecurringUpsellEnabled : z9;
        boolean z23 = (i & 268435456) != 0 ? orderConfirmationViewState.isTaxLots : z10;
        if ((i & 536870912) != 0) {
            z13 = z23;
            z12 = orderConfirmationViewState.isUk;
        } else {
            z12 = z11;
            z13 = z23;
        }
        return orderConfirmationViewState.copy(account3, instrument2, z14, z15, marketHours2, order3, quote2, recurringUpsell2, num2, z16, uiEvent2, bigDecimal2, withholdingEstimatedAmount2, withholdingAmount2, withholdingStatus2, z17, apiMarginUpsell2, z18, slipUpsellKey2, iacUpsell2, z19, order4, monitoring2, streamOrderConfirmationResponseDto2, z20, z21, streamTaxLotsSummaryResponse2, z22, z13, z12);
    }

    /* renamed from: getHideViewOrderForCancelNew$feature_trade_equity_externalDebug$annotations */
    public static /* synthetic */ void m2488x118feba8() {
    }

    /* renamed from: component1, reason: from getter */
    public final Account getActiveAccount() {
        return this.activeAccount;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getOrderReceived() {
        return this.orderReceived;
    }

    public final UiEvent<ClientComponentAlert> component11() {
        return this.dayTradeWarningEvent;
    }

    /* renamed from: component12, reason: from getter */
    public final BigDecimal getEstimatedRemainingFees() {
        return this.estimatedRemainingFees;
    }

    /* renamed from: component13, reason: from getter */
    public final WithholdingEstimatedAmount getBackupWithholdingEstimateAmountResponse() {
        return this.backupWithholdingEstimateAmountResponse;
    }

    /* renamed from: component14, reason: from getter */
    public final WithholdingAmount getBackupWithholdingAmountResponse() {
        return this.backupWithholdingAmountResponse;
    }

    /* renamed from: component15$feature_trade_equity_externalDebug, reason: from getter */
    public final WithholdingStatus getWithholdingStatus() {
        return this.withholdingStatus;
    }

    /* renamed from: component17, reason: from getter */
    public final ApiMarginUpsell getMarginInvestingUpsell() {
        return this.marginInvestingUpsell;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsEligibleForNotificationUpsell() {
        return this.isEligibleForNotificationUpsell;
    }

    /* renamed from: component19, reason: from getter */
    public final SlipUpsellKey getSlipUpsell() {
        return this.slipUpsell;
    }

    /* renamed from: component2, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component20, reason: from getter */
    public final IacUpsell getIacUpsell() {
        return this.iacUpsell;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getShowMarginAccountUpsell() {
        return this.showMarginAccountUpsell;
    }

    /* renamed from: component22, reason: from getter */
    public final Order getReplacedOrder() {
        return this.replacedOrder;
    }

    /* renamed from: component23, reason: from getter */
    public final Monitoring getMicrogramState() {
        return this.microgramState;
    }

    /* renamed from: component24, reason: from getter */
    public final StreamOrderConfirmationResponseDto getMicrogramConfirmationResult() {
        return this.microgramConfirmationResult;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getMicrogramConfirmationExperimentMember() {
        return this.microgramConfirmationExperimentMember;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getShowTaxLotsM1() {
        return this.showTaxLotsM1;
    }

    /* renamed from: component27, reason: from getter */
    public final StreamTaxLotsSummaryResponse getTaxLotSummary() {
        return this.taxLotSummary;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getIsAggressiveRecurringUpsellEnabled() {
        return this.isAggressiveRecurringUpsellEnabled;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getIsTaxLots() {
        return this.isTaxLots;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPreIpo() {
        return this.isPreIpo;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getIsUk() {
        return this.isUk;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsRecurringOrderEnabled() {
        return this.isRecurringOrderEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    /* renamed from: component6, reason: from getter */
    public final Order getCurrentOrder() {
        return this.currentOrder;
    }

    /* renamed from: component7, reason: from getter */
    public final Quote getQuote() {
        return this.quote;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getOrderCount() {
        return this.orderCount;
    }

    public final OrderConfirmationViewState copy(Account activeAccount, Instrument instrument, boolean isPreIpo, boolean isRecurringOrderEnabled, MarketHours marketHours, Order currentOrder, Quote quote, RecurringOrderUpsellManager.RecurringUpsell suggestedRecurringUpsell, Integer orderCount, boolean orderReceived, UiEvent<ClientComponentAlert> dayTradeWarningEvent, BigDecimal estimatedRemainingFees, WithholdingEstimatedAmount backupWithholdingEstimateAmountResponse, WithholdingAmount backupWithholdingAmountResponse, WithholdingStatus withholdingStatus, boolean mlpExperimentMember, ApiMarginUpsell marginInvestingUpsell, boolean isEligibleForNotificationUpsell, SlipUpsellKey slipUpsell, IacUpsell iacUpsell, boolean showMarginAccountUpsell, Order replacedOrder, Monitoring microgramState, StreamOrderConfirmationResponseDto microgramConfirmationResult, boolean microgramConfirmationExperimentMember, boolean showTaxLotsM1, StreamTaxLotsSummaryResponse taxLotSummary, boolean isAggressiveRecurringUpsellEnabled, boolean isTaxLots, boolean isUk) {
        Intrinsics.checkNotNullParameter(estimatedRemainingFees, "estimatedRemainingFees");
        return new OrderConfirmationViewState(activeAccount, instrument, isPreIpo, isRecurringOrderEnabled, marketHours, currentOrder, quote, suggestedRecurringUpsell, orderCount, orderReceived, dayTradeWarningEvent, estimatedRemainingFees, backupWithholdingEstimateAmountResponse, backupWithholdingAmountResponse, withholdingStatus, mlpExperimentMember, marginInvestingUpsell, isEligibleForNotificationUpsell, slipUpsell, iacUpsell, showMarginAccountUpsell, replacedOrder, microgramState, microgramConfirmationResult, microgramConfirmationExperimentMember, showTaxLotsM1, taxLotSummary, isAggressiveRecurringUpsellEnabled, isTaxLots, isUk);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderConfirmationViewState)) {
            return false;
        }
        OrderConfirmationViewState orderConfirmationViewState = (OrderConfirmationViewState) other;
        return Intrinsics.areEqual(this.activeAccount, orderConfirmationViewState.activeAccount) && Intrinsics.areEqual(this.instrument, orderConfirmationViewState.instrument) && this.isPreIpo == orderConfirmationViewState.isPreIpo && this.isRecurringOrderEnabled == orderConfirmationViewState.isRecurringOrderEnabled && Intrinsics.areEqual(this.marketHours, orderConfirmationViewState.marketHours) && Intrinsics.areEqual(this.currentOrder, orderConfirmationViewState.currentOrder) && Intrinsics.areEqual(this.quote, orderConfirmationViewState.quote) && this.suggestedRecurringUpsell == orderConfirmationViewState.suggestedRecurringUpsell && Intrinsics.areEqual(this.orderCount, orderConfirmationViewState.orderCount) && this.orderReceived == orderConfirmationViewState.orderReceived && Intrinsics.areEqual(this.dayTradeWarningEvent, orderConfirmationViewState.dayTradeWarningEvent) && Intrinsics.areEqual(this.estimatedRemainingFees, orderConfirmationViewState.estimatedRemainingFees) && Intrinsics.areEqual(this.backupWithholdingEstimateAmountResponse, orderConfirmationViewState.backupWithholdingEstimateAmountResponse) && Intrinsics.areEqual(this.backupWithholdingAmountResponse, orderConfirmationViewState.backupWithholdingAmountResponse) && Intrinsics.areEqual(this.withholdingStatus, orderConfirmationViewState.withholdingStatus) && this.mlpExperimentMember == orderConfirmationViewState.mlpExperimentMember && Intrinsics.areEqual(this.marginInvestingUpsell, orderConfirmationViewState.marginInvestingUpsell) && this.isEligibleForNotificationUpsell == orderConfirmationViewState.isEligibleForNotificationUpsell && Intrinsics.areEqual(this.slipUpsell, orderConfirmationViewState.slipUpsell) && Intrinsics.areEqual(this.iacUpsell, orderConfirmationViewState.iacUpsell) && this.showMarginAccountUpsell == orderConfirmationViewState.showMarginAccountUpsell && Intrinsics.areEqual(this.replacedOrder, orderConfirmationViewState.replacedOrder) && Intrinsics.areEqual(this.microgramState, orderConfirmationViewState.microgramState) && Intrinsics.areEqual(this.microgramConfirmationResult, orderConfirmationViewState.microgramConfirmationResult) && this.microgramConfirmationExperimentMember == orderConfirmationViewState.microgramConfirmationExperimentMember && this.showTaxLotsM1 == orderConfirmationViewState.showTaxLotsM1 && Intrinsics.areEqual(this.taxLotSummary, orderConfirmationViewState.taxLotSummary) && this.isAggressiveRecurringUpsellEnabled == orderConfirmationViewState.isAggressiveRecurringUpsellEnabled && this.isTaxLots == orderConfirmationViewState.isTaxLots && this.isUk == orderConfirmationViewState.isUk;
    }

    public int hashCode() {
        Account account = this.activeAccount;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        Instrument instrument = this.instrument;
        int iHashCode2 = (((((iHashCode + (instrument == null ? 0 : instrument.hashCode())) * 31) + Boolean.hashCode(this.isPreIpo)) * 31) + Boolean.hashCode(this.isRecurringOrderEnabled)) * 31;
        MarketHours marketHours = this.marketHours;
        int iHashCode3 = (iHashCode2 + (marketHours == null ? 0 : marketHours.hashCode())) * 31;
        Order order = this.currentOrder;
        int iHashCode4 = (iHashCode3 + (order == null ? 0 : order.hashCode())) * 31;
        Quote quote = this.quote;
        int iHashCode5 = (iHashCode4 + (quote == null ? 0 : quote.hashCode())) * 31;
        RecurringOrderUpsellManager.RecurringUpsell recurringUpsell = this.suggestedRecurringUpsell;
        int iHashCode6 = (iHashCode5 + (recurringUpsell == null ? 0 : recurringUpsell.hashCode())) * 31;
        Integer num = this.orderCount;
        int iHashCode7 = (((iHashCode6 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.orderReceived)) * 31;
        UiEvent<ClientComponentAlert> uiEvent = this.dayTradeWarningEvent;
        int iHashCode8 = (((iHashCode7 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + this.estimatedRemainingFees.hashCode()) * 31;
        WithholdingEstimatedAmount withholdingEstimatedAmount = this.backupWithholdingEstimateAmountResponse;
        int iHashCode9 = (iHashCode8 + (withholdingEstimatedAmount == null ? 0 : withholdingEstimatedAmount.hashCode())) * 31;
        WithholdingAmount withholdingAmount = this.backupWithholdingAmountResponse;
        int iHashCode10 = (iHashCode9 + (withholdingAmount == null ? 0 : withholdingAmount.hashCode())) * 31;
        WithholdingStatus withholdingStatus = this.withholdingStatus;
        int iHashCode11 = (((iHashCode10 + (withholdingStatus == null ? 0 : withholdingStatus.hashCode())) * 31) + Boolean.hashCode(this.mlpExperimentMember)) * 31;
        ApiMarginUpsell apiMarginUpsell = this.marginInvestingUpsell;
        int iHashCode12 = (((iHashCode11 + (apiMarginUpsell == null ? 0 : apiMarginUpsell.hashCode())) * 31) + Boolean.hashCode(this.isEligibleForNotificationUpsell)) * 31;
        SlipUpsellKey slipUpsellKey = this.slipUpsell;
        int iHashCode13 = (iHashCode12 + (slipUpsellKey == null ? 0 : slipUpsellKey.hashCode())) * 31;
        IacUpsell iacUpsell = this.iacUpsell;
        int iHashCode14 = (((iHashCode13 + (iacUpsell == null ? 0 : iacUpsell.hashCode())) * 31) + Boolean.hashCode(this.showMarginAccountUpsell)) * 31;
        Order order2 = this.replacedOrder;
        int iHashCode15 = (iHashCode14 + (order2 == null ? 0 : order2.hashCode())) * 31;
        Monitoring monitoring = this.microgramState;
        int iHashCode16 = (iHashCode15 + (monitoring == null ? 0 : monitoring.hashCode())) * 31;
        StreamOrderConfirmationResponseDto streamOrderConfirmationResponseDto = this.microgramConfirmationResult;
        int iHashCode17 = (((((iHashCode16 + (streamOrderConfirmationResponseDto == null ? 0 : streamOrderConfirmationResponseDto.hashCode())) * 31) + Boolean.hashCode(this.microgramConfirmationExperimentMember)) * 31) + Boolean.hashCode(this.showTaxLotsM1)) * 31;
        StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse = this.taxLotSummary;
        return ((((((iHashCode17 + (streamTaxLotsSummaryResponse != null ? streamTaxLotsSummaryResponse.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAggressiveRecurringUpsellEnabled)) * 31) + Boolean.hashCode(this.isTaxLots)) * 31) + Boolean.hashCode(this.isUk);
    }

    public String toString() {
        return "OrderConfirmationViewState(activeAccount=" + this.activeAccount + ", instrument=" + this.instrument + ", isPreIpo=" + this.isPreIpo + ", isRecurringOrderEnabled=" + this.isRecurringOrderEnabled + ", marketHours=" + this.marketHours + ", currentOrder=" + this.currentOrder + ", quote=" + this.quote + ", suggestedRecurringUpsell=" + this.suggestedRecurringUpsell + ", orderCount=" + this.orderCount + ", orderReceived=" + this.orderReceived + ", dayTradeWarningEvent=" + this.dayTradeWarningEvent + ", estimatedRemainingFees=" + this.estimatedRemainingFees + ", backupWithholdingEstimateAmountResponse=" + this.backupWithholdingEstimateAmountResponse + ", backupWithholdingAmountResponse=" + this.backupWithholdingAmountResponse + ", withholdingStatus=" + this.withholdingStatus + ", mlpExperimentMember=" + this.mlpExperimentMember + ", marginInvestingUpsell=" + this.marginInvestingUpsell + ", isEligibleForNotificationUpsell=" + this.isEligibleForNotificationUpsell + ", slipUpsell=" + this.slipUpsell + ", iacUpsell=" + this.iacUpsell + ", showMarginAccountUpsell=" + this.showMarginAccountUpsell + ", replacedOrder=" + this.replacedOrder + ", microgramState=" + this.microgramState + ", microgramConfirmationResult=" + this.microgramConfirmationResult + ", microgramConfirmationExperimentMember=" + this.microgramConfirmationExperimentMember + ", showTaxLotsM1=" + this.showTaxLotsM1 + ", taxLotSummary=" + this.taxLotSummary + ", isAggressiveRecurringUpsellEnabled=" + this.isAggressiveRecurringUpsellEnabled + ", isTaxLots=" + this.isTaxLots + ", isUk=" + this.isUk + ")";
    }

    public OrderConfirmationViewState(Account account, Instrument instrument, boolean z, boolean z2, MarketHours marketHours, Order order, Quote quote, RecurringOrderUpsellManager.RecurringUpsell recurringUpsell, Integer num, boolean z3, UiEvent<ClientComponentAlert> uiEvent, BigDecimal estimatedRemainingFees, WithholdingEstimatedAmount withholdingEstimatedAmount, WithholdingAmount withholdingAmount, WithholdingStatus withholdingStatus, boolean z4, ApiMarginUpsell apiMarginUpsell, boolean z5, SlipUpsellKey slipUpsellKey, IacUpsell iacUpsell, boolean z6, Order order2, Monitoring monitoring, StreamOrderConfirmationResponseDto streamOrderConfirmationResponseDto, boolean z7, boolean z8, StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse, boolean z9, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(estimatedRemainingFees, "estimatedRemainingFees");
        this.activeAccount = account;
        this.instrument = instrument;
        this.isPreIpo = z;
        this.isRecurringOrderEnabled = z2;
        this.marketHours = marketHours;
        this.currentOrder = order;
        this.quote = quote;
        this.suggestedRecurringUpsell = recurringUpsell;
        this.orderCount = num;
        this.orderReceived = z3;
        this.dayTradeWarningEvent = uiEvent;
        this.estimatedRemainingFees = estimatedRemainingFees;
        this.backupWithholdingEstimateAmountResponse = withholdingEstimatedAmount;
        this.backupWithholdingAmountResponse = withholdingAmount;
        this.withholdingStatus = withholdingStatus;
        this.mlpExperimentMember = z4;
        this.marginInvestingUpsell = apiMarginUpsell;
        this.isEligibleForNotificationUpsell = z5;
        this.slipUpsell = slipUpsellKey;
        this.iacUpsell = iacUpsell;
        this.showMarginAccountUpsell = z6;
        this.replacedOrder = order2;
        this.microgramState = monitoring;
        this.microgramConfirmationResult = streamOrderConfirmationResponseDto;
        this.microgramConfirmationExperimentMember = z7;
        this.showTaxLotsM1 = z8;
        this.taxLotSummary = streamTaxLotsSummaryResponse;
        this.isAggressiveRecurringUpsellEnabled = z9;
        this.isTaxLots = z10;
        this.isUk = z11;
        MarginAccountUpsellFragmentKey marginAccountUpsellFragmentKey = null;
        AccountType type2 = account != null ? account.getType() : null;
        AccountType accountType = AccountType.CASH;
        if (type2 == accountType && z6 && order != null && (adjustment = order.getAdjustment()) != null) {
            Money.Adjustment adjustment = adjustment.getDirection() != Money.Direction.CREDIT ? null : adjustment;
            if (adjustment != null) {
                marginAccountUpsellFragmentKey = new MarginAccountUpsellFragmentKey(order.getAccountNumber(), account.getBrokerageAccountType(), adjustment.getAmount());
            }
        }
        this.marginAccountUpsell = marginAccountUpsellFragmentKey;
        boolean z12 = false;
        this.doneLabel = StringResource.INSTANCE.invoke(C11048R.string.general_label_done, new Object[0]);
        this.upsellAction = new UpsellAction(order);
        this.shouldRedirectToMarginUpgradeSassyFlow = account != null && account.getType() == accountType;
        if (!getShowPassiveRecurringUpsell() && !getHideViewOrderForCancelNew$feature_trade_equity_externalDebug()) {
            z12 = true;
        }
        this.viewOrderButtonIsVisible = z12;
    }

    public final Account getActiveAccount() {
        return this.activeAccount;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final boolean isPreIpo() {
        return this.isPreIpo;
    }

    public final boolean isRecurringOrderEnabled() {
        return this.isRecurringOrderEnabled;
    }

    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final Order getCurrentOrder() {
        return this.currentOrder;
    }

    public final Quote getQuote() {
        return this.quote;
    }

    public final Integer getOrderCount() {
        return this.orderCount;
    }

    public final boolean getOrderReceived() {
        return this.orderReceived;
    }

    public final UiEvent<ClientComponentAlert> getDayTradeWarningEvent() {
        return this.dayTradeWarningEvent;
    }

    public /* synthetic */ OrderConfirmationViewState(Account account, Instrument instrument, boolean z, boolean z2, MarketHours marketHours, Order order, Quote quote, RecurringOrderUpsellManager.RecurringUpsell recurringUpsell, Integer num, boolean z3, UiEvent uiEvent, BigDecimal bigDecimal, WithholdingEstimatedAmount withholdingEstimatedAmount, WithholdingAmount withholdingAmount, WithholdingStatus withholdingStatus, boolean z4, ApiMarginUpsell apiMarginUpsell, boolean z5, SlipUpsellKey slipUpsellKey, IacUpsell iacUpsell, boolean z6, Order order2, Monitoring monitoring, StreamOrderConfirmationResponseDto streamOrderConfirmationResponseDto, boolean z7, boolean z8, StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse, boolean z9, boolean z10, boolean z11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : account, (i & 2) != 0 ? null : instrument, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : marketHours, (i & 32) != 0 ? null : order, (i & 64) != 0 ? null : quote, (i & 128) != 0 ? null : recurringUpsell, (i & 256) != 0 ? null : num, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? null : uiEvent, (i & 2048) != 0 ? BigDecimal.ZERO : bigDecimal, (i & 4096) != 0 ? null : withholdingEstimatedAmount, (i & 8192) != 0 ? null : withholdingAmount, (i & 16384) != 0 ? null : withholdingStatus, (i & 32768) != 0 ? false : z4, (i & 65536) != 0 ? null : apiMarginUpsell, (i & 131072) != 0 ? false : z5, (i & 262144) != 0 ? null : slipUpsellKey, (i & 524288) != 0 ? null : iacUpsell, (i & 1048576) != 0 ? false : z6, (i & 2097152) != 0 ? null : order2, (i & 4194304) != 0 ? null : monitoring, (i & 8388608) != 0 ? null : streamOrderConfirmationResponseDto, (i & 16777216) != 0 ? false : z7, (i & 33554432) != 0 ? false : z8, (i & 67108864) != 0 ? null : streamTaxLotsSummaryResponse, (i & 134217728) != 0 ? false : z9, (i & 268435456) != 0 ? false : z10, (i & 536870912) != 0 ? false : z11);
    }

    public final BigDecimal getEstimatedRemainingFees() {
        return this.estimatedRemainingFees;
    }

    public final WithholdingEstimatedAmount getBackupWithholdingEstimateAmountResponse() {
        return this.backupWithholdingEstimateAmountResponse;
    }

    public final WithholdingAmount getBackupWithholdingAmountResponse() {
        return this.backupWithholdingAmountResponse;
    }

    public final WithholdingStatus getWithholdingStatus$feature_trade_equity_externalDebug() {
        return this.withholdingStatus;
    }

    public final ApiMarginUpsell getMarginInvestingUpsell() {
        return this.marginInvestingUpsell;
    }

    public final boolean isEligibleForNotificationUpsell() {
        return this.isEligibleForNotificationUpsell;
    }

    public final SlipUpsellKey getSlipUpsell() {
        return this.slipUpsell;
    }

    public final IacUpsell getIacUpsell() {
        return this.iacUpsell;
    }

    public final boolean getShowMarginAccountUpsell() {
        return this.showMarginAccountUpsell;
    }

    public final Order getReplacedOrder() {
        return this.replacedOrder;
    }

    public final Monitoring getMicrogramState() {
        return this.microgramState;
    }

    public final StreamOrderConfirmationResponseDto getMicrogramConfirmationResult() {
        return this.microgramConfirmationResult;
    }

    public final boolean getMicrogramConfirmationExperimentMember() {
        return this.microgramConfirmationExperimentMember;
    }

    public final boolean getShowTaxLotsM1() {
        return this.showTaxLotsM1;
    }

    public final StreamTaxLotsSummaryResponse getTaxLotSummary() {
        return this.taxLotSummary;
    }

    public final boolean isAggressiveRecurringUpsellEnabled() {
        return this.isAggressiveRecurringUpsellEnabled;
    }

    public final boolean isTaxLots() {
        return this.isTaxLots;
    }

    public final boolean isUk() {
        return this.isUk;
    }

    public final RecurringOrderUpsellManager.RecurringUpsell getRecurringUpsell() {
        if (!this.isRecurringOrderEnabled || this.isPreIpo || getHideViewOrderForCancelNew$feature_trade_equity_externalDebug()) {
            return RecurringOrderUpsellManager.RecurringUpsell.NONE;
        }
        return this.suggestedRecurringUpsell;
    }

    private final boolean getShowAggressiveRecurringUpsell() {
        return getRecurringUpsell() != null && getRecurringUpsell() == RecurringOrderUpsellManager.RecurringUpsell.AGGRESSIVE && this.isAggressiveRecurringUpsellEnabled;
    }

    public final boolean getShowPassiveRecurringUpsell() {
        RecurringOrderUpsellManager.RecurringUpsell recurringUpsell = getRecurringUpsell();
        int i = recurringUpsell == null ? -1 : WhenMappings.$EnumSwitchMapping$0[recurringUpsell.ordinal()];
        if (i == -1) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean getShowSlipUpsell() {
        SlipUpsellKey slipUpsellKey = this.slipUpsell;
        return slipUpsellKey != null && slipUpsellKey.hasContents();
    }

    public final ViewOrderAction getViewOrderAction() {
        Order order;
        if (getHideViewOrderForCancelNew$feature_trade_equity_externalDebug() || (order = this.currentOrder) == null) {
            return null;
        }
        return new ViewOrderAction(order);
    }

    public final MarginAccountUpsellFragmentKey getMarginAccountUpsell() {
        return this.marginAccountUpsell;
    }

    public final DoneAction getDoneAction() {
        if (this.isEligibleForNotificationUpsell) {
            return new DoneAction.ShowNotificationUpsell(this.currentOrder);
        }
        if (getShowSlipUpsell() && this.slipUpsell != null) {
            return new DoneAction.SlipUpsell(this.slipUpsell, this.currentOrder);
        }
        if (this.iacUpsell != null) {
            return new DoneAction.ShowIacUpsell(this.currentOrder, this.iacUpsell);
        }
        if (getShowAggressiveRecurringUpsell()) {
            return DoneAction.ShowRecurringUpsell.INSTANCE;
        }
        ApiMarginUpsell apiMarginUpsell = this.marginInvestingUpsell;
        if (apiMarginUpsell != null && apiMarginUpsell.getShouldShowUpsell()) {
            return new DoneAction.MarginInvestingUpsell(this.marginInvestingUpsell);
        }
        if (this.marginAccountUpsell != null) {
            return new DoneAction.MarginAccountUpsell(this.marginAccountUpsell, this.currentOrder);
        }
        return new DoneAction.CompleteOrder(this.currentOrder);
    }

    public final StringResource getDoneLabel() {
        return this.doneLabel;
    }

    public final UpsellAction getUpsellAction() {
        return this.upsellAction;
    }

    public final List<OrderConfirmationRowType> getItems() {
        OrderConfirmationRowType orderConfirmationRowType;
        Sequence sequenceFilterNotNull;
        Sequence sequencePlus;
        Sequence sequenceFilterNotNull2;
        if (this.currentOrder == null) {
            return null;
        }
        OrderConfirmationRowType orderConfirmationRowType2 = getEstimatedWithholdingAmount() != null ? OrderConfirmationRowType.ESTIMATED_WITHHOLDING_AMOUNT : null;
        OrderConfirmationRowType orderConfirmationRowType3 = getEstimatedWithholdingAmount() != null ? OrderConfirmationRowType.ESTIMATED_COST_CREDIT : null;
        OrderConfirmationRowType orderConfirmationRowType4 = getWithholdingAmount() != null ? OrderConfirmationRowType.WITHHOLDING_AMOUNT : null;
        OrderConfirmationRowType orderConfirmationRowType5 = getWithholdingAmount() != null ? OrderConfirmationRowType.TOTAL_COST_CREDIT : null;
        StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse = this.taxLotSummary;
        if (streamTaxLotsSummaryResponse == null || !this.showTaxLotsM1) {
            orderConfirmationRowType = streamTaxLotsSummaryResponse != null ? OrderConfirmationRowType.TAX_LOTS : null;
        } else {
            orderConfirmationRowType = OrderConfirmationRowType.TAX_LOTS_M1;
        }
        if (this.currentOrder.isDollarBased()) {
            Sequence sequenceSequenceOf = SequencesKt.sequenceOf(OrderConfirmationRowType.AMOUNT);
            switch (WhenMappings.$EnumSwitchMapping$1[this.currentOrder.getState().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    sequenceFilterNotNull2 = SequencesKt.filterNotNull(SequencesKt.sequenceOf(OrderConfirmationRowType.ESTIMATED_SHARES, orderConfirmationRowType2, orderConfirmationRowType3));
                    break;
                case 4:
                    sequenceFilterNotNull2 = SequencesKt.filterNotNull(SequencesKt.sequenceOf(OrderConfirmationRowType.TOTAL_SHARES, OrderConfirmationRowType.AVERAGE_PRICE, OrderConfirmationRowType.PENDING_SHARES, orderConfirmationRowType4, orderConfirmationRowType5));
                    break;
                case 5:
                case 6:
                    sequenceFilterNotNull2 = SequencesKt.filterNotNull(SequencesKt.sequenceOf(OrderConfirmationRowType.TOTAL_SHARES, OrderConfirmationRowType.AVERAGE_PRICE, orderConfirmationRowType4, orderConfirmationRowType5));
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    sequenceFilterNotNull2 = SequencesKt.sequenceOf(OrderConfirmationRowType.TOTAL_SHARES);
                    break;
                case 14:
                case 15:
                    sequenceFilterNotNull2 = SequencesKt.emptySequence();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            sequencePlus = SequencesKt.plus(sequenceSequenceOf, sequenceFilterNotNull2);
        } else {
            Sequence sequenceFilterNotNull3 = SequencesKt.filterNotNull(SequencesKt.sequenceOf(orderConfirmationRowType, (this.showTaxLotsM1 && this.isTaxLots) ? null : OrderConfirmationRowType.TOTAL_SHARES_AS_SUBTOTAL));
            switch (WhenMappings.$EnumSwitchMapping$1[this.currentOrder.getState().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    sequenceFilterNotNull = SequencesKt.filterNotNull(SequencesKt.sequenceOf(orderConfirmationRowType2, OrderConfirmationRowType.ESTIMATED_COST_CREDIT));
                    break;
                case 4:
                    sequenceFilterNotNull = SequencesKt.filterNotNull(SequencesKt.sequenceOf(OrderConfirmationRowType.AVERAGE_PRICE, orderConfirmationRowType4, OrderConfirmationRowType.TOTAL_COST_CREDIT, OrderConfirmationRowType.PENDING_COST_CREDIT));
                    break;
                case 5:
                case 6:
                    sequenceFilterNotNull = SequencesKt.filterNotNull(SequencesKt.sequenceOf(OrderConfirmationRowType.AVERAGE_PRICE, orderConfirmationRowType4, OrderConfirmationRowType.TOTAL_COST_CREDIT));
                    break;
                case 7:
                case 8:
                case 10:
                case 11:
                    sequenceFilterNotNull = SequencesKt.sequenceOf(OrderConfirmationRowType.AVERAGE_PRICE, OrderConfirmationRowType.TOTAL_COST_CREDIT);
                    break;
                case 9:
                case 12:
                case 13:
                    sequenceFilterNotNull = SequencesKt.sequenceOf(OrderConfirmationRowType.TOTAL_COST_CREDIT);
                    break;
                case 14:
                case 15:
                    sequenceFilterNotNull = SequencesKt.emptySequence();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            sequencePlus = SequencesKt.plus(sequenceFilterNotNull3, sequenceFilterNotNull);
        }
        return SequencesKt.toList(SequencesKt.plus((Sequence<? extends OrderConfirmationRowType>) sequencePlus, OrderConfirmationRowType.ACCOUNT_LABEL));
    }

    public final Money.Adjustment getEstimatedWithholdingAmount() {
        Money amount;
        WithholdingEstimatedAmount withholdingEstimatedAmount = this.backupWithholdingEstimateAmountResponse;
        if (withholdingEstimatedAmount == null || (amount = withholdingEstimatedAmount.getAmount()) == null) {
            return null;
        }
        return amount.toDebitAdjustment();
    }

    public final Money.Adjustment getWithholdingAmount() {
        Money amount;
        WithholdingAmount withholdingAmount = this.backupWithholdingAmountResponse;
        if (withholdingAmount == null || (amount = withholdingAmount.getAmount()) == null) {
            return null;
        }
        return amount.toDebitAdjustment();
    }

    public final boolean getShouldRedirectToMarginUpgradeSassyFlow() {
        return this.shouldRedirectToMarginUpgradeSassyFlow;
    }

    private final String getMicrogramConfirmation() {
        StreamOrderConfirmationResponseDto streamOrderConfirmationResponseDto = this.microgramConfirmationResult;
        String confirmation_description_string = streamOrderConfirmationResponseDto != null ? streamOrderConfirmationResponseDto.getConfirmation_description_string() : null;
        if (Intrinsics.areEqual(this.microgramState, Monitoring.Ready.INSTANCE)) {
            return confirmation_description_string;
        }
        return null;
    }

    public final Description getOrderConfirmationDescription(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Order order = this.currentOrder;
        CharSequence text = null;
        if (order == null || this.instrument == null || this.marketHours == null) {
            return null;
        }
        if (order.getReplaces() != null && this.replacedOrder == null) {
            return null;
        }
        if (this.microgramConfirmationExperimentMember) {
            text = getMicrogramConfirmation();
        } else {
            StringResource orderConfirmationDescriptionString = OrderConfirmationDescription.getOrderConfirmationDescriptionString(this.currentOrder, this.instrument.getSymbol(), this.isPreIpo, this.replacedOrder);
            if (orderConfirmationDescriptionString != null) {
                text = orderConfirmationDescriptionString.getText(resources);
            }
        }
        if (getShowPassiveRecurringUpsell() && !getHideViewOrderForCancelNew$feature_trade_equity_externalDebug()) {
            return new Description.ViewOrder(text, this.currentOrder, getViewOrderLinkText$feature_trade_equity_externalDebug(this.currentOrder));
        }
        return new Description.TextOnly(text);
    }

    public final StringResource getViewOrderLinkText$feature_trade_equity_externalDebug(Order currentOrder) {
        int i;
        Intrinsics.checkNotNullParameter(currentOrder, "currentOrder");
        StringResource.Companion companion = StringResource.INSTANCE;
        if (currentOrder.getReplaces() != null) {
            i = C29365R.string.order_confirmation_action_view_new_order;
        } else {
            i = C29365R.string.order_confirmation_action_view_order;
        }
        return companion.invoke(i, new Object[0]);
    }

    private final String getMicrogramTitle() {
        StreamOrderConfirmationResponseDto streamOrderConfirmationResponseDto = this.microgramConfirmationResult;
        String confirmation_title_string = streamOrderConfirmationResponseDto != null ? streamOrderConfirmationResponseDto.getConfirmation_title_string() : null;
        if (Intrinsics.areEqual(this.microgramState, Monitoring.Ready.INSTANCE) && this.microgramConfirmationExperimentMember) {
            return confirmation_title_string;
        }
        return null;
    }

    public final StringResource getOrderConfirmationStatus() {
        StringResource stringResourceInvoke;
        if (this.currentOrder == null || this.instrument == null) {
            return null;
        }
        String microgramTitle = getMicrogramTitle();
        return (microgramTitle == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(microgramTitle)) == null) ? OrderConfirmationStatusString.getOrderConfirmationStatusString(this.currentOrder, this.instrument.getSymbol()) : stringResourceInvoke;
    }

    public final boolean getViewOrderButtonIsVisible() {
        return this.viewOrderButtonIsVisible;
    }

    public final boolean getHideViewOrderForCancelNew$feature_trade_equity_externalDebug() {
        if (this.replacedOrder == null) {
            return false;
        }
        Set of = SetsKt.setOf((Object[]) new EquityOrderState[]{EquityOrderState.FAILED, EquityOrderState.REJECTED, EquityOrderState.CANCELED, EquityOrderState.VOIDED});
        Order order = this.currentOrder;
        return CollectionsKt.contains(of, order != null ? order.getState() : null);
    }

    public final StringResource getTaxLotRowTitle() {
        OrderSummaryDetails order_summary_details;
        if (this.showTaxLotsM1) {
            return StringResource.INSTANCE.invoke(C14743R.string.order_confirmation_sell_quantity_label, new Object[0]);
        }
        StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse = this.taxLotSummary;
        if (streamTaxLotsSummaryResponse == null || (order_summary_details = streamTaxLotsSummaryResponse.getOrder_summary_details()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(order_summary_details.getRow_title());
    }

    public final StringResource getTaxLotsRowTrailingTitle() {
        OrderSummaryDetails order_summary_details;
        if (this.showTaxLotsM1) {
            Order order = this.currentOrder;
            if (order != null) {
                return OrderConfirmationDescription.getOrderConfirmationSharesAsSubtotal(order);
            }
            return null;
        }
        StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse = this.taxLotSummary;
        if (streamTaxLotsSummaryResponse == null || (order_summary_details = streamTaxLotsSummaryResponse.getOrder_summary_details()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(order_summary_details.getRow_trailing_title());
    }

    public final StringResource getTaxLotsTrailingSubtitle() {
        StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse;
        OrderSummaryDetails order_summary_details;
        OrderSummaryDetails order_summary_details2;
        OrderSummaryDetails order_summary_details3;
        String row_trailing_subtitle = null;
        if (this.showTaxLotsM1) {
            StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse2 = this.taxLotSummary;
            if ((streamTaxLotsSummaryResponse2 != null ? streamTaxLotsSummaryResponse2.getLot_source_type() : null) != LotSourceType.SELECTED_SOURCE) {
                StringResource.Companion companion = StringResource.INSTANCE;
                StringBuilder sb = new StringBuilder();
                StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse3 = this.taxLotSummary;
                sb.append((streamTaxLotsSummaryResponse3 == null || (order_summary_details3 = streamTaxLotsSummaryResponse3.getOrder_summary_details()) == null) ? null : order_summary_details3.getRow_trailing_title());
                sb.append(" · ");
                StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse4 = this.taxLotSummary;
                if (streamTaxLotsSummaryResponse4 != null && (order_summary_details2 = streamTaxLotsSummaryResponse4.getOrder_summary_details()) != null) {
                    row_trailing_subtitle = order_summary_details2.getRow_trailing_subtitle();
                }
                sb.append(row_trailing_subtitle);
                String string2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return companion.invoke(string2);
            }
        }
        StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse5 = this.taxLotSummary;
        if ((streamTaxLotsSummaryResponse5 != null ? streamTaxLotsSummaryResponse5.getLot_source_type() : null) == LotSourceType.SELECTED_SOURCE || (streamTaxLotsSummaryResponse = this.taxLotSummary) == null || (order_summary_details = streamTaxLotsSummaryResponse.getOrder_summary_details()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(order_summary_details.getRow_trailing_subtitle());
    }

    public final StringResource getWithholdingLabelString() {
        if (!this.mlpExperimentMember) {
            return StringResource.INSTANCE.invoke(C29365R.string.order_confirmation_backup_withhholding_label, new Object[0]);
        }
        WithholdingStatus withholdingStatus = this.withholdingStatus;
        if (withholdingStatus != null && withholdingStatus.getTaxWithholdingStatus() == 6) {
            return StringResource.INSTANCE.invoke(C29365R.string.order_confirmation_backup_withhholding_label, new Object[0]);
        }
        WithholdingStatus withholdingStatus2 = this.withholdingStatus;
        if (withholdingStatus2 != null && withholdingStatus2.isWithheld()) {
            Instrument instrument = this.instrument;
            if (Intrinsics.areEqual(instrument != null ? instrument.getType() : null, Instrument.TYPE_MLP)) {
                return StringResource.INSTANCE.invoke(C29365R.string.order_confirmation_backup_withhholding_label_nra, new Object[0]);
            }
        }
        return StringResource.INSTANCE.invoke(C29365R.string.order_confirmation_backup_withhholding_label_fallback, new Object[0]);
    }

    public final StringResource getWithholdingEstimateLabelString() {
        if (!this.mlpExperimentMember) {
            return StringResource.INSTANCE.invoke(C29365R.string.order_confirmation_estimated_backup_withhholding_label, new Object[0]);
        }
        WithholdingStatus withholdingStatus = this.withholdingStatus;
        if (withholdingStatus != null && withholdingStatus.getTaxWithholdingStatus() == 6) {
            return StringResource.INSTANCE.invoke(C29365R.string.order_confirmation_estimated_backup_withhholding_label, new Object[0]);
        }
        WithholdingStatus withholdingStatus2 = this.withholdingStatus;
        if (withholdingStatus2 != null && withholdingStatus2.isWithheld()) {
            Instrument instrument = this.instrument;
            if (Intrinsics.areEqual(instrument != null ? instrument.getType() : null, Instrument.TYPE_MLP)) {
                return StringResource.INSTANCE.invoke(C29365R.string.order_confirmation_estimated_backup_withhholding_label_nra, new Object[0]);
            }
        }
        return StringResource.INSTANCE.invoke(C29365R.string.order_confirmation_estimated_backup_withhholding_label_fallback, new Object[0]);
    }

    public final StringResource getAccountNameTitle() {
        DisplayName displayName;
        DisplayName.Variants withInvesting;
        Account account = this.activeAccount;
        if (account == null || (displayName = AccountDisplayNames.getDisplayName(account)) == null || (withInvesting = displayName.getWithInvesting()) == null) {
            return null;
        }
        return withInvesting.getTitle();
    }

    public final StringResource getAccountNameSubtitle() {
        Account account = this.activeAccount;
        if (account == null || !account.getHasNickname()) {
            return null;
        }
        return AccountDisplayNames.getDisplayNameWithoutNickname(this.activeAccount).getShort().getTitle();
    }

    /* compiled from: OrderConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$Description;", "", "<init>", "()V", "descriptionText", "", "getDescriptionText", "()Ljava/lang/CharSequence;", "ViewOrder", "TextOnly", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$Description$TextOnly;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$Description$ViewOrder;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Description {
        public static final int $stable = 0;

        public /* synthetic */ Description(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract CharSequence getDescriptionText();

        private Description() {
        }

        /* compiled from: OrderConfirmationViewState.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$Description$ViewOrder;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$Description;", "descriptionText", "", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "linkText", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Ljava/lang/CharSequence;Lcom/robinhood/models/db/Order;Lcom/robinhood/utils/resource/StringResource;)V", "getDescriptionText", "()Ljava/lang/CharSequence;", "getOrder", "()Lcom/robinhood/models/db/Order;", "getLinkText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ViewOrder extends Description {
            public static final int $stable = 8;
            private final CharSequence descriptionText;
            private final StringResource linkText;
            private final Order order;

            public static /* synthetic */ ViewOrder copy$default(ViewOrder viewOrder, CharSequence charSequence, Order order, StringResource stringResource, int i, Object obj) {
                if ((i & 1) != 0) {
                    charSequence = viewOrder.descriptionText;
                }
                if ((i & 2) != 0) {
                    order = viewOrder.order;
                }
                if ((i & 4) != 0) {
                    stringResource = viewOrder.linkText;
                }
                return viewOrder.copy(charSequence, order, stringResource);
            }

            /* renamed from: component1, reason: from getter */
            public final CharSequence getDescriptionText() {
                return this.descriptionText;
            }

            /* renamed from: component2, reason: from getter */
            public final Order getOrder() {
                return this.order;
            }

            /* renamed from: component3, reason: from getter */
            public final StringResource getLinkText() {
                return this.linkText;
            }

            public final ViewOrder copy(CharSequence descriptionText, Order order, StringResource linkText) {
                Intrinsics.checkNotNullParameter(order, "order");
                Intrinsics.checkNotNullParameter(linkText, "linkText");
                return new ViewOrder(descriptionText, order, linkText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ViewOrder)) {
                    return false;
                }
                ViewOrder viewOrder = (ViewOrder) other;
                return Intrinsics.areEqual(this.descriptionText, viewOrder.descriptionText) && Intrinsics.areEqual(this.order, viewOrder.order) && Intrinsics.areEqual(this.linkText, viewOrder.linkText);
            }

            public int hashCode() {
                CharSequence charSequence = this.descriptionText;
                return ((((charSequence == null ? 0 : charSequence.hashCode()) * 31) + this.order.hashCode()) * 31) + this.linkText.hashCode();
            }

            public String toString() {
                CharSequence charSequence = this.descriptionText;
                return "ViewOrder(descriptionText=" + ((Object) charSequence) + ", order=" + this.order + ", linkText=" + this.linkText + ")";
            }

            @Override // com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationViewState.Description
            public CharSequence getDescriptionText() {
                return this.descriptionText;
            }

            public final Order getOrder() {
                return this.order;
            }

            public final StringResource getLinkText() {
                return this.linkText;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewOrder(CharSequence charSequence, Order order, StringResource linkText) {
                super(null);
                Intrinsics.checkNotNullParameter(order, "order");
                Intrinsics.checkNotNullParameter(linkText, "linkText");
                this.descriptionText = charSequence;
                this.order = order;
                this.linkText = linkText;
            }
        }

        /* compiled from: OrderConfirmationViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$Description$TextOnly;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$Description;", "descriptionText", "", "<init>", "(Ljava/lang/CharSequence;)V", "getDescriptionText", "()Ljava/lang/CharSequence;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TextOnly extends Description {
            public static final int $stable = 8;
            private final CharSequence descriptionText;

            public static /* synthetic */ TextOnly copy$default(TextOnly textOnly, CharSequence charSequence, int i, Object obj) {
                if ((i & 1) != 0) {
                    charSequence = textOnly.descriptionText;
                }
                return textOnly.copy(charSequence);
            }

            /* renamed from: component1, reason: from getter */
            public final CharSequence getDescriptionText() {
                return this.descriptionText;
            }

            public final TextOnly copy(CharSequence descriptionText) {
                return new TextOnly(descriptionText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TextOnly) && Intrinsics.areEqual(this.descriptionText, ((TextOnly) other).descriptionText);
            }

            public int hashCode() {
                CharSequence charSequence = this.descriptionText;
                if (charSequence == null) {
                    return 0;
                }
                return charSequence.hashCode();
            }

            public String toString() {
                return "TextOnly(descriptionText=" + ((Object) this.descriptionText) + ")";
            }

            @Override // com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationViewState.Description
            public CharSequence getDescriptionText() {
                return this.descriptionText;
            }

            public TextOnly(CharSequence charSequence) {
                super(null);
                this.descriptionText = charSequence;
            }
        }
    }

    /* compiled from: OrderConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$ViewOrderAction;", "", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "<init>", "(Lcom/robinhood/models/db/Order;)V", "getOrder", "()Lcom/robinhood/models/db/Order;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ViewOrderAction {
        public static final int $stable = 8;
        private final Order order;

        public static /* synthetic */ ViewOrderAction copy$default(ViewOrderAction viewOrderAction, Order order, int i, Object obj) {
            if ((i & 1) != 0) {
                order = viewOrderAction.order;
            }
            return viewOrderAction.copy(order);
        }

        /* renamed from: component1, reason: from getter */
        public final Order getOrder() {
            return this.order;
        }

        public final ViewOrderAction copy(Order order) {
            Intrinsics.checkNotNullParameter(order, "order");
            return new ViewOrderAction(order);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewOrderAction) && Intrinsics.areEqual(this.order, ((ViewOrderAction) other).order);
        }

        public int hashCode() {
            return this.order.hashCode();
        }

        public String toString() {
            return "ViewOrderAction(order=" + this.order + ")";
        }

        public ViewOrderAction(Order order) {
            Intrinsics.checkNotNullParameter(order, "order");
            this.order = order;
        }

        public final Order getOrder() {
            return this.order;
        }
    }

    /* compiled from: OrderConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction;", "", "<init>", "()V", "ShowRecurringUpsell", "MarginInvestingUpsell", "CompleteOrder", "ShowNotificationUpsell", "SlipUpsell", "ShowIacUpsell", "MarginAccountUpsell", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction$CompleteOrder;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction$MarginAccountUpsell;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction$MarginInvestingUpsell;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction$ShowIacUpsell;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction$ShowNotificationUpsell;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction$ShowRecurringUpsell;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction$SlipUpsell;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class DoneAction {
        public static final int $stable = 0;

        public /* synthetic */ DoneAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DoneAction() {
        }

        /* compiled from: OrderConfirmationViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction$ShowRecurringUpsell;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction;", "<init>", "()V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ShowRecurringUpsell extends DoneAction {
            public static final int $stable = 0;
            public static final ShowRecurringUpsell INSTANCE = new ShowRecurringUpsell();

            private ShowRecurringUpsell() {
                super(null);
            }
        }

        /* compiled from: OrderConfirmationViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction$MarginInvestingUpsell;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction;", "marginInvestingUpsell", "Lcom/robinhood/android/lib/margin/api/ApiMarginUpsell;", "<init>", "(Lcom/robinhood/android/lib/margin/api/ApiMarginUpsell;)V", "getMarginInvestingUpsell", "()Lcom/robinhood/android/lib/margin/api/ApiMarginUpsell;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MarginInvestingUpsell extends DoneAction {
            public static final int $stable = 8;
            private final ApiMarginUpsell marginInvestingUpsell;

            public static /* synthetic */ MarginInvestingUpsell copy$default(MarginInvestingUpsell marginInvestingUpsell, ApiMarginUpsell apiMarginUpsell, int i, Object obj) {
                if ((i & 1) != 0) {
                    apiMarginUpsell = marginInvestingUpsell.marginInvestingUpsell;
                }
                return marginInvestingUpsell.copy(apiMarginUpsell);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiMarginUpsell getMarginInvestingUpsell() {
                return this.marginInvestingUpsell;
            }

            public final MarginInvestingUpsell copy(ApiMarginUpsell marginInvestingUpsell) {
                Intrinsics.checkNotNullParameter(marginInvestingUpsell, "marginInvestingUpsell");
                return new MarginInvestingUpsell(marginInvestingUpsell);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MarginInvestingUpsell) && Intrinsics.areEqual(this.marginInvestingUpsell, ((MarginInvestingUpsell) other).marginInvestingUpsell);
            }

            public int hashCode() {
                return this.marginInvestingUpsell.hashCode();
            }

            public String toString() {
                return "MarginInvestingUpsell(marginInvestingUpsell=" + this.marginInvestingUpsell + ")";
            }

            public final ApiMarginUpsell getMarginInvestingUpsell() {
                return this.marginInvestingUpsell;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MarginInvestingUpsell(ApiMarginUpsell marginInvestingUpsell) {
                super(null);
                Intrinsics.checkNotNullParameter(marginInvestingUpsell, "marginInvestingUpsell");
                this.marginInvestingUpsell = marginInvestingUpsell;
            }
        }

        /* compiled from: OrderConfirmationViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction$CompleteOrder;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction;", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "<init>", "(Lcom/robinhood/models/db/Order;)V", "getOrder", "()Lcom/robinhood/models/db/Order;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CompleteOrder extends DoneAction {
            public static final int $stable = 8;
            private final Order order;

            public static /* synthetic */ CompleteOrder copy$default(CompleteOrder completeOrder, Order order, int i, Object obj) {
                if ((i & 1) != 0) {
                    order = completeOrder.order;
                }
                return completeOrder.copy(order);
            }

            /* renamed from: component1, reason: from getter */
            public final Order getOrder() {
                return this.order;
            }

            public final CompleteOrder copy(Order order) {
                return new CompleteOrder(order);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CompleteOrder) && Intrinsics.areEqual(this.order, ((CompleteOrder) other).order);
            }

            public int hashCode() {
                Order order = this.order;
                if (order == null) {
                    return 0;
                }
                return order.hashCode();
            }

            public String toString() {
                return "CompleteOrder(order=" + this.order + ")";
            }

            public CompleteOrder(Order order) {
                super(null);
                this.order = order;
            }

            public final Order getOrder() {
                return this.order;
            }
        }

        /* compiled from: OrderConfirmationViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction$ShowNotificationUpsell;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction;", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "<init>", "(Lcom/robinhood/models/db/Order;)V", "getOrder", "()Lcom/robinhood/models/db/Order;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowNotificationUpsell extends DoneAction {
            public static final int $stable = 8;
            private final Order order;

            public static /* synthetic */ ShowNotificationUpsell copy$default(ShowNotificationUpsell showNotificationUpsell, Order order, int i, Object obj) {
                if ((i & 1) != 0) {
                    order = showNotificationUpsell.order;
                }
                return showNotificationUpsell.copy(order);
            }

            /* renamed from: component1, reason: from getter */
            public final Order getOrder() {
                return this.order;
            }

            public final ShowNotificationUpsell copy(Order order) {
                return new ShowNotificationUpsell(order);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowNotificationUpsell) && Intrinsics.areEqual(this.order, ((ShowNotificationUpsell) other).order);
            }

            public int hashCode() {
                Order order = this.order;
                if (order == null) {
                    return 0;
                }
                return order.hashCode();
            }

            public String toString() {
                return "ShowNotificationUpsell(order=" + this.order + ")";
            }

            public ShowNotificationUpsell(Order order) {
                super(null);
                this.order = order;
            }

            public final Order getOrder() {
                return this.order;
            }
        }

        /* compiled from: OrderConfirmationViewState.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction$SlipUpsell;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction;", "slipUpsellKey", "Lcom/robinhood/android/margin/contracts/SlipUpsellKey;", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "<init>", "(Lcom/robinhood/android/margin/contracts/SlipUpsellKey;Lcom/robinhood/models/db/Order;)V", "getSlipUpsellKey", "()Lcom/robinhood/android/margin/contracts/SlipUpsellKey;", "getOrder", "()Lcom/robinhood/models/db/Order;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SlipUpsell extends DoneAction {
            public static final int $stable = 8;
            private final Order order;
            private final SlipUpsellKey slipUpsellKey;

            public static /* synthetic */ SlipUpsell copy$default(SlipUpsell slipUpsell, SlipUpsellKey slipUpsellKey, Order order, int i, Object obj) {
                if ((i & 1) != 0) {
                    slipUpsellKey = slipUpsell.slipUpsellKey;
                }
                if ((i & 2) != 0) {
                    order = slipUpsell.order;
                }
                return slipUpsell.copy(slipUpsellKey, order);
            }

            /* renamed from: component1, reason: from getter */
            public final SlipUpsellKey getSlipUpsellKey() {
                return this.slipUpsellKey;
            }

            /* renamed from: component2, reason: from getter */
            public final Order getOrder() {
                return this.order;
            }

            public final SlipUpsell copy(SlipUpsellKey slipUpsellKey, Order order) {
                Intrinsics.checkNotNullParameter(slipUpsellKey, "slipUpsellKey");
                return new SlipUpsell(slipUpsellKey, order);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SlipUpsell)) {
                    return false;
                }
                SlipUpsell slipUpsell = (SlipUpsell) other;
                return Intrinsics.areEqual(this.slipUpsellKey, slipUpsell.slipUpsellKey) && Intrinsics.areEqual(this.order, slipUpsell.order);
            }

            public int hashCode() {
                int iHashCode = this.slipUpsellKey.hashCode() * 31;
                Order order = this.order;
                return iHashCode + (order == null ? 0 : order.hashCode());
            }

            public String toString() {
                return "SlipUpsell(slipUpsellKey=" + this.slipUpsellKey + ", order=" + this.order + ")";
            }

            public final SlipUpsellKey getSlipUpsellKey() {
                return this.slipUpsellKey;
            }

            public final Order getOrder() {
                return this.order;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SlipUpsell(SlipUpsellKey slipUpsellKey, Order order) {
                super(null);
                Intrinsics.checkNotNullParameter(slipUpsellKey, "slipUpsellKey");
                this.slipUpsellKey = slipUpsellKey;
                this.order = order;
            }
        }

        /* compiled from: OrderConfirmationViewState.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction$ShowIacUpsell;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction;", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "upsell", "Lcom/robinhood/models/ui/IacUpsell;", "<init>", "(Lcom/robinhood/models/db/Order;Lcom/robinhood/models/ui/IacUpsell;)V", "getOrder", "()Lcom/robinhood/models/db/Order;", "getUpsell", "()Lcom/robinhood/models/ui/IacUpsell;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShowIacUpsell extends DoneAction {
            public static final int $stable = 8;
            private final Order order;
            private final IacUpsell upsell;

            public static /* synthetic */ ShowIacUpsell copy$default(ShowIacUpsell showIacUpsell, Order order, IacUpsell iacUpsell, int i, Object obj) {
                if ((i & 1) != 0) {
                    order = showIacUpsell.order;
                }
                if ((i & 2) != 0) {
                    iacUpsell = showIacUpsell.upsell;
                }
                return showIacUpsell.copy(order, iacUpsell);
            }

            /* renamed from: component1, reason: from getter */
            public final Order getOrder() {
                return this.order;
            }

            /* renamed from: component2, reason: from getter */
            public final IacUpsell getUpsell() {
                return this.upsell;
            }

            public final ShowIacUpsell copy(Order order, IacUpsell upsell) {
                Intrinsics.checkNotNullParameter(upsell, "upsell");
                return new ShowIacUpsell(order, upsell);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowIacUpsell)) {
                    return false;
                }
                ShowIacUpsell showIacUpsell = (ShowIacUpsell) other;
                return Intrinsics.areEqual(this.order, showIacUpsell.order) && Intrinsics.areEqual(this.upsell, showIacUpsell.upsell);
            }

            public int hashCode() {
                Order order = this.order;
                return ((order == null ? 0 : order.hashCode()) * 31) + this.upsell.hashCode();
            }

            public String toString() {
                return "ShowIacUpsell(order=" + this.order + ", upsell=" + this.upsell + ")";
            }

            public final Order getOrder() {
                return this.order;
            }

            public final IacUpsell getUpsell() {
                return this.upsell;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowIacUpsell(Order order, IacUpsell upsell) {
                super(null);
                Intrinsics.checkNotNullParameter(upsell, "upsell");
                this.order = order;
                this.upsell = upsell;
            }
        }

        /* compiled from: OrderConfirmationViewState.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction$MarginAccountUpsell;", "Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$DoneAction;", "fragmentKey", "Lcom/robinhood/android/margin/contracts/MarginAccountUpsellFragmentKey;", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "<init>", "(Lcom/robinhood/android/margin/contracts/MarginAccountUpsellFragmentKey;Lcom/robinhood/models/db/Order;)V", "getFragmentKey", "()Lcom/robinhood/android/margin/contracts/MarginAccountUpsellFragmentKey;", "getOrder", "()Lcom/robinhood/models/db/Order;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MarginAccountUpsell extends DoneAction {
            public static final int $stable = 8;
            private final MarginAccountUpsellFragmentKey fragmentKey;
            private final Order order;

            public static /* synthetic */ MarginAccountUpsell copy$default(MarginAccountUpsell marginAccountUpsell, MarginAccountUpsellFragmentKey marginAccountUpsellFragmentKey, Order order, int i, Object obj) {
                if ((i & 1) != 0) {
                    marginAccountUpsellFragmentKey = marginAccountUpsell.fragmentKey;
                }
                if ((i & 2) != 0) {
                    order = marginAccountUpsell.order;
                }
                return marginAccountUpsell.copy(marginAccountUpsellFragmentKey, order);
            }

            /* renamed from: component1, reason: from getter */
            public final MarginAccountUpsellFragmentKey getFragmentKey() {
                return this.fragmentKey;
            }

            /* renamed from: component2, reason: from getter */
            public final Order getOrder() {
                return this.order;
            }

            public final MarginAccountUpsell copy(MarginAccountUpsellFragmentKey fragmentKey, Order order) {
                Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
                return new MarginAccountUpsell(fragmentKey, order);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MarginAccountUpsell)) {
                    return false;
                }
                MarginAccountUpsell marginAccountUpsell = (MarginAccountUpsell) other;
                return Intrinsics.areEqual(this.fragmentKey, marginAccountUpsell.fragmentKey) && Intrinsics.areEqual(this.order, marginAccountUpsell.order);
            }

            public int hashCode() {
                int iHashCode = this.fragmentKey.hashCode() * 31;
                Order order = this.order;
                return iHashCode + (order == null ? 0 : order.hashCode());
            }

            public String toString() {
                return "MarginAccountUpsell(fragmentKey=" + this.fragmentKey + ", order=" + this.order + ")";
            }

            public final MarginAccountUpsellFragmentKey getFragmentKey() {
                return this.fragmentKey;
            }

            public final Order getOrder() {
                return this.order;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MarginAccountUpsell(MarginAccountUpsellFragmentKey fragmentKey, Order order) {
                super(null);
                Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
                this.fragmentKey = fragmentKey;
                this.order = order;
            }
        }
    }

    /* compiled from: OrderConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/confirmation/OrderConfirmationViewState$UpsellAction;", "", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "<init>", "(Lcom/robinhood/models/db/Order;)V", "getOrder", "()Lcom/robinhood/models/db/Order;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpsellAction {
        public static final int $stable = 8;
        private final Order order;

        public static /* synthetic */ UpsellAction copy$default(UpsellAction upsellAction, Order order, int i, Object obj) {
            if ((i & 1) != 0) {
                order = upsellAction.order;
            }
            return upsellAction.copy(order);
        }

        /* renamed from: component1, reason: from getter */
        public final Order getOrder() {
            return this.order;
        }

        public final UpsellAction copy(Order order) {
            return new UpsellAction(order);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpsellAction) && Intrinsics.areEqual(this.order, ((UpsellAction) other).order);
        }

        public int hashCode() {
            Order order = this.order;
            if (order == null) {
                return 0;
            }
            return order.hashCode();
        }

        public String toString() {
            return "UpsellAction(order=" + this.order + ")";
        }

        public UpsellAction(Order order) {
            this.order = order;
        }

        public final Order getOrder() {
            return this.order;
        }
    }
}
