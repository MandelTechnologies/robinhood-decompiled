package com.plaid.internal;

import com.plaid.internal.AbstractC5894L2;
import com.plaid.internal.AbstractC7207s6;
import com.plaid.internal.AbstractC7256y0;
import com.plaid.internal.C5953R5;
import com.plaid.internal.C7169o4;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationExceptions2;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.Json6;

/* renamed from: com.plaid.internal.r2 */
/* loaded from: classes16.dex */
public final class C7194r2 implements InterfaceC7203s2 {

    /* renamed from: a */
    public final C5831E2 f3146a;

    /* renamed from: b */
    public final InterfaceC6004X2 f3147b;

    /* renamed from: c */
    public final C5995W2 f3148c;

    /* renamed from: d */
    public final InterfaceC7070e8 f3149d;

    /* renamed from: e */
    public final InterfaceC7110i8 f3150e;

    /* renamed from: f */
    public final InterfaceC7060d8 f3151f;

    /* renamed from: g */
    public final InterfaceC7100h8 f3152g;

    /* renamed from: h */
    public final InterfaceC7090g8 f3153h;

    /* renamed from: i */
    public final C7265z0 f3154i;

    public C7194r2(C5831E2 navigator, InterfaceC6004X2 linkStateStore, C5995W2 linkStateReducer, InterfaceC7070e8 writeOAuthRedirectUri, InterfaceC7110i8 writeWebviewFallbackUri, InterfaceC7060d8 writeChannelInfo, InterfaceC7100h8 writeWebviewFallbackId, InterfaceC7090g8 writeWebviewBackgroundTransparencyState, C7265z0 destinationFactory) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(linkStateStore, "linkStateStore");
        Intrinsics.checkNotNullParameter(linkStateReducer, "linkStateReducer");
        Intrinsics.checkNotNullParameter(writeOAuthRedirectUri, "writeOAuthRedirectUri");
        Intrinsics.checkNotNullParameter(writeWebviewFallbackUri, "writeWebviewFallbackUri");
        Intrinsics.checkNotNullParameter(writeChannelInfo, "writeChannelInfo");
        Intrinsics.checkNotNullParameter(writeWebviewFallbackId, "writeWebviewFallbackId");
        Intrinsics.checkNotNullParameter(writeWebviewBackgroundTransparencyState, "writeWebviewBackgroundTransparencyState");
        Intrinsics.checkNotNullParameter(destinationFactory, "destinationFactory");
        this.f3146a = navigator;
        this.f3147b = linkStateStore;
        this.f3148c = linkStateReducer;
        this.f3149d = writeOAuthRedirectUri;
        this.f3150e = writeWebviewFallbackUri;
        this.f3151f = writeChannelInfo;
        this.f3152g = writeWebviewFallbackId;
        this.f3153h = writeWebviewBackgroundTransparencyState;
        this.f3154i = destinationFactory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r8.m1580a(r9, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC7203s2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1584a(Pane$PaneOutput[] pane$PaneOutputArr, ContinuationImpl continuationImpl) {
        C7149m2 c7149m2;
        Pane$PaneOutput[] pane$PaneOutputArr2;
        C5995W2 c5995w2;
        C7194r2 c7194r2;
        C7194r2 c7194r22;
        if (continuationImpl instanceof C7149m2) {
            c7149m2 = (C7149m2) continuationImpl;
            int i = c7149m2.f2979f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7149m2.f2979f = i - Integer.MIN_VALUE;
            } else {
                c7149m2 = new C7149m2(this, continuationImpl);
            }
        }
        Object objM1343a = c7149m2.f2977d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7149m2.f2979f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM1343a);
            C5995W2 c5995w22 = this.f3148c;
            InterfaceC6004X2 interfaceC6004X2 = this.f3147b;
            c7149m2.f2974a = this;
            c7149m2.f2975b = pane$PaneOutputArr;
            c7149m2.f2976c = c5995w22;
            c7149m2.f2979f = 1;
            Object objMo1351a = interfaceC6004X2.mo1351a(c7149m2);
            if (objMo1351a != coroutine_suspended) {
                pane$PaneOutputArr2 = pane$PaneOutputArr;
                c5995w2 = c5995w22;
                objM1343a = objMo1351a;
                c7194r2 = this;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            c5995w2 = c7149m2.f2976c;
            pane$PaneOutputArr2 = c7149m2.f2975b;
            c7194r2 = c7149m2.f2974a;
            ResultKt.throwOnFailure(objM1343a);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM1343a);
                return Unit.INSTANCE;
            }
            c7194r22 = c7149m2.f2974a;
            ResultKt.throwOnFailure(objM1343a);
            AbstractC5894L2 abstractC5894L2 = (AbstractC5894L2) objM1343a;
            C5953R5.a.m1299a(C5953R5.f1671a, "Next " + abstractC5894L2);
            c7149m2.f2974a = null;
            c7149m2.f2979f = 3;
        }
        List list = ArraysKt.toList(pane$PaneOutputArr2);
        c7149m2.f2974a = c7194r2;
        c7149m2.f2975b = null;
        c7149m2.f2976c = null;
        c7149m2.f2979f = 2;
        objM1343a = c5995w2.m1343a((AbstractC5894L2) objM1343a, list, c7149m2);
        if (objM1343a != coroutine_suspended) {
            c7194r22 = c7194r2;
            AbstractC5894L2 abstractC5894L22 = (AbstractC5894L2) objM1343a;
            C5953R5.a.m1299a(C5953R5.f1671a, "Next " + abstractC5894L22);
            c7149m2.f2974a = null;
            c7149m2.f2979f = 3;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (r2.m1580a(r9, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC7203s2
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1588b(ContinuationImpl continuationImpl) {
        C7176p2 c7176p2;
        C7194r2 c7194r2;
        if (continuationImpl instanceof C7176p2) {
            c7176p2 = (C7176p2) continuationImpl;
            int i = c7176p2.f3100d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7176p2.f3100d = i - Integer.MIN_VALUE;
            } else {
                c7176p2 = new C7176p2(this, continuationImpl);
            }
        }
        Object objMo1351a = c7176p2.f3098b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7176p2.f3100d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1351a);
            InterfaceC6004X2 interfaceC6004X2 = this.f3147b;
            c7176p2.f3097a = this;
            c7176p2.f3100d = 1;
            objMo1351a = interfaceC6004X2.mo1351a(c7176p2);
            if (objMo1351a != coroutine_suspended) {
                c7194r2 = this;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            c7194r2 = c7176p2.f3097a;
            ResultKt.throwOnFailure(objMo1351a);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMo1351a);
                return Unit.INSTANCE;
            }
            c7194r2 = c7176p2.f3097a;
            ResultKt.throwOnFailure(objMo1351a);
            AbstractC5894L2 abstractC5894L2 = (AbstractC5894L2) objMo1351a;
            C5953R5.a.m1299a(C5953R5.f1671a, "Start next " + abstractC5894L2);
            c7176p2.f3097a = null;
            c7176p2.f3100d = 3;
        }
        AbstractC5894L2 abstractC5894L22 = (AbstractC5894L2) objMo1351a;
        C5953R5.a.m1299a(C5953R5.f1671a, "Start from " + abstractC5894L22);
        C5995W2 c5995w2 = c7194r2.f3148c;
        c7176p2.f3097a = c7194r2;
        c7176p2.f3100d = 2;
        objMo1351a = c5995w2.m1345a(abstractC5894L22, false, (ContinuationImpl) c7176p2);
        if (objMo1351a != coroutine_suspended) {
            AbstractC5894L2 abstractC5894L23 = (AbstractC5894L2) objMo1351a;
            C5953R5.a.m1299a(C5953R5.f1671a, "Start next " + abstractC5894L23);
            c7176p2.f3097a = null;
            c7176p2.f3100d = 3;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r2.m1580a(r9, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC7203s2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1583a(ContinuationImpl continuationImpl) {
        C7158n2 c7158n2;
        C5995W2 c5995w2;
        C7194r2 c7194r2;
        C7194r2 c7194r22;
        if (continuationImpl instanceof C7158n2) {
            c7158n2 = (C7158n2) continuationImpl;
            int i = c7158n2.f3015e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7158n2.f3015e = i - Integer.MIN_VALUE;
            } else {
                c7158n2 = new C7158n2(this, continuationImpl);
            }
        }
        Object objMo1351a = c7158n2.f3013c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7158n2.f3015e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1351a);
            c5995w2 = this.f3148c;
            InterfaceC6004X2 interfaceC6004X2 = this.f3147b;
            c7158n2.f3011a = this;
            c7158n2.f3012b = c5995w2;
            c7158n2.f3015e = 1;
            objMo1351a = interfaceC6004X2.mo1351a(c7158n2);
            if (objMo1351a != coroutine_suspended) {
                c7194r2 = this;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            c5995w2 = c7158n2.f3012b;
            c7194r2 = c7158n2.f3011a;
            ResultKt.throwOnFailure(objMo1351a);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMo1351a);
                return Unit.INSTANCE;
            }
            c7194r22 = c7158n2.f3011a;
            ResultKt.throwOnFailure(objMo1351a);
            AbstractC5894L2 abstractC5894L2 = (AbstractC5894L2) objMo1351a;
            C5953R5.a.m1299a(C5953R5.f1671a, "Previous " + abstractC5894L2);
            c7158n2.f3011a = null;
            c7158n2.f3015e = 3;
        }
        c7158n2.f3011a = c7194r2;
        c7158n2.f3012b = null;
        c7158n2.f3015e = 2;
        objMo1351a = c5995w2.m1348b((AbstractC5894L2) objMo1351a, c7158n2);
        if (objMo1351a != coroutine_suspended) {
            c7194r22 = c7194r2;
            AbstractC5894L2 abstractC5894L22 = (AbstractC5894L2) objMo1351a;
            C5953R5.a.m1299a(C5953R5.f1671a, "Previous " + abstractC5894L22);
            c7158n2.f3011a = null;
            c7158n2.f3015e = 3;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        if (r12.m1580a(r13, r0) != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7 A[PHI: r12 r13
      0x00b7: PHI (r12v7 com.plaid.internal.r2) = (r12v4 com.plaid.internal.r2), (r12v12 com.plaid.internal.r2) binds: [B:33:0x00b4, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r13v9 java.lang.Object) = (r13v7 java.lang.Object), (r13v1 java.lang.Object) binds: [B:33:0x00b4, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.plaid.internal.InterfaceC7203s2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1581a(AbstractC7207s6 abstractC7207s6, ContinuationImpl continuationImpl) {
        C7167o2 c7167o2;
        C7194r2 c7194r2;
        AbstractC5894L2 abstractC5894L2;
        AbstractC7207s6 abstractC7207s62;
        C7194r2 c7194r22;
        C7194r2 c7194r23;
        AbstractC5894L2 abstractC5894L22;
        if (continuationImpl instanceof C7167o2) {
            c7167o2 = (C7167o2) continuationImpl;
            int i = c7167o2.f3063f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7167o2.f3063f = i - Integer.MIN_VALUE;
            } else {
                c7167o2 = new C7167o2(this, continuationImpl);
            }
        }
        Object objMo1351a = c7167o2.f3061d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7167o2.f3063f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1351a);
            InterfaceC6004X2 interfaceC6004X2 = this.f3147b;
            c7167o2.f3058a = this;
            c7167o2.f3059b = abstractC7207s6;
            c7167o2.f3063f = 1;
            objMo1351a = interfaceC6004X2.mo1351a(c7167o2);
            if (objMo1351a != coroutine_suspended) {
                c7194r2 = this;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            abstractC7207s6 = c7167o2.f3059b;
            c7194r2 = c7167o2.f3058a;
            ResultKt.throwOnFailure(objMo1351a);
        } else {
            if (i2 == 2) {
                abstractC5894L22 = c7167o2.f3060c;
                abstractC7207s62 = c7167o2.f3059b;
                c7194r23 = c7167o2.f3058a;
                ResultKt.throwOnFailure(objMo1351a);
                abstractC5894L2 = abstractC5894L22;
                c7194r22 = c7194r23;
                C5995W2 c5995w2 = c7194r22.f3148c;
                c7167o2.f3058a = c7194r22;
                c7167o2.f3059b = null;
                c7167o2.f3060c = null;
                c7167o2.f3063f = 3;
                objMo1351a = c5995w2.m1342a(abstractC5894L2, abstractC7207s62, c7167o2);
                if (objMo1351a != coroutine_suspended) {
                    AbstractC5894L2 abstractC5894L23 = (AbstractC5894L2) objMo1351a;
                    C5953R5.a.m1299a(C5953R5.f1671a, "Resume next " + abstractC5894L23);
                    c7167o2.f3058a = null;
                    c7167o2.f3063f = 4;
                }
                return coroutine_suspended;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMo1351a);
                return Unit.INSTANCE;
            }
            c7194r22 = c7167o2.f3058a;
            ResultKt.throwOnFailure(objMo1351a);
            AbstractC5894L2 abstractC5894L232 = (AbstractC5894L2) objMo1351a;
            C5953R5.a.m1299a(C5953R5.f1671a, "Resume next " + abstractC5894L232);
            c7167o2.f3058a = null;
            c7167o2.f3063f = 4;
        }
        abstractC5894L2 = (AbstractC5894L2) objMo1351a;
        C5953R5.a.m1299a(C5953R5.f1671a, "Resume from " + abstractC5894L2);
        if (abstractC7207s6 instanceof AbstractC7207s6.a) {
            InterfaceC7070e8 interfaceC7070e8 = c7194r2.f3149d;
            String strM1612a = ((AbstractC7207s6.a) abstractC7207s6).m1612a();
            c7167o2.f3058a = c7194r2;
            c7167o2.f3059b = abstractC7207s6;
            c7167o2.f3060c = abstractC5894L2;
            c7167o2.f3063f = 2;
            if (interfaceC7070e8.mo1499a(strM1612a, c7167o2) != coroutine_suspended) {
                c7194r23 = c7194r2;
                abstractC7207s62 = abstractC7207s6;
                abstractC5894L22 = abstractC5894L2;
                abstractC5894L2 = abstractC5894L22;
                c7194r22 = c7194r23;
                C5995W2 c5995w22 = c7194r22.f3148c;
                c7167o2.f3058a = c7194r22;
                c7167o2.f3059b = null;
                c7167o2.f3060c = null;
                c7167o2.f3063f = 3;
                objMo1351a = c5995w22.m1342a(abstractC5894L2, abstractC7207s62, c7167o2);
                if (objMo1351a != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        C7194r2 c7194r24 = c7194r2;
        abstractC7207s62 = abstractC7207s6;
        c7194r22 = c7194r24;
        C5995W2 c5995w222 = c7194r22.f3148c;
        c7167o2.f3058a = c7194r22;
        c7167o2.f3059b = null;
        c7167o2.f3060c = null;
        c7167o2.f3063f = 3;
        objMo1351a = c5995w222.m1342a(abstractC5894L2, abstractC7207s62, c7167o2);
        if (objMo1351a != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    @Override // com.plaid.internal.InterfaceC7203s2
    /* renamed from: a */
    public final void mo1586a(LinkResult linkResult) {
        AbstractC7256y0 destination;
        Intrinsics.checkNotNullParameter(linkResult, "linkResult");
        C5831E2 c5831e2 = this.f3146a;
        if (linkResult instanceof LinkSuccess) {
            destination = new AbstractC7256y0.j((LinkSuccess) linkResult);
        } else {
            if (!(linkResult instanceof LinkExit)) {
                throw new IllegalArgumentException("Link result is not a valid result of LinkSuccess or LinkExit");
            }
            destination = new AbstractC7256y0.d((LinkExit) linkResult);
        }
        c5831e2.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        c5831e2.f1338a.postValue(destination);
    }

    @Override // com.plaid.internal.InterfaceC7203s2
    /* renamed from: a */
    public final void mo1587a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        C5831E2 c5831e2 = this.f3146a;
        AbstractC7256y0.f destination = new AbstractC7256y0.f(url);
        c5831e2.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        c5831e2.f1338a.postValue(destination);
    }

    @Override // com.plaid.internal.InterfaceC7203s2
    /* renamed from: a */
    public final void mo1585a(AbstractC7134l4 openMethod) {
        Intrinsics.checkNotNullParameter(openMethod, "openMethod");
        C5831E2 c5831e2 = this.f3146a;
        AbstractC7256y0.g destination = new AbstractC7256y0.g(openMethod);
        c5831e2.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        c5831e2.f1338a.postValue(destination);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.plaid.internal.InterfaceC7203s2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1582a(LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        C7123k2 c7123k2;
        if (continuationImpl instanceof C7123k2) {
            c7123k2 = (C7123k2) continuationImpl;
            int i = c7123k2.f2901c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7123k2.f2901c = i - Integer.MIN_VALUE;
            } else {
                c7123k2 = new C7123k2(this, continuationImpl);
            }
        }
        Object obj = c7123k2.f2899a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7123k2.f2901c;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Json jsonJson$default = Json6.Json$default(null, C7132l2.f2916a, 1, null);
                String str = (String) linkedHashMap.get("webview");
                if (str == null) {
                    str = "";
                }
                C7169o4 c7169o4 = (C7169o4) jsonJson$default.decodeFromString(C7169o4.a.f3074a, str);
                String str2 = "";
                String str3 = "";
                String str4 = "";
                String str5 = "";
                AbstractC5894L2 kVar = new AbstractC5894L2.k(str2, str3, str4, str5, c7169o4.f3071b, c7169o4.f3072c, c7169o4.f3073d, false, null, 1152);
                c7123k2.f2901c = 1;
                if (m1580a(kVar, c7123k2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (SerializationExceptions2 unused) {
            C5876J2.m1228b(new C6020Z0("Failed to parse webview json"), null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c4, code lost:
    
        if (r4.mo1155a(r9, r0) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107 A[PHI: r2 r8
      0x0107: PHI (r2v22 com.plaid.internal.r2) = (r2v19 com.plaid.internal.r2), (r2v25 com.plaid.internal.r2) binds: [B:48:0x0104, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r8v12 com.plaid.internal.L2) = (r8v10 com.plaid.internal.L2), (r8v15 com.plaid.internal.L2) binds: [B:48:0x0104, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1580a(AbstractC5894L2 abstractC5894L2, ContinuationImpl continuationImpl) {
        C7185q2 c7185q2;
        C7194r2 c7194r2;
        AbstractC5894L2.k kVar;
        C5792A c5792a;
        Unit unit;
        AbstractC5894L2.k kVar2;
        InterfaceC6004X2 interfaceC6004X2;
        Object objM1675a;
        C5831E2 c5831e2;
        if (continuationImpl instanceof C7185q2) {
            c7185q2 = (C7185q2) continuationImpl;
            int i = c7185q2.f3130e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7185q2.f3130e = i - Integer.MIN_VALUE;
            } else {
                c7185q2 = new C7185q2(this, continuationImpl);
            }
        }
        Object obj = c7185q2.f3128c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c7185q2.f3130e) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (abstractC5894L2 instanceof AbstractC5894L2.k) {
                    InterfaceC7110i8 interfaceC7110i8 = this.f3150e;
                    String str = ((AbstractC5894L2.k) abstractC5894L2).f1500f;
                    c7185q2.f3126a = this;
                    c7185q2.f3127b = abstractC5894L2;
                    c7185q2.f3130e = 1;
                    if (interfaceC7110i8.mo1533a(str, c7185q2) != coroutine_suspended) {
                        c7194r2 = this;
                        kVar = (AbstractC5894L2.k) abstractC5894L2;
                        if (kVar.f1501g.length() > 0) {
                            InterfaceC7100h8 interfaceC7100h8 = c7194r2.f3152g;
                            String str2 = kVar.f1501g;
                            c7185q2.f3126a = c7194r2;
                            c7185q2.f3127b = abstractC5894L2;
                            c7185q2.f3130e = 2;
                            if (interfaceC7100h8.mo1525a(str2, c7185q2) != coroutine_suspended) {
                            }
                        }
                        c5792a = ((AbstractC5894L2.k) abstractC5894L2).f1502h;
                        if (c5792a != null) {
                            InterfaceC7060d8 interfaceC7060d8 = c7194r2.f3151f;
                            c7185q2.f3126a = c7194r2;
                            c7185q2.f3127b = abstractC5894L2;
                            c7185q2.f3130e = 3;
                            break;
                        } else {
                            unit = null;
                            if (unit == null) {
                                InterfaceC7060d8 interfaceC7060d82 = c7194r2.f3151f;
                                c7185q2.f3126a = c7194r2;
                                c7185q2.f3127b = abstractC5894L2;
                                c7185q2.f3130e = 4;
                                if (interfaceC7060d82.mo1156a(c7185q2) != coroutine_suspended) {
                                }
                            }
                            kVar2 = (AbstractC5894L2.k) abstractC5894L2;
                            if (!kVar2.f1504j) {
                                InterfaceC7090g8 interfaceC7090g8 = c7194r2.f3153h;
                                boolean z = kVar2.f1503i;
                                c7185q2.f3126a = c7194r2;
                                c7185q2.f3127b = abstractC5894L2;
                                c7185q2.f3130e = 5;
                                if (interfaceC7090g8.mo1516a(z, c7185q2) != coroutine_suspended) {
                                }
                            }
                            interfaceC6004X2 = c7194r2.f3147b;
                            c7185q2.f3126a = c7194r2;
                            c7185q2.f3127b = abstractC5894L2;
                            c7185q2.f3130e = 6;
                            if (interfaceC6004X2.mo1350a(abstractC5894L2, c7185q2) != coroutine_suspended) {
                                C5831E2 c5831e22 = c7194r2.f3146a;
                                C7265z0 c7265z0 = c7194r2.f3154i;
                                c7185q2.f3126a = c5831e22;
                                c7185q2.f3127b = null;
                                c7185q2.f3130e = 7;
                                objM1675a = c7265z0.m1675a(abstractC5894L2, c7185q2);
                                if (objM1675a != coroutine_suspended) {
                                    obj = objM1675a;
                                    c5831e2 = c5831e22;
                                    AbstractC7256y0 destination = (AbstractC7256y0) obj;
                                    c5831e2.getClass();
                                    Intrinsics.checkNotNullParameter(destination, "destination");
                                    c5831e2.f1338a.postValue(destination);
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                c7194r2 = this;
                interfaceC6004X2 = c7194r2.f3147b;
                c7185q2.f3126a = c7194r2;
                c7185q2.f3127b = abstractC5894L2;
                c7185q2.f3130e = 6;
                if (interfaceC6004X2.mo1350a(abstractC5894L2, c7185q2) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 1:
                abstractC5894L2 = c7185q2.f3127b;
                c7194r2 = (C7194r2) c7185q2.f3126a;
                ResultKt.throwOnFailure(obj);
                kVar = (AbstractC5894L2.k) abstractC5894L2;
                if (kVar.f1501g.length() > 0) {
                }
                c5792a = ((AbstractC5894L2.k) abstractC5894L2).f1502h;
                if (c5792a != null) {
                }
                break;
            case 2:
                abstractC5894L2 = c7185q2.f3127b;
                c7194r2 = (C7194r2) c7185q2.f3126a;
                ResultKt.throwOnFailure(obj);
                c5792a = ((AbstractC5894L2.k) abstractC5894L2).f1502h;
                if (c5792a != null) {
                }
                break;
            case 3:
                abstractC5894L2 = c7185q2.f3127b;
                c7194r2 = (C7194r2) c7185q2.f3126a;
                ResultKt.throwOnFailure(obj);
                unit = Unit.INSTANCE;
                if (unit == null) {
                }
                kVar2 = (AbstractC5894L2.k) abstractC5894L2;
                if (!kVar2.f1504j) {
                }
                interfaceC6004X2 = c7194r2.f3147b;
                c7185q2.f3126a = c7194r2;
                c7185q2.f3127b = abstractC5894L2;
                c7185q2.f3130e = 6;
                if (interfaceC6004X2.mo1350a(abstractC5894L2, c7185q2) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 4:
                abstractC5894L2 = c7185q2.f3127b;
                c7194r2 = (C7194r2) c7185q2.f3126a;
                ResultKt.throwOnFailure(obj);
                kVar2 = (AbstractC5894L2.k) abstractC5894L2;
                if (!kVar2.f1504j) {
                }
                interfaceC6004X2 = c7194r2.f3147b;
                c7185q2.f3126a = c7194r2;
                c7185q2.f3127b = abstractC5894L2;
                c7185q2.f3130e = 6;
                if (interfaceC6004X2.mo1350a(abstractC5894L2, c7185q2) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 5:
                abstractC5894L2 = c7185q2.f3127b;
                c7194r2 = (C7194r2) c7185q2.f3126a;
                ResultKt.throwOnFailure(obj);
                interfaceC6004X2 = c7194r2.f3147b;
                c7185q2.f3126a = c7194r2;
                c7185q2.f3127b = abstractC5894L2;
                c7185q2.f3130e = 6;
                if (interfaceC6004X2.mo1350a(abstractC5894L2, c7185q2) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 6:
                abstractC5894L2 = c7185q2.f3127b;
                c7194r2 = (C7194r2) c7185q2.f3126a;
                ResultKt.throwOnFailure(obj);
                C5831E2 c5831e222 = c7194r2.f3146a;
                C7265z0 c7265z02 = c7194r2.f3154i;
                c7185q2.f3126a = c5831e222;
                c7185q2.f3127b = null;
                c7185q2.f3130e = 7;
                objM1675a = c7265z02.m1675a(abstractC5894L2, c7185q2);
                if (objM1675a != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 7:
                c5831e2 = (C5831E2) c7185q2.f3126a;
                ResultKt.throwOnFailure(obj);
                AbstractC7256y0 destination2 = (AbstractC7256y0) obj;
                c5831e2.getClass();
                Intrinsics.checkNotNullParameter(destination2, "destination");
                c5831e2.f1338a.postValue(destination2);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
