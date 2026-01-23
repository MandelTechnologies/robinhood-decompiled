package com.robinhood.android.transfers.p271ui.p272v2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.gold.GoldPostUpgradeCelebrationFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.engagement.depositincentive.DepositIncentiveBottomSheetFragment;
import com.robinhood.android.lib.transfers.robinhood3ds.ThreeDSHostCallbacks;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.experimental.page.GenericStandardPageKey;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferResult;
import com.robinhood.android.transfers.contracts.TransferSuccessCallbacks;
import com.robinhood.android.transfers.contracts.TransferV2;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.android.transfers.p271ui.max.GoldDepositHookBottomSheetFragment;
import com.robinhood.android.transfers.p271ui.max.UserLeapManagers;
import com.robinhood.android.transfers.p271ui.max.upsell.RecurringFrequencyUpsellFragment;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2Fragment;
import com.robinhood.android.transfers.p271ui.p272v2.extensions.TransferConfigurations2;
import com.robinhood.android.transfers.p271ui.robinhood3ds.ThreeDSWebViewFragment;
import com.robinhood.android.transfers.preference.DirectDepositUpsellExposureCountPref;
import com.robinhood.android.transfers.preference.GoldDepositUpsellExposureCountPref;
import com.robinhood.android.transfers.preference.GoldDepositUpsellExposureResetPref;
import com.robinhood.android.transfers.preference.RecurringDepositUpsellExposureCountPref;
import com.robinhood.android.transfers.preference.RhsRecurringDepositHookExposureCountPref;
import com.robinhood.android.transfers.preference.RhyRecurringDepositHookExposureCountPref;
import com.robinhood.android.transfers.util.ValidateConfigIfDebug;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow3;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.PostTransferActionContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.security.screenprotect.ScreenProtectFlow;
import com.robinhood.security.screenprotect.ScreenProtectManager;
import com.robinhood.shared.posttransfer.C39496R;
import com.robinhood.shared.posttransfer.PostTransferBottomSheetFragment;
import com.robinhood.shared.posttransfer.PostTransfersActionImpressionCapUtil;
import com.robinhood.shared.transfers.contracts.TransferSuccessKey;
import com.robinhood.udf.UiEvent;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.utils.android.BuildConfig;
import com.robinhood.utils.buildconfig.BuildFlavors;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;

