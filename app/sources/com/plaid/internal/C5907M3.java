package com.plaid.internal;

import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.M3 */
/* loaded from: classes16.dex */
public final class C5907M3 implements InterfaceC5916N3 {

    /* renamed from: a */
    public final InterfaceC7255y<String, Object> f1544a;

    /* renamed from: b */
    public final InterfaceC5814C3 f1545b;

    public C5907M3(WorkflowDatabase database) {
        C5978U3 cache2 = new C5978U3();
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(cache2, "cache");
        this.f1544a = cache2;
        this.f1545b = database.mo1638a();
    }

    @Override // com.plaid.internal.InterfaceC5916N3
    /* renamed from: a */
    public final Object mo1255a(String str, String str2, ContinuationImpl continuationImpl) {
        Object objMo1327a = this.f1544a.mo1327a(str2);
        String str3 = objMo1327a instanceof String ? (String) objMo1327a : null;
        return str3 == null ? this.f1545b.mo1166a(str, str2, continuationImpl) : str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC5916N3
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1254a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        C5895L3 c5895l3;
        C5907M3 c5907m3;
        if (continuationImpl instanceof C5895L3) {
            c5895l3 = (C5895L3) continuationImpl;
            int i = c5895l3.f1525f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5895l3.f1525f = i - Integer.MIN_VALUE;
            } else {
                c5895l3 = new C5895L3(this, continuationImpl);
            }
        }
        Object obj = c5895l3.f1523d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5895l3.f1525f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC5814C3 interfaceC5814C3 = this.f1545b;
            c5895l3.f1520a = this;
            c5895l3.f1521b = str2;
            c5895l3.f1522c = str3;
            c5895l3.f1525f = 1;
            if (interfaceC5814C3.mo1165a(str, str2, str3, c5895l3) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c5907m3 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = c5895l3.f1522c;
            str2 = c5895l3.f1521b;
            c5907m3 = c5895l3.f1520a;
            ResultKt.throwOnFailure(obj);
        }
        c5907m3.f1544a.mo1328a(str2, str3);
        return Unit.INSTANCE;
    }

    @Override // com.plaid.internal.InterfaceC5916N3
    /* renamed from: a */
    public final Object mo1256a(String str, ContinuationImpl continuationImpl) {
        this.f1544a.clear();
        Object objMo1167a = this.f1545b.mo1167a(str, continuationImpl);
        return objMo1167a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo1167a : Unit.INSTANCE;
    }
}
