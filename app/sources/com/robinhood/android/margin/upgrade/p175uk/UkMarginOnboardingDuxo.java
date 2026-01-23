package com.robinhood.android.margin.upgrade.p175uk;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistViewState4;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.MarginEligibilityStore;
import com.robinhood.android.lib.margin.MarginInvestingInfoStore;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility2;
import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.android.margin.contracts.UkMarginOnboardingContinuationIntentKey;
import com.robinhood.android.margin.upgrade.p175uk.UkMarginOnboardingViewState2;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.util.Money;
import io.reactivex.Single;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: UkMarginOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001'B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0018\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0002J\u0006\u0010\u001e\u001a\u00020\u0019J\u000e\u0010\u001f\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u001aJ\u0006\u0010 \u001a\u00020\u0019J\u0006\u0010!\u001a\u00020\u0019J\u0006\u0010\"\u001a\u00020\u0019J\u0006\u0010#\u001a\u00020\u0019J\u0006\u0010$\u001a\u00020\u0019J\u000e\u0010%\u001a\u00020&H\u0082@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingViewState;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "marginInvestingInfoStore", "Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "marginEligibilityStore", "Lcom/robinhood/android/lib/margin/MarginEligibilityStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/lib/margin/MarginEligibilityStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "_eligibilityFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility;", "eligibilityFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "fetchAndEmitEligibility", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMarginFlow", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "eligibility", "checkSuitability", "checkExperienceAndKnowledgeQuestionnaires", "checkPostExperienceQuestionnaire", "checkPostKnowledgeQuestionnaire", "fetchAndShowTieredMarginRates", "fetchAndShowSetMarginLimit", "fetchNewMarginLimitAndShowConfirmation", "getAccountDisplayName", "Lcom/robinhood/android/account/strings/DisplayName;", "Companion", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class UkMarginOnboardingDuxo extends BaseDuxo5<UkMarginOnboardingViewState, UkMarginOnboardingViewState2> implements HasSavedState {
    private final SharedFlow2<ApiMarginEligibility> _eligibilityFlow;
    private final AccountProvider accountProvider;
    private final SharedFlow<ApiMarginEligibility> eligibilityFlow;
    private final MarginEligibilityStore marginEligibilityStore;
    private final MarginInvestingInfoStore marginInvestingInfoStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: UkMarginOnboardingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo", m3645f = "UkMarginOnboardingDuxo.kt", m3646l = {91, 92}, m3647m = "checkExperienceAndKnowledgeQuestionnaires")
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$checkExperienceAndKnowledgeQuestionnaires$1 */
    static final class C212211 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C212211(Continuation<? super C212211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UkMarginOnboardingDuxo.this.checkExperienceAndKnowledgeQuestionnaires(this);
        }
    }

    /* compiled from: UkMarginOnboardingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo", m3645f = "UkMarginOnboardingDuxo.kt", m3646l = {47, 48}, m3647m = "fetchAndEmitEligibility")
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$fetchAndEmitEligibility$1 */
    static final class C212261 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C212261(Continuation<? super C212261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UkMarginOnboardingDuxo.this.fetchAndEmitEligibility(this);
        }
    }

    /* compiled from: UkMarginOnboardingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo", m3645f = "UkMarginOnboardingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE}, m3647m = "getAccountDisplayName")
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$getAccountDisplayName$1 */
    static final class C212301 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C212301(Continuation<? super C212301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UkMarginOnboardingDuxo.this.getAccountDisplayName(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UkMarginOnboardingDuxo(MarginInvestingInfoStore marginInvestingInfoStore, AccountProvider accountProvider, MarginEligibilityStore marginEligibilityStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new UkMarginOnboardingViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(marginInvestingInfoStore, "marginInvestingInfoStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(marginEligibilityStore, "marginEligibilityStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.marginInvestingInfoStore = marginInvestingInfoStore;
        this.accountProvider = accountProvider;
        this.marginEligibilityStore = marginEligibilityStore;
        this.savedStateHandle = savedStateHandle;
        SharedFlow2<ApiMarginEligibility> sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
        this._eligibilityFlow = sharedFlow2MutableSharedFlow$default;
        this.eligibilityFlow = FlowKt.asSharedFlow(sharedFlow2MutableSharedFlow$default);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C212201(null), 3, null);
    }

    /* compiled from: UkMarginOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$1", m3645f = "UkMarginOnboardingDuxo.kt", m3646l = {42}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$1 */
    static final class C212201 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C212201(Continuation<? super C212201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UkMarginOnboardingDuxo.this.new C212201(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C212201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UkMarginOnboardingDuxo ukMarginOnboardingDuxo = UkMarginOnboardingDuxo.this;
                this.label = 1;
                if (ukMarginOnboardingDuxo.fetchAndEmitEligibility(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r1.emit((com.robinhood.android.lib.margin.api.ApiMarginEligibility) r9, r4) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAndEmitEligibility(Continuation<? super Unit> continuation) {
        C212261 c212261;
        if (continuation instanceof C212261) {
            c212261 = (C212261) continuation;
            int i = c212261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c212261.label = i - Integer.MIN_VALUE;
            } else {
                c212261 = new C212261(continuation);
            }
        }
        C212261 c2122612 = c212261;
        Object marginEligibility$default = c2122612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2122612.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(marginEligibility$default);
            MarginEligibilityStore marginEligibilityStore = this.marginEligibilityStore;
            String accountNumber = ((UkMarginOnboardingContinuationIntentKey) INSTANCE.getExtras((HasSavedState) this)).getAccountNumber();
            c2122612.label = 1;
            marginEligibility$default = MarginEligibilityStore.getMarginEligibility$default(marginEligibilityStore, accountNumber, false, c2122612, 2, null);
            if (marginEligibility$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(marginEligibility$default);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(marginEligibility$default);
        SharedFlow2<ApiMarginEligibility> sharedFlow2 = this._eligibilityFlow;
        c2122612.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarginEligibilityChecklistViewState4 getMarginFlow(ApiMarginEligibility eligibility) {
        if (eligibility.getIsSkip2KEligible()) {
            ApiMarginEligibility2.AccountBalance accountBalance = eligibility.getAccountBalance();
            Money minimumDeposit = accountBalance != null ? accountBalance.getMinimumDeposit() : null;
            ApiMarginEligibility2.AccountBalance accountBalance2 = eligibility.getAccountBalance();
            return new MarginEligibilityChecklistViewState4.Skip2KCheck(minimumDeposit, accountBalance2 != null ? accountBalance2.getRecommendedDeposit() : null);
        }
        return MarginEligibilityChecklistViewState4.Default.INSTANCE;
    }

    /* compiled from: UkMarginOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$checkSuitability$1", m3645f = "UkMarginOnboardingDuxo.kt", m3646l = {74, 77, 80}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$checkSuitability$1 */
    static final class C212251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C212251(Continuation<? super C212251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UkMarginOnboardingDuxo.this.new C212251(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C212251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        
            if (r12.checkExperienceAndKnowledgeQuestionnaires(r11) == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
        
            if (r12 == r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C212251 c212251;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MarginEligibilityStore marginEligibilityStore = UkMarginOnboardingDuxo.this.marginEligibilityStore;
                String accountNumber = ((UkMarginOnboardingContinuationIntentKey) UkMarginOnboardingDuxo.INSTANCE.getExtras((HasSavedState) UkMarginOnboardingDuxo.this)).getAccountNumber();
                this.label = 1;
                obj = MarginEligibilityStore.getMarginEligibility$default(marginEligibilityStore, accountNumber, false, this, 2, null);
                c212251 = this;
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c212251 = this;
                ApiMarginEligibility.ApiMarginUpgradeBlocked marginUpgradeBlocked = ((ApiMarginEligibility) obj).getMarginUpgradeBlocked();
                if (marginUpgradeBlocked != null) {
                    UkMarginOnboardingDuxo.this.submit(new UkMarginOnboardingViewState2.MarginUpgradeBlocked(marginUpgradeBlocked));
                    return Unit.INSTANCE;
                }
                UkMarginOnboardingDuxo.this.submit(UkMarginOnboardingViewState2.Exit.INSTANCE);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            c212251 = this;
            for (ApiMarginEligibility2 apiMarginEligibility2 : ((ApiMarginEligibility) obj).getItems()) {
                if (apiMarginEligibility2 instanceof ApiMarginEligibility2.Suitability) {
                    if (!apiMarginEligibility2.getPassed()) {
                        MarginEligibilityStore marginEligibilityStore2 = UkMarginOnboardingDuxo.this.marginEligibilityStore;
                        String accountNumber2 = ((UkMarginOnboardingContinuationIntentKey) UkMarginOnboardingDuxo.INSTANCE.getExtras((HasSavedState) UkMarginOnboardingDuxo.this)).getAccountNumber();
                        c212251.label = 3;
                        obj = MarginEligibilityStore.updateMarginEligibilityCooldown$default(marginEligibilityStore2, accountNumber2, false, c212251, 2, null);
                    } else {
                        UkMarginOnboardingDuxo ukMarginOnboardingDuxo = UkMarginOnboardingDuxo.this;
                        c212251.label = 2;
                    }
                    return coroutine_suspended;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    public final void checkSuitability() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C212251(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkExperienceAndKnowledgeQuestionnaires(Continuation<? super Unit> continuation) {
        C212211 c212211;
        UkMarginOnboardingViewState2 ukMarginOnboardingViewState2;
        if (continuation instanceof C212211) {
            c212211 = (C212211) continuation;
            int i = c212211.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c212211.label = i - Integer.MIN_VALUE;
            } else {
                c212211 = new C212211(continuation);
            }
        }
        Object objFirst = c212211.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c212211.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            c212211.label = 1;
            if (fetchAndEmitEligibility(c212211) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
            for (Object obj : ((ApiMarginEligibility) objFirst).getItems()) {
                if (((ApiMarginEligibility2) obj) instanceof ApiMarginEligibility2.KnowledgeExperienceGb) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.robinhood.android.lib.margin.api.ApiMarginEligibilityCheck.KnowledgeExperienceGb");
                    ApiMarginEligibility2.KnowledgeExperienceGb knowledgeExperienceGb = (ApiMarginEligibility2.KnowledgeExperienceGb) obj;
                    applyMutation(new C212222(knowledgeExperienceGb, null));
                    if (Intrinsics.areEqual(knowledgeExperienceGb.getShouldShowMarginExperience(), boxing.boxBoolean(true))) {
                        ukMarginOnboardingViewState2 = UkMarginOnboardingViewState2.LaunchExperienceQuestionnaire.INSTANCE;
                    } else if (Intrinsics.areEqual(knowledgeExperienceGb.getShouldShowKnowledgeTest(), boxing.boxBoolean(true))) {
                        ukMarginOnboardingViewState2 = UkMarginOnboardingViewState2.LaunchKnowledgeQuestionnaire.INSTANCE;
                    } else {
                        ukMarginOnboardingViewState2 = UkMarginOnboardingViewState2.LaunchEligibilityChecks.INSTANCE;
                    }
                    submit(ukMarginOnboardingViewState2);
                    return Unit.INSTANCE;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        ResultKt.throwOnFailure(objFirst);
        SharedFlow<ApiMarginEligibility> sharedFlow = this.eligibilityFlow;
        c212211.label = 2;
        objFirst = FlowKt.first(sharedFlow, c212211);
    }

    /* compiled from: UkMarginOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$checkExperienceAndKnowledgeQuestionnaires$2", m3645f = "UkMarginOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$checkExperienceAndKnowledgeQuestionnaires$2 */
    static final class C212222 extends ContinuationImpl7 implements Function2<UkMarginOnboardingViewState, Continuation<? super UkMarginOnboardingViewState>, Object> {
        final /* synthetic */ ApiMarginEligibility2.KnowledgeExperienceGb $knowledgeExperienceCheck;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C212222(ApiMarginEligibility2.KnowledgeExperienceGb knowledgeExperienceGb, Continuation<? super C212222> continuation) {
            super(2, continuation);
            this.$knowledgeExperienceCheck = knowledgeExperienceGb;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C212222 c212222 = new C212222(this.$knowledgeExperienceCheck, continuation);
            c212222.L$0 = obj;
            return c212222;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UkMarginOnboardingViewState ukMarginOnboardingViewState, Continuation<? super UkMarginOnboardingViewState> continuation) {
            return ((C212222) create(ukMarginOnboardingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((UkMarginOnboardingViewState) this.L$0).copy(this.$knowledgeExperienceCheck.getShouldShowKnowledgeTest());
        }
    }

    public final void checkPostExperienceQuestionnaire() {
        if (!Intrinsics.areEqual(getStateFlow().getValue().getShouldShowMarginKnowledgeTest(), Boolean.TRUE)) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C212231(null), 3, null);
        } else {
            submit(UkMarginOnboardingViewState2.LaunchKnowledgeQuestionnaire.INSTANCE);
        }
    }

    /* compiled from: UkMarginOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$checkPostExperienceQuestionnaire$1", m3645f = "UkMarginOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$checkPostExperienceQuestionnaire$1 */
    static final class C212231 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C212231(Continuation<? super C212231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UkMarginOnboardingDuxo.this.new C212231(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C212231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UkMarginOnboardingDuxo.this.submit(UkMarginOnboardingViewState2.LaunchEligibilityChecks.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: UkMarginOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$checkPostKnowledgeQuestionnaire$1", m3645f = "UkMarginOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$checkPostKnowledgeQuestionnaire$1 */
    static final class C212241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C212241(Continuation<? super C212241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UkMarginOnboardingDuxo.this.new C212241(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C212241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UkMarginOnboardingDuxo.this.submit(UkMarginOnboardingViewState2.LaunchEligibilityChecks.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    public final void checkPostKnowledgeQuestionnaire() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C212241(null), 3, null);
    }

    /* compiled from: UkMarginOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$fetchAndShowTieredMarginRates$1", m3645f = "UkMarginOnboardingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$fetchAndShowTieredMarginRates$1 */
    static final class C212281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C212281(Continuation<? super C212281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UkMarginOnboardingDuxo.this.new C212281(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C212281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String accountNumber;
            UkMarginOnboardingDuxo ukMarginOnboardingDuxo;
            UkMarginOnboardingDuxo ukMarginOnboardingDuxo2;
            Object accountDisplayName;
            MarginEligibilityChecklistViewState4 marginEligibilityChecklistViewState4;
            UkMarginOnboardingDuxo ukMarginOnboardingDuxo3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UkMarginOnboardingDuxo ukMarginOnboardingDuxo4 = UkMarginOnboardingDuxo.this;
                this.label = 1;
                if (ukMarginOnboardingDuxo4.fetchAndEmitEligibility(this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    marginEligibilityChecklistViewState4 = (MarginEligibilityChecklistViewState4) this.L$2;
                    accountNumber = (String) this.L$1;
                    ukMarginOnboardingDuxo3 = (UkMarginOnboardingDuxo) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    ukMarginOnboardingDuxo3.submit(new UkMarginOnboardingViewState2.LaunchTieredRates(accountNumber, marginEligibilityChecklistViewState4, (DisplayName) obj));
                    return Unit.INSTANCE;
                }
                UkMarginOnboardingDuxo ukMarginOnboardingDuxo5 = (UkMarginOnboardingDuxo) this.L$2;
                String str = (String) this.L$1;
                UkMarginOnboardingDuxo ukMarginOnboardingDuxo6 = (UkMarginOnboardingDuxo) this.L$0;
                ResultKt.throwOnFailure(obj);
                ukMarginOnboardingDuxo = ukMarginOnboardingDuxo5;
                accountNumber = str;
                ukMarginOnboardingDuxo2 = ukMarginOnboardingDuxo6;
                MarginEligibilityChecklistViewState4 marginFlow = ukMarginOnboardingDuxo.getMarginFlow((ApiMarginEligibility) obj);
                UkMarginOnboardingDuxo ukMarginOnboardingDuxo7 = UkMarginOnboardingDuxo.this;
                this.L$0 = ukMarginOnboardingDuxo2;
                this.L$1 = accountNumber;
                this.L$2 = marginFlow;
                this.label = 3;
                accountDisplayName = ukMarginOnboardingDuxo7.getAccountDisplayName(this);
                if (accountDisplayName != coroutine_suspended) {
                    marginEligibilityChecklistViewState4 = marginFlow;
                    obj = accountDisplayName;
                    ukMarginOnboardingDuxo3 = ukMarginOnboardingDuxo2;
                    ukMarginOnboardingDuxo3.submit(new UkMarginOnboardingViewState2.LaunchTieredRates(accountNumber, marginEligibilityChecklistViewState4, (DisplayName) obj));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
            UkMarginOnboardingDuxo ukMarginOnboardingDuxo8 = UkMarginOnboardingDuxo.this;
            accountNumber = ((UkMarginOnboardingContinuationIntentKey) UkMarginOnboardingDuxo.INSTANCE.getExtras((HasSavedState) ukMarginOnboardingDuxo8)).getAccountNumber();
            ukMarginOnboardingDuxo = UkMarginOnboardingDuxo.this;
            SharedFlow sharedFlow = ukMarginOnboardingDuxo.eligibilityFlow;
            this.L$0 = ukMarginOnboardingDuxo8;
            this.L$1 = accountNumber;
            this.L$2 = ukMarginOnboardingDuxo;
            this.label = 2;
            Object objFirst = FlowKt.first(sharedFlow, this);
            if (objFirst != coroutine_suspended) {
                ukMarginOnboardingDuxo2 = ukMarginOnboardingDuxo8;
                obj = objFirst;
                MarginEligibilityChecklistViewState4 marginFlow2 = ukMarginOnboardingDuxo.getMarginFlow((ApiMarginEligibility) obj);
                UkMarginOnboardingDuxo ukMarginOnboardingDuxo72 = UkMarginOnboardingDuxo.this;
                this.L$0 = ukMarginOnboardingDuxo2;
                this.L$1 = accountNumber;
                this.L$2 = marginFlow2;
                this.label = 3;
                accountDisplayName = ukMarginOnboardingDuxo72.getAccountDisplayName(this);
                if (accountDisplayName != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    public final void fetchAndShowTieredMarginRates() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C212281(null), 3, null);
    }

    /* compiled from: UkMarginOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$fetchAndShowSetMarginLimit$1", m3645f = "UkMarginOnboardingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$fetchAndShowSetMarginLimit$1 */
    static final class C212271 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C212271(Continuation<? super C212271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UkMarginOnboardingDuxo.this.new C212271(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C212271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MarginInvestingInfoStore marginInvestingInfoStore = UkMarginOnboardingDuxo.this.marginInvestingInfoStore;
                String accountNumber = ((UkMarginOnboardingContinuationIntentKey) UkMarginOnboardingDuxo.INSTANCE.getExtras((HasSavedState) UkMarginOnboardingDuxo.this)).getAccountNumber();
                this.label = 1;
                obj = marginInvestingInfoStore.getMarginInvestingInfo(accountNumber, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            UkMarginOnboardingDuxo.this.submit(new UkMarginOnboardingViewState2.LaunchSetMarginLimit((ApiMarginInvestingInfo) obj));
            return Unit.INSTANCE;
        }
    }

    public final void fetchAndShowSetMarginLimit() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C212271(null), 3, null);
    }

    /* compiled from: UkMarginOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$fetchNewMarginLimitAndShowConfirmation$1", m3645f = "UkMarginOnboardingDuxo.kt", m3646l = {155, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.upgrade.uk.UkMarginOnboardingDuxo$fetchNewMarginLimitAndShowConfirmation$1 */
    static final class C212291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        C212291(Continuation<? super C212291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UkMarginOnboardingDuxo.this.new C212291(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C212291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Money money;
            UkMarginOnboardingDuxo ukMarginOnboardingDuxo;
            Object objFirst;
            DisplayName displayName;
            Money money2;
            UkMarginOnboardingDuxo ukMarginOnboardingDuxo2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MarginInvestingInfoStore marginInvestingInfoStore = UkMarginOnboardingDuxo.this.marginInvestingInfoStore;
                String accountNumber = ((UkMarginOnboardingContinuationIntentKey) UkMarginOnboardingDuxo.INSTANCE.getExtras((HasSavedState) UkMarginOnboardingDuxo.this)).getAccountNumber();
                this.label = 1;
                obj = marginInvestingInfoStore.getMarginInvestingInfo(accountNumber, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ukMarginOnboardingDuxo2 = (UkMarginOnboardingDuxo) this.L$3;
                    displayName = (DisplayName) this.L$2;
                    money2 = (Money) this.L$1;
                    ukMarginOnboardingDuxo = (UkMarginOnboardingDuxo) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    ukMarginOnboardingDuxo.submit(new UkMarginOnboardingViewState2.LaunchConfirmationWithNewBuyingPower(money2, displayName, ukMarginOnboardingDuxo2.getMarginFlow((ApiMarginEligibility) obj)));
                    return Unit.INSTANCE;
                }
                money = (Money) this.L$1;
                ukMarginOnboardingDuxo = (UkMarginOnboardingDuxo) this.L$0;
                ResultKt.throwOnFailure(obj);
                DisplayName displayName2 = (DisplayName) obj;
                UkMarginOnboardingDuxo ukMarginOnboardingDuxo3 = UkMarginOnboardingDuxo.this;
                SharedFlow sharedFlow = ukMarginOnboardingDuxo3.eligibilityFlow;
                this.L$0 = ukMarginOnboardingDuxo;
                this.L$1 = money;
                this.L$2 = displayName2;
                this.L$3 = ukMarginOnboardingDuxo3;
                this.label = 3;
                objFirst = FlowKt.first(sharedFlow, this);
                if (objFirst != coroutine_suspended) {
                    Money money3 = money;
                    displayName = displayName2;
                    obj = objFirst;
                    money2 = money3;
                    ukMarginOnboardingDuxo2 = ukMarginOnboardingDuxo3;
                    ukMarginOnboardingDuxo.submit(new UkMarginOnboardingViewState2.LaunchConfirmationWithNewBuyingPower(money2, displayName, ukMarginOnboardingDuxo2.getMarginFlow((ApiMarginEligibility) obj)));
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
            UkMarginOnboardingDuxo ukMarginOnboardingDuxo4 = UkMarginOnboardingDuxo.this;
            Money buyingPowerWithUserSetLimit = ((ApiMarginInvestingInfo) obj).getBuyingPowerWithUserSetLimit();
            UkMarginOnboardingDuxo ukMarginOnboardingDuxo5 = UkMarginOnboardingDuxo.this;
            this.L$0 = ukMarginOnboardingDuxo4;
            this.L$1 = buyingPowerWithUserSetLimit;
            this.label = 2;
            Object accountDisplayName = ukMarginOnboardingDuxo5.getAccountDisplayName(this);
            if (accountDisplayName != coroutine_suspended) {
                money = buyingPowerWithUserSetLimit;
                obj = accountDisplayName;
                ukMarginOnboardingDuxo = ukMarginOnboardingDuxo4;
                DisplayName displayName22 = (DisplayName) obj;
                UkMarginOnboardingDuxo ukMarginOnboardingDuxo32 = UkMarginOnboardingDuxo.this;
                SharedFlow sharedFlow2 = ukMarginOnboardingDuxo32.eligibilityFlow;
                this.L$0 = ukMarginOnboardingDuxo;
                this.L$1 = money;
                this.L$2 = displayName22;
                this.L$3 = ukMarginOnboardingDuxo32;
                this.label = 3;
                objFirst = FlowKt.first(sharedFlow2, this);
                if (objFirst != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    public final void fetchNewMarginLimitAndShowConfirmation() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C212291(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAccountDisplayName(Continuation<? super DisplayName> continuation) {
        C212301 c212301;
        if (continuation instanceof C212301) {
            c212301 = (C212301) continuation;
            int i = c212301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c212301.label = i - Integer.MIN_VALUE;
            } else {
                c212301 = new C212301(continuation);
            }
        }
        Object objAwait = c212301.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c212301.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            Single<Account> singleFirstOrError = this.accountProvider.streamAccount(((UkMarginOnboardingContinuationIntentKey) INSTANCE.getExtras((HasSavedState) this)).getAccountNumber()).firstOrError();
            Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
            c212301.label = 1;
            objAwait = RxAwait3.await(singleFirstOrError, c212301);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
        }
        Intrinsics.checkNotNullExpressionValue(objAwait, "await(...)");
        return AccountDisplayNames.getDisplayName((Account) objAwait);
    }

    /* compiled from: UkMarginOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/margin/upgrade/uk/UkMarginOnboardingDuxo;", "Lcom/robinhood/android/margin/contracts/UkMarginOnboardingContinuationIntentKey;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<UkMarginOnboardingDuxo, UkMarginOnboardingContinuationIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public UkMarginOnboardingContinuationIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (UkMarginOnboardingContinuationIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public UkMarginOnboardingContinuationIntentKey getExtras(UkMarginOnboardingDuxo ukMarginOnboardingDuxo) {
            return (UkMarginOnboardingContinuationIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, ukMarginOnboardingDuxo);
        }
    }
}
