package com.robinhood.shared.security.lib.workflow;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.security.store.workflow.WorkflowStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WorkflowManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/security/lib/workflow/WorkflowManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "workflowStore", "Lcom/robinhood/shared/security/store/workflow/WorkflowStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class WorkflowManager_Factory implements Factory<WorkflowManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<WorkflowStore> workflowStore;

    @JvmStatic
    public static final WorkflowManager_Factory create(Provider<CoroutineScope> provider, Provider<WorkflowStore> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final WorkflowManager newInstance(CoroutineScope coroutineScope, WorkflowStore workflowStore) {
        return INSTANCE.newInstance(coroutineScope, workflowStore);
    }

    public WorkflowManager_Factory(Provider<CoroutineScope> coroutineScope, Provider<WorkflowStore> workflowStore) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(workflowStore, "workflowStore");
        this.coroutineScope = coroutineScope;
        this.workflowStore = workflowStore;
    }

    @Override // javax.inject.Provider
    public WorkflowManager get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        WorkflowStore workflowStore = this.workflowStore.get();
        Intrinsics.checkNotNullExpressionValue(workflowStore, "get(...)");
        return companion.newInstance(coroutineScope, workflowStore);
    }

    /* compiled from: WorkflowManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/security/lib/workflow/WorkflowManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager_Factory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "workflowStore", "Lcom/robinhood/shared/security/store/workflow/WorkflowStore;", "newInstance", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "lib-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final WorkflowManager_Factory create(Provider<CoroutineScope> coroutineScope, Provider<WorkflowStore> workflowStore) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(workflowStore, "workflowStore");
            return new WorkflowManager_Factory(coroutineScope, workflowStore);
        }

        @JvmStatic
        public final WorkflowManager newInstance(CoroutineScope coroutineScope, WorkflowStore workflowStore) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(workflowStore, "workflowStore");
            return new WorkflowManager(coroutineScope, workflowStore);
        }
    }
}
