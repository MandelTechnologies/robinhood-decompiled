package com.robinhood.android.retirement.onboarding.agreements;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
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

/* compiled from: RetirementSignUpFlowAgreementScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreenKt$RetirementAgreementsScreen$1$3$1", m3645f = "RetirementSignUpFlowAgreementScreen.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementScreenKt$RetirementAgreementsScreen$1$3$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementSignUpFlowAgreementScreen6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotIntState2 $lastFullyVisibleIndex$delegate;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ SnapshotIntState2 $nextAutoScrollIndex$delegate;
    final /* synthetic */ SnapshotState<Boolean> $shouldScroll$delegate;
    final /* synthetic */ SnapshotState4<Integer> $totalItemsCount$delegate;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementSignUpFlowAgreementScreen6(LazyListState lazyListState, SnapshotState<Boolean> snapshotState, SnapshotIntState2 snapshotIntState2, SnapshotIntState2 snapshotIntState22, SnapshotState4<Integer> snapshotState4, Continuation<? super RetirementSignUpFlowAgreementScreen6> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$shouldScroll$delegate = snapshotState;
        this.$lastFullyVisibleIndex$delegate = snapshotIntState2;
        this.$nextAutoScrollIndex$delegate = snapshotIntState22;
        this.$totalItemsCount$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RetirementSignUpFlowAgreementScreen6(this.$listState, this.$shouldScroll$delegate, this.$lastFullyVisibleIndex$delegate, this.$nextAutoScrollIndex$delegate, this.$totalItemsCount$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RetirementSignUpFlowAgreementScreen6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r13 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (androidx.compose.foundation.lazy.LazyListState.animateScrollToItem$default(r4, r5, 0, r7, 2, null) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RetirementSignUpFlowAgreementScreen6 retirementSignUpFlowAgreementScreen6;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (RetirementSignUpFlowAgreementScreen2.RetirementAgreementsScreen$lambda$10(this.$shouldScroll$delegate)) {
                int iMax = Math.max(this.$lastFullyVisibleIndex$delegate.getIntValue(), this.$nextAutoScrollIndex$delegate.getIntValue());
                if (iMax >= RetirementSignUpFlowAgreementScreen2.RetirementAgreementsScreen$lambda$2(this.$totalItemsCount$delegate) - 1) {
                    LazyListState lazyListState = this.$listState;
                    int totalItemsCount = lazyListState.getLayoutInfo().getTotalItemsCount();
                    this.I$0 = iMax;
                    this.label = 1;
                    Object objAnimateScrollToItem$default = LazyListState.animateScrollToItem$default(lazyListState, totalItemsCount, 0, this, 2, null);
                    retirementSignUpFlowAgreementScreen6 = this;
                } else {
                    retirementSignUpFlowAgreementScreen6 = this;
                    LazyListState lazyListState2 = retirementSignUpFlowAgreementScreen6.$listState;
                    retirementSignUpFlowAgreementScreen6.I$0 = iMax;
                    retirementSignUpFlowAgreementScreen6.label = 2;
                }
            } else {
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            ResultKt.throwOnFailure(obj);
            retirementSignUpFlowAgreementScreen6 = this;
        }
        retirementSignUpFlowAgreementScreen6.$nextAutoScrollIndex$delegate.setIntValue(i + 1);
        RetirementSignUpFlowAgreementScreen2.RetirementAgreementsScreen$lambda$11(retirementSignUpFlowAgreementScreen6.$shouldScroll$delegate, false);
        return Unit.INSTANCE;
    }
}
