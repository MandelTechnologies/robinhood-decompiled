package com.robinhood.android.trade.directipo.p260ui.limittype;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.trade.directipo.p260ui.limittype.DirectIpoOrderLimitTypeExplanationFragment;
import com.robinhood.android.trade.directipo.p260ui.limittype.DirectIpoOrderLimitTypeExplanationLoadingFragment;
import com.robinhood.directipo.models.api.ApiDirectIpoLimitTypeExplanation;
import com.robinhood.utils.extensions.Activity;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOrderLimitTypeExplanationActivity.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001$B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\t\u0010\u001d\u001a\u00020\u001eH\u0096\u0001R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/limittype/DirectIpoOrderLimitTypeExplanationActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/trade/directipo/ui/limittype/DirectIpoOrderLimitTypeExplanationLoadingFragment$Callbacks;", "Lcom/robinhood/android/trade/directipo/ui/limittype/DirectIpoOrderLimitTypeExplanationFragment$Callbacks;", "<init>", "()V", "instrumentId", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "instrumentId$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "onDialogDismissed", "id", "", "onLoadLimitTypeExplanationSuccess", "limitTypeExplanation", "Lcom/robinhood/directipo/models/api/ApiDirectIpoLimitTypeExplanation;", "onLoadLimitTypeExplanationFailure", "throwable", "", "onDismissLimitTypeExplanation", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class DirectIpoOrderLimitTypeExplanationActivity extends BaseActivity implements RegionGated, RhDialogFragment.OnDismissListener, DirectIpoOrderLimitTypeExplanationLoadingFragment.Callbacks, DirectIpoOrderLimitTypeExplanationFragment.Callbacks {
    private static final String EXTRA_INSTRUMENT_ID = "instrumentId";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: instrumentId$delegate, reason: from kotlin metadata */
    private final Lazy instrumentId;

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

    public DirectIpoOrderLimitTypeExplanationActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.instrumentId = Activity.intentExtra(this, "instrumentId");
    }

    private final UUID getInstrumentId() {
        return (UUID) this.instrumentId.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, DirectIpoOrderLimitTypeExplanationLoadingFragment.INSTANCE.newInstance((Parcelable) new DirectIpoOrderLimitTypeExplanationLoadingFragment.Args(getInstrumentId())));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getCurrentFragment() instanceof DirectIpoOrderLimitTypeExplanationFragment) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            finish();
        }
    }

    @Override // com.robinhood.android.trade.directipo.ui.limittype.DirectIpoOrderLimitTypeExplanationLoadingFragment.Callbacks
    public void onLoadLimitTypeExplanationSuccess(ApiDirectIpoLimitTypeExplanation limitTypeExplanation) {
        Intrinsics.checkNotNullParameter(limitTypeExplanation, "limitTypeExplanation");
        replaceFragmentWithoutAnimation(DirectIpoOrderLimitTypeExplanationFragment.INSTANCE.newInstance((Parcelable) limitTypeExplanation));
    }

    @Override // com.robinhood.android.trade.directipo.ui.limittype.DirectIpoOrderLimitTypeExplanationLoadingFragment.Callbacks
    public void onLoadLimitTypeExplanationFailure(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, this, throwable, true, false, 0, null, 56, null);
    }

    @Override // com.robinhood.android.trade.directipo.ui.limittype.DirectIpoOrderLimitTypeExplanationFragment.Callbacks
    public void onDismissLimitTypeExplanation() {
        finish();
    }

    /* compiled from: DirectIpoOrderLimitTypeExplanationActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/ui/limittype/DirectIpoOrderLimitTypeExplanationActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoLimitTypeExplanation;", "<init>", "()V", "EXTRA_INSTRUMENT_ID", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.DirectIpoLimitTypeExplanation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.DirectIpoLimitTypeExplanation key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) DirectIpoOrderLimitTypeExplanationActivity.class);
            intent.putExtra("instrumentId", key.getInstrumentId());
            return intent;
        }
    }
}
