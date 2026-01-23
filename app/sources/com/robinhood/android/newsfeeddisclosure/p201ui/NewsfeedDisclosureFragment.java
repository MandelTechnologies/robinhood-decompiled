package com.robinhood.android.newsfeeddisclosure.p201ui;

import android.animation.LayoutTransition;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.education.contracts.NewsfeedDisclosureKey;
import com.robinhood.android.expandablecontent.p136ui.ExpandableContentSectionItemView;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.newsfeeddisclosure.C22587R;
import com.robinhood.android.newsfeeddisclosure.databinding.FragmentNewsfeedDisclosureBinding;
import com.robinhood.models.p355ui.UiExpandableContent;
import com.robinhood.models.p355ui.UiExpandableContentSection;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.DisclosureDropdown;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: NewsfeedDisclosureFragment.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u000256B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020&2\u0006\u00102\u001a\u000200H\u0002J\u0010\u00103\u001a\u00020&2\u0006\u0010,\u001a\u00020-H\u0002J\b\u00104\u001a\u000200H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\"X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/newsfeeddisclosure/databinding/FragmentNewsfeedDisclosureBinding;", "getBinding", "()Lcom/robinhood/android/newsfeeddisclosure/databinding/FragmentNewsfeedDisclosureBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureDuxo;", "getDuxo", "()Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "disclosureItemAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/expandablecontent/ui/ExpandableContentSectionItemView;", "Lcom/robinhood/models/ui/UiExpandableContentSection;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setState", "state", "Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureViewState;", "bindErrorView", "showError", "", "bindLoadingView", "showLoading", "bindNewsfeedDisclosureContent", "onBackPressed", "Companion", "NewsfeedDisclosureOverlay", "feature-newsfeed-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class NewsfeedDisclosureFragment extends BaseFragment implements AutoLoggableFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final GenericListAdapter<ExpandableContentSectionItemView, UiExpandableContentSection> disclosureItemAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NewsfeedDisclosureFragment.class, "binding", "getBinding()Lcom/robinhood/android/newsfeeddisclosure/databinding/FragmentNewsfeedDisclosureBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object disclosureItemAdapter$lambda$0(UiExpandableContentSection byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public NewsfeedDisclosureFragment() {
        super(C22587R.layout.fragment_newsfeed_disclosure);
        this.binding = ViewBinding5.viewBinding(this, NewsfeedDisclosureFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, NewsfeedDisclosureDuxo.class);
        this.disclosureItemAdapter = GenericListAdapter.INSTANCE.m2987of(ExpandableContentSectionItemView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.newsfeeddisclosure.ui.NewsfeedDisclosureFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsfeedDisclosureFragment.disclosureItemAdapter$lambda$0((UiExpandableContentSection) obj);
            }
        }), new Function2() { // from class: com.robinhood.android.newsfeeddisclosure.ui.NewsfeedDisclosureFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NewsfeedDisclosureFragment.disclosureItemAdapter$lambda$2((ExpandableContentSectionItemView) obj, (UiExpandableContentSection) obj2);
            }
        });
        this.eventScreen = new Screen(Screen.Name.NEWSFEED_DISCLOSURE, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentNewsfeedDisclosureBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentNewsfeedDisclosureBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NewsfeedDisclosureDuxo getDuxo() {
        return (NewsfeedDisclosureDuxo) this.duxo.getValue();
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

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit disclosureItemAdapter$lambda$2(final ExpandableContentSectionItemView of, final UiExpandableContentSection item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.bind(item);
        ViewsKt.setLoggingConfig(of, new AutoLoggingConfig(false, false, 2, null));
        ViewsKt.eventData$default(of, false, new Function0() { // from class: com.robinhood.android.newsfeeddisclosure.ui.NewsfeedDisclosureFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsfeedDisclosureFragment.disclosureItemAdapter$lambda$2$lambda$1(of, item);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor disclosureItemAdapter$lambda$2$lambda$1(ExpandableContentSectionItemView expandableContentSectionItemView, UiExpandableContentSection uiExpandableContentSection) {
        return new UserInteractionEventDescriptor(uiExpandableContentSection.getHeader().getRaw(), null, expandableContentSectionItemView.getIsExpanded() ? UserInteractionEventData.Action.COLLAPSE : UserInteractionEventData.Action.EXPAND, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new DisclosureDropdown(uiExpandableContentSection.getIdentifier(), uiExpandableContentSection.getHeader().getRaw(), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -33554433, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.ROW, null, null, 6, null), null, 34, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    /* compiled from: NewsfeedDisclosureFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.newsfeeddisclosure.ui.NewsfeedDisclosureFragment$onViewCreated$1", m3645f = "NewsfeedDisclosureFragment.kt", m3646l = {82}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.newsfeeddisclosure.ui.NewsfeedDisclosureFragment$onViewCreated$1 */
    static final class C225911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C225911(Continuation<? super C225911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NewsfeedDisclosureFragment.this.new C225911(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C225911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: NewsfeedDisclosureFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.newsfeeddisclosure.ui.NewsfeedDisclosureFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ NewsfeedDisclosureFragment $tmp0;

            AnonymousClass1(NewsfeedDisclosureFragment newsfeedDisclosureFragment) {
                this.$tmp0 = newsfeedDisclosureFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, NewsfeedDisclosureFragment.class, "setState", "setState(Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(NewsfeedDisclosureViewState newsfeedDisclosureViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$setState = C225911.invokeSuspend$setState(this.$tmp0, newsfeedDisclosureViewState, continuation);
                return objInvokeSuspend$setState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((NewsfeedDisclosureViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<NewsfeedDisclosureViewState> stateFlow = NewsfeedDisclosureFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(NewsfeedDisclosureFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setState(NewsfeedDisclosureFragment newsfeedDisclosureFragment, NewsfeedDisclosureViewState newsfeedDisclosureViewState, Continuation continuation) {
            newsfeedDisclosureFragment.setState(newsfeedDisclosureViewState);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C225911(null), 1, null);
        RecyclerView recyclerView = getBinding().newsfeedDisclosureRecyclerView;
        recyclerView.setAdapter(this.disclosureItemAdapter);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), 1);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), C11048R.drawable.list_divider_themed);
        Intrinsics.checkNotNull(drawable);
        dividerItemDecoration.setDrawable(drawable);
        recyclerView.addItemDecoration(dividerItemDecoration);
        ScarletManager.putOverlay$default(getScarletManager(), NewsfeedDisclosureOverlay.INSTANCE, null, 2, null);
        getBinding().newsfeedDisclosureErrorView.setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.newsfeeddisclosure.ui.NewsfeedDisclosureFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsfeedDisclosureFragment.onViewCreated$lambda$4(this.f$0);
            }
        });
        RecyclerView newsfeedDisclosureRecyclerView = getBinding().newsfeedDisclosureRecyclerView;
        Intrinsics.checkNotNullExpressionValue(newsfeedDisclosureRecyclerView, "newsfeedDisclosureRecyclerView");
        if (!newsfeedDisclosureRecyclerView.isLaidOut() || newsfeedDisclosureRecyclerView.isLayoutRequested()) {
            newsfeedDisclosureRecyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.android.newsfeeddisclosure.ui.NewsfeedDisclosureFragment$onViewCreated$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    this.this$0.getBinding().newsfeedDisclosureContentViewGroup.setLayoutTransition(new LayoutTransition());
                    this.this$0.getBinding().newsfeedDisclosureContentViewGroup.getLayoutTransition().enableTransitionType(4);
                }
            });
        } else {
            getBinding().newsfeedDisclosureContentViewGroup.setLayoutTransition(new LayoutTransition());
            getBinding().newsfeedDisclosureContentViewGroup.getLayoutTransition().enableTransitionType(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(NewsfeedDisclosureFragment newsfeedDisclosureFragment) {
        newsfeedDisclosureFragment.getDuxo().retrieveDisclosureContent();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(NewsfeedDisclosureViewState state) {
        bindErrorView(state.getShowError());
        bindLoadingView(state.getShowLoading());
        bindNewsfeedDisclosureContent(state);
    }

    private final void bindErrorView(boolean showError) {
        ErrorView newsfeedDisclosureErrorView = getBinding().newsfeedDisclosureErrorView;
        Intrinsics.checkNotNullExpressionValue(newsfeedDisclosureErrorView, "newsfeedDisclosureErrorView");
        newsfeedDisclosureErrorView.setVisibility(showError ? 0 : 8);
    }

    private final void bindLoadingView(boolean showLoading) {
        ShimmerLoadingView newsfeedDisclosureLoadingView = getBinding().newsfeedDisclosureLoadingView;
        Intrinsics.checkNotNullExpressionValue(newsfeedDisclosureLoadingView, "newsfeedDisclosureLoadingView");
        newsfeedDisclosureLoadingView.setVisibility(showLoading ? 0 : 8);
    }

    private final void bindNewsfeedDisclosureContent(NewsfeedDisclosureViewState state) {
        CoordinatorLayout newsfeedDisclosureContentLayout = getBinding().newsfeedDisclosureContentLayout;
        Intrinsics.checkNotNullExpressionValue(newsfeedDisclosureContentLayout, "newsfeedDisclosureContentLayout");
        newsfeedDisclosureContentLayout.setVisibility(state.getShowContent() ? 0 : 8);
        if (state.getShowContent()) {
            UiExpandableContent content = state.getContent();
            if ((content != null ? content.getItems() : null) == null) {
                return;
            }
            getBinding().newsfeedDisclosureTitle.setText(state.getContent().getTitle());
            getBinding().newsfeedDisclosureSubtitle.setText(Markwons.toSpanned$default(getMarkwon(), state.getContent().getSubtitle(), null, 2, null));
            List<UiExpandableContentSection> items = state.getContent().getItems();
            if (items != null) {
                this.disclosureItemAdapter.submitList(items);
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.DISMISS, getEventScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        return super.onBackPressed();
    }

    /* compiled from: NewsfeedDisclosureFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/education/contracts/NewsfeedDisclosureKey;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureFragment;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-newsfeed-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<NewsfeedDisclosureKey>, FragmentWithArgsCompanion<NewsfeedDisclosureFragment, NewsfeedDisclosureKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public NewsfeedDisclosureKey getArgs(NewsfeedDisclosureFragment newsfeedDisclosureFragment) {
            return (NewsfeedDisclosureKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, newsfeedDisclosureFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public NewsfeedDisclosureFragment newInstance(NewsfeedDisclosureKey newsfeedDisclosureKey) {
            return (NewsfeedDisclosureFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, newsfeedDisclosureKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(NewsfeedDisclosureFragment newsfeedDisclosureFragment, NewsfeedDisclosureKey newsfeedDisclosureKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, newsfeedDisclosureFragment, newsfeedDisclosureKey);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(NewsfeedDisclosureKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance((Parcelable) key);
        }
    }

    /* compiled from: NewsfeedDisclosureFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/newsfeeddisclosure/ui/NewsfeedDisclosureFragment$NewsfeedDisclosureOverlay;", "Lcom/robinhood/scarlet/ScarletOverlay;", "<init>", "()V", "styleReference", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "Lcom/robinhood/scarlet/util/resource/StyleReference;", "getStyleReference", "()Lcom/robinhood/scarlet/util/resource/ResourceReference;", "priority", "", "getPriority", "()I", "feature-newsfeed-disclosure_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class NewsfeedDisclosureOverlay implements ScarletOverlay {
        public static final NewsfeedDisclosureOverlay INSTANCE = new NewsfeedDisclosureOverlay();
        private static final ResourceReferences4<StyleResource> styleReference = new DirectResourceReference(ResourceType.STYLE.INSTANCE, C22587R.style.ThemeOverlay_Robinhood_DesignSystem_NewsfeedDisclosure);

        @Override // com.robinhood.scarlet.ScarletOverlay
        public int getPriority() {
            return 2000;
        }

        private NewsfeedDisclosureOverlay() {
        }

        @Override // com.robinhood.scarlet.ScarletOverlay
        public ResourceReferences4<StyleResource> getStyleReference() {
            return styleReference;
        }
    }
}