/* compiled from: CreateTransferV2Activity.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u007f2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0001\u007fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010[\u001a\u00020S2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0014J\b\u0010^\u001a\u00020SH\u0014J\b\u0010_\u001a\u00020SH\u0016J\u0010\u0010`\u001a\u00020S2\u0006\u0010a\u001a\u00020IH\u0016J\b\u0010b\u001a\u00020SH\u0016J\b\u0010c\u001a\u00020SH\u0016J\u0010\u0010d\u001a\u00020S2\u0006\u0010e\u001a\u00020fH\u0016J\u0010\u0010g\u001a\u00020S2\u0006\u0010e\u001a\u00020fH\u0016J\u001a\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020k2\b\u0010l\u001a\u0004\u0018\u00010]H\u0016J\u001a\u0010m\u001a\u00020i2\u0006\u0010j\u001a\u00020k2\b\u0010l\u001a\u0004\u0018\u00010]H\u0016J\u0010\u0010n\u001a\u00020S2\u0006\u0010o\u001a\u00020kH\u0016J\u0010\u0010p\u001a\u00020S2\u0006\u0010o\u001a\u00020kH\u0016J\u001a\u0010q\u001a\u00020i2\u0006\u0010o\u001a\u00020k2\b\u0010l\u001a\u0004\u0018\u00010]H\u0016J\u001a\u0010r\u001a\u00020i2\u0006\u0010o\u001a\u00020k2\b\u0010l\u001a\u0004\u0018\u00010]H\u0016J\u0012\u0010s\u001a\u00020S2\b\u0010t\u001a\u0004\u0018\u00010uH\u0016J\u0010\u0010v\u001a\u00020S2\u0006\u0010w\u001a\u00020xH\u0016J\t\u0010y\u001a\u00020iH\u0096\u0001R$\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R$\u0010\u0017\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R$\u0010\u001b\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R$\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\u000b\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b'\u0010\u000b\u001a\u0004\b(\u0010\u0010\"\u0004\b)\u0010\u0012R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u00100\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010<\u001a\u00020=8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010B\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR/\u0010J\u001a\u0004\u0018\u00010I2\b\u0010H\u001a\u0004\u0018\u00010I8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010Q\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010RX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010X\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010RX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010U\"\u0004\bZ\u0010WR\u0018\u0010z\u001a\b\u0012\u0004\u0012\u00020|0{X\u0096\u0005¢\u0006\u0006\u001a\u0004\b}\u0010~¨\u0006\u0080\u0001"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Activity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment$OnDismissListener;", "Lcom/robinhood/android/common/ui/BaseDialogFragment$OnDismissListener;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Fragment$Callbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/lib/transfers/robinhood3ds/ThreeDSHostCallbacks;", "Lcom/robinhood/android/transfers/contracts/TransferSuccessCallbacks;", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationFragment$Callbacks;", "<init>", "()V", "rhyRecurringDepositHookExposureCountPref", "Lcom/robinhood/prefs/IntPreference;", "getRhyRecurringDepositHookExposureCountPref$annotations", "getRhyRecurringDepositHookExposureCountPref", "()Lcom/robinhood/prefs/IntPreference;", "setRhyRecurringDepositHookExposureCountPref", "(Lcom/robinhood/prefs/IntPreference;)V", "directDepositUpsellExposureCountPref", "getDirectDepositUpsellExposureCountPref$annotations", "getDirectDepositUpsellExposureCountPref", "setDirectDepositUpsellExposureCountPref", "goldDepositHookExposureCountPref", "getGoldDepositHookExposureCountPref$annotations", "getGoldDepositHookExposureCountPref", "setGoldDepositHookExposureCountPref", "goldDepositUpsellExposureCountPref", "getGoldDepositUpsellExposureCountPref$annotations", "getGoldDepositUpsellExposureCountPref", "setGoldDepositUpsellExposureCountPref", "goldDepositUpsellExposureResetPref", "Lcom/robinhood/prefs/BooleanPreference;", "getGoldDepositUpsellExposureResetPref$annotations", "getGoldDepositUpsellExposureResetPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setGoldDepositUpsellExposureResetPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "recurringDepositUpsellExposureCountPref", "getRecurringDepositUpsellExposureCountPref$annotations", "getRecurringDepositUpsellExposureCountPref", "setRecurringDepositUpsellExposureCountPref", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "getScreenProtectManager", "()Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "setScreenProtectManager", "(Lcom/robinhood/security/screenprotect/ScreenProtectManager;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "getMicrogramComponentFactory", "()Lmicrogram/android/inject/MicrogramComponent$Factory;", "setMicrogramComponentFactory", "(Lmicrogram/android/inject/MicrogramComponent$Factory;)V", "<set-?>", "", "transferSuccessId", "getTransferSuccessId", "()Ljava/lang/String;", "setTransferSuccessId", "(Ljava/lang/String;)V", "transferSuccessId$delegate", "Lkotlin/properties/ReadWriteProperty;", "threeDSCancelationEvent", "Lcom/robinhood/udf/UiEvent;", "", "getThreeDSCancelationEvent", "()Lcom/robinhood/udf/UiEvent;", "setThreeDSCancelationEvent", "(Lcom/robinhood/udf/UiEvent;)V", "threeDSCompletionEvent", "getThreeDSCompletionEvent", "setThreeDSCompletionEvent", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "finish", "onThreeDSRequested", "redirectUrl", "onThreeDsCanceled", "onThreeDSCompleted", "onTransferSuccess", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "onTransferConfirmationComplete", "onPrimaryButtonClicked", "", "dialogId", "", "passthroughArgs", "onSecondaryButtonClicked", "onBottomSheetDismissed", "id", "onDialogDismissed", "onPositiveButtonClicked", "onNegativeButtonClicked", "onGoldUpgradeCelebrationAction", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onShowFragment", "key", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CreateTransferV2Activity extends BaseActivity implements RegionGated, BaseBottomSheetDialogFragment.OnDismissListener, BaseDialogFragment.OnDismissListener, CreateTransferV2Fragment.Callbacks, RhDialogFragment.OnDismissListener, ThreeDSHostCallbacks, TransferSuccessCallbacks, GoldPostUpgradeCelebrationFragment.Callbacks {
    public static final String RECURRING_DEPOSIT_HOOK_ACTION_KEY = "recurringDepositHookAction";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public IntPreference directDepositUpsellExposureCountPref;
    public EventLogger eventLogger;
    public ExperimentsStore experimentsStore;
    public IntPreference goldDepositHookExposureCountPref;
    public IntPreference goldDepositUpsellExposureCountPref;
    public BooleanPreference goldDepositUpsellExposureResetPref;
    public MicrogramComponent.Factory microgramComponentFactory;
    public IntPreference recurringDepositUpsellExposureCountPref;
    public IntPreference rhyRecurringDepositHookExposureCountPref;
    public ScreenProtectManager screenProtectManager;
    private UiEvent<Unit> threeDSCancelationEvent;
    private UiEvent<Unit> threeDSCompletionEvent;

    /* renamed from: transferSuccessId$delegate, reason: from kotlin metadata */
    private final Interfaces3 transferSuccessId;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CreateTransferV2Activity.class, "transferSuccessId", "getTransferSuccessId()Ljava/lang/String;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<Screen> postTransfersScreen$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Activity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CreateTransferV2Activity.postTransfersScreen_delegate$lambda$1();
        }
    });
    private static final Lazy<Component> radHookComponent$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Activity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CreateTransferV2Activity.radHookComponent_delegate$lambda$2();
        }
    });

    @DirectDepositUpsellExposureCountPref
    public static /* synthetic */ void getDirectDepositUpsellExposureCountPref$annotations() {
    }

    @RhsRecurringDepositHookExposureCountPref
    public static /* synthetic */ void getGoldDepositHookExposureCountPref$annotations() {
    }

    @GoldDepositUpsellExposureCountPref
    public static /* synthetic */ void getGoldDepositUpsellExposureCountPref$annotations() {
    }

    @GoldDepositUpsellExposureResetPref
    public static /* synthetic */ void getGoldDepositUpsellExposureResetPref$annotations() {
    }

    @RecurringDepositUpsellExposureCountPref
    public static /* synthetic */ void getRecurringDepositUpsellExposureCountPref$annotations() {
    }

    @RhyRecurringDepositHookExposureCountPref
    public static /* synthetic */ void getRhyRecurringDepositHookExposureCountPref$annotations() {
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public CreateTransferV2Activity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(MoneyMovementsUsRegionGate.INSTANCE);
        this.transferSuccessId = BindSavedState2.savedString(this).provideDelegate(this, $$delegatedProperties[0]);
    }

    public final IntPreference getRhyRecurringDepositHookExposureCountPref() {
        IntPreference intPreference = this.rhyRecurringDepositHookExposureCountPref;
        if (intPreference != null) {
            return intPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyRecurringDepositHookExposureCountPref");
        return null;
    }

    public final void setRhyRecurringDepositHookExposureCountPref(IntPreference intPreference) {
        Intrinsics.checkNotNullParameter(intPreference, "<set-?>");
        this.rhyRecurringDepositHookExposureCountPref = intPreference;
    }

    public final IntPreference getDirectDepositUpsellExposureCountPref() {
        IntPreference intPreference = this.directDepositUpsellExposureCountPref;
        if (intPreference != null) {
            return intPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("directDepositUpsellExposureCountPref");
        return null;
    }

    public final void setDirectDepositUpsellExposureCountPref(IntPreference intPreference) {
        Intrinsics.checkNotNullParameter(intPreference, "<set-?>");
        this.directDepositUpsellExposureCountPref = intPreference;
    }

    public final IntPreference getGoldDepositHookExposureCountPref() {
        IntPreference intPreference = this.goldDepositHookExposureCountPref;
        if (intPreference != null) {
            return intPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goldDepositHookExposureCountPref");
        return null;
    }

    public final void setGoldDepositHookExposureCountPref(IntPreference intPreference) {
        Intrinsics.checkNotNullParameter(intPreference, "<set-?>");
        this.goldDepositHookExposureCountPref = intPreference;
    }

    public final IntPreference getGoldDepositUpsellExposureCountPref() {
        IntPreference intPreference = this.goldDepositUpsellExposureCountPref;
        if (intPreference != null) {
            return intPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goldDepositUpsellExposureCountPref");
        return null;
    }

    public final void setGoldDepositUpsellExposureCountPref(IntPreference intPreference) {
        Intrinsics.checkNotNullParameter(intPreference, "<set-?>");
        this.goldDepositUpsellExposureCountPref = intPreference;
    }

    public final BooleanPreference getGoldDepositUpsellExposureResetPref() {
        BooleanPreference booleanPreference = this.goldDepositUpsellExposureResetPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goldDepositUpsellExposureResetPref");
        return null;
    }

    public final void setGoldDepositUpsellExposureResetPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.goldDepositUpsellExposureResetPref = booleanPreference;
    }

    public final IntPreference getRecurringDepositUpsellExposureCountPref() {
        IntPreference intPreference = this.recurringDepositUpsellExposureCountPref;
        if (intPreference != null) {
            return intPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recurringDepositUpsellExposureCountPref");
        return null;
    }

    public final void setRecurringDepositUpsellExposureCountPref(IntPreference intPreference) {
        Intrinsics.checkNotNullParameter(intPreference, "<set-?>");
        this.recurringDepositUpsellExposureCountPref = intPreference;
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
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

    public final ScreenProtectManager getScreenProtectManager() {
        ScreenProtectManager screenProtectManager = this.screenProtectManager;
        if (screenProtectManager != null) {
            return screenProtectManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screenProtectManager");
        return null;
    }

    public final void setScreenProtectManager(ScreenProtectManager screenProtectManager) {
        Intrinsics.checkNotNullParameter(screenProtectManager, "<set-?>");
        this.screenProtectManager = screenProtectManager;
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    public final MicrogramComponent.Factory getMicrogramComponentFactory() {
        MicrogramComponent.Factory factory = this.microgramComponentFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("microgramComponentFactory");
        return null;
    }

    public final void setMicrogramComponentFactory(MicrogramComponent.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.microgramComponentFactory = factory;
    }

    private final String getTransferSuccessId() {
        return (String) this.transferSuccessId.getValue(this, $$delegatedProperties[0]);
    }

    private final void setTransferSuccessId(String str) {
        this.transferSuccessId.setValue(this, $$delegatedProperties[0], str);
    }

    @Override // com.robinhood.android.lib.transfers.robinhood3ds.ThreeDSHostCallbacks
    public UiEvent<Unit> getThreeDSCancelationEvent() {
        return this.threeDSCancelationEvent;
    }

    @Override // com.robinhood.android.lib.transfers.robinhood3ds.ThreeDSHostCallbacks
    public void setThreeDSCancelationEvent(UiEvent<Unit> uiEvent) {
        this.threeDSCancelationEvent = uiEvent;
    }

    @Override // com.robinhood.android.lib.transfers.robinhood3ds.ThreeDSHostCallbacks
    public UiEvent<Unit> getThreeDSCompletionEvent() {
        return this.threeDSCompletionEvent;
    }

    @Override // com.robinhood.android.lib.transfers.robinhood3ds.ThreeDSHostCallbacks
    public void setThreeDSCompletionEvent(UiEvent<Unit> uiEvent) {
        this.threeDSCompletionEvent = uiEvent;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        ValidateConfigIfDebug.validateConfigIfDebug(((TransferV2) companion.getExtras((Activity) this)).getTransferConfiguration());
        ScarletManager2.getScarletManager(this).putOverlay(TransferConfigurations2.getMappedScarletOverlay(((TransferV2) companion.getExtras((Activity) this)).getTransferConfiguration()), Boolean.FALSE);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, CreateTransferV2Fragment.INSTANCE.newInstance(companion.getExtras((Activity) this)));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        if (Intrinsics.areEqual(BuildConfig.FLAVOR, BuildFlavors.EXTERNAL)) {
            ScreenProtectManager screenProtectManager = getScreenProtectManager();
            screenProtectManager.blockScreenSharing(this, ScreenProtectFlow.CREATE_TRANSFER);
            screenProtectManager.setFlagSecure(this);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, android.app.Activity
    public void finish() {
        String transferSuccessId = getTransferSuccessId();
        NavigationActivityResultContract3.setResult(this, transferSuccessId != null ? new TransferResult.Completed(transferSuccessId) : TransferResult.Canceled.INSTANCE);
        super.finish();
    }

    @Override // com.robinhood.android.lib.transfers.robinhood3ds.ThreeDSHostCallbacks
    public void onThreeDSRequested(String redirectUrl) {
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        replaceFragment(ThreeDSWebViewFragment.INSTANCE.newInstance((Parcelable) new ThreeDSWebViewFragment.Args(redirectUrl)));
    }

    @Override // com.robinhood.android.lib.transfers.robinhood3ds.ThreeDSHostCallbacks
    public void onThreeDsCanceled() {
        setThreeDSCancelationEvent(new UiEvent<>(Unit.INSTANCE));
        popLastFragment();
    }

    @Override // com.robinhood.android.lib.transfers.robinhood3ds.ThreeDSHostCallbacks
    public void onThreeDSCompleted() {
        setThreeDSCompletionEvent(new UiEvent<>(Unit.INSTANCE));
        popLastFragment();
    }

    @Override // com.robinhood.android.lib.transfers.CreateTransferCallbacks
    public void onTransferSuccess(PostTransferFlow postTransferFlow) {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        setTransferSuccessId(postTransferFlow.getTransferId());
        if (!postTransferFlow.getPostTransferPages().isEmpty()) {
            if (postTransferFlow.getPostTransferPagesAction() instanceof PostTransferFlow3.ShowGoldUpsellPage) {
                PostTransfersActionImpressionCapUtil.resetPostTransfersGoldUpsellImpressionCapIfNeeded(this, getExperimentsStore(), getEventLogger(), getGoldDepositUpsellExposureCountPref(), getGoldDepositUpsellExposureResetPref());
            }
            replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new TransferSuccessKey(postTransferFlow, null, 2, null), null, 2, null));
            return;
        }
        finish();
    }

    @Override // com.robinhood.android.transfers.contracts.TransferSuccessCallbacks
    public void onTransferConfirmationComplete(PostTransferFlow postTransferFlow) {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        TransferConfiguration transferConfiguration = ((TransferV2) INSTANCE.getExtras((Activity) this)).getTransferConfiguration();
        if (transferConfiguration.getSkipPostTransferAction()) {
            UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(getUserLeapManager(), this, transferConfiguration.getEntryPoint());
            finish();
        } else {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C311141(postTransferFlow.getPostTransferPagesAction(), this, postTransferFlow, transferConfiguration, null), 3, null);
        }
    }

    /* compiled from: CreateTransferV2Activity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Activity$onTransferConfirmationComplete$1", m3645f = "CreateTransferV2Activity.kt", m3646l = {EnumC7081g.f2775xbcb7e6f3}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Activity$onTransferConfirmationComplete$1 */
    static final class C311141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PostTransferFlow3 $action;
        final /* synthetic */ PostTransferFlow $postTransferFlow;
        final /* synthetic */ TransferConfiguration $transferConfiguration;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CreateTransferV2Activity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C311141(PostTransferFlow3 postTransferFlow3, CreateTransferV2Activity createTransferV2Activity, PostTransferFlow postTransferFlow, TransferConfiguration transferConfiguration, Continuation<? super C311141> continuation) {
            super(2, continuation);
            this.$action = postTransferFlow3;
            this.this$0 = createTransferV2Activity;
            this.$postTransferFlow = postTransferFlow;
            this.$transferConfiguration = transferConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C311141 c311141 = new C311141(this.$action, this.this$0, this.$postTransferFlow, this.$transferConfiguration, continuation);
            c311141.L$0 = obj;
            return c311141;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C311141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objCheckPostTransfersGoldUpsellPageImpression;
            PostTransferFlow3 postTransferFlow3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                PostTransferFlow3 postTransferFlow32 = this.$action;
                if (postTransferFlow32 instanceof PostTransferFlow3.HandleDeeplink) {
                    Navigator.DefaultImpls.handleDeepLink$default(this.this$0.getNavigator(), this.this$0, Uri.parse(((PostTransferFlow3.HandleDeeplink) this.$action).getDeeplink()), null, null, false, null, 60, null);
                } else if (postTransferFlow32 instanceof PostTransferFlow3.ShowInstantInfo) {
                    Navigator.DefaultImpls.startActivity$default(this.this$0.getNavigator(), this.this$0, new LegacyIntentKey.PostDepositInstantInfo(this.$postTransferFlow.getTransferId()), null, false, null, null, 60, null);
                } else {
                    if (postTransferFlow32 instanceof PostTransferFlow3.ShowRhyRecurringDepositHook) {
                        int i2 = this.this$0.getRhyRecurringDepositHookExposureCountPref().get();
                        if ((this.$transferConfiguration instanceof TransferConfiguration.Standard) && i2 < 3) {
                            this.this$0.getRhyRecurringDepositHookExposureCountPref().set(i2 + 1);
                            EventLogger.DefaultImpls.logAppear$default(this.this$0.getEventLogger(), null, new Screen(Screen.Name.POST_TRANSFER_CONFIRMATION, null, null, null, 14, null), new Component(Component.ComponentType.RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PostTransferActionContext(PostTransferActionContext.PostTransferActionType.RHY_RECURRING_UPSELL, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -65537, -1, -1, 16383, null), 9, null);
                            RhBottomSheetDialogFragment.Companion companion = RhBottomSheetDialogFragment.INSTANCE;
                            int i3 = C30065R.id.dialog_id_rhy_recurring_deposit_hook;
                            String string2 = this.this$0.getString(C30065R.string.updated_recurring_deposit_hook_dialog_title);
                            String string3 = this.this$0.getString(C30065R.string.rhy_recurring_deposit_hook_dialog_message);
                            String string4 = this.this$0.getString(C30383R.string.ach_transfer_automatic_deposit_interval_title);
                            String string5 = this.this$0.getString(C11048R.string.general_label_dismiss);
                            Integer numBoxInt = boxing.boxInt(C20690R.drawable.pict_mono_rds_recurring);
                            Bundle bundle = new Bundle();
                            bundle.putParcelable(CreateTransferV2Activity.RECURRING_DEPOSIT_HOOK_ACTION_KEY, this.$action);
                            Unit unit = Unit.INSTANCE;
                            RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) companion.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(i3, string2, null, string3, null, string4, null, string5, numBoxInt, false, false, null, bundle, null, false, true, false, false, null, null, null, 2059860, null));
                            FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                            rhBottomSheetDialogFragment.show(supportFragmentManager, "rhyRecurringDepositHook");
                        }
                        UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(this.this$0.getUserLeapManager(), this.this$0, this.$transferConfiguration.getEntryPoint());
                        this.this$0.finish();
                    } else if (postTransferFlow32 instanceof PostTransferFlow3.ShowDirectDepositUpsell) {
                        int i4 = this.this$0.getDirectDepositUpsellExposureCountPref().get();
                        if (i4 < 3) {
                            this.this$0.getDirectDepositUpsellExposureCountPref().set(i4 + 1);
                            PostTransferBottomSheetFragment postTransferBottomSheetFragment = (PostTransferBottomSheetFragment) PostTransferBottomSheetFragment.INSTANCE.newInstance((Parcelable) this.$action);
                            FragmentManager supportFragmentManager2 = this.this$0.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                            postTransferBottomSheetFragment.show(supportFragmentManager2, "directDepositUpsell");
                        }
                        UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(this.this$0.getUserLeapManager(), this.this$0, this.$transferConfiguration.getEntryPoint());
                        this.this$0.finish();
                    } else if (postTransferFlow32 instanceof PostTransferFlow3.ShowGoldUpsellHook) {
                        int i5 = this.this$0.getGoldDepositHookExposureCountPref().get();
                        if (i5 < 3) {
                            this.this$0.getGoldDepositHookExposureCountPref().set(i5 + 1);
                            GoldDepositHookBottomSheetFragment goldDepositHookBottomSheetFragment = (GoldDepositHookBottomSheetFragment) GoldDepositHookBottomSheetFragment.INSTANCE.newInstance((Parcelable) new GoldDepositHookBottomSheetFragment.Args(((PostTransferFlow3.ShowGoldUpsellHook) this.$action).getSduiAlertAction().getAlert()));
                            FragmentManager supportFragmentManager3 = this.this$0.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
                            goldDepositHookBottomSheetFragment.show(supportFragmentManager3, "goldDepositHookUpsell");
                        }
                        UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(this.this$0.getUserLeapManager(), this.this$0, this.$transferConfiguration.getEntryPoint());
                        this.this$0.finish();
                    } else if (postTransferFlow32 instanceof PostTransferFlow3.ShowRecurringDepositUpsell) {
                        int i6 = this.this$0.getRecurringDepositUpsellExposureCountPref().get();
                        if (i6 < 3) {
                            this.this$0.getRecurringDepositUpsellExposureCountPref().set(i6 + 1);
                            this.this$0.replaceFragment(RecurringFrequencyUpsellFragment.INSTANCE.newInstance(((PostTransferFlow3.ShowRecurringDepositUpsell) this.$action).getTransferAmount(), ((PostTransferFlow3.ShowRecurringDepositUpsell) this.$action).getAchRelationshipId(), ((PostTransferFlow3.ShowRecurringDepositUpsell) this.$action).getRhsAccountNumber(), ((PostTransferFlow3.ShowRecurringDepositUpsell) this.$action).getSinkAccountType()));
                        }
                        UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(this.this$0.getUserLeapManager(), this.this$0, this.$transferConfiguration.getEntryPoint());
                        this.this$0.finish();
                    } else if (postTransferFlow32 instanceof PostTransferFlow3.ShowGoldUpsellPage) {
                        MicrogramComponent microgramComponentCreate$default = MicrogramComponent.Factory.DefaultImpls.create$default(this.this$0.getMicrogramComponentFactory(), coroutineScope, new RemoteMicrogramApplication("app-resurrection-lifetime-improvements", null, 2, null), null, 4, null);
                        CreateTransferV2Activity createTransferV2Activity = this.this$0;
                        ExperimentsStore experimentsStore = createTransferV2Activity.getExperimentsStore();
                        EventLogger eventLogger = this.this$0.getEventLogger();
                        IntPreference goldDepositUpsellExposureCountPref = this.this$0.getGoldDepositUpsellExposureCountPref();
                        PostTransferFlow3.ShowGoldUpsellPage showGoldUpsellPage = (PostTransferFlow3.ShowGoldUpsellPage) this.$action;
                        this.label = 1;
                        objCheckPostTransfersGoldUpsellPageImpression = PostTransfersActionImpressionCapUtil.checkPostTransfersGoldUpsellPageImpression(createTransferV2Activity, experimentsStore, eventLogger, goldDepositUpsellExposureCountPref, showGoldUpsellPage, microgramComponentCreate$default, this);
                        if (objCheckPostTransfersGoldUpsellPageImpression == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (postTransferFlow32 instanceof PostTransferFlow3.ShowDepositIncentiveUpsell) {
                        DepositIncentiveBottomSheetFragment depositIncentiveBottomSheetFragment = (DepositIncentiveBottomSheetFragment) DepositIncentiveBottomSheetFragment.INSTANCE.newInstance((Parcelable) new DepositIncentiveBottomSheetFragment.Args(((PostTransferFlow3.ShowDepositIncentiveUpsell) this.$action).getSduiAlertAction().getAlert()));
                        FragmentManager supportFragmentManager4 = this.this$0.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "getSupportFragmentManager(...)");
                        depositIncentiveBottomSheetFragment.show(supportFragmentManager4, "depositIncentiveUpsell");
                    } else if (!Intrinsics.areEqual(postTransferFlow32, PostTransferFlow3.Unknown.INSTANCE) && postTransferFlow32 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.INSTANCE;
                }
                postTransferFlow3 = this.$action;
                if (postTransferFlow3 != null || postTransferFlow3.finishAfterTriggering()) {
                    UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(this.this$0.getUserLeapManager(), this.this$0, this.$transferConfiguration.getEntryPoint());
                    this.this$0.finish();
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objCheckPostTransfersGoldUpsellPageImpression = obj;
            if (((Boolean) objCheckPostTransfersGoldUpsellPageImpression).booleanValue()) {
                Navigator.DefaultImpls.showFragment$default(this.this$0.getNavigator(), this.this$0, new GenericStandardPageKey(((PostTransferFlow3.ShowGoldUpsellPage) this.$action).getSduiGenericPage()), false, false, false, null, false, null, false, false, null, null, 4092, null);
                postTransferFlow3 = this.$action;
                if (postTransferFlow3 != null) {
                }
                return Unit.INSTANCE;
            }
            UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(this.this$0.getUserLeapManager(), this.this$0, this.$transferConfiguration.getEntryPoint());
            this.this$0.finish();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onPrimaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        if (dialogId != C30065R.id.dialog_id_rhy_recurring_deposit_hook) {
            return super.onPrimaryButtonClicked(dialogId, passthroughArgs);
        }
        if (passthroughArgs == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Parcelable parcelable = passthroughArgs.getParcelable(RECURRING_DEPOSIT_HOOK_ACTION_KEY);
        if (parcelable != null) {
            final PostTransferFlow3.ShowRhyRecurringDepositHook showRhyRecurringDepositHook = (PostTransferFlow3.ShowRhyRecurringDepositHook) parcelable;
            EventLogger eventLogger = getEventLogger();
            UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
            Companion companion = INSTANCE;
            EventLogger.DefaultImpls.logTap$default(eventLogger, action, companion.getPostTransfersScreen$feature_transfers_externalRelease(), companion.getRadHookComponent$feature_transfers_externalRelease(), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PostTransferActionContext(PostTransferActionContext.PostTransferActionType.RHY_RECURRING_UPSELL, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -65537, -1, -1, 16383, null), false, 40, null);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Activity.onPrimaryButtonClicked.1
                @Override // java.lang.Runnable
                public final void run() {
                    Navigator.DefaultImpls.startActivity$default(CreateTransferV2Activity.this.getNavigator(), CreateTransferV2Activity.this, new Transfer(new TransferConfiguration.RadHook(showRhyRecurringDepositHook.getTransferAmount(), showRhyRecurringDepositHook.getAchRelationshipId(), showRhyRecurringDepositHook.getSinkAccountType(), MAXTransferContext.EntryPoint.RHY_RECURRING_UPSELL)), null, false, null, null, 60, null);
                }
            });
            finish();
            return true;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onSecondaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        if (dialogId == C30065R.id.dialog_id_rhy_recurring_deposit_hook) {
            EventLogger eventLogger = getEventLogger();
            UserInteractionEventData.Action action = UserInteractionEventData.Action.DISMISS;
            Companion companion = INSTANCE;
            EventLogger.DefaultImpls.logTap$default(eventLogger, action, companion.getPostTransfersScreen$feature_transfers_externalRelease(), companion.getRadHookComponent$feature_transfers_externalRelease(), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PostTransferActionContext(PostTransferActionContext.PostTransferActionType.RHY_RECURRING_UPSELL, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -65537, -1, -1, 16383, null), false, 40, null);
            UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(getUserLeapManager(), this, ((TransferV2) companion.getExtras((Activity) this)).getTransferConfiguration().getEntryPoint());
            finish();
            return true;
        }
        return super.onSecondaryButtonClicked(dialogId, passthroughArgs);
    }

    @Override // com.robinhood.android.common.ui.BaseBottomSheetDialogFragment.OnDismissListener
    public void onBottomSheetDismissed(int id) {
        if (id == C30065R.id.dialog_id_rhy_recurring_deposit_hook) {
            finish();
        }
    }

    @Override // com.robinhood.android.common.ui.BaseDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C9631R.id.dialog_id_deactivated_account || id == C39496R.id.dialog_id_post_transfer) {
            UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(getUserLeapManager(), this, ((TransferV2) INSTANCE.getExtras((Activity) this)).getTransferConfiguration().getEntryPoint());
            finish();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C9631R.id.dialog_id_deactivated_account) {
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

    @Override // com.robinhood.android.common.gold.GoldPostUpgradeCelebrationFragment.Callbacks
    public void onGoldUpgradeCelebrationAction(GenericAction action) {
        if (action instanceof GenericAction.Deeplink) {
            Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
            finish();
        } else {
            if (!(action instanceof GenericAction.Dismiss) && !(action instanceof GenericAction.InfoAlert) && action != null) {
                throw new NoWhenBranchMatchedException();
            }
            finish();
        }
    }

    @Override // com.robinhood.android.transfers.ui.v2.CreateTransferV2Fragment.Callbacks
    public void onShowFragment(FragmentKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), key, null, 2, null));
    }

    /* compiled from: CreateTransferV2Activity.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Activity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Activity;", "Lcom/robinhood/android/transfers/contracts/TransferV2;", "<init>", "()V", "RECURRING_DEPOSIT_HOOK_ACTION_KEY", "", "postTransfersScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getPostTransfersScreen$feature_transfers_externalRelease", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "postTransfersScreen$delegate", "Lkotlin/Lazy;", "radHookComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getRadHookComponent$feature_transfers_externalRelease", "()Lcom/robinhood/rosetta/eventlogging/Component;", "radHookComponent$delegate", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<CreateTransferV2Activity, TransferV2> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public TransferV2 getExtras(CreateTransferV2Activity createTransferV2Activity) {
            return (TransferV2) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, createTransferV2Activity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(android.content.Context context, TransferV2 transferV2) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, transferV2);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(android.content.Context context, TransferV2 transferV2) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, transferV2);
        }

        public final Screen getPostTransfersScreen$feature_transfers_externalRelease() {
            return (Screen) CreateTransferV2Activity.postTransfersScreen$delegate.getValue();
        }

        public final Component getRadHookComponent$feature_transfers_externalRelease() {
            return (Component) CreateTransferV2Activity.radHookComponent$delegate.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen postTransfersScreen_delegate$lambda$1() {
        return new Screen(Screen.Name.POST_TRANSFER_CONFIRMATION, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Component radHookComponent_delegate$lambda$2() {
        return new Component(Component.ComponentType.RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG, null, null, 6, null);
    }
}
