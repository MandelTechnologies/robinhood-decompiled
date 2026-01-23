package com.robinhood.android.transfers.p271ui.max.iradistribution;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.view.result.contract.ActivityResultContract;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.IraDistributionQuestionnaireResult;
import com.robinhood.android.transfers.p271ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeFragment;
import com.robinhood.android.transfers.p271ui.max.iradistribution.IraDistributionQuestionnaireFaqFragment;
import com.robinhood.android.transfers.p271ui.max.iradistribution.IraDistributionQuestionnaireLaunchMode;
import com.robinhood.android.transfers.p271ui.max.iradistribution.IraDistributionQuestionnaireLoadingFragment;
import com.robinhood.models.api.bonfire.ApiIraDistributionQuestionnaire;
import com.robinhood.models.api.bonfire.IraDistributionType;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.p409ui.activity.ActivityCompanion3;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: IraDistributionQuestionnaireActivity.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002)*B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0016J\t\u0010\"\u001a\u00020#H\u0096\u0001R/\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLoadingFragment$Callbacks;", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireFaqFragment$Callbacks;", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireDistributionTypeFragment$Callbacks;", "<init>", "()V", "<set-?>", "Lcom/robinhood/models/api/bonfire/ApiIraDistributionQuestionnaire;", "questionnaire", "getQuestionnaire", "()Lcom/robinhood/models/api/bonfire/ApiIraDistributionQuestionnaire;", "setQuestionnaire", "(Lcom/robinhood/models/api/bonfire/ApiIraDistributionQuestionnaire;)V", "questionnaire$delegate", "Lkotlin/properties/ReadWriteProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "onBackPressed", "onLoadQuestionnaireSuccess", "onLoadQuestionnaireFailed", "throwable", "", "onFaqCompleted", "onDistributionTypeSelected", "distributionType", "Lcom/robinhood/models/api/bonfire/IraDistributionType;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "ResultContract", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class IraDistributionQuestionnaireActivity extends BaseActivity implements RhDialogFragment.OnDismissListener, RegionGated, IraDistributionQuestionnaireLoadingFragment.Callbacks, IraDistributionQuestionnaireFaqFragment.Callbacks, IraDistributionQuestionnaireDistributionTypeFragment.Callbacks {
    private static final String EXTRA_RESULT = "extraIraDistributionQuestionnaireResult";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: questionnaire$delegate, reason: from kotlin metadata */
    private final Interfaces3 questionnaire;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(IraDistributionQuestionnaireActivity.class, "questionnaire", "getQuestionnaire()Lcom/robinhood/models/api/bonfire/ApiIraDistributionQuestionnaire;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public IraDistributionQuestionnaireActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);
        this.questionnaire = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, $$delegatedProperties[0]);
    }

    private final ApiIraDistributionQuestionnaire getQuestionnaire() {
        return (ApiIraDistributionQuestionnaire) this.questionnaire.getValue(this, $$delegatedProperties[0]);
    }

    private final void setQuestionnaire(ApiIraDistributionQuestionnaire apiIraDistributionQuestionnaire) {
        this.questionnaire.setValue(this, $$delegatedProperties[0], apiIraDistributionQuestionnaire);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            IraDistributionQuestionnaireLoadingFragment.Companion companion = IraDistributionQuestionnaireLoadingFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new IraDistributionQuestionnaireLoadingFragment.Args(((IraDistributionQuestionnaireLaunchMode) companion2.getExtras((Activity) this)).getTransferAccount().getType(), ((IraDistributionQuestionnaireLaunchMode) companion2.getExtras((Activity) this)).getTransferAccount().getAccountId())));
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
        if (currentFragment instanceof IraDistributionQuestionnaireFaqFragment) {
            finish();
            return;
        }
        if (currentFragment instanceof IraDistributionQuestionnaireDistributionTypeFragment) {
            IraDistributionQuestionnaireLaunchMode iraDistributionQuestionnaireLaunchMode = (IraDistributionQuestionnaireLaunchMode) INSTANCE.getExtras((Activity) this);
            if (iraDistributionQuestionnaireLaunchMode instanceof IraDistributionQuestionnaireLaunchMode.EditDistributionType) {
                finish();
                return;
            } else {
                if (!(iraDistributionQuestionnaireLaunchMode instanceof IraDistributionQuestionnaireLaunchMode.FullQuestionnaire)) {
                    throw new NoWhenBranchMatchedException();
                }
                super.onBackPressed();
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireLoadingFragment.Callbacks
    public void onLoadQuestionnaireSuccess(ApiIraDistributionQuestionnaire questionnaire) {
        Fragment fragmentNewInstance;
        Intrinsics.checkNotNullParameter(questionnaire, "questionnaire");
        setQuestionnaire(questionnaire);
        IraDistributionQuestionnaireLaunchMode iraDistributionQuestionnaireLaunchMode = (IraDistributionQuestionnaireLaunchMode) INSTANCE.getExtras((Activity) this);
        if (iraDistributionQuestionnaireLaunchMode instanceof IraDistributionQuestionnaireLaunchMode.EditDistributionType) {
            fragmentNewInstance = IraDistributionQuestionnaireDistributionTypeFragment.INSTANCE.newInstance((Parcelable) questionnaire.getDistribution_type_view_model());
        } else {
            if (!(iraDistributionQuestionnaireLaunchMode instanceof IraDistributionQuestionnaireLaunchMode.FullQuestionnaire)) {
                throw new NoWhenBranchMatchedException();
            }
            fragmentNewInstance = IraDistributionQuestionnaireFaqFragment.INSTANCE.newInstance((Parcelable) questionnaire.getDistribution_faq_view_model());
        }
        replaceFragmentWithoutAnimation(fragmentNewInstance);
    }

    @Override // com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireLoadingFragment.Callbacks
    public void onLoadQuestionnaireFailed(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, this, throwable, true, false, 0, null, 56, null);
    }

    @Override // com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireFaqFragment.Callbacks
    public void onFaqCompleted() {
        IraDistributionQuestionnaireDistributionTypeFragment.Companion companion = IraDistributionQuestionnaireDistributionTypeFragment.INSTANCE;
        ApiIraDistributionQuestionnaire questionnaire = getQuestionnaire();
        if (questionnaire != null) {
            replaceFragment(companion.newInstance((Parcelable) questionnaire.getDistribution_type_view_model()));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeFragment.Callbacks
    public void onDistributionTypeSelected(IraDistributionType distributionType) {
        Parcelable iraDistribution;
        Intrinsics.checkNotNullParameter(distributionType, "distributionType");
        IraDistributionQuestionnaireLaunchMode iraDistributionQuestionnaireLaunchMode = (IraDistributionQuestionnaireLaunchMode) INSTANCE.getExtras((Activity) this);
        Intent intent = new Intent();
        if (iraDistributionQuestionnaireLaunchMode instanceof IraDistributionQuestionnaireLaunchMode.EditDistributionType) {
            iraDistribution = new IraDistributionQuestionnaireResult.UpdateDistributionType(distributionType);
        } else {
            if (!(iraDistributionQuestionnaireLaunchMode instanceof IraDistributionQuestionnaireLaunchMode.FullQuestionnaire)) {
                throw new NoWhenBranchMatchedException();
            }
            iraDistribution = new IraDistributionQuestionnaireResult.IraDistribution(((IraDistributionQuestionnaireLaunchMode.FullQuestionnaire) iraDistributionQuestionnaireLaunchMode).getTransferAccount(), distributionType);
        }
        intent.putExtra(EXTRA_RESULT, iraDistribution);
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
    }

    /* compiled from: IraDistributionQuestionnaireActivity.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireActivity$ResultContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLaunchMode;", "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ResultContract extends ActivityResultContract<IraDistributionQuestionnaireLaunchMode, IraDistributionQuestionnaireResult> {
        public static final ResultContract INSTANCE = new ResultContract();
        public static final int $stable = 8;

        private ResultContract() {
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public Intent createIntent(Context context, IraDistributionQuestionnaireLaunchMode input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return IraDistributionQuestionnaireActivity.INSTANCE.getIntentWithExtras(context, (Parcelable) input);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.view.result.contract.ActivityResultContract
        public IraDistributionQuestionnaireResult parseResult(int resultCode, Intent intent) {
            if (resultCode != -1 || intent == null) {
                return null;
            }
            return (IraDistributionQuestionnaireResult) intent.getParcelableExtra(IraDistributionQuestionnaireActivity.EXTRA_RESULT);
        }
    }

    /* compiled from: IraDistributionQuestionnaireActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireActivity$Companion;", "Lcom/robinhood/utils/ui/activity/ActivityWithExtrasCompanion;", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireActivity;", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireLaunchMode;", "<init>", "()V", "EXTRA_RESULT", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements ActivityCompanion3<IraDistributionQuestionnaireActivity, IraDistributionQuestionnaireLaunchMode> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public IraDistributionQuestionnaireLaunchMode getExtras(IraDistributionQuestionnaireActivity iraDistributionQuestionnaireActivity) {
            return (IraDistributionQuestionnaireLaunchMode) ActivityCompanion3.DefaultImpls.getExtras(this, iraDistributionQuestionnaireActivity);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, IraDistributionQuestionnaireLaunchMode iraDistributionQuestionnaireLaunchMode) {
            return ActivityCompanion3.DefaultImpls.getIntentWithExtras(this, context, iraDistributionQuestionnaireLaunchMode);
        }
    }
}
