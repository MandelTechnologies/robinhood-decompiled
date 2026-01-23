package com.robinhood.android.options.combo.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.options.combo.p206db.ComboOrder;
import com.robinhood.android.options.combo.p206db.ComboOrderExecution;
import com.robinhood.android.options.combo.p206db.ComboOrderLeg;
import com.robinhood.android.options.combo.p206db.ComboOrderSalesTax;
import com.robinhood.enums.RhEnum;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.shared.models.history.shared.OrderState;
import com.squareup.moshi.JsonClass;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: ApiComboOrder.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\b\n\u0002\b=\b\u0087\b\u0018\u00002\u00020\u0001:\b³\u0001´\u0001µ\u0001¶\u0001Bã\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u0012\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0012\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0019\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010*\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00101\u001a\u00020\u000e\u0012\u0006\u00102\u001a\u00020\u0004\u0012\u0006\u00103\u001a\u00020\u0012\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\u0006\u00106\u001a\u00020\b\u0012\u0006\u00107\u001a\u00020\u0002¢\u0006\u0004\b8\u00109J\r\u0010;\u001a\u00020:¢\u0006\u0004\b;\u0010<J\u0013\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u0019¢\u0006\u0004\b>\u0010?J\u0013\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u0019¢\u0006\u0004\bA\u0010?J\u0013\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u0019¢\u0006\u0004\bC\u0010?J\u0010\u0010D\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u0010EJ\u0010\u0010I\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bI\u0010GJ\u0010\u0010J\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bL\u0010EJ\u0012\u0010M\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bO\u0010GJ\u0010\u0010P\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bV\u0010GJ\u0010\u0010W\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bW\u0010KJ\u0012\u0010X\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bX\u0010KJ\u0010\u0010Y\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019HÆ\u0003¢\u0006\u0004\b[\u0010?J\u0010\u0010\\\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\\\u0010GJ\u0010\u0010]\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b]\u0010UJ\u0012\u0010^\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b^\u0010NJ\u0010\u0010_\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b_\u0010GJ\u0012\u0010`\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b`\u0010GJ\u0012\u0010a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\ba\u0010GJ\u0010\u0010b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bb\u0010GJ\u0010\u0010c\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\bc\u0010UJ\u0010\u0010d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bd\u0010GJ\u0010\u0010e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\be\u0010GJ\u0010\u0010f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bf\u0010GJ\u0018\u0010g\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bg\u0010?J\u0012\u0010h\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bh\u0010GJ\u0012\u0010i\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bi\u0010NJ\u0010\u0010j\u001a\u00020+HÆ\u0003¢\u0006\u0004\bj\u0010kJ\u0010\u0010l\u001a\u00020-HÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0010\u0010n\u001a\u00020/HÆ\u0003¢\u0006\u0004\bn\u0010oJ\u0010\u0010p\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bp\u0010QJ\u0010\u0010q\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bq\u0010GJ\u0010\u0010r\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\br\u0010UJ\u0012\u0010s\u001a\u0004\u0018\u000104HÆ\u0003¢\u0006\u0004\bs\u0010tJ\u0010\u0010u\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bu\u0010KJ\u0010\u0010v\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bv\u0010EJº\u0003\u0010w\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00122\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u00042\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00192\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u00122\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\b\b\u0002\u00106\u001a\u00020\b2\b\b\u0002\u00107\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\bw\u0010xJ\u0010\u0010y\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\by\u0010EJ\u0010\u0010{\u001a\u00020zHÖ\u0001¢\u0006\u0004\b{\u0010|J\u001a\u0010~\u001a\u00020\u00172\b\u0010}\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b~\u0010\u007fR\u0019\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0003\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010ER\u0019\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0005\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010GR\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0006\u0010\u0080\u0001\u001a\u0005\b\u0084\u0001\u0010ER\u0019\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0007\u0010\u0082\u0001\u001a\u0005\b\u0085\u0001\u0010GR\u0019\u0010\t\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\t\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010KR\u0019\u0010\n\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\n\u0010\u0080\u0001\u001a\u0005\b\u0088\u0001\u0010ER\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u000e\n\u0005\b\f\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010NR\u001b\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b\r\u0010\u0082\u0001\u001a\u0005\b\u008b\u0001\u0010GR\u0019\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010QR\u0019\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010SR\u0019\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010UR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b\u0014\u0010\u0082\u0001\u001a\u0005\b\u0092\u0001\u0010GR\u0019\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010\u0086\u0001\u001a\u0005\b\u0093\u0001\u0010KR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b\u0016\u0010\u0086\u0001\u001a\u0005\b\u0094\u0001\u0010KR\u0018\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\r\n\u0005\b\u0018\u0010\u0095\u0001\u001a\u0004\b\u0018\u0010ZR\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010\u0096\u0001\u001a\u0005\b\u0097\u0001\u0010?R\u0019\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010\u0082\u0001\u001a\u0005\b\u0098\u0001\u0010GR\u0019\u0010\u001d\u001a\u00020\u00128\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010\u0090\u0001\u001a\u0005\b\u0099\u0001\u0010UR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010\u0089\u0001\u001a\u0005\b\u009a\u0001\u0010NR\u0019\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010\u0082\u0001\u001a\u0005\b\u009b\u0001\u0010GR\u001b\u0010 \u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b \u0010\u0082\u0001\u001a\u0005\b\u009c\u0001\u0010GR\u001b\u0010!\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b!\u0010\u0082\u0001\u001a\u0005\b\u009d\u0001\u0010GR\u0019\u0010\"\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\"\u0010\u0082\u0001\u001a\u0005\b\u009e\u0001\u0010GR\u0019\u0010#\u001a\u00020\u00128\u0006¢\u0006\u000e\n\u0005\b#\u0010\u0090\u0001\u001a\u0005\b\u009f\u0001\u0010UR\u0019\u0010$\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b$\u0010\u0082\u0001\u001a\u0005\b \u0001\u0010GR\u0019\u0010%\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b%\u0010\u0082\u0001\u001a\u0005\b¡\u0001\u0010GR\u0019\u0010&\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0082\u0001\u001a\u0005\b¢\u0001\u0010GR!\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00198\u0006¢\u0006\u000e\n\u0005\b(\u0010\u0096\u0001\u001a\u0005\b£\u0001\u0010?R\u001b\u0010)\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b)\u0010\u0082\u0001\u001a\u0005\b¤\u0001\u0010GR\u001b\u0010*\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u000e\n\u0005\b*\u0010\u0089\u0001\u001a\u0005\b¥\u0001\u0010NR\u0019\u0010,\u001a\u00020+8\u0006¢\u0006\u000e\n\u0005\b,\u0010¦\u0001\u001a\u0005\b§\u0001\u0010kR\u0019\u0010.\u001a\u00020-8\u0006¢\u0006\u000e\n\u0005\b.\u0010¨\u0001\u001a\u0005\b©\u0001\u0010mR\u0019\u00100\u001a\u00020/8\u0006¢\u0006\u000e\n\u0005\b0\u0010ª\u0001\u001a\u0005\b«\u0001\u0010oR\u0019\u00101\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b1\u0010\u008c\u0001\u001a\u0005\b¬\u0001\u0010QR\u0019\u00102\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b2\u0010\u0082\u0001\u001a\u0005\b\u00ad\u0001\u0010GR\u0019\u00103\u001a\u00020\u00128\u0006¢\u0006\u000e\n\u0005\b3\u0010\u0090\u0001\u001a\u0005\b®\u0001\u0010UR\u001b\u00105\u001a\u0004\u0018\u0001048\u0006¢\u0006\u000e\n\u0005\b5\u0010¯\u0001\u001a\u0005\b°\u0001\u0010tR\u0019\u00106\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b6\u0010\u0086\u0001\u001a\u0005\b±\u0001\u0010KR\u0019\u00107\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b7\u0010\u0080\u0001\u001a\u0005\b²\u0001\u0010E¨\u0006·\u0001"}, m3636d2 = {"Lcom/robinhood/android/options/combo/api/ApiComboOrder;", "", "", "account_number", "Ljava/math/BigDecimal;", "average_net_premium_paid", "cancel_url", "canceled_quantity", "Ljava/util/UUID;", "chain_id", "chain_symbol", "Lcom/robinhood/models/api/OptionStrategyType;", "closing_strategy", "contract_fees", "j$/time/Instant", "created_at", "Lcom/robinhood/shared/models/history/shared/OrderState;", "derived_state", "Lcom/robinhood/models/db/OrderDirection;", "direction", "gold_savings", "id", "ref_id", "", "is_replaceable", "", "Lcom/robinhood/android/options/combo/api/ApiComboOrder$Leg;", "legs", "net_amount", "net_amount_direction", "opening_strategy", "pending_quantity", "premium", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "processed_premium", "processed_premium_direction", "processed_quantity", "quantity", "regulatory_fees", "Lcom/robinhood/android/options/combo/api/ApiComboOrder$SalesTax;", "sales_taxes", "stop_price", "strategy", "Lcom/robinhood/models/db/OrderTimeInForce;", "time_in_force", "Lcom/robinhood/models/db/OrderTrigger;", "trigger", "Lcom/robinhood/models/db/OrderType;", "type", "updated_at", "estimated_total_net_amount", "estimated_total_net_amount_direction", "Lcom/robinhood/models/db/OptionOrder$FormSource;", "form_source", "equity_instrument_id", "underlying_symbol", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/api/OptionStrategyType;Ljava/math/BigDecimal;Lj$/time/Instant;Lcom/robinhood/shared/models/history/shared/OrderState;Lcom/robinhood/models/db/OrderDirection;Ljava/math/BigDecimal;Ljava/util/UUID;Ljava/util/UUID;ZLjava/util/List;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderDirection;Lcom/robinhood/models/api/OptionStrategyType;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderDirection;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/math/BigDecimal;Lcom/robinhood/models/api/OptionStrategyType;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderTrigger;Lcom/robinhood/models/db/OrderType;Lj$/time/Instant;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderDirection;Lcom/robinhood/models/db/OptionOrder$FormSource;Ljava/util/UUID;Ljava/lang/String;)V", "Lcom/robinhood/android/options/combo/db/ComboOrder;", "toDbModel", "()Lcom/robinhood/android/options/combo/db/ComboOrder;", "Lcom/robinhood/android/options/combo/db/ComboOrderLeg;", "getComboOrderLegs", "()Ljava/util/List;", "Lcom/robinhood/android/options/combo/db/ComboOrderExecution;", "getComboOrderExecutions", "Lcom/robinhood/android/options/combo/db/ComboOrderSalesTax;", "getComboOrderSalesTaxes", "component1", "()Ljava/lang/String;", "component2", "()Ljava/math/BigDecimal;", "component3", "component4", "component5", "()Ljava/util/UUID;", "component6", "component7", "()Lcom/robinhood/models/api/OptionStrategyType;", "component8", "component9", "()Lj$/time/Instant;", "component10", "()Lcom/robinhood/shared/models/history/shared/OrderState;", "component11", "()Lcom/robinhood/models/db/OrderDirection;", "component12", "component13", "component14", "component15", "()Z", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "()Lcom/robinhood/models/db/OrderTimeInForce;", "component32", "()Lcom/robinhood/models/db/OrderTrigger;", "component33", "()Lcom/robinhood/models/db/OrderType;", "component34", "component35", "component36", "component37", "()Lcom/robinhood/models/db/OptionOrder$FormSource;", "component38", "component39", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/api/OptionStrategyType;Ljava/math/BigDecimal;Lj$/time/Instant;Lcom/robinhood/shared/models/history/shared/OrderState;Lcom/robinhood/models/db/OrderDirection;Ljava/math/BigDecimal;Ljava/util/UUID;Ljava/util/UUID;ZLjava/util/List;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderDirection;Lcom/robinhood/models/api/OptionStrategyType;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderDirection;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/math/BigDecimal;Lcom/robinhood/models/api/OptionStrategyType;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderTrigger;Lcom/robinhood/models/db/OrderType;Lj$/time/Instant;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OrderDirection;Lcom/robinhood/models/db/OptionOrder$FormSource;Ljava/util/UUID;Ljava/lang/String;)Lcom/robinhood/android/options/combo/api/ApiComboOrder;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "Ljava/math/BigDecimal;", "getAverage_net_premium_paid", "getCancel_url", "getCanceled_quantity", "Ljava/util/UUID;", "getChain_id", "getChain_symbol", "Lcom/robinhood/models/api/OptionStrategyType;", "getClosing_strategy", "getContract_fees", "Lj$/time/Instant;", "getCreated_at", "Lcom/robinhood/shared/models/history/shared/OrderState;", "getDerived_state", "Lcom/robinhood/models/db/OrderDirection;", "getDirection", "getGold_savings", "getId", "getRef_id", "Z", "Ljava/util/List;", "getLegs", "getNet_amount", "getNet_amount_direction", "getOpening_strategy", "getPending_quantity", "getPremium", "getPrice", "getProcessed_premium", "getProcessed_premium_direction", "getProcessed_quantity", "getQuantity", "getRegulatory_fees", "getSales_taxes", "getStop_price", "getStrategy", "Lcom/robinhood/models/db/OrderTimeInForce;", "getTime_in_force", "Lcom/robinhood/models/db/OrderTrigger;", "getTrigger", "Lcom/robinhood/models/db/OrderType;", "getType", "getUpdated_at", "getEstimated_total_net_amount", "getEstimated_total_net_amount_direction", "Lcom/robinhood/models/db/OptionOrder$FormSource;", "getForm_source", "getEquity_instrument_id", "getUnderlying_symbol", "InstrumentType", "SalesTax", "Leg", "Execution", "lib-models-combo-orders_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class ApiComboOrder {
    private final String account_number;
    private final BigDecimal average_net_premium_paid;
    private final String cancel_url;
    private final BigDecimal canceled_quantity;
    private final UUID chain_id;
    private final String chain_symbol;
    private final OptionStrategyType closing_strategy;
    private final BigDecimal contract_fees;
    private final Instant created_at;
    private final OrderState derived_state;
    private final OrderDirection direction;
    private final UUID equity_instrument_id;
    private final BigDecimal estimated_total_net_amount;
    private final OrderDirection estimated_total_net_amount_direction;
    private final OptionOrder.FormSource form_source;
    private final BigDecimal gold_savings;
    private final UUID id;
    private final boolean is_replaceable;
    private final List<Leg> legs;
    private final BigDecimal net_amount;
    private final OrderDirection net_amount_direction;
    private final OptionStrategyType opening_strategy;
    private final BigDecimal pending_quantity;
    private final BigDecimal premium;
    private final BigDecimal price;
    private final BigDecimal processed_premium;
    private final OrderDirection processed_premium_direction;
    private final BigDecimal processed_quantity;
    private final BigDecimal quantity;
    private final UUID ref_id;
    private final BigDecimal regulatory_fees;
    private final List<SalesTax> sales_taxes;
    private final BigDecimal stop_price;
    private final OptionStrategyType strategy;
    private final OrderTimeInForce time_in_force;
    private final OrderTrigger trigger;
    private final OrderType type;
    private final String underlying_symbol;
    private final Instant updated_at;

    public static /* synthetic */ ApiComboOrder copy$default(ApiComboOrder apiComboOrder, String str, BigDecimal bigDecimal, String str2, BigDecimal bigDecimal2, UUID uuid, String str3, OptionStrategyType optionStrategyType, BigDecimal bigDecimal3, Instant instant, OrderState orderState, OrderDirection orderDirection, BigDecimal bigDecimal4, UUID uuid2, UUID uuid3, boolean z, List list, BigDecimal bigDecimal5, OrderDirection orderDirection2, OptionStrategyType optionStrategyType2, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, OrderDirection orderDirection3, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, List list2, BigDecimal bigDecimal13, OptionStrategyType optionStrategyType3, OrderTimeInForce orderTimeInForce, OrderTrigger orderTrigger, OrderType orderType, Instant instant2, BigDecimal bigDecimal14, OrderDirection orderDirection4, OptionOrder.FormSource formSource, UUID uuid4, String str4, int i, int i2, Object obj) {
        String str5;
        UUID uuid5;
        BigDecimal bigDecimal15;
        OrderDirection orderDirection5;
        BigDecimal bigDecimal16;
        BigDecimal bigDecimal17;
        BigDecimal bigDecimal18;
        List list3;
        BigDecimal bigDecimal19;
        OptionStrategyType optionStrategyType4;
        OrderTimeInForce orderTimeInForce2;
        OrderTrigger orderTrigger2;
        OrderType orderType2;
        Instant instant3;
        BigDecimal bigDecimal20;
        OrderDirection orderDirection6;
        OptionOrder.FormSource formSource2;
        boolean z2;
        BigDecimal bigDecimal21;
        Instant instant4;
        OrderState orderState2;
        OrderDirection orderDirection7;
        BigDecimal bigDecimal22;
        UUID uuid6;
        UUID uuid7;
        List list4;
        BigDecimal bigDecimal23;
        OrderDirection orderDirection8;
        OptionStrategyType optionStrategyType5;
        BigDecimal bigDecimal24;
        BigDecimal bigDecimal25;
        BigDecimal bigDecimal26;
        BigDecimal bigDecimal27;
        String str6;
        BigDecimal bigDecimal28;
        UUID uuid8;
        String str7;
        OptionStrategyType optionStrategyType6;
        String str8 = (i & 1) != 0 ? apiComboOrder.account_number : str;
        BigDecimal bigDecimal29 = (i & 2) != 0 ? apiComboOrder.average_net_premium_paid : bigDecimal;
        String str9 = (i & 4) != 0 ? apiComboOrder.cancel_url : str2;
        BigDecimal bigDecimal30 = (i & 8) != 0 ? apiComboOrder.canceled_quantity : bigDecimal2;
        UUID uuid9 = (i & 16) != 0 ? apiComboOrder.chain_id : uuid;
        String str10 = (i & 32) != 0 ? apiComboOrder.chain_symbol : str3;
        OptionStrategyType optionStrategyType7 = (i & 64) != 0 ? apiComboOrder.closing_strategy : optionStrategyType;
        BigDecimal bigDecimal31 = (i & 128) != 0 ? apiComboOrder.contract_fees : bigDecimal3;
        Instant instant5 = (i & 256) != 0 ? apiComboOrder.created_at : instant;
        OrderState orderState3 = (i & 512) != 0 ? apiComboOrder.derived_state : orderState;
        OrderDirection orderDirection9 = (i & 1024) != 0 ? apiComboOrder.direction : orderDirection;
        BigDecimal bigDecimal32 = (i & 2048) != 0 ? apiComboOrder.gold_savings : bigDecimal4;
        UUID uuid10 = (i & 4096) != 0 ? apiComboOrder.id : uuid2;
        UUID uuid11 = (i & 8192) != 0 ? apiComboOrder.ref_id : uuid3;
        String str11 = str8;
        boolean z3 = (i & 16384) != 0 ? apiComboOrder.is_replaceable : z;
        List list5 = (i & 32768) != 0 ? apiComboOrder.legs : list;
        BigDecimal bigDecimal33 = (i & 65536) != 0 ? apiComboOrder.net_amount : bigDecimal5;
        OrderDirection orderDirection10 = (i & 131072) != 0 ? apiComboOrder.net_amount_direction : orderDirection2;
        OptionStrategyType optionStrategyType8 = (i & 262144) != 0 ? apiComboOrder.opening_strategy : optionStrategyType2;
        BigDecimal bigDecimal34 = (i & 524288) != 0 ? apiComboOrder.pending_quantity : bigDecimal6;
        BigDecimal bigDecimal35 = (i & 1048576) != 0 ? apiComboOrder.premium : bigDecimal7;
        BigDecimal bigDecimal36 = (i & 2097152) != 0 ? apiComboOrder.price : bigDecimal8;
        BigDecimal bigDecimal37 = (i & 4194304) != 0 ? apiComboOrder.processed_premium : bigDecimal9;
        OrderDirection orderDirection11 = (i & 8388608) != 0 ? apiComboOrder.processed_premium_direction : orderDirection3;
        BigDecimal bigDecimal38 = (i & 16777216) != 0 ? apiComboOrder.processed_quantity : bigDecimal10;
        BigDecimal bigDecimal39 = (i & 33554432) != 0 ? apiComboOrder.quantity : bigDecimal11;
        BigDecimal bigDecimal40 = (i & 67108864) != 0 ? apiComboOrder.regulatory_fees : bigDecimal12;
        List list6 = (i & 134217728) != 0 ? apiComboOrder.sales_taxes : list2;
        BigDecimal bigDecimal41 = (i & 268435456) != 0 ? apiComboOrder.stop_price : bigDecimal13;
        OptionStrategyType optionStrategyType9 = (i & 536870912) != 0 ? apiComboOrder.strategy : optionStrategyType3;
        OrderTimeInForce orderTimeInForce3 = (i & 1073741824) != 0 ? apiComboOrder.time_in_force : orderTimeInForce;
        OrderTrigger orderTrigger3 = (i & Integer.MIN_VALUE) != 0 ? apiComboOrder.trigger : orderTrigger;
        OrderType orderType3 = (i2 & 1) != 0 ? apiComboOrder.type : orderType;
        Instant instant6 = (i2 & 2) != 0 ? apiComboOrder.updated_at : instant2;
        BigDecimal bigDecimal42 = (i2 & 4) != 0 ? apiComboOrder.estimated_total_net_amount : bigDecimal14;
        OrderDirection orderDirection12 = (i2 & 8) != 0 ? apiComboOrder.estimated_total_net_amount_direction : orderDirection4;
        OptionOrder.FormSource formSource3 = (i2 & 16) != 0 ? apiComboOrder.form_source : formSource;
        UUID uuid12 = (i2 & 32) != 0 ? apiComboOrder.equity_instrument_id : uuid4;
        if ((i2 & 64) != 0) {
            uuid5 = uuid12;
            str5 = apiComboOrder.underlying_symbol;
            orderDirection5 = orderDirection11;
            bigDecimal16 = bigDecimal38;
            bigDecimal17 = bigDecimal39;
            bigDecimal18 = bigDecimal40;
            list3 = list6;
            bigDecimal19 = bigDecimal41;
            optionStrategyType4 = optionStrategyType9;
            orderTimeInForce2 = orderTimeInForce3;
            orderTrigger2 = orderTrigger3;
            orderType2 = orderType3;
            instant3 = instant6;
            bigDecimal20 = bigDecimal42;
            orderDirection6 = orderDirection12;
            formSource2 = formSource3;
            z2 = z3;
            instant4 = instant5;
            orderState2 = orderState3;
            orderDirection7 = orderDirection9;
            bigDecimal22 = bigDecimal32;
            uuid6 = uuid10;
            uuid7 = uuid11;
            list4 = list5;
            bigDecimal23 = bigDecimal33;
            orderDirection8 = orderDirection10;
            optionStrategyType5 = optionStrategyType8;
            bigDecimal24 = bigDecimal34;
            bigDecimal25 = bigDecimal35;
            bigDecimal26 = bigDecimal36;
            bigDecimal15 = bigDecimal37;
            bigDecimal27 = bigDecimal29;
            str6 = str9;
            bigDecimal28 = bigDecimal30;
            uuid8 = uuid9;
            str7 = str10;
            optionStrategyType6 = optionStrategyType7;
            bigDecimal21 = bigDecimal31;
        } else {
            str5 = str4;
            uuid5 = uuid12;
            bigDecimal15 = bigDecimal37;
            orderDirection5 = orderDirection11;
            bigDecimal16 = bigDecimal38;
            bigDecimal17 = bigDecimal39;
            bigDecimal18 = bigDecimal40;
            list3 = list6;
            bigDecimal19 = bigDecimal41;
            optionStrategyType4 = optionStrategyType9;
            orderTimeInForce2 = orderTimeInForce3;
            orderTrigger2 = orderTrigger3;
            orderType2 = orderType3;
            instant3 = instant6;
            bigDecimal20 = bigDecimal42;
            orderDirection6 = orderDirection12;
            formSource2 = formSource3;
            z2 = z3;
            bigDecimal21 = bigDecimal31;
            instant4 = instant5;
            orderState2 = orderState3;
            orderDirection7 = orderDirection9;
            bigDecimal22 = bigDecimal32;
            uuid6 = uuid10;
            uuid7 = uuid11;
            list4 = list5;
            bigDecimal23 = bigDecimal33;
            orderDirection8 = orderDirection10;
            optionStrategyType5 = optionStrategyType8;
            bigDecimal24 = bigDecimal34;
            bigDecimal25 = bigDecimal35;
            bigDecimal26 = bigDecimal36;
            bigDecimal27 = bigDecimal29;
            str6 = str9;
            bigDecimal28 = bigDecimal30;
            uuid8 = uuid9;
            str7 = str10;
            optionStrategyType6 = optionStrategyType7;
        }
        return apiComboOrder.copy(str11, bigDecimal27, str6, bigDecimal28, uuid8, str7, optionStrategyType6, bigDecimal21, instant4, orderState2, orderDirection7, bigDecimal22, uuid6, uuid7, z2, list4, bigDecimal23, orderDirection8, optionStrategyType5, bigDecimal24, bigDecimal25, bigDecimal26, bigDecimal15, orderDirection5, bigDecimal16, bigDecimal17, bigDecimal18, list3, bigDecimal19, optionStrategyType4, orderTimeInForce2, orderTrigger2, orderType2, instant3, bigDecimal20, orderDirection6, formSource2, uuid5, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccount_number() {
        return this.account_number;
    }

    /* renamed from: component10, reason: from getter */
    public final OrderState getDerived_state() {
        return this.derived_state;
    }

    /* renamed from: component11, reason: from getter */
    public final OrderDirection getDirection() {
        return this.direction;
    }

    /* renamed from: component12, reason: from getter */
    public final BigDecimal getGold_savings() {
        return this.gold_savings;
    }

    /* renamed from: component13, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component14, reason: from getter */
    public final UUID getRef_id() {
        return this.ref_id;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIs_replaceable() {
        return this.is_replaceable;
    }

    public final List<Leg> component16() {
        return this.legs;
    }

    /* renamed from: component17, reason: from getter */
    public final BigDecimal getNet_amount() {
        return this.net_amount;
    }

    /* renamed from: component18, reason: from getter */
    public final OrderDirection getNet_amount_direction() {
        return this.net_amount_direction;
    }

    /* renamed from: component19, reason: from getter */
    public final OptionStrategyType getOpening_strategy() {
        return this.opening_strategy;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getAverage_net_premium_paid() {
        return this.average_net_premium_paid;
    }

    /* renamed from: component20, reason: from getter */
    public final BigDecimal getPending_quantity() {
        return this.pending_quantity;
    }

    /* renamed from: component21, reason: from getter */
    public final BigDecimal getPremium() {
        return this.premium;
    }

    /* renamed from: component22, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    /* renamed from: component23, reason: from getter */
    public final BigDecimal getProcessed_premium() {
        return this.processed_premium;
    }

    /* renamed from: component24, reason: from getter */
    public final OrderDirection getProcessed_premium_direction() {
        return this.processed_premium_direction;
    }

    /* renamed from: component25, reason: from getter */
    public final BigDecimal getProcessed_quantity() {
        return this.processed_quantity;
    }

    /* renamed from: component26, reason: from getter */
    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    /* renamed from: component27, reason: from getter */
    public final BigDecimal getRegulatory_fees() {
        return this.regulatory_fees;
    }

    public final List<SalesTax> component28() {
        return this.sales_taxes;
    }

    /* renamed from: component29, reason: from getter */
    public final BigDecimal getStop_price() {
        return this.stop_price;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCancel_url() {
        return this.cancel_url;
    }

    /* renamed from: component30, reason: from getter */
    public final OptionStrategyType getStrategy() {
        return this.strategy;
    }

    /* renamed from: component31, reason: from getter */
    public final OrderTimeInForce getTime_in_force() {
        return this.time_in_force;
    }

    /* renamed from: component32, reason: from getter */
    public final OrderTrigger getTrigger() {
        return this.trigger;
    }

    /* renamed from: component33, reason: from getter */
    public final OrderType getType() {
        return this.type;
    }

    /* renamed from: component34, reason: from getter */
    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    /* renamed from: component35, reason: from getter */
    public final BigDecimal getEstimated_total_net_amount() {
        return this.estimated_total_net_amount;
    }

    /* renamed from: component36, reason: from getter */
    public final OrderDirection getEstimated_total_net_amount_direction() {
        return this.estimated_total_net_amount_direction;
    }

    /* renamed from: component37, reason: from getter */
    public final OptionOrder.FormSource getForm_source() {
        return this.form_source;
    }

    /* renamed from: component38, reason: from getter */
    public final UUID getEquity_instrument_id() {
        return this.equity_instrument_id;
    }

    /* renamed from: component39, reason: from getter */
    public final String getUnderlying_symbol() {
        return this.underlying_symbol;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getCanceled_quantity() {
        return this.canceled_quantity;
    }

    /* renamed from: component5, reason: from getter */
    public final UUID getChain_id() {
        return this.chain_id;
    }

    /* renamed from: component6, reason: from getter */
    public final String getChain_symbol() {
        return this.chain_symbol;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionStrategyType getClosing_strategy() {
        return this.closing_strategy;
    }

    /* renamed from: component8, reason: from getter */
    public final BigDecimal getContract_fees() {
        return this.contract_fees;
    }

    /* renamed from: component9, reason: from getter */
    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final ApiComboOrder copy(String account_number, BigDecimal average_net_premium_paid, String cancel_url, BigDecimal canceled_quantity, UUID chain_id, String chain_symbol, OptionStrategyType closing_strategy, BigDecimal contract_fees, Instant created_at, OrderState derived_state, OrderDirection direction, BigDecimal gold_savings, UUID id, UUID ref_id, boolean is_replaceable, List<Leg> legs, BigDecimal net_amount, OrderDirection net_amount_direction, OptionStrategyType opening_strategy, BigDecimal pending_quantity, BigDecimal premium, BigDecimal price, BigDecimal processed_premium, OrderDirection processed_premium_direction, BigDecimal processed_quantity, BigDecimal quantity, BigDecimal regulatory_fees, List<SalesTax> sales_taxes, BigDecimal stop_price, OptionStrategyType strategy, OrderTimeInForce time_in_force, OrderTrigger trigger, OrderType type2, Instant updated_at, BigDecimal estimated_total_net_amount, OrderDirection estimated_total_net_amount_direction, OptionOrder.FormSource form_source, UUID equity_instrument_id, String underlying_symbol) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(average_net_premium_paid, "average_net_premium_paid");
        Intrinsics.checkNotNullParameter(canceled_quantity, "canceled_quantity");
        Intrinsics.checkNotNullParameter(chain_id, "chain_id");
        Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(derived_state, "derived_state");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(net_amount, "net_amount");
        Intrinsics.checkNotNullParameter(net_amount_direction, "net_amount_direction");
        Intrinsics.checkNotNullParameter(pending_quantity, "pending_quantity");
        Intrinsics.checkNotNullParameter(processed_premium, "processed_premium");
        Intrinsics.checkNotNullParameter(processed_premium_direction, "processed_premium_direction");
        Intrinsics.checkNotNullParameter(processed_quantity, "processed_quantity");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(regulatory_fees, "regulatory_fees");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(estimated_total_net_amount, "estimated_total_net_amount");
        Intrinsics.checkNotNullParameter(estimated_total_net_amount_direction, "estimated_total_net_amount_direction");
        Intrinsics.checkNotNullParameter(equity_instrument_id, "equity_instrument_id");
        Intrinsics.checkNotNullParameter(underlying_symbol, "underlying_symbol");
        return new ApiComboOrder(account_number, average_net_premium_paid, cancel_url, canceled_quantity, chain_id, chain_symbol, closing_strategy, contract_fees, created_at, derived_state, direction, gold_savings, id, ref_id, is_replaceable, legs, net_amount, net_amount_direction, opening_strategy, pending_quantity, premium, price, processed_premium, processed_premium_direction, processed_quantity, quantity, regulatory_fees, sales_taxes, stop_price, strategy, time_in_force, trigger, type2, updated_at, estimated_total_net_amount, estimated_total_net_amount_direction, form_source, equity_instrument_id, underlying_symbol);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiComboOrder)) {
            return false;
        }
        ApiComboOrder apiComboOrder = (ApiComboOrder) other;
        return Intrinsics.areEqual(this.account_number, apiComboOrder.account_number) && Intrinsics.areEqual(this.average_net_premium_paid, apiComboOrder.average_net_premium_paid) && Intrinsics.areEqual(this.cancel_url, apiComboOrder.cancel_url) && Intrinsics.areEqual(this.canceled_quantity, apiComboOrder.canceled_quantity) && Intrinsics.areEqual(this.chain_id, apiComboOrder.chain_id) && Intrinsics.areEqual(this.chain_symbol, apiComboOrder.chain_symbol) && this.closing_strategy == apiComboOrder.closing_strategy && Intrinsics.areEqual(this.contract_fees, apiComboOrder.contract_fees) && Intrinsics.areEqual(this.created_at, apiComboOrder.created_at) && this.derived_state == apiComboOrder.derived_state && this.direction == apiComboOrder.direction && Intrinsics.areEqual(this.gold_savings, apiComboOrder.gold_savings) && Intrinsics.areEqual(this.id, apiComboOrder.id) && Intrinsics.areEqual(this.ref_id, apiComboOrder.ref_id) && this.is_replaceable == apiComboOrder.is_replaceable && Intrinsics.areEqual(this.legs, apiComboOrder.legs) && Intrinsics.areEqual(this.net_amount, apiComboOrder.net_amount) && this.net_amount_direction == apiComboOrder.net_amount_direction && this.opening_strategy == apiComboOrder.opening_strategy && Intrinsics.areEqual(this.pending_quantity, apiComboOrder.pending_quantity) && Intrinsics.areEqual(this.premium, apiComboOrder.premium) && Intrinsics.areEqual(this.price, apiComboOrder.price) && Intrinsics.areEqual(this.processed_premium, apiComboOrder.processed_premium) && this.processed_premium_direction == apiComboOrder.processed_premium_direction && Intrinsics.areEqual(this.processed_quantity, apiComboOrder.processed_quantity) && Intrinsics.areEqual(this.quantity, apiComboOrder.quantity) && Intrinsics.areEqual(this.regulatory_fees, apiComboOrder.regulatory_fees) && Intrinsics.areEqual(this.sales_taxes, apiComboOrder.sales_taxes) && Intrinsics.areEqual(this.stop_price, apiComboOrder.stop_price) && this.strategy == apiComboOrder.strategy && this.time_in_force == apiComboOrder.time_in_force && this.trigger == apiComboOrder.trigger && this.type == apiComboOrder.type && Intrinsics.areEqual(this.updated_at, apiComboOrder.updated_at) && Intrinsics.areEqual(this.estimated_total_net_amount, apiComboOrder.estimated_total_net_amount) && this.estimated_total_net_amount_direction == apiComboOrder.estimated_total_net_amount_direction && this.form_source == apiComboOrder.form_source && Intrinsics.areEqual(this.equity_instrument_id, apiComboOrder.equity_instrument_id) && Intrinsics.areEqual(this.underlying_symbol, apiComboOrder.underlying_symbol);
    }

    public int hashCode() {
        int iHashCode = ((this.account_number.hashCode() * 31) + this.average_net_premium_paid.hashCode()) * 31;
        String str = this.cancel_url;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.canceled_quantity.hashCode()) * 31) + this.chain_id.hashCode()) * 31) + this.chain_symbol.hashCode()) * 31;
        OptionStrategyType optionStrategyType = this.closing_strategy;
        int iHashCode3 = (iHashCode2 + (optionStrategyType == null ? 0 : optionStrategyType.hashCode())) * 31;
        BigDecimal bigDecimal = this.contract_fees;
        int iHashCode4 = (((((((iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.created_at.hashCode()) * 31) + this.derived_state.hashCode()) * 31) + this.direction.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.gold_savings;
        int iHashCode5 = (((iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + this.id.hashCode()) * 31;
        UUID uuid = this.ref_id;
        int iHashCode6 = (((((((((iHashCode5 + (uuid == null ? 0 : uuid.hashCode())) * 31) + Boolean.hashCode(this.is_replaceable)) * 31) + this.legs.hashCode()) * 31) + this.net_amount.hashCode()) * 31) + this.net_amount_direction.hashCode()) * 31;
        OptionStrategyType optionStrategyType2 = this.opening_strategy;
        int iHashCode7 = (((iHashCode6 + (optionStrategyType2 == null ? 0 : optionStrategyType2.hashCode())) * 31) + this.pending_quantity.hashCode()) * 31;
        BigDecimal bigDecimal3 = this.premium;
        int iHashCode8 = (iHashCode7 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.price;
        int iHashCode9 = (((((((((((iHashCode8 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31) + this.processed_premium.hashCode()) * 31) + this.processed_premium_direction.hashCode()) * 31) + this.processed_quantity.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.regulatory_fees.hashCode()) * 31;
        List<SalesTax> list = this.sales_taxes;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.stop_price;
        int iHashCode11 = (iHashCode10 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        OptionStrategyType optionStrategyType3 = this.strategy;
        int iHashCode12 = (((((((((((((iHashCode11 + (optionStrategyType3 == null ? 0 : optionStrategyType3.hashCode())) * 31) + this.time_in_force.hashCode()) * 31) + this.trigger.hashCode()) * 31) + this.type.hashCode()) * 31) + this.updated_at.hashCode()) * 31) + this.estimated_total_net_amount.hashCode()) * 31) + this.estimated_total_net_amount_direction.hashCode()) * 31;
        OptionOrder.FormSource formSource = this.form_source;
        return ((((iHashCode12 + (formSource != null ? formSource.hashCode() : 0)) * 31) + this.equity_instrument_id.hashCode()) * 31) + this.underlying_symbol.hashCode();
    }

    public String toString() {
        return "ApiComboOrder(account_number=" + this.account_number + ", average_net_premium_paid=" + this.average_net_premium_paid + ", cancel_url=" + this.cancel_url + ", canceled_quantity=" + this.canceled_quantity + ", chain_id=" + this.chain_id + ", chain_symbol=" + this.chain_symbol + ", closing_strategy=" + this.closing_strategy + ", contract_fees=" + this.contract_fees + ", created_at=" + this.created_at + ", derived_state=" + this.derived_state + ", direction=" + this.direction + ", gold_savings=" + this.gold_savings + ", id=" + this.id + ", ref_id=" + this.ref_id + ", is_replaceable=" + this.is_replaceable + ", legs=" + this.legs + ", net_amount=" + this.net_amount + ", net_amount_direction=" + this.net_amount_direction + ", opening_strategy=" + this.opening_strategy + ", pending_quantity=" + this.pending_quantity + ", premium=" + this.premium + ", price=" + this.price + ", processed_premium=" + this.processed_premium + ", processed_premium_direction=" + this.processed_premium_direction + ", processed_quantity=" + this.processed_quantity + ", quantity=" + this.quantity + ", regulatory_fees=" + this.regulatory_fees + ", sales_taxes=" + this.sales_taxes + ", stop_price=" + this.stop_price + ", strategy=" + this.strategy + ", time_in_force=" + this.time_in_force + ", trigger=" + this.trigger + ", type=" + this.type + ", updated_at=" + this.updated_at + ", estimated_total_net_amount=" + this.estimated_total_net_amount + ", estimated_total_net_amount_direction=" + this.estimated_total_net_amount_direction + ", form_source=" + this.form_source + ", equity_instrument_id=" + this.equity_instrument_id + ", underlying_symbol=" + this.underlying_symbol + ")";
    }

    public ApiComboOrder(String account_number, BigDecimal average_net_premium_paid, String str, BigDecimal canceled_quantity, UUID chain_id, String chain_symbol, OptionStrategyType optionStrategyType, BigDecimal bigDecimal, Instant created_at, OrderState derived_state, OrderDirection direction, BigDecimal bigDecimal2, UUID id, UUID uuid, boolean z, List<Leg> legs, BigDecimal net_amount, OrderDirection net_amount_direction, OptionStrategyType optionStrategyType2, BigDecimal pending_quantity, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal processed_premium, OrderDirection processed_premium_direction, BigDecimal processed_quantity, BigDecimal quantity, BigDecimal regulatory_fees, List<SalesTax> list, BigDecimal bigDecimal5, OptionStrategyType optionStrategyType3, OrderTimeInForce time_in_force, OrderTrigger trigger, OrderType type2, Instant updated_at, BigDecimal estimated_total_net_amount, OrderDirection estimated_total_net_amount_direction, OptionOrder.FormSource formSource, UUID equity_instrument_id, String underlying_symbol) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(average_net_premium_paid, "average_net_premium_paid");
        Intrinsics.checkNotNullParameter(canceled_quantity, "canceled_quantity");
        Intrinsics.checkNotNullParameter(chain_id, "chain_id");
        Intrinsics.checkNotNullParameter(chain_symbol, "chain_symbol");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(derived_state, "derived_state");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(net_amount, "net_amount");
        Intrinsics.checkNotNullParameter(net_amount_direction, "net_amount_direction");
        Intrinsics.checkNotNullParameter(pending_quantity, "pending_quantity");
        Intrinsics.checkNotNullParameter(processed_premium, "processed_premium");
        Intrinsics.checkNotNullParameter(processed_premium_direction, "processed_premium_direction");
        Intrinsics.checkNotNullParameter(processed_quantity, "processed_quantity");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(regulatory_fees, "regulatory_fees");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(estimated_total_net_amount, "estimated_total_net_amount");
        Intrinsics.checkNotNullParameter(estimated_total_net_amount_direction, "estimated_total_net_amount_direction");
        Intrinsics.checkNotNullParameter(equity_instrument_id, "equity_instrument_id");
        Intrinsics.checkNotNullParameter(underlying_symbol, "underlying_symbol");
        this.account_number = account_number;
        this.average_net_premium_paid = average_net_premium_paid;
        this.cancel_url = str;
        this.canceled_quantity = canceled_quantity;
        this.chain_id = chain_id;
        this.chain_symbol = chain_symbol;
        this.closing_strategy = optionStrategyType;
        this.contract_fees = bigDecimal;
        this.created_at = created_at;
        this.derived_state = derived_state;
        this.direction = direction;
        this.gold_savings = bigDecimal2;
        this.id = id;
        this.ref_id = uuid;
        this.is_replaceable = z;
        this.legs = legs;
        this.net_amount = net_amount;
        this.net_amount_direction = net_amount_direction;
        this.opening_strategy = optionStrategyType2;
        this.pending_quantity = pending_quantity;
        this.premium = bigDecimal3;
        this.price = bigDecimal4;
        this.processed_premium = processed_premium;
        this.processed_premium_direction = processed_premium_direction;
        this.processed_quantity = processed_quantity;
        this.quantity = quantity;
        this.regulatory_fees = regulatory_fees;
        this.sales_taxes = list;
        this.stop_price = bigDecimal5;
        this.strategy = optionStrategyType3;
        this.time_in_force = time_in_force;
        this.trigger = trigger;
        this.type = type2;
        this.updated_at = updated_at;
        this.estimated_total_net_amount = estimated_total_net_amount;
        this.estimated_total_net_amount_direction = estimated_total_net_amount_direction;
        this.form_source = formSource;
        this.equity_instrument_id = equity_instrument_id;
        this.underlying_symbol = underlying_symbol;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final BigDecimal getAverage_net_premium_paid() {
        return this.average_net_premium_paid;
    }

    public final String getCancel_url() {
        return this.cancel_url;
    }

    public final BigDecimal getCanceled_quantity() {
        return this.canceled_quantity;
    }

    public final UUID getChain_id() {
        return this.chain_id;
    }

    public final String getChain_symbol() {
        return this.chain_symbol;
    }

    public final OptionStrategyType getClosing_strategy() {
        return this.closing_strategy;
    }

    public final BigDecimal getContract_fees() {
        return this.contract_fees;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final OrderState getDerived_state() {
        return this.derived_state;
    }

    public final OrderDirection getDirection() {
        return this.direction;
    }

    public final BigDecimal getGold_savings() {
        return this.gold_savings;
    }

    public final UUID getId() {
        return this.id;
    }

    public final UUID getRef_id() {
        return this.ref_id;
    }

    public final boolean is_replaceable() {
        return this.is_replaceable;
    }

    public final List<Leg> getLegs() {
        return this.legs;
    }

    public final BigDecimal getNet_amount() {
        return this.net_amount;
    }

    public final OrderDirection getNet_amount_direction() {
        return this.net_amount_direction;
    }

    public final OptionStrategyType getOpening_strategy() {
        return this.opening_strategy;
    }

    public final BigDecimal getPending_quantity() {
        return this.pending_quantity;
    }

    public final BigDecimal getPremium() {
        return this.premium;
    }

    public final BigDecimal getPrice() {
        return this.price;
    }

    public final BigDecimal getProcessed_premium() {
        return this.processed_premium;
    }

    public final OrderDirection getProcessed_premium_direction() {
        return this.processed_premium_direction;
    }

    public final BigDecimal getProcessed_quantity() {
        return this.processed_quantity;
    }

    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    public final BigDecimal getRegulatory_fees() {
        return this.regulatory_fees;
    }

    public final List<SalesTax> getSales_taxes() {
        return this.sales_taxes;
    }

    public final BigDecimal getStop_price() {
        return this.stop_price;
    }

    public final OptionStrategyType getStrategy() {
        return this.strategy;
    }

    public final OrderTimeInForce getTime_in_force() {
        return this.time_in_force;
    }

    public final OrderTrigger getTrigger() {
        return this.trigger;
    }

    public final OrderType getType() {
        return this.type;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    public final BigDecimal getEstimated_total_net_amount() {
        return this.estimated_total_net_amount;
    }

    public final OrderDirection getEstimated_total_net_amount_direction() {
        return this.estimated_total_net_amount_direction;
    }

    public final OptionOrder.FormSource getForm_source() {
        return this.form_source;
    }

    public final UUID getEquity_instrument_id() {
        return this.equity_instrument_id;
    }

    public final String getUnderlying_symbol() {
        return this.underlying_symbol;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiComboOrder.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/options/combo/api/ApiComboOrder$InstrumentType;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "EQUITY", "OPTION", "Companion", "lib-models-combo-orders_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InstrumentType implements RhEnum<InstrumentType> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InstrumentType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String serverValue;
        public static final InstrumentType UNKNOWN = new InstrumentType("UNKNOWN", 0, "unknown");
        public static final InstrumentType EQUITY = new InstrumentType("EQUITY", 1, ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY);
        public static final InstrumentType OPTION = new InstrumentType("OPTION", 2, AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION);

        private static final /* synthetic */ InstrumentType[] $values() {
            return new InstrumentType[]{UNKNOWN, EQUITY, OPTION};
        }

        @JvmStatic
        public static InstrumentType fromServerValue(String str) {
            return INSTANCE.fromServerValue(str);
        }

        public static EnumEntries<InstrumentType> getEntries() {
            return $ENTRIES;
        }

        @JvmStatic
        public static String toServerValue(InstrumentType instrumentType) {
            return INSTANCE.toServerValue(instrumentType);
        }

        private InstrumentType(String str, int i, String str2) {
            this.serverValue = str2;
        }

        @Override // com.robinhood.enums.RhEnum
        public String getServerValue() {
            return this.serverValue;
        }

        static {
            InstrumentType[] instrumentTypeArr$values = $values();
            $VALUES = instrumentTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(instrumentTypeArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: ApiComboOrder.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/options/combo/api/ApiComboOrder$InstrumentType$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/android/options/combo/api/ApiComboOrder$InstrumentType;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "lib-models-combo-orders_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion extends RhEnum.Converter.Defaulted<InstrumentType> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
                super((Enum[]) InstrumentType.getEntries().toArray(new InstrumentType[0]), InstrumentType.UNKNOWN, false, 4, null);
            }

            @Override // com.robinhood.enums.RhEnum.Converter
            @JvmStatic
            public String toServerValue(InstrumentType enumValue) {
                return super.toServerValue((Enum) enumValue);
            }

            @Override // com.robinhood.enums.RhEnum.Converter.Defaulted, com.robinhood.enums.RhEnum.Converter
            @JvmStatic
            public InstrumentType fromServerValue(String serverValue) {
                return (InstrumentType) super.fromServerValue(serverValue);
            }
        }

        public static InstrumentType valueOf(String str) {
            return (InstrumentType) Enum.valueOf(InstrumentType.class, str);
        }

        public static InstrumentType[] values() {
            return (InstrumentType[]) $VALUES.clone();
        }
    }

    /* compiled from: ApiComboOrder.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/options/combo/api/ApiComboOrder$SalesTax;", "", "type", "", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "fee_rate", "Ljava/math/BigDecimal;", "fee", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getType", "()Ljava/lang/String;", "getDisplay_name", "getFee_rate", "()Ljava/math/BigDecimal;", "getFee", "toDbModel", "Lcom/robinhood/android/options/combo/db/ComboOrderSalesTax;", "orderId", "Ljava/util/UUID;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-combo-orders_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SalesTax {
        private final String display_name;
        private final BigDecimal fee;
        private final BigDecimal fee_rate;
        private final String type;

        public static /* synthetic */ SalesTax copy$default(SalesTax salesTax, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = salesTax.type;
            }
            if ((i & 2) != 0) {
                str2 = salesTax.display_name;
            }
            if ((i & 4) != 0) {
                bigDecimal = salesTax.fee_rate;
            }
            if ((i & 8) != 0) {
                bigDecimal2 = salesTax.fee;
            }
            return salesTax.copy(str, str2, bigDecimal, bigDecimal2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDisplay_name() {
            return this.display_name;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getFee_rate() {
            return this.fee_rate;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getFee() {
            return this.fee;
        }

        public final SalesTax copy(String type2, String display_name, BigDecimal fee_rate, BigDecimal fee) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(display_name, "display_name");
            Intrinsics.checkNotNullParameter(fee_rate, "fee_rate");
            Intrinsics.checkNotNullParameter(fee, "fee");
            return new SalesTax(type2, display_name, fee_rate, fee);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SalesTax)) {
                return false;
            }
            SalesTax salesTax = (SalesTax) other;
            return Intrinsics.areEqual(this.type, salesTax.type) && Intrinsics.areEqual(this.display_name, salesTax.display_name) && Intrinsics.areEqual(this.fee_rate, salesTax.fee_rate) && Intrinsics.areEqual(this.fee, salesTax.fee);
        }

        public int hashCode() {
            return (((((this.type.hashCode() * 31) + this.display_name.hashCode()) * 31) + this.fee_rate.hashCode()) * 31) + this.fee.hashCode();
        }

        public String toString() {
            return "SalesTax(type=" + this.type + ", display_name=" + this.display_name + ", fee_rate=" + this.fee_rate + ", fee=" + this.fee + ")";
        }

        public SalesTax(String type2, String display_name, BigDecimal fee_rate, BigDecimal fee) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(display_name, "display_name");
            Intrinsics.checkNotNullParameter(fee_rate, "fee_rate");
            Intrinsics.checkNotNullParameter(fee, "fee");
            this.type = type2;
            this.display_name = display_name;
            this.fee_rate = fee_rate;
            this.fee = fee;
        }

        public final String getType() {
            return this.type;
        }

        public final String getDisplay_name() {
            return this.display_name;
        }

        public final BigDecimal getFee_rate() {
            return this.fee_rate;
        }

        public final BigDecimal getFee() {
            return this.fee;
        }

        public final ComboOrderSalesTax toDbModel(UUID orderId) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            return new ComboOrderSalesTax(uuidRandomUUID, orderId, this.type, this.display_name, this.fee_rate, this.fee);
        }
    }

    /* compiled from: ApiComboOrder.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/options/combo/api/ApiComboOrder$Leg;", "", "executions", "", "Lcom/robinhood/android/options/combo/api/ApiComboOrder$Execution;", "id", "Ljava/util/UUID;", "instrument_id", "instrument_type", "Lcom/robinhood/android/options/combo/api/ApiComboOrder$InstrumentType;", "position_effect", "Lcom/robinhood/models/db/OrderPositionEffect;", "ratio_quantity", "", "side", "Lcom/robinhood/models/db/OrderSide;", "<init>", "(Ljava/util/List;Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/android/options/combo/api/ApiComboOrder$InstrumentType;Lcom/robinhood/models/db/OrderPositionEffect;ILcom/robinhood/models/db/OrderSide;)V", "getExecutions", "()Ljava/util/List;", "getId", "()Ljava/util/UUID;", "getInstrument_id", "getInstrument_type", "()Lcom/robinhood/android/options/combo/api/ApiComboOrder$InstrumentType;", "getPosition_effect", "()Lcom/robinhood/models/db/OrderPositionEffect;", "getRatio_quantity", "()I", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "toDbModel", "Lcom/robinhood/android/options/combo/db/ComboOrderLeg;", "orderId", "lib-models-combo-orders_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Leg {
        private final List<Execution> executions;
        private final UUID id;
        private final UUID instrument_id;
        private final InstrumentType instrument_type;
        private final OrderPositionEffect position_effect;
        private final int ratio_quantity;
        private final OrderSide side;

        public Leg(List<Execution> executions, UUID id, UUID instrument_id, InstrumentType instrument_type, OrderPositionEffect position_effect, int i, OrderSide side) {
            Intrinsics.checkNotNullParameter(executions, "executions");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            Intrinsics.checkNotNullParameter(side, "side");
            this.executions = executions;
            this.id = id;
            this.instrument_id = instrument_id;
            this.instrument_type = instrument_type;
            this.position_effect = position_effect;
            this.ratio_quantity = i;
            this.side = side;
        }

        public final List<Execution> getExecutions() {
            return this.executions;
        }

        public final UUID getId() {
            return this.id;
        }

        public final UUID getInstrument_id() {
            return this.instrument_id;
        }

        public final InstrumentType getInstrument_type() {
            return this.instrument_type;
        }

        public final OrderPositionEffect getPosition_effect() {
            return this.position_effect;
        }

        public final int getRatio_quantity() {
            return this.ratio_quantity;
        }

        public final OrderSide getSide() {
            return this.side;
        }

        public final ComboOrderLeg toDbModel(UUID orderId) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            return new ComboOrderLeg(this.id, orderId, this.instrument_id, this.instrument_type, this.position_effect, this.ratio_quantity, this.side);
        }
    }

    /* compiled from: ApiComboOrder.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/options/combo/api/ApiComboOrder$Execution;", "", "Ljava/util/UUID;", "id", "Ljava/math/BigDecimal;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "processed_quantity", "quantity", "j$/time/LocalDate", "settlement_date", "j$/time/Instant", "timestamp", "<init>", "(Ljava/util/UUID;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lj$/time/LocalDate;Lj$/time/Instant;)V", "legId", "Lcom/robinhood/android/options/combo/db/ComboOrderExecution;", "toDbModel", "(Ljava/util/UUID;)Lcom/robinhood/android/options/combo/db/ComboOrderExecution;", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "Ljava/math/BigDecimal;", "getPrice", "()Ljava/math/BigDecimal;", "getProcessed_quantity", "getQuantity", "Lj$/time/LocalDate;", "getSettlement_date", "()Lj$/time/LocalDate;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "lib-models-combo-orders_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Execution {
        private final UUID id;
        private final BigDecimal price;
        private final BigDecimal processed_quantity;
        private final BigDecimal quantity;
        private final LocalDate settlement_date;
        private final Instant timestamp;

        public Execution(UUID id, BigDecimal price, BigDecimal bigDecimal, BigDecimal quantity, LocalDate settlement_date, Instant timestamp) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(settlement_date, "settlement_date");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.id = id;
            this.price = price;
            this.processed_quantity = bigDecimal;
            this.quantity = quantity;
            this.settlement_date = settlement_date;
            this.timestamp = timestamp;
        }

        public final UUID getId() {
            return this.id;
        }

        public final BigDecimal getPrice() {
            return this.price;
        }

        public final BigDecimal getProcessed_quantity() {
            return this.processed_quantity;
        }

        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        public final LocalDate getSettlement_date() {
            return this.settlement_date;
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final ComboOrderExecution toDbModel(UUID legId) {
            Intrinsics.checkNotNullParameter(legId, "legId");
            return new ComboOrderExecution(this.id, legId, this.price, this.processed_quantity, this.quantity, this.settlement_date, this.timestamp);
        }
    }

    public final ComboOrder toDbModel() {
        UUID uuid = this.id;
        String str = this.account_number;
        BigDecimal bigDecimal = this.average_net_premium_paid;
        String str2 = this.cancel_url;
        BigDecimal bigDecimal2 = this.canceled_quantity;
        UUID uuid2 = this.chain_id;
        String str3 = this.chain_symbol;
        OptionStrategyType optionStrategyType = this.closing_strategy;
        BigDecimal bigDecimal3 = this.contract_fees;
        Instant instant = this.created_at;
        OrderState orderState = this.derived_state;
        OrderDirection orderDirection = this.direction;
        BigDecimal bigDecimal4 = this.gold_savings;
        boolean z = this.is_replaceable;
        BigDecimal bigDecimal5 = this.net_amount;
        OrderDirection orderDirection2 = this.net_amount_direction;
        OptionStrategyType optionStrategyType2 = this.opening_strategy;
        BigDecimal bigDecimal6 = this.pending_quantity;
        BigDecimal bigDecimal7 = this.premium;
        BigDecimal bigDecimal8 = this.price;
        BigDecimal bigDecimal9 = this.processed_premium;
        BigDecimal bigDecimal10 = this.processed_quantity;
        BigDecimal bigDecimal11 = this.quantity;
        BigDecimal bigDecimal12 = this.regulatory_fees;
        BigDecimal bigDecimal13 = this.stop_price;
        OptionStrategyType optionStrategyType3 = this.strategy;
        OrderTimeInForce orderTimeInForce = this.time_in_force;
        OrderTrigger orderTrigger = this.trigger;
        OrderType orderType = this.type;
        Instant instant2 = this.updated_at;
        UUID uuid3 = this.ref_id;
        OrderDirection orderDirection3 = this.processed_premium_direction;
        BigDecimal bigDecimal14 = this.estimated_total_net_amount;
        OrderDirection orderDirection4 = this.estimated_total_net_amount_direction;
        OptionOrder.FormSource formSource = this.form_source;
        if (formSource == null) {
            formSource = OptionOrder.FormSource.UNSPECIFIED;
        }
        return new ComboOrder(uuid, str, bigDecimal, str2, bigDecimal2, uuid2, str3, optionStrategyType, bigDecimal3, instant, orderState, orderDirection, bigDecimal4, z, bigDecimal5, orderDirection2, optionStrategyType2, bigDecimal6, bigDecimal7, bigDecimal8, bigDecimal9, bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13, optionStrategyType3, orderTimeInForce, orderTrigger, orderType, instant2, uuid3, orderDirection3, bigDecimal14, orderDirection4, formSource, this.equity_instrument_id, this.underlying_symbol);
    }

    public final List<ComboOrderLeg> getComboOrderLegs() {
        List<Leg> list = this.legs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Leg) it.next()).toDbModel(this.id));
        }
        return arrayList;
    }

    public final List<ComboOrderExecution> getComboOrderExecutions() {
        List<Leg> list = this.legs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Leg leg : list) {
            List<Execution> executions = leg.getExecutions();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(executions, 10));
            Iterator<T> it = executions.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Execution) it.next()).toDbModel(leg.getId()));
            }
            arrayList.add(arrayList2);
        }
        return CollectionsKt.flatten(arrayList);
    }

    public final List<ComboOrderSalesTax> getComboOrderSalesTaxes() {
        List<SalesTax> list = this.sales_taxes;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        List<SalesTax> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((SalesTax) it.next()).toDbModel(this.id));
        }
        return arrayList;
    }
}
