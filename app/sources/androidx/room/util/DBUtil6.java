package androidx.room.util;

import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.Transactor;
import androidx.room.Transactor3;
import androidx.room.coroutines.ConnectionPool3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: DBUtil.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"R", "Landroidx/room/Transactor;", "transactor", "<anonymous>"}, m3637k = 3, m3638mv = {2, 0, 0})
@DebugMetadata(m3644c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1", m3645f = "DBUtil.android.kt", m3646l = {56, 57, 59, 60}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1, reason: use source file name */
/* loaded from: classes4.dex */
public final class DBUtil6<R> extends ContinuationImpl7 implements Function2<Transactor, Continuation<? super R>, Object> {
    final /* synthetic */ Function1 $block$inlined;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    final /* synthetic */ RoomDatabase $this_internalPerform;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil6(boolean z, boolean z2, RoomDatabase roomDatabase, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.$inTransaction = z;
        this.$isReadOnly = z2;
        this.$this_internalPerform = roomDatabase;
        this.$block$inlined = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DBUtil6 dBUtil6 = new DBUtil6(this.$inTransaction, this.$isReadOnly, this.$this_internalPerform, continuation, this.$block$inlined);
        dBUtil6.L$0 = obj;
        return dBUtil6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Transactor transactor, Continuation<? super R> continuation) {
        return ((DBUtil6) create(transactor, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[PHI: r1 r8
      0x00a2: PHI (r1v11 androidx.room.Transactor) = (r1v8 androidx.room.Transactor), (r1v18 androidx.room.Transactor) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Transactor.SQLiteTransactionType sQLiteTransactionType;
        Transactor transactor;
        Transactor transactor2;
        Transactor.SQLiteTransactionType sQLiteTransactionType2;
        Transactor transactor3;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Transactor transactor4 = (Transactor) this.L$0;
            if (this.$inTransaction) {
                boolean z = this.$isReadOnly;
                if (z) {
                    sQLiteTransactionType = Transactor.SQLiteTransactionType.DEFERRED;
                } else {
                    sQLiteTransactionType = Transactor.SQLiteTransactionType.IMMEDIATE;
                }
                if (!z) {
                    this.L$0 = transactor4;
                    this.L$1 = sQLiteTransactionType;
                    this.label = 1;
                    Object objInTransaction = transactor4.inTransaction(this);
                    if (objInTransaction != coroutine_suspended) {
                        transactor2 = transactor4;
                        obj = objInTransaction;
                        sQLiteTransactionType2 = sQLiteTransactionType;
                    }
                    return coroutine_suspended;
                }
                transactor = transactor4;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.$block$inlined);
                this.L$0 = transactor;
                this.L$1 = null;
                this.label = 3;
                obj = transactor.withTransaction(sQLiteTransactionType, anonymousClass1, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            Intrinsics.checkNotNull(transactor4, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
            return this.$block$inlined.invoke(((ConnectionPool3) transactor4).getRawConnection());
        }
        if (i != 1) {
            if (i == 2) {
                sQLiteTransactionType2 = (Transactor.SQLiteTransactionType) this.L$1;
                transactor3 = (Transactor) this.L$0;
                ResultKt.throwOnFailure(obj);
                sQLiteTransactionType = sQLiteTransactionType2;
                transactor = transactor3;
                AnonymousClass1 anonymousClass12 = new AnonymousClass1(null, this.$block$inlined);
                this.L$0 = transactor;
                this.L$1 = null;
                this.label = 3;
                obj = transactor.withTransaction(sQLiteTransactionType, anonymousClass12, this);
                if (obj != coroutine_suspended) {
                    if (!this.$isReadOnly) {
                    }
                }
                return coroutine_suspended;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    this.$this_internalPerform.getInvalidationTracker().refreshAsync();
                }
                return obj2;
            }
            transactor = (Transactor) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (!this.$isReadOnly) {
                return obj;
            }
            this.L$0 = obj;
            this.label = 4;
            Object objInTransaction2 = transactor.inTransaction(this);
            if (objInTransaction2 != coroutine_suspended) {
                obj2 = obj;
                obj = objInTransaction2;
                if (!((Boolean) obj).booleanValue()) {
                }
                return obj2;
            }
            return coroutine_suspended;
        }
        sQLiteTransactionType2 = (Transactor.SQLiteTransactionType) this.L$1;
        transactor2 = (Transactor) this.L$0;
        ResultKt.throwOnFailure(obj);
        if (!((Boolean) obj).booleanValue()) {
            InvalidationTracker invalidationTracker = this.$this_internalPerform.getInvalidationTracker();
            this.L$0 = transactor2;
            this.L$1 = sQLiteTransactionType2;
            this.label = 2;
            if (invalidationTracker.sync$room_runtime_release(this) != coroutine_suspended) {
                transactor3 = transactor2;
                sQLiteTransactionType = sQLiteTransactionType2;
                transactor = transactor3;
                AnonymousClass1 anonymousClass122 = new AnonymousClass1(null, this.$block$inlined);
                this.L$0 = transactor;
                this.L$1 = null;
                this.label = 3;
                obj = transactor.withTransaction(sQLiteTransactionType, anonymousClass122, this);
                if (obj != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        sQLiteTransactionType = sQLiteTransactionType2;
        transactor = transactor2;
        AnonymousClass1 anonymousClass1222 = new AnonymousClass1(null, this.$block$inlined);
        this.L$0 = transactor;
        this.L$1 = null;
        this.label = 3;
        obj = transactor.withTransaction(sQLiteTransactionType, anonymousClass1222, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* compiled from: DBUtil.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, m3636d2 = {"R", "Landroidx/room/TransactionScope;", "<anonymous>"}, m3637k = 3, m3638mv = {2, 0, 0})
    @DebugMetadata(m3644c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1", m3645f = "DBUtil.android.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Transactor3<R>, Continuation<? super R>, Object> {
        final /* synthetic */ Function1 $block$inlined;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, Function1 function1) {
            super(2, continuation);
            this.$block$inlined = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.$block$inlined);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Transactor3<R> transactor3, Continuation<? super R> continuation) {
            return ((AnonymousClass1) create(transactor3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Transactor3 transactor3 = (Transactor3) this.L$0;
            Intrinsics.checkNotNull(transactor3, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
            return this.$block$inlined.invoke(((ConnectionPool3) transactor3).getRawConnection());
        }
    }
}
