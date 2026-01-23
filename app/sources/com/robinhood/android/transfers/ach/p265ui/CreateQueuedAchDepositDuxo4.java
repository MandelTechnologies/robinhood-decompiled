package com.robinhood.android.transfers.ach.p265ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.Logger;
import com.robinhood.android.goldearningspotential.microgram.GoldEarningsCalculatorUiModel;
import com.robinhood.android.goldearningspotential.microgram.GoldEarningsDisclosureUiModel;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.onboarding.goldearningspotential.contracts.GoldEarningsCalculatorModel;
import com.robinhood.onboarding.goldearningspotential.contracts.GoldEarningsPotentialService;
import com.robinhood.utils.logging.CrashReporter;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import microgram.service.protocol.ProtocolExceptions5;

/* compiled from: CreateQueuedAchDepositDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$updateGoldEarningsPotential$1$1", m3645f = "CreateQueuedAchDepositDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$updateGoldEarningsPotential$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class CreateQueuedAchDepositDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CreateQueuedAchDepositViewState $state;
    int label;
    final /* synthetic */ CreateQueuedAchDepositDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateQueuedAchDepositDuxo4(CreateQueuedAchDepositViewState createQueuedAchDepositViewState, CreateQueuedAchDepositDuxo createQueuedAchDepositDuxo, Continuation<? super CreateQueuedAchDepositDuxo4> continuation) {
        super(2, continuation);
        this.$state = createQueuedAchDepositViewState;
        this.this$0 = createQueuedAchDepositDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateQueuedAchDepositDuxo4(this.$state, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateQueuedAchDepositDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        GoldEarningsCalculatorModel goldEarningsCalculatorModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String amountHint = this.$state.getAmountHint();
                BigDecimal depositAmount = this.$state.getDepositAmount();
                if (depositAmount == null) {
                    try {
                        depositAmount = new BigDecimal(String.valueOf(Formats.getCurrencyFormat().parse("$" + amountHint)));
                    } catch (Exception unused) {
                        depositAmount = null;
                    }
                }
                if (depositAmount != null) {
                    GoldEarningsPotentialService goldEarningsPotentialService = this.this$0.goldEarningsPotentialService;
                    double dDoubleValue = depositAmount.doubleValue();
                    this.label = 1;
                    obj = goldEarningsPotentialService.getPotentialGoldEarningsCalculator(dDoubleValue, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            goldEarningsCalculatorModel = (GoldEarningsCalculatorModel) obj;
        } catch (Throwable th) {
            Logger.INSTANCE.mo1681e("Error calling or converting app-gold-earnings-potential getPotentialGoldEarningsCalculator: " + th + ", microgram error: " + ProtocolExceptions5.asMicrogramError(th), new Object[0]);
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, true, null, 4, null);
        }
        if (goldEarningsCalculatorModel == null) {
            return Unit.INSTANCE;
        }
        this.this$0.applyMutation(new C301011(this.this$0.sduiConverters.convertGoldEarningsPotentialCalculator(goldEarningsCalculatorModel.getCalculator()), this.this$0.sduiConverters.convertGoldEarningsPotentialDisclosure(goldEarningsCalculatorModel.getDisclosure()), null));
        return Unit.INSTANCE;
    }

    /* compiled from: CreateQueuedAchDepositDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ach/ui/CreateQueuedAchDepositViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$updateGoldEarningsPotential$1$1$1", m3645f = "CreateQueuedAchDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ach.ui.CreateQueuedAchDepositDuxo$updateGoldEarningsPotential$1$1$1 */
    static final class C301011 extends ContinuationImpl7 implements Function2<CreateQueuedAchDepositViewState, Continuation<? super CreateQueuedAchDepositViewState>, Object> {
        final /* synthetic */ GoldEarningsCalculatorUiModel $goldEarningsCalculatorUiModel;
        final /* synthetic */ GoldEarningsDisclosureUiModel $goldEarningsDisclosureUiModel;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C301011(GoldEarningsCalculatorUiModel goldEarningsCalculatorUiModel, GoldEarningsDisclosureUiModel goldEarningsDisclosureUiModel, Continuation<? super C301011> continuation) {
            super(2, continuation);
            this.$goldEarningsCalculatorUiModel = goldEarningsCalculatorUiModel;
            this.$goldEarningsDisclosureUiModel = goldEarningsDisclosureUiModel;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C301011 c301011 = new C301011(this.$goldEarningsCalculatorUiModel, this.$goldEarningsDisclosureUiModel, continuation);
            c301011.L$0 = obj;
            return c301011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateQueuedAchDepositViewState createQueuedAchDepositViewState, Continuation<? super CreateQueuedAchDepositViewState> continuation) {
            return ((C301011) create(createQueuedAchDepositViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CreateQueuedAchDepositViewState.copy$default((CreateQueuedAchDepositViewState) this.L$0, false, null, null, this.$goldEarningsCalculatorUiModel, this.$goldEarningsDisclosureUiModel, false, 39, null);
        }
    }
}
