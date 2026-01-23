package com.robinhood.android.employment.p114ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.employment.C14481R;
import com.robinhood.android.employment.lib.ChooseEmploymentResult;
import com.robinhood.android.employment.p114ui.ChooseEmployerFragment;
import com.robinhood.android.employment.p114ui.ChooseEmploymentLoadingFragment;
import com.robinhood.android.employment.p114ui.ChooseEmploymentStatusFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.api.identi.ApiEmploymentInfo;
import com.robinhood.models.p355ui.bonfire.UiEmployerType;
import com.robinhood.models.p355ui.identi.UiEmploymentInfo;
import com.robinhood.shared.onboarding.contracts.ChooseEmploymentContext;
import com.robinhood.shared.onboarding.contracts.ChooseEmploymentIntentKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChooseEmploymentActivity.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001$B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J*\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0002¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmploymentActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusFragment$Callbacks;", "Lcom/robinhood/android/employment/ui/ChooseEmploymentLoadingFragment$Callbacks;", "Lcom/robinhood/android/employment/ui/ChooseEmployerFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onLoadingSuccess", "employerTypes", "Lcom/robinhood/models/ui/bonfire/UiEmployerType;", "onLoadingFailure", "error", "", "onDialogDismissed", "id", "", "onEmploymentStatusSubmitted", "status", "Lcom/robinhood/models/api/identi/ApiEmploymentInfo$EmploymentStatus;", "employerType", "onEmployerInfoRequired", "onEmployerInfoEntered", "employerName", "", "employerDescription", "employerIndustry", "shouldRouteToEmployerAddressUpdate", "", "finishWithResult", "result", "Lcom/robinhood/models/ui/identi/UiEmploymentInfo;", "Companion", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ChooseEmploymentActivity extends BaseActivity implements RhDialogFragment.OnDismissListener, ChooseEmploymentStatusFragment.Callbacks, ChooseEmploymentLoadingFragment.Callbacks, ChooseEmployerFragment.Callbacks {
    public static final String UPDATE_EMPLOYER_ADDRESS_ODYSSEY_DEEPLINK = "robinhood://odyssey?path=employment_address";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public ChooseEmploymentActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, ChooseEmploymentLoadingFragment.INSTANCE.newInstance((Parcelable) new ChooseEmploymentLoadingFragment.Args(((ChooseEmploymentIntentKey) INSTANCE.getExtras((Activity) this)).isRhdOnboarding())));
        }
    }

    @Override // com.robinhood.android.employment.ui.ChooseEmploymentLoadingFragment.Callbacks
    public void onLoadingSuccess(UiEmployerType employerTypes) {
        BaseFragment baseFragment;
        Intrinsics.checkNotNullParameter(employerTypes, "employerTypes");
        ChooseEmploymentContext context = ((ChooseEmploymentIntentKey) INSTANCE.getExtras((Activity) this)).getContext();
        if (context instanceof ChooseEmploymentContext.Default) {
            baseFragment = (BaseFragment) ChooseEmploymentStatusFragment.INSTANCE.newInstance((Parcelable) new ChooseEmploymentStatusFragment.Args(employerTypes));
        } else {
            if (!(context instanceof ChooseEmploymentContext.Employed)) {
                throw new NoWhenBranchMatchedException();
            }
            baseFragment = (BaseFragment) ChooseEmployerFragment.INSTANCE.newInstance((Parcelable) new ChooseEmployerFragment.Args(employerTypes, ApiEmploymentInfo.EmploymentStatus.EMPLOYED, false, ((ChooseEmploymentContext.Employed) context).getEmployerName(), 4, null));
        }
        replaceFragmentWithoutBackStack(baseFragment);
    }

    @Override // com.robinhood.android.employment.ui.ChooseEmploymentLoadingFragment.Callbacks
    public void onLoadingFailure(Throwable error) throws Throwable {
        Intrinsics.checkNotNullParameter(error, "error");
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, this, error, true, false, C14481R.id.dialog_id_employer_type_error, null, 40, null);
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C14481R.id.dialog_id_employer_type_error) {
            finish();
        }
    }

    @Override // com.robinhood.android.employment.ui.ChooseEmploymentStatusFragment.Callbacks
    public void onEmploymentStatusSubmitted(ApiEmploymentInfo.EmploymentStatus status, UiEmployerType employerType) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(employerType, "employerType");
        finishWithResult(new UiEmploymentInfo(status, null, null, null, 14, null));
    }

    @Override // com.robinhood.android.employment.ui.ChooseEmploymentStatusFragment.Callbacks
    public void onEmployerInfoRequired(ApiEmploymentInfo.EmploymentStatus status, UiEmployerType employerType) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(employerType, "employerType");
        replaceFragment(ChooseEmployerFragment.INSTANCE.newInstance((Parcelable) new ChooseEmployerFragment.Args(employerType, status, true, null, 8, null)));
    }

    @Override // com.robinhood.android.employment.ui.ChooseEmployerFragment.Callbacks
    public void onEmployerInfoEntered(String employerName, String employerDescription, String employerIndustry, boolean shouldRouteToEmployerAddressUpdate) {
        Intrinsics.checkNotNullParameter(employerName, "employerName");
        Intrinsics.checkNotNullParameter(employerDescription, "employerDescription");
        if (shouldRouteToEmployerAddressUpdate) {
            Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, Uri.parse(UPDATE_EMPLOYER_ADDRESS_ODYSSEY_DEEPLINK), null, null, false, null, 60, null);
        }
        finishWithResult(new UiEmploymentInfo(ApiEmploymentInfo.EmploymentStatus.EMPLOYED, employerDescription, employerName, employerIndustry));
    }

    private final void finishWithResult(UiEmploymentInfo result) {
        Intent intent = new Intent();
        intent.putExtra(ChooseEmploymentResult.EXTRA_EMPLOYMENT_RESULT, result);
        setResult(-1, intent);
        finish();
    }

    /* compiled from: ChooseEmploymentActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmploymentActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/employment/ui/ChooseEmploymentActivity;", "Lcom/robinhood/shared/onboarding/contracts/ChooseEmploymentIntentKey;", "<init>", "()V", "UPDATE_EMPLOYER_ADDRESS_ODYSSEY_DEEPLINK", "", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<ChooseEmploymentActivity, ChooseEmploymentIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public ChooseEmploymentIntentKey getExtras(ChooseEmploymentActivity chooseEmploymentActivity) {
            return (ChooseEmploymentIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, chooseEmploymentActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, ChooseEmploymentIntentKey chooseEmploymentIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, chooseEmploymentIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, ChooseEmploymentIntentKey chooseEmploymentIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, chooseEmploymentIntentKey);
        }
    }
}
