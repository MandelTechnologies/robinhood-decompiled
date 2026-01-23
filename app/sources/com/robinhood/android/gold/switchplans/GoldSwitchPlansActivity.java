package com.robinhood.android.gold.switchplans;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.gold.contracts.GoldSwitchPlansIntentKey;
import com.robinhood.android.gold.switchplans.GoldSwitchPlansConfirmationFragment;
import com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import midas.service.p509v1.SwitchPlansConfirmationContent;

/* compiled from: GoldSwitchPlansActivity.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansSelectFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSwitchPlansSuccess", "confirmationPage", "Lmidas/service/v1/SwitchPlansConfirmationContent;", "Companion", "feature-gold-switch-plans_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldSwitchPlansActivity extends BaseActivity implements GoldSwitchPlansSelectFragment.Callbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public GoldSwitchPlansActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), new GoldSwitchPlansSelectFragmentKey(), null, 2, null));
        }
    }

    @Override // com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectFragment.Callbacks
    public void onSwitchPlansSuccess(SwitchPlansConfirmationContent confirmationPage) {
        if (confirmationPage == null) {
            finish();
        } else {
            replaceFragmentWithoutBackStack(GoldSwitchPlansConfirmationFragment.INSTANCE.newInstance((Parcelable) new GoldSwitchPlansConfirmationFragment.Args(confirmationPage)));
        }
    }

    /* compiled from: GoldSwitchPlansActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansActivity;", "Lcom/robinhood/android/gold/contracts/GoldSwitchPlansIntentKey;", "<init>", "()V", "feature-gold-switch-plans_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<GoldSwitchPlansActivity, GoldSwitchPlansIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public GoldSwitchPlansIntentKey getExtras(GoldSwitchPlansActivity goldSwitchPlansActivity) {
            return (GoldSwitchPlansIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, goldSwitchPlansActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, GoldSwitchPlansIntentKey goldSwitchPlansIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, goldSwitchPlansIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, GoldSwitchPlansIntentKey goldSwitchPlansIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, goldSwitchPlansIntentKey);
        }
    }
}
