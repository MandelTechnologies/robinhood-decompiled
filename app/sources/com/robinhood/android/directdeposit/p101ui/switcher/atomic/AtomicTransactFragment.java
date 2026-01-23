package com.robinhood.android.directdeposit.p101ui.switcher.atomic;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.directdeposit.DirectDepositSource;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.directdeposit.p101ui.switcher.atomic.AtomicTransactDuxo2;
import com.robinhood.android.directdeposit.p101ui.switcher.atomic.AtomicTransactFragment;
import com.robinhood.android.directdeposit.p101ui.switcher.atomic.TransactEvent;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AtomicTransactFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 22\u00020\u0001:\u000212B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\"H\u0016J\u0010\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*H\u0002J\u001a\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010/\u001a\u00020\"H\u0016J\b\u00100\u001a\u00020\u001dH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001dX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "webView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "loadingView", "Lcom/robinhood/android/common/ui/ShimmerLoadingView;", "getLoadingView", "()Lcom/robinhood/android/common/ui/ShimmerLoadingView;", "loadingView$delegate", "callbacks", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactFragment$Callbacks;", "callbacks$delegate", "duxo", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactDuxo;", "getDuxo", "()Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "transactScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "canGoBackInTransact", "", "toolbarVisible", "getToolbarVisible", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bind", "state", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactViewState;", "onTransactEvent", "event", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/TransactEvent;", "currentScreen", "onDestroyView", "onBackPressed", "Callbacks", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class AtomicTransactFragment extends BaseFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private boolean canGoBackInTransact;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: loadingView$delegate, reason: from kotlin metadata */
    private final Interfaces2 loadingView;
    private final boolean toolbarVisible;
    private Screen transactScreen;

    /* renamed from: webView$delegate, reason: from kotlin metadata */
    private final Interfaces2 webView;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AtomicTransactFragment.class, "webView", "getWebView()Landroid/webkit/WebView;", 0)), Reflection.property1(new PropertyReference1Impl(AtomicTransactFragment.class, "loadingView", "getLoadingView()Lcom/robinhood/android/common/ui/ShimmerLoadingView;", 0)), Reflection.property1(new PropertyReference1Impl(AtomicTransactFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AtomicTransactFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactFragment$Callbacks;", "", "onCloseAtomicTransact", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "onCompleteAtomicTransact", "directDepositSource", "Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", "onAtomicInitializationError", "throwable", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAtomicInitializationError(Throwable throwable);

        void onCloseAtomicTransact(Screen screen);

        void onCompleteAtomicTransact(DirectDepositSource directDepositSource);
    }

    public AtomicTransactFragment() {
        super(C14044R.layout.fragment_atomic_transact);
        this.webView = bindView(C14044R.id.atomic_web_view);
        this.loadingView = bindView(C14044R.id.atomic_loading_view);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AtomicTransactFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, AtomicTransactDuxo.class);
    }

    private final WebView getWebView() {
        return (WebView) this.webView.getValue(this, $$delegatedProperties[0]);
    }

    private final ShimmerLoadingView getLoadingView() {
        return (ShimmerLoadingView) this.loadingView.getValue(this, $$delegatedProperties[1]);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AtomicTransactDuxo getDuxo() {
        return (AtomicTransactDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        WebView webView = getWebView();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setAllowFileAccess(false);
        webView.setWebViewClient(new WebViewClient() { // from class: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactFragment$onViewCreated$1$1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view2, String url) {
                this.this$0.getDuxo().setPageLoaded();
            }
        });
        webView.addJavascriptInterface(getDuxo().getTransactJavascriptBridge(), AtomicTransactJavascriptBridge.JS_INTERFACE);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnFastPath(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C141491(this));
    }

    /* compiled from: AtomicTransactFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directdeposit.ui.switcher.atomic.AtomicTransactFragment$onStart$1 */
    /* synthetic */ class C141491 extends FunctionReferenceImpl implements Function1<AtomicTransactDuxo2, Unit> {
        C141491(Object obj) {
            super(1, obj, AtomicTransactFragment.class, "bind", "bind(Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomicTransactDuxo2 atomicTransactDuxo2) {
            invoke2(atomicTransactDuxo2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomicTransactDuxo2 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AtomicTransactFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(AtomicTransactDuxo2 state) {
        TransactEvent transactEventConsume;
        this.canGoBackInTransact = state.getCanGoBack();
        if (!(state instanceof AtomicTransactDuxo2.Loading)) {
            if (!(state instanceof AtomicTransactDuxo2.Loaded)) {
                throw new NoWhenBranchMatchedException();
            }
            getLoadingView().setVisibility(8);
            AtomicTransactDuxo2.Loaded loaded = (AtomicTransactDuxo2.Loaded) state;
            this.transactScreen = loaded.getCurrentScreen();
            UiEvent<TransactEvent> transactEvent = loaded.getTransactEvent();
            if (transactEvent == null || (transactEventConsume = transactEvent.consume()) == null) {
                return;
            }
            onTransactEvent(transactEventConsume, loaded.getCurrentScreen());
            return;
        }
        getLoadingView().setVisibility(0);
        UiEvent<Either<Throwable, String>> transactUrlResult = ((AtomicTransactDuxo2.Loading) state).getTransactUrlResult();
        Either<Throwable, String> eitherConsume = transactUrlResult != null ? transactUrlResult.consume() : null;
        if (eitherConsume instanceof Either.Right) {
            getWebView().loadUrl((String) ((Either.Right) eitherConsume).getValue());
        } else if (eitherConsume instanceof Either.Left) {
            getCallbacks().onAtomicInitializationError((Throwable) ((Either.Left) eitherConsume).getValue());
        } else if (eitherConsume != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void onTransactEvent(TransactEvent event, Screen currentScreen) {
        if (event instanceof TransactEvent.Close) {
            getCallbacks().onCloseAtomicTransact(currentScreen);
            return;
        }
        if (event instanceof TransactEvent.Finish) {
            getCallbacks().onCompleteAtomicTransact(DirectDepositSource.SWITCHER);
        } else if (event instanceof TransactEvent.OpenUrl) {
            WebUtils.viewUrl$default(requireContext(), ((TransactEvent.OpenUrl) event).getPayload().getUrl(), 0, 4, (Object) null);
        } else if (!(event instanceof TransactEvent.Interaction) && !(event instanceof TransactEvent.AutomationHandoff)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getWebView().removeJavascriptInterface(AtomicTransactJavascriptBridge.JS_INTERFACE);
        super.onDestroyView();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (this.canGoBackInTransact) {
            getWebView().goBack();
            return true;
        }
        Screen screen = this.transactScreen;
        if (screen != null) {
            getCallbacks().onCloseAtomicTransact(screen);
            return true;
        }
        return super.onBackPressed();
    }

    /* compiled from: AtomicTransactFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/directdeposit/ui/switcher/atomic/AtomicTransactFragment;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AtomicTransactFragment newInstance() {
            return new AtomicTransactFragment();
        }
    }
}
