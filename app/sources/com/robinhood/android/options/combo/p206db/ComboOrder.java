package com.robinhood.android.options.combo.p206db;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.models.p320db.StaleConfig;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.money.Currencies;
import com.squareup.moshi.JsonClass;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: ComboOrder.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b9\n\u0002\u0010\u0000\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ¶\u00012\u00020\u00012\u00020\u0002:\u0002¶\u0001BÃ\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0006\u0010!\u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010$\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010+\u001a\u00020\u0010\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010-\u001a\u00020\u0014\u0012\u0006\u0010.\u001a\u00020\u0007\u0012\u0006\u0010/\u001a\u00020\u0014\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00102\u001a\u00020\u0003\u0012\u0006\u00103\u001a\u00020\u0005¢\u0006\u0004\b4\u00105J\u001d\u0010;\u001a\u00020:2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u000208¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bE\u0010BJ\u0010\u0010F\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bF\u0010DJ\u0010\u0010G\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bG\u0010@J\u0010\u0010H\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bH\u0010BJ\u0012\u0010I\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bK\u0010DJ\u0010\u0010L\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bR\u0010DJ\u0010\u0010S\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bU\u0010DJ\u0010\u0010V\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bV\u0010QJ\u0012\u0010W\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bW\u0010JJ\u0010\u0010X\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bX\u0010DJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bY\u0010DJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bZ\u0010DJ\u0010\u0010[\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b[\u0010DJ\u0010\u0010\\\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\\\u0010DJ\u0010\u0010]\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b]\u0010DJ\u0010\u0010^\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b^\u0010DJ\u0012\u0010_\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b_\u0010DJ\u0012\u0010`\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b`\u0010JJ\u0010\u0010a\u001a\u00020%HÆ\u0003¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020'HÆ\u0003¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u00020)HÆ\u0003¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bg\u0010MJ\u0012\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bh\u0010@J\u0010\u0010i\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bi\u0010QJ\u0010\u0010j\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bj\u0010DJ\u0010\u0010k\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bk\u0010QJ\u0010\u0010l\u001a\u000200HÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0010\u0010n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bn\u0010@J\u0010\u0010o\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bo\u0010BJ\u0096\u0003\u0010p\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00142\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\u00102\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010-\u001a\u00020\u00142\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u00142\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\bp\u0010qJ\u0010\u0010r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\br\u0010BJ\u0010\u0010s\u001a\u000208HÖ\u0001¢\u0006\u0004\bs\u0010>J\u001a\u0010v\u001a\u00020\u00172\b\u0010u\u001a\u0004\u0018\u00010tHÖ\u0003¢\u0006\u0004\bv\u0010wR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010x\u001a\u0004\by\u0010@R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010z\u001a\u0004\b{\u0010BR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010|\u001a\u0004\b}\u0010DR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010z\u001a\u0004\b~\u0010BR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010|\u001a\u0004\b\u007f\u0010DR\u0018\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\r\n\u0004\b\u000b\u0010x\u001a\u0005\b\u0080\u0001\u0010@R\u0018\u0010\f\u001a\u00020\u00058\u0006¢\u0006\r\n\u0004\b\f\u0010z\u001a\u0005\b\u0081\u0001\u0010BR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010JR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0004\b\u000f\u0010|\u001a\u0005\b\u0084\u0001\u0010DR\u0019\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010MR\u0019\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010OR\u0019\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010QR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0004\b\u0016\u0010|\u001a\u0005\b\u008b\u0001\u0010DR\u0018\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\r\n\u0005\b\u0018\u0010\u008c\u0001\u001a\u0004\b\u0018\u0010TR\u0018\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\b\u0019\u0010|\u001a\u0005\b\u008d\u0001\u0010DR\u0019\u0010\u001a\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010\u0089\u0001\u001a\u0005\b\u008e\u0001\u0010QR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010\u0082\u0001\u001a\u0005\b\u008f\u0001\u0010JR\u0018\u0010\u001c\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\b\u001c\u0010|\u001a\u0005\b\u0090\u0001\u0010DR\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0004\b\u001d\u0010|\u001a\u0005\b\u0091\u0001\u0010DR\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0004\b\u001e\u0010|\u001a\u0005\b\u0092\u0001\u0010DR\u0018\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\b\u001f\u0010|\u001a\u0005\b\u0093\u0001\u0010DR\u0018\u0010 \u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\b \u0010|\u001a\u0005\b\u0094\u0001\u0010DR\u0018\u0010!\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\b!\u0010|\u001a\u0005\b\u0095\u0001\u0010DR\u0018\u0010\"\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\b\"\u0010|\u001a\u0005\b\u0096\u0001\u0010DR\u001a\u0010#\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0004\b#\u0010|\u001a\u0005\b\u0097\u0001\u0010DR\u001b\u0010$\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b$\u0010\u0082\u0001\u001a\u0005\b\u0098\u0001\u0010JR\u0019\u0010&\u001a\u00020%8\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u0010bR\u0019\u0010(\u001a\u00020'8\u0006¢\u0006\u000e\n\u0005\b(\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010dR\u0019\u0010*\u001a\u00020)8\u0006¢\u0006\u000e\n\u0005\b*\u0010\u009d\u0001\u001a\u0005\b\u009e\u0001\u0010fR\u0019\u0010+\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b+\u0010\u0085\u0001\u001a\u0005\b\u009f\u0001\u0010MR\u001a\u0010,\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\r\n\u0004\b,\u0010x\u001a\u0005\b \u0001\u0010@R\u0019\u0010-\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\b-\u0010\u0089\u0001\u001a\u0005\b¡\u0001\u0010QR\u0018\u0010.\u001a\u00020\u00078\u0006¢\u0006\r\n\u0004\b.\u0010|\u001a\u0005\b¢\u0001\u0010DR\u0019\u0010/\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\b/\u0010\u0089\u0001\u001a\u0005\b£\u0001\u0010QR\u0019\u00101\u001a\u0002008\u0006¢\u0006\u000e\n\u0005\b1\u0010¤\u0001\u001a\u0005\b¥\u0001\u0010mR\u0018\u00102\u001a\u00020\u00038\u0006¢\u0006\r\n\u0004\b2\u0010x\u001a\u0005\b¦\u0001\u0010@R\u0018\u00103\u001a\u00020\u00058\u0006¢\u0006\r\n\u0004\b3\u0010z\u001a\u0005\b§\u0001\u0010BR\u001a\u0010«\u0001\u001a\u0005\u0018\u00010¨\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0016\u0010\u00ad\u0001\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010MR\u0018\u0010±\u0001\u001a\u00030®\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010µ\u0001\u001a\u00030²\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001¨\u0006·\u0001"}, m3636d2 = {"Lcom/robinhood/android/options/combo/db/ComboOrder;", "Landroid/os/Parcelable;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Ljava/util/UUID;", "id", "", "accountNumber", "Ljava/math/BigDecimal;", "averageNetPremiumPaid", "cancelUrl", "canceledQuantity", "chainId", "chainSymbol", "Lcom/robinhood/models/api/OptionStrategyType;", "closingStrategy", "contractFees", "j$/time/Instant", "createdAt", "Lcom/robinhood/shared/models/history/shared/OrderState;", "derivedState", "Lcom/robinhood/models/db/OrderDirection;", "direction", "goldSavings", "", "isReplaceable", "netAmount", "netAmountDirection", "openingStrategy", "pendingQuantity", "premium", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "processedPremium", "processedQuantity", "quantity", "regulatoryFees", "stopPrice", "strategy", "Lcom/robinhood/models/db/OrderTimeInForce;", "timeInForce", "Lcom/robinhood/models/db/OrderTrigger;", "trigger", "Lcom/robinhood/models/db/OrderType;", "type", "updatedAt", "refId", "processedPremiumDirection", "estimatedTotalNetAmount", "estimatedTotalNetAmountDirection", "Lcom/robinhood/models/db/OptionOrder$FormSource;", "formSource", "equityInstrumentId", "underlyingSymbol", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/api/OptionStrategyType;Ljava/math/BigDecimal;Lj$/time/Instant;Lcom/robinhood/shared/models/history/shared/OrderState;Lcom/robinhood/models/db/OrderDirection;Ljava/math/BigDecimal;ZLjava/math/BigDecimal;Lcom/robinhood/models/db/OrderDirection;Lcom/robinhood/models/api/OptionStrategyType;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/api/OptionStrategyType;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderTrigger;Lcom/robinhood/models/db/OrderType;Lj$/time/Instant;Ljava/util/UUID;Lcom/robinhood/models/db/OrderDirection;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderDirection;Lcom/robinhood/models/db/OptionOrder$FormSource;Ljava/util/UUID;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/math/BigDecimal;", "component4", "component5", "component6", "component7", "component8", "()Lcom/robinhood/models/api/OptionStrategyType;", "component9", "component10", "()Lj$/time/Instant;", "component11", "()Lcom/robinhood/shared/models/history/shared/OrderState;", "component12", "()Lcom/robinhood/models/db/OrderDirection;", "component13", "component14", "()Z", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "()Lcom/robinhood/models/db/OrderTimeInForce;", "component28", "()Lcom/robinhood/models/db/OrderTrigger;", "component29", "()Lcom/robinhood/models/db/OrderType;", "component30", "component31", "component32", "component33", "component34", "component35", "()Lcom/robinhood/models/db/OptionOrder$FormSource;", "component36", "component37", "copy", "(Ljava/util/UUID;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/api/OptionStrategyType;Ljava/math/BigDecimal;Lj$/time/Instant;Lcom/robinhood/shared/models/history/shared/OrderState;Lcom/robinhood/models/db/OrderDirection;Ljava/math/BigDecimal;ZLjava/math/BigDecimal;Lcom/robinhood/models/db/OrderDirection;Lcom/robinhood/models/api/OptionStrategyType;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/api/OptionStrategyType;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderTrigger;Lcom/robinhood/models/db/OrderType;Lj$/time/Instant;Ljava/util/UUID;Lcom/robinhood/models/db/OrderDirection;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderDirection;Lcom/robinhood/models/db/OptionOrder$FormSource;Ljava/util/UUID;Ljava/lang/String;)Lcom/robinhood/android/options/combo/db/ComboOrder;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "Ljava/lang/String;", "getAccountNumber", "Ljava/math/BigDecimal;", "getAverageNetPremiumPaid", "getCancelUrl", "getCanceledQuantity", "getChainId", "getChainSymbol", "Lcom/robinhood/models/api/OptionStrategyType;", "getClosingStrategy", "getContractFees", "Lj$/time/Instant;", "getCreatedAt", "Lcom/robinhood/shared/models/history/shared/OrderState;", "getDerivedState", "Lcom/robinhood/models/db/OrderDirection;", "getDirection", "getGoldSavings", "Z", "getNetAmount", "getNetAmountDirection", "getOpeningStrategy", "getPendingQuantity", "getPremium", "getPrice", "getProcessedPremium", "getProcessedQuantity", "getQuantity", "getRegulatoryFees", "getStopPrice", "getStrategy", "Lcom/robinhood/models/db/OrderTimeInForce;", "getTimeInForce", "Lcom/robinhood/models/db/OrderTrigger;", "getTrigger", "Lcom/robinhood/models/db/OrderType;", "getType", "getUpdatedAt", "getRefId", "getProcessedPremiumDirection", "getEstimatedTotalNetAmount", "getEstimatedTotalNetAmountDirection", "Lcom/robinhood/models/db/OptionOrder$FormSource;", "getFormSource", "getEquityInstrumentId", "getUnderlyingSymbol", "Lcom/robinhood/models/util/Money$Adjustment;", "getAdjustment", "()Lcom/robinhood/models/util/Money$Adjustment;", "adjustment", "getInitiatedAt", "initiatedAt", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "getHistoryState", "()Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "historyState", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "getTransactionReference", "()Lcom/robinhood/shared/models/history/shared/TransactionReference;", "transactionReference", "Companion", "lib-models-combo-orders_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class ComboOrder implements Parcelable, HistoryEvent {
    private final String accountNumber;
    private final BigDecimal averageNetPremiumPaid;
    private final String cancelUrl;
    private final BigDecimal canceledQuantity;
    private final UUID chainId;
    private final String chainSymbol;
    private final OptionStrategyType closingStrategy;
    private final BigDecimal contractFees;
    private final Instant createdAt;
    private final OrderState derivedState;
    private final OrderDirection direction;
    private final UUID equityInstrumentId;
    private final BigDecimal estimatedTotalNetAmount;
    private final OrderDirection estimatedTotalNetAmountDirection;
    private final OptionOrder.FormSource formSource;
    private final BigDecimal goldSavings;
    private final UUID id;
    private final boolean isReplaceable;
    private final BigDecimal netAmount;
    private final OrderDirection netAmountDirection;
    private final OptionStrategyType openingStrategy;
    private final BigDecimal pendingQuantity;
    private final BigDecimal premium;
    private final BigDecimal price;
    private final BigDecimal processedPremium;
    private final OrderDirection processedPremiumDirection;
    private final BigDecimal processedQuantity;
    private final BigDecimal quantity;
    private final UUID refId;
    private final BigDecimal regulatoryFees;
    private final BigDecimal stopPrice;
    private final OptionStrategyType strategy;
    private final OrderTimeInForce timeInForce;
    private final OrderTrigger trigger;
    private final OrderType type;
    private final String underlyingSymbol;
    private final Instant updatedAt;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ComboOrder> CREATOR = new Creator();

    /* compiled from: ComboOrder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ComboOrder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ComboOrder createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ComboOrder((UUID) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : OptionStrategyType.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), (Instant) parcel.readSerializable(), OrderState.valueOf(parcel.readString()), OrderDirection.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, (BigDecimal) parcel.readSerializable(), OrderDirection.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : OptionStrategyType.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? OptionStrategyType.valueOf(parcel.readString()) : null, (OrderTimeInForce) parcel.readParcelable(ComboOrder.class.getClassLoader()), OrderTrigger.valueOf(parcel.readString()), OrderType.valueOf(parcel.readString()), (Instant) parcel.readSerializable(), (UUID) parcel.readSerializable(), OrderDirection.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), OrderDirection.valueOf(parcel.readString()), OptionOrder.FormSource.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ComboOrder[] newArray(int i) {
            return new ComboOrder[i];
        }
    }

    /* compiled from: ComboOrder.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderDirection.values().length];
            try {
                iArr[OrderDirection.CREDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderDirection.DEBIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ ComboOrder copy$default(ComboOrder comboOrder, UUID uuid, String str, BigDecimal bigDecimal, String str2, BigDecimal bigDecimal2, UUID uuid2, String str3, OptionStrategyType optionStrategyType, BigDecimal bigDecimal3, Instant instant, OrderState orderState, OrderDirection orderDirection, BigDecimal bigDecimal4, boolean z, BigDecimal bigDecimal5, OrderDirection orderDirection2, OptionStrategyType optionStrategyType2, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, OptionStrategyType optionStrategyType3, OrderTimeInForce orderTimeInForce, OrderTrigger orderTrigger, OrderType orderType, Instant instant2, UUID uuid3, OrderDirection orderDirection3, BigDecimal bigDecimal14, OrderDirection orderDirection4, OptionOrder.FormSource formSource, UUID uuid4, String str4, int i, int i2, Object obj) {
        String str5;
        UUID uuid5;
        BigDecimal bigDecimal15;
        BigDecimal bigDecimal16;
        BigDecimal bigDecimal17;
        BigDecimal bigDecimal18;
        BigDecimal bigDecimal19;
        OptionStrategyType optionStrategyType4;
        OrderTimeInForce orderTimeInForce2;
        OrderTrigger orderTrigger2;
        OrderType orderType2;
        Instant instant3;
        UUID uuid6;
        OrderDirection orderDirection5;
        BigDecimal bigDecimal20;
        OrderDirection orderDirection6;
        OptionOrder.FormSource formSource2;
        BigDecimal bigDecimal21;
        UUID uuid7;
        String str6;
        OptionStrategyType optionStrategyType5;
        BigDecimal bigDecimal22;
        Instant instant4;
        OrderState orderState2;
        OrderDirection orderDirection7;
        BigDecimal bigDecimal23;
        boolean z2;
        OrderDirection orderDirection8;
        OptionStrategyType optionStrategyType6;
        BigDecimal bigDecimal24;
        BigDecimal bigDecimal25;
        BigDecimal bigDecimal26;
        String str7;
        BigDecimal bigDecimal27;
        String str8;
        BigDecimal bigDecimal28;
        UUID uuid8 = (i & 1) != 0 ? comboOrder.id : uuid;
        String str9 = (i & 2) != 0 ? comboOrder.accountNumber : str;
        BigDecimal bigDecimal29 = (i & 4) != 0 ? comboOrder.averageNetPremiumPaid : bigDecimal;
        String str10 = (i & 8) != 0 ? comboOrder.cancelUrl : str2;
        BigDecimal bigDecimal30 = (i & 16) != 0 ? comboOrder.canceledQuantity : bigDecimal2;
        UUID uuid9 = (i & 32) != 0 ? comboOrder.chainId : uuid2;
        String str11 = (i & 64) != 0 ? comboOrder.chainSymbol : str3;
        OptionStrategyType optionStrategyType7 = (i & 128) != 0 ? comboOrder.closingStrategy : optionStrategyType;
        BigDecimal bigDecimal31 = (i & 256) != 0 ? comboOrder.contractFees : bigDecimal3;
        Instant instant5 = (i & 512) != 0 ? comboOrder.createdAt : instant;
        OrderState orderState3 = (i & 1024) != 0 ? comboOrder.derivedState : orderState;
        OrderDirection orderDirection9 = (i & 2048) != 0 ? comboOrder.direction : orderDirection;
        BigDecimal bigDecimal32 = (i & 4096) != 0 ? comboOrder.goldSavings : bigDecimal4;
        boolean z3 = (i & 8192) != 0 ? comboOrder.isReplaceable : z;
        UUID uuid10 = uuid8;
        BigDecimal bigDecimal33 = (i & 16384) != 0 ? comboOrder.netAmount : bigDecimal5;
        OrderDirection orderDirection10 = (i & 32768) != 0 ? comboOrder.netAmountDirection : orderDirection2;
        OptionStrategyType optionStrategyType8 = (i & 65536) != 0 ? comboOrder.openingStrategy : optionStrategyType2;
        BigDecimal bigDecimal34 = (i & 131072) != 0 ? comboOrder.pendingQuantity : bigDecimal6;
        BigDecimal bigDecimal35 = (i & 262144) != 0 ? comboOrder.premium : bigDecimal7;
        BigDecimal bigDecimal36 = (i & 524288) != 0 ? comboOrder.price : bigDecimal8;
        BigDecimal bigDecimal37 = (i & 1048576) != 0 ? comboOrder.processedPremium : bigDecimal9;
        BigDecimal bigDecimal38 = (i & 2097152) != 0 ? comboOrder.processedQuantity : bigDecimal10;
        BigDecimal bigDecimal39 = (i & 4194304) != 0 ? comboOrder.quantity : bigDecimal11;
        BigDecimal bigDecimal40 = (i & 8388608) != 0 ? comboOrder.regulatoryFees : bigDecimal12;
        BigDecimal bigDecimal41 = (i & 16777216) != 0 ? comboOrder.stopPrice : bigDecimal13;
        OptionStrategyType optionStrategyType9 = (i & 33554432) != 0 ? comboOrder.strategy : optionStrategyType3;
        OrderTimeInForce orderTimeInForce3 = (i & 67108864) != 0 ? comboOrder.timeInForce : orderTimeInForce;
        OrderTrigger orderTrigger3 = (i & 134217728) != 0 ? comboOrder.trigger : orderTrigger;
        OrderType orderType3 = (i & 268435456) != 0 ? comboOrder.type : orderType;
        Instant instant6 = (i & 536870912) != 0 ? comboOrder.updatedAt : instant2;
        UUID uuid11 = (i & 1073741824) != 0 ? comboOrder.refId : uuid3;
        OrderDirection orderDirection11 = (i & Integer.MIN_VALUE) != 0 ? comboOrder.processedPremiumDirection : orderDirection3;
        BigDecimal bigDecimal42 = (i2 & 1) != 0 ? comboOrder.estimatedTotalNetAmount : bigDecimal14;
        OrderDirection orderDirection12 = (i2 & 2) != 0 ? comboOrder.estimatedTotalNetAmountDirection : orderDirection4;
        OptionOrder.FormSource formSource3 = (i2 & 4) != 0 ? comboOrder.formSource : formSource;
        UUID uuid12 = (i2 & 8) != 0 ? comboOrder.equityInstrumentId : uuid4;
        if ((i2 & 16) != 0) {
            uuid5 = uuid12;
            str5 = comboOrder.underlyingSymbol;
            bigDecimal16 = bigDecimal38;
            bigDecimal17 = bigDecimal39;
            bigDecimal18 = bigDecimal40;
            bigDecimal19 = bigDecimal41;
            optionStrategyType4 = optionStrategyType9;
            orderTimeInForce2 = orderTimeInForce3;
            orderTrigger2 = orderTrigger3;
            orderType2 = orderType3;
            instant3 = instant6;
            uuid6 = uuid11;
            orderDirection5 = orderDirection11;
            bigDecimal20 = bigDecimal42;
            orderDirection6 = orderDirection12;
            formSource2 = formSource3;
            bigDecimal21 = bigDecimal33;
            str6 = str11;
            optionStrategyType5 = optionStrategyType7;
            bigDecimal22 = bigDecimal31;
            instant4 = instant5;
            orderState2 = orderState3;
            orderDirection7 = orderDirection9;
            bigDecimal23 = bigDecimal32;
            z2 = z3;
            orderDirection8 = orderDirection10;
            optionStrategyType6 = optionStrategyType8;
            bigDecimal24 = bigDecimal34;
            bigDecimal25 = bigDecimal35;
            bigDecimal26 = bigDecimal36;
            bigDecimal15 = bigDecimal37;
            str7 = str9;
            bigDecimal27 = bigDecimal29;
            str8 = str10;
            bigDecimal28 = bigDecimal30;
            uuid7 = uuid9;
        } else {
            str5 = str4;
            uuid5 = uuid12;
            bigDecimal15 = bigDecimal37;
            bigDecimal16 = bigDecimal38;
            bigDecimal17 = bigDecimal39;
            bigDecimal18 = bigDecimal40;
            bigDecimal19 = bigDecimal41;
            optionStrategyType4 = optionStrategyType9;
            orderTimeInForce2 = orderTimeInForce3;
            orderTrigger2 = orderTrigger3;
            orderType2 = orderType3;
            instant3 = instant6;
            uuid6 = uuid11;
            orderDirection5 = orderDirection11;
            bigDecimal20 = bigDecimal42;
            orderDirection6 = orderDirection12;
            formSource2 = formSource3;
            bigDecimal21 = bigDecimal33;
            uuid7 = uuid9;
            str6 = str11;
            optionStrategyType5 = optionStrategyType7;
            bigDecimal22 = bigDecimal31;
            instant4 = instant5;
            orderState2 = orderState3;
            orderDirection7 = orderDirection9;
            bigDecimal23 = bigDecimal32;
            z2 = z3;
            orderDirection8 = orderDirection10;
            optionStrategyType6 = optionStrategyType8;
            bigDecimal24 = bigDecimal34;
            bigDecimal25 = bigDecimal35;
            bigDecimal26 = bigDecimal36;
            str7 = str9;
            bigDecimal27 = bigDecimal29;
            str8 = str10;
            bigDecimal28 = bigDecimal30;
        }
        return comboOrder.copy(uuid10, str7, bigDecimal27, str8, bigDecimal28, uuid7, str6, optionStrategyType5, bigDecimal22, instant4, orderState2, orderDirection7, bigDecimal23, z2, bigDecimal21, orderDirection8, optionStrategyType6, bigDecimal24, bigDecimal25, bigDecimal26, bigDecimal15, bigDecimal16, bigDecimal17, bigDecimal18, bigDecimal19, optionStrategyType4, orderTimeInForce2, orderTrigger2, orderType2, instant3, uuid6, orderDirection5, bigDecimal20, orderDirection6, formSource2, uuid5, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component11, reason: from getter */
    public final OrderState getDerivedState() {
        return this.derivedState;
    }

    /* renamed from: component12, reason: from getter */
    public final OrderDirection getDirection() {
        return this.direction;
    }

    /* renamed from: component13, reason: from getter */
    public final BigDecimal getGoldSavings() {
        return this.goldSavings;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsReplaceable() {
        return this.isReplaceable;
    }

    /* renamed from: component15, reason: from getter */
    public final BigDecimal getNetAmount() {
        return this.netAmount;
    }

    /* renamed from: component16, reason: from getter */
    public final OrderDirection getNetAmountDirection() {
        return this.netAmountDirection;
    }

    /* renamed from: component17, reason: from getter */
    public final OptionStrategyType getOpeningStrategy() {
        return this.openingStrategy;
    }

    /* renamed from: component18, reason: from getter */
    public final BigDecimal getPendingQuantity() {
        return this.pendingQuantity;
    }

    /* renamed from: component19, reason: from getter */
    public final BigDecimal getPremium() {
        return this.premium;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component20, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    /* renamed from: component21, reason: from getter */
    public final BigDecimal getProcessedPremium() {
        return this.processedPremium;
    }

    /* renamed from: component22, reason: from getter */
    public final BigDecimal getProcessedQuantity() {
        return this.processedQuantity;
    }

    /* renamed from: component23, reason: from getter */
    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    /* renamed from: component24, reason: from getter */
    public final BigDecimal getRegulatoryFees() {
        return this.regulatoryFees;
    }

    /* renamed from: component25, reason: from getter */
    public final BigDecimal getStopPrice() {
        return this.stopPrice;
    }

    /* renamed from: component26, reason: from getter */
    public final OptionStrategyType getStrategy() {
        return this.strategy;
    }

    /* renamed from: component27, reason: from getter */
    public final OrderTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    /* renamed from: component28, reason: from getter */
    public final OrderTrigger getTrigger() {
        return this.trigger;
    }

    /* renamed from: component29, reason: from getter */
    public final OrderType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getAverageNetPremiumPaid() {
        return this.averageNetPremiumPaid;
    }

    /* renamed from: component30, reason: from getter */
    public final Instant getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component31, reason: from getter */
    public final UUID getRefId() {
        return this.refId;
    }

    /* renamed from: component32, reason: from getter */
    public final OrderDirection getProcessedPremiumDirection() {
        return this.processedPremiumDirection;
    }

    /* renamed from: component33, reason: from getter */
    public final BigDecimal getEstimatedTotalNetAmount() {
        return this.estimatedTotalNetAmount;
    }

    /* renamed from: component34, reason: from getter */
    public final OrderDirection getEstimatedTotalNetAmountDirection() {
        return this.estimatedTotalNetAmountDirection;
    }

    /* renamed from: component35, reason: from getter */
    public final OptionOrder.FormSource getFormSource() {
        return this.formSource;
    }

    /* renamed from: component36, reason: from getter */
    public final UUID getEquityInstrumentId() {
        return this.equityInstrumentId;
    }

    /* renamed from: component37, reason: from getter */
    public final String getUnderlyingSymbol() {
        return this.underlyingSymbol;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCancelUrl() {
        return this.cancelUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getCanceledQuantity() {
        return this.canceledQuantity;
    }

    /* renamed from: component6, reason: from getter */
    public final UUID getChainId() {
        return this.chainId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getChainSymbol() {
        return this.chainSymbol;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionStrategyType getClosingStrategy() {
        return this.closingStrategy;
    }

    /* renamed from: component9, reason: from getter */
    public final BigDecimal getContractFees() {
        return this.contractFees;
    }

    public final ComboOrder copy(UUID id, String accountNumber, BigDecimal averageNetPremiumPaid, String cancelUrl, BigDecimal canceledQuantity, UUID chainId, String chainSymbol, OptionStrategyType closingStrategy, BigDecimal contractFees, Instant createdAt, OrderState derivedState, OrderDirection direction, BigDecimal goldSavings, boolean isReplaceable, BigDecimal netAmount, OrderDirection netAmountDirection, OptionStrategyType openingStrategy, BigDecimal pendingQuantity, BigDecimal premium, BigDecimal price, BigDecimal processedPremium, BigDecimal processedQuantity, BigDecimal quantity, BigDecimal regulatoryFees, BigDecimal stopPrice, OptionStrategyType strategy, OrderTimeInForce timeInForce, OrderTrigger trigger, OrderType type2, Instant updatedAt, UUID refId, OrderDirection processedPremiumDirection, BigDecimal estimatedTotalNetAmount, OrderDirection estimatedTotalNetAmountDirection, OptionOrder.FormSource formSource, UUID equityInstrumentId, String underlyingSymbol) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(averageNetPremiumPaid, "averageNetPremiumPaid");
        Intrinsics.checkNotNullParameter(canceledQuantity, "canceledQuantity");
        Intrinsics.checkNotNullParameter(chainId, "chainId");
        Intrinsics.checkNotNullParameter(chainSymbol, "chainSymbol");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(derivedState, "derivedState");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(netAmount, "netAmount");
        Intrinsics.checkNotNullParameter(netAmountDirection, "netAmountDirection");
        Intrinsics.checkNotNullParameter(pendingQuantity, "pendingQuantity");
        Intrinsics.checkNotNullParameter(processedPremium, "processedPremium");
        Intrinsics.checkNotNullParameter(processedQuantity, "processedQuantity");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(regulatoryFees, "regulatoryFees");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(processedPremiumDirection, "processedPremiumDirection");
        Intrinsics.checkNotNullParameter(estimatedTotalNetAmount, "estimatedTotalNetAmount");
        Intrinsics.checkNotNullParameter(estimatedTotalNetAmountDirection, "estimatedTotalNetAmountDirection");
        Intrinsics.checkNotNullParameter(formSource, "formSource");
        Intrinsics.checkNotNullParameter(equityInstrumentId, "equityInstrumentId");
        Intrinsics.checkNotNullParameter(underlyingSymbol, "underlyingSymbol");
        return new ComboOrder(id, accountNumber, averageNetPremiumPaid, cancelUrl, canceledQuantity, chainId, chainSymbol, closingStrategy, contractFees, createdAt, derivedState, direction, goldSavings, isReplaceable, netAmount, netAmountDirection, openingStrategy, pendingQuantity, premium, price, processedPremium, processedQuantity, quantity, regulatoryFees, stopPrice, strategy, timeInForce, trigger, type2, updatedAt, refId, processedPremiumDirection, estimatedTotalNetAmount, estimatedTotalNetAmountDirection, formSource, equityInstrumentId, underlyingSymbol);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComboOrder)) {
            return false;
        }
        ComboOrder comboOrder = (ComboOrder) other;
        return Intrinsics.areEqual(this.id, comboOrder.id) && Intrinsics.areEqual(this.accountNumber, comboOrder.accountNumber) && Intrinsics.areEqual(this.averageNetPremiumPaid, comboOrder.averageNetPremiumPaid) && Intrinsics.areEqual(this.cancelUrl, comboOrder.cancelUrl) && Intrinsics.areEqual(this.canceledQuantity, comboOrder.canceledQuantity) && Intrinsics.areEqual(this.chainId, comboOrder.chainId) && Intrinsics.areEqual(this.chainSymbol, comboOrder.chainSymbol) && this.closingStrategy == comboOrder.closingStrategy && Intrinsics.areEqual(this.contractFees, comboOrder.contractFees) && Intrinsics.areEqual(this.createdAt, comboOrder.createdAt) && this.derivedState == comboOrder.derivedState && this.direction == comboOrder.direction && Intrinsics.areEqual(this.goldSavings, comboOrder.goldSavings) && this.isReplaceable == comboOrder.isReplaceable && Intrinsics.areEqual(this.netAmount, comboOrder.netAmount) && this.netAmountDirection == comboOrder.netAmountDirection && this.openingStrategy == comboOrder.openingStrategy && Intrinsics.areEqual(this.pendingQuantity, comboOrder.pendingQuantity) && Intrinsics.areEqual(this.premium, comboOrder.premium) && Intrinsics.areEqual(this.price, comboOrder.price) && Intrinsics.areEqual(this.processedPremium, comboOrder.processedPremium) && Intrinsics.areEqual(this.processedQuantity, comboOrder.processedQuantity) && Intrinsics.areEqual(this.quantity, comboOrder.quantity) && Intrinsics.areEqual(this.regulatoryFees, comboOrder.regulatoryFees) && Intrinsics.areEqual(this.stopPrice, comboOrder.stopPrice) && this.strategy == comboOrder.strategy && this.timeInForce == comboOrder.timeInForce && this.trigger == comboOrder.trigger && this.type == comboOrder.type && Intrinsics.areEqual(this.updatedAt, comboOrder.updatedAt) && Intrinsics.areEqual(this.refId, comboOrder.refId) && this.processedPremiumDirection == comboOrder.processedPremiumDirection && Intrinsics.areEqual(this.estimatedTotalNetAmount, comboOrder.estimatedTotalNetAmount) && this.estimatedTotalNetAmountDirection == comboOrder.estimatedTotalNetAmountDirection && this.formSource == comboOrder.formSource && Intrinsics.areEqual(this.equityInstrumentId, comboOrder.equityInstrumentId) && Intrinsics.areEqual(this.underlyingSymbol, comboOrder.underlyingSymbol);
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + this.averageNetPremiumPaid.hashCode()) * 31;
        String str = this.cancelUrl;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.canceledQuantity.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.chainSymbol.hashCode()) * 31;
        OptionStrategyType optionStrategyType = this.closingStrategy;
        int iHashCode3 = (iHashCode2 + (optionStrategyType == null ? 0 : optionStrategyType.hashCode())) * 31;
        BigDecimal bigDecimal = this.contractFees;
        int iHashCode4 = (((((((iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.createdAt.hashCode()) * 31) + this.derivedState.hashCode()) * 31) + this.direction.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.goldSavings;
        int iHashCode5 = (((((((iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + Boolean.hashCode(this.isReplaceable)) * 31) + this.netAmount.hashCode()) * 31) + this.netAmountDirection.hashCode()) * 31;
        OptionStrategyType optionStrategyType2 = this.openingStrategy;
        int iHashCode6 = (((iHashCode5 + (optionStrategyType2 == null ? 0 : optionStrategyType2.hashCode())) * 31) + this.pendingQuantity.hashCode()) * 31;
        BigDecimal bigDecimal3 = this.premium;
        int iHashCode7 = (iHashCode6 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.price;
        int iHashCode8 = (((((((((iHashCode7 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31) + this.processedPremium.hashCode()) * 31) + this.processedQuantity.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.regulatoryFees.hashCode()) * 31;
        BigDecimal bigDecimal5 = this.stopPrice;
        int iHashCode9 = (iHashCode8 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        OptionStrategyType optionStrategyType3 = this.strategy;
        int iHashCode10 = (((((((((iHashCode9 + (optionStrategyType3 == null ? 0 : optionStrategyType3.hashCode())) * 31) + this.timeInForce.hashCode()) * 31) + this.trigger.hashCode()) * 31) + this.type.hashCode()) * 31) + this.updatedAt.hashCode()) * 31;
        UUID uuid = this.refId;
        return ((((((((((((iHashCode10 + (uuid != null ? uuid.hashCode() : 0)) * 31) + this.processedPremiumDirection.hashCode()) * 31) + this.estimatedTotalNetAmount.hashCode()) * 31) + this.estimatedTotalNetAmountDirection.hashCode()) * 31) + this.formSource.hashCode()) * 31) + this.equityInstrumentId.hashCode()) * 31) + this.underlyingSymbol.hashCode();
    }

    public String toString() {
        return "ComboOrder(id=" + this.id + ", accountNumber=" + this.accountNumber + ", averageNetPremiumPaid=" + this.averageNetPremiumPaid + ", cancelUrl=" + this.cancelUrl + ", canceledQuantity=" + this.canceledQuantity + ", chainId=" + this.chainId + ", chainSymbol=" + this.chainSymbol + ", closingStrategy=" + this.closingStrategy + ", contractFees=" + this.contractFees + ", createdAt=" + this.createdAt + ", derivedState=" + this.derivedState + ", direction=" + this.direction + ", goldSavings=" + this.goldSavings + ", isReplaceable=" + this.isReplaceable + ", netAmount=" + this.netAmount + ", netAmountDirection=" + this.netAmountDirection + ", openingStrategy=" + this.openingStrategy + ", pendingQuantity=" + this.pendingQuantity + ", premium=" + this.premium + ", price=" + this.price + ", processedPremium=" + this.processedPremium + ", processedQuantity=" + this.processedQuantity + ", quantity=" + this.quantity + ", regulatoryFees=" + this.regulatoryFees + ", stopPrice=" + this.stopPrice + ", strategy=" + this.strategy + ", timeInForce=" + this.timeInForce + ", trigger=" + this.trigger + ", type=" + this.type + ", updatedAt=" + this.updatedAt + ", refId=" + this.refId + ", processedPremiumDirection=" + this.processedPremiumDirection + ", estimatedTotalNetAmount=" + this.estimatedTotalNetAmount + ", estimatedTotalNetAmountDirection=" + this.estimatedTotalNetAmountDirection + ", formSource=" + this.formSource + ", equityInstrumentId=" + this.equityInstrumentId + ", underlyingSymbol=" + this.underlyingSymbol + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.id);
        dest.writeString(this.accountNumber);
        dest.writeSerializable(this.averageNetPremiumPaid);
        dest.writeString(this.cancelUrl);
        dest.writeSerializable(this.canceledQuantity);
        dest.writeSerializable(this.chainId);
        dest.writeString(this.chainSymbol);
        OptionStrategyType optionStrategyType = this.closingStrategy;
        if (optionStrategyType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(optionStrategyType.name());
        }
        dest.writeSerializable(this.contractFees);
        dest.writeSerializable(this.createdAt);
        dest.writeString(this.derivedState.name());
        dest.writeString(this.direction.name());
        dest.writeSerializable(this.goldSavings);
        dest.writeInt(this.isReplaceable ? 1 : 0);
        dest.writeSerializable(this.netAmount);
        dest.writeString(this.netAmountDirection.name());
        OptionStrategyType optionStrategyType2 = this.openingStrategy;
        if (optionStrategyType2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(optionStrategyType2.name());
        }
        dest.writeSerializable(this.pendingQuantity);
        dest.writeSerializable(this.premium);
        dest.writeSerializable(this.price);
        dest.writeSerializable(this.processedPremium);
        dest.writeSerializable(this.processedQuantity);
        dest.writeSerializable(this.quantity);
        dest.writeSerializable(this.regulatoryFees);
        dest.writeSerializable(this.stopPrice);
        OptionStrategyType optionStrategyType3 = this.strategy;
        if (optionStrategyType3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(optionStrategyType3.name());
        }
        dest.writeParcelable(this.timeInForce, flags);
        dest.writeString(this.trigger.name());
        dest.writeString(this.type.name());
        dest.writeSerializable(this.updatedAt);
        dest.writeSerializable(this.refId);
        dest.writeString(this.processedPremiumDirection.name());
        dest.writeSerializable(this.estimatedTotalNetAmount);
        dest.writeString(this.estimatedTotalNetAmountDirection.name());
        dest.writeString(this.formSource.name());
        dest.writeSerializable(this.equityInstrumentId);
        dest.writeString(this.underlyingSymbol);
    }

    @Override // com.robinhood.shared.models.history.shared.HistoryEvent
    public boolean getDefaultIsExpanded() {
        return HistoryEvent.DefaultImpls.getDefaultIsExpanded(this);
    }

    @Override // com.robinhood.shared.models.history.shared.HistoryEvent
    public HistoryEvent.SortKey getSortKey() {
        return HistoryEvent.DefaultImpls.getSortKey(this);
    }

    @Override // com.robinhood.shared.models.history.shared.HistoryEvent
    public StatefulHistoryEvent<HistoryEvent> toStatefulHistoryEvent() {
        return HistoryEvent.DefaultImpls.toStatefulHistoryEvent(this);
    }

    public ComboOrder(UUID id, String accountNumber, BigDecimal averageNetPremiumPaid, String str, BigDecimal canceledQuantity, UUID chainId, String chainSymbol, OptionStrategyType optionStrategyType, BigDecimal bigDecimal, Instant createdAt, OrderState derivedState, OrderDirection direction, BigDecimal bigDecimal2, boolean z, BigDecimal netAmount, OrderDirection netAmountDirection, OptionStrategyType optionStrategyType2, BigDecimal pendingQuantity, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal processedPremium, BigDecimal processedQuantity, BigDecimal quantity, BigDecimal regulatoryFees, BigDecimal bigDecimal5, OptionStrategyType optionStrategyType3, OrderTimeInForce timeInForce, OrderTrigger trigger, OrderType type2, Instant updatedAt, UUID uuid, OrderDirection processedPremiumDirection, BigDecimal estimatedTotalNetAmount, OrderDirection estimatedTotalNetAmountDirection, OptionOrder.FormSource formSource, UUID equityInstrumentId, String underlyingSymbol) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(averageNetPremiumPaid, "averageNetPremiumPaid");
        Intrinsics.checkNotNullParameter(canceledQuantity, "canceledQuantity");
        Intrinsics.checkNotNullParameter(chainId, "chainId");
        Intrinsics.checkNotNullParameter(chainSymbol, "chainSymbol");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(derivedState, "derivedState");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(netAmount, "netAmount");
        Intrinsics.checkNotNullParameter(netAmountDirection, "netAmountDirection");
        Intrinsics.checkNotNullParameter(pendingQuantity, "pendingQuantity");
        Intrinsics.checkNotNullParameter(processedPremium, "processedPremium");
        Intrinsics.checkNotNullParameter(processedQuantity, "processedQuantity");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(regulatoryFees, "regulatoryFees");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(processedPremiumDirection, "processedPremiumDirection");
        Intrinsics.checkNotNullParameter(estimatedTotalNetAmount, "estimatedTotalNetAmount");
        Intrinsics.checkNotNullParameter(estimatedTotalNetAmountDirection, "estimatedTotalNetAmountDirection");
        Intrinsics.checkNotNullParameter(formSource, "formSource");
        Intrinsics.checkNotNullParameter(equityInstrumentId, "equityInstrumentId");
        Intrinsics.checkNotNullParameter(underlyingSymbol, "underlyingSymbol");
        this.id = id;
        this.accountNumber = accountNumber;
        this.averageNetPremiumPaid = averageNetPremiumPaid;
        this.cancelUrl = str;
        this.canceledQuantity = canceledQuantity;
        this.chainId = chainId;
        this.chainSymbol = chainSymbol;
        this.closingStrategy = optionStrategyType;
        this.contractFees = bigDecimal;
        this.createdAt = createdAt;
        this.derivedState = derivedState;
        this.direction = direction;
        this.goldSavings = bigDecimal2;
        this.isReplaceable = z;
        this.netAmount = netAmount;
        this.netAmountDirection = netAmountDirection;
        this.openingStrategy = optionStrategyType2;
        this.pendingQuantity = pendingQuantity;
        this.premium = bigDecimal3;
        this.price = bigDecimal4;
        this.processedPremium = processedPremium;
        this.processedQuantity = processedQuantity;
        this.quantity = quantity;
        this.regulatoryFees = regulatoryFees;
        this.stopPrice = bigDecimal5;
        this.strategy = optionStrategyType3;
        this.timeInForce = timeInForce;
        this.trigger = trigger;
        this.type = type2;
        this.updatedAt = updatedAt;
        this.refId = uuid;
        this.processedPremiumDirection = processedPremiumDirection;
        this.estimatedTotalNetAmount = estimatedTotalNetAmount;
        this.estimatedTotalNetAmountDirection = estimatedTotalNetAmountDirection;
        this.formSource = formSource;
        this.equityInstrumentId = equityInstrumentId;
        this.underlyingSymbol = underlyingSymbol;
    }

    @Override // com.robinhood.shared.models.history.shared.HistoryEvent
    public UUID getId() {
        return this.id;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final BigDecimal getAverageNetPremiumPaid() {
        return this.averageNetPremiumPaid;
    }

    public final String getCancelUrl() {
        return this.cancelUrl;
    }

    public final BigDecimal getCanceledQuantity() {
        return this.canceledQuantity;
    }

    public final UUID getChainId() {
        return this.chainId;
    }

    public final String getChainSymbol() {
        return this.chainSymbol;
    }

    public final OptionStrategyType getClosingStrategy() {
        return this.closingStrategy;
    }

    public final BigDecimal getContractFees() {
        return this.contractFees;
    }

    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    public final OrderState getDerivedState() {
        return this.derivedState;
    }

    public final OrderDirection getDirection() {
        return this.direction;
    }

    public final BigDecimal getGoldSavings() {
        return this.goldSavings;
    }

    public final boolean isReplaceable() {
        return this.isReplaceable;
    }

    public final BigDecimal getNetAmount() {
        return this.netAmount;
    }

    public final OrderDirection getNetAmountDirection() {
        return this.netAmountDirection;
    }

    public final OptionStrategyType getOpeningStrategy() {
        return this.openingStrategy;
    }

    public final BigDecimal getPendingQuantity() {
        return this.pendingQuantity;
    }

    public final BigDecimal getPremium() {
        return this.premium;
    }

    public final BigDecimal getPrice() {
        return this.price;
    }

    public final BigDecimal getProcessedPremium() {
        return this.processedPremium;
    }

    public final BigDecimal getProcessedQuantity() {
        return this.processedQuantity;
    }

    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    public final BigDecimal getRegulatoryFees() {
        return this.regulatoryFees;
    }

    public final BigDecimal getStopPrice() {
        return this.stopPrice;
    }

    public final OptionStrategyType getStrategy() {
        return this.strategy;
    }

    public final OrderTimeInForce getTimeInForce() {
        return this.timeInForce;
    }

    public final OrderTrigger getTrigger() {
        return this.trigger;
    }

    public final OrderType getType() {
        return this.type;
    }

    public final Instant getUpdatedAt() {
        return this.updatedAt;
    }

    public final UUID getRefId() {
        return this.refId;
    }

    public final OrderDirection getProcessedPremiumDirection() {
        return this.processedPremiumDirection;
    }

    public final BigDecimal getEstimatedTotalNetAmount() {
        return this.estimatedTotalNetAmount;
    }

    public final OrderDirection getEstimatedTotalNetAmountDirection() {
        return this.estimatedTotalNetAmountDirection;
    }

    public final OptionOrder.FormSource getFormSource() {
        return this.formSource;
    }

    public final UUID getEquityInstrumentId() {
        return this.equityInstrumentId;
    }

    public final String getUnderlyingSymbol() {
        return this.underlyingSymbol;
    }

    @Override // com.robinhood.shared.models.history.shared.HistoryEvent
    public Money.Adjustment getAdjustment() {
        Money.Direction direction;
        BigDecimal bigDecimal = this.processedPremium;
        if (Intrinsics.areEqual(bigDecimal, BigDecimal.ZERO)) {
            bigDecimal = null;
        }
        if (bigDecimal == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.processedPremiumDirection.ordinal()];
        if (i == 1) {
            direction = Money.Direction.CREDIT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            direction = Money.Direction.DEBIT;
        }
        return new Money.Adjustment(direction, Money3.toMoney(bigDecimal, Currencies.USD));
    }

    @Override // com.robinhood.shared.models.history.shared.HistoryEvent
    public Instant getInitiatedAt() {
        return this.createdAt;
    }

    @Override // com.robinhood.shared.models.history.shared.HistoryEvent
    public HistoryEvent.State getHistoryState() {
        return this.derivedState.isPending() ? HistoryEvent.State.PENDING : HistoryEvent.State.SETTLED;
    }

    @Override // com.robinhood.shared.models.history.shared.HistoryEvent
    public TransactionReference getTransactionReference() {
        return new TransactionReference(getId(), HistoryTransactionType.COMBO_ORDER, null, null, false, 28, null);
    }

    /* compiled from: ComboOrder.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/combo/db/ComboOrder$Companion;", "Lcom/robinhood/models/db/StaleConfig;", "<init>", "()V", "j$/time/Duration", "getNormalStaleTimeout", "()Lj$/time/Duration;", "normalStaleTimeout", "lib-models-combo-orders_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StaleConfig {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.models.p320db.StaleConfig
        public Duration getShortStaleTimeout() {
            return StaleConfig.DefaultImpls.getShortStaleTimeout(this);
        }

        @Override // com.robinhood.models.p320db.StaleConfig
        public Duration getNormalStaleTimeout() {
            return Durations.INSTANCE.getFIVE_SECONDS();
        }
    }
}
