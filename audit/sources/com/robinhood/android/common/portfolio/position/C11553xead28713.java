package com.robinhood.android.common.portfolio.position;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.portfolio.PositionDetails;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemDuxo$bind$1$invokeSuspend$$inlined$flatMapLatest$2", m3645f = "PositionListItemComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.position.PositionListItemDuxo$bind$1$invokeSuspend$$inlined$flatMapLatest$2 */
/* loaded from: classes2.dex */
public final class C11553xead28713 extends ContinuationImpl7 implements Function3<FlowCollector<? super PositionDetails>, DisplayCurrency, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $displayType$inlined;
    final /* synthetic */ PositionsLocation $location$inlined;
    final /* synthetic */ PositionsV2.PositionListItemV2 $position$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PositionListItemDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11553xead28713(Continuation continuation, PositionListItemDuxo positionListItemDuxo, PositionsV2.PositionListItemV2 positionListItemV2, String str, PositionsLocation positionsLocation) {
        super(3, continuation);
        this.this$0 = positionListItemDuxo;
        this.$position$inlined = positionListItemV2;
        this.$displayType$inlined = str;
        this.$location$inlined = positionsLocation;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super PositionDetails> flowCollector, DisplayCurrency displayCurrency, Continuation<? super Unit> continuation) {
        C11553xead28713 c11553xead28713 = new C11553xead28713(continuation, this.this$0, this.$position$inlined, this.$displayType$inlined, this.$location$inlined);
        c11553xead28713.L$0 = flowCollector;
        c11553xead28713.L$1 = displayCurrency;
        return c11553xead28713.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            DisplayCurrency displayCurrency = (DisplayCurrency) this.L$1;
            PositionDetailsStore positionDetailsStore = this.this$0.positionDetailsStore;
            String accountNumber = this.$position$inlined.getAccountNumber();
            UUID instrumentId = this.$position$inlined.getInstrumentId();
            String str = this.$displayType$inlined;
            PositionInstrumentType instrumentType = this.$position$inlined.getInstrumentType();
            Duration durationOfSeconds = this.$position$inlined.getInstrumentType() == PositionInstrumentType.EVENT_CONTRACT ? null : Duration.ofSeconds((long) this.$position$inlined.getPollingRate());
            if (this.$location$inlined != PositionsLocation.HOME_TAB) {
                displayCurrency = DisplayCurrency.USD;
            }
            Flow<PositionDetails> flowStreamPositionDetails = positionDetailsStore.streamPositionDetails(accountNumber, instrumentId, str, instrumentType, durationOfSeconds, displayCurrency);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowStreamPositionDetails, this) == coroutine_suspended) {
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
