package com.robinhood.feature.sweep.onboarding;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedCompletable;
import com.robinhood.feature.sweep.onboarding.SweepOnboardingEnrollmentDuxo;
import com.robinhood.feature.sweep.onboarding.SweepOnboardingEnrollmentViewState;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentAction;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.models.api.bonfire.ApiGoldSweepEnrollment;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: SweepOnboardingEnrollmentDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingEnrollmentDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingEnrollmentViewState;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "<init>", "(Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;)V", "enrollSweep", "", "accountNumber", "", "isWithGold", "", "enrollSweepWithGold", "enrollSweepWithoutGold", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class SweepOnboardingEnrollmentDuxo extends OldBaseDuxo<SweepOnboardingEnrollmentViewState> {
    public static final int $stable = 8;
    private final SweepEnrollmentStore sweepEnrollmentStore;
    private final SweepsInterestStore sweepsInterestStore;

    /* compiled from: SweepOnboardingEnrollmentDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiGoldSweepEnrollment.Status.values().length];
            try {
                iArr[ApiGoldSweepEnrollment.Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiGoldSweepEnrollment.Status.SWEEP_ENROLLMENT_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiGoldSweepEnrollment.Status.GOLD_UPGRADE_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SweepOnboardingEnrollmentDuxo(SweepEnrollmentStore sweepEnrollmentStore, SweepsInterestStore sweepsInterestStore) {
        super(SweepOnboardingEnrollmentViewState.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        this.sweepEnrollmentStore = sweepEnrollmentStore;
        this.sweepsInterestStore = sweepsInterestStore;
    }

    public final void enrollSweep(String accountNumber, boolean isWithGold) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        if (isWithGold) {
            enrollSweepWithGold(accountNumber);
        } else {
            enrollSweepWithoutGold(accountNumber);
        }
    }

    private final void enrollSweepWithGold(final String accountNumber) {
        LifecycleHost.DefaultImpls.bind$default(this, this.sweepEnrollmentStore.enrollGoldSweep(accountNumber), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.feature.sweep.onboarding.SweepOnboardingEnrollmentDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SweepOnboardingEnrollmentDuxo.enrollSweepWithGold$lambda$1(this.f$0, accountNumber, (ApiGoldSweepEnrollment) obj);
            }
        }, new Function1() { // from class: com.robinhood.feature.sweep.onboarding.SweepOnboardingEnrollmentDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SweepOnboardingEnrollmentDuxo.enrollSweepWithGold$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enrollSweepWithGold$lambda$1(SweepOnboardingEnrollmentDuxo sweepOnboardingEnrollmentDuxo, String str, final ApiGoldSweepEnrollment goldSweepEnrollment) {
        Intrinsics.checkNotNullParameter(goldSweepEnrollment, "goldSweepEnrollment");
        sweepOnboardingEnrollmentDuxo.sweepsInterestStore.refreshNoAccountNumber(true);
        sweepOnboardingEnrollmentDuxo.sweepsInterestStore.refresh(str, true);
        sweepOnboardingEnrollmentDuxo.applyMutation(new Function1() { // from class: com.robinhood.feature.sweep.onboarding.SweepOnboardingEnrollmentDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SweepOnboardingEnrollmentDuxo.enrollSweepWithGold$lambda$1$lambda$0(goldSweepEnrollment, (SweepOnboardingEnrollmentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SweepOnboardingEnrollmentViewState enrollSweepWithGold$lambda$1$lambda$0(ApiGoldSweepEnrollment apiGoldSweepEnrollment, SweepOnboardingEnrollmentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        int i = WhenMappings.$EnumSwitchMapping$0[apiGoldSweepEnrollment.getStatus().ordinal()];
        if (i == 1) {
            return SweepOnboardingEnrollmentViewState.Success.INSTANCE;
        }
        if (i == 2 || i == 3) {
            return new SweepOnboardingEnrollmentViewState.Incomplete(StringResource.INSTANCE.invoke(apiGoldSweepEnrollment.getDisplay_status_message()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enrollSweepWithGold$lambda$3(SweepOnboardingEnrollmentDuxo sweepOnboardingEnrollmentDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        sweepOnboardingEnrollmentDuxo.applyMutation(new Function1() { // from class: com.robinhood.feature.sweep.onboarding.SweepOnboardingEnrollmentDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SweepOnboardingEnrollmentDuxo.enrollSweepWithGold$lambda$3$lambda$2((SweepOnboardingEnrollmentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SweepOnboardingEnrollmentViewState enrollSweepWithGold$lambda$3$lambda$2(SweepOnboardingEnrollmentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new SweepOnboardingEnrollmentViewState.Incomplete(StringResource.INSTANCE.invoke(C11048R.string.error_description_something_went_wrong, new Object[0]));
    }

    /* compiled from: SweepOnboardingEnrollmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.feature.sweep.onboarding.SweepOnboardingEnrollmentDuxo$enrollSweepWithoutGold$1", m3645f = "SweepOnboardingEnrollmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.feature.sweep.onboarding.SweepOnboardingEnrollmentDuxo$enrollSweepWithoutGold$1 */
    static final class C331901 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C331901(String str, Continuation<? super C331901> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SweepOnboardingEnrollmentDuxo.this.new C331901(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C331901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SweepOnboardingEnrollmentDuxo sweepOnboardingEnrollmentDuxo = SweepOnboardingEnrollmentDuxo.this;
            ScopedCompletable scopedCompletableBind$default = LifecycleHost.DefaultImpls.bind$default(sweepOnboardingEnrollmentDuxo, sweepOnboardingEnrollmentDuxo.sweepEnrollmentStore.updateSweepEnrollment(this.$accountNumber, SweepEnrollmentAction.ENROLL), (LifecycleEvent) null, 1, (Object) null);
            final SweepOnboardingEnrollmentDuxo sweepOnboardingEnrollmentDuxo2 = SweepOnboardingEnrollmentDuxo.this;
            Function0<Unit> function0 = new Function0() { // from class: com.robinhood.feature.sweep.onboarding.SweepOnboardingEnrollmentDuxo$enrollSweepWithoutGold$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SweepOnboardingEnrollmentDuxo.C331901.invokeSuspend$lambda$1(sweepOnboardingEnrollmentDuxo2);
                }
            };
            final SweepOnboardingEnrollmentDuxo sweepOnboardingEnrollmentDuxo3 = SweepOnboardingEnrollmentDuxo.this;
            scopedCompletableBind$default.subscribeKotlin(function0, new Function1() { // from class: com.robinhood.feature.sweep.onboarding.SweepOnboardingEnrollmentDuxo$enrollSweepWithoutGold$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SweepOnboardingEnrollmentDuxo.C331901.invokeSuspend$lambda$3(sweepOnboardingEnrollmentDuxo3, (Throwable) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(SweepOnboardingEnrollmentDuxo sweepOnboardingEnrollmentDuxo) {
            sweepOnboardingEnrollmentDuxo.applyMutation(new Function1() { // from class: com.robinhood.feature.sweep.onboarding.SweepOnboardingEnrollmentDuxo$enrollSweepWithoutGold$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SweepOnboardingEnrollmentDuxo.C331901.invokeSuspend$lambda$1$lambda$0((SweepOnboardingEnrollmentViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SweepOnboardingEnrollmentViewState invokeSuspend$lambda$1$lambda$0(SweepOnboardingEnrollmentViewState sweepOnboardingEnrollmentViewState) {
            return SweepOnboardingEnrollmentViewState.Success.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(SweepOnboardingEnrollmentDuxo sweepOnboardingEnrollmentDuxo, final Throwable th) {
            sweepOnboardingEnrollmentDuxo.applyMutation(new Function1() { // from class: com.robinhood.feature.sweep.onboarding.SweepOnboardingEnrollmentDuxo$enrollSweepWithoutGold$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SweepOnboardingEnrollmentDuxo.C331901.invokeSuspend$lambda$3$lambda$2(th, (SweepOnboardingEnrollmentViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SweepOnboardingEnrollmentViewState invokeSuspend$lambda$3$lambda$2(Throwable th, SweepOnboardingEnrollmentViewState sweepOnboardingEnrollmentViewState) {
            return new SweepOnboardingEnrollmentViewState.Error(th);
        }
    }

    private final void enrollSweepWithoutGold(String accountNumber) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C331901(accountNumber, null), 3, null);
    }
}
