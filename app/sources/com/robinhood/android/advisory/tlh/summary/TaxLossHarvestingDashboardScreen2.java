package com.robinhood.android.advisory.tlh.summary;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoToast2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TaxLossHarvestingDashboardScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$2$1", m3645f = "TaxLossHarvestingDashboardScreen.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class TaxLossHarvestingDashboardScreen2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BentoToast2 $toastHost;
    final /* synthetic */ SnapshotState4<TaxLossHarvestDashboardViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxLossHarvestingDashboardScreen2(SnapshotState4<TaxLossHarvestDashboardViewState> snapshotState4, BentoToast2 bentoToast2, Continuation<? super TaxLossHarvestingDashboardScreen2> continuation) {
        super(2, continuation);
        this.$viewState$delegate = snapshotState4;
        this.$toastHost = bentoToast2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TaxLossHarvestingDashboardScreen2(this.$viewState$delegate, this.$toastHost, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TaxLossHarvestingDashboardScreen2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String updateEnrollmentToastText = TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen$lambda$2(this.$viewState$delegate).getUpdateEnrollmentToastText();
            if (updateEnrollmentToastText != null) {
                BentoToast2.showToast$default(this.$toastHost, updateEnrollmentToastText, -1, ServerToBentoAssetMapper2.CHECKMARK_24, null, new Function0() { // from class: com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreenKt$TaxLossHarvestDashboardScreen$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                }, false, 32, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
