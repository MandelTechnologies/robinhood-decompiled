package com.robinhood.android.p273ui;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycle;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.BackEventCompat;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultCaller;
import androidx.view.result.ActivityResultLauncher;
import com.google.android.material.snackbar.Snackbar;
import com.plaid.internal.EnumC7081g;
import com.robinhood.McDucklingTabFragmentDeepLinkProps;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.analytics.performance.startup.StartupActivity;
import com.robinhood.android.blackwidow.contracts.MobileLinkingHostIntentKey;
import com.robinhood.android.blackwidow.contracts.MobileLinkingIntentKey;
import com.robinhood.android.blackwidow.contracts.MobileLinkingResultContract;
import com.robinhood.android.common.data.prefs.SnowflakesConfettiLastShownDatePref;
import com.robinhood.android.common.equitydetail.InstrumentDetailListParentCallbacks;
import com.robinhood.android.common.equitydetail.InstrumentType;
import com.robinhood.android.common.navigation.McDucklingWaitlistSource;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BaseTabFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.TopNavInboxButtonView;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.tabs.TabManager;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.GcmManager;
import com.robinhood.android.common.util.KeyboardVisibility;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.lifecycle.MainTabActivityListener;
import com.robinhood.android.crypto.lib.CryptoDetailCallbacks;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.confetti.Confetti;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.educationtour.interfaces.EducationTourActivity;
import com.robinhood.android.home.contracts.MainActivityIntentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey2;
import com.robinhood.android.lib.creditcard.CreditCardTabStyle;
import com.robinhood.android.lib.creditcard.CreditCardTabStyle2;
import com.robinhood.android.libs.tabs.ChromeStyleController;
import com.robinhood.android.libs.tabs.TooltipTags;
import com.robinhood.android.linking.C20838R;
import com.robinhood.android.linking.MobileLinkingCollapsedComposable3;
import com.robinhood.android.linking.MobileLinkingNotificationHandler;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Intents2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.Tabbed;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.android.p273ui.MainTabActivity;
import com.robinhood.android.p273ui.MainTabBarEvent;
import com.robinhood.android.p273ui.tabs.TabUtils;
import com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager;
import com.robinhood.android.resumeapplication.ResumeApplicationManager;
import com.robinhood.android.resumeapplication.ResumeApplicationViewState;
import com.robinhood.android.retirement.RetirementTabFragmentDeepLinkProps;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo;
import com.robinhood.android.search.highlights.interactions.SearchHighlightInteractable;
import com.robinhood.android.tabs.C29231R;
import com.robinhood.android.transfers.contracts.RecurringDepositsListKey;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoTabBarState;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.prefs.HasVisitedInboxTabPref;
import com.robinhood.librobinhood.data.store.InboxBadgeStore;
import com.robinhood.models.p320db.Document;
import com.robinhood.models.p320db.InboxBadge;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.referral.AttributionManager;
import com.robinhood.referral.AttributionNavigation;
import com.robinhood.referral.DeeplinkNavigation;
import com.robinhood.referral.IntentKeyNavigation;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.shared.common.bottomtab.controller.BottomTabsController;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import com.robinhood.shared.debug.bugbash.models.BugBashPrefModule2;
import com.robinhood.shared.documents.contracts.DocumentsFragmentKey;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.home.contracts.AccountSelectorTabIntentKey;
import com.robinhood.shared.home.contracts.AccountSelectorTabLinkIntentHandler;
import com.robinhood.shared.home.contracts.BlockedExternalDeeplinkIntentKey;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.shared.home.deeplink.prompt.BlockedExternalDeeplinkPrompt;
import com.robinhood.shared.settings.contracts.Constants6;
import com.robinhood.shared.settings.contracts.LicensesKey;
import com.robinhood.shared.settings.contracts.SettingsPage;
import com.robinhood.shared.support.supportchat.targets.SupportChatThreadNotificationHandler;
import com.robinhood.shared.transfers.contracts.TransfersHub;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.tooltips.TooltipManager;
import com.robinhood.udf.UiEvent;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.buildconfig.BuildFlavors;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.datetime.Holidays2;
import com.robinhood.utils.datetime.LocalDates;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.edge2edge.RelativePadding;
import com.robinhood.utils.p409ui.edge2edge.WindowInsetsListener;
import com.robinhood.utils.p409ui.edge2edge.WindowInsetsListener2;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import dispatch.core.Suspend;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.Duration;
import p479j$.time.LocalDate;
import timber.log.Timber;

