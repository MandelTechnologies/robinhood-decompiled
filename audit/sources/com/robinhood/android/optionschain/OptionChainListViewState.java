package com.robinhood.android.optionschain;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.options.upsell.fridaytrading.OptionDiscoverZeroDteSnackbarState;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.optionschain.OptionChainAdapter;
import com.robinhood.android.optionschain.OptionChainViewState;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionChainSelectedMetrics;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.OptionConfigurationBundle;
import com.robinhood.models.p355ui.OptionWatchlistItemState;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionPositionCounts;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.shared.lists.quickadd.extensions.OptionInstruments3;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.datetime.Instants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: OptionChainListViewState.kt */
@Metadata(m3635d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0004Ä\u0001Å\u0001B¡\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020 0\u001d\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010&\u0012\u0012\b\u0002\u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010+\u0012\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010+\u0012\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010+\u0012\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0018\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00106\u001a\u000205\u0012\b\b\u0002\u00107\u001a\u00020\r\u0012\b\b\u0002\u00108\u001a\u00020\r\u0012\b\b\u0002\u00109\u001a\u00020\r\u0012\b\b\u0002\u0010:\u001a\u00020\r¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\u00002\u0006\u0010=\u001a\u00020&¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bL\u0010KJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0016\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bW\u0010XJ\u001c\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001e0\u001dHÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u001c\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020 0\u001dHÆ\u0003¢\u0006\u0004\b[\u0010ZJ\u0012\u0010\\\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\b\\\u0010]J\u0012\u0010^\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\b^\u0010_J\u0012\u0010`\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\b`\u0010aJ\u0012\u0010b\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bb\u0010cJ\u0012\u0010d\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bd\u0010aJ\u001a\u0010e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010+HÆ\u0003¢\u0006\u0004\be\u0010fJ\u0018\u0010g\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010+HÆ\u0003¢\u0006\u0004\bg\u0010fJ\u0018\u0010h\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010+HÆ\u0003¢\u0006\u0004\bh\u0010fJ\u0016\u0010i\u001a\b\u0012\u0004\u0012\u0002000\u0018HÆ\u0003¢\u0006\u0004\bi\u0010VJ\u0012\u0010j\u001a\u0004\u0018\u000102HÆ\u0003¢\u0006\u0004\bj\u0010kJ\u0012\u0010l\u001a\u0004\u0018\u000102HÆ\u0003¢\u0006\u0004\bl\u0010kJ\u0010\u0010m\u001a\u000205HÆ\u0003¢\u0006\u0004\bm\u0010nJ\u0010\u0010o\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bo\u0010KJ\u0010\u0010p\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bp\u0010KJ\u0010\u0010q\u001a\u00020\rHÆ\u0003¢\u0006\u0004\bq\u0010KJ\u0010\u0010r\u001a\u00020\rHÆ\u0003¢\u0006\u0004\br\u0010KJª\u0003\u0010s\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020 0\u001d2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010&2\u0012\b\u0002\u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010+2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010+2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010+2\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00182\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00104\u001a\u0004\u0018\u0001022\b\b\u0002\u00106\u001a\u0002052\b\b\u0002\u00107\u001a\u00020\r2\b\b\u0002\u00108\u001a\u00020\r2\b\b\u0002\u00109\u001a\u00020\r2\b\b\u0002\u0010:\u001a\u00020\rHÆ\u0001¢\u0006\u0004\bs\u0010tJ\u0010\u0010v\u001a\u00020uHÖ\u0001¢\u0006\u0004\bv\u0010wJ\u0010\u0010y\u001a\u00020xHÖ\u0001¢\u0006\u0004\by\u0010zJ\u001a\u0010|\u001a\u00020\r2\b\u0010{\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b|\u0010}R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010~\u001a\u0004\b\u007f\u0010AR\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b\u0005\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010CR\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u000e\n\u0005\b\u0007\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010ER\u001b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b\t\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010GR\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\u000e\n\u0005\b\f\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010IR\u0019\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010KR\u0019\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010\u0088\u0001\u001a\u0005\b\u008a\u0001\u0010KR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010NR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010PR\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010RR\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010\u0091\u0001\u001a\u0005\b\u0092\u0001\u0010TR\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010\u0093\u0001\u001a\u0005\b\u0094\u0001\u0010VR\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010\u0095\u0001\u001a\u0005\b\u0096\u0001\u0010XR%\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u0010ZR%\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020 0\u001d8\u0006¢\u0006\u000e\n\u0005\b!\u0010\u0097\u0001\u001a\u0005\b\u0099\u0001\u0010ZR\u001b\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\u000e\n\u0005\b#\u0010\u009a\u0001\u001a\u0005\b\u009b\u0001\u0010]R\u001b\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\u000e\n\u0005\b%\u0010\u009c\u0001\u001a\u0005\b\u009d\u0001\u0010_R\u001b\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\u000e\n\u0005\b'\u0010\u009e\u0001\u001a\u0005\b\u009f\u0001\u0010aR\u001b\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\u000e\n\u0005\b)\u0010 \u0001\u001a\u0005\b¡\u0001\u0010cR\u001b\u0010*\u001a\u0004\u0018\u00010&8\u0006¢\u0006\u000e\n\u0005\b*\u0010\u009e\u0001\u001a\u0005\b¢\u0001\u0010aR#\u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010+8\u0006¢\u0006\u000e\n\u0005\b,\u0010£\u0001\u001a\u0005\b¤\u0001\u0010fR!\u0010-\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010+8\u0006¢\u0006\u000e\n\u0005\b-\u0010£\u0001\u001a\u0005\b¥\u0001\u0010fR!\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010+8\u0006¢\u0006\u000e\n\u0005\b/\u0010£\u0001\u001a\u0005\b¦\u0001\u0010fR\u001f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00188\u0006¢\u0006\u000e\n\u0005\b1\u0010\u0093\u0001\u001a\u0005\b§\u0001\u0010VR\u001b\u00103\u001a\u0004\u0018\u0001028\u0006¢\u0006\u000e\n\u0005\b3\u0010¨\u0001\u001a\u0005\b©\u0001\u0010kR\u001b\u00104\u001a\u0004\u0018\u0001028\u0006¢\u0006\u000e\n\u0005\b4\u0010¨\u0001\u001a\u0005\bª\u0001\u0010kR\u0019\u00106\u001a\u0002058\u0006¢\u0006\u000e\n\u0005\b6\u0010«\u0001\u001a\u0005\b¬\u0001\u0010nR\u0019\u00107\u001a\u00020\r8\u0006¢\u0006\u000e\n\u0005\b7\u0010\u0088\u0001\u001a\u0005\b\u00ad\u0001\u0010KR\u0018\u00108\u001a\u00020\r8\u0006¢\u0006\r\n\u0005\b8\u0010\u0088\u0001\u001a\u0004\b8\u0010KR\u0019\u00109\u001a\u00020\r8\u0006¢\u0006\u000e\n\u0005\b9\u0010\u0088\u0001\u001a\u0005\b®\u0001\u0010KR\u0019\u0010:\u001a\u00020\r8\u0006¢\u0006\u000e\n\u0005\b:\u0010\u0088\u0001\u001a\u0005\b¯\u0001\u0010KR\u001e\u0010°\u0001\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R\u001b\u0010´\u0001\u001a\u00020\r8\u0006¢\u0006\u000f\n\u0006\b´\u0001\u0010\u0088\u0001\u001a\u0005\bµ\u0001\u0010KR\u001b\u0010¶\u0001\u001a\u00020\r8\u0006¢\u0006\u000f\n\u0006\b¶\u0001\u0010\u0088\u0001\u001a\u0005\b·\u0001\u0010KR#\u0010¸\u0001\u001a\n\u0012\u0004\u0012\u00020u\u0018\u00010\u00188\u0006¢\u0006\u000f\n\u0006\b¸\u0001\u0010\u0093\u0001\u001a\u0005\b¹\u0001\u0010VR\u001f\u0010»\u0001\u001a\u0005\u0018\u00010º\u00018\u0006¢\u0006\u0010\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R\u001f\u0010À\u0001\u001a\u0005\u0018\u00010¿\u00018\u0006¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001¨\u0006Æ\u0001"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainListViewState;", "", "Lcom/robinhood/models/db/Account;", "account", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "currentOrNextMarketDates", "Lcom/robinhood/models/db/Quote;", "equityQuote", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "defaultPricingType", "", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$Feature;", "featureSet", "", "multilegAvailable", "initialInstrumentsLoaded", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "indexValue", "Lcom/robinhood/models/ui/UiOptionChain;", "uiOptionChain", "Lcom/robinhood/android/optionschain/OptionChainConfiguration;", "optionChainConfiguration", "Lcom/robinhood/models/ui/OptionConfigurationBundle;", "optionConfigurationBundle", "", "Lcom/robinhood/models/db/OptionInstrument;", "optionInstruments", "Ljava/util/UUID;", "optionInstrumentToRollId", "", "Lcom/robinhood/models/ui/UiOptionPositionCounts;", "optionPositionCount", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "optionQuotes", "j$/time/Instant", "selloutTime", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "tradingOnExpirationState", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;", "scrollTarget", "Lcom/robinhood/android/optionschain/OptionChainListViewState$PendingScrollTarget;", "pendingScrollTarget", "currentScrollPosition", "Lcom/robinhood/udf/UiEvent;", "scrollTargetEvent", "showRippleEvent", "Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook;", "upsellHookEvent", "Lcom/robinhood/models/ui/OptionWatchlistItemState;", "watchlistItemStates", "Lcom/robinhood/models/db/OptionChainSelectedMetrics;", "buySelectedMetrics", "sellSelectedMetrics", "Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteSnackbarState;", "discoverZeroDteSnackbarState", "fragmentSelloutSnackbarDismissedOrElapsed", "isSelloutSnackbarDismissalExperimentEnabled", "inSelloutImprovementExperiment", "inSnackbarDismissalFollowUpExperiment", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Ljava/util/Set;ZZLcom/robinhood/android/indexes/models/db/IndexValue;Lcom/robinhood/models/ui/UiOptionChain;Lcom/robinhood/android/optionschain/OptionChainConfiguration;Lcom/robinhood/models/ui/OptionConfigurationBundle;Ljava/util/List;Ljava/util/UUID;Ljava/util/Map;Ljava/util/Map;Lj$/time/Instant;Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;Lcom/robinhood/android/optionschain/OptionChainListViewState$PendingScrollTarget;Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/util/List;Lcom/robinhood/models/db/OptionChainSelectedMetrics;Lcom/robinhood/models/db/OptionChainSelectedMetrics;Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteSnackbarState;ZZZZ)V", "newTarget", "mutateWithScrollTarget", "(Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;)Lcom/robinhood/android/optionschain/OptionChainListViewState;", "component1", "()Lcom/robinhood/models/db/Account;", "component2", "()Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "component3", "()Lcom/robinhood/models/db/Quote;", "component4", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "component5", "()Ljava/util/Set;", "component6", "()Z", "component7", "component8", "()Lcom/robinhood/android/indexes/models/db/IndexValue;", "component9", "()Lcom/robinhood/models/ui/UiOptionChain;", "component10", "()Lcom/robinhood/android/optionschain/OptionChainConfiguration;", "component11", "()Lcom/robinhood/models/ui/OptionConfigurationBundle;", "component12", "()Ljava/util/List;", "component13", "()Ljava/util/UUID;", "component14", "()Ljava/util/Map;", "component15", "component16", "()Lj$/time/Instant;", "component17", "()Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "component18", "()Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;", "component19", "()Lcom/robinhood/android/optionschain/OptionChainListViewState$PendingScrollTarget;", "component20", "component21", "()Lcom/robinhood/udf/UiEvent;", "component22", "component23", "component24", "component25", "()Lcom/robinhood/models/db/OptionChainSelectedMetrics;", "component26", "component27", "()Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteSnackbarState;", "component28", "component29", "component30", "component31", "copy", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Ljava/util/Set;ZZLcom/robinhood/android/indexes/models/db/IndexValue;Lcom/robinhood/models/ui/UiOptionChain;Lcom/robinhood/android/optionschain/OptionChainConfiguration;Lcom/robinhood/models/ui/OptionConfigurationBundle;Ljava/util/List;Ljava/util/UUID;Ljava/util/Map;Ljava/util/Map;Lj$/time/Instant;Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;Lcom/robinhood/android/optionschain/OptionChainListViewState$PendingScrollTarget;Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/util/List;Lcom/robinhood/models/db/OptionChainSelectedMetrics;Lcom/robinhood/models/db/OptionChainSelectedMetrics;Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteSnackbarState;ZZZZ)Lcom/robinhood/android/optionschain/OptionChainListViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/Account;", "getAccount", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "getCurrentOrNextMarketDates", "Lcom/robinhood/models/db/Quote;", "getEquityQuote", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getDefaultPricingType", "Ljava/util/Set;", "getFeatureSet", "Z", "getMultilegAvailable", "getInitialInstrumentsLoaded", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "getIndexValue", "Lcom/robinhood/models/ui/UiOptionChain;", "getUiOptionChain", "Lcom/robinhood/android/optionschain/OptionChainConfiguration;", "getOptionChainConfiguration", "Lcom/robinhood/models/ui/OptionConfigurationBundle;", "getOptionConfigurationBundle", "Ljava/util/List;", "getOptionInstruments", "Ljava/util/UUID;", "getOptionInstrumentToRollId", "Ljava/util/Map;", "getOptionPositionCount", "getOptionQuotes", "Lj$/time/Instant;", "getSelloutTime", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "getTradingOnExpirationState", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;", "getScrollTarget", "Lcom/robinhood/android/optionschain/OptionChainListViewState$PendingScrollTarget;", "getPendingScrollTarget", "getCurrentScrollPosition", "Lcom/robinhood/udf/UiEvent;", "getScrollTargetEvent", "getShowRippleEvent", "getUpsellHookEvent", "getWatchlistItemStates", "Lcom/robinhood/models/db/OptionChainSelectedMetrics;", "getBuySelectedMetrics", "getSellSelectedMetrics", "Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteSnackbarState;", "getDiscoverZeroDteSnackbarState", "getFragmentSelloutSnackbarDismissedOrElapsed", "getInSelloutImprovementExperiment", "getInSnackbarDismissalFollowUpExperiment", "accountIsMargin", "Ljava/lang/Boolean;", "getAccountIsMargin", "()Ljava/lang/Boolean;", "watchlistActionsAvailable", "getWatchlistActionsAvailable", "shouldShowSelloutSnackbar", "getShouldShowSelloutSnackbar", "strategyCodes", "getStrategyCodes", "Lcom/robinhood/android/optionschain/OptionChainAdapter$State;", "adapterState", "Lcom/robinhood/android/optionschain/OptionChainAdapter$State;", "getAdapterState", "()Lcom/robinhood/android/optionschain/OptionChainAdapter$State;", "Lcom/robinhood/models/ui/UnderlyingQuote;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "getUnderlyingQuote", "()Lcom/robinhood/models/ui/UnderlyingQuote;", "ScrollTarget", "PendingScrollTarget", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class OptionChainListViewState {
    public static final int $stable = 8;
    private final Account account;
    private final Boolean accountIsMargin;
    private final OptionChainAdapter.State adapterState;
    private final OptionChainSelectedMetrics buySelectedMetrics;
    private final OptionCurrentOrNextMarketDates currentOrNextMarketDates;
    private final ScrollTarget currentScrollPosition;
    private final OptionSettings.DefaultPricingSetting defaultPricingType;
    private final OptionDiscoverZeroDteSnackbarState discoverZeroDteSnackbarState;
    private final Quote equityQuote;
    private final Set<OptionChainLaunchMode.Feature> featureSet;
    private final boolean fragmentSelloutSnackbarDismissedOrElapsed;
    private final boolean inSelloutImprovementExperiment;
    private final boolean inSnackbarDismissalFollowUpExperiment;
    private final IndexValue indexValue;
    private final boolean initialInstrumentsLoaded;
    private final boolean isSelloutSnackbarDismissalExperimentEnabled;
    private final boolean multilegAvailable;
    private final OptionChainConfiguration optionChainConfiguration;
    private final OptionConfigurationBundle optionConfigurationBundle;
    private final UUID optionInstrumentToRollId;
    private final List<OptionInstrument> optionInstruments;
    private final Map<UUID, UiOptionPositionCounts> optionPositionCount;
    private final Map<UUID, OptionInstrumentQuote> optionQuotes;
    private final PendingScrollTarget pendingScrollTarget;
    private final ScrollTarget scrollTarget;
    private final UiEvent<ScrollTarget> scrollTargetEvent;
    private final OptionChainSelectedMetrics sellSelectedMetrics;
    private final Instant selloutTime;
    private final boolean shouldShowSelloutSnackbar;
    private final UiEvent<Boolean> showRippleEvent;
    private final List<String> strategyCodes;
    private final OptionSettings.TradingOnExpirationState tradingOnExpirationState;
    private final UiOptionChain uiOptionChain;
    private final UnderlyingQuote underlyingQuote;
    private final UiEvent<OptionChainViewState.UpsellHook> upsellHookEvent;
    private final boolean watchlistActionsAvailable;
    private final List<OptionWatchlistItemState> watchlistItemStates;

    public OptionChainListViewState() {
        this(null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, Integer.MAX_VALUE, null);
    }

    public static /* synthetic */ OptionChainListViewState copy$default(OptionChainListViewState optionChainListViewState, Account account, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, Quote quote, OptionSettings.DefaultPricingSetting defaultPricingSetting, Set set, boolean z, boolean z2, IndexValue indexValue, UiOptionChain uiOptionChain, OptionChainConfiguration optionChainConfiguration, OptionConfigurationBundle optionConfigurationBundle, List list, UUID uuid, Map map, Map map2, Instant instant, OptionSettings.TradingOnExpirationState tradingOnExpirationState, ScrollTarget scrollTarget, PendingScrollTarget pendingScrollTarget, ScrollTarget scrollTarget2, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, List list2, OptionChainSelectedMetrics optionChainSelectedMetrics, OptionChainSelectedMetrics optionChainSelectedMetrics2, OptionDiscoverZeroDteSnackbarState optionDiscoverZeroDteSnackbarState, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        boolean z7;
        boolean z8;
        Account account2 = (i & 1) != 0 ? optionChainListViewState.account : account;
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates2 = (i & 2) != 0 ? optionChainListViewState.currentOrNextMarketDates : optionCurrentOrNextMarketDates;
        Quote quote2 = (i & 4) != 0 ? optionChainListViewState.equityQuote : quote;
        OptionSettings.DefaultPricingSetting defaultPricingSetting2 = (i & 8) != 0 ? optionChainListViewState.defaultPricingType : defaultPricingSetting;
        Set set2 = (i & 16) != 0 ? optionChainListViewState.featureSet : set;
        boolean z9 = (i & 32) != 0 ? optionChainListViewState.multilegAvailable : z;
        boolean z10 = (i & 64) != 0 ? optionChainListViewState.initialInstrumentsLoaded : z2;
        IndexValue indexValue2 = (i & 128) != 0 ? optionChainListViewState.indexValue : indexValue;
        UiOptionChain uiOptionChain2 = (i & 256) != 0 ? optionChainListViewState.uiOptionChain : uiOptionChain;
        OptionChainConfiguration optionChainConfiguration2 = (i & 512) != 0 ? optionChainListViewState.optionChainConfiguration : optionChainConfiguration;
        OptionConfigurationBundle optionConfigurationBundle2 = (i & 1024) != 0 ? optionChainListViewState.optionConfigurationBundle : optionConfigurationBundle;
        List list3 = (i & 2048) != 0 ? optionChainListViewState.optionInstruments : list;
        UUID uuid2 = (i & 4096) != 0 ? optionChainListViewState.optionInstrumentToRollId : uuid;
        Map map3 = (i & 8192) != 0 ? optionChainListViewState.optionPositionCount : map;
        Account account3 = account2;
        Map map4 = (i & 16384) != 0 ? optionChainListViewState.optionQuotes : map2;
        Instant instant2 = (i & 32768) != 0 ? optionChainListViewState.selloutTime : instant;
        OptionSettings.TradingOnExpirationState tradingOnExpirationState2 = (i & 65536) != 0 ? optionChainListViewState.tradingOnExpirationState : tradingOnExpirationState;
        ScrollTarget scrollTarget3 = (i & 131072) != 0 ? optionChainListViewState.scrollTarget : scrollTarget;
        PendingScrollTarget pendingScrollTarget2 = (i & 262144) != 0 ? optionChainListViewState.pendingScrollTarget : pendingScrollTarget;
        ScrollTarget scrollTarget4 = (i & 524288) != 0 ? optionChainListViewState.currentScrollPosition : scrollTarget2;
        UiEvent uiEvent4 = (i & 1048576) != 0 ? optionChainListViewState.scrollTargetEvent : uiEvent;
        UiEvent uiEvent5 = (i & 2097152) != 0 ? optionChainListViewState.showRippleEvent : uiEvent2;
        UiEvent uiEvent6 = (i & 4194304) != 0 ? optionChainListViewState.upsellHookEvent : uiEvent3;
        List list4 = (i & 8388608) != 0 ? optionChainListViewState.watchlistItemStates : list2;
        OptionChainSelectedMetrics optionChainSelectedMetrics3 = (i & 16777216) != 0 ? optionChainListViewState.buySelectedMetrics : optionChainSelectedMetrics;
        OptionChainSelectedMetrics optionChainSelectedMetrics4 = (i & 33554432) != 0 ? optionChainListViewState.sellSelectedMetrics : optionChainSelectedMetrics2;
        OptionDiscoverZeroDteSnackbarState optionDiscoverZeroDteSnackbarState2 = (i & 67108864) != 0 ? optionChainListViewState.discoverZeroDteSnackbarState : optionDiscoverZeroDteSnackbarState;
        boolean z11 = (i & 134217728) != 0 ? optionChainListViewState.fragmentSelloutSnackbarDismissedOrElapsed : z3;
        boolean z12 = (i & 268435456) != 0 ? optionChainListViewState.isSelloutSnackbarDismissalExperimentEnabled : z4;
        boolean z13 = (i & 536870912) != 0 ? optionChainListViewState.inSelloutImprovementExperiment : z5;
        if ((i & 1073741824) != 0) {
            z8 = z13;
            z7 = optionChainListViewState.inSnackbarDismissalFollowUpExperiment;
        } else {
            z7 = z6;
            z8 = z13;
        }
        return optionChainListViewState.copy(account3, optionCurrentOrNextMarketDates2, quote2, defaultPricingSetting2, set2, z9, z10, indexValue2, uiOptionChain2, optionChainConfiguration2, optionConfigurationBundle2, list3, uuid2, map3, map4, instant2, tradingOnExpirationState2, scrollTarget3, pendingScrollTarget2, scrollTarget4, uiEvent4, uiEvent5, uiEvent6, list4, optionChainSelectedMetrics3, optionChainSelectedMetrics4, optionDiscoverZeroDteSnackbarState2, z11, z12, z8, z7);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component10, reason: from getter */
    public final OptionChainConfiguration getOptionChainConfiguration() {
        return this.optionChainConfiguration;
    }

    /* renamed from: component11, reason: from getter */
    public final OptionConfigurationBundle getOptionConfigurationBundle() {
        return this.optionConfigurationBundle;
    }

    public final List<OptionInstrument> component12() {
        return this.optionInstruments;
    }

    /* renamed from: component13, reason: from getter */
    public final UUID getOptionInstrumentToRollId() {
        return this.optionInstrumentToRollId;
    }

    public final Map<UUID, UiOptionPositionCounts> component14() {
        return this.optionPositionCount;
    }

    public final Map<UUID, OptionInstrumentQuote> component15() {
        return this.optionQuotes;
    }

    /* renamed from: component16, reason: from getter */
    public final Instant getSelloutTime() {
        return this.selloutTime;
    }

    /* renamed from: component17, reason: from getter */
    public final OptionSettings.TradingOnExpirationState getTradingOnExpirationState() {
        return this.tradingOnExpirationState;
    }

    /* renamed from: component18, reason: from getter */
    public final ScrollTarget getScrollTarget() {
        return this.scrollTarget;
    }

    /* renamed from: component19, reason: from getter */
    public final PendingScrollTarget getPendingScrollTarget() {
        return this.pendingScrollTarget;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    /* renamed from: component20, reason: from getter */
    public final ScrollTarget getCurrentScrollPosition() {
        return this.currentScrollPosition;
    }

    public final UiEvent<ScrollTarget> component21() {
        return this.scrollTargetEvent;
    }

    public final UiEvent<Boolean> component22() {
        return this.showRippleEvent;
    }

    public final UiEvent<OptionChainViewState.UpsellHook> component23() {
        return this.upsellHookEvent;
    }

    public final List<OptionWatchlistItemState> component24() {
        return this.watchlistItemStates;
    }

    /* renamed from: component25, reason: from getter */
    public final OptionChainSelectedMetrics getBuySelectedMetrics() {
        return this.buySelectedMetrics;
    }

    /* renamed from: component26, reason: from getter */
    public final OptionChainSelectedMetrics getSellSelectedMetrics() {
        return this.sellSelectedMetrics;
    }

    /* renamed from: component27, reason: from getter */
    public final OptionDiscoverZeroDteSnackbarState getDiscoverZeroDteSnackbarState() {
        return this.discoverZeroDteSnackbarState;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getFragmentSelloutSnackbarDismissedOrElapsed() {
        return this.fragmentSelloutSnackbarDismissedOrElapsed;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getIsSelloutSnackbarDismissalExperimentEnabled() {
        return this.isSelloutSnackbarDismissalExperimentEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final Quote getEquityQuote() {
        return this.equityQuote;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getInSelloutImprovementExperiment() {
        return this.inSelloutImprovementExperiment;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getInSnackbarDismissalFollowUpExperiment() {
        return this.inSnackbarDismissalFollowUpExperiment;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionSettings.DefaultPricingSetting getDefaultPricingType() {
        return this.defaultPricingType;
    }

    public final Set<OptionChainLaunchMode.Feature> component5() {
        return this.featureSet;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getMultilegAvailable() {
        return this.multilegAvailable;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getInitialInstrumentsLoaded() {
        return this.initialInstrumentsLoaded;
    }

    /* renamed from: component8, reason: from getter */
    public final IndexValue getIndexValue() {
        return this.indexValue;
    }

    /* renamed from: component9, reason: from getter */
    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    public final OptionChainListViewState copy(Account account, OptionCurrentOrNextMarketDates currentOrNextMarketDates, Quote equityQuote, OptionSettings.DefaultPricingSetting defaultPricingType, Set<? extends OptionChainLaunchMode.Feature> featureSet, boolean multilegAvailable, boolean initialInstrumentsLoaded, IndexValue indexValue, UiOptionChain uiOptionChain, OptionChainConfiguration optionChainConfiguration, OptionConfigurationBundle optionConfigurationBundle, List<OptionInstrument> optionInstruments, UUID optionInstrumentToRollId, Map<UUID, UiOptionPositionCounts> optionPositionCount, Map<UUID, OptionInstrumentQuote> optionQuotes, Instant selloutTime, OptionSettings.TradingOnExpirationState tradingOnExpirationState, ScrollTarget scrollTarget, PendingScrollTarget pendingScrollTarget, ScrollTarget currentScrollPosition, UiEvent<ScrollTarget> scrollTargetEvent, UiEvent<Boolean> showRippleEvent, UiEvent<OptionChainViewState.UpsellHook> upsellHookEvent, List<? extends OptionWatchlistItemState> watchlistItemStates, OptionChainSelectedMetrics buySelectedMetrics, OptionChainSelectedMetrics sellSelectedMetrics, OptionDiscoverZeroDteSnackbarState discoverZeroDteSnackbarState, boolean fragmentSelloutSnackbarDismissedOrElapsed, boolean isSelloutSnackbarDismissalExperimentEnabled, boolean inSelloutImprovementExperiment, boolean inSnackbarDismissalFollowUpExperiment) {
        Intrinsics.checkNotNullParameter(featureSet, "featureSet");
        Intrinsics.checkNotNullParameter(optionInstruments, "optionInstruments");
        Intrinsics.checkNotNullParameter(optionPositionCount, "optionPositionCount");
        Intrinsics.checkNotNullParameter(optionQuotes, "optionQuotes");
        Intrinsics.checkNotNullParameter(watchlistItemStates, "watchlistItemStates");
        Intrinsics.checkNotNullParameter(discoverZeroDteSnackbarState, "discoverZeroDteSnackbarState");
        return new OptionChainListViewState(account, currentOrNextMarketDates, equityQuote, defaultPricingType, featureSet, multilegAvailable, initialInstrumentsLoaded, indexValue, uiOptionChain, optionChainConfiguration, optionConfigurationBundle, optionInstruments, optionInstrumentToRollId, optionPositionCount, optionQuotes, selloutTime, tradingOnExpirationState, scrollTarget, pendingScrollTarget, currentScrollPosition, scrollTargetEvent, showRippleEvent, upsellHookEvent, watchlistItemStates, buySelectedMetrics, sellSelectedMetrics, discoverZeroDteSnackbarState, fragmentSelloutSnackbarDismissedOrElapsed, isSelloutSnackbarDismissalExperimentEnabled, inSelloutImprovementExperiment, inSnackbarDismissalFollowUpExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainListViewState)) {
            return false;
        }
        OptionChainListViewState optionChainListViewState = (OptionChainListViewState) other;
        return Intrinsics.areEqual(this.account, optionChainListViewState.account) && Intrinsics.areEqual(this.currentOrNextMarketDates, optionChainListViewState.currentOrNextMarketDates) && Intrinsics.areEqual(this.equityQuote, optionChainListViewState.equityQuote) && this.defaultPricingType == optionChainListViewState.defaultPricingType && Intrinsics.areEqual(this.featureSet, optionChainListViewState.featureSet) && this.multilegAvailable == optionChainListViewState.multilegAvailable && this.initialInstrumentsLoaded == optionChainListViewState.initialInstrumentsLoaded && Intrinsics.areEqual(this.indexValue, optionChainListViewState.indexValue) && Intrinsics.areEqual(this.uiOptionChain, optionChainListViewState.uiOptionChain) && Intrinsics.areEqual(this.optionChainConfiguration, optionChainListViewState.optionChainConfiguration) && Intrinsics.areEqual(this.optionConfigurationBundle, optionChainListViewState.optionConfigurationBundle) && Intrinsics.areEqual(this.optionInstruments, optionChainListViewState.optionInstruments) && Intrinsics.areEqual(this.optionInstrumentToRollId, optionChainListViewState.optionInstrumentToRollId) && Intrinsics.areEqual(this.optionPositionCount, optionChainListViewState.optionPositionCount) && Intrinsics.areEqual(this.optionQuotes, optionChainListViewState.optionQuotes) && Intrinsics.areEqual(this.selloutTime, optionChainListViewState.selloutTime) && this.tradingOnExpirationState == optionChainListViewState.tradingOnExpirationState && Intrinsics.areEqual(this.scrollTarget, optionChainListViewState.scrollTarget) && Intrinsics.areEqual(this.pendingScrollTarget, optionChainListViewState.pendingScrollTarget) && Intrinsics.areEqual(this.currentScrollPosition, optionChainListViewState.currentScrollPosition) && Intrinsics.areEqual(this.scrollTargetEvent, optionChainListViewState.scrollTargetEvent) && Intrinsics.areEqual(this.showRippleEvent, optionChainListViewState.showRippleEvent) && Intrinsics.areEqual(this.upsellHookEvent, optionChainListViewState.upsellHookEvent) && Intrinsics.areEqual(this.watchlistItemStates, optionChainListViewState.watchlistItemStates) && Intrinsics.areEqual(this.buySelectedMetrics, optionChainListViewState.buySelectedMetrics) && Intrinsics.areEqual(this.sellSelectedMetrics, optionChainListViewState.sellSelectedMetrics) && this.discoverZeroDteSnackbarState == optionChainListViewState.discoverZeroDteSnackbarState && this.fragmentSelloutSnackbarDismissedOrElapsed == optionChainListViewState.fragmentSelloutSnackbarDismissedOrElapsed && this.isSelloutSnackbarDismissalExperimentEnabled == optionChainListViewState.isSelloutSnackbarDismissalExperimentEnabled && this.inSelloutImprovementExperiment == optionChainListViewState.inSelloutImprovementExperiment && this.inSnackbarDismissalFollowUpExperiment == optionChainListViewState.inSnackbarDismissalFollowUpExperiment;
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates = this.currentOrNextMarketDates;
        int iHashCode2 = (iHashCode + (optionCurrentOrNextMarketDates == null ? 0 : optionCurrentOrNextMarketDates.hashCode())) * 31;
        Quote quote = this.equityQuote;
        int iHashCode3 = (iHashCode2 + (quote == null ? 0 : quote.hashCode())) * 31;
        OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingType;
        int iHashCode4 = (((((((iHashCode3 + (defaultPricingSetting == null ? 0 : defaultPricingSetting.hashCode())) * 31) + this.featureSet.hashCode()) * 31) + Boolean.hashCode(this.multilegAvailable)) * 31) + Boolean.hashCode(this.initialInstrumentsLoaded)) * 31;
        IndexValue indexValue = this.indexValue;
        int iHashCode5 = (iHashCode4 + (indexValue == null ? 0 : indexValue.hashCode())) * 31;
        UiOptionChain uiOptionChain = this.uiOptionChain;
        int iHashCode6 = (iHashCode5 + (uiOptionChain == null ? 0 : uiOptionChain.hashCode())) * 31;
        OptionChainConfiguration optionChainConfiguration = this.optionChainConfiguration;
        int iHashCode7 = (iHashCode6 + (optionChainConfiguration == null ? 0 : optionChainConfiguration.hashCode())) * 31;
        OptionConfigurationBundle optionConfigurationBundle = this.optionConfigurationBundle;
        int iHashCode8 = (((iHashCode7 + (optionConfigurationBundle == null ? 0 : optionConfigurationBundle.hashCode())) * 31) + this.optionInstruments.hashCode()) * 31;
        UUID uuid = this.optionInstrumentToRollId;
        int iHashCode9 = (((((iHashCode8 + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.optionPositionCount.hashCode()) * 31) + this.optionQuotes.hashCode()) * 31;
        Instant instant = this.selloutTime;
        int iHashCode10 = (iHashCode9 + (instant == null ? 0 : instant.hashCode())) * 31;
        OptionSettings.TradingOnExpirationState tradingOnExpirationState = this.tradingOnExpirationState;
        int iHashCode11 = (iHashCode10 + (tradingOnExpirationState == null ? 0 : tradingOnExpirationState.hashCode())) * 31;
        ScrollTarget scrollTarget = this.scrollTarget;
        int iHashCode12 = (iHashCode11 + (scrollTarget == null ? 0 : scrollTarget.hashCode())) * 31;
        PendingScrollTarget pendingScrollTarget = this.pendingScrollTarget;
        int iHashCode13 = (iHashCode12 + (pendingScrollTarget == null ? 0 : pendingScrollTarget.hashCode())) * 31;
        ScrollTarget scrollTarget2 = this.currentScrollPosition;
        int iHashCode14 = (iHashCode13 + (scrollTarget2 == null ? 0 : scrollTarget2.hashCode())) * 31;
        UiEvent<ScrollTarget> uiEvent = this.scrollTargetEvent;
        int iHashCode15 = (iHashCode14 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Boolean> uiEvent2 = this.showRippleEvent;
        int iHashCode16 = (iHashCode15 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<OptionChainViewState.UpsellHook> uiEvent3 = this.upsellHookEvent;
        int iHashCode17 = (((iHashCode16 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31) + this.watchlistItemStates.hashCode()) * 31;
        OptionChainSelectedMetrics optionChainSelectedMetrics = this.buySelectedMetrics;
        int iHashCode18 = (iHashCode17 + (optionChainSelectedMetrics == null ? 0 : optionChainSelectedMetrics.hashCode())) * 31;
        OptionChainSelectedMetrics optionChainSelectedMetrics2 = this.sellSelectedMetrics;
        return ((((((((((iHashCode18 + (optionChainSelectedMetrics2 != null ? optionChainSelectedMetrics2.hashCode() : 0)) * 31) + this.discoverZeroDteSnackbarState.hashCode()) * 31) + Boolean.hashCode(this.fragmentSelloutSnackbarDismissedOrElapsed)) * 31) + Boolean.hashCode(this.isSelloutSnackbarDismissalExperimentEnabled)) * 31) + Boolean.hashCode(this.inSelloutImprovementExperiment)) * 31) + Boolean.hashCode(this.inSnackbarDismissalFollowUpExperiment);
    }

    public String toString() {
        return "OptionChainListViewState(account=" + this.account + ", currentOrNextMarketDates=" + this.currentOrNextMarketDates + ", equityQuote=" + this.equityQuote + ", defaultPricingType=" + this.defaultPricingType + ", featureSet=" + this.featureSet + ", multilegAvailable=" + this.multilegAvailable + ", initialInstrumentsLoaded=" + this.initialInstrumentsLoaded + ", indexValue=" + this.indexValue + ", uiOptionChain=" + this.uiOptionChain + ", optionChainConfiguration=" + this.optionChainConfiguration + ", optionConfigurationBundle=" + this.optionConfigurationBundle + ", optionInstruments=" + this.optionInstruments + ", optionInstrumentToRollId=" + this.optionInstrumentToRollId + ", optionPositionCount=" + this.optionPositionCount + ", optionQuotes=" + this.optionQuotes + ", selloutTime=" + this.selloutTime + ", tradingOnExpirationState=" + this.tradingOnExpirationState + ", scrollTarget=" + this.scrollTarget + ", pendingScrollTarget=" + this.pendingScrollTarget + ", currentScrollPosition=" + this.currentScrollPosition + ", scrollTargetEvent=" + this.scrollTargetEvent + ", showRippleEvent=" + this.showRippleEvent + ", upsellHookEvent=" + this.upsellHookEvent + ", watchlistItemStates=" + this.watchlistItemStates + ", buySelectedMetrics=" + this.buySelectedMetrics + ", sellSelectedMetrics=" + this.sellSelectedMetrics + ", discoverZeroDteSnackbarState=" + this.discoverZeroDteSnackbarState + ", fragmentSelloutSnackbarDismissedOrElapsed=" + this.fragmentSelloutSnackbarDismissedOrElapsed + ", isSelloutSnackbarDismissalExperimentEnabled=" + this.isSelloutSnackbarDismissalExperimentEnabled + ", inSelloutImprovementExperiment=" + this.inSelloutImprovementExperiment + ", inSnackbarDismissalFollowUpExperiment=" + this.inSnackbarDismissalFollowUpExperiment + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionChainListViewState(Account account, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, Quote quote, OptionSettings.DefaultPricingSetting defaultPricingSetting, Set<? extends OptionChainLaunchMode.Feature> featureSet, boolean z, boolean z2, IndexValue indexValue, UiOptionChain uiOptionChain, OptionChainConfiguration optionChainConfiguration, OptionConfigurationBundle optionConfigurationBundle, List<OptionInstrument> optionInstruments, UUID uuid, Map<UUID, UiOptionPositionCounts> optionPositionCount, Map<UUID, OptionInstrumentQuote> optionQuotes, Instant instant, OptionSettings.TradingOnExpirationState tradingOnExpirationState, ScrollTarget scrollTarget, PendingScrollTarget pendingScrollTarget, ScrollTarget scrollTarget2, UiEvent<ScrollTarget> uiEvent, UiEvent<Boolean> uiEvent2, UiEvent<OptionChainViewState.UpsellHook> uiEvent3, List<? extends OptionWatchlistItemState> watchlistItemStates, OptionChainSelectedMetrics optionChainSelectedMetrics, OptionChainSelectedMetrics optionChainSelectedMetrics2, OptionDiscoverZeroDteSnackbarState discoverZeroDteSnackbarState, boolean z3, boolean z4, boolean z5, boolean z6) {
        ArrayList arrayList;
        OrderSide optionSide;
        Intrinsics.checkNotNullParameter(featureSet, "featureSet");
        Intrinsics.checkNotNullParameter(optionInstruments, "optionInstruments");
        Intrinsics.checkNotNullParameter(optionPositionCount, "optionPositionCount");
        Intrinsics.checkNotNullParameter(optionQuotes, "optionQuotes");
        Intrinsics.checkNotNullParameter(watchlistItemStates, "watchlistItemStates");
        Intrinsics.checkNotNullParameter(discoverZeroDteSnackbarState, "discoverZeroDteSnackbarState");
        this.account = account;
        this.currentOrNextMarketDates = optionCurrentOrNextMarketDates;
        this.equityQuote = quote;
        this.defaultPricingType = defaultPricingSetting;
        this.featureSet = featureSet;
        this.multilegAvailable = z;
        this.initialInstrumentsLoaded = z2;
        this.indexValue = indexValue;
        this.uiOptionChain = uiOptionChain;
        this.optionChainConfiguration = optionChainConfiguration;
        this.optionConfigurationBundle = optionConfigurationBundle;
        this.optionInstruments = optionInstruments;
        this.optionInstrumentToRollId = uuid;
        this.optionPositionCount = optionPositionCount;
        this.optionQuotes = optionQuotes;
        this.selloutTime = instant;
        this.tradingOnExpirationState = tradingOnExpirationState;
        this.scrollTarget = scrollTarget;
        this.pendingScrollTarget = pendingScrollTarget;
        this.currentScrollPosition = scrollTarget2;
        this.scrollTargetEvent = uiEvent;
        this.showRippleEvent = uiEvent2;
        this.upsellHookEvent = uiEvent3;
        this.watchlistItemStates = watchlistItemStates;
        this.buySelectedMetrics = optionChainSelectedMetrics;
        this.sellSelectedMetrics = optionChainSelectedMetrics2;
        this.discoverZeroDteSnackbarState = discoverZeroDteSnackbarState;
        this.fragmentSelloutSnackbarDismissedOrElapsed = z3;
        this.isSelloutSnackbarDismissalExperimentEnabled = z4;
        this.inSelloutImprovementExperiment = z5;
        this.inSnackbarDismissalFollowUpExperiment = z6;
        this.accountIsMargin = account != null ? Boolean.valueOf(account.isMargin()) : null;
        this.watchlistActionsAvailable = featureSet.contains(OptionChainLaunchMode.Feature.WATCHLIST);
        boolean z7 = false;
        if (!z6 && uiOptionChain != null && uiOptionChain.getUnderlyingType() != OptionChain.UnderlyingType.INDEX && instant != null) {
            LocalDate localDate$default = Instants.toLocalDate$default(instant, null, 1, null);
            LocalDate localDateNow = LocalDate.now();
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            boolean z8 = !discoverZeroDteSnackbarState.getMaybeShowing() && (tradingOnExpirationState != null && tradingOnExpirationState.isEnabled()) && ((localDate$default.until(localDateNow, ChronoUnit.DAYS) > 0L ? 1 : (localDate$default.until(localDateNow, ChronoUnit.DAYS) == 0L ? 0 : -1)) == 0) && instant.compareTo(Instant.now()) > 0;
            if (!z4) {
                z7 = z8;
            } else if (z8 && !z3) {
                z7 = true;
            }
        }
        this.shouldShowSelloutSnackbar = z7;
        if (optionConfigurationBundle == null || (optionSide = optionConfigurationBundle.getOptionSide()) == null) {
            arrayList = null;
        } else {
            List<OptionInstrument> list = optionInstruments;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(OptionInstruments3.getOpenPositionStrategyCode((OptionInstrument) it.next(), optionSide));
            }
        }
        this.strategyCodes = arrayList;
        OptionChainConfiguration optionChainConfiguration2 = this.optionChainConfiguration;
        this.adapterState = optionChainConfiguration2 != null ? new OptionChainAdapter.State(this.multilegAvailable, true ^ this.featureSet.contains(OptionChainLaunchMode.Feature.POSITION_CLOSING), optionChainConfiguration2.getSelectedLegs(), this.optionInstrumentToRollId, this.featureSet.contains(OptionChainLaunchMode.Feature.DISCLOSURE), this.buySelectedMetrics, this.sellSelectedMetrics) : null;
        this.underlyingQuote = UnderlyingQuote.INSTANCE.getUnderlyingQuote(this.equityQuote, this.indexValue);
    }

    public final Account getAccount() {
        return this.account;
    }

    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    public final Quote getEquityQuote() {
        return this.equityQuote;
    }

    public final OptionSettings.DefaultPricingSetting getDefaultPricingType() {
        return this.defaultPricingType;
    }

    public /* synthetic */ OptionChainListViewState(Account account, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, Quote quote, OptionSettings.DefaultPricingSetting defaultPricingSetting, Set set, boolean z, boolean z2, IndexValue indexValue, UiOptionChain uiOptionChain, OptionChainConfiguration optionChainConfiguration, OptionConfigurationBundle optionConfigurationBundle, List list, UUID uuid, Map map, Map map2, Instant instant, OptionSettings.TradingOnExpirationState tradingOnExpirationState, ScrollTarget scrollTarget, PendingScrollTarget pendingScrollTarget, ScrollTarget scrollTarget2, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, List list2, OptionChainSelectedMetrics optionChainSelectedMetrics, OptionChainSelectedMetrics optionChainSelectedMetrics2, OptionDiscoverZeroDteSnackbarState optionDiscoverZeroDteSnackbarState, boolean z3, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Account account2;
        ScrollTarget underlyingQuote;
        PendingScrollTarget pendingScrollTarget2;
        Map map3;
        boolean z7;
        UiEvent uiEvent4;
        Account account3 = (i & 1) != 0 ? null : account;
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates2 = (i & 2) != 0 ? null : optionCurrentOrNextMarketDates;
        Quote quote2 = (i & 4) != 0 ? null : quote;
        OptionSettings.DefaultPricingSetting defaultPricingSetting2 = (i & 8) != 0 ? null : defaultPricingSetting;
        Set setEmptySet = (i & 16) != 0 ? SetsKt.emptySet() : set;
        boolean z8 = (i & 32) != 0 ? false : z;
        boolean z9 = (i & 64) != 0 ? false : z2;
        IndexValue indexValue2 = (i & 128) != 0 ? null : indexValue;
        UiOptionChain uiOptionChain2 = (i & 256) != 0 ? null : uiOptionChain;
        OptionChainConfiguration optionChainConfiguration2 = (i & 512) != 0 ? null : optionChainConfiguration;
        OptionConfigurationBundle optionConfigurationBundle2 = (i & 1024) != 0 ? null : optionConfigurationBundle;
        List listEmptyList = (i & 2048) != 0 ? CollectionsKt.emptyList() : list;
        UUID uuid2 = (i & 4096) != 0 ? null : uuid;
        Map mapEmptyMap = (i & 8192) != 0 ? MapsKt.emptyMap() : map;
        Map mapEmptyMap2 = (i & 16384) != 0 ? MapsKt.emptyMap() : map2;
        Instant instant2 = (i & 32768) != 0 ? null : instant;
        OptionSettings.TradingOnExpirationState tradingOnExpirationState2 = (i & 65536) != 0 ? null : tradingOnExpirationState;
        if ((i & 131072) != 0) {
            account2 = account3;
            underlyingQuote = new ScrollTarget.UnderlyingQuote(false);
        } else {
            account2 = account3;
            underlyingQuote = scrollTarget;
        }
        PendingScrollTarget pendingScrollTarget3 = (i & 262144) != 0 ? null : pendingScrollTarget;
        ScrollTarget scrollTarget3 = (i & 524288) != 0 ? null : scrollTarget2;
        ScrollTarget scrollTarget4 = underlyingQuote;
        if ((i & 1048576) != 0) {
            pendingScrollTarget2 = pendingScrollTarget3;
            map3 = mapEmptyMap;
            z7 = false;
            uiEvent4 = new UiEvent(new ScrollTarget.UnderlyingQuote(false));
        } else {
            pendingScrollTarget2 = pendingScrollTarget3;
            map3 = mapEmptyMap;
            z7 = false;
            uiEvent4 = uiEvent;
        }
        this(account2, optionCurrentOrNextMarketDates2, quote2, defaultPricingSetting2, setEmptySet, z8, z9, indexValue2, uiOptionChain2, optionChainConfiguration2, optionConfigurationBundle2, listEmptyList, uuid2, map3, mapEmptyMap2, instant2, tradingOnExpirationState2, scrollTarget4, pendingScrollTarget2, scrollTarget3, uiEvent4, (i & 2097152) != 0 ? null : uiEvent2, (i & 4194304) != 0 ? null : uiEvent3, (i & 8388608) != 0 ? CollectionsKt.emptyList() : list2, (i & 16777216) != 0 ? null : optionChainSelectedMetrics, (i & 33554432) != 0 ? null : optionChainSelectedMetrics2, (i & 67108864) != 0 ? OptionDiscoverZeroDteSnackbarState.DISMISSED : optionDiscoverZeroDteSnackbarState, (i & 134217728) != 0 ? z7 : z3, (i & 268435456) != 0 ? z7 : z4, (i & 536870912) != 0 ? z7 : z5, (i & 1073741824) != 0 ? z7 : z6);
    }

    public final Set<OptionChainLaunchMode.Feature> getFeatureSet() {
        return this.featureSet;
    }

    public final boolean getMultilegAvailable() {
        return this.multilegAvailable;
    }

    public final boolean getInitialInstrumentsLoaded() {
        return this.initialInstrumentsLoaded;
    }

    public final IndexValue getIndexValue() {
        return this.indexValue;
    }

    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    public final OptionChainConfiguration getOptionChainConfiguration() {
        return this.optionChainConfiguration;
    }

    public final OptionConfigurationBundle getOptionConfigurationBundle() {
        return this.optionConfigurationBundle;
    }

    public final List<OptionInstrument> getOptionInstruments() {
        return this.optionInstruments;
    }

    public final UUID getOptionInstrumentToRollId() {
        return this.optionInstrumentToRollId;
    }

    public final Map<UUID, UiOptionPositionCounts> getOptionPositionCount() {
        return this.optionPositionCount;
    }

    public final Map<UUID, OptionInstrumentQuote> getOptionQuotes() {
        return this.optionQuotes;
    }

    public final Instant getSelloutTime() {
        return this.selloutTime;
    }

    public final OptionSettings.TradingOnExpirationState getTradingOnExpirationState() {
        return this.tradingOnExpirationState;
    }

    public final ScrollTarget getScrollTarget() {
        return this.scrollTarget;
    }

    public final PendingScrollTarget getPendingScrollTarget() {
        return this.pendingScrollTarget;
    }

    public final ScrollTarget getCurrentScrollPosition() {
        return this.currentScrollPosition;
    }

    public final UiEvent<ScrollTarget> getScrollTargetEvent() {
        return this.scrollTargetEvent;
    }

    public final UiEvent<Boolean> getShowRippleEvent() {
        return this.showRippleEvent;
    }

    public final UiEvent<OptionChainViewState.UpsellHook> getUpsellHookEvent() {
        return this.upsellHookEvent;
    }

    public final List<OptionWatchlistItemState> getWatchlistItemStates() {
        return this.watchlistItemStates;
    }

    public final OptionChainSelectedMetrics getBuySelectedMetrics() {
        return this.buySelectedMetrics;
    }

    public final OptionChainSelectedMetrics getSellSelectedMetrics() {
        return this.sellSelectedMetrics;
    }

    public final OptionDiscoverZeroDteSnackbarState getDiscoverZeroDteSnackbarState() {
        return this.discoverZeroDteSnackbarState;
    }

    public final boolean getFragmentSelloutSnackbarDismissedOrElapsed() {
        return this.fragmentSelloutSnackbarDismissedOrElapsed;
    }

    public final boolean isSelloutSnackbarDismissalExperimentEnabled() {
        return this.isSelloutSnackbarDismissalExperimentEnabled;
    }

    public final boolean getInSelloutImprovementExperiment() {
        return this.inSelloutImprovementExperiment;
    }

    public final boolean getInSnackbarDismissalFollowUpExperiment() {
        return this.inSnackbarDismissalFollowUpExperiment;
    }

    public final Boolean getAccountIsMargin() {
        return this.accountIsMargin;
    }

    public final boolean getWatchlistActionsAvailable() {
        return this.watchlistActionsAvailable;
    }

    public final boolean getShouldShowSelloutSnackbar() {
        return this.shouldShowSelloutSnackbar;
    }

    public final List<String> getStrategyCodes() {
        return this.strategyCodes;
    }

    public final OptionChainAdapter.State getAdapterState() {
        return this.adapterState;
    }

    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    /* compiled from: OptionChainListViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;", "", "smoothScroll", "", "<init>", "(Z)V", "getSmoothScroll", "()Z", "UnderlyingQuote", "InstrumentId", "StrikePrice", "PositionWithOffset", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget$InstrumentId;", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget$PositionWithOffset;", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget$StrikePrice;", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget$UnderlyingQuote;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ScrollTarget {
        public static final int $stable = 0;
        private final boolean smoothScroll;

        public /* synthetic */ ScrollTarget(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        private ScrollTarget(boolean z) {
            this.smoothScroll = z;
        }

        public /* synthetic */ ScrollTarget(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, null);
        }

        public boolean getSmoothScroll() {
            return this.smoothScroll;
        }

        /* compiled from: OptionChainListViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget$UnderlyingQuote;", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;", "smoothScroll", "", "<init>", "(Z)V", "getSmoothScroll", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UnderlyingQuote extends ScrollTarget {
            public static final int $stable = 0;
            private final boolean smoothScroll;

            public UnderlyingQuote() {
                this(false, 1, null);
            }

            public static /* synthetic */ UnderlyingQuote copy$default(UnderlyingQuote underlyingQuote, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = underlyingQuote.smoothScroll;
                }
                return underlyingQuote.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getSmoothScroll() {
                return this.smoothScroll;
            }

            public final UnderlyingQuote copy(boolean smoothScroll) {
                return new UnderlyingQuote(smoothScroll);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnderlyingQuote) && this.smoothScroll == ((UnderlyingQuote) other).smoothScroll;
            }

            public int hashCode() {
                return Boolean.hashCode(this.smoothScroll);
            }

            public String toString() {
                return "UnderlyingQuote(smoothScroll=" + this.smoothScroll + ")";
            }

            public UnderlyingQuote(boolean z) {
                super(z, null);
                this.smoothScroll = z;
            }

            public /* synthetic */ UnderlyingQuote(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z);
            }

            @Override // com.robinhood.android.optionschain.OptionChainListViewState.ScrollTarget
            public boolean getSmoothScroll() {
                return this.smoothScroll;
            }
        }

        /* compiled from: OptionChainListViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget$InstrumentId;", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;", "optionInstrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getOptionInstrumentId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InstrumentId extends ScrollTarget {
            public static final int $stable = 8;
            private final UUID optionInstrumentId;

            public static /* synthetic */ InstrumentId copy$default(InstrumentId instrumentId, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = instrumentId.optionInstrumentId;
                }
                return instrumentId.copy(uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getOptionInstrumentId() {
                return this.optionInstrumentId;
            }

            public final InstrumentId copy(UUID optionInstrumentId) {
                Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
                return new InstrumentId(optionInstrumentId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InstrumentId) && Intrinsics.areEqual(this.optionInstrumentId, ((InstrumentId) other).optionInstrumentId);
            }

            public int hashCode() {
                return this.optionInstrumentId.hashCode();
            }

            public String toString() {
                return "InstrumentId(optionInstrumentId=" + this.optionInstrumentId + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InstrumentId(UUID optionInstrumentId) {
                super(false, 1, null);
                Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
                this.optionInstrumentId = optionInstrumentId;
            }

            public final UUID getOptionInstrumentId() {
                return this.optionInstrumentId;
            }
        }

        /* compiled from: OptionChainListViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget$StrikePrice;", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;", "strikePrice", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getStrikePrice", "()Ljava/math/BigDecimal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class StrikePrice extends ScrollTarget {
            public static final int $stable = 8;
            private final BigDecimal strikePrice;

            public static /* synthetic */ StrikePrice copy$default(StrikePrice strikePrice, BigDecimal bigDecimal, int i, Object obj) {
                if ((i & 1) != 0) {
                    bigDecimal = strikePrice.strikePrice;
                }
                return strikePrice.copy(bigDecimal);
            }

            /* renamed from: component1, reason: from getter */
            public final BigDecimal getStrikePrice() {
                return this.strikePrice;
            }

            public final StrikePrice copy(BigDecimal strikePrice) {
                Intrinsics.checkNotNullParameter(strikePrice, "strikePrice");
                return new StrikePrice(strikePrice);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StrikePrice) && Intrinsics.areEqual(this.strikePrice, ((StrikePrice) other).strikePrice);
            }

            public int hashCode() {
                return this.strikePrice.hashCode();
            }

            public String toString() {
                return "StrikePrice(strikePrice=" + this.strikePrice + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StrikePrice(BigDecimal strikePrice) {
                super(false, 1, null);
                Intrinsics.checkNotNullParameter(strikePrice, "strikePrice");
                this.strikePrice = strikePrice;
            }

            public final BigDecimal getStrikePrice() {
                return this.strikePrice;
            }
        }

        /* compiled from: OptionChainListViewState.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0004J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget$PositionWithOffset;", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;", "Landroid/os/Parcelable;", "firstVisiblePosition", "", "scrollOffset", "smoothScroll", "", "<init>", "(IIZ)V", "getFirstVisiblePosition", "()I", "getScrollOffset", "getSmoothScroll", "()Z", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PositionWithOffset extends ScrollTarget implements Parcelable {
            public static final int $stable = 0;
            public static final Parcelable.Creator<PositionWithOffset> CREATOR = new Creator();
            private final int firstVisiblePosition;
            private final int scrollOffset;
            private final boolean smoothScroll;

            /* compiled from: OptionChainListViewState.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<PositionWithOffset> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PositionWithOffset createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PositionWithOffset(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PositionWithOffset[] newArray(int i) {
                    return new PositionWithOffset[i];
                }
            }

            public static /* synthetic */ PositionWithOffset copy$default(PositionWithOffset positionWithOffset, int i, int i2, boolean z, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = positionWithOffset.firstVisiblePosition;
                }
                if ((i3 & 2) != 0) {
                    i2 = positionWithOffset.scrollOffset;
                }
                if ((i3 & 4) != 0) {
                    z = positionWithOffset.smoothScroll;
                }
                return positionWithOffset.copy(i, i2, z);
            }

            /* renamed from: component1, reason: from getter */
            public final int getFirstVisiblePosition() {
                return this.firstVisiblePosition;
            }

            /* renamed from: component2, reason: from getter */
            public final int getScrollOffset() {
                return this.scrollOffset;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getSmoothScroll() {
                return this.smoothScroll;
            }

            public final PositionWithOffset copy(int firstVisiblePosition, int scrollOffset, boolean smoothScroll) {
                return new PositionWithOffset(firstVisiblePosition, scrollOffset, smoothScroll);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PositionWithOffset)) {
                    return false;
                }
                PositionWithOffset positionWithOffset = (PositionWithOffset) other;
                return this.firstVisiblePosition == positionWithOffset.firstVisiblePosition && this.scrollOffset == positionWithOffset.scrollOffset && this.smoothScroll == positionWithOffset.smoothScroll;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.firstVisiblePosition) * 31) + Integer.hashCode(this.scrollOffset)) * 31) + Boolean.hashCode(this.smoothScroll);
            }

            public String toString() {
                return "PositionWithOffset(firstVisiblePosition=" + this.firstVisiblePosition + ", scrollOffset=" + this.scrollOffset + ", smoothScroll=" + this.smoothScroll + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.firstVisiblePosition);
                dest.writeInt(this.scrollOffset);
                dest.writeInt(this.smoothScroll ? 1 : 0);
            }

            public /* synthetic */ PositionWithOffset(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, i2, (i3 & 4) != 0 ? true : z);
            }

            public final int getFirstVisiblePosition() {
                return this.firstVisiblePosition;
            }

            public final int getScrollOffset() {
                return this.scrollOffset;
            }

            @Override // com.robinhood.android.optionschain.OptionChainListViewState.ScrollTarget
            public boolean getSmoothScroll() {
                return this.smoothScroll;
            }

            public PositionWithOffset(int i, int i2, boolean z) {
                super(z, null);
                this.firstVisiblePosition = i;
                this.scrollOffset = i2;
                this.smoothScroll = z;
            }
        }
    }

    /* compiled from: OptionChainListViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainListViewState$PendingScrollTarget;", "", "target", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;", "expectedNumInstruments", "", "<init>", "(Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;Ljava/lang/Integer;)V", "getTarget", "()Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;", "getExpectedNumInstruments", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;Ljava/lang/Integer;)Lcom/robinhood/android/optionschain/OptionChainListViewState$PendingScrollTarget;", "equals", "", "other", "hashCode", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PendingScrollTarget {
        public static final int $stable = 0;
        private final Integer expectedNumInstruments;
        private final ScrollTarget target;

        public static /* synthetic */ PendingScrollTarget copy$default(PendingScrollTarget pendingScrollTarget, ScrollTarget scrollTarget, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                scrollTarget = pendingScrollTarget.target;
            }
            if ((i & 2) != 0) {
                num = pendingScrollTarget.expectedNumInstruments;
            }
            return pendingScrollTarget.copy(scrollTarget, num);
        }

        /* renamed from: component1, reason: from getter */
        public final ScrollTarget getTarget() {
            return this.target;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getExpectedNumInstruments() {
            return this.expectedNumInstruments;
        }

        public final PendingScrollTarget copy(ScrollTarget target, Integer expectedNumInstruments) {
            Intrinsics.checkNotNullParameter(target, "target");
            return new PendingScrollTarget(target, expectedNumInstruments);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingScrollTarget)) {
                return false;
            }
            PendingScrollTarget pendingScrollTarget = (PendingScrollTarget) other;
            return Intrinsics.areEqual(this.target, pendingScrollTarget.target) && Intrinsics.areEqual(this.expectedNumInstruments, pendingScrollTarget.expectedNumInstruments);
        }

        public int hashCode() {
            int iHashCode = this.target.hashCode() * 31;
            Integer num = this.expectedNumInstruments;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "PendingScrollTarget(target=" + this.target + ", expectedNumInstruments=" + this.expectedNumInstruments + ")";
        }

        public PendingScrollTarget(ScrollTarget target, Integer num) {
            Intrinsics.checkNotNullParameter(target, "target");
            this.target = target;
            this.expectedNumInstruments = num;
        }

        public /* synthetic */ PendingScrollTarget(ScrollTarget scrollTarget, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(scrollTarget, (i & 2) != 0 ? null : num);
        }

        public final Integer getExpectedNumInstruments() {
            return this.expectedNumInstruments;
        }

        public final ScrollTarget getTarget() {
            return this.target;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OptionChainListViewState mutateWithScrollTarget(ScrollTarget newTarget) {
        Intrinsics.checkNotNullParameter(newTarget, "newTarget");
        return copy$default(this, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, newTarget, new PendingScrollTarget(newTarget, null, 2, 0 == true ? 1 : 0), null, new UiEvent(newTarget), new UiEvent(Boolean.TRUE), null, null, null, null, null, false, false, false, false, 2143944703, null);
    }
}
