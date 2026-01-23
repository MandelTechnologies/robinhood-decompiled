package com.plaid.internal;

import androidx.lifecycle.ViewModel2;
import com.plaid.internal.C5953R5;
import com.plaid.internal.C7106i4;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import dagger.internal.Preconditions;
import kotlin.ExceptionsH;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* renamed from: com.plaid.internal.k1 */
/* loaded from: classes16.dex */
public final class C7122k1 extends AbstractC6037a8 {

    /* renamed from: k */
    public static final /* synthetic */ int f2887k = 0;

    /* renamed from: f */
    public final SharedFlow2<Pane$PaneRendering> f2888f;

    /* renamed from: g */
    public final InterfaceC7153m6 f2889g;

    /* renamed from: h */
    public final InterfaceC5916N3 f2890h;

    /* renamed from: i */
    public final InterfaceC5929O7 f2891i;

    /* renamed from: j */
    public C7096h4 f2892j;

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel$1", m3645f = "HeadlessOAuthViewModel.kt", m3646l = {50, 62}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.k1$a */
    public static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f2893a;

        /* renamed from: c */
        public final /* synthetic */ C6009X7 f2895c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6009X7 c6009x7, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f2895c = c6009x7;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C7122k1.this.new a(this.f2895c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return C7122k1.this.new a(this.f2895c, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws C5804B2 {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2893a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C7122k1 c7122k1 = C7122k1.this;
                C6009X7 c6009x7 = this.f2895c;
                this.f2893a = 1;
                obj = c7122k1.m1368a(c6009x7, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Pane$PaneRendering pane$PaneRendering = (Pane$PaneRendering) obj;
            if (!pane$PaneRendering.hasHeadlessOAuth()) {
                String str = "Pane rendering must be headless oauth. was " + pane$PaneRendering.getRenderingCase();
                pane$PaneRendering.getId();
                pane$PaneRendering.getPaneNodeId();
                throw new C5804B2(str);
            }
            HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering headlessOAuth = pane$PaneRendering.getHeadlessOAuth();
            C7122k1 c7122k12 = C7122k1.this;
            headlessOAuth.getEvents();
            c7122k12.getClass();
            C7122k1 c7122k13 = C7122k1.this;
            InterfaceC5929O7 interfaceC5929O7M1545c = c7122k13.m1545c();
            C7195r3 c7195r3M1367a = C7122k1.this.m1367a();
            C7122k1 c7122k14 = C7122k1.this;
            Intrinsics.checkNotNull(headlessOAuth);
            C7106i4 c7106i4M1536a = C7122k1.m1536a(c7122k14, headlessOAuth);
            String oauthStateId = headlessOAuth.getOauthStateId();
            Intrinsics.checkNotNullExpressionValue(oauthStateId, "getOauthStateId(...)");
            c7122k13.m1544a(new C7096h4(interfaceC5929O7M1545c, c7195r3M1367a, c7106i4M1536a, oauthStateId, this.f2895c));
            SharedFlow2 sharedFlow2 = C7122k1.this.f2888f;
            this.f2893a = 2;
        }
    }

    /* renamed from: com.plaid.internal.k1$b */
    public static abstract class b {

        /* renamed from: com.plaid.internal.k1$b$a */
        public static final class a extends b {

            /* renamed from: a */
            public final String f2896a;

            public a(String oautStateId) {
                Intrinsics.checkNotNullParameter(oautStateId, "oautStateId");
                this.f2896a = oautStateId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.f2896a, ((a) obj).f2896a);
            }

            public final int hashCode() {
                return this.f2896a.hashCode();
            }

            public final String toString() {
                return "PollOAuthResult(oautStateId=" + this.f2896a + ")";
            }
        }

        /* renamed from: com.plaid.internal.k1$b$b, reason: collision with other inner class name */
        public static final class C49493b extends b {

            /* renamed from: a */
            public final String f2897a;

            public C49493b(String loginUrl) {
                Intrinsics.checkNotNullParameter(loginUrl, "loginUrl");
                this.f2897a = loginUrl;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C49493b) && Intrinsics.areEqual(this.f2897a, ((C49493b) obj).f2897a);
            }

            public final int hashCode() {
                return this.f2897a.hashCode();
            }

            public final String toString() {
                return "ShowLogin(loginUrl=" + this.f2897a + ")";
            }
        }

        /* renamed from: com.plaid.internal.k1$b$c */
        public static final class c extends b {

            /* renamed from: a */
            public final String f2898a;

            public c(String redirectUri) {
                Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
                this.f2898a = redirectUri;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f2898a, ((c) obj).f2898a);
            }

            public final int hashCode() {
                return this.f2898a.hashCode();
            }

            public final String toString() {
                return "SubmitRedirectUri(redirectUri=" + this.f2898a + ")";
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7122k1(C6009X7 paneId, InterfaceC5815C4 paneHostComponent) throws SecurityException {
        super(paneId, paneHostComponent);
        Intrinsics.checkNotNullParameter(paneId, "paneId");
        Intrinsics.checkNotNullParameter(paneHostComponent, "paneHostComponent");
        this.f2888f = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
        C7130l0 c7130l0Mo1168a = paneHostComponent.mo1168a();
        C7156n0 c7156n0 = c7130l0Mo1168a.f2911a;
        C7147m0 c7147m0 = c7130l0Mo1168a.f2912b;
        this.f1911c = c7147m0.f2956n.get();
        this.f1912d = c7147m0.f2955m.get();
        this.f1913e = c7156n0.f2995d.get();
        this.f2889g = c7147m0.f2942B.get();
        this.f2890h = c7156n0.f2999h.get();
        C7252x5 retrofitFactory = c7156n0.f2992a.f3048l.get();
        C7077f5 plaidEnvironmentStore = c7156n0.f2992a.f3049m.get();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(plaidEnvironmentStore, "plaidEnvironmentStore");
        EnumC6054c5 env = plaidEnvironmentStore.m1504b();
        Intrinsics.checkNotNullParameter(env, "env");
        int i = C7057d5.f2731a[env.ordinal()];
        String str = "https://production.plaid.com/";
        if (i != 1) {
            if (i == 2) {
                str = "https://development.plaid.com/";
            } else if (i == 3) {
                str = "https://sandbox.plaid.com/";
            }
        }
        Object objCreate = retrofitFactory.m1654a(str, new C5798A5(null, 3)).create(InterfaceC5929O7.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this.f2891i = (InterfaceC5929O7) Preconditions.checkNotNullFromProvides((InterfaceC5929O7) objCreate);
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new a(paneId, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1537a(C7122k1 c7122k1, Pane$PaneRendering pane$PaneRendering, ContinuationImpl continuationImpl) {
        C7157n1 c7157n1;
        Pane$PaneRendering pane$PaneRendering2;
        String str;
        c7122k1.getClass();
        if (continuationImpl instanceof C7157n1) {
            c7157n1 = (C7157n1) continuationImpl;
            int i = c7157n1.f3010e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7157n1.f3010e = i - Integer.MIN_VALUE;
            } else {
                c7157n1 = new C7157n1(c7122k1, continuationImpl);
            }
        }
        Object objMo1255a = c7157n1.f3008c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7157n1.f3010e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1255a);
            InterfaceC5916N3 interfaceC5916N3 = c7122k1.f2890h;
            if (interfaceC5916N3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localPaneStateStore");
                interfaceC5916N3 = null;
            }
            String str2 = c7122k1.f1909a.f1835b;
            c7157n1.f3006a = c7122k1;
            c7157n1.f3007b = pane$PaneRendering;
            c7157n1.f3010e = 1;
            objMo1255a = interfaceC5916N3.mo1255a(str2, "login_url", c7157n1);
            if (objMo1255a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pane$PaneRendering2 = (Pane$PaneRendering) c7157n1.f3006a;
            ResultKt.throwOnFailure(objMo1255a);
            str = (String) objMo1255a;
            if (str == null && str.length() != 0) {
                return new b.c(str);
            }
            String oauthStateId = pane$PaneRendering2.getHeadlessOAuth().getOauthStateId();
            Intrinsics.checkNotNullExpressionValue(oauthStateId, "getOauthStateId(...)");
            return new b.a(oauthStateId);
        }
        pane$PaneRendering = c7157n1.f3007b;
        c7122k1 = (C7122k1) c7157n1.f3006a;
        ResultKt.throwOnFailure(objMo1255a);
        String str3 = (String) objMo1255a;
        if (str3 == null || str3.length() == 0) {
            String loginUri = pane$PaneRendering.getHeadlessOAuth().getLoginUri();
            Intrinsics.checkNotNullExpressionValue(loginUri, "getLoginUri(...)");
            return new b.C49493b(loginUri);
        }
        InterfaceC7153m6 interfaceC7153m6 = c7122k1.f2889g;
        if (interfaceC7153m6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readOAuthRedirectUri");
            interfaceC7153m6 = null;
        }
        c7157n1.f3006a = pane$PaneRendering;
        c7157n1.f3007b = null;
        c7157n1.f3010e = 2;
        objMo1255a = interfaceC7153m6.mo1546a(c7157n1);
        if (objMo1255a != coroutine_suspended) {
            pane$PaneRendering2 = pane$PaneRendering;
            str = (String) objMo1255a;
            if (str == null) {
            }
            String oauthStateId2 = pane$PaneRendering2.getHeadlessOAuth().getOauthStateId();
            Intrinsics.checkNotNullExpressionValue(oauthStateId2, "getOauthStateId(...)");
            return new b.a(oauthStateId2);
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1541b(C7122k1 c7122k1, String oauthStateId, ContinuationImpl continuationImpl) {
        C7175p1 c7175p1;
        c7122k1.getClass();
        if (continuationImpl instanceof C7175p1) {
            c7175p1 = (C7175p1) continuationImpl;
            int i = c7175p1.f3096e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7175p1.f3096e = i - Integer.MIN_VALUE;
            } else {
                c7175p1 = new C7175p1(c7122k1, continuationImpl);
            }
        }
        Object obj = c7175p1.f3094c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7175p1.f3096e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            C5953R5.f1671a.getClass();
            C5953R5.a.m1303a("Poll for oAuth result", true);
            C7096h4 c7096h4 = c7122k1.f2892j;
            if (c7096h4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("oAuthPolling");
                c7096h4 = null;
            }
            c7175p1.f3092a = c7122k1;
            c7175p1.f3093b = oauthStateId;
            c7175p1.f3096e = 1;
            if (c7096h4.m1522a(c7175p1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oauthStateId = c7175p1.f3093b;
            c7122k1 = c7175p1.f3092a;
            ResultKt.throwOnFailure(obj);
        }
        Intrinsics.checkNotNullParameter(oauthStateId, "oauthStateId");
        HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.C6635b c6635bM1439a = HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.newBuilder().m1439a(HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.SubmitAction.newBuilder().m1437a(oauthStateId));
        Intrinsics.checkNotNullExpressionValue(c6635bM1439a, "submitStateId(...)");
        m1540a(c7122k1, c6635bM1439a);
        return Unit.INSTANCE;
    }

    /* renamed from: c */
    public final InterfaceC5929O7 m1545c() {
        InterfaceC5929O7 interfaceC5929O7 = this.f2891i;
        if (interfaceC5929O7 != null) {
            return interfaceC5929O7;
        }
        Intrinsics.throwUninitializedPropertyAccessException("workflowApi");
        return null;
    }

    /* renamed from: a */
    public static final C7106i4 m1536a(C7122k1 c7122k1, HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering rendering) {
        c7122k1.getClass();
        Common$PollingOptions polling = rendering.getPolling();
        Intrinsics.checkNotNullExpressionValue(polling, "getPolling(...)");
        return C7106i4.a.m1530a(polling);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1538a(C7122k1 c7122k1, String str, ContinuationImpl continuationImpl) {
        C7166o1 c7166o1;
        c7122k1.getClass();
        if (continuationImpl instanceof C7166o1) {
            c7166o1 = (C7166o1) continuationImpl;
            int i = c7166o1.f3057e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7166o1.f3057e = i - Integer.MIN_VALUE;
            } else {
                c7166o1 = new C7166o1(c7122k1, continuationImpl);
            }
        }
        Object obj = c7166o1.f3055c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7166o1.f3057e;
        InterfaceC7203s2 interfaceC7203s2 = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            C5953R5.f1671a.getClass();
            C5953R5.a.m1303a("Opening login URL", true);
            InterfaceC5916N3 interfaceC5916N3 = c7122k1.f2890h;
            if (interfaceC5916N3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localPaneStateStore");
                interfaceC5916N3 = null;
            }
            String str2 = c7122k1.f1909a.f1835b;
            c7166o1.f3053a = c7122k1;
            c7166o1.f3054b = str;
            c7166o1.f3057e = 1;
            if (interfaceC5916N3.mo1254a(str2, "login_url", str, c7166o1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c7166o1.f3054b;
            c7122k1 = c7166o1.f3053a;
            ResultKt.throwOnFailure(obj);
        }
        InterfaceC7203s2 interfaceC7203s22 = c7122k1.f1911c;
        if (interfaceC7203s22 != null) {
            interfaceC7203s2 = interfaceC7203s22;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("linkController");
        }
        interfaceC7203s2.mo1587a(str);
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public static void m1540a(C7122k1 c7122k1, HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.C6635b c6635b) {
        String paneNodeId = c7122k1.f1909a.f1836c;
        Pane$PaneOutput.C6730a actionsOutput = Pane$PaneOutput.newBuilder().m1442a(c6635b);
        Intrinsics.checkNotNullExpressionValue(actionsOutput, "setHeadlessOAuth(...)");
        Intrinsics.checkNotNullParameter(paneNodeId, "paneNodeId");
        Intrinsics.checkNotNullParameter(actionsOutput, "actionsOutput");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(c7122k1), null, null, new C6027Z7(null, c7122k1, actionsOutput, paneNodeId, null), 3, null);
    }

    /* renamed from: a */
    public final void m1544a(C7096h4 c7096h4) {
        Intrinsics.checkNotNullParameter(c7096h4, "<set-?>");
        this.f2892j = c7096h4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1543a(ContinuationImpl continuationImpl) {
        C7131l1 c7131l1;
        if (continuationImpl instanceof C7131l1) {
            c7131l1 = (C7131l1) continuationImpl;
            int i = c7131l1.f2915c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7131l1.f2915c = i - Integer.MIN_VALUE;
            } else {
                c7131l1 = new C7131l1(this, continuationImpl);
            }
        }
        Object obj = c7131l1.f2913a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7131l1.f2915c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow2<Pane$PaneRendering> sharedFlow2 = this.f2888f;
            C7148m1 c7148m1 = new C7148m1(this);
            c7131l1.f2915c = 1;
            if (sharedFlow2.collect(c7148m1, c7131l1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new ExceptionsH();
    }
}
