package com.robinhood.android.investorprofile.p162ui.questionnaire.load;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.investorprofile.C19641R;
import com.robinhood.android.investorprofile.p162ui.questionnaire.load.LoadQuestionnaireEvent;
import com.robinhood.android.investorprofile.p162ui.questionnaire.load.QuestionnaireLoadConfigurationFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.store.questionnaire.QuestionnaireQuestionsResult;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: QuestionnaireLoadConfigurationFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0016\u0010\u0019\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/load/QuestionnaireLoadConfigurationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/investorprofile/ui/questionnaire/load/QuestionnaireLoadConfigurationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/load/QuestionnaireLoadConfigurationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/load/LoadQuestionnaireDuxo;", "getDuxo", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/load/LoadQuestionnaireDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleLoadQuestionnaireEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/load/LoadQuestionnaireEvent;", "Callbacks", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class QuestionnaireLoadConfigurationFragment extends BaseFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(QuestionnaireLoadConfigurationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/investorprofile/ui/questionnaire/load/QuestionnaireLoadConfigurationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: QuestionnaireLoadConfigurationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/load/QuestionnaireLoadConfigurationFragment$Callbacks;", "", "onLoadQuestionnaireConfigurationSuccess", "", "result", "Lcom/robinhood/store/questionnaire/QuestionnaireQuestionsResult;", "onLoadQuestionnaireConfigurationFailed", "throwable", "", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onLoadQuestionnaireConfigurationFailed(Throwable throwable);

        void onLoadQuestionnaireConfigurationSuccess(QuestionnaireQuestionsResult result);
    }

    public QuestionnaireLoadConfigurationFragment() {
        super(C19641R.layout.fragment_questionnaire_load_configuration);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.load.QuestionnaireLoadConfigurationFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof QuestionnaireLoadConfigurationFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = DuxosKt.duxo(this, LoadQuestionnaireDuxo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadQuestionnaireDuxo getDuxo() {
        return (LoadQuestionnaireDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (context instanceof Callbacks) {
            return;
        }
        throw new IllegalArgumentException((context + " must implement " + Callbacks.class.getName()).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLoadQuestionnaireEvent(final Event<LoadQuestionnaireEvent> event) {
        EventConsumer<LoadQuestionnaireEvent> eventConsumerInvoke;
        if (!(event.getData() instanceof LoadQuestionnaireEvent) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.load.QuestionnaireLoadConfigurationFragment$handleLoadQuestionnaireEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m15686invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m15686invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                LoadQuestionnaireEvent loadQuestionnaireEvent = (LoadQuestionnaireEvent) event.getData();
                if (loadQuestionnaireEvent instanceof LoadQuestionnaireEvent.Failure) {
                    this.getCallbacks().onLoadQuestionnaireConfigurationFailed(((LoadQuestionnaireEvent.Failure) loadQuestionnaireEvent).getException());
                } else {
                    if (!(loadQuestionnaireEvent instanceof LoadQuestionnaireEvent.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.getCallbacks().onLoadQuestionnaireConfigurationSuccess(((LoadQuestionnaireEvent.Success) loadQuestionnaireEvent).getResult());
                }
            }
        });
    }

    /* compiled from: QuestionnaireLoadConfigurationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.questionnaire.load.QuestionnaireLoadConfigurationFragment$onViewCreated$1", m3645f = "QuestionnaireLoadConfigurationFragment.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.load.QuestionnaireLoadConfigurationFragment$onViewCreated$1 */
    static final class C197731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C197731(Continuation<? super C197731> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QuestionnaireLoadConfigurationFragment.this.new C197731(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C197731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(QuestionnaireLoadConfigurationFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(QuestionnaireLoadConfigurationFragment.this);
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

        /* compiled from: QuestionnaireLoadConfigurationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.load.QuestionnaireLoadConfigurationFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ QuestionnaireLoadConfigurationFragment $tmp0;

            AnonymousClass1(QuestionnaireLoadConfigurationFragment questionnaireLoadConfigurationFragment) {
                this.$tmp0 = questionnaireLoadConfigurationFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, QuestionnaireLoadConfigurationFragment.class, "handleLoadQuestionnaireEvent", "handleLoadQuestionnaireEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<LoadQuestionnaireEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleLoadQuestionnaireEvent = C197731.invokeSuspend$handleLoadQuestionnaireEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleLoadQuestionnaireEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleLoadQuestionnaireEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<LoadQuestionnaireEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleLoadQuestionnaireEvent(QuestionnaireLoadConfigurationFragment questionnaireLoadConfigurationFragment, Event event, Continuation continuation) {
            questionnaireLoadConfigurationFragment.handleLoadQuestionnaireEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C197731(null), 1, null);
    }

    /* compiled from: QuestionnaireLoadConfigurationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/load/QuestionnaireLoadConfigurationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/load/QuestionnaireLoadConfigurationFragment;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/load/LoadQuestionnaireArgs;", "<init>", "()V", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<QuestionnaireLoadConfigurationFragment, LoadQuestionnaireArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LoadQuestionnaireArgs getArgs(QuestionnaireLoadConfigurationFragment questionnaireLoadConfigurationFragment) {
            return (LoadQuestionnaireArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, questionnaireLoadConfigurationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public QuestionnaireLoadConfigurationFragment newInstance(LoadQuestionnaireArgs loadQuestionnaireArgs) {
            return (QuestionnaireLoadConfigurationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, loadQuestionnaireArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(QuestionnaireLoadConfigurationFragment questionnaireLoadConfigurationFragment, LoadQuestionnaireArgs loadQuestionnaireArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, questionnaireLoadConfigurationFragment, loadQuestionnaireArgs);
        }
    }
}
