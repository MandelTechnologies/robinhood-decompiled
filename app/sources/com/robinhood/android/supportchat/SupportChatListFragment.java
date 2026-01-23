package com.robinhood.android.supportchat;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollEvent;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.supportchat.SupportChatListEvent;
import com.robinhood.android.supportchat.SupportChatListViewState;
import com.robinhood.android.supportchat.databinding.FragmentSupportChatListBinding;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.support.contracts.CxChatFragmentKey;
import com.robinhood.shared.support.contracts.SupportChatListFragmentKey;
import com.robinhood.shared.support.supportchat.ChatListItem;
import com.robinhood.shared.support.supportchat.SupportChatThreadRowView;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import kotlin.ExceptionsH;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SupportChatListFragment.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u00012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,H\u0016J\u001a\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0017R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00180\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\"X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u000e\u001a\u0004\b'\u0010(¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatListFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/supportchat/SupportChatListDuxo;", "getDuxo", "()Lcom/robinhood/android/supportchat/SupportChatListDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/supportchat/databinding/FragmentSupportChatListBinding;", "getBinding", "()Lcom/robinhood/android/supportchat/databinding/FragmentSupportChatListBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "headerAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/designsystem/text/RhTextView;", "", "emptyStateAdapter", "Landroidx/constraintlayout/widget/ConstraintLayout;", "chatListAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/shared/support/supportchat/SupportChatThreadRowView;", "Lcom/robinhood/shared/support/supportchat/ChatListItem;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SupportChatListFragment extends BaseFragment implements AutoLoggableFragment {
    private final CompositeAdapter adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final GenericListAdapter<SupportChatThreadRowView, ChatListItem> chatListAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final SingleItemAdapter<ConstraintLayout, Unit> emptyStateAdapter;
    private final Screen eventScreen;
    private final SingleItemAdapter<RhTextView, Unit> headerAdapter;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SupportChatListFragment.class, "binding", "getBinding()Lcom/robinhood/android/supportchat/databinding/FragmentSupportChatListBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

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

    public SupportChatListFragment() {
        super(C29104R.layout.fragment_support_chat_list);
        this.eventScreen = new Screen(Screen.Name.CX_SUPPORT_CASES, null, null, null, 14, null);
        this.duxo = DuxosKt.duxo(this, SupportChatListDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, SupportChatListFragment2.INSTANCE);
        SingleItemAdapter.Companion companion = SingleItemAdapter.INSTANCE;
        SingleItemAdapter<RhTextView, Unit> singleItemAdapterOfUnit$default = SingleItemAdapter.Companion.ofUnit$default(companion, C29104R.layout.item_support_chat_list_title, (DiffUtil.ItemCallback) null, (Function1) null, 6, (Object) null);
        this.headerAdapter = singleItemAdapterOfUnit$default;
        SingleItemAdapter<ConstraintLayout, Unit> singleItemAdapterOfUnit$default2 = SingleItemAdapter.Companion.ofUnit$default(companion, C29104R.layout.item_support_chat_list_empty_state, (DiffUtil.ItemCallback) null, (Function1) null, 6, (Object) null);
        singleItemAdapterOfUnit$default2.setData(null);
        this.emptyStateAdapter = singleItemAdapterOfUnit$default2;
        GenericListAdapter<SupportChatThreadRowView, ChatListItem> genericListAdapterM2987of = GenericListAdapter.INSTANCE.m2987of(SupportChatThreadRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.supportchat.SupportChatListFragment$chatListAdapter$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((ChatListItem) obj).getId();
            }
        }), new Function2() { // from class: com.robinhood.android.supportchat.SupportChatListFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SupportChatListFragment.chatListAdapter$lambda$2(this.f$0, (SupportChatThreadRowView) obj, (ChatListItem) obj2);
            }
        });
        this.chatListAdapter = genericListAdapterM2987of;
        this.adapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{singleItemAdapterOfUnit$default, singleItemAdapterOfUnit$default2, genericListAdapterM2987of});
        this.useDesignSystemToolbar = true;
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.supportchat.SupportChatListFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupportChatListFragment.toolbarScrollAnimator_delegate$lambda$3(this.f$0);
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SupportChatListDuxo getDuxo() {
        return (SupportChatListDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentSupportChatListBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSupportChatListBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit chatListAdapter$lambda$2(final SupportChatListFragment supportChatListFragment, SupportChatThreadRowView of, final ChatListItem chatListItem) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(chatListItem, "chatListItem");
        of.bind(chatListItem);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.supportchat.SupportChatListFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupportChatListFragment.chatListAdapter$lambda$2$lambda$1(this.f$0, chatListItem);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit chatListAdapter$lambda$2$lambda$1(SupportChatListFragment supportChatListFragment, ChatListItem chatListItem) {
        Navigator navigator = supportChatListFragment.getNavigator();
        android.content.Context contextRequireContext = supportChatListFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new CxChatFragmentKey.InquiryId(chatListItem.getId(), false, false, false, null, 28, null), false, false, true, false, null, false, null, null, 996, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$3(SupportChatListFragment supportChatListFragment) {
        RhToolbar rhToolbar = supportChatListFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        return new ToolbarScrollAnimator(rhToolbar, supportChatListFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 60, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().supportChatListSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.robinhood.android.supportchat.SupportChatListFragment.onViewCreated.1

            /* compiled from: SupportChatListFragment.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListFragment$onViewCreated$1$1", m3645f = "SupportChatListFragment.kt", m3646l = {100}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.supportchat.SupportChatListFragment$onViewCreated$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ SupportChatListFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SupportChatListFragment supportChatListFragment, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = supportChatListFragment;
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
                        SupportChatListDuxo duxo = this.this$0.getDuxo();
                        this.label = 1;
                        if (duxo.refresh(this) == coroutine_suspended) {
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
            }

            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                BuildersKt__Builders_commonKt.launch$default(SupportChatListFragment.this.getLifecycleScope(), null, null, new AnonymousClass1(SupportChatListFragment.this, null), 3, null);
            }
        });
        RecyclerView recyclerView = getBinding().supportChatListRecyclerView;
        recyclerView.setAdapter(this.adapter);
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        Intrinsics.checkNotNull(recyclerView);
        LifecycleHost.DefaultImpls.bind$default(this, RxRecyclerView.scrollEvents(recyclerView), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.supportchat.SupportChatListFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportChatListFragment.onViewCreated$lambda$6$lambda$5(this.f$0, (RecyclerViewScrollEvent) obj);
            }
        });
        getBinding().supportChatListErrorView.setPrimaryButtonEventData(new Function0() { // from class: com.robinhood.android.supportchat.SupportChatListFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupportChatListFragment.onViewCreated$lambda$7();
            }
        });
        getBinding().supportChatListErrorView.setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.supportchat.SupportChatListFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupportChatListFragment.onViewCreated$lambda$8(this.f$0);
            }
        });
        BaseFragment.collectDuxoState$default(this, null, new C291255(null), 1, null);
        getLifecycleScope().launchWhenStarted(new C291266(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$5(SupportChatListFragment supportChatListFragment, RecyclerViewScrollEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ToolbarScrollAnimator toolbarScrollAnimator = supportChatListFragment.getToolbarScrollAnimator();
        RecyclerView supportChatListRecyclerView = supportChatListFragment.getBinding().supportChatListRecyclerView;
        Intrinsics.checkNotNullExpressionValue(supportChatListRecyclerView, "supportChatListRecyclerView");
        toolbarScrollAnimator.dispatchScroll(supportChatListRecyclerView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$7() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.RETRY, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8(SupportChatListFragment supportChatListFragment) {
        BuildersKt__Builders_commonKt.launch$default(supportChatListFragment.getLifecycleScope(), null, null, new SupportChatListFragment4(supportChatListFragment, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: SupportChatListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListFragment$onViewCreated$5", m3645f = "SupportChatListFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.SupportChatListFragment$onViewCreated$5 */
    static final class C291255 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C291255(Continuation<? super C291255> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C291255 c291255 = SupportChatListFragment.this.new C291255(continuation);
            c291255.L$0 = obj;
            return c291255;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291255) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SupportChatListFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListFragment$onViewCreated$5$1", m3645f = "SupportChatListFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.SupportChatListFragment$onViewCreated$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SupportChatListFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SupportChatListFragment supportChatListFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = supportChatListFragment;
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
                    StateFlow<SupportChatListViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    final SupportChatListFragment supportChatListFragment = this.this$0;
                    FlowCollector<? super SupportChatListViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.supportchat.SupportChatListFragment.onViewCreated.5.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((SupportChatListViewState) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(SupportChatListViewState supportChatListViewState, Continuation<? super Unit> continuation) {
                            ShimmerLoadingView supportChatListLoadingView = supportChatListFragment.getBinding().supportChatListLoadingView;
                            Intrinsics.checkNotNullExpressionValue(supportChatListLoadingView, "supportChatListLoadingView");
                            supportChatListLoadingView.setVisibility(supportChatListViewState instanceof SupportChatListViewState.Loading ? 0 : 8);
                            boolean z = supportChatListViewState instanceof SupportChatListViewState.Success;
                            supportChatListFragment.emptyStateAdapter.setData((z && ((SupportChatListViewState.Success) supportChatListViewState).getShowEmptyState()) ? Unit.INSTANCE : null);
                            GenericListAdapter genericListAdapter = supportChatListFragment.chatListAdapter;
                            SupportChatListViewState.Success success = z ? (SupportChatListViewState.Success) supportChatListViewState : null;
                            genericListAdapter.submitList(success != null ? success.getDisplayChatList() : null);
                            ErrorView supportChatListErrorView = supportChatListFragment.getBinding().supportChatListErrorView;
                            Intrinsics.checkNotNullExpressionValue(supportChatListErrorView, "supportChatListErrorView");
                            supportChatListErrorView.setVisibility(supportChatListViewState instanceof SupportChatListViewState.Failed ? 0 : 8);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
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
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(SupportChatListFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(SupportChatListFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: SupportChatListFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListFragment$onViewCreated$5$2", m3645f = "SupportChatListFragment.kt", m3646l = {144}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.SupportChatListFragment$onViewCreated$5$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SupportChatListFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SupportChatListFragment supportChatListFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = supportChatListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    final SupportChatListFragment supportChatListFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.supportchat.SupportChatListFragment.onViewCreated.5.2.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<SupportChatListEvent>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<SupportChatListEvent> event, Continuation<? super Unit> continuation) {
                            EventConsumer<SupportChatListEvent> eventConsumerInvoke;
                            final SupportChatListFragment supportChatListFragment2 = supportChatListFragment;
                            if ((event.getData() instanceof SupportChatListEvent.ManualChatListRefreshComplete) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.supportchat.SupportChatListFragment$onViewCreated$5$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m19132invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m19132invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        supportChatListFragment2.getBinding().supportChatListSwipeRefreshLayout.setRefreshing(false);
                                    }
                                });
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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
        }
    }

    /* compiled from: SupportChatListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListFragment$onViewCreated$6", m3645f = "SupportChatListFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.SupportChatListFragment$onViewCreated$6 */
    static final class C291266 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C291266(Continuation<? super C291266> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportChatListFragment.this.new C291266(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291266) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0038 -> B:12:0x003b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r6)
                goto L3b
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.ResultKt.throwOnFailure(r6)
                com.robinhood.android.supportchat.SupportChatListFragment r6 = com.robinhood.android.supportchat.SupportChatListFragment.this
                com.robinhood.android.common.util.transition.ToolbarScrollAnimator r6 = com.robinhood.android.supportchat.SupportChatListFragment.access$getToolbarScrollAnimator(r6)
                com.robinhood.android.supportchat.SupportChatListFragment r1 = com.robinhood.android.supportchat.SupportChatListFragment.this
                com.robinhood.android.supportchat.databinding.FragmentSupportChatListBinding r1 = com.robinhood.android.supportchat.SupportChatListFragment.access$getBinding(r1)
                androidx.recyclerview.widget.RecyclerView r1 = r1.supportChatListRecyclerView
                java.lang.String r3 = "supportChatListRecyclerView"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                r6.dispatchScroll(r1)
            L30:
                r5.label = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r6 != r0) goto L3b
                return r0
            L3b:
                com.robinhood.android.supportchat.SupportChatListFragment r6 = com.robinhood.android.supportchat.SupportChatListFragment.this
                com.robinhood.utils.ui.view.recyclerview.GenericListAdapter r6 = com.robinhood.android.supportchat.SupportChatListFragment.access$getChatListAdapter$p(r6)
                r6.notifyDataSetChanged()
                goto L30
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.supportchat.SupportChatListFragment.C291266.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SupportChatListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatListFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/shared/support/contracts/SupportChatListFragmentKey;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<SupportChatListFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(SupportChatListFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new SupportChatListFragment();
        }
    }
}
