package com.robinhood.android.cash.rhy.tab.p077v2.settings;

import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.minerva.RhyMigrationVariables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RhyMailCardDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhyMailCardDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhyMailCardViewState;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "<init>", "(Lcom/robinhood/api/retrofit/Minerva;)V", "onStart", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RhyMailCardDuxo extends OldBaseDuxo<RhyMailCardViewState> {
    public static final int $stable = 8;
    private final Minerva minerva;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RhyMailCardDuxo(Minerva minerva) {
        super(new RhyMailCardViewState(false, null, 3, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        this.minerva = minerva;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C103241(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyMailCardDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyMailCardDuxo.onStart$lambda$1(this.f$0, (RhyMigrationVariables) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyMailCardDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyMailCardDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: RhyMailCardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/minerva/RhyMigrationVariables;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.settings.RhyMailCardDuxo$onStart$1", m3645f = "RhyMailCardDuxo.kt", m3646l = {16}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.settings.RhyMailCardDuxo$onStart$1 */
    static final class C103241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super RhyMigrationVariables>, Object> {
        int label;

        C103241(Continuation<? super C103241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyMailCardDuxo.this.new C103241(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RhyMigrationVariables> continuation) {
            return ((C103241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Minerva minerva = RhyMailCardDuxo.this.minerva;
            this.label = 1;
            Object rhyMigrationVariables = minerva.getRhyMigrationVariables(this);
            return rhyMigrationVariables == coroutine_suspended ? coroutine_suspended : rhyMigrationVariables;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RhyMailCardDuxo rhyMailCardDuxo, final RhyMigrationVariables vars) {
        Intrinsics.checkNotNullParameter(vars, "vars");
        rhyMailCardDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyMailCardDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyMailCardDuxo.onStart$lambda$1$lambda$0(vars, (RhyMailCardViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyMailCardViewState onStart$lambda$1$lambda$0(RhyMigrationVariables rhyMigrationVariables, RhyMailCardViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(false, rhyMigrationVariables.getCard_eta_string());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(RhyMailCardDuxo rhyMailCardDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyMailCardDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.settings.RhyMailCardDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyMailCardDuxo.onStart$lambda$3$lambda$2((RhyMailCardViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhyMailCardViewState onStart$lambda$3$lambda$2(RhyMailCardViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(false, null);
    }
}
