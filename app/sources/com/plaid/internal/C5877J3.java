package com.plaid.internal;

import androidx.room.CoroutinesRoom;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.plaid.internal.J3 */
/* loaded from: classes16.dex */
public final class C5877J3 implements InterfaceC5814C3 {

    /* renamed from: a */
    public final WorkflowDatabase_Impl f1401a;

    /* renamed from: b */
    public final C5823D3 f1402b;

    /* renamed from: c */
    public final C5841F3 f1403c;

    public C5877J3(WorkflowDatabase_Impl workflowDatabase_Impl) {
        this.f1401a = workflowDatabase_Impl;
        this.f1402b = new C5823D3(workflowDatabase_Impl);
        new C5832E3(workflowDatabase_Impl);
        this.f1403c = new C5841F3(workflowDatabase_Impl);
    }

    @Override // com.plaid.internal.InterfaceC5814C3
    /* renamed from: a */
    public final Object mo1165a(String str, String str2, String str3, C5895L3 c5895l3) {
        return CoroutinesRoom.execute(this.f1401a, true, new CallableC5850G3(this, str, str2, str3), c5895l3);
    }

    @Override // com.plaid.internal.InterfaceC5814C3
    /* renamed from: a */
    public final Object mo1167a(String str, ContinuationImpl continuationImpl) {
        return CoroutinesRoom.execute(this.f1401a, true, new CallableC5859H3(this, str), continuationImpl);
    }

    @Override // com.plaid.internal.InterfaceC5814C3
    /* renamed from: a */
    public final Object mo1166a(String str, String str2, ContinuationImpl continuationImpl) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT string FROM workflow_local_key_values WHERE pane_id=? AND `key`=?", 2);
        roomSQLiteQueryAcquire.bindString(1, str);
        roomSQLiteQueryAcquire.bindString(2, str2);
        return CoroutinesRoom.execute(this.f1401a, false, DBUtil.createCancellationSignal(), new CallableC5868I3(this, roomSQLiteQueryAcquire), continuationImpl);
    }
}
