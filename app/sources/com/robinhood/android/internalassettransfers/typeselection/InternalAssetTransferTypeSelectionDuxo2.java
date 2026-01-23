package com.robinhood.android.internalassettransfers.typeselection;

import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto;
import bonfire.proto.idl.margin.p036v1.MarginInvestingStateDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo;
import com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionEvent;
import com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionFragment;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityBottomSheetData;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityChecker;
import com.robinhood.android.internalassettransfers.validation.AccountFeatureParityWarning;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InternalAssetTransferTypeSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onTransferAllAssets$1$1", m3645f = "InternalAssetTransferTypeSelectionDuxo.kt", m3646l = {116}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onTransferAllAssets$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InternalAssetTransferTypeSelectionDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InternalAssetTransferTypeSelectionDataState $data;
    int label;
    final /* synthetic */ InternalAssetTransferTypeSelectionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalAssetTransferTypeSelectionDuxo2(InternalAssetTransferTypeSelectionDuxo internalAssetTransferTypeSelectionDuxo, InternalAssetTransferTypeSelectionDataState internalAssetTransferTypeSelectionDataState, Continuation<? super InternalAssetTransferTypeSelectionDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = internalAssetTransferTypeSelectionDuxo;
        this.$data = internalAssetTransferTypeSelectionDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InternalAssetTransferTypeSelectionDuxo2(this.this$0, this.$data, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InternalAssetTransferTypeSelectionDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AccountFeatureParityChecker accountFeatureParityChecker = this.this$0.accountFeatureParityChecker;
            InternalAssetTransferTypeSelectionDuxo.Companion companion = InternalAssetTransferTypeSelectionDuxo.INSTANCE;
            String rhsAccountNumber = ((InternalAssetTransferTypeSelectionFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getSourceAccount().getRhsAccountNumber();
            String rhsAccountNumber2 = ((InternalAssetTransferTypeSelectionFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getSinkAccount().getRhsAccountNumber();
            this.label = 1;
            obj = accountFeatureParityChecker.checkoutMarginFeatureParity(rhsAccountNumber, rhsAccountNumber2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        AccountFeatureParityWarning accountFeatureParityWarning = (AccountFeatureParityWarning) obj;
        GetMultiAccountEligibilityResponseDto sinkEligibility = this.$data.getSinkEligibility();
        if (((sinkEligibility != null ? sinkEligibility.getMargin_investing_state() : null) == MarginInvestingStateDto.MARGIN_INVESTING_STATE_DISABLED && this.$data.getSinkEligibility().is_eligible()) || accountFeatureParityWarning != null) {
            this.this$0.applyMutation(new C193191(null));
        } else {
            this.this$0.submit(InternalAssetTransferTypeSelectionEvent.TransferAllAssets.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: InternalAssetTransferTypeSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/typeselection/InternalAssetTransferTypeSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onTransferAllAssets$1$1$1", m3645f = "InternalAssetTransferTypeSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.typeselection.InternalAssetTransferTypeSelectionDuxo$onTransferAllAssets$1$1$1 */
    static final class C193191 extends ContinuationImpl7 implements Function2<InternalAssetTransferTypeSelectionDataState, Continuation<? super InternalAssetTransferTypeSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C193191(Continuation<? super C193191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C193191 c193191 = new C193191(continuation);
            c193191.L$0 = obj;
            return c193191;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferTypeSelectionDataState internalAssetTransferTypeSelectionDataState, Continuation<? super InternalAssetTransferTypeSelectionDataState> continuation) {
            return ((C193191) create(internalAssetTransferTypeSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InternalAssetTransferTypeSelectionDataState internalAssetTransferTypeSelectionDataState = (InternalAssetTransferTypeSelectionDataState) this.L$0;
            StringResource.Companion companion = StringResource.INSTANCE;
            return InternalAssetTransferTypeSelectionDataState.copy$default(internalAssetTransferTypeSelectionDataState, null, null, null, false, null, null, null, new AccountFeatureParityBottomSheetData(companion.invoke(C18977R.string.enable_margin_title, new Object[0]), companion.invoke(C18977R.string.enable_margin_subtitle, new Object[0]), companion.invoke(C18977R.string.enabled_margin_cta, new Object[0]), companion.invoke(C18977R.string.enable_margin_secondary_button, new Object[0]), boxing.boxInt(C20690R.drawable.pict_mono_rds_margin)), EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }
    }
}
