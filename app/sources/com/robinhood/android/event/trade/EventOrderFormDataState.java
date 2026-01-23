package com.robinhood.android.event.trade;

import androidx.compose.p011ui.text.input.TextFieldValue;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.event.trade.EventOrderFormViewState;
import com.robinhood.android.event.trade.OrderSubmissionState;
import com.robinhood.android.event.trade.orderform.EventOrderFormScreen6;
import com.robinhood.android.event.trade.util.EventOrderFormStringUtils;
import com.robinhood.android.event.trade.util.TextFieldValues;
import com.robinhood.android.eventcontracts.experiments.EcLimitAndNotionalExperiment;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase3;
import com.robinhood.android.eventcontracts.trade.EventsOrderContextFactory;
import com.robinhood.android.eventcontracts.trade.GtdTimeInForceInfo;
import com.robinhood.android.eventcontracts.trade.UiEventOrderContext;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.ExchangeSource;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.order.EventOrder;
import com.robinhood.android.models.event.p186db.order.EventOrder2;
import com.robinhood.android.models.event.p186db.order.EventOrderPositionEffect;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.android.models.event.p186db.order.OrderFormOrderType;
import com.robinhood.android.models.futures.api.ApiFuturesBuyingPower;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.android.models.futures.p189db.FuturesAccount;
import com.robinhood.android.models.futures.p189db.FuturesOrderKt;
import com.robinhood.ceres.p284v1.FuturesOrderDto;
import com.robinhood.ceres.p284v1.GetFeesForTentativeOrderResponseDto;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.store.event.ProposalData;
import com.robinhood.store.shareprefs.OrderFormTimeInForce;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Some;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import p479j$.time.Instant;

