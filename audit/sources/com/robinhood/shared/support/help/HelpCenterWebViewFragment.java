package com.robinhood.shared.support.help;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.RealSessionManager;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.deeplink.config.DeeplinkConfig;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.webview.extensions.Uris3;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.shared.support.contracts.HelpCenterWebViewFragmentKey;
import com.robinhood.shared.support.help.databinding.FragmentHelpCenterWebViewBinding;
import com.robinhood.utils.extensions.Contexts8;
import com.robinhood.utils.extensions.HttpUrl2;
import com.robinhood.utils.http.HttpUrls2;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;

/* compiled from: HelpCenterWebViewFragment.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017J\f\u0010\u0016\u001a\u00020\u0011*\u00020\u0017H\u0002J*\u0010\u0018\u001a\u00020\u0011*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020\u0011H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006+"}, m3636d2 = {"Lcom/robinhood/shared/support/help/HelpCenterWebViewFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "sessionManager", "Lcom/robinhood/analytics/RealSessionManager;", "getSessionManager", "()Lcom/robinhood/analytics/RealSessionManager;", "setSessionManager", "(Lcom/robinhood/analytics/RealSessionManager;)V", "binding", "Lcom/robinhood/shared/support/help/databinding/FragmentHelpCenterWebViewBinding;", "getBinding", "()Lcom/robinhood/shared/support/help/databinding/FragmentHelpCenterWebViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setSessionIdCookieAndLoadUrl", "Landroid/webkit/WebView;", "setCookie", "Landroid/webkit/CookieManager;", "url", "", "cookie", "onCookieSet", "Lkotlin/Function0;", "generateSessionIdCookie", "sessionId", "Ljava/util/UUID;", "handleSpecialUrls", "", "uri", "Landroid/net/Uri;", "handleContactUsLink", "Lokhttp3/HttpUrl;", "onBackPressed", "onDestroyView", "Companion", "feature-help-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class HelpCenterWebViewFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public RealSessionManager sessionManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(HelpCenterWebViewFragment.class, "binding", "getBinding()Lcom/robinhood/shared/support/help/databinding/FragmentHelpCenterWebViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public HelpCenterWebViewFragment() {
        super(C40040R.layout.fragment_help_center_web_view);
        this.binding = ViewBinding5.viewBinding(this, HelpCenterWebViewFragment2.INSTANCE);
    }

    public final RealSessionManager getSessionManager() {
        RealSessionManager realSessionManager = this.sessionManager;
        if (realSessionManager != null) {
            return realSessionManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final void setSessionManager(RealSessionManager realSessionManager) {
        Intrinsics.checkNotNullParameter(realSessionManager, "<set-?>");
        this.sessionManager = realSessionManager;
    }

    public final FragmentHelpCenterWebViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentHelpCenterWebViewBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        final WebView webView = getBinding().helpCenterWebView;
        webView.getSettings().setJavaScriptEnabled(true);
        WebSettings settings = webView.getSettings();
        StringBuilder sb = new StringBuilder();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        String str = Contexts8.getPackageInfo$default(fragmentActivityRequireActivity, 0, 1, null).versionName;
        sb.append(webView.getSettings().getUserAgentString());
        sb.append(PlaceholderUtils.XXShortPlaceholderText);
        sb.append("Robinhood-Android/" + str);
        settings.setUserAgentString(sb.toString());
        webView.getSettings().setAllowFileAccess(false);
        webView.setWebViewClient(new WebViewClient() { // from class: com.robinhood.shared.support.help.HelpCenterWebViewFragment$onViewCreated$1$2
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view2, WebResourceRequest request) {
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                HelpCenterWebViewFragment helpCenterWebViewFragment = this.this$0;
                Uri url = request.getUrl();
                Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
                if (helpCenterWebViewFragment.handleSpecialUrls(url)) {
                    return true;
                }
                Uri url2 = request.getUrl();
                Intrinsics.checkNotNullExpressionValue(url2, "getUrl(...)");
                HttpUrl httpUrl = HttpUrl2.toHttpUrl(url2);
                if (HttpUrls2.isRobinhoodDomain(httpUrl)) {
                    return this.this$0.handleContactUsLink(httpUrl);
                }
                WebUtils webUtils = WebUtils.INSTANCE;
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                WebUtils.viewUrl$default(webUtils, contextRequireContext, httpUrl, 0, 4, null);
                return true;
            }
        });
        webView.setDownloadListener(new DownloadListener() { // from class: com.robinhood.shared.support.help.HelpCenterWebViewFragment$onViewCreated$1$3
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str2, String str3, String str4, String str5, long j) {
                WebUtils.viewUrl$default(webView.getContext(), str2, 0, 4, (Object) null);
            }
        });
        Intrinsics.checkNotNull(webView);
        setSessionIdCookieAndLoadUrl(webView);
    }

    private final void setSessionIdCookieAndLoadUrl(final WebView webView) {
        final String helpCenterUrl;
        UUID value = getSessionManager().getSessionId().getValue();
        try {
            WebUtils webUtils = WebUtils.INSTANCE;
            HttpUrl httpUrl = HttpUrl.INSTANCE.get(((HelpCenterWebViewFragmentKey) INSTANCE.getArgs((Fragment) this)).getHelpCenterUrl());
            Context context = webView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            helpCenterUrl = webUtils.toLocalizedUrl(httpUrl, context).getUrl();
        } catch (IllegalArgumentException unused) {
            helpCenterUrl = ((HelpCenterWebViewFragmentKey) INSTANCE.getArgs((Fragment) this)).getHelpCenterUrl();
        }
        if (value != null) {
            String strGenerateSessionIdCookie = generateSessionIdCookie(value);
            CookieManager cookieManager = CookieManager.getInstance();
            Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance(...)");
            setCookie(cookieManager, helpCenterUrl, strGenerateSessionIdCookie, new Function0() { // from class: com.robinhood.shared.support.help.HelpCenterWebViewFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HelpCenterWebViewFragment.setSessionIdCookieAndLoadUrl$lambda$2(webView, helpCenterUrl);
                }
            });
            return;
        }
        webView.loadUrl(helpCenterUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSessionIdCookieAndLoadUrl$lambda$2(WebView webView, String str) {
        webView.loadUrl(str);
        return Unit.INSTANCE;
    }

    private final void setCookie(final CookieManager cookieManager, String str, String str2, final Function0<Unit> function0) {
        cookieManager.setCookie(str, str2, new ValueCallback() { // from class: com.robinhood.shared.support.help.HelpCenterWebViewFragment.setCookie.1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Boolean bool) {
                cookieManager.flush();
                function0.invoke();
            }
        });
    }

    private final String generateSessionIdCookie(UUID sessionId) {
        StringBuilder sb = new StringBuilder();
        sb.append("session_id=" + sessionId);
        sb.append("; ");
        sb.append("Domain=.robinhood.com");
        sb.append("; ");
        sb.append("Path=/");
        sb.append("; ");
        sb.append("Max-Age=1800");
        sb.append("; ");
        sb.append("Secure");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleSpecialUrls(Uri uri) {
        Uri deepLink = Uris3.toDeepLink(uri);
        String scheme = deepLink.getScheme();
        if (Intrinsics.areEqual(scheme, "mailto")) {
            startActivity(new Intent("android.intent.action.SENDTO", deepLink));
            return true;
        }
        if (!Intrinsics.areEqual(scheme, DeeplinkConfig.INSTANCE.getScheme())) {
            return false;
        }
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, deepLink, null, null, false, null, 60, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleContactUsLink(HttpUrl url) {
        if (!url.pathSegments().contains("contact")) {
            return false;
        }
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new ContactSupportFragmentKey.TriageFlow(null, null, null, null, null, 31, null), false, false, true, false, null, false, null, null, 996, null);
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        WebView helpCenterWebView = getBinding().helpCenterWebView;
        Intrinsics.checkNotNullExpressionValue(helpCenterWebView, "helpCenterWebView");
        if (helpCenterWebView.canGoBack()) {
            helpCenterWebView.goBack();
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getBinding().helpCenterWebView.destroy();
        super.onDestroyView();
    }

    /* compiled from: HelpCenterWebViewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/support/help/HelpCenterWebViewFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/support/help/HelpCenterWebViewFragment;", "Lcom/robinhood/shared/support/contracts/HelpCenterWebViewFragmentKey;", "<init>", "()V", "feature-help-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<HelpCenterWebViewFragment, HelpCenterWebViewFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(HelpCenterWebViewFragmentKey helpCenterWebViewFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, helpCenterWebViewFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public HelpCenterWebViewFragmentKey getArgs(HelpCenterWebViewFragment helpCenterWebViewFragment) {
            return (HelpCenterWebViewFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, helpCenterWebViewFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public HelpCenterWebViewFragment newInstance(HelpCenterWebViewFragmentKey helpCenterWebViewFragmentKey) {
            return (HelpCenterWebViewFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, helpCenterWebViewFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(HelpCenterWebViewFragment helpCenterWebViewFragment, HelpCenterWebViewFragmentKey helpCenterWebViewFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, helpCenterWebViewFragment, helpCenterWebViewFragmentKey);
        }
    }
}
