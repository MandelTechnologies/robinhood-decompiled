package com.robinhood.android.lists.p173ui.userlist;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollEvent;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.LogOnceAnalytics;
import com.robinhood.analytics.LogOnceEventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.common.emojipicker.EmojiPickerBottomSheetFragment;
import com.robinhood.android.common.extensions.SecurityViewModes;
import com.robinhood.android.common.extensions.SortOrders;
import com.robinhood.android.common.p088ui.AccurateLinearLayoutManager;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.DisclosureUtil;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.android.common.util.VisibleItemsManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.futures.contracts.FuturesDetailFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.extensions.SortDirections;
import com.robinhood.android.lists.p173ui.CuratedListAdapter;
import com.robinhood.android.lists.p173ui.listitemsort.CuratedListSortItemsBottomSheetFragment;
import com.robinhood.android.lists.p173ui.listitemsort.CuratedListUserSortOptionsView;
import com.robinhood.android.lists.p173ui.userlist.CuratedListMenuOptionsBottomSheetFragment;
import com.robinhood.android.lists.p173ui.userlist.CuratedListUserListHeaderView;
import com.robinhood.android.lists.p173ui.userlist.EditCuratedListHeaderView;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedListViewMode;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p355ui.CryptoCuratedListEligible;
import com.robinhood.models.p355ui.CuratedListEligible;
import com.robinhood.models.p355ui.FuturesCuratedListEligible;
import com.robinhood.models.p355ui.IndexCuratedListEligible;
import com.robinhood.models.p355ui.InstrumentCuratedListEligible;
import com.robinhood.models.p355ui.OptionStrategyCuratedListEligible;
import com.robinhood.models.p355ui.SortOption;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.List;
import com.robinhood.rosetta.eventlogging.PositionsInstrumentType;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import com.robinhood.shared.portfolio.lists.p391ui.sort.CuratedListSortCallbacks;
import com.robinhood.udf.UiEvent;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment;
import com.robinhood.viewmode.ViewModeSelectionType;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Arrays;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: CuratedListUserListFragment.kt */
@Metadata(m3635d1 = {"\u0000º\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 Ò\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002Ò\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010{\u001a\u00020J2\u0006\u0010|\u001a\u00020}H\u0016J\u0013\u0010~\u001a\u00020J2\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H\u0016J\u001d\u0010\u0081\u0001\u001a\u00020J2\u0007\u0010\u0082\u0001\u001a\u00020I2\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H\u0016J\t\u0010\u0083\u0001\u001a\u00020JH\u0016J\t\u0010\u0084\u0001\u001a\u00020JH\u0016J\u001d\u0010\u0085\u0001\u001a\u00020J2\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0014J\u0012\u0010\u008a\u0001\u001a\u00020U2\u0007\u0010\u008b\u0001\u001a\u00020\u000eH\u0016J\t\u0010\u008c\u0001\u001a\u00020JH\u0016J\t\u0010\u008d\u0001\u001a\u00020JH\u0016J\u0012\u0010\u008e\u0001\u001a\u00020J2\u0007\u0010\u008f\u0001\u001a\u00020GH\u0016J\u0012\u0010\u0090\u0001\u001a\u00020J2\u0007\u0010\u0091\u0001\u001a\u000209H\u0016J\u0012\u0010\u0092\u0001\u001a\u00020J2\u0007\u0010\u0093\u0001\u001a\u000209H\u0016J\u0012\u0010\u0094\u0001\u001a\u00020J2\u0007\u0010\u0095\u0001\u001a\u000209H\u0016J\u0012\u0010\u0096\u0001\u001a\u00020J2\u0007\u0010\u0097\u0001\u001a\u000209H\u0016J\t\u0010\u0098\u0001\u001a\u00020JH\u0016J\t\u0010\u0099\u0001\u001a\u00020JH\u0016J\u0012\u0010\u009a\u0001\u001a\u00020J2\u0007\u0010\u0091\u0001\u001a\u000209H\u0016J\u0012\u0010\u009b\u0001\u001a\u00020J2\u0007\u0010\u0097\u0001\u001a\u000209H\u0016J\u0012\u0010\u009c\u0001\u001a\u00020J2\u0007\u0010\u0093\u0001\u001a\u000209H\u0016J\u0012\u0010\u009d\u0001\u001a\u00020J2\u0007\u0010\u009e\u0001\u001a\u00020IH\u0016J)\u0010\u009f\u0001\u001a\u00020J2\b\u0010 \u0001\u001a\u00030¡\u00012\b\u0010¢\u0001\u001a\u00030¡\u00012\n\u0010£\u0001\u001a\u0005\u0018\u00010¤\u0001H\u0016J\t\u0010¥\u0001\u001a\u00020UH\u0016J\u001f\u0010¦\u0001\u001a\u00020U2\b\u0010§\u0001\u001a\u00030¡\u00012\n\u0010¨\u0001\u001a\u0005\u0018\u00010\u0080\u0001H\u0016J\u001f\u0010©\u0001\u001a\u00020U2\b\u0010§\u0001\u001a\u00030¡\u00012\n\u0010¨\u0001\u001a\u0005\u0018\u00010\u0080\u0001H\u0016J%\u0010ª\u0001\u001a\u00020J2\b\u0010«\u0001\u001a\u00030¬\u00012\u0007\u0010\u00ad\u0001\u001a\u0002092\u0007\u0010®\u0001\u001a\u00020PH\u0016J\u0012\u0010¶\u0001\u001a\u00020J2\u0007\u0010·\u0001\u001a\u00020>H\u0002J\u0012\u0010¸\u0001\u001a\u00020J2\u0007\u0010·\u0001\u001a\u00020>H\u0002J\u0012\u0010¹\u0001\u001a\u00020J2\u0007\u0010·\u0001\u001a\u00020>H\u0002J\u0012\u0010º\u0001\u001a\u00020J2\u0007\u0010·\u0001\u001a\u00020>H\u0002J\u0012\u0010»\u0001\u001a\u00020J2\u0007\u0010·\u0001\u001a\u00020>H\u0002J\u0012\u0010¼\u0001\u001a\u00020J2\u0007\u0010·\u0001\u001a\u00020>H\u0002J\u0012\u0010½\u0001\u001a\u00020J2\u0007\u0010·\u0001\u001a\u00020>H\u0002J\u0012\u0010¾\u0001\u001a\u00020J2\u0007\u0010·\u0001\u001a\u00020>H\u0002J\u0014\u0010¿\u0001\u001a\u00020J2\t\u0010À\u0001\u001a\u0004\u0018\u00010PH\u0002J\u0012\u0010Á\u0001\u001a\u00020J2\u0007\u0010·\u0001\u001a\u00020>H\u0002J\u0012\u0010Â\u0001\u001a\u00020J2\u0007\u0010·\u0001\u001a\u00020>H\u0002J\u0012\u0010Ã\u0001\u001a\u00020J2\u0007\u0010·\u0001\u001a\u00020>H\u0002J\t\u0010Ä\u0001\u001a\u00020JH\u0002J\u0012\u0010Å\u0001\u001a\u00020J2\u0007\u0010\u0091\u0001\u001a\u000209H\u0002J\u001c\u0010Æ\u0001\u001a\u00020J2\u0007\u0010Ç\u0001\u001a\u0002092\b\u0010È\u0001\u001a\u00030¡\u0001H\u0002J\u001c\u0010É\u0001\u001a\u00020J2\u0007\u0010Ê\u0001\u001a\u0002092\b\u0010Ë\u0001\u001a\u00030Ì\u0001H\u0002J\u0014\u0010Í\u0001\u001a\u0004\u0018\u00010P2\u0007\u0010·\u0001\u001a\u00020>H\u0002J\t\u0010Î\u0001\u001a\u00020JH\u0002J\u0012\u0010Ï\u0001\u001a\u00020J2\u0007\u0010\u0091\u0001\u001a\u000209H\u0002J\u0012\u0010Ð\u0001\u001a\u00020J2\u0007\u0010\u0091\u0001\u001a\u000209H\u0002J\u0012\u0010Ñ\u0001\u001a\u00020J2\u0007\u0010\u008b\u0001\u001a\u00020:H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b*\u0010+R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b/\u00100R\u001b\u00102\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b4\u00105R\u001a\u00107\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:08X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0<X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010?\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020>0<X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010A\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010'\u001a\u0004\bC\u0010DR\u001a\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020G0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010H\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020J0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010K\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020J0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010L\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020J0<X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010N\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020P0<X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020R0<X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010S\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020U0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010V\u001a\u0004\u0018\u00010PX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020UX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020UX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020ZX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010[\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010'\u001a\u0004\b]\u0010^R\u001e\u0010`\u001a\u00020a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001e\u0010f\u001a\u00020g8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001e\u0010l\u001a\u00020m8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001f\u0010r\u001a\u00060sj\u0002`t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010'\u001a\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020UX\u0096D¢\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u0017\u0010¯\u0001\u001a\u00020P8VX\u0096\u0004¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001R\u0019\u0010²\u0001\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010±\u0001R\u0019\u0010´\u0001\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010±\u0001¨\u0006Ó\u0001"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/lists/ui/userlist/CuratedListMenuOptionsBottomSheetFragment$Callbacks;", "Lcom/robinhood/android/lists/ui/listitemsort/CuratedListUserSortOptionsView$Callbacks;", "Lcom/robinhood/shared/portfolio/lists/ui/sort/CuratedListSortCallbacks;", "Lcom/robinhood/android/lists/ui/CuratedListAdapter$Callbacks;", "Lcom/robinhood/viewmode/ViewModeSelectionBottomSheetFragment$Callbacks;", "<init>", "()V", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "curatedListAdapter", "Lcom/robinhood/android/lists/ui/CuratedListAdapter;", "menuItemAddToList", "Landroid/view/MenuItem;", "menuItemLoading", "menuItemOverflow", "menuItemDone", "stickyUserSortOptionsContainer", "Landroid/view/ViewGroup;", "getStickyUserSortOptionsContainer", "()Landroid/view/ViewGroup;", "stickyUserSortOptionsContainer$delegate", "Lkotlin/properties/ReadOnlyProperty;", "stickyUserSortOptionsView", "Lcom/robinhood/android/lists/ui/listitemsort/CuratedListUserSortOptionsView;", "getStickyUserSortOptionsView", "()Lcom/robinhood/android/lists/ui/listitemsort/CuratedListUserSortOptionsView;", "stickyUserSortOptionsView$delegate", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "itemTouchHelperCallbacks", "Lcom/robinhood/android/lists/ui/userlist/CuratedListItemTouchHelperCallbacks;", "getItemTouchHelperCallbacks", "()Lcom/robinhood/android/lists/ui/userlist/CuratedListItemTouchHelperCallbacks;", "itemTouchHelperCallbacks$delegate", "Lkotlin/Lazy;", "itemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "getItemTouchHelper", "()Landroidx/recyclerview/widget/ItemTouchHelper;", "itemTouchHelper$delegate", "logOnceAnalytics", "Lcom/robinhood/analytics/LogOnceAnalytics;", "getLogOnceAnalytics", "()Lcom/robinhood/analytics/LogOnceAnalytics;", "logOnceAnalytics$delegate", "logOnceEventLogger", "Lcom/robinhood/analytics/LogOnceEventLogger;", "getLogOnceEventLogger", "()Lcom/robinhood/analytics/LogOnceEventLogger;", "logOnceEventLogger$delegate", "visibleItemsManager", "Lcom/robinhood/android/common/util/VisibleItemsManager;", "Ljava/util/UUID;", "Lcom/robinhood/models/ui/CuratedListEligible;", "userListHeaderAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListHeaderView;", "Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListViewState;", "headerEditAdapter", "Lcom/robinhood/android/lists/ui/userlist/EditCuratedListHeaderView;", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "userSortOptionAdapter", "Lcom/robinhood/models/ui/SortOption;", "anchorAdapter", "Landroid/view/View;", "", "dividerAdapter", "loadingAdapter", "Landroid/widget/FrameLayout;", "emptyStateAdapter", "Landroid/widget/LinearLayout;", "", "disclosureAdapter", "", "futuresContractsDisclosureAdapter", "Landroidx/compose/ui/platform/ComposeView;", "", "curatedListDisplayName", "isEditing", "isEditingWithChanges", "editCallbacks", "Lcom/robinhood/android/lists/ui/userlist/EditCuratedListHeaderView$Callbacks;", "duxo", "Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListDuxo;", "getDuxo", "()Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListDuxo;", "duxo$delegate", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "eventList", "Lcom/robinhood/rosetta/eventlogging/List;", "Lcom/robinhood/rosetta/eventlogging/EventList;", "getEventList", "()Lcom/robinhood/rosetta/eventlogging/List;", "eventList$delegate", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "()Z", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "onResume", "onStop", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "onEditClicked", "onSortOptionChipClicked", "onSortOptionSelected", "sortOption", "onInstrumentRowClicked", "instrumentId", "onFuturesRowClicked", "contractId", "onIndexRowClicked", "indexId", "onCurrencyRowClicked", "currencyPairId", "onQuoteClicked", "onFuturesQuoteClicked", "onInstrumentRowRemoved", "onCryptoRowRemoved", "onFuturesRowRemoved", "onReorderPressed", "itemView", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onBackPressed", "onPositiveButtonClicked", "id", "passthroughArgs", "onNegativeButtonClicked", "onCuratedListViewModeChange", "viewMode", "Lcom/robinhood/android/common/util/SecurityViewMode;", "listId", "listDisplayName", "screenName", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "entityId", "getEntityId", "setViewState", "state", "bindLoading", "bindHeader", "bindEditHeader", "bindUserSortOption", "bindCuratedListItems", "bindEmptyState", "consumeUiEvents", "launchSearchFragment", "displayName", "updateMenuItems", "bindDisclosureText", "bindFuturesContractsDisclosure", "updateStickySortOptionView", "onWatchListItemBuy", "synchronizeListPositionChange", "movedItemId", "newGlobalPosition", "synchronizeListDeleteItem", "itemId", "assetType", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "getListEditEventButtonDescription", "showSortOrderBottomSheet", "logEquityItemSwipeInitiated", "logEquityItemSwipeCompleted", "logListItemAppear", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CuratedListUserListFragment extends BaseFragment implements CuratedListMenuOptionsBottomSheetFragment.Callbacks, CuratedListUserSortOptionsView.Callbacks, CuratedListSortCallbacks, CuratedListAdapter.Callbacks, ViewModeSelectionBottomSheetFragment.Callbacks {
    private static final int EMOJI_REQUEST_CODE = 85;
    private static final String SCREEN_NAME_DEFAULT = "ListDetailPage";
    public AnalyticsLogger analytics;
    private final SingleItemAdapter<View, Unit> anchorAdapter;
    private CompositeAdapter compositeAdapter;
    private CuratedListAdapter curatedListAdapter;
    private String curatedListDisplayName;
    private SingleItemAdapter<View, CharSequence> disclosureAdapter;
    private final SingleItemAdapter<View, Unit> dividerAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final EditCuratedListHeaderView.Callbacks editCallbacks;
    private SingleItemAdapter<LinearLayout, String> emptyStateAdapter;

    /* renamed from: eventList$delegate, reason: from kotlin metadata */
    private final Lazy eventList;
    public EventLogger eventLogger;
    private final SingleItemAdapter<ComposeView, Boolean> futuresContractsDisclosureAdapter;
    private SingleItemAdapter<EditCuratedListHeaderView, CuratedListUserListViewState> headerEditAdapter;
    private boolean isEditing;
    private boolean isEditingWithChanges;

    /* renamed from: itemTouchHelper$delegate, reason: from kotlin metadata */
    private final Lazy itemTouchHelper;

    /* renamed from: itemTouchHelperCallbacks$delegate, reason: from kotlin metadata */
    private final Lazy itemTouchHelperCallbacks;
    private SingleItemAdapter<FrameLayout, Unit> loadingAdapter;

    /* renamed from: logOnceAnalytics$delegate, reason: from kotlin metadata */
    private final Lazy logOnceAnalytics;

    /* renamed from: logOnceEventLogger$delegate, reason: from kotlin metadata */
    private final Lazy logOnceEventLogger;
    private MenuItem menuItemAddToList;
    private MenuItem menuItemDone;
    private MenuItem menuItemLoading;
    private MenuItem menuItemOverflow;

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 recyclerView;

    /* renamed from: stickyUserSortOptionsContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 stickyUserSortOptionsContainer;

    /* renamed from: stickyUserSortOptionsView$delegate, reason: from kotlin metadata */
    private final Interfaces2 stickyUserSortOptionsView;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    private final boolean useDesignSystemToolbar;
    public SurveyManager3 userLeapManager;
    private SingleItemAdapter<CuratedListUserListHeaderView, CuratedListUserListViewState> userListHeaderAdapter;
    private final SingleItemAdapter<CuratedListUserSortOptionsView, SortOption> userSortOptionAdapter;
    private VisibleItemsManager<UUID, CuratedListEligible> visibleItemsManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CuratedListUserListFragment.class, "stickyUserSortOptionsContainer", "getStickyUserSortOptionsContainer()Landroid/view/ViewGroup;", 0)), Reflection.property1(new PropertyReference1Impl(CuratedListUserListFragment.class, "stickyUserSortOptionsView", "getStickyUserSortOptionsView()Lcom/robinhood/android/lists/ui/listitemsort/CuratedListUserSortOptionsView;", 0)), Reflection.property1(new PropertyReference1Impl(CuratedListUserListFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment.Callbacks
    public void onAllCuratedListsViewModeChange(SecurityViewMode securityViewMode) {
        ViewModeSelectionBottomSheetFragment.Callbacks.DefaultImpls.onAllCuratedListsViewModeChange(this, securityViewMode);
    }

    @Override // com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment.Callbacks
    public void onHoldingsViewModeChange(SecurityViewMode securityViewMode) {
        ViewModeSelectionBottomSheetFragment.Callbacks.DefaultImpls.onHoldingsViewModeChange(this, securityViewMode);
    }

    @Override // com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment.Callbacks
    public void onOptionsWatchlistViewModeChange(SecurityViewMode securityViewMode) {
        ViewModeSelectionBottomSheetFragment.Callbacks.DefaultImpls.onOptionsWatchlistViewModeChange(this, securityViewMode);
    }

    public CuratedListUserListFragment() {
        super(C20839R.layout.fragment_curated_list_user_list);
        this.stickyUserSortOptionsContainer = bindView(C20839R.id.fragment_curated_list_user_list_sticky_sort_options_container);
        this.stickyUserSortOptionsView = bindView(C20839R.id.curated_list_user_list_sticky_sort_options_view);
        this.recyclerView = bindView(C20839R.id.fragment_curated_list_user_list_recycler_view);
        this.itemTouchHelperCallbacks = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListUserListFragment.itemTouchHelperCallbacks_delegate$lambda$0(this.f$0);
            }
        });
        this.itemTouchHelper = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListUserListFragment.itemTouchHelper_delegate$lambda$1(this.f$0);
            }
        });
        this.logOnceAnalytics = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListUserListFragment.logOnceAnalytics_delegate$lambda$2(this.f$0);
            }
        });
        this.logOnceEventLogger = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListUserListFragment.logOnceEventLogger_delegate$lambda$3(this.f$0);
            }
        });
        SingleItemAdapter.Companion companion = SingleItemAdapter.INSTANCE;
        CuratedListUserListHeaderView.Companion companion2 = CuratedListUserListHeaderView.INSTANCE;
        DiffCallbacks.Single single = DiffCallbacks.Single.INSTANCE;
        this.userListHeaderAdapter = companion.m2993of(companion2, single, new Function2() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CuratedListUserListFragment.userListHeaderAdapter$lambda$4((CuratedListUserListHeaderView) obj, (CuratedListUserListViewState) obj2);
            }
        });
        this.headerEditAdapter = companion.m2993of(EditCuratedListHeaderView.INSTANCE, new DiffUtil.ItemCallback<CuratedListUserListViewState>() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$headerEditAdapter$1
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areItemsTheSame(CuratedListUserListViewState oldItem, CuratedListUserListViewState newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return true;
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areContentsTheSame(CuratedListUserListViewState oldItem, CuratedListUserListViewState newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.areEqual(oldItem.getEditedEmoji(), newItem.getEditedEmoji());
            }
        }, new Function2() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CuratedListUserListFragment.headerEditAdapter$lambda$5(this.f$0, (EditCuratedListHeaderView) obj, (CuratedListUserListViewState) obj2);
            }
        });
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListUserListFragment.toolbarScrollAnimator_delegate$lambda$6(this.f$0);
            }
        });
        SingleItemAdapter<CuratedListUserSortOptionsView, SortOption> singleItemAdapterM2993of = companion.m2993of(CuratedListUserSortOptionsView.INSTANCE, single, new Function2() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CuratedListUserListFragment.userSortOptionAdapter$lambda$7(this.f$0, (CuratedListUserSortOptionsView) obj, (SortOption) obj2);
            }
        });
        singleItemAdapterM2993of.setData(null);
        this.userSortOptionAdapter = singleItemAdapterM2993of;
        this.anchorAdapter = SingleItemAdapter.Companion.ofUnit$default(companion, C20839R.layout.curated_list_item_recycler_view_anchor, (DiffUtil.ItemCallback) null, (Function1) null, 6, (Object) null);
        this.dividerAdapter = SingleItemAdapter.Companion.ofUnit$default(companion, C20839R.layout.include_list_header_divider, (DiffUtil.ItemCallback) null, (Function1) null, 6, (Object) null);
        this.loadingAdapter = SingleItemAdapter.Companion.ofUnit$default(companion, C20839R.layout.curated_list_loading_view, (DiffUtil.ItemCallback) null, (Function1) null, 6, (Object) null);
        this.emptyStateAdapter = companion.m2991of(C20839R.layout.curated_list_user_list_empty_view, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListFragment.emptyStateAdapter$lambda$9((String) obj);
            }
        }), new Function2() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CuratedListUserListFragment.emptyStateAdapter$lambda$11(this.f$0, (LinearLayout) obj, (String) obj2);
            }
        });
        this.disclosureAdapter = companion.m2991of(C20839R.layout.curated_list_disclosure_item, single, new Function2() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CuratedListUserListFragment.disclosureAdapter$lambda$12((View) obj, (CharSequence) obj2);
            }
        });
        this.futuresContractsDisclosureAdapter = companion.m2993of(new CuratedListUserListFragment3(this), single, new Function2() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CuratedListUserListFragment.futuresContractsDisclosureAdapter$lambda$13((ComposeView) obj, ((Boolean) obj2).booleanValue());
            }
        });
        this.editCallbacks = new EditCuratedListHeaderView.Callbacks() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$editCallbacks$1
            @Override // com.robinhood.android.lists.ui.userlist.EditCuratedListHeaderView.Callbacks
            public void onEmojiEditClick(UUID listId, String currentEmoji) {
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(currentEmoji, "currentEmoji");
                AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.this$0.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL_EDIT, AnalyticsStrings.BUTTON_LIST_DETAIL_EDIT_ICON_EMOJI, null, null, listId.toString(), this.this$0.curatedListDisplayName, null, null, 204, null);
                EmojiPickerBottomSheetFragment emojiPickerBottomSheetFragmentNewInstance = EmojiPickerBottomSheetFragment.INSTANCE.newInstance(currentEmoji);
                emojiPickerBottomSheetFragmentNewInstance.setTargetFragment(this.this$0, 85);
                FragmentManager parentFragmentManager = this.this$0.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                emojiPickerBottomSheetFragmentNewInstance.show(parentFragmentManager, "emojiPickerBottomSheet");
            }

            @Override // com.robinhood.android.lists.ui.userlist.EditCuratedListHeaderView.Callbacks
            public void onTitleChanged(String title) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.this$0.getDuxo().onTitleChanged(title);
            }

            @Override // com.robinhood.android.lists.ui.userlist.EditCuratedListHeaderView.Callbacks
            public void onTitleInputClicked(UUID listId) {
                Intrinsics.checkNotNullParameter(listId, "listId");
                AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.this$0.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL_EDIT, AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, null, null, listId.toString(), this.this$0.curatedListDisplayName, null, null, 204, null);
            }
        };
        this.duxo = OldDuxos.oldDuxo(this, CuratedListUserListDuxo.class);
        this.eventList = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListUserListFragment.eventList_delegate$lambda$14(this.f$0);
            }
        });
        this.useDesignSystemToolbar = true;
    }

    private final ViewGroup getStickyUserSortOptionsContainer() {
        return (ViewGroup) this.stickyUserSortOptionsContainer.getValue(this, $$delegatedProperties[0]);
    }

    private final CuratedListUserSortOptionsView getStickyUserSortOptionsView() {
        return (CuratedListUserSortOptionsView) this.stickyUserSortOptionsView.getValue(this, $$delegatedProperties[1]);
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue(this, $$delegatedProperties[2]);
    }

    private final CuratedListItemTouchHelperCallbacks getItemTouchHelperCallbacks() {
        return (CuratedListItemTouchHelperCallbacks) this.itemTouchHelperCallbacks.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListItemTouchHelperCallbacks itemTouchHelperCallbacks_delegate$lambda$0(CuratedListUserListFragment curatedListUserListFragment) {
        Context contextRequireContext = curatedListUserListFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        CuratedListAdapter curatedListAdapter = curatedListUserListFragment.curatedListAdapter;
        if (curatedListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListAdapter");
            curatedListAdapter = null;
        }
        return new CuratedListItemTouchHelperCallbacks(contextRequireContext, curatedListAdapter, new CuratedListUserListFragment5(curatedListUserListFragment), new CuratedListUserListFragment6(curatedListUserListFragment), new CuratedListUserListFragment7(curatedListUserListFragment), new CuratedListUserListFragment8(curatedListUserListFragment));
    }

    private final ItemTouchHelper getItemTouchHelper() {
        return (ItemTouchHelper) this.itemTouchHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ItemTouchHelper itemTouchHelper_delegate$lambda$1(CuratedListUserListFragment curatedListUserListFragment) {
        return new ItemTouchHelper(curatedListUserListFragment.getItemTouchHelperCallbacks());
    }

    private final LogOnceAnalytics getLogOnceAnalytics() {
        return (LogOnceAnalytics) this.logOnceAnalytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogOnceAnalytics logOnceAnalytics_delegate$lambda$2(CuratedListUserListFragment curatedListUserListFragment) {
        return new LogOnceAnalytics(curatedListUserListFragment.getAnalytics());
    }

    private final LogOnceEventLogger getLogOnceEventLogger() {
        return (LogOnceEventLogger) this.logOnceEventLogger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogOnceEventLogger logOnceEventLogger_delegate$lambda$3(CuratedListUserListFragment curatedListUserListFragment) {
        return new LogOnceEventLogger(curatedListUserListFragment.getEventLogger());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userListHeaderAdapter$lambda$4(CuratedListUserListHeaderView of, CuratedListUserListViewState state) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(state, "state");
        of.bind(state);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit headerEditAdapter$lambda$5(CuratedListUserListFragment curatedListUserListFragment, EditCuratedListHeaderView of, CuratedListUserListViewState state) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(state, "state");
        of.setCallbacks(curatedListUserListFragment.editCallbacks);
        of.bind(state);
        return Unit.INSTANCE;
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$6(CuratedListUserListFragment curatedListUserListFragment) {
        RhToolbar rhToolbar = curatedListUserListFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        return new ToolbarScrollAnimator(rhToolbar, curatedListUserListFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, true, false, (Float) null, 52, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userSortOptionAdapter$lambda$7(CuratedListUserListFragment curatedListUserListFragment, CuratedListUserSortOptionsView of, SortOption sortOption) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        of.setCallbacks(curatedListUserListFragment);
        of.bind(sortOption.getSortOrder());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object emptyStateAdapter$lambda$9(String byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit emptyStateAdapter$lambda$11(final CuratedListUserListFragment curatedListUserListFragment, LinearLayout of, final String listDisplayName) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(listDisplayName, "listDisplayName");
        View viewFindViewById = of.findViewById(C20839R.id.curated_list_empty_search_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        OnClickListeners.onClick(viewFindViewById, new Function0() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListUserListFragment.emptyStateAdapter$lambda$11$lambda$10(this.f$0, listDisplayName);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit emptyStateAdapter$lambda$11$lambda$10(CuratedListUserListFragment curatedListUserListFragment, String str) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(curatedListUserListFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_NEW_LIST, "list_item_search", null, null, ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) curatedListUserListFragment)).getListId().toString(), curatedListUserListFragment.curatedListDisplayName, null, null, 204, null);
        curatedListUserListFragment.launchSearchFragment(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit disclosureAdapter$lambda$12(View of, CharSequence disclosure) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        ((RhTextView) of.findViewById(C20839R.id.curated_list_disclosure_text)).setText(disclosure);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit futuresContractsDisclosureAdapter$lambda$13(ComposeView of, boolean z) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        of.setVisibility(z ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CuratedListUserListDuxo getDuxo() {
        return (CuratedListUserListDuxo) this.duxo.getValue();
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

    private final List getEventList() {
        return (List) this.eventList.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List eventList_delegate$lambda$14(CuratedListUserListFragment curatedListUserListFragment) {
        String string2 = ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) curatedListUserListFragment)).getListId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        List.OwnerType ownerType = List.OwnerType.USER;
        String str = curatedListUserListFragment.curatedListDisplayName;
        if (str == null) {
            str = "";
        }
        return new List(string2, str, ownerType, null, 8, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.robinhood.android.lists.ui.CuratedListAdapter] */
    /* JADX WARN: Type inference failed for: r13v1, types: [androidx.recyclerview.widget.RecyclerView$Adapter[]] */
    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        this.headerEditAdapter.setHasStableIds(true);
        DefaultConstructorMarker defaultConstructorMarker = null;
        CuratedListAdapter curatedListAdapter = new CuratedListAdapter(this, false, 2, defaultConstructorMarker);
        this.curatedListAdapter = curatedListAdapter;
        curatedListAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment.onCreate.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int positionStart, int itemCount) {
                VisibleItemsManager visibleItemsManager = CuratedListUserListFragment.this.visibleItemsManager;
                if (visibleItemsManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
                    visibleItemsManager = null;
                }
                visibleItemsManager.update();
            }
        });
        SingleItemAdapter<View, Unit> singleItemAdapter = this.anchorAdapter;
        SingleItemAdapter<CuratedListUserListHeaderView, CuratedListUserListViewState> singleItemAdapter2 = this.userListHeaderAdapter;
        SingleItemAdapter<EditCuratedListHeaderView, CuratedListUserListViewState> singleItemAdapter3 = this.headerEditAdapter;
        SingleItemAdapter<CuratedListUserSortOptionsView, SortOption> singleItemAdapter4 = this.userSortOptionAdapter;
        SingleItemAdapter<View, Unit> singleItemAdapter5 = this.dividerAdapter;
        SingleItemAdapter<FrameLayout, Unit> singleItemAdapter6 = this.loadingAdapter;
        SingleItemAdapter<LinearLayout, String> singleItemAdapter7 = this.emptyStateAdapter;
        ?? r11 = this.curatedListAdapter;
        if (r11 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListAdapter");
        } else {
            defaultConstructorMarker = r11;
        }
        this.compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{singleItemAdapter, singleItemAdapter2, singleItemAdapter3, singleItemAdapter4, singleItemAdapter5, singleItemAdapter6, singleItemAdapter7, defaultConstructorMarker, this.futuresContractsDisclosureAdapter, this.disclosureAdapter});
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = getRecyclerView();
        final FragmentActivity activity = getActivity();
        recyclerView.setLayoutManager(new AccurateLinearLayoutManager(activity) { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$onViewCreated$1$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        });
        recyclerView.setHasFixedSize(true);
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator);
        itemAnimator.setChangeDuration(0L);
        CompositeAdapter compositeAdapter = this.compositeAdapter;
        CuratedListAdapter curatedListAdapter = null;
        if (compositeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("compositeAdapter");
            compositeAdapter = null;
        }
        bindAdapter(recyclerView, compositeAdapter);
        RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
        Intrinsics.checkNotNull(layoutManager);
        VisibleItemsManager<UUID, CuratedListEligible> visibleItemsManager = new VisibleItemsManager<>(layoutManager, new Function0() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(CuratedListUserListFragment.onViewCreated$lambda$17(this.f$0));
            }
        }, new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListFragment.onViewCreated$lambda$18(this.f$0, ((Integer) obj).intValue());
            }
        }, new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListFragment.onViewCreated$lambda$19((CuratedListEligible) obj);
            }
        });
        this.visibleItemsManager = visibleItemsManager;
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(visibleItemsManager.getItemAppearances()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListFragment.onViewCreated$lambda$20(this.f$0, (CuratedListEligible) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RxRecyclerView.scrollEvents(getRecyclerView()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListFragment.onViewCreated$lambda$21(this.f$0, (RecyclerViewScrollEvent) obj);
            }
        });
        getItemTouchHelper().attachToRecyclerView(getRecyclerView());
        getStickyUserSortOptionsView().setCallbacks(this);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C209347(this));
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$onViewCreated$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((CuratedListUserListViewState) it).getViewMode());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((CuratedListUserListFragment$onViewCreated$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ScopedObservable scopedObservableBind$default = LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null);
        CuratedListAdapter curatedListAdapter2 = this.curatedListAdapter;
        if (curatedListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListAdapter");
        } else {
            curatedListAdapter = curatedListAdapter2;
        }
        scopedObservableBind$default.subscribeKotlin(new C209359(curatedListAdapter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onViewCreated$lambda$17(CuratedListUserListFragment curatedListUserListFragment) {
        CompositeAdapter compositeAdapter = curatedListUserListFragment.compositeAdapter;
        if (compositeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("compositeAdapter");
            compositeAdapter = null;
        }
        return compositeAdapter.getSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListEligible onViewCreated$lambda$18(CuratedListUserListFragment curatedListUserListFragment, int i) {
        CompositeAdapter compositeAdapter = curatedListUserListFragment.compositeAdapter;
        CuratedListAdapter curatedListAdapter = null;
        if (compositeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("compositeAdapter");
            compositeAdapter = null;
        }
        CuratedListAdapter curatedListAdapter2 = curatedListUserListFragment.curatedListAdapter;
        if (curatedListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListAdapter");
            curatedListAdapter2 = null;
        }
        int firstItemPositionOf = compositeAdapter.getFirstItemPositionOf(curatedListAdapter2);
        int i2 = i - firstItemPositionOf;
        if (firstItemPositionOf > i) {
            return null;
        }
        CuratedListAdapter curatedListAdapter3 = curatedListUserListFragment.curatedListAdapter;
        if (curatedListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListAdapter");
            curatedListAdapter3 = null;
        }
        if (i2 >= curatedListAdapter3.getSize()) {
            return null;
        }
        CuratedListAdapter curatedListAdapter4 = curatedListUserListFragment.curatedListAdapter;
        if (curatedListAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListAdapter");
        } else {
            curatedListAdapter = curatedListAdapter4;
        }
        return curatedListAdapter.getItem(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID onViewCreated$lambda$19(CuratedListEligible VisibleItemsManager) {
        Intrinsics.checkNotNullParameter(VisibleItemsManager, "$this$VisibleItemsManager");
        return VisibleItemsManager.getCuratedListItem().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$20(CuratedListUserListFragment curatedListUserListFragment, CuratedListEligible it) {
        Intrinsics.checkNotNullParameter(it, "it");
        curatedListUserListFragment.logListItemAppear(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$21(CuratedListUserListFragment curatedListUserListFragment, RecyclerViewScrollEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        VisibleItemsManager<UUID, CuratedListEligible> visibleItemsManager = curatedListUserListFragment.visibleItemsManager;
        if (visibleItemsManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager = null;
        }
        visibleItemsManager.update();
        curatedListUserListFragment.updateStickySortOptionView();
        curatedListUserListFragment.getToolbarScrollAnimator().dispatchScroll(curatedListUserListFragment.getRecyclerView());
        return Unit.INSTANCE;
    }

    /* compiled from: CuratedListUserListFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$onViewCreated$7 */
    /* synthetic */ class C209347 extends FunctionReferenceImpl implements Function1<CuratedListUserListViewState, Unit> {
        C209347(Object obj) {
            super(1, obj, CuratedListUserListFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CuratedListUserListViewState curatedListUserListViewState) {
            invoke2(curatedListUserListViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CuratedListUserListViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CuratedListUserListFragment) this.receiver).setViewState(p0);
        }
    }

    /* compiled from: CuratedListUserListFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$onViewCreated$9 */
    /* synthetic */ class C209359 extends FunctionReferenceImpl implements Function1<CuratedListViewMode, Unit> {
        C209359(Object obj) {
            super(1, obj, CuratedListAdapter.class, "setViewMode", "setViewMode(Lcom/robinhood/models/db/CuratedListViewMode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CuratedListViewMode curatedListViewMode) {
            invoke2(curatedListViewMode);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CuratedListViewMode p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CuratedListAdapter) this.receiver).setViewMode(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) this)).getShowSurvey()) {
            getUserLeapManager().presentSurveyIfNecessary(this, Survey.CREATE_LIST);
        }
        getToolbarScrollAnimator().dispatchScroll(getRecyclerView());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getLogOnceAnalytics().reset();
        getLogOnceEventLogger().reset();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C20839R.menu.menu_curated_list, menu);
        this.menuItemAddToList = menu.findItem(C20839R.id.curated_list_action_add_to_list);
        this.menuItemLoading = menu.findItem(C20839R.id.curated_list_loading);
        this.menuItemOverflow = menu.findItem(C20839R.id.curated_list_action_overflow);
        this.menuItemDone = menu.findItem(C20839R.id.curated_list_done);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == C20839R.id.curated_list_action_add_to_list) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, "list_item_search", null, null, ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) this)).getListId().toString(), this.curatedListDisplayName, null, null, 204, null);
            String str = this.curatedListDisplayName;
            Intrinsics.checkNotNull(str);
            launchSearchFragment(str);
            return true;
        }
        if (itemId == C20839R.id.curated_list_loading) {
            return true;
        }
        if (itemId == C20839R.id.curated_list_action_overflow) {
            AnalyticsLogger analytics = getAnalytics();
            Companion companion = INSTANCE;
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analytics, AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, AnalyticsStrings.BUTTON_LIST_EDIT, null, null, ((CuratedListKey.UserList) companion.getArgs((Fragment) this)).getListId().toString(), this.curatedListDisplayName, null, null, 204, null);
            CuratedListMenuOptionsBottomSheetFragment.Companion companion2 = CuratedListMenuOptionsBottomSheetFragment.INSTANCE;
            UUID listId = ((CuratedListKey.UserList) companion.getArgs((Fragment) this)).getListId();
            String str2 = this.curatedListDisplayName;
            Intrinsics.checkNotNull(str2);
            CuratedListMenuOptionsBottomSheetFragment curatedListMenuOptionsBottomSheetFragmentNewInstance = companion2.newInstance(this, listId, str2, ApiCuratedList.OwnerType.CUSTOM);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            curatedListMenuOptionsBottomSheetFragmentNewInstance.show(parentFragmentManager, "overflowCuratedListBottomSheet");
            return true;
        }
        if (itemId == C20839R.id.curated_list_done) {
            Observable<CuratedListUserListViewState> observableTake = getDuxo().getStates().take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListUserListFragment.onOptionsItemSelected$lambda$23(this.f$0, (CuratedListUserListViewState) obj);
                }
            });
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOptionsItemSelected$lambda$23(CuratedListUserListFragment curatedListUserListFragment, CuratedListUserListViewState curatedListUserListViewState) {
        Intrinsics.checkNotNull(curatedListUserListViewState);
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(curatedListUserListFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL_EDIT, "done", curatedListUserListFragment.getListEditEventButtonDescription(curatedListUserListViewState), null, ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) curatedListUserListFragment)).getListId().toString(), curatedListUserListFragment.curatedListDisplayName, null, null, 200, null);
        curatedListUserListFragment.getDuxo().sendEdits();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lists.ui.userlist.CuratedListMenuOptionsBottomSheetFragment.Callbacks
    public void onEditClicked() {
        getDuxo().enterEditMode();
    }

    @Override // com.robinhood.android.lists.ui.listitemsort.CuratedListUserSortOptionsView.Callbacks
    public void onSortOptionChipClicked() {
        showSortOrderBottomSheet();
    }

    @Override // com.robinhood.shared.portfolio.lists.p391ui.sort.CuratedListSortCallbacks
    public void onSortOptionSelected(SortOption sortOption) {
        String str;
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        if (sortOption.getSortDirection() == ApiCuratedList.SortDirection.EMPTY) {
            str = "custom";
        } else {
            str = SortOrders.getAnalyticsString(sortOption.getSortOrder()) + "_" + SortDirections.getAnalyticsString(sortOption.getSortDirection());
        }
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LDP_SORT, str, null, null, ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) this)).getListId().toString(), this.curatedListDisplayName, "custom_list", null, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, null);
        getDuxo().sortList(sortOption);
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onInstrumentRowClicked(final UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, "view_sdp", instrumentId.toString(), null, ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) this)).getListId().toString(), this.curatedListDisplayName, "custom_list", null, 136, null);
        String string2 = instrumentId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.VIEW_ASSET_DETAIL_PAGE, new Screen(Screen.Name.USER_LIST_DETAIL_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.LIST_ASSET_ROW, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string2, Asset.AssetType.INSTRUMENT, null, null, 12, null), getEventList(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -49153, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        Observable observableTake = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment.onInstrumentRowClicked.1
            @Override // io.reactivex.functions.Function
            public final java.util.List<UUID> apply(CuratedListUserListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCuratedListInstrumentItemsIds();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListFragment.onInstrumentRowClicked$lambda$24(this.f$0, instrumentId, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInstrumentRowClicked$lambda$24(CuratedListUserListFragment curatedListUserListFragment, UUID uuid, java.util.List list) {
        Navigator navigator = curatedListUserListFragment.getNavigator();
        Context contextRequireContext = curatedListUserListFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intrinsics.checkNotNull(list);
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.EquityInstrumentDetail(uuid, list, ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) curatedListUserListFragment)).getAccountNumber(), InstrumentDetailSource.USER_LIST_DETAIL, false, 16, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onFuturesRowClicked(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new FuturesDetailFragmentKey.ByContractId(contractId, new Screen(Screen.Name.USER_LIST_DETAIL_PAGE, null, null, null, 14, null), null, 4, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onIndexRowClicked(UUID indexId) {
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new IndexDetailPageFragmentKey(indexId, (String) null, IndexDetailPageFragmentKey2.UserList.INSTANCE), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onCurrencyRowClicked(final UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, "view_cdp", currencyPairId.toString(), null, ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) this)).getListId().toString(), this.curatedListDisplayName, "custom_list", null, 136, null);
        String string2 = currencyPairId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.VIEW_ASSET_DETAIL_PAGE, new Screen(Screen.Name.USER_LIST_DETAIL_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.LIST_ASSET_ROW, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string2, Asset.AssetType.CURRENCY_PAIR, null, null, 12, null), getEventList(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -49153, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        Observable observableTake = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment.onCurrencyRowClicked.1
            @Override // io.reactivex.functions.Function
            public final java.util.List<UUID> apply(CuratedListUserListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCuratedListCurrencyPairIds();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListFragment.onCurrencyRowClicked$lambda$25(this.f$0, currencyPairId, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCurrencyRowClicked$lambda$25(CuratedListUserListFragment curatedListUserListFragment, UUID uuid, java.util.List list) {
        Navigator navigator = curatedListUserListFragment.getNavigator();
        Context contextRequireContext = curatedListUserListFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intrinsics.checkNotNull(list);
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new CryptoDetailFragmentKey(uuid, list, false, null, null, null, 60, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onQuoteClicked() {
        AnalyticsLogger analytics = getAnalytics();
        Companion companion = INSTANCE;
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analytics, AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, AnalyticsStrings.BUTTON_LIST_EDIT_LISTS_DETAIL_PAGE_DISPLAY_DATA, null, null, ((CuratedListKey.UserList) companion.getArgs((Fragment) this)).getListId().toString(), this.curatedListDisplayName, "custom_list", null, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, null);
        ViewModeSelectionBottomSheetFragment viewModeSelectionBottomSheetFragment = (ViewModeSelectionBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(ViewModeSelectionBottomSheetFragment.INSTANCE, new ViewModeSelectionBottomSheetFragment.Args(ViewModeSelectionType.CuratedList.INSTANCE, ((CuratedListKey.UserList) companion.getArgs((Fragment) this)).getListId(), this.curatedListDisplayName), this, 0, 4, null);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        viewModeSelectionBottomSheetFragment.show(parentFragmentManager, "viewModeBottomSheet");
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onFuturesQuoteClicked() {
        onQuoteClicked();
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onInstrumentRowRemoved(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL_EDIT, AnalyticsStrings.BUTTON_LIST_REMOVE_ITEM_FROM_LIST, instrumentId.toString(), null, ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) this)).getListId().toString(), this.curatedListDisplayName, null, null, 200, null);
        getDuxo().removeInstrument(instrumentId);
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onCryptoRowRemoved(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL_EDIT, AnalyticsStrings.BUTTON_LIST_REMOVE_ITEM_FROM_LIST, currencyPairId.toString(), null, ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) this)).getListId().toString(), this.curatedListDisplayName, null, null, 200, null);
        getDuxo().removeCryptoItem(currencyPairId);
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onFuturesRowRemoved(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL_EDIT, AnalyticsStrings.BUTTON_LIST_REMOVE_ITEM_FROM_LIST, contractId.toString(), null, ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) this)).getListId().toString(), this.curatedListDisplayName, null, null, 200, null);
        getDuxo().removeFuturesContractItem(contractId);
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onReorderPressed(View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = getRecyclerView().findContainingViewHolder(itemView);
        if (viewHolderFindContainingViewHolder == null) {
            return;
        }
        getItemTouchHelper().startDrag(viewHolderFindContainingViewHolder);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 85 && resultCode == -1) {
            Intrinsics.checkNotNull(data);
            getDuxo().setEditedEmoji(data.getStringExtra(EmojiPickerBottomSheetFragment.UPDATED_EMOJI_EXTRA));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (this.isEditingWithChanges) {
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setTitle(C20839R.string.discard_edits_dialog_title, new Object[0]).setMessage(C20839R.string.discard_edits_dialog_message, new Object[0]).setNegativeButton(C20839R.string.discard_edits_dialog_discard, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, "discard_edits", false, 4, null);
            return true;
        }
        if (this.isEditing) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL_EDIT, "cancel", null, null, ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) this)).getListId().toString(), this.curatedListDisplayName, null, null, 204, null);
            getDuxo().exitEditMode();
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LDP_DISCARD_CHANGES, "cancel", null, null, ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) this)).getListId().toString(), this.curatedListDisplayName, null, null, 204, null);
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LDP_DISCARD_CHANGES, AnalyticsStrings.BUTTON_LIST_DISCARD, null, null, ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) this)).getListId().toString(), this.curatedListDisplayName, null, null, 204, null);
        getDuxo().exitEditMode();
        return true;
    }

    @Override // com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment.Callbacks
    public void onCuratedListViewModeChange(SecurityViewMode viewMode, UUID listId, String listDisplayName) {
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(listDisplayName, "listDisplayName");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, SecurityViewModes.getAnalyticsButtonTitle(viewMode), null, null, listId.toString(), listDisplayName, "custom_list", null, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return SCREEN_NAME_DEFAULT;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: getScreenDescription */
    public String getProfileId() {
        return "custom_list";
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getEntityId() {
        return ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) this)).getListId().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(CuratedListUserListViewState state) {
        UiEvent<Unit> deletedListEvent = state.getDeletedListEvent();
        if ((deletedListEvent != null ? deletedListEvent.consume() : null) != null) {
            requireActivity().onBackPressed();
            return;
        }
        if (state.getCuratedList() != null) {
            RhToolbar rhToolbar = getRhToolbar();
            Intrinsics.checkNotNull(rhToolbar);
            rhToolbar.setTitle(state.getToolbarTitle());
            this.curatedListDisplayName = state.getCuratedList().getDisplayName();
            this.isEditing = state.isEditing();
            this.isEditingWithChanges = state.getIsEditingWithChanges();
            bindLoading(state);
            bindHeader(state);
            bindEditHeader(state);
            bindUserSortOption(state);
            bindEmptyState(state);
            bindCuratedListItems(state);
            bindDisclosureText(state);
            bindFuturesContractsDisclosure(state);
            updateMenuItems(state);
            consumeUiEvents(state);
        }
    }

    private final void bindLoading(CuratedListUserListViewState state) {
        this.loadingAdapter.setData(state.isLoadingListItems() ? Unit.INSTANCE : null);
    }

    private final void bindHeader(CuratedListUserListViewState state) {
        SingleItemAdapter<CuratedListUserListHeaderView, CuratedListUserListViewState> singleItemAdapter = this.userListHeaderAdapter;
        if (!state.getShowHeader()) {
            state = null;
        }
        singleItemAdapter.setData(state);
    }

    private final void bindEditHeader(CuratedListUserListViewState state) {
        SingleItemAdapter<EditCuratedListHeaderView, CuratedListUserListViewState> singleItemAdapter = this.headerEditAdapter;
        if (!state.getShowHeaderEdit()) {
            state = null;
        }
        singleItemAdapter.setData(state);
    }

    private final void bindUserSortOption(CuratedListUserListViewState state) {
        this.userSortOptionAdapter.setData(state.getShowUserSortOption() ? state.getCurrentSortOption() : null);
        if (state.getCurrentSortOption() != null) {
            getStickyUserSortOptionsView().bind(state.getCurrentSortOption().getSortOrder());
        }
        updateStickySortOptionView();
    }

    private final void bindCuratedListItems(CuratedListUserListViewState state) {
        java.util.List<CuratedListEligible> curatedListEligibleItems;
        CuratedListAdapter curatedListAdapter = this.curatedListAdapter;
        CuratedListAdapter curatedListAdapter2 = null;
        if (curatedListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListAdapter");
            curatedListAdapter = null;
        }
        curatedListAdapter.setInEditMode(state.isEditing());
        getItemTouchHelperCallbacks().setEnableLongPress(!state.isEditing());
        getItemTouchHelperCallbacks().setEnableSwipeToBuy(state.isSwipeToBuyEnabled());
        if (state.isLoadingListItems()) {
            curatedListEligibleItems = CollectionsKt.emptyList();
        } else {
            curatedListEligibleItems = state.getCuratedListEligibleItems();
        }
        CuratedListAdapter curatedListAdapter3 = this.curatedListAdapter;
        if (curatedListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListAdapter");
        } else {
            curatedListAdapter2 = curatedListAdapter3;
        }
        curatedListAdapter2.submitList(curatedListEligibleItems);
        UUID pendingBuyInstrumentId = state.getPendingBuyInstrumentId();
        if (pendingBuyInstrumentId != null) {
            if (state.isBuyEnabled()) {
                Navigator navigator = getNavigator();
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new EquityOrderActivityIntentKey.WithId(pendingBuyInstrumentId, EquityOrderSide.BUY, EquityOrderFlowSource.WATCHLIST_ROW, null, null, null, null, false, false, 504, null), null, false, null, null, 60, null);
            } else {
                String buyErrorMessage = state.getBuyErrorMessage();
                RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext2).setUseDesignSystemOverlay(true).setTitle(C20839R.string.watchlist_buy_error_alert_title, new Object[0]).setMessage(buyErrorMessage).setPositiveButton(C11048R.string.general_label_okay, new Object[0]);
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "watchlist_swipe_to_trade_alert", false, 4, null);
                EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.USER_LIST_DETAIL_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.ALERT, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, "watchlist_swipe_to_trade_alert", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), 9, null);
            }
            getDuxo().clearPendingBuy();
        }
    }

    private final void bindEmptyState(CuratedListUserListViewState state) {
        String displayName;
        SingleItemAdapter<LinearLayout, String> singleItemAdapter = this.emptyStateAdapter;
        if (state.getShowEmptyState()) {
            CuratedList curatedList = state.getCuratedList();
            Intrinsics.checkNotNull(curatedList);
            displayName = curatedList.getDisplayName();
        } else {
            displayName = null;
        }
        singleItemAdapter.setData(displayName);
        getItemTouchHelperCallbacks().setEmptyList(state.getShowEmptyState());
    }

    private final void consumeUiEvents(CuratedListUserListViewState state) {
        Throwable thConsume;
        String string2;
        UiEvent<Throwable> updatedListErrorEvent = state.getUpdatedListErrorEvent();
        if (updatedListErrorEvent == null || (thConsume = updatedListErrorEvent.consume()) == null) {
            return;
        }
        CuratedListAdapter curatedListAdapter = this.curatedListAdapter;
        if (curatedListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListAdapter");
            curatedListAdapter = null;
        }
        curatedListAdapter.notifyDataSetChanged();
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(thConsume);
        GenericErrorResponse genericErrorResponse = errorResponseExtractErrorResponse instanceof GenericErrorResponse ? (GenericErrorResponse) errorResponseExtractErrorResponse : null;
        if (genericErrorResponse == null || (string2 = genericErrorResponse.getDisplayErrorText()) == null) {
            string2 = getString(C11048R.string.general_error_unable_to_save_changes);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Snackbars.show(fragmentActivityRequireActivity, string2, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchSearchFragment(String displayName) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new SearchFragmentKey(((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) this)).getListId(), displayName, null, null, null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    private final void updateMenuItems(CuratedListUserListViewState state) {
        MenuItem menuItem;
        MenuItem menuItem2;
        MenuItem menuItem3;
        MenuItem menuItem4 = this.menuItemAddToList;
        if (menuItem4 == null || (menuItem = this.menuItemLoading) == null || (menuItem2 = this.menuItemOverflow) == null || (menuItem3 = this.menuItemDone) == null) {
            return;
        }
        menuItem4.setVisible(state.getShowAddToListMenuOption());
        menuItem.setVisible(state.getShowLoadingListMenuOption());
        menuItem2.setVisible(state.getShowOverflowMenuOption());
        menuItem3.setVisible(state.getShowDoneButton());
        Object icon = menuItem.getIcon();
        Intrinsics.checkNotNull(icon, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
        Animatable animatable = (Animatable) icon;
        if (state.getShowLoadingListMenuOption()) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    private final void bindDisclosureText(CuratedListUserListViewState state) {
        CharSequence disclosure$default;
        SingleItemAdapter<View, CharSequence> singleItemAdapter = this.disclosureAdapter;
        if (state.getShowDisclosure()) {
            DisclosureUtil disclosureUtil = DisclosureUtil.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RichText disclosure = state.getDisclosure();
            Intrinsics.checkNotNull(disclosure);
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            disclosure$default = DisclosureUtil.getDisclosure$default(disclosureUtil, contextRequireContext, RichTexts.toSpannableString$default(disclosure, contextRequireContext2, null, false, null, 14, null), state.getCanAppendToggleText(), state.getExpandDisclosure(), null, null, new Function0() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CuratedListUserListFragment.bindDisclosureText$lambda$28(this.f$0);
                }
            }, 48, null);
        } else {
            disclosure$default = null;
        }
        singleItemAdapter.setData(disclosure$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDisclosureText$lambda$28(CuratedListUserListFragment curatedListUserListFragment) {
        curatedListUserListFragment.getDuxo().toggleDisclosureState();
        return Unit.INSTANCE;
    }

    private final void bindFuturesContractsDisclosure(CuratedListUserListViewState state) {
        this.futuresContractsDisclosureAdapter.setData(state.getHasFuturesContracts() && !state.isLoadingListItems() && !state.getShowEmptyState() ? Boolean.TRUE : null);
    }

    private final void updateStickySortOptionView() {
        View viewFindViewById = getRecyclerView().findViewById(C20839R.id.curated_list_sort_option_view);
        getStickyUserSortOptionsContainer().setVisibility(this.userSortOptionAdapter.getData() != null && (viewFindViewById == null || viewFindViewById.getTop() <= 0) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWatchListItemBuy(UUID instrumentId) {
        logEquityItemSwipeCompleted(instrumentId);
        CuratedListUserListDuxo duxo = getDuxo();
        String accountNumber = ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) this)).getAccountNumber();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        duxo.onWatchListItemBuy(instrumentId, accountNumber, contextRequireContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void synchronizeListPositionChange(UUID movedItemId, int newGlobalPosition) {
        AnalyticsLogger.DefaultImpls.logUserAction$default(getAnalytics(), AnalyticsStrings.USER_ACTION_MOVE_LIST_DETAIL_LIST_ITEM, "drag", null, null, 12, null);
        CompositeAdapter compositeAdapter = this.compositeAdapter;
        CuratedListAdapter curatedListAdapter = null;
        if (compositeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("compositeAdapter");
            compositeAdapter = null;
        }
        CuratedListAdapter curatedListAdapter2 = this.curatedListAdapter;
        if (curatedListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListAdapter");
        } else {
            curatedListAdapter = curatedListAdapter2;
        }
        getDuxo().synchronizeListPositionChange(movedItemId, newGlobalPosition - compositeAdapter.getFirstItemPositionOf(curatedListAdapter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void synchronizeListDeleteItem(UUID itemId, Asset.AssetType assetType) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, AnalyticsStrings.BUTTON_LIST_REMOVE_ITEM_FROM_LIST, itemId.toString(), null, ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) this)).getListId().toString(), this.curatedListDisplayName, null, null, 200, null);
        String string2 = itemId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logSwipe$default(getEventLogger(), UserInteractionEventData.Action.REMOVE_FROM_LIST, new Screen(Screen.Name.USER_LIST_DETAIL_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.LIST_ASSET_ROW, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string2, assetType, null, null, 12, null), getEventList(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -49153, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        getDuxo().synchronizeListDeleteItem(itemId);
    }

    private final String getListEditEventButtonDescription(CuratedListUserListViewState state) {
        if ((state.getIsEditingWithChanges() ? this : null) == null) {
            return null;
        }
        CuratedList curatedList = state.getCuratedList();
        Intrinsics.checkNotNull(curatedList);
        Sequence sequenceSequenceOf = SequencesKt.sequenceOf(new String[0]);
        if (state.getEditedTitle() != null && !Intrinsics.areEqual(curatedList.getDisplayName(), state.getEditedTitle())) {
            sequenceSequenceOf = SequencesKt.plus((Sequence<? extends String>) sequenceSequenceOf, AnalyticsStrings.BUTTON_DESCRIPTION_LIST_LIST_NAME);
        }
        if (state.getEditedEmoji() != null && !Intrinsics.areEqual(curatedList.getIconEmoji(), state.getEditedEmoji())) {
            sequenceSequenceOf = SequencesKt.plus((Sequence<? extends String>) sequenceSequenceOf, AnalyticsStrings.BUTTON_DESCRIPTION_LIST_EMOJI);
        }
        if (!state.getRemovedItems().isEmpty()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(AnalyticsStrings.BUTTON_DESCRIPTION_LIST_REMOVED_ITEMS, Arrays.copyOf(new Object[]{Integer.valueOf(state.getRemovedItems().size())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            sequenceSequenceOf = SequencesKt.plus((Sequence<? extends String>) sequenceSequenceOf, str);
        }
        return SequencesKt.joinToString$default(sequenceSequenceOf, ",", null, null, 0, null, null, 62, null);
    }

    private final void showSortOrderBottomSheet() {
        Observable<CuratedListUserListViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        Observable<R> map = observableTake.map(new Function() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$showSortOrderBottomSheet$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((CuratedListUserListViewState) it).getCurrentSortOption());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C20930xaf3a7d80<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.filterIsPresent(map)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListFragment$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListFragment.showSortOrderBottomSheet$lambda$32(this.f$0, (SortOption) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSortOrderBottomSheet$lambda$32(CuratedListUserListFragment curatedListUserListFragment, SortOption sortOption) {
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        AnalyticsLogger analytics = curatedListUserListFragment.getAnalytics();
        Companion companion = INSTANCE;
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analytics, AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, AnalyticsStrings.BUTTON_LIST_SORT, null, null, ((CuratedListKey.UserList) companion.getArgs((Fragment) curatedListUserListFragment)).getListId().toString(), curatedListUserListFragment.curatedListDisplayName, "custom_list", null, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, null);
        CuratedListSortItemsBottomSheetFragment.Companion companion2 = CuratedListSortItemsBottomSheetFragment.INSTANCE;
        UUID listId = ((CuratedListKey.UserList) companion.getArgs((Fragment) curatedListUserListFragment)).getListId();
        String str = curatedListUserListFragment.curatedListDisplayName;
        Intrinsics.checkNotNull(str);
        CuratedListSortItemsBottomSheetFragment curatedListSortItemsBottomSheetFragment = (CuratedListSortItemsBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(companion2, new CuratedListSortItemsBottomSheetFragment.Args(sortOption, listId, str, "custom_list", false), curatedListUserListFragment, 0, 4, null);
        FragmentManager parentFragmentManager = curatedListUserListFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        curatedListSortItemsBottomSheetFragment.show(parentFragmentManager, "listItemSortBottomSheet");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logEquityItemSwipeInitiated(UUID instrumentId) {
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SWIPE_INITIATED;
        Screen screen = new Screen(Screen.Name.USER_LIST_DETAIL_PAGE, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.LIST_ASSET_ROW, null, null, 6, null);
        String string2 = instrumentId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Asset asset = new Asset(string2, null, null, null, 14, null);
        String accountNumber = ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) this)).getAccountNumber();
        EventLogger.DefaultImpls.logSwipe$default(eventLogger, action, screen, component, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, asset, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, accountNumber != null ? new BrokerageAccountContext(null, accountNumber, null, null, false, false, null, null, null, null, 1021, null) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, PositionsInstrumentType.EQUITY, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -257, -8193, -1, 16383, null), false, 40, null);
    }

    private final void logEquityItemSwipeCompleted(UUID instrumentId) {
        EventLogger eventLogger = getEventLogger();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SWIPE_COMPLETED;
        String string2 = instrumentId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Asset asset = new Asset(string2, null, null, null, 14, null);
        String accountNumber = ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) this)).getAccountNumber();
        EventLogger.DefaultImpls.logSwipe$default(eventLogger, action, null, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, asset, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, accountNumber != null ? new BrokerageAccountContext(null, accountNumber, null, null, false, false, null, null, null, null, 1021, null) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, PositionsInstrumentType.EQUITY, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -257, -8193, -1, 16383, null), false, 46, null);
    }

    private final void logListItemAppear(CuratedListEligible item) {
        String str;
        Asset.AssetType assetType;
        String string2 = item.getCuratedListItem().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        boolean z = item instanceof InstrumentCuratedListEligible;
        if (z) {
            str = "view_sdp";
        } else if (item instanceof CryptoCuratedListEligible) {
            str = "view_cdp";
        } else if (item instanceof OptionStrategyCuratedListEligible) {
            str = "view_odp";
        } else if (item instanceof FuturesCuratedListEligible) {
            str = AnalyticsStrings.BUTTON_LIST_VIEW_FUTURES_DETAIL;
        } else {
            if (!(item instanceof IndexCuratedListEligible)) {
                throw new NoWhenBranchMatchedException();
            }
            str = AnalyticsStrings.BUTTON_LIST_VIEW_INDEX_DETAIL;
        }
        LogOnceAnalytics.logButtonGroupAppear$default(getLogOnceAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, str, string2, string2, null, ((CuratedListKey.UserList) INSTANCE.getArgs((Fragment) this)).getListId().toString(), this.curatedListDisplayName, "custom_list", 16, null);
        if (z) {
            assetType = Asset.AssetType.INSTRUMENT;
        } else if (item instanceof CryptoCuratedListEligible) {
            assetType = Asset.AssetType.CURRENCY_PAIR;
        } else if (item instanceof OptionStrategyCuratedListEligible) {
            assetType = Asset.AssetType.OPTIONS_CONTRACT;
        } else if (item instanceof FuturesCuratedListEligible) {
            assetType = Asset.AssetType.FUTURES;
        } else {
            if (!(item instanceof IndexCuratedListEligible)) {
                throw new NoWhenBranchMatchedException();
            }
            assetType = Asset.AssetType.INDEXES;
        }
        getLogOnceEventLogger().logAppear(string2, UserInteractionEventData.Action.VIEW_ASSET_DETAIL_PAGE, new Screen(Screen.Name.USER_LIST_DETAIL_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.LIST_ASSET_ROW, null, null, 6, null), new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string2, assetType, null, null, 12, null), getEventList(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -49153, -1, -1, -1, -1, -1, 16383, null));
    }

    /* compiled from: CuratedListUserListFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/common/contracts/CuratedListKey$UserList;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListFragment;", "<init>", "()V", "EMOJI_REQUEST_CODE", "", "SCREEN_NAME_DEFAULT", "", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<CuratedListKey.UserList>, FragmentWithArgsCompanion<CuratedListUserListFragment, CuratedListKey.UserList> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CuratedListKey.UserList getArgs(CuratedListUserListFragment curatedListUserListFragment) {
            return (CuratedListKey.UserList) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, curatedListUserListFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CuratedListUserListFragment newInstance(CuratedListKey.UserList userList) {
            return (CuratedListUserListFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, userList);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CuratedListUserListFragment curatedListUserListFragment, CuratedListKey.UserList userList) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, curatedListUserListFragment, userList);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(CuratedListKey.UserList key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance((Parcelable) key);
        }
    }
}
