package androidx.room.coroutines;

import androidx.collection.CircularArray;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.plaid.internal.EnumC7081g;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Timeout4;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.Semaphore6;

/* compiled from: ConnectionPoolImpl.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u000bJ\u0019\u0010\u001c\u001a\u00020\t2\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010&\u001a\u00060$j\u0002`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001eR\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, m3636d2 = {"Landroidx/room/coroutines/Pool;", "", "", "capacity", "Lkotlin/Function0;", "Landroidx/sqlite/SQLiteConnection;", "connectionFactory", "<init>", "(ILkotlin/jvm/functions/Function0;)V", "", "tryOpenNewConnectionLocked", "()V", "Lkotlin/time/Duration;", "timeout", "onTimeout", "Landroidx/room/coroutines/ConnectionWithLock;", "acquireWithTimeout-KLykuaI", "(JLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireWithTimeout", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connection", "recycle", "(Landroidx/room/coroutines/ConnectionWithLock;)V", "close", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "dump", "(Ljava/lang/StringBuilder;)V", "I", "getCapacity", "()I", "Lkotlin/jvm/functions/Function0;", "getConnectionFactory", "()Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "size", "", "isClosed", "Z", "", "connections", "[Landroidx/room/coroutines/ConnectionWithLock;", "Lkotlinx/coroutines/sync/Semaphore;", "connectionPermits", "Lkotlinx/coroutines/sync/Semaphore;", "Landroidx/collection/CircularArray;", "availableConnections", "Landroidx/collection/CircularArray;", "room-runtime_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.room.coroutines.Pool, reason: use source file name */
/* loaded from: classes4.dex */
final class ConnectionPoolImpl4 {
    private final CircularArray<ConnectionPoolImpl3> availableConnections;
    private final int capacity;
    private final Function0<SQLiteConnection> connectionFactory;
    private final Semaphore connectionPermits;
    private final ConnectionPoolImpl3[] connections;
    private boolean isClosed;
    private final ReentrantLock lock;
    private int size;

