package com.plaid.internal;

import com.google.gson.internal.LinkedTreeMap;
import com.plaid.internal.AbstractC5849G2;
import com.plaid.internal.AbstractC5894L2;
import com.plaid.internal.AbstractC6043b4;
import com.plaid.internal.AbstractC7207s6;
import com.plaid.internal.C5953R5;
import com.plaid.internal.C6009X7;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC6898Z;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC6902b0;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC6926n0;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.protos.link.workflow.primitives.EnumC7026f;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkExitMetadataStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope3;
import kotlinx.coroutines.Dispatchers;

@SourceDebugExtension
/* renamed from: com.plaid.internal.W2 */
/* loaded from: classes16.dex */
public final class C5995W2 {

    /* renamed from: a */
    public final InterfaceC5929O7 f1794a;

    /* renamed from: b */
    public final InterfaceC5833E4 f1795b;

    /* renamed from: c */
    public final C7195r3 f1796c;

    /* renamed from: d */
    public final C7268z3 f1797d;

    /* renamed from: e */
    public final C5973T7 f1798e;

    /* renamed from: f */
    public final InterfaceC7070e8 f1799f;

    public C5995W2(InterfaceC5929O7 api, InterfaceC5833E4 paneStore, C7195r3 linkWorkflowAnalytics, C7268z3 localErrorFactory, C5973T7 requestFactory, InterfaceC7070e8 writeOAuthRedirectUri) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(paneStore, "paneStore");
        Intrinsics.checkNotNullParameter(linkWorkflowAnalytics, "linkWorkflowAnalytics");
        Intrinsics.checkNotNullParameter(localErrorFactory, "localErrorFactory");
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        Intrinsics.checkNotNullParameter(writeOAuthRedirectUri, "writeOAuthRedirectUri");
        this.f1794a = api;
        this.f1795b = paneStore;
        this.f1796c = linkWorkflowAnalytics;
        this.f1797d = localErrorFactory;
        this.f1798e = requestFactory;
        this.f1799f = writeOAuthRedirectUri;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1345a(AbstractC5894L2 abstractC5894L2, boolean z, ContinuationImpl continuationImpl) {
        C5986V2 c5986v2;
        C5995W2 c5995w2;
        C5995W2 c5995w22;
        C5995W2 c5995w23;
        Object objM1346a;
        Object objM1346a2;
        if (continuationImpl instanceof C5986V2) {
            c5986v2 = (C5986V2) continuationImpl;
            int i = c5986v2.f1766f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5986v2.f1766f = i - Integer.MIN_VALUE;
            } else {
                c5986v2 = new C5986V2(this, continuationImpl);
            }
        }
        C5986V2 c5986v22 = c5986v2;
        Object objMo1566a = c5986v22.f1764d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5986v22.f1766f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1566a);
            if (abstractC5894L2 instanceof AbstractC5894L2.a) {
                InterfaceC7070e8 interfaceC7070e8 = this.f1799f;
                c5986v22.f1761a = this;
                c5986v22.f1762b = abstractC5894L2;
                c5986v22.f1766f = 1;
                if (interfaceC7070e8.mo1498a(c5986v22) != coroutine_suspended) {
                    c5995w23 = this;
                    c5995w23.f1796c.m1595b();
                    Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestM1323a = c5995w23.f1798e.m1323a((AbstractC5894L2.a) abstractC5894L2);
                    String strMo1235h = abstractC5894L2.mo1235h();
                    String strMo1234g = abstractC5894L2.mo1234g();
                    c5986v22.f1761a = null;
                    c5986v22.f1762b = null;
                    c5986v22.f1766f = 2;
                    objM1346a = c5995w23.m1346a(workflow$LinkWorkflowStartRequestM1323a, strMo1235h, strMo1234g, "", c5986v22);
                    if (objM1346a == coroutine_suspended) {
                    }
                }
            } else if (abstractC5894L2 instanceof AbstractC5894L2.b) {
                InterfaceC7070e8 interfaceC7070e82 = this.f1799f;
                c5986v22.f1761a = this;
                c5986v22.f1762b = abstractC5894L2;
                c5986v22.f1763c = z;
                c5986v22.f1766f = 3;
                if (interfaceC7070e82.mo1498a(c5986v22) != coroutine_suspended) {
                    c5995w22 = this;
                    c5995w22.f1796c.m1595b();
                    Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestM1324a = c5995w22.f1798e.m1324a((AbstractC5894L2.b) abstractC5894L2, z);
                    String strMo1235h2 = abstractC5894L2.mo1235h();
                    String strMo1234g2 = abstractC5894L2.mo1234g();
                    String strMo1236a = ((AbstractC5894L2.b) abstractC5894L2).mo1236a();
                    c5986v22.f1761a = null;
                    c5986v22.f1762b = null;
                    c5986v22.f1766f = 4;
                    objM1346a2 = c5995w22.m1346a(workflow$LinkWorkflowStartRequestM1324a, strMo1235h2, strMo1234g2, strMo1236a, c5986v22);
                    if (objM1346a2 == coroutine_suspended) {
                    }
                }
            } else {
                if (!(abstractC5894L2 instanceof AbstractC5894L2.l)) {
                    if (abstractC5894L2 instanceof AbstractC5894L2.i) {
                        return abstractC5894L2;
                    }
                    if (abstractC5894L2 instanceof AbstractC5894L2.j) {
                        return this.f1797d.m1676a();
                    }
                    if (abstractC5894L2 instanceof AbstractC5894L2.k) {
                        return abstractC5894L2;
                    }
                    return m1340a(C5906M2.m1253a(abstractC5894L2), abstractC5894L2.mo1235h(), new Throwable("Should not call workflow.start with state: " + abstractC5894L2), "", CollectionsKt.emptyList());
                }
                InterfaceC5833E4 interfaceC5833E4 = this.f1795b;
                C6009X7 c6009x7M1233f = abstractC5894L2.m1233f();
                c5986v22.f1761a = this;
                c5986v22.f1762b = abstractC5894L2;
                c5986v22.f1766f = 5;
                objMo1566a = interfaceC5833E4.mo1566a(c6009x7M1233f, c5986v22);
                if (objMo1566a != coroutine_suspended) {
                    c5995w2 = this;
                    if (((Pane$PaneRendering) objMo1566a) != null) {
                    }
                }
            }
        } else if (i2 == 1) {
            abstractC5894L2 = c5986v22.f1762b;
            C5995W2 c5995w24 = c5986v22.f1761a;
            ResultKt.throwOnFailure(objMo1566a);
            c5995w23 = c5995w24;
            c5995w23.f1796c.m1595b();
            Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestM1323a2 = c5995w23.f1798e.m1323a((AbstractC5894L2.a) abstractC5894L2);
            String strMo1235h3 = abstractC5894L2.mo1235h();
            String strMo1234g3 = abstractC5894L2.mo1234g();
            c5986v22.f1761a = null;
            c5986v22.f1762b = null;
            c5986v22.f1766f = 2;
            objM1346a = c5995w23.m1346a(workflow$LinkWorkflowStartRequestM1323a2, strMo1235h3, strMo1234g3, "", c5986v22);
            if (objM1346a == coroutine_suspended) {
                return objM1346a;
            }
        } else {
            if (i2 == 2) {
                ResultKt.throwOnFailure(objMo1566a);
                return objMo1566a;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    ResultKt.throwOnFailure(objMo1566a);
                    return objMo1566a;
                }
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC5894L2 = c5986v22.f1762b;
                C5995W2 c5995w25 = c5986v22.f1761a;
                ResultKt.throwOnFailure(objMo1566a);
                c5995w2 = c5995w25;
                return ((Pane$PaneRendering) objMo1566a) != null ? c5995w2.m1340a(((AbstractC5894L2.l) abstractC5894L2).mo1237c(), abstractC5894L2.mo1235h(), new Throwable("Current pane is null"), ((AbstractC5894L2.l) abstractC5894L2).mo1240b(), CollectionsKt.emptyList()) : abstractC5894L2;
            }
            z = c5986v22.f1763c;
            abstractC5894L2 = c5986v22.f1762b;
            c5995w22 = c5986v22.f1761a;
            ResultKt.throwOnFailure(objMo1566a);
            c5995w22.f1796c.m1595b();
            Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestM1324a2 = c5995w22.f1798e.m1324a((AbstractC5894L2.b) abstractC5894L2, z);
            String strMo1235h22 = abstractC5894L2.mo1235h();
            String strMo1234g22 = abstractC5894L2.mo1234g();
            String strMo1236a2 = ((AbstractC5894L2.b) abstractC5894L2).mo1236a();
            c5986v22.f1761a = null;
            c5986v22.f1762b = null;
            c5986v22.f1766f = 4;
            objM1346a2 = c5995w22.m1346a(workflow$LinkWorkflowStartRequestM1324a2, strMo1235h22, strMo1234g22, strMo1236a2, c5986v22);
            if (objM1346a2 == coroutine_suspended) {
                return objM1346a2;
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0120, code lost:
    
        if (r2 == r4) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0192  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.plaid.internal.L2] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.plaid.internal.L2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0120 -> B:19:0x0050). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1348b(AbstractC5894L2 abstractC5894L2, ContinuationImpl continuationImpl) {
        C5968T2 c5968t2;
        C6009X7 c6009x7Mo1242e;
        Object objMo1566a;
        C5995W2 c5995w2;
        AbstractC5894L2 abstractC5894L22;
        List mutableList;
        C6009X7 c6009x7;
        C5995W2 c5995w22;
        AbstractC5894L2 abstractC5894L23;
        Pane$Navigation navigation;
        ?? r1 = abstractC5894L2;
        if (continuationImpl instanceof C5968T2) {
            c5968t2 = (C5968T2) continuationImpl;
            int i = c5968t2.f1713h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5968t2.f1713h = i - Integer.MIN_VALUE;
            } else {
                c5968t2 = new C5968T2(this, continuationImpl);
            }
        }
        Object objMo1566a2 = c5968t2.f1711f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5968t2.f1713h;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1566a2);
            if (r1 instanceof AbstractC5894L2.i) {
                return m1337a((AbstractC5894L2.i) r1);
            }
            if (!(r1 instanceof AbstractC5894L2.f)) {
                String strMo1237c = r1 instanceof AbstractC5894L2.h ? ((AbstractC5894L2.h) r1).mo1237c() : null;
                return new AbstractC5894L2.e(r1.mo1235h(), new LinkExit(null, new LinkExitMetadata(LinkExitMetadataStatus.REQUIRES_CREDENTIALS.INSTANCE, null, r1.mo1234g(), strMo1237c, C5876J2.m1226a(r1.mo1234g(), strMo1237c != null ? strMo1237c : ""))));
            }
            c6009x7Mo1242e = ((AbstractC5894L2.f) r1).mo1242e();
            InterfaceC5833E4 interfaceC5833E4 = this.f1795b;
            c5968t2.f1706a = this;
            c5968t2.f1707b = r1;
            c5968t2.f1708c = c6009x7Mo1242e;
            c5968t2.f1713h = 1;
            objMo1566a = interfaceC5833E4.mo1566a(c6009x7Mo1242e, c5968t2);
            if (objMo1566a != coroutine_suspended) {
                c5995w2 = this;
                abstractC5894L22 = r1;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.throwOnFailure(objMo1566a2);
                return objMo1566a2;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMo1566a2);
                return objMo1566a2;
            }
            C6009X7 c6009x72 = c5968t2.f1710e;
            mutableList = c5968t2.f1709d;
            c6009x7 = c5968t2.f1708c;
            AbstractC5894L2 abstractC5894L24 = c5968t2.f1707b;
            C5995W2 c5995w23 = c5968t2.f1706a;
            ResultKt.throwOnFailure(objMo1566a2);
            AbstractC5894L2.h hVar = abstractC5894L24;
            C5995W2 c5995w24 = c5995w23;
            List list = mutableList;
            Pane$PaneRendering pane$PaneRendering = (Pane$PaneRendering) objMo1566a2;
            if (pane$PaneRendering != null) {
                Pane$Navigation navigation2 = pane$PaneRendering.getNavigation();
                EnumC6926n0 backStackBehavior = navigation2 != null ? navigation2.getBackStackBehavior() : null;
                if (backStackBehavior == null) {
                    backStackBehavior = EnumC6926n0.BACK_STACK_BEHAVIOR_UNKNOWN;
                }
                if (backStackBehavior == EnumC6926n0.BACK_STACK_BEHAVIOR_PERSISTENT) {
                    c5995w24.f1796c.m1593a(c6009x7, c6009x72);
                    return new AbstractC5894L2.l(hVar.mo1234g(), hVar.mo1235h(), hVar.mo1240b(), hVar instanceof AbstractC5894L2.g ? ((AbstractC5894L2.g) hVar).mo1236a() : "", c6009x72, CollectionsKt.emptyList(), list, hVar instanceof AbstractC5894L2.h ? hVar.mo1237c() : "");
                }
            } else {
                C5953R5.a.m1309e(C5953R5.f1671a, "Could not find pane for workflowId: " + c6009x72);
            }
            mutableList = list;
            abstractC5894L23 = hVar;
            c5995w22 = c5995w24;
            if (mutableList.isEmpty()) {
                c6009x72 = (C6009X7) mutableList.remove(mutableList.size() - 1);
                InterfaceC5833E4 interfaceC5833E42 = c5995w22.f1795b;
                c5968t2.f1706a = c5995w22;
                c5968t2.f1707b = abstractC5894L23;
                c5968t2.f1708c = c6009x7;
                c5968t2.f1709d = mutableList;
                c5968t2.f1710e = c6009x72;
                c5968t2.f1713h = 3;
                objMo1566a2 = interfaceC5833E42.mo1566a(c6009x72, c5968t2);
                hVar = abstractC5894L23;
                c5995w24 = c5995w22;
            } else {
                c5995w22.f1796c.m1593a(c6009x7, (C6009X7) null);
                c5968t2.f1706a = null;
                c5968t2.f1707b = null;
                c5968t2.f1708c = null;
                c5968t2.f1709d = null;
                c5968t2.f1710e = null;
                c5968t2.f1713h = 4;
                Object objM1344a = c5995w22.m1344a(abstractC5894L23, c5968t2);
                if (objM1344a != coroutine_suspended) {
                    return objM1344a;
                }
            }
        }
        C6009X7 c6009x73 = c5968t2.f1708c;
        AbstractC5894L2 abstractC5894L25 = c5968t2.f1707b;
        C5995W2 c5995w25 = c5968t2.f1706a;
        ResultKt.throwOnFailure(objMo1566a2);
        c6009x7Mo1242e = c6009x73;
        abstractC5894L22 = abstractC5894L25;
        objMo1566a = objMo1566a2;
        c5995w2 = c5995w25;
        Pane$PaneRendering pane$PaneRendering2 = (Pane$PaneRendering) objMo1566a;
        if (pane$PaneRendering2 == null || (navigation = pane$PaneRendering2.getNavigation()) == null || navigation.getBackVisible()) {
            mutableList = CollectionsKt.toMutableList((Collection) ((AbstractC5894L2.f) abstractC5894L22).mo1241d());
            c6009x7 = c6009x7Mo1242e;
            c5995w22 = c5995w2;
            abstractC5894L23 = abstractC5894L22;
            if (mutableList.isEmpty()) {
            }
        }
        c5995w2.f1796c.m1593a(c6009x7Mo1242e, (C6009X7) null);
        c5968t2.f1706a = null;
        c5968t2.f1707b = null;
        c5968t2.f1708c = null;
        c5968t2.f1713h = 2;
        Object objM1344a2 = c5995w2.m1344a(abstractC5894L22, c5968t2);
        return objM1344a2 == coroutine_suspended ? coroutine_suspended : objM1344a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1346a(Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        C5915N2 c5915n2;
        String workflowId;
        C5995W2 c5995w2;
        String str4;
        String str5;
        List<Common$SDKEvent> onAppearList;
        if (continuationImpl instanceof C5915N2) {
            c5915n2 = (C5915N2) continuationImpl;
            int i = c5915n2.f1565g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5915n2.f1565g = i - Integer.MIN_VALUE;
            } else {
                c5915n2 = new C5915N2(this, continuationImpl);
            }
        }
        C5915N2 c5915n22 = c5915n2;
        Object objWithContext = c5915n22.f1563e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5915n22.f1565g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            C5924O2 c5924o2 = new C5924O2(this, workflow$LinkWorkflowStartRequest, null);
            c5915n22.f1559a = this;
            workflowId = str;
            c5915n22.f1560b = workflowId;
            c5915n22.f1561c = str2;
            c5915n22.f1562d = str3;
            c5915n22.f1565g = 1;
            objWithContext = BuildersKt.withContext(io2, c5924o2, c5915n22);
            if (objWithContext != coroutine_suspended) {
                c5995w2 = this;
                str4 = str2;
                str5 = str3;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.throwOnFailure(objWithContext);
                return objWithContext;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
            return objWithContext;
        }
        String str6 = c5915n22.f1562d;
        String str7 = c5915n22.f1561c;
        workflowId = c5915n22.f1560b;
        C5995W2 c5995w22 = c5915n22.f1559a;
        ResultKt.throwOnFailure(objWithContext);
        str5 = str6;
        str4 = str7;
        c5995w2 = c5995w22;
        AbstractC6043b4 abstractC6043b4 = (AbstractC6043b4) objWithContext;
        if (abstractC6043b4.m1370a()) {
            return c5995w2.m1339a(workflowId, abstractC6043b4, "", CollectionsKt.emptyList());
        }
        Intrinsics.checkNotNull(abstractC6043b4, "null cannot be cast to non-null type com.plaid.internal.core.networking.models.NetworkResponse.Success<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse>");
        Workflow$LinkWorkflowStartResponse workflow$LinkWorkflowStartResponse = (Workflow$LinkWorkflowStartResponse) ((AbstractC6043b4.c) abstractC6043b4).f1923a;
        if (workflow$LinkWorkflowStartResponse.hasWebviewFallback()) {
            String url = workflow$LinkWorkflowStartResponse.getWebviewFallback().getUrl();
            Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
            if (url.length() > 0) {
                String workflowSessionId = workflow$LinkWorkflowStartResponse.getWorkflowSessionId();
                Intrinsics.checkNotNullExpressionValue(workflowSessionId, "getWorkflowSessionId(...)");
                String requestId = workflow$LinkWorkflowStartResponse.getRequestId();
                Intrinsics.checkNotNullExpressionValue(requestId, "getRequestId(...)");
                Common$WebviewFallback webviewFallback = workflow$LinkWorkflowStartResponse.getWebviewFallback();
                Intrinsics.checkNotNullExpressionValue(webviewFallback, "getWebviewFallback(...)");
                c5915n22.f1559a = null;
                c5915n22.f1560b = null;
                c5915n22.f1561c = null;
                c5915n22.f1562d = null;
                c5915n22.f1565g = 2;
                AbstractC5894L2 abstractC5894L2M1341a = c5995w2.m1341a(str4, workflowSessionId, requestId, str5, webviewFallback);
                if (abstractC5894L2M1341a != coroutine_suspended) {
                    return abstractC5894L2M1341a;
                }
            } else {
                C7195r3 c7195r3 = c5995w2.f1796c;
                c7195r3.getClass();
                Intrinsics.checkNotNullParameter(workflowId, "workflowId");
                Long l = c7195r3.f3158d;
                if (l != null) {
                    ClientEventOuterClass$ClientEvent.C6176a c6176aM1401a = C7195r3.m1590a().m1401a(ClientEventOuterClass$ClientEvent.ClientOpenDelay.newBuilder().m1394a(String.valueOf(l.longValue())));
                    Intrinsics.checkNotNullExpressionValue(c6176aM1401a, "setClientOpenDelay(...)");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, null, null, new C7186q3(c7195r3, c6176aM1401a, workflowId, null), 3, null);
                } else {
                    C5953R5.a.m1309e(C5953R5.f1671a, "markOpenStart was not called before tracking open delay");
                }
                Workflow$LinkWorkflowStartResponse.Events events = workflow$LinkWorkflowStartResponse.getEvents();
                if (events != null && (onAppearList = events.getOnAppearList()) != null) {
                    for (Common$SDKEvent common$SDKEvent : onAppearList) {
                        Function2<LinkEvent, AbstractC5849G2, Unit> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
                        if (linkEventListenerInternal$link_sdk_release != null) {
                            Intrinsics.checkNotNull(common$SDKEvent);
                            linkEventListenerInternal$link_sdk_release.invoke(C7262y6.m1670a(common$SDKEvent), AbstractC5849G2.d.f1351a);
                        }
                    }
                }
                String workflowSessionId2 = workflow$LinkWorkflowStartResponse.getWorkflowSessionId();
                Intrinsics.checkNotNullExpressionValue(workflowSessionId2, "getWorkflowSessionId(...)");
                String continuationToken = workflow$LinkWorkflowStartResponse.getContinuationToken();
                Intrinsics.checkNotNullExpressionValue(continuationToken, "getContinuationToken(...)");
                Pane$PaneRendering nextPane = workflow$LinkWorkflowStartResponse.getNextPane();
                List<Pane$PaneRendering> additionalPanesList = workflow$LinkWorkflowStartResponse.getAdditionalPanesList();
                Intrinsics.checkNotNullExpressionValue(additionalPanesList, "getAdditionalPanesList(...)");
                String requestId2 = workflow$LinkWorkflowStartResponse.getRequestId();
                Intrinsics.checkNotNullExpressionValue(requestId2, "getRequestId(...)");
                c5915n22.f1559a = null;
                c5915n22.f1560b = null;
                c5915n22.f1561c = null;
                c5915n22.f1562d = null;
                c5915n22.f1565g = 3;
                Object objM1347a = c5995w2.m1347a(str4, workflowSessionId2, continuationToken, str5, nextPane, additionalPanesList, CollectionsKt.emptyList(), requestId2, c5915n22);
                if (objM1347a != coroutine_suspended) {
                    return objM1347a;
                }
            }
        }
        return coroutine_suspended;
    }

    /* renamed from: a */
    public static AbstractC5894L2.e m1337a(AbstractC5894L2.i iVar) {
        String errorCode = iVar.f1484f;
        String displayMessage = iVar.f1483e;
        String errorJson = C5876J2.m1227a(errorCode, displayMessage, displayMessage);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(displayMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(displayMessage, "displayMessage");
        Intrinsics.checkNotNullParameter(errorJson, "errorJson");
        LinkError linkError = new LinkError(LinkErrorCode.INSTANCE.convert(errorCode), displayMessage, displayMessage, errorJson);
        LinkExitMetadataStatus linkExitMetadataStatusFromString = LinkExitMetadataStatus.INSTANCE.fromString(iVar.f1484f);
        String str = iVar.f1480b;
        String str2 = iVar.f1486h;
        LinkExitMetadata metadata = new LinkExitMetadata(linkExitMetadataStatusFromString, null, str, str2, C5876J2.m1226a(str, str2));
        String str3 = iVar.f1480b;
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new AbstractC5894L2.e(str3, new LinkExit(linkError, metadata));
    }

    /* renamed from: a */
    public final AbstractC5894L2 m1341a(String str, String str2, String str3, String str4, Common$WebviewFallback common$WebviewFallback) {
        C5792A c5792a;
        EnumC5880J6 enumC5880J6M1493a;
        String url = common$WebviewFallback.getUrl();
        Intrinsics.checkNotNull(url);
        if (url.length() == 0) {
            return m1340a(str3, str2, new Throwable("Webview fallback URL was null"), "", CollectionsKt.emptyList());
        }
        if (common$WebviewFallback.getMode() == EnumC6902b0.WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS) {
            String webviewFallbackId = common$WebviewFallback.getWebviewFallbackId();
            Intrinsics.checkNotNullExpressionValue(webviewFallbackId, "getWebviewFallbackId(...)");
            String id = common$WebviewFallback.getChannelFromWebview().getId();
            Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
            String secret = common$WebviewFallback.getChannelFromWebview().getSecret();
            Intrinsics.checkNotNullExpressionValue(secret, "getSecret(...)");
            return new AbstractC5894L2.k(str, str2, str3, str4, url, webviewFallbackId, new C5792A(common$WebviewFallback.getChannelFromWebview().getPollingIntervalMs(), id, secret), common$WebviewFallback.getShouldEagerStart(), EnumC5880J6.NO_SMS_AUTOFILL, 128);
        }
        if (common$WebviewFallback.getMode() == EnumC6902b0.WEBVIEW_FALLBACK_MODE_IN_PROCESS) {
            if (common$WebviewFallback.hasChannelFromWebview()) {
                String id2 = common$WebviewFallback.getChannelFromWebview().getId();
                Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                String secret2 = common$WebviewFallback.getChannelFromWebview().getSecret();
                Intrinsics.checkNotNullExpressionValue(secret2, "getSecret(...)");
                c5792a = new C5792A(common$WebviewFallback.getChannelFromWebview().getPollingIntervalMs(), id2, secret2);
            } else {
                c5792a = null;
            }
            C5792A c5792a2 = c5792a;
            String webviewFallbackId2 = common$WebviewFallback.getWebviewFallbackId();
            EnumC6898Z webviewFallbackBackground = common$WebviewFallback.getWebviewFallbackBackground();
            Intrinsics.checkNotNullExpressionValue(webviewFallbackBackground, "getWebviewFallbackBackground(...)");
            boolean zM1576a = C7190q7.m1576a(webviewFallbackBackground);
            boolean shouldEagerStart = common$WebviewFallback.getShouldEagerStart();
            EnumC7026f androidSmsVerificationApiType = common$WebviewFallback.getAndroidSmsVerificationApiType();
            if (androidSmsVerificationApiType == null || (enumC5880J6M1493a = C7061e.m1493a(androidSmsVerificationApiType)) == null) {
                enumC5880J6M1493a = EnumC5880J6.NO_SMS_AUTOFILL;
            }
            EnumC5880J6 enumC5880J6 = enumC5880J6M1493a;
            Intrinsics.checkNotNull(webviewFallbackId2);
            return new AbstractC5894L2.k(str, str2, str3, str4, url, webviewFallbackId2, c5792a2, zM1576a, false, shouldEagerStart, enumC5880J6);
        }
        Throwable th = new Throwable("Unsupported webview fallback mode: " + common$WebviewFallback.getMode());
        C5953R5.a.m1301a(C5953R5.f1671a, th);
        return m1340a(str3, str2, th, "", CollectionsKt.emptyList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1343a(AbstractC5894L2 abstractC5894L2, List list, ContinuationImpl continuationImpl) {
        C5950R2 c5950r2;
        List<C6009X7> listEmptyList;
        String str;
        Object objM1356a;
        List<C6009X7> list2;
        C5995W2 c5995w2;
        AbstractC5894L2 abstractC5894L22;
        if (continuationImpl instanceof C5950R2) {
            c5950r2 = (C5950R2) continuationImpl;
            int i = c5950r2.f1667g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5950r2.f1667g = i - Integer.MIN_VALUE;
            } else {
                c5950r2 = new C5950R2(this, continuationImpl);
            }
        }
        C5950R2 c5950r22 = c5950r2;
        Object obj = c5950r22.f1665e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5950r22.f1667g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (abstractC5894L2 instanceof AbstractC5894L2.i) {
                return m1337a((AbstractC5894L2.i) abstractC5894L2);
            }
            boolean z = abstractC5894L2 instanceof AbstractC5894L2.l;
            if (z) {
                ArrayList arrayList = new ArrayList();
                AbstractC5894L2.l lVar = (AbstractC5894L2.l) abstractC5894L2;
                arrayList.addAll(lVar.f1516h);
                arrayList.add(lVar.f1514f);
                listEmptyList = arrayList;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            str = z ? ((AbstractC5894L2.l) abstractC5894L2).f1512d : "";
            Workflow$LinkWorkflowNextRequest.C6199a c6199aNewBuilder = Workflow$LinkWorkflowNextRequest.newBuilder();
            c6199aNewBuilder.m1417b(abstractC5894L2.mo1235h());
            c6199aNewBuilder.m1415a(str);
            if (!list.isEmpty()) {
                c6199aNewBuilder.m1416a(list);
            }
            Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequestBuild = c6199aNewBuilder.build();
            C6011Y0 c6011y0 = C6011Y0.f1843a;
            C5959S2 c5959s2 = new C5959S2(this, workflow$LinkWorkflowNextRequestBuild, null);
            c5950r22.f1661a = this;
            c5950r22.f1662b = abstractC5894L2;
            c5950r22.f1663c = listEmptyList;
            c5950r22.f1664d = str;
            c5950r22.f1667g = 1;
            objM1356a = c6011y0.m1356a(c5959s2, c5950r22);
            if (objM1356a != coroutine_suspended) {
                list2 = listEmptyList;
                c5995w2 = this;
                abstractC5894L22 = abstractC5894L2;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        String str2 = c5950r22.f1664d;
        List<C6009X7> list3 = c5950r22.f1663c;
        AbstractC5894L2 abstractC5894L23 = c5950r22.f1662b;
        C5995W2 c5995w22 = c5950r22.f1661a;
        ResultKt.throwOnFailure(obj);
        list2 = list3;
        objM1356a = obj;
        str = str2;
        abstractC5894L22 = abstractC5894L23;
        c5995w2 = c5995w22;
        AbstractC6043b4 abstractC6043b4 = (AbstractC6043b4) objM1356a;
        if (abstractC6043b4.m1370a()) {
            return c5995w2.m1339a(abstractC5894L22.mo1235h(), abstractC6043b4, str, list2);
        }
        Intrinsics.checkNotNull(abstractC6043b4, "null cannot be cast to non-null type com.plaid.internal.core.networking.models.NetworkResponse.Success<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowNextResponse>");
        Workflow$LinkWorkflowNextResponse workflow$LinkWorkflowNextResponse = (Workflow$LinkWorkflowNextResponse) ((AbstractC6043b4.c) abstractC6043b4).f1923a;
        String strMo1234g = abstractC5894L22.mo1234g();
        String workflowSessionId = workflow$LinkWorkflowNextResponse.getWorkflowSessionId();
        Intrinsics.checkNotNullExpressionValue(workflowSessionId, "getWorkflowSessionId(...)");
        String continuationToken = workflow$LinkWorkflowNextResponse.getContinuationToken();
        Intrinsics.checkNotNullExpressionValue(continuationToken, "getContinuationToken(...)");
        String strMo1236a = abstractC5894L22 instanceof AbstractC5894L2.g ? ((AbstractC5894L2.g) abstractC5894L22).mo1236a() : "";
        Pane$PaneRendering nextPane = workflow$LinkWorkflowNextResponse.getNextPane();
        List<Pane$PaneRendering> additionalPanesList = workflow$LinkWorkflowNextResponse.getAdditionalPanesList();
        Intrinsics.checkNotNullExpressionValue(additionalPanesList, "getAdditionalPanesList(...)");
        String requestId = workflow$LinkWorkflowNextResponse.getRequestId();
        Intrinsics.checkNotNullExpressionValue(requestId, "getRequestId(...)");
        c5950r22.f1661a = null;
        c5950r22.f1662b = null;
        c5950r22.f1663c = null;
        c5950r22.f1664d = null;
        c5950r22.f1667g = 2;
        Object objM1347a = c5995w2.m1347a(strMo1234g, workflowSessionId, continuationToken, strMo1236a, nextPane, additionalPanesList, list2, requestId, c5950r22);
        return objM1347a == coroutine_suspended ? coroutine_suspended : objM1347a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1344a(AbstractC5894L2 abstractC5894L2, ContinuationImpl continuationImpl) {
        C5933P2 c5933p2;
        C5995W2 c5995w2;
        List<C6009X7> list;
        String str;
        AbstractC5894L2 abstractC5894L22;
        if (continuationImpl instanceof C5933P2) {
            c5933p2 = (C5933P2) continuationImpl;
            int i = c5933p2.f1625g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5933p2.f1625g = i - Integer.MIN_VALUE;
            } else {
                c5933p2 = new C5933P2(this, continuationImpl);
            }
        }
        Object objMo1566a = c5933p2.f1623e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5933p2.f1625g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1566a);
            C6009X7 c6009x7M1233f = abstractC5894L2.m1233f();
            boolean z = abstractC5894L2 instanceof AbstractC5894L2.f;
            String strMo1240b = z ? ((AbstractC5894L2.f) abstractC5894L2).mo1240b() : "";
            List<C6009X7> listMo1241d = z ? ((AbstractC5894L2.f) abstractC5894L2).mo1241d() : CollectionsKt.emptyList();
            InterfaceC5833E4 interfaceC5833E4 = this.f1795b;
            c5933p2.f1619a = this;
            c5933p2.f1620b = abstractC5894L2;
            c5933p2.f1621c = strMo1240b;
            c5933p2.f1622d = listMo1241d;
            c5933p2.f1625g = 1;
            objMo1566a = interfaceC5833E4.mo1566a(c6009x7M1233f, c5933p2);
            if (objMo1566a != coroutine_suspended) {
                c5995w2 = this;
                list = listMo1241d;
                str = strMo1240b;
                abstractC5894L22 = abstractC5894L2;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo1566a);
            return objMo1566a;
        }
        List<C6009X7> list2 = c5933p2.f1622d;
        String str2 = c5933p2.f1621c;
        AbstractC5894L2 abstractC5894L23 = c5933p2.f1620b;
        C5995W2 c5995w22 = c5933p2.f1619a;
        ResultKt.throwOnFailure(objMo1566a);
        list = list2;
        str = str2;
        abstractC5894L22 = abstractC5894L23;
        c5995w2 = c5995w22;
        Pane$PaneRendering pane$PaneRendering = (Pane$PaneRendering) objMo1566a;
        if (pane$PaneRendering == null) {
            return c5995w2.m1340a(C5906M2.m1253a(abstractC5894L22), abstractC5894L22.mo1235h(), new Throwable("Current pane is null"), str, list);
        }
        Pane$PaneOutput.C6730a c6730aM1174a = C5824D4.m1174a(pane$PaneRendering);
        if (c6730aM1174a == null) {
            return c5995w2.m1340a(C5906M2.m1253a(abstractC5894L22), abstractC5894L22.mo1235h(), new Throwable("Current pane could not be converted to an exit action: " + pane$PaneRendering.getRenderingPropertyKey()), str, list);
        }
        List listListOf = CollectionsKt.listOf(c6730aM1174a.build());
        c5933p2.f1619a = null;
        c5933p2.f1620b = null;
        c5933p2.f1621c = null;
        c5933p2.f1622d = null;
        c5933p2.f1625g = 2;
        Object objM1343a = c5995w2.m1343a(abstractC5894L22, listListOf, c5933p2);
        return objM1343a == coroutine_suspended ? coroutine_suspended : objM1343a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1342a(AbstractC5894L2 abstractC5894L2, AbstractC7207s6 abstractC7207s6, ContinuationImpl continuationImpl) {
        C5977U2 c5977u2;
        Object objMo1566a;
        C5995W2 c5995w2;
        AbstractC5894L2 abstractC5894L22;
        if (continuationImpl instanceof C5977U2) {
            c5977u2 = (C5977U2) continuationImpl;
            int i = c5977u2.f1746e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5977u2.f1746e = i - Integer.MIN_VALUE;
            } else {
                c5977u2 = new C5977U2(this, continuationImpl);
            }
        }
        C5977U2 c5977u22 = c5977u2;
        Object obj = c5977u22.f1744c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5977u22.f1746e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (abstractC7207s6 instanceof AbstractC7207s6.d) {
                return m1340a(C5906M2.m1253a(abstractC5894L2), abstractC5894L2.mo1235h(), ((AbstractC7207s6.d) abstractC7207s6).m1613a(), "", CollectionsKt.emptyList());
            }
            if (abstractC5894L2 instanceof AbstractC5894L2.k) {
                if (!(abstractC7207s6 instanceof AbstractC7207s6.b) && !(abstractC7207s6 instanceof AbstractC7207s6.c)) {
                    C5973T7 c5973t7 = this.f1798e;
                    AbstractC5894L2.k kVar = (AbstractC5894L2.k) abstractC5894L2;
                    Intrinsics.checkNotNull(abstractC7207s6, "null cannot be cast to non-null type com.plaid.internal.redirect.RedirectState.OAuth");
                    Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestM1325a = c5973t7.m1325a(kVar, (AbstractC7207s6.a) abstractC7207s6);
                    String strMo1235h = abstractC5894L2.mo1235h();
                    String strMo1234g = abstractC5894L2.mo1234g();
                    String strMo1236a = kVar.mo1236a();
                    c5977u22.f1746e = 1;
                    Object objM1346a = m1346a(workflow$LinkWorkflowStartRequestM1325a, strMo1235h, strMo1234g, strMo1236a, c5977u22);
                    if (objM1346a != coroutine_suspended) {
                        return objM1346a;
                    }
                } else {
                    return new AbstractC5894L2.d(abstractC5894L2.mo1234g(), abstractC5894L2.mo1235h(), ((AbstractC5894L2.k) abstractC5894L2).mo1237c(), abstractC7207s6 instanceof AbstractC7207s6.c);
                }
            } else {
                C6009X7 c6009x7Mo1242e = abstractC5894L2 instanceof AbstractC5894L2.l ? ((AbstractC5894L2.l) abstractC5894L2).mo1242e() : null;
                if (c6009x7Mo1242e == null) {
                    return m1340a(C5906M2.m1253a(abstractC5894L2), abstractC5894L2.mo1235h(), new IllegalStateException("Link does not have a current pane"), "", CollectionsKt.emptyList());
                }
                InterfaceC5833E4 interfaceC5833E4 = this.f1795b;
                c5977u22.f1742a = this;
                c5977u22.f1743b = abstractC5894L2;
                c5977u22.f1746e = 2;
                objMo1566a = interfaceC5833E4.mo1566a(c6009x7Mo1242e, c5977u22);
                if (objMo1566a != coroutine_suspended) {
                    c5995w2 = this;
                    abstractC5894L22 = abstractC5894L2;
                }
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        abstractC5894L22 = c5977u22.f1743b;
        C5995W2 c5995w22 = c5977u22.f1742a;
        ResultKt.throwOnFailure(obj);
        objMo1566a = obj;
        c5995w2 = c5995w22;
        if (((Pane$PaneRendering) objMo1566a) != null) {
            return abstractC5894L22;
        }
        return c5995w2.m1340a(C5906M2.m1253a(abstractC5894L22), abstractC5894L22.mo1235h(), new IllegalStateException("OAuth pane not found: " + abstractC5894L22), "", CollectionsKt.emptyList());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122 A[LOOP:1: B:32:0x011c->B:34:0x0122, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1347a(String str, String str2, String str3, String str4, Pane$PaneRendering pane$PaneRendering, List list, List list2, String str5, ContinuationImpl continuationImpl) {
        C5942Q2 c5942q2;
        String str6;
        String str7;
        List list3;
        String str8;
        Pane$PaneRendering pane$PaneRendering2;
        String str9;
        List list4;
        String str10;
        C5995W2 c5995w2;
        List<Pane$PaneRendering> list5;
        List list6;
        String str11;
        Pane$PaneRendering pane$PaneRendering3;
        String str12;
        String str13;
        String str14;
        Iterator it;
        String str15;
        C5995W2 c5995w22;
        if (continuationImpl instanceof C5942Q2) {
            c5942q2 = (C5942Q2) continuationImpl;
            int i = c5942q2.f1652m;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5942q2.f1652m = i - Integer.MIN_VALUE;
            } else {
                c5942q2 = new C5942Q2(this, continuationImpl);
            }
        }
        Object obj = c5942q2.f1650k;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5942q2.f1652m;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (pane$PaneRendering == null) {
                return m1340a(str5, str2, new Throwable("Next pane was null in start request"), str3, (List<C6009X7>) list2);
            }
            InterfaceC5833E4 interfaceC5833E4 = this.f1795b;
            C6009X7.CREATOR.getClass();
            C6009X7 c6009x7M1355a = C6009X7.c.m1355a(pane$PaneRendering, str2);
            c5942q2.f1640a = this;
            str6 = str;
            c5942q2.f1641b = str6;
            c5942q2.f1642c = str2;
            str7 = str3;
            c5942q2.f1643d = str7;
            c5942q2.f1644e = str4;
            c5942q2.f1645f = pane$PaneRendering;
            c5942q2.f1646g = list;
            list3 = list2;
            c5942q2.f1647h = list3;
            str8 = str5;
            c5942q2.f1648i = str8;
            c5942q2.f1652m = 1;
            if (interfaceC5833E4.mo1184a(c6009x7M1355a, pane$PaneRendering, c5942q2) != coroutine_suspended) {
                pane$PaneRendering2 = pane$PaneRendering;
                str9 = str4;
                list4 = list;
                str10 = str2;
                c5995w2 = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c5942q2.f1649j;
            str15 = c5942q2.f1648i;
            list6 = c5942q2.f1647h;
            list5 = c5942q2.f1646g;
            pane$PaneRendering3 = c5942q2.f1645f;
            str14 = c5942q2.f1644e;
            str13 = c5942q2.f1643d;
            str12 = c5942q2.f1642c;
            str11 = c5942q2.f1641b;
            c5995w22 = c5942q2.f1640a;
            ResultKt.throwOnFailure(obj);
            while (it.hasNext()) {
                Pane$PaneRendering pane$PaneRendering4 = (Pane$PaneRendering) it.next();
                InterfaceC5833E4 interfaceC5833E42 = c5995w22.f1795b;
                C6009X7.CREATOR.getClass();
                C6009X7 c6009x7M1355a2 = C6009X7.c.m1355a(pane$PaneRendering4, str12);
                c5942q2.f1640a = c5995w22;
                c5942q2.f1641b = str11;
                c5942q2.f1642c = str12;
                c5942q2.f1643d = str13;
                c5942q2.f1644e = str14;
                c5942q2.f1645f = pane$PaneRendering3;
                c5942q2.f1646g = list5;
                c5942q2.f1647h = list6;
                c5942q2.f1648i = str15;
                c5942q2.f1649j = it;
                c5942q2.f1652m = 2;
                if (interfaceC5833E42.mo1184a(c6009x7M1355a2, pane$PaneRendering4, c5942q2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C6009X7.CREATOR.getClass();
            C6009X7 c6009x7M1355a3 = C6009X7.c.m1355a(pane$PaneRendering3, str12);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
            for (Pane$PaneRendering pane$PaneRendering5 : list5) {
                C6009X7.CREATOR.getClass();
                arrayList.add(C6009X7.c.m1355a(pane$PaneRendering5, str12));
            }
            return new AbstractC5894L2.l(str11, str12, str13, str14, c6009x7M1355a3, arrayList, list6, str15);
        }
        String str16 = c5942q2.f1648i;
        List list7 = c5942q2.f1647h;
        list4 = c5942q2.f1646g;
        pane$PaneRendering2 = c5942q2.f1645f;
        String str17 = c5942q2.f1644e;
        str7 = c5942q2.f1643d;
        str10 = c5942q2.f1642c;
        String str18 = c5942q2.f1641b;
        C5995W2 c5995w23 = c5942q2.f1640a;
        ResultKt.throwOnFailure(obj);
        str8 = str16;
        str9 = str17;
        str6 = str18;
        c5995w2 = c5995w23;
        list3 = list7;
        Iterator it2 = list4.iterator();
        Pane$PaneRendering pane$PaneRendering6 = pane$PaneRendering2;
        list5 = list4;
        list6 = list3;
        str11 = str6;
        pane$PaneRendering3 = pane$PaneRendering6;
        str12 = str10;
        str13 = str7;
        str14 = str9;
        it = it2;
        str15 = str8;
        c5995w22 = c5995w2;
        while (it.hasNext()) {
        }
        C6009X7.CREATOR.getClass();
        C6009X7 c6009x7M1355a32 = C6009X7.c.m1355a(pane$PaneRendering3, str12);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
        while (r2.hasNext()) {
        }
        return new AbstractC5894L2.l(str11, str12, str13, str14, c6009x7M1355a32, arrayList2, list6, str15);
    }

    /* renamed from: a */
    public final <T> AbstractC5894L2.i m1339a(String workflowId, AbstractC6043b4<? extends T, ? extends Object> errorResponse, String continuationToken, List<C6009X7> backstack) throws C7267z2 {
        String strValueOf;
        EnumC5805B3 enumC5805B3;
        C7268z3 c7268z3 = this.f1797d;
        c7268z3.getClass();
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(continuationToken, "continuationToken");
        Intrinsics.checkNotNullParameter(backstack, "backstack");
        if (!(errorResponse instanceof AbstractC6043b4.c)) {
            strValueOf = "";
            if (errorResponse instanceof AbstractC6043b4.b) {
                enumC5805B3 = EnumC5805B3.NETWORK_ERROR;
            } else if (errorResponse instanceof AbstractC6043b4.d) {
                enumC5805B3 = EnumC5805B3.UNKNOWN_ERROR;
            } else if (errorResponse instanceof AbstractC6043b4.a) {
                AbstractC6043b4.a aVar = (AbstractC6043b4.a) errorResponse;
                U u = aVar.f1920a;
                strValueOf = u instanceof LinkedTreeMap ? String.valueOf(((Map) u).get("request_id")) : "";
                if (aVar.f1921b == 440) {
                    enumC5805B3 = EnumC5805B3.SESSION_EXPIRED;
                } else {
                    enumC5805B3 = EnumC5805B3.HTTP_ERROR;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            EnumC5805B3 enumC5805B32 = enumC5805B3;
            C6009X7.CREATOR.getClass();
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            return new AbstractC5894L2.i(workflowId, new C6009X7(workflowId, "error_pane_id", "local_error_pane"), continuationToken, c7268z3.m1677a(enumC5805B32), LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE.getJson(), backstack, strValueOf, enumC5805B32);
        }
        throw new C7267z2("Can't convert success response to local error");
    }

    /* renamed from: a */
    public final AbstractC5894L2.i m1340a(String requestId, String workflowId, Throwable throwable, String continuationToken, List<C6009X7> backstack) {
        C5953R5.a.m1301a(C5953R5.f1671a, throwable);
        C7268z3 c7268z3 = this.f1797d;
        c7268z3.getClass();
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(continuationToken, "continuationToken");
        Intrinsics.checkNotNullParameter(backstack, "backstack");
        C6009X7.CREATOR.getClass();
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        C6009X7 c6009x7 = new C6009X7(workflowId, "error_pane_id", "local_error_pane");
        EnumC5805B3 enumC5805B3 = EnumC5805B3.UNKNOWN_ERROR;
        return new AbstractC5894L2.i(workflowId, c6009x7, continuationToken, c7268z3.m1677a(enumC5805B3), LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE.getJson(), backstack, requestId, enumC5805B3);
    }
}
