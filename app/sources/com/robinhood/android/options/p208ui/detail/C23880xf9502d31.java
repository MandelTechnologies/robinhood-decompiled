package com.robinhood.android.options.p208ui.detail;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$47$invokeSuspend$$inlined$flatMapLatest$2", m3645f = "OptionsDetailPageDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$47$invokeSuspend$$inlined$flatMapLatest$2 */
/* loaded from: classes11.dex */
public final class C23880xf9502d31 extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends List<? extends IacInfoBanner>, ? extends Integer>>, Tuples3<? extends UiOptionStrategyInfo, ? extends UUID, ? extends Integer>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OptionsDetailPageDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23880xf9502d31(Continuation continuation, OptionsDetailPageDuxo optionsDetailPageDuxo) {
        super(3, continuation);
        this.this$0 = optionsDetailPageDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Tuples2<? extends List<? extends IacInfoBanner>, ? extends Integer>> flowCollector, Tuples3<? extends UiOptionStrategyInfo, ? extends UUID, ? extends Integer> tuples3, Continuation<? super Unit> continuation) {
        C23880xf9502d31 c23880xf9502d31 = new C23880xf9502d31(continuation, this.this$0);
        c23880xf9502d31.L$0 = flowCollector;
        c23880xf9502d31.L$1 = tuples3;
        return c23880xf9502d31.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Tuples3 tuples3 = (Tuples3) this.L$1;
            UiOptionStrategyInfo uiOptionStrategyInfo = (UiOptionStrategyInfo) tuples3.component1();
            UUID uuid = (UUID) tuples3.component2();
            final int iIntValue = ((Number) tuples3.component3()).intValue();
            Observable map = IacInfoBannerStore.streamBatch$default(this.this$0.infoBannerStore, CollectionsKt.listOf(IacInfoBannerLocation.INFO_BANNER_OPTION_DETAIL_PAGE_TOP_LEVEL), uuid, null, null, uiOptionStrategyInfo.getOptionChain().getId(), null, null, null, uiOptionStrategyInfo.getOptionStrategyInfo().getStrategyCode(), null, null, 1772, null).map(new Function() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageDuxo$onCreate$47$2$1
                @Override // io.reactivex.functions.Function
                public final Tuples2<List<IacInfoBanner>, Integer> apply(List<IacInfoBanner> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Tuples4.m3642to(it, Integer.valueOf(iIntValue));
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(map), Integer.MAX_VALUE, null, 2, null);
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
