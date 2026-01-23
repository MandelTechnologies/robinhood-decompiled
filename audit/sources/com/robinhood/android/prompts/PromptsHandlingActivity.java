package com.robinhood.android.prompts;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.prompts.PromptsHandlingFragment;
import com.robinhood.shared.security.contracts.PromptsHandlingInfo;
import com.robinhood.shared.security.contracts.PromptsHandlingIntentKey;
import com.robinhood.shared.security.prompts.ExcludedFromPromptsFetching;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PromptsHandlingActivity.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/prompts/PromptsHandlingActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/shared/security/prompts/ExcludedFromPromptsFetching;", "Lcom/robinhood/android/prompts/PromptsHandlingFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showNextChallenge", "handlingInfo", "Lcom/robinhood/shared/security/contracts/PromptsHandlingInfo;", "Companion", "feature-prompts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PromptsHandlingActivity extends BaseActivity implements ExcludedFromPromptsFetching, PromptsHandlingFragment.Callbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public PromptsHandlingActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, PromptsHandlingFragment.INSTANCE.newInstance((Parcelable) ((PromptsHandlingIntentKey) INSTANCE.getExtras((Activity) this)).getInfo()));
        }
    }

    @Override // com.robinhood.android.prompts.PromptsHandlingFragment.Callbacks
    public void showNextChallenge(PromptsHandlingInfo handlingInfo) {
        Intrinsics.checkNotNullParameter(handlingInfo, "handlingInfo");
        replaceFragmentWithoutBackStack(PromptsHandlingFragment.INSTANCE.newInstance((Parcelable) handlingInfo));
    }

    /* compiled from: PromptsHandlingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/prompts/PromptsHandlingActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/prompts/PromptsHandlingActivity;", "Lcom/robinhood/shared/security/contracts/PromptsHandlingIntentKey;", "<init>", "()V", "feature-prompts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<PromptsHandlingActivity, PromptsHandlingIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public PromptsHandlingIntentKey getExtras(PromptsHandlingActivity promptsHandlingActivity) {
            return (PromptsHandlingIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, promptsHandlingActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, PromptsHandlingIntentKey promptsHandlingIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, promptsHandlingIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, PromptsHandlingIntentKey promptsHandlingIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, promptsHandlingIntentKey);
        }
    }
}
