package com.plaid.internal;

import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.h3 */
/* loaded from: classes16.dex */
public final class C7095h3 implements Factory<InterfaceC5833E4> {

    /* renamed from: a */
    public final Provider<WorkflowDatabase> f2833a;

    public C7095h3(C6042b3 c6042b3, Provider<WorkflowDatabase> provider) {
        this.f2833a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        WorkflowDatabase database = this.f2833a.get();
        Intrinsics.checkNotNullParameter(database, "database");
        return (InterfaceC5833E4) Preconditions.checkNotNullFromProvides(new C7183q0(database));
    }
}
