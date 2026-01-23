package com.plaid.internal;

import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.f3 */
/* loaded from: classes16.dex */
public final class C7075f3 implements Factory<InterfaceC5916N3> {

    /* renamed from: a */
    public final Provider<WorkflowDatabase> f2767a;

    public C7075f3(C6042b3 c6042b3, Provider<WorkflowDatabase> provider) {
        this.f2767a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        WorkflowDatabase database = this.f2767a.get();
        Intrinsics.checkNotNullParameter(database, "database");
        return (InterfaceC5916N3) Preconditions.checkNotNullFromProvides(new C5907M3(database));
    }
}
