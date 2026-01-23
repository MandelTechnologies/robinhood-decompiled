package com.robinhood.android.transfers.p271ui.max;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advisory.contracts.AdvisoryFullWithdrawalKey;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.banking.util.DeactivatedAccountUtils;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.gold.GoldPostUpgradeCelebrationFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.engagement.depositincentive.DepositIncentiveBottomSheetFragment;
import com.robinhood.android.gold.boost.maxawareness.GoldDepositBoostMaxAwarenessStore;
import com.robinhood.android.lib.transfers.robinhood3ds.ThreeDSHostCallbacks;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.experimental.page.GenericStandardPageKey;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.IraDistributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionKey;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferResult;
import com.robinhood.android.transfers.contracts.TransferSuccessCallbacks;
import com.robinhood.android.transfers.contracts.TransfersDeepLinkMetadata;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContract3;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.android.transfers.p271ui.max.BaseCreateTransferFragment;
import com.robinhood.android.transfers.p271ui.max.GoldDepositHookBottomSheetFragment;
import com.robinhood.android.transfers.p271ui.max.accounts.TransferAccountSelectionFragment;
import com.robinhood.android.transfers.p271ui.max.upsell.RecurringFrequencyUpsellFragment;
import com.robinhood.android.transfers.p271ui.robinhood3ds.ThreeDSWebViewFragment;
import com.robinhood.android.transfers.preference.DirectDepositUpsellExposureCountPref;
import com.robinhood.android.transfers.preference.GoldDepositUpsellExposureCountPref;
import com.robinhood.android.transfers.preference.GoldDepositUpsellExposureResetPref;
import com.robinhood.android.transfers.preference.RecurringDepositUpsellExposureCountPref;
import com.robinhood.android.transfers.preference.RhsRecurringDepositHookExposureCountPref;
import com.robinhood.android.transfers.preference.RhyRecurringDepositHookExposureCountPref;
import com.robinhood.android.transfers.util.ValidateConfigIfDebug;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
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
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.security.screenprotect.ScreenProtectFlow;
import com.robinhood.security.screenprotect.ScreenProtectManager;
import com.robinhood.shared.posttransfer.C39496R;
import com.robinhood.shared.posttransfer.PostTransferBottomSheetFragment;
import com.robinhood.shared.posttransfer.PostTransfersActionImpressionCapUtil;
import com.robinhood.shared.transfers.contracts.TransferSuccessKey;
import com.robinhood.udf.UiEvent;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;

