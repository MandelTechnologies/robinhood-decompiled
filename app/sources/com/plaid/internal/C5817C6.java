package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi$sendCrashes$2", m3645f = "SentryCrashApi.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.plaid.internal.C6 */
/* loaded from: classes16.dex */
public final class C5817C6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public /* synthetic */ Object f1300a;

    /* renamed from: b */
    public final /* synthetic */ List<Crash> f1301b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f1302c;

    /* renamed from: d */
    public final /* synthetic */ C5826D6 f1303d;

    @DebugMetadata(m3644c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi$sendCrashes$2$1$1", m3645f = "SentryCrashApi.kt", m3646l = {58}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.C6$a */
    public static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public ArrayList f1304a;

        /* renamed from: b */
        public int f1305b;

        /* renamed from: c */
        public final /* synthetic */ ArrayList f1306c;

        /* renamed from: d */
        public final /* synthetic */ C5826D6 f1307d;

        /* renamed from: e */
        public final /* synthetic */ Crash f1308e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList, C5826D6 c5826d6, Crash crash, Continuation continuation) {
            super(2, continuation);
            this.f1306c = arrayList;
            this.f1307d = c5826d6;
            this.f1308e = crash;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f1306c, this.f1307d, this.f1308e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1305b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList2 = this.f1306c;
                Object value = this.f1307d.f1324b.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                InterfaceC5844F6 interfaceC5844F6 = (InterfaceC5844F6) value;
                String strM1180a = this.f1307d.m1180a();
                CrashApiOptions crashApiOptions = this.f1307d.f1325c;
                if (crashApiOptions == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("crashApiOptions");
                    crashApiOptions = null;
                }
                String apiKey = crashApiOptions.getApiKey();
                Crash crash = this.f1308e;
                this.f1304a = arrayList2;
                this.f1305b = 1;
                Object objM1194a = interfaceC5844F6.m1194a(strM1180a, apiKey, crash, this);
                if (objM1194a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList = arrayList2;
                obj = objM1194a;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList = this.f1304a;
                ResultKt.throwOnFailure(obj);
            }
            arrayList.add(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5817C6(List list, ArrayList arrayList, C5826D6 c5826d6, Continuation continuation) {
        super(2, continuation);
        this.f1301b = list;
        this.f1302c = arrayList;
        this.f1303d = c5826d6;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C5817C6 c5817c6 = new C5817C6(this.f1301b, this.f1302c, this.f1303d, continuation);
        c5817c6.f1300a = obj;
        return c5817c6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C5817C6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f1300a;
        List<Crash> list = this.f1301b;
        ArrayList arrayList = this.f1302c;
        C5826D6 c5826d6 = this.f1303d;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(arrayList, c5826d6, (Crash) it.next(), null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
