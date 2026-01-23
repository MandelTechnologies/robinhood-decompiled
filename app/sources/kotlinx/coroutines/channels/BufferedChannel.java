package kotlinx.coroutines.channels;

import androidx.concurrent.futures.C2031xc40028dd;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.singular.sdk.internal.Constants;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuation2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.internal.ConcurrentLinkedList;
import kotlinx.coroutines.internal.ConcurrentLinkedList2;
import kotlinx.coroutines.internal.ConcurrentLinkedList3;
import kotlinx.coroutines.internal.ConcurrentLinkedList4;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.OnUndeliveredElement;
import kotlinx.coroutines.internal.OnUndeliveredElement2;
import kotlinx.coroutines.internal.StackTraceRecovery;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

/* compiled from: BufferedChannel.kt */
@Metadata(m3635d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004â\u0001ã\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0013\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010 \u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!JG\u0010\"\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0011H\u0003¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010%J\u001b\u0010(\u001a\u00020\u001e*\u00020\u001c2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)J.\u0010+\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010\u0017J\u001d\u0010.\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b.\u0010/J4\u00102\u001a\b\u0012\u0004\u0012\u00028\u0000002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b1\u0010,J#\u00103\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000\u0018H\u0002¢\u0006\u0004\b3\u0010/J9\u00104\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b4\u00105J9\u00106\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b6\u00105J)\u00107\u001a\u00020\u001e*\u00020\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u0010:J-\u0010<\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u0011H\u0002¢\u0006\u0004\b<\u0010=J-\u0010>\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u0011H\u0002¢\u0006\u0004\b>\u0010=J\u0019\u0010@\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u0011H\u0002¢\u0006\u0004\b@\u0010AJ%\u0010E\u001a\u00020\u00062\n\u0010C\u001a\u0006\u0012\u0002\b\u00030B2\b\u0010D\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bE\u0010FJ\u001b\u0010G\u001a\u00020\u00062\n\u0010C\u001a\u0006\u0012\u0002\b\u00030BH\u0002¢\u0006\u0004\bG\u0010HJ%\u0010J\u001a\u0004\u0018\u00010\u001c2\b\u0010D\u001a\u0004\u0018\u00010\u001c2\b\u0010I\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bJ\u0010KJ%\u0010L\u001a\u0004\u0018\u00010\u001c2\b\u0010D\u001a\u0004\u0018\u00010\u001c2\b\u0010I\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bL\u0010KJ\u000f\u0010M\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u0010:J\u000f\u0010N\u001a\u00020\u0006H\u0002¢\u0006\u0004\bN\u0010:J\u000f\u0010O\u001a\u00020\u0006H\u0002¢\u0006\u0004\bO\u0010:J\u000f\u0010P\u001a\u00020\u0006H\u0002¢\u0006\u0004\bP\u0010:J\u000f\u0010Q\u001a\u00020\u0006H\u0002¢\u0006\u0004\bQ\u0010:J\u001d\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010R\u001a\u00020\u0011H\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u00062\u0006\u0010R\u001a\u00020\u0011H\u0002¢\u0006\u0004\bU\u0010AJ\u0015\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bV\u0010WJ\u001d\u0010Y\u001a\u00020\u00112\f\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bY\u0010ZJ\u001d\u0010[\u001a\u00020\u00062\f\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b[\u0010\\J%\u0010^\u001a\u00020\u00062\f\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010]\u001a\u00020\u0011H\u0002¢\u0006\u0004\b^\u0010_J\u0013\u0010`\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\b`\u0010aJ\u0013\u0010b\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\bb\u0010aJ\u001b\u0010d\u001a\u00020\u0006*\u00020\u00152\u0006\u0010c\u001a\u00020\u001eH\u0002¢\u0006\u0004\bd\u0010eJ\u001f\u0010h\u001a\u00020\u001e2\u0006\u0010f\u001a\u00020\u00112\u0006\u0010g\u001a\u00020\u001eH\u0002¢\u0006\u0004\bh\u0010iJ-\u0010k\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010j\u001a\u00020\u0011H\u0002¢\u0006\u0004\bk\u0010=J-\u0010n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010l\u001a\u00020\u00112\f\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bn\u0010oJ-\u0010p\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010l\u001a\u00020\u00112\f\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bp\u0010oJ5\u0010r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010l\u001a\u00020\u00112\f\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010q\u001a\u00020\u0011H\u0002¢\u0006\u0004\br\u0010sJ%\u0010t\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u00112\f\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bt\u0010uJ\u0017\u0010w\u001a\u00020\u00062\u0006\u0010v\u001a\u00020\u0011H\u0002¢\u0006\u0004\bw\u0010AJ\u0017\u0010x\u001a\u00020\u00062\u0006\u0010v\u001a\u00020\u0011H\u0002¢\u0006\u0004\bx\u0010AJG\u0010|\u001a \u0012\u0004\u0012\u00020z\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000000\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u00060y*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0004\b|\u0010}J0\u0010\u0082\u0001\u001a\u00020\u00062\u0006\u0010~\u001a\u00020z2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u0000002\u0006\u0010\u007f\u001a\u00020{H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001JO\u0010\u0084\u0001\u001a\u001d\u0012\u0004\u0012\u00020z\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u00060\u0083\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001JC\u0010\u0084\u0001\u001a\u001a\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u00060y*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0005\b\u0084\u0001\u0010}J*\u0010\u0086\u0001\u001a\u00020\u00062\u0006\u0010~\u001a\u00020z2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u007f\u001a\u00020{H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0081\u0001J\u001a\u0010\u0087\u0001\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0005\b\u0087\u0001\u0010\rJ \u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J \u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0004¢\u0006\u0006\b\u008b\u0001\u0010\u0089\u0001J\u0011\u0010\u008d\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u008d\u0001\u0010:J\u0011\u0010\u008e\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u008e\u0001\u0010:J\u0013\u0010\u008f\u0001\u001a\u00028\u0000H\u0096@¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0019\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0096@¢\u0006\u0006\b\u0091\u0001\u0010\u0090\u0001J\u0018\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001a\u0010\u0097\u0001\u001a\u00020\u00062\u0007\u0010\u0096\u0001\u001a\u00020\u0011H\u0004¢\u0006\u0005\b\u0097\u0001\u0010AJ\u0019\u0010\u0099\u0001\u001a\u00020\u00062\u0006\u0010j\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u0098\u0001\u0010AJ\u001a\u0010\u009b\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u009a\u0001H\u0096\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0011\u0010\u009d\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u009d\u0001\u0010:J\u001c\u0010\u009e\u0001\u001a\u00020\u001e2\b\u0010~\u001a\u0004\u0018\u00010zH\u0016¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\"\u0010¢\u0001\u001a\u00020\u00062\u0010\u0010~\u001a\f\u0018\u00010 \u0001j\u0005\u0018\u0001`¡\u0001¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001c\u0010¥\u0001\u001a\u00020\u001e2\b\u0010~\u001a\u0004\u0018\u00010zH\u0010¢\u0006\u0006\b¤\u0001\u0010\u009f\u0001J%\u0010¦\u0001\u001a\u00020\u001e2\b\u0010~\u001a\u0004\u0018\u00010z2\u0007\u0010¢\u0001\u001a\u00020\u001eH\u0014¢\u0006\u0006\b¦\u0001\u0010§\u0001J:\u0010«\u0001\u001a\u00020\u00062&\u0010ª\u0001\u001a!\u0012\u0017\u0012\u0015\u0018\u00010z¢\u0006\u000e\b¨\u0001\u0012\t\b©\u0001\u0012\u0004\b\b(~\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0012\u0010¯\u0001\u001a\u00020\u001eH\u0000¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u0013\u0010±\u0001\u001a\u00030°\u0001H\u0016¢\u0006\u0006\b±\u0001\u0010²\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010³\u0001R/\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b\b\u0010´\u0001R\u0098\u0001\u0010¸\u0001\u001a|\u0012\u0019\u0012\u0017\u0012\u0002\b\u00030B¢\u0006\u000e\b¨\u0001\u0012\t\b©\u0001\u0012\u0004\b\b(C\u0012\u0018\u0012\u0016\u0018\u00010\u001c¢\u0006\u000f\b¨\u0001\u0012\n\b©\u0001\u0012\u0005\b\b(µ\u0001\u0012\u0018\u0012\u0016\u0018\u00010\u001c¢\u0006\u000f\b¨\u0001\u0012\n\b©\u0001\u0012\u0005\b\b(¶\u0001\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020z\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u00060\u0083\u0001\u0018\u00010\u0083\u0001j\u0005\u0018\u0001`·\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b¸\u0001\u0010¹\u0001\u0012\u0005\bº\u0001\u0010:R\u0017\u0010½\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010¼\u0001R\u0017\u0010¾\u0001\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010®\u0001R\u0017\u0010Á\u0001\u001a\u00020z8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u001a\u0010Â\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010%R\u001a\u0010Ã\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010%R\u0016\u0010]\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\bÄ\u0001\u0010¼\u0001R\u0017\u0010Æ\u0001\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010¼\u0001R%\u0010Ë\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Ç\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÊ\u0001\u0010:\u001a\u0006\bÈ\u0001\u0010É\u0001R+\u0010Î\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000Ç\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÍ\u0001\u0010:\u001a\u0006\bÌ\u0001\u0010É\u0001R\u0019\u0010Ð\u0001\u001a\u0004\u0018\u00010z8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010À\u0001R\u0017\u0010Ò\u0001\u001a\u00020z8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010À\u0001R\u0017\u0010Ó\u0001\u001a\u00020\u001e8TX\u0094\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010®\u0001R\u001e\u0010Ô\u0001\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÕ\u0001\u0010:\u001a\u0006\bÔ\u0001\u0010®\u0001R\u001c\u0010g\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÖ\u0001\u0010:\u001a\u0005\bg\u0010®\u0001R\r\u0010Ø\u0001\u001a\u00030×\u00018\u0002X\u0082\u0004R\r\u0010Ù\u0001\u001a\u00030×\u00018\u0002X\u0082\u0004R\r\u0010Ú\u0001\u001a\u00030×\u00018\u0002X\u0082\u0004R\r\u0010Û\u0001\u001a\u00030×\u00018\u0002X\u0082\u0004R\u0019\u0010Ý\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ü\u00018\u0002X\u0082\u0004R\u0019\u0010Þ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ü\u00018\u0002X\u0082\u0004R\u0019\u0010ß\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0Ü\u00018\u0002X\u0082\u0004R\u0015\u0010à\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0Ü\u00018\u0002X\u0082\u0004R\u0015\u0010á\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0Ü\u00018\u0002X\u0082\u0004¨\u0006ä\u0001"}, m3636d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", "E", "Lkotlinx/coroutines/channels/Channel;", "", "capacity", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "element", "onClosedSend", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelSegment;", "segment", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", Constants.RequestParamsKeys.SESSION_ID_KEY, "sendOnNoWaiterSuspend", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/Waiter;", "prepareSenderForSuspension", "(Lkotlinx/coroutines/Waiter;Lkotlinx/coroutines/channels/ChannelSegment;I)V", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "onClosedSendOnNoWaiterSuspend", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "", "waiter", "", "closed", "updateCellSend", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLjava/lang/Object;Z)I", "updateCellSendSlow", "curSendersAndCloseStatus", "shouldSendSuspend", "(J)Z", "curSenders", "bufferOrRendezvousSend", "tryResumeReceiver", "(Ljava/lang/Object;Ljava/lang/Object;)Z", Constants.REVENUE_AMOUNT_KEY, "receiveOnNoWaiterSuspend", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareReceiverForSuspension", "onClosedReceiveOnNoWaiterSuspend", "(Lkotlinx/coroutines/CancellableContinuation;)V", "Lkotlinx/coroutines/channels/ChannelResult;", "receiveCatchingOnNoWaiterSuspend-GKJJFZk", "receiveCatchingOnNoWaiterSuspend", "onClosedReceiveCatchingOnNoWaiterSuspend", "updateCellReceive", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLjava/lang/Object;)Ljava/lang/Object;", "updateCellReceiveSlow", "tryResumeSender", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/ChannelSegment;I)Z", "expandBuffer", "()V", "b", "updateCellExpandBuffer", "(Lkotlinx/coroutines/channels/ChannelSegment;IJ)Z", "updateCellExpandBufferSlow", "nAttempts", "incCompletedExpandBufferAttempts", "(J)V", "Lkotlinx/coroutines/selects/SelectInstance;", Fields4.TYPE, "ignoredParam", "registerSelectForReceive", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "onClosedSelectOnReceive", "(Lkotlinx/coroutines/selects/SelectInstance;)V", "selectResult", "processResultSelectReceive", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "processResultSelectReceiveCatching", "invokeCloseHandler", "markClosed", "markCancelled", "markCancellationStarted", "completeCloseOrCancel", "sendersCur", "completeClose", "(J)Lkotlinx/coroutines/channels/ChannelSegment;", "completeCancel", "closeLinkedList", "()Lkotlinx/coroutines/channels/ChannelSegment;", "lastSegment", "markAllEmptyCellsAsClosed", "(Lkotlinx/coroutines/channels/ChannelSegment;)J", "removeUnprocessedElements", "(Lkotlinx/coroutines/channels/ChannelSegment;)V", "sendersCounter", "cancelSuspendedReceiveRequests", "(Lkotlinx/coroutines/channels/ChannelSegment;J)V", "resumeReceiverOnClosedChannel", "(Lkotlinx/coroutines/Waiter;)V", "resumeSenderOnCancelledChannel", "receiver", "resumeWaiterOnClosedChannel", "(Lkotlinx/coroutines/Waiter;Z)V", "sendersAndCloseStatusCur", "isClosedForReceive", "isClosed", "(JZ)Z", "globalIndex", "isCellNonEmpty", "id", "startFrom", "findSegmentSend", "(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", "findSegmentReceive", "currentBufferEndCounter", "findSegmentBufferEnd", "(JLkotlinx/coroutines/channels/ChannelSegment;J)Lkotlinx/coroutines/channels/ChannelSegment;", "moveSegmentBufferEndToSpecifiedOrLast", "(JLkotlinx/coroutines/channels/ChannelSegment;)V", "value", "updateSendersCounterIfLower", "updateReceiversCounterIfLower", "Lkotlin/reflect/KFunction3;", "", "Lkotlin/coroutines/CoroutineContext;", "bindCancellationFunResult", "(Lkotlin/jvm/functions/Function1;)Lkotlin/reflect/KFunction;", "cause", "context", "onCancellationChannelResultImplDoNotCall-5_sEAP8", "(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "onCancellationChannelResultImplDoNotCall", "Lkotlin/Function3;", "bindCancellationFun", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/jvm/functions/Function3;", "onCancellationImplDoNotCall", "send", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "trySendDropOldest-JP2dKIU", "trySendDropOldest", "onReceiveEnqueued", "onReceiveDequeued", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching-JP2dKIU", "receiveCatching", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "tryReceive", "globalCellIndex", "dropFirstElementUntilTheSpecifiedCellIsInTheBuffer", "waitExpandBufferCompletion$kotlinx_coroutines_core", "waitExpandBufferCompletion", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "()Lkotlinx/coroutines/channels/ChannelIterator;", "onClosedIdempotent", "close", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "cancelImpl$kotlinx_coroutines_core", "cancelImpl", "closeOrCancelImpl", "(Ljava/lang/Throwable;Z)Z", "Lkotlin/ParameterName;", "name", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "hasElements$kotlinx_coroutines_core", "()Z", "hasElements", "", "toString", "()Ljava/lang/String;", "I", "Lkotlin/jvm/functions/Function1;", "param", "internalResult", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onUndeliveredElementReceiveCancellationConstructor", "Lkotlin/jvm/functions/Function3;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "getBufferEndCounter", "()J", "bufferEndCounter", "isRendezvousOrUnlimited", "getReceiveException", "()Ljava/lang/Throwable;", "receiveException", "isClosedForSend0", "isClosedForReceive0", "getSendersCounter$kotlinx_coroutines_core", "getReceiversCounter$kotlinx_coroutines_core", "receiversCounter", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive$annotations", "onReceive", "getOnReceiveCatching", "getOnReceiveCatching$annotations", "onReceiveCatching", "getCloseCause", "closeCause", "getSendException", "sendException", "isConflatedDropOldest", "isClosedForSend", "isClosedForSend$annotations", "isClosedForReceive$annotations", "Lkotlinx/atomicfu/AtomicLong;", "sendersAndCloseStatus", "receivers", "bufferEnd", "completedExpandBuffersAndPauseFlag", "Lkotlinx/atomicfu/AtomicRef;", "sendSegment", "receiveSegment", "bufferEndSegment", "_closeCause", "closeHandler", "SendBroadcast", "BufferedChannelIterator", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes23.dex */
public class BufferedChannel<E> implements Channel<E> {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private final int capacity;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    @JvmField
    public final Function1<E, Unit> onUndeliveredElement;
    private final Function3<SelectInstance<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    private static final /* synthetic */ AtomicLongFieldUpdater sendersAndCloseStatus$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater receivers$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater bufferEnd$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater completedExpandBuffersAndPauseFlag$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater sendSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater receiveSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater bufferEndSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _closeCause$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater closeHandler$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getReceiveSegment$volatile$FU() {
        return receiveSegment$volatile$FU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater getReceivers$volatile$FU() {
        return receivers$volatile$FU;
    }

    protected boolean isConflatedDropOldest() {
        return false;
    }

    protected void onClosedIdempotent() {
    }

    protected void onReceiveDequeued() {
    }

    protected void onReceiveEnqueued() {
    }

    @Override // kotlinx.coroutines.channels.Channel8
    public Object receive(Continuation<? super E> continuation) {
        return receive$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.channels.Channel8
    /* renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public Object mo28798receiveCatchingJP2dKIU(Continuation<? super Channel5<? extends E>> continuation) {
        return m28796receiveCatchingJP2dKIU$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.channels.Channel9
    public Object send(E e, Continuation<? super Unit> continuation) {
        return send$suspendImpl(this, e, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BufferedChannel(int i, Function1<? super E, Unit> function1) {
        this.capacity = i;
        this.onUndeliveredElement = function1;
        if (i >= 0) {
            this.bufferEnd$volatile = BufferedChannelKt.initialBufferEnd(i);
            this.completedExpandBuffersAndPauseFlag$volatile = getBufferEndCounter();
            ChannelSegment channelSegment = new ChannelSegment(0L, null, this, 3);
            this.sendSegment$volatile = channelSegment;
            this.receiveSegment$volatile = channelSegment;
            if (isRendezvousOrUnlimited()) {
                channelSegment = BufferedChannelKt.NULL_SEGMENT;
                Intrinsics.checkNotNull(channelSegment, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = channelSegment;
            this.onUndeliveredElementReceiveCancellationConstructor = function1 != 0 ? new Function3() { // from class: kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BufferedChannel.m3729xa189d599(this.f$0, (SelectInstance) obj, obj2, obj3);
                }
            } : null;
            this._closeCause$volatile = BufferedChannelKt.NO_CLOSE_CAUSE;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i + ", should be >=0").toString());
    }

    @Override // kotlinx.coroutines.channels.Channel9
    @Deprecated
    public boolean offer(E e) {
        return Channel.DefaultImpls.offer(this, e);
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L;
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return receivers$volatile$FU.get(this);
    }

    private final long getBufferEndCounter() {
        return bufferEnd$volatile$FU.get(this);
    }

    private final boolean isRendezvousOrUnlimited() {
        long bufferEndCounter = getBufferEndCounter();
        return bufferEndCounter == 0 || bufferEndCounter == Long.MAX_VALUE;
    }

    static /* synthetic */ <E> Object send$suspendImpl(BufferedChannel<E> bufferedChannel, E e, Continuation<? super Unit> continuation) {
        ChannelSegment<E> channelSegment;
        ChannelSegment<E> channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / i;
            int i2 = (int) (j % i);
            if (channelSegment2.id != j2) {
                ChannelSegment<E> channelSegmentFindSegmentSend = bufferedChannel.findSegmentSend(j2, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    Object objOnClosedSend = bufferedChannel.onClosedSend(e, continuation);
                    if (objOnClosedSend == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return objOnClosedSend;
                    }
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            E e2 = e;
            int iUpdateCellSend = bufferedChannel2.updateCellSend(channelSegment, i2, e2, j, null, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                break;
            }
            if (iUpdateCellSend == 1) {
                break;
            }
            if (iUpdateCellSend != 2) {
                if (iUpdateCellSend == 3) {
                    Object objSendOnNoWaiterSuspend = bufferedChannel2.sendOnNoWaiterSuspend(channelSegment, i2, e2, j, continuation);
                    if (objSendOnNoWaiterSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return objSendOnNoWaiterSuspend;
                    }
                } else if (iUpdateCellSend != 4) {
                    if (iUpdateCellSend == 5) {
                        channelSegment.cleanPrev();
                    }
                    bufferedChannel = bufferedChannel2;
                    channelSegment2 = channelSegment;
                    e = e2;
                } else {
                    if (j < bufferedChannel2.getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    Object objOnClosedSend2 = bufferedChannel2.onClosedSend(e2, continuation);
                    if (objOnClosedSend2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return objOnClosedSend2;
                    }
                }
            } else if (zIsClosedForSend0) {
                channelSegment.onSlotCleaned();
                Object objOnClosedSend3 = bufferedChannel2.onClosedSend(e2, continuation);
                if (objOnClosedSend3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return objOnClosedSend3;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareSenderForSuspension(Waiter waiter, ChannelSegment<E> channelSegment, int i) {
        waiter.invokeOnCancellation(channelSegment, i + BufferedChannelKt.SEGMENT_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedSendOnNoWaiterSuspend(E element, CancellableContinuation<? super Unit> cont) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            OnUndeliveredElement.callUndeliveredElement(function1, element, cont.getContext());
        }
        Throwable sendException = getSendException();
        Result.Companion companion = Result.INSTANCE;
        cont.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(sendException)));
    }

    @Override // kotlinx.coroutines.channels.Channel9
    /* renamed from: trySend-JP2dKIU */
    public Object mo8337trySendJP2dKIU(E element) {
        E e;
        int i;
        ChannelSegment channelSegment;
        BufferedChannel<E> bufferedChannel;
        if (shouldSendSuspend(sendersAndCloseStatus$volatile$FU.get(this))) {
            return Channel5.INSTANCE.m28814failurePtdJZtk();
        }
        Object obj = BufferedChannelKt.INTERRUPTED_SEND;
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i2 = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / i2;
            int i3 = (int) (j % i2);
            if (channelSegment2.id != j2) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j2, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    i = i3;
                    channelSegment = channelSegmentFindSegmentSend;
                    bufferedChannel = this;
                    e = element;
                } else if (zIsClosedForSend0) {
                    return Channel5.INSTANCE.m28813closedJP2dKIU(getSendException());
                }
            } else {
                e = element;
                i = i3;
                channelSegment = channelSegment2;
                bufferedChannel = this;
            }
            int iUpdateCellSend = bufferedChannel.updateCellSend(channelSegment, i, e, j, obj, zIsClosedForSend0);
            channelSegment2 = channelSegment;
            if (iUpdateCellSend == 0) {
                channelSegment2.cleanPrev();
                return Channel5.INSTANCE.m28815successJP2dKIU(Unit.INSTANCE);
            }
            if (iUpdateCellSend == 1) {
                return Channel5.INSTANCE.m28815successJP2dKIU(Unit.INSTANCE);
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment2.onSlotCleaned();
                    return Channel5.INSTANCE.m28813closedJP2dKIU(getSendException());
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment2, i);
                }
                channelSegment2.onSlotCleaned();
                return Channel5.INSTANCE.m28814failurePtdJZtk();
            }
            if (iUpdateCellSend == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iUpdateCellSend == 4) {
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment2.cleanPrev();
                }
                return Channel5.INSTANCE.m28813closedJP2dKIU(getSendException());
            }
            if (iUpdateCellSend == 5) {
                channelSegment2.cleanPrev();
            }
            element = e;
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$SendBroadcast;", "Lkotlinx/coroutines/Waiter;", "Lkotlinx/coroutines/internal/Segment;", "segment", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "invokeOnCancellation", "(Lkotlinx/coroutines/internal/Segment;I)V", "Lkotlinx/coroutines/CancellableContinuation;", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "getCont", "()Lkotlinx/coroutines/CancellableContinuation;", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    private static final class SendBroadcast implements Waiter {
        private final /* synthetic */ CancellableContinuationImpl<Boolean> $$delegate_0;
        private final CancellableContinuation<Boolean> cont;

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(ConcurrentLinkedList3<?> segment, int index) {
            this.$$delegate_0.invokeOnCancellation(segment, index);
        }

        public final CancellableContinuation<Boolean> getCont() {
            return this.cont;
        }
    }

    /* renamed from: trySendDropOldest-JP2dKIU, reason: not valid java name */
    protected final Object m28800trySendDropOldestJP2dKIU(E element) {
        ChannelSegment channelSegmentFindSegmentSend;
        int i;
        BufferedChannel<E> bufferedChannel;
        Object obj = BufferedChannelKt.BUFFERED;
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i2 = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / i2;
            int i3 = (int) (j % i2);
            if (channelSegment.id != j2) {
                channelSegmentFindSegmentSend = findSegmentSend(j2, channelSegment);
                if (channelSegmentFindSegmentSend != null) {
                    bufferedChannel = this;
                    i = i3;
                } else if (zIsClosedForSend0) {
                    return Channel5.INSTANCE.m28813closedJP2dKIU(getSendException());
                }
            } else {
                channelSegmentFindSegmentSend = channelSegment;
                i = i3;
                bufferedChannel = this;
            }
            E e = element;
            int iUpdateCellSend = bufferedChannel.updateCellSend(channelSegmentFindSegmentSend, i, e, j, obj, zIsClosedForSend0);
            channelSegment = channelSegmentFindSegmentSend;
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                return Channel5.INSTANCE.m28815successJP2dKIU(Unit.INSTANCE);
            }
            if (iUpdateCellSend == 1) {
                return Channel5.INSTANCE.m28815successJP2dKIU(Unit.INSTANCE);
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return Channel5.INSTANCE.m28813closedJP2dKIU(getSendException());
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i);
                }
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer((channelSegment.id * i2) + i);
                return Channel5.INSTANCE.m28815successJP2dKIU(Unit.INSTANCE);
            }
            if (iUpdateCellSend == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iUpdateCellSend == 4) {
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return Channel5.INSTANCE.m28813closedJP2dKIU(getSendException());
            }
            if (iUpdateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            element = e;
        }
    }

    private final Object onClosedSend(E e, Continuation<? super Unit> continuation) {
        OnUndeliveredElement2 onUndeliveredElement2CallUndeliveredElementCatchingException$default;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null && (onUndeliveredElement2CallUndeliveredElementCatchingException$default = OnUndeliveredElement.callUndeliveredElementCatchingException$default(function1, e, null, 2, null)) != null) {
            ExceptionsKt.addSuppressed(onUndeliveredElement2CallUndeliveredElementCatchingException$default, getSendException());
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(onUndeliveredElement2CallUndeliveredElementCatchingException$default)));
        } else {
            Throwable sendException = getSendException();
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(sendException)));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int updateCellSend(ChannelSegment<E> segment, int index, E element, long s, Object waiter, boolean closed) {
        segment.storeElement$kotlinx_coroutines_core(index, element);
        if (closed) {
            return updateCellSendSlow(segment, index, element, s, waiter, closed);
        }
        Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
        if (state$kotlinx_coroutines_core == null) {
            if (bufferOrRendezvousSend(s)) {
                if (segment.casState$kotlinx_coroutines_core(index, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (waiter == null) {
                    return 3;
                }
                if (segment.casState$kotlinx_coroutines_core(index, null, waiter)) {
                    return 2;
                }
            }
        } else if (state$kotlinx_coroutines_core instanceof Waiter) {
            segment.cleanElement$kotlinx_coroutines_core(index);
            if (tryResumeReceiver(state$kotlinx_coroutines_core, element)) {
                segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.DONE_RCV);
                onReceiveDequeued();
                return 0;
            }
            if (segment.getAndSetState$kotlinx_coroutines_core(index, BufferedChannelKt.INTERRUPTED_RCV) == BufferedChannelKt.INTERRUPTED_RCV) {
                return 5;
            }
            segment.onCancelledRequest(index, true);
            return 5;
        }
        return updateCellSendSlow(segment, index, element, s, waiter, closed);
    }

    private final Object receiveOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i, long j, Continuation<? super E> continuation) {
        Function3 function3;
        ChannelSegment channelSegment2;
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuation2.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
        try {
            Object objUpdateCellReceive = updateCellReceive(channelSegment, i, j, orCreateCancellableContinuation);
            if (objUpdateCellReceive != BufferedChannelKt.SUSPEND) {
                if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                    if (j < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    ChannelSegment channelSegment3 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
                    while (true) {
                        if (isClosedForReceive()) {
                            onClosedReceiveOnNoWaiterSuspend(orCreateCancellableContinuation);
                            break;
                        }
                        long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
                        int i2 = BufferedChannelKt.SEGMENT_SIZE;
                        long j2 = andIncrement / i2;
                        int i3 = (int) (andIncrement % i2);
                        if (channelSegment3.id != j2) {
                            ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j2, channelSegment3);
                            if (channelSegmentFindSegmentReceive != null) {
                                channelSegment2 = channelSegmentFindSegmentReceive;
                            }
                        } else {
                            channelSegment2 = channelSegment3;
                        }
                        objUpdateCellReceive = updateCellReceive(channelSegment2, i3, andIncrement, orCreateCancellableContinuation);
                        ChannelSegment channelSegment4 = channelSegment2;
                        if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                            CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation != null ? orCreateCancellableContinuation : null;
                            if (cancellableContinuationImpl != null) {
                                prepareReceiverForSuspension(cancellableContinuationImpl, channelSegment4, i3);
                            }
                        } else if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment4.cleanPrev();
                            }
                            channelSegment3 = channelSegment4;
                        } else {
                            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                throw new IllegalStateException("unexpected");
                            }
                            channelSegment4.cleanPrev();
                            Function1<E, Unit> function1 = this.onUndeliveredElement;
                            function3 = (Function3) (function1 != null ? bindCancellationFun(function1) : null);
                        }
                    }
                } else {
                    channelSegment.cleanPrev();
                    Function1<E, Unit> function12 = this.onUndeliveredElement;
                    function3 = (Function3) (function12 != null ? bindCancellationFun(function12) : null);
                }
                orCreateCancellableContinuation.resume((CancellableContinuationImpl) objUpdateCellReceive, (Function3<? super Throwable, ? super CancellableContinuationImpl, ? super CoroutineContext, Unit>) function3);
            } else {
                prepareReceiverForSuspension(orCreateCancellableContinuation, channelSegment, i);
            }
            Object result = orCreateCancellableContinuation.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object sendOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i, E e, long j, Continuation<? super Unit> continuation) {
        Object objM28550constructorimpl;
        Object result;
        ChannelSegment channelSegmentFindSegmentSend;
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuation2.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
        try {
            int iUpdateCellSend = updateCellSend(channelSegment, i, e, j, orCreateCancellableContinuation, false);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
            } else {
                if (iUpdateCellSend != 1) {
                    if (iUpdateCellSend != 2) {
                        if (iUpdateCellSend != 4) {
                            String str = "unexpected";
                            if (iUpdateCellSend != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            channelSegment.cleanPrev();
                            ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
                            while (true) {
                                long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
                                long j2 = 1152921504606846975L & andIncrement;
                                boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
                                int i2 = BufferedChannelKt.SEGMENT_SIZE;
                                long j3 = j2 / i2;
                                int i3 = (int) (j2 % i2);
                                String str2 = str;
                                if (channelSegment2.id != j3) {
                                    channelSegmentFindSegmentSend = findSegmentSend(j3, channelSegment2);
                                    if (channelSegmentFindSegmentSend == null) {
                                        if (zIsClosedForSend0) {
                                            break;
                                        }
                                        str = str2;
                                    }
                                } else {
                                    channelSegmentFindSegmentSend = channelSegment2;
                                }
                                int iUpdateCellSend2 = updateCellSend(channelSegmentFindSegmentSend, i3, e, j2, orCreateCancellableContinuation, zIsClosedForSend0);
                                if (iUpdateCellSend2 == 0) {
                                    channelSegmentFindSegmentSend.cleanPrev();
                                    Result.Companion companion2 = Result.INSTANCE;
                                    objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
                                    break;
                                }
                                if (iUpdateCellSend2 == 1) {
                                    Result.Companion companion3 = Result.INSTANCE;
                                    objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
                                    break;
                                }
                                if (iUpdateCellSend2 != 2) {
                                    if (iUpdateCellSend2 == 3) {
                                        throw new IllegalStateException(str2);
                                    }
                                    if (iUpdateCellSend2 != 4) {
                                        if (iUpdateCellSend2 == 5) {
                                            channelSegmentFindSegmentSend.cleanPrev();
                                        }
                                        str = str2;
                                        channelSegment2 = channelSegmentFindSegmentSend;
                                    } else if (j2 < getReceiversCounter$kotlinx_coroutines_core()) {
                                        channelSegmentFindSegmentSend.cleanPrev();
                                    }
                                } else if (zIsClosedForSend0) {
                                    channelSegmentFindSegmentSend.onSlotCleaned();
                                } else {
                                    CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation != null ? orCreateCancellableContinuation : null;
                                    if (cancellableContinuationImpl != null) {
                                        prepareSenderForSuspension(cancellableContinuationImpl, channelSegmentFindSegmentSend, i3);
                                    }
                                }
                            }
                        } else if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        onClosedSendOnNoWaiterSuspend(e, orCreateCancellableContinuation);
                    } else {
                        prepareSenderForSuspension(orCreateCancellableContinuation, channelSegment, i);
                    }
                    result = orCreateCancellableContinuation.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbes.probeCoroutineSuspended(continuation);
                    }
                    return result != IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
                }
                Result.Companion companion4 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
            }
            orCreateCancellableContinuation.resumeWith(objM28550constructorimpl);
            result = orCreateCancellableContinuation.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
            if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    private final int updateCellSendSlow(ChannelSegment<E> segment, int index, E element, long s, Object waiter, boolean closed) {
        while (true) {
            Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core != null) {
                if (state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.INTERRUPTED_RCV) {
                        if (state$kotlinx_coroutines_core == BufferedChannelKt.POISONED) {
                            segment.cleanElement$kotlinx_coroutines_core(index);
                            return 5;
                        }
                        if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                            segment.cleanElement$kotlinx_coroutines_core(index);
                            completeCloseOrCancel();
                            return 4;
                        }
                        segment.cleanElement$kotlinx_coroutines_core(index);
                        if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                            state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                        }
                        if (tryResumeReceiver(state$kotlinx_coroutines_core, element)) {
                            segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.DONE_RCV);
                            onReceiveDequeued();
                            return 0;
                        }
                        if (segment.getAndSetState$kotlinx_coroutines_core(index, BufferedChannelKt.INTERRUPTED_RCV) != BufferedChannelKt.INTERRUPTED_RCV) {
                            segment.onCancelledRequest(index, true);
                        }
                        return 5;
                    }
                    segment.cleanElement$kotlinx_coroutines_core(index);
                    return 5;
                }
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else if (!bufferOrRendezvousSend(s) || closed) {
                if (closed) {
                    if (segment.casState$kotlinx_coroutines_core(index, null, BufferedChannelKt.INTERRUPTED_SEND)) {
                        segment.onCancelledRequest(index, false);
                        return 4;
                    }
                } else {
                    if (waiter == null) {
                        return 3;
                    }
                    if (segment.casState$kotlinx_coroutines_core(index, null, waiter)) {
                        return 2;
                    }
                }
            } else if (segment.casState$kotlinx_coroutines_core(index, null, BufferedChannelKt.BUFFERED)) {
                return 1;
            }
        }
    }

    private final boolean shouldSendSuspend(long curSendersAndCloseStatus) {
        if (isClosedForSend0(curSendersAndCloseStatus)) {
            return false;
        }
        return !bufferOrRendezvousSend(curSendersAndCloseStatus & 1152921504606846975L);
    }

    private final boolean bufferOrRendezvousSend(long curSenders) {
        return curSenders < getBufferEndCounter() || curSenders < getReceiversCounter$kotlinx_coroutines_core() + ((long) this.capacity);
    }

    private final boolean tryResumeReceiver(Object obj, E e) {
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).trySelect(this, e);
        }
        if (obj instanceof ReceiveCatching) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            CancellableContinuationImpl<Channel5<? extends E>> cancellableContinuationImpl = ((ReceiveCatching) obj).cont;
            Channel5 channel5M28802boximpl = Channel5.m28802boximpl(Channel5.INSTANCE.m28815successJP2dKIU(e));
            Function1<E, Unit> function1 = this.onUndeliveredElement;
            return BufferedChannelKt.tryResume0(cancellableContinuationImpl, channel5M28802boximpl, (Function3) (function1 != null ? bindCancellationFunResult(function1) : null));
        }
        if (obj instanceof BufferedChannelIterator) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((BufferedChannelIterator) obj).tryResumeHasNext(e);
        }
        if (obj instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
            Function1<E, Unit> function12 = this.onUndeliveredElement;
            return BufferedChannelKt.tryResume0(cancellableContinuation, e, (Function3) (function12 != null ? bindCancellationFun(function12) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    static /* synthetic */ <E> Object receive$suspendImpl(BufferedChannel<E> bufferedChannel, Continuation<? super E> continuation) throws Throwable {
        ChannelSegment<E> channelSegment;
        ChannelSegment<E> channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / i;
            int i2 = (int) (andIncrement % i);
            if (channelSegment2.id != j) {
                ChannelSegment<E> channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            Object objUpdateCellReceive = bufferedChannel2.updateCellReceive(channelSegment, i2, andIncrement, null);
            if (objUpdateCellReceive != BufferedChannelKt.SUSPEND) {
                if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                    if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                        return bufferedChannel2.receiveOnNoWaiterSuspend(channelSegment, i2, andIncrement, continuation);
                    }
                    channelSegment.cleanPrev();
                    return objUpdateCellReceive;
                }
                if (andIncrement < bufferedChannel2.getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                bufferedChannel = bufferedChannel2;
                channelSegment2 = channelSegment;
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        throw StackTraceRecovery.recoverStackTrace(bufferedChannel.getReceiveException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareReceiverForSuspension(Waiter waiter, ChannelSegment<E> channelSegment, int i) {
        onReceiveEnqueued();
        waiter.invokeOnCancellation(channelSegment, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveOnNoWaiterSuspend(CancellableContinuation<? super E> cont) {
        Result.Companion companion = Result.INSTANCE;
        cont.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(getReceiveException())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r14v12, types: [kotlinx.coroutines.channels.ChannelResult$Companion] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.BufferedChannel] */
    /* renamed from: receiveCatching-JP2dKIU$suspendImpl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <E> Object m28796receiveCatchingJP2dKIU$suspendImpl(BufferedChannel<E> bufferedChannel, Continuation<? super Channel5<? extends E>> continuation) throws Throwable {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        ChannelSegment channelSegment;
        if (continuation instanceof BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (BufferedChannel$receiveCatching$1) continuation;
            int i = bufferedChannel$receiveCatching$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.label = i - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, continuation);
            }
        }
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$12 = bufferedChannel$receiveCatching$1;
        Object obj = bufferedChannel$receiveCatching$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = bufferedChannel$receiveCatching$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Channel5) obj).getHolder();
        }
        ResultKt.throwOnFailure(obj);
        ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            int i3 = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / i3;
            int i4 = (int) (andIncrement % i3);
            if (channelSegment2.id != j) {
                ChannelSegment channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            ?? r7 = bufferedChannel;
            Object objUpdateCellReceive = r7.updateCellReceive(channelSegment, i4, andIncrement, null);
            if (objUpdateCellReceive != BufferedChannelKt.SUSPEND) {
                if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                    if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                        bufferedChannel$receiveCatching$12.label = 1;
                        Object objM28797receiveCatchingOnNoWaiterSuspendGKJJFZk = r7.m28797receiveCatchingOnNoWaiterSuspendGKJJFZk(channelSegment, i4, andIncrement, bufferedChannel$receiveCatching$12);
                        return objM28797receiveCatchingOnNoWaiterSuspendGKJJFZk == coroutine_suspended ? coroutine_suspended : objM28797receiveCatchingOnNoWaiterSuspendGKJJFZk;
                    }
                    channelSegment.cleanPrev();
                    return Channel5.INSTANCE.m28815successJP2dKIU(objUpdateCellReceive);
                }
                if (andIncrement < r7.getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                bufferedChannel = r7;
                channelSegment2 = channelSegment;
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        return Channel5.INSTANCE.m28813closedJP2dKIU(bufferedChannel.getCloseCause());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: receiveCatchingOnNoWaiterSuspend-GKJJFZk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m28797receiveCatchingOnNoWaiterSuspendGKJJFZk(ChannelSegment<E> channelSegment, int i, long j, Continuation<? super Channel5<? extends E>> continuation) throws Throwable {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        ReceiveCatching receiveCatching;
        Channel5 channel5M28802boximpl;
        Function3 function3;
        ChannelSegment channelSegment2;
        if (continuation instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) continuation;
            int i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = i2 - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuation);
            }
        }
        Object result = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(result);
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$0 = this;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$1 = channelSegment;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$0 = i;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.J$0 = j;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = 1;
            CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuation2.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1));
            try {
                Intrinsics.checkNotNull(orCreateCancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel>>");
                receiveCatching = new ReceiveCatching(orCreateCancellableContinuation);
            } catch (Throwable th) {
                th = th;
            }
            try {
                Object objUpdateCellReceive = updateCellReceive(channelSegment, i, j, receiveCatching);
                if (objUpdateCellReceive != BufferedChannelKt.SUSPEND) {
                    if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                        if (j < getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        ChannelSegment channelSegment3 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
                        while (true) {
                            if (isClosedForReceive()) {
                                onClosedReceiveCatchingOnNoWaiterSuspend(orCreateCancellableContinuation);
                                break;
                            }
                            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
                            int i4 = BufferedChannelKt.SEGMENT_SIZE;
                            long j2 = andIncrement / i4;
                            int i5 = (int) (andIncrement % i4);
                            if (channelSegment3.id != j2) {
                                ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j2, channelSegment3);
                                if (channelSegmentFindSegmentReceive != null) {
                                    channelSegment2 = channelSegmentFindSegmentReceive;
                                }
                            } else {
                                channelSegment2 = channelSegment3;
                            }
                            Object objUpdateCellReceive2 = updateCellReceive(channelSegment2, i5, andIncrement, receiveCatching);
                            ChannelSegment channelSegment4 = channelSegment2;
                            if (objUpdateCellReceive2 != BufferedChannelKt.SUSPEND) {
                                if (objUpdateCellReceive2 == BufferedChannelKt.FAILED) {
                                    if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                        channelSegment4.cleanPrev();
                                    }
                                    channelSegment3 = channelSegment4;
                                } else {
                                    if (objUpdateCellReceive2 == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    channelSegment4.cleanPrev();
                                    channel5M28802boximpl = Channel5.m28802boximpl(Channel5.INSTANCE.m28815successJP2dKIU(objUpdateCellReceive2));
                                    Function1<E, Unit> function1 = this.onUndeliveredElement;
                                    function3 = (Function3) (function1 != null ? bindCancellationFunResult(function1) : null);
                                }
                            } else {
                                prepareReceiverForSuspension(receiveCatching, channelSegment4, i5);
                                break;
                            }
                        }
                    } else {
                        channelSegment.cleanPrev();
                        channel5M28802boximpl = Channel5.m28802boximpl(Channel5.INSTANCE.m28815successJP2dKIU(objUpdateCellReceive));
                        Function1<E, Unit> function12 = this.onUndeliveredElement;
                        function3 = (Function3) (function12 != null ? bindCancellationFunResult(function12) : null);
                    }
                    orCreateCancellableContinuation.resume((CancellableContinuationImpl) channel5M28802boximpl, (Function3<? super Throwable, ? super CancellableContinuationImpl, ? super CoroutineContext, Unit>) function3);
                } else {
                    prepareReceiverForSuspension(receiveCatching, channelSegment, i);
                }
                result = orCreateCancellableContinuation.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbes.probeCoroutineSuspended(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                throw th3;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(result);
        }
        return ((Channel5) result).getHolder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveCatchingOnNoWaiterSuspend(CancellableContinuation<? super Channel5<? extends E>> cont) {
        Result.Companion companion = Result.INSTANCE;
        cont.resumeWith(Result.m28550constructorimpl(Channel5.m28802boximpl(Channel5.INSTANCE.m28813closedJP2dKIU(getCloseCause()))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.Channel8
    /* renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public Object mo28799tryReceivePtdJZtk() {
        ChannelSegment channelSegmentFindSegmentReceive;
        long j = receivers$volatile$FU.get(this);
        long j2 = sendersAndCloseStatus$volatile$FU.get(this);
        if (isClosedForReceive0(j2)) {
            return Channel5.INSTANCE.m28813closedJP2dKIU(getCloseCause());
        }
        if (j < (j2 & 1152921504606846975L)) {
            Object obj = BufferedChannelKt.INTERRUPTED_RCV;
            ChannelSegment channelSegment = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
            while (!isClosedForReceive()) {
                long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
                int i = BufferedChannelKt.SEGMENT_SIZE;
                long j3 = andIncrement / i;
                int i2 = (int) (andIncrement % i);
                if (channelSegment.id != j3) {
                    channelSegmentFindSegmentReceive = findSegmentReceive(j3, channelSegment);
                    if (channelSegmentFindSegmentReceive == null) {
                        continue;
                    }
                } else {
                    channelSegmentFindSegmentReceive = channelSegment;
                }
                Object objUpdateCellReceive = updateCellReceive(channelSegmentFindSegmentReceive, i2, andIncrement, obj);
                if (objUpdateCellReceive != BufferedChannelKt.SUSPEND) {
                    if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                        if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                            throw new IllegalStateException("unexpected");
                        }
                        channelSegmentFindSegmentReceive.cleanPrev();
                        return Channel5.INSTANCE.m28815successJP2dKIU(objUpdateCellReceive);
                    }
                    if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegmentFindSegmentReceive.cleanPrev();
                    }
                    channelSegment = channelSegmentFindSegmentReceive;
                } else {
                    Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                    if (waiter != null) {
                        prepareReceiverForSuspension(waiter, channelSegmentFindSegmentReceive, i2);
                    }
                    waitExpandBufferCompletion$kotlinx_coroutines_core(andIncrement);
                    channelSegmentFindSegmentReceive.onSlotCleaned();
                    return Channel5.INSTANCE.m28814failurePtdJZtk();
                }
            }
            return Channel5.INSTANCE.m28813closedJP2dKIU(getCloseCause());
        }
        return Channel5.INSTANCE.m28814failurePtdJZtk();
    }

    protected final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long globalCellIndex) {
        ChannelSegment<E> channelSegmentFindSegmentReceive;
        OnUndeliveredElement2 onUndeliveredElement2CallUndeliveredElementCatchingException$default;
        ChannelSegment<E> channelSegment = (ChannelSegment) receiveSegment$volatile$FU.get(this);
        while (true) {
            long j = receivers$volatile$FU.get(this);
            if (globalCellIndex < Math.max(this.capacity + j, getBufferEndCounter())) {
                return;
            }
            if (receivers$volatile$FU.compareAndSet(this, j, 1 + j)) {
                int i = BufferedChannelKt.SEGMENT_SIZE;
                long j2 = j / i;
                int i2 = (int) (j % i);
                if (channelSegment.id != j2) {
                    channelSegmentFindSegmentReceive = findSegmentReceive(j2, channelSegment);
                    if (channelSegmentFindSegmentReceive == null) {
                        continue;
                    }
                } else {
                    channelSegmentFindSegmentReceive = channelSegment;
                }
                Object objUpdateCellReceive = updateCellReceive(channelSegmentFindSegmentReceive, i2, j, null);
                if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                    channelSegmentFindSegmentReceive.cleanPrev();
                    Function1<E, Unit> function1 = this.onUndeliveredElement;
                    if (function1 != null && (onUndeliveredElement2CallUndeliveredElementCatchingException$default = OnUndeliveredElement.callUndeliveredElementCatchingException$default(function1, objUpdateCellReceive, null, 2, null)) != null) {
                        throw onUndeliveredElement2CallUndeliveredElementCatchingException$default;
                    }
                } else if (j < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegmentFindSegmentReceive.cleanPrev();
                }
                channelSegment = channelSegmentFindSegmentReceive;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForReceive(SelectInstance<?> select, Object ignoredParam) {
        ChannelSegment channelSegment;
        ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / i;
            int i2 = (int) (andIncrement % i);
            if (channelSegment2.id != j) {
                ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            SelectInstance<?> selectInstance = select;
            Object objUpdateCellReceive = updateCellReceive(channelSegment, i2, andIncrement, selectInstance);
            channelSegment2 = channelSegment;
            if (objUpdateCellReceive != BufferedChannelKt.SUSPEND) {
                if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                    if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                        throw new IllegalStateException("unexpected");
                    }
                    channelSegment2.cleanPrev();
                    selectInstance.selectInRegistrationPhase(objUpdateCellReceive);
                    return;
                }
                if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment2.cleanPrev();
                }
                select = selectInstance;
            } else {
                Waiter waiter = selectInstance instanceof Waiter ? (Waiter) selectInstance : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment2, i2);
                    return;
                }
                return;
            }
        }
        onClosedSelectOnReceive(select);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateCellReceive(ChannelSegment<E> segment, int index, long r, Object waiter) {
        Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
        if (state$kotlinx_coroutines_core == null) {
            if (r >= (sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L)) {
                if (waiter == null) {
                    return BufferedChannelKt.SUSPEND_NO_WAITER;
                }
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, waiter)) {
                    expandBuffer();
                    return BufferedChannelKt.SUSPEND;
                }
            }
        } else if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED && segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
            expandBuffer();
            return segment.retrieveElement$kotlinx_coroutines_core(index);
        }
        return updateCellReceiveSlow(segment, index, r, waiter);
    }

    private final Object updateCellReceiveSlow(ChannelSegment<E> segment, int index, long r, Object waiter) {
        while (true) {
            Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core == null || state$kotlinx_coroutines_core == BufferedChannelKt.IN_BUFFER) {
                if (r < (sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L)) {
                    if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.POISONED)) {
                        expandBuffer();
                        return BufferedChannelKt.FAILED;
                    }
                } else {
                    if (waiter == null) {
                        return BufferedChannelKt.SUSPEND_NO_WAITER;
                    }
                    if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, waiter)) {
                        expandBuffer();
                        return BufferedChannelKt.SUSPEND;
                    }
                }
            } else if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
                    expandBuffer();
                    return segment.retrieveElement$kotlinx_coroutines_core(index);
                }
            } else {
                if (state$kotlinx_coroutines_core != BufferedChannelKt.INTERRUPTED_SEND && state$kotlinx_coroutines_core != BufferedChannelKt.POISONED) {
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.getCHANNEL_CLOSED()) {
                        if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_EB && segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_RCV)) {
                            boolean z = state$kotlinx_coroutines_core instanceof WaiterEB;
                            if (z) {
                                state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                            }
                            if (tryResumeSender(state$kotlinx_coroutines_core, segment, index)) {
                                segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.DONE_RCV);
                                expandBuffer();
                                return segment.retrieveElement$kotlinx_coroutines_core(index);
                            }
                            segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.INTERRUPTED_SEND);
                            segment.onCancelledRequest(index, false);
                            if (z) {
                                expandBuffer();
                            }
                            return BufferedChannelKt.FAILED;
                        }
                    } else {
                        expandBuffer();
                        return BufferedChannelKt.FAILED;
                    }
                }
                return BufferedChannelKt.FAILED;
            }
        }
    }

    private final boolean tryResumeSender(Object obj, ChannelSegment<E> channelSegment, int i) {
        if (obj instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.tryResume0$default((CancellableContinuation) obj, Unit.INSTANCE, null, 2, null);
        }
        if (obj instanceof SelectInstance) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            TrySelectDetailedResult trySelectDetailedResultTrySelectDetailed = ((SelectImplementation) obj).trySelectDetailed(this, Unit.INSTANCE);
            if (trySelectDetailedResultTrySelectDetailed == TrySelectDetailedResult.REREGISTER) {
                channelSegment.cleanElement$kotlinx_coroutines_core(i);
            }
            return trySelectDetailedResultTrySelectDetailed == TrySelectDetailedResult.SUCCESSFUL;
        }
        if (obj instanceof SendBroadcast) {
            return BufferedChannelKt.tryResume0$default(((SendBroadcast) obj).getCont(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final void expandBuffer() {
        if (isRendezvousOrUnlimited()) {
            return;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) bufferEndSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = bufferEnd$volatile$FU.getAndIncrement(this);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / i;
            if (getSendersCounter$kotlinx_coroutines_core() <= andIncrement) {
                if (channelSegment.id < j && channelSegment.getNext() != 0) {
                    moveSegmentBufferEndToSpecifiedOrLast(j, channelSegment);
                }
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            if (channelSegment.id != j) {
                ChannelSegment<E> channelSegmentFindSegmentBufferEnd = findSegmentBufferEnd(j, channelSegment, andIncrement);
                if (channelSegmentFindSegmentBufferEnd == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentBufferEnd;
                }
            }
            if (updateCellExpandBuffer(channelSegment, (int) (andIncrement % i), andIncrement)) {
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        }
    }

    private final boolean updateCellExpandBuffer(ChannelSegment<E> segment, int index, long b) {
        Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
        if ((state$kotlinx_coroutines_core instanceof Waiter) && b >= receivers$volatile$FU.get(this) && segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
            if (!tryResumeSender(state$kotlinx_coroutines_core, segment, index)) {
                segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.INTERRUPTED_SEND);
                segment.onCancelledRequest(index, false);
                return false;
            }
            segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.BUFFERED);
            return true;
        }
        return updateCellExpandBufferSlow(segment, index, b);
    }

    private final boolean updateCellExpandBufferSlow(ChannelSegment<E> segment, int index, long b) {
        while (true) {
            Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core instanceof Waiter) {
                if (b >= receivers$volatile$FU.get(this)) {
                    if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
                        if (!tryResumeSender(state$kotlinx_coroutines_core, segment, index)) {
                            segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.INTERRUPTED_SEND);
                            segment.onCancelledRequest(index, false);
                            return false;
                        }
                        segment.setState$kotlinx_coroutines_core(index, BufferedChannelKt.BUFFERED);
                        return true;
                    }
                } else if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, new WaiterEB((Waiter) state$kotlinx_coroutines_core))) {
                    return true;
                }
            } else {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_SEND) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == null) {
                    if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.IN_BUFFER)) {
                        return true;
                    }
                } else {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED || state$kotlinx_coroutines_core == BufferedChannelKt.POISONED || state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        return true;
                    }
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV) {
                        throw new IllegalStateException(("Unexpected cell state: " + state$kotlinx_coroutines_core).toString());
                    }
                }
            }
        }
    }

    static /* synthetic */ void incCompletedExpandBufferAttempts$default(BufferedChannel bufferedChannel, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i & 1) != 0) {
            j = 1;
        }
        bufferedChannel.incCompletedExpandBufferAttempts(j);
    }

    private final void incCompletedExpandBufferAttempts(long nAttempts) {
        if ((completedExpandBuffersAndPauseFlag$volatile$FU.addAndGet(this, nAttempts) & 4611686018427387904L) != 0) {
            while ((completedExpandBuffersAndPauseFlag$volatile$FU.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long globalIndex) {
        BufferedChannel<E> bufferedChannel = this;
        if (bufferedChannel.isRendezvousOrUnlimited()) {
            return;
        }
        while (bufferedChannel.getBufferEndCounter() <= globalIndex) {
            bufferedChannel = this;
        }
        int i = BufferedChannelKt.EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS;
        for (int i2 = 0; i2 < i; i2++) {
            long bufferEndCounter = bufferedChannel.getBufferEndCounter();
            if (bufferEndCounter == (4611686018427387903L & completedExpandBuffersAndPauseFlag$volatile$FU.get(bufferedChannel)) && bufferEndCounter == bufferedChannel.getBufferEndCounter()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = completedExpandBuffersAndPauseFlag$volatile$FU;
        while (true) {
            long j = atomicLongFieldUpdater.get(bufferedChannel);
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j, BufferedChannelKt.constructEBCompletedAndPauseFlag(j & 4611686018427387903L, true))) {
                break;
            } else {
                bufferedChannel = this;
            }
        }
        while (true) {
            long bufferEndCounter2 = bufferedChannel.getBufferEndCounter();
            long j2 = completedExpandBuffersAndPauseFlag$volatile$FU.get(bufferedChannel);
            long j3 = j2 & 4611686018427387903L;
            boolean z = (4611686018427387904L & j2) != 0;
            if (bufferEndCounter2 == j3 && bufferEndCounter2 == bufferedChannel.getBufferEndCounter()) {
                break;
            }
            if (z) {
                bufferedChannel = this;
            } else {
                bufferedChannel = this;
                completedExpandBuffersAndPauseFlag$volatile$FU.compareAndSet(bufferedChannel, j2, BufferedChannelKt.constructEBCompletedAndPauseFlag(j3, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = completedExpandBuffersAndPauseFlag$volatile$FU;
        while (true) {
            long j4 = atomicLongFieldUpdater2.get(bufferedChannel);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j4, BufferedChannelKt.constructEBCompletedAndPauseFlag(j4 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            bufferedChannel = this;
        }
    }

    @Override // kotlinx.coroutines.channels.Channel8
    public SelectClause1<E> getOnReceive() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceive$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$1, 3);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceive$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause1Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.Channel8
    public SelectClause1<Channel5<E>> getOnReceiveCatching() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$1, 3);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new SelectClause1Impl(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    private final void onClosedSelectOnReceive(SelectInstance<?> select) {
        select.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceive(Object ignoredParam, Object selectResult) throws Throwable {
        if (selectResult != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return selectResult;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveCatching(Object ignoredParam, Object selectResult) {
        return Channel5.m28802boximpl(selectResult == BufferedChannelKt.getCHANNEL_CLOSED() ? Channel5.INSTANCE.m28813closedJP2dKIU(getCloseCause()) : Channel5.INSTANCE.m28815successJP2dKIU(selectResult));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56 */
    public static final Function3 m3729xa189d599(final BufferedChannel bufferedChannel, final SelectInstance selectInstance, Object obj, final Object obj2) {
        return new Function3() { // from class: kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return BufferedChannel.m3730xc6272352(obj2, bufferedChannel, selectInstance, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55 */
    public static final Unit m3730xc6272352(Object obj, BufferedChannel bufferedChannel, SelectInstance selectInstance, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        if (obj != BufferedChannelKt.getCHANNEL_CLOSED()) {
            OnUndeliveredElement.callUndeliveredElement(bufferedChannel.onUndeliveredElement, obj, selectInstance.getContext());
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.channels.Channel8
    public Channel3<E> iterator() {
        return new BufferedChannelIterator();
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\n\u001a\u00020\tH\u0096B¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\tH\u0002J,\u0010\r\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00162\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\u000e\u0010\u0019\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator;", "Lkotlinx/coroutines/channels/ChannelIterator;", "Lkotlinx/coroutines/Waiter;", "<init>", "(Lkotlinx/coroutines/channels/BufferedChannel;)V", "receiveResult", "", "continuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "", "hasNext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClosedHasNext", "hasNextOnNoWaiterSuspend", "segment", "Lkotlinx/coroutines/channels/ChannelSegment;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", Constants.REVENUE_AMOUNT_KEY, "", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeOnCancellation", "", "Lkotlinx/coroutines/internal/Segment;", "onClosedHasNextNoWaiterSuspend", "next", "()Ljava/lang/Object;", "tryResumeHasNext", "element", "(Ljava/lang/Object;)Z", "tryResumeHasNextOnClosedChannel", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    private final class BufferedChannelIterator implements Channel3<E>, Waiter {
        private CancellableContinuationImpl<? super Boolean> continuation;
        private Object receiveResult = BufferedChannelKt.NO_RECEIVE_RESULT;

        public BufferedChannelIterator() {
        }

        @Override // kotlinx.coroutines.channels.Channel3
        public Object hasNext(Continuation<? super Boolean> continuation) throws Throwable {
            ChannelSegment<E> channelSegmentFindSegmentReceive;
            boolean zOnClosedHasNext = true;
            if (this.receiveResult == BufferedChannelKt.NO_RECEIVE_RESULT || this.receiveResult == BufferedChannelKt.getCHANNEL_CLOSED()) {
                BufferedChannel<E> bufferedChannel = BufferedChannel.this;
                ChannelSegment<E> channelSegment = (ChannelSegment) BufferedChannel.getReceiveSegment$volatile$FU().get(bufferedChannel);
                while (!bufferedChannel.isClosedForReceive()) {
                    long andIncrement = BufferedChannel.getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
                    int i = BufferedChannelKt.SEGMENT_SIZE;
                    long j = andIncrement / i;
                    int i2 = (int) (andIncrement % i);
                    if (channelSegment.id != j) {
                        channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment);
                        if (channelSegmentFindSegmentReceive == null) {
                            continue;
                        }
                    } else {
                        channelSegmentFindSegmentReceive = channelSegment;
                    }
                    Object objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegmentFindSegmentReceive, i2, andIncrement, null);
                    if (objUpdateCellReceive != BufferedChannelKt.SUSPEND) {
                        if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                            if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegmentFindSegmentReceive.cleanPrev();
                            }
                            channelSegment = channelSegmentFindSegmentReceive;
                        } else if (objUpdateCellReceive != BufferedChannelKt.SUSPEND_NO_WAITER) {
                            channelSegmentFindSegmentReceive.cleanPrev();
                            this.receiveResult = objUpdateCellReceive;
                        } else {
                            return hasNextOnNoWaiterSuspend(channelSegmentFindSegmentReceive, i2, andIncrement, continuation);
                        }
                    } else {
                        throw new IllegalStateException("unreachable");
                    }
                }
                zOnClosedHasNext = onClosedHasNext();
            }
            return boxing.boxBoolean(zOnClosedHasNext);
        }

        private final boolean onClosedHasNext() throws Throwable {
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                return false;
            }
            throw StackTraceRecovery.recoverStackTrace(closeCause);
        }

        private final Object hasNextOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i, long j, Continuation<? super Boolean> continuation) throws Throwable {
            Boolean boolBoxBoolean;
            ChannelSegment channelSegmentFindSegmentReceive;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuation2.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
            try {
                this.continuation = orCreateCancellableContinuation;
                try {
                    Object objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i, j, this);
                    if (objUpdateCellReceive != BufferedChannelKt.SUSPEND) {
                        Function3 function3BindCancellationFun = null;
                        if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                            if (j < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment.cleanPrev();
                            }
                            ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.getReceiveSegment$volatile$FU().get(bufferedChannel);
                            while (true) {
                                if (!bufferedChannel.isClosedForReceive()) {
                                    long andIncrement = BufferedChannel.getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
                                    int i2 = BufferedChannelKt.SEGMENT_SIZE;
                                    long j2 = andIncrement / i2;
                                    int i3 = (int) (andIncrement % i2);
                                    if (channelSegment2.id != j2) {
                                        channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j2, channelSegment2);
                                        if (channelSegmentFindSegmentReceive == null) {
                                        }
                                    } else {
                                        channelSegmentFindSegmentReceive = channelSegment2;
                                    }
                                    Object objUpdateCellReceive2 = bufferedChannel.updateCellReceive(channelSegmentFindSegmentReceive, i3, andIncrement, this);
                                    if (objUpdateCellReceive2 != BufferedChannelKt.SUSPEND) {
                                        if (objUpdateCellReceive2 == BufferedChannelKt.FAILED) {
                                            if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                                channelSegmentFindSegmentReceive.cleanPrev();
                                            }
                                            channelSegment2 = channelSegmentFindSegmentReceive;
                                        } else {
                                            if (objUpdateCellReceive2 == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            channelSegmentFindSegmentReceive.cleanPrev();
                                            this.receiveResult = objUpdateCellReceive2;
                                            this.continuation = null;
                                            boolBoxBoolean = boxing.boxBoolean(true);
                                            Function1<E, Unit> function1 = bufferedChannel.onUndeliveredElement;
                                            if (function1 != null) {
                                                function3BindCancellationFun = bufferedChannel.bindCancellationFun(function1, objUpdateCellReceive2);
                                            }
                                        }
                                    } else {
                                        bufferedChannel.prepareReceiverForSuspension(this, channelSegmentFindSegmentReceive, i3);
                                        break;
                                    }
                                } else {
                                    onClosedHasNextNoWaiterSuspend();
                                    break;
                                }
                            }
                        } else {
                            channelSegment.cleanPrev();
                            this.receiveResult = objUpdateCellReceive;
                            this.continuation = null;
                            boolBoxBoolean = boxing.boxBoolean(true);
                            Function1<E, Unit> function12 = bufferedChannel.onUndeliveredElement;
                            if (function12 != null) {
                                function3BindCancellationFun = bufferedChannel.bindCancellationFun(function12, objUpdateCellReceive);
                            }
                        }
                        orCreateCancellableContinuation.resume((CancellableContinuationImpl) boolBoxBoolean, (Function3<? super Throwable, ? super CancellableContinuationImpl, ? super CoroutineContext, Unit>) function3BindCancellationFun);
                    } else {
                        bufferedChannel.prepareReceiverForSuspension(this, channelSegment, i);
                    }
                    Object result = orCreateCancellableContinuation.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbes.probeCoroutineSuspended(continuation);
                    }
                    return result;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(ConcurrentLinkedList3<?> segment, int index) {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.invokeOnCancellation(segment, index);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onClosedHasNextNoWaiterSuspend() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(closeCause)));
            }
        }

        @Override // kotlinx.coroutines.channels.Channel3
        public E next() throws Throwable {
            E e = (E) this.receiveResult;
            if (e != BufferedChannelKt.NO_RECEIVE_RESULT) {
                this.receiveResult = BufferedChannelKt.NO_RECEIVE_RESULT;
                if (e != BufferedChannelKt.getCHANNEL_CLOSED()) {
                    return e;
                }
                throw StackTraceRecovery.recoverStackTrace(BufferedChannel.this.getReceiveException());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }

        public final boolean tryResumeHasNext(E element) {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = element;
            Boolean bool = Boolean.TRUE;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            Function1<E, Unit> function1 = bufferedChannel.onUndeliveredElement;
            return BufferedChannelKt.tryResume0(cancellableContinuationImpl, bool, function1 != null ? bufferedChannel.bindCancellationFun(function1, element) : null);
        }

        public final void tryResumeHasNextOnClosedChannel() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(closeCause)));
            }
        }
    }

    protected final Throwable getCloseCause() {
        return (Throwable) _closeCause$volatile$FU.get(this);
    }

    protected final Throwable getSendException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new Channel7("Channel was closed") : closeCause;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable getReceiveException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new Channel6("Channel was closed") : closeCause;
    }

    @Override // kotlinx.coroutines.channels.Channel9
    public boolean close(Throwable cause) {
        return closeOrCancelImpl(cause, false);
    }

    @Override // kotlinx.coroutines.channels.Channel8
    public final void cancel(CancellationException cause) {
        cancelImpl$kotlinx_coroutines_core(cause);
    }

    public boolean cancelImpl$kotlinx_coroutines_core(Throwable cause) {
        if (cause == null) {
            cause = new CancellationException("Channel was cancelled");
        }
        return closeOrCancelImpl(cause, true);
    }

    protected boolean closeOrCancelImpl(Throwable cause, boolean cancel) {
        if (cancel) {
            markCancellationStarted();
        }
        boolean zM363m = C2031xc40028dd.m363m(_closeCause$volatile$FU, this, BufferedChannelKt.NO_CLOSE_CAUSE, cause);
        if (cancel) {
            markCancelled();
        } else {
            markClosed();
        }
        completeCloseOrCancel();
        onClosedIdempotent();
        if (zM363m) {
            invokeCloseHandler();
        }
        return zM363m;
    }

    private final void invokeCloseHandler() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$volatile$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!C2031xc40028dd.m363m(atomicReferenceFieldUpdater, this, obj, obj == null ? BufferedChannelKt.CLOSE_HANDLER_CLOSED : BufferedChannelKt.CLOSE_HANDLER_INVOKED));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(getCloseCause());
    }

    @Override // kotlinx.coroutines.channels.Channel9
    /* renamed from: invokeOnClose */
    public void mo28845invokeOnClose(Function1<? super Throwable, Unit> handler) {
        if (C2031xc40028dd.m363m(closeHandler$volatile$FU, this, null, handler)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$volatile$FU;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != BufferedChannelKt.CLOSE_HANDLER_CLOSED) {
                if (obj == BufferedChannelKt.CLOSE_HANDLER_INVOKED) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!C2031xc40028dd.m363m(closeHandler$volatile$FU, this, BufferedChannelKt.CLOSE_HANDLER_CLOSED, BufferedChannelKt.CLOSE_HANDLER_INVOKED));
        handler.invoke(getCloseCause());
    }

    private final void markClosed() {
        long j;
        long jConstructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (j >> 60);
            if (i == 0) {
                jConstructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 2);
            } else if (i != 1) {
                return;
            } else {
                jConstructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, jConstructSendersAndCloseStatus));
    }

    private final void markCancelled() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 3)));
    }

    private final void markCancellationStarted() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 1)));
    }

    private final void completeCloseOrCancel() {
        isClosedForSend();
    }

    private final ChannelSegment<E> completeClose(long sendersCur) {
        ChannelSegment<E> channelSegmentCloseLinkedList = closeLinkedList();
        if (isConflatedDropOldest()) {
            long jMarkAllEmptyCellsAsClosed = markAllEmptyCellsAsClosed(channelSegmentCloseLinkedList);
            if (jMarkAllEmptyCellsAsClosed != -1) {
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(jMarkAllEmptyCellsAsClosed);
            }
        }
        cancelSuspendedReceiveRequests(channelSegmentCloseLinkedList, sendersCur);
        return channelSegmentCloseLinkedList;
    }

    private final void completeCancel(long sendersCur) {
        removeUnprocessedElements(completeClose(sendersCur));
    }

    private final ChannelSegment<E> closeLinkedList() {
        Object obj = bufferEndSegment$volatile$FU.get(this);
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        if (channelSegment.id > ((ChannelSegment) obj).id) {
            obj = channelSegment;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$volatile$FU.get(this);
        if (channelSegment2.id > ((ChannelSegment) obj).id) {
            obj = channelSegment2;
        }
        return (ChannelSegment) ConcurrentLinkedList.close((ConcurrentLinkedList2) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (kotlinx.coroutines.channels.ChannelSegment) r8.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long markAllEmptyCellsAsClosed(ChannelSegment<E> lastSegment) {
        do {
            int i = BufferedChannelKt.SEGMENT_SIZE;
            while (true) {
                i--;
                if (-1 >= i) {
                    break;
                }
                long j = (lastSegment.id * BufferedChannelKt.SEGMENT_SIZE) + i;
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    return -1L;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core = lastSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core == null || state$kotlinx_coroutines_core == BufferedChannelKt.IN_BUFFER) {
                        if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            lastSegment.onSlotCleaned();
                            break;
                        }
                    } else if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                        return j;
                    }
                }
            }
        } while (lastSegment != null);
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (kotlinx.coroutines.channels.ChannelSegment) r12.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void removeUnprocessedElements(ChannelSegment<E> lastSegment) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        OnUndeliveredElement2 onUndeliveredElement2CallUndeliveredElementCatchingException = null;
        Object objM28834constructorimpl$default = InlineList.m28834constructorimpl$default(null, 1, null);
        loop0: do {
            int i = BufferedChannelKt.SEGMENT_SIZE - 1;
            while (true) {
                if (-1 >= i) {
                    break;
                }
                long j = (lastSegment.id * BufferedChannelKt.SEGMENT_SIZE) + i;
                while (true) {
                    Object state$kotlinx_coroutines_core = lastSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV) {
                        break loop0;
                    }
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                        if (state$kotlinx_coroutines_core == BufferedChannelKt.IN_BUFFER || state$kotlinx_coroutines_core == null) {
                            if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                lastSegment.onSlotCleaned();
                                break;
                            }
                        } else if (!(state$kotlinx_coroutines_core instanceof Waiter) && !(state$kotlinx_coroutines_core instanceof WaiterEB)) {
                            if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_EB && state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV) {
                                if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_EB) {
                                    break;
                                }
                            } else {
                                break loop0;
                            }
                        } else {
                            if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                                break loop0;
                            }
                            Waiter waiter = state$kotlinx_coroutines_core instanceof WaiterEB ? ((WaiterEB) state$kotlinx_coroutines_core).waiter : (Waiter) state$kotlinx_coroutines_core;
                            if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                if (function1 != null) {
                                    onUndeliveredElement2CallUndeliveredElementCatchingException = OnUndeliveredElement.callUndeliveredElementCatchingException(function1, lastSegment.getElement$kotlinx_coroutines_core(i), onUndeliveredElement2CallUndeliveredElementCatchingException);
                                }
                                objM28834constructorimpl$default = InlineList.m28835plusFjFbRPM(objM28834constructorimpl$default, waiter);
                                lastSegment.cleanElement$kotlinx_coroutines_core(i);
                                lastSegment.onSlotCleaned();
                            }
                        }
                    } else {
                        if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                            break loop0;
                        }
                        if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            if (function1 != null) {
                                onUndeliveredElement2CallUndeliveredElementCatchingException = OnUndeliveredElement.callUndeliveredElementCatchingException(function1, lastSegment.getElement$kotlinx_coroutines_core(i), onUndeliveredElement2CallUndeliveredElementCatchingException);
                            }
                            lastSegment.cleanElement$kotlinx_coroutines_core(i);
                            lastSegment.onSlotCleaned();
                        }
                    }
                }
                i--;
            }
        } while (lastSegment != null);
        if (objM28834constructorimpl$default != null) {
            if (objM28834constructorimpl$default instanceof ArrayList) {
                Intrinsics.checkNotNull(objM28834constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) objM28834constructorimpl$default;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    resumeSenderOnCancelledChannel((Waiter) arrayList.get(size));
                }
            } else {
                resumeSenderOnCancelledChannel((Waiter) objM28834constructorimpl$default);
            }
        }
        if (onUndeliveredElement2CallUndeliveredElementCatchingException != null) {
            throw onUndeliveredElement2CallUndeliveredElementCatchingException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void cancelSuspendedReceiveRequests(ChannelSegment<E> lastSegment, long sendersCounter) {
        Object objM28834constructorimpl$default = InlineList.m28834constructorimpl$default(null, 1, null);
        loop0: while (lastSegment != null) {
            for (int i = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i; i--) {
                if ((lastSegment.id * BufferedChannelKt.SEGMENT_SIZE) + i < sendersCounter) {
                    break loop0;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core = lastSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core == null || state$kotlinx_coroutines_core == BufferedChannelKt.IN_BUFFER) {
                        if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            lastSegment.onSlotCleaned();
                            break;
                        }
                    } else if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                        if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            objM28834constructorimpl$default = InlineList.m28835plusFjFbRPM(objM28834constructorimpl$default, ((WaiterEB) state$kotlinx_coroutines_core).waiter);
                            lastSegment.onCancelledRequest(i, true);
                            break;
                        }
                    } else {
                        if (!(state$kotlinx_coroutines_core instanceof Waiter)) {
                            break;
                        }
                        if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            objM28834constructorimpl$default = InlineList.m28835plusFjFbRPM(objM28834constructorimpl$default, state$kotlinx_coroutines_core);
                            lastSegment.onCancelledRequest(i, true);
                            break;
                        }
                    }
                }
            }
            lastSegment = (ChannelSegment) lastSegment.getPrev();
        }
        if (objM28834constructorimpl$default != null) {
            if (objM28834constructorimpl$default instanceof ArrayList) {
                Intrinsics.checkNotNull(objM28834constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) objM28834constructorimpl$default;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    resumeReceiverOnClosedChannel((Waiter) arrayList.get(size));
                }
                return;
            }
            resumeReceiverOnClosedChannel((Waiter) objM28834constructorimpl$default);
        }
    }

    private final void resumeReceiverOnClosedChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, true);
    }

    private final void resumeSenderOnCancelledChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, false);
    }

    private final void resumeWaiterOnClosedChannel(Waiter waiter, boolean z) {
        if (waiter instanceof SendBroadcast) {
            CancellableContinuation<Boolean> cont = ((SendBroadcast) waiter).getCont();
            Result.Companion companion = Result.INSTANCE;
            cont.resumeWith(Result.m28550constructorimpl(Boolean.FALSE));
            return;
        }
        if (waiter instanceof CancellableContinuation) {
            Continuation continuation = (Continuation) waiter;
            Result.Companion companion2 = Result.INSTANCE;
            continuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(z ? getReceiveException() : getSendException())));
        } else if (waiter instanceof ReceiveCatching) {
            CancellableContinuationImpl<Channel5<? extends E>> cancellableContinuationImpl = ((ReceiveCatching) waiter).cont;
            Result.Companion companion3 = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(Channel5.m28802boximpl(Channel5.INSTANCE.m28813closedJP2dKIU(getCloseCause()))));
        } else if (waiter instanceof BufferedChannelIterator) {
            ((BufferedChannelIterator) waiter).tryResumeHasNextOnClosedChannel();
        } else {
            if (waiter instanceof SelectInstance) {
                ((SelectInstance) waiter).trySelect(this, BufferedChannelKt.getCHANNEL_CLOSED());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + waiter).toString());
        }
    }

    @Override // kotlinx.coroutines.channels.Channel9
    public boolean isClosedForSend() {
        return isClosedForSend0(sendersAndCloseStatus$volatile$FU.get(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isClosedForSend0(long j) {
        return isClosed(j, false);
    }

    @Override // kotlinx.coroutines.channels.Channel8
    public boolean isClosedForReceive() {
        return isClosedForReceive0(sendersAndCloseStatus$volatile$FU.get(this));
    }

    private final boolean isClosedForReceive0(long j) {
        return isClosed(j, true);
    }

    private final boolean isClosed(long sendersAndCloseStatusCur, boolean isClosedForReceive) {
        int i = (int) (sendersAndCloseStatusCur >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            completeClose(sendersAndCloseStatusCur & 1152921504606846975L);
            return (isClosedForReceive && hasElements$kotlinx_coroutines_core()) ? false : true;
        }
        if (i == 3) {
            completeCancel(sendersAndCloseStatusCur & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i).toString());
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        while (true) {
            ChannelSegment<E> channelSegmentFindSegmentReceive = (ChannelSegment) receiveSegment$volatile$FU.get(this);
            long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
            if (getSendersCounter$kotlinx_coroutines_core() <= receiversCounter$kotlinx_coroutines_core) {
                return false;
            }
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = receiversCounter$kotlinx_coroutines_core / i;
            if (channelSegmentFindSegmentReceive.id == j || (channelSegmentFindSegmentReceive = findSegmentReceive(j, channelSegmentFindSegmentReceive)) != null) {
                channelSegmentFindSegmentReceive.cleanPrev();
                if (isCellNonEmpty(channelSegmentFindSegmentReceive, (int) (receiversCounter$kotlinx_coroutines_core % i), receiversCounter$kotlinx_coroutines_core)) {
                    return true;
                }
                receivers$volatile$FU.compareAndSet(this, receiversCounter$kotlinx_coroutines_core, 1 + receiversCounter$kotlinx_coroutines_core);
            } else if (((ChannelSegment) receiveSegment$volatile$FU.get(this)).id < j) {
                return false;
            }
        }
    }

    private final boolean isCellNonEmpty(ChannelSegment<E> segment, int index, long globalIndex) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                    return true;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_SEND || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED() || state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.POISONED) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.RESUMING_BY_EB) {
                    return true;
                }
                return state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV && globalIndex == getReceiversCounter$kotlinx_coroutines_core();
            }
        } while (!segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, BufferedChannelKt.POISONED));
        expandBuffer();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelSegment<E> findSegmentSend(long id, ChannelSegment<E> startFrom) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sendSegment$volatile$FU;
        Function2 function2 = (Function2) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedList.findSegmentInternal(startFrom, id, function2);
            if (!ConcurrentLinkedList4.m28838isClosedimpl(objFindSegmentInternal)) {
                ConcurrentLinkedList3 concurrentLinkedList3M28837getSegmentimpl = ConcurrentLinkedList4.m28837getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    ConcurrentLinkedList3 concurrentLinkedList3 = (ConcurrentLinkedList3) atomicReferenceFieldUpdater.get(this);
                    if (concurrentLinkedList3.id >= concurrentLinkedList3M28837getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!concurrentLinkedList3M28837getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (C2031xc40028dd.m363m(atomicReferenceFieldUpdater, this, concurrentLinkedList3, concurrentLinkedList3M28837getSegmentimpl)) {
                        if (concurrentLinkedList3.decPointers$kotlinx_coroutines_core()) {
                            concurrentLinkedList3.remove();
                        }
                    } else if (concurrentLinkedList3M28837getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        concurrentLinkedList3M28837getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (ConcurrentLinkedList4.m28838isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            if (startFrom.id * BufferedChannelKt.SEGMENT_SIZE < getReceiversCounter$kotlinx_coroutines_core()) {
                startFrom.cleanPrev();
            }
            return null;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) ConcurrentLinkedList4.m28837getSegmentimpl(objFindSegmentInternal);
        long j = channelSegment.id;
        if (j <= id) {
            return channelSegment;
        }
        int i = BufferedChannelKt.SEGMENT_SIZE;
        updateSendersCounterIfLower(j * i);
        if (channelSegment.id * i < getReceiversCounter$kotlinx_coroutines_core()) {
            channelSegment.cleanPrev();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelSegment<E> findSegmentReceive(long id, ChannelSegment<E> startFrom) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$volatile$FU;
        Function2 function2 = (Function2) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedList.findSegmentInternal(startFrom, id, function2);
            if (!ConcurrentLinkedList4.m28838isClosedimpl(objFindSegmentInternal)) {
                ConcurrentLinkedList3 concurrentLinkedList3M28837getSegmentimpl = ConcurrentLinkedList4.m28837getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    ConcurrentLinkedList3 concurrentLinkedList3 = (ConcurrentLinkedList3) atomicReferenceFieldUpdater.get(this);
                    if (concurrentLinkedList3.id >= concurrentLinkedList3M28837getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!concurrentLinkedList3M28837getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (C2031xc40028dd.m363m(atomicReferenceFieldUpdater, this, concurrentLinkedList3, concurrentLinkedList3M28837getSegmentimpl)) {
                        if (concurrentLinkedList3.decPointers$kotlinx_coroutines_core()) {
                            concurrentLinkedList3.remove();
                        }
                    } else if (concurrentLinkedList3M28837getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        concurrentLinkedList3M28837getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (ConcurrentLinkedList4.m28838isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            if (startFrom.id * BufferedChannelKt.SEGMENT_SIZE < getSendersCounter$kotlinx_coroutines_core()) {
                startFrom.cleanPrev();
            }
            return null;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) ConcurrentLinkedList4.m28837getSegmentimpl(objFindSegmentInternal);
        if (!isRendezvousOrUnlimited() && id <= getBufferEndCounter() / BufferedChannelKt.SEGMENT_SIZE) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = bufferEndSegment$volatile$FU;
            while (true) {
                ConcurrentLinkedList3 concurrentLinkedList32 = (ConcurrentLinkedList3) atomicReferenceFieldUpdater2.get(this);
                if (concurrentLinkedList32.id >= channelSegment.id || !channelSegment.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (C2031xc40028dd.m363m(atomicReferenceFieldUpdater2, this, concurrentLinkedList32, channelSegment)) {
                    if (concurrentLinkedList32.decPointers$kotlinx_coroutines_core()) {
                        concurrentLinkedList32.remove();
                    }
                } else if (channelSegment.decPointers$kotlinx_coroutines_core()) {
                    channelSegment.remove();
                }
            }
        }
        long j = channelSegment.id;
        if (j <= id) {
            return channelSegment;
        }
        int i = BufferedChannelKt.SEGMENT_SIZE;
        updateReceiversCounterIfLower(j * i);
        if (channelSegment.id * i < getSendersCounter$kotlinx_coroutines_core()) {
            channelSegment.cleanPrev();
        }
        return null;
    }

    private final ChannelSegment<E> findSegmentBufferEnd(long id, ChannelSegment<E> startFrom, long currentBufferEndCounter) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$volatile$FU;
        Function2 function2 = (Function2) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedList.findSegmentInternal(startFrom, id, function2);
            if (!ConcurrentLinkedList4.m28838isClosedimpl(objFindSegmentInternal)) {
                ConcurrentLinkedList3 concurrentLinkedList3M28837getSegmentimpl = ConcurrentLinkedList4.m28837getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    ConcurrentLinkedList3 concurrentLinkedList3 = (ConcurrentLinkedList3) atomicReferenceFieldUpdater.get(this);
                    if (concurrentLinkedList3.id >= concurrentLinkedList3M28837getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!concurrentLinkedList3M28837getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (C2031xc40028dd.m363m(atomicReferenceFieldUpdater, this, concurrentLinkedList3, concurrentLinkedList3M28837getSegmentimpl)) {
                        if (concurrentLinkedList3.decPointers$kotlinx_coroutines_core()) {
                            concurrentLinkedList3.remove();
                        }
                    } else if (concurrentLinkedList3M28837getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        concurrentLinkedList3M28837getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (ConcurrentLinkedList4.m28838isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            moveSegmentBufferEndToSpecifiedOrLast(id, startFrom);
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
            return null;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) ConcurrentLinkedList4.m28837getSegmentimpl(objFindSegmentInternal);
        if (channelSegment.id <= id) {
            return channelSegment;
        }
        long j = channelSegment.id;
        int i = BufferedChannelKt.SEGMENT_SIZE;
        if (bufferEnd$volatile$FU.compareAndSet(this, currentBufferEndCounter + 1, j * i)) {
            incCompletedExpandBufferAttempts((channelSegment.id * i) - currentBufferEndCounter);
        } else {
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void moveSegmentBufferEndToSpecifiedOrLast(long id, ChannelSegment<E> startFrom) {
        ChannelSegment<E> channelSegment;
        ChannelSegment<E> channelSegment2;
        while (startFrom.id < id && (channelSegment2 = (ChannelSegment) startFrom.getNext()) != null) {
            startFrom = channelSegment2;
        }
        while (true) {
            if (!startFrom.isRemoved() || (channelSegment = (ChannelSegment) startFrom.getNext()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$volatile$FU;
                while (true) {
                    ConcurrentLinkedList3 concurrentLinkedList3 = (ConcurrentLinkedList3) atomicReferenceFieldUpdater.get(this);
                    if (concurrentLinkedList3.id >= startFrom.id) {
                        return;
                    }
                    if (!startFrom.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (C2031xc40028dd.m363m(atomicReferenceFieldUpdater, this, concurrentLinkedList3, startFrom)) {
                        if (concurrentLinkedList3.decPointers$kotlinx_coroutines_core()) {
                            concurrentLinkedList3.remove();
                            return;
                        }
                        return;
                    } else if (startFrom.decPointers$kotlinx_coroutines_core()) {
                        startFrom.remove();
                    }
                }
            } else {
                startFrom = channelSegment;
            }
        }
    }

    private final void updateSendersCounterIfLower(long value) {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            j2 = 1152921504606846975L & j;
            if (j2 >= value) {
                return;
            }
        } while (!sendersAndCloseStatus$volatile$FU.compareAndSet(this, j, BufferedChannelKt.constructSendersAndCloseStatus(j2, (int) (j >> 60))));
    }

    private final void updateReceiversCounterIfLower(long value) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$volatile$FU;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if (j >= value) {
                return;
            }
            long j2 = value;
            if (receivers$volatile$FU.compareAndSet(this, j, j2)) {
                return;
            } else {
                value = j2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01df, code lost:
    
        r16 = r7;
        r3 = (kotlinx.coroutines.channels.ChannelSegment) r3.getNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e8, code lost:
    
        if (r3 != null) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z;
        String string2;
        StringBuilder sb = new StringBuilder();
        int i = (int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.capacity + ',');
        sb.append("data=[");
        int i2 = 0;
        boolean z2 = true;
        List listListOf = CollectionsKt.listOf((Object[]) new ChannelSegment[]{receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((ChannelSegment) obj) != BufferedChannelKt.NULL_SEGMENT) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((ChannelSegment) next).id;
            do {
                Object next2 = it.next();
                long j2 = ((ChannelSegment) next2).id;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment = (ChannelSegment) next;
        long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
        long sendersCounter$kotlinx_coroutines_core = getSendersCounter$kotlinx_coroutines_core();
        loop2: while (true) {
            int i3 = BufferedChannelKt.SEGMENT_SIZE;
            int i4 = i2;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                long j3 = (channelSegment.id * BufferedChannelKt.SEGMENT_SIZE) + i4;
                if (j3 >= sendersCounter$kotlinx_coroutines_core && j3 >= receiversCounter$kotlinx_coroutines_core) {
                    break loop2;
                }
                Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i4);
                Object element$kotlinx_coroutines_core = channelSegment.getElement$kotlinx_coroutines_core(i4);
                boolean z3 = z2;
                if (state$kotlinx_coroutines_core instanceof CancellableContinuation) {
                    if (j3 < receiversCounter$kotlinx_coroutines_core && j3 >= sendersCounter$kotlinx_coroutines_core) {
                        string2 = "receive";
                    } else if (j3 < sendersCounter$kotlinx_coroutines_core && j3 >= receiversCounter$kotlinx_coroutines_core) {
                        string2 = "send";
                    } else {
                        string2 = "cont";
                    }
                } else if (state$kotlinx_coroutines_core instanceof SelectInstance) {
                    if (j3 < receiversCounter$kotlinx_coroutines_core && j3 >= sendersCounter$kotlinx_coroutines_core) {
                        string2 = "onReceive";
                    } else if (j3 < sendersCounter$kotlinx_coroutines_core && j3 >= receiversCounter$kotlinx_coroutines_core) {
                        string2 = "onSend";
                    } else {
                        string2 = Fields4.TYPE;
                    }
                } else if (state$kotlinx_coroutines_core instanceof ReceiveCatching) {
                    string2 = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof SendBroadcast) {
                    string2 = "sendBroadcast";
                } else if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                    string2 = "EB(" + state$kotlinx_coroutines_core + ')';
                } else if (!Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_RCV) && !Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
                    if (state$kotlinx_coroutines_core == null || Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.IN_BUFFER) || Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV) || Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.POISONED) || Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.INTERRUPTED_RCV) || Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.INTERRUPTED_SEND) || Intrinsics.areEqual(state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                        i4++;
                        z2 = z3;
                    } else {
                        string2 = state$kotlinx_coroutines_core.toString();
                    }
                } else {
                    string2 = "resuming_sender";
                }
                if (element$kotlinx_coroutines_core != null) {
                    sb.append('(' + string2 + ',' + element$kotlinx_coroutines_core + "),");
                } else {
                    sb.append(string2 + ',');
                }
                i4++;
                z2 = z3;
            }
            z2 = z;
            i2 = 0;
        }
        if (StringsKt.last(sb) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: kotlinx.coroutines.channels.BufferedChannel$bindCancellationFunResult$1 */
    /* loaded from: classes14.dex */
    /* synthetic */ class C460681 extends FunctionReferenceImpl implements Function3<Throwable, Channel5<? extends E>, CoroutineContext, Unit> {
        C460681(Object obj) {
            super(3, obj, BufferedChannel.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th, Object obj, CoroutineContext coroutineContext) {
            m28801invoke5_sEAP8(th, ((Channel5) obj).getHolder(), coroutineContext);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-5_sEAP8, reason: not valid java name */
        public final void m28801invoke5_sEAP8(Throwable th, Object obj, CoroutineContext coroutineContext) {
            ((BufferedChannel) this.receiver).m28795onCancellationChannelResultImplDoNotCall5_sEAP8(th, obj, coroutineContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KFunction<Unit> bindCancellationFunResult(Function1<? super E, Unit> function1) {
        return new C460681(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCancellationChannelResultImplDoNotCall-5_sEAP8, reason: not valid java name */
    public final void m28795onCancellationChannelResultImplDoNotCall5_sEAP8(Throwable cause, Object element, CoroutineContext context) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        Intrinsics.checkNotNull(function1);
        Object objM28806getOrNullimpl = Channel5.m28806getOrNullimpl(element);
        Intrinsics.checkNotNull(objM28806getOrNullimpl);
        OnUndeliveredElement.callUndeliveredElement(function1, objM28806getOrNullimpl, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function3<Throwable, Object, CoroutineContext, Unit> bindCancellationFun(final Function1<? super E, Unit> function1, final E e) {
        return new Function3() { // from class: kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BufferedChannel.bindCancellationFun$lambda$89(function1, e, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindCancellationFun$lambda$89(Function1 function1, Object obj, Throwable th, Object obj2, CoroutineContext coroutineContext) {
        OnUndeliveredElement.callUndeliveredElement(function1, obj, coroutineContext);
        return Unit.INSTANCE;
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: kotlinx.coroutines.channels.BufferedChannel$bindCancellationFun$2 */
    /* loaded from: classes14.dex */
    /* synthetic */ class C460672 extends FunctionReferenceImpl implements Function3<Throwable, E, CoroutineContext, Unit> {
        C460672(Object obj) {
            super(3, obj, BufferedChannel.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th, Object obj, CoroutineContext coroutineContext) {
            invoke2(th, (Throwable) obj, coroutineContext);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th, E e, CoroutineContext coroutineContext) {
            ((BufferedChannel) this.receiver).onCancellationImplDoNotCall(th, e, coroutineContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KFunction<Unit> bindCancellationFun(Function1<? super E, Unit> function1) {
        return new C460672(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCancellationImplDoNotCall(Throwable cause, E element, CoroutineContext context) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        Intrinsics.checkNotNull(function1);
        OnUndeliveredElement.callUndeliveredElement(function1, element, context);
    }
}
