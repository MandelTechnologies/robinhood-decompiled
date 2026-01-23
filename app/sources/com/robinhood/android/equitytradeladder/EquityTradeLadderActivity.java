package com.robinhood.android.equitytradeladder;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.equities.contracts.tradeladder.EquityTradeLadderFragmentKey;
import com.robinhood.android.equities.contracts.tradeladder.TradeLadderContract;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityTradeLadderActivity.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "onNewIntent", "", "intent", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityTradeLadderActivity extends BaseActivity {
    private static final String TAG_LADDER_FRAGMENT = "equityLadderFragment";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public EquityTradeLadderActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Bundle extras = intent.getExtras();
        Object obj = extras != null ? extras.get("ActivityCompanion_Extras") : null;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.robinhood.android.equities.contracts.tradeladder.TradeLadderContract");
        TradeLadderContract tradeLadderContract = (TradeLadderContract) obj;
        getSupportFragmentManager().beginTransaction().replace(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), new EquityTradeLadderFragmentKey(tradeLadderContract.getInstrumentId(), tradeLadderContract.getSource(), null, tradeLadderContract.getSkipNux(), 4, null), null, 2, null), TAG_LADDER_FRAGMENT).commitAllowingStateLoss();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            TradeLadderContract tradeLadderContract = (TradeLadderContract) INSTANCE.getExtras((Activity) this);
            getSupportFragmentManager().beginTransaction().add(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), new EquityTradeLadderFragmentKey(tradeLadderContract.getInstrumentId(), tradeLadderContract.getSource(), null, tradeLadderContract.getSkipNux(), 4, null), null, 2, null), TAG_LADDER_FRAGMENT).commitAllowingStateLoss();
        }
    }

    /* compiled from: EquityTradeLadderActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderActivity;", "Lcom/robinhood/android/equities/contracts/tradeladder/TradeLadderContract;", "<init>", "()V", "TAG_LADDER_FRAGMENT", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<EquityTradeLadderActivity, TradeLadderContract> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public TradeLadderContract getExtras(EquityTradeLadderActivity equityTradeLadderActivity) {
            return (TradeLadderContract) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, equityTradeLadderActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, TradeLadderContract tradeLadderContract) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, tradeLadderContract);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, TradeLadderContract tradeLadderContract) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, tradeLadderContract);
        }
    }
}
