package com.robinhood.android.transfers.lib.threedsecure;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.transfers.contracts.ThreeDSecureFragmentKey;
import com.robinhood.android.transfers.contracts.ThreeDSecureIntentKey;
import com.robinhood.android.transfers.contracts.ThreeDSecureNavigationContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ThreeDSecureActivity.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/threedsecure/ThreeDSecureActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/transfers/contracts/ThreeDSecureFragmentKey$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onThreeDSecureCompleted", "onThreeDSecureCanceled", "Companion", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ThreeDSecureActivity extends BaseActivity implements ThreeDSecureFragmentKey.Callbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public ThreeDSecureActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, ThreeDSWebViewFragment2.INSTANCE.createFragment((FragmentKey) new ThreeDSecureFragmentKey(((ThreeDSecureIntentKey) INSTANCE.getExtras((Activity) this)).getRedirectUrl())));
        }
    }

    @Override // com.robinhood.android.transfers.contracts.ThreeDSecureFragmentKey.Callbacks
    public void onThreeDSecureCompleted() {
        NavigationActivityResultContract3.finishWithResult(this, ThreeDSecureNavigationContract.Result.Completed.INSTANCE);
    }

    @Override // com.robinhood.android.transfers.contracts.ThreeDSecureFragmentKey.Callbacks
    public void onThreeDSecureCanceled() {
        NavigationActivityResultContract3.finishWithResult(this, ThreeDSecureNavigationContract.Result.Canceled.INSTANCE);
    }

    /* compiled from: ThreeDSecureActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/lib/threedsecure/ThreeDSecureActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/lib/threedsecure/ThreeDSecureActivity;", "Lcom/robinhood/android/transfers/contracts/ThreeDSecureIntentKey;", "<init>", "()V", "lib-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<ThreeDSecureActivity, ThreeDSecureIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public ThreeDSecureIntentKey getExtras(ThreeDSecureActivity threeDSecureActivity) {
            return (ThreeDSecureIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, threeDSecureActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, ThreeDSecureIntentKey threeDSecureIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, threeDSecureIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, ThreeDSecureIntentKey threeDSecureIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, threeDSecureIntentKey);
        }
    }
}
