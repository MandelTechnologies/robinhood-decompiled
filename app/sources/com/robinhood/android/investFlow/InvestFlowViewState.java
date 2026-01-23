package com.robinhood.android.investFlow;

import com.robinhood.android.investFlow.core.InvestFlowBasketItem;
import com.robinhood.android.investFlow.core.InvestFlowCoreData;
import com.robinhood.android.investFlow.core.InvestFlowPaymentMethod;
import com.robinhood.android.recurring.contracts.investflow.AllocationStrategy;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowLoggingParams;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowStep;
import com.robinhood.investflow.models.api.ApiAssetAllocation;
import com.robinhood.investflow.models.api.ApiInvestFlowNbboResponse;
import com.robinhood.investflow.models.api.ApiInvestFlowPostBody;
import com.robinhood.investflow.models.api.ApiInvestFlowRecurringSchedulePostBody;
import com.robinhood.models.api.OrderRequest;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.rosetta.eventlogging.InvestFlowContext;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: InvestFlowViewState.kt */
@Metadata(m3635d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b1\n\u0002\u0010\b\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002µ\u0001B\u008d\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u0014\u0012\u001c\b\u0002\u0010-\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u0014\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\b\b\u0002\u00104\u001a\u000203\u0012\b\b\u0002\u00105\u001a\u00020+\u0012\b\b\u0002\u00106\u001a\u00020\u0004\u0012\b\b\u0002\u00107\u001a\u00020\u0004¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u000eHÂ\u0003¢\u0006\u0004\b:\u0010;J\r\u0010=\u001a\u00020<¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u00020\u00152\u0006\u0010?\u001a\u00020\u0015¢\u0006\u0004\b@\u0010AJ\u0015\u0010D\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bL\u0010IJ\u0010\u0010M\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0016\u0010O\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0016\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bHÆ\u0003¢\u0006\u0004\bS\u0010PJ\u0018\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bX\u0010WJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b[\u0010;J\u0012\u0010\\\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b\\\u0010]J\u0012\u0010^\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\b^\u0010_J\u0018\u0010`\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b`\u0010UJ\u0018\u0010a\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\ba\u0010UJ\u0018\u0010b\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bb\u0010UJ\u0018\u0010c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bc\u0010UJ\u0018\u0010d\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bd\u0010UJ$\u0010e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\be\u0010UJ\u0018\u0010f\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bf\u0010UJ\u0012\u0010g\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\bg\u0010hJ\u0012\u0010i\u001a\u0004\u0018\u000101HÆ\u0003¢\u0006\u0004\bi\u0010jJ\u0010\u0010k\u001a\u000203HÆ\u0003¢\u0006\u0004\bk\u0010lJ\u0010\u0010m\u001a\u00020+HÆ\u0003¢\u0006\u0004\bm\u0010hJ\u0010\u0010n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bn\u0010IJ\u0010\u0010o\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bo\u0010IJ\u009e\u0003\u0010p\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00142\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00142\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00142\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00142\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00142\u001c\b\u0002\u0010-\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*\u0018\u00010\u00142\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00142\n\b\u0002\u00100\u001a\u0004\u0018\u00010+2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u00020+2\b\b\u0002\u00106\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\bp\u0010qJ\u0010\u0010r\u001a\u00020+HÖ\u0001¢\u0006\u0004\br\u0010hJ\u0010\u0010t\u001a\u00020sHÖ\u0001¢\u0006\u0004\bt\u0010uJ\u001a\u0010w\u001a\u00020\u00042\b\u0010v\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bw\u0010xR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010y\u001a\u0004\bz\u0010GR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010{\u001a\u0004\b|\u0010IR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010}\u001a\u0004\b~\u0010KR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010{\u001a\u0004\b\u007f\u0010IR\u0019\u0010\n\u001a\u00020\t8\u0006¢\u0006\u000e\n\u0005\b\n\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010NR\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\u000e\n\u0005\b\r\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010PR\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0084\u0001R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010RR\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b8\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010\u0082\u0001\u001a\u0005\b\u0087\u0001\u0010PR!\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b\u0016\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010UR\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\u000e\n\u0005\b\u0018\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010WR\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\u000e\n\u0005\b\u0019\u0010\u008a\u0001\u001a\u0005\b\u008c\u0001\u0010WR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010ZR\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010\u0084\u0001\u001a\u0005\b\u008f\u0001\u0010;R\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010]R\u001b\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\u000e\n\u0005\b \u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010_R!\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b\"\u0010\u0088\u0001\u001a\u0005\b\u0094\u0001\u0010UR!\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b$\u0010\u0088\u0001\u001a\u0005\b\u0095\u0001\u0010UR!\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0088\u0001\u001a\u0005\b\u0096\u0001\u0010UR!\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b'\u0010\u0088\u0001\u001a\u0005\b\u0097\u0001\u0010UR!\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b)\u0010\u0088\u0001\u001a\u0005\b\u0098\u0001\u0010UR-\u0010-\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b-\u0010\u0088\u0001\u001a\u0005\b\u0099\u0001\u0010UR!\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b/\u0010\u0088\u0001\u001a\u0005\b\u009a\u0001\u0010UR\u001b\u00100\u001a\u0004\u0018\u00010+8\u0006¢\u0006\u000e\n\u0005\b0\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010hR\u001b\u00102\u001a\u0004\u0018\u0001018\u0006¢\u0006\u000e\n\u0005\b2\u0010\u009d\u0001\u001a\u0005\b\u009e\u0001\u0010jR\u0019\u00104\u001a\u0002038\u0006¢\u0006\u000e\n\u0005\b4\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010lR\u0019\u00105\u001a\u00020+8\u0006¢\u0006\u000e\n\u0005\b5\u0010\u009b\u0001\u001a\u0005\b¡\u0001\u0010hR\u0018\u00106\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\b6\u0010{\u001a\u0005\b¢\u0001\u0010IR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010{\u001a\u0004\b7\u0010IR\u001b\u0010£\u0001\u001a\u00020s8\u0006¢\u0006\u000f\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0005\b¥\u0001\u0010uR\u001d\u0010¨\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u00010\u000b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b§\u0001\u0010PR\u0015\u0010¬\u0001\u001a\u00030©\u00018F¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u0015\u0010®\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010;R\u0013\u0010¯\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010IR\u001a\u0010²\u0001\u001a\t\u0012\u0005\u0012\u00030°\u00010\u000b8F¢\u0006\u0007\u001a\u0005\b±\u0001\u0010PR\u0013\u0010´\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b³\u0001\u0010K¨\u0006¶\u0001"}, m3636d2 = {"Lcom/robinhood/android/investFlow/InvestFlowViewState;", "", "Lcom/robinhood/android/recurring/contracts/investflow/AllocationStrategy;", "allocationProviderArgs", "", "forceDefaultAllocation", "Ljava/math/BigDecimal;", "initialMinOrderAmount", "skipForceSuitability", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "loggingParams", "", "Lcom/robinhood/android/investFlow/core/InvestFlowBasketItem;", "selectedItems", "Lcom/robinhood/models/util/Money;", "userEnteredAmount", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "selectedFrequency", "Lcom/robinhood/investflow/models/api/ApiAssetAllocation;", "assetAllocations", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;", "flowNavigationUiEvent", "Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "primaryPaymentMethod", "backupPaymentMethod", "Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;", "nbboResponse", "accountBuyingPower", "Lcom/robinhood/models/api/OrderRequest;", "failedOrderRequest", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "failedSchedule", "", "invalidAccountTypeUiEvent", "Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert;", "orderCheckUiEvent", "Lcom/robinhood/utils/resource/StringResource;", "errorToastUiEvent", "addedToastUiEvent", "Lcom/robinhood/android/investFlow/InvestFlowViewState$EmbeddedDetailData;", "showEmbeddedDetailUiEvent", "Lkotlin/Pair;", "", "Lcom/robinhood/models/db/EtpDetails;", "viewProspectusUiEvent", "", "errorEvent", "accountNumber", "Lcom/robinhood/models/db/Account;", "account", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;", "loggingAllocation", "loggingAccountType", "recurringOnly", "isRecurringUpsell", "<init>", "(Lcom/robinhood/android/recurring/contracts/investflow/AllocationStrategy;ZLjava/math/BigDecimal;ZLcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;Ljava/util/List;Lcom/robinhood/models/util/Money;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;Ljava/util/List;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/api/OrderRequest;Lcom/robinhood/recurring/models/db/InvestmentSchedule;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/lang/String;Lcom/robinhood/models/db/Account;Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;Ljava/lang/String;ZZ)V", "component7", "()Lcom/robinhood/models/util/Money;", "Lcom/robinhood/investflow/models/api/ApiInvestFlowPostBody;", "getOrderCheckPostBody", "()Lcom/robinhood/investflow/models/api/ApiInvestFlowPostBody;", "completedStep", "getNextFlowStep", "(Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;)Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;", "j$/time/LocalDate", "startDate", "mutateStartDate", "(Lj$/time/LocalDate;)Lcom/robinhood/android/investFlow/InvestFlowViewState;", "component1", "()Lcom/robinhood/android/recurring/contracts/investflow/AllocationStrategy;", "component2", "()Z", "component3", "()Ljava/math/BigDecimal;", "component4", "component5", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "component6", "()Ljava/util/List;", "component8", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "component9", "component10", "()Lcom/robinhood/udf/UiEvent;", "component11", "()Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "component12", "component13", "()Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;", "component14", "component15", "()Lcom/robinhood/models/api/OrderRequest;", "component16", "()Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "()Ljava/lang/String;", "component25", "()Lcom/robinhood/models/db/Account;", "component26", "()Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;", "component27", "component28", "component29", "copy", "(Lcom/robinhood/android/recurring/contracts/investflow/AllocationStrategy;ZLjava/math/BigDecimal;ZLcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;Ljava/util/List;Lcom/robinhood/models/util/Money;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;Ljava/util/List;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/api/OrderRequest;Lcom/robinhood/recurring/models/db/InvestmentSchedule;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Ljava/lang/String;Lcom/robinhood/models/db/Account;Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;Ljava/lang/String;ZZ)Lcom/robinhood/android/investFlow/InvestFlowViewState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/android/recurring/contracts/investflow/AllocationStrategy;", "getAllocationProviderArgs", "Z", "getForceDefaultAllocation", "Ljava/math/BigDecimal;", "getInitialMinOrderAmount", "getSkipForceSuitability", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowLoggingParams;", "getLoggingParams", "Ljava/util/List;", "getSelectedItems", "Lcom/robinhood/models/util/Money;", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "getSelectedFrequency", "getAssetAllocations", "Lcom/robinhood/udf/UiEvent;", "getFlowNavigationUiEvent", "Lcom/robinhood/android/investFlow/core/InvestFlowPaymentMethod;", "getPrimaryPaymentMethod", "getBackupPaymentMethod", "Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;", "getNbboResponse", "getAccountBuyingPower", "Lcom/robinhood/models/api/OrderRequest;", "getFailedOrderRequest", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "getFailedSchedule", "getInvalidAccountTypeUiEvent", "getOrderCheckUiEvent", "getErrorToastUiEvent", "getAddedToastUiEvent", "getShowEmbeddedDetailUiEvent", "getViewProspectusUiEvent", "getErrorEvent", "Ljava/lang/String;", "getAccountNumber", "Lcom/robinhood/models/db/Account;", "getAccount", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;", "getLoggingAllocation", "getLoggingAccountType", "getRecurringOnly", "numTargets", "I", "getNumTargets", "Lcom/robinhood/investflow/models/api/ApiInvestFlowRecurringSchedulePostBody;", "getRecurringSchedules", "recurringSchedules", "Lcom/robinhood/android/investFlow/core/InvestFlowCoreData;", "getCoreData", "()Lcom/robinhood/android/investFlow/core/InvestFlowCoreData;", "coreData", "getTotalAmount", "totalAmount", "isRecurring", "Ljava/util/UUID;", "getSelectedItemIds", "selectedItemIds", "getMinOrderAmount", "minOrderAmount", "EmbeddedDetailData", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowViewState {
    public static final int $stable = 8;
    private final Account account;
    private final Money accountBuyingPower;
    private final String accountNumber;
    private final UiEvent<InvestFlowBasketItem> addedToastUiEvent;
    private final AllocationStrategy allocationProviderArgs;
    private final List<ApiAssetAllocation> assetAllocations;
    private final InvestFlowPaymentMethod backupPaymentMethod;
    private final UiEvent<Throwable> errorEvent;
    private final UiEvent<StringResource> errorToastUiEvent;
    private final OrderRequest failedOrderRequest;
    private final InvestmentSchedule failedSchedule;
    private final UiEvent<InvestFlowStep> flowNavigationUiEvent;
    private final boolean forceDefaultAllocation;
    private final BigDecimal initialMinOrderAmount;
    private final UiEvent<Unit> invalidAccountTypeUiEvent;
    private final boolean isRecurringUpsell;
    private final String loggingAccountType;
    private final InvestFlowContext.Allocation loggingAllocation;
    private final InvestFlowLoggingParams loggingParams;
    private final ApiInvestFlowNbboResponse nbboResponse;
    private final int numTargets;
    private final UiEvent<VisibleEquityOrderChecksAlert> orderCheckUiEvent;
    private final InvestFlowPaymentMethod primaryPaymentMethod;
    private final boolean recurringOnly;
    private final InvestFlowFrequency selectedFrequency;
    private final List<InvestFlowBasketItem> selectedItems;
    private final UiEvent<EmbeddedDetailData> showEmbeddedDetailUiEvent;
    private final boolean skipForceSuitability;
    private final Money userEnteredAmount;
    private final UiEvent<Tuples2<String, EtpDetails>> viewProspectusUiEvent;

    /* renamed from: component7, reason: from getter */
    private final Money getUserEnteredAmount() {
        return this.userEnteredAmount;
    }

    public static /* synthetic */ InvestFlowViewState copy$default(InvestFlowViewState investFlowViewState, AllocationStrategy allocationStrategy, boolean z, BigDecimal bigDecimal, boolean z2, InvestFlowLoggingParams investFlowLoggingParams, List list, Money money, InvestFlowFrequency investFlowFrequency, List list2, UiEvent uiEvent, InvestFlowPaymentMethod investFlowPaymentMethod, InvestFlowPaymentMethod investFlowPaymentMethod2, ApiInvestFlowNbboResponse apiInvestFlowNbboResponse, Money money2, OrderRequest orderRequest, InvestmentSchedule investmentSchedule, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, UiEvent uiEvent6, UiEvent uiEvent7, UiEvent uiEvent8, String str, Account account, InvestFlowContext.Allocation allocation, String str2, boolean z3, boolean z4, int i, Object obj) {
        boolean z5;
        boolean z6;
        AllocationStrategy allocationStrategy2 = (i & 1) != 0 ? investFlowViewState.allocationProviderArgs : allocationStrategy;
        boolean z7 = (i & 2) != 0 ? investFlowViewState.forceDefaultAllocation : z;
        BigDecimal bigDecimal2 = (i & 4) != 0 ? investFlowViewState.initialMinOrderAmount : bigDecimal;
        boolean z8 = (i & 8) != 0 ? investFlowViewState.skipForceSuitability : z2;
        InvestFlowLoggingParams investFlowLoggingParams2 = (i & 16) != 0 ? investFlowViewState.loggingParams : investFlowLoggingParams;
        List list3 = (i & 32) != 0 ? investFlowViewState.selectedItems : list;
        Money money3 = (i & 64) != 0 ? investFlowViewState.userEnteredAmount : money;
        InvestFlowFrequency investFlowFrequency2 = (i & 128) != 0 ? investFlowViewState.selectedFrequency : investFlowFrequency;
        List list4 = (i & 256) != 0 ? investFlowViewState.assetAllocations : list2;
        UiEvent uiEvent9 = (i & 512) != 0 ? investFlowViewState.flowNavigationUiEvent : uiEvent;
        InvestFlowPaymentMethod investFlowPaymentMethod3 = (i & 1024) != 0 ? investFlowViewState.primaryPaymentMethod : investFlowPaymentMethod;
        InvestFlowPaymentMethod investFlowPaymentMethod4 = (i & 2048) != 0 ? investFlowViewState.backupPaymentMethod : investFlowPaymentMethod2;
        ApiInvestFlowNbboResponse apiInvestFlowNbboResponse2 = (i & 4096) != 0 ? investFlowViewState.nbboResponse : apiInvestFlowNbboResponse;
        Money money4 = (i & 8192) != 0 ? investFlowViewState.accountBuyingPower : money2;
        AllocationStrategy allocationStrategy3 = allocationStrategy2;
        OrderRequest orderRequest2 = (i & 16384) != 0 ? investFlowViewState.failedOrderRequest : orderRequest;
        InvestmentSchedule investmentSchedule2 = (i & 32768) != 0 ? investFlowViewState.failedSchedule : investmentSchedule;
        UiEvent uiEvent10 = (i & 65536) != 0 ? investFlowViewState.invalidAccountTypeUiEvent : uiEvent2;
        UiEvent uiEvent11 = (i & 131072) != 0 ? investFlowViewState.orderCheckUiEvent : uiEvent3;
        UiEvent uiEvent12 = (i & 262144) != 0 ? investFlowViewState.errorToastUiEvent : uiEvent4;
        UiEvent uiEvent13 = (i & 524288) != 0 ? investFlowViewState.addedToastUiEvent : uiEvent5;
        UiEvent uiEvent14 = (i & 1048576) != 0 ? investFlowViewState.showEmbeddedDetailUiEvent : uiEvent6;
        UiEvent uiEvent15 = (i & 2097152) != 0 ? investFlowViewState.viewProspectusUiEvent : uiEvent7;
        UiEvent uiEvent16 = (i & 4194304) != 0 ? investFlowViewState.errorEvent : uiEvent8;
        String str3 = (i & 8388608) != 0 ? investFlowViewState.accountNumber : str;
        Account account2 = (i & 16777216) != 0 ? investFlowViewState.account : account;
        InvestFlowContext.Allocation allocation2 = (i & 33554432) != 0 ? investFlowViewState.loggingAllocation : allocation;
        String str4 = (i & 67108864) != 0 ? investFlowViewState.loggingAccountType : str2;
        boolean z9 = (i & 134217728) != 0 ? investFlowViewState.recurringOnly : z3;
        if ((i & 268435456) != 0) {
            z6 = z9;
            z5 = investFlowViewState.isRecurringUpsell;
        } else {
            z5 = z4;
            z6 = z9;
        }
        return investFlowViewState.copy(allocationStrategy3, z7, bigDecimal2, z8, investFlowLoggingParams2, list3, money3, investFlowFrequency2, list4, uiEvent9, investFlowPaymentMethod3, investFlowPaymentMethod4, apiInvestFlowNbboResponse2, money4, orderRequest2, investmentSchedule2, uiEvent10, uiEvent11, uiEvent12, uiEvent13, uiEvent14, uiEvent15, uiEvent16, str3, account2, allocation2, str4, z6, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final AllocationStrategy getAllocationProviderArgs() {
        return this.allocationProviderArgs;
    }

    public final UiEvent<InvestFlowStep> component10() {
        return this.flowNavigationUiEvent;
    }

    /* renamed from: component11, reason: from getter */
    public final InvestFlowPaymentMethod getPrimaryPaymentMethod() {
        return this.primaryPaymentMethod;
    }

    /* renamed from: component12, reason: from getter */
    public final InvestFlowPaymentMethod getBackupPaymentMethod() {
        return this.backupPaymentMethod;
    }

    /* renamed from: component13, reason: from getter */
    public final ApiInvestFlowNbboResponse getNbboResponse() {
        return this.nbboResponse;
    }

    /* renamed from: component14, reason: from getter */
    public final Money getAccountBuyingPower() {
        return this.accountBuyingPower;
    }

    /* renamed from: component15, reason: from getter */
    public final OrderRequest getFailedOrderRequest() {
        return this.failedOrderRequest;
    }

    /* renamed from: component16, reason: from getter */
    public final InvestmentSchedule getFailedSchedule() {
        return this.failedSchedule;
    }

    public final UiEvent<Unit> component17() {
        return this.invalidAccountTypeUiEvent;
    }

    public final UiEvent<VisibleEquityOrderChecksAlert> component18() {
        return this.orderCheckUiEvent;
    }

    public final UiEvent<StringResource> component19() {
        return this.errorToastUiEvent;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getForceDefaultAllocation() {
        return this.forceDefaultAllocation;
    }

    public final UiEvent<InvestFlowBasketItem> component20() {
        return this.addedToastUiEvent;
    }

    public final UiEvent<EmbeddedDetailData> component21() {
        return this.showEmbeddedDetailUiEvent;
    }

    public final UiEvent<Tuples2<String, EtpDetails>> component22() {
        return this.viewProspectusUiEvent;
    }

    public final UiEvent<Throwable> component23() {
        return this.errorEvent;
    }

    /* renamed from: component24, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component25, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component26, reason: from getter */
    public final InvestFlowContext.Allocation getLoggingAllocation() {
        return this.loggingAllocation;
    }

    /* renamed from: component27, reason: from getter */
    public final String getLoggingAccountType() {
        return this.loggingAccountType;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getRecurringOnly() {
        return this.recurringOnly;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getIsRecurringUpsell() {
        return this.isRecurringUpsell;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getInitialMinOrderAmount() {
        return this.initialMinOrderAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSkipForceSuitability() {
        return this.skipForceSuitability;
    }

    /* renamed from: component5, reason: from getter */
    public final InvestFlowLoggingParams getLoggingParams() {
        return this.loggingParams;
    }

    public final List<InvestFlowBasketItem> component6() {
        return this.selectedItems;
    }

    /* renamed from: component8, reason: from getter */
    public final InvestFlowFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public final List<ApiAssetAllocation> component9() {
        return this.assetAllocations;
    }

    public final InvestFlowViewState copy(AllocationStrategy allocationProviderArgs, boolean forceDefaultAllocation, BigDecimal initialMinOrderAmount, boolean skipForceSuitability, InvestFlowLoggingParams loggingParams, List<? extends InvestFlowBasketItem> selectedItems, Money userEnteredAmount, InvestFlowFrequency selectedFrequency, List<ApiAssetAllocation> assetAllocations, UiEvent<InvestFlowStep> flowNavigationUiEvent, InvestFlowPaymentMethod primaryPaymentMethod, InvestFlowPaymentMethod backupPaymentMethod, ApiInvestFlowNbboResponse nbboResponse, Money accountBuyingPower, OrderRequest failedOrderRequest, InvestmentSchedule failedSchedule, UiEvent<Unit> invalidAccountTypeUiEvent, UiEvent<VisibleEquityOrderChecksAlert> orderCheckUiEvent, UiEvent<StringResource> errorToastUiEvent, UiEvent<InvestFlowBasketItem> addedToastUiEvent, UiEvent<EmbeddedDetailData> showEmbeddedDetailUiEvent, UiEvent<Tuples2<String, EtpDetails>> viewProspectusUiEvent, UiEvent<Throwable> errorEvent, String accountNumber, Account account, InvestFlowContext.Allocation loggingAllocation, String loggingAccountType, boolean recurringOnly, boolean isRecurringUpsell) {
        Intrinsics.checkNotNullParameter(allocationProviderArgs, "allocationProviderArgs");
        Intrinsics.checkNotNullParameter(initialMinOrderAmount, "initialMinOrderAmount");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        Intrinsics.checkNotNullParameter(loggingAllocation, "loggingAllocation");
        Intrinsics.checkNotNullParameter(loggingAccountType, "loggingAccountType");
        return new InvestFlowViewState(allocationProviderArgs, forceDefaultAllocation, initialMinOrderAmount, skipForceSuitability, loggingParams, selectedItems, userEnteredAmount, selectedFrequency, assetAllocations, flowNavigationUiEvent, primaryPaymentMethod, backupPaymentMethod, nbboResponse, accountBuyingPower, failedOrderRequest, failedSchedule, invalidAccountTypeUiEvent, orderCheckUiEvent, errorToastUiEvent, addedToastUiEvent, showEmbeddedDetailUiEvent, viewProspectusUiEvent, errorEvent, accountNumber, account, loggingAllocation, loggingAccountType, recurringOnly, isRecurringUpsell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowViewState)) {
            return false;
        }
        InvestFlowViewState investFlowViewState = (InvestFlowViewState) other;
        return Intrinsics.areEqual(this.allocationProviderArgs, investFlowViewState.allocationProviderArgs) && this.forceDefaultAllocation == investFlowViewState.forceDefaultAllocation && Intrinsics.areEqual(this.initialMinOrderAmount, investFlowViewState.initialMinOrderAmount) && this.skipForceSuitability == investFlowViewState.skipForceSuitability && Intrinsics.areEqual(this.loggingParams, investFlowViewState.loggingParams) && Intrinsics.areEqual(this.selectedItems, investFlowViewState.selectedItems) && Intrinsics.areEqual(this.userEnteredAmount, investFlowViewState.userEnteredAmount) && Intrinsics.areEqual(this.selectedFrequency, investFlowViewState.selectedFrequency) && Intrinsics.areEqual(this.assetAllocations, investFlowViewState.assetAllocations) && Intrinsics.areEqual(this.flowNavigationUiEvent, investFlowViewState.flowNavigationUiEvent) && Intrinsics.areEqual(this.primaryPaymentMethod, investFlowViewState.primaryPaymentMethod) && Intrinsics.areEqual(this.backupPaymentMethod, investFlowViewState.backupPaymentMethod) && Intrinsics.areEqual(this.nbboResponse, investFlowViewState.nbboResponse) && Intrinsics.areEqual(this.accountBuyingPower, investFlowViewState.accountBuyingPower) && Intrinsics.areEqual(this.failedOrderRequest, investFlowViewState.failedOrderRequest) && Intrinsics.areEqual(this.failedSchedule, investFlowViewState.failedSchedule) && Intrinsics.areEqual(this.invalidAccountTypeUiEvent, investFlowViewState.invalidAccountTypeUiEvent) && Intrinsics.areEqual(this.orderCheckUiEvent, investFlowViewState.orderCheckUiEvent) && Intrinsics.areEqual(this.errorToastUiEvent, investFlowViewState.errorToastUiEvent) && Intrinsics.areEqual(this.addedToastUiEvent, investFlowViewState.addedToastUiEvent) && Intrinsics.areEqual(this.showEmbeddedDetailUiEvent, investFlowViewState.showEmbeddedDetailUiEvent) && Intrinsics.areEqual(this.viewProspectusUiEvent, investFlowViewState.viewProspectusUiEvent) && Intrinsics.areEqual(this.errorEvent, investFlowViewState.errorEvent) && Intrinsics.areEqual(this.accountNumber, investFlowViewState.accountNumber) && Intrinsics.areEqual(this.account, investFlowViewState.account) && this.loggingAllocation == investFlowViewState.loggingAllocation && Intrinsics.areEqual(this.loggingAccountType, investFlowViewState.loggingAccountType) && this.recurringOnly == investFlowViewState.recurringOnly && this.isRecurringUpsell == investFlowViewState.isRecurringUpsell;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.allocationProviderArgs.hashCode() * 31) + Boolean.hashCode(this.forceDefaultAllocation)) * 31) + this.initialMinOrderAmount.hashCode()) * 31) + Boolean.hashCode(this.skipForceSuitability)) * 31) + this.loggingParams.hashCode()) * 31) + this.selectedItems.hashCode()) * 31;
        Money money = this.userEnteredAmount;
        int iHashCode2 = (iHashCode + (money == null ? 0 : money.hashCode())) * 31;
        InvestFlowFrequency investFlowFrequency = this.selectedFrequency;
        int iHashCode3 = (((iHashCode2 + (investFlowFrequency == null ? 0 : investFlowFrequency.hashCode())) * 31) + this.assetAllocations.hashCode()) * 31;
        UiEvent<InvestFlowStep> uiEvent = this.flowNavigationUiEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        InvestFlowPaymentMethod investFlowPaymentMethod = this.primaryPaymentMethod;
        int iHashCode5 = (iHashCode4 + (investFlowPaymentMethod == null ? 0 : investFlowPaymentMethod.hashCode())) * 31;
        InvestFlowPaymentMethod investFlowPaymentMethod2 = this.backupPaymentMethod;
        int iHashCode6 = (iHashCode5 + (investFlowPaymentMethod2 == null ? 0 : investFlowPaymentMethod2.hashCode())) * 31;
        ApiInvestFlowNbboResponse apiInvestFlowNbboResponse = this.nbboResponse;
        int iHashCode7 = (iHashCode6 + (apiInvestFlowNbboResponse == null ? 0 : apiInvestFlowNbboResponse.hashCode())) * 31;
        Money money2 = this.accountBuyingPower;
        int iHashCode8 = (iHashCode7 + (money2 == null ? 0 : money2.hashCode())) * 31;
        OrderRequest orderRequest = this.failedOrderRequest;
        int iHashCode9 = (iHashCode8 + (orderRequest == null ? 0 : orderRequest.hashCode())) * 31;
        InvestmentSchedule investmentSchedule = this.failedSchedule;
        int iHashCode10 = (iHashCode9 + (investmentSchedule == null ? 0 : investmentSchedule.hashCode())) * 31;
        UiEvent<Unit> uiEvent2 = this.invalidAccountTypeUiEvent;
        int iHashCode11 = (iHashCode10 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<VisibleEquityOrderChecksAlert> uiEvent3 = this.orderCheckUiEvent;
        int iHashCode12 = (iHashCode11 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<StringResource> uiEvent4 = this.errorToastUiEvent;
        int iHashCode13 = (iHashCode12 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31;
        UiEvent<InvestFlowBasketItem> uiEvent5 = this.addedToastUiEvent;
        int iHashCode14 = (iHashCode13 + (uiEvent5 == null ? 0 : uiEvent5.hashCode())) * 31;
        UiEvent<EmbeddedDetailData> uiEvent6 = this.showEmbeddedDetailUiEvent;
        int iHashCode15 = (iHashCode14 + (uiEvent6 == null ? 0 : uiEvent6.hashCode())) * 31;
        UiEvent<Tuples2<String, EtpDetails>> uiEvent7 = this.viewProspectusUiEvent;
        int iHashCode16 = (iHashCode15 + (uiEvent7 == null ? 0 : uiEvent7.hashCode())) * 31;
        UiEvent<Throwable> uiEvent8 = this.errorEvent;
        int iHashCode17 = (iHashCode16 + (uiEvent8 == null ? 0 : uiEvent8.hashCode())) * 31;
        String str = this.accountNumber;
        int iHashCode18 = (iHashCode17 + (str == null ? 0 : str.hashCode())) * 31;
        Account account = this.account;
        return ((((((((iHashCode18 + (account != null ? account.hashCode() : 0)) * 31) + this.loggingAllocation.hashCode()) * 31) + this.loggingAccountType.hashCode()) * 31) + Boolean.hashCode(this.recurringOnly)) * 31) + Boolean.hashCode(this.isRecurringUpsell);
    }

    public String toString() {
        return "InvestFlowViewState(allocationProviderArgs=" + this.allocationProviderArgs + ", forceDefaultAllocation=" + this.forceDefaultAllocation + ", initialMinOrderAmount=" + this.initialMinOrderAmount + ", skipForceSuitability=" + this.skipForceSuitability + ", loggingParams=" + this.loggingParams + ", selectedItems=" + this.selectedItems + ", userEnteredAmount=" + this.userEnteredAmount + ", selectedFrequency=" + this.selectedFrequency + ", assetAllocations=" + this.assetAllocations + ", flowNavigationUiEvent=" + this.flowNavigationUiEvent + ", primaryPaymentMethod=" + this.primaryPaymentMethod + ", backupPaymentMethod=" + this.backupPaymentMethod + ", nbboResponse=" + this.nbboResponse + ", accountBuyingPower=" + this.accountBuyingPower + ", failedOrderRequest=" + this.failedOrderRequest + ", failedSchedule=" + this.failedSchedule + ", invalidAccountTypeUiEvent=" + this.invalidAccountTypeUiEvent + ", orderCheckUiEvent=" + this.orderCheckUiEvent + ", errorToastUiEvent=" + this.errorToastUiEvent + ", addedToastUiEvent=" + this.addedToastUiEvent + ", showEmbeddedDetailUiEvent=" + this.showEmbeddedDetailUiEvent + ", viewProspectusUiEvent=" + this.viewProspectusUiEvent + ", errorEvent=" + this.errorEvent + ", accountNumber=" + this.accountNumber + ", account=" + this.account + ", loggingAllocation=" + this.loggingAllocation + ", loggingAccountType=" + this.loggingAccountType + ", recurringOnly=" + this.recurringOnly + ", isRecurringUpsell=" + this.isRecurringUpsell + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InvestFlowViewState(AllocationStrategy allocationProviderArgs, boolean z, BigDecimal initialMinOrderAmount, boolean z2, InvestFlowLoggingParams loggingParams, List<? extends InvestFlowBasketItem> selectedItems, Money money, InvestFlowFrequency investFlowFrequency, List<ApiAssetAllocation> assetAllocations, UiEvent<InvestFlowStep> uiEvent, InvestFlowPaymentMethod investFlowPaymentMethod, InvestFlowPaymentMethod investFlowPaymentMethod2, ApiInvestFlowNbboResponse apiInvestFlowNbboResponse, Money money2, OrderRequest orderRequest, InvestmentSchedule investmentSchedule, UiEvent<Unit> uiEvent2, UiEvent<VisibleEquityOrderChecksAlert> uiEvent3, UiEvent<StringResource> uiEvent4, UiEvent<InvestFlowBasketItem> uiEvent5, UiEvent<EmbeddedDetailData> uiEvent6, UiEvent<Tuples2<String, EtpDetails>> uiEvent7, UiEvent<Throwable> uiEvent8, String str, Account account, InvestFlowContext.Allocation loggingAllocation, String loggingAccountType, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(allocationProviderArgs, "allocationProviderArgs");
        Intrinsics.checkNotNullParameter(initialMinOrderAmount, "initialMinOrderAmount");
        Intrinsics.checkNotNullParameter(loggingParams, "loggingParams");
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        Intrinsics.checkNotNullParameter(loggingAllocation, "loggingAllocation");
        Intrinsics.checkNotNullParameter(loggingAccountType, "loggingAccountType");
        this.allocationProviderArgs = allocationProviderArgs;
        this.forceDefaultAllocation = z;
        this.initialMinOrderAmount = initialMinOrderAmount;
        this.skipForceSuitability = z2;
        this.loggingParams = loggingParams;
        this.selectedItems = selectedItems;
        this.userEnteredAmount = money;
        this.selectedFrequency = investFlowFrequency;
        this.assetAllocations = assetAllocations;
        this.flowNavigationUiEvent = uiEvent;
        this.primaryPaymentMethod = investFlowPaymentMethod;
        this.backupPaymentMethod = investFlowPaymentMethod2;
        this.nbboResponse = apiInvestFlowNbboResponse;
        this.accountBuyingPower = money2;
        this.failedOrderRequest = orderRequest;
        this.failedSchedule = investmentSchedule;
        this.invalidAccountTypeUiEvent = uiEvent2;
        this.orderCheckUiEvent = uiEvent3;
        this.errorToastUiEvent = uiEvent4;
        this.addedToastUiEvent = uiEvent5;
        this.showEmbeddedDetailUiEvent = uiEvent6;
        this.viewProspectusUiEvent = uiEvent7;
        this.errorEvent = uiEvent8;
        this.accountNumber = str;
        this.account = account;
        this.loggingAllocation = loggingAllocation;
        this.loggingAccountType = loggingAccountType;
        this.recurringOnly = z3;
        this.isRecurringUpsell = z4;
        this.numTargets = selectedItems.size();
    }

    public final AllocationStrategy getAllocationProviderArgs() {
        return this.allocationProviderArgs;
    }

    public final boolean getForceDefaultAllocation() {
        return this.forceDefaultAllocation;
    }

    public final BigDecimal getInitialMinOrderAmount() {
        return this.initialMinOrderAmount;
    }

    public final boolean getSkipForceSuitability() {
        return this.skipForceSuitability;
    }

    public /* synthetic */ InvestFlowViewState(AllocationStrategy allocationStrategy, boolean z, BigDecimal bigDecimal, boolean z2, InvestFlowLoggingParams investFlowLoggingParams, List list, Money money, InvestFlowFrequency investFlowFrequency, List list2, UiEvent uiEvent, InvestFlowPaymentMethod investFlowPaymentMethod, InvestFlowPaymentMethod investFlowPaymentMethod2, ApiInvestFlowNbboResponse apiInvestFlowNbboResponse, Money money2, OrderRequest orderRequest, InvestmentSchedule investmentSchedule, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, UiEvent uiEvent6, UiEvent uiEvent7, UiEvent uiEvent8, String str, Account account, InvestFlowContext.Allocation allocation, String str2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(allocationStrategy, z, bigDecimal, z2, (i & 16) != 0 ? new InvestFlowLoggingParams(null, null, 3, null) : investFlowLoggingParams, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? null : money, (i & 128) != 0 ? null : investFlowFrequency, (i & 256) != 0 ? CollectionsKt.emptyList() : list2, (i & 512) != 0 ? null : uiEvent, (i & 1024) != 0 ? null : investFlowPaymentMethod, (i & 2048) != 0 ? null : investFlowPaymentMethod2, (i & 4096) != 0 ? null : apiInvestFlowNbboResponse, (i & 8192) != 0 ? null : money2, (i & 16384) != 0 ? null : orderRequest, (32768 & i) != 0 ? null : investmentSchedule, (65536 & i) != 0 ? null : uiEvent2, (131072 & i) != 0 ? null : uiEvent3, (262144 & i) != 0 ? null : uiEvent4, (524288 & i) != 0 ? null : uiEvent5, (1048576 & i) != 0 ? null : uiEvent6, (2097152 & i) != 0 ? null : uiEvent7, (4194304 & i) != 0 ? null : uiEvent8, (8388608 & i) != 0 ? null : str, (16777216 & i) != 0 ? null : account, (33554432 & i) != 0 ? InvestFlowContext.Allocation.DEFAULT : allocation, (67108864 & i) != 0 ? "" : str2, (134217728 & i) != 0 ? false : z3, (i & 268435456) != 0 ? false : z4);
    }

    public final InvestFlowLoggingParams getLoggingParams() {
        return this.loggingParams;
    }

    public final List<InvestFlowBasketItem> getSelectedItems() {
        return this.selectedItems;
    }

    public final InvestFlowFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public final List<ApiAssetAllocation> getAssetAllocations() {
        return this.assetAllocations;
    }

    public final UiEvent<InvestFlowStep> getFlowNavigationUiEvent() {
        return this.flowNavigationUiEvent;
    }

    public final InvestFlowPaymentMethod getPrimaryPaymentMethod() {
        return this.primaryPaymentMethod;
    }

    public final InvestFlowPaymentMethod getBackupPaymentMethod() {
        return this.backupPaymentMethod;
    }

    public final ApiInvestFlowNbboResponse getNbboResponse() {
        return this.nbboResponse;
    }

    public final Money getAccountBuyingPower() {
        return this.accountBuyingPower;
    }

    public final OrderRequest getFailedOrderRequest() {
        return this.failedOrderRequest;
    }

    public final InvestmentSchedule getFailedSchedule() {
        return this.failedSchedule;
    }

    public final UiEvent<Unit> getInvalidAccountTypeUiEvent() {
        return this.invalidAccountTypeUiEvent;
    }

    public final UiEvent<VisibleEquityOrderChecksAlert> getOrderCheckUiEvent() {
        return this.orderCheckUiEvent;
    }

    public final UiEvent<StringResource> getErrorToastUiEvent() {
        return this.errorToastUiEvent;
    }

    public final UiEvent<InvestFlowBasketItem> getAddedToastUiEvent() {
        return this.addedToastUiEvent;
    }

    public final UiEvent<EmbeddedDetailData> getShowEmbeddedDetailUiEvent() {
        return this.showEmbeddedDetailUiEvent;
    }

    public final UiEvent<Tuples2<String, EtpDetails>> getViewProspectusUiEvent() {
        return this.viewProspectusUiEvent;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final InvestFlowContext.Allocation getLoggingAllocation() {
        return this.loggingAllocation;
    }

    public final String getLoggingAccountType() {
        return this.loggingAccountType;
    }

    public final boolean getRecurringOnly() {
        return this.recurringOnly;
    }

    public final boolean isRecurringUpsell() {
        return this.isRecurringUpsell;
    }

    public final InvestFlowCoreData getCoreData() {
        return new InvestFlowCoreData(this.userEnteredAmount, this.selectedFrequency, this.primaryPaymentMethod, this.backupPaymentMethod, this.selectedItems);
    }

    public final Money getTotalAmount() {
        if (this.assetAllocations.isEmpty()) {
            return this.userEnteredAmount;
        }
        Iterator<T> it = this.assetAllocations.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Money dollar = ((ApiAssetAllocation) it.next()).getDollar();
        Intrinsics.checkNotNull(dollar);
        while (it.hasNext()) {
            Money dollar2 = ((ApiAssetAllocation) it.next()).getDollar();
            Intrinsics.checkNotNull(dollar2);
            dollar = dollar.plus(dollar2);
        }
        return dollar;
    }

    public final boolean isRecurring() {
        return this.selectedFrequency instanceof InvestFlowFrequency.Recurring;
    }

    public final int getNumTargets() {
        return this.numTargets;
    }

    public final List<UUID> getSelectedItemIds() {
        List<InvestFlowBasketItem> list = this.selectedItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InvestFlowBasketItem) it.next()).getId());
        }
        return arrayList;
    }

    public final BigDecimal getMinOrderAmount() {
        return (BigDecimal) ComparisonsKt.maxOf(this.initialMinOrderAmount, new BigDecimal(this.selectedItems.size()));
    }

    public final ApiInvestFlowPostBody getOrderCheckPostBody() {
        List<ApiAssetAllocation> list = this.assetAllocations;
        Account account = this.account;
        String accountNumber = account != null ? account.getAccountNumber() : null;
        Money totalAmount = getTotalAmount();
        Intrinsics.checkNotNull(totalAmount);
        List<ApiInvestFlowRecurringSchedulePostBody> recurringSchedules = getRecurringSchedules();
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        return new ApiInvestFlowPostBody(list, accountNumber, totalAmount, recurringSchedules, uuidRandomUUID, null, 32, null);
    }

    private final List<ApiInvestFlowRecurringSchedulePostBody> getRecurringSchedules() {
        InvestFlowFrequency investFlowFrequency = this.selectedFrequency;
        if (investFlowFrequency instanceof InvestFlowFrequency.Recurring) {
            InvestFlowPaymentMethod investFlowPaymentMethod = this.primaryPaymentMethod;
            Intrinsics.checkNotNull(investFlowPaymentMethod);
            ApiInvestmentSchedule.SourceOfFunds sourceOfFunds = investFlowPaymentMethod.getSourceOfFunds();
            InvestFlowPaymentMethod investFlowPaymentMethod2 = this.backupPaymentMethod;
            UUID id = null;
            ApiInvestmentSchedule.SourceOfFunds sourceOfFunds2 = investFlowPaymentMethod2 != null ? investFlowPaymentMethod2.getSourceOfFunds() : null;
            LocalDate startDate = ((InvestFlowFrequency.Recurring) this.selectedFrequency).getStartDate();
            ApiInvestmentSchedule.Frequency frequency = ((InvestFlowFrequency.Recurring) this.selectedFrequency).getFrequency();
            InvestFlowPaymentMethod investFlowPaymentMethod3 = this.primaryPaymentMethod;
            if (investFlowPaymentMethod3 instanceof InvestFlowPaymentMethod.Ach) {
                id = ((InvestFlowPaymentMethod.Ach) investFlowPaymentMethod3).getAchRelationship().getId();
            } else {
                InvestFlowPaymentMethod investFlowPaymentMethod4 = this.backupPaymentMethod;
                if (investFlowPaymentMethod4 instanceof InvestFlowPaymentMethod.Ach) {
                    id = ((InvestFlowPaymentMethod.Ach) investFlowPaymentMethod4).getAchRelationship().getId();
                }
            }
            return CollectionsKt.listOf(new ApiInvestFlowRecurringSchedulePostBody(sourceOfFunds, sourceOfFunds2, startDate, frequency, id));
        }
        if (investFlowFrequency instanceof InvestFlowFrequency.Once) {
            return CollectionsKt.emptyList();
        }
        if (investFlowFrequency != null) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("selectedFrequency cannot be null when submitting an order");
    }

    public final InvestFlowStep getNextFlowStep(InvestFlowStep completedStep) {
        Intrinsics.checkNotNullParameter(completedStep, "completedStep");
        if (Intrinsics.areEqual(completedStep, InvestFlowStep.Discovery.INSTANCE)) {
            return InvestFlowStep.Frequency.INSTANCE;
        }
        InvestFlowStep.Frequency frequency = InvestFlowStep.Frequency.INSTANCE;
        if (Intrinsics.areEqual(completedStep, frequency)) {
            return this.selectedFrequency != null ? InvestFlowStep.Amount.INSTANCE : frequency;
        }
        if (Intrinsics.areEqual(completedStep, InvestFlowStep.Amount.INSTANCE)) {
            if (this.selectedItems.size() == 1) {
                InvestFlowFrequency investFlowFrequency = this.selectedFrequency;
                if (investFlowFrequency instanceof InvestFlowFrequency.Once) {
                    return InvestFlowStep.OneTimeSingleSubmit.INSTANCE;
                }
                if (investFlowFrequency instanceof InvestFlowFrequency.Recurring) {
                    return InvestFlowStep.PaymentMethod.INSTANCE;
                }
                if (investFlowFrequency != null) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("selectedFrequency cannot be null when entering an amount");
            }
            if (this.forceDefaultAllocation) {
                return getNextFlowStep(InvestFlowStep.Allocation.INSTANCE);
            }
            return InvestFlowStep.Allocation.INSTANCE;
        }
        if (Intrinsics.areEqual(completedStep, InvestFlowStep.Allocation.INSTANCE)) {
            InvestFlowFrequency investFlowFrequency2 = this.selectedFrequency;
            if (investFlowFrequency2 instanceof InvestFlowFrequency.Once) {
                return InvestFlowStep.OneTimeMultiple.INSTANCE;
            }
            if (investFlowFrequency2 instanceof InvestFlowFrequency.Recurring) {
                return InvestFlowStep.PaymentMethod.INSTANCE;
            }
            if (investFlowFrequency2 != null) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("selectedFrequency cannot be null when entering an allocation");
        }
        if (Intrinsics.areEqual(completedStep, InvestFlowStep.PaymentMethod.INSTANCE)) {
            if (this.primaryPaymentMethod instanceof InvestFlowPaymentMethod.BuyingPower) {
                return InvestFlowStep.BackupPaymentMethod.INSTANCE;
            }
            return InvestFlowStep.RecurringSettings.INSTANCE;
        }
        if (Intrinsics.areEqual(completedStep, InvestFlowStep.BackupPaymentMethod.INSTANCE)) {
            return InvestFlowStep.RecurringSettings.INSTANCE;
        }
        if (Intrinsics.areEqual(completedStep, InvestFlowStep.OneTimeMultiple.INSTANCE)) {
            return InvestFlowStep.OneTimeMultipleSubmit.INSTANCE;
        }
        if (Intrinsics.areEqual(completedStep, InvestFlowStep.RecurringSettings.INSTANCE)) {
            return InvestFlowStep.RecurringSubmit.INSTANCE;
        }
        if (Intrinsics.areEqual(completedStep, InvestFlowStep.OneTimeSingleSubmit.INSTANCE) || Intrinsics.areEqual(completedStep, InvestFlowStep.OneTimeMultipleSubmit.INSTANCE) || Intrinsics.areEqual(completedStep, InvestFlowStep.RecurringSubmit.INSTANCE)) {
            return InvestFlowStep.Complete.INSTANCE;
        }
        if (Intrinsics.areEqual(completedStep, InvestFlowStep.Complete.INSTANCE)) {
            throw new IllegalStateException("no next step in invest flow");
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InvestFlowViewState mutateStartDate(LocalDate startDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        InvestFlowFrequency investFlowFrequency = this.selectedFrequency;
        if (investFlowFrequency instanceof InvestFlowFrequency.Recurring) {
            return copy$default(this, null, false, null, false, null, null, null, InvestFlowFrequency.Recurring.copy$default((InvestFlowFrequency.Recurring) investFlowFrequency, null, startDate, 1, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 536870783, null);
        }
        if (Intrinsics.areEqual(investFlowFrequency, InvestFlowFrequency.Once.INSTANCE) || investFlowFrequency == null) {
            return this;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: InvestFlowViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/investFlow/InvestFlowViewState$EmbeddedDetailData;", "", "apiAssetType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "id", "Ljava/util/UUID;", "inBasket", "", "basketFull", "onPrimaryButtonClicked", "Lkotlin/Function1;", "", "<init>", "(Lcom/robinhood/recurring/models/api/ApiAssetType;Ljava/util/UUID;ZZLkotlin/jvm/functions/Function1;)V", "getApiAssetType", "()Lcom/robinhood/recurring/models/api/ApiAssetType;", "getId", "()Ljava/util/UUID;", "getInBasket", "()Z", "getBasketFull", "getOnPrimaryButtonClicked", "()Lkotlin/jvm/functions/Function1;", "isCrypto", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EmbeddedDetailData {
        public static final int $stable = 8;
        private final ApiAssetType apiAssetType;
        private final boolean basketFull;
        private final UUID id;
        private final boolean inBasket;
        private final Function1<UUID, Unit> onPrimaryButtonClicked;

        public static /* synthetic */ EmbeddedDetailData copy$default(EmbeddedDetailData embeddedDetailData, ApiAssetType apiAssetType, UUID uuid, boolean z, boolean z2, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                apiAssetType = embeddedDetailData.apiAssetType;
            }
            if ((i & 2) != 0) {
                uuid = embeddedDetailData.id;
            }
            if ((i & 4) != 0) {
                z = embeddedDetailData.inBasket;
            }
            if ((i & 8) != 0) {
                z2 = embeddedDetailData.basketFull;
            }
            if ((i & 16) != 0) {
                function1 = embeddedDetailData.onPrimaryButtonClicked;
            }
            Function1 function12 = function1;
            boolean z3 = z;
            return embeddedDetailData.copy(apiAssetType, uuid, z3, z2, function12);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiAssetType getApiAssetType() {
            return this.apiAssetType;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getInBasket() {
            return this.inBasket;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getBasketFull() {
            return this.basketFull;
        }

        public final Function1<UUID, Unit> component5() {
            return this.onPrimaryButtonClicked;
        }

        public final EmbeddedDetailData copy(ApiAssetType apiAssetType, UUID id, boolean inBasket, boolean basketFull, Function1<? super UUID, Unit> onPrimaryButtonClicked) {
            Intrinsics.checkNotNullParameter(apiAssetType, "apiAssetType");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(onPrimaryButtonClicked, "onPrimaryButtonClicked");
            return new EmbeddedDetailData(apiAssetType, id, inBasket, basketFull, onPrimaryButtonClicked);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmbeddedDetailData)) {
                return false;
            }
            EmbeddedDetailData embeddedDetailData = (EmbeddedDetailData) other;
            return this.apiAssetType == embeddedDetailData.apiAssetType && Intrinsics.areEqual(this.id, embeddedDetailData.id) && this.inBasket == embeddedDetailData.inBasket && this.basketFull == embeddedDetailData.basketFull && Intrinsics.areEqual(this.onPrimaryButtonClicked, embeddedDetailData.onPrimaryButtonClicked);
        }

        public int hashCode() {
            return (((((((this.apiAssetType.hashCode() * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.inBasket)) * 31) + Boolean.hashCode(this.basketFull)) * 31) + this.onPrimaryButtonClicked.hashCode();
        }

        public String toString() {
            return "EmbeddedDetailData(apiAssetType=" + this.apiAssetType + ", id=" + this.id + ", inBasket=" + this.inBasket + ", basketFull=" + this.basketFull + ", onPrimaryButtonClicked=" + this.onPrimaryButtonClicked + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public EmbeddedDetailData(ApiAssetType apiAssetType, UUID id, boolean z, boolean z2, Function1<? super UUID, Unit> onPrimaryButtonClicked) {
            Intrinsics.checkNotNullParameter(apiAssetType, "apiAssetType");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(onPrimaryButtonClicked, "onPrimaryButtonClicked");
            this.apiAssetType = apiAssetType;
            this.id = id;
            this.inBasket = z;
            this.basketFull = z2;
            this.onPrimaryButtonClicked = onPrimaryButtonClicked;
        }

        public final ApiAssetType getApiAssetType() {
            return this.apiAssetType;
        }

        public final UUID getId() {
            return this.id;
        }

        public final boolean getInBasket() {
            return this.inBasket;
        }

        public final boolean getBasketFull() {
            return this.basketFull;
        }

        public final Function1<UUID, Unit> getOnPrimaryButtonClicked() {
            return this.onPrimaryButtonClicked;
        }

        public final boolean isCrypto() {
            return this.apiAssetType == ApiAssetType.CRYPTO;
        }
    }
}
