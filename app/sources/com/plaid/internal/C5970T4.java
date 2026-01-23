package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel;
import com.plaid.internal.core.crashreporting.internal.models.DebugImage;
import com.plaid.internal.core.crashreporting.internal.models.DebugMetaInterface;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.core.crashreporting.PlaidCrashReporter$logMessage$1", m3645f = "PlaidCrashReporter.kt", m3646l = {66}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.T4 */
/* loaded from: classes16.dex */
public final class C5970T4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f1717a;

    /* renamed from: b */
    public final /* synthetic */ C5988V4 f1718b;

    /* renamed from: c */
    public final /* synthetic */ String f1719c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5970T4(C5988V4 c5988v4, String str, Continuation<? super C5970T4> continuation) {
        super(2, continuation);
        this.f1718b = c5988v4;
        this.f1719c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C5970T4(this.f1718b, this.f1719c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new C5970T4(this.f1718b, this.f1719c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List listSubList;
        Crash crashM1363a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1717a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C5988V4 c5988v4 = this.f1718b;
            C5826D6 c5826d6 = c5988v4.f1767a;
            C6029a0 c6029a0 = c5988v4.f1768b;
            String message = this.f1719c;
            c6029a0.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            UUID uuidRandomUUID = UUID.randomUUID();
            c6029a0.f1892f = uuidRandomUUID;
            Intrinsics.checkNotNull(uuidRandomUUID);
            String string2 = uuidRandomUUID.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            String strReplace$default = StringsKt.replace$default(string2, "-", "", false, 4, (Object) null);
            String str = ((SimpleDateFormat) c6029a0.f1893g.getValue()).format(new Date());
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            CrashLogLevel crashLogLevel = CrashLogLevel.WARNING;
            String release = c6029a0.f1888b.getRelease();
            if (StringsKt.contains$default((CharSequence) message, (CharSequence) "com.plaid.internal.core.networking.models.NetworkException", false, 2, (Object) null)) {
                try {
                    listSubList = StringsKt.split$default((CharSequence) message, new String[]{"\n"}, false, 0, 6, (Object) null).subList(0, 1);
                } catch (Throwable unused) {
                }
                String strMo1349a = c6029a0.f1889c.mo1349a();
                DebugMetaInterface debugMetaInterface = new DebugMetaInterface();
                debugMetaInterface.getDebugImages().add(new DebugImage(new String[]{"06bc072f-037e-5671-9ae9-1e7593a75683"}[0], null, 2, null));
                crashM1363a = c6029a0.m1363a(new Crash(strReplace$default, message, str, crashLogLevel, null, null, null, null, null, null, null, release, null, strMo1349a, null, listSubList, null, null, debugMetaInterface, 219120, null));
                this.f1717a = 1;
                if (c5826d6.m1178a(crashM1363a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                listSubList = null;
                String strMo1349a2 = c6029a0.f1889c.mo1349a();
                DebugMetaInterface debugMetaInterface2 = new DebugMetaInterface();
                debugMetaInterface2.getDebugImages().add(new DebugImage(new String[]{"06bc072f-037e-5671-9ae9-1e7593a75683"}[0], null, 2, null));
                crashM1363a = c6029a0.m1363a(new Crash(strReplace$default, message, str, crashLogLevel, null, null, null, null, null, null, null, release, null, strMo1349a2, null, listSubList, null, null, debugMetaInterface2, 219120, null));
                this.f1717a = 1;
                if (c5826d6.m1178a(crashM1363a, this) == coroutine_suspended) {
                }
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
