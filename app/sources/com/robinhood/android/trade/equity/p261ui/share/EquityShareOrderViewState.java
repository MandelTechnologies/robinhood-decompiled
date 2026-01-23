package com.robinhood.android.trade.equity.p261ui.share;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.equity.ordercheck.ValidationState;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.android.nbbo.p197ui.NbboSpanBuilders;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trade.equity.util.BigDecimals4;
import com.robinhood.android.trade.equity.util.EquityOrderContextHolder;
import com.robinhood.android.trade.equity.util.OrderExecutionLabel;
import com.robinhood.android.trade.equity.util.OrderRequests;
import com.robinhood.android.trade.equity.util.OrderSides;
import com.robinhood.android.trade.equity.util.OrderStringsHelper;
import com.robinhood.android.trade.equity.util.WithholdingStatuses;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder5;
import com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration;
import com.robinhood.android.trading.contracts.configuration.ShareMarket;
import com.robinhood.models.api.ApiCollateral;
import com.robinhood.models.api.ApiSalesTax;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.bonfire.WithholdingEstimatedAmount;
import com.robinhood.models.p320db.bonfire.WithholdingStatus;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.util.Money;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.shared.equities.subzero.ShortingInfo2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.noties.markwon.Markwon;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import microgram.android.Monitoring;

