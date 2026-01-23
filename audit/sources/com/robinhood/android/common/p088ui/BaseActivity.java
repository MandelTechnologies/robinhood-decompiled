package com.robinhood.android.common.p088ui;

import android.R;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.MenuItemCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycle;
import androidx.view.EdgeToEdge;
import androidx.view.SystemBarStyle;
import androidx.view.result.ActivityResultCaller;
import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.banner.MainBannerAppearance;
import com.robinhood.android.common.banner.MainBannerView;
import com.robinhood.android.common.notification.NotificationManager;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.banner.BannerAppearanceHelper;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.p088ui.style.TaskDescriptionColorTransition;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.AppContainer;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.common.util.TypefaceUtils;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.util.p090rx.view.VisibilityObservable2;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.designsystem.prefs.Theme;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.C22231R;
import com.robinhood.android.navigation.DeepLink;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.Intents2;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.plt.contract.PltManager;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.NotificationContext;
import com.robinhood.rosetta.eventlogging.URLComponents;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.i18n.dynamic.translations.DynamicTranslationsAppDelegateTransformer;
import com.robinhood.shared.i18n.locale.LocaleConfiguration;
import com.robinhood.shared.i18n.locale.LocaleContextWrapper;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.user.contracts.WelcomeIntentKey;
import com.robinhood.store.base.MarketHoursManager;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.Preconditions4;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.extensions.Contexts8;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost;
import com.robinhood.utils.p409ui.edge2edge.RelativePadding;
import com.robinhood.utils.p409ui.edge2edge.WindowInsetsListener;
import com.robinhood.utils.p409ui.edge2edge.WindowInsetsListener2;
import com.robinhood.utils.p409ui.fragment.PrimaryFragmentHost;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.github.inflationx.viewpump.ViewPump;
import io.github.inflationx.viewpump.ViewPumpContextWrapper;
import io.reactivex.Observable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import timber.log.Timber;

