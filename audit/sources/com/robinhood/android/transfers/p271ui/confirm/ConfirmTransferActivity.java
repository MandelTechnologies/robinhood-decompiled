package com.robinhood.android.transfers.p271ui.confirm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.history.contracts.DetailType;
import com.robinhood.android.history.contracts.LegacyDetailFragmentKey;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.transfers.contracts.TransferSuccessCallbacks;
import com.robinhood.android.transfers.p271ui.confirm.ConfirmTransferFragment;
import com.robinhood.android.transfers.p271ui.confirm.InstantRestrictionFragment;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.shared.transfers.contracts.TransferSuccessKey;
import com.robinhood.utils.extensions.Activity;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmTransferActivity.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0019B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferFragment$Callbacks;", "Lcom/robinhood/android/transfers/contracts/TransferSuccessCallbacks;", "Lcom/robinhood/android/transfers/ui/confirm/InstantRestrictionFragment$Callbacks;", "<init>", "()V", "transferId", "Ljava/util/UUID;", "getTransferId", "()Ljava/util/UUID;", "transferId$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onTransferConfirmed", "timeline", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$Timeline;", "onTransferConfirmationComplete", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "onTransferDetailRequested", "onInstantRestrictionContinueClicked", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ConfirmTransferActivity extends BaseActivity implements ConfirmTransferFragment.Callbacks, TransferSuccessCallbacks, InstantRestrictionFragment.Callbacks {
    private static final String EXTRA_TRANSFER_ID = "transferId";

    /* renamed from: transferId$delegate, reason: from kotlin metadata */
    private final Lazy transferId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public ConfirmTransferActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.transferId = Activity.intentExtra(this, "transferId");
    }

    private final UUID getTransferId() {
        return (UUID) this.transferId.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, ConfirmTransferFragment.INSTANCE.newInstance((Parcelable) new ConfirmTransferFragment.Args(getTransferId())));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.transfers.ui.confirm.ConfirmTransferFragment.Callbacks
    public void onTransferConfirmed(UiPostTransferPage.Timeline timeline) {
        if (timeline != null) {
            Navigator navigator = getNavigator();
            String string2 = getTransferId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            replaceFragment(Navigator.DefaultImpls.createFragment$default(navigator, new TransferSuccessKey(new PostTransferFlow(string2, CollectionsKt.listOf(timeline), null, null), null, 2, 0 == true ? 1 : 0), null, 2, null));
            return;
        }
        replaceFragment(InstantRestrictionFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.transfers.contracts.TransferSuccessCallbacks
    public void onTransferConfirmationComplete(PostTransferFlow postTransferFlow) {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        replaceFragment(InstantRestrictionFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.transfers.ui.confirm.ConfirmTransferFragment.Callbacks
    public void onTransferDetailRequested(UUID transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        Navigator.DefaultImpls.showFragment$default(getNavigator(), this, LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.ACH_TRANSFER, transferId, null, false, 12, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        finish();
    }

    @Override // com.robinhood.android.transfers.ui.confirm.InstantRestrictionFragment.Callbacks
    public void onInstantRestrictionContinueClicked() {
        finish();
    }

    /* compiled from: ConfirmTransferActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ConfirmTransfer;", "<init>", "()V", "EXTRA_TRANSFER_ID", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.ConfirmTransfer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.ConfirmTransfer key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intentPutExtra = new Intent(context, (Class<?>) ConfirmTransferActivity.class).putExtra("transferId", key.getTransferId());
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }
}
