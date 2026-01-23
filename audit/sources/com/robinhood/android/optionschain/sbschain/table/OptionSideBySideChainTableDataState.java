package com.robinhood.android.optionschain.sbschain.table;

import androidx.collection.LruCache;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState4;
import com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget;
import com.robinhood.librobinhood.data.store.OptionSideBySideChainTableData;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionSideBySideChainMetric;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.models.p355ui.OptionChainSettingsSideBySideBidAskPriceLabelType;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.UiOptionPositionCounts;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.udf.UiEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: OptionSideBySideChainTableDataState.kt */
@Metadata(m3635d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u00ad\u0001B\u0097\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001e0 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0013\u0012\b\b\u0002\u0010#\u001a\u00020\u0013\u0012\b\b\u0002\u0010$\u001a\u00020\u0013\u0012\b\b\u0002\u0010%\u001a\u00020\u0013\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u001eHÂ\u0003¢\u0006\u0004\b+\u0010,J\u001c\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001e0 HÂ\u0003¢\u0006\u0004\b-\u0010.J!\u00103\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010/2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J!\u00105\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010/2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b5\u00104J.\u0010;\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0017\u0010:\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e08¢\u0006\u0002\b9¢\u0006\u0004\b;\u0010<J5\u0010C\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=2\b\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010B\u001a\u00020\u001c¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0016\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0016\u0010K\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0003¢\u0006\u0004\bK\u0010HJ\u001c\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bV\u0010SJ\u0010\u0010W\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bW\u0010SJ\u0010\u0010X\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bX\u0010SJ\u0010\u0010Y\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\bY\u0010SJ\u001c\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001c0\u001bHÆ\u0003¢\u0006\u0004\bZ\u0010MJ\u0010\u0010[\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b[\u0010SJ\u0010\u0010\\\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b\\\u0010SJ\u0010\u0010]\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b]\u0010SJ\u0010\u0010^\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b^\u0010SJ\u0018\u0010_\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&HÆ\u0003¢\u0006\u0004\b_\u0010`J¢\u0002\u0010a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00132\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001e0 2\b\b\u0002\u0010\"\u001a\u00020\u00132\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010$\u001a\u00020\u00132\b\b\u0002\u0010%\u001a\u00020\u00132\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&HÆ\u0001¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u000201HÖ\u0001¢\u0006\u0004\be\u0010fJ\u001a\u0010h\u001a\u00020\u00132\b\u0010g\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bh\u0010iR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010j\u001a\u0004\bk\u0010FR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010l\u001a\u0004\bm\u0010HR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010n\u001a\u0004\bo\u0010JR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010l\u001a\u0004\bp\u0010HR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010q\u001a\u0004\br\u0010MR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010s\u001a\u0004\bt\u0010OR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010u\u001a\u0004\bv\u0010QR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010w\u001a\u0004\b\u0014\u0010SR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010x\u001a\u0004\by\u0010UR\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0017\u0010w\u001a\u0004\b\u0017\u0010SR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010w\u001a\u0004\b\u0018\u0010SR\u0017\u0010\u0019\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010w\u001a\u0004\b\u0019\u0010SR\u0017\u0010\u001a\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001a\u0010w\u001a\u0004\bz\u0010SR#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010q\u001a\u0004\b{\u0010MR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010|R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001e0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010}R\u0017\u0010\"\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\"\u0010w\u001a\u0004\b~\u0010SR\u0017\u0010#\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b#\u0010w\u001a\u0004\b#\u0010SR\u0017\u0010$\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b$\u0010w\u001a\u0004\b\u007f\u0010SR\u0018\u0010%\u001a\u00020\u00138\u0006¢\u0006\r\n\u0004\b%\u0010w\u001a\u0005\b\u0080\u0001\u0010SR!\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0006¢\u0006\u000e\n\u0005\b(\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010`R \u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010l\u001a\u0005\b\u0084\u0001\u0010HR\u001a\u0010\u0085\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010w\u001a\u0005\b\u0086\u0001\u0010SR\u001f\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0006¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u00107\u001a\u0004\u0018\u0001068\u0006¢\u0006\u000f\n\u0005\b7\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001d\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0006¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010?\u001a\b\u0012\u0004\u0012\u00020>0=8\u0006¢\u0006\u000f\n\u0005\b?\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010A\u001a\u0004\u0018\u00010@8\u0006¢\u0006\u000f\n\u0005\bA\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R'\u0010\u009b\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030\u009a\u00010\u000b8\u0006¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010q\u001a\u0005\b\u009c\u0001\u0010MR'\u0010\u009e\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030\u009d\u00010\u000b8\u0006¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010q\u001a\u0005\b\u009f\u0001\u0010MR\u001f\u0010¡\u0001\u001a\u0005\u0018\u00010 \u00018\u0006¢\u0006\u0010\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R\u001e\u0010¥\u0001\u001a\u0004\u0018\u00010/8\u0006¢\u0006\u0010\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R\u001c\u00100\u001a\u0004\u0018\u00010/8\u0006¢\u0006\u000f\n\u0005\b0\u0010¦\u0001\u001a\u0006\b©\u0001\u0010¨\u0001R\u001c\u00102\u001a\u0004\u0018\u0001018\u0006¢\u0006\u000f\n\u0005\b2\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001¨\u0006®\u0001"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;", "", "Ljava/util/UUID;", "equityInstrumentId", "", "Lcom/robinhood/models/db/OptionSideBySideChainMetric;", "metrics", "Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;", "bidAskPriceLabelType", "Lcom/robinhood/models/ui/OptionLegBundle;", "selectedLegs", "", "Lcom/robinhood/models/ui/UiOptionPositionCounts;", "optionPositionCount", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "tradeOnExpirationState", "", "", "watchlistStrategyCodeSet", "", "isInOptionRegularTradingOpenHours", "Lcom/robinhood/android/optionschain/sbschain/NuxMode;", "nuxMode", "isNuxAnimationFinished", "isNuxSearchDismissed", "isTableCached", "hasScrolledToTargetRowIndex", "", "Lcom/robinhood/android/optionschain/sbschain/table/ScrollPosition;", "savedScrollPositions", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState$PageState;", "currentPageState", "Landroidx/collection/LruCache;", "pageStateCache", "selloutSnackbarDismissedOrElapsed", "isEduFooterAnimationDismissed", "inSbsNuxRevampExperiment", "inSnackbarDismissalFollowUpExperiment", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent;", "initialScrollUiEvent", "<init>", "(Ljava/util/UUID;Ljava/util/List;Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;Ljava/util/List;Ljava/util/Map;Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Ljava/util/Set;ZLcom/robinhood/android/optionschain/sbschain/NuxMode;ZZZZLjava/util/Map;Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState$PageState;Landroidx/collection/LruCache;ZZZZLcom/robinhood/udf/UiEvent;)V", "component15", "()Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState$PageState;", "component16", "()Landroidx/collection/LruCache;", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;", "dragTarget", "", "draggedOverIndex", "copyDragTarget", "(Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;Ljava/lang/Integer;)Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;", "copyInitialDragTarget", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "expirationDateState", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "copyFunction", "copyPageState", "(Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;Lkotlin/jvm/functions/Function1;)Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiOptionStrategyLegDisplay;", "targetLegs", "Ljava/math/BigDecimal;", "targetStrikePrice", "scrollPositionForLastExpirationDate", "resetCurrentPageState", "(Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;Lkotlinx/collections/immutable/ImmutableList;Ljava/math/BigDecimal;Lcom/robinhood/android/optionschain/sbschain/table/ScrollPosition;)Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/util/List;", "component3", "()Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;", "component4", "component5", "()Ljava/util/Map;", "component6", "()Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "component7", "()Ljava/util/Set;", "component8", "()Z", "component9", "()Lcom/robinhood/android/optionschain/sbschain/NuxMode;", "component10", "component11", "component12", "component13", "component14", "component17", "component18", "component19", "component20", "component21", "()Lcom/robinhood/udf/UiEvent;", "copy", "(Ljava/util/UUID;Ljava/util/List;Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;Ljava/util/List;Ljava/util/Map;Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Ljava/util/Set;ZLcom/robinhood/android/optionschain/sbschain/NuxMode;ZZZZLjava/util/Map;Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState$PageState;Landroidx/collection/LruCache;ZZZZLcom/robinhood/udf/UiEvent;)Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getEquityInstrumentId", "Ljava/util/List;", "getMetrics", "Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;", "getBidAskPriceLabelType", "getSelectedLegs", "Ljava/util/Map;", "getOptionPositionCount", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "getTradeOnExpirationState", "Ljava/util/Set;", "getWatchlistStrategyCodeSet", "Z", "Lcom/robinhood/android/optionschain/sbschain/NuxMode;", "getNuxMode", "getHasScrolledToTargetRowIndex", "getSavedScrollPositions", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState$PageState;", "Landroidx/collection/LruCache;", "getSelloutSnackbarDismissedOrElapsed", "getInSbsNuxRevampExperiment", "getInSnackbarDismissalFollowUpExperiment", "Lcom/robinhood/udf/UiEvent;", "getInitialScrollUiEvent", "nonBidAskMetrics", "getNonBidAskMetrics", "initialInstrumentsLoaded", "getInitialInstrumentsLoaded", "Lcom/robinhood/models/ui/UnderlyingQuote;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "getUnderlyingQuote", "()Lcom/robinhood/models/ui/UnderlyingQuote;", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "getExpirationDateState", "()Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableData;", "tableData", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableData;", "getTableData", "()Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableData;", "Lkotlinx/collections/immutable/ImmutableList;", "getTargetLegs", "()Lkotlinx/collections/immutable/ImmutableList;", "Ljava/math/BigDecimal;", "getTargetStrikePrice", "()Ljava/math/BigDecimal;", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "optionInstrumentQuotes", "getOptionInstrumentQuotes", "Lcom/robinhood/models/db/Tradability;", "optionInstrumentIdToTradabilityMap", "getOptionInstrumentIdToTradabilityMap", "j$/time/Instant", "selloutDateTime", "Lj$/time/Instant;", "getSelloutDateTime", "()Lj$/time/Instant;", "initialDragTargetForLogging", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;", "getInitialDragTargetForLogging", "()Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;", "getDragTarget", "Ljava/lang/Integer;", "getDraggedOverIndex", "()Ljava/lang/Integer;", "PageState", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class OptionSideBySideChainTableDataState {
    public static final int $stable = 8;
    private final OptionChainSettingsSideBySideBidAskPriceLabelType bidAskPriceLabelType;
    private final PageState currentPageState;
    private final DragTarget dragTarget;
    private final Integer draggedOverIndex;
    private final UUID equityInstrumentId;
    private final OptionChainExpirationDateState expirationDateState;
    private final boolean hasScrolledToTargetRowIndex;
    private final boolean inSbsNuxRevampExperiment;
    private final boolean inSnackbarDismissalFollowUpExperiment;
    private final DragTarget initialDragTargetForLogging;
    private final boolean initialInstrumentsLoaded;
    private final UiEvent<OptionSideBySideChainTableEvent> initialScrollUiEvent;
    private final boolean isEduFooterAnimationDismissed;
    private final boolean isInOptionRegularTradingOpenHours;
    private final boolean isNuxAnimationFinished;
    private final boolean isNuxSearchDismissed;
    private final boolean isTableCached;
    private final List<OptionSideBySideChainMetric> metrics;
    private final List<OptionSideBySideChainMetric> nonBidAskMetrics;
    private final OptionSideBySideChainDataState4 nuxMode;
    private final Map<UUID, Tradability> optionInstrumentIdToTradabilityMap;
    private final Map<UUID, OptionInstrumentQuote> optionInstrumentQuotes;
    private final Map<UUID, UiOptionPositionCounts> optionPositionCount;
    private final LruCache<String, PageState> pageStateCache;
    private final Map<String, ScrollPosition> savedScrollPositions;
    private final List<OptionLegBundle> selectedLegs;
    private final Instant selloutDateTime;
    private final boolean selloutSnackbarDismissedOrElapsed;
    private final OptionSideBySideChainTableData tableData;
    private final ImmutableList<UiOptionStrategyLegDisplay> targetLegs;
    private final BigDecimal targetStrikePrice;
    private final OptionSettings.TradingOnExpirationState tradeOnExpirationState;
    private final UnderlyingQuote underlyingQuote;
    private final Set<String> watchlistStrategyCodeSet;

    /* renamed from: component15, reason: from getter */
    private final PageState getCurrentPageState() {
        return this.currentPageState;
    }

    private final LruCache<String, PageState> component16() {
        return this.pageStateCache;
    }

    public static /* synthetic */ OptionSideBySideChainTableDataState copy$default(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, UUID uuid, List list, OptionChainSettingsSideBySideBidAskPriceLabelType optionChainSettingsSideBySideBidAskPriceLabelType, List list2, Map map, OptionSettings.TradingOnExpirationState tradingOnExpirationState, Set set, boolean z, OptionSideBySideChainDataState4 optionSideBySideChainDataState4, boolean z2, boolean z3, boolean z4, boolean z5, Map map2, PageState pageState, LruCache lruCache, boolean z6, boolean z7, boolean z8, boolean z9, UiEvent uiEvent, int i, Object obj) {
        UiEvent uiEvent2;
        boolean z10;
        UUID uuid2 = (i & 1) != 0 ? optionSideBySideChainTableDataState.equityInstrumentId : uuid;
        List list3 = (i & 2) != 0 ? optionSideBySideChainTableDataState.metrics : list;
        OptionChainSettingsSideBySideBidAskPriceLabelType optionChainSettingsSideBySideBidAskPriceLabelType2 = (i & 4) != 0 ? optionSideBySideChainTableDataState.bidAskPriceLabelType : optionChainSettingsSideBySideBidAskPriceLabelType;
        List list4 = (i & 8) != 0 ? optionSideBySideChainTableDataState.selectedLegs : list2;
        Map map3 = (i & 16) != 0 ? optionSideBySideChainTableDataState.optionPositionCount : map;
        OptionSettings.TradingOnExpirationState tradingOnExpirationState2 = (i & 32) != 0 ? optionSideBySideChainTableDataState.tradeOnExpirationState : tradingOnExpirationState;
        Set set2 = (i & 64) != 0 ? optionSideBySideChainTableDataState.watchlistStrategyCodeSet : set;
        boolean z11 = (i & 128) != 0 ? optionSideBySideChainTableDataState.isInOptionRegularTradingOpenHours : z;
        OptionSideBySideChainDataState4 optionSideBySideChainDataState42 = (i & 256) != 0 ? optionSideBySideChainTableDataState.nuxMode : optionSideBySideChainDataState4;
        boolean z12 = (i & 512) != 0 ? optionSideBySideChainTableDataState.isNuxAnimationFinished : z2;
        boolean z13 = (i & 1024) != 0 ? optionSideBySideChainTableDataState.isNuxSearchDismissed : z3;
        boolean z14 = (i & 2048) != 0 ? optionSideBySideChainTableDataState.isTableCached : z4;
        boolean z15 = (i & 4096) != 0 ? optionSideBySideChainTableDataState.hasScrolledToTargetRowIndex : z5;
        Map map4 = (i & 8192) != 0 ? optionSideBySideChainTableDataState.savedScrollPositions : map2;
        UUID uuid3 = uuid2;
        PageState pageState2 = (i & 16384) != 0 ? optionSideBySideChainTableDataState.currentPageState : pageState;
        LruCache lruCache2 = (i & 32768) != 0 ? optionSideBySideChainTableDataState.pageStateCache : lruCache;
        boolean z16 = (i & 65536) != 0 ? optionSideBySideChainTableDataState.selloutSnackbarDismissedOrElapsed : z6;
        boolean z17 = (i & 131072) != 0 ? optionSideBySideChainTableDataState.isEduFooterAnimationDismissed : z7;
        boolean z18 = (i & 262144) != 0 ? optionSideBySideChainTableDataState.inSbsNuxRevampExperiment : z8;
        boolean z19 = (i & 524288) != 0 ? optionSideBySideChainTableDataState.inSnackbarDismissalFollowUpExperiment : z9;
        if ((i & 1048576) != 0) {
            z10 = z19;
            uiEvent2 = optionSideBySideChainTableDataState.initialScrollUiEvent;
        } else {
            uiEvent2 = uiEvent;
            z10 = z19;
        }
        return optionSideBySideChainTableDataState.copy(uuid3, list3, optionChainSettingsSideBySideBidAskPriceLabelType2, list4, map3, tradingOnExpirationState2, set2, z11, optionSideBySideChainDataState42, z12, z13, z14, z15, map4, pageState2, lruCache2, z16, z17, z18, z10, uiEvent2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getEquityInstrumentId() {
        return this.equityInstrumentId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsNuxAnimationFinished() {
        return this.isNuxAnimationFinished;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsNuxSearchDismissed() {
        return this.isNuxSearchDismissed;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsTableCached() {
        return this.isTableCached;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getHasScrolledToTargetRowIndex() {
        return this.hasScrolledToTargetRowIndex;
    }

    public final Map<String, ScrollPosition> component14() {
        return this.savedScrollPositions;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getSelloutSnackbarDismissedOrElapsed() {
        return this.selloutSnackbarDismissedOrElapsed;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsEduFooterAnimationDismissed() {
        return this.isEduFooterAnimationDismissed;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getInSbsNuxRevampExperiment() {
        return this.inSbsNuxRevampExperiment;
    }

    public final List<OptionSideBySideChainMetric> component2() {
        return this.metrics;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getInSnackbarDismissalFollowUpExperiment() {
        return this.inSnackbarDismissalFollowUpExperiment;
    }

    public final UiEvent<OptionSideBySideChainTableEvent> component21() {
        return this.initialScrollUiEvent;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionChainSettingsSideBySideBidAskPriceLabelType getBidAskPriceLabelType() {
        return this.bidAskPriceLabelType;
    }

    public final List<OptionLegBundle> component4() {
        return this.selectedLegs;
    }

    public final Map<UUID, UiOptionPositionCounts> component5() {
        return this.optionPositionCount;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionSettings.TradingOnExpirationState getTradeOnExpirationState() {
        return this.tradeOnExpirationState;
    }

    public final Set<String> component7() {
        return this.watchlistStrategyCodeSet;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsInOptionRegularTradingOpenHours() {
        return this.isInOptionRegularTradingOpenHours;
    }

    /* renamed from: component9, reason: from getter */
    public final OptionSideBySideChainDataState4 getNuxMode() {
        return this.nuxMode;
    }

    public final OptionSideBySideChainTableDataState copy(UUID equityInstrumentId, List<? extends OptionSideBySideChainMetric> metrics, OptionChainSettingsSideBySideBidAskPriceLabelType bidAskPriceLabelType, List<OptionLegBundle> selectedLegs, Map<UUID, UiOptionPositionCounts> optionPositionCount, OptionSettings.TradingOnExpirationState tradeOnExpirationState, Set<String> watchlistStrategyCodeSet, boolean isInOptionRegularTradingOpenHours, OptionSideBySideChainDataState4 nuxMode, boolean isNuxAnimationFinished, boolean isNuxSearchDismissed, boolean isTableCached, boolean hasScrolledToTargetRowIndex, Map<String, ScrollPosition> savedScrollPositions, PageState currentPageState, LruCache<String, PageState> pageStateCache, boolean selloutSnackbarDismissedOrElapsed, boolean isEduFooterAnimationDismissed, boolean inSbsNuxRevampExperiment, boolean inSnackbarDismissalFollowUpExperiment, UiEvent<OptionSideBySideChainTableEvent> initialScrollUiEvent) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(bidAskPriceLabelType, "bidAskPriceLabelType");
        Intrinsics.checkNotNullParameter(selectedLegs, "selectedLegs");
        Intrinsics.checkNotNullParameter(optionPositionCount, "optionPositionCount");
        Intrinsics.checkNotNullParameter(tradeOnExpirationState, "tradeOnExpirationState");
        Intrinsics.checkNotNullParameter(watchlistStrategyCodeSet, "watchlistStrategyCodeSet");
        Intrinsics.checkNotNullParameter(nuxMode, "nuxMode");
        Intrinsics.checkNotNullParameter(savedScrollPositions, "savedScrollPositions");
        Intrinsics.checkNotNullParameter(currentPageState, "currentPageState");
        Intrinsics.checkNotNullParameter(pageStateCache, "pageStateCache");
        return new OptionSideBySideChainTableDataState(equityInstrumentId, metrics, bidAskPriceLabelType, selectedLegs, optionPositionCount, tradeOnExpirationState, watchlistStrategyCodeSet, isInOptionRegularTradingOpenHours, nuxMode, isNuxAnimationFinished, isNuxSearchDismissed, isTableCached, hasScrolledToTargetRowIndex, savedScrollPositions, currentPageState, pageStateCache, selloutSnackbarDismissedOrElapsed, isEduFooterAnimationDismissed, inSbsNuxRevampExperiment, inSnackbarDismissalFollowUpExperiment, initialScrollUiEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionSideBySideChainTableDataState)) {
            return false;
        }
        OptionSideBySideChainTableDataState optionSideBySideChainTableDataState = (OptionSideBySideChainTableDataState) other;
        return Intrinsics.areEqual(this.equityInstrumentId, optionSideBySideChainTableDataState.equityInstrumentId) && Intrinsics.areEqual(this.metrics, optionSideBySideChainTableDataState.metrics) && this.bidAskPriceLabelType == optionSideBySideChainTableDataState.bidAskPriceLabelType && Intrinsics.areEqual(this.selectedLegs, optionSideBySideChainTableDataState.selectedLegs) && Intrinsics.areEqual(this.optionPositionCount, optionSideBySideChainTableDataState.optionPositionCount) && this.tradeOnExpirationState == optionSideBySideChainTableDataState.tradeOnExpirationState && Intrinsics.areEqual(this.watchlistStrategyCodeSet, optionSideBySideChainTableDataState.watchlistStrategyCodeSet) && this.isInOptionRegularTradingOpenHours == optionSideBySideChainTableDataState.isInOptionRegularTradingOpenHours && this.nuxMode == optionSideBySideChainTableDataState.nuxMode && this.isNuxAnimationFinished == optionSideBySideChainTableDataState.isNuxAnimationFinished && this.isNuxSearchDismissed == optionSideBySideChainTableDataState.isNuxSearchDismissed && this.isTableCached == optionSideBySideChainTableDataState.isTableCached && this.hasScrolledToTargetRowIndex == optionSideBySideChainTableDataState.hasScrolledToTargetRowIndex && Intrinsics.areEqual(this.savedScrollPositions, optionSideBySideChainTableDataState.savedScrollPositions) && Intrinsics.areEqual(this.currentPageState, optionSideBySideChainTableDataState.currentPageState) && Intrinsics.areEqual(this.pageStateCache, optionSideBySideChainTableDataState.pageStateCache) && this.selloutSnackbarDismissedOrElapsed == optionSideBySideChainTableDataState.selloutSnackbarDismissedOrElapsed && this.isEduFooterAnimationDismissed == optionSideBySideChainTableDataState.isEduFooterAnimationDismissed && this.inSbsNuxRevampExperiment == optionSideBySideChainTableDataState.inSbsNuxRevampExperiment && this.inSnackbarDismissalFollowUpExperiment == optionSideBySideChainTableDataState.inSnackbarDismissalFollowUpExperiment && Intrinsics.areEqual(this.initialScrollUiEvent, optionSideBySideChainTableDataState.initialScrollUiEvent);
    }

    public int hashCode() {
        UUID uuid = this.equityInstrumentId;
        int iHashCode = (((((((((((((((((((((((((((((((((((((((uuid == null ? 0 : uuid.hashCode()) * 31) + this.metrics.hashCode()) * 31) + this.bidAskPriceLabelType.hashCode()) * 31) + this.selectedLegs.hashCode()) * 31) + this.optionPositionCount.hashCode()) * 31) + this.tradeOnExpirationState.hashCode()) * 31) + this.watchlistStrategyCodeSet.hashCode()) * 31) + Boolean.hashCode(this.isInOptionRegularTradingOpenHours)) * 31) + this.nuxMode.hashCode()) * 31) + Boolean.hashCode(this.isNuxAnimationFinished)) * 31) + Boolean.hashCode(this.isNuxSearchDismissed)) * 31) + Boolean.hashCode(this.isTableCached)) * 31) + Boolean.hashCode(this.hasScrolledToTargetRowIndex)) * 31) + this.savedScrollPositions.hashCode()) * 31) + this.currentPageState.hashCode()) * 31) + this.pageStateCache.hashCode()) * 31) + Boolean.hashCode(this.selloutSnackbarDismissedOrElapsed)) * 31) + Boolean.hashCode(this.isEduFooterAnimationDismissed)) * 31) + Boolean.hashCode(this.inSbsNuxRevampExperiment)) * 31) + Boolean.hashCode(this.inSnackbarDismissalFollowUpExperiment)) * 31;
        UiEvent<OptionSideBySideChainTableEvent> uiEvent = this.initialScrollUiEvent;
        return iHashCode + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "OptionSideBySideChainTableDataState(equityInstrumentId=" + this.equityInstrumentId + ", metrics=" + this.metrics + ", bidAskPriceLabelType=" + this.bidAskPriceLabelType + ", selectedLegs=" + this.selectedLegs + ", optionPositionCount=" + this.optionPositionCount + ", tradeOnExpirationState=" + this.tradeOnExpirationState + ", watchlistStrategyCodeSet=" + this.watchlistStrategyCodeSet + ", isInOptionRegularTradingOpenHours=" + this.isInOptionRegularTradingOpenHours + ", nuxMode=" + this.nuxMode + ", isNuxAnimationFinished=" + this.isNuxAnimationFinished + ", isNuxSearchDismissed=" + this.isNuxSearchDismissed + ", isTableCached=" + this.isTableCached + ", hasScrolledToTargetRowIndex=" + this.hasScrolledToTargetRowIndex + ", savedScrollPositions=" + this.savedScrollPositions + ", currentPageState=" + this.currentPageState + ", pageStateCache=" + this.pageStateCache + ", selloutSnackbarDismissedOrElapsed=" + this.selloutSnackbarDismissedOrElapsed + ", isEduFooterAnimationDismissed=" + this.isEduFooterAnimationDismissed + ", inSbsNuxRevampExperiment=" + this.inSbsNuxRevampExperiment + ", inSnackbarDismissalFollowUpExperiment=" + this.inSnackbarDismissalFollowUpExperiment + ", initialScrollUiEvent=" + this.initialScrollUiEvent + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionSideBySideChainTableDataState(UUID uuid, List<? extends OptionSideBySideChainMetric> metrics, OptionChainSettingsSideBySideBidAskPriceLabelType bidAskPriceLabelType, List<OptionLegBundle> selectedLegs, Map<UUID, UiOptionPositionCounts> optionPositionCount, OptionSettings.TradingOnExpirationState tradeOnExpirationState, Set<String> watchlistStrategyCodeSet, boolean z, OptionSideBySideChainDataState4 nuxMode, boolean z2, boolean z3, boolean z4, boolean z5, Map<String, ScrollPosition> savedScrollPositions, PageState currentPageState, LruCache<String, PageState> pageStateCache, boolean z6, boolean z7, boolean z8, boolean z9, UiEvent<OptionSideBySideChainTableEvent> uiEvent) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(bidAskPriceLabelType, "bidAskPriceLabelType");
        Intrinsics.checkNotNullParameter(selectedLegs, "selectedLegs");
        Intrinsics.checkNotNullParameter(optionPositionCount, "optionPositionCount");
        Intrinsics.checkNotNullParameter(tradeOnExpirationState, "tradeOnExpirationState");
        Intrinsics.checkNotNullParameter(watchlistStrategyCodeSet, "watchlistStrategyCodeSet");
        Intrinsics.checkNotNullParameter(nuxMode, "nuxMode");
        Intrinsics.checkNotNullParameter(savedScrollPositions, "savedScrollPositions");
        Intrinsics.checkNotNullParameter(currentPageState, "currentPageState");
        Intrinsics.checkNotNullParameter(pageStateCache, "pageStateCache");
        this.equityInstrumentId = uuid;
        this.metrics = metrics;
        this.bidAskPriceLabelType = bidAskPriceLabelType;
        this.selectedLegs = selectedLegs;
        this.optionPositionCount = optionPositionCount;
        this.tradeOnExpirationState = tradeOnExpirationState;
        this.watchlistStrategyCodeSet = watchlistStrategyCodeSet;
        this.isInOptionRegularTradingOpenHours = z;
        this.nuxMode = nuxMode;
        this.isNuxAnimationFinished = z2;
        this.isNuxSearchDismissed = z3;
        this.isTableCached = z4;
        this.hasScrolledToTargetRowIndex = z5;
        this.savedScrollPositions = savedScrollPositions;
        this.currentPageState = currentPageState;
        this.pageStateCache = pageStateCache;
        this.selloutSnackbarDismissedOrElapsed = z6;
        this.isEduFooterAnimationDismissed = z7;
        this.inSbsNuxRevampExperiment = z8;
        this.inSnackbarDismissalFollowUpExperiment = z9;
        this.initialScrollUiEvent = uiEvent;
        ArrayList arrayList = new ArrayList();
        for (Object obj : metrics) {
            OptionSideBySideChainMetric optionSideBySideChainMetric = (OptionSideBySideChainMetric) obj;
            if (optionSideBySideChainMetric != OptionSideBySideChainMetric.BID && optionSideBySideChainMetric != OptionSideBySideChainMetric.ASK) {
                arrayList.add(obj);
            }
        }
        this.nonBidAskMetrics = arrayList;
        this.initialInstrumentsLoaded = this.currentPageState.getInitialInstrumentsLoaded();
        this.underlyingQuote = this.currentPageState.getTableData().getUnderlyingQuote();
        this.expirationDateState = this.currentPageState.getExpirationDateState();
        this.tableData = this.currentPageState.getTableData();
        this.targetLegs = this.currentPageState.getTargetLegs();
        this.targetStrikePrice = this.currentPageState.getTargetStrikePrice();
        this.optionInstrumentQuotes = this.currentPageState.getOptionInstrumentQuotes();
        this.optionInstrumentIdToTradabilityMap = this.currentPageState.getOptionInstrumentIdToTradabilityMap();
        this.selloutDateTime = this.currentPageState.getSelloutDateTime();
        this.initialDragTargetForLogging = this.currentPageState.getTempState().getInitialDragTargetForLogging();
        this.dragTarget = this.currentPageState.getTempState().getDragTarget();
        this.draggedOverIndex = this.currentPageState.getTempState().getDraggedOverIndex();
    }

    public final UUID getEquityInstrumentId() {
        return this.equityInstrumentId;
    }

    public final List<OptionSideBySideChainMetric> getMetrics() {
        return this.metrics;
    }

    public /* synthetic */ OptionSideBySideChainTableDataState(UUID uuid, List list, OptionChainSettingsSideBySideBidAskPriceLabelType optionChainSettingsSideBySideBidAskPriceLabelType, List list2, Map map, OptionSettings.TradingOnExpirationState tradingOnExpirationState, Set set, boolean z, OptionSideBySideChainDataState4 optionSideBySideChainDataState4, boolean z2, boolean z3, boolean z4, boolean z5, Map map2, PageState pageState, LruCache lruCache, boolean z6, boolean z7, boolean z8, boolean z9, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? CollectionsKt.listOf((Object[]) new OptionSideBySideChainMetric[]{OptionSideBySideChainMetric.BID, OptionSideBySideChainMetric.ASK}) : list, (i & 4) != 0 ? OptionChainSettingsSideBySideBidAskPriceLabelType.BID_ASK : optionChainSettingsSideBySideBidAskPriceLabelType, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? MapsKt.emptyMap() : map, (i & 32) != 0 ? OptionSettings.TradingOnExpirationState.INELIGIBLE : tradingOnExpirationState, (i & 64) != 0 ? SetsKt.emptySet() : set, (i & 128) != 0 ? true : z, optionSideBySideChainDataState4, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3, (i & 2048) != 0 ? false : z4, (i & 4096) != 0 ? false : z5, (i & 8192) != 0 ? new LinkedHashMap() : map2, (i & 16384) != 0 ? new PageState(false, null, null, null, null, null, null, null, null, 511, null) : pageState, (32768 & i) != 0 ? new LruCache(3) : lruCache, (65536 & i) != 0 ? false : z6, (131072 & i) != 0 ? false : z7, (262144 & i) != 0 ? false : z8, (524288 & i) != 0 ? false : z9, (i & 1048576) != 0 ? null : uiEvent);
    }

    public final OptionChainSettingsSideBySideBidAskPriceLabelType getBidAskPriceLabelType() {
        return this.bidAskPriceLabelType;
    }

    public final List<OptionLegBundle> getSelectedLegs() {
        return this.selectedLegs;
    }

    public final Map<UUID, UiOptionPositionCounts> getOptionPositionCount() {
        return this.optionPositionCount;
    }

    public final OptionSettings.TradingOnExpirationState getTradeOnExpirationState() {
        return this.tradeOnExpirationState;
    }

    public final Set<String> getWatchlistStrategyCodeSet() {
        return this.watchlistStrategyCodeSet;
    }

    public final boolean isInOptionRegularTradingOpenHours() {
        return this.isInOptionRegularTradingOpenHours;
    }

    public final OptionSideBySideChainDataState4 getNuxMode() {
        return this.nuxMode;
    }

    public final boolean isNuxAnimationFinished() {
        return this.isNuxAnimationFinished;
    }

    public final boolean isNuxSearchDismissed() {
        return this.isNuxSearchDismissed;
    }

    public final boolean isTableCached() {
        return this.isTableCached;
    }

    public final boolean getHasScrolledToTargetRowIndex() {
        return this.hasScrolledToTargetRowIndex;
    }

    public final Map<String, ScrollPosition> getSavedScrollPositions() {
        return this.savedScrollPositions;
    }

    public final boolean getSelloutSnackbarDismissedOrElapsed() {
        return this.selloutSnackbarDismissedOrElapsed;
    }

    public final boolean isEduFooterAnimationDismissed() {
        return this.isEduFooterAnimationDismissed;
    }

    public final boolean getInSbsNuxRevampExperiment() {
        return this.inSbsNuxRevampExperiment;
    }

    public final boolean getInSnackbarDismissalFollowUpExperiment() {
        return this.inSnackbarDismissalFollowUpExperiment;
    }

    public final UiEvent<OptionSideBySideChainTableEvent> getInitialScrollUiEvent() {
        return this.initialScrollUiEvent;
    }

    public final OptionSideBySideChainTableDataState copyDragTarget(DragTarget dragTarget, Integer draggedOverIndex) {
        PageState pageState = this.currentPageState;
        return copy$default(this, null, null, null, null, null, null, null, false, null, false, false, false, false, null, PageState.copy$default(pageState, false, null, null, null, null, null, null, null, PageState.TempState.copy$default(pageState.getTempState(), null, dragTarget, draggedOverIndex, 1, null), 255, null), null, false, false, false, false, null, 2080767, null);
    }

    public final OptionSideBySideChainTableDataState copyInitialDragTarget(DragTarget dragTarget, Integer draggedOverIndex) {
        PageState pageState = this.currentPageState;
        return copy$default(this, null, null, null, null, null, null, null, false, null, false, false, false, false, null, PageState.copy$default(pageState, false, null, null, null, null, null, null, null, pageState.getTempState().copy(dragTarget, dragTarget, draggedOverIndex), 255, null), null, false, false, false, false, null, 2080767, null);
    }

    public final OptionSideBySideChainTableDataState copyPageState(OptionChainExpirationDateState expirationDateState, Function1<? super PageState, PageState> copyFunction) {
        Intrinsics.checkNotNullParameter(expirationDateState, "expirationDateState");
        Intrinsics.checkNotNullParameter(copyFunction, "copyFunction");
        OptionChainExpirationDateState expirationDateState2 = this.currentPageState.getExpirationDateState();
        if (Intrinsics.areEqual(expirationDateState2 != null ? expirationDateState2.getKey() : null, expirationDateState.getKey())) {
            return copy$default(this, null, null, null, null, null, null, null, false, null, false, false, false, false, null, copyFunction.invoke(this.currentPageState), null, false, false, false, false, null, 2080767, null);
        }
        String key = expirationDateState.getKey();
        PageState pageState = this.pageStateCache.get(key);
        if (pageState != null) {
            this.pageStateCache.put(key, copyFunction.invoke(pageState));
        }
        return this;
    }

    public final OptionSideBySideChainTableDataState resetCurrentPageState(OptionChainExpirationDateState expirationDateState, ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs, BigDecimal targetStrikePrice, ScrollPosition scrollPositionForLastExpirationDate) {
        Intrinsics.checkNotNullParameter(expirationDateState, "expirationDateState");
        Intrinsics.checkNotNullParameter(targetLegs, "targetLegs");
        Intrinsics.checkNotNullParameter(scrollPositionForLastExpirationDate, "scrollPositionForLastExpirationDate");
        OptionChainExpirationDateState expirationDateState2 = this.currentPageState.getExpirationDateState();
        String key = expirationDateState2 != null ? expirationDateState2.getKey() : null;
        if (key != null) {
            this.pageStateCache.put(key, PageState.copy$default(this.currentPageState, false, null, null, null, null, null, null, null, new PageState.TempState(null, null, null, 7, null), 255, null));
            this.savedScrollPositions.put(key, scrollPositionForLastExpirationDate);
        }
        PageState pageState = this.pageStateCache.get(expirationDateState.getKey());
        if (pageState != null) {
            return copy$default(this, null, null, null, null, null, null, null, false, null, false, false, true, false, null, pageState, null, false, false, false, false, null, 2078719, null);
        }
        return copy$default(this, null, null, null, null, null, null, null, false, null, false, false, false, false, null, new PageState(false, expirationDateState, null, null, null, null, targetLegs, targetStrikePrice, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE, null), null, false, false, false, false, null, 2078719, null);
    }

    public final List<OptionSideBySideChainMetric> getNonBidAskMetrics() {
        return this.nonBidAskMetrics;
    }

    public final boolean getInitialInstrumentsLoaded() {
        return this.initialInstrumentsLoaded;
    }

    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    public final OptionChainExpirationDateState getExpirationDateState() {
        return this.expirationDateState;
    }

    public final OptionSideBySideChainTableData getTableData() {
        return this.tableData;
    }

    public final ImmutableList<UiOptionStrategyLegDisplay> getTargetLegs() {
        return this.targetLegs;
    }

    public final BigDecimal getTargetStrikePrice() {
        return this.targetStrikePrice;
    }

    public final Map<UUID, OptionInstrumentQuote> getOptionInstrumentQuotes() {
        return this.optionInstrumentQuotes;
    }

    public final Map<UUID, Tradability> getOptionInstrumentIdToTradabilityMap() {
        return this.optionInstrumentIdToTradabilityMap;
    }

    public final Instant getSelloutDateTime() {
        return this.selloutDateTime;
    }

    public final DragTarget getInitialDragTargetForLogging() {
        return this.initialDragTargetForLogging;
    }

    public final DragTarget getDragTarget() {
        return this.dragTarget;
    }

    public final Integer getDraggedOverIndex() {
        return this.draggedOverIndex;
    }

    /* compiled from: OptionSideBySideChainTableDataState.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001:\u0001FB\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\bHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b(\u0010)J\u008e\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\u001eR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010 R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\b8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b=\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010#R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bA\u0010%R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010B\u001a\u0004\bC\u0010'R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010D\u001a\u0004\bE\u0010)¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState$PageState;", "", "", "initialInstrumentsLoaded", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "expirationDateState", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableData;", "tableData", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "optionInstrumentQuotes", "Lcom/robinhood/models/db/Tradability;", "optionInstrumentIdToTradabilityMap", "j$/time/Instant", "selloutDateTime", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiOptionStrategyLegDisplay;", "targetLegs", "Ljava/math/BigDecimal;", "targetStrikePrice", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState$PageState$TempState;", "tempState", "<init>", "(ZLcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableData;Ljava/util/Map;Ljava/util/Map;Lj$/time/Instant;Lkotlinx/collections/immutable/ImmutableList;Ljava/math/BigDecimal;Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState$PageState$TempState;)V", "component1", "()Z", "component2", "()Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "component3", "()Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableData;", "component4", "()Ljava/util/Map;", "component5", "component6", "()Lj$/time/Instant;", "component7", "()Lkotlinx/collections/immutable/ImmutableList;", "component8", "()Ljava/math/BigDecimal;", "component9", "()Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState$PageState$TempState;", "copy", "(ZLcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableData;Ljava/util/Map;Ljava/util/Map;Lj$/time/Instant;Lkotlinx/collections/immutable/ImmutableList;Ljava/math/BigDecimal;Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState$PageState$TempState;)Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState$PageState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getInitialInstrumentsLoaded", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "getExpirationDateState", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableData;", "getTableData", "Ljava/util/Map;", "getOptionInstrumentQuotes", "getOptionInstrumentIdToTradabilityMap", "Lj$/time/Instant;", "getSelloutDateTime", "Lkotlinx/collections/immutable/ImmutableList;", "getTargetLegs", "Ljava/math/BigDecimal;", "getTargetStrikePrice", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState$PageState$TempState;", "getTempState", "TempState", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PageState {
        public static final int $stable = 8;
        private final OptionChainExpirationDateState expirationDateState;
        private final boolean initialInstrumentsLoaded;
        private final Map<UUID, Tradability> optionInstrumentIdToTradabilityMap;
        private final Map<UUID, OptionInstrumentQuote> optionInstrumentQuotes;
        private final Instant selloutDateTime;
        private final OptionSideBySideChainTableData tableData;
        private final ImmutableList<UiOptionStrategyLegDisplay> targetLegs;
        private final BigDecimal targetStrikePrice;
        private final TempState tempState;

        public PageState() {
            this(false, null, null, null, null, null, null, null, null, 511, null);
        }

        public static /* synthetic */ PageState copy$default(PageState pageState, boolean z, OptionChainExpirationDateState optionChainExpirationDateState, OptionSideBySideChainTableData optionSideBySideChainTableData, Map map, Map map2, Instant instant, ImmutableList immutableList, BigDecimal bigDecimal, TempState tempState, int i, Object obj) {
            if ((i & 1) != 0) {
                z = pageState.initialInstrumentsLoaded;
            }
            if ((i & 2) != 0) {
                optionChainExpirationDateState = pageState.expirationDateState;
            }
            if ((i & 4) != 0) {
                optionSideBySideChainTableData = pageState.tableData;
            }
            if ((i & 8) != 0) {
                map = pageState.optionInstrumentQuotes;
            }
            if ((i & 16) != 0) {
                map2 = pageState.optionInstrumentIdToTradabilityMap;
            }
            if ((i & 32) != 0) {
                instant = pageState.selloutDateTime;
            }
            if ((i & 64) != 0) {
                immutableList = pageState.targetLegs;
            }
            if ((i & 128) != 0) {
                bigDecimal = pageState.targetStrikePrice;
            }
            if ((i & 256) != 0) {
                tempState = pageState.tempState;
            }
            BigDecimal bigDecimal2 = bigDecimal;
            TempState tempState2 = tempState;
            Instant instant2 = instant;
            ImmutableList immutableList2 = immutableList;
            Map map3 = map2;
            OptionSideBySideChainTableData optionSideBySideChainTableData2 = optionSideBySideChainTableData;
            return pageState.copy(z, optionChainExpirationDateState, optionSideBySideChainTableData2, map, map3, instant2, immutableList2, bigDecimal2, tempState2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getInitialInstrumentsLoaded() {
            return this.initialInstrumentsLoaded;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionChainExpirationDateState getExpirationDateState() {
            return this.expirationDateState;
        }

        /* renamed from: component3, reason: from getter */
        public final OptionSideBySideChainTableData getTableData() {
            return this.tableData;
        }

        public final Map<UUID, OptionInstrumentQuote> component4() {
            return this.optionInstrumentQuotes;
        }

        public final Map<UUID, Tradability> component5() {
            return this.optionInstrumentIdToTradabilityMap;
        }

        /* renamed from: component6, reason: from getter */
        public final Instant getSelloutDateTime() {
            return this.selloutDateTime;
        }

        public final ImmutableList<UiOptionStrategyLegDisplay> component7() {
            return this.targetLegs;
        }

        /* renamed from: component8, reason: from getter */
        public final BigDecimal getTargetStrikePrice() {
            return this.targetStrikePrice;
        }

        /* renamed from: component9, reason: from getter */
        public final TempState getTempState() {
            return this.tempState;
        }

        public final PageState copy(boolean initialInstrumentsLoaded, OptionChainExpirationDateState expirationDateState, OptionSideBySideChainTableData tableData, Map<UUID, OptionInstrumentQuote> optionInstrumentQuotes, Map<UUID, ? extends Tradability> optionInstrumentIdToTradabilityMap, Instant selloutDateTime, ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs, BigDecimal targetStrikePrice, TempState tempState) {
            Intrinsics.checkNotNullParameter(tableData, "tableData");
            Intrinsics.checkNotNullParameter(optionInstrumentQuotes, "optionInstrumentQuotes");
            Intrinsics.checkNotNullParameter(optionInstrumentIdToTradabilityMap, "optionInstrumentIdToTradabilityMap");
            Intrinsics.checkNotNullParameter(targetLegs, "targetLegs");
            Intrinsics.checkNotNullParameter(tempState, "tempState");
            return new PageState(initialInstrumentsLoaded, expirationDateState, tableData, optionInstrumentQuotes, optionInstrumentIdToTradabilityMap, selloutDateTime, targetLegs, targetStrikePrice, tempState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageState)) {
                return false;
            }
            PageState pageState = (PageState) other;
            return this.initialInstrumentsLoaded == pageState.initialInstrumentsLoaded && Intrinsics.areEqual(this.expirationDateState, pageState.expirationDateState) && Intrinsics.areEqual(this.tableData, pageState.tableData) && Intrinsics.areEqual(this.optionInstrumentQuotes, pageState.optionInstrumentQuotes) && Intrinsics.areEqual(this.optionInstrumentIdToTradabilityMap, pageState.optionInstrumentIdToTradabilityMap) && Intrinsics.areEqual(this.selloutDateTime, pageState.selloutDateTime) && Intrinsics.areEqual(this.targetLegs, pageState.targetLegs) && Intrinsics.areEqual(this.targetStrikePrice, pageState.targetStrikePrice) && Intrinsics.areEqual(this.tempState, pageState.tempState);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.initialInstrumentsLoaded) * 31;
            OptionChainExpirationDateState optionChainExpirationDateState = this.expirationDateState;
            int iHashCode2 = (((((((iHashCode + (optionChainExpirationDateState == null ? 0 : optionChainExpirationDateState.hashCode())) * 31) + this.tableData.hashCode()) * 31) + this.optionInstrumentQuotes.hashCode()) * 31) + this.optionInstrumentIdToTradabilityMap.hashCode()) * 31;
            Instant instant = this.selloutDateTime;
            int iHashCode3 = (((iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31) + this.targetLegs.hashCode()) * 31;
            BigDecimal bigDecimal = this.targetStrikePrice;
            return ((iHashCode3 + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31) + this.tempState.hashCode();
        }

        public String toString() {
            return "PageState(initialInstrumentsLoaded=" + this.initialInstrumentsLoaded + ", expirationDateState=" + this.expirationDateState + ", tableData=" + this.tableData + ", optionInstrumentQuotes=" + this.optionInstrumentQuotes + ", optionInstrumentIdToTradabilityMap=" + this.optionInstrumentIdToTradabilityMap + ", selloutDateTime=" + this.selloutDateTime + ", targetLegs=" + this.targetLegs + ", targetStrikePrice=" + this.targetStrikePrice + ", tempState=" + this.tempState + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PageState(boolean z, OptionChainExpirationDateState optionChainExpirationDateState, OptionSideBySideChainTableData tableData, Map<UUID, OptionInstrumentQuote> optionInstrumentQuotes, Map<UUID, ? extends Tradability> optionInstrumentIdToTradabilityMap, Instant instant, ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs, BigDecimal bigDecimal, TempState tempState) {
            Intrinsics.checkNotNullParameter(tableData, "tableData");
            Intrinsics.checkNotNullParameter(optionInstrumentQuotes, "optionInstrumentQuotes");
            Intrinsics.checkNotNullParameter(optionInstrumentIdToTradabilityMap, "optionInstrumentIdToTradabilityMap");
            Intrinsics.checkNotNullParameter(targetLegs, "targetLegs");
            Intrinsics.checkNotNullParameter(tempState, "tempState");
            this.initialInstrumentsLoaded = z;
            this.expirationDateState = optionChainExpirationDateState;
            this.tableData = tableData;
            this.optionInstrumentQuotes = optionInstrumentQuotes;
            this.optionInstrumentIdToTradabilityMap = optionInstrumentIdToTradabilityMap;
            this.selloutDateTime = instant;
            this.targetLegs = targetLegs;
            this.targetStrikePrice = bigDecimal;
            this.tempState = tempState;
        }

        public final boolean getInitialInstrumentsLoaded() {
            return this.initialInstrumentsLoaded;
        }

        public final OptionChainExpirationDateState getExpirationDateState() {
            return this.expirationDateState;
        }

        public /* synthetic */ PageState(boolean z, OptionChainExpirationDateState optionChainExpirationDateState, OptionSideBySideChainTableData optionSideBySideChainTableData, Map map, Map map2, Instant instant, ImmutableList immutableList, BigDecimal bigDecimal, TempState tempState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : optionChainExpirationDateState, (i & 4) != 0 ? new OptionSideBySideChainTableData(extensions2.persistentListOf(), null, null, null, null) : optionSideBySideChainTableData, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? MapsKt.emptyMap() : map2, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? extensions2.persistentListOf() : immutableList, (i & 128) == 0 ? bigDecimal : null, (i & 256) != 0 ? new TempState(null, null, null, 7, null) : tempState);
        }

        public final OptionSideBySideChainTableData getTableData() {
            return this.tableData;
        }

        public final Map<UUID, OptionInstrumentQuote> getOptionInstrumentQuotes() {
            return this.optionInstrumentQuotes;
        }

        public final Map<UUID, Tradability> getOptionInstrumentIdToTradabilityMap() {
            return this.optionInstrumentIdToTradabilityMap;
        }

        public final Instant getSelloutDateTime() {
            return this.selloutDateTime;
        }

        public final ImmutableList<UiOptionStrategyLegDisplay> getTargetLegs() {
            return this.targetLegs;
        }

        public final BigDecimal getTargetStrikePrice() {
            return this.targetStrikePrice;
        }

        public final TempState getTempState() {
            return this.tempState;
        }

        /* compiled from: OptionSideBySideChainTableDataState.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState$PageState$TempState;", "", "initialDragTargetForLogging", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;", "dragTarget", "draggedOverIndex", "", "<init>", "(Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;Ljava/lang/Integer;)V", "getInitialDragTargetForLogging", "()Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;", "getDragTarget", "getDraggedOverIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;Ljava/lang/Integer;)Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState$PageState$TempState;", "equals", "", "other", "hashCode", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TempState {
            public static final int $stable = 8;
            private final DragTarget dragTarget;
            private final Integer draggedOverIndex;
            private final DragTarget initialDragTargetForLogging;

            public TempState() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ TempState copy$default(TempState tempState, DragTarget dragTarget, DragTarget dragTarget2, Integer num, int i, Object obj) {
                if ((i & 1) != 0) {
                    dragTarget = tempState.initialDragTargetForLogging;
                }
                if ((i & 2) != 0) {
                    dragTarget2 = tempState.dragTarget;
                }
                if ((i & 4) != 0) {
                    num = tempState.draggedOverIndex;
                }
                return tempState.copy(dragTarget, dragTarget2, num);
            }

            /* renamed from: component1, reason: from getter */
            public final DragTarget getInitialDragTargetForLogging() {
                return this.initialDragTargetForLogging;
            }

            /* renamed from: component2, reason: from getter */
            public final DragTarget getDragTarget() {
                return this.dragTarget;
            }

            /* renamed from: component3, reason: from getter */
            public final Integer getDraggedOverIndex() {
                return this.draggedOverIndex;
            }

            public final TempState copy(DragTarget initialDragTargetForLogging, DragTarget dragTarget, Integer draggedOverIndex) {
                return new TempState(initialDragTargetForLogging, dragTarget, draggedOverIndex);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TempState)) {
                    return false;
                }
                TempState tempState = (TempState) other;
                return Intrinsics.areEqual(this.initialDragTargetForLogging, tempState.initialDragTargetForLogging) && Intrinsics.areEqual(this.dragTarget, tempState.dragTarget) && Intrinsics.areEqual(this.draggedOverIndex, tempState.draggedOverIndex);
            }

            public int hashCode() {
                DragTarget dragTarget = this.initialDragTargetForLogging;
                int iHashCode = (dragTarget == null ? 0 : dragTarget.hashCode()) * 31;
                DragTarget dragTarget2 = this.dragTarget;
                int iHashCode2 = (iHashCode + (dragTarget2 == null ? 0 : dragTarget2.hashCode())) * 31;
                Integer num = this.draggedOverIndex;
                return iHashCode2 + (num != null ? num.hashCode() : 0);
            }

            public String toString() {
                return "TempState(initialDragTargetForLogging=" + this.initialDragTargetForLogging + ", dragTarget=" + this.dragTarget + ", draggedOverIndex=" + this.draggedOverIndex + ")";
            }

            public TempState(DragTarget dragTarget, DragTarget dragTarget2, Integer num) {
                this.initialDragTargetForLogging = dragTarget;
                this.dragTarget = dragTarget2;
                this.draggedOverIndex = num;
            }

            public /* synthetic */ TempState(DragTarget dragTarget, DragTarget dragTarget2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : dragTarget, (i & 2) != 0 ? null : dragTarget2, (i & 4) != 0 ? null : num);
            }

            public final DragTarget getInitialDragTargetForLogging() {
                return this.initialDragTargetForLogging;
            }

            public final DragTarget getDragTarget() {
                return this.dragTarget;
            }

            public final Integer getDraggedOverIndex() {
                return this.draggedOverIndex;
            }
        }
    }
}
