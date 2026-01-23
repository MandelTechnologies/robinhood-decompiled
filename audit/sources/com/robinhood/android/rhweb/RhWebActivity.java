package com.robinhood.android.rhweb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.rhweb.RhWebFragment;
import com.robinhood.security.screenprotect.ScreenProtectFlow;
import com.robinhood.security.screenprotect.ScreenProtectManager;
import com.robinhood.shared.rhweb.contracts.RhWebIntentKey;
import com.robinhood.shared.rhweb.contracts.RhWebIntentKey3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhWebActivity.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/rhweb/RhWebActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/rhweb/RhWebFragment$Callbacks;", "<init>", "()V", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "getScreenProtectManager", "()Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "setScreenProtectManager", "(Lcom/robinhood/security/screenprotect/ScreenProtectManager;)V", "requiresAuthentication", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "dismissWebView", "dismissWebViewAndContinue", "Companion", "feature-rhweb_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhWebActivity extends BaseActivity implements RhWebFragment.Callbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public ScreenProtectManager screenProtectManager;

    public RhWebActivity() {
        super(C27330R.layout.activity_rhweb);
    }

    public final ScreenProtectManager getScreenProtectManager() {
        ScreenProtectManager screenProtectManager = this.screenProtectManager;
        if (screenProtectManager != null) {
            return screenProtectManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screenProtectManager");
        return null;
    }

    public final void setScreenProtectManager(ScreenProtectManager screenProtectManager) {
        Intrinsics.checkNotNullParameter(screenProtectManager, "<set-?>");
        this.screenProtectManager = screenProtectManager;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return ((RhWebIntentKey) INSTANCE.getExtras((Activity) this)).getRequiresAuthentication();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            RhWebFragment.Companion companion = RhWebFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            getSupportFragmentManager().beginTransaction().add(C27330R.id.fragment_container, (RhWebFragment) companion.newInstance((Parcelable) new RhWebFragment.Args(((RhWebIntentKey) companion2.getExtras((Activity) this)).getAllowCameraAccess(), ((RhWebIntentKey) companion2.getExtras((Activity) this)).getAllowFileAccess(), ((RhWebIntentKey) companion2.getExtras((Activity) this)).getAcceptThirdPartyCookies(), ((RhWebIntentKey) companion2.getExtras((Activity) this)).getHideToolbar(), ((RhWebIntentKey) companion2.getExtras((Activity) this)).getOpenNewWindowInSystem(), ((RhWebIntentKey) companion2.getExtras((Activity) this)).getConvertToRhWebLink(), ((RhWebIntentKey) companion2.getExtras((Activity) this)).getDestinationUri()))).commit();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        if (((RhWebIntentKey) INSTANCE.getExtras((Activity) this)).getBlockScreenSharing()) {
            ScreenProtectManager screenProtectManager = getScreenProtectManager();
            screenProtectManager.blockScreenSharing(this, ScreenProtectFlow.WEB_VIEW);
            screenProtectManager.setFlagSecure(this);
        }
    }

    @Override // com.robinhood.android.rhweb.RhWebFragment.Callbacks
    public void dismissWebView() {
        NavigationActivityResultContract3.setResult(this, RhWebIntentKey3.Dismissed.INSTANCE);
    }

    @Override // com.robinhood.android.rhweb.RhWebFragment.Callbacks
    public void dismissWebViewAndContinue() {
        NavigationActivityResultContract3.setResult(this, RhWebIntentKey3.Continue.INSTANCE);
    }

    /* compiled from: RhWebActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhweb/RhWebActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/rhweb/RhWebActivity;", "Lcom/robinhood/shared/rhweb/contracts/RhWebIntentKey;", "<init>", "()V", "feature-rhweb_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<RhWebActivity, RhWebIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public RhWebIntentKey getExtras(RhWebActivity rhWebActivity) {
            return (RhWebIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, rhWebActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, RhWebIntentKey rhWebIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, rhWebIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, RhWebIntentKey rhWebIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, rhWebIntentKey);
        }
    }
}
