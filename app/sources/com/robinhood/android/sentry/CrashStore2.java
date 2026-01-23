package com.robinhood.android.sentry;

import com.mayakapps.rwmutex.ReadWriteMutex;
import com.mayakapps.rwmutex.ReadWriteMutex5;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import io.sentry.Hint;
import io.sentry.IHub;
import io.sentry.Integration;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.SentryEvent;
import io.sentry.SentryOptions;
import io.sentry.android.core.AndroidLogger;
import io.sentry.protocol.SentryId;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.sync.Mutex;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* compiled from: CrashStore.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ=\u0010\u001c\u001a\u0002H\u001d\"\u0004\b\u0000\u0010\u001d2'\u0010\u001e\u001a#\b\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001d0!\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001f¢\u0006\u0002\b#H\u0082@¢\u0006\u0002\u0010$J=\u0010%\u001a\u0002H\u001d\"\u0004\b\u0000\u0010\u001d2'\u0010\u001e\u001a#\b\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001d0!\u0012\u0006\u0012\u0004\u0018\u00010\"0\u001f¢\u0006\u0002\b#H\u0082@¢\u0006\u0002\u0010$J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0082@¢\u0006\u0002\u0010'J\u0018\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0016\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020/H\u0096@¢\u0006\u0002\u00100R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/sentry/CrashStoreIntegration;", "Lcom/robinhood/android/sentry/CrashStore;", "Lio/sentry/Integration;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "fileSystem", "Lokio/FileSystem;", "baseDirectory", "Lokio/Path;", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lokio/FileSystem;Lokio/Path;)V", "mutex", "Lcom/mayakapps/rwmutex/ReadWriteMutex;", "temporaryFileLock", "Ljava/util/concurrent/locks/ReentrantLock;", "temporaryFile", "eventsDirectory", "invalidationTrigger", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "crashes", "Lkotlinx/coroutines/flow/Flow;", "", "Lio/sentry/SentryEvent;", "getCrashes$annotations", "()V", "getCrashes", "()Lkotlinx/coroutines/flow/Flow;", "performRead", "R", "action", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performWrite", "readAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "hub", "Lio/sentry/IHub;", "options", "Lio/sentry/SentryOptions;", AnalyticsStrings.BUTTON_LIST_DISCARD, "eventId", "Lio/sentry/protocol/SentryId;", "(Lio/sentry/protocol/SentryId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-sentry_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.sentry.CrashStoreIntegration, reason: use source file name */
/* loaded from: classes5.dex */
public final class CrashStore2 implements CrashStore, Integration {
    private static final String EVENTS_DIRECTORY_NAME = "events";
    private static final String TEMP_FILE_NAME = "tmp";
    private final Flow<List<SentryEvent>> crashes;
    private final Path eventsDirectory;
    private final FileSystem fileSystem;
    private final SharedFlow2<Unit> invalidationTrigger;
    private final CoroutineDispatcher ioDispatcher;
    private final ReadWriteMutex mutex;
    private final Path temporaryFile;
    private final ReentrantLock temporaryFileLock;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AndroidLogger logger = new AndroidLogger("CrashStoreIntegration");
    private static final SentryEvent.Deserializer eventDeserializer = new SentryEvent.Deserializer();

