package com.robinhood.android.transfers.p271ui.max.posttransfer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.gold.GoldPostUpgradeCelebrationFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.TransferSuccessCallbacks;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow3;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.transfers.contracts.TransferSuccessIntentKey;
import com.robinhood.shared.transfers.contracts.TransferSuccessKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferSuccessActivity.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/posttransfer/TransferSuccessActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/transfers/contracts/TransferSuccessCallbacks;", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationFragment$Callbacks;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onTransferConfirmationComplete", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "onGoldUpgradeCelebrationAction", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TransferSuccessActivity extends BaseActivity implements TransferSuccessCallbacks, GoldPostUpgradeCelebrationFragment.Callbacks {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public TransferSuccessActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager2.getScarletManager(this).putOverlay(AchromaticOverlay.INSTANCE, Boolean.FALSE);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            Navigator navigator = getNavigator();
            Companion companion = INSTANCE;
            setFragment(i, Navigator.DefaultImpls.createFragment$default(navigator, new TransferSuccessKey(((TransferSuccessIntentKey) companion.getExtras((Activity) this)).getPostTransferFlow(), ((TransferSuccessIntentKey) companion.getExtras((Activity) this)).getEntryPoint()), null, 2, null));
        }
    }

    @Override // com.robinhood.android.transfers.contracts.TransferSuccessCallbacks
    public void onTransferConfirmationComplete(PostTransferFlow postTransferFlow) {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        PostTransferFlow3 postTransferPagesAction = postTransferFlow.getPostTransferPagesAction();
        if (postTransferPagesAction != null && (postTransferPagesAction instanceof PostTransferFlow3.HandleDeeplink)) {
            Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, Uri.parse(((PostTransferFlow3.HandleDeeplink) postTransferPagesAction).getDeeplink()), null, null, false, null, 60, null);
        }
        finish();
    }

    @Override // com.robinhood.android.common.gold.GoldPostUpgradeCelebrationFragment.Callbacks
    public void onGoldUpgradeCelebrationAction(GenericAction action) {
        if (action instanceof GenericAction.Deeplink) {
            Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
        } else {
            if (!(action instanceof GenericAction.Dismiss) && !(action instanceof GenericAction.InfoAlert) && action != null) {
                throw new NoWhenBranchMatchedException();
            }
            finish();
        }
    }

    /* compiled from: TransferSuccessActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/posttransfer/TransferSuccessActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/ui/max/posttransfer/TransferSuccessActivity;", "Lcom/robinhood/shared/transfers/contracts/TransferSuccessIntentKey;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<TransferSuccessActivity, TransferSuccessIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public TransferSuccessIntentKey getExtras(TransferSuccessActivity transferSuccessActivity) {
            return (TransferSuccessIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, transferSuccessActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, TransferSuccessIntentKey transferSuccessKey2) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, transferSuccessKey2);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, TransferSuccessIntentKey transferSuccessKey2) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, transferSuccessKey2);
        }
    }
}
