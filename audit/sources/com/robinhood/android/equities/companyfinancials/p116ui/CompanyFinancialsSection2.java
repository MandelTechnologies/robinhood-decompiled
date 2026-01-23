package com.robinhood.android.equities.companyfinancials.p116ui;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import rh_server_driven_ui.p531v1.ChartFillDto;

/* compiled from: CompanyFinancialsSection.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionKt$CompanyFinancialsSection$2$1", m3645f = "CompanyFinancialsSection.kt", m3646l = {79}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionKt$CompanyFinancialsSection$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class CompanyFinancialsSection2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ImmutableList<ChartFillDto> $animatedBars;
    final /* synthetic */ ImmutableList<ChartFillDto> $barFills;
    final /* synthetic */ SnapshotState<Boolean> $shouldAnimateBars$delegate;
    final /* synthetic */ SnapshotState<Boolean> $shouldAnimateLine$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompanyFinancialsSection2(ImmutableList<ChartFillDto> immutableList, ImmutableList<ChartFillDto> immutableList2, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super CompanyFinancialsSection2> continuation) {
        super(2, continuation);
        this.$animatedBars = immutableList;
        this.$barFills = immutableList2;
        this.$shouldAnimateBars$delegate = snapshotState;
        this.$shouldAnimateLine$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CompanyFinancialsSection2(this.$animatedBars, this.$barFills, this.$shouldAnimateBars$delegate, this.$shouldAnimateLine$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CompanyFinancialsSection2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(this.$animatedBars, this.$barFills)) {
                CompanyFinancialsSection.CompanyFinancialsSection$lambda$4(this.$shouldAnimateBars$delegate, false);
                this.label = 1;
                if (DelayKt.delay(150L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CompanyFinancialsSection.CompanyFinancialsSection$lambda$7(this.$shouldAnimateLine$delegate, false);
        return Unit.INSTANCE;
    }
}
