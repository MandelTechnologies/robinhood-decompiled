package com.plaid.internal;

import android.database.Cursor;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import java.util.concurrent.Callable;

/* renamed from: com.plaid.internal.I3 */
/* loaded from: classes16.dex */
public final class CallableC5868I3 implements Callable<String> {

    /* renamed from: a */
    public final /* synthetic */ RoomSQLiteQuery f1381a;

    /* renamed from: b */
    public final /* synthetic */ C5877J3 f1382b;

    public CallableC5868I3(C5877J3 c5877j3, RoomSQLiteQuery roomSQLiteQuery) {
        this.f1382b = c5877j3;
        this.f1381a = roomSQLiteQuery;
    }

    @Override // java.util.concurrent.Callable
    public final String call() {
        String string2 = null;
        Cursor cursorQuery = DBUtil.query(this.f1382b.f1401a, this.f1381a, false, null);
        try {
            if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                string2 = cursorQuery.getString(0);
            }
            return string2;
        } finally {
            cursorQuery.close();
            this.f1381a.release();
        }
    }
}
