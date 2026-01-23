package com.robinhood.android.investorprofile.p162ui.profile;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.identi.UiEmploymentInfo;
import com.robinhood.models.p355ui.investmentprofilesettings.UiInvestmentProfileAnswers2;
import com.robinhood.models.p355ui.investmentprofilesettings.UiInvestmentProfileSettingsResponse;
import com.robinhood.models.p355ui.investmentprofilesettings.UiInvestmentProfileSettingsSection;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherUtils4;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InvestmentProfileSettingsBonfireIdentiViewState.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 l2\u00020\u0001:\u0002klBï\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0016\b\u0002\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020F\u0018\u00010EH\u0002J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010V\u001a\u00020\fHÆ\u0003J\u0011\u0010W\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0011\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u0011\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000eHÆ\u0003J\t\u0010Z\u001a\u00020\fHÆ\u0003J\t\u0010[\u001a\u00020\fHÆ\u0003J\t\u0010\\\u001a\u00020\fHÆ\u0003J\t\u0010]\u001a\u00020\fHÆ\u0003J\t\u0010^\u001a\u00020\fHÆ\u0003J\u0011\u0010_\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eHÂ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00103Jö\u0001\u0010d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010eJ\u0013\u0010f\u001a\u00020\f2\b\u0010g\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010h\u001a\u00020iHÖ\u0001J\t\u0010j\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010'R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0011\u0010\u0013\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'R\u0011\u0010\u0014\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u0011\u0010\u0015\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010'R\u0011\u0010\u0016\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010'R\u0011\u0010\u0017\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010'R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u00104\u001a\u0004\b5\u00103R!\u00106\u001a\b\u0012\u0004\u0012\u000208078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b9\u0010:R!\u0010=\u001a\b\u0012\u0004\u0012\u000208078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b>\u0010:R\u0013\u0010G\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010J\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0013\u0010N\u001a\u0004\u0018\u00010O8F¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006m"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState;", "", "selectedAccountNumber", "", "accounts", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/db/Account;", "investmentProfileSettingsResponse", "Lcom/robinhood/models/ui/investmentprofilesettings/UiInvestmentProfileSettings$ValidResponse;", "employmentInfo", "Lcom/robinhood/models/ui/identi/UiEmploymentInfo;", "isPrimaryButtonLoading", "", "error", "Lcom/robinhood/udf/UiEvent;", "", "questionnaireNotCompletedEvent", "updateAppEvent", "", "amlRefreshNeeded", "riskToleranceUpdated", "annualIncomeUpdated", "isAccountLevelLoading", "showAccountSwitcher", "scrollEvent", "title", "subtitle", "useNewInfoGatherFlowForAnnualIncome", "useNewInfoGatherFlowForRiskTolerance", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/ui/investmentprofilesettings/UiInvestmentProfileSettings$ValidResponse;Lcom/robinhood/models/ui/identi/UiEmploymentInfo;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZZZZZLcom/robinhood/udf/UiEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getSelectedAccountNumber", "()Ljava/lang/String;", "getAccounts", "()Lkotlinx/collections/immutable/ImmutableList;", "getInvestmentProfileSettingsResponse", "()Lcom/robinhood/models/ui/investmentprofilesettings/UiInvestmentProfileSettings$ValidResponse;", "getEmploymentInfo", "()Lcom/robinhood/models/ui/identi/UiEmploymentInfo;", "()Z", "getError", "()Lcom/robinhood/udf/UiEvent;", "getQuestionnaireNotCompletedEvent", "getUpdateAppEvent", "getAmlRefreshNeeded", "getRiskToleranceUpdated", "getAnnualIncomeUpdated", "getShowAccountSwitcher", "getTitle", "getSubtitle", "getUseNewInfoGatherFlowForAnnualIncome", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUseNewInfoGatherFlowForRiskTolerance", "userLevelItems", "", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem;", "getUserLevelItems", "()Ljava/util/List;", "userLevelItems$delegate", "Lkotlin/Lazy;", "accountLevelItems", "getAccountLevelItems", "accountLevelItems$delegate", "questionSummaryItem", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$QuestionSummaryItem;", "question", "Lcom/robinhood/models/ui/investmentprofilesettings/UiInvestmentProfileQuestion;", "questionGraph", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "selectedAccount", "getSelectedAccount", "()Lcom/robinhood/models/db/Account;", "selectedAccountType", "Lcom/robinhood/utils/resource/StringResource;", "getSelectedAccountType", "()Lcom/robinhood/utils/resource/StringResource;", "accountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "getAccountSwitcherData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/ui/investmentprofilesettings/UiInvestmentProfileSettings$ValidResponse;Lcom/robinhood/models/ui/identi/UiEmploymentInfo;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZZZZZLcom/robinhood/udf/UiEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState;", "equals", "other", "hashCode", "", "toString", "InvestmentProfileItem", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class InvestmentProfileSettingsBonfireIdentiViewState {
    public static final String ANNUAL_INCOME_KEY = "annual_income";
    public static final String RISK_TOLERANCE_KEY = "risk_tolerance";

    /* renamed from: accountLevelItems$delegate, reason: from kotlin metadata */
    private final Lazy accountLevelItems;
    private final ImmutableList<Account> accounts;
    private final boolean amlRefreshNeeded;
    private final boolean annualIncomeUpdated;
    private final UiEmploymentInfo employmentInfo;
    private final UiEvent<Throwable> error;
    private final UiInvestmentProfileSettingsResponse.ValidResponse investmentProfileSettingsResponse;
    private final boolean isAccountLevelLoading;
    private final boolean isPrimaryButtonLoading;
    private final UiEvent<String> questionnaireNotCompletedEvent;
    private final boolean riskToleranceUpdated;
    private final UiEvent<Boolean> scrollEvent;
    private final String selectedAccountNumber;
    private final boolean showAccountSwitcher;
    private final String subtitle;
    private final String title;
    private final UiEvent<Unit> updateAppEvent;
    private final Boolean useNewInfoGatherFlowForAnnualIncome;
    private final Boolean useNewInfoGatherFlowForRiskTolerance;

    /* renamed from: userLevelItems$delegate, reason: from kotlin metadata */
    private final Lazy userLevelItems;
    public static final int $stable = 8;

    public InvestmentProfileSettingsBonfireIdentiViewState() {
        this(null, null, null, null, false, null, null, null, false, false, false, false, false, null, null, null, null, null, 262143, null);
    }

    private final UiEvent<Boolean> component14() {
        return this.scrollEvent;
    }

    public static /* synthetic */ InvestmentProfileSettingsBonfireIdentiViewState copy$default(InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, String str, ImmutableList immutableList, UiInvestmentProfileSettingsResponse.ValidResponse validResponse, UiEmploymentInfo uiEmploymentInfo, boolean z, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, UiEvent uiEvent4, String str2, String str3, Boolean bool, Boolean bool2, int i, Object obj) {
        Boolean bool3;
        Boolean bool4;
        String str4 = (i & 1) != 0 ? investmentProfileSettingsBonfireIdentiViewState.selectedAccountNumber : str;
        ImmutableList immutableList2 = (i & 2) != 0 ? investmentProfileSettingsBonfireIdentiViewState.accounts : immutableList;
        UiInvestmentProfileSettingsResponse.ValidResponse validResponse2 = (i & 4) != 0 ? investmentProfileSettingsBonfireIdentiViewState.investmentProfileSettingsResponse : validResponse;
        UiEmploymentInfo uiEmploymentInfo2 = (i & 8) != 0 ? investmentProfileSettingsBonfireIdentiViewState.employmentInfo : uiEmploymentInfo;
        boolean z7 = (i & 16) != 0 ? investmentProfileSettingsBonfireIdentiViewState.isPrimaryButtonLoading : z;
        UiEvent uiEvent5 = (i & 32) != 0 ? investmentProfileSettingsBonfireIdentiViewState.error : uiEvent;
        UiEvent uiEvent6 = (i & 64) != 0 ? investmentProfileSettingsBonfireIdentiViewState.questionnaireNotCompletedEvent : uiEvent2;
        UiEvent uiEvent7 = (i & 128) != 0 ? investmentProfileSettingsBonfireIdentiViewState.updateAppEvent : uiEvent3;
        boolean z8 = (i & 256) != 0 ? investmentProfileSettingsBonfireIdentiViewState.amlRefreshNeeded : z2;
        boolean z9 = (i & 512) != 0 ? investmentProfileSettingsBonfireIdentiViewState.riskToleranceUpdated : z3;
        boolean z10 = (i & 1024) != 0 ? investmentProfileSettingsBonfireIdentiViewState.annualIncomeUpdated : z4;
        boolean z11 = (i & 2048) != 0 ? investmentProfileSettingsBonfireIdentiViewState.isAccountLevelLoading : z5;
        boolean z12 = (i & 4096) != 0 ? investmentProfileSettingsBonfireIdentiViewState.showAccountSwitcher : z6;
        UiEvent uiEvent8 = (i & 8192) != 0 ? investmentProfileSettingsBonfireIdentiViewState.scrollEvent : uiEvent4;
        String str5 = str4;
        String str6 = (i & 16384) != 0 ? investmentProfileSettingsBonfireIdentiViewState.title : str2;
        String str7 = (i & 32768) != 0 ? investmentProfileSettingsBonfireIdentiViewState.subtitle : str3;
        Boolean bool5 = (i & 65536) != 0 ? investmentProfileSettingsBonfireIdentiViewState.useNewInfoGatherFlowForAnnualIncome : bool;
        if ((i & 131072) != 0) {
            bool4 = bool5;
            bool3 = investmentProfileSettingsBonfireIdentiViewState.useNewInfoGatherFlowForRiskTolerance;
        } else {
            bool3 = bool2;
            bool4 = bool5;
        }
        return investmentProfileSettingsBonfireIdentiViewState.copy(str5, immutableList2, validResponse2, uiEmploymentInfo2, z7, uiEvent5, uiEvent6, uiEvent7, z8, z9, z10, z11, z12, uiEvent8, str6, str7, bool4, bool3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSelectedAccountNumber() {
        return this.selectedAccountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getRiskToleranceUpdated() {
        return this.riskToleranceUpdated;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getAnnualIncomeUpdated() {
        return this.annualIncomeUpdated;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsAccountLevelLoading() {
        return this.isAccountLevelLoading;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShowAccountSwitcher() {
        return this.showAccountSwitcher;
    }

    /* renamed from: component15, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component16, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component17, reason: from getter */
    public final Boolean getUseNewInfoGatherFlowForAnnualIncome() {
        return this.useNewInfoGatherFlowForAnnualIncome;
    }

    /* renamed from: component18, reason: from getter */
    public final Boolean getUseNewInfoGatherFlowForRiskTolerance() {
        return this.useNewInfoGatherFlowForRiskTolerance;
    }

    public final ImmutableList<Account> component2() {
        return this.accounts;
    }

    /* renamed from: component3, reason: from getter */
    public final UiInvestmentProfileSettingsResponse.ValidResponse getInvestmentProfileSettingsResponse() {
        return this.investmentProfileSettingsResponse;
    }

    /* renamed from: component4, reason: from getter */
    public final UiEmploymentInfo getEmploymentInfo() {
        return this.employmentInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPrimaryButtonLoading() {
        return this.isPrimaryButtonLoading;
    }

    public final UiEvent<Throwable> component6() {
        return this.error;
    }

    public final UiEvent<String> component7() {
        return this.questionnaireNotCompletedEvent;
    }

    public final UiEvent<Unit> component8() {
        return this.updateAppEvent;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getAmlRefreshNeeded() {
        return this.amlRefreshNeeded;
    }

    public final InvestmentProfileSettingsBonfireIdentiViewState copy(String selectedAccountNumber, ImmutableList<Account> accounts2, UiInvestmentProfileSettingsResponse.ValidResponse investmentProfileSettingsResponse, UiEmploymentInfo employmentInfo, boolean isPrimaryButtonLoading, UiEvent<Throwable> error, UiEvent<String> questionnaireNotCompletedEvent, UiEvent<Unit> updateAppEvent, boolean amlRefreshNeeded, boolean riskToleranceUpdated, boolean annualIncomeUpdated, boolean isAccountLevelLoading, boolean showAccountSwitcher, UiEvent<Boolean> scrollEvent, String title, String subtitle, Boolean useNewInfoGatherFlowForAnnualIncome, Boolean useNewInfoGatherFlowForRiskTolerance) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        return new InvestmentProfileSettingsBonfireIdentiViewState(selectedAccountNumber, accounts2, investmentProfileSettingsResponse, employmentInfo, isPrimaryButtonLoading, error, questionnaireNotCompletedEvent, updateAppEvent, amlRefreshNeeded, riskToleranceUpdated, annualIncomeUpdated, isAccountLevelLoading, showAccountSwitcher, scrollEvent, title, subtitle, useNewInfoGatherFlowForAnnualIncome, useNewInfoGatherFlowForRiskTolerance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestmentProfileSettingsBonfireIdentiViewState)) {
            return false;
        }
        InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState = (InvestmentProfileSettingsBonfireIdentiViewState) other;
        return Intrinsics.areEqual(this.selectedAccountNumber, investmentProfileSettingsBonfireIdentiViewState.selectedAccountNumber) && Intrinsics.areEqual(this.accounts, investmentProfileSettingsBonfireIdentiViewState.accounts) && Intrinsics.areEqual(this.investmentProfileSettingsResponse, investmentProfileSettingsBonfireIdentiViewState.investmentProfileSettingsResponse) && Intrinsics.areEqual(this.employmentInfo, investmentProfileSettingsBonfireIdentiViewState.employmentInfo) && this.isPrimaryButtonLoading == investmentProfileSettingsBonfireIdentiViewState.isPrimaryButtonLoading && Intrinsics.areEqual(this.error, investmentProfileSettingsBonfireIdentiViewState.error) && Intrinsics.areEqual(this.questionnaireNotCompletedEvent, investmentProfileSettingsBonfireIdentiViewState.questionnaireNotCompletedEvent) && Intrinsics.areEqual(this.updateAppEvent, investmentProfileSettingsBonfireIdentiViewState.updateAppEvent) && this.amlRefreshNeeded == investmentProfileSettingsBonfireIdentiViewState.amlRefreshNeeded && this.riskToleranceUpdated == investmentProfileSettingsBonfireIdentiViewState.riskToleranceUpdated && this.annualIncomeUpdated == investmentProfileSettingsBonfireIdentiViewState.annualIncomeUpdated && this.isAccountLevelLoading == investmentProfileSettingsBonfireIdentiViewState.isAccountLevelLoading && this.showAccountSwitcher == investmentProfileSettingsBonfireIdentiViewState.showAccountSwitcher && Intrinsics.areEqual(this.scrollEvent, investmentProfileSettingsBonfireIdentiViewState.scrollEvent) && Intrinsics.areEqual(this.title, investmentProfileSettingsBonfireIdentiViewState.title) && Intrinsics.areEqual(this.subtitle, investmentProfileSettingsBonfireIdentiViewState.subtitle) && Intrinsics.areEqual(this.useNewInfoGatherFlowForAnnualIncome, investmentProfileSettingsBonfireIdentiViewState.useNewInfoGatherFlowForAnnualIncome) && Intrinsics.areEqual(this.useNewInfoGatherFlowForRiskTolerance, investmentProfileSettingsBonfireIdentiViewState.useNewInfoGatherFlowForRiskTolerance);
    }

    public int hashCode() {
        String str = this.selectedAccountNumber;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.accounts.hashCode()) * 31;
        UiInvestmentProfileSettingsResponse.ValidResponse validResponse = this.investmentProfileSettingsResponse;
        int iHashCode2 = (iHashCode + (validResponse == null ? 0 : validResponse.hashCode())) * 31;
        UiEmploymentInfo uiEmploymentInfo = this.employmentInfo;
        int iHashCode3 = (((iHashCode2 + (uiEmploymentInfo == null ? 0 : uiEmploymentInfo.hashCode())) * 31) + Boolean.hashCode(this.isPrimaryButtonLoading)) * 31;
        UiEvent<Throwable> uiEvent = this.error;
        int iHashCode4 = (iHashCode3 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<String> uiEvent2 = this.questionnaireNotCompletedEvent;
        int iHashCode5 = (iHashCode4 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Unit> uiEvent3 = this.updateAppEvent;
        int iHashCode6 = (((((((((((iHashCode5 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31) + Boolean.hashCode(this.amlRefreshNeeded)) * 31) + Boolean.hashCode(this.riskToleranceUpdated)) * 31) + Boolean.hashCode(this.annualIncomeUpdated)) * 31) + Boolean.hashCode(this.isAccountLevelLoading)) * 31) + Boolean.hashCode(this.showAccountSwitcher)) * 31;
        UiEvent<Boolean> uiEvent4 = this.scrollEvent;
        int iHashCode7 = (iHashCode6 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.useNewInfoGatherFlowForAnnualIncome;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.useNewInfoGatherFlowForRiskTolerance;
        return iHashCode10 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "InvestmentProfileSettingsBonfireIdentiViewState(selectedAccountNumber=" + this.selectedAccountNumber + ", accounts=" + this.accounts + ", investmentProfileSettingsResponse=" + this.investmentProfileSettingsResponse + ", employmentInfo=" + this.employmentInfo + ", isPrimaryButtonLoading=" + this.isPrimaryButtonLoading + ", error=" + this.error + ", questionnaireNotCompletedEvent=" + this.questionnaireNotCompletedEvent + ", updateAppEvent=" + this.updateAppEvent + ", amlRefreshNeeded=" + this.amlRefreshNeeded + ", riskToleranceUpdated=" + this.riskToleranceUpdated + ", annualIncomeUpdated=" + this.annualIncomeUpdated + ", isAccountLevelLoading=" + this.isAccountLevelLoading + ", showAccountSwitcher=" + this.showAccountSwitcher + ", scrollEvent=" + this.scrollEvent + ", title=" + this.title + ", subtitle=" + this.subtitle + ", useNewInfoGatherFlowForAnnualIncome=" + this.useNewInfoGatherFlowForAnnualIncome + ", useNewInfoGatherFlowForRiskTolerance=" + this.useNewInfoGatherFlowForRiskTolerance + ")";
    }

    public InvestmentProfileSettingsBonfireIdentiViewState(String str, ImmutableList<Account> accounts2, UiInvestmentProfileSettingsResponse.ValidResponse validResponse, UiEmploymentInfo uiEmploymentInfo, boolean z, UiEvent<Throwable> uiEvent, UiEvent<String> uiEvent2, UiEvent<Unit> uiEvent3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, UiEvent<Boolean> uiEvent4, String str2, String str3, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        this.selectedAccountNumber = str;
        this.accounts = accounts2;
        this.investmentProfileSettingsResponse = validResponse;
        this.employmentInfo = uiEmploymentInfo;
        this.isPrimaryButtonLoading = z;
        this.error = uiEvent;
        this.questionnaireNotCompletedEvent = uiEvent2;
        this.updateAppEvent = uiEvent3;
        this.amlRefreshNeeded = z2;
        this.riskToleranceUpdated = z3;
        this.annualIncomeUpdated = z4;
        this.isAccountLevelLoading = z5;
        this.showAccountSwitcher = z6;
        this.scrollEvent = uiEvent4;
        this.title = str2;
        this.subtitle = str3;
        this.useNewInfoGatherFlowForAnnualIncome = bool;
        this.useNewInfoGatherFlowForRiskTolerance = bool2;
        this.userLevelItems = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiViewState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentProfileSettingsBonfireIdentiViewState.userLevelItems_delegate$lambda$3(this.f$0);
            }
        });
        this.accountLevelItems = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.investorprofile.ui.profile.InvestmentProfileSettingsBonfireIdentiViewState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentProfileSettingsBonfireIdentiViewState.accountLevelItems_delegate$lambda$8(this.f$0);
            }
        });
    }

    public final String getSelectedAccountNumber() {
        return this.selectedAccountNumber;
    }

    public /* synthetic */ InvestmentProfileSettingsBonfireIdentiViewState(String str, ImmutableList immutableList, UiInvestmentProfileSettingsResponse.ValidResponse validResponse, UiEmploymentInfo uiEmploymentInfo, boolean z, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, UiEvent uiEvent4, String str2, String str3, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? extensions2.persistentListOf() : immutableList, (i & 4) != 0 ? null : validResponse, (i & 8) != 0 ? null : uiEmploymentInfo, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : uiEvent, (i & 64) != 0 ? null : uiEvent2, (i & 128) != 0 ? null : uiEvent3, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? false : z4, (i & 2048) != 0 ? false : z5, (i & 4096) == 0 ? z6 : false, (i & 8192) != 0 ? null : uiEvent4, (i & 16384) != 0 ? null : str2, (i & 32768) != 0 ? null : str3, (i & 65536) != 0 ? null : bool, (i & 131072) != 0 ? null : bool2);
    }

    public final ImmutableList<Account> getAccounts() {
        return this.accounts;
    }

    public final UiInvestmentProfileSettingsResponse.ValidResponse getInvestmentProfileSettingsResponse() {
        return this.investmentProfileSettingsResponse;
    }

    public final UiEmploymentInfo getEmploymentInfo() {
        return this.employmentInfo;
    }

    public final boolean isPrimaryButtonLoading() {
        return this.isPrimaryButtonLoading;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final UiEvent<String> getQuestionnaireNotCompletedEvent() {
        return this.questionnaireNotCompletedEvent;
    }

    public final UiEvent<Unit> getUpdateAppEvent() {
        return this.updateAppEvent;
    }

    public final boolean getAmlRefreshNeeded() {
        return this.amlRefreshNeeded;
    }

    public final boolean getRiskToleranceUpdated() {
        return this.riskToleranceUpdated;
    }

    public final boolean getAnnualIncomeUpdated() {
        return this.annualIncomeUpdated;
    }

    public final boolean isAccountLevelLoading() {
        return this.isAccountLevelLoading;
    }

    public final boolean getShowAccountSwitcher() {
        return this.showAccountSwitcher;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Boolean getUseNewInfoGatherFlowForAnnualIncome() {
        return this.useNewInfoGatherFlowForAnnualIncome;
    }

    public final Boolean getUseNewInfoGatherFlowForRiskTolerance() {
        return this.useNewInfoGatherFlowForRiskTolerance;
    }

    public final List<InvestmentProfileItem> getUserLevelItems() {
        return (List) this.userLevelItems.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List userLevelItems_delegate$lambda$3(InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState) {
        List<UiInvestmentProfileSettingsSection> sections;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(new InvestmentProfileItem.ScreenHeaderItem(investmentProfileSettingsBonfireIdentiViewState.title, investmentProfileSettingsBonfireIdentiViewState.subtitle));
        UiInvestmentProfileSettingsResponse.ValidResponse validResponse = investmentProfileSettingsBonfireIdentiViewState.investmentProfileSettingsResponse;
        if (validResponse != null && (sections = validResponse.getSections()) != null) {
            for (UiInvestmentProfileSettingsSection uiInvestmentProfileSettingsSection : sections) {
                listCreateListBuilder.add(new InvestmentProfileItem.ListHeaderItem(uiInvestmentProfileSettingsSection.getTitle(), uiInvestmentProfileSettingsSection.getTextStyle()));
                Iterator<T> it = uiInvestmentProfileSettingsSection.getQuestions().iterator();
                while (it.hasNext()) {
                    listCreateListBuilder.add(questionSummaryItem$default(investmentProfileSettingsBonfireIdentiViewState, (UiInvestmentProfileAnswers2) it.next(), null, 2, null));
                }
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public final List<InvestmentProfileItem> getAccountLevelItems() {
        return (List) this.accountLevelItems.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List accountLevelItems_delegate$lambda$8(InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState) {
        UiInvestmentProfileSettingsSection accountLevelSection;
        AccountSwitcherData accountSwitcherData;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        UiInvestmentProfileSettingsResponse.ValidResponse validResponse = investmentProfileSettingsBonfireIdentiViewState.investmentProfileSettingsResponse;
        if (validResponse != null && (accountLevelSection = validResponse.getAccountLevelSection()) != null) {
            listCreateListBuilder.add(new InvestmentProfileItem.ListHeaderItem(accountLevelSection.getTitle(), accountLevelSection.getTextStyle()));
            if (investmentProfileSettingsBonfireIdentiViewState.showAccountSwitcher && investmentProfileSettingsBonfireIdentiViewState.accounts.size() > 1 && (accountSwitcherData = investmentProfileSettingsBonfireIdentiViewState.getAccountSwitcherData()) != null) {
                listCreateListBuilder.add(new InvestmentProfileItem.AccountSwitcherItem(accountSwitcherData));
            }
            if (accountLevelSection.getQuestions().isEmpty()) {
                listCreateListBuilder.add(InvestmentProfileItem.AccountMessageItem.INSTANCE);
            } else {
                Iterator<T> it = accountLevelSection.getQuestions().iterator();
                while (it.hasNext()) {
                    listCreateListBuilder.add(investmentProfileSettingsBonfireIdentiViewState.questionSummaryItem((UiInvestmentProfileAnswers2) it.next(), accountLevelSection.getQuestionGraph()));
                }
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ InvestmentProfileItem.QuestionSummaryItem questionSummaryItem$default(InvestmentProfileSettingsBonfireIdentiViewState investmentProfileSettingsBonfireIdentiViewState, UiInvestmentProfileAnswers2 uiInvestmentProfileAnswers2, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return investmentProfileSettingsBonfireIdentiViewState.questionSummaryItem(uiInvestmentProfileAnswers2, map);
    }

    private final InvestmentProfileItem.QuestionSummaryItem questionSummaryItem(UiInvestmentProfileAnswers2 question, Map<String, ? extends UiQuestionnaireQuestion.Supported> questionGraph) {
        boolean z;
        UiInvestmentProfileAnswers2.SupportedType supportedType = question instanceof UiInvestmentProfileAnswers2.SupportedType ? (UiInvestmentProfileAnswers2.SupportedType) question : null;
        String key = supportedType != null ? supportedType.getKey() : null;
        boolean zAreEqual = false;
        if (Intrinsics.areEqual(key, "risk_tolerance")) {
            z = this.riskToleranceUpdated;
        } else {
            z = Intrinsics.areEqual(key, "annual_income") ? this.annualIncomeUpdated : false;
        }
        if (Intrinsics.areEqual(key, "risk_tolerance")) {
            zAreEqual = Intrinsics.areEqual(this.useNewInfoGatherFlowForRiskTolerance, Boolean.TRUE);
        } else if (Intrinsics.areEqual(key, "annual_income")) {
            zAreEqual = Intrinsics.areEqual(this.useNewInfoGatherFlowForAnnualIncome, Boolean.TRUE);
        }
        return new InvestmentProfileItem.QuestionSummaryItem(question, z, questionGraph, zAreEqual);
    }

    public final Account getSelectedAccount() {
        Account next;
        Account account = null;
        if (this.selectedAccountNumber != null) {
            Iterator<Account> it = this.accounts.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.getAccountNumber(), this.selectedAccountNumber)) {
                    break;
                }
            }
            Account account2 = next;
            if (account2 != null) {
                return account2;
            }
        }
        Iterator<Account> it2 = this.accounts.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Account next2 = it2.next();
            if (next2.isDefault()) {
                account = next2;
                break;
            }
        }
        Account account3 = account;
        return account3 == null ? (Account) CollectionsKt.firstOrNull((List) this.accounts) : account3;
    }

    public final StringResource getSelectedAccountType() {
        DisplayName displayName;
        DisplayName.Variants variants;
        Account selectedAccount = getSelectedAccount();
        if (selectedAccount == null || (displayName = AccountDisplayNames.getDisplayName(selectedAccount)) == null || (variants = displayName.getShort()) == null) {
            return null;
        }
        return variants.getTitle();
    }

    public final AccountSwitcherData getAccountSwitcherData() {
        Account selectedAccount = getSelectedAccount();
        if (selectedAccount != null) {
            return AccountSwitcherData.Companion.from$default(AccountSwitcherData.INSTANCE, selectedAccount.getAccountNumber(), AccountSwitcherUtils4.filterDeactivatedForSwitcher(this.accounts), false, false, null, 28, null);
        }
        return null;
    }

    /* compiled from: InvestmentProfileSettingsBonfireIdentiViewState.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem;", "", "<init>", "()V", "ScreenHeaderItem", "ListHeaderItem", "AccountSwitcherItem", "QuestionSummaryItem", "AccountMessageItem", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$AccountMessageItem;", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$AccountSwitcherItem;", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$ListHeaderItem;", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$QuestionSummaryItem;", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$ScreenHeaderItem;", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class InvestmentProfileItem {
        public static final int $stable = 0;

        public /* synthetic */ InvestmentProfileItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private InvestmentProfileItem() {
        }

        /* compiled from: InvestmentProfileSettingsBonfireIdentiViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$ScreenHeaderItem;", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem;", "title", "", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ScreenHeaderItem extends InvestmentProfileItem {
            public static final int $stable = 0;
            private final String subtitle;
            private final String title;

            public static /* synthetic */ ScreenHeaderItem copy$default(ScreenHeaderItem screenHeaderItem, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = screenHeaderItem.title;
                }
                if ((i & 2) != 0) {
                    str2 = screenHeaderItem.subtitle;
                }
                return screenHeaderItem.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            public final ScreenHeaderItem copy(String title, String subtitle) {
                return new ScreenHeaderItem(title, subtitle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ScreenHeaderItem)) {
                    return false;
                }
                ScreenHeaderItem screenHeaderItem = (ScreenHeaderItem) other;
                return Intrinsics.areEqual(this.title, screenHeaderItem.title) && Intrinsics.areEqual(this.subtitle, screenHeaderItem.subtitle);
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.subtitle;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "ScreenHeaderItem(title=" + this.title + ", subtitle=" + this.subtitle + ")";
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public ScreenHeaderItem(String str, String str2) {
                super(null);
                this.title = str;
                this.subtitle = str2;
            }
        }

        /* compiled from: InvestmentProfileSettingsBonfireIdentiViewState.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$ListHeaderItem;", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem;", "title", "", "textStyle", "Lcom/robinhood/models/serverdriven/experimental/api/TextStyle;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/TextStyle;)V", "getTitle", "()Ljava/lang/String;", "getTextStyle", "()Lcom/robinhood/models/serverdriven/experimental/api/TextStyle;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ListHeaderItem extends InvestmentProfileItem {
            public static final int $stable = 0;
            private final TextStyle textStyle;
            private final String title;

            public static /* synthetic */ ListHeaderItem copy$default(ListHeaderItem listHeaderItem, String str, TextStyle textStyle, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = listHeaderItem.title;
                }
                if ((i & 2) != 0) {
                    textStyle = listHeaderItem.textStyle;
                }
                return listHeaderItem.copy(str, textStyle);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final TextStyle getTextStyle() {
                return this.textStyle;
            }

            public final ListHeaderItem copy(String title, TextStyle textStyle) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(textStyle, "textStyle");
                return new ListHeaderItem(title, textStyle);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ListHeaderItem)) {
                    return false;
                }
                ListHeaderItem listHeaderItem = (ListHeaderItem) other;
                return Intrinsics.areEqual(this.title, listHeaderItem.title) && this.textStyle == listHeaderItem.textStyle;
            }

            public int hashCode() {
                return (this.title.hashCode() * 31) + this.textStyle.hashCode();
            }

            public String toString() {
                return "ListHeaderItem(title=" + this.title + ", textStyle=" + this.textStyle + ")";
            }

            public final String getTitle() {
                return this.title;
            }

            public final TextStyle getTextStyle() {
                return this.textStyle;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ListHeaderItem(String title, TextStyle textStyle) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(textStyle, "textStyle");
                this.title = title;
                this.textStyle = textStyle;
            }
        }

        /* compiled from: InvestmentProfileSettingsBonfireIdentiViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$AccountSwitcherItem;", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem;", "accountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "<init>", "(Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;)V", "getAccountSwitcherData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AccountSwitcherItem extends InvestmentProfileItem {
            public static final int $stable = 8;
            private final AccountSwitcherData accountSwitcherData;

            public static /* synthetic */ AccountSwitcherItem copy$default(AccountSwitcherItem accountSwitcherItem, AccountSwitcherData accountSwitcherData, int i, Object obj) {
                if ((i & 1) != 0) {
                    accountSwitcherData = accountSwitcherItem.accountSwitcherData;
                }
                return accountSwitcherItem.copy(accountSwitcherData);
            }

            /* renamed from: component1, reason: from getter */
            public final AccountSwitcherData getAccountSwitcherData() {
                return this.accountSwitcherData;
            }

            public final AccountSwitcherItem copy(AccountSwitcherData accountSwitcherData) {
                Intrinsics.checkNotNullParameter(accountSwitcherData, "accountSwitcherData");
                return new AccountSwitcherItem(accountSwitcherData);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AccountSwitcherItem) && Intrinsics.areEqual(this.accountSwitcherData, ((AccountSwitcherItem) other).accountSwitcherData);
            }

            public int hashCode() {
                return this.accountSwitcherData.hashCode();
            }

            public String toString() {
                return "AccountSwitcherItem(accountSwitcherData=" + this.accountSwitcherData + ")";
            }

            public final AccountSwitcherData getAccountSwitcherData() {
                return this.accountSwitcherData;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AccountSwitcherItem(AccountSwitcherData accountSwitcherData) {
                super(null);
                Intrinsics.checkNotNullParameter(accountSwitcherData, "accountSwitcherData");
                this.accountSwitcherData = accountSwitcherData;
            }
        }

        /* compiled from: InvestmentProfileSettingsBonfireIdentiViewState.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$QuestionSummaryItem;", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem;", "question", "Lcom/robinhood/models/ui/investmentprofilesettings/UiInvestmentProfileQuestion;", "updated", "", "questionGraph", "", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "showInfoGatherFlow", "<init>", "(Lcom/robinhood/models/ui/investmentprofilesettings/UiInvestmentProfileQuestion;ZLjava/util/Map;Z)V", "getQuestion", "()Lcom/robinhood/models/ui/investmentprofilesettings/UiInvestmentProfileQuestion;", "getUpdated", "()Z", "getQuestionGraph", "()Ljava/util/Map;", "getShowInfoGatherFlow", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class QuestionSummaryItem extends InvestmentProfileItem {
            public static final int $stable = 8;
            private final UiInvestmentProfileAnswers2 question;
            private final Map<String, UiQuestionnaireQuestion.Supported> questionGraph;
            private final boolean showInfoGatherFlow;
            private final boolean updated;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ QuestionSummaryItem copy$default(QuestionSummaryItem questionSummaryItem, UiInvestmentProfileAnswers2 uiInvestmentProfileAnswers2, boolean z, Map map, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiInvestmentProfileAnswers2 = questionSummaryItem.question;
                }
                if ((i & 2) != 0) {
                    z = questionSummaryItem.updated;
                }
                if ((i & 4) != 0) {
                    map = questionSummaryItem.questionGraph;
                }
                if ((i & 8) != 0) {
                    z2 = questionSummaryItem.showInfoGatherFlow;
                }
                return questionSummaryItem.copy(uiInvestmentProfileAnswers2, z, map, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final UiInvestmentProfileAnswers2 getQuestion() {
                return this.question;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getUpdated() {
                return this.updated;
            }

            public final Map<String, UiQuestionnaireQuestion.Supported> component3() {
                return this.questionGraph;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getShowInfoGatherFlow() {
                return this.showInfoGatherFlow;
            }

            public final QuestionSummaryItem copy(UiInvestmentProfileAnswers2 question, boolean updated, Map<String, ? extends UiQuestionnaireQuestion.Supported> questionGraph, boolean showInfoGatherFlow) {
                Intrinsics.checkNotNullParameter(question, "question");
                return new QuestionSummaryItem(question, updated, questionGraph, showInfoGatherFlow);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof QuestionSummaryItem)) {
                    return false;
                }
                QuestionSummaryItem questionSummaryItem = (QuestionSummaryItem) other;
                return Intrinsics.areEqual(this.question, questionSummaryItem.question) && this.updated == questionSummaryItem.updated && Intrinsics.areEqual(this.questionGraph, questionSummaryItem.questionGraph) && this.showInfoGatherFlow == questionSummaryItem.showInfoGatherFlow;
            }

            public int hashCode() {
                int iHashCode = ((this.question.hashCode() * 31) + Boolean.hashCode(this.updated)) * 31;
                Map<String, UiQuestionnaireQuestion.Supported> map = this.questionGraph;
                return ((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + Boolean.hashCode(this.showInfoGatherFlow);
            }

            public String toString() {
                return "QuestionSummaryItem(question=" + this.question + ", updated=" + this.updated + ", questionGraph=" + this.questionGraph + ", showInfoGatherFlow=" + this.showInfoGatherFlow + ")";
            }

            public /* synthetic */ QuestionSummaryItem(UiInvestmentProfileAnswers2 uiInvestmentProfileAnswers2, boolean z, Map map, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(uiInvestmentProfileAnswers2, z, (i & 4) != 0 ? null : map, (i & 8) != 0 ? false : z2);
            }

            public final UiInvestmentProfileAnswers2 getQuestion() {
                return this.question;
            }

            public final boolean getUpdated() {
                return this.updated;
            }

            public final Map<String, UiQuestionnaireQuestion.Supported> getQuestionGraph() {
                return this.questionGraph;
            }

            public final boolean getShowInfoGatherFlow() {
                return this.showInfoGatherFlow;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public QuestionSummaryItem(UiInvestmentProfileAnswers2 question, boolean z, Map<String, ? extends UiQuestionnaireQuestion.Supported> map, boolean z2) {
                super(null);
                Intrinsics.checkNotNullParameter(question, "question");
                this.question = question;
                this.updated = z;
                this.questionGraph = map;
                this.showInfoGatherFlow = z2;
            }
        }

        /* compiled from: InvestmentProfileSettingsBonfireIdentiViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem$AccountMessageItem;", "Lcom/robinhood/android/investorprofile/ui/profile/InvestmentProfileSettingsBonfireIdentiViewState$InvestmentProfileItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AccountMessageItem extends InvestmentProfileItem {
            public static final int $stable = 0;
            public static final AccountMessageItem INSTANCE = new AccountMessageItem();

            public boolean equals(Object other) {
                return this == other || (other instanceof AccountMessageItem);
            }

            public int hashCode() {
                return -386893415;
            }

            public String toString() {
                return "AccountMessageItem";
            }

            private AccountMessageItem() {
                super(null);
            }
        }
    }
}
