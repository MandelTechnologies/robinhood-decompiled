package androidx.room.paging.util;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

@Metadata(m3635d1 = {"androidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt"}, m3636d2 = {}, m3637k = 4, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class RoomPagingUtil {
    public static final <Value> Integer getClippedRefreshKey(PagingState<Integer, Value> pagingState) {
        return RoomPagingUtil2.getClippedRefreshKey(pagingState);
    }

    public static final int getLimit(PagingSource.LoadParams<Integer> loadParams, int i) {
        return RoomPagingUtil2.getLimit(loadParams, i);
    }

    public static final int getOffset(PagingSource.LoadParams<Integer> loadParams, int i, int i2) {
        return RoomPagingUtil2.getOffset(loadParams, i, i2);
    }

    public static final <Value> Object queryDatabase(PagingSource.LoadParams<Integer> loadParams, RoomRawQuery roomRawQuery, int i, Function3<? super RoomRawQuery, ? super Integer, ? super Continuation<? super List<? extends Value>>, ? extends Object> function3, Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
        return RoomPagingUtil2.queryDatabase(loadParams, roomRawQuery, i, function3, continuation);
    }

    public static final Object queryItemCount(RoomRawQuery roomRawQuery, RoomDatabase roomDatabase, Continuation<? super Integer> continuation) {
        return RoomPagingUtil2.queryItemCount(roomRawQuery, roomDatabase, continuation);
    }
}
