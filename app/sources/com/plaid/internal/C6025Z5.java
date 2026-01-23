package com.plaid.internal;

import com.plaid.internal.AbstractC5894L2;
import com.plaid.internal.AbstractC7058d6;
import com.plaid.internal.C5953R5;
import com.plaid.link.SubmissionData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;

/* renamed from: com.plaid.internal.Z5 */
/* loaded from: classes16.dex */
public final class C6025Z5 {

    /* renamed from: a */
    public final InterfaceC6004X2 f1870a;

    /* renamed from: b */
    public final C5995W2 f1871b;

    /* renamed from: c */
    public final C5861H5 f1872c;

    /* renamed from: d */
    public final C6030a1 f1873d;

    /* renamed from: e */
    public final C6045b6 f1874e;

    /* renamed from: f */
    public final C7199r7 f1875f;

    /* renamed from: g */
    public SubmissionData f1876g;

    public C6025Z5(InterfaceC6004X2 linkStateStore, C5995W2 linkStateReducer, C5861H5 webViewRegistry, C6030a1 featureManager, C6045b6 preloadPlaidWebViewListener, C7199r7 webviewFallbackBaseUrlOverWriter) {
        Intrinsics.checkNotNullParameter(linkStateStore, "linkStateStore");
        Intrinsics.checkNotNullParameter(linkStateReducer, "linkStateReducer");
        Intrinsics.checkNotNullParameter(webViewRegistry, "webViewRegistry");
        Intrinsics.checkNotNullParameter(featureManager, "featureManager");
        Intrinsics.checkNotNullParameter(preloadPlaidWebViewListener, "preloadPlaidWebViewListener");
        Intrinsics.checkNotNullParameter(webviewFallbackBaseUrlOverWriter, "webviewFallbackBaseUrlOverWriter");
        this.f1870a = linkStateStore;
        this.f1871b = linkStateReducer;
        this.f1872c = webViewRegistry;
        this.f1873d = featureManager;
        this.f1874e = preloadPlaidWebViewListener;
        this.f1875f = webviewFallbackBaseUrlOverWriter;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1357a(ContinuationImpl continuationImpl) {
        C5980U5 c5980u5;
        C6025Z5 c6025z5;
        boolean z;
        if (continuationImpl instanceof C5980U5) {
            c5980u5 = (C5980U5) continuationImpl;
            int i = c5980u5.f1754d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5980u5.f1754d = i - Integer.MIN_VALUE;
            } else {
                c5980u5 = new C5980U5(this, continuationImpl);
            }
        }
        Object objMo1351a = c5980u5.f1752b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5980u5.f1754d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1351a);
            InterfaceC6004X2 interfaceC6004X2 = this.f1870a;
            c5980u5.f1751a = this;
            c5980u5.f1754d = 1;
            objMo1351a = interfaceC6004X2.mo1351a(c5980u5);
            if (objMo1351a == coroutine_suspended) {
                return coroutine_suspended;
            }
            c6025z5 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6025z5 = c5980u5.f1751a;
            ResultKt.throwOnFailure(objMo1351a);
        }
        AbstractC5894L2 abstractC5894L2 = (AbstractC5894L2) objMo1351a;
        if (abstractC5894L2 instanceof AbstractC5894L2.b) {
            return AbstractC7058d6.a.f2732a;
        }
        if (!(abstractC5894L2 instanceof AbstractC5894L2.k)) {
            return AbstractC7058d6.d.f2734a;
        }
        AbstractC5894L2.k kVar = (AbstractC5894L2.k) abstractC5894L2;
        if (!kVar.f1505k) {
            c6025z5.f1873d.getClass();
            EnumC6040b1 enumC6040b1 = EnumC6040b1.BACKEND_DETERMINES;
            if (enumC6040b1.isSet()) {
                c6025z5.f1873d.getClass();
                z = enumC6040b1.toBoolean();
            } else {
                z = false;
            }
            if (!z) {
                return AbstractC7058d6.d.f2734a;
            }
        }
        return kVar.f1504j ? new AbstractC7058d6.b(kVar.f1500f) : new AbstractC7058d6.c(kVar.f1500f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.plaid.internal.C5998W5(r2, r8, null), r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1358b(ContinuationImpl continuationImpl) {
        C5989V5 c5989v5;
        C6025Z5 c6025z5;
        if (continuationImpl instanceof C5989V5) {
            c5989v5 = (C5989V5) continuationImpl;
            int i = c5989v5.f1773d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5989v5.f1773d = i - Integer.MIN_VALUE;
            } else {
                c5989v5 = new C5989V5(this, continuationImpl);
            }
        }
        Object objM1357a = c5989v5.f1771b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5989v5.f1773d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM1357a);
            c5989v5.f1770a = this;
            c5989v5.f1773d = 1;
            objM1357a = m1357a(c5989v5);
            if (objM1357a != coroutine_suspended) {
                c6025z5 = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM1357a);
            C5953R5.a.m1299a(C5953R5.f1671a, "Preload link complete");
            return Unit.INSTANCE;
        }
        c6025z5 = c5989v5.f1770a;
        ResultKt.throwOnFailure(objM1357a);
        AbstractC7058d6 abstractC7058d6 = (AbstractC7058d6) objM1357a;
        if (!JobKt.isActive(c5989v5.get$context())) {
            return Unit.INSTANCE;
        }
        C5953R5.a.m1299a(C5953R5.f1671a, "Preload Link " + abstractC7058d6);
        if (!Intrinsics.areEqual(abstractC7058d6, AbstractC7058d6.a.f2732a) && !(abstractC7058d6 instanceof AbstractC7058d6.d)) {
            if (abstractC7058d6 instanceof AbstractC7058d6.b) {
                ((AbstractC7058d6.b) abstractC7058d6).getClass();
                c6025z5.getClass();
            } else if (abstractC7058d6 instanceof AbstractC7058d6.c) {
                String strM1491a = ((AbstractC7058d6.c) abstractC7058d6).m1491a();
                c5989v5.f1770a = null;
                c5989v5.f1773d = 2;
                c6025z5.getClass();
            }
        }
        C5953R5.a.m1299a(C5953R5.f1671a, "Preload link complete");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
    
        if (r2.mo1350a(r10, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1359c(ContinuationImpl continuationImpl) {
        C6007X5 c6007x5;
        C6025Z5 c6025z5;
        if (continuationImpl instanceof C6007X5) {
            c6007x5 = (C6007X5) continuationImpl;
            int i = c6007x5.f1827d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6007x5.f1827d = i - Integer.MIN_VALUE;
            } else {
                c6007x5 = new C6007X5(this, continuationImpl);
            }
        }
        Object objMo1351a = c6007x5.f1825b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c6007x5.f1827d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1351a);
            if (!JobKt.isActive(c6007x5.get$context())) {
                return Unit.INSTANCE;
            }
            InterfaceC6004X2 interfaceC6004X2 = this.f1870a;
            c6007x5.f1824a = this;
            c6007x5.f1827d = 1;
            objMo1351a = interfaceC6004X2.mo1351a(c6007x5);
            if (objMo1351a != coroutine_suspended) {
                c6025z5 = this;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            c6025z5 = c6007x5.f1824a;
            ResultKt.throwOnFailure(objMo1351a);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMo1351a);
                return Unit.INSTANCE;
            }
            c6025z5 = c6007x5.f1824a;
            ResultKt.throwOnFailure(objMo1351a);
            AbstractC5894L2 abstractC5894L2 = (AbstractC5894L2) objMo1351a;
            if (JobKt.isActive(c6007x5.get$context())) {
                return Unit.INSTANCE;
            }
            C5953R5.a.m1299a(C5953R5.f1671a, "Preload workflow complete " + abstractC5894L2);
            InterfaceC6004X2 interfaceC6004X22 = c6025z5.f1870a;
            c6007x5.f1824a = null;
            c6007x5.f1827d = 3;
        }
        AbstractC5894L2 abstractC5894L22 = (AbstractC5894L2) objMo1351a;
        if (!JobKt.isActive(c6007x5.get$context())) {
            return Unit.INSTANCE;
        }
        C5953R5.a.m1299a(C5953R5.f1671a, "Preload workflow from " + abstractC5894L22);
        C5995W2 c5995w2 = c6025z5.f1871b;
        c6007x5.f1824a = c6025z5;
        c6007x5.f1827d = 2;
        objMo1351a = c5995w2.m1345a(abstractC5894L22, true, (ContinuationImpl) c6007x5);
        if (objMo1351a != coroutine_suspended) {
            AbstractC5894L2 abstractC5894L23 = (AbstractC5894L2) objMo1351a;
            if (JobKt.isActive(c6007x5.get$context())) {
            }
        }
        return coroutine_suspended;
    }
}
