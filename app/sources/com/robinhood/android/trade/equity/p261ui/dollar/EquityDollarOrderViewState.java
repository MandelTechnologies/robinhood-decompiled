package com.robinhood.android.trade.equity.p261ui.dollar;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.android.nbbo.p197ui.NbboSpanBuilders;
import com.robinhood.android.tickerinputview.CharArrays;
import com.robinhood.android.trade.equity.util.BigDecimals4;
import com.robinhood.android.trade.equity.util.EquityOrderContextHolder;
import com.robinhood.android.trade.equity.util.Moneys2;
import com.robinhood.android.trade.equity.util.OrderRequests;
import com.robinhood.android.trade.equity.util.WithholdingStatuses;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.configuration.DollarBased;
import com.robinhood.android.trading.contracts.configuration.DollarBased3;
import com.robinhood.android.trading.contracts.configuration.DollarBased5;
import com.robinhood.models.api.ApiQuickTradeAmounts;
import com.robinhood.models.api.OrderRequest2;
import com.robinhood.models.api.bonfire.instrument.InstrumentAccountSwitcherType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.models.p320db.bonfire.WithholdingStatus;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.util.Money;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.noties.markwon.Markwon;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import microgram.android.Monitoring;

/* compiled from: EquityDollarOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BË\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0012\u0012\b\b\u0002\u0010\"\u001a\u00020\t\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\t\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010(\u001a\u00020\t\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u00101\u001a\u00020\t\u0012\b\b\u0002\u00102\u001a\u00020\t¢\u0006\u0004\b3\u00104J1\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u00012\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012\b\u0010\u0088\u0001\u001a\u00030\u0089\u00012\u0011\b\u0002\u0010\u008a\u0001\u001a\n\u0012\u0005\u0012\u00030\u008c\u00010\u008b\u0001J\u0013\u0010\u008f\u0001\u001a\u0004\u0018\u00010!2\b\u0010\u0090\u0001\u001a\u00030\u0091\u0001J\n\u0010\u009a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\n\u0010\u009d\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\tHÂ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u000eHÂ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0010\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\n\u0010£\u0001\u001a\u00020\tHÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0017HÂ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u001bHÂ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u001dHÂ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u0010\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u00020!0\u0012HÆ\u0003J\n\u0010«\u0001\u001a\u00020\tHÆ\u0003J\u0012\u0010¬\u0001\u001a\u0004\u0018\u00010$HÀ\u0003¢\u0006\u0003\b\u00ad\u0001J\n\u0010®\u0001\u001a\u00020\tHÂ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010'HÂ\u0003J\n\u0010°\u0001\u001a\u00020\tHÂ\u0003J\u0012\u0010±\u0001\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010!HÂ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u000100HÂ\u0003J\n\u0010µ\u0001\u001a\u00020\tHÆ\u0003J\n\u0010¶\u0001\u001a\u00020\tHÆ\u0003JÒ\u0002\u0010·\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00122\b\b\u0002\u0010\"\u001a\u00020\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\t2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020\t2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\b\b\u0002\u00101\u001a\u00020\t2\b\b\u0002\u00102\u001a\u00020\tHÆ\u0001J\u0016\u0010¸\u0001\u001a\u00020\t2\n\u0010¹\u0001\u001a\u0005\u0018\u00010º\u0001HÖ\u0003J\u000b\u0010»\u0001\u001a\u00030¼\u0001HÖ\u0001J\n\u0010½\u0001\u001a\u00020!HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u00109R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0014\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b@\u00109R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0012¢\u0006\b\n\u0000\u001a\u0004\bG\u0010?R\u0011\u0010\"\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u00109R\u0018\u0010#\u001a\u0004\u0018\u00010$8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u000e\u0010%\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0016\u0010,\u001a\u0004\u0018\u00010-X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0010\u0010.\u001a\u0004\u0018\u00010!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u00101\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bN\u00109R\u0011\u00102\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bO\u00109R\u0014\u0010P\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u00109R\u0011\u0010Q\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bR\u00109R\u0013\u0010S\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010V\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0011\u0010Y\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bZ\u0010UR\u0013\u0010[\u001a\u0004\u0018\u00010\\8F¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0011\u0010_\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b_\u00109R\u0011\u0010`\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\ba\u00109R\u0011\u0010b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bc\u00109R\u0014\u0010d\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u00109R\u0011\u0010f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bf\u00109R\u0013\u0010g\u001a\u0004\u0018\u00010h8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0019\u0010k\u001a\n\u0012\u0004\u0012\u00020l\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\bm\u0010?R\u0011\u0010n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bo\u00109R\u0011\u0010p\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bq\u00109R\u0011\u0010r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bs\u00109R\u0011\u0010t\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bu\u00109R\u0011\u0010v\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bw\u00109R\u0011\u0010x\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\by\u00109R\u0013\u0010z\u001a\u0004\u0018\u00010{8F¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0013\u0010~\u001a\u00020\u007f8F¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u007f8F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0081\u0001R\u0016\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u007f8F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u0081\u0001R!\u0010\u0092\u0001\u001a\u000f\u0012\n\u0012\b0\u0094\u0001j\u0003`\u0095\u00010\u0093\u00018F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0016\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u007f¢\u0006\n\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u0081\u0001¨\u0006¾\u0001"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderViewState;", "Lcom/robinhood/android/trade/equity/util/EquityOrderContextHolder;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;", "quantityOrAmount", "Lcom/robinhood/models/api/QuantityOrAmount;", "overrideCharArray", "", "isReviewButtonLoading", "", "formState", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "loadingNbbo", "apiQuickTradeAmounts", "Lcom/robinhood/models/api/ApiQuickTradeAmounts;", "instrumentAccountSwitcher", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;", "allAccounts", "", "Lcom/robinhood/models/db/Account;", "loadingAccountSwitcher", "account", "instrument", "Lcom/robinhood/models/db/Instrument;", "tradingSession", "Lcom/robinhood/models/db/TradingSession;", "position", "Lcom/robinhood/models/db/Position;", "quote", "Lcom/robinhood/models/db/Quote;", "nbboSummary", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "checkOverrides", "", "isCancelPendingCryptoOrdersLoading", "staticInputs", "Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;", "isBackupWithheld", "withholdingStatus", "Lcom/robinhood/models/db/bonfire/WithholdingStatus;", "mlpExperimentMember", "sessionChangeAlertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "equityOrderContext", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "microgramOrderSummary", "microgramState", "Lmicrogram/android/MicrogramState;", "hasSalesTaxes", "useSduiAccountSwitcher", "<init>", "(Lcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;Lcom/robinhood/models/api/QuantityOrAmount;[CZLcom/robinhood/android/lib/trade/DefaultOrderState;ZLcom/robinhood/models/api/ApiQuickTradeAmounts;Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;Ljava/util/List;ZLcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/TradingSession;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/Quote;Lcom/robinhood/nbbo/models/db/NbboSummary;Ljava/util/List;ZLcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;ZLcom/robinhood/models/db/bonfire/WithholdingStatus;ZLcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/android/equity/validation/EquityOrderContext;Ljava/lang/String;Lmicrogram/android/MicrogramState;ZZ)V", "getConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/DollarBasedOrderConfiguration;", "getQuantityOrAmount", "()Lcom/robinhood/models/api/QuantityOrAmount;", "()Z", "getFormState", "()Lcom/robinhood/android/lib/trade/DefaultOrderState;", "getInstrumentAccountSwitcher", "()Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;", "getAllAccounts", "()Ljava/util/List;", "getLoadingAccountSwitcher", "getAccount", "()Lcom/robinhood/models/db/Account;", "getTradingSession", "()Lcom/robinhood/models/db/TradingSession;", "getNbboSummary", "()Lcom/robinhood/nbbo/models/db/NbboSummary;", "getCheckOverrides", "getStaticInputs$feature_trade_equity_externalDebug", "()Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;", "getSessionChangeAlertContent", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "getEquityOrderContext", "()Lcom/robinhood/android/equity/validation/EquityOrderContext;", "getHasSalesTaxes", "getUseSduiAccountSwitcher", "isMicrogramReady", "useMicrogramOrderSummary", "getUseMicrogramOrderSummary", "accountNumber", "getAccountNumber", "()Ljava/lang/String;", "amountCharArray", "getAmountCharArray", "()[C", "orderDetailsContentDescription", "getOrderDetailsContentDescription", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "isPresetPercentLimitOrder", "hasUserEnteredValue", "getHasUserEnteredValue", "canShowReviewButton", "getCanShowReviewButton", "shouldShowQuickTradeAmounts", "getShouldShowQuickTradeAmounts", "isQuickTradeAvailable", "shareQuantity", "Ljava/math/BigDecimal;", "getShareQuantity", "()Ljava/math/BigDecimal;", "quickTradeAmounts", "Lcom/robinhood/models/util/Money;", "getQuickTradeAmounts", "shouldShowSellAllTextButton", "getShouldShowSellAllTextButton", "canShowQuickTradeSellAll", "getCanShowQuickTradeSellAll", "reviewing", "getReviewing", "shouldShowBackupWithholdingWarning", "getShouldShowBackupWithholdingWarning", "reviewOrderBtnEnabled", "getReviewOrderBtnEnabled", "shouldShowAccountSwitcher", "getShouldShowAccountSwitcher", "accountSwitcherState", "Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "getAccountSwitcherState", "()Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "orderCreditText", "Lcom/robinhood/utils/resource/StringResource;", "getOrderCreditText", "()Lcom/robinhood/utils/resource/StringResource;", "orderAccountLabelText", "getOrderAccountLabelText", "getOrderReviewText", "", "markwon", "Lio/noties/markwon/Markwon;", ResourceTypes.DRAWABLE, "Landroid/graphics/drawable/Drawable;", "refreshAction", "Lkotlin/Function0;", "", "actionOrderTypeText", "getActionOrderTypeText", "getActionOrderLabelText", "resources", "Landroid/content/res/Resources;", "loggingEquityOrderContext", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getLoggingEquityOrderContext", "()Lcom/robinhood/utils/Optional;", "withholdingWarningString", "getWithholdingWarningString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component19$feature_trade_equity_externalDebug", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class EquityDollarOrderViewState implements EquityOrderContextHolder {
    public static final int $stable = 8;
    private final Account account;
    private final List<Account> allAccounts;
    private final ApiQuickTradeAmounts apiQuickTradeAmounts;
    private final boolean canShowQuickTradeSellAll;
    private final List<String> checkOverrides;
    private final DollarBased configuration;
    private final EquityOrderContext equityOrderContext;
    private final DefaultOrderState formState;
    private final boolean hasSalesTaxes;
    private final Instrument instrument;
    private final InstrumentAccountSwitcher instrumentAccountSwitcher;
    private final boolean isBackupWithheld;
    private final boolean isCancelPendingCryptoOrdersLoading;
    private final boolean isReviewButtonLoading;
    private final boolean loadingAccountSwitcher;
    private final boolean loadingNbbo;
    private final String microgramOrderSummary;
    private final Monitoring microgramState;
    private final boolean mlpExperimentMember;
    private final NbboSummary nbboSummary;
    private final char[] overrideCharArray;
    private final Position position;
    private final OrderRequest2 quantityOrAmount;
    private final Quote quote;
    private final boolean reviewing;
    private final GenericAlertContent<GenericAction> sessionChangeAlertContent;
    private final EquityOrderRequestInputs.StaticInputs staticInputs;
    private final TradingSession tradingSession;
    private final boolean useSduiAccountSwitcher;
    private final WithholdingStatus withholdingStatus;
    private final StringResource withholdingWarningString;

    /* compiled from: EquityDollarOrderViewState.kt */
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

    /* renamed from: component12, reason: from getter */
    private final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component14, reason: from getter */
    private final Position getPosition() {
        return this.position;
    }

    /* renamed from: component15, reason: from getter */
    private final Quote getQuote() {
        return this.quote;
    }

    /* renamed from: component20, reason: from getter */
    private final boolean getIsBackupWithheld() {
        return this.isBackupWithheld;
    }

    /* renamed from: component21, reason: from getter */
    private final WithholdingStatus getWithholdingStatus() {
        return this.withholdingStatus;
    }

    /* renamed from: component22, reason: from getter */
    private final boolean getMlpExperimentMember() {
        return this.mlpExperimentMember;
    }

    /* renamed from: component25, reason: from getter */
    private final String getMicrogramOrderSummary() {
        return this.microgramOrderSummary;
    }

    /* renamed from: component26, reason: from getter */
    private final Monitoring getMicrogramState() {
        return this.microgramState;
    }

    /* renamed from: component3, reason: from getter */
    private final char[] getOverrideCharArray() {
        return this.overrideCharArray;
    }

    /* renamed from: component6, reason: from getter */
    private final boolean getLoadingNbbo() {
        return this.loadingNbbo;
    }

    /* renamed from: component7, reason: from getter */
    private final ApiQuickTradeAmounts getApiQuickTradeAmounts() {
        return this.apiQuickTradeAmounts;
    }

    public static /* synthetic */ EquityDollarOrderViewState copy$default(EquityDollarOrderViewState equityDollarOrderViewState, DollarBased dollarBased, OrderRequest2 orderRequest2, char[] cArr, boolean z, DefaultOrderState defaultOrderState, boolean z2, ApiQuickTradeAmounts apiQuickTradeAmounts, InstrumentAccountSwitcher instrumentAccountSwitcher, List list, boolean z3, Account account, Instrument instrument, TradingSession tradingSession, Position position, Quote quote, NbboSummary nbboSummary, List list2, boolean z4, EquityOrderRequestInputs.StaticInputs staticInputs, boolean z5, WithholdingStatus withholdingStatus, boolean z6, GenericAlertContent genericAlertContent, EquityOrderContext equityOrderContext, String str, Monitoring monitoring, boolean z7, boolean z8, int i, Object obj) {
        boolean z9;
        boolean z10;
        DollarBased dollarBased2 = (i & 1) != 0 ? equityDollarOrderViewState.configuration : dollarBased;
        OrderRequest2 orderRequest22 = (i & 2) != 0 ? equityDollarOrderViewState.quantityOrAmount : orderRequest2;
        char[] cArr2 = (i & 4) != 0 ? equityDollarOrderViewState.overrideCharArray : cArr;
        boolean z11 = (i & 8) != 0 ? equityDollarOrderViewState.isReviewButtonLoading : z;
        DefaultOrderState defaultOrderState2 = (i & 16) != 0 ? equityDollarOrderViewState.formState : defaultOrderState;
        boolean z12 = (i & 32) != 0 ? equityDollarOrderViewState.loadingNbbo : z2;
        ApiQuickTradeAmounts apiQuickTradeAmounts2 = (i & 64) != 0 ? equityDollarOrderViewState.apiQuickTradeAmounts : apiQuickTradeAmounts;
        InstrumentAccountSwitcher instrumentAccountSwitcher2 = (i & 128) != 0 ? equityDollarOrderViewState.instrumentAccountSwitcher : instrumentAccountSwitcher;
        List list3 = (i & 256) != 0 ? equityDollarOrderViewState.allAccounts : list;
        boolean z13 = (i & 512) != 0 ? equityDollarOrderViewState.loadingAccountSwitcher : z3;
        Account account2 = (i & 1024) != 0 ? equityDollarOrderViewState.account : account;
        Instrument instrument2 = (i & 2048) != 0 ? equityDollarOrderViewState.instrument : instrument;
        TradingSession tradingSession2 = (i & 4096) != 0 ? equityDollarOrderViewState.tradingSession : tradingSession;
        Position position2 = (i & 8192) != 0 ? equityDollarOrderViewState.position : position;
        DollarBased dollarBased3 = dollarBased2;
        Quote quote2 = (i & 16384) != 0 ? equityDollarOrderViewState.quote : quote;
        NbboSummary nbboSummary2 = (i & 32768) != 0 ? equityDollarOrderViewState.nbboSummary : nbboSummary;
        List list4 = (i & 65536) != 0 ? equityDollarOrderViewState.checkOverrides : list2;
        boolean z14 = (i & 131072) != 0 ? equityDollarOrderViewState.isCancelPendingCryptoOrdersLoading : z4;
        EquityOrderRequestInputs.StaticInputs staticInputs2 = (i & 262144) != 0 ? equityDollarOrderViewState.staticInputs : staticInputs;
        boolean z15 = (i & 524288) != 0 ? equityDollarOrderViewState.isBackupWithheld : z5;
        WithholdingStatus withholdingStatus2 = (i & 1048576) != 0 ? equityDollarOrderViewState.withholdingStatus : withholdingStatus;
        boolean z16 = (i & 2097152) != 0 ? equityDollarOrderViewState.mlpExperimentMember : z6;
        GenericAlertContent genericAlertContent2 = (i & 4194304) != 0 ? equityDollarOrderViewState.sessionChangeAlertContent : genericAlertContent;
        EquityOrderContext equityOrderContext2 = (i & 8388608) != 0 ? equityDollarOrderViewState.equityOrderContext : equityOrderContext;
        String str2 = (i & 16777216) != 0 ? equityDollarOrderViewState.microgramOrderSummary : str;
        Monitoring monitoring2 = (i & 33554432) != 0 ? equityDollarOrderViewState.microgramState : monitoring;
        boolean z17 = (i & 67108864) != 0 ? equityDollarOrderViewState.hasSalesTaxes : z7;
        if ((i & 134217728) != 0) {
            z10 = z17;
            z9 = equityDollarOrderViewState.useSduiAccountSwitcher;
        } else {
            z9 = z8;
            z10 = z17;
        }
        return equityDollarOrderViewState.copy(dollarBased3, orderRequest22, cArr2, z11, defaultOrderState2, z12, apiQuickTradeAmounts2, instrumentAccountSwitcher2, list3, z13, account2, instrument2, tradingSession2, position2, quote2, nbboSummary2, list4, z14, staticInputs2, z15, withholdingStatus2, z16, genericAlertContent2, equityOrderContext2, str2, monitoring2, z10, z9);
    }

    /* renamed from: component1, reason: from getter */
    public final DollarBased getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getLoadingAccountSwitcher() {
        return this.loadingAccountSwitcher;
    }

    /* renamed from: component11, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component13, reason: from getter */
    public final TradingSession getTradingSession() {
        return this.tradingSession;
    }

    /* renamed from: component16, reason: from getter */
    public final NbboSummary getNbboSummary() {
        return this.nbboSummary;
    }

    public final List<String> component17() {
        return this.checkOverrides;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsCancelPendingCryptoOrdersLoading() {
        return this.isCancelPendingCryptoOrdersLoading;
    }

    /* renamed from: component19$feature_trade_equity_externalDebug, reason: from getter */
    public final EquityOrderRequestInputs.StaticInputs getStaticInputs() {
        return this.staticInputs;
    }

    /* renamed from: component2, reason: from getter */
    public final OrderRequest2 getQuantityOrAmount() {
        return this.quantityOrAmount;
    }

    public final GenericAlertContent<GenericAction> component23() {
        return this.sessionChangeAlertContent;
    }

    /* renamed from: component24, reason: from getter */
    public final EquityOrderContext getEquityOrderContext() {
        return this.equityOrderContext;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getHasSalesTaxes() {
        return this.hasSalesTaxes;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getUseSduiAccountSwitcher() {
        return this.useSduiAccountSwitcher;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsReviewButtonLoading() {
        return this.isReviewButtonLoading;
    }

    /* renamed from: component5, reason: from getter */
    public final DefaultOrderState getFormState() {
        return this.formState;
    }

    /* renamed from: component8, reason: from getter */
    public final InstrumentAccountSwitcher getInstrumentAccountSwitcher() {
        return this.instrumentAccountSwitcher;
    }

    public final List<Account> component9() {
        return this.allAccounts;
    }

    public final EquityDollarOrderViewState copy(DollarBased configuration, OrderRequest2 quantityOrAmount, char[] overrideCharArray, boolean isReviewButtonLoading, DefaultOrderState formState, boolean loadingNbbo, ApiQuickTradeAmounts apiQuickTradeAmounts, InstrumentAccountSwitcher instrumentAccountSwitcher, List<Account> allAccounts, boolean loadingAccountSwitcher, Account account, Instrument instrument, TradingSession tradingSession, Position position, Quote quote, NbboSummary nbboSummary, List<String> checkOverrides, boolean isCancelPendingCryptoOrdersLoading, EquityOrderRequestInputs.StaticInputs staticInputs, boolean isBackupWithheld, WithholdingStatus withholdingStatus, boolean mlpExperimentMember, GenericAlertContent<? extends GenericAction> sessionChangeAlertContent, EquityOrderContext equityOrderContext, String microgramOrderSummary, Monitoring microgramState, boolean hasSalesTaxes, boolean useSduiAccountSwitcher) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(quantityOrAmount, "quantityOrAmount");
        Intrinsics.checkNotNullParameter(formState, "formState");
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
        return new EquityDollarOrderViewState(configuration, quantityOrAmount, overrideCharArray, isReviewButtonLoading, formState, loadingNbbo, apiQuickTradeAmounts, instrumentAccountSwitcher, allAccounts, loadingAccountSwitcher, account, instrument, tradingSession, position, quote, nbboSummary, checkOverrides, isCancelPendingCryptoOrdersLoading, staticInputs, isBackupWithheld, withholdingStatus, mlpExperimentMember, sessionChangeAlertContent, equityOrderContext, microgramOrderSummary, microgramState, hasSalesTaxes, useSduiAccountSwitcher);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityDollarOrderViewState)) {
            return false;
        }
        EquityDollarOrderViewState equityDollarOrderViewState = (EquityDollarOrderViewState) other;
        return Intrinsics.areEqual(this.configuration, equityDollarOrderViewState.configuration) && Intrinsics.areEqual(this.quantityOrAmount, equityDollarOrderViewState.quantityOrAmount) && Intrinsics.areEqual(this.overrideCharArray, equityDollarOrderViewState.overrideCharArray) && this.isReviewButtonLoading == equityDollarOrderViewState.isReviewButtonLoading && this.formState == equityDollarOrderViewState.formState && this.loadingNbbo == equityDollarOrderViewState.loadingNbbo && Intrinsics.areEqual(this.apiQuickTradeAmounts, equityDollarOrderViewState.apiQuickTradeAmounts) && Intrinsics.areEqual(this.instrumentAccountSwitcher, equityDollarOrderViewState.instrumentAccountSwitcher) && Intrinsics.areEqual(this.allAccounts, equityDollarOrderViewState.allAccounts) && this.loadingAccountSwitcher == equityDollarOrderViewState.loadingAccountSwitcher && Intrinsics.areEqual(this.account, equityDollarOrderViewState.account) && Intrinsics.areEqual(this.instrument, equityDollarOrderViewState.instrument) && Intrinsics.areEqual(this.tradingSession, equityDollarOrderViewState.tradingSession) && Intrinsics.areEqual(this.position, equityDollarOrderViewState.position) && Intrinsics.areEqual(this.quote, equityDollarOrderViewState.quote) && Intrinsics.areEqual(this.nbboSummary, equityDollarOrderViewState.nbboSummary) && Intrinsics.areEqual(this.checkOverrides, equityDollarOrderViewState.checkOverrides) && this.isCancelPendingCryptoOrdersLoading == equityDollarOrderViewState.isCancelPendingCryptoOrdersLoading && Intrinsics.areEqual(this.staticInputs, equityDollarOrderViewState.staticInputs) && this.isBackupWithheld == equityDollarOrderViewState.isBackupWithheld && Intrinsics.areEqual(this.withholdingStatus, equityDollarOrderViewState.withholdingStatus) && this.mlpExperimentMember == equityDollarOrderViewState.mlpExperimentMember && Intrinsics.areEqual(this.sessionChangeAlertContent, equityDollarOrderViewState.sessionChangeAlertContent) && Intrinsics.areEqual(this.equityOrderContext, equityDollarOrderViewState.equityOrderContext) && Intrinsics.areEqual(this.microgramOrderSummary, equityDollarOrderViewState.microgramOrderSummary) && Intrinsics.areEqual(this.microgramState, equityDollarOrderViewState.microgramState) && this.hasSalesTaxes == equityDollarOrderViewState.hasSalesTaxes && this.useSduiAccountSwitcher == equityDollarOrderViewState.useSduiAccountSwitcher;
    }

    public int hashCode() {
        int iHashCode = ((this.configuration.hashCode() * 31) + this.quantityOrAmount.hashCode()) * 31;
        char[] cArr = this.overrideCharArray;
        int iHashCode2 = (((((((iHashCode + (cArr == null ? 0 : Arrays.hashCode(cArr))) * 31) + Boolean.hashCode(this.isReviewButtonLoading)) * 31) + this.formState.hashCode()) * 31) + Boolean.hashCode(this.loadingNbbo)) * 31;
        ApiQuickTradeAmounts apiQuickTradeAmounts = this.apiQuickTradeAmounts;
        int iHashCode3 = (iHashCode2 + (apiQuickTradeAmounts == null ? 0 : apiQuickTradeAmounts.hashCode())) * 31;
        InstrumentAccountSwitcher instrumentAccountSwitcher = this.instrumentAccountSwitcher;
        int iHashCode4 = (((((iHashCode3 + (instrumentAccountSwitcher == null ? 0 : instrumentAccountSwitcher.hashCode())) * 31) + this.allAccounts.hashCode()) * 31) + Boolean.hashCode(this.loadingAccountSwitcher)) * 31;
        Account account = this.account;
        int iHashCode5 = (iHashCode4 + (account == null ? 0 : account.hashCode())) * 31;
        Instrument instrument = this.instrument;
        int iHashCode6 = (iHashCode5 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        TradingSession tradingSession = this.tradingSession;
        int iHashCode7 = (iHashCode6 + (tradingSession == null ? 0 : tradingSession.hashCode())) * 31;
        Position position = this.position;
        int iHashCode8 = (iHashCode7 + (position == null ? 0 : position.hashCode())) * 31;
        Quote quote = this.quote;
        int iHashCode9 = (iHashCode8 + (quote == null ? 0 : quote.hashCode())) * 31;
        NbboSummary nbboSummary = this.nbboSummary;
        int iHashCode10 = (((((iHashCode9 + (nbboSummary == null ? 0 : nbboSummary.hashCode())) * 31) + this.checkOverrides.hashCode()) * 31) + Boolean.hashCode(this.isCancelPendingCryptoOrdersLoading)) * 31;
        EquityOrderRequestInputs.StaticInputs staticInputs = this.staticInputs;
        int iHashCode11 = (((iHashCode10 + (staticInputs == null ? 0 : staticInputs.hashCode())) * 31) + Boolean.hashCode(this.isBackupWithheld)) * 31;
        WithholdingStatus withholdingStatus = this.withholdingStatus;
        int iHashCode12 = (((iHashCode11 + (withholdingStatus == null ? 0 : withholdingStatus.hashCode())) * 31) + Boolean.hashCode(this.mlpExperimentMember)) * 31;
        GenericAlertContent<GenericAction> genericAlertContent = this.sessionChangeAlertContent;
        int iHashCode13 = (iHashCode12 + (genericAlertContent == null ? 0 : genericAlertContent.hashCode())) * 31;
        EquityOrderContext equityOrderContext = this.equityOrderContext;
        int iHashCode14 = (iHashCode13 + (equityOrderContext == null ? 0 : equityOrderContext.hashCode())) * 31;
        String str = this.microgramOrderSummary;
        int iHashCode15 = (iHashCode14 + (str == null ? 0 : str.hashCode())) * 31;
        Monitoring monitoring = this.microgramState;
        return ((((iHashCode15 + (monitoring != null ? monitoring.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasSalesTaxes)) * 31) + Boolean.hashCode(this.useSduiAccountSwitcher);
    }

    public String toString() {
        return "EquityDollarOrderViewState(configuration=" + this.configuration + ", quantityOrAmount=" + this.quantityOrAmount + ", overrideCharArray=" + Arrays.toString(this.overrideCharArray) + ", isReviewButtonLoading=" + this.isReviewButtonLoading + ", formState=" + this.formState + ", loadingNbbo=" + this.loadingNbbo + ", apiQuickTradeAmounts=" + this.apiQuickTradeAmounts + ", instrumentAccountSwitcher=" + this.instrumentAccountSwitcher + ", allAccounts=" + this.allAccounts + ", loadingAccountSwitcher=" + this.loadingAccountSwitcher + ", account=" + this.account + ", instrument=" + this.instrument + ", tradingSession=" + this.tradingSession + ", position=" + this.position + ", quote=" + this.quote + ", nbboSummary=" + this.nbboSummary + ", checkOverrides=" + this.checkOverrides + ", isCancelPendingCryptoOrdersLoading=" + this.isCancelPendingCryptoOrdersLoading + ", staticInputs=" + this.staticInputs + ", isBackupWithheld=" + this.isBackupWithheld + ", withholdingStatus=" + this.withholdingStatus + ", mlpExperimentMember=" + this.mlpExperimentMember + ", sessionChangeAlertContent=" + this.sessionChangeAlertContent + ", equityOrderContext=" + this.equityOrderContext + ", microgramOrderSummary=" + this.microgramOrderSummary + ", microgramState=" + this.microgramState + ", hasSalesTaxes=" + this.hasSalesTaxes + ", useSduiAccountSwitcher=" + this.useSduiAccountSwitcher + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EquityDollarOrderViewState(DollarBased configuration, OrderRequest2 quantityOrAmount, char[] cArr, boolean z, DefaultOrderState formState, boolean z2, ApiQuickTradeAmounts apiQuickTradeAmounts, InstrumentAccountSwitcher instrumentAccountSwitcher, List<Account> allAccounts, boolean z3, Account account, Instrument instrument, TradingSession tradingSession, Position position, Quote quote, NbboSummary nbboSummary, List<String> checkOverrides, boolean z4, EquityOrderRequestInputs.StaticInputs staticInputs, boolean z5, WithholdingStatus withholdingStatus, boolean z6, GenericAlertContent<? extends GenericAction> genericAlertContent, EquityOrderContext equityOrderContext, String str, Monitoring monitoring, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(quantityOrAmount, "quantityOrAmount");
        Intrinsics.checkNotNullParameter(formState, "formState");
        Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
        Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
        this.configuration = configuration;
        this.quantityOrAmount = quantityOrAmount;
        this.overrideCharArray = cArr;
        this.isReviewButtonLoading = z;
        this.formState = formState;
        this.loadingNbbo = z2;
        this.apiQuickTradeAmounts = apiQuickTradeAmounts;
        this.instrumentAccountSwitcher = instrumentAccountSwitcher;
        this.allAccounts = allAccounts;
        this.loadingAccountSwitcher = z3;
        this.account = account;
        this.instrument = instrument;
        this.tradingSession = tradingSession;
        this.position = position;
        this.quote = quote;
        this.nbboSummary = nbboSummary;
        this.checkOverrides = checkOverrides;
        this.isCancelPendingCryptoOrdersLoading = z4;
        this.staticInputs = staticInputs;
        this.isBackupWithheld = z5;
        this.withholdingStatus = withholdingStatus;
        this.mlpExperimentMember = z6;
        this.sessionChangeAlertContent = genericAlertContent;
        this.equityOrderContext = equityOrderContext;
        this.microgramOrderSummary = str;
        this.microgramState = monitoring;
        this.hasSalesTaxes = z7;
        this.useSduiAccountSwitcher = z8;
        this.canShowQuickTradeSellAll = apiQuickTradeAmounts != null && getSide() == EquityOrderSide.SELL;
        this.reviewing = formState.getIsReviewingState();
        this.withholdingWarningString = withholdingStatus != null ? WithholdingStatuses.getWithholdingWarningString(withholdingStatus, z6, instrument) : null;
    }

    @Override // com.robinhood.android.trade.equity.util.EquityOrderContextHolder
    public DollarBased getConfiguration() {
        return this.configuration;
    }

    public final OrderRequest2 getQuantityOrAmount() {
        return this.quantityOrAmount;
    }

    public final boolean isReviewButtonLoading() {
        return this.isReviewButtonLoading;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ EquityDollarOrderViewState(com.robinhood.android.trading.contracts.configuration.DollarBased r33, com.robinhood.models.api.OrderRequest2 r34, char[] r35, boolean r36, com.robinhood.android.lib.trade.DefaultOrderState r37, boolean r38, com.robinhood.models.api.ApiQuickTradeAmounts r39, com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher r40, java.util.List r41, boolean r42, com.robinhood.models.p320db.Account r43, com.robinhood.models.p320db.Instrument r44, com.robinhood.models.p320db.TradingSession r45, com.robinhood.models.p320db.Position r46, com.robinhood.models.p320db.Quote r47, com.robinhood.nbbo.models.p359db.NbboSummary r48, java.util.List r49, boolean r50, com.robinhood.android.equity.validation.EquityOrderRequestInputs.StaticInputs r51, boolean r52, com.robinhood.models.p320db.bonfire.WithholdingStatus r53, boolean r54, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent r55, com.robinhood.android.equity.validation.EquityOrderContext r56, java.lang.String r57, microgram.android.Monitoring r58, boolean r59, boolean r60, int r61, kotlin.jvm.internal.DefaultConstructorMarker r62) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.trade.equity.p261ui.dollar.EquityDollarOrderViewState.<init>(com.robinhood.android.trading.contracts.configuration.DollarBasedOrderConfiguration, com.robinhood.models.api.QuantityOrAmount, char[], boolean, com.robinhood.android.lib.trade.DefaultOrderState, boolean, com.robinhood.models.api.ApiQuickTradeAmounts, com.robinhood.models.db.bonfire.instrument.InstrumentAccountSwitcher, java.util.List, boolean, com.robinhood.models.db.Account, com.robinhood.models.db.Instrument, com.robinhood.models.db.TradingSession, com.robinhood.models.db.Position, com.robinhood.models.db.Quote, com.robinhood.nbbo.models.db.NbboSummary, java.util.List, boolean, com.robinhood.android.equity.validation.EquityOrderRequestInputs$StaticInputs, boolean, com.robinhood.models.db.bonfire.WithholdingStatus, boolean, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent, com.robinhood.android.equity.validation.EquityOrderContext, java.lang.String, microgram.android.MicrogramState, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final DefaultOrderState getFormState() {
        return this.formState;
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

    public final TradingSession getTradingSession() {
        return this.tradingSession;
    }

    public final NbboSummary getNbboSummary() {
        return this.nbboSummary;
    }

    public final List<String> getCheckOverrides() {
        return this.checkOverrides;
    }

    public final boolean isCancelPendingCryptoOrdersLoading() {
        return this.isCancelPendingCryptoOrdersLoading;
    }

    public final EquityOrderRequestInputs.StaticInputs getStaticInputs$feature_trade_equity_externalDebug() {
        return this.staticInputs;
    }

    public final GenericAlertContent<GenericAction> getSessionChangeAlertContent() {
        return this.sessionChangeAlertContent;
    }

    @Override // com.robinhood.android.trade.equity.util.EquityOrderContextHolder
    public EquityOrderContext getEquityOrderContext() {
        return this.equityOrderContext;
    }

    public final boolean getHasSalesTaxes() {
        return this.hasSalesTaxes;
    }

    public final boolean getUseSduiAccountSwitcher() {
        return this.useSduiAccountSwitcher;
    }

    private final boolean isMicrogramReady() {
        Monitoring monitoring = this.microgramState;
        if (monitoring != null) {
            return monitoring.equals(Monitoring.Ready.INSTANCE);
        }
        return false;
    }

    public final boolean getUseMicrogramOrderSummary() {
        return (!isMicrogramReady() || getSide() == null || this.tradingSession == null || getEquityOrderContext() == null) ? false : true;
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

    public final String getOrderDetailsContentDescription() {
        return new String(getAmountCharArray());
    }

    public final EquityOrderSide getSide() {
        EquityOrderRequestInputs.StaticInputs staticInputs = this.staticInputs;
        if (staticInputs != null) {
            return staticInputs.getSide();
        }
        return null;
    }

    public final boolean isPresetPercentLimitOrder() {
        DollarBased configuration = getConfiguration();
        if (configuration instanceof DollarBased5) {
            return true;
        }
        if (configuration instanceof DollarBased3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean getHasUserEnteredValue() {
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        return equityOrderContext != null && equityOrderContext.getHasUserEnteredValue();
    }

    public final boolean getCanShowReviewButton() {
        EquityOrderContext equityOrderContext;
        return !getShouldShowQuickTradeAmounts() || ((equityOrderContext = getEquityOrderContext()) != null && equityOrderContext.getHasUserEnteredValue());
    }

    private final boolean getShouldShowQuickTradeAmounts() {
        EquityOrderContext equityOrderContext;
        return (!isQuickTradeAvailable() || (equityOrderContext = getEquityOrderContext()) == null || equityOrderContext.getHasUserEnteredValue()) ? false : true;
    }

    public final boolean isQuickTradeAvailable() {
        List<Money> buy_amounts;
        List<Money> sell_amounts;
        EquityOrderSide side = getSide();
        int i = side == null ? -1 : WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == -1) {
            throw new IllegalStateException("Not implemented yet");
        }
        if (i == 1) {
            ApiQuickTradeAmounts apiQuickTradeAmounts = this.apiQuickTradeAmounts;
            return (apiQuickTradeAmounts == null || (buy_amounts = apiQuickTradeAmounts.getBuy_amounts()) == null || buy_amounts.isEmpty()) ? false : true;
        }
        if (i == 2) {
            ApiQuickTradeAmounts apiQuickTradeAmounts2 = this.apiQuickTradeAmounts;
            return (apiQuickTradeAmounts2 == null || (sell_amounts = apiQuickTradeAmounts2.getSell_amounts()) == null || sell_amounts.isEmpty()) ? false : true;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("dollar orders don't support selling short");
    }

    public final BigDecimal getShareQuantity() {
        EquityOrderContext.RequestContext requestContext;
        Quote quote;
        OrderRequest2 orderRequest2 = this.quantityOrAmount;
        if (orderRequest2 instanceof OrderRequest2.DollarAmount) {
            EquityOrderContext equityOrderContext = getEquityOrderContext();
            Money lastTradePrice = (equityOrderContext == null || (requestContext = equityOrderContext.getRequestContext()) == null || (quote = requestContext.getQuote()) == null) ? null : quote.getLastTradePrice();
            if (lastTradePrice != null) {
                return Moneys2.toShareQuantity(((OrderRequest2.DollarAmount) this.quantityOrAmount).getValue(), lastTradePrice);
            }
            EquityOrderContext equityOrderContext2 = getEquityOrderContext();
            if (equityOrderContext2 != null) {
                return equityOrderContext2.getQuantity();
            }
            return null;
        }
        if (!(orderRequest2 instanceof OrderRequest2.ShareQuantity)) {
            throw new NoWhenBranchMatchedException();
        }
        EquityOrderContext equityOrderContext3 = getEquityOrderContext();
        if (equityOrderContext3 != null) {
            return equityOrderContext3.getQuantity();
        }
        return null;
    }

    public final List<Money> getQuickTradeAmounts() {
        EquityOrderSide side;
        ApiQuickTradeAmounts apiQuickTradeAmounts;
        EquityOrderRequestInputs.StaticInputs staticInputs = this.staticInputs;
        if (staticInputs == null || (side = staticInputs.getSide()) == null || (apiQuickTradeAmounts = this.apiQuickTradeAmounts) == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == 1) {
            return apiQuickTradeAmounts.getBuy_amounts();
        }
        if (i == 2) {
            return apiQuickTradeAmounts.getSell_amounts();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("dollar short orders not supported");
    }

    public final boolean getShouldShowSellAllTextButton() {
        ApiQuickTradeAmounts apiQuickTradeAmounts;
        List<Money> sell_amounts;
        if (getSide() != EquityOrderSide.SELL || (apiQuickTradeAmounts = this.apiQuickTradeAmounts) == null || (sell_amounts = apiQuickTradeAmounts.getSell_amounts()) == null || !sell_amounts.isEmpty() || this.reviewing) {
            return false;
        }
        Position position = this.position;
        return !BigDecimals7.isZero(position != null ? position.getClosableQuantity() : null);
    }

    public final boolean getCanShowQuickTradeSellAll() {
        return this.canShowQuickTradeSellAll;
    }

    public final boolean getReviewing() {
        return this.reviewing;
    }

    public final boolean getShouldShowBackupWithholdingWarning() {
        return this.isBackupWithheld && getSide() == EquityOrderSide.SELL;
    }

    public final boolean getReviewOrderBtnEnabled() {
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        return equityOrderContext != null && equityOrderContext.getHasUserEnteredValue();
    }

    public final boolean getShouldShowAccountSwitcher() {
        return this.allAccounts.size() > 1;
    }

    public final InstrumentAccountSwitcherState getAccountSwitcherState() {
        InstrumentAccountSwitcherType instrumentAccountSwitcherType;
        String accountNumber;
        EquityOrderSide side = getSide();
        InstrumentAccountSwitcher.ViewModel buy = null;
        if (side == null) {
            return null;
        }
        Screen.Name name = Screen.Name.EQUITY_ORDER_ENTRY;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[side.ordinal()];
        if (i == 1) {
            instrumentAccountSwitcherType = InstrumentAccountSwitcherType.BUY;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("dollar short orders not supported");
            }
            instrumentAccountSwitcherType = InstrumentAccountSwitcherType.SELL_DOLLARS;
        }
        InstrumentAccountSwitcherType instrumentAccountSwitcherType2 = instrumentAccountSwitcherType;
        Account account = this.account;
        if (account == null || (accountNumber = account.getAccountNumber()) == null) {
            return null;
        }
        List<Account> list = this.allAccounts;
        int i2 = iArr[side.ordinal()];
        if (i2 == 1) {
            InstrumentAccountSwitcher instrumentAccountSwitcher = this.instrumentAccountSwitcher;
            if (instrumentAccountSwitcher != null) {
                buy = instrumentAccountSwitcher.getBuy();
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("dollar short orders not supported");
            }
            InstrumentAccountSwitcher instrumentAccountSwitcher2 = this.instrumentAccountSwitcher;
            if (instrumentAccountSwitcher2 != null) {
                buy = instrumentAccountSwitcher2.getSellDollars();
            }
        }
        return new InstrumentAccountSwitcherState(name, this.loadingAccountSwitcher, accountNumber, list, false, this.useSduiAccountSwitcher, instrumentAccountSwitcherType2, buy, 16, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r3
      0x002e: PHI (r3v7 int) = (r3v0 int), (r3v3 int), (r3v4 int) binds: [B:13:0x002c, B:21:0x004b, B:24:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StringResource getOrderCreditText() {
        Instrument instrument;
        NumberFormatter shareQuantityFormat;
        BigDecimal shareQuantity = getShareQuantity();
        int intRoundUp = 0;
        if (shareQuantity != null) {
            int i = 1;
            if ((this.quantityOrAmount instanceof OrderRequest2.ShareQuantity) || (instrument = this.instrument) == null || (shareQuantityFormat = Formats.getNotionalShareQuantityFormat$default(null, instrument.getNotionalEstimatedQuantityDecimals(), 1, null)) == null) {
                shareQuantityFormat = Formats.getShareQuantityFormat();
            }
            BigDecimal bigDecimal = BigDecimal.ONE;
            if (!Intrinsics.areEqual(shareQuantity, bigDecimal)) {
                if (shareQuantity.compareTo(BigDecimal.ZERO) < 0 || shareQuantity.compareTo(bigDecimal) >= 0) {
                    i = Integer.MAX_VALUE;
                    if (shareQuantity.compareTo(new BigDecimal(Integer.MAX_VALUE)) >= 0) {
                        intRoundUp = i;
                    } else {
                        i = Integer.MIN_VALUE;
                        if (shareQuantity.compareTo(new BigDecimal(Integer.MIN_VALUE)) > 0) {
                            intRoundUp = BigDecimals7.toIntRoundUp(shareQuantity);
                        }
                    }
                }
            }
            return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C11048R.plurals.general_number_of_shares, intRoundUp), shareQuantityFormat.format(shareQuantity));
        }
        return StringResource.INSTANCE.invoke(C41827R.string.general_label_n_a, new Object[0]);
    }

    public final StringResource getOrderAccountLabelText() {
        Account account;
        if (!getShouldShowAccountSwitcher() || (account = this.account) == null) {
            return null;
        }
        StringResource stringResourceNicknameDotFormat = AccountDisplayNames.nicknameDotFormat(account);
        return stringResourceNicknameDotFormat == null ? AccountDisplayNames.getDisplayName(this.account).getWithInvesting().getTitle() : stringResourceNicknameDotFormat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CharSequence getOrderReviewText$default(EquityDollarOrderViewState equityDollarOrderViewState, Markwon markwon, Drawable drawable, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.robinhood.android.trade.equity.ui.dollar.EquityDollarOrderViewState$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        return equityDollarOrderViewState.getOrderReviewText(markwon, drawable, function0);
    }

    public final CharSequence getOrderReviewText(Markwon markwon, Drawable drawable, Function0<Unit> refreshAction) {
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(refreshAction, "refreshAction");
        String str = this.microgramOrderSummary;
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) markwon.toMarkdown(this.microgramOrderSummary));
        NbboSummary nbboSummary = this.nbboSummary;
        if (nbboSummary != null) {
            NbboSpanBuilders.appendNbboOrderSummary(spannableStringBuilder, nbboSummary, this.loadingNbbo, drawable, refreshAction);
        }
        return new SpannedString(spannableStringBuilder);
    }

    public final StringResource getActionOrderTypeText() {
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        if (equityOrderContext != null) {
            return OrderRequests.getActionOrderTypeString(equityOrderContext, true);
        }
        return null;
    }

    public final String getActionOrderLabelText(Resources resources) {
        EquityOrderRequestInputs.StaticInputs staticInputs;
        EquityOrderContext equityOrderContext;
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (this.reviewing || (((staticInputs = this.staticInputs) != null && staticInputs.isPreIpo()) || (equityOrderContext = getEquityOrderContext()) == null)) {
            return null;
        }
        return OrderRequests.getActionOrderLabelString(equityOrderContext, resources);
    }

    public final Optional<Context> getLoggingEquityOrderContext() {
        String loggingValue;
        EquityOrderFlowSource flowSource;
        EquityOrderContext equityOrderContext = getEquityOrderContext();
        if (equityOrderContext != null) {
            Optional.Companion companion = Optional.INSTANCE;
            com.robinhood.rosetta.eventlogging.EquityOrderContext rosetta2 = equityOrderContext.toRosetta();
            BrokerageAccountContext brokerageAccountContext = new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(equityOrderContext.getBrokerageAccountType()), null, null, null, false, false, null, null, null, null, 1022, null);
            EquityOrderRequestInputs.StaticInputs staticInputs = this.staticInputs;
            if (staticInputs == null || (flowSource = staticInputs.getFlowSource()) == null || (loggingValue = flowSource.getLoggingValue()) == null) {
                loggingValue = "";
            }
            Optional<Context> optionalM2972of = companion.m2972of(new Context(0, 0, 0, null, null, null, null, null, 0, null, loggingValue, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, rosetta2, null, null, null, null, null, null, null, null, null, null, brokerageAccountContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -536870913, -257, -1, -1, 16383, null));
            if (optionalM2972of != null) {
                return optionalM2972of;
            }
        }
        return Optional2.INSTANCE;
    }

    public final StringResource getWithholdingWarningString() {
        return this.withholdingWarningString;
    }
}
