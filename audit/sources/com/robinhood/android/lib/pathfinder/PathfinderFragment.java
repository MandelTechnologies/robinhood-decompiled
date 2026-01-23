package com.robinhood.android.lib.pathfinder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroup2;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$OpenDocument;
import androidx.view.result.contract.ActivityResultContracts$OpenMultipleDocuments;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.EmailUtils2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.lib.pathfinder.InternalPathfinderEvent;
import com.robinhood.android.lib.pathfinder.PathfinderViewState;
import com.robinhood.android.lib.pathfinder.databinding.FragmentPathfinderBinding;
import com.robinhood.android.lib.pathfinder.views.PathfinderUnprivlegedWebView;
import com.robinhood.android.lib.pathfinder.views.PathfinderWebView;
import com.robinhood.android.lib.pathfinder.views.PathfinderWebViewEvent;
import com.robinhood.android.lib.stepupverification.VerificationWorkflowActivity;
import com.robinhood.android.lib.webview.WebError;
import com.robinhood.android.lib.webview.WebViewUrlHandler;
import com.robinhood.android.lib.webview.extensions.AnalyticsLoggers;
import com.robinhood.android.lib.webview.view.WebErrorView;
import com.robinhood.android.lib.webview.view.WebLoadingView;
import com.robinhood.android.navigation.C22231R;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.pathfinder.UserViewToast;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStateResultContext;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.prefs.Installation;
import com.robinhood.shared.support.contracts.PathfinderFragmentKey;
import com.robinhood.shared.support.contracts.PathfinderFragmentKey2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.Preconditions4;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.ObservablesKt;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.HttpUrl;

