package com.plaid.internal;

import androidx.room.CoroutinesRoom;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* renamed from: com.plaid.internal.A4 */
/* loaded from: classes16.dex */
public final class C5797A4 implements InterfaceC7232v4 {

    /* renamed from: a */
    public final WorkflowDatabase_Impl f1229a;

    /* renamed from: b */
    public final C7241w4 f1230b;

    public C5797A4(WorkflowDatabase_Impl workflowDatabase_Impl) {
        this.f1229a = workflowDatabase_Impl;
        this.f1230b = new C7241w4(workflowDatabase_Impl);
        new C7251x4(workflowDatabase_Impl);
    }

    @Override // com.plaid.internal.InterfaceC7232v4
    /* renamed from: a */
    public final Object mo1132a(String str, String str2, byte[] bArr, C5942Q2 c5942q2) {
        return CoroutinesRoom.execute(this.f1229a, true, new CallableC7260y4(this, str, str2, bArr), c5942q2);
    }

    @Override // com.plaid.internal.InterfaceC7232v4
    /* renamed from: a */
    public final Object mo1131a(String str, String str2, C7174p0 c7174p0) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM workflow_pane WHERE workflow_id=? AND id=?", 2);
        roomSQLiteQueryAcquire.bindString(1, str);
        roomSQLiteQueryAcquire.bindString(2, str2);
        return CoroutinesRoom.execute(this.f1229a, false, DBUtil.createCancellationSignal(), new CallableC7269z4(this, roomSQLiteQueryAcquire), c7174p0);
    }
}
