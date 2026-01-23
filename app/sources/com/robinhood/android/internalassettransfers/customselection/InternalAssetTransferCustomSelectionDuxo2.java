package com.robinhood.android.internalassettransfers.customselection;

import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto;
import com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo;
import com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionEvent;
import com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheetData;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityChecker;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityWarning;
import com.robinhood.android.udf.HasSavedState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InternalAssetTransferCustomSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onContinueClicked$1$1", m3645f = "InternalAssetTransferCustomSelectionDuxo.kt", m3646l = {202}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onContinueClicked$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InternalAssetTransferCustomSelectionDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $skipMargin;
    final /* synthetic */ InternalAssetTransferCustomSelectionDataState $state;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternalAssetTransferCustomSelectionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalAssetTransferCustomSelectionDuxo2(boolean z, InternalAssetTransferCustomSelectionDataState internalAssetTransferCustomSelectionDataState, InternalAssetTransferCustomSelectionDuxo internalAssetTransferCustomSelectionDuxo, Continuation<? super InternalAssetTransferCustomSelectionDuxo2> continuation) {
        super(2, continuation);
        this.$skipMargin = z;
        this.$state = internalAssetTransferCustomSelectionDataState;
        this.this$0 = internalAssetTransferCustomSelectionDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternalAssetTransferCustomSelectionDuxo2 internalAssetTransferCustomSelectionDuxo2 = new InternalAssetTransferCustomSelectionDuxo2(this.$skipMargin, this.$state, this.this$0, continuation);
        internalAssetTransferCustomSelectionDuxo2.L$0 = obj;
        return internalAssetTransferCustomSelectionDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InternalAssetTransferCustomSelectionDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        InternalAssetTransferCustomSelectionDuxo internalAssetTransferCustomSelectionDuxo;
        AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetDataBuildBottomSheetForEligibility;
        AccountFeatureParityBottomSheetData accountFeatureParityBottomSheetDataBuildBottomSheetForParityWarning;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$skipMargin) {
                GetMultiAccountEligibilityResponseDto sinkEligibility = this.$state.getSinkEligibility();
                if (sinkEligibility != null && (accountFeatureParityBottomSheetDataBuildBottomSheetForEligibility = this.this$0.buildBottomSheetForEligibility(sinkEligibility)) != null) {
                    this.this$0.submit(new InternalAssetTransferCustomSelectionEvent.EnableMarginAlert(accountFeatureParityBottomSheetDataBuildBottomSheetForEligibility));
                    return Unit.INSTANCE;
                }
                InternalAssetTransferCustomSelectionDuxo internalAssetTransferCustomSelectionDuxo2 = this.this$0;
                AccountFeatureParityChecker accountFeatureParityChecker = internalAssetTransferCustomSelectionDuxo2.accountFeatureParityChecker;
                InternalAssetTransferCustomSelectionDuxo.Companion companion = InternalAssetTransferCustomSelectionDuxo.INSTANCE;
                String rhsAccountNumber = ((InternalAssetTransferCustomSelectionFragment.Args) companion.getArgs((HasSavedState) internalAssetTransferCustomSelectionDuxo2)).getAccountSelection().getSourceAccount().getRhsAccountNumber();
                String rhsAccountNumber2 = ((InternalAssetTransferCustomSelectionFragment.Args) companion.getArgs((HasSavedState) internalAssetTransferCustomSelectionDuxo2)).getAccountSelection().getSinkAccount().getRhsAccountNumber();
                this.L$0 = internalAssetTransferCustomSelectionDuxo2;
                this.label = 1;
                Object objCheckoutMarginFeatureParity = accountFeatureParityChecker.checkoutMarginFeatureParity(rhsAccountNumber, rhsAccountNumber2, this);
                if (objCheckoutMarginFeatureParity == coroutine_suspended) {
                    return coroutine_suspended;
                }
                internalAssetTransferCustomSelectionDuxo = internalAssetTransferCustomSelectionDuxo2;
                obj = objCheckoutMarginFeatureParity;
            }
            this.this$0.navigateToAgreementsScreen();
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        internalAssetTransferCustomSelectionDuxo = (InternalAssetTransferCustomSelectionDuxo) this.L$0;
        ResultKt.throwOnFailure(obj);
        AccountFeatureParityWarning accountFeatureParityWarning = (AccountFeatureParityWarning) obj;
        if (accountFeatureParityWarning != null && (accountFeatureParityBottomSheetDataBuildBottomSheetForParityWarning = internalAssetTransferCustomSelectionDuxo.buildBottomSheetForParityWarning(accountFeatureParityWarning)) != null) {
            internalAssetTransferCustomSelectionDuxo.submit(new InternalAssetTransferCustomSelectionEvent.EnableMarginAlert(accountFeatureParityBottomSheetDataBuildBottomSheetForParityWarning));
            return Unit.INSTANCE;
        }
        this.this$0.navigateToAgreementsScreen();
        return Unit.INSTANCE;
    }
}
