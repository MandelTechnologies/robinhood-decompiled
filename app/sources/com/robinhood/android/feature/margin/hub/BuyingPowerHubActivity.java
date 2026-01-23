package com.robinhood.android.feature.margin.hub;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.margin.contracts.BuyingPowerHubFragmentKey;
import com.robinhood.android.margin.contracts.BuyingPowerHubIntentKey;
import com.robinhood.android.margin.contracts.BuyingPowerHubIntentKey2;
import com.robinhood.android.margin.contracts.MarginStatusDetailFragmentKey;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.serverdriven.experimental.api.BuyingPowerHubAction;
import com.robinhood.models.serverdriven.experimental.api.Money;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BuyingPowerHubActivity.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u001a\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/BuyingPowerHubAction;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "setFragment", "screen", "Lcom/robinhood/android/margin/contracts/BuyingPowerHubScreen;", "entryPoint", "", "handle", "", "action", "Companion", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BuyingPowerHubActivity extends BaseActivity implements SduiActionHandler<BuyingPowerHubAction> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    /* compiled from: BuyingPowerHubActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BuyingPowerHubIntentKey2.values().length];
            try {
                iArr[BuyingPowerHubIntentKey2.BUYING_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BuyingPowerHubIntentKey2.MARGIN_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BuyingPowerHubActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Companion companion = INSTANCE;
            setFragment(((BuyingPowerHubIntentKey) companion.getExtras((Activity) this)).getLaunchScreen(), ((BuyingPowerHubIntentKey) companion.getExtras((Activity) this)).getEntryPoint());
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        BuyingPowerHubIntentKey buyingPowerHubIntentKey = null;
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                buyingPowerHubIntentKey = (BuyingPowerHubIntentKey) extras.getParcelable("ActivityCompanion_Extras", BuyingPowerHubIntentKey.class);
            }
        } else {
            Bundle extras2 = intent.getExtras();
            Object obj = extras2 != null ? extras2.get("ActivityCompanion_Extras") : null;
            if (obj instanceof BuyingPowerHubIntentKey) {
                buyingPowerHubIntentKey = (BuyingPowerHubIntentKey) obj;
            }
        }
        if (buyingPowerHubIntentKey == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        setFragment(buyingPowerHubIntentKey.getLaunchScreen(), buyingPowerHubIntentKey.getEntryPoint());
    }

    private final void setFragment(BuyingPowerHubIntentKey2 screen, String entryPoint) {
        GenericComposeFragment genericComposeFragment;
        int i = WhenMappings.$EnumSwitchMapping$0[screen.ordinal()];
        if (i == 1) {
            genericComposeFragment = (GenericComposeFragment) BuyingPowerHubFragment.INSTANCE.newInstance((Parcelable) new BuyingPowerHubFragmentKey(((BuyingPowerHubIntentKey) INSTANCE.getExtras((Activity) this)).getAccountNumber(), entryPoint));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            genericComposeFragment = (GenericComposeFragment) MarginStatusDetailFragment.INSTANCE.newInstance((Parcelable) new MarginStatusDetailFragmentKey(((BuyingPowerHubIntentKey) INSTANCE.getExtras((Activity) this)).getAccountNumber(), entryPoint));
        }
        if (getCurrentFragment() == null) {
            setFragment(C11048R.id.fragment_container, genericComposeFragment);
        } else {
            replaceFragment(genericComposeFragment);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0150  */
    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo15941handle(BuyingPowerHubAction action) {
        ApiTransferAccount.TransferAccountType transferAccountTypeFromServerValue;
        ApiTransferAccount.TransferAccountType transferAccountTypeFromServerValue2;
        ApiTransferAccount.TransferAccountType transferAccountTypeFromServerValue3;
        BigDecimal bigDecimalValueOf;
        BigDecimal bigDecimalValueOf2;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof BuyingPowerHubAction.Deeplink) {
            return Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, Uri.parse(((BuyingPowerHubAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
        }
        if (action instanceof BuyingPowerHubAction.Dismiss) {
            finish();
            return true;
        }
        if (action instanceof BuyingPowerHubAction.InfoAlert) {
            if (getSupportFragmentManager().findFragmentByTag(SduiAlert.BOTTOM_SHEET_TAG) == null) {
                SduiAlert sduiAlert = SduiAlert.INSTANCE;
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                sduiAlert.presentBuyingPowerHubAlertSheet(supportFragmentManager, ((BuyingPowerHubAction.InfoAlert) action).getValue2().getAlert());
            }
            return true;
        }
        if (action instanceof BuyingPowerHubAction.MarginCallDepositFunds) {
            BuyingPowerHubAction.MarginCallDepositFunds marginCallDepositFunds = (BuyingPowerHubAction.MarginCallDepositFunds) action;
            String sink_transfer_account_type = marginCallDepositFunds.getValue2().getSink_transfer_account_type();
            if (sink_transfer_account_type != null) {
                transferAccountTypeFromServerValue3 = ApiTransferAccount.TransferAccountType.INSTANCE.fromServerValue(sink_transfer_account_type);
                if (transferAccountTypeFromServerValue3 == null) {
                    transferAccountTypeFromServerValue3 = ApiTransferAccount.TransferAccountType.UNKNOWN;
                }
                if (transferAccountTypeFromServerValue3 == null) {
                }
            } else {
                transferAccountTypeFromServerValue3 = ApiTransferAccount.TransferAccountType.RHS;
            }
            ApiTransferAccount.TransferAccountType transferAccountType = transferAccountTypeFromServerValue3;
            Navigator navigator = getNavigator();
            Money recommendedDepositAmount = marginCallDepositFunds.getValue2().getRecommendedDepositAmount();
            if (recommendedDepositAmount == null || (bigDecimalValueOf = recommendedDepositAmount.getAmount()) == null) {
                bigDecimalValueOf = BigDecimal.valueOf(0L);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            }
            Money remainingMarginCallAmount = marginCallDepositFunds.getValue2().getRemainingMarginCallAmount();
            if (remainingMarginCallAmount == null || (bigDecimalValueOf2 = remainingMarginCallAmount.getAmount()) == null) {
                bigDecimalValueOf2 = BigDecimal.valueOf(0L);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            }
            Navigator.DefaultImpls.startActivity$default(navigator, this, new Transfer(new TransferConfiguration.MarginResolution(bigDecimalValueOf, bigDecimalValueOf2, true, transferAccountType, marginCallDepositFunds.getValue2().getSink_transfer_account_id())), null, false, null, null, 60, null);
            return true;
        }
        if (action instanceof BuyingPowerHubAction.MarginWarnDepositFunds) {
            BuyingPowerHubAction.MarginWarnDepositFunds marginWarnDepositFunds = (BuyingPowerHubAction.MarginWarnDepositFunds) action;
            String sink_transfer_account_type2 = marginWarnDepositFunds.getValue2().getSink_transfer_account_type();
            if (sink_transfer_account_type2 != null) {
                transferAccountTypeFromServerValue2 = ApiTransferAccount.TransferAccountType.INSTANCE.fromServerValue(sink_transfer_account_type2);
                if (transferAccountTypeFromServerValue2 == null) {
                    transferAccountTypeFromServerValue2 = ApiTransferAccount.TransferAccountType.UNKNOWN;
                }
                if (transferAccountTypeFromServerValue2 == null) {
                }
            } else {
                transferAccountTypeFromServerValue2 = ApiTransferAccount.TransferAccountType.RHS;
            }
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new Transfer(new TransferConfiguration.MarginCallPrevention(marginWarnDepositFunds.getValue2().getPrefilled_deposit_amount().getAmount(), true, transferAccountTypeFromServerValue2, marginWarnDepositFunds.getValue2().getSink_transfer_account_id(), MAXTransferContext.EntryPoint.MARGIN_HUB, null, 32, null)), null, false, null, null, 60, null);
            return true;
        }
        if (!(action instanceof BuyingPowerHubAction.StandardDeposit)) {
            throw new NoWhenBranchMatchedException();
        }
        BuyingPowerHubAction.StandardDeposit standardDeposit = (BuyingPowerHubAction.StandardDeposit) action;
        String sink_transfer_account_type3 = standardDeposit.getValue2().getSink_transfer_account_type();
        if (sink_transfer_account_type3 != null) {
            transferAccountTypeFromServerValue = ApiTransferAccount.TransferAccountType.INSTANCE.fromServerValue(sink_transfer_account_type3);
            if (transferAccountTypeFromServerValue == null) {
                transferAccountTypeFromServerValue = ApiTransferAccount.TransferAccountType.UNKNOWN;
            }
            if (transferAccountTypeFromServerValue == null) {
            }
        } else {
            transferAccountTypeFromServerValue = ApiTransferAccount.TransferAccountType.RHS;
        }
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new Transfer(new TransferConfiguration.Standard(null, null, false, new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferConfiguration.TransferAccountSelection(standardDeposit.getValue2().getSink_transfer_account_id(), false, transferAccountTypeFromServerValue), null, MAXTransferContext.EntryPoint.MARGIN_HUB, null, false, false, null, null, false, 8103, null)), null, false, null, null, 60, null);
        return true;
    }

    /* compiled from: BuyingPowerHubActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubActivity;", "Lcom/robinhood/android/margin/contracts/BuyingPowerHubIntentKey;", "<init>", "()V", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<BuyingPowerHubActivity, BuyingPowerHubIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public BuyingPowerHubIntentKey getExtras(BuyingPowerHubActivity buyingPowerHubActivity) {
            return (BuyingPowerHubIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, buyingPowerHubActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, BuyingPowerHubIntentKey buyingPowerHubIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, buyingPowerHubIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, BuyingPowerHubIntentKey buyingPowerHubIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, buyingPowerHubIntentKey);
        }
    }
}
