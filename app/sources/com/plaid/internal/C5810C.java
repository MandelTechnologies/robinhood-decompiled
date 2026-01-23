package com.plaid.internal;

import com.plaid.internal.C5792A;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* renamed from: com.plaid.internal.C */
/* loaded from: classes16.dex */
public final class C5810C implements InterfaceC7136l6, InterfaceC7060d8 {

    /* renamed from: a */
    public final InterfaceC5916N3 f1287a;

    /* renamed from: b */
    public final Json f1288b;

    public C5810C(InterfaceC5916N3 localPaneStateStore, Json json) {
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f1287a = localPaneStateStore;
        this.f1288b = json;
    }

    @Override // com.plaid.internal.InterfaceC7060d8
    /* renamed from: a */
    public final Object mo1155a(C5792A c5792a, C7185q2 c7185q2) {
        Object objMo1254a = this.f1287a.mo1254a("channel_state", "Channel_info", this.f1288b.encodeToString(C5792A.a.f1220a, c5792a), c7185q2);
        return objMo1254a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo1254a : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC7136l6
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1158b(ContinuationImpl continuationImpl) {
        C5801B c5801b;
        C5810C c5810c;
        if (continuationImpl instanceof C5801B) {
            c5801b = (C5801B) continuationImpl;
            int i = c5801b.f1261d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5801b.f1261d = i - Integer.MIN_VALUE;
            } else {
                c5801b = new C5801B(this, continuationImpl);
            }
        }
        Object objMo1255a = c5801b.f1259b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5801b.f1261d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1255a);
            InterfaceC5916N3 interfaceC5916N3 = this.f1287a;
            c5801b.f1258a = this;
            c5801b.f1261d = 1;
            objMo1255a = interfaceC5916N3.mo1255a("channel_state", "Channel_info", c5801b);
            if (objMo1255a == coroutine_suspended) {
                return coroutine_suspended;
            }
            c5810c = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5810c = c5801b.f1258a;
            ResultKt.throwOnFailure(objMo1255a);
        }
        String str = (String) objMo1255a;
        if (str != null) {
            return (C5792A) c5810c.f1288b.decodeFromString(C5792A.a.f1220a, str);
        }
        return null;
    }

    @Override // com.plaid.internal.InterfaceC7136l6
    /* renamed from: a */
    public final Object mo1157a(ContinuationImpl continuationImpl) {
        Object objMo1256a = this.f1287a.mo1256a("channel_state", continuationImpl);
        return objMo1256a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo1256a : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.InterfaceC7060d8
    /* renamed from: a */
    public final Object mo1156a(C7185q2 c7185q2) {
        Object objMo1157a = mo1157a((ContinuationImpl) c7185q2);
        return objMo1157a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo1157a : Unit.INSTANCE;
    }
}
