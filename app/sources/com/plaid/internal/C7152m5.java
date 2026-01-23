package com.plaid.internal;

import android.app.Application;
import androidx.room.Room;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.m5 */
/* loaded from: classes16.dex */
public final class C7152m5 implements Factory<WorkflowDatabase> {

    /* renamed from: a */
    public final Factory f2986a;

    public C7152m5(C7117j5 c7117j5, Factory factory) {
        this.f2986a = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f2986a.get();
        Intrinsics.checkNotNullParameter(application, "application");
        return (WorkflowDatabase) Preconditions.checkNotNullFromProvides((WorkflowDatabase) Room.databaseBuilder(application, WorkflowDatabase.class, "plaid_workflow_database").fallbackToDestructiveMigration().build());
    }
}
