package com.robinhood.android.rhweb;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultCaller;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$GetContent;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.Compat;
import com.robinhood.android.common.util.EmailUtils2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.prefs.Theme;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.webview.DefaultWebViewClient;
import com.robinhood.android.lib.webview.WebError;
import com.robinhood.android.lib.webview.WebResponder;
import com.robinhood.android.lib.webview.WebViewUrlHandler;
import com.robinhood.android.lib.webview.data.WebConfig;
import com.robinhood.android.lib.webview.view.WebErrorView;
import com.robinhood.android.lib.webview.view.WebLoadingView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.rhweb.RhWebFragment;
import com.robinhood.android.rhweb.RhWebListener;
import com.robinhood.android.rhweb.databinding.FragmentRhwebBinding;
import com.robinhood.android.rhweb.util.UriExtension;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.api.OAuthToken;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.data.LogoutType;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.http.HttpUrls2;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.net.ActiveNetworkCounter;
import com.robinhood.utils.net.ActiveNetworkCounter2;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;
import p479j$.time.Duration;

/* compiled from: RhWebFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00ad\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\b®\u0001¯\u0001°\u0001\u00ad\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0005J!\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u001f\u0010\u001e\u001a\u00020\u00062\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u0005J\u0019\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J!\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\u0005J\u0017\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010\u0005J\u000f\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u0010\u0005J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J/\u0010=\u001a\u00020\u00062\u0006\u00108\u001a\u0002072\u000e\u0010:\u001a\n\u0012\u0006\b\u0001\u0012\u0002090\u001b2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010\u0005J\u0017\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u001cH\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u001cH\u0016¢\u0006\u0004\bC\u0010BJ\u0017\u0010F\u001a\u00020\u00062\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u001cH\u0016¢\u0006\u0004\bH\u0010BJ\u000f\u0010I\u001a\u00020\u0006H\u0016¢\u0006\u0004\bI\u0010\u0005J\u000f\u0010J\u001a\u00020\u0006H\u0016¢\u0006\u0004\bJ\u0010\u0005J\u000f\u0010K\u001a\u00020\u0006H\u0016¢\u0006\u0004\bK\u0010\u0005J\u000f\u0010L\u001a\u00020\u0006H\u0016¢\u0006\u0004\bL\u0010\u0005J\u000f\u0010M\u001a\u00020\u0006H\u0016¢\u0006\u0004\bM\u0010\u0005J\u000f\u0010N\u001a\u00020\u0006H\u0016¢\u0006\u0004\bN\u0010\u0005R\"\u0010P\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010W\u001a\u00020V8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010^\u001a\u00020]8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010e\u001a\u00020d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010l\u001a\u00020k8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001b\u0010w\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u001b\u0010}\u001a\u00020x8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u0019\u0010\u007f\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R,\u0010\u008c\u0001\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002@BX\u0082\u000e¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R \u0010\u0094\u0001\u001a\u00030\u0090\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0091\u0001\u0010t\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R2\u0010\u009b\u0001\u001a\u0002042\u0007\u0010\u0095\u0001\u001a\u0002048B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u00106\"\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001c\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R'\u0010¡\u0001\u001a\u0012\u0012\r\u0012\u000b  \u0001*\u0004\u0018\u000109090\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R(\u0010¤\u0001\u001a\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0018\u00010£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R \u0010ª\u0001\u001a\u00030¦\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b§\u0001\u0010z\u001a\u0006\b¨\u0001\u0010©\u0001R\u0016\u0010¬\u0001\u001a\u0002048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u00106¨\u0006±\u0001"}, m3636d2 = {"Lcom/robinhood/android/rhweb/RhWebFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/lib/webview/WebViewUrlHandler$Callbacks;", "Lcom/robinhood/android/rhweb/RhWebListener$Callbacks;", "<init>", "()V", "", "start", "Lcom/robinhood/android/rhweb/RhWebViewState;", "viewState", "bindViewState", "(Lcom/robinhood/android/rhweb/RhWebViewState;)V", "j$/time/Duration", "duration", "startFallbackTimer", "(Lj$/time/Duration;)V", "stopFallbackTimer", "clearWebStorage", "Lcom/robinhood/android/lib/webview/WebError;", "error", "Lcom/robinhood/android/lib/webview/view/WebErrorView$ErrorViewType;", "errorViewType", "handleError", "(Lcom/robinhood/android/lib/webview/WebError;Lcom/robinhood/android/lib/webview/view/WebErrorView$ErrorViewType;)V", "displayErrorView", "onWebViewNotLoaded", "showCameraPermissionNeededToast", "", "Landroid/net/Uri;", "results", "onFileChooserActivityResult", "([Landroid/net/Uri;)V", "doInitialConfigRequest", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onResume", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "toolbar", "configureToolbar", "(Lcom/robinhood/android/common/ui/view/RhToolbar;)V", "onDestroyView", "onDestroy", "", "onBackPressed", "()Z", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onDoneClick", "uri", "onMailTo", "(Landroid/net/Uri;)V", "onDeeplink", "Lokhttp3/HttpUrl;", "url", "onExternalUrl", "(Lokhttp3/HttpUrl;)V", "onExternalUri", "onFirstInteraction", "getInitialConfig", "refreshToken", "disableBackNavigation", "dismissWebView", "dismissWebViewAndContinue", "Lcom/robinhood/analytics/AnalyticsLogger;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "Lcom/robinhood/analytics/SharedEventLogger;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/SharedEventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/SharedEventLogger;)V", "Lcom/robinhood/shared/security/auth/AuthManager;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "Lcom/robinhood/targetbackend/TargetBackend;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "getTargetBackend", "()Lcom/robinhood/targetbackend/TargetBackend;", "setTargetBackend", "(Lcom/robinhood/targetbackend/TargetBackend;)V", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "getMoshi", "()Lcom/robinhood/utils/moshi/LazyMoshi;", "setMoshi", "(Lcom/robinhood/utils/moshi/LazyMoshi;)V", "Lcom/robinhood/android/rhweb/RhWebDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/rhweb/RhWebDuxo;", "duxo", "Lcom/robinhood/android/rhweb/databinding/FragmentRhwebBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBindings", "()Lcom/robinhood/android/rhweb/databinding/FragmentRhwebBinding;", "bindings", "Lio/reactivex/disposables/Disposable;", "timerDisposable", "Lio/reactivex/disposables/Disposable;", "Lcom/robinhood/utils/net/ActiveNetworkCounter;", "networkCounter", "Lcom/robinhood/utils/net/ActiveNetworkCounter;", "Lcom/robinhood/android/rhweb/RhWebListener;", "webListener", "Lcom/robinhood/android/rhweb/RhWebListener;", "Lcom/robinhood/android/lib/webview/WebResponder;", "webResponder", "Lcom/robinhood/android/lib/webview/WebResponder;", "Lcom/robinhood/android/rhweb/RhWebFragment$WebViewState;", "v", "webViewState", "Lcom/robinhood/android/rhweb/RhWebFragment$WebViewState;", "setWebViewState", "(Lcom/robinhood/android/rhweb/RhWebFragment$WebViewState;)V", "Lcom/robinhood/android/lib/webview/WebViewUrlHandler;", "webViewUrlHandler$delegate", "getWebViewUrlHandler", "()Lcom/robinhood/android/lib/webview/WebViewUrlHandler;", "webViewUrlHandler", "<set-?>", "toolbarHidden$delegate", "Lkotlin/properties/ReadWriteProperty;", "getToolbarHidden", "setToolbarHidden", "(Z)V", "toolbarHidden", "Landroid/webkit/PermissionRequest;", "webviewPermissionRequest", "Landroid/webkit/PermissionRequest;", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "getContent", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/webkit/ValueCallback;", "filePathCallback", "Landroid/webkit/ValueCallback;", "Lcom/robinhood/android/rhweb/RhWebFragment$Callbacks;", "callbacks$delegate", "getCallbacks", "()Lcom/robinhood/android/rhweb/RhWebFragment$Callbacks;", "callbacks", "getBackNavigationEnabled", "backNavigationEnabled", "Companion", "Callbacks", "WebViewState", "Args", "feature-rhweb_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhWebFragment extends BaseFragment implements WebViewUrlHandler.Callbacks, RhWebListener.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhWebFragment.class, "bindings", "getBindings()Lcom/robinhood/android/rhweb/databinding/FragmentRhwebBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RhWebFragment.class, "toolbarHidden", "getToolbarHidden()Z", 0)), Reflection.property1(new PropertyReference1Impl(RhWebFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhweb/RhWebFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String JS_INTERFACE_NAME = "RhAndroid";
    private static final int PERMISSION_REQUEST_CODE = 2;
    public AnalyticsLogger analytics;
    public AuthManager authManager;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public SharedEventLogger eventLogger;
    private ValueCallback<Uri[]> filePathCallback;
    private final ActivityResultLauncher<String> getContent;
    public LazyMoshi moshi;
    private final ActiveNetworkCounter networkCounter;
    public TargetBackend targetBackend;
    private Disposable timerDisposable;

    /* renamed from: toolbarHidden$delegate, reason: from kotlin metadata */
    private final Interfaces3 toolbarHidden;
    private RhWebListener webListener;
    private WebResponder webResponder;
    private WebViewState webViewState;

    /* renamed from: webViewUrlHandler$delegate, reason: from kotlin metadata */
    private final Lazy webViewUrlHandler;
    private PermissionRequest webviewPermissionRequest;

    /* compiled from: RhWebFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/rhweb/RhWebFragment$Callbacks;", "", "dismissWebView", "", "dismissWebViewAndContinue", "feature-rhweb_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void dismissWebView();

        void dismissWebViewAndContinue();
    }

    public RhWebFragment() {
        super(C27330R.layout.fragment_rhweb);
        this.duxo = OldDuxos.oldDuxo(this, RhWebDuxo.class);
        this.bindings = ViewBinding5.viewBinding(this, RhWebFragment3.INSTANCE);
        this.networkCounter = new ActiveNetworkCounter();
        this.webViewState = WebViewState.LOADING;
        this.webViewUrlHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.rhweb.RhWebFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhWebFragment.webViewUrlHandler_delegate$lambda$0(this.f$0);
            }
        });
        this.toolbarHidden = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[1]);
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$GetContent(), new ActivityResultCallback() { // from class: com.robinhood.android.rhweb.RhWebFragment$getContent$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Uri uri) {
                this.this$0.onFileChooserActivityResult(uri != null ? new Uri[]{uri} : null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.getContent = activityResultLauncherRegisterForActivityResult;
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhweb.RhWebFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
                if (!(parentFragment instanceof RhWebFragment.Callbacks)) {
                    parentFragment = null;
                }
                RhWebFragment.Callbacks callbacks = (RhWebFragment.Callbacks) parentFragment;
                if (callbacks != null) {
                    return callbacks;
                }
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof RhWebFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
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

    public final SharedEventLogger getEventLogger() {
        SharedEventLogger sharedEventLogger = this.eventLogger;
        if (sharedEventLogger != null) {
            return sharedEventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(SharedEventLogger sharedEventLogger) {
        Intrinsics.checkNotNullParameter(sharedEventLogger, "<set-?>");
        this.eventLogger = sharedEventLogger;
    }

    public final AuthManager getAuthManager() {
        AuthManager authManager = this.authManager;
        if (authManager != null) {
            return authManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authManager");
        return null;
    }

    public final void setAuthManager(AuthManager authManager) {
        Intrinsics.checkNotNullParameter(authManager, "<set-?>");
        this.authManager = authManager;
    }

    public final TargetBackend getTargetBackend() {
        TargetBackend targetBackend = this.targetBackend;
        if (targetBackend != null) {
            return targetBackend;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetBackend");
        return null;
    }

    public final void setTargetBackend(TargetBackend targetBackend) {
        Intrinsics.checkNotNullParameter(targetBackend, "<set-?>");
        this.targetBackend = targetBackend;
    }

    public final LazyMoshi getMoshi() {
        LazyMoshi lazyMoshi = this.moshi;
        if (lazyMoshi != null) {
            return lazyMoshi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("moshi");
        return null;
    }

    public final void setMoshi(LazyMoshi lazyMoshi) {
        Intrinsics.checkNotNullParameter(lazyMoshi, "<set-?>");
        this.moshi = lazyMoshi;
    }

    private final RhWebDuxo getDuxo() {
        return (RhWebDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentRhwebBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRhwebBinding) value;
    }

    private final void setWebViewState(WebViewState webViewState) {
        if (webViewState.ordinal() > this.webViewState.ordinal()) {
            this.webViewState = webViewState;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebViewUrlHandler getWebViewUrlHandler() {
        return (WebViewUrlHandler) this.webViewUrlHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewUrlHandler webViewUrlHandler_delegate$lambda$0(RhWebFragment rhWebFragment) {
        return new WebViewUrlHandler(AnalyticsStrings.RH_WEB_SCREEN_NAME, rhWebFragment, rhWebFragment.getAnalytics(), rhWebFragment.getEventLogger());
    }

    private final boolean getToolbarHidden() {
        return ((Boolean) this.toolbarHidden.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    private final void setToolbarHidden(boolean z) {
        this.toolbarHidden.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[2]);
    }

    @Override // com.robinhood.android.lib.webview.WebViewUrlHandler.Callbacks
    public boolean getBackNavigationEnabled() {
        RhWebListener rhWebListener = this.webListener;
        if (rhWebListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webListener");
            rhWebListener = null;
        }
        return rhWebListener.getBackNavigationEnabled();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        clearWebStorage();
        Object systemService = requireContext().getSystemService((Class<Object>) ConnectivityManager.class);
        Intrinsics.checkNotNullExpressionValue(systemService, "getSystemService(...)");
        ActiveNetworkCounter2.registerNetworkCallback((ConnectivityManager) systemService, this.networkCounter);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int iM26679getBottomXedK2Rk;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getHideToolbar()) {
            iM26679getBottomXedK2Rk = InsetSides.INSTANCE.m26684getVerticalXedK2Rk();
        } else {
            iM26679getBottomXedK2Rk = InsetSides.INSTANCE.m26679getBottomXedK2Rk();
        }
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, iM26679getBottomXedK2Rk);
        this.webResponder = new WebResponder(new C273381(getBindings().webview), getMoshi());
        final WebView webview = getBindings().webview;
        Intrinsics.checkNotNullExpressionValue(webview, "webview");
        WebSettings settings = webview.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(((Args) companion.getArgs((Fragment) this)).getAllowFileAccess());
        settings.setSupportMultipleWindows(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webview, ((Args) companion.getArgs((Fragment) this)).getAcceptThirdPartyCookies());
        Observable observableTake = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.rhweb.RhWebFragment.onViewCreated.3
            @Override // io.reactivex.functions.Function
            public final String apply(RhWebViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getUserAgentSuffix();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhweb.RhWebFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhWebFragment.onViewCreated$lambda$3(webview, (String) obj);
            }
        });
        Observable observableSkip = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.rhweb.RhWebFragment.onViewCreated.5
            @Override // io.reactivex.functions.Function
            public final Tuples2<Theme, NightModeManager2> apply(RhWebViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Tuples4.m3642to(it.getWebConfig().getDisplayInfo().getTheme(), it.getWebConfig().getDisplayInfo().getDayNightMode());
            }
        }).distinctUntilChanged((Function<? super R, K>) new Function() { // from class: com.robinhood.android.rhweb.RhWebFragment.onViewCreated.6
            @Override // io.reactivex.functions.Function
            public final Theme apply(Tuples2<? extends Theme, ? extends NightModeManager2> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return tuples2.component1();
            }
        }).skip(1L);
        Intrinsics.checkNotNullExpressionValue(observableSkip, "skip(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableSkip), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhweb.RhWebFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhWebFragment.onViewCreated$lambda$4(this.f$0, (Tuples2) obj);
            }
        });
        Observable observableSkip2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.rhweb.RhWebFragment.onViewCreated.8
            @Override // io.reactivex.functions.Function
            public final ColorScheme apply(RhWebViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getWebConfig().getDisplayInfo().getColorScheme();
            }
        }).distinctUntilChanged().skip(1L);
        Intrinsics.checkNotNullExpressionValue(observableSkip2, "skip(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableSkip2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhweb.RhWebFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhWebFragment.onViewCreated$lambda$5(this.f$0, (ColorScheme) obj);
            }
        });
        start();
    }

    /* compiled from: RhWebFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhweb.RhWebFragment$onViewCreated$1 */
    /* synthetic */ class C273381 extends FunctionReferenceImpl implements Function2<String, ValueCallback<String>, Unit> {
        C273381(Object obj) {
            super(2, obj, WebView.class, "evaluateJavascript", "evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, ValueCallback<String> valueCallback) {
            invoke2(str, valueCallback);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p0, ValueCallback<String> valueCallback) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((WebView) this.receiver).evaluateJavascript(p0, valueCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(WebView webView, String str) {
        WebSettings settings = webView.getSettings();
        settings.setUserAgentString(settings.getUserAgentString() + PlaceholderUtils.XXShortPlaceholderText + str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(RhWebFragment rhWebFragment, Tuples2 tuples2) {
        Theme theme = (Theme) tuples2.component1();
        NightModeManager2 nightModeManager2 = (NightModeManager2) tuples2.component2();
        WebResponder webResponder = rhWebFragment.webResponder;
        if (webResponder != null) {
            webResponder.setTheme(theme, nightModeManager2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(RhWebFragment rhWebFragment, ColorScheme colorScheme) {
        WebResponder webResponder = rhWebFragment.webResponder;
        if (webResponder != null) {
            Intrinsics.checkNotNull(colorScheme);
            webResponder.setAccessibleColors(colorScheme);
        }
        return Unit.INSTANCE;
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
        WebResponder webResponder;
        super.onResume();
        if (this.webViewState != WebViewState.LOADED || (webResponder = this.webResponder) == null) {
            return;
        }
        webResponder.updatePageData();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.getToolbar().setNavigationIcon(C20690R.drawable.ic_rds_close_24dp);
        if (getToolbarHidden()) {
            requireBaseActivity().hideToolbar();
        }
    }

    private final void start() {
        IdlingResourceCounters2.setBusy(IdlingResourceType.RH_WEB, true);
        this.webListener = new RhWebListener(getAnalytics(), this, getMoshi());
        WebView webView = getBindings().webview;
        RhWebListener rhWebListener = this.webListener;
        if (rhWebListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webListener");
            rhWebListener = null;
        }
        webView.addJavascriptInterface(rhWebListener, JS_INTERFACE_NAME);
        Observable<RhWebViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C273431(this));
    }

    /* compiled from: RhWebFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhweb.RhWebFragment$start$1 */
    /* synthetic */ class C273431 extends FunctionReferenceImpl implements Function1<RhWebViewState, Unit> {
        C273431(Object obj) {
            super(1, obj, RhWebFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/rhweb/RhWebViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RhWebViewState rhWebViewState) {
            invoke2(rhWebViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RhWebViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RhWebFragment) this.receiver).bindViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        WebView webView = getBindings().webview;
        webView.removeJavascriptInterface(JS_INTERFACE_NAME);
        webView.destroy();
        super.onDestroyView();
        this.webResponder = null;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        clearWebStorage();
        ((ConnectivityManager) requireContext().getSystemService(ConnectivityManager.class)).unregisterNetworkCallback(this.networkCounter);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        WebView webview = getBindings().webview;
        Intrinsics.checkNotNullExpressionValue(webview, "webview");
        if (webview.canGoBack()) {
            RhWebListener rhWebListener = this.webListener;
            if (rhWebListener == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webListener");
                rhWebListener = null;
            }
            if (rhWebListener.getBackNavigationEnabled()) {
                webview.goBack();
                return true;
            }
        }
        return super.onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (requestCode == 2) {
            if (grantResults.length == 0) {
                return;
            }
            if (ArraysKt.first(grantResults) == 0) {
                PermissionRequest permissionRequest = this.webviewPermissionRequest;
                if (permissionRequest != null) {
                    Intrinsics.checkNotNull(permissionRequest);
                    permissionRequest.grant(permissionRequest.getResources());
                }
                this.webviewPermissionRequest = null;
                return;
            }
            showCameraPermissionNeededToast();
        }
    }

    @Override // com.robinhood.android.lib.webview.WebViewUrlHandler.Callbacks
    public void onDoneClick() {
        requireActivity().onBackPressed();
    }

    @Override // com.robinhood.android.lib.webview.WebViewUrlHandler.Callbacks
    public void onMailTo(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        startActivity(new Intent("android.intent.action.SENDTO", uri));
    }

    @Override // com.robinhood.android.lib.webview.WebViewUrlHandler.Callbacks
    public void onDeeplink(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, uri, null, null, false, null, 60, null);
    }

    @Override // com.robinhood.android.lib.webview.WebViewUrlHandler.Callbacks
    public void onExternalUrl(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        WebUtils webUtils = WebUtils.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        WebUtils.viewUrl$default(webUtils, contextRequireContext, url, 0, 4, null);
    }

    @Override // com.robinhood.android.lib.webview.WebViewUrlHandler.Callbacks
    public void onExternalUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        if (intent.resolveActivity(contextRequireContext.getPackageManager()) != null) {
            contextRequireContext.startActivity(intent);
        } else {
            Toast.makeText(contextRequireContext, C11048R.string.general_error_no_browser_found, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(RhWebViewState viewState) {
        WebView webview = getBindings().webview;
        Intrinsics.checkNotNullExpressionValue(webview, "webview");
        if (!viewState.getUrl().getIsHttps() || (!HttpUrls2.isRobinhoodDomain(viewState.getUrl()) && !getTargetBackend().isApollo())) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Duration loadingFallbackTimeout = viewState.getLoadingFallbackTimeout();
        if (loadingFallbackTimeout != null) {
            startFallbackTimer(loadingFallbackTimeout);
            getBindings().webLoadingView.startTimedAnimation(loadingFallbackTimeout);
        } else {
            getBindings().webLoadingView.startLoopingAnimation();
        }
        webview.clearHistory();
        webview.setWebChromeClient(new WebChromeClient() { // from class: com.robinhood.android.rhweb.RhWebFragment.bindViewState.1
            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
                WebView webView;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(resultMsg, "resultMsg");
                Object obj = resultMsg.obj;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
                WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) obj;
                if (!((Args) RhWebFragment.INSTANCE.getArgs((Fragment) RhWebFragment.this)).getOpenNewWindowInSystem()) {
                    webView = RhWebFragment.this.getBindings().newWindowWebview;
                    Intrinsics.checkNotNull(webView);
                } else {
                    webView = new WebView(RhWebFragment.this.requireContext());
                    final RhWebFragment rhWebFragment = RhWebFragment.this;
                    webView.setWebViewClient(new WebViewClient() { // from class: com.robinhood.android.rhweb.RhWebFragment$bindViewState$1$onCreateWindow$1$1
                        @Override // android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView view2, WebResourceRequest request) {
                            Intrinsics.checkNotNullParameter(view2, "view");
                            Intrinsics.checkNotNullParameter(request, "request");
                            if (rhWebFragment.getWebViewUrlHandler().handleNewWindowShouldOverrideUrlLoading(request)) {
                                return true;
                            }
                            RhWebFragment rhWebFragment2 = rhWebFragment;
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(request.getUrl());
                            rhWebFragment2.startActivity(intent);
                            return true;
                        }
                    });
                }
                webViewTransport.setWebView(webView);
                resultMsg.sendToTarget();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(PermissionRequest request) {
                if (((Args) RhWebFragment.INSTANCE.getArgs((Fragment) RhWebFragment.this)).getAllowCameraAccess()) {
                    Compat compat = Compat.INSTANCE;
                    if (compat.isApiSupported(21)) {
                        Context contextRequireContext = RhWebFragment.this.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        if (!compat.checkSelfPermission(contextRequireContext, "android.permission.CAMERA")) {
                            RhWebFragment.this.requestPermissionsCompat(2, "android.permission.CAMERA");
                            RhWebFragment.this.webviewPermissionRequest = request;
                        } else if (request != null) {
                            request.grant(request.getResources());
                        }
                    }
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequestCanceled(PermissionRequest request) {
                super.onPermissionRequestCanceled(request);
                RhWebFragment.this.showCameraPermissionNeededToast();
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> newFilePathCallback, WebChromeClient.FileChooserParams newFileChooserParams) {
                ValueCallback valueCallback = RhWebFragment.this.filePathCallback;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
                RhWebFragment.this.filePathCallback = newFilePathCallback;
                try {
                    RhWebFragment.this.getContent.launch("image/*");
                    return true;
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(RhWebFragment.this.requireContext(), RhWebFragment.this.getString(C11048R.string.general_error_no_image_picker_found), 0).show();
                    RhWebFragment.this.onFileChooserActivityResult(null);
                    return true;
                }
            }
        });
        getBindings().newWindowWebview.setWebViewClient(new WebViewClient() { // from class: com.robinhood.android.rhweb.RhWebFragment.bindViewState.2
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                return RhWebFragment.this.getWebViewUrlHandler().handleNewWindowShouldOverrideUrlLoading(request);
            }
        });
        webview.setWebViewClient(new DefaultWebViewClient(viewState.getUrl(), getWebViewUrlHandler(), this.networkCounter, new Function2() { // from class: com.robinhood.android.rhweb.RhWebFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RhWebFragment.bindViewState$lambda$8(this.f$0, (WebError) obj, (WebErrorView.ErrorViewType) obj2);
            }
        }));
        webview.loadUrl(viewState.getUrl().getUrl());
        webview.setDownloadListener(new DownloadListener() { // from class: com.robinhood.android.rhweb.RhWebFragment.bindViewState.4
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                WebUtils.viewUrl$default(RhWebFragment.this.getContext(), str, 0, 4, (Object) null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewState$lambda$8(RhWebFragment rhWebFragment, WebError error, WebErrorView.ErrorViewType errorViewType) {
        Intrinsics.checkNotNullParameter(error, "error");
        rhWebFragment.handleError(error, errorViewType);
        return Unit.INSTANCE;
    }

    private final void startFallbackTimer(Duration duration) {
        Observable<Long> observableTimer = Observable.timer(duration.toMillis(), TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableTimer, "timer(...)");
        this.timerDisposable = LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTimer), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhweb.RhWebFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhWebFragment.startFallbackTimer$lambda$9(this.f$0, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startFallbackTimer$lambda$9(RhWebFragment rhWebFragment, Long l) {
        RhWebListener rhWebListener = rhWebFragment.webListener;
        if (rhWebListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webListener");
            rhWebListener = null;
        }
        if (!rhWebListener.isWebReady()) {
            rhWebFragment.onWebViewNotLoaded();
        }
        return Unit.INSTANCE;
    }

    private final void stopFallbackTimer() {
        Disposable disposable = this.timerDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.timerDisposable = null;
    }

    private final void clearWebStorage() {
        WebStorage.getInstance().deleteAllData();
    }

    private final void handleError(WebError error, WebErrorView.ErrorViewType errorViewType) {
        boolean z = errorViewType != null;
        String str = z ? " (error screen shown)" : "";
        getAnalytics().logError(AnalyticsStrings.RH_WEB_SCREEN_NAME, error.getMessage() + str);
        if (z) {
            stopFallbackTimer();
            Intrinsics.checkNotNull(errorViewType);
            displayErrorView(error, errorViewType);
        }
    }

    private final void displayErrorView(final WebError error, final WebErrorView.ErrorViewType errorViewType) {
        try {
            getBindings().webview.removeJavascriptInterface(JS_INTERFACE_NAME);
            getBindings().webview.stopLoading();
            WebView webview = getBindings().webview;
            Intrinsics.checkNotNullExpressionValue(webview, "webview");
            webview.setVisibility(8);
            WebLoadingView webLoadingView = getBindings().webLoadingView;
            Intrinsics.checkNotNullExpressionValue(webLoadingView, "webLoadingView");
            webLoadingView.setVisibility(8);
            final WebErrorView webErrorView = getBindings().webErrorView;
            webErrorView.setErrorType(errorViewType, new Function0() { // from class: com.robinhood.android.rhweb.RhWebFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhWebFragment.displayErrorView$lambda$12$lambda$11(errorViewType, webErrorView, error, this);
                }
            });
            webErrorView.post(new Runnable() { // from class: com.robinhood.android.rhweb.RhWebFragment$displayErrorView$1$2
                @Override // java.lang.Runnable
                public final void run() {
                    WebErrorView webErrorView2 = webErrorView;
                    Intrinsics.checkNotNull(webErrorView2);
                    webErrorView2.setVisibility(0);
                }
            });
            Intrinsics.checkNotNull(webErrorView);
        } catch (IllegalStateException e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit displayErrorView$lambda$12$lambda$11(WebErrorView.ErrorViewType errorViewType, WebErrorView webErrorView, WebError webError, RhWebFragment rhWebFragment) {
        if (errorViewType == WebErrorView.ErrorViewType.ROUTE_TO_EMAIL) {
            Context context = webErrorView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer statusCode = webError.getStatusCode();
            EmailUtils2.sendSupportEmailIfSupported$default(context, null, null, statusCode != null ? CollectionsKt.listOf(String.valueOf(statusCode.intValue())) : null, null, 11, null);
            rhWebFragment.requireActivity().finish();
        } else {
            WebErrorView webErrorView2 = rhWebFragment.getBindings().webErrorView;
            Intrinsics.checkNotNullExpressionValue(webErrorView2, "webErrorView");
            webErrorView2.setVisibility(8);
            WebLoadingView webLoadingView = rhWebFragment.getBindings().webLoadingView;
            Intrinsics.checkNotNullExpressionValue(webLoadingView, "webLoadingView");
            webLoadingView.setVisibility(0);
            rhWebFragment.start();
        }
        return Unit.INSTANCE;
    }

    private final void onWebViewNotLoaded() {
        AnalyticsLogger analytics = getAnalytics();
        WebError.Timeout timeout = WebError.Timeout.INSTANCE;
        String message = timeout.getMessage();
        Intrinsics.checkNotNull(message);
        analytics.logError(AnalyticsStrings.RH_WEB_SCREEN_NAME, message);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        AbsErrorHandler.handleError$default(new ActivityErrorHandler(fragmentActivityRequireActivity, true, 0, null, 12, null), timeout, false, 2, null);
        requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCameraPermissionNeededToast() {
        Toast.makeText(requireContext(), C27330R.string.camera_permission_canceled, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFileChooserActivityResult(Uri[] results) {
        ValueCallback<Uri[]> valueCallback = this.filePathCallback;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(results);
        }
        this.filePathCallback = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RhWebFragment.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhweb/RhWebFragment$WebViewState;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "LOADED", "feature-rhweb_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class WebViewState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ WebViewState[] $VALUES;
        public static final WebViewState LOADING = new WebViewState("LOADING", 0);
        public static final WebViewState LOADED = new WebViewState("LOADED", 1);

        private static final /* synthetic */ WebViewState[] $values() {
            return new WebViewState[]{LOADING, LOADED};
        }

        public static EnumEntries<WebViewState> getEntries() {
            return $ENTRIES;
        }

        private WebViewState(String str, int i) {
        }

        static {
            WebViewState[] webViewStateArr$values = $values();
            $VALUES = webViewStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(webViewStateArr$values);
        }

        public static WebViewState valueOf(String str) {
            return (WebViewState) Enum.valueOf(WebViewState.class, str);
        }

        public static WebViewState[] values() {
            return (WebViewState[]) $VALUES.clone();
        }
    }

    @Override // com.robinhood.android.rhweb.RhWebListener.Callbacks
    public void onFirstInteraction() {
        setWebViewState(WebViewState.LOADED);
        Completable completableComplete = Completable.complete();
        Intrinsics.checkNotNullExpressionValue(completableComplete, "complete(...)");
        LifecycleHost.DefaultImpls.bind$default(this, CompletablesAndroid.observeOnMainThread(completableComplete), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.rhweb.RhWebFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhWebFragment.onFirstInteraction$lambda$13(this.f$0);
            }
        });
        Observable<Long> observableTimer = Observable.timer(WebLoadingView.INSTANCE.getREADY_FINISH_ANIMATION_DURATION().toMillis(), TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableTimer, "timer(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTimer), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhweb.RhWebFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhWebFragment.onFirstInteraction$lambda$14(this.f$0, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFirstInteraction$lambda$13(RhWebFragment rhWebFragment) {
        rhWebFragment.getBindings().webLoadingView.quicklyFinishAnimation();
        if (((Args) INSTANCE.getArgs((Fragment) rhWebFragment)).getHideToolbar()) {
            rhWebFragment.setToolbarHidden(true);
            rhWebFragment.requireBaseActivity().hideToolbar();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFirstInteraction$lambda$14(RhWebFragment rhWebFragment, Long l) {
        WebLoadingView webLoadingView = rhWebFragment.getBindings().webLoadingView;
        Intrinsics.checkNotNullExpressionValue(webLoadingView, "webLoadingView");
        webLoadingView.setVisibility(8);
        WebView webview = rhWebFragment.getBindings().webview;
        Intrinsics.checkNotNullExpressionValue(webview, "webview");
        webview.setVisibility(0);
        IdlingResourceCounters2.setBusy(IdlingResourceType.RH_WEB, false);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.rhweb.RhWebListener.Callbacks
    public void getInitialConfig() throws Exception {
        if (this.webViewState == WebViewState.LOADING) {
            doInitialConfigRequest();
        }
    }

    private final void doInitialConfigRequest() throws Exception {
        try {
            Single singleSingleOrError = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.rhweb.RhWebFragment.doInitialConfigRequest.1
                @Override // io.reactivex.functions.Function
                public final WebConfig apply(RhWebViewState it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getWebConfig();
                }
            }).take(1L).singleOrError();
            Intrinsics.checkNotNullExpressionValue(singleSingleOrError, "singleOrError(...)");
            Single singleObserveOnMainThread = SinglesAndroid.observeOnMainThread(singleSingleOrError);
            WebView webview = getBindings().webview;
            Intrinsics.checkNotNullExpressionValue(webview, "webview");
            ViewDisposerKt.bindTo(singleObserveOnMainThread, webview).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhweb.RhWebFragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhWebFragment.doInitialConfigRequest$lambda$15(this.f$0, (WebConfig) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.rhweb.RhWebFragment$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhWebFragment.doInitialConfigRequest$lambda$16(this.f$0, (Throwable) obj);
                }
            });
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doInitialConfigRequest$lambda$15(RhWebFragment rhWebFragment, WebConfig webConfig) {
        WebResponder webResponder = rhWebFragment.webResponder;
        Intrinsics.checkNotNull(webResponder);
        Intrinsics.checkNotNull(webConfig);
        webResponder.setInitialConfig(webConfig);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doInitialConfigRequest$lambda$16(RhWebFragment rhWebFragment, Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        rhWebFragment.handleError(new WebError.InitialConfigException(exception.getMessage()), WebErrorView.ErrorViewType.ROUTE_TO_EMAIL);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.rhweb.RhWebListener.Callbacks
    public void refreshToken() {
        Single singleObserveOnMainThread = SinglesAndroid.observeOnMainThread(getDuxo().refreshAuthToken());
        WebView webview = getBindings().webview;
        Intrinsics.checkNotNullExpressionValue(webview, "webview");
        ViewDisposerKt.bindTo(singleObserveOnMainThread, webview).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhweb.RhWebFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhWebFragment.refreshToken$lambda$17(this.f$0, (Optional) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhweb.RhWebFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhWebFragment.refreshToken$lambda$18(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshToken$lambda$17(RhWebFragment rhWebFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        OAuthToken oAuthToken = (OAuthToken) optional.component1();
        if (oAuthToken != null) {
            WebResponder webResponder = rhWebFragment.webResponder;
            Intrinsics.checkNotNull(webResponder);
            webResponder.setToken(oAuthToken);
        } else {
            AuthManager authManager = rhWebFragment.getAuthManager();
            FragmentActivity fragmentActivityRequireActivity = rhWebFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            AuthManager.DefaultImpls.initiateLogout$default(authManager, fragmentActivityRequireActivity, LogoutType.HTTP_401, null, false, null, "rh_web_token_refresh", 28, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshToken$lambda$18(RhWebFragment rhWebFragment, Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        rhWebFragment.handleError(exception instanceof WebError ? (WebError) exception : new WebError.GenericAuthTokenException(exception.getMessage()), WebErrorView.ErrorViewType.ROUTE_TO_EMAIL);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.rhweb.RhWebListener.Callbacks
    public void disableBackNavigation() {
        Completable completableComplete = Completable.complete();
        Intrinsics.checkNotNullExpressionValue(completableComplete, "complete(...)");
        LifecycleHost.DefaultImpls.bind$default(this, CompletablesAndroid.observeOnMainThread(completableComplete), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.rhweb.RhWebFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhWebFragment.disableBackNavigation$lambda$19(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit disableBackNavigation$lambda$19(RhWebFragment rhWebFragment) {
        rhWebFragment.configureToolbar(rhWebFragment.requireToolbar());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.rhweb.RhWebListener.Callbacks
    public void dismissWebView() {
        getCallbacks().dismissWebView();
        View view = getView();
        if (view != null) {
            view.post(new Runnable() { // from class: com.robinhood.android.rhweb.RhWebFragment.dismissWebView.1
                @Override // java.lang.Runnable
                public final void run() {
                    RhWebFragment.this.requireActivity().onBackPressed();
                }
            });
        }
    }

    @Override // com.robinhood.android.rhweb.RhWebListener.Callbacks
    public void dismissWebViewAndContinue() {
        getCallbacks().dismissWebViewAndContinue();
        View view = getView();
        if (view != null) {
            view.post(new Runnable() { // from class: com.robinhood.android.rhweb.RhWebFragment.dismissWebViewAndContinue.1
                @Override // java.lang.Runnable
                public final void run() {
                    RhWebFragment.this.requireActivity().onBackPressed();
                }
            });
        }
    }

    /* compiled from: RhWebFragment.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001f\u001a\u00020\nHÂ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\"HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/rhweb/RhWebFragment$Args;", "Landroid/os/Parcelable;", "allowCameraAccess", "", "allowFileAccess", "acceptThirdPartyCookies", "hideToolbar", "openNewWindowInSystem", "convertToRhWebLink", "destinationUri", "Landroid/net/Uri;", "<init>", "(ZZZZZZLandroid/net/Uri;)V", "getAllowCameraAccess", "()Z", "getAllowFileAccess", "getAcceptThirdPartyCookies", "getHideToolbar", "getOpenNewWindowInSystem", "uri", "Lokhttp3/HttpUrl;", "resources", "Landroid/content/res/Resources;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rhweb_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean acceptThirdPartyCookies;
        private final boolean allowCameraAccess;
        private final boolean allowFileAccess;
        private final boolean convertToRhWebLink;
        private final Uri destinationUri;
        private final boolean hideToolbar;
        private final boolean openNewWindowInSystem;

        /* compiled from: RhWebFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z6 = false;
                boolean z7 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z7 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                if (parcel.readInt() != 0) {
                    z5 = z4;
                } else {
                    z5 = z4;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z5 = z;
                }
                return new Args(z6, z7, z2, z3, z4, z5, (Uri) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* renamed from: component6, reason: from getter */
        private final boolean getConvertToRhWebLink() {
            return this.convertToRhWebLink;
        }

        /* renamed from: component7, reason: from getter */
        private final Uri getDestinationUri() {
            return this.destinationUri;
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.allowCameraAccess;
            }
            if ((i & 2) != 0) {
                z2 = args.allowFileAccess;
            }
            if ((i & 4) != 0) {
                z3 = args.acceptThirdPartyCookies;
            }
            if ((i & 8) != 0) {
                z4 = args.hideToolbar;
            }
            if ((i & 16) != 0) {
                z5 = args.openNewWindowInSystem;
            }
            if ((i & 32) != 0) {
                z6 = args.convertToRhWebLink;
            }
            if ((i & 64) != 0) {
                uri = args.destinationUri;
            }
            boolean z7 = z6;
            Uri uri2 = uri;
            boolean z8 = z5;
            boolean z9 = z3;
            return args.copy(z, z2, z9, z4, z8, z7, uri2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getAllowCameraAccess() {
            return this.allowCameraAccess;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getAllowFileAccess() {
            return this.allowFileAccess;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAcceptThirdPartyCookies() {
            return this.acceptThirdPartyCookies;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHideToolbar() {
            return this.hideToolbar;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getOpenNewWindowInSystem() {
            return this.openNewWindowInSystem;
        }

        public final Args copy(boolean allowCameraAccess, boolean allowFileAccess, boolean acceptThirdPartyCookies, boolean hideToolbar, boolean openNewWindowInSystem, boolean convertToRhWebLink, Uri destinationUri) {
            Intrinsics.checkNotNullParameter(destinationUri, "destinationUri");
            return new Args(allowCameraAccess, allowFileAccess, acceptThirdPartyCookies, hideToolbar, openNewWindowInSystem, convertToRhWebLink, destinationUri);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return this.allowCameraAccess == args.allowCameraAccess && this.allowFileAccess == args.allowFileAccess && this.acceptThirdPartyCookies == args.acceptThirdPartyCookies && this.hideToolbar == args.hideToolbar && this.openNewWindowInSystem == args.openNewWindowInSystem && this.convertToRhWebLink == args.convertToRhWebLink && Intrinsics.areEqual(this.destinationUri, args.destinationUri);
        }

        public int hashCode() {
            return (((((((((((Boolean.hashCode(this.allowCameraAccess) * 31) + Boolean.hashCode(this.allowFileAccess)) * 31) + Boolean.hashCode(this.acceptThirdPartyCookies)) * 31) + Boolean.hashCode(this.hideToolbar)) * 31) + Boolean.hashCode(this.openNewWindowInSystem)) * 31) + Boolean.hashCode(this.convertToRhWebLink)) * 31) + this.destinationUri.hashCode();
        }

        public String toString() {
            return "Args(allowCameraAccess=" + this.allowCameraAccess + ", allowFileAccess=" + this.allowFileAccess + ", acceptThirdPartyCookies=" + this.acceptThirdPartyCookies + ", hideToolbar=" + this.hideToolbar + ", openNewWindowInSystem=" + this.openNewWindowInSystem + ", convertToRhWebLink=" + this.convertToRhWebLink + ", destinationUri=" + this.destinationUri + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.allowCameraAccess ? 1 : 0);
            dest.writeInt(this.allowFileAccess ? 1 : 0);
            dest.writeInt(this.acceptThirdPartyCookies ? 1 : 0);
            dest.writeInt(this.hideToolbar ? 1 : 0);
            dest.writeInt(this.openNewWindowInSystem ? 1 : 0);
            dest.writeInt(this.convertToRhWebLink ? 1 : 0);
            dest.writeParcelable(this.destinationUri, flags);
        }

        public Args(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Uri destinationUri) {
            Intrinsics.checkNotNullParameter(destinationUri, "destinationUri");
            this.allowCameraAccess = z;
            this.allowFileAccess = z2;
            this.acceptThirdPartyCookies = z3;
            this.hideToolbar = z4;
            this.openNewWindowInSystem = z5;
            this.convertToRhWebLink = z6;
            this.destinationUri = destinationUri;
        }

        public final boolean getAllowCameraAccess() {
            return this.allowCameraAccess;
        }

        public final boolean getAllowFileAccess() {
            return this.allowFileAccess;
        }

        public final boolean getAcceptThirdPartyCookies() {
            return this.acceptThirdPartyCookies;
        }

        public final boolean getHideToolbar() {
            return this.hideToolbar;
        }

        public final boolean getOpenNewWindowInSystem() {
            return this.openNewWindowInSystem;
        }

        public final HttpUrl uri(Resources resources, TargetBackend targetBackend) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            if (this.convertToRhWebLink) {
                return UriExtension.toRhWebLink(this.destinationUri, resources, targetBackend);
            }
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            String string2 = this.destinationUri.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return companion.get(string2);
        }
    }

    /* compiled from: RhWebFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/rhweb/RhWebFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rhweb/RhWebFragment;", "Lcom/robinhood/android/rhweb/RhWebFragment$Args;", "<init>", "()V", "PERMISSION_REQUEST_CODE", "", "JS_INTERFACE_NAME", "", "feature-rhweb_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RhWebFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RhWebFragment rhWebFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rhWebFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhWebFragment newInstance(Args args) {
            return (RhWebFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhWebFragment rhWebFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rhWebFragment, args);
        }
    }
}
