package com.robinhood.android.resumeapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.resumeapplication.ResumeApplicationParentFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ResumeApplicationActivity.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResumeApplicationActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ResumeApplicationActivity extends BaseActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public ResumeApplicationActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            ResumeApplicationParentFragment.Companion companion = ResumeApplicationParentFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new ResumeApplicationParentFragment.Args(((ResumeApplication) companion2.getExtras((Activity) this)).getVariant(), ((ResumeApplication) companion2.getExtras((Activity) this)).getShowWelcomeBack(), ((ResumeApplication) companion2.getExtras((Activity) this)).getFirstName(), ((ResumeApplication) companion2.getExtras((Activity) this)).getTitle(), ((ResumeApplication) companion2.getExtras((Activity) this)).getSubtitle(), ((ResumeApplication) companion2.getExtras((Activity) this)).getDisclosure(), ((ResumeApplication) companion2.getExtras((Activity) this)).getChurnedFundingV2Content(), ((ResumeApplication) companion2.getExtras((Activity) this)).getFundingUpsellVariant(), ((ResumeApplication) companion2.getExtras((Activity) this)).getTakeoverLoggingInfo(), ((ResumeApplication) companion2.getExtras((Activity) this)).getFundingUpsellContent(), ((ResumeApplication) companion2.getExtras((Activity) this)).getWelcomeBackBackgroundColor(), ((ResumeApplication) companion2.getExtras((Activity) this)).getWelcomeBackImageSource(), ((ResumeApplication) companion2.getExtras((Activity) this)).getDetailsScreenContent())));
        }
    }

    /* compiled from: ResumeApplicationActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResumeApplicationActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/resumeapplication/ResumeApplicationActivity;", "Lcom/robinhood/android/resumeapplication/ResumeApplication;", "<init>", "()V", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<ResumeApplicationActivity, ResumeApplication> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public ResumeApplication getExtras(ResumeApplicationActivity resumeApplicationActivity) {
            return (ResumeApplication) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, resumeApplicationActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, ResumeApplication resumeApplication) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, resumeApplication);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, ResumeApplication resumeApplication) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, resumeApplication);
        }
    }
}