/* compiled from: EquityShareOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bT\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bK\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bá\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&\u0012\u0006\u0010(\u001a\u00020\u000b\u0012\u0006\u0010)\u001a\u00020\u000b\u0012\b\u0010*\u001a\u0004\u0018\u00010+\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010-\u001a\u0004\u0018\u00010.\u0012\u0006\u0010/\u001a\u00020\u000b\u0012\u0006\u00100\u001a\u00020\u000b\u0012\u0006\u00101\u001a\u00020\u000b\u0012\u0006\u00102\u001a\u000203\u0012\b\u00104\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u00105\u001a\u00020\u000b\u0012\b\u00106\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000109\u0012\u0006\u0010:\u001a\u00020\u000b\u0012\u0006\u0010;\u001a\u00020\u000b\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010=\u001a\u0004\u0018\u00010+\u0012\b\u0010>\u001a\u0004\u0018\u00010+\u0012\b\u0010?\u001a\u0004\u0018\u00010+\u0012\b\u0010@\u001a\u0004\u0018\u00010+\u0012\b\u0010A\u001a\u0004\u0018\u00010B\u0012\u0006\u0010C\u001a\u00020D\u0012\b\b\u0002\u0010E\u001a\u00020\u000b\u0012\b\u0010F\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010G\u001a\u00020\u000b\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J\u0012\u0006\u0010K\u001a\u00020L\u0012\u0006\u0010M\u001a\u00020\u000b\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010R\u001a\u00020\u000b\u0012\b\b\u0002\u0010S\u001a\u00020\u000b\u0012\u0006\u0010T\u001a\u00020U\u0012\u0010\b\u0002\u0010V\u001a\n\u0012\u0004\u0012\u00020W\u0018\u00010#\u0012\b\b\u0002\u0010X\u001a\u00020B¢\u0006\u0004\bY\u0010ZJ\u0013\u0010µ\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010¶\u0001\u001a\u00030·\u0001J\b\u0010À\u0001\u001a\u00030Á\u0001J\u0007\u0010Æ\u0001\u001a\u00020+J\t\u0010Ç\u0001\u001a\u0004\u0018\u00010+J\u0014\u0010È\u0001\u001a\u0005\u0018\u00010¬\u00012\b\u0010É\u0001\u001a\u00030Ê\u0001J\t\u0010Ë\u0001\u001a\u0004\u0018\u00010+J1\u0010Ó\u0001\u001a\u0005\u0018\u00010¬\u00012\b\u0010Ô\u0001\u001a\u00030Õ\u00012\b\u0010Ö\u0001\u001a\u00030×\u00012\u0011\b\u0002\u0010Ø\u0001\u001a\n\u0012\u0005\u0012\u00030Ú\u00010Ù\u0001J\f\u0010ë\u0001\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\f\u0010ì\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010í\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010î\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\n\u0010ï\u0001\u001a\u00020\u000bHÆ\u0003J\u0010\u0010ð\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\f\u0010ñ\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0010\u0010ò\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\rHÆ\u0003J\u0012\u0010ó\u0001\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\f\u0010ô\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\f\u0010õ\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\f\u0010ö\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\n\u0010÷\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010ø\u0001\u001a\u00020\u001cHÆ\u0003J\n\u0010ù\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010ú\u0001\u001a\u00020\u001fHÆ\u0003J\f\u0010û\u0001\u001a\u0004\u0018\u00010!HÆ\u0003J\u0018\u0010ü\u0001\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#HÆ\u0003¢\u0006\u0003\bý\u0001J\u0012\u0010þ\u0001\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&HÆ\u0003J\n\u0010ÿ\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0080\u0002\u001a\u00020\u000bHÆ\u0003J\f\u0010\u0081\u0002\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010\u0082\u0002\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010\u0083\u0002\u001a\u0004\u0018\u00010.HÆ\u0003J\n\u0010\u0084\u0002\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0085\u0002\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0086\u0002\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0087\u0002\u001a\u000203HÆ\u0003J\f\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\n\u0010\u0089\u0002\u001a\u00020\u000bHÂ\u0003J\f\u0010\u008a\u0002\u001a\u0004\u0018\u000107HÂ\u0003J\f\u0010\u008b\u0002\u001a\u0004\u0018\u000109HÆ\u0003J\n\u0010\u008c\u0002\u001a\u00020\u000bHÆ\u0003J\n\u0010\u008d\u0002\u001a\u00020\u000bHÆ\u0003J\f\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\f\u0010\u008f\u0002\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010\u0090\u0002\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010\u0091\u0002\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010\u0092\u0002\u001a\u0004\u0018\u00010+HÆ\u0003J\u0015\u0010\u0093\u0002\u001a\u0004\u0018\u00010BHÀ\u0003¢\u0006\u0006\b\u0094\u0002\u0010\u0093\u0001J\n\u0010\u0095\u0002\u001a\u00020DHÆ\u0003J\n\u0010\u0096\u0002\u001a\u00020\u000bHÆ\u0003J\u0012\u0010\u0097\u0002\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0003\u0010\u0097\u0001J\n\u0010\u0098\u0002\u001a\u00020\u000bHÆ\u0003J\f\u0010\u0099\u0002\u001a\u0004\u0018\u00010\u000eHÂ\u0003J\f\u0010\u009a\u0002\u001a\u0004\u0018\u00010JHÂ\u0003J\n\u0010\u009b\u0002\u001a\u00020LHÆ\u0003J\n\u0010\u009c\u0002\u001a\u00020\u000bHÆ\u0003J\f\u0010\u009d\u0002\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010\u009e\u0002\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010\u009f\u0002\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010 \u0002\u001a\u0004\u0018\u00010+HÆ\u0003J\n\u0010¡\u0002\u001a\u00020\u000bHÆ\u0003J\u0010\u0010¢\u0002\u001a\u00020\u000bHÀ\u0003¢\u0006\u0003\b£\u0002J\n\u0010¤\u0002\u001a\u00020UHÆ\u0003J\u0018\u0010¥\u0002\u001a\n\u0012\u0004\u0012\u00020W\u0018\u00010#HÂ\u0003¢\u0006\u0003\b¦\u0002J\n\u0010§\u0002\u001a\u00020BHÂ\u0003J®\u0005\u0010¨\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u00020\u000b2\b\b\u0002\u00102\u001a\u0002032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u00105\u001a\u00020\u000b2\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\n\b\u0002\u00108\u001a\u0004\u0018\u0001092\b\b\u0002\u0010:\u001a\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020\u000b2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010=\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\b\b\u0002\u0010C\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020\u000b2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010G\u001a\u00020\u000b2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J2\b\b\u0002\u0010K\u001a\u00020L2\b\b\u0002\u0010M\u001a\u00020\u000b2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010R\u001a\u00020\u000b2\b\b\u0002\u0010S\u001a\u00020\u000b2\b\b\u0002\u0010T\u001a\u00020U2\u0010\b\u0002\u0010V\u001a\n\u0012\u0004\u0012\u00020W\u0018\u00010#2\b\b\u0002\u0010X\u001a\u00020BHÆ\u0001¢\u0006\u0003\u0010©\u0002J\u0016\u0010ª\u0002\u001a\u00020\u000b2\n\u0010«\u0002\u001a\u0005\u0018\u00010¬\u0002HÖ\u0003J\n\u0010\u00ad\u0002\u001a\u00020BHÖ\u0001J\n\u0010®\u0002\u001a\u00020\u000eHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\bg\u0010dR\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0011\u0010\u001a\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bp\u0010bR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0011\u0010\u001d\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bs\u0010bR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0019\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\bx\u0010yR\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010{R\u0011\u0010(\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b|\u0010bR\u0011\u0010)\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b}\u0010bR\u0013\u0010*\u001a\u0004\u0018\u00010+¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u007fR\u0014\u0010,\u001a\u0004\u0018\u00010+¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u007fR\u0015\u0010-\u001a\u0004\u0018\u00010.¢\u0006\n\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0012\u0010/\u001a\u00020\u000b¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010bR\u0012\u00100\u001a\u00020\u000b¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010bR\u0012\u00101\u001a\u00020\u000b¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010bR\u0013\u00102\u001a\u000203¢\u0006\n\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0014\u00104\u001a\u0004\u0018\u00010\u000e¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010kR\u000e\u00105\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u00108\u001a\u0004\u0018\u000109¢\u0006\n\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0012\u0010:\u001a\u00020\u000b¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010bR\u0012\u0010;\u001a\u00020\u000b¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010bR\u0014\u0010<\u001a\u0004\u0018\u00010\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010^R\u0014\u0010=\u001a\u0004\u0018\u00010+¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010\u007fR\u0014\u0010>\u001a\u0004\u0018\u00010+¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010\u007fR\u0014\u0010?\u001a\u0004\u0018\u00010+¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010\u007fR\u0014\u0010@\u001a\u0004\u0018\u00010+¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010\u007fR\u001b\u0010A\u001a\u0004\u0018\u00010BX\u0080\u0004¢\u0006\r\n\u0003\u0010\u0094\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0016\u0010C\u001a\u00020DX\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0011\u0010E\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bE\u0010bR\u0017\u0010F\u001a\u0004\u0018\u00010\u000b¢\u0006\f\n\u0003\u0010\u0098\u0001\u001a\u0005\bF\u0010\u0097\u0001R\u0011\u0010G\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bG\u0010bR\u0010\u0010H\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010I\u001a\u0004\u0018\u00010JX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010K\u001a\u00020L¢\u0006\n\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0011\u0010M\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bM\u0010bR\u0014\u0010N\u001a\u0004\u0018\u00010+¢\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010\u007fR\u0014\u0010O\u001a\u0004\u0018\u00010+¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010\u007fR\u0014\u0010P\u001a\u0004\u0018\u00010+¢\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010\u007fR\u0014\u0010Q\u001a\u0004\u0018\u00010+¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010\u007fR\u0012\u0010R\u001a\u00020\u000b¢\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010bR\u0017\u0010S\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\t\n\u0000\u001a\u0005\b \u0001\u0010bR\u0013\u0010T\u001a\u00020U¢\u0006\n\n\u0000\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010V\u001a\n\u0012\u0004\u0012\u00020W\u0018\u00010#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010£\u0001\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010bR\u0013\u0010¤\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010bR\u0013\u0010¦\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b§\u0001\u0010bR\u0013\u0010¨\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010bR\u0013\u0010©\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bª\u0001\u0010bR\u0017\u0010«\u0001\u001a\u0005\u0018\u00010¬\u00018F¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0013\u0010¯\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b°\u0001\u0010bR\u0013\u0010±\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b±\u0001\u0010bR\u0016\u0010²\u0001\u001a\u0004\u0018\u00010$8F¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R\u0015\u0010¸\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010\u007fR\u0018\u0010º\u0001\u001a\u0004\u0018\u00010+8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b»\u0001\u0010\u007fR\u0015\u0010¼\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b½\u0001\u0010\u007fR\u0015\u0010¾\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010\u007fR\u001b\u0010Â\u0001\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8F¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010yR\u0013\u0010Ä\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010bR\u0015\u0010Ì\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010\u007fR\u0013\u0010Î\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010bR\u0015\u0010Ï\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010\u007fR\u0015\u0010Ñ\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010\u007fR\u0016\u0010Û\u0001\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÜ\u0001\u0010bR!\u0010Ý\u0001\u001a\u000f\u0012\n\u0012\b0ß\u0001j\u0003`à\u00010Þ\u00018F¢\u0006\b\u001a\u0006\bá\u0001\u0010â\u0001R\u0015\u0010ã\u0001\u001a\u0004\u0018\u00010+8F¢\u0006\u0007\u001a\u0005\bä\u0001\u0010\u007fR\u0013\u0010å\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bæ\u0001\u0010bR\u0013\u0010ç\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bè\u0001\u0010bR\u0013\u0010é\u0001\u001a\u00020+8F¢\u0006\u0007\u001a\u0005\bê\u0001\u0010\u007f¨\u0006¯\u0002"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderViewState;", "Lcom/robinhood/android/trade/equity/util/EquityOrderContextHolder;", "instrument", "Lcom/robinhood/models/db/Instrument;", "account", "Lcom/robinhood/models/db/Account;", "marketHours", "Lcom/robinhood/models/db/MarketHours;", "nbboSummary", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "overrideToExecuteInMarketHoursOnly", "", "checkOverrides", "", "", "backupWithholdingEstimateAmountResponse", "Lcom/robinhood/models/db/bonfire/WithholdingEstimatedAmount;", "allAccounts", "sessionChangeAlertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "accountNumber", "requestInputs", "Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs;", "equityOrderContext", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "loading", "formState", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "reviewing", "validationState", "Lcom/robinhood/android/equity/ordercheck/ValidationState;", "lastTradePrice", "Lcom/robinhood/models/util/Money;", "estimatedTotalFees", "Lkotlin/Result;", "Ljava/math/BigDecimal;", "salesTaxes", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/api/ApiSalesTax;", "shouldShowBackupWithholdingEstimate", "shouldShowBackupWithholdingWarning", "accountNameTitle", "Lcom/robinhood/utils/resource/StringResource;", "accountNameSubtitle", "accountSwitcherState", "Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "showTwentyFourHourMarketButton", "showTwentyFourHourMarketDialog", "showLimitOrdersOnlyDialog", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "backupWithholdingEstimateAmount", "mlpExperimentMember", "withholdingStatus", "Lcom/robinhood/models/db/bonfire/WithholdingStatus;", "collateral", "Lcom/robinhood/models/api/ApiCollateral;", "shouldShowAccountSwitcher", "loadingNbbo", "nextEffectiveMarketHours", "sellAllButtonLabelStringResource", "availableSharesForBuyStringResource", "subzeroDescriptionStringResource", "buyingPowerAvailableStringResource", "twentyFourHourMarketRoundedShareQuantity", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "isCancelPendingCryptoOrdersLoading", "isMarketBuysEnabled", "isShortPosition", "microgramOrderSummary", "microgramState", "Lmicrogram/android/MicrogramState;", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "isCancelNew", "taxLotsTermStringResource", "taxLotsGainLossStringResource", "taxLotsEstCreditStringResource", "taxLotsM1SecondaryStringResource", "taxLotsM1ExperimentMember", "subzeroMember", "positionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "shortingInfo", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "resetTooltipKey", "<init>", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/nbbo/models/db/NbboSummary;ZLjava/util/List;Lcom/robinhood/models/db/bonfire/WithholdingEstimatedAmount;Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Ljava/lang/String;Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs;Lcom/robinhood/android/equity/validation/EquityOrderContext;ZLcom/robinhood/android/lib/trade/DefaultOrderState;ZLcom/robinhood/android/equity/ordercheck/ValidationState;Lcom/robinhood/models/util/Money;Lkotlin/Result;Lkotlinx/collections/immutable/ImmutableList;ZZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;ZZZLcom/robinhood/models/db/EquityOrderSide;Ljava/lang/String;ZLcom/robinhood/models/db/bonfire/WithholdingStatus;Lcom/robinhood/models/api/ApiCollateral;ZZLcom/robinhood/models/db/MarketHours;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;ZLjava/lang/Boolean;ZLjava/lang/String;Lmicrogram/android/MicrogramState;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZZLcom/robinhood/models/db/OrderPositionEffect;Lkotlin/Result;I)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getMarketHours", "()Lcom/robinhood/models/db/MarketHours;", "getNbboSummary", "()Lcom/robinhood/nbbo/models/db/NbboSummary;", "getOverrideToExecuteInMarketHoursOnly", "()Z", "getCheckOverrides", "()Ljava/util/List;", "getBackupWithholdingEstimateAmountResponse", "()Lcom/robinhood/models/db/bonfire/WithholdingEstimatedAmount;", "getAllAccounts", "getSessionChangeAlertContent", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "getAccountNumber", "()Ljava/lang/String;", "getRequestInputs", "()Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs;", "getEquityOrderContext", "()Lcom/robinhood/android/equity/validation/EquityOrderContext;", "getLoading", "getFormState", "()Lcom/robinhood/android/lib/trade/DefaultOrderState;", "getReviewing", "getValidationState", "()Lcom/robinhood/android/equity/ordercheck/ValidationState;", "getLastTradePrice", "()Lcom/robinhood/models/util/Money;", "getEstimatedTotalFees-xLWZpok", "()Lkotlin/Result;", "getSalesTaxes", "()Lkotlinx/collections/immutable/ImmutableList;", "getShouldShowBackupWithholdingEstimate", "getShouldShowBackupWithholdingWarning", "getAccountNameTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getAccountNameSubtitle", "getAccountSwitcherState", "()Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "getShowTwentyFourHourMarketButton", "getShowTwentyFourHourMarketDialog", "getShowLimitOrdersOnlyDialog", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getBackupWithholdingEstimateAmount", "getCollateral", "()Lcom/robinhood/models/api/ApiCollateral;", "getShouldShowAccountSwitcher", "getLoadingNbbo", "getNextEffectiveMarketHours", "getSellAllButtonLabelStringResource", "getAvailableSharesForBuyStringResource", "getSubzeroDescriptionStringResource", "getBuyingPowerAvailableStringResource", "getTwentyFourHourMarketRoundedShareQuantity$feature_trade_equity_externalDebug", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "getTaxLotsTermStringResource", "getTaxLotsGainLossStringResource", "getTaxLotsEstCreditStringResource", "getTaxLotsM1SecondaryStringResource", "getTaxLotsM1ExperimentMember", "getSubzeroMember$feature_trade_equity_externalDebug", "getPositionEffect", "()Lcom/robinhood/models/db/OrderPositionEffect;", "isMicrogramReady", "useMicrogramOrderSummary", "getUseMicrogramOrderSummary", "shouldShowPriceGroup", "getShouldShowPriceGroup", "isTrailingStopOrder", "showOrderPriceDrawable", "getShowOrderPriceDrawable", "getPriceText", "", "getGetPriceText", "()Ljava/lang/CharSequence;", "shouldSetOrderReviewDrawable", "getShouldSetOrderReviewDrawable", "isPresetPercentLimitOrder", "roundedDownQuantity", "getRoundedDownQuantity", "()Ljava/math/BigDecimal;", "getTitle", "resources", "Landroid/content/res/Resources;", "description", "getDescription", "orderTypeTitle", "getOrderTypeTitle", "actionOrderTypeText", "getActionOrderTypeText", "orderExecutionLabel", "getOrderExecutionLabel", "getExpandableCostState", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$ExpandableEstimatedCost;", "estimatedTotalDailyBorrowFee", "getEstimatedTotalDailyBorrowFee-xLWZpok", "expandableEstimatedCostRowVisible", "getExpandableEstimatedCostRowVisible", "getTotalCostLabelText", "getTotalCost", "getCollateralText", "context", "Landroid/content/Context;", "getPriceLabelText", "timeInForceStringResource", "getTimeInForceStringResource", "isEditOrderButtonVisible", "trailingPegStopPrice", "getTrailingPegStopPrice", "trailingPegTimeInForceStringResource", "getTrailingPegTimeInForceStringResource", "getOrderReviewText", "markwon", "Lio/noties/markwon/Markwon;", ResourceTypes.DRAWABLE, "Landroid/graphics/drawable/Drawable;", "refreshAction", "Lkotlin/Function0;", "", "hasTrailingPeg", "getHasTrailingPeg", "loggingEquityOrderContext", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getLoggingEquityOrderContext", "()Lcom/robinhood/utils/Optional;", "toolbarTitle", "getToolbarTitle", "showTaxLots", "getShowTaxLots", "showTaxLotsM1", "getShowTaxLotsM1", "withholdingWarningString", "getWithholdingWarningString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component18-xLWZpok", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component40$feature_trade_equity_externalDebug", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component54$feature_trade_equity_externalDebug", "component55", "component56", "component56-xLWZpok", "component57", "copy", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/nbbo/models/db/NbboSummary;ZLjava/util/List;Lcom/robinhood/models/db/bonfire/WithholdingEstimatedAmount;Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Ljava/lang/String;Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs;Lcom/robinhood/android/equity/validation/EquityOrderContext;ZLcom/robinhood/android/lib/trade/DefaultOrderState;ZLcom/robinhood/android/equity/ordercheck/ValidationState;Lcom/robinhood/models/util/Money;Lkotlin/Result;Lkotlinx/collections/immutable/ImmutableList;ZZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;ZZZLcom/robinhood/models/db/EquityOrderSide;Ljava/lang/String;ZLcom/robinhood/models/db/bonfire/WithholdingStatus;Lcom/robinhood/models/api/ApiCollateral;ZZLcom/robinhood/models/db/MarketHours;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;ZLjava/lang/Boolean;ZLjava/lang/String;Lmicrogram/android/MicrogramState;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZZLcom/robinhood/models/db/OrderPositionEffect;Lkotlin/Result;I)Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderViewState;", "equals", "other", "", "hashCode", "toString", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class EquityShareOrderViewState implements EquityOrderContextHolder {
    public static final int $stable = 8;
    private final Account account;
    private final StringResource accountNameSubtitle;
    private final StringResource accountNameTitle;
    private final String accountNumber;
    private final InstrumentAccountSwitcherState accountSwitcherState;
    private final List<Account> allAccounts;
    private final StringResource availableSharesForBuyStringResource;
    private final String backupWithholdingEstimateAmount;
    private final WithholdingEstimatedAmount backupWithholdingEstimateAmountResponse;
    private final StringResource buyingPowerAvailableStringResource;
    private final List<String> checkOverrides;
    private final ApiCollateral collateral;
    private final ShareBasedOrderConfiguration configuration;
    private final EquityOrderContext equityOrderContext;
    private final Result<BigDecimal> estimatedTotalFees;
    private final EquityOrderFlowSource flowSource;
    private final DefaultOrderState formState;
    private final Instrument instrument;
    private final boolean isCancelNew;
    private final boolean isCancelPendingCryptoOrdersLoading;
    private final Boolean isMarketBuysEnabled;
    private final boolean isShortPosition;
    private final Money lastTradePrice;
    private final boolean loading;
    private final boolean loadingNbbo;
    private final MarketHours marketHours;
    private final String microgramOrderSummary;
    private final Monitoring microgramState;
    private final boolean mlpExperimentMember;
    private final NbboSummary nbboSummary;
    private final MarketHours nextEffectiveMarketHours;
    private final boolean overrideToExecuteInMarketHoursOnly;
    private final OrderPositionEffect positionEffect;
    private final EquityOrderRequestInputs requestInputs;
    private final int resetTooltipKey;
    private final boolean reviewing;
    private final ImmutableList<ApiSalesTax> salesTaxes;
    private final StringResource sellAllButtonLabelStringResource;
    private final GenericAlertContent<GenericAction> sessionChangeAlertContent;
    private final Result<ShortingInfo> shortingInfo;
    private final boolean shouldShowAccountSwitcher;
    private final boolean shouldShowBackupWithholdingEstimate;
    private final boolean shouldShowBackupWithholdingWarning;
    private final boolean showLimitOrdersOnlyDialog;
    private final boolean showTwentyFourHourMarketButton;
    private final boolean showTwentyFourHourMarketDialog;
    private final EquityOrderSide side;
    private final StringResource subzeroDescriptionStringResource;
    private final boolean subzeroMember;
    private final StringResource taxLotsEstCreditStringResource;
    private final StringResource taxLotsGainLossStringResource;
    private final boolean taxLotsM1ExperimentMember;
    private final StringResource taxLotsM1SecondaryStringResource;
    private final StringResource taxLotsTermStringResource;
    private final Integer twentyFourHourMarketRoundedShareQuantity;
    private final ValidationState validationState;
    private final WithholdingStatus withholdingStatus;

    /* compiled from: EquityShareOrderViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EquityOrderSide.values().length];
            try {
                iArr[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EquityOrderSide.SELL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Order.Configuration.values().length];
            try {
                iArr2[Order.Configuration.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Order.Configuration.TRAILING_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Order.Configuration.SIMPLE_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Order.Configuration.LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Order.Configuration.STOP_LOSS.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Order.Configuration.STOP_LIMIT.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component30, reason: from getter */
    private final boolean getMlpExperimentMember() {
        return this.mlpExperimentMember;
    }

    /* renamed from: component31, reason: from getter */
    private final WithholdingStatus getWithholdingStatus() {
        return this.withholdingStatus;
    }

    /* renamed from: component45, reason: from getter */
    private final String getMicrogramOrderSummary() {
        return this.microgramOrderSummary;
    }

    /* renamed from: component46, reason: from getter */
    private final Monitoring getMicrogramState() {
        return this.microgramState;
    }

    /* renamed from: component56-xLWZpok, reason: not valid java name */
    private final Result<ShortingInfo> m19374component56xLWZpok() {
        return this.shortingInfo;
    }

    /* renamed from: component57, reason: from getter */
    private final int getResetTooltipKey() {
        return this.resetTooltipKey;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component11, reason: from getter */
    public final EquityOrderRequestInputs getRequestInputs() {
        return this.requestInputs;
    }

    /* renamed from: component12, reason: from getter */
    public final EquityOrderContext getEquityOrderContext() {
        return this.equityOrderContext;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component14, reason: from getter */
    public final DefaultOrderState getFormState() {
        return this.formState;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getReviewing() {
        return this.reviewing;
    }

    /* renamed from: component16, reason: from getter */
    public final ValidationState getValidationState() {
        return this.validationState;
    }

    /* renamed from: component17, reason: from getter */
    public final Money getLastTradePrice() {
        return this.lastTradePrice;
    }

    /* renamed from: component18-xLWZpok, reason: not valid java name */
    public final Result<BigDecimal> m19375component18xLWZpok() {
        return this.estimatedTotalFees;
    }

    public final ImmutableList<ApiSalesTax> component19() {
        return this.salesTaxes;
    }

    /* renamed from: component2, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getShouldShowBackupWithholdingEstimate() {
        return this.shouldShowBackupWithholdingEstimate;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getShouldShowBackupWithholdingWarning() {
        return this.shouldShowBackupWithholdingWarning;
    }

    /* renamed from: component22, reason: from getter */
    public final StringResource getAccountNameTitle() {
        return this.accountNameTitle;
    }

    /* renamed from: component23, reason: from getter */
    public final StringResource getAccountNameSubtitle() {
        return this.accountNameSubtitle;
    }

    /* renamed from: component24, reason: from getter */
    public final InstrumentAccountSwitcherState getAccountSwitcherState() {
        return this.accountSwitcherState;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getShowTwentyFourHourMarketButton() {
        return this.showTwentyFourHourMarketButton;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getShowTwentyFourHourMarketDialog() {
        return this.showTwentyFourHourMarketDialog;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getShowLimitOrdersOnlyDialog() {
        return this.showLimitOrdersOnlyDialog;
    }

    /* renamed from: component28, reason: from getter */
    public final EquityOrderSide getSide() {
        return this.side;
    }

    /* renamed from: component29, reason: from getter */
    public final String getBackupWithholdingEstimateAmount() {
        return this.backupWithholdingEstimateAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    /* renamed from: component32, reason: from getter */
    public final ApiCollateral getCollateral() {
        return this.collateral;
    }

    /* renamed from: component33, reason: from getter */
    public final boolean getShouldShowAccountSwitcher() {
        return this.shouldShowAccountSwitcher;
    }

    /* renamed from: component34, reason: from getter */
    public final boolean getLoadingNbbo() {
        return this.loadingNbbo;
    }

    /* renamed from: component35, reason: from getter */
    public final MarketHours getNextEffectiveMarketHours() {
        return this.nextEffectiveMarketHours;
    }

    /* renamed from: component36, reason: from getter */
    public final StringResource getSellAllButtonLabelStringResource() {
        return this.sellAllButtonLabelStringResource;
    }

    /* renamed from: component37, reason: from getter */
    public final StringResource getAvailableSharesForBuyStringResource() {
        return this.availableSharesForBuyStringResource;
    }

    /* renamed from: component38, reason: from getter */
    public final StringResource getSubzeroDescriptionStringResource() {
        return this.subzeroDescriptionStringResource;
    }

    /* renamed from: component39, reason: from getter */
    public final StringResource getBuyingPowerAvailableStringResource() {
        return this.buyingPowerAvailableStringResource;
    }

    /* renamed from: component4, reason: from getter */
    public final NbboSummary getNbboSummary() {
        return this.nbboSummary;
    }

    /* renamed from: component40$feature_trade_equity_externalDebug, reason: from getter */
    public final Integer getTwentyFourHourMarketRoundedShareQuantity() {
        return this.twentyFourHourMarketRoundedShareQuantity;
    }

    /* renamed from: component41, reason: from getter */
    public final ShareBasedOrderConfiguration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component42, reason: from getter */
    public final boolean getIsCancelPendingCryptoOrdersLoading() {
        return this.isCancelPendingCryptoOrdersLoading;
    }

    /* renamed from: component43, reason: from getter */
    public final Boolean getIsMarketBuysEnabled() {
        return this.isMarketBuysEnabled;
    }

    /* renamed from: component44, reason: from getter */
    public final boolean getIsShortPosition() {
        return this.isShortPosition;
    }

    /* renamed from: component47, reason: from getter */
    public final EquityOrderFlowSource getFlowSource() {
        return this.flowSource;
    }

    /* renamed from: component48, reason: from getter */
    public final boolean getIsCancelNew() {
        return this.isCancelNew;
    }

    /* renamed from: component49, reason: from getter */
    public final StringResource getTaxLotsTermStringResource() {
        return this.taxLotsTermStringResource;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getOverrideToExecuteInMarketHoursOnly() {
        return this.overrideToExecuteInMarketHoursOnly;
    }

    /* renamed from: component50, reason: from getter */
    public final StringResource getTaxLotsGainLossStringResource() {
        return this.taxLotsGainLossStringResource;
    }

    /* renamed from: component51, reason: from getter */
    public final StringResource getTaxLotsEstCreditStringResource() {
        return this.taxLotsEstCreditStringResource;
    }

    /* renamed from: component52, reason: from getter */
    public final StringResource getTaxLotsM1SecondaryStringResource() {
        return this.taxLotsM1SecondaryStringResource;
    }

    /* renamed from: component53, reason: from getter */
    public final boolean getTaxLotsM1ExperimentMember() {
        return this.taxLotsM1ExperimentMember;
    }

    /* renamed from: component54$feature_trade_equity_externalDebug, reason: from getter */
    public final boolean getSubzeroMember() {
        return this.subzeroMember;
    }

    /* renamed from: component55, reason: from getter */
    public final OrderPositionEffect getPositionEffect() {
        return this.positionEffect;
    }

    public final List<String> component6() {
        return this.checkOverrides;
    }

    /* renamed from: component7, reason: from getter */
    public final WithholdingEstimatedAmount getBackupWithholdingEstimateAmountResponse() {
        return this.backupWithholdingEstimateAmountResponse;
    }

    public final List<Account> component8() {
        return this.allAccounts;
    }

    public final GenericAlertContent<GenericAction> component9() {
        return this.sessionChangeAlertContent;
    }

    public final EquityShareOrderViewState copy(Instrument instrument, Account account, MarketHours marketHours, NbboSummary nbboSummary, boolean overrideToExecuteInMarketHoursOnly, List<String> checkOverrides, WithholdingEstimatedAmount backupWithholdingEstimateAmountResponse, List<Account> allAccounts, GenericAlertContent<? extends GenericAction> sessionChangeAlertContent, String accountNumber, EquityOrderRequestInputs requestInputs, EquityOrderContext equityOrderContext, boolean loading, DefaultOrderState formState, boolean reviewing, ValidationState validationState, Money lastTradePrice, Result<? extends BigDecimal> estimatedTotalFees, ImmutableList<ApiSalesTax> salesTaxes, boolean shouldShowBackupWithholdingEstimate, boolean shouldShowBackupWithholdingWarning, StringResource accountNameTitle, StringResource accountNameSubtitle, InstrumentAccountSwitcherState accountSwitcherState, boolean showTwentyFourHourMarketButton, boolean showTwentyFourHourMarketDialog, boolean showLimitOrdersOnlyDialog, EquityOrderSide side, String backupWithholdingEstimateAmount, boolean mlpExperimentMember, WithholdingStatus withholdingStatus, ApiCollateral collateral, boolean shouldShowAccountSwitcher, boolean loadingNbbo, MarketHours nextEffectiveMarketHours, StringResource sellAllButtonLabelStringResource, StringResource availableSharesForBuyStringResource, StringResource subzeroDescriptionStringResource, StringResource buyingPowerAvailableStringResource, Integer twentyFourHourMarketRoundedShareQuantity, ShareBasedOrderConfiguration configuration, boolean isCancelPendingCryptoOrdersLoading, Boolean isMarketBuysEnabled, boolean isShortPosition, String microgramOrderSummary, Monitoring microgramState, EquityOrderFlowSource flowSource, boolean isCancelNew, StringResource taxLotsTermStringResource, StringResource taxLotsGainLossStringResource, StringResource taxLotsEstCreditStringResource, StringResource taxLotsM1SecondaryStringResource, boolean taxLotsM1ExperimentMember, boolean subzeroMember, OrderPositionEffect positionEffect, Result<ShortingInfo> shortingInfo, int resetTooltipKey) {
        Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(formState, "formState");
        Intrinsics.checkNotNullParameter(validationState, "validationState");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(flowSource, "flowSource");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        return new EquityShareOrderViewState(instrument, account, marketHours, nbboSummary, overrideToExecuteInMarketHoursOnly, checkOverrides, backupWithholdingEstimateAmountResponse, allAccounts, sessionChangeAlertContent, accountNumber, requestInputs, equityOrderContext, loading, formState, reviewing, validationState, lastTradePrice, estimatedTotalFees, salesTaxes, shouldShowBackupWithholdingEstimate, shouldShowBackupWithholdingWarning, accountNameTitle, accountNameSubtitle, accountSwitcherState, showTwentyFourHourMarketButton, showTwentyFourHourMarketDialog, showLimitOrdersOnlyDialog, side, backupWithholdingEstimateAmount, mlpExperimentMember, withholdingStatus, collateral, shouldShowAccountSwitcher, loadingNbbo, nextEffectiveMarketHours, sellAllButtonLabelStringResource, availableSharesForBuyStringResource, subzeroDescriptionStringResource, buyingPowerAvailableStringResource, twentyFourHourMarketRoundedShareQuantity, configuration, isCancelPendingCryptoOrdersLoading, isMarketBuysEnabled, isShortPosition, microgramOrderSummary, microgramState, flowSource, isCancelNew, taxLotsTermStringResource, taxLotsGainLossStringResource, taxLotsEstCreditStringResource, taxLotsM1SecondaryStringResource, taxLotsM1ExperimentMember, subzeroMember, positionEffect, shortingInfo, resetTooltipKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityShareOrderViewState)) {
            return false;
        }
        EquityShareOrderViewState equityShareOrderViewState = (EquityShareOrderViewState) other;
        return Intrinsics.areEqual(this.instrument, equityShareOrderViewState.instrument) && Intrinsics.areEqual(this.account, equityShareOrderViewState.account) && Intrinsics.areEqual(this.marketHours, equityShareOrderViewState.marketHours) && Intrinsics.areEqual(this.nbboSummary, equityShareOrderViewState.nbboSummary) && this.overrideToExecuteInMarketHoursOnly == equityShareOrderViewState.overrideToExecuteInMarketHoursOnly && Intrinsics.areEqual(this.checkOverrides, equityShareOrderViewState.checkOverrides) && Intrinsics.areEqual(this.backupWithholdingEstimateAmountResponse, equityShareOrderViewState.backupWithholdingEstimateAmountResponse) && Intrinsics.areEqual(this.allAccounts, equityShareOrderViewState.allAccounts) && Intrinsics.areEqual(this.sessionChangeAlertContent, equityShareOrderViewState.sessionChangeAlertContent) && Intrinsics.areEqual(this.accountNumber, equityShareOrderViewState.accountNumber) && Intrinsics.areEqual(this.requestInputs, equityShareOrderViewState.requestInputs) && Intrinsics.areEqual(this.equityOrderContext, equityShareOrderViewState.equityOrderContext) && this.loading == equityShareOrderViewState.loading && this.formState == equityShareOrderViewState.formState && this.reviewing == equityShareOrderViewState.reviewing && Intrinsics.areEqual(this.validationState, equityShareOrderViewState.validationState) && Intrinsics.areEqual(this.lastTradePrice, equityShareOrderViewState.lastTradePrice) && Intrinsics.areEqual(this.estimatedTotalFees, equityShareOrderViewState.estimatedTotalFees) && Intrinsics.areEqual(this.salesTaxes, equityShareOrderViewState.salesTaxes) && this.shouldShowBackupWithholdingEstimate == equityShareOrderViewState.shouldShowBackupWithholdingEstimate && this.shouldShowBackupWithholdingWarning == equityShareOrderViewState.shouldShowBackupWithholdingWarning && Intrinsics.areEqual(this.accountNameTitle, equityShareOrderViewState.accountNameTitle) && Intrinsics.areEqual(this.accountNameSubtitle, equityShareOrderViewState.accountNameSubtitle) && Intrinsics.areEqual(this.accountSwitcherState, equityShareOrderViewState.accountSwitcherState) && this.showTwentyFourHourMarketButton == equityShareOrderViewState.showTwentyFourHourMarketButton && this.showTwentyFourHourMarketDialog == equityShareOrderViewState.showTwentyFourHourMarketDialog && this.showLimitOrdersOnlyDialog == equityShareOrderViewState.showLimitOrdersOnlyDialog && this.side == equityShareOrderViewState.side && Intrinsics.areEqual(this.backupWithholdingEstimateAmount, equityShareOrderViewState.backupWithholdingEstimateAmount) && this.mlpExperimentMember == equityShareOrderViewState.mlpExperimentMember && Intrinsics.areEqual(this.withholdingStatus, equityShareOrderViewState.withholdingStatus) && Intrinsics.areEqual(this.collateral, equityShareOrderViewState.collateral) && this.shouldShowAccountSwitcher == equityShareOrderViewState.shouldShowAccountSwitcher && this.loadingNbbo == equityShareOrderViewState.loadingNbbo && Intrinsics.areEqual(this.nextEffectiveMarketHours, equityShareOrderViewState.nextEffectiveMarketHours) && Intrinsics.areEqual(this.sellAllButtonLabelStringResource, equityShareOrderViewState.sellAllButtonLabelStringResource) && Intrinsics.areEqual(this.availableSharesForBuyStringResource, equityShareOrderViewState.availableSharesForBuyStringResource) && Intrinsics.areEqual(this.subzeroDescriptionStringResource, equityShareOrderViewState.subzeroDescriptionStringResource) && Intrinsics.areEqual(this.buyingPowerAvailableStringResource, equityShareOrderViewState.buyingPowerAvailableStringResource) && Intrinsics.areEqual(this.twentyFourHourMarketRoundedShareQuantity, equityShareOrderViewState.twentyFourHourMarketRoundedShareQuantity) && Intrinsics.areEqual(this.configuration, equityShareOrderViewState.configuration) && this.isCancelPendingCryptoOrdersLoading == equityShareOrderViewState.isCancelPendingCryptoOrdersLoading && Intrinsics.areEqual(this.isMarketBuysEnabled, equityShareOrderViewState.isMarketBuysEnabled) && this.isShortPosition == equityShareOrderViewState.isShortPosition && Intrinsics.areEqual(this.microgramOrderSummary, equityShareOrderViewState.microgramOrderSummary) && Intrinsics.areEqual(this.microgramState, equityShareOrderViewState.microgramState) && this.flowSource == equityShareOrderViewState.flowSource && this.isCancelNew == equityShareOrderViewState.isCancelNew && Intrinsics.areEqual(this.taxLotsTermStringResource, equityShareOrderViewState.taxLotsTermStringResource) && Intrinsics.areEqual(this.taxLotsGainLossStringResource, equityShareOrderViewState.taxLotsGainLossStringResource) && Intrinsics.areEqual(this.taxLotsEstCreditStringResource, equityShareOrderViewState.taxLotsEstCreditStringResource) && Intrinsics.areEqual(this.taxLotsM1SecondaryStringResource, equityShareOrderViewState.taxLotsM1SecondaryStringResource) && this.taxLotsM1ExperimentMember == equityShareOrderViewState.taxLotsM1ExperimentMember && this.subzeroMember == equityShareOrderViewState.subzeroMember && this.positionEffect == equityShareOrderViewState.positionEffect && Intrinsics.areEqual(this.shortingInfo, equityShareOrderViewState.shortingInfo) && this.resetTooltipKey == equityShareOrderViewState.resetTooltipKey;
    }

    public int hashCode() {
        Instrument instrument = this.instrument;
        int iHashCode = (instrument == null ? 0 : instrument.hashCode()) * 31;
        Account account = this.account;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        MarketHours marketHours = this.marketHours;
        int iHashCode3 = (iHashCode2 + (marketHours == null ? 0 : marketHours.hashCode())) * 31;
        NbboSummary nbboSummary = this.nbboSummary;
        int iHashCode4 = (((((iHashCode3 + (nbboSummary == null ? 0 : nbboSummary.hashCode())) * 31) + Boolean.hashCode(this.overrideToExecuteInMarketHoursOnly)) * 31) + this.checkOverrides.hashCode()) * 31;
        WithholdingEstimatedAmount withholdingEstimatedAmount = this.backupWithholdingEstimateAmountResponse;
        int iHashCode5 = (((iHashCode4 + (withholdingEstimatedAmount == null ? 0 : withholdingEstimatedAmount.hashCode())) * 31) + this.allAccounts.hashCode()) * 31;
        GenericAlertContent<GenericAction> genericAlertContent = this.sessionChangeAlertContent;
        int iHashCode6 = (iHashCode5 + (genericAlertContent == null ? 0 : genericAlertContent.hashCode())) * 31;
        String str = this.accountNumber;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        EquityOrderRequestInputs equityOrderRequestInputs = this.requestInputs;
        int iHashCode8 = (iHashCode7 + (equityOrderRequestInputs == null ? 0 : equityOrderRequestInputs.hashCode())) * 31;
        EquityOrderContext equityOrderContext = this.equityOrderContext;
        int iHashCode9 = (((((((((iHashCode8 + (equityOrderContext == null ? 0 : equityOrderContext.hashCode())) * 31) + Boolean.hashCode(this.loading)) * 31) + this.formState.hashCode()) * 31) + Boolean.hashCode(this.reviewing)) * 31) + this.validationState.hashCode()) * 31;
        Money money = this.lastTradePrice;
        int iHashCode10 = (iHashCode9 + (money == null ? 0 : money.hashCode())) * 31;
        Result<BigDecimal> result = this.estimatedTotalFees;
        int iM28554hashCodeimpl = (iHashCode10 + (result == null ? 0 : Result.m28554hashCodeimpl(result.getValue()))) * 31;
        ImmutableList<ApiSalesTax> immutableList = this.salesTaxes;
        int iHashCode11 = (((((iM28554hashCodeimpl + (immutableList == null ? 0 : immutableList.hashCode())) * 31) + Boolean.hashCode(this.shouldShowBackupWithholdingEstimate)) * 31) + Boolean.hashCode(this.shouldShowBackupWithholdingWarning)) * 31;
        StringResource stringResource = this.accountNameTitle;
        int iHashCode12 = (iHashCode11 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        StringResource stringResource2 = this.accountNameSubtitle;
        int iHashCode13 = (iHashCode12 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
        InstrumentAccountSwitcherState instrumentAccountSwitcherState = this.accountSwitcherState;
        int iHashCode14 = (((((((((iHashCode13 + (instrumentAccountSwitcherState == null ? 0 : instrumentAccountSwitcherState.hashCode())) * 31) + Boolean.hashCode(this.showTwentyFourHourMarketButton)) * 31) + Boolean.hashCode(this.showTwentyFourHourMarketDialog)) * 31) + Boolean.hashCode(this.showLimitOrdersOnlyDialog)) * 31) + this.side.hashCode()) * 31;
        String str2 = this.backupWithholdingEstimateAmount;
        int iHashCode15 = (((iHashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.mlpExperimentMember)) * 31;
        WithholdingStatus withholdingStatus = this.withholdingStatus;
        int iHashCode16 = (iHashCode15 + (withholdingStatus == null ? 0 : withholdingStatus.hashCode())) * 31;
        ApiCollateral apiCollateral = this.collateral;
        int iHashCode17 = (((((iHashCode16 + (apiCollateral == null ? 0 : apiCollateral.hashCode())) * 31) + Boolean.hashCode(this.shouldShowAccountSwitcher)) * 31) + Boolean.hashCode(this.loadingNbbo)) * 31;
        MarketHours marketHours2 = this.nextEffectiveMarketHours;
        int iHashCode18 = (iHashCode17 + (marketHours2 == null ? 0 : marketHours2.hashCode())) * 31;
        StringResource stringResource3 = this.sellAllButtonLabelStringResource;
        int iHashCode19 = (iHashCode18 + (stringResource3 == null ? 0 : stringResource3.hashCode())) * 31;
        StringResource stringResource4 = this.availableSharesForBuyStringResource;
        int iHashCode20 = (iHashCode19 + (stringResource4 == null ? 0 : stringResource4.hashCode())) * 31;
        StringResource stringResource5 = this.subzeroDescriptionStringResource;
        int iHashCode21 = (iHashCode20 + (stringResource5 == null ? 0 : stringResource5.hashCode())) * 31;
        StringResource stringResource6 = this.buyingPowerAvailableStringResource;
        int iHashCode22 = (iHashCode21 + (stringResource6 == null ? 0 : stringResource6.hashCode())) * 31;
        Integer num = this.twentyFourHourMarketRoundedShareQuantity;
        int iHashCode23 = (((((iHashCode22 + (num == null ? 0 : num.hashCode())) * 31) + this.configuration.hashCode()) * 31) + Boolean.hashCode(this.isCancelPendingCryptoOrdersLoading)) * 31;
        Boolean bool = this.isMarketBuysEnabled;
        int iHashCode24 = (((iHashCode23 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isShortPosition)) * 31;
        String str3 = this.microgramOrderSummary;
        int iHashCode25 = (iHashCode24 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Monitoring monitoring = this.microgramState;
        int iHashCode26 = (((((iHashCode25 + (monitoring == null ? 0 : monitoring.hashCode())) * 31) + this.flowSource.hashCode()) * 31) + Boolean.hashCode(this.isCancelNew)) * 31;
        StringResource stringResource7 = this.taxLotsTermStringResource;
        int iHashCode27 = (iHashCode26 + (stringResource7 == null ? 0 : stringResource7.hashCode())) * 31;
        StringResource stringResource8 = this.taxLotsGainLossStringResource;
        int iHashCode28 = (iHashCode27 + (stringResource8 == null ? 0 : stringResource8.hashCode())) * 31;
        StringResource stringResource9 = this.taxLotsEstCreditStringResource;
        int iHashCode29 = (iHashCode28 + (stringResource9 == null ? 0 : stringResource9.hashCode())) * 31;
        StringResource stringResource10 = this.taxLotsM1SecondaryStringResource;
        int iHashCode30 = (((((((iHashCode29 + (stringResource10 == null ? 0 : stringResource10.hashCode())) * 31) + Boolean.hashCode(this.taxLotsM1ExperimentMember)) * 31) + Boolean.hashCode(this.subzeroMember)) * 31) + this.positionEffect.hashCode()) * 31;
        Result<ShortingInfo> result2 = this.shortingInfo;
        return ((iHashCode30 + (result2 != null ? Result.m28554hashCodeimpl(result2.getValue()) : 0)) * 31) + Integer.hashCode(this.resetTooltipKey);
    }

    public String toString() {
        return "EquityShareOrderViewState(instrument=" + this.instrument + ", account=" + this.account + ", marketHours=" + this.marketHours + ", nbboSummary=" + this.nbboSummary + ", overrideToExecuteInMarketHoursOnly=" + this.overrideToExecuteInMarketHoursOnly + ", checkOverrides=" + this.checkOverrides + ", backupWithholdingEstimateAmountResponse=" + this.backupWithholdingEstimateAmountResponse + ", allAccounts=" + this.allAccounts + ", sessionChangeAlertContent=" + this.sessionChangeAlertContent + ", accountNumber=" + this.accountNumber + ", requestInputs=" + this.requestInputs + ", equityOrderContext=" + this.equityOrderContext + ", loading=" + this.loading + ", formState=" + this.formState + ", reviewing=" + this.reviewing + ", validationState=" + this.validationState + ", lastTradePrice=" + this.lastTradePrice + ", estimatedTotalFees=" + this.estimatedTotalFees + ", salesTaxes=" + this.salesTaxes + ", shouldShowBackupWithholdingEstimate=" + this.shouldShowBackupWithholdingEstimate + ", shouldShowBackupWithholdingWarning=" + this.shouldShowBackupWithholdingWarning + ", accountNameTitle=" + this.accountNameTitle + ", accountNameSubtitle=" + this.accountNameSubtitle + ", accountSwitcherState=" + this.accountSwitcherState + ", showTwentyFourHourMarketButton=" + this.showTwentyFourHourMarketButton + ", showTwentyFourHourMarketDialog=" + this.showTwentyFourHourMarketDialog + ", showLimitOrdersOnlyDialog=" + this.showLimitOrdersOnlyDialog + ", side=" + this.side + ", backupWithholdingEstimateAmount=" + this.backupWithholdingEstimateAmount + ", mlpExperimentMember=" + this.mlpExperimentMember + ", withholdingStatus=" + this.withholdingStatus + ", collateral=" + this.collateral + ", shouldShowAccountSwitcher=" + this.shouldShowAccountSwitcher + ", loadingNbbo=" + this.loadingNbbo + ", nextEffectiveMarketHours=" + this.nextEffectiveMarketHours + ", sellAllButtonLabelStringResource=" + this.sellAllButtonLabelStringResource + ", availableSharesForBuyStringResource=" + this.availableSharesForBuyStringResource + ", subzeroDescriptionStringResource=" + this.subzeroDescriptionStringResource + ", buyingPowerAvailableStringResource=" + this.buyingPowerAvailableStringResource + ", twentyFourHourMarketRoundedShareQuantity=" + this.twentyFourHourMarketRoundedShareQuantity + ", configuration=" + this.configuration + ", isCancelPendingCryptoOrdersLoading=" + this.isCancelPendingCryptoOrdersLoading + ", isMarketBuysEnabled=" + this.isMarketBuysEnabled + ", isShortPosition=" + this.isShortPosition + ", microgramOrderSummary=" + this.microgramOrderSummary + ", microgramState=" + this.microgramState + ", flowSource=" + this.flowSource + ", isCancelNew=" + this.isCancelNew + ", taxLotsTermStringResource=" + this.taxLotsTermStringResource + ", taxLotsGainLossStringResource=" + this.taxLotsGainLossStringResource + ", taxLotsEstCreditStringResource=" + this.taxLotsEstCreditStringResource + ", taxLotsM1SecondaryStringResource=" + this.taxLotsM1SecondaryStringResource + ", taxLotsM1ExperimentMember=" + this.taxLotsM1ExperimentMember + ", subzeroMember=" + this.subzeroMember + ", positionEffect=" + this.positionEffect + ", shortingInfo=" + this.shortingInfo + ", resetTooltipKey=" + this.resetTooltipKey + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EquityShareOrderViewState(Instrument instrument, Account account, MarketHours marketHours, NbboSummary nbboSummary, boolean z, List<String> checkOverrides, WithholdingEstimatedAmount withholdingEstimatedAmount, List<Account> allAccounts, GenericAlertContent<? extends GenericAction> genericAlertContent, String str, EquityOrderRequestInputs equityOrderRequestInputs, EquityOrderContext equityOrderContext, boolean z2, DefaultOrderState formState, boolean z3, ValidationState validationState, Money money, Result<? extends BigDecimal> result, ImmutableList<ApiSalesTax> immutableList, boolean z4, boolean z5, StringResource stringResource, StringResource stringResource2, InstrumentAccountSwitcherState instrumentAccountSwitcherState, boolean z6, boolean z7, boolean z8, EquityOrderSide side, String str2, boolean z9, WithholdingStatus withholdingStatus, ApiCollateral apiCollateral, boolean z10, boolean z11, MarketHours marketHours2, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, StringResource stringResource6, Integer num, ShareBasedOrderConfiguration configuration, boolean z12, Boolean bool, boolean z13, String str3, Monitoring monitoring, EquityOrderFlowSource flowSource, boolean z14, StringResource stringResource7, StringResource stringResource8, StringResource stringResource9, StringResource stringResource10, boolean z15, boolean z16, OrderPositionEffect positionEffect, Result<ShortingInfo> result2, int i) {
        Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(formState, "formState");
        Intrinsics.checkNotNullParameter(validationState, "validationState");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(flowSource, "flowSource");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        this.instrument = instrument;
        this.account = account;
        this.marketHours = marketHours;
        this.nbboSummary = nbboSummary;
        this.overrideToExecuteInMarketHoursOnly = z;
        this.checkOverrides = checkOverrides;
        this.backupWithholdingEstimateAmountResponse = withholdingEstimatedAmount;
        this.allAccounts = allAccounts;
        this.sessionChangeAlertContent = genericAlertContent;
        this.accountNumber = str;
        this.requestInputs = equityOrderRequestInputs;
        this.equityOrderContext = equityOrderContext;
        this.loading = z2;
        this.formState = formState;
        this.reviewing = z3;
        this.validationState = validationState;
        this.lastTradePrice = money;
        this.estimatedTotalFees = result;
        this.salesTaxes = immutableList;
        this.shouldShowBackupWithholdingEstimate = z4;
        this.shouldShowBackupWithholdingWarning = z5;
        this.accountNameTitle = stringResource;
        this.accountNameSubtitle = stringResource2;
        this.accountSwitcherState = instrumentAccountSwitcherState;
        this.showTwentyFourHourMarketButton = z6;
        this.showTwentyFourHourMarketDialog = z7;
        this.showLimitOrdersOnlyDialog = z8;
        this.side = side;
        this.backupWithholdingEstimateAmount = str2;
        this.mlpExperimentMember = z9;
        this.withholdingStatus = withholdingStatus;
        this.collateral = apiCollateral;
        this.shouldShowAccountSwitcher = z10;
        this.loadingNbbo = z11;
        this.nextEffectiveMarketHours = marketHours2;
        this.sellAllButtonLabelStringResource = stringResource3;
        this.availableSharesForBuyStringResource = stringResource4;
        this.subzeroDescriptionStringResource = stringResource5;
        this.buyingPowerAvailableStringResource = stringResource6;
        this.twentyFourHourMarketRoundedShareQuantity = num;
        this.configuration = configuration;
        this.isCancelPendingCryptoOrdersLoading = z12;
        this.isMarketBuysEnabled = bool;
        this.isShortPosition = z13;
        this.microgramOrderSummary = str3;
        this.microgramState = monitoring;
        this.flowSource = flowSource;
        this.isCancelNew = z14;
        this.taxLotsTermStringResource = stringResource7;
        this.taxLotsGainLossStringResource = stringResource8;
        this.taxLotsEstCreditStringResource = stringResource9;
        this.taxLotsM1SecondaryStringResource = stringResource10;
        this.taxLotsM1ExperimentMember = z15;
        this.subzeroMember = z16;
        this.positionEffect = positionEffect;
        this.shortingInfo = result2;
        this.resetTooltipKey = i;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final NbboSummary getNbboSummary() {
        return this.nbboSummary;
    }

    public final boolean getOverrideToExecuteInMarketHoursOnly() {
        return this.overrideToExecuteInMarketHoursOnly;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ EquityShareOrderViewState(com.robinhood.models.p320db.Instrument r63, com.robinhood.models.p320db.Account r64, com.robinhood.models.p320db.MarketHours r65, com.robinhood.nbbo.models.p359db.NbboSummary r66, boolean r67, java.util.List r68, com.robinhood.models.p320db.bonfire.WithholdingEstimatedAmount r69, java.util.List r70, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent r71, java.lang.String r72, com.robinhood.android.equity.validation.EquityOrderRequestInputs r73, com.robinhood.android.equity.validation.EquityOrderContext r74, boolean r75, com.robinhood.android.lib.trade.DefaultOrderState r76, boolean r77, com.robinhood.android.equity.ordercheck.ValidationState r78, com.robinhood.models.util.Money r79, kotlin.Result r80, kotlinx.collections.immutable.ImmutableList r81, boolean r82, boolean r83, com.robinhood.utils.resource.StringResource r84, com.robinhood.utils.resource.StringResource r85, com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState r86, boolean r87, boolean r88, boolean r89, com.robinhood.models.p320db.EquityOrderSide r90, java.lang.String r91, boolean r92, com.robinhood.models.p320db.bonfire.WithholdingStatus r93, com.robinhood.models.api.ApiCollateral r94, boolean r95, boolean r96, com.robinhood.models.p320db.MarketHours r97, com.robinhood.utils.resource.StringResource r98, com.robinhood.utils.resource.StringResource r99, com.robinhood.utils.resource.StringResource r100, com.robinhood.utils.resource.StringResource r101, java.lang.Integer r102, com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration r103, boolean r104, java.lang.Boolean r105, boolean r106, java.lang.String r107, microgram.android.Monitoring r108, com.robinhood.android.trading.contracts.EquityOrderFlowSource r109, boolean r110, com.robinhood.utils.resource.StringResource r111, com.robinhood.utils.resource.StringResource r112, com.robinhood.utils.resource.StringResource r113, com.robinhood.utils.resource.StringResource r114, boolean r115, boolean r116, com.robinhood.models.p320db.OrderPositionEffect r117, kotlin.Result r118, int r119, int r120, int r121, kotlin.jvm.internal.DefaultConstructorMarker r122) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.trade.equity.p261ui.share.EquityShareOrderViewState.<init>(com.robinhood.models.db.Instrument, com.robinhood.models.db.Account, com.robinhood.models.db.MarketHours, com.robinhood.nbbo.models.db.NbboSummary, boolean, java.util.List, com.robinhood.models.db.bonfire.WithholdingEstimatedAmount, java.util.List, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent, java.lang.String, com.robinhood.android.equity.validation.EquityOrderRequestInputs, com.robinhood.android.equity.validation.EquityOrderContext, boolean, com.robinhood.android.lib.trade.DefaultOrderState, boolean, com.robinhood.android.equity.ordercheck.ValidationState, com.robinhood.models.util.Money, kotlin.Result, kotlinx.collections.immutable.ImmutableList, boolean, boolean, com.robinhood.utils.resource.StringResource, com.robinhood.utils.resource.StringResource, com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState, boolean, boolean, boolean, com.robinhood.models.db.EquityOrderSide, java.lang.String, boolean, com.robinhood.models.db.bonfire.WithholdingStatus, com.robinhood.models.api.ApiCollateral, boolean, boolean, com.robinhood.models.db.MarketHours, com.robinhood.utils.resource.StringResource, com.robinhood.utils.resource.StringResource, com.robinhood.utils.resource.StringResource, com.robinhood.utils.resource.StringResource, java.lang.Integer, com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration, boolean, java.lang.Boolean, boolean, java.lang.String, microgram.android.MicrogramState, com.robinhood.android.trading.contracts.EquityOrderFlowSource, boolean, com.robinhood.utils.resource.StringResource, com.robinhood.utils.resource.StringResource, com.robinhood.utils.resource.StringResource, com.robinhood.utils.resource.StringResource, boolean, boolean, com.robinhood.models.db.OrderPositionEffect, kotlin.Result, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<String> getCheckOverrides() {
        return this.checkOverrides;
    }

    public final WithholdingEstimatedAmount getBackupWithholdingEstimateAmountResponse() {
        return this.backupWithholdingEstimateAmountResponse;
    }

    public final List<Account> getAllAccounts() {
        return this.allAccounts;
    }

    public final GenericAlertContent<GenericAction> getSessionChangeAlertContent() {
        return this.sessionChangeAlertContent;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final EquityOrderRequestInputs getRequestInputs() {
        return this.requestInputs;
    }

    @Override // com.robinhood.android.trade.equity.util.EquityOrderContextHolder
    public EquityOrderContext getEquityOrderContext() {
        return this.equityOrderContext;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final DefaultOrderState getFormState() {
        return this.formState;
    }

    public final boolean getReviewing() {
        return this.reviewing;
    }

    public final ValidationState getValidationState() {
        return this.validationState;
    }

    public final Money getLastTradePrice() {
        return this.lastTradePrice;
    }

    /* renamed from: getEstimatedTotalFees-xLWZpok, reason: not valid java name */
    public final Result<BigDecimal> m19377getEstimatedTotalFeesxLWZpok() {
        return this.estimatedTotalFees;
    }

    public final ImmutableList<ApiSalesTax> getSalesTaxes() {
        return this.salesTaxes;
    }

    public final boolean getShouldShowBackupWithholdingEstimate() {
        return this.shouldShowBackupWithholdingEstimate;
    }

    public final boolean getShouldShowBackupWithholdingWarning() {
        return this.shouldShowBackupWithholdingWarning;
    }

    public final StringResource getAccountNameTitle() {
        return this.accountNameTitle;
    }

    public final StringResource getAccountNameSubtitle() {
        return this.accountNameSubtitle;
    }

    public final InstrumentAccountSwitcherState getAccountSwitcherState() {
        return this.accountSwitcherState;
    }

    public final boolean getShowTwentyFourHourMarketButton() {
        return this.showTwentyFourHourMarketButton;
    }

    public final boolean getShowTwentyFourHourMarketDialog() {
        return this.showTwentyFourHourMarketDialog;
    }

    public final boolean getShowLimitOrdersOnlyDialog() {
        return this.showLimitOrdersOnlyDialog;
    }

    public final EquityOrderSide getSide() {
        return this.side;
    }

    public final String getBackupWithholdingEstimateAmount() {
        return this.backupWithholdingEstimateAmount;
    }

    public final ApiCollateral getCollateral() {
        return this.collateral;
    }

    public final boolean getShouldShowAccountSwitcher() {
        return this.shouldShowAccountSwitcher;
    }

    public final boolean getLoadingNbbo() {
        return this.loadingNbbo;
    }

    public final MarketHours getNextEffectiveMarketHours() {
        return this.nextEffectiveMarketHours;
    }

    public final StringResource getSellAllButtonLabelStringResource() {
        return this.sellAllButtonLabelStringResource;
    }

    public final StringResource getAvailableSharesForBuyStringResource() {
        return this.availableSharesForBuyStringResource;
    }

    public final StringResource getSubzeroDescriptionStringResource() {
        return this.subzeroDescriptionStringResource;
    }

    public final StringResource getBuyingPowerAvailableStringResource() {
        return this.buyingPowerAvailableStringResource;
    }

    /* renamed from: getTwentyFourHourMarketRoundedShareQuantity$feature_trade_equity_externalDebug */
    public final Integer m2498xe1ff29cc() {
        return this.twentyFourHourMarketRoundedShareQuantity;
    }

    @Override // com.robinhood.android.trade.equity.util.EquityOrderContextHolder
    public ShareBasedOrderConfiguration getConfiguration() {
        return this.configuration;
    }

    public final boolean isCancelPendingCryptoOrdersLoading() {
        return this.isCancelPendingCryptoOrdersLoading;
    }

    public final Boolean isMarketBuysEnabled() {
        return this.isMarketBuysEnabled;
    }

    public final boolean isShortPosition() {
        return this.isShortPosition;
    }

    public final EquityOrderFlowSource getFlowSource() {
        return this.flowSource;
    }

    public final boolean isCancelNew() {
        return this.isCancelNew;
    }

    public final StringResource getTaxLotsTermStringResource() {
        return this.taxLotsTermStringResource;
    }

    public final StringResource getTaxLotsGainLossStringResource() {
        return this.taxLotsGainLossStringResource;
    }

    public final StringResource getTaxLotsEstCreditStringResource() {
        return this.taxLotsEstCreditStringResource;
    }

    public final StringResource getTaxLotsM1SecondaryStringResource() {
        return this.taxLotsM1SecondaryStringResource;
    }

    public final boolean getTaxLotsM1ExperimentMember() {
        return this.taxLotsM1ExperimentMember;
    }

    public final boolean getSubzeroMember$feature_trade_equity_externalDebug() {
        return this.subzeroMember;
    }

    public final OrderPositionEffect getPositionEffect() {
        return this.positionEffect;
    }

    private final boolean isMicrogramReady() {
        Monitoring monitoring = this.microgramState;
        if (monitoring != null) {
            return monitoring.equals(Monitoring.Ready.INSTANCE);
        }
        return false;
    }

    public final boolean getUseMicrogramOrderSummary() {
        return (!isMicrogramReady() || this.marketHours == null || getEquityOrderContext() == null) ? false : true;
    }

    public final boolean getShouldShowPriceGroup() {
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        return (equityOrderContext != null ? equityOrderContext.getConfiguration() : null) != Order.Configuration.TRAILING_STOP;
    }

    public final boolean isTrailingStopOrder() {
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        return (equityOrderContext != null ? equityOrderContext.getConfiguration() : null) == Order.Configuration.TRAILING_STOP;
    }

    public final boolean getShowOrderPriceDrawable() {
        return getConfiguration().isBuySellOrder() && !this.reviewing;
    }

    public final CharSequence getGetPriceText() {
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        if (equityOrderContext == null) {
            return null;
        }
        return Formats.getPriceFormat().format(equityOrderContext.getDisplayPrice());
    }

    public final boolean getShouldSetOrderReviewDrawable() {
        return this.nbboSummary != null;
    }

    public final boolean isPresetPercentLimitOrder() {
        return getConfiguration() instanceof DirectOrder5;
    }

    public final BigDecimal getRoundedDownQuantity() {
        BigDecimal scale;
        BigDecimal shareQuantity = getConfiguration().getShareQuantity();
        if (shareQuantity == null || (scale = shareQuantity.setScale(0, RoundingMode.DOWN)) == null || BigDecimals7.isZero(scale)) {
            return null;
        }
        return scale;
    }

    public final String getTitle(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        if (equityOrderContext != null) {
            return OrderRequests.getCreateOrderTitleString(equityOrderContext, resources);
        }
        return null;
    }

    public final StringResource getDescription() {
        if (getShowTaxLots()) {
            return null;
        }
        StringResource stringResource = this.subzeroDescriptionStringResource;
        if (stringResource != null) {
            return stringResource;
        }
        StringResource stringResource2 = this.availableSharesForBuyStringResource;
        if (stringResource2 != null) {
            return stringResource2;
        }
        if (getConfiguration().isBuySellOrder()) {
            return new StringResource.Join(CollectionsKt.listOfNotNull((Object[]) new StringResource[]{(!this.shouldShowAccountSwitcher || this.isCancelNew) ? this.buyingPowerAvailableStringResource : null, Intrinsics.areEqual(this.isMarketBuysEnabled, Boolean.FALSE) ? getOrderTypeTitle() : null}), " • ");
        }
        if (!this.shouldShowAccountSwitcher || this.isCancelNew) {
            return this.buyingPowerAvailableStringResource;
        }
        return null;
    }

    private final StringResource getOrderTypeTitle() {
        Order.Configuration configuration;
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        if (equityOrderContext == null || (configuration = equityOrderContext.getConfiguration()) == null) {
            return null;
        }
        return OrderRequests.getTitleString(configuration);
    }

    public final StringResource getActionOrderTypeText() {
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        if (equityOrderContext != null) {
            return OrderRequests.getActionOrderTypeString(equityOrderContext, false);
        }
        return null;
    }

    public final StringResource getOrderExecutionLabel() {
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        if (equityOrderContext == null) {
            return null;
        }
        return OrderExecutionLabel.orderExecutionLabel$default(equityOrderContext, this.marketHours, this.reviewing, Intrinsics.areEqual(this.isMarketBuysEnabled, Boolean.TRUE), null, getShowTaxLots(), 8, null);
    }

    public final EquityOrderFormRowState.ExpandableEstimatedCost getExpandableCostState() {
        StringResource totalCostLabelText = getTotalCostLabelText();
        StringResource totalCost = getTotalCost();
        BigDecimal bigDecimalOrZero = BigDecimals7.orZero(getConfiguration().getShareQuantity());
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        return new EquityOrderFormRowState.ExpandableEstimatedCost(totalCostLabelText, totalCost, bigDecimalOrZero, equityOrderContext != null ? equityOrderContext.getEstimatedCost() : null, this.estimatedTotalFees, this.salesTaxes, this.side == EquityOrderSide.SELL_SHORT, m19376getEstimatedTotalDailyBorrowFeexLWZpok(), this.resetTooltipKey);
    }

    /* renamed from: getEstimatedTotalDailyBorrowFee-xLWZpok, reason: not valid java name */
    public final Result<BigDecimal> m19376getEstimatedTotalDailyBorrowFeexLWZpok() {
        Result<ShortingInfo> result = this.shortingInfo;
        if (result == null) {
            return null;
        }
        Object value = result.getValue();
        if (Result.m28556isSuccessimpl(value)) {
            ShortingInfo shortingInfo = (ShortingInfo) value;
            BigDecimal bigDecimalOrZero = BigDecimals7.orZero(getConfiguration().getShareQuantity());
            EquityOrderContext equityOrderContext = getEquityOrderContext();
            value = ShortingInfo2.calculateTradeFlowDailyFee(shortingInfo, bigDecimalOrZero, BigDecimals7.orZero(equityOrderContext != null ? equityOrderContext.getEstimatedCost() : null));
        }
        return Result.m28549boximpl(Result.m28550constructorimpl(value));
    }

    public final boolean getExpandableEstimatedCostRowVisible() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.side.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return this.subzeroMember;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ImmutableList<ApiSalesTax> immutableList = this.salesTaxes;
        return immutableList != null && (immutableList.isEmpty() ^ true);
    }

    public final StringResource getTotalCostLabelText() {
        return OrderSides.getEstimatedCostCreditLabel(this.side);
    }

    public final StringResource getTotalCost() {
        BigDecimal decimalValue;
        WithholdingEstimatedAmount withholdingEstimatedAmount;
        Money amount;
        StringResource stringResource;
        if (getShowTaxLots() && (stringResource = this.taxLotsEstCreditStringResource) != null) {
            return stringResource;
        }
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        if (equityOrderContext == null) {
            return null;
        }
        BigDecimal totalCost = equityOrderContext.getTotalCost();
        if (!this.reviewing || (withholdingEstimatedAmount = this.backupWithholdingEstimateAmountResponse) == null || (amount = withholdingEstimatedAmount.getAmount()) == null || (decimalValue = amount.getDecimalValue()) == null) {
            decimalValue = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(decimalValue);
        BigDecimal bigDecimalSubtract = totalCost.subtract(decimalValue);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        Locale locale = Locale.US;
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        if (BigDecimals7.isZero(bigDecimalSubtract)) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C29365R.string.order_create_total_cost_empty;
            Currency currency = currencyInstance.getCurrency();
            Intrinsics.checkNotNull(currency);
            return companion.invoke(i, currency.getSymbol(locale));
        }
        return StringResource.INSTANCE.invoke(Formats.getAmountFormat().format(BigDecimals4.roundedEstimatedAmount(bigDecimalSubtract, this.side, BigDecimals7.isInteger(BigDecimals7.orZero(getConfiguration().getShareQuantity())))));
    }

    public final CharSequence getCollateralText(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ApiCollateral apiCollateral = this.collateral;
        if (apiCollateral == null || apiCollateral.isEmpty()) {
            return null;
        }
        return OptionExtensions.getDisplayString(this.collateral, context);
    }

    public final StringResource getPriceLabelText() {
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        if (equityOrderContext == null) {
            return null;
        }
        return OrderStringsHelper.INSTANCE.getPriceLabel(equityOrderContext.getConfiguration());
    }

    public final StringResource getTimeInForceStringResource() {
        EquityOrderContext equityOrderContext;
        Order.Configuration configuration;
        if (this.nextEffectiveMarketHours != null && (equityOrderContext = getEquityOrderContext()) != null && (configuration = equityOrderContext.getConfiguration()) != null) {
            switch (WhenMappings.$EnumSwitchMapping$1[configuration.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                case 6:
                    return OrderRequests.getTimeInForceStringResource(getEquityOrderContext(), this.nextEffectiveMarketHours);
                default:
                    Preconditions.INSTANCE.failUnknownEnumKotlin(configuration);
                    throw new ExceptionsH();
            }
        }
        return null;
    }

    public final boolean isEditOrderButtonVisible() {
        if (this.reviewing) {
            return false;
        }
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        Order.Configuration configuration = equityOrderContext != null ? equityOrderContext.getConfiguration() : null;
        switch (configuration == null ? -1 : WhenMappings.$EnumSwitchMapping$1[configuration.ordinal()]) {
        }
        return false;
    }

    public final StringResource getTrailingPegStopPrice() {
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        if (equityOrderContext == null) {
            return null;
        }
        return OrderStringsHelper.INSTANCE.m2499x78e40d41(equityOrderContext);
    }

    public final StringResource getTrailingPegTimeInForceStringResource() {
        EquityOrderContext equityOrderContext;
        if (this.nextEffectiveMarketHours == null || !getHasTrailingPeg() || (equityOrderContext = getEquityOrderContext()) == null) {
            return null;
        }
        return OrderRequests.getTimeInForceStringResource(equityOrderContext, this.nextEffectiveMarketHours);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CharSequence getOrderReviewText$default(EquityShareOrderViewState equityShareOrderViewState, Markwon markwon, Drawable drawable, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.robinhood.android.trade.equity.ui.share.EquityShareOrderViewState$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        return equityShareOrderViewState.getOrderReviewText(markwon, drawable, function0);
    }

    public final CharSequence getOrderReviewText(Markwon markwon, Drawable drawable, Function0<Unit> refreshAction) {
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(refreshAction, "refreshAction");
        String str = this.microgramOrderSummary;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) markwon.toMarkdown(str));
                NbboSummary nbboSummary = this.nbboSummary;
                if (nbboSummary != null) {
                    NbboSpanBuilders.appendNbboOrderSummary(spannableStringBuilder, nbboSummary, this.loadingNbbo, drawable, refreshAction);
                }
                return new SpannedString(spannableStringBuilder);
            }
        }
        return null;
    }

    private final boolean getHasTrailingPeg() {
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        return (equityOrderContext != null ? equityOrderContext.getTrailingPeg() : null) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional<com.robinhood.rosetta.eventlogging.Context> getLoggingEquityOrderContext() {
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        if (equityOrderContext != null) {
            Optional.Companion companion = Optional.INSTANCE;
            com.robinhood.rosetta.eventlogging.EquityOrderContext rosetta2 = equityOrderContext.toRosetta();
            String str = null;
            BrokerageAccountContext brokerageAccountContext = new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(equityOrderContext.getBrokerageAccountType()), null, null, str, false, false, null, null, null, null, 1022, null);
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Optional<com.robinhood.rosetta.eventlogging.Context> optionalM2972of = companion.m2972of(new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, str, null, null, objArr2, objArr3, 0, objArr4, this.flowSource.getLoggingValue(), objArr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, rosetta2, null, null, null, null, null, null, null, null, null, null, brokerageAccountContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -536870913, -257, -1, -1, 16383, null));
            if (optionalM2972of != null) {
                return optionalM2972of;
            }
        }
        return Optional2.INSTANCE;
    }

    public final StringResource getToolbarTitle() {
        StringResource orderTypeTitle = getOrderTypeTitle();
        if (this.reviewing) {
            orderTypeTitle = null;
        }
        if (this.isCancelNew || (((getConfiguration() instanceof DirectOrder5) || (getConfiguration() instanceof ShareMarket)) && Intrinsics.areEqual(this.isMarketBuysEnabled, Boolean.TRUE))) {
            return orderTypeTitle;
        }
        return null;
    }

    public final boolean getShowTaxLots() {
        return (getConfiguration() instanceof AdvancedOrder) && getConfiguration().getTaxLots();
    }

    public final boolean getShowTaxLotsM1() {
        return getShowTaxLots() && this.taxLotsM1ExperimentMember;
    }

    public final StringResource getWithholdingWarningString() {
        return WithholdingStatuses.getWithholdingWarningString(this.withholdingStatus, this.mlpExperimentMember, this.instrument);
    }
}
