package com.plaid.internal;

import com.plaid.internal.C5835E6;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* renamed from: com.plaid.internal.h6 */
/* loaded from: classes16.dex */
public final class C7098h6 implements InterfaceC5946Q6 {

    /* renamed from: a */
    public final InterfaceC5910M6 f2839a;

    /* renamed from: b */
    public String f2840b;

    public C7098h6(InterfaceC5910M6 snaApi) {
        Intrinsics.checkNotNullParameter(snaApi, "snaApi");
        this.f2839a = snaApi;
    }

    @Override // com.plaid.internal.InterfaceC5946Q6
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C7091h mo1296a(InterfaceC7063e1 finishInput, C7173p context) {
        Intrinsics.checkNotNullParameter(finishInput, "finishInput");
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.f2840b;
        if (str == null) {
            C7091h c7091hM1517a = C7091h.m1517a(new Exception("FAILURE: sessionVerificationId is null"));
            Intrinsics.checkNotNullExpressionValue(c7091hM1517a, "completedExceptionally(...)");
            return c7091hM1517a;
        }
        InterfaceC5910M6 interfaceC5910M6 = this.f2839a;
        String strMo1494a = finishInput.mo1494a();
        Intrinsics.checkNotNullExpressionValue(strMo1494a, "getVfp(...)");
        try {
            Response<SilentNetworkAuth$LinkSNAProveFinishResponse> responseExecute = interfaceC5910M6.m1259a(str, strMo1494a).execute();
            if (responseExecute.isSuccessful()) {
                C7091h c7091hM1518a = C7091h.m1518a(String.valueOf(responseExecute.body()));
                Intrinsics.checkNotNullExpressionValue(c7091hM1518a, "completed(...)");
                return c7091hM1518a;
            }
            C5835E6.a.m1187a("Prove Finish Step failure - response: " + responseExecute);
            C7091h c7091hM1517a2 = C7091h.m1517a(new Exception("FAILURE: " + responseExecute));
            Intrinsics.checkNotNullExpressionValue(c7091hM1517a2, "completedExceptionally(...)");
            return c7091hM1517a2;
        } catch (Exception e) {
            C5835E6.a.m1187a("Prove Finish Step failure - exception: " + e);
            C7091h c7091hM1517a3 = C7091h.m1517a(new Exception("FAILURE: " + e));
            Intrinsics.checkNotNullExpressionValue(c7091hM1517a3, "completedExceptionally(...)");
            return c7091hM1517a3;
        }
    }
}
