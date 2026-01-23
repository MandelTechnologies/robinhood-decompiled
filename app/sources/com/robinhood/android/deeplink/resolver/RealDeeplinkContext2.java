package com.robinhood.android.deeplink.resolver;

import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RealDeeplinkContext.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.deeplink.resolver.RealDeeplinkContext$getRegionGateState$1$1$1$1", m3645f = "RealDeeplinkContext.kt", m3646l = {77}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.deeplink.resolver.RealDeeplinkContext$getRegionGateState$1$1$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class RealDeeplinkContext2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ RegionGate $regionGate;
    int label;
    final /* synthetic */ RealDeeplinkContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealDeeplinkContext2(RealDeeplinkContext realDeeplinkContext, RegionGate regionGate, Continuation<? super RealDeeplinkContext2> continuation) {
        super(2, continuation);
        this.this$0 = realDeeplinkContext;
        this.$regionGate = regionGate;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RealDeeplinkContext2(this.this$0, this.$regionGate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((RealDeeplinkContext2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        RegionGateProvider regionGateProvider = this.this$0.regionGateProvider;
        RegionGate regionGate = this.$regionGate;
        this.label = 1;
        Object regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, regionGate, false, this, 2, null);
        return regionGateState$default == coroutine_suspended ? coroutine_suspended : regionGateState$default;
    }
}
