package com.robinhood.android.margin.upgrade.p175uk.investorprofile;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.margin.upgrade.p175uk.investorprofile.UkMarginOnboardingInvestorProfileState2;
import com.robinhood.android.margin.upgrade.p175uk.investorprofile.UkMarginOnboardingQuestionnaireFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: UkMarginOnboardingInvestorProfileDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0014B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileDataState;", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileViewState;", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "investmentProfileStore", "Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;", "stateProvider", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class UkMarginOnboardingInvestorProfileDuxo extends BaseDuxo3<UkMarginOnboardingInvestorProfileDataState, UkMarginOnboardingInvestorProfileState3, UkMarginOnboardingInvestorProfileState2> implements HasSavedState {
    private final InvestmentProfileStore investmentProfileStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UkMarginOnboardingInvestorProfileDuxo(InvestmentProfileStore investmentProfileStore, UkMarginOnboardingInvestorProfileStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new UkMarginOnboardingInvestorProfileDataState(((UkMarginOnboardingQuestionnaireFragment.Args) INSTANCE.getArgs(savedStateHandle)).getProductContext(), null, 2, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(investmentProfileStore, "investmentProfileStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.investmentProfileStore = investmentProfileStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        if (!((UkMarginOnboardingQuestionnaireFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getSkipCompletionCheck()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C212342(null), 3, null);
        } else {
            applyMutation(new C212331(null));
        }
    }

    /* compiled from: UkMarginOnboardingInvestorProfileDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingInvestorProfileDuxo$onCreate$1", m3645f = "UkMarginOnboardingInvestorProfileDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingInvestorProfileDuxo$onCreate$1 */
    static final class C212331 extends ContinuationImpl7 implements Function2<UkMarginOnboardingInvestorProfileDataState, Continuation<? super UkMarginOnboardingInvestorProfileDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C212331(Continuation<? super C212331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C212331 c212331 = new C212331(continuation);
            c212331.L$0 = obj;
            return c212331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UkMarginOnboardingInvestorProfileDataState ukMarginOnboardingInvestorProfileDataState, Continuation<? super UkMarginOnboardingInvestorProfileDataState> continuation) {
            return ((C212331) create(ukMarginOnboardingInvestorProfileDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return UkMarginOnboardingInvestorProfileDataState.copy$default((UkMarginOnboardingInvestorProfileDataState) this.L$0, null, boxing.boxBoolean(false), 1, null);
        }
    }

    /* compiled from: UkMarginOnboardingInvestorProfileDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingInvestorProfileDuxo$onCreate$2", m3645f = "UkMarginOnboardingInvestorProfileDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingInvestorProfileDuxo$onCreate$2 */
    static final class C212342 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C212342(Continuation<? super C212342> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UkMarginOnboardingInvestorProfileDuxo.this.new C212342(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C212342) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Companion companion = UkMarginOnboardingInvestorProfileDuxo.INSTANCE;
                    String productContext = ((UkMarginOnboardingQuestionnaireFragment.Args) companion.getArgs((HasSavedState) UkMarginOnboardingInvestorProfileDuxo.this)).getProductContext();
                    String accountNumber = ((UkMarginOnboardingQuestionnaireFragment.Args) companion.getArgs((HasSavedState) UkMarginOnboardingInvestorProfileDuxo.this)).getAccountNumber();
                    Observable observableAndThen = UkMarginOnboardingInvestorProfileDuxo.this.investmentProfileStore.fetchQuestionnaireCompleted(productContext, accountNumber, true).andThen(UkMarginOnboardingInvestorProfileDuxo.this.investmentProfileStore.getQuestionnaireCompleted(productContext, accountNumber));
                    Intrinsics.checkNotNullExpressionValue(observableAndThen, "andThen(...)");
                    this.label = 1;
                    obj = RxAwait3.awaitFirst(observableAndThen, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                UkMarginOnboardingInvestorProfileDuxo.this.applyMutation(new AnonymousClass1((Boolean) obj, null));
            } catch (Exception e) {
                UkMarginOnboardingInvestorProfileDuxo.this.submit(new UkMarginOnboardingInvestorProfileState2.Error(e));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: UkMarginOnboardingInvestorProfileDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingInvestorProfileDuxo$onCreate$2$1", m3645f = "UkMarginOnboardingInvestorProfileDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingInvestorProfileDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UkMarginOnboardingInvestorProfileDataState, Continuation<? super UkMarginOnboardingInvestorProfileDataState>, Object> {
            final /* synthetic */ Boolean $isQuestionnaireComplete;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Boolean bool, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$isQuestionnaireComplete = bool;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isQuestionnaireComplete, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UkMarginOnboardingInvestorProfileDataState ukMarginOnboardingInvestorProfileDataState, Continuation<? super UkMarginOnboardingInvestorProfileDataState> continuation) {
                return ((AnonymousClass1) create(ukMarginOnboardingInvestorProfileDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return UkMarginOnboardingInvestorProfileDataState.copy$default((UkMarginOnboardingInvestorProfileDataState) this.L$0, null, this.$isQuestionnaireComplete, 1, null);
            }
        }
    }

    /* compiled from: UkMarginOnboardingInvestorProfileDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileDuxo;", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingQuestionnaireFragment$Args;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<UkMarginOnboardingInvestorProfileDuxo, UkMarginOnboardingQuestionnaireFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public UkMarginOnboardingQuestionnaireFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (UkMarginOnboardingQuestionnaireFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public UkMarginOnboardingQuestionnaireFragment.Args getArgs(UkMarginOnboardingInvestorProfileDuxo ukMarginOnboardingInvestorProfileDuxo) {
            return (UkMarginOnboardingQuestionnaireFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, ukMarginOnboardingInvestorProfileDuxo);
        }
    }
}
