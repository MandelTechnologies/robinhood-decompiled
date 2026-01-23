package com.robinhood.android.gold.hub.payment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.view.OnBackPressedCallback;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.gold.contracts.GoldSwitchPaymentMethodIntentKey;
import com.robinhood.android.moneymovement.checkoutflow.PaymentPreferenceFragmentKey;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: GoldSwitchPaymentMethodActivity.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/payment/GoldSwitchPaymentMethodActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldSwitchPaymentMethodActivity extends BaseActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public GoldSwitchPaymentMethodActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            Navigator navigator = getNavigator();
            Companion companion = INSTANCE;
            setFragment(i, Navigator.DefaultImpls.createFragment$default(navigator, new PaymentPreferenceFragmentKey(((GoldSwitchPaymentMethodIntentKey) companion.getExtras((Activity) this)).getAutoProceed(), ((GoldSwitchPaymentMethodIntentKey) companion.getExtras((Activity) this)).getIsDeficitImprovement(), ((GoldSwitchPaymentMethodIntentKey) companion.getExtras((Activity) this)).getSelectedAccountId(), ((GoldSwitchPaymentMethodIntentKey) companion.getExtras((Activity) this)).getBackupAccountId()), null, 2, null));
        }
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.robinhood.android.gold.hub.payment.GoldSwitchPaymentMethodActivity.onCreate.1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public void handleOnBackPressed() {
                GoldSwitchPaymentMethodActivity.this.finish();
            }
        });
    }

    /* compiled from: GoldSwitchPaymentMethodActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/payment/GoldSwitchPaymentMethodActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/gold/hub/payment/GoldSwitchPaymentMethodActivity;", "Lcom/robinhood/android/gold/contracts/GoldSwitchPaymentMethodIntentKey;", "<init>", "()V", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<GoldSwitchPaymentMethodActivity, GoldSwitchPaymentMethodIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public GoldSwitchPaymentMethodIntentKey getExtras(GoldSwitchPaymentMethodActivity goldSwitchPaymentMethodActivity) {
            return (GoldSwitchPaymentMethodIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, goldSwitchPaymentMethodActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, GoldSwitchPaymentMethodIntentKey goldSwitchPaymentMethodIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, goldSwitchPaymentMethodIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, GoldSwitchPaymentMethodIntentKey goldSwitchPaymentMethodIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, goldSwitchPaymentMethodIntentKey);
        }
    }
}