    /* compiled from: ConnectionPoolImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.room.coroutines.Pool", m3645f = "ConnectionPoolImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE}, m3647m = "acquire")
    /* renamed from: androidx.room.coroutines.Pool$acquire$1 */
    static final class C29051 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C29051(Continuation<? super C29051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionPoolImpl4.this.acquire(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionPoolImpl4(int i, Function0<? extends SQLiteConnection> connectionFactory) {
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.capacity = i;
        this.connectionFactory = connectionFactory;
        this.lock = new ReentrantLock();
        this.connections = new ConnectionPoolImpl3[i];
        this.connectionPermits = Semaphore6.Semaphore$default(i, 0, 2, null);
        this.availableConnections = new CircularArray<>(i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:47|28|(1:(1:38)(2:34|(1:36)))(1:30)|37|19|43|20|(1:22)(10:23|24|47|28|(0)(0)|37|19|43|20|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r12 = r12;
        r11 = r11;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x007a, TryCatch #2 {all -> 0x007a, blocks: (B:28:0x0072, B:30:0x0076, B:34:0x007e, B:38:0x0085), top: B:47:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0061 -> B:24:0x0063). Please report as a decompilation issue!!! */
    /* renamed from: acquireWithTimeout-KLykuaI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8347acquireWithTimeoutKLykuaI(long j, Function0<Unit> function0, Continuation<? super ConnectionPoolImpl3> continuation) {
        ConnectionPoolImpl5 connectionPoolImpl5;
        ConnectionPoolImpl4 connectionPoolImpl4;
        Ref.ObjectRef objectRef;
        ConnectionPoolImpl5 connectionPoolImpl52;
        Throwable th;
        ConnectionPoolImpl6 connectionPoolImpl6;
        if (continuation instanceof ConnectionPoolImpl5) {
            connectionPoolImpl5 = (ConnectionPoolImpl5) continuation;
            int i = connectionPoolImpl5.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                connectionPoolImpl5.label = i - Integer.MIN_VALUE;
            } else {
                connectionPoolImpl5 = new ConnectionPoolImpl5(this, continuation);
            }
        }
        Object obj = connectionPoolImpl5.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = connectionPoolImpl5.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            connectionPoolImpl4 = this;
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            connectionPoolImpl6 = new ConnectionPoolImpl6(objectRef2, connectionPoolImpl4, null);
            connectionPoolImpl5.L$0 = connectionPoolImpl4;
            connectionPoolImpl5.L$1 = function0;
            connectionPoolImpl5.L$2 = objectRef2;
            connectionPoolImpl5.J$0 = j;
            connectionPoolImpl5.label = 1;
            if (Timeout6.m28789withTimeoutKLykuaI(j, connectionPoolImpl6, connectionPoolImpl5) == coroutine_suspended) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = connectionPoolImpl5.J$0;
            Ref.ObjectRef objectRef3 = (Ref.ObjectRef) connectionPoolImpl5.L$2;
            Function0<Unit> function02 = (Function0) connectionPoolImpl5.L$1;
            connectionPoolImpl4 = (ConnectionPoolImpl4) connectionPoolImpl5.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                objectRef = objectRef3;
                function0 = function02;
                connectionPoolImpl52 = connectionPoolImpl5;
                th = th2;
            }
            objectRef = objectRef3;
            function0 = function02;
            connectionPoolImpl52 = connectionPoolImpl5;
            th = null;
            try {
                if (th instanceof Timeout4) {
                    function0.invoke();
                } else {
                    if (th != null) {
                        throw th;
                    }
                    T t = objectRef.element;
                    if (t != 0) {
                        return t;
                    }
                }
                connectionPoolImpl5 = connectionPoolImpl52;
                Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
                connectionPoolImpl6 = new ConnectionPoolImpl6(objectRef22, connectionPoolImpl4, null);
                connectionPoolImpl5.L$0 = connectionPoolImpl4;
                connectionPoolImpl5.L$1 = function0;
                connectionPoolImpl5.L$2 = objectRef22;
                connectionPoolImpl5.J$0 = j;
                connectionPoolImpl5.label = 1;
                if (Timeout6.m28789withTimeoutKLykuaI(j, connectionPoolImpl6, connectionPoolImpl5) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function02 = function0;
                objectRef3 = objectRef22;
                objectRef = objectRef3;
                function0 = function02;
                connectionPoolImpl52 = connectionPoolImpl5;
                th = null;
                if (th instanceof Timeout4) {
                }
                connectionPoolImpl5 = connectionPoolImpl52;
                Ref.ObjectRef objectRef222 = new Ref.ObjectRef();
                connectionPoolImpl6 = new ConnectionPoolImpl6(objectRef222, connectionPoolImpl4, null);
                connectionPoolImpl5.L$0 = connectionPoolImpl4;
                connectionPoolImpl5.L$1 = function0;
                connectionPoolImpl5.L$2 = objectRef222;
                connectionPoolImpl5.J$0 = j;
                connectionPoolImpl5.label = 1;
                if (Timeout6.m28789withTimeoutKLykuaI(j, connectionPoolImpl6, connectionPoolImpl5) == coroutine_suspended) {
                }
            } catch (Throwable th3) {
                ConnectionPoolImpl3 connectionPoolImpl3 = (ConnectionPoolImpl3) objectRef.element;
                if (connectionPoolImpl3 != null) {
                    connectionPoolImpl4.recycle(connectionPoolImpl3);
                }
                throw th3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object acquire(Continuation<? super ConnectionPoolImpl3> continuation) {
        C29051 c29051;
        ConnectionPoolImpl4 connectionPoolImpl4;
        if (continuation instanceof C29051) {
            c29051 = (C29051) continuation;
            int i = c29051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29051.label = i - Integer.MIN_VALUE;
            } else {
                c29051 = new C29051(continuation);
            }
        }
        Object obj = c29051.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c29051.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Semaphore semaphore = this.connectionPermits;
            c29051.L$0 = this;
            c29051.label = 1;
            if (semaphore.acquire(c29051) == coroutine_suspended) {
                return coroutine_suspended;
            }
            connectionPoolImpl4 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            connectionPoolImpl4 = (ConnectionPoolImpl4) c29051.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            ReentrantLock reentrantLock = connectionPoolImpl4.lock;
            reentrantLock.lock();
            try {
                if (connectionPoolImpl4.isClosed) {
                    SQLite.throwSQLiteException(21, "Connection pool is closed");
                    throw new ExceptionsH();
                }
                if (connectionPoolImpl4.availableConnections.isEmpty()) {
                    connectionPoolImpl4.tryOpenNewConnectionLocked();
                }
                ConnectionPoolImpl3 connectionPoolImpl3PopFirst = connectionPoolImpl4.availableConnections.popFirst();
                reentrantLock.unlock();
                return connectionPoolImpl3PopFirst;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            connectionPoolImpl4.connectionPermits.release();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void tryOpenNewConnectionLocked() {
        if (this.size >= this.capacity) {
            return;
        }
        ConnectionPoolImpl3 connectionPoolImpl3 = new ConnectionPoolImpl3(this.connectionFactory.invoke(), null, 2, 0 == true ? 1 : 0);
        ConnectionPoolImpl3[] connectionPoolImpl3Arr = this.connections;
        int i = this.size;
        this.size = i + 1;
        connectionPoolImpl3Arr[i] = connectionPoolImpl3;
        this.availableConnections.addLast(connectionPoolImpl3);
    }

    public final void recycle(ConnectionPoolImpl3 connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.availableConnections.addLast(connection);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            this.connectionPermits.release();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void close() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isClosed = true;
            for (ConnectionPoolImpl3 connectionPoolImpl3 : this.connections) {
                if (connectionPoolImpl3 != null) {
                    connectionPoolImpl3.close();
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void dump(StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            int size = this.availableConnections.size();
            for (int i = 0; i < size; i++) {
                listCreateListBuilder.add(this.availableConnections.get(i));
            }
            List listBuild = CollectionsKt.build(listCreateListBuilder);
            builder.append('\t' + super.toString() + " (");
            builder.append("capacity=" + this.capacity + ", ");
            builder.append("permits=" + this.connectionPermits.getAvailablePermits() + ", ");
            builder.append("queue=(size=" + listBuild.size() + ")[" + CollectionsKt.joinToString$default(listBuild, null, null, null, 0, null, null, 63, null) + "], ");
            builder.append(")");
            builder.append('\n');
            ConnectionPoolImpl3[] connectionPoolImpl3Arr = this.connections;
            int length = connectionPoolImpl3Arr.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                ConnectionPoolImpl3 connectionPoolImpl3 = connectionPoolImpl3Arr[i3];
                i2++;
                StringBuilder sb = new StringBuilder();
                sb.append("\t\t[");
                sb.append(i2);
                sb.append("] - ");
                sb.append(connectionPoolImpl3 != null ? connectionPoolImpl3.toString() : null);
                builder.append(sb.toString());
                builder.append('\n');
                if (connectionPoolImpl3 != null) {
                    connectionPoolImpl3.dump(builder);
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
