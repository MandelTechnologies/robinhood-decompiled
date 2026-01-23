package com.plaid.internal;

import com.plaid.internal.AbstractC5849G2;
import com.plaid.internal.AbstractC6043b4;
import com.plaid.internal.C5835E6;
import com.plaid.internal.C5953R5;
import com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchRequest;
import com.plaid.internal.core.protos.link.api.Channel$LinkChannelFetchResponse;
import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkResult;
import java.io.IOException;
import java.util.HashSet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;

@SourceDebugExtension
/* renamed from: com.plaid.internal.F */
/* loaded from: classes16.dex */
public final class C5837F {

    /* renamed from: a */
    public final InterfaceC5929O7 f1340a;

    /* renamed from: b */
    public final HashSet<String> f1341b;

    /* renamed from: c */
    public boolean f1342c;

    public C5837F(InterfaceC5929O7 workflowApi) {
        Intrinsics.checkNotNullParameter(workflowApi, "workflowApi");
        this.f1340a = workflowApi;
        this.f1341b = new HashSet<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        if (r12 != r1) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a5 -> B:13:0x0038). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1191a(C5837F c5837f, C5792A c5792a, AbstractC5846G abstractC5846G, ContinuationImpl continuationImpl) {
        C5828E c5828e;
        String str;
        String str2;
        boolean z;
        C5837F c5837f2;
        C5792A c5792a2;
        long j;
        c5837f.getClass();
        if (continuationImpl instanceof C5828E) {
            c5828e = (C5828E) continuationImpl;
            int i = c5828e.f1335h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5828e.f1335h = i - Integer.MIN_VALUE;
            } else {
                c5828e = new C5828E(c5837f, continuationImpl);
            }
        }
        Object objM1282a = c5828e.f1333f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5828e.f1335h;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM1282a);
            str = null;
            boolean z2 = c5837f.f1342c;
            j = c5792a.f1219c;
            c5828e.f1328a = c5837f;
            c5828e.f1329b = c5792a;
            c5828e.f1330c = abstractC5846G;
            c5828e.f1331d = str;
            c5828e.f1332e = z2;
            c5828e.f1335h = 1;
            if (DelayKt.delay(j, c5828e) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c5828e.f1332e;
            str2 = c5828e.f1331d;
            abstractC5846G = c5828e.f1330c;
            c5792a2 = c5828e.f1329b;
            c5837f2 = c5828e.f1328a;
            ResultKt.throwOnFailure(objM1282a);
            String str3 = str2;
            boolean z3 = z;
            c5837f = c5837f2;
            C5828E c5828e2 = c5828e;
            Object obj = objM1282a;
            AbstractC5846G abstractC5846G2 = abstractC5846G;
            String fetchId = str3;
            AbstractC6043b4 abstractC6043b4 = (AbstractC6043b4) obj;
            if (abstractC6043b4 instanceof AbstractC6043b4.b) {
                C5953R5.a aVar = C5953R5.f1671a;
                IOException iOException = ((AbstractC6043b4.b) abstractC6043b4).f1922a;
                aVar.getClass();
                C5953R5.f1672b.mo1266a(iOException, true);
            } else if (abstractC6043b4 instanceof AbstractC6043b4.a) {
                if (C7193r1.m1579a((AbstractC6043b4.a) abstractC6043b4)) {
                    C5953R5.a.m1309e(C5953R5.f1671a, "Closing channel due to invalid channel response.");
                    return Unit.INSTANCE;
                }
            } else if (abstractC6043b4 instanceof AbstractC6043b4.d) {
                C5953R5.a aVar2 = C5953R5.f1671a;
                Throwable th = ((AbstractC6043b4.d) abstractC6043b4).f1924a;
                aVar2.getClass();
                C5953R5.f1672b.mo1266a(th, true);
            } else if (abstractC6043b4 instanceof AbstractC6043b4.c) {
                AbstractC6043b4.c cVar = (AbstractC6043b4.c) abstractC6043b4;
                fetchId = ((Channel$LinkChannelFetchResponse) cVar.f1923a).getFetchId();
                LinkResult linkResultM1192a = c5837f.m1192a((Channel$LinkChannelFetchResponse) cVar.f1923a, abstractC5846G2);
                if (linkResultM1192a != null) {
                    abstractC5846G2.mo1199a(linkResultM1192a);
                    return Unit.INSTANCE;
                }
            }
            if (z3) {
                abstractC5846G2.mo1195a();
                return Unit.INSTANCE;
            }
            str = fetchId;
            abstractC5846G = abstractC5846G2;
            c5792a = c5792a2;
            c5828e = c5828e2;
            boolean z22 = c5837f.f1342c;
            j = c5792a.f1219c;
            c5828e.f1328a = c5837f;
            c5828e.f1329b = c5792a;
            c5828e.f1330c = abstractC5846G;
            c5828e.f1331d = str;
            c5828e.f1332e = z22;
            c5828e.f1335h = 1;
            if (DelayKt.delay(j, c5828e) != coroutine_suspended) {
                c5837f2 = c5837f;
                z = z22;
                c5792a2 = c5792a;
                str2 = str;
                InterfaceC5929O7 interfaceC5929O7 = c5837f2.f1340a;
                Channel$LinkChannelFetchRequest.C6082a c6082aNewBuilder = Channel$LinkChannelFetchRequest.newBuilder();
                c6082aNewBuilder.m1389a(c5792a2.f1217a);
                c6082aNewBuilder.m1390b(c5792a2.f1218b);
                if (str2 != null) {
                    c6082aNewBuilder.m1391c(str2);
                }
                Channel$LinkChannelFetchRequest channel$LinkChannelFetchRequestBuild = c6082aNewBuilder.build();
                Intrinsics.checkNotNullExpressionValue(channel$LinkChannelFetchRequestBuild, "build(...)");
                c5828e.f1328a = c5837f2;
                c5828e.f1329b = c5792a2;
                c5828e.f1330c = abstractC5846G;
                c5828e.f1331d = str2;
                c5828e.f1332e = z;
                c5828e.f1335h = 2;
                objM1282a = interfaceC5929O7.m1282a(channel$LinkChannelFetchRequestBuild, c5828e);
            }
            return coroutine_suspended;
        }
        z = c5828e.f1332e;
        str2 = c5828e.f1331d;
        abstractC5846G = c5828e.f1330c;
        c5792a2 = c5828e.f1329b;
        c5837f2 = c5828e.f1328a;
        ResultKt.throwOnFailure(objM1282a);
        InterfaceC5929O7 interfaceC5929O72 = c5837f2.f1340a;
        Channel$LinkChannelFetchRequest.C6082a c6082aNewBuilder2 = Channel$LinkChannelFetchRequest.newBuilder();
        c6082aNewBuilder2.m1389a(c5792a2.f1217a);
        c6082aNewBuilder2.m1390b(c5792a2.f1218b);
        if (str2 != null) {
        }
        Channel$LinkChannelFetchRequest channel$LinkChannelFetchRequestBuild2 = c6082aNewBuilder2.build();
        Intrinsics.checkNotNullExpressionValue(channel$LinkChannelFetchRequestBuild2, "build(...)");
        c5828e.f1328a = c5837f2;
        c5828e.f1329b = c5792a2;
        c5828e.f1330c = abstractC5846G;
        c5828e.f1331d = str2;
        c5828e.f1332e = z;
        c5828e.f1335h = 2;
        objM1282a = interfaceC5929O72.m1282a(channel$LinkChannelFetchRequestBuild2, c5828e);
    }

    /* renamed from: a */
    public final LinkResult m1192a(Channel$LinkChannelFetchResponse channel$LinkChannelFetchResponse, AbstractC5846G abstractC5846G) {
        Channel$Message.SDKResult result;
        LinkResult linkResultM1678a;
        Unit unit;
        Channel$Message.SDKEvent event;
        LinkResult linkResult = null;
        for (Channel$Message channel$Message : channel$LinkChannelFetchResponse.getMessagesList()) {
            if (!this.f1341b.contains(channel$Message.getMessageId())) {
                this.f1341b.add(channel$Message.getMessageId());
                if (channel$Message.hasEvent() && (event = channel$Message.getEvent()) != null) {
                    LinkEvent linkEventM1669a = C7262y6.m1669a(event);
                    if (linkEventM1669a.getEventName().toString().length() != 0) {
                        abstractC5846G.mo1198a(linkEventM1669a, AbstractC5849G2.d.f1351a);
                    }
                }
                if (channel$Message.hasInternalEvent() && channel$Message.getInternalEvent().hasRequestSilentNetworkAuth()) {
                    Common$SDKInternalEvent.RequestSilentNetworkAuth requestSilentNetworkAuth = channel$Message.getInternalEvent().getRequestSilentNetworkAuth();
                    Intrinsics.checkNotNull(requestSilentNetworkAuth);
                    AbstractC5919N6 abstractC5919N6M1637a = C7243w6.m1637a(requestSilentNetworkAuth);
                    if (abstractC5919N6M1637a != null) {
                        abstractC5846G.mo1196a(abstractC5919N6M1637a);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        C5835E6.a.m1187a("Invalid SNA request: " + requestSilentNetworkAuth);
                    }
                }
                if (channel$Message.hasPreCompletionResult()) {
                    Channel$Message.SDKResult preCompletionResult = channel$Message.getPreCompletionResult();
                    Intrinsics.checkNotNullExpressionValue(preCompletionResult, "getPreCompletionResult(...)");
                    abstractC5846G.mo1197a(preCompletionResult);
                }
                if (channel$Message.hasResult() && (result = channel$Message.getResult()) != null && (linkResultM1678a = C7271z6.m1678a(result)) != null) {
                    linkResult = linkResultM1678a;
                }
            }
        }
        return linkResult;
    }
}
