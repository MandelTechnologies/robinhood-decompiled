package com.robinhood.android.referral.onboardingtakeover;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.referral.OnboardingTakeoverIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: OnboardingTakeoverActivity.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "allowLandscapeMode", "", "getAllowLandscapeMode", "()Z", "requiresAuthentication", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OnboardingTakeoverActivity extends BaseActivity {
    private final boolean allowLandscapeMode;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return false;
    }

    public OnboardingTakeoverActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    protected boolean getAllowLandscapeMode() {
        return this.allowLandscapeMode;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        initEdgeToEdge(((OnboardingTakeoverIntentKey) companion.getExtras((Activity) this)).getContent().getTheme() == ColorTheme.DARK);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, OnboardingTakeoverFragment.INSTANCE.newInstance((Parcelable) ((OnboardingTakeoverIntentKey) companion.getExtras((Activity) this)).getContent()));
        }
    }

    /* compiled from: OnboardingTakeoverActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverActivity;", "Lcom/robinhood/referral/OnboardingTakeoverIntentKey;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<OnboardingTakeoverActivity, OnboardingTakeoverIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public OnboardingTakeoverIntentKey getExtras(OnboardingTakeoverActivity onboardingTakeoverActivity) {
            return (OnboardingTakeoverIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, onboardingTakeoverActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, OnboardingTakeoverIntentKey onboardingTakeoverIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, onboardingTakeoverIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, OnboardingTakeoverIntentKey onboardingTakeoverIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, onboardingTakeoverIntentKey);
        }
    }
}
