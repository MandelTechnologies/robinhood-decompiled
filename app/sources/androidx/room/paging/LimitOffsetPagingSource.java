package androidx.room.paging;

import android.database.Cursor;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.room.paging.util.RoomPagingUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.p015db.SupportSQLiteQuery;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Standard2;
import kotlin.coroutines.Continuation;
import kotlin.jdk7.AutoCloseableJVM;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LimitOffsetPagingSource.android.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0004\b\f\u0010\rB-\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0004\b\f\u0010\u000fB-\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0004\b\f\u0010\u0012J(\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040#H\u0096@¢\u0006\u0002\u0010$J#\u0010%\u001a\u0004\u0018\u00010\u00042\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000'H\u0016¢\u0006\u0002\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000*2\u0006\u0010+\u001a\u00020,H\u0014J$\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000*2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0094@¢\u0006\u0002\u0010.R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, m3636d2 = {"Landroidx/room/paging/LimitOffsetPagingSource;", "Value", "", "Landroidx/paging/PagingSource;", "", "sourceQuery", "Landroidx/room/RoomRawQuery;", "db", "Landroidx/room/RoomDatabase;", "tables", "", "", "<init>", "(Landroidx/room/RoomRawQuery;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V", "Landroidx/room/RoomSQLiteQuery;", "(Landroidx/room/RoomSQLiteQuery;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V", "supportSQLiteQuery", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V", "getSourceQuery", "()Landroidx/room/RoomRawQuery;", "getDb", "()Landroidx/room/RoomDatabase;", "implementation", "Landroidx/room/paging/CommonLimitOffsetImpl;", "itemCount", "getItemCount", "()I", "jumpingSupported", "", "getJumpingSupported", "()Z", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "convertRows", "", "cursor", "Landroid/database/Cursor;", "limitOffsetQuery", "(Landroidx/room/RoomRawQuery;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-paging_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public abstract class LimitOffsetPagingSource<Value> extends PagingSource<Integer, Value> {
    private final RoomDatabase db;
    private final LimitOffsetPagingSource2<Value> implementation;
    private final RoomRawQuery sourceQuery;

    protected Object convertRows(RoomRawQuery roomRawQuery, int i, Continuation<? super List<? extends Value>> continuation) {
        return convertRows$suspendImpl(this, roomRawQuery, i, continuation);
    }

    @Override // androidx.paging.PagingSource
    public boolean getJumpingSupported() {
        return true;
    }

    @Override // androidx.paging.PagingSource
    public Object load(PagingSource.LoadParams<Integer> loadParams, Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
        return load$suspendImpl(this, loadParams, continuation);
    }

    public final RoomRawQuery getSourceQuery() {
        return this.sourceQuery;
    }

    public final RoomDatabase getDb() {
        return this.db;
    }

    public LimitOffsetPagingSource(RoomRawQuery sourceQuery, RoomDatabase db, String... tables) {
        Intrinsics.checkNotNullParameter(sourceQuery, "sourceQuery");
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tables, "tables");
        this.sourceQuery = sourceQuery;
        this.db = db;
        this.implementation = new LimitOffsetPagingSource2<>(tables, this, new LimitOffsetPagingSource$implementation$1(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LimitOffsetPagingSource(RoomSQLiteQuery sourceQuery, RoomDatabase db, String... tables) {
        this(sourceQuery.toRoomRawQuery(), db, (String[]) Arrays.copyOf(tables, tables.length));
        Intrinsics.checkNotNullParameter(sourceQuery, "sourceQuery");
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tables, "tables");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LimitOffsetPagingSource(SupportSQLiteQuery supportSQLiteQuery, RoomDatabase db, String... tables) {
        this(RoomSQLiteQuery.INSTANCE.copyFrom(supportSQLiteQuery).toRoomRawQuery(), db, (String[]) Arrays.copyOf(tables, tables.length));
        Intrinsics.checkNotNullParameter(supportSQLiteQuery, "supportSQLiteQuery");
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tables, "tables");
    }

    public final int getItemCount() {
        return this.implementation.getItemCount().get();
    }

    static /* synthetic */ <Value> Object load$suspendImpl(LimitOffsetPagingSource<Value> limitOffsetPagingSource, PagingSource.LoadParams<Integer> loadParams, Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
        return ((LimitOffsetPagingSource) limitOffsetPagingSource).implementation.load(loadParams, continuation);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.PagingSource
    public Integer getRefreshKey(PagingState<Integer, Value> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return RoomPagingUtil.getClippedRefreshKey(state);
    }

    protected List<Value> convertRows(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        throw new Standard2("Unexpected call to a function with no implementation that Room is suppose to generate. Please file a bug at: https://issuetracker.google.com/issues/new?component=413107&template=1096568.");
    }

    static /* synthetic */ <Value> Object convertRows$suspendImpl(final LimitOffsetPagingSource<Value> limitOffsetPagingSource, final RoomRawQuery roomRawQuery, final int i, Continuation<? super List<? extends Value>> continuation) {
        return DBUtil.performSuspending(((LimitOffsetPagingSource) limitOffsetPagingSource).db, true, false, new Function1() { // from class: androidx.room.paging.LimitOffsetPagingSource$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LimitOffsetPagingSource.convertRows$lambda$1(roomRawQuery, limitOffsetPagingSource, i, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List convertRows$lambda$1(RoomRawQuery roomRawQuery, LimitOffsetPagingSource limitOffsetPagingSource, int i, SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(roomRawQuery.getSql());
        try {
            roomRawQuery.getBindingFunction().invoke(sQLiteStatementPrepare);
            List<Value> listConvertRows = limitOffsetPagingSource.convertRows(new SQLiteStatementCursor(sQLiteStatementPrepare, i));
            AutoCloseableJVM.closeFinally(sQLiteStatementPrepare, null);
            return listConvertRows;
        } finally {
        }
    }
}
