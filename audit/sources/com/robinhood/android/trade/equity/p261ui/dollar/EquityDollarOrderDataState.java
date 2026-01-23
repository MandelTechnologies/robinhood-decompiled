package com.robinhood.android.trade.equity.p261ui.dollar;

import com.robinhood.android.equity.ordercheck.ValidationState;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderContextFactory;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.equity.validation.event.EquityOrderEvent;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.tickerinputview.CharArrays;
import com.robinhood.android.trade.equity.util.BigDecimals4;
import com.robinhood.android.trading.contracts.configuration.DirectOrder3;
import com.robinhood.android.trading.contracts.configuration.DirectOrder5;
import com.robinhood.android.trading.contracts.configuration.DirectOrder8;
import com.robinhood.android.trading.contracts.configuration.DirectOrder9;
import com.robinhood.android.trading.contracts.configuration.DollarBased;
import com.robinhood.android.trading.contracts.configuration.ShareBasic;
import com.robinhood.models.api.ApiQuickTradeAmounts;
import com.robinhood.models.api.OrderRequest2;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.models.p320db.bonfire.WithholdingStatus;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.p347db.GenericOrderCheckAction;
import com.robinhood.models.util.Money;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.utils.math.BigDecimals7;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.android.Monitoring;
import p479j$.time.Instant;

