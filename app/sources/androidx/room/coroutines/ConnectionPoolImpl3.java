package androidx.room.coroutines;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.Iterator;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: ConnectionPoolImpl.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u0004\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096A¢\u0006\u0004\b\u0004\u0010\u001eJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0001¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006-"}, m3636d2 = {"Landroidx/room/coroutines/ConnectionWithLock;", "Landroidx/sqlite/SQLiteConnection;", "Lkotlinx/coroutines/sync/Mutex;", "delegate", "lock", "<init>", "(Landroidx/sqlite/SQLiteConnection;Lkotlinx/coroutines/sync/Mutex;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "markAcquired", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/room/coroutines/ConnectionWithLock;", "markReleased", "()Landroidx/room/coroutines/ConnectionWithLock;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "dump", "(Ljava/lang/StringBuilder;)V", "", "toString", "()Ljava/lang/String;", "sql", "Landroidx/sqlite/SQLiteStatement;", "prepare", "(Ljava/lang/String;)Landroidx/sqlite/SQLiteStatement;", "close", "()V", "", "owner", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tryLock", "(Ljava/lang/Object;)Z", "unlock", "(Ljava/lang/Object;)V", "Landroidx/sqlite/SQLiteConnection;", "Lkotlinx/coroutines/sync/Mutex;", "acquireCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "", "acquireThrowable", "Ljava/lang/Throwable;", "isLocked", "()Z", "room-runtime_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.room.coroutines.ConnectionWithLock, reason: use source file name */
/* loaded from: classes4.dex */
final class ConnectionPoolImpl3 implements SQLiteConnection, Mutex {
    private CoroutineContext acquireCoroutineContext;
    private Throwable acquireThrowable;
    private final SQLiteConnection delegate;
    private final Mutex lock;

    @Override // androidx.sqlite.SQLiteConnection, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        return this.lock.isLocked();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public Object lock(Object obj, Continuation<? super Unit> continuation) {
        return this.lock.lock(obj, continuation);
    }

    @Override // androidx.sqlite.SQLiteConnection
    public SQLiteStatement prepare(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        return this.delegate.prepare(sql);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(Object owner) {
        return this.lock.tryLock(owner);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(Object owner) {
        this.lock.unlock(owner);
    }

    public ConnectionPoolImpl3(SQLiteConnection delegate, Mutex lock) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.delegate = delegate;
        this.lock = lock;
    }

    public /* synthetic */ ConnectionPoolImpl3(SQLiteConnection sQLiteConnection, Mutex mutex, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sQLiteConnection, (i & 2) != 0 ? Mutex3.Mutex$default(false, 1, null) : mutex);
    }

    public final ConnectionPoolImpl3 markAcquired(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.acquireCoroutineContext = context;
        this.acquireThrowable = new Throwable();
        return this;
    }

    public final ConnectionPoolImpl3 markReleased() {
        this.acquireCoroutineContext = null;
        this.acquireThrowable = null;
        return this;
    }

    public final void dump(StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (this.acquireCoroutineContext != null || this.acquireThrowable != null) {
            builder.append("\t\tStatus: Acquired connection");
            builder.append('\n');
            CoroutineContext coroutineContext = this.acquireCoroutineContext;
            if (coroutineContext != null) {
                builder.append("\t\tCoroutine: " + coroutineContext);
                builder.append('\n');
            }
            Throwable th = this.acquireThrowable;
            if (th != null) {
                builder.append("\t\tAcquired:");
                builder.append('\n');
                Iterator it = CollectionsKt.drop(StringsKt.lines(ExceptionsKt.stackTraceToString(th)), 1).iterator();
                while (it.hasNext()) {
                    builder.append("\t\t" + ((String) it.next()));
                    builder.append('\n');
                }
                return;
            }
            return;
        }
        builder.append("\t\tStatus: Free connection");
        builder.append('\n');
    }

    public String toString() {
        return this.delegate.toString();
    }
}
