package com.plaid.internal;

import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@SourceDebugExtension
/* renamed from: com.plaid.internal.P4 */
/* loaded from: classes16.dex */
public final class C5935P4 {

    /* renamed from: a */
    public final C5807B5 f1629a;

    /* renamed from: b */
    public C5896L4 f1630b;

    public C5935P4(C5807B5 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f1629a = storage;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1294a(ContinuationImpl continuationImpl) {
        C5908M4 c5908m4;
        C5935P4 c5935p4;
        if (continuationImpl instanceof C5908M4) {
            c5908m4 = (C5908M4) continuationImpl;
            int i = c5908m4.f1549d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5908m4.f1549d = i - Integer.MIN_VALUE;
            } else {
                c5908m4 = new C5908M4(this, continuationImpl);
            }
        }
        Object objWithContext = c5908m4.f1547b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5908m4.f1549d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            C5896L4 c5896l4 = this.f1630b;
            if (c5896l4 != null) {
                return c5896l4;
            }
            c5908m4.f1546a = this;
            c5908m4.f1549d = 1;
            if ((c5896l4 != null ? boxing.boxBoolean(c5896l4.f1526a) : null) != null) {
                C5896L4 c5896l42 = this.f1630b;
                objWithContext = boxing.boxBoolean(c5896l42 != null && c5896l42.f1526a);
            } else {
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C5917N4(this, null), c5908m4);
            }
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            c5935p4 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5935p4 = c5908m4.f1546a;
            ResultKt.throwOnFailure(objWithContext);
        }
        C5896L4 c5896l43 = new C5896L4(((Boolean) objWithContext).booleanValue());
        c5935p4.f1630b = c5896l43;
        return c5896l43;
    }
}
