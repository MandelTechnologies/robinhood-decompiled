package com.plaid.internal;

import com.plaid.internal.AbstractC6043b4;
import com.plaid.internal.C5835E6;
import com.plaid.internal.C5953R5;
import com.plaid.internal.InterfaceC7078f6;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNATwilioFinishRequest;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* renamed from: com.plaid.internal.Z6 */
/* loaded from: classes16.dex */
public final class C6026Z6 {

    /* renamed from: a */
    public final InterfaceC6046b7 f1877a;

    /* renamed from: b */
    public final InterfaceC5910M6 f1878b;

    public C6026Z6(InterfaceC6046b7 twilioVerifySna, InterfaceC5910M6 snaApi) {
        Intrinsics.checkNotNullParameter(twilioVerifySna, "twilioVerifySna");
        Intrinsics.checkNotNullParameter(snaApi, "snaApi");
        this.f1877a = twilioVerifySna;
        this.f1878b = snaApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00eb, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1360a(C6036a7 c6036a7, ContinuationImpl continuationImpl) {
        C6008X6 c6008x6;
        C6026Z6 c6026z6;
        if (continuationImpl instanceof C6008X6) {
            c6008x6 = (C6008X6) continuationImpl;
            int i = c6008x6.f1832e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6008x6.f1832e = i - Integer.MIN_VALUE;
            } else {
                c6008x6 = new C6008X6(this, continuationImpl);
            }
        }
        Object objWithContext = c6008x6.f1830c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c6008x6.f1832e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            C5953R5.a.m1299a(C5953R5.f1671a, "Twilio redirect uri: " + c6036a7.m1365a());
            CoroutineDispatcher io2 = Dispatchers.getIO();
            C6017Y6 c6017y6 = new C6017Y6(this, c6036a7, null);
            c6008x6.f1828a = this;
            c6008x6.f1829b = c6036a7;
            c6008x6.f1832e = 1;
            objWithContext = BuildersKt.withContext(io2, c6017y6, c6008x6);
            if (objWithContext != coroutine_suspended) {
                c6026z6 = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
            AbstractC6043b4 abstractC6043b4 = (AbstractC6043b4) objWithContext;
            if (abstractC6043b4 instanceof AbstractC6043b4.c) {
                C5953R5.a.m1299a(C5953R5.f1671a, "/twilio/finish response Success: " + ((AbstractC6043b4.c) abstractC6043b4).m1373b());
            } else if (abstractC6043b4 instanceof AbstractC6043b4.b) {
                C5835E6.a.m1187a("/twilio/finish response NetworkError: " + ((AbstractC6043b4.b) abstractC6043b4).m1372b());
            } else if (abstractC6043b4 instanceof AbstractC6043b4.a) {
                C5835E6.a.m1187a("/twilio/finish response HttpError: " + ((AbstractC6043b4.a) abstractC6043b4).m1371b());
            } else if (abstractC6043b4 instanceof AbstractC6043b4.d) {
                C5835E6.a.m1187a("/twilio/finish response UnknownError: " + ((AbstractC6043b4.d) abstractC6043b4).m1374b());
            }
            return Unit.INSTANCE;
        }
        c6036a7 = c6008x6.f1829b;
        c6026z6 = c6008x6.f1828a;
        ResultKt.throwOnFailure(objWithContext);
        InterfaceC7078f6 interfaceC7078f6 = (InterfaceC7078f6) objWithContext;
        if (interfaceC7078f6 instanceof InterfaceC7078f6.a) {
            C5835E6.a.m1187a("Error processing Twilio redirect uri: " + ((InterfaceC7078f6.a) interfaceC7078f6).m1505a());
            return Unit.INSTANCE;
        }
        if (interfaceC7078f6 instanceof InterfaceC7078f6.b) {
            C5953R5.a aVar = C5953R5.f1671a;
            C5953R5.a.m1299a(aVar, "processUrl success: " + ((InterfaceC7078f6.b) interfaceC7078f6).m1506a());
            SilentNetworkAuth$LinkSNATwilioFinishRequest silentNetworkAuth$LinkSNATwilioFinishRequestBuild = SilentNetworkAuth$LinkSNATwilioFinishRequest.newBuilder().m1410a(c6036a7.m1366b()).build();
            C5953R5.a.m1299a(aVar, "sending twilioFinishRequest: " + silentNetworkAuth$LinkSNATwilioFinishRequestBuild);
            InterfaceC5910M6 interfaceC5910M6 = c6026z6.f1878b;
            Intrinsics.checkNotNull(silentNetworkAuth$LinkSNATwilioFinishRequestBuild);
            c6008x6.f1828a = null;
            c6008x6.f1829b = null;
            c6008x6.f1832e = 2;
            objWithContext = interfaceC5910M6.m1257a(silentNetworkAuth$LinkSNATwilioFinishRequestBuild, c6008x6);
        }
        return Unit.INSTANCE;
    }
}
