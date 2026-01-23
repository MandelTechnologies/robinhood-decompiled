package com.robinhood.android.search.newsfeed.snacks;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Activitys;
import com.robinhood.android.deeplink.config.DeeplinkConfig;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.webview.extensions.Uris3;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.contracts.SnacksWebViewFragmentKey;
import com.robinhood.android.search.databinding.FragmentNewsFeedSnacksArticleBinding;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey3;
import com.robinhood.shared.user.agent.UserAgentProvider;
import com.robinhood.utils.extensions.HttpUrl2;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.http.HttpUrls2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: NewsFeedSnacksArticleFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020(2\b\u0010$\u001a\u0004\u0018\u00010%H\u0017J\u0010\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0014J\u0010\u00101\u001a\u00020\u00122\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020\u00122\u0006\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020\u0012H\u0016J\b\u0010;\u001a\u00020 H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u0012X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/snacks/NewsFeedSnacksArticleFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "userAgentProvider", "Lcom/robinhood/shared/user/agent/UserAgentProvider;", "getUserAgentProvider", "()Lcom/robinhood/shared/user/agent/UserAgentProvider;", "setUserAgentProvider", "(Lcom/robinhood/shared/user/agent/UserAgentProvider;)V", "binding", "Lcom/robinhood/android/search/databinding/FragmentNewsFeedSnacksArticleBinding;", "getBinding", "()Lcom/robinhood/android/search/databinding/FragmentNewsFeedSnacksArticleBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "handleDeeplink", "uri", "Landroid/net/Uri;", "handleInternalUrl", "url", "Lokhttp3/HttpUrl;", "onBackPressed", "onDestroyView", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class NewsFeedSnacksArticleFragment extends BaseFragment implements AutoLoggableFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    private final boolean useDesignSystemToolbar;
    public UserAgentProvider userAgentProvider;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NewsFeedSnacksArticleFragment.class, "binding", "getBinding()Lcom/robinhood/android/search/databinding/FragmentNewsFeedSnacksArticleBinding;", 0))};

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

    public NewsFeedSnacksArticleFragment() {
        super(C27909R.layout.fragment_news_feed_snacks_article);
        this.binding = ViewBinding5.viewBinding(this, NewsFeedSnacksArticleFragment2.INSTANCE);
        this.useDesignSystemToolbar = true;
        this.eventScreen = new Screen(Screen.Name.SNACKS_ARTICLE_PAGE, null, null, null, 14, null);
    }

    public final UserAgentProvider getUserAgentProvider() {
        UserAgentProvider userAgentProvider = this.userAgentProvider;
        if (userAgentProvider != null) {
            return userAgentProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userAgentProvider");
        return null;
    }

    public final void setUserAgentProvider(UserAgentProvider userAgentProvider) {
        Intrinsics.checkNotNullParameter(userAgentProvider, "<set-?>");
        this.userAgentProvider = userAgentProvider;
    }

    private final FragmentNewsFeedSnacksArticleBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentNewsFeedSnacksArticleBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final WebView webView = getBinding().snacksArticleWebView;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUserAgentString(webView.getSettings().getUserAgentString() + PlaceholderUtils.XXShortPlaceholderText + getUserAgentProvider().getAppAgent());
        webView.getSettings().setAllowFileAccess(false);
        webView.loadUrl(((SnacksWebViewFragmentKey) INSTANCE.getArgs((Fragment) this)).getSnacksUrl());
        webView.setWebViewClient(new WebViewClient() { // from class: com.robinhood.android.search.newsfeed.snacks.NewsFeedSnacksArticleFragment$onViewCreated$1$1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view2, WebResourceRequest request) {
                boolean zHandleInternalUrl;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                NewsFeedSnacksArticleFragment newsFeedSnacksArticleFragment = this.this$0;
                Uri url = request.getUrl();
                Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
                if (newsFeedSnacksArticleFragment.handleDeeplink(url)) {
                    return true;
                }
                Uri url2 = request.getUrl();
                Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
                HttpUrl httpUrl = HttpUrl2.toHttpUrl(url2);
                if (HttpUrls2.isRobinhoodDomain(httpUrl) && ((zHandleInternalUrl = this.this$0.handleInternalUrl(httpUrl)) || StringsKt.isSnacksUrl(httpUrl.getUrl()))) {
                    return zHandleInternalUrl;
                }
                WebUtils webUtils = WebUtils.INSTANCE;
                android.content.Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                WebUtils.viewUrl$default(webUtils, contextRequireContext, httpUrl, 0, 4, null);
                return true;
            }
        });
        webView.setDownloadListener(new DownloadListener() { // from class: com.robinhood.android.search.newsfeed.snacks.NewsFeedSnacksArticleFragment$onViewCreated$1$2
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                WebUtils.viewUrl$default(webView.getContext(), str, 0, 4, (Object) null);
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (toolbar.findViewById(C27909R.id.snacks_article_logo_img) == null) {
            RhToolbar.addCustomView$default(toolbar, C27909R.layout.snacks_article_banner_logo, false, 0, 6, null);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C27909R.menu.menu_snacks_article, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C27909R.id.action_share) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Activitys.launchShareIntent$default(fragmentActivityRequireActivity, null, ((SnacksWebViewFragmentKey) INSTANCE.getArgs((Fragment) this)).getSnacksUrl(), null, 4, null);
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.SHARE_LINK, getEventScreen(), new Component(Component.ComponentType.BUTTON, "top_nav-share", null, 4, null), null, null, false, 56, null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleDeeplink(Uri uri) {
        Uri deepLink = Uris3.toDeepLink(uri);
        if (!Intrinsics.areEqual(deepLink.getScheme(), DeeplinkConfig.INSTANCE.getScheme())) {
            return false;
        }
        if (Intrinsics.areEqual(deepLink.getHost(), "notification_settings")) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            SettingsFragmentKey3 settingsFragmentKey3 = SettingsFragmentKey3.LAUNCH_NOTIFICATION_SETTINGS;
            String queryParameter = deepLink.getQueryParameter("sub_page");
            if (queryParameter == null) {
                queryParameter = "";
            }
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new SettingsFragmentKey(settingsFragmentKey3, false, false, true, queryParameter, null, null, null, false, 486, null), false, false, false, PerformanceMetricEventData.Source.SOURCE_SEARCH, false, null, false, false, null, null, 4052, null);
            return true;
        }
        Navigator navigator2 = getNavigator();
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator2, contextRequireContext2, deepLink, null, null, false, null, 60, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleInternalUrl(HttpUrl url) {
        if (!getNavigator().isDeepLinkSupported(HttpUrl2.toAndroidUri(url))) {
            return false;
        }
        if (url.pathSegments().contains(AnalyticsStrings.TAG_HOME_MOVE_STOCKS)) {
            String str = (String) CollectionsKt.last((List) url.pathSegments());
            if (kotlin.text.StringsKt.isBlank(str)) {
                return false;
            }
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.EquityInstrumentDetail(str, InstrumentDetailSource.NEWS_FEED, (String) null, 4, (DefaultConstructorMarker) null), false, false, false, PerformanceMetricEventData.Source.SOURCE_SEARCH, false, null, false, false, null, null, 4052, null);
            return true;
        }
        if (url.pathSegments().contains(AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO)) {
            String str2 = (String) CollectionsKt.last((List) url.pathSegments());
            if (kotlin.text.StringsKt.isBlank(str2)) {
                return false;
            }
            Navigator navigator2 = getNavigator();
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator2, contextRequireContext2, new LegacyFragmentKey.CryptoWithSymbol(str2), false, false, false, PerformanceMetricEventData.Source.SOURCE_SEARCH, false, null, false, false, null, null, 4052, null);
            return true;
        }
        if (url.pathSegments().contains("notification_settings")) {
            String queryParameter = HttpUrl2.toAndroidUri(url).getQueryParameter("sub_page");
            if (queryParameter == null) {
                queryParameter = "";
            }
            String str3 = queryParameter;
            Navigator navigator3 = getNavigator();
            android.content.Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator3, contextRequireContext3, new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_NOTIFICATION_SETTINGS, false, false, true, str3, null, null, null, false, 486, null), false, false, false, PerformanceMetricEventData.Source.SOURCE_SEARCH, false, null, false, false, null, null, 4052, null);
            return true;
        }
        Navigator navigator4 = getNavigator();
        android.content.Context contextRequireContext4 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator4, contextRequireContext4, HttpUrl2.toAndroidUri(url), Boolean.FALSE, null, false, null, 56, null);
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        WebView snacksArticleWebView = getBinding().snacksArticleWebView;
        Intrinsics.checkNotNullExpressionValue(snacksArticleWebView, "snacksArticleWebView");
        if (snacksArticleWebView.canGoBack()) {
            snacksArticleWebView.goBack();
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getBinding().snacksArticleWebView.destroy();
        super.onDestroyView();
    }

    /* compiled from: NewsFeedSnacksArticleFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/snacks/NewsFeedSnacksArticleFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/search/newsfeed/snacks/NewsFeedSnacksArticleFragment;", "Lcom/robinhood/android/search/contracts/SnacksWebViewFragmentKey;", "<init>", "()V", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<NewsFeedSnacksArticleFragment, SnacksWebViewFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(SnacksWebViewFragmentKey snacksWebViewFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, snacksWebViewFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SnacksWebViewFragmentKey getArgs(NewsFeedSnacksArticleFragment newsFeedSnacksArticleFragment) {
            return (SnacksWebViewFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, newsFeedSnacksArticleFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public NewsFeedSnacksArticleFragment newInstance(SnacksWebViewFragmentKey snacksWebViewFragmentKey) {
            return (NewsFeedSnacksArticleFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, snacksWebViewFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(NewsFeedSnacksArticleFragment newsFeedSnacksArticleFragment, SnacksWebViewFragmentKey snacksWebViewFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, newsFeedSnacksArticleFragment, snacksWebViewFragmentKey);
        }
    }
}
