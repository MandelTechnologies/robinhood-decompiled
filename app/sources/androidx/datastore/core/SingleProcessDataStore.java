package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.http.HttpStatusCode;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 Q*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003QRSB\u0081\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012?\b\u0002\u0010\u0011\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\t0\b\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017JF\u0010\u001a\u001a\u00028\u000021\u0010\u0019\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00028\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u00020\u000f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0082@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u000f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0013\u0010(\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b*\u0010)J\u0013\u0010+\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b+\u0010)J\u0013\u0010,\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b,\u0010)J\u0013\u0010-\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b-\u0010)JN\u00100\u001a\u00028\u000021\u0010\u0019\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\t2\u0006\u0010/\u001a\u00020.H\u0082@ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u00020\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b2\u00103R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00106R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00107R \u00109\u001a\b\u0012\u0004\u0012\u00028\u0000088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082D¢\u0006\u0006\n\u0004\b>\u0010?R\u001b\u0010D\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR&\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000F0E8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bG\u0010H\u0012\u0004\bI\u0010JRR\u0010K\u001a;\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\bK\u0010LR \u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006T"}, m3636d2 = {"Landroidx/datastore/core/SingleProcessDataStore;", "T", "Landroidx/datastore/core/DataStore;", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/Serializer;", "serializer", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "", "initTasksList", "Landroidx/datastore/core/CorruptionHandler;", "corruptionHandler", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/datastore/core/Serializer;Ljava/util/List;Landroidx/datastore/core/CorruptionHandler;Lkotlinx/coroutines/CoroutineScope;)V", "t", "transform", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newData", "writeData$datastore_core", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", "read", "handleRead", "(Landroidx/datastore/core/SingleProcessDataStore$Message$Read;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", "update", "handleUpdate", "(Landroidx/datastore/core/SingleProcessDataStore$Message$Update;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAndInitOrPropagateAndThrowFailure", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAndInitOrPropagateFailure", "readAndInit", "readDataOrHandleCorruption", "readData", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "transformAndWrite", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createParentDirectories", "(Ljava/io/File;)V", "Lkotlin/jvm/functions/Function0;", "Landroidx/datastore/core/Serializer;", "Landroidx/datastore/core/CorruptionHandler;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/Flow;", WebsocketGatewayConstants.DATA_KEY, "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "", "SCRATCH_SUFFIX", "Ljava/lang/String;", "file$delegate", "Lkotlin/Lazy;", "getFile", "()Ljava/io/File;", "file", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/datastore/core/State;", "downstreamFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getDownstreamFlow$annotations", "()V", "initTasks", "Ljava/util/List;", "Landroidx/datastore/core/SimpleActor;", "Landroidx/datastore/core/SingleProcessDataStore$Message;", "actor", "Landroidx/datastore/core/SimpleActor;", "Companion", "Message", "UncloseableOutputStream", "datastore-core"}, m3637k = 1, m3638mv = {1, 5, 1}, m3640xi = 48)
/* loaded from: classes.dex */
public final class SingleProcessDataStore<T> implements DataStore<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Object activeFilesLock = new Object();
    private final String SCRATCH_SUFFIX;
    private final SimpleActor<Message<T>> actor;
    private final CorruptionHandler<T> corruptionHandler;
    private final Flow<T> data;
    private final StateFlow2<State<T>> downstreamFlow;

    /* renamed from: file$delegate, reason: from kotlin metadata */
    private final Lazy file;
    private List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasks;
    private final Function0<File> produceFile;
    private final CoroutineScope scope;
    private final Serializer<T> serializer;

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 5, 1}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.datastore.core.SingleProcessDataStore", m3645f = "SingleProcessDataStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE}, m3647m = "handleUpdate")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$handleUpdate$1 */
    static final class C22581 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C22581(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C22581> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleUpdate(null, this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 5, 1}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.datastore.core.SingleProcessDataStore", m3645f = "SingleProcessDataStore.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE, 348, 505}, m3647m = "readAndInit")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInit$1 */
    static final class C22591 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C22591(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C22591> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInit(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 5, 1}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.datastore.core.SingleProcessDataStore", m3645f = "SingleProcessDataStore.kt", m3646l = {302}, m3647m = "readAndInitOrPropagateAndThrowFailure")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 */
    /* loaded from: classes4.dex */
    static final class C22601 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C22601(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C22601> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateAndThrowFailure(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 5, 1}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.datastore.core.SingleProcessDataStore", m3645f = "SingleProcessDataStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE}, m3647m = "readAndInitOrPropagateFailure")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1 */
    static final class C22611 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C22611(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C22611> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateFailure(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 5, 1}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.datastore.core.SingleProcessDataStore", m3645f = "SingleProcessDataStore.kt", m3646l = {381}, m3647m = "readData")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$readData$1 */
    static final class C22621 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C22621(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C22621> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readData(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 5, 1}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.datastore.core.SingleProcessDataStore", m3645f = "SingleProcessDataStore.kt", m3646l = {359, 362, 365}, m3647m = "readDataOrHandleCorruption")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1 */
    static final class C22631 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C22631(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C22631> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataOrHandleCorruption(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 5, 1}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.datastore.core.SingleProcessDataStore", m3645f = "SingleProcessDataStore.kt", m3646l = {402, HttpStatusCode.GONE}, m3647m = "transformAndWrite")
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1 */
    static final class C22641 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C22641(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C22641> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.transformAndWrite(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleProcessDataStore(Function0<? extends File> produceFile, Serializer<T> serializer, List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasksList, CorruptionHandler<T> corruptionHandler, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.produceFile = produceFile;
        this.serializer = serializer;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = FlowKt.flow(new SingleProcessDataStore$data$1(this, null));
        this.SCRATCH_SUFFIX = ".tmp";
        this.file = LazyKt.lazy(new Function0<File>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$file$2
            final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                File file = (File) ((SingleProcessDataStore) this.this$0).produceFile.invoke();
                String it = file.getAbsolutePath();
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.INSTANCE;
                synchronized (companion.getActiveFilesLock$datastore_core()) {
                    if (companion.getActiveFiles$datastore_core().contains(it)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Set<String> activeFiles$datastore_core = companion.getActiveFiles$datastore_core();
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    activeFiles$datastore_core.add(it);
                }
                return file;
            }
        });
        this.downstreamFlow = StateFlow4.MutableStateFlow(UnInitialized.INSTANCE);
        this.initTasks = CollectionsKt.toList(initTasksList);
        this.actor = new SimpleActor<>(scope, new Function1<Throwable, Unit>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$actor$1
            final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (th != null) {
                    ((SingleProcessDataStore) this.this$0).downstreamFlow.setValue(new Final(th));
                }
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.INSTANCE;
                Object activeFilesLock$datastore_core = companion.getActiveFilesLock$datastore_core();
                SingleProcessDataStore<T> singleProcessDataStore = this.this$0;
                synchronized (activeFilesLock$datastore_core) {
                    companion.getActiveFiles$datastore_core().remove(singleProcessDataStore.getFile().getAbsolutePath());
                    Unit unit = Unit.INSTANCE;
                }
            }
        }, new Function2<Message<T>, Throwable, Unit>() { // from class: androidx.datastore.core.SingleProcessDataStore$actor$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th) {
                invoke((SingleProcessDataStore.Message) obj, th);
                return Unit.INSTANCE;
            }

            public final void invoke(SingleProcessDataStore.Message<T> msg, Throwable th) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg instanceof SingleProcessDataStore.Message.Update) {
                    CompletableDeferred<T> ack = ((SingleProcessDataStore.Message.Update) msg).getAck();
                    if (th == null) {
                        th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    ack.completeExceptionally(th);
                }
            }
        }, new SingleProcessDataStore$actor$3(this, null));
    }

    @Override // androidx.datastore.core.DataStore
    public Flow<T> getData() {
        return this.data;
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
        this.actor.offer(new Message.Update(function2, completableDeferredCompletableDeferred$default, this.downstreamFlow.getValue(), continuation.getContext()));
        return completableDeferredCompletableDeferred$default.await(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getFile() {
        return (File) this.file.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message;", "T", "", "<init>", "()V", "Read", "Update", "Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", "Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", "datastore-core"}, m3637k = 1, m3638mv = {1, 5, 1}, m3640xi = 48)
    static abstract class Message<T> {
        public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Message() {
        }

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", "T", "Landroidx/datastore/core/SingleProcessDataStore$Message;", "lastState", "Landroidx/datastore/core/State;", "(Landroidx/datastore/core/State;)V", "getLastState", "()Landroidx/datastore/core/State;", "datastore-core"}, m3637k = 1, m3638mv = {1, 5, 1}, m3640xi = 48)
        public static final class Read<T> extends Message<T> {
            private final State<T> lastState;

            public State<T> getLastState() {
                return this.lastState;
            }

            public Read(State<T> state) {
                super(null);
                this.lastState = state;
            }
        }

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002Ba\u00121\u0010\u0003\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016RA\u0010\u0003\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m3636d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", "T", "Landroidx/datastore/core/SingleProcessDataStore$Message;", "transform", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", "ack", "Lkotlinx/coroutines/CompletableDeferred;", "lastState", "Landroidx/datastore/core/State;", "callerContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/CompletableDeferred;Landroidx/datastore/core/State;Lkotlin/coroutines/CoroutineContext;)V", "getAck", "()Lkotlinx/coroutines/CompletableDeferred;", "getCallerContext", "()Lkotlin/coroutines/CoroutineContext;", "getLastState", "()Landroidx/datastore/core/State;", "getTransform", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "datastore-core"}, m3637k = 1, m3638mv = {1, 5, 1}, m3640xi = 48)
        public static final class Update<T> extends Message<T> {
            private final CompletableDeferred<T> ack;
            private final CoroutineContext callerContext;
            private final State<T> lastState;
            private final Function2<T, Continuation<? super T>, Object> transform;

            public final Function2<T, Continuation<? super T>, Object> getTransform() {
                return this.transform;
            }

            public final CompletableDeferred<T> getAck() {
                return this.ack;
            }

            public State<T> getLastState() {
                return this.lastState;
            }

            public final CoroutineContext getCallerContext() {
                return this.callerContext;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Update(Function2<? super T, ? super Continuation<? super T>, ? extends Object> transform, CompletableDeferred<T> ack, State<T> state, CoroutineContext callerContext) {
                super(null);
                Intrinsics.checkNotNullParameter(transform, "transform");
                Intrinsics.checkNotNullParameter(ack, "ack");
                Intrinsics.checkNotNullParameter(callerContext, "callerContext");
                this.transform = transform;
                this.ack = ack;
                this.lastState = state;
                this.callerContext = callerContext;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleRead(Message.Read<T> read, Continuation<? super Unit> continuation) {
        State<T> value = this.downstreamFlow.getValue();
        if (!(value instanceof Data)) {
            if (value instanceof ReadException) {
                if (value == read.getLastState()) {
                    Object andInitOrPropagateFailure = readAndInitOrPropagateFailure(continuation);
                    return andInitOrPropagateFailure == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? andInitOrPropagateFailure : Unit.INSTANCE;
                }
            } else {
                if (Intrinsics.areEqual(value, UnInitialized.INSTANCE)) {
                    Object andInitOrPropagateFailure2 = readAndInitOrPropagateFailure(continuation);
                    return andInitOrPropagateFailure2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? andInitOrPropagateFailure2 : Unit.INSTANCE;
                }
                if (value instanceof Final) {
                    throw new IllegalStateException("Can't read in final state.");
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        if (r9 == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleUpdate(Message.Update<T> update, Continuation<? super Unit> continuation) {
        C22581 c22581;
        Object objM28550constructorimpl;
        ?? r9;
        CompletableDeferred<T> ack;
        State<T> value;
        SingleProcessDataStore singleProcessDataStore;
        Object objTransformAndWrite;
        Message.Update<T> update2;
        Message.Update<T> update3;
        if (continuation instanceof C22581) {
            c22581 = (C22581) continuation;
            int i = c22581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22581.label = i - Integer.MIN_VALUE;
            } else {
                c22581 = new C22581(this, continuation);
            }
        }
        Object obj = c22581.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c22581.label;
        boolean z = true;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ack = update.getAck();
            try {
                Result.Companion companion = Result.INSTANCE;
                value = this.downstreamFlow.getValue();
            } catch (Throwable th2) {
                th = th2;
                update = ack;
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                r9 = update;
                CompletableDeferred3.completeWith(r9, objM28550constructorimpl);
                return Unit.INSTANCE;
            }
            if (value instanceof Data) {
                Function2<T, Continuation<? super T>, Object> transform = update.getTransform();
                CoroutineContext callerContext = update.getCallerContext();
                c22581.L$0 = ack;
                c22581.label = 1;
                objTransformAndWrite = transformAndWrite(transform, callerContext, c22581);
                if (objTransformAndWrite == coroutine_suspended) {
                }
                Message.Update<T> update4 = ack;
                obj = objTransformAndWrite;
                update = update4;
                objM28550constructorimpl = Result.m28550constructorimpl(obj);
                r9 = update;
                CompletableDeferred3.completeWith(r9, objM28550constructorimpl);
                return Unit.INSTANCE;
            }
            if (!(value instanceof ReadException)) {
                z = value instanceof UnInitialized;
            }
            if (z) {
                if (value == update.getLastState()) {
                    c22581.L$0 = update;
                    c22581.L$1 = this;
                    c22581.L$2 = ack;
                    c22581.label = 2;
                    if (readAndInitOrPropagateAndThrowFailure(c22581) != coroutine_suspended) {
                        singleProcessDataStore = this;
                        update2 = update;
                    }
                } else {
                    throw ((ReadException) value).getReadException();
                }
            } else {
                if (value instanceof Final) {
                    throw ((Final) value).getFinalException();
                }
                throw new NoWhenBranchMatchedException();
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            update3 = (CompletableDeferred) c22581.L$0;
        } else if (i2 == 2) {
            CompletableDeferred<T> completableDeferred = (CompletableDeferred) c22581.L$2;
            singleProcessDataStore = (SingleProcessDataStore) c22581.L$1;
            Message.Update<T> update5 = (Message.Update) c22581.L$0;
            ResultKt.throwOnFailure(obj);
            ack = completableDeferred;
            update2 = update5;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            update3 = (Message.Update<T>) ((CompletableDeferred) c22581.L$0);
        }
        ResultKt.throwOnFailure(obj);
        update = update3;
        objM28550constructorimpl = Result.m28550constructorimpl(obj);
        r9 = update;
        CompletableDeferred3.completeWith(r9, objM28550constructorimpl);
        return Unit.INSTANCE;
        Function2<T, Continuation<? super T>, Object> transform2 = update2.getTransform();
        CoroutineContext callerContext2 = update2.getCallerContext();
        c22581.L$0 = ack;
        c22581.L$1 = null;
        c22581.L$2 = null;
        c22581.label = 3;
        objTransformAndWrite = singleProcessDataStore.transformAndWrite(transform2, callerContext2, c22581);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInitOrPropagateAndThrowFailure(Continuation<? super Unit> continuation) throws Throwable {
        C22601 c22601;
        SingleProcessDataStore<T> singleProcessDataStore;
        if (continuation instanceof C22601) {
            c22601 = (C22601) continuation;
            int i = c22601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22601.label = i - Integer.MIN_VALUE;
            } else {
                c22601 = new C22601(this, continuation);
            }
        }
        Object obj = c22601.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c22601.label;
        if (i2 != 0) {
            if (i2 == 1) {
                singleProcessDataStore = (SingleProcessDataStore) c22601.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                    throw th;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            c22601.L$0 = this;
            c22601.label = 1;
            if (readAndInit(c22601) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            singleProcessDataStore = this;
            singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInitOrPropagateFailure(Continuation<? super Unit> continuation) {
        C22611 c22611;
        SingleProcessDataStore<T> singleProcessDataStore;
        if (continuation instanceof C22611) {
            c22611 = (C22611) continuation;
            int i = c22611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22611.label = i - Integer.MIN_VALUE;
            } else {
                c22611 = new C22611(this, continuation);
            }
        }
        Object obj = c22611.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c22611.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                c22611.L$0 = this;
                c22611.label = 1;
                if (readAndInit(c22611) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                th = th;
                singleProcessDataStore = this;
                singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                return Unit.INSTANCE;
            }
        } else if (i2 == 1) {
            singleProcessDataStore = (SingleProcessDataStore) c22611.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
                singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                return Unit.INSTANCE;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInit(Continuation<? super Unit> continuation) {
        C22591 c22591;
        Mutex mutexMutex$default;
        Ref.ObjectRef objectRef;
        SingleProcessDataStore<T> singleProcessDataStore;
        Ref.ObjectRef objectRef2;
        SingleProcessDataStore<T> singleProcessDataStore2;
        Ref.ObjectRef objectRef3;
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1;
        Iterator<T> it;
        Mutex mutex;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        C22591 c225912;
        SingleProcessDataStore<T> singleProcessDataStore3;
        Ref.ObjectRef objectRef4;
        Mutex mutex2;
        if (continuation instanceof C22591) {
            c22591 = (C22591) continuation;
            int i = c22591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22591.label = i - Integer.MIN_VALUE;
            } else {
                c22591 = new C22591(this, continuation);
            }
        }
        T t = (T) c22591.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c22591.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(t);
            if (!(Intrinsics.areEqual(this.downstreamFlow.getValue(), UnInitialized.INSTANCE) || (this.downstreamFlow.getValue() instanceof ReadException))) {
                throw new IllegalStateException("Check failed.");
            }
            mutexMutex$default = Mutex3.Mutex$default(false, 1, null);
            objectRef = new Ref.ObjectRef();
            c22591.L$0 = this;
            c22591.L$1 = mutexMutex$default;
            c22591.L$2 = objectRef;
            c22591.L$3 = objectRef;
            c22591.label = 1;
            t = (T) readDataOrHandleCorruption(c22591);
            if (t != coroutine_suspended) {
                singleProcessDataStore = this;
                objectRef2 = objectRef;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    mutex2 = (Mutex) c22591.L$3;
                    booleanRef2 = (Ref.BooleanRef) c22591.L$2;
                    objectRef4 = (Ref.ObjectRef) c22591.L$1;
                    singleProcessDataStore3 = (SingleProcessDataStore) c22591.L$0;
                    ResultKt.throwOnFailure(t);
                    try {
                        booleanRef2.element = true;
                        Unit unit = Unit.INSTANCE;
                        mutex2.unlock(null);
                        StateFlow2<State<T>> stateFlow2 = singleProcessDataStore3.downstreamFlow;
                        T t2 = objectRef4.element;
                        stateFlow2.setValue(new Data(t2, t2 != null ? t2.hashCode() : 0));
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c22591.L$5;
            singleProcessDataStore$readAndInit$api$1 = (SingleProcessDataStore$readAndInit$api$1) c22591.L$4;
            booleanRef = (Ref.BooleanRef) c22591.L$3;
            objectRef3 = (Ref.ObjectRef) c22591.L$2;
            mutex = (Mutex) c22591.L$1;
            singleProcessDataStore2 = (SingleProcessDataStore) c22591.L$0;
            ResultKt.throwOnFailure(t);
            while (it.hasNext()) {
                Function2 function2 = (Function2) it.next();
                c22591.L$0 = singleProcessDataStore2;
                c22591.L$1 = mutex;
                c22591.L$2 = objectRef3;
                c22591.L$3 = booleanRef;
                c22591.L$4 = singleProcessDataStore$readAndInit$api$1;
                c22591.L$5 = it;
                c22591.label = 2;
                if (function2.invoke(singleProcessDataStore$readAndInit$api$1, c22591) == coroutine_suspended) {
                    break;
                }
            }
            c225912 = c22591;
            booleanRef2 = booleanRef;
            objectRef2 = objectRef3;
            mutexMutex$default = mutex;
            singleProcessDataStore3 = singleProcessDataStore2;
            singleProcessDataStore3.initTasks = null;
            c225912.L$0 = singleProcessDataStore3;
            c225912.L$1 = objectRef2;
            c225912.L$2 = booleanRef2;
            c225912.L$3 = mutexMutex$default;
            c225912.L$4 = null;
            c225912.L$5 = null;
            c225912.label = 3;
            if (mutexMutex$default.lock(null, c225912) != coroutine_suspended) {
                objectRef4 = objectRef2;
                mutex2 = mutexMutex$default;
                booleanRef2.element = true;
                Unit unit2 = Unit.INSTANCE;
                mutex2.unlock(null);
                StateFlow2<State<T>> stateFlow22 = singleProcessDataStore3.downstreamFlow;
                T t22 = objectRef4.element;
                stateFlow22.setValue(new Data(t22, t22 != null ? t22.hashCode() : 0));
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        objectRef = (Ref.ObjectRef) c22591.L$3;
        objectRef2 = (Ref.ObjectRef) c22591.L$2;
        mutexMutex$default = (Mutex) c22591.L$1;
        singleProcessDataStore = (SingleProcessDataStore) c22591.L$0;
        ResultKt.throwOnFailure(t);
        objectRef.element = t;
        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$12 = new SingleProcessDataStore$readAndInit$api$1(mutexMutex$default, booleanRef3, objectRef2, singleProcessDataStore);
        List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> list = singleProcessDataStore.initTasks;
        if (list == null) {
            booleanRef2 = booleanRef3;
            c225912 = c22591;
            singleProcessDataStore3 = singleProcessDataStore;
            singleProcessDataStore3.initTasks = null;
            c225912.L$0 = singleProcessDataStore3;
            c225912.L$1 = objectRef2;
            c225912.L$2 = booleanRef2;
            c225912.L$3 = mutexMutex$default;
            c225912.L$4 = null;
            c225912.L$5 = null;
            c225912.label = 3;
            if (mutexMutex$default.lock(null, c225912) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        singleProcessDataStore2 = singleProcessDataStore;
        objectRef3 = objectRef2;
        singleProcessDataStore$readAndInit$api$1 = singleProcessDataStore$readAndInit$api$12;
        it = list.iterator();
        mutex = mutexMutex$default;
        booleanRef = booleanRef3;
        while (it.hasNext()) {
        }
        c225912 = c22591;
        booleanRef2 = booleanRef;
        objectRef2 = objectRef3;
        mutexMutex$default = mutex;
        singleProcessDataStore3 = singleProcessDataStore2;
        singleProcessDataStore3.initTasks = null;
        c225912.L$0 = singleProcessDataStore3;
        c225912.L$1 = objectRef2;
        c225912.L$2 = booleanRef2;
        c225912.L$3 = mutexMutex$default;
        c225912.L$4 = null;
        c225912.L$5 = null;
        c225912.label = 3;
        if (mutexMutex$default.lock(null, c225912) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readDataOrHandleCorruption(Continuation<? super T> continuation) throws Serializer2, FileNotFoundException {
        C22631 c22631;
        SingleProcessDataStore singleProcessDataStore;
        Serializer2 serializer2;
        SingleProcessDataStore singleProcessDataStore2;
        Serializer2 serializer22;
        if (continuation instanceof C22631) {
            c22631 = (C22631) continuation;
            int i = c22631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22631.label = i - Integer.MIN_VALUE;
            } else {
                c22631 = new C22631(this, continuation);
            }
        }
        Object obj = c22631.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c22631.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                c22631.L$0 = this;
                c22631.label = 1;
                Object data = readData(c22631);
                if (data != coroutine_suspended) {
                    return data;
                }
            } catch (Serializer2 e) {
                e = e;
                singleProcessDataStore = this;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        Object obj2 = c22631.L$1;
                        serializer22 = (Serializer2) c22631.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            return obj2;
                        } catch (IOException e2) {
                            e = e2;
                            ExceptionsKt.addSuppressed(serializer22, e);
                            throw serializer22;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                serializer2 = (Serializer2) c22631.L$1;
                SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) c22631.L$0;
                ResultKt.throwOnFailure(obj);
                singleProcessDataStore2 = singleProcessDataStore3;
                try {
                    c22631.L$0 = serializer2;
                    c22631.L$1 = obj;
                    c22631.label = 3;
                    return singleProcessDataStore2.writeData$datastore_core(obj, c22631) != coroutine_suspended ? coroutine_suspended : obj;
                } catch (IOException e3) {
                    e = e3;
                    serializer22 = serializer2;
                    ExceptionsKt.addSuppressed(serializer22, e);
                    throw serializer22;
                }
            }
            singleProcessDataStore = (SingleProcessDataStore) c22631.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                return obj;
            } catch (Serializer2 e4) {
                e = e4;
            }
        }
        CorruptionHandler<T> corruptionHandler = singleProcessDataStore.corruptionHandler;
        c22631.L$0 = singleProcessDataStore;
        c22631.L$1 = e;
        c22631.label = 2;
        Object objHandleCorruption = corruptionHandler.handleCorruption(e, c22631);
        if (objHandleCorruption != coroutine_suspended) {
            SingleProcessDataStore singleProcessDataStore4 = singleProcessDataStore;
            serializer2 = e;
            obj = objHandleCorruption;
            singleProcessDataStore2 = singleProcessDataStore4;
            c22631.L$0 = serializer2;
            c22631.L$1 = obj;
            c22631.label = 3;
            if (singleProcessDataStore2.writeData$datastore_core(obj, c22631) != coroutine_suspended) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.SingleProcessDataStore$readData$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.datastore.core.Serializer, androidx.datastore.core.Serializer<T>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readData(Continuation<? super T> continuation) throws FileNotFoundException {
        ?? c22621;
        ?? fileInputStream;
        Throwable th;
        Closeable closeable;
        if (continuation instanceof C22621) {
            C22621 c226212 = (C22621) continuation;
            int i = c226212.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c226212.label = i - Integer.MIN_VALUE;
                c22621 = c226212;
            } else {
                c22621 = new C22621(this, continuation);
            }
        }
        Object from = c22621.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c22621.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) c22621.L$2;
                fileInputStream = (Closeable) c22621.L$1;
                c22621 = (SingleProcessDataStore) c22621.L$0;
                try {
                    ResultKt.throwOnFailure(from);
                    closeable = fileInputStream;
                    return from;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } finally {
                        kotlin.p481io.Closeable.closeFinally(fileInputStream, th);
                    }
                }
            }
            ResultKt.throwOnFailure(from);
            try {
                fileInputStream = new FileInputStream(getFile());
                try {
                    Serializer<T> serializer = this.serializer;
                    c22621.L$0 = this;
                    c22621.L$1 = fileInputStream;
                    c22621.L$2 = null;
                    c22621.label = 1;
                    from = serializer.readFrom(fileInputStream, c22621);
                    if (from == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    th = null;
                    closeable = fileInputStream;
                    return from;
                } catch (Throwable th3) {
                    th = th3;
                    c22621 = this;
                    throw th;
                }
            } catch (FileNotFoundException e) {
                e = e;
                c22621 = this;
                if (c22621.getFile().exists()) {
                    throw e;
                }
                return c22621.serializer.getDefaultValue();
            }
        } catch (FileNotFoundException e2) {
            e = e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transformAndWrite(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        C22641 c22641;
        Data data;
        Object obj;
        SingleProcessDataStore singleProcessDataStore;
        Object obj2;
        SingleProcessDataStore singleProcessDataStore2;
        if (continuation instanceof C22641) {
            c22641 = (C22641) continuation;
            int i = c22641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22641.label = i - Integer.MIN_VALUE;
            } else {
                c22641 = new C22641(this, continuation);
            }
        }
        Object obj3 = c22641.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c22641.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj3);
            Data data2 = (Data) this.downstreamFlow.getValue();
            data2.checkHashCode();
            Object value = data2.getValue();
            SingleProcessDataStore$transformAndWrite$newData$1 singleProcessDataStore$transformAndWrite$newData$1 = new SingleProcessDataStore$transformAndWrite$newData$1(function2, value, null);
            c22641.L$0 = this;
            c22641.L$1 = data2;
            c22641.L$2 = value;
            c22641.label = 1;
            Object objWithContext = BuildersKt.withContext(coroutineContext, singleProcessDataStore$transformAndWrite$newData$1, c22641);
            if (objWithContext != coroutine_suspended) {
                data = data2;
                obj3 = objWithContext;
                obj = value;
                singleProcessDataStore = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = c22641.L$1;
            singleProcessDataStore2 = (SingleProcessDataStore) c22641.L$0;
            ResultKt.throwOnFailure(obj3);
            singleProcessDataStore2.downstreamFlow.setValue(new Data(obj2, obj2 == null ? obj2.hashCode() : 0));
            return obj2;
        }
        obj = c22641.L$2;
        data = (Data) c22641.L$1;
        SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) c22641.L$0;
        ResultKt.throwOnFailure(obj3);
        singleProcessDataStore = singleProcessDataStore3;
        data.checkHashCode();
        if (Intrinsics.areEqual(obj, obj3)) {
            return obj;
        }
        c22641.L$0 = singleProcessDataStore;
        c22641.L$1 = obj3;
        c22641.L$2 = null;
        c22641.label = 2;
        if (singleProcessDataStore.writeData$datastore_core(obj3, c22641) != coroutine_suspended) {
            obj2 = obj3;
            singleProcessDataStore2 = singleProcessDataStore;
            singleProcessDataStore2.downstreamFlow.setValue(new Data(obj2, obj2 == null ? obj2.hashCode() : 0));
            return obj2;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeData$datastore_core(T t, Continuation<? super Unit> continuation) throws IOException {
        SingleProcessDataStore$writeData$1 singleProcessDataStore$writeData$1;
        File file;
        ?? fileOutputStream;
        SingleProcessDataStore<T> singleProcessDataStore;
        FileOutputStream fileOutputStream2;
        Throwable th;
        if (continuation instanceof SingleProcessDataStore$writeData$1) {
            singleProcessDataStore$writeData$1 = (SingleProcessDataStore$writeData$1) continuation;
            int i = singleProcessDataStore$writeData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$writeData$1.label = i - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, continuation);
            }
        }
        Object obj = singleProcessDataStore$writeData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = singleProcessDataStore$writeData$1.label;
        ?? r3 = 1;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                createParentDirectories(getFile());
                file = new File(Intrinsics.stringPlus(getFile().getAbsolutePath(), this.SCRATCH_SUFFIX));
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        Serializer<T> serializer = this.serializer;
                        UncloseableOutputStream uncloseableOutputStream = new UncloseableOutputStream(fileOutputStream);
                        singleProcessDataStore$writeData$1.L$0 = this;
                        singleProcessDataStore$writeData$1.L$1 = file;
                        singleProcessDataStore$writeData$1.L$2 = fileOutputStream;
                        singleProcessDataStore$writeData$1.L$3 = null;
                        singleProcessDataStore$writeData$1.L$4 = fileOutputStream;
                        singleProcessDataStore$writeData$1.label = 1;
                        if (serializer.writeTo(t, uncloseableOutputStream, singleProcessDataStore$writeData$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        singleProcessDataStore = this;
                        r3 = file;
                        fileOutputStream2 = fileOutputStream;
                        th = null;
                        fileOutputStream = fileOutputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        r3 = file;
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
            } else if (i2 == 1) {
                fileOutputStream2 = (FileOutputStream) singleProcessDataStore$writeData$1.L$4;
                th = (Throwable) singleProcessDataStore$writeData$1.L$3;
                fileOutputStream = (Closeable) singleProcessDataStore$writeData$1.L$2;
                r3 = (File) singleProcessDataStore$writeData$1.L$1;
                singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$writeData$1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    fileOutputStream = fileOutputStream;
                    r3 = r3;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        kotlin.p481io.Closeable.closeFinally(fileOutputStream, th);
                        throw th4;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream2.getFD().sync();
            Unit unit = Unit.INSTANCE;
            kotlin.p481io.Closeable.closeFinally(fileOutputStream, th);
            if (!r3.renameTo(singleProcessDataStore.getFile())) {
                throw new IOException("Unable to rename " + r3 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
            }
            return Unit.INSTANCE;
        } catch (IOException e2) {
            e = e2;
            file = r3;
            if (file.exists()) {
            }
            throw e;
        }
    }

    private final void createParentDirectories(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(Intrinsics.stringPlus("Unable to create parent directories of ", file));
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\fJ'\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Landroidx/datastore/core/SingleProcessDataStore$UncloseableOutputStream;", "Ljava/io/OutputStream;", "Ljava/io/FileOutputStream;", "fileOutputStream", "<init>", "(Ljava/io/FileOutputStream;)V", "", "b", "", "write", "(I)V", "", "([B)V", "bytes", "off", "len", "([BII)V", "close", "()V", "flush", "Ljava/io/FileOutputStream;", "getFileOutputStream", "()Ljava/io/FileOutputStream;", "datastore-core"}, m3637k = 1, m3638mv = {1, 5, 1}, m3640xi = 48)
    private static final class UncloseableOutputStream extends OutputStream {
        private final FileOutputStream fileOutputStream;

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public UncloseableOutputStream(FileOutputStream fileOutputStream) {
            Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
            this.fileOutputStream = fileOutputStream;
        }

        @Override // java.io.OutputStream
        public void write(int b) throws IOException {
            this.fileOutputStream.write(b);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b) throws IOException {
            Intrinsics.checkNotNullParameter(b, "b");
            this.fileOutputStream.write(b);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes, int off, int len) throws IOException {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            this.fileOutputStream.write(bytes, off, len);
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.fileOutputStream.flush();
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Companion;", "", "()V", "activeFiles", "", "", "getActiveFiles$datastore_core", "()Ljava/util/Set;", "activeFilesLock", "getActiveFilesLock$datastore_core", "()Ljava/lang/Object;", "datastore-core"}, m3637k = 1, m3638mv = {1, 5, 1}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Set<String> getActiveFiles$datastore_core() {
            return SingleProcessDataStore.activeFiles;
        }

        public final Object getActiveFilesLock$datastore_core() {
            return SingleProcessDataStore.activeFilesLock;
        }
    }
}
