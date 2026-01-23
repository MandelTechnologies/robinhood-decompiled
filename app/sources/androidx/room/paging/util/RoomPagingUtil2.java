package androidx.room.paging.util;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomRawQuery;
import androidx.room.Transactor;
import androidx.room.paging.util.RoomPagingUtil2;
import androidx.sqlite.SQLiteStatement;
import com.plaid.internal.EnumC7081g;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RoomPagingUtil.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0007\u001a&\u0010\u0006\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001ar\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\n0\t\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00012.\u0010\u000e\u001a*\b\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000fH\u0087@¢\u0006\u0002\u0010\u0012\u001a\u001e\u0010\u0013\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0087@¢\u0006\u0002\u0010\u0016\u001a)\u0010\u0017\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\n*\u00020\u000b*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\n0\u0018H\u0007¢\u0006\u0002\u0010\u0019\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"INITIAL_ITEM_COUNT", "", "getLimit", "params", "Landroidx/paging/PagingSource$LoadParams;", "key", "getOffset", "itemCount", "queryDatabase", "Landroidx/paging/PagingSource$LoadResult;", "Value", "", "sourceQuery", "Landroidx/room/RoomRawQuery;", "convertRows", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/paging/PagingSource$LoadParams;Landroidx/room/RoomRawQuery;ILkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryItemCount", "db", "Landroidx/room/RoomDatabase;", "(Landroidx/room/RoomRawQuery;Landroidx/room/RoomDatabase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getClippedRefreshKey", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "room-paging_release"}, m3637k = 5, m3638mv = {2, 0, 0}, m3640xi = 48, m3641xs = "androidx/room/paging/util/RoomPagingUtil")
/* renamed from: androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt, reason: use source file name */
/* loaded from: classes4.dex */
final /* synthetic */ class RoomPagingUtil2 {

    /* compiled from: RoomPagingUtil.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt", m3645f = "RoomPagingUtil.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m3647m = "queryDatabase")
    /* renamed from: androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1 */
    static final class C29191<Value> extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        int label;
        /* synthetic */ Object result;

        C29191(Continuation<? super C29191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomPagingUtil.queryDatabase(null, null, 0, null, this);
        }
    }

    public static final int getLimit(PagingSource.LoadParams<Integer> params, int i) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params instanceof PagingSource.LoadParams.Prepend) {
            PagingSource.LoadParams.Prepend prepend = (PagingSource.LoadParams.Prepend) params;
            return i < prepend.getLoadSize() ? i : prepend.getLoadSize();
        }
        return params.getLoadSize();
    }

    public static final int getOffset(PagingSource.LoadParams<Integer> params, int i, int i2) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params instanceof PagingSource.LoadParams.Prepend) {
            PagingSource.LoadParams.Prepend prepend = (PagingSource.LoadParams.Prepend) params;
            if (i < prepend.getLoadSize()) {
                return 0;
            }
            return i - prepend.getLoadSize();
        }
        if (params instanceof PagingSource.LoadParams.Append) {
            return i;
        }
        if (!(params instanceof PagingSource.LoadParams.Refresh)) {
            throw new NoWhenBranchMatchedException();
        }
        PagingSource.LoadParams.Refresh refresh = (PagingSource.LoadParams.Refresh) params;
        return i >= i2 - refresh.getLoadSize() ? Math.max(0, i2 - refresh.getLoadSize()) : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <Value> Object queryDatabase(PagingSource.LoadParams<Integer> loadParams, RoomRawQuery roomRawQuery, int i, Function3<? super RoomRawQuery, ? super Integer, ? super Continuation<? super List<? extends Value>>, ? extends Object> function3, Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
        C29191 c29191;
        int offset;
        int i2;
        if (continuation instanceof C29191) {
            c29191 = (C29191) continuation;
            int i3 = c29191.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c29191.label = i3 - Integer.MIN_VALUE;
            } else {
                c29191 = new C29191(continuation);
            }
        }
        Object objInvoke = c29191.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c29191.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Integer key = loadParams.getKey();
            int iIntValue = key != null ? key.intValue() : 0;
            int limit = RoomPagingUtil.getLimit(loadParams, iIntValue);
            offset = RoomPagingUtil.getOffset(loadParams, iIntValue, i);
            int i5 = limit + offset > i ? i - offset : limit;
            RoomRawQuery roomRawQuery2 = new RoomRawQuery("SELECT * FROM ( " + roomRawQuery.getSql() + " ) LIMIT " + limit + " OFFSET " + offset, roomRawQuery.getBindingFunction());
            Integer numBoxInt = boxing.boxInt(i5);
            c29191.I$0 = i;
            c29191.I$1 = limit;
            c29191.I$2 = offset;
            c29191.label = 1;
            objInvoke = function3.invoke(roomRawQuery2, numBoxInt, c29191);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            i2 = limit;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            offset = c29191.I$2;
            i2 = c29191.I$1;
            i = c29191.I$0;
            ResultKt.throwOnFailure(objInvoke);
        }
        int i6 = offset;
        List list = (List) objInvoke;
        int size = list.size() + i6;
        Integer numBoxInt2 = null;
        Integer numBoxInt3 = (list.isEmpty() || list.size() < i2 || size >= i) ? null : boxing.boxInt(size);
        if (i6 > 0 && !list.isEmpty()) {
            numBoxInt2 = boxing.boxInt(i6);
        }
        return new PagingSource.LoadResult.Page(list, numBoxInt2, numBoxInt3, i6, Math.max(0, i - size));
    }

    /* compiled from: RoomPagingUtil.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "connection", "Landroidx/room/Transactor;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2", m3645f = "RoomPagingUtil.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2 */
    static final class C29202 extends ContinuationImpl7 implements Function2<Transactor, Continuation<? super Integer>, Object> {
        final /* synthetic */ String $countQuery;
        final /* synthetic */ RoomRawQuery $sourceQuery;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C29202(String str, RoomRawQuery roomRawQuery, Continuation<? super C29202> continuation) {
            super(2, continuation);
            this.$countQuery = str;
            this.$sourceQuery = roomRawQuery;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C29202 c29202 = new C29202(this.$countQuery, this.$sourceQuery, continuation);
            c29202.L$0 = obj;
            return c29202;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Transactor transactor, Continuation<? super Integer> continuation) {
            return ((C29202) create(transactor, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Transactor transactor = (Transactor) this.L$0;
            String str = this.$countQuery;
            final RoomRawQuery roomRawQuery = this.$sourceQuery;
            Function1 function1 = new Function1() { // from class: androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Integer.valueOf(RoomPagingUtil2.C29202.invokeSuspend$lambda$0(roomRawQuery, (SQLiteStatement) obj2));
                }
            };
            this.label = 1;
            Object objUsePrepared = transactor.usePrepared(str, function1, this);
            return objUsePrepared == coroutine_suspended ? coroutine_suspended : objUsePrepared;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$0(RoomRawQuery roomRawQuery, SQLiteStatement sQLiteStatement) {
            roomRawQuery.getBindingFunction().invoke(sQLiteStatement);
            if (sQLiteStatement.step()) {
                return sQLiteStatement.getInt(0);
            }
            return 0;
        }
    }

    public static final Object queryItemCount(RoomRawQuery roomRawQuery, RoomDatabase roomDatabase, Continuation<? super Integer> continuation) {
        return RoomDatabaseKt.useReaderConnection(roomDatabase, new C29202("SELECT COUNT(*) FROM ( " + roomRawQuery.getSql() + " )", roomRawQuery, null), continuation);
    }

    public static final <Value> Integer getClippedRefreshKey(PagingState<Integer, Value> pagingState) {
        Intrinsics.checkNotNullParameter(pagingState, "<this>");
        Integer anchorPosition = pagingState.getAnchorPosition();
        if (anchorPosition != null) {
            return Integer.valueOf(Math.max(0, anchorPosition.intValue() - (pagingState.getConfig().initialLoadSize / 2)));
        }
        return null;
    }
}
