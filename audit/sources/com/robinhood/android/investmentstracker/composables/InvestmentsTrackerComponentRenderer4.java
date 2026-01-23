package com.robinhood.android.investmentstracker.composables;

import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerCategoryPercentageViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: InvestmentsTrackerComponentRenderer.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.composables.InvestmentsTrackerComponentRendererKt$InvestmentsTrackerComponentRenderer$3$1$2$1$1", m3645f = "InvestmentsTrackerComponentRenderer.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerComponentRendererKt$InvestmentsTrackerComponentRenderer$3$1$2$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InvestmentsTrackerComponentRenderer4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InvestmentsTrackerComponent $item;
    final /* synthetic */ SnapshotState<Boolean> $visible$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestmentsTrackerComponentRenderer4(InvestmentsTrackerComponent investmentsTrackerComponent, SnapshotState<Boolean> snapshotState, Continuation<? super InvestmentsTrackerComponentRenderer4> continuation) {
        super(2, continuation);
        this.$item = investmentsTrackerComponent;
        this.$visible$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestmentsTrackerComponentRenderer4(this.$item, this.$visible$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestmentsTrackerComponentRenderer4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        InvestmentsTrackerComponentRenderer.m2114x3e2ed085(this.$visible$delegate, ((InvestmentsTrackerCategoryPercentageViewModel) this.$item).getShouldDisplay());
        return Unit.INSTANCE;
    }
}
