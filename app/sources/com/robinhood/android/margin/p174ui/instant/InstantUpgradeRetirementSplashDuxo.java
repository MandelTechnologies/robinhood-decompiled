package com.robinhood.android.margin.p174ui.instant;

import com.robinhood.android.lib.margin.api.RetirementInstantUpgradeApi;
import com.robinhood.android.margin.p174ui.instant.InstantUpgradeRetirementSplashDuxo;
import com.robinhood.android.margin.p174ui.instant.InstantUpgradeRetirementSplashDuxo2;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import io.reactivex.Observable;
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

/* compiled from: InstantUpgradeRetirementSplashDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashState;", "instantUpgradeApi", "Lcom/robinhood/android/lib/margin/api/RetirementInstantUpgradeApi;", "<init>", "(Lcom/robinhood/android/lib/margin/api/RetirementInstantUpgradeApi;)V", "onStart", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class InstantUpgradeRetirementSplashDuxo extends OldBaseDuxo<InstantUpgradeRetirementSplashDuxo2> {
    public static final int $stable = 8;
    private final RetirementInstantUpgradeApi instantUpgradeApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstantUpgradeRetirementSplashDuxo(RetirementInstantUpgradeApi instantUpgradeApi) {
        super(InstantUpgradeRetirementSplashDuxo2.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(instantUpgradeApi, "instantUpgradeApi");
        this.instantUpgradeApi = instantUpgradeApi;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Observable observable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C210671(null), 1, null).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observable, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstantUpgradeRetirementSplashDuxo.onStart$lambda$1(this.f$0, (ApiRetirementSignUpFlow.InstantDepositsViewModel) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstantUpgradeRetirementSplashDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* compiled from: InstantUpgradeRetirementSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$InstantDepositsViewModel;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashDuxo$onStart$1", m3645f = "InstantUpgradeRetirementSplashDuxo.kt", m3646l = {33}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashDuxo$onStart$1 */
    static final class C210671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiRetirementSignUpFlow.InstantDepositsViewModel>, Object> {
        int label;

        C210671(Continuation<? super C210671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstantUpgradeRetirementSplashDuxo.this.new C210671(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiRetirementSignUpFlow.InstantDepositsViewModel> continuation) {
            return ((C210671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InstantUpgradeRetirementSplashDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashDuxo$onStart$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return InstantUpgradeRetirementSplashDuxo.C210671.invokeSuspend$lambda$0((InstantUpgradeRetirementSplashDuxo2) obj2);
                }
            });
            RetirementInstantUpgradeApi retirementInstantUpgradeApi = InstantUpgradeRetirementSplashDuxo.this.instantUpgradeApi;
            this.label = 1;
            Object splashScreen = retirementInstantUpgradeApi.getSplashScreen(this);
            return splashScreen == coroutine_suspended ? coroutine_suspended : splashScreen;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InstantUpgradeRetirementSplashDuxo2 invokeSuspend$lambda$0(InstantUpgradeRetirementSplashDuxo2 instantUpgradeRetirementSplashDuxo2) {
            return InstantUpgradeRetirementSplashDuxo2.Loading.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(InstantUpgradeRetirementSplashDuxo instantUpgradeRetirementSplashDuxo, final ApiRetirementSignUpFlow.InstantDepositsViewModel instantDepositsViewModel) {
        instantUpgradeRetirementSplashDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstantUpgradeRetirementSplashDuxo.onStart$lambda$1$lambda$0(instantDepositsViewModel, (InstantUpgradeRetirementSplashDuxo2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstantUpgradeRetirementSplashDuxo2 onStart$lambda$1$lambda$0(ApiRetirementSignUpFlow.InstantDepositsViewModel instantDepositsViewModel, InstantUpgradeRetirementSplashDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(instantDepositsViewModel);
        return new InstantUpgradeRetirementSplashDuxo2.ShowInstantSplash(instantDepositsViewModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(InstantUpgradeRetirementSplashDuxo instantUpgradeRetirementSplashDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        instantUpgradeRetirementSplashDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstantUpgradeRetirementSplashDuxo.onStart$lambda$3$lambda$2(throwable, (InstantUpgradeRetirementSplashDuxo2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstantUpgradeRetirementSplashDuxo2 onStart$lambda$3$lambda$2(Throwable th, InstantUpgradeRetirementSplashDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new InstantUpgradeRetirementSplashDuxo2.Error(th);
    }
}
