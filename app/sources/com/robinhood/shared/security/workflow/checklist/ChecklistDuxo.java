package com.robinhood.shared.security.workflow.checklist;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.workflow.p358ui.screens.ChecklistScreen;
import com.robinhood.shared.security.contracts.ChecklistFragmentKey;
import com.robinhood.shared.security.lib.workflow.WorkflowManager;
import com.robinhood.shared.security.workflow.checklist.ChecklistEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* compiled from: ChecklistDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001cB)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0006\u0010\u001a\u001a\u00020\u0015J\u0006\u0010\u001b\u001a\u00020\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/security/workflow/checklist/ChecklistDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/security/workflow/checklist/ChecklistDataState;", "Lcom/robinhood/shared/security/workflow/checklist/ChecklistViewState;", "Lcom/robinhood/shared/security/workflow/checklist/ChecklistEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "workflowManager", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/shared/security/workflow/checklist/ChecklistStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/security/workflow/checklist/ChecklistStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "delayJob", "Lkotlinx/coroutines/Job;", "onResume", "", "onCheckboxClicked", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "onAllChecked", "onPrimaryCtaClicked", "onSecondaryCtaClicked", "Companion", "feature-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ChecklistDuxo extends BaseDuxo3<ChecklistDataState, ChecklistViewState, ChecklistEvent> implements HasSavedState {
    private Job delayJob;
    private final SavedStateHandle savedStateHandle;
    private final WorkflowManager workflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ChecklistDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChecklistScreen.Callback.values().length];
            try {
                iArr[ChecklistScreen.Callback.DEEPLINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChecklistScreen.Callback.EXIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChecklistScreen.Callback.ACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public ChecklistDuxo(WorkflowManager workflowManager, SavedStateHandle savedStateHandle, ChecklistStateProvider stateProvider, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(workflowManager, "workflowManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        List<String> markdownItems = ((ChecklistFragmentKey) INSTANCE.getArgs(savedStateHandle)).getWorkflowScreen().getMarkdownItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(markdownItems, 10));
        for (String str : markdownItems) {
            arrayList.add(Boolean.FALSE);
        }
        super(new ChecklistDataState(extensions2.toImmutableList(arrayList), false, 2, null), stateProvider, duxoBundle);
        this.workflowManager = workflowManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        withDataState(new Function1() { // from class: com.robinhood.shared.security.workflow.checklist.ChecklistDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChecklistDuxo.onResume$lambda$2(this.f$0, (ChecklistDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(ChecklistDuxo checklistDuxo, ChecklistDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!state.getHasDelayPassed()) {
            ImmutableList<Boolean> checkboxStates = state.getCheckboxStates();
            if (checkboxStates != null && checkboxStates.isEmpty()) {
                checklistDuxo.onAllChecked();
            } else {
                Iterator<Boolean> it = checkboxStates.iterator();
                while (it.hasNext()) {
                    if (!it.next().booleanValue()) {
                        break;
                    }
                }
                checklistDuxo.onAllChecked();
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ChecklistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/security/workflow/checklist/ChecklistDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.workflow.checklist.ChecklistDuxo$onCheckboxClicked$1", m3645f = "ChecklistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.security.workflow.checklist.ChecklistDuxo$onCheckboxClicked$1 */
    static final class C397701 extends ContinuationImpl7 implements Function2<ChecklistDataState, Continuation<? super ChecklistDataState>, Object> {
        final /* synthetic */ int $index;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C397701(int i, Continuation<? super C397701> continuation) {
            super(2, continuation);
            this.$index = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C397701 c397701 = ChecklistDuxo.this.new C397701(this.$index, continuation);
            c397701.L$0 = obj;
            return c397701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ChecklistDataState checklistDataState, Continuation<? super ChecklistDataState> continuation) {
            return ((C397701) create(checklistDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ChecklistDataState checklistDataState = (ChecklistDataState) this.L$0;
            ImmutableList<Boolean> checkboxStates = checklistDataState.getCheckboxStates();
            int i = this.$index;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(checkboxStates, 10));
            int i2 = 0;
            for (Boolean bool : checkboxStates) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                boolean zBooleanValue = bool.booleanValue();
                boolean z = true;
                if (i2 == i) {
                    if (zBooleanValue) {
                        z = false;
                    }
                } else if (zBooleanValue) {
                }
                arrayList.add(boxing.boxBoolean(z));
                i2 = i3;
            }
            ImmutableList<Boolean> immutableList = extensions2.toImmutableList(arrayList);
            if (!checklistDataState.getHasDelayPassed()) {
                if (immutableList != null && immutableList.isEmpty()) {
                    ChecklistDuxo.this.onAllChecked();
                } else {
                    Iterator<Boolean> it = immutableList.iterator();
                    while (it.hasNext()) {
                        if (!it.next().booleanValue()) {
                            break;
                        }
                    }
                    ChecklistDuxo.this.onAllChecked();
                }
            }
            return checklistDataState.copy(immutableList, false);
        }
    }

    public final void onCheckboxClicked(int index) {
        Job job = this.delayJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        applyMutation(new C397701(index, null));
    }

    /* compiled from: ChecklistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.workflow.checklist.ChecklistDuxo$onAllChecked$1", m3645f = "ChecklistDuxo.kt", m3646l = {69}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.workflow.checklist.ChecklistDuxo$onAllChecked$1 */
    static final class C397691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C397691(Continuation<? super C397691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChecklistDuxo.this.new C397691(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C397691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long millis = TimeUnit.SECONDS.toMillis(((ChecklistFragmentKey) ChecklistDuxo.INSTANCE.getArgs((HasSavedState) ChecklistDuxo.this)).getWorkflowScreen().getPrimaryCtaEnableDelaySeconds());
                this.label = 1;
                if (DelayKt.delay(millis, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ChecklistDuxo.this.applyMutation(new AnonymousClass1(null));
            return Unit.INSTANCE;
        }

        /* compiled from: ChecklistDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/security/workflow/checklist/ChecklistDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.security.workflow.checklist.ChecklistDuxo$onAllChecked$1$1", m3645f = "ChecklistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.security.workflow.checklist.ChecklistDuxo$onAllChecked$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ChecklistDataState, Continuation<? super ChecklistDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ChecklistDataState checklistDataState, Continuation<? super ChecklistDataState> continuation) {
                return ((AnonymousClass1) create(checklistDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ChecklistDataState.copy$default((ChecklistDataState) this.L$0, null, true, 1, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAllChecked() {
        this.delayJob = BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C397691(null), 3, null);
    }

    public final void onPrimaryCtaClicked() {
        WorkflowManager workflowManager = this.workflowManager;
        Companion companion = INSTANCE;
        workflowManager.sendActionRequest(((ChecklistFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), ChecklistScreen.Action.PrimaryCta.INSTANCE, ((ChecklistFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
    }

    public final void onSecondaryCtaClicked() {
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[((ChecklistFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getSecondaryCtaCallback().ordinal()];
        if (i == 1) {
            String secondaryCtaDeeplink = ((ChecklistFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getSecondaryCtaDeeplink();
            if (secondaryCtaDeeplink == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            submit(new ChecklistEvent.Deeplink(secondaryCtaDeeplink));
            return;
        }
        if (i == 2) {
            this.workflowManager.sendActionRequest(((ChecklistFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), ChecklistScreen.Action.SecondaryCta.INSTANCE, ((ChecklistFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
            submit(ChecklistEvent.Exit.INSTANCE);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.workflowManager.sendActionRequest(((ChecklistFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), ChecklistScreen.Action.SecondaryCta.INSTANCE, ((ChecklistFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
        }
    }

    /* compiled from: ChecklistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/security/workflow/checklist/ChecklistDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/security/workflow/checklist/ChecklistDuxo;", "Lcom/robinhood/shared/security/contracts/ChecklistFragmentKey;", "<init>", "()V", "feature-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ChecklistDuxo, ChecklistFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ChecklistFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (ChecklistFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ChecklistFragmentKey getArgs(ChecklistDuxo checklistDuxo) {
            return (ChecklistFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, checklistDuxo);
        }
    }
}
