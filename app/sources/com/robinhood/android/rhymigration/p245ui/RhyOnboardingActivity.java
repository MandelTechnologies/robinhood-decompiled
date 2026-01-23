package com.robinhood.android.rhymigration.p245ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.WindowInsets;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.mcduckling.prefs.RhyMigrationCmSunsetLastTime;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.rhymigration.p086ui.callbacks.RhyConfirmAddressCallbacks;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.googlepay.GooglePayPushTokenizeManager;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.android.rhymigration.model.UiRhyMigration;
import com.robinhood.android.rhymigration.model.UiRhyMigrationCardPage;
import com.robinhood.android.rhymigration.model.UiRhyMigrationCmShutdown;
import com.robinhood.android.rhymigration.model.UiRhyMigrationContrastPage;
import com.robinhood.android.rhymigration.model.UiRhyMigrationFeaturePage;
import com.robinhood.android.rhymigration.model.UiRhyMigrationLoadingAnimation;
import com.robinhood.android.rhymigration.model.UiRhyMigrationReviewPage;
import com.robinhood.android.rhymigration.p245ui.RhyOnboardingLoadingFragment;
import com.robinhood.android.rhymigration.p245ui.agreements.RhyAgreementFragment;
import com.robinhood.android.rhymigration.p245ui.card.RhyCardFragment;
import com.robinhood.android.rhymigration.p245ui.close.RhyCloseAccountFragment;
import com.robinhood.android.rhymigration.p245ui.directdeposit.RhyAddToWalletFragment;
import com.robinhood.android.rhymigration.p245ui.directdeposit.RhyDirectDepositFragment;
import com.robinhood.android.rhymigration.p245ui.funding.RhyAccountFundedFinishFragment;
import com.robinhood.android.rhymigration.p245ui.funding.RhyAccountFundingFragment;
import com.robinhood.android.rhymigration.p245ui.intro.RhyFeatureIntroFragment;
import com.robinhood.android.rhymigration.p245ui.intro.RhyIntroFragmentV2;
import com.robinhood.android.rhymigration.p245ui.intro.RhyIntroParentFragment;
import com.robinhood.android.rhymigration.p245ui.openaccount.RhyOpenAccountFragment;
import com.robinhood.android.rhymigration.p245ui.openaccount.RhyOpenAccountTimeoutBottomSheet;
import com.robinhood.android.rhymigration.p245ui.review.RhyReviewChangesFragment;
import com.robinhood.android.transfers.contracts.DirectDepositShimKey;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferContract;
import com.robinhood.android.transfers.contracts.TransferResult;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.CmSunsetExperiment4;
import com.robinhood.librobinhood.data.prefs.RhyCmSunsetOptedOut;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.models.api.minerva.RhyMigrationVariables;
import com.robinhood.models.api.minerva.VerificationRequiredException;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p355ui.identi.ShippingAddress;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.LongPreference;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.security.screenprotect.ScreenProtectFlow;
import com.robinhood.security.screenprotect.ScreenProtectManager;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import p479j$.time.Instant;

