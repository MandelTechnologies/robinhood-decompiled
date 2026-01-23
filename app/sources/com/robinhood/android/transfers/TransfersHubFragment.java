package com.robinhood.android.transfers;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.LogOnceAnalytics;
import com.robinhood.analytics.LogOnceEventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.banking.experiments.TransfersRedesignExperiment;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.banking.p065ui.AchRelationshipAdapter;
import com.robinhood.android.banking.p065ui.DebitCardUserStatusBannerView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.UnifiedHistoryView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.tabs.Scrollable;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.funding.logging.AchTransfers2;
import com.robinhood.android.moneymovement.strings.C22208R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.transfers.AchBottomSheetFragment;
import com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogFragment;
import com.robinhood.android.transfers.contracts.LinkingOptionsIntentKey;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.Wires;
import com.robinhood.android.transfers.transferhub.BindingHelpers;
import com.robinhood.android.transfers.transferhub.C30556R;
import com.robinhood.android.transfers.transferhub.TransferHubEvent;
import com.robinhood.android.transfers.transferhub.TransferHubFragmentExtensions;
import com.robinhood.android.transfers.transferhub.databinding.FragmentTransfersHubBinding;
import com.robinhood.android.transfers.transferhub.preferences.TransfersHubMicrogramHeightPref;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.android.util.style.DesignSystemLegacyShim;
import com.robinhood.android.util.style.ThemeAttributes;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.prefs.FloatPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.rosetta.eventlogging.WiresContext;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.history.formatters.legacy.transfers.CancelSummaryBadgeManager;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.p409ui.fragment.DialogFragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import com.robinhood.utils.p409ui.lifecycle.ContextLifecycles;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: TransfersHubFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ª\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002ª\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0016J \u0010\u0084\u0001\u001a\u00030\u0081\u00012\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001H\u0016J\n\u0010\u0089\u0001\u001a\u00030\u0081\u0001H\u0016J\n\u0010\u008a\u0001\u001a\u00030\u0081\u0001H\u0016J\n\u0010\u008b\u0001\u001a\u00030\u0081\u0001H\u0016J\u0014\u0010\u008c\u0001\u001a\u00030\u0081\u00012\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0016J\n\u0010\u008f\u0001\u001a\u00030\u0081\u0001H\u0016J\u0014\u0010\u0090\u0001\u001a\u00030\u0081\u00012\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001H\u0016J\n\u0010\u0093\u0001\u001a\u00030\u0081\u0001H\u0016J\u0014\u0010\u0094\u0001\u001a\u00030\u0081\u00012\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001H\u0016J\u0014\u0010\u0095\u0001\u001a\u00030\u0081\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0002J\u0014\u0010\u0098\u0001\u001a\u00030\u0081\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0002J\u0014\u0010\u0099\u0001\u001a\u00030\u0081\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0002J\u0014\u0010\u009a\u0001\u001a\u00030\u0081\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0002J\u0014\u0010\u009b\u0001\u001a\u00030\u0081\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0002J\u0014\u0010\u009c\u0001\u001a\u00030\u0081\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0002J\n\u0010\u009f\u0001\u001a\u00030\u0081\u0001H\u0016J\u0014\u0010 \u0001\u001a\u00030\u0081\u00012\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0016J!\u0010£\u0001\u001a\u00030\u0081\u00012\u000f\u0010¤\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010¥\u0001H\u0016¢\u0006\u0003\u0010§\u0001J\u0010\u0010¨\u0001\u001a\u00030\u0081\u0001H\u0003¢\u0006\u0003\u0010©\u0001R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0013\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0013\u001a\u0004\b*\u0010+R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0013\u001a\u0004\b/\u00100R\u001b\u00102\u001a\u0002038@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0013\u001a\u0004\b4\u00105R!\u00107\u001a\b\u0012\u0004\u0012\u000209088FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b:\u0010;R\u000e\u0010>\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010@\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bB\u0010CR\u001e\u0010E\u001a\u00020F8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010K\u001a\u00020L8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001e\u0010Q\u001a\u00020R8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001e\u0010W\u001a\u00020X8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010]\u001a\u00020^8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b_\u0010\u0007\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001b\u0010d\u001a\u00020e8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bh\u0010=\u001a\u0004\bf\u0010gR\u001b\u0010i\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010=\u001a\u0004\bk\u0010lR\u001b\u0010n\u001a\u00020o8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\br\u0010=\u001a\u0004\bp\u0010qR\u001b\u0010s\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010=\u001a\u0004\bu\u0010vR\u000e\u0010x\u001a\u00020yX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010{\u001a\u00020\t2\u0006\u0010z\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b~\u0010\u007f\u001a\u0004\b{\u0010\u000b\"\u0004\b|\u0010}¨\u0006«\u0001"}, m3636d2 = {"Lcom/robinhood/android/transfers/TransfersHubFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/transfers/canceltransfer/CancelTransferConfirmationDialogFragment$Callbacks;", "Lcom/robinhood/android/banking/ui/DebitCardUserStatusBannerView$Callbacks;", "Lcom/robinhood/android/common/history/ui/UnifiedHistoryView$Callbacks;", "Lcom/robinhood/android/common/ui/tabs/Scrollable;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "childFragmentsShouldNotConfigureToolbar", "getChildFragmentsShouldNotConfigureToolbar", "scrollView", "Landroidx/core/widget/NestedScrollView;", "getScrollView", "()Landroidx/core/widget/NestedScrollView;", "scrollView$delegate", "Lkotlin/properties/ReadOnlyProperty;", BentoCurrencyPicker.ROOT_TEST_TAG, "Landroid/view/ViewGroup;", "getRoot", "()Landroid/view/ViewGroup;", "root$delegate", "loadingComposeView", "Landroidx/compose/ui/platform/ComposeView;", "getLoadingComposeView", "()Landroidx/compose/ui/platform/ComposeView;", "loadingComposeView$delegate", "accountInfoTxt", "Landroid/widget/TextView;", "getAccountInfoTxt", "()Landroid/widget/TextView;", "accountInfoTxt$delegate", "accountCard", "Landroidx/cardview/widget/CardView;", "getAccountCard", "()Landroidx/cardview/widget/CardView;", "accountCard$delegate", "achRelationshipsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getAchRelationshipsRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "achRelationshipsRecyclerView$delegate", "linkAccountBtn", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "getLinkAccountBtn", "()Lcom/robinhood/android/designsystem/row/RdsRowView;", "linkAccountBtn$delegate", "binding", "Lcom/robinhood/android/transfers/transferhub/databinding/FragmentTransfersHubBinding;", "getBinding$feature_transfer_hub_externalDebug", "()Lcom/robinhood/android/transfers/transferhub/databinding/FragmentTransfersHubBinding;", "binding$delegate", "errorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "getErrorHandler", "()Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "errorHandler$delegate", "Lkotlin/Lazy;", "achRelationshipsAdapter", "Lcom/robinhood/android/banking/ui/AchRelationshipAdapter;", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "cancelSummaryBadgeManager", "Lcom/robinhood/shared/history/formatters/legacy/transfers/CancelSummaryBadgeManager;", "getCancelSummaryBadgeManager", "()Lcom/robinhood/shared/history/formatters/legacy/transfers/CancelSummaryBadgeManager;", "setCancelSummaryBadgeManager", "(Lcom/robinhood/shared/history/formatters/legacy/transfers/CancelSummaryBadgeManager;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "transfersHubMicrogramHeightPref", "Lcom/robinhood/prefs/FloatPreference;", "getTransfersHubMicrogramHeightPref$annotations", "getTransfersHubMicrogramHeightPref", "()Lcom/robinhood/prefs/FloatPreference;", "setTransfersHubMicrogramHeightPref", "(Lcom/robinhood/prefs/FloatPreference;)V", "lastTransfersHubMicrogramHeight", "", "getLastTransfersHubMicrogramHeight$feature_transfer_hub_externalDebug", "()F", "lastTransfersHubMicrogramHeight$delegate", "duxo", "Lcom/robinhood/android/transfers/TransfersHubDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/TransfersHubDuxo;", "duxo$delegate", "logOnceAnalytics", "Lcom/robinhood/analytics/LogOnceAnalytics;", "getLogOnceAnalytics$feature_transfer_hub_externalDebug", "()Lcom/robinhood/analytics/LogOnceAnalytics;", "logOnceAnalytics$delegate", "logOnceEventLogger", "Lcom/robinhood/analytics/LogOnceEventLogger;", "getLogOnceEventLogger", "()Lcom/robinhood/analytics/LogOnceEventLogger;", "logOnceEventLogger$delegate", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "<set-?>", "isInGuidedTransfersExperiment", "setInGuidedTransfersExperiment", "(Z)V", "isInGuidedTransfersExperiment$delegate", "Lkotlin/properties/ReadWriteProperty;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onResume", "onDestroyView", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "scrollToTop", "doOnTransactionDetailRequested", "historyEvent", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "onRecentHistoryShowAllClicked", "onSummaryBadgeClicked", "bindViewState", "state", "Lcom/robinhood/android/transfers/TransfersHubViewState;", "bindRetirementTransferExperimentalRow", "bindAchRelationshipSection", "bindDebitCardSection", "bindHistorySections", "onClickAchRelationship", "relationship", "Lcom/robinhood/models/db/AchRelationship;", "onCancelSuccess", "onCancelFailure", "t", "", "onClickInfoBanner", "intents", "", "Landroid/content/Intent;", "([Landroid/content/Intent;)V", "LoadingView", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TransfersHubFragment extends BaseFragment implements CancelTransferConfirmationDialogFragment.Callbacks, DebitCardUserStatusBannerView.Callbacks, UnifiedHistoryView.Callbacks, Scrollable {

    /* renamed from: accountCard$delegate, reason: from kotlin metadata */
    private final Interfaces2 accountCard;

    /* renamed from: accountInfoTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 accountInfoTxt;
    private final AchRelationshipAdapter achRelationshipsAdapter;

    /* renamed from: achRelationshipsRecyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 achRelationshipsRecyclerView;
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public CancelSummaryBadgeManager cancelSummaryBadgeManager;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: errorHandler$delegate, reason: from kotlin metadata */
    private final Lazy errorHandler;
    public EventLogger eventLogger;
    public ExperimentsStore experimentsStore;

    /* renamed from: isInGuidedTransfersExperiment$delegate, reason: from kotlin metadata */
    private final Interfaces3 isInGuidedTransfersExperiment;

    /* renamed from: lastTransfersHubMicrogramHeight$delegate, reason: from kotlin metadata */
    private final Lazy lastTransfersHubMicrogramHeight;

    /* renamed from: linkAccountBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 linkAccountBtn;

    /* renamed from: loadingComposeView$delegate, reason: from kotlin metadata */
    private final Interfaces2 loadingComposeView;

    /* renamed from: logOnceAnalytics$delegate, reason: from kotlin metadata */
    private final Lazy logOnceAnalytics;

    /* renamed from: logOnceEventLogger$delegate, reason: from kotlin metadata */
    private final Lazy logOnceEventLogger;

    /* renamed from: root$delegate, reason: from kotlin metadata */
    private final Interfaces2 root;
    private final Screen screen;

    /* renamed from: scrollView$delegate, reason: from kotlin metadata */
    private final Interfaces2 scrollView;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    public FloatPreference transfersHubMicrogramHeightPref;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TransfersHubFragment.class, "scrollView", "getScrollView()Landroidx/core/widget/NestedScrollView;", 0)), Reflection.property1(new PropertyReference1Impl(TransfersHubFragment.class, BentoCurrencyPicker.ROOT_TEST_TAG, "getRoot()Landroid/view/ViewGroup;", 0)), Reflection.property1(new PropertyReference1Impl(TransfersHubFragment.class, "loadingComposeView", "getLoadingComposeView()Landroidx/compose/ui/platform/ComposeView;", 0)), Reflection.property1(new PropertyReference1Impl(TransfersHubFragment.class, "accountInfoTxt", "getAccountInfoTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(TransfersHubFragment.class, "accountCard", "getAccountCard()Landroidx/cardview/widget/CardView;", 0)), Reflection.property1(new PropertyReference1Impl(TransfersHubFragment.class, "achRelationshipsRecyclerView", "getAchRelationshipsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), Reflection.property1(new PropertyReference1Impl(TransfersHubFragment.class, "linkAccountBtn", "getLinkAccountBtn()Lcom/robinhood/android/designsystem/row/RdsRowView;", 0)), Reflection.property1(new PropertyReference1Impl(TransfersHubFragment.class, "binding", "getBinding$feature_transfer_hub_externalDebug()Lcom/robinhood/android/transfers/transferhub/databinding/FragmentTransfersHubBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(TransfersHubFragment.class, "isInGuidedTransfersExperiment", "isInGuidedTransfersExperiment()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingView$lambda$29(TransfersHubFragment transfersHubFragment, int i, Composer composer, int i2) {
        transfersHubFragment.LoadingView(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @TransfersHubMicrogramHeightPref
    public static /* synthetic */ void getTransfersHubMicrogramHeightPref$annotations() {
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    public TransfersHubFragment() {
        super(C30556R.layout.fragment_transfers_hub);
        this.scrollView = bindView(C30556R.id.move_money_scroll_view);
        this.root = bindView(C30556R.id.move_money_root);
        this.loadingComposeView = bindView(C30556R.id.loading_compose_view);
        this.accountInfoTxt = bindView(C30556R.id.move_money_account_info_section_header_txt);
        this.accountCard = bindView(C30556R.id.move_money_account_card);
        this.achRelationshipsRecyclerView = bindView(C30556R.id.move_money_relationships_recycler_view);
        this.linkAccountBtn = bindView(C30556R.id.move_money_relationships_link_account);
        this.binding = ViewBinding5.viewBinding(this, TransfersHubFragment5.INSTANCE);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.errorHandler = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.android.transfers.TransfersHubFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransfersHubFragment.errorHandler_delegate$lambda$0(this.f$0);
            }
        });
        this.achRelationshipsAdapter = new AchRelationshipAdapter(false, 1, null);
        this.toolbarScrollAnimator = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.android.transfers.TransfersHubFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransfersHubFragment.toolbarScrollAnimator_delegate$lambda$1(this.f$0);
            }
        });
        this.lastTransfersHubMicrogramHeight = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.TransfersHubFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(TransfersHubFragment.lastTransfersHubMicrogramHeight_delegate$lambda$2(this.f$0));
            }
        });
        this.duxo = DuxosKt.duxo(this, TransfersHubDuxo.class);
        this.logOnceAnalytics = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.TransfersHubFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransfersHubFragment.logOnceAnalytics_delegate$lambda$3(this.f$0);
            }
        });
        this.logOnceEventLogger = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.TransfersHubFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransfersHubFragment.logOnceEventLogger_delegate$lambda$4(this.f$0);
            }
        });
        this.screen = new Screen(Screen.Name.TRANSFERS, null, null, null, 14, null);
        this.isInGuidedTransfersExperiment = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[8]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NestedScrollView getScrollView() {
        return (NestedScrollView) this.scrollView.getValue(this, $$delegatedProperties[0]);
    }

    private final ViewGroup getRoot() {
        return (ViewGroup) this.root.getValue(this, $$delegatedProperties[1]);
    }

    public final ComposeView getLoadingComposeView() {
        return (ComposeView) this.loadingComposeView.getValue(this, $$delegatedProperties[2]);
    }

    private final TextView getAccountInfoTxt() {
        return (TextView) this.accountInfoTxt.getValue(this, $$delegatedProperties[3]);
    }

    private final CardView getAccountCard() {
        return (CardView) this.accountCard.getValue(this, $$delegatedProperties[4]);
    }

    private final RecyclerView getAchRelationshipsRecyclerView() {
        return (RecyclerView) this.achRelationshipsRecyclerView.getValue(this, $$delegatedProperties[5]);
    }

    private final RdsRowView getLinkAccountBtn() {
        return (RdsRowView) this.linkAccountBtn.getValue(this, $$delegatedProperties[6]);
    }

    public final FragmentTransfersHubBinding getBinding$feature_transfer_hub_externalDebug() {
        Object value = this.binding.getValue(this, $$delegatedProperties[7]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentTransfersHubBinding) value;
    }

    public final ActivityErrorHandler getErrorHandler() {
        return (ActivityErrorHandler) this.errorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityErrorHandler errorHandler_delegate$lambda$0(TransfersHubFragment transfersHubFragment) {
        FragmentActivity fragmentActivityRequireActivity = transfersHubFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new ActivityErrorHandler(fragmentActivityRequireActivity, true, 0, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$1(TransfersHubFragment transfersHubFragment) {
        RhToolbar rhToolbar = transfersHubFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        return new ToolbarScrollAnimator(rhToolbar, transfersHubFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), true, false, false, (Float) null, 56, (DefaultConstructorMarker) null);
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

    public final CancelSummaryBadgeManager getCancelSummaryBadgeManager() {
        CancelSummaryBadgeManager cancelSummaryBadgeManager = this.cancelSummaryBadgeManager;
        if (cancelSummaryBadgeManager != null) {
            return cancelSummaryBadgeManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cancelSummaryBadgeManager");
        return null;
    }

    public final void setCancelSummaryBadgeManager(CancelSummaryBadgeManager cancelSummaryBadgeManager) {
        Intrinsics.checkNotNullParameter(cancelSummaryBadgeManager, "<set-?>");
        this.cancelSummaryBadgeManager = cancelSummaryBadgeManager;
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

    public final FloatPreference getTransfersHubMicrogramHeightPref() {
        FloatPreference floatPreference = this.transfersHubMicrogramHeightPref;
        if (floatPreference != null) {
            return floatPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transfersHubMicrogramHeightPref");
        return null;
    }

    public final void setTransfersHubMicrogramHeightPref(FloatPreference floatPreference) {
        Intrinsics.checkNotNullParameter(floatPreference, "<set-?>");
        this.transfersHubMicrogramHeightPref = floatPreference;
    }

    /* renamed from: getLastTransfersHubMicrogramHeight$feature_transfer_hub_externalDebug */
    public final float m2517xe26e8dce() {
        return ((Number) this.lastTransfersHubMicrogramHeight.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float lastTransfersHubMicrogramHeight_delegate$lambda$2(TransfersHubFragment transfersHubFragment) {
        return transfersHubFragment.getTransfersHubMicrogramHeightPref().get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransfersHubDuxo getDuxo() {
        return (TransfersHubDuxo) this.duxo.getValue();
    }

    public final LogOnceAnalytics getLogOnceAnalytics$feature_transfer_hub_externalDebug() {
        return (LogOnceAnalytics) this.logOnceAnalytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogOnceAnalytics logOnceAnalytics_delegate$lambda$3(TransfersHubFragment transfersHubFragment) {
        return new LogOnceAnalytics(transfersHubFragment.getAnalytics());
    }

    private final LogOnceEventLogger getLogOnceEventLogger() {
        return (LogOnceEventLogger) this.logOnceEventLogger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogOnceEventLogger logOnceEventLogger_delegate$lambda$4(TransfersHubFragment transfersHubFragment) {
        return new LogOnceEventLogger(transfersHubFragment.getEventLogger());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInGuidedTransfersExperiment() {
        return ((Boolean) this.isInGuidedTransfersExperiment.getValue(this, $$delegatedProperties[8])).booleanValue();
    }

    private final void setInGuidedTransfersExperiment(boolean z) {
        this.isInGuidedTransfersExperiment.setValue(this, $$delegatedProperties[8], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager2.getScarletManager(scarletContextWrapper).putOverlay(DesignSystemLegacyShim.INSTANCE, Boolean.FALSE);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getCancelSummaryBadgeManager().setInTransfersHub(true);
        FrameLayout root = getBinding$feature_transfer_hub_externalDebug().includeDebitCardUserStatusBannerView.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(8);
        FrameLayout frameLayout = getBinding$feature_transfer_hub_externalDebug().ctaPlaceholder;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = MathKt.roundToInt(getTransfersHubMicrogramHeightPref().get() * frameLayout.getResources().getDisplayMetrics().density);
        frameLayout.setLayoutParams(layoutParams);
        if (savedInstanceState == null) {
            getChildFragmentManager().beginTransaction().add(C30556R.id.move_money_routing_account_actions_fragment, Navigator.DefaultImpls.createFragment$default(getNavigator(), new LegacyFragmentKey.AchAccountInfo(false, false, true, 1, null), null, 2, null), "routing-account-actions").commit();
        }
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_MOVE_MONEY, AnalyticsStrings.BUTTON_MOVE_MONEY_TRANSFER_TO_ROBINHOOD, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_MOVE_MONEY, AnalyticsStrings.BUTTON_MOVE_MONEY_TRANSFER_TO_BANK, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_MOVE_MONEY, AnalyticsStrings.BUTTON_MOVE_MONEY_SCHEDULE_AUTO_DEPOSIT, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        BaseFragment.collectDuxoState$default(this, null, new C300782(null), 1, null);
        FragmentTransfersHubBinding binding$feature_transfer_hub_externalDebug = getBinding$feature_transfer_hub_externalDebug();
        binding$feature_transfer_hub_externalDebug.moveMoneyIacInfoBanner.bind(null, IacInfoBannerLocation.INFO_BANNER_TRANSFERS_HUB_MOBILE_TOP_LEVEL, PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, C2002Dp.m7995constructorimpl(8), 0.0f, 0.0f, 13, null));
        RdsRowView moveMoneyRowTransfer = binding$feature_transfer_hub_externalDebug.moveMoneyRowTransfer;
        Intrinsics.checkNotNullExpressionValue(moveMoneyRowTransfer, "moveMoneyRowTransfer");
        OnClickListeners.onClick(moveMoneyRowTransfer, new Function0() { // from class: com.robinhood.android.transfers.TransfersHubFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransfersHubFragment.onViewCreated$lambda$13$lambda$8(this.f$0);
            }
        });
        RdsRowView moveMoneyRowWires = binding$feature_transfer_hub_externalDebug.moveMoneyRowWires;
        Intrinsics.checkNotNullExpressionValue(moveMoneyRowWires, "moveMoneyRowWires");
        OnClickListeners.onClick(moveMoneyRowWires, new Function0() { // from class: com.robinhood.android.transfers.TransfersHubFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransfersHubFragment.onViewCreated$lambda$13$lambda$9(this.f$0);
            }
        });
        UnifiedHistoryView unifiedHistoryView = binding$feature_transfer_hub_externalDebug.moveMoneyPendingHistory;
        unifiedHistoryView.setItemAnimator(null);
        unifiedHistoryView.setCallbacks(this);
        UnifiedHistoryView unifiedHistoryView2 = binding$feature_transfer_hub_externalDebug.moveMoneyHistory;
        unifiedHistoryView2.setItemAnimator(null);
        unifiedHistoryView2.setCallbacks(this);
        RdsRowView moveMoneyRowRetirementTransfer = binding$feature_transfer_hub_externalDebug.moveMoneyRowRetirementTransfer;
        Intrinsics.checkNotNullExpressionValue(moveMoneyRowRetirementTransfer, "moveMoneyRowRetirementTransfer");
        ViewsKt.eventData$default(moveMoneyRowRetirementTransfer, false, new Function0() { // from class: com.robinhood.android.transfers.TransfersHubFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransfersHubFragment.onViewCreated$lambda$13$lambda$12(this.f$0);
            }
        }, 1, null);
        binding$feature_transfer_hub_externalDebug.loadingComposeView.setContent(ComposableLambda3.composableLambdaInstance(-895947552, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.TransfersHubFragment$onViewCreated$3$6
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
                    ComposerKt.traceEventStart(-895947552, i, -1, "com.robinhood.android.transfers.TransfersHubFragment.onViewCreated.<anonymous>.<anonymous> (TransfersHubFragment.kt:308)");
                }
                final TransfersHubFragment transfersHubFragment = this.this$0;
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1378665512, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.TransfersHubFragment$onViewCreated$3$6.1
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
                            ComposerKt.traceEventStart(1378665512, i2, -1, "com.robinhood.android.transfers.TransfersHubFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (TransfersHubFragment.kt:309)");
                        }
                        transfersHubFragment.LoadingView(composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 100663296, 255);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        getAchRelationshipsRecyclerView().setAdapter(this.achRelationshipsAdapter);
        FragmentTransfersHubBinding binding$feature_transfer_hub_externalDebug2 = getBinding$feature_transfer_hub_externalDebug();
        binding$feature_transfer_hub_externalDebug2.includeDebitCardUserStatusBannerView.debitCardUserStatusBannerView.setScreenName(Screen.Name.TRANSFERS);
        binding$feature_transfer_hub_externalDebug2.includeDebitCardUserStatusBannerView.debitCardUserStatusBannerView.setCallbacks(this);
        OnClickListeners.onClick(getLinkAccountBtn(), new Function0() { // from class: com.robinhood.android.transfers.TransfersHubFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransfersHubFragment.onViewCreated$lambda$15(this.f$0);
            }
        });
        BaseFragment.collectDuxoState$default(this, null, new C300806(null), 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(getExperimentsStore(), new Experiment[]{TransfersRedesignExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.TransfersHubFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransfersHubFragment.onViewCreated$lambda$16(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* compiled from: TransfersHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.TransfersHubFragment$onViewCreated$2", m3645f = "TransfersHubFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.TransfersHubFragment$onViewCreated$2 */
    static final class C300782 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C300782(Continuation<? super C300782> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransfersHubFragment.this.new C300782(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C300782) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TransfersHubFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.TransfersHubFragment$onViewCreated$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ TransfersHubFragment $tmp0;

            AnonymousClass1(TransfersHubFragment transfersHubFragment) {
                this.$tmp0 = transfersHubFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, TransfersHubFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/transfers/TransfersHubViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(TransfersHubViewState transfersHubViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bindViewState = C300782.invokeSuspend$bindViewState(this.$tmp0, transfersHubViewState, continuation);
                return objInvokeSuspend$bindViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bindViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((TransfersHubViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<TransfersHubViewState> stateFlow = TransfersHubFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(TransfersHubFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bindViewState(TransfersHubFragment transfersHubFragment, TransfersHubViewState transfersHubViewState, Continuation continuation) {
            transfersHubFragment.bindViewState(transfersHubViewState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$13$lambda$8(TransfersHubFragment transfersHubFragment) {
        EventLogger.DefaultImpls.logTap$default(transfersHubFragment.getEventLogger(), null, transfersHubFragment.screen, new Component(Component.ComponentType.TRANSFER_ROW, null, null, 6, null), null, null, false, 57, null);
        Navigator navigator = transfersHubFragment.getNavigator();
        Context contextRequireContext = transfersHubFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Transfer(new TransferConfiguration.Standard(null, null, false, null, null, null, MAXTransferContext.EntryPoint.TRANSFER_HUB, null, false, false, null, null, false, 8127, null)), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$13$lambda$9(TransfersHubFragment transfersHubFragment) {
        EventLogger.DefaultImpls.logTap$default(transfersHubFragment.getEventLogger(), null, new Screen(Screen.Name.TRANSFERS, null, null, null, 14, null), new Component(Component.ComponentType.WIRE_TRANSFER_ROW, null, null, 6, null), null, null, false, 57, null);
        Navigator navigator = transfersHubFragment.getNavigator();
        Context contextRequireContext = transfersHubFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Wires(WiresContext.WiresDirection.WIRES_DIRECTION_UNSPECIFIED, WiresContext.EntryPoint.TRANSFERS_HUB), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$13$lambda$12(TransfersHubFragment transfersHubFragment) {
        return new UserInteractionEventDescriptor(null, transfersHubFragment.screen, null, null, new Component(Component.ComponentType.ROW, TransferHubLoggings.ROW_IDENTIFIER_TRANSFER_RETIREMENT_TO_RH, null, 4, null), null, 45, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$15(TransfersHubFragment transfersHubFragment) {
        Navigator navigator = transfersHubFragment.getNavigator();
        Context contextRequireContext = transfersHubFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LinkingOptionsIntentKey(PaymentLinkingContext.EntryPoint.LINKED_ACCOUNTS_SECTION, false, 2, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* compiled from: TransfersHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.TransfersHubFragment$onViewCreated$6", m3645f = "TransfersHubFragment.kt", m3646l = {331}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.TransfersHubFragment$onViewCreated$6 */
    static final class C300806 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C300806(Continuation<? super C300806> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransfersHubFragment.this.new C300806(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C300806) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(TransfersHubFragment.this.getDuxo().getEventFlow());
                final TransfersHubFragment transfersHubFragment = TransfersHubFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.TransfersHubFragment.onViewCreated.6.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<TransferHubEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Event<TransferHubEvent> event, Continuation<? super Unit> continuation) {
                        TransfersHubFragment transfersHubFragment2 = transfersHubFragment;
                        Context contextRequireContext = transfersHubFragment2.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        TransferHubFragmentExtensions.handleNavigationTransferHubEvent(transfersHubFragment2, event, contextRequireContext, transfersHubFragment.isInGuidedTransfersExperiment());
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$16(TransfersHubFragment transfersHubFragment, boolean z) {
        transfersHubFragment.setInGuidedTransfersExperiment(z);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(this.achRelationshipsAdapter.getAchRelationshipClicksObservable()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.TransfersHubFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransfersHubFragment.onStart$lambda$17(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$17(TransfersHubFragment transfersHubFragment, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        transfersHubFragment.onClickAchRelationship((AchRelationship) tuples2.component2());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getToolbarScrollAnimator().subscribe(getScrollView(), this);
        final NestedScrollView scrollView = getScrollView();
        final ViewTreeObserver viewTreeObserver = scrollView.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.robinhood.android.transfers.TransfersHubFragment$onResume$$inlined$safeOnPreDraw$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Context context = scrollView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (Intrinsics.areEqual(ContextLifecycles.isResumed(context), Boolean.TRUE)) {
                    this.getToolbarScrollAnimator().dispatchScroll(this.getScrollView());
                }
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                    return true;
                }
                scrollView.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getCancelSummaryBadgeManager().setInTransfersHub(false);
        super.onDestroyView();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(getString(C30556R.string.move_money_screen_title));
    }

    @Override // com.robinhood.android.common.p088ui.tabs.Scrollable
    public void scrollToTop() {
        getScrollView().smoothScrollTo(0, 0);
    }

    @Override // com.robinhood.android.common.history.ui.UnifiedHistoryView.Callbacks
    public void doOnTransactionDetailRequested(HistoryEvent historyEvent) {
        Intrinsics.checkNotNullParameter(historyEvent, "historyEvent");
        if (historyEvent instanceof AchTransfer) {
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.VIEW_TRANSFER_DETAILS, new Screen(Screen.Name.TRANSFERS, null, null, null, 14, null), new Component(Component.ComponentType.TRANSFER_DETAILS_ROW, null, null, 6, null), null, AchTransfers2.toFundingEventContext((AchTransfer) historyEvent), false, 40, null);
        }
    }

    @Override // com.robinhood.android.common.history.ui.UnifiedHistoryView.Callbacks
    public void onRecentHistoryShowAllClicked() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new AccountsHistoryContract.Key(null, AccountsHistoryTransactionTypeFilter.TRANSFERS, null, null, false, null, 61, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.common.history.ui.UnifiedHistoryView.Callbacks
    public void onSummaryBadgeClicked(HistoryEvent historyEvent) {
        Either<AchTransfer, PaymentTransfer> eitherAsRight;
        Intrinsics.checkNotNullParameter(historyEvent, "historyEvent");
        if (historyEvent instanceof AchTransfer) {
            eitherAsRight = Either2.asLeft(historyEvent);
        } else if (!(historyEvent instanceof PaymentTransfer)) {
            return;
        } else {
            eitherAsRight = Either2.asRight(historyEvent);
        }
        if (getCancelSummaryBadgeManager().shouldShowCancelSummaryBadge(eitherAsRight)) {
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, this.screen, new Component(Component.ComponentType.BUTTON, "CANCEL", null, 4, null), null, null, false, 57, null);
            CancelTransferConfirmationDialogFragment cancelTransferConfirmationDialogFragment = (CancelTransferConfirmationDialogFragment) DialogFragmentWithArgsCompanion.DefaultImpls.newInstance$default(CancelTransferConfirmationDialogFragment.INSTANCE, new CancelTransferConfirmationDialogFragment.Args(historyEvent), 0, 2, null);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            cancelTransferConfirmationDialogFragment.show(childFragmentManager, "cancel_confirmation_dialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(TransfersHubViewState state) {
        ViewGroup root = getRoot();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.transfers.TransfersHubFragment$bindViewState$$inlined$beginDelayedTransition$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.transfers.TransfersHubFragment$bindViewState$$inlined$beginDelayedTransition$2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        Transitions2.add(transitionSet, new Fade());
        TransitionManager.beginDelayedTransition(root, transitionSet);
        if (state.isLoading()) {
            getScrollView().setVisibility(4);
            getLoadingComposeView().setVisibility(0);
            return;
        }
        getScrollView().setVisibility(0);
        getLoadingComposeView().setVisibility(8);
        BindingHelpers.handleShowingTransferHubRowExperienceOrNot(this, state);
        bindRetirementTransferExperimentalRow(state);
        getAccountInfoTxt().setVisibility(state.getIsAccountInfoTextVisible() ? 0 : 8);
        getAccountCard().setVisibility(state.getIsAccountCardVisible() ? 0 : 8);
        bindAchRelationshipSection(state);
        bindDebitCardSection(state);
        bindHistorySections(state);
    }

    private final void bindRetirementTransferExperimentalRow(TransfersHubViewState state) {
        final RdsRowView moveMoneyRowRetirementTransfer = getBinding$feature_transfer_hub_externalDebug().moveMoneyRowRetirementTransfer;
        Intrinsics.checkNotNullExpressionValue(moveMoneyRowRetirementTransfer, "moveMoneyRowRetirementTransfer");
        moveMoneyRowRetirementTransfer.setVisibility(state.getIsRetirementTransferRowVisible() ? 0 : 8);
        if (state.getIsRetirementTransferRowVisible()) {
            ViewsKt.logAppear$default(moveMoneyRowRetirementTransfer, null, false, 3, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Object[] objArr = {new ThemableColorSpans3(ThemeAttributes.INSTANCE.getCOLOR_PRIMARY()), new StyleSpan(1)};
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(getResources().getText(C30556R.string.move_money_transfer_retirement_description_bonus));
            spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
            for (int i = 0; i < 2; i++) {
                spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
            }
            spannableStringBuilder.append(getResources().getText(C30556R.string.gated_gold_move_money_transfer_retirement_description));
            moveMoneyRowRetirementTransfer.setSecondaryText(new SpannedString(spannableStringBuilder));
            OnClickListeners.onClick(moveMoneyRowRetirementTransfer, new Function0() { // from class: com.robinhood.android.transfers.TransfersHubFragment$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransfersHubFragment.bindRetirementTransferExperimentalRow$lambda$22(moveMoneyRowRetirementTransfer, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindRetirementTransferExperimentalRow$lambda$22(RdsRowView rdsRowView, TransfersHubFragment transfersHubFragment) {
        ViewsKt.logTap(rdsRowView);
        Navigator navigator = transfersHubFragment.getNavigator();
        Context contextRequireContext = transfersHubFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse("robinhood://retirement-2024-tax-season-promo?source=transfer-hub"), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    private final void bindAchRelationshipSection(TransfersHubViewState state) {
        this.achRelationshipsAdapter.setAchRelationships(state.getAchRelationships());
    }

    private final void bindDebitCardSection(TransfersHubViewState state) {
        FragmentTransfersHubBinding binding$feature_transfer_hub_externalDebug = getBinding$feature_transfer_hub_externalDebug();
        FrameLayout root = binding$feature_transfer_hub_externalDebug.includeDebitCardUserStatusBannerView.getRoot();
        Intrinsics.checkNotNull(root);
        root.setVisibility(state.getIsDebitCardUserStatusBannerVisible() ? 0 : 8);
        ComposeView composeView = binding$feature_transfer_hub_externalDebug.debitCards;
        composeView.setContent(ComposableLambda3.composableLambdaInstance(-349946917, true, new TransfersHubFragment4(state, composeView, this)));
    }

    private final void bindHistorySections(TransfersHubViewState state) {
        List listFilterNotNull;
        FragmentTransfersHubBinding binding$feature_transfer_hub_externalDebug = getBinding$feature_transfer_hub_externalDebug();
        RhTextView moveMoneyPendingHistorySectionHeaderText = binding$feature_transfer_hub_externalDebug.moveMoneyPendingHistorySectionHeaderText;
        Intrinsics.checkNotNullExpressionValue(moveMoneyPendingHistorySectionHeaderText, "moveMoneyPendingHistorySectionHeaderText");
        moveMoneyPendingHistorySectionHeaderText.setVisibility(state.getIsPendingHistoryItemsSectionVisible() ? 0 : 8);
        UnifiedHistoryView moveMoneyPendingHistory = binding$feature_transfer_hub_externalDebug.moveMoneyPendingHistory;
        Intrinsics.checkNotNullExpressionValue(moveMoneyPendingHistory, "moveMoneyPendingHistory");
        moveMoneyPendingHistory.setVisibility(state.getIsPendingHistoryItemsSectionVisible() ? 0 : 8);
        binding$feature_transfer_hub_externalDebug.moveMoneyPendingHistory.bind(state.getPendingHistoryItems());
        PagedList<StatefulHistoryEvent<HistoryEvent>> pendingHistoryItems = state.getPendingHistoryItems();
        if (pendingHistoryItems != null && (listFilterNotNull = CollectionsKt.filterNotNull(pendingHistoryItems)) != null) {
            Iterator it = listFilterNotNull.iterator();
            while (it.hasNext()) {
                HistoryEvent historyEventComponent1 = ((StatefulHistoryEvent) it.next()).component1();
                Either<AchTransfer, PaymentTransfer> eitherAsLeft = historyEventComponent1 instanceof AchTransfer ? Either2.asLeft(historyEventComponent1) : historyEventComponent1 instanceof PaymentTransfer ? Either2.asRight(historyEventComponent1) : null;
                if (eitherAsLeft != null && getCancelSummaryBadgeManager().shouldShowCancelSummaryBadge(eitherAsLeft)) {
                    LogOnceEventLogger.logAppear$default(getLogOnceEventLogger(), historyEventComponent1.getId() + "_appear", null, this.screen, new Component(Component.ComponentType.BUTTON, "CANCEL", null, 4, null), null, 18, null);
                }
            }
        }
        RhTextView moveMoneyHistorySectionHeaderText = binding$feature_transfer_hub_externalDebug.moveMoneyHistorySectionHeaderText;
        Intrinsics.checkNotNullExpressionValue(moveMoneyHistorySectionHeaderText, "moveMoneyHistorySectionHeaderText");
        moveMoneyHistorySectionHeaderText.setVisibility(state.getIsHistoryItemsSectionVisible() ? 0 : 8);
        binding$feature_transfer_hub_externalDebug.moveMoneyHistorySectionHeaderText.setText(state.getHistorySectionHeaderTitle());
        UnifiedHistoryView moveMoneyHistory = binding$feature_transfer_hub_externalDebug.moveMoneyHistory;
        Intrinsics.checkNotNullExpressionValue(moveMoneyHistory, "moveMoneyHistory");
        moveMoneyHistory.setVisibility(state.getIsHistoryItemsSectionVisible() ? 0 : 8);
        binding$feature_transfer_hub_externalDebug.moveMoneyHistory.bind(state.getHistoryItems());
    }

    private final void onClickAchRelationship(AchRelationship relationship) {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (relationship.getNeedToVerifyMicroDeposits()) {
            Navigator.DefaultImpls.startActivity$default(getNavigator(), contextRequireContext, new LegacyIntentKey.VerifyMicrodeposits(relationship), null, false, null, null, 60, null);
            return;
        }
        if (relationship.getState() == ApiAchRelationship.State.NEEDS_APPROVAL) {
            UUID documentRequestId = relationship.getDocumentRequestId();
            if (documentRequestId != null) {
                getLoadingComposeView().setVisibility(0);
                getDuxo().checkDocumentVerification(documentRequestId);
                return;
            }
            return;
        }
        if (!relationship.getVerified()) {
            RhDialogFragment.Builder message = RhDialogFragment.INSTANCE.create(contextRequireContext).setMessage(C9631R.string.ach_relationship_custom_error_not_verifiable, new Object[0]);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(message, parentFragmentManager, "unverifiable", false, 4, null);
            return;
        }
        AchBottomSheetFragment achBottomSheetFragment = (AchBottomSheetFragment) AchBottomSheetFragment.INSTANCE.newInstance((Parcelable) new AchBottomSheetFragment.Args(relationship));
        FragmentManager parentFragmentManager2 = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "getParentFragmentManager(...)");
        achBottomSheetFragment.show(parentFragmentManager2, "ach-bottom-sheet");
    }

    @Override // com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogFragment.Callbacks
    public void onCancelSuccess() {
        FrameLayout root = getBinding$feature_transfer_hub_externalDebug().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        Snackbars.make(root, C22208R.string.transfer_canceled, 0).show();
    }

    @Override // com.robinhood.android.transfers.canceltransfer.CancelTransferConfirmationDialogFragment.Callbacks
    public void onCancelFailure(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        AbsErrorHandler.handleError$default(getActivityErrorHandler(), t, false, 2, null);
    }

    @Override // com.robinhood.android.banking.ui.DebitCardUserStatusBannerView.Callbacks
    public void onClickInfoBanner(Intent[] intents) {
        Intrinsics.checkNotNullParameter(intents, "intents");
        startActivity((Intent) ArraysKt.last(intents));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void LoadingView(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1291047093);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1291047093, i, -1, "com.robinhood.android.transfers.TransfersHubFragment.LoadingView (TransfersHubFragment.kt:596)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, TransfersHubFragment2.INSTANCE.getLambda$1640357083$feature_transfer_hub_externalDebug(), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.TransfersHubFragment$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TransfersHubFragment.LoadingView$lambda$29(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: TransfersHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/transfers/TransfersHubFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/transfers/TransfersHubFragment;", "<init>", "()V", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<TransfersHubFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((TransfersHubFragment) fragment);
        }

        public Void getArgs(TransfersHubFragment transfersHubFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, transfersHubFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public TransfersHubFragment newInstance() {
            return (TransfersHubFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public TransfersHubFragment newInstance(Void r1) {
            return (TransfersHubFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
