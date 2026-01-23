package com.robinhood.android.settings.p254ui.recurring;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RxFragment;
import com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment;
import com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment;
import com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment;
import com.robinhood.android.common.recurring.sourceoffunds.InvestmentSchedulesFrequencies;
import com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderActionType;
import com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment;
import com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceFragment;
import com.robinhood.android.common.tabs.TabManager;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.data.RecurringOrderAmountArgs;
import com.robinhood.android.settings.p254ui.recurring.detail.InvestmentScheduleSettingsArgs;
import com.robinhood.android.settings.p254ui.recurring.detail.InvestmentScheduleSettingsFragment;
import com.robinhood.android.settings.p254ui.recurring.insights.InvestmentInsightsFragment;
import com.robinhood.android.settings.p254ui.recurring.pastinvestments.PastInvestmentsFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship;
import com.robinhood.models.p355ui.recurring.paycheck.UiPaycheckInvestmentSchedule;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.shared.recurring.contracts.InvestmentScheduleSettingsFragmentKey;
import com.robinhood.shared.recurring.contracts.RecurringPastInvestmentsFragmentKey;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import io.reactivex.Single;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: InvestmentScheduleSettingsParentFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ^2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001^B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\nJ\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u000fJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020\r2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J5\u0010.\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/J-\u00107\u001a\u00020\r2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\f\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0016¢\u0006\u0004\b7\u00108J\u0019\u0010:\u001a\u00020\r2\b\u00109\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\rH\u0016¢\u0006\u0004\b<\u0010\nJ\u000f\u0010=\u001a\u00020\rH\u0016¢\u0006\u0004\b=\u0010\nR\"\u0010?\u001a\u00020>8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010F\u001a\u00020E8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001b\u0010T\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001b\u0010W\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010Q\u001a\u0004\bV\u0010OR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010[\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b[\u0010M\u001a\u0004\b\\\u0010OR\u0014\u0010]\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010O¨\u0006_"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/InvestmentScheduleSettingsParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/recurring/amount/RecurringOrderAmountFragment$Callbacks;", "Lcom/robinhood/android/settings/ui/recurring/detail/InvestmentScheduleSettingsFragment$Callbacks;", "Lcom/robinhood/android/common/recurring/schedule/RecurringOrderScheduleFragment$Callbacks;", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderSourceOfFundsFragment$Callbacks;", "Lcom/robinhood/android/common/recurring/sourceoffunds/paycheck/RecurringOrderPaycheckSourceFragment$Callbacks;", "Lcom/robinhood/android/common/recurring/backup/RecurringOrderBackupPaymentMethodFragment$Callbacks;", "Lcom/robinhood/android/settings/ui/recurring/insights/InvestmentInsightsFragment$Callbacks;", "<init>", "()V", "", "fromInsights", "", "launchSourceOfFundsEditFlow", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPastInvestmentsClicked", "onAmountSelected", "onScheduleSelected", "onPaycheckSourceOfFundsSelected", "onSourceOfFundsSelected", "onBackupPaymentSelected", "onInsufficientBuyingPowerChangePaymentSelected", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "investmentScheduleAmount", "onAmountSelectionComplete", "(Lcom/robinhood/recurring/models/InvestmentScheduleAmount;)V", "j$/time/LocalDate", InquiryField.DateField.TYPE, "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "onScheduleSelectionComplete", "(Lj$/time/LocalDate;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;)V", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;", "amount", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "sourceOfFunds", "Ljava/util/UUID;", "achRelationshipId", "", "accountNumber", "onSourceOfFundsSelectionComplete", "(Lcom/robinhood/recurring/models/InvestmentScheduleAmount$Dollar;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Ljava/util/UUID;Ljava/lang/String;)V", "Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;", "actionType", "Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;", "directDepositRelationship", "", "Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;", "existingRecurringSchedules", "onDirectDepositRelationshipSelectionComplete", "(Lcom/robinhood/android/common/recurring/sourceoffunds/RecurringOrderActionType;Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;Ljava/util/List;)V", "backupAchRelationshipId", "onBackupPaymentMethodSelectionComplete", "(Ljava/util/UUID;)V", "onInvestmentScheduleDeleted", "onEditButtonClicked", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "getInvestmentScheduleStore", "()Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "setInvestmentScheduleStore", "(Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;)V", "Lcom/robinhood/userleap/UserLeapManager;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "useDesignSystemToolbar", "Z", "getUseDesignSystemToolbar", "()Z", "investmentScheduleId$delegate", "Lkotlin/Lazy;", "getInvestmentScheduleId", "()Ljava/util/UUID;", InvestmentScheduleSettingsParentFragment.EXTRA_INVESTMENT_SCHEDULE_ID, "showEditFromInsights$delegate", "getShowEditFromInsights", InvestmentScheduleSettingsParentFragment.EXTRA_SHOW_EDIT_FROM_INSIGHTS, "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "investmentSchedule", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "hasBottomBar", "getHasBottomBar", "isCrypto", "Companion", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class InvestmentScheduleSettingsParentFragment extends BaseFragment implements RecurringOrderAmountFragment.Callbacks, InvestmentScheduleSettingsFragment.Callbacks, RecurringOrderScheduleFragment.Callbacks, RecurringOrderSourceOfFundsFragment.Callbacks, RecurringOrderPaycheckSourceFragment.Callbacks, RecurringOrderBackupPaymentMethodFragment.Callbacks, InvestmentInsightsFragment.Callbacks {
    private static final String EXTRA_INVESTMENT_SCHEDULE_ID = "investmentScheduleId";
    private static final String EXTRA_SHOW_EDIT_FROM_INSIGHTS = "showEditFromInsights";
    private final boolean hasBottomBar;
    private InvestmentSchedule investmentSchedule;

    /* renamed from: investmentScheduleId$delegate, reason: from kotlin metadata */
    private final Lazy investmentScheduleId;
    public TraderInvestmentScheduleStore investmentScheduleStore;

    /* renamed from: showEditFromInsights$delegate, reason: from kotlin metadata */
    private final Lazy showEditFromInsights;
    private final boolean useDesignSystemToolbar;
    public SurveyManager3 userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public InvestmentScheduleSettingsParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.useDesignSystemToolbar = true;
        this.investmentScheduleId = Fragments2.argument(this, EXTRA_INVESTMENT_SCHEDULE_ID);
        this.showEditFromInsights = Fragments2.argument(this, EXTRA_SHOW_EDIT_FROM_INSIGHTS);
        this.hasBottomBar = true;
    }

    public final TraderInvestmentScheduleStore getInvestmentScheduleStore() {
        TraderInvestmentScheduleStore traderInvestmentScheduleStore = this.investmentScheduleStore;
        if (traderInvestmentScheduleStore != null) {
            return traderInvestmentScheduleStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("investmentScheduleStore");
        return null;
    }

    public final void setInvestmentScheduleStore(TraderInvestmentScheduleStore traderInvestmentScheduleStore) {
        Intrinsics.checkNotNullParameter(traderInvestmentScheduleStore, "<set-?>");
        this.investmentScheduleStore = traderInvestmentScheduleStore;
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final UUID getInvestmentScheduleId() {
        return (UUID) this.investmentScheduleId.getValue();
    }

    private final boolean getShowEditFromInsights() {
        return ((Boolean) this.showEditFromInsights.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto */
    public boolean get_isCrypto() {
        InvestmentSchedule investmentSchedule = this.investmentSchedule;
        if (investmentSchedule != null) {
            return investmentSchedule.isCrypto();
        }
        return false;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Single<InvestmentSchedule> singleFirstOrError = getInvestmentScheduleStore().getStreamInvestmentSchedule().asObservable(getInvestmentScheduleId()).firstOrError();
            Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
            LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.InvestmentScheduleSettingsParentFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestmentScheduleSettingsParentFragment.onCreate$lambda$0(this.f$0, (InvestmentSchedule) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(InvestmentScheduleSettingsParentFragment investmentScheduleSettingsParentFragment, InvestmentSchedule investmentSchedule) {
        if (investmentSchedule.getFrequency() != ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK) {
            investmentScheduleSettingsParentFragment.setFragment(C11048R.id.fragment_container, InvestmentInsightsFragment.INSTANCE.newInstance((Parcelable) new InvestmentInsightsFragment.Args(investmentScheduleSettingsParentFragment.getInvestmentScheduleId())));
            if (investmentScheduleSettingsParentFragment.getShowEditFromInsights()) {
                investmentScheduleSettingsParentFragment.onEditButtonClicked();
            }
        } else {
            investmentScheduleSettingsParentFragment.setFragment(C11048R.id.fragment_container, InvestmentScheduleSettingsFragment.INSTANCE.newInstance((Parcelable) new InvestmentScheduleSettingsArgs(investmentScheduleSettingsParentFragment.getInvestmentScheduleId(), false, 2, null)));
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getInvestmentScheduleStore().getStreamInvestmentSchedule().asObservable(getInvestmentScheduleId())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.settings.ui.recurring.InvestmentScheduleSettingsParentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentScheduleSettingsParentFragment.onResume$lambda$1(this.f$0, (InvestmentSchedule) obj);
            }
        });
        getUserLeapManager().presentSurveyIfNecessary(this, Survey.RECURRING_INVESTMENTS_VIEW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(InvestmentScheduleSettingsParentFragment investmentScheduleSettingsParentFragment, InvestmentSchedule investmentSchedule) {
        Intrinsics.checkNotNullParameter(investmentSchedule, "investmentSchedule");
        investmentScheduleSettingsParentFragment.investmentSchedule = investmentSchedule;
        KeyEventDispatcher.Component componentRequireActivity = investmentScheduleSettingsParentFragment.requireActivity();
        TabManager tabManager = componentRequireActivity instanceof TabManager ? (TabManager) componentRequireActivity : null;
        if (tabManager != null) {
            tabManager.reThemeToolbar();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment.Callbacks
    public void onPastInvestmentsClicked() {
        replaceFragment(PastInvestmentsFragment.INSTANCE.newInstance((Parcelable) new RecurringPastInvestmentsFragmentKey(getInvestmentScheduleId(), true)));
    }

    @Override // com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment.Callbacks
    public void onAmountSelected(boolean fromInsights) {
        InvestmentSchedule investmentSchedule = this.investmentSchedule;
        if (investmentSchedule == null) {
            throw new IllegalStateException("Required value was null.");
        }
        replaceFragment(RecurringOrderAmountFragment.INSTANCE.newInstance((Parcelable) new RecurringOrderAmountArgs(getInvestmentScheduleId(), investmentSchedule.getInvestmentScheduleAmount(), RecurringContext.FlowType.EDIT, investmentSchedule.getInvestmentTarget().getTargetType(), fromInsights, false, 32, null)));
    }

    @Override // com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment.Callbacks
    public void onScheduleSelected(boolean fromInsights) {
        InvestmentSchedule investmentSchedule = this.investmentSchedule;
        if (investmentSchedule == null) {
            throw new IllegalStateException("Required value was null.");
        }
        replaceFragment(RecurringOrderScheduleFragment.INSTANCE.newInstance((Parcelable) new RecurringOrderScheduleFragment.Args.Edit(investmentSchedule, null, null, fromInsights, 6, null)));
    }

    @Override // com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment.Callbacks
    public void onPaycheckSourceOfFundsSelected() {
        InvestmentSchedule investmentSchedule = this.investmentSchedule;
        Intrinsics.checkNotNull(investmentSchedule);
        RecurringOrderPaycheckSourceFragment.Companion companion = RecurringOrderPaycheckSourceFragment.INSTANCE;
        RecurringOrderActionType.Edit edit = new RecurringOrderActionType.Edit(investmentSchedule);
        UUID directDepositRelationshipId = investmentSchedule.getDirectDepositRelationshipId();
        Intrinsics.checkNotNull(directDepositRelationshipId);
        replaceFragment(companion.newInstance((Parcelable) new RecurringOrderPaycheckSourceFragment.Args(edit, directDepositRelationshipId, investmentSchedule.getInvestmentTarget(), null, null, 24, null)));
    }

    @Override // com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment.Callbacks
    public void onSourceOfFundsSelected(boolean fromInsights) {
        launchSourceOfFundsEditFlow(fromInsights);
    }

    @Override // com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment.Callbacks
    public void onBackupPaymentSelected(boolean fromInsights) {
        InvestmentSchedule investmentSchedule = this.investmentSchedule;
        if (investmentSchedule == null) {
            throw new IllegalStateException("Required value was null.");
        }
        replaceFragment(RecurringOrderBackupPaymentMethodFragment.Companion.newInstance$default(RecurringOrderBackupPaymentMethodFragment.INSTANCE, investmentSchedule.getInvestmentTarget().isCrypto(), false, investmentSchedule, null, fromInsights, 8, null));
    }

    @Override // com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment.Callbacks
    public void onInsufficientBuyingPowerChangePaymentSelected(boolean fromInsights) {
        launchSourceOfFundsEditFlow(fromInsights);
    }

    @Override // com.robinhood.android.common.recurring.amount.RecurringOrderAmountFragment.Callbacks
    public void onAmountSelectionComplete(InvestmentScheduleAmount investmentScheduleAmount) {
        Intrinsics.checkNotNullParameter(investmentScheduleAmount, "investmentScheduleAmount");
        popLastFragment();
    }

    @Override // com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment.Callbacks
    public void onScheduleSelectionComplete(LocalDate date, ApiInvestmentSchedule.Frequency frequency) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        popLastFragment();
    }

    @Override // com.robinhood.android.common.recurring.sourceoffunds.RecurringOrderSourceOfFundsFragment.Callbacks
    public void onSourceOfFundsSelectionComplete(InvestmentScheduleAmount.Dollar amount, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, UUID achRelationshipId, String accountNumber) {
        Intrinsics.checkNotNullParameter(sourceOfFunds, "sourceOfFunds");
        popLastFragment();
        getUserLeapManager().presentSurveyIfNecessary(this, Survey.RECURRING_INVESTMENTS_CHANGE_PAYMENT);
    }

    @Override // com.robinhood.android.common.recurring.sourceoffunds.paycheck.RecurringOrderPaycheckSourceFragment.Callbacks
    public void onDirectDepositRelationshipSelectionComplete(RecurringOrderActionType actionType, DirectDepositRelationship directDepositRelationship, List<UiPaycheckInvestmentSchedule> existingRecurringSchedules) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(directDepositRelationship, "directDepositRelationship");
        Intrinsics.checkNotNullParameter(existingRecurringSchedules, "existingRecurringSchedules");
        BaseFragment.popEntireFragmentBackstack$default(this, false, 1, null);
    }

    @Override // com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment.Callbacks
    public void onBackupPaymentMethodSelectionComplete(UUID backupAchRelationshipId) {
        popLastFragment();
    }

    @Override // com.robinhood.android.settings.ui.recurring.detail.InvestmentScheduleSettingsFragment.Callbacks
    public void onInvestmentScheduleDeleted() {
        BaseFragment.popEntireFragmentBackstack$default(this, false, 1, null);
        requireActivity().onBackPressed();
        Fragment parentFragment = getParentFragment();
        RxFragment rxFragment = parentFragment instanceof RxFragment ? (RxFragment) parentFragment : null;
        if (rxFragment != null) {
            getUserLeapManager().presentSurveyIfNecessary(rxFragment, Survey.RECURRING_INVESTMENTS_DELETE);
        }
    }

    @Override // com.robinhood.android.settings.ui.recurring.insights.InvestmentInsightsFragment.Callbacks
    public void onEditButtonClicked() {
        replaceFragment(InvestmentScheduleSettingsFragment.INSTANCE.newInstance((Parcelable) new InvestmentScheduleSettingsArgs(getInvestmentScheduleId(), true)));
    }

    private final void launchSourceOfFundsEditFlow(boolean fromInsights) {
        InvestmentSchedule investmentSchedule = this.investmentSchedule;
        if (investmentSchedule == null) {
            return;
        }
        replaceFragment(InvestmentSchedulesFrequencies.getSourceOfFundsFragment$default(investmentSchedule.getFrequency(), new RecurringOrderActionType.Edit(investmentSchedule), investmentSchedule.getInvestmentTarget(), null, null, fromInsights, investmentSchedule.getAccountNumber(), 24, null));
    }

    /* compiled from: InvestmentScheduleSettingsParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0016\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/recurring/InvestmentScheduleSettingsParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/shared/recurring/contracts/InvestmentScheduleSettingsFragmentKey;", "<init>", "()V", "EXTRA_INVESTMENT_SCHEDULE_ID", "", "EXTRA_SHOW_EDIT_FROM_INSIGHTS", "createFragment", "Lcom/robinhood/android/settings/ui/recurring/InvestmentScheduleSettingsParentFragment;", "key", "newInstance", InvestmentScheduleSettingsParentFragment.EXTRA_INVESTMENT_SCHEDULE_ID, "Ljava/util/UUID;", InvestmentScheduleSettingsParentFragment.EXTRA_SHOW_EDIT_FROM_INSIGHTS, "", "feature-recurring-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements FragmentResolver<InvestmentScheduleSettingsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public InvestmentScheduleSettingsParentFragment createFragment(InvestmentScheduleSettingsFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance(key.getInvestmentScheduleId(), key.getShowEditFromInsights());
        }

        public final InvestmentScheduleSettingsParentFragment newInstance(UUID investmentScheduleId, boolean showEditFromInsights) {
            Intrinsics.checkNotNullParameter(investmentScheduleId, "investmentScheduleId");
            InvestmentScheduleSettingsParentFragment investmentScheduleSettingsParentFragment = new InvestmentScheduleSettingsParentFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(InvestmentScheduleSettingsParentFragment.EXTRA_INVESTMENT_SCHEDULE_ID, investmentScheduleId);
            bundle.putSerializable(InvestmentScheduleSettingsParentFragment.EXTRA_SHOW_EDIT_FROM_INSIGHTS, Boolean.valueOf(showEditFromInsights));
            investmentScheduleSettingsParentFragment.setArguments(bundle);
            return investmentScheduleSettingsParentFragment;
        }
    }
}
