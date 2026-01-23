package com.plaid.internal;

import android.database.Cursor;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import com.robinhood.android.lib.stepupverification.SuvConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.plaid.internal.F7 */
/* loaded from: classes16.dex */
public final class CallableC5845F7 implements Callable<List<C5920N7>> {

    /* renamed from: a */
    public final /* synthetic */ RoomSQLiteQuery f1346a;

    /* renamed from: b */
    public final /* synthetic */ C5911M7 f1347b;

    public CallableC5845F7(C5911M7 c5911m7, RoomSQLiteQuery roomSQLiteQuery) {
        this.f1347b = c5911m7;
        this.f1346a = roomSQLiteQuery;
    }

    @Override // java.util.concurrent.Callable
    public final List<C5920N7> call() {
        Cursor cursorQuery = DBUtil.query(this.f1347b.f1551a, this.f1346a, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, SuvConstants.PARAM_WORKFLOW_ID);
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "analytics_model");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new C5920N7(cursorQuery.getString(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getBlob(columnIndexOrThrow3)));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            this.f1346a.release();
        }
    }
}
