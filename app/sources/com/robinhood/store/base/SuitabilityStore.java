package com.robinhood.store.base;

import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.boxing;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SuitabilityStore.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J4\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00040\u00032\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000bJ4\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00040\u00032\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\fH¦@¢\u0006\u0002\u0010\rJ4\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00040\u00032\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/store/base/SuitabilityStore;", "", "shouldForceSuitability", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "", "", "Lcom/robinhood/store/base/SuitabilityQuestionnaireContext;", "accountNumber", "side", "Lcom/robinhood/models/db/OrderSide;", "(Ljava/lang/String;Lcom/robinhood/models/db/OrderSide;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/db/EquityOrderSide;", "(Ljava/lang/String;Lcom/robinhood/models/db/EquityOrderSide;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "positionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "(Ljava/lang/String;Lcom/robinhood/models/db/OrderPositionEffect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSuitabilityQuestionnaireContext", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Stub", "lib-store-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface SuitabilityStore {

    /* renamed from: Stub, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Object getSuitabilityQuestionnaireContext(String str, Continuation<? super String> continuation);

    Object shouldForceSuitability(String str, EquityOrderSide equityOrderSide, Continuation<? super Flow<Tuples2<Boolean, String>>> continuation);

    Object shouldForceSuitability(String str, OrderPositionEffect orderPositionEffect, Continuation<? super Flow<Tuples2<Boolean, String>>> continuation);

    Object shouldForceSuitability(String str, OrderSide orderSide, Continuation<? super Flow<Tuples2<Boolean, String>>> continuation);

    /* compiled from: SuitabilityStore.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\bj\u0002`\t0\u00060\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ4\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\bj\u0002`\t0\u00060\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u000fJ4\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\bj\u0002`\t0\u00060\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/store/base/SuitabilityStore$Stub;", "Lcom/robinhood/store/base/SuitabilityStore;", "<init>", "()V", "shouldForceSuitability", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "", "", "Lcom/robinhood/store/base/SuitabilityQuestionnaireContext;", "accountNumber", "side", "Lcom/robinhood/models/db/OrderSide;", "(Ljava/lang/String;Lcom/robinhood/models/db/OrderSide;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/db/EquityOrderSide;", "(Ljava/lang/String;Lcom/robinhood/models/db/EquityOrderSide;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "positionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "(Ljava/lang/String;Lcom/robinhood/models/db/OrderPositionEffect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSuitabilityQuestionnaireContext", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.store.base.SuitabilityStore$Stub, reason: from kotlin metadata */
    public static final class Companion implements SuitabilityStore {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Override // com.robinhood.store.base.SuitabilityStore
        public Object getSuitabilityQuestionnaireContext(String str, Continuation<? super String> continuation) {
            return null;
        }

        private Companion() {
        }

        @Override // com.robinhood.store.base.SuitabilityStore
        public Object shouldForceSuitability(String str, OrderSide orderSide, Continuation<? super Flow<Tuples2<Boolean, String>>> continuation) {
            return FlowKt.flowOf(Tuples4.m3642to(boxing.boxBoolean(false), ""));
        }

        @Override // com.robinhood.store.base.SuitabilityStore
        public Object shouldForceSuitability(String str, EquityOrderSide equityOrderSide, Continuation<? super Flow<Tuples2<Boolean, String>>> continuation) {
            return FlowKt.flowOf(Tuples4.m3642to(boxing.boxBoolean(false), ""));
        }

        @Override // com.robinhood.store.base.SuitabilityStore
        public Object shouldForceSuitability(String str, OrderPositionEffect orderPositionEffect, Continuation<? super Flow<Tuples2<Boolean, String>>> continuation) {
            return FlowKt.flowOf(Tuples4.m3642to(boxing.boxBoolean(false), ""));
        }
    }
}
