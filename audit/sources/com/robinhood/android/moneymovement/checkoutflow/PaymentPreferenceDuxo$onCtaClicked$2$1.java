package com.robinhood.android.moneymovement.checkoutflow;

import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.lib.transfers.contracts.models.TransferAccountType;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.transfers.accounts.contracts.AccountSelectionConfigurationService;
import com.robinhood.transfers.accounts.contracts.model.TransferAccountSelectionLoadConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaymentPreferenceDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$onCtaClicked$2$1", m3645f = "PaymentPreferenceDuxo.kt", m3646l = {302}, m3647m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PaymentPreferenceDuxo$onCtaClicked$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentPreferenceDataState $dataState;
    final /* synthetic */ String $primaryId;
    Object L$0;
    int label;
    final /* synthetic */ PaymentPreferenceDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentPreferenceDuxo$onCtaClicked$2$1(PaymentPreferenceDuxo paymentPreferenceDuxo, PaymentPreferenceDataState paymentPreferenceDataState, String str, Continuation<? super PaymentPreferenceDuxo$onCtaClicked$2$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentPreferenceDuxo;
        this.$dataState = paymentPreferenceDataState;
        this.$primaryId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentPreferenceDuxo$onCtaClicked$2$1(this.this$0, this.$dataState, this.$primaryId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaymentPreferenceDuxo$onCtaClicked$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String previousPrimaryId;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentPreferenceDuxo paymentPreferenceDuxo = this.this$0;
            MicrogramManager2 microgramManager2AccountSectionInstance = paymentPreferenceDuxo.accountSectionInstance(paymentPreferenceDuxo.microgramManager);
            if (this.$dataState.getPreviousBackupType() != ApiTransferAccount.TransferAccountType.RHS) {
                previousPrimaryId = this.$dataState.getPreviousBackupId();
            } else {
                previousPrimaryId = this.$dataState.getPreviousPrimaryId();
            }
            AccountSelectionConfigurationService accountSelectionConfigurationServiceLoadConfigService = this.this$0.loadConfigService(microgramManager2AccountSectionInstance);
            TransferAccountSelectionLoadConfiguration transferAccountSelectionLoadConfiguration = new TransferAccountSelectionLoadConfiguration(previousPrimaryId, SetsKt.setOf(TransferAccountType.RHS));
            this.L$0 = previousPrimaryId;
            this.label = 1;
            if (accountSelectionConfigurationServiceLoadConfigService.setOnLoadConfiguration(transferAccountSelectionLoadConfiguration, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = previousPrimaryId;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.applyMutation(new C221931(str, this.$primaryId, null));
        return Unit.INSTANCE;
    }

    /* compiled from: PaymentPreferenceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$onCtaClicked$2$1$1", m3645f = "PaymentPreferenceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceDuxo$onCtaClicked$2$1$1 */
    static final class C221931 extends ContinuationImpl7 implements Function2<PaymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState>, Object> {
        final /* synthetic */ String $preselectedAccountId;
        final /* synthetic */ String $primaryId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C221931(String str, String str2, Continuation<? super C221931> continuation) {
            super(2, continuation);
            this.$preselectedAccountId = str;
            this.$primaryId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C221931 c221931 = new C221931(this.$preselectedAccountId, this.$primaryId, continuation);
            c221931.L$0 = obj;
            return c221931;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaymentPreferenceDataState paymentPreferenceDataState, Continuation<? super PaymentPreferenceDataState> continuation) {
            return ((C221931) create(paymentPreferenceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PaymentPreferenceDataState.copy$default((PaymentPreferenceDataState) this.L$0, false, null, false, this.$preselectedAccountId, null, false, 2, this.$primaryId, null, null, null, null, 3894, null);
        }
    }
}
