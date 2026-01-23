package com.plaid.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModel2;
import com.plaid.internal.C5953R5;
import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResult;
import dagger.internal.Preconditions;
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
import kotlinx.coroutines.Job;

/* renamed from: com.plaid.internal.s4 */
/* loaded from: classes16.dex */
public final class C7205s4 extends ViewModel {

    /* renamed from: a */
    public final InterfaceC7203s2 f3186a;

    /* renamed from: b */
    public final InterfaceC7198r6 f3187b;

    /* renamed from: c */
    public final InterfaceC7136l6 f3188c;

    /* renamed from: d */
    public final InterfaceC7189q6 f3189d;

    /* renamed from: e */
    public final InterfaceC7171o6 f3190e;

    /* renamed from: f */
    public final InterfaceC7080f8 f3191f;

    /* renamed from: g */
    public final InterfaceC5929O7 f3192g;

    /* renamed from: h */
    public final C7172o7 f3193h;

    /* renamed from: i */
    public final C5837F f3194i;

    /* renamed from: j */
    public Job f3195j;

    /* renamed from: k */
    public final C7196r4 f3196k;

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$onOutOfProcessClosed$1", m3645f = "OutOfProcessWebviewViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.s4$a */
    public static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f3197a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C7205s4.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return C7205s4.this.new a(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3197a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C7172o7 c7172o7M1610b = C7205s4.this.m1610b();
                this.f3197a = 1;
                if (c7172o7M1610b.m1569a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$onOutOfProcessClosed$3$1", m3645f = "OutOfProcessWebviewViewModel.kt", m3646l = {156}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.s4$b */
    public static final class b extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f3199a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C7205s4.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return C7205s4.this.new b(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3199a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C7205s4 c7205s4 = C7205s4.this;
                this.f3199a = 1;
                if (C7205s4.m1604a(c7205s4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C5837F c5837f = C7205s4.this.f3194i;
            if (c5837f == null) {
                Intrinsics.throwUninitializedPropertyAccessException("channelPolling");
                c5837f = null;
            }
            c5837f.f1342c = true;
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$onOutOfProcessOpened$1", m3645f = "OutOfProcessWebviewViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.s4$c */
    public static final class c extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f3201a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C7205s4.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return C7205s4.this.new c(continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            if (com.plaid.internal.C7205s4.m1604a(r5, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3201a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C7172o7 c7172o7M1610b = C7205s4.this.m1610b();
                this.f3201a = 1;
                if (c7172o7M1610b.m1571c(this) != coroutine_suspended) {
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
            C7205s4 c7205s4 = C7205s4.this;
            this.f3201a = 2;
        }
    }

    public C7205s4(InterfaceC5839F1 outOfProcessComponent) throws SecurityException {
        Intrinsics.checkNotNullParameter(outOfProcessComponent, "outOfProcessComponent");
        C7147m0 c7147m0 = (C7147m0) outOfProcessComponent;
        this.f3186a = c7147m0.f2956n.get();
        this.f3187b = c7147m0.f2957o.get();
        this.f3188c = c7147m0.f2962t.get();
        this.f3189d = c7147m0.f2959q.get();
        this.f3190e = c7147m0.f2968z.get();
        this.f3191f = c7147m0.f2941A.get();
        C7156n0 c7156n0 = c7147m0.f2944b;
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
        this.f3192g = (InterfaceC5929O7) Preconditions.checkNotNullFromProvides((InterfaceC5929O7) objCreate);
        this.f3193h = c7147m0.f2961s.get();
        this.f3194i = c7147m0.f2963u.get();
        this.f3196k = new C7196r4(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1604a(C7205s4 c7205s4, ContinuationImpl continuationImpl) {
        C7214t4 c7214t4;
        c7205s4.getClass();
        if (continuationImpl instanceof C7214t4) {
            c7214t4 = (C7214t4) continuationImpl;
            int i = c7214t4.f3220d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7214t4.f3220d = i - Integer.MIN_VALUE;
            } else {
                c7214t4 = new C7214t4(c7205s4, continuationImpl);
            }
        }
        Object objMo1158b = c7214t4.f3218b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7214t4.f3220d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1158b);
            InterfaceC7136l6 interfaceC7136l6 = c7205s4.f3188c;
            if (interfaceC7136l6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readChannelInfo");
                interfaceC7136l6 = null;
            }
            c7214t4.f3217a = c7205s4;
            c7214t4.f3220d = 1;
            objMo1158b = interfaceC7136l6.mo1158b(c7214t4);
            if (objMo1158b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7205s4 = c7214t4.f3217a;
            ResultKt.throwOnFailure(objMo1158b);
        }
        C5792A channelInfo = (C5792A) objMo1158b;
        if (channelInfo == null) {
            C5953R5.a.m1309e(C5953R5.f1671a, "No Out Of Process Polling Info Available");
            InterfaceC7203s2 interfaceC7203s2 = c7205s4.f3186a;
            if (interfaceC7203s2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("linkController");
                interfaceC7203s2 = null;
            }
            interfaceC7203s2.mo1586a(new LinkExit(null, null, 3, null));
            return Unit.INSTANCE;
        }
        C5837F c5837f = c7205s4.f3194i;
        if (c5837f == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channelPolling");
            c5837f = null;
        }
        CoroutineScope coroutineScope = ViewModel2.getViewModelScope(c7205s4);
        C7196r4 pollingCallback = c7205s4.f3196k;
        c5837f.getClass();
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(channelInfo, "channelInfo");
        Intrinsics.checkNotNullParameter(pollingCallback, "pollingCallback");
        c7205s4.f3195j = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C5819D(c5837f, channelInfo, pollingCallback, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1606b(C7205s4 c7205s4, ContinuationImpl continuationImpl) {
        C7223u4 c7223u4;
        c7205s4.getClass();
        if (continuationImpl instanceof C7223u4) {
            c7223u4 = (C7223u4) continuationImpl;
            int i = c7223u4.f3234d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7223u4.f3234d = i - Integer.MIN_VALUE;
            } else {
                c7223u4 = new C7223u4(c7205s4, continuationImpl);
            }
        }
        Object objMo1318a = c7223u4.f3232b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7223u4.f3234d;
        InterfaceC7171o6 interfaceC7171o6 = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1318a);
            InterfaceC7171o6 interfaceC7171o62 = c7205s4.f3190e;
            if (interfaceC7171o62 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readPreCompletionResult");
                interfaceC7171o62 = null;
            }
            c7223u4.f3231a = c7205s4;
            c7223u4.f3234d = 1;
            objMo1318a = interfaceC7171o62.mo1318a(c7223u4);
            if (objMo1318a != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LinkResult linkResult = (LinkResult) c7223u4.f3231a;
            ResultKt.throwOnFailure(objMo1318a);
            return linkResult;
        }
        c7205s4 = (C7205s4) c7223u4.f3231a;
        ResultKt.throwOnFailure(objMo1318a);
        Channel$Message.SDKResult sDKResult = (Channel$Message.SDKResult) objMo1318a;
        LinkResult linkResultM1678a = sDKResult != null ? C7271z6.m1678a(sDKResult) : null;
        InterfaceC7171o6 interfaceC7171o63 = c7205s4.f3190e;
        if (interfaceC7171o63 != null) {
            interfaceC7171o6 = interfaceC7171o63;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("readPreCompletionResult");
        }
        c7223u4.f3231a = linkResultM1678a;
        c7223u4.f3234d = 2;
        return interfaceC7171o6.mo1319b(c7223u4) == coroutine_suspended ? coroutine_suspended : linkResultM1678a;
    }

    /* renamed from: c */
    public final void m1611c() {
        Job job = this.f3195j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new c(null), 3, null);
    }

    /* renamed from: b */
    public final C7172o7 m1610b() {
        C7172o7 c7172o7 = this.f3193h;
        if (c7172o7 != null) {
            return c7172o7;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webviewFallbackAnalytics");
        return null;
    }

    /* renamed from: a */
    public static final void m1605a(C7205s4 c7205s4, LinkResult linkResult) {
        c7205s4.getClass();
        InterfaceC7203s2 interfaceC7203s2 = null;
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(c7205s4), null, null, new C7178p4(c7205s4, null), 3, null);
        InterfaceC7203s2 interfaceC7203s22 = c7205s4.f3186a;
        if (interfaceC7203s22 != null) {
            interfaceC7203s2 = interfaceC7203s22;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("linkController");
        }
        interfaceC7203s2.mo1586a(linkResult);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1607a(ContinuationImpl continuationImpl) {
        C7187q4 c7187q4;
        if (continuationImpl instanceof C7187q4) {
            c7187q4 = (C7187q4) continuationImpl;
            int i = c7187q4.f3141c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7187q4.f3141c = i - Integer.MIN_VALUE;
            } else {
                c7187q4 = new C7187q4(this, continuationImpl);
            }
        }
        Object objMo1600a = c7187q4.f3139a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7187q4.f3141c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1600a);
            InterfaceC7198r6 interfaceC7198r6 = this.f3187b;
            if (interfaceC7198r6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readWebviewFallbackUri");
                interfaceC7198r6 = null;
            }
            c7187q4.f3141c = 1;
            objMo1600a = interfaceC7198r6.mo1600a(c7187q4);
            if (objMo1600a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo1600a);
        }
        String str = (String) objMo1600a;
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public final void m1609a(boolean z) {
        C5837F c5837f = null;
        if (z) {
            BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new a(null), 3, null);
        }
        if (this.f3195j == null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new b(null), 3, null);
            return;
        }
        C5837F c5837f2 = this.f3194i;
        if (c5837f2 != null) {
            c5837f = c5837f2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("channelPolling");
        }
        c5837f.f1342c = true;
    }

    /* renamed from: a */
    public final void m1608a() {
        InterfaceC7203s2 interfaceC7203s2 = null;
        LinkExit linkExit = new LinkExit(null, null, 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C7178p4(this, null), 3, null);
        InterfaceC7203s2 interfaceC7203s22 = this.f3186a;
        if (interfaceC7203s22 != null) {
            interfaceC7203s2 = interfaceC7203s22;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("linkController");
        }
        interfaceC7203s2.mo1586a(linkExit);
    }
}
