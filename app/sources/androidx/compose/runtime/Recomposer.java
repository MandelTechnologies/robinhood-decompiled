package androidx.compose.runtime;

import androidx.collection.ObjectList;
import androidx.collection.ObjectList2;
import androidx.collection.ObjectList3;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMap6;
import androidx.collection.ScatterMap7;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSet2;
import androidx.collection.ScatterSet5;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScatterSetWrapper2;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet2;
import androidx.compose.runtime.external.kotlinx.collections.immutable.extensions;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateObjectImpl2;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionObserver2;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: Recomposer.kt */
@Metadata(m3635d1 = {"\u0000¬\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 É\u00012\u00020\u0001:\bÉ\u0001Ê\u0001Ë\u0001Ì\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u001f\u0010 JN\u0010+\u001a\u00020\u00072<\u0010*\u001a8\b\u0001\u0012\u0004\u0012\u00020\"\u0012\u0013\u0012\u00110#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070'\u0012\u0006\u0012\u0004\u0018\u00010(0!¢\u0006\u0002\b)H\u0082@¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b-\u0010\u001cJ)\u00100\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\u00132\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010.H\u0002¢\u0006\u0004\b0\u00101J3\u00105\u001a\b\u0012\u0004\u0012\u00020\u0013022\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010.H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0007H\u0002¢\u0006\u0004\b7\u0010\u0019J#\u00109\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0007082\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b9\u0010:J3\u0010;\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0007082\u0006\u0010\u001a\u001a\u00020\u00132\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010.H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u00072\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0007H\u0086@¢\u0006\u0004\bA\u0010 J\r\u0010B\u001a\u00020\u0007¢\u0006\u0004\bB\u0010\u0019J\u0010\u0010C\u001a\u00020\u0007H\u0086@¢\u0006\u0004\bC\u0010 J%\u0010H\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00132\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00070DH\u0010¢\u0006\u0004\bF\u0010GJ\r\u0010I\u001a\u00020\u0007¢\u0006\u0004\bI\u0010\u0019J\r\u0010J\u001a\u00020\u0007¢\u0006\u0004\bJ\u0010\u0019J\u001d\u0010P\u001a\u00020\u00072\f\u0010M\u001a\b\u0012\u0004\u0012\u00020L0KH\u0010¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0010¢\u0006\u0004\bQ\u0010\u001cJ\u0017\u0010T\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0010¢\u0006\u0004\bS\u0010\u001cJ\u0017\u0010X\u001a\u00020\u00072\u0006\u0010U\u001a\u000203H\u0010¢\u0006\u0004\bV\u0010WJ\u0017\u0010Z\u001a\u00020\u00072\u0006\u0010U\u001a\u000203H\u0010¢\u0006\u0004\bY\u0010WJ+\u0010a\u001a\u00020\u00072\u0006\u0010U\u001a\u0002032\u0006\u0010\\\u001a\u00020[2\n\u0010^\u001a\u0006\u0012\u0002\b\u00030]H\u0010¢\u0006\u0004\b_\u0010`J\u0017\u0010c\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0013H\u0010¢\u0006\u0004\bb\u0010\u001cJ\u0019\u0010f\u001a\u0004\u0018\u00010[2\u0006\u0010U\u001a\u000203H\u0010¢\u0006\u0004\bd\u0010eR$\u0010i\u001a\u00020g2\u0006\u0010h\u001a\u00020g8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010p\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010r\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010t\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00130v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u001e\u0010y\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010xR\u001c\u0010z\u001a\b\u0012\u0004\u0012\u00020(0.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00130|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00130v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010xR\u001c\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u0002030v8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010xR3\u0010\u0083\u0001\u001a\u0018\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010(0\u0082\u0001\u0012\u0004\u0012\u0002030\u0081\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R$\u0010\u0089\u0001\u001a\u000f\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020[0\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0084\u0001R*\u0010\u008a\u0001\u001a\u000f\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002030\u0081\u00018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0084\u0001R \u0010\u008b\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010xR!\u0010\u008c\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R!\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001a\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u0098\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0094\u0001R\u001f\u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u00030\u009a\u00010\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R'\u0010\u009f\u0001\u001a\u0012\u0012\r\u0012\u000b\u0012\u0005\u0012\u00030\u009e\u0001\u0018\u00010.0\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¢\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R*\u0010©\u0001\u001a\f\u0012\u0005\u0012\u00030¨\u0001\u0018\u00010§\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u000f\n\u0006\b©\u0001\u0010ª\u0001\u0012\u0005\b«\u0001\u0010\u0019R\u001c\u0010\u00ad\u0001\u001a\u00070¬\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u001d\u0010±\u0001\u001a\b\u0012\u0004\u0012\u00020\u0013028BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0016\u0010³\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010\fR\u0016\u0010µ\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010\fR\u0016\u0010·\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010\fR\u0016\u0010¹\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010\fR\u0016\u0010»\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\fR\u001c\u0010¿\u0001\u001a\n\u0012\u0005\u0012\u00030\u009a\u00010¼\u00018F¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001R\u0018\u0010Â\u0001\u001a\u00030\u0090\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0016\u0010Ä\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010\fR\u0016\u0010Æ\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010\fR\u0016\u0010È\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Í\u0001"}, m3636d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Lkotlinx/coroutines/CancellableContinuation;", "", "deriveStateLocked", "()Lkotlinx/coroutines/CancellableContinuation;", "", "recordComposerModifications", "()Z", "Lkotlinx/coroutines/Job;", "callingJob", "registerRunnerJob", "(Lkotlinx/coroutines/Job;)V", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Landroidx/compose/runtime/ControlledComposition;", "failedInitialComposition", "recoverable", "processCompositionError", "(Ljava/lang/Throwable;Landroidx/compose/runtime/ControlledComposition;Z)V", "clearKnownCompositionsLocked", "()V", "composition", "removeKnownCompositionLocked", "(Landroidx/compose/runtime/ControlledComposition;)V", "addKnownCompositionLocked", "recordFailedCompositionLocked", "awaitWorkAvailable", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/ParameterName;", "name", "parentFrameClock", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "recompositionRunner", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performInitialMovableContentInserts", "Landroidx/collection/MutableScatterSet;", "modifiedValues", "performRecompose", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;)Landroidx/compose/runtime/ControlledComposition;", "", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "performInsertValues", "(Ljava/util/List;Landroidx/collection/MutableScatterSet;)Ljava/util/List;", "discardUnusedMovableContentState", "Lkotlin/Function1;", "readObserverOf", "(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/jvm/functions/Function1;", "writeObserverOf", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "snapshot", "applyAndCheck", "(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "runRecomposeAndApplyChanges", "cancel", "join", "Lkotlin/Function0;", "content", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composeInitial", "pauseCompositionFrameClock", "resumeCompositionFrameClock", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime_release", "(Ljava/util/Set;)V", "recordInspectionTable", "unregisterComposition$runtime_release", "unregisterComposition", "invalidate$runtime_release", "invalidate", "reference", "insertMovableContent$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime_release", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", WebsocketGatewayConstants.DATA_KEY, "Landroidx/compose/runtime/Applier;", "applier", "movableContentStateReleased$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/Applier;)V", "movableContentStateReleased", "reportRemovedComposition$runtime_release", "reportRemovedComposition", "movableContentStateResolve$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "", "<set-?>", "changeCount", "J", "getChangeCount", "()J", "Landroidx/compose/runtime/BroadcastFrameClock;", "broadcastFrameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "stateLock", "Ljava/lang/Object;", "runnerJob", "Lkotlinx/coroutines/Job;", "closeCause", "Ljava/lang/Throwable;", "", "_knownCompositions", "Ljava/util/List;", "_knownCompositionsCache", "snapshotInvalidations", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/collection/MutableVector;", "compositionInvalidations", "Landroidx/compose/runtime/collection/MutableVector;", "compositionsAwaitingApply", "movableContentAwaitingInsert", "Landroidx/compose/runtime/collection/MultiValueMap;", "Landroidx/compose/runtime/MovableContent;", "movableContentRemoved", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/NestedContentMap;", "movableContentNestedStatesAvailable", "Landroidx/compose/runtime/NestedContentMap;", "Landroidx/collection/MutableScatterMap;", "movableContentStatesAvailable", "movableContentNestedExtractionsPending", "failedCompositions", "compositionsRemoved", "Ljava/util/Set;", "workContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "concurrentCompositionsOutstanding", "I", "isClosed", "Z", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "errorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "frameClockPaused", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/Recomposer$State;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "pausedScopes", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "Lkotlinx/coroutines/CompletableJob;", "effectJob", "Lkotlinx/coroutines/CompletableJob;", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;", "registrationObservers", "Landroidx/collection/MutableObjectList;", "getRegistrationObservers$annotations", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "recomposerInfo", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "getKnownCompositions", "()Ljava/util/List;", "knownCompositions", "getHasBroadcastFrameClockAwaitersLocked", "hasBroadcastFrameClockAwaitersLocked", "getHasBroadcastFrameClockAwaiters", "hasBroadcastFrameClockAwaiters", "getShouldKeepRecomposing", "shouldKeepRecomposing", "getHasSchedulingWork", "hasSchedulingWork", "getHasFrameWorkLocked", "hasFrameWorkLocked", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentState", "()Lkotlinx/coroutines/flow/StateFlow;", "currentState", "getCompoundHashKey$runtime_release", "()I", "compoundHashKey", "getCollectingCallByInformation$runtime_release", "collectingCallByInformation", "getCollectingParameterInformation$runtime_release", "collectingParameterInformation", "getCollectingSourceInformation$runtime_release", "collectingSourceInformation", "Companion", "RecomposerErrorState", "RecomposerInfoImpl", "State", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Recomposer extends CompositionContext {
    private final List<ControlledComposition> _knownCompositions;
    private List<? extends ControlledComposition> _knownCompositionsCache;
    private final StateFlow2<State> _state;
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;
    private Throwable closeCause;
    private final MutableVector<ControlledComposition> compositionInvalidations;
    private final List<ControlledComposition> compositionsAwaitingApply;
    private Set<ControlledComposition> compositionsRemoved;
    private int concurrentCompositionsOutstanding;
    private final CoroutineContext effectCoroutineContext;
    private final CompletableJob effectJob;
    private RecomposerErrorState errorState;
    private List<ControlledComposition> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;
    private final List<MovableContentStateReference> movableContentAwaitingInsert;
    private final ScatterMap6<Object, Object> movableContentNestedExtractionsPending;
    private final Recomposer2 movableContentNestedStatesAvailable;
    private final ScatterMap6<Object, Object> movableContentRemoved;
    private final ScatterMap6<MovableContentStateReference, MovableContentState> movableContentStatesAvailable;
    private final SnapshotThreadLocal<ScatterSet2<RecomposeScopeImpl>> pausedScopes;
    private final RecomposerInfoImpl recomposerInfo;
    private ObjectList2<CompositionObserver2> registrationObservers;
    private Job runnerJob;
    private ScatterSet2<Object> snapshotInvalidations;
    private final Object stateLock;
    private CancellableContinuation<? super Unit> workContinuation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final StateFlow2<ImmutableSet2<RecomposerInfoImpl>> _runningRecomposers = StateFlow4.MutableStateFlow(extensions.persistentSetOf());
    private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(Boolean.FALSE);

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingSourceInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(Set<CompositionData> table) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0147, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014c, code lost:
    
        if (r4 >= r3) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0158, code lost:
    
        if (r10.get(r4).getSecond() == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015d, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016b, code lost:
    
        if (r9 >= r4) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016d, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0177, code lost:
    
        if (r11.getSecond() != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0179, code lost:
    
        r11 = r11.getFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0182, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0183, code lost:
    
        if (r11 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0185, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0188, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018b, code lost:
    
        r4 = r16.stateLock;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018d, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018e, code lost:
    
        kotlin.collections.CollectionsKt.addAll(r16.movableContentAwaitingInsert, r3);
        r3 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0197, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0198, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a6, code lost:
    
        if (r9 >= r4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a8, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b3, code lost:
    
        if (r11.getSecond() == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b5, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b8, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01bb, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<ControlledComposition> performInsertValues(List<MovableContentStateReference> references, ScatterSet2<Object> modifiedValues) {
        ArrayList<Tuples2<MovableContentStateReference, MovableContentStateReference>> arrayList;
        Recomposer4 recomposer4RemoveLast;
        HashMap map = new HashMap(references.size());
        int size = references.size();
        for (int i = 0; i < size; i++) {
            MovableContentStateReference movableContentStateReference = references.get(i);
            ControlledComposition composition = movableContentStateReference.getComposition();
            Object arrayList2 = map.get(composition);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(composition, arrayList2);
            }
            ((ArrayList) arrayList2).add(movableContentStateReference);
        }
        for (Map.Entry entry : map.entrySet()) {
            ControlledComposition controlledComposition = (ControlledComposition) entry.getKey();
            List list = (List) entry.getValue();
            if (controlledComposition.isComposing()) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, modifiedValues));
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
                try {
                    synchronized (this.stateLock) {
                        try {
                            arrayList = new ArrayList(list.size());
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) list.get(i2);
                                Object objM6411removeLastimpl = MultiValueMap.m6411removeLastimpl(this.movableContentRemoved, movableContentStateReference2.getContent$runtime_release());
                                MovableContentStateReference movableContentStateReference3 = (MovableContentStateReference) objM6411removeLastimpl;
                                if (movableContentStateReference3 != null) {
                                    this.movableContentNestedStatesAvailable.usedContainer(movableContentStateReference3);
                                }
                                arrayList.add(Tuples4.m3642to(movableContentStateReference2, objM6411removeLastimpl));
                            }
                            if (ComposeRuntimeFlags.isMovingNestedMovableContentEnabled) {
                                int size3 = arrayList.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size3) {
                                        break;
                                    }
                                    Tuples2<MovableContentStateReference, MovableContentStateReference> tuples2 = arrayList.get(i3);
                                    if (tuples2.getSecond() == null && this.movableContentNestedStatesAvailable.contains(tuples2.getFirst().getContent$runtime_release())) {
                                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                        for (Tuples2<MovableContentStateReference, MovableContentStateReference> tuples2M3642to : arrayList) {
                                            if (tuples2M3642to.getSecond() == null && (recomposer4RemoveLast = this.movableContentNestedStatesAvailable.removeLast(tuples2M3642to.getFirst().getContent$runtime_release())) != null) {
                                                MovableContentStateReference content = recomposer4RemoveLast.getContent();
                                                MultiValueMap.m6399addimpl(this.movableContentNestedExtractionsPending, recomposer4RemoveLast.getContainer(), content);
                                                tuples2M3642to = Tuples4.m3642to(tuples2M3642to.getFirst(), content);
                                            }
                                            arrayList3.add(tuples2M3642to);
                                        }
                                        arrayList = arrayList3;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                    int size4 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size4) {
                            break;
                        }
                        if (arrayList.get(i4).getSecond() != null) {
                            break;
                        }
                        i4++;
                    }
                    controlledComposition.insertMovableContent(arrayList);
                    Unit unit = Unit.INSTANCE;
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                } catch (Throwable th) {
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th;
                }
            } finally {
                applyAndCheck(mutableSnapshotTakeMutableSnapshot);
            }
        }
        return CollectionsKt.toList(map.keySet());
    }

    public Recomposer(CoroutineContext coroutineContext) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Function0<Unit>() { // from class: androidx.compose.runtime.Recomposer$broadcastFrameClock$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CancellableContinuation cancellableContinuationDeriveStateLocked;
                Object obj = this.this$0.stateLock;
                Recomposer recomposer = this.this$0;
                synchronized (obj) {
                    cancellableContinuationDeriveStateLocked = recomposer.deriveStateLocked();
                    if (((Recomposer.State) recomposer._state.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                        throw ExceptionsKt.CancellationException("Recomposer shutdown; frame clock awaiter will never resume", recomposer.closeCause);
                    }
                }
                if (cancellableContinuationDeriveStateLocked != null) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationDeriveStateLocked.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
                }
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new ScatterSet2<>(0, 1, null);
        this.compositionInvalidations = new MutableVector<>(new ControlledComposition[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.movableContentAwaitingInsert = new ArrayList();
        this.movableContentRemoved = MultiValueMap.m6403constructorimpl$default(null, 1, null);
        this.movableContentNestedStatesAvailable = new Recomposer2();
        this.movableContentStatesAvailable = ScatterMap7.mutableScatterMapOf();
        this.movableContentNestedExtractionsPending = MultiValueMap.m6403constructorimpl$default(null, 1, null);
        this._state = StateFlow4.MutableStateFlow(State.Inactive);
        this.pausedScopes = new SnapshotThreadLocal<>();
        CompletableJob completableJobJob = JobKt.Job((Job) coroutineContext.get(Job.INSTANCE));
        completableJobJob.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final Throwable th) {
                CancellableContinuation cancellableContinuation;
                CancellableContinuation cancellableContinuation2;
                CancellationException CancellationException = ExceptionsKt.CancellationException("Recomposer effect job completed", th);
                Object obj = this.this$0.stateLock;
                final Recomposer recomposer = this.this$0;
                synchronized (obj) {
                    try {
                        Job job = recomposer.runnerJob;
                        cancellableContinuation = null;
                        if (job != null) {
                            recomposer._state.setValue(Recomposer.State.ShuttingDown);
                            if (recomposer.isClosed) {
                                if (recomposer.workContinuation != null) {
                                    cancellableContinuation2 = recomposer.workContinuation;
                                }
                                recomposer.workContinuation = null;
                                job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                                        invoke2(th2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Throwable th2) {
                                        Object obj2 = recomposer.stateLock;
                                        Recomposer recomposer2 = recomposer;
                                        Throwable th3 = th;
                                        synchronized (obj2) {
                                            if (th3 == null) {
                                                th3 = null;
                                            } else if (th2 != null) {
                                                try {
                                                    if (th2 instanceof CancellationException) {
                                                        th2 = null;
                                                    }
                                                    if (th2 != null) {
                                                        kotlin.ExceptionsKt.addSuppressed(th3, th2);
                                                    }
                                                } catch (Throwable th4) {
                                                    throw th4;
                                                }
                                            }
                                            recomposer2.closeCause = th3;
                                            recomposer2._state.setValue(Recomposer.State.ShutDown);
                                            Unit unit = Unit.INSTANCE;
                                        }
                                    }
                                });
                                cancellableContinuation = cancellableContinuation2;
                            } else {
                                job.cancel(CancellationException);
                            }
                            cancellableContinuation2 = null;
                            recomposer.workContinuation = null;
                            job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                                    invoke2(th2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Throwable th2) {
                                    Object obj2 = recomposer.stateLock;
                                    Recomposer recomposer2 = recomposer;
                                    Throwable th3 = th;
                                    synchronized (obj2) {
                                        if (th3 == null) {
                                            th3 = null;
                                        } else if (th2 != null) {
                                            try {
                                                if (th2 instanceof CancellationException) {
                                                    th2 = null;
                                                }
                                                if (th2 != null) {
                                                    kotlin.ExceptionsKt.addSuppressed(th3, th2);
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                        }
                                        recomposer2.closeCause = th3;
                                        recomposer2._state.setValue(Recomposer.State.ShutDown);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                }
                            });
                            cancellableContinuation = cancellableContinuation2;
                        } else {
                            recomposer.closeCause = CancellationException;
                            recomposer._state.setValue(Recomposer.State.ShutDown);
                            Unit unit = Unit.INSTANCE;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (cancellableContinuation != null) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
                }
            }
        });
        this.effectJob = completableJobJob;
        this.effectCoroutineContext = coroutineContext.plus(broadcastFrameClock).plus(completableJobJob);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Recomposer.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ShutDown = new State("ShutDown", 0);
        public static final State ShuttingDown = new State("ShuttingDown", 1);
        public static final State Inactive = new State("Inactive", 2);
        public static final State InactivePendingWork = new State("InactivePendingWork", 3);
        public static final State Idle = new State("Idle", 4);
        public static final State PendingWork = new State("PendingWork", 5);

        private static final /* synthetic */ State[] $values() {
            return new State[]{ShutDown, ShuttingDown, Inactive, InactivePendingWork, Idle, PendingWork};
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        private State(String str, int i) {
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<ControlledComposition> getKnownCompositions() {
        List list = this._knownCompositionsCache;
        List list2 = list;
        if (list == null) {
            List<ControlledComposition> list3 = this._knownCompositions;
            List listEmptyList = list3.isEmpty() ? CollectionsKt.emptyList() : new ArrayList(list3);
            this._knownCompositionsCache = listEmptyList;
            list2 = listEmptyList;
        }
        return list2;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CancellableContinuation<Unit> deriveStateLocked() {
        State state;
        int i = 0;
        int i2 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
            clearKnownCompositionsLocked();
            this.snapshotInvalidations = new ScatterSet2<>(i, i2, defaultConstructorMarker);
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.movableContentAwaitingInsert.clear();
            this.failedCompositions = null;
            CancellableContinuation<? super Unit> cancellableContinuation = this.workContinuation;
            if (cancellableContinuation != null) {
                CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new ScatterSet2<>(i, i2, defaultConstructorMarker);
            this.compositionInvalidations.clear();
            state = getHasBroadcastFrameClockAwaitersLocked() ? State.InactivePendingWork : State.Inactive;
        } else if (this.compositionInvalidations.getSize() != 0 || this.snapshotInvalidations.isNotEmpty() || !this.compositionsAwaitingApply.isEmpty() || !this.movableContentAwaitingInsert.isEmpty() || this.concurrentCompositionsOutstanding > 0 || getHasBroadcastFrameClockAwaitersLocked()) {
            state = State.PendingWork;
        } else {
            state = State.Idle;
        }
        this._state.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        CancellableContinuation cancellableContinuation2 = this.workContinuation;
        this.workContinuation = null;
        return cancellableContinuation2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z;
        synchronized (this.stateLock) {
            z = this.isClosed;
        }
        if (!z) {
            return true;
        }
        Iterator<Job> it = this.effectJob.getChildren().iterator2();
        while (it.hasNext()) {
            if (it.next().isActive()) {
                return true;
            }
        }
        return false;
    }

    public final StateFlow<State> getCurrentState() {
        return this._state;
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "", "<init>", "(Landroidx/compose/runtime/Recomposer;)V", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    private final class RecomposerInfoImpl {
        public RecomposerInfoImpl() {
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "", "", "recoverable", "", "cause", "<init>", "(ZLjava/lang/Throwable;)V", "Z", "getRecoverable", "()Z", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class RecomposerErrorState {
        private final Throwable cause;
        private final boolean recoverable;

        public RecomposerErrorState(boolean z, Throwable th) {
            this.recoverable = z;
            this.cause = th;
        }

        public Throwable getCause() {
            return this.cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordComposerModifications() {
        List<ControlledComposition> knownCompositions;
        boolean hasFrameWorkLocked;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isEmpty()) {
                return getHasFrameWorkLocked();
            }
            Set<? extends Object> setWrapIntoSet = ScatterSetWrapper2.wrapIntoSet(this.snapshotInvalidations);
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i = 1;
            int i2 = 0;
            this.snapshotInvalidations = new ScatterSet2<>(i2, i, defaultConstructorMarker);
            synchronized (this.stateLock) {
                knownCompositions = getKnownCompositions();
            }
            try {
                int size = knownCompositions.size();
                for (int i3 = 0; i3 < size; i3++) {
                    knownCompositions.get(i3).recordModificationsOf(setWrapIntoSet);
                    if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.stateLock) {
                    this.snapshotInvalidations = new ScatterSet2<>(i2, i, defaultConstructorMarker);
                    Unit unit = Unit.INSTANCE;
                }
                synchronized (this.stateLock) {
                    if (deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.addAll(setWrapIntoSet);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(Job callingJob) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.runnerJob = callingJob;
            deriveStateLocked();
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", m3645f = "Recomposer.kt", m3646l = {580, 591}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2 */
    static final class C17522 extends ContinuationImpl7 implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        C17522(Continuation<? super C17522> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
            C17522 c17522 = Recomposer.this.new C17522(continuation);
            c17522.L$0 = monotonicFrameClock;
            return c17522.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0118  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0101 -> B:24:0x0109). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x010f -> B:12:0x00ac). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            MonotonicFrameClock monotonicFrameClock;
            ScatterSet2 scatterSet2MutableScatterSetOf;
            ScatterSet2 scatterSet2MutableScatterSetOf2;
            List list;
            Set set;
            final List list2;
            ScatterSet2 scatterSet2;
            List list3;
            ScatterSet2 scatterSet22;
            final List list4;
            final ScatterSet2 scatterSet23;
            final List list5;
            final ScatterSet2 scatterSet24;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 1;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                monotonicFrameClock = (MonotonicFrameClock) this.L$0;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                scatterSet2MutableScatterSetOf = ScatterSet5.mutableScatterSetOf();
                ScatterSet2 scatterSet2MutableScatterSetOf3 = ScatterSet5.mutableScatterSetOf();
                ScatterSet2 scatterSet25 = new ScatterSet2(0, i2, null);
                Set setWrapIntoSet = ScatterSetWrapper2.wrapIntoSet(scatterSet25);
                scatterSet2MutableScatterSetOf2 = ScatterSet5.mutableScatterSetOf();
                list = arrayList;
                set = setWrapIntoSet;
                list2 = arrayList2;
                scatterSet2 = scatterSet25;
                list3 = arrayList3;
                scatterSet22 = scatterSet2MutableScatterSetOf3;
                if (!Recomposer.this.getShouldKeepRecomposing()) {
                }
            } else if (i == 1) {
                ScatterSet2 scatterSet26 = (ScatterSet2) this.L$8;
                set = (Set) this.L$7;
                scatterSet2 = (ScatterSet2) this.L$6;
                scatterSet22 = (ScatterSet2) this.L$5;
                ScatterSet2 scatterSet27 = (ScatterSet2) this.L$4;
                List list6 = (List) this.L$3;
                list2 = (List) this.L$2;
                List list7 = (List) this.L$1;
                MonotonicFrameClock monotonicFrameClock2 = (MonotonicFrameClock) this.L$0;
                ResultKt.throwOnFailure(obj);
                scatterSet24 = scatterSet26;
                monotonicFrameClock = monotonicFrameClock2;
                list4 = list6;
                list5 = list7;
                scatterSet23 = scatterSet27;
                final Set set2 = set;
                final ScatterSet2 scatterSet28 = scatterSet22;
                final ScatterSet2 scatterSet29 = scatterSet2;
                if (Recomposer.this.recordComposerModifications()) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ScatterSet2 scatterSet210 = (ScatterSet2) this.L$8;
                set = (Set) this.L$7;
                scatterSet2 = (ScatterSet2) this.L$6;
                scatterSet22 = (ScatterSet2) this.L$5;
                scatterSet2MutableScatterSetOf = (ScatterSet2) this.L$4;
                list3 = (List) this.L$3;
                list2 = (List) this.L$2;
                list = (List) this.L$1;
                MonotonicFrameClock monotonicFrameClock3 = (MonotonicFrameClock) this.L$0;
                ResultKt.throwOnFailure(obj);
                scatterSet2MutableScatterSetOf2 = scatterSet210;
                monotonicFrameClock = monotonicFrameClock3;
                Recomposer.this.discardUnusedMovableContentState();
                if (!Recomposer.this.getShouldKeepRecomposing()) {
                    Recomposer recomposer = Recomposer.this;
                    this.L$0 = monotonicFrameClock;
                    this.L$1 = list;
                    this.L$2 = list2;
                    this.L$3 = list3;
                    this.L$4 = scatterSet2MutableScatterSetOf;
                    this.L$5 = scatterSet22;
                    this.L$6 = scatterSet2;
                    this.L$7 = set;
                    this.L$8 = scatterSet2MutableScatterSetOf2;
                    this.label = 1;
                    if (recomposer.awaitWorkAvailable(this) != coroutine_suspended) {
                        List list8 = list;
                        scatterSet23 = scatterSet2MutableScatterSetOf;
                        scatterSet24 = scatterSet2MutableScatterSetOf2;
                        list4 = list3;
                        list5 = list8;
                        final Set set22 = set;
                        final ScatterSet2 scatterSet282 = scatterSet22;
                        final ScatterSet2 scatterSet292 = scatterSet2;
                        if (Recomposer.this.recordComposerModifications()) {
                            List list9 = list4;
                            scatterSet2MutableScatterSetOf2 = scatterSet24;
                            scatterSet2MutableScatterSetOf = scatterSet23;
                            list = list5;
                            list3 = list9;
                            scatterSet2 = scatterSet292;
                            scatterSet22 = scatterSet282;
                            set = set22;
                            if (!Recomposer.this.getShouldKeepRecomposing()) {
                            }
                        } else {
                            final Recomposer recomposer2 = Recomposer.this;
                            Function1<Long, Unit> function1 = new Function1<Long, Unit>() { // from class: androidx.compose.runtime.Recomposer.runRecomposeAndApplyChanges.2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                    invoke(l.longValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:132:0x020e A[Catch: all -> 0x00df, TryCatch #18 {all -> 0x00df, blocks: (B:11:0x0049, B:12:0x0050, B:19:0x007d, B:20:0x007e, B:21:0x0084, B:23:0x008d, B:26:0x0098, B:28:0x00a1, B:38:0x00db, B:47:0x00f2, B:54:0x0100, B:55:0x0103, B:56:0x0104, B:90:0x0183, B:94:0x018c, B:95:0x018f, B:83:0x016b, B:97:0x0194, B:119:0x01ed, B:132:0x020e, B:133:0x0212, B:135:0x0216, B:136:0x0217, B:138:0x022b, B:139:0x022c, B:126:0x0201, B:130:0x020a, B:131:0x020d, B:149:0x0256, B:151:0x025f, B:180:0x02ea, B:191:0x0316, B:155:0x026e, B:156:0x0272, B:179:0x02e9, B:192:0x0323, B:193:0x0324, B:198:0x0334, B:203:0x033d, B:204:0x0340, B:205:0x0341, B:206:0x0342, B:29:0x00ac, B:31:0x00b6, B:34:0x00c5, B:36:0x00cf, B:182:0x02f0, B:183:0x02f3, B:185:0x02fc, B:134:0x0213, B:140:0x022d, B:142:0x0237, B:144:0x0243, B:147:0x0250, B:13:0x0051, B:15:0x005e, B:18:0x0074, B:99:0x019a, B:102:0x01a4, B:104:0x01b2, B:106:0x01be, B:108:0x01c4, B:157:0x0273, B:159:0x0281, B:161:0x028d, B:163:0x0293, B:166:0x029d, B:167:0x02a0, B:169:0x02ac, B:171:0x02b8, B:173:0x02be, B:177:0x02d5, B:176:0x02cd, B:178:0x02da), top: B:245:0x0049, inners: #0, #5, #7, #9, #11, #12, #14 }] */
                                /* JADX WARN: Removed duplicated region for block: B:211:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                /* JADX WARN: Removed duplicated region for block: B:223:0x0213 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                /* JADX WARN: Removed duplicated region for block: B:233:0x019a A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                /* JADX WARN: Removed duplicated region for block: B:77:0x015c  */
                                /* JADX WARN: Removed duplicated region for block: B:96:0x0190  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void invoke(long j) {
                                    Object objBeginSection;
                                    List<ControlledComposition> list10;
                                    Set<? extends Object> set3;
                                    Set<? extends Object> set4;
                                    ScatterSet2<Object> scatterSet211;
                                    char c;
                                    long j2;
                                    List<ControlledComposition> list11;
                                    if (recomposer2.getHasBroadcastFrameClockAwaiters()) {
                                        Recomposer recomposer3 = recomposer2;
                                        Trace trace = Trace.INSTANCE;
                                        objBeginSection = trace.beginSection("Recomposer:animation");
                                        try {
                                            recomposer3.broadcastFrameClock.sendFrame(j);
                                            Snapshot.INSTANCE.sendApplyNotifications();
                                            Unit unit = Unit.INSTANCE;
                                            trace.endSection(objBeginSection);
                                        } finally {
                                        }
                                    }
                                    Recomposer recomposer4 = recomposer2;
                                    ScatterSet2<Object> scatterSet212 = scatterSet292;
                                    ScatterSet2<ControlledComposition> scatterSet213 = scatterSet24;
                                    List<ControlledComposition> list12 = list5;
                                    List<MovableContentStateReference> list13 = list2;
                                    ScatterSet2<ControlledComposition> scatterSet214 = scatterSet23;
                                    List<ControlledComposition> list14 = list4;
                                    ScatterSet2<ControlledComposition> scatterSet215 = scatterSet282;
                                    Set<? extends Object> set5 = set22;
                                    objBeginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
                                    try {
                                        recomposer4.recordComposerModifications();
                                        synchronized (recomposer4.stateLock) {
                                            try {
                                                MutableVector mutableVector = recomposer4.compositionInvalidations;
                                                Object[] objArr = mutableVector.content;
                                                int i3 = 0;
                                                for (int size = mutableVector.getSize(); i3 < size; size = size) {
                                                    list12.add((ControlledComposition) objArr[i3]);
                                                    i3++;
                                                }
                                                recomposer4.compositionInvalidations.clear();
                                                Unit unit2 = Unit.INSTANCE;
                                            } finally {
                                            }
                                        }
                                        scatterSet212.clear();
                                        scatterSet213.clear();
                                        while (true) {
                                            if (list12.isEmpty() && list13.isEmpty()) {
                                                break;
                                            }
                                            try {
                                                int size2 = list12.size();
                                                for (int i4 = 0; i4 < size2; i4++) {
                                                    ControlledComposition controlledComposition = list12.get(i4);
                                                    ControlledComposition controlledCompositionPerformRecompose = recomposer4.performRecompose(controlledComposition, scatterSet212);
                                                    if (controlledCompositionPerformRecompose != null) {
                                                        list14.add(controlledCompositionPerformRecompose);
                                                        Unit unit3 = Unit.INSTANCE;
                                                    }
                                                    scatterSet213.add(controlledComposition);
                                                }
                                                list12.clear();
                                                if (scatterSet212.isNotEmpty() || recomposer4.compositionInvalidations.getSize() != 0) {
                                                    synchronized (recomposer4.stateLock) {
                                                        try {
                                                            List knownCompositions = recomposer4.getKnownCompositions();
                                                            int size3 = knownCompositions.size();
                                                            for (int i5 = 0; i5 < size3; i5++) {
                                                                ControlledComposition controlledComposition2 = (ControlledComposition) knownCompositions.get(i5);
                                                                if (!scatterSet213.contains(controlledComposition2) && controlledComposition2.observesAnyOf(set5)) {
                                                                    list12.add(controlledComposition2);
                                                                }
                                                            }
                                                            MutableVector mutableVector2 = recomposer4.compositionInvalidations;
                                                            int size4 = mutableVector2.getSize();
                                                            int i6 = 0;
                                                            int i7 = 0;
                                                            while (i6 < size4) {
                                                                ControlledComposition controlledComposition3 = (ControlledComposition) mutableVector2.content[i6];
                                                                if (scatterSet213.contains(controlledComposition3) || list12.contains(controlledComposition3)) {
                                                                    set4 = set5;
                                                                    if (i7 > 0) {
                                                                        Object[] objArr2 = mutableVector2.content;
                                                                        objArr2[i6 - i7] = objArr2[i6];
                                                                    }
                                                                } else {
                                                                    set4 = set5;
                                                                    list12.add(controlledComposition3);
                                                                    i7++;
                                                                }
                                                                i6++;
                                                                set5 = set4;
                                                            }
                                                            set3 = set5;
                                                            int i8 = size4 - i7;
                                                            ArraysKt.fill(mutableVector2.content, (Object) null, i8, size4);
                                                            mutableVector2.setSize(i8);
                                                            Unit unit4 = Unit.INSTANCE;
                                                        } finally {
                                                        }
                                                    }
                                                } else {
                                                    set3 = set5;
                                                }
                                                if (list12.isEmpty()) {
                                                    try {
                                                        C17522.invokeSuspend$fillToInsert(list13, recomposer4);
                                                        while (!list13.isEmpty()) {
                                                            scatterSet214.plusAssign(recomposer4.performInsertValues(list13, scatterSet212));
                                                            C17522.invokeSuspend$fillToInsert(list13, recomposer4);
                                                        }
                                                    } catch (Throwable th) {
                                                        Recomposer.processCompositionError$default(recomposer4, th, null, true, 2, null);
                                                        C17522.invokeSuspend$clearRecompositionState(recomposer4, list12, list13, list14, scatterSet214, scatterSet215, scatterSet212, scatterSet213);
                                                    }
                                                }
                                                set5 = set3;
                                            } catch (Throwable th2) {
                                                try {
                                                    Recomposer.processCompositionError$default(recomposer4, th2, null, true, 2, null);
                                                    list10 = list12;
                                                    try {
                                                        C17522.invokeSuspend$clearRecompositionState(recomposer4, list10, list13, list14, scatterSet214, scatterSet215, scatterSet212, scatterSet213);
                                                        list10.clear();
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        list10.clear();
                                                        throw th;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    list10 = list12;
                                                }
                                            }
                                        }
                                        if (list14.isEmpty()) {
                                            if (scatterSet214.isNotEmpty()) {
                                            }
                                            if (scatterSet215.isNotEmpty()) {
                                            }
                                        } else {
                                            recomposer4.changeCount = recomposer4.getChangeCount() + 1;
                                            try {
                                                int size5 = list14.size();
                                                for (int i9 = 0; i9 < size5; i9++) {
                                                    scatterSet215.add(list14.get(i9));
                                                }
                                                int size6 = list14.size();
                                                for (int i10 = 0; i10 < size6; i10++) {
                                                    list14.get(i10).applyChanges();
                                                }
                                                list14.clear();
                                                if (scatterSet214.isNotEmpty()) {
                                                    c = 7;
                                                    j2 = 128;
                                                } else {
                                                    try {
                                                        scatterSet215.plusAssign(scatterSet214);
                                                        Object[] objArr3 = scatterSet214.elements;
                                                        c = 7;
                                                        long[] jArr = scatterSet214.metadata;
                                                        j2 = 128;
                                                        int length = jArr.length - 2;
                                                        if (length >= 0) {
                                                            int i11 = 0;
                                                            while (true) {
                                                                int i12 = length;
                                                                long j3 = jArr[i11];
                                                                scatterSet211 = scatterSet212;
                                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i13 = 8 - ((~(i11 - i12)) >>> 31);
                                                                    for (int i14 = 0; i14 < i13; i14++) {
                                                                        if ((j3 & 255) < 128) {
                                                                            try {
                                                                                ((ControlledComposition) objArr3[(i11 << 3) + i14]).applyLateChanges();
                                                                            } catch (Throwable th5) {
                                                                                th = th5;
                                                                                try {
                                                                                    Recomposer.processCompositionError$default(recomposer4, th, null, false, 6, null);
                                                                                    try {
                                                                                        C17522.invokeSuspend$clearRecompositionState(recomposer4, list12, list13, list14, scatterSet214, scatterSet215, scatterSet211, scatterSet213);
                                                                                        scatterSet214.clear();
                                                                                    } catch (Throwable th6) {
                                                                                        th = th6;
                                                                                        scatterSet214 = scatterSet214;
                                                                                        scatterSet214.clear();
                                                                                        throw th;
                                                                                    }
                                                                                } catch (Throwable th7) {
                                                                                    th = th7;
                                                                                }
                                                                            }
                                                                        }
                                                                        j3 >>= 8;
                                                                    }
                                                                    if (i13 != 8) {
                                                                        break;
                                                                    }
                                                                    length = i12;
                                                                    if (i11 == length) {
                                                                        break;
                                                                    }
                                                                    i11++;
                                                                    scatterSet212 = scatterSet211;
                                                                }
                                                            }
                                                        } else {
                                                            scatterSet211 = scatterSet212;
                                                        }
                                                        scatterSet214.clear();
                                                        scatterSet212 = scatterSet211;
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        scatterSet211 = scatterSet212;
                                                    }
                                                }
                                                if (scatterSet215.isNotEmpty()) {
                                                    synchronized (recomposer4.stateLock) {
                                                    }
                                                } else {
                                                    try {
                                                        Object[] objArr4 = scatterSet215.elements;
                                                        long[] jArr2 = scatterSet215.metadata;
                                                        int length2 = jArr2.length - 2;
                                                        if (length2 >= 0) {
                                                            int i15 = 0;
                                                            while (true) {
                                                                long j4 = jArr2[i15];
                                                                Object[] objArr5 = objArr4;
                                                                if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                                    for (int i17 = 0; i17 < i16; i17++) {
                                                                        if ((j4 & 255) < j2) {
                                                                            ((ControlledComposition) objArr5[(i15 << 3) + i17]).changesApplied();
                                                                        }
                                                                        j4 >>= 8;
                                                                    }
                                                                    if (i16 != 8) {
                                                                        break;
                                                                    }
                                                                }
                                                                if (i15 == length2) {
                                                                    break;
                                                                }
                                                                i15++;
                                                                objArr4 = objArr5;
                                                            }
                                                        }
                                                        scatterSet215.clear();
                                                        synchronized (recomposer4.stateLock) {
                                                            recomposer4.deriveStateLocked();
                                                        }
                                                        Snapshot.INSTANCE.notifyObjectsInitialized();
                                                        scatterSet213.clear();
                                                        scatterSet212.clear();
                                                        recomposer4.compositionsRemoved = null;
                                                        Unit unit5 = Unit.INSTANCE;
                                                    } catch (Throwable th9) {
                                                        try {
                                                            Recomposer.processCompositionError$default(recomposer4, th9, null, false, 6, null);
                                                            try {
                                                                C17522.invokeSuspend$clearRecompositionState(recomposer4, list12, list13, list14, scatterSet214, scatterSet215, scatterSet212, scatterSet213);
                                                                scatterSet215.clear();
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                                scatterSet215 = scatterSet215;
                                                                scatterSet215.clear();
                                                                throw th;
                                                            }
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th12) {
                                                try {
                                                    Recomposer.processCompositionError$default(recomposer4, th12, null, false, 6, null);
                                                    try {
                                                        C17522.invokeSuspend$clearRecompositionState(recomposer4, list12, list13, list14, scatterSet214, scatterSet215, scatterSet212, scatterSet213);
                                                        list14.clear();
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                        list11 = list14;
                                                        list11.clear();
                                                        throw th;
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                    list11 = list14;
                                                }
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            };
                            this.L$0 = monotonicFrameClock;
                            this.L$1 = list5;
                            this.L$2 = list2;
                            this.L$3 = list4;
                            this.L$4 = scatterSet23;
                            this.L$5 = scatterSet282;
                            this.L$6 = scatterSet292;
                            this.L$7 = set22;
                            this.L$8 = scatterSet24;
                            this.label = 2;
                            if (monotonicFrameClock.withFrameNanos(function1, this) != coroutine_suspended) {
                                List list10 = list4;
                                scatterSet2MutableScatterSetOf2 = scatterSet24;
                                scatterSet2MutableScatterSetOf = scatterSet23;
                                list = list5;
                                list3 = list10;
                                scatterSet2 = scatterSet292;
                                scatterSet22 = scatterSet282;
                                set = set22;
                                Recomposer.this.discardUnusedMovableContentState();
                                if (!Recomposer.this.getShouldKeepRecomposing()) {
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void invokeSuspend$clearRecompositionState(Recomposer recomposer, List<ControlledComposition> list, List<MovableContentStateReference> list2, List<ControlledComposition> list3, ScatterSet2<ControlledComposition> scatterSet2, ScatterSet2<ControlledComposition> scatterSet22, ScatterSet2<Object> scatterSet23, ScatterSet2<ControlledComposition> scatterSet24) {
            char c;
            long j;
            long j2;
            synchronized (recomposer.stateLock) {
                try {
                    list.clear();
                    list2.clear();
                    int size = list3.size();
                    for (int i = 0; i < size; i++) {
                        ControlledComposition controlledComposition = list3.get(i);
                        controlledComposition.abandonChanges();
                        recomposer.recordFailedCompositionLocked(controlledComposition);
                    }
                    list3.clear();
                    Object[] objArr = scatterSet2.elements;
                    long[] jArr = scatterSet2.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        j = 255;
                        while (true) {
                            long j3 = jArr[i2];
                            c = 7;
                            j2 = -9187201950435737472L;
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((j3 & 255) < 128) {
                                        ControlledComposition controlledComposition2 = (ControlledComposition) objArr[(i2 << 3) + i4];
                                        controlledComposition2.abandonChanges();
                                        recomposer.recordFailedCompositionLocked(controlledComposition2);
                                    }
                                    j3 >>= 8;
                                }
                                if (i3 != 8) {
                                    break;
                                } else if (i2 == length) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        c = 7;
                        j = 255;
                        j2 = -9187201950435737472L;
                    }
                    scatterSet2.clear();
                    Object[] objArr2 = scatterSet22.elements;
                    long[] jArr2 = scatterSet22.metadata;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j4 = jArr2[i5];
                            if ((((~j4) << c) & j4 & j2) != j2) {
                                int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((j4 & j) < 128) {
                                        ((ControlledComposition) objArr2[(i5 << 3) + i7]).changesApplied();
                                    }
                                    j4 >>= 8;
                                }
                                if (i6 != 8) {
                                    break;
                                } else if (i5 == length2) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                    }
                    scatterSet22.clear();
                    scatterSet23.clear();
                    Object[] objArr3 = scatterSet24.elements;
                    long[] jArr3 = scatterSet24.metadata;
                    int length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j5 = jArr3[i8];
                            if ((((~j5) << c) & j5 & j2) != j2) {
                                int i9 = 8 - ((~(i8 - length3)) >>> 31);
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if ((j5 & j) < 128) {
                                        ControlledComposition controlledComposition3 = (ControlledComposition) objArr3[(i8 << 3) + i10];
                                        controlledComposition3.abandonChanges();
                                        recomposer.recordFailedCompositionLocked(controlledComposition3);
                                    }
                                    j5 >>= 8;
                                }
                                if (i9 != 8) {
                                    break;
                                } else if (i8 == length3) {
                                    break;
                                } else {
                                    i8++;
                                }
                            }
                        }
                    }
                    scatterSet24.clear();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
            list.clear();
            synchronized (recomposer.stateLock) {
                try {
                    List list2 = recomposer.movableContentAwaitingInsert;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        list.add((MovableContentStateReference) list2.get(i));
                    }
                    recomposer.movableContentAwaitingInsert.clear();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final Object runRecomposeAndApplyChanges(Continuation<? super Unit> continuation) {
        Object objRecompositionRunner = recompositionRunner(new C17522(null), continuation);
        return objRecompositionRunner == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRecompositionRunner : Unit.INSTANCE;
    }

    static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Throwable th, ControlledComposition controlledComposition, boolean z, int i, Object obj) throws Throwable {
        if ((i & 2) != 0) {
            controlledComposition = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        recomposer.processCompositionError(th, controlledComposition, z);
    }

    private final void processCompositionError(Throwable e, ControlledComposition failedInitialComposition, boolean recoverable) throws Throwable {
        int i = 0;
        if (!_hotReloadEnabled.get().booleanValue() || (e instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                RecomposerErrorState recomposerErrorState = this.errorState;
                if (recomposerErrorState != null) {
                    throw recomposerErrorState.getCause();
                }
                this.errorState = new RecomposerErrorState(false, e);
                Unit unit = Unit.INSTANCE;
            }
            throw e;
        }
        synchronized (this.stateLock) {
            try {
                Utils_androidKt.logError("Error was captured in composition while live edit was enabled.", e);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.clear();
                this.snapshotInvalidations = new ScatterSet2<>(i, 1, null);
                this.movableContentAwaitingInsert.clear();
                MultiValueMap.m6401clearimpl(this.movableContentRemoved);
                this.movableContentStatesAvailable.clear();
                this.errorState = new RecomposerErrorState(recoverable, e);
                if (failedInitialComposition != null) {
                    recordFailedCompositionLocked(failedInitialComposition);
                }
                deriveStateLocked();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void clearKnownCompositionsLocked() {
        ObjectList2<CompositionObserver2> objectList2 = this.registrationObservers;
        if (objectList2 != null) {
            Object[] objArr = objectList2.content;
            int i = objectList2._size;
            for (int i2 = 0; i2 < i; i2++) {
                CompositionObserver2 compositionObserver2 = (CompositionObserver2) objArr[i2];
                Iterator<T> it = getKnownCompositions().iterator();
                while (it.hasNext()) {
                    compositionObserver2.onCompositionUnregistered(this, (ControlledComposition) it.next());
                }
            }
        }
        this._knownCompositions.clear();
        this._knownCompositionsCache = CollectionsKt.emptyList();
    }

    private final void removeKnownCompositionLocked(ControlledComposition composition) {
        if (this._knownCompositions.remove(composition)) {
            this._knownCompositionsCache = null;
            ObjectList2<CompositionObserver2> objectList2 = this.registrationObservers;
            if (objectList2 != null) {
                Object[] objArr = objectList2.content;
                int i = objectList2._size;
                for (int i2 = 0; i2 < i; i2++) {
                    ((CompositionObserver2) objArr[i2]).onCompositionUnregistered(this, composition);
                }
            }
        }
    }

    private final void addKnownCompositionLocked(ControlledComposition composition) {
        this._knownCompositions.add(composition);
        this._knownCompositionsCache = null;
        ObjectList2<CompositionObserver2> objectList2 = this.registrationObservers;
        if (objectList2 != null) {
            Object[] objArr = objectList2.content;
            int i = objectList2._size;
            for (int i2 = 0; i2 < i; i2++) {
                ((CompositionObserver2) objArr[i2]).onCompositionRegistered(this, composition);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordFailedCompositionLocked(ControlledComposition composition) {
        List arrayList = this.failedCompositions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.failedCompositions = arrayList;
        }
        if (!arrayList.contains(composition)) {
            arrayList.add(composition);
        }
        removeKnownCompositionLocked(composition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean getHasSchedulingWork() {
        boolean z;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isNotEmpty() || this.compositionInvalidations.getSize() != 0) {
                z = true;
            } else if (!getHasBroadcastFrameClockAwaitersLocked()) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl;
        if (!getHasSchedulingWork()) {
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl2.initCancellability();
            synchronized (this.stateLock) {
                if (getHasSchedulingWork()) {
                    cancellableContinuationImpl = cancellableContinuationImpl2;
                } else {
                    this.workContinuation = cancellableContinuationImpl2;
                    cancellableContinuationImpl = null;
                }
            }
            if (cancellableContinuationImpl != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
            }
            Object result = cancellableContinuationImpl2.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(continuation);
            }
            return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", m3645f = "Recomposer.kt", m3646l = {1072}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2 */
    static final class C17512 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ MonotonicFrameClock $parentFrameClock;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C17512(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, MonotonicFrameClock monotonicFrameClock, Continuation<? super C17512> continuation) {
            super(2, continuation);
            this.$block = function3;
            this.$parentFrameClock = monotonicFrameClock;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17512 c17512 = Recomposer.this.new C17512(this.$block, this.$parentFrameClock, continuation);
            c17512.L$0 = obj;
            return c17512;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17512) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Job job;
            ObserverHandle observerHandle;
            Throwable th;
            List knownCompositions;
            Object obj2;
            Object obj3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                job = JobKt.getJob(((CoroutineScope) this.L$0).getCoroutineContext());
                Recomposer.this.registerRunnerJob(job);
                Snapshot.Companion companion = Snapshot.INSTANCE;
                final Recomposer recomposer = Recomposer.this;
                ObserverHandle observerHandleRegisterApplyObserver = companion.registerApplyObserver(new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.Recomposer$recompositionRunner$2$unregisterApplyObserver$1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, Snapshot snapshot) {
                        invoke2(set, snapshot);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Set<? extends Object> set, Snapshot snapshot) {
                        CancellableContinuation cancellableContinuationDeriveStateLocked;
                        Object obj4 = recomposer.stateLock;
                        Recomposer recomposer2 = recomposer;
                        synchronized (obj4) {
                            try {
                                if (((Recomposer.State) recomposer2._state.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                                    ScatterSet2 scatterSet2 = recomposer2.snapshotInvalidations;
                                    if (set instanceof ScatterSetWrapper) {
                                        ScatterSet set$runtime_release = ((ScatterSetWrapper) set).getSet$runtime_release();
                                        Object[] objArr = set$runtime_release.elements;
                                        long[] jArr = set$runtime_release.metadata;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i2 = 0;
                                            while (true) {
                                                long j = jArr[i2];
                                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                                    for (int i4 = 0; i4 < i3; i4++) {
                                                        if ((255 & j) < 128) {
                                                            Object obj5 = objArr[(i2 << 3) + i4];
                                                            if (!(obj5 instanceof StateObjectImpl) || ((StateObjectImpl) obj5).m6431isReadInh_f27i8$runtime_release(StateObjectImpl2.m6430constructorimpl(1))) {
                                                                scatterSet2.add(obj5);
                                                            }
                                                        }
                                                        j >>= 8;
                                                    }
                                                    if (i3 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i2 == length) {
                                                    break;
                                                } else {
                                                    i2++;
                                                }
                                            }
                                        }
                                    } else {
                                        for (Object obj6 : set) {
                                            if (!(obj6 instanceof StateObjectImpl) || ((StateObjectImpl) obj6).m6431isReadInh_f27i8$runtime_release(StateObjectImpl2.m6430constructorimpl(1))) {
                                                scatterSet2.add(obj6);
                                            }
                                        }
                                    }
                                    cancellableContinuationDeriveStateLocked = recomposer2.deriveStateLocked();
                                } else {
                                    cancellableContinuationDeriveStateLocked = null;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (cancellableContinuationDeriveStateLocked != null) {
                            Result.Companion companion2 = Result.INSTANCE;
                            cancellableContinuationDeriveStateLocked.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
                        }
                    }
                });
                Recomposer.INSTANCE.addRunning(Recomposer.this.recomposerInfo);
                try {
                    Object obj4 = Recomposer.this.stateLock;
                    Recomposer recomposer2 = Recomposer.this;
                    synchronized (obj4) {
                        knownCompositions = recomposer2.getKnownCompositions();
                    }
                    int size = knownCompositions.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((ControlledComposition) knownCompositions.get(i2)).invalidateAll();
                    }
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$block, this.$parentFrameClock, null);
                    this.L$0 = job;
                    this.L$1 = observerHandleRegisterApplyObserver;
                    this.label = 1;
                    if (CoroutineScope2.coroutineScope(anonymousClass3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    observerHandle = observerHandleRegisterApplyObserver;
                    observerHandle.dispose();
                    obj3 = Recomposer.this.stateLock;
                    Recomposer recomposer3 = Recomposer.this;
                    synchronized (obj3) {
                    }
                } catch (Throwable th2) {
                    observerHandle = observerHandleRegisterApplyObserver;
                    th = th2;
                    observerHandle.dispose();
                    obj2 = Recomposer.this.stateLock;
                    Recomposer recomposer4 = Recomposer.this;
                    synchronized (obj2) {
                        try {
                            if (recomposer4.runnerJob == job) {
                                recomposer4.runnerJob = null;
                            }
                            recomposer4.deriveStateLocked();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    Recomposer.INSTANCE.removeRunning(Recomposer.this.recomposerInfo);
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                observerHandle = (ObserverHandle) this.L$1;
                job = (Job) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    observerHandle.dispose();
                    obj3 = Recomposer.this.stateLock;
                    Recomposer recomposer32 = Recomposer.this;
                    synchronized (obj3) {
                        try {
                            if (recomposer32.runnerJob == job) {
                                recomposer32.runnerJob = null;
                            }
                            recomposer32.deriveStateLocked();
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    Recomposer.INSTANCE.removeRunning(Recomposer.this.recomposerInfo);
                    return Unit.INSTANCE;
                } catch (Throwable th5) {
                    th = th5;
                    observerHandle.dispose();
                    obj2 = Recomposer.this.stateLock;
                    Recomposer recomposer42 = Recomposer.this;
                    synchronized (obj2) {
                    }
                }
            }
        }

        /* compiled from: Recomposer.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", m3645f = "Recomposer.kt", m3646l = {1072}, m3647m = "invokeSuspend")
        /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> $block;
            final /* synthetic */ MonotonicFrameClock $parentFrameClock;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, MonotonicFrameClock monotonicFrameClock, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$block = function3;
                this.$parentFrameClock = monotonicFrameClock;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$block, this.$parentFrameClock, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> function3 = this.$block;
                    MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                    this.label = 1;
                    if (function3.invoke(coroutineScope, monotonicFrameClock, this) == coroutine_suspended) {
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
    }

    private final Object recompositionRunner(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.broadcastFrameClock, new C17512(function3, MonotonicFrameClock2.getMonotonicFrameClock(continuation.getContext()), null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            try {
                if (this._state.getValue().compareTo(State.Idle) >= 0) {
                    this._state.setValue(State.ShuttingDown);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Job.DefaultImpls.cancel$default(this.effectJob, null, 1, null);
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.runtime.Recomposer$join$2", m3645f = "Recomposer.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.Recomposer$join$2 */
    static final class C17492 extends ContinuationImpl7 implements Function2<State, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C17492(Continuation<? super C17492> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17492 c17492 = new C17492(continuation);
            c17492.L$0 = obj;
            return c17492;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(State state, Continuation<? super Boolean> continuation) {
            return ((C17492) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(((State) this.L$0) == State.ShutDown);
        }
    }

    public final Object join(Continuation<? super Unit> continuation) {
        Object objFirst = FlowKt.first(getCurrentState(), new C17492(null), continuation);
        return objFirst == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFirst : Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void composeInitial$runtime_release(ControlledComposition composition, Function2<? super Composer, ? super Integer, Unit> content) throws Throwable {
        Throwable th;
        boolean zIsComposing = composition.isComposing();
        try {
            Snapshot.Companion companion = Snapshot.INSTANCE;
            MutableSnapshot mutableSnapshotTakeMutableSnapshot = companion.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, null));
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
                try {
                    composition.composeContent(content);
                    Unit unit = Unit.INSTANCE;
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                    if (!zIsComposing) {
                        companion.notifyObjectsInitialized();
                    }
                    synchronized (this.stateLock) {
                        try {
                            if (this._state.getValue().compareTo(State.ShuttingDown) > 0) {
                                try {
                                    if (!getKnownCompositions().contains(composition)) {
                                        addKnownCompositionLocked(composition);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            try {
                                performInitialMovableContentInserts(composition);
                                try {
                                    composition.applyChanges();
                                    composition.applyLateChanges();
                                    if (zIsComposing) {
                                        return;
                                    }
                                    companion.notifyObjectsInitialized();
                                } catch (Throwable th3) {
                                    processCompositionError$default(this, th3, null, false, 6, null);
                                }
                            } catch (Throwable th4) {
                                processCompositionError(th4, composition, true);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                        throw th6;
                    } catch (Throwable th7) {
                        th = th7;
                        Throwable th8 = th;
                        try {
                            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                            throw th8;
                        } catch (Throwable th9) {
                            th = th9;
                            processCompositionError(th, composition, true);
                        }
                    }
                }
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (Throwable th11) {
            th = th11;
        }
    }

    private final void performInitialMovableContentInserts(ControlledComposition composition) {
        synchronized (this.stateLock) {
            List<MovableContentStateReference> list = this.movableContentAwaitingInsert;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.areEqual(list.get(i).getComposition(), composition)) {
                    Unit unit = Unit.INSTANCE;
                    ArrayList arrayList = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, composition);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, composition);
                    }
                    return;
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                Iterator<MovableContentStateReference> it = recomposer.movableContentAwaitingInsert.iterator();
                while (it.hasNext()) {
                    MovableContentStateReference next = it.next();
                    if (Intrinsics.areEqual(next.getComposition(), controlledComposition)) {
                        list.add(next);
                        it.remove();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ControlledComposition performRecompose(final ControlledComposition composition, final ScatterSet2<Object> modifiedValues) {
        Set<ControlledComposition> set;
        if (composition.isComposing() || composition.getDisposed() || ((set = this.compositionsRemoved) != null && set.contains(composition))) {
            return null;
        }
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, modifiedValues));
        try {
            Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
            if (modifiedValues != null) {
                try {
                    if (modifiedValues.isNotEmpty()) {
                        composition.prepareCompose(new Function0<Unit>() { // from class: androidx.compose.runtime.Recomposer$performRecompose$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                ScatterSet2<Object> scatterSet2 = modifiedValues;
                                ControlledComposition controlledComposition = composition;
                                Object[] objArr = scatterSet2.elements;
                                long[] jArr = scatterSet2.metadata;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    return;
                                }
                                int i = 0;
                                while (true) {
                                    long j = jArr[i];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i2 = 8 - ((~(i - length)) >>> 31);
                                        for (int i3 = 0; i3 < i2; i3++) {
                                            if ((255 & j) < 128) {
                                                controlledComposition.recordWriteOf(objArr[(i << 3) + i3]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i2 != 8) {
                                            return;
                                        }
                                    }
                                    if (i == length) {
                                        return;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th;
                }
            }
            boolean zRecompose = composition.recompose();
            mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
            if (zRecompose) {
                return composition;
            }
            return null;
        } finally {
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedMovableContentState() {
        int i;
        ObjectList objectListEmptyObjectList;
        synchronized (this.stateLock) {
            try {
                if (MultiValueMap.m6409isNotEmptyimpl(this.movableContentRemoved)) {
                    ObjectList objectListM6414valuesimpl = MultiValueMap.m6414valuesimpl(this.movableContentRemoved);
                    MultiValueMap.m6401clearimpl(this.movableContentRemoved);
                    this.movableContentNestedStatesAvailable.clear();
                    MultiValueMap.m6401clearimpl(this.movableContentNestedExtractionsPending);
                    ObjectList2 objectList2 = new ObjectList2(objectListM6414valuesimpl.get_size());
                    Object[] objArr = objectListM6414valuesimpl.content;
                    int i2 = objectListM6414valuesimpl._size;
                    for (int i3 = 0; i3 < i2; i3++) {
                        MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr[i3];
                        objectList2.add(Tuples4.m3642to(movableContentStateReference, this.movableContentStatesAvailable.get(movableContentStateReference)));
                    }
                    this.movableContentStatesAvailable.clear();
                    objectListEmptyObjectList = objectList2;
                } else {
                    objectListEmptyObjectList = ObjectList3.emptyObjectList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = objectListEmptyObjectList.content;
        int i4 = objectListEmptyObjectList._size;
        for (i = 0; i < i4; i++) {
            Tuples2 tuples2 = (Tuples2) objArr2[i];
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) tuples2.component1();
            MovableContentState movableContentState = (MovableContentState) tuples2.component2();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    private final Function1<Object, Unit> readObserverOf(final ControlledComposition composition) {
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.Recomposer.readObserverOf.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                composition.recordReadOf(obj);
            }
        };
    }

    private final Function1<Object, Unit> writeObserverOf(final ControlledComposition composition, final ScatterSet2<Object> modifiedValues) {
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.Recomposer.writeObserverOf.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                composition.recordWriteOf(obj);
                ScatterSet2<Object> scatterSet2 = modifiedValues;
                if (scatterSet2 != null) {
                    scatterSet2.add(obj);
                }
            }
        };
    }

    private final void applyAndCheck(MutableSnapshot snapshot) {
        try {
            if (snapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            snapshot.dispose();
        }
    }

    private final boolean getHasFrameWorkLocked() {
        return this.compositionInvalidations.getSize() != 0 || getHasBroadcastFrameClockAwaitersLocked();
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void resumeCompositionFrameClock() {
        CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                cancellableContinuationDeriveStateLocked = deriveStateLocked();
            } else {
                cancellableContinuationDeriveStateLocked = null;
            }
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingCallByInformation$runtime_release() {
        return _hotReloadEnabled.get().booleanValue();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(ControlledComposition composition) {
        synchronized (this.stateLock) {
            removeKnownCompositionLocked(composition);
            this.compositionInvalidations.remove(composition);
            this.compositionsAwaitingApply.remove(composition);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(ControlledComposition composition) {
        CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(composition)) {
                cancellableContinuationDeriveStateLocked = null;
            } else {
                this.compositionInvalidations.add(composition);
                cancellableContinuationDeriveStateLocked = deriveStateLocked();
            }
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime_release(MovableContentStateReference reference) {
        CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            this.movableContentAwaitingInsert.add(reference);
            cancellableContinuationDeriveStateLocked = deriveStateLocked();
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime_release(MovableContentStateReference reference) {
        synchronized (this.stateLock) {
            try {
                MultiValueMap.m6399addimpl(this.movableContentRemoved, reference.getContent$runtime_release(), reference);
                if (reference.getNestedReferences$runtime_release() != null) {
                    deletedMovableContent$lambda$73$recordNestedStatesOf(this, reference, reference);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static final void deletedMovableContent$lambda$73$recordNestedStatesOf(Recomposer recomposer, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        List<MovableContentStateReference> nestedReferences$runtime_release = movableContentStateReference2.getNestedReferences$runtime_release();
        if (nestedReferences$runtime_release != null) {
            int size = nestedReferences$runtime_release.size();
            for (int i = 0; i < size; i++) {
                MovableContentStateReference movableContentStateReference3 = nestedReferences$runtime_release.get(i);
                recomposer.movableContentNestedStatesAvailable.add(movableContentStateReference3.getContent$runtime_release(), new Recomposer4(movableContentStateReference3, movableContentStateReference));
                deletedMovableContent$lambda$73$recordNestedStatesOf(recomposer, movableContentStateReference, movableContentStateReference3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    @Override // androidx.compose.runtime.CompositionContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void movableContentStateReleased$runtime_release(MovableContentStateReference reference, MovableContentState data, Applier<?> applier) {
        synchronized (this.stateLock) {
            try {
                this.movableContentStatesAvailable.set(reference, data);
                ObjectList<MovableContentStateReference> objectListM6406getimpl = MultiValueMap.m6406getimpl(this.movableContentNestedExtractionsPending, reference);
                if (objectListM6406getimpl.isNotEmpty()) {
                    ScatterMap<MovableContentStateReference, MovableContentState> scatterMapExtractNestedStates$runtime_release = data.extractNestedStates$runtime_release(applier, objectListM6406getimpl);
                    Object[] objArr = scatterMapExtractNestedStates$runtime_release.keys;
                    Object[] objArr2 = scatterMapExtractNestedStates$runtime_release.values;
                    long[] jArr = scatterMapExtractNestedStates$runtime_release.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        int i4 = (i << 3) + i3;
                                        Object obj = objArr[i4];
                                        this.movableContentStatesAvailable.set((MovableContentStateReference) obj, (MovableContentState) objArr2[i4]);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                } else if (i == length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime_release(ControlledComposition composition) {
        synchronized (this.stateLock) {
            try {
                Set linkedHashSet = this.compositionsRemoved;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.compositionsRemoved = linkedHashSet;
                }
                linkedHashSet.add(composition);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference reference) {
        MovableContentState movableContentStateRemove;
        synchronized (this.stateLock) {
            movableContentStateRemove = this.movableContentStatesAvailable.remove(reference);
        }
        return movableContentStateRemove;
    }

    /* compiled from: Recomposer.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tR4\u0010\u000f\u001a\"\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bj\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", SduiFeatureDiscovery3.INFO_TAG, "", "addRunning", "(Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;)V", "removeRunning", "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/internal/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "_runningRecomposers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(RecomposerInfoImpl info) {
            ImmutableSet2 immutableSet2;
            ImmutableSet2 immutableSet2Add;
            do {
                immutableSet2 = (ImmutableSet2) Recomposer._runningRecomposers.getValue();
                immutableSet2Add = immutableSet2.add((ImmutableSet2) info);
                if (immutableSet2 == immutableSet2Add) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.compareAndSet(immutableSet2, immutableSet2Add));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(RecomposerInfoImpl info) {
            ImmutableSet2 immutableSet2;
            ImmutableSet2 immutableSet2Remove;
            do {
                immutableSet2 = (ImmutableSet2) Recomposer._runningRecomposers.getValue();
                immutableSet2Remove = immutableSet2.remove((ImmutableSet2) info);
                if (immutableSet2 == immutableSet2Remove) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.compareAndSet(immutableSet2, immutableSet2Remove));
        }
    }
}
