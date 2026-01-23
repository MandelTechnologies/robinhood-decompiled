package com.robinhood.android.p273ui.login.app;

import android.content.Context;
import androidx.view.contextaware.OnContextAvailableListener;
import com.robinhood.android.p273ui.BaseLogoutActivity;
import com.robinhood.hammer.android.activity.ActivityComponentManager;
import com.robinhood.hammer.android.activity.ActivityComponentManagerHolder;
import com.robinhood.hammer.core.internal.HammerGeneratedSuperclass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_LogoutActivity.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b1\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/ui/login/app/Hammer_LogoutActivity;", "Lcom/robinhood/android/ui/BaseLogoutActivity;", "Lcom/robinhood/hammer/android/activity/ActivityComponentManagerHolder;", "<init>", "()V", "injected", "", "inject", "", "feature-login_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@HammerGeneratedSuperclass
/* loaded from: classes9.dex */
public abstract class Hammer_LogoutActivity extends BaseLogoutActivity implements ActivityComponentManagerHolder {
    private boolean injected;

    public /* synthetic */ Hammer_LogoutActivity(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Hammer_LogoutActivity() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: com.robinhood.android.ui.login.app.Hammer_LogoutActivity.1
            @Override // androidx.view.contextaware.OnContextAvailableListener
            public final void onContextAvailable(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Hammer_LogoutActivity.this.inject();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void inject() {
        if (this.injected) {
            return;
        }
        Hammer_LogoutActivity2 hammer_LogoutActivity2 = (Hammer_LogoutActivity2) ((ActivityComponentManager) getComponentManager()).get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.ui.login.app.LogoutActivity");
        hammer_LogoutActivity2.inject((LogoutActivity) this);
        this.injected = true;
    }
}
