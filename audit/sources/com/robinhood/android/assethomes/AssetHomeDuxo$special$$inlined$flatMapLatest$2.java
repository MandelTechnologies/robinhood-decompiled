package com.robinhood.android.assethomes;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.assethomes.AssetHomeDuxo;
import com.robinhood.android.equities.contracts.AssetHomeContract;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.assethomes.AssetHomeDuxo$special$$inlined$flatMapLatest$2", m3645f = "AssetHomeDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AssetHomeDuxo$special$$inlined$flatMapLatest$2 extends ContinuationImpl7 implements Function3<FlowCollector<? super PositionsV2>, String, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AssetHomeDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetHomeDuxo$special$$inlined$flatMapLatest$2(Continuation continuation, AssetHomeDuxo assetHomeDuxo) {
        super(3, continuation);
        this.this$0 = assetHomeDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super PositionsV2> flowCollector, String str, Continuation<? super Unit> continuation) {
        AssetHomeDuxo$special$$inlined$flatMapLatest$2 assetHomeDuxo$special$$inlined$flatMapLatest$2 = new AssetHomeDuxo$special$$inlined$flatMapLatest$2(continuation, this.this$0);
        assetHomeDuxo$special$$inlined$flatMapLatest$2.L$0 = flowCollector;
        assetHomeDuxo$special$$inlined$flatMapLatest$2.L$1 = str;
        return assetHomeDuxo$special$$inlined$flatMapLatest$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        PositionInstrumentType positionInstrumentType;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            String str = (String) this.L$1;
            PositionsV2Store positionsV2Store = this.this$0.positionsV2Store;
            int i2 = AssetHomeDuxo.WhenMappings.$EnumSwitchMapping$0[((AssetHomeContract.Key) AssetHomeDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAssetType().ordinal()];
            if (i2 == 1) {
                positionInstrumentType = PositionInstrumentType.EQUITY;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Futures not supported");
                }
                positionInstrumentType = PositionInstrumentType.OPTIONS;
            }
            Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(PositionsV2Store.streamPositions$default(positionsV2Store, str, positionInstrumentType, PositionsLocation.ASSET_HOME, null, 8, null)), Integer.MAX_VALUE, null, 2, null);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowBuffer$default, this) == coroutine_suspended) {
                return coroutine_suspended;
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
