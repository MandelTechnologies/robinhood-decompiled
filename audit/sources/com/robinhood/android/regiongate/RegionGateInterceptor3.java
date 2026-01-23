package com.robinhood.android.regiongate;

import com.robinhood.android.regiongate.RegionGateProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RegionGateInterceptor.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/android/regiongate/RegionGate;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.regiongate.RegionGateInterceptor$intercept$disabledRegionGates$1$1$1", m3645f = "RegionGateInterceptor.kt", m3646l = {56}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.regiongate.RegionGateInterceptor$intercept$disabledRegionGates$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RegionGateInterceptor3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Tuples2<? extends RegionGate, ? extends Boolean>>, Object> {
    final /* synthetic */ RegionGate $regionGate;
    Object L$0;
    int label;
    final /* synthetic */ RegionGateInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RegionGateInterceptor3(RegionGate regionGate, RegionGateInterceptor regionGateInterceptor, Continuation<? super RegionGateInterceptor3> continuation) {
        super(2, continuation);
        this.$regionGate = regionGate;
        this.this$0 = regionGateInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RegionGateInterceptor3(this.$regionGate, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Tuples2<? extends RegionGate, ? extends Boolean>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Tuples2<? extends RegionGate, Boolean>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Tuples2<? extends RegionGate, Boolean>> continuation) {
        return ((RegionGateInterceptor3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        RegionGate regionGate;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RegionGate regionGate2 = this.$regionGate;
            RegionGateProvider regionGateProvider = this.this$0.regionGateProvider;
            RegionGate regionGate3 = this.$regionGate;
            this.L$0 = regionGate2;
            this.label = 1;
            Object regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, regionGate3, false, this, 2, null);
            if (regionGateState$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            regionGate = regionGate2;
            obj = regionGateState$default;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            regionGate = (RegionGate) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Tuples4.m3642to(regionGate, obj);
    }
}
