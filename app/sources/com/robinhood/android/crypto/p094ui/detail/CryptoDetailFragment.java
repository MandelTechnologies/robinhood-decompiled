package com.robinhood.android.crypto.p094ui.detail;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.transition.AutoTransition;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.paging.PagedList;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.UnifiedHistoryView;
import com.robinhood.android.common.p088ui.BindResourcesKt;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewComposable;
import com.robinhood.android.cortex.digest.asset.preview.AssetDigestPreviewDuxo;
import com.robinhood.android.cortex.models.asset.AssetType3;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.databinding.FragmentCryptoDetailBinding;
import com.robinhood.android.crypto.p094ui.detail.CryptoDetailFragment;
import com.robinhood.android.crypto.p094ui.detail.CryptoDetailMenu;
import com.robinhood.android.crypto.p094ui.detail.CryptoDetailViewState;
import com.robinhood.android.crypto.p094ui.detail.banner.CryptoBannerComposable;
import com.robinhood.android.crypto.p094ui.detail.banner.CryptoBannerType;
import com.robinhood.android.crypto.p094ui.detail.cards.CryptoDetailCardComposable;
import com.robinhood.android.crypto.p094ui.detail.cards.CryptoDetailCardDuxo;
import com.robinhood.android.crypto.p094ui.detail.description.CryptoDescriptionComposable;
import com.robinhood.android.crypto.p094ui.detail.description.CryptoDescriptionDuxo;
import com.robinhood.android.crypto.p094ui.detail.disclosure.CryptoDetailDisclosureComposable;
import com.robinhood.android.crypto.p094ui.detail.p095v2.CryptoDetailComposableKt;
import com.robinhood.android.crypto.p094ui.detail.position.CryptoPositionSection;
import com.robinhood.android.crypto.p094ui.detail.recurring.CryptoDetailRecurringComposable3;
import com.robinhood.android.crypto.p094ui.detail.staking.section.CryptoStakingDetailSectionComposable;
import com.robinhood.android.crypto.p094ui.detail.stats.CryptoStatsComposable;
import com.robinhood.android.crypto.p094ui.historicalchart.CryptoHistoricalChartComposable;
import com.robinhood.android.crypto.p094ui.view.CryptoHistoricalGraphLayout;
import com.robinhood.android.crypto.p094ui.view.availableCoins.AvailableCoinsView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.viewstubholder.ViewStubHolder;
import com.robinhood.android.education.contracts.AdvancedAlert;
import com.robinhood.android.graph.GraphLayout;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.BaseActionHandlingFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.microgramsdui.MicrogramEmbeddedSection3;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.newsfeed.extensions.NewsFeedElements;
import com.robinhood.android.newsfeed.p200ui.AssetNewsFeedView;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.librobinhood.data.store.alert.AdvancedAlertEntryPoint;
import com.robinhood.models.crypto.p315ui.UiCryptoHistorical;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.LocalScarletManager;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.buttonBar.CryptoButtonBarArgs;
import com.robinhood.shared.crypto.buttonBar.CryptoButtonBarComposable;
import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailKey;
import com.robinhood.shared.crypto.p375ui.modifiers.ModifiersKt;
import com.robinhood.shared.crypto.pending.section.CryptoPendingSection;
import com.robinhood.shared.crypto.pending.section.CryptoPendingSectionConfig;
import com.robinhood.shared.history.contracts.AllHistoryFragmentKey;
import com.robinhood.shared.lists.quickadd.C39088R;
import com.robinhood.shared.lists.quickadd.CuratedListQuickAddFragment;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either2;
import com.robinhood.utils.extensions.Contexts8;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: CryptoDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ³\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004´\u0001³\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u001d\u0010\u0019\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010\u0006J!\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020%2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010\u0006J\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010\u0006J\u001f\u00103\u001a\u00020\t2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0014¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00072\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0013\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bA\u0010@R\u001b\u0010H\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010VR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020<0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR/\u0010b\u001a\u0004\u0018\u00010Z2\b\u0010[\u001a\u0004\u0018\u00010Z8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001a\u0010c\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\bc\u0010B\u001a\u0004\bd\u0010@R\u001a\u0010e\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\be\u0010B\u001a\u0004\bf\u0010@R\u001a\u0010g\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\bg\u0010B\u001a\u0004\bh\u0010@R\u001a\u0010i\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\bi\u0010B\u001a\u0004\bj\u0010@R\u0016\u0010l\u001a\u00020k8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bl\u0010mR\"\u0010o\u001a\u00020n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010v\u001a\u00020u8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R%\u0010}\u001a\u00020|8\u0006@\u0006X\u0087.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R*\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R7\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008a\u00012\t\u0010[\u001a\u0005\u0018\u00010\u008a\u00018B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b\u008b\u0001\u0010]\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R7\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u008a\u00012\t\u0010[\u001a\u0005\u0018\u00010\u008a\u00018B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b\u0091\u0001\u0010]\u001a\u0006\b\u0092\u0001\u0010\u008d\u0001\"\u0006\b\u0093\u0001\u0010\u008f\u0001R\u0018\u0010\u0095\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010BR\u001a\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0096\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001f\u0010\u009c\u0001\u001a\u0004\u0018\u00010Z*\u0004\u0018\u00010<8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0016\u0010\u009e\u0001\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010@R\u0018\u0010¢\u0001\u001a\u00030\u009f\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u001d\u0010§\u0001\u001a\b0£\u0001j\u0003`¤\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010«\u0001\u001a\u00030¨\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0018\u0010\u00ad\u0001\u001a\u00030\u008a\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u008d\u0001R\u001f\u0010²\u0001\u001a\n\u0012\u0005\u0012\u00030¯\u00010®\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001¨\u0006¶\u0001²\u0006\u000f\u0010µ\u0001\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/CryptoDetailFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/BaseActionHandlingFragment;", "Lcom/robinhood/android/common/history/ui/UnifiedHistoryView$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "", "visible", "", "fadeTitlePrice", "(Z)V", "Lcom/robinhood/android/crypto/ui/detail/CryptoDetailViewState;", "viewState", "setViewState", "(Lcom/robinhood/android/crypto/ui/detail/CryptoDetailViewState;)V", "setupRecurringView", "ensureCuratedListQuickAddFragment", "", "padding", "updateBottomMarginBy", "(I)V", "bindCryptoHistoricalSduiChart", "Lkotlin/Function0;", "content", "CryptoDetailCompositionLocalProvider", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onPause", "onResume", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "toolbar", "configureToolbar", "(Lcom/robinhood/android/common/ui/view/RhToolbar;)V", "onRecentHistoryShowAllClicked", "onStart", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "inflater", "createOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "onPrepareOptionsMenu", "(Landroid/view/Menu;)V", "Landroid/view/MenuItem;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lio/reactivex/Observable;", "Lcom/robinhood/android/designsystem/style/DirectionOverlay;", "directionChanges", "()Lio/reactivex/Observable;", "onDismissUnsupportedFeatureDialog", "()Z", "isCrypto", "Z", "Lcom/robinhood/android/crypto/databinding/FragmentCryptoDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBinding", "()Lcom/robinhood/android/crypto/databinding/FragmentCryptoDetailBinding;", "binding", "", "defaultBottomMargin$delegate", "getDefaultBottomMargin", "()F", "defaultBottomMargin", "optionsMenu", "Landroid/view/Menu;", "Lcom/robinhood/android/crypto/ui/detail/CryptoDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/crypto/ui/detail/CryptoDetailDuxo;", "duxo", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "directionStyleRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/compose/bento/theme/Direction;", "<set-?>", "savedDirection$delegate", "Lkotlin/properties/ReadWriteProperty;", "getSavedDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "setSavedDirection", "(Lcom/robinhood/compose/bento/theme/Direction;)V", "savedDirection", "excludeFromSourceLogging", "getExcludeFromSourceLogging", "excludeFromAutoScreenSourceEventLogging", "getExcludeFromAutoScreenSourceEventLogging", "childFragmentsShouldNotConfigureToolbar", "getChildFragmentsShouldNotConfigureToolbar", "hasBottomBar", "getHasBottomBar", "Lcom/robinhood/android/crypto/ui/view/CryptoHistoricalGraphLayout;", "cryptoHistoricalGraphLayout", "Lcom/robinhood/android/crypto/ui/view/CryptoHistoricalGraphLayout;", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "pipSupportStore", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "getPipSupportStore", "()Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "setPipSupportStore", "(Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;)V", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "", "title$delegate", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "subtitle$delegate", "getSubtitle", "setSubtitle", "subtitle", "previousFade", "Lcom/robinhood/shared/lists/quickadd/CuratedListQuickAddFragment;", "getCuratedListQuickAddFragment", "()Lcom/robinhood/shared/lists/quickadd/CuratedListQuickAddFragment;", "curatedListQuickAddFragment", "getDirection", "(Lcom/robinhood/android/designsystem/style/DirectionOverlay;)Lcom/robinhood/compose/bento/theme/Direction;", "direction", "getUseDesignSystemToolbar", "useDesignSystemToolbar", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "screenEventContext", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getUiCurrencyPair$feature_crypto_externalDebug", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "uiCurrencyPair", "getScreenName", "screenName", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "Args", "isTradeBarExpanded", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoDetailFragment extends BaseActionHandlingFragment implements UnifiedHistoryView.Callbacks, AutoLoggableFragment, RegionGated {
    public static final String CRYPTO_LIST_ID = "97b746a5-bc2f-4c64-a828-1af0fc399bf9";
    private static final String QUICK_ADD_TAG = "quickAddFragment";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final boolean childFragmentsShouldNotConfigureToolbar;
    public CrossSellLaunchManager crossSellLaunchManager;
    private CryptoHistoricalGraphLayout cryptoHistoricalGraphLayout;

    /* renamed from: defaultBottomMargin$delegate, reason: from kotlin metadata */
    private final Interfaces2 defaultBottomMargin;
    private final BehaviorRelay<DirectionOverlay> directionStyleRelay;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final boolean excludeFromAutoScreenSourceEventLogging;
    private final boolean excludeFromSourceLogging;
    private final boolean hasBottomBar;
    private final boolean isCrypto;
    private Menu optionsMenu;
    public PictureInPictureStore pipSupportStore;
    private boolean previousFade;

    /* renamed from: savedDirection$delegate, reason: from kotlin metadata */
    private final Interfaces3 savedDirection;

    /* renamed from: subtitle$delegate, reason: from kotlin metadata */
    private final Interfaces3 subtitle;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    private final Interfaces3 title;
    private RhToolbar toolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/crypto/databinding/FragmentCryptoDetailBinding;", 0)), Reflection.property1(new PropertyReference1Impl(CryptoDetailFragment.class, "defaultBottomMargin", "getDefaultBottomMargin()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CryptoDetailFragment.class, "savedDirection", "getSavedDirection()Lcom/robinhood/compose/bento/theme/Direction;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CryptoDetailFragment.class, "title", "getTitle()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CryptoDetailFragment.class, "subtitle", "getSubtitle()Ljava/lang/String;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BentoTheme4.values().length];
            try {
                iArr[BentoTheme4.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BentoTheme4.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DirectionOverlay.values().length];
            try {
                iArr2[DirectionOverlay.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DirectionOverlay.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoDetailCompositionLocalProvider$lambda$11(CryptoDetailFragment cryptoDetailFragment, Function2 function2, int i, Composer composer, int i2) {
        cryptoDetailFragment.CryptoDetailCompositionLocalProvider(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.common.history.ui.UnifiedHistoryView.Callbacks
    public void doOnTransactionDetailRequested(HistoryEvent historyEvent) {
        UnifiedHistoryView.Callbacks.DefaultImpls.doOnTransactionDetailRequested(this, historyEvent);
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
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.common.history.ui.UnifiedHistoryView.Callbacks
    public void onSummaryBadgeClicked(HistoryEvent historyEvent) {
        UnifiedHistoryView.Callbacks.DefaultImpls.onSummaryBadgeClicked(this, historyEvent);
    }

    public CryptoDetailFragment() {
        super(C12757R.layout.fragment_crypto_detail);
        this.$$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);
        this.isCrypto = true;
        this.binding = ViewBinding5.viewBinding(this, CryptoDetailFragment4.INSTANCE);
        this.defaultBottomMargin = BindResourcesKt.bindDimen(this, C13997R.dimen.rds_spacing_default);
        this.duxo = OldDuxos.oldDuxo(this, CryptoDetailDuxo.class);
        BehaviorRelay<DirectionOverlay> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.directionStyleRelay = behaviorRelayCreate;
        Interfaces interfacesSavedSerializable = BindSavedState2.savedSerializable(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.savedDirection = (Interfaces3) interfacesSavedSerializable.provideDelegate(this, kPropertyArr[2]);
        this.excludeFromSourceLogging = true;
        this.excludeFromAutoScreenSourceEventLogging = true;
        this.childFragmentsShouldNotConfigureToolbar = true;
        this.hasBottomBar = true;
        this.title = BindSavedState2.savedString(this).provideDelegate(this, kPropertyArr[3]);
        this.subtitle = BindSavedState2.savedString(this).provideDelegate(this, kPropertyArr[4]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.CRYPTO_DETAIL_PAGE;
        String string2 = getUiCurrencyPair$feature_crypto_externalDebug().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        String source = ((Args) INSTANCE.getArgs((Fragment) this)).getSource();
        if (source == null) {
            source = "";
        }
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, source, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    /* renamed from: isCrypto, reason: from getter */
    public boolean get_isCrypto() {
        return this.isCrypto;
    }

    public final UiCurrencyPair getUiCurrencyPair$feature_crypto_externalDebug() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getUiCurrencyPair();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentCryptoDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCryptoDetailBinding) value;
    }

    private final float getDefaultBottomMargin() {
        return ((Number) this.defaultBottomMargin.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    private final CryptoDetailDuxo getDuxo() {
        return (CryptoDetailDuxo) this.duxo.getValue();
    }

    private final CuratedListQuickAddFragment getCuratedListQuickAddFragment() {
        return (CuratedListQuickAddFragment) getChildFragmentManager().findFragmentByTag("quickAddFragment");
    }

    private final BentoTheme4 getSavedDirection() {
        return (BentoTheme4) this.savedDirection.getValue(this, $$delegatedProperties[2]);
    }

    private final void setSavedDirection(BentoTheme4 bentoTheme4) {
        this.savedDirection.setValue(this, $$delegatedProperties[2], bentoTheme4);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromSourceLogging() {
        return this.excludeFromSourceLogging;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return this.excludeFromAutoScreenSourceEventLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return "AbridgedForexDetailFragment";
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return this.childFragmentsShouldNotConfigureToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    public final CrossSellLaunchManager getCrossSellLaunchManager() {
        CrossSellLaunchManager crossSellLaunchManager = this.crossSellLaunchManager;
        if (crossSellLaunchManager != null) {
            return crossSellLaunchManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crossSellLaunchManager");
        return null;
    }

    public final void setCrossSellLaunchManager(CrossSellLaunchManager crossSellLaunchManager) {
        Intrinsics.checkNotNullParameter(crossSellLaunchManager, "<set-?>");
        this.crossSellLaunchManager = crossSellLaunchManager;
    }

    public final PictureInPictureStore getPipSupportStore() {
        PictureInPictureStore pictureInPictureStore = this.pipSupportStore;
        if (pictureInPictureStore != null) {
            return pictureInPictureStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pipSupportStore");
        return null;
    }

    public final void setPipSupportStore(PictureInPictureStore pictureInPictureStore) {
        Intrinsics.checkNotNullParameter(pictureInPictureStore, "<set-?>");
        this.pipSupportStore = pictureInPictureStore;
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

    private final String getTitle() {
        return (String) this.title.getValue(this, $$delegatedProperties[3]);
    }

    private final void setTitle(String str) {
        this.title.setValue(this, $$delegatedProperties[3], str);
    }

    private final String getSubtitle() {
        return (String) this.subtitle.getValue(this, $$delegatedProperties[4]);
    }

    private final void setSubtitle(String str) {
        this.subtitle.setValue(this, $$delegatedProperties[4], str);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        DirectionOverlay value = this.directionStyleRelay.getValue();
        setSavedDirection(value != null ? getDirection(value) : null);
        super.onPause();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        DirectionOverlay directionOverlay;
        BentoTheme4 savedDirection = getSavedDirection();
        int i = savedDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[savedDirection.ordinal()];
        if (i == -1) {
            directionOverlay = null;
        } else if (i == 1) {
            directionOverlay = DirectionOverlay.POSITIVE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            directionOverlay = DirectionOverlay.NEGATIVE;
        }
        if (directionOverlay != null) {
            this.directionStyleRelay.accept(directionOverlay);
        }
        super.onResume();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        ViewStub cryptoHistoricalGraphLayoutStub = getBinding().cryptoHistoricalGraphLayoutStub;
        Intrinsics.checkNotNullExpressionValue(cryptoHistoricalGraphLayoutStub, "cryptoHistoricalGraphLayoutStub");
        CryptoHistoricalGraphLayout cryptoHistoricalGraphLayout = (CryptoHistoricalGraphLayout) new ViewStubHolder(cryptoHistoricalGraphLayoutStub).get();
        this.cryptoHistoricalGraphLayout = cryptoHistoricalGraphLayout;
        if (cryptoHistoricalGraphLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cryptoHistoricalGraphLayout");
            cryptoHistoricalGraphLayout = null;
        }
        cryptoHistoricalGraphLayout.updatePriceFormatter(getUiCurrencyPair$feature_crypto_externalDebug());
        GraphLayout.setCandlestickChartEnabled$default(cryptoHistoricalGraphLayout, true, false, 2, null);
        getBinding().unifiedHistory.setCallbacks(this);
        getBinding().unifiedHistory.setFromCryptoSource(get_isCrypto());
        ComposeView rhcPositionView = getBinding().rhcPositionView;
        Intrinsics.checkNotNullExpressionValue(rhcPositionView, "rhcPositionView");
        rhcPositionView.setVisibility(getAppType() == AppType.RHC ? 0 : 8);
        getBinding().rhcPositionView.setContent(ComposableLambda3.composableLambdaInstance(-2027931003, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.2
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
                    ComposerKt.traceEventStart(-2027931003, i, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.<anonymous> (CryptoDetailFragment.kt:229)");
                }
                final CryptoDetailFragment cryptoDetailFragment = CryptoDetailFragment.this;
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1854111293, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.2.1
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
                            ComposerKt.traceEventStart(1854111293, i2, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.<anonymous>.<anonymous> (CryptoDetailFragment.kt:230)");
                        }
                        CryptoPositionSection.CryptoPositionSection(cryptoDetailFragment.getUiCurrencyPair$feature_crypto_externalDebug().getId(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), cryptoDetailFragment.getNavigator(), null, composer2, 48, 8);
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
        ComposeView traderPositionView = getBinding().traderPositionView;
        Intrinsics.checkNotNullExpressionValue(traderPositionView, "traderPositionView");
        traderPositionView.setVisibility(getAppType() == AppType.TRADER ? 0 : 8);
        getBinding().traderPositionView.setContent(ComposableLambda3.composableLambdaInstance(-691692612, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.3
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
                    ComposerKt.traceEventStart(-691692612, i, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.<anonymous> (CryptoDetailFragment.kt:240)");
                }
                final CryptoDetailFragment cryptoDetailFragment = CryptoDetailFragment.this;
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1919340916, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.3.1
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
                            ComposerKt.traceEventStart(1919340916, i2, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.<anonymous>.<anonymous> (CryptoDetailFragment.kt:241)");
                        }
                        CryptoPositionSection.CryptoPositionSection(cryptoDetailFragment.getUiCurrencyPair$feature_crypto_externalDebug().getId(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), cryptoDetailFragment.getNavigator(), null, composer2, 48, 8);
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
        AvailableCoinsView availableCoinsView = getBinding().availableCoinsView;
        Intrinsics.checkNotNullExpressionValue(availableCoinsView, "availableCoinsView");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        availableCoinsView.setVisibility(Contexts8.isRhcApp(contextRequireContext) ? 8 : 0);
        getBinding().topInfoBanner.setContent(ComposableLambda3.composableLambdaInstance(-2139699459, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.4
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
                    ComposerKt.traceEventStart(-2139699459, i, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.<anonymous> (CryptoDetailFragment.kt:251)");
                }
                final CryptoDetailFragment cryptoDetailFragment = CryptoDetailFragment.this;
                cryptoDetailFragment.CryptoDetailCompositionLocalProvider(ComposableLambda3.rememberComposableLambda(-1295834738, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.4.1
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
                            ComposerKt.traceEventStart(-1295834738, i2, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.<anonymous>.<anonymous> (CryptoDetailFragment.kt:252)");
                        }
                        Boolean bool = Boolean.TRUE;
                        final CryptoDetailFragment cryptoDetailFragment2 = cryptoDetailFragment;
                        BentoTheme2.BentoTheme(null, null, null, null, bool, null, null, null, ComposableLambda3.rememberComposableLambda(489254214, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.4.1.1
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
                                    ComposerKt.traceEventStart(489254214, i3, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (CryptoDetailFragment.kt:255)");
                                }
                                CryptoBannerComposable.CryptoBannerComposable(((Args) CryptoDetailFragment.INSTANCE.getArgs((Fragment) cryptoDetailFragment2)).getUiCurrencyPair().getId(), CryptoBannerType.TRADE, PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), androidx.compose.foundation.layout.PaddingKt.m5137PaddingValuesYgX7TsA$default(((C2002Dp) composer3.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 2, null), null, composer3, 48, 16);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 100687872, 239);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        getBinding().tradeBar.setContent(ComposableLambda3.composableLambdaInstance(707260990, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.5
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
                    ComposerKt.traceEventStart(707260990, i, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.<anonymous> (CryptoDetailFragment.kt:266)");
                }
                final CryptoDetailFragment cryptoDetailFragment = CryptoDetailFragment.this;
                cryptoDetailFragment.CryptoDetailCompositionLocalProvider(ComposableLambda3.rememberComposableLambda(1551125711, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.5.1
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
                            ComposerKt.traceEventStart(1551125711, i2, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.<anonymous>.<anonymous> (CryptoDetailFragment.kt:267)");
                        }
                        final CryptoDetailFragment cryptoDetailFragment2 = cryptoDetailFragment;
                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-958752633, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.5.1.1

                            /* compiled from: CryptoDetailFragment.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment$onViewCreated$5$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C497681 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ CryptoDetailFragment this$0;

                                C497681(CryptoDetailFragment cryptoDetailFragment) {
                                    this.this$0 = cryptoDetailFragment;
                                }

                                private static final boolean invoke$lambda$2(SnapshotState<Boolean> snapshotState) {
                                    return snapshotState.getValue().booleanValue();
                                }

                                public final void invoke(Composer composer, int i) {
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1055656270, i, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailFragment.kt:274)");
                                    }
                                    Object[] objArr = new Object[0];
                                    composer.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composer.rememberedValue();
                                    Composer.Companion companion = Composer.INSTANCE;
                                    if (objRememberedValue == companion.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment$onViewCreated$5$1$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoDetailFragment.C132815.AnonymousClass1.C497671.C497681.invoke$lambda$1$lambda$0();
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composer, 3072, 6);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                    final CryptoDetailFragment cryptoDetailFragment = this.this$0;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    if (composer.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer.startReusableNode();
                                    if (composer.getInserting()) {
                                        composer.createNode(constructor);
                                    } else {
                                        composer.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null);
                                    boolean zInvoke$lambda$2 = invoke$lambda$2(snapshotState);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged = composer.changed(snapshotState);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment$onViewCreated$5$1$1$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoDetailFragment.C132815.AnonymousClass1.C497671.C497681.invoke$lambda$12$lambda$5$lambda$4(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    BoxKt.Box(ModifiersKt.m25230scrimGUYwDQI$default(modifierWeight$default, zInvoke$lambda$2, null, (Function0) objRememberedValue2, 2, null), composer, 0);
                                    boolean zInvoke$lambda$22 = invoke$lambda$2(snapshotState);
                                    CryptoButtonBarArgs.Crypto crypto2 = new CryptoButtonBarArgs.Crypto(((Args) CryptoDetailFragment.INSTANCE.getArgs((Fragment) cryptoDetailFragment)).getUiCurrencyPair().getId());
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(cryptoDetailFragment);
                                    Object objRememberedValue3 = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment$onViewCreated$5$1$1$1$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CryptoDetailFragment.C132815.AnonymousClass1.C497671.C497681.invoke$lambda$12$lambda$7$lambda$6(cryptoDetailFragment, (LayoutCoordinates) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer.endReplaceGroup();
                                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierFillMaxWidth$default, (Function1) objRememberedValue3);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged2 = composer.changed(snapshotState);
                                    Object objRememberedValue4 = composer.rememberedValue();
                                    if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment$onViewCreated$5$1$1$1$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoDetailFragment.C132815.AnonymousClass1.C497671.C497681.invoke$lambda$12$lambda$9$lambda$8(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue4);
                                    }
                                    Function0 function0 = (Function0) objRememberedValue4;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged3 = composer.changed(snapshotState);
                                    Object objRememberedValue5 = composer.rememberedValue();
                                    if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment$onViewCreated$5$1$1$1$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoDetailFragment.C132815.AnonymousClass1.C497671.C497681.invoke$lambda$12$lambda$11$lambda$10(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue5);
                                    }
                                    composer.endReplaceGroup();
                                    CryptoButtonBarComposable.CryptoButtonBarComposable(crypto2, zInvoke$lambda$22, function0, (Function0) objRememberedValue5, modifierOnGloballyPositioned, null, composer, CryptoButtonBarArgs.Crypto.$stable, 32);
                                    composer.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final SnapshotState invoke$lambda$1$lambda$0() {
                                    return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                }

                                private static final void invoke$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
                                    snapshotState.setValue(Boolean.valueOf(z));
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$12$lambda$5$lambda$4(SnapshotState snapshotState) {
                                    invoke$lambda$3(snapshotState, false);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$12$lambda$9$lambda$8(SnapshotState snapshotState) {
                                    invoke$lambda$3(snapshotState, true);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$12$lambda$11$lambda$10(SnapshotState snapshotState) {
                                    invoke$lambda$3(snapshotState, false);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$12$lambda$7$lambda$6(CryptoDetailFragment cryptoDetailFragment, LayoutCoordinates it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    cryptoDetailFragment.updateBottomMarginBy((int) (it.mo7241getSizeYbymL2g() & 4294967295L));
                                    return Unit.INSTANCE;
                                }
                            }

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
                                    ComposerKt.traceEventStart(-958752633, i3, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (CryptoDetailFragment.kt:268)");
                                }
                                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(((Args) CryptoDetailFragment.INSTANCE.getArgs((Fragment) cryptoDetailFragment2)).getUiCurrencyPair().getId().toString(), cryptoDetailFragment2.getEventScreen(), null, null, null, null, 60, null), ComposableLambda3.rememberComposableLambda(-1055656270, true, new C497681(cryptoDetailFragment2), composer3, 54), composer3, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 100663296, 255);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        getBinding().cryptoDetailScrollview.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.onViewCreated.6
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i, int i2, int i3, int i4) {
                CryptoDetailFragment.this.fadeTitlePrice(C2002Dp.m7994compareTo0680j_4(C2002Dp.m7995constructorimpl(((float) i2) / CryptoDetailFragment.this.getResources().getDisplayMetrics().density), C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(((float) CryptoDetailFragment.this.getBinding().cryptoHistoricalSduiChartComposeView.getTop()) / CryptoDetailFragment.this.getResources().getDisplayMetrics().density) + C2002Dp.m7995constructorimpl((float) 128))) > 0);
            }
        });
        Observable<DirectionOverlay> observableDistinctUntilChanged = directionChanges().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailFragment.onViewCreated$lambda$3(this.f$0, (DirectionOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(CryptoDetailFragment cryptoDetailFragment, DirectionOverlay directionOverlay) {
        ScarletManager scarletManager;
        ScarletContextWrapper scarletContextWrapper = cryptoDetailFragment.getScarletContextWrapper();
        if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
            android.content.Context contextRequireContext = cryptoDetailFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            scarletManager = ScarletManager2.getScarletManager(contextRequireContext);
        }
        Intrinsics.checkNotNull(directionOverlay);
        ScarletManager.putOverlay$default(scarletManager, directionOverlay, null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        if (!((Args) INSTANCE.getArgs((Fragment) this)).getOverrideCryptoToolbarTheme()) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(toolbar), AchromaticOverlay.INSTANCE, null, 2, null);
            toolbar.setElevation(0.0f);
        }
        toolbar.setTitleAlpha(0.0f);
        toolbar.setSubtitleAlpha(0.0f);
        toolbar.setTitle(getTitle());
        if (getTitle() != null) {
            toolbar.setSubtitle(getSubtitle());
        }
        this.toolbar = toolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fadeTitlePrice(boolean visible) {
        if (this.previousFade == visible) {
            return;
        }
        float f = visible ? 1.0f : 0.0f;
        RhToolbar rhToolbar = this.toolbar;
        if (rhToolbar != null) {
            RhToolbar.animateTitleAlpha$default(rhToolbar, f, 0L, 2, null);
        }
        RhToolbar rhToolbar2 = this.toolbar;
        if (rhToolbar2 != null) {
            RhToolbar.animateSubtitleAlpha$default(rhToolbar2, f, 0L, 2, null);
        }
        this.previousFade = visible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final CryptoDetailViewState viewState) {
        final UiCurrencyPair uiCurrencyPair = ((Args) INSTANCE.getArgs((Fragment) this)).getUiCurrencyPair();
        setTitle(viewState.getToolbarTitle());
        String title = getTitle();
        if (title != null && title.length() != 0) {
            RhToolbar rhToolbar = getRhToolbar();
            if (rhToolbar != null) {
                rhToolbar.setTitle(getTitle());
            }
            setSubtitle(viewState.getToolbarSubtitle());
            RhToolbar rhToolbar2 = getRhToolbar();
            if (rhToolbar2 != null) {
                rhToolbar2.setSubtitle(getSubtitle());
            }
        }
        List<CryptoDetailMenu.MenuAction> menuActions = viewState.getMenuActions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(menuActions, 10));
        Iterator<T> it = menuActions.iterator();
        while (it.hasNext()) {
            arrayList.add(((CryptoDetailMenu.MenuAction) it.next()).getMenuItemId());
        }
        Menu menu = this.optionsMenu;
        CryptoHistoricalGraphLayout cryptoHistoricalGraphLayout = null;
        if (menu != null) {
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = menu.getItem(i);
                item.setVisible(arrayList.contains(Integer.valueOf(item.getItemId())));
                int itemId = item.getItemId();
                MenuItemCompat.setContentDescription(item, itemId == C12757R.id.action_add_to_list ? getString(C12757R.string.action_add_to_list_content_description, uiCurrencyPair.getDisplaySymbol()) : itemId == C12757R.id.action_update_lists ? getString(C12757R.string.action_update_lists_content_description) : itemId == C12757R.id.action_alert ? getString(C12757R.string.action_update_custom_alerts) : itemId == C12757R.id.action_picture_in_picture ? getString(C12757R.string.action_open_pip) : null);
            }
        }
        if (viewState.isCryptoHistoricalSduiChartEnabled()) {
            bindCryptoHistoricalSduiChart();
        } else {
            UiCryptoHistorical cryptoHistorical = viewState.getCryptoHistorical();
            List<DataPoint.Asset> dataPoints = viewState.getDataPoints();
            if (cryptoHistorical != null && dataPoints != null) {
                CryptoHistoricalGraphLayout cryptoHistoricalGraphLayout2 = this.cryptoHistoricalGraphLayout;
                if (cryptoHistoricalGraphLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cryptoHistoricalGraphLayout");
                } else {
                    cryptoHistoricalGraphLayout = cryptoHistoricalGraphLayout2;
                }
                cryptoHistoricalGraphLayout.updateData(uiCurrencyPair, cryptoHistorical, dataPoints, viewState.getCryptoQuote());
            }
        }
        ComposeView cryptoHistoricalSduiChartComposeView = getBinding().cryptoHistoricalSduiChartComposeView;
        Intrinsics.checkNotNullExpressionValue(cryptoHistoricalSduiChartComposeView, "cryptoHistoricalSduiChartComposeView");
        cryptoHistoricalSduiChartComposeView.setVisibility(viewState.isCryptoHistoricalSduiChartEnabled() ? 0 : 8);
        ViewStub cryptoHistoricalGraphLayoutStub = getBinding().cryptoHistoricalGraphLayoutStub;
        Intrinsics.checkNotNullExpressionValue(cryptoHistoricalGraphLayoutStub, "cryptoHistoricalGraphLayoutStub");
        cryptoHistoricalGraphLayoutStub.setVisibility(!viewState.isCryptoHistoricalSduiChartEnabled() ? 0 : 8);
        getBinding().cryptoAboutView.setContent(ComposableLambda3.composableLambdaInstance(-1164700496, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1164700496, i2, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous> (CryptoDetailFragment.kt:399)");
                }
                final CryptoDetailFragment cryptoDetailFragment = CryptoDetailFragment.this;
                cryptoDetailFragment.CryptoDetailCompositionLocalProvider(ComposableLambda3.rememberComposableLambda(-1692867329, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.2.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1692867329, i3, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous> (CryptoDetailFragment.kt:400)");
                        }
                        CryptoDetailFragment cryptoDetailFragment2 = cryptoDetailFragment;
                        BentoTheme4 direction = cryptoDetailFragment2.getDirection((DirectionOverlay) RxJava2Adapter.subscribeAsState(cryptoDetailFragment2.directionChanges(), null, composer2, 48).getValue());
                        final CryptoDetailFragment cryptoDetailFragment3 = cryptoDetailFragment;
                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, direction, ComposableLambda3.rememberComposableLambda(1945139783, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.2.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i4) {
                                if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1945139783, i4, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous>.<anonymous> (CryptoDetailFragment.kt:403)");
                                }
                                CryptoDescriptionComposable.CryptoDescriptionComposable(new CryptoDescriptionDuxo.InitArgs.Crypto(((Args) CryptoDetailFragment.INSTANCE.getArgs((Fragment) cryptoDetailFragment3)).getCurrencyPairId()), com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ABOUT_SECTION, null, null, 6, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), null, composer3, 0, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (viewState.getShowStats()) {
            getBinding().cryptoStatsView.setContent(ComposableLambda3.composableLambdaInstance(255707901, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i2) {
                    if ((i2 & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(255707901, i2, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous> (CryptoDetailFragment.kt:422)");
                    }
                    final CryptoDetailFragment cryptoDetailFragment = CryptoDetailFragment.this;
                    final UiCurrencyPair uiCurrencyPair2 = uiCurrencyPair;
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1672514117, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.3.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i3) {
                            if ((i3 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1672514117, i3, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous> (CryptoDetailFragment.kt:423)");
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(((Args) CryptoDetailFragment.INSTANCE.getArgs((Fragment) cryptoDetailFragment)).getUiCurrencyPair().getId().toString(), cryptoDetailFragment.getEventScreen(), null, null, null, null, 60, null);
                            final UiCurrencyPair uiCurrencyPair3 = uiCurrencyPair2;
                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(750318074, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.3.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i4) {
                                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(750318074, i4, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous>.<anonymous> (CryptoDetailFragment.kt:429)");
                                    }
                                    CryptoStatsComposable.CryptoStatsComposable(uiCurrencyPair3.getId(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), null, composer3, 0, 4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 48);
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
        }
        getBinding().cryptoStakingView.setContent(ComposableLambda3.composableLambdaInstance(-2077023911, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2077023911, i2, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous> (CryptoDetailFragment.kt:441)");
                }
                final CryptoDetailFragment cryptoDetailFragment = CryptoDetailFragment.this;
                final UiCurrencyPair uiCurrencyPair2 = uiCurrencyPair;
                cryptoDetailFragment.CryptoDetailCompositionLocalProvider(ComposableLambda3.rememberComposableLambda(1455757800, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.4.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1455757800, i3, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous> (CryptoDetailFragment.kt:442)");
                        }
                        SduiActionHandler<GenericAction> actionHandler = cryptoDetailFragment.getActionHandler();
                        final UiCurrencyPair uiCurrencyPair3 = uiCurrencyPair2;
                        SduiActionHandler3.ProvideActionHandler(actionHandler, ComposableLambda3.rememberComposableLambda(773527783, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.4.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i4) {
                                if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(773527783, i4, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous>.<anonymous> (CryptoDetailFragment.kt:443)");
                                }
                                CryptoStakingDetailSectionComposable.CryptoStakingDetailSectionComposable(uiCurrencyPair3.getId(), null, null, composer3, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        RhTextView rhTextView = getBinding().historyViewHeaderTxt;
        Intrinsics.checkNotNull(rhTextView);
        rhTextView.setVisibility(viewState.isHistoryTitleVisible() ? 0 : 8);
        rhTextView.setText(viewState.getHistoryTitle());
        UnifiedHistoryView unifiedHistoryView = getBinding().unifiedHistory;
        Intrinsics.checkNotNull(unifiedHistoryView);
        unifiedHistoryView.setVisibility(viewState.isUnifiedHistoryVisible() ? 0 : 8);
        PagedList<StatefulHistoryEvent<HistoryEvent>> historyItems = viewState.getHistoryItems();
        if (historyItems != null) {
            unifiedHistoryView.bind(historyItems);
        }
        getBinding().availableCoinsView.bind(viewState.getOtherCoinsIds());
        if (viewState.getHasNewsItems()) {
            AssetNewsFeedView assetNewsfeedView = getBinding().assetNewsfeedView;
            Intrinsics.checkNotNullExpressionValue(assetNewsfeedView, "assetNewsfeedView");
            assetNewsfeedView.setVisibility(0);
            RhTextView newsViewHeaderTxt = getBinding().newsViewHeaderTxt;
            Intrinsics.checkNotNullExpressionValue(newsViewHeaderTxt, "newsViewHeaderTxt");
            newsViewHeaderTxt.setVisibility(0);
            AssetNewsFeedView assetNewsFeedView = getBinding().assetNewsfeedView;
            UUID assetCurrencyId = uiCurrencyPair.getAssetCurrencyId();
            String displaySymbol = uiCurrencyPair.getDisplaySymbol();
            List<NewsFeedElement> assetNewsItems = viewState.getAssetNewsItems();
            if (assetNewsItems == null) {
                assetNewsItems = CollectionsKt.emptyList();
            }
            assetNewsFeedView.bind(assetCurrencyId, displaySymbol, NewsFeedElements.toInstrumentNewsContent(assetNewsItems), true);
        } else {
            AssetNewsFeedView assetNewsfeedView2 = getBinding().assetNewsfeedView;
            Intrinsics.checkNotNullExpressionValue(assetNewsfeedView2, "assetNewsfeedView");
            assetNewsfeedView2.setVisibility(8);
            RhTextView newsViewHeaderTxt2 = getBinding().newsViewHeaderTxt;
            Intrinsics.checkNotNullExpressionValue(newsViewHeaderTxt2, "newsViewHeaderTxt");
            newsViewHeaderTxt2.setVisibility(8);
            getBinding().assetNewsfeedView.clear();
        }
        setupRecurringView();
        getBinding().disclosure.setContent(ComposableLambda3.composableLambdaInstance(-1907880136, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.7
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1907880136, i2, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous> (CryptoDetailFragment.kt:479)");
                }
                final CryptoDetailFragment cryptoDetailFragment = CryptoDetailFragment.this;
                cryptoDetailFragment.CryptoDetailCompositionLocalProvider(ComposableLambda3.rememberComposableLambda(1624901575, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.7.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1624901575, i3, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous> (CryptoDetailFragment.kt:480)");
                        }
                        final CryptoDetailFragment cryptoDetailFragment2 = cryptoDetailFragment;
                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1646357263, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.7.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i4) {
                                if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1646357263, i4, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous>.<anonymous> (CryptoDetailFragment.kt:481)");
                                }
                                CryptoDetailDisclosureComposable.CryptoDetailDisclosureComposable(((Args) CryptoDetailFragment.INSTANCE.getArgs((Fragment) cryptoDetailFragment2)).getUiCurrencyPair().getId(), null, null, composer3, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 100663296, 255);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        getBinding().cryptoRewardsDetails.setContent(ComposableLambda3.composableLambdaInstance(-1738736361, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.8
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1738736361, i2, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous> (CryptoDetailFragment.kt:487)");
                }
                if (viewState.isRewardsSectionEnabled()) {
                    final CryptoDetailFragment cryptoDetailFragment = this;
                    cryptoDetailFragment.CryptoDetailCompositionLocalProvider(ComposableLambda3.rememberComposableLambda(364280363, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.8.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i3) {
                            if ((i3 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(364280363, i3, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous> (CryptoDetailFragment.kt:489)");
                            }
                            CryptoDetailFragment cryptoDetailFragment2 = cryptoDetailFragment;
                            BentoTheme4 direction = cryptoDetailFragment2.getDirection((DirectionOverlay) RxJava2Adapter.subscribeAsState(cryptoDetailFragment2.directionChanges(), null, composer2, 48).getValue());
                            final CryptoDetailFragment cryptoDetailFragment3 = cryptoDetailFragment;
                            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, direction, ComposableLambda3.rememberComposableLambda(-1146068109, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.8.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i4) {
                                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1146068109, i4, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous>.<anonymous> (CryptoDetailFragment.kt:492)");
                                    }
                                    Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 3, null);
                                    RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication(CryptoDetailComposableKt.MicrogramAppName, null, 2, null);
                                    String str = "touchpoint=CRYPTO_DETAIL_PAGE&currency_pair_id=" + ((Args) CryptoDetailFragment.INSTANCE.getArgs((Fragment) cryptoDetailFragment3)).getUiCurrencyPair().getId();
                                    FragmentManager childFragmentManager = cryptoDetailFragment3.getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                    MicrogramEmbeddedSection3.MicrogramEmbeddedSection(remoteMicrogramApplication, childFragmentManager, modifierAnimateContentSize$default, str, CryptoDetailFragment2.INSTANCE.m13062getLambda$68255838$feature_crypto_externalDebug(), null, null, false, "CRYPTO_DETAIL_PAGE_v1", composer3, 100687872, 224);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 6);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        UiEvent<String> rhcUpsellEvent = viewState.getRhcUpsellEvent();
        if (rhcUpsellEvent != null) {
            rhcUpsellEvent.consumeWith(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoDetailFragment.setViewState$lambda$8(this.f$0, (String) obj);
                }
            });
        }
        getBinding().cryptoPendingOrdersSection.setContent(ComposableLambda3.composableLambdaInstance(-1569592586, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.10
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1569592586, i2, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous> (CryptoDetailFragment.kt:516)");
                }
                final CryptoDetailFragment cryptoDetailFragment = CryptoDetailFragment.this;
                final UiCurrencyPair uiCurrencyPair2 = uiCurrencyPair;
                cryptoDetailFragment.CryptoDetailCompositionLocalProvider(ComposableLambda3.rememberComposableLambda(1963189125, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.10.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1963189125, i3, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous> (CryptoDetailFragment.kt:517)");
                        }
                        CryptoDetailFragment cryptoDetailFragment2 = cryptoDetailFragment;
                        BentoTheme4 direction = cryptoDetailFragment2.getDirection((DirectionOverlay) RxJava2Adapter.subscribeAsState(cryptoDetailFragment2.directionChanges(), null, composer2, 48).getValue());
                        final CryptoDetailFragment cryptoDetailFragment3 = cryptoDetailFragment;
                        final UiCurrencyPair uiCurrencyPair3 = uiCurrencyPair2;
                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, direction, ComposableLambda3.rememberComposableLambda(1984644813, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.10.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i4) {
                                if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1984644813, i4, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous>.<anonymous> (CryptoDetailFragment.kt:520)");
                                }
                                UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, cryptoDetailFragment3.getEventScreen(), null, null, null, null, 61, null);
                                final UiCurrencyPair uiCurrencyPair4 = uiCurrencyPair3;
                                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-334386942, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.10.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i5) {
                                        if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-334386942, i5, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailFragment.kt:521)");
                                        }
                                        CryptoPendingSection.CryptoPendingSection(new CryptoPendingSectionConfig.CurrencyPairId(uiCurrencyPair4.getId()), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), null, composer4, CryptoPendingSectionConfig.CurrencyPairId.$stable, 4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        final CryptoDetailViewState.AssetDigestData assetDigestData = viewState.getAssetDigestData();
        if (assetDigestData != null) {
            ComposeView cryptoDetailCopilotDigest = getBinding().cryptoDetailCopilotDigest;
            Intrinsics.checkNotNullExpressionValue(cryptoDetailCopilotDigest, "cryptoDetailCopilotDigest");
            cryptoDetailCopilotDigest.setVisibility(0);
            getBinding().cryptoDetailCopilotDigest.setContent(ComposableLambda3.composableLambdaInstance(593995451, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.11
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i2) {
                    if ((i2 & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(593995451, i2, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous> (CryptoDetailFragment.kt:534)");
                    }
                    final CryptoDetailFragment cryptoDetailFragment = CryptoDetailFragment.this;
                    final CryptoDetailViewState.AssetDigestData assetDigestData2 = assetDigestData;
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(2010801667, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.11.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i3) {
                            if ((i3 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2010801667, i3, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous> (CryptoDetailFragment.kt:535)");
                            }
                            ProvidedValue[] providedValueArr = {LocalNavigator.getLocalNavigator().provides(cryptoDetailFragment.getNavigator()), AutoLoggingCompositionLocals.getLocalEventLogger().provides(cryptoDetailFragment.getEventLogger()), AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(new UserInteractionEventDescriptor(null, cryptoDetailFragment.getEventScreen(), null, null, null, null, 61, null))};
                            final CryptoDetailViewState.AssetDigestData assetDigestData3 = assetDigestData2;
                            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambda3.rememberComposableLambda(-473216701, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.11.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i4) throws Resources.NotFoundException {
                                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-473216701, i4, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous>.<anonymous> (CryptoDetailFragment.kt:542)");
                                    }
                                    AssetDigestPreviewComposable.AssetDigestPreviewComposable(new AssetDigestPreviewDuxo.Args(assetDigestData3.getAccountNumber(), assetDigestData3.getCurrencyPairId(), AssetType3.CRYPTO), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, composer3, AssetDigestPreviewDuxo.Args.$stable, 4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, ProvidedValue.$stable | 48);
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
        } else {
            ComposeView cryptoDetailCopilotDigest2 = getBinding().cryptoDetailCopilotDigest;
            Intrinsics.checkNotNullExpressionValue(cryptoDetailCopilotDigest2, "cryptoDetailCopilotDigest");
            cryptoDetailCopilotDigest2.setVisibility(8);
        }
        if (viewState.getShowCard()) {
            getBinding().cryptoDetailCard.setContent(ComposableLambda3.composableLambdaInstance(763139226, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.12
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i2) {
                    if ((i2 & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(763139226, i2, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous> (CryptoDetailFragment.kt:559)");
                    }
                    final CryptoDetailFragment cryptoDetailFragment = CryptoDetailFragment.this;
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-2115021854, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.12.1

                        /* compiled from: CryptoDetailFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment$setViewState$12$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C497721 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ CryptoDetailFragment this$0;

                            C497721(CryptoDetailFragment cryptoDetailFragment) {
                                this.this$0 = cryptoDetailFragment;
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
                                    ComposerKt.traceEventStart(-428676303, i, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous>.<anonymous> (CryptoDetailFragment.kt:561)");
                                }
                                CryptoDetailCardDuxo.Args args = new CryptoDetailCardDuxo.Args(((Args) CryptoDetailFragment.INSTANCE.getArgs((Fragment) this.this$0)).getUiCurrencyPair().getId());
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.this$0);
                                final CryptoDetailFragment cryptoDetailFragment = this.this$0;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment$setViewState$12$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoDetailFragment.C1328512.AnonymousClass1.C497721.invoke$lambda$1$lambda$0(cryptoDetailFragment);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                                final CryptoDetailFragment cryptoDetailFragment2 = this.this$0;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment$setViewState$12$1$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoDetailFragment.C1328512.AnonymousClass1.C497721.invoke$lambda$3$lambda$2(cryptoDetailFragment2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                Function0 function02 = (Function0) objRememberedValue2;
                                composer.endReplaceGroup();
                                CryptoDetailFragment cryptoDetailFragment3 = this.this$0;
                                BentoTheme4 direction = cryptoDetailFragment3.getDirection((DirectionOverlay) RxJava2Adapter.subscribeAsState(cryptoDetailFragment3.directionChanges(), null, composer, 48).getValue());
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i2 = BentoTheme.$stable;
                                CryptoDetailCardComposable.CryptoDetailCardComposable(args, function0, function02, direction, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 5, null), null, composer, 0, 32);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(CryptoDetailFragment cryptoDetailFragment) {
                                LinearLayout cryptoDetailContainer = cryptoDetailFragment.getBinding().cryptoDetailContainer;
                                Intrinsics.checkNotNullExpressionValue(cryptoDetailContainer, "cryptoDetailContainer");
                                Transitions2.beginDelayedTransition(cryptoDetailContainer, new AutoTransition());
                                ComposeView cryptoDetailCard = cryptoDetailFragment.getBinding().cryptoDetailCard;
                                Intrinsics.checkNotNullExpressionValue(cryptoDetailCard, "cryptoDetailCard");
                                cryptoDetailCard.setVisibility(0);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$2(CryptoDetailFragment cryptoDetailFragment) {
                                LinearLayout cryptoDetailContainer = cryptoDetailFragment.getBinding().cryptoDetailContainer;
                                Intrinsics.checkNotNullExpressionValue(cryptoDetailContainer, "cryptoDetailContainer");
                                Transitions2.beginDelayedTransition(cryptoDetailContainer, new AutoTransition());
                                ComposeView cryptoDetailCard = cryptoDetailFragment.getBinding().cryptoDetailCard;
                                Intrinsics.checkNotNullExpressionValue(cryptoDetailCard, "cryptoDetailCard");
                                cryptoDetailCard.setVisibility(8);
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i3) {
                            if ((i3 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2115021854, i3, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous> (CryptoDetailFragment.kt:560)");
                            }
                            CryptoDetailFragment cryptoDetailFragment2 = cryptoDetailFragment;
                            cryptoDetailFragment2.CryptoDetailCompositionLocalProvider(ComposableLambda3.rememberComposableLambda(-428676303, true, new C497721(cryptoDetailFragment2), composer2, 54), composer2, 6);
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
        }
        getBinding().cryptoPerpetualsBannerView.setContent(ComposableLambda3.composableLambdaInstance(-1400448811, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.13
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1400448811, i2, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous> (CryptoDetailFragment.kt:585)");
                }
                if (viewState.isPerpetualsEnabled()) {
                    final CryptoDetailFragment cryptoDetailFragment = this;
                    cryptoDetailFragment.CryptoDetailCompositionLocalProvider(ComposableLambda3.rememberComposableLambda(702567913, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.13.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i3) {
                            if ((i3 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(702567913, i3, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous> (CryptoDetailFragment.kt:587)");
                            }
                            Boolean bool = Boolean.TRUE;
                            final CryptoDetailFragment cryptoDetailFragment2 = cryptoDetailFragment;
                            BentoTheme2.BentoTheme(null, null, null, null, bool, null, null, null, ComposableLambda3.rememberComposableLambda(-807780559, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.13.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i4) {
                                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-807780559, i4, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setViewState.<anonymous>.<anonymous>.<anonymous> (CryptoDetailFragment.kt:590)");
                                    }
                                    UUID id = ((Args) CryptoDetailFragment.INSTANCE.getArgs((Fragment) cryptoDetailFragment2)).getUiCurrencyPair().getId();
                                    CryptoBannerType cryptoBannerType = CryptoBannerType.PERPETUALS;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i5 = BentoTheme.$stable;
                                    CryptoBannerComposable.CryptoBannerComposable(id, cryptoBannerType, PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer3, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer3, i5).m21590getDefaultD9Ej5fM()), androidx.compose.foundation.layout.PaddingKt.m5137PaddingValuesYgX7TsA$default(((C2002Dp) composer3.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 2, null), null, composer3, 48, 16);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 100687872, 239);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 6);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$8(CryptoDetailFragment cryptoDetailFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Navigator navigator = cryptoDetailFragment.getNavigator();
        android.content.Context contextRequireContext = cryptoDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(it), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    private final void setupRecurringView() {
        getBinding().cryptoRecurringView.setContent(ComposableLambda3.composableLambdaInstance(-1256334653, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setupRecurringView.1
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
                    ComposerKt.traceEventStart(-1256334653, i, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setupRecurringView.<anonymous> (CryptoDetailFragment.kt:607)");
                }
                final CryptoDetailFragment cryptoDetailFragment = CryptoDetailFragment.this;
                cryptoDetailFragment.CryptoDetailCompositionLocalProvider(ComposableLambda3.rememberComposableLambda(2136102484, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setupRecurringView.1.1
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
                            ComposerKt.traceEventStart(2136102484, i2, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setupRecurringView.<anonymous>.<anonymous> (CryptoDetailFragment.kt:608)");
                        }
                        CryptoDetailFragment cryptoDetailFragment2 = cryptoDetailFragment;
                        BentoTheme4 direction = cryptoDetailFragment2.getDirection((DirectionOverlay) RxJava2Adapter.subscribeAsState(cryptoDetailFragment2.directionChanges(), null, composer2, 48).getValue());
                        final CryptoDetailFragment cryptoDetailFragment3 = cryptoDetailFragment;
                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, direction, ComposableLambda3.rememberComposableLambda(-860104180, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setupRecurringView.1.1.1
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
                                    ComposerKt.traceEventStart(-860104180, i3, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.setupRecurringView.<anonymous>.<anonymous>.<anonymous> (CryptoDetailFragment.kt:611)");
                                }
                                CryptoDetailRecurringComposable3.CryptoDetailRecurringComposable(((Args) CryptoDetailFragment.INSTANCE.getArgs((Fragment) cryptoDetailFragment3)).getCurrencyPairId(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), null, composer3, 0, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.common.history.ui.UnifiedHistoryView.Callbacks
    public void onRecentHistoryShowAllClicked() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        EnumSet enumSetOf = EnumSet.of(AllHistoryFragmentKey.Filter.ORDERS, AllHistoryFragmentKey.Filter.CRYPTO_TRANSFERS, AllHistoryFragmentKey.Filter.CRYPTO_STAKING, AllHistoryFragmentKey.Filter.REWARDS);
        Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
        EnumSet<HistoryTransactionType> visibleHistoryTransactionTypes$feature_crypto_externalDebug = CryptoDetailDuxo.INSTANCE.getVisibleHistoryTransactionTypes$feature_crypto_externalDebug();
        HistoryStaticFilter historyStaticFilter = new HistoryStaticFilter(new HistoryStaticFilter.InstrumentFilter(((Args) INSTANCE.getArgs((Fragment) this)).getUiCurrencyPair().getId(), HistoryStaticFilter.InstrumentFilterType.CRYPTO), null, null, null, null, null, null, null, null, null, 1022, null);
        int i = EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE;
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new AllHistoryFragmentKey(enumSetOf, visibleHistoryTransactionTypes$feature_crypto_externalDebug, null, historyStaticFilter, true, 0 == true ? 1 : 0, false, false, i, 0 == true ? 1 : 0), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IacAlertSheetLocation iacAlertSheetLocation;
        super.onStart();
        ensureCuratedListQuickAddFragment();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C132761(this));
        CryptoHistoricalGraphLayout cryptoHistoricalGraphLayout = this.cryptoHistoricalGraphLayout;
        if (cryptoHistoricalGraphLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cryptoHistoricalGraphLayout");
            cryptoHistoricalGraphLayout = null;
        }
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, cryptoHistoricalGraphLayout.getDirectionStyleObservable(), (LifecycleEvent) null, 1, (Object) null), this.directionStyleRelay, null, null, 6, null);
        CryptoHistoricalGraphLayout cryptoHistoricalGraphLayout2 = this.cryptoHistoricalGraphLayout;
        if (cryptoHistoricalGraphLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cryptoHistoricalGraphLayout");
            cryptoHistoricalGraphLayout2 = null;
        }
        LifecycleHost.DefaultImpls.bind$default(this, cryptoHistoricalGraphLayout2.getGraphSelectionChangedObservable(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C132772(getDuxo()));
        Companion companion = INSTANCE;
        if (Intrinsics.areEqual(((Args) companion.getArgs((Fragment) this)).getSource(), CryptoDetailSource.BREAKING_NEWS)) {
            iacAlertSheetLocation = IacAlertSheetLocation.INVESTING_CURRENCY_DETAIL_BREAKING_NEWS;
        } else {
            iacAlertSheetLocation = IacAlertSheetLocation.INVESTING_CURRENCY_DETAIL;
        }
        CrossSellLaunchManager.initIacBottomSheetPolling$default(getCrossSellLaunchManager(), this, iacAlertSheetLocation, null, null, ((Args) companion.getArgs((Fragment) this)).getUiCurrencyPair().getId(), null, null, null, ((Args) companion.getArgs((Fragment) this)).getSource(), EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, null);
    }

    /* compiled from: CryptoDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment$onStart$1 */
    /* synthetic */ class C132761 extends FunctionReferenceImpl implements Function1<CryptoDetailViewState, Unit> {
        C132761(Object obj) {
            super(1, obj, CryptoDetailFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/crypto/ui/detail/CryptoDetailViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CryptoDetailViewState cryptoDetailViewState) {
            invoke2(cryptoDetailViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CryptoDetailViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CryptoDetailFragment) this.receiver).setViewState(p0);
        }
    }

    /* compiled from: CryptoDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment$onStart$2 */
    /* synthetic */ class C132772 extends FunctionReferenceImpl implements Function1<GraphSelection, Unit> {
        C132772(Object obj) {
            super(1, obj, CryptoDetailDuxo.class, "setGraphSelection", "setGraphSelection(Lcom/robinhood/models/ui/GraphSelection;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GraphSelection graphSelection) {
            invoke2(graphSelection);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GraphSelection p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CryptoDetailDuxo) this.receiver).setGraphSelection(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        CryptoDetailMenu cryptoDetailMenu = CryptoDetailMenu.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        cryptoDetailMenu.inflate(menu, inflater, contextRequireContext);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.optionsMenu = menu;
        super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Companion companion = INSTANCE;
        UiCurrencyPair uiCurrencyPair = ((Args) companion.getArgs((Fragment) this)).getUiCurrencyPair();
        int itemId = item.getItemId();
        if (itemId == C12757R.id.action_alert) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new AdvancedAlert(Either2.asRight(((Args) companion.getArgs((Fragment) this)).getUiCurrencyPair()), true, null, AdvancedAlertEntryPoint.CDP_NAV_BAR_BUTTON, 4, null), false, false, false, null, false, false, false, false, false, null, false, 8180, null));
        } else if (itemId == C12757R.id.action_add_to_list) {
            if (getAppType() == AppType.RHC) {
                CuratedListQuickAddFragment curatedListQuickAddFragment = getCuratedListQuickAddFragment();
                if (curatedListQuickAddFragment == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                curatedListQuickAddFragment.addToSingleUserList(uiCurrencyPair, getString(C39088R.string.lists_item_adding_to_single_watchlist), getString(C39088R.string.lists_item_added_to_single_watchlist), false);
            } else {
                CuratedListQuickAddFragment curatedListQuickAddFragment2 = getCuratedListQuickAddFragment();
                if (curatedListQuickAddFragment2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                curatedListQuickAddFragment2.addSelectedItemToCuratedList(false, uiCurrencyPair);
            }
        } else if (itemId == C12757R.id.action_update_lists) {
            if (getAppType() == AppType.RHC) {
                CuratedListQuickAddFragment curatedListQuickAddFragment3 = getCuratedListQuickAddFragment();
                if (curatedListQuickAddFragment3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                curatedListQuickAddFragment3.removeFromRecentList(uiCurrencyPair, getString(C39088R.string.lists_item_removing_from_single_watchlist), getString(C39088R.string.lists_item_removed_from_single_watchlist), false);
            } else {
                CuratedListQuickAddFragment curatedListQuickAddFragment4 = getCuratedListQuickAddFragment();
                if (curatedListQuickAddFragment4 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                curatedListQuickAddFragment4.addSelectedItemToCuratedList(true, uiCurrencyPair);
            }
        } else if (itemId == C12757R.id.action_picture_in_picture) {
            getPipSupportStore().launchPipMode(requireBaseActivity(), new PictureInPictureKey.Crypto(((Args) companion.getArgs((Fragment) this)).getUiCurrencyPair().getId()));
        } else {
            return super.onOptionsItemSelected(item);
        }
        return true;
    }

    private final void ensureCuratedListQuickAddFragment() {
        if (getCuratedListQuickAddFragment() != null || isStateSaved()) {
            return;
        }
        CuratedListQuickAddFragment curatedListQuickAddFragmentNewInstance = CuratedListQuickAddFragment.INSTANCE.newInstance(false, new Screen(Screen.Name.CRYPTO_DETAIL_PAGE, null, null, null, 14, null));
        if (requireActivity().findViewById(C11048R.id.snackbar_container) != null) {
            curatedListQuickAddFragmentNewInstance.setAnchorView(Integer.valueOf(C11048R.id.snackbar_container));
        }
        getChildFragmentManager().beginTransaction().add(curatedListQuickAddFragmentNewInstance, "quickAddFragment").commit();
    }

    public final Observable<DirectionOverlay> directionChanges() {
        return this.directionStyleRelay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBottomMarginBy(int padding) {
        LinearLayout cryptoDetailContainer = getBinding().cryptoDetailContainer;
        Intrinsics.checkNotNullExpressionValue(cryptoDetailContainer, "cryptoDetailContainer");
        ViewGroup.LayoutParams layoutParams = cryptoDetailContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = ((int) getDefaultBottomMargin()) + padding;
        cryptoDetailContainer.setLayoutParams(layoutParams2);
    }

    private final void bindCryptoHistoricalSduiChart() {
        getBinding().cryptoHistoricalSduiChartComposeView.setContent(ComposableLambda3.composableLambdaInstance(1224242219, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.bindCryptoHistoricalSduiChart.1
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
                    ComposerKt.traceEventStart(1224242219, i, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.bindCryptoHistoricalSduiChart.<anonymous> (CryptoDetailFragment.kt:774)");
                }
                final CryptoDetailFragment cryptoDetailFragment = CryptoDetailFragment.this;
                cryptoDetailFragment.CryptoDetailCompositionLocalProvider(ComposableLambda3.rememberComposableLambda(-1940405254, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.bindCryptoHistoricalSduiChart.1.1

                    /* compiled from: CryptoDetailFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment$bindCryptoHistoricalSduiChart$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C497651 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ CryptoDetailFragment this$0;

                        /* compiled from: CryptoDetailFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment$bindCryptoHistoricalSduiChart$1$1$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[BentoTheme4.values().length];
                                try {
                                    iArr[BentoTheme4.POSITIVE.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[BentoTheme4.NEGATIVE.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        C497651(CryptoDetailFragment cryptoDetailFragment) {
                            this.this$0 = cryptoDetailFragment;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            float fM21590getDefaultD9Ej5fM;
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1654472002, i, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.bindCryptoHistoricalSduiChart.<anonymous>.<anonymous>.<anonymous> (CryptoDetailFragment.kt:776)");
                            }
                            UUID id = this.this$0.getUiCurrencyPair$feature_crypto_externalDebug().getId();
                            Modifier.Companion companion = Modifier.INSTANCE;
                            if (this.this$0.getAppType() == AppType.TRADER) {
                                composer.startReplaceGroup(-668639673);
                                fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21595getXsmallD9Ej5fM();
                                composer.endReplaceGroup();
                            } else {
                                composer.startReplaceGroup(-668545402);
                                fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
                                composer.endReplaceGroup();
                            }
                            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, fM21590getDefaultD9Ej5fM, 7, null);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.this$0);
                            final CryptoDetailFragment cryptoDetailFragment = this.this$0;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment$bindCryptoHistoricalSduiChart$1$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CryptoDetailFragment.C132751.AnonymousClass1.C497651.invoke$lambda$1$lambda$0(cryptoDetailFragment, (BentoTheme4) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            CryptoHistoricalChartComposable.CryptoHistoricalChartComposable(id, modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue, null, null, composer, 0, 24);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(CryptoDetailFragment cryptoDetailFragment, BentoTheme4 it) {
                            DirectionOverlay directionOverlay;
                            Intrinsics.checkNotNullParameter(it, "it");
                            BehaviorRelay behaviorRelay = cryptoDetailFragment.directionStyleRelay;
                            int i = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
                            if (i == 1) {
                                directionOverlay = DirectionOverlay.POSITIVE;
                            } else {
                                if (i != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                directionOverlay = DirectionOverlay.NEGATIVE;
                            }
                            behaviorRelay.accept(directionOverlay);
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
                            ComposerKt.traceEventStart(-1940405254, i2, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.bindCryptoHistoricalSduiChart.<anonymous>.<anonymous> (CryptoDetailFragment.kt:775)");
                        }
                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1654472002, true, new C497651(cryptoDetailFragment), composer2, 54), composer2, 100663296, 255);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BentoTheme4 getDirection(DirectionOverlay directionOverlay) {
        int i = directionOverlay == null ? -1 : WhenMappings.$EnumSwitchMapping$1[directionOverlay.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return BentoTheme4.POSITIVE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return BentoTheme4.NEGATIVE;
    }

    /* compiled from: CryptoDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/CryptoDetailFragment$Args;", "Landroid/os/Parcelable;", "Lcom/robinhood/shared/crypto/contracts/detail/CryptoDetailKey;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "overrideCryptoToolbarTheme", "", "source", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;ZLjava/lang/String;)V", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getOverrideCryptoToolbarTheme", "()Z", "getSource", "()Ljava/lang/String;", "currencyPairId", "Ljava/util/UUID;", "getCurrencyPairId", "()Ljava/util/UUID;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable, CryptoDetailKey {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean overrideCryptoToolbarTheme;
        private final String source;
        private final UiCurrencyPair uiCurrencyPair;

        /* compiled from: CryptoDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UiCurrencyPair) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UiCurrencyPair uiCurrencyPair, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCurrencyPair = args.uiCurrencyPair;
            }
            if ((i & 2) != 0) {
                z = args.overrideCryptoToolbarTheme;
            }
            if ((i & 4) != 0) {
                str = args.source;
            }
            return args.copy(uiCurrencyPair, z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getOverrideCryptoToolbarTheme() {
            return this.overrideCryptoToolbarTheme;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Args copy(UiCurrencyPair uiCurrencyPair, boolean overrideCryptoToolbarTheme, String source) {
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            return new Args(uiCurrencyPair, overrideCryptoToolbarTheme, source);
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
            return Intrinsics.areEqual(this.uiCurrencyPair, args.uiCurrencyPair) && this.overrideCryptoToolbarTheme == args.overrideCryptoToolbarTheme && Intrinsics.areEqual(this.source, args.source);
        }

        public int hashCode() {
            int iHashCode = ((this.uiCurrencyPair.hashCode() * 31) + Boolean.hashCode(this.overrideCryptoToolbarTheme)) * 31;
            String str = this.source;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(uiCurrencyPair=" + this.uiCurrencyPair + ", overrideCryptoToolbarTheme=" + this.overrideCryptoToolbarTheme + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.uiCurrencyPair, flags);
            dest.writeInt(this.overrideCryptoToolbarTheme ? 1 : 0);
            dest.writeString(this.source);
        }

        public Args(UiCurrencyPair uiCurrencyPair, boolean z, String str) {
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            this.uiCurrencyPair = uiCurrencyPair;
            this.overrideCryptoToolbarTheme = z;
            this.source = str;
        }

        public /* synthetic */ Args(UiCurrencyPair uiCurrencyPair, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uiCurrencyPair, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
        }

        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        public final boolean getOverrideCryptoToolbarTheme() {
            return this.overrideCryptoToolbarTheme;
        }

        @Override // com.robinhood.shared.crypto.contracts.detail.CryptoDetailKey
        public String getSource() {
            return this.source;
        }

        @Override // com.robinhood.shared.crypto.contracts.detail.CryptoDetailKey
        public UUID getCurrencyPairId() {
            return this.uiCurrencyPair.getId();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void CryptoDetailCompositionLocalProvider(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        ScarletManager scarletManager;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1754562945);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1754562945, i2, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.CryptoDetailCompositionLocalProvider (CryptoDetailFragment.kt:818)");
            }
            ProvidedValue<Navigator> providedValueProvides = LocalNavigator.getLocalNavigator().provides(getNavigator());
            ProvidedValue<EventLogger> providedValueProvides2 = AutoLoggingCompositionLocals.getLocalEventLogger().provides(getEventLogger());
            CompositionLocal6<ScarletManager> localScarletManager = LocalScarletManager.getLocalScarletManager();
            ScarletContextWrapper scarletContextWrapper = getScarletContextWrapper();
            if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                scarletManager = ScarletManager2.getScarletManager(contextRequireContext);
            }
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{providedValueProvides, providedValueProvides2, localScarletManager.provides(scarletManager), AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(new UserInteractionEventDescriptor(null, getEventScreen(), null, null, null, null, 61, null))}, ComposableLambda3.rememberComposableLambda(-1577512513, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.CryptoDetailCompositionLocalProvider.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1577512513, i3, -1, "com.robinhood.android.crypto.ui.detail.CryptoDetailFragment.CryptoDetailCompositionLocalProvider.<anonymous> (CryptoDetailFragment.kt:828)");
                    }
                    function2.invoke(composer2, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoDetailFragment.CryptoDetailCompositionLocalProvider$lambda$11(this.f$0, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CryptoDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/CryptoDetailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/crypto/ui/detail/CryptoDetailFragment;", "Lcom/robinhood/android/crypto/ui/detail/CryptoDetailFragment$Args;", "<init>", "()V", "CRYPTO_LIST_ID", "", "QUICK_ADD_TAG", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoDetailFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoDetailFragment cryptoDetailFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoDetailFragment newInstance(Args args) {
            return (CryptoDetailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoDetailFragment cryptoDetailFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoDetailFragment, args);
        }
    }
}
