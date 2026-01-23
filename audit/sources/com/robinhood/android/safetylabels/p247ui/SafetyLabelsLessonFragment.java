package com.robinhood.android.safetylabels.p247ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.LogOnceEventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.DisclosureUtil;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionConfig;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.markdown.elements.NoNewlineAfterHeaderMarkwonPlugin;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.safetylabels.C27803R;
import com.robinhood.android.safetylabels.databinding.FragmentSafetyLabelsLessonBinding;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.SafetyLabelLesson;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import io.noties.markwon.Markwon;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SafetyLabelsLessonFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0002GHB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0017J\b\u00108\u001a\u000203H\u0016J\b\u00109\u001a\u000203H\u0016J\u0010\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u0002032\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010>\u001a\u0002032\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010?\u001a\u0002032\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010@\u001a\u0002032\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010A\u001a\u0002032\u0006\u0010B\u001a\u000201H\u0002J\u0014\u0010C\u001a\u0002032\n\u0010D\u001a\u00060Ej\u0002`FH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b)\u0010*R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionTextView$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDuxo;", "getDuxo", "()Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "markwonBuilder", "Lio/noties/markwon/Markwon$Builder;", "getMarkwonBuilder", "()Lio/noties/markwon/Markwon$Builder;", "setMarkwonBuilder", "(Lio/noties/markwon/Markwon$Builder;)V", "markwon", "Lio/noties/markwon/Markwon;", "binding", "Lcom/robinhood/android/safetylabels/databinding/FragmentSafetyLabelsLessonBinding;", "getBinding", "()Lcom/robinhood/android/safetylabels/databinding/FragmentSafetyLabelsLessonBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "sectionsAdapter", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonAdapter;", "disclosureAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/designsystem/text/RhTextView;", "", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "logOnceEventLogger", "Lcom/robinhood/analytics/LogOnceEventLogger;", "getLogOnceEventLogger", "()Lcom/robinhood/analytics/LogOnceEventLogger;", "logOnceEventLogger$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "safetyLabelLesson", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelLesson;", "currentDefinitionWord", "", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onShowDefinition", "onHideDefinition", "setViewState", "state", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonViewState;", "bindLoading", "bindError", "bindContent", "bindDisclosureText", "setupMarkwonAndAdapter", "delimiter", "logDefinitionTooltipAction", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "SectionItemDecoration", "Companion", "feature-safety-labels_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SafetyLabelsLessonFragment extends BaseFragment implements RdsInlineDefinitionTextView.Callbacks {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private CompositeAdapter compositeAdapter;
    private String currentDefinitionWord;
    private final SingleItemAdapter<RhTextView, CharSequence> disclosureAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Screen eventScreen;

    /* renamed from: logOnceEventLogger$delegate, reason: from kotlin metadata */
    private final Lazy logOnceEventLogger;
    private Markwon markwon;
    public Markwon.Builder markwonBuilder;
    private SafetyLabelLesson safetyLabelLesson;
    private SafetyLabelsLessonAdapter sectionsAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SafetyLabelsLessonFragment.class, "binding", "getBinding()Lcom/robinhood/android/safetylabels/databinding/FragmentSafetyLabelsLessonBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SafetyLabelsLessonFragment() {
        super(C27803R.layout.fragment_safety_labels_lesson);
        this.duxo = DuxosKt.duxo(this, SafetyLabelsLessonDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, SafetyLabelsLessonFragment2.INSTANCE);
        this.disclosureAdapter = SingleItemAdapter.INSTANCE.m2991of(C27803R.layout.safety_labels_lesson_disclosure_item, DiffCallbacks.Single.INSTANCE, new Function2() { // from class: com.robinhood.android.safetylabels.ui.SafetyLabelsLessonFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SafetyLabelsLessonFragment.disclosureAdapter$lambda$0((RhTextView) obj, (CharSequence) obj2);
            }
        });
        this.logOnceEventLogger = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.safetylabels.ui.SafetyLabelsLessonFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SafetyLabelsLessonFragment.logOnceEventLogger_delegate$lambda$1(this.f$0);
            }
        });
        this.eventScreen = new Screen(Screen.Name.SAFETY_LABEL_LESSON, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SafetyLabelsLessonDuxo getDuxo() {
        return (SafetyLabelsLessonDuxo) this.duxo.getValue();
    }

    public final Markwon.Builder getMarkwonBuilder() {
        Markwon.Builder builder = this.markwonBuilder;
        if (builder != null) {
            return builder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwonBuilder");
        return null;
    }

    public final void setMarkwonBuilder(Markwon.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<set-?>");
        this.markwonBuilder = builder;
    }

    private final FragmentSafetyLabelsLessonBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSafetyLabelsLessonBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit disclosureAdapter$lambda$0(RhTextView of, CharSequence disclosure) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        of.setText(disclosure);
        return Unit.INSTANCE;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    private final LogOnceEventLogger getLogOnceEventLogger() {
        return (LogOnceEventLogger) this.logOnceEventLogger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogOnceEventLogger logOnceEventLogger_delegate$lambda$1(SafetyLabelsLessonFragment safetyLabelsLessonFragment) {
        return new LogOnceEventLogger(safetyLabelsLessonFragment.getEventLogger());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = getBinding().recyclerView;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        recyclerView.addItemDecoration(new SectionItemDecoration(contextRequireContext));
        Intrinsics.checkNotNull(recyclerView);
        LifecycleHost.DefaultImpls.bind$default(this, RxRecyclerView.scrollStateChanges(recyclerView), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.safetylabels.ui.SafetyLabelsLessonFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SafetyLabelsLessonFragment.onViewCreated$lambda$3$lambda$2(this.f$0, ((Integer) obj).intValue());
            }
        });
        BaseFragment.collectDuxoState$default(this, null, new C278072(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(SafetyLabelsLessonFragment safetyLabelsLessonFragment, int i) {
        if (1 == i) {
            EventLogger.DefaultImpls.logScroll$default(safetyLabelsLessonFragment.getEventLogger(), null, safetyLabelsLessonFragment.eventScreen, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, safetyLabelsLessonFragment.safetyLabelLesson, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -3, -1, -1, -1, -1, 16383, null), 13, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SafetyLabelsLessonFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.safetylabels.ui.SafetyLabelsLessonFragment$onViewCreated$2", m3645f = "SafetyLabelsLessonFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.safetylabels.ui.SafetyLabelsLessonFragment$onViewCreated$2 */
    static final class C278072 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C278072(Continuation<? super C278072> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C278072 c278072 = SafetyLabelsLessonFragment.this.new C278072(continuation);
            c278072.L$0 = obj;
            return c278072;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C278072) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SafetyLabelsLessonFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.safetylabels.ui.SafetyLabelsLessonFragment$onViewCreated$2$1", m3645f = "SafetyLabelsLessonFragment.kt", m3646l = {92}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.safetylabels.ui.SafetyLabelsLessonFragment$onViewCreated$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SafetyLabelsLessonFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SafetyLabelsLessonFragment safetyLabelsLessonFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = safetyLabelsLessonFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<SafetyLabelsLessonViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C505241 c505241 = new C505241(this.this$0);
                    this.label = 1;
                    if (stateFlow.collect(c505241, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new ExceptionsH();
            }

            /* compiled from: SafetyLabelsLessonFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.safetylabels.ui.SafetyLabelsLessonFragment$onViewCreated$2$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C505241 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ SafetyLabelsLessonFragment $tmp0;

                C505241(SafetyLabelsLessonFragment safetyLabelsLessonFragment) {
                    this.$tmp0 = safetyLabelsLessonFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, SafetyLabelsLessonFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(SafetyLabelsLessonViewState safetyLabelsLessonViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$setViewState = AnonymousClass1.invokeSuspend$setViewState(this.$tmp0, safetyLabelsLessonViewState, continuation);
                    return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((SafetyLabelsLessonViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$setViewState(SafetyLabelsLessonFragment safetyLabelsLessonFragment, SafetyLabelsLessonViewState safetyLabelsLessonViewState, Continuation continuation) {
                safetyLabelsLessonFragment.setViewState(safetyLabelsLessonViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(SafetyLabelsLessonFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView.Callbacks
    public void onShowDefinition() {
        logDefinitionTooltipAction(UserInteractionEventData.Action.SELECT);
    }

    @Override // com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView.Callbacks
    public void onHideDefinition() {
        logDefinitionTooltipAction(UserInteractionEventData.Action.DESELECT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(SafetyLabelsLessonViewState state) {
        String lessonIdentifier = state.getLessonIdentifier();
        if (lessonIdentifier == null) {
            lessonIdentifier = "";
        }
        String lessonTitle = state.getLessonTitle();
        this.safetyLabelLesson = new SafetyLabelLesson(lessonIdentifier, lessonTitle != null ? lessonTitle : "", null, 4, null);
        bindLoading(state);
        bindError(state);
        bindContent(state);
    }

    private final void bindLoading(SafetyLabelsLessonViewState state) {
        ShimmerLoadingView loadingView = getBinding().loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        loadingView.setVisibility(state.getShowLoading() ? 0 : 8);
    }

    private final void bindError(SafetyLabelsLessonViewState state) {
        ErrorView errorView = getBinding().errorView;
        Intrinsics.checkNotNullExpressionValue(errorView, "errorView");
        errorView.setVisibility(state.getShowError() ? 0 : 8);
    }

    private final void bindContent(SafetyLabelsLessonViewState state) {
        if (this.markwon == null || this.sectionsAdapter == null) {
            if (state.getDelimiter() == null) {
                return;
            } else {
                setupMarkwonAndAdapter(state.getDelimiter());
            }
        }
        RecyclerView recyclerView = getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        recyclerView.setVisibility(state.getShowLesson() ? 0 : 8);
        SafetyLabelsLessonAdapter safetyLabelsLessonAdapter = this.sectionsAdapter;
        if (safetyLabelsLessonAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sectionsAdapter");
            safetyLabelsLessonAdapter = null;
        }
        safetyLabelsLessonAdapter.submitList(state.getLessonSections());
        bindDisclosureText(state);
        LogOnceEventLogger.logAppear$default(getLogOnceEventLogger(), "safety_label_lesson_" + state.getLessonIdentifier(), null, this.eventScreen, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.safetyLabelLesson, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -3, -1, -1, -1, -1, 16383, null), 10, null);
    }

    private final void bindDisclosureText(SafetyLabelsLessonViewState state) {
        SingleItemAdapter<RhTextView, CharSequence> singleItemAdapter = this.disclosureAdapter;
        MarkdownContent disclosure = state.getDisclosure();
        CharSequence disclosure$default = null;
        if (disclosure != null) {
            Markwon markwon = this.markwon;
            if (markwon == null) {
                Intrinsics.throwUninitializedPropertyAccessException("markwon");
                markwon = null;
            }
            SpannableString spannableString = new SpannableString(Markwons.toSpanned$default(markwon, disclosure, null, 2, null));
            DisclosureUtil disclosureUtil = DisclosureUtil.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            disclosure$default = DisclosureUtil.getDisclosure$default(disclosureUtil, contextRequireContext, spannableString, state.getCanAppendToggleText(), getDuxo().getStateFlow().getValue().getExpandDisclosure(), null, null, new Function0() { // from class: com.robinhood.android.safetylabels.ui.SafetyLabelsLessonFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SafetyLabelsLessonFragment.bindDisclosureText$lambda$5$lambda$4(this.f$0);
                }
            }, 48, null);
        }
        singleItemAdapter.setData(disclosure$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDisclosureText$lambda$5$lambda$4(SafetyLabelsLessonFragment safetyLabelsLessonFragment) {
        safetyLabelsLessonFragment.getDuxo().toggleDisclosureState();
        return Unit.INSTANCE;
    }

    private final void setupMarkwonAndAdapter(String delimiter) {
        this.markwon = getMarkwonBuilder().usePlugin(new NoNewlineAfterHeaderMarkwonPlugin()).build();
        RdsInlineDefinitionConfig rdsInlineDefinitionConfig = new RdsInlineDefinitionConfig(delimiter, false, this, 2, null);
        Markwon markwon = this.markwon;
        CompositeAdapter compositeAdapter = null;
        if (markwon == null) {
            Intrinsics.throwUninitializedPropertyAccessException("markwon");
            markwon = null;
        }
        this.sectionsAdapter = new SafetyLabelsLessonAdapter(markwon, rdsInlineDefinitionConfig, this.safetyLabelLesson);
        SafetyLabelsLessonAdapter safetyLabelsLessonAdapter = this.sectionsAdapter;
        if (safetyLabelsLessonAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sectionsAdapter");
            safetyLabelsLessonAdapter = null;
        }
        this.compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{safetyLabelsLessonAdapter, this.disclosureAdapter});
        RecyclerView recyclerView = getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        CompositeAdapter compositeAdapter2 = this.compositeAdapter;
        if (compositeAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("compositeAdapter");
        } else {
            compositeAdapter = compositeAdapter2;
        }
        bindAdapter(recyclerView, compositeAdapter);
    }

    private final void logDefinitionTooltipAction(UserInteractionEventData.Action action) {
        EventLogger eventLogger = getEventLogger();
        Screen screen = this.eventScreen;
        Component component = new Component(Component.ComponentType.TOOLTIP, null, null, 6, null);
        SafetyLabelLesson safetyLabelLesson = this.safetyLabelLesson;
        String str = this.currentDefinitionWord;
        if (str == null) {
            str = "";
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, safetyLabelLesson, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -7, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    /* compiled from: SafetyLabelsLessonFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonFragment$SectionItemDecoration;", "Lcom/robinhood/utils/ui/view/recyclerview/PaddingItemDecoration;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "smallVerticalSpacing", "", "mediumVerticalSpacing", "getBottomPadding", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "position", "feature-safety-labels_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class SectionItemDecoration extends PaddingItemDecoration {
        private final int mediumVerticalSpacing;
        private final int smallVerticalSpacing;

        public SectionItemDecoration(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.smallVerticalSpacing = context.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_small);
            this.mediumVerticalSpacing = context.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_medium);
        }

        @Override // com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration
        protected int getBottomPadding(RecyclerView.Adapter<?> adapter, int position) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            return position == 0 ? this.smallVerticalSpacing : this.mediumVerticalSpacing;
        }
    }

    /* compiled from: SafetyLabelsLessonFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SafetyLabelsLesson;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonFragment;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-safety-labels_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.SafetyLabelsLesson>, FragmentWithArgsCompanion<SafetyLabelsLessonFragment, LegacyFragmentKey.SafetyLabelsLesson> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.SafetyLabelsLesson getArgs(SafetyLabelsLessonFragment safetyLabelsLessonFragment) {
            return (LegacyFragmentKey.SafetyLabelsLesson) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, safetyLabelsLessonFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SafetyLabelsLessonFragment newInstance(LegacyFragmentKey.SafetyLabelsLesson safetyLabelsLesson) {
            return (SafetyLabelsLessonFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, safetyLabelsLesson);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SafetyLabelsLessonFragment safetyLabelsLessonFragment, LegacyFragmentKey.SafetyLabelsLesson safetyLabelsLesson) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, safetyLabelsLessonFragment, safetyLabelsLesson);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.SafetyLabelsLesson key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance((Parcelable) key);
        }
    }
}
