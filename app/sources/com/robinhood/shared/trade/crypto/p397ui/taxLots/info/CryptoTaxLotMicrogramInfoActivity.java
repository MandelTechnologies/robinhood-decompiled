package com.robinhood.shared.trade.crypto.p397ui.taxLots.info;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.shared.common.contracts.MicrogramRouterFragmentKey;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: CryptoTaxLotMicrogramInfoActivity.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0002\u0013\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\rH\u0096\u0001R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/info/CryptoTaxLotMicrogramInfoActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "CryptoTaxLotMicrogramInfoIntentKey", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoTaxLotMicrogramInfoActivity extends BaseActivity implements RegionGated {
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

    public CryptoTaxLotMicrogramInfoActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), new MicrogramRouterFragmentKey(new RemoteMicrogramApplication("app-crypto-trading-tax-lots", null, 2, null), null, null, null, null, 30, null), null, 2, null));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        hideToolbar();
    }

    /* compiled from: CryptoTaxLotMicrogramInfoActivity.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\u0006HÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/info/CryptoTaxLotMicrogramInfoActivity$CryptoTaxLotMicrogramInfoIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CryptoTaxLotMicrogramInfoIntentKey implements IntentKey, Parcelable {
        public static final int $stable = 0;
        public static final CryptoTaxLotMicrogramInfoIntentKey INSTANCE = new CryptoTaxLotMicrogramInfoIntentKey();
        public static final Parcelable.Creator<CryptoTaxLotMicrogramInfoIntentKey> CREATOR = new Creator();

        /* compiled from: CryptoTaxLotMicrogramInfoActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<CryptoTaxLotMicrogramInfoIntentKey> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CryptoTaxLotMicrogramInfoIntentKey createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CryptoTaxLotMicrogramInfoIntentKey.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CryptoTaxLotMicrogramInfoIntentKey[] newArray(int i) {
                return new CryptoTaxLotMicrogramInfoIntentKey[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CryptoTaxLotMicrogramInfoIntentKey);
        }

        public int hashCode() {
            return 1230750418;
        }

        public String toString() {
            return "CryptoTaxLotMicrogramInfoIntentKey";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private CryptoTaxLotMicrogramInfoIntentKey() {
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return IntentKey.DefaultImpls.getNavigationType(this);
        }
    }

    /* compiled from: CryptoTaxLotMicrogramInfoActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/info/CryptoTaxLotMicrogramInfoActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/info/CryptoTaxLotMicrogramInfoActivity$CryptoTaxLotMicrogramInfoIntentKey;", "<init>", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<CryptoTaxLotMicrogramInfoIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CryptoTaxLotMicrogramInfoIntentKey key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            return new Intent(context, (Class<?>) CryptoTaxLotMicrogramInfoActivity.class);
        }
    }
}
