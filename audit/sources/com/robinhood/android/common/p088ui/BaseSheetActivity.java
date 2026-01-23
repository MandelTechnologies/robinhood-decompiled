package com.robinhood.android.common.p088ui;

import android.os.Bundle;
import androidx.core.content.ContextCompat;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.libdesignsystem.C20690R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseSheetActivity.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0004R\u0014\u0010\u0006\u001a\u00020\u00078TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BaseSheetActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "contentLayoutId", "", "<init>", "(I)V", "finishOnBackPressed", "", "getFinishOnBackPressed", "()Z", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "finishWithExitBottomAnimation", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseSheetActivity extends BaseActivity {
    public static final int $stable = 8;

    protected boolean getFinishOnBackPressed() {
        return true;
    }

    public BaseSheetActivity(int i) {
        super(i);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(C11048R.anim.activity_enter_bottom, 0);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.getToolbar().setNavigationIcon(ContextCompat.getDrawable(this, C20690R.drawable.ic_rds_close_24dp));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (getFinishOnBackPressed()) {
            finishWithExitBottomAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void finishWithExitBottomAnimation() {
        finish();
        overridePendingTransition(0, C11048R.anim.activity_exit_bottom);
    }
}
