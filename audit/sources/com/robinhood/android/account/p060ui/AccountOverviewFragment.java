package com.robinhood.android.account.p060ui;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.LogOnceEventLogger;
import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.account.p060ui.AccountOverviewCallbacks;
import com.robinhood.android.account.p060ui.AccountOverviewEvent;
import com.robinhood.android.account.p060ui.AccountOverviewFragment;
import com.robinhood.android.account.p060ui.margin.MarginInvestingLearnMoreDialog;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.RhShortcut;
import com.robinhood.android.common.util.RhShortcutManager;
import com.robinhood.android.common.util.TypefaceUtils;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.drip.contracts.DripOnboarding;
import com.robinhood.android.drip.contracts.DripSettings;
import com.robinhood.android.eventcontracts.contracts.HubNavigateUtils2;
import com.robinhood.android.feature.lib.sweep.interest.SweepEnrollmentData;
import com.robinhood.android.feature.lib.sweep.interest.dialog.SweepDisableDialogFragment;
import com.robinhood.android.feature.lib.sweep.interest.dialog.SweepPausedInfoDialogFragment;
import com.robinhood.android.futures.contracts.FuturesOnboardingActivityKey;
import com.robinhood.android.instant.p160ui.InstantCashLogger;
import com.robinhood.android.instant.p160ui.InstantCashLogger2;
import com.robinhood.android.instant.p160ui.InstantCashLogger3;
import com.robinhood.android.instant.p160ui.InstantCashUtils;
import com.robinhood.android.lib.cashdowngrade.CashDowngradeResultContract2;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.mcw.contracts.CashBalanceDetailsKey;
import com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcher;
import com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherLocation;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.AccountOverviewLaunchType;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.regiongate.compose.LocalityProvider;
import com.robinhood.android.sweep.contracts.SweepOnboardingIntentKey;
import com.robinhood.android.transfers.contracts.InternationalTransfer;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.ApiSweepsTimelineSummary;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.PathfinderInitialState;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.p320db.SlipHubCard;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherBottomSheetFragmentKey;
import com.robinhood.shared.content.contracts.RemoteAgreementFragmentKey;
import com.robinhood.shared.content.contracts.RemoteAgreementFragmentKey2;
import com.robinhood.shared.iac.infobanner.InfoBannerComponent;
import com.robinhood.shared.recurring.contracts.RecurringHubFragmentKey;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.moshi.jsonadapter.JsonPrimitive;
import io.noties.markwon.Markwon;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AccountOverviewFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\b\u0007\u0018\u0000 \u0095\u00012\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u0095\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0016J\u001a\u0010<\u001a\u0002092\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010A\u001a\u0002092\u0006\u0010B\u001a\u00020CH\u0016J\u001a\u0010D\u001a\u0002052\u0006\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010H\u001a\u0002092\u0006\u0010I\u001a\u00020JH\u0016J\u0018\u0010K\u001a\u0002092\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0016J\u0012\u0010P\u001a\u0002092\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\b\u0010Q\u001a\u000209H\u0016J\b\u0010R\u001a\u000209H\u0016J\u0018\u0010S\u001a\u0002092\u0006\u0010T\u001a\u0002052\u0006\u0010L\u001a\u00020MH\u0016J\b\u0010U\u001a\u000209H\u0016J\u0016\u0010V\u001a\u0002092\u0006\u0010W\u001a\u00020XH\u0096@¢\u0006\u0002\u0010YJ\u0018\u0010Z\u001a\u0002092\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^H\u0016J \u0010_\u001a\u0002092\u0016\u0010`\u001a\u0012\u0012\u0004\u0012\u00020M\u0012\b\u0012\u0006\u0012\u0002\b\u00030b0aH\u0016J\u0018\u0010c\u001a\u0002092\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u000205H\u0016J\u0010\u0010g\u001a\u0002092\u0006\u0010h\u001a\u00020iH\u0016J\u0010\u0010j\u001a\u0002092\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010k\u001a\u0002092\u0006\u0010L\u001a\u00020MH\u0016J \u0010l\u001a\u0002092\u0016\u0010`\u001a\u0012\u0012\u0004\u0012\u00020M\u0012\b\u0012\u0006\u0012\u0002\b\u00030b0aH\u0016J \u0010m\u001a\u0002092\u0016\u0010`\u001a\u0012\u0012\u0004\u0012\u00020M\u0012\b\u0012\u0006\u0012\u0002\b\u00030b0aH\u0016J\u0010\u0010n\u001a\u0002092\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010o\u001a\u0002092\u0006\u0010p\u001a\u00020FH\u0016J \u0010q\u001a\u0002092\u0016\u0010`\u001a\u0012\u0012\u0004\u0012\u00020M\u0012\b\u0012\u0006\u0012\u0002\b\u00030b0aH\u0016J\b\u0010r\u001a\u000209H\u0016J\b\u0010s\u001a\u000209H\u0016J\b\u0010t\u001a\u000209H\u0016J\b\u0010u\u001a\u000209H\u0016J\b\u0010v\u001a\u000209H\u0016J\u0012\u0010w\u001a\u0002092\b\u0010x\u001a\u0004\u0018\u00010\\H\u0016J\b\u0010y\u001a\u000209H\u0016J \u0010z\u001a\u0002092\u0016\u0010`\u001a\u0012\u0012\u0004\u0012\u00020M\u0012\b\u0012\u0006\u0012\u0002\b\u00030b0aH\u0002J \u0010{\u001a\u0002092\u0016\u0010`\u001a\u0012\u0012\u0004\u0012\u00020M\u0012\b\u0012\u0006\u0012\u0002\b\u00030b0aH\u0002J\u0010\u0010|\u001a\u0002092\u0006\u0010L\u001a\u00020MH\u0002J\u0010\u0010}\u001a\u0002052\u0006\u0010~\u001a\u00020\u0005H\u0016J\u0012\u0010\u007f\u001a\u0002092\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0002J\u001a\u0010\u0082\u0001\u001a\u0002092\u000f\u0010\u0083\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0084\u0001H\u0002J\u000f\u0010\u0086\u0001\u001a\u000209H\u0017¢\u0006\u0003\u0010\u0087\u0001JC\u0010\u0088\u0001\u001a\u0002092\n\b\u0002\u0010\u0089\u0001\u001a\u00030\u008a\u00012\b\u0010L\u001a\u0004\u0018\u00010M2\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010M2\u0007\u0010\u008e\u0001\u001a\u000205H\u0003¢\u0006\u0003\u0010\u008f\u0001J0\u0010\u0090\u0001\u001a\u0002092\u0007\u0010I\u001a\u00030\u0091\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u00032\r\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0003\u0010\u0094\u0001R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u000e\u0010$\u001a\u00020%X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b(\u0010)R+\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020,8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006\u0096\u0001²\u0006\u000b\u0010I\u001a\u00030\u0081\u0001X\u008a\u0084\u0002²\u0006\u0013\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u0098\u0001X\u008a\u008e\u0002²\u0006\r\u0010\u0099\u0001\u001a\u0004\u0018\u00010FX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountOverviewFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/account/ui/AccountOverviewCallbacks;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "shortcutManager", "Lcom/robinhood/android/common/util/RhShortcutManager;", "getShortcutManager", "()Lcom/robinhood/android/common/util/RhShortcutManager;", "setShortcutManager", "(Lcom/robinhood/android/common/util/RhShortcutManager;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "instantCashLogger", "Lcom/robinhood/android/instant/ui/InstantCashLogger;", "getInstantCashLogger", "()Lcom/robinhood/android/instant/ui/InstantCashLogger;", "setInstantCashLogger", "(Lcom/robinhood/android/instant/ui/InstantCashLogger;)V", "logOnceEventLogger", "Lcom/robinhood/analytics/LogOnceEventLogger;", "getLogOnceEventLogger", "()Lcom/robinhood/analytics/LogOnceEventLogger;", "logOnceEventLogger$delegate", "Lkotlin/Lazy;", "markwon", "Lio/noties/markwon/Markwon;", "duxo", "Lcom/robinhood/android/account/ui/AccountOverviewDuxo;", "getDuxo", "()Lcom/robinhood/android/account/ui/AccountOverviewDuxo;", "duxo$delegate", "<set-?>", "Lcom/robinhood/android/navigation/app/keys/data/AccountOverviewLaunchType;", "scrollToSectionState", "getScrollToSectionState", "()Lcom/robinhood/android/navigation/app/keys/data/AccountOverviewLaunchType;", "setScrollToSectionState", "(Lcom/robinhood/android/navigation/app/keys/data/AccountOverviewLaunchType;)V", "scrollToSectionState$delegate", "Landroidx/compose/runtime/MutableState;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onSecondaryButtonClicked", "dialogId", "", "passthroughArgs", "onAccountSelectionDropdownClicked", "state", "Lcom/robinhood/android/account/ui/AccountSelectorState;", "onAccountSelected", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onInvestmentScheduleButtonClicked", "onInvestmentScheduleLearnMoreClicked", "showMarginTerminologyDialog", "onDripSettingsClicked", "isDripOnboarded", "onDripSummaryLearnMoreClicked", "onSlipCtaClicked", "card", "Lcom/robinhood/models/db/SlipHubCard;", "(Lcom/robinhood/models/db/SlipHubCard;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSweepLearnMoreClicked", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "interestRate", "Ljava/math/BigDecimal;", "onSweepSwitchToCashAccountClicked", "inputParams", "", "Lcom/robinhood/utils/moshi/jsonadapter/JsonPrimitive;", "onPausedInfoClick", "sweepEnrollmentData", "Lcom/robinhood/android/feature/lib/sweep/interest/SweepEnrollmentData;", "isInLeveredMarginRegionGate", "onDisableSweepClicked", "account", "Lcom/robinhood/models/db/Account;", "onStartSweepEnrollmentClicked", "onClickViewCashSweep", "onAccountTypeSwitchToCashCtaClicked", "onAccountTypeSwitchToMarginCtaClicked", "onAccountTypeSwitchToLimitedMarginCtaClicked", "onAccountTypeLearnMoreClicked", "urlRes", "onSwitchToMarginAccountClicked", "onApplyToTradeFuturesClicked", "onTradeFuturesClicked", "onApplyToTradeEventContractsClicked", "onReactivateAccountClicked", "onTradeEventContractsClicked", "onPortfolioCashInfoIconClicked", "disclosureContent", "onDepositFundsButtonClicked", "launchSwitchToCashAccountSassyFlow", "launchSwitchToMarginAccountSassyFlow", "launchInstantUpgradeFlow", "handle", "action", "setViewState", "viewState", "Lcom/robinhood/android/account/ui/AccountOverviewViewState;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/account/ui/AccountOverviewEvent;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "AccountOverviewTopAppBar", "modifier", "Landroidx/compose/ui/Modifier;", "topBarState", "Lcom/robinhood/compose/bento/component/TopBarScrollState;", "subtitle", "shouldShowCurrencySwitcher", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/robinhood/compose/bento/component/TopBarScrollState;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V", "AccountOverviewSection", "Lcom/robinhood/android/account/ui/AccountOverviewSectionState;", "callbacks", "actionHandler", "(Lcom/robinhood/android/account/ui/AccountOverviewSectionState;Lcom/robinhood/android/account/ui/AccountOverviewCallbacks;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-account-overview_externalRelease", "stateItems", "", "sectionScrollEvent"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AccountOverviewFragment extends GenericComposeFragment implements AutoLoggableFragment, AccountOverviewCallbacks, SduiActionHandler<GenericAction> {
    private static final String GOLD_SWEEP_INTEREST_RATE_PLACEHOLDER = "gold_sweep_interest_rate";
    private static final String INSTANT_EXPLANATION_DIALOG_TAG = "instant-terminology";
    private static final String SLIP_SECTION_IMPRESSION_ID = "slip_hub_card_impression_id";
    public EventLogger eventLogger;
    public InstantCashLogger instantCashLogger;
    private Markwon markwon;
    public RhShortcutManager shortcutManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: logOnceEventLogger$delegate, reason: from kotlin metadata */
    private final Lazy logOnceEventLogger = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AccountOverviewFragment.logOnceEventLogger_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AccountOverviewDuxo.class);

    /* renamed from: scrollToSectionState$delegate, reason: from kotlin metadata */
    private final SnapshotState scrollToSectionState = SnapshotState3.mutableStateOf$default(AccountOverviewLaunchType.NONE, null, 2, null);

    /* compiled from: AccountOverviewFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountOverviewLaunchType.values().length];
            try {
                iArr[AccountOverviewLaunchType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountOverviewLaunchType.INSTANT_DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountOverviewLaunchType.SWEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountOverviewLaunchType.DAY_TRADE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountOverviewLaunchType.OPTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AccountOverviewLaunchType.FUTURES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AccountOverviewFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewFragment", m3645f = "AccountOverviewFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m3647m = "onSlipCtaClicked")
    /* renamed from: com.robinhood.android.account.ui.AccountOverviewFragment$onSlipCtaClicked$1 */
    static final class C82311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C82311(Continuation<? super C82311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountOverviewFragment.this.onSlipCtaClicked(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountOverviewSection$lambda$19(AccountOverviewFragment accountOverviewFragment, AccountOverviewSectionState accountOverviewSectionState, AccountOverviewCallbacks accountOverviewCallbacks, SduiActionHandler sduiActionHandler, int i, Composer composer, int i2) {
        accountOverviewFragment.AccountOverviewSection(accountOverviewSectionState, accountOverviewCallbacks, sduiActionHandler, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountOverviewTopAppBar$lambda$18(AccountOverviewFragment accountOverviewFragment, Modifier modifier, String str, TopBarScrollState topBarScrollState, String str2, boolean z, int i, int i2, Composer composer, int i3) {
        accountOverviewFragment.AccountOverviewTopAppBar(modifier, str, topBarScrollState, str2, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$17(AccountOverviewFragment accountOverviewFragment, int i, Composer composer, int i2) {
        accountOverviewFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<AccountOverviewEvent> event) {
        EventConsumer<AccountOverviewEvent> eventConsumerInvoke;
        if (!(event.getData() instanceof AccountOverviewEvent.Error) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment$handleEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                m10815invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m10815invoke(Object it) throws Throwable {
                Intrinsics.checkNotNullParameter(it, "it");
                this.getActivityErrorHandler().invoke2(((AccountOverviewEvent.Error) event.getData()).getThrowable());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ComposeContent$lambda$16$lambda$15(final SnapshotState snapshotState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment$ComposeContent$lambda$16$lambda$15$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                snapshotState.setValue(CollectionsKt.emptyList());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer ComposeContent$lambda$12(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountOverviewViewState ComposeContent$lambda$5(SnapshotState4<AccountOverviewViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AccountOverviewSectionState> ComposeContent$lambda$7(SnapshotState<List<AccountOverviewSectionState>> snapshotState) {
        return snapshotState.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAllAccountsSelected() {
        AccountOverviewCallbacks.DefaultImpls.onAllAccountsSelected(this);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onPendingApplicationClicked(String str, BrokerageAccountType brokerageAccountType) {
        AccountOverviewCallbacks.DefaultImpls.onPendingApplicationClicked(this, str, brokerageAccountType);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.LocalAccountSwitcherCallbacks, com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onRefreshAccountsClicked() {
        AccountOverviewCallbacks.DefaultImpls.onRefreshAccountsClicked(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.ACCOUNT_OVERVIEW, null, null, null, 14, null);
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

    public final InstantCashLogger getInstantCashLogger() {
        InstantCashLogger instantCashLogger = this.instantCashLogger;
        if (instantCashLogger != null) {
            return instantCashLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("instantCashLogger");
        return null;
    }

    public final void setInstantCashLogger(InstantCashLogger instantCashLogger) {
        Intrinsics.checkNotNullParameter(instantCashLogger, "<set-?>");
        this.instantCashLogger = instantCashLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogOnceEventLogger getLogOnceEventLogger() {
        return (LogOnceEventLogger) this.logOnceEventLogger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogOnceEventLogger logOnceEventLogger_delegate$lambda$0(AccountOverviewFragment accountOverviewFragment) {
        return new LogOnceEventLogger(accountOverviewFragment.getEventLogger());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountOverviewDuxo getDuxo() {
        return (AccountOverviewDuxo) this.duxo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final AccountOverviewLaunchType getScrollToSectionState() {
        return (AccountOverviewLaunchType) this.scrollToSectionState.getValue();
    }

    private final void setScrollToSectionState(AccountOverviewLaunchType accountOverviewLaunchType) {
        this.scrollToSectionState.setValue(accountOverviewLaunchType);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.markwon = Markwon.create(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getShortcutManager().reportUse(RhShortcut.ACCOUNT);
        if (savedInstanceState == null) {
            setScrollToSectionState(((LegacyFragmentKey.AccountOverview) INSTANCE.getArgs((Fragment) this)).getLaunchType());
        }
        BaseFragment.collectDuxoState$default(this, null, new C82331(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C82342(null), 1, null);
    }

    /* compiled from: AccountOverviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewFragment$onViewCreated$1", m3645f = "AccountOverviewFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.account.ui.AccountOverviewFragment$onViewCreated$1 */
    static final class C82331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C82331(Continuation<? super C82331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountOverviewFragment.this.new C82331(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C82331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AccountOverviewFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<AccountOverviewViewState, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass1(Object obj) {
                super(2, obj, AccountOverviewFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/account/ui/AccountOverviewViewState;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountOverviewViewState accountOverviewViewState, Continuation<? super Unit> continuation) {
                return C82331.invokeSuspend$setViewState((AccountOverviewFragment) this.receiver, accountOverviewViewState, continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AccountOverviewViewState> stateFlow = AccountOverviewFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AccountOverviewFragment.this);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setViewState(AccountOverviewFragment accountOverviewFragment, AccountOverviewViewState accountOverviewViewState, Continuation continuation) {
            accountOverviewFragment.setViewState(accountOverviewViewState);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AccountOverviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewFragment$onViewCreated$2", m3645f = "AccountOverviewFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.account.ui.AccountOverviewFragment$onViewCreated$2 */
    static final class C82342 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C82342(Continuation<? super C82342> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountOverviewFragment.this.new C82342(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C82342) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AccountOverviewFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.account.ui.AccountOverviewFragment$onViewCreated$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AccountOverviewFragment $tmp0;

            AnonymousClass1(AccountOverviewFragment accountOverviewFragment) {
                this.$tmp0 = accountOverviewFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AccountOverviewFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<AccountOverviewEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C82342.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<AccountOverviewEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(AccountOverviewFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AccountOverviewFragment.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(AccountOverviewFragment accountOverviewFragment, Event event, Continuation continuation) {
            accountOverviewFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onSecondaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        if (dialogId == C8159R.id.dialog_id_interest_earning_disclosure) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new RemoteAgreementFragmentKey(new RemoteAgreementFragmentKey2.AgreementType("cash_sweep_agreement"), false, false, false, null, 30, null), false, false, false, false, null, false, null, null, 1020, null);
            return true;
        }
        return super.onSecondaryButtonClicked(dialogId, passthroughArgs);
    }

    @Override // com.robinhood.android.account.p060ui.AccountSelector2
    public void onAccountSelectionDropdownClicked(AccountSelectorState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new AccountSwitcherBottomSheetFragmentKey(state.getData()), null, 2, null).show(getChildFragmentManager(), "account-switcher");
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        getDuxo().onAccountSelected(accountNumber);
    }

    @Override // com.robinhood.android.account.p060ui.AccountOverviewInvestmentScheduleCard3
    public void onInvestmentScheduleButtonClicked(String accountNumber) {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.VIEW_RECURRING_HUB, new Screen(Screen.Name.ACCOUNT_DETAIL, null, null, null, 14, null), new Component(Component.ComponentType.RECURRING_INVESTMENTS_BUTTON, null, null, 6, null), null, null, false, 56, null);
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new RecurringHubFragmentKey(accountNumber), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.account.p060ui.AccountOverviewInvestmentScheduleCard3
    public void onInvestmentScheduleLearnMoreClicked() throws Resources.NotFoundException {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String string2 = getResources().getString(C8159R.string.account_overview_investment_schedule_url);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
    }

    @Override // com.robinhood.android.account.p060ui.AccountOverviewMarginCard3
    public void showMarginTerminologyDialog() {
        MarginInvestingLearnMoreDialog marginInvestingLearnMoreDialogNewInstance = MarginInvestingLearnMoreDialog.INSTANCE.newInstance();
        FragmentManager supportFragmentManager = requireBaseActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        marginInvestingLearnMoreDialogNewInstance.show(supportFragmentManager, "margin-health-terminology");
    }

    @Override // com.robinhood.android.account.p060ui.AccountOverviewDripCard3
    public void onDripSettingsClicked(boolean isDripOnboarded, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        if (isDripOnboarded) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            requireContext().startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new DripSettings(accountNumber), false, false, false, null, false, false, false, false, false, null, false, 8188, null));
            return;
        }
        Navigator navigator2 = getNavigator();
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext2, new DripOnboarding(accountNumber), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.account.p060ui.AccountOverviewDripCard3
    public void onDripSummaryLearnMoreClicked() throws Resources.NotFoundException {
        String string2 = getResources().getString(C8159R.string.account_overview_drip_url);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // com.robinhood.android.account.p060ui.AccountOverviewSlipHubCard3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onSlipCtaClicked(SlipHubCard slipHubCard, Continuation<? super Unit> continuation) {
        C82311 c82311;
        AccountOverviewFragment accountOverviewFragment;
        if (continuation instanceof C82311) {
            c82311 = (C82311) continuation;
            int i = c82311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c82311.label = i - Integer.MIN_VALUE;
                accountOverviewFragment = this;
            } else {
                accountOverviewFragment = this;
                c82311 = accountOverviewFragment.new C82311(continuation);
            }
        }
        C82311 c823112 = c82311;
        Object obj = c823112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c823112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            EventLogger.DefaultImpls.logTap$default(accountOverviewFragment.getEventLogger(), null, new Screen(Screen.Name.ACCOUNT_DETAIL, null, null, null, 14, null), new Component(Component.ComponentType.SLIP_SETTING_CARD, slipHubCard.getComponentIdentifier(), null, 4, null), null, null, false, 57, null);
            Navigator navigator = accountOverviewFragment.getNavigator();
            android.content.Context contextRequireContext = accountOverviewFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Uri uri = Uri.parse(slipHubCard.getCtaDeeplinkUrl());
            c823112.label = 1;
            if (Navigator.DefaultImpls.handleDeepLinkDirect$default(navigator, contextRequireContext, uri, false, false, null, c823112, 28, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        accountOverviewFragment.getLogOnceEventLogger().reset();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.account.p060ui.AccountOverviewSweepEnrollmentCard2
    public void onSweepLearnMoreClicked(Disclosure disclosure, BigDecimal interestRate) {
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        RhBottomSheetDialogFragment.Companion companion = RhBottomSheetDialogFragment.INSTANCE;
        int i = C8159R.id.dialog_id_interest_earning_disclosure;
        String title = disclosure.getTitle();
        Markwon markwon = this.markwon;
        if (markwon == null) {
            Intrinsics.throwUninitializedPropertyAccessException("markwon");
            markwon = null;
        }
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) companion.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(i, title, null, Markwons.toSpanned(markwon, disclosure.getContent(), MapsKt.mapOf(Tuples4.m3642to("gold_sweep_interest_rate", Formats.getInterestRateFormatShortWithPercentage().format(interestRate)))), null, getString(C11048R.string.general_label_done), null, getString(C8159R.string.account_overview_interest_earning_read_full_disclosure), null, false, false, null, null, null, false, true, false, false, null, null, "CASH_SWEEP_COMBINED_DISCLOSURES_DIALOG", 1015636, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, "interest-rate-disclosure");
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.LEARN_MORE, new Screen(Screen.Name.ACCOUNT_OVERVIEW, null, null, null, 14, null), null, null, null, false, 60, null);
    }

    @Override // com.robinhood.android.account.p060ui.AccountOverviewSweepEnrollmentCard2
    public void onSweepSwitchToCashAccountClicked(Map<String, ? extends JsonPrimitive<?>> inputParams) {
        Intrinsics.checkNotNullParameter(inputParams, "inputParams");
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, new Screen(Screen.Name.ACCOUNT_DETAIL, null, null, null, 14, null), new Component(Component.ComponentType.LINK_BUTTON, "sweep_section_switch_to_cash", null, 4, null), null, null, false, 57, null);
        launchSwitchToCashAccountSassyFlow(inputParams);
    }

    @Override // com.robinhood.android.account.p060ui.AccountOverviewSweepEnrollmentCard2
    public void onPausedInfoClick(SweepEnrollmentData sweepEnrollmentData, boolean isInLeveredMarginRegionGate) {
        Intrinsics.checkNotNullParameter(sweepEnrollmentData, "sweepEnrollmentData");
        SweepPausedInfoDialogFragment.Companion companion = SweepPausedInfoDialogFragment.INSTANCE;
        ApiSweepsTimelineSummary.PausedReason interestPausedReason = sweepEnrollmentData.getSweepTimelineSummary().getInterestPausedReason();
        if (interestPausedReason == null) {
            return;
        }
        SweepPausedInfoDialogFragment sweepPausedInfoDialogFragment = (SweepPausedInfoDialogFragment) companion.newInstance((Parcelable) new SweepPausedInfoDialogFragment.Args(interestPausedReason, isInLeveredMarginRegionGate));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        sweepPausedInfoDialogFragment.show(childFragmentManager, "paused-sweep-dialog");
    }

    @Override // com.robinhood.android.account.p060ui.AccountOverviewSweepEnrollmentCard2
    public void onDisableSweepClicked(Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        SweepDisableDialogFragment sweepDisableDialogFragment = (SweepDisableDialogFragment) SweepDisableDialogFragment.INSTANCE.newInstance((Parcelable) new SweepDisableDialogFragment.Args(account.getAccountNumber(), account.getBrokerageAccountType()));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        sweepDisableDialogFragment.show(childFragmentManager, "disable-sweep");
    }

    @Override // com.robinhood.android.account.p060ui.AccountOverviewSweepEnrollmentCard2
    public void onStartSweepEnrollmentClicked(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new SweepOnboardingIntentKey(accountNumber, "account_overview", false, 4, null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.account.p060ui.AccountOverviewSweepEnrollmentCard2
    public void onClickViewCashSweep(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new CashBalanceDetailsKey(accountNumber), false, false, false, false, null, false, null, null, 1020, null);
    }

    @Override // com.robinhood.android.account.p060ui.AccountTypeSectionState2
    public void onAccountTypeSwitchToCashCtaClicked(Map<String, ? extends JsonPrimitive<?>> inputParams) {
        Intrinsics.checkNotNullParameter(inputParams, "inputParams");
        InstantCashLogger.logTap$default(getInstantCashLogger(), getDuxo().getStateFlow().getValue().getActiveAccount(), null, new Screen(Screen.Name.INVESTING_SETTINGS, null, InstantCashLogger3.INVESTING_SETTINGS_ACCOUNT_TYPE_SECTION.getValue(), null, 10, null), Component.ComponentType.BUTTON, InstantCashLogger2.SWITCH_TO_CASH_ACCOUNT_BUTTON.getValue(), null, true, 34, null);
        launchSwitchToCashAccountSassyFlow(inputParams);
    }

    @Override // com.robinhood.android.account.p060ui.AccountTypeSectionState2
    public void onAccountTypeSwitchToMarginCtaClicked(Map<String, ? extends JsonPrimitive<?>> inputParams) {
        Intrinsics.checkNotNullParameter(inputParams, "inputParams");
        InstantCashLogger.logTap$default(getInstantCashLogger(), getDuxo().getStateFlow().getValue().getActiveAccount(), null, new Screen(Screen.Name.INVESTING_SETTINGS, null, InstantCashLogger3.INVESTING_SETTINGS_ACCOUNT_TYPE_SECTION.getValue(), null, 10, null), Component.ComponentType.BUTTON, InstantCashLogger2.SWITCH_TO_MARGIN_ACCOUNT_BUTTON.getValue(), null, true, 34, null);
        launchSwitchToMarginAccountSassyFlow(inputParams);
    }

    @Override // com.robinhood.android.account.p060ui.AccountTypeSectionState2
    public void onAccountTypeSwitchToLimitedMarginCtaClicked(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        InstantCashLogger.logTap$default(getInstantCashLogger(), getDuxo().getStateFlow().getValue().getActiveAccount(), null, new Screen(Screen.Name.INVESTING_SETTINGS, null, InstantCashLogger3.INVESTING_SETTINGS_ACCOUNT_TYPE_SECTION.getValue(), null, 10, null), Component.ComponentType.BUTTON, InstantCashLogger2.SWITCH_TO_MARGIN_ACCOUNT_BUTTON.getValue(), null, true, 34, null);
        launchInstantUpgradeFlow(accountNumber);
    }

    @Override // com.robinhood.android.account.p060ui.AccountTypeSectionState2
    public void onAccountTypeLearnMoreClicked(int urlRes) throws Resources.NotFoundException {
        InstantCashLogger.logTap$default(getInstantCashLogger(), getDuxo().getStateFlow().getValue().getActiveAccount(), null, new Screen(Screen.Name.INVESTING_SETTINGS, null, InstantCashLogger3.INVESTING_SETTINGS_ACCOUNT_TYPE_SECTION.getValue(), null, 10, null), Component.ComponentType.LINK_BUTTON, InstantCashLogger2.LEARN_MORE.getValue(), null, true, 34, null);
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String string2 = getResources().getString(urlRes);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
    }

    @Override // com.robinhood.android.account.p060ui.AccountOverviewMarginCard3
    public void onSwitchToMarginAccountClicked(Map<String, ? extends JsonPrimitive<?>> inputParams) {
        Intrinsics.checkNotNullParameter(inputParams, "inputParams");
        InstantCashLogger.logTap$default(getInstantCashLogger(), getDuxo().getStateFlow().getValue().getActiveAccount(), null, new Screen(Screen.Name.INVESTING_SETTINGS, null, InstantCashLogger3.INVESTING_SETTINGS_MARGIN_INVESTING_SECTION.getValue(), null, 10, null), Component.ComponentType.LINK_BUTTON, InstantCashLogger2.SWITCH_TO_MARGIN_ACCOUNT.getValue(), null, false, 34, null);
        launchSwitchToMarginAccountSassyFlow(inputParams);
    }

    @Override // com.robinhood.android.futures.lib.rhd.accountoverview.p144ui.AccountOverviewRhdCallbacks2
    public void onApplyToTradeFuturesClicked() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new FuturesOnboardingActivityKey("ACCOUNT_OVERVIEW", false, FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToRhFuturesList.INSTANCE, 2, null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.futures.lib.rhd.accountoverview.p144ui.AccountOverviewRhdCallbacks2
    public void onTradeFuturesClicked() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, CuratedListKey.INSTANCE.getFuturesListKey(), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.futures.lib.rhd.accountoverview.p144ui.AccountOverviewRhdCallbacks2
    public void onApplyToTradeEventContractsClicked() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new FuturesOnboardingActivityKey("ACCOUNT_OVERVIEW", true, FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEcHub.INSTANCE), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.futures.lib.rhd.accountoverview.p144ui.AccountOverviewRhdCallbacks2
    public void onReactivateAccountClicked() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigators3.showContactSupportTriageFragment(navigator, contextRequireContext, PathfinderInitialState.GUIDE_REACTIVATION);
    }

    /* compiled from: AccountOverviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.ui.AccountOverviewFragment$onTradeEventContractsClicked$1", m3645f = "AccountOverviewFragment.kt", m3646l = {445}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.account.ui.AccountOverviewFragment$onTradeEventContractsClicked$1 */
    static final class C82321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C82321(Continuation<? super C82321> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountOverviewFragment.this.new C82321(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C82321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Navigator navigator = AccountOverviewFragment.this.getNavigator();
                android.content.Context contextRequireContext = AccountOverviewFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                this.label = 1;
                if (HubNavigateUtils2.navigateToEcHub(navigator, contextRequireContext, "account_overview_card", true, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.futures.lib.rhd.accountoverview.p144ui.AccountOverviewRhdCallbacks2
    public void onTradeEventContractsClicked() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C82321(null), 3, null);
    }

    @Override // com.robinhood.android.account.p060ui.AccountOverviewPortfolioCard3
    public void onPortfolioCashInfoIconClicked(Disclosure disclosureContent) {
        if (disclosureContent != null) {
            RhBottomSheetDialogFragment.Companion companion = RhBottomSheetDialogFragment.INSTANCE;
            int i = C8159R.id.dialog_id_interest_earning_disclosure;
            String title = disclosureContent.getTitle();
            Markwon markwon = this.markwon;
            if (markwon == null) {
                Intrinsics.throwUninitializedPropertyAccessException("markwon");
                markwon = null;
            }
            RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) companion.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(i, title, null, Markwons.toSpanned$default(markwon, disclosureContent.getContent(), null, 2, null), null, getString(C11048R.string.general_label_ok), null, null, null, false, false, null, null, null, false, true, false, false, null, null, null, 2064340, null));
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            rhBottomSheetDialogFragment.show(childFragmentManager, "mcw-cash-explainer-disclosure");
        }
    }

    @Override // com.robinhood.android.account.p060ui.AccountOverviewPortfolioCard3
    public void onDepositFundsButtonClicked() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new InternationalTransfer(TransferDirection.DEPOSIT, null, null, MAXTransferContext.EntryPoint.BROKERAGE_ACCOUNT_OVERVIEW, 6, null), null, false, null, null, 60, null);
    }

    private final void launchSwitchToCashAccountSassyFlow(Map<String, ? extends JsonPrimitive<?>> inputParams) {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        startActivity(CashDowngradeResultContract2.createIntentForCashDowngrade(navigator, contextRequireContext, inputParams));
    }

    private final void launchSwitchToMarginAccountSassyFlow(Map<String, ? extends JsonPrimitive<?>> inputParams) {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        startActivity(InstantCashUtils.createIntentForMarginUpgrade(navigator, contextRequireContext, inputParams));
    }

    private final void launchInstantUpgradeFlow(String accountNumber) {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.InstantUpgrade(accountNumber), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo15941handle(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof GenericAction.Deeplink)) {
            return false;
        }
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), Boolean.FALSE, null, false, null, 56, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(AccountOverviewViewState viewState) {
        RhToolbar rhToolbarRequireToolbar = requireToolbar();
        if (Intrinsics.areEqual(rhToolbarRequireToolbar.getSubtitle(), viewState.getToolbarSubtitle())) {
            return;
        }
        TypefaceUtils.INSTANCE.setToolbarSubtitleTypeface(rhToolbarRequireToolbar);
        rhToolbarRequireToolbar.setSubtitle(viewState.getToolbarSubtitle());
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1981381616);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1981381616, i2, -1, "com.robinhood.android.account.ui.AccountOverviewFragment.ComposeContent (AccountOverviewFragment.kt:529)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            List<AccountOverviewSectionState> sectionsStates = ComposeContent$lambda$5(snapshotState4CollectAsStateWithLifecycle).getSectionsStates();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(sectionsStates);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(ComposeContent$lambda$5(snapshotState4CollectAsStateWithLifecycle).getSectionsStates(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            final TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
            AccountOverviewLaunchType scrollToSectionState = getScrollToSectionState();
            int size = ComposeContent$lambda$5(snapshotState4CollectAsStateWithLifecycle).getSectionsStates().size();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged2 = composerStartRestartGroup.changed(scrollToSectionState.ordinal()) | composerStartRestartGroup.changed(size);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountOverviewFragment.ComposeContent$lambda$11$lambda$10(this.f$0, snapshotState4CollectAsStateWithLifecycle);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(getScarletManager()), null, ComposableLambda3.rememberComposableLambda(-1550617950, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1550617950, i3, -1, "com.robinhood.android.account.ui.AccountOverviewFragment.ComposeContent.<anonymous> (AccountOverviewFragment.kt:548)");
                    }
                    final AccountOverviewFragment accountOverviewFragment = AccountOverviewFragment.this;
                    final LazyListState lazyListState = lazyListStateRememberLazyListState;
                    final TopBarScrollState topBarScrollState = topBarScrollStateRememberTopBarScrollState;
                    final SnapshotState4<AccountOverviewViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                    final SnapshotState<List<AccountOverviewSectionState>> snapshotState2 = snapshotState;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(131313965, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i4) {
                            if ((i4 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(131313965, i4, -1, "com.robinhood.android.account.ui.AccountOverviewFragment.ComposeContent.<anonymous>.<anonymous> (AccountOverviewFragment.kt:549)");
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i5 = BentoTheme.$stable;
                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer4, i5).m21371getBg0d7_KjU();
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer4, i5).m21425getFg0d7_KjU();
                            final AccountOverviewFragment accountOverviewFragment2 = accountOverviewFragment;
                            final LazyListState lazyListState2 = lazyListState;
                            final TopBarScrollState topBarScrollState2 = topBarScrollState;
                            final SnapshotState4<AccountOverviewViewState> snapshotState43 = snapshotState42;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1054786866, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment.ComposeContent.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i6) {
                                    if ((i6 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1054786866, i6, -1, "com.robinhood.android.account.ui.AccountOverviewFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (AccountOverviewFragment.kt:553)");
                                    }
                                    AccountOverviewFragment accountOverviewFragment3 = accountOverviewFragment2;
                                    Modifier modifierScrollableTopBarState = TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, lazyListState2, topBarScrollState2);
                                    Account activeAccount = AccountOverviewFragment.ComposeContent$lambda$5(snapshotState43).getActiveAccount();
                                    accountOverviewFragment3.AccountOverviewTopAppBar(modifierScrollableTopBarState, activeAccount != null ? activeAccount.getAccountNumber() : null, topBarScrollState2, AccountOverviewFragment.ComposeContent$lambda$5(snapshotState43).getToolbarSubtitle(), AccountOverviewFragment.ComposeContent$lambda$5(snapshotState43).getShouldShowCurrencySwitcher(), composer5, TopBarScrollState.$stable << 6, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54);
                            final LazyListState lazyListState3 = lazyListState;
                            final SnapshotState<List<AccountOverviewSectionState>> snapshotState3 = snapshotState2;
                            final AccountOverviewFragment accountOverviewFragment3 = accountOverviewFragment;
                            ScaffoldKt.m5625Scaffold27mzLpw(null, null, composableLambdaRememberComposableLambda, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, ComposableLambda3.rememberComposableLambda(1714156907, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment.ComposeContent.1.1.2

                                /* compiled from: AccountOverviewFragment.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.account.ui.AccountOverviewFragment$ComposeContent$1$1$2$1, reason: invalid class name and collision with other inner class name */
                                static final class C495231 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ LazyListState $listState;
                                    final /* synthetic */ PaddingValues $paddingValues;
                                    final /* synthetic */ SnapshotState<List<AccountOverviewSectionState>> $stateItems$delegate;
                                    final /* synthetic */ AccountOverviewFragment this$0;

                                    C495231(PaddingValues paddingValues, LazyListState lazyListState, SnapshotState<List<AccountOverviewSectionState>> snapshotState, AccountOverviewFragment accountOverviewFragment) {
                                        this.$paddingValues = paddingValues;
                                        this.$listState = lazyListState;
                                        this.$stateItems$delegate = snapshotState;
                                        this.this$0 = accountOverviewFragment;
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
                                            ComposerKt.traceEventStart(514530477, i, -1, "com.robinhood.android.account.ui.AccountOverviewFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountOverviewFragment.kt:566)");
                                        }
                                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, this.$paddingValues);
                                        LazyListState lazyListState = this.$listState;
                                        composer.startReplaceGroup(-1633490746);
                                        boolean zChanged = composer.changed(this.$stateItems$delegate) | composer.changedInstance(this.this$0);
                                        final SnapshotState<List<AccountOverviewSectionState>> snapshotState = this.$stateItems$delegate;
                                        final AccountOverviewFragment accountOverviewFragment = this.this$0;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment$ComposeContent$1$1$2$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return AccountOverviewFragment.C82301.AnonymousClass1.AnonymousClass2.C495231.invoke$lambda$3$lambda$2(snapshotState, accountOverviewFragment, (LazyListScope) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        LazyDslKt.LazyColumn(modifierPadding, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 508);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState, final AccountOverviewFragment accountOverviewFragment, LazyListScope LazyColumn) {
                                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                        final List listComposeContent$lambda$7 = AccountOverviewFragment.ComposeContent$lambda$7(snapshotState);
                                        final Function1 function1 = new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment$ComposeContent$1$1$2$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return AccountOverviewFragment.C82301.AnonymousClass1.AnonymousClass2.C495231.invoke$lambda$3$lambda$2$lambda$0((AccountOverviewSectionState) obj);
                                            }
                                        };
                                        final C8221x90ba99e0 c8221x90ba99e0 = new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment$ComposeContent$1$1$2$1$invoke$lambda$3$lambda$2$$inlined$items$default$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Void invoke(AccountOverviewSectionState accountOverviewSectionState) {
                                                return null;
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                return invoke((AccountOverviewSectionState) obj);
                                            }
                                        };
                                        LazyColumn.items(listComposeContent$lambda$7.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment$ComposeContent$1$1$2$1$invoke$lambda$3$lambda$2$$inlined$items$default$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                                return invoke(num.intValue());
                                            }

                                            public final Object invoke(int i) {
                                                return function1.invoke(listComposeContent$lambda$7.get(i));
                                            }
                                        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment$ComposeContent$1$1$2$1$invoke$lambda$3$lambda$2$$inlined$items$default$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                                return invoke(num.intValue());
                                            }

                                            public final Object invoke(int i) {
                                                return c8221x90ba99e0.invoke(listComposeContent$lambda$7.get(i));
                                            }
                                        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment$ComposeContent$1$1$2$1$invoke$lambda$3$lambda$2$$inlined$items$default$4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                                int i3;
                                                if ((i2 & 6) == 0) {
                                                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                                                } else {
                                                    i3 = i2;
                                                }
                                                if ((i2 & 48) == 0) {
                                                    i3 |= composer.changed(i) ? 32 : 16;
                                                }
                                                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                                    composer.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                                }
                                                AccountOverviewSectionState accountOverviewSectionState = (AccountOverviewSectionState) listComposeContent$lambda$7.get(i);
                                                composer.startReplaceGroup(-609675863);
                                                AccountOverviewFragment accountOverviewFragment2 = accountOverviewFragment;
                                                accountOverviewFragment2.AccountOverviewSection(accountOverviewSectionState, accountOverviewFragment2, accountOverviewFragment2, composer, 0);
                                                composer.endReplaceGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Object invoke$lambda$3$lambda$2$lambda$0(AccountOverviewSectionState it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        return it.getIdentifier();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer5, Integer num) {
                                    invoke(paddingValues, composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer5, int i6) {
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i6 & 6) == 0) {
                                        i6 |= composer5.changed(paddingValues) ? 4 : 2;
                                    }
                                    if ((i6 & 19) == 18 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1714156907, i6, -1, "com.robinhood.android.account.ui.AccountOverviewFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (AccountOverviewFragment.kt:565)");
                                    }
                                    LocalityProvider.LocalityProvider(null, ComposableLambda3.rememberComposableLambda(514530477, true, new C495231(paddingValues, lazyListState3, snapshotState3, accountOverviewFragment3), composer5, 54), composer5, 48, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54), composer4, 384, 12582912, 32763);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            composer2 = composerStartRestartGroup;
            Integer numComposeContent$lambda$12 = ComposeContent$lambda$12(snapshotState4);
            composer2.startReplaceGroup(-1633490746);
            boolean zChanged3 = composer2.changed(snapshotState4) | composer2.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new AccountOverviewFragment2(snapshotState4, lazyListStateRememberLazyListState, null);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(numComposeContent$lambda$12, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 0);
            Unit unit = Unit.INSTANCE;
            composer2.startReplaceGroup(5004770);
            boolean zChanged4 = composer2.changed(snapshotState);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountOverviewFragment.ComposeContent$lambda$16$lambda$15(snapshotState, (DisposableEffectScope) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountOverviewFragment.ComposeContent$lambda$17(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer ComposeContent$lambda$11$lambda$10(AccountOverviewFragment accountOverviewFragment, SnapshotState4 snapshotState4) {
        Integer numValueOf;
        switch (WhenMappings.$EnumSwitchMapping$0[accountOverviewFragment.getScrollToSectionState().ordinal()]) {
            case 1:
                numValueOf = null;
                break;
            case 2:
                numValueOf = Integer.valueOf(ComposeContent$lambda$5(snapshotState4).getInstantIndex());
                break;
            case 3:
                numValueOf = Integer.valueOf(ComposeContent$lambda$5(snapshotState4).getSweepIndex());
                break;
            case 4:
                numValueOf = Integer.valueOf(ComposeContent$lambda$5(snapshotState4).getDayTradeIndex());
                break;
            case 5:
                numValueOf = Integer.valueOf(ComposeContent$lambda$5(snapshotState4).getOptionsIndex());
                break;
            case 6:
                numValueOf = Integer.valueOf(ComposeContent$lambda$5(snapshotState4).getFuturesIndex());
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (numValueOf == null || numValueOf.intValue() < 0) {
            return null;
        }
        return numValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AccountOverviewTopAppBar(Modifier modifier, final String str, final TopBarScrollState topBarScrollState, final String str2, final boolean z, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(183151247);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(topBarScrollState) : composerStartRestartGroup.changedInstance(topBarScrollState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(this) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(183151247, i3, -1, "com.robinhood.android.account.ui.AccountOverviewFragment.AccountOverviewTopAppBar (AccountOverviewFragment.kt:604)");
            }
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1120268356, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment.AccountOverviewTopAppBar.1
                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1120268356, i5, -1, "com.robinhood.android.account.ui.AccountOverviewFragment.AccountOverviewTopAppBar.<anonymous> (AccountOverviewFragment.kt:608)");
                    }
                    String str3 = str2;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    String strStringResource = StringResources_androidKt.stringResource(C8159R.string.account_overview_title, composer3, 0);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextL(), composer3, 0, 0, 8190);
                    composer3.startReplaceGroup(1525915033);
                    if (str3 != null) {
                        BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextS(), composer3, 0, 0, 8186);
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), modifier2, ComposableLambda3.rememberComposableLambda(-1487000560, true, new C82282(), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1441008207, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment.AccountOverviewTopAppBar.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                    invoke(row5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 BentoAppBar, Composer composer3, int i5) {
                    String str3;
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i5 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1441008207, i5, -1, "com.robinhood.android.account.ui.AccountOverviewFragment.AccountOverviewTopAppBar.<anonymous> (AccountOverviewFragment.kt:628)");
                    }
                    if (z && (str3 = str) != null) {
                        DisplayCurrencySwitcher.DisplayCurrencySwitcher(str3, DisplayCurrencySwitcherLocation.ACCOUNT_TAB, null, null, false, false, false, null, null, composer3, 48, 508);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, false, topBarScrollState.getShowDivider(), null, null, 0L, null, composer2, ((i3 << 3) & 112) | 3462, 0, 1968);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        final Modifier modifier3 = modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountOverviewFragment.AccountOverviewTopAppBar$lambda$18(this.f$0, modifier3, str, topBarScrollState, str2, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AccountOverviewFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.account.ui.AccountOverviewFragment$AccountOverviewTopAppBar$2 */
    static final class C82282 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
        C82282() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
            invoke(bentoAppBarScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 6) == 0) {
                i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1487000560, i, -1, "com.robinhood.android.account.ui.AccountOverviewFragment.AccountOverviewTopAppBar.<anonymous> (AccountOverviewFragment.kt:623)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(AccountOverviewFragment.this);
            final AccountOverviewFragment accountOverviewFragment = AccountOverviewFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment$AccountOverviewTopAppBar$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountOverviewFragment.C82282.invoke$lambda$1$lambda$0(accountOverviewFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(AccountOverviewFragment accountOverviewFragment) {
            accountOverviewFragment.requireBaseActivity().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AccountOverviewSection(final AccountOverviewSectionState accountOverviewSectionState, final AccountOverviewCallbacks accountOverviewCallbacks, final SduiActionHandler<? super GenericAction> sduiActionHandler, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(989506594);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(accountOverviewSectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(accountOverviewCallbacks) : composerStartRestartGroup.changedInstance(accountOverviewCallbacks) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sduiActionHandler) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(989506594, i2, -1, "com.robinhood.android.account.ui.AccountOverviewFragment.AccountOverviewSection (AccountOverviewFragment.kt:646)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(getNavigator()), ComposableLambda3.rememberComposableLambda(-73629470, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment.AccountOverviewSection.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) throws Resources.NotFoundException {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-73629470, i3, -1, "com.robinhood.android.account.ui.AccountOverviewFragment.AccountOverviewSection.<anonymous> (AccountOverviewFragment.kt:648)");
                    }
                    AccountOverviewSectionState accountOverviewSectionState2 = accountOverviewSectionState;
                    if (accountOverviewSectionState2 instanceof AccountSelectorState) {
                        composer2.startReplaceGroup(-2038441518);
                        AccountSelector3.AccountSelector(null, (AccountSelectorState) accountOverviewSectionState, accountOverviewCallbacks, composer2, 0, 1);
                        composer2.endReplaceGroup();
                    } else if (accountOverviewSectionState2 instanceof InfoBannerSectionState) {
                        composer2.startReplaceGroup(1232985258);
                        InfoBannerComponent.InfoBannerComponent(((InfoBannerSectionState) accountOverviewSectionState).getAccountNumber(), IacInfoBannerLocation.INFO_BANNER_ACCOUNT_INVESTING_ABOVE_PORTFOLIO, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, null, null, null, null, null, composer2, 48, 0, 8184);
                        composer2.endReplaceGroup();
                    } else if (accountOverviewSectionState2 instanceof DayTradeSectionState) {
                        composer2.startReplaceGroup(-2038426086);
                        AccountOverviewDayTradeCard.DayTradeSection(null, (DayTradeSectionState) accountOverviewSectionState, sduiActionHandler, composer2, 0, 1);
                        composer2.endReplaceGroup();
                    } else if (accountOverviewSectionState2 instanceof DripSectionState) {
                        composer2.startReplaceGroup(-2038420946);
                        AccountOverviewDripCard.DripSection(null, (DripSectionState) accountOverviewSectionState, accountOverviewCallbacks, composer2, 0, 1);
                        composer2.endReplaceGroup();
                    } else if (accountOverviewSectionState2 instanceof InstantSectionState) {
                        composer2.startReplaceGroup(-2038416122);
                        AccountOverviewInstantCard.InstantSection(null, (InstantSectionState) accountOverviewSectionState, composer2, 0, 1);
                        composer2.endReplaceGroup();
                    } else if (accountOverviewSectionState2 instanceof MarginSectionState) {
                        composer2.startReplaceGroup(-2038412528);
                        AccountOverviewMarginCard.MarginSection(null, (MarginSectionState) accountOverviewSectionState, accountOverviewCallbacks, composer2, 0, 1);
                        composer2.endReplaceGroup();
                    } else if (accountOverviewSectionState2 instanceof AccountTypeSectionState) {
                        composer2.startReplaceGroup(-2038407467);
                        AccountTypeSectionState3.AccountTypeSection(null, (AccountTypeSectionState) accountOverviewSectionState, accountOverviewCallbacks, composer2, 0, 1);
                        composer2.endReplaceGroup();
                    } else if (accountOverviewSectionState2 instanceof OptionsSectionState) {
                        composer2.startReplaceGroup(-2038402426);
                        AccountOverviewOptionsSettingCard.OptionsSection(null, (OptionsSectionState) accountOverviewSectionState, composer2, 0, 1);
                        composer2.endReplaceGroup();
                    } else if (accountOverviewSectionState2 instanceof PortfolioSectionState) {
                        composer2.startReplaceGroup(-2038398733);
                        AccountOverviewPortfolioCard.PortfolioSection(null, (PortfolioSectionState) accountOverviewSectionState, accountOverviewCallbacks, composer2, 0, 1);
                        composer2.endReplaceGroup();
                    } else if (accountOverviewSectionState2 instanceof RecurringSectionState) {
                        composer2.startReplaceGroup(-2038393645);
                        AccountOverviewInvestmentScheduleCard.RecurringSection(null, (RecurringSectionState) accountOverviewSectionState, accountOverviewCallbacks, composer2, 0, 1);
                        composer2.endReplaceGroup();
                    } else if (accountOverviewSectionState2 instanceof SlipSectionState) {
                        composer2.startReplaceGroup(1234475273);
                        LogOnceEventLogger.logAppear$default(this.getLogOnceEventLogger(), AccountOverviewFragment.SLIP_SECTION_IMPRESSION_ID, null, new Screen(Screen.Name.ACCOUNT_DETAIL, null, null, null, 14, null), new Component(Component.ComponentType.SLIP_SETTING_CARD, ((SlipSectionState) accountOverviewSectionState).getCard().getComponentIdentifier(), null, 4, null), null, 18, null);
                        AccountOverviewSlipHubCard.SlipSection(null, (SlipSectionState) accountOverviewSectionState, accountOverviewCallbacks, composer2, 0, 1);
                        composer2.endReplaceGroup();
                    } else if (accountOverviewSectionState2 instanceof SweepSectionState) {
                        composer2.startReplaceGroup(-2038367185);
                        AccountOverviewSweepEnrollmentCard.SweepSection((SweepSectionState) accountOverviewSectionState, accountOverviewCallbacks, null, composer2, 0, 4);
                        composer2.endReplaceGroup();
                    } else if (accountOverviewSectionState2 instanceof AccountOverviewRhdSectionState) {
                        composer2.startReplaceGroup(-2038361935);
                        AccountOverviewFuturesCard.FuturesSection((AccountOverviewRhdSectionState) accountOverviewSectionState, accountOverviewCallbacks, null, composer2, 0, 4);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(accountOverviewSectionState2 instanceof PlaceholderSectionState)) {
                            composer2.startReplaceGroup(-2038440739);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-2038356929);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(1)), composer2, 6);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.ui.AccountOverviewFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountOverviewFragment.AccountOverviewSection$lambda$19(this.f$0, accountOverviewSectionState, accountOverviewCallbacks, sduiActionHandler, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AccountOverviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/account/ui/AccountOverviewFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/account/ui/AccountOverviewFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AccountOverview;", "<init>", "()V", "INSTANT_EXPLANATION_DIALOG_TAG", "", "SLIP_SECTION_IMPRESSION_ID", "GOLD_SWEEP_INTEREST_RATE_PLACEHOLDER", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AccountOverviewFragment, LegacyFragmentKey.AccountOverview> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.AccountOverview accountOverview) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, accountOverview);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.AccountOverview getArgs(AccountOverviewFragment accountOverviewFragment) {
            return (LegacyFragmentKey.AccountOverview) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, accountOverviewFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountOverviewFragment newInstance(LegacyFragmentKey.AccountOverview accountOverview) {
            return (AccountOverviewFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, accountOverview);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountOverviewFragment accountOverviewFragment, LegacyFragmentKey.AccountOverview accountOverview) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, accountOverviewFragment, accountOverview);
        }
    }
}
