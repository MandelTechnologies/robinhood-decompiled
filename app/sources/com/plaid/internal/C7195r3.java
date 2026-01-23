package com.plaid.internal;

import com.google.protobuf.Timestamp;
import com.plaid.internal.AbstractC6043b4;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope3;
import kotlinx.coroutines.Dispatchers;

@SourceDebugExtension
/* renamed from: com.plaid.internal.r3 */
/* loaded from: classes16.dex */
public final class C7195r3 {

    /* renamed from: a */
    public final InterfaceC5929O7 f3155a;

    /* renamed from: b */
    public final InterfaceC7222u3 f3156b;

    /* renamed from: c */
    public final CoroutineDispatcher f3157c;

    /* renamed from: d */
    public Long f3158d;

    public C7195r3(InterfaceC5929O7 api, InterfaceC7222u3 workflowAnalyticsStore) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(workflowAnalyticsStore, "workflowAnalyticsStore");
        this.f3155a = api;
        this.f3156b = workflowAnalyticsStore;
        this.f3157c = Dispatchers.getIO().limitedParallelism(1);
    }

    /* renamed from: a */
    public final void m1593a(C6009X7 currentPane, C6009X7 c6009x7) {
        String str;
        Intrinsics.checkNotNullParameter(currentPane, "currentPane");
        String str2 = currentPane.f1834a;
        ClientEventOuterClass$ClientEvent.C6176a c6176aM1590a = m1590a();
        ClientEventOuterClass$ClientEvent.Back.C6088a c6088aNewBuilder = ClientEventOuterClass$ClientEvent.Back.newBuilder();
        c6088aNewBuilder.m1392a(currentPane.f1836c);
        if (c6009x7 == null || (str = c6009x7.f1836c) == null) {
            str = "";
        }
        c6088aNewBuilder.m1393b(str);
        Unit unit = Unit.INSTANCE;
        ClientEventOuterClass$ClientEvent.C6176a c6176aM1400a = c6176aM1590a.m1400a(c6088aNewBuilder);
        Intrinsics.checkNotNullExpressionValue(c6176aM1400a, "setBack(...)");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, null, null, new C7186q3(this, c6176aM1400a, str2, null), 3, null);
    }

    /* renamed from: b */
    public final void m1596b(C6009X7 currentPane) {
        Intrinsics.checkNotNullParameter(currentPane, "currentPane");
        String str = currentPane.f1834a;
        ClientEventOuterClass$ClientEvent.C6176a c6176aM1403a = m1590a().m1403a(ClientEventOuterClass$ClientEvent.OAuthLink.newBuilder().m1397a(ClientEventOuterClass$ClientEvent.OAuthLink.PollingStarted.getDefaultInstance()));
        Intrinsics.checkNotNullExpressionValue(c6176aM1403a, "setOauthLink(...)");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, null, null, new C7186q3(this, c6176aM1403a, str, null), 3, null);
    }

    /* renamed from: c */
    public final void m1598c(String webviewFallbackId) {
        Intrinsics.checkNotNullParameter(webviewFallbackId, "webviewFallbackId");
        ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEventBuild = m1590a().m1406a(ClientEventOuterClass$ClientEvent.WebviewFallbackOpen.getDefaultInstance()).build();
        Intrinsics.checkNotNull(clientEventOuterClass$ClientEventBuild);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, null, null, new C7177p3(this, webviewFallbackId, clientEventOuterClass$ClientEventBuild, null), 3, null);
    }

    /* renamed from: b */
    public final void m1595b() {
        this.f3158d = Long.valueOf(System.currentTimeMillis());
    }

    /* renamed from: b */
    public final void m1597b(String webviewFallbackId) {
        Intrinsics.checkNotNullParameter(webviewFallbackId, "webviewFallbackId");
        ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEventBuild = m1590a().m1405a(ClientEventOuterClass$ClientEvent.WebviewFallbackEmitPreCompletionResult.getDefaultInstance()).build();
        Intrinsics.checkNotNull(clientEventOuterClass$ClientEventBuild);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, null, null, new C7177p3(this, webviewFallbackId, clientEventOuterClass$ClientEventBuild, null), 3, null);
    }

    /* renamed from: a */
    public final void m1592a(C6009X7 currentPane) {
        Intrinsics.checkNotNullParameter(currentPane, "currentPane");
        String str = currentPane.f1834a;
        ClientEventOuterClass$ClientEvent.C6176a c6176aM1403a = m1590a().m1403a(ClientEventOuterClass$ClientEvent.OAuthLink.newBuilder().m1396a(ClientEventOuterClass$ClientEvent.OAuthLink.PollingComplete.getDefaultInstance()));
        Intrinsics.checkNotNullExpressionValue(c6176aM1403a, "setOauthLink(...)");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, null, null, new C7186q3(this, c6176aM1403a, str, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d9, code lost:
    
        r10 = r0;
        r0 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1591a(C7195r3 c7195r3, ContinuationImpl continuationImpl) {
        C7168o3 c7168o3;
        Iterator it;
        C7168o3 c7168o32;
        Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest;
        Iterator it2;
        c7195r3.getClass();
        if (continuationImpl instanceof C7168o3) {
            c7168o3 = (C7168o3) continuationImpl;
            int i = c7168o3.f3069f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7168o3.f3069f = i - Integer.MIN_VALUE;
            } else {
                c7168o3 = new C7168o3(c7195r3, continuationImpl);
            }
        }
        Object objMo1618a = c7168o3.f3067d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7168o3.f3069f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo1618a);
            InterfaceC7222u3 interfaceC7222u3 = c7195r3.f3156b;
            c7168o3.f3064a = c7195r3;
            c7168o3.f3069f = 1;
            objMo1618a = interfaceC7222u3.mo1618a(c7168o3);
        } else if (i2 == 1) {
            c7195r3 = c7168o3.f3064a;
            ResultKt.throwOnFailure(objMo1618a);
        } else if (i2 == 2) {
            Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest2 = c7168o3.f3066c;
            Iterator it3 = c7168o3.f3065b;
            C7195r3 c7195r32 = c7168o3.f3064a;
            ResultKt.throwOnFailure(objMo1618a);
            workflow$LinkWorkflowEventRequest = workflow$LinkWorkflowEventRequest2;
            c7195r3 = c7195r32;
            c7168o32 = c7168o3;
            it2 = it3;
            if (!(((AbstractC6043b4) objMo1618a) instanceof AbstractC6043b4.c)) {
            }
            if (!it.hasNext()) {
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator it4 = c7168o3.f3065b;
            C7195r3 c7195r33 = c7168o3.f3064a;
            ResultKt.throwOnFailure(objMo1618a);
            it = it4;
            c7195r3 = c7195r33;
            if (!it.hasNext()) {
                workflow$LinkWorkflowEventRequest = (Workflow$LinkWorkflowEventRequest) it.next();
                InterfaceC5929O7 interfaceC5929O7 = c7195r3.f3155a;
                Intrinsics.checkNotNull(workflow$LinkWorkflowEventRequest);
                c7168o3.f3064a = c7195r3;
                c7168o3.f3065b = it;
                c7168o3.f3066c = workflow$LinkWorkflowEventRequest;
                c7168o3.f3069f = 2;
                Object objM1283a = interfaceC5929O7.m1283a(workflow$LinkWorkflowEventRequest, c7168o3);
                if (objM1283a != coroutine_suspended) {
                    C7168o3 c7168o33 = c7168o3;
                    it2 = it;
                    objMo1618a = objM1283a;
                    c7168o32 = c7168o33;
                    if (!(((AbstractC6043b4) objMo1618a) instanceof AbstractC6043b4.c)) {
                        InterfaceC7222u3 interfaceC7222u32 = c7195r3.f3156b;
                        List<ClientEventOuterClass$ClientEvent> eventsList = workflow$LinkWorkflowEventRequest.getEventsList();
                        Intrinsics.checkNotNullExpressionValue(eventsList, "getEventsList(...)");
                        c7168o32.f3064a = c7195r3;
                        c7168o32.f3065b = it2;
                        c7168o32.f3066c = null;
                        c7168o32.f3069f = 3;
                        if (interfaceC7222u32.mo1617a(eventsList, c7168o32) != coroutine_suspended) {
                            it = it2;
                            c7168o3 = c7168o32;
                        }
                    }
                    if (!it.hasNext()) {
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : (Iterable) objMo1618a) {
            String workflowSessionId = ((ClientEventOuterClass$ClientEvent) obj).getWorkflowSessionId();
            Object arrayList = linkedHashMap.get(workflowSessionId);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(workflowSessionId, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Workflow$LinkWorkflowEventRequest.C6196a c6196aNewBuilder = Workflow$LinkWorkflowEventRequest.newBuilder();
            c6196aNewBuilder.m1414b((String) entry.getKey());
            c6196aNewBuilder.m1412a((Iterable) entry.getValue());
            arrayList2.add(c6196aNewBuilder.build());
        }
        it = arrayList2.iterator();
        if (!it.hasNext()) {
        }
    }

    /* renamed from: a */
    public static ClientEventOuterClass$ClientEvent.C6176a m1590a() {
        return ClientEventOuterClass$ClientEvent.newBuilder().m1399a(Timestamp.newBuilder().setSeconds(System.currentTimeMillis() / 1000));
    }

    /* renamed from: a */
    public final void m1594a(String webviewFallbackId) {
        Intrinsics.checkNotNullParameter(webviewFallbackId, "webviewFallbackId");
        ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEventBuild = m1590a().m1404a(ClientEventOuterClass$ClientEvent.WebviewFallbackCancel.newBuilder().m1398a(ClientEventOuterClass$ClientEvent.WebviewFallbackCancel.EnumC6169b.LINK_WORKFLOW_EVENT_WEBVIEW_FALLBACK_CANCEL_REASON_UNKNOWN).build()).build();
        Intrinsics.checkNotNull(clientEventOuterClass$ClientEventBuild);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, null, null, new C7177p3(this, webviewFallbackId, clientEventOuterClass$ClientEventBuild, null), 3, null);
    }
}
