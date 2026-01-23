package com.plaid.internal;

import androidx.room.SharedSQLiteStatement;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* renamed from: com.plaid.internal.w4 */
/* loaded from: classes16.dex */
public final class C7241w4 extends SharedSQLiteStatement {
    public C7241w4(WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        return "REPLACE INTO workflow_pane (workflow_id, id, model) VALUES (?, ?, ?)";
    }
}
