package com.robinhood.android.investorprofile.p162ui.profile;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.strings.BrokerageAccountTypes2;
import com.robinhood.android.investorprofile.p162ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo;
import com.robinhood.android.investorprofile.p162ui.profile.InvestmentProfileSettingsBonfireIdentiFragment;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.questionnaire.api.ApiQuestionAnswer;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireSubmitRequest;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireSubmitResponse;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionUpgradeStore;
import com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.identi.UiEmploymentInfo;
import com.robinhood.models.p355ui.investmentprofilesettings.UiInvestmentProfileSettingsResponse;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireContract2;
import com.robinhood.store.questionnaire.QuestionnaireStore;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import options_product.service.OnboardingService;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001'BI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\"\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\"J*\u0010#\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0%J\u0006\u0010#\u001a\u00020\u0019J\u000e\u0010&\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "investmentProfileStore", "Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;", "questionnaireStore", "Lcom/robinhood/store/questionnaire/QuestionnaireStore;", "optionUpgradeStore", "Lcom/robinhood/librobinhood/data/store/OptionUpgradeStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "onboardingService", "Loptions_product/service/OnboardingService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;Lcom/robinhood/store/questionnaire/QuestionnaireStore;Lcom/robinhood/librobinhood/data/store/OptionUpgradeStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Loptions_product/service/OnboardingService;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onUserEmploymentUpdated", "employment", "Lcom/robinhood/models/ui/identi/UiEmploymentInfo;", "onRiskToleranceUpdated", "accountNumber", "", "applicationId", "result", "Lcom/robinhood/shared/questionnaire/contracts/QuestionnaireResult$Completed;", "onAnnualIncomeUpdated", "questionnaireResult", "", "onAccountSelected", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestmentProfileSettingsBonfireIdentiDuxo extends BaseDuxo4<InvestmentProfileSettingsBonfireIdentiViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final ExperimentsStore experimentsStore;
    private final InvestmentProfileStore investmentProfileStore;
    private final OnboardingService onboardingService;
    private final OptionUpgradeStore optionUpgradeStore;
    private final QuestionnaireStore questionnaireStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InvestmentProfileSettingsBonfireIdentiDuxo(AccountProvider accountProvider, InvestmentProfileStore investmentProfileStore, QuestionnaireStore questionnaireStore, OptionUpgradeStore optionUpgradeStore, ExperimentsStore experimentsStore, OnboardingService onboardingService, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(investmentProfileStore, "investmentProfileStore");
        Intrinsics.checkNotNullParameter(questionnaireStore, "questionnaireStore");
        Intrinsics.checkNotNullParameter(optionUpgradeStore, "optionUpgradeStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(onboardingService, "onboardingService");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new InvestmentProfileSettingsBonfireIdentiViewState(((InvestmentProfileSettingsBonfireIdentiFragment.Args) companion.getArgs(savedStateHandle)).getAccountNumber(), null, null, null, false, null, null, null, Intrinsics.areEqual(((InvestmentProfileSettingsBonfireIdentiFragment.Args) companion.getArgs(savedStateHandle)).getProductContext(), QuestionnaireContexts.AML_REFRESH), false, false, false, ((InvestmentProfileSettingsBonfireIdentiFragment.Args) companion.getArgs(savedStateHandle)).getShowAccountSwitcher(), null, ((InvestmentProfileSettingsBonfireIdentiFragment.Args) companion.getArgs(savedStateHandle)).getTitle(), ((InvestmentProfileSettingsBonfireIdentiFragment.Args) companion.getArgs(savedStateHandle)).getSubtitle(), null, null, 208638, null), duxoBundle);
        this.accountProvider = accountProvider;
        this.investmentProfileStore = investmentProfileStore;
        this.questionnaireStore = questionnaireStore;
        this.optionUpgradeStore = optionUpgradeStore;
        this.experimentsStore = experimentsStore;
        this.onboardingService = onboardingService;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1 */
    static final class C196831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C196831(Continuation<? super C196831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C196831 c196831 = InvestmentProfileSettingsBonfireIdentiDuxo.this.new C196831(continuation);
            c196831.L$0 = obj;
            return c196831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C196831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1$1", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {73}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InvestmentProfileSettingsBonfireIdentiDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InvestmentProfileSettingsBonfireIdentiDuxo investmentProfileSettingsBonfireIdentiDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = investmentProfileSettingsBonfireIdentiDuxo;
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
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.accountProvider.streamAllAccounts()), Integer.MAX_VALUE, null, 2, null);
                    C502311 c502311 = new C502311(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, c502311, this) == coroutine_suspended) {
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

            /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accounts", "", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1$1$1", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502311 extends ContinuationImpl7 implements Function2<List<? extends Account>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InvestmentProfileSettingsBonfireIdentiDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502311(InvestmentProfileSettingsBonfireIdentiDuxo investmentProfileSettingsBonfireIdentiDuxo, Continuation<? super C502311> continuation) {
                    super(2, continuation);
                    this.this$0 = investmentProfileSettingsBonfireIdentiDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502311 c502311 = new C502311(this.this$0, continuation);
                    c502311.L$0 = obj;
                    return c502311;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends Account> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<Account>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<Account> list, Continuation<? super Unit> continuation) {
                    return ((C502311) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1$1$1$1", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C502321 extends ContinuationImpl7 implements Function2<InvestmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState>, Object> {
                    final /* synthetic */ List<Account> $accounts;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C502321(List<Account> list, Continuation<? super C502321> continuation) {
                        super(2, continuation);
                        this.$accounts = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C502321 c502321 = new C502321(this.$accounts, continuation);
                        c502321.L$0 = obj;
                        return c502321;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState> continuation) {
                        return ((C502321) create(investmentProfileSettingsBonfireIdentiViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InvestmentProfileSettingsBonfireIdentiViewState.copy$default((InvestmentProfileSettingsBonfireIdentiViewState) this.L$0, null, extensions2.toImmutableList(BrokerageAccountTypes2.sortByAccountType(this.$accounts)), null, null, false, null, null, null, false, false, false, false, false, null, null, null, null, null, 262141, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C502321((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(InvestmentProfileSettingsBonfireIdentiDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(InvestmentProfileSettingsBonfireIdentiDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1$2", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {102}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InvestmentProfileSettingsBonfireIdentiDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InvestmentProfileSettingsBonfireIdentiDuxo investmentProfileSettingsBonfireIdentiDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = investmentProfileSettingsBonfireIdentiDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flowHasRecentRejection = this.this$0.optionUpgradeStore.hasRecentRejection(null);
                    final StateFlow<InvestmentProfileSettingsBonfireIdentiViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowConnectWhen = Operators.connectWhen(FlowKt.combine(flowHasRecentRejection, FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<Account>() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1$2$invokeSuspend$$inlined$mapNotNull$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Account selectedAccount = ((InvestmentProfileSettingsBonfireIdentiViewState) obj).getSelectedAccount();
                                    if (selectedAccount != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(selectedAccount, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Account> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }), new C19673x1647fe23(null, this.this$0)), new AnonymousClass3(null)), ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{Experiments.OptionsInfoGatheringExperiment.INSTANCE}, false, null, 6, null), FlowKt.flowOf(Tuples4.m3642to(boxing.boxBoolean(false), boxing.boxBoolean(false))));
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowConnectWhen, anonymousClass4, this) == coroutine_suspended) {
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

            /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "hasRecentRejectionForAnnualIncomeQuestion", "hasRecentRejectionForRiskToleranceQuestion"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1$2$3", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1$2$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function3<Boolean, Boolean, Continuation<? super Tuples2<? extends Boolean, ? extends Boolean>>, Object> {
                /* synthetic */ boolean Z$0;
                /* synthetic */ boolean Z$1;
                int label;

                AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Tuples2<? extends Boolean, ? extends Boolean>> continuation) {
                    return invoke(bool.booleanValue(), bool2.booleanValue(), (Continuation<? super Tuples2<Boolean, Boolean>>) continuation);
                }

                public final Object invoke(boolean z, boolean z2, Continuation<? super Tuples2<Boolean, Boolean>> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                    anonymousClass3.Z$0 = z;
                    anonymousClass3.Z$1 = z2;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Tuples4.m3642to(boxing.boxBoolean(this.Z$0), boxing.boxBoolean(this.Z$1));
                }
            }

            /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1$2$4", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1$2$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<Tuples2<? extends Boolean, ? extends Boolean>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InvestmentProfileSettingsBonfireIdentiDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(InvestmentProfileSettingsBonfireIdentiDuxo investmentProfileSettingsBonfireIdentiDuxo, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.this$0 = investmentProfileSettingsBonfireIdentiDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Boolean, ? extends Boolean> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<Boolean, Boolean>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<Boolean, Boolean> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1$2$4$1", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$1$2$4$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InvestmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState>, Object> {
                    final /* synthetic */ boolean $useNewInfoGatherFlowForAnnualIncome;
                    final /* synthetic */ boolean $useNewInfoGatherFlowForRiskTolerance;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(boolean z, boolean z2, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$useNewInfoGatherFlowForAnnualIncome = z;
                        this.$useNewInfoGatherFlowForRiskTolerance = z2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$useNewInfoGatherFlowForAnnualIncome, this.$useNewInfoGatherFlowForRiskTolerance, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState> continuation) {
                        return ((AnonymousClass1) create(investmentProfileSettingsBonfireIdentiViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InvestmentProfileSettingsBonfireIdentiViewState.copy$default((InvestmentProfileSettingsBonfireIdentiViewState) this.L$0, null, null, null, null, false, null, null, null, false, false, false, false, false, null, null, null, boxing.boxBoolean(this.$useNewInfoGatherFlowForAnnualIncome), boxing.boxBoolean(this.$useNewInfoGatherFlowForRiskTolerance), Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        this.this$0.applyMutation(new AnonymousClass1(((Boolean) tuples2.component1()).booleanValue(), ((Boolean) tuples2.component2()).booleanValue(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C196831(null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C196842(null));
    }

    /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2 */
    static final class C196842 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C196842(Continuation<? super C196842> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C196842 c196842 = InvestmentProfileSettingsBonfireIdentiDuxo.this.new C196842(continuation);
            c196842.L$0 = obj;
            return c196842;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C196842) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$1", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InvestmentProfileSettingsBonfireIdentiDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InvestmentProfileSettingsBonfireIdentiDuxo investmentProfileSettingsBonfireIdentiDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = investmentProfileSettingsBonfireIdentiDuxo;
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
                    IdlingResourceCounters2.setBusy(IdlingResourceType.INVESTMENT_PROFILE_LOADING, true);
                    InvestmentProfileStore.refreshInvestmentProfile$default(this.this$0.investmentProfileStore, false, 1, null);
                    final StateFlow<InvestmentProfileSettingsBonfireIdentiViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowM28818catch = FlowKt.m28818catch(FlowKt.transformLatest(FlowKt.onEach(FlowKt.distinctUntilChanged(new Flow<Account>() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$1$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Account> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Account selectedAccount = ((InvestmentProfileSettingsBonfireIdentiViewState) obj).getSelectedAccount();
                                    if (selectedAccount != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(selectedAccount, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }), new AnonymousClass2(this.this$0, null)), new C19675xc68f4263(null, this.this$0)), new AnonymousClass4(this.this$0, null));
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowM28818catch, anonymousClass5, this) == coroutine_suspended) {
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

            /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$1$2", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InvestmentProfileSettingsBonfireIdentiDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(InvestmentProfileSettingsBonfireIdentiDuxo investmentProfileSettingsBonfireIdentiDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = investmentProfileSettingsBonfireIdentiDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$1$2$1", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C502331 extends ContinuationImpl7 implements Function2<InvestmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState>, Object> {
                    final /* synthetic */ Account $account;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C502331(Account account, Continuation<? super C502331> continuation) {
                        super(2, continuation);
                        this.$account = account;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C502331 c502331 = new C502331(this.$account, continuation);
                        c502331.L$0 = obj;
                        return c502331;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState> continuation) {
                        return ((C502331) create(investmentProfileSettingsBonfireIdentiViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InvestmentProfileSettingsBonfireIdentiViewState.copy$default((InvestmentProfileSettingsBonfireIdentiViewState) this.L$0, this.$account.getAccountNumber(), null, null, null, false, null, null, null, false, false, false, true, false, null, null, null, null, null, 259966, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C502331((Account) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/ui/investmentprofilesettings/UiInvestmentProfileSettings;", "t", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$1$4", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$1$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function3<FlowCollector<? super UiInvestmentProfileSettingsResponse>, Throwable, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InvestmentProfileSettingsBonfireIdentiDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(InvestmentProfileSettingsBonfireIdentiDuxo investmentProfileSettingsBonfireIdentiDuxo, Continuation<? super AnonymousClass4> continuation) {
                    super(3, continuation);
                    this.this$0 = investmentProfileSettingsBonfireIdentiDuxo;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super UiInvestmentProfileSettingsResponse> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                    anonymousClass4.L$0 = th;
                    return anonymousClass4.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Throwable th = (Throwable) this.L$0;
                    IdlingResourceCounters2.setBusy(IdlingResourceType.INVESTMENT_PROFILE_LOADING, false);
                    this.this$0.applyMutation(new C502341(th, null));
                    return Unit.INSTANCE;
                }

                /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$1$4$1", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$1$4$1, reason: invalid class name and collision with other inner class name */
                static final class C502341 extends ContinuationImpl7 implements Function2<InvestmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState>, Object> {

                    /* renamed from: $t */
                    final /* synthetic */ Throwable f4253$t;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C502341(Throwable th, Continuation<? super C502341> continuation) {
                        super(2, continuation);
                        this.f4253$t = th;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C502341 c502341 = new C502341(this.f4253$t, continuation);
                        c502341.L$0 = obj;
                        return c502341;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState> continuation) {
                        return ((C502341) create(investmentProfileSettingsBonfireIdentiViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InvestmentProfileSettingsBonfireIdentiViewState.copy$default((InvestmentProfileSettingsBonfireIdentiViewState) this.L$0, null, null, null, null, false, new UiEvent(this.f4253$t), null, null, false, false, false, false, false, null, null, null, null, null, 262111, null);
                    }
                }
            }

            /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "investmentProfileSettingsResponse", "Lcom/robinhood/models/ui/investmentprofilesettings/UiInvestmentProfileSettings;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$1$5", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$1$5, reason: invalid class name */
            static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<UiInvestmentProfileSettingsResponse, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InvestmentProfileSettingsBonfireIdentiDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(InvestmentProfileSettingsBonfireIdentiDuxo investmentProfileSettingsBonfireIdentiDuxo, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.this$0 = investmentProfileSettingsBonfireIdentiDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                    anonymousClass5.L$0 = obj;
                    return anonymousClass5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiInvestmentProfileSettingsResponse uiInvestmentProfileSettingsResponse, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(uiInvestmentProfileSettingsResponse, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    UiInvestmentProfileSettingsResponse uiInvestmentProfileSettingsResponse = (UiInvestmentProfileSettingsResponse) this.L$0;
                    IdlingResourceCounters2.setBusy(IdlingResourceType.INVESTMENT_PROFILE_LOADING, false);
                    this.this$0.applyMutation(new C502351(uiInvestmentProfileSettingsResponse, null));
                    return Unit.INSTANCE;
                }

                /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$1$5$1", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$1$5$1, reason: invalid class name and collision with other inner class name */
                static final class C502351 extends ContinuationImpl7 implements Function2<InvestmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState>, Object> {
                    final /* synthetic */ UiInvestmentProfileSettingsResponse $investmentProfileSettingsResponse;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C502351(UiInvestmentProfileSettingsResponse uiInvestmentProfileSettingsResponse, Continuation<? super C502351> continuation) {
                        super(2, continuation);
                        this.$investmentProfileSettingsResponse = uiInvestmentProfileSettingsResponse;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C502351 c502351 = new C502351(this.$investmentProfileSettingsResponse, continuation);
                        c502351.L$0 = obj;
                        return c502351;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState> continuation) {
                        return ((C502351) create(investmentProfileSettingsBonfireIdentiViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState = (InvestmentProfileSettingsBonfireIdentiViewState) this.L$0;
                        UiInvestmentProfileSettingsResponse uiInvestmentProfileSettingsResponse = this.$investmentProfileSettingsResponse;
                        if (uiInvestmentProfileSettingsResponse instanceof UiInvestmentProfileSettingsResponse.UnknownQuestionType) {
                            return InvestmentProfileSettingsBonfireIdentiViewState.copy$default(investmentProfileSettingsBonfireIdentiViewState, null, null, null, null, false, null, null, new UiEvent(Unit.INSTANCE), false, false, false, false, false, null, null, null, null, null, 262015, null);
                        }
                        if (!(uiInvestmentProfileSettingsResponse instanceof UiInvestmentProfileSettingsResponse.ValidResponse)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return InvestmentProfileSettingsBonfireIdentiViewState.copy$default(investmentProfileSettingsBonfireIdentiViewState, null, null, (UiInvestmentProfileSettingsResponse.ValidResponse) uiInvestmentProfileSettingsResponse, null, false, null, null, null, false, false, false, false, false, null, null, null, null, null, 260091, null);
                    }
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(InvestmentProfileSettingsBonfireIdentiDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(InvestmentProfileSettingsBonfireIdentiDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$2", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InvestmentProfileSettingsBonfireIdentiDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InvestmentProfileSettingsBonfireIdentiDuxo investmentProfileSettingsBonfireIdentiDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = investmentProfileSettingsBonfireIdentiDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                IdlingResourceType idlingResourceType = IdlingResourceType.INVESTMENT_PROFILE_SETTINGS_LOADING;
                IdlingResourceCounters2.setBusy(idlingResourceType, true);
                Companion companion = InvestmentProfileSettingsBonfireIdentiDuxo.INSTANCE;
                final String productContext = ((InvestmentProfileSettingsBonfireIdentiFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getProductContext();
                if (productContext != null) {
                    InvestmentProfileSettingsBonfireIdentiDuxo investmentProfileSettingsBonfireIdentiDuxo = this.this$0;
                    Observable observableTake = investmentProfileSettingsBonfireIdentiDuxo.investmentProfileStore.fetchQuestionnaireCompleted(productContext, ((InvestmentProfileSettingsBonfireIdentiFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getAccountNumber(), true).andThen(this.this$0.investmentProfileStore.getQuestionnaireCompleted(productContext, ((InvestmentProfileSettingsBonfireIdentiFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getAccountNumber())).take(1L);
                    Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
                    ScopedObservable scopedObservableBind$default = LifecycleHost.DefaultImpls.bind$default(investmentProfileSettingsBonfireIdentiDuxo, observableTake, (LifecycleEvent) null, 1, (Object) null);
                    final InvestmentProfileSettingsBonfireIdentiDuxo investmentProfileSettingsBonfireIdentiDuxo2 = this.this$0;
                    scopedObservableBind$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onCreate$2$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return InvestmentProfileSettingsBonfireIdentiDuxo.C196842.AnonymousClass2.invokeSuspend$lambda$0(investmentProfileSettingsBonfireIdentiDuxo2, productContext, (Boolean) obj2);
                        }
                    });
                } else {
                    IdlingResourceCounters2.setBusy(idlingResourceType, false);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(InvestmentProfileSettingsBonfireIdentiDuxo investmentProfileSettingsBonfireIdentiDuxo, String str, Boolean bool) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.INVESTMENT_PROFILE_SETTINGS_LOADING, false);
                investmentProfileSettingsBonfireIdentiDuxo.applyMutation(new InvestmentProfileSettingsBonfireIdentiDuxo3(bool, str, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onUserEmploymentUpdated$1", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onUserEmploymentUpdated$1 */
    static final class C196871 extends ContinuationImpl7 implements Function2<InvestmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState>, Object> {
        final /* synthetic */ UiEmploymentInfo $employment;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C196871(UiEmploymentInfo uiEmploymentInfo, Continuation<? super C196871> continuation) {
            super(2, continuation);
            this.$employment = uiEmploymentInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C196871 c196871 = new C196871(this.$employment, continuation);
            c196871.L$0 = obj;
            return c196871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState> continuation) {
            return ((C196871) create(investmentProfileSettingsBonfireIdentiViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InvestmentProfileSettingsBonfireIdentiViewState.copy$default((InvestmentProfileSettingsBonfireIdentiViewState) this.L$0, null, null, null, this.$employment, false, null, null, null, false, false, false, false, false, null, null, null, null, null, 262135, null);
        }
    }

    public final void onUserEmploymentUpdated(UiEmploymentInfo employment) {
        Intrinsics.checkNotNullParameter(employment, "employment");
        applyMutation(new C196871(employment, null));
    }

    /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onRiskToleranceUpdated$1", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onRiskToleranceUpdated$1 */
    static final class C196851 extends ContinuationImpl7 implements Function2<InvestmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C196851(Continuation<? super C196851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C196851 c196851 = new C196851(continuation);
            c196851.L$0 = obj;
            return c196851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState> continuation) {
            return ((C196851) create(investmentProfileSettingsBonfireIdentiViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InvestmentProfileSettingsBonfireIdentiViewState.copy$default((InvestmentProfileSettingsBonfireIdentiViewState) this.L$0, null, null, null, null, false, null, null, null, false, true, false, false, false, null, null, null, null, null, 261631, null);
        }
    }

    public final void onRiskToleranceUpdated(String accountNumber, String applicationId, QuestionnaireContract2.Completed result) {
        Intrinsics.checkNotNullParameter(result, "result");
        applyMutation(new C196851(null));
        QuestionnaireStore questionnaireStore = this.questionnaireStore;
        String productContext = result.getProductContext();
        List<QuestionnaireAnswer> questionAnswers = result.getQuestionAnswers();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(questionAnswers, 10));
        for (QuestionnaireAnswer questionnaireAnswer : questionAnswers) {
            arrayList.add(new ApiQuestionAnswer(questionnaireAnswer.getQuestion().getId(), questionnaireAnswer.toApiContent()));
        }
        LifecycleHost.DefaultImpls.bind$default(this, questionnaireStore.submitAnswers(new ApiQuestionnaireSubmitRequest(productContext, accountNumber, applicationId, null, arrayList)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentProfileSettingsBonfireIdentiDuxo.onRiskToleranceUpdated$lambda$2(this.f$0, (ApiQuestionnaireSubmitResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRiskToleranceUpdated$lambda$2(InvestmentProfileSettingsBonfireIdentiDuxo investmentProfileSettingsBonfireIdentiDuxo, ApiQuestionnaireSubmitResponse response) {
        Object next;
        Intrinsics.checkNotNullParameter(response, "response");
        Iterator<T> it = response.getQuestions_summary().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ApiQuestionnaireSubmitResponse.QuestionsSummary) next).getQuestion_key(), "risk_tolerance")) {
                break;
            }
        }
        ApiQuestionnaireSubmitResponse.QuestionsSummary questionsSummary = (ApiQuestionnaireSubmitResponse.QuestionsSummary) next;
        UUID user_answer_id = questionsSummary != null ? questionsSummary.getUser_answer_id() : null;
        if (user_answer_id != null) {
            BuildersKt__Builders_commonKt.launch$default(investmentProfileSettingsBonfireIdentiDuxo.getLifecycleScope(), null, null, new InvestmentProfileSettingsBonfireIdentiDuxo4(investmentProfileSettingsBonfireIdentiDuxo, user_answer_id, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public final void onAnnualIncomeUpdated(String accountNumber, String applicationId, List<QuestionnaireContract2.Completed> questionnaireResult) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(questionnaireResult, "questionnaireResult");
        ArrayList arrayList = new ArrayList();
        for (QuestionnaireContract2.Completed completed : questionnaireResult) {
            if (completed != null) {
                QuestionnaireStore questionnaireStore = this.questionnaireStore;
                String productContext = completed.getProductContext();
                List<QuestionnaireAnswer> questionAnswers = completed.getQuestionAnswers();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(questionAnswers, 10));
                for (QuestionnaireAnswer questionnaireAnswer : questionAnswers) {
                    arrayList2.add(new ApiQuestionAnswer(questionnaireAnswer.getQuestion().getId(), questionnaireAnswer.toApiContent()));
                }
                str = accountNumber;
                str2 = applicationId;
                arrayList.add(questionnaireStore.submitAnswers(new ApiQuestionnaireSubmitRequest(productContext, str, str2, null, arrayList2)));
            } else {
                str = accountNumber;
                str2 = applicationId;
            }
            accountNumber = str;
            applicationId = str2;
        }
        Single singleZip = Single.zip(arrayList, new Function() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo.onAnnualIncomeUpdated.2
            public final void apply(Object[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                apply((Object[]) obj);
                return Unit.INSTANCE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleZip, "zip(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleZip, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentProfileSettingsBonfireIdentiDuxo.onAnnualIncomeUpdated$lambda$5(this.f$0, (Unit) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAnnualIncomeUpdated$lambda$5(InvestmentProfileSettingsBonfireIdentiDuxo investmentProfileSettingsBonfireIdentiDuxo, Unit unit) {
        investmentProfileSettingsBonfireIdentiDuxo.applyMutation(new InvestmentProfileSettingsBonfireIdentiDuxo2(null));
        return Unit.INSTANCE;
    }

    /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onAnnualIncomeUpdated$4", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onAnnualIncomeUpdated$4 */
    static final class C196824 extends ContinuationImpl7 implements Function2<InvestmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C196824(Continuation<? super C196824> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C196824 c196824 = new C196824(continuation);
            c196824.L$0 = obj;
            return c196824;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState> continuation) {
            return ((C196824) create(investmentProfileSettingsBonfireIdentiViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InvestmentProfileSettingsBonfireIdentiViewState.copy$default((InvestmentProfileSettingsBonfireIdentiViewState) this.L$0, null, null, null, null, false, null, null, null, false, false, true, false, false, null, null, null, null, null, 261119, null);
        }
    }

    public final void onAnnualIncomeUpdated() {
        applyMutation(new C196824(null));
    }

    /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onAccountSelected$1", m3645f = "InvestmentProfileSettingsBonfireIdentiDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiDuxo$onAccountSelected$1 */
    static final class C196791 extends ContinuationImpl7 implements Function2<InvestmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState>, Object> {
        final /* synthetic */ String $accountNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C196791(String str, Continuation<? super C196791> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C196791 c196791 = new C196791(this.$accountNumber, continuation);
            c196791.L$0 = obj;
            return c196791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, Continuation<? super InvestmentProfileSettingsBonfireIdentiViewState> continuation) {
            return ((C196791) create(investmentProfileSettingsBonfireIdentiViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InvestmentProfileSettingsBonfireIdentiViewState.copy$default((InvestmentProfileSettingsBonfireIdentiViewState) this.L$0, this.$accountNumber, null, null, null, false, null, null, null, false, false, false, false, false, null, null, null, null, null, 262142, null);
        }
    }

    public final void onAccountSelected(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        applyMutation(new C196791(accountNumber, null));
    }

    /* compiled from: InvestmentProfileSettingsBonfireIdentiDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiDuxo;", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiFragment$Args;", "<init>", "()V", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InvestmentProfileSettingsBonfireIdentiDuxo, InvestmentProfileSettingsBonfireIdentiFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestmentProfileSettingsBonfireIdentiFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (InvestmentProfileSettingsBonfireIdentiFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestmentProfileSettingsBonfireIdentiFragment.Args getArgs(InvestmentProfileSettingsBonfireIdentiDuxo investmentProfileSettingsBonfireIdentiDuxo) {
            return (InvestmentProfileSettingsBonfireIdentiFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, investmentProfileSettingsBonfireIdentiDuxo);
        }
    }
}
