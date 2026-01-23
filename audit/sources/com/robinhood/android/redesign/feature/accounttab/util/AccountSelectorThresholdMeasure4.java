package com.robinhood.android.redesign.feature.accounttab.util;

import androidx.compose.runtime.SnapshotFloatState2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountSelectorThresholdMeasure.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorThresholdMeasureKt$AccountSelectorThresholdMeasure$3$1", m3645f = "AccountSelectorThresholdMeasure.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorThresholdMeasureKt$AccountSelectorThresholdMeasure$3$1, reason: use source file name */
/* loaded from: classes5.dex */
final class AccountSelectorThresholdMeasure4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotFloatState2 $measuredThreshold$delegate;
    final /* synthetic */ Function1<Float, Unit> $onThresholdMeasured;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AccountSelectorThresholdMeasure4(Function1<? super Float, Unit> function1, SnapshotFloatState2 snapshotFloatState2, Continuation<? super AccountSelectorThresholdMeasure4> continuation) {
        super(2, continuation);
        this.$onThresholdMeasured = function1;
        this.$measuredThreshold$delegate = snapshotFloatState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectorThresholdMeasure4(this.$onThresholdMeasured, this.$measuredThreshold$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectorThresholdMeasure4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$measuredThreshold$delegate.getFloatValue() > 0.0f) {
            this.$onThresholdMeasured.invoke(boxing.boxFloat(this.$measuredThreshold$delegate.getFloatValue()));
        }
        return Unit.INSTANCE;
    }
}