/* compiled from: CreateTransferActivity.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ¾\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0004¾\u0001¿\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u008b\u0001\u001a\u00020n2\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0014J\t\u0010\u008e\u0001\u001a\u00020nH\u0014J\u0013\u0010\u008f\u0001\u001a\u00020n2\b\u0010\u0090\u0001\u001a\u00030\u0091\u0001H\u0016J\t\u0010\u0092\u0001\u001a\u00020nH\u0016J\u0013\u0010\u0093\u0001\u001a\u00020n2\b\u0010\u0094\u0001\u001a\u00030\u0095\u0001H\u0016J\u0013\u0010\u0096\u0001\u001a\u00020n2\b\u0010\u0097\u0001\u001a\u00030\u0098\u0001H\u0016J\u0013\u0010\u0099\u0001\u001a\u00020n2\b\u0010\u0097\u0001\u001a\u00030\u009a\u0001H\u0016J\u001f\u0010\u009b\u0001\u001a\u00020n2\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010X2\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010YH\u0016J8\u0010\u009e\u0001\u001a\u00020n2\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010X2\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u00012\n\u0010¡\u0001\u001a\u0005\u0018\u00010¢\u00012\n\u0010£\u0001\u001a\u0005\u0018\u00010¤\u0001H\u0016J \u0010\u009e\u0001\u001a\u00020n2\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010X2\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u0001H\u0016J\u0012\u0010¥\u0001\u001a\u00020n2\u0007\u0010¦\u0001\u001a\u00020^H\u0016J\t\u0010§\u0001\u001a\u00020nH\u0016J\t\u0010¨\u0001\u001a\u00020nH\u0016J\u0013\u0010©\u0001\u001a\u00020n2\b\u0010\u0094\u0001\u001a\u00030\u0095\u0001H\u0016J \u0010ª\u0001\u001a\u00030\u0081\u00012\b\u0010«\u0001\u001a\u00030¬\u00012\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0016J \u0010®\u0001\u001a\u00030\u0081\u00012\b\u0010«\u0001\u001a\u00030¬\u00012\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0016J\u0013\u0010¯\u0001\u001a\u00020n2\b\u0010°\u0001\u001a\u00030¬\u0001H\u0016J\u0013\u0010±\u0001\u001a\u00020n2\b\u0010°\u0001\u001a\u00030¬\u0001H\u0016J \u0010²\u0001\u001a\u00030\u0081\u00012\b\u0010°\u0001\u001a\u00030¬\u00012\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0016J \u0010³\u0001\u001a\u00030\u0081\u00012\b\u0010°\u0001\u001a\u00030¬\u00012\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0016J\n\u0010´\u0001\u001a\u00030\u0081\u0001H\u0016J\u0015\u0010µ\u0001\u001a\u00020n2\n\u0010¶\u0001\u001a\u0005\u0018\u00010·\u0001H\u0016J\u000b\u0010¸\u0001\u001a\u00030\u0081\u0001H\u0096\u0001R$\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R$\u0010\u0018\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R$\u0010\u001c\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R$\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b(\u0010\f\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u00107\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010=\u001a\u00020>8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010C\u001a\u00020D8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001e\u0010I\u001a\u00020J8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001e\u0010O\u001a\u00020P8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR<\u0010U\u001a0\u0012,\u0012*\u0012\u0006\u0012\u0004\u0018\u00010X\u0012\u0006\u0012\u0004\u0018\u00010Y Z*\u0014\u0012\u0006\u0012\u0004\u0018\u00010X\u0012\u0006\u0012\u0004\u0018\u00010Y\u0018\u00010W0W0VX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010[\u001a\u0010\u0012\f\u0012\n Z*\u0004\u0018\u00010\\0\\0VX\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010_\u001a\u0004\u0018\u00010^2\b\u0010]\u001a\u0004\u0018\u00010^8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR*\u0010f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010X\u0012\u0006\u0012\u0004\u0018\u00010Y0W0g8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020\\0g8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010iR\"\u0010l\u001a\n\u0012\u0004\u0012\u00020n\u0018\u00010mX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010s\u001a\n\u0012\u0004\u0012\u00020n\u0018\u00010mX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010p\"\u0004\bu\u0010rR\u001d\u0010v\u001a\u0004\u0018\u00010w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\bx\u0010yR\u001c\u0010|\u001a\u00020}8BX\u0082\u0084\u0002¢\u0006\r\n\u0005\b\u0080\u0001\u0010{\u001a\u0004\b~\u0010\u007fR3\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010]\u001a\u00030\u0081\u00018B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b\u0086\u0001\u0010e\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R3\u0010\u0087\u0001\u001a\u00030\u0081\u00012\u0007\u0010]\u001a\u00030\u0081\u00018B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b\u008a\u0001\u0010e\u001a\u0006\b\u0088\u0001\u0010\u0083\u0001\"\u0006\b\u0089\u0001\u0010\u0085\u0001R\u001d\u0010¹\u0001\u001a\n\u0012\u0005\u0012\u00030»\u00010º\u0001X\u0096\u0005¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001¨\u0006À\u0001"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/transfers/ui/max/BaseCreateTransferFragment$Callbacks;", "Lcom/robinhood/android/lib/transfers/robinhood3ds/ThreeDSHostCallbacks;", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountSelectionFragment$Callbacks;", "Lcom/robinhood/android/transfers/contracts/TransferSuccessCallbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment$OnDismissListener;", "Lcom/robinhood/android/common/ui/BaseDialogFragment$OnDismissListener;", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationFragment$Callbacks;", "<init>", "()V", "rhyRecurringDepositHookExposureCountPref", "Lcom/robinhood/prefs/IntPreference;", "getRhyRecurringDepositHookExposureCountPref$annotations", "getRhyRecurringDepositHookExposureCountPref", "()Lcom/robinhood/prefs/IntPreference;", "setRhyRecurringDepositHookExposureCountPref", "(Lcom/robinhood/prefs/IntPreference;)V", "directDepositUpsellExposureCountPref", "getDirectDepositUpsellExposureCountPref$annotations", "getDirectDepositUpsellExposureCountPref", "setDirectDepositUpsellExposureCountPref", "goldDepositHookExposureCountPref", "getGoldDepositHookExposureCountPref$annotations", "getGoldDepositHookExposureCountPref", "setGoldDepositHookExposureCountPref", "goldDepositUpsellExposureCountPref", "getGoldDepositUpsellExposureCountPref$annotations", "getGoldDepositUpsellExposureCountPref", "setGoldDepositUpsellExposureCountPref", "goldDepositUpsellExposureResetPref", "Lcom/robinhood/prefs/BooleanPreference;", "getGoldDepositUpsellExposureResetPref$annotations", "getGoldDepositUpsellExposureResetPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setGoldDepositUpsellExposureResetPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "recurringDepositUpsellExposureCountPref", "getRecurringDepositUpsellExposureCountPref$annotations", "getRecurringDepositUpsellExposureCountPref", "setRecurringDepositUpsellExposureCountPref", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "getTransferAccountStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "setTransferAccountStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;)V", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "getScreenProtectManager", "()Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "setScreenProtectManager", "(Lcom/robinhood/security/screenprotect/ScreenProtectManager;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "goldDepositBoostMaxAwarenessStore", "Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;", "getGoldDepositBoostMaxAwarenessStore", "()Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;", "setGoldDepositBoostMaxAwarenessStore", "(Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;)V", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "getMicrogramComponentFactory", "()Lmicrogram/android/inject/MicrogramComponent$Factory;", "setMicrogramComponentFactory", "(Lmicrogram/android/inject/MicrogramComponent$Factory;)V", "sourceAccountRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Lkotlin/Pair;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "kotlin.jvm.PlatformType", "sinkAccountRelay", "Lcom/robinhood/android/transfers/ui/max/SinkAccountData;", "<set-?>", "", "transferSuccessId", "getTransferSuccessId", "()Ljava/lang/String;", "setTransferSuccessId", "(Ljava/lang/String;)V", "transferSuccessId$delegate", "Lkotlin/properties/ReadWriteProperty;", "sourceAccountObservable", "Lio/reactivex/Observable;", "getSourceAccountObservable", "()Lio/reactivex/Observable;", "sinkAccountObservable", "getSinkAccountObservable", "threeDSCancelationEvent", "Lcom/robinhood/udf/UiEvent;", "", "getThreeDSCancelationEvent", "()Lcom/robinhood/udf/UiEvent;", "setThreeDSCancelationEvent", "(Lcom/robinhood/udf/UiEvent;)V", "threeDSCompletionEvent", "getThreeDSCompletionEvent", "setThreeDSCompletionEvent", CreateTransferActivity.EXTRA_DEEP_LINK_METADATA, "Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;", "getDeepLinkMetadata", "()Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;", "deepLinkMetadata$delegate", "Lkotlin/Lazy;", CreateTransferActivity.EXTRA_TRANSFER_CONFIGURATION, "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "getTransferConfiguration", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "transferConfiguration$delegate", "", "isDebitCardSourceAccount", "()Z", "setDebitCardSourceAccount", "(Z)V", "isDebitCardSourceAccount$delegate", "allowUnlimitedRecurringDepositUpsell", "getAllowUnlimitedRecurringDepositUpsell", "setAllowUnlimitedRecurringDepositUpsell", "allowUnlimitedRecurringDepositUpsell$delegate", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "finish", "onTransferCreateSuccess", "postTransferFlow", "Lcom/robinhood/models/ui/bonfire/PostTransferFlow;", "onShowAccountSelection", "key", "Lcom/robinhood/android/transfers/contracts/TransferAccountSelectionKey;", "onLaunchAdvisoryFullWithdrawal", "Lcom/robinhood/android/advisory/contracts/AdvisoryFullWithdrawalKey;", "onSourceAccountSelected", "account", "iraDistributionInfo", "onSinkAccountSelected", "iraContributionInfo", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", CreateTransferDuxo.SAVED_STATE_OUTGOING_WIRE_RECIPIENT_TYPE, "Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "wireRoutingDetails", "Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;", "onThreeDSRequested", "redirectUrl", "onThreeDsCanceled", "onThreeDSCompleted", "onTransferConfirmationComplete", "onPrimaryButtonClicked", "dialogId", "", "passthroughArgs", "onSecondaryButtonClicked", "onBottomSheetDismissed", "id", "onDialogDismissed", "onPositiveButtonClicked", "onNegativeButtonClicked", "requiresAuthentication", "onGoldUpgradeCelebrationAction", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "PostTransferPagesEmptyException", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CreateTransferActivity extends BaseActivity implements RegionGated, BaseCreateTransferFragment.Callbacks, ThreeDSHostCallbacks, TransferAccountSelectionFragment.Callbacks, TransferSuccessCallbacks, RhDialogFragment.OnDismissListener, BaseBottomSheetDialogFragment.OnDismissListener, BaseDialogFragment.OnDismissListener, GoldPostUpgradeCelebrationFragment.Callbacks {
    private static final String EXTRA_DEEP_LINK_METADATA = "deepLinkMetadata";
    private static final String EXTRA_TRANSFER_CONFIGURATION = "transferConfiguration";
    private static final String RECURRING_DEPOSIT_HOOK_ACTION_KEY = "recurringDepositHookAction";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: allowUnlimitedRecurringDepositUpsell$delegate, reason: from kotlin metadata */
    private final Interfaces3 allowUnlimitedRecurringDepositUpsell;

    /* renamed from: deepLinkMetadata$delegate, reason: from kotlin metadata */
    private final Lazy deepLinkMetadata;
    public IntPreference directDepositUpsellExposureCountPref;
    public EventLogger eventLogger;
    public ExperimentsStore experimentsStore;
    public GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore;
    public IntPreference goldDepositHookExposureCountPref;
    public IntPreference goldDepositUpsellExposureCountPref;
    public BooleanPreference goldDepositUpsellExposureResetPref;

    /* renamed from: isDebitCardSourceAccount$delegate, reason: from kotlin metadata */
    private final Interfaces3 isDebitCardSourceAccount;
    public MicrogramComponent.Factory microgramComponentFactory;
    public IntPreference recurringDepositUpsellExposureCountPref;
    public IntPreference rhyRecurringDepositHookExposureCountPref;
    public ScreenProtectManager screenProtectManager;
    private final PublishRelay<SinkAccountData> sinkAccountRelay;
    private final PublishRelay<Tuples2<TransferAccount, IraDistributionQuestionnaireResult.IraDistribution>> sourceAccountRelay;
    private UiEvent<Unit> threeDSCancelationEvent;
    private UiEvent<Unit> threeDSCompletionEvent;
    public TransferAccountStore transferAccountStore;

    /* renamed from: transferConfiguration$delegate, reason: from kotlin metadata */
    private final Lazy transferConfiguration;

    /* renamed from: transferSuccessId$delegate, reason: from kotlin metadata */
    private final Interfaces3 transferSuccessId;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CreateTransferActivity.class, "transferSuccessId", "getTransferSuccessId()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CreateTransferActivity.class, "isDebitCardSourceAccount", "isDebitCardSourceAccount()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CreateTransferActivity.class, "allowUnlimitedRecurringDepositUpsell", "getAllowUnlimitedRecurringDepositUpsell()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<Screen> postTransfersScreen$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CreateTransferActivity.postTransfersScreen_delegate$lambda$3();
        }
    });
    private static final Lazy<Component> radHookComponent$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CreateTransferActivity.radHookComponent_delegate$lambda$4();
        }
    });

    /* compiled from: CreateTransferActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferActivity$PostTransferPagesEmptyException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class PostTransferPagesEmptyException extends RuntimeException {
    }

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

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment.Callbacks
    public void onUkAddAccountSelected(TransferAccount transferAccount) {
        TransferAccountSelectionFragment.Callbacks.DefaultImpls.onUkAddAccountSelected(this, transferAccount);
    }

    public CreateTransferActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(MoneyMovementsUsRegionGate.INSTANCE);
        PublishRelay<Tuples2<TransferAccount, IraDistributionQuestionnaireResult.IraDistribution>> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.sourceAccountRelay = publishRelayCreate;
        PublishRelay<SinkAccountData> publishRelayCreate2 = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate2, "create(...)");
        this.sinkAccountRelay = publishRelayCreate2;
        Interfaces<Object, Interfaces3<Object, String>> interfacesSavedString = BindSavedState2.savedString(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.transferSuccessId = interfacesSavedString.provideDelegate(this, kPropertyArr[0]);
        this.deepLinkMetadata = Activity.intentExtra(this, EXTRA_DEEP_LINK_METADATA);
        this.transferConfiguration = Activity.intentExtra(this, EXTRA_TRANSFER_CONFIGURATION);
        this.isDebitCardSourceAccount = BindSavedState2.savedBoolean(this, false).provideDelegate(this, kPropertyArr[1]);
        this.allowUnlimitedRecurringDepositUpsell = BindSavedState2.savedBoolean(this, false).provideDelegate(this, kPropertyArr[2]);
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

    public final TransferAccountStore getTransferAccountStore() {
        TransferAccountStore transferAccountStore = this.transferAccountStore;
        if (transferAccountStore != null) {
            return transferAccountStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transferAccountStore");
        return null;
    }

    public final void setTransferAccountStore(TransferAccountStore transferAccountStore) {
        Intrinsics.checkNotNullParameter(transferAccountStore, "<set-?>");
        this.transferAccountStore = transferAccountStore;
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

    public final GoldDepositBoostMaxAwarenessStore getGoldDepositBoostMaxAwarenessStore() {
        GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore = this.goldDepositBoostMaxAwarenessStore;
        if (goldDepositBoostMaxAwarenessStore != null) {
            return goldDepositBoostMaxAwarenessStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goldDepositBoostMaxAwarenessStore");
        return null;
    }

    public final void setGoldDepositBoostMaxAwarenessStore(GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore) {
        Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "<set-?>");
        this.goldDepositBoostMaxAwarenessStore = goldDepositBoostMaxAwarenessStore;
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

    @Override // com.robinhood.android.transfers.ui.max.BaseCreateTransferFragment.Callbacks
    public Observable<Tuples2<TransferAccount, IraDistributionQuestionnaireResult.IraDistribution>> getSourceAccountObservable() {
        Observable<Tuples2<TransferAccount, IraDistributionQuestionnaireResult.IraDistribution>> observableHide = this.sourceAccountRelay.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    @Override // com.robinhood.android.transfers.ui.max.BaseCreateTransferFragment.Callbacks
    public Observable<SinkAccountData> getSinkAccountObservable() {
        Observable<SinkAccountData> observableHide = this.sinkAccountRelay.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
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

    private final TransfersDeepLinkMetadata getDeepLinkMetadata() {
        return (TransfersDeepLinkMetadata) this.deepLinkMetadata.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransferConfiguration getTransferConfiguration() {
        return (TransferConfiguration) this.transferConfiguration.getValue();
    }

    private final boolean isDebitCardSourceAccount() {
        return ((Boolean) this.isDebitCardSourceAccount.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    private final void setDebitCardSourceAccount(boolean z) {
        this.isDebitCardSourceAccount.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getAllowUnlimitedRecurringDepositUpsell() {
        return ((Boolean) this.allowUnlimitedRecurringDepositUpsell.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    private final void setAllowUnlimitedRecurringDepositUpsell(boolean z) {
        this.allowUnlimitedRecurringDepositUpsell.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        ScarletOverlay scarletOverlay;
        ScarletManager scarletManager = ScarletManager2.getScarletManager(this);
        ValidateConfigIfDebug.validateConfigIfDebug(getTransferConfiguration());
        TransferConfiguration transferConfiguration = getTransferConfiguration();
        if ((transferConfiguration instanceof TransferConfiguration.Standard) || (transferConfiguration instanceof TransferConfiguration.MarginDeposit) || (transferConfiguration instanceof TransferConfiguration.RadHook) || (transferConfiguration instanceof TransferConfiguration.RecurringInsufficientBuyingPower) || (transferConfiguration instanceof TransferConfiguration.PostDebitCardLinking) || (transferConfiguration instanceof TransferConfiguration.Recommendations) || (transferConfiguration instanceof TransferConfiguration.IraContribution) || (transferConfiguration instanceof TransferConfiguration.RothConversion) || (transferConfiguration instanceof TransferConfiguration.MarginCallPrevention) || (transferConfiguration instanceof TransferConfiguration.MarginResolution) || (transferConfiguration instanceof TransferConfiguration.RadHookWithFrequency) || (transferConfiguration instanceof TransferConfiguration.OutgoingWire) || (transferConfiguration instanceof TransferConfiguration.PdtPrevention) || (transferConfiguration instanceof TransferConfiguration.GoldApyBoostMinDeposit) || (transferConfiguration instanceof TransferConfiguration.UpdateRecurringDeposit)) {
            scarletOverlay = AchromaticOverlay.INSTANCE;
        } else {
            if (!(transferConfiguration instanceof TransferConfiguration.DayTradeCall)) {
                throw new NoWhenBranchMatchedException();
            }
            scarletOverlay = DirectionOverlay.NEGATIVE;
        }
        scarletManager.putOverlay(scarletOverlay, Boolean.FALSE);
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            if (!getTransferConfiguration().getUseQueuedDepositMode()) {
                DeactivatedAccountUtils.preventDeactivatedUsersFromProceeding(this, getTransferAccountStore(), C9631R.string.transfers_deactivated_account_message);
            }
            setFragment(C11048R.id.fragment_container, CreateTransferFragment.INSTANCE.newInstance((Parcelable) new BaseCreateTransferFragment.Args(getDeepLinkMetadata(), getTransferConfiguration())));
            LifecycleHost.DefaultImpls.bind$default(this, getGoldDepositBoostMaxAwarenessStore().streamGoldDepositBoostMaxAwarenessOrControl2(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferActivity.onCreate$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(CreateTransferActivity createTransferActivity, boolean z) {
        createTransferActivity.setAllowUnlimitedRecurringDepositUpsell(z);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        ScreenProtectManager screenProtectManager = getScreenProtectManager();
        screenProtectManager.blockScreenSharing(this, ScreenProtectFlow.CREATE_TRANSFER);
        screenProtectManager.setFlagSecure(this);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, android.app.Activity
    public void finish() {
        String transferSuccessId = getTransferSuccessId();
        if (transferSuccessId != null) {
            if (getTransferConfiguration().getEntryPoint() == MAXTransferContext.EntryPoint.MENU_OF_OPTIONS && (isDebitCardSourceAccount() || (getTransferConfiguration() instanceof TransferConfiguration.PostDebitCardLinking))) {
                NavigationActivityResultContract3.setResult(this, TransferResult.Canceled.INSTANCE);
            } else {
                NavigationActivityResultContract3.setResult(this, new TransferResult.Completed(transferSuccessId));
            }
        } else {
            NavigationActivityResultContract3.setResult(this, TransferResult.Canceled.INSTANCE);
        }
        super.finish();
    }

    @Override // com.robinhood.android.transfers.ui.max.BaseCreateTransferFragment.Callbacks
    public void onTransferCreateSuccess(PostTransferFlow postTransferFlow) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        setTransferSuccessId(postTransferFlow.getTransferId());
        if (!getTransferConfiguration().getShowConfirmationScreen()) {
            UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(getUserLeapManager(), this, getTransferConfiguration().getEntryPoint());
            finish();
            return;
        }
        if (!postTransferFlow.getPostTransferPages().isEmpty()) {
            if (postTransferFlow.getPostTransferPagesAction() instanceof PostTransferFlow3.ShowGoldUpsellPage) {
                PostTransfersActionImpressionCapUtil.resetPostTransfersGoldUpsellImpressionCapIfNeeded(this, getExperimentsStore(), getEventLogger(), getGoldDepositUpsellExposureCountPref(), getGoldDepositUpsellExposureResetPref());
            }
            replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new TransferSuccessKey(postTransferFlow, getTransferConfiguration().getEntryPoint()), null, 2, null));
            return;
        }
        ApiCreateTransferRequest.ApiPostTransferPageConfig postTransferPageConfig = getTransferConfiguration().getPostTransferPageConfig();
        List<ApiPostTransferPage.PostTransferPageType> exclude_page_types = postTransferPageConfig != null ? postTransferPageConfig.getExclude_page_types() : null;
        if (exclude_page_types == null || exclude_page_types.isEmpty()) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new PostTransferPagesEmptyException(), false, null, 4, null);
            ContextsUiExtensions.showShortToast(this, C30065R.string.transfer_initiated);
        }
        UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(getUserLeapManager(), this, getTransferConfiguration().getEntryPoint());
        finish();
    }

    @Override // com.robinhood.android.transfers.ui.max.BaseCreateTransferFragment.Callbacks
    public void onShowAccountSelection(TransferAccountSelectionKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        replaceFragment(TransferAccountSelectionFragment.INSTANCE.newInstance((Parcelable) key));
    }

    @Override // com.robinhood.android.transfers.ui.max.BaseCreateTransferFragment.Callbacks
    public void onLaunchAdvisoryFullWithdrawal(AdvisoryFullWithdrawalKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), key, null, 2, null));
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment.Callbacks
    public void onSourceAccountSelected(TransferAccount account, IraDistributionQuestionnaireResult.IraDistribution iraDistributionInfo) {
        popLastFragment();
        this.sourceAccountRelay.accept(Tuples4.m3642to(account, iraDistributionInfo));
        setDebitCardSourceAccount((account != null ? account.getType() : null) == ApiTransferAccount.TransferAccountType.DEBIT_CARD);
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment.Callbacks
    public void onSinkAccountSelected(TransferAccount account, IraContributionQuestionnaireResult.IraContribution iraContributionInfo, RecipientType outgoingWireRecipientType, WireRoutingDetailsInputActivityResultContract3.Success wireRoutingDetails) {
        popLastFragment();
        this.sinkAccountRelay.accept(new SinkAccountData(account, iraContributionInfo, outgoingWireRecipientType, wireRoutingDetails));
    }

    @Override // com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment.Callbacks
    public void onSinkAccountSelected(TransferAccount account, IraContributionQuestionnaireResult.IraContribution iraContributionInfo) {
        onSinkAccountSelected(account, iraContributionInfo, null, null);
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

    @Override // com.robinhood.android.transfers.contracts.TransferSuccessCallbacks
    public void onTransferConfirmationComplete(PostTransferFlow postTransferFlow) {
        Intrinsics.checkNotNullParameter(postTransferFlow, "postTransferFlow");
        if (getTransferConfiguration().getSkipPostTransferAction()) {
            UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(getUserLeapManager(), this, getTransferConfiguration().getEntryPoint());
            finish();
        } else {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C306351(postTransferFlow.getPostTransferPagesAction(), this, postTransferFlow, null), 3, null);
        }
    }

    /* compiled from: CreateTransferActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferActivity$onTransferConfirmationComplete$1", m3645f = "CreateTransferActivity.kt", m3646l = {475}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferActivity$onTransferConfirmationComplete$1 */
    static final class C306351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PostTransferFlow3 $action;
        final /* synthetic */ PostTransferFlow $postTransferFlow;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CreateTransferActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C306351(PostTransferFlow3 postTransferFlow3, CreateTransferActivity createTransferActivity, PostTransferFlow postTransferFlow, Continuation<? super C306351> continuation) {
            super(2, continuation);
            this.$action = postTransferFlow3;
            this.this$0 = createTransferActivity;
            this.$postTransferFlow = postTransferFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C306351 c306351 = new C306351(this.$action, this.this$0, this.$postTransferFlow, continuation);
            c306351.L$0 = obj;
            return c306351;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C306351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                        if ((this.this$0.getTransferConfiguration() instanceof TransferConfiguration.Standard) && i2 < 3) {
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
                            bundle.putParcelable("recurringDepositHookAction", this.$action);
                            Unit unit = Unit.INSTANCE;
                            RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) companion.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(i3, string2, null, string3, null, string4, null, string5, numBoxInt, false, false, null, bundle, null, false, true, false, false, null, null, null, 2059860, null));
                            FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                            rhBottomSheetDialogFragment.show(supportFragmentManager, "rhyRecurringDepositHook");
                        }
                        SurveyManager3 userLeapManager = this.this$0.getUserLeapManager();
                        CreateTransferActivity createTransferActivity = this.this$0;
                        UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(userLeapManager, createTransferActivity, createTransferActivity.getTransferConfiguration().getEntryPoint());
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
                        SurveyManager3 userLeapManager2 = this.this$0.getUserLeapManager();
                        CreateTransferActivity createTransferActivity2 = this.this$0;
                        UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(userLeapManager2, createTransferActivity2, createTransferActivity2.getTransferConfiguration().getEntryPoint());
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
                        SurveyManager3 userLeapManager22 = this.this$0.getUserLeapManager();
                        CreateTransferActivity createTransferActivity22 = this.this$0;
                        UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(userLeapManager22, createTransferActivity22, createTransferActivity22.getTransferConfiguration().getEntryPoint());
                        this.this$0.finish();
                    } else if (postTransferFlow32 instanceof PostTransferFlow3.ShowRecurringDepositUpsell) {
                        int i6 = this.this$0.getRecurringDepositUpsellExposureCountPref().get();
                        if (this.this$0.getAllowUnlimitedRecurringDepositUpsell() || i6 < 3) {
                            this.this$0.getRecurringDepositUpsellExposureCountPref().set(i6 + 1);
                            this.this$0.replaceFragment(RecurringFrequencyUpsellFragment.INSTANCE.newInstance(((PostTransferFlow3.ShowRecurringDepositUpsell) this.$action).getTransferAmount(), ((PostTransferFlow3.ShowRecurringDepositUpsell) this.$action).getAchRelationshipId(), ((PostTransferFlow3.ShowRecurringDepositUpsell) this.$action).getRhsAccountNumber(), ((PostTransferFlow3.ShowRecurringDepositUpsell) this.$action).getSinkAccountType()));
                        }
                        SurveyManager3 userLeapManager222 = this.this$0.getUserLeapManager();
                        CreateTransferActivity createTransferActivity222 = this.this$0;
                        UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(userLeapManager222, createTransferActivity222, createTransferActivity222.getTransferConfiguration().getEntryPoint());
                        this.this$0.finish();
                    } else if (postTransferFlow32 instanceof PostTransferFlow3.ShowGoldUpsellPage) {
                        MicrogramComponent microgramComponentCreate$default = MicrogramComponent.Factory.DefaultImpls.create$default(this.this$0.getMicrogramComponentFactory(), coroutineScope, new RemoteMicrogramApplication("app-resurrection-lifetime-improvements", null, 2, null), null, 4, null);
                        CreateTransferActivity createTransferActivity3 = this.this$0;
                        ExperimentsStore experimentsStore = createTransferActivity3.getExperimentsStore();
                        EventLogger eventLogger = this.this$0.getEventLogger();
                        IntPreference goldDepositUpsellExposureCountPref = this.this$0.getGoldDepositUpsellExposureCountPref();
                        PostTransferFlow3.ShowGoldUpsellPage showGoldUpsellPage = (PostTransferFlow3.ShowGoldUpsellPage) this.$action;
                        this.label = 1;
                        objCheckPostTransfersGoldUpsellPageImpression = PostTransfersActionImpressionCapUtil.checkPostTransfersGoldUpsellPageImpression(createTransferActivity3, experimentsStore, eventLogger, goldDepositUpsellExposureCountPref, showGoldUpsellPage, microgramComponentCreate$default, this);
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
                    SurveyManager3 userLeapManager2222 = this.this$0.getUserLeapManager();
                    CreateTransferActivity createTransferActivity2222 = this.this$0;
                    UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(userLeapManager2222, createTransferActivity2222, createTransferActivity2222.getTransferConfiguration().getEntryPoint());
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
            SurveyManager3 userLeapManager22222 = this.this$0.getUserLeapManager();
            CreateTransferActivity createTransferActivity22222 = this.this$0;
            UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(userLeapManager22222, createTransferActivity22222, createTransferActivity22222.getTransferConfiguration().getEntryPoint());
            this.this$0.finish();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onPrimaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        if (dialogId == C30065R.id.dialog_id_rhy_recurring_deposit_hook) {
            Intrinsics.checkNotNull(passthroughArgs);
            Parcelable parcelable = passthroughArgs.getParcelable("recurringDepositHookAction");
            Intrinsics.checkNotNull(parcelable);
            final PostTransferFlow3.ShowRhyRecurringDepositHook showRhyRecurringDepositHook = (PostTransferFlow3.ShowRhyRecurringDepositHook) parcelable;
            EventLogger eventLogger = getEventLogger();
            UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
            Companion companion = INSTANCE;
            EventLogger.DefaultImpls.logTap$default(eventLogger, action, companion.getPostTransfersScreen(), companion.getRadHookComponent(), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PostTransferActionContext(PostTransferActionContext.PostTransferActionType.RHY_RECURRING_UPSELL, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -65537, -1, -1, 16383, null), false, 40, null);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferActivity.onPrimaryButtonClicked.1
                @Override // java.lang.Runnable
                public final void run() {
                    Navigator.DefaultImpls.startActivity$default(CreateTransferActivity.this.getNavigator(), CreateTransferActivity.this, new Transfer(new TransferConfiguration.RadHook(showRhyRecurringDepositHook.getTransferAmount(), showRhyRecurringDepositHook.getAchRelationshipId(), showRhyRecurringDepositHook.getSinkAccountType(), MAXTransferContext.EntryPoint.RHY_RECURRING_UPSELL)), null, false, null, null, 60, null);
                }
            });
            finish();
            return true;
        }
        return super.onPrimaryButtonClicked(dialogId, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onSecondaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        if (dialogId == C30065R.id.dialog_id_rhy_recurring_deposit_hook) {
            EventLogger eventLogger = getEventLogger();
            UserInteractionEventData.Action action = UserInteractionEventData.Action.DISMISS;
            Companion companion = INSTANCE;
            EventLogger.DefaultImpls.logTap$default(eventLogger, action, companion.getPostTransfersScreen(), companion.getRadHookComponent(), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PostTransferActionContext(PostTransferActionContext.PostTransferActionType.RHY_RECURRING_UPSELL, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -65537, -1, -1, 16383, null), false, 40, null);
            UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(getUserLeapManager(), this, getTransferConfiguration().getEntryPoint());
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

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C9631R.id.dialog_id_deactivated_account || id == C39496R.id.dialog_id_post_transfer) {
            UserLeapManagers.presentGoldWelcomeSurveyAndReturnToMainIfNeeded(getUserLeapManager(), this, getTransferConfiguration().getEntryPoint());
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

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    /* renamed from: requiresAuthentication */
    public boolean getShouldPromptForLockScreen() {
        return !((getTransferConfiguration() instanceof TransferConfiguration.PostDebitCardLinking) || getTransferConfiguration().getUseQueuedDepositMode());
    }

    /* compiled from: CreateTransferActivity.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/transfers/contracts/Transfer;", "<init>", "()V", "EXTRA_DEEP_LINK_METADATA", "", "EXTRA_TRANSFER_CONFIGURATION", "RECURRING_DEPOSIT_HOOK_ACTION_KEY", "postTransfersScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getPostTransfersScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "postTransfersScreen$delegate", "Lkotlin/Lazy;", "radHookComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getRadHookComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "radHookComponent$delegate", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<Transfer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Screen getPostTransfersScreen() {
            return (Screen) CreateTransferActivity.postTransfersScreen$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Component getRadHookComponent() {
            return (Component) CreateTransferActivity.radHookComponent$delegate.getValue();
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(android.content.Context context, Transfer key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intentPutExtra = new Intent(context, (Class<?>) CreateTransferActivity.class).putExtra(CreateTransferActivity.EXTRA_DEEP_LINK_METADATA, key.getDeepLinkMetadata()).putExtra(CreateTransferActivity.EXTRA_TRANSFER_CONFIGURATION, key.getTransferConfiguration());
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen postTransfersScreen_delegate$lambda$3() {
        return new Screen(Screen.Name.POST_TRANSFER_CONFIRMATION, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Component radHookComponent_delegate$lambda$4() {
        return new Component(Component.ComponentType.RECURRING_DEPOSIT_MAX_TRANSFER_HOOK_DIALOG, null, null, 6, null);
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
}
