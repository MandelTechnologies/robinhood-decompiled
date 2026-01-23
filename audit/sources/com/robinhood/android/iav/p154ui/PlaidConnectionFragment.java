package com.robinhood.android.iav.p154ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.View;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.plaid.internal.EnumC7081g;
import com.plaid.link.result.LinkAccount;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.iav.C18470R;
import com.robinhood.android.iav.p154ui.PlaidConnectionDuxo7;
import com.robinhood.android.iav.p154ui.PlaidConnectionFragment;
import com.robinhood.android.iav.p154ui.PlaidCreateIavRelationshipFragment;
import com.robinhood.android.iav.p154ui.PlaidExchangeTokenFragment;
import com.robinhood.android.iav.p154ui.PlaidSdkFragment;
import com.robinhood.android.maxonboarding.FromOnboardingCallbacks;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.onboarding.contracts.GoldNativeFundingUpsellIntentKey;
import com.robinhood.android.transfers.contracts.AchTransferIntentKey;
import com.robinhood.android.transfers.contracts.transfercontext.CreateIavAccountData;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.IavAccount;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.cashier.RhAccountType;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.transfers.contracts.CreateAchRelationship;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.shared.transfers.contracts.context.PlaidIavMetadata;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: PlaidConnectionFragment.kt */
@Metadata(m3635d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 [2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003YZ[B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\"\u0010,\u001a\u00020'2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\b\u00100\u001a\u0004\u0018\u00010$H\u0016J\b\u00101\u001a\u00020'H\u0016J&\u00106\u001a\u00020'2\u0006\u00107\u001a\u0002032\u0006\u00108\u001a\u0002092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0016J \u0010=\u001a\u00020'2\u0006\u0010>\u001a\u0002032\u0006\u0010?\u001a\u00020@2\u0006\u00108\u001a\u000209H\u0016J\u0012\u0010A\u001a\u00020'2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010B\u001a\u00020'2\u0006\u0010C\u001a\u00020DH\u0002J\u0018\u0010E\u001a\u00020'2\u000e\u0010F\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010GH\u0002J\b\u0010I\u001a\u00020'H\u0002J\b\u0010J\u001a\u00020'H\u0002J\u0010\u0010K\u001a\u00020'2\u0006\u0010L\u001a\u00020MH\u0002J\b\u0010N\u001a\u00020'H\u0016J \u0010O\u001a\u00020'2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u000eH\u0016J\b\u0010U\u001a\u00020'H\u0002J\u0018\u0010V\u001a\u00020'2\u0006\u0010>\u001a\u0002032\u0006\u0010?\u001a\u00020@H\u0002J \u0010W\u001a\u00020'2\u0006\u0010>\u001a\u0002032\u0006\u0010?\u001a\u00020@2\u0006\u00108\u001a\u000209H\u0002J(\u0010X\u001a\u00020'2\u0006\u0010>\u001a\u0002032\u0006\u0010?\u001a\u00020@2\u0006\u00108\u001a\u0002092\u0006\u0010T\u001a\u00020\u000eH\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\"\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010$0$0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidConnectionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/iav/ui/PlaidSdkFragment$Callbacks;", "Lcom/robinhood/android/iav/ui/PlaidExchangeTokenFragment$Callbacks;", "Lcom/robinhood/android/iav/ui/PlaidCreateIavRelationshipFragment$Callbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "<set-?>", "", "hasCheckedOnboardingGoldNativeFunding", "getHasCheckedOnboardingGoldNativeFunding", "()Z", "setHasCheckedOnboardingGoldNativeFunding", "(Z)V", "hasCheckedOnboardingGoldNativeFunding$delegate", "Lkotlin/properties/ReadWriteProperty;", "callbacks", "Lcom/robinhood/android/iav/ui/PlaidConnectionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/iav/ui/PlaidConnectionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxo;", "getDuxo", "()Lcom/robinhood/android/iav/ui/PlaidConnectionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "goldNativeFundingUpsellAfterPlaidLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "onDestroy", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "onPlaidAccessTokenGranted", "plaidAccessToken", PlaidExchangeTokenFragment.ARG_PLAID_IAV_METADATA, "Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "plaidLinkAccounts", "", "Lcom/plaid/link/result/LinkAccount;", "onTokenExchanged", "accessToken", "iavAccount", "Lcom/robinhood/models/api/IavAccount;", "onManualLinkingFlowRequested", "processViewState", "viewState", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoVS;", "processEvent", "plaidConnectionDuxoEvent", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/iav/ui/PlaidConnectionDuxoEvents;", "logTap", "logExit", "logScreenTransition", "eventType", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;", "onPlaidIavExited", "onPlaidIavRelationshipCreated", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "createIavAccountData", "Lcom/robinhood/android/transfers/contracts/transfercontext/CreateIavAccountData;", "isGoldBackupBillingMember", "launchGoldNativeFundingUpsell", "launchNormalDepositScreen", "launchQueuedDeposit", "launchCreateIavRelationship", "Callbacks", "Args", "Companion", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class PlaidConnectionFragment extends BaseFragment implements PlaidSdkFragment.Callbacks, PlaidExchangeTokenFragment.Callbacks, PlaidCreateIavRelationshipFragment.Callbacks {
    private static final int ACH_REQUEST_CODE = 1337;
    public static final String ONBOARDING_PLAID_CONNECTION_SOURCE = "onboarding_plaid_connection";
    private static final int TRANSFER_REQUEST_CODE = 9001;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final ActivityResultLauncher<Intent> goldNativeFundingUpsellAfterPlaidLauncher;

    /* renamed from: hasCheckedOnboardingGoldNativeFunding$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasCheckedOnboardingGoldNativeFunding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PlaidConnectionFragment.class, "hasCheckedOnboardingGoldNativeFunding", "getHasCheckedOnboardingGoldNativeFunding()Z", 0)), Reflection.property1(new PropertyReference1Impl(PlaidConnectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/iav/ui/PlaidConnectionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PlaidConnectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidConnectionFragment$Callbacks;", "Lcom/robinhood/android/maxonboarding/FromOnboardingCallbacks;", "useAchromaticOverlay", "", "getUseAchromaticOverlay", "()Z", "onRelationshipCreated", "", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "createIavAccountData", "Lcom/robinhood/android/transfers/contracts/transfercontext/CreateIavAccountData;", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends FromOnboardingCallbacks {
        boolean getUseAchromaticOverlay();

        void onRelationshipCreated(AchRelationship achRelationship, CreateIavAccountData createIavAccountData);
    }

    /* compiled from: PlaidConnectionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiTransferAccount.TransferAccountType.values().length];
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.ACH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.DEBIT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.IRA_ROTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.SEPA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHY_BANKING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHUK_ISA_STOCKS_AND_SHARES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.CUSTODIAL_UGMA.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.CUSTODIAL_UTMA.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.UNKNOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processEvent(final Event<PlaidConnectionDuxo7> plaidConnectionDuxoEvent) {
        EventConsumer<PlaidConnectionDuxo7> eventConsumerInvoke;
        if (plaidConnectionDuxoEvent == null || !(plaidConnectionDuxoEvent.getData() instanceof PlaidConnectionDuxo7) || (eventConsumerInvoke = plaidConnectionDuxoEvent.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(plaidConnectionDuxoEvent, new Function1() { // from class: com.robinhood.android.iav.ui.PlaidConnectionFragment$processEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m15261invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m15261invoke(Object it) {
                PaymentLinkingContext.EntryPoint entryPoint;
                Intrinsics.checkNotNullParameter(it, "it");
                PlaidConnectionDuxo7 plaidConnectionDuxo7 = (PlaidConnectionDuxo7) plaidConnectionDuxoEvent.getData();
                if (plaidConnectionDuxo7 instanceof PlaidConnectionDuxo7.NavigateToDebitCard) {
                    if (((PlaidConnectionFragment.Args) PlaidConnectionFragment.INSTANCE.getArgs((Fragment) this)).getIavSource() == IavSource.MENU_OF_OPTIONS) {
                        entryPoint = PaymentLinkingContext.EntryPoint.MENU_OF_OPTIONS;
                    } else {
                        entryPoint = PaymentLinkingContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
                    }
                    FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                    Navigator navigator = this.getNavigator();
                    FragmentActivity fragmentActivityRequireActivity2 = this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                    Uri uri = Uri.parse(DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD() + "://link_debit_card?entry_point=" + PaymentLinkingContext.EntryPoint.PLAID_FALLBACK.getValue() + "&original_entry_point=" + entryPoint.getValue());
                    Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                    fragmentActivityRequireActivity.startActivity((Intent) ArraysKt.first(Navigator.DefaultImpls.resolveDeepLink$default(navigator, fragmentActivityRequireActivity2, uri, null, DeepLinkOrigin.Internal.INSTANCE, false, 20, null)));
                    this.logTap();
                    this.requireActivity().finish();
                    return;
                }
                if (plaidConnectionDuxo7 instanceof PlaidConnectionDuxo7.NavigateToManualLinkingScreen) {
                    Navigator navigator2 = this.getNavigator();
                    PlaidConnectionFragment plaidConnectionFragment = this;
                    PlaidConnectionFragment.Companion companion = PlaidConnectionFragment.INSTANCE;
                    Navigator.DefaultImpls.startActivityForResult$default(navigator2, (Fragment) plaidConnectionFragment, (IntentKey) new CreateAchRelationship(((PlaidConnectionFragment.Args) companion.getArgs((Fragment) this)).getIavSource(), ((PlaidConnectionDuxo7.NavigateToManualLinkingScreen) plaidConnectionDuxo7).getPlaidIavMetadata(), ((PlaidConnectionFragment.Args) companion.getArgs((Fragment) this)).getTheme()), 1337, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
                    return;
                }
                if (plaidConnectionDuxo7 instanceof PlaidConnectionDuxo7.CloseScreen) {
                    this.requireActivity().finish();
                    return;
                }
                if (plaidConnectionDuxo7 instanceof PlaidConnectionDuxo7.LogAppear) {
                    this.logScreenTransition(UserInteractionEventData.EventType.SCREEN_TRANSITION_APPEAR);
                    return;
                }
                if (plaidConnectionDuxo7 instanceof PlaidConnectionDuxo7.NavigateToOnboardingGoldNativeFundingUpsell) {
                    this.launchGoldNativeFundingUpsell();
                    return;
                }
                if (plaidConnectionDuxo7 instanceof PlaidConnectionDuxo7.NavigateToQueuedDepositScreen) {
                    PlaidConnectionDuxo7.NavigateToQueuedDepositScreen navigateToQueuedDepositScreen = (PlaidConnectionDuxo7.NavigateToQueuedDepositScreen) plaidConnectionDuxo7;
                    this.launchQueuedDeposit(navigateToQueuedDepositScreen.getAccessToken(), navigateToQueuedDepositScreen.getIavAccount(), navigateToQueuedDepositScreen.getPlaidIavMetadata());
                } else if (plaidConnectionDuxo7 instanceof PlaidConnectionDuxo7.NavigateToCreateIavRelationship) {
                    PlaidConnectionDuxo7.NavigateToCreateIavRelationship navigateToCreateIavRelationship = (PlaidConnectionDuxo7.NavigateToCreateIavRelationship) plaidConnectionDuxo7;
                    this.launchCreateIavRelationship(navigateToCreateIavRelationship.getAccessToken(), navigateToCreateIavRelationship.getIavAccount(), navigateToCreateIavRelationship.getPlaidIavMetadata(), navigateToCreateIavRelationship.isGoldBackupBillingMember());
                } else {
                    if (!(plaidConnectionDuxo7 instanceof PlaidConnectionDuxo7.NavigateToNormalDepositScreen)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PlaidConnectionDuxo7.NavigateToNormalDepositScreen navigateToNormalDepositScreen = (PlaidConnectionDuxo7.NavigateToNormalDepositScreen) plaidConnectionDuxo7;
                    this.launchNormalDepositScreen(navigateToNormalDepositScreen.getAccessToken(), navigateToNormalDepositScreen.getIavAccount());
                }
            }
        });
    }

    public PlaidConnectionFragment() {
        super(C18470R.layout.fragment_plaid_connection);
        this.hasCheckedOnboardingGoldNativeFunding = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[0]);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.iav.ui.PlaidConnectionFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof PlaidConnectionFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = DuxosKt.duxo(this, PlaidConnectionDuxo.class);
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.iav.ui.PlaidConnectionFragment$goldNativeFundingUpsellAfterPlaidLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult activityResult) {
                Intrinsics.checkNotNullParameter(activityResult, "<unused var>");
                this.this$0.getDuxo().onGoldUpsellAfterIavAccountCompleted();
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.goldNativeFundingUpsellAfterPlaidLauncher = activityResultLauncherRegisterForActivityResult;
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

    private final boolean getHasCheckedOnboardingGoldNativeFunding() {
        return ((Boolean) this.hasCheckedOnboardingGoldNativeFunding.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final void setHasCheckedOnboardingGoldNativeFunding(boolean z) {
        this.hasCheckedOnboardingGoldNativeFunding.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlaidConnectionDuxo getDuxo() {
        return (PlaidConnectionDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C18470R.id.fragment_container, PlaidSdkFragment.INSTANCE.newInstance(((Args) INSTANCE.getArgs((Fragment) this)).getIavSource()));
        }
        BaseFragment.collectDuxoState$default(this, null, new C184931(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C184942(null), 1, null);
    }

    /* compiled from: PlaidConnectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.iav.ui.PlaidConnectionFragment$onViewCreated$1", m3645f = "PlaidConnectionFragment.kt", m3646l = {97}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.iav.ui.PlaidConnectionFragment$onViewCreated$1 */
    static final class C184931 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C184931(Continuation<? super C184931> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PlaidConnectionFragment.this.new C184931(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C184931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<PlaidConnectionDuxoVS> stateFlow = PlaidConnectionFragment.this.getDuxo().getStateFlow();
                final PlaidConnectionFragment plaidConnectionFragment = PlaidConnectionFragment.this;
                FlowCollector<? super PlaidConnectionDuxoVS> flowCollector = new FlowCollector() { // from class: com.robinhood.android.iav.ui.PlaidConnectionFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PlaidConnectionDuxoVS) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(PlaidConnectionDuxoVS plaidConnectionDuxoVS, Continuation<? super Unit> continuation) {
                        plaidConnectionFragment.processViewState(plaidConnectionDuxoVS);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* compiled from: PlaidConnectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.iav.ui.PlaidConnectionFragment$onViewCreated$2", m3645f = "PlaidConnectionFragment.kt", m3646l = {102}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.iav.ui.PlaidConnectionFragment$onViewCreated$2 */
    static final class C184942 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C184942(Continuation<? super C184942> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PlaidConnectionFragment.this.new C184942(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C184942) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<PlaidConnectionDuxo7>> eventFlow = PlaidConnectionFragment.this.getDuxo().getEventFlow();
                final PlaidConnectionFragment plaidConnectionFragment = PlaidConnectionFragment.this;
                FlowCollector<? super Event<PlaidConnectionDuxo7>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.iav.ui.PlaidConnectionFragment.onViewCreated.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<PlaidConnectionDuxo7>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Event<PlaidConnectionDuxo7> event, Continuation<? super Unit> continuation) {
                        plaidConnectionFragment.processEvent(event);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == ACH_REQUEST_CODE || requestCode == TRANSFER_REQUEST_CODE) {
            requireActivity().setResult(resultCode, data);
            requireActivity().finish();
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        logExit();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: getScreenDescription */
    public String getProfileId() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getIavSource().getAnalyticsTag();
    }

    @Override // com.robinhood.android.iav.ui.PlaidSdkFragment.Callbacks
    public void onPlaidAccessTokenGranted(String plaidAccessToken, PlaidIavMetadata plaidIavMetadata, List<LinkAccount> plaidLinkAccounts) {
        Intrinsics.checkNotNullParameter(plaidAccessToken, "plaidAccessToken");
        Intrinsics.checkNotNullParameter(plaidIavMetadata, "plaidIavMetadata");
        Intrinsics.checkNotNullParameter(plaidLinkAccounts, "plaidLinkAccounts");
        replaceFragment(PlaidExchangeTokenFragment.INSTANCE.newInstance(plaidAccessToken, ((LinkAccount) CollectionsKt.first((List) plaidLinkAccounts)).getId(), plaidIavMetadata));
    }

    @Override // com.robinhood.android.iav.ui.PlaidExchangeTokenFragment.Callbacks
    public void onTokenExchanged(String accessToken, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(iavAccount, "iavAccount");
        Intrinsics.checkNotNullParameter(plaidIavMetadata, "plaidIavMetadata");
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getIavSource() == IavSource.ONBOARDING) {
            if (getHasCheckedOnboardingGoldNativeFunding()) {
                return;
            }
            setHasCheckedOnboardingGoldNativeFunding(true);
            getDuxo().onShowOnboardingGoldUpsellAfterPlaidConnection(accessToken, iavAccount, plaidIavMetadata);
            return;
        }
        if (((Args) companion.getArgs((Fragment) this)).getIavSource() == IavSource.ONBOARDING_V2) {
            launchCreateIavRelationship(accessToken, iavAccount, plaidIavMetadata, true);
        } else {
            launchQueuedDeposit(accessToken, iavAccount, plaidIavMetadata);
        }
    }

    @Override // com.robinhood.android.iav.ui.PlaidSdkFragment.Callbacks
    public void onManualLinkingFlowRequested(PlaidIavMetadata plaidIavMetadata) {
        getDuxo().manualLinkingRequested(plaidIavMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processViewState(final PlaidConnectionDuxoVS viewState) {
        ScarletManager scarletManager;
        ComposeView composeView;
        if (viewState.getShowPopup()) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.robinhood.android.common.ui.BaseActivity");
            ((BaseActivity) fragmentActivityRequireActivity).showCloseIcon();
            ScarletContextWrapper scarletContextWrapper = getScarletContextWrapper();
            if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
                scarletManager = getScarletManager();
            }
            final Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(scarletManager);
            View view = getView();
            if (view == null || (composeView = (ComposeView) view.findViewById(C18470R.id.debit_card_funding_takeover)) == null) {
                return;
            }
            composeView.setVisibility(0);
            getDuxo().popupWasShown();
            composeView.setContent(ComposableLambda3.composableLambdaInstance(1649650643, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.iav.ui.PlaidConnectionFragment$processViewState$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1649650643, i, -1, "com.robinhood.android.iav.ui.PlaidConnectionFragment.processViewState.<anonymous>.<anonymous> (PlaidConnectionFragment.kt:183)");
                    }
                    Observable<ThemesFromScarlet> observable = observableThemeChangesForCompose;
                    final PlaidConnectionDuxoVS plaidConnectionDuxoVS = viewState;
                    final PlaidConnectionFragment plaidConnectionFragment = this;
                    BentoTheme2.BentoTheme(observable, null, ComposableLambda3.rememberComposableLambda(-2054180731, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.iav.ui.PlaidConnectionFragment$processViewState$1$1.1

                        /* compiled from: PlaidConnectionFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.iav.ui.PlaidConnectionFragment$processViewState$1$1$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ PlaidConnectionDuxoVS $viewState;
                            final /* synthetic */ PlaidConnectionFragment this$0;

                            AnonymousClass1(PlaidConnectionDuxoVS plaidConnectionDuxoVS, PlaidConnectionFragment plaidConnectionFragment) {
                                this.$viewState = plaidConnectionDuxoVS;
                                this.this$0 = plaidConnectionFragment;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                if ((i & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2069267472, i, -1, "com.robinhood.android.iav.ui.PlaidConnectionFragment.processViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PlaidConnectionFragment.kt:185)");
                                }
                                Integer disclosureId = this.$viewState.getDisclosureId();
                                SpannableString spannableStringValueOf = null;
                                if (disclosureId != null) {
                                    PlaidConnectionFragment plaidConnectionFragment = this.this$0;
                                    PlaidConnectionDuxoVS plaidConnectionDuxoVS = this.$viewState;
                                    int iIntValue = disclosureId.intValue();
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    BigDecimal disclosureFee = plaidConnectionDuxoVS.getDisclosureFee();
                                    spannableStringBuilder.append((CharSequence) plaidConnectionFragment.getString(iIntValue, disclosureFee != null ? zzah$$ExternalSyntheticBackportWithForwarding0.m822m(disclosureFee) : null));
                                    spannableStringValueOf = SpannableString.valueOf(new SpannedString(spannableStringBuilder));
                                }
                                SpannableString spannableString = spannableStringValueOf;
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.this$0);
                                final PlaidConnectionFragment plaidConnectionFragment2 = this.this$0;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0072: CONSTRUCTOR (r2v1 'objRememberedValue' java.lang.Object) = (r0v4 'plaidConnectionFragment2' com.robinhood.android.iav.ui.PlaidConnectionFragment A[DONT_INLINE]) A[MD:(com.robinhood.android.iav.ui.PlaidConnectionFragment):void (m)] (LINE:192) call: com.robinhood.android.iav.ui.PlaidConnectionFragment$processViewState$1$1$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.iav.ui.PlaidConnectionFragment):void type: CONSTRUCTOR in method: com.robinhood.android.iav.ui.PlaidConnectionFragment.processViewState.1.1.1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes10.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.iav.ui.PlaidConnectionFragment$processViewState$1$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 25 more
                                        */
                                    /*
                                        this = this;
                                        r0 = r9 & 3
                                        r1 = 2
                                        if (r0 != r1) goto L10
                                        boolean r0 = r8.getSkipping()
                                        if (r0 != 0) goto Lc
                                        goto L10
                                    Lc:
                                        r8.skipToGroupEnd()
                                        return
                                    L10:
                                        boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                        if (r0 == 0) goto L1f
                                        r0 = -1
                                        java.lang.String r1 = "com.robinhood.android.iav.ui.PlaidConnectionFragment.processViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PlaidConnectionFragment.kt:185)"
                                        r2 = 2069267472(0x7b568410, float:1.1138301E36)
                                        androidx.compose.runtime.ComposerKt.traceEventStart(r2, r9, r0, r1)
                                    L1f:
                                        com.robinhood.android.iav.ui.PlaidConnectionDuxoVS r9 = r7.$viewState
                                        java.lang.Integer r9 = r9.getDisclosureId()
                                        r0 = 0
                                        if (r9 == 0) goto L53
                                        com.robinhood.android.iav.ui.PlaidConnectionFragment r1 = r7.this$0
                                        com.robinhood.android.iav.ui.PlaidConnectionDuxoVS r2 = r7.$viewState
                                        int r9 = r9.intValue()
                                        android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
                                        r3.<init>()
                                        java.math.BigDecimal r2 = r2.getDisclosureFee()
                                        if (r2 == 0) goto L3f
                                        java.math.BigDecimal r0 = com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0.m822m(r2)
                                    L3f:
                                        java.lang.Object[] r0 = new java.lang.Object[]{r0}
                                        java.lang.String r9 = r1.getString(r9, r0)
                                        r3.append(r9)
                                        android.text.SpannedString r9 = new android.text.SpannedString
                                        r9.<init>(r3)
                                        android.text.SpannableString r0 = android.text.SpannableString.valueOf(r9)
                                    L53:
                                        r1 = r0
                                        r9 = 5004770(0x4c5de2, float:7.013177E-39)
                                        r8.startReplaceGroup(r9)
                                        com.robinhood.android.iav.ui.PlaidConnectionFragment r9 = r7.this$0
                                        boolean r9 = r8.changedInstance(r9)
                                        com.robinhood.android.iav.ui.PlaidConnectionFragment r0 = r7.this$0
                                        java.lang.Object r2 = r8.rememberedValue()
                                        if (r9 != 0) goto L70
                                        androidx.compose.runtime.Composer$Companion r9 = androidx.compose.runtime.Composer.INSTANCE
                                        java.lang.Object r9 = r9.getEmpty()
                                        if (r2 != r9) goto L78
                                    L70:
                                        com.robinhood.android.iav.ui.PlaidConnectionFragment$processViewState$1$1$1$1$$ExternalSyntheticLambda0 r2 = new com.robinhood.android.iav.ui.PlaidConnectionFragment$processViewState$1$1$1$1$$ExternalSyntheticLambda0
                                        r2.<init>(r0)
                                        r8.updateRememberedValue(r2)
                                    L78:
                                        kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                                        r8.endReplaceGroup()
                                        r5 = 0
                                        r6 = 4
                                        r3 = 0
                                        r4 = r8
                                        com.robinhood.android.iav.p154ui.FundYourAccountScreen3.FundYourAccountScreen(r1, r2, r3, r4, r5, r6)
                                        boolean r8 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                        if (r8 == 0) goto L8d
                                        androidx.compose.runtime.ComposerKt.traceEventEnd()
                                    L8d:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.iav.p154ui.PlaidConnectionFragment3.C184951.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$3$lambda$2(PlaidConnectionFragment plaidConnectionFragment) {
                                    plaidConnectionFragment.getDuxo().linkDebitCardClicked();
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i2) {
                                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2054180731, i2, -1, "com.robinhood.android.iav.ui.PlaidConnectionFragment.processViewState.<anonymous>.<anonymous>.<anonymous> (PlaidConnectionFragment.kt:184)");
                                }
                                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(2069267472, true, new AnonymousClass1(plaidConnectionDuxoVS, plaidConnectionFragment), composer2, 54), composer2, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                return;
            }
            if (viewState.getShouldFinishActivity()) {
                requireActivity().finish();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logTap() {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(getEventLogger(), new UserInteractionEventData(UserInteractionEventData.EventType.TAP, new Screen(Screen.Name.DEBIT_CARD_LINKING_SPLASH_SCREEN, null, "backup", null, 10, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), UserInteractionEventData.Action.DEBIT_CARD_LINKING, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PaymentLinkingContext(PaymentLinkingContext.EntryPoint.PLAID_FALLBACK, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -32769, -1, -1, -1, 16383, null), null, null, 96, null), false, false, 6, null);
        }

        private final void logExit() {
            if (getDuxo().getStateFlow().getValue().getPopupWasShown()) {
                logScreenTransition(UserInteractionEventData.EventType.SCREEN_TRANSITION_DISAPPEAR);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logScreenTransition(UserInteractionEventData.EventType eventType) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(getEventLogger(), new UserInteractionEventData(eventType, new Screen(Screen.Name.DEBIT_CARD_LINKING_SPLASH_SCREEN, null, "backup", null, 10, null), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), false, false, 6, null);
        }

        @Override // com.robinhood.android.iav.ui.PlaidSdkFragment.Callbacks
        public void onPlaidIavExited() {
            getDuxo().plaidExited();
        }

        @Override // com.robinhood.android.iav.ui.PlaidCreateIavRelationshipFragment.Callbacks
        public void onPlaidIavRelationshipCreated(AchRelationship achRelationship, CreateIavAccountData createIavAccountData, boolean isGoldBackupBillingMember) {
            Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
            Intrinsics.checkNotNullParameter(createIavAccountData, "createIavAccountData");
            if (((Args) INSTANCE.getArgs((Fragment) this)).getIavSource() == IavSource.ONBOARDING_V2) {
                getCallbacks().onRelationshipCreated(achRelationship, createIavAccountData);
            } else if (isGoldBackupBillingMember) {
                launchGoldNativeFundingUpsell();
            } else {
                getCallbacks().onRelationshipCreated(achRelationship, createIavAccountData);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void launchGoldNativeFundingUpsell() {
            ActivityResultLauncher<Intent> activityResultLauncher = this.goldNativeFundingUpsellAfterPlaidLauncher;
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new GoldNativeFundingUpsellIntentKey(ONBOARDING_PLAID_CONNECTION_SOURCE, true, ((Args) INSTANCE.getArgs((Fragment) this)).getTheme()), null, false, 12, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void launchNormalDepositScreen(String accessToken, IavAccount iavAccount) {
            Navigator navigator = getNavigator();
            TransferDirection transferDirection = TransferDirection.DEPOSIT;
            CreateIavAccountData createIavAccountData = new CreateIavAccountData(accessToken, iavAccount, null);
            Companion companion = INSTANCE;
            Navigator.DefaultImpls.startActivityForResult$default(navigator, (Fragment) this, (IntentKey) new AchTransferIntentKey(new TransferContext.NormalIav(transferDirection, createIavAccountData, null, ((Args) companion.getArgs((Fragment) this)).getRecommendedTransfersAmount(), 4, null), false, getCallbacks().isFromRhfOnboarding(), getCallbacks().getUseAchromaticOverlay(), ((Args) companion.getArgs((Fragment) this)).getTheme(), 2, null), TRANSFER_REQUEST_CODE, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void launchQueuedDeposit(String accessToken, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata) {
            TransferContext.RobinhoodAccountType robinhoodAccountType;
            Companion companion = INSTANCE;
            if (((Args) companion.getArgs((Fragment) this)).getIavSource().getIsQueued()) {
                Navigator navigator = getNavigator();
                CreateIavAccountData createIavAccountData = new CreateIavAccountData(accessToken, iavAccount, null);
                IavSource iavSource = ((Args) companion.getArgs((Fragment) this)).getIavSource();
                BigDecimal recommendedTransfersAmount = ((Args) companion.getArgs((Fragment) this)).getRecommendedTransfersAmount();
                switch (WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) this)).getTransferAccountType().ordinal()]) {
                    case 1:
                        robinhoodAccountType = TransferContext.RobinhoodAccountType.BROKERAGE;
                        break;
                    case 2:
                        robinhoodAccountType = TransferContext.RobinhoodAccountType.SPENDING;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                        throw new IllegalStateException(("Unable to create queued deposit for transferAccountType: " + companion.getArgs((Fragment) this) + ".transferAccountType").toString());
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                Navigator.DefaultImpls.startActivityForResult$default(navigator, (Fragment) this, (IntentKey) new AchTransferIntentKey(new TransferContext.QueuedDeposit(createIavAccountData, iavSource, plaidIavMetadata, recommendedTransfersAmount, robinhoodAccountType), false, getCallbacks().isFromRhfOnboarding(), getCallbacks().getUseAchromaticOverlay(), ((Args) companion.getArgs((Fragment) this)).getTheme(), 2, null), TRANSFER_REQUEST_CODE, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
                return;
            }
            launchCreateIavRelationship(accessToken, iavAccount, plaidIavMetadata, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void launchCreateIavRelationship(String accessToken, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata, boolean isGoldBackupBillingMember) {
            RhAccountType rhAccountType;
            PlaidCreateIavRelationshipFragment.Companion companion = PlaidCreateIavRelationshipFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            switch (WhenMappings.$EnumSwitchMapping$0[((Args) companion2.getArgs((Fragment) this)).getTransferAccountType().ordinal()]) {
                case 1:
                    rhAccountType = RhAccountType.RHS_ACCOUNT;
                    break;
                case 2:
                    rhAccountType = RhAccountType.RHY_ACCOUNT;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    throw new IllegalStateException(("Unable to create ACH relationship for transferAccountType: " + companion2.getArgs((Fragment) this) + ".transferAccountType").toString());
                default:
                    throw new NoWhenBranchMatchedException();
            }
            replaceFragment(companion.newInstance((Parcelable) new PlaidCreateIavRelationshipFragment.Args(accessToken, iavAccount, plaidIavMetadata, rhAccountType, isGoldBackupBillingMember)));
        }

        /* compiled from: PlaidConnectionFragment.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidConnectionFragment$Args;", "Landroid/os/Parcelable;", "iavSource", "Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "recommendedTransfersAmount", "Ljava/math/BigDecimal;", "transferAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "theme", "Lcom/robinhood/models/api/ColorTheme;", "<init>", "(Lcom/robinhood/shared/transfers/contracts/context/IavSource;Ljava/math/BigDecimal;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Lcom/robinhood/models/api/ColorTheme;)V", "getIavSource", "()Lcom/robinhood/shared/transfers/contracts/context/IavSource;", "getRecommendedTransfersAmount", "()Ljava/math/BigDecimal;", "getTransferAccountType", "()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "getTheme", "()Lcom/robinhood/models/api/ColorTheme;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Args implements Parcelable {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Args> CREATOR = new Creator();
            private final IavSource iavSource;
            private final BigDecimal recommendedTransfersAmount;
            private final ColorTheme theme;
            private final ApiTransferAccount.TransferAccountType transferAccountType;

            /* compiled from: PlaidConnectionFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Args> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Args createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Args(IavSource.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), ApiTransferAccount.TransferAccountType.valueOf(parcel.readString()), ColorTheme.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Args[] newArray(int i) {
                    return new Args[i];
                }
            }

            public static /* synthetic */ Args copy$default(Args args, IavSource iavSource, BigDecimal bigDecimal, ApiTransferAccount.TransferAccountType transferAccountType, ColorTheme colorTheme, int i, Object obj) {
                if ((i & 1) != 0) {
                    iavSource = args.iavSource;
                }
                if ((i & 2) != 0) {
                    bigDecimal = args.recommendedTransfersAmount;
                }
                if ((i & 4) != 0) {
                    transferAccountType = args.transferAccountType;
                }
                if ((i & 8) != 0) {
                    colorTheme = args.theme;
                }
                return args.copy(iavSource, bigDecimal, transferAccountType, colorTheme);
            }

            /* renamed from: component1, reason: from getter */
            public final IavSource getIavSource() {
                return this.iavSource;
            }

            /* renamed from: component2, reason: from getter */
            public final BigDecimal getRecommendedTransfersAmount() {
                return this.recommendedTransfersAmount;
            }

            /* renamed from: component3, reason: from getter */
            public final ApiTransferAccount.TransferAccountType getTransferAccountType() {
                return this.transferAccountType;
            }

            /* renamed from: component4, reason: from getter */
            public final ColorTheme getTheme() {
                return this.theme;
            }

            public final Args copy(IavSource iavSource, BigDecimal recommendedTransfersAmount, ApiTransferAccount.TransferAccountType transferAccountType, ColorTheme theme) {
                Intrinsics.checkNotNullParameter(iavSource, "iavSource");
                Intrinsics.checkNotNullParameter(transferAccountType, "transferAccountType");
                Intrinsics.checkNotNullParameter(theme, "theme");
                return new Args(iavSource, recommendedTransfersAmount, transferAccountType, theme);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Args)) {
                    return false;
                }
                Args args = (Args) other;
                return this.iavSource == args.iavSource && Intrinsics.areEqual(this.recommendedTransfersAmount, args.recommendedTransfersAmount) && this.transferAccountType == args.transferAccountType && this.theme == args.theme;
            }

            public int hashCode() {
                int iHashCode = this.iavSource.hashCode() * 31;
                BigDecimal bigDecimal = this.recommendedTransfersAmount;
                return ((((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.transferAccountType.hashCode()) * 31) + this.theme.hashCode();
            }

            public String toString() {
                return "Args(iavSource=" + this.iavSource + ", recommendedTransfersAmount=" + this.recommendedTransfersAmount + ", transferAccountType=" + this.transferAccountType + ", theme=" + this.theme + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.iavSource.name());
                dest.writeSerializable(this.recommendedTransfersAmount);
                dest.writeString(this.transferAccountType.name());
                dest.writeString(this.theme.name());
            }

            public Args(IavSource iavSource, BigDecimal bigDecimal, ApiTransferAccount.TransferAccountType transferAccountType, ColorTheme theme) {
                Intrinsics.checkNotNullParameter(iavSource, "iavSource");
                Intrinsics.checkNotNullParameter(transferAccountType, "transferAccountType");
                Intrinsics.checkNotNullParameter(theme, "theme");
                this.iavSource = iavSource;
                this.recommendedTransfersAmount = bigDecimal;
                this.transferAccountType = transferAccountType;
                this.theme = theme;
            }

            public /* synthetic */ Args(IavSource iavSource, BigDecimal bigDecimal, ApiTransferAccount.TransferAccountType transferAccountType, ColorTheme colorTheme, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(iavSource, (i & 2) != 0 ? null : bigDecimal, transferAccountType, colorTheme);
            }

            public final IavSource getIavSource() {
                return this.iavSource;
            }

            public final BigDecimal getRecommendedTransfersAmount() {
                return this.recommendedTransfersAmount;
            }

            public final ApiTransferAccount.TransferAccountType getTransferAccountType() {
                return this.transferAccountType;
            }

            public final ColorTheme getTheme() {
                return this.theme;
            }
        }

        /* compiled from: PlaidConnectionFragment.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidConnectionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/iav/ui/PlaidConnectionFragment;", "Lcom/robinhood/android/iav/ui/PlaidConnectionFragment$Args;", "<init>", "()V", "ONBOARDING_PLAID_CONNECTION_SOURCE", "", "ACH_REQUEST_CODE", "", "TRANSFER_REQUEST_CODE", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements FragmentWithArgsCompanion<PlaidConnectionFragment, Args> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
            public Args getArgs(PlaidConnectionFragment plaidConnectionFragment) {
                return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, plaidConnectionFragment);
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
            public PlaidConnectionFragment newInstance(Args args) {
                return (PlaidConnectionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
            public void setArgs(PlaidConnectionFragment plaidConnectionFragment, Args args) {
                FragmentWithArgsCompanion.DefaultImpls.setArgs(this, plaidConnectionFragment, args);
            }
        }
    }
