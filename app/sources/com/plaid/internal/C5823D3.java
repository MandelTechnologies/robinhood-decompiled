package com.plaid.internal;

import androidx.room.SharedSQLiteStatement;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* renamed from: com.plaid.internal.D3 */
/* loaded from: classes16.dex */
public final class C5823D3 extends SharedSQLiteStatement {
    public C5823D3(WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        return "REPLACE INTO workflow_local_key_values (pane_id, `key`, string) VALUES (?, ?, ?)";
    }
}