/* compiled from: BaseActivity.kt */
@Metadata(m3635d1 = {"\u0000Ò\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0017\u0018\u0000 £\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0006¡\u0002¢\u0002£\u0002B\u0011\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bJ,\u0010\u0084\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0005\u0012\u0003H\u0086\u00010\u0085\u0001\"\n\b\u0000\u0010\u0086\u0001*\u00030\u0087\u00012\u0007\u0010\u0088\u0001\u001a\u00020\bH\u0004J\u0014\u0010\u0093\u0001\u001a\u00030\u0094\u00012\b\u0010\u0095\u0001\u001a\u00030\u0096\u0001H\u0014J+\u0010\u0097\u0001\u001a\u00030\u0094\u00012\r\u0010\u0098\u0001\u001a\b0\u0099\u0001R\u00030\u009a\u00012\u0007\u0010\u009b\u0001\u001a\u00020\b2\u0007\u0010\u009c\u0001\u001a\u00020%H\u0014J\u000f\u0010\u009d\u0001\u001a\b0\u0099\u0001R\u00030\u009a\u0001H\u0016J\u0015\u0010\u009e\u0001\u001a\u00030\u0094\u00012\t\b\u0001\u0010\u009f\u0001\u001a\u00020\bH\u0016J\u0015\u0010 \u0001\u001a\u00030\u0094\u00012\t\b\u0001\u0010\u009f\u0001\u001a\u00020\bH\u0007J\u0016\u0010\u009e\u0001\u001a\u00030\u0094\u00012\n\u0010¡\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0017J\"\u0010\u009e\u0001\u001a\u00030\u0094\u00012\n\u0010¡\u0001\u001a\u0005\u0018\u00010\u0087\u00012\n\u0010¢\u0001\u001a\u0005\u0018\u00010£\u0001H\u0017J\u0016\u0010¤\u0001\u001a\u00030\u0094\u00012\n\u0010¥\u0001\u001a\u0005\u0018\u00010¦\u0001H\u0014J\u0013\u0010§\u0001\u001a\u00030\u0094\u00012\u0007\u0010¨\u0001\u001a\u00020sH\u0014J\n\u0010©\u0001\u001a\u00030\u0094\u0001H\u0014J\n\u0010ª\u0001\u001a\u00030\u0094\u0001H\u0014J\u0014\u0010«\u0001\u001a\u00030\u0094\u00012\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J(\u0010¬\u0001\u001a\u00030\u0094\u00012\t\b\u0002\u0010\u00ad\u0001\u001a\u00020%2\u000b\b\u0002\u0010®\u0001\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0003\u0010¯\u0001J\u0013\u0010°\u0001\u001a\u00030\u0094\u00012\t\b\u0001\u0010±\u0001\u001a\u00020\bJ\u0013\u0010²\u0001\u001a\u00030\u0094\u00012\u0007\u0010¨\u0001\u001a\u00020sH\u0015J\u000f\u0010³\u0001\u001a\u00020%2\u0006\u0010v\u001a\u00020wJ\u0011\u0010´\u0001\u001a\u00020%2\u0006\u0010v\u001a\u00020wH\u0014J\u0011\u0010µ\u0001\u001a\u00020%2\u0006\u0010v\u001a\u00020wH\u0016J\u0013\u0010¶\u0001\u001a\u00020%2\b\u0010·\u0001\u001a\u00030¸\u0001H\u0016J\u0013\u0010¹\u0001\u001a\u00030\u0094\u00012\u0007\u0010º\u0001\u001a\u00020zH\u0007J\u0013\u0010»\u0001\u001a\u00030\u0094\u00012\u0007\u0010º\u0001\u001a\u00020zH\u0007J\n\u0010¼\u0001\u001a\u00030\u0094\u0001H\u0016J\u0016\u0010½\u0001\u001a\u0005\u0018\u00010¾\u00012\b\u0010¿\u0001\u001a\u00030À\u0001H\u0016J\u0014\u0010Á\u0001\u001a\u00030\u0094\u00012\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010Â\u0001\u001a\u00030\u0094\u0001H\u0016J\n\u0010Ã\u0001\u001a\u00030\u0094\u0001H\u0016J\u0013\u0010Ä\u0001\u001a\u00030\u0094\u00012\u0007\u0010Å\u0001\u001a\u00020\rH\u0016J\b\u0010Æ\u0001\u001a\u00030\u0094\u0001J\u0011\u0010Ç\u0001\u001a\u00030\u0094\u00012\u0007\u0010È\u0001\u001a\u00020%J\t\u0010É\u0001\u001a\u00020%H\u0016J\t\u0010Ê\u0001\u001a\u00020%H\u0016J\n\u0010Ë\u0001\u001a\u00030\u0094\u0001H\u0004J\u0013\u0010Ì\u0001\u001a\u00030\u0094\u00012\u0007\u0010p\u001a\u00030À\u0001H\u0004J\u001f\u0010Í\u0001\u001a\u00030\u0094\u00012\t\b\u0001\u0010Î\u0001\u001a\u00020\b2\b\u0010Ï\u0001\u001a\u00030Ð\u0001H\u0004J\u0013\u0010Ñ\u0001\u001a\u00020\b2\b\u0010Ï\u0001\u001a\u00030Ð\u0001H\u0004J\u0012\u0010Ò\u0001\u001a\u00030\u0094\u00012\b\u0010Ï\u0001\u001a\u00030Ð\u0001J\u0011\u0010Ó\u0001\u001a\u00020\b2\b\u0010Ï\u0001\u001a\u00030Ð\u0001J\u0012\u0010Ô\u0001\u001a\u00030\u0094\u00012\b\u0010Ï\u0001\u001a\u00030Ð\u0001J\u0013\u0010Õ\u0001\u001a\u00030\u0094\u00012\u0007\u0010Ö\u0001\u001a\u00020\bH\u0004J\n\u0010×\u0001\u001a\u00030\u0094\u0001H\u0014J\n\u0010Ø\u0001\u001a\u00030\u0094\u0001H\u0004J\f\u0010Ù\u0001\u001a\u0005\u0018\u00010Ð\u0001H\u0016J\u0013\u0010Ù\u0001\u001a\u0005\u0018\u00010Ð\u00012\u0007\u0010Î\u0001\u001a\u00020\bJ\n\u0010Ú\u0001\u001a\u00030Û\u0001H\u0017J\t\u0010Ü\u0001\u001a\u00020%H\u0004J\u001e\u0010Ý\u0001\u001a\u00020%2\u0007\u0010\u0088\u0001\u001a\u00020\b2\n\u0010Þ\u0001\u001a\u0005\u0018\u00010¦\u0001H\u0016J\u001e\u0010ß\u0001\u001a\u00020%2\u0007\u0010\u0088\u0001\u001a\u00020\b2\n\u0010Þ\u0001\u001a\u0005\u0018\u00010¦\u0001H\u0016J(\u0010à\u0001\u001a\u00020%2\u0007\u0010\u0088\u0001\u001a\u00020\b2\n\u0010Þ\u0001\u001a\u0005\u0018\u00010¦\u00012\b\u0010á\u0001\u001a\u00030À\u0001H\u0016J\u001e\u0010â\u0001\u001a\u00020%2\u0007\u0010ã\u0001\u001a\u00020\b2\n\u0010Þ\u0001\u001a\u0005\u0018\u00010¦\u0001H\u0016J\u001e\u0010ä\u0001\u001a\u00020%2\u0007\u0010ã\u0001\u001a\u00020\b2\n\u0010Þ\u0001\u001a\u0005\u0018\u00010¦\u0001H\u0016J\u001e\u0010å\u0001\u001a\u00020%2\u0007\u0010ã\u0001\u001a\u00020\b2\n\u0010Þ\u0001\u001a\u0005\u0018\u00010¦\u0001H\u0016J\n\u0010æ\u0001\u001a\u00030\u0094\u0001H\u0014J\n\u0010ç\u0001\u001a\u00030\u0094\u0001H\u0016J\n\u0010ë\u0001\u001a\u00030À\u0001H\u0016J\u0014\u0010ì\u0001\u001a\u00030\u0094\u00012\b\u0010í\u0001\u001a\u00030À\u0001H\u0004J\u0013\u0010î\u0001\u001a\u00030\u0094\u00012\u0007\u0010¨\u0001\u001a\u00020sH\u0002J\u001f\u0010ï\u0001\u001a\u00030\u0094\u00012\n\u0010ð\u0001\u001a\u0005\u0018\u00010ñ\u00012\u0007\u0010ò\u0001\u001a\u00020uH\u0002J\u0013\u0010ó\u0001\u001a\u00030\u0094\u00012\u0007\u0010ô\u0001\u001a\u00020\bH\u0016J\b\u0010õ\u0001\u001a\u00030\u0094\u0001J\t\u0010ö\u0001\u001a\u00020\bH\u0015J\u000e\u0010÷\u0001\u001a\u00030\u0094\u0001*\u00020wH\u0002J\n\u0010ø\u0001\u001a\u0005\u0018\u00010À\u0001J/\u0010ù\u0001\u001a\u00030\u0094\u00012\u0007\u0010ú\u0001\u001a\u00020\b2\u0016\u0010û\u0001\u001a\f\u0012\u0007\b\u0001\u0012\u00030À\u00010ü\u0001\"\u00030À\u0001¢\u0006\u0003\u0010ý\u0001J\u001d\u0010þ\u0001\u001a\u00020%2\b\u0010ÿ\u0001\u001a\u00030\u0080\u00022\b\u0010\u0081\u0002\u001a\u00030\u0082\u0002H\u0016J\n\u0010\u008a\u0002\u001a\u00030\u0086\u0002H\u0016JL\u0010\u008b\u0002\u001a\u00030\u008c\u00022\n\b\u0002\u0010\u008d\u0002\u001a\u00030\u008e\u00022.\u0010\u008f\u0002\u001a)\b\u0001\u0012\u0005\u0012\u00030\u0091\u0002\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0094\u00010\u0092\u0002\u0012\u0007\u0012\u0005\u0018\u00010¾\u00010\u0090\u0002¢\u0006\u0003\b\u0093\u0002H\u0004¢\u0006\u0003\u0010\u0094\u0002J\n\u0010\u0095\u0002\u001a\u00030\u0094\u0001H\u0016J\u0013\u0010\u0095\u0002\u001a\u00030\u0094\u00012\u0007\u0010\u0096\u0002\u001a\u00020%H\u0016J\u0013\u0010\u0097\u0002\u001a\u00030\u0094\u00012\u0007\u0010\u0098\u0002\u001a\u00020%H\u0016J\u0013\u0010\u0099\u0002\u001a\u00030\u0094\u00012\u0007\u0010\u0098\u0002\u001a\u00020%H\u0016J\u0013\u0010\u009a\u0002\u001a\u00030\u0094\u00012\u0007\u0010\u0098\u0002\u001a\u00020%H\u0016J\n\u0010\u009b\u0002\u001a\u00030\u0094\u0001H\u0016J\n\u0010\u009c\u0002\u001a\u00030\u0094\u0001H\u0016J\n\u0010\u009d\u0002\u001a\u00030\u0094\u0001H\u0016J\u0013\u0010\u009e\u0002\u001a\u00030\u0094\u00012\u0007\u0010\u0098\u0002\u001a\u00020%H\u0002J\u0013\u0010\u009f\u0002\u001a\u00030\u0094\u00012\u0007\u0010\u0098\u0002\u001a\u00020%H\u0002J\u0013\u0010 \u0002\u001a\u00030\u0094\u00012\u0007\u0010\u0096\u0002\u001a\u00020%H\u0002R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001e\u0010(\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00102\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010>\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0014\u0010@\u001a\u00020A8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001f\u0010H\u001a\r\u0012\t\u0012\u00070J¢\u0006\u0002\bK0I8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010PR\u0014\u0010Q\u001a\u00020R8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020V8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0011\u0010Y\u001a\u00020Z8F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020_0^8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020d0c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0011\u0010g\u001a\u00020h8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0012\u0010k\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0004\n\u0002\u0010lR\u0012\u0010m\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0004\n\u0002\u0010lR\u000e\u0010n\u001a\u00020oX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020qX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010r\u001a\u0004\u0018\u00010sX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010t\u001a\u0004\u0018\u00010uX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010v\u001a\u0004\u0018\u00010wX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010x\u001a\b\u0012\u0004\u0012\u00020z0yX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00000|X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010}\u001a\b\u0012\u0004\u0012\u00020~0\u00158F¢\u0006\u0006\u001a\u0004\b\u007f\u0010\u0017R'\u0010\u0080\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0005\u0012\u00030\u0082\u0001\u0012\u0004\u0012\u00020%0\u0081\u00010\u00158F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u0017R\u0016\u0010\u0089\u0001\u001a\u00020%X\u0094D¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010'R\u0016\u0010\u008b\u0001\u001a\u00020%X\u0096D¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010'R*\u0010\u008d\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0005\u0012\u00030\u0082\u0001\u0012\u0004\u0012\u00020%0\u0081\u00010\u00158BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010\u0017R\u001b\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u0090\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010è\u0001\u001a\u00030À\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\bé\u0001\u0010ê\u0001R\u0010\u0010\u0083\u0002\u001a\u00030\u0084\u0002X\u0082.¢\u0006\u0002\n\u0000R \u0010\u0085\u0002\u001a\u00030\u0086\u00028BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0089\u0002\u0010\u001d\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002¨\u0006¤\u0002"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RxActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$OnClickListener;", "Lcom/robinhood/android/common/util/UiCallbacks$ScreenViewAnalyticable;", "Lcom/robinhood/utils/ui/fragment/PrimaryFragmentHost;", "Lcom/robinhood/utils/ui/edge2edge/EdgeToEdgeHost;", "contentLayoutId", "", "<init>", "(I)V", "()V", "rhToolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "getRhToolbar", "()Lcom/robinhood/android/common/ui/view/RhToolbar;", "setRhToolbar", "(Lcom/robinhood/android/common/ui/view/RhToolbar;)V", "toolbarHeightRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "toolbarHeightObs", "Lio/reactivex/Observable;", "getToolbarHeightObs", "()Lio/reactivex/Observable;", "appIcon", "Landroid/graphics/Bitmap;", "getAppIcon", "()Landroid/graphics/Bitmap;", "appIcon$delegate", "Lkotlin/Lazy;", "activityErrorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "getActivityErrorHandler", "()Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "activityErrorHandler$delegate", "ignoreNavigationType", "", "getIgnoreNavigationType", "()Z", "singletons", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "getSingletons", "()Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "setSingletons", "(Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "appContainer", "Lcom/robinhood/android/common/util/AppContainer;", "getAppContainer", "()Lcom/robinhood/android/common/util/AppContainer;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "authManagerDoNotUse", "getAuthManagerDoNotUse", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "getColorSchemeManager", "()Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "eventLoggerInternal", "Lcom/robinhood/analytics/EventLogger;", "getEventLoggerInternal", "()Lcom/robinhood/analytics/EventLogger;", "fragmentLifecycleCallbacks", "", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "Lkotlin/jvm/JvmSuppressWildcards;", "getFragmentLifecycleCallbacks", "()Ljava/util/Set;", "isNewDevicePref", "Lcom/robinhood/prefs/BooleanPreference;", "()Lcom/robinhood/prefs/BooleanPreference;", "lastDeepLinkNoncePref", "Lcom/robinhood/prefs/StringPreference;", "getLastDeepLinkNoncePref", "()Lcom/robinhood/prefs/StringPreference;", "marketHoursManager", "Lcom/robinhood/store/base/MarketHoursManager;", "getMarketHoursManager", "()Lcom/robinhood/store/base/MarketHoursManager;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "getNightModeManager", "()Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "rhProcessLifecycleOwner", "Ldagger/Lazy;", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "getRhProcessLifecycleOwner", "()Ldagger/Lazy;", "themePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/prefs/Theme;", "getThemePref", "()Lcom/robinhood/prefs/EnumPreference;", "pltManager", "Lcom/robinhood/android/plt/contract/PltManager;", "getPltManager", "()Lcom/robinhood/android/plt/contract/PltManager;", "isStatusBarStyleLightOverride", "Ljava/lang/Boolean;", "isNavigationBarStyleLightOverride", "dayNightMode", "Lcom/robinhood/android/common/ui/daynight/DayNightMode;", "transitionReason", "Lcom/robinhood/android/common/util/TransitionReason;", "pendingIntent", "Landroid/content/Intent;", "pendingIntentDeeplinkOrigin", "Lcom/robinhood/android/navigation/DeepLinkOrigin;", "menu", "Landroid/view/Menu;", "onBackPressedListeners", "Ljava/util/LinkedList;", "Lcom/robinhood/android/common/ui/BaseActivity$OnBackPressedListener;", "bindViewDelegate", "Lcom/robinhood/android/common/ui/BindViewDelegate;", "dayNightStyleChanges", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getDayNightStyleChanges", "colorSchemeChanges", "Lkotlin/Pair;", "Lcom/robinhood/android/designsystem/style/ColorScheme;", "getColorSchemeChanges", "bindView", "Lkotlin/properties/ReadOnlyProperty;", "V", "Landroid/view/View;", "id", "allowLandscapeMode", "getAllowLandscapeMode", "allowMainBanner", "getAllowMainBanner", "currentColorScheme", "getCurrentColorScheme", "bannerVisibleFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getBannerVisibleFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "onApplyThemeResource", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "resId", "first", "getTheme", "setContentView", "layoutResID", "setContentViewFromAppContainer", "view", "params", "Landroid/view/ViewGroup$LayoutParams;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "onStart", "onResume", "initMainBanner", "updateDayNightStyle", "applyIfUnchanged", "overrideAnimated", "(ZLjava/lang/Boolean;)V", "updateTaskDescription", ResourceTypes.COLOR, "handleCustomIntent", "onCreateOptionsMenu", "createOptionsMenu", "onPrepareOptionsMenu", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "addOnBackPressedListener", "listener", "removeOnBackPressedListener", "onBackPressed", "getSystemService", "", "name", "", "setupActionBar", "showCloseIcon", "showBackArrowIcon", "configureToolbar", "toolbar", "hideToolbar", "showProgressBar", "show", "requiresAuthentication", "shouldPromptForLockscreen", "setCurrentFragmentTransitionSuccess", "setCurrentFragmentTransitionReason", "setFragment", "containerId", "fragment", "Landroidx/fragment/app/Fragment;", "replaceFragment", "replaceFragmentWithoutAnimation", "replaceFragmentWithoutBackStack", "replaceFragmentWithoutAnimationAndBackStack", "popFragments", "numberToPop", "popLastFragment", "popEntireFragmentBackstack", "getCurrentFragment", "getFragmentManager", "Landroid/app/FragmentManager;", "isStateSaved", "onPositiveButtonClicked", "passthroughArgs", "onNegativeButtonClicked", "onLinkTextClicked", "url", "onPrimaryButtonClicked", "dialogId", "onSecondaryButtonClicked", "onLearnMoreActionClicked", "finishThisActivity", "finish", "screenName", "getScreenName", "()Ljava/lang/String;", "getAndResetTransitionReason", "setTransitionReason", "reason", "logAnalyticsIfDeeplink", "logDeeplinkAnalytics", WebsocketGatewayConstants.DATA_KEY, "Landroid/net/Uri;", DeepLink.INTENT_ARG_DEEP_LINK_ORIGIN, "setRequestedOrientation", "requestedOrientation", "invalidateMenuItemTint", "getMenuItemTint", "tintMenuItemIcons", "getDeeplinkNotificationType", "requestPermissionsCompat", "requestCode", "permissions", "", "(I[Ljava/lang/String;)V", "handleUiUncaughtException", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "dynamicTranslationsAppDelegateTransformer", "Lcom/robinhood/shared/i18n/dynamic/translations/DynamicTranslationsAppDelegateTransformer;", "appCompatDelegate", "Landroidx/appcompat/app/AppCompatDelegate;", "getAppCompatDelegate", "()Landroidx/appcompat/app/AppCompatDelegate;", "appCompatDelegate$delegate", "getDelegate", "collectDuxoState", "Lkotlinx/coroutines/Job;", "state", "Landroidx/lifecycle/Lifecycle$State;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "initEdgeToEdge", "isSystemBarStyleLight", "overrideSystemBarsStyle", "isLight", "overrideStatusBarStyle", "overrideNavigationBarStyle", "resetStatusBarStyleOverride", "resetNavigationBarStyleOverride", "resetSystemBarsStyleOverride", "setStatusBarStyle", "setNavigationBarStyle", "enableEdgeToEdge", "BaseActivityEntryPoint", "OnBackPressedListener", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public class BaseActivity extends RxActivity implements RhDialogFragment.OnClickListener, RhBottomSheetDialogFragment.OnClickListener, UiCallbacks.ScreenViewAnalyticable, PrimaryFragmentHost, EdgeToEdgeHost {
    private static final String REF_PARAM = "ref";
    private static final String TAG_ROOT_FRAGMENT = "rootFrag";

    /* renamed from: activityErrorHandler$delegate, reason: from kotlin metadata */
    private final Lazy activityErrorHandler;
    private final boolean allowLandscapeMode;
    private final boolean allowMainBanner;

    /* renamed from: appCompatDelegate$delegate, reason: from kotlin metadata */
    private final Lazy appCompatDelegate;

    /* renamed from: appIcon$delegate, reason: from kotlin metadata */
    private final Lazy appIcon;
    private final StateFlow2<Boolean> bannerVisibleFlow;
    private final BindViewDelegate<BaseActivity> bindViewDelegate;
    private NightModeManager2 dayNightMode;
    private DynamicTranslationsAppDelegateTransformer dynamicTranslationsAppDelegateTransformer;
    private Boolean isNavigationBarStyleLightOverride;
    private Boolean isStatusBarStyleLightOverride;
    private Menu menu;
    private final LinkedList<OnBackPressedListener> onBackPressedListeners;
    private Intent pendingIntent;
    private DeepLinkOrigin pendingIntentDeeplinkOrigin;
    private RhToolbar rhToolbar;
    private final String screenName;
    public BaseActivitySingletons singletons;
    private final BehaviorRelay<Integer> toolbarHeightRelay;
    private final TransitionReason transitionReason;
    public static final int $stable = 8;

    /* compiled from: BaseActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BaseActivity$BaseActivityEntryPoint;", "", "inject", "", "obj", "Lcom/robinhood/android/common/ui/BaseActivity;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface BaseActivityEntryPoint {
        void inject(BaseActivity obj);
    }

    /* compiled from: BaseActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BaseActivity$OnBackPressedListener;", "", "onBackPressed", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface OnBackPressedListener {
        boolean onBackPressed();
    }

    /* compiled from: BaseActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[NightModeManager2.values().length];
            try {
                iArr[NightModeManager2.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NightModeManager2.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NavigationType.values().length];
            try {
                iArr2[NavigationType.PRESENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[NavigationType.PUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NavigationType.NO_TRANSITION.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DeepLinkOrigin.Notification.Stacking.values().length];
            try {
                iArr3[DeepLinkOrigin.Notification.Stacking.UNSTACKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[DeepLinkOrigin.Notification.Stacking.STACKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
    }

    protected boolean createOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        return false;
    }

    protected void handleCustomIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
    }

    @Override // com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onLearnMoreActionClicked(int dialogId, Bundle passthroughArgs) {
        return false;
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onLinkTextClicked(int id, Bundle passthroughArgs, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return false;
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        return false;
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        return false;
    }

    public boolean onPrimaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        return false;
    }

    @Override // com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onSecondaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context newBase) {
        ComponentCallbacks2 componentCallbacks2;
        ComponentCallbacks2 componentCallbacks22;
        ComponentCallbacks2 componentCallbacks23;
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        boolean z = newBase instanceof Application;
        if (z) {
            componentCallbacks2 = (Application) newBase;
        } else {
            Context applicationContext = newBase.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext;
        }
        LocaleConfiguration localeConfiguration = ((LocaleConfigurationEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).getLocaleConfiguration();
        if (z) {
            componentCallbacks22 = (Application) newBase;
        } else {
            Context applicationContext2 = newBase.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks22 = (Application) applicationContext2;
        }
        ViewPump viewPump = ((ViewPumpEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks22).getComponentManager().get()).getViewPump();
        if (z) {
            componentCallbacks23 = (Application) newBase;
        } else {
            Context applicationContext3 = newBase.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext3, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks23 = (Application) applicationContext3;
        }
        this.dynamicTranslationsAppDelegateTransformer = ((DynamicTranslationsEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks23).getComponentManager().get()).getDynamicTranslationsAppDelegateTransformer();
        super.attachBaseContext(new ScarletContextWrapper(ViewPumpContextWrapper.INSTANCE.wrap(LocaleContextWrapper.INSTANCE.wrap(newBase, localeConfiguration, Contexts8.isRhcApp(newBase)), viewPump), null, null, 6, null));
        ScarletManager scarletManager = ScarletManager2.getScarletManager(this);
        scarletManager.addActivityThemeTransition(TaskDescriptionColorTransition.INSTANCE, Boolean.FALSE);
        scarletManager.setActivity(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getEntityId() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getEntityId(this);
    }

    public boolean getExcludeFromAnalyticsLogging() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getExcludeFromAnalyticsLogging(this);
    }

    public boolean getExcludeFromSourceLogging() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getExcludeFromSourceLogging(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public Integer getScreenDepth() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenDepth(this);
    }

    /* renamed from: getScreenDescription */
    public String getProfileId() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenDescription(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenMessageType() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenMessageType(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenSource() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenSource(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenTag() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenTag(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenType() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenType(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: isParentScreen */
    public boolean getIsParentScreen() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.isParentScreen(this);
    }

    public BaseActivity(int i) {
        super(i);
        BehaviorRelay<Integer> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.toolbarHeightRelay = behaviorRelayCreate;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.appIcon = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.android.common.ui.BaseActivity$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseActivity.appIcon_delegate$lambda$0(this.f$0);
            }
        });
        this.activityErrorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.ui.BaseActivity$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseActivity.activityErrorHandler_delegate$lambda$1(this.f$0);
            }
        });
        this.dayNightMode = NightModeManager2.DAY;
        this.transitionReason = new TransitionReason();
        this.onBackPressedListeners = new LinkedList<>();
        this.bindViewDelegate = new BindViewDelegate<>(new Function1() { // from class: com.robinhood.android.common.ui.BaseActivity$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f$0.findViewById(((Integer) obj).intValue());
            }
        });
        this.bannerVisibleFlow = StateFlow4.MutableStateFlow(Boolean.FALSE);
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.screenName = simpleName;
        this.appCompatDelegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.android.common.ui.BaseActivity$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseActivity.appCompatDelegate_delegate$lambda$17(this.f$0);
            }
        });
    }

    public BaseActivity() {
        this(0);
    }

    public final RhToolbar getRhToolbar() {
        return this.rhToolbar;
    }

    public final void setRhToolbar(RhToolbar rhToolbar) {
        this.rhToolbar = rhToolbar;
    }

    public final Observable<Integer> getToolbarHeightObs() {
        Observable<Integer> observableDistinctUntilChanged = this.toolbarHeightRelay.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    private final Bitmap getAppIcon() {
        return (Bitmap) this.appIcon.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap appIcon_delegate$lambda$0(BaseActivity baseActivity) {
        return BitmapFactory.decodeResource(baseActivity.getResources(), baseActivity.getApplication().getApplicationInfo().icon);
    }

    public final ActivityErrorHandler getActivityErrorHandler() {
        return (ActivityErrorHandler) this.activityErrorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityErrorHandler activityErrorHandler_delegate$lambda$1(BaseActivity baseActivity) {
        return new ActivityErrorHandler(baseActivity, false, 0, null, 14, null);
    }

    public boolean getIgnoreNavigationType() {
        Intrinsics.checkNotNullExpressionValue(getIntent(), "getIntent(...)");
        return !Intents2.getNavigationTypeTransitionEnabled(r0);
    }

    public final BaseActivitySingletons getSingletons() {
        BaseActivitySingletons baseActivitySingletons = this.singletons;
        if (baseActivitySingletons != null) {
            return baseActivitySingletons;
        }
        Intrinsics.throwUninitializedPropertyAccessException("singletons");
        return null;
    }

    public final void setSingletons(BaseActivitySingletons baseActivitySingletons) {
        Intrinsics.checkNotNullParameter(baseActivitySingletons, "<set-?>");
        this.singletons = baseActivitySingletons;
    }

    public final Navigator getNavigator() {
        return getSingletons().getNavigator();
    }

    private final AnalyticsLogger getAnalytics() {
        return getSingletons().getAnalytics();
    }

    public final AppContainer getAppContainer() {
        return getSingletons().getAppContainer();
    }

    private final AuthManager getAuthManager() {
        return getSingletons().getAuthManager();
    }

    public final AuthManager getAuthManagerDoNotUse() {
        return getSingletons().getAuthManager();
    }

    private final ColorSchemeManager getColorSchemeManager() {
        return getSingletons().getColorSchemeManager();
    }

    private final EventLogger getEventLoggerInternal() {
        return getSingletons().getEventLoggerInternal();
    }

    private final Set<FragmentManager.FragmentLifecycleCallbacks> getFragmentLifecycleCallbacks() {
        return getSingletons().getFragmentLifecycleCallbacks$lib_common_externalRelease();
    }

    private final BooleanPreference isNewDevicePref() {
        return getSingletons().getIsNewDevicePref();
    }

    private final StringPreference getLastDeepLinkNoncePref() {
        return getSingletons().getLastDeepLinkNoncePref();
    }

    private final MarketHoursManager getMarketHoursManager() {
        return getSingletons().getMarketHoursManager();
    }

    public final NightModeManager getNightModeManager() {
        return getSingletons().getNightModeManager();
    }

    private final dagger.Lazy<RhProcessLifecycleOwner> getRhProcessLifecycleOwner() {
        return getSingletons().getRhProcessLifecycleOwner$lib_common_externalRelease();
    }

    private final EnumPreference<Theme> getThemePref() {
        return getSingletons().getThemePref$lib_common_externalRelease();
    }

    public final PltManager getPltManager() {
        return getSingletons().getPltManager();
    }

    public final Observable<DayNightOverlay> getDayNightStyleChanges() {
        return DayNightChanges.isDayChanges(ScarletManager2.getScarletManager(this));
    }

    public final Observable<Tuples2<ColorScheme, Boolean>> getColorSchemeChanges() {
        return getColorSchemeManager().getChanges();
    }

    protected final <V extends View> Interfaces2<BaseActivity, V> bindView(int id) {
        return this.bindViewDelegate.getView(id);
    }

    protected boolean getAllowLandscapeMode() {
        return this.allowLandscapeMode;
    }

    public boolean getAllowMainBanner() {
        return this.allowMainBanner;
    }

    private final Observable<Tuples2<ColorScheme, Boolean>> getCurrentColorScheme() {
        return getColorSchemeManager().getChanges();
    }

    public final StateFlow2<Boolean> getBannerVisibleFlow() {
        return this.bannerVisibleFlow;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper
    protected void onApplyThemeResource(Resources.Theme theme, int resId, boolean first) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        super.onApplyThemeResource(theme, resId, first);
        ScarletManager2.getScarletManager(this).initBaseTheme(theme);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        return ScarletManager2.getScarletManager(this).getCurrentTheme();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initMainBanner$lambda$11(MainBannerView mainBannerView, BaseActivity baseActivity, MainBannerAppearance it) {
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z = mainBannerView.getVisibility() == 0;
        if (baseActivity.bannerVisibleFlow.getValue().booleanValue() != z) {
            baseActivity.bannerVisibleFlow.setValue(Boolean.valueOf(z));
            ViewCompat.requestApplyInsets(baseActivity.getWindow().getDecorView());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(RhToolbar rhToolbar, BaseActivity baseActivity, Object obj) {
        if (rhToolbar.getVisibility() != 0) {
            baseActivity.toolbarHeightRelay.accept(0);
            return Unit.INSTANCE;
        }
        baseActivity.toolbarHeightRelay.accept(Integer.valueOf(rhToolbar.getBottom()));
        return Unit.INSTANCE;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(int layoutResID) {
        getAppContainer().setRoot(this, layoutResID);
        this.bindViewDelegate.onViewAvailable();
        RhToolbar rhToolbar = (RhToolbar) findViewById(C11048R.id.toolbar_wrapper);
        this.rhToolbar = rhToolbar;
        setupActionBar(rhToolbar);
        initMainBanner(this.rhToolbar);
    }

    @Deprecated
    public final void setContentViewFromAppContainer(int layoutResID) {
        super.setContentView(layoutResID);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    @Deprecated
    public void setContentView(View view) {
        super.setContentView(view);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    @Deprecated
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        ComponentCallbacks2 componentCallbacks2;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        if (applicationContext instanceof Application) {
            componentCallbacks2 = (Application) applicationContext;
        } else {
            Context applicationContext2 = applicationContext.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext2;
        }
        ((BaseActivityEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).inject(this);
        this.pendingIntent = getIntent();
        Iterator<FragmentManager.FragmentLifecycleCallbacks> it = getFragmentLifecycleCallbacks().iterator();
        while (it.hasNext()) {
            getSupportFragmentManager().registerFragmentLifecycleCallbacks(it.next(), true);
        }
        if (!getAllowLandscapeMode()) {
            setRequestedOrientation(1);
        }
        if (isNewDevicePref().get()) {
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US).format(Long.valueOf(Contexts8.getPackageInfo$default(application, 0, 1, null).firstInstallTime));
            AnalyticsLogger analytics = getAnalytics();
            Intrinsics.checkNotNull(str);
            AnalyticsLogger.DefaultImpls.logUserAction$default(analytics, AnalyticsStrings.USER_ACTION_INITIAL_INSTALL_DATE, str, null, null, 12, null);
            getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_FRESH_INSTALL);
            getEventLoggerInternal().logAppFreshInstall();
            isNewDevicePref().set(false);
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        logAnalyticsIfDeeplink(intent);
        if (getShouldPromptForLockScreen() && !getAuthManager().isLoggedIn()) {
            Timber.INSTANCE.mo3353e("Activity requires authentication and the user is not logged in! Relaunching", new Object[0]);
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, WelcomeIntentKey.INSTANCE, null, false, null, null, 60, null);
            finish();
            super.onCreate(savedInstanceState);
            return;
        }
        updateDayNightStyle(true, Boolean.FALSE);
        LifecycleHost.DefaultImpls.bind$default(this, getCurrentColorScheme(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.BaseActivity$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseActivity.onCreate$lambda$3(this.f$0, (Tuples2) obj);
            }
        });
        super.onCreate(savedInstanceState);
        initEdgeToEdge();
        Integer themeAttribute = ContextsUiExtensions.getThemeAttribute(this, C20690R.attr.colorPrimary);
        if (themeAttribute != null) {
            updateTaskDescription(getColor(themeAttribute.intValue()));
        }
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(getAuthManager().getLogoutEvent()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.BaseActivity$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseActivity.onCreate$lambda$5(this.f$0, (Intent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(BaseActivity baseActivity, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        ScarletManager2.getScarletManager(baseActivity).putOverlay((ColorScheme) tuples2.component1(), Boolean.valueOf(!((Boolean) tuples2.component2()).booleanValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(BaseActivity baseActivity, Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<unused var>");
        baseActivity.setResult(0);
        baseActivity.finishAffinity();
        return Unit.INSTANCE;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        this.pendingIntent = intent;
        this.pendingIntentDeeplinkOrigin = (DeepLinkOrigin) intent.getParcelableExtra(DeepLink.INTENT_ARG_DEEP_LINK_ORIGIN);
        logAnalyticsIfDeeplink(intent);
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getMarketHoursManager().marketChangesObservable()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.BaseActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseActivity.onStart$lambda$6(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(BaseActivity baseActivity, boolean z) {
        updateDayNightStyle$default(baseActivity, false, null, 3, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        updateDayNightStyle$default(this, false, null, 3, null);
        LifecycleHost.DefaultImpls.bind$default(this, getThemePref().getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.BaseActivity$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseActivity.onResume$lambda$7(this.f$0, (Theme) obj);
            }
        });
        Intent intent = this.pendingIntent;
        if (intent != null) {
            handleCustomIntent(intent);
        }
        this.pendingIntent = null;
        final RhToolbar rhToolbar = this.rhToolbar;
        if (rhToolbar != null) {
            Observable observableMerge = Observable.merge(RxView.layoutChanges(rhToolbar), VisibilityObservable2.visibilityChanges(rhToolbar));
            Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableMerge, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.BaseActivity$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseActivity.onResume$lambda$8(rhToolbar, this, obj);
                }
            });
            LifecycleHost.DefaultImpls.bind$default(this, rhToolbar.getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.BaseActivity$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseActivity.onResume$lambda$9(this.f$0, (DayNightOverlay) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(BaseActivity baseActivity, Theme it) {
        Intrinsics.checkNotNullParameter(it, "it");
        updateDayNightStyle$default(baseActivity, false, null, 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$9(BaseActivity baseActivity, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Menu menu = baseActivity.menu;
        if (menu != null) {
            baseActivity.tintMenuItemIcons(menu);
        }
        return Unit.INSTANCE;
    }

    private final void initMainBanner(RhToolbar rhToolbar) {
        if (getAllowMainBanner()) {
            View viewInflate = ((ViewStub) findViewById(C11048R.id.main_banner)).inflate();
            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.robinhood.android.common.banner.MainBannerView");
            final MainBannerView mainBannerView = (MainBannerView) viewInflate;
            final BannerAppearanceHelper bannerAppearanceHelper = new BannerAppearanceHelper(this);
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(mainBannerView.getBannerAppearanceObservable()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.BaseActivity$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseActivity.initMainBanner$lambda$10(bannerAppearanceHelper, this, (MainBannerAppearance) obj);
                }
            });
            if (rhToolbar != null) {
                WindowInsetsListener2.doOnApplyWindowInsets(rhToolbar, new WindowInsetsListener() { // from class: com.robinhood.android.common.ui.BaseActivity.initMainBanner.2
                    @Override // com.robinhood.utils.p409ui.edge2edge.WindowInsetsListener
                    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets, RelativePadding initial) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        Intrinsics.checkNotNullParameter(insets, "insets");
                        Intrinsics.checkNotNullParameter(initial, "initial");
                        view.setPaddingRelative(initial.getStart(), initial.getTop() + (BaseActivity.this.getBannerVisibleFlow().getValue().booleanValue() ? 0 : insets.getInsets(WindowInsetsCompat.Type.statusBars()).top), initial.getEnd(), initial.getBottom());
                        return insets;
                    }
                });
            }
            mainBannerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.android.common.ui.BaseActivity.initMainBanner.3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    StateFlow2<Boolean> bannerVisibleFlow = BaseActivity.this.getBannerVisibleFlow();
                    Intrinsics.checkNotNull(view);
                    bannerVisibleFlow.setValue(Boolean.valueOf(view.getVisibility() == 0));
                    ViewCompat.requestApplyInsets(BaseActivity.this.getWindow().getDecorView());
                }
            });
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(mainBannerView.getBannerAppearanceObservable()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.BaseActivity$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseActivity.initMainBanner$lambda$11(mainBannerView, this, (MainBannerAppearance) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initMainBanner$lambda$10(BannerAppearanceHelper bannerAppearanceHelper, BaseActivity baseActivity, MainBannerAppearance it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bannerAppearanceHelper.updateStatusBarAppearance(it, ScarletManager2.getScarletManager(baseActivity));
        return Unit.INSTANCE;
    }

    static /* synthetic */ void updateDayNightStyle$default(BaseActivity baseActivity, boolean z, Boolean bool, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateDayNightStyle");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        baseActivity.updateDayNightStyle(z, bool);
    }

    private final void updateDayNightStyle(boolean applyIfUnchanged, Boolean overrideAnimated) {
        DayNightOverlay dayNightOverlay;
        boolean z = this.dayNightMode != getNightModeManager().getDayNightMode();
        this.dayNightMode = getNightModeManager().getDayNightMode();
        if (applyIfUnchanged || z) {
            ScarletManager scarletManager = ScarletManager2.getScarletManager(this);
            int i = WhenMappings.$EnumSwitchMapping$0[this.dayNightMode.ordinal()];
            if (i == 1) {
                dayNightOverlay = DayNightOverlay.DAY;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dayNightOverlay = DayNightOverlay.NIGHT;
            }
            scarletManager.putOverlay(dayNightOverlay, overrideAnimated);
        }
    }

    public final void updateTaskDescription(int color) {
        ActivityManager.TaskDescription taskDescription;
        String string2 = getString(C11048R.string.general_label_robinhood);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        if (Build.VERSION.SDK_INT >= 28) {
            BaseActivity$$ExternalSyntheticApiModelOutline1.m1850m();
            taskDescription = BaseActivity$$ExternalSyntheticApiModelOutline0.m1849m(string2, getApplication().getApplicationInfo().icon, color);
        } else {
            taskDescription = new ActivityManager.TaskDescription(string2, getAppIcon(), color);
        }
        setTaskDescription(taskDescription);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.menu = menu;
        boolean z = createOptionsMenu(menu) || super.onCreateOptionsMenu(menu);
        TypefaceUtils.applyFontToMenu$default(TypefaceUtils.INSTANCE, this, menu, null, 4, null);
        return z;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        boolean zOnPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
        tintMenuItemIcons(menu);
        return zOnPrepareOptionsMenu;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public final void addOnBackPressedListener(OnBackPressedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Preconditions4.checkOnMainThread(Preconditions.INSTANCE);
        this.onBackPressedListeners.add(listener);
    }

    public final void removeOnBackPressedListener(OnBackPressedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Preconditions4.checkOnMainThread(Preconditions.INSTANCE);
        this.onBackPressedListeners.remove(listener);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Object objPrevious;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        boolean zIsStateSaved = supportFragmentManager.isStateSaved();
        if (!zIsStateSaved || Build.VERSION.SDK_INT > 25) {
            List list = CollectionsKt.toList(this.onBackPressedListeners);
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((OnBackPressedListener) objPrevious).onBackPressed()) {
                        break;
                    }
                }
            }
            if (((OnBackPressedListener) objPrevious) != null) {
                return;
            }
            ActivityResultCaller currentFragment = getCurrentFragment();
            RhFragment rhFragment = currentFragment instanceof RhFragment ? (RhFragment) currentFragment : null;
            if (rhFragment == null || !rhFragment.onBackPressed()) {
                setCurrentFragmentTransitionReason("cancel");
                if (zIsStateSaved || !supportFragmentManager.popBackStackImmediate()) {
                    setTransitionReason("cancel");
                    super.onBackPressed();
                }
            }
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object systemService = super.getSystemService(name);
        return systemService == null ? getApplicationContext().getSystemService(name) : systemService;
    }

    public void setupActionBar(RhToolbar rhToolbar) {
        if (rhToolbar != null) {
            this.rhToolbar = rhToolbar;
            setSupportActionBar(rhToolbar.getToolbar());
            ActionBar supportActionBar = getSupportActionBar();
            Intrinsics.checkNotNull(supportActionBar);
            supportActionBar.setHomeButtonEnabled(true);
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            configureToolbar(rhToolbar);
            TypefaceUtils.INSTANCE.setToolbarTitleTypeface(rhToolbar);
        }
    }

    public void showCloseIcon() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setHomeAsUpIndicator(C13997R.drawable.svg_ic_close_color_primary_24dp);
        }
    }

    public void showBackArrowIcon() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setDisplayShowHomeEnabled(true);
            supportActionBar.setHomeAsUpIndicator((Drawable) null);
        }
    }

    public final void hideToolbar() {
        RhToolbar rhToolbar = this.rhToolbar;
        if (rhToolbar != null) {
            rhToolbar.setVisibility(8);
        }
        this.toolbarHeightRelay.accept(0);
    }

    public final void showProgressBar(boolean show) {
        RhToolbar rhToolbar = this.rhToolbar;
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.setLoadingViewVisible(show);
    }

    /* renamed from: requiresAuthentication */
    public boolean getShouldPromptForLockScreen() {
        return !isInPictureInPictureMode();
    }

    public boolean shouldPromptForLockscreen() {
        return getShouldPromptForLockScreen();
    }

    protected final void setCurrentFragmentTransitionSuccess() {
        setCurrentFragmentTransitionReason("success");
    }

    protected final void setCurrentFragmentTransitionReason(String transitionReason) {
        Intrinsics.checkNotNullParameter(transitionReason, "transitionReason");
        Fragment currentFragment = getCurrentFragment();
        BaseFragment baseFragment = currentFragment instanceof BaseFragment ? (BaseFragment) currentFragment : null;
        if (baseFragment != null) {
            baseFragment.setTransitionReason(transitionReason);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setFragment(int containerId, Fragment fragment) {
        Bundle arguments;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (isFinishing() || isStateSaved()) {
            return;
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        NavigationType navigationType = Intents2.getNavigationType(intent);
        if (navigationType != null && (arguments = fragment.getArguments()) != null) {
            Intents2.putNavigationType(arguments, navigationType);
        }
        getSupportFragmentManager().beginTransaction().add(containerId, fragment, TAG_ROOT_FRAGMENT).commitAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int replaceFragment(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return new ReplaceFragmentBuilder(fragment).buildAndExecute(this);
    }

    public final void replaceFragmentWithoutAnimation(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        new ReplaceFragmentBuilder(fragment).setUseDefaultAnimation(false).buildAndExecute(this);
    }

    public final int replaceFragmentWithoutBackStack(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return new ReplaceFragmentBuilder(fragment).setAddToBackstack(false).buildAndExecute(this);
    }

    public final void replaceFragmentWithoutAnimationAndBackStack(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        new ReplaceFragmentBuilder(fragment).setAddToBackstack(false).setUseDefaultAnimation(false).buildAndExecute(this);
    }

    protected final void popFragments(int numberToPop) {
        if (numberToPop == 0) {
            throw new IllegalArgumentException("Can't pop 0 fragments");
        }
        if (isFinishing() || isStateSaved()) {
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        int backStackEntryCount = supportFragmentManager.getBackStackEntryCount();
        if (backStackEntryCount >= numberToPop) {
            setCurrentFragmentTransitionReason("cancel");
            FragmentManager.BackStackEntry backStackEntryAt = supportFragmentManager.getBackStackEntryAt(backStackEntryCount - numberToPop);
            Intrinsics.checkNotNullExpressionValue(backStackEntryAt, "getBackStackEntryAt(...)");
            supportFragmentManager.popBackStack(backStackEntryAt.getId(), 1);
        }
    }

    protected void popLastFragment() {
        if (isFinishing() || isStateSaved()) {
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        if (supportFragmentManager.getBackStackEntryCount() > 0) {
            setCurrentFragmentTransitionReason("cancel");
            supportFragmentManager.popBackStack();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void popEntireFragmentBackstack() {
        getSupportFragmentManager().popBackStack((String) null, 1);
    }

    @Override // com.robinhood.utils.p409ui.fragment.PrimaryFragmentHost
    public Fragment getCurrentFragment() {
        return getCurrentFragment(C11048R.id.fragment_container);
    }

    public final Fragment getCurrentFragment(int containerId) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        Fragment fragmentFindFragmentById = supportFragmentManager.findFragmentById(containerId);
        return fragmentFindFragmentById == null ? supportFragmentManager.findFragmentByTag(TAG_ROOT_FRAGMENT) : fragmentFindFragmentById;
    }

    @Override // android.app.Activity
    @Deprecated
    public android.app.FragmentManager getFragmentManager() {
        android.app.FragmentManager fragmentManager = super.getFragmentManager();
        Intrinsics.checkNotNullExpressionValue(fragmentManager, "getFragmentManager(...)");
        return fragmentManager;
    }

    protected final boolean isStateSaved() {
        return getSupportFragmentManager().isStateSaved();
    }

    protected void finishThisActivity() {
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (getIgnoreNavigationType()) {
            return;
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        NavigationType navigationType = Intents2.getNavigationType(intent);
        int i = navigationType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[navigationType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                overridePendingTransition(C22231R.anim.nothing, C22231R.anim.activity_slide_down_bottom);
            } else if (i == 2) {
                overridePendingTransition(C22231R.anim.screen_slide_in_left, C22231R.anim.screen_slide_out_right);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                overridePendingTransition(0, 0);
            }
        }
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getAndResetTransitionReason() {
        return this.transitionReason.getAndResetTransitionReason();
    }

    protected final void setTransitionReason(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.transitionReason.setTransitionReason(reason);
    }

    private final void logAnalyticsIfDeeplink(Intent intent) {
        Uri uri;
        DeepLinkOrigin deepLinkOrigin;
        String stringExtra = intent.getStringExtra(DeepLink.INTENT_ARG_DEEP_LINK_NONCE);
        if (stringExtra == null || Intrinsics.areEqual(stringExtra, getLastDeepLinkNoncePref().get()) || (uri = (Uri) intent.getParcelableExtra(DeepLink.INTENT_ARG_DEEP_LINK)) == null || (deepLinkOrigin = (DeepLinkOrigin) intent.getParcelableExtra(DeepLink.INTENT_ARG_DEEP_LINK_ORIGIN)) == null) {
            return;
        }
        getLastDeepLinkNoncePref().set(stringExtra);
        logDeeplinkAnalytics(uri, deepLinkOrigin);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void logDeeplinkAnalytics(Uri data, DeepLinkOrigin deepLinkOrigin) {
        String queryParameter;
        String str;
        if (data == null) {
            return;
        }
        try {
            queryParameter = data.getQueryParameter(REF_PARAM);
        } catch (UnsupportedOperationException e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new RuntimeException("Bad uri: " + data, e), false, null, 6, null);
            queryParameter = null;
        }
        Set<String> queryParameterNames = data.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            if (!Intrinsics.areEqual((String) obj, "REF_PARAM")) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            String queryParameter2 = data.getQueryParameter((String) obj2);
            Intrinsics.checkNotNull(queryParameter2);
            linkedHashMap.put(obj2, queryParameter2);
        }
        AnalyticsLogger analytics = getAnalytics();
        String string2 = data.buildUpon().clearQuery().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        analytics.logDeepLink(queryParameter, string2, linkedHashMap);
        if ((deepLinkOrigin instanceof DeepLinkOrigin.External) || (deepLinkOrigin instanceof DeepLinkOrigin.Internal) || (deepLinkOrigin instanceof DeepLinkOrigin.AppLink)) {
            return;
        }
        if (!(deepLinkOrigin instanceof DeepLinkOrigin.Notification)) {
            throw new NoWhenBranchMatchedException();
        }
        AnalyticsLogger analytics2 = getAnalytics();
        DeepLinkOrigin.Notification notification = (DeepLinkOrigin.Notification) deepLinkOrigin;
        int i = WhenMappings.$EnumSwitchMapping$2[notification.getStacking().ordinal()];
        if (i == 1) {
            str = AnalyticsStrings.PUSH_NOTIF_EVENT_APP_OPEN;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = AnalyticsStrings.PUSH_NOTIF_EVENT_APP_OPEN_STACKED;
        }
        analytics2.logPushNotification(str, notification.getUuid(), notification.getType(), notification.getTitle(), notification.getBody(), notification.getExpandedBodyOverride(), notification.getPoBox(), notification.getCategory(), notification.getActionIdentifier());
        EventLogger eventLoggerInternal = getEventLoggerInternal();
        Component component = new Component(Component.ComponentType.PUSH_NOTIFICATION, "IN_APP_NOTIFICATION", null, 4, null);
        UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_DEEPLINK;
        String host = data.getHost();
        String str2 = host == null ? "" : host;
        String string3 = data.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        String query = data.getQuery();
        URLComponents uRLComponents = new URLComponents(string3, queryParameter == null ? "" : queryParameter, query == null ? "" : query, null, 8, null);
        String type2 = notification.getType();
        String title = notification.getTitle();
        String str3 = title == null ? "" : title;
        String body = notification.getBody();
        String str4 = body == null ? "" : body;
        String string4 = data.toString();
        Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
        String actionIdentifier = notification.getActionIdentifier();
        String str5 = actionIdentifier == null ? "" : actionIdentifier;
        String str6 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logTap$default(eventLoggerInternal, action, null, component, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, str2, null, 0, null, null, str6, 0 == true ? 1 : 0, null, null, null, null, 0 == true ? 1 : 0, null, objArr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, uRLComponents, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new NotificationContext(type2, 0, false, str6, null, str3, str4, string4, str5, null, 542, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65, -1025, -1, -8193, -1, -1, 16383, null), false, 42, null);
        if (notification.isFromNotificationAction()) {
            NotificationManager notificationManager$lib_common_externalRelease = getSingletons().getNotificationManager();
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            notificationManager$lib_common_externalRelease.cancelNotifications(application, notification.getUuid());
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int requestedOrientation) {
        if (Build.VERSION.SDK_INT == 26) {
            try {
                super.setRequestedOrientation(requestedOrientation);
            } catch (IllegalStateException unused) {
            }
        } else {
            super.setRequestedOrientation(requestedOrientation);
        }
    }

    public final void invalidateMenuItemTint() {
        Menu menu = this.menu;
        if (menu != null) {
            tintMenuItemIcons(menu);
        }
    }

    protected int getMenuItemTint() {
        Integer menuIconTint;
        Fragment currentFragment = getCurrentFragment();
        BaseFragment baseFragment = currentFragment instanceof BaseFragment ? (BaseFragment) currentFragment : null;
        if (baseFragment != null && (menuIconTint = baseFragment.getMenuIconTint()) != null) {
            return menuIconTint.intValue();
        }
        RhToolbar rhToolbar = this.rhToolbar;
        Intrinsics.checkNotNull(rhToolbar);
        Context context = rhToolbar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ThemeColors.getThemeColor(context, R.attr.textColorPrimaryNoDisable);
    }

    private final void tintMenuItemIcons(Menu menu) {
        RhToolbar rhToolbar = this.rhToolbar;
        if (rhToolbar == null || !rhToolbar.getUseDesignSystemTheme() || menu.size() <= 0) {
            return;
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(getMenuItemTint());
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItemCompat.setIconTintList(menu.getItem(i), colorStateListValueOf);
        }
    }

    public final String getDeeplinkNotificationType() {
        DeepLinkOrigin deepLinkOrigin = this.pendingIntentDeeplinkOrigin;
        if (!(deepLinkOrigin instanceof DeepLinkOrigin.Notification)) {
            return null;
        }
        Intrinsics.checkNotNull(deepLinkOrigin, "null cannot be cast to non-null type com.robinhood.android.navigation.DeepLinkOrigin.Notification");
        return ((DeepLinkOrigin.Notification) deepLinkOrigin).getType();
    }

    public final void requestPermissionsCompat(int requestCode, String... permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        getRhProcessLifecycleOwner().get().useExtendedTimeout();
        requestPermissions(permissions, requestCode);
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, com.robinhood.disposer.UiUncaughtExceptionHandler
    public boolean handleUiUncaughtException(CoroutineContext context, Throwable exception) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exception, "exception");
        return AbsErrorHandler.handleError$default(getActivityErrorHandler(), exception, false, 2, null) || super.handleUiUncaughtException(context, exception);
    }

    private final AppCompatDelegate getAppCompatDelegate() {
        return (AppCompatDelegate) this.appCompatDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatDelegate appCompatDelegate_delegate$lambda$17(BaseActivity baseActivity) {
        DynamicTranslationsAppDelegateTransformer dynamicTranslationsAppDelegateTransformer = baseActivity.dynamicTranslationsAppDelegateTransformer;
        if (dynamicTranslationsAppDelegateTransformer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dynamicTranslationsAppDelegateTransformer");
            dynamicTranslationsAppDelegateTransformer = null;
        }
        AppCompatDelegate delegate = super.getDelegate();
        Intrinsics.checkNotNullExpressionValue(delegate, "getDelegate(...)");
        return dynamicTranslationsAppDelegateTransformer.wrap(delegate, baseActivity);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public AppCompatDelegate getDelegate() {
        return getAppCompatDelegate();
    }

    public static /* synthetic */ Job collectDuxoState$default(BaseActivity baseActivity, Lifecycle.State state, Function2 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectDuxoState");
        }
        if ((i & 1) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return baseActivity.collectDuxoState(state, function2);
    }

    /* compiled from: BaseActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.ui.BaseActivity$collectDuxoState$1", m3645f = "BaseActivity.kt", m3646l = {975}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.ui.BaseActivity$collectDuxoState$1 */
    static final class C118241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Lifecycle.State $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C118241(Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C118241> continuation) {
            super(2, continuation);
            this.$state = state;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseActivity.this.new C118241(this.$state, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C118241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BaseActivity.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.ui.BaseActivity$collectDuxoState$1$1", m3645f = "BaseActivity.kt", m3646l = {975}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.ui.BaseActivity$collectDuxoState$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$block = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$block;
                    this.label = 1;
                    if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
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
                BaseActivity baseActivity = BaseActivity.this;
                Lifecycle.State state = this.$state;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, null);
                this.label = 1;
                if (RepeatOnLifecycle.repeatOnLifecycle(baseActivity, state, anonymousClass1, this) == coroutine_suspended) {
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

    protected final Job collectDuxoState(Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(block, "block");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C118241(state, block, null), 3, null);
    }

    /* compiled from: BaseActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.ui.BaseActivity$initEdgeToEdge$1", m3645f = "BaseActivity.kt", m3646l = {983}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.ui.BaseActivity$initEdgeToEdge$1 */
    /* loaded from: classes2.dex */
    static final class C118251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C118251(Continuation<? super C118251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseActivity.this.new C118251(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C118251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BaseActivity.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.ui.BaseActivity$initEdgeToEdge$1$1", m3645f = "BaseActivity.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.ui.BaseActivity$initEdgeToEdge$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ BaseActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BaseActivity baseActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = baseActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    boolean z = this.Z$0;
                    if (this.this$0.isStatusBarStyleLightOverride == null) {
                        this.this$0.setStatusBarStyle(z);
                    }
                    if (this.this$0.isNavigationBarStyleLightOverride == null) {
                        this.this$0.setNavigationBarStyle(z);
                    }
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
                Flow<Boolean> flowIsDayFlow = DayNightChanges.isDayFlow(ScarletManager2.getScarletManager(BaseActivity.this));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(BaseActivity.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowIsDayFlow, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost
    public void initEdgeToEdge() {
        enableEdgeToEdge(DayNightChanges.isDay(ScarletManager2.getScarletManager(this)));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C118251(null));
    }

    @Override // com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost
    public void initEdgeToEdge(boolean isSystemBarStyleLight) {
        enableEdgeToEdge(isSystemBarStyleLight);
    }

    @Override // com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost
    public void overrideSystemBarsStyle(boolean isLight) {
        this.isStatusBarStyleLightOverride = Boolean.valueOf(isLight);
        this.isNavigationBarStyleLightOverride = Boolean.valueOf(isLight);
        setStatusBarStyle(isLight);
        setNavigationBarStyle(isLight);
    }

    @Override // com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost
    public void overrideStatusBarStyle(boolean isLight) {
        this.isStatusBarStyleLightOverride = Boolean.valueOf(isLight);
        setStatusBarStyle(isLight);
    }

    @Override // com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost
    public void overrideNavigationBarStyle(boolean isLight) {
        this.isNavigationBarStyleLightOverride = Boolean.valueOf(isLight);
        setNavigationBarStyle(isLight);
    }

    @Override // com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost
    public void resetStatusBarStyleOverride() {
        this.isStatusBarStyleLightOverride = null;
        setStatusBarStyle(DayNightChanges.isDay(ScarletManager2.getScarletManager(this)));
    }

    @Override // com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost
    public void resetNavigationBarStyleOverride() {
        this.isNavigationBarStyleLightOverride = null;
        setNavigationBarStyle(DayNightChanges.isDay(ScarletManager2.getScarletManager(this)));
    }

    @Override // com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost
    public void resetSystemBarsStyleOverride() {
        this.isStatusBarStyleLightOverride = null;
        this.isNavigationBarStyleLightOverride = null;
        boolean zIsDay = DayNightChanges.isDay(ScarletManager2.getScarletManager(this));
        setStatusBarStyle(zIsDay);
        setNavigationBarStyle(zIsDay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStatusBarStyle(boolean isLight) {
        WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView()).setAppearanceLightStatusBars(isLight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNavigationBarStyle(boolean isLight) {
        WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView()).setAppearanceLightNavigationBars(isLight);
    }

    private final void enableEdgeToEdge(boolean isSystemBarStyleLight) {
        SystemBarStyle systemBarStyleDark;
        if (isSystemBarStyleLight) {
            systemBarStyleDark = SystemBarStyle.INSTANCE.light(0, 0);
        } else {
            systemBarStyleDark = SystemBarStyle.INSTANCE.dark(0);
        }
        EdgeToEdge.enable(this, systemBarStyleDark, systemBarStyleDark);
    }
}
