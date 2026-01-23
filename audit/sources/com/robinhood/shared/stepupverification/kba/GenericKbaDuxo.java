package com.robinhood.shared.stepupverification.kba;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.workflow.p358ui.screens.GenericKbaScreen;
import com.robinhood.shared.security.contracts.GenericKbaFragmentKey;
import com.robinhood.shared.security.lib.workflow.WorkflowActionResult;
import com.robinhood.shared.security.lib.workflow.WorkflowManager;
import com.robinhood.shared.stepupverification.kba.GenericKbaEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GenericKbaDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001dB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0006\u0010\u0015\u001a\u00020\u0010J\u0006\u0010\u0016\u001a\u00020\u0010J\u0014\u0010\u0017\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/kba/GenericKbaDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/stepupverification/kba/GenericKbaViewState;", "Lcom/robinhood/shared/stepupverification/kba/GenericKbaEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "workflowManager", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onPrimaryCtaClicked", "inputTexts", "", "", "onSecondaryCtaClicked", "onBackPressed", "format", "type", "Lcom/robinhood/models/workflow/ui/screens/GenericKbaScreen$Field$Type;", "handleActionResult", "result", "Lcom/robinhood/shared/security/lib/workflow/WorkflowActionResult;", "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class GenericKbaDuxo extends BaseDuxo5<GenericKbaViewState, GenericKbaEvent> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final WorkflowManager workflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GenericKbaDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GenericKbaScreen.Field.Type.values().length];
            try {
                iArr[GenericKbaScreen.Field.Type.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericKbaDuxo(WorkflowManager workflowManager, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new GenericKbaViewState(false), duxoBundle);
        Intrinsics.checkNotNullParameter(workflowManager, "workflowManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.workflowManager = workflowManager;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: GenericKbaDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.kba.GenericKbaDuxo$onCreate$1", m3645f = "GenericKbaDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.kba.GenericKbaDuxo$onCreate$1 */
    static final class C398691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C398691(Continuation<? super C398691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GenericKbaDuxo.this.new C398691(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C398691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: GenericKbaDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.stepupverification.kba.GenericKbaDuxo$onCreate$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ GenericKbaDuxo $tmp0;

            AnonymousClass1(GenericKbaDuxo genericKbaDuxo) {
                this.$tmp0 = genericKbaDuxo;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, GenericKbaDuxo.class, "handleActionResult", "handleActionResult(Lcom/robinhood/shared/security/lib/workflow/WorkflowActionResult;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(WorkflowActionResult workflowActionResult, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleActionResult = C398691.invokeSuspend$handleActionResult(this.$tmp0, workflowActionResult, continuation);
                return objInvokeSuspend$handleActionResult == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleActionResult : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((WorkflowActionResult) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(GenericKbaDuxo.this.workflowManager.getActionResultFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(GenericKbaDuxo.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleActionResult(GenericKbaDuxo genericKbaDuxo, WorkflowActionResult workflowActionResult, Continuation continuation) {
            genericKbaDuxo.handleActionResult(workflowActionResult);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C398691(null));
    }

    /* compiled from: GenericKbaDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/kba/GenericKbaViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.kba.GenericKbaDuxo$onPrimaryCtaClicked$1", m3645f = "GenericKbaDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.kba.GenericKbaDuxo$onPrimaryCtaClicked$1 */
    static final class C398701 extends ContinuationImpl7 implements Function2<GenericKbaViewState, Continuation<? super GenericKbaViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398701(Continuation<? super C398701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398701 c398701 = new C398701(continuation);
            c398701.L$0 = obj;
            return c398701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GenericKbaViewState genericKbaViewState, Continuation<? super GenericKbaViewState> continuation) {
            return ((C398701) create(genericKbaViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((GenericKbaViewState) this.L$0).copy(true);
        }
    }

    public final void onPrimaryCtaClicked(List<String> inputTexts) {
        Intrinsics.checkNotNullParameter(inputTexts, "inputTexts");
        applyMutation(new C398701(null));
        WorkflowManager workflowManager = this.workflowManager;
        Companion companion = INSTANCE;
        UUID workflowId = ((GenericKbaFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId();
        List<GenericKbaScreen.Field> fields = ((GenericKbaFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getFields();
        Iterator<T> it = fields.iterator();
        List<String> list = inputTexts;
        Iterator<T> it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(fields, 10), CollectionsKt.collectionSizeOrDefault(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            GenericKbaScreen.Field field = (GenericKbaScreen.Field) next;
            arrayList.add(Tuples4.m3642to(field.getId(), format((String) it2.next(), field.getType())));
        }
        workflowManager.sendActionRequest(workflowId, new GenericKbaScreen.Action.PrimaryCta(arrayList), ((GenericKbaFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getWorkflowScreen());
    }

    public final void onSecondaryCtaClicked() {
        Companion companion = INSTANCE;
        GenericKbaScreen.Callback secondaryCtaCallback = ((GenericKbaFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getSecondaryCtaCallback();
        if (secondaryCtaCallback != null) {
            applyMutation(new GenericKbaDuxo2(null));
            this.workflowManager.sendActionRequest(((GenericKbaFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), GenericKbaScreen.Action.SecondaryCta.INSTANCE, ((GenericKbaFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
            if (secondaryCtaCallback == GenericKbaScreen.Callback.EXIT) {
                submit(GenericKbaEvent.Exit.INSTANCE);
            }
        }
    }

    /* compiled from: GenericKbaDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/kba/GenericKbaViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.kba.GenericKbaDuxo$onBackPressed$1", m3645f = "GenericKbaDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.kba.GenericKbaDuxo$onBackPressed$1 */
    static final class C398681 extends ContinuationImpl7 implements Function2<GenericKbaViewState, Continuation<? super GenericKbaViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398681(Continuation<? super C398681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398681 c398681 = new C398681(continuation);
            c398681.L$0 = obj;
            return c398681;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GenericKbaViewState genericKbaViewState, Continuation<? super GenericKbaViewState> continuation) {
            return ((C398681) create(genericKbaViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((GenericKbaViewState) this.L$0).copy(true);
        }
    }

    public final void onBackPressed() {
        applyMutation(new C398681(null));
        WorkflowManager workflowManager = this.workflowManager;
        Companion companion = INSTANCE;
        workflowManager.sendActionRequest(((GenericKbaFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), GenericKbaScreen.Action.CustomerAbandon.INSTANCE, ((GenericKbaFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
        if (((GenericKbaFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getCloseButtonCallback() == null || ((GenericKbaFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getCloseButtonCallback() == GenericKbaScreen.Callback.EXIT) {
            submit(GenericKbaEvent.Exit.INSTANCE);
        }
    }

    private final String format(String str, GenericKbaScreen.Field.Type type2) {
        if (WhenMappings.$EnumSwitchMapping$0[type2.ordinal()] != 1) {
            return str;
        }
        if (str.length() != 8) {
            throw new IllegalArgumentException("Date is not correct length");
        }
        return String.valueOf(InternationalInfo.Companion.fromCountryCode$default(InternationalInfo.INSTANCE, null, CountryCode.Supported.UnitedStates.INSTANCE, 1, null).getParseDateOfBirth().invoke(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleActionResult(WorkflowActionResult result) {
        if (result.getAction() instanceof GenericKbaScreen.Action) {
            applyMutation(new C398671(null));
            Throwable thConsumeError = result.consumeError();
            if (thConsumeError != null) {
                submit(new GenericKbaEvent.Error(thConsumeError));
            }
        }
    }

    /* compiled from: GenericKbaDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/kba/GenericKbaViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.kba.GenericKbaDuxo$handleActionResult$1", m3645f = "GenericKbaDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.kba.GenericKbaDuxo$handleActionResult$1 */
    static final class C398671 extends ContinuationImpl7 implements Function2<GenericKbaViewState, Continuation<? super GenericKbaViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398671(Continuation<? super C398671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398671 c398671 = new C398671(continuation);
            c398671.L$0 = obj;
            return c398671;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GenericKbaViewState genericKbaViewState, Continuation<? super GenericKbaViewState> continuation) {
            return ((C398671) create(genericKbaViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((GenericKbaViewState) this.L$0).copy(false);
        }
    }

    /* compiled from: GenericKbaDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/kba/GenericKbaDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/stepupverification/kba/GenericKbaDuxo;", "Lcom/robinhood/shared/security/contracts/GenericKbaFragmentKey;", "<init>", "()V", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<GenericKbaDuxo, GenericKbaFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GenericKbaFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (GenericKbaFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GenericKbaFragmentKey getArgs(GenericKbaDuxo genericKbaDuxo) {
            return (GenericKbaFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, genericKbaDuxo);
        }
    }
}
