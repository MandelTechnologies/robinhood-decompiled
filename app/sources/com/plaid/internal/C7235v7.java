package com.plaid.internal;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;
import androidx.core.graphics.Insets;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.ViewModel2;
import androidx.lifecycle.ViewModelProvider;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$GetMultipleContents;
import androidx.view.result.contract.ActivityResultContracts$RequestPermission;
import com.plaid.internal.C5953R5;
import com.plaid.internal.C7235v7;
import com.plaid.link.C7279R;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/plaid/internal/v7;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.plaid.internal.v7 */
/* loaded from: classes16.dex */
public final class C7235v7 extends Fragment {

    /* renamed from: l */
    public static final /* synthetic */ int f3248l = 0;

    /* renamed from: a */
    public C5945Q5 f3249a;

    /* renamed from: b */
    public C5927O5 f3250b;

    /* renamed from: c */
    public C5800A7 f3251c;

    /* renamed from: d */
    public C7227v f3252d;

    /* renamed from: e */
    public final Lazy f3253e = LazyKt.lazy(new a());

    /* renamed from: f */
    public Lambda f3254f = f.f3269a;

    /* renamed from: g */
    public Function0<Unit> f3255g = e.f3268a;

    /* renamed from: h */
    public final ActivityResultLauncher<String> f3256h;

    /* renamed from: i */
    public final ActivityResultLauncher<String> f3257i;

    /* renamed from: j */
    public ActivityResultLauncher<Unit> f3258j;

    /* renamed from: k */
    public final g f3259k;

