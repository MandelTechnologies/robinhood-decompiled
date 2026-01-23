package com.robinhood.android.transfers.p271ui.max.wires;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityIntentKey;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContract2;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContract3;
import com.robinhood.android.transfers.p271ui.max.wires.WireRoutingDetailsInputFragment;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WireRoutingDetailsInputActivity.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "exitFlow", "onWireRoutingDetailsEntered", "routingNumber", "", "accountNumber", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class WireRoutingDetailsInputActivity extends BaseActivity implements WireRoutingDetailsInputFragment.Callbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public WireRoutingDetailsInputActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            WireRoutingDetailsInputFragment.Companion companion = WireRoutingDetailsInputFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new WireRoutingDetailsInputFragment.Args(((WireRoutingDetailsInputActivityIntentKey) companion2.getExtras((Activity) this)).getTransferAccount(), ((WireRoutingDetailsInputActivityIntentKey) companion2.getExtras((Activity) this)).getWiresContext(), ((WireRoutingDetailsInputActivityIntentKey) companion2.getExtras((Activity) this)).getNeedNewAccountResult())));
        }
    }

    @Override // com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment.Callbacks
    public void exitFlow() {
        finish();
    }

    @Override // com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputFragment.Callbacks
    public void onWireRoutingDetailsEntered(String routingNumber, String accountNumber) {
        Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        TransferAccount transferAccount = ((WireRoutingDetailsInputActivityIntentKey) INSTANCE.getExtras((Activity) this)).getTransferAccount();
        if (transferAccount != null) {
            setResult(-1, new Intent().putExtra(WireRoutingDetailsInputActivityResultContract2.EXTRA_WIRE_ROUTING_NUMBER_INPUT_RESULT, new WireRoutingDetailsInputActivityResultContract3.Success(transferAccount, routingNumber, accountNumber)));
            finish();
        }
    }

    /* compiled from: WireRoutingDetailsInputActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputActivity;", "Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputActivityIntentKey;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<WireRoutingDetailsInputActivity, WireRoutingDetailsInputActivityIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public WireRoutingDetailsInputActivityIntentKey getExtras(WireRoutingDetailsInputActivity wireRoutingDetailsInputActivity) {
            return (WireRoutingDetailsInputActivityIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, wireRoutingDetailsInputActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, WireRoutingDetailsInputActivityIntentKey wireRoutingDetailsInputActivityIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, wireRoutingDetailsInputActivityIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, WireRoutingDetailsInputActivityIntentKey wireRoutingDetailsInputActivityIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, wireRoutingDetailsInputActivityIntentKey);
        }
    }
}