/* compiled from: PathfinderFragment.kt */
@Metadata(m3635d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 v2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002uvB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010?\u001a\u00020@J\u0012\u0010A\u001a\u00020@2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u001a\u0010D\u001a\u00020@2\u0006\u0010E\u001a\u00020F2\b\u0010B\u001a\u0004\u0018\u00010CH\u0017J\u0010\u0010G\u001a\u00020@2\u0006\u0010H\u001a\u00020CH\u0016J\b\u0010I\u001a\u00020@H\u0016J\b\u0010J\u001a\u00020@H\u0002J\u0010\u0010K\u001a\u00020@2\u0006\u0010L\u001a\u00020MH\u0002J\u0012\u0010N\u001a\u00020@2\b\u0010L\u001a\u0004\u0018\u00010OH\u0002J\u0012\u0010P\u001a\u00020@2\b\u0010L\u001a\u0004\u0018\u00010QH\u0002J\u0012\u0010R\u001a\u00020@2\b\u0010L\u001a\u0004\u0018\u00010SH\u0002J\u0016\u0010T\u001a\u00020@2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020W0VH\u0002J\b\u0010X\u001a\u00020@H\u0016J\b\u0010]\u001a\u000201H\u0016J\u0010\u0010^\u001a\u00020@2\u0006\u0010_\u001a\u000209H\u0002J$\u0010`\u001a\u00020@2\u0006\u0010a\u001a\u00020b2\u0012\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090807H\u0002J\u0018\u0010c\u001a\u00020@2\u0006\u0010d\u001a\u0002092\u0006\u0010e\u001a\u000201H\u0002J\u0010\u0010f\u001a\u00020@2\u0006\u0010Y\u001a\u00020ZH\u0002J\u0010\u0010g\u001a\u00020@2\u0006\u0010h\u001a\u00020iH\u0002J\u0016\u0010j\u001a\u00020@2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020m0lH\u0002J\u0010\u0010n\u001a\u00020@2\u0006\u0010o\u001a\u00020pH\u0002J\b\u0010q\u001a\u00020@H\u0002J\u0010\u0010r\u001a\u00020@2\u0006\u0010s\u001a\u00020tH\u0003R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010(\u001a\u0004\u0018\u00010)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\u000201X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00103R\u001c\u00106\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020908\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010:\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020< =*\n\u0012\u0004\u0012\u00020<\u0018\u000108080;X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010>\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020< =*\n\u0012\u0004\u0012\u00020<\u0018\u000108080;X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010Y\u001a\u00020Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006w"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", "Lcom/robinhood/android/common/ui/BaseFragment$ChildFragmentAnimationOverrider;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/SharedEventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/SharedEventLogger;)V", "installation", "Lcom/robinhood/prefs/Installation;", "getInstallation", "()Lcom/robinhood/prefs/Installation;", "setInstallation", "(Lcom/robinhood/prefs/Installation;)V", "duxo", "Lcom/robinhood/android/lib/pathfinder/PathfinderDuxo;", "getDuxo", "()Lcom/robinhood/android/lib/pathfinder/PathfinderDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "bindings", "Lcom/robinhood/android/lib/pathfinder/databinding/FragmentPathfinderBinding;", "getBindings", "()Lcom/robinhood/android/lib/pathfinder/databinding/FragmentPathfinderBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "webView", "Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebView;", "getWebView", "()Lcom/robinhood/android/lib/pathfinder/views/PathfinderWebView;", "newWindowWebView", "Landroid/webkit/WebView;", "getNewWindowWebView", "()Landroid/webkit/WebView;", "savedLatestPageSequence", "Ljava/util/concurrent/atomic/AtomicInteger;", "unprivlegedWebCallbacks", "Lcom/robinhood/android/lib/webview/WebViewUrlHandler$Callbacks;", "excludeFromAnalyticsLogging", "", "getExcludeFromAnalyticsLogging", "()Z", "shouldOverrideChildFragmentAnimation", "getShouldOverrideChildFragmentAnimation", "filePathCallback", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "uploadSingleDocument", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "uploadMultipleDocuments", "updatePageData", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onSaveInstanceState", "outState", "onStart", "refreshIssue", "onNewContent", "content", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content;", "bindWebLoading", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content$WebLoading;", "bindWebError", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content$WebError;", "bindPage", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content$Page;", "onNewInternalEvent", "udfEvent", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/lib/pathfinder/InternalPathfinderEvent;", "dismissFlow", "inquiryId", "Ljava/util/UUID;", "getInquiryId", "()Ljava/util/UUID;", "onBackPressed", "onMailTo", "uri", "onShowFileChooser", "fileChooserParams", "Landroid/webkit/WebChromeClient$FileChooserParams;", "onExitAppLinkReceived", "url", "shouldManuallyDismiss", "onNewInquiryReceived", "onResultReceived", "result", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStateResultContext;", "onUnhandledInputError", "event", "Lcom/robinhood/udf/UiEvent;", "", "onNewUnprivilegedWebView", "message", "Landroid/os/Message;", "onCloseUnprivilegedWebView", "pushNewFragmentIfContextDifferent", "render", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content$Page$Native;", "VisibilityFlags", "Companion", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PathfinderFragment extends BaseFragment implements PathfinderFragmentCallbacks, BaseFragment.ChildFragmentAnimationOverrider {
    private static final String PATHFINDER_PAGE_FRAGMENT_TAG = "pathfinder_page_fragment";
    private static final String SAVED_LATEST_PAGE_SEQUENCE = "latest page sequence";
    private static final String SAVED_VISIBILITY_FLAGS = "visibility_flags";
    public AnalyticsLogger analytics;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public SharedEventLogger eventLogger;
    private final boolean excludeFromAnalyticsLogging;
    private ValueCallback<Uri[]> filePathCallback;
    public Installation installation;
    private final AtomicInteger savedLatestPageSequence;
    private final WebViewUrlHandler.Callbacks unprivlegedWebCallbacks;
    private final ActivityResultLauncher<String[]> uploadMultipleDocuments;
    private final ActivityResultLauncher<String[]> uploadSingleDocument;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PathfinderFragment.class, "bindings", "getBindings()Lcom/robinhood/android/lib/pathfinder/databinding/FragmentPathfinderBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PathfinderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebErrorView.ErrorViewType.values().length];
            try {
                iArr[WebErrorView.ErrorViewType.ROUTE_TO_EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebErrorView.ErrorViewType.RETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.common.ui.BaseFragment.ChildFragmentAnimationOverrider
    public boolean getShouldOverrideChildFragmentAnimation() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNewInternalEvent(final Event<InternalPathfinderEvent> udfEvent) {
        EventConsumer<InternalPathfinderEvent> eventConsumerInvoke;
        if (!(udfEvent.getData() instanceof InternalPathfinderEvent) || (eventConsumerInvoke = udfEvent.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(udfEvent, new Function1() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment$onNewInternalEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m15827invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m15827invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                InternalPathfinderEvent internalPathfinderEvent = (InternalPathfinderEvent) udfEvent.getData();
                Preconditions4.checkOnMainThread(Preconditions.INSTANCE);
                if (internalPathfinderEvent instanceof InternalPathfinderEvent.ExternalUrlEvent) {
                    WebUtils webUtils = WebUtils.INSTANCE;
                    Context contextRequireContext = this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    WebUtils.viewUrl$default(webUtils, contextRequireContext, ((InternalPathfinderEvent.ExternalUrlEvent) internalPathfinderEvent).getUrl(), 0, 4, null);
                    return;
                }
                if (internalPathfinderEvent instanceof InternalPathfinderEvent.UriDeepLinkEvent) {
                    Navigator navigator = this.getNavigator();
                    Context contextRequireContext2 = this.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                    Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext2, ((InternalPathfinderEvent.UriDeepLinkEvent) internalPathfinderEvent).getUri(), null, null, false, null, 60, null);
                    return;
                }
                if (!(internalPathfinderEvent instanceof InternalPathfinderEvent.MailTo)) {
                    if (!Intrinsics.areEqual(internalPathfinderEvent, InternalPathfinderEvent.StopLoading.INSTANCE)) {
                        if (internalPathfinderEvent instanceof InternalPathfinderEvent.ShowFileChooserEvent) {
                            InternalPathfinderEvent.ShowFileChooserEvent showFileChooserEvent = (InternalPathfinderEvent.ShowFileChooserEvent) internalPathfinderEvent;
                            this.onShowFileChooser(showFileChooserEvent.getFileChooserParams(), showFileChooserEvent.getFilePathCallback());
                            return;
                        }
                        if (!(internalPathfinderEvent instanceof InternalPathfinderEvent.ExitAppLinkEvent)) {
                            if (!(internalPathfinderEvent instanceof InternalPathfinderEvent.NewInquiry)) {
                                if (!(internalPathfinderEvent instanceof InternalPathfinderEvent.UserViewStateResult)) {
                                    if (internalPathfinderEvent instanceof InternalPathfinderEvent.ClosePathfinder) {
                                        if (((PathfinderFragmentKey) PathfinderFragment.INSTANCE.getArgs((Fragment) this)).getSetResultMode() instanceof PathfinderFragmentKey2.Dismiss) {
                                            this.requireActivity().setResult(-1);
                                        }
                                        this.requireActivity().finish();
                                        return;
                                    } else {
                                        if (!(internalPathfinderEvent instanceof InternalPathfinderEvent.UserViewStateShowToast)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        UserViewToast toast = ((InternalPathfinderEvent.UserViewStateShowToast) internalPathfinderEvent).getToast();
                                        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
                                        View viewRequireView = this.requireView();
                                        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                                        RichText description = toast.getDescription();
                                        Context contextRequireContext3 = this.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                                        companion.make(viewRequireView, IconExtensions.toSpannableString$default(description, contextRequireContext3, null, false, null, 14, null), -1).setLeadingIcon(toast.getIcon().getResourceId()).show();
                                        return;
                                    }
                                }
                                this.onResultReceived(((InternalPathfinderEvent.UserViewStateResult) internalPathfinderEvent).getResult());
                                return;
                            }
                            this.onNewInquiryReceived(((InternalPathfinderEvent.NewInquiry) internalPathfinderEvent).getInquiryId());
                            return;
                        }
                        InternalPathfinderEvent.ExitAppLinkEvent exitAppLinkEvent = (InternalPathfinderEvent.ExitAppLinkEvent) internalPathfinderEvent;
                        this.onExitAppLinkReceived(exitAppLinkEvent.getUrl(), exitAppLinkEvent.getShouldManuallyDismiss());
                        return;
                    }
                    this.getWebView().stopLoading();
                    return;
                }
                this.onMailTo(((InternalPathfinderEvent.MailTo) internalPathfinderEvent).getUri());
            }
        });
    }

    @Override // com.robinhood.android.common.ui.BaseFragment.ChildFragmentAnimationOverrider
    /* renamed from: getForcedChildAnimationResId */
    public Integer getChildNextAnim() {
        return BaseFragment.ChildFragmentAnimationOverrider.DefaultImpls.getForcedChildAnimationResId(this);
    }

    public PathfinderFragment() {
        super(C20366R.layout.fragment_pathfinder);
        this.duxo = DuxosKt.duxo(this, PathfinderDuxo.class);
        this.bindings = ViewBinding5.viewBinding(this, PathfinderFragment3.INSTANCE);
        this.savedLatestPageSequence = new AtomicInteger(-1);
        this.unprivlegedWebCallbacks = new WebViewUrlHandler.Callbacks() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment$unprivlegedWebCallbacks$1
            private final boolean backNavigationEnabled = true;

            @Override // com.robinhood.android.lib.webview.WebViewUrlHandler.Callbacks
            public void onExternalUri(Uri uri) {
                Intrinsics.checkNotNullParameter(uri, "uri");
            }

            @Override // com.robinhood.android.lib.webview.WebViewUrlHandler.Callbacks
            public boolean getBackNavigationEnabled() {
                return this.backNavigationEnabled;
            }

            @Override // com.robinhood.android.lib.webview.WebViewUrlHandler.Callbacks
            public void onMailTo(Uri uri) throws Throwable {
                Intrinsics.checkNotNullParameter(uri, "uri");
                PathfinderDuxo.handleWebViewEvent$default(this.this$0.getDuxo(), new PathfinderWebViewEvent.MailToEvent(uri), null, 2, null);
            }

            @Override // com.robinhood.android.lib.webview.WebViewUrlHandler.Callbacks
            public void onDoneClick() throws Throwable {
                PathfinderDuxo.handleWebViewEvent$default(this.this$0.getDuxo(), PathfinderWebViewEvent.DoneClickEvent.INSTANCE, null, 2, null);
            }

            @Override // com.robinhood.android.lib.webview.WebViewUrlHandler.Callbacks
            public void onDeeplink(Uri uri) throws Throwable {
                Intrinsics.checkNotNullParameter(uri, "uri");
                PathfinderDuxo.handleWebViewEvent$default(this.this$0.getDuxo(), new PathfinderWebViewEvent.LinkEvent.UriDeepLinkEvent(uri), null, 2, null);
            }

            @Override // com.robinhood.android.lib.webview.WebViewUrlHandler.Callbacks
            public void onExternalUrl(HttpUrl url) throws Throwable {
                Intrinsics.checkNotNullParameter(url, "url");
                PathfinderDuxo.handleWebViewEvent$default(this.this$0.getDuxo(), new PathfinderWebViewEvent.LinkEvent.ExternalUrlEvent(url), null, 2, null);
            }
        };
        this.excludeFromAnalyticsLogging = true;
        ActivityResultLauncher<String[]> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$OpenDocument(), new ActivityResultCallback() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment$uploadSingleDocument$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Uri uri) {
                ValueCallback valueCallback = this.this$0.filePathCallback;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(uri != null ? new Uri[]{uri} : null);
                }
                this.this$0.filePathCallback = null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.uploadSingleDocument = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<String[]> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts$OpenMultipleDocuments(), new ActivityResultCallback() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment$uploadMultipleDocuments$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(List<Uri> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ValueCallback valueCallback = this.this$0.filePathCallback;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue((Uri[]) it.toArray(new Uri[0]));
                }
                this.this$0.filePathCallback = null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.uploadMultipleDocuments = activityResultLauncherRegisterForActivityResult2;
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

    public final Installation getInstallation() {
        Installation installation = this.installation;
        if (installation != null) {
            return installation;
        }
        Intrinsics.throwUninitializedPropertyAccessException("installation");
        return null;
    }

    public final void setInstallation(Installation installation) {
        Intrinsics.checkNotNullParameter(installation, "<set-?>");
        this.installation = installation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PathfinderDuxo getDuxo() {
        return (PathfinderDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentPathfinderBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentPathfinderBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PathfinderWebView getWebView() {
        PathfinderWebView pathfinderWebview = getBindings().pathfinderWebview;
        Intrinsics.checkNotNullExpressionValue(pathfinderWebview, "pathfinderWebview");
        return pathfinderWebview;
    }

    private final WebView getNewWindowWebView() {
        FrameLayout newWebviewContainer = getBindings().newWebviewContainer;
        Intrinsics.checkNotNullExpressionValue(newWebviewContainer, "newWebviewContainer");
        return (WebView) SequencesKt.firstOrNull(SequencesKt.mapNotNull(ViewGroup2.getChildren(newWebviewContainer), new Function1() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderFragment._get_newWindowWebView_$lambda$0((View) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView _get_newWindowWebView_$lambda$0(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof WebView) {
            return (WebView) it;
        }
        return null;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    public final void updatePageData() {
        getWebView().updatePageData();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getInstallation().mo2745id();
        PathfinderDuxo duxo = getDuxo();
        Fragment parentFragment = getParentFragment();
        duxo.setPathfinderRelay$lib_pathfinder_externalDebug(parentFragment != null ? (PathfinderRelay) new ViewModelProvider(parentFragment).get(PathfinderRelay.class) : null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle savedInstanceState) {
        Parcelable parcelable;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewCompat.setOnApplyWindowInsetsListener(getBindings().pathfinderContainer, new OnApplyWindowInsetsListener() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment.onViewCreated.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
                Intrinsics.checkNotNullParameter(v, "v");
                Intrinsics.checkNotNullParameter(insets, "insets");
                v.setPadding(v.getPaddingLeft(), v.getPaddingTop(), v.getPaddingRight(), Math.max(insets.getInsets(WindowInsetsCompat.Type.systemBars()).bottom, insets.getInsets(WindowInsetsCompat.Type.ime()).bottom));
                return insets;
            }
        });
        if (savedInstanceState != null) {
            this.savedLatestPageSequence.set(savedInstanceState.getInt(SAVED_LATEST_PAGE_SEQUENCE, -1));
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = (Parcelable) savedInstanceState.getParcelable(SAVED_VISIBILITY_FLAGS, VisibilityFlags.class);
            } else {
                Parcelable parcelable2 = savedInstanceState.getParcelable(SAVED_VISIBILITY_FLAGS);
                if (!(parcelable2 instanceof VisibilityFlags)) {
                    parcelable2 = null;
                }
                parcelable = (VisibilityFlags) parcelable2;
            }
            VisibilityFlags visibilityFlags = (VisibilityFlags) parcelable;
            if (visibilityFlags != null) {
                WebLoadingView pathfinderWebLoadingView = getBindings().pathfinderWebLoadingView;
                Intrinsics.checkNotNullExpressionValue(pathfinderWebLoadingView, "pathfinderWebLoadingView");
                pathfinderWebLoadingView.setVisibility(visibilityFlags.isWebLoadingVisible() ? 0 : 8);
                PathfinderWebView pathfinderWebview = getBindings().pathfinderWebview;
                Intrinsics.checkNotNullExpressionValue(pathfinderWebview, "pathfinderWebview");
                pathfinderWebview.setVisibility(visibilityFlags.isWebViewVisible() ? 0 : 8);
                WebErrorView pathfinderWebErrorView = getBindings().pathfinderWebErrorView;
                Intrinsics.checkNotNullExpressionValue(pathfinderWebErrorView, "pathfinderWebErrorView");
                pathfinderWebErrorView.setVisibility(visibilityFlags.isWebErrorViewVisible() ? 0 : 8);
                FrameLayout fragmentContainer = getBindings().fragmentContainer;
                Intrinsics.checkNotNullExpressionValue(fragmentContainer, "fragmentContainer");
                fragmentContainer.setVisibility(visibilityFlags.isFragmentContainerVisible() ? 0 : 8);
                RdsProgressBar loadingProgressBar = getBindings().loadingProgressBar;
                Intrinsics.checkNotNullExpressionValue(loadingProgressBar, "loadingProgressBar");
                loadingProgressBar.setVisibility(visibilityFlags.isInquiryUpdateLoadingVisible() ? 0 : 8);
            }
        }
        BaseFragment.collectDuxoState$default(this, null, new C203603(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C203614(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C203625(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C203636(null), 1, null);
        getWebView().setDownloadListener(new DownloadListener() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment.onViewCreated.7
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                WebUtils.viewUrl$default(PathfinderFragment.this.getContext(), str, 0, 4, (Object) null);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment.onViewCreated.8
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat insets) {
                Intrinsics.checkNotNullParameter(view2, "<unused var>");
                Intrinsics.checkNotNullParameter(insets, "insets");
                Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.navigationBars());
                Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
                View view3 = view;
                view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), insets2.bottom);
                return WindowInsetsCompat.CONSUMED;
            }
        });
        getBindings().pathfinderWebLoadingView.startLoopingAnimation();
    }

    /* compiled from: PathfinderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$3", m3645f = "PathfinderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$3 */
    static final class C203603 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C203603(Continuation<? super C203603> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PathfinderFragment.this.new C203603(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C203603) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.filterNotNull(PathfinderFragment.this.getDuxo().getEventFlow()));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PathfinderFragment.this);
                this.label = 1;
                if (flowDistinctUntilChanged.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: PathfinderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$3$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ PathfinderFragment $tmp0;

            AnonymousClass1(PathfinderFragment pathfinderFragment) {
                this.$tmp0 = pathfinderFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, PathfinderFragment.class, "onNewInternalEvent", "onNewInternalEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<InternalPathfinderEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$onNewInternalEvent = C203603.invokeSuspend$onNewInternalEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$onNewInternalEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$onNewInternalEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<InternalPathfinderEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$onNewInternalEvent(PathfinderFragment pathfinderFragment, Event event, Continuation continuation) {
            pathfinderFragment.onNewInternalEvent(event);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: PathfinderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$4", m3645f = "PathfinderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$4 */
    static final class C203614 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C203614(Continuation<? super C203614> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PathfinderFragment.this.new C203614(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C203614) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<PathfinderViewState> stateFlow = PathfinderFragment.this.getDuxo().getStateFlow();
                final Flow<PathfinderViewState> flow = new Flow<PathfinderViewState>() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$4$invokeSuspend$$inlined$filterNot$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super PathfinderViewState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$4$invokeSuspend$$inlined$filterNot$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$4$invokeSuspend$$inlined$filterNot$1$2", m3645f = "PathfinderFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$4$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
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
                                if (!(((PathfinderViewState) obj).getContent() instanceof PathfinderViewState.Content.None)) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
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
                };
                Flow<Tuples2<? extends PathfinderViewState.Content, ? extends Integer>> flow2 = new Flow<Tuples2<? extends PathfinderViewState.Content, ? extends Integer>>() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$4$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends PathfinderViewState.Content, ? extends Integer>> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new C203532(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$4$invokeSuspend$$inlined$map$1$2 */
                    public static final class C203532<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$4$invokeSuspend$$inlined$map$1$2", m3645f = "PathfinderFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C203532.this.emit(null, this);
                            }
                        }

                        public C203532(FlowCollector flowCollector) {
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
                                PathfinderViewState pathfinderViewState = (PathfinderViewState) obj;
                                Tuples2 tuples2M3642to = Tuples4.m3642to(pathfinderViewState.getContent(), boxing.boxInt(pathfinderViewState.getRenderedPageSequence()));
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
                };
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(PathfinderFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow2, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: PathfinderFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$4$3", m3645f = "PathfinderFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$4$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Tuples2<? extends PathfinderViewState.Content, ? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PathfinderFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PathfinderFragment pathfinderFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = pathfinderFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends PathfinderViewState.Content, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<? extends PathfinderViewState.Content, Integer>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<? extends PathfinderViewState.Content, Integer> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    PathfinderViewState.Content content = (PathfinderViewState.Content) tuples2.component1();
                    int andSet = this.this$0.savedLatestPageSequence.getAndSet(((Number) tuples2.component2()).intValue());
                    if (andSet == -1 || andSet != this.this$0.savedLatestPageSequence.get()) {
                        this.this$0.onNewContent(content);
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: PathfinderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$5", m3645f = "PathfinderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$5 */
    static final class C203625 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C203625(Continuation<? super C203625> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PathfinderFragment.this.new C203625(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C203625) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<PathfinderViewState> stateFlow = PathfinderFragment.this.getDuxo().getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$5$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new C203542(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$5$invokeSuspend$$inlined$map$1$2 */
                    public static final class C203542<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$5$invokeSuspend$$inlined$map$1$2", m3645f = "PathfinderFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$5$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C203542.this.emit(null, this);
                            }
                        }

                        public C203542(FlowCollector flowCollector) {
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
                                Boolean boolBoxBoolean = boxing.boxBoolean(((PathfinderViewState) obj).isUpdatingInquiry());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
                final PathfinderFragment pathfinderFragment = PathfinderFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment.onViewCreated.5.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        RdsProgressBar loadingProgressBar = pathfinderFragment.getBindings().loadingProgressBar;
                        Intrinsics.checkNotNullExpressionValue(loadingProgressBar, "loadingProgressBar");
                        loadingProgressBar.setVisibility(z ? 0 : 8);
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

    /* compiled from: PathfinderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$6", m3645f = "PathfinderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PIN_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$6 */
    static final class C203636 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C203636(Continuation<? super C203636> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PathfinderFragment.this.new C203636(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C203636) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<PathfinderViewState> stateFlow = PathfinderFragment.this.getDuxo().getStateFlow();
                Flow<UiEvent<Throwable>> flow = new Flow<UiEvent<Throwable>>() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$6$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super UiEvent<Throwable>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$6$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$6$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "PathfinderFragment.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$6$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                UiEvent<Throwable> error = ((PathfinderViewState) obj).getError();
                                if (error != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(error, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
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
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(PathfinderFragment.this);
                this.label = 1;
                if (flow.collect(anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: PathfinderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onViewCreated$6$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ PathfinderFragment $tmp0;

            AnonymousClass2(PathfinderFragment pathfinderFragment) {
                this.$tmp0 = pathfinderFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, PathfinderFragment.class, "onUnhandledInputError", "onUnhandledInputError(Lcom/robinhood/udf/UiEvent;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(UiEvent<Throwable> uiEvent, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$onUnhandledInputError = C203636.invokeSuspend$onUnhandledInputError(this.$tmp0, uiEvent, continuation);
                return objInvokeSuspend$onUnhandledInputError == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$onUnhandledInputError : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((UiEvent<Throwable>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$onUnhandledInputError(PathfinderFragment pathfinderFragment, UiEvent uiEvent, Continuation continuation) {
            pathfinderFragment.onUnhandledInputError(uiEvent);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        boolean z;
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt(SAVED_LATEST_PAGE_SEQUENCE, this.savedLatestPageSequence.get());
        WebLoadingView pathfinderWebLoadingView = getBindings().pathfinderWebLoadingView;
        Intrinsics.checkNotNullExpressionValue(pathfinderWebLoadingView, "pathfinderWebLoadingView");
        boolean z2 = true;
        if (pathfinderWebLoadingView.getVisibility() == 0) {
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        PathfinderWebView pathfinderWebview = getBindings().pathfinderWebview;
        Intrinsics.checkNotNullExpressionValue(pathfinderWebview, "pathfinderWebview");
        boolean z3 = pathfinderWebview.getVisibility() == 0 ? z : false;
        WebErrorView pathfinderWebErrorView = getBindings().pathfinderWebErrorView;
        Intrinsics.checkNotNullExpressionValue(pathfinderWebErrorView, "pathfinderWebErrorView");
        boolean z4 = pathfinderWebErrorView.getVisibility() == 0 ? z : false;
        FrameLayout fragmentContainer = getBindings().fragmentContainer;
        Intrinsics.checkNotNullExpressionValue(fragmentContainer, "fragmentContainer");
        boolean z5 = fragmentContainer.getVisibility() == 0 ? z : false;
        RdsProgressBar loadingProgressBar = getBindings().loadingProgressBar;
        Intrinsics.checkNotNullExpressionValue(loadingProgressBar, "loadingProgressBar");
        outState.putParcelable(SAVED_VISIBILITY_FLAGS, new VisibilityFlags(z2, z3, z4, z5, loadingProgressBar.getVisibility() == 0 ? z : false));
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getWebView().getState()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C203571(getDuxo()));
        Observable<PathfinderWebViewEvent> events = getWebView().getEvents();
        final StateFlow<PathfinderViewState> stateFlow = getDuxo().getStateFlow();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.withLatestFrom(events, asObservable(new Flow<Optional<? extends Integer>>() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment$onStart$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends Integer>> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow.collect(new C203512(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onStart$$inlined$map$1$2 */
            public static final class C203512<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderFragment$onStart$$inlined$map$1$2", m3645f = "PathfinderFragment.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onStart$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C203512.this.emit(null, this);
                    }
                }

                public C203512(FlowCollector flowCollector) {
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
                        Optional<T> optionalM2972of = Optional.INSTANCE.m2972of(((PathfinderViewState) obj).getLatestPageSequence());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionalM2972of, anonymousClass1) == coroutine_suspended) {
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
        }))), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderFragment.onStart$lambda$5(this.f$0, (Tuples2) obj);
            }
        });
        Observable<R> map = getWebView().getEvents().map(new io.reactivex.functions.Function() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment$onStart$$inlined$mapNotNull$1
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                PathfinderWebViewEvent pathfinderWebViewEvent = (PathfinderWebViewEvent) it;
                PathfinderWebViewEvent.LinkEvent.NewWebviewEvent newWebviewEvent = pathfinderWebViewEvent instanceof PathfinderWebViewEvent.LinkEvent.NewWebviewEvent ? (PathfinderWebViewEvent.LinkEvent.NewWebviewEvent) pathfinderWebViewEvent : null;
                return Optional3.asOptional(newWebviewEvent != null ? newWebviewEvent.getMessage() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((PathfinderFragment$onStart$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, com.robinhood.utils.extensions.ObservablesKt.filterIsPresent(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C203585(this));
    }

    /* compiled from: PathfinderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onStart$1 */
    /* synthetic */ class C203571 extends FunctionReferenceImpl implements Function1<PathfinderWebViewState, Unit> {
        C203571(Object obj) {
            super(1, obj, PathfinderDuxo.class, "handleWebViewState", "handleWebViewState(Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PathfinderWebViewState pathfinderWebViewState) {
            invoke2(pathfinderWebViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PathfinderWebViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PathfinderDuxo) this.receiver).handleWebViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(PathfinderFragment pathfinderFragment, Tuples2 tuples2) throws Throwable {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        PathfinderWebViewEvent pathfinderWebViewEvent = (PathfinderWebViewEvent) tuples2.component1();
        Optional<Integer> optional = (Optional) tuples2.component2();
        PathfinderDuxo duxo = pathfinderFragment.getDuxo();
        Intrinsics.checkNotNull(optional);
        duxo.handleWebViewEvent(pathfinderWebViewEvent, optional);
        return Unit.INSTANCE;
    }

    /* compiled from: PathfinderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$onStart$5 */
    /* synthetic */ class C203585 extends FunctionReferenceImpl implements Function1<Message, Unit> {
        C203585(Object obj) {
            super(1, obj, PathfinderFragment.class, "onNewUnprivilegedWebView", "onNewUnprivilegedWebView(Landroid/os/Message;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Message message) {
            invoke2(message);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Message p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PathfinderFragment) this.receiver).onNewUnprivilegedWebView(p0);
        }
    }

    private final void refreshIssue() {
        PathfinderViewState value = getDuxo().getStateFlow().getValue();
        if (value.isUpdatingInquiry()) {
            return;
        }
        getDuxo().refreshInquiry(value.getLatestPageSequence());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNewContent(PathfinderViewState.Content content) {
        Preconditions4.checkOnMainThread(Preconditions.INSTANCE);
        bindWebLoading(content instanceof PathfinderViewState.Content.WebLoading ? (PathfinderViewState.Content.WebLoading) content : null);
        bindWebError(content instanceof PathfinderViewState.Content.WebError ? (PathfinderViewState.Content.WebError) content : null);
        bindPage(content instanceof PathfinderViewState.Content.Page ? (PathfinderViewState.Content.Page) content : null);
    }

    private final void bindWebLoading(PathfinderViewState.Content.WebLoading content) {
        WebLoadingView pathfinderWebLoadingView = getBindings().pathfinderWebLoadingView;
        Intrinsics.checkNotNullExpressionValue(pathfinderWebLoadingView, "pathfinderWebLoadingView");
        pathfinderWebLoadingView.setVisibility(content != null ? 0 : 8);
    }

    private final void bindWebError(PathfinderViewState.Content.WebError content) {
        if (content == null) {
            WebErrorView pathfinderWebErrorView = getBindings().pathfinderWebErrorView;
            Intrinsics.checkNotNullExpressionValue(pathfinderWebErrorView, "pathfinderWebErrorView");
            pathfinderWebErrorView.setVisibility(8);
            return;
        }
        Tuples2 tuples2M3642to = Tuples4.m3642to(content.getError().getError(), content.getError().getErrorViewType());
        final WebError webError = (WebError) tuples2M3642to.component1();
        final WebErrorView.ErrorViewType errorViewType = (WebErrorView.ErrorViewType) tuples2M3642to.component2();
        AnalyticsLoggers.logNativePathfinderError(getAnalytics(), webError.getMessage() + " (error screen shown)");
        try {
            final WebErrorView webErrorView = getBindings().pathfinderWebErrorView;
            webErrorView.setErrorType(errorViewType, new Function0() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PathfinderFragment.bindWebError$lambda$9$lambda$8(errorViewType, webErrorView, webError, this);
                }
            });
            webErrorView.post(new Runnable() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment$bindWebError$1$2
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
    public static final Unit bindWebError$lambda$9$lambda$8(WebErrorView.ErrorViewType errorViewType, WebErrorView webErrorView, WebError webError, PathfinderFragment pathfinderFragment) {
        int i = WhenMappings.$EnumSwitchMapping$0[errorViewType.ordinal()];
        if (i == 1) {
            Context context = webErrorView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer statusCode = webError.getStatusCode();
            EmailUtils2.sendSupportEmailIfSupported$default(context, null, null, statusCode != null ? CollectionsKt.listOf(String.valueOf(statusCode.intValue())) : null, null, 11, null);
            pathfinderFragment.requireActivity().finish();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pathfinderFragment.refreshIssue();
        }
        return Unit.INSTANCE;
    }

    private final void bindPage(PathfinderViewState.Content.Page content) {
        if (content instanceof PathfinderViewState.Content.Page.Native) {
            FrameLayout fragmentContainer = getBindings().fragmentContainer;
            Intrinsics.checkNotNullExpressionValue(fragmentContainer, "fragmentContainer");
            fragmentContainer.setVisibility(0);
            getWebView().setVisibility(8);
            pushNewFragmentIfContextDifferent((PathfinderViewState.Content.Page.Native) content);
            return;
        }
        if (content instanceof PathfinderViewState.Content.Page.Web) {
            getWebView().renderUserView(((PathfinderFragmentKey) INSTANCE.getArgs((Fragment) this)).getInquiryId(), ((PathfinderViewState.Content.Page.Web) content).getRawUserView(), new ValueCallback() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment.bindPage.1

                /* compiled from: PathfinderFragment.kt */
                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.lib.pathfinder.PathfinderFragment$bindPage$1$1", m3645f = "PathfinderFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.lib.pathfinder.PathfinderFragment$bindPage$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;
                    final /* synthetic */ PathfinderFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(PathfinderFragment pathfinderFragment, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = pathfinderFragment;
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
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.this$0.getWebView().setVisibility(0);
                            FrameLayout fragmentContainer = this.this$0.getBindings().fragmentContainer;
                            Intrinsics.checkNotNullExpressionValue(fragmentContainer, "fragmentContainer");
                            fragmentContainer.setVisibility(8);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(String str) {
                    PathfinderFragment.this.getLifecycleScope().launchWhenStarted(new AnonymousClass1(PathfinderFragment.this, null));
                }
            });
        } else {
            if (content != null) {
                throw new NoWhenBranchMatchedException();
            }
            FrameLayout fragmentContainer2 = getBindings().fragmentContainer;
            Intrinsics.checkNotNullExpressionValue(fragmentContainer2, "fragmentContainer");
            fragmentContainer2.setVisibility(8);
            getWebView().setVisibility(8);
        }
    }

    @Override // com.robinhood.android.lib.pathfinder.PathfinderFragmentCallbacks
    public void dismissFlow() {
        getDuxo().dismissFlow();
    }

    @Override // com.robinhood.android.lib.pathfinder.PathfinderFragmentCallbacks
    public UUID getInquiryId() {
        return ((PathfinderFragmentKey) INSTANCE.getArgs((Fragment) this)).getInquiryId();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        WebView newWindowWebView = getNewWindowWebView();
        if (newWindowWebView != null) {
            if (newWindowWebView.canGoBack()) {
                newWindowWebView.goBack();
            } else {
                onCloseUnprivilegedWebView();
            }
        }
        getDuxo().navigateBackward();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMailTo(Uri uri) {
        startActivity(new Intent("android.intent.action.SENDTO", uri));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShowFileChooser(WebChromeClient.FileChooserParams fileChooserParams, ValueCallback<Uri[]> filePathCallback) {
        this.filePathCallback = filePathCallback;
        int mode = fileChooserParams.getMode();
        if (mode == 0) {
            this.uploadSingleDocument.launch(fileChooserParams.getAcceptTypes());
            return;
        }
        if (mode == 1) {
            this.uploadMultipleDocuments.launch(fileChooserParams.getAcceptTypes());
            return;
        }
        throw new UnsupportedOperationException("FileChooserParam mode " + mode + " is unsupported.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExitAppLinkReceived(Uri url, boolean shouldManuallyDismiss) {
        Companion companion = INSTANCE;
        PathfinderFragmentKey2 setResultMode = ((PathfinderFragmentKey) companion.getArgs((Fragment) this)).getSetResultMode();
        if ((setResultMode instanceof PathfinderFragmentKey2.Sassy) && !((PathfinderFragmentKey2.Sassy) setResultMode).getSupportsExitAppLink()) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Received exit AppLink for a Pathfinder flow that doesn't support it. Inquiry: " + ((PathfinderFragmentKey) companion.getArgs((Fragment) this)).getInquiryId()), false, null, 6, null);
        }
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, url, null, null, false, null, 60, null);
        if (shouldManuallyDismiss) {
            dismissFlow();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNewInquiryReceived(UUID inquiryId) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new PathfinderFragmentKey(inquiryId, null, 2, null), false, false, false, requireBaseActivity().getShouldPromptForLockScreen(), null, false, null, null, 988, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResultReceived(UserViewStateResultContext result) {
        if (result instanceof UserViewStateResultContext.Unknown) {
            dismissFlow();
            return;
        }
        Companion companion = INSTANCE;
        if (!(((PathfinderFragmentKey) companion.getArgs((Fragment) this)).getSetResultMode() instanceof PathfinderFragmentKey2.Sassy)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Received VerificationWorkflowResult for a Pathfinder flow that doesn't expect to receive such result. SetResultMode: " + ((PathfinderFragmentKey) companion.getArgs((Fragment) this)).getSetResultMode() + ", Inquiry: " + ((PathfinderFragmentKey) companion.getArgs((Fragment) this)).getInquiryId()), false, null, 6, null);
            dismissFlow();
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        VerificationWorkflowActivity verificationWorkflowActivity = fragmentActivityRequireActivity instanceof VerificationWorkflowActivity ? (VerificationWorkflowActivity) fragmentActivityRequireActivity : null;
        if (verificationWorkflowActivity != null) {
            verificationWorkflowActivity.logVerificationWorkflowResult(result);
        }
        Intent intentPutExtra = new Intent().putExtra("pathfinder_result", result);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        requireActivity().setResult(-1, intentPutExtra);
        dismissFlow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUnhandledInputError(UiEvent<Throwable> event) {
        event.consumeWith(new Function1() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PathfinderFragment.onUnhandledInputError$lambda$11(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUnhandledInputError$lambda$11(final PathfinderFragment pathfinderFragment, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = pathfinderFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setTitle(C11048R.string.error_title, new Object[0]).setMessage(C11048R.string.error_description, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]);
        FragmentManager childFragmentManager = pathfinderFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "npf-error", false, 4, null);
        pathfinderFragment.getChildFragmentManager().setFragmentResultListener(RhDialogFragment.REQUEST_KEY, pathfinderFragment, new FragmentResultListener() { // from class: com.robinhood.android.lib.pathfinder.PathfinderFragment$onUnhandledInputError$1$1
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                this.this$0.getChildFragmentManager().clearFragmentResultListener(RhDialogFragment.REQUEST_KEY);
                String string2 = bundle.getString(RhDialogFragment.RESULT_KEY_TYPE);
                if (string2 != null && string2.hashCode() == 888043087 && string2.equals(RhDialogFragment.RESULT_POSITIVE)) {
                    this.this$0.dismissFlow();
                }
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNewUnprivilegedWebView(Message message) {
        WebView newWindowWebView = getNewWindowWebView();
        if (newWindowWebView != null) {
            getBindings().newWebviewContainer.removeView(newWindowWebView);
        }
        FrameLayout newWebviewContainer = getBindings().newWebviewContainer;
        Intrinsics.checkNotNullExpressionValue(newWebviewContainer, "newWebviewContainer");
        newWebviewContainer.setVisibility(0);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        PathfinderUnprivlegedWebView pathfinderUnprivlegedWebView = new PathfinderUnprivlegedWebView(contextRequireContext, null, 0, new WebViewUrlHandler(AnalyticsStrings.NATIVE_PATHFINDER_WEB, this.unprivlegedWebCallbacks, getAnalytics(), getEventLogger()), 6, null);
        getBindings().newWebviewContainer.addView(pathfinderUnprivlegedWebView, -1, -1);
        Object obj = message.obj;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
        ((WebView.WebViewTransport) obj).setWebView(pathfinderUnprivlegedWebView);
        message.sendToTarget();
    }

    private final void onCloseUnprivilegedWebView() {
        WebView newWindowWebView = getNewWindowWebView();
        if (newWindowWebView != null) {
            getBindings().newWebviewContainer.removeView(newWindowWebView);
        }
        FrameLayout newWebviewContainer = getBindings().newWebviewContainer;
        Intrinsics.checkNotNullExpressionValue(newWebviewContainer, "newWebviewContainer");
        newWebviewContainer.setVisibility(8);
    }

    @SuppressLint({"CommitTransaction"})
    private final void pushNewFragmentIfContextDifferent(PathfinderViewState.Content.Page.Native render) {
        boolean zAreEqual;
        FragmentKey fragmentKey = render.getFragmentKey();
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(PATHFINDER_PAGE_FRAGMENT_TAG);
        if (fragmentFindFragmentByTag != null) {
            Bundle arguments = fragmentFindFragmentByTag.getArguments();
            zAreEqual = Intrinsics.areEqual(fragmentKey, arguments != null ? (FragmentKey) arguments.getParcelable("rh_navigation_args") : null);
        } else {
            zAreEqual = false;
        }
        if (zAreEqual) {
            return;
        }
        Fragment fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(getNavigator(), fragmentKey, null, 2, null);
        if (isRemoving() || getChildFragmentManager().isStateSaved()) {
            return;
        }
        FragmentTransaction fragmentTransactionReplace = getChildFragmentManager().beginTransaction().setCustomAnimations(C22231R.anim.frag_enter_right, C22231R.anim.frag_exit_left, C22231R.anim.frag_enter_left, C22231R.anim.frag_exit_right).replace(C20366R.id.fragment_container, fragmentCreateFragment$default, PATHFINDER_PAGE_FRAGMENT_TAG);
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "replace(...)");
        fragmentTransactionReplace.commitAllowingStateLoss();
    }

    /* compiled from: PathfinderFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J;\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\n¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderFragment$VisibilityFlags;", "Landroid/os/Parcelable;", "isWebLoadingVisible", "", "isWebViewVisible", "isWebErrorViewVisible", "isFragmentContainerVisible", "isInquiryUpdateLoadingVisible", "<init>", "(ZZZZZ)V", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class VisibilityFlags implements Parcelable {
        public static final Parcelable.Creator<VisibilityFlags> CREATOR = new Creator();
        private final boolean isFragmentContainerVisible;
        private final boolean isInquiryUpdateLoadingVisible;
        private final boolean isWebErrorViewVisible;
        private final boolean isWebLoadingVisible;
        private final boolean isWebViewVisible;

        /* compiled from: PathfinderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<VisibilityFlags> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VisibilityFlags createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z5 = false;
                boolean z6 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z5 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z6 = z;
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
                if (parcel.readInt() == 0) {
                    z4 = z;
                }
                return new VisibilityFlags(z5, z6, z2, z3, z4);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VisibilityFlags[] newArray(int i) {
                return new VisibilityFlags[i];
            }
        }

        public static /* synthetic */ VisibilityFlags copy$default(VisibilityFlags visibilityFlags, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
            if ((i & 1) != 0) {
                z = visibilityFlags.isWebLoadingVisible;
            }
            if ((i & 2) != 0) {
                z2 = visibilityFlags.isWebViewVisible;
            }
            if ((i & 4) != 0) {
                z3 = visibilityFlags.isWebErrorViewVisible;
            }
            if ((i & 8) != 0) {
                z4 = visibilityFlags.isFragmentContainerVisible;
            }
            if ((i & 16) != 0) {
                z5 = visibilityFlags.isInquiryUpdateLoadingVisible;
            }
            boolean z6 = z5;
            boolean z7 = z3;
            return visibilityFlags.copy(z, z2, z7, z4, z6);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsWebLoadingVisible() {
            return this.isWebLoadingVisible;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsWebViewVisible() {
            return this.isWebViewVisible;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsWebErrorViewVisible() {
            return this.isWebErrorViewVisible;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsFragmentContainerVisible() {
            return this.isFragmentContainerVisible;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsInquiryUpdateLoadingVisible() {
            return this.isInquiryUpdateLoadingVisible;
        }

        public final VisibilityFlags copy(boolean isWebLoadingVisible, boolean isWebViewVisible, boolean isWebErrorViewVisible, boolean isFragmentContainerVisible, boolean isInquiryUpdateLoadingVisible) {
            return new VisibilityFlags(isWebLoadingVisible, isWebViewVisible, isWebErrorViewVisible, isFragmentContainerVisible, isInquiryUpdateLoadingVisible);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VisibilityFlags)) {
                return false;
            }
            VisibilityFlags visibilityFlags = (VisibilityFlags) other;
            return this.isWebLoadingVisible == visibilityFlags.isWebLoadingVisible && this.isWebViewVisible == visibilityFlags.isWebViewVisible && this.isWebErrorViewVisible == visibilityFlags.isWebErrorViewVisible && this.isFragmentContainerVisible == visibilityFlags.isFragmentContainerVisible && this.isInquiryUpdateLoadingVisible == visibilityFlags.isInquiryUpdateLoadingVisible;
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isWebLoadingVisible) * 31) + Boolean.hashCode(this.isWebViewVisible)) * 31) + Boolean.hashCode(this.isWebErrorViewVisible)) * 31) + Boolean.hashCode(this.isFragmentContainerVisible)) * 31) + Boolean.hashCode(this.isInquiryUpdateLoadingVisible);
        }

        public String toString() {
            return "VisibilityFlags(isWebLoadingVisible=" + this.isWebLoadingVisible + ", isWebViewVisible=" + this.isWebViewVisible + ", isWebErrorViewVisible=" + this.isWebErrorViewVisible + ", isFragmentContainerVisible=" + this.isFragmentContainerVisible + ", isInquiryUpdateLoadingVisible=" + this.isInquiryUpdateLoadingVisible + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isWebLoadingVisible ? 1 : 0);
            dest.writeInt(this.isWebViewVisible ? 1 : 0);
            dest.writeInt(this.isWebErrorViewVisible ? 1 : 0);
            dest.writeInt(this.isFragmentContainerVisible ? 1 : 0);
            dest.writeInt(this.isInquiryUpdateLoadingVisible ? 1 : 0);
        }

        public VisibilityFlags(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.isWebLoadingVisible = z;
            this.isWebViewVisible = z2;
            this.isWebErrorViewVisible = z3;
            this.isFragmentContainerVisible = z4;
            this.isInquiryUpdateLoadingVisible = z5;
        }

        public final boolean isWebLoadingVisible() {
            return this.isWebLoadingVisible;
        }

        public final boolean isWebViewVisible() {
            return this.isWebViewVisible;
        }

        public final boolean isWebErrorViewVisible() {
            return this.isWebErrorViewVisible;
        }

        public final boolean isFragmentContainerVisible() {
            return this.isFragmentContainerVisible;
        }

        public final boolean isInquiryUpdateLoadingVisible() {
            return this.isInquiryUpdateLoadingVisible;
        }
    }

    /* compiled from: PathfinderFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/lib/pathfinder/PathfinderFragment;", "Lcom/robinhood/shared/support/contracts/PathfinderFragmentKey;", "Lcom/robinhood/android/navigation/FragmentResolver;", "<init>", "()V", "SAVED_LATEST_PAGE_SEQUENCE", "", "SAVED_VISIBILITY_FLAGS", "PATHFINDER_PAGE_FRAGMENT_TAG", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PathfinderFragment, PathfinderFragmentKey>, FragmentResolver<PathfinderFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public PathfinderFragmentKey getArgs(PathfinderFragment pathfinderFragment) {
            return (PathfinderFragmentKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, pathfinderFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PathfinderFragment newInstance(PathfinderFragmentKey pathfinderFragmentKey) {
            return (PathfinderFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, pathfinderFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PathfinderFragment pathfinderFragment, PathfinderFragmentKey pathfinderFragmentKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, pathfinderFragment, pathfinderFragmentKey);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(PathfinderFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return PathfinderFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
