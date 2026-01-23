package com.robinhood.store.event;

import com.robinhood.android.eventcontracts.experiments.EventContractsBffMigrationExperiment;
import com.robinhood.android.eventcontracts.experiments.GameDetailPageExperiment;
import com.robinhood.android.idl.common.polling.IdlBackendPolling;
import com.robinhood.android.models.event.p186db.EventDatabase;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.EventContract2;
import com.robinhood.android.models.event.p186db.arsenal.EventKt;
import com.robinhood.android.models.event.p186db.arsenal.EventTimeline;
import com.robinhood.android.models.event.p186db.arsenal.EventTimeline4;
import com.robinhood.android.models.event.p186db.arsenal.UiEventBracket;
import com.robinhood.android.models.event.p186db.dao.ContractGroupDao;
import com.robinhood.android.models.event.p186db.dao.ContractGroupSectionDao;
import com.robinhood.android.models.event.p186db.dao.EventBracketDao;
import com.robinhood.android.models.event.p186db.dao.EventContractDao;
import com.robinhood.android.models.event.p186db.dao.EventDao;
import com.robinhood.android.models.event.p186db.dao.EventTimelineDao;
import com.robinhood.android.models.event.p186db.dao.EventToContractMapDao;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractColumn;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup5;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroup6;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroupSection;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroupSection2;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractGroupSectionWithContractGroup;
import com.robinhood.android.models.event.p186db.predictionmarkets.EventContract3;
import com.robinhood.android.models.event.p186db.predictionmarkets.EventTimeline5;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.arsenal.proto.p281v1.idl.CountEventsRequestDto;
import com.robinhood.arsenal.proto.p281v1.idl.CountEventsResponseDto;
import com.robinhood.arsenal.proto.p281v1.idl.EventBracketDto;
import com.robinhood.arsenal.proto.p281v1.idl.EventContractDto;
import com.robinhood.arsenal.proto.p281v1.idl.EventDto;
import com.robinhood.arsenal.proto.p281v1.idl.EventStateDto;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.ContractGroupDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.ContractGroupSectionDto;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.Uuids;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.flow.SharingStarted;
import org.threeten.extra.Days;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: EventStore.kt */
@Metadata(m3635d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0099\u0001Bq\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0090\u0002\u00104\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0)03\"\n\b\u0000\u0010\"\u0018\u0001*\u00020!\"\u000e\b\u0001\u0010$\u0018\u0001*\u0006\u0012\u0002\b\u00030#\"\u000e\b\u0002\u0010%\u0018\u0001*\u0006\u0012\u0002\b\u00030#\"\u0006\b\u0003\u0010&\u0018\u00012*\b\u0004\u0010*\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010)0(\u0012\u0006\u0012\u0004\u0018\u00010!0'2*\b\u0004\u0010+\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020)0(\u0012\u0006\u0012\u0004\u0018\u00010!0'2\u0016\b\u0004\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00030,2\u0016\b\u0004\u0010.\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00030,2\u0014\b\u0004\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020/0,2\u0016\b\n\u00102\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0004\u0012\u00020\u001e0,H\u0082\b¢\u0006\u0004\b4\u00105J\u0013\u00107\u001a\u00020/*\u000206H\u0002¢\u0006\u0004\b7\u00108J9\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020@0?0>2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:092\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\bA\u0010BJ\u001b\u0010E\u001a\b\u0012\u0004\u0012\u00020D0>2\u0006\u0010C\u001a\u00020:¢\u0006\u0004\bE\u0010FJ\u001b\u0010I\u001a\b\u0012\u0004\u0012\u00020H0>2\u0006\u0010G\u001a\u00020:¢\u0006\u0004\bI\u0010FJ\u001b\u0010K\u001a\b\u0012\u0004\u0012\u00020J0>2\u0006\u0010G\u001a\u00020:¢\u0006\u0004\bK\u0010FJ-\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010>2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010L2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\bO\u0010PJ-\u0010R\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020H0?0>2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020:09¢\u0006\u0004\bR\u0010SJ\u001b\u0010T\u001a\u00020/2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020:09¢\u0006\u0004\bT\u0010UJ\u001b\u0010W\u001a\b\u0012\u0004\u0012\u00020@0>2\u0006\u0010V\u001a\u00020:¢\u0006\u0004\bW\u0010FJ\u001b\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0>2\u0006\u0010V\u001a\u00020:¢\u0006\u0004\bY\u0010FJ#\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001e0>2\u0006\u0010V\u001a\u00020:2\u0006\u0010[\u001a\u00020Z¢\u0006\u0004\b\\\u0010]J!\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:090>2\u0006\u0010^\u001a\u00020:¢\u0006\u0004\b_\u0010FJ)\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020b090>2\u0006\u0010^\u001a\u00020:2\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bc\u0010dJ)\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0e0>2\u0006\u0010^\u001a\u00020:2\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bf\u0010dJ)\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020g090>2\u0006\u0010^\u001a\u00020:2\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bh\u0010dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010iR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010jR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010kR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010lR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010mR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010nR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010oR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010pR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010qR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010rR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010sR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010tR!\u0010x\u001a\b\u0012\u0004\u0012\u00020\u001e0u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020\u001e0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R*\u0010|\u001a\u0018\u0012\u0004\u0012\u00020:\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0)038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R0\u0010~\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0)038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010}R\u001d\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u0002010\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R,\u0010\u0084\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0082\u0001\u0012\u0005\u0012\u00030\u0083\u0001038\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0084\u0001\u0010}\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R#\u0010\u0088\u0001\u001a\u000f\u0012\u0004\u0012\u00020:\u0012\u0005\u0012\u00030\u0087\u0001038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010}R2\u0010\u0089\u0001\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0)038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010}R,\u0010\u008a\u0001\u001a\u0018\u0012\u0004\u0012\u00020:\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0)038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010}R,\u0010\u008b\u0001\u001a\u0018\u0012\u0004\u0012\u00020:\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0)038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010}RE\u0010\u008e\u0001\u001a0\u0012\u0019\u0012\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09\u0012\u0006\u0012\u0004\u0018\u00010<0\u008d\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020@0?0\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R$\u0010\u0090\u0001\u001a\u000f\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020D0\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008f\u0001R%\u0010\u0091\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0082\u0001\u0012\u0004\u0012\u0002010\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008f\u0001R$\u0010\u0092\u0001\u001a\u000f\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020H0\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008f\u0001R,\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020J0\u008c\u00018\u0002X\u0082\u0004¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u008f\u0001\u0012\u0006\b\u0094\u0001\u0010\u0095\u0001R0\u0010\u0096\u0001\u001a\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09\u0012\n\u0012\b\u0012\u0004\u0012\u00020H090\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u008f\u0001R$\u0010\u0097\u0001\u001a\u000f\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020@0\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u008f\u0001R$\u0010\u0098\u0001\u001a\u000f\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020X0\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u008f\u0001¨\u0006\u009a\u0001"}, m3636d2 = {"Lcom/robinhood/store/event/EventStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;", "instrumentService", "Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentService;", "predictionMarketsInstrumentService", "Lcom/robinhood/android/models/event/db/dao/EventContractDao;", "eventContractDao", "Lcom/robinhood/android/models/event/db/dao/EventDao;", "eventDao", "Lcom/robinhood/android/models/event/db/dao/EventTimelineDao;", "eventTimelineDao", "Lcom/robinhood/android/models/event/db/dao/EventBracketDao;", "eventBracketDao", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "requestHeaderPlugin", "Lcom/robinhood/android/models/event/db/dao/EventToContractMapDao;", "eventToContractDao", "Lcom/robinhood/android/models/event/db/dao/ContractGroupDao;", "contractGroupDao", "Lcom/robinhood/android/models/event/db/dao/ContractGroupSectionDao;", "contractGroupSectionDao", "Lcom/robinhood/android/models/event/db/EventDatabase;", "eventDatabase", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentService;Lcom/robinhood/android/models/event/db/dao/EventContractDao;Lcom/robinhood/android/models/event/db/dao/EventDao;Lcom/robinhood/android/models/event/db/dao/EventTimelineDao;Lcom/robinhood/android/models/event/db/dao/EventBracketDao;Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;Lcom/robinhood/android/models/event/db/dao/EventToContractMapDao;Lcom/robinhood/android/models/event/db/dao/ContractGroupDao;Lcom/robinhood/android/models/event/db/dao/ContractGroupSectionDao;Lcom/robinhood/android/models/event/db/EventDatabase;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/experiments/ExperimentsProvider;)V", "", "isInGdpExperimentEnabled", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Params", "Lcom/robinhood/idl/MessageDto;", "ArsenalResponse", "PMResponse", "DbModel", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lcom/robinhood/idl/Response;", "arsenalCall", "predictionMarketsCall", "Lkotlin/Function1;", "arsenalMapper", "predictionMarketsMapper", "", "saveAction", "", "staleDecider", "Lcom/robinhood/android/moria/network/Endpoint;", "createExperimentBasedEndpoint", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/store/event/EventStore$FullEventInfoWrapper;", "insert", "(Lcom/robinhood/store/event/EventStore$FullEventInfoWrapper;)V", "", "Ljava/util/UUID;", "eventIds", "j$/time/Duration", "overrideBackendPollDuration", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/android/models/event/ui/UiEcEvent;", "streamEventListForBracket", "(Ljava/util/List;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "bracketId", "Lcom/robinhood/android/models/event/db/arsenal/UiEventBracket;", "streamEventBracket", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "eventContractId", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "streamEventContract", "Lcom/robinhood/android/models/event/db/arsenal/Event;", "streamParentEventByContractId", "Lcom/robinhood/arsenal/proto/v1/idl/EventStateDto;", "state", "discoverable", "streamEventCount", "(Lcom/robinhood/arsenal/proto/v1/idl/EventStateDto;Ljava/lang/Boolean;)Lkotlinx/coroutines/flow/Flow;", "eventContractIds", "streamEventContractList", "(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", "refreshEventContractList", "(Ljava/util/List;)V", "eventId", "streamEvent", "Lcom/robinhood/android/models/event/db/arsenal/EventTimeline;", "streamEventTimeline", "j$/time/Instant", "now", "streamIsPastAWeekFromEvent", "(Ljava/util/UUID;Lj$/time/Instant;)Lkotlinx/coroutines/flow/Flow;", "moneylineEventId", "streamAllContractIdsForEvent", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractGroupType;", "contractGroupType", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractGroup;", "streamContractGroupForEvent", "(Ljava/util/UUID;Lcom/robinhood/android/models/event/db/predictionmarkets/ContractGroupType;)Lkotlinx/coroutines/flow/Flow;", "", "streamAllContractIdsForContractGroup", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractGroupSectionWithContractGroup;", "streamContractGroupSections", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;", "Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentService;", "Lcom/robinhood/android/models/event/db/dao/EventContractDao;", "Lcom/robinhood/android/models/event/db/dao/EventDao;", "Lcom/robinhood/android/models/event/db/dao/EventTimelineDao;", "Lcom/robinhood/android/models/event/db/dao/EventBracketDao;", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "Lcom/robinhood/android/models/event/db/dao/EventToContractMapDao;", "Lcom/robinhood/android/models/event/db/dao/ContractGroupDao;", "Lcom/robinhood/android/models/event/db/dao/ContractGroupSectionDao;", "Lcom/robinhood/android/models/event/db/EventDatabase;", "Lcom/robinhood/store/StoreBundle;", "Lkotlinx/coroutines/flow/SharedFlow;", "isGdpExperimentEnabled$delegate", "Lkotlin/Lazy;", "isGdpExperimentEnabled", "()Lkotlinx/coroutines/flow/SharedFlow;", "shouldUseBffEndpoints", "Lkotlinx/coroutines/flow/Flow;", "getEventContract", "Lcom/robinhood/android/moria/network/Endpoint;", "getEventContractsList", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "eventCountFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventsRequestDto;", "Lcom/robinhood/arsenal/proto/v1/idl/CountEventsResponseDto;", "getEventCount", "getGetEventCount$lib_store_event_externalDebug", "()Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/arsenal/proto/v1/idl/EventBracketDto;", "getEventBracket", "getEventList", "getParentEventByContractId", "getEvent", "Lcom/robinhood/android/moria/db/Query;", "Lkotlin/Pair;", "queryEventsForBracket", "Lcom/robinhood/android/moria/db/Query;", "queryEventBracket", "queryEventListCount", "queryEventContract", "queryParentEventByContractId", "getQueryParentEventByContractId$annotations", "()V", "queryEventContractsList", "queryEvent", "queryEventTimeline", "FullEventInfoWrapper", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class EventStore extends Store {
    private final ContractGroupDao contractGroupDao;
    private final ContractGroupSectionDao contractGroupSectionDao;
    private final EventBracketDao eventBracketDao;
    private final EventContractDao eventContractDao;
    private final SharedFlow2<Long> eventCountFlow;
    private final EventDao eventDao;
    private final EventDatabase eventDatabase;
    private final EventTimelineDao eventTimelineDao;
    private final EventToContractMapDao eventToContractDao;
    private final Endpoint<UUID, Response<Dto3<?>>> getEvent;
    private final Endpoint<UUID, EventBracketDto> getEventBracket;
    private final Endpoint<UUID, Response<Dto3<?>>> getEventContract;
    private final Endpoint<List<UUID>, Response<Dto3<?>>> getEventContractsList;
    private final Endpoint<CountEventsRequestDto, CountEventsResponseDto> getEventCount;
    private final Endpoint<List<UUID>, Response<Dto3<?>>> getEventList;
    private final Endpoint<UUID, Response<Dto3<?>>> getParentEventByContractId;
    private final InstrumentService instrumentService;

    /* renamed from: isGdpExperimentEnabled$delegate, reason: from kotlin metadata */
    private final Lazy isGdpExperimentEnabled;
    private final com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService predictionMarketsInstrumentService;
    private final Query<UUID, UiEcEvent> queryEvent;
    private final Query<UUID, UiEventBracket> queryEventBracket;
    private final Query<UUID, EventContract> queryEventContract;
    private final Query<List<UUID>, List<EventContract>> queryEventContractsList;
    private final Query<CountEventsRequestDto, Long> queryEventListCount;
    private final Query<UUID, EventTimeline> queryEventTimeline;
    private final Query<Tuples2<? extends List<UUID>, Duration>, Map<UUID, UiEcEvent>> queryEventsForBracket;
    private final Query<UUID, Event> queryParentEventByContractId;
    private final PredictionMarketsRequestHeaderDelegate2 requestHeaderPlugin;
    private final Flow<Boolean> shouldUseBffEndpoints;
    private final StoreBundle storeBundle;

    /* compiled from: EventStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventStore", m3645f = "EventStore.kt", m3646l = {114}, m3647m = "isInGdpExperimentEnabled")
    /* renamed from: com.robinhood.store.event.EventStore$isInGdpExperimentEnabled$1 */
    static final class C414151 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C414151(Continuation<? super C414151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventStore.this.isInGdpExperimentEnabled(this);
        }
    }

    private static /* synthetic */ void getQueryParentEventByContractId$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventStore(InstrumentService instrumentService, com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService predictionMarketsInstrumentService, EventContractDao eventContractDao, EventDao eventDao, EventTimelineDao eventTimelineDao, EventBracketDao eventBracketDao, PredictionMarketsRequestHeaderDelegate2 requestHeaderPlugin, EventToContractMapDao eventToContractDao, ContractGroupDao contractGroupDao, ContractGroupSectionDao contractGroupSectionDao, EventDatabase eventDatabase, StoreBundle storeBundle, final ExperimentsProvider experimentsProvider) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(instrumentService, "instrumentService");
        Intrinsics.checkNotNullParameter(predictionMarketsInstrumentService, "predictionMarketsInstrumentService");
        Intrinsics.checkNotNullParameter(eventContractDao, "eventContractDao");
        Intrinsics.checkNotNullParameter(eventDao, "eventDao");
        Intrinsics.checkNotNullParameter(eventTimelineDao, "eventTimelineDao");
        Intrinsics.checkNotNullParameter(eventBracketDao, "eventBracketDao");
        Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
        Intrinsics.checkNotNullParameter(eventToContractDao, "eventToContractDao");
        Intrinsics.checkNotNullParameter(contractGroupDao, "contractGroupDao");
        Intrinsics.checkNotNullParameter(contractGroupSectionDao, "contractGroupSectionDao");
        Intrinsics.checkNotNullParameter(eventDatabase, "eventDatabase");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        this.instrumentService = instrumentService;
        this.predictionMarketsInstrumentService = predictionMarketsInstrumentService;
        this.eventContractDao = eventContractDao;
        this.eventDao = eventDao;
        this.eventTimelineDao = eventTimelineDao;
        this.eventBracketDao = eventBracketDao;
        this.requestHeaderPlugin = requestHeaderPlugin;
        this.eventToContractDao = eventToContractDao;
        this.contractGroupDao = contractGroupDao;
        this.contractGroupSectionDao = contractGroupSectionDao;
        this.eventDatabase = eventDatabase;
        this.storeBundle = storeBundle;
        this.isGdpExperimentEnabled = LazyKt.lazy(new Function0() { // from class: com.robinhood.store.event.EventStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventStore.isGdpExperimentEnabled_delegate$lambda$0(experimentsProvider, this);
            }
        });
        this.shouldUseBffEndpoints = ExperimentsProvider.DefaultImpls.streamStateFlow$default(experimentsProvider, new Experiment[]{EventContractsBffMigrationExperiment.INSTANCE}, false, null, 6, null);
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        DefaultStaleDecider defaultStaleDecider = new DefaultStaleDecider(durationOfSeconds, this.storeBundle.getClock());
        Endpoint.Companion companion = Endpoint.INSTANCE;
        Endpoint<UUID, Response<Dto3<?>>> endpointCreate = companion.create(new C41396xc410f9a4(this, null, this, this), this.storeBundle.getLogoutKillswitch(), new C41398xc410f9a5(null, this), this.storeBundle.getClock(), defaultStaleDecider);
        this.getEventContract = endpointCreate;
        Duration durationOfSeconds2 = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds2, "ofSeconds(...)");
        this.getEventContractsList = companion.create(new C41399xc410f9a6(this, null, this, this), this.storeBundle.getLogoutKillswitch(), new C41400xc410f9a7(null, this), this.storeBundle.getClock(), new DefaultStaleDecider(durationOfSeconds2, this.storeBundle.getClock()));
        this.eventCountFlow = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
        LogoutKillswitch logoutKillswitch = storeBundle.getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        Endpoint<CountEventsRequestDto, CountEventsResponseDto> endpointCreate2 = companion.create(new EventStore$getEventCount$1(this, null), logoutKillswitch, new EventStore$getEventCount$2(this, null), clock, new DefaultStaleDecider(durationOfMinutes, storeBundle.getClock()));
        this.getEventCount = endpointCreate2;
        LogoutKillswitch logoutKillswitch2 = storeBundle.getLogoutKillswitch();
        Clock clock2 = storeBundle.getClock();
        Duration durationOfMinutes2 = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes2, "ofMinutes(...)");
        this.getEventBracket = companion.create(new EventStore$getEventBracket$1(this, null), logoutKillswitch2, new EventStore$getEventBracket$2(this, null), clock2, new DefaultStaleDecider(durationOfMinutes2, storeBundle.getClock()));
        Duration durationOfSeconds3 = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds3, "ofSeconds(...)");
        this.getEventList = companion.create(new C41401xc410f9a8(this, null, this, this), this.storeBundle.getLogoutKillswitch(), new C41402xc410f9a9(null, this), this.storeBundle.getClock(), new DefaultStaleDecider(durationOfSeconds3, this.storeBundle.getClock()));
        Duration durationOfSeconds4 = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds4, "ofSeconds(...)");
        Endpoint<UUID, Response<Dto3<?>>> endpointCreate3 = companion.create(new C41403xc410f9aa(this, null, this, this), this.storeBundle.getLogoutKillswitch(), new C41404xc410f9ab(null, this), this.storeBundle.getClock(), new DefaultStaleDecider(durationOfSeconds4, this.storeBundle.getClock()));
        this.getParentEventByContractId = endpointCreate3;
        Duration durationOfSeconds5 = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds5, "ofSeconds(...)");
        Endpoint<UUID, Response<Dto3<?>>> endpointCreate4 = companion.create(new C41405xc410f9ac(this, null, this, this), this.storeBundle.getLogoutKillswitch(), new C41397xbe0e3b0c(null, this), this.storeBundle.getClock(), new DefaultStaleDecider(durationOfSeconds5, this.storeBundle.getClock()));
        this.getEvent = endpointCreate4;
        Query.Companion companion2 = Query.INSTANCE;
        this.queryEventsForBracket = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryEventsForBracket", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.event.EventStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventStore.queryEventsForBracket$lambda$30(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.event.EventStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventStore.queryEventsForBracket$lambda$31(this.f$0, (Tuples2) obj);
            }
        }, false, 16, null);
        this.queryEventBracket = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryEventBracket", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.event.EventStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventStore.queryEventBracket$lambda$32(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.event.EventStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventStore.queryEventBracket$lambda$33(this.f$0, (UUID) obj);
            }
        }, false, 16, null);
        this.queryEventListCount = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryEventListCount", CollectionsKt.listOf(new RefreshEach(new EventStore$queryEventListCount$1(endpointCreate2))), new Function1() { // from class: com.robinhood.store.event.EventStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventStore.queryEventListCount$lambda$34(this.f$0, (CountEventsRequestDto) obj);
            }
        }, false, 16, null);
        this.queryEventContract = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryEventContract", CollectionsKt.listOf(new RefreshEach(new EventStore$queryEventContract$1(endpointCreate))), new Function1() { // from class: com.robinhood.store.event.EventStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventStore.queryEventContract$lambda$36(this.f$0, (UUID) obj);
            }
        }, false, 16, null);
        this.queryParentEventByContractId = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryParentEventByContractId", CollectionsKt.listOf(new RefreshEach(new EventStore$queryParentEventByContractId$1(endpointCreate3))), new Function1() { // from class: com.robinhood.store.event.EventStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventStore.queryParentEventByContractId$lambda$40(this.f$0, (UUID) obj);
            }
        }, false, 16, null);
        this.queryEventContractsList = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryEventContractsList", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.store.event.EventStore$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventStore.queryEventContractsList$lambda$41(this.f$0, (List) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.event.EventStore$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventStore.queryEventContractsList$lambda$43(this.f$0, (List) obj);
            }
        }, false, 16, null);
        this.queryEvent = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryEvent", CollectionsKt.listOf(new RefreshEach(new EventStore$queryEvent$1(endpointCreate4))), new Function1() { // from class: com.robinhood.store.event.EventStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventStore.queryEvent$lambda$46(this.f$0, (UUID) obj);
            }
        }, false, 16, null);
        this.queryEventTimeline = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryEventTimeline", CollectionsKt.listOf(new RefreshEach(new EventStore$queryEventTimeline$1(endpointCreate4))), new Function1() { // from class: com.robinhood.store.event.EventStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventStore.queryEventTimeline$lambda$48(this.f$0, (UUID) obj);
            }
        }, false, 16, null);
    }

    private final SharedFlow<Boolean> isGdpExperimentEnabled() {
        return (SharedFlow) this.isGdpExperimentEnabled.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedFlow isGdpExperimentEnabled_delegate$lambda$0(ExperimentsProvider experimentsProvider, EventStore eventStore) {
        return FlowKt.shareIn(FlowKt.distinctUntilChanged(ExperimentsProvider.DefaultImpls.streamStateFlow$default(experimentsProvider, new Experiment[]{GameDetailPageExperiment.INSTANCE}, false, null, 4, null)), eventStore.getStoreScope(), SharingStarted.INSTANCE.getLazily(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isInGdpExperimentEnabled(Continuation<? super Boolean> continuation) {
        C414151 c414151;
        if (continuation instanceof C414151) {
            c414151 = (C414151) continuation;
            int i = c414151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414151.label = i - Integer.MIN_VALUE;
            } else {
                c414151 = new C414151(continuation);
            }
        }
        Object objFirstOrNull = c414151.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c414151.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            SharedFlow<Boolean> sharedFlowIsGdpExperimentEnabled = isGdpExperimentEnabled();
            c414151.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(sharedFlowIsGdpExperimentEnabled, c414151);
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirstOrNull);
        }
        Boolean bool = (Boolean) objFirstOrNull;
        return boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
    }

    public final Endpoint<CountEventsRequestDto, CountEventsResponseDto> getGetEventCount$lib_store_event_externalDebug() {
        return this.getEventCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryEventsForBracket$lambda$30(EventStore eventStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        List list = (List) tuples2.component1();
        Duration duration = (Duration) tuples2.component2();
        if (duration == null) {
            return IdlBackendPolling.backendPoll$default(eventStore.getEventList, list, null, null, 6, null);
        }
        return Endpoint.DefaultImpls.poll$default(eventStore.getEventList, list, duration, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryEventsForBracket$lambda$31(EventStore eventStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        List<UUID> list = (List) tuples2.component1();
        return FlowKt.combine(FlowKt.filterNotNull(eventStore.eventDao.getEventsForBracket(list)), FlowKt.filterNotNull(eventStore.eventContractDao.getEventContractsByEventIds(list)), new EventStore$queryEventsForBracket$2$1(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryEventBracket$lambda$32(EventStore eventStore, UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Endpoint<UUID, EventBracketDto> endpoint = eventStore.getEventBracket;
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, uuid, durationOfMinutes, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryEventBracket$lambda$33(EventStore eventStore, UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return eventStore.eventBracketDao.getEventBracket(id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryEventListCount$lambda$34(EventStore eventStore, CountEventsRequestDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.asSharedFlow(eventStore.eventCountFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryEventContract$lambda$36(EventStore eventStore, UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return FlowKt.filterNotNull(eventStore.eventContractDao.getEventContract(uuid));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryParentEventByContractId$lambda$40(EventStore eventStore, UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        final Flow<EventContract> eventContract = eventStore.eventContractDao.getEventContract(contractId);
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<UUID>() { // from class: com.robinhood.store.event.EventStore$queryParentEventByContractId$lambda$40$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                Object objCollect = eventContract.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.event.EventStore$queryParentEventByContractId$lambda$40$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$queryParentEventByContractId$lambda$40$$inlined$mapNotNull$1$2", m3645f = "EventStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.store.event.EventStore$queryParentEventByContractId$lambda$40$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    UUID eventId;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        EventContract eventContract = (EventContract) obj;
                        if (eventContract == null || (eventId = eventContract.getParentEventId()) == null) {
                            eventId = eventContract != null ? eventContract.getEventId() : null;
                        }
                        if (eventId != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(eventId, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }), new C41394xe7c4e7c0(null, eventStore));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job queryEventContractsList$lambda$41(EventStore eventStore, List params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return BuildersKt__Builders_commonKt.launch$default(eventStore.getStoreScope(), null, null, new EventStore$queryEventContractsList$1$1(params, eventStore, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryEventContractsList$lambda$43(EventStore eventStore, List param) {
        Intrinsics.checkNotNullParameter(param, "param");
        List list = param;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Uuids.safeToString((UUID) it.next()));
        }
        return FlowKt.filterNotNull(eventStore.eventContractDao.getEventContractsList(CollectionsKt.toSet(arrayList)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryEvent$lambda$46(EventStore eventStore, UUID eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Flow flowFilterNotNull = FlowKt.filterNotNull(eventStore.eventDao.getEvent(eventId));
        final Flow<List<EventContract>> eventContractsByEventId = eventStore.eventContractDao.getEventContractsByEventId(eventId);
        return FlowKt.combine(flowFilterNotNull, new Flow<List<? extends EventContract>>() { // from class: com.robinhood.store.event.EventStore$queryEvent$lambda$46$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends EventContract>> flowCollector, Continuation continuation) {
                Object objCollect = eventContractsByEventId.collect(new C413932(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.event.EventStore$queryEvent$lambda$46$$inlined$mapNotNull$1$2 */
            public static final class C413932<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$queryEvent$lambda$46$$inlined$mapNotNull$1$2", m3645f = "EventStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.store.event.EventStore$queryEvent$lambda$46$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C413932.this.emit(null, this);
                    }
                }

                public C413932(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        List list = (List) obj;
                        List list2 = list;
                        if (list2 == null || list2.isEmpty()) {
                            list = null;
                        }
                        if (list != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(list, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, new EventStore$queryEvent$2$2(UiEcEvent.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object queryEvent$lambda$46$fromDbModels(UiEcEvent.Companion companion, Event event, List list, Continuation continuation) {
        return companion.fromDbModels(event, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryEventTimeline$lambda$48(EventStore eventStore, UUID eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        return FlowKt.filterNotNull(eventStore.eventTimelineDao.getTimeline(eventId));
    }

    public static /* synthetic */ Flow streamEventListForBracket$default(EventStore eventStore, List list, Duration duration, int i, Object obj) {
        if ((i & 2) != 0) {
            duration = null;
        }
        return eventStore.streamEventListForBracket(list, duration);
    }

    public final Flow<Map<UUID, UiEcEvent>> streamEventListForBracket(List<UUID> eventIds, Duration overrideBackendPollDuration) {
        Intrinsics.checkNotNullParameter(eventIds, "eventIds");
        return FlowKt.distinctUntilChanged(this.queryEventsForBracket.asFlow(Tuples4.m3642to(eventIds, overrideBackendPollDuration)));
    }

    public final Flow<UiEventBracket> streamEventBracket(UUID bracketId) {
        Intrinsics.checkNotNullParameter(bracketId, "bracketId");
        return this.queryEventBracket.asFlow(bracketId);
    }

    public final Flow<EventContract> streamEventContract(UUID eventContractId) {
        Intrinsics.checkNotNullParameter(eventContractId, "eventContractId");
        return FlowKt.distinctUntilChanged(this.queryEventContract.asFlow(eventContractId));
    }

    public final Flow<Event> streamParentEventByContractId(UUID eventContractId) {
        Intrinsics.checkNotNullParameter(eventContractId, "eventContractId");
        return FlowKt.distinctUntilChanged(this.queryParentEventByContractId.asFlow(eventContractId));
    }

    public static /* synthetic */ Flow streamEventCount$default(EventStore eventStore, EventStateDto eventStateDto, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            eventStateDto = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        return eventStore.streamEventCount(eventStateDto, bool);
    }

    public final Flow<Long> streamEventCount(EventStateDto state, Boolean discoverable) {
        return FlowKt.distinctUntilChanged(this.queryEventListCount.asFlow(new CountEventsRequestDto(discoverable, state, false, 4, null)));
    }

    public final Flow<Map<UUID, EventContract>> streamEventContractList(List<UUID> eventContractIds) {
        Intrinsics.checkNotNullParameter(eventContractIds, "eventContractIds");
        final Flow<List<EventContract>> flowAsFlow = this.queryEventContractsList.asFlow(eventContractIds);
        return new Flow<Map<UUID, ? extends EventContract>>() { // from class: com.robinhood.store.event.EventStore$streamEventContractList$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Map<UUID, ? extends EventContract>> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new C414092(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.event.EventStore$streamEventContractList$$inlined$map$1$2 */
            public static final class C414092<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$streamEventContractList$$inlined$map$1$2", m3645f = "EventStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.event.EventStore$streamEventContractList$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C414092.this.emit(null, this);
                    }
                }

                public C414092(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        List list = (List) obj;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (T t : list) {
                            linkedHashMap.put(((EventContract) t).getContractId(), t);
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    /* compiled from: EventStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$refreshEventContractList$1", m3645f = "EventStore.kt", m3646l = {481}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.event.EventStore$refreshEventContractList$1 */
    static final class C414161 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<UUID> $eventContractIds;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EventStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C414161(List<UUID> list, EventStore eventStore, Continuation<? super C414161> continuation) {
            super(2, continuation);
            this.$eventContractIds = list;
            this.this$0 = eventStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C414161 c414161 = new C414161(this.$eventContractIds, this.this$0, continuation);
            c414161.L$0 = obj;
            return c414161;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C414161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                List listChunked = CollectionsKt.chunked(this.$eventContractIds, 120);
                EventStore eventStore = this.this$0;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listChunked, 10));
                Iterator it = listChunked.iterator();
                while (it.hasNext()) {
                    arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new EventStore$refreshEventContractList$1$1$1(eventStore, (List) it.next(), null), 3, null));
                }
                this.label = 1;
                if (Await2.awaitAll(arrayList, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void refreshEventContractList(List<UUID> eventContractIds) {
        Intrinsics.checkNotNullParameter(eventContractIds, "eventContractIds");
        if (eventContractIds.isEmpty()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C414161(eventContractIds, this, null), 3, null);
    }

    public final Flow<UiEcEvent> streamEvent(UUID eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        return FlowKt.distinctUntilChanged(this.queryEvent.asFlow(eventId));
    }

    public final Flow<EventTimeline> streamEventTimeline(UUID eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        return FlowKt.distinctUntilChanged(this.queryEventTimeline.asFlow(eventId));
    }

    public final Flow<Boolean> streamIsPastAWeekFromEvent(UUID eventId, final Instant now) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(now, "now");
        final Flow<EventTimeline> flowStreamEventTimeline = streamEventTimeline(eventId);
        final Flow<Instant> flow = new Flow<Instant>() { // from class: com.robinhood.store.event.EventStore$streamIsPastAWeekFromEvent$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Instant> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamEventTimeline.collect(new C414112(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.event.EventStore$streamIsPastAWeekFromEvent$$inlined$mapNotNull$1$2 */
            public static final class C414112<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$streamIsPastAWeekFromEvent$$inlined$mapNotNull$1$2", m3645f = "EventStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.store.event.EventStore$streamIsPastAWeekFromEvent$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C414112.this.emit(null, this);
                    }
                }

                public C414112(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Instant instantEventDayTimestamp = ((EventTimeline) obj).eventDayTimestamp();
                        if (instantEventDayTimestamp != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(instantEventDayTimestamp, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        return new Flow<Boolean>() { // from class: com.robinhood.store.event.EventStore$streamIsPastAWeekFromEvent$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C414102(flowCollector, now), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.event.EventStore$streamIsPastAWeekFromEvent$$inlined$map$1$2 */
            public static final class C414102<T> implements FlowCollector {
                final /* synthetic */ Instant $now$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$streamIsPastAWeekFromEvent$$inlined$map$1$2", m3645f = "EventStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.event.EventStore$streamIsPastAWeekFromEvent$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C414102.this.emit(null, this);
                    }
                }

                public C414102(FlowCollector flowCollector, Instant instant) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$now$inlined = instant;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Instant instant = this.$now$inlined;
                        Instant instantPlus = ((Instant) obj).plus((TemporalAmount) Days.m3991of(7));
                        Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
                        Boolean boolBoxBoolean = boxing.boxBoolean(instant.isAfter(instantPlus));
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    public final Flow<List<UUID>> streamAllContractIdsForEvent(UUID moneylineEventId) {
        Intrinsics.checkNotNullParameter(moneylineEventId, "moneylineEventId");
        return this.eventToContractDao.streamEventToContractMap(moneylineEventId);
    }

    public final Flow<List<ContractGroup>> streamContractGroupForEvent(UUID moneylineEventId, ContractGroup6 contractGroupType) {
        Intrinsics.checkNotNullParameter(moneylineEventId, "moneylineEventId");
        Intrinsics.checkNotNullParameter(contractGroupType, "contractGroupType");
        final Flow<List<ContractGroup>> flowStreamContractGroup = this.contractGroupDao.streamContractGroup(moneylineEventId, contractGroupType);
        return new Flow<List<? extends ContractGroup>>() { // from class: com.robinhood.store.event.EventStore$streamContractGroupForEvent$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends ContractGroup>> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamContractGroup.collect(new C414072(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.event.EventStore$streamContractGroupForEvent$$inlined$filter$1$2 */
            public static final class C414072<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$streamContractGroupForEvent$$inlined$filter$1$2", m3645f = "EventStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.event.EventStore$streamContractGroupForEvent$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C414072.this.emit(null, this);
                    }
                }

                public C414072(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (!((List) obj).isEmpty()) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    public final Flow<Set<UUID>> streamAllContractIdsForContractGroup(UUID moneylineEventId, ContractGroup6 contractGroupType) {
        Intrinsics.checkNotNullParameter(moneylineEventId, "moneylineEventId");
        Intrinsics.checkNotNullParameter(contractGroupType, "contractGroupType");
        final Flow<List<ContractGroup>> flowStreamContractGroupForEvent = streamContractGroupForEvent(moneylineEventId, contractGroupType);
        return FlowKt.distinctUntilChanged(new Flow<Set<? extends UUID>>() { // from class: com.robinhood.store.event.EventStore$streamAllContractIdsForContractGroup$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Set<? extends UUID>> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamContractGroupForEvent.collect(new C414062(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.event.EventStore$streamAllContractIdsForContractGroup$$inlined$map$1$2 */
            public static final class C414062<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$streamAllContractIdsForContractGroup$$inlined$map$1$2", m3645f = "EventStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.event.EventStore$streamAllContractIdsForContractGroup$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C414062.this.emit(null, this);
                    }
                }

                public C414062(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = ((List) obj).iterator();
                        while (it.hasNext()) {
                            List<ContractColumn> contractColumns = ((ContractGroup) it.next()).getContractColumns();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it2 = contractColumns.iterator();
                            while (it2.hasNext()) {
                                List<ContractElement> contractElements = ((ContractColumn) it2.next()).getContractElements();
                                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(contractElements, 10));
                                Iterator<T> it3 = contractElements.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add(((ContractElement) it3.next()).getContractId());
                                }
                                CollectionsKt.addAll(arrayList2, arrayList3);
                            }
                            CollectionsKt.addAll(arrayList, arrayList2);
                        }
                        Set set = CollectionsKt.toSet(arrayList);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(set, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    public final Flow<List<ContractGroupSectionWithContractGroup>> streamContractGroupSections(UUID moneylineEventId, ContractGroup6 contractGroupType) {
        Intrinsics.checkNotNullParameter(moneylineEventId, "moneylineEventId");
        Intrinsics.checkNotNullParameter(contractGroupType, "contractGroupType");
        final Flow<List<ContractGroupSectionWithContractGroup>> contractGroupSectionWithContractGroup = this.contractGroupSectionDao.getContractGroupSectionWithContractGroup(moneylineEventId, contractGroupType);
        return new Flow<List<? extends ContractGroupSectionWithContractGroup>>() { // from class: com.robinhood.store.event.EventStore$streamContractGroupSections$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends ContractGroupSectionWithContractGroup>> flowCollector, Continuation continuation) {
                Object objCollect = contractGroupSectionWithContractGroup.collect(new C414082(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.event.EventStore$streamContractGroupSections$$inlined$filter$1$2 */
            public static final class C414082<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$streamContractGroupSections$$inlined$filter$1$2", m3645f = "EventStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.event.EventStore$streamContractGroupSections$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C414082.this.emit(null, this);
                    }
                }

                public C414082(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (!((List) obj).isEmpty()) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Endpoint createExperimentBasedEndpoint$default(EventStore eventStore, Function2 function2, Function2 function22, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i, Object obj) {
        if ((i & 32) != 0) {
            Duration durationOfSeconds = Duration.ofSeconds(5L);
            Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
            function14 = new DefaultStaleDecider(durationOfSeconds, eventStore.storeBundle.getClock());
        }
        Endpoint.Companion companion = Endpoint.INSTANCE;
        LogoutKillswitch logoutKillswitch = eventStore.storeBundle.getLogoutKillswitch();
        Clock clock = eventStore.storeBundle.getClock();
        Intrinsics.needClassReification();
        C414121 c414121 = eventStore.new C414121(function22, function2, null);
        Intrinsics.needClassReification();
        return companion.create(c414121, logoutKillswitch, new C414132(function12, function1, function13, null), clock, function14);
    }

    /* JADX INFO: Add missing generic type declarations: [Params] */
    /* compiled from: EventStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/MessageDto;", "Params", "", "params"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$createExperimentBasedEndpoint$1", m3645f = "EventStore.kt", m3646l = {570, 571, 573}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.event.EventStore$createExperimentBasedEndpoint$1 */
    public static final class C414121<Params> extends ContinuationImpl7 implements Function2<Params, Continuation<? super Response<? extends Dto3<?>>>, Object> {
        final /* synthetic */ Function2<Params, Continuation<? super Response<? extends ArsenalResponse>>, Object> $arsenalCall;
        final /* synthetic */ Function2<Params, Continuation<? super Response<? extends PMResponse>>, Object> $predictionMarketsCall;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C414121(Function2<? super Params, ? super Continuation<? super Response<? extends PMResponse>>, ? extends Object> function2, Function2<? super Params, ? super Continuation<? super Response<? extends ArsenalResponse>>, ? extends Object> function22, Continuation<? super C414121> continuation) {
            super(2, continuation);
            this.$predictionMarketsCall = function2;
            this.$arsenalCall = function22;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Intrinsics.needClassReification();
            C414121 c414121 = EventStore.this.new C414121(this.$predictionMarketsCall, this.$arsenalCall, continuation);
            c414121.L$0 = obj;
            return c414121;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Response<? extends Dto3<?>>> continuation) {
            return invoke2((C414121<Params>) obj, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Params params, Continuation<? super Response<? extends Dto3<?>>> continuation) {
            return ((C414121) create(params, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        
            if (r6 == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
        
            if (r6 == r0) goto L24;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                obj2 = this.L$0;
                Flow flow = EventStore.this.shouldUseBffEndpoints;
                this.L$0 = obj2;
                this.label = 1;
                obj = FlowKt.firstOrNull(flow, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return (Response) obj;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (Response) obj;
            }
            obj2 = this.L$0;
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(obj, boxing.boxBoolean(true))) {
                Function2<Params, Continuation<? super Response<? extends PMResponse>>, Object> function2 = this.$predictionMarketsCall;
                this.L$0 = null;
                this.label = 2;
                obj = function2.invoke(obj2, this);
            } else {
                Function2<Params, Continuation<? super Response<? extends ArsenalResponse>>, Object> function22 = this.$arsenalCall;
                this.L$0 = null;
                this.label = 3;
                obj = function22.invoke(obj2, this);
            }
            return coroutine_suspended;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object invokeSuspend$$forInline(Object obj) {
            Object obj2 = this.L$0;
            InlineMarker.mark(10);
            Flow flow = EventStore.this.shouldUseBffEndpoints;
            InlineMarker.mark(0);
            Object objFirstOrNull = FlowKt.firstOrNull(flow, this);
            InlineMarker.mark(1);
            if (Intrinsics.areEqual(objFirstOrNull, Boolean.TRUE)) {
                return (Response) this.$predictionMarketsCall.invoke(obj2, this);
            }
            return (Response) this.$arsenalCall.invoke(obj2, this);
        }
    }

    private final /* synthetic */ <Params, ArsenalResponse extends Dto3<?>, PMResponse extends Dto3<?>, DbModel> Endpoint<Params, Response<Dto3<?>>> createExperimentBasedEndpoint(Function2<? super Params, ? super Continuation<? super Response<? extends ArsenalResponse>>, ? extends Object> arsenalCall, Function2<? super Params, ? super Continuation<? super Response<? extends PMResponse>>, ? extends Object> predictionMarketsCall, Function1<? super ArsenalResponse, ? extends DbModel> arsenalMapper, Function1<? super PMResponse, ? extends DbModel> predictionMarketsMapper, Function1<? super DbModel, Unit> saveAction, Function1<? super Long, Boolean> staleDecider) {
        Endpoint.Companion companion = Endpoint.INSTANCE;
        LogoutKillswitch logoutKillswitch = this.storeBundle.getLogoutKillswitch();
        Clock clock = this.storeBundle.getClock();
        Intrinsics.needClassReification();
        C414121 c414121 = new C414121(predictionMarketsCall, arsenalCall, null);
        Intrinsics.needClassReification();
        return companion.create(c414121, logoutKillswitch, new C414132(predictionMarketsMapper, arsenalMapper, saveAction, null), clock, staleDecider);
    }

    /* compiled from: EventStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/idl/MessageDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventStore$createExperimentBasedEndpoint$2", m3645f = "EventStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.event.EventStore$createExperimentBasedEndpoint$2 */
    public static final class C414132 extends ContinuationImpl7 implements Function2<Response<? extends Dto3<?>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<ArsenalResponse, DbModel> $arsenalMapper;
        final /* synthetic */ Function1<PMResponse, DbModel> $predictionMarketsMapper;
        final /* synthetic */ Function1<DbModel, Unit> $saveAction;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C414132(Function1<? super PMResponse, ? extends DbModel> function1, Function1<? super ArsenalResponse, ? extends DbModel> function12, Function1<? super DbModel, Unit> function13, Continuation<? super C414132> continuation) {
            super(2, continuation);
            this.$predictionMarketsMapper = function1;
            this.$arsenalMapper = function12;
            this.$saveAction = function13;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C414132 c414132 = new C414132(this.$predictionMarketsMapper, this.$arsenalMapper, this.$saveAction, continuation);
            c414132.L$0 = obj;
            return c414132;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Response<? extends Dto3<?>> response, Continuation<? super Unit> continuation) {
            return ((C414132) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objInvoke;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Dto3 dto3 = (Dto3) ((Response) this.L$0).getData();
            Intrinsics.reifiedOperationMarker(3, "PMResponse");
            if (dto3 != null) {
                objInvoke = this.$predictionMarketsMapper.invoke(dto3);
            } else {
                Intrinsics.reifiedOperationMarker(3, "ArsenalResponse");
                objInvoke = dto3 != null ? this.$arsenalMapper.invoke(dto3) : null;
            }
            if (objInvoke != null) {
                this.$saveAction.invoke(objInvoke);
            }
            return Unit.INSTANCE;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            Object objInvoke;
            Response response = (Response) this.L$0;
            InlineMarker.mark(10);
            Dto3 dto3 = (Dto3) response.getData();
            Intrinsics.reifiedOperationMarker(3, "PMResponse");
            if (dto3 != null) {
                objInvoke = this.$predictionMarketsMapper.invoke(dto3);
            } else {
                Intrinsics.reifiedOperationMarker(3, "ArsenalResponse");
                objInvoke = dto3 != null ? this.$arsenalMapper.invoke(dto3) : null;
            }
            if (objInvoke != null) {
                this.$saveAction.invoke(objInvoke);
                Unit unit = Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insert(final FullEventInfoWrapper fullEventInfoWrapper) {
        this.eventDatabase.runInTransaction(new Runnable() { // from class: com.robinhood.store.event.EventStore.insert.1
            @Override // java.lang.Runnable
            public final void run() {
                EventStore.this.eventDao.insert(fullEventInfoWrapper.getEvents(), EventStore.this.eventToContractDao);
                EventStore.this.eventContractDao.insert(fullEventInfoWrapper.getEventContracts(), EventStore.this.eventToContractDao);
                EventStore.this.eventTimelineDao.insert((Iterable) fullEventInfoWrapper.getEventTimelines());
                EventStore.this.contractGroupDao.insert(fullEventInfoWrapper.getGameContractGroup(), EventStore.this.eventToContractDao);
                EventStore.this.contractGroupDao.insert(fullEventInfoWrapper.getPrepackContractGroup(), EventStore.this.eventToContractDao);
                ContractGroupSectionDao contractGroupSectionDao = EventStore.this.contractGroupSectionDao;
                List<Tuples2<ContractGroupSection, ContractGroup>> contractGroupSection = fullEventInfoWrapper.getContractGroupSection();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contractGroupSection, 10));
                Iterator<T> it = contractGroupSection.iterator();
                while (it.hasNext()) {
                    arrayList.add((ContractGroupSection) ((Tuples2) it.next()).getFirst());
                }
                contractGroupSectionDao.insert((Iterable) arrayList);
                ContractGroupDao contractGroupDao = EventStore.this.contractGroupDao;
                List<Tuples2<ContractGroupSection, ContractGroup>> contractGroupSection2 = fullEventInfoWrapper.getContractGroupSection();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = contractGroupSection2.iterator();
                while (it2.hasNext()) {
                    ContractGroup contractGroup = (ContractGroup) ((Tuples2) it2.next()).getSecond();
                    if (contractGroup != null) {
                        arrayList2.add(contractGroup);
                    }
                }
                contractGroupDao.insert(arrayList2, EventStore.this.eventToContractDao);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EventStore.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018Bk\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u001a\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\n0\r0\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R%\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\n0\r0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/store/event/EventStore$FullEventInfoWrapper;", "", "events", "", "Lcom/robinhood/android/models/event/db/arsenal/Event;", "eventContracts", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "eventTimelines", "Lcom/robinhood/android/models/event/db/arsenal/EventTimeline;", "gameContractGroup", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractGroup;", "prepackContractGroup", "contractGroupSection", "Lkotlin/Pair;", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractGroupSection;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getEvents", "()Ljava/util/List;", "getEventContracts", "getEventTimelines", "getGameContractGroup", "getPrepackContractGroup", "getContractGroupSection", "Companion", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class FullEventInfoWrapper {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<Tuples2<ContractGroupSection, ContractGroup>> contractGroupSection;
        private final List<EventContract> eventContracts;
        private final List<EventTimeline> eventTimelines;
        private final List<Event> events;
        private final List<ContractGroup> gameContractGroup;
        private final List<ContractGroup> prepackContractGroup;

        public /* synthetic */ FullEventInfoWrapper(List list, List list2, List list3, List list4, List list5, List list6, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, list2, list3, list4, list5, list6);
        }

        private FullEventInfoWrapper(List<Event> list, List<EventContract> list2, List<EventTimeline> list3, List<ContractGroup> list4, List<ContractGroup> list5, List<Tuples2<ContractGroupSection, ContractGroup>> list6) {
            this.events = list;
            this.eventContracts = list2;
            this.eventTimelines = list3;
            this.gameContractGroup = list4;
            this.prepackContractGroup = list5;
            this.contractGroupSection = list6;
        }

        public final List<Event> getEvents() {
            return this.events;
        }

        public final List<EventContract> getEventContracts() {
            return this.eventContracts;
        }

        public final List<EventTimeline> getEventTimelines() {
            return this.eventTimelines;
        }

        public final List<ContractGroup> getGameContractGroup() {
            return this.gameContractGroup;
        }

        public final List<ContractGroup> getPrepackContractGroup() {
            return this.prepackContractGroup;
        }

        public final List<Tuples2<ContractGroupSection, ContractGroup>> getContractGroupSection() {
            return this.contractGroupSection;
        }

        /* compiled from: EventStore.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/store/event/EventStore$FullEventInfoWrapper$Companion;", "", "<init>", "()V", "fromArsenalEvent", "Lcom/robinhood/store/event/EventStore$FullEventInfoWrapper;", "events", "", "Lcom/robinhood/arsenal/proto/v1/idl/EventDto;", "fromBffEvent", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventDto;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final FullEventInfoWrapper fromArsenalEvent(List<EventDto> events) {
                Intrinsics.checkNotNullParameter(events, "events");
                List<EventDto> list = events;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(EventKt.toDbModel((EventDto) it.next()));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    Collection<EventContractDto> collectionValues = ((EventDto) it2.next()).getEvent_contracts().values();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
                    Iterator<T> it3 = collectionValues.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(EventContract2.toDbModel((EventContractDto) it3.next()));
                    }
                    CollectionsKt.addAll(arrayList2, arrayList3);
                }
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (EventDto eventDto : list) {
                    arrayList4.add(EventTimeline4.toDbModel(eventDto.getTimeline(), StringsKt.toUuid(eventDto.getId())));
                }
                return new FullEventInfoWrapper(arrayList, arrayList2, arrayList4, CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), null);
            }

            public final FullEventInfoWrapper fromBffEvent(List<com.robinhood.prediction_markets.proto.p361v1.idl.EventDto> events) {
                UUID uuid;
                Iterator it;
                ContractGroup contractGroupContractGroupToDbModel;
                UUID uuid2;
                UUID uuid3;
                UUID uuid4;
                Intrinsics.checkNotNullParameter(events, "events");
                List<com.robinhood.prediction_markets.proto.p361v1.idl.EventDto> list = events;
                int i = 10;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(com.robinhood.android.models.event.p186db.predictionmarkets.EventKt.toDbModel((com.robinhood.prediction_markets.proto.p361v1.idl.EventDto) it2.next()));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    Collection<com.robinhood.prediction_markets.proto.p361v1.idl.EventContractDto> collectionValues = ((com.robinhood.prediction_markets.proto.p361v1.idl.EventDto) it3.next()).getEvent_contracts().values();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
                    Iterator<T> it4 = collectionValues.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(EventContract3.toDbModel((com.robinhood.prediction_markets.proto.p361v1.idl.EventContractDto) it4.next()));
                    }
                    CollectionsKt.addAll(arrayList2, arrayList3);
                }
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (com.robinhood.prediction_markets.proto.p361v1.idl.EventDto eventDto : list) {
                    arrayList4.add(EventTimeline5.toDbModel(eventDto.getTimeline(), StringsKt.toUuid(eventDto.getId())));
                }
                ArrayList arrayList5 = new ArrayList();
                for (com.robinhood.prediction_markets.proto.p361v1.idl.EventDto eventDto2 : list) {
                    List<ContractGroupDto> game_contract_groups = eventDto2.getGame_contract_groups();
                    String parent_event_id = eventDto2.getParent_event_id();
                    if (parent_event_id == null || (uuid4 = StringsKt.toUuid(parent_event_id)) == null) {
                        uuid4 = StringsKt.toUuid(eventDto2.getId());
                    }
                    CollectionsKt.addAll(arrayList5, ContractGroup5.contractGroupListToDbModel(game_contract_groups, StringsKt.toUuid(eventDto2.getId()), uuid4, ContractGroup6.CONTRACT_GROUP_TYPE_SIX_BOX, null));
                }
                ArrayList arrayList6 = new ArrayList();
                for (com.robinhood.prediction_markets.proto.p361v1.idl.EventDto eventDto3 : list) {
                    List<ContractGroupDto> prepack_contract_group = eventDto3.getPrepack_contract_group();
                    String parent_event_id2 = eventDto3.getParent_event_id();
                    if (parent_event_id2 == null || (uuid3 = StringsKt.toUuid(parent_event_id2)) == null) {
                        uuid3 = StringsKt.toUuid(eventDto3.getId());
                    }
                    CollectionsKt.addAll(arrayList6, ContractGroup5.contractGroupListToDbModel(prepack_contract_group, StringsKt.toUuid(eventDto3.getId()), uuid3, ContractGroup6.CONTRACT_GROUP_TYPE_PREPACKS, null));
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    com.robinhood.prediction_markets.proto.p361v1.idl.EventDto eventDto4 = (com.robinhood.prediction_markets.proto.p361v1.idl.EventDto) it5.next();
                    List<ContractGroupSectionDto> props_contract_group_sections_v2 = eventDto4.getProps_contract_group_sections_v2();
                    ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(props_contract_group_sections_v2, i));
                    int i2 = 0;
                    for (Object obj : props_contract_group_sections_v2) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        ContractGroupSectionDto contractGroupSectionDto = (ContractGroupSectionDto) obj;
                        String parent_event_id3 = eventDto4.getParent_event_id();
                        if (parent_event_id3 == null || (uuid = StringsKt.toUuid(parent_event_id3)) == null) {
                            uuid = StringsKt.toUuid(eventDto4.getId());
                        }
                        ContractGroup6 contractGroup6 = ContractGroup6.CONTRACT_GROUP_TYPE_PLAYER_PROPS;
                        ContractGroupSection dbModel = ContractGroupSection2.toDbModel(contractGroupSectionDto, uuid, StringsKt.toUuid(eventDto4.getId()), contractGroup6, i2);
                        ContractGroupDto contract_group = contractGroupSectionDto.getContract_group();
                        if (contract_group != null) {
                            String parent_event_id4 = eventDto4.getParent_event_id();
                            if (parent_event_id4 == null || (uuid2 = StringsKt.toUuid(parent_event_id4)) == null) {
                                uuid2 = StringsKt.toUuid(eventDto4.getId());
                            }
                            it = it5;
                            contractGroupContractGroupToDbModel = ContractGroup5.contractGroupToDbModel(contract_group, StringsKt.toUuid(eventDto4.getId()), uuid2, contractGroup6, dbModel.getSectionId());
                        } else {
                            it = it5;
                            contractGroupContractGroupToDbModel = null;
                        }
                        arrayList8.add(new Tuples2(dbModel, contractGroupContractGroupToDbModel));
                        i2 = i3;
                        it5 = it;
                    }
                    CollectionsKt.addAll(arrayList7, arrayList8);
                    i = 10;
                }
                return new FullEventInfoWrapper(arrayList, arrayList2, arrayList4, arrayList5, arrayList6, arrayList7, null);
            }
        }
    }
}
