package com.plaid.internal;

import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.sqlite.p015db.SupportSQLiteStatement;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* renamed from: com.plaid.internal.G7 */
/* loaded from: classes16.dex */
public final class C5854G7 extends EntityDeletionOrUpdateAdapter<C5920N7> {
    public C5854G7(WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.EntityDeletionOrUpdateAdapter
    public final void bind(SupportSQLiteStatement supportSQLiteStatement, C5920N7 c5920n7) {
        C5920N7 c5920n72 = c5920n7;
        supportSQLiteStatement.bindString(1, c5920n72.f1570a);
        supportSQLiteStatement.bindString(2, c5920n72.f1571b);
    }

    @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        return "DELETE FROM `workflow_analytics` WHERE `workflow_id` = ? AND `id` = ?";
    }
}
