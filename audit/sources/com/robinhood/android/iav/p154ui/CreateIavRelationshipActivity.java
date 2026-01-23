package com.robinhood.android.iav.p154ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.ach.contracts.AchRelationshipDocumentRequestSource;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.banking.util.Contexts3;
import com.robinhood.android.banking.util.DeactivatedAccountUtils;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.RhShortcut;
import com.robinhood.android.common.util.RhShortcutManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.iav.C18470R;
import com.robinhood.android.iav.p154ui.PlaidConnectionFragment;
import com.robinhood.android.iav.p154ui.PlaidLoadingFragment;
import com.robinhood.android.maxonboarding.FromOnboardingCallbacks;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.AchTransferIntentKey;
import com.robinhood.android.transfers.contracts.CreateIavRelationshipIntentKey;
import com.robinhood.android.transfers.contracts.transfercontext.CreateIavAccountData;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.android.util.style.DesignSystemLegacyShim;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.transfers.contracts.CreateAchRelationship;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: CreateIavRelationshipActivity.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 O2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001OB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0014J\b\u00103\u001a\u00020\nH\u0016J\b\u00104\u001a\u000200H\u0016J\b\u00105\u001a\u000200H\u0016J\b\u00106\u001a\u000200H\u0016J\b\u00107\u001a\u000200H\u0016J\b\u00108\u001a\u000200H\u0016J\u0010\u00109\u001a\u0002002\u0006\u0010:\u001a\u00020;H\u0016J\u001a\u0010<\u001a\u00020\n2\u0006\u0010:\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u000102H\u0016J\u001a\u0010>\u001a\u00020\n2\u0006\u0010:\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u000102H\u0016J\b\u0010?\u001a\u000200H\u0002J\"\u0010@\u001a\u0002002\u0006\u0010A\u001a\u00020;2\u0006\u0010B\u001a\u00020;2\b\u0010C\u001a\u0004\u0018\u00010DH\u0014J\u0018\u0010E\u001a\u0002002\u0006\u0010F\u001a\u00020!2\u0006\u0010G\u001a\u00020(H\u0016J\b\u0010H\u001a\u00020\nH\u0016J\t\u0010I\u001a\u00020\nH\u0096\u0001R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR/\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010!8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R/\u0010)\u001a\u0004\u0018\u00010(2\b\u0010 \u001a\u0004\u0018\u00010(8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u001f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0018\u0010J\u001a\b\u0012\u0004\u0012\u00020L0KX\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/CreateIavRelationshipActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/iav/ui/PlaidLoadingFragment$Callbacks;", "Lcom/robinhood/android/iav/ui/PlaidConnectionFragment$Callbacks;", "Lcom/robinhood/android/maxonboarding/FromOnboardingCallbacks;", "<init>", "()V", "useAchromaticOverlay", "", "getUseAchromaticOverlay", "()Z", "isFromRhfOnboarding", "shortcutManager", "Lcom/robinhood/android/common/util/RhShortcutManager;", "getShortcutManager", "()Lcom/robinhood/android/common/util/RhShortcutManager;", "setShortcutManager", "(Lcom/robinhood/android/common/util/RhShortcutManager;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "sessionId", "Ljava/util/UUID;", "getSessionId$feature_iav_externalDebug", "()Ljava/util/UUID;", "sessionId$delegate", "Lkotlin/properties/ReadWriteProperty;", "<set-?>", "Lcom/robinhood/models/db/AchRelationship;", "createdRelationship", "getCreatedRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "setCreatedRelationship", "(Lcom/robinhood/models/db/AchRelationship;)V", "createdRelationship$delegate", "Lcom/robinhood/android/transfers/contracts/transfercontext/CreateIavAccountData;", "iavAccountData", "getIavAccountData", "()Lcom/robinhood/android/transfers/contracts/transfercontext/CreateIavAccountData;", "setIavAccountData", "(Lcom/robinhood/android/transfers/contracts/transfercontext/CreateIavAccountData;)V", "iavAccountData$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "shouldPromptForLockscreen", "showPlaidIavFlow", "showMicrodepositsFlow", "onDeactivateAccount", "onReachedLinkedAchRelationshipsLimit", "onBackPressed", "onDialogDismissed", "id", "", "onPositiveButtonClicked", "passthroughArgs", "onNegativeButtonClicked", "finishLinking", "onActivityResult", "requestCode", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onRelationshipCreated", CreateIavRelationshipActivity.RESULT_EXTRA_ACH_RELATIONSHIP, "createIavAccountData", "requiresAuthentication", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class CreateIavRelationshipActivity extends BaseActivity implements RegionGated, RhDialogFragment.OnDismissListener, PlaidLoadingFragment.Callbacks, PlaidConnectionFragment.Callbacks, FromOnboardingCallbacks {
    private static final int ACH_REQUEST_CODE = 1;
    private static final String RESULT_EXTRA_ACH_RELATIONSHIP = "achRelationship";
    private static final int TRANSFER_REQUEST_CODE = 2;
    private static final int VERIFICATION_PROMPT_REQUEST_CODE = 3;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(MoneyMovementsUsRegionGate.INSTANCE);
    public AnalyticsLogger analytics;

    /* renamed from: createdRelationship$delegate, reason: from kotlin metadata */
    private final Interfaces3 createdRelationship;

    /* renamed from: iavAccountData$delegate, reason: from kotlin metadata */
    private final Interfaces3 iavAccountData;

    /* renamed from: sessionId$delegate, reason: from kotlin metadata */
    private final Interfaces3 sessionId;
    public RhShortcutManager shortcutManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CreateIavRelationshipActivity.class, "sessionId", "getSessionId$feature_iav_externalDebug()Ljava/util/UUID;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CreateIavRelationshipActivity.class, "createdRelationship", "getCreatedRelationship()Lcom/robinhood/models/db/AchRelationship;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CreateIavRelationshipActivity.class, "iavAccountData", "getIavAccountData()Lcom/robinhood/android/transfers/contracts/transfercontext/CreateIavAccountData;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CreateIavRelationshipActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IavSource.values().length];
            try {
                iArr[IavSource.ONBOARDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IavSource.ONBOARDING_V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IavSource.WATCHLIST_QUEUED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IavSource.WATCHLIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IavSource.TRANSFER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IavSource.CASH_MANAGEMENT_ONBOARDING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IavSource.RHY_REFERRAL_ONBOARDING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IavSource.DEEPLINK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[IavSource.DEEPLINK_QUEUED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[IavSource.MENU_OF_OPTIONS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[IavSource.RECURRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[IavSource.RECURRING_DEPOSIT_EXTRA_CASH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[IavSource.NONE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[IavSource.OUTGOING_WIRE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
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

    public CreateIavRelationshipActivity() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        Interfaces interfacesSavedSerializable = BindSavedState2.savedSerializable(this, uuidRandomUUID);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.sessionId = (Interfaces3) interfacesSavedSerializable.provideDelegate(this, kPropertyArr[0]);
        this.createdRelationship = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, kPropertyArr[1]);
        this.iavAccountData = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, kPropertyArr[2]);
    }

    @Override // com.robinhood.android.iav.ui.PlaidConnectionFragment.Callbacks
    public boolean getUseAchromaticOverlay() {
        return ((CreateIavRelationshipIntentKey) INSTANCE.getExtras((Activity) this)).getUseAchromaticOverlay();
    }

    @Override // com.robinhood.android.maxonboarding.FromOnboardingCallbacks
    public boolean isFromRhfOnboarding() {
        return ((CreateIavRelationshipIntentKey) INSTANCE.getExtras((Activity) this)).isFromRhfOnboarding();
    }

    public final RhShortcutManager getShortcutManager() {
        RhShortcutManager rhShortcutManager = this.shortcutManager;
        if (rhShortcutManager != null) {
            return rhShortcutManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shortcutManager");
        return null;
    }

    public final void setShortcutManager(RhShortcutManager rhShortcutManager) {
        Intrinsics.checkNotNullParameter(rhShortcutManager, "<set-?>");
        this.shortcutManager = rhShortcutManager;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final UUID getSessionId$feature_iav_externalDebug() {
        Object value = this.sessionId.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (UUID) value;
    }

    private final AchRelationship getCreatedRelationship() {
        return (AchRelationship) this.createdRelationship.getValue(this, $$delegatedProperties[1]);
    }

    private final void setCreatedRelationship(AchRelationship achRelationship) {
        this.createdRelationship.setValue(this, $$delegatedProperties[1], achRelationship);
    }

    private final CreateIavAccountData getIavAccountData() {
        return (CreateIavAccountData) this.iavAccountData.getValue(this, $$delegatedProperties[2]);
    }

    private final void setIavAccountData(CreateIavAccountData createIavAccountData) {
        this.iavAccountData.setValue(this, $$delegatedProperties[2], createIavAccountData);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(128);
        ScarletManager scarletManager = ScarletManager2.getScarletManager(this);
        DesignSystemLegacyShim designSystemLegacyShim = DesignSystemLegacyShim.INSTANCE;
        Boolean bool = Boolean.FALSE;
        scarletManager.putOverlay(designSystemLegacyShim, bool);
        if (isFromRhfOnboarding() || getUseAchromaticOverlay()) {
            scarletManager.putOverlay(AchromaticOverlay.INSTANCE, bool);
        }
        Companion companion = INSTANCE;
        if (((CreateIavRelationshipIntentKey) companion.getExtras((Activity) this)).getTheme() == ColorTheme.DARK) {
            ScarletManager.putOverlay$default(scarletManager, DayNightOverlay.NIGHT, null, 2, null);
        }
        setContentView(C18470R.layout.activity_create_iav_relationship);
        switch (WhenMappings.$EnumSwitchMapping$0[((CreateIavRelationshipIntentKey) companion.getExtras((Activity) this)).getSource().ordinal()]) {
            case 1:
            case 2:
            case 3:
                getShortcutManager().reportUse(RhShortcut.DEPOSIT_QUEUED_DEPOSIT);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                getShortcutManager().reportUse(RhShortcut.LINK_ACCOUNT);
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (savedInstanceState == null) {
            setFragment(C18470R.id.fragment_container, PlaidLoadingFragment.INSTANCE.newInstance((Parcelable) new PlaidLoadingFragment.Args(((CreateIavRelationshipIntentKey) companion.getExtras((Activity) this)).getSource())));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return !((CreateIavRelationshipIntentKey) INSTANCE.getExtras((Activity) this)).getSource().isFromOnboarding();
    }

    @Override // com.robinhood.android.iav.ui.PlaidLoadingFragment.Callbacks
    public void showPlaidIavFlow() {
        PlaidConnectionFragment.Companion companion = PlaidConnectionFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragment(companion.newInstance((Parcelable) new PlaidConnectionFragment.Args(((CreateIavRelationshipIntentKey) companion2.getExtras((Activity) this)).getSource(), ((CreateIavRelationshipIntentKey) companion2.getExtras((Activity) this)).getRecommendedTransfersAmount(), ((CreateIavRelationshipIntentKey) companion2.getExtras((Activity) this)).getTransferAccountType(), ((CreateIavRelationshipIntentKey) companion2.getExtras((Activity) this)).getTheme())));
    }

    @Override // com.robinhood.android.iav.ui.PlaidLoadingFragment.Callbacks
    public void showMicrodepositsFlow() {
        Navigator navigator = getNavigator();
        Companion companion = INSTANCE;
        Navigator.DefaultImpls.startActivityForResult$default(navigator, (Activity) this, (IntentKey) new CreateAchRelationship(((CreateIavRelationshipIntentKey) companion.getExtras((Activity) this)).getSource(), null, ((CreateIavRelationshipIntentKey) companion.getExtras((Activity) this)).getTheme()), 1, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
    }

    @Override // com.robinhood.android.iav.ui.PlaidLoadingFragment.Callbacks
    public void onDeactivateAccount() {
        DeactivatedAccountUtils.showDeactivatedAccountDialog(this, C9631R.string.linking_deactivated_account_message);
    }

    @Override // com.robinhood.android.iav.ui.PlaidLoadingFragment.Callbacks
    public void onReachedLinkedAchRelationshipsLimit() {
        RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(this).setId(C18470R.id.dialog_id_iav_maximum_relationships_linked).setMessage(C18470R.string.max_ach_relationships_linked_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_done, new Object[0]);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "reachedLinkedAchRelationshipsLimit", false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (getCurrentFragment() instanceof PlaidLoadingFragment) {
            finish();
        }
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C18470R.id.dialog_id_iav_maximum_relationships_linked || id == C9631R.id.dialog_id_deactivated_account) {
            finish();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C18470R.id.dialog_id_iav_maximum_relationships_linked || id == C9631R.id.dialog_id_deactivated_account) {
            finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C9631R.id.dialog_id_deactivated_account) {
            Navigators3.showContactSupportTriageFragment$default(getNavigator(), this, null, false, 6, null);
            finish();
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    private final void finishLinking() {
        Companion companion = INSTANCE;
        if (((CreateIavRelationshipIntentKey) companion.getExtras((Activity) this)).getSource().getShouldContinueToTransfer()) {
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Activity) this, (IntentKey) new AchTransferIntentKey(new TransferContext.NormalIav(((CreateIavRelationshipIntentKey) companion.getExtras((Activity) this)).getDirection(), getIavAccountData(), ((CreateIavRelationshipIntentKey) companion.getExtras((Activity) this)).getSource(), null, 8, null), false, isFromRhfOnboarding(), getUseAchromaticOverlay(), ((CreateIavRelationshipIntentKey) companion.getExtras((Activity) this)).getTheme(), 2, null), 2, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
            return;
        }
        setResult(-1, new Intent().putExtra(RESULT_EXTRA_ACH_RELATIONSHIP, getCreatedRelationship()));
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == -1) {
                setResult(resultCode);
            }
            finish();
        } else if (requestCode == 2) {
            setResult(resultCode, data);
            finish();
        } else {
            if (requestCode != 3) {
                return;
            }
            finishLinking();
        }
    }

    @Override // com.robinhood.android.iav.ui.PlaidConnectionFragment.Callbacks
    public void onRelationshipCreated(AchRelationship achRelationship, CreateIavAccountData createIavAccountData) {
        Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
        Intrinsics.checkNotNullParameter(createIavAccountData, "createIavAccountData");
        setCreatedRelationship(achRelationship);
        setIavAccountData(createIavAccountData);
        getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_LINK_BANK_IAV);
        if (achRelationship.getState() == ApiAchRelationship.State.NEEDS_APPROVAL) {
            Contexts3.startAchRelationshipDocumentRequest(this, achRelationship, ApiDocumentRequest.Type.BANK_STATEMENT, AchRelationshipDocumentRequestSource.IAV, 3, ((CreateIavRelationshipIntentKey) INSTANCE.getExtras((Activity) this)).getTheme());
        } else {
            Toast.makeText(this, C18470R.string.iav_link_success, 0).show();
            finishLinking();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        PaymentLinkingContext paymentLinkingContext = ((CreateIavRelationshipIntentKey) INSTANCE.getExtras((Activity) this)).getPaymentLinkingContext();
        return (paymentLinkingContext != null ? paymentLinkingContext.getEntry_point() : null) != PaymentLinkingContext.EntryPoint.USER_SIGN_UP;
    }

    /* compiled from: CreateIavRelationshipActivity.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/CreateIavRelationshipActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/iav/ui/CreateIavRelationshipActivity;", "Lcom/robinhood/android/transfers/contracts/CreateIavRelationshipIntentKey;", "<init>", "()V", "RESULT_EXTRA_ACH_RELATIONSHIP", "", "ACH_REQUEST_CODE", "", "TRANSFER_REQUEST_CODE", "VERIFICATION_PROMPT_REQUEST_CODE", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<CreateIavRelationshipActivity, CreateIavRelationshipIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public CreateIavRelationshipIntentKey getExtras(CreateIavRelationshipActivity createIavRelationshipActivity) {
            return (CreateIavRelationshipIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, createIavRelationshipActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CreateIavRelationshipIntentKey createIavRelationshipIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, createIavRelationshipIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, CreateIavRelationshipIntentKey createIavRelationshipIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, createIavRelationshipIntentKey);
        }
    }
}
