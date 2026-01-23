package com.plaid.internal;

import android.util.Base64;
import com.plaid.internal.C7196r4;
import com.plaid.internal.core.protos.link.channel.Channel$Message;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.T5 */
/* loaded from: classes16.dex */
public final class C5971T5 implements InterfaceC7171o6, InterfaceC7080f8 {

    /* renamed from: a */
    public final InterfaceC5916N3 f1720a;

    public C5971T5(InterfaceC5916N3 localPaneStateStore) {
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        this.f1720a = localPaneStateStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC7171o6
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1318a(ContinuationImpl continuationImpl) {
        C5962S5 c5962s5;
        if (continuationImpl instanceof C5962S5) {
            c5962s5 = (C5962S5) continuationImpl;
            int i = c5962s5.f1690c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5962s5.f1690c = i - Integer.MIN_VALUE;
            } else {
                c5962s5 = new C5962S5(this, continuationImpl);
            }
        }
        Object objMo1255a = c5962s5.f1688a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5962s5.f1690c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1255a);
            InterfaceC5916N3 interfaceC5916N3 = this.f1720a;
            c5962s5.f1690c = 1;
            objMo1255a = interfaceC5916N3.mo1255a("pre_completion_result_state", "pre_completion_result", c5962s5);
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
        if (str == null) {
            return null;
        }
        return Channel$Message.SDKResult.parseFrom(Base64.decode(str, 0));
    }

    @Override // com.plaid.internal.InterfaceC7171o6
    /* renamed from: b */
    public final Object mo1319b(ContinuationImpl continuationImpl) {
        Object objMo1256a = this.f1720a.mo1256a("pre_completion_result_state", continuationImpl);
        return objMo1256a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo1256a : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.InterfaceC7080f8
    /* renamed from: a */
    public final Object mo1317a(Channel$Message.SDKResult sDKResult, C7196r4.b bVar) {
        String strEncodeToString = Base64.encodeToString(sDKResult.toByteArray(), 0);
        InterfaceC5916N3 interfaceC5916N3 = this.f1720a;
        Intrinsics.checkNotNull(strEncodeToString);
        Object objMo1254a = interfaceC5916N3.mo1254a("pre_completion_result_state", "pre_completion_result", strEncodeToString, bVar);
        return objMo1254a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo1254a : Unit.INSTANCE;
    }
}
