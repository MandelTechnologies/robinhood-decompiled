package com.plaid.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.k7 */
/* loaded from: classes16.dex */
public final class C7128k7 implements InterfaceC7180p6, InterfaceC7090g8 {

    /* renamed from: a */
    public final InterfaceC5916N3 f2908a;

    /* renamed from: b */
    public final C6030a1 f2909b;

    public C7128k7(InterfaceC5916N3 localPaneStateStore, C6030a1 featureManager) {
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        Intrinsics.checkNotNullParameter(featureManager, "featureManager");
        this.f2908a = localPaneStateStore;
        this.f2909b = featureManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC7180p6
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1548a(ContinuationImpl continuationImpl) {
        C7119j7 c7119j7;
        if (continuationImpl instanceof C7119j7) {
            c7119j7 = (C7119j7) continuationImpl;
            int i = c7119j7.f2884c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7119j7.f2884c = i - Integer.MIN_VALUE;
            } else {
                c7119j7 = new C7119j7(this, continuationImpl);
            }
        }
        Object objMo1255a = c7119j7.f2882a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7119j7.f2884c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1255a);
            this.f2909b.getClass();
            EnumC6040b1 enumC6040b1 = EnumC6040b1.BACKEND_DETERMINES;
            if (enumC6040b1.isSet()) {
                this.f2909b.getClass();
                return boxing.boxBoolean(enumC6040b1.toBoolean());
            }
            InterfaceC5916N3 interfaceC5916N3 = this.f2908a;
            c7119j7.f2884c = 1;
            objMo1255a = interfaceC5916N3.mo1255a("webview_background_transparency_state", "webview_background_is_transparent", c7119j7);
            if (objMo1255a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo1255a);
        }
        String str = (String) objMo1255a;
        return str == null ? boxing.boxBoolean(false) : boxing.boxBoolean(Boolean.parseBoolean(str));
    }

    @Override // com.plaid.internal.InterfaceC7090g8
    /* renamed from: a */
    public final Object mo1516a(boolean z, C7185q2 c7185q2) {
        Object objMo1254a = this.f2908a.mo1254a("webview_background_transparency_state", "webview_background_is_transparent", String.valueOf(z), c7185q2);
        return objMo1254a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo1254a : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.InterfaceC7180p6
    /* renamed from: a */
    public final Object mo1547a(C7263y7 c7263y7) {
        Object objMo1256a = this.f2908a.mo1256a("webview_background_transparency_state", c7263y7);
        return objMo1256a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo1256a : Unit.INSTANCE;
    }
}