/* compiled from: EventOrderFormDataState.kt */
@Metadata(m3635d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ß\u00012\u00020\u0001:\u0002ß\u0001BÍ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-\u0012\b\b\u0002\u0010/\u001a\u00020\u0010\u0012\b\b\u0002\u00100\u001a\u00020\u0010\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00103\u001a\u00020\u0010¢\u0006\u0004\b4\u00105J\u001a\u0010\u0081\u0001\u001a\u00020c2\u0007\u0010\u0082\u0001\u001a\u00020\u00152\u0006\u0010f\u001a\u00020\u0015H\u0002J\u0016\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00152\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0015H\u0002J\u000b\u0010\u0089\u0001\u001a\u0004\u0018\u00010cH\u0002J\u000b\u0010\u008a\u0001\u001a\u0004\u0018\u00010cH\u0002J\u0015\u0010\u008b\u0001\u001a\u0004\u0018\u00010c2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0002J\u000b\u0010\u008e\u0001\u001a\u0004\u0018\u00010cH\u0002J\u000b\u0010\u008f\u0001\u001a\u0004\u0018\u00010cH\u0002J \u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u00102\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0015H\u0002J\u000b\u0010\u0093\u0001\u001a\u0004\u0018\u00010cH\u0002J\u000b\u0010\u0094\u0001\u001a\u0004\u0018\u00010cH\u0002J\u000b\u0010\u0095\u0001\u001a\u0004\u0018\u00010cH\u0002J\u000b\u0010\u0096\u0001\u001a\u0004\u0018\u00010cH\u0002J!\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u00012\b\u0010f\u001a\u0004\u0018\u00010\u00152\t\u0010¡\u0001\u001a\u0004\u0018\u00010&H\u0002J'\u0010¦\u0001\u001a\u0004\u0018\u00010c2\b\u0010§\u0001\u001a\u00030¨\u00012\u0006\u0010\u001f\u001a\u00020 2\b\u0010©\u0001\u001a\u00030ª\u0001H\u0002J(\u0010«\u0001\u001a\u0004\u0018\u00010c2\b\u0010§\u0001\u001a\u00030¨\u00012\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u00152\u0006\u0010f\u001a\u00020\u0015H\u0002J1\u0010\u00ad\u0001\u001a\u0004\u0018\u00010c2\b\u0010§\u0001\u001a\u00030¨\u00012\u0007\u0010®\u0001\u001a\u00020\u00152\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u00152\u0006\u0010f\u001a\u00020\u0015H\u0002J(\u0010¯\u0001\u001a\u0004\u0018\u00010c2\b\u0010§\u0001\u001a\u00030¨\u00012\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u00152\u0006\u0010f\u001a\u00020\u0015H\u0002J'\u0010°\u0001\u001a\u00020\u00152\u0007\u0010±\u0001\u001a\u00020\u00152\t\u0010²\u0001\u001a\u0004\u0018\u00010\u00152\b\u0010©\u0001\u001a\u00030ª\u0001H\u0002J>\u0010³\u0001\u001a\u0005\u0018\u00010´\u00012\b\u0010µ\u0001\u001a\u00030ª\u00012\b\u0010§\u0001\u001a\u00030¨\u00012\u0006\u0010f\u001a\u00020\u00152\t\u0010²\u0001\u001a\u0004\u0018\u00010\u00152\t\u0010¶\u0001\u001a\u0004\u0018\u00010\u0015H\u0002J\n\u0010»\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010½\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010¾\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¿\u0001\u001a\u00020\nHÆ\u0003J\n\u0010À\u0001\u001a\u00020\fHÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\u0013HÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\u0013HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\n\u0010É\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020\u0013HÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010 HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\f\u0010Ð\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020(HÂ\u0003J\f\u0010Ò\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0012\u0010Ô\u0001\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-HÆ\u0003J\n\u0010Õ\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ö\u0001\u001a\u00020\u0010HÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u000102HÆ\u0003J\n\u0010Ø\u0001\u001a\u00020\u0010HÆ\u0003JØ\u0002\u0010Ù\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010'\u001a\u00020(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-2\b\b\u0002\u0010/\u001a\u00020\u00102\b\b\u0002\u00100\u001a\u00020\u00102\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\b\b\u0002\u00103\u001a\u00020\u0010HÆ\u0001J\u0015\u0010Ú\u0001\u001a\u00020\u00102\t\u0010Û\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010Ü\u0001\u001a\u00030Ý\u0001HÖ\u0001J\n\u0010Þ\u0001\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u00107R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010DR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\bI\u0010FR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010\u001b\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bN\u0010HR\u0011\u0010\u001c\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\bO\u0010FR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bP\u0010HR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010HR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0013\u0010+\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010HR\u0019\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0011\u0010/\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b/\u0010DR\u0011\u00100\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u0010DR\u0013\u00101\u001a\u0004\u0018\u000102¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0011\u00103\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b3\u0010DR\u0014\u0010a\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010DR\u0016\u0010b\u001a\u0004\u0018\u00010c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0016\u0010f\u001a\u0004\u0018\u00010\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u0010HR\u0016\u0010h\u001a\u0004\u0018\u00010\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bi\u0010HR\u0016\u0010j\u001a\u0004\u0018\u00010c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010eR\u0014\u0010l\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010DR\u000e\u0010m\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010n\u001a\u0004\u0018\u00010\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010HR\u0016\u0010p\u001a\u0004\u0018\u00010\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010HR\u0014\u0010r\u001a\u00020c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010eR\u000e\u0010t\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010u\u001a\u0004\u0018\u00010\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bv\u0010HR\u0016\u0010w\u001a\u0004\u0018\u00010c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010eR\u0016\u0010y\u001a\u0004\u0018\u00010\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bz\u0010HR\u0016\u0010{\u001a\u0004\u0018\u00010c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010eR\u0014\u0010}\u001a\u0004\u0018\u00010~8F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u00018F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001a\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009c\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0015\u0010¢\u0001\u001a\u00030£\u00018F¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0017\u0010·\u0001\u001a\u0005\u0018\u00010¸\u00018F¢\u0006\b\u001a\u0006\b¹\u0001\u0010º\u0001¨\u0006à\u0001"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormDataState;", "", "eventContractId", "Ljava/util/UUID;", "side", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "positionEffect", "Lcom/robinhood/android/models/event/db/order/EventOrderPositionEffect;", "refId", "orderSubmissionState", "Lcom/robinhood/android/event/trade/OrderSubmissionState;", "focusedField", "Lcom/robinhood/android/event/trade/OrderFormFocusedField;", "orderType", "Lcom/robinhood/android/models/event/db/order/OrderFormOrderType;", "supportChangingOrderTypes", "", "isGdpEnabled", "quantityText", "", "inputLimitPrice", "Ljava/math/BigDecimal;", "userInputLimitPriceText", "quantityBasedOrderTimeInForce", "Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;", "gtdTimeInForceInfo", "Lcom/robinhood/android/eventcontracts/trade/GtdTimeInForceInfo;", "userInputNotionalAmount", "userInputNotionalAmountText", "estimatedFeesPerQuantity", "estimatedTotalFee", "contract", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "futuresAccount", "Lcom/robinhood/android/models/futures/db/FuturesAccount;", "buyingPower", "Lcom/robinhood/android/models/futures/api/ApiFuturesBuyingPower;", "quoteResult", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult;", "_feesDto", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto;", "position", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "closingPendingOrderContractQuantity", "orderFormDisplayDetails", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/event/trade/OrderFormDisplayDetails;", "isInQuickResubmitIocExperiment", "isInQuickResubmitNotionalExperiment", "limitAndNotionalOrderExperimentVariant", "Lcom/robinhood/android/eventcontracts/experiments/EcLimitAndNotionalExperiment$Variant;", "isInAutoInsertDecimalExperiment", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/models/event/db/order/EventOrderSide;Lcom/robinhood/android/models/event/db/order/EventOrderPositionEffect;Ljava/util/UUID;Lcom/robinhood/android/event/trade/OrderSubmissionState;Lcom/robinhood/android/event/trade/OrderFormFocusedField;Lcom/robinhood/android/models/event/db/order/OrderFormOrderType;ZZLjava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;Lcom/robinhood/android/eventcontracts/trade/GtdTimeInForceInfo;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/android/models/event/db/arsenal/EventContract;Lcom/robinhood/android/models/futures/db/FuturesAccount;Lcom/robinhood/android/models/futures/api/ApiFuturesBuyingPower;Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult;Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto;Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;Ljava/math/BigDecimal;Lcom/robinhood/utils/Optional;ZZLcom/robinhood/android/eventcontracts/experiments/EcLimitAndNotionalExperiment$Variant;Z)V", "getEventContractId", "()Ljava/util/UUID;", "getSide", "()Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "getPositionEffect", "()Lcom/robinhood/android/models/event/db/order/EventOrderPositionEffect;", "getRefId", "getOrderSubmissionState", "()Lcom/robinhood/android/event/trade/OrderSubmissionState;", "getFocusedField", "()Lcom/robinhood/android/event/trade/OrderFormFocusedField;", "getOrderType", "()Lcom/robinhood/android/models/event/db/order/OrderFormOrderType;", "getSupportChangingOrderTypes", "()Z", "getQuantityText", "()Ljava/lang/String;", "getInputLimitPrice", "()Ljava/math/BigDecimal;", "getUserInputLimitPriceText", "getQuantityBasedOrderTimeInForce", "()Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;", "getGtdTimeInForceInfo", "()Lcom/robinhood/android/eventcontracts/trade/GtdTimeInForceInfo;", "getUserInputNotionalAmount", "getUserInputNotionalAmountText", "getEstimatedFeesPerQuantity", "getEstimatedTotalFee", "getContract", "()Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "getFuturesAccount", "()Lcom/robinhood/android/models/futures/db/FuturesAccount;", "getBuyingPower", "()Lcom/robinhood/android/models/futures/api/ApiFuturesBuyingPower;", "getQuoteResult", "()Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult;", "getPosition", "()Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "getClosingPendingOrderContractQuantity", "getOrderFormDisplayDetails", "()Lcom/robinhood/utils/Optional;", "getLimitAndNotionalOrderExperimentVariant", "()Lcom/robinhood/android/eventcontracts/experiments/EcLimitAndNotionalExperiment$Variant;", "isLoadingCriticalDisplayInfo", "buyingPowerDisplay", "Lcom/robinhood/utils/resource/StringResource;", "getBuyingPowerDisplay", "()Lcom/robinhood/utils/resource/StringResource;", "quantity", "getQuantity$feature_event_trade_externalDebug", "quantityAvailableForClosing", "getQuantityAvailableForClosing$feature_event_trade_externalDebug", "quantityAvailableSubtitle", "getQuantityAvailableSubtitle", "isInLimitAndNotionalOrderExperiment", "allowCustomPrice", "displayedPriceForOrder", "getDisplayedPriceForOrder", "quotePrice", "getQuotePrice", "costOrCreditLabel", "getCostOrCreditLabel", "userHasLimitPriceInput", "submissionPrice", "getSubmissionPrice$feature_event_trade_externalDebug", "feesDisplay", "getFeesDisplay", "estimatedCostOrCredit", "getEstimatedCostOrCredit", "estimatedCostOrCreditDisplay", "getEstimatedCostOrCreditDisplay", "exchangeSource", "Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;", "getExchangeSource", "()Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;", "estimatedCreditExplainer", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "totalPayout", "quantityForPayout", "orderContext", "Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext;", "getOrderContext", "()Lcom/robinhood/android/eventcontracts/trade/UiEventOrderContext;", "getOrderSummaryString", "getOrderSummaryStringNotionalBased", "getOrderSummaryStringNotionalBasedForComboOrder", "proposal", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteResult$Proposals;", "getOrderSummaryStringNotionalBasedForNonComboOrder", "getOrderSummaryStringQuantityBased", "getPayoutData", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$PayoutData;", "isReceipt", "getYesOrNoWithContractName", "getContractNameWithLegsForOrderSummary", "getOrderTitle", "getOrderSubtitle", "quantityBasedData", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$QuantityBasedData;", "getQuantityBasedData", "()Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$QuantityBasedData;", "notionalBasedData", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$NotionalBasedData;", "getNotionalBasedData", "()Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$NotionalBasedData;", "getEditingSubtext", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$EditingSubTextState;", "comboQuoteResult", "orderFormContentData", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData;", "getOrderFormContentData", "()Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData;", "orderReceiptTitleString", Card.Icon.ORDER, "Lcom/robinhood/ceres/v1/FuturesOrderDto;", "orderState", "Lcom/robinhood/shared/models/history/shared/OrderState;", "orderReceiptDetailString", "displayPrice", "getOrderReceiptDetailStringForNotionalBasedOrder", "notionalAmount", "getOrderReceiptDetailStringForQuantityBasedOrder", "getQuantityForEstimate", "orderQuantity", "filledQuantity", "getQuickResubmitData", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData$QuickResubmit;", "state", "amountReturned", "receiptData", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData;", "getReceiptData", "()Lcom/robinhood/android/event/trade/EventOrderFormViewState$ReceiptData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class EventOrderFormDataState {
    private static final GetFeesForTentativeOrderResponseDto zeroFee;
    private final GetFeesForTentativeOrderResponseDto _feesDto;
    private final boolean allowCustomPrice;
    private final ApiFuturesBuyingPower buyingPower;
    private final BigDecimal closingPendingOrderContractQuantity;
    private final EventContract contract;
    private final BigDecimal estimatedFeesPerQuantity;
    private final BigDecimal estimatedTotalFee;
    private final UUID eventContractId;
    private final OrderFormFocusedField focusedField;
    private final FuturesAccount futuresAccount;
    private final GtdTimeInForceInfo gtdTimeInForceInfo;
    private final BigDecimal inputLimitPrice;
    private final boolean isGdpEnabled;
    private final boolean isInAutoInsertDecimalExperiment;
    private final boolean isInQuickResubmitIocExperiment;
    private final boolean isInQuickResubmitNotionalExperiment;
    private final EcLimitAndNotionalExperiment.Variant limitAndNotionalOrderExperimentVariant;
    private final Optional<OrderFormDisplayDetails> orderFormDisplayDetails;
    private final OrderSubmissionState orderSubmissionState;
    private final OrderFormOrderType orderType;
    private final UiEventContractPosition position;
    private final EventOrderPositionEffect positionEffect;
    private final OrderFormTimeInForce quantityBasedOrderTimeInForce;
    private final String quantityText;
    private final StreamComboQuoteUseCase3 quoteResult;
    private final UUID refId;
    private final EventOrderSide side;
    private final boolean supportChangingOrderTypes;
    private final boolean userHasLimitPriceInput;
    private final String userInputLimitPriceText;
    private final BigDecimal userInputNotionalAmount;
    private final String userInputNotionalAmountText;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EventOrderFormDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[OrderFormOrderType.values().length];
            try {
                iArr[OrderFormOrderType.NOTIONAL_BASED_ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderFormOrderType.QUANTITY_BASED_ORDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderFormOrderType.UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EventOrderPositionEffect.values().length];
            try {
                iArr2[EventOrderPositionEffect.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EventOrderPositionEffect.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EventOrderSide.values().length];
            try {
                iArr3[EventOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[EventOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ExchangeSource.values().length];
            try {
                iArr4[ExchangeSource.FORECAST_EX.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[ExchangeSource.KALSHI.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[ExchangeSource.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[OrderFormTimeInForce.values().length];
            try {
                iArr5[OrderFormTimeInForce.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[OrderFormTimeInForce.IOC.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[OrderFormTimeInForce.FOK.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[OrderFormTimeInForce.GTD.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[OrderState.values().length];
            try {
                iArr6[OrderState.QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr6[OrderState.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr6[OrderState.UNCONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[OrderState.CONFIRMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[OrderState.TRIGGERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr6[OrderState.PARTIALLY_FILLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr6[OrderState.FILLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr6[OrderState.PARTIALLY_FILLED_REST_CANCELLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr6[OrderState.PENDING_CANCELLED.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[OrderState.REJECTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[OrderState.CANCELED.ordinal()] = 11;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr6[OrderState.FAILED.ordinal()] = 12;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[OrderState.VOIDED.ordinal()] = 13;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[OrderState.NOT_ACCEPTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    /* renamed from: component23, reason: from getter */
    private final GetFeesForTentativeOrderResponseDto get_feesDto() {
        return this._feesDto;
    }

    public static /* synthetic */ EventOrderFormDataState copy$default(EventOrderFormDataState eventOrderFormDataState, UUID uuid, EventOrderSide eventOrderSide, EventOrderPositionEffect eventOrderPositionEffect, UUID uuid2, OrderSubmissionState orderSubmissionState, OrderFormFocusedField orderFormFocusedField, OrderFormOrderType orderFormOrderType, boolean z, boolean z2, String str, BigDecimal bigDecimal, String str2, OrderFormTimeInForce orderFormTimeInForce, GtdTimeInForceInfo gtdTimeInForceInfo, BigDecimal bigDecimal2, String str3, BigDecimal bigDecimal3, BigDecimal bigDecimal4, EventContract eventContract, FuturesAccount futuresAccount, ApiFuturesBuyingPower apiFuturesBuyingPower, StreamComboQuoteUseCase3 streamComboQuoteUseCase3, GetFeesForTentativeOrderResponseDto getFeesForTentativeOrderResponseDto, UiEventContractPosition uiEventContractPosition, BigDecimal bigDecimal5, Optional optional, boolean z3, boolean z4, EcLimitAndNotionalExperiment.Variant variant, boolean z5, int i, Object obj) {
        boolean z6;
        EcLimitAndNotionalExperiment.Variant variant2;
        UUID uuid3 = (i & 1) != 0 ? eventOrderFormDataState.eventContractId : uuid;
        EventOrderSide eventOrderSide2 = (i & 2) != 0 ? eventOrderFormDataState.side : eventOrderSide;
        EventOrderPositionEffect eventOrderPositionEffect2 = (i & 4) != 0 ? eventOrderFormDataState.positionEffect : eventOrderPositionEffect;
        UUID uuid4 = (i & 8) != 0 ? eventOrderFormDataState.refId : uuid2;
        OrderSubmissionState orderSubmissionState2 = (i & 16) != 0 ? eventOrderFormDataState.orderSubmissionState : orderSubmissionState;
        OrderFormFocusedField orderFormFocusedField2 = (i & 32) != 0 ? eventOrderFormDataState.focusedField : orderFormFocusedField;
        OrderFormOrderType orderFormOrderType2 = (i & 64) != 0 ? eventOrderFormDataState.orderType : orderFormOrderType;
        boolean z7 = (i & 128) != 0 ? eventOrderFormDataState.supportChangingOrderTypes : z;
        boolean z8 = (i & 256) != 0 ? eventOrderFormDataState.isGdpEnabled : z2;
        String str4 = (i & 512) != 0 ? eventOrderFormDataState.quantityText : str;
        BigDecimal bigDecimal6 = (i & 1024) != 0 ? eventOrderFormDataState.inputLimitPrice : bigDecimal;
        String str5 = (i & 2048) != 0 ? eventOrderFormDataState.userInputLimitPriceText : str2;
        OrderFormTimeInForce orderFormTimeInForce2 = (i & 4096) != 0 ? eventOrderFormDataState.quantityBasedOrderTimeInForce : orderFormTimeInForce;
        GtdTimeInForceInfo gtdTimeInForceInfo2 = (i & 8192) != 0 ? eventOrderFormDataState.gtdTimeInForceInfo : gtdTimeInForceInfo;
        UUID uuid5 = uuid3;
        BigDecimal bigDecimal7 = (i & 16384) != 0 ? eventOrderFormDataState.userInputNotionalAmount : bigDecimal2;
        String str6 = (i & 32768) != 0 ? eventOrderFormDataState.userInputNotionalAmountText : str3;
        BigDecimal bigDecimal8 = (i & 65536) != 0 ? eventOrderFormDataState.estimatedFeesPerQuantity : bigDecimal3;
        BigDecimal bigDecimal9 = (i & 131072) != 0 ? eventOrderFormDataState.estimatedTotalFee : bigDecimal4;
        EventContract eventContract2 = (i & 262144) != 0 ? eventOrderFormDataState.contract : eventContract;
        FuturesAccount futuresAccount2 = (i & 524288) != 0 ? eventOrderFormDataState.futuresAccount : futuresAccount;
        ApiFuturesBuyingPower apiFuturesBuyingPower2 = (i & 1048576) != 0 ? eventOrderFormDataState.buyingPower : apiFuturesBuyingPower;
        StreamComboQuoteUseCase3 streamComboQuoteUseCase32 = (i & 2097152) != 0 ? eventOrderFormDataState.quoteResult : streamComboQuoteUseCase3;
        GetFeesForTentativeOrderResponseDto getFeesForTentativeOrderResponseDto2 = (i & 4194304) != 0 ? eventOrderFormDataState._feesDto : getFeesForTentativeOrderResponseDto;
        UiEventContractPosition uiEventContractPosition2 = (i & 8388608) != 0 ? eventOrderFormDataState.position : uiEventContractPosition;
        BigDecimal bigDecimal10 = (i & 16777216) != 0 ? eventOrderFormDataState.closingPendingOrderContractQuantity : bigDecimal5;
        Optional optional2 = (i & 33554432) != 0 ? eventOrderFormDataState.orderFormDisplayDetails : optional;
        boolean z9 = (i & 67108864) != 0 ? eventOrderFormDataState.isInQuickResubmitIocExperiment : z3;
        boolean z10 = (i & 134217728) != 0 ? eventOrderFormDataState.isInQuickResubmitNotionalExperiment : z4;
        EcLimitAndNotionalExperiment.Variant variant3 = (i & 268435456) != 0 ? eventOrderFormDataState.limitAndNotionalOrderExperimentVariant : variant;
        if ((i & 536870912) != 0) {
            variant2 = variant3;
            z6 = eventOrderFormDataState.isInAutoInsertDecimalExperiment;
        } else {
            z6 = z5;
            variant2 = variant3;
        }
        return eventOrderFormDataState.copy(uuid5, eventOrderSide2, eventOrderPositionEffect2, uuid4, orderSubmissionState2, orderFormFocusedField2, orderFormOrderType2, z7, z8, str4, bigDecimal6, str5, orderFormTimeInForce2, gtdTimeInForceInfo2, bigDecimal7, str6, bigDecimal8, bigDecimal9, eventContract2, futuresAccount2, apiFuturesBuyingPower2, streamComboQuoteUseCase32, getFeesForTentativeOrderResponseDto2, uiEventContractPosition2, bigDecimal10, optional2, z9, z10, variant2, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getEventContractId() {
        return this.eventContractId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getQuantityText() {
        return this.quantityText;
    }

    /* renamed from: component11, reason: from getter */
    public final BigDecimal getInputLimitPrice() {
        return this.inputLimitPrice;
    }

    /* renamed from: component12, reason: from getter */
    public final String getUserInputLimitPriceText() {
        return this.userInputLimitPriceText;
    }

    /* renamed from: component13, reason: from getter */
    public final OrderFormTimeInForce getQuantityBasedOrderTimeInForce() {
        return this.quantityBasedOrderTimeInForce;
    }

    /* renamed from: component14, reason: from getter */
    public final GtdTimeInForceInfo getGtdTimeInForceInfo() {
        return this.gtdTimeInForceInfo;
    }

    /* renamed from: component15, reason: from getter */
    public final BigDecimal getUserInputNotionalAmount() {
        return this.userInputNotionalAmount;
    }

    /* renamed from: component16, reason: from getter */
    public final String getUserInputNotionalAmountText() {
        return this.userInputNotionalAmountText;
    }

    /* renamed from: component17, reason: from getter */
    public final BigDecimal getEstimatedFeesPerQuantity() {
        return this.estimatedFeesPerQuantity;
    }

    /* renamed from: component18, reason: from getter */
    public final BigDecimal getEstimatedTotalFee() {
        return this.estimatedTotalFee;
    }

    /* renamed from: component19, reason: from getter */
    public final EventContract getContract() {
        return this.contract;
    }

    /* renamed from: component2, reason: from getter */
    public final EventOrderSide getSide() {
        return this.side;
    }

    /* renamed from: component20, reason: from getter */
    public final FuturesAccount getFuturesAccount() {
        return this.futuresAccount;
    }

    /* renamed from: component21, reason: from getter */
    public final ApiFuturesBuyingPower getBuyingPower() {
        return this.buyingPower;
    }

    /* renamed from: component22, reason: from getter */
    public final StreamComboQuoteUseCase3 getQuoteResult() {
        return this.quoteResult;
    }

    /* renamed from: component24, reason: from getter */
    public final UiEventContractPosition getPosition() {
        return this.position;
    }

    /* renamed from: component25, reason: from getter */
    public final BigDecimal getClosingPendingOrderContractQuantity() {
        return this.closingPendingOrderContractQuantity;
    }

    public final Optional<OrderFormDisplayDetails> component26() {
        return this.orderFormDisplayDetails;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getIsInQuickResubmitIocExperiment() {
        return this.isInQuickResubmitIocExperiment;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getIsInQuickResubmitNotionalExperiment() {
        return this.isInQuickResubmitNotionalExperiment;
    }

    /* renamed from: component29, reason: from getter */
    public final EcLimitAndNotionalExperiment.Variant getLimitAndNotionalOrderExperimentVariant() {
        return this.limitAndNotionalOrderExperimentVariant;
    }

    /* renamed from: component3, reason: from getter */
    public final EventOrderPositionEffect getPositionEffect() {
        return this.positionEffect;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getIsInAutoInsertDecimalExperiment() {
        return this.isInAutoInsertDecimalExperiment;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getRefId() {
        return this.refId;
    }

    /* renamed from: component5, reason: from getter */
    public final OrderSubmissionState getOrderSubmissionState() {
        return this.orderSubmissionState;
    }

    /* renamed from: component6, reason: from getter */
    public final OrderFormFocusedField getFocusedField() {
        return this.focusedField;
    }

    /* renamed from: component7, reason: from getter */
    public final OrderFormOrderType getOrderType() {
        return this.orderType;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getSupportChangingOrderTypes() {
        return this.supportChangingOrderTypes;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsGdpEnabled() {
        return this.isGdpEnabled;
    }

    public final EventOrderFormDataState copy(UUID eventContractId, EventOrderSide side, EventOrderPositionEffect positionEffect, UUID refId, OrderSubmissionState orderSubmissionState, OrderFormFocusedField focusedField, OrderFormOrderType orderType, boolean supportChangingOrderTypes, boolean isGdpEnabled, String quantityText, BigDecimal inputLimitPrice, String userInputLimitPriceText, OrderFormTimeInForce quantityBasedOrderTimeInForce, GtdTimeInForceInfo gtdTimeInForceInfo, BigDecimal userInputNotionalAmount, String userInputNotionalAmountText, BigDecimal estimatedFeesPerQuantity, BigDecimal estimatedTotalFee, EventContract contract, FuturesAccount futuresAccount, ApiFuturesBuyingPower buyingPower, StreamComboQuoteUseCase3 quoteResult, GetFeesForTentativeOrderResponseDto _feesDto, UiEventContractPosition position, BigDecimal closingPendingOrderContractQuantity, Optional<OrderFormDisplayDetails> orderFormDisplayDetails, boolean isInQuickResubmitIocExperiment, boolean isInQuickResubmitNotionalExperiment, EcLimitAndNotionalExperiment.Variant limitAndNotionalOrderExperimentVariant, boolean isInAutoInsertDecimalExperiment) {
        Intrinsics.checkNotNullParameter(eventContractId, "eventContractId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(orderSubmissionState, "orderSubmissionState");
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        Intrinsics.checkNotNullParameter(quantityText, "quantityText");
        Intrinsics.checkNotNullParameter(userInputLimitPriceText, "userInputLimitPriceText");
        Intrinsics.checkNotNullParameter(userInputNotionalAmount, "userInputNotionalAmount");
        Intrinsics.checkNotNullParameter(userInputNotionalAmountText, "userInputNotionalAmountText");
        Intrinsics.checkNotNullParameter(_feesDto, "_feesDto");
        return new EventOrderFormDataState(eventContractId, side, positionEffect, refId, orderSubmissionState, focusedField, orderType, supportChangingOrderTypes, isGdpEnabled, quantityText, inputLimitPrice, userInputLimitPriceText, quantityBasedOrderTimeInForce, gtdTimeInForceInfo, userInputNotionalAmount, userInputNotionalAmountText, estimatedFeesPerQuantity, estimatedTotalFee, contract, futuresAccount, buyingPower, quoteResult, _feesDto, position, closingPendingOrderContractQuantity, orderFormDisplayDetails, isInQuickResubmitIocExperiment, isInQuickResubmitNotionalExperiment, limitAndNotionalOrderExperimentVariant, isInAutoInsertDecimalExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventOrderFormDataState)) {
            return false;
        }
        EventOrderFormDataState eventOrderFormDataState = (EventOrderFormDataState) other;
        return Intrinsics.areEqual(this.eventContractId, eventOrderFormDataState.eventContractId) && this.side == eventOrderFormDataState.side && this.positionEffect == eventOrderFormDataState.positionEffect && Intrinsics.areEqual(this.refId, eventOrderFormDataState.refId) && Intrinsics.areEqual(this.orderSubmissionState, eventOrderFormDataState.orderSubmissionState) && this.focusedField == eventOrderFormDataState.focusedField && this.orderType == eventOrderFormDataState.orderType && this.supportChangingOrderTypes == eventOrderFormDataState.supportChangingOrderTypes && this.isGdpEnabled == eventOrderFormDataState.isGdpEnabled && Intrinsics.areEqual(this.quantityText, eventOrderFormDataState.quantityText) && Intrinsics.areEqual(this.inputLimitPrice, eventOrderFormDataState.inputLimitPrice) && Intrinsics.areEqual(this.userInputLimitPriceText, eventOrderFormDataState.userInputLimitPriceText) && this.quantityBasedOrderTimeInForce == eventOrderFormDataState.quantityBasedOrderTimeInForce && Intrinsics.areEqual(this.gtdTimeInForceInfo, eventOrderFormDataState.gtdTimeInForceInfo) && Intrinsics.areEqual(this.userInputNotionalAmount, eventOrderFormDataState.userInputNotionalAmount) && Intrinsics.areEqual(this.userInputNotionalAmountText, eventOrderFormDataState.userInputNotionalAmountText) && Intrinsics.areEqual(this.estimatedFeesPerQuantity, eventOrderFormDataState.estimatedFeesPerQuantity) && Intrinsics.areEqual(this.estimatedTotalFee, eventOrderFormDataState.estimatedTotalFee) && Intrinsics.areEqual(this.contract, eventOrderFormDataState.contract) && Intrinsics.areEqual(this.futuresAccount, eventOrderFormDataState.futuresAccount) && Intrinsics.areEqual(this.buyingPower, eventOrderFormDataState.buyingPower) && Intrinsics.areEqual(this.quoteResult, eventOrderFormDataState.quoteResult) && Intrinsics.areEqual(this._feesDto, eventOrderFormDataState._feesDto) && Intrinsics.areEqual(this.position, eventOrderFormDataState.position) && Intrinsics.areEqual(this.closingPendingOrderContractQuantity, eventOrderFormDataState.closingPendingOrderContractQuantity) && Intrinsics.areEqual(this.orderFormDisplayDetails, eventOrderFormDataState.orderFormDisplayDetails) && this.isInQuickResubmitIocExperiment == eventOrderFormDataState.isInQuickResubmitIocExperiment && this.isInQuickResubmitNotionalExperiment == eventOrderFormDataState.isInQuickResubmitNotionalExperiment && this.limitAndNotionalOrderExperimentVariant == eventOrderFormDataState.limitAndNotionalOrderExperimentVariant && this.isInAutoInsertDecimalExperiment == eventOrderFormDataState.isInAutoInsertDecimalExperiment;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.eventContractId.hashCode() * 31) + this.side.hashCode()) * 31) + this.positionEffect.hashCode()) * 31) + this.refId.hashCode()) * 31) + this.orderSubmissionState.hashCode()) * 31) + this.focusedField.hashCode()) * 31;
        OrderFormOrderType orderFormOrderType = this.orderType;
        int iHashCode2 = (((((((iHashCode + (orderFormOrderType == null ? 0 : orderFormOrderType.hashCode())) * 31) + Boolean.hashCode(this.supportChangingOrderTypes)) * 31) + Boolean.hashCode(this.isGdpEnabled)) * 31) + this.quantityText.hashCode()) * 31;
        BigDecimal bigDecimal = this.inputLimitPrice;
        int iHashCode3 = (((iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.userInputLimitPriceText.hashCode()) * 31;
        OrderFormTimeInForce orderFormTimeInForce = this.quantityBasedOrderTimeInForce;
        int iHashCode4 = (iHashCode3 + (orderFormTimeInForce == null ? 0 : orderFormTimeInForce.hashCode())) * 31;
        GtdTimeInForceInfo gtdTimeInForceInfo = this.gtdTimeInForceInfo;
        int iHashCode5 = (((((iHashCode4 + (gtdTimeInForceInfo == null ? 0 : gtdTimeInForceInfo.hashCode())) * 31) + this.userInputNotionalAmount.hashCode()) * 31) + this.userInputNotionalAmountText.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.estimatedFeesPerQuantity;
        int iHashCode6 = (iHashCode5 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.estimatedTotalFee;
        int iHashCode7 = (iHashCode6 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        EventContract eventContract = this.contract;
        int iHashCode8 = (iHashCode7 + (eventContract == null ? 0 : eventContract.hashCode())) * 31;
        FuturesAccount futuresAccount = this.futuresAccount;
        int iHashCode9 = (iHashCode8 + (futuresAccount == null ? 0 : futuresAccount.hashCode())) * 31;
        ApiFuturesBuyingPower apiFuturesBuyingPower = this.buyingPower;
        int iHashCode10 = (iHashCode9 + (apiFuturesBuyingPower == null ? 0 : apiFuturesBuyingPower.hashCode())) * 31;
        StreamComboQuoteUseCase3 streamComboQuoteUseCase3 = this.quoteResult;
        int iHashCode11 = (((iHashCode10 + (streamComboQuoteUseCase3 == null ? 0 : streamComboQuoteUseCase3.hashCode())) * 31) + this._feesDto.hashCode()) * 31;
        UiEventContractPosition uiEventContractPosition = this.position;
        int iHashCode12 = (iHashCode11 + (uiEventContractPosition == null ? 0 : uiEventContractPosition.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.closingPendingOrderContractQuantity;
        int iHashCode13 = (iHashCode12 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        Optional<OrderFormDisplayDetails> optional = this.orderFormDisplayDetails;
        int iHashCode14 = (((((iHashCode13 + (optional == null ? 0 : optional.hashCode())) * 31) + Boolean.hashCode(this.isInQuickResubmitIocExperiment)) * 31) + Boolean.hashCode(this.isInQuickResubmitNotionalExperiment)) * 31;
        EcLimitAndNotionalExperiment.Variant variant = this.limitAndNotionalOrderExperimentVariant;
        return ((iHashCode14 + (variant != null ? variant.hashCode() : 0)) * 31) + Boolean.hashCode(this.isInAutoInsertDecimalExperiment);
    }

    public String toString() {
        return "EventOrderFormDataState(eventContractId=" + this.eventContractId + ", side=" + this.side + ", positionEffect=" + this.positionEffect + ", refId=" + this.refId + ", orderSubmissionState=" + this.orderSubmissionState + ", focusedField=" + this.focusedField + ", orderType=" + this.orderType + ", supportChangingOrderTypes=" + this.supportChangingOrderTypes + ", isGdpEnabled=" + this.isGdpEnabled + ", quantityText=" + this.quantityText + ", inputLimitPrice=" + this.inputLimitPrice + ", userInputLimitPriceText=" + this.userInputLimitPriceText + ", quantityBasedOrderTimeInForce=" + this.quantityBasedOrderTimeInForce + ", gtdTimeInForceInfo=" + this.gtdTimeInForceInfo + ", userInputNotionalAmount=" + this.userInputNotionalAmount + ", userInputNotionalAmountText=" + this.userInputNotionalAmountText + ", estimatedFeesPerQuantity=" + this.estimatedFeesPerQuantity + ", estimatedTotalFee=" + this.estimatedTotalFee + ", contract=" + this.contract + ", futuresAccount=" + this.futuresAccount + ", buyingPower=" + this.buyingPower + ", quoteResult=" + this.quoteResult + ", _feesDto=" + this._feesDto + ", position=" + this.position + ", closingPendingOrderContractQuantity=" + this.closingPendingOrderContractQuantity + ", orderFormDisplayDetails=" + this.orderFormDisplayDetails + ", isInQuickResubmitIocExperiment=" + this.isInQuickResubmitIocExperiment + ", isInQuickResubmitNotionalExperiment=" + this.isInQuickResubmitNotionalExperiment + ", limitAndNotionalOrderExperimentVariant=" + this.limitAndNotionalOrderExperimentVariant + ", isInAutoInsertDecimalExperiment=" + this.isInAutoInsertDecimalExperiment + ")";
    }

    public EventOrderFormDataState(UUID eventContractId, EventOrderSide side, EventOrderPositionEffect positionEffect, UUID refId, OrderSubmissionState orderSubmissionState, OrderFormFocusedField focusedField, OrderFormOrderType orderFormOrderType, boolean z, boolean z2, String quantityText, BigDecimal bigDecimal, String userInputLimitPriceText, OrderFormTimeInForce orderFormTimeInForce, GtdTimeInForceInfo gtdTimeInForceInfo, BigDecimal userInputNotionalAmount, String userInputNotionalAmountText, BigDecimal bigDecimal2, BigDecimal bigDecimal3, EventContract eventContract, FuturesAccount futuresAccount, ApiFuturesBuyingPower apiFuturesBuyingPower, StreamComboQuoteUseCase3 streamComboQuoteUseCase3, GetFeesForTentativeOrderResponseDto _feesDto, UiEventContractPosition uiEventContractPosition, BigDecimal bigDecimal4, Optional<OrderFormDisplayDetails> optional, boolean z3, boolean z4, EcLimitAndNotionalExperiment.Variant variant, boolean z5) {
        Intrinsics.checkNotNullParameter(eventContractId, "eventContractId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(orderSubmissionState, "orderSubmissionState");
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        Intrinsics.checkNotNullParameter(quantityText, "quantityText");
        Intrinsics.checkNotNullParameter(userInputLimitPriceText, "userInputLimitPriceText");
        Intrinsics.checkNotNullParameter(userInputNotionalAmount, "userInputNotionalAmount");
        Intrinsics.checkNotNullParameter(userInputNotionalAmountText, "userInputNotionalAmountText");
        Intrinsics.checkNotNullParameter(_feesDto, "_feesDto");
        this.eventContractId = eventContractId;
        this.side = side;
        this.positionEffect = positionEffect;
        this.refId = refId;
        this.orderSubmissionState = orderSubmissionState;
        this.focusedField = focusedField;
        this.orderType = orderFormOrderType;
        this.supportChangingOrderTypes = z;
        this.isGdpEnabled = z2;
        this.quantityText = quantityText;
        this.inputLimitPrice = bigDecimal;
        this.userInputLimitPriceText = userInputLimitPriceText;
        this.quantityBasedOrderTimeInForce = orderFormTimeInForce;
        this.gtdTimeInForceInfo = gtdTimeInForceInfo;
        this.userInputNotionalAmount = userInputNotionalAmount;
        this.userInputNotionalAmountText = userInputNotionalAmountText;
        this.estimatedFeesPerQuantity = bigDecimal2;
        this.estimatedTotalFee = bigDecimal3;
        this.contract = eventContract;
        this.futuresAccount = futuresAccount;
        this.buyingPower = apiFuturesBuyingPower;
        this.quoteResult = streamComboQuoteUseCase3;
        this._feesDto = _feesDto;
        this.position = uiEventContractPosition;
        this.closingPendingOrderContractQuantity = bigDecimal4;
        this.orderFormDisplayDetails = optional;
        this.isInQuickResubmitIocExperiment = z3;
        this.isInQuickResubmitNotionalExperiment = z4;
        this.limitAndNotionalOrderExperimentVariant = variant;
        this.isInAutoInsertDecimalExperiment = z5;
        boolean z6 = false;
        boolean z7 = isInLimitAndNotionalOrderExperiment() && orderFormOrderType == OrderFormOrderType.QUANTITY_BASED_ORDER && orderFormTimeInForce == OrderFormTimeInForce.GTD;
        this.allowCustomPrice = z7;
        if (z7 && bigDecimal != null && userInputLimitPriceText.length() > 0) {
            z6 = true;
        }
        this.userHasLimitPriceInput = z6;
    }

    public final UUID getEventContractId() {
        return this.eventContractId;
    }

    public final EventOrderSide getSide() {
        return this.side;
    }

    public final EventOrderPositionEffect getPositionEffect() {
        return this.positionEffect;
    }

    public final UUID getRefId() {
        return this.refId;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ EventOrderFormDataState(java.util.UUID r34, com.robinhood.android.models.event.p186db.order.EventOrderSide r35, com.robinhood.android.models.event.p186db.order.EventOrderPositionEffect r36, java.util.UUID r37, com.robinhood.android.event.trade.OrderSubmissionState r38, com.robinhood.android.event.trade.OrderFormFocusedField r39, com.robinhood.android.models.event.p186db.order.OrderFormOrderType r40, boolean r41, boolean r42, java.lang.String r43, java.math.BigDecimal r44, java.lang.String r45, com.robinhood.store.shareprefs.OrderFormTimeInForce r46, com.robinhood.android.eventcontracts.trade.GtdTimeInForceInfo r47, java.math.BigDecimal r48, java.lang.String r49, java.math.BigDecimal r50, java.math.BigDecimal r51, com.robinhood.android.models.event.p186db.arsenal.EventContract r52, com.robinhood.android.models.futures.p189db.FuturesAccount r53, com.robinhood.android.models.futures.api.ApiFuturesBuyingPower r54, com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase3 r55, com.robinhood.ceres.p284v1.GetFeesForTentativeOrderResponseDto r56, com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition r57, java.math.BigDecimal r58, com.robinhood.utils.Optional r59, boolean r60, boolean r61, com.robinhood.android.eventcontracts.experiments.EcLimitAndNotionalExperiment.Variant r62, boolean r63, int r64, kotlin.jvm.internal.DefaultConstructorMarker r65) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.event.trade.EventOrderFormDataState.<init>(java.util.UUID, com.robinhood.android.models.event.db.order.EventOrderSide, com.robinhood.android.models.event.db.order.EventOrderPositionEffect, java.util.UUID, com.robinhood.android.event.trade.OrderSubmissionState, com.robinhood.android.event.trade.OrderFormFocusedField, com.robinhood.android.models.event.db.order.OrderFormOrderType, boolean, boolean, java.lang.String, java.math.BigDecimal, java.lang.String, com.robinhood.store.shareprefs.OrderFormTimeInForce, com.robinhood.android.eventcontracts.trade.GtdTimeInForceInfo, java.math.BigDecimal, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, com.robinhood.android.models.event.db.arsenal.EventContract, com.robinhood.android.models.futures.db.FuturesAccount, com.robinhood.android.models.futures.api.ApiFuturesBuyingPower, com.robinhood.android.eventcontracts.sharedeventui.combos.ComboQuoteResult, com.robinhood.ceres.v1.GetFeesForTentativeOrderResponseDto, com.robinhood.android.models.event.db.ceres.UiEventContractPosition, java.math.BigDecimal, com.robinhood.utils.Optional, boolean, boolean, com.robinhood.android.eventcontracts.experiments.EcLimitAndNotionalExperiment$Variant, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final OrderSubmissionState getOrderSubmissionState() {
        return this.orderSubmissionState;
    }

    public final OrderFormFocusedField getFocusedField() {
        return this.focusedField;
    }

    public final OrderFormOrderType getOrderType() {
        return this.orderType;
    }

    public final boolean getSupportChangingOrderTypes() {
        return this.supportChangingOrderTypes;
    }

    public final boolean isGdpEnabled() {
        return this.isGdpEnabled;
    }

    public final String getQuantityText() {
        return this.quantityText;
    }

    public final BigDecimal getInputLimitPrice() {
        return this.inputLimitPrice;
    }

    public final String getUserInputLimitPriceText() {
        return this.userInputLimitPriceText;
    }

    public final OrderFormTimeInForce getQuantityBasedOrderTimeInForce() {
        return this.quantityBasedOrderTimeInForce;
    }

    public final GtdTimeInForceInfo getGtdTimeInForceInfo() {
        return this.gtdTimeInForceInfo;
    }

    public final BigDecimal getUserInputNotionalAmount() {
        return this.userInputNotionalAmount;
    }

    public final String getUserInputNotionalAmountText() {
        return this.userInputNotionalAmountText;
    }

    public final BigDecimal getEstimatedFeesPerQuantity() {
        return this.estimatedFeesPerQuantity;
    }

    public final BigDecimal getEstimatedTotalFee() {
        return this.estimatedTotalFee;
    }

    public final EventContract getContract() {
        return this.contract;
    }

    public final FuturesAccount getFuturesAccount() {
        return this.futuresAccount;
    }

    public final ApiFuturesBuyingPower getBuyingPower() {
        return this.buyingPower;
    }

    public final StreamComboQuoteUseCase3 getQuoteResult() {
        return this.quoteResult;
    }

    public final UiEventContractPosition getPosition() {
        return this.position;
    }

    public final BigDecimal getClosingPendingOrderContractQuantity() {
        return this.closingPendingOrderContractQuantity;
    }

    public final Optional<OrderFormDisplayDetails> getOrderFormDisplayDetails() {
        return this.orderFormDisplayDetails;
    }

    public final boolean isInQuickResubmitIocExperiment() {
        return this.isInQuickResubmitIocExperiment;
    }

    public final boolean isInQuickResubmitNotionalExperiment() {
        return this.isInQuickResubmitNotionalExperiment;
    }

    public final EcLimitAndNotionalExperiment.Variant getLimitAndNotionalOrderExperimentVariant() {
        return this.limitAndNotionalOrderExperimentVariant;
    }

    public final boolean isInAutoInsertDecimalExperiment() {
        return this.isInAutoInsertDecimalExperiment;
    }

    private final boolean isLoadingCriticalDisplayInfo() {
        if (this.contract != null) {
            return this.isGdpEnabled && this.orderFormDisplayDetails == null;
        }
        return true;
    }

    private final StringResource getBuyingPowerDisplay() {
        BigDecimal swaps_buying_power;
        ApiFuturesBuyingPower apiFuturesBuyingPower = this.buyingPower;
        if (apiFuturesBuyingPower == null || (swaps_buying_power = apiFuturesBuyingPower.getSwaps_buying_power()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C16465R.string.events_order_form_buying_power_label, Formats.getPriceFormat().format(swaps_buying_power));
    }

    public final BigDecimal getQuantity$feature_event_trade_externalDebug() {
        BigDecimal quotePrice;
        BigDecimal bigDecimal;
        OrderFormOrderType orderFormOrderType = this.orderType;
        int i = orderFormOrderType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderFormOrderType.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i != 1) {
            if (i == 2 || i == 3) {
                return StringsKt.toBigDecimalOrNull(this.quantityText);
            }
            throw new NoWhenBranchMatchedException();
        }
        BigDecimal bigDecimal2 = this.userInputNotionalAmount;
        if (!BigDecimals7.isPositive(bigDecimal2)) {
            bigDecimal2 = null;
        }
        if (bigDecimal2 == null || (quotePrice = getQuotePrice()) == null || (bigDecimal = this.estimatedFeesPerQuantity) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(quotePrice.add(bigDecimal), "add(...)");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(BigDecimals7.toIntRoundDown(BigDecimals7.safeDivide(bigDecimal2, r1)));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    public final BigDecimal getQuantityAvailableForClosing$feature_event_trade_externalDebug() {
        BigDecimal quantity;
        int i = WhenMappings.$EnumSwitchMapping$1[this.positionEffect.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        UiEventContractPosition uiEventContractPosition = this.position;
        BigDecimal bigDecimalAbs = (uiEventContractPosition == null || (quantity = uiEventContractPosition.getQuantity()) == null) ? null : quantity.abs();
        BigDecimal bigDecimal = this.closingPendingOrderContractQuantity;
        if (bigDecimalAbs == null || bigDecimal == null) {
            return null;
        }
        BigDecimal bigDecimalSubtract = bigDecimalAbs.subtract(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return (BigDecimal) RangesKt.coerceAtLeast(bigDecimalSubtract, ZERO);
    }

    private final StringResource getQuantityAvailableSubtitle() {
        BigDecimal quantityAvailableForClosing$feature_event_trade_externalDebug = getQuantityAvailableForClosing$feature_event_trade_externalDebug();
        if (quantityAvailableForClosing$feature_event_trade_externalDebug != null) {
            return StringResource.INSTANCE.invoke(C16465R.string.events_order_form_position_label, Formats.getIntegerFormat().format(quantityAvailableForClosing$feature_event_trade_externalDebug));
        }
        return null;
    }

    private final boolean isInLimitAndNotionalOrderExperiment() {
        EcLimitAndNotionalExperiment.Variant variant = this.limitAndNotionalOrderExperimentVariant;
        return variant != null && variant.isInTreatmentExperience();
    }

    private final BigDecimal getDisplayedPriceForOrder() {
        BigDecimal bigDecimal;
        return (!this.allowCustomPrice || (bigDecimal = this.inputLimitPrice) == null) ? getQuotePrice() : bigDecimal;
    }

    private final BigDecimal getQuotePrice() {
        StreamComboQuoteUseCase3 streamComboQuoteUseCase3 = this.quoteResult;
        if (streamComboQuoteUseCase3 != null) {
            return streamComboQuoteUseCase3.getDisplayQuotePrice(this.positionEffect, this.side);
        }
        return null;
    }

    private final StringResource getCostOrCreditLabel() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$1[this.positionEffect.ordinal()];
        if (i2 == 1) {
            i = C16465R.string.events_order_form_estimated_cost_label;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C16465R.string.events_order_form_estimated_total_credit_label;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final BigDecimal getSubmissionPrice$feature_event_trade_externalDebug() {
        if (this.userHasLimitPriceInput) {
            BigDecimal bigDecimal = this.inputLimitPrice;
            if (bigDecimal == null) {
                return null;
            }
            int i = WhenMappings.$EnumSwitchMapping$1[this.positionEffect.ordinal()];
            if (i == 1) {
                int i2 = WhenMappings.$EnumSwitchMapping$2[this.side.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    BigDecimal ONE = BigDecimal.ONE;
                    Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                    BigDecimal bigDecimalSubtract = ONE.subtract(bigDecimal);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                    return bigDecimalSubtract;
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i3 = WhenMappings.$EnumSwitchMapping$2[this.side.ordinal()];
                if (i3 == 1) {
                    BigDecimal ONE2 = BigDecimal.ONE;
                    Intrinsics.checkNotNullExpressionValue(ONE2, "ONE");
                    BigDecimal bigDecimalSubtract2 = ONE2.subtract(bigDecimal);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                    return bigDecimalSubtract2;
                }
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return bigDecimal;
        }
        StreamComboQuoteUseCase3 streamComboQuoteUseCase3 = this.quoteResult;
        if (streamComboQuoteUseCase3 != null) {
            return streamComboQuoteUseCase3.getSubmissionPrice(this.side);
        }
        return null;
    }

    private final StringResource getFeesDisplay() {
        IdlDecimal amount;
        BigDecimal bigDecimalOrNull;
        StringResource stringResourceInvoke;
        MoneyDto total_fee = this._feesDto.getTotal_fee();
        if (total_fee == null || (amount = total_fee.getAmount()) == null || (bigDecimalOrNull = amount.toBigDecimalOrNull()) == null) {
            return null;
        }
        String str = Formats.getPriceFormat().format(bigDecimalOrNull);
        EventContract eventContract = this.contract;
        ExchangeSource exchangeSource = eventContract != null ? eventContract.getExchangeSource() : null;
        if ((exchangeSource == null ? -1 : WhenMappings.$EnumSwitchMapping$3[exchangeSource.ordinal()]) == 1) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C16465R.string.events_order_form_fees_display_forecastex, str);
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C16465R.string.events_order_form_fees_display_other, str);
        }
        int i = WhenMappings.$EnumSwitchMapping$1[this.positionEffect.ordinal()];
        if (i == 1) {
            return stringResourceInvoke;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        BigDecimal displayedPriceForOrder = getDisplayedPriceForOrder();
        if (displayedPriceForOrder == null) {
            return null;
        }
        BigDecimal quantity$feature_event_trade_externalDebug = getQuantity$feature_event_trade_externalDebug();
        if (quantity$feature_event_trade_externalDebug == null) {
            quantity$feature_event_trade_externalDebug = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(quantity$feature_event_trade_externalDebug);
        return StringResource.INSTANCE.invoke(C16465R.string.events_order_form_estimated_credit_joiner, estimatedCreditExplainer(displayedPriceForOrder, quantity$feature_event_trade_externalDebug), stringResourceInvoke);
    }

    private final BigDecimal getEstimatedCostOrCredit() {
        MoneyDto total_fee;
        IdlDecimal amount;
        BigDecimal bigDecimalOrNull;
        BigDecimal quantity$feature_event_trade_externalDebug = getQuantity$feature_event_trade_externalDebug();
        if (quantity$feature_event_trade_externalDebug == null) {
            return BigDecimal.ZERO;
        }
        BigDecimal displayedPriceForOrder = getDisplayedPriceForOrder();
        if (displayedPriceForOrder == null || (total_fee = this._feesDto.getTotal_fee()) == null || (amount = total_fee.getAmount()) == null || (bigDecimalOrNull = amount.toBigDecimalOrNull()) == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[this.positionEffect.ordinal()];
        if (i == 1) {
            BigDecimal bigDecimalMultiply = displayedPriceForOrder.multiply(quantity$feature_event_trade_externalDebug);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            BigDecimal bigDecimalAdd = bigDecimalMultiply.add(bigDecimalOrNull);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            return bigDecimalAdd;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        BigDecimal bigDecimalMultiply2 = displayedPriceForOrder.multiply(quantity$feature_event_trade_externalDebug);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        BigDecimal bigDecimalSubtract = bigDecimalMultiply2.subtract(bigDecimalOrNull);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    private final StringResource getEstimatedCostOrCreditDisplay() {
        BigDecimal estimatedCostOrCredit = getEstimatedCostOrCredit();
        if (estimatedCostOrCredit != null) {
            return StringResource.INSTANCE.invoke(Formats.getPriceFormat().format(estimatedCostOrCredit));
        }
        return null;
    }

    public final ExchangeSource getExchangeSource() {
        EventContract eventContract = this.contract;
        if (eventContract != null) {
            return eventContract.getExchangeSource();
        }
        return null;
    }

    private final StringResource estimatedCreditExplainer(BigDecimal price, BigDecimal quantity) {
        return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C16465R.plurals.events_order_form_estimated_credit_explainer, BigDecimals7.toIntRounded(quantity)), Formats.getPriceFormat().format(price), Formats.getIntegerFormat().format(quantity));
    }

    private final BigDecimal totalPayout(BigDecimal quantityForPayout) {
        BigDecimal multiplier;
        EventContract eventContract = this.contract;
        if (eventContract == null || (multiplier = eventContract.getMultiplier()) == null) {
            return null;
        }
        if (quantityForPayout == null) {
            quantityForPayout = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(quantityForPayout);
        BigDecimal bigDecimalMultiply = quantityForPayout.multiply(multiplier);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    public final UiEventOrderContext getOrderContext() {
        BigDecimal quantity$feature_event_trade_externalDebug;
        BigDecimal submissionPrice$feature_event_trade_externalDebug;
        FuturesTimeInForce futuresTimeInForce;
        BigDecimal bigDecimal;
        EventsOrderContextFactory eventsOrderContextFactory;
        UUID uuid;
        ProposalData proposalData;
        FuturesAccount futuresAccount;
        EventQuote eventQuote;
        Instant expireTime;
        BigDecimal bigDecimal2;
        GtdTimeInForceInfo gtdTimeInForceInfo;
        FuturesTimeInForce futuresTimeInForce2;
        if (this.futuresAccount == null || (quantity$feature_event_trade_externalDebug = getQuantity$feature_event_trade_externalDebug()) == null || BigDecimals7.isZero(quantity$feature_event_trade_externalDebug) || (submissionPrice$feature_event_trade_externalDebug = getSubmissionPrice$feature_event_trade_externalDebug()) == null) {
            return null;
        }
        OrderFormOrderType orderFormOrderType = this.orderType;
        int i = orderFormOrderType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderFormOrderType.ordinal()];
        if (i == -1) {
            futuresTimeInForce = null;
        } else {
            if (i == 1) {
                futuresTimeInForce2 = FuturesTimeInForce.IOC;
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                OrderFormTimeInForce orderFormTimeInForce = this.quantityBasedOrderTimeInForce;
                if (orderFormTimeInForce != null) {
                    futuresTimeInForce2 = orderFormTimeInForce.toFuturesTimeInForce();
                }
                futuresTimeInForce = null;
            }
            futuresTimeInForce = futuresTimeInForce2;
        }
        if (futuresTimeInForce == null) {
            return null;
        }
        EventsOrderContextFactory eventsOrderContextFactory2 = EventsOrderContextFactory.INSTANCE;
        UUID uuid2 = this.refId;
        FuturesAccount futuresAccount2 = this.futuresAccount;
        StreamComboQuoteUseCase3 streamComboQuoteUseCase3 = this.quoteResult;
        StreamComboQuoteUseCase3.Quote quote = streamComboQuoteUseCase3 instanceof StreamComboQuoteUseCase3.Quote ? (StreamComboQuoteUseCase3.Quote) streamComboQuoteUseCase3 : null;
        EventQuote data = quote != null ? quote.getData() : null;
        StreamComboQuoteUseCase3 streamComboQuoteUseCase32 = this.quoteResult;
        StreamComboQuoteUseCase3.Proposals proposals = streamComboQuoteUseCase32 instanceof StreamComboQuoteUseCase3.Proposals ? (StreamComboQuoteUseCase3.Proposals) streamComboQuoteUseCase32 : null;
        ProposalData data2 = proposals != null ? proposals.getData() : null;
        UUID uuid3 = this.eventContractId;
        EventQuote eventQuote2 = data;
        EventOrderSide eventOrderSide = this.side;
        OrderFormOrderType orderFormOrderType2 = this.orderType;
        int i2 = orderFormOrderType2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderFormOrderType2.ordinal()];
        if (i2 == -1) {
            bigDecimal = null;
        } else if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            bigDecimal = null;
        } else {
            bigDecimal = this.userInputNotionalAmount;
        }
        if (futuresTimeInForce != FuturesTimeInForce.GTD || (gtdTimeInForceInfo = this.gtdTimeInForceInfo) == null) {
            eventsOrderContextFactory = eventsOrderContextFactory2;
            uuid = uuid2;
            proposalData = data2;
            futuresAccount = futuresAccount2;
            eventQuote = eventQuote2;
            expireTime = null;
            bigDecimal2 = bigDecimal;
        } else {
            uuid = uuid2;
            proposalData = data2;
            futuresAccount = futuresAccount2;
            eventQuote = eventQuote2;
            bigDecimal2 = bigDecimal;
            expireTime = gtdTimeInForceInfo.getExpireTime();
            eventsOrderContextFactory = eventsOrderContextFactory2;
        }
        return eventsOrderContextFactory.create(uuid, futuresAccount, eventQuote, proposalData, uuid3, eventOrderSide, submissionPrice$feature_event_trade_externalDebug, quantity$feature_event_trade_externalDebug, bigDecimal2, futuresTimeInForce, expireTime);
    }

    private final StringResource getOrderSummaryString() {
        OrderFormOrderType orderFormOrderType = this.orderType;
        int i = orderFormOrderType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderFormOrderType.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return getOrderSummaryStringNotionalBased();
        }
        if (i == 2) {
            return getOrderSummaryStringQuantityBased();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return getOrderSummaryStringQuantityBased();
    }

    private final StringResource getOrderSummaryStringNotionalBased() {
        StreamComboQuoteUseCase3 streamComboQuoteUseCase3 = this.quoteResult;
        if (streamComboQuoteUseCase3 instanceof StreamComboQuoteUseCase3.Quote) {
            return getOrderSummaryStringNotionalBasedForNonComboOrder();
        }
        if (streamComboQuoteUseCase3 instanceof StreamComboQuoteUseCase3.Proposals) {
            return getOrderSummaryStringNotionalBasedForComboOrder((StreamComboQuoteUseCase3.Proposals) streamComboQuoteUseCase3);
        }
        if ((streamComboQuoteUseCase3 instanceof StreamComboQuoteUseCase3.Error) || (streamComboQuoteUseCase3 instanceof StreamComboQuoteUseCase3.Timeout) || streamComboQuoteUseCase3 == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final StringResource getOrderSummaryStringNotionalBasedForComboOrder(StreamComboQuoteUseCase3.Proposals proposal) {
        Tuples2 tuples2M3642to;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        StringResource contractNameWithLegsForOrderSummary;
        BigDecimal bigDecimalSubtract;
        BigDecimal price;
        ProposalData data = proposal.getData();
        if (data == null) {
            return null;
        }
        if (this.positionEffect == EventOrderPositionEffect.OPEN) {
            ProposalData.Proposal noBid = data.getNoBid();
            BigDecimal quantity = noBid != null ? noBid.getQuantity() : null;
            ProposalData.Proposal noBid2 = data.getNoBid();
            if (noBid2 == null || (price = noBid2.getPrice()) == null) {
                bigDecimalSubtract = null;
            } else {
                BigDecimal ONE = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                bigDecimalSubtract = ONE.subtract(price);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            }
            tuples2M3642to = Tuples4.m3642to(quantity, bigDecimalSubtract);
        } else {
            ProposalData.Proposal yesBid = data.getYesBid();
            BigDecimal quantity2 = yesBid != null ? yesBid.getQuantity() : null;
            ProposalData.Proposal yesBid2 = data.getYesBid();
            tuples2M3642to = Tuples4.m3642to(quantity2, yesBid2 != null ? yesBid2.getPrice() : null);
        }
        BigDecimal bigDecimal3 = (BigDecimal) tuples2M3642to.getFirst();
        if (bigDecimal3 == null || (bigDecimal = (BigDecimal) tuples2M3642to.getSecond()) == null || (bigDecimal2 = this.estimatedTotalFee) == null || (contractNameWithLegsForOrderSummary = getContractNameWithLegsForOrderSummary()) == null) {
            return null;
        }
        NumberFormatter currencyFormat = Formats.getCurrencyFormat();
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimal3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalAdd = bigDecimalMultiply.add(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return EventOrderFormStringUtils.INSTANCE.buildNotionalSummary(OrderFormTimeInForce.FOK, this.positionEffect, Formats.getCurrencyFormat().format(this.userInputNotionalAmount), contractNameWithLegsForOrderSummary, Formats.getCurrencyFormat().format(bigDecimal), BigDecimals7.toIntRoundDown(bigDecimal3), currencyFormat.format(bigDecimalAdd));
    }

    private final StringResource getOrderSummaryStringNotionalBasedForNonComboOrder() {
        BigDecimal bigDecimal;
        StringResource contractNameWithLegsForOrderSummary;
        BigDecimal quantity$feature_event_trade_externalDebug = getQuantity$feature_event_trade_externalDebug();
        if (quantity$feature_event_trade_externalDebug == null) {
            return null;
        }
        int intRoundDown = BigDecimals7.toIntRoundDown(quantity$feature_event_trade_externalDebug);
        BigDecimal displayedPriceForOrder = getDisplayedPriceForOrder();
        if (displayedPriceForOrder == null || (bigDecimal = this.estimatedFeesPerQuantity) == null || (contractNameWithLegsForOrderSummary = getContractNameWithLegsForOrderSummary()) == null) {
            return null;
        }
        NumberFormatter currencyFormat = Formats.getCurrencyFormat();
        BigDecimal bigDecimalAdd = displayedPriceForOrder.add(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        BigDecimal bigDecimalMultiply = bigDecimalAdd.multiply(new BigDecimal(intRoundDown));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return EventOrderFormStringUtils.INSTANCE.buildNotionalSummary(OrderFormTimeInForce.IOC, this.positionEffect, Formats.getCurrencyFormat().format(this.userInputNotionalAmount), contractNameWithLegsForOrderSummary, Formats.getCurrencyFormat().format(displayedPriceForOrder), intRoundDown, currencyFormat.format(bigDecimalMultiply));
    }

    private final StringResource getOrderSummaryStringQuantityBased() {
        BigDecimal quantity$feature_event_trade_externalDebug;
        OrderFormTimeInForce orderFormTimeInForce;
        StringResource contractNameWithLegsForOrderSummary;
        int i;
        StringResource displayString;
        if (this.contract == null || (quantity$feature_event_trade_externalDebug = getQuantity$feature_event_trade_externalDebug()) == null || (orderFormTimeInForce = this.quantityBasedOrderTimeInForce) == null || (contractNameWithLegsForOrderSummary = getContractNameWithLegsForOrderSummary()) == null || (i = WhenMappings.$EnumSwitchMapping$4[orderFormTimeInForce.ordinal()]) == 1) {
            return null;
        }
        if (i == 2 || i == 3) {
            return EventOrderFormStringUtils.INSTANCE.buildQuantityIocOrFokSummary(orderFormTimeInForce, this.positionEffect, BigDecimals7.toIntRounded(quantity$feature_event_trade_externalDebug), contractNameWithLegsForOrderSummary);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        GtdTimeInForceInfo gtdTimeInForceInfo = this.gtdTimeInForceInfo;
        if (gtdTimeInForceInfo == null || (displayString = gtdTimeInForceInfo.getDisplayString()) == null) {
            return null;
        }
        return EventOrderFormStringUtils.INSTANCE.buildQuantityGtdSummary(orderFormTimeInForce, this.positionEffect, BigDecimals7.toIntRounded(quantity$feature_event_trade_externalDebug), contractNameWithLegsForOrderSummary, displayString);
    }

    private final EventOrderFormViewState.PayoutData getPayoutData(boolean isReceipt, BigDecimal quantityForPayout) {
        StringResource stringResourceInvoke;
        int i = WhenMappings.$EnumSwitchMapping$1[this.positionEffect.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i2 = WhenMappings.$EnumSwitchMapping$2[this.side.ordinal()];
        if (i2 == 1) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C16465R.string.events_order_form_payout_yes_label, new Object[0]);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            stringResourceInvoke = StringResource.INSTANCE.invoke(C16465R.string.events_order_form_payout_no_label, new Object[0]);
        }
        BigDecimal bigDecimal = totalPayout(quantityForPayout);
        StringResource stringResourceInvoke2 = bigDecimal != null ? StringResource.INSTANCE.invoke(Formats.getPriceFormat().format(bigDecimal)) : null;
        if (isReceipt) {
            return new EventOrderFormViewState.PayoutData.Receipt(stringResourceInvoke, stringResourceInvoke2);
        }
        return new EventOrderFormViewState.PayoutData.OrderForm(stringResourceInvoke, stringResourceInvoke2);
    }

    private final StringResource getYesOrNoWithContractName() {
        String displayShortName;
        Optional<OrderFormDisplayDetails> optional = this.orderFormDisplayDetails;
        if (optional == null) {
            return null;
        }
        if (optional instanceof Some) {
            return StringResource.INSTANCE.invoke(((OrderFormDisplayDetails) ((Some) optional).getOrNull()).getYesOrNoWithContractName());
        }
        EventContract eventContract = this.contract;
        if (eventContract == null || (displayShortName = eventContract.getDisplayShortName()) == null) {
            return null;
        }
        return EventOrderFormStringUtils.INSTANCE.buildOutcomeWithContractNameForSingleLeg(this.side, this.positionEffect, displayShortName);
    }

    private final StringResource getContractNameWithLegsForOrderSummary() {
        OrderFormDisplayDetails orNull;
        Optional<OrderFormDisplayDetails> optional = this.orderFormDisplayDetails;
        List<String> selectedLegStrings = (optional == null || (orNull = optional.getOrNull()) == null) ? null : orNull.getSelectedLegStrings();
        if (selectedLegStrings != null && selectedLegStrings.size() > 1) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C16465R.string.events_order_form_contract_name_with_legs_multi_leg;
            StringResource yesOrNoWithContractName = getYesOrNoWithContractName();
            if (yesOrNoWithContractName == null) {
                return null;
            }
            return companion.invoke(i, yesOrNoWithContractName, CollectionsKt.joinToString$default(selectedLegStrings, ", ", null, null, 0, null, null, 62, null));
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        int i2 = C16465R.string.events_order_form_contract_name_with_legs_single_leg;
        StringResource yesOrNoWithContractName2 = getYesOrNoWithContractName();
        if (yesOrNoWithContractName2 == null) {
            return null;
        }
        return companion2.invoke(i2, yesOrNoWithContractName2);
    }

    private final StringResource getOrderTitle() {
        int i;
        String displayShortName;
        Optional<OrderFormDisplayDetails> optional = this.orderFormDisplayDetails;
        if (optional == null) {
            return null;
        }
        if (optional instanceof Some) {
            return StringResource.INSTANCE.invoke(((OrderFormDisplayDetails) ((Some) optional).getValue()).getOrderTitle());
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$1[this.positionEffect.ordinal()];
        if (i2 == 1) {
            int i3 = WhenMappings.$EnumSwitchMapping$2[this.side.ordinal()];
            if (i3 == 1) {
                i = C16465R.string.events_order_form_title_buy_yes;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C16465R.string.events_order_form_title_buy_no;
            }
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i4 = WhenMappings.$EnumSwitchMapping$2[this.side.ordinal()];
            if (i4 == 1) {
                i = C16465R.string.events_order_form_title_close_no;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C16465R.string.events_order_form_title_close_yes;
            }
        }
        EventContract eventContract = this.contract;
        if (eventContract == null || (displayShortName = eventContract.getDisplayShortName()) == null) {
            displayShortName = "";
        }
        return companion.invoke(i, displayShortName);
    }

    private final StringResource getOrderSubtitle() {
        OrderFormDisplayDetails orNull;
        String orderSubtitle;
        Optional<OrderFormDisplayDetails> optional = this.orderFormDisplayDetails;
        if (optional == null || (orNull = optional.getOrNull()) == null || (orderSubtitle = orNull.getOrderSubtitle()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(orderSubtitle);
    }

    private final EventOrderFormViewState.OrderFormContentData.QuantityBasedData getQuantityBasedData() {
        String str;
        EventOrderFormViewState.OrderFormContentData.QuantityBasedData.Title title;
        StringResource buyingPowerDisplay;
        boolean z;
        TextFieldValue textFieldValue$default;
        OrderSubmissionState.Editing editing;
        TextFieldValue textFieldValue;
        boolean z2;
        OrderSubmissionState.Editing editing2;
        boolean z3;
        boolean z4;
        String str2;
        String str3;
        BigDecimal askPrice;
        String str4;
        BigDecimal bidPrice;
        String str5;
        EventContract eventContract;
        Optional<OrderFormDisplayDetails> optional;
        OrderFormDisplayDetails orNull;
        List<String> selectedLegStrings;
        if (this.orderType != OrderFormOrderType.QUANTITY_BASED_ORDER) {
            return null;
        }
        BigDecimal displayedPriceForOrder = getDisplayedPriceForOrder();
        if (displayedPriceForOrder == null || (str = Formats.getPriceFormat().format(displayedPriceForOrder)) == null) {
            str = PlaceholderUtils.XXShortPlaceholderText;
        }
        String str6 = str;
        EventOrderSide eventOrderSide = this.side;
        StringResource orderTitle = getOrderTitle();
        if (orderTitle != null) {
            title = new EventOrderFormViewState.OrderFormContentData.QuantityBasedData.Title(orderTitle, (!Intrinsics.areEqual(this.orderSubmissionState, OrderSubmissionState.Editing.INSTANCE) || (optional = this.orderFormDisplayDetails) == null || (orNull = optional.getOrNull()) == null || (selectedLegStrings = orNull.getSelectedLegStrings()) == null) ? null : CollectionsKt.joinToString$default(selectedLegStrings, "\n", null, null, 0, null, null, 62, null));
        } else {
            title = null;
        }
        StringResource orderSubtitle = getOrderSubtitle();
        TextFieldValue textFieldValue$default2 = TextFieldValues.toTextFieldValue$default(this.quantityText, "0", false, 2, null);
        int i = WhenMappings.$EnumSwitchMapping$1[this.positionEffect.ordinal()];
        boolean z5 = true;
        if (i == 1) {
            buyingPowerDisplay = getBuyingPowerDisplay();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            buyingPowerDisplay = getQuantityAvailableSubtitle();
        }
        StringResource stringResource = buyingPowerDisplay;
        boolean z6 = this.quantityText.length() == 0;
        OrderSubmissionState orderSubmissionState = this.orderSubmissionState;
        OrderSubmissionState.Editing editing3 = OrderSubmissionState.Editing.INSTANCE;
        if (Intrinsics.areEqual(orderSubmissionState, editing3)) {
            z = true;
        } else {
            if (!Intrinsics.areEqual(orderSubmissionState, OrderSubmissionState.Reviewing.INSTANCE) && !(orderSubmissionState instanceof OrderSubmissionState.Submitting)) {
                throw new NoWhenBranchMatchedException();
            }
            z = true;
            z5 = false;
        }
        if (!this.userHasLimitPriceInput) {
            textFieldValue$default = TextFieldValues.toTextFieldValue$default(str6, null, false, 3, null);
        } else {
            textFieldValue$default = TextFieldValues.toTextFieldValue$default(this.userInputLimitPriceText, null, false, 3, null);
        }
        if (getDisplayedPriceForOrder() == null) {
            editing = editing3;
            textFieldValue = textFieldValue$default;
            z2 = z;
        } else {
            editing = editing3;
            textFieldValue = textFieldValue$default;
            z2 = false;
        }
        boolean z7 = !this.userHasLimitPriceInput;
        if (EventOrderFormDataState2.isEditableState(this.orderSubmissionState) && this.allowCustomPrice) {
            editing2 = editing;
            z3 = z7;
            z4 = z;
        } else {
            editing2 = editing;
            z3 = z7;
            z4 = false;
        }
        EventOrderFormViewState.OrderFormContentData.PriceData priceData = new EventOrderFormViewState.OrderFormContentData.PriceData(str6, textFieldValue, z2, z3, z4);
        OrderFormTimeInForce orderFormTimeInForce = this.quantityBasedOrderTimeInForce;
        if (!isInLimitAndNotionalOrderExperiment() || (eventContract = this.contract) == null || eventContract.isComboContract()) {
            orderFormTimeInForce = null;
        }
        if (!isInLimitAndNotionalOrderExperiment() || !Intrinsics.areEqual(this.orderSubmissionState, editing2)) {
            z = false;
        }
        GtdTimeInForceInfo gtdTimeInForceInfo = this.gtdTimeInForceInfo;
        StringResource displayString = gtdTimeInForceInfo != null ? gtdTimeInForceInfo.getDisplayString() : null;
        StringResource estimatedCostOrCreditDisplay = getEstimatedCostOrCreditDisplay();
        StringResource feesDisplay = getFeesDisplay();
        EventOrderFormViewState.PayoutData payoutData = getPayoutData(false, getQuantity$feature_event_trade_externalDebug());
        StreamComboQuoteUseCase3 streamComboQuoteUseCase3 = this.quoteResult;
        if (streamComboQuoteUseCase3 instanceof StreamComboQuoteUseCase3.Quote) {
            EventQuote data = ((StreamComboQuoteUseCase3.Quote) streamComboQuoteUseCase3).getData();
            str2 = (data == null || (bidPrice = data.getBidPrice(this.positionEffect, this.side)) == null || (str5 = Formats.getPriceFormat().format(bidPrice)) == null) ? "-" : str5;
        } else {
            str2 = null;
        }
        StreamComboQuoteUseCase3 streamComboQuoteUseCase32 = this.quoteResult;
        if (streamComboQuoteUseCase32 instanceof StreamComboQuoteUseCase3.Quote) {
            EventQuote data2 = ((StreamComboQuoteUseCase3.Quote) streamComboQuoteUseCase32).getData();
            str3 = (data2 == null || (askPrice = data2.getAskPrice(this.positionEffect, this.side)) == null || (str4 = Formats.getPriceFormat().format(askPrice)) == null) ? "-" : str4;
        } else {
            str3 = null;
        }
        return new EventOrderFormViewState.OrderFormContentData.QuantityBasedData(eventOrderSide, title, orderSubtitle, textFieldValue$default2, stringResource, z6, z5, priceData, orderFormTimeInForce, z, displayString, estimatedCostOrCreditDisplay, feesDisplay, payoutData, getCostOrCreditLabel(), str2, str3);
    }

    private final EventOrderFormViewState.OrderFormContentData.NotionalBasedData getNotionalBasedData() {
        String str;
        BigDecimal swaps_buying_power;
        if (this.orderType != OrderFormOrderType.NOTIONAL_BASED_ORDER) {
            return null;
        }
        StringResource orderTitle = getOrderTitle();
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C16465R.string.events_order_form_notional_buying_power;
        ApiFuturesBuyingPower apiFuturesBuyingPower = this.buyingPower;
        if (apiFuturesBuyingPower == null || (swaps_buying_power = apiFuturesBuyingPower.getSwaps_buying_power()) == null || (str = Formats.getPriceFormat().format(swaps_buying_power)) == null) {
            str = "";
        }
        StringResource stringResourceInvoke = companion.invoke(i, str);
        String str2 = this.userInputNotionalAmountText;
        BigDecimal bigDecimal = this.userInputNotionalAmount;
        EventOrderFormViewState.OrderFormContentData.EditingSubTextState editingSubtext = Intrinsics.areEqual(bigDecimal, BigDecimal.ZERO) ? null : getEditingSubtext(getQuantity$feature_event_trade_externalDebug(), this.quoteResult);
        BigDecimal quantity$feature_event_trade_externalDebug = getQuantity$feature_event_trade_externalDebug();
        int intRoundDown = quantity$feature_event_trade_externalDebug != null ? BigDecimals7.toIntRoundDown(quantity$feature_event_trade_externalDebug) : 0;
        return new EventOrderFormViewState.OrderFormContentData.NotionalBasedData(stringResourceInvoke, orderTitle, str2, bigDecimal, editingSubtext, companion.invoke(new StringResource.PluralsResource(C16465R.plurals.order_form_notional_review_subtext, intRoundDown), Formats.getShareQuantityFormat().format(Integer.valueOf(intRoundDown))), orderTitle);
    }

    private final EventOrderFormViewState.OrderFormContentData.EditingSubTextState getEditingSubtext(BigDecimal quantity, StreamComboQuoteUseCase3 comboQuoteResult) {
        if (comboQuoteResult instanceof StreamComboQuoteUseCase3.Error) {
            return new EventOrderFormViewState.OrderFormContentData.EditingSubTextState.Error(StringResource.INSTANCE.invoke(((StreamComboQuoteUseCase3.Error) comboQuoteResult).getMessage()));
        }
        if (comboQuoteResult instanceof StreamComboQuoteUseCase3.Timeout) {
            return new EventOrderFormViewState.OrderFormContentData.EditingSubTextState.Error(StringResource.INSTANCE.invoke(C16465R.string.combo_order_proposal_error, new Object[0]));
        }
        ProposalData.Proposal yesBid = null;
        if (comboQuoteResult instanceof StreamComboQuoteUseCase3.Proposals) {
            ProposalData data = ((StreamComboQuoteUseCase3.Proposals) comboQuoteResult).getData();
            if (this.positionEffect == EventOrderPositionEffect.OPEN) {
                if (data != null) {
                    yesBid = data.getNoBid();
                }
            } else if (data != null) {
                yesBid = data.getYesBid();
            }
            if (data == null) {
                return new EventOrderFormViewState.OrderFormContentData.EditingSubTextState.Loading(StringResource.INSTANCE.invoke(C16465R.string.combo_order_loading_proposal, new Object[0]));
            }
            if (yesBid == null) {
                return new EventOrderFormViewState.OrderFormContentData.EditingSubTextState.Error(StringResource.INSTANCE.invoke(C16465R.string.combo_order_proposal_error, new Object[0]));
            }
            return new EventOrderFormViewState.OrderFormContentData.EditingSubTextState.Loaded(StringResource.INSTANCE.invoke(C16465R.string.combo_order_potential_payout, Formats.getPriceFormat().format(yesBid.getQuantity())));
        }
        if (!(comboQuoteResult instanceof StreamComboQuoteUseCase3.Quote)) {
            if (comboQuoteResult == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        BigDecimal bigDecimal = totalPayout(quantity);
        if (bigDecimal == null || !BigDecimals7.isPositive(bigDecimal)) {
            return null;
        }
        return new EventOrderFormViewState.OrderFormContentData.EditingSubTextState.Loaded(StringResource.INSTANCE.invoke(C16465R.string.order_form_notional_editing_subtext, Formats.getPriceFormat().format(bigDecimal)));
    }

    public final EventOrderFormViewState.OrderFormContentData getOrderFormContentData() {
        boolean z;
        EventOrderFormScreen6 eventOrderFormScreen6;
        boolean z2 = isInLimitAndNotionalOrderExperiment() && this.positionEffect == EventOrderPositionEffect.CLOSE && this.orderType == OrderFormOrderType.QUANTITY_BASED_ORDER && this.quantityText.length() == 0;
        boolean zAreEqual = Intrinsics.areEqual(this.orderSubmissionState, OrderSubmissionState.Editing.INSTANCE);
        FuturesAccount futuresAccount = this.futuresAccount;
        StringResource stringResourceInvoke = null;
        String rhsAccountNumber = futuresAccount != null ? futuresAccount.getRhsAccountNumber() : null;
        EventContract eventContract = this.contract;
        UUID contractId = eventContract != null ? eventContract.getContractId() : null;
        StringResource orderSummaryString = getOrderSummaryString();
        OrderFormOrderType orderFormOrderType = this.orderType;
        int i = orderFormOrderType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderFormOrderType.ordinal()];
        if (i == -1) {
            z = false;
        } else {
            if (i == 1) {
                ExchangeSource exchangeSource = getExchangeSource();
                int i2 = exchangeSource == null ? -1 : WhenMappings.$EnumSwitchMapping$3[exchangeSource.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1 || i2 == 2) {
                        z = true;
                    } else if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        if (!isInLimitAndNotionalOrderExperiment()) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C16465R.string.events_order_form_limit_order, new Object[0]);
        } else if (zAreEqual) {
            OrderFormOrderType orderFormOrderType2 = this.orderType;
            int i3 = orderFormOrderType2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderFormOrderType2.ordinal()];
            if (i3 != -1) {
                if (i3 == 1) {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C16465R.string.events_order_form_notional_order, new Object[0]);
                } else {
                    if (i3 != 2 && i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (this.supportChangingOrderTypes) {
                        stringResourceInvoke = StringResource.INSTANCE.invoke(C16465R.string.events_order_form_limit_order_new, new Object[0]);
                    } else {
                        stringResourceInvoke = StringResource.INSTANCE.invoke(C16465R.string.events_order_form_limit_order, new Object[0]);
                    }
                }
            }
        }
        StringResource stringResource = stringResourceInvoke;
        EventOrderFormViewState.OrderFormContentData.QuantityBasedData quantityBasedData = getQuantityBasedData();
        EventOrderFormViewState.OrderFormContentData.NotionalBasedData notionalBasedData = getNotionalBasedData();
        if (z2) {
            eventOrderFormScreen6 = EventOrderFormScreen6.CLOSE_ALL;
        } else {
            eventOrderFormScreen6 = EventOrderFormScreen6.REVIEW;
        }
        return new EventOrderFormViewState.OrderFormContentData(rhsAccountNumber, contractId, null, orderSummaryString, z, quantityBasedData, notionalBasedData, stringResource, eventOrderFormScreen6, !isLoadingCriticalDisplayInfo() && (z2 || getOrderContext() != null), isLoadingCriticalDisplayInfo());
    }

    private final StringResource orderReceiptTitleString(FuturesOrderDto order, EventContract contract, OrderState orderState) {
        String failed_receipt_override_title = order.getFailed_receipt_override_title();
        if (failed_receipt_override_title != null && failed_receipt_override_title.length() > 0) {
            return StringResource.INSTANCE.invoke(failed_receipt_override_title);
        }
        switch (WhenMappings.$EnumSwitchMapping$5[orderState.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                Optional<OrderFormDisplayDetails> optional = this.orderFormDisplayDetails;
                if (optional == null) {
                    return null;
                }
                if (optional instanceof Some) {
                    return StringResource.INSTANCE.invoke(((OrderFormDisplayDetails) ((Some) optional).getValue()).getOrderReceiptTitle());
                }
                return StringResource.INSTANCE.invoke(contract.getDisplayLongName());
            case 10:
                return StringResource.INSTANCE.invoke(C16465R.string.order_receipt_title_rejected, new Object[0]);
            case 11:
                return StringResource.INSTANCE.invoke(C16465R.string.order_receipt_title_canceled, new Object[0]);
            case 12:
            case 13:
            case 14:
                return StringResource.INSTANCE.invoke(C16465R.string.order_receipt_title_failed, new Object[0]);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final StringResource orderReceiptDetailString(FuturesOrderDto order, BigDecimal displayPrice, BigDecimal quantity) {
        IdlDecimal amount;
        String failed_receipt_override_detail_markdown = order.getFailed_receipt_override_detail_markdown();
        if (failed_receipt_override_detail_markdown != null && failed_receipt_override_detail_markdown.length() > 0) {
            return StringResource.INSTANCE.invoke(failed_receipt_override_detail_markdown);
        }
        MoneyDto entered_notional_amount = order.getEntered_notional_amount();
        BigDecimal bigDecimalOrNull = (entered_notional_amount == null || (amount = entered_notional_amount.getAmount()) == null) ? null : amount.toBigDecimalOrNull();
        if (bigDecimalOrNull != null) {
            return getOrderReceiptDetailStringForNotionalBasedOrder(order, bigDecimalOrNull, displayPrice, quantity);
        }
        return getOrderReceiptDetailStringForQuantityBasedOrder(order, displayPrice, quantity);
    }

    private final StringResource getOrderReceiptDetailStringForNotionalBasedOrder(FuturesOrderDto order, BigDecimal notionalAmount, BigDecimal displayPrice, BigDecimal quantity) {
        String str;
        if (displayPrice == null || (str = Formats.getPriceFormat().format(displayPrice)) == null) {
            str = "-";
        }
        String str2 = str;
        StringResource yesOrNoWithContractName = getYesOrNoWithContractName();
        if (yesOrNoWithContractName == null) {
            return null;
        }
        return EventOrderFormStringUtils.INSTANCE.buildNotionalReceipt(this.positionEffect, Formats.getPriceFormat().format(notionalAmount), yesOrNoWithContractName, str2, FuturesOrderKt.toDbModel(order.getOrder_state()), BigDecimals7.toIntRounded(quantity));
    }

    private final StringResource getOrderReceiptDetailStringForQuantityBasedOrder(FuturesOrderDto order, BigDecimal displayPrice, BigDecimal quantity) {
        String str;
        if (displayPrice == null || (str = Formats.getPriceFormat().format(displayPrice)) == null) {
            str = "-";
        }
        String str2 = str;
        StringResource yesOrNoWithContractName = getYesOrNoWithContractName();
        if (yesOrNoWithContractName == null) {
            return null;
        }
        return EventOrderFormStringUtils.INSTANCE.buildQuantityReceipt(this.positionEffect, BigDecimals7.toIntRounded(quantity), yesOrNoWithContractName, str2, FuturesOrderKt.toDbModel(order.getOrder_state()));
    }

    private final BigDecimal getQuantityForEstimate(BigDecimal orderQuantity, BigDecimal filledQuantity, OrderState orderState) {
        return (filledQuantity == null || orderState != OrderState.PARTIALLY_FILLED_REST_CANCELLED) ? orderQuantity : filledQuantity;
    }

    private final EventOrderFormViewState.ReceiptData.QuickResubmit getQuickResubmitData(OrderState state, FuturesOrderDto order, BigDecimal quantity, BigDecimal filledQuantity, BigDecimal amountReturned) {
        switch (WhenMappings.$EnumSwitchMapping$5[state.ordinal()]) {
            case 8:
                if (this.isInQuickResubmitIocExperiment && order.getEntered_notional_amount() == null) {
                    if (filledQuantity != null) {
                        BigDecimal bigDecimalSubtract = quantity.subtract(filledQuantity);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                        if (bigDecimalSubtract != null) {
                            Integer numValueOf = Integer.valueOf(BigDecimals7.toIntRounded(bigDecimalSubtract));
                            if (numValueOf.intValue() <= 0) {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                return new EventOrderFormViewState.ReceiptData.QuickResubmit.Quantity(numValueOf.intValue(), StringResource.INSTANCE.invoke(C16465R.string.order_form_quick_resubmit_partial_cta, new Object[0]));
                            }
                        }
                    }
                    return null;
                }
                if (this.isInQuickResubmitNotionalExperiment && order.getEntered_notional_amount() != null && amountReturned != null) {
                    return new EventOrderFormViewState.ReceiptData.QuickResubmit.Notional(amountReturned, StringResource.INSTANCE.invoke(C16465R.string.order_form_quick_resubmit_partial_cta, new Object[0]));
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 13:
            case 14:
                return null;
            case 9:
            case 11:
                if (this.isInQuickResubmitIocExperiment && order.getEntered_notional_amount() == null) {
                    return new EventOrderFormViewState.ReceiptData.QuickResubmit.Quantity(BigDecimals7.toIntRounded(quantity), StringResource.INSTANCE.invoke(C16465R.string.order_form_quick_resubmit_full_cta, new Object[0]));
                }
                if (!this.isInQuickResubmitNotionalExperiment || order.getEntered_notional_amount() == null) {
                    return null;
                }
                return new EventOrderFormViewState.ReceiptData.QuickResubmit.Notional(this.userInputNotionalAmount, StringResource.INSTANCE.invoke(C16465R.string.order_form_quick_resubmit_full_cta, new Object[0]));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EventOrderFormViewState.ReceiptData getReceiptData() {
        OrderSubmissionManager.Result<FuturesOrderDto, UiEventOrderContext> result;
        FuturesOrderDto futuresOrderDto;
        BigDecimal bigDecimalAdd;
        boolean z;
        BigDecimal bigDecimalSubtract;
        boolean z2;
        EventOrderFormViewState.PayoutData payoutData;
        StringResource costOrCreditLabel;
        StringResource stringResource;
        StringResource stringResource2;
        StringResource stringResourceInvoke;
        String str;
        EventOrderFormDataState eventOrderFormDataState;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        OrderState orderState;
        BigDecimal bigDecimal3;
        String strJoinToString$default;
        OrderFormDisplayDetails orNull;
        List<String> selectedLegStrings;
        IdlDecimal amount;
        EventContract eventContract = this.contract;
        if (eventContract == null) {
            return null;
        }
        OrderSubmissionState orderSubmissionState = this.orderSubmissionState;
        OrderSubmissionState.Submitting submitting = orderSubmissionState instanceof OrderSubmissionState.Submitting ? (OrderSubmissionState.Submitting) orderSubmissionState : null;
        if (submitting == null || (result = submitting.getResult()) == null) {
            return null;
        }
        OrderSubmissionManager.Result.Submitted submitted = result instanceof OrderSubmissionManager.Result.Submitted ? (OrderSubmissionManager.Result.Submitted) result : null;
        if (submitted == null || (futuresOrderDto = (FuturesOrderDto) submitted.getData()) == null) {
            return null;
        }
        EventOrder eventOrder = EventOrder2.toEventOrder(futuresOrderDto);
        BigDecimal bigDecimalOrNull = futuresOrderDto.getQuantity().toBigDecimalOrNull();
        if (bigDecimalOrNull == null && (bigDecimalOrNull = getQuantity$feature_event_trade_externalDebug()) == null) {
            return null;
        }
        BigDecimal bigDecimalOrNull2 = futuresOrderDto.getFilled_quantity().toBigDecimalOrNull();
        OrderState commonState = FuturesOrderKt.toCommonState(futuresOrderDto.getOrder_state());
        boolean z3 = this.positionEffect == EventOrderPositionEffect.CLOSE && !Intrinsics.areEqual(commonState.isSuccessful(), Boolean.FALSE);
        EventOrderPositionEffect eventOrderPositionEffect = this.positionEffect;
        EventOrderPositionEffect eventOrderPositionEffect2 = EventOrderPositionEffect.OPEN;
        boolean z4 = eventOrderPositionEffect == eventOrderPositionEffect2 && !Intrinsics.areEqual(commonState.isSuccessful(), Boolean.FALSE);
        boolean z5 = z3 || z4;
        BigDecimal quantityForEstimate = getQuantityForEstimate(bigDecimalOrNull, bigDecimalOrNull2, commonState);
        MoneyDto total_fee = futuresOrderDto.getTotal_fee();
        BigDecimal bigDecimalOrNull3 = (total_fee == null || (amount = total_fee.getAmount()) == null) ? null : amount.toBigDecimalOrNull();
        IdlDecimal limit_price = futuresOrderDto.getLimit_price();
        BigDecimal bigDecimalOrNull4 = limit_price != null ? limit_price.toBigDecimalOrNull() : null;
        BigDecimal priceForOrderReceipt = eventOrder.getPriceForOrderReceipt(this.side);
        if (this.orderType != OrderFormOrderType.NOTIONAL_BASED_ORDER || !Intrinsics.areEqual(eventOrder.getOrderState().isSuccessful(), Boolean.TRUE) || this.positionEffect != eventOrderPositionEffect2 || bigDecimalOrNull2 == null || priceForOrderReceipt == null || bigDecimalOrNull3 == null) {
            bigDecimalAdd = null;
        } else {
            BigDecimal bigDecimalMultiply = bigDecimalOrNull2.multiply(priceForOrderReceipt);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            bigDecimalAdd = bigDecimalMultiply.add(bigDecimalOrNull3);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        }
        if (bigDecimalAdd != null) {
            bigDecimalSubtract = this.userInputNotionalAmount.subtract(bigDecimalAdd);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            if (bigDecimalSubtract == null || !BigDecimals7.isPositive(bigDecimalSubtract)) {
                z = z3;
                bigDecimalSubtract = null;
            } else {
                z = z3;
            }
        }
        boolean z6 = z4;
        boolean zAreEqual = Intrinsics.areEqual(commonState.isSuccessful(), Boolean.FALSE);
        String receiptShortName = eventContract.getReceiptShortName();
        StringResource stringResourceOrderReceiptTitleString = orderReceiptTitleString(futuresOrderDto, eventContract, commonState);
        StringResource stringResourceOrderReceiptDetailString = orderReceiptDetailString(futuresOrderDto, priceForOrderReceipt, bigDecimalOrNull);
        EventOrderFormViewState.PayoutData payoutData2 = z6 ? getPayoutData(true, quantityForEstimate) : null;
        if (z) {
            EventOrderFormViewState.PayoutData payoutData3 = payoutData2;
            costOrCreditLabel = getCostOrCreditLabel();
            z2 = z;
            payoutData = payoutData3;
        } else {
            z2 = z;
            payoutData = payoutData2;
            costOrCreditLabel = null;
        }
        if (!z2 || bigDecimalOrNull3 == null || bigDecimalOrNull4 == null) {
            stringResource = null;
            stringResource2 = stringResourceOrderReceiptTitleString;
            stringResourceInvoke = null;
        } else {
            int i = WhenMappings.$EnumSwitchMapping$2[this.side.ordinal()];
            if (i == 1) {
                bigDecimalOrNull4 = EventOrder.INSTANCE.getPAYOUT_PER_CONTRACT().subtract(bigDecimalOrNull4);
                Intrinsics.checkNotNullExpressionValue(bigDecimalOrNull4, "subtract(...)");
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal bigDecimalMultiply2 = bigDecimalOrNull4.multiply(quantityForEstimate);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            BigDecimal bigDecimalSubtract2 = bigDecimalMultiply2.subtract(bigDecimalOrNull3);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
            stringResource = null;
            stringResource2 = stringResourceOrderReceiptTitleString;
            stringResourceInvoke = StringResource.INSTANCE.invoke(Formats.getPriceFormat().format(bigDecimalSubtract2));
        }
        StringResource stringResourceInvoke2 = (!z5 || bigDecimalOrNull2 == null) ? stringResource : StringResource.INSTANCE.invoke(C16465R.string.events_order_form_receipt_filled_quantity_format, Formats.getIntegerFormat().format(bigDecimalOrNull2), Formats.getIntegerFormat().format(bigDecimalOrNull));
        String str2 = bigDecimalAdd != null ? Formats.getCurrencyFormat().format(bigDecimalAdd) : stringResource;
        if (bigDecimalSubtract != null) {
            str = Formats.getCurrencyFormat().format(bigDecimalSubtract);
            bigDecimal = bigDecimalOrNull;
            bigDecimal2 = bigDecimalOrNull2;
            orderState = commonState;
            bigDecimal3 = bigDecimalSubtract;
            eventOrderFormDataState = this;
        } else {
            str = stringResource;
            eventOrderFormDataState = this;
            bigDecimal = bigDecimalOrNull;
            bigDecimal2 = bigDecimalOrNull2;
            orderState = commonState;
            bigDecimal3 = bigDecimalSubtract;
        }
        EventOrderFormViewState.ReceiptData.QuickResubmit quickResubmitData = eventOrderFormDataState.getQuickResubmitData(orderState, futuresOrderDto, bigDecimal, bigDecimal2, bigDecimal3);
        Optional<OrderFormDisplayDetails> optional = eventOrderFormDataState.orderFormDisplayDetails;
        if (optional == null || (orNull = optional.getOrNull()) == null || (selectedLegStrings = orNull.getSelectedLegStrings()) == null) {
            strJoinToString$default = stringResource;
        } else {
            strJoinToString$default = selectedLegStrings.size() > 1 ? CollectionsKt.joinToString$default(selectedLegStrings, "\n", null, null, 0, null, null, 62, null) : stringResource;
        }
        return new EventOrderFormViewState.ReceiptData(zAreEqual, receiptShortName, stringResource2, stringResourceOrderReceiptDetailString, payoutData, costOrCreditLabel, stringResourceInvoke, stringResourceInvoke2, z5, str2, str, quickResubmitData, strJoinToString$default);
    }

    /* compiled from: EventOrderFormDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventOrderFormDataState$Companion;", "", "<init>", "()V", "zeroFee", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto;", "getZeroFee", "()Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto;", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GetFeesForTentativeOrderResponseDto getZeroFee() {
            return EventOrderFormDataState.zeroFee;
        }
    }

    static {
        IdlDecimal idlDecimal = new IdlDecimal("0");
        CurrencyDto currencyDto = CurrencyDto.USD;
        zeroFee = new GetFeesForTentativeOrderResponseDto(new MoneyDto(idlDecimal, currencyDto), new MoneyDto(new IdlDecimal("0"), currencyDto), new MoneyDto(new IdlDecimal("0"), currencyDto), null, null, null, 56, null);
    }
}
