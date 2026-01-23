package com.stripe.android.view;

import android.os.Bundle;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import androidx.view.ComponentActivity;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthActivityStarterHost.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J+\u0010\t\u001a\u00020\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m3636d2 = {"Lcom/stripe/android/view/AuthActivityStarterHost;", "", "Ljava/lang/Class;", "target", "Landroid/os/Bundle;", "extras", "", "requestCode", "", "startActivityForResult", "(Ljava/lang/Class;Landroid/os/Bundle;I)V", "getStatusBarColor", "()Ljava/lang/Integer;", "statusBarColor", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface AuthActivityStarterHost {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    LifecycleOwner getLifecycleOwner();

    Integer getStatusBarColor();

    void startActivityForResult(Class<?> target, Bundle extras, int requestCode);

    /* compiled from: AuthActivityStarterHost.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/view/AuthActivityStarterHost$Companion;", "", "<init>", "()V", "Landroidx/activity/ComponentActivity;", "activity", "", "statusBarColor", "Lcom/stripe/android/view/AuthActivityStarterHost;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Landroidx/activity/ComponentActivity;Ljava/lang/Integer;)Lcom/stripe/android/view/AuthActivityStarterHost;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ AuthActivityStarterHost create$default(Companion companion, ComponentActivity componentActivity, Integer num, int i, Object obj) {
            if ((i & 2) != 0) {
                Window window = componentActivity.getWindow();
                num = window != null ? Integer.valueOf(window.getStatusBarColor()) : null;
            }
            return companion.create(componentActivity, num);
        }

        public final /* synthetic */ AuthActivityStarterHost create(ComponentActivity activity, Integer statusBarColor) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new AuthActivityStarterHost2(activity, statusBarColor);
        }
    }
}
