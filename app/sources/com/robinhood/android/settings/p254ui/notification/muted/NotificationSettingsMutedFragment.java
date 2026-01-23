package com.robinhood.android.settings.p254ui.notification.muted;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.navigation.FragmentResolverCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.data.ThreadNotificationSettingsSource;
import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.p254ui.notification.muted.NotificationSettingsMutedAdapter;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ApiNotificationThreadSettingsItem;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.settings.contracts.NotificationSettingsMutedFragmentKey;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: NotificationSettingsMutedFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001DB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u00100\u001a\u00020*2\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020*H\u0016J\b\u00104\u001a\u00020*H\u0016J\b\u00105\u001a\u00020*H\u0016J\u0010\u00106\u001a\u00020*2\u0006\u00107\u001a\u000208H\u0016J\u0018\u00109\u001a\u00020*2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0014J\u0010\u0010A\u001a\u00020*2\u0006\u0010B\u001a\u00020CH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0017\u0010\u0014R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0004\n\u0002\u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\n\u001a\u0004\b&\u0010'R\u0014\u0010>\u001a\u00020#X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedAdapter$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedDuxo;", "getDuxo", "()Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "emptyStateTitle", "Landroid/widget/TextView;", "getEmptyStateTitle", "()Landroid/widget/TextView;", "emptyStateTitle$delegate", "emptyStateDescription", "getEmptyStateDescription", "emptyStateDescription$delegate", "adapter", "Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedAdapter;", "searchItem", "Landroid/view/MenuItem;", "searchView", "Landroidx/appcompat/widget/SearchView;", "isIconified", "", "Ljava/lang/Boolean;", "filter", "", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onAttach", "context", "Landroid/content/Context;", "onResume", "onDetach", "onStop", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "screenName", "getScreenName", "()Ljava/lang/String;", "onThreadSettingsItemClicked", "threadSettingsItem", "Lcom/robinhood/models/api/ApiNotificationThreadSettingsItem;", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NotificationSettingsMutedFragment extends BaseFragment implements NotificationSettingsMutedAdapter.Callbacks {
    private final NotificationSettingsMutedAdapter adapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: emptyStateDescription$delegate, reason: from kotlin metadata */
    private final Interfaces2 emptyStateDescription;

    /* renamed from: emptyStateTitle$delegate, reason: from kotlin metadata */
    private final Interfaces2 emptyStateTitle;
    private String filter;
    private Boolean isIconified;

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 recyclerView;
    private final String screenName;
    private MenuItem searchItem;
    private SearchView searchView;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NotificationSettingsMutedFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), Reflection.property1(new PropertyReference1Impl(NotificationSettingsMutedFragment.class, "emptyStateTitle", "getEmptyStateTitle()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(NotificationSettingsMutedFragment.class, "emptyStateDescription", "getEmptyStateDescription()Landroid/widget/TextView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public NotificationSettingsMutedFragment() {
        super(C28315R.layout.fragment_notification_muted);
        this.duxo = OldDuxos.oldDuxo(this, NotificationSettingsMutedDuxo.class);
        this.recyclerView = bindView(C28315R.id.recycler_view);
        this.emptyStateTitle = bindView(C28315R.id.empty_state_title);
        this.emptyStateDescription = bindView(C28315R.id.empty_state_description);
        this.adapter = new NotificationSettingsMutedAdapter();
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.settings.ui.notification.muted.NotificationSettingsMutedFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotificationSettingsMutedFragment.toolbarScrollAnimator_delegate$lambda$0(this.f$0);
            }
        });
        this.screenName = AnalyticsStrings.MUTED_SETTINGS_SCREEN_NAME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationSettingsMutedDuxo getDuxo() {
        return (NotificationSettingsMutedDuxo) this.duxo.getValue();
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue(this, $$delegatedProperties[0]);
    }

    private final TextView getEmptyStateTitle() {
        return (TextView) this.emptyStateTitle.getValue(this, $$delegatedProperties[1]);
    }

    private final TextView getEmptyStateDescription() {
        return (TextView) this.emptyStateDescription.getValue(this, $$delegatedProperties[2]);
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$0(NotificationSettingsMutedFragment notificationSettingsMutedFragment) {
        RhToolbar rhToolbar = notificationSettingsMutedFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        return new ToolbarScrollAnimator(rhToolbar, notificationSettingsMutedFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 52, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.adapter.setCallbacks(this);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ToolbarScrollAnimator.subscribe$default(getToolbarScrollAnimator(), getRecyclerView(), this, null, 4, null);
        bindAdapter(getRecyclerView(), this.adapter);
        getRecyclerView().setLayoutManager(new LinearLayoutManager(getContext()));
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getToolbarScrollAnimator().dispatchScroll(getRecyclerView());
        Observable<NotificationSettingsMutedViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.notification.muted.NotificationSettingsMutedFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationSettingsMutedFragment.onResume$lambda$2(this.f$0, (NotificationSettingsMutedViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(NotificationSettingsMutedFragment notificationSettingsMutedFragment, NotificationSettingsMutedViewState notificationSettingsMutedViewState) {
        notificationSettingsMutedFragment.getEmptyStateTitle().setVisibility(notificationSettingsMutedViewState.getShowEmptyState() ? 0 : 8);
        notificationSettingsMutedFragment.getEmptyStateDescription().setVisibility(notificationSettingsMutedViewState.getShowEmptyState() ? 0 : 8);
        notificationSettingsMutedFragment.getRecyclerView().setVisibility(notificationSettingsMutedViewState.getShowListView() ? 0 : 8);
        MenuItem menuItem = notificationSettingsMutedFragment.searchItem;
        if (menuItem == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchItem");
            menuItem = null;
        }
        menuItem.setVisible(notificationSettingsMutedViewState.getShowSearchIcon());
        notificationSettingsMutedFragment.getEmptyStateTitle().setText(notificationSettingsMutedViewState.getEmptyStateTitleText());
        notificationSettingsMutedFragment.getEmptyStateDescription().setText(notificationSettingsMutedViewState.getEmptyStateDescriptionText());
        notificationSettingsMutedFragment.filter = notificationSettingsMutedViewState.getFilter();
        if (notificationSettingsMutedViewState.getShowListView()) {
            notificationSettingsMutedFragment.adapter.submitList(notificationSettingsMutedViewState.getFilteredThreadSettingsItem());
        }
        ErrorHandlers.handleErrorEvent(notificationSettingsMutedFragment.getActivityErrorHandler(), notificationSettingsMutedViewState.getThreadSettingsError());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        SearchView searchView = this.searchView;
        if (searchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchView");
            searchView = null;
        }
        this.isIconified = Boolean.valueOf(searchView.isIconified());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(getResources().getString(C28315R.string.setting_notifications_muted_tab_title));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C28315R.menu.menu_search, menu);
        MenuItem menuItemFindItem = menu.findItem(C28315R.id.action_search);
        this.searchItem = menuItemFindItem;
        SearchView searchView = null;
        if (menuItemFindItem == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchItem");
            menuItemFindItem = null;
        }
        View actionView = menuItemFindItem.getActionView();
        Intrinsics.checkNotNull(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView2 = (SearchView) actionView;
        this.searchView = searchView2;
        if (searchView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchView");
            searchView2 = null;
        }
        searchView2.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: com.robinhood.android.settings.ui.notification.muted.NotificationSettingsMutedFragment.createOptionsMenu.1
            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextSubmit(String query) {
                Intrinsics.checkNotNullParameter(query, "query");
                return true;
            }

            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextChange(String newText) {
                Intrinsics.checkNotNullParameter(newText, "newText");
                NotificationSettingsMutedFragment.this.getDuxo().updateFilter(newText);
                return true;
            }
        });
        Boolean bool = this.isIconified;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            SearchView searchView3 = this.searchView;
            if (searchView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchView");
                searchView3 = null;
            }
            searchView3.setIconified(zBooleanValue);
            this.isIconified = null;
        }
        SearchView searchView4 = this.searchView;
        if (searchView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchView");
        } else {
            searchView = searchView4;
        }
        searchView.setQuery(this.filter, false);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.settings.ui.notification.muted.NotificationSettingsMutedAdapter.Callbacks
    public void onThreadSettingsItemClicked(ApiNotificationThreadSettingsItem threadSettingsItem) {
        Intrinsics.checkNotNullParameter(threadSettingsItem, "threadSettingsItem");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.ThreadNotificationSettings(ThreadNotificationSettingsSource.MUTED_SETTINGS, threadSettingsItem), null, 2, null).show(getChildFragmentManager(), "muteNotification");
    }

    /* compiled from: NotificationSettingsMutedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverCompanion;", "Lcom/robinhood/android/settings/ui/notification/muted/NotificationSettingsMutedFragment;", "Lcom/robinhood/shared/settings/contracts/NotificationSettingsMutedFragmentKey;", "<init>", "()V", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverCompanion<NotificationSettingsMutedFragment, NotificationSettingsMutedFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(NotificationSettingsMutedFragmentKey notificationSettingsMutedFragmentKey) {
            return FragmentResolverCompanion.DefaultImpls.createFragment(this, notificationSettingsMutedFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((NotificationSettingsMutedFragment) fragment);
        }

        public Void getArgs(NotificationSettingsMutedFragment notificationSettingsMutedFragment) {
            return FragmentResolverCompanion.DefaultImpls.getArgs(this, notificationSettingsMutedFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public NotificationSettingsMutedFragment newInstance() {
            return (NotificationSettingsMutedFragment) FragmentResolverCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public NotificationSettingsMutedFragment newInstance(Void r1) {
            return (NotificationSettingsMutedFragment) FragmentResolverCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
