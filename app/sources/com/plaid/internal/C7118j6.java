package com.plaid.internal;

import com.plaid.internal.C5835E6;
import com.plaid.internal.C5953R5;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartResponse;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* renamed from: com.plaid.internal.j6 */
/* loaded from: classes16.dex */
public final class C7118j6 implements InterfaceC5946Q6 {

    /* renamed from: a */
    public final InterfaceC5910M6 f2880a;

    /* renamed from: b */
    public String f2881b;

    public C7118j6(InterfaceC5910M6 snaApi) {
        Intrinsics.checkNotNullParameter(snaApi, "snaApi");
        this.f2880a = snaApi;
    }

    @Override // com.plaid.internal.InterfaceC5946Q6
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C7091h mo1296a(InterfaceC5937P6 params, C7173p context) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.f2881b;
        if (str == null) {
            C7091h c7091hM1517a = C7091h.m1517a(new Exception("FAILURE: sessionVerificationId is null"));
            Intrinsics.checkNotNullExpressionValue(c7091hM1517a, "completedExceptionally(...)");
            return c7091hM1517a;
        }
        SilentNetworkAuth$LinkSNAProveStartRequest silentNetworkAuth$LinkSNAProveStartRequestBuild = SilentNetworkAuth$LinkSNAProveStartRequest.newBuilder().m1408a(params.mo1295a().m1159a()).m1409b(str).build();
        InterfaceC5910M6 interfaceC5910M6 = this.f2880a;
        Intrinsics.checkNotNull(silentNetworkAuth$LinkSNAProveStartRequestBuild);
        try {
            Response<SilentNetworkAuth$LinkSNAProveStartResponse> responseExecute = interfaceC5910M6.m1258a(silentNetworkAuth$LinkSNAProveStartRequestBuild).execute();
            if (responseExecute.isSuccessful()) {
                SilentNetworkAuth$LinkSNAProveStartResponse silentNetworkAuth$LinkSNAProveStartResponseBody = responseExecute.body();
                String redirectTargetUrl = silentNetworkAuth$LinkSNAProveStartResponseBody != null ? silentNetworkAuth$LinkSNAProveStartResponseBody.getRedirectTargetUrl() : null;
                if (redirectTargetUrl != null) {
                    C5953R5.a.m1299a(C5953R5.f1671a, "Prove Start Step success - redirectTargetUrl: " + redirectTargetUrl);
                    C7091h c7091hM1518a = C7091h.m1518a(redirectTargetUrl);
                    Intrinsics.checkNotNullExpressionValue(c7091hM1518a, "completed(...)");
                    return c7091hM1518a;
                }
            }
            C5835E6.a.m1187a("Prove Start Step failure - response: " + responseExecute);
            C7091h c7091hM1517a2 = C7091h.m1517a(new Exception("FAILURE: " + responseExecute));
            Intrinsics.checkNotNullExpressionValue(c7091hM1517a2, "completedExceptionally(...)");
            return c7091hM1517a2;
        } catch (Exception e) {
            C5835E6.a.m1187a("Prove Start Step failure - exception: " + e);
            C7091h c7091hM1517a3 = C7091h.m1517a(new Exception("FAILURE: " + e));
            Intrinsics.checkNotNullExpressionValue(c7091hM1517a3, "completedExceptionally(...)");
            return c7091hM1517a3;
        }
    }
}
