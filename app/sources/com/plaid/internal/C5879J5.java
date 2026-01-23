package com.plaid.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

@SourceDebugExtension
/* renamed from: com.plaid.internal.J5 */
/* loaded from: classes16.dex */
public final class C5879J5<T> implements FlowCollector {

    /* renamed from: a */
    public final /* synthetic */ FlowCollector f1404a;

    @DebugMetadata(m3644c = "com.plaid.core.webview.PlaidWebview$notifyWebViewShown$$inlined$filter$1$2", m3645f = "PlaidWebview.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "emit")
    @SourceDebugExtension
    /* renamed from: com.plaid.internal.J5$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1405a;

        /* renamed from: b */
        public int f1406b;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.f1405a = obj;
            this.f1406b |= Integer.MIN_VALUE;
            return C5879J5.this.emit(null, this);
        }
    }

    public C5879J5(FlowCollector flowCollector) {
        this.f1404a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f1406b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f1406b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        }
        Object obj2 = aVar.f1405a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f1406b;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            FlowCollector flowCollector = this.f1404a;
            if (((Boolean) obj).booleanValue()) {
                aVar.f1406b = 1;
                if (flowCollector.emit(obj, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}
