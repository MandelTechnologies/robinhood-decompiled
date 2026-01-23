package com.robinhood.android.inbox.p156ui.messages;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollEvent;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.jakewharton.rxbinding3.swiperefreshlayout.SwipeRefreshLayoutRefreshObservable2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.tabs.Scrollable;
import com.robinhood.android.common.p088ui.view.LoggedRecyclerView;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.VisibleItemsManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.inbox.C18721R;
import com.robinhood.android.inbox.databinding.FragmentInboxThreadListBinding;
import com.robinhood.android.inbox.p156ui.messages.ThreadListEvent;
import com.robinhood.android.inbox.p156ui.messages.ThreadListViewState;
import com.robinhood.android.lib.creditcard.p165ui.invite.CreditApplicationInviteBannerAdapter;
import com.robinhood.android.lib.creditcard.p165ui.invite.CreditApplicationInviteBannerDuxo4;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.support.contracts.CxChatFragmentKey;
import com.robinhood.shared.support.supportchat.ChatListItem;
import com.robinhood.shared.support.supportchat.SupportChatThreadRowView;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ThreadListFragment.kt */
@Metadata(m3635d1 = {"\u0000á\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u00012\b\u0007\u0018\u0000 r2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002qrB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010L\u001a\u00020*2\u0006\u0010M\u001a\u00020NH\u0016J\u0010\u0010O\u001a\u00020*2\u0006\u0010P\u001a\u00020QH\u0016J\u0012\u0010R\u001a\u00020*2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\u0018\u0010U\u001a\u00020*2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020YH\u0014J\u0010\u0010Z\u001a\u00020G2\u0006\u0010[\u001a\u00020EH\u0016J\u001a\u0010\\\u001a\u00020*2\u0006\u0010]\u001a\u00020^2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\b\u0010_\u001a\u00020*H\u0016J\b\u0010c\u001a\u00020GH\u0016J\b\u0010d\u001a\u00020*H\u0016J\b\u0010e\u001a\u00020*H\u0016J\u0016\u0010f\u001a\u00020*2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020C0hH\u0002J\u0012\u0010i\u001a\u00020*2\b\u0010[\u001a\u0004\u0018\u000100H\u0002J\u0016\u0010m\u001a\u00020*2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020p0oH\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0004\n\u0002\u00103R\u001b\u00104\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u001b\u001a\u0004\b6\u00107R\u001b\u00109\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u001b\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010A\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020C0BX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010H\u001a\u00020GX\u0096D¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0010\u0010K\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010`\u001a\u00020@X\u0096D¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u001a\u0010j\u001a\u0004\u0018\u00010@*\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006s"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/ThreadListFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/common/ui/tabs/Scrollable;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/inbox/ui/messages/ThreadListDuxo;", "getDuxo", "()Lcom/robinhood/android/inbox/ui/messages/ThreadListDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/inbox/databinding/FragmentInboxThreadListBinding;", "getBinding", "()Lcom/robinhood/android/inbox/databinding/FragmentInboxThreadListBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "headerAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/inbox/ui/messages/MessagesHeaderView;", "", "infoBannerAdapter", "Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "Lcom/robinhood/android/inbox/ui/messages/ThreadListViewState$InfoBannerType;", "supportChatAdapter", "Lcom/robinhood/shared/support/supportchat/SupportChatThreadRowView;", "Lcom/robinhood/shared/support/supportchat/ChatListItem;", "inboxThreadAdapter", "com/robinhood/android/inbox/ui/messages/ThreadListFragment$inboxThreadAdapter$1", "Lcom/robinhood/android/inbox/ui/messages/ThreadListFragment$inboxThreadAdapter$1;", "creditAppInviteAdapter", "Lcom/robinhood/android/lib/creditcard/ui/invite/CreditApplicationInviteBannerAdapter;", "getCreditAppInviteAdapter", "()Lcom/robinhood/android/lib/creditcard/ui/invite/CreditApplicationInviteBannerAdapter;", "creditAppInviteAdapter$delegate", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "getCompositeAdapter", "()Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "compositeAdapter$delegate", "seenThreadIds", "", "", "visibleItemsManager", "Lcom/robinhood/android/common/util/VisibleItemsManager;", "Lcom/robinhood/android/inbox/ui/messages/MessageThread;", "markAsReadMenuItem", "Landroid/view/MenuItem;", "isInSelectionMode", "", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "()Z", "latestSupportChatItem", "onAttach", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "onViewCreated", "view", "Landroid/view/View;", "onResume", "screenName", "getScreenName", "()Ljava/lang/String;", "onBackPressed", "scrollToTop", "onDestroyView", "updateInboxThreads", "state", "", "updateSupportChatList", "analyticsThreadState", "getAnalyticsThreadState", "(Lcom/robinhood/android/inbox/ui/messages/MessageThread;)Ljava/lang/String;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/inbox/ui/messages/ThreadListEvent;", "InfoBannerInflater", "Companion", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ThreadListFragment extends BaseFragment implements AutoLoggableFragment, Scrollable {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ThreadListFragment.class, "binding", "getBinding()Lcom/robinhood/android/inbox/databinding/FragmentInboxThreadListBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String SCREEN_NAME = "ThreadsList";
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: compositeAdapter$delegate, reason: from kotlin metadata */
    private final Lazy compositeAdapter;

    /* renamed from: creditAppInviteAdapter$delegate, reason: from kotlin metadata */
    private final Lazy creditAppInviteAdapter;
    public CrossSellLaunchManager crossSellLaunchManager;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final Screen eventScreen;
    private final SingleItemAdapter<MessagesHeaderView, Unit> headerAdapter;
    private final ThreadListFragment3 inboxThreadAdapter;
    private final SingleItemAdapter<RdsInfoBannerView, ThreadListViewState.InfoBannerType> infoBannerAdapter;
    private boolean isInSelectionMode;
    private ChatListItem latestSupportChatItem;
    private MenuItem markAsReadMenuItem;
    private final String screenName;
    private final Set<String> seenThreadIds;
    private final SingleItemAdapter<SupportChatThreadRowView, ChatListItem> supportChatAdapter;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    private final boolean useDesignSystemToolbar;
    private VisibleItemsManager<String, MessageThread> visibleItemsManager;

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<ThreadListEvent> event) {
        EventConsumer<ThreadListEvent> eventConsumerInvoke;
        EventConsumer<ThreadListEvent> eventConsumerInvoke2;
        if ((event.getData() instanceof ThreadListEvent.ManualRefreshComplete) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m15282invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m15282invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getBinding().swipeRefreshView.setRefreshing(false);
                }
            });
        }
        if (!(event.getData() instanceof ThreadListEvent.MarkSelectedThreadsAsReadError) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$handleEvent$$inlined$consumeIfType$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m15283invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m15283invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AbsErrorHandler.handleError$default(this.getActivityErrorHandler(), ((ThreadListEvent.MarkSelectedThreadsAsReadError) event.getData()).getThrowable(), false, 2, null);
            }
        });
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

    public ThreadListFragment() {
        super(C18721R.layout.fragment_inbox_thread_list);
        this.eventScreen = new Screen(Screen.Name.MESSAGES, null, null, null, 14, null);
        this.duxo = DuxosKt.duxo(this, ThreadListDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, ThreadListFragment2.INSTANCE);
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThreadListFragment.toolbarScrollAnimator_delegate$lambda$0(this.f$0);
            }
        });
        SingleItemAdapter.Companion companion = SingleItemAdapter.INSTANCE;
        this.headerAdapter = SingleItemAdapter.Companion.ofUnit$default(companion, MessagesHeaderView.INSTANCE, (DiffUtil.ItemCallback) null, (Function1) null, 6, (Object) null);
        this.infoBannerAdapter = SingleItemAdapter.Companion.of$default(companion, InfoBannerInflater.INSTANCE, (DiffUtil.ItemCallback) null, new Function2() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ThreadListFragment.infoBannerAdapter$lambda$2((RdsInfoBannerView) obj, (ThreadListViewState.InfoBannerType) obj2);
            }
        }, 2, (Object) null);
        this.supportChatAdapter = SingleItemAdapter.Companion.of$default(companion, SupportChatThreadRowView.INSTANCE, (DiffUtil.ItemCallback) null, new Function2() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ThreadListFragment.supportChatAdapter$lambda$4(this.f$0, (SupportChatThreadRowView) obj, (ChatListItem) obj2);
            }
        }, 2, (Object) null);
        this.inboxThreadAdapter = new ThreadListFragment3(this, ThreadRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new PropertyReference1Impl() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$inboxThreadAdapter$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((MessageThread) obj).getId();
            }
        }));
        this.creditAppInviteAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThreadListFragment.creditAppInviteAdapter_delegate$lambda$5(this.f$0);
            }
        });
        this.compositeAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThreadListFragment.compositeAdapter_delegate$lambda$7(this.f$0);
            }
        });
        this.seenThreadIds = new LinkedHashSet();
        this.useDesignSystemToolbar = true;
        this.screenName = SCREEN_NAME;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final CrossSellLaunchManager getCrossSellLaunchManager() {
        CrossSellLaunchManager crossSellLaunchManager = this.crossSellLaunchManager;
        if (crossSellLaunchManager != null) {
            return crossSellLaunchManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crossSellLaunchManager");
        return null;
    }

    public final void setCrossSellLaunchManager(CrossSellLaunchManager crossSellLaunchManager) {
        Intrinsics.checkNotNullParameter(crossSellLaunchManager, "<set-?>");
        this.crossSellLaunchManager = crossSellLaunchManager;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThreadListDuxo getDuxo() {
        return (ThreadListDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentInboxThreadListBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInboxThreadListBinding) value;
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$0(ThreadListFragment threadListFragment) {
        RhToolbar rhToolbar = threadListFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        return new ToolbarScrollAnimator(rhToolbar, threadListFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 60, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit infoBannerAdapter$lambda$2(RdsInfoBannerView of, final ThreadListViewState.InfoBannerType it) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(it, "it");
        StringResource text = it.getText();
        Resources resources = of.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        of.setText(text.getText(resources));
        ViewsKt.eventData$default(of, false, new Function0() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThreadListFragment.infoBannerAdapter$lambda$2$lambda$1(it);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor infoBannerAdapter$lambda$2$lambda$1(ThreadListViewState.InfoBannerType infoBannerType) {
        return new UserInteractionEventDescriptor(null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(null, null, null, null, null, null, null, null, null, 0, infoBannerType.getAnalyticsType(), null, null, null, null, null, null, 0, null, false, null, false, null, 8387583, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.INFO_BANNER, null, null, 6, null), null, 39, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit supportChatAdapter$lambda$4(final ThreadListFragment threadListFragment, SupportChatThreadRowView of, final ChatListItem chatListItem) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(chatListItem, "chatListItem");
        of.bind(chatListItem);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThreadListFragment.supportChatAdapter$lambda$4$lambda$3(this.f$0, chatListItem);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit supportChatAdapter$lambda$4$lambda$3(ThreadListFragment threadListFragment, ChatListItem chatListItem) {
        Navigator navigator = threadListFragment.getNavigator();
        android.content.Context contextRequireContext = threadListFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new CxChatFragmentKey.InquiryId(chatListItem.getId(), false, false, false, null, 28, null), false, false, true, false, null, false, null, null, 996, null);
        return Unit.INSTANCE;
    }

    private final CreditApplicationInviteBannerAdapter getCreditAppInviteAdapter() {
        return (CreditApplicationInviteBannerAdapter) this.creditAppInviteAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreditApplicationInviteBannerAdapter creditAppInviteAdapter_delegate$lambda$5(ThreadListFragment threadListFragment) {
        android.content.Context contextRequireContext = threadListFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return new CreditApplicationInviteBannerAdapter(contextRequireContext, threadListFragment.getNavigator(), CreditApplicationInviteBannerDuxo4.INBOX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CompositeAdapter getCompositeAdapter() {
        return (CompositeAdapter) this.compositeAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompositeAdapter compositeAdapter_delegate$lambda$7(ThreadListFragment threadListFragment) {
        CompositeAdapter compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{threadListFragment.headerAdapter, threadListFragment.infoBannerAdapter, threadListFragment.supportChatAdapter, threadListFragment.getCreditAppInviteAdapter(), threadListFragment.inboxThreadAdapter});
        compositeAdapter.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT);
        return compositeAdapter;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(C18721R.string.inbox_messages_header_title);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        this.inboxThreadAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment.onCreate.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int positionStart, int itemCount) {
                VisibleItemsManager visibleItemsManager = ThreadListFragment.this.visibleItemsManager;
                if (visibleItemsManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
                    visibleItemsManager = null;
                }
                visibleItemsManager.update();
            }
        });
        getCreditAppInviteAdapter().bind(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        inflater.inflate(C18721R.menu.menu_thread_list, menu);
        this.markAsReadMenuItem = menu.findItem(C18721R.id.action_thread_list_mark_as_read);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C18721R.id.action_thread_list_mark_as_read) {
            Iterator<String> it = getDuxo().getSelectedThreads().iterator();
            while (it.hasNext()) {
                AnalyticsLogger.DefaultImpls.logUserAction$default(getAnalytics(), AnalyticsStrings.USER_ACTION_THREADS_LIST_BROWSE, "mark_as_read", it.next(), null, 8, null);
            }
            getDuxo().markSelectedThreadsAsRead();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity());
        getBinding().recyclerView.setLayoutManager(linearLayoutManager);
        LoggedRecyclerView recyclerView = getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        bindAdapter(recyclerView, getCompositeAdapter());
        getBinding().recyclerView.setItemAnimator(null);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        getBinding().swipeRefreshView.setColorSchemeColors(ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorPrimary));
        SwipeRefreshLayout swipeRefreshView = getBinding().swipeRefreshView;
        Intrinsics.checkNotNullExpressionValue(swipeRefreshView, "swipeRefreshView");
        LifecycleHost.DefaultImpls.bind$default(this, SwipeRefreshLayoutRefreshObservable2.refreshes(swipeRefreshView), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadListFragment.onViewCreated$lambda$9(this.f$0, (Unit) obj);
            }
        });
        this.seenThreadIds.clear();
        VisibleItemsManager<String, MessageThread> visibleItemsManager = new VisibleItemsManager<>(linearLayoutManager, new Function0() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(ThreadListFragment.onViewCreated$lambda$10(this.f$0));
            }
        }, new Function1() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadListFragment.onViewCreated$lambda$11(this.f$0, ((Integer) obj).intValue());
            }
        }, new Function1() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadListFragment.onViewCreated$lambda$12((MessageThread) obj);
            }
        });
        this.visibleItemsManager = visibleItemsManager;
        visibleItemsManager.setCallbacks(new VisibleItemsManager.Callbacks<MessageThread>() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment.onViewCreated.5
            @Override // com.robinhood.android.common.util.VisibleItemsManager.Callbacks
            public void onItemDisappeared(MessageThread item, long durationVisible) {
                Intrinsics.checkNotNullParameter(item, "item");
            }

            @Override // com.robinhood.android.common.util.VisibleItemsManager.Callbacks
            public void onItemAppeared(MessageThread item) {
                Intrinsics.checkNotNullParameter(item, "item");
                if (ThreadListFragment.this.seenThreadIds.contains(item.getId())) {
                    return;
                }
                ThreadListFragment.this.seenThreadIds.add(item.getId());
                AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(ThreadListFragment.this.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_THREADS_LIST, item.getId(), ThreadListFragment.this.getAnalyticsThreadState(item), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
            }
        });
        LoggedRecyclerView recyclerView2 = getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
        LifecycleHost.DefaultImpls.bind$default(this, RxRecyclerView.scrollEvents(recyclerView2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadListFragment.onViewCreated$lambda$13(this.f$0, (RecyclerViewScrollEvent) obj);
            }
        });
        getBinding().errorView.setPrimaryButtonEventData(new Function0() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThreadListFragment.onViewCreated$lambda$14();
            }
        });
        getBinding().errorView.setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ThreadListFragment.onViewCreated$lambda$15(this.f$0);
            }
        });
        BaseFragment.collectDuxoState$default(this, null, new C187549(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9(ThreadListFragment threadListFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        threadListFragment.getDuxo().refreshThreads();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onViewCreated$lambda$10(ThreadListFragment threadListFragment) {
        return threadListFragment.getCompositeAdapter().getSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageThread onViewCreated$lambda$11(ThreadListFragment threadListFragment, int i) {
        CompositeAdapter.Target targetAdapterPositionToTarget = threadListFragment.getCompositeAdapter().adapterPositionToTarget(i);
        if (!Intrinsics.areEqual(targetAdapterPositionToTarget.getChild().getValue(), threadListFragment.inboxThreadAdapter)) {
            return null;
        }
        return threadListFragment.inboxThreadAdapter.getItem(targetAdapterPositionToTarget.getChildPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onViewCreated$lambda$12(MessageThread VisibleItemsManager) {
        Intrinsics.checkNotNullParameter(VisibleItemsManager, "$this$VisibleItemsManager");
        return VisibleItemsManager.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$13(ThreadListFragment threadListFragment, RecyclerViewScrollEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ToolbarScrollAnimator toolbarScrollAnimator = threadListFragment.getToolbarScrollAnimator();
        LoggedRecyclerView recyclerView = threadListFragment.getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        toolbarScrollAnimator.dispatchScroll(recyclerView);
        VisibleItemsManager<String, MessageThread> visibleItemsManager = threadListFragment.visibleItemsManager;
        if (visibleItemsManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager = null;
        }
        visibleItemsManager.update();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$14() {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.RETRY, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$15(ThreadListFragment threadListFragment) {
        threadListFragment.getLifecycleScope().launchWhenResumed(new ThreadListFragment5(threadListFragment, null));
        return Unit.INSTANCE;
    }

    /* compiled from: ThreadListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9", m3645f = "ThreadListFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9 */
    static final class C187549 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C187549(Continuation<? super C187549> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C187549 c187549 = ThreadListFragment.this.new C187549(continuation);
            c187549.L$0 = obj;
            return c187549;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C187549) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ThreadListFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9$1", m3645f = "ThreadListFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ThreadListFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ThreadListFragment threadListFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = threadListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ThreadListFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C501851 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ ThreadListFragment $tmp0;

                C501851(ThreadListFragment threadListFragment) {
                    this.$tmp0 = threadListFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, ThreadListFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(Event<ThreadListEvent> event, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$handleEvent = AnonymousClass1.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                    return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((Event<ThreadListEvent>) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    C501851 c501851 = new C501851(this.this$0);
                    this.label = 1;
                    if (flowFilterNotNull.collect(c501851, this) == coroutine_suspended) {
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
            public static final /* synthetic */ Object invokeSuspend$handleEvent(ThreadListFragment threadListFragment, Event event, Continuation continuation) {
                threadListFragment.handleEvent(event);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(ThreadListFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(ThreadListFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(ThreadListFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(ThreadListFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: ThreadListFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9$2", m3645f = "ThreadListFragment.kt", m3646l = {EnumC7081g.f2781x2ba65ba3}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ThreadListFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ThreadListFragment threadListFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = threadListFragment;
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
                    final StateFlow<ThreadListViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<List<? extends MessageThread>>() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9$2$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super List<? extends MessageThread>> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9$2$invokeSuspend$$inlined$map$1$2", m3645f = "ThreadListFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    List<MessageThread> inboxThreads = ((ThreadListViewState) obj).getInboxThreads();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(inboxThreads, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    });
                    final ThreadListFragment threadListFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment.onViewCreated.9.2.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((List<MessageThread>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(List<MessageThread> list, Continuation<? super Unit> continuation) {
                            threadListFragment.getDuxo().postSawBadge();
                            threadListFragment.updateInboxThreads(list);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: ThreadListFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9$3", m3645f = "ThreadListFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ThreadListFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ThreadListFragment threadListFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = threadListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<ThreadListViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Optional<? extends ChatListItem>>() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9$3$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Optional<? extends ChatListItem>> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9$3$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9$3$invokeSuspend$$inlined$map$1$2", m3645f = "ThreadListFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Optional optionalAsOptional = Optional3.asOptional(((ThreadListViewState) obj).getDisplaySupportChatItem());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    });
                    final ThreadListFragment threadListFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment.onViewCreated.9.3.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Optional<ChatListItem>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(Optional<ChatListItem> optional, Continuation<? super Unit> continuation) {
                            threadListFragment.updateSupportChatList(optional.getOrNull());
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: ThreadListFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9$4", m3645f = "ThreadListFragment.kt", m3646l = {333}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.inbox.ui.messages.ThreadListFragment$onViewCreated$9$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ThreadListFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(ThreadListFragment threadListFragment, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = threadListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<ThreadListViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    final ThreadListFragment threadListFragment = this.this$0;
                    FlowCollector<? super ThreadListViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment.onViewCreated.9.4.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((ThreadListViewState) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(ThreadListViewState threadListViewState, Continuation<? super Unit> continuation) {
                            threadListFragment.isInSelectionMode = threadListViewState.isInSelectionMode();
                            MenuItem menuItem = threadListFragment.markAsReadMenuItem;
                            if (menuItem != null) {
                                menuItem.setVisible(threadListFragment.isInSelectionMode);
                            }
                            RdsProgressBar progressBar = threadListFragment.getBinding().progressBar;
                            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                            progressBar.setVisibility(threadListViewState.getShowLoadingView() ? 0 : 8);
                            SwipeRefreshLayout swipeRefreshView = threadListFragment.getBinding().swipeRefreshView;
                            Intrinsics.checkNotNullExpressionValue(swipeRefreshView, "swipeRefreshView");
                            swipeRefreshView.setVisibility(threadListViewState.getShowContent() ? 0 : 8);
                            ErrorView errorView = threadListFragment.getBinding().errorView;
                            Intrinsics.checkNotNullExpressionValue(errorView, "errorView");
                            errorView.setVisibility(threadListViewState.getShowErrorView() ? 0 : 8);
                            threadListFragment.infoBannerAdapter.setData(threadListViewState.getInfoBannerType());
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
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        LoggedRecyclerView recyclerView = getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        toolbarScrollAnimator.dispatchScroll(recyclerView);
        Observable<Long> observableInterval = Observable.interval(1L, TimeUnit.MINUTES, AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(observableInterval, "interval(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableInterval, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ThreadListFragment.onResume$lambda$16(this.f$0, (Long) obj);
            }
        });
        CrossSellLaunchManager.initIacBottomSheetPolling$default(getCrossSellLaunchManager(), this, IacAlertSheetLocation.TOP_LEVEL_MESSAGES, null, null, null, null, null, null, null, 508, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$16(ThreadListFragment threadListFragment, Long l) {
        threadListFragment.inboxThreadAdapter.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (this.isInSelectionMode) {
            getDuxo().clearSelectedThreads();
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.tabs.Scrollable
    public void scrollToTop() {
        getBinding().recyclerView.smoothScrollToPosition(0);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ChatListItem chatListItem = this.latestSupportChatItem;
        if (chatListItem != null) {
            getDuxo().markChatIssueAsShown(chatListItem.getId(), chatListItem.getCanLogImpression());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateInboxThreads(List<MessageThread> state) {
        this.inboxThreadAdapter.submitList(state, new Runnable() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment.updateInboxThreads.1
            @Override // java.lang.Runnable
            public final void run() {
                ThreadListFragment.this.getCompositeAdapter().setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.ALLOW);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSupportChatList(final ChatListItem item) {
        this.supportChatAdapter.setData(item);
        getBinding().recyclerView.post(new Runnable() { // from class: com.robinhood.android.inbox.ui.messages.ThreadListFragment.updateSupportChatList.1
            @Override // java.lang.Runnable
            public final void run() {
                ThreadListFragment.this.getCompositeAdapter().setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.ALLOW);
                ThreadListFragment.this.latestSupportChatItem = item;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAnalyticsThreadState(MessageThread messageThread) {
        if (messageThread.isCritical()) {
            return AnalyticsStrings.BUTTON_THREADS_LIST_DESCRIPTION_CRITICAL;
        }
        if (messageThread.isUnread()) {
            return AnalyticsStrings.BUTTON_THREADS_LIST_DESCRIPTION_UNREAD;
        }
        return null;
    }

    /* compiled from: ThreadListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/ThreadListFragment$InfoBannerInflater;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class InfoBannerInflater implements Inflater<RdsInfoBannerView> {
        public static final InfoBannerInflater INSTANCE = new InfoBannerInflater();

        private InfoBannerInflater() {
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsInfoBannerView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) Inflater.INSTANCE.include(C18721R.layout.include_thread_list_banner_view).inflate(parent);
            ViewsKt.setLoggingConfig(rdsInfoBannerView, new AutoLoggingConfig(false, false));
            return rdsInfoBannerView;
        }
    }

    /* compiled from: ThreadListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/messages/ThreadListFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$InboxThreadList;", "<init>", "()V", "SCREEN_NAME", "", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.InboxThreadList> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.InboxThreadList key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new ThreadListFragment();
        }
    }
}