/* compiled from: EquityDollarOrderDataState.kt */
@Metadata(m3635d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0011\u0012\b\b\u0002\u0010#\u001a\u00020\u000b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010&\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0011\u0012\b\b\u0002\u0010)\u001a\u00020\u000b\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010,\u001a\u00020\u000b\u0012\b\b\u0002\u0010-\u001a\u00020\u000b\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010(\u0012\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0011\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000107\u0012\b\b\u0002\u00108\u001a\u00020\u000b\u0012\b\b\u0002\u00109\u001a\u00020\u000b\u0012\b\b\u0002\u0010:\u001a\u00020\u000b\u0012\b\b\u0002\u0010;\u001a\u00020\u000b¢\u0006\u0004\b<\u0010=J\u0014\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0087\u00012\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001J\n\u0010\u008f\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u000bHÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u000bHÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010 HÆ\u0003J\u0010\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u0011HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u000bHÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010%HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u000bHÆ\u0003J\u0010\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020(0\u0011HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u000bHÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010+HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010§\u0001\u001a\u00020\u000bHÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\u0012\u0010©\u0001\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010(HÆ\u0003J\u0010\u0010«\u0001\u001a\b\u0012\u0004\u0012\u0002050\u0011HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u000107HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010®\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010°\u0001\u001a\u00020\u000bHÆ\u0003J\u009c\u0003\u0010±\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00112\b\b\u0002\u0010#\u001a\u00020\u000b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010&\u001a\u00020\u000b2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00112\b\b\u0002\u0010)\u001a\u00020\u000b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u000202\u0018\u0001012\n\b\u0002\u00103\u001a\u0004\u0018\u00010(2\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00112\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\b\b\u0002\u00108\u001a\u00020\u000b2\b\b\u0002\u00109\u001a\u00020\u000b2\b\b\u0002\u0010:\u001a\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020\u000bHÆ\u0001J\u0015\u0010²\u0001\u001a\u00020\u000b2\t\u0010³\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010´\u0001\u001a\u00030µ\u0001HÖ\u0001J\n\u0010¶\u0001\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010\u0013\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bN\u0010GR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0011¢\u0006\b\n\u0000\u001a\u0004\b]\u0010MR\u0011\u0010#\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b^\u0010GR\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0011\u0010&\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\ba\u0010GR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0011¢\u0006\b\n\u0000\u001a\u0004\bb\u0010MR\u0011\u0010)\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010GR\u0013\u0010*\u001a\u0004\u0018\u00010+¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0011\u0010,\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010GR\u0011\u0010-\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\be\u0010GR\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u0019\u00100\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0013\u00103\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0011¢\u0006\b\n\u0000\u001a\u0004\bl\u0010MR\u0013\u00106\u001a\u0004\u0018\u000107¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0011\u00108\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bo\u0010GR\u0011\u00109\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bp\u0010GR\u0011\u0010:\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bq\u0010GR\u0011\u0010;\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\br\u0010GR\u0013\u0010s\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\bt\u0010kR\u0011\u0010u\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bv\u0010CR\u0013\u0010w\u001a\u0004\u0018\u00010x8F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0013\u0010{\u001a\u0004\u0018\u00010|8F¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0011\u0010\u007f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010GR\u0015\u0010\u0080\u0001\u001a\u00030\u0081\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0013\u0010\u0084\u0001\u001a\u00020\u000b¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010GR\u0017\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u00018F¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0017\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0087\u00018F¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u0089\u0001¨\u0006·\u0001"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;", "quantityOrAmount", "Lcom/robinhood/models/api/QuantityOrAmount;", "overrideCharArray", "", "validationState", "Lcom/robinhood/android/equity/ordercheck/ValidationState;", "loadingNbbo", "", "apiQuickTradeAmounts", "Lcom/robinhood/models/api/ApiQuickTradeAmounts;", "instrumentAccountSwitcher", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;", "allAccounts", "", "Lcom/robinhood/models/db/Account;", "loadingAccountSwitcher", "account", "instrument", "Lcom/robinhood/models/db/Instrument;", "instrumentBuyingPower", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "tradingSession", "Lcom/robinhood/models/db/TradingSession;", "position", "Lcom/robinhood/models/db/Position;", "quote", "Lcom/robinhood/models/db/Quote;", "nbboSummary", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "experiments", "Lcom/robinhood/models/db/KaizenExperiment;", "overrideToExecuteInMarketHoursOnly", "overrideMarketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "overrideFlipIpoAccessShares", "checkOverrides", "", "isCancelPendingCryptoOrdersLoading", "staticInputs", "Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;", "isBackupWithheld", "mlpExperimentMember", "withholdingStatus", "Lcom/robinhood/models/db/bonfire/WithholdingStatus;", "sessionChangeAlertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "microgramOrderSummary", "silentActionsTaken", "Lcom/robinhood/models/serverdriven/db/GenericOrderCheckAction;", "microgramState", "Lmicrogram/android/MicrogramState;", "marketBuysEnabled", "subzeroM2Enabled", "hasSalesTaxes", "useSduiAccountSwitcher", "<init>", "(Lcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;Lcom/robinhood/models/api/QuantityOrAmount;[CLcom/robinhood/android/equity/ordercheck/ValidationState;ZLcom/robinhood/models/api/ApiQuickTradeAmounts;Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;Ljava/util/List;ZLcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/InstrumentBuyingPower;Lcom/robinhood/models/db/TradingSession;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/Quote;Lcom/robinhood/nbbo/models/db/NbboSummary;Ljava/util/List;ZLcom/robinhood/models/db/OrderMarketHours;ZLjava/util/List;ZLcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;ZZLcom/robinhood/models/db/bonfire/WithholdingStatus;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Ljava/lang/String;Ljava/util/List;Lmicrogram/android/MicrogramState;ZZZZ)V", "getConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;", "getQuantityOrAmount", "()Lcom/robinhood/models/api/QuantityOrAmount;", "getOverrideCharArray", "()[C", "getValidationState", "()Lcom/robinhood/android/equity/ordercheck/ValidationState;", "getLoadingNbbo", "()Z", "getApiQuickTradeAmounts", "()Lcom/robinhood/models/api/ApiQuickTradeAmounts;", "getInstrumentAccountSwitcher", "()Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;", "getAllAccounts", "()Ljava/util/List;", "getLoadingAccountSwitcher", "getAccount", "()Lcom/robinhood/models/db/Account;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getInstrumentBuyingPower", "()Lcom/robinhood/models/db/InstrumentBuyingPower;", "getTradingSession", "()Lcom/robinhood/models/db/TradingSession;", "getPosition", "()Lcom/robinhood/models/db/Position;", "getQuote", "()Lcom/robinhood/models/db/Quote;", "getNbboSummary", "()Lcom/robinhood/nbbo/models/db/NbboSummary;", "getExperiments", "getOverrideToExecuteInMarketHoursOnly", "getOverrideMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "getOverrideFlipIpoAccessShares", "getCheckOverrides", "getStaticInputs", "()Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;", "getMlpExperimentMember", "getWithholdingStatus", "()Lcom/robinhood/models/db/bonfire/WithholdingStatus;", "getSessionChangeAlertContent", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "getMicrogramOrderSummary", "()Ljava/lang/String;", "getSilentActionsTaken", "getMicrogramState", "()Lmicrogram/android/MicrogramState;", "getMarketBuysEnabled", "getSubzeroM2Enabled", "getHasSalesTaxes", "getUseSduiAccountSwitcher", "accountNumber", "getAccountNumber", "amountCharArray", "getAmountCharArray", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "equityOrderContext", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "getEquityOrderContext", "()Lcom/robinhood/android/equity/validation/EquityOrderContext;", "isReviewButtonLoading", "formState", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "getFormState", "()Lcom/robinhood/android/lib/trade/DefaultOrderState;", "reviewing", "getReviewing", "orderSubmittedEvent", "Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", "getOrderSubmittedEvent", "()Lcom/robinhood/android/equity/validation/event/EquityOrderEvent$Dollar;", "convertToSharesEvent", "getConvertToSharesEvent", "getConvertToSharesAmountEvent", "shareAmount", "Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "copy", "equals", "other", "hashCode", "", "toString", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class EquityDollarOrderDataState {
    public static final int $stable = 8;
    private final Account account;
    private final List<Account> allAccounts;
    private final ApiQuickTradeAmounts apiQuickTradeAmounts;
    private final List<String> checkOverrides;
    private final DollarBased configuration;
    private final List<KaizenExperiment> experiments;
    private final DefaultOrderState formState;
    private final boolean hasSalesTaxes;
    private final Instrument instrument;
    private final InstrumentAccountSwitcher instrumentAccountSwitcher;
    private final InstrumentBuyingPower instrumentBuyingPower;
    private final boolean isBackupWithheld;
    private final boolean isCancelPendingCryptoOrdersLoading;
    private final boolean isReviewButtonLoading;
    private final boolean loadingAccountSwitcher;
    private final boolean loadingNbbo;
    private final boolean marketBuysEnabled;
    private final String microgramOrderSummary;
    private final Monitoring microgramState;
    private final boolean mlpExperimentMember;
    private final NbboSummary nbboSummary;
    private final char[] overrideCharArray;
    private final boolean overrideFlipIpoAccessShares;
    private final OrderMarketHours overrideMarketHours;
    private final boolean overrideToExecuteInMarketHoursOnly;
    private final Position position;
    private final OrderRequest2 quantityOrAmount;
    private final Quote quote;
    private final boolean reviewing;
    private final GenericAlertContent<GenericAction> sessionChangeAlertContent;
    private final List<GenericOrderCheckAction> silentActionsTaken;
    private final EquityOrderRequestInputs.StaticInputs staticInputs;
    private final boolean subzeroM2Enabled;
    private final TradingSession tradingSession;
    private final boolean useSduiAccountSwitcher;
    private final ValidationState validationState;
    private final WithholdingStatus withholdingStatus;

    /* compiled from: EquityDollarOrderDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EquityOrderSide.values().length];
            try {
                iArr[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ EquityDollarOrderDataState copy$default(EquityDollarOrderDataState equityDollarOrderDataState, DollarBased dollarBased, OrderRequest2 orderRequest2, char[] cArr, ValidationState validationState, boolean z, ApiQuickTradeAmounts apiQuickTradeAmounts, InstrumentAccountSwitcher instrumentAccountSwitcher, List list, boolean z2, Account account, Instrument instrument, InstrumentBuyingPower instrumentBuyingPower, TradingSession tradingSession, Position position, Quote quote, NbboSummary nbboSummary, List list2, boolean z3, OrderMarketHours orderMarketHours, boolean z4, List list3, boolean z5, EquityOrderRequestInputs.StaticInputs staticInputs, boolean z6, boolean z7, WithholdingStatus withholdingStatus, GenericAlertContent genericAlertContent, String str, List list4, Monitoring monitoring, boolean z8, boolean z9, boolean z10, boolean z11, int i, int i2, Object obj) {
        boolean z12;
        boolean z13;
        boolean z14;
        OrderMarketHours orderMarketHours2;
        boolean z15;
        List list5;
        boolean z16;
        EquityOrderRequestInputs.StaticInputs staticInputs2;
        boolean z17;
        boolean z18;
        WithholdingStatus withholdingStatus2;
        GenericAlertContent genericAlertContent2;
        String str2;
        List list6;
        Monitoring monitoring2;
        boolean z19;
        boolean z20;
        Quote quote2;
        char[] cArr2;
        ValidationState validationState2;
        boolean z21;
        ApiQuickTradeAmounts apiQuickTradeAmounts2;
        InstrumentAccountSwitcher instrumentAccountSwitcher2;
        List list7;
        boolean z22;
        Account account2;
        Instrument instrument2;
        InstrumentBuyingPower instrumentBuyingPower2;
        TradingSession tradingSession2;
        Position position2;
        NbboSummary nbboSummary2;
        List list8;
        OrderRequest2 orderRequest22;
        DollarBased dollarBased2 = (i & 1) != 0 ? equityDollarOrderDataState.configuration : dollarBased;
        OrderRequest2 orderRequest23 = (i & 2) != 0 ? equityDollarOrderDataState.quantityOrAmount : orderRequest2;
        char[] cArr3 = (i & 4) != 0 ? equityDollarOrderDataState.overrideCharArray : cArr;
        ValidationState validationState3 = (i & 8) != 0 ? equityDollarOrderDataState.validationState : validationState;
        boolean z23 = (i & 16) != 0 ? equityDollarOrderDataState.loadingNbbo : z;
        ApiQuickTradeAmounts apiQuickTradeAmounts3 = (i & 32) != 0 ? equityDollarOrderDataState.apiQuickTradeAmounts : apiQuickTradeAmounts;
        InstrumentAccountSwitcher instrumentAccountSwitcher3 = (i & 64) != 0 ? equityDollarOrderDataState.instrumentAccountSwitcher : instrumentAccountSwitcher;
        List list9 = (i & 128) != 0 ? equityDollarOrderDataState.allAccounts : list;
        boolean z24 = (i & 256) != 0 ? equityDollarOrderDataState.loadingAccountSwitcher : z2;
        Account account3 = (i & 512) != 0 ? equityDollarOrderDataState.account : account;
        Instrument instrument3 = (i & 1024) != 0 ? equityDollarOrderDataState.instrument : instrument;
        InstrumentBuyingPower instrumentBuyingPower3 = (i & 2048) != 0 ? equityDollarOrderDataState.instrumentBuyingPower : instrumentBuyingPower;
        TradingSession tradingSession3 = (i & 4096) != 0 ? equityDollarOrderDataState.tradingSession : tradingSession;
        Position position3 = (i & 8192) != 0 ? equityDollarOrderDataState.position : position;
        DollarBased dollarBased3 = dollarBased2;
        Quote quote3 = (i & 16384) != 0 ? equityDollarOrderDataState.quote : quote;
        NbboSummary nbboSummary3 = (i & 32768) != 0 ? equityDollarOrderDataState.nbboSummary : nbboSummary;
        List list10 = (i & 65536) != 0 ? equityDollarOrderDataState.experiments : list2;
        boolean z25 = (i & 131072) != 0 ? equityDollarOrderDataState.overrideToExecuteInMarketHoursOnly : z3;
        OrderMarketHours orderMarketHours3 = (i & 262144) != 0 ? equityDollarOrderDataState.overrideMarketHours : orderMarketHours;
        boolean z26 = (i & 524288) != 0 ? equityDollarOrderDataState.overrideFlipIpoAccessShares : z4;
        List list11 = (i & 1048576) != 0 ? equityDollarOrderDataState.checkOverrides : list3;
        boolean z27 = (i & 2097152) != 0 ? equityDollarOrderDataState.isCancelPendingCryptoOrdersLoading : z5;
        EquityOrderRequestInputs.StaticInputs staticInputs3 = (i & 4194304) != 0 ? equityDollarOrderDataState.staticInputs : staticInputs;
        boolean z28 = (i & 8388608) != 0 ? equityDollarOrderDataState.isBackupWithheld : z6;
        boolean z29 = (i & 16777216) != 0 ? equityDollarOrderDataState.mlpExperimentMember : z7;
        WithholdingStatus withholdingStatus3 = (i & 33554432) != 0 ? equityDollarOrderDataState.withholdingStatus : withholdingStatus;
        GenericAlertContent genericAlertContent3 = (i & 67108864) != 0 ? equityDollarOrderDataState.sessionChangeAlertContent : genericAlertContent;
        String str3 = (i & 134217728) != 0 ? equityDollarOrderDataState.microgramOrderSummary : str;
        List list12 = (i & 268435456) != 0 ? equityDollarOrderDataState.silentActionsTaken : list4;
        Monitoring monitoring3 = (i & 536870912) != 0 ? equityDollarOrderDataState.microgramState : monitoring;
        boolean z30 = (i & 1073741824) != 0 ? equityDollarOrderDataState.marketBuysEnabled : z8;
        boolean z31 = (i & Integer.MIN_VALUE) != 0 ? equityDollarOrderDataState.subzeroM2Enabled : z9;
        boolean z32 = (i2 & 1) != 0 ? equityDollarOrderDataState.hasSalesTaxes : z10;
        if ((i2 & 2) != 0) {
            z13 = z32;
            z12 = equityDollarOrderDataState.useSduiAccountSwitcher;
            orderMarketHours2 = orderMarketHours3;
            z15 = z26;
            list5 = list11;
            z16 = z27;
            staticInputs2 = staticInputs3;
            z17 = z28;
            z18 = z29;
            withholdingStatus2 = withholdingStatus3;
            genericAlertContent2 = genericAlertContent3;
            str2 = str3;
            list6 = list12;
            monitoring2 = monitoring3;
            z19 = z30;
            z20 = z31;
            quote2 = quote3;
            validationState2 = validationState3;
            z21 = z23;
            apiQuickTradeAmounts2 = apiQuickTradeAmounts3;
            instrumentAccountSwitcher2 = instrumentAccountSwitcher3;
            list7 = list9;
            z22 = z24;
            account2 = account3;
            instrument2 = instrument3;
            instrumentBuyingPower2 = instrumentBuyingPower3;
            tradingSession2 = tradingSession3;
            position2 = position3;
            nbboSummary2 = nbboSummary3;
            list8 = list10;
            z14 = z25;
            orderRequest22 = orderRequest23;
            cArr2 = cArr3;
        } else {
            z12 = z11;
            z13 = z32;
            z14 = z25;
            orderMarketHours2 = orderMarketHours3;
            z15 = z26;
            list5 = list11;
            z16 = z27;
            staticInputs2 = staticInputs3;
            z17 = z28;
            z18 = z29;
            withholdingStatus2 = withholdingStatus3;
            genericAlertContent2 = genericAlertContent3;
            str2 = str3;
            list6 = list12;
            monitoring2 = monitoring3;
            z19 = z30;
            z20 = z31;
            quote2 = quote3;
            cArr2 = cArr3;
            validationState2 = validationState3;
            z21 = z23;
            apiQuickTradeAmounts2 = apiQuickTradeAmounts3;
            instrumentAccountSwitcher2 = instrumentAccountSwitcher3;
            list7 = list9;
            z22 = z24;
            account2 = account3;
            instrument2 = instrument3;
            instrumentBuyingPower2 = instrumentBuyingPower3;
            tradingSession2 = tradingSession3;
            position2 = position3;
            nbboSummary2 = nbboSummary3;
            list8 = list10;
            orderRequest22 = orderRequest23;
        }
        return equityDollarOrderDataState.copy(dollarBased3, orderRequest22, cArr2, validationState2, z21, apiQuickTradeAmounts2, instrumentAccountSwitcher2, list7, z22, account2, instrument2, instrumentBuyingPower2, tradingSession2, position2, quote2, nbboSummary2, list8, z14, orderMarketHours2, z15, list5, z16, staticInputs2, z17, z18, withholdingStatus2, genericAlertContent2, str2, list6, monitoring2, z19, z20, z13, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final DollarBased getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component10, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component11, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component12, reason: from getter */
    public final InstrumentBuyingPower getInstrumentBuyingPower() {
        return this.instrumentBuyingPower;
    }

    /* renamed from: component13, reason: from getter */
    public final TradingSession getTradingSession() {
        return this.tradingSession;
    }

    /* renamed from: component14, reason: from getter */
    public final Position getPosition() {
        return this.position;
    }

    /* renamed from: component15, reason: from getter */
    public final Quote getQuote() {
        return this.quote;
    }

    /* renamed from: component16, reason: from getter */
    public final NbboSummary getNbboSummary() {
        return this.nbboSummary;
    }

    public final List<KaizenExperiment> component17() {
        return this.experiments;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getOverrideToExecuteInMarketHoursOnly() {
        return this.overrideToExecuteInMarketHoursOnly;
    }

    /* renamed from: component19, reason: from getter */
    public final OrderMarketHours getOverrideMarketHours() {
        return this.overrideMarketHours;
    }

    /* renamed from: component2, reason: from getter */
    public final OrderRequest2 getQuantityOrAmount() {
        return this.quantityOrAmount;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getOverrideFlipIpoAccessShares() {
        return this.overrideFlipIpoAccessShares;
    }

    public final List<String> component21() {
        return this.checkOverrides;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getIsCancelPendingCryptoOrdersLoading() {
        return this.isCancelPendingCryptoOrdersLoading;
    }

    /* renamed from: component23, reason: from getter */
    public final EquityOrderRequestInputs.StaticInputs getStaticInputs() {
        return this.staticInputs;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIsBackupWithheld() {
        return this.isBackupWithheld;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getMlpExperimentMember() {
        return this.mlpExperimentMember;
    }

    /* renamed from: component26, reason: from getter */
    public final WithholdingStatus getWithholdingStatus() {
        return this.withholdingStatus;
    }

    public final GenericAlertContent<GenericAction> component27() {
        return this.sessionChangeAlertContent;
    }

    /* renamed from: component28, reason: from getter */
    public final String getMicrogramOrderSummary() {
        return this.microgramOrderSummary;
    }

    public final List<GenericOrderCheckAction> component29() {
        return this.silentActionsTaken;
    }

    /* renamed from: component3, reason: from getter */
    public final char[] getOverrideCharArray() {
        return this.overrideCharArray;
    }

    /* renamed from: component30, reason: from getter */
    public final Monitoring getMicrogramState() {
        return this.microgramState;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getMarketBuysEnabled() {
        return this.marketBuysEnabled;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getSubzeroM2Enabled() {
        return this.subzeroM2Enabled;
    }

    /* renamed from: component33, reason: from getter */
    public final boolean getHasSalesTaxes() {
        return this.hasSalesTaxes;
    }

    /* renamed from: component34, reason: from getter */
    public final boolean getUseSduiAccountSwitcher() {
        return this.useSduiAccountSwitcher;
    }

    /* renamed from: component4, reason: from getter */
    public final ValidationState getValidationState() {
        return this.validationState;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getLoadingNbbo() {
        return this.loadingNbbo;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiQuickTradeAmounts getApiQuickTradeAmounts() {
        return this.apiQuickTradeAmounts;
    }

    /* renamed from: component7, reason: from getter */
    public final InstrumentAccountSwitcher getInstrumentAccountSwitcher() {
        return this.instrumentAccountSwitcher;
    }

    public final List<Account> component8() {
        return this.allAccounts;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getLoadingAccountSwitcher() {
        return this.loadingAccountSwitcher;
    }

    public final EquityDollarOrderDataState copy(DollarBased configuration, OrderRequest2 quantityOrAmount, char[] overrideCharArray, ValidationState validationState, boolean loadingNbbo, ApiQuickTradeAmounts apiQuickTradeAmounts, InstrumentAccountSwitcher instrumentAccountSwitcher, List<Account> allAccounts, boolean loadingAccountSwitcher, Account account, Instrument instrument, InstrumentBuyingPower instrumentBuyingPower, TradingSession tradingSession, Position position, Quote quote, NbboSummary nbboSummary, List<? extends KaizenExperiment> experiments, boolean overrideToExecuteInMarketHoursOnly, OrderMarketHours overrideMarketHours, boolean overrideFlipIpoAccessShares, List<String> checkOverrides, boolean isCancelPendingCryptoOrdersLoading, EquityOrderRequestInputs.StaticInputs staticInputs, boolean isBackupWithheld, boolean mlpExperimentMember, WithholdingStatus withholdingStatus, GenericAlertContent<? extends GenericAction> sessionChangeAlertContent, String microgramOrderSummary, List<? extends GenericOrderCheckAction> silentActionsTaken, Monitoring microgramState, boolean marketBuysEnabled, boolean subzeroM2Enabled, boolean hasSalesTaxes, boolean useSduiAccountSwitcher) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(quantityOrAmount, "quantityOrAmount");
        Intrinsics.checkNotNullParameter(validationState, "validationState");
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
        Intrinsics.checkNotNullParameter(silentActionsTaken, "silentActionsTaken");
        return new EquityDollarOrderDataState(configuration, quantityOrAmount, overrideCharArray, validationState, loadingNbbo, apiQuickTradeAmounts, instrumentAccountSwitcher, allAccounts, loadingAccountSwitcher, account, instrument, instrumentBuyingPower, tradingSession, position, quote, nbboSummary, experiments, overrideToExecuteInMarketHoursOnly, overrideMarketHours, overrideFlipIpoAccessShares, checkOverrides, isCancelPendingCryptoOrdersLoading, staticInputs, isBackupWithheld, mlpExperimentMember, withholdingStatus, sessionChangeAlertContent, microgramOrderSummary, silentActionsTaken, microgramState, marketBuysEnabled, subzeroM2Enabled, hasSalesTaxes, useSduiAccountSwitcher);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityDollarOrderDataState)) {
            return false;
        }
        EquityDollarOrderDataState equityDollarOrderDataState = (EquityDollarOrderDataState) other;
        return Intrinsics.areEqual(this.configuration, equityDollarOrderDataState.configuration) && Intrinsics.areEqual(this.quantityOrAmount, equityDollarOrderDataState.quantityOrAmount) && Intrinsics.areEqual(this.overrideCharArray, equityDollarOrderDataState.overrideCharArray) && Intrinsics.areEqual(this.validationState, equityDollarOrderDataState.validationState) && this.loadingNbbo == equityDollarOrderDataState.loadingNbbo && Intrinsics.areEqual(this.apiQuickTradeAmounts, equityDollarOrderDataState.apiQuickTradeAmounts) && Intrinsics.areEqual(this.instrumentAccountSwitcher, equityDollarOrderDataState.instrumentAccountSwitcher) && Intrinsics.areEqual(this.allAccounts, equityDollarOrderDataState.allAccounts) && this.loadingAccountSwitcher == equityDollarOrderDataState.loadingAccountSwitcher && Intrinsics.areEqual(this.account, equityDollarOrderDataState.account) && Intrinsics.areEqual(this.instrument, equityDollarOrderDataState.instrument) && Intrinsics.areEqual(this.instrumentBuyingPower, equityDollarOrderDataState.instrumentBuyingPower) && Intrinsics.areEqual(this.tradingSession, equityDollarOrderDataState.tradingSession) && Intrinsics.areEqual(this.position, equityDollarOrderDataState.position) && Intrinsics.areEqual(this.quote, equityDollarOrderDataState.quote) && Intrinsics.areEqual(this.nbboSummary, equityDollarOrderDataState.nbboSummary) && Intrinsics.areEqual(this.experiments, equityDollarOrderDataState.experiments) && this.overrideToExecuteInMarketHoursOnly == equityDollarOrderDataState.overrideToExecuteInMarketHoursOnly && this.overrideMarketHours == equityDollarOrderDataState.overrideMarketHours && this.overrideFlipIpoAccessShares == equityDollarOrderDataState.overrideFlipIpoAccessShares && Intrinsics.areEqual(this.checkOverrides, equityDollarOrderDataState.checkOverrides) && this.isCancelPendingCryptoOrdersLoading == equityDollarOrderDataState.isCancelPendingCryptoOrdersLoading && Intrinsics.areEqual(this.staticInputs, equityDollarOrderDataState.staticInputs) && this.isBackupWithheld == equityDollarOrderDataState.isBackupWithheld && this.mlpExperimentMember == equityDollarOrderDataState.mlpExperimentMember && Intrinsics.areEqual(this.withholdingStatus, equityDollarOrderDataState.withholdingStatus) && Intrinsics.areEqual(this.sessionChangeAlertContent, equityDollarOrderDataState.sessionChangeAlertContent) && Intrinsics.areEqual(this.microgramOrderSummary, equityDollarOrderDataState.microgramOrderSummary) && Intrinsics.areEqual(this.silentActionsTaken, equityDollarOrderDataState.silentActionsTaken) && Intrinsics.areEqual(this.microgramState, equityDollarOrderDataState.microgramState) && this.marketBuysEnabled == equityDollarOrderDataState.marketBuysEnabled && this.subzeroM2Enabled == equityDollarOrderDataState.subzeroM2Enabled && this.hasSalesTaxes == equityDollarOrderDataState.hasSalesTaxes && this.useSduiAccountSwitcher == equityDollarOrderDataState.useSduiAccountSwitcher;
    }

    public int hashCode() {
        int iHashCode = ((this.configuration.hashCode() * 31) + this.quantityOrAmount.hashCode()) * 31;
        char[] cArr = this.overrideCharArray;
        int iHashCode2 = (((((iHashCode + (cArr == null ? 0 : Arrays.hashCode(cArr))) * 31) + this.validationState.hashCode()) * 31) + Boolean.hashCode(this.loadingNbbo)) * 31;
        ApiQuickTradeAmounts apiQuickTradeAmounts = this.apiQuickTradeAmounts;
        int iHashCode3 = (iHashCode2 + (apiQuickTradeAmounts == null ? 0 : apiQuickTradeAmounts.hashCode())) * 31;
        InstrumentAccountSwitcher instrumentAccountSwitcher = this.instrumentAccountSwitcher;
        int iHashCode4 = (((((iHashCode3 + (instrumentAccountSwitcher == null ? 0 : instrumentAccountSwitcher.hashCode())) * 31) + this.allAccounts.hashCode()) * 31) + Boolean.hashCode(this.loadingAccountSwitcher)) * 31;
        Account account = this.account;
        int iHashCode5 = (iHashCode4 + (account == null ? 0 : account.hashCode())) * 31;
        Instrument instrument = this.instrument;
        int iHashCode6 = (iHashCode5 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        InstrumentBuyingPower instrumentBuyingPower = this.instrumentBuyingPower;
        int iHashCode7 = (iHashCode6 + (instrumentBuyingPower == null ? 0 : instrumentBuyingPower.hashCode())) * 31;
        TradingSession tradingSession = this.tradingSession;
        int iHashCode8 = (iHashCode7 + (tradingSession == null ? 0 : tradingSession.hashCode())) * 31;
        Position position = this.position;
        int iHashCode9 = (iHashCode8 + (position == null ? 0 : position.hashCode())) * 31;
        Quote quote = this.quote;
        int iHashCode10 = (iHashCode9 + (quote == null ? 0 : quote.hashCode())) * 31;
        NbboSummary nbboSummary = this.nbboSummary;
        int iHashCode11 = (((((iHashCode10 + (nbboSummary == null ? 0 : nbboSummary.hashCode())) * 31) + this.experiments.hashCode()) * 31) + Boolean.hashCode(this.overrideToExecuteInMarketHoursOnly)) * 31;
        OrderMarketHours orderMarketHours = this.overrideMarketHours;
        int iHashCode12 = (((((((iHashCode11 + (orderMarketHours == null ? 0 : orderMarketHours.hashCode())) * 31) + Boolean.hashCode(this.overrideFlipIpoAccessShares)) * 31) + this.checkOverrides.hashCode()) * 31) + Boolean.hashCode(this.isCancelPendingCryptoOrdersLoading)) * 31;
        EquityOrderRequestInputs.StaticInputs staticInputs = this.staticInputs;
        int iHashCode13 = (((((iHashCode12 + (staticInputs == null ? 0 : staticInputs.hashCode())) * 31) + Boolean.hashCode(this.isBackupWithheld)) * 31) + Boolean.hashCode(this.mlpExperimentMember)) * 31;
        WithholdingStatus withholdingStatus = this.withholdingStatus;
        int iHashCode14 = (iHashCode13 + (withholdingStatus == null ? 0 : withholdingStatus.hashCode())) * 31;
        GenericAlertContent<GenericAction> genericAlertContent = this.sessionChangeAlertContent;
        int iHashCode15 = (iHashCode14 + (genericAlertContent == null ? 0 : genericAlertContent.hashCode())) * 31;
        String str = this.microgramOrderSummary;
        int iHashCode16 = (((iHashCode15 + (str == null ? 0 : str.hashCode())) * 31) + this.silentActionsTaken.hashCode()) * 31;
        Monitoring monitoring = this.microgramState;
        return ((((((((iHashCode16 + (monitoring != null ? monitoring.hashCode() : 0)) * 31) + Boolean.hashCode(this.marketBuysEnabled)) * 31) + Boolean.hashCode(this.subzeroM2Enabled)) * 31) + Boolean.hashCode(this.hasSalesTaxes)) * 31) + Boolean.hashCode(this.useSduiAccountSwitcher);
    }

    public String toString() {
        return "EquityDollarOrderDataState(configuration=" + this.configuration + ", quantityOrAmount=" + this.quantityOrAmount + ", overrideCharArray=" + Arrays.toString(this.overrideCharArray) + ", validationState=" + this.validationState + ", loadingNbbo=" + this.loadingNbbo + ", apiQuickTradeAmounts=" + this.apiQuickTradeAmounts + ", instrumentAccountSwitcher=" + this.instrumentAccountSwitcher + ", allAccounts=" + this.allAccounts + ", loadingAccountSwitcher=" + this.loadingAccountSwitcher + ", account=" + this.account + ", instrument=" + this.instrument + ", instrumentBuyingPower=" + this.instrumentBuyingPower + ", tradingSession=" + this.tradingSession + ", position=" + this.position + ", quote=" + this.quote + ", nbboSummary=" + this.nbboSummary + ", experiments=" + this.experiments + ", overrideToExecuteInMarketHoursOnly=" + this.overrideToExecuteInMarketHoursOnly + ", overrideMarketHours=" + this.overrideMarketHours + ", overrideFlipIpoAccessShares=" + this.overrideFlipIpoAccessShares + ", checkOverrides=" + this.checkOverrides + ", isCancelPendingCryptoOrdersLoading=" + this.isCancelPendingCryptoOrdersLoading + ", staticInputs=" + this.staticInputs + ", isBackupWithheld=" + this.isBackupWithheld + ", mlpExperimentMember=" + this.mlpExperimentMember + ", withholdingStatus=" + this.withholdingStatus + ", sessionChangeAlertContent=" + this.sessionChangeAlertContent + ", microgramOrderSummary=" + this.microgramOrderSummary + ", silentActionsTaken=" + this.silentActionsTaken + ", microgramState=" + this.microgramState + ", marketBuysEnabled=" + this.marketBuysEnabled + ", subzeroM2Enabled=" + this.subzeroM2Enabled + ", hasSalesTaxes=" + this.hasSalesTaxes + ", useSduiAccountSwitcher=" + this.useSduiAccountSwitcher + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EquityDollarOrderDataState(DollarBased configuration, OrderRequest2 quantityOrAmount, char[] cArr, ValidationState validationState, boolean z, ApiQuickTradeAmounts apiQuickTradeAmounts, InstrumentAccountSwitcher instrumentAccountSwitcher, List<Account> allAccounts, boolean z2, Account account, Instrument instrument, InstrumentBuyingPower instrumentBuyingPower, TradingSession tradingSession, Position position, Quote quote, NbboSummary nbboSummary, List<? extends KaizenExperiment> experiments, boolean z3, OrderMarketHours orderMarketHours, boolean z4, List<String> checkOverrides, boolean z5, EquityOrderRequestInputs.StaticInputs staticInputs, boolean z6, boolean z7, WithholdingStatus withholdingStatus, GenericAlertContent<? extends GenericAction> genericAlertContent, String str, List<? extends GenericOrderCheckAction> silentActionsTaken, Monitoring monitoring, boolean z8, boolean z9, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(quantityOrAmount, "quantityOrAmount");
        Intrinsics.checkNotNullParameter(validationState, "validationState");
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
        Intrinsics.checkNotNullParameter(silentActionsTaken, "silentActionsTaken");
        this.configuration = configuration;
        this.quantityOrAmount = quantityOrAmount;
        this.overrideCharArray = cArr;
        this.validationState = validationState;
        this.loadingNbbo = z;
        this.apiQuickTradeAmounts = apiQuickTradeAmounts;
        this.instrumentAccountSwitcher = instrumentAccountSwitcher;
        this.allAccounts = allAccounts;
        this.loadingAccountSwitcher = z2;
        this.account = account;
        this.instrument = instrument;
        this.instrumentBuyingPower = instrumentBuyingPower;
        this.tradingSession = tradingSession;
        this.position = position;
        this.quote = quote;
        this.nbboSummary = nbboSummary;
        this.experiments = experiments;
        this.overrideToExecuteInMarketHoursOnly = z3;
        this.overrideMarketHours = orderMarketHours;
        this.overrideFlipIpoAccessShares = z4;
        this.checkOverrides = checkOverrides;
        this.isCancelPendingCryptoOrdersLoading = z5;
        this.staticInputs = staticInputs;
        this.isBackupWithheld = z6;
        this.mlpExperimentMember = z7;
        this.withholdingStatus = withholdingStatus;
        this.sessionChangeAlertContent = genericAlertContent;
        this.microgramOrderSummary = str;
        this.silentActionsTaken = silentActionsTaken;
        this.microgramState = monitoring;
        this.marketBuysEnabled = z8;
        this.subzeroM2Enabled = z9;
        this.hasSalesTaxes = z10;
        this.useSduiAccountSwitcher = z11;
        this.isReviewButtonLoading = validationState instanceof ValidationState.Validating;
        DefaultOrderState defaultOrderState = validationState instanceof ValidationState.Validated ? DefaultOrderState.REVIEWING : DefaultOrderState.EDITING;
        this.formState = defaultOrderState;
        this.reviewing = defaultOrderState.getIsReviewingState();
    }

    public final DollarBased getConfiguration() {
        return this.configuration;
    }

    public final OrderRequest2 getQuantityOrAmount() {
        return this.quantityOrAmount;
    }

    public final char[] getOverrideCharArray() {
        return this.overrideCharArray;
    }

    public /* synthetic */ EquityDollarOrderDataState(DollarBased dollarBased, OrderRequest2 orderRequest2, char[] cArr, ValidationState validationState, boolean z, ApiQuickTradeAmounts apiQuickTradeAmounts, InstrumentAccountSwitcher instrumentAccountSwitcher, List list, boolean z2, Account account, Instrument instrument, InstrumentBuyingPower instrumentBuyingPower, TradingSession tradingSession, Position position, Quote quote, NbboSummary nbboSummary, List list2, boolean z3, OrderMarketHours orderMarketHours, boolean z4, List list3, boolean z5, EquityOrderRequestInputs.StaticInputs staticInputs, boolean z6, boolean z7, WithholdingStatus withholdingStatus, GenericAlertContent genericAlertContent, String str, List list4, Monitoring monitoring, boolean z8, boolean z9, boolean z10, boolean z11, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dollarBased, orderRequest2, (i & 4) != 0 ? null : cArr, (i & 8) != 0 ? ValidationState.Initial.INSTANCE : validationState, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : apiQuickTradeAmounts, (i & 64) != 0 ? null : instrumentAccountSwitcher, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : account, (i & 1024) != 0 ? null : instrument, (i & 2048) != 0 ? null : instrumentBuyingPower, (i & 4096) != 0 ? null : tradingSession, (i & 8192) != 0 ? null : position, (i & 16384) != 0 ? null : quote, (i & 32768) != 0 ? null : nbboSummary, (i & 65536) != 0 ? CollectionsKt.emptyList() : list2, (i & 131072) != 0 ? false : z3, (i & 262144) != 0 ? null : orderMarketHours, (i & 524288) != 0 ? false : z4, (i & 1048576) != 0 ? CollectionsKt.emptyList() : list3, (i & 2097152) != 0 ? false : z5, (i & 4194304) != 0 ? null : staticInputs, (i & 8388608) != 0 ? false : z6, (i & 16777216) != 0 ? false : z7, (i & 33554432) != 0 ? null : withholdingStatus, (i & 67108864) != 0 ? null : genericAlertContent, (i & 134217728) != 0 ? null : str, (i & 268435456) != 0 ? CollectionsKt.emptyList() : list4, (i & 536870912) == 0 ? monitoring : null, (i & 1073741824) != 0 ? false : z8, (i & Integer.MIN_VALUE) != 0 ? false : z9, (i2 & 1) != 0 ? false : z10, (i2 & 2) != 0 ? false : z11);
    }

    public final ValidationState getValidationState() {
        return this.validationState;
    }

    public final boolean getLoadingNbbo() {
        return this.loadingNbbo;
    }

    public final ApiQuickTradeAmounts getApiQuickTradeAmounts() {
        return this.apiQuickTradeAmounts;
    }

    public final InstrumentAccountSwitcher getInstrumentAccountSwitcher() {
        return this.instrumentAccountSwitcher;
    }

    public final List<Account> getAllAccounts() {
        return this.allAccounts;
    }

    public final boolean getLoadingAccountSwitcher() {
        return this.loadingAccountSwitcher;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final InstrumentBuyingPower getInstrumentBuyingPower() {
        return this.instrumentBuyingPower;
    }

    public final TradingSession getTradingSession() {
        return this.tradingSession;
    }

    public final Position getPosition() {
        return this.position;
    }

    public final Quote getQuote() {
        return this.quote;
    }

    public final NbboSummary getNbboSummary() {
        return this.nbboSummary;
    }

    public final List<KaizenExperiment> getExperiments() {
        return this.experiments;
    }

    public final boolean getOverrideToExecuteInMarketHoursOnly() {
        return this.overrideToExecuteInMarketHoursOnly;
    }

    public final OrderMarketHours getOverrideMarketHours() {
        return this.overrideMarketHours;
    }

    public final boolean getOverrideFlipIpoAccessShares() {
        return this.overrideFlipIpoAccessShares;
    }

    public final List<String> getCheckOverrides() {
        return this.checkOverrides;
    }

    public final boolean isCancelPendingCryptoOrdersLoading() {
        return this.isCancelPendingCryptoOrdersLoading;
    }

    public final EquityOrderRequestInputs.StaticInputs getStaticInputs() {
        return this.staticInputs;
    }

    public final boolean isBackupWithheld() {
        return this.isBackupWithheld;
    }

    public final boolean getMlpExperimentMember() {
        return this.mlpExperimentMember;
    }

    public final WithholdingStatus getWithholdingStatus() {
        return this.withholdingStatus;
    }

    public final GenericAlertContent<GenericAction> getSessionChangeAlertContent() {
        return this.sessionChangeAlertContent;
    }

    public final String getMicrogramOrderSummary() {
        return this.microgramOrderSummary;
    }

    public final List<GenericOrderCheckAction> getSilentActionsTaken() {
        return this.silentActionsTaken;
    }

    public final Monitoring getMicrogramState() {
        return this.microgramState;
    }

    public final boolean getMarketBuysEnabled() {
        return this.marketBuysEnabled;
    }

    public final boolean getSubzeroM2Enabled() {
        return this.subzeroM2Enabled;
    }

    public final boolean getHasSalesTaxes() {
        return this.hasSalesTaxes;
    }

    public final boolean getUseSduiAccountSwitcher() {
        return this.useSduiAccountSwitcher;
    }

    public final String getAccountNumber() {
        Account account = this.account;
        if (account != null) {
            return account.getAccountNumber();
        }
        return null;
    }

    public final char[] getAmountCharArray() {
        BigDecimal decimalValue;
        NumberFormatter amountFormat;
        char[] cArr = this.overrideCharArray;
        if (cArr != null) {
            BigDecimal number = CharArrays.toNumber(cArr);
            if (!this.reviewing || number == null) {
                return cArr;
            }
            if (BigDecimals7.isInteger(number)) {
                amountFormat = Formats.getWholeNumberAmountFormat();
            } else {
                amountFormat = Formats.getAmountFormat();
            }
            char[] charArray = amountFormat.format(number).toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            return charArray;
        }
        OrderRequest2 orderRequest2 = this.quantityOrAmount;
        if (orderRequest2 instanceof OrderRequest2.DollarAmount) {
            decimalValue = ((OrderRequest2.DollarAmount) orderRequest2).getValue().getDecimalValue();
        } else {
            if (!(orderRequest2 instanceof OrderRequest2.ShareQuantity)) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal value = ((OrderRequest2.ShareQuantity) orderRequest2).getValue();
            Quote quote = this.quote;
            decimalValue = BigDecimals4.toDollarAmount(value, quote != null ? quote.getLastTradePrice() : null).getDecimalValue();
        }
        if (BigDecimals7.isInteger(decimalValue)) {
            char[] charArray2 = Formats.getWholeNumberAmountFormat().format(decimalValue).toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
            return charArray2;
        }
        char[] charArray3 = Formats.getAmountFormat().format(decimalValue).toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray3, "toCharArray(...)");
        return charArray3;
    }

    public final EquityOrderSide getSide() {
        EquityOrderRequestInputs.StaticInputs staticInputs = this.staticInputs;
        if (staticInputs != null) {
            return staticInputs.getSide();
        }
        return null;
    }

    public final EquityOrderContext getEquityOrderContext() {
        Account account;
        Instrument instrument;
        TradingSession tradingSession;
        InstrumentBuyingPower instrumentBuyingPower;
        OrderPositionEffect orderPositionEffect;
        OrderTrailingPeg trailingPeg;
        OrderTrailingPeg trailingPeg2;
        Money price;
        if (getSide() == null || (account = this.account) == null || (instrument = this.instrument) == null || (tradingSession = this.tradingSession) == null || this.staticInputs == null || (instrumentBuyingPower = this.instrumentBuyingPower) == null) {
            return null;
        }
        EquityOrderContextFactory equityOrderContextFactory = EquityOrderContextFactory.INSTANCE;
        Position position = this.position;
        Quote quote = this.quote;
        EquityOrderRequestInputs.StaticInputs staticInputs = this.staticInputs;
        String accountNumber = this.account.getAccountNumber();
        DollarBased dollarBased = this.configuration;
        DirectOrder3 directOrder3 = dollarBased instanceof DirectOrder3 ? (DirectOrder3) dollarBased : null;
        BigDecimal limitPrice = directOrder3 != null ? directOrder3.getLimitPrice() : null;
        boolean z = this.overrideFlipIpoAccessShares;
        boolean z2 = this.overrideToExecuteInMarketHoursOnly;
        OrderMarketHours orderMarketHours = this.overrideMarketHours;
        List<String> list = this.checkOverrides;
        OrderRequest2 orderRequest2 = this.quantityOrAmount;
        DollarBased dollarBased2 = this.configuration;
        DirectOrder8 directOrder8 = dollarBased2 instanceof DirectOrder8 ? (DirectOrder8) dollarBased2 : null;
        BigDecimal stopPrice = directOrder8 != null ? directOrder8.getStopPrice() : null;
        DollarBased dollarBased3 = this.configuration;
        DirectOrder9 directOrder9 = dollarBased3 instanceof DirectOrder9 ? (DirectOrder9) dollarBased3 : null;
        BigDecimal decimalValue = (directOrder9 == null || (trailingPeg2 = directOrder9.getTrailingPeg()) == null || (price = trailingPeg2.getPrice()) == null) ? null : price.getDecimalValue();
        DollarBased dollarBased4 = this.configuration;
        DirectOrder9 directOrder92 = dollarBased4 instanceof DirectOrder9 ? (DirectOrder9) dollarBased4 : null;
        Integer percentage = (directOrder92 == null || (trailingPeg = directOrder92.getTrailingPeg()) == null) ? null : trailingPeg.getPercentage();
        DollarBased dollarBased5 = this.configuration;
        DirectOrder5 directOrder5 = dollarBased5 instanceof DirectOrder5 ? (DirectOrder5) dollarBased5 : null;
        BigDecimal presetPercentLimit = directOrder5 != null ? directOrder5.getPresetPercentLimit() : null;
        OrderTimeInForce timeInForce = this.configuration.getTimeInForce();
        if (timeInForce == null) {
            timeInForce = OrderTimeInForce.GFD;
        }
        OrderTimeInForce orderTimeInForce = timeInForce;
        Order.Configuration orderConfiguration = this.configuration.getOrderConfiguration();
        boolean z3 = this.marketBuysEnabled;
        List listEmptyList = CollectionsKt.emptyList();
        EquityOrderSide side = getSide();
        int i = side == null ? -1 : WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i != -1) {
            if (i == 1) {
                orderPositionEffect = OrderPositionEffect.OPEN;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("dollar orders are not supported for shorting");
                }
                orderPositionEffect = OrderPositionEffect.CLOSE;
            }
            return equityOrderContextFactory.create(account, instrument, tradingSession, position, quote, new EquityOrderRequestInputs(staticInputs, accountNumber, null, limitPrice, z, z2, orderMarketHours, list, orderRequest2, stopPrice, decimalValue, percentage, presetPercentLimit, orderTimeInForce, orderConfiguration, null, null, null, z3, null, listEmptyList, orderPositionEffect, this.subzeroM2Enabled), (64 & 64) != 0 ? Instant.now() : null, instrumentBuyingPower, null);
        }
        throw new IllegalStateException("side cannot be null");
    }

    /* renamed from: isReviewButtonLoading, reason: from getter */
    public final boolean getIsReviewButtonLoading() {
        return this.isReviewButtonLoading;
    }

    public final DefaultOrderState getFormState() {
        return this.formState;
    }

    public final boolean getReviewing() {
        return this.reviewing;
    }

    public final EquityOrderEvent.Dollar getOrderSubmittedEvent() {
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        if (equityOrderContext != null) {
            return new EquityOrderEvent.Dollar.OrderSubmittedEvent(equityOrderContext);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EquityOrderEvent.Dollar getConvertToSharesEvent() {
        String accountNumber = getAccountNumber();
        BigDecimal bigDecimal = null;
        Object[] objArr = 0;
        if (accountNumber == null) {
            return null;
        }
        return new EquityOrderEvent.Dollar.ConvertToSharesEvent(new ShareBasic(accountNumber, bigDecimal, 2, objArr == true ? 1 : 0));
    }

    public final EquityOrderEvent.Dollar getConvertToSharesAmountEvent(BigDecimal shareAmount) {
        Intrinsics.checkNotNullParameter(shareAmount, "shareAmount");
        String accountNumber = getAccountNumber();
        if (accountNumber == null) {
            return null;
        }
        return new EquityOrderEvent.Dollar.ConvertToSharesAmountEvent(new ShareBasic(accountNumber, shareAmount));
    }
}
