package com.plaid.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.u7 */
/* loaded from: classes16.dex */
public final class C7226u7 implements InterfaceC7110i8, InterfaceC7198r6 {

    /* renamed from: a */
    public final InterfaceC5916N3 f3237a;

    public C7226u7(InterfaceC5916N3 localPaneStateStore) {
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        this.f3237a = localPaneStateStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC7198r6
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1600a(ContinuationImpl continuationImpl) {
        C7217t7 c7217t7;
        C7226u7 c7226u7;
        if (continuationImpl instanceof C7217t7) {
            c7217t7 = (C7217t7) continuationImpl;
            int i = c7217t7.f3225d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7217t7.f3225d = i - Integer.MIN_VALUE;
            } else {
                c7217t7 = new C7217t7(this, continuationImpl);
            }
        }
        Object objMo1255a = c7217t7.f3223b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7217t7.f3225d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1255a);
            InterfaceC5916N3 interfaceC5916N3 = this.f3237a;
            c7217t7.f3222a = this;
            c7217t7.f3225d = 1;
            objMo1255a = interfaceC5916N3.mo1255a("webview_fallback_state", "webview_fallback_initial_uri", c7217t7);
            if (objMo1255a != coroutine_suspended) {
                c7226u7 = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) c7217t7.f3222a;
            ResultKt.throwOnFailure(objMo1255a);
            return str;
        }
        c7226u7 = (C7226u7) c7217t7.f3222a;
        ResultKt.throwOnFailure(objMo1255a);
        String str2 = (String) objMo1255a;
        InterfaceC5916N3 interfaceC5916N32 = c7226u7.f3237a;
        c7217t7.f3222a = str2;
        c7217t7.f3225d = 2;
        return interfaceC5916N32.mo1256a("webview_fallback_state", c7217t7) == coroutine_suspended ? coroutine_suspended : str2;
    }

    @Override // com.plaid.internal.InterfaceC7110i8
    /* renamed from: a */
    public final Object mo1533a(String str, C7185q2 c7185q2) {
        Object objMo1254a = this.f3237a.mo1254a("webview_fallback_state", "webview_fallback_initial_uri", str, c7185q2);
        return objMo1254a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo1254a : Unit.INSTANCE;
    }
}
