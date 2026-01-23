package com.robinhood.shared.crypto.transfer.send.address.allowlisting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolverCompanion;
import com.robinhood.shared.crypto.contracts.transfers.CryptoSavedAddressesListIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CryptoSavedAddressListActivity.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressListActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "excludeFromAnalyticsLogging", "", "getExcludeFromAnalyticsLogging", "()Z", "excludeFromSourceLogging", "getExcludeFromSourceLogging", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoSavedAddressListActivity extends BaseActivity {
    private final boolean excludeFromAnalyticsLogging;
    private final boolean excludeFromSourceLogging;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public CryptoSavedAddressListActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.excludeFromAnalyticsLogging = true;
        this.excludeFromSourceLogging = true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromSourceLogging() {
        return this.excludeFromSourceLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, CryptoSavedAddressesListFragment.INSTANCE.newInstance());
        }
    }

    /* compiled from: CryptoSavedAddressListActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressListActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverCompanion;", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressListActivity;", "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoSavedAddressesListIntentKey;", "<init>", "()V", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverCompanion<CryptoSavedAddressListActivity, CryptoSavedAddressesListIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolverCompanion, com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CryptoSavedAddressesListIntentKey cryptoSavedAddressesListIntentKey) {
            return IntentResolverCompanion.DefaultImpls.getIntent(this, context, cryptoSavedAddressesListIntentKey);
        }
    }
}
