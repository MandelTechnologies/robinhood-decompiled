package com.plaid.internal;

import androidx.room.CoroutinesRoom;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import com.plaid.internal.C7186q3;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;
import java.util.ArrayList;

/* renamed from: com.plaid.internal.M7 */
/* loaded from: classes16.dex */
public final class C5911M7 implements InterfaceC5836E7 {

    /* renamed from: a */
    public final WorkflowDatabase_Impl f1551a;

    /* renamed from: b */
    public final C5854G7 f1552b;

    /* renamed from: c */
    public final C5863H7 f1553c;

    public C5911M7(WorkflowDatabase_Impl workflowDatabase_Impl) {
        this.f1551a = workflowDatabase_Impl;
        this.f1552b = new C5854G7(workflowDatabase_Impl);
        this.f1553c = new C5863H7(workflowDatabase_Impl);
        new C5872I7(workflowDatabase_Impl);
        new C5881J7(workflowDatabase_Impl);
    }

    @Override // com.plaid.internal.InterfaceC5836E7
    /* renamed from: a */
    public final Object mo1190a(ArrayList arrayList, C7168o3 c7168o3) {
        return CoroutinesRoom.execute(this.f1551a, true, new CallableC5890K7(this, arrayList), c7168o3);
    }

    @Override // com.plaid.internal.InterfaceC5836E7
    /* renamed from: a */
    public final Object mo1189a(String str, String str2, byte[] bArr, C7186q3.a aVar) {
        return CoroutinesRoom.execute(this.f1551a, true, new CallableC5899L7(this, str, str2, bArr), aVar);
    }

    @Override // com.plaid.internal.InterfaceC5836E7
    /* renamed from: a */
    public final Object mo1188a(C7204s3 c7204s3) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM workflow_analytics", 0);
        return CoroutinesRoom.execute(this.f1551a, false, DBUtil.createCancellationSignal(), new CallableC5845F7(this, roomSQLiteQueryAcquire), c7204s3);
    }
}
