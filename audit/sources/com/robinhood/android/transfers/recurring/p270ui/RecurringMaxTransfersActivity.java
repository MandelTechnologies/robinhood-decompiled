package com.robinhood.android.transfers.recurring.p270ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.banking.p065ui.ScheduleAutomaticDepositFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.RecurringMaxTransfer;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringMaxTransfersActivity.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001(B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0014J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\"\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\t\u0010!\u001a\u00020\"H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/RecurringMaxTransfersActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/banking/ui/ScheduleAutomaticDepositFragment$Callbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onAutomaticDepositIntervalSelected", "frequency", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class RecurringMaxTransfersActivity extends BaseActivity implements RegionGated, ScheduleAutomaticDepositFragment.Callbacks {
    public static final int transfersRequestCode = 182;
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public EventLogger eventLogger;

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringMaxTransfersActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAutomaticDeposit.Frequency.values().length];
            try {
                iArr[ApiAutomaticDeposit.Frequency.ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAutomaticDeposit.Frequency.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAutomaticDeposit.Frequency.BIWEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiAutomaticDeposit.Frequency.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiAutomaticDeposit.Frequency.QUARTERLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
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

    public RecurringMaxTransfersActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(MoneyMovementsUsRegionGate.INSTANCE);
        this.eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.RecurringMaxTransfersActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringMaxTransfersActivity.eventScreen_delegate$lambda$0();
            }
        });
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    private final Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$0() {
        return new Screen(Screen.Name.CHOOSE_TRANSFER_FREQUENCY, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, ScheduleAutomaticDepositFragment.INSTANCE.newInstance((Parcelable) new ScheduleAutomaticDepositFragment.Args(null)));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logScreenAppear$default(getEventLogger(), null, getEventScreen(), null, null, null, 29, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        EventLogger.DefaultImpls.logScreenDisappear$default(getEventLogger(), null, getEventScreen(), null, null, null, 29, null);
        super.onStop();
    }

    @Override // com.robinhood.android.banking.ui.ScheduleAutomaticDepositFragment.Callbacks
    public void onAutomaticDepositIntervalSelected(ApiAutomaticDeposit.Frequency frequency) {
        ApiCreateTransferRequest2 apiCreateTransferRequest2;
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        EventLogger eventLogger = getEventLogger();
        Screen eventScreen = getEventScreen();
        Component component = new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null);
        MAXTransferContext.EntryPoint entryPoint = MAXTransferContext.EntryPoint.RECURRING_TRANSFER_HUB;
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, eventScreen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MAXTransferContext(null, null, null, null, null, null, entryPoint, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048511, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), false, 41, null);
        Navigator navigator = getNavigator();
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            apiCreateTransferRequest2 = ApiCreateTransferRequest2.ONCE;
        } else if (i == 2) {
            apiCreateTransferRequest2 = ApiCreateTransferRequest2.WEEKLY;
        } else if (i == 3) {
            apiCreateTransferRequest2 = ApiCreateTransferRequest2.BIWEEKLY;
        } else if (i == 4) {
            apiCreateTransferRequest2 = ApiCreateTransferRequest2.MONTHLY;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            apiCreateTransferRequest2 = ApiCreateTransferRequest2.QUARTERLY;
        }
        Navigator.DefaultImpls.startActivityForResult$default(navigator, (Activity) this, (IntentKey) new Transfer(new TransferConfiguration.Standard(null, apiCreateTransferRequest2, false, new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), ((RecurringMaxTransfer) INSTANCE.getExtras((Activity) this)).getTo(), null, entryPoint, null, false, false, null, null, false, 8101, null)), 182, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 182 && resultCode == -1) {
            finish();
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    /* compiled from: RecurringMaxTransfersActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/RecurringMaxTransfersActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/recurring/ui/RecurringMaxTransfersActivity;", "Lcom/robinhood/android/transfers/contracts/RecurringMaxTransfer;", "<init>", "()V", "transfersRequestCode", "", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<RecurringMaxTransfersActivity, RecurringMaxTransfer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public RecurringMaxTransfer getExtras(RecurringMaxTransfersActivity recurringMaxTransfersActivity) {
            return (RecurringMaxTransfer) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, recurringMaxTransfersActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(android.content.Context context, RecurringMaxTransfer recurringMaxTransfer) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, recurringMaxTransfer);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(android.content.Context context, RecurringMaxTransfer recurringMaxTransfer) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, recurringMaxTransfer);
        }
    }
}
