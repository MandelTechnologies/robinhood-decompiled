package com.robinhood.android.investorprofile.p162ui.profile;

import com.plaid.internal.EnumC7081g;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import options_product.service.ConfirmUserAnswersRequestDto;

/* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onRiskToleranceUpdated$3$1", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onRiskToleranceUpdated$3$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InvestmentProfileSettingsBonfireIdentiDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $answerId;
    int label;
    final /* synthetic */ InvestmentProfileSettingsBonfireIdentiDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestmentProfileSettingsBonfireIdentiDuxo4(InvestmentProfileSettingsBonfireIdentiDuxo investmentProfileSettingsBonfireIdentiDuxo, UUID uuid, Continuation<? super InvestmentProfileSettingsBonfireIdentiDuxo4> continuation) {
        super(2, continuation);
        this.this$0 = investmentProfileSettingsBonfireIdentiDuxo;
        this.$answerId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestmentProfileSettingsBonfireIdentiDuxo4(this.this$0, this.$answerId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestmentProfileSettingsBonfireIdentiDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final StateFlow<InvestmentProfileSettingsBonfireIdentiViewState> stateFlow = this.this$0.getStateFlow();
            Flow<String> flow = new Flow<String>() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onRiskToleranceUpdated$3$1$invokeSuspend$$inlined$mapNotNull$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                    Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onRiskToleranceUpdated$3$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onRiskToleranceUpdated$3$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {52}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onRiskToleranceUpdated$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            String selectedAccountNumber = ((InvestmentProfileSettingsBonfireIdentiViewState) obj).getSelectedAccountNumber();
                            if (selectedAccountNumber != null) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(selectedAccountNumber, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            final InvestmentProfileSettingsBonfireIdentiDuxo investmentProfileSettingsBonfireIdentiDuxo = this.this$0;
            final UUID uuid = this.$answerId;
            FlowCollector<? super String> flowCollector = new FlowCollector() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onRiskToleranceUpdated$3$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((String) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(String str, Continuation<? super Unit> continuation) {
                    Object objConfirmUserAnswers = investmentProfileSettingsBonfireIdentiDuxo.onboardingService.ConfirmUserAnswers(new ConfirmUserAnswersRequestDto((List<String>) CollectionsKt.listOf(uuid.toString()), str), continuation);
                    return objConfirmUserAnswers == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objConfirmUserAnswers : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flow.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
