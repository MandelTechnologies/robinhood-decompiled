package com.robinhood.android.acatsin.agreement;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.acatsin.agreement.AcatsInAgreementViewState;
import com.robinhood.models.p355ui.UiSlipAgreements;
import com.robinhood.models.p355ui.UiSlipAgreementsSection;
import java.util.List;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AcatsInAgreementComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.agreement.AcatsInAgreementComposableKt$AcatsInAgreementComposable$1$1", m3645f = "AcatsInAgreementComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.agreement.AcatsInAgreementComposableKt$AcatsInAgreementComposable$1$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInAgreementComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<List<UiSlipAgreements.Agreement>, Unit> $onSlipAgreementsUpdated;
    final /* synthetic */ SnapshotState<Boolean> $slipCheckboxChecked$delegate;
    final /* synthetic */ AcatsInAgreementViewState.Loaded $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AcatsInAgreementComposable2(Function1<? super List<UiSlipAgreements.Agreement>, Unit> function1, AcatsInAgreementViewState.Loaded loaded, SnapshotState<Boolean> snapshotState, Continuation<? super AcatsInAgreementComposable2> continuation) {
        super(2, continuation);
        this.$onSlipAgreementsUpdated = function1;
        this.$state = loaded;
        this.$slipCheckboxChecked$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AcatsInAgreementComposable2(this.$onSlipAgreementsUpdated, this.$state, this.$slipCheckboxChecked$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AcatsInAgreementComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!Intrinsics.areEqual(AcatsInAgreementComposable.AcatsInAgreementComposable$lambda$7(this.$slipCheckboxChecked$delegate), boxing.boxBoolean(true))) {
                if (Intrinsics.areEqual(AcatsInAgreementComposable.AcatsInAgreementComposable$lambda$7(this.$slipCheckboxChecked$delegate), boxing.boxBoolean(false))) {
                    this.$onSlipAgreementsUpdated.invoke(null);
                }
            } else {
                Function1<List<UiSlipAgreements.Agreement>, Unit> function1 = this.$onSlipAgreementsUpdated;
                UiSlipAgreementsSection slipAgreementsSection = this.$state.getSlipAgreementsSection();
                function1.invoke(slipAgreementsSection != null ? slipAgreementsSection.getAgreements() : null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
