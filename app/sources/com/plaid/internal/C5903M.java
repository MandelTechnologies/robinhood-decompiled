package com.plaid.internal;

import android.os.Looper;
import android.util.Patterns;
import com.plaid.internal.AbstractC6056c7;
import com.plaid.internal.InterfaceC7078f6;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.plaid.internal.M */
/* loaded from: classes16.dex */
public final class C5903M implements InterfaceC6046b7 {

    /* renamed from: a */
    public final C5882K f1538a;

    public C5903M(C5882K requestManager) {
        Intrinsics.checkNotNullParameter(requestManager, "requestManager");
        this.f1538a = requestManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC6046b7
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1250a(String str, ContinuationImpl continuationImpl) throws AbstractC6056c7.b, AbstractC6056c7.d, AbstractC6056c7.e {
        C5891L c5891l;
        C5903M c5903m;
        if (continuationImpl instanceof C5891L) {
            c5891l = (C5891L) continuationImpl;
            int i = c5891l.f1440d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5891l.f1440d = i - Integer.MIN_VALUE;
            } else {
                c5891l = new C5891L(this, continuationImpl);
            }
        }
        Object objM1229a = c5891l.f1438b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5891l.f1440d;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objM1229a);
                if (!Patterns.WEB_URL.matcher(str).matches()) {
                    throw AbstractC6056c7.b.f1947a;
                }
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    throw AbstractC6056c7.e.f1950a;
                }
                C5882K c5882k = this.f1538a;
                c5891l.f1437a = this;
                c5891l.f1440d = 1;
                objM1229a = c5882k.m1229a(str, c5891l);
                if (objM1229a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c5903m = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c5903m = c5891l.f1437a;
                ResultKt.throwOnFailure(objM1229a);
            }
            C6033a4 c6033a4 = (C6033a4) objM1229a;
            String str2 = c6033a4.f1897b;
            c5903m.getClass();
            boolean zContains$default = false;
            if (str2 != null) {
                zContains$default = StringsKt.contains$default((CharSequence) str2, (CharSequence) "ErrorCode=0&ErrorDescription=Success", false, 2, (Object) null);
            }
            if (zContains$default) {
                return new InterfaceC7078f6.b(c6033a4);
            }
            throw new AbstractC6056c7.d(String.valueOf(c6033a4.f1897b));
        } catch (AbstractC6056c7 e) {
            return new InterfaceC7078f6.a(e);
        } catch (Exception e2) {
            return new InterfaceC7078f6.a(new AbstractC6056c7.f(e2));
        }
    }
}
