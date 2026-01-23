package com.plaid.internal;

import com.plaid.internal.C5953R5;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.o7 */
/* loaded from: classes16.dex */
public final class C7172o7 {

    /* renamed from: a */
    public final C7195r3 f3077a;

    /* renamed from: b */
    public final InterfaceC7189q6 f3078b;

    public C7172o7(C7195r3 workflowAnalytics, InterfaceC7189q6 readWebviewFallbackId) {
        Intrinsics.checkNotNullParameter(workflowAnalytics, "workflowAnalytics");
        Intrinsics.checkNotNullParameter(readWebviewFallbackId, "readWebviewFallbackId");
        this.f3077a = workflowAnalytics;
        this.f3078b = readWebviewFallbackId;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1569a(ContinuationImpl continuationImpl) {
        C7137l7 c7137l7;
        C7172o7 c7172o7;
        if (continuationImpl instanceof C7137l7) {
            c7137l7 = (C7137l7) continuationImpl;
            int i = c7137l7.f2927d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7137l7.f2927d = i - Integer.MIN_VALUE;
            } else {
                c7137l7 = new C7137l7(this, continuationImpl);
            }
        }
        Object objMo1574a = c7137l7.f2925b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7137l7.f2927d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1574a);
            InterfaceC7189q6 interfaceC7189q6 = this.f3078b;
            c7137l7.f2924a = this;
            c7137l7.f2927d = 1;
            objMo1574a = interfaceC7189q6.mo1574a(c7137l7);
            if (objMo1574a == coroutine_suspended) {
                return coroutine_suspended;
            }
            c7172o7 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7172o7 = c7137l7.f2924a;
            ResultKt.throwOnFailure(objMo1574a);
        }
        String str = (String) objMo1574a;
        if (str == null) {
            C5953R5.a.m1309e(C5953R5.f1671a, "WebviewFallback ID missing from pane store --skipping WebviewFallbackCancelEvent");
        } else {
            c7172o7.f3077a.m1594a(str);
            C5953R5.a.m1299a(C5953R5.f1671a, "WebviewFallbackCancel webviewFallbackId=" + str);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1570b(ContinuationImpl continuationImpl) {
        C7154m7 c7154m7;
        C7172o7 c7172o7;
        if (continuationImpl instanceof C7154m7) {
            c7154m7 = (C7154m7) continuationImpl;
            int i = c7154m7.f2990d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7154m7.f2990d = i - Integer.MIN_VALUE;
            } else {
                c7154m7 = new C7154m7(this, continuationImpl);
            }
        }
        Object objMo1574a = c7154m7.f2988b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7154m7.f2990d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1574a);
            InterfaceC7189q6 interfaceC7189q6 = this.f3078b;
            c7154m7.f2987a = this;
            c7154m7.f2990d = 1;
            objMo1574a = interfaceC7189q6.mo1574a(c7154m7);
            if (objMo1574a == coroutine_suspended) {
                return coroutine_suspended;
            }
            c7172o7 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7172o7 = c7154m7.f2987a;
            ResultKt.throwOnFailure(objMo1574a);
        }
        String str = (String) objMo1574a;
        if (str == null) {
            C5953R5.a.m1309e(C5953R5.f1671a, "WebviewFallback ID missing from pane store --skipping WebviewFallbackEmitPreCompletionResultEvent");
        } else {
            c7172o7.f3077a.m1597b(str);
            C5953R5.a.m1299a(C5953R5.f1671a, "WebviewFallbackEmitPreCompletionResult webviewFallbackId=" + str);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1571c(ContinuationImpl continuationImpl) {
        C7163n7 c7163n7;
        C7172o7 c7172o7;
        if (continuationImpl instanceof C7163n7) {
            c7163n7 = (C7163n7) continuationImpl;
            int i = c7163n7.f3027d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7163n7.f3027d = i - Integer.MIN_VALUE;
            } else {
                c7163n7 = new C7163n7(this, continuationImpl);
            }
        }
        Object objMo1574a = c7163n7.f3025b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7163n7.f3027d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1574a);
            InterfaceC7189q6 interfaceC7189q6 = this.f3078b;
            c7163n7.f3024a = this;
            c7163n7.f3027d = 1;
            objMo1574a = interfaceC7189q6.mo1574a(c7163n7);
            if (objMo1574a == coroutine_suspended) {
                return coroutine_suspended;
            }
            c7172o7 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7172o7 = c7163n7.f3024a;
            ResultKt.throwOnFailure(objMo1574a);
        }
        String str = (String) objMo1574a;
        c7172o7.getClass();
        if (str == null) {
            C5953R5.a.m1309e(C5953R5.f1671a, "WebviewFallback ID missing from pane store --skipping WebviewFallbackOpenEvent");
        } else {
            c7172o7.f3077a.m1598c(str);
            C5953R5.a.m1299a(C5953R5.f1671a, "WebviewFallbackOpen webviewFallbackId=" + str);
        }
        return Unit.INSTANCE;
    }
}
