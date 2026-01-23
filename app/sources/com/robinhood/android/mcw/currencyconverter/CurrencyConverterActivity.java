package com.robinhood.android.mcw.currencyconverter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.mcw.contracts.CurrencyConverterContract;
import com.robinhood.android.mcw.contracts.CurrencyConverterKey;
import com.robinhood.android.mcw.contracts.CurrencyConverterReceiptKey;
import com.robinhood.android.mcw.currencyconverter.CurrencyConverterFragment;
import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterEvent;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.regiongate.McwRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyConverterActivity.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\u000eH\u0096\u0001R\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onConversionComplete", "event", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterEvent$ConversionCompleted;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-mcw-currency-converter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CurrencyConverterActivity extends BaseActivity implements RegionGated, CurrencyConverterFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public CurrencyConverterActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(McwRegionGate.INSTANCE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            replaceFragmentWithoutBackStack(CurrencyConverterFragment.INSTANCE.newInstance(INSTANCE.getExtras((Activity) this)));
        }
    }

    @Override // com.robinhood.android.mcw.currencyconverter.CurrencyConverterFragment.Callbacks
    public void onConversionComplete(CurrencyConverterEvent.ConversionCompleted event) {
        Intrinsics.checkNotNullParameter(event, "event");
        NavigationActivityResultContract3.setResult(this, new CurrencyConverterContract.Result.Completed(event.getToBalance()));
        if (((CurrencyConverterKey) INSTANCE.getExtras((Activity) this)).getSkipReceiptScreen()) {
            finish();
        } else {
            replaceFragmentWithoutBackStack(Navigator.DefaultImpls.createFragment$default(getNavigator(), new CurrencyConverterReceiptKey(event.getAccountNumber(), event.getFrom().getCurrency(), event.getTo().getCurrency(), event.getOrderId(), event.getSource()), null, 2, null));
        }
    }

    /* compiled from: CurrencyConverterActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterActivity;", "Lcom/robinhood/android/mcw/contracts/CurrencyConverterKey;", "<init>", "()V", "feature-mcw-currency-converter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<CurrencyConverterActivity, CurrencyConverterKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public CurrencyConverterKey getExtras(CurrencyConverterActivity currencyConverterActivity) {
            return (CurrencyConverterKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, currencyConverterActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CurrencyConverterKey currencyConverterKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, currencyConverterKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, CurrencyConverterKey currencyConverterKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, currencyConverterKey);
        }
    }
}
