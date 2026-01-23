package com.robinhood.android.transfers.p271ui.max.iracontribution;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireKey;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireLaunchMode;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.p271ui.max.iracontribution.IraContributionQuestionnaireLoadingFragment;
import com.robinhood.android.transfers.p271ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment;
import com.robinhood.android.transfers.p271ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment;
import com.robinhood.models.api.bonfire.ApiIraContributionQuestionnaire;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import p479j$.time.Year;

/* compiled from: IraContributionQuestionnaireActivity.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001?B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\bJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020\r2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-H\u0096\u0001¢\u0006\u0004\b.\u0010/R/\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u00100\u001a\u0004\u0018\u00010\u001d8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u0010 R/\u0010\n\u001a\u0004\u0018\u00010\t2\b\u00100\u001a\u0004\u0018\u00010\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00102\u001a\u0004\b7\u00108\"\u0004\b9\u0010&R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/IraContributionQuestionnaireActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/IraContributionQuestionnaireLoadingFragment$Callbacks;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/contributiontype/IraContributionQuestionnaireContributionTypeFragment$Callbacks;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/taxyear/IraContributionQuestionnaireTaxYearFragment$Callbacks;", "<init>", "()V", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "contributionType", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "transferAccount", "", "handleSelectedIraContributionType", "(Lcom/robinhood/models/api/bonfire/IraContributionType;Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult;", "result", "setQuestionnaireResultAndFinish", "(Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "id", "onDialogDismissed", "(I)V", "onBackPressed", "Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire;", "questionnaire", "onLoadQuestionnaireSuccess", "(Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire;)V", "", "throwable", "onLoadQuestionnaireFailed", "(Ljava/lang/Throwable;)V", "onContributionTypeSelected", "(Lcom/robinhood/models/api/bonfire/IraContributionType;)V", "j$/time/Year", "taxYear", "Lcom/robinhood/models/util/Money;", "contributionLimit", "onTaxYearSelected", "(Lj$/time/Year;Lcom/robinhood/models/util/Money;)V", "", "onDismissUnsupportedFeatureDialog", "()Z", "<set-?>", "questionnaire$delegate", "Lkotlin/properties/ReadWriteProperty;", "getQuestionnaire", "()Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire;", "setQuestionnaire", "contributionType$delegate", "getContributionType", "()Lcom/robinhood/models/api/bonfire/IraContributionType;", "setContributionType", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class IraContributionQuestionnaireActivity extends BaseActivity implements RhDialogFragment.OnDismissListener, RegionGated, IraContributionQuestionnaireLoadingFragment.Callbacks, IraContributionQuestionnaireContributionTypeFragment.Callbacks, IraContributionQuestionnaireTaxYearFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: contributionType$delegate, reason: from kotlin metadata */
    private final Interfaces3 contributionType;

    /* renamed from: questionnaire$delegate, reason: from kotlin metadata */
    private final Interfaces3 questionnaire;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(IraContributionQuestionnaireActivity.class, "questionnaire", "getQuestionnaire()Lcom/robinhood/models/api/bonfire/ApiIraContributionQuestionnaire;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(IraContributionQuestionnaireActivity.class, "contributionType", "getContributionType()Lcom/robinhood/models/api/bonfire/IraContributionType;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: IraContributionQuestionnaireActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IraContributionType.values().length];
            try {
                iArr[IraContributionType.INDIRECT_ROLLOVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IraContributionType.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IraContributionType.ONE_TIME_CONTRIBUTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public IraContributionQuestionnaireActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);
        Interfaces interfacesSavedParcelable = BindSavedState2.savedParcelable(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.questionnaire = (Interfaces3) interfacesSavedParcelable.provideDelegate(this, kPropertyArr[0]);
        this.contributionType = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, kPropertyArr[1]);
    }

    private final ApiIraContributionQuestionnaire getQuestionnaire() {
        return (ApiIraContributionQuestionnaire) this.questionnaire.getValue(this, $$delegatedProperties[0]);
    }

    private final void setQuestionnaire(ApiIraContributionQuestionnaire apiIraContributionQuestionnaire) {
        this.questionnaire.setValue(this, $$delegatedProperties[0], apiIraContributionQuestionnaire);
    }

    private final IraContributionType getContributionType() {
        return (IraContributionType) this.contributionType.getValue(this, $$delegatedProperties[1]);
    }

    private final void setContributionType(IraContributionType iraContributionType) {
        this.contributionType.setValue(this, $$delegatedProperties[1], iraContributionType);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, IraContributionQuestionnaireLoadingFragment.INSTANCE.newInstance((Parcelable) new IraContributionQuestionnaireLoadingFragment.Args(((IraContributionQuestionnaireKey) INSTANCE.getExtras((Activity) this)).getAllowNoAccounts())));
        }
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            finish();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment instanceof IraContributionQuestionnaireContributionTypeFragment) {
            finish();
            return;
        }
        if (currentFragment instanceof IraContributionQuestionnaireTaxYearFragment) {
            IraContributionQuestionnaireLaunchMode launchMode = ((IraContributionQuestionnaireKey) INSTANCE.getExtras((Activity) this)).getLaunchMode();
            if ((launchMode instanceof IraContributionQuestionnaireLaunchMode.EditContributionType) || (launchMode instanceof IraContributionQuestionnaireLaunchMode.FullQuestionnaire)) {
                super.onBackPressed();
                return;
            } else {
                if (!(launchMode instanceof IraContributionQuestionnaireLaunchMode.EditTaxYear)) {
                    throw new NoWhenBranchMatchedException();
                }
                setQuestionnaireResultAndFinish(new IraContributionQuestionnaireResult.UpdateTaxYear(null, null));
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.robinhood.android.transfers.ui.max.iracontribution.IraContributionQuestionnaireLoadingFragment.Callbacks
    public void onLoadQuestionnaireSuccess(ApiIraContributionQuestionnaire questionnaire) {
        Intrinsics.checkNotNullParameter(questionnaire, "questionnaire");
        setQuestionnaire(questionnaire);
        IraContributionQuestionnaireLaunchMode launchMode = ((IraContributionQuestionnaireKey) INSTANCE.getExtras((Activity) this)).getLaunchMode();
        if ((launchMode instanceof IraContributionQuestionnaireLaunchMode.EditContributionType) || (launchMode instanceof IraContributionQuestionnaireLaunchMode.FullQuestionnaire)) {
            replaceFragmentWithoutAnimation(IraContributionQuestionnaireContributionTypeFragment.INSTANCE.newInstance((Parcelable) questionnaire.getContribution_type_view_model()));
        } else {
            if (!(launchMode instanceof IraContributionQuestionnaireLaunchMode.EditTaxYear)) {
                throw new NoWhenBranchMatchedException();
            }
            ApiIraContributionQuestionnaire.TaxYearViewModel tax_year_view_model = questionnaire.getTax_year_view_model();
            if (tax_year_view_model == null) {
                throw new IllegalArgumentException("No tax year view model when requesting TaxYear launch mode");
            }
            replaceFragmentWithoutAnimation(IraContributionQuestionnaireTaxYearFragment.INSTANCE.newInstance((Parcelable) new IraContributionQuestionnaireTaxYearFragment.Args(tax_year_view_model, ((IraContributionQuestionnaireLaunchMode.EditTaxYear) launchMode).getSelectionStyle())));
        }
    }

    @Override // com.robinhood.android.transfers.ui.max.iracontribution.IraContributionQuestionnaireLoadingFragment.Callbacks
    public void onLoadQuestionnaireFailed(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, this, throwable, true, false, 0, null, 56, null);
    }

    @Override // com.robinhood.android.transfers.ui.max.iracontribution.contributiontype.IraContributionQuestionnaireContributionTypeFragment.Callbacks
    public void onContributionTypeSelected(IraContributionType contributionType) {
        Intrinsics.checkNotNullParameter(contributionType, "contributionType");
        setContributionType(contributionType);
        IraContributionQuestionnaireLaunchMode launchMode = ((IraContributionQuestionnaireKey) INSTANCE.getExtras((Activity) this)).getLaunchMode();
        if (launchMode instanceof IraContributionQuestionnaireLaunchMode.FullQuestionnaire) {
            handleSelectedIraContributionType(contributionType, ((IraContributionQuestionnaireLaunchMode.FullQuestionnaire) launchMode).getTransferAccount());
            return;
        }
        if (launchMode instanceof IraContributionQuestionnaireLaunchMode.EditContributionType) {
            IraContributionQuestionnaireLaunchMode.EditContributionType editContributionType = (IraContributionQuestionnaireLaunchMode.EditContributionType) launchMode;
            if (editContributionType.getCurrentContributionType() == contributionType) {
                finish();
            }
            handleSelectedIraContributionType(contributionType, editContributionType.getTransferAccount());
            return;
        }
        if (!(launchMode instanceof IraContributionQuestionnaireLaunchMode.EditTaxYear)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Contribution type selected when launch mode is TaxYear");
    }

    @Override // com.robinhood.android.transfers.ui.max.iracontribution.taxyear.IraContributionQuestionnaireTaxYearFragment.Callbacks
    public void onTaxYearSelected(Year taxYear, Money contributionLimit) {
        Intrinsics.checkNotNullParameter(taxYear, "taxYear");
        Intrinsics.checkNotNullParameter(contributionLimit, "contributionLimit");
        IraContributionQuestionnaireLaunchMode launchMode = ((IraContributionQuestionnaireKey) INSTANCE.getExtras((Activity) this)).getLaunchMode();
        if (!(launchMode instanceof IraContributionQuestionnaireLaunchMode.AccountRequired)) {
            if (!(launchMode instanceof IraContributionQuestionnaireLaunchMode.EditTaxYear)) {
                throw new NoWhenBranchMatchedException();
            }
            setQuestionnaireResultAndFinish(new IraContributionQuestionnaireResult.UpdateTaxYear(taxYear, contributionLimit));
            return;
        }
        IraContributionType contributionType = getContributionType();
        if (contributionType == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[contributionType.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Tax year selected when performing a rollover");
        }
        if (i == 2) {
            throw new IllegalStateException("Unknown contribution types should be filtered out");
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        setQuestionnaireResultAndFinish(new IraContributionQuestionnaireResult.IraContribution.OneTimeContribution(((IraContributionQuestionnaireLaunchMode.AccountRequired) launchMode).getTransferAccount(), taxYear, contributionLimit));
    }

    private final void handleSelectedIraContributionType(IraContributionType contributionType, TransferAccount transferAccount) {
        int i = WhenMappings.$EnumSwitchMapping$0[contributionType.ordinal()];
        if (i == 1) {
            setQuestionnaireResultAndFinish(new IraContributionQuestionnaireResult.IraContribution.IndirectRollover(transferAccount));
            return;
        }
        if (i == 2) {
            throw new IllegalStateException("Unknown contribution types should be filtered out");
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ApiIraContributionQuestionnaire questionnaire = getQuestionnaire();
        if (questionnaire == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ApiIraContributionQuestionnaire.TaxYearViewModel tax_year_view_model = questionnaire.getTax_year_view_model();
        if (tax_year_view_model == null) {
            throw new IllegalArgumentException("Tax year view model should be non-null if a contribution type is selectable");
        }
        replaceFragmentWithoutAnimation(IraContributionQuestionnaireTaxYearFragment.INSTANCE.newInstance((Parcelable) new IraContributionQuestionnaireTaxYearFragment.Args(tax_year_view_model, IraContributionQuestionnaireLaunchMode.SelectionStyle.NAVIGATION_ROW)));
    }

    private final void setQuestionnaireResultAndFinish(IraContributionQuestionnaireResult result) {
        NavigationActivityResultContract3.finishWithResult(this, result);
    }

    /* compiled from: IraContributionQuestionnaireActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iracontribution/IraContributionQuestionnaireActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/ui/max/iracontribution/IraContributionQuestionnaireActivity;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireKey;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<IraContributionQuestionnaireActivity, IraContributionQuestionnaireKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public IraContributionQuestionnaireKey getExtras(IraContributionQuestionnaireActivity iraContributionQuestionnaireActivity) {
            return (IraContributionQuestionnaireKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, iraContributionQuestionnaireActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, IraContributionQuestionnaireKey iraContributionQuestionnaireKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, iraContributionQuestionnaireKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, IraContributionQuestionnaireKey iraContributionQuestionnaireKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, iraContributionQuestionnaireKey);
        }
    }
}
