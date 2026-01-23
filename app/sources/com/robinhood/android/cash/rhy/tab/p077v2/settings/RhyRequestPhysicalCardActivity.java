package com.robinhood.android.cash.rhy.tab.p077v2.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.mcduckling.p084ui.callbacks.CardHelpCallbacks;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.rhymigration.p086ui.callbacks.RhyConfirmAddressCallbacks;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.models.api.mcduckling.CardColor;
import com.robinhood.models.p355ui.identi.ShippingAddress;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyRequestPhysicalCardActivity.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u001bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0001R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhyRequestPhysicalCardActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/rhymigration/ui/callbacks/RhyConfirmAddressCallbacks;", "Lcom/robinhood/android/common/mcduckling/ui/callbacks/CardHelpCallbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onAddressConfirmed", "shippingAddress", "Lcom/robinhood/models/ui/identi/ShippingAddress;", "onAddressError", "error", "", "proceed", "nextFragment", "Lcom/robinhood/android/common/ui/BaseFragment;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RhyRequestPhysicalCardActivity extends BaseActivity implements RegionGated, RhyConfirmAddressCallbacks, CardHelpCallbacks {
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

    public RhyRequestPhysicalCardActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), new LegacyFragmentKey.RhyConfirmAddress(true, false, 2, null), null, 2, null));
        }
    }

    @Override // com.robinhood.android.common.rhymigration.p086ui.callbacks.RhyConfirmAddressCallbacks
    public void onAddressConfirmed(ShippingAddress shippingAddress) {
        replaceFragmentWithoutBackStack(Navigator.DefaultImpls.createFragment$default(getNavigator(), new LegacyFragmentKey.CardReplacementVirtualToPhysicalSubmission(((LegacyIntentKey.RhyRequestPhysicalCard) INSTANCE.getExtras((Activity) this)).getCardId(), CardColor.RHY_GREEN, (shippingAddress == null || shippingAddress.isBilling()) ? null : shippingAddress.getId()), null, 2, null));
    }

    @Override // com.robinhood.android.common.rhymigration.p086ui.callbacks.RhyConfirmAddressCallbacks
    public void onAddressError(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        AbsErrorHandler.handleError$default(getActivityErrorHandler(), error, false, 2, null);
    }

    @Override // com.robinhood.android.common.mcduckling.p084ui.callbacks.CardHelpCallbacks
    public void proceed(BaseFragment nextFragment) {
        Intrinsics.checkNotNullParameter(nextFragment, "nextFragment");
        replaceFragmentWithoutBackStack(nextFragment);
    }

    /* compiled from: RhyRequestPhysicalCardActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhyRequestPhysicalCardActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/cash/rhy/tab/v2/settings/RhyRequestPhysicalCardActivity;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RhyRequestPhysicalCard;", "<init>", "()V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<RhyRequestPhysicalCardActivity, LegacyIntentKey.RhyRequestPhysicalCard> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public LegacyIntentKey.RhyRequestPhysicalCard getExtras(RhyRequestPhysicalCardActivity rhyRequestPhysicalCardActivity) {
            return (LegacyIntentKey.RhyRequestPhysicalCard) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, rhyRequestPhysicalCardActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.RhyRequestPhysicalCard rhyRequestPhysicalCard) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, rhyRequestPhysicalCard);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, LegacyIntentKey.RhyRequestPhysicalCard rhyRequestPhysicalCard) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, rhyRequestPhysicalCard);
        }
    }
}
