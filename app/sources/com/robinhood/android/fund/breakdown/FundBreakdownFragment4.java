package com.robinhood.android.fund.breakdown;

import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
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

/* compiled from: FundBreakdownFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.fund.breakdown.FundBreakdownFragment$AnimatedDisclosure$1$1", m3645f = "FundBreakdownFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.fund.breakdown.FundBreakdownFragment$AnimatedDisclosure$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class FundBreakdownFragment4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $disclosureVisible$delegate;
    final /* synthetic */ int $vehicleCount;
    final /* synthetic */ SnapshotState<Boolean> $waitForHeaderRow$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FundBreakdownFragment4(int i, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super FundBreakdownFragment4> continuation) {
        super(2, continuation);
        this.$vehicleCount = i;
        this.$disclosureVisible$delegate = snapshotState;
        this.$waitForHeaderRow$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FundBreakdownFragment4(this.$vehicleCount, this.$disclosureVisible$delegate, this.$waitForHeaderRow$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FundBreakdownFragment4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FundBreakdownFragment.AnimatedDisclosure$lambda$4(this.$disclosureVisible$delegate, false);
            long j = (this.$vehicleCount + (FundBreakdownFragment.AnimatedDisclosure$lambda$6(this.$waitForHeaderRow$delegate) ? 1 : 0)) * 83;
            this.label = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        FundBreakdownFragment.AnimatedDisclosure$lambda$4(this.$disclosureVisible$delegate, true);
        FundBreakdownFragment.AnimatedDisclosure$lambda$7(this.$waitForHeaderRow$delegate, false);
        return Unit.INSTANCE;
    }
}
