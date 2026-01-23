package com.robinhood.android.lib.trade.util;

import com.robinhood.librobinhood.data.store.suitability.CombinedQuestionnaireStore;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RunSuitabilityChecks.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aP\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\nH\u0080@¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"runCarAndSuitabilityChecks", "", "nextQuestionnaireFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore$Questionnaire;", "", "launchCar", "Lkotlin/Function0;", "launchSuitability", "Lkotlin/Function2;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-lib-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.trade.util.RunSuitabilityChecksKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class RunSuitabilityChecks {

    /* compiled from: RunSuitabilityChecks.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore$Questionnaire;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.trade.util.RunSuitabilityChecksKt$runCarAndSuitabilityChecks$2", m3645f = "RunSuitabilityChecks.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.trade.util.RunSuitabilityChecksKt$runCarAndSuitabilityChecks$2 */
    static final class C206632 extends ContinuationImpl7 implements Function2<Tuples2<? extends CombinedQuestionnaireStore.Questionnaire, ? extends String>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $launchCar;
        final /* synthetic */ Function2<Boolean, String, Unit> $launchSuitability;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C206632(Function0<Unit> function0, Function2<? super Boolean, ? super String, Unit> function2, Continuation<? super C206632> continuation) {
            super(2, continuation);
            this.$launchCar = function0;
            this.$launchSuitability = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C206632 c206632 = new C206632(this.$launchCar, this.$launchSuitability, continuation);
            c206632.L$0 = obj;
            return c206632;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends CombinedQuestionnaireStore.Questionnaire, ? extends String> tuples2, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<? extends CombinedQuestionnaireStore.Questionnaire, String>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<? extends CombinedQuestionnaireStore.Questionnaire, String> tuples2, Continuation<? super Unit> continuation) {
            return ((C206632) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            CombinedQuestionnaireStore.Questionnaire questionnaire = (CombinedQuestionnaireStore.Questionnaire) tuples2.component1();
            String str = (String) tuples2.component2();
            if (Intrinsics.areEqual(questionnaire, CombinedQuestionnaireStore.Questionnaire.Car.INSTANCE)) {
                this.$launchCar.invoke();
            } else {
                if (!(questionnaire instanceof CombinedQuestionnaireStore.Questionnaire.Suitability)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.$launchSuitability.invoke(boxing.boxBoolean(((CombinedQuestionnaireStore.Questionnaire.Suitability) questionnaire).getForce()), str);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Object runCarAndSuitabilityChecks(Flow<? extends Tuples2<? extends CombinedQuestionnaireStore.Questionnaire, String>> flow, Function0<Unit> function0, Function2<? super Boolean, ? super String, Unit> function2, Continuation<? super Unit> continuation) {
        Object objCollectLatest = FlowKt.collectLatest(flow, new C206632(function0, function2, null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }
}
