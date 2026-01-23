package com.robinhood.android.sentry;

import com.plaid.internal.EnumC7081g;
import io.sentry.SentryEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CrashStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lio/sentry/SentryEvent;", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.sentry.CrashStoreIntegration$crashes$1", m3645f = "CrashStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE, EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.sentry.CrashStoreIntegration$crashes$1, reason: use source file name */
/* loaded from: classes5.dex */
final class CrashStore3 extends ContinuationImpl7 implements Function3<FlowCollector<? super List<? extends SentryEvent>>, Unit, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CrashStore2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CrashStore3(CrashStore2 crashStore2, Continuation<? super CrashStore3> continuation) {
        super(3, continuation);
        this.this$0 = crashStore2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends SentryEvent>> flowCollector, Unit unit, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super List<SentryEvent>>) flowCollector, unit, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<SentryEvent>> flowCollector, Unit unit, Continuation<? super Unit> continuation) {
        CrashStore3 crashStore3 = new CrashStore3(this.this$0, continuation);
        crashStore3.L$0 = flowCollector;
        return crashStore3.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            CrashStore2 crashStore2 = this.this$0;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = crashStore2.readAll(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        flowCollector = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        this.L$0 = null;
        this.label = 2;
    }
}
