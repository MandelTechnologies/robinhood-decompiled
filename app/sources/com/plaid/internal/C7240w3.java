package com.plaid.internal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel2;
import androidx.lifecycle.ViewModelProvider;
import com.plaid.link.C7279R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/plaid/internal/w3;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.plaid.internal.w3 */
/* loaded from: classes16.dex */
public final class C7240w3 extends Fragment {

    /* renamed from: a */
    public C7250x3 f3280a;

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.panes.loading.LoadingFragment$onCreateView$1", m3645f = "LoadingFragment.kt", m3646l = {35}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.w3$a */
    public static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f3281a;

        /* renamed from: c */
        public final /* synthetic */ C7107i5 f3283c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7107i5 c7107i5, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f3283c = c7107i5;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C7240w3.this.new a(this.f3283c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return C7240w3.this.new a(this.f3283c, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3281a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C7250x3 c7250x3 = C7240w3.this.f3280a;
                C5935P4 c5935p4 = null;
                if (c7250x3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    c7250x3 = null;
                }
                this.f3281a = 1;
                C5935P4 c5935p42 = c7250x3.f3297a;
                if (c5935p42 != null) {
                    c5935p4 = c5935p42;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("clientSideOnlyConfigurationStore");
                }
                obj = c5935p4.m1294a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C5896L4 c5896l4 = (C5896L4) obj;
            if (c5896l4 != null) {
                this.f3283c.f2861a.setVisibility(c5896l4.f1526a ? 4 : 0);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.plaid.internal.workflow.panes.WorkflowViewModelFactoryProvider");
        this.f3280a = (C7250x3) new ViewModelProvider(this, ((InterfaceC6057c8) activity).mo1382b()).get(C7250x3.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C7279R.layout.plaid_loading_fragment, viewGroup, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        C7107i5 c7107i5 = new C7107i5(frameLayout);
        Intrinsics.checkNotNullExpressionValue(c7107i5, "inflate(...)");
        C7250x3 c7250x3 = this.f3280a;
        if (c7250x3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            c7250x3 = null;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(c7250x3), null, null, new a(c7107i5, null), 3, null);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
        return frameLayout;
    }
}
