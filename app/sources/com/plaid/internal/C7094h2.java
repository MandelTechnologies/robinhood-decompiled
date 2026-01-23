package com.plaid.internal;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.plaid.internal.link.LinkActivity;
import kotlin.Function;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* renamed from: com.plaid.internal.h2 */
/* loaded from: classes16.dex */
public final class C7094h2 extends ViewModel {

    /* renamed from: a */
    public final C7147m0 f2826a;

    /* renamed from: b */
    public final C5831E2 f2827b;

    /* renamed from: c */
    public final InterfaceC7203s2 f2828c;

    /* renamed from: d */
    public final InterfaceC6004X2 f2829d;

    /* renamed from: e */
    public final C7258y2 f2830e;

    /* renamed from: f */
    public Job f2831f;

    /* renamed from: com.plaid.internal.h2$a */
    public static final class a implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ LinkActivity.C7139b f2832a;

        public a(LinkActivity.C7139b function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f2832a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(this.f2832a, ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.f2832a;
        }

        public final int hashCode() {
            return this.f2832a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f2832a.invoke(obj);
        }
    }

    public C7094h2(InterfaceC6013Y2 tokenComponent) {
        Intrinsics.checkNotNullParameter(tokenComponent, "tokenComponent");
        C7156n0 c7156n0 = (C7156n0) tokenComponent;
        C7165o0 c7165o0 = c7156n0.f2992a;
        C7147m0 c7147m0 = new C7147m0(c7165o0, c7156n0.f2993b, new C5848G1());
        c7165o0.f3052p.get();
        this.f2827b = c7147m0.f2946d.get();
        this.f2828c = c7147m0.f2956n.get();
        c7165o0.f3045i.get();
        this.f2829d = c7165o0.f3042f.get();
        c7165o0.f3044h.get();
        this.f2830e = c7165o0.f3046j.get();
        this.f2826a = c7147m0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1521a(ContinuationImpl continuationImpl) {
        C7084g2 c7084g2;
        if (continuationImpl instanceof C7084g2) {
            c7084g2 = (C7084g2) continuationImpl;
            int i = c7084g2.f2795c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7084g2.f2795c = i - Integer.MIN_VALUE;
            } else {
                c7084g2 = new C7084g2(this, continuationImpl);
            }
        }
        Object obj = c7084g2.f2793a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7084g2.f2795c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC7203s2 interfaceC7203s2 = this.f2828c;
            if (interfaceC7203s2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("controller");
                interfaceC7203s2 = null;
            }
            c7084g2.f2795c = 1;
            if (interfaceC7203s2.mo1583a(c7084g2) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return boxing.boxBoolean(true);
    }
}
