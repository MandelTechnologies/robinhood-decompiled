package com.robinhood.android.isa.isatransferfunds;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.isa.contracts.IsaTransferFundsKey;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.StocksAndSharesIsaRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.idl.RhDeeplinkSupportedUri;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import deeplinks.isa.p450v1.IsaTransferFundsDeeplinkDto;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: IsaTransferFundsActivity.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\t\u0010\f\u001a\u00020\rH\u0096\u0001R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/isa/isatransferfunds/IsaTransferFundsActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "buildDeeplink", "", "accountNumber", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-isa-transfer-funds_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IsaTransferFundsActivity extends BaseActivity implements RegionGated {
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

    public IsaTransferFundsActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(StocksAndSharesIsaRegionGate.INSTANCE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String string2;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            Navigator navigator = getNavigator();
            RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication("app-isa-transfer-funds", null, 2, null);
            IsaTransferFundsKey isaTransferFundsKey = (IsaTransferFundsKey) INSTANCE.getExtras((Activity) this);
            if (isaTransferFundsKey instanceof IsaTransferFundsKey.Direct) {
                string2 = buildDeeplink(((IsaTransferFundsKey.Direct) isaTransferFundsKey).getAccountNumber());
            } else {
                if (!(isaTransferFundsKey instanceof IsaTransferFundsKey.Deeplink)) {
                    throw new NoWhenBranchMatchedException();
                }
                string2 = ((IsaTransferFundsKey.Deeplink) isaTransferFundsKey).getUri().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            }
            setFragment(i, Navigator.DefaultImpls.createFragment$default(navigator, new MicrogramRouterFragmentKey(remoteMicrogramApplication, string2, null, null, null, 28, null), null, 2, null));
        }
    }

    private final String buildDeeplink(String accountNumber) {
        return RhDeeplinkSupportedUri.ROBINHOOD.getUri() + IsaTransferFundsDeeplinkDto.INSTANCE.getDeeplinkRoute() + "?accountNumber=" + accountNumber;
    }

    /* compiled from: IsaTransferFundsActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/isa/isatransferfunds/IsaTransferFundsActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/isa/isatransferfunds/IsaTransferFundsActivity;", "Lcom/robinhood/android/isa/contracts/IsaTransferFundsKey;", "<init>", "()V", "feature-isa-transfer-funds_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<IsaTransferFundsActivity, IsaTransferFundsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public IsaTransferFundsKey getExtras(IsaTransferFundsActivity isaTransferFundsActivity) {
            return (IsaTransferFundsKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, isaTransferFundsActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, IsaTransferFundsKey isaTransferFundsKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, isaTransferFundsKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, IsaTransferFundsKey isaTransferFundsKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, isaTransferFundsKey);
        }
    }
}
