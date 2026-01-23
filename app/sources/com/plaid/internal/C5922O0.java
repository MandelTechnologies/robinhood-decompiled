package com.plaid.internal;

import com.plaid.internal.AbstractC6043b4;
import com.plaid.internal.C5953R5;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse;
import dagger.internal.Preconditions;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* renamed from: com.plaid.internal.O0 */
/* loaded from: classes16.dex */
public final class C5922O0 {

    /* renamed from: a */
    public final C5973T7 f1577a;

    /* renamed from: b */
    public final InterfaceC5929O7 f1578b;

    /* renamed from: c */
    public final Json f1579c;

    public C5922O0(InterfaceC6013Y2 tokenComponent) throws SecurityException {
        Intrinsics.checkNotNullParameter(tokenComponent, "tokenComponent");
        C7156n0 c7156n0 = (C7156n0) tokenComponent;
        C7165o0 c7165o0 = c7156n0.f2992a;
        C7156n0 c7156n02 = c7156n0.f2993b;
        new C7147m0(c7165o0, c7156n02, new C5848G1());
        this.f1577a = c7156n02.f2998g.get();
        C7252x5 retrofitFactory = c7156n02.f2992a.f3048l.get();
        C7077f5 plaidEnvironmentStore = c7156n02.f2992a.f3049m.get();
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
        this.f1578b = (InterfaceC5929O7) Preconditions.checkNotNullFromProvides((InterfaceC5929O7) objCreate);
        this.f1579c = c7165o0.f3041e.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1273a(String str, ContinuationImpl continuationImpl) {
        C5913N0 c5913n0;
        if (continuationImpl instanceof C5913N0) {
            c5913n0 = (C5913N0) continuationImpl;
            int i = c5913n0.f1557c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5913n0.f1557c = i - Integer.MIN_VALUE;
            } else {
                c5913n0 = new C5913N0(this, continuationImpl);
            }
        }
        Object objM1286a = c5913n0.f1555a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5913n0.f1557c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM1286a);
            C5973T7 c5973t7 = this.f1577a;
            InterfaceC5929O7 interfaceC5929O7 = null;
            if (c5973t7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("workflowApiRequestFactory");
                c5973t7 = null;
            }
            Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequestM1326a = c5973t7.m1326a(str);
            C5953R5.a.m1299a(C5953R5.f1671a, "embedded view workflow start request is : " + workflow$LinkWorkflowStartRequestM1326a);
            InterfaceC5929O7 interfaceC5929O72 = this.f1578b;
            if (interfaceC5929O72 != null) {
                interfaceC5929O7 = interfaceC5929O72;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("workflowApi");
            }
            c5913n0.f1557c = 1;
            objM1286a = interfaceC5929O7.m1286a(workflow$LinkWorkflowStartRequestM1326a, c5913n0);
            if (objM1286a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM1286a);
        }
        AbstractC6043b4 abstractC6043b4 = (AbstractC6043b4) objM1286a;
        if (abstractC6043b4.m1370a()) {
            C5953R5.a.m1304b(C5953R5.f1671a, "embedded search workflow start request error: " + abstractC6043b4);
            Result.Companion companion = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(new Exception("embedded search workflow start request error: " + abstractC6043b4)));
        }
        Intrinsics.checkNotNull(abstractC6043b4, "null cannot be cast to non-null type com.plaid.internal.core.networking.models.NetworkResponse.Success<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse>");
        Workflow$LinkWorkflowStartResponse workflow$LinkWorkflowStartResponse = (Workflow$LinkWorkflowStartResponse) ((AbstractC6043b4.c) abstractC6043b4).m1373b();
        String url = workflow$LinkWorkflowStartResponse.getWebviewFallback().getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        if (url.length() != 0) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(workflow$LinkWorkflowStartResponse.getWebviewFallback().getUrl());
        }
        C5953R5.a.m1304b(C5953R5.f1671a, "missing webview fallback url: " + workflow$LinkWorkflowStartResponse);
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m28550constructorimpl(ResultKt.createFailure(new Exception("missing webview fallback url: " + workflow$LinkWorkflowStartResponse)));
    }
}
