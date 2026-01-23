package com.robinhood.shared.trade.crypto.p397ui.fee.feeTier;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.CryptoUsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey2;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey3;
import com.robinhood.shared.crypto.contracts.CryptoFeeTierIntentKey;
import com.robinhood.shared.trade.crypto.p397ui.fee.CryptoFeesMicrogramConstants;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: CryptoFeeTierActivity.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\rH\u0096\u0001R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/feeTier/CryptoFeeTierActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoFeeTierActivity extends BaseActivity implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoFeeTierActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CryptoFeeTierIntentKey.PromoExplainer.values().length];
            try {
                iArr[CryptoFeeTierIntentKey.PromoExplainer.DEPOSIT_INCENTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoFeeTierIntentKey.PromoExplainer.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoFeeTierIntentKey.LaunchType.values().length];
            try {
                iArr2[CryptoFeeTierIntentKey.LaunchType.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CryptoFeeTierIntentKey.LaunchType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public CryptoFeeTierActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(CryptoUsRegionGate.INSTANCE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String str;
        MicrogramRouterFragmentKey3 microgramRouterFragmentKey3;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Companion companion = INSTANCE;
            CryptoFeeTierIntentKey.LaunchType launchType = ((CryptoFeeTierIntentKey) companion.getExtras((Activity) this)).getLaunchType();
            CryptoFeeTierIntentKey.PromoExplainer promoExplainer = ((CryptoFeeTierIntentKey) companion.getExtras((Activity) this)).getPromoExplainer();
            int i = promoExplainer == null ? -1 : WhenMappings.$EnumSwitchMapping$0[promoExplainer.ordinal()];
            if (i == -1) {
                str = "fee_tier";
            } else if (i == 1) {
                str = "deposit_incentive_info";
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "fee_tier";
            }
            Navigator navigator = getNavigator();
            RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication(CryptoFeesMicrogramConstants.CryptoFeesMicrogramName, CryptoFeesMicrogramConstants.getVolumeTierMinMicrogramVersion());
            int i2 = WhenMappings.$EnumSwitchMapping$1[launchType.ordinal()];
            if (i2 == 1) {
                microgramRouterFragmentKey3 = MicrogramRouterFragmentKey3.BACK;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                microgramRouterFragmentKey3 = MicrogramRouterFragmentKey3.CLOSE;
            }
            MicrogramRouterFragmentKey3 microgramRouterFragmentKey32 = microgramRouterFragmentKey3;
            setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(navigator, new MicrogramRouterFragmentKey(remoteMicrogramApplication, "robinhood://app-crypto-fees?context=" + str + "&launch_type=" + launchType.getServerValue(), null, MicrogramRouterFragmentKey2.BOXES, microgramRouterFragmentKey32, 4, null), null, 2, null));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        hideToolbar();
    }

    /* compiled from: CryptoFeeTierActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/fee/feeTier/CryptoFeeTierActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/fee/feeTier/CryptoFeeTierActivity;", "Lcom/robinhood/shared/crypto/contracts/CryptoFeeTierIntentKey;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<CryptoFeeTierActivity, CryptoFeeTierIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public CryptoFeeTierIntentKey getExtras(CryptoFeeTierActivity cryptoFeeTierActivity) {
            return (CryptoFeeTierIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, cryptoFeeTierActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CryptoFeeTierIntentKey cryptoFeeTierIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, cryptoFeeTierIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, CryptoFeeTierIntentKey cryptoFeeTierIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, cryptoFeeTierIntentKey);
        }
    }
}
