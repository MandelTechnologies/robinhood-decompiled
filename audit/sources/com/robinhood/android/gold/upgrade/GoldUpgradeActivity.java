package com.robinhood.android.gold.upgrade;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.gold.contracts.GoldUpgradeFragmentKey2;
import com.robinhood.android.gold.contracts.GoldUpgradeIntentKey;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: GoldUpgradeActivity.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/GoldUpgradeActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "shouldPromptForLockscreen", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldUpgradeActivity extends BaseActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public GoldUpgradeActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return !((GoldUpgradeIntentKey) INSTANCE.getExtras((Activity) this)).isFromOnboarding();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, GoldUpgradeEntrypointFragment.INSTANCE.newInstance((Parcelable) GoldUpgradeFragmentKey2.toFragmentKey((GoldUpgradeIntentKey) INSTANCE.getExtras((Activity) this))));
        }
    }

    /* compiled from: GoldUpgradeActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/GoldUpgradeActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/gold/upgrade/GoldUpgradeActivity;", "Lcom/robinhood/android/gold/contracts/GoldUpgradeIntentKey;", "<init>", "()V", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<GoldUpgradeActivity, GoldUpgradeIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public GoldUpgradeIntentKey getExtras(GoldUpgradeActivity goldUpgradeActivity) {
            return (GoldUpgradeIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, goldUpgradeActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, GoldUpgradeIntentKey goldUpgradeIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, goldUpgradeIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, GoldUpgradeIntentKey goldUpgradeIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, goldUpgradeIntentKey);
        }
    }
}
