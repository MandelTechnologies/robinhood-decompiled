package com.robinhood.android.optionsexercise;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiOptionExerciseChecks;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.optionsexercise.OptionExerciseConfirmationDuxo$onCreate$1$4$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "OptionExerciseConfirmationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsexercise.OptionExerciseConfirmationDuxo$onCreate$1$4$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes11.dex */
public final class C24660x15ef876c extends ContinuationImpl7 implements Function3<FlowCollector<? super Optional<? extends ApiOptionExerciseChecks>>, UUID, Continuation<? super Unit>, Object> {
    final /* synthetic */ Observable $accountObs$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OptionExerciseConfirmationDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24660x15ef876c(Continuation continuation, Observable observable, OptionExerciseConfirmationDuxo optionExerciseConfirmationDuxo) {
        super(3, continuation);
        this.$accountObs$inlined = observable;
        this.this$0 = optionExerciseConfirmationDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Optional<? extends ApiOptionExerciseChecks>> flowCollector, UUID uuid, Continuation<? super Unit> continuation) {
        C24660x15ef876c c24660x15ef876c = new C24660x15ef876c(continuation, this.$accountObs$inlined, this.this$0);
        c24660x15ef876c.L$0 = flowCollector;
        c24660x15ef876c.L$1 = uuid;
        return c24660x15ef876c.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final UUID uuid = (UUID) this.L$1;
            Observable observable = this.$accountObs$inlined;
            final OptionExerciseConfirmationDuxo optionExerciseConfirmationDuxo = this.this$0;
            Observable observableFlatMapSingle = observable.flatMapSingle(new Function() { // from class: com.robinhood.android.optionsexercise.OptionExerciseConfirmationDuxo$onCreate$1$4$2$1

                /* compiled from: OptionExerciseConfirmationDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/ApiOptionExerciseChecks;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionsexercise.OptionExerciseConfirmationDuxo$onCreate$1$4$2$1$1", m3645f = "OptionExerciseConfirmationDuxo.kt", m3646l = {116}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseConfirmationDuxo$onCreate$1$4$2$1$1 */
                static final class C246641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends ApiOptionExerciseChecks>>, Object> {
                    final /* synthetic */ Account $account;
                    final /* synthetic */ UUID $optionInstrumentId;
                    int label;
                    final /* synthetic */ OptionExerciseConfirmationDuxo this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C246641(OptionExerciseConfirmationDuxo optionExerciseConfirmationDuxo, Account account, UUID uuid, Continuation<? super C246641> continuation) {
                        super(2, continuation);
                        this.this$0 = optionExerciseConfirmationDuxo;
                        this.$account = account;
                        this.$optionInstrumentId = uuid;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C246641(this.this$0, this.$account, this.$optionInstrumentId, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends ApiOptionExerciseChecks>> continuation) {
                        return invoke2(coroutineScope, (Continuation<? super Optional<ApiOptionExerciseChecks>>) continuation);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<ApiOptionExerciseChecks>> continuation) {
                        return ((C246641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Endpoint<Tuples2<String, UUID>, ApiOptionExerciseChecks> getOptionExerciseChecks = this.this$0.optionExerciseStore.getGetOptionExerciseChecks();
                            Tuples2<String, UUID> tuples2M3642to = Tuples4.m3642to(this.$account.getAccountNumber(), this.$optionInstrumentId);
                            this.label = 1;
                            obj = getOptionExerciseChecks.raw(tuples2M3642to, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Optional3.asOptional(obj);
                    }
                }

                @Override // io.reactivex.functions.Function
                public final SingleSource<? extends Optional<ApiOptionExerciseChecks>> apply(Account account) {
                    Intrinsics.checkNotNullParameter(account, "account");
                    OptionExerciseConfirmationDuxo optionExerciseConfirmationDuxo2 = optionExerciseConfirmationDuxo;
                    return RxFactory.DefaultImpls.rxSingle$default(optionExerciseConfirmationDuxo2, null, new C246641(optionExerciseConfirmationDuxo2, account, uuid, null), 1, null);
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableFlatMapSingle, "flatMapSingle(...)");
            Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ObservablesKt.ignoreNetworkExceptions(observableFlatMapSingle)), Integer.MAX_VALUE, null, 2, null);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowBuffer$default, this) == coroutine_suspended) {
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
