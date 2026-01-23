package com.plaid.internal;

import android.database.Cursor;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import com.robinhood.android.lib.stepupverification.SuvConstants;
import java.util.concurrent.Callable;

/* renamed from: com.plaid.internal.z4 */
/* loaded from: classes16.dex */
public final class CallableC7269z4 implements Callable<C5806B4> {

    /* renamed from: a */
    public final /* synthetic */ RoomSQLiteQuery f3340a;

    /* renamed from: b */
    public final /* synthetic */ C5797A4 f3341b;

    public CallableC7269z4(C5797A4 c5797a4, RoomSQLiteQuery roomSQLiteQuery) {
        this.f3341b = c5797a4;
        this.f3340a = roomSQLiteQuery;
    }

    @Override // java.util.concurrent.Callable
    public final C5806B4 call() {
        Cursor cursorQuery = DBUtil.query(this.f3341b.f1229a, this.f3340a, false, null);
        try {
            return cursorQuery.moveToFirst() ? new C5806B4(cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, SuvConstants.PARAM_WORKFLOW_ID)), cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "id")), cursorQuery.getBlob(CursorUtil.getColumnIndexOrThrow(cursorQuery, "model"))) : null;
        } finally {
            cursorQuery.close();
            this.f3340a.release();
        }
    }
}
