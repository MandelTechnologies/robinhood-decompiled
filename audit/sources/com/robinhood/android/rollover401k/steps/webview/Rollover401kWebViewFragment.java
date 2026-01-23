package com.robinhood.android.rollover401k.steps.webview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.models.retirement.api.RetirementOnboardingEntryPoint;
import com.robinhood.android.models.retirement.api.onboarding.RetirementOnboardingIntro;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.contracts.RetirementIntentKeys7;
import com.robinhood.android.retirement.contracts.RetirementSignUp;
import com.robinhood.android.rollover401k.C27696R;
import com.robinhood.android.rollover401k.databinding.Fragment401kRolloverWebviewBinding;
import com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: Rollover401kWebViewFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002@AB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0017J\u0010\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020\u0014H\u0016J\u0010\u00101\u001a\u00020*2\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020*H\u0016J\b\u00105\u001a\u00020*H\u0016J\b\u00106\u001a\u00020\u001dH\u0016J\u0010\u00107\u001a\u00020*2\u0006\u00108\u001a\u000209H\u0002J\t\u0010:\u001a\u00020\u001dH\u0096\u0001R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001dX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R(\u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020' (*\n\u0012\u0004\u0012\u00020'\u0018\u00010&0&0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/webview/Rollover401kWebViewFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/rollover401k/steps/webview/CapitalizeWebViewCallbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/rollover401k/steps/webview/Rollover401kWebViewDuxo;", "getDuxo", "()Lcom/robinhood/android/rollover401k/steps/webview/Rollover401kWebViewDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "viewBinding", "Lcom/robinhood/android/rollover401k/databinding/Fragment401kRolloverWebviewBinding;", "getViewBinding", "()Lcom/robinhood/android/rollover401k/databinding/Fragment401kRolloverWebviewBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "<set-?>", "", "currentTransactionId", "getCurrentTransactionId", "()Ljava/lang/String;", "setCurrentTransactionId", "(Ljava/lang/String;)V", "currentTransactionId$delegate", "Lkotlin/properties/ReadWriteProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "retirementSignUpLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/retirement/contracts/RetirementSignUp;", "kotlin.jvm.PlatformType", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setTransactionId", "transactionId", "openIra", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onExit", "onFinderComplete", "onBackPressed", "consumeEvent", "event", "Lcom/robinhood/android/rollover401k/steps/webview/Rollover401kWebViewEvent;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class Rollover401kWebViewFragment extends BaseFragment implements CapitalizeJavaScriptInterface2, RegionGated, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: currentTransactionId$delegate, reason: from kotlin metadata */
    private final Interfaces3 currentTransactionId;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<RetirementSignUp>> retirementSignUpLauncher;
    private final boolean toolbarVisible;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Rollover401kWebViewFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/rollover401k/databinding/Fragment401kRolloverWebviewBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Rollover401kWebViewFragment.class, "currentTransactionId", "getCurrentTransactionId()Ljava/lang/String;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
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

    public Rollover401kWebViewFragment() {
        super(C27696R.layout.fragment_401k_rollover_webview);
        this.$$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, Rollover401kWebViewDuxo.class);
        this.viewBinding = ViewBinding5.viewBinding(this, Rollover401kWebViewFragment4.INSTANCE);
        this.currentTransactionId = BindSavedState2.savedString(this).provideDelegate(this, $$delegatedProperties[1]);
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<RetirementSignUp>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new RetirementIntentKeys7(new Function0() { // from class: com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewFragment$retirementSignUpLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(RetirementIntentKeys7.Result result) {
                if (result instanceof RetirementIntentKeys7.Result.Success) {
                    Rollover401kWebViewDuxo duxo = this.this$0.getDuxo();
                    String currentTransactionId = this.this$0.getCurrentTransactionId();
                    Intrinsics.checkNotNull(currentTransactionId);
                    duxo.updateTransaction(currentTransactionId);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.retirementSignUpLauncher = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rollover401kWebViewDuxo getDuxo() {
        return (Rollover401kWebViewDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Fragment401kRolloverWebviewBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Fragment401kRolloverWebviewBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getCurrentTransactionId() {
        return (String) this.currentTransactionId.getValue(this, $$delegatedProperties[1]);
    }

    private final void setCurrentTransactionId(String str) {
        this.currentTransactionId.setValue(this, $$delegatedProperties[1], str);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.RETIREMENT_401K_ROLLOVER_CAPITALIZE_EMBED, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewCompat.setOnApplyWindowInsetsListener(getViewBinding().getRoot(), new OnApplyWindowInsetsListener() { // from class: com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewFragment.onViewCreated.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat insets) {
                Intrinsics.checkNotNullParameter(view2, "<unused var>");
                Intrinsics.checkNotNullParameter(insets, "insets");
                Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
                FrameLayout root = Rollover401kWebViewFragment.this.getViewBinding().getRoot();
                root.setPaddingRelative(root.getPaddingStart(), insets2.top, root.getPaddingEnd(), insets2.bottom);
                return insets;
            }
        });
        BaseFragment.collectDuxoState$default(this, null, new C277892(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C277903(null), 1, null);
        WebView webView = getViewBinding().webview;
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient() { // from class: com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewFragment$onViewCreated$4$1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view2, WebResourceRequest request) {
                Uri url = request != null ? request.getUrl() : null;
                Rollover401kWebViewViewState value = this.this$0.getDuxo().getStateFlow().getValue();
                String host = url != null ? url.getHost() : null;
                if (CollectionsKt.contains(value.getHostsToOpenExternally(), host)) {
                    this.this$0.startActivity(new Intent("android.intent.action.VIEW", url));
                    return true;
                }
                if (CollectionsKt.contains(value.getAllowedUrls(), host)) {
                    return false;
                }
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Rollover401kWebViewFragment: Disallowed host: " + (url != null ? url.getHost() : null)), false, null, 6, null);
                this.this$0.requireActivity().finish();
                return true;
            }
        });
        webView.addJavascriptInterface(new CapitalizeJavaScriptInterface(this), "android");
        WebSettings settings = webView.getSettings();
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptEnabled(true);
        webView.setScrollBarStyle(0);
        webView.loadUrl(((Args) INSTANCE.getArgs((Fragment) this)).getUrl());
    }

    /* compiled from: Rollover401kWebViewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewFragment$onViewCreated$2", m3645f = "Rollover401kWebViewFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewFragment$onViewCreated$2 */
    static final class C277892 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C277892(Continuation<? super C277892> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Rollover401kWebViewFragment.this.new C277892(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C277892) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<Rollover401kWebViewEvent>> eventFlow = Rollover401kWebViewFragment.this.getDuxo().getEventFlow();
                final Rollover401kWebViewFragment rollover401kWebViewFragment = Rollover401kWebViewFragment.this;
                FlowCollector<? super Event<Rollover401kWebViewEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewFragment.onViewCreated.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<Rollover401kWebViewEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<Rollover401kWebViewEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<Rollover401kWebViewEvent> eventConsumerInvoke;
                        if (event != null) {
                            final Rollover401kWebViewFragment rollover401kWebViewFragment2 = rollover401kWebViewFragment;
                            if ((event.getData() instanceof Rollover401kWebViewEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewFragment$onViewCreated$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                        m18464invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m18464invoke(Object it) throws Throwable {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        rollover401kWebViewFragment2.consumeEvent((Rollover401kWebViewEvent) event.getData());
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: Rollover401kWebViewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewFragment$onViewCreated$3", m3645f = "Rollover401kWebViewFragment.kt", m3646l = {78}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewFragment$onViewCreated$3 */
    static final class C277903 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C277903(Continuation<? super C277903> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Rollover401kWebViewFragment.this.new C277903(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C277903) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Rollover401kWebViewViewState> stateFlow = Rollover401kWebViewFragment.this.getDuxo().getStateFlow();
                final Rollover401kWebViewFragment rollover401kWebViewFragment = Rollover401kWebViewFragment.this;
                FlowCollector<? super Rollover401kWebViewViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewFragment.onViewCreated.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Rollover401kWebViewViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Rollover401kWebViewViewState rollover401kWebViewViewState, Continuation<? super Unit> continuation) {
                        ShimmerLoadingView loadingView = rollover401kWebViewFragment.getViewBinding().loadingView;
                        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
                        loadingView.setVisibility(rollover401kWebViewViewState.isLoading() ? 0 : 8);
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

    @Override // com.robinhood.android.rollover401k.steps.webview.CapitalizeJavaScriptInterface2
    public void setTransactionId(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        setCurrentTransactionId(transactionId);
    }

    @Override // com.robinhood.android.rollover401k.steps.webview.CapitalizeJavaScriptInterface2
    public void openIra(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        NavigationActivityResultContract3.launch$default(this.retirementSignUpLauncher, new RetirementSignUp(new RetirementOnboardingIntro.AccountDescription(brokerageAccountType), null, false, RetirementOnboardingEntryPoint.CAPITALIZE_ROLLOVER.getServerValue(), false, null, null, 118, null), null, false, 6, null);
    }

    @Override // com.robinhood.android.rollover401k.steps.webview.CapitalizeJavaScriptInterface2
    public void onExit() {
        requireActivity().finish();
    }

    @Override // com.robinhood.android.rollover401k.steps.webview.CapitalizeJavaScriptInterface2
    public void onFinderComplete() {
        getDuxo().checkForFinderResults();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void consumeEvent(Rollover401kWebViewEvent event) throws Throwable {
        if (event instanceof Rollover401kWebViewEvent.NetworkError) {
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, ((Rollover401kWebViewEvent.NetworkError) event).getThrowable(), false, false, 0, null, 60, null);
            return;
        }
        if (!(event instanceof Rollover401kWebViewEvent.NavigationEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((Rollover401kWebViewEvent.NavigationEvent) event).getDeeplink()), null, null, false, null, 60, null);
    }

    /* compiled from: Rollover401kWebViewFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/webview/Rollover401kWebViewFragment$Args;", "Landroid/os/Parcelable;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String url;

        /* compiled from: Rollover401kWebViewFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.url;
            }
            return args.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Args copy(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new Args(url);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.url, ((Args) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "Args(url=" + this.url + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.url);
        }

        public Args(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    /* compiled from: Rollover401kWebViewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/webview/Rollover401kWebViewFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rollover401k/steps/webview/Rollover401kWebViewFragment;", "Lcom/robinhood/android/rollover401k/steps/webview/Rollover401kWebViewFragment$Args;", "<init>", "()V", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<Rollover401kWebViewFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(Rollover401kWebViewFragment rollover401kWebViewFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rollover401kWebViewFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public Rollover401kWebViewFragment newInstance(Args args) {
            return (Rollover401kWebViewFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(Rollover401kWebViewFragment rollover401kWebViewFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rollover401kWebViewFragment, args);
        }
    }
}
