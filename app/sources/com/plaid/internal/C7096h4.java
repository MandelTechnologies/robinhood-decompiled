package com.plaid.internal;

import com.plaid.internal.AbstractC6043b4;
import com.plaid.internal.C5953R5;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;

/* renamed from: com.plaid.internal.h4 */
/* loaded from: classes16.dex */
public final class C7096h4 {

    /* renamed from: a */
    public final InterfaceC5929O7 f2834a;

    /* renamed from: b */
    public final C7195r3 f2835b;

    /* renamed from: c */
    public final C7106i4 f2836c;

    /* renamed from: d */
    public final C6009X7 f2837d;

    /* renamed from: e */
    public final Workflow$LinkWorkflowPollRequest f2838e;

    public C7096h4(InterfaceC5929O7 workflowApi, C7195r3 analytics, C7106i4 pollingOptions, String oAuthStateId, C6009X7 workflowPaneId) {
        Intrinsics.checkNotNullParameter(workflowApi, "workflowApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(pollingOptions, "pollingOptions");
        Intrinsics.checkNotNullParameter(oAuthStateId, "oAuthStateId");
        Intrinsics.checkNotNullParameter(workflowPaneId, "workflowPaneId");
        this.f2834a = workflowApi;
        this.f2835b = analytics;
        this.f2836c = pollingOptions;
        this.f2837d = workflowPaneId;
        this.f2838e = Workflow$LinkWorkflowPollRequest.newBuilder().m1420a(workflowPaneId.f1834a).m1419a(Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete.newBuilder().m1418a(oAuthStateId).build()).build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d2, code lost:
    
        if (r14 != r1) goto L28;
     */
    /* JADX WARN: Path cross not found for [B:30:0x00db, B:36:0x00fa], limit reached: 44 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d2 -> B:28:0x00d5). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1522a(ContinuationImpl continuationImpl) {
        C7086g4 c7086g4;
        long jCurrentTimeMillis;
        C7096h4 c7096h4;
        boolean z;
        boolean z2;
        if (continuationImpl instanceof C7086g4) {
            c7086g4 = (C7086g4) continuationImpl;
            int i = c7086g4.f2802e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7086g4.f2802e = i - Integer.MIN_VALUE;
            } else {
                c7086g4 = new C7086g4(this, continuationImpl);
            }
        }
        Object objM1285a = c7086g4.f2800c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7086g4.f2802e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM1285a);
            if (!this.f2836c.m1529c()) {
                C5953R5.a.m1299a(C5953R5.f1671a, "Not polling for oAuth result");
                return Unit.INSTANCE;
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            C5953R5.a.m1299a(C5953R5.f1671a, "Polling for oAuth result - duration: " + this.f2836c.m1528b() + " interval: " + this.f2836c.m1527a());
            this.f2835b.m1596b(this.f2837d);
            c7096h4 = this;
            z = false;
            z2 = false;
            if (!z) {
            }
        } else if (i2 == 1) {
            jCurrentTimeMillis = c7086g4.f2799b;
            c7096h4 = c7086g4.f2798a;
            ResultKt.throwOnFailure(objM1285a);
            C5953R5.a.m1299a(C5953R5.f1671a, "OAuth polling attempt - " + (System.currentTimeMillis() - jCurrentTimeMillis));
            InterfaceC5929O7 interfaceC5929O7 = c7096h4.f2834a;
            Workflow$LinkWorkflowPollRequest pollRequest = c7096h4.f2838e;
            Intrinsics.checkNotNullExpressionValue(pollRequest, "pollRequest");
            c7086g4.f2798a = c7096h4;
            c7086g4.f2799b = jCurrentTimeMillis;
            c7086g4.f2802e = 2;
            objM1285a = interfaceC5929O7.m1285a(pollRequest, c7086g4);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = c7086g4.f2799b;
            c7096h4 = c7086g4.f2798a;
            ResultKt.throwOnFailure(objM1285a);
            AbstractC6043b4 abstractC6043b4 = (AbstractC6043b4) objM1285a;
            if (abstractC6043b4 instanceof AbstractC6043b4.c) {
                Workflow$LinkWorkflowPollResponse workflow$LinkWorkflowPollResponse = (Workflow$LinkWorkflowPollResponse) ((AbstractC6043b4.c) abstractC6043b4).m1373b();
                c7096h4.getClass();
                if (workflow$LinkWorkflowPollResponse.hasOauthRedirectComplete() ? workflow$LinkWorkflowPollResponse.getOauthRedirectComplete().getIsComplete() : false) {
                    z2 = true;
                }
                if (!z2) {
                    if (System.currentTimeMillis() - jCurrentTimeMillis <= c7096h4.f2836c.m1528b()) {
                        z = false;
                    }
                    if (!z) {
                        c7096h4.f2835b.m1592a(c7096h4.f2837d);
                        C5953R5.a.m1299a(C5953R5.f1671a, "Stopped polling, session was completed: " + z2);
                        return Unit.INSTANCE;
                    }
                    long jM1527a = c7096h4.f2836c.m1527a();
                    c7086g4.f2798a = c7096h4;
                    c7086g4.f2799b = jCurrentTimeMillis;
                    c7086g4.f2802e = 1;
                    if (DelayKt.delay(jM1527a, c7086g4) != coroutine_suspended) {
                        C5953R5.a.m1299a(C5953R5.f1671a, "OAuth polling attempt - " + (System.currentTimeMillis() - jCurrentTimeMillis));
                        InterfaceC5929O7 interfaceC5929O72 = c7096h4.f2834a;
                        Workflow$LinkWorkflowPollRequest pollRequest2 = c7096h4.f2838e;
                        Intrinsics.checkNotNullExpressionValue(pollRequest2, "pollRequest");
                        c7086g4.f2798a = c7096h4;
                        c7086g4.f2799b = jCurrentTimeMillis;
                        c7086g4.f2802e = 2;
                        objM1285a = interfaceC5929O72.m1285a(pollRequest2, c7086g4);
                    }
                    return coroutine_suspended;
                }
                C5953R5.a.m1299a(C5953R5.f1671a, "OAuth polling detected OAuth session completion");
                z = true;
                if (!z) {
                }
            }
            z2 = false;
            if (!z2) {
            }
            z = true;
            if (!z) {
            }
        }
    }
}
