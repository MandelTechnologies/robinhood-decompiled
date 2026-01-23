package com.robinhood.librobinhood.data.store.suitability;

import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.i18n.car.CarSuitabilityType;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.base.SuitabilityStore;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CombinedQuestionnaireStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore;", "Lcom/robinhood/store/Store;", "suitabilityStore", "Lcom/robinhood/store/base/SuitabilityStore;", "carSuitabilityStore", "Lcom/robinhood/librobinhood/data/store/suitability/CarSuitabilityStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/store/base/SuitabilityStore;Lcom/robinhood/librobinhood/data/store/suitability/CarSuitabilityStore;Lcom/robinhood/store/StoreBundle;)V", "streamNextQuestionnaire", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore$Questionnaire;", "", "accountNumber", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "carSuitabilityType", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType;", "(Ljava/lang/String;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/shared/i18n/car/CarSuitabilityType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Questionnaire", "lib-store-suitability_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CombinedQuestionnaireStore extends Store {
    private final CarSuitabilityStore carSuitabilityStore;
    private final SuitabilityStore suitabilityStore;

    /* compiled from: CombinedQuestionnaireStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.suitability.CombinedQuestionnaireStore", m3645f = "CombinedQuestionnaireStore.kt", m3646l = {38}, m3647m = "streamNextQuestionnaire")
    /* renamed from: com.robinhood.librobinhood.data.store.suitability.CombinedQuestionnaireStore$streamNextQuestionnaire$1 */
    static final class C348831 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C348831(Continuation<? super C348831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CombinedQuestionnaireStore.this.streamNextQuestionnaire(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedQuestionnaireStore(SuitabilityStore suitabilityStore, CarSuitabilityStore carSuitabilityStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
        Intrinsics.checkNotNullParameter(carSuitabilityStore, "carSuitabilityStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.suitabilityStore = suitabilityStore;
        this.carSuitabilityStore = carSuitabilityStore;
    }

    /* compiled from: CombinedQuestionnaireStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore$Questionnaire;", "", "Car", "Suitability", "Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore$Questionnaire$Car;", "Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore$Questionnaire$Suitability;", "lib-store-suitability_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Questionnaire {

        /* compiled from: CombinedQuestionnaireStore.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore$Questionnaire$Car;", "Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore$Questionnaire;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-suitability_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Car implements Questionnaire {
            public static final Car INSTANCE = new Car();

            public boolean equals(Object other) {
                return this == other || (other instanceof Car);
            }

            public int hashCode() {
                return -1927590456;
            }

            public String toString() {
                return "Car";
            }

            private Car() {
            }
        }

        /* compiled from: CombinedQuestionnaireStore.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore$Questionnaire$Suitability;", "Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore$Questionnaire;", "force", "", "<init>", "(Z)V", "getForce", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-store-suitability_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Suitability implements Questionnaire {
            private final boolean force;

            public static /* synthetic */ Suitability copy$default(Suitability suitability, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = suitability.force;
                }
                return suitability.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getForce() {
                return this.force;
            }

            public final Suitability copy(boolean force) {
                return new Suitability(force);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Suitability) && this.force == ((Suitability) other).force;
            }

            public int hashCode() {
                return Boolean.hashCode(this.force);
            }

            public String toString() {
                return "Suitability(force=" + this.force + ")";
            }

            public Suitability(boolean z) {
                this.force = z;
            }

            public final boolean getForce() {
                return this.force;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object streamNextQuestionnaire(String str, OrderSide orderSide, CarSuitabilityType carSuitabilityType, Continuation<? super Flow<? extends Tuples2<? extends Questionnaire, String>>> continuation) {
        C348831 c348831;
        Flow<Boolean> flow;
        if (continuation instanceof C348831) {
            c348831 = (C348831) continuation;
            int i = c348831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c348831.label = i - Integer.MIN_VALUE;
            } else {
                c348831 = new C348831(continuation);
            }
        }
        Object objShouldForceSuitability = c348831.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c348831.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objShouldForceSuitability);
            Flow<Boolean> flowStreamCarRequired = this.carSuitabilityStore.streamCarRequired(str, carSuitabilityType);
            SuitabilityStore suitabilityStore = this.suitabilityStore;
            c348831.L$0 = flowStreamCarRequired;
            c348831.label = 1;
            objShouldForceSuitability = suitabilityStore.shouldForceSuitability(str, orderSide, c348831);
            if (objShouldForceSuitability == coroutine_suspended) {
                return coroutine_suspended;
            }
            flow = flowStreamCarRequired;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flow = (Flow) c348831.L$0;
            ResultKt.throwOnFailure(objShouldForceSuitability);
        }
        return FlowKt.m28818catch(FlowKt.combine(flow, (Flow) objShouldForceSuitability, new C348842(null)), new C348853(null));
    }

    /* compiled from: CombinedQuestionnaireStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u00060\u0003j\u0002`\u00070\u0001H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore$Questionnaire;", "", "isCarRequired", "", "<destruct>", "Lcom/robinhood/store/base/SuitabilityQuestionnaireContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.suitability.CombinedQuestionnaireStore$streamNextQuestionnaire$2", m3645f = "CombinedQuestionnaireStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.suitability.CombinedQuestionnaireStore$streamNextQuestionnaire$2 */
    static final class C348842 extends ContinuationImpl7 implements Function3<Boolean, Tuples2<? extends Boolean, ? extends String>, Continuation<? super Tuples2<? extends Questionnaire, ? extends String>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        C348842(Continuation<? super C348842> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Tuples2<? extends Boolean, ? extends String> tuples2, Continuation<? super Tuples2<? extends Questionnaire, ? extends String>> continuation) {
            return invoke(bool.booleanValue(), (Tuples2<Boolean, String>) tuples2, (Continuation<? super Tuples2<? extends Questionnaire, String>>) continuation);
        }

        public final Object invoke(boolean z, Tuples2<Boolean, String> tuples2, Continuation<? super Tuples2<? extends Questionnaire, String>> continuation) {
            C348842 c348842 = new C348842(continuation);
            c348842.Z$0 = z;
            c348842.L$0 = tuples2;
            return c348842.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = this.Z$0;
            Tuples2 tuples2 = (Tuples2) this.L$0;
            boolean zBooleanValue = ((Boolean) tuples2.component1()).booleanValue();
            String str = (String) tuples2.component2();
            if (z) {
                return Tuples4.m3642to(Questionnaire.Car.INSTANCE, QuestionnaireContexts.CAR_SUITABILITY);
            }
            return Tuples4.m3642to(new Questionnaire.Suitability(zBooleanValue), str);
        }
    }

    /* compiled from: CombinedQuestionnaireStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/suitability/CombinedQuestionnaireStore$Questionnaire;", "", "error", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.suitability.CombinedQuestionnaireStore$streamNextQuestionnaire$3", m3645f = "CombinedQuestionnaireStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.suitability.CombinedQuestionnaireStore$streamNextQuestionnaire$3 */
    static final class C348853 extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends Questionnaire, ? extends String>>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C348853(Continuation<? super C348853> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Tuples2<? extends Questionnaire, ? extends String>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Tuples2<? extends Questionnaire, String>>) flowCollector, th, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Tuples2<? extends Questionnaire, String>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            C348853 c348853 = new C348853(continuation);
            c348853.L$0 = th;
            return c348853.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, (Throwable) this.L$0, false, null, 6, null);
            return Unit.INSTANCE;
        }
    }
}
