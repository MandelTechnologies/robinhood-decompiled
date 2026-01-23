package com.robinhood.android.directdeposit.p101ui.p102v3;

import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.p370rx.delay.CompletableDelay2;
import io.reactivex.Completable;
import io.reactivex.functions.Action;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: DirectDepositV3ManualSetupDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3ManualSetupDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3ManualSetupViewState;", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositSetupCompletedEvent;", "accountRoutingDetailsStore", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "emailDirectDepositInformation", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class DirectDepositV3ManualSetupDuxo extends BaseDuxo5<DirectDepositV3ManualSetupViewState, DirectDepositV3ManualSetupDuxo2> {
    public static final long AUTO_FORWARD_EMAIL_WAIT_TIME = 2000;
    private final AccountRoutingDetailsStore accountRoutingDetailsStore;
    private final MinervaAccountStore minervaAccountStore;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectDepositV3ManualSetupDuxo(AccountRoutingDetailsStore accountRoutingDetailsStore, MinervaAccountStore minervaAccountStore, DuxoBundle duxoBundle) {
        super(new DirectDepositV3ManualSetupViewState(null, null, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(accountRoutingDetailsStore, "accountRoutingDetailsStore");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountRoutingDetailsStore = accountRoutingDetailsStore;
        this.minervaAccountStore = minervaAccountStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.accountRoutingDetailsStore.fetchSpendingOrCashManagementRoutingDetails(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositV3ManualSetupDuxo.onStart$lambda$0(this.f$0, (AccountRoutingDetailsStore.RoutingDetails) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(DirectDepositV3ManualSetupDuxo directDepositV3ManualSetupDuxo, AccountRoutingDetailsStore.RoutingDetails routingDetails) {
        Intrinsics.checkNotNullParameter(routingDetails, "routingDetails");
        directDepositV3ManualSetupDuxo.applyMutation(new DirectDepositV3ManualSetupDuxo5(routingDetails, null));
        return Unit.INSTANCE;
    }

    /* compiled from: DirectDepositV3ManualSetupDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3ManualSetupViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupDuxo$emailDirectDepositInformation$1", m3645f = "DirectDepositV3ManualSetupDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupDuxo$emailDirectDepositInformation$1 */
    static final class C141621 extends ContinuationImpl7 implements Function2<DirectDepositV3ManualSetupViewState, Continuation<? super DirectDepositV3ManualSetupViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C141621(Continuation<? super C141621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C141621 c141621 = new C141621(continuation);
            c141621.L$0 = obj;
            return c141621;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DirectDepositV3ManualSetupViewState directDepositV3ManualSetupViewState, Continuation<? super DirectDepositV3ManualSetupViewState> continuation) {
            return ((C141621) create(directDepositV3ManualSetupViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DirectDepositV3ManualSetupViewState.copy$default((DirectDepositV3ManualSetupViewState) this.L$0, null, DirectDepositV3ManualSetupViewState2.EMAIL_SENDING, 1, null);
        }
    }

    public final void emailDirectDepositInformation() {
        applyMutation(new C141621(null));
        Completable completableDoOnComplete = CompletableDelay2.minTimeInFlight$default(this.minervaAccountStore.cmSunsetEmailAccountInfo(), 1000L, null, 2, null).doOnComplete(new Action() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupDuxo.emailDirectDepositInformation.2

            /* compiled from: DirectDepositV3ManualSetupDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupDuxo$emailDirectDepositInformation$2$1", m3645f = "DirectDepositV3ManualSetupDuxo.kt", m3646l = {43}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupDuxo$emailDirectDepositInformation$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ DirectDepositV3ManualSetupDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(DirectDepositV3ManualSetupDuxo directDepositV3ManualSetupDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = directDepositV3ManualSetupDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.this$0.submit(DirectDepositV3ManualSetupDuxo2.INSTANCE);
                    return Unit.INSTANCE;
                }
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                BuildersKt__Builders_commonKt.launch$default(DirectDepositV3ManualSetupDuxo.this.getLifecycleScope(), null, null, new AnonymousClass1(DirectDepositV3ManualSetupDuxo.this, null), 3, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoOnComplete, "doOnComplete(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoOnComplete, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectDepositV3ManualSetupDuxo.emailDirectDepositInformation$lambda$1(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositV3ManualSetupDuxo.emailDirectDepositInformation$lambda$2(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit emailDirectDepositInformation$lambda$1(DirectDepositV3ManualSetupDuxo directDepositV3ManualSetupDuxo) {
        directDepositV3ManualSetupDuxo.applyMutation(new DirectDepositV3ManualSetupDuxo3(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit emailDirectDepositInformation$lambda$2(DirectDepositV3ManualSetupDuxo directDepositV3ManualSetupDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        directDepositV3ManualSetupDuxo.applyMutation(new DirectDepositV3ManualSetupDuxo4(null));
        return Unit.INSTANCE;
    }
}
