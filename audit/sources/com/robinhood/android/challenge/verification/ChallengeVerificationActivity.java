package com.robinhood.android.challenge.verification;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.challenge.ChallengeVerificationCallbacks;
import com.robinhood.android.challenge.verification.prompts.PromptsVerificationFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.models.api.Challenge;
import com.robinhood.shared.lib.challenge.ChallengeVerificationResult;
import com.robinhood.shared.security.contracts.ChallengeVerificationInput;
import com.robinhood.shared.security.contracts.ChallengeVerificationIntentKey;
import com.robinhood.utils.buildconfig.BuildFlavors;
import com.robinhood.utils.extensions.Activity;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeVerificationActivity.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/challenge/ChallengeVerificationCallbacks;", "<init>", "()V", "initInput", "Lcom/robinhood/shared/security/contracts/ChallengeVerificationInput;", "getInitInput", "()Lcom/robinhood/shared/security/contracts/ChallengeVerificationInput;", "initInput$delegate", "Lkotlin/Lazy;", "requiresAuthentication", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onChallengeCompleted", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "onChallengeFailed", "onResendChallenge", "onUseFallbackMfa", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeVerificationActivity extends BaseActivity implements ChallengeVerificationCallbacks {
    private static final String EXTRA_VERIFICATION_CHALLENGE_INPUT = "extraVerificationChallengeInput";

    /* renamed from: initInput$delegate, reason: from kotlin metadata */
    private final Lazy initInput;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public ChallengeVerificationActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.initInput = Activity.intentExtra(this, EXTRA_VERIFICATION_CHALLENGE_INPUT);
    }

    private final ChallengeVerificationInput getInitInput() {
        return (ChallengeVerificationInput) this.initInput.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return getAuthManagerDoNotUse().isLoggedIn();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showCloseIcon();
        if (!BuildFlavors.INSTANCE.isDebugOrInternal()) {
            getWindow().setFlags(8192, 8192);
        }
        if (savedInstanceState == null) {
            Challenge challenge = getInitInput().getChallenge();
            if ((challenge != null ? challenge.getType() : null) == Challenge.Type.PROMPTS) {
                setFragment(C11048R.id.fragment_container, PromptsVerificationFragment.INSTANCE.newInstance((Parcelable) getInitInput()));
            } else {
                setFragment(C11048R.id.fragment_container, ChallengeVerificationFragment.INSTANCE.newInstance((Parcelable) getInitInput()));
            }
        }
    }

    @Override // com.robinhood.android.challenge.ChallengeVerificationCallbacks
    public void onChallengeCompleted(UUID challengeId) {
        NavigationActivityResultContract3.finishWithResult$default(this, new ChallengeVerificationResult.Completed(challengeId), 0, 2, null);
    }

    @Override // com.robinhood.android.challenge.ChallengeVerificationCallbacks
    public void onChallengeFailed() {
        NavigationActivityResultContract3.finishWithResult$default(this, ChallengeVerificationResult.Failed.INSTANCE, 0, 2, null);
    }

    @Override // com.robinhood.android.challenge.ChallengeVerificationCallbacks
    public void onResendChallenge() {
        NavigationActivityResultContract3.finishWithResult$default(this, ChallengeVerificationResult.Resend.INSTANCE, 0, 2, null);
    }

    @Override // com.robinhood.android.challenge.ChallengeVerificationCallbacks
    public void onUseFallbackMfa(UUID challengeId) {
        if (Intrinsics.areEqual(getInitInput().getFlowId(), Challenge.Flow.LOGIN.getId()) || getInitInput().getFallbackCtaText() != null) {
            NavigationActivityResultContract3.finishWithResult$default(this, new ChallengeVerificationResult.Fallback(challengeId), 0, 2, null);
        } else {
            replaceFragmentWithoutBackStack(ChallengeVerificationFragment.INSTANCE.newInstance((Parcelable) getInitInput()));
        }
    }

    /* compiled from: ChallengeVerificationActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/shared/security/contracts/ChallengeVerificationIntentKey;", "<init>", "()V", "EXTRA_VERIFICATION_CHALLENGE_INPUT", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<ChallengeVerificationIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, ChallengeVerificationIntentKey key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) ChallengeVerificationActivity.class);
            intent.putExtra(ChallengeVerificationActivity.EXTRA_VERIFICATION_CHALLENGE_INPUT, key.getInput());
            return intent;
        }
    }
}