    /* renamed from: com.plaid.internal.v7$a */
    public static final class a extends Lambda implements Function0<C6044b5> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C6044b5 invoke() {
            C5800A7 c5800a7 = C7235v7.this.f3251c;
            if (c5800a7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                c5800a7 = null;
            }
            C6044b5 c6044b5 = c5800a7.f1239d;
            if (c6044b5 != null) {
                return c6044b5;
            }
            Intrinsics.throwUninitializedPropertyAccessException("internalPictureStorage");
            return null;
        }
    }

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.WebviewFragment$onCreateView$2", m3645f = "WebviewFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.v7$b */
    public static final class b extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f3261a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C7235v7.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return C7235v7.this.new b(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3261a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C5927O5 c5927o5 = C7235v7.this.f3250b;
                if (c5927o5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webView");
                    c5927o5 = null;
                }
                this.f3261a = 1;
                Object objCollect = c5927o5.f1592b.f2756d.collect(new C5879J5(new C5909M5(c5927o5)), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect == coroutine_suspended) {
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

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.WebviewFragment$onCreateView$4", m3645f = "WebviewFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.v7$c */
    public static final class c extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f3263a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C7235v7.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return C7235v7.this.new c(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3263a;
            C5945Q5 c5945q5 = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C5800A7 c5800a7 = C7235v7.this.f3251c;
                if (c5800a7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    c5800a7 = null;
                }
                this.f3263a = 1;
                InterfaceC7180p6 interfaceC7180p6 = c5800a7.f1241f;
                if (interfaceC7180p6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("readWebviewBackgroundTransparencyState");
                    interfaceC7180p6 = null;
                }
                obj = interfaceC7180p6.mo1548a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                C5945Q5 c5945q52 = C7235v7.this.f3249a;
                if (c5945q52 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c5945q52 = null;
                }
                c5945q52.f1655a.setBackground(ContextCompat.getDrawable(C7235v7.this.requireContext(), C7279R.drawable.plaid_transparent_webview_animation));
                C5945Q5 c5945q53 = C7235v7.this.f3249a;
                if (c5945q53 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    c5945q5 = c5945q53;
                }
                Drawable background = c5945q5.f1655a.getBackground();
                Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                AnimationDrawable animationDrawable = (AnimationDrawable) background;
                animationDrawable.setOneShot(true);
                animationDrawable.start();
            } else {
                C5945Q5 c5945q54 = C7235v7.this.f3249a;
                if (c5945q54 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    c5945q5 = c5945q54;
                }
                c5945q5.f1655a.setBackgroundColor(-1);
                FragmentActivity activity = C7235v7.this.getActivity();
                if (activity != null) {
                    C5972T6.m1320a(activity);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.WebviewFragment$onCreateView$5", m3645f = "WebviewFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.v7$d */
    public static final class d extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f3265a;

        /* renamed from: com.plaid.internal.v7$d$a */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a */
            public final /* synthetic */ C7235v7 f3267a;

            public a(C7235v7 c7235v7) {
                this.f3267a = c7235v7;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                String str = (String) obj;
                C5927O5 c5927o5 = this.f3267a.f3250b;
                C5927O5 c5927o52 = null;
                if (c5927o5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webView");
                    c5927o5 = null;
                }
                if (!c5927o5.f1595e.get()) {
                    C5800A7 c5800a7 = this.f3267a.f3251c;
                    if (c5800a7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        c5800a7 = null;
                    }
                    c5800a7.getClass();
                    BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(c5800a7), null, null, new C5818C7(c5800a7, null), 3, null);
                    C5927O5 c5927o53 = this.f3267a.f3250b;
                    if (c5927o53 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webView");
                        c5927o53 = null;
                    }
                    if (!Intrinsics.areEqual(c5927o53.getUrl(), str)) {
                        C5927O5 c5927o54 = this.f3267a.f3250b;
                        if (c5927o54 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("webView");
                        } else {
                            c5927o52 = c5927o54;
                        }
                        c5927o52.loadUrl(str);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C7235v7.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return C7235v7.this.new d(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3265a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C5800A7 c5800a7 = C7235v7.this.f3251c;
                if (c5800a7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    c5800a7 = null;
                }
                SharedFlow sharedFlowAsSharedFlow = FlowKt.asSharedFlow(c5800a7.f1248m);
                a aVar = new a(C7235v7.this);
                this.f3265a = 1;
                if (sharedFlowAsSharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* renamed from: com.plaid.internal.v7$e */
    public static final class e extends Lambda implements Function0<Unit> {

        /* renamed from: a */
        public static final e f3268a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.plaid.internal.v7$f */
    public static final class f extends Lambda implements Function0<Unit> {

        /* renamed from: a */
        public static final f f3269a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public C7235v7() {
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$RequestPermission(), new ActivityResultCallback() { // from class: com.plaid.internal.v7$$ExternalSyntheticLambda2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C7235v7.m1629a(this.f$0, (Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f3256h = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts$GetMultipleContents(), new ActivityResultCallback() { // from class: com.plaid.internal.v7$$ExternalSyntheticLambda3
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C7235v7.m1630a(this.f$0, (List) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.f3257i = activityResultLauncherRegisterForActivityResult2;
        this.f3259k = new g();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.plaid.internal.workflow.panes.WorkflowViewModelFactoryProvider");
        this.f3251c = (C5800A7) new ViewModelProvider(this, ((InterfaceC6057c8) activity).mo1380a()).get(C5800A7.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        C5945Q5 c5945q5 = null;
        EnumC5880J6 enumC5880J6 = (EnumC5880J6) (arguments != null ? arguments.get("smsAutofillType") : null);
        g listener = this.f3259k;
        Intrinsics.checkNotNullParameter(listener, "listener");
        C7227v c5898l6 = (enumC5880J6 == null ? -1 : C7218u.f3226a[enumC5880J6.ordinal()]) == 1 ? new C5898L6(listener) : new C7227v();
        this.f3252d = c5898l6;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        c5898l6.mo1248a(contextRequireContext);
        View viewInflate = inflater.inflate(C7279R.layout.plaid_webview_fragment, viewGroup, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        C5945Q5 c5945q52 = new C5945Q5(frameLayout, frameLayout);
        Intrinsics.checkNotNullExpressionValue(c5945q52, "inflate(...)");
        this.f3249a = c5945q52;
        ActivityResultLauncher<Unit> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new C5963S6((C6044b5) this.f3253e.getValue()), new ActivityResultCallback() { // from class: com.plaid.internal.v7$$ExternalSyntheticLambda0
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C7235v7.m1628a(this.f$0, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f3258j = activityResultLauncherRegisterForActivityResult;
        C5800A7 c5800a7 = this.f3251c;
        if (c5800a7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            c5800a7 = null;
        }
        C5861H5 c5861h5 = c5800a7.f1243h;
        if (c5861h5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewRegistry");
            c5861h5 = null;
        }
        C5927O5 c5927o5M1211c = c5861h5.m1211c();
        this.f3250b = c5927o5M1211c;
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        C5800A7 listener2 = this.f3251c;
        if (listener2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            listener2 = null;
        }
        C5800A7 listener3 = this.f3251c;
        if (listener3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            listener3 = null;
        }
        ActivityResultLauncher<String> fileInputContract = this.f3257i;
        ActivityResultLauncher<Unit> takePictureContract = this.f3258j;
        if (takePictureContract == null) {
            Intrinsics.throwUninitializedPropertyAccessException("takePictureContract");
            takePictureContract = null;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener2, "interceptor");
        Intrinsics.checkNotNullParameter(listener3, "listener");
        Intrinsics.checkNotNullParameter(fileInputContract, "fileInputContract");
        Intrinsics.checkNotNullParameter(takePictureContract, "takePictureContract");
        Intrinsics.checkNotNullParameter(this, "permissionHelper");
        Context context2 = c5927o5M1211c.getContext();
        if (context2 instanceof MutableContextWrapper) {
            ((MutableContextWrapper) context2).setBaseContext(context);
        }
        c5927o5M1211c.f1593c = listener3;
        C5996W3 c5996w3 = c5927o5M1211c.f1591a;
        c5996w3.getClass();
        Intrinsics.checkNotNullParameter(listener2, "listener");
        c5996w3.f1800a = listener2;
        c5927o5M1211c.setWebChromeClient(new C5887K4(fileInputContract, takePictureContract, listener3, this));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new b(null), 3, null);
        C5945Q5 c5945q53 = this.f3249a;
        if (c5945q53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5945q53 = null;
        }
        FrameLayout frameLayout2 = c5945q53.f1656b;
        C5927O5 c5927o5 = this.f3250b;
        if (c5927o5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            c5927o5 = null;
        }
        frameLayout2.addView(c5927o5);
        C5945Q5 c5945q54 = this.f3249a;
        if (c5945q54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5945q54 = null;
        }
        ViewCompat.setOnApplyWindowInsetsListener(c5945q54.f1656b, new OnApplyWindowInsetsListener() { // from class: com.plaid.internal.v7$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return C7235v7.m1626a(this.f$0, view, windowInsetsCompat);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new c(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new d(null), 3, null);
        C5945Q5 c5945q55 = this.f3249a;
        if (c5945q55 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c5945q5 = c5945q55;
        }
        FrameLayout frameLayout3 = c5945q5.f1655a;
        Intrinsics.checkNotNullExpressionValue(frameLayout3, "getRoot(...)");
        return frameLayout3;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C5927O5 c5927o5 = this.f3250b;
        C7227v c7227v = null;
        if (c5927o5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            c5927o5 = null;
        }
        if (!c5927o5.f1595e.getAndSet(true)) {
            C5945Q5 c5945q5 = this.f3249a;
            if (c5945q5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5945q5 = null;
            }
            c5945q5.f1655a.setBackground(ContextCompat.getDrawable(requireContext(), C7279R.drawable.plaid_transparent_webview_animation_fade_out));
            C5945Q5 c5945q52 = this.f3249a;
            if (c5945q52 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5945q52 = null;
            }
            if (c5945q52.f1655a.getBackground() instanceof AnimationDrawable) {
                C5945Q5 c5945q53 = this.f3249a;
                if (c5945q53 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c5945q53 = null;
                }
                Drawable background = c5945q53.f1655a.getBackground();
                Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                AnimationDrawable animationDrawable = (AnimationDrawable) background;
                animationDrawable.setOneShot(true);
                animationDrawable.start();
            }
            C5945Q5 c5945q54 = this.f3249a;
            if (c5945q54 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c5945q54 = null;
            }
            FrameLayout frameLayout = c5945q54.f1656b;
            C5927O5 c5927o52 = this.f3250b;
            if (c5927o52 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                c5927o52 = null;
            }
            frameLayout.removeView(c5927o52);
            C5927O5 c5927o53 = this.f3250b;
            if (c5927o53 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                c5927o53 = null;
            }
            c5927o53.destroy();
        }
        C7227v c7227v2 = this.f3252d;
        if (c7227v2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autofillManager");
        } else {
            c7227v = c7227v2;
        }
        c7227v.mo1249b(getContext());
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* renamed from: a */
    public static final void m1629a(C7235v7 this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(bool);
        if (bool.booleanValue()) {
            this$0.f3254f.invoke();
        } else {
            Toast.makeText(this$0.getContext(), this$0.getResources().getString(C7279R.string.grant_camera_permission_to_continue), 0).show();
            this$0.f3255g.invoke();
        }
    }

    /* renamed from: a */
    public static final void m1630a(C7235v7 this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C5800A7 c5800a7 = this$0.f3251c;
        if (c5800a7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            c5800a7 = null;
        }
        Intrinsics.checkNotNull(list);
        c5800a7.m1141a(list);
    }

    /* renamed from: a */
    public static final void m1628a(C7235v7 this$0, Uri uri) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C5800A7 c5800a7 = this$0.f3251c;
        if (c5800a7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            c5800a7 = null;
        }
        c5800a7.m1141a(CollectionsKt.listOf(uri));
    }

    /* renamed from: a */
    public static final WindowInsetsCompat m1626a(C7235v7 this$0, View v, WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        Insets insets2 = windowInsets.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        if (this$0.requireContext().getApplicationInfo().targetSdkVersion >= 35) {
            v.setPadding(insets.left, insets.top, insets.right, Math.max(insets.bottom, insets2.bottom));
        } else {
            v.setPadding(insets.left, insets.top, insets.right, 0);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    /* renamed from: com.plaid.internal.v7$g */
    public static final class g implements InterfaceC5889K6 {
        public g() {
        }

        @Override // com.plaid.internal.InterfaceC5889K6
        /* renamed from: a */
        public final void mo1232a(String smsMessage) {
            final String strSubstring;
            String value;
            Intrinsics.checkNotNullParameter(smsMessage, "smsMessage");
            C5927O5 c5927o5 = null;
            MatchResult matchResultFind$default = Regex.find$default(new Regex("[:]\\s?[\\d]{4,8}\\s?[.]?"), smsMessage, 0, 2, null);
            if (matchResultFind$default != null && matchResultFind$default.getValue().length() < 7) {
                Intrinsics.checkNotNullParameter("No OTP code found in SMS message.", "message");
                C5953R5.a.m1304b(C5953R5.f1671a, "No OTP code found in SMS message.");
                C5825D5 c5825d5 = C5835E6.f1339a;
                if (c5825d5 != null) {
                    c5825d5.m1175a("No OTP code found in SMS message.");
                    return;
                }
                return;
            }
            if (matchResultFind$default == null || (value = matchResultFind$default.getValue()) == null) {
                strSubstring = null;
            } else {
                strSubstring = value.substring(2, matchResultFind$default.getValue().length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            }
            C5927O5 c5927o52 = C7235v7.this.f3250b;
            if (c5927o52 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
            } else {
                c5927o5 = c5927o52;
            }
            final C7235v7 c7235v7 = C7235v7.this;
            c5927o5.post(new Runnable() { // from class: com.plaid.internal.v7$g$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C7235v7.g.m1633a(c7235v7, strSubstring);
                }
            });
        }

        /* renamed from: a */
        public static final void m1633a(C7235v7 this$0, String str) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            C5927O5 c5927o5 = this$0.f3250b;
            if (c5927o5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                c5927o5 = null;
            }
            c5927o5.loadUrl("javascript:window.SdkJsBridge.send('{\"message_type\": \"rm-otp-code-input\", \"data\": {\"otpCode\": \"" + str + "\"}}')");
        }

        @Override // com.plaid.internal.InterfaceC5889K6
        /* renamed from: a */
        public final void mo1231a() {
            C5953R5.f1671a.getClass();
            C5953R5.a.m1303a("OTP TimeOut", true);
        }
    }

    /* renamed from: a */
    public final boolean m1632a() {
        return PermissionChecker.checkSelfPermission(requireContext(), "android.permission.CAMERA") == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m1631a(Function0<Unit> success, Function0<Unit> failure) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(failure, "failure");
        this.f3254f = (Lambda) success;
        this.f3255g = failure;
        this.f3256h.launch("android.permission.CAMERA");
    }
}
