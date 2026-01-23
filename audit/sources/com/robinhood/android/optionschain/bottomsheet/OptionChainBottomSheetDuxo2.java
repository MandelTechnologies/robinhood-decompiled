package com.robinhood.android.optionschain.bottomsheet;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.ApiOptionOrderRequest;
import com.robinhood.models.api.ApiOptionOrderStrategies;
import com.robinhood.models.p355ui.OptionLegBundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: OptionChainBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/optionschain/bottomsheet/OptionOrderStrategyBundle;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$2$1$1", m3645f = "OptionChainBottomSheetDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetDuxo$onCreate$2$2$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionChainBottomSheetDuxo2 extends ContinuationImpl7 implements Function2<FlowCollector<? super OptionOrderStrategyBundle>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ImmutableList<OptionLegBundle> $legBundles;
    final /* synthetic */ List<ApiOptionOrderRequest.Leg> $legs;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionChainBottomSheetDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionChainBottomSheetDuxo2(OptionChainBottomSheetDuxo optionChainBottomSheetDuxo, List<ApiOptionOrderRequest.Leg> list, ImmutableList<OptionLegBundle> immutableList, Continuation<? super OptionChainBottomSheetDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = optionChainBottomSheetDuxo;
        this.$legs = list;
        this.$legBundles = immutableList;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionChainBottomSheetDuxo2 optionChainBottomSheetDuxo2 = new OptionChainBottomSheetDuxo2(this.this$0, this.$legs, this.$legBundles, continuation);
        optionChainBottomSheetDuxo2.L$0 = obj;
        return optionChainBottomSheetDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super OptionOrderStrategyBundle> flowCollector, Continuation<? super Unit> continuation) {
        return ((OptionChainBottomSheetDuxo2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r1.emit(r2, r10) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlinx.coroutines.flow.FlowCollector] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM28550constructorimpl;
        ?? r1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            r1 = i;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ?? r12 = (FlowCollector) this.L$0;
            OptionChainBottomSheetDuxo optionChainBottomSheetDuxo = this.this$0;
            List<ApiOptionOrderRequest.Leg> list = this.$legs;
            Result.Companion companion2 = Result.INSTANCE;
            Duration.Companion companion3 = Duration.INSTANCE;
            long duration = Duration3.toDuration(500L, DurationUnitJvm.MILLISECONDS);
            OptionChainBottomSheetDuxo3 optionChainBottomSheetDuxo3 = new OptionChainBottomSheetDuxo3(optionChainBottomSheetDuxo, list, null);
            this.L$0 = r12;
            this.label = 1;
            obj = Timeout6.m28789withTimeoutKLykuaI(duration, optionChainBottomSheetDuxo3, this);
            i = r12;
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ?? r13 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            i = r13;
        }
        objM28550constructorimpl = Result.m28550constructorimpl((ApiOptionOrderStrategies) obj);
        r1 = i;
        ImmutableList<OptionLegBundle> immutableList = this.$legBundles;
        if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
            OptionOrderStrategyBundle optionOrderStrategyBundle = new OptionOrderStrategyBundle(immutableList, (ApiOptionOrderStrategies) objM28550constructorimpl);
            this.L$0 = null;
            this.label = 2;
        } else {
            OptionOrderStrategyBundle optionOrderStrategyBundle2 = new OptionOrderStrategyBundle(immutableList, new ApiOptionOrderStrategies(null, null, null));
            this.L$0 = null;
            this.label = 3;
        }
    }
}