/* compiled from: MainTabActivity.kt */
@Metadata(m3635d1 = {"\u0000¶\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u0094\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u000e\u008e\u0002\u008f\u0002\u0090\u0002\u0091\u0002\u0092\u0002\u0093\u0002\u0094\u0002B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010»\u0001\u001a\u00030¼\u00012\n\u0010½\u0001\u001a\u0005\u0018\u00010¾\u0001H\u0014J\n\u0010¿\u0001\u001a\u00030¼\u0001H\u0014J\n\u0010À\u0001\u001a\u00030¼\u0001H\u0014J\u0014\u0010Á\u0001\u001a\u00030¼\u00012\b\u0010Â\u0001\u001a\u00030Ã\u0001H\u0002J*\u0010Ä\u0001\u001a\u00030¼\u00012\b\u0010Å\u0001\u001a\u00030Æ\u00012\b\u0010Ç\u0001\u001a\u00030Æ\u00012\n\u0010È\u0001\u001a\u0005\u0018\u00010É\u0001H\u0016J\n\u0010Ê\u0001\u001a\u00030¼\u0001H\u0014J\u0014\u0010Ë\u0001\u001a\u00030¼\u00012\b\u0010Ì\u0001\u001a\u00030¾\u0001H\u0014J \u0010Í\u0001\u001a\u00030\u0081\u00012\b\u0010Î\u0001\u001a\u00030Æ\u00012\n\u0010Ï\u0001\u001a\u0005\u0018\u00010¾\u0001H\u0016J \u0010Ð\u0001\u001a\u00030\u0081\u00012\b\u0010Î\u0001\u001a\u00030Æ\u00012\n\u0010Ï\u0001\u001a\u0005\u0018\u00010¾\u0001H\u0016J\u0014\u0010Ñ\u0001\u001a\u00030¼\u00012\b\u0010Ò\u0001\u001a\u00030Ó\u0001H\u0016J\n\u0010Ô\u0001\u001a\u00030¼\u0001H\u0016J\n\u0010Õ\u0001\u001a\u00030¼\u0001H\u0016J\n\u0010Ö\u0001\u001a\u00030Æ\u0001H\u0014J\n\u0010×\u0001\u001a\u00030¼\u0001H\u0016J\n\u0010Ø\u0001\u001a\u00030¼\u0001H\u0016J\u0014\u0010Ù\u0001\u001a\u00030¼\u00012\b\u0010Ú\u0001\u001a\u00030É\u0001H\u0014J\u0014\u0010Û\u0001\u001a\u00030¼\u00012\b\u0010Ü\u0001\u001a\u00030Ý\u0001H\u0016J\u0014\u0010Þ\u0001\u001a\u00030¼\u00012\b\u0010ß\u0001\u001a\u00030à\u0001H\u0016J\n\u0010á\u0001\u001a\u00030¼\u0001H\u0016J\f\u0010â\u0001\u001a\u0005\u0018\u00010à\u0001H\u0016J\u0014\u0010ã\u0001\u001a\u00030¼\u00012\b\u0010ä\u0001\u001a\u00030\u0081\u0001H\u0016J\n\u0010å\u0001\u001a\u00030¼\u0001H\u0002J\n\u0010Þ\u0001\u001a\u00030¼\u0001H\u0002J\f\u0010æ\u0001\u001a\u0005\u0018\u00010à\u0001H\u0002J\u0016\u0010ç\u0001\u001a\u0005\u0018\u00010à\u00012\b\u0010è\u0001\u001a\u00030\u009b\u0001H\u0002J\u0014\u0010é\u0001\u001a\u00030¼\u00012\b\u0010ê\u0001\u001a\u00030ë\u0001H\u0002J\u0014\u0010ì\u0001\u001a\u00030¼\u00012\b\u0010ê\u0001\u001a\u00030ë\u0001H\u0002J\u0014\u0010í\u0001\u001a\u00030¼\u00012\b\u0010Ü\u0001\u001a\u00030à\u0001H\u0002J\u0014\u0010î\u0001\u001a\u00030¼\u00012\b\u0010Ü\u0001\u001a\u00030ï\u0001H\u0016J\u0014\u0010ð\u0001\u001a\u00030¼\u00012\b\u0010ñ\u0001\u001a\u00030à\u0001H\u0002J\u0014\u0010ò\u0001\u001a\u00030¼\u00012\b\u0010ó\u0001\u001a\u00030ô\u0001H\u0002J\u0014\u0010õ\u0001\u001a\u00030¼\u00012\b\u0010ö\u0001\u001a\u00030÷\u0001H\u0002J\n\u0010ø\u0001\u001a\u00030¼\u0001H\u0002J\n\u0010ù\u0001\u001a\u00030¼\u0001H\u0002J,\u0010ú\u0001\u001a\u00030¼\u00012\b\u0010ö\u0001\u001a\u00030÷\u00012\n\u0010û\u0001\u001a\u0005\u0018\u00010÷\u00012\n\b\u0002\u0010ü\u0001\u001a\u00030\u0081\u0001H\u0002J\n\u0010ý\u0001\u001a\u00030¼\u0001H\u0015J\u0014\u0010þ\u0001\u001a\u00030¼\u00012\b\u0010ÿ\u0001\u001a\u00030\u0080\u0002H\u0016J\u0014\u0010\u0081\u0002\u001a\u00030¼\u00012\b\u0010\u0082\u0002\u001a\u00030\u0083\u0002H\u0016J\u001e\u0010\u0084\u0002\u001a\u00030¼\u00012\b\u0010\u0085\u0002\u001a\u00030\u0081\u00012\b\u0010\u0086\u0002\u001a\u00030\u0081\u0001H\u0002J \u0010\u0087\u0002\u001a\u00030¼\u00012\b\u0010\u0088\u0002\u001a\u00030÷\u00012\n\b\u0002\u0010\u0089\u0002\u001a\u00030Æ\u0001H\u0002J\n\u0010\u008a\u0002\u001a\u00030\u0081\u0001H\u0002J\u0019\u0010\u008d\u0002\u001a\u00030¼\u0001*\u00030ë\u00012\b\u0010Ü\u0001\u001a\u00030à\u0001H\u0002R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R)\u00101\u001a\r\u0012\t\u0012\u000703¢\u0006\u0002\b4028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u00109\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010?\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001e\u0010E\u001a\u00020F8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010K\u001a\u00020L8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001e\u0010Q\u001a\u00020R8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001e\u0010W\u001a\u00020X8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001e\u0010]\u001a\u00020^8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010c\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\bd\u0010\f\u001a\u0004\be\u0010\u0016\"\u0004\bf\u0010\u0018R\u001e\u0010g\u001a\u00020h8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001b\u0010m\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bo\u0010pR\u001b\u0010s\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010r\u001a\u0004\bu\u0010vR\u001b\u0010x\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010r\u001a\u0004\bz\u0010{R\u001b\u0010}\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u007f\u0010r\u001a\u0004\b~\u0010{R5\u0010\u0082\u0001\u001a\u00030\u0081\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u00018B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R \u0010\u0089\u0001\u001a\u00030\u008a\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008d\u0001\u0010r\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R!\u0010\u008e\u0001\u001a\u00030\u008f\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R!\u0010\u0094\u0001\u001a\u00030\u0095\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0093\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001e\u0010\u0099\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0005\u0012\u00030\u009c\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u009d\u0001\u001a\u00030\u009c\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u009e\u0001\u001a\u00030\u009c\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010¡\u0001\u001a\u00030¢\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010£\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0005\u0012\u00030¦\u00010¥\u0001j\u0003`§\u00010¤\u0001X\u0082.¢\u0006\u0002\n\u0000R\u0017\u0010¨\u0001\u001a\n\u0012\u0005\u0012\u00030ª\u00010©\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010«\u0001\u001a\u00030\u0081\u0001X\u0096D¢\u0006\n\n\u0000\u001a\u0006\b¬\u0001\u0010\u0084\u0001R\u0018\u0010\u00ad\u0001\u001a\u00030\u0081\u0001X\u0096D¢\u0006\n\n\u0000\u001a\u0006\b®\u0001\u0010\u0084\u0001R\u0018\u0010¯\u0001\u001a\u00030°\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u0010\u0010³\u0001\u001a\u00030´\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010µ\u0001\u001a\u00030¶\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010·\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030º\u00010¹\u00010¸\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010è\u0001\u001a\u00030\u009b\u0001*\u00030à\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002¨\u0006\u0095\u0002²\u0006\f\u0010\u0096\u0002\u001a\u00030\u0097\u0002X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/ui/MainTabActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/analytics/performance/startup/StartupActivity;", "Lcom/robinhood/android/educationtour/interfaces/EducationTourActivity;", "Lcom/robinhood/android/common/tabs/TabManager;", "Lcom/robinhood/android/navigation/Tabbed;", "Landroidx/fragment/app/FragmentManager$OnBackStackChangedListener;", "Lcom/robinhood/android/crypto/lib/CryptoDetailCallbacks;", "Lcom/robinhood/android/common/equitydetail/InstrumentDetailListParentCallbacks;", "Lcom/robinhood/android/libs/tabs/ChromeStyleController;", "Lcom/robinhood/shared/common/bottomtab/controller/BottomTabsVisibilityController;", "<init>", "()V", "hasVisitedInboxTabPref", "Lcom/robinhood/prefs/BooleanPreference;", "getHasVisitedInboxTabPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setHasVisitedInboxTabPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "snowflakesConfettiLastShownDatePref", "Lcom/robinhood/prefs/StringPreference;", "getSnowflakesConfettiLastShownDatePref", "()Lcom/robinhood/prefs/StringPreference;", "setSnowflakesConfettiLastShownDatePref", "(Lcom/robinhood/prefs/StringPreference;)V", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/SharedEventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/SharedEventLogger;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "gcmManager", "Lcom/robinhood/android/common/util/GcmManager;", "getGcmManager", "()Lcom/robinhood/android/common/util/GcmManager;", "setGcmManager", "(Lcom/robinhood/android/common/util/GcmManager;)V", "inboxBadgeStore", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "getInboxBadgeStore", "()Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "setInboxBadgeStore", "(Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;)V", "mainTabActivityListeners", "", "Lcom/robinhood/android/common/util/lifecycle/MainTabActivityListener;", "Lkotlin/jvm/JvmSuppressWildcards;", "getMainTabActivityListeners", "()Ljava/util/Set;", "setMainTabActivityListeners", "(Ljava/util/Set;)V", "confetti", "Lcom/robinhood/android/designsystem/confetti/Confetti;", "getConfetti", "()Lcom/robinhood/android/designsystem/confetti/Confetti;", "setConfetti", "(Lcom/robinhood/android/designsystem/confetti/Confetti;)V", "notificationHandler", "Lcom/robinhood/android/common/notification/NotificationManager;", "getNotificationHandler", "()Lcom/robinhood/android/common/notification/NotificationManager;", "setNotificationHandler", "(Lcom/robinhood/android/common/notification/NotificationManager;)V", "resumeApplicationManager", "Lcom/robinhood/android/resumeapplication/ResumeApplicationManager;", "getResumeApplicationManager", "()Lcom/robinhood/android/resumeapplication/ResumeApplicationManager;", "setResumeApplicationManager", "(Lcom/robinhood/android/resumeapplication/ResumeApplicationManager;)V", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "getTooltipManager", "()Lcom/robinhood/tooltips/TooltipManager;", "setTooltipManager", "(Lcom/robinhood/tooltips/TooltipManager;)V", "attributionManager", "Lcom/robinhood/referral/AttributionManager;", "getAttributionManager", "()Lcom/robinhood/referral/AttributionManager;", "setAttributionManager", "(Lcom/robinhood/referral/AttributionManager;)V", "blockedDeeplinkPrompt", "Lcom/robinhood/shared/home/deeplink/prompt/BlockedExternalDeeplinkPrompt;", "getBlockedDeeplinkPrompt", "()Lcom/robinhood/shared/home/deeplink/prompt/BlockedExternalDeeplinkPrompt;", "setBlockedDeeplinkPrompt", "(Lcom/robinhood/shared/home/deeplink/prompt/BlockedExternalDeeplinkPrompt;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "bugBashDeeplinkSharedPref", "getBugBashDeeplinkSharedPref$annotations", "getBugBashDeeplinkSharedPref", "setBugBashDeeplinkSharedPref", "accountSelectorHomeManger", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "getAccountSelectorHomeManger", "()Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "setAccountSelectorHomeManger", "(Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;)V", "mainTabContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMainTabContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "mainTabContainer$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bottomNavigationDivider", "Landroid/view/View;", "getBottomNavigationDivider", "()Landroid/view/View;", "bottomNavigationDivider$delegate", "composeTabBarView", "Landroidx/compose/ui/platform/ComposeView;", "getComposeTabBarView", "()Landroidx/compose/ui/platform/ComposeView;", "composeTabBarView$delegate", "mobileLinkingCollapsedView", "getMobileLinkingCollapsedView", "mobileLinkingCollapsedView$delegate", "<set-?>", "", "mobileLinkingCollapsedViewIsVisible", "getMobileLinkingCollapsedViewIsVisible", "()Z", "setMobileLinkingCollapsedViewIsVisible", "(Z)V", "mobileLinkingCollapsedViewIsVisible$delegate", "Landroidx/compose/runtime/MutableState;", "snackbarContainer", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getSnackbarContainer", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "snackbarContainer$delegate", "duxo", "Lcom/robinhood/android/ui/MainTabBarDuxo;", "getDuxo", "()Lcom/robinhood/android/ui/MainTabBarDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "searchHighlightsDuxo", "Lcom/robinhood/android/search/highlights/duxo/SearchHighlightsDuxo;", "getSearchHighlightsDuxo", "()Lcom/robinhood/android/search/highlights/duxo/SearchHighlightsDuxo;", "searchHighlightsDuxo$delegate", "tabToLastSeenTime", "", "Lcom/robinhood/compose/bento/component/BentoTabBarState$Tab;", "", "currentTabStartTime", "lastPauseTime", "creditCardTabStateJob", "Lkotlinx/coroutines/Job;", "keyboardVisibility", "Lcom/robinhood/android/common/util/KeyboardVisibility;", "defaultToolbarOverlays", "Landroid/util/SparseArray;", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "Lcom/robinhood/scarlet/util/resource/StyleReference;", "mainTabContainerBottomInset", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/unit/Dp;", "excludeFromAnalyticsLogging", "getExcludeFromAnalyticsLogging", "allowMainBanner", "getAllowMainBanner", "screen", "Lcom/robinhood/analytics/performance/startup/StartupActivity$Screen;", "getScreen", "()Lcom/robinhood/analytics/performance/startup/StartupActivity$Screen;", "notificationUnifiedChatInterceptor", "Lcom/robinhood/shared/support/supportchat/targets/SupportChatThreadNotificationInterceptor;", "mobileLinkingInterceptor", "Lcom/robinhood/android/linking/MobileLinkingNotificationHandler;", "mobileLinkingLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/blackwidow/contracts/MobileLinkingHostIntentKey;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onResume", "bindResumeApplicationViewState", "viewState", "Lcom/robinhood/android/resumeapplication/ResumeApplicationViewState;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onPause", "onSaveInstanceState", "outState", "onPositiveButtonClicked", "id", "passthroughArgs", "onNegativeButtonClicked", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "showCloseIcon", "showBackArrowIcon", "getMenuItemTint", "onBackPressed", "onBackStackChanged", "handleCustomIntent", "intent", "replaceFragmentInActiveTab", "fragment", "Landroidx/fragment/app/Fragment;", "onFragmentChanged", "tabFragment", "Lcom/robinhood/android/common/ui/BaseTabFragment;", "reThemeToolbar", "getCurrentFragment", "toggleBottomTabBarVisibility", "isVisible", "onCurrentTabReselected", "findActiveFragment", "findFragment", "tab", "selectTabLink", "tabLinkIntentKey", "Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;", "showTab", "logTabLeaving", "updateChromeStyling", "Lcom/robinhood/android/common/ui/BaseFragment;", "updateActionBar", "activeFragment", "showWatchlistScreen", MainTabActivity.EXTRA_WATCHLIST_SCREEN, "Lcom/robinhood/android/home/contracts/WatchlistScreen;", "showMobileLinkingCollapsed", "accountNumber", "", "hideMobileLinkingCollapsed", "showMobileLinkingSnackbar", "showMobileLinkingScreen", "groupId", "playSound", "popLastFragment", "showCryptoDetail", "currencyPairId", "Ljava/util/UUID;", "onInstrumentDetailListParentBackPressed", "type", "Lcom/robinhood/android/common/equitydetail/InstrumentType;", "updateInboxTopNavBadge", "shouldBadge", "isCritical", "showSnackbar", "message", "duration", "isLaunchingFromBackground", "getTab", "(Lcom/robinhood/android/common/ui/BaseTabFragment;)Lcom/robinhood/compose/bento/component/BentoTabBarState$Tab;", "reconfigure", "SavedState", "WatchListIntentResolver", "DefaultIntentResolver", "TabIntentResolver", "BlockedExternalDeeplinkIntentResolver", "MobileLinkingIntentResolver", "Companion", "feature-tab-ui_externalDebug", "state", "Lcom/robinhood/android/ui/MainTabBarViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class MainTabActivity extends BaseActivity implements StartupActivity, EducationTourActivity, TabManager, Tabbed, FragmentManager.OnBackStackChangedListener, CryptoDetailCallbacks, InstrumentDetailListParentCallbacks, ChromeStyleController, BottomTabsController {
    private static final String EXTRA_BLOCKED_DEEPLINK_URL = "blockedDeeplinkUrl";
    private static final String EXTRA_MOBILE_LINKING_ACCOUNT_NUMBER = "mobileLinkingAccountNumber";
    private static final String EXTRA_MOBILE_LINKING_GROUP_ID = "mobileLinkingGroupId";
    private static final String EXTRA_SHOW_FRAGMENT_IN_TAB = "showFragmentInTab";
    private static final String EXTRA_TAB_LINK = "tabLink";
    private static final String EXTRA_WATCHLIST_SCREEN = "watchlistScreen";
    private static final int MAX_BACKSTACK_COUNT = 10;
    private static final String SAVE_LAST_SEEN_TIMES = "lastSeenTimes";
    public AccountSelectorHomeManager accountSelectorHomeManger;
    private final boolean allowMainBanner;
    public AnalyticsLogger analytics;
    public AttributionManager attributionManager;
    public BlockedExternalDeeplinkPrompt blockedDeeplinkPrompt;

    /* renamed from: bottomNavigationDivider$delegate, reason: from kotlin metadata */
    private final Interfaces2 bottomNavigationDivider;
    public StringPreference bugBashDeeplinkSharedPref;

    /* renamed from: composeTabBarView$delegate, reason: from kotlin metadata */
    private final Interfaces2 composeTabBarView;
    public Confetti confetti;
    private Job creditCardTabStateJob;
    private long currentTabStartTime;
    private SparseArray<ResourceReferences4<StyleResource>> defaultToolbarOverlays;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public SharedEventLogger eventLogger;
    private final boolean excludeFromAnalyticsLogging;
    public GcmManager gcmManager;

    @HasVisitedInboxTabPref
    public BooleanPreference hasVisitedInboxTabPref;
    public InboxBadgeStore inboxBadgeStore;
    private final KeyboardVisibility keyboardVisibility;
    private long lastPauseTime;
    public Set<MainTabActivityListener> mainTabActivityListeners;

    /* renamed from: mainTabContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 mainTabContainer;
    private final SnapshotState<C2002Dp> mainTabContainerBottomInset;

    /* renamed from: mobileLinkingCollapsedView$delegate, reason: from kotlin metadata */
    private final Interfaces2 mobileLinkingCollapsedView;

    /* renamed from: mobileLinkingCollapsedViewIsVisible$delegate, reason: from kotlin metadata */
    private final SnapshotState mobileLinkingCollapsedViewIsVisible;
    private final MobileLinkingNotificationHandler mobileLinkingInterceptor;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<MobileLinkingHostIntentKey>> mobileLinkingLauncher;
    public NotificationManager notificationHandler;
    private final SupportChatThreadNotificationHandler notificationUnifiedChatInterceptor;
    public ResumeApplicationManager resumeApplicationManager;

    /* renamed from: searchHighlightsDuxo$delegate, reason: from kotlin metadata */
    private final Lazy searchHighlightsDuxo;

    /* renamed from: snackbarContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 snackbarContainer;

    @SnowflakesConfettiLastShownDatePref
    public StringPreference snowflakesConfettiLastShownDatePref;
    private final Map<BentoTabBarState.Tab, Long> tabToLastSeenTime;
    public TooltipManager tooltipManager;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MainTabActivity.class, "mainTabContainer", "getMainTabContainer()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)), Reflection.property1(new PropertyReference1Impl(MainTabActivity.class, "bottomNavigationDivider", "getBottomNavigationDivider()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(MainTabActivity.class, "composeTabBarView", "getComposeTabBarView()Landroidx/compose/ui/platform/ComposeView;", 0)), Reflection.property1(new PropertyReference1Impl(MainTabActivity.class, "mobileLinkingCollapsedView", "getMobileLinkingCollapsedView()Landroidx/compose/ui/platform/ComposeView;", 0)), Reflection.property1(new PropertyReference1Impl(MainTabActivity.class, "snackbarContainer", "getSnackbarContainer()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Duration INACTIVE_DURATION_THRESHOLD = Durations.INSTANCE.getFIFTEEN_MINUTES();

    /* compiled from: MainTabActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[WatchListIntentKey2.values().length];
            try {
                iArr[WatchListIntentKey2.WATCHLIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WatchListIntentKey2.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WatchListIntentKey2.HISTORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WatchListIntentKey2.ORDERS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WatchListIntentKey2.OPTION_EVENTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WatchListIntentKey2.DIVIDENDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WatchListIntentKey2.ADR_FEES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WatchListIntentKey2.TRANSFERS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[WatchListIntentKey2.GIFTS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[WatchListIntentKey2.BANKING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[WatchListIntentKey2.TAX_DOCUMENTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[WatchListIntentKey2.AUTOMATIC_DEPOSITS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[WatchListIntentKey2.HELP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[WatchListIntentKey2.LICENSES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[WatchListIntentKey2.NOT_APPLICABLE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InstrumentType.values().length];
            try {
                iArr2[InstrumentType.STOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[InstrumentType.ETF.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @BugBashPrefModule2
    public static /* synthetic */ void getBugBashDeeplinkSharedPref$annotations() {
    }

    @JvmStatic
    @JvmOverloads
    public static final Intent getStartIntent(Context context) {
        return INSTANCE.getStartIntent(context);
    }

    @JvmStatic
    @JvmOverloads
    public static final Intent getStartIntent(Context context, WatchListIntentKey2 watchListIntentKey2) {
        return INSTANCE.getStartIntent(context, watchListIntentKey2);
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public /* bridge */ /* synthetic */ void onBackStackChangeCancelled() {
        super.onBackStackChangeCancelled();
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public /* bridge */ /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
        super.onBackStackChangeCommitted(fragment, z);
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public /* bridge */ /* synthetic */ void onBackStackChangeProgressed(BackEventCompat backEventCompat) {
        super.onBackStackChangeProgressed(backEventCompat);
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public /* bridge */ /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
        super.onBackStackChangeStarted(fragment, z);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void showBackArrowIcon() {
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void showCloseIcon() {
    }

    @Override // com.robinhood.android.educationtour.interfaces.EducationTourActivity
    public boolean handleBackPressed() {
        return EducationTourActivity.DefaultImpls.handleBackPressed(this);
    }

    public MainTabActivity() {
        super(C29231R.layout.activity_main_tab);
        this.mainTabContainer = bindView(C29231R.id.main_tab);
        this.bottomNavigationDivider = bindView(C29231R.id.bottom_nav_bar_divider);
        this.composeTabBarView = bindView(C29231R.id.compose_tab_bar);
        this.mobileLinkingCollapsedView = bindView(C29231R.id.mobile_linking_collapsed);
        this.mobileLinkingCollapsedViewIsVisible = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.snackbarContainer = bindView(C29231R.id.snackbar_container);
        this.duxo = DuxosKt.duxo(this, MainTabBarDuxo.class);
        this.searchHighlightsDuxo = DuxosKt.duxo(this, SearchHighlightsDuxo.class);
        this.tabToLastSeenTime = new LinkedHashMap();
        this.currentTabStartTime = SystemClock.elapsedRealtime();
        this.keyboardVisibility = new KeyboardVisibility();
        this.mainTabContainerBottomInset = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), null, 2, null);
        this.excludeFromAnalyticsLogging = true;
        this.allowMainBanner = true;
        this.notificationUnifiedChatInterceptor = new SupportChatThreadNotificationHandler(new Function1() { // from class: com.robinhood.android.ui.MainTabActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MainTabActivity.notificationUnifiedChatInterceptor$lambda$0(this.f$0, (Uri) obj));
            }
        });
        this.mobileLinkingInterceptor = new MobileLinkingNotificationHandler(new Function2() { // from class: com.robinhood.android.ui.MainTabActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(MainTabActivity.mobileLinkingInterceptor$lambda$1(this.f$0, (String) obj, (String) obj2));
            }
        });
        this.mobileLinkingLauncher = registerForActivityResult(new MobileLinkingResultContract(new Function0() { // from class: com.robinhood.android.ui.MainTabActivity$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.ui.MainTabActivity$mobileLinkingLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(MobileLinkingResultContract.Result result) {
                if (result != null) {
                    if (result.getShowCollapsedView()) {
                        this.this$0.showMobileLinkingCollapsed(result.getAccountNumber());
                    } else {
                        this.this$0.showMobileLinkingSnackbar();
                    }
                }
            }
        });
    }

    public final BooleanPreference getHasVisitedInboxTabPref() {
        BooleanPreference booleanPreference = this.hasVisitedInboxTabPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasVisitedInboxTabPref");
        return null;
    }

    public final void setHasVisitedInboxTabPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasVisitedInboxTabPref = booleanPreference;
    }

    public final StringPreference getSnowflakesConfettiLastShownDatePref() {
        StringPreference stringPreference = this.snowflakesConfettiLastShownDatePref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("snowflakesConfettiLastShownDatePref");
        return null;
    }

    public final void setSnowflakesConfettiLastShownDatePref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.snowflakesConfettiLastShownDatePref = stringPreference;
    }

    public final SharedEventLogger getEventLogger() {
        SharedEventLogger sharedEventLogger = this.eventLogger;
        if (sharedEventLogger != null) {
            return sharedEventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(SharedEventLogger sharedEventLogger) {
        Intrinsics.checkNotNullParameter(sharedEventLogger, "<set-?>");
        this.eventLogger = sharedEventLogger;
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

    public final GcmManager getGcmManager() {
        GcmManager gcmManager = this.gcmManager;
        if (gcmManager != null) {
            return gcmManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gcmManager");
        return null;
    }

    public final void setGcmManager(GcmManager gcmManager) {
        Intrinsics.checkNotNullParameter(gcmManager, "<set-?>");
        this.gcmManager = gcmManager;
    }

    public final InboxBadgeStore getInboxBadgeStore() {
        InboxBadgeStore inboxBadgeStore = this.inboxBadgeStore;
        if (inboxBadgeStore != null) {
            return inboxBadgeStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("inboxBadgeStore");
        return null;
    }

    public final void setInboxBadgeStore(InboxBadgeStore inboxBadgeStore) {
        Intrinsics.checkNotNullParameter(inboxBadgeStore, "<set-?>");
        this.inboxBadgeStore = inboxBadgeStore;
    }

    public final Set<MainTabActivityListener> getMainTabActivityListeners() {
        Set<MainTabActivityListener> set = this.mainTabActivityListeners;
        if (set != null) {
            return set;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainTabActivityListeners");
        return null;
    }

    public final void setMainTabActivityListeners(Set<MainTabActivityListener> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.mainTabActivityListeners = set;
    }

    public final Confetti getConfetti() {
        Confetti confetti = this.confetti;
        if (confetti != null) {
            return confetti;
        }
        Intrinsics.throwUninitializedPropertyAccessException("confetti");
        return null;
    }

    public final void setConfetti(Confetti confetti) {
        Intrinsics.checkNotNullParameter(confetti, "<set-?>");
        this.confetti = confetti;
    }

    public final NotificationManager getNotificationHandler() {
        NotificationManager notificationManager = this.notificationHandler;
        if (notificationManager != null) {
            return notificationManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notificationHandler");
        return null;
    }

    public final void setNotificationHandler(NotificationManager notificationManager) {
        Intrinsics.checkNotNullParameter(notificationManager, "<set-?>");
        this.notificationHandler = notificationManager;
    }

    public final ResumeApplicationManager getResumeApplicationManager() {
        ResumeApplicationManager resumeApplicationManager = this.resumeApplicationManager;
        if (resumeApplicationManager != null) {
            return resumeApplicationManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resumeApplicationManager");
        return null;
    }

    public final void setResumeApplicationManager(ResumeApplicationManager resumeApplicationManager) {
        Intrinsics.checkNotNullParameter(resumeApplicationManager, "<set-?>");
        this.resumeApplicationManager = resumeApplicationManager;
    }

    @Override // com.robinhood.tooltips.TooltipActivity
    public TooltipManager getTooltipManager() {
        TooltipManager tooltipManager = this.tooltipManager;
        if (tooltipManager != null) {
            return tooltipManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tooltipManager");
        return null;
    }

    public void setTooltipManager(TooltipManager tooltipManager) {
        Intrinsics.checkNotNullParameter(tooltipManager, "<set-?>");
        this.tooltipManager = tooltipManager;
    }

    public final AttributionManager getAttributionManager() {
        AttributionManager attributionManager = this.attributionManager;
        if (attributionManager != null) {
            return attributionManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("attributionManager");
        return null;
    }

    public final void setAttributionManager(AttributionManager attributionManager) {
        Intrinsics.checkNotNullParameter(attributionManager, "<set-?>");
        this.attributionManager = attributionManager;
    }

    public final BlockedExternalDeeplinkPrompt getBlockedDeeplinkPrompt() {
        BlockedExternalDeeplinkPrompt blockedExternalDeeplinkPrompt = this.blockedDeeplinkPrompt;
        if (blockedExternalDeeplinkPrompt != null) {
            return blockedExternalDeeplinkPrompt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("blockedDeeplinkPrompt");
        return null;
    }

    public final void setBlockedDeeplinkPrompt(BlockedExternalDeeplinkPrompt blockedExternalDeeplinkPrompt) {
        Intrinsics.checkNotNullParameter(blockedExternalDeeplinkPrompt, "<set-?>");
        this.blockedDeeplinkPrompt = blockedExternalDeeplinkPrompt;
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

    public final StringPreference getBugBashDeeplinkSharedPref() {
        StringPreference stringPreference = this.bugBashDeeplinkSharedPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bugBashDeeplinkSharedPref");
        return null;
    }

    public final void setBugBashDeeplinkSharedPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.bugBashDeeplinkSharedPref = stringPreference;
    }

    public final AccountSelectorHomeManager getAccountSelectorHomeManger() {
        AccountSelectorHomeManager accountSelectorHomeManager = this.accountSelectorHomeManger;
        if (accountSelectorHomeManager != null) {
            return accountSelectorHomeManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountSelectorHomeManger");
        return null;
    }

    public final void setAccountSelectorHomeManger(AccountSelectorHomeManager accountSelectorHomeManager) {
        Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "<set-?>");
        this.accountSelectorHomeManger = accountSelectorHomeManager;
    }

    private final ConstraintLayout getMainTabContainer() {
        return (ConstraintLayout) this.mainTabContainer.getValue(this, $$delegatedProperties[0]);
    }

    private final View getBottomNavigationDivider() {
        return (View) this.bottomNavigationDivider.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposeView getComposeTabBarView() {
        return (ComposeView) this.composeTabBarView.getValue(this, $$delegatedProperties[2]);
    }

    private final ComposeView getMobileLinkingCollapsedView() {
        return (ComposeView) this.mobileLinkingCollapsedView.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getMobileLinkingCollapsedViewIsVisible() {
        return ((Boolean) this.mobileLinkingCollapsedViewIsVisible.getValue()).booleanValue();
    }

    private final void setMobileLinkingCollapsedViewIsVisible(boolean z) {
        this.mobileLinkingCollapsedViewIsVisible.setValue(Boolean.valueOf(z));
    }

    private final CoordinatorLayout getSnackbarContainer() {
        return (CoordinatorLayout) this.snackbarContainer.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainTabBarDuxo getDuxo() {
        return (MainTabBarDuxo) this.duxo.getValue();
    }

    private final SearchHighlightsDuxo getSearchHighlightsDuxo() {
        return (SearchHighlightsDuxo) this.searchHighlightsDuxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean getAllowMainBanner() {
        return this.allowMainBanner;
    }

    @Override // com.robinhood.analytics.performance.startup.StartupActivity
    public StartupActivity.Screen getScreen() {
        return StartupActivity.Screen.MAIN_TAB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean notificationUnifiedChatInterceptor$lambda$0(MainTabActivity mainTabActivity, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<unused var>");
        mainTabActivity.getInboxBadgeStore().refreshChatBadge();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mobileLinkingInterceptor$lambda$1(MainTabActivity mainTabActivity, String accountNumber, String groupId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        mainTabActivity.showMobileLinkingScreen(accountNumber, groupId, true);
        mainTabActivity.hideMobileLinkingCollapsed();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String str;
        FragmentManager childFragmentManager;
        super.onCreate(savedInstanceState);
        IdlingResourceCounters2.setBusy(IdlingResourceType.MAIN_TABS_VISIBLE, true);
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        this.defaultToolbarOverlays = ScarletManager2.getScarletManager(rhToolbar).dumpOverlays();
        if (savedInstanceState == null || savedInstanceState.isEmpty()) {
            showTab(TabLinkIntentKey.Home.Legacy.INSTANCE);
        } else {
            Parcelable parcelable = savedInstanceState.getParcelable(SAVE_LAST_SEEN_TIMES);
            Intrinsics.checkNotNull(parcelable);
            this.tabToLastSeenTime.putAll(((SavedState) parcelable).getTabToLastSeenTime());
            BaseTabFragment baseTabFragmentFindActiveFragment = findActiveFragment();
            if (baseTabFragmentFindActiveFragment != null && (childFragmentManager = baseTabFragmentFindActiveFragment.getChildFragmentManager()) != null) {
                childFragmentManager.addOnBackStackChangedListener(this);
            }
            onFragmentChanged();
        }
        this.keyboardVisibility.register(this, new Function1() { // from class: com.robinhood.android.ui.MainTabActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainTabActivity.onCreate$lambda$3(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C312972(null), 3, null);
        Iterator<MainTabActivityListener> it = getMainTabActivityListeners().iterator();
        while (it.hasNext()) {
            it.next().onMainTabActivityCreated(this);
        }
        getComposeTabBarView().setContent(ComposableLambda3.composableLambdaInstance(-1652266537, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.ui.MainTabActivity.onCreate.3
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
                    ComposerKt.traceEventStart(-1652266537, i, -1, "com.robinhood.android.ui.MainTabActivity.onCreate.<anonymous> (MainTabActivity.kt:272)");
                }
                Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(MainTabActivity.this));
                final MainTabActivity mainTabActivity = MainTabActivity.this;
                BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(314708873, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.ui.MainTabActivity.onCreate.3.1
                    private static final MainTabBarViewState invoke$lambda$0(SnapshotState4<MainTabBarViewState> snapshotState4) {
                        return snapshotState4.getValue();
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
                            ComposerKt.traceEventStart(314708873, i2, -1, "com.robinhood.android.ui.MainTabActivity.onCreate.<anonymous>.<anonymous> (MainTabActivity.kt:275)");
                        }
                        TabBarThemeOverlay.TabBarThemeOverlay(invoke$lambda$0(FlowExtKt.collectAsStateWithLifecycle(mainTabActivity.getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7)).getCreditCardTabStyle(), ComposableLambda3.rememberComposableLambda(-2058429380, true, new C506361(mainTabActivity), composer2, 54), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: MainTabActivity.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.ui.MainTabActivity$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C506361 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ MainTabActivity this$0;

                        C506361(MainTabActivity mainTabActivity) {
                            this.this$0 = mainTabActivity;
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
                                ComposerKt.traceEventStart(-2058429380, i, -1, "com.robinhood.android.ui.MainTabActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MainTabActivity.kt:279)");
                            }
                            MainTabBarDuxo duxo = this.this$0.getDuxo();
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(PrimitiveResources_androidKt.dimensionResource(C29231R.dimen.material_design_bottom_navigation_height, composer, 0) + ((C2002Dp) this.this$0.mainTabContainerBottomInset.getValue()).getValue())), 0.0f, 1, null);
                            WindowInsets windowInsetsM5185WindowInsetsa9UjIt4$default = WindowInsetsKt.m5185WindowInsetsa9UjIt4$default(0.0f, 0.0f, 0.0f, ((C2002Dp) this.this$0.mainTabContainerBottomInset.getValue()).getValue(), 7, null);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.this$0);
                            final MainTabActivity mainTabActivity = this.this$0;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.ui.MainTabActivity$onCreate$3$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return MainTabActivity.C312983.AnonymousClass1.C506361.invoke$lambda$1$lambda$0(mainTabActivity, (BentoTabBarState.Tab) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            MainTabBarViewComposable3.MainTabBarComposable(duxo, modifierFillMaxWidth$default, windowInsetsM5185WindowInsetsa9UjIt4$default, (Function1) objRememberedValue, composer, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(MainTabActivity mainTabActivity, BentoTabBarState.Tab bentoTab) {
                            Intrinsics.checkNotNullParameter(bentoTab, "bentoTab");
                            mainTabActivity.showTab(TabUtils.toTabLinkIntentKey(bentoTab));
                            return Unit.INSTANCE;
                        }
                    }
                }, composer, 54), composer, 384, 2);
                IdlingResourceCounters2.setBusy(IdlingResourceType.MAIN_TABS_VISIBLE, false);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        getComposeTabBarView().setTag(TooltipTags.tabBarTooltipTag);
        WindowInsetsListener2.doOnApplyWindowInsets(getMainTabContainer(), new WindowInsetsListener() { // from class: com.robinhood.android.ui.MainTabActivity.onCreate.4
            @Override // com.robinhood.utils.p409ui.edge2edge.WindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets, RelativePadding initialPadding) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(insets, "insets");
                Intrinsics.checkNotNullParameter(initialPadding, "initialPadding");
                Intrinsics.checkNotNullExpressionValue(insets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime()), "getInsets(...)");
                MainTabActivity.this.mainTabContainerBottomInset.setValue(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(r2.bottom / MainTabActivity.this.getResources().getDisplayMetrics().density)));
                return insets;
            }
        });
        collectDuxoState(Lifecycle.State.STARTED, new C313005(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C313016(null), 3, null);
        if (BuildFlavors.INSTANCE.isDebugOrInternal() && (str = getBugBashDeeplinkSharedPref().get()) != null) {
            getBugBashDeeplinkSharedPref().set(null);
            Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, Uri.parse(str), null, null, false, null, 60, null);
        }
        getSearchHighlightsDuxo().preloadIfNeeded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(final MainTabActivity mainTabActivity, boolean z) {
        if (!z) {
            mainTabActivity.getComposeTabBarView().post(new Runnable() { // from class: com.robinhood.android.ui.MainTabActivity$onCreate$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.getComposeTabBarView().setVisibility(0);
                }
            });
        } else {
            mainTabActivity.getComposeTabBarView().setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: MainTabActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabActivity$onCreate$2", m3645f = "MainTabActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.ui.MainTabActivity$onCreate$2 */
    static final class C312972 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C312972(Continuation<? super C312972> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainTabActivity.this.new C312972(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C312972) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MainTabActivity.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabActivity$onCreate$2$1", m3645f = "MainTabActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.ui.MainTabActivity$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ MainTabActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MainTabActivity mainTabActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = mainTabActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MainTabActivity.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabActivity$onCreate$2$1$1", m3645f = "MainTabActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.ui.MainTabActivity$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ MainTabActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506341(MainTabActivity mainTabActivity, Continuation<? super C506341> continuation) {
                    super(2, continuation);
                    this.this$0 = mainTabActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C506341(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C506341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        StateFlow<ResumeApplicationViewState> state = this.this$0.getResumeApplicationManager().getState();
                        C506351 c506351 = new C506351(this.this$0);
                        this.label = 1;
                        if (state.collect(c506351, this) == coroutine_suspended) {
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

                /* compiled from: MainTabActivity.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.ui.MainTabActivity$onCreate$2$1$1$1, reason: invalid class name and collision with other inner class name */
                /* synthetic */ class C506351 implements FlowCollector, FunctionAdapter {
                    final /* synthetic */ MainTabActivity $tmp0;

                    C506351(MainTabActivity mainTabActivity) {
                        this.$tmp0 = mainTabActivity;
                    }

                    public final boolean equals(Object obj) {
                        if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.FunctionAdapter
                    public final Function<?> getFunctionDelegate() {
                        return new AdaptedFunctionReference(2, this.$tmp0, MainTabActivity.class, "bindResumeApplicationViewState", "bindResumeApplicationViewState(Lcom/robinhood/android/resumeapplication/ResumeApplicationViewState;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }

                    public final Object emit(ResumeApplicationViewState resumeApplicationViewState, Continuation<? super Unit> continuation) {
                        Object objInvokeSuspend$bindResumeApplicationViewState = C506341.invokeSuspend$bindResumeApplicationViewState(this.$tmp0, resumeApplicationViewState, continuation);
                        return objInvokeSuspend$bindResumeApplicationViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bindResumeApplicationViewState : Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                        return emit((ResumeApplicationViewState) obj, (Continuation<? super Unit>) continuation);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ Object invokeSuspend$bindResumeApplicationViewState(MainTabActivity mainTabActivity, ResumeApplicationViewState resumeApplicationViewState, Continuation continuation) {
                    mainTabActivity.bindResumeApplicationViewState(resumeApplicationViewState);
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MainTabActivity mainTabActivity = this.this$0;
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    C506341 c506341 = new C506341(mainTabActivity, null);
                    this.label = 1;
                    if (RepeatOnLifecycle.repeatOnLifecycle(mainTabActivity, state, c506341, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MainTabActivity.this, null);
                this.label = 1;
                if (Suspend.withMain$default(null, anonymousClass1, this, 1, null) == coroutine_suspended) {
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

    /* compiled from: MainTabActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabActivity$onCreate$5", m3645f = "MainTabActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.ui.MainTabActivity$onCreate$5 */
    static final class C313005 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313005(Continuation<? super C313005> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainTabActivity.this.new C313005(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313005) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(MainTabActivity.this.getDuxo().getEventFlow());
                final MainTabActivity mainTabActivity = MainTabActivity.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.ui.MainTabActivity.onCreate.5.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<MainTabBarEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<MainTabBarEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<MainTabBarEvent> eventConsumerInvoke;
                        final MainTabActivity mainTabActivity2 = mainTabActivity;
                        if ((event.getData() instanceof MainTabBarEvent.CurrentTabReselectedEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.ui.MainTabActivity$onCreate$5$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m20017invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m20017invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    mainTabActivity2.onCurrentTabReselected();
                                }
                            });
                        }
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

    /* compiled from: MainTabActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabActivity$onCreate$6", m3645f = "MainTabActivity.kt", m3646l = {EnumC7081g.f2781x2ba65ba3}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.ui.MainTabActivity$onCreate$6 */
    static final class C313016 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313016(Continuation<? super C313016> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainTabActivity.this.new C313016(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313016) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<AttributionNavigation> nextScreenFlow = MainTabActivity.this.getAttributionManager().getNextScreenFlow();
                final MainTabActivity mainTabActivity = MainTabActivity.this;
                FlowCollector<? super AttributionNavigation> flowCollector = new FlowCollector() { // from class: com.robinhood.android.ui.MainTabActivity.onCreate.6.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((AttributionNavigation) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(AttributionNavigation attributionNavigation, Continuation<? super Unit> continuation) {
                        mainTabActivity.getAttributionManager().resetNextScreenFlow();
                        if (attributionNavigation instanceof IntentKeyNavigation) {
                            Navigator.DefaultImpls.startActivity$default(mainTabActivity.getNavigator(), mainTabActivity, ((IntentKeyNavigation) attributionNavigation).getIntentKey(), null, false, null, null, 60, null);
                        } else {
                            if (!(attributionNavigation instanceof DeeplinkNavigation)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            boxing.boxBoolean(Navigator.DefaultImpls.handleDeepLink$default(mainTabActivity.getNavigator(), mainTabActivity, Uri.parse(((DeeplinkNavigation) attributionNavigation).getDeeplink()), null, null, false, null, 60, null));
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (nextScreenFlow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.currentTabStartTime = SystemClock.elapsedRealtime();
        getResumeApplicationManager().refresh();
        Observable<InboxBadge> observableDistinctUntilChanged = getInboxBadgeStore().streamBadgeResult().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.ui.MainTabActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainTabActivity.onStart$lambda$5(this.f$0, (InboxBadge) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(MainTabActivity mainTabActivity, InboxBadge inboxBadge) {
        mainTabActivity.updateInboxTopNavBadge(inboxBadge.getResult(), inboxBadge.getShouldCriticalBadge());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        Iterator<T> it = getMainTabActivityListeners().iterator();
        while (it.hasNext()) {
            ((MainTabActivityListener) it.next()).onMainTabActivityResumed(this);
        }
        final LocalDate localDateCurrentDateInEst$default = LocalDates.currentDateInEst$default(null, 1, null);
        if (Holidays2.isWinterMarketHoliday(localDateCurrentDateInEst$default) && !Intrinsics.areEqual(localDateCurrentDateInEst$default.toString(), getSnowflakesConfettiLastShownDatePref().get())) {
            Observable<DayNightOverlay> observableThrottleLast = getDayNightStyleChanges().throttleLast(300L, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread());
            Intrinsics.checkNotNullExpressionValue(observableThrottleLast, "throttleLast(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableThrottleLast, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.ui.MainTabActivity$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MainTabActivity.onResume$lambda$7(this.f$0, localDateCurrentDateInEst$default, (DayNightOverlay) obj);
                }
            });
        }
        if (this.notificationHandler != null) {
            getNotificationHandler().addInterceptor(this.notificationUnifiedChatInterceptor);
            getNotificationHandler().addInterceptor(this.mobileLinkingInterceptor);
        }
        Observable observableDistinctUntilChanged = ObservablesAndroid.observeOnMainThread(getDayNightStyleChanges()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.ui.MainTabActivity$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainTabActivity.onResume$lambda$8(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(MainTabActivity mainTabActivity, LocalDate localDate, DayNightOverlay dayNightOverlay) throws Resources.NotFoundException {
        Confetti confetti = mainTabActivity.getConfetti();
        View decorView = mainTabActivity.getWindow().getDecorView();
        Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        Intrinsics.checkNotNull(dayNightOverlay);
        confetti.showSnowflakesConfetti(mainTabActivity, (ViewGroup) decorView, dayNightOverlay);
        mainTabActivity.getSnowflakesConfettiLastShownDatePref().set(localDate.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(MainTabActivity mainTabActivity, DayNightOverlay dayNightOverlay) {
        mainTabActivity.onFragmentChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindResumeApplicationViewState(ResumeApplicationViewState viewState) {
        IntentKey intentKeyConsume;
        String forwardToDeeplink = viewState.getForwardToDeeplink();
        if (forwardToDeeplink != null) {
            Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, Uri.parse(forwardToDeeplink), null, null, false, null, 60, null);
            getResumeApplicationManager().seenResumeApplicationScreen();
            return;
        }
        UiEvent<IntentKey> pendingIntent = viewState.getPendingIntent();
        if (pendingIntent == null || (intentKeyConsume = pendingIntent.consume()) == null) {
            return;
        }
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, intentKeyConsume, null, false, null, null, 60, null);
        getResumeApplicationManager().seenResumeApplicationScreen();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        getGcmManager().onActivityResult(this, requestCode, resultCode, data);
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.lastPauseTime = SystemClock.elapsedRealtime();
        if (this.notificationHandler != null) {
            getNotificationHandler().removeInterceptor(this.notificationUnifiedChatInterceptor);
            getNotificationHandler().removeInterceptor(this.mobileLinkingInterceptor);
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable(SAVE_LAST_SEEN_TIMES, new SavedState(this.tabToLastSeenTime));
        int i = 0;
        for (BentoTabBarState.Tab tab : BentoTabBarState.Tab.getEntries()) {
            BaseTabFragment baseTabFragmentFindFragment = findFragment(tab);
            if (baseTabFragmentFindFragment != null) {
                int backStackEntryCount = baseTabFragmentFindFragment.getChildFragmentManager().getBackStackEntryCount() + 1;
                Timber.INSTANCE.mo3356i(tab + " back stack count: " + backStackEntryCount, new Object[0]);
                i += backStackEntryCount;
            }
        }
        if (i > 10) {
            Timber.INSTANCE.mo3356i("Back stack count exceeds threshold. Clear outState Bundle.", new Object[0]);
            outState.clear();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        BaseTabFragment baseTabFragmentFindActiveFragment = findActiveFragment();
        return baseTabFragmentFindActiveFragment != null && baseTabFragmentFindActiveFragment.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        BaseTabFragment baseTabFragmentFindActiveFragment = findActiveFragment();
        return baseTabFragmentFindActiveFragment != null && baseTabFragmentFindActiveFragment.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.checkNotNull(supportActionBar);
        supportActionBar.setHomeButtonEnabled(false);
        supportActionBar.setDisplayHomeAsUpEnabled(false);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    protected int getMenuItemTint() {
        BaseTabFragment baseTabFragmentFindActiveFragment = findActiveFragment();
        Fragment currentFragment = baseTabFragmentFindActiveFragment != null ? baseTabFragmentFindActiveFragment.getCurrentFragment() : null;
        BaseFragment baseFragment = currentFragment instanceof BaseFragment ? (BaseFragment) currentFragment : null;
        Integer menuIconTint = baseFragment != null ? baseFragment.getMenuIconTint() : null;
        if (menuIconTint != null) {
            return menuIconTint.intValue();
        }
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        Context context = rhToolbar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ThemeColors.getThemeColor(context, R.attr.textColorPrimaryNoDisable);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (handleBackPressed()) {
            return;
        }
        BaseTabFragment baseTabFragmentFindActiveFragment = findActiveFragment();
        Intrinsics.checkNotNull(baseTabFragmentFindActiveFragment, "null cannot be cast to non-null type com.robinhood.android.common.ui.BaseFragment");
        if (baseTabFragmentFindActiveFragment.onBackPressed()) {
            return;
        }
        MainTabBarViewState value = getDuxo().getStateFlow().getValue();
        if (!value.getTabStack().isEmpty()) {
            BentoTabBarState.Tab tabPop = value.getTabStack().pop();
            getDuxo().updateTabStack(value.getTabStack());
            MainTabBarDuxo duxo = getDuxo();
            Intrinsics.checkNotNull(tabPop);
            duxo.onTabSelected(tabPop, false);
            showTab(TabUtils.toTabLinkIntentKey(tabPop));
            return;
        }
        int selectedIndex = value.getTabBarState().getSelectedIndex();
        EnumEntries<BentoTabBarState.Tab> entries = BentoTabBarState.Tab.getEntries();
        BentoTabBarState.Tab tab = BentoTabBarState.Tab.PORTFOLIO;
        if (selectedIndex != entries.indexOf(tab)) {
            getDuxo().onTabSelected(tab, false);
            showTab(TabUtils.toTabLinkIntentKey(tab));
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public void onBackStackChanged() {
        onFragmentChanged();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    protected void handleCustomIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.handleCustomIntent(intent);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        WatchListIntentKey2 watchListIntentKey2 = (WatchListIntentKey2) extras.getSerializable(EXTRA_WATCHLIST_SCREEN);
        if (watchListIntentKey2 != null) {
            if (isLaunchingFromBackground()) {
                getDuxo().onTabSelected(watchListIntentKey2);
            }
            showWatchlistScreen(watchListIntentKey2);
        }
        TabLinkIntentKey tabLinkIntentKey = (TabLinkIntentKey) extras.getParcelable(EXTRA_TAB_LINK);
        if (tabLinkIntentKey != null) {
            if ((tabLinkIntentKey instanceof AccountSelectorTabIntentKey) && getAccountSelectorHomeManger().isAccountSelectorEnabled()) {
                if (!(TabUtils.toTabLinkIntentKey(BentoTabBarState.Tab.getEntries().get(getDuxo().getStateFlow().getValue().getTabBarState().getSelectedIndex())) instanceof TabLinkIntentKey.Home.Legacy)) {
                    selectTabLink(TabLinkIntentKey.Home.Legacy.INSTANCE);
                }
                RhBottomSheetDialogFragment.OnClickListener onClickListenerFindActiveFragment = findActiveFragment();
                AccountSelectorTabLinkIntentHandler accountSelectorTabLinkIntentHandler = onClickListenerFindActiveFragment instanceof AccountSelectorTabLinkIntentHandler ? (AccountSelectorTabLinkIntentHandler) onClickListenerFindActiveFragment : null;
                if (accountSelectorTabLinkIntentHandler != null) {
                    accountSelectorTabLinkIntentHandler.handleDeeplinkAccountTabSwitch(tabLinkIntentKey);
                }
            } else {
                selectTabLink(tabLinkIntentKey);
            }
        }
        HostIntentKey.ShowFragmentInTab showFragmentInTab = (HostIntentKey.ShowFragmentInTab) extras.getParcelable(EXTRA_SHOW_FRAGMENT_IN_TAB);
        if (showFragmentInTab != null) {
            if (isLaunchingFromBackground() && tabLinkIntentKey == null) {
                FragmentTab defaultTabOverride = showFragmentInTab.getDefaultTabOverride();
                if (defaultTabOverride == null) {
                    FragmentKey fragmentKey = showFragmentInTab.getFragmentKey();
                    TabFragmentKey tabFragmentKey = fragmentKey instanceof TabFragmentKey ? (TabFragmentKey) fragmentKey : null;
                    defaultTabOverride = tabFragmentKey != null ? tabFragmentKey.getDefaultTab() : null;
                    if (defaultTabOverride == null) {
                        defaultTabOverride = FragmentTab.SHOULD_NOT_BE_IN_TAB;
                    }
                }
                if (defaultTabOverride != FragmentTab.CURRENT_TAB) {
                    BentoTabBarState.Tab bentoTab = TabUtils.toBentoTab(defaultTabOverride);
                    if (bentoTab == null) {
                        throw new IllegalStateException(("Navigated fragment does not support tabs: " + showFragmentInTab.getFragmentKey().getClass()).toString());
                    }
                    MainTabBarDuxo.onTabSelected$default(getDuxo(), bentoTab, false, 2, null);
                    showTab(TabUtils.toTabLinkIntentKey(bentoTab));
                }
            }
            BaseTabFragment baseTabFragmentFindActiveFragment = findActiveFragment();
            Intrinsics.checkNotNull(baseTabFragmentFindActiveFragment);
            if (showFragmentInTab.getClearBackstack()) {
                baseTabFragmentFindActiveFragment.resetAndShowRootFragment();
            }
            baseTabFragmentFindActiveFragment.setFragmentData(showFragmentInTab, Intents2.getNavigationType(extras));
        }
        String string2 = extras.getString(EXTRA_BLOCKED_DEEPLINK_URL);
        if (string2 != null) {
            getBlockedDeeplinkPrompt().show(this, string2);
        }
        String string3 = extras.getString(EXTRA_MOBILE_LINKING_GROUP_ID);
        if (string3 != null) {
            String string4 = extras.getString(EXTRA_MOBILE_LINKING_ACCOUNT_NUMBER);
            if (string4 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            showMobileLinkingScreen(string4, string3, true);
        }
    }

    @Override // com.robinhood.android.common.tabs.TabManager
    public void replaceFragmentInActiveTab(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        BaseTabFragment baseTabFragmentFindActiveFragment = findActiveFragment();
        Intrinsics.checkNotNull(baseTabFragmentFindActiveFragment);
        baseTabFragmentFindActiveFragment.replaceFragment(fragment);
    }

    @Override // com.robinhood.android.common.tabs.TabManager
    public void onFragmentChanged(BaseTabFragment tabFragment) {
        Intrinsics.checkNotNullParameter(tabFragment, "tabFragment");
        if (Intrinsics.areEqual(tabFragment, findActiveFragment())) {
            onFragmentChanged();
        }
    }

    @Override // com.robinhood.android.common.tabs.TabManager
    public void reThemeToolbar() {
        onFragmentChanged();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.utils.p409ui.fragment.PrimaryFragmentHost
    public BaseTabFragment getCurrentFragment() {
        return findActiveFragment();
    }

    @Override // com.robinhood.shared.common.bottomtab.controller.BottomTabsController
    public void toggleBottomTabBarVisibility(boolean isVisible) {
        getComposeTabBarView().setVisibility(isVisible ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCurrentTabReselected() {
        BaseTabFragment baseTabFragmentFindActiveFragment = findActiveFragment();
        Intrinsics.checkNotNull(baseTabFragmentFindActiveFragment);
        if (baseTabFragmentFindActiveFragment.isStateSaved()) {
            return;
        }
        if (baseTabFragmentFindActiveFragment.getChildFragmentManager().getBackStackEntryCount() > 0) {
            BaseFragment.popEntireFragmentBackstack$default(baseTabFragmentFindActiveFragment, false, 1, null);
        } else {
            baseTabFragmentFindActiveFragment.scrollToTop();
        }
    }

    private final void onFragmentChanged() {
        BaseTabFragment baseTabFragmentFindActiveFragment = findActiveFragment();
        if (baseTabFragmentFindActiveFragment == null) {
            return;
        }
        updateActionBar(baseTabFragmentFindActiveFragment);
        updateChromeStyling(baseTabFragmentFindActiveFragment);
    }

    private final BaseTabFragment findActiveFragment() {
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(C29231R.id.tab_content_container);
        if (fragmentFindFragmentById instanceof BaseTabFragment) {
            return (BaseTabFragment) fragmentFindFragmentById;
        }
        return null;
    }

    private final BaseTabFragment findFragment(BentoTabBarState.Tab tab) {
        return (BaseTabFragment) getSupportFragmentManager().findFragmentByTag(tab.name());
    }

    private final void selectTabLink(TabLinkIntentKey tabLinkIntentKey) {
        MainTabBarDuxo.onTabSelected$default(getDuxo(), TabUtils.toBentoTab(tabLinkIntentKey), false, 2, null);
        showTab(tabLinkIntentKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTab(TabLinkIntentKey tabLinkIntentKey) {
        boolean z;
        if (isStateSaved()) {
            return;
        }
        BentoTabBarState.Tab bentoTab = TabUtils.toBentoTab(tabLinkIntentKey);
        boolean z2 = true;
        if (bentoTab == BentoTabBarState.Tab.NOTIFICATIONS) {
            getHasVisitedInboxTabPref().set(true);
        }
        BaseTabFragment baseTabFragmentFindFragment = findFragment(bentoTab);
        BaseTabFragment baseTabFragmentFindActiveFragment = findActiveFragment();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        if (baseTabFragmentFindFragment == null) {
            baseTabFragmentFindFragment = TabUtils.createFragment(bentoTab, getNavigator());
            z = true;
        } else {
            z = false;
        }
        if (baseTabFragmentFindActiveFragment != null && baseTabFragmentFindActiveFragment != baseTabFragmentFindFragment) {
            fragmentTransactionBeginTransaction.detach(baseTabFragmentFindActiveFragment);
            baseTabFragmentFindActiveFragment.getChildFragmentManager().removeOnBackStackChangedListener(this);
        }
        if (z) {
            fragmentTransactionBeginTransaction.add(C29231R.id.tab_content_container, baseTabFragmentFindFragment, bentoTab.name());
        } else {
            fragmentTransactionBeginTransaction.attach(baseTabFragmentFindFragment);
        }
        reconfigure(tabLinkIntentKey, baseTabFragmentFindFragment);
        baseTabFragmentFindFragment.setDoNotAnimate(true);
        fragmentTransactionBeginTransaction.commitNow();
        getAnalytics().setCurrentTab(bentoTab.getAnalyticsTabName());
        getEventLogger().setCurrentTab(bentoTab.getAnalyticsTabName());
        if (baseTabFragmentFindActiveFragment != null) {
            this.tabToLastSeenTime.put(getTab(baseTabFragmentFindActiveFragment), Long.valueOf(jElapsedRealtime));
            logTabLeaving(baseTabFragmentFindActiveFragment);
        }
        Long l = this.tabToLastSeenTime.get(bentoTab);
        boolean z3 = l != null && Duration.ofMillis(jElapsedRealtime - l.longValue()).compareTo(INACTIVE_DURATION_THRESHOLD) > 0;
        TabLinkIntentKey.Account account = tabLinkIntentKey instanceof TabLinkIntentKey.Account ? (TabLinkIntentKey.Account) tabLinkIntentKey : null;
        if (account == null || !account.getClearBackstack()) {
            TabLinkIntentKey.Browse browse = tabLinkIntentKey instanceof TabLinkIntentKey.Browse ? (TabLinkIntentKey.Browse) tabLinkIntentKey : null;
            if (browse == null || !browse.getClearBackstack()) {
                z2 = z3;
            }
        }
        if (z2) {
            baseTabFragmentFindFragment.resetAndShowRootFragment();
        }
        baseTabFragmentFindFragment.setDoNotAnimate(false);
        baseTabFragmentFindFragment.getChildFragmentManager().addOnBackStackChangedListener(this);
        onFragmentChanged();
        this.currentTabStartTime = jElapsedRealtime;
        InboxBadge latestBadgeResult = getInboxBadgeStore().getLatestBadgeResult();
        if (latestBadgeResult != null) {
            updateInboxTopNavBadge(latestBadgeResult.getResult(), latestBadgeResult.getShouldCriticalBadge());
        }
        getInboxBadgeStore().refreshBadgeResult();
    }

    private final void logTabLeaving(BaseTabFragment fragment) {
        AnalyticsLogger.DefaultImpls.logTabGroup$default(getAnalytics(), AnalyticsStrings.TAB_GROUP_NAV_TAB_BAR, getTab(fragment).getAnalyticsTabName(), Long.valueOf(SystemClock.elapsedRealtime() - this.currentTabStartTime), null, 8, null);
    }

    @Override // com.robinhood.android.libs.tabs.ChromeStyleController
    public void updateChromeStyling(BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        ScarletManager scarletManager = ScarletManager2.getScarletManager(rhToolbar);
        SparseArray<ResourceReferences4<StyleResource>> sparseArray = this.defaultToolbarOverlays;
        if (sparseArray == null) {
            Intrinsics.throwUninitializedPropertyAccessException("defaultToolbarOverlays");
            sparseArray = null;
        }
        scarletManager.loadOverlays(sparseArray);
        boolean z = fragment.getCurrentFragment() == null || fragment.getUseDesignSystemToolbarForCurrentFragment();
        RhToolbar rhToolbar2 = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar2);
        ScarletManager2.getScarletManager(rhToolbar2).setActivity(this);
        RhToolbar rhToolbar3 = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar3);
        rhToolbar3.setUseDesignSystemTheme(z);
        ActivityResultCaller currentFragment = fragment.getCurrentFragment();
        CreditCardTabStyle2 creditCardTabStyle2 = currentFragment instanceof CreditCardTabStyle2 ? (CreditCardTabStyle2) currentFragment : null;
        StateFlow<CreditCardTabStyle> creditCardTabStyle = creditCardTabStyle2 != null ? creditCardTabStyle2.getCreditCardTabStyle() : null;
        Job job = this.creditCardTabStateJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        if (creditCardTabStyle != null) {
            this.creditCardTabStateJob = getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C313032(creditCardTabStyle, this, null));
        } else {
            getDuxo().onCreditCardTabOverlayChanged(null);
        }
        getBottomNavigationDivider().setVisibility(fragment.getCurrentFragmentHasBottomBar() ? 8 : 0);
    }

    /* compiled from: MainTabActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabActivity$updateChromeStyling$2", m3645f = "MainTabActivity.kt", m3646l = {757}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.ui.MainTabActivity$updateChromeStyling$2 */
    static final class C313032 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StateFlow<CreditCardTabStyle> $creditCardTabStyle;
        int label;
        final /* synthetic */ MainTabActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C313032(StateFlow<? extends CreditCardTabStyle> stateFlow, MainTabActivity mainTabActivity, Continuation<? super C313032> continuation) {
            super(2, continuation);
            this.$creditCardTabStyle = stateFlow;
            this.this$0 = mainTabActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C313032(this.$creditCardTabStyle, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313032) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MainTabActivity.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "tabStyle", "Lcom/robinhood/android/lib/creditcard/CreditCardTabStyle;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabActivity$updateChromeStyling$2$1", m3645f = "MainTabActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.ui.MainTabActivity$updateChromeStyling$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CreditCardTabStyle, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MainTabActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MainTabActivity mainTabActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = mainTabActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CreditCardTabStyle creditCardTabStyle, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(creditCardTabStyle, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.getDuxo().onCreditCardTabOverlayChanged((CreditCardTabStyle) this.L$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<CreditCardTabStyle> stateFlow = this.$creditCardTabStyle;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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
    }

    private final void updateActionBar(BaseTabFragment activeFragment) {
        boolean z = activeFragment.getChildFragmentManager().getBackStackEntryCount() > 0;
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.checkNotNull(supportActionBar);
        supportActionBar.setHomeButtonEnabled(z);
        supportActionBar.setDisplayHomeAsUpEnabled(z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void showWatchlistScreen(WatchListIntentKey2 watchlistScreen) {
        FragmentKey searchFragmentKey;
        FragmentKey key;
        FragmentKey documentsFragmentKey;
        BaseTabFragment baseTabFragmentFindActiveFragment = findActiveFragment();
        Intrinsics.checkNotNull(baseTabFragmentFindActiveFragment);
        switch (WhenMappings.$EnumSwitchMapping$0[watchlistScreen.ordinal()]) {
            case 1:
                BaseFragment.popEntireFragmentBackstack$default(baseTabFragmentFindActiveFragment, false, 1, null);
                searchFragmentKey = null;
                if (searchFragmentKey != null) {
                    BaseTabFragment.setFragmentData$default(baseTabFragmentFindActiveFragment, new HostIntentKey.ShowFragmentInTab(searchFragmentKey, true, false, null, 12, null), null, 2, null);
                    return;
                }
                return;
            case 2:
                searchFragmentKey = new SearchFragmentKey(null, null, null, null, null, null, false, null, 255, null);
                if (searchFragmentKey != null) {
                }
                break;
            case 3:
                searchFragmentKey = new AccountsHistoryContract.Key(null, AccountsHistoryTransactionTypeFilter.ALL, null, null, false, null, 61, null);
                if (searchFragmentKey != null) {
                }
                break;
            case 4:
                searchFragmentKey = new AccountsHistoryContract.Key(null, AccountsHistoryTransactionTypeFilter.ORDERS, null, null, false, null, 61, null);
                if (searchFragmentKey != null) {
                }
                break;
            case 5:
                searchFragmentKey = new AccountsHistoryContract.Key(null, AccountsHistoryTransactionTypeFilter.OPTION_EVENTS, null, null, false, null, 61, null);
                if (searchFragmentKey != null) {
                }
                break;
            case 6:
                searchFragmentKey = new AccountsHistoryContract.Key(null, AccountsHistoryTransactionTypeFilter.DIVIDENDS, null, null, false, null, 61, null);
                if (searchFragmentKey != null) {
                }
                break;
            case 7:
                searchFragmentKey = new AccountsHistoryContract.Key(null, AccountsHistoryTransactionTypeFilter.ADR_FEES, null, null, false, null, 61, null);
                if (searchFragmentKey != null) {
                }
                break;
            case 8:
                searchFragmentKey = new AccountsHistoryContract.Key(null, AccountsHistoryTransactionTypeFilter.TRANSFERS, null, null, false, null, 61, null);
                if (searchFragmentKey != null) {
                }
                break;
            case 9:
                key = new AccountsHistoryContract.Key(null, AccountsHistoryTransactionTypeFilter.GIFTS, null, null, false, null, 61, null);
                searchFragmentKey = key;
                if (searchFragmentKey != null) {
                }
                break;
            case 10:
                documentsFragmentKey = TransfersHub.INSTANCE;
                searchFragmentKey = documentsFragmentKey;
                if (searchFragmentKey != null) {
                }
                break;
            case 11:
                documentsFragmentKey = new DocumentsFragmentKey(Document.Category.TAX);
                searchFragmentKey = documentsFragmentKey;
                if (searchFragmentKey != null) {
                }
                break;
            case 12:
                documentsFragmentKey = new RecurringDepositsListKey(null, null, 3, null);
                searchFragmentKey = documentsFragmentKey;
                if (searchFragmentKey != null) {
                }
                break;
            case 13:
                key = new SettingsPage(Constants6.HELP_PAGE_ID, null, null, 6, null);
                searchFragmentKey = key;
                if (searchFragmentKey != null) {
                }
                break;
            case 14:
                documentsFragmentKey = LicensesKey.INSTANCE;
                searchFragmentKey = documentsFragmentKey;
                if (searchFragmentKey != null) {
                }
                break;
            case 15:
                searchFragmentKey = null;
                if (searchFragmentKey != null) {
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMobileLinkingCollapsed(final String accountNumber) {
        getMobileLinkingCollapsedView().setContent(ComposableLambda3.composableLambdaInstance(-1079887213, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.ui.MainTabActivity.showMobileLinkingCollapsed.1
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
                    ComposerKt.traceEventStart(-1079887213, i, -1, "com.robinhood.android.ui.MainTabActivity.showMobileLinkingCollapsed.<anonymous> (MainTabActivity.kt:829)");
                }
                BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(MainTabActivity.this)), null, ComposableLambda3.rememberComposableLambda(-1163945019, true, new AnonymousClass1(MainTabActivity.this, accountNumber), composer, 54), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* compiled from: MainTabActivity.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.ui.MainTabActivity$showMobileLinkingCollapsed$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ String $accountNumber;
                final /* synthetic */ MainTabActivity this$0;

                AnonymousClass1(MainTabActivity mainTabActivity, String str) {
                    this.this$0 = mainTabActivity;
                    this.$accountNumber = str;
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
                        ComposerKt.traceEventStart(-1163945019, i, -1, "com.robinhood.android.ui.MainTabActivity.showMobileLinkingCollapsed.<anonymous>.<anonymous> (MainTabActivity.kt:832)");
                    }
                    if (this.this$0.getMobileLinkingCollapsedViewIsVisible()) {
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changed(this.$accountNumber);
                        final MainTabActivity mainTabActivity = this.this$0;
                        final String str = this.$accountNumber;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.ui.MainTabActivity$showMobileLinkingCollapsed$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MainTabActivity.C313021.AnonymousClass1.invoke$lambda$1$lambda$0(mainTabActivity, str);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final MainTabActivity mainTabActivity2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.ui.MainTabActivity$showMobileLinkingCollapsed$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MainTabActivity.C313021.AnonymousClass1.invoke$lambda$3$lambda$2(mainTabActivity2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        MobileLinkingCollapsedComposable3.MobileLinkingCollapsedComposable(function0, (Function0) objRememberedValue2, null, null, composer, 0, 12);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(MainTabActivity mainTabActivity, String str) {
                    mainTabActivity.hideMobileLinkingCollapsed();
                    mainTabActivity.showMobileLinkingScreen(str, null, false);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$3$lambda$2(MainTabActivity mainTabActivity) {
                    mainTabActivity.hideMobileLinkingCollapsed();
                    mainTabActivity.showMobileLinkingSnackbar();
                    return Unit.INSTANCE;
                }
            }
        }));
        setMobileLinkingCollapsedViewIsVisible(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideMobileLinkingCollapsed() {
        setMobileLinkingCollapsedViewIsVisible(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMobileLinkingSnackbar() {
        String string2 = getString(C20838R.string.mobile_linking_disconnected_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        showSnackbar(string2, -1);
    }

    static /* synthetic */ void showMobileLinkingScreen$default(MainTabActivity mainTabActivity, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        mainTabActivity.showMobileLinkingScreen(str, str2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMobileLinkingScreen(String accountNumber, String groupId, boolean playSound) {
        this.mobileLinkingLauncher.launch(new NavigationActivityResultContract.NavigationParams<>(new MobileLinkingHostIntentKey(accountNumber, groupId, playSound), null, false, 6, null));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    @Deprecated
    protected void popLastFragment() {
        super.popLastFragment();
    }

    @Override // com.robinhood.android.crypto.lib.CryptoDetailCallbacks
    public void showCryptoDetail(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        BaseTabFragment baseTabFragmentFindActiveFragment = findActiveFragment();
        if (baseTabFragmentFindActiveFragment != null) {
            baseTabFragmentFindActiveFragment.popLastFragment();
        }
        Navigator.DefaultImpls.showFragment$default(getNavigator(), this, new CryptoDetailFragmentKey(currencyPairId, null, false, null, null, null, 62, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.common.equitydetail.InstrumentDetailListParentCallbacks
    public void onInstrumentDetailListParentBackPressed(InstrumentType type2) {
        Survey survey;
        Intrinsics.checkNotNullParameter(type2, "type");
        BaseTabFragment baseTabFragmentFindActiveFragment = findActiveFragment();
        if (baseTabFragmentFindActiveFragment != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[type2.ordinal()];
            if (i == 1) {
                survey = Survey.DETAILS_STOCK_BACK;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                survey = Survey.DETAILS_STOCK_ETF_BACK;
            }
            getUserLeapManager().presentSurveyIfNecessary(baseTabFragmentFindActiveFragment, survey);
        }
    }

    private final void updateInboxTopNavBadge(boolean shouldBadge, boolean isCritical) {
        TopNavInboxButtonView topNavInboxButtonView;
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar == null || (topNavInboxButtonView = (TopNavInboxButtonView) rhToolbar.findViewWithTag(getString(TopNavInboxButtonView.INSTANCE.getTAG_STRING_RES()))) == null) {
            return;
        }
        topNavInboxButtonView.maybeShowBadge(shouldBadge, isCritical);
    }

    static /* synthetic */ void showSnackbar$default(MainTabActivity mainTabActivity, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        mainTabActivity.showSnackbar(str, i);
    }

    private final void showSnackbar(String message, int duration) {
        Snackbar snackbarMake = Snackbar.make(getSnackbarContainer(), message, duration);
        Intrinsics.checkNotNullExpressionValue(snackbarMake, "make(...)");
        snackbarMake.setAnchorView(getSnackbarContainer());
        snackbarMake.setGestureInsetBottomIgnored(true);
        snackbarMake.show();
    }

    private final boolean isLaunchingFromBackground() {
        return SystemClock.elapsedRealtime() - this.lastPauseTime > 1000;
    }

    private final BentoTabBarState.Tab getTab(BaseTabFragment baseTabFragment) {
        String tag = baseTabFragment.getTag();
        Intrinsics.checkNotNull(tag);
        return BentoTabBarState.Tab.valueOf(tag);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void reconfigure(TabLinkIntentKey tabLinkIntentKey, BaseTabFragment baseTabFragment) {
        if (tabLinkIntentKey instanceof TabLinkIntentKey.Home.Dashboard) {
            Intrinsics.checkNotNull(baseTabFragment, "null cannot be cast to non-null type com.robinhood.android.ui.HomeTabFragment");
            ((HomeTabFragment) baseTabFragment).setDashboard(((TabLinkIntentKey.Home.Dashboard) tabLinkIntentKey).getDashboardType());
            return;
        }
        if (tabLinkIntentKey instanceof TabLinkIntentKey.McDuckling) {
            Intrinsics.checkNotNull(baseTabFragment, "null cannot be cast to non-null type com.robinhood.McDucklingTabFragmentDeepLinkProps");
            McDucklingTabFragmentDeepLinkProps mcDucklingTabFragmentDeepLinkProps = (McDucklingTabFragmentDeepLinkProps) baseTabFragment;
            TabLinkIntentKey.McDuckling mcDuckling = (TabLinkIntentKey.McDuckling) tabLinkIntentKey;
            String source = mcDuckling.getSource();
            if (source == null) {
                source = McDucklingWaitlistSource.SOURCE_CASH_MANAGEMENT_TAB;
            }
            mcDucklingTabFragmentDeepLinkProps.setSource(source);
            if (mcDuckling.getShowCardActions()) {
                mcDucklingTabFragmentDeepLinkProps.getShowCardActionsFromLink().onNext(Unit.INSTANCE);
            }
            String scrollTo = mcDuckling.getScrollTo();
            if (scrollTo != null) {
                mcDucklingTabFragmentDeepLinkProps.getScrollToFromLink().onNext(scrollTo);
                return;
            }
            return;
        }
        if (tabLinkIntentKey instanceof TabLinkIntentKey.Search) {
            SearchHighlightInteractable searchHighlightInteractable = baseTabFragment instanceof SearchHighlightInteractable ? (SearchHighlightInteractable) baseTabFragment : null;
            if (searchHighlightInteractable != null) {
                searchHighlightInteractable.processDeeplink((TabLinkIntentKey.Search) tabLinkIntentKey);
                return;
            }
            return;
        }
        if (tabLinkIntentKey instanceof TabLinkIntentKey.Retirement) {
            Intrinsics.checkNotNull(baseTabFragment, "null cannot be cast to non-null type com.robinhood.android.retirement.RetirementTabFragmentDeepLinkProps");
            RetirementTabFragmentDeepLinkProps retirementTabFragmentDeepLinkProps = (RetirementTabFragmentDeepLinkProps) baseTabFragment;
            TabLinkIntentKey.Retirement retirement = (TabLinkIntentKey.Retirement) tabLinkIntentKey;
            String accountNumber = retirement.getAccountNumber();
            if (accountNumber != null) {
                retirementTabFragmentDeepLinkProps.setAccountNumber(accountNumber);
            }
            retirementTabFragmentDeepLinkProps.setEntryPoint(retirement.getEntryPoint());
            retirementTabFragmentDeepLinkProps.setFirstSwipey(retirement.getFirstSwipey());
        }
    }

    /* compiled from: MainTabActivity.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/ui/MainTabActivity$SavedState;", "Landroid/os/Parcelable;", "tabToLastSeenTime", "", "Lcom/robinhood/compose/bento/component/BentoTabBarState$Tab;", "", "<init>", "(Ljava/util/Map;)V", "getTabToLastSeenTime", "()Ljava/util/Map;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final Map<BentoTabBarState.Tab, Long> tabToLastSeenTime;

        /* compiled from: MainTabActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(BentoTabBarState.Tab.valueOf(parcel.readString()), Long.valueOf(parcel.readLong()));
                }
                return new SavedState(linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Map<BentoTabBarState.Tab, Long> map = this.tabToLastSeenTime;
            dest.writeInt(map.size());
            for (Map.Entry<BentoTabBarState.Tab, Long> entry : map.entrySet()) {
                dest.writeString(entry.getKey().name());
                dest.writeLong(entry.getValue().longValue());
            }
        }

        public SavedState(Map<BentoTabBarState.Tab, Long> tabToLastSeenTime) {
            Intrinsics.checkNotNullParameter(tabToLastSeenTime, "tabToLastSeenTime");
            this.tabToLastSeenTime = tabToLastSeenTime;
        }

        public final Map<BentoTabBarState.Tab, Long> getTabToLastSeenTime() {
            return this.tabToLastSeenTime;
        }
    }

    /* compiled from: MainTabActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/ui/MainTabActivity$WatchListIntentResolver;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/home/contracts/WatchListIntentKey;", "<init>", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class WatchListIntentResolver implements IntentResolver<WatchListIntentKey> {
        public static final int $stable = 0;
        public static final WatchListIntentResolver INSTANCE = new WatchListIntentResolver();

        private WatchListIntentResolver() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, WatchListIntentKey key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) MainTabActivity.class);
            intent.putExtra(MainTabActivity.EXTRA_WATCHLIST_SCREEN, key.getWatchListScreen());
            return intent;
        }
    }

    /* compiled from: MainTabActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/ui/MainTabActivity$DefaultIntentResolver;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/home/contracts/MainActivityIntentKey;", "<init>", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultIntentResolver implements IntentResolver<MainActivityIntentKey> {
        public static final int $stable = 0;
        public static final DefaultIntentResolver INSTANCE = new DefaultIntentResolver();

        private DefaultIntentResolver() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, MainActivityIntentKey key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            return Companion.getStartIntent$default(MainTabActivity.INSTANCE, context, null, 2, null);
        }
    }

    /* compiled from: MainTabActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/ui/MainTabActivity$TabIntentResolver;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;", "<init>", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TabIntentResolver implements IntentResolver<TabLinkIntentKey> {
        public static final int $stable = 0;
        public static final TabIntentResolver INSTANCE = new TabIntentResolver();

        private TabIntentResolver() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, TabLinkIntentKey key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) MainTabActivity.class);
            intent.putExtra(MainTabActivity.EXTRA_TAB_LINK, key);
            return intent;
        }
    }

    /* compiled from: MainTabActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/ui/MainTabActivity$BlockedExternalDeeplinkIntentResolver;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/shared/home/contracts/BlockedExternalDeeplinkIntentKey;", "<init>", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class BlockedExternalDeeplinkIntentResolver implements IntentResolver<BlockedExternalDeeplinkIntentKey> {
        public static final int $stable = 0;
        public static final BlockedExternalDeeplinkIntentResolver INSTANCE = new BlockedExternalDeeplinkIntentResolver();

        private BlockedExternalDeeplinkIntentResolver() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, BlockedExternalDeeplinkIntentKey key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) MainTabActivity.class);
            intent.putExtra(MainTabActivity.EXTRA_BLOCKED_DEEPLINK_URL, key.getUrl());
            return intent;
        }
    }

    /* compiled from: MainTabActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/ui/MainTabActivity$MobileLinkingIntentResolver;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/blackwidow/contracts/MobileLinkingIntentKey;", "<init>", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MobileLinkingIntentResolver implements IntentResolver<MobileLinkingIntentKey> {
        public static final int $stable = 0;
        public static final MobileLinkingIntentResolver INSTANCE = new MobileLinkingIntentResolver();

        private MobileLinkingIntentResolver() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, MobileLinkingIntentKey key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) MainTabActivity.class);
            intent.putExtra(MainTabActivity.EXTRA_MOBILE_LINKING_ACCOUNT_NUMBER, key.getAccountNumber());
            intent.putExtra(MainTabActivity.EXTRA_MOBILE_LINKING_GROUP_ID, key.getGroupId());
            return intent;
        }
    }

    /* compiled from: MainTabActivity.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/ui/MainTabActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInTab;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/robinhood/android/home/contracts/WatchlistScreen;", MainTabActivity.EXTRA_WATCHLIST_SCREEN, "Landroid/content/Intent;", "getStartIntent", "(Landroid/content/Context;Lcom/robinhood/android/home/contracts/WatchlistScreen;)Landroid/content/Intent;", "key", "getIntent", "(Landroid/content/Context;Lcom/robinhood/android/navigation/keys/HostIntentKey$ShowFragmentInTab;)Landroid/content/Intent;", "", "MAX_BACKSTACK_COUNT", "I", "", "EXTRA_SHOW_FRAGMENT_IN_TAB", "Ljava/lang/String;", "EXTRA_TAB_LINK", "EXTRA_WATCHLIST_SCREEN", "EXTRA_BLOCKED_DEEPLINK_URL", "EXTRA_MOBILE_LINKING_GROUP_ID", "EXTRA_MOBILE_LINKING_ACCOUNT_NUMBER", "SAVE_LAST_SEEN_TIMES", "j$/time/Duration", "INACTIVE_DURATION_THRESHOLD", "Lj$/time/Duration;", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<HostIntentKey.ShowFragmentInTab> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        public final Intent getStartIntent(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getStartIntent$default(this, context, null, 2, null);
        }

        private Companion() {
        }

        public static /* synthetic */ Intent getStartIntent$default(Companion companion, Context context, WatchListIntentKey2 watchListIntentKey2, int i, Object obj) {
            if ((i & 2) != 0) {
                watchListIntentKey2 = null;
            }
            return companion.getStartIntent(context, watchListIntentKey2);
        }

        @JvmStatic
        @JvmOverloads
        public final Intent getStartIntent(Context context, WatchListIntentKey2 watchlistScreen) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) MainTabActivity.class);
            intent.putExtra(MainTabActivity.EXTRA_WATCHLIST_SCREEN, watchlistScreen);
            return intent;
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, HostIntentKey.ShowFragmentInTab key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) MainTabActivity.class);
            intent.putExtra(MainTabActivity.EXTRA_SHOW_FRAGMENT_IN_TAB, key);
            return intent;
        }
    }
}
