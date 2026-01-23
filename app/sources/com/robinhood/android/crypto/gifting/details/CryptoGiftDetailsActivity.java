package com.robinhood.android.crypto.gifting.details;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.crypto.gifting.C12906R;
import com.robinhood.android.crypto.gifting.details.loading.CryptoGiftDetailsLoadingFragment;
import com.robinhood.android.cryptogifting.contracts.CryptoGifting;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.models.p355ui.bonfire.cryptogifting.CryptoGiftDetails;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoGiftDetailsActivity.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\t\u0010\u0012\u001a\u00020\u0007H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/crypto/gifting/details/loading/CryptoGiftDetailsLoadingFragment$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "allowLandscapeMode", "", "getAllowLandscapeMode", "()Z", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCryptoGiftDetailsLoaded", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/models/ui/bonfire/cryptogifting/CryptoGiftDetails;", "onBackPressed", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-crypto-gifting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoGiftDetailsActivity extends BaseActivity implements CryptoGiftDetailsLoadingFragment.Callbacks, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final boolean allowLandscapeMode;

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

    public CryptoGiftDetailsActivity() {
        super(C12906R.layout.activity_crypto_gifting);
        this.$$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    protected boolean getAllowLandscapeMode() {
        return this.allowLandscapeMode;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C12906R.id.fragment_container, CryptoGiftDetailsLoadingFragment.INSTANCE.newInstance((Parcelable) new CryptoGiftDetailsLoadingFragment.Args(((CryptoGifting.CryptoGiftDetails) INSTANCE.getExtras((Activity) this)).getGiftId())));
        }
    }

    @Override // com.robinhood.android.crypto.gifting.details.loading.CryptoGiftDetailsLoadingFragment.Callbacks
    public void onCryptoGiftDetailsLoaded(CryptoGiftDetails info) {
        Intrinsics.checkNotNullParameter(info, "info");
        replaceFragment(CryptoGiftDetailsFragment.INSTANCE.newInstance((Parcelable) info));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    /* compiled from: CryptoGiftDetailsActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsActivity;", "Lcom/robinhood/android/cryptogifting/contracts/CryptoGifting$CryptoGiftDetails;", "<init>", "()V", "feature-crypto-gifting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<CryptoGiftDetailsActivity, CryptoGifting.CryptoGiftDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public CryptoGifting.CryptoGiftDetails getExtras(CryptoGiftDetailsActivity cryptoGiftDetailsActivity) {
            return (CryptoGifting.CryptoGiftDetails) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, cryptoGiftDetailsActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CryptoGifting.CryptoGiftDetails cryptoGiftDetails) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, cryptoGiftDetails);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, CryptoGifting.CryptoGiftDetails cryptoGiftDetails) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, cryptoGiftDetails);
        }
    }
}
