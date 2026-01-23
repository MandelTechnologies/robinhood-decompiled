package com.robinhood.android.trade.equity.p261ui.share;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.equities.taxlots.taxlotsmodelsapi.TaxLotSelectionType;
import com.robinhood.android.equities.taxlots.utils.TaxLotsStringsHelper;
import com.robinhood.android.equities.tradesettings.utils.CheckAdtTradability;
import com.robinhood.android.equity.ordercheck.ValidationState;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.equityadvancedorder.utils.InstrumentAccountSwitcherUtils;
import com.robinhood.android.equityadvancedorder.utils.OrderCreateDescriptionTextUtil;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.configuration.DirectOrder8;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration3;
import com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration;
import com.robinhood.android.trading.contracts.configuration.ShareLimit;
import com.robinhood.android.trading.contracts.configuration.ShareMarket;
import com.robinhood.android.trading.contracts.configuration.ShareSimpleLimit;
import com.robinhood.models.api.ApiCollateral;
import com.robinhood.models.api.ApiEstimatedFees;
import com.robinhood.models.api.ApiFeeItem;
import com.robinhood.models.api.OrderRequest2;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.bonfire.WithholdingEstimatedAmount;
import com.robinhood.models.p320db.bonfire.WithholdingStatus;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.p347db.GenericOrderCheckAction;
import com.robinhood.models.util.Money;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.rosetta.common.Money;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import microgram.android.Monitoring;

