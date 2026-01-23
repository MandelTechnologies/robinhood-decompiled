package com.robinhood.android.common.options.detail;

import com.plaid.internal.EnumC7081g;
import com.robinhood.librobinhood.data.store.OptionsWatchlistStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
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
@DebugMetadata(m3644c = "com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getCuratedListItemToUiStrategyInfoToIndexFlow$$inlined$flatMapLatest$2", m3645f = "OptionsDetailPageDuxoHelper.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getCuratedListItemToUiStrategyInfoToIndexFlow$$inlined$flatMapLatest$2 */
/* loaded from: classes2.dex */
public final class C11317x46245f5e extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends Tuples2<? extends Optional<? extends CuratedListItem>, ? extends UiOptionStrategyInfo>, ? extends Integer>>, Tuples2<? extends Tuples2<? extends Account, ? extends UiOptionStrategyInfo>, ? extends Integer>, Continuation<? super Unit>, Object> {
    final /* synthetic */ OptionsWatchlistStore $optionsWatchlistStore$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11317x46245f5e(Continuation continuation, OptionsWatchlistStore optionsWatchlistStore) {
        super(3, continuation);
        this.$optionsWatchlistStore$inlined = optionsWatchlistStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Tuples2<? extends Tuples2<? extends Optional<? extends CuratedListItem>, ? extends UiOptionStrategyInfo>, ? extends Integer>> flowCollector, Tuples2<? extends Tuples2<? extends Account, ? extends UiOptionStrategyInfo>, ? extends Integer> tuples2, Continuation<? super Unit> continuation) {
        C11317x46245f5e c11317x46245f5e = new C11317x46245f5e(continuation, this.$optionsWatchlistStore$inlined);
        c11317x46245f5e.L$0 = flowCollector;
        c11317x46245f5e.L$1 = tuples2;
        return c11317x46245f5e.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow flowFlowOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Tuples2 tuples2 = (Tuples2) this.L$1;
            Tuples2 tuples22 = (Tuples2) tuples2.component1();
            final int iIntValue = ((Number) tuples2.component2()).intValue();
            Account account = (Account) tuples22.component1();
            final UiOptionStrategyInfo uiOptionStrategyInfo = (UiOptionStrategyInfo) tuples22.component2();
            if (account.getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL) {
                ObservableSource map = this.$optionsWatchlistStore$inlined.streamItemByStrategyCode(uiOptionStrategyInfo.getOptionStrategyInfo().getStrategyCode()).map(new Function() { // from class: com.robinhood.android.common.options.detail.OptionsDetailPageDuxoHelperKt$getCuratedListItemToUiStrategyInfoToIndexFlow$6$1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<Tuples2<Optional<CuratedListItem>, UiOptionStrategyInfo>, Integer> apply(Optional<CuratedListItem> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Tuples4.m3642to(Tuples4.m3642to(it, uiOptionStrategyInfo), Integer.valueOf(iIntValue));
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                flowFlowOf = Context7.buffer$default(RxConvert.asFlow(map), Integer.MAX_VALUE, null, 2, null);
            } else {
                flowFlowOf = FlowKt.flowOf(Tuples4.m3642to(Tuples4.m3642to(Optional2.INSTANCE, uiOptionStrategyInfo), boxing.boxInt(iIntValue)));
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == coroutine_suspended) {
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