/* compiled from: RhyOnboardingActivity.kt */
@Metadata(m3635d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ¬\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u0012:\u0002¬\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010Z\u001a\u00020V2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0014J\b\u0010]\u001a\u00020VH\u0016J\u0010\u0010^\u001a\u00020V2\u0006\u0010_\u001a\u00020`H\u0002J\u0018\u0010a\u001a\u00020V2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010b\u001a\u00020UH\u0016J\u0010\u0010c\u001a\u00020V2\u0006\u0010d\u001a\u00020eH\u0016J\b\u0010f\u001a\u00020VH\u0016J\b\u0010g\u001a\u00020VH\u0016J\b\u0010h\u001a\u00020VH\u0016J\b\u0010i\u001a\u00020VH\u0016J\b\u0010j\u001a\u00020VH\u0016J\u0010\u0010k\u001a\u00020V2\u0006\u0010l\u001a\u00020mH\u0016J\u0010\u0010n\u001a\u00020V2\u0006\u0010d\u001a\u00020eH\u0016J\u0010\u0010o\u001a\u00020V2\u0006\u0010d\u001a\u00020eH\u0016J\u0010\u0010p\u001a\u00020V2\u0006\u0010q\u001a\u00020UH\u0016J\b\u0010r\u001a\u00020VH\u0016J\u0010\u0010s\u001a\u00020V2\u0006\u0010t\u001a\u00020eH\u0016J\u0012\u0010u\u001a\u00020V2\b\u0010v\u001a\u0004\u0018\u00010wH\u0016J\u0010\u0010x\u001a\u00020V2\u0006\u0010t\u001a\u00020eH\u0016J\b\u0010y\u001a\u00020VH\u0016J\b\u0010z\u001a\u00020VH\u0016J\b\u0010{\u001a\u00020VH\u0016J\b\u0010|\u001a\u00020VH\u0016J\b\u0010}\u001a\u00020VH\u0016J\u0011\u0010~\u001a\u00020V2\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0016J\t\u0010\u0081\u0001\u001a\u00020VH\u0016J\t\u0010\u0082\u0001\u001a\u00020VH\u0016J\t\u0010\u0083\u0001\u001a\u00020VH\u0016J\t\u0010\u0084\u0001\u001a\u00020VH\u0016J\u0013\u0010\u0085\u0001\u001a\u00020V2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0016J\u0013\u0010\u0088\u0001\u001a\u00020V2\b\u0010\u0089\u0001\u001a\u00030\u0087\u0001H\u0016J\u0014\u0010\u009e\u0001\u001a\u00030\u009f\u00012\b\u0010 \u0001\u001a\u00030\u0087\u0001H\u0016J\t\u0010¡\u0001\u001a\u00020\u0016H\u0002J\u001d\u0010¢\u0001\u001a\u00020V2\u0006\u0010d\u001a\u00020e2\n\b\u0003\u0010£\u0001\u001a\u00030\u0087\u0001H\u0002J\t\u0010¤\u0001\u001a\u00020VH\u0002J\t\u0010¥\u0001\u001a\u00020VH\u0002J\n\u0010¦\u0001\u001a\u00020UH\u0096\u0001R/\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u001e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001d\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R/\u0010%\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u001d\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\u001e\u0010/\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00105\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010;\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001e\u0010A\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001e\u0010G\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u000e\u0010M\u001a\u00020NX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010O\u001a\b\u0012\u0004\u0012\u00020Q0PX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010R\u001a\u0014\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020V0SX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0X0PX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u008a\u0001\u001a\u00030\u008b\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008f\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0093\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0097\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u009b\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001d\u0010§\u0001\u001a\n\u0012\u0005\u0012\u00030©\u00010¨\u0001X\u0096\u0005¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001¨\u0006\u00ad\u0001"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/rhymigration/ui/PageDataCallbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingLoadingFragment$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroParentFragment$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroFragmentV2$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/review/RhyReviewChangesFragment$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/card/RhyCardFragment$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/agreements/RhyAgreementFragment$Callbacks;", "Lcom/robinhood/android/common/rhymigration/ui/callbacks/RhyConfirmAddressCallbacks;", "Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountFragment$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/close/RhyCloseAccountFragment$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/funding/RhyAccountFundingFragment$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/funding/RhyAccountFundedFinishFragment$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/directdeposit/RhyDirectDepositFragment$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/directdeposit/RhyAddToWalletFragment$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/openaccount/RhyOpenAccountTimeoutBottomSheet$Callbacks;", "<init>", "()V", "<set-?>", "Lcom/robinhood/android/rhymigration/model/UiRhyMigration;", "rhyMigration", "getRhyMigration", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigration;", "setRhyMigration", "(Lcom/robinhood/android/rhymigration/model/UiRhyMigration;)V", "rhyMigration$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "cardSelectionProductTag", "getCardSelectionProductTag$feature_rhy_migration_externalDebug", "()Ljava/lang/String;", "setCardSelectionProductTag$feature_rhy_migration_externalDebug", "(Ljava/lang/String;)V", "cardSelectionProductTag$delegate", "source", "getSource$feature_rhy_migration_externalDebug", "setSource$feature_rhy_migration_externalDebug", "source$delegate", "duxo", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingDuxo;", "getDuxo", "()Lcom/robinhood/android/rhymigration/ui/RhyOnboardingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "rhyCmSunsetOptedOut", "Lcom/robinhood/prefs/BooleanPreference;", "getRhyCmSunsetOptedOut", "()Lcom/robinhood/prefs/BooleanPreference;", "setRhyCmSunsetOptedOut", "(Lcom/robinhood/prefs/BooleanPreference;)V", "rhyMigrationCmSunsetLastTimePref", "Lcom/robinhood/prefs/LongPreference;", "getRhyMigrationCmSunsetLastTimePref", "()Lcom/robinhood/prefs/LongPreference;", "setRhyMigrationCmSunsetLastTimePref", "(Lcom/robinhood/prefs/LongPreference;)V", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "getTargetBackend", "()Lcom/robinhood/targetbackend/TargetBackend;", "setTargetBackend", "(Lcom/robinhood/targetbackend/TargetBackend;)V", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "getRhyGlobalLoggingContext", "()Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "setRhyGlobalLoggingContext", "(Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;)V", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "getScreenProtectManager", "()Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "setScreenProtectManager", "(Lcom/robinhood/security/screenprotect/ScreenProtectManager;)V", "googlePayPushTokenizeManager", "Lcom/robinhood/android/googlepay/GooglePayPushTokenizeManager;", "rewardsEnrollmentLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "", "transferFundsLauncher", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/transfers/contracts/Transfer;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "bind", "state", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingViewState;", "onPrefetchSuccess", "isCmSunset", "onPrefetchFailure", "throwable", "", "onReviewChangesClicked", "onReviewChangesContinueClicked", "onOptOutClicked", "onShutdownAccountClicked", "onUpgradeClicked", "onCardSelected", "rhyCardPreference", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore$RhyCardPreference;", "onCardSelectedError", "onAgreementError", "onFirstAgreementAccepted", "isLastAgreement", "onApplicationSubmitted", "onApplicationSubmissionError", "error", "onAddressConfirmed", "shippingAddress", "Lcom/robinhood/models/ui/identi/ShippingAddress;", "onAddressError", "onOpenAccountCanceled", "onOpenAccountSetupRewardsClicked", "onOpenAccountSkipRewardsClicked", "onOpenAccountTimeoutExit", "onTransferSkipClicked", "onTransferFundingAmountClicked", "amount", "Ljava/math/BigDecimal;", "onFundingFinishedContinueClicked", "onDirectDepositContinueClicked", "onMobileWalletAddFinished", "onMobileWalletAddSkipped", "onValuePropClicked", "valPropModelIndex", "", "onDialogDismissed", "id", "contrastPage", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationContrastPage;", "getContrastPage", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationContrastPage;", "cardPage", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCardPage;", "getCardPage", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCardPage;", "reviewPage", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationReviewPage;", "getReviewPage", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationReviewPage;", "animation", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationLoadingAnimation;", "getAnimation", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationLoadingAnimation;", "variables", "Lcom/robinhood/models/api/minerva/RhyMigrationVariables;", "getVariables", "()Lcom/robinhood/models/api/minerva/RhyMigrationVariables;", "getFeaturePage", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationFeaturePage;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "requireRhyMigration", "handleError", "errorDialogId", "startDirectDepositSetupAndFinish", "finishWithDeepLinkOverride", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyOnboardingActivity extends BaseActivity implements RegionGated, PageDataCallbacks, RhDialogFragment.OnDismissListener, RhyOnboardingLoadingFragment.Callbacks, RhyIntroParentFragment.Callbacks, RhyIntroFragmentV2.Callbacks, RhyReviewChangesFragment.Callbacks, RhyCardFragment.Callbacks, RhyAgreementFragment.Callbacks, RhyConfirmAddressCallbacks, RhyOpenAccountFragment.Callbacks, RhyCloseAccountFragment.Callbacks, RhyAccountFundingFragment.Callbacks, RhyAccountFundedFinishFragment.Callbacks, RhyDirectDepositFragment.Callbacks, RhyAddToWalletFragment.Callbacks, RhyOpenAccountTimeoutBottomSheet.Callbacks {
    private static final int REQUEST_PUSH_TOKENIZE = 19;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: cardSelectionProductTag$delegate, reason: from kotlin metadata */
    private final Interfaces3 cardSelectionProductTag;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final GooglePayPushTokenizeManager googlePayPushTokenizeManager;
    private final Function2<UUID, Boolean, Unit> launchSuv;
    private final ActivityResultLauncher<Intent> rewardsEnrollmentLauncher;

    @RhyCmSunsetOptedOut
    public BooleanPreference rhyCmSunsetOptedOut;
    public RhyGlobalLoggingContext rhyGlobalLoggingContext;

    /* renamed from: rhyMigration$delegate, reason: from kotlin metadata */
    private final Interfaces3 rhyMigration;

    @RhyMigrationCmSunsetLastTime
    public LongPreference rhyMigrationCmSunsetLastTimePref;
    public ScreenProtectManager screenProtectManager;

    /* renamed from: source$delegate, reason: from kotlin metadata */
    private final Interfaces3 source;
    public TargetBackend targetBackend;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<Transfer>> transferFundsLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RhyOnboardingActivity.class, "rhyMigration", "getRhyMigration()Lcom/robinhood/android/rhymigration/model/UiRhyMigration;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RhyOnboardingActivity.class, "cardSelectionProductTag", "getCardSelectionProductTag$feature_rhy_migration_externalDebug()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RhyOnboardingActivity.class, "source", "getSource$feature_rhy_migration_externalDebug()Ljava/lang/String;", 0))};

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

    public RhyOnboardingActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        Interfaces interfacesSavedParcelable = BindSavedState2.savedParcelable(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.rhyMigration = (Interfaces3) interfacesSavedParcelable.provideDelegate(this, kPropertyArr[0]);
        this.cardSelectionProductTag = BindSavedState2.savedString(this, "").provideDelegate(this, kPropertyArr[1]);
        this.source = BindSavedState2.savedString(this).provideDelegate(this, kPropertyArr[2]);
        this.duxo = OldDuxos.oldDuxo(this, RhyOnboardingDuxo.class);
        this.googlePayPushTokenizeManager = new GooglePayPushTokenizeManager();
        this.rewardsEnrollmentLauncher = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$rewardsEnrollmentLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.startDirectDepositSetupAndFinish();
                }
            }
        });
        this.launchSuv = SuvLauncher.registerSuvLauncher$default(this, new Function0() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, new Function0() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyOnboardingActivity.launchSuv$lambda$1(this.f$0);
            }
        }, (Function0) null, 4, (Object) null);
        this.transferFundsLauncher = registerForActivityResult(new TransferContract(new Function0() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$transferFundsLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(TransferResult transferResult) {
                if (transferResult instanceof TransferResult.Completed) {
                    this.this$0.replaceFragment(RhyAccountFundedFinishFragment.INSTANCE.newInstance((Parcelable) new RhyAccountFundedFinishFragment.Args(false)));
                } else if (transferResult instanceof TransferResult.Canceled) {
                    this.this$0.replaceFragment(RhyAccountFundedFinishFragment.INSTANCE.newInstance((Parcelable) new RhyAccountFundedFinishFragment.Args(true)));
                }
            }
        });
    }

    private final UiRhyMigration getRhyMigration() {
        return (UiRhyMigration) this.rhyMigration.getValue(this, $$delegatedProperties[0]);
    }

    private final void setRhyMigration(UiRhyMigration uiRhyMigration) {
        this.rhyMigration.setValue(this, $$delegatedProperties[0], uiRhyMigration);
    }

    public final String getCardSelectionProductTag$feature_rhy_migration_externalDebug() {
        return (String) this.cardSelectionProductTag.getValue(this, $$delegatedProperties[1]);
    }

    public final void setCardSelectionProductTag$feature_rhy_migration_externalDebug(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cardSelectionProductTag.setValue(this, $$delegatedProperties[1], str);
    }

    public final String getSource$feature_rhy_migration_externalDebug() {
        return (String) this.source.getValue(this, $$delegatedProperties[2]);
    }

    public final void setSource$feature_rhy_migration_externalDebug(String str) {
        this.source.setValue(this, $$delegatedProperties[2], str);
    }

    private final RhyOnboardingDuxo getDuxo() {
        return (RhyOnboardingDuxo) this.duxo.getValue();
    }

    public final BooleanPreference getRhyCmSunsetOptedOut() {
        BooleanPreference booleanPreference = this.rhyCmSunsetOptedOut;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyCmSunsetOptedOut");
        return null;
    }

    public final void setRhyCmSunsetOptedOut(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.rhyCmSunsetOptedOut = booleanPreference;
    }

    public final LongPreference getRhyMigrationCmSunsetLastTimePref() {
        LongPreference longPreference = this.rhyMigrationCmSunsetLastTimePref;
        if (longPreference != null) {
            return longPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyMigrationCmSunsetLastTimePref");
        return null;
    }

    public final void setRhyMigrationCmSunsetLastTimePref(LongPreference longPreference) {
        Intrinsics.checkNotNullParameter(longPreference, "<set-?>");
        this.rhyMigrationCmSunsetLastTimePref = longPreference;
    }

    public final TargetBackend getTargetBackend() {
        TargetBackend targetBackend = this.targetBackend;
        if (targetBackend != null) {
            return targetBackend;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetBackend");
        return null;
    }

    public final void setTargetBackend(TargetBackend targetBackend) {
        Intrinsics.checkNotNullParameter(targetBackend, "<set-?>");
        this.targetBackend = targetBackend;
    }

    public final RhyGlobalLoggingContext getRhyGlobalLoggingContext() {
        RhyGlobalLoggingContext rhyGlobalLoggingContext = this.rhyGlobalLoggingContext;
        if (rhyGlobalLoggingContext != null) {
            return rhyGlobalLoggingContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyGlobalLoggingContext");
        return null;
    }

    public final void setRhyGlobalLoggingContext(RhyGlobalLoggingContext rhyGlobalLoggingContext) {
        Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "<set-?>");
        this.rhyGlobalLoggingContext = rhyGlobalLoggingContext;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSuv$lambda$1(RhyOnboardingActivity rhyOnboardingActivity) {
        rhyOnboardingActivity.getDuxo().getPushTokenizeEvent();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().getDecorView().setSystemUiVisibility(1280);
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity.onCreate.1
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    Intrinsics.checkNotNullParameter(insets, "insets");
                    ViewsKt.setMarginTop(v, insets.getSystemWindowInsetTop());
                    return insets.consumeSystemWindowInsets();
                }
            });
        }
        setSource$feature_rhy_migration_externalDebug(((LegacyIntentKey.RhyMigrationOnboarding) INSTANCE.getExtras((Activity) this)).getSource());
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, RhyOnboardingLoadingFragment.INSTANCE.newInstance());
        }
        getRhyGlobalLoggingContext().refresh();
        ScreenProtectManager screenProtectManager = getScreenProtectManager();
        screenProtectManager.blockScreenSharing(this, ScreenProtectFlow.RHY_ENROLLMENT);
        screenProtectManager.setFlagSecure(this);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C275803(this));
    }

    /* compiled from: RhyOnboardingActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$onCreate$3 */
    /* synthetic */ class C275803 extends FunctionReferenceImpl implements Function1<RhyOnboardingViewState, Unit> {
        C275803(Object obj) {
            super(1, obj, RhyOnboardingActivity.class, "bind", "bind(Lcom/robinhood/android/rhymigration/ui/RhyOnboardingViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RhyOnboardingViewState rhyOnboardingViewState) {
            invoke2(rhyOnboardingViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RhyOnboardingViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RhyOnboardingActivity) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getCurrentFragment() instanceof RhyCardFragment) {
            setCardSelectionProductTag$feature_rhy_migration_externalDebug("");
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final RhyOnboardingViewState state) {
        PushTokenizeRequest pushTokenizeRequestConsume;
        VerificationRequiredException verificationRequiredExceptionConsume;
        UiEvent<CmSunsetExperiment4> experimentLoadComplete;
        UiEvent<Unit> noCmAccountError = state.getNoCmAccountError();
        if (noCmAccountError != null) {
            noCmAccountError.consumeWith(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingActivity.bind$lambda$5(this.f$0, (Unit) obj);
                }
            });
        }
        if (state.getShutdownDate() != null && (experimentLoadComplete = state.getExperimentLoadComplete()) != null) {
            experimentLoadComplete.consumeWith(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingActivity.bind$lambda$6(this.f$0, state, (CmSunsetExperiment4) obj);
                }
            });
        }
        UiEvent<Unit> reviewChangesContinueClicked = state.getReviewChangesContinueClicked();
        if (reviewChangesContinueClicked != null) {
            reviewChangesContinueClicked.consumeWith(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingActivity.bind$lambda$7(this.f$0, state, (Unit) obj);
                }
            });
        }
        UiEvent<Unit> optOutClicked = state.getOptOutClicked();
        if (optOutClicked != null) {
            optOutClicked.consumeWith(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingActivity.bind$lambda$9(this.f$0, state, (Unit) obj);
                }
            });
        }
        UiEvent<Boolean> userRequestedShutdown = state.getUserRequestedShutdown();
        if (userRequestedShutdown != null) {
            userRequestedShutdown.consumeWith(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingActivity.bind$lambda$10(this.f$0, ((Boolean) obj).booleanValue());
                }
            });
        }
        UiEvent<Unit> upgradeClicked = state.getUpgradeClicked();
        if (upgradeClicked != null) {
            upgradeClicked.consumeWith(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingActivity.bind$lambda$11(this.f$0, state, (Unit) obj);
                }
            });
        }
        UiEvent<Boolean> cardSelected = state.getCardSelected();
        if (cardSelected != null) {
            cardSelected.consumeWith(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingActivity.bind$lambda$12(this.f$0, state, ((Boolean) obj).booleanValue());
                }
            });
        }
        UiEvent<Unit> addressConfirmed = state.getAddressConfirmed();
        if (addressConfirmed != null) {
            addressConfirmed.consumeWith(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingActivity.bind$lambda$13(this.f$0, state, (Unit) obj);
                }
            });
        }
        UiEvent<Unit> accountCreatedContinueClicked = state.getAccountCreatedContinueClicked();
        if (accountCreatedContinueClicked != null) {
            accountCreatedContinueClicked.consumeWith(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingActivity.bind$lambda$14(state, this, (Unit) obj);
                }
            });
        }
        TransferConfiguration transferConfig = state.getTransferConfig();
        if (transferConfig != null) {
            NavigationActivityResultContract3.launch$default(this.transferFundsLauncher, new Transfer(transferConfig), null, false, 6, null);
        }
        UiEvent<Unit> transferSkipClicked = state.getTransferSkipClicked();
        if (transferSkipClicked != null) {
            transferSkipClicked.consumeWith(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingActivity.bind$lambda$16(this.f$0, (Unit) obj);
                }
            });
        }
        UiEvent<Unit> fundingFinishContinueClicked = state.getFundingFinishContinueClicked();
        if (fundingFinishContinueClicked != null) {
            fundingFinishContinueClicked.consumeWith(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingActivity.bind$lambda$17(this.f$0, state, (Unit) obj);
                }
            });
        }
        UiEvent<Boolean> continueToAddToVirtualWallet = state.getContinueToAddToVirtualWallet();
        if (continueToAddToVirtualWallet != null) {
            continueToAddToVirtualWallet.consumeWith(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingActivity.bind$lambda$18(this.f$0, ((Boolean) obj).booleanValue());
                }
            });
        }
        UiEvent<VerificationRequiredException> verificationRequired = state.getVerificationRequired();
        if (verificationRequired != null && (verificationRequiredExceptionConsume = verificationRequired.consume()) != null) {
            this.launchSuv.invoke(verificationRequiredExceptionConsume.getWorkflowInstanceUuid(), Boolean.valueOf(verificationRequiredExceptionConsume.isMigrated()));
        }
        UiEvent<PushTokenizeRequest> pushTokenizeEvent = state.getPushTokenizeEvent();
        if (pushTokenizeEvent != null && (pushTokenizeRequestConsume = pushTokenizeEvent.consume()) != null) {
            this.googlePayPushTokenizeManager.pushTokenize(this, pushTokenizeRequestConsume, 19);
            finish();
        }
        UiEvent<Unit> googleWalletError = state.getGoogleWalletError();
        if (googleWalletError != null) {
            googleWalletError.consumeWith(new Function1() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOnboardingActivity.bind$lambda$21(this.f$0, (Unit) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$5(final RhyOnboardingActivity rhyOnboardingActivity, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        View viewFindRoot = Snackbars.INSTANCE.findRoot(rhyOnboardingActivity);
        String string2 = rhyOnboardingActivity.getString(C11048R.string.general_error_summary);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        companion.make(viewFindRoot, string2, 0).addDismissCallback(new Function2() { // from class: com.robinhood.android.rhymigration.ui.RhyOnboardingActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RhyOnboardingActivity.bind$lambda$5$lambda$4(this.f$0, (RdsSnackbar) obj, ((Integer) obj2).intValue());
            }
        }).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$5$lambda$4(RhyOnboardingActivity rhyOnboardingActivity, RdsSnackbar rdsSnackbar, int i) {
        rhyOnboardingActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$6(RhyOnboardingActivity rhyOnboardingActivity, RhyOnboardingViewState rhyOnboardingViewState, CmSunsetExperiment4 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyOnboardingActivity.getRhyMigrationCmSunsetLastTimePref().set(Instant.now().getEpochSecond());
        if (rhyOnboardingViewState.getInCmSunsetExperiment()) {
            rhyOnboardingActivity.replaceFragmentWithoutBackStack(RhyIntroFragmentV2.INSTANCE.newInstance((Parcelable) new RhyIntroFragmentV2.Args(rhyOnboardingActivity.getRhyMigration(), it, rhyOnboardingViewState.getShutdownDate(), rhyOnboardingViewState.getMigrationBlockReason())));
        } else {
            rhyOnboardingActivity.replaceFragmentWithoutBackStack(RhyIntroParentFragment.INSTANCE.newInstance());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$7(RhyOnboardingActivity rhyOnboardingActivity, RhyOnboardingViewState rhyOnboardingViewState, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyOnboardingActivity.replaceFragment(RhyCardFragment.INSTANCE.newInstance((Parcelable) new RhyCardFragment.Args(rhyOnboardingViewState.getInCmSunsetExperiment())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$9(RhyOnboardingActivity rhyOnboardingActivity, RhyOnboardingViewState rhyOnboardingViewState, Unit it) {
        UiRhyMigrationCmShutdown optOutPage;
        Intrinsics.checkNotNullParameter(it, "it");
        UiRhyMigration rhyMigration = rhyOnboardingActivity.getRhyMigration();
        if (rhyMigration != null && (optOutPage = rhyMigration.getOptOutPage()) != null) {
            rhyOnboardingActivity.replaceFragment(RhyCloseAccountFragment.INSTANCE.newInstance((Parcelable) new RhyCloseAccountFragment.Args(optOutPage, rhyOnboardingViewState.getShutdownDate())));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$10(RhyOnboardingActivity rhyOnboardingActivity, boolean z) {
        if (z) {
            rhyOnboardingActivity.getRhyCmSunsetOptedOut().set(true);
        } else {
            RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
            View viewFindRoot = Snackbars.INSTANCE.findRoot(rhyOnboardingActivity);
            String string2 = rhyOnboardingActivity.getString(C11048R.string.general_error_summary);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            companion.make(viewFindRoot, string2, 0).show();
        }
        rhyOnboardingActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$11(RhyOnboardingActivity rhyOnboardingActivity, RhyOnboardingViewState rhyOnboardingViewState, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyOnboardingActivity.popEntireFragmentBackstack();
        rhyOnboardingActivity.replaceFragmentWithoutBackStack(RhyIntroFragmentV2.INSTANCE.newInstance((Parcelable) new RhyIntroFragmentV2.Args(rhyOnboardingActivity.getRhyMigration(), rhyOnboardingViewState.getExperimentTreatment(), rhyOnboardingViewState.getShutdownDate(), null, 8, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$12(RhyOnboardingActivity rhyOnboardingActivity, RhyOnboardingViewState rhyOnboardingViewState, boolean z) {
        rhyOnboardingActivity.replaceFragment(Navigator.DefaultImpls.createFragment$default(rhyOnboardingActivity.getNavigator(), new LegacyFragmentKey.RhyConfirmAddress(z, rhyOnboardingViewState.getInCmSunsetExperiment()), null, 2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$13(RhyOnboardingActivity rhyOnboardingActivity, RhyOnboardingViewState rhyOnboardingViewState, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RhyAgreementFragment.Companion companion = RhyAgreementFragment.INSTANCE;
        UiRhyMigration rhyMigration = rhyOnboardingActivity.getRhyMigration();
        if (rhyMigration != null) {
            rhyOnboardingActivity.replaceFragment(companion.newInstance((Parcelable) new RhyAgreementFragment.Args(rhyMigration.getAgreement1(), false, rhyOnboardingViewState.getInCmSunsetExperiment())));
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$14(RhyOnboardingViewState rhyOnboardingViewState, RhyOnboardingActivity rhyOnboardingActivity, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (rhyOnboardingViewState.getInCmSunsetExperiment()) {
            if (rhyOnboardingViewState.getCmSunsetCohort().isCohortTwoOrLater()) {
                rhyOnboardingActivity.popEntireFragmentBackstack();
                rhyOnboardingActivity.replaceFragment(RhyAccountFundingFragment.INSTANCE.newInstance());
            } else {
                rhyOnboardingActivity.finish();
            }
        } else {
            rhyOnboardingActivity.rewardsEnrollmentLauncher.launch(Navigator.DefaultImpls.createIntent$default(rhyOnboardingActivity.getNavigator(), rhyOnboardingActivity, new LegacyIntentKey.RewardsOnboarding(LegacyIntentKey.RewardsOnboarding.Action.CREATE_ENROLLMENT), null, false, 12, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$16(RhyOnboardingActivity rhyOnboardingActivity, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyOnboardingActivity.replaceFragment(RhyAccountFundedFinishFragment.INSTANCE.newInstance((Parcelable) new RhyAccountFundedFinishFragment.Args(true)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$17(RhyOnboardingActivity rhyOnboardingActivity, RhyOnboardingViewState rhyOnboardingViewState, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyOnboardingActivity.replaceFragment(RhyDirectDepositFragment.INSTANCE.newInstance((Parcelable) new RhyDirectDepositFragment.Args(Boolean.valueOf(rhyOnboardingViewState.getHasActiveDirectDeposits()), null, 2, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$18(RhyOnboardingActivity rhyOnboardingActivity, boolean z) {
        if (z) {
            rhyOnboardingActivity.replaceFragment(RhyAddToWalletFragment.INSTANCE.newInstance());
        } else {
            rhyOnboardingActivity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$21(RhyOnboardingActivity rhyOnboardingActivity, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyOnboardingActivity.finish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingFragment.Callbacks
    public void onPrefetchSuccess(UiRhyMigration rhyMigration, boolean isCmSunset) {
        Intrinsics.checkNotNullParameter(rhyMigration, "rhyMigration");
        setRhyMigration(rhyMigration);
        getDuxo().fetchCmSunset();
    }

    @Override // com.robinhood.android.rhymigration.ui.RhyOnboardingLoadingFragment.Callbacks
    public void onPrefetchFailure(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        handleError(throwable, C27577R.id.dialog_id_rhy_prefetch_error);
    }

    @Override // com.robinhood.android.rhymigration.ui.intro.RhyIntroParentFragment.Callbacks
    public void onReviewChangesClicked() {
        replaceFragment(RhyReviewChangesFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.rhymigration.ui.review.RhyReviewChangesFragment.Callbacks
    public void onReviewChangesContinueClicked() {
        String str;
        if (getVariables().getVirtual_card_first()) {
            str = "migration_virtual_first";
        } else {
            str = "migration_physical_first";
        }
        setCardSelectionProductTag$feature_rhy_migration_externalDebug(str);
        getDuxo().reviewChangesContinueClicked();
    }

    @Override // com.robinhood.android.rhymigration.ui.intro.RhyIntroFragmentV2.Callbacks
    public void onOptOutClicked() {
        getDuxo().optOutClicked();
    }

    @Override // com.robinhood.android.rhymigration.ui.close.RhyCloseAccountFragment.Callbacks
    public void onShutdownAccountClicked() {
        getDuxo().shutdownClicked();
    }

    @Override // com.robinhood.android.rhymigration.ui.close.RhyCloseAccountFragment.Callbacks
    public void onUpgradeClicked() {
        getDuxo().upgradeClicked();
    }

    @Override // com.robinhood.android.rhymigration.ui.card.RhyCardFragment.Callbacks
    public void onCardSelected(MinervaAccountStore.RhyCardPreference rhyCardPreference) {
        Intrinsics.checkNotNullParameter(rhyCardPreference, "rhyCardPreference");
        getDuxo().cardSelected(rhyCardPreference.getNeedsShippingAddress());
    }

    @Override // com.robinhood.android.rhymigration.ui.card.RhyCardFragment.Callbacks
    public void onCardSelectedError(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        handleError$default(this, throwable, 0, 2, null);
    }

    @Override // com.robinhood.android.rhymigration.ui.agreements.RhyAgreementFragment.Callbacks
    public void onAgreementError(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        handleError$default(this, throwable, 0, 2, null);
    }

    @Override // com.robinhood.android.rhymigration.ui.agreements.RhyAgreementFragment.Callbacks
    public void onFirstAgreementAccepted(boolean isLastAgreement) {
        replaceFragment(RhyAgreementFragment.INSTANCE.newInstance((Parcelable) new RhyAgreementFragment.Args(requireRhyMigration().getAgreement2(), true, false, 4, null)));
    }

    @Override // com.robinhood.android.rhymigration.ui.agreements.RhyAgreementFragment.Callbacks
    public void onApplicationSubmitted() {
        popEntireFragmentBackstack();
        replaceFragment(RhyOpenAccountFragment.INSTANCE.newInstance());
    }

    @Override // com.robinhood.android.rhymigration.ui.agreements.RhyAgreementFragment.Callbacks
    public void onApplicationSubmissionError(Throwable error) throws Throwable {
        Intrinsics.checkNotNullParameter(error, "error");
        handleError$default(this, error, 0, 2, null);
    }

    @Override // com.robinhood.android.common.rhymigration.p086ui.callbacks.RhyConfirmAddressCallbacks
    public void onAddressConfirmed(ShippingAddress shippingAddress) {
        getDuxo().addressConfirmed();
    }

    @Override // com.robinhood.android.common.rhymigration.p086ui.callbacks.RhyConfirmAddressCallbacks
    public void onAddressError(Throwable error) throws Throwable {
        Intrinsics.checkNotNullParameter(error, "error");
        handleError$default(this, error, 0, 2, null);
    }

    @Override // com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountFragment.Callbacks
    public void onOpenAccountCanceled() {
        finish();
    }

    @Override // com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountFragment.Callbacks
    public void onOpenAccountSetupRewardsClicked() {
        getDuxo().accountCreationCompleteContinueClicked();
    }

    @Override // com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountFragment.Callbacks
    public void onOpenAccountSkipRewardsClicked() {
        startDirectDepositSetupAndFinish();
    }

    @Override // com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountTimeoutBottomSheet.Callbacks
    public void onOpenAccountTimeoutExit() {
        finish();
    }

    @Override // com.robinhood.android.rhymigration.ui.funding.RhyAccountFundingFragment.Callbacks
    public void onTransferSkipClicked() {
        getDuxo().transferSkipClicked();
    }

    @Override // com.robinhood.android.rhymigration.ui.funding.RhyAccountFundingFragment.Callbacks
    public void onTransferFundingAmountClicked(BigDecimal amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        getDuxo().transferAmountClicked(amount);
    }

    @Override // com.robinhood.android.rhymigration.ui.funding.RhyAccountFundedFinishFragment.Callbacks
    public void onFundingFinishedContinueClicked() {
        getDuxo().fundingFinishedContinueClicked();
    }

    @Override // com.robinhood.android.rhymigration.ui.directdeposit.RhyDirectDepositFragment.Callbacks
    public void onDirectDepositContinueClicked() {
        getDuxo().directDepositContinueClicked();
    }

    @Override // com.robinhood.android.rhymigration.ui.directdeposit.RhyAddToWalletFragment.Callbacks
    public void onMobileWalletAddFinished() {
        if (!getTargetBackend().isApollo()) {
            getDuxo().getPushTokenizeEvent();
        } else {
            ContextsUiExtensions.showShortToast(this, "Apollo env detected; Google Pay called");
            finish();
        }
    }

    @Override // com.robinhood.android.rhymigration.ui.directdeposit.RhyAddToWalletFragment.Callbacks
    public void onMobileWalletAddSkipped() {
        finish();
    }

    @Override // com.robinhood.android.rhymigration.ui.intro.RhyIntroFragmentV2.Callbacks
    public void onValuePropClicked(int valPropModelIndex) {
        Screen screen;
        if (valPropModelIndex == 0) {
            screen = new Screen(Screen.Name.RHY_MIGRATION_FEATURE_REWARDS, null, null, null, 14, null);
        } else if (valPropModelIndex == 1) {
            screen = new Screen(Screen.Name.RHY_MIGRATION_FEATURE_MERCHANT_REWARDS, null, null, null, 14, null);
        } else if (valPropModelIndex == 2) {
            screen = new Screen(Screen.Name.RHY_MIGRATION_FEATURE_DIRECT_DEPOSIT, null, null, null, 14, null);
        } else if (valPropModelIndex == 3) {
            screen = new Screen(Screen.Name.RHY_MIGRATION_CONTRAST_MULTIPLE_ACCOUNTS, null, null, null, 14, null);
        } else {
            screen = new Screen(Screen.Name.RHY_MIGRATION_FEATURE_REWARDS, null, null, null, 14, null);
        }
        replaceFragment(RhyFeatureIntroFragment.INSTANCE.newInstance((Parcelable) new RhyFeatureIntroFragment.Args(valPropModelIndex, screen, true)));
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C27577R.id.dialog_id_rhy_prefetch_error) {
            finish();
        }
    }

    @Override // com.robinhood.android.rhymigration.p245ui.PageDataCallbacks
    public UiRhyMigrationContrastPage getContrastPage() {
        return requireRhyMigration().getContrastPage();
    }

    @Override // com.robinhood.android.rhymigration.p245ui.PageDataCallbacks
    public UiRhyMigrationCardPage getCardPage() {
        return requireRhyMigration().getCardPage();
    }

    @Override // com.robinhood.android.rhymigration.p245ui.PageDataCallbacks
    public UiRhyMigrationReviewPage getReviewPage() {
        return requireRhyMigration().getReviewPage();
    }

    @Override // com.robinhood.android.rhymigration.p245ui.PageDataCallbacks
    public UiRhyMigrationLoadingAnimation getAnimation() {
        return requireRhyMigration().getLoadingAnimation();
    }

    @Override // com.robinhood.android.rhymigration.p245ui.PageDataCallbacks
    public RhyMigrationVariables getVariables() {
        return requireRhyMigration().getVariables();
    }

    @Override // com.robinhood.android.rhymigration.p245ui.PageDataCallbacks
    public UiRhyMigrationFeaturePage getFeaturePage(int index) {
        UiRhyMigration uiRhyMigrationRequireRhyMigration = requireRhyMigration();
        if (index == 0) {
            return uiRhyMigrationRequireRhyMigration.getFeaturePage1();
        }
        if (index == 1) {
            return uiRhyMigrationRequireRhyMigration.getFeaturePage3();
        }
        if (index == 2) {
            return uiRhyMigrationRequireRhyMigration.getFeaturePage2();
        }
        throw new IllegalStateException(("Unexpected index " + index).toString());
    }

    private final UiRhyMigration requireRhyMigration() {
        UiRhyMigration rhyMigration = getRhyMigration();
        if (rhyMigration != null) {
            return rhyMigration;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    static /* synthetic */ void handleError$default(RhyOnboardingActivity rhyOnboardingActivity, Throwable th, int i, int i2, Object obj) throws Throwable {
        if ((i2 & 2) != 0) {
            i = C11048R.id.dialog_id_generic_error;
        }
        rhyOnboardingActivity.handleError(th, i);
    }

    private final void handleError(Throwable throwable, int errorDialogId) throws Throwable {
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, this, throwable, true, false, errorDialogId, null, 40, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startDirectDepositSetupAndFinish() {
        if (((LegacyIntentKey.RhyMigrationOnboarding) INSTANCE.getExtras((Activity) this)).getStartDirectDepositSetupAfterMigration()) {
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new DirectDepositShimKey(false, false, true, false, false, false, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null), null, false, null, null, 60, null);
            finish();
        } else {
            finishWithDeepLinkOverride();
        }
    }

    private final void finishWithDeepLinkOverride() {
        Uri exitDeeplinkOverride = ((LegacyIntentKey.RhyMigrationOnboarding) INSTANCE.getExtras((Activity) this)).getExitDeeplinkOverride();
        if (exitDeeplinkOverride != null) {
            Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, exitDeeplinkOverride, null, null, false, null, 60, null);
        }
        finish();
    }

    /* compiled from: RhyOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/RhyOnboardingActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/rhymigration/ui/RhyOnboardingActivity;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RhyMigrationOnboarding;", "<init>", "()V", "REQUEST_PUSH_TOKENIZE", "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<RhyOnboardingActivity, LegacyIntentKey.RhyMigrationOnboarding> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public LegacyIntentKey.RhyMigrationOnboarding getExtras(RhyOnboardingActivity rhyOnboardingActivity) {
            return (LegacyIntentKey.RhyMigrationOnboarding) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, rhyOnboardingActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.RhyMigrationOnboarding rhyMigrationOnboarding) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, rhyMigrationOnboarding);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, LegacyIntentKey.RhyMigrationOnboarding rhyMigrationOnboarding) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, rhyMigrationOnboarding);
        }
    }
}
