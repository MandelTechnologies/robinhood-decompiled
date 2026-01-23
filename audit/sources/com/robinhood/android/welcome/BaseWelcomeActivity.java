package com.robinhood.android.welcome;

import android.os.Bundle;
import com.airbnb.lottie.LottieCompositionFactory;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import kotlin.Metadata;

/* compiled from: BaseWelcomeActivity.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0004J\b\u0010\u000e\u001a\u00020\nH\u0014¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/welcome/BaseWelcomeActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "contentLayoutId", "", "(I)V", "requiresAuthentication", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "preloadAnimation", "onDestroy", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public class BaseWelcomeActivity extends BaseActivity {
    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public final boolean requiresAuthentication() {
        return false;
    }

    public BaseWelcomeActivity() {
    }

    public BaseWelcomeActivity(int i) {
        super(i);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().getDecorView().setSystemUiVisibility(1280);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), WelcomeOverlay.INSTANCE, null, 2, null);
        super.onCreate(savedInstanceState);
        LottieCompositionFactory.setMaxCacheSize(5);
    }

    protected final void preloadAnimation() {
        LottieCompositionFactory.fromRawRes(this, C31456R.raw.max_welcome_lottie);
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        LottieCompositionFactory.clearCache(this);
        super.onDestroy();
    }
}
