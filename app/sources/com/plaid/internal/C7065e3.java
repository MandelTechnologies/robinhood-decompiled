package com.plaid.internal;

import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.e3 */
/* loaded from: classes16.dex */
public final class C7065e3 implements Factory<InterfaceC7222u3> {

    /* renamed from: a */
    public final Provider<WorkflowDatabase> f2743a;

    public C7065e3(C6042b3 c6042b3, Provider<WorkflowDatabase> provider) {
        this.f2743a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        WorkflowDatabase database = this.f2743a.get();
        Intrinsics.checkNotNullParameter(database, "database");
        return (InterfaceC7222u3) Preconditions.checkNotNullFromProvides(new C7213t3(database));
    }
}