/* compiled from: EquityShareOrderDataState.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bM\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bW\b\u0087\b\u0018\u0000  \u00022\u00020\u0001:\u0002 \u0002Bµ\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\u0011\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010-\u001a\u00020.\u0012\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100\u0012\b\b\u0002\u00102\u001a\u00020\u0011\u0012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u0002040\u000e\u0012\b\b\u0002\u00105\u001a\u00020\u0011\u0012\b\b\u0002\u00106\u001a\u00020\u0011\u0012\b\b\u0002\u00107\u001a\u00020\u0011\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u000e\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=\u0012\u0006\u0010>\u001a\u00020?\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A\u0012\u000e\b\u0002\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u000e\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G\u0012\b\b\u0002\u0010I\u001a\u00020\u0011\u0012\b\b\u0002\u0010J\u001a\u00020\u0011\u0012\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020L\u0018\u000100\u0012\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010N\u001a\u00020O\u0012\b\b\u0002\u0010P\u001a\u00020\u0011¢\u0006\u0004\bQ\u0010RJ\n\u0010ê\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ë\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010ì\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0012\u0010í\u0001\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\f\u0010î\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010ï\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\n\u0010ð\u0001\u001a\u00020\u0011HÆ\u0003J\f\u0010ñ\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010ò\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\f\u0010ó\u0001\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\f\u0010ô\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\f\u0010õ\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u0010\u0010ö\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000eHÆ\u0003J\n\u0010÷\u0001\u001a\u00020\u0011HÆ\u0003J\f\u0010ø\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\n\u0010ù\u0001\u001a\u00020\u0011HÆ\u0003J\f\u0010ú\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003J\f\u0010û\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\f\u0010ü\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\f\u0010ý\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\u0011\u0010þ\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010vJ\f\u0010ÿ\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\f\u0010\u0080\u0002\u001a\u0004\u0018\u00010,HÆ\u0003J\n\u0010\u0081\u0002\u001a\u00020.HÆ\u0003J\u0018\u0010\u0082\u0002\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100HÆ\u0003¢\u0006\u0003\b\u0083\u0002J\n\u0010\u0084\u0002\u001a\u00020\u0011HÆ\u0003J\u0010\u0010\u0085\u0002\u001a\b\u0012\u0004\u0012\u0002040\u000eHÆ\u0003J\n\u0010\u0086\u0002\u001a\u00020\u0011HÆ\u0003J\n\u0010\u0087\u0002\u001a\u00020\u0011HÆ\u0003J\n\u0010\u0088\u0002\u001a\u00020\u0011HÆ\u0003J\u0011\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010vJ\u0010\u0010\u008a\u0002\u001a\b\u0012\u0004\u0012\u00020:0\u000eHÆ\u0003J\f\u0010\u008b\u0002\u001a\u0004\u0018\u000104HÆ\u0003J\f\u0010\u008c\u0002\u001a\u0004\u0018\u00010=HÆ\u0003J\n\u0010\u008d\u0002\u001a\u00020?HÆ\u0003J\f\u0010\u008e\u0002\u001a\u0004\u0018\u00010AHÆ\u0003J\u0010\u0010\u008f\u0002\u001a\b\u0012\u0004\u0012\u00020C0\u000eHÆ\u0003J\f\u0010\u0090\u0002\u001a\u0004\u0018\u00010EHÆ\u0003J\f\u0010\u0091\u0002\u001a\u0004\u0018\u00010GHÆ\u0003J\f\u0010\u0092\u0002\u001a\u0004\u0018\u00010GHÆ\u0003J\n\u0010\u0093\u0002\u001a\u00020\u0011HÆ\u0003J\n\u0010\u0094\u0002\u001a\u00020\u0011HÆ\u0003J\u0018\u0010\u0095\u0002\u001a\n\u0012\u0004\u0012\u00020L\u0018\u000100HÆ\u0003¢\u0006\u0003\b\u0096\u0002J\u0010\u0010\u0097\u0002\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\n\u0010\u0098\u0002\u001a\u00020OHÆ\u0003J\n\u0010\u0099\u0002\u001a\u00020\u0011HÆ\u0003JÄ\u0004\u0010\u009a\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00112\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010-\u001a\u00020.2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001002\b\b\u0002\u00102\u001a\u00020\u00112\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u0002040\u000e2\b\b\u0002\u00105\u001a\u00020\u00112\b\b\u0002\u00106\u001a\u00020\u00112\b\b\u0002\u00107\u001a\u00020\u00112\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u000e2\n\b\u0002\u0010;\u001a\u0004\u0018\u0001042\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\b\b\u0002\u0010>\u001a\u00020?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\u000e\b\u0002\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G2\b\b\u0002\u0010I\u001a\u00020\u00112\b\b\u0002\u0010J\u001a\u00020\u00112\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020L\u0018\u0001002\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010N\u001a\u00020O2\b\b\u0002\u0010P\u001a\u00020\u0011HÆ\u0001¢\u0006\u0003\u0010\u009b\u0002J\u0015\u0010\u009c\u0002\u001a\u00020\u00112\t\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u009e\u0002\u001a\u00020OHÖ\u0001J\n\u0010\u009f\u0002\u001a\u000204HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e¢\u0006\b\n\u0000\u001a\u0004\bk\u0010^R\u0011\u0010\u001d\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010`R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0011\u0010 \u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bn\u0010`R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bs\u0010tR\u0013\u0010'\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bu\u0010tR\u0015\u0010(\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010w\u001a\u0004\b(\u0010vR\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\bx\u0010yR\u0013\u0010+\u001a\u0004\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\bz\u0010{R\u0011\u0010-\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\b|\u0010}R\u0019\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u007fR\u0012\u00102\u001a\u00020\u0011¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010`R\u0018\u00103\u001a\b\u0012\u0004\u0012\u0002040\u000e¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010^R\u0011\u00105\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b5\u0010`R\u0012\u00106\u001a\u00020\u0011¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010`R\u0012\u00107\u001a\u00020\u0011¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010`R\u0015\u00108\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010w\u001a\u0004\b8\u0010vR\u0018\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u000e¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010^R\u0015\u0010;\u001a\u0004\u0018\u000104¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0015\u0010<\u001a\u0004\u0018\u00010=¢\u0006\n\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0013\u0010>\u001a\u00020?¢\u0006\n\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0015\u0010@\u001a\u0004\u0018\u00010A¢\u0006\n\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u000e¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010^R\u0015\u0010D\u001a\u0004\u0018\u00010E¢\u0006\n\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0015\u0010F\u001a\u0004\u0018\u00010G¢\u0006\n\n\u0000\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0015\u0010H\u001a\u0004\u0018\u00010G¢\u0006\n\n\u0000\u001a\u0006\b\u0092\u0001\u0010\u0091\u0001R\u0012\u0010I\u001a\u00020\u0011¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010`R\u0012\u0010J\u001a\u00020\u0011¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010`R\u001a\u0010K\u001a\n\u0012\u0004\u0012\u00020L\u0018\u000100¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010\u007fR\u0018\u0010M\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010^R\u0013\u0010N\u001a\u00020O¢\u0006\n\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0012\u0010P\u001a\u00020\u0011¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010`R\u0016\u0010\u009a\u0001\u001a\u0004\u0018\u0001048F¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u0086\u0001R\u001a\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009d\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0017\u0010 \u0001\u001a\u0005\u0018\u00010¡\u00018F¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R\u0015\u0010¤\u0001\u001a\u00030¥\u00018F¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0017\u0010¨\u0001\u001a\u0005\u0018\u00010©\u00018F¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u0013\u0010¬\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010`R\u0015\u0010®\u0001\u001a\u00030¯\u00018F¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001R\u0013\u0010²\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\b³\u0001\u0010`R\u0018\u0010´\u0001\u001a\u00030µ\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001R\u0019\u0010¸\u0001\u001a\u0004\u0018\u00010O8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010º\u0001R\u0013\u0010»\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010`R\u0013\u0010½\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010`R\u0016\u0010¿\u0001\u001a\u0004\u0018\u0001048F¢\u0006\b\u001a\u0006\bÀ\u0001\u0010\u0086\u0001R\u0017\u0010Á\u0001\u001a\u0005\u0018\u00010Â\u00018F¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0017\u0010Å\u0001\u001a\u0005\u0018\u00010Â\u00018F¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ä\u0001R\u0013\u0010Ç\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010`R\u0017\u0010É\u0001\u001a\u0005\u0018\u00010Ê\u00018F¢\u0006\b\u001a\u0006\bË\u0001\u0010Ì\u0001R\u0013\u0010Í\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010`R\u0016\u0010Ï\u0001\u001a\u00020\u00118@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010`R\u0016\u0010Ñ\u0001\u001a\u00020\u00118@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010`R\u0013\u0010Ó\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010`R\u0013\u0010Õ\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010`R\u0017\u0010×\u0001\u001a\u0005\u0018\u00010Â\u00018F¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ä\u0001R\u0017\u0010Ù\u0001\u001a\u0005\u0018\u00010Â\u00018F¢\u0006\b\u001a\u0006\bÚ\u0001\u0010Ä\u0001R\u0017\u0010Û\u0001\u001a\u0005\u0018\u00010Â\u00018F¢\u0006\b\u001a\u0006\bÜ\u0001\u0010Ä\u0001R\u0017\u0010Ý\u0001\u001a\u0005\u0018\u00010Â\u00018F¢\u0006\b\u001a\u0006\bÞ\u0001\u0010Ä\u0001R\u0013\u0010ß\u0001\u001a\u00020\u00118F¢\u0006\u0007\u001a\u0005\bß\u0001\u0010`R\u0018\u0010à\u0001\u001a\u00030\u009d\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bá\u0001\u0010\u009f\u0001R\u0017\u0010â\u0001\u001a\u0005\u0018\u00010Â\u00018F¢\u0006\b\u001a\u0006\bã\u0001\u0010Ä\u0001R\u0017\u0010ä\u0001\u001a\u0005\u0018\u00010Â\u00018F¢\u0006\b\u001a\u0006\bå\u0001\u0010Ä\u0001R\u0017\u0010æ\u0001\u001a\u0005\u0018\u00010Â\u00018F¢\u0006\b\u001a\u0006\bç\u0001\u0010Ä\u0001R\u0017\u0010è\u0001\u001a\u0005\u0018\u00010Â\u00018F¢\u0006\b\u001a\u0006\bé\u0001\u0010Ä\u0001¨\u0006¡\u0002"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "nbboSummary", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "sessionChangeAlertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "instrumentAccountSwitcher", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;", "allAccounts", "", "Lcom/robinhood/models/db/Account;", "loadingAccountSwitcher", "", "account", "instrument", "Lcom/robinhood/models/db/Instrument;", "quote", "Lcom/robinhood/models/db/Quote;", "position", "Lcom/robinhood/models/db/Position;", "instrumentBuyingPower", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "experiments", "Lcom/robinhood/models/db/KaizenExperiment;", "isBackupWithheld", "backupWithholdingEstimateAmountResponse", "Lcom/robinhood/models/db/bonfire/WithholdingEstimatedAmount;", "mlpExperimentMember", "withholdingStatus", "Lcom/robinhood/models/db/bonfire/WithholdingStatus;", "collateral", "Lcom/robinhood/models/api/ApiCollateral;", "marketHours", "Lcom/robinhood/models/db/MarketHours;", "nextEffectiveMarketHours", "isAdtHours", "staticInputs", "Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;", "equityOrderContext", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "validationState", "Lcom/robinhood/android/equity/ordercheck/ValidationState;", "estimatedFees", "Lkotlin/Result;", "Lcom/robinhood/models/api/ApiEstimatedFees;", "overrideToExecuteInMarketHoursOnly", "checkOverrides", "", "isCancelPendingCryptoOrdersLoading", "loadingNbbo", "overrideFlipIpoAccessShares", "isMarketBuysEnabled", "silentActionsTaken", "Lcom/robinhood/models/serverdriven/db/GenericOrderCheckAction;", "microgramOrderSummary", "microgramState", "Lmicrogram/android/MicrogramState;", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "orderPendingReplacement", "Lcom/robinhood/models/db/Order;", "taxLotsSelection", "Lequity_trading_tax_lots/proto/v1/TaxLotSelection;", "taxLotSelectionType", "Lcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/TaxLotSelectionType;", "taxLotsEstCredit", "Lcom/robinhood/rosetta/common/Money;", "taxLotsGainLoss", "taxLotsM1ExperimentMember", "subzeroEnabled", "shortingInfo", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "marginAccounts", "resetTooltipKey", "", "useSduiAccountSwitcher", "<init>", "(Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;Lcom/robinhood/models/db/EquityOrderSide;Lcom/robinhood/nbbo/models/db/NbboSummary;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;Ljava/util/List;ZLcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/InstrumentBuyingPower;Ljava/util/List;ZLcom/robinhood/models/db/bonfire/WithholdingEstimatedAmount;ZLcom/robinhood/models/db/bonfire/WithholdingStatus;Lcom/robinhood/models/api/ApiCollateral;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/MarketHours;Ljava/lang/Boolean;Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;Lcom/robinhood/android/equity/validation/EquityOrderContext;Lcom/robinhood/android/equity/ordercheck/ValidationState;Lkotlin/Result;ZLjava/util/List;ZZZLjava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Lmicrogram/android/MicrogramState;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Lcom/robinhood/models/db/Order;Ljava/util/List;Lcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/TaxLotSelectionType;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;ZZLkotlin/Result;Ljava/util/List;IZ)V", "getConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getNbboSummary", "()Lcom/robinhood/nbbo/models/db/NbboSummary;", "getSessionChangeAlertContent", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "getInstrumentAccountSwitcher", "()Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;", "getAllAccounts", "()Ljava/util/List;", "getLoadingAccountSwitcher", "()Z", "getAccount", "()Lcom/robinhood/models/db/Account;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getQuote", "()Lcom/robinhood/models/db/Quote;", "getPosition", "()Lcom/robinhood/models/db/Position;", "getInstrumentBuyingPower", "()Lcom/robinhood/models/db/InstrumentBuyingPower;", "getExperiments", "getBackupWithholdingEstimateAmountResponse", "()Lcom/robinhood/models/db/bonfire/WithholdingEstimatedAmount;", "getMlpExperimentMember", "getWithholdingStatus", "()Lcom/robinhood/models/db/bonfire/WithholdingStatus;", "getCollateral", "()Lcom/robinhood/models/api/ApiCollateral;", "getMarketHours", "()Lcom/robinhood/models/db/MarketHours;", "getNextEffectiveMarketHours", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStaticInputs", "()Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;", "getEquityOrderContext", "()Lcom/robinhood/android/equity/validation/EquityOrderContext;", "getValidationState", "()Lcom/robinhood/android/equity/ordercheck/ValidationState;", "getEstimatedFees-xLWZpok", "()Lkotlin/Result;", "getOverrideToExecuteInMarketHoursOnly", "getCheckOverrides", "getLoadingNbbo", "getOverrideFlipIpoAccessShares", "getSilentActionsTaken", "getMicrogramOrderSummary", "()Ljava/lang/String;", "getMicrogramState", "()Lmicrogram/android/MicrogramState;", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "getOrderPendingReplacement", "()Lcom/robinhood/models/db/Order;", "getTaxLotsSelection", "getTaxLotSelectionType", "()Lcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/TaxLotSelectionType;", "getTaxLotsEstCredit", "()Lcom/robinhood/rosetta/common/Money;", "getTaxLotsGainLoss", "getTaxLotsM1ExperimentMember", "getSubzeroEnabled", "getShortingInfo-xLWZpok", "getMarginAccounts", "getResetTooltipKey", "()I", "getUseSduiAccountSwitcher", "accountNumber", "getAccountNumber", "stopPrice", "Ljava/math/BigDecimal;", "getStopPrice", "()Ljava/math/BigDecimal;", "lastTradePrice", "Lcom/robinhood/models/util/Money;", "getLastTradePrice", "()Lcom/robinhood/models/util/Money;", "positionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "getPositionEffect", "()Lcom/robinhood/models/db/OrderPositionEffect;", "requestInputs", "Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs;", "getRequestInputs", "()Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs;", "loading", "getLoading", "formState", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "getFormState", "()Lcom/robinhood/android/lib/trade/DefaultOrderState;", "reviewing", "getReviewing", "quantityOrAmount", "Lcom/robinhood/models/api/QuantityOrAmount;", "getQuantityOrAmount$feature_trade_equity_externalDebug", "()Lcom/robinhood/models/api/QuantityOrAmount;", "twentyFourHourMarketRoundedShareQuantity", "getTwentyFourHourMarketRoundedShareQuantity$feature_trade_equity_externalDebug", "()Ljava/lang/Integer;", "shouldShowBackupWithholdingWarning", "getShouldShowBackupWithholdingWarning", "shouldShowBackupWithholdingEstimate", "getShouldShowBackupWithholdingEstimate", "backupWithholdingEstimateAmount", "getBackupWithholdingEstimateAmount", "accountNameTitle", "Lcom/robinhood/utils/resource/StringResource;", "getAccountNameTitle", "()Lcom/robinhood/utils/resource/StringResource;", "accountNameSubtitle", "getAccountNameSubtitle", "shouldShowAccountSwitcher", "getShouldShowAccountSwitcher", "accountSwitcherState", "Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "getAccountSwitcherState", "()Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "showTwentyFourHourMarketButton", "getShowTwentyFourHourMarketButton", "isSellingLessThanOneShare", "isSellingLessThanOneShare$feature_trade_equity_externalDebug", "isShortPosition", "isShortPosition$feature_trade_equity_externalDebug", "showTwentyFourHourMarketDialog", "getShowTwentyFourHourMarketDialog", "showLimitOrdersOnlyDialog", "getShowLimitOrdersOnlyDialog", "sellAllButtonLabelStringResource", "getSellAllButtonLabelStringResource", "buyingPowerAvailableStringResource", "getBuyingPowerAvailableStringResource", "subzeroDescriptionStringResource", "getSubzeroDescriptionStringResource", "availableSharesForBuyStringResource", "getAvailableSharesForBuyStringResource", "isCancelNew", "taxLotsNumSelectedShares", "getTaxLotsNumSelectedShares", "taxLotsGainLossStringResource", "getTaxLotsGainLossStringResource", "taxLotsTermStringResource", "getTaxLotsTermStringResource", "taxLotsEstCreditStringResource", "getTaxLotsEstCreditStringResource", "taxLotsM1SecondaryStringResource", "getTaxLotsM1SecondaryStringResource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component25-xLWZpok", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component43-xLWZpok", "component44", "component45", "component46", "copy", "(Lcom/robinhood/android/trading/contracts/configuration/ShareBasedOrderConfiguration;Lcom/robinhood/models/db/EquityOrderSide;Lcom/robinhood/nbbo/models/db/NbboSummary;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;Ljava/util/List;ZLcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/InstrumentBuyingPower;Ljava/util/List;ZLcom/robinhood/models/db/bonfire/WithholdingEstimatedAmount;ZLcom/robinhood/models/db/bonfire/WithholdingStatus;Lcom/robinhood/models/api/ApiCollateral;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/MarketHours;Ljava/lang/Boolean;Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;Lcom/robinhood/android/equity/validation/EquityOrderContext;Lcom/robinhood/android/equity/ordercheck/ValidationState;Lkotlin/Result;ZLjava/util/List;ZZZLjava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Lmicrogram/android/MicrogramState;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Lcom/robinhood/models/db/Order;Ljava/util/List;Lcom/robinhood/android/equities/taxlots/taxlotsmodelsapi/TaxLotSelectionType;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;ZZLkotlin/Result;Ljava/util/List;IZ)Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;", "equals", "other", "hashCode", "toString", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class EquityShareOrderDataState {
    private final Account account;
    private final List<Account> allAccounts;
    private final WithholdingEstimatedAmount backupWithholdingEstimateAmountResponse;
    private final List<String> checkOverrides;
    private final ApiCollateral collateral;
    private final ShareBasedOrderConfiguration configuration;
    private final EquityOrderContext equityOrderContext;
    private final Result<ApiEstimatedFees> estimatedFees;
    private final List<KaizenExperiment> experiments;
    private final EquityOrderFlowSource flowSource;
    private final Instrument instrument;
    private final InstrumentAccountSwitcher instrumentAccountSwitcher;
    private final InstrumentBuyingPower instrumentBuyingPower;
    private final Boolean isAdtHours;
    private final boolean isBackupWithheld;
    private final boolean isCancelPendingCryptoOrdersLoading;
    private final Boolean isMarketBuysEnabled;
    private final boolean loadingAccountSwitcher;
    private final boolean loadingNbbo;
    private final List<Account> marginAccounts;
    private final MarketHours marketHours;
    private final String microgramOrderSummary;
    private final Monitoring microgramState;
    private final boolean mlpExperimentMember;
    private final NbboSummary nbboSummary;
    private final MarketHours nextEffectiveMarketHours;
    private final Order orderPendingReplacement;
    private final boolean overrideFlipIpoAccessShares;
    private final boolean overrideToExecuteInMarketHoursOnly;
    private final Position position;
    private final Quote quote;
    private final int resetTooltipKey;
    private final GenericAlertContent<GenericAction> sessionChangeAlertContent;
    private final Result<ShortingInfo> shortingInfo;
    private final EquityOrderSide side;
    private final List<GenericOrderCheckAction> silentActionsTaken;
    private final EquityOrderRequestInputs.StaticInputs staticInputs;
    private final boolean subzeroEnabled;
    private final TaxLotSelectionType taxLotSelectionType;
    private final Money taxLotsEstCredit;
    private final Money taxLotsGainLoss;
    private final boolean taxLotsM1ExperimentMember;
    private final List<TaxLotSelection> taxLotsSelection;
    private final boolean useSduiAccountSwitcher;
    private final ValidationState validationState;
    private final WithholdingStatus withholdingStatus;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EquityShareOrderDataState.kt */
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

    /* renamed from: component1, reason: from getter */
    public final ShareBasedOrderConfiguration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component10, reason: from getter */
    public final Quote getQuote() {
        return this.quote;
    }

    /* renamed from: component11, reason: from getter */
    public final Position getPosition() {
        return this.position;
    }

    /* renamed from: component12, reason: from getter */
    public final InstrumentBuyingPower getInstrumentBuyingPower() {
        return this.instrumentBuyingPower;
    }

    public final List<KaizenExperiment> component13() {
        return this.experiments;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsBackupWithheld() {
        return this.isBackupWithheld;
    }

    /* renamed from: component15, reason: from getter */
    public final WithholdingEstimatedAmount getBackupWithholdingEstimateAmountResponse() {
        return this.backupWithholdingEstimateAmountResponse;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getMlpExperimentMember() {
        return this.mlpExperimentMember;
    }

    /* renamed from: component17, reason: from getter */
    public final WithholdingStatus getWithholdingStatus() {
        return this.withholdingStatus;
    }

    /* renamed from: component18, reason: from getter */
    public final ApiCollateral getCollateral() {
        return this.collateral;
    }

    /* renamed from: component19, reason: from getter */
    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    /* renamed from: component2, reason: from getter */
    public final EquityOrderSide getSide() {
        return this.side;
    }

    /* renamed from: component20, reason: from getter */
    public final MarketHours getNextEffectiveMarketHours() {
        return this.nextEffectiveMarketHours;
    }

    /* renamed from: component21, reason: from getter */
    public final Boolean getIsAdtHours() {
        return this.isAdtHours;
    }

    /* renamed from: component22, reason: from getter */
    public final EquityOrderRequestInputs.StaticInputs getStaticInputs() {
        return this.staticInputs;
    }

    /* renamed from: component23, reason: from getter */
    public final EquityOrderContext getEquityOrderContext() {
        return this.equityOrderContext;
    }

    /* renamed from: component24, reason: from getter */
    public final ValidationState getValidationState() {
        return this.validationState;
    }

    /* renamed from: component25-xLWZpok, reason: not valid java name */
    public final Result<ApiEstimatedFees> m19348component25xLWZpok() {
        return this.estimatedFees;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getOverrideToExecuteInMarketHoursOnly() {
        return this.overrideToExecuteInMarketHoursOnly;
    }

    public final List<String> component27() {
        return this.checkOverrides;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getIsCancelPendingCryptoOrdersLoading() {
        return this.isCancelPendingCryptoOrdersLoading;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getLoadingNbbo() {
        return this.loadingNbbo;
    }

    /* renamed from: component3, reason: from getter */
    public final NbboSummary getNbboSummary() {
        return this.nbboSummary;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getOverrideFlipIpoAccessShares() {
        return this.overrideFlipIpoAccessShares;
    }

    /* renamed from: component31, reason: from getter */
    public final Boolean getIsMarketBuysEnabled() {
        return this.isMarketBuysEnabled;
    }

    public final List<GenericOrderCheckAction> component32() {
        return this.silentActionsTaken;
    }

    /* renamed from: component33, reason: from getter */
    public final String getMicrogramOrderSummary() {
        return this.microgramOrderSummary;
    }

    /* renamed from: component34, reason: from getter */
    public final Monitoring getMicrogramState() {
        return this.microgramState;
    }

    /* renamed from: component35, reason: from getter */
    public final EquityOrderFlowSource getFlowSource() {
        return this.flowSource;
    }

    /* renamed from: component36, reason: from getter */
    public final Order getOrderPendingReplacement() {
        return this.orderPendingReplacement;
    }

    public final List<TaxLotSelection> component37() {
        return this.taxLotsSelection;
    }

    /* renamed from: component38, reason: from getter */
    public final TaxLotSelectionType getTaxLotSelectionType() {
        return this.taxLotSelectionType;
    }

    /* renamed from: component39, reason: from getter */
    public final Money getTaxLotsEstCredit() {
        return this.taxLotsEstCredit;
    }

    public final GenericAlertContent<GenericAction> component4() {
        return this.sessionChangeAlertContent;
    }

    /* renamed from: component40, reason: from getter */
    public final Money getTaxLotsGainLoss() {
        return this.taxLotsGainLoss;
    }

    /* renamed from: component41, reason: from getter */
    public final boolean getTaxLotsM1ExperimentMember() {
        return this.taxLotsM1ExperimentMember;
    }

    /* renamed from: component42, reason: from getter */
    public final boolean getSubzeroEnabled() {
        return this.subzeroEnabled;
    }

    /* renamed from: component43-xLWZpok, reason: not valid java name */
    public final Result<ShortingInfo> m19349component43xLWZpok() {
        return this.shortingInfo;
    }

    public final List<Account> component44() {
        return this.marginAccounts;
    }

    /* renamed from: component45, reason: from getter */
    public final int getResetTooltipKey() {
        return this.resetTooltipKey;
    }

    /* renamed from: component46, reason: from getter */
    public final boolean getUseSduiAccountSwitcher() {
        return this.useSduiAccountSwitcher;
    }

    /* renamed from: component5, reason: from getter */
    public final InstrumentAccountSwitcher getInstrumentAccountSwitcher() {
        return this.instrumentAccountSwitcher;
    }

    public final List<Account> component6() {
        return this.allAccounts;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getLoadingAccountSwitcher() {
        return this.loadingAccountSwitcher;
    }

    /* renamed from: component8, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component9, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final EquityShareOrderDataState copy(ShareBasedOrderConfiguration configuration, EquityOrderSide side, NbboSummary nbboSummary, GenericAlertContent<? extends GenericAction> sessionChangeAlertContent, InstrumentAccountSwitcher instrumentAccountSwitcher, List<Account> allAccounts, boolean loadingAccountSwitcher, Account account, Instrument instrument, Quote quote, Position position, InstrumentBuyingPower instrumentBuyingPower, List<? extends KaizenExperiment> experiments, boolean isBackupWithheld, WithholdingEstimatedAmount backupWithholdingEstimateAmountResponse, boolean mlpExperimentMember, WithholdingStatus withholdingStatus, ApiCollateral collateral, MarketHours marketHours, MarketHours nextEffectiveMarketHours, Boolean isAdtHours, EquityOrderRequestInputs.StaticInputs staticInputs, EquityOrderContext equityOrderContext, ValidationState validationState, Result<ApiEstimatedFees> estimatedFees, boolean overrideToExecuteInMarketHoursOnly, List<String> checkOverrides, boolean isCancelPendingCryptoOrdersLoading, boolean loadingNbbo, boolean overrideFlipIpoAccessShares, Boolean isMarketBuysEnabled, List<? extends GenericOrderCheckAction> silentActionsTaken, String microgramOrderSummary, Monitoring microgramState, EquityOrderFlowSource flowSource, Order orderPendingReplacement, List<TaxLotSelection> taxLotsSelection, TaxLotSelectionType taxLotSelectionType, Money taxLotsEstCredit, Money taxLotsGainLoss, boolean taxLotsM1ExperimentMember, boolean subzeroEnabled, Result<ShortingInfo> shortingInfo, List<Account> marginAccounts, int resetTooltipKey, boolean useSduiAccountSwitcher) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(validationState, "validationState");
        Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
        Intrinsics.checkNotNullParameter(silentActionsTaken, "silentActionsTaken");
        Intrinsics.checkNotNullParameter(flowSource, "flowSource");
        Intrinsics.checkNotNullParameter(taxLotsSelection, "taxLotsSelection");
        Intrinsics.checkNotNullParameter(marginAccounts, "marginAccounts");
        return new EquityShareOrderDataState(configuration, side, nbboSummary, sessionChangeAlertContent, instrumentAccountSwitcher, allAccounts, loadingAccountSwitcher, account, instrument, quote, position, instrumentBuyingPower, experiments, isBackupWithheld, backupWithholdingEstimateAmountResponse, mlpExperimentMember, withholdingStatus, collateral, marketHours, nextEffectiveMarketHours, isAdtHours, staticInputs, equityOrderContext, validationState, estimatedFees, overrideToExecuteInMarketHoursOnly, checkOverrides, isCancelPendingCryptoOrdersLoading, loadingNbbo, overrideFlipIpoAccessShares, isMarketBuysEnabled, silentActionsTaken, microgramOrderSummary, microgramState, flowSource, orderPendingReplacement, taxLotsSelection, taxLotSelectionType, taxLotsEstCredit, taxLotsGainLoss, taxLotsM1ExperimentMember, subzeroEnabled, shortingInfo, marginAccounts, resetTooltipKey, useSduiAccountSwitcher);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityShareOrderDataState)) {
            return false;
        }
        EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) other;
        return Intrinsics.areEqual(this.configuration, equityShareOrderDataState.configuration) && this.side == equityShareOrderDataState.side && Intrinsics.areEqual(this.nbboSummary, equityShareOrderDataState.nbboSummary) && Intrinsics.areEqual(this.sessionChangeAlertContent, equityShareOrderDataState.sessionChangeAlertContent) && Intrinsics.areEqual(this.instrumentAccountSwitcher, equityShareOrderDataState.instrumentAccountSwitcher) && Intrinsics.areEqual(this.allAccounts, equityShareOrderDataState.allAccounts) && this.loadingAccountSwitcher == equityShareOrderDataState.loadingAccountSwitcher && Intrinsics.areEqual(this.account, equityShareOrderDataState.account) && Intrinsics.areEqual(this.instrument, equityShareOrderDataState.instrument) && Intrinsics.areEqual(this.quote, equityShareOrderDataState.quote) && Intrinsics.areEqual(this.position, equityShareOrderDataState.position) && Intrinsics.areEqual(this.instrumentBuyingPower, equityShareOrderDataState.instrumentBuyingPower) && Intrinsics.areEqual(this.experiments, equityShareOrderDataState.experiments) && this.isBackupWithheld == equityShareOrderDataState.isBackupWithheld && Intrinsics.areEqual(this.backupWithholdingEstimateAmountResponse, equityShareOrderDataState.backupWithholdingEstimateAmountResponse) && this.mlpExperimentMember == equityShareOrderDataState.mlpExperimentMember && Intrinsics.areEqual(this.withholdingStatus, equityShareOrderDataState.withholdingStatus) && Intrinsics.areEqual(this.collateral, equityShareOrderDataState.collateral) && Intrinsics.areEqual(this.marketHours, equityShareOrderDataState.marketHours) && Intrinsics.areEqual(this.nextEffectiveMarketHours, equityShareOrderDataState.nextEffectiveMarketHours) && Intrinsics.areEqual(this.isAdtHours, equityShareOrderDataState.isAdtHours) && Intrinsics.areEqual(this.staticInputs, equityShareOrderDataState.staticInputs) && Intrinsics.areEqual(this.equityOrderContext, equityShareOrderDataState.equityOrderContext) && Intrinsics.areEqual(this.validationState, equityShareOrderDataState.validationState) && Intrinsics.areEqual(this.estimatedFees, equityShareOrderDataState.estimatedFees) && this.overrideToExecuteInMarketHoursOnly == equityShareOrderDataState.overrideToExecuteInMarketHoursOnly && Intrinsics.areEqual(this.checkOverrides, equityShareOrderDataState.checkOverrides) && this.isCancelPendingCryptoOrdersLoading == equityShareOrderDataState.isCancelPendingCryptoOrdersLoading && this.loadingNbbo == equityShareOrderDataState.loadingNbbo && this.overrideFlipIpoAccessShares == equityShareOrderDataState.overrideFlipIpoAccessShares && Intrinsics.areEqual(this.isMarketBuysEnabled, equityShareOrderDataState.isMarketBuysEnabled) && Intrinsics.areEqual(this.silentActionsTaken, equityShareOrderDataState.silentActionsTaken) && Intrinsics.areEqual(this.microgramOrderSummary, equityShareOrderDataState.microgramOrderSummary) && Intrinsics.areEqual(this.microgramState, equityShareOrderDataState.microgramState) && this.flowSource == equityShareOrderDataState.flowSource && Intrinsics.areEqual(this.orderPendingReplacement, equityShareOrderDataState.orderPendingReplacement) && Intrinsics.areEqual(this.taxLotsSelection, equityShareOrderDataState.taxLotsSelection) && this.taxLotSelectionType == equityShareOrderDataState.taxLotSelectionType && Intrinsics.areEqual(this.taxLotsEstCredit, equityShareOrderDataState.taxLotsEstCredit) && Intrinsics.areEqual(this.taxLotsGainLoss, equityShareOrderDataState.taxLotsGainLoss) && this.taxLotsM1ExperimentMember == equityShareOrderDataState.taxLotsM1ExperimentMember && this.subzeroEnabled == equityShareOrderDataState.subzeroEnabled && Intrinsics.areEqual(this.shortingInfo, equityShareOrderDataState.shortingInfo) && Intrinsics.areEqual(this.marginAccounts, equityShareOrderDataState.marginAccounts) && this.resetTooltipKey == equityShareOrderDataState.resetTooltipKey && this.useSduiAccountSwitcher == equityShareOrderDataState.useSduiAccountSwitcher;
    }

    public int hashCode() {
        int iHashCode = ((this.configuration.hashCode() * 31) + this.side.hashCode()) * 31;
        NbboSummary nbboSummary = this.nbboSummary;
        int iHashCode2 = (iHashCode + (nbboSummary == null ? 0 : nbboSummary.hashCode())) * 31;
        GenericAlertContent<GenericAction> genericAlertContent = this.sessionChangeAlertContent;
        int iHashCode3 = (iHashCode2 + (genericAlertContent == null ? 0 : genericAlertContent.hashCode())) * 31;
        InstrumentAccountSwitcher instrumentAccountSwitcher = this.instrumentAccountSwitcher;
        int iHashCode4 = (((((iHashCode3 + (instrumentAccountSwitcher == null ? 0 : instrumentAccountSwitcher.hashCode())) * 31) + this.allAccounts.hashCode()) * 31) + Boolean.hashCode(this.loadingAccountSwitcher)) * 31;
        Account account = this.account;
        int iHashCode5 = (iHashCode4 + (account == null ? 0 : account.hashCode())) * 31;
        Instrument instrument = this.instrument;
        int iHashCode6 = (iHashCode5 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        Quote quote = this.quote;
        int iHashCode7 = (iHashCode6 + (quote == null ? 0 : quote.hashCode())) * 31;
        Position position = this.position;
        int iHashCode8 = (iHashCode7 + (position == null ? 0 : position.hashCode())) * 31;
        InstrumentBuyingPower instrumentBuyingPower = this.instrumentBuyingPower;
        int iHashCode9 = (((((iHashCode8 + (instrumentBuyingPower == null ? 0 : instrumentBuyingPower.hashCode())) * 31) + this.experiments.hashCode()) * 31) + Boolean.hashCode(this.isBackupWithheld)) * 31;
        WithholdingEstimatedAmount withholdingEstimatedAmount = this.backupWithholdingEstimateAmountResponse;
        int iHashCode10 = (((iHashCode9 + (withholdingEstimatedAmount == null ? 0 : withholdingEstimatedAmount.hashCode())) * 31) + Boolean.hashCode(this.mlpExperimentMember)) * 31;
        WithholdingStatus withholdingStatus = this.withholdingStatus;
        int iHashCode11 = (iHashCode10 + (withholdingStatus == null ? 0 : withholdingStatus.hashCode())) * 31;
        ApiCollateral apiCollateral = this.collateral;
        int iHashCode12 = (iHashCode11 + (apiCollateral == null ? 0 : apiCollateral.hashCode())) * 31;
        MarketHours marketHours = this.marketHours;
        int iHashCode13 = (iHashCode12 + (marketHours == null ? 0 : marketHours.hashCode())) * 31;
        MarketHours marketHours2 = this.nextEffectiveMarketHours;
        int iHashCode14 = (iHashCode13 + (marketHours2 == null ? 0 : marketHours2.hashCode())) * 31;
        Boolean bool = this.isAdtHours;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        EquityOrderRequestInputs.StaticInputs staticInputs = this.staticInputs;
        int iHashCode16 = (iHashCode15 + (staticInputs == null ? 0 : staticInputs.hashCode())) * 31;
        EquityOrderContext equityOrderContext = this.equityOrderContext;
        int iHashCode17 = (((iHashCode16 + (equityOrderContext == null ? 0 : equityOrderContext.hashCode())) * 31) + this.validationState.hashCode()) * 31;
        Result<ApiEstimatedFees> result = this.estimatedFees;
        int iM28554hashCodeimpl = (((((((((((iHashCode17 + (result == null ? 0 : Result.m28554hashCodeimpl(result.getValue()))) * 31) + Boolean.hashCode(this.overrideToExecuteInMarketHoursOnly)) * 31) + this.checkOverrides.hashCode()) * 31) + Boolean.hashCode(this.isCancelPendingCryptoOrdersLoading)) * 31) + Boolean.hashCode(this.loadingNbbo)) * 31) + Boolean.hashCode(this.overrideFlipIpoAccessShares)) * 31;
        Boolean bool2 = this.isMarketBuysEnabled;
        int iHashCode18 = (((iM28554hashCodeimpl + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.silentActionsTaken.hashCode()) * 31;
        String str = this.microgramOrderSummary;
        int iHashCode19 = (iHashCode18 + (str == null ? 0 : str.hashCode())) * 31;
        Monitoring monitoring = this.microgramState;
        int iHashCode20 = (((iHashCode19 + (monitoring == null ? 0 : monitoring.hashCode())) * 31) + this.flowSource.hashCode()) * 31;
        Order order = this.orderPendingReplacement;
        int iHashCode21 = (((iHashCode20 + (order == null ? 0 : order.hashCode())) * 31) + this.taxLotsSelection.hashCode()) * 31;
        TaxLotSelectionType taxLotSelectionType = this.taxLotSelectionType;
        int iHashCode22 = (iHashCode21 + (taxLotSelectionType == null ? 0 : taxLotSelectionType.hashCode())) * 31;
        Money money = this.taxLotsEstCredit;
        int iHashCode23 = (iHashCode22 + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.taxLotsGainLoss;
        int iHashCode24 = (((((iHashCode23 + (money2 == null ? 0 : money2.hashCode())) * 31) + Boolean.hashCode(this.taxLotsM1ExperimentMember)) * 31) + Boolean.hashCode(this.subzeroEnabled)) * 31;
        Result<ShortingInfo> result2 = this.shortingInfo;
        return ((((((iHashCode24 + (result2 != null ? Result.m28554hashCodeimpl(result2.getValue()) : 0)) * 31) + this.marginAccounts.hashCode()) * 31) + Integer.hashCode(this.resetTooltipKey)) * 31) + Boolean.hashCode(this.useSduiAccountSwitcher);
    }

    public String toString() {
        return "EquityShareOrderDataState(configuration=" + this.configuration + ", side=" + this.side + ", nbboSummary=" + this.nbboSummary + ", sessionChangeAlertContent=" + this.sessionChangeAlertContent + ", instrumentAccountSwitcher=" + this.instrumentAccountSwitcher + ", allAccounts=" + this.allAccounts + ", loadingAccountSwitcher=" + this.loadingAccountSwitcher + ", account=" + this.account + ", instrument=" + this.instrument + ", quote=" + this.quote + ", position=" + this.position + ", instrumentBuyingPower=" + this.instrumentBuyingPower + ", experiments=" + this.experiments + ", isBackupWithheld=" + this.isBackupWithheld + ", backupWithholdingEstimateAmountResponse=" + this.backupWithholdingEstimateAmountResponse + ", mlpExperimentMember=" + this.mlpExperimentMember + ", withholdingStatus=" + this.withholdingStatus + ", collateral=" + this.collateral + ", marketHours=" + this.marketHours + ", nextEffectiveMarketHours=" + this.nextEffectiveMarketHours + ", isAdtHours=" + this.isAdtHours + ", staticInputs=" + this.staticInputs + ", equityOrderContext=" + this.equityOrderContext + ", validationState=" + this.validationState + ", estimatedFees=" + this.estimatedFees + ", overrideToExecuteInMarketHoursOnly=" + this.overrideToExecuteInMarketHoursOnly + ", checkOverrides=" + this.checkOverrides + ", isCancelPendingCryptoOrdersLoading=" + this.isCancelPendingCryptoOrdersLoading + ", loadingNbbo=" + this.loadingNbbo + ", overrideFlipIpoAccessShares=" + this.overrideFlipIpoAccessShares + ", isMarketBuysEnabled=" + this.isMarketBuysEnabled + ", silentActionsTaken=" + this.silentActionsTaken + ", microgramOrderSummary=" + this.microgramOrderSummary + ", microgramState=" + this.microgramState + ", flowSource=" + this.flowSource + ", orderPendingReplacement=" + this.orderPendingReplacement + ", taxLotsSelection=" + this.taxLotsSelection + ", taxLotSelectionType=" + this.taxLotSelectionType + ", taxLotsEstCredit=" + this.taxLotsEstCredit + ", taxLotsGainLoss=" + this.taxLotsGainLoss + ", taxLotsM1ExperimentMember=" + this.taxLotsM1ExperimentMember + ", subzeroEnabled=" + this.subzeroEnabled + ", shortingInfo=" + this.shortingInfo + ", marginAccounts=" + this.marginAccounts + ", resetTooltipKey=" + this.resetTooltipKey + ", useSduiAccountSwitcher=" + this.useSduiAccountSwitcher + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EquityShareOrderDataState(ShareBasedOrderConfiguration configuration, EquityOrderSide side, NbboSummary nbboSummary, GenericAlertContent<? extends GenericAction> genericAlertContent, InstrumentAccountSwitcher instrumentAccountSwitcher, List<Account> allAccounts, boolean z, Account account, Instrument instrument, Quote quote, Position position, InstrumentBuyingPower instrumentBuyingPower, List<? extends KaizenExperiment> experiments, boolean z2, WithholdingEstimatedAmount withholdingEstimatedAmount, boolean z3, WithholdingStatus withholdingStatus, ApiCollateral apiCollateral, MarketHours marketHours, MarketHours marketHours2, Boolean bool, EquityOrderRequestInputs.StaticInputs staticInputs, EquityOrderContext equityOrderContext, ValidationState validationState, Result<ApiEstimatedFees> result, boolean z4, List<String> checkOverrides, boolean z5, boolean z6, boolean z7, Boolean bool2, List<? extends GenericOrderCheckAction> silentActionsTaken, String str, Monitoring monitoring, EquityOrderFlowSource flowSource, Order order, List<TaxLotSelection> taxLotsSelection, TaxLotSelectionType taxLotSelectionType, Money money, Money money2, boolean z8, boolean z9, Result<ShortingInfo> result2, List<Account> marginAccounts, int i, boolean z10) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(validationState, "validationState");
        Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
        Intrinsics.checkNotNullParameter(silentActionsTaken, "silentActionsTaken");
        Intrinsics.checkNotNullParameter(flowSource, "flowSource");
        Intrinsics.checkNotNullParameter(taxLotsSelection, "taxLotsSelection");
        Intrinsics.checkNotNullParameter(marginAccounts, "marginAccounts");
        this.configuration = configuration;
        this.side = side;
        this.nbboSummary = nbboSummary;
        this.sessionChangeAlertContent = genericAlertContent;
        this.instrumentAccountSwitcher = instrumentAccountSwitcher;
        this.allAccounts = allAccounts;
        this.loadingAccountSwitcher = z;
        this.account = account;
        this.instrument = instrument;
        this.quote = quote;
        this.position = position;
        this.instrumentBuyingPower = instrumentBuyingPower;
        this.experiments = experiments;
        this.isBackupWithheld = z2;
        this.backupWithholdingEstimateAmountResponse = withholdingEstimatedAmount;
        this.mlpExperimentMember = z3;
        this.withholdingStatus = withholdingStatus;
        this.collateral = apiCollateral;
        this.marketHours = marketHours;
        this.nextEffectiveMarketHours = marketHours2;
        this.isAdtHours = bool;
        this.staticInputs = staticInputs;
        this.equityOrderContext = equityOrderContext;
        this.validationState = validationState;
        this.estimatedFees = result;
        this.overrideToExecuteInMarketHoursOnly = z4;
        this.checkOverrides = checkOverrides;
        this.isCancelPendingCryptoOrdersLoading = z5;
        this.loadingNbbo = z6;
        this.overrideFlipIpoAccessShares = z7;
        this.isMarketBuysEnabled = bool2;
        this.silentActionsTaken = silentActionsTaken;
        this.microgramOrderSummary = str;
        this.microgramState = monitoring;
        this.flowSource = flowSource;
        this.orderPendingReplacement = order;
        this.taxLotsSelection = taxLotsSelection;
        this.taxLotSelectionType = taxLotSelectionType;
        this.taxLotsEstCredit = money;
        this.taxLotsGainLoss = money2;
        this.taxLotsM1ExperimentMember = z8;
        this.subzeroEnabled = z9;
        this.shortingInfo = result2;
        this.marginAccounts = marginAccounts;
        this.resetTooltipKey = i;
        this.useSduiAccountSwitcher = z10;
    }

    public final ShareBasedOrderConfiguration getConfiguration() {
        return this.configuration;
    }

    public final EquityOrderSide getSide() {
        return this.side;
    }

    public final NbboSummary getNbboSummary() {
        return this.nbboSummary;
    }

    public final GenericAlertContent<GenericAction> getSessionChangeAlertContent() {
        return this.sessionChangeAlertContent;
    }

    public final InstrumentAccountSwitcher getInstrumentAccountSwitcher() {
        return this.instrumentAccountSwitcher;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ EquityShareOrderDataState(com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration r52, com.robinhood.models.p320db.EquityOrderSide r53, com.robinhood.nbbo.models.p359db.NbboSummary r54, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent r55, com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher r56, java.util.List r57, boolean r58, com.robinhood.models.p320db.Account r59, com.robinhood.models.p320db.Instrument r60, com.robinhood.models.p320db.Quote r61, com.robinhood.models.p320db.Position r62, com.robinhood.models.p320db.InstrumentBuyingPower r63, java.util.List r64, boolean r65, com.robinhood.models.p320db.bonfire.WithholdingEstimatedAmount r66, boolean r67, com.robinhood.models.p320db.bonfire.WithholdingStatus r68, com.robinhood.models.api.ApiCollateral r69, com.robinhood.models.p320db.MarketHours r70, com.robinhood.models.p320db.MarketHours r71, java.lang.Boolean r72, com.robinhood.android.equity.validation.EquityOrderRequestInputs.StaticInputs r73, com.robinhood.android.equity.validation.EquityOrderContext r74, com.robinhood.android.equity.ordercheck.ValidationState r75, kotlin.Result r76, boolean r77, java.util.List r78, boolean r79, boolean r80, boolean r81, java.lang.Boolean r82, java.util.List r83, java.lang.String r84, microgram.android.Monitoring r85, com.robinhood.android.trading.contracts.EquityOrderFlowSource r86, com.robinhood.models.p320db.Order r87, java.util.List r88, com.robinhood.android.equities.taxlots.taxlotsmodelsapi.TaxLotSelectionType r89, com.robinhood.rosetta.common.Money r90, com.robinhood.rosetta.common.Money r91, boolean r92, boolean r93, kotlin.Result r94, java.util.List r95, int r96, boolean r97, int r98, int r99, kotlin.jvm.internal.DefaultConstructorMarker r100) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.trade.equity.p261ui.share.EquityShareOrderDataState.<init>(com.robinhood.android.trading.contracts.configuration.ShareBasedOrderConfiguration, com.robinhood.models.db.EquityOrderSide, com.robinhood.nbbo.models.db.NbboSummary, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent, com.robinhood.models.db.bonfire.instrument.InstrumentAccountSwitcher, java.util.List, boolean, com.robinhood.models.db.Account, com.robinhood.models.db.Instrument, com.robinhood.models.db.Quote, com.robinhood.models.db.Position, com.robinhood.models.db.InstrumentBuyingPower, java.util.List, boolean, com.robinhood.models.db.bonfire.WithholdingEstimatedAmount, boolean, com.robinhood.models.db.bonfire.WithholdingStatus, com.robinhood.models.api.ApiCollateral, com.robinhood.models.db.MarketHours, com.robinhood.models.db.MarketHours, java.lang.Boolean, com.robinhood.android.equity.validation.EquityOrderRequestInputs$StaticInputs, com.robinhood.android.equity.validation.EquityOrderContext, com.robinhood.android.equity.ordercheck.ValidationState, kotlin.Result, boolean, java.util.List, boolean, boolean, boolean, java.lang.Boolean, java.util.List, java.lang.String, microgram.android.MicrogramState, com.robinhood.android.trading.contracts.EquityOrderFlowSource, com.robinhood.models.db.Order, java.util.List, com.robinhood.android.equities.taxlots.taxlotsmodelsapi.TaxLotSelectionType, com.robinhood.rosetta.common.Money, com.robinhood.rosetta.common.Money, boolean, boolean, kotlin.Result, java.util.List, int, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
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

    public final Quote getQuote() {
        return this.quote;
    }

    public final Position getPosition() {
        return this.position;
    }

    public final InstrumentBuyingPower getInstrumentBuyingPower() {
        return this.instrumentBuyingPower;
    }

    public final List<KaizenExperiment> getExperiments() {
        return this.experiments;
    }

    public final boolean isBackupWithheld() {
        return this.isBackupWithheld;
    }

    public final WithholdingEstimatedAmount getBackupWithholdingEstimateAmountResponse() {
        return this.backupWithholdingEstimateAmountResponse;
    }

    public final boolean getMlpExperimentMember() {
        return this.mlpExperimentMember;
    }

    public final WithholdingStatus getWithholdingStatus() {
        return this.withholdingStatus;
    }

    public final ApiCollateral getCollateral() {
        return this.collateral;
    }

    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final MarketHours getNextEffectiveMarketHours() {
        return this.nextEffectiveMarketHours;
    }

    public final Boolean isAdtHours() {
        return this.isAdtHours;
    }

    public final EquityOrderRequestInputs.StaticInputs getStaticInputs() {
        return this.staticInputs;
    }

    public final EquityOrderContext getEquityOrderContext() {
        return this.equityOrderContext;
    }

    public final ValidationState getValidationState() {
        return this.validationState;
    }

    /* renamed from: getEstimatedFees-xLWZpok, reason: not valid java name */
    public final Result<ApiEstimatedFees> m19350getEstimatedFeesxLWZpok() {
        return this.estimatedFees;
    }

    public final boolean getOverrideToExecuteInMarketHoursOnly() {
        return this.overrideToExecuteInMarketHoursOnly;
    }

    public final List<String> getCheckOverrides() {
        return this.checkOverrides;
    }

    public final boolean isCancelPendingCryptoOrdersLoading() {
        return this.isCancelPendingCryptoOrdersLoading;
    }

    public final boolean getLoadingNbbo() {
        return this.loadingNbbo;
    }

    public final boolean getOverrideFlipIpoAccessShares() {
        return this.overrideFlipIpoAccessShares;
    }

    public final Boolean isMarketBuysEnabled() {
        return this.isMarketBuysEnabled;
    }

    public final List<GenericOrderCheckAction> getSilentActionsTaken() {
        return this.silentActionsTaken;
    }

    public final String getMicrogramOrderSummary() {
        return this.microgramOrderSummary;
    }

    public final Monitoring getMicrogramState() {
        return this.microgramState;
    }

    public final EquityOrderFlowSource getFlowSource() {
        return this.flowSource;
    }

    public final Order getOrderPendingReplacement() {
        return this.orderPendingReplacement;
    }

    public final List<TaxLotSelection> getTaxLotsSelection() {
        return this.taxLotsSelection;
    }

    public final TaxLotSelectionType getTaxLotSelectionType() {
        return this.taxLotSelectionType;
    }

    public final Money getTaxLotsEstCredit() {
        return this.taxLotsEstCredit;
    }

    public final Money getTaxLotsGainLoss() {
        return this.taxLotsGainLoss;
    }

    public final boolean getTaxLotsM1ExperimentMember() {
        return this.taxLotsM1ExperimentMember;
    }

    public final boolean getSubzeroEnabled() {
        return this.subzeroEnabled;
    }

    /* renamed from: getShortingInfo-xLWZpok, reason: not valid java name */
    public final Result<ShortingInfo> m19351getShortingInfoxLWZpok() {
        return this.shortingInfo;
    }

    public final List<Account> getMarginAccounts() {
        return this.marginAccounts;
    }

    public final int getResetTooltipKey() {
        return this.resetTooltipKey;
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

    private final BigDecimal getStopPrice() {
        ShareBasedOrderConfiguration shareBasedOrderConfiguration = this.configuration;
        DirectOrder8 directOrder8 = shareBasedOrderConfiguration instanceof DirectOrder8 ? (DirectOrder8) shareBasedOrderConfiguration : null;
        if (directOrder8 != null) {
            return directOrder8.getStopPrice();
        }
        return null;
    }

    public final com.robinhood.models.util.Money getLastTradePrice() {
        Quote quote = this.quote;
        if (quote != null) {
            return quote.getLastTradePrice();
        }
        return null;
    }

    public final OrderPositionEffect getPositionEffect() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.side.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return OrderPositionEffect.CLOSE;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return OrderPositionEffect.OPEN;
        }
        Position position = this.position;
        if (position != null && Position5.isShortPosition(position) && this.subzeroEnabled) {
            return OrderPositionEffect.CLOSE;
        }
        return OrderPositionEffect.OPEN;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EquityOrderRequestInputs getRequestInputs() {
        EquityOrderRequestInputs.StaticInputs staticInputs;
        BigDecimal totalFeesAndTaxes;
        List<ApiFeeItem> fees;
        Account account = this.account;
        BigDecimal fee = null;
        if (account == null || this.instrument == null || (staticInputs = this.staticInputs) == null) {
            return null;
        }
        String accountNumber = account.getAccountNumber();
        Order order = this.orderPendingReplacement;
        UUID id = order != null ? order.getId() : null;
        BigDecimal limitPrice = EquityOrderConfiguration3.getLimitPrice(this.configuration);
        boolean z = this.overrideFlipIpoAccessShares;
        boolean z2 = this.overrideToExecuteInMarketHoursOnly;
        OrderMarketHours overrideMarketHours = EquityOrderConfiguration3.getOverrideMarketHours(this.configuration);
        List<String> list = this.checkOverrides;
        OrderRequest2 quantityOrAmount$feature_trade_equity_externalDebug = getQuantityOrAmount$feature_trade_equity_externalDebug();
        BigDecimal stopPrice = getStopPrice();
        BigDecimal trailAmount = EquityOrderConfiguration3.getTrailAmount(this.configuration);
        Integer trailPercentage = EquityOrderConfiguration3.getTrailPercentage(this.configuration);
        BigDecimal presetPercentLimit = EquityOrderConfiguration3.getPresetPercentLimit(this.configuration);
        OrderTimeInForce timeInForce = this.configuration.getTimeInForce();
        Intrinsics.checkNotNull(timeInForce);
        Order.Configuration orderConfiguration = this.configuration.getOrderConfiguration();
        Result<ApiEstimatedFees> result = this.estimatedFees;
        if (result != null) {
            Object value = result.getValue();
            if (Result.m28555isFailureimpl(value)) {
                value = null;
            }
            ApiEstimatedFees apiEstimatedFees = (ApiEstimatedFees) value;
            totalFeesAndTaxes = apiEstimatedFees != null ? apiEstimatedFees.getTotalFeesAndTaxes() : null;
        }
        Result<ApiEstimatedFees> result2 = this.estimatedFees;
        if (result2 != null) {
            Object value2 = result2.getValue();
            if (Result.m28555isFailureimpl(value2)) {
                value2 = null;
            }
            ApiEstimatedFees apiEstimatedFees2 = (ApiEstimatedFees) value2;
            fees = apiEstimatedFees2 != null ? apiEstimatedFees2.getFees() : null;
        }
        Result<ShortingInfo> result3 = this.shortingInfo;
        if (result3 != null) {
            Object value3 = result3.getValue();
            if (Result.m28555isFailureimpl(value3)) {
                value3 = null;
            }
            ShortingInfo shortingInfo = (ShortingInfo) value3;
            if (shortingInfo != null) {
                fee = shortingInfo.getFee();
            }
        }
        return new EquityOrderRequestInputs(staticInputs, accountNumber, id, limitPrice, z, z2, overrideMarketHours, list, quantityOrAmount$feature_trade_equity_externalDebug, stopPrice, trailAmount, trailPercentage, presetPercentLimit, timeInForce, orderConfiguration, totalFeesAndTaxes, fees, fee, Intrinsics.areEqual(this.isMarketBuysEnabled, Boolean.TRUE), this.taxLotSelectionType, this.taxLotsSelection, getPositionEffect(), this.subzeroEnabled);
    }

    public final boolean getLoading() {
        return this.validationState instanceof ValidationState.Validating;
    }

    public final DefaultOrderState getFormState() {
        if (this.validationState instanceof ValidationState.Validated) {
            return DefaultOrderState.REVIEWING;
        }
        return DefaultOrderState.EDITING;
    }

    public final boolean getReviewing() {
        return getFormState().getIsReviewingState();
    }

    public final OrderRequest2 getQuantityOrAmount$feature_trade_equity_externalDebug() {
        return new OrderRequest2.ShareQuantity(BigDecimals7.orZero(this.configuration.getShareQuantity()));
    }

    /* renamed from: getTwentyFourHourMarketRoundedShareQuantity$feature_trade_equity_externalDebug */
    public final Integer m2497xe1ff29cc() {
        BigDecimal scale;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        BigDecimal shareQuantity = this.configuration.getShareQuantity();
        if (shareQuantity == null || (scale = shareQuantity.setScale(0, RoundingMode.FLOOR)) == null || (bigDecimal = (BigDecimal) ComparisonsKt.maxOf(new BigDecimal(1), scale)) == null || (bigDecimal2 = (BigDecimal) ComparisonsKt.minOf(new BigDecimal(3000000), bigDecimal)) == null) {
            return null;
        }
        return Integer.valueOf(BigDecimals7.toIntRoundDown(bigDecimal2));
    }

    public final boolean getShouldShowBackupWithholdingWarning() {
        return this.isBackupWithheld && this.side.isSell() && !getReviewing();
    }

    public final boolean getShouldShowBackupWithholdingEstimate() {
        return this.isBackupWithheld && this.side.isSell() && getReviewing() && getBackupWithholdingEstimateAmount() != null;
    }

    public final String getBackupWithholdingEstimateAmount() {
        com.robinhood.models.util.Money amount;
        Money.Adjustment debitAdjustment;
        WithholdingEstimatedAmount withholdingEstimatedAmount = this.backupWithholdingEstimateAmountResponse;
        if (withholdingEstimatedAmount == null || (amount = withholdingEstimatedAmount.getAmount()) == null || (debitAdjustment = amount.toDebitAdjustment()) == null) {
            return null;
        }
        return Money.Adjustment.format$default(debitAdjustment, false, null, 3, null);
    }

    public final StringResource getAccountNameTitle() {
        DisplayName displayName;
        DisplayName.Variants withInvesting;
        Account account = this.account;
        if (account == null || (displayName = AccountDisplayNames.getDisplayName(account)) == null || (withInvesting = displayName.getWithInvesting()) == null) {
            return null;
        }
        return withInvesting.getTitle();
    }

    public final StringResource getAccountNameSubtitle() {
        Account account = this.account;
        if (account == null || !account.getHasNickname()) {
            return null;
        }
        return AccountDisplayNames.getDisplayNameWithoutNickname(this.account).getShort().getTitle();
    }

    public final boolean getShouldShowAccountSwitcher() {
        return this.side == EquityOrderSide.SELL_SHORT ? this.marginAccounts.size() > 1 : this.allAccounts.size() > 1;
    }

    public final InstrumentAccountSwitcherState getAccountSwitcherState() {
        return InstrumentAccountSwitcherUtils.INSTANCE.makeAccountSwitcherState(this.instrumentAccountSwitcher, this.allAccounts, isCancelNew(), this.side, getPositionEffect(), getAccountNumber(), this.loadingAccountSwitcher, this.useSduiAccountSwitcher);
    }

    public final boolean getShowTwentyFourHourMarketButton() {
        ShareBasedOrderConfiguration shareBasedOrderConfiguration = this.configuration;
        if ((!(shareBasedOrderConfiguration instanceof ShareMarket) && !(shareBasedOrderConfiguration instanceof ShareSimpleLimit)) || isSellingLessThanOneShare$feature_trade_equity_externalDebug()) {
            return false;
        }
        Boolean bool = this.isAdtHours;
        Boolean bool2 = Boolean.TRUE;
        return Intrinsics.areEqual(bool, bool2) && Intrinsics.areEqual(CheckAdtTradability.checkAdtTradability(this.instrument, this.account, this.side), bool2);
    }

    public final boolean isSellingLessThanOneShare$feature_trade_equity_externalDebug() {
        if (this.side != EquityOrderSide.SELL) {
            return false;
        }
        Position position = this.position;
        return (position != null ? position.getClosableQuantity() : null) != null && this.position.getClosableQuantity().compareTo(BigDecimal.ONE) < 0;
    }

    public final boolean isShortPosition$feature_trade_equity_externalDebug() {
        Position position = this.position;
        return position != null && Position5.isShortPosition(position);
    }

    public final boolean getShowTwentyFourHourMarketDialog() {
        BigDecimal shareQuantity;
        return (!getShowTwentyFourHourMarketButton() || (shareQuantity = this.configuration.getShareQuantity()) == null || BigDecimals7.isInteger(shareQuantity)) ? false : true;
    }

    public final boolean getShowLimitOrdersOnlyDialog() {
        return this.quote == null && (this.configuration instanceof ShareLimit);
    }

    public final StringResource getSellAllButtonLabelStringResource() {
        String symbol;
        EquityOrderContext equityOrderContext = this.equityOrderContext;
        if (equityOrderContext != null && equityOrderContext.isSell() && (equityOrderContext.getConfiguration() == Order.Configuration.MARKET || equityOrderContext.getConfiguration() == Order.Configuration.SIMPLE_LIMIT)) {
            Position position = this.position;
            if (!BigDecimals7.isZero(position != null ? position.getClosableQuantity() : null)) {
                StringResource.Companion companion = StringResource.INSTANCE;
                int i = C29365R.string.order_create_sell_all_button_label;
                Instrument instrument = this.instrument;
                if (instrument == null || (symbol = instrument.getSymbol()) == null) {
                    symbol = "";
                }
                return companion.invoke(i, symbol);
            }
        }
        return null;
    }

    public final StringResource getBuyingPowerAvailableStringResource() {
        EquityOrderContext equityOrderContext = this.equityOrderContext;
        if (equityOrderContext != null) {
            return equityOrderContext.getAvailableText(this.instrumentBuyingPower, this.orderPendingReplacement);
        }
        return null;
    }

    public final StringResource getSubzeroDescriptionStringResource() {
        OrderCreateDescriptionTextUtil orderCreateDescriptionTextUtil = OrderCreateDescriptionTextUtil.INSTANCE;
        Position position = this.position;
        EquityOrderSide equityOrderSide = this.side;
        ShareBasedOrderConfiguration shareBasedOrderConfiguration = this.configuration;
        InstrumentBuyingPower instrumentBuyingPower = this.instrumentBuyingPower;
        Account account = this.account;
        Instrument instrument = this.instrument;
        Order order = this.orderPendingReplacement;
        OrderPositionEffect positionEffect = getPositionEffect();
        if (!this.subzeroEnabled) {
            positionEffect = null;
        }
        StringResource descriptionText = orderCreateDescriptionTextUtil.getDescriptionText(position, equityOrderSide, positionEffect, false, shareBasedOrderConfiguration, instrumentBuyingPower, account, instrument, order);
        EquityOrderSide equityOrderSide2 = this.side;
        if ((equityOrderSide2 == EquityOrderSide.SELL_SHORT || (equityOrderSide2 == EquityOrderSide.BUY && this.subzeroEnabled && getPositionEffect() == OrderPositionEffect.CLOSE)) && this.marginAccounts.size() == 1) {
            return descriptionText;
        }
        return null;
    }

    public final StringResource getAvailableSharesForBuyStringResource() {
        EquityOrderContext equityOrderContext;
        OrderCreateDescriptionTextUtil orderCreateDescriptionTextUtil = OrderCreateDescriptionTextUtil.INSTANCE;
        Position position = this.position;
        InstrumentBuyingPower instrumentBuyingPower = this.instrumentBuyingPower;
        Account account = this.account;
        Instrument instrument = this.instrument;
        EquityOrderSide equityOrderSide = this.side;
        Order order = this.orderPendingReplacement;
        ShareBasedOrderConfiguration shareBasedOrderConfiguration = this.configuration;
        OrderPositionEffect positionEffect = getPositionEffect();
        if (!this.subzeroEnabled) {
            positionEffect = null;
        }
        StringResource descriptionText = orderCreateDescriptionTextUtil.getDescriptionText(position, equityOrderSide, positionEffect, false, shareBasedOrderConfiguration, instrumentBuyingPower, account, instrument, order);
        Position position2 = this.position;
        if (position2 == null || !Position5.isShortPosition(position2) || (equityOrderContext = this.equityOrderContext) == null || !equityOrderContext.isBuy()) {
            return null;
        }
        return descriptionText;
    }

    public final boolean isCancelNew() {
        return this.orderPendingReplacement != null;
    }

    private final BigDecimal getTaxLotsNumSelectedShares() {
        BigDecimal ZERO;
        List<TaxLotSelection> list = this.taxLotsSelection;
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        for (Object obj : list) {
            Intrinsics.checkNotNull(bigDecimalAdd);
            String shares = ((TaxLotSelection) obj).getShares();
            if (shares == null || (ZERO = StringsKt.toBigDecimalOrNull(shares)) == null) {
                ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            }
            bigDecimalAdd = bigDecimalAdd.add(ZERO);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        }
        Intrinsics.checkNotNull(bigDecimalAdd);
        return bigDecimalAdd;
    }

    public final StringResource getTaxLotsGainLossStringResource() {
        return TaxLotsStringsHelper.INSTANCE.getGainLossStringResource(getTaxLotsNumSelectedShares(), this.taxLotsGainLoss);
    }

    public final StringResource getTaxLotsTermStringResource() {
        return TaxLotsStringsHelper.INSTANCE.getTermStringResource(getTaxLotsNumSelectedShares(), this.taxLotsSelection);
    }

    public final StringResource getTaxLotsEstCreditStringResource() {
        return TaxLotsStringsHelper.INSTANCE.getEstCreditStringResource(this.taxLotsEstCredit);
    }

    public final StringResource getTaxLotsM1SecondaryStringResource() {
        StringResource taxLotsTermStringResource;
        StringResource taxLotsGainLossStringResource;
        if (!this.taxLotsM1ExperimentMember || (taxLotsTermStringResource = getTaxLotsTermStringResource()) == null || (taxLotsGainLossStringResource = getTaxLotsGainLossStringResource()) == null) {
            return null;
        }
        return new StringResource.Join(CollectionsKt.listOf((Object[]) new StringResource[]{taxLotsTermStringResource, taxLotsGainLossStringResource}), " · ");
    }

    /* compiled from: EquityShareOrderDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState$Companion;", "", "<init>", "()V", "initialState", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;", "accountNumber", "", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "orderSide", "Lcom/robinhood/models/db/EquityOrderSide;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final EquityShareOrderDataState initialState(String accountNumber, EquityOrderFlowSource flowSource, EquityOrderSide orderSide) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            return new EquityShareOrderDataState(new ShareMarket.New(accountNumber, null, 2, 0 == true ? 1 : 0), orderSide, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, false, null, false, false, false, null, null, null, null, flowSource, null, null, null, null, null, false, false, null, null, 0, false, -4, 16379, null);
        }
    }
}
