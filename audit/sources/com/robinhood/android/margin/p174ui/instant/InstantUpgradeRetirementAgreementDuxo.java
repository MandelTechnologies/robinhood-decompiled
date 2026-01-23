package com.robinhood.android.margin.p174ui.instant;

import com.robinhood.android.lib.margin.api.RetirementInstantUpgradeApi;
import com.robinhood.android.margin.p174ui.instant.InstantUpgradeRetirementAgreementDuxo;
import com.robinhood.android.margin.p174ui.instant.InstantUpgradeRetirementAgreementDuxo2;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
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

/* compiled from: InstantUpgradeRetirementAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementAgreementDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementAgreementState;", "instantUpgradeApi", "Lcom/robinhood/android/lib/margin/api/RetirementInstantUpgradeApi;", "<init>", "(Lcom/robinhood/android/lib/margin/api/RetirementInstantUpgradeApi;)V", "onStart", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class InstantUpgradeRetirementAgreementDuxo extends OldBaseDuxo<InstantUpgradeRetirementAgreementDuxo2> {
    public static final int $stable = 8;
    private final RetirementInstantUpgradeApi instantUpgradeApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstantUpgradeRetirementAgreementDuxo(RetirementInstantUpgradeApi instantUpgradeApi) {
        super(InstantUpgradeRetirementAgreementDuxo2.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(instantUpgradeApi, "instantUpgradeApi");
        this.instantUpgradeApi = instantUpgradeApi;
    }

    /* compiled from: InstantUpgradeRetirementAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$RetirementAgreementViewModel;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementDuxo$onStart$1", m3645f = "InstantUpgradeRetirementAgreementDuxo.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementDuxo$onStart$1 */
    static final class C210511 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiRetirementSignUpFlow.RetirementAgreementViewModel>, Object> {
        int label;

        C210511(Continuation<? super C210511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstantUpgradeRetirementAgreementDuxo.this.new C210511(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiRetirementSignUpFlow.RetirementAgreementViewModel> continuation) {
            return ((C210511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InstantUpgradeRetirementAgreementDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementDuxo$onStart$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return InstantUpgradeRetirementAgreementDuxo.C210511.invokeSuspend$lambda$0((InstantUpgradeRetirementAgreementDuxo2) obj2);
                }
            });
            RetirementInstantUpgradeApi retirementInstantUpgradeApi = InstantUpgradeRetirementAgreementDuxo.this.instantUpgradeApi;
            this.label = 1;
            Object marginAgreement = retirementInstantUpgradeApi.getMarginAgreement(this);
            return marginAgreement == coroutine_suspended ? coroutine_suspended : marginAgreement;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InstantUpgradeRetirementAgreementDuxo2 invokeSuspend$lambda$0(InstantUpgradeRetirementAgreementDuxo2 instantUpgradeRetirementAgreementDuxo2) {
            return InstantUpgradeRetirementAgreementDuxo2.Loading.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C210511(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstantUpgradeRetirementAgreementDuxo.onStart$lambda$1(this.f$0, (ApiRetirementSignUpFlow.RetirementAgreementViewModel) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstantUpgradeRetirementAgreementDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(InstantUpgradeRetirementAgreementDuxo instantUpgradeRetirementAgreementDuxo, final ApiRetirementSignUpFlow.RetirementAgreementViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        instantUpgradeRetirementAgreementDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstantUpgradeRetirementAgreementDuxo.onStart$lambda$1$lambda$0(viewModel, (InstantUpgradeRetirementAgreementDuxo2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstantUpgradeRetirementAgreementDuxo2 onStart$lambda$1$lambda$0(ApiRetirementSignUpFlow.RetirementAgreementViewModel retirementAgreementViewModel, InstantUpgradeRetirementAgreementDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new InstantUpgradeRetirementAgreementDuxo2.ShowInstantAgreement(retirementAgreementViewModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(InstantUpgradeRetirementAgreementDuxo instantUpgradeRetirementAgreementDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        instantUpgradeRetirementAgreementDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementAgreementDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstantUpgradeRetirementAgreementDuxo.onStart$lambda$3$lambda$2(throwable, (InstantUpgradeRetirementAgreementDuxo2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstantUpgradeRetirementAgreementDuxo2 onStart$lambda$3$lambda$2(Throwable th, InstantUpgradeRetirementAgreementDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new InstantUpgradeRetirementAgreementDuxo2.Error(th);
    }
}
