package com.robinhood.android.generic.p149ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.utils.extensions.Activity;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericDialogFragmentHostActivity.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/generic/ui/GenericDialogFragmentHostActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/BaseDialogFragment$OnDismissListener;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment$OnDismissListener;", "<init>", "()V", "dialogFragmentKey", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "getDialogFragmentKey", "()Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "dialogFragmentKey$delegate", "Lkotlin/Lazy;", "excludeFromAnalyticsLogging", "", "getExcludeFromAnalyticsLogging", "()Z", "requiresAuthentication", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "onBottomSheetDismissed", "Companion", "feature-fragment-and-activity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GenericDialogFragmentHostActivity extends BaseActivity implements BaseDialogFragment.OnDismissListener, BaseBottomSheetDialogFragment.OnDismissListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_DIALOG_FRAGMENT_KEY = "extraDialogFragmentKey";

    /* renamed from: dialogFragmentKey$delegate, reason: from kotlin metadata */
    private final Lazy dialogFragmentKey;
    private final boolean excludeFromAnalyticsLogging;

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return false;
    }

    public GenericDialogFragmentHostActivity() {
        super(C17711R.layout.fragment_dialog_fragment_host);
        this.dialogFragmentKey = Activity.intentExtra(this, EXTRA_DIALOG_FRAGMENT_KEY);
        this.excludeFromAnalyticsLogging = true;
    }

    private final DialogFragmentKey getDialogFragmentKey() {
        return (DialogFragmentKey) this.dialogFragmentKey.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        initEdgeToEdge(false);
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), getDialogFragmentKey(), null, 2, null).show(getSupportFragmentManager(), "generic-dialog-host-dialog");
        }
    }

    @Override // com.robinhood.android.common.ui.BaseDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        finish();
    }

    @Override // com.robinhood.android.common.ui.BaseBottomSheetDialogFragment.OnDismissListener
    public void onBottomSheetDismissed(int id) {
        finish();
    }

    /* compiled from: GenericDialogFragmentHostActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/generic/ui/GenericDialogFragmentHostActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/keys/HostIntentKey$DialogFragmentHost;", "<init>", "()V", "EXTRA_DIALOG_FRAGMENT_KEY", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-fragment-and-activity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<HostIntentKey.DialogFragmentHost<?>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, HostIntentKey.DialogFragmentHost<?> key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) GenericDialogFragmentHostActivity.class);
            intent.putExtra(GenericDialogFragmentHostActivity.EXTRA_DIALOG_FRAGMENT_KEY, key.getDialogFragmentKey());
            return intent;
        }
    }
}
