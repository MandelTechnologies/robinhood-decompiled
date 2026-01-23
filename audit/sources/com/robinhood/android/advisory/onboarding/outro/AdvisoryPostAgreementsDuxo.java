package com.robinhood.android.advisory.onboarding.outro;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.advisory.p030v1.AdvisoryOnboardingService;
import bonfire.proto.idl.advisory.p030v1.GetAdvisorySwipeToSubmitDetailsRequestDto;
import bonfire.proto.idl.advisory.p030v1.GetAdvisorySwipeToSubmitDetailsResponseDto;
import bonfire.proto.idl.advisory.p030v1.SwipeToSubmitDetailsContextDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.contracts.AdvisoryPostAgreementsKey;
import com.robinhood.android.advisory.dashboard.ManagedDashboardKey;
import com.robinhood.android.advisory.instant.AdvisoryInstantExperiment;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsEvent;
import com.robinhood.android.advisory.onboarding.retirement.contribution.ContributionConfigMappers;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.dashboard.store.HomeDashboardStore;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.account.creation.AccountCreationState;
import com.robinhood.android.lib.account.creation.UtilsKt;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.transfers.lib.validation.TransferValidator;
import com.robinhood.android.transfers.lib.validation.ValidationFailure;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementAccountSwitcherStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.api.bonfire.ApiTransferAccount2;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow2;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.p355ui.bonfire.onboardingswipetosubmit.UiGetAdvisorySwipeToSubmitDetails;
import com.robinhood.models.p355ui.bonfire.onboardingswipetosubmit.UiGetAdvisorySwipeToSubmitDetails2;
import com.robinhood.models.util.Money;
import com.robinhood.store.advisory.AdvisoryFirstDepositConfig;
import com.robinhood.store.advisory.AdvisoryOnboardingStore;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.TrackingEvent;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.rx2.RxAwait3;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: AdvisoryPostAgreementsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 >2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001>Bq\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\b\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020*H\u0002J \u0010+\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010-H\u0082@¢\u0006\u0002\u0010.J \u0010/\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\b\u00100\u001a\u0004\u0018\u00010-H\u0082@¢\u0006\u0002\u0010.J\u000e\u00101\u001a\u00020'H\u0082@¢\u0006\u0002\u00102J\u000e\u00103\u001a\u00020'H\u0082@¢\u0006\u0002\u00102J\u000e\u00104\u001a\u00020'H\u0082@¢\u0006\u0002\u00102J\f\u00105\u001a\u00020'*\u000206H\u0002J \u00107\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010-H\u0082@¢\u0006\u0002\u0010.J\u0006\u00108\u001a\u00020'J\u0016\u00109\u001a\u00020'2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsViewState;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "advisoryOnboardingService", "Lbonfire/proto/idl/advisory/v1/AdvisoryOnboardingService;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "homeDashboardStore", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "onboardingStore", "Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "validator", "Lcom/robinhood/android/transfers/lib/validation/TransferValidator;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "retirementAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lbonfire/proto/idl/advisory/v1/AdvisoryOnboardingService;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/dashboard/store/HomeDashboardStore;Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/android/transfers/lib/validation/TransferValidator;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;Lcom/robinhood/userleap/UserLeapManager;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "sessionId", "Ljava/util/UUID;", "onStart", "", "updateDashboardForAccount", "accountNumber", "", "pollForTransferAccount", "fundingConfig", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig;", "(Ljava/lang/String;Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleFetchedAccountWithConfig", "firstDepositConfiguration", "pollForAccount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kickoffMinWaitForDepositTimer", "kickoffMinWaitForRefreshStateTimer", "pollForAccountAndRunTimer", "Lkotlinx/coroutines/CoroutineScope;", "fetchSwipeToSubmitDetails", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "submitFirstDeposit", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", "config", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Transfer;", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryPostAgreementsDuxo extends BaseDuxo3<AdvisoryPostAgreementsDataState, AdvisoryPostAgreementsViewState, AdvisoryPostAgreementsEvent> implements HasSavedState {
    private static final long MIN_WAIT_TIME_FOR_DEPOSIT_MS = 1000;
    private static final long MIN_WAIT_TIME_FOR_REFRESH_STATE_MS = 3000;
    private final AccountProvider accountProvider;
    private final AdvisoryOnboardingService advisoryOnboardingService;
    private final ExperimentsStore experimentsStore;
    private final HomeDashboardStore homeDashboardStore;
    private final TraderMarketHoursManager marketHoursManager;
    private final AdvisoryOnboardingStore onboardingStore;
    private final RetirementAccountSwitcherStore retirementAccountSwitcherStore;
    private final SavedStateHandle savedStateHandle;
    private final UUID sessionId;
    private final TransferAccountStore transferAccountStore;
    private final TransfersBonfireApi transfersBonfireApi;
    private final SurveyManager3 userLeapManager;
    private final TransferValidator validator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE}, m3647m = "fetchSwipeToSubmitDetails")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$fetchSwipeToSubmitDetails$1 */
    static final class C89241 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C89241(Continuation<? super C89241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdvisoryPostAgreementsDuxo.this.fetchSwipeToSubmitDetails(null, null, this);
        }
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {200, 201}, m3647m = "handleFetchedAccountWithConfig")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$handleFetchedAccountWithConfig$1 */
    static final class C89261 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C89261(Continuation<? super C89261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdvisoryPostAgreementsDuxo.this.handleFetchedAccountWithConfig(null, null, this);
        }
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {271}, m3647m = "kickoffMinWaitForDepositTimer")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$kickoffMinWaitForDepositTimer$1 */
    static final class C89291 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C89291(Continuation<? super C89291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdvisoryPostAgreementsDuxo.this.kickoffMinWaitForDepositTimer(this);
        }
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {283}, m3647m = "kickoffMinWaitForRefreshStateTimer")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$kickoffMinWaitForRefreshStateTimer$1 */
    static final class C89311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C89311(Continuation<? super C89311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdvisoryPostAgreementsDuxo.this.kickoffMinWaitForRefreshStateTimer(this);
        }
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 255}, m3647m = "pollForAccount")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$pollForAccount$1 */
    static final class C89341 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C89341(Continuation<? super C89341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdvisoryPostAgreementsDuxo.this.pollForAccount(this);
        }
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {459, EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE}, m3647m = "pollForTransferAccount")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$pollForTransferAccount$1 */
    static final class C89391 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C89391(Continuation<? super C89391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdvisoryPostAgreementsDuxo.this.pollForTransferAccount(null, null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AdvisoryPostAgreementsDuxo(AccountProvider accountProvider, AdvisoryOnboardingService advisoryOnboardingService, ExperimentsStore experimentsStore, HomeDashboardStore homeDashboardStore, AdvisoryOnboardingStore onboardingStore, TransferAccountStore transferAccountStore, TransferValidator validator, TraderMarketHoursManager marketHoursManager, TransfersBonfireApi transfersBonfireApi, RetirementAccountSwitcherStore retirementAccountSwitcherStore, SurveyManager3 userLeapManager, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(advisoryOnboardingService, "advisoryOnboardingService");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(homeDashboardStore, "homeDashboardStore");
        Intrinsics.checkNotNullParameter(onboardingStore, "onboardingStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(retirementAccountSwitcherStore, "retirementAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new AdvisoryPostAgreementsDataState(((AdvisoryPostAgreementsKey) companion.getArgs(savedStateHandle)).getBrokerageAccountType(), null, onboardingStore.fetchFundingMethodContext(((AdvisoryPostAgreementsKey) companion.getArgs(savedStateHandle)).getApplicationId()), false, false, 0, null, null, null, false, false, false, false, ((AdvisoryPostAgreementsKey) companion.getArgs(savedStateHandle)).getSource(), 8186, null), AdvisoryPostAgreementsDataState.INSTANCE, duxoBundle);
        this.accountProvider = accountProvider;
        this.advisoryOnboardingService = advisoryOnboardingService;
        this.experimentsStore = experimentsStore;
        this.homeDashboardStore = homeDashboardStore;
        this.onboardingStore = onboardingStore;
        this.transferAccountStore = transferAccountStore;
        this.validator = validator;
        this.marketHoursManager = marketHoursManager;
        this.transfersBonfireApi = transfersBonfireApi;
        this.retirementAccountSwitcherStore = retirementAccountSwitcherStore;
        this.userLeapManager = userLeapManager;
        this.savedStateHandle = savedStateHandle;
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        this.sessionId = uuidRandomUUID;
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$onStart$1", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$onStart$1 */
    static final class C89331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C89331(Continuation<? super C89331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C89331 c89331 = AdvisoryPostAgreementsDuxo.this.new C89331(continuation);
            c89331.L$0 = obj;
            return c89331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C89331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AdvisoryPostAgreementsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$onStart$1$1", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AdvisoryPostAgreementsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AdvisoryPostAgreementsDuxo advisoryPostAgreementsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = advisoryPostAgreementsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.pollForAccountAndRunTimer((CoroutineScope) this.L$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(AdvisoryPostAgreementsDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(AdvisoryPostAgreementsDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(AdvisoryPostAgreementsDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: AdvisoryPostAgreementsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$onStart$1$2", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {100}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvisoryPostAgreementsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AdvisoryPostAgreementsDuxo advisoryPostAgreementsDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = advisoryPostAgreementsDuxo;
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
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{AdvisoryPostAgreementsExperiment.INSTANCE}, false, null, 6, null);
                    final AdvisoryPostAgreementsDuxo advisoryPostAgreementsDuxo = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo.onStart.1.2.1

                        /* compiled from: AdvisoryPostAgreementsDuxo.kt */
                        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$onStart$1$2$1$1", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$onStart$1$2$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C495841 extends ContinuationImpl7 implements Function2<AdvisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState>, Object> {
                            final /* synthetic */ boolean $isInLoadingAnimationExperiment;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C495841(boolean z, Continuation<? super C495841> continuation) {
                                super(2, continuation);
                                this.$isInLoadingAnimationExperiment = z;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C495841 c495841 = new C495841(this.$isInLoadingAnimationExperiment, continuation);
                                c495841.L$0 = obj;
                                return c495841;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState> continuation) {
                                return ((C495841) create(advisoryPostAgreementsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState = (AdvisoryPostAgreementsDataState) this.L$0;
                                return advisoryPostAgreementsDataState.copy((16127 & 1) != 0 ? advisoryPostAgreementsDataState.brokerageAccountType : null, (16127 & 2) != 0 ? advisoryPostAgreementsDataState.accountNumber : null, (16127 & 4) != 0 ? advisoryPostAgreementsDataState.fundingMethodEventContext : null, (16127 & 8) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToMoveToDepositSubmission : false, (16127 & 16) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToShowRefreshState : false, (16127 & 32) != 0 ? advisoryPostAgreementsDataState.retryCount : 0, (16127 & 64) != 0 ? advisoryPostAgreementsDataState.fundingConfig : null, (16127 & 128) != 0 ? advisoryPostAgreementsDataState.sinkAccount : null, (16127 & 256) != 0 ? advisoryPostAgreementsDataState.swipeToSubmitDetails : null, (16127 & 512) != 0 ? advisoryPostAgreementsDataState.submittingDeposit : false, (16127 & 1024) != 0 ? advisoryPostAgreementsDataState.depositSubmittedSuccessfully : false, (16127 & 2048) != 0 ? advisoryPostAgreementsDataState.isInLoadingAnimationExperiment : this.$isInLoadingAnimationExperiment, (16127 & 4096) != 0 ? advisoryPostAgreementsDataState.isInAdvisoryInstantExperiment : false, (16127 & 8192) != 0 ? advisoryPostAgreementsDataState.loggingSource : null);
                            }
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                            advisoryPostAgreementsDuxo.applyMutation(new C495841(z, null));
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowStreamStateFlow$default.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: AdvisoryPostAgreementsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$onStart$1$3", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {106}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$onStart$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvisoryPostAgreementsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AdvisoryPostAgreementsDuxo advisoryPostAgreementsDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = advisoryPostAgreementsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{AdvisoryInstantExperiment.INSTANCE}, false, null, 6, null);
                    final AdvisoryPostAgreementsDuxo advisoryPostAgreementsDuxo = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo.onStart.1.3.1

                        /* compiled from: AdvisoryPostAgreementsDuxo.kt */
                        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$onStart$1$3$1$1", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$onStart$1$3$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C495851 extends ContinuationImpl7 implements Function2<AdvisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState>, Object> {
                            final /* synthetic */ boolean $isInAdvisoryInstantExperiment;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C495851(boolean z, Continuation<? super C495851> continuation) {
                                super(2, continuation);
                                this.$isInAdvisoryInstantExperiment = z;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C495851 c495851 = new C495851(this.$isInAdvisoryInstantExperiment, continuation);
                                c495851.L$0 = obj;
                                return c495851;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState> continuation) {
                                return ((C495851) create(advisoryPostAgreementsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState = (AdvisoryPostAgreementsDataState) this.L$0;
                                return advisoryPostAgreementsDataState.copy((16127 & 1) != 0 ? advisoryPostAgreementsDataState.brokerageAccountType : null, (16127 & 2) != 0 ? advisoryPostAgreementsDataState.accountNumber : null, (16127 & 4) != 0 ? advisoryPostAgreementsDataState.fundingMethodEventContext : null, (16127 & 8) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToMoveToDepositSubmission : false, (16127 & 16) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToShowRefreshState : false, (16127 & 32) != 0 ? advisoryPostAgreementsDataState.retryCount : 0, (16127 & 64) != 0 ? advisoryPostAgreementsDataState.fundingConfig : null, (16127 & 128) != 0 ? advisoryPostAgreementsDataState.sinkAccount : null, (16127 & 256) != 0 ? advisoryPostAgreementsDataState.swipeToSubmitDetails : null, (16127 & 512) != 0 ? advisoryPostAgreementsDataState.submittingDeposit : false, (16127 & 1024) != 0 ? advisoryPostAgreementsDataState.depositSubmittedSuccessfully : false, (16127 & 2048) != 0 ? advisoryPostAgreementsDataState.isInLoadingAnimationExperiment : false, (16127 & 4096) != 0 ? advisoryPostAgreementsDataState.isInAdvisoryInstantExperiment : this.$isInAdvisoryInstantExperiment, (16127 & 8192) != 0 ? advisoryPostAgreementsDataState.loggingSource : null);
                            }
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                            advisoryPostAgreementsDuxo.applyMutation(new C495851(z, null));
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowStreamStateFlow$default.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        TrackingEvent trackingEvent = null;
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C89331(null));
        int i = WhenMappings.$EnumSwitchMapping$0[((AdvisoryPostAgreementsKey) INSTANCE.getArgs((HasSavedState) this)).getBrokerageAccountType().ordinal()];
        if (i == 1) {
            trackingEvent = TrackingEvent.ADVISORY_POST_AGREEMENTS_INDIVIDUAL;
        } else if (i == 2) {
            trackingEvent = TrackingEvent.ADVISORY_POST_AGREEMENTS_ROTH;
        } else if (i == 3) {
            trackingEvent = TrackingEvent.ADVISORY_POST_AGREEMENTS_TRAD;
        }
        if (trackingEvent != null) {
            this.userLeapManager.track(trackingEvent);
        }
    }

    private final void updateDashboardForAccount(String accountNumber) {
        switch (WhenMappings.$EnumSwitchMapping$0[((AdvisoryPostAgreementsKey) INSTANCE.getArgs((HasSavedState) this)).getBrokerageAccountType().ordinal()]) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
                this.homeDashboardStore.forceRefresh();
                this.homeDashboardStore.setHomeDashboardType(new HomeDashboardType.Account(accountNumber));
                return;
            case 2:
            case 3:
                this.retirementAccountSwitcherStore.refreshAccountSwitcherWithoutSubscribing();
                this.retirementAccountSwitcherStore.setActiveRetirementAccountNumber(accountNumber);
                return;
            case 8:
                throw new IllegalStateException("ISA stocks and share brokerage type not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        if (fetchSwipeToSubmitDetails(r2, r12, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cf, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r0) == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00cf -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pollForTransferAccount(String str, AdvisoryFirstDepositConfig advisoryFirstDepositConfig, Continuation<? super Unit> continuation) {
        C89391 c89391;
        String str2;
        int i;
        AdvisoryFirstDepositConfig advisoryFirstDepositConfig2;
        AdvisoryFirstDepositConfig advisoryFirstDepositConfig3;
        String str3;
        List listEmptyList;
        Iterator it;
        Object next;
        TransferAccount transferAccount;
        if (continuation instanceof C89391) {
            c89391 = (C89391) continuation;
            int i2 = c89391.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c89391.label = i2 - Integer.MIN_VALUE;
            } else {
                c89391 = new C89391(continuation);
            }
        }
        Object obj = c89391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c89391.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            str2 = str;
            i = 0;
            advisoryFirstDepositConfig2 = advisoryFirstDepositConfig;
            if (i < 15) {
            }
            withDataState(new Function1() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AdvisoryPostAgreementsDuxo.pollForTransferAccount$lambda$1((AdvisoryPostAgreementsDataState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
        if (i3 == 1) {
            i = c89391.I$0;
            advisoryFirstDepositConfig3 = (AdvisoryFirstDepositConfig) c89391.L$1;
            str3 = (String) c89391.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception unused) {
                listEmptyList = CollectionsKt.emptyList();
                Intrinsics.checkNotNull(listEmptyList);
                it = listEmptyList.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                transferAccount = (TransferAccount) next;
                if (transferAccount == null) {
                }
                return coroutine_suspended;
            }
            listEmptyList = (List) obj;
            Intrinsics.checkNotNull(listEmptyList);
            it = listEmptyList.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            transferAccount = (TransferAccount) next;
            if (transferAccount == null) {
            }
            return coroutine_suspended;
        }
        if (i3 == 2) {
            ResultKt.throwOnFailure(obj);
            withDataState(new Function1() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AdvisoryPostAgreementsDuxo.pollForTransferAccount$lambda$1((AdvisoryPostAgreementsDataState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
        if (i3 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = c89391.I$0;
        advisoryFirstDepositConfig3 = (AdvisoryFirstDepositConfig) c89391.L$1;
        str3 = (String) c89391.L$0;
        ResultKt.throwOnFailure(obj);
        advisoryFirstDepositConfig2 = advisoryFirstDepositConfig3;
        str2 = str3;
        if (i < 15) {
            try {
            } catch (Exception unused2) {
                str3 = str2;
                advisoryFirstDepositConfig3 = advisoryFirstDepositConfig2;
                listEmptyList = CollectionsKt.emptyList();
                Intrinsics.checkNotNull(listEmptyList);
                it = listEmptyList.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                transferAccount = (TransferAccount) next;
                if (transferAccount == null) {
                }
                return coroutine_suspended;
            }
            Observable<List<TransferAccount>> observableForceFetchAndStream = this.transferAccountStore.forceFetchAndStream();
            c89391.L$0 = str2;
            c89391.L$1 = advisoryFirstDepositConfig2;
            c89391.I$0 = i;
            c89391.label = 1;
            Object objAwaitFirst = RxAwait3.awaitFirst(observableForceFetchAndStream, c89391);
            if (objAwaitFirst != coroutine_suspended) {
                str3 = str2;
                advisoryFirstDepositConfig3 = advisoryFirstDepositConfig2;
                obj = objAwaitFirst;
                listEmptyList = (List) obj;
                Intrinsics.checkNotNull(listEmptyList);
                it = listEmptyList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((TransferAccount) next).getAccountNumber(), str3)) {
                        break;
                    }
                }
                transferAccount = (TransferAccount) next;
                if (transferAccount == null) {
                    applyMutation(new C89402(transferAccount, null));
                    c89391.L$0 = null;
                    c89391.L$1 = null;
                    c89391.label = 2;
                } else {
                    i++;
                    c89391.L$0 = str3;
                    c89391.L$1 = advisoryFirstDepositConfig3;
                    c89391.I$0 = i;
                    c89391.label = 3;
                }
            }
            return coroutine_suspended;
        }
        withDataState(new Function1() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AdvisoryPostAgreementsDuxo.pollForTransferAccount$lambda$1((AdvisoryPostAgreementsDataState) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$pollForTransferAccount$2", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$pollForTransferAccount$2 */
    static final class C89402 extends ContinuationImpl7 implements Function2<AdvisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState>, Object> {
        final /* synthetic */ TransferAccount $sinkAccount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C89402(TransferAccount transferAccount, Continuation<? super C89402> continuation) {
            super(2, continuation);
            this.$sinkAccount = transferAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C89402 c89402 = new C89402(this.$sinkAccount, continuation);
            c89402.L$0 = obj;
            return c89402;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState> continuation) {
            return ((C89402) create(advisoryPostAgreementsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState = (AdvisoryPostAgreementsDataState) this.L$0;
            return advisoryPostAgreementsDataState.copy((16127 & 1) != 0 ? advisoryPostAgreementsDataState.brokerageAccountType : null, (16127 & 2) != 0 ? advisoryPostAgreementsDataState.accountNumber : null, (16127 & 4) != 0 ? advisoryPostAgreementsDataState.fundingMethodEventContext : null, (16127 & 8) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToMoveToDepositSubmission : false, (16127 & 16) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToShowRefreshState : false, (16127 & 32) != 0 ? advisoryPostAgreementsDataState.retryCount : 0, (16127 & 64) != 0 ? advisoryPostAgreementsDataState.fundingConfig : null, (16127 & 128) != 0 ? advisoryPostAgreementsDataState.sinkAccount : this.$sinkAccount, (16127 & 256) != 0 ? advisoryPostAgreementsDataState.swipeToSubmitDetails : null, (16127 & 512) != 0 ? advisoryPostAgreementsDataState.submittingDeposit : false, (16127 & 1024) != 0 ? advisoryPostAgreementsDataState.depositSubmittedSuccessfully : false, (16127 & 2048) != 0 ? advisoryPostAgreementsDataState.isInLoadingAnimationExperiment : false, (16127 & 4096) != 0 ? advisoryPostAgreementsDataState.isInAdvisoryInstantExperiment : false, (16127 & 8192) != 0 ? advisoryPostAgreementsDataState.loggingSource : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pollForTransferAccount$lambda$1(AdvisoryPostAgreementsDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (ds.getSinkAccount() == null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Exception("No transfer account found after polling in advisory onboarding"), false, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (pollForTransferAccount(r9, r10, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleFetchedAccountWithConfig(String str, AdvisoryFirstDepositConfig advisoryFirstDepositConfig, Continuation<? super Unit> continuation) {
        C89261 c89261;
        if (continuation instanceof C89261) {
            c89261 = (C89261) continuation;
            int i = c89261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c89261.label = i - Integer.MIN_VALUE;
            } else {
                c89261 = new C89261(continuation);
            }
        }
        Object obj = c89261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c89261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (advisoryFirstDepositConfig instanceof AdvisoryFirstDepositConfig.Transfer) {
                applyMutation(new C89272(advisoryFirstDepositConfig, null));
                c89261.L$0 = str;
                c89261.L$1 = advisoryFirstDepositConfig;
                c89261.label = 1;
                if (DelayKt.delay(1000L, c89261) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (Intrinsics.areEqual(advisoryFirstDepositConfig, AdvisoryFirstDepositConfig.Acat.INSTANCE)) {
                submit(new AdvisoryPostAgreementsEvent.GoToAcats(str));
            } else if (advisoryFirstDepositConfig instanceof AdvisoryFirstDepositConfig.InternalAssetTransfer) {
                submit(new AdvisoryPostAgreementsEvent.GoToInternalAssetTransfers(str));
            } else if (Intrinsics.areEqual(advisoryFirstDepositConfig, AdvisoryFirstDepositConfig.Rollover.INSTANCE)) {
                submit(new AdvisoryPostAgreementsEvent.GoToRollover(str));
            } else if (advisoryFirstDepositConfig instanceof AdvisoryFirstDepositConfig.IraMigration) {
                applyMutation(new C89283(advisoryFirstDepositConfig, null));
            } else {
                if (advisoryFirstDepositConfig != null) {
                    throw new NoWhenBranchMatchedException();
                }
                submit(new AdvisoryPostAgreementsEvent.AccountLoadedButLostTransferConfig(str));
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        advisoryFirstDepositConfig = (AdvisoryFirstDepositConfig) c89261.L$1;
        str = (String) c89261.L$0;
        ResultKt.throwOnFailure(obj);
        c89261.L$0 = null;
        c89261.L$1 = null;
        c89261.label = 2;
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$handleFetchedAccountWithConfig$2", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$handleFetchedAccountWithConfig$2 */
    static final class C89272 extends ContinuationImpl7 implements Function2<AdvisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState>, Object> {
        final /* synthetic */ AdvisoryFirstDepositConfig $firstDepositConfiguration;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C89272(AdvisoryFirstDepositConfig advisoryFirstDepositConfig, Continuation<? super C89272> continuation) {
            super(2, continuation);
            this.$firstDepositConfiguration = advisoryFirstDepositConfig;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C89272 c89272 = new C89272(this.$firstDepositConfiguration, continuation);
            c89272.L$0 = obj;
            return c89272;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState> continuation) {
            return ((C89272) create(advisoryPostAgreementsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState = (AdvisoryPostAgreementsDataState) this.L$0;
            return advisoryPostAgreementsDataState.copy((16127 & 1) != 0 ? advisoryPostAgreementsDataState.brokerageAccountType : null, (16127 & 2) != 0 ? advisoryPostAgreementsDataState.accountNumber : null, (16127 & 4) != 0 ? advisoryPostAgreementsDataState.fundingMethodEventContext : null, (16127 & 8) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToMoveToDepositSubmission : false, (16127 & 16) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToShowRefreshState : false, (16127 & 32) != 0 ? advisoryPostAgreementsDataState.retryCount : 0, (16127 & 64) != 0 ? advisoryPostAgreementsDataState.fundingConfig : this.$firstDepositConfiguration, (16127 & 128) != 0 ? advisoryPostAgreementsDataState.sinkAccount : null, (16127 & 256) != 0 ? advisoryPostAgreementsDataState.swipeToSubmitDetails : null, (16127 & 512) != 0 ? advisoryPostAgreementsDataState.submittingDeposit : false, (16127 & 1024) != 0 ? advisoryPostAgreementsDataState.depositSubmittedSuccessfully : false, (16127 & 2048) != 0 ? advisoryPostAgreementsDataState.isInLoadingAnimationExperiment : false, (16127 & 4096) != 0 ? advisoryPostAgreementsDataState.isInAdvisoryInstantExperiment : false, (16127 & 8192) != 0 ? advisoryPostAgreementsDataState.loggingSource : null);
        }
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$handleFetchedAccountWithConfig$3", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$handleFetchedAccountWithConfig$3 */
    static final class C89283 extends ContinuationImpl7 implements Function2<AdvisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState>, Object> {
        final /* synthetic */ AdvisoryFirstDepositConfig $firstDepositConfiguration;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C89283(AdvisoryFirstDepositConfig advisoryFirstDepositConfig, Continuation<? super C89283> continuation) {
            super(2, continuation);
            this.$firstDepositConfiguration = advisoryFirstDepositConfig;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C89283 c89283 = new C89283(this.$firstDepositConfiguration, continuation);
            c89283.L$0 = obj;
            return c89283;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState> continuation) {
            return ((C89283) create(advisoryPostAgreementsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState = (AdvisoryPostAgreementsDataState) this.L$0;
            return advisoryPostAgreementsDataState.copy((16127 & 1) != 0 ? advisoryPostAgreementsDataState.brokerageAccountType : null, (16127 & 2) != 0 ? advisoryPostAgreementsDataState.accountNumber : null, (16127 & 4) != 0 ? advisoryPostAgreementsDataState.fundingMethodEventContext : null, (16127 & 8) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToMoveToDepositSubmission : false, (16127 & 16) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToShowRefreshState : false, (16127 & 32) != 0 ? advisoryPostAgreementsDataState.retryCount : 0, (16127 & 64) != 0 ? advisoryPostAgreementsDataState.fundingConfig : this.$firstDepositConfiguration, (16127 & 128) != 0 ? advisoryPostAgreementsDataState.sinkAccount : null, (16127 & 256) != 0 ? advisoryPostAgreementsDataState.swipeToSubmitDetails : null, (16127 & 512) != 0 ? advisoryPostAgreementsDataState.submittingDeposit : false, (16127 & 1024) != 0 ? advisoryPostAgreementsDataState.depositSubmittedSuccessfully : false, (16127 & 2048) != 0 ? advisoryPostAgreementsDataState.isInLoadingAnimationExperiment : false, (16127 & 4096) != 0 ? advisoryPostAgreementsDataState.isInAdvisoryInstantExperiment : false, (16127 & 8192) != 0 ? advisoryPostAgreementsDataState.loggingSource : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (handleFetchedAccountWithConfig(r7, r2, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pollForAccount(Continuation<? super Unit> continuation) {
        C89341 c89341;
        if (continuation instanceof C89341) {
            c89341 = (C89341) continuation;
            int i = c89341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c89341.label = i - Integer.MIN_VALUE;
            } else {
                c89341 = new C89341(continuation);
            }
        }
        Object objPollForAccount = c89341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c89341.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPollForAccount);
            AccountProvider accountProvider = this.accountProvider;
            BrokerageAccountType brokerageAccountType = ((AdvisoryPostAgreementsKey) INSTANCE.getArgs((HasSavedState) this)).getBrokerageAccountType();
            Function1 function1 = new Function1() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(AdvisoryPostAgreementsDuxo.pollForAccount$lambda$2((Account) obj));
                }
            };
            c89341.label = 1;
            objPollForAccount = UtilsKt.pollForAccount(accountProvider, brokerageAccountType, function1, c89341);
            if (objPollForAccount != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objPollForAccount);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objPollForAccount);
        AccountCreationState accountCreationState = (AccountCreationState) objPollForAccount;
        if (Intrinsics.areEqual(accountCreationState, AccountCreationState.Absent.INSTANCE) || Intrinsics.areEqual(accountCreationState, AccountCreationState.Failed.INSTANCE)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Exception("Managed account was not returned by brokeback endpoint after 15 tries"), false, null, 4, null);
        } else if (accountCreationState instanceof AccountCreationState.Fetched) {
            AdvisoryFirstDepositConfig advisoryFirstDepositConfigFetchFirstDepositConfig = this.onboardingStore.fetchFirstDepositConfig(((AdvisoryPostAgreementsKey) INSTANCE.getArgs((HasSavedState) this)).getApplicationId());
            applyMutation(new C89352(accountCreationState, null));
            AccountCreationState.Fetched fetched = (AccountCreationState.Fetched) accountCreationState;
            updateDashboardForAccount(fetched.getAccountNumber());
            String accountNumber = fetched.getAccountNumber();
            c89341.label = 2;
        } else if (!Intrinsics.areEqual(accountCreationState, AccountCreationState.Polling.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pollForAccount$lambda$2(Account it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isManaged();
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$pollForAccount$2", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$pollForAccount$2 */
    static final class C89352 extends ContinuationImpl7 implements Function2<AdvisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState>, Object> {
        final /* synthetic */ AccountCreationState $creationResult;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C89352(AccountCreationState accountCreationState, Continuation<? super C89352> continuation) {
            super(2, continuation);
            this.$creationResult = accountCreationState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C89352 c89352 = new C89352(this.$creationResult, continuation);
            c89352.L$0 = obj;
            return c89352;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState> continuation) {
            return ((C89352) create(advisoryPostAgreementsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState = (AdvisoryPostAgreementsDataState) this.L$0;
            return advisoryPostAgreementsDataState.copy((16127 & 1) != 0 ? advisoryPostAgreementsDataState.brokerageAccountType : null, (16127 & 2) != 0 ? advisoryPostAgreementsDataState.accountNumber : ((AccountCreationState.Fetched) this.$creationResult).getAccountNumber(), (16127 & 4) != 0 ? advisoryPostAgreementsDataState.fundingMethodEventContext : null, (16127 & 8) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToMoveToDepositSubmission : false, (16127 & 16) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToShowRefreshState : false, (16127 & 32) != 0 ? advisoryPostAgreementsDataState.retryCount : 0, (16127 & 64) != 0 ? advisoryPostAgreementsDataState.fundingConfig : null, (16127 & 128) != 0 ? advisoryPostAgreementsDataState.sinkAccount : null, (16127 & 256) != 0 ? advisoryPostAgreementsDataState.swipeToSubmitDetails : null, (16127 & 512) != 0 ? advisoryPostAgreementsDataState.submittingDeposit : false, (16127 & 1024) != 0 ? advisoryPostAgreementsDataState.depositSubmittedSuccessfully : false, (16127 & 2048) != 0 ? advisoryPostAgreementsDataState.isInLoadingAnimationExperiment : false, (16127 & 4096) != 0 ? advisoryPostAgreementsDataState.isInAdvisoryInstantExperiment : false, (16127 & 8192) != 0 ? advisoryPostAgreementsDataState.loggingSource : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object kickoffMinWaitForDepositTimer(Continuation<? super Unit> continuation) {
        C89291 c89291;
        if (continuation instanceof C89291) {
            c89291 = (C89291) continuation;
            int i = c89291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c89291.label = i - Integer.MIN_VALUE;
            } else {
                c89291 = new C89291(continuation);
            }
        }
        Object obj = c89291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c89291.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c89291.label = 1;
            if (DelayKt.delay(1000L, c89291) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        applyMutation(new C89302(null));
        return Unit.INSTANCE;
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$kickoffMinWaitForDepositTimer$2", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$kickoffMinWaitForDepositTimer$2 */
    static final class C89302 extends ContinuationImpl7 implements Function2<AdvisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C89302(Continuation<? super C89302> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C89302 c89302 = new C89302(continuation);
            c89302.L$0 = obj;
            return c89302;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState> continuation) {
            return ((C89302) create(advisoryPostAgreementsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState = (AdvisoryPostAgreementsDataState) this.L$0;
            return advisoryPostAgreementsDataState.copy((16127 & 1) != 0 ? advisoryPostAgreementsDataState.brokerageAccountType : null, (16127 & 2) != 0 ? advisoryPostAgreementsDataState.accountNumber : null, (16127 & 4) != 0 ? advisoryPostAgreementsDataState.fundingMethodEventContext : null, (16127 & 8) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToMoveToDepositSubmission : true, (16127 & 16) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToShowRefreshState : false, (16127 & 32) != 0 ? advisoryPostAgreementsDataState.retryCount : 0, (16127 & 64) != 0 ? advisoryPostAgreementsDataState.fundingConfig : null, (16127 & 128) != 0 ? advisoryPostAgreementsDataState.sinkAccount : null, (16127 & 256) != 0 ? advisoryPostAgreementsDataState.swipeToSubmitDetails : null, (16127 & 512) != 0 ? advisoryPostAgreementsDataState.submittingDeposit : false, (16127 & 1024) != 0 ? advisoryPostAgreementsDataState.depositSubmittedSuccessfully : false, (16127 & 2048) != 0 ? advisoryPostAgreementsDataState.isInLoadingAnimationExperiment : false, (16127 & 4096) != 0 ? advisoryPostAgreementsDataState.isInAdvisoryInstantExperiment : false, (16127 & 8192) != 0 ? advisoryPostAgreementsDataState.loggingSource : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object kickoffMinWaitForRefreshStateTimer(Continuation<? super Unit> continuation) {
        C89311 c89311;
        if (continuation instanceof C89311) {
            c89311 = (C89311) continuation;
            int i = c89311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c89311.label = i - Integer.MIN_VALUE;
            } else {
                c89311 = new C89311(continuation);
            }
        }
        Object obj = c89311.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c89311.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c89311.label = 1;
            if (DelayKt.delay(3000L, c89311) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        applyMutation(new C89322(null));
        return Unit.INSTANCE;
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$kickoffMinWaitForRefreshStateTimer$2", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$kickoffMinWaitForRefreshStateTimer$2 */
    static final class C89322 extends ContinuationImpl7 implements Function2<AdvisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C89322(Continuation<? super C89322> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C89322 c89322 = new C89322(continuation);
            c89322.L$0 = obj;
            return c89322;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState> continuation) {
            return ((C89322) create(advisoryPostAgreementsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState = (AdvisoryPostAgreementsDataState) this.L$0;
            return advisoryPostAgreementsDataState.copy((16127 & 1) != 0 ? advisoryPostAgreementsDataState.brokerageAccountType : null, (16127 & 2) != 0 ? advisoryPostAgreementsDataState.accountNumber : null, (16127 & 4) != 0 ? advisoryPostAgreementsDataState.fundingMethodEventContext : null, (16127 & 8) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToMoveToDepositSubmission : false, (16127 & 16) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToShowRefreshState : true, (16127 & 32) != 0 ? advisoryPostAgreementsDataState.retryCount : 0, (16127 & 64) != 0 ? advisoryPostAgreementsDataState.fundingConfig : null, (16127 & 128) != 0 ? advisoryPostAgreementsDataState.sinkAccount : null, (16127 & 256) != 0 ? advisoryPostAgreementsDataState.swipeToSubmitDetails : null, (16127 & 512) != 0 ? advisoryPostAgreementsDataState.submittingDeposit : false, (16127 & 1024) != 0 ? advisoryPostAgreementsDataState.depositSubmittedSuccessfully : false, (16127 & 2048) != 0 ? advisoryPostAgreementsDataState.isInLoadingAnimationExperiment : false, (16127 & 4096) != 0 ? advisoryPostAgreementsDataState.isInAdvisoryInstantExperiment : false, (16127 & 8192) != 0 ? advisoryPostAgreementsDataState.loggingSource : null);
        }
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$pollForAccountAndRunTimer$1", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$pollForAccountAndRunTimer$1 */
    static final class C89361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C89361(Continuation<? super C89361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvisoryPostAgreementsDuxo.this.new C89361(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C89361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AdvisoryPostAgreementsDuxo advisoryPostAgreementsDuxo = AdvisoryPostAgreementsDuxo.this;
                this.label = 1;
                if (advisoryPostAgreementsDuxo.pollForAccount(this) == coroutine_suspended) {
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
    public final void pollForAccountAndRunTimer(CoroutineScope coroutineScope) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C89361(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C89372(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C89383(null), 3, null);
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$pollForAccountAndRunTimer$2", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$pollForAccountAndRunTimer$2 */
    static final class C89372 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C89372(Continuation<? super C89372> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvisoryPostAgreementsDuxo.this.new C89372(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C89372) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AdvisoryPostAgreementsDuxo advisoryPostAgreementsDuxo = AdvisoryPostAgreementsDuxo.this;
                this.label = 1;
                if (advisoryPostAgreementsDuxo.kickoffMinWaitForDepositTimer(this) == coroutine_suspended) {
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

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$pollForAccountAndRunTimer$3", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {302}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$pollForAccountAndRunTimer$3 */
    static final class C89383 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C89383(Continuation<? super C89383> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvisoryPostAgreementsDuxo.this.new C89383(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C89383) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AdvisoryPostAgreementsDuxo advisoryPostAgreementsDuxo = AdvisoryPostAgreementsDuxo.this;
                this.label = 1;
                if (advisoryPostAgreementsDuxo.kickoffMinWaitForRefreshStateTimer(this) == coroutine_suspended) {
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
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchSwipeToSubmitDetails(String str, AdvisoryFirstDepositConfig advisoryFirstDepositConfig, Continuation<? super Unit> continuation) {
        C89241 c89241;
        Tuples3 tuples3;
        if (continuation instanceof C89241) {
            c89241 = (C89241) continuation;
            int i = c89241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c89241.label = i - Integer.MIN_VALUE;
            } else {
                c89241 = new C89241(continuation);
            }
        }
        Object objGetAdvisorySwipeToSubmitDetails = c89241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c89241.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetAdvisorySwipeToSubmitDetails);
                if (advisoryFirstDepositConfig == null) {
                    return Unit.INSTANCE;
                }
                if (advisoryFirstDepositConfig instanceof AdvisoryFirstDepositConfig.Transfer.Deposit) {
                    AdvisoryFirstDepositConfig.Transfer.Deposit deposit = (AdvisoryFirstDepositConfig.Transfer.Deposit) advisoryFirstDepositConfig;
                    tuples3 = new Tuples3(deposit.getAmount(), deposit.getSourceAccount(), SwipeToSubmitDetailsContextDto.TRANSFER);
                } else if (advisoryFirstDepositConfig instanceof AdvisoryFirstDepositConfig.Transfer.Retirement) {
                    AdvisoryFirstDepositConfig.Transfer.Retirement retirement = (AdvisoryFirstDepositConfig.Transfer.Retirement) advisoryFirstDepositConfig;
                    tuples3 = new Tuples3(retirement.getAmount(), retirement.getSourceAccount(), SwipeToSubmitDetailsContextDto.CONTRIBUTION);
                } else {
                    return Unit.INSTANCE;
                }
                Money money = (Money) tuples3.component1();
                TransferAccount transferAccount = (TransferAccount) tuples3.component2();
                SwipeToSubmitDetailsContextDto swipeToSubmitDetailsContextDto = (SwipeToSubmitDetailsContextDto) tuples3.component3();
                AdvisoryOnboardingService advisoryOnboardingService = this.advisoryOnboardingService;
                GetAdvisorySwipeToSubmitDetailsRequestDto getAdvisorySwipeToSubmitDetailsRequestDto = new GetAdvisorySwipeToSubmitDetailsRequestDto(str, Formats.getCurrencyFormat().format(money.getDecimalValue()), transferAccount.getDisplayTitle(), null, swipeToSubmitDetailsContextDto, ApiTransferAccount2.toProto(transferAccount.getType()), 8, null);
                c89241.label = 1;
                objGetAdvisorySwipeToSubmitDetails = advisoryOnboardingService.GetAdvisorySwipeToSubmitDetails(getAdvisorySwipeToSubmitDetailsRequestDto, c89241);
                if (objGetAdvisorySwipeToSubmitDetails == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetAdvisorySwipeToSubmitDetails);
            }
            applyMutation(new C89252(UiGetAdvisorySwipeToSubmitDetails2.toUiModel((GetAdvisorySwipeToSubmitDetailsResponseDto) objGetAdvisorySwipeToSubmitDetails), null));
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Exception("Cannot get swipe to submit details for new managed account: " + e), false, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$fetchSwipeToSubmitDetails$2", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$fetchSwipeToSubmitDetails$2 */
    static final class C89252 extends ContinuationImpl7 implements Function2<AdvisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState>, Object> {
        final /* synthetic */ UiGetAdvisorySwipeToSubmitDetails $swipeToSubmitDetails;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C89252(UiGetAdvisorySwipeToSubmitDetails uiGetAdvisorySwipeToSubmitDetails, Continuation<? super C89252> continuation) {
            super(2, continuation);
            this.$swipeToSubmitDetails = uiGetAdvisorySwipeToSubmitDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C89252 c89252 = new C89252(this.$swipeToSubmitDetails, continuation);
            c89252.L$0 = obj;
            return c89252;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState> continuation) {
            return ((C89252) create(advisoryPostAgreementsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState = (AdvisoryPostAgreementsDataState) this.L$0;
            return advisoryPostAgreementsDataState.copy((16127 & 1) != 0 ? advisoryPostAgreementsDataState.brokerageAccountType : null, (16127 & 2) != 0 ? advisoryPostAgreementsDataState.accountNumber : null, (16127 & 4) != 0 ? advisoryPostAgreementsDataState.fundingMethodEventContext : null, (16127 & 8) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToMoveToDepositSubmission : false, (16127 & 16) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToShowRefreshState : false, (16127 & 32) != 0 ? advisoryPostAgreementsDataState.retryCount : 0, (16127 & 64) != 0 ? advisoryPostAgreementsDataState.fundingConfig : null, (16127 & 128) != 0 ? advisoryPostAgreementsDataState.sinkAccount : null, (16127 & 256) != 0 ? advisoryPostAgreementsDataState.swipeToSubmitDetails : this.$swipeToSubmitDetails, (16127 & 512) != 0 ? advisoryPostAgreementsDataState.submittingDeposit : false, (16127 & 1024) != 0 ? advisoryPostAgreementsDataState.depositSubmittedSuccessfully : false, (16127 & 2048) != 0 ? advisoryPostAgreementsDataState.isInLoadingAnimationExperiment : false, (16127 & 4096) != 0 ? advisoryPostAgreementsDataState.isInAdvisoryInstantExperiment : false, (16127 & 8192) != 0 ? advisoryPostAgreementsDataState.loggingSource : null);
        }
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$retry$1", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$retry$1 */
    static final class C89411 extends ContinuationImpl7 implements Function2<AdvisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C89411(Continuation<? super C89411> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C89411 c89411 = new C89411(continuation);
            c89411.L$0 = obj;
            return c89411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState> continuation) {
            return ((C89411) create(advisoryPostAgreementsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState = (AdvisoryPostAgreementsDataState) this.L$0;
            return advisoryPostAgreementsDataState.copy((16127 & 1) != 0 ? advisoryPostAgreementsDataState.brokerageAccountType : null, (16127 & 2) != 0 ? advisoryPostAgreementsDataState.accountNumber : null, (16127 & 4) != 0 ? advisoryPostAgreementsDataState.fundingMethodEventContext : null, (16127 & 8) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToMoveToDepositSubmission : false, (16127 & 16) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToShowRefreshState : false, (16127 & 32) != 0 ? advisoryPostAgreementsDataState.retryCount : advisoryPostAgreementsDataState.getRetryCount() + 1, (16127 & 64) != 0 ? advisoryPostAgreementsDataState.fundingConfig : null, (16127 & 128) != 0 ? advisoryPostAgreementsDataState.sinkAccount : null, (16127 & 256) != 0 ? advisoryPostAgreementsDataState.swipeToSubmitDetails : null, (16127 & 512) != 0 ? advisoryPostAgreementsDataState.submittingDeposit : false, (16127 & 1024) != 0 ? advisoryPostAgreementsDataState.depositSubmittedSuccessfully : false, (16127 & 2048) != 0 ? advisoryPostAgreementsDataState.isInLoadingAnimationExperiment : false, (16127 & 4096) != 0 ? advisoryPostAgreementsDataState.isInAdvisoryInstantExperiment : false, (16127 & 8192) != 0 ? advisoryPostAgreementsDataState.loggingSource : null);
        }
    }

    public final void retry() {
        applyMutation(new C89411(null));
        withDataState(new Function1() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvisoryPostAgreementsDuxo.retry$lambda$3(this.f$0, (AdvisoryPostAgreementsDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retry$lambda$3(AdvisoryPostAgreementsDuxo advisoryPostAgreementsDuxo, AdvisoryPostAgreementsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getAccountNumber() != null) {
            BuildersKt__Builders_commonKt.launch$default(advisoryPostAgreementsDuxo.getLifecycleScope(), null, null, new AdvisoryPostAgreementsDuxo2(advisoryPostAgreementsDuxo, dataState, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(advisoryPostAgreementsDuxo.getLifecycleScope(), null, null, new AdvisoryPostAgreementsDuxo3(advisoryPostAgreementsDuxo, null), 3, null);
        } else {
            advisoryPostAgreementsDuxo.pollForAccountAndRunTimer(advisoryPostAgreementsDuxo.getLifecycleScope());
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$submitFirstDeposit$1", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$submitFirstDeposit$1 */
    static final class C89421 extends ContinuationImpl7 implements Function2<AdvisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C89421(Continuation<? super C89421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C89421 c89421 = new C89421(continuation);
            c89421.L$0 = obj;
            return c89421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState> continuation) {
            return ((C89421) create(advisoryPostAgreementsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState = (AdvisoryPostAgreementsDataState) this.L$0;
            return advisoryPostAgreementsDataState.copy((16127 & 1) != 0 ? advisoryPostAgreementsDataState.brokerageAccountType : null, (16127 & 2) != 0 ? advisoryPostAgreementsDataState.accountNumber : null, (16127 & 4) != 0 ? advisoryPostAgreementsDataState.fundingMethodEventContext : null, (16127 & 8) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToMoveToDepositSubmission : false, (16127 & 16) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToShowRefreshState : false, (16127 & 32) != 0 ? advisoryPostAgreementsDataState.retryCount : 0, (16127 & 64) != 0 ? advisoryPostAgreementsDataState.fundingConfig : null, (16127 & 128) != 0 ? advisoryPostAgreementsDataState.sinkAccount : null, (16127 & 256) != 0 ? advisoryPostAgreementsDataState.swipeToSubmitDetails : null, (16127 & 512) != 0 ? advisoryPostAgreementsDataState.submittingDeposit : true, (16127 & 1024) != 0 ? advisoryPostAgreementsDataState.depositSubmittedSuccessfully : false, (16127 & 2048) != 0 ? advisoryPostAgreementsDataState.isInLoadingAnimationExperiment : false, (16127 & 4096) != 0 ? advisoryPostAgreementsDataState.isInAdvisoryInstantExperiment : false, (16127 & 8192) != 0 ? advisoryPostAgreementsDataState.loggingSource : null);
        }
    }

    public final void submitFirstDeposit(TransferAccount sinkAccount, AdvisoryFirstDepositConfig.Transfer config) {
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        Intrinsics.checkNotNullParameter(config, "config");
        applyMutation(new C89421(null));
        ValidationFailure error$default = TransferValidator.getError$default(this.validator, ContributionConfigMappers.toTransferValidationInput(config, this.sessionId, sinkAccount, this.marketHoursManager.areMarketsOpenExtended()), null, 2, null);
        if (error$default == null) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C89443(config, sinkAccount, null), 3, null);
        } else {
            submit(new AdvisoryPostAgreementsEvent.DepositConfigurationInvalid(sinkAccount.getAccountNumber(), error$default));
            applyMutation(new C89432(null));
        }
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$submitFirstDeposit$2", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$submitFirstDeposit$2 */
    static final class C89432 extends ContinuationImpl7 implements Function2<AdvisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C89432(Continuation<? super C89432> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C89432 c89432 = new C89432(continuation);
            c89432.L$0 = obj;
            return c89432;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState> continuation) {
            return ((C89432) create(advisoryPostAgreementsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState = (AdvisoryPostAgreementsDataState) this.L$0;
            return advisoryPostAgreementsDataState.copy((16127 & 1) != 0 ? advisoryPostAgreementsDataState.brokerageAccountType : null, (16127 & 2) != 0 ? advisoryPostAgreementsDataState.accountNumber : null, (16127 & 4) != 0 ? advisoryPostAgreementsDataState.fundingMethodEventContext : null, (16127 & 8) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToMoveToDepositSubmission : false, (16127 & 16) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToShowRefreshState : false, (16127 & 32) != 0 ? advisoryPostAgreementsDataState.retryCount : 0, (16127 & 64) != 0 ? advisoryPostAgreementsDataState.fundingConfig : null, (16127 & 128) != 0 ? advisoryPostAgreementsDataState.sinkAccount : null, (16127 & 256) != 0 ? advisoryPostAgreementsDataState.swipeToSubmitDetails : null, (16127 & 512) != 0 ? advisoryPostAgreementsDataState.submittingDeposit : false, (16127 & 1024) != 0 ? advisoryPostAgreementsDataState.depositSubmittedSuccessfully : false, (16127 & 2048) != 0 ? advisoryPostAgreementsDataState.isInLoadingAnimationExperiment : false, (16127 & 4096) != 0 ? advisoryPostAgreementsDataState.isInAdvisoryInstantExperiment : false, (16127 & 8192) != 0 ? advisoryPostAgreementsDataState.loggingSource : null);
        }
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$submitFirstDeposit$3", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {406}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$submitFirstDeposit$3 */
    static final class C89443 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AdvisoryFirstDepositConfig.Transfer $config;
        final /* synthetic */ TransferAccount $sinkAccount;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C89443(AdvisoryFirstDepositConfig.Transfer transfer, TransferAccount transferAccount, Continuation<? super C89443> continuation) {
            super(2, continuation);
            this.$config = transfer;
            this.$sinkAccount = transferAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvisoryPostAgreementsDuxo.this.new C89443(this.$config, this.$sinkAccount, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C89443) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ApiCreateTransferRequest transferRequest = ContributionConfigMappers.toTransferRequest(this.$config, AdvisoryPostAgreementsDuxo.this.sessionId, this.$sinkAccount);
                TransfersBonfireApi transfersBonfireApi = AdvisoryPostAgreementsDuxo.this.transfersBonfireApi;
                this.label = 1;
                obj = transfersBonfireApi.createTransfer(transferRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Response response = (Response) obj;
            if (!response.isSuccessful()) {
                AdvisoryPostAgreementsDuxo.this.applyMutation(new AnonymousClass2(null));
                AdvisoryPostAgreementsDuxo.this.submit(new AdvisoryPostAgreementsEvent.DepositSubmissionFailed(this.$sinkAccount.getAccountNumber(), new HttpException(response)));
            } else {
                AdvisoryPostAgreementsDuxo advisoryPostAgreementsDuxo = AdvisoryPostAgreementsDuxo.this;
                advisoryPostAgreementsDuxo.applyMutation(new AnonymousClass1(response, this.$sinkAccount, advisoryPostAgreementsDuxo, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AdvisoryPostAgreementsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$submitFirstDeposit$3$1", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$submitFirstDeposit$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AdvisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState>, Object> {
            final /* synthetic */ Response<ApiCreateTransferResponse> $response;
            final /* synthetic */ TransferAccount $sinkAccount;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AdvisoryPostAgreementsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Response<ApiCreateTransferResponse> response, TransferAccount transferAccount, AdvisoryPostAgreementsDuxo advisoryPostAgreementsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = response;
                this.$sinkAccount = transferAccount;
                this.this$0 = advisoryPostAgreementsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, this.$sinkAccount, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState> continuation) {
                return ((AnonymousClass1) create(advisoryPostAgreementsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                List<UiPostTransferPage> postTransferPages;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState = (AdvisoryPostAgreementsDataState) this.L$0;
                if (advisoryPostAgreementsDataState.isInAdvisoryInstantExperiment()) {
                    ApiCreateTransferResponse apiCreateTransferResponseBody = this.$response.body();
                    PostTransferFlow uiModel = apiCreateTransferResponseBody != null ? PostTransferFlow2.toUiModel(apiCreateTransferResponseBody, this.$sinkAccount.getType()) : null;
                    if (uiModel != null && (postTransferPages = uiModel.getPostTransferPages()) != null && (!postTransferPages.isEmpty())) {
                        this.this$0.submit(new AdvisoryPostAgreementsEvent.FirstDepositPostTransfer(uiModel));
                        return advisoryPostAgreementsDataState;
                    }
                    if (advisoryPostAgreementsDataState.getAccountNumber() != null) {
                        this.this$0.submit(new AdvisoryPostAgreementsEvent.GoToManagedDashboard(ManagedDashboardKey.buildManagedDashboardKey(advisoryPostAgreementsDataState.getAccountNumber(), ((AdvisoryPostAgreementsKey) AdvisoryPostAgreementsDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getBrokerageAccountType())));
                    }
                    return advisoryPostAgreementsDataState;
                }
                return advisoryPostAgreementsDataState.copy((16127 & 1) != 0 ? advisoryPostAgreementsDataState.brokerageAccountType : null, (16127 & 2) != 0 ? advisoryPostAgreementsDataState.accountNumber : null, (16127 & 4) != 0 ? advisoryPostAgreementsDataState.fundingMethodEventContext : null, (16127 & 8) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToMoveToDepositSubmission : false, (16127 & 16) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToShowRefreshState : false, (16127 & 32) != 0 ? advisoryPostAgreementsDataState.retryCount : 0, (16127 & 64) != 0 ? advisoryPostAgreementsDataState.fundingConfig : null, (16127 & 128) != 0 ? advisoryPostAgreementsDataState.sinkAccount : null, (16127 & 256) != 0 ? advisoryPostAgreementsDataState.swipeToSubmitDetails : null, (16127 & 512) != 0 ? advisoryPostAgreementsDataState.submittingDeposit : false, (16127 & 1024) != 0 ? advisoryPostAgreementsDataState.depositSubmittedSuccessfully : true, (16127 & 2048) != 0 ? advisoryPostAgreementsDataState.isInLoadingAnimationExperiment : false, (16127 & 4096) != 0 ? advisoryPostAgreementsDataState.isInAdvisoryInstantExperiment : false, (16127 & 8192) != 0 ? advisoryPostAgreementsDataState.loggingSource : null);
            }
        }

        /* compiled from: AdvisoryPostAgreementsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$submitFirstDeposit$3$2", m3645f = "AdvisoryPostAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDuxo$submitFirstDeposit$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AdvisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState, Continuation<? super AdvisoryPostAgreementsDataState> continuation) {
                return ((AnonymousClass2) create(advisoryPostAgreementsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AdvisoryPostAgreementsDataState advisoryPostAgreementsDataState = (AdvisoryPostAgreementsDataState) this.L$0;
                return advisoryPostAgreementsDataState.copy((16127 & 1) != 0 ? advisoryPostAgreementsDataState.brokerageAccountType : null, (16127 & 2) != 0 ? advisoryPostAgreementsDataState.accountNumber : null, (16127 & 4) != 0 ? advisoryPostAgreementsDataState.fundingMethodEventContext : null, (16127 & 8) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToMoveToDepositSubmission : false, (16127 & 16) != 0 ? advisoryPostAgreementsDataState.enoughTimeHasPassedToShowRefreshState : false, (16127 & 32) != 0 ? advisoryPostAgreementsDataState.retryCount : 0, (16127 & 64) != 0 ? advisoryPostAgreementsDataState.fundingConfig : null, (16127 & 128) != 0 ? advisoryPostAgreementsDataState.sinkAccount : null, (16127 & 256) != 0 ? advisoryPostAgreementsDataState.swipeToSubmitDetails : null, (16127 & 512) != 0 ? advisoryPostAgreementsDataState.submittingDeposit : false, (16127 & 1024) != 0 ? advisoryPostAgreementsDataState.depositSubmittedSuccessfully : false, (16127 & 2048) != 0 ? advisoryPostAgreementsDataState.isInLoadingAnimationExperiment : false, (16127 & 4096) != 0 ? advisoryPostAgreementsDataState.isInAdvisoryInstantExperiment : false, (16127 & 8192) != 0 ? advisoryPostAgreementsDataState.loggingSource : null);
            }
        }
    }

    /* compiled from: AdvisoryPostAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsDuxo;", "Lcom/robinhood/android/advisory/contracts/AdvisoryPostAgreementsKey;", "<init>", "()V", "MIN_WAIT_TIME_FOR_DEPOSIT_MS", "", "MIN_WAIT_TIME_FOR_REFRESH_STATE_MS", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AdvisoryPostAgreementsDuxo, AdvisoryPostAgreementsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryPostAgreementsKey getArgs(SavedStateHandle savedStateHandle) {
            return (AdvisoryPostAgreementsKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvisoryPostAgreementsKey getArgs(AdvisoryPostAgreementsDuxo advisoryPostAgreementsDuxo) {
            return (AdvisoryPostAgreementsKey) DuxoCompanion.DefaultImpls.getArgs(this, advisoryPostAgreementsDuxo);
        }
    }
}
