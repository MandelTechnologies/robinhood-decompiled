package com.robinhood.android.lib.webview.p172ui;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
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
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.extensions.Activitys;
import com.robinhood.android.deeplink.config.DeeplinkConfig;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.webview.C20684R;
import com.robinhood.android.lib.webview.databinding.FragmentEmbeddedWebviewBinding;
import com.robinhood.android.lib.webview.extensions.Uris3;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.common.contracts.RhEmbeddedWebViewFragmentKey;
import com.robinhood.shared.user.agent.UserAgentProvider;
import com.robinhood.utils.extensions.HttpUrl2;
import com.robinhood.utils.http.HttpUrls2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: RhEmbeddedWebviewFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020(2\b\u0010$\u001a\u0004\u0018\u00010%H\u0017J\u0018\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0014J\u0010\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u00122\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u00020\u0012H\u0016J\b\u00108\u001a\u00020 H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u0012X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/ui/RhEmbeddedWebviewFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "userAgentProvider", "Lcom/robinhood/shared/user/agent/UserAgentProvider;", "getUserAgentProvider", "()Lcom/robinhood/shared/user/agent/UserAgentProvider;", "setUserAgentProvider", "(Lcom/robinhood/shared/user/agent/UserAgentProvider;)V", "binding", "Lcom/robinhood/android/lib/webview/databinding/FragmentEmbeddedWebviewBinding;", "getBinding", "()Lcom/robinhood/android/lib/webview/databinding/FragmentEmbeddedWebviewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "handleDeeplink", "uri", "Landroid/net/Uri;", "handleInternalUrl", "url", "Lokhttp3/HttpUrl;", "onBackPressed", "onDestroyView", "Companion", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class RhEmbeddedWebviewFragment extends BaseFragment implements AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhEmbeddedWebviewFragment.class, "binding", "getBinding()Lcom/robinhood/android/lib/webview/databinding/FragmentEmbeddedWebviewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    private final boolean useDesignSystemToolbar;
    public UserAgentProvider userAgentProvider;

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

    public RhEmbeddedWebviewFragment() {
        super(C20684R.layout.fragment_embedded_webview);
        this.binding = ViewBinding5.viewBinding(this, RhEmbeddedWebviewFragment2.INSTANCE);
        this.useDesignSystemToolbar = true;
        this.eventScreen = new Screen(Screen.Name.EMBEDDED_WEBVIEW, null, null, null, 14, null);
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

    private final FragmentEmbeddedWebviewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEmbeddedWebviewBinding) value;
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
        Toolbar toolbar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final WebView webView = getBinding().webView;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUserAgentString(webView.getSettings().getUserAgentString() + PlaceholderUtils.XXShortPlaceholderText + getUserAgentProvider().getAppAgent());
        webView.getSettings().setAllowFileAccess(false);
        webView.loadUrl(((RhEmbeddedWebViewFragmentKey) INSTANCE.getArgs((Fragment) this)).getUrl());
        webView.setWebViewClient(new WebViewClient() { // from class: com.robinhood.android.lib.webview.ui.RhEmbeddedWebviewFragment$onViewCreated$1$1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view2, WebResourceRequest request) {
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                RhEmbeddedWebviewFragment rhEmbeddedWebviewFragment = this.this$0;
                Uri url = request.getUrl();
                Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
                if (rhEmbeddedWebviewFragment.handleDeeplink(url)) {
                    return true;
                }
                Uri url2 = request.getUrl();
                Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
                HttpUrl httpUrl = HttpUrl2.toHttpUrl(url2);
                if (HttpUrls2.isRobinhoodDomain(httpUrl)) {
                    return this.this$0.handleInternalUrl(httpUrl);
                }
                WebUtils webUtils = WebUtils.INSTANCE;
                android.content.Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                WebUtils.viewUrl$default(webUtils, contextRequireContext, httpUrl, 0, 4, null);
                return true;
            }
        });
        webView.setDownloadListener(new DownloadListener() { // from class: com.robinhood.android.lib.webview.ui.RhEmbeddedWebviewFragment$onViewCreated$1$2
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                try {
                    this.this$0.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(webView.getContext(), C11048R.string.general_error_no_browser_found, 1).show();
                }
            }
        });
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar == null || (toolbar = rhToolbar.getToolbar()) == null) {
            return;
        }
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.lib.webview.ui.RhEmbeddedWebviewFragment.onViewCreated.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RhEmbeddedWebviewFragment.this.requireActivity().finish();
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C20684R.menu.menu_share, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C20684R.id.action_share) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Activitys.launchShareIntent$default(fragmentActivityRequireActivity, null, ((RhEmbeddedWebViewFragmentKey) INSTANCE.getArgs((Fragment) this)).getUrl(), null, 4, null);
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
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, deepLink, null, null, false, null, 60, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleInternalUrl(HttpUrl url) {
        if (!getNavigator().isDeepLinkSupported(HttpUrl2.toAndroidUri(url))) {
            return false;
        }
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, HttpUrl2.toAndroidUri(url), Boolean.FALSE, null, false, null, 56, null);
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        WebView webView = getBinding().webView;
        Intrinsics.checkNotNullExpressionValue(webView, "webView");
        if (webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getBinding().webView.destroy();
        super.onDestroyView();
    }

    /* compiled from: RhEmbeddedWebviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/ui/RhEmbeddedWebviewFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/lib/webview/ui/RhEmbeddedWebviewFragment;", "Lcom/robinhood/shared/common/contracts/RhEmbeddedWebViewFragmentKey;", "<init>", "()V", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<RhEmbeddedWebviewFragment, RhEmbeddedWebViewFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(RhEmbeddedWebViewFragmentKey rhEmbeddedWebViewFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, rhEmbeddedWebViewFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RhEmbeddedWebViewFragmentKey getArgs(RhEmbeddedWebviewFragment rhEmbeddedWebviewFragment) {
            return (RhEmbeddedWebViewFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, rhEmbeddedWebviewFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhEmbeddedWebviewFragment newInstance(RhEmbeddedWebViewFragmentKey rhEmbeddedWebViewFragmentKey) {
            return (RhEmbeddedWebviewFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, rhEmbeddedWebViewFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhEmbeddedWebviewFragment rhEmbeddedWebviewFragment, RhEmbeddedWebViewFragmentKey rhEmbeddedWebViewFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, rhEmbeddedWebviewFragment, rhEmbeddedWebViewFragmentKey);
        }
    }
}
