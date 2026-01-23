package com.plaid.internal;

import androidx.room.SharedSQLiteStatement;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;

/* renamed from: com.plaid.internal.F3 */
/* loaded from: classes16.dex */
public final class C5841F3 extends SharedSQLiteStatement {
    public C5841F3(WorkflowDatabase_Impl workflowDatabase_Impl) {
        super(workflowDatabase_Impl);
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final String createQuery() {
        return "DELETE FROM workflow_local_key_values WHERE pane_id=?";
    }
}
