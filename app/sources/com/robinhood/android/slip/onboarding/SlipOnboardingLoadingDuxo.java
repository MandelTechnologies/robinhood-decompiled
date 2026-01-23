package com.robinhood.android.slip.onboarding;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.slip.onboarding.SlipOnboardingLoadingEvent;
import com.robinhood.android.slip.onboarding.SlipOnboardingLoadingFragment;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.SlipEligibilityStore;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipStatusStore;
import com.robinhood.models.p320db.SlipAccountsStatusResponse;
import com.robinhood.models.p320db.SlipEnabledResponse;
import com.robinhood.models.p355ui.UiSlipOnboardingEligibility;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Singles;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SlipOnboardingLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingLoadingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingLoadingViewState;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingLoadingEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "slipEligibilityStore", "Lcom/robinhood/librobinhood/data/store/SlipEligibilityStore;", "slipStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipStatusStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/SlipEligibilityStore;Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipStatusStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SlipOnboardingLoadingDuxo extends BaseDuxo5<SlipOnboardingLoadingViewState, SlipOnboardingLoadingEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final SavedStateHandle savedStateHandle;
    private final SlipEligibilityStore slipEligibilityStore;
    private final SlipStatusStore slipStatusStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipOnboardingLoadingDuxo(AccountProvider accountProvider, SlipEligibilityStore slipEligibilityStore, SlipStatusStore slipStatusStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new SlipOnboardingLoadingViewState(false, null, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(slipEligibilityStore, "slipEligibilityStore");
        Intrinsics.checkNotNullParameter(slipStatusStore, "slipStatusStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.slipEligibilityStore = slipEligibilityStore;
        this.slipStatusStore = slipStatusStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        Single<Optional<String>> individualAccountNumber;
        super.onStart();
        String accountNumber = ((SlipOnboardingLoadingFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber();
        if (accountNumber != null) {
            individualAccountNumber = Single.just(Optional3.asOptional(accountNumber));
            Intrinsics.checkNotNull(individualAccountNumber);
        } else {
            individualAccountNumber = this.accountProvider.getIndividualAccountNumber();
        }
        Single<R> singleFlatMap = individualAccountNumber.flatMap(new Function() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingLoadingDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Tuples3<UiSlipOnboardingEligibility, SlipAccountsStatusResponse, String>> apply(Optional<String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String orNull = it.getOrNull();
                if (orNull == null) {
                    throw new IllegalStateException("User needs an account to get SLIP eligibility");
                }
                Singles singles = Singles.INSTANCE;
                Single<UiSlipOnboardingEligibility> onboardingEligibility = SlipOnboardingLoadingDuxo.this.slipEligibilityStore.getOnboardingEligibility(orNull);
                SlipOnboardingLoadingDuxo slipOnboardingLoadingDuxo = SlipOnboardingLoadingDuxo.this;
                Single singleRxSingle$default = RxFactory.DefaultImpls.rxSingle$default(slipOnboardingLoadingDuxo, null, new AnonymousClass1(slipOnboardingLoadingDuxo, null), 1, null);
                Single singleJust = Single.just(orNull);
                Intrinsics.checkNotNullExpressionValue(singleJust, "just(...)");
                return singles.zip(onboardingEligibility, singleRxSingle$default, singleJust);
            }

            /* compiled from: SlipOnboardingLoadingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/SlipAccountsStatusResponse;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.SlipOnboardingLoadingDuxo$onStart$1$1", m3645f = "SlipOnboardingLoadingDuxo.kt", m3646l = {43}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.slip.onboarding.SlipOnboardingLoadingDuxo$onStart$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super SlipAccountsStatusResponse>, Object> {
                int label;
                final /* synthetic */ SlipOnboardingLoadingDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SlipOnboardingLoadingDuxo slipOnboardingLoadingDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = slipOnboardingLoadingDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SlipAccountsStatusResponse> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    SlipStatusStore slipStatusStore = this.this$0.slipStatusStore;
                    this.label = 1;
                    Object slipStatus = slipStatusStore.getSlipStatus(this);
                    return slipStatus == coroutine_suspended ? coroutine_suspended : slipStatus;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingLoadingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingLoadingDuxo.onStart$lambda$1(this.f$0, (Tuples3) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.slip.onboarding.SlipOnboardingLoadingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipOnboardingLoadingDuxo.onStart$lambda$2(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(SlipOnboardingLoadingDuxo slipOnboardingLoadingDuxo, Tuples3 tuples3) {
        Object next;
        UiSlipOnboardingEligibility uiSlipOnboardingEligibility = (UiSlipOnboardingEligibility) tuples3.component1();
        SlipAccountsStatusResponse slipAccountsStatusResponse = (SlipAccountsStatusResponse) tuples3.component2();
        String str = (String) tuples3.component3();
        Iterator<T> it = slipAccountsStatusResponse.getResults().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((SlipEnabledResponse) next).getAccountNumber(), str)) {
                break;
            }
        }
        SlipEnabledResponse slipEnabledResponse = (SlipEnabledResponse) next;
        boolean zIsEnabled = slipEnabledResponse != null ? slipEnabledResponse.isEnabled() : false;
        Intrinsics.checkNotNull(uiSlipOnboardingEligibility);
        slipOnboardingLoadingDuxo.submit(new SlipOnboardingLoadingEvent.EligibilityReceived(uiSlipOnboardingEligibility, zIsEnabled));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(SlipOnboardingLoadingDuxo slipOnboardingLoadingDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        slipOnboardingLoadingDuxo.submit(new SlipOnboardingLoadingEvent.EligibilityError(throwable));
        return Unit.INSTANCE;
    }

    /* compiled from: SlipOnboardingLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingLoadingDuxo;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingLoadingFragment$Args;", "<init>", "()V", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SlipOnboardingLoadingDuxo, SlipOnboardingLoadingFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SlipOnboardingLoadingFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (SlipOnboardingLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SlipOnboardingLoadingFragment.Args getArgs(SlipOnboardingLoadingDuxo slipOnboardingLoadingDuxo) {
            return (SlipOnboardingLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, slipOnboardingLoadingDuxo);
        }
    }
}
