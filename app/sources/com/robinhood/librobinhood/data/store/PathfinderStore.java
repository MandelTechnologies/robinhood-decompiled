package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.retrofit.PathfinderApi;
import com.robinhood.coroutines.flow.ErrorHandling3;
import com.robinhood.models.api.pathfinder.GenericUserViewInputRequest;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.models.api.pathfinder.auxcontext.ApiAuxContext;
import com.robinhood.models.api.pathfinder.userview.ApiUserViewState;
import com.robinhood.models.p355ui.PathfinderStateError;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.models.p355ui.pathfinder.auxcontext.AuxContext;
import com.robinhood.models.p355ui.pathfinder.auxcontext.AuxContext2;
import com.robinhood.models.p355ui.pathfinder.extension.UserViewStates4;
import com.robinhood.prefs.Installation;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Function;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.ImmutableMap3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import okhttp3.ResponseBody;
import p479j$.time.Duration;

/* compiled from: PathfinderStore.kt */
@Metadata(m3635d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ:\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018JB\u0010\u001a\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00132\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001d\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u0081\u0001\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010-\"\u0004\b\u0000\u0010#\"\b\b\u0001\u0010%*\u00020$*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&2\u0006\u0010'\u001a\u00028\u00002\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00020(0\u00122*\b\u0002\u0010,\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0+\u0012\u0006\u0012\u0004\u0018\u00010$0*H\u0002¢\u0006\u0004\b.\u0010/JU\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000-\"\n\b\u0000\u0010%*\u0004\u0018\u00010$2\u0014\u0010)\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020(0\u00122\u001c\u00100\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+\u0012\u0006\u0012\u0004\u0018\u00010$0\u0012H\u0002¢\u0006\u0004\b1\u00102J*\u00104\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u00103\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b4\u00105J-\u00109\u001a\b\u0012\u0004\u0012\u00020\u00160-2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00107\u001a\u0002062\b\b\u0002\u00108\u001a\u00020(¢\u0006\u0004\b9\u0010:J\u001f\u0010<\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030;0-2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b<\u0010=J#\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00160-2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b<\u0010>J\u001b\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00160-2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b?\u0010=J\u001e\u0010@\u001a\b\u0012\u0002\b\u0003\u0018\u00010;2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b@\u0010AJ\u0013\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00130-¢\u0006\u0004\bB\u0010CJ\u001b\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00100-2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bD\u0010=J.\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000-\"\u000e\b\u0000\u0010%\u0018\u0001*\u0006\u0012\u0002\b\u00030;2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\bE\u0010=J6\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000-\"\u000e\b\u0000\u0010%\u0018\u0001*\u0006\u0012\u0002\b\u00030;2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\b¢\u0006\u0004\bE\u0010>JB\u0010H\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010G\u001a\u00020F2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012H\u0086@¢\u0006\u0004\bH\u0010IJ%\u0010J\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bJ\u0010KJB\u0010M\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010G\u001a\u00020L2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012H\u0086@¢\u0006\u0004\bM\u0010NJ:\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020O2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012H\u0086@¢\u0006\u0004\b\u0017\u0010QJ\u0015\u0010R\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bR\u0010SJ\u0015\u0010T\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bT\u0010SJ(\u0010W\u001a\u00020V2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010U\u001a\u00020LH\u0086@¢\u0006\u0004\bW\u0010XJ4\u0010Y\u001a\u00028\u0000\"\n\b\u0000\u0010%\u0018\u0001*\u00020V2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010U\u001a\u00020LH\u0086H¢\u0006\u0004\bY\u0010XR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ZR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010[R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\\R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010]R6\u0010`\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030;0_0_0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR&\u0010d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160c0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00130b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010eR \u0010h\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u00160&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020k0j8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020o0j8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010mRp\u0010t\u001a^\u0012(\u0012&\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010$ r*\u0012\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010$\u0018\u00010c0c r*.\u0012(\u0012&\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010$ r*\u0012\u0012\u0004\u0012\u00020L\u0012\u0006\u0012\u0004\u0018\u00010$\u0018\u00010c0c\u0018\u00010j0j8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010m¨\u0006u"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/api/retrofit/PathfinderApi;", "pathfinderApi", "Lcom/robinhood/prefs/Installation;", "installation", "Lcom/robinhood/analytics/SharedEventLogger;", "eventLogger", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/api/retrofit/PathfinderApi;Lcom/robinhood/prefs/Installation;Lcom/robinhood/analytics/SharedEventLogger;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/store/StoreBundle;)V", "Ljava/util/UUID;", "inquiryId", "", "sequence", "Lkotlin/Function1;", "", "", "errorHandler", "Lcom/robinhood/models/ui/pathfinder/UserViewState;", "handleErrorInput", "(Ljava/util/UUID;ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "error", "onInputSubmitError", "(Ljava/util/UUID;ILjava/lang/Throwable;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "onUnrecoverableError", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "state", "Lkotlinx/coroutines/Job;", "acceptNewState", "(Ljava/util/UUID;Lcom/robinhood/models/ui/pathfinder/UserViewState;)Lkotlinx/coroutines/Job;", "P", "", "T", "Lcom/robinhood/android/moria/network/Endpoint;", "params", "j$/time/Duration", "interval", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "saveAction", "Lkotlinx/coroutines/flow/Flow;", "backendPoll", "(Lcom/robinhood/android/moria/network/Endpoint;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "block", "networkPollWithBackendInterval", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "force", "refresh", "(Ljava/util/UUID;Ljava/lang/Integer;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/pathfinder/UserViewInputRequest;", "userViewInput", "duration", "poll", "(Ljava/util/UUID;Lcom/robinhood/models/api/pathfinder/UserViewInputRequest;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "streamPageUserViewState", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "(Ljava/util/UUID;I)Lkotlinx/coroutines/flow/Flow;", "streamNonPageUserViewState", "getTopPageUserViewState", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamError", "()Lkotlinx/coroutines/flow/Flow;", "streamBackwardStackSize", "streamTypedPageUserViewState", "Lcom/robinhood/models/api/pathfinder/UserViewInput;", "input", "handleUserInput", "(Ljava/util/UUID;ILcom/robinhood/models/api/pathfinder/UserViewInput;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendUserInput", "(Ljava/util/UUID;ILcom/robinhood/models/api/pathfinder/UserViewInput;)Lkotlinx/coroutines/Job;", "", "handleUserWebInput", "(Ljava/util/UUID;ILjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/ui/PathfinderStateError;", "errorRequest", "(Ljava/util/UUID;Lcom/robinhood/models/ui/PathfinderStateError;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearInquiry", "(Ljava/util/UUID;)V", "popState", "key", "Lcom/robinhood/models/ui/pathfinder/auxcontext/AuxContext;", "fetchAllAuxContext", "(Ljava/util/UUID;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAuxContext", "Lcom/robinhood/api/retrofit/PathfinderApi;", "Lcom/robinhood/prefs/Installation;", "Lcom/robinhood/analytics/SharedEventLogger;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/collections/immutable/ImmutableMap;", "pageUserViewsFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "nonPageUserViewsFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "errorEmitter", "Lcom/robinhood/librobinhood/data/store/UserViewInputRequest;", "postUserViewInputEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/api/pathfinder/userview/ApiUserViewState;", "getUserViewStateAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "userViewStateAdapter", "Lcom/robinhood/librobinhood/data/store/PartialUserViewState;", "getPartialUserViewStateAdapter", "partialUserViewStateAdapter", "kotlin.jvm.PlatformType", "getGenericMapAdapter", "genericMapAdapter", "lib-store-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class PathfinderStore extends Store {
    private final SharedFlow2<Throwable> errorEmitter;
    private final SharedEventLogger eventLogger;
    private final Installation installation;
    private final LazyMoshi moshi;
    private final SharedFlow2<Map<UUID, UserViewState>> nonPageUserViewsFlow;
    private final StateFlow2<ImmutableMap<UUID, ImmutableMap<Integer, UserViewState.Page<?>>>> pageUserViewsFlow;
    private final PathfinderApi pathfinderApi;
    private final Endpoint<UserViewInputRequest, UserViewState> postUserViewInputEndpoint;

    /* compiled from: PathfinderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PathfinderStore", m3645f = "PathfinderStore.kt", m3646l = {548}, m3647m = "fetchAllAuxContext")
    /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$fetchAllAuxContext$1 */
    static final class C342231 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C342231(Continuation<? super C342231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PathfinderStore.this.fetchAllAuxContext(null, 0, null, this);
        }
    }

    /* compiled from: PathfinderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PathfinderStore", m3645f = "PathfinderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE}, m3647m = "getTopPageUserViewState")
    /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$getTopPageUserViewState$1 */
    static final class C342241 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C342241(Continuation<? super C342241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PathfinderStore.this.getTopPageUserViewState(null, this);
        }
    }

    /* compiled from: PathfinderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PathfinderStore", m3645f = "PathfinderStore.kt", m3646l = {343, 356}, m3647m = "handleErrorInput")
    /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$handleErrorInput$2 */
    static final class C342252 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C342252(Continuation<? super C342252> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PathfinderStore.this.handleErrorInput((UUID) null, (PathfinderStateError) null, (Function1<? super Throwable, Boolean>) null, this);
        }
    }

    /* compiled from: PathfinderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PathfinderStore", m3645f = "PathfinderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, m3647m = "handleUserInput")
    /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$handleUserInput$1 */
    static final class C342261 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C342261(Continuation<? super C342261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PathfinderStore.this.handleUserInput(null, 0, null, null, this);
        }
    }

    /* compiled from: PathfinderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PathfinderStore", m3645f = "PathfinderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE}, m3647m = "handleUserWebInput")
    /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$handleUserWebInput$1 */
    static final class C342271 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C342271(Continuation<? super C342271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PathfinderStore.this.handleUserWebInput(null, 0, null, null, this);
        }
    }

    /* compiled from: PathfinderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PathfinderStore", m3645f = "PathfinderStore.kt", m3646l = {97, 99}, m3647m = "refresh")
    /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$refresh$1 */
    static final class C342301 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C342301(Continuation<? super C342301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PathfinderStore.this.refresh(null, null, false, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathfinderStore(PathfinderApi pathfinderApi, Installation installation, SharedEventLogger eventLogger, LazyMoshi moshi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(pathfinderApi, "pathfinderApi");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.pathfinderApi = pathfinderApi;
        this.installation = installation;
        this.eventLogger = eventLogger;
        this.moshi = moshi;
        this.pageUserViewsFlow = StateFlow4.MutableStateFlow(extensions2.persistentMapOf());
        this.nonPageUserViewsFlow = SharedFlow4.MutableSharedFlow$default(0, 0, null, 6, null);
        this.errorEmitter = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
        this.postUserViewInputEndpoint = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new PathfinderStore2(this, null), getLogoutKillswitch(), new PathfinderStore3(this, null), storeBundle.getClock(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<ApiUserViewState> getUserViewStateAdapter() {
        LazyMoshi lazyMoshi = this.moshi;
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<ApiUserViewState>() { // from class: com.robinhood.librobinhood.data.store.PathfinderStore$special$$inlined$getAdapter$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<PathfinderStores> getPartialUserViewStateAdapter() {
        LazyMoshi lazyMoshi = this.moshi;
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<PathfinderStores>() { // from class: com.robinhood.librobinhood.data.store.PathfinderStore$special$$inlined$getAdapter$2
        }.getType());
    }

    private final JsonAdapter<Map<String, Object>> getGenericMapAdapter() {
        LazyMoshi lazyMoshi = this.moshi;
        ParameterizedType parameterizedTypeNewParameterizedType = com.squareup.moshi.Types.newParameterizedType(Map.class, String.class, Object.class);
        Intrinsics.checkNotNullExpressionValue(parameterizedTypeNewParameterizedType, "newParameterizedType(...)");
        return lazyMoshi.adapter(parameterizedTypeNewParameterizedType).serializeNulls();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refresh(UUID uuid, Integer num, boolean z, Continuation<? super Unit> continuation) {
        C342301 c342301;
        ResponseBody responseBody;
        if (continuation instanceof C342301) {
            c342301 = (C342301) continuation;
            int i = c342301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c342301.label = i - Integer.MIN_VALUE;
            } else {
                c342301 = new C342301(continuation);
            }
        }
        Object userViewState = c342301.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c342301.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(userViewState);
            boolean zContainsKey = this.pageUserViewsFlow.getValue().containsKey(uuid);
            if (z || !zContainsKey) {
                if (num == null) {
                    PathfinderApi pathfinderApi = this.pathfinderApi;
                    c342301.L$0 = uuid;
                    c342301.label = 1;
                    userViewState = pathfinderApi.getUserViewState(uuid, c342301);
                } else {
                    PathfinderApi pathfinderApi2 = this.pathfinderApi;
                    int iIntValue = num.intValue();
                    c342301.L$0 = uuid;
                    c342301.label = 2;
                    userViewState = pathfinderApi2.getUserViewState(uuid, iIntValue, c342301);
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i2 == 1) {
            uuid = (UUID) c342301.L$0;
            ResultKt.throwOnFailure(userViewState);
            responseBody = (ResponseBody) userViewState;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uuid = (UUID) c342301.L$0;
            ResultKt.throwOnFailure(userViewState);
            responseBody = (ResponseBody) userViewState;
        }
        acceptNewState(uuid, PathfinderStores2.toUiModel(responseBody, uuid, getUserViewStateAdapter(), getPartialUserViewStateAdapter(), this.eventLogger));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Flow poll$default(PathfinderStore pathfinderStore, UUID uuid, com.robinhood.models.api.pathfinder.UserViewInputRequest userViewInputRequest, Duration duration, int i, Object obj) {
        if ((i & 4) != 0) {
            duration = Duration.ofSeconds(5L);
        }
        return pathfinderStore.poll(uuid, userViewInputRequest, duration);
    }

    public final Flow<UserViewState> poll(UUID inquiryId, com.robinhood.models.api.pathfinder.UserViewInputRequest userViewInput, final Duration duration) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(userViewInput, "userViewInput");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return backendPoll$default(this, this.postUserViewInputEndpoint, new UserViewInputRequest(inquiryId, userViewInput), new Function1() { // from class: com.robinhood.librobinhood.data.store.PathfinderStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderStore.poll$lambda$1(duration, (UserViewState) obj);
            }
        }, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Duration poll$lambda$1(Duration duration, UserViewState userViewState) {
        Long pollingInterval;
        Duration durationOfSeconds;
        return (userViewState == null || (pollingInterval = userViewState.getPollingInterval()) == null || (durationOfSeconds = Duration.ofSeconds(pollingInterval.longValue())) == null) ? duration : durationOfSeconds;
    }

    public final Flow<UserViewState.Page<?>> streamPageUserViewState(final UUID inquiryId) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        final StateFlow2<ImmutableMap<UUID, ImmutableMap<Integer, UserViewState.Page<?>>>> stateFlow2 = this.pageUserViewsFlow;
        return FlowKt.distinctUntilChanged(new Flow<UserViewState.Page<?>>() { // from class: com.robinhood.librobinhood.data.store.PathfinderStore$streamPageUserViewState$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UserViewState.Page<?>> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new C342162(flowCollector, inquiryId), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$streamPageUserViewState$$inlined$mapNotNull$1$2 */
            public static final class C342162<T> implements FlowCollector {
                final /* synthetic */ UUID $inquiryId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PathfinderStore$streamPageUserViewState$$inlined$mapNotNull$1$2", m3645f = "PathfinderStore.kt", m3646l = {53}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$streamPageUserViewState$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return C342162.this.emit(null, this);
                    }
                }

                public C342162(FlowCollector flowCollector, UUID uuid) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$inquiryId$inlined = uuid;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    T next;
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
                        ImmutableMap immutableMap = (ImmutableMap) ((ImmutableMap) obj).get(this.$inquiryId$inlined);
                        UserViewState.Page page = null;
                        if (immutableMap != null) {
                            Iterator<T> it = immutableMap.entrySet().iterator();
                            if (it.hasNext()) {
                                next = it.next();
                                if (it.hasNext()) {
                                    int iIntValue = ((Number) ((Map.Entry) next).getKey()).intValue();
                                    do {
                                        T next2 = it.next();
                                        int iIntValue2 = ((Number) ((Map.Entry) next2).getKey()).intValue();
                                        if (iIntValue < iIntValue2) {
                                            next = next2;
                                            iIntValue = iIntValue2;
                                        }
                                    } while (it.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            Map.Entry entry = (Map.Entry) next;
                            if (entry != null) {
                                page = (UserViewState.Page) entry.getValue();
                            }
                        }
                        if (page != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(page, anonymousClass1) == coroutine_suspended) {
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
        });
    }

    public final Flow<UserViewState> streamPageUserViewState(final UUID inquiryId, final int sequence) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        final StateFlow2<ImmutableMap<UUID, ImmutableMap<Integer, UserViewState.Page<?>>>> stateFlow2 = this.pageUserViewsFlow;
        return new Flow<UserViewState.Page<?>>() { // from class: com.robinhood.librobinhood.data.store.PathfinderStore$streamPageUserViewState$$inlined$mapNotNull$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UserViewState.Page<?>> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new C342172(flowCollector, inquiryId, sequence), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$streamPageUserViewState$$inlined$mapNotNull$2$2 */
            public static final class C342172<T> implements FlowCollector {
                final /* synthetic */ UUID $inquiryId$inlined;
                final /* synthetic */ int $sequence$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PathfinderStore$streamPageUserViewState$$inlined$mapNotNull$2$2", m3645f = "PathfinderStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$streamPageUserViewState$$inlined$mapNotNull$2$2$1, reason: invalid class name */
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
                        return C342172.this.emit(null, this);
                    }
                }

                public C342172(FlowCollector flowCollector, UUID uuid, int i) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$inquiryId$inlined = uuid;
                    this.$sequence$inlined = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        ImmutableMap immutableMap = (ImmutableMap) ((ImmutableMap) obj).get(this.$inquiryId$inlined);
                        UserViewState.Page page = immutableMap != null ? (UserViewState.Page) immutableMap.get(boxing.boxInt(this.$sequence$inlined)) : null;
                        if (page != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(page, anonymousClass1) == coroutine_suspended) {
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

    public final Flow<UserViewState> streamNonPageUserViewState(final UUID inquiryId) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        final SharedFlow2<Map<UUID, UserViewState>> sharedFlow2 = this.nonPageUserViewsFlow;
        return new Flow<UserViewState>() { // from class: com.robinhood.librobinhood.data.store.PathfinderStore$streamNonPageUserViewState$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UserViewState> flowCollector, Continuation continuation) {
                Object objCollect = sharedFlow2.collect(new C342152(flowCollector, inquiryId), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$streamNonPageUserViewState$$inlined$mapNotNull$1$2 */
            public static final class C342152<T> implements FlowCollector {
                final /* synthetic */ UUID $inquiryId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PathfinderStore$streamNonPageUserViewState$$inlined$mapNotNull$1$2", m3645f = "PathfinderStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$streamNonPageUserViewState$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return C342152.this.emit(null, this);
                    }
                }

                public C342152(FlowCollector flowCollector, UUID uuid) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$inquiryId$inlined = uuid;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object obj3 = ((Map) obj).get(this.$inquiryId$inlined);
                        if (obj3 != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getTopPageUserViewState(UUID uuid, Continuation<? super UserViewState.Page<?>> continuation) {
        C342241 c342241;
        ImmutableMap immutableMap;
        Object next;
        if (continuation instanceof C342241) {
            c342241 = (C342241) continuation;
            int i = c342241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c342241.label = i - Integer.MIN_VALUE;
            } else {
                c342241 = new C342241(continuation);
            }
        }
        Object objFirstOrNull = c342241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c342241.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            StateFlow2<ImmutableMap<UUID, ImmutableMap<Integer, UserViewState.Page<?>>>> stateFlow2 = this.pageUserViewsFlow;
            c342241.L$0 = uuid;
            c342241.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(stateFlow2, c342241);
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uuid = (UUID) c342241.L$0;
            ResultKt.throwOnFailure(objFirstOrNull);
        }
        ImmutableMap immutableMap2 = (ImmutableMap) objFirstOrNull;
        if (immutableMap2 != null && (immutableMap = (ImmutableMap) immutableMap2.get(uuid)) != null) {
            Iterator it = immutableMap.entrySet().iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((Map.Entry) next).getKey()).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((Map.Entry) next2).getKey()).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                return (UserViewState.Page) entry.getValue();
            }
        }
        return null;
    }

    public final Flow<Throwable> streamError() {
        return this.errorEmitter;
    }

    public final Flow<Integer> streamBackwardStackSize(final UUID inquiryId) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        final StateFlow2<ImmutableMap<UUID, ImmutableMap<Integer, UserViewState.Page<?>>>> stateFlow2 = this.pageUserViewsFlow;
        return new Flow<Integer>() { // from class: com.robinhood.librobinhood.data.store.PathfinderStore$streamBackwardStackSize$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new C342142(flowCollector, inquiryId, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$streamBackwardStackSize$$inlined$map$1$2 */
            public static final class C342142<T> implements FlowCollector {
                final /* synthetic */ UUID $inquiryId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ PathfinderStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PathfinderStore$streamBackwardStackSize$$inlined$map$1$2", m3645f = "PathfinderStore.kt", m3646l = {52, 50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$streamBackwardStackSize$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C342142.this.emit(null, this);
                    }
                }

                public C342142(FlowCollector flowCollector, UUID uuid, PathfinderStore pathfinderStore) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$inquiryId$inlined = uuid;
                    this.this$0 = pathfinderStore;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
                
                    if (r9 == r1) goto L43;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x00b9, code lost:
                
                    if (r2.emit(r8, r0) != r1) goto L44;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
                
                    return r1;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    FlowCollector flowCollector;
                    ImmutableMap immutableMap;
                    Integer numBoxInt;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object topPageUserViewState = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    int i3 = 0;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(topPageUserViewState);
                        flowCollector = this.$this_unsafeFlow;
                        immutableMap = (ImmutableMap) ((ImmutableMap) obj).get(this.$inquiryId$inlined);
                        if (immutableMap == null) {
                            numBoxInt = boxing.boxInt(0);
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.label = 2;
                        } else {
                            PathfinderStore pathfinderStore = this.this$0;
                            UUID uuid = this.$inquiryId$inlined;
                            anonymousClass1.L$0 = flowCollector;
                            anonymousClass1.L$1 = immutableMap;
                            anonymousClass1.label = 1;
                            topPageUserViewState = pathfinderStore.getTopPageUserViewState(uuid, anonymousClass1);
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(topPageUserViewState);
                            return Unit.INSTANCE;
                        }
                        immutableMap = (ImmutableMap) anonymousClass1.L$1;
                        flowCollector = (FlowCollector) anonymousClass1.L$0;
                        ResultKt.throwOnFailure(topPageUserViewState);
                    }
                    UserViewState.Page page = (UserViewState.Page) topPageUserViewState;
                    if (page == null) {
                        numBoxInt = boxing.boxInt(0);
                    } else {
                        Iterable<UserViewState.Page> iterableValues = immutableMap.values();
                        if (!(iterableValues instanceof Collection) || !((Collection) iterableValues).isEmpty()) {
                            for (UserViewState.Page page2 : iterableValues) {
                                if (UserViewStates4.getShouldAddToBackStack(page2) || Intrinsics.areEqual(page2, page)) {
                                    i3++;
                                    if (i3 < 0) {
                                        CollectionsKt.throwCountOverflow();
                                    }
                                }
                            }
                        }
                        numBoxInt = boxing.boxInt(i3);
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                }
            }
        };
    }

    public final /* synthetic */ <T extends UserViewState.Page<?>> Flow<T> streamTypedPageUserViewState(UUID inquiryId) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Flow<UserViewState.Page<?>> flowStreamPageUserViewState = streamPageUserViewState(inquiryId);
        Intrinsics.needClassReification();
        return new C34218xa6da9e73(flowStreamPageUserViewState);
    }

    public final /* synthetic */ <T extends UserViewState.Page<?>> Flow<T> streamTypedPageUserViewState(UUID inquiryId, int sequence) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Flow<UserViewState> flowStreamPageUserViewState = streamPageUserViewState(inquiryId, sequence);
        Intrinsics.needClassReification();
        return new C34219xa6da9e74(flowStreamPageUserViewState);
    }

    public static /* synthetic */ Object handleUserInput$default(PathfinderStore pathfinderStore, UUID uuid, int i, UserViewInput userViewInput, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        return pathfinderStore.handleUserInput(uuid, i, userViewInput, function1, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        if (r13 != r7) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleUserInput(UUID uuid, int i, UserViewInput userViewInput, Function1<? super Throwable, Boolean> function1, Continuation<? super UserViewState> continuation) {
        C342261 c342261;
        if (continuation instanceof C342261) {
            c342261 = (C342261) continuation;
            int i2 = c342261.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c342261.label = i2 - Integer.MIN_VALUE;
            } else {
                c342261 = new C342261(continuation);
            }
        }
        C342261 c3422612 = c342261;
        Object objOnInputSubmitError = c3422612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c3422612.label;
        try {
        } catch (Throwable th) {
            UUID uuid2 = uuid;
            int i4 = i;
            Function1<? super Throwable, Boolean> function12 = function1;
            c3422612.L$0 = null;
            c3422612.L$1 = null;
            c3422612.label = 2;
            objOnInputSubmitError = onInputSubmitError(uuid2, i4, th, function12, c3422612);
        }
        if (i3 == 0) {
            ResultKt.throwOnFailure(objOnInputSubmitError);
            PathfinderApi pathfinderApi = this.pathfinderApi;
            com.robinhood.models.api.pathfinder.UserViewInputRequest userViewInputRequest = new com.robinhood.models.api.pathfinder.UserViewInputRequest(i, userViewInput);
            c3422612.L$0 = uuid;
            c3422612.L$1 = function1;
            c3422612.I$0 = i;
            c3422612.label = 1;
            objOnInputSubmitError = pathfinderApi.sendUserViewInput(uuid, userViewInputRequest, c3422612);
            if (objOnInputSubmitError == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objOnInputSubmitError);
                return (UserViewState) objOnInputSubmitError;
            }
            i = c3422612.I$0;
            function1 = (Function1) c3422612.L$1;
            uuid = (UUID) c3422612.L$0;
            ResultKt.throwOnFailure(objOnInputSubmitError);
        }
        UserViewState uiModel = PathfinderStores2.toUiModel((ResponseBody) objOnInputSubmitError, uuid, getUserViewStateAdapter(), getPartialUserViewStateAdapter(), this.eventLogger);
        acceptNewState(uuid, uiModel);
        return uiModel;
    }

    /* compiled from: PathfinderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PathfinderStore$sendUserInput$1", m3645f = "PathfinderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$sendUserInput$1 */
    static final class C342311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UserViewInput $input;
        final /* synthetic */ UUID $inquiryId;
        final /* synthetic */ int $sequence;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C342311(UUID uuid, int i, UserViewInput userViewInput, Continuation<? super C342311> continuation) {
            super(2, continuation);
            this.$inquiryId = uuid;
            this.$sequence = i;
            this.$input = userViewInput;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PathfinderStore.this.new C342311(this.$inquiryId, this.$sequence, this.$input, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C342311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PathfinderApi pathfinderApi = PathfinderStore.this.pathfinderApi;
                    UUID uuid = this.$inquiryId;
                    com.robinhood.models.api.pathfinder.UserViewInputRequest userViewInputRequest = new com.robinhood.models.api.pathfinder.UserViewInputRequest(this.$sequence, this.$input);
                    this.label = 1;
                    if (pathfinderApi.sendUserViewInput(uuid, userViewInputRequest, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            }
            return Unit.INSTANCE;
        }
    }

    public final Job sendUserInput(UUID inquiryId, int sequence, UserViewInput input) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(input, "input");
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C342311(inquiryId, sequence, input, null), 3, null);
    }

    public static /* synthetic */ Object handleUserWebInput$default(PathfinderStore pathfinderStore, UUID uuid, int i, String str, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        return pathfinderStore.handleUserWebInput(uuid, i, str, function1, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (r13 != r7) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleUserWebInput(UUID uuid, int i, String str, Function1<? super Throwable, Boolean> function1, Continuation<? super UserViewState> continuation) {
        C342271 c342271;
        if (continuation instanceof C342271) {
            c342271 = (C342271) continuation;
            int i2 = c342271.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c342271.label = i2 - Integer.MIN_VALUE;
            } else {
                c342271 = new C342271(continuation);
            }
        }
        C342271 c3422712 = c342271;
        Object objOnInputSubmitError = c3422712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c3422712.label;
        try {
        } catch (Throwable th) {
            UUID uuid2 = uuid;
            int i4 = i;
            Function1<? super Throwable, Boolean> function12 = function1;
            c3422712.L$0 = null;
            c3422712.L$1 = null;
            c3422712.label = 2;
            objOnInputSubmitError = onInputSubmitError(uuid2, i4, th, function12, c3422712);
        }
        if (i3 == 0) {
            ResultKt.throwOnFailure(objOnInputSubmitError);
            Map<String, Object> mapFromJson = getGenericMapAdapter().fromJson(str);
            Intrinsics.checkNotNull(mapFromJson);
            PathfinderApi pathfinderApi = this.pathfinderApi;
            GenericUserViewInputRequest genericUserViewInputRequest = new GenericUserViewInputRequest(i, mapFromJson);
            c3422712.L$0 = uuid;
            c3422712.L$1 = function1;
            c3422712.I$0 = i;
            c3422712.label = 1;
            objOnInputSubmitError = pathfinderApi.sendUserViewWebInput(uuid, genericUserViewInputRequest, c3422712);
            if (objOnInputSubmitError == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objOnInputSubmitError);
                return (UserViewState) objOnInputSubmitError;
            }
            i = c3422712.I$0;
            function1 = (Function1) c3422712.L$1;
            uuid = (UUID) c3422712.L$0;
            ResultKt.throwOnFailure(objOnInputSubmitError);
        }
        UserViewState uiModel = PathfinderStores2.toUiModel((ResponseBody) objOnInputSubmitError, uuid, getUserViewStateAdapter(), getPartialUserViewStateAdapter(), this.eventLogger);
        acceptNewState(uuid, uiModel);
        return uiModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object handleErrorInput$default(PathfinderStore pathfinderStore, UUID uuid, int i, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return pathfinderStore.handleErrorInput(uuid, i, (Function1<? super Throwable, Boolean>) function1, (Continuation<? super UserViewState>) continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleErrorInput(UUID uuid, int i, Function1<? super Throwable, Boolean> function1, Continuation<? super UserViewState> continuation) {
        return handleErrorInput(uuid, new PathfinderStateError(i, this.installation.mo2745id()), function1, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object handleErrorInput$default(PathfinderStore pathfinderStore, UUID uuid, PathfinderStateError pathfinderStateError, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return pathfinderStore.handleErrorInput(uuid, pathfinderStateError, (Function1<? super Throwable, Boolean>) function1, (Continuation<? super UserViewState>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleErrorInput(UUID uuid, PathfinderStateError pathfinderStateError, Function1<? super Throwable, Boolean> function1, Continuation<? super UserViewState> continuation) {
        C342252 c342252;
        if (continuation instanceof C342252) {
            c342252 = (C342252) continuation;
            int i = c342252.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c342252.label = i - Integer.MIN_VALUE;
            } else {
                c342252 = new C342252(continuation);
            }
        }
        Object objSendErrorInput = c342252.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c342252.label;
        try {
        } catch (Throwable th) {
            c342252.L$0 = null;
            c342252.L$1 = null;
            c342252.label = 2;
            if (onUnrecoverableError(function1, th, c342252) == coroutine_suspended) {
            }
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendErrorInput);
            PathfinderApi pathfinderApi = this.pathfinderApi;
            c342252.L$0 = uuid;
            c342252.L$1 = function1;
            c342252.label = 1;
            objSendErrorInput = pathfinderApi.sendErrorInput(uuid, pathfinderStateError, c342252);
            if (objSendErrorInput == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendErrorInput);
                return null;
            }
            function1 = (Function1) c342252.L$1;
            uuid = (UUID) c342252.L$0;
            ResultKt.throwOnFailure(objSendErrorInput);
        }
        UserViewState uiModel = PathfinderStores2.toUiModel((ResponseBody) objSendErrorInput, uuid, getUserViewStateAdapter(), getPartialUserViewStateAdapter(), this.eventLogger);
        acceptNewState(uuid, uiModel);
        return uiModel;
    }

    static /* synthetic */ Object onInputSubmitError$default(PathfinderStore pathfinderStore, UUID uuid, int i, Throwable th, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        return pathfinderStore.onInputSubmitError(uuid, i, th, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onInputSubmitError(UUID uuid, int i, Throwable th, Function1<? super Throwable, Boolean> function1, Continuation<? super UserViewState> continuation) {
        if (function1 != null && function1.invoke(th).booleanValue()) {
            return null;
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Exception("Unhandled submission error, requesting fallback state", th), false, null, 6, null);
        return handleErrorInput(uuid, i, (Function1<? super Throwable, Boolean>) null, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object onUnrecoverableError$default(PathfinderStore pathfinderStore, Function1 function1, Throwable th, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return pathfinderStore.onUnrecoverableError(function1, th, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onUnrecoverableError(Function1<? super Throwable, Boolean> function1, Throwable th, Continuation<? super Unit> continuation) throws Throwable {
        if (th instanceof CancellationException) {
            throw th;
        }
        if (function1 == null || !function1.invoke(th).booleanValue()) {
            Object objEmit = this.errorEmitter.emit(th, continuation);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: PathfinderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PathfinderStore$clearInquiry$1", m3645f = "PathfinderStore.kt", m3646l = {409, 411}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$clearInquiry$1 */
    static final class C342221 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $inquiryId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C342221(UUID uuid, Continuation<? super C342221> continuation) {
            super(2, continuation);
            this.$inquiryId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PathfinderStore.this.new C342221(this.$inquiryId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C342221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
        
            if (r1.emit(r5, r4) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2 stateFlow2 = PathfinderStore.this.pageUserViewsFlow;
                this.label = 1;
                obj = FlowKt.firstOrNull(stateFlow2, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ImmutableMap immutableMap = (ImmutableMap) obj;
            if (immutableMap == null) {
                return Unit.INSTANCE;
            }
            Map mapMinus = MapsKt.minus((Map<? extends UUID, ? extends V>) MapsKt.toMap(immutableMap), this.$inquiryId);
            StateFlow2 stateFlow22 = PathfinderStore.this.pageUserViewsFlow;
            ImmutableMap immutableMap2 = extensions2.toImmutableMap(mapMinus);
            this.label = 2;
        }
    }

    public final void clearInquiry(UUID inquiryId) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C342221(inquiryId, null), 3, null);
    }

    /* compiled from: PathfinderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PathfinderStore$popState$1", m3645f = "PathfinderStore.kt", m3646l = {417, 420, 470}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$popState$1 */
    static final class C342291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $inquiryId;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C342291(UUID uuid, Continuation<? super C342291> continuation) {
            super(2, continuation);
            this.$inquiryId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PathfinderStore.this.new C342291(this.$inquiryId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C342291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x00ec, code lost:
        
            if (r1.emit(r11, r10) != r0) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SortedMap treeMap;
            ImmutableMap immutableMap;
            Map mapPlus;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2 stateFlow2 = PathfinderStore.this.pageUserViewsFlow;
                this.label = 1;
                obj = FlowKt.firstOrNull(stateFlow2, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                treeMap = (SortedMap) this.L$1;
                immutableMap = (ImmutableMap) this.L$0;
                ResultKt.throwOnFailure(obj);
                UserViewState.Page page = (UserViewState.Page) obj;
                int i2 = 0;
                while (!treeMap.isEmpty()) {
                    Integer num = (Integer) treeMap.lastKey();
                    Object value = MapsKt.getValue(treeMap, num);
                    if (value == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    UserViewState.Page page2 = (UserViewState.Page) value;
                    if (!UserViewStates4.getShouldAddToBackStack(page2) && !Intrinsics.areEqual(page2, page)) {
                        treeMap.remove(num);
                    } else {
                        if (i2 >= 1) {
                            break;
                        }
                        treeMap.remove(num);
                        i2++;
                        boxing.boxInt(i2);
                    }
                }
                if (!treeMap.isEmpty()) {
                    mapPlus = MapsKt.minus((Map<? extends UUID, ? extends V>) MapsKt.toMap(immutableMap), this.$inquiryId);
                } else {
                    mapPlus = MapsKt.plus(MapsKt.toMap(immutableMap), Tuples4.m3642to(this.$inquiryId, extensions2.toImmutableMap(treeMap)));
                }
                StateFlow2 stateFlow22 = PathfinderStore.this.pageUserViewsFlow;
                ImmutableMap immutableMap2 = extensions2.toImmutableMap(mapPlus);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
            }
            ImmutableMap immutableMap3 = (ImmutableMap) obj;
            if (immutableMap3 == null) {
                return Unit.INSTANCE;
            }
            ImmutableMap immutableMap4 = (ImmutableMap) immutableMap3.get(this.$inquiryId);
            if (immutableMap4 == null || (treeMap = MapsKt.toSortedMap(immutableMap4)) == null) {
                treeMap = new TreeMap();
            }
            PathfinderStore pathfinderStore = PathfinderStore.this;
            UUID uuid = this.$inquiryId;
            this.L$0 = immutableMap3;
            this.L$1 = treeMap;
            this.label = 2;
            Object topPageUserViewState = pathfinderStore.getTopPageUserViewState(uuid, this);
            if (topPageUserViewState != coroutine_suspended) {
                immutableMap = immutableMap3;
                obj = topPageUserViewState;
                UserViewState.Page page3 = (UserViewState.Page) obj;
                int i22 = 0;
                while (!treeMap.isEmpty()) {
                }
                if (!treeMap.isEmpty()) {
                }
                StateFlow2 stateFlow222 = PathfinderStore.this.pageUserViewsFlow;
                ImmutableMap immutableMap22 = extensions2.toImmutableMap(mapPlus);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
            }
            return coroutine_suspended;
        }
    }

    public final void popState(UUID inquiryId) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C342291(inquiryId, null), 3, null);
    }

    /* compiled from: PathfinderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PathfinderStore$acceptNewState$1", m3645f = "PathfinderStore.kt", m3646l = {475, 503, 505}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$acceptNewState$1 */
    static final class C342201 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $inquiryId;
        final /* synthetic */ UserViewState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C342201(UUID uuid, UserViewState userViewState, Continuation<? super C342201> continuation) {
            super(2, continuation);
            this.$inquiryId = uuid;
            this.$state = userViewState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PathfinderStore.this.new C342201(this.$inquiryId, this.$state, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C342201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00e5, code lost:
        
            if (r1.emit(r14, r13) == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0104, code lost:
        
            if (r14.emit(r1, r13) == r0) goto L42;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SortedMap treeMap;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2 stateFlow2 = PathfinderStore.this.pageUserViewsFlow;
                this.label = 1;
                obj = FlowKt.firstOrNull(stateFlow2, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ImmutableMap immutableMap = (ImmutableMap) obj;
            if (immutableMap == null) {
                return Unit.INSTANCE;
            }
            ImmutableMap immutableMap2 = (ImmutableMap) immutableMap.get(this.$inquiryId);
            if (immutableMap2 == null || (treeMap = MapsKt.toSortedMap(immutableMap2)) == null) {
                treeMap = new TreeMap();
            }
            SortedMap sortedMap = treeMap;
            if (!sortedMap.isEmpty()) {
                if (this.$state.getSequence() < ((Integer) treeMap.lastKey()).intValue()) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("Rejecting new state with lower sequence: " + this.$state), false, null, 4, null);
                    return Unit.INSTANCE;
                }
            }
            if (this.$state.getShouldReplaceCurrentPage() && !sortedMap.isEmpty()) {
                treeMap.remove(treeMap.lastKey());
            }
            UserViewState userViewState = this.$state;
            if (!(userViewState instanceof UserViewState.Page)) {
                SharedFlow2 sharedFlow2 = PathfinderStore.this.nonPageUserViewsFlow;
                ImmutableMap3 immutableMap3PersistentMapOf = extensions2.persistentMapOf(Tuples4.m3642to(this.$inquiryId, this.$state));
                this.label = 3;
            } else {
                Tuples2 tuples2M3642to = Tuples4.m3642to(boxing.boxInt(((UserViewState.Page) userViewState).getSequence()), this.$state);
                sortedMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                Map mapPlus = MapsKt.plus(immutableMap, Tuples4.m3642to(this.$inquiryId, extensions2.toImmutableMap(sortedMap)));
                StateFlow2 stateFlow22 = PathfinderStore.this.pageUserViewsFlow;
                ImmutableMap immutableMap3 = extensions2.toImmutableMap(mapPlus);
                this.label = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job acceptNewState(UUID inquiryId, UserViewState state) {
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C342201(inquiryId, state, null), 3, null);
    }

    static /* synthetic */ Flow backendPoll$default(PathfinderStore pathfinderStore, Endpoint endpoint, Object obj, Function1 function1, Function3 function3, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: com.robinhood.librobinhood.data.store.PathfinderStore$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return PathfinderStore.backendPoll$lambda$9(obj3);
                }
            };
        }
        if ((i & 4) != 0) {
            function3 = endpoint.getDefaultSaveAction();
        }
        return pathfinderStore.backendPoll(endpoint, obj, function1, function3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Duration backendPoll$lambda$9(Object obj) {
        return Duration.ofSeconds(5L);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: PathfinderStore.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "T", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PathfinderStore$backendPoll$2", m3645f = "PathfinderStore.kt", m3646l = {515}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$backendPoll$2 */
    static final class C342212<T> extends ContinuationImpl7 implements Function1<Continuation<? super T>, Object> {
        final /* synthetic */ P $params;
        final /* synthetic */ Function3<P, T, Continuation<? super Unit>, Object> $saveAction;
        final /* synthetic */ Endpoint<P, T> $this_backendPoll;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C342212(Endpoint<P, T> endpoint, P p, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C342212> continuation) {
            super(1, continuation);
            this.$this_backendPoll = endpoint;
            this.$params = p;
            this.$saveAction = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C342212(this.$this_backendPoll, this.$params, this.$saveAction, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super T> continuation) {
            return ((C342212) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Endpoint<P, T> endpoint = this.$this_backendPoll;
            P p = this.$params;
            Function function = this.$saveAction;
            this.label = 1;
            Object objForceFetch = endpoint.forceFetch(p, function, this);
            return objForceFetch == coroutine_suspended ? coroutine_suspended : objForceFetch;
        }
    }

    private final <P, T> Flow<T> backendPoll(Endpoint<P, T> endpoint, P p, Function1<? super T, Duration> function1, Function3<? super P, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return FlowKt.filterNotNull(ErrorHandling3.ignoreNetworkExceptions(networkPollWithBackendInterval(function1, new C342212(endpoint, p, function3, null)), function1.invoke(null)));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: PathfinderStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/flow/FlowCollector;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PathfinderStore$networkPollWithBackendInterval$1", m3645f = "PathfinderStore.kt", m3646l = {526, 529, 536, 539}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.PathfinderStore$networkPollWithBackendInterval$1 */
    static final class C342281<T> extends ContinuationImpl7 implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $block;
        final /* synthetic */ Function1<T, Duration> $interval;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C342281(Function1<? super Continuation<? super T>, ? extends Object> function1, Function1<? super T, Duration> function12, Continuation<? super C342281> continuation) {
            super(2, continuation);
            this.$block = function1;
            this.$interval = function12;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C342281 c342281 = new C342281(this.$block, this.$interval, continuation);
            c342281.L$0 = obj;
            return c342281;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C342281) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0076 -> B:18:0x0041). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0092 -> B:18:0x0041). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            boolean zIsNetworkRelated;
            Object objDelay;
            FlowCollector flowCollector2;
            FlowCollector flowCollector3;
            Object obj2;
            long millis;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
            } else {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        flowCollector2 = flowCollector;
                    } finally {
                        if (zIsNetworkRelated) {
                            if (objDelay != coroutine_suspended) {
                                Function1<Continuation<? super T>, Object> function1 = this.$block;
                                this.L$0 = flowCollector;
                                this.label = 1;
                                obj = function1.invoke(this);
                                flowCollector2 = flowCollector;
                                if (obj != coroutine_suspended) {
                                }
                            }
                            return coroutine_suspended;
                        }
                    }
                    this.L$0 = flowCollector2;
                    this.L$1 = obj;
                    this.label = 3;
                    if (flowCollector2.emit(obj, this) != coroutine_suspended) {
                        flowCollector3 = flowCollector2;
                        obj2 = obj;
                        millis = ((Duration) this.$interval.invoke(obj2)).toMillis();
                        this.L$0 = flowCollector3;
                        this.L$1 = null;
                        this.label = 4;
                        if (DelayKt.delay(millis, this) != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    if (i == 3) {
                        obj2 = this.L$1;
                        flowCollector3 = (FlowCollector) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        millis = ((Duration) this.$interval.invoke(obj2)).toMillis();
                        this.L$0 = flowCollector3;
                        this.L$1 = null;
                        this.label = 4;
                        if (DelayKt.delay(millis, this) != coroutine_suspended) {
                            flowCollector = flowCollector3;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector = flowCollector4;
            }
            Function1<Continuation<? super T>, Object> function12 = this.$block;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = function12.invoke(this);
            flowCollector2 = flowCollector;
            if (obj != coroutine_suspended) {
                this.L$0 = flowCollector2;
                this.L$1 = obj;
                this.label = 3;
                if (flowCollector2.emit(obj, this) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    private final <T> Flow<T> networkPollWithBackendInterval(Function1<? super T, Duration> interval, Function1<? super Continuation<? super T>, ? extends Object> block) {
        return FlowKt.flow(new C342281(block, interval, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAllAuxContext(UUID uuid, int i, String str, Continuation<? super AuxContext> continuation) {
        C342231 c342231;
        if (continuation instanceof C342231) {
            c342231 = (C342231) continuation;
            int i2 = c342231.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c342231.label = i2 - Integer.MIN_VALUE;
            } else {
                c342231 = new C342231(continuation);
            }
        }
        Object auxContext = c342231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c342231.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(auxContext);
            PathfinderApi pathfinderApi = this.pathfinderApi;
            c342231.label = 1;
            auxContext = pathfinderApi.getAuxContext(uuid, i, str, c342231);
            if (auxContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(auxContext);
        }
        return AuxContext2.toUiModel((ApiAuxContext) auxContext);
    }

    public final /* synthetic */ <T extends AuxContext> Object fetchAuxContext(UUID uuid, int i, String str, Continuation<? super T> continuation) throws InvalidAuxContextException {
        try {
            InlineMarker.mark(0);
            Object objFetchAllAuxContext = fetchAllAuxContext(uuid, i, str, continuation);
            InlineMarker.mark(1);
            Intrinsics.reifiedOperationMarker(1, "T");
            return (AuxContext) objFetchAllAuxContext;
        } catch (ClassCastException e) {
            throw new InvalidAuxContextException(e);
        }
    }
}