    /* compiled from: CrashStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.sentry.CrashStoreIntegration", m3645f = "CrashStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = AnalyticsStrings.BUTTON_LIST_DISCARD)
    /* renamed from: com.robinhood.android.sentry.CrashStoreIntegration$discard$1 */
    static final class C282941 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C282941(Continuation<? super C282941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CrashStore2.this.discard(null, this);
        }
    }

    public static /* synthetic */ void getCrashes$annotations() {
    }

    public CrashStore2(CoroutineDispatcher ioDispatcher, FileSystem fileSystem, Path baseDirectory) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(baseDirectory, "baseDirectory");
        this.ioDispatcher = ioDispatcher;
        this.fileSystem = fileSystem;
        this.mutex = ReadWriteMutex5.ReadWriteMutex();
        this.temporaryFileLock = new ReentrantLock();
        this.temporaryFile = baseDirectory.resolve(TEMP_FILE_NAME);
        this.eventsDirectory = baseDirectory.resolve(EVENTS_DIRECTORY_NAME);
        SharedFlow2<Unit> sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        if (!sharedFlow2MutableSharedFlow$default.tryEmit(Unit.INSTANCE)) {
            throw new IllegalStateException("Check failed.");
        }
        this.invalidationTrigger = sharedFlow2MutableSharedFlow$default;
        this.crashes = FlowKt.transformLatest(sharedFlow2MutableSharedFlow$default, new CrashStore3(this, null));
    }

    @Override // com.robinhood.android.sentry.CrashStore
    public Flow<List<SentryEvent>> getCrashes() {
        return this.crashes;
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: CrashStore.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.sentry.CrashStoreIntegration$performRead$2", m3645f = "CrashStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 77}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.sentry.CrashStoreIntegration$performRead$2 */
    static final class C282962<R> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super R>, Object> $action;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C282962(Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super C282962> continuation) {
            super(2, continuation);
            this.$action = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C282962 c282962 = CrashStore2.this.new C282962(this.$action, continuation);
            c282962.L$0 = obj;
            return c282962;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((C282962) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            Mutex readMutex;
            Function2<CoroutineScope, Continuation<? super R>, Object> function2;
            Mutex mutex;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    ReadWriteMutex readWriteMutex = CrashStore2.this.mutex;
                    Function2<CoroutineScope, Continuation<? super R>, Object> function22 = this.$action;
                    readMutex = readWriteMutex.getReadMutex();
                    this.L$0 = coroutineScope;
                    this.L$1 = function22;
                    this.L$2 = readMutex;
                    this.label = 1;
                    if (readMutex.lock(null, this) != coroutine_suspended) {
                        function2 = function22;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex = (Mutex) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        mutex.unlock(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                Mutex mutex2 = (Mutex) this.L$2;
                function2 = (Function2) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                readMutex = mutex2;
                this.L$0 = readMutex;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                Object objInvoke = function2.invoke(coroutineScope, this);
                if (objInvoke != coroutine_suspended) {
                    mutex = readMutex;
                    obj = objInvoke;
                    mutex.unlock(null);
                    return obj;
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                mutex = readMutex;
                th = th3;
                mutex.unlock(null);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> Object performRead(Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C282962(function2, null), continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: CrashStore.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.sentry.CrashStoreIntegration$performWrite$2", m3645f = "CrashStore.kt", m3646l = {156, 83}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.sentry.CrashStoreIntegration$performWrite$2 */
    static final class C282972<R> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super R>, Object> $action;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C282972(Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super C282972> continuation) {
            super(2, continuation);
            this.$action = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C282972 c282972 = CrashStore2.this.new C282972(this.$action, continuation);
            c282972.L$0 = obj;
            return c282972;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((C282972) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            Mutex writeMutex;
            Function2<CoroutineScope, Continuation<? super R>, Object> function2;
            Mutex mutex;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    ReadWriteMutex readWriteMutex = CrashStore2.this.mutex;
                    Function2<CoroutineScope, Continuation<? super R>, Object> function22 = this.$action;
                    writeMutex = readWriteMutex.getWriteMutex();
                    this.L$0 = coroutineScope;
                    this.L$1 = function22;
                    this.L$2 = writeMutex;
                    this.label = 1;
                    if (writeMutex.lock(null, this) != coroutine_suspended) {
                        function2 = function22;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex = (Mutex) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        mutex.unlock(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                Mutex mutex2 = (Mutex) this.L$2;
                function2 = (Function2) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                writeMutex = mutex2;
                this.L$0 = writeMutex;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                Object objInvoke = function2.invoke(coroutineScope, this);
                if (objInvoke != coroutine_suspended) {
                    mutex = writeMutex;
                    obj = objInvoke;
                    mutex.unlock(null);
                    return obj;
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                mutex = writeMutex;
                th = th3;
                mutex.unlock(null);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> Object performWrite(Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C282972(function2, null), continuation);
    }

    /* compiled from: CrashStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lio/sentry/SentryEvent;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.sentry.CrashStoreIntegration$readAll$2", m3645f = "CrashStore.kt", m3646l = {97}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.sentry.CrashStoreIntegration$readAll$2 */
    static final class C282982 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends SentryEvent>>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C282982(Continuation<? super C282982> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C282982 c282982 = CrashStore2.this.new C282982(continuation);
            c282982.L$0 = obj;
            return c282982;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SentryEvent>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<SentryEvent>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<SentryEvent>> continuation) {
            return ((C282982) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
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
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List<Path> listListOrNull = CrashStore2.this.fileSystem.listOrNull(CrashStore2.this.eventsDirectory);
            if (listListOrNull == null) {
                listListOrNull = CollectionsKt.emptyList();
            }
            CrashStore2 crashStore2 = CrashStore2.this;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listListOrNull) {
                FileMetadata fileMetadataMetadataOrNull = crashStore2.fileSystem.metadataOrNull((Path) obj2);
                if (fileMetadataMetadataOrNull != null && fileMetadataMetadataOrNull.getIsRegularFile()) {
                    arrayList.add(obj2);
                }
            }
            CrashStore2 crashStore22 = CrashStore2.this;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CrashStore4(crashStore22, (Path) it.next(), null), 3, null));
            }
            this.label = 1;
            Object objAwaitAll = Await2.awaitAll(arrayList2, this);
            return objAwaitAll == coroutine_suspended ? coroutine_suspended : objAwaitAll;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readAll(Continuation<? super List<SentryEvent>> continuation) {
        return performRead(new C282982(null), continuation);
    }

    @Override // io.sentry.Integration
    public void register(IHub hub, final SentryOptions options) {
        Intrinsics.checkNotNullParameter(hub, "hub");
        Intrinsics.checkNotNullParameter(options, "options");
        SentryOptions2.addBeforeSendCallback(options, new SentryOptions.BeforeSendCallback() { // from class: com.robinhood.android.sentry.CrashStoreIntegration.register.1
            @Override // io.sentry.SentryOptions.BeforeSendCallback
            public final SentryEvent execute(SentryEvent event, Hint hint) throws IOException {
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(hint, "<unused var>");
                SentryId eventId = event.getEventId();
                if (eventId != null && event.isCrashed()) {
                    String string2 = eventId.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    Path pathResolve = CrashStore2.this.eventsDirectory.resolve(string2);
                    CrashStore2.this.fileSystem.createDirectories(CrashStore2.this.eventsDirectory);
                    ReentrantLock reentrantLock = CrashStore2.this.temporaryFileLock;
                    CrashStore2 crashStore2 = CrashStore2.this;
                    SentryOptions sentryOptions = options;
                    reentrantLock.lock();
                    try {
                        CrashStore2.INSTANCE.serialize(crashStore2.fileSystem, crashStore2.temporaryFile, event, sentryOptions.getMaxDepth());
                        crashStore2.fileSystem.mo11318atomicMove(crashStore2.temporaryFile, pathResolve);
                        Unit unit = Unit.INSTANCE;
                        reentrantLock.unlock();
                        if (!CrashStore2.this.invalidationTrigger.tryEmit(Unit.INSTANCE)) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return event;
            }
        });
    }

    /* compiled from: CrashStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.sentry.CrashStoreIntegration$discard$2", m3645f = "CrashStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.sentry.CrashStoreIntegration$discard$2 */
    static final class C282952 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SentryId $eventId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C282952(SentryId sentryId, Continuation<? super C282952> continuation) {
            super(2, continuation);
            this.$eventId = sentryId;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CrashStore2.this.new C282952(this.$eventId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C282952) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                FileSystem fileSystem = CrashStore2.this.fileSystem;
                Path path = CrashStore2.this.eventsDirectory;
                String string2 = this.$eventId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                fileSystem.delete(path.resolve(string2));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.android.sentry.CrashStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object discard(SentryId sentryId, Continuation<? super Unit> continuation) {
        C282941 c282941;
        if (continuation instanceof C282941) {
            c282941 = (C282941) continuation;
            int i = c282941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c282941.label = i - Integer.MIN_VALUE;
            } else {
                c282941 = new C282941(continuation);
            }
        }
        Object obj = c282941.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c282941.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            C282952 c282952 = new C282952(sentryId, null);
            c282941.label = 1;
            if (performWrite(c282952, c282941) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        SharedFlow2<Unit> sharedFlow2 = this.invalidationTrigger;
        Unit unit = Unit.INSTANCE;
        if (sharedFlow2.tryEmit(unit)) {
            return unit;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* compiled from: CrashStore.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u0002H\r\"\u0004\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\r0\u0012H\u0002¢\u0006\u0002\u0010\u0013J$\u0010\u0014\u001a\u00020\u0015*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/sentry/CrashStoreIntegration$Companion;", "", "<init>", "()V", "TEMP_FILE_NAME", "", "EVENTS_DIRECTORY_NAME", "logger", "Lio/sentry/android/core/AndroidLogger;", "getLogger$annotations", "eventDeserializer", "Lio/sentry/SentryEvent$Deserializer;", "deserialize", "T", "Lokio/FileSystem;", "path", "Lokio/Path;", "deserializer", "Lio/sentry/JsonDeserializer;", "(Lokio/FileSystem;Lokio/Path;Lio/sentry/JsonDeserializer;)Ljava/lang/Object;", "serialize", "", "value", "Lio/sentry/JsonSerializable;", "maxDepth", "", "lib-sentry_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.sentry.CrashStoreIntegration$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void getLogger$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> T deserialize(FileSystem fileSystem, Path path, JsonDeserializer<? extends T> jsonDeserializer) {
            InputStream inputStream = Okio.buffer(fileSystem.source(path)).inputStream();
            try {
                T t = (T) Serialization.decode(jsonDeserializer, inputStream, CrashStore2.logger);
                Closeable.closeFinally(inputStream, null);
                return t;
            } finally {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void serialize(FileSystem fileSystem, Path path, JsonSerializable jsonSerializable, int i) throws IOException {
            Path pathParent = path.parent();
            if (pathParent == null) {
                throw new IllegalStateException("Required value was null.");
            }
            fileSystem.createDirectories(pathParent);
            OutputStream outputStream = Okio.buffer(fileSystem.sink(path)).outputStream();
            try {
                Serialization.encode(jsonSerializable, outputStream, i, CrashStore2.logger);
                Unit unit = Unit.INSTANCE;
                Closeable.closeFinally(outputStream, null);
            } finally {
            }
        }
    }
}
