package com.robinhood.android.advisory.tlh.strategy.celebration;

import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategyType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HarvestStrategyCelebrationScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.strategy.celebration.HarvestStrategyCelebrationScreenKt$HarvestStrategyCelebrationScreen$1$1", m3645f = "HarvestStrategyCelebrationScreen.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.tlh.strategy.celebration.HarvestStrategyCelebrationScreenKt$HarvestStrategyCelebrationScreen$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class HarvestStrategyCelebrationScreen5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ImmutableList<String> $accountNumbers;
    final /* synthetic */ HarvestStrategyCelebrationDuxo $duxo;
    final /* synthetic */ TaxLossHarvestStrategyType $strategyType;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HarvestStrategyCelebrationScreen5(HarvestStrategyCelebrationDuxo harvestStrategyCelebrationDuxo, ImmutableList<String> immutableList, TaxLossHarvestStrategyType taxLossHarvestStrategyType, Continuation<? super HarvestStrategyCelebrationScreen5> continuation) {
        super(2, continuation);
        this.$duxo = harvestStrategyCelebrationDuxo;
        this.$accountNumbers = immutableList;
        this.$strategyType = taxLossHarvestStrategyType;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HarvestStrategyCelebrationScreen5(this.$duxo, this.$accountNumbers, this.$strategyType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HarvestStrategyCelebrationScreen5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$duxo.setUp(this.$accountNumbers, this.$strategyType);
        return Unit.INSTANCE;
    }
}
