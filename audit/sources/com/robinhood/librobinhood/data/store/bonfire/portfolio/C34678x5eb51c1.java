package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.portfolio.PositionDetails;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$streamPositionDetails$$inlined$flatMapLatest$1", m3645f = "PositionDetailsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$streamPositionDetails$$inlined$flatMapLatest$1 */
/* loaded from: classes13.dex */
public final class C34678x5eb51c1 extends ContinuationImpl7 implements Function3<FlowCollector<? super PositionDetails>, Boolean, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber$inlined;
    final /* synthetic */ DisplayCurrency $displayCurrency$inlined;
    final /* synthetic */ String $displayType$inlined;
    final /* synthetic */ UUID $instrumentId$inlined;
    final /* synthetic */ PositionInstrumentType $instrumentType$inlined;
    final /* synthetic */ Duration $pollingRate$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PositionDetailsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34678x5eb51c1(Continuation continuation, PositionInstrumentType positionInstrumentType, PositionDetailsStore positionDetailsStore, String str, UUID uuid, String str2, Duration duration, DisplayCurrency displayCurrency) {
        super(3, continuation);
        this.$instrumentType$inlined = positionInstrumentType;
        this.this$0 = positionDetailsStore;
        this.$accountNumber$inlined = str;
        this.$instrumentId$inlined = uuid;
        this.$displayType$inlined = str2;
        this.$pollingRate$inlined = duration;
        this.$displayCurrency$inlined = displayCurrency;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super PositionDetails> flowCollector, Boolean bool, Continuation<? super Unit> continuation) {
        C34678x5eb51c1 c34678x5eb51c1 = new C34678x5eb51c1(continuation, this.$instrumentType$inlined, this.this$0, this.$accountNumber$inlined, this.$instrumentId$inlined, this.$displayType$inlined, this.$pollingRate$inlined, this.$displayCurrency$inlined);
        c34678x5eb51c1.L$0 = flowCollector;
        c34678x5eb51c1.L$1 = bool;
        return c34678x5eb51c1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Flow flowAsFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            if (((Boolean) this.L$1).booleanValue() && !CollectionsKt.listOf((Object[]) new PositionInstrumentType[]{PositionInstrumentType.OPTIONS_PENDING, PositionInstrumentType.OPTIONS}).contains(this.$instrumentType$inlined)) {
                flowAsFlow = this.this$0.batchedPositionDetailsQuery.asFlow(new PositionDetailsStore.DetailsRequest(this.$accountNumber$inlined, this.$instrumentId$inlined, this.$displayType$inlined, this.$instrumentType$inlined, this.$pollingRate$inlined, this.$displayCurrency$inlined));
            } else {
                flowAsFlow = this.this$0.positionDetailsQuery.asFlow(new PositionDetailsStore.DetailsRequest(this.$accountNumber$inlined, this.$instrumentId$inlined, this.$displayType$inlined, this.$instrumentType$inlined, this.$pollingRate$inlined, this.$displayCurrency$inlined));
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowAsFlow, this) == coroutine_suspended) {
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
