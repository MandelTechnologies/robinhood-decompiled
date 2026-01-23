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

/* compiled from: BaseRealDeepLinkResolver.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.deeplink.resolver.BaseRealDeepLinkResolver$rerouteRegionGate$2$inAllRegionGates$1$1", m3645f = "BaseRealDeepLinkResolver.kt", m3646l = {75}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.deeplink.resolver.BaseRealDeepLinkResolver$rerouteRegionGate$2$inAllRegionGates$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class BaseRealDeepLinkResolver2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ RegionGate $regionGate;
    int label;
    final /* synthetic */ BaseRealDeepLinkResolver<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseRealDeepLinkResolver2(BaseRealDeepLinkResolver<T> baseRealDeepLinkResolver, RegionGate regionGate, Continuation<? super BaseRealDeepLinkResolver2> continuation) {
        super(2, continuation);
        this.this$0 = baseRealDeepLinkResolver;
        this.$regionGate = regionGate;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseRealDeepLinkResolver2(this.this$0, this.$regionGate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((BaseRealDeepLinkResolver2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        RegionGateProvider regionGateProvider$lib_deeplink_resolver_externalDebug = this.this$0.getRegionGateProvider$lib_deeplink_resolver_externalDebug();
        RegionGate regionGate = this.$regionGate;
        this.label = 1;
        Object regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider$lib_deeplink_resolver_externalDebug, regionGate, false, this, 2, null);
        return regionGateState$default == coroutine_suspended ? coroutine_suspended : regionGateState$default;
    }
}
