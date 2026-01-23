package com.plaid.internal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.RepeatOnLifecycle;
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

@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/plaid/internal/j1;", "Lcom/plaid/internal/V7;", "Lcom/plaid/internal/k1;", "<init>", "()V", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.plaid.internal.j1 */
/* loaded from: classes16.dex */
public final class C7113j1 extends AbstractC5991V7<C7122k1> {

    /* renamed from: e */
    public static final /* synthetic */ int f2869e = 0;

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthFragment$onCreate$1", m3645f = "HeadlessOAuthFragment.kt", m3646l = {25}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.j1$a */
    public static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f2870a;

        @DebugMetadata(m3644c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthFragment$onCreate$1$1", m3645f = "HeadlessOAuthFragment.kt", m3646l = {26}, m3647m = "invokeSuspend")
        /* renamed from: com.plaid.internal.j1$a$a, reason: collision with other inner class name */
        public static final class C49492a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f2872a;

            /* renamed from: b */
            public final /* synthetic */ C7113j1 f2873b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C49492a(C7113j1 c7113j1, Continuation<? super C49492a> continuation) {
                super(2, continuation);
                this.f2873b = c7113j1;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C49492a(this.f2873b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return new C49492a(this.f2873b, continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f2872a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C7113j1 c7113j1 = this.f2873b;
                    int i2 = C7113j1.f2869e;
                    Object obj2 = c7113j1.f1783b;
                    if (obj2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        obj2 = null;
                    }
                    this.f2872a = 1;
                    if (((C7122k1) obj2).m1543a(this) == coroutine_suspended) {
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

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C7113j1.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return C7113j1.this.new a(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2870a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C7113j1 c7113j1 = C7113j1.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                C49492a c49492a = new C49492a(c7113j1, null);
                this.f2870a = 1;
                if (RepeatOnLifecycle.repeatOnLifecycle(c7113j1, state, c49492a, this) == coroutine_suspended) {
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

    @Override // com.plaid.internal.AbstractC5991V7
    /* renamed from: a */
    public final C7122k1 mo1335a(C6009X7 paneId, InterfaceC5815C4 component) {
        Intrinsics.checkNotNullParameter(paneId, "paneId");
        Intrinsics.checkNotNullParameter(component, "component");
        return new C7122k1(paneId, component);
    }

    @Override // com.plaid.internal.AbstractC5991V7, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new a(null), 3, null);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return null;
    }
}
