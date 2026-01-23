package androidx.room.coroutines;

import android.database.SQLException;
import androidx.room.Transactor;
import androidx.room.concurrent.ThreadLocal_jvmAndroidKt;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import com.plaid.internal.EnumC7081g;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ExceptionsH;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConnectionPoolImpl.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00112\"\u0010\u001b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0017H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R$\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\f0%j\b\u0012\u0004\u0012\u00020\f`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010+\u001a\u00060)j\u0002`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00104\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\u0015R\u0014\u00109\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u00107¨\u0006:"}, m3636d2 = {"Landroidx/room/coroutines/ConnectionPoolImpl;", "Landroidx/room/coroutines/ConnectionPool;", "Landroidx/sqlite/SQLiteDriver;", "driver", "", "fileName", "<init>", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;)V", "", "maxNumOfReaders", "maxNumOfWriters", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;II)V", "Landroidx/room/coroutines/PooledConnectionImpl;", "connection", "Lkotlin/coroutines/CoroutineContext;", "createConnectionContext", "(Landroidx/room/coroutines/PooledConnectionImpl;)Lkotlin/coroutines/CoroutineContext;", "", "isReadOnly", "", "onTimeout", "(Z)V", "R", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "", "block", "useConnection", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "Landroidx/sqlite/SQLiteDriver;", "Landroidx/room/coroutines/Pool;", "readers", "Landroidx/room/coroutines/Pool;", "writers", "Ljava/lang/ThreadLocal;", "Landroidx/room/concurrent/ThreadLocal;", "threadLocal", "Ljava/lang/ThreadLocal;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "_isClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/time/Duration;", "timeout", "J", "getTimeout-UwyO8pc$room_runtime_release", "()J", "setTimeout-LRDsOJo$room_runtime_release", "(J)V", "throwOnTimeout", "Z", "getThrowOnTimeout$room_runtime_release", "()Z", "setThrowOnTimeout$room_runtime_release", "isClosed", "room-runtime_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ConnectionPoolImpl implements ConnectionPool {
    private final AtomicBoolean _isClosed;
    private final SQLiteDriver driver;
    private final ConnectionPoolImpl4 readers;
    private final ThreadLocal<ConnectionPoolImpl7> threadLocal;
    private boolean throwOnTimeout;
    private long timeout;
    private final ConnectionPoolImpl4 writers;

    /* compiled from: ConnectionPoolImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.room.coroutines.ConnectionPoolImpl", m3645f = "ConnectionPoolImpl.kt", m3646l = {116, 120, EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "useConnection")
    /* renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$1 */
    static final class C29011<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C29011(Continuation<? super C29011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionPoolImpl.this.useConnection(false, null, this);
        }
    }

    private final boolean isClosed() {
        return this._isClosed.get();
    }

    public ConnectionPoolImpl(final SQLiteDriver driver, final String fileName) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.threadLocal = new ThreadLocal<>();
        this._isClosed = new AtomicBoolean(false);
        Duration.Companion companion = Duration.INSTANCE;
        this.timeout = Duration3.toDuration(30, DurationUnitJvm.SECONDS);
        this.driver = driver;
        ConnectionPoolImpl4 connectionPoolImpl4 = new ConnectionPoolImpl4(1, new Function0() { // from class: androidx.room.coroutines.ConnectionPoolImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return driver.open(fileName);
            }
        });
        this.readers = connectionPoolImpl4;
        this.writers = connectionPoolImpl4;
    }

    public ConnectionPoolImpl(final SQLiteDriver driver, final String fileName, int i, int i2) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.threadLocal = new ThreadLocal<>();
        this._isClosed = new AtomicBoolean(false);
        Duration.Companion companion = Duration.INSTANCE;
        this.timeout = Duration3.toDuration(30, DurationUnitJvm.SECONDS);
        if (i <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("Maximum number of writers must be greater than 0");
        }
        this.driver = driver;
        this.readers = new ConnectionPoolImpl4(i, new Function0() { // from class: androidx.room.coroutines.ConnectionPoolImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConnectionPoolImpl._init_$lambda$4(driver, fileName);
            }
        });
        this.writers = new ConnectionPoolImpl4(i2, new Function0() { // from class: androidx.room.coroutines.ConnectionPoolImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return driver.open(fileName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteConnection _init_$lambda$4(SQLiteDriver sQLiteDriver, String str) {
        SQLiteConnection sQLiteConnectionOpen = sQLiteDriver.open(str);
        SQLite.execSQL(sQLiteConnectionOpen, "PRAGMA query_only = 1");
        return sQLiteConnectionOpen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012c A[Catch: all -> 0x0167, TRY_LEAVE, TryCatch #2 {all -> 0x0167, blocks: (B:63:0x0111, B:68:0x0121, B:70:0x012c, B:80:0x016c, B:81:0x0173, B:59:0x00ec), top: B:98:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0155 A[Catch: all -> 0x0166, TRY_LEAVE, TryCatch #1 {all -> 0x0166, blocks: (B:74:0x014f, B:76:0x0155), top: B:96:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016c A[Catch: all -> 0x0167, TRY_ENTER, TryCatch #2 {all -> 0x0167, blocks: (B:63:0x0111, B:68:0x0121, B:70:0x012c, B:80:0x016c, B:81:0x0173, B:59:0x00ec), top: B:98:0x00ec }] */
    /* JADX WARN: Type inference failed for: r13v14, types: [T, androidx.room.coroutines.PooledConnectionImpl] */
    @Override // androidx.room.coroutines.ConnectionPool
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <R> Object useConnection(final boolean z, Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        C29011 c29011;
        ConnectionPoolImpl4 connectionPoolImpl4;
        Ref.ObjectRef objectRef;
        ConnectionPoolImpl4 connectionPoolImpl42;
        Throwable th;
        Ref.ObjectRef objectRef2;
        CoroutineContext coroutineContext;
        Object objM8347acquireWithTimeoutKLykuaI;
        ConnectionPoolImpl connectionPoolImpl;
        Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function22;
        Ref.ObjectRef objectRef3;
        T t;
        ConnectionPoolImpl7 connectionPoolImpl7;
        if (continuation instanceof C29011) {
            c29011 = (C29011) continuation;
            int i = c29011.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29011.label = i - Integer.MIN_VALUE;
            } else {
                c29011 = new C29011(continuation);
            }
        }
        Object obj = c29011.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29011.label;
        boolean z2 = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (isClosed()) {
                SQLite.throwSQLiteException(21, "Connection pool is closed");
                throw new ExceptionsH();
            }
            ConnectionPoolImpl7 connectionWrapper = this.threadLocal.get();
            if (connectionWrapper == null) {
                ConnectionPoolImpl2 connectionPoolImpl2 = (ConnectionPoolImpl2) c29011.get$context().get(ConnectionPoolImpl2.INSTANCE);
                connectionWrapper = connectionPoolImpl2 != null ? connectionPoolImpl2.getConnectionWrapper() : null;
            }
            if (connectionWrapper != null) {
                if (!z && connectionWrapper.getIsReadOnly()) {
                    SQLite.throwSQLiteException(1, "Cannot upgrade connection from reader to writer");
                    throw new ExceptionsH();
                }
                if (c29011.get$context().get(ConnectionPoolImpl2.INSTANCE) == null) {
                    CoroutineContext coroutineContextCreateConnectionContext = createConnectionContext(connectionWrapper);
                    C29022 c29022 = new C29022(function2, connectionWrapper, null);
                    c29011.label = 1;
                    Object objWithContext = BuildersKt.withContext(coroutineContextCreateConnectionContext, c29022, c29011);
                    if (objWithContext != coroutine_suspended) {
                        return objWithContext;
                    }
                } else {
                    c29011.label = 2;
                    Object objInvoke = function2.invoke(connectionWrapper, c29011);
                    if (objInvoke != coroutine_suspended) {
                        return objInvoke;
                    }
                }
            } else {
                if (z) {
                    connectionPoolImpl4 = this.readers;
                } else {
                    connectionPoolImpl4 = this.writers;
                }
                objectRef = new Ref.ObjectRef();
                try {
                    coroutineContext = c29011.get$context();
                    long j = this.timeout;
                    Function0<Unit> function0 = new Function0() { // from class: androidx.room.coroutines.ConnectionPoolImpl$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConnectionPoolImpl.useConnection$lambda$6(this.f$0, z);
                        }
                    };
                    c29011.L$0 = this;
                    c29011.L$1 = function2;
                    c29011.L$2 = connectionPoolImpl4;
                    c29011.L$3 = objectRef;
                    c29011.L$4 = coroutineContext;
                    c29011.L$5 = objectRef;
                    c29011.Z$0 = z;
                    c29011.label = 3;
                    objM8347acquireWithTimeoutKLykuaI = connectionPoolImpl4.m8347acquireWithTimeoutKLykuaI(j, function0, c29011);
                    if (objM8347acquireWithTimeoutKLykuaI != coroutine_suspended) {
                        connectionPoolImpl = this;
                        function22 = function2;
                        objectRef3 = objectRef;
                        ConnectionPoolImpl3 connectionPoolImpl3MarkAcquired = ((ConnectionPoolImpl3) objM8347acquireWithTimeoutKLykuaI).markAcquired(coroutineContext);
                        if (connectionPoolImpl.readers != connectionPoolImpl.writers) {
                        }
                        z2 = false;
                        objectRef3.element = new ConnectionPoolImpl7(connectionPoolImpl3MarkAcquired, z2);
                        t = objectRef.element;
                        if (t != 0) {
                        }
                    }
                } catch (Throwable th2) {
                    connectionPoolImpl42 = connectionPoolImpl4;
                    th = th2;
                    objectRef2 = objectRef;
                }
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        if (i2 == 2) {
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        if (i2 == 3) {
            z = c29011.Z$0;
            objectRef3 = (Ref.ObjectRef) c29011.L$5;
            CoroutineContext coroutineContext2 = (CoroutineContext) c29011.L$4;
            Ref.ObjectRef objectRef4 = (Ref.ObjectRef) c29011.L$3;
            ConnectionPoolImpl4 connectionPoolImpl43 = (ConnectionPoolImpl4) c29011.L$2;
            function22 = (Function2) c29011.L$1;
            connectionPoolImpl = (ConnectionPoolImpl) c29011.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                objM8347acquireWithTimeoutKLykuaI = obj;
                connectionPoolImpl4 = connectionPoolImpl43;
                coroutineContext = coroutineContext2;
                objectRef = objectRef4;
                ConnectionPoolImpl3 connectionPoolImpl3MarkAcquired2 = ((ConnectionPoolImpl3) objM8347acquireWithTimeoutKLykuaI).markAcquired(coroutineContext);
                if (connectionPoolImpl.readers != connectionPoolImpl.writers || !z) {
                    z2 = false;
                }
                objectRef3.element = new ConnectionPoolImpl7(connectionPoolImpl3MarkAcquired2, z2);
                t = objectRef.element;
                if (t != 0) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                CoroutineContext coroutineContextCreateConnectionContext2 = connectionPoolImpl.createConnectionContext((ConnectionPoolImpl7) t);
                C29034 c29034 = new C29034(function22, objectRef, null);
                c29011.L$0 = connectionPoolImpl4;
                c29011.L$1 = objectRef;
                c29011.L$2 = null;
                c29011.L$3 = null;
                c29011.L$4 = null;
                c29011.L$5 = null;
                c29011.label = 4;
                Object objWithContext2 = BuildersKt.withContext(coroutineContextCreateConnectionContext2, c29034, c29011);
                if (objWithContext2 != coroutine_suspended) {
                    connectionPoolImpl42 = connectionPoolImpl4;
                    obj = objWithContext2;
                    objectRef2 = objectRef;
                    connectionPoolImpl7 = (ConnectionPoolImpl7) objectRef2.element;
                    if (connectionPoolImpl7 != null) {
                    }
                    return obj;
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
                objectRef2 = objectRef4;
                connectionPoolImpl42 = connectionPoolImpl43;
            }
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef2 = (Ref.ObjectRef) c29011.L$1;
            connectionPoolImpl42 = (ConnectionPoolImpl4) c29011.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                try {
                    connectionPoolImpl7 = (ConnectionPoolImpl7) objectRef2.element;
                    if (connectionPoolImpl7 != null) {
                        connectionPoolImpl7.markRecycled();
                        connectionPoolImpl7.getDelegate().markReleased();
                        connectionPoolImpl42.recycle(connectionPoolImpl7.getDelegate());
                    }
                } catch (Throwable unused) {
                }
                return obj;
            } catch (Throwable th4) {
                th = th4;
            }
        }
        try {
            throw th;
        } catch (Throwable th5) {
            try {
                ConnectionPoolImpl7 connectionPoolImpl72 = (ConnectionPoolImpl7) objectRef2.element;
                if (connectionPoolImpl72 != null) {
                    connectionPoolImpl72.markRecycled();
                    connectionPoolImpl72.getDelegate().markReleased();
                    connectionPoolImpl42.recycle(connectionPoolImpl72.getDelegate());
                }
            } catch (Throwable th6) {
                ExceptionsKt.addSuppressed(th, th6);
            }
            throw th5;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: ConnectionPoolImpl.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", m3645f = "ConnectionPoolImpl.kt", m3646l = {117}, m3647m = "invokeSuspend")
    /* renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$2 */
    static final class C29022<R> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function2<Transactor, Continuation<? super R>, Object> $block;
        final /* synthetic */ ConnectionPoolImpl7 $confinedConnection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C29022(Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function2, ConnectionPoolImpl7 connectionPoolImpl7, Continuation<? super C29022> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.$confinedConnection = connectionPoolImpl7;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29022(this.$block, this.$confinedConnection, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((C29022) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Function2<Transactor, Continuation<? super R>, Object> function2 = this.$block;
            ConnectionPoolImpl7 connectionPoolImpl7 = this.$confinedConnection;
            this.label = 1;
            Object objInvoke = function2.invoke(connectionPoolImpl7, this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit useConnection$lambda$6(ConnectionPoolImpl connectionPoolImpl, boolean z) {
        connectionPoolImpl.onTimeout(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: ConnectionPoolImpl.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", m3645f = "ConnectionPoolImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: androidx.room.coroutines.ConnectionPoolImpl$useConnection$4 */
    static final class C29034<R> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function2<Transactor, Continuation<? super R>, Object> $block;
        final /* synthetic */ Ref.ObjectRef<ConnectionPoolImpl7> $connection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C29034(Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function2, Ref.ObjectRef<ConnectionPoolImpl7> objectRef, Continuation<? super C29034> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.$connection = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29034(this.$block, this.$connection, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((C29034) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Function2<Transactor, Continuation<? super R>, Object> function2 = this.$block;
            ConnectionPoolImpl7 connectionPoolImpl7 = this.$connection.element;
            this.label = 1;
            Object objInvoke = function2.invoke(connectionPoolImpl7, this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }
    }

    private final CoroutineContext createConnectionContext(ConnectionPoolImpl7 connection) {
        return new ConnectionPoolImpl2(connection).plus(ThreadLocal_jvmAndroidKt.asContextElement(this.threadLocal, connection));
    }

    private final void onTimeout(boolean isReadOnly) {
        String str = isReadOnly ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append('\n');
        sb.append('\n');
        sb.append("Writer pool:");
        sb.append('\n');
        this.writers.dump(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.readers.dump(sb);
        try {
            SQLite.throwSQLiteException(5, sb.toString());
            throw new ExceptionsH();
        } catch (SQLException e) {
            if (this.throwOnTimeout) {
                throw e;
            }
            e.printStackTrace();
        }
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
        if (this._isClosed.compareAndSet(false, true)) {
            this.readers.close();
            this.writers.close();
        }
    }
}
