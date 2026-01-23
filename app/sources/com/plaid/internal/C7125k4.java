package com.plaid.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.k4 */
/* loaded from: classes16.dex */
public final class C7125k4 implements InterfaceC7070e8, InterfaceC7153m6 {

    /* renamed from: a */
    public final InterfaceC5916N3 f2903a;

    public C7125k4(InterfaceC5916N3 localPaneStateStore) {
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        this.f2903a = localPaneStateStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC7153m6
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1546a(ContinuationImpl continuationImpl) {
        C7116j4 c7116j4;
        C7125k4 c7125k4;
        if (continuationImpl instanceof C7116j4) {
            c7116j4 = (C7116j4) continuationImpl;
            int i = c7116j4.f2879d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7116j4.f2879d = i - Integer.MIN_VALUE;
            } else {
                c7116j4 = new C7116j4(this, continuationImpl);
            }
        }
        Object objMo1255a = c7116j4.f2877b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7116j4.f2879d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1255a);
            InterfaceC5916N3 interfaceC5916N3 = this.f2903a;
            c7116j4.f2876a = this;
            c7116j4.f2879d = 1;
            objMo1255a = interfaceC5916N3.mo1255a("oauth_pane_state", "received_redirect_uri", c7116j4);
            if (objMo1255a != coroutine_suspended) {
                c7125k4 = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) c7116j4.f2876a;
            ResultKt.throwOnFailure(objMo1255a);
            return str;
        }
        c7125k4 = (C7125k4) c7116j4.f2876a;
        ResultKt.throwOnFailure(objMo1255a);
        String str2 = (String) objMo1255a;
        InterfaceC5916N3 interfaceC5916N32 = c7125k4.f2903a;
        c7116j4.f2876a = str2;
        c7116j4.f2879d = 2;
        return interfaceC5916N32.mo1256a("oauth_pane_state", c7116j4) == coroutine_suspended ? coroutine_suspended : str2;
    }

    @Override // com.plaid.internal.InterfaceC7070e8
    /* renamed from: a */
    public final Object mo1499a(String str, C7167o2 c7167o2) {
        Object objMo1254a = this.f2903a.mo1254a("oauth_pane_state", "received_redirect_uri", str, c7167o2);
        return objMo1254a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo1254a : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.InterfaceC7070e8
    /* renamed from: a */
    public final Object mo1498a(C5986V2 c5986v2) {
        Object objMo1256a = this.f2903a.mo1256a("oauth_pane_state", c5986v2);
        return objMo1256a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo1256a : Unit.INSTANCE;
    }
}
