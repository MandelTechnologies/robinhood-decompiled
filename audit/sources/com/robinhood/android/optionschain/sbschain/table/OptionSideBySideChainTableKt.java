package com.robinhood.android.optionschain.sbschain.table;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
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
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotLongState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.optionsstring.sbschain.OptionSideBySideChainMetricStrings;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState2;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState3;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState4;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState5;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState7;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainEvent;
import com.robinhood.android.optionschain.sbschain.TableHighlightPhase;
import com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo;
import com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableEvent;
import com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt;
import com.robinhood.android.optionschain.sbschain.table.TableCellState;
import com.robinhood.android.optionschain.sbschain.table.TableRowState;
import com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget;
import com.robinhood.android.optionschain.sbschain.table.gestures.OptionLegBundlesToReplace;
import com.robinhood.android.optionschain.view.OptionChainTooltipBanner3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionSideBySideChainMetric;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.Range2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.Instant;

/* compiled from: OptionSideBySideChainTable.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0099\u0004\u0010=\u001a\u00020\u001e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2&\u0010 \u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u001e0\u001cj\u0002`\u001f2&\u0010!\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u001e0\u001cj\u0002`\u001f2*\u0010\"\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001cj\u0004\u0018\u0001`\u001f2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00072\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0(2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u001e0(2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001e0,2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001e0,2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001e0,2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001e0(2\u0006\u00102\u001a\u00020\u00072\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u001e0(2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0(2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001e0,2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001e0(2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001e0(2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u001e0(2\b\b\u0002\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\b=\u0010>\u001aA\u0010I\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020#2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020?2\u0006\u0010D\u001a\u00020?2\b\b\u0002\u0010F\u001a\u00020EH\u0003¢\u0006\u0004\bG\u0010H\u001aå\u0002\u0010_\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020L2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010N\u001a\u00020?2\u0006\u0010O\u001a\u00020?2\u0006\u0010P\u001a\u00020?2\u0006\u0010Q\u001a\u00020?2\u0006\u0010R\u001a\u00020?2\u0006\u0010T\u001a\u00020S2\u0006\u0010@\u001a\u00020?2\u0006\u0010U\u001a\u00020\u00072\n\b\u0002\u0010V\u001a\u0004\u0018\u0001092\n\b\u0002\u0010X\u001a\u0004\u0018\u00010W2\u0016\b\u0002\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u001e\u0018\u00010(2\u0016\b\u0002\u0010[\u001a\u0010\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u001e\u0018\u00010(2,\b\u0002\u0010 \u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001cj\u0004\u0018\u0001`\u001f2,\b\u0002\u0010!\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001cj\u0004\u0018\u0001`\u001f2,\b\u0002\u0010\"\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001cj\u0004\u0018\u0001`\u001f2\u0018\b\u0002\u0010\\\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010W\u0012\u0004\u0012\u00020\u001e\u0018\u00010(2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010,H\u0001¢\u0006\u0004\b]\u0010^\u001a\u0087\u0002\u0010d\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020J2\u0006\u0010a\u001a\u00020`2\u0006\u0010@\u001a\u00020?2\u0006\u0010M\u001a\u00020L2\b\b\u0002\u0010F\u001a\u00020E2\n\b\u0002\u0010V\u001a\u0004\u0018\u0001092\n\b\u0002\u0010X\u001a\u0004\u0018\u00010W2,\b\u0002\u0010 \u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001cj\u0004\u0018\u0001`\u001f2,\b\u0002\u0010!\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001cj\u0004\u0018\u0001`\u001f2,\b\u0002\u0010\"\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001cj\u0004\u0018\u0001`\u001f2\u0018\b\u0002\u0010\\\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010W\u0012\u0004\u0012\u00020\u001e\u0018\u00010(2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010,H\u0003¢\u0006\u0004\bb\u0010c\u001a)\u0010h\u001a\u00020\u001e2\u0006\u0010e\u001a\u00020\u00072\u0006\u0010g\u001a\u00020f2\b\b\u0002\u0010F\u001a\u00020EH\u0003¢\u0006\u0004\bh\u0010i\u001a9\u0010m\u001a\u00020\u001e2\b\u0010k\u001a\u0004\u0018\u00010j2\u0006\u0010l\u001a\u00020J2\b\b\u0002\u0010F\u001a\u00020E2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001e0,H\u0001¢\u0006\u0004\bm\u0010n\u001a\u0017\u0010q\u001a\u00020o2\u0006\u0010p\u001a\u00020oH\u0002¢\u0006\u0004\bq\u0010r¨\u0006\u008a\u0001²\u0006\u0014\u0010t\u001a\n\u0012\u0004\u0012\u00020s\u0018\u00010\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010v\u001a\u00020u8\nX\u008a\u0084\u0002²\u0006\u000e\u0010w\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\f\u0010y\u001a\u00020x8\nX\u008a\u0084\u0002²\u0006\u0018\u0010{\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020A0z8\nX\u008a\u0084\u0002²\u0006\f\u0010N\u001a\u00020?8\nX\u008a\u0084\u0002²\u0006\f\u0010O\u001a\u00020?8\nX\u008a\u0084\u0002²\u0006\f\u0010P\u001a\u00020?8\nX\u008a\u0084\u0002²\u0006\f\u0010Q\u001a\u00020?8\nX\u008a\u0084\u0002²\u0006\f\u0010R\u001a\u00020?8\nX\u008a\u0084\u0002²\u0006\f\u0010U\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010|\u001a\u00020Y8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010}\u001a\u00020Y8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010l\u001a\u00020J8\nX\u008a\u0084\u0002²\u0006\u000e\u0010~\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u007f\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\r\u0010\u0080\u0001\u001a\u00020A8\nX\u008a\u0084\u0002²\u0006\r\u0010\u0081\u0001\u001a\u00020A8\nX\u008a\u0084\u0002²\u0006\r\u0010\u0082\u0001\u001a\u00020A8\nX\u008a\u0084\u0002²\u0006\u000f\u0010\u0083\u0001\u001a\u0004\u0018\u00010A8\nX\u008a\u0084\u0002²\u0006\u000f\u0010\u0084\u0001\u001a\u0004\u0018\u00010A8\nX\u008a\u0084\u0002²\u0006\r\u0010\u0085\u0001\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\r\u0010\u0086\u0001\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\r\u0010\u0087\u0001\u001a\u00020?8\nX\u008a\u0084\u0002²\u0006\r\u0010\u0088\u0001\u001a\u00020J8\nX\u008a\u0084\u0002²\u0006\u000f\u0010\u0089\u0001\u001a\u00020A8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Ljava/util/UUID;", "equityInstrumentId", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "expirationDateState", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/OptionLegBundle;", "selectedLegs", "", "selloutSnackbarDismissedOrElapsed", "Lcom/robinhood/android/optionschain/sbschain/NuxMode;", "nuxMode", "isNuxAnimationFinished", "isNuxSearchDismissed", "Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;", "callPutSwitcherState", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent;", "chainEvent", "Lcom/robinhood/android/optionschain/sbschain/TooltipState;", "tooltipState", "Lcom/robinhood/android/optionschain/view/OptionChainTooltipBannerType;", "topTooltipBannerType", "Lcom/robinhood/models/ui/UiOptionStrategyLegDisplay;", "targetLegs", "Ljava/math/BigDecimal;", "targetStrikePrice", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "launchMode", "Lkotlin/Function3;", "Lcom/robinhood/android/optionschain/sbschain/table/BidAskCellDisableType;", "", "Lcom/robinhood/android/optionschain/sbschain/OnChainTableButtonTapped;", "onBidAskCellSingleTap", "onBidAskCellDoubleTap", "onBidAskCellLongPress", "Lcom/robinhood/android/optionschain/sbschain/TableHighlightPhase;", "animationPhase", "Lcom/robinhood/android/optionschain/sbschain/SbsFooterEducationAnimationState;", "sbsFooterEducationAnimationState", "inSbsChainPerfExperiment", "Lkotlin/Function1;", "onTableReady", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/OptionLegBundlesToReplace;", "onMultilegReplace", "Lkotlin/Function0;", "onEnableTradeOnExpiration", "onHighlightAnimationPlayed", "showDiscoverZeroDteBottomSheetIfNotYet", "j$/time/Instant", "showSelloutWarningSnackbar", "isSelloutSnackbarDismissalExperimentEnabled", "Lcom/robinhood/android/optionschain/sbschain/IdleTimerState;", "resetUserIdleTimer", "setSpreadSelectedOnCurrentPage", "setSeenSpreadTooltip", "onTopTooltipBannerDismiss", "onTopTooltipBannerAppear", "Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;", "logSpreadTooltipAppear", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDuxo;", "duxo", "OptionSideBySideChainTable", "(Ljava/util/UUID;Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/android/optionschain/sbschain/NuxMode;ZZLcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;Lcom/robinhood/android/udf/event/Event;Lcom/robinhood/android/optionschain/sbschain/TooltipState;Lcom/robinhood/android/optionschain/view/OptionChainTooltipBannerType;Lkotlinx/collections/immutable/ImmutableList;Ljava/math/BigDecimal;Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lcom/robinhood/android/optionschain/sbschain/TableHighlightPhase;Lcom/robinhood/android/optionschain/sbschain/SbsFooterEducationAnimationState;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDuxo;Landroidx/compose/runtime/Composer;IIIIII)V", "Landroidx/compose/ui/unit/Dp;", "cellWidth", "", "columnsPerSide", "strikeColumnWidth", "maxHeight", "Landroidx/compose/ui/Modifier;", "modifier", "OptionSideBySideChainTableOverlay-Q2ewo60", "(Lcom/robinhood/android/optionschain/sbschain/TableHighlightPhase;FIFFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OptionSideBySideChainTableOverlay", "", "sharedScrollValue", "Lcom/robinhood/android/optionschain/sbschain/table/TwoSidedScrollableRow;", "tableRowState", "leftScrollableRowOffset", "leftScrollableRowWidth", "rightScrollableRowOffset", "rightScrollableRowWidth", "stickCellOffset", "Landroidx/compose/ui/graphics/Brush;", "stickyCellBackgroundBrush", "scrollPastBidAsk", "spreadSelectionState", "Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;", "dragTarget", "Landroidx/compose/ui/geometry/Offset;", "onCallRowPositionChanged", "onPutRowPositionChanged", "onSelectedLegBundleDownInitiated", "OptionSideBySideChainTableRow-irZm130", "(FLcom/robinhood/android/optionschain/sbschain/table/TwoSidedScrollableRow;Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;FFFFFLandroidx/compose/ui/graphics/Brush;FZLcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "OptionSideBySideChainTableRow", "Lcom/robinhood/models/db/OptionContractType;", "contractType", "OptionOneSideScrollableRow-5Azxhi0", "(FLcom/robinhood/models/db/OptionContractType;FLcom/robinhood/android/optionschain/sbschain/table/TwoSidedScrollableRow;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/optionschain/sbschain/table/SpreadSelectionState;Lcom/robinhood/android/optionschain/sbschain/table/gestures/DragTarget;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "OptionOneSideScrollableRow", "isVisible", "Lcom/robinhood/android/optionschain/sbschain/table/SelectedLegIndicator;", "selectedLegIndicator", "SelectedLegIndicatorPill", "(ZLcom/robinhood/android/optionschain/sbschain/table/SelectedLegIndicator;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/optionschain/sbschain/table/TopErrorBannerState;", "state", "quoteRowHiddenPercentage", "OptionSideBySideChainTableTopBanner", "(Lcom/robinhood/android/optionschain/sbschain/table/TopErrorBannerState;FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/platform/ViewConfiguration;", "currentViewConfiguration", "provideShortDoubleTapConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)Landroidx/compose/ui/platform/ViewConfiguration;", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableEvent;", "event", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableViewState;", "viewState", "isTableReady", "", "startTableLoading", "Lkotlin/Pair;", "cellWidthToNumOfCellsCanHoldOneSide", "callPosition", "putPosition", "showCallSpreadAnimation", "showPutSpreadAnimation", "scrollQuoteToTableCenterOffset", "scrollQuoteToScreenCenterOffset", "scrollInstrumentToTableCenterOffset", "firstCompletelyVisibleItemIndex", "lastCompletelyVisibleItemIndex", "topQuoteVisible", "bottomQuoteVisible", "disclosureTopOffset", "alpha", "intrinsicHeight", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionSideBySideChainTableKt {

    /* compiled from: OptionSideBySideChainTable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[OptionSideBySideChainDataState2.values().length];
            try {
                iArr[OptionSideBySideChainDataState2.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionSideBySideChainDataState2.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionSideBySideChainDataState2.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TableHighlightPhase.values().length];
            try {
                iArr2[TableHighlightPhase.HIGHLIGHT_BID.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TableHighlightPhase.HIGHLIGHT_ASK.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OptionContractType.values().length];
            try {
                iArr3[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOneSideScrollableRow_5Azxhi0$lambda$75(float f, OptionContractType optionContractType, float f2, TwoSidedScrollableRow twoSidedScrollableRow, Modifier modifier, SpreadSelectionState spreadSelectionState, DragTarget dragTarget, Function3 function3, Function3 function32, Function3 function33, Function1 function1, Function0 function0, int i, int i2, int i3, Composer composer, int i4) {
        m17265OptionOneSideScrollableRow5Azxhi0(f, optionContractType, f2, twoSidedScrollableRow, modifier, spreadSelectionState, dragTarget, function3, function32, function33, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainTable$lambda$51(UUID uuid, OptionChainExpirationDateState optionChainExpirationDateState, ImmutableList immutableList, boolean z, OptionSideBySideChainDataState4 optionSideBySideChainDataState4, boolean z2, boolean z3, OptionSideBySideChainDataState2 optionSideBySideChainDataState2, Event event, OptionSideBySideChainDataState7 optionSideBySideChainDataState7, OptionChainTooltipBanner3 optionChainTooltipBanner3, ImmutableList immutableList2, BigDecimal bigDecimal, OptionChainLaunchMode optionChainLaunchMode, Function3 function3, Function3 function32, Function3 function33, TableHighlightPhase tableHighlightPhase, OptionSideBySideChainDataState5 optionSideBySideChainDataState5, boolean z4, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function0 function03, Function1 function13, boolean z5, Function1 function14, Function1 function15, Function0 function04, Function1 function16, Function1 function17, Function1 function18, OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, int i, int i2, int i3, int i4, int i5, int i6, Composer composer, int i7) {
        OptionSideBySideChainTable(uuid, optionChainExpirationDateState, immutableList, z, optionSideBySideChainDataState4, z2, z3, optionSideBySideChainDataState2, event, optionSideBySideChainDataState7, optionChainTooltipBanner3, immutableList2, bigDecimal, optionChainLaunchMode, function3, function32, function33, tableHighlightPhase, optionSideBySideChainDataState5, z4, function1, function12, function0, function02, function03, function13, z5, function14, function15, function04, function16, function17, function18, optionSideBySideChainTableDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), RecomposeScopeImpl4.updateChangedFlags(i3), RecomposeScopeImpl4.updateChangedFlags(i4), i5, i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainTableOverlay_Q2ewo60$lambda$60(TableHighlightPhase tableHighlightPhase, float f, int i, float f2, float f3, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        m17266OptionSideBySideChainTableOverlayQ2ewo60(tableHighlightPhase, f, i, f2, f3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionSideBySideChainTableRow_irZm130$lambda$67$lambda$64$lambda$63 */
    public static final String m2348xfb233b8d(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainTableRow_irZm130$lambda$68(float f, TwoSidedScrollableRow twoSidedScrollableRow, OptionSideBySideChainDataState2 optionSideBySideChainDataState2, float f2, float f3, float f4, float f5, float f6, Brush brush, float f7, boolean z, SpreadSelectionState spreadSelectionState, DragTarget dragTarget, Function1 function1, Function1 function12, Function3 function3, Function3 function32, Function3 function33, Function1 function13, Function0 function0, int i, int i2, int i3, Composer composer, int i4) {
        m17267OptionSideBySideChainTableRowirZm130(f, twoSidedScrollableRow, optionSideBySideChainDataState2, f2, f3, f4, f5, f6, brush, f7, z, spreadSelectionState, dragTarget, function1, function12, function3, function32, function33, function13, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionSideBySideChainTableTopBanner$lambda$81(TopErrorBannerState topErrorBannerState, float f, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        OptionSideBySideChainTableTopBanner(topErrorBannerState, f, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedLegIndicatorPill$lambda$76(boolean z, SelectedLegIndicator selectedLegIndicator, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SelectedLegIndicatorPill(z, selectedLegIndicator, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int OptionSideBySideChainTableTopBanner$lambda$78(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean OptionSideBySideChainTable$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final Tuples2<C2002Dp, Integer> OptionSideBySideChainTable$lambda$27(SnapshotState4<Tuples2<C2002Dp, Integer>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float OptionSideBySideChainTable$lambda$28(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float OptionSideBySideChainTable$lambda$29(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float OptionSideBySideChainTable$lambda$30(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float OptionSideBySideChainTable$lambda$31(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float OptionSideBySideChainTable$lambda$32(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean OptionSideBySideChainTable$lambda$36(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OptionSideBySideChainTable$lambda$38(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OptionSideBySideChainTable$lambda$41(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    private static final float OptionSideBySideChainTable$lambda$50$lambda$49(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<OptionSideBySideChainTableEvent> OptionSideBySideChainTable$lambda$7(SnapshotState4<Event<OptionSideBySideChainTableEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionSideBySideChainTableViewState OptionSideBySideChainTable$lambda$8(SnapshotState4<OptionSideBySideChainTableViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* renamed from: OptionSideBySideChainTableOverlay_Q2ewo60$lambda$59$lambda$58$lambda$57 */
    private static final float m2346x74836174(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionSideBySideChainTableTopBanner$lambda$79(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x09c7  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x09e6  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0a33  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0a6f  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0a7c  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0a7e  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0a94  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0abd  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0ad3  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0b15  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0b46  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0b48  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0b56  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0b72  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0b98  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0bb3  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0bd6  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0bf8  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0c24  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x0c47  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x0d0c  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x0d2f  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x0d57  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x0da5  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0dd4  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x0e11  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x0e1d  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x0e21  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x0e50  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x0ee1  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x0ef4  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x0f36  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x0f41  */
    /* JADX WARN: Removed duplicated region for block: B:717:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionSideBySideChainTable(final UUID uuid, final OptionChainExpirationDateState expirationDateState, final ImmutableList<OptionLegBundle> selectedLegs, final boolean z, final OptionSideBySideChainDataState4 nuxMode, final boolean z2, final boolean z3, final OptionSideBySideChainDataState2 callPutSwitcherState, final Event<OptionSideBySideChainEvent> event, final OptionSideBySideChainDataState7 optionSideBySideChainDataState7, final OptionChainTooltipBanner3 optionChainTooltipBanner3, final ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs, final BigDecimal bigDecimal, final OptionChainLaunchMode launchMode, final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> onBidAskCellSingleTap, final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> onBidAskCellDoubleTap, final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3, final TableHighlightPhase animationPhase, OptionSideBySideChainDataState5 sbsFooterEducationAnimationState, final boolean z4, final Function1<? super Boolean, Unit> onTableReady, final Function1<? super OptionLegBundlesToReplace, Unit> onMultilegReplace, final Function0<Unit> onEnableTradeOnExpiration, final Function0<Unit> onHighlightAnimationPlayed, final Function0<Unit> showDiscoverZeroDteBottomSheetIfNotYet, final Function1<? super Instant, Unit> showSelloutWarningSnackbar, final boolean z5, final Function1<? super OptionSideBySideChainDataState3, Unit> resetUserIdleTimer, final Function1<? super Boolean, Unit> setSpreadSelectedOnCurrentPage, final Function0<Unit> setSeenSpreadTooltip, final Function1<? super OptionChainTooltipBanner3, Unit> onTopTooltipBannerDismiss, final Function1<? super OptionChainTooltipBanner3, Unit> onTopTooltipBannerAppear, final Function1<? super SpreadSelectionState, Unit> logSpreadTooltipAppear, OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, Composer composer, final int i, final int i2, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z6;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo2;
        Object objRememberedValue;
        Composer.Companion companion;
        Animatable animatable;
        LazyListState lazyListStateRememberLazyListState;
        int i28;
        int i29;
        boolean zChanged;
        Object optionSideBySideChainTableKt$OptionSideBySideChainTable$1$1;
        int i30;
        int i31;
        LazyListState lazyListState;
        final Animatable animatable2;
        OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo3;
        ImmutableList<? extends UiOptionStrategyLegDisplay> immutableList;
        boolean zChangedInstance;
        Object objRememberedValue2;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        boolean zChangedInstance3;
        Object objRememberedValue4;
        boolean zChangedInstance4;
        Object objRememberedValue5;
        boolean zChangedInstance5;
        Object objRememberedValue6;
        Object objRememberedValue7;
        Event<OptionSideBySideChainTableEvent> event2;
        CoroutineScope coroutineScope;
        OptionSideBySideChainTableEvent optionSideBySideChainTableEvent;
        OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo4;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        boolean zChanged2;
        Object objMutableStateOf$default;
        SnapshotState snapshotState;
        boolean zChanged3;
        Object objRememberedValue8;
        final View view;
        final Event<OptionSideBySideChainTableEvent> eventOptionSideBySideChainTable$lambda$7;
        boolean zChanged4;
        Object objRememberedValue9;
        boolean zChanged5;
        Object objRememberedValue10;
        boolean zChanged6;
        Object objRememberedValue11;
        Object[] objArr;
        boolean zChanged7;
        Object[] objArr2;
        Object optionSideBySideChainTableKt$OptionSideBySideChainTable$11$1;
        OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo5;
        View view2;
        SnapshotState snapshotState2;
        SnapshotState4 snapshotState4;
        boolean zChanged8;
        Object objRememberedValue12;
        Boolean boolValueOf;
        boolean zChanged9;
        Object objRememberedValue13;
        boolean zChanged10;
        Object objRememberedValue14;
        Object objRememberedValue15;
        final float value;
        int iIntValue;
        int i32;
        float strikeCellWidthDp;
        int i33;
        float fM7995constructorimpl;
        int i34;
        float fM7995constructorimpl2;
        int i35;
        float fM7995constructorimpl3;
        int i36;
        float fM7995constructorimpl4;
        Object objRememberedValue16;
        Object objRememberedValue17;
        Object objRememberedValue18;
        boolean zChangedInstance6;
        Object objRememberedValue19;
        Object objRememberedValue20;
        Modifier.Companion companion2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        OptionSideBySideChainDataState5 optionSideBySideChainDataState5;
        Object objRememberedValue21;
        Composer composer2;
        final OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo6;
        EventConsumer<OptionSideBySideChainTableEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(expirationDateState, "expirationDateState");
        Intrinsics.checkNotNullParameter(selectedLegs, "selectedLegs");
        Intrinsics.checkNotNullParameter(nuxMode, "nuxMode");
        Intrinsics.checkNotNullParameter(callPutSwitcherState, "callPutSwitcherState");
        Intrinsics.checkNotNullParameter(targetLegs, "targetLegs");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(onBidAskCellSingleTap, "onBidAskCellSingleTap");
        Intrinsics.checkNotNullParameter(onBidAskCellDoubleTap, "onBidAskCellDoubleTap");
        Intrinsics.checkNotNullParameter(animationPhase, "animationPhase");
        Intrinsics.checkNotNullParameter(sbsFooterEducationAnimationState, "sbsFooterEducationAnimationState");
        Intrinsics.checkNotNullParameter(onTableReady, "onTableReady");
        Intrinsics.checkNotNullParameter(onMultilegReplace, "onMultilegReplace");
        Intrinsics.checkNotNullParameter(onEnableTradeOnExpiration, "onEnableTradeOnExpiration");
        Intrinsics.checkNotNullParameter(onHighlightAnimationPlayed, "onHighlightAnimationPlayed");
        Intrinsics.checkNotNullParameter(showDiscoverZeroDteBottomSheetIfNotYet, "showDiscoverZeroDteBottomSheetIfNotYet");
        Intrinsics.checkNotNullParameter(showSelloutWarningSnackbar, "showSelloutWarningSnackbar");
        Intrinsics.checkNotNullParameter(resetUserIdleTimer, "resetUserIdleTimer");
        Intrinsics.checkNotNullParameter(setSpreadSelectedOnCurrentPage, "setSpreadSelectedOnCurrentPage");
        Intrinsics.checkNotNullParameter(setSeenSpreadTooltip, "setSeenSpreadTooltip");
        Intrinsics.checkNotNullParameter(onTopTooltipBannerDismiss, "onTopTooltipBannerDismiss");
        Intrinsics.checkNotNullParameter(onTopTooltipBannerAppear, "onTopTooltipBannerAppear");
        Intrinsics.checkNotNullParameter(logSpreadTooltipAppear, "logSpreadTooltipAppear");
        Composer composerStartRestartGroup = composer.startRestartGroup(-640835863);
        if ((i5 & 1) != 0) {
            i7 = i;
            i8 = i7 | 6;
        } else {
            i7 = i;
            if ((i7 & 6) == 0) {
                i8 = i7 | (composerStartRestartGroup.changedInstance(uuid) ? 4 : 2);
            } else {
                i8 = i7;
            }
        }
        if ((i5 & 2) != 0) {
            i8 |= 48;
        } else if ((i7 & 48) == 0) {
            i8 |= (i7 & 64) == 0 ? composerStartRestartGroup.changed(expirationDateState) : composerStartRestartGroup.changedInstance(expirationDateState) ? 32 : 16;
        }
        int i37 = i8;
        if ((i5 & 4) != 0) {
            i9 = i37 | 384;
        } else if ((i7 & 384) == 0) {
            i9 = i37 | (composerStartRestartGroup.changedInstance(selectedLegs) ? 256 : 128);
        } else {
            i9 = i37;
        }
        int i38 = 1024;
        if ((i5 & 8) != 0) {
            i9 |= 3072;
        } else {
            if ((i7 & 3072) == 0) {
                i9 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i5 & 16) == 0) {
                i9 |= 24576;
            } else if ((i7 & 24576) == 0) {
                i9 |= composerStartRestartGroup.changed(nuxMode.ordinal()) ? 16384 : 8192;
            }
            if ((i5 & 32) == 0) {
                i9 |= 196608;
                i10 = 131072;
            } else {
                i10 = 131072;
                if ((i7 & 196608) == 0) {
                    i9 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                }
            }
            int i39 = i9;
            if ((i5 & 64) == 0) {
                i12 = i39 | 1572864;
                i11 = 1048576;
            } else {
                i11 = 1048576;
                if ((i7 & 1572864) == 0) {
                    i12 = i39 | (composerStartRestartGroup.changed(z3) ? 1048576 : 524288);
                } else {
                    i12 = i39;
                }
            }
            if ((i5 & 128) == 0) {
                i12 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i12 |= composerStartRestartGroup.changed(callPutSwitcherState.ordinal()) ? 8388608 : 4194304;
            }
            if ((i5 & 256) == 0) {
                i12 |= 100663296;
            } else {
                if ((i & 100663296) == 0) {
                    i12 |= composerStartRestartGroup.changed(event) ? 67108864 : 33554432;
                }
                if ((i5 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i12 |= composerStartRestartGroup.changed(optionSideBySideChainDataState7 == null ? -1 : optionSideBySideChainDataState7.ordinal()) ? 536870912 : 268435456;
                }
                i13 = i12;
                if ((i5 & 1024) != 0) {
                    i14 = i2;
                    i15 = i14 | 6;
                } else {
                    i14 = i2;
                    if ((i14 & 6) == 0) {
                        i15 = (composerStartRestartGroup.changed(optionChainTooltipBanner3 != null ? optionChainTooltipBanner3.ordinal() : -1) ? 4 : 2) | i14;
                    } else {
                        i15 = i14;
                    }
                }
                int i40 = i15;
                if ((i5 & 2048) != 0) {
                    i16 = i40 | 48;
                } else if ((i14 & 48) == 0) {
                    i16 = i40 | (composerStartRestartGroup.changedInstance(targetLegs) ? 32 : 16);
                } else {
                    i16 = i40;
                }
                if ((i5 & 4096) != 0) {
                    i16 |= 384;
                } else {
                    if ((i14 & 384) == 0) {
                        i16 |= composerStartRestartGroup.changedInstance(bigDecimal) ? 256 : 128;
                    }
                    if ((i5 & 8192) == 0) {
                        i16 |= 3072;
                    } else if ((i14 & 3072) == 0) {
                        i16 |= composerStartRestartGroup.changedInstance(launchMode) ? 2048 : 1024;
                    }
                    if ((i5 & 16384) == 0) {
                        i16 |= 24576;
                    } else if ((i14 & 24576) == 0) {
                        i16 |= composerStartRestartGroup.changedInstance(onBidAskCellSingleTap) ? 16384 : 8192;
                    }
                    if ((32768 & i5) == 0) {
                        i16 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        i16 |= composerStartRestartGroup.changedInstance(onBidAskCellDoubleTap) ? i10 : 65536;
                    }
                    if ((i5 & 65536) == 0) {
                        i16 |= 1572864;
                    } else {
                        if ((i14 & 1572864) == 0) {
                            i16 |= composerStartRestartGroup.changedInstance(function3) ? i11 : 524288;
                        }
                        if ((i5 & i10) != 0) {
                            i16 |= 12582912;
                        } else if ((i14 & 12582912) == 0) {
                            i16 |= composerStartRestartGroup.changed(animationPhase.ordinal()) ? 8388608 : 4194304;
                        }
                        if ((i5 & 262144) != 0) {
                            i16 |= 100663296;
                        } else if ((i14 & 100663296) == 0) {
                            i16 |= composerStartRestartGroup.changed(sbsFooterEducationAnimationState.ordinal()) ? 67108864 : 33554432;
                        }
                        if ((i5 & 524288) != 0) {
                            i18 = i16 | 805306368;
                            z6 = z4;
                        } else {
                            if ((i14 & 805306368) == 0) {
                                int i41 = i16;
                                z6 = z4;
                                i17 = i41 | (composerStartRestartGroup.changed(z6) ? 536870912 : 268435456);
                            } else {
                                i17 = i16;
                                z6 = z4;
                            }
                            i18 = i17;
                        }
                        if ((i5 & i11) != 0) {
                            i19 = i3;
                            i20 = i19 | 6;
                        } else {
                            i19 = i3;
                            if ((i19 & 6) == 0) {
                                i20 = i19 | (composerStartRestartGroup.changedInstance(onTableReady) ? 4 : 2);
                            } else {
                                i20 = i19;
                            }
                        }
                        if ((i5 & 2097152) != 0) {
                            i20 |= 48;
                        } else if ((i19 & 48) == 0) {
                            i20 |= composerStartRestartGroup.changedInstance(onMultilegReplace) ? 32 : 16;
                        }
                        int i42 = i20;
                        if ((i5 & 4194304) != 0) {
                            i21 = i42 | 384;
                        } else if ((i19 & 384) == 0) {
                            i21 = i42 | (composerStartRestartGroup.changedInstance(onEnableTradeOnExpiration) ? 256 : 128);
                        } else {
                            i21 = i42;
                        }
                        if ((i5 & 8388608) != 0) {
                            i22 = i21 | 3072;
                        } else {
                            int i43 = i21;
                            if ((i19 & 3072) == 0) {
                                i22 = i43 | (composerStartRestartGroup.changedInstance(onHighlightAnimationPlayed) ? 2048 : 1024);
                            } else {
                                i22 = i43;
                            }
                        }
                        if ((i5 & 16777216) != 0) {
                            i23 = i22 | 24576;
                        } else {
                            int i44 = i22;
                            if ((i19 & 24576) == 0) {
                                i23 = i44 | (composerStartRestartGroup.changedInstance(showDiscoverZeroDteBottomSheetIfNotYet) ? 16384 : 8192);
                            } else {
                                i23 = i44;
                            }
                        }
                        if ((i5 & 33554432) != 0) {
                            i23 |= 196608;
                        } else if ((i19 & 196608) == 0) {
                            i23 |= composerStartRestartGroup.changedInstance(showSelloutWarningSnackbar) ? i10 : 65536;
                        }
                        if ((i5 & 67108864) != 0) {
                            i23 |= 1572864;
                        } else if ((i19 & 1572864) == 0) {
                            i23 |= composerStartRestartGroup.changed(z5) ? i11 : 524288;
                        }
                        if ((i5 & 134217728) != 0) {
                            i23 |= 12582912;
                        } else if ((i19 & 12582912) == 0) {
                            i23 |= composerStartRestartGroup.changedInstance(resetUserIdleTimer) ? 8388608 : 4194304;
                        }
                        if ((i5 & 268435456) != 0) {
                            i23 |= 100663296;
                        } else {
                            if ((i19 & 100663296) == 0) {
                                i24 = i23 | (composerStartRestartGroup.changedInstance(setSpreadSelectedOnCurrentPage) ? 67108864 : 33554432);
                            }
                            if ((i5 & 536870912) == 0) {
                                i24 |= 805306368;
                            } else if ((i19 & 805306368) == 0) {
                                i24 |= composerStartRestartGroup.changedInstance(setSeenSpreadTooltip) ? 536870912 : 268435456;
                            }
                            int i45 = i24;
                            if ((i5 & 1073741824) == 0) {
                                i25 = i4;
                                i26 = i25 | 6;
                            } else {
                                i25 = i4;
                                if ((i25 & 6) == 0) {
                                    i26 = i25 | (composerStartRestartGroup.changedInstance(onTopTooltipBannerDismiss) ? 4 : 2);
                                } else {
                                    i26 = i25;
                                }
                            }
                            if ((i6 & 1) == 0) {
                                i26 |= 48;
                            } else if ((i25 & 48) == 0) {
                                i26 |= composerStartRestartGroup.changedInstance(onTopTooltipBannerAppear) ? 32 : 16;
                            }
                            int i46 = i26;
                            if ((i6 & 2) != 0) {
                                i27 = i46;
                                if ((i25 & 384) == 0) {
                                    i27 |= composerStartRestartGroup.changedInstance(logSpreadTooltipAppear) ? 256 : 128;
                                }
                                if ((i25 & 3072) == 0) {
                                    if ((i6 & 4) == 0 && composerStartRestartGroup.changedInstance(optionSideBySideChainTableDuxo)) {
                                        i38 = 2048;
                                    }
                                    i27 |= i38;
                                }
                                int i47 = i27;
                                if ((i13 & 306783379) == 306783378 && (i18 & 306783379) == 306783378 && (i45 & 306783379) == 306783378 && (i47 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    optionSideBySideChainDataState5 = sbsFooterEducationAnimationState;
                                    optionSideBySideChainTableDuxo6 = optionSideBySideChainTableDuxo;
                                    composer2 = composerStartRestartGroup;
                                } else {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if ((i6 & 4) == 0) {
                                            OptionSideBySideChainTableDuxo.InitArg initArg = new OptionSideBySideChainTableDuxo.InitArg(nuxMode, z6);
                                            composerStartRestartGroup.startReplaceGroup(2050738472);
                                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                            if (current == null) {
                                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                            }
                                            CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                                            creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArg)));
                                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OptionSideBySideChainTableDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                                            composerStartRestartGroup.endReplaceableGroup();
                                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                                            boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                                            Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
                                            if (zChangedInstance7 || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue22 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$$inlined$duxo$1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                                        lifecycle.addObserver(duxoLifecycleObserver);
                                                        final Lifecycle lifecycle2 = lifecycle;
                                                        return new DisposableEffectResult() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$$inlined$duxo$1.1
                                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                                            public void dispose() {
                                                                lifecycle2.removeObserver(duxoLifecycleObserver);
                                                            }
                                                        };
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue22, composerStartRestartGroup, 0);
                                            composerStartRestartGroup.endReplaceGroup();
                                            optionSideBySideChainTableDuxo2 = (OptionSideBySideChainTableDuxo) baseDuxo;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-640835863, i13, i18, "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTable (OptionSideBySideChainTable.kt:141)");
                                        }
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        companion = Composer.INSTANCE;
                                        if (objRememberedValue == companion.getEmpty()) {
                                            objRememberedValue = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        animatable = (Animatable) objRememberedValue;
                                        composerStartRestartGroup.endReplaceGroup();
                                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                        String key = expirationDateState.getKey();
                                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                                        i28 = i13 & 112;
                                        i29 = i18;
                                        zChanged = (i28 == 32 || ((i13 & 64) != 0 && composerStartRestartGroup.changedInstance(expirationDateState))) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(optionSideBySideChainTableDuxo2) | composerStartRestartGroup.changedInstance(targetLegs) | composerStartRestartGroup.changedInstance(bigDecimal);
                                        Object objRememberedValue23 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged || objRememberedValue23 == companion.getEmpty()) {
                                            i30 = i28;
                                            i31 = -1633490746;
                                            OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo7 = optionSideBySideChainTableDuxo2;
                                            optionSideBySideChainTableKt$OptionSideBySideChainTable$1$1 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$1$1(lazyListStateRememberLazyListState, animatable, optionSideBySideChainTableDuxo7, expirationDateState, targetLegs, bigDecimal, null);
                                            lazyListState = lazyListStateRememberLazyListState;
                                            animatable2 = animatable;
                                            optionSideBySideChainTableDuxo3 = optionSideBySideChainTableDuxo7;
                                            immutableList = targetLegs;
                                            composerStartRestartGroup.updateRememberedValue(optionSideBySideChainTableKt$OptionSideBySideChainTable$1$1);
                                        } else {
                                            optionSideBySideChainTableDuxo3 = optionSideBySideChainTableDuxo2;
                                            immutableList = targetLegs;
                                            optionSideBySideChainTableKt$OptionSideBySideChainTable$1$1 = objRememberedValue23;
                                            animatable2 = animatable;
                                            lazyListState = lazyListStateRememberLazyListState;
                                            i30 = i28;
                                            i31 = -1633490746;
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(key, immutableList, (Function2) optionSideBySideChainTableKt$OptionSideBySideChainTable$1$1, composerStartRestartGroup, i29 & 112);
                                        composerStartRestartGroup.startReplaceGroup(i31);
                                        zChangedInstance = composerStartRestartGroup.changedInstance(optionSideBySideChainTableDuxo3) | composerStartRestartGroup.changedInstance(uuid);
                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                                            objRememberedValue2 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$2$1(optionSideBySideChainTableDuxo3, uuid, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(uuid, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i13 & 14);
                                        composerStartRestartGroup.startReplaceGroup(i31);
                                        zChangedInstance2 = composerStartRestartGroup.changedInstance(optionSideBySideChainTableDuxo3) | composerStartRestartGroup.changedInstance(selectedLegs);
                                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (!zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                                            objRememberedValue3 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$3$1(optionSideBySideChainTableDuxo3, selectedLegs, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(selectedLegs, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, (i13 >> 6) & 14);
                                        Boolean boolValueOf2 = Boolean.valueOf(z);
                                        composerStartRestartGroup.startReplaceGroup(i31);
                                        zChangedInstance3 = composerStartRestartGroup.changedInstance(optionSideBySideChainTableDuxo3) | ((i13 & 7168) != 2048);
                                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                        if (!zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
                                            objRememberedValue4 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$4$1(optionSideBySideChainTableDuxo3, z, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, (i13 >> 9) & 14);
                                        Boolean boolValueOf3 = Boolean.valueOf(z2);
                                        composerStartRestartGroup.startReplaceGroup(i31);
                                        zChangedInstance4 = composerStartRestartGroup.changedInstance(optionSideBySideChainTableDuxo3) | ((458752 & i13) != i10);
                                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        if (!zChangedInstance4 || objRememberedValue5 == companion.getEmpty()) {
                                            objRememberedValue5 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$5$1(optionSideBySideChainTableDuxo3, z2, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(boolValueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, (i13 >> 15) & 14);
                                        Boolean boolValueOf4 = Boolean.valueOf(z3);
                                        composerStartRestartGroup.startReplaceGroup(i31);
                                        zChangedInstance5 = ((3670016 & i13) != i11) | composerStartRestartGroup.changedInstance(optionSideBySideChainTableDuxo3);
                                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                        if (!zChangedInstance5 || objRememberedValue6 == companion.getEmpty()) {
                                            objRememberedValue6 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$6$1(optionSideBySideChainTableDuxo3, z3, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(boolValueOf4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, (i13 >> 18) & 14);
                                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue7 == companion.getEmpty()) {
                                            objRememberedValue7 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                        }
                                        CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue7;
                                        final StateFlow<Event<OptionSideBySideChainTableEvent>> eventFlow = optionSideBySideChainTableDuxo3.getEventFlow();
                                        composerStartRestartGroup.startReplaceGroup(-523522313);
                                        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                                        Lifecycle.State state = Lifecycle.State.STARTED;
                                        CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                                        Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$$inlined$collectEventAsStateWithLifecycle$1
                                            @Override // kotlinx.coroutines.flow.Flow
                                            public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                                                Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                            }

                                            /* compiled from: Emitters.kt */
                                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                            @SourceDebugExtension
                                            /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                                            public static final class AnonymousClass2<T> implements FlowCollector {
                                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "OptionSideBySideChainTable.kt", m3646l = {50}, m3647m = "emit")
                                                /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                                                public static final class AnonymousClass1 extends ContinuationImpl {
                                                    Object L$0;
                                                    Object L$1;
                                                    int label;
                                                    /* synthetic */ Object result;

                                                    public AnonymousClass1(Continuation continuation) {
                                                        super(continuation);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                    public final Object invokeSuspend(Object obj) {
                                                        this.result = obj;
                                                        this.label |= Integer.MIN_VALUE;
                                                        return AnonymousClass2.this.emit(null, this);
                                                    }
                                                }

                                                public AnonymousClass2(FlowCollector flowCollector) {
                                                    this.$this_unsafeFlow = flowCollector;
                                                }

                                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                                @Override // kotlinx.coroutines.flow.FlowCollector
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                */
                                                public final Object emit(Object obj, Continuation continuation) {
                                                    AnonymousClass1 anonymousClass1;
                                                    if (continuation instanceof AnonymousClass1) {
                                                        anonymousClass1 = (AnonymousClass1) continuation;
                                                        int i = anonymousClass1.label;
                                                        if ((i & Integer.MIN_VALUE) != 0) {
                                                            anonymousClass1.label = i - Integer.MIN_VALUE;
                                                        } else {
                                                            anonymousClass1 = new AnonymousClass1(continuation);
                                                        }
                                                    }
                                                    Object obj2 = anonymousClass1.result;
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i2 = anonymousClass1.label;
                                                    if (i2 == 0) {
                                                        ResultKt.throwOnFailure(obj2);
                                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                                        Event event = (Event) obj;
                                                        if ((event != null ? event.getData() : null) instanceof OptionSideBySideChainTableEvent) {
                                                            anonymousClass1.label = 1;
                                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        }
                                                    } else {
                                                        if (i2 != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj2);
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        };
                                        Event<OptionSideBySideChainTableEvent> value2 = eventFlow.getValue();
                                        event2 = value2;
                                        if (event2 == null) {
                                            OptionSideBySideChainTableEvent data = event2.getData();
                                            coroutineScope = coroutineScope2;
                                            optionSideBySideChainTableEvent = data;
                                        } else {
                                            coroutineScope = coroutineScope2;
                                            optionSideBySideChainTableEvent = null;
                                        }
                                        if (!(optionSideBySideChainTableEvent instanceof OptionSideBySideChainTableEvent)) {
                                            value2 = null;
                                        }
                                        optionSideBySideChainTableDuxo4 = optionSideBySideChainTableDuxo3;
                                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value2, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                                        composerStartRestartGroup.endReplaceGroup();
                                        snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(optionSideBySideChainTableDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                                        OptionChainExpirationDateState expirationDateState2 = OptionSideBySideChainTable$lambda$8(snapshotState4CollectAsStateWithLifecycle).getExpirationDateState();
                                        String key2 = expirationDateState2 == null ? expirationDateState2.getKey() : null;
                                        composerStartRestartGroup.startReplaceGroup(5004770);
                                        zChanged2 = composerStartRestartGroup.changed(key2);
                                        Object objRememberedValue24 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged2 || objRememberedValue24 == companion.getEmpty()) {
                                            objMutableStateOf$default = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                            composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
                                        } else {
                                            objMutableStateOf$default = objRememberedValue24;
                                        }
                                        snapshotState = (SnapshotState) objMutableStateOf$default;
                                        composerStartRestartGroup.endReplaceGroup();
                                        OptionChainExpirationDateState expirationDateState3 = OptionSideBySideChainTable$lambda$8(snapshotState4CollectAsStateWithLifecycle).getExpirationDateState();
                                        String key3 = expirationDateState3 == null ? expirationDateState3.getKey() : null;
                                        composerStartRestartGroup.startReplaceGroup(5004770);
                                        zChanged3 = composerStartRestartGroup.changed(key3);
                                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged3 || objRememberedValue8 == companion.getEmpty()) {
                                            objRememberedValue8 = SnapshotLongState3.mutableLongStateOf(System.currentTimeMillis());
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                        }
                                        SnapshotLongState2 snapshotLongState2 = (SnapshotLongState2) objRememberedValue8;
                                        composerStartRestartGroup.endReplaceGroup();
                                        view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                                        eventOptionSideBySideChainTable$lambda$7 = OptionSideBySideChainTable$lambda$7(snapshotState4CollectAsStateWithLifecycle2);
                                        if (eventOptionSideBySideChainTable$lambda$7 != null) {
                                            if ((eventOptionSideBySideChainTable$lambda$7.getData() instanceof OptionSideBySideChainTableEvent.DragUpdateSelectedLegs) && (eventConsumerInvoke = eventOptionSideBySideChainTable$lambda$7.getGetEventConsumer().invoke()) != null) {
                                                eventConsumerInvoke.consume(eventOptionSideBySideChainTable$lambda$7, new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$$inlined$consumeIfType$1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                        m17268invoke(obj);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: collision with other method in class */
                                                    public final void m17268invoke(Object it) {
                                                        Intrinsics.checkNotNullParameter(it, "it");
                                                        OptionSideBySideChainTableEvent.DragUpdateSelectedLegs dragUpdateSelectedLegs = (OptionSideBySideChainTableEvent.DragUpdateSelectedLegs) eventOptionSideBySideChainTable$lambda$7.getData();
                                                        view.performHapticFeedback(4);
                                                        onMultilegReplace.invoke(dragUpdateSelectedLegs.getLegBundlesToReplace());
                                                    }
                                                });
                                            }
                                            Unit unit = Unit.INSTANCE;
                                        }
                                        OptionChainExpirationDateState expirationDateState4 = OptionSideBySideChainTable$lambda$8(snapshotState4CollectAsStateWithLifecycle).getExpirationDateState();
                                        String key4 = expirationDateState4 == null ? expirationDateState4.getKey() : null;
                                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                                        zChanged4 = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(optionSideBySideChainTableDuxo4);
                                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged4 || objRememberedValue9 == companion.getEmpty()) {
                                            objRememberedValue9 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$8$1(optionSideBySideChainTableDuxo4, snapshotState4CollectAsStateWithLifecycle, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(key4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composerStartRestartGroup, 0);
                                        Boolean boolValueOf5 = Boolean.valueOf(OptionSideBySideChainTable$lambda$10(snapshotState));
                                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                                        zChanged5 = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(optionSideBySideChainTableDuxo4);
                                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged5 || objRememberedValue10 == companion.getEmpty()) {
                                            objRememberedValue10 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$9$1(optionSideBySideChainTableDuxo4, snapshotState4CollectAsStateWithLifecycle, snapshotState, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(boolValueOf5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, 0);
                                        String key5 = expirationDateState.getKey();
                                        Boolean boolValueOf6 = Boolean.valueOf(OptionSideBySideChainTable$lambda$8(snapshotState4CollectAsStateWithLifecycle).getShouldShowZeroDteBottomSheet());
                                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                                        int i48 = i30;
                                        zChanged6 = (i48 != 32 || ((i13 & 64) != 0 && composerStartRestartGroup.changedInstance(expirationDateState))) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((i45 & 57344) != 16384);
                                        objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged6 || objRememberedValue11 == companion.getEmpty()) {
                                            objRememberedValue11 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$10$1(expirationDateState, showDiscoverZeroDteBottomSheetIfNotYet, snapshotState4CollectAsStateWithLifecycle, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(key5, boolValueOf6, (Function2) objRememberedValue11, composerStartRestartGroup, 0);
                                        objArr = new Object[]{expirationDateState.getKey(), OptionSideBySideChainTable$lambda$8(snapshotState4CollectAsStateWithLifecycle).getSelloutTimeWhenShouldShowSelloutWarningSnackbar(), Boolean.valueOf(selectedLegs.isEmpty()), Boolean.valueOf(z5)};
                                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                                        zChanged7 = (i48 != 32 || ((i13 & 64) != 0 && composerStartRestartGroup.changedInstance(expirationDateState))) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((i45 & 3670016) != 1048576) | composerStartRestartGroup.changedInstance(selectedLegs) | ((i45 & 458752) != 131072);
                                        Object objRememberedValue25 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged7 || objRememberedValue25 == companion.getEmpty()) {
                                            objArr2 = objArr;
                                            optionSideBySideChainTableDuxo5 = optionSideBySideChainTableDuxo4;
                                            view2 = view;
                                            snapshotState2 = snapshotState;
                                            optionSideBySideChainTableKt$OptionSideBySideChainTable$11$1 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$11$1(expirationDateState, z5, selectedLegs, showSelloutWarningSnackbar, snapshotState4CollectAsStateWithLifecycle, null);
                                            snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                            composerStartRestartGroup.updateRememberedValue(optionSideBySideChainTableKt$OptionSideBySideChainTable$11$1);
                                        } else {
                                            objArr2 = objArr;
                                            optionSideBySideChainTableKt$OptionSideBySideChainTable$11$1 = objRememberedValue25;
                                            view2 = view;
                                            snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                            optionSideBySideChainTableDuxo5 = optionSideBySideChainTableDuxo4;
                                            snapshotState2 = snapshotState;
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(objArr2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) optionSideBySideChainTableKt$OptionSideBySideChainTable$11$1, composerStartRestartGroup, 0);
                                        Boolean boolValueOf7 = Boolean.valueOf(OptionSideBySideChainTable$lambda$8(snapshotState4).isNuxAnimationFinished());
                                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                                        zChanged8 = composerStartRestartGroup.changed(snapshotState4) | ((i45 & 29360128) != 8388608);
                                        objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged8 || objRememberedValue12 == companion.getEmpty()) {
                                            objRememberedValue12 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$12$1(resetUserIdleTimer, snapshotState4, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(boolValueOf7, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue12, composerStartRestartGroup, 0);
                                        SpreadSelectionState spreadSelectionState = OptionSideBySideChainTable$lambda$8(snapshotState4).getSpreadSelectionState();
                                        boolValueOf = spreadSelectionState == null ? Boolean.valueOf(spreadSelectionState.hasSpreadSelected()) : null;
                                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                                        zChanged9 = composerStartRestartGroup.changed(boolValueOf) | ((i45 & 234881024) != 67108864);
                                        objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged9 || objRememberedValue13 == companion.getEmpty()) {
                                            objRememberedValue13 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$13$1(setSpreadSelectedOnCurrentPage, boolValueOf, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue13, composerStartRestartGroup, 0);
                                        Boolean boolValueOf8 = Boolean.valueOf(OptionSideBySideChainTable$lambda$10(snapshotState2));
                                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                                        zChanged10 = ((i45 & 14) != 4) | composerStartRestartGroup.changed(snapshotState2);
                                        objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged10 || objRememberedValue14 == companion.getEmpty()) {
                                            objRememberedValue14 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$14$1(onTableReady, snapshotState2, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(boolValueOf8, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue14, composerStartRestartGroup, 0);
                                        final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                        final float fMo7449getContainerSizeYbymL2g = (int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32);
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue15 == companion.getEmpty()) {
                                            objRememberedValue15 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$26$lambda$25(density, fMo7449getContainerSizeYbymL2g);
                                                }
                                            });
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        Tuples2<C2002Dp, Integer> tuples2OptionSideBySideChainTable$lambda$27 = OptionSideBySideChainTable$lambda$27((SnapshotState4) objRememberedValue15);
                                        value = tuples2OptionSideBySideChainTable$lambda$27.component1().getValue();
                                        iIntValue = tuples2OptionSideBySideChainTable$lambda$27.component2().intValue();
                                        final SnapshotState4 snapshotState42 = snapshotState4;
                                        boolean z7 = callPutSwitcherState != OptionSideBySideChainDataState2.BOTH;
                                        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                                        SnapshotState snapshotState3 = snapshotState2;
                                        i32 = iArr[callPutSwitcherState.ordinal()];
                                        if (i32 != 1) {
                                            strikeCellWidthDp = TableConstants.getStrikeCellWidthDp();
                                        } else {
                                            if (i32 != 2 && i32 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            strikeCellWidthDp = C2002Dp.m7995constructorimpl(0);
                                        }
                                        boolean z8 = z7;
                                        SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI = AnimateAsState.m4812animateDpAsStateAjpBEmI(strikeCellWidthDp, null, "leftScrollableRowOffset animation", null, composerStartRestartGroup, 384, 10);
                                        i33 = iArr[callPutSwitcherState.ordinal()];
                                        if (i33 != 1) {
                                            fM7995constructorimpl = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(value * iIntValue) * 2);
                                        } else if (i33 == 2) {
                                            fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                                        } else {
                                            if (i33 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            fM7995constructorimpl = C2002Dp.m7995constructorimpl(value * iIntValue);
                                        }
                                        SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI2 = AnimateAsState.m4812animateDpAsStateAjpBEmI(fM7995constructorimpl, null, "leftScrollableRowWidth animation", null, composerStartRestartGroup, 384, 10);
                                        i34 = iArr[callPutSwitcherState.ordinal()];
                                        if (i34 != 1) {
                                            fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(value * iIntValue) * 2) + TableConstants.getStrikeCellWidthDp());
                                        } else if (i34 == 2) {
                                            fM7995constructorimpl2 = TableConstants.getStrikeCellWidthDp();
                                        } else {
                                            if (i34 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(value * iIntValue) + TableConstants.getStrikeCellWidthDp());
                                        }
                                        SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI3 = AnimateAsState.m4812animateDpAsStateAjpBEmI(fM7995constructorimpl2, null, "rightScrollableRowOffset animation", null, composerStartRestartGroup, 384, 10);
                                        i35 = iArr[callPutSwitcherState.ordinal()];
                                        if (i35 != 1) {
                                            fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(0);
                                        } else if (i35 == 2) {
                                            fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(value * iIntValue) * 2);
                                        } else {
                                            if (i35 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(value * iIntValue);
                                        }
                                        SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI4 = AnimateAsState.m4812animateDpAsStateAjpBEmI(fM7995constructorimpl3, null, "rightScrollableRowWidth animation", null, composerStartRestartGroup, 384, 10);
                                        i36 = iArr[callPutSwitcherState.ordinal()];
                                        if (i36 == 1 && i36 != 2) {
                                            if (i36 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            fM7995constructorimpl4 = C2002Dp.m7995constructorimpl(value * iIntValue);
                                        }
                                        SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI5 = AnimateAsState.m4812animateDpAsStateAjpBEmI(fM7995constructorimpl4, null, "stickCellOffset animation", null, composerStartRestartGroup, 384, 10);
                                        Brush.Companion companion3 = Brush.INSTANCE;
                                        Float fValueOf = Float.valueOf(0.0f);
                                        Color.Companion companion4 = Color.INSTANCE;
                                        Tuples2 tuples2M3642to = Tuples4.m3642to(fValueOf, Color.m6701boximpl(companion4.m6725getTransparent0d7_KjU()));
                                        Float fValueOf2 = Float.valueOf(0.15f);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i49 = BentoTheme.$stable;
                                        Brush brushM6677horizontalGradient8A3gB4$default = Brush.Companion.m6677horizontalGradient8A3gB4$default(companion3, new Tuples2[]{tuples2M3642to, Tuples4.m3642to(fValueOf2, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i49).m21371getBg0d7_KjU())), Tuples4.m3642to(Float.valueOf(0.85f), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i49).m21371getBg0d7_KjU())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(companion4.m6725getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null);
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue16 == companion.getEmpty()) {
                                            objRememberedValue16 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return Boolean.valueOf(OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$35$lambda$34(density, animatable2, value));
                                                }
                                            });
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
                                        }
                                        SnapshotState4 snapshotState43 = (SnapshotState4) objRememberedValue16;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue17 == companion.getEmpty()) {
                                            objRememberedValue17 = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.INSTANCE.m6553getZeroF1C5BW0()), null, 2, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
                                        }
                                        SnapshotState snapshotState5 = (SnapshotState) objRememberedValue17;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue18 == companion.getEmpty()) {
                                            objRememberedValue18 = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.INSTANCE.m6553getZeroF1C5BW0()), null, 2, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
                                        }
                                        SnapshotState snapshotState6 = (SnapshotState) objRememberedValue18;
                                        composerStartRestartGroup.endReplaceGroup();
                                        Integer quoteIndex = OptionSideBySideChainTable$lambda$8(snapshotState42).getQuoteIndex();
                                        int size = OptionSideBySideChainTable$lambda$8(snapshotState42).getHeaderState().getMetrics().size();
                                        Integer numValueOf = Integer.valueOf(size);
                                        composerStartRestartGroup.startReplaceGroup(5004770);
                                        zChangedInstance6 = composerStartRestartGroup.changedInstance(animatable2);
                                        objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                                        if (!zChangedInstance6 || objRememberedValue19 == companion.getEmpty()) {
                                            objRememberedValue19 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$15$1(animatable2, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(callPutSwitcherState, numValueOf, (Function2) objRememberedValue19, composerStartRestartGroup, (i13 >> 21) & 14);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue20 == companion.getEmpty()) {
                                            objRememberedValue20 = provideShortDoubleTapConfiguration(viewConfiguration);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
                                        }
                                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) objRememberedValue20;
                                        composerStartRestartGroup.endReplaceGroup();
                                        companion2 = Modifier.INSTANCE;
                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                            composerStartRestartGroup.useNode();
                                        } else {
                                            composerStartRestartGroup.createNode(constructor);
                                        }
                                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        ProvidedValue<ViewConfiguration> providedValueProvides = CompositionLocalsKt.getLocalViewConfiguration().provides(viewConfiguration2);
                                        OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo8 = optionSideBySideChainTableDuxo5;
                                        OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1 optionSideBySideChainTableKt$OptionSideBySideChainTable$16$1 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1(optionSideBySideChainTableDuxo8, size, value, iIntValue, callPutSwitcherState, density, coroutineScope, animatable2, snapshotState42, quoteIndex, onEnableTradeOnExpiration, brushM6677horizontalGradient8A3gB4$default, snapshotState4M4812animateDpAsStateAjpBEmI, snapshotState4M4812animateDpAsStateAjpBEmI2, snapshotState4M4812animateDpAsStateAjpBEmI3, snapshotState4M4812animateDpAsStateAjpBEmI4, snapshotState4M4812animateDpAsStateAjpBEmI5, snapshotState5, snapshotState6, lazyListState, event, view2, z8, onBidAskCellSingleTap, onBidAskCellDoubleTap, function3, onHighlightAnimationPlayed, launchMode, optionSideBySideChainDataState7, setSeenSpreadTooltip, logSpreadTooltipAppear, z4, snapshotState3, selectedLegs, fMo7449getContainerSizeYbymL2g, optionChainTooltipBanner3, nuxMode, z2, onTopTooltipBannerDismiss, onTopTooltipBannerAppear, snapshotState43, snapshotLongState2, snapshotState4CollectAsStateWithLifecycle2);
                                        final LazyListState lazyListState2 = lazyListState;
                                        CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(1594738531, true, optionSideBySideChainTableKt$OptionSideBySideChainTable$16$1, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                        composerStartRestartGroup.startReplaceGroup(-302717810);
                                        optionSideBySideChainDataState5 = sbsFooterEducationAnimationState;
                                        if (optionSideBySideChainDataState5 != OptionSideBySideChainDataState5.NOT_PLAYING || optionSideBySideChainDataState5 == OptionSideBySideChainDataState5.PLAYING) {
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue21 == companion.getEmpty()) {
                                                objRememberedValue21 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$$ExternalSyntheticLambda2
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$50$lambda$48$lambda$47(lazyListState2, density, snapshotState42);
                                                    }
                                                });
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            m17266OptionSideBySideChainTableOverlayQ2ewo60(animationPhase, value, iIntValue, TableConstants.getStrikeCellWidthDp(), OptionSideBySideChainTable$lambda$50$lambda$49((SnapshotState4) objRememberedValue21), SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), composerStartRestartGroup, ((i29 >> 21) & 14) | 199680, 0);
                                            composer2 = composerStartRestartGroup;
                                        } else {
                                            composer2 = composerStartRestartGroup;
                                        }
                                        composer2.endReplaceGroup();
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        optionSideBySideChainTableDuxo6 = optionSideBySideChainTableDuxo8;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                    }
                                    optionSideBySideChainTableDuxo2 = optionSideBySideChainTableDuxo;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    companion = Composer.INSTANCE;
                                    if (objRememberedValue == companion.getEmpty()) {
                                    }
                                    animatable = (Animatable) objRememberedValue;
                                    composerStartRestartGroup.endReplaceGroup();
                                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                    String key6 = expirationDateState.getKey();
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    i28 = i13 & 112;
                                    i29 = i18;
                                    if (i28 == 32) {
                                        zChanged = (i28 == 32 || ((i13 & 64) != 0 && composerStartRestartGroup.changedInstance(expirationDateState))) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(optionSideBySideChainTableDuxo2) | composerStartRestartGroup.changedInstance(targetLegs) | composerStartRestartGroup.changedInstance(bigDecimal);
                                        Object objRememberedValue232 = composerStartRestartGroup.rememberedValue();
                                        if (zChanged) {
                                            i30 = i28;
                                            i31 = -1633490746;
                                            OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo72 = optionSideBySideChainTableDuxo2;
                                            optionSideBySideChainTableKt$OptionSideBySideChainTable$1$1 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$1$1(lazyListStateRememberLazyListState, animatable, optionSideBySideChainTableDuxo72, expirationDateState, targetLegs, bigDecimal, null);
                                            lazyListState = lazyListStateRememberLazyListState;
                                            animatable2 = animatable;
                                            optionSideBySideChainTableDuxo3 = optionSideBySideChainTableDuxo72;
                                            immutableList = targetLegs;
                                            composerStartRestartGroup.updateRememberedValue(optionSideBySideChainTableKt$OptionSideBySideChainTable$1$1);
                                            composerStartRestartGroup.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(key6, immutableList, (Function2) optionSideBySideChainTableKt$OptionSideBySideChainTable$1$1, composerStartRestartGroup, i29 & 112);
                                            composerStartRestartGroup.startReplaceGroup(i31);
                                            zChangedInstance = composerStartRestartGroup.changedInstance(optionSideBySideChainTableDuxo3) | composerStartRestartGroup.changedInstance(uuid);
                                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            if (!zChangedInstance) {
                                                objRememberedValue2 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$2$1(optionSideBySideChainTableDuxo3, uuid, null);
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                composerStartRestartGroup.endReplaceGroup();
                                                EffectsKt.LaunchedEffect(uuid, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i13 & 14);
                                                composerStartRestartGroup.startReplaceGroup(i31);
                                                zChangedInstance2 = composerStartRestartGroup.changedInstance(optionSideBySideChainTableDuxo3) | composerStartRestartGroup.changedInstance(selectedLegs);
                                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                                if (!zChangedInstance2) {
                                                    objRememberedValue3 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$3$1(optionSideBySideChainTableDuxo3, selectedLegs, null);
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    EffectsKt.LaunchedEffect(selectedLegs, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, (i13 >> 6) & 14);
                                                    Boolean boolValueOf22 = Boolean.valueOf(z);
                                                    composerStartRestartGroup.startReplaceGroup(i31);
                                                    zChangedInstance3 = composerStartRestartGroup.changedInstance(optionSideBySideChainTableDuxo3) | ((i13 & 7168) != 2048);
                                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                    if (!zChangedInstance3) {
                                                        objRememberedValue4 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$4$1(optionSideBySideChainTableDuxo3, z, null);
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                                        composerStartRestartGroup.endReplaceGroup();
                                                        EffectsKt.LaunchedEffect(boolValueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, (i13 >> 9) & 14);
                                                        Boolean boolValueOf32 = Boolean.valueOf(z2);
                                                        composerStartRestartGroup.startReplaceGroup(i31);
                                                        zChangedInstance4 = composerStartRestartGroup.changedInstance(optionSideBySideChainTableDuxo3) | ((458752 & i13) != i10);
                                                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                                        if (!zChangedInstance4) {
                                                            objRememberedValue5 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$5$1(optionSideBySideChainTableDuxo3, z2, null);
                                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                                            composerStartRestartGroup.endReplaceGroup();
                                                            EffectsKt.LaunchedEffect(boolValueOf32, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, (i13 >> 15) & 14);
                                                            Boolean boolValueOf42 = Boolean.valueOf(z3);
                                                            composerStartRestartGroup.startReplaceGroup(i31);
                                                            zChangedInstance5 = ((3670016 & i13) != i11) | composerStartRestartGroup.changedInstance(optionSideBySideChainTableDuxo3);
                                                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                                            if (!zChangedInstance5) {
                                                                objRememberedValue6 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$6$1(optionSideBySideChainTableDuxo3, z3, null);
                                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                                EffectsKt.LaunchedEffect(boolValueOf42, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, (i13 >> 18) & 14);
                                                                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                                                if (objRememberedValue7 == companion.getEmpty()) {
                                                                }
                                                                CoroutineScope coroutineScope22 = (CoroutineScope) objRememberedValue7;
                                                                final Flow eventFlow2 = optionSideBySideChainTableDuxo3.getEventFlow();
                                                                composerStartRestartGroup.startReplaceGroup(-523522313);
                                                                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                                                                Lifecycle.State state2 = Lifecycle.State.STARTED;
                                                                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                                                                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$$inlined$collectEventAsStateWithLifecycle$1
                                                                    @Override // kotlinx.coroutines.flow.Flow
                                                                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                                                                        Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                                                                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                                                    }

                                                                    /* compiled from: Emitters.kt */
                                                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                                    @SourceDebugExtension
                                                                    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                                                                    public static final class AnonymousClass2<T> implements FlowCollector {
                                                                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                                                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                                        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "OptionSideBySideChainTable.kt", m3646l = {50}, m3647m = "emit")
                                                                        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                                                                        public static final class AnonymousClass1 extends ContinuationImpl {
                                                                            Object L$0;
                                                                            Object L$1;
                                                                            int label;
                                                                            /* synthetic */ Object result;

                                                                            public AnonymousClass1(Continuation continuation) {
                                                                                super(continuation);
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                                                            public final Object invokeSuspend(Object obj) {
                                                                                this.result = obj;
                                                                                this.label |= Integer.MIN_VALUE;
                                                                                return AnonymousClass2.this.emit(null, this);
                                                                            }
                                                                        }

                                                                        public AnonymousClass2(FlowCollector flowCollector) {
                                                                            this.$this_unsafeFlow = flowCollector;
                                                                        }

                                                                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                                                        @Override // kotlinx.coroutines.flow.FlowCollector
                                                                        /*
                                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                                        */
                                                                        public final Object emit(Object obj, Continuation continuation) {
                                                                            AnonymousClass1 anonymousClass1;
                                                                            if (continuation instanceof AnonymousClass1) {
                                                                                anonymousClass1 = (AnonymousClass1) continuation;
                                                                                int i = anonymousClass1.label;
                                                                                if ((i & Integer.MIN_VALUE) != 0) {
                                                                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                                                                } else {
                                                                                    anonymousClass1 = new AnonymousClass1(continuation);
                                                                                }
                                                                            }
                                                                            Object obj2 = anonymousClass1.result;
                                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                            int i2 = anonymousClass1.label;
                                                                            if (i2 == 0) {
                                                                                ResultKt.throwOnFailure(obj2);
                                                                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                                                                Event event = (Event) obj;
                                                                                if ((event != null ? event.getData() : null) instanceof OptionSideBySideChainTableEvent) {
                                                                                    anonymousClass1.label = 1;
                                                                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                                                        return coroutine_suspended;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (i2 != 1) {
                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                }
                                                                                ResultKt.throwOnFailure(obj2);
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    }
                                                                };
                                                                Event<OptionSideBySideChainTableEvent> value22 = eventFlow2.getValue();
                                                                event2 = value22;
                                                                if (event2 == null) {
                                                                }
                                                                if (!(optionSideBySideChainTableEvent instanceof OptionSideBySideChainTableEvent)) {
                                                                }
                                                                optionSideBySideChainTableDuxo4 = optionSideBySideChainTableDuxo3;
                                                                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value22, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                                                                composerStartRestartGroup.endReplaceGroup();
                                                                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(optionSideBySideChainTableDuxo4.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                                                                OptionChainExpirationDateState expirationDateState22 = OptionSideBySideChainTable$lambda$8(snapshotState4CollectAsStateWithLifecycle).getExpirationDateState();
                                                                if (expirationDateState22 == null) {
                                                                }
                                                                composerStartRestartGroup.startReplaceGroup(5004770);
                                                                zChanged2 = composerStartRestartGroup.changed(key2);
                                                                Object objRememberedValue242 = composerStartRestartGroup.rememberedValue();
                                                                if (zChanged2) {
                                                                    objMutableStateOf$default = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                                                    composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
                                                                    snapshotState = (SnapshotState) objMutableStateOf$default;
                                                                    composerStartRestartGroup.endReplaceGroup();
                                                                    OptionChainExpirationDateState expirationDateState32 = OptionSideBySideChainTable$lambda$8(snapshotState4CollectAsStateWithLifecycle).getExpirationDateState();
                                                                    if (expirationDateState32 == null) {
                                                                    }
                                                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                                                    zChanged3 = composerStartRestartGroup.changed(key3);
                                                                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                                                    if (!zChanged3) {
                                                                        objRememberedValue8 = SnapshotLongState3.mutableLongStateOf(System.currentTimeMillis());
                                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                                                        SnapshotLongState2 snapshotLongState22 = (SnapshotLongState2) objRememberedValue8;
                                                                        composerStartRestartGroup.endReplaceGroup();
                                                                        view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                                                                        eventOptionSideBySideChainTable$lambda$7 = OptionSideBySideChainTable$lambda$7(snapshotState4CollectAsStateWithLifecycle22);
                                                                        if (eventOptionSideBySideChainTable$lambda$7 != null) {
                                                                        }
                                                                        OptionChainExpirationDateState expirationDateState42 = OptionSideBySideChainTable$lambda$8(snapshotState4CollectAsStateWithLifecycle).getExpirationDateState();
                                                                        if (expirationDateState42 == null) {
                                                                        }
                                                                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                                                                        zChanged4 = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(optionSideBySideChainTableDuxo4);
                                                                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                                                        if (!zChanged4) {
                                                                            objRememberedValue9 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$8$1(optionSideBySideChainTableDuxo4, snapshotState4CollectAsStateWithLifecycle, null);
                                                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                                                            composerStartRestartGroup.endReplaceGroup();
                                                                            EffectsKt.LaunchedEffect(key4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composerStartRestartGroup, 0);
                                                                            Boolean boolValueOf52 = Boolean.valueOf(OptionSideBySideChainTable$lambda$10(snapshotState));
                                                                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                                                                            zChanged5 = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(optionSideBySideChainTableDuxo4);
                                                                            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                                                            if (!zChanged5) {
                                                                                objRememberedValue10 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$9$1(optionSideBySideChainTableDuxo4, snapshotState4CollectAsStateWithLifecycle, snapshotState, null);
                                                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                                                                composerStartRestartGroup.endReplaceGroup();
                                                                                EffectsKt.LaunchedEffect(boolValueOf52, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, 0);
                                                                                String key52 = expirationDateState.getKey();
                                                                                Boolean boolValueOf62 = Boolean.valueOf(OptionSideBySideChainTable$lambda$8(snapshotState4CollectAsStateWithLifecycle).getShouldShowZeroDteBottomSheet());
                                                                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                                                                int i482 = i30;
                                                                                if (i482 != 32) {
                                                                                    zChanged6 = (i482 != 32 || ((i13 & 64) != 0 && composerStartRestartGroup.changedInstance(expirationDateState))) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((i45 & 57344) != 16384);
                                                                                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                                                                    if (!zChanged6) {
                                                                                        objRememberedValue11 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$10$1(expirationDateState, showDiscoverZeroDteBottomSheetIfNotYet, snapshotState4CollectAsStateWithLifecycle, null);
                                                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                                                                                        composerStartRestartGroup.endReplaceGroup();
                                                                                        EffectsKt.LaunchedEffect(key52, boolValueOf62, (Function2) objRememberedValue11, composerStartRestartGroup, 0);
                                                                                        objArr = new Object[]{expirationDateState.getKey(), OptionSideBySideChainTable$lambda$8(snapshotState4CollectAsStateWithLifecycle).getSelloutTimeWhenShouldShowSelloutWarningSnackbar(), Boolean.valueOf(selectedLegs.isEmpty()), Boolean.valueOf(z5)};
                                                                                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                                                                                        if (i482 != 32) {
                                                                                            zChanged7 = (i482 != 32 || ((i13 & 64) != 0 && composerStartRestartGroup.changedInstance(expirationDateState))) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((i45 & 3670016) != 1048576) | composerStartRestartGroup.changedInstance(selectedLegs) | ((i45 & 458752) != 131072);
                                                                                            Object objRememberedValue252 = composerStartRestartGroup.rememberedValue();
                                                                                            if (zChanged7) {
                                                                                                objArr2 = objArr;
                                                                                                optionSideBySideChainTableDuxo5 = optionSideBySideChainTableDuxo4;
                                                                                                view2 = view;
                                                                                                snapshotState2 = snapshotState;
                                                                                                optionSideBySideChainTableKt$OptionSideBySideChainTable$11$1 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$11$1(expirationDateState, z5, selectedLegs, showSelloutWarningSnackbar, snapshotState4CollectAsStateWithLifecycle, null);
                                                                                                snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                                                                                composerStartRestartGroup.updateRememberedValue(optionSideBySideChainTableKt$OptionSideBySideChainTable$11$1);
                                                                                                composerStartRestartGroup.endReplaceGroup();
                                                                                                EffectsKt.LaunchedEffect(objArr2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) optionSideBySideChainTableKt$OptionSideBySideChainTable$11$1, composerStartRestartGroup, 0);
                                                                                                Boolean boolValueOf72 = Boolean.valueOf(OptionSideBySideChainTable$lambda$8(snapshotState4).isNuxAnimationFinished());
                                                                                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                                                                                zChanged8 = composerStartRestartGroup.changed(snapshotState4) | ((i45 & 29360128) != 8388608);
                                                                                                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                                                                                if (!zChanged8) {
                                                                                                    objRememberedValue12 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$12$1(resetUserIdleTimer, snapshotState4, null);
                                                                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                                                                                                    composerStartRestartGroup.endReplaceGroup();
                                                                                                    EffectsKt.LaunchedEffect(boolValueOf72, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue12, composerStartRestartGroup, 0);
                                                                                                    SpreadSelectionState spreadSelectionState2 = OptionSideBySideChainTable$lambda$8(snapshotState4).getSpreadSelectionState();
                                                                                                    if (spreadSelectionState2 == null) {
                                                                                                    }
                                                                                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                                                                                    zChanged9 = composerStartRestartGroup.changed(boolValueOf) | ((i45 & 234881024) != 67108864);
                                                                                                    objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                                                                                                    if (!zChanged9) {
                                                                                                        objRememberedValue13 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$13$1(setSpreadSelectedOnCurrentPage, boolValueOf, null);
                                                                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                                                                                                        composerStartRestartGroup.endReplaceGroup();
                                                                                                        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue13, composerStartRestartGroup, 0);
                                                                                                        Boolean boolValueOf82 = Boolean.valueOf(OptionSideBySideChainTable$lambda$10(snapshotState2));
                                                                                                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                                                                                                        zChanged10 = ((i45 & 14) != 4) | composerStartRestartGroup.changed(snapshotState2);
                                                                                                        objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                                                                                                        if (!zChanged10) {
                                                                                                            objRememberedValue14 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$14$1(onTableReady, snapshotState2, null);
                                                                                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                                                                                                            composerStartRestartGroup.endReplaceGroup();
                                                                                                            EffectsKt.LaunchedEffect(boolValueOf82, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue14, composerStartRestartGroup, 0);
                                                                                                            final Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                                                                                            final float fMo7449getContainerSizeYbymL2g2 = (int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32);
                                                                                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                                                                                            objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                                                                                                            if (objRememberedValue15 == companion.getEmpty()) {
                                                                                                            }
                                                                                                            composerStartRestartGroup.endReplaceGroup();
                                                                                                            Tuples2<C2002Dp, Integer> tuples2OptionSideBySideChainTable$lambda$272 = OptionSideBySideChainTable$lambda$27((SnapshotState4) objRememberedValue15);
                                                                                                            value = tuples2OptionSideBySideChainTable$lambda$272.component1().getValue();
                                                                                                            iIntValue = tuples2OptionSideBySideChainTable$lambda$272.component2().intValue();
                                                                                                            final SnapshotState4 snapshotState422 = snapshotState4;
                                                                                                            if (callPutSwitcherState != OptionSideBySideChainDataState2.BOTH) {
                                                                                                            }
                                                                                                            int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
                                                                                                            SnapshotState snapshotState32 = snapshotState2;
                                                                                                            i32 = iArr2[callPutSwitcherState.ordinal()];
                                                                                                            if (i32 != 1) {
                                                                                                            }
                                                                                                            boolean z82 = z7;
                                                                                                            SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI6 = AnimateAsState.m4812animateDpAsStateAjpBEmI(strikeCellWidthDp, null, "leftScrollableRowOffset animation", null, composerStartRestartGroup, 384, 10);
                                                                                                            i33 = iArr2[callPutSwitcherState.ordinal()];
                                                                                                            if (i33 != 1) {
                                                                                                            }
                                                                                                            SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI22 = AnimateAsState.m4812animateDpAsStateAjpBEmI(fM7995constructorimpl, null, "leftScrollableRowWidth animation", null, composerStartRestartGroup, 384, 10);
                                                                                                            i34 = iArr2[callPutSwitcherState.ordinal()];
                                                                                                            if (i34 != 1) {
                                                                                                            }
                                                                                                            SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI32 = AnimateAsState.m4812animateDpAsStateAjpBEmI(fM7995constructorimpl2, null, "rightScrollableRowOffset animation", null, composerStartRestartGroup, 384, 10);
                                                                                                            i35 = iArr2[callPutSwitcherState.ordinal()];
                                                                                                            if (i35 != 1) {
                                                                                                            }
                                                                                                            SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI42 = AnimateAsState.m4812animateDpAsStateAjpBEmI(fM7995constructorimpl3, null, "rightScrollableRowWidth animation", null, composerStartRestartGroup, 384, 10);
                                                                                                            i36 = iArr2[callPutSwitcherState.ordinal()];
                                                                                                            fM7995constructorimpl4 = i36 == 1 ? C2002Dp.m7995constructorimpl(0) : C2002Dp.m7995constructorimpl(0);
                                                                                                            SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI52 = AnimateAsState.m4812animateDpAsStateAjpBEmI(fM7995constructorimpl4, null, "stickCellOffset animation", null, composerStartRestartGroup, 384, 10);
                                                                                                            Brush.Companion companion32 = Brush.INSTANCE;
                                                                                                            Float fValueOf3 = Float.valueOf(0.0f);
                                                                                                            Color.Companion companion42 = Color.INSTANCE;
                                                                                                            Tuples2 tuples2M3642to2 = Tuples4.m3642to(fValueOf3, Color.m6701boximpl(companion42.m6725getTransparent0d7_KjU()));
                                                                                                            Float fValueOf22 = Float.valueOf(0.15f);
                                                                                                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                                                                                            int i492 = BentoTheme.$stable;
                                                                                                            Brush brushM6677horizontalGradient8A3gB4$default2 = Brush.Companion.m6677horizontalGradient8A3gB4$default(companion32, new Tuples2[]{tuples2M3642to2, Tuples4.m3642to(fValueOf22, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i492).m21371getBg0d7_KjU())), Tuples4.m3642to(Float.valueOf(0.85f), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i492).m21371getBg0d7_KjU())), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(companion42.m6725getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null);
                                                                                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                                                                                            objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                                                                                                            if (objRememberedValue16 == companion.getEmpty()) {
                                                                                                            }
                                                                                                            SnapshotState4 snapshotState432 = (SnapshotState4) objRememberedValue16;
                                                                                                            composerStartRestartGroup.endReplaceGroup();
                                                                                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                                                                                            objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                                                                                                            if (objRememberedValue17 == companion.getEmpty()) {
                                                                                                            }
                                                                                                            SnapshotState snapshotState52 = (SnapshotState) objRememberedValue17;
                                                                                                            composerStartRestartGroup.endReplaceGroup();
                                                                                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                                                                                            objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                                                                                                            if (objRememberedValue18 == companion.getEmpty()) {
                                                                                                            }
                                                                                                            SnapshotState snapshotState62 = (SnapshotState) objRememberedValue18;
                                                                                                            composerStartRestartGroup.endReplaceGroup();
                                                                                                            Integer quoteIndex2 = OptionSideBySideChainTable$lambda$8(snapshotState422).getQuoteIndex();
                                                                                                            int size2 = OptionSideBySideChainTable$lambda$8(snapshotState422).getHeaderState().getMetrics().size();
                                                                                                            Integer numValueOf2 = Integer.valueOf(size2);
                                                                                                            composerStartRestartGroup.startReplaceGroup(5004770);
                                                                                                            zChangedInstance6 = composerStartRestartGroup.changedInstance(animatable2);
                                                                                                            objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                                                                                                            if (!zChangedInstance6) {
                                                                                                                objRememberedValue19 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$15$1(animatable2, null);
                                                                                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                                                                                                                composerStartRestartGroup.endReplaceGroup();
                                                                                                                EffectsKt.LaunchedEffect(callPutSwitcherState, numValueOf2, (Function2) objRememberedValue19, composerStartRestartGroup, (i13 >> 21) & 14);
                                                                                                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                                                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                                                                                objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                                                                                                                if (objRememberedValue20 == companion.getEmpty()) {
                                                                                                                }
                                                                                                                ViewConfiguration viewConfiguration22 = (ViewConfiguration) objRememberedValue20;
                                                                                                                composerStartRestartGroup.endReplaceGroup();
                                                                                                                companion2 = Modifier.INSTANCE;
                                                                                                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                                                                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                                                                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                                                                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                                                                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                                                                                                                ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
                                                                                                                Function0<ComposeUiNode> constructor2 = companion52.getConstructor();
                                                                                                                if (composerStartRestartGroup.getApplier() == null) {
                                                                                                                }
                                                                                                                composerStartRestartGroup.startReusableNode();
                                                                                                                if (composerStartRestartGroup.getInserting()) {
                                                                                                                }
                                                                                                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                                                                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion52.getSetMeasurePolicy());
                                                                                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion52.getSetResolvedCompositionLocals());
                                                                                                                setCompositeKeyHash = companion52.getSetCompositeKeyHash();
                                                                                                                if (!composerM6388constructorimpl.getInserting()) {
                                                                                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                                                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion52.getSetModifier());
                                                                                                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                                                                                    ProvidedValue<ViewConfiguration> providedValueProvides2 = CompositionLocalsKt.getLocalViewConfiguration().provides(viewConfiguration22);
                                                                                                                    OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo82 = optionSideBySideChainTableDuxo5;
                                                                                                                    OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1 optionSideBySideChainTableKt$OptionSideBySideChainTable$16$12 = new OptionSideBySideChainTableKt$OptionSideBySideChainTable$16$1(optionSideBySideChainTableDuxo82, size2, value, iIntValue, callPutSwitcherState, density2, coroutineScope, animatable2, snapshotState422, quoteIndex2, onEnableTradeOnExpiration, brushM6677horizontalGradient8A3gB4$default2, snapshotState4M4812animateDpAsStateAjpBEmI6, snapshotState4M4812animateDpAsStateAjpBEmI22, snapshotState4M4812animateDpAsStateAjpBEmI32, snapshotState4M4812animateDpAsStateAjpBEmI42, snapshotState4M4812animateDpAsStateAjpBEmI52, snapshotState52, snapshotState62, lazyListState, event, view2, z82, onBidAskCellSingleTap, onBidAskCellDoubleTap, function3, onHighlightAnimationPlayed, launchMode, optionSideBySideChainDataState7, setSeenSpreadTooltip, logSpreadTooltipAppear, z4, snapshotState32, selectedLegs, fMo7449getContainerSizeYbymL2g2, optionChainTooltipBanner3, nuxMode, z2, onTopTooltipBannerDismiss, onTopTooltipBannerAppear, snapshotState432, snapshotLongState22, snapshotState4CollectAsStateWithLifecycle22);
                                                                                                                    final LazyListState lazyListState22 = lazyListState;
                                                                                                                    CompositionLocal3.CompositionLocalProvider(providedValueProvides2, ComposableLambda3.rememberComposableLambda(1594738531, true, optionSideBySideChainTableKt$OptionSideBySideChainTable$16$12, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                                                                                                    composerStartRestartGroup.startReplaceGroup(-302717810);
                                                                                                                    optionSideBySideChainDataState5 = sbsFooterEducationAnimationState;
                                                                                                                    if (optionSideBySideChainDataState5 != OptionSideBySideChainDataState5.NOT_PLAYING) {
                                                                                                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                                                                                                        objRememberedValue21 = composerStartRestartGroup.rememberedValue();
                                                                                                                        if (objRememberedValue21 == companion.getEmpty()) {
                                                                                                                        }
                                                                                                                        composerStartRestartGroup.endReplaceGroup();
                                                                                                                        m17266OptionSideBySideChainTableOverlayQ2ewo60(animationPhase, value, iIntValue, TableConstants.getStrikeCellWidthDp(), OptionSideBySideChainTable$lambda$50$lambda$49((SnapshotState4) objRememberedValue21), SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), composerStartRestartGroup, ((i29 >> 21) & 14) | 199680, 0);
                                                                                                                        composer2 = composerStartRestartGroup;
                                                                                                                        composer2.endReplaceGroup();
                                                                                                                        composer2.endNode();
                                                                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                                                                        }
                                                                                                                        optionSideBySideChainTableDuxo6 = optionSideBySideChainTableDuxo82;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    final OptionSideBySideChainDataState5 optionSideBySideChainDataState52 = optionSideBySideChainDataState5;
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return OptionSideBySideChainTableKt.OptionSideBySideChainTable$lambda$51(uuid, expirationDateState, selectedLegs, z, nuxMode, z2, z3, callPutSwitcherState, event, optionSideBySideChainDataState7, optionChainTooltipBanner3, targetLegs, bigDecimal, launchMode, onBidAskCellSingleTap, onBidAskCellDoubleTap, function3, animationPhase, optionSideBySideChainDataState52, z4, onTableReady, onMultilegReplace, onEnableTradeOnExpiration, onHighlightAnimationPlayed, showDiscoverZeroDteBottomSheetIfNotYet, showSelloutWarningSnackbar, z5, resetUserIdleTimer, setSpreadSelectedOnCurrentPage, setSeenSpreadTooltip, onTopTooltipBannerDismiss, onTopTooltipBannerAppear, logSpreadTooltipAppear, optionSideBySideChainTableDuxo6, i, i2, i3, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i27 = i46 | 384;
                            if ((i25 & 3072) == 0) {
                            }
                            int i472 = i27;
                            if ((i13 & 306783379) == 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if ((i6 & 4) == 0) {
                                        optionSideBySideChainTableDuxo2 = optionSideBySideChainTableDuxo;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    companion = Composer.INSTANCE;
                                    if (objRememberedValue == companion.getEmpty()) {
                                    }
                                    animatable = (Animatable) objRememberedValue;
                                    composerStartRestartGroup.endReplaceGroup();
                                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                    String key62 = expirationDateState.getKey();
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    i28 = i13 & 112;
                                    i29 = i18;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i24 = i23;
                        if ((i5 & 536870912) == 0) {
                        }
                        int i452 = i24;
                        if ((i5 & 1073741824) == 0) {
                        }
                        if ((i6 & 1) == 0) {
                        }
                        int i462 = i26;
                        if ((i6 & 2) != 0) {
                        }
                        if ((i25 & 3072) == 0) {
                        }
                        int i4722 = i27;
                        if ((i13 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    if ((i5 & i10) != 0) {
                    }
                    if ((i5 & 262144) != 0) {
                    }
                    if ((i5 & 524288) != 0) {
                    }
                    if ((i5 & i11) != 0) {
                    }
                    if ((i5 & 2097152) != 0) {
                    }
                    int i422 = i20;
                    if ((i5 & 4194304) != 0) {
                    }
                    if ((i5 & 8388608) != 0) {
                    }
                    if ((i5 & 16777216) != 0) {
                    }
                    if ((i5 & 33554432) != 0) {
                    }
                    if ((i5 & 67108864) != 0) {
                    }
                    if ((i5 & 134217728) != 0) {
                    }
                    if ((i5 & 268435456) != 0) {
                    }
                    i24 = i23;
                    if ((i5 & 536870912) == 0) {
                    }
                    int i4522 = i24;
                    if ((i5 & 1073741824) == 0) {
                    }
                    if ((i6 & 1) == 0) {
                    }
                    int i4622 = i26;
                    if ((i6 & 2) != 0) {
                    }
                    if ((i25 & 3072) == 0) {
                    }
                    int i47222 = i27;
                    if ((i13 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i5 & 8192) == 0) {
                }
                if ((i5 & 16384) == 0) {
                }
                if ((32768 & i5) == 0) {
                }
                if ((i5 & 65536) == 0) {
                }
                if ((i5 & i10) != 0) {
                }
                if ((i5 & 262144) != 0) {
                }
                if ((i5 & 524288) != 0) {
                }
                if ((i5 & i11) != 0) {
                }
                if ((i5 & 2097152) != 0) {
                }
                int i4222 = i20;
                if ((i5 & 4194304) != 0) {
                }
                if ((i5 & 8388608) != 0) {
                }
                if ((i5 & 16777216) != 0) {
                }
                if ((i5 & 33554432) != 0) {
                }
                if ((i5 & 67108864) != 0) {
                }
                if ((i5 & 134217728) != 0) {
                }
                if ((i5 & 268435456) != 0) {
                }
                i24 = i23;
                if ((i5 & 536870912) == 0) {
                }
                int i45222 = i24;
                if ((i5 & 1073741824) == 0) {
                }
                if ((i6 & 1) == 0) {
                }
                int i46222 = i26;
                if ((i6 & 2) != 0) {
                }
                if ((i25 & 3072) == 0) {
                }
                int i472222 = i27;
                if ((i13 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i5 & 512) != 0) {
            }
            i13 = i12;
            if ((i5 & 1024) != 0) {
            }
            int i402 = i15;
            if ((i5 & 2048) != 0) {
            }
            if ((i5 & 4096) != 0) {
            }
            if ((i5 & 8192) == 0) {
            }
            if ((i5 & 16384) == 0) {
            }
            if ((32768 & i5) == 0) {
            }
            if ((i5 & 65536) == 0) {
            }
            if ((i5 & i10) != 0) {
            }
            if ((i5 & 262144) != 0) {
            }
            if ((i5 & 524288) != 0) {
            }
            if ((i5 & i11) != 0) {
            }
            if ((i5 & 2097152) != 0) {
            }
            int i42222 = i20;
            if ((i5 & 4194304) != 0) {
            }
            if ((i5 & 8388608) != 0) {
            }
            if ((i5 & 16777216) != 0) {
            }
            if ((i5 & 33554432) != 0) {
            }
            if ((i5 & 67108864) != 0) {
            }
            if ((i5 & 134217728) != 0) {
            }
            if ((i5 & 268435456) != 0) {
            }
            i24 = i23;
            if ((i5 & 536870912) == 0) {
            }
            int i452222 = i24;
            if ((i5 & 1073741824) == 0) {
            }
            if ((i6 & 1) == 0) {
            }
            int i462222 = i26;
            if ((i6 & 2) != 0) {
            }
            if ((i25 & 3072) == 0) {
            }
            int i4722222 = i27;
            if ((i13 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i5 & 16) == 0) {
        }
        if ((i5 & 32) == 0) {
        }
        int i392 = i9;
        if ((i5 & 64) == 0) {
        }
        if ((i5 & 128) == 0) {
        }
        if ((i5 & 256) == 0) {
        }
        if ((i5 & 512) != 0) {
        }
        i13 = i12;
        if ((i5 & 1024) != 0) {
        }
        int i4022 = i15;
        if ((i5 & 2048) != 0) {
        }
        if ((i5 & 4096) != 0) {
        }
        if ((i5 & 8192) == 0) {
        }
        if ((i5 & 16384) == 0) {
        }
        if ((32768 & i5) == 0) {
        }
        if ((i5 & 65536) == 0) {
        }
        if ((i5 & i10) != 0) {
        }
        if ((i5 & 262144) != 0) {
        }
        if ((i5 & 524288) != 0) {
        }
        if ((i5 & i11) != 0) {
        }
        if ((i5 & 2097152) != 0) {
        }
        int i422222 = i20;
        if ((i5 & 4194304) != 0) {
        }
        if ((i5 & 8388608) != 0) {
        }
        if ((i5 & 16777216) != 0) {
        }
        if ((i5 & 33554432) != 0) {
        }
        if ((i5 & 67108864) != 0) {
        }
        if ((i5 & 134217728) != 0) {
        }
        if ((i5 & 268435456) != 0) {
        }
        i24 = i23;
        if ((i5 & 536870912) == 0) {
        }
        int i4522222 = i24;
        if ((i5 & 1073741824) == 0) {
        }
        if ((i6 & 1) == 0) {
        }
        int i4622222 = i26;
        if ((i6 & 2) != 0) {
        }
        if ((i25 & 3072) == 0) {
        }
        int i47222222 = i27;
        if ((i13 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionSideBySideChainTable$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tuples2 OptionSideBySideChainTable$lambda$26$lambda$25(Density density, float f) {
        float fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(TableConstants.getTargetTableCellWidthDp());
        float fMo5016toPx0680j_42 = (f - density.mo5016toPx0680j_4(TableConstants.getStrikeCellWidthDp())) * 0.5f;
        int iCoerceAtLeast = RangesKt.coerceAtLeast((int) (fMo5016toPx0680j_42 / fMo5016toPx0680j_4), 2);
        return Tuples4.m3642to(C2002Dp.m7993boximpl(density.mo5013toDpu2uoSUM((int) (fMo5016toPx0680j_42 / iCoerceAtLeast))), Integer.valueOf(iCoerceAtLeast));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean OptionSideBySideChainTable$lambda$35$lambda$34(Density density, Animatable animatable, float f) {
        return ((Number) animatable.getValue()).floatValue() > (density.mo5016toPx0680j_4(f) * ((float) 2)) - 0.01f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionSideBySideChainTable$lambda$39(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionSideBySideChainTable$lambda$42(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2002Dp OptionSideBySideChainTable$lambda$50$lambda$48$lambda$47(LazyListState lazyListState, Density density, SnapshotState4 snapshotState4) {
        Object next;
        LazyListLayoutInfo layoutInfo = lazyListState.getLayoutInfo();
        Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int index = ((LazyListItemInfo) next).getIndex();
            Integer disclosureIndex = OptionSideBySideChainTable$lambda$8(snapshotState4).getDisclosureIndex();
            if (disclosureIndex != null && index == disclosureIndex.intValue()) {
                break;
            }
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
        return C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(density.mo5013toDpu2uoSUM(lazyListItemInfo != null ? lazyListItemInfo.getOffset() : (int) (layoutInfo.mo5206getViewportSizeYbymL2g() & 4294967295L)) + TableConstants.getCellHeightDp()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da A[LOOP:0: B:79:0x00d8->B:80:0x00da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec A[LOOP:1: B:82:0x00ea->B:83:0x00ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0149  */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* renamed from: OptionSideBySideChainTableOverlay-Q2ewo60, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m17266OptionSideBySideChainTableOverlayQ2ewo60(final TableHighlightPhase tableHighlightPhase, float f, final int i, float f2, final float f3, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        float f4;
        float f5;
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        int i8;
        ?? Plus;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(466379853);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(tableHighlightPhase.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                f4 = f;
                i4 |= composerStartRestartGroup.changed(f4) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(i) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    f5 = f2;
                    i4 |= composerStartRestartGroup.changed(f5) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changed(f3) ? 16384 : 8192;
                }
                i5 = i3 & 32;
                if (i5 == 0) {
                    if ((196608 & i2) == 0) {
                        modifier2 = modifier;
                        i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                    }
                    if ((74899 & i4) != 74898 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                    } else {
                        Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(466379853, i4, -1, "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableOverlay (OptionSideBySideChainTable.kt:771)");
                        }
                        ArrayList arrayList = new ArrayList(i);
                        for (i6 = 0; i6 < i; i6++) {
                            arrayList.add(C2002Dp.m7993boximpl(f4));
                        }
                        ArrayList arrayList2 = new ArrayList(i);
                        for (i7 = 0; i7 < i; i7++) {
                            arrayList2.add(C2002Dp.m7993boximpl(f4));
                        }
                        List listPlus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection<? extends C2002Dp>) arrayList, C2002Dp.m7993boximpl(f5)), (Iterable) arrayList2);
                        i8 = WhenMappings.$EnumSwitchMapping$1[tableHighlightPhase.ordinal()];
                        if (i8 != 1) {
                            ArrayList arrayList3 = new ArrayList(i);
                            int i9 = 0;
                            while (i9 < i) {
                                arrayList3.add(Boolean.valueOf(i9 != 0));
                                i9++;
                            }
                            Plus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection<? extends Boolean>) arrayList3, Boolean.TRUE), (Iterable) arrayList3);
                        } else if (i8 == 2) {
                            ArrayList arrayList4 = new ArrayList(i);
                            int i10 = 0;
                            while (i10 < i) {
                                arrayList4.add(Boolean.valueOf(i10 != 1));
                                i10++;
                            }
                            Plus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection<? extends Boolean>) arrayList4, Boolean.TRUE), (Iterable) arrayList4);
                        } else {
                            int size = listPlus.size();
                            Plus = new ArrayList(size);
                            for (int i11 = 0; i11 < size; i11++) {
                                Plus.add(Boolean.FALSE);
                            }
                        }
                        Object obj = null;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(258691550);
                        for (Tuples2 tuples2 : CollectionsKt.zip(listPlus, (Iterable) Plus)) {
                            BoxKt.Box(Background3.m4872backgroundbw27NRU$default(SizeKt.m5156height3ABfNKs(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, ((C2002Dp) tuples2.component1()).getValue()), f3), Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), m2346x74836174(AnimateAsState.animateFloatAsState(((Boolean) tuples2.component2()).booleanValue() ? 0.7f : 0.0f, AnimationSpecKt.tween$default(300, 0, Easing3.getFastOutSlowInEasing(), 2, obj), 0.0f, null, null, composerStartRestartGroup, 0, 28)), 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composerStartRestartGroup, 0);
                            modifier3 = modifier3;
                            obj = obj;
                        }
                        Modifier modifier4 = modifier3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final float f6 = f4;
                        final float f7 = f5;
                        final Modifier modifier5 = modifier2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return OptionSideBySideChainTableKt.OptionSideBySideChainTableOverlay_Q2ewo60$lambda$60(tableHighlightPhase, f6, i, f7, f3, modifier5, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 196608;
                modifier2 = modifier;
                if ((74899 & i4) != 74898) {
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ArrayList arrayList5 = new ArrayList(i);
                    while (i6 < i) {
                    }
                    ArrayList arrayList22 = new ArrayList(i);
                    while (i7 < i) {
                    }
                    List listPlus2 = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection<? extends C2002Dp>) arrayList5, C2002Dp.m7993boximpl(f5)), (Iterable) arrayList22);
                    i8 = WhenMappings.$EnumSwitchMapping$1[tableHighlightPhase.ordinal()];
                    if (i8 != 1) {
                    }
                    Object obj2 = null;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(258691550);
                        while (r0.hasNext()) {
                        }
                        Modifier modifier42 = modifier3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier42;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f5 = f2;
            if ((i3 & 16) != 0) {
            }
            i5 = i3 & 32;
            if (i5 == 0) {
            }
            modifier2 = modifier;
            if ((74899 & i4) != 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        f4 = f;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        f5 = f2;
        if ((i3 & 16) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        if ((74899 & i4) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0630 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:341:? A[RETURN, SYNTHETIC] */
    /* renamed from: OptionSideBySideChainTableRow-irZm130, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17267OptionSideBySideChainTableRowirZm130(final float f, TwoSidedScrollableRow tableRowState, final OptionSideBySideChainDataState2 callPutSwitcherState, final float f2, final float f3, final float f4, final float f5, final float f6, final Brush stickyCellBackgroundBrush, final float f7, final boolean z, SpreadSelectionState spreadSelectionState, DragTarget dragTarget, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function12, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function32, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function33, Function1<? super DragTarget, Unit> function13, Function0<Unit> function0, Composer composer, final int i, final int i2, final int i3) {
        float f8;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Function1<? super Offset, Unit> function14;
        Function1<? super Offset, Unit> function15;
        SpreadSelectionState spreadSelectionState2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z2;
        Object objRememberedValue;
        final Function1<? super Offset, Unit> function16;
        SpreadSelectionState spreadSelectionState3;
        int i22;
        int i23;
        Object obj;
        float f9;
        boolean z3;
        Composer composer2;
        boolean z4;
        Object objRememberedValue2;
        final Function1<? super Offset, Unit> function17;
        TwoSidedScrollableRow twoSidedScrollableRow;
        final DragTarget dragTarget2;
        final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function34;
        final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function35;
        final Function1<? super DragTarget, Unit> function18;
        final Function0<Unit> function02;
        final Function1<? super Offset, Unit> function19;
        final Function1<? super Offset, Unit> function110;
        final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function36;
        OptionSideBySideChainDataState2 optionSideBySideChainDataState2;
        boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(tableRowState, "tableRowState");
        Intrinsics.checkNotNullParameter(callPutSwitcherState, "callPutSwitcherState");
        Intrinsics.checkNotNullParameter(stickyCellBackgroundBrush, "stickyCellBackgroundBrush");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1470122236);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
            f8 = f;
        } else if ((i & 6) == 0) {
            f8 = f;
            i4 = i | (composerStartRestartGroup.changed(f8) ? 4 : 2);
        } else {
            f8 = f;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? composerStartRestartGroup.changed(tableRowState) : composerStartRestartGroup.changedInstance(tableRowState) ? 32 : 16;
        }
        int i24 = i4;
        if ((i3 & 4) != 0) {
            i24 |= 384;
        } else if ((i & 384) == 0) {
            i24 |= composerStartRestartGroup.changed(callPutSwitcherState.ordinal()) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i24 |= 3072;
        } else if ((i & 3072) == 0) {
            i24 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i24 |= 24576;
        } else if ((i & 24576) == 0) {
            i24 |= composerStartRestartGroup.changed(f3) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i24 |= 196608;
        } else if ((i & 196608) == 0) {
            i24 |= composerStartRestartGroup.changed(f4) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i24 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i24 |= composerStartRestartGroup.changed(f5) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i24 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i24 |= composerStartRestartGroup.changed(f6) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i24 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i24 |= composerStartRestartGroup.changed(stickyCellBackgroundBrush) ? 67108864 : 33554432;
        }
        if ((i3 & 512) != 0) {
            i24 |= 805306368;
        } else {
            if ((i & 805306368) == 0) {
                i24 |= composerStartRestartGroup.changed(f7) ? 536870912 : 268435456;
            }
            if ((i3 & 1024) == 0) {
                i5 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i5 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
            int i25 = i5;
            i6 = i3 & 2048;
            if (i6 == 0) {
                i9 = i25 | 48;
                i7 = i6;
            } else if ((i2 & 48) == 0) {
                i7 = i6;
                i9 = i25 | (composerStartRestartGroup.changedInstance(spreadSelectionState) ? 32 : 16);
            } else {
                i7 = i6;
                i8 = i25;
                i10 = i3 & 4096;
                if (i10 != 0) {
                    i11 = i8 | 384;
                } else {
                    int i26 = i8;
                    if ((i2 & 384) == 0) {
                        i11 = i26 | (composerStartRestartGroup.changedInstance(dragTarget) ? 256 : 128);
                    } else {
                        i11 = i26;
                    }
                }
                i12 = i3 & 8192;
                if (i12 != 0) {
                    i13 = i11 | 3072;
                } else {
                    int i27 = i11;
                    if ((i2 & 3072) == 0) {
                        i27 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
                    }
                    i13 = i27;
                }
                i14 = i3 & 16384;
                if (i14 == 0) {
                    i15 = i13;
                    if ((i2 & 24576) == 0) {
                        i15 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
                    }
                    i16 = i3 & 32768;
                    if (i16 == 0) {
                        i15 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        i15 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
                    }
                    i17 = i3 & 65536;
                    if (i17 == 0) {
                        i15 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i15 |= composerStartRestartGroup.changedInstance(function32) ? 1048576 : 524288;
                    }
                    i18 = i3 & 131072;
                    if (i18 == 0) {
                        i15 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i15 |= composerStartRestartGroup.changedInstance(function33) ? 8388608 : 4194304;
                    }
                    i19 = i3 & 262144;
                    if (i19 == 0) {
                        i15 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i15 |= composerStartRestartGroup.changedInstance(function13) ? 67108864 : 33554432;
                    }
                    i20 = i3 & 524288;
                    if (i20 == 0) {
                        i15 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i15 |= composerStartRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
                    }
                    i21 = i15;
                    if ((i24 & 306783379) != 306783378 && (306783379 & i21) == 306783378 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        twoSidedScrollableRow = tableRowState;
                        spreadSelectionState3 = spreadSelectionState;
                        dragTarget2 = dragTarget;
                        function110 = function1;
                        function19 = function12;
                        function36 = function3;
                        function34 = function32;
                        function35 = function33;
                        function18 = function13;
                        function02 = function0;
                    } else {
                        SpreadSelectionState spreadSelectionState4 = i7 == 0 ? null : spreadSelectionState;
                        DragTarget dragTarget3 = i10 == 0 ? null : dragTarget;
                        function14 = i12 == 0 ? null : function1;
                        function15 = i14 == 0 ? null : function12;
                        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function37 = i16 == 0 ? null : function3;
                        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function38 = i17 == 0 ? null : function32;
                        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function39 = i18 == 0 ? null : function33;
                        Function1<? super DragTarget, Unit> function111 = i19 == 0 ? null : function13;
                        Function0<Unit> function03 = i20 == 0 ? null : function0;
                        if (ComposerKt.isTraceInProgress()) {
                            spreadSelectionState2 = spreadSelectionState4;
                        } else {
                            spreadSelectionState2 = spreadSelectionState4;
                            ComposerKt.traceEventStart(-1470122236, i24, i21, "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableRow (OptionSideBySideChainTable.kt:833)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        OptionContractType optionContractType = OptionContractType.CALL;
                        Modifier modifierM5125offsetVpY3zN4$default = OffsetKt.m5125offsetVpY3zN4$default(SizeKt.m5174width3ABfNKs(companion, f3), f2, 0.0f, 2, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        z2 = (i21 & 7168) != 2048;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            function16 = function14;
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return OptionSideBySideChainTableKt.m2347xd159d609(function16, (LayoutCoordinates) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            function16 = function14;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierM5125offsetVpY3zN4$default, (Function1) objRememberedValue);
                        int i28 = i21 << 12;
                        int i29 = (i24 & 14) | 48 | ((i24 >> 21) & 896) | ((i24 << 6) & 7168) | (458752 & i28) | (i28 & 3670016);
                        int i30 = i21 << 6;
                        int i31 = i29 | (29360128 & i30) | (234881024 & i30) | (i30 & 1879048192);
                        int i32 = (i21 >> 24) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                        Function1<? super Offset, Unit> function112 = function16;
                        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function310 = function37;
                        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function311 = function38;
                        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function312 = function39;
                        Function1<? super DragTarget, Unit> function113 = function111;
                        Function0<Unit> function04 = function03;
                        boolean z6 = true;
                        spreadSelectionState3 = spreadSelectionState2;
                        DragTarget dragTarget4 = dragTarget3;
                        m17265OptionOneSideScrollableRow5Azxhi0(f8, optionContractType, f7, tableRowState, modifierOnGloballyPositioned, spreadSelectionState3, dragTarget4, function310, function311, function312, function113, function04, composerStartRestartGroup, i31, i32, 0);
                        Modifier modifierBackground$default = Background3.background$default(OffsetKt.m5125offsetVpY3zN4$default(companion, f6, 0.0f, 2, null), stickyCellBackgroundBrush, null, 0.0f, 6, null);
                        if (!(tableRowState instanceof TableRowState.Header)) {
                            composerStartRestartGroup.startReplaceGroup(-574781353);
                            final String strStringResource = StringResources_androidKt.stringResource(C24135R.string.option_side_by_side_chain_strike_column_title, composerStartRestartGroup, 0);
                            TableCellTextStyle tableCellTextStyle = TableCellTextStyle.HEADER;
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean zChanged = composerStartRestartGroup.changed(strStringResource);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return OptionSideBySideChainTableKt.m2348xfb233b8d(strStringResource);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            i22 = i31;
                            i23 = 2;
                            obj = null;
                            f9 = 0.0f;
                            z3 = false;
                            TableCell3.m17289TableCellYq1gxAc(new TableCellState.Text(tableCellTextStyle, false, null, LazyKt.lazy((Function0) objRememberedValue3), 6, null), TableConstants.getStrikeCellWidthDp(), -1, modifierBackground$default, null, null, null, null, null, null, null, composerStartRestartGroup, 432, 0, 2032);
                            composer2 = composerStartRestartGroup;
                            composer2.endReplaceGroup();
                        } else {
                            i22 = i31;
                            i23 = 2;
                            obj = null;
                            f9 = 0.0f;
                            z3 = false;
                            if (!(tableRowState instanceof TableRowState.InstrumentRow)) {
                                composerStartRestartGroup.startReplaceGroup(1089835682);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(-574253051);
                            TableRowState.InstrumentRow instrumentRow = (TableRowState.InstrumentRow) tableRowState;
                            TableCell3.m17289TableCellYq1gxAc(instrumentRow.getStickyCell(), TableConstants.getStrikeCellWidthDp(), instrumentRow.getRowIndex(), modifierBackground$default, null, null, null, null, null, null, null, composerStartRestartGroup, 48, 0, 2032);
                            composer2 = composerStartRestartGroup;
                            composer2.endReplaceGroup();
                        }
                        OptionContractType optionContractType2 = OptionContractType.PUT;
                        Modifier modifierM5125offsetVpY3zN4$default2 = OffsetKt.m5125offsetVpY3zN4$default(SizeKt.m5174width3ABfNKs(companion, f5), f4, f9, i23, obj);
                        composer2.startReplaceGroup(5004770);
                        z4 = (i21 & 57344) != 16384 ? true : z3;
                        objRememberedValue2 = composer2.rememberedValue();
                        if (!z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            function17 = function15;
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return OptionSideBySideChainTableKt.m2349x24eca111(function17, (LayoutCoordinates) obj2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        } else {
                            function17 = function15;
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifier3.onGloballyPositioned(modifierM5125offsetVpY3zN4$default2, (Function1) objRememberedValue2);
                        twoSidedScrollableRow = tableRowState;
                        Function1<? super Offset, Unit> function114 = function17;
                        composerStartRestartGroup = composer2;
                        m17265OptionOneSideScrollableRow5Azxhi0(f, optionContractType2, f7, twoSidedScrollableRow, modifierOnGloballyPositioned2, spreadSelectionState3, dragTarget4, function310, function311, function312, function113, function04, composerStartRestartGroup, i22, i32, 0);
                        composerStartRestartGroup.startReplaceGroup(1089896985);
                        if (!(twoSidedScrollableRow instanceof TableRowState.InstrumentRow)) {
                            Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getTopCenter());
                            boolean z7 = (z && ((TableRowState.InstrumentRow) twoSidedScrollableRow).getShowTopHorizontalDivider()) ? true : z3;
                            ComposableSingletons$OptionSideBySideChainTableKt composableSingletons$OptionSideBySideChainTableKt = ComposableSingletons$OptionSideBySideChainTableKt.INSTANCE;
                            AnimatedVisibilityKt.AnimatedVisibility(z7, modifierAlign, (EnterTransition) null, (ExitTransition) null, (String) null, composableSingletons$OptionSideBySideChainTableKt.getLambda$1405615147$feature_options_chain_externalDebug(), composerStartRestartGroup, 196608, 28);
                            AnimatedVisibilityKt.AnimatedVisibility((z && ((TableRowState.InstrumentRow) twoSidedScrollableRow).getShowBottomHorizontalDivider()) ? true : z3, boxScopeInstance.align(companion, companion2.getBottomCenter()), (EnterTransition) null, (ExitTransition) null, (String) null, composableSingletons$OptionSideBySideChainTableKt.getLambda$1311820244$feature_options_chain_externalDebug(), composerStartRestartGroup, 196608, 28);
                            Modifier modifierAlign2 = boxScopeInstance.align(companion, companion2.getCenterStart());
                            TableRowState.InstrumentRow instrumentRow2 = (TableRowState.InstrumentRow) twoSidedScrollableRow;
                            SelectedLegIndicator selectedLegIndicatorOnCallRow = instrumentRow2.getSelectedLegIndicatorOnCallRow();
                            SelectedLegIndicator selectedLegIndicator = SelectedLegIndicator.NONE;
                            if (selectedLegIndicatorOnCallRow != selectedLegIndicator) {
                                if (z) {
                                    optionSideBySideChainDataState2 = callPutSwitcherState;
                                } else {
                                    optionSideBySideChainDataState2 = callPutSwitcherState;
                                    if (optionSideBySideChainDataState2 == OptionSideBySideChainDataState2.PUT) {
                                    }
                                    SelectedLegIndicatorPill(z5, instrumentRow2.getSelectedLegIndicatorOnCallRow(), modifierAlign2, composerStartRestartGroup, 0, 0);
                                    Modifier modifierAlign3 = boxScopeInstance.align(companion, companion2.getCenterEnd());
                                    if (instrumentRow2.getSelectedLegIndicatorOnPutRow() == selectedLegIndicator || (!z && optionSideBySideChainDataState2 != OptionSideBySideChainDataState2.CALL)) {
                                        z6 = z3;
                                    }
                                    SelectedLegIndicatorPill(z6, instrumentRow2.getSelectedLegIndicatorOnPutRow(), modifierAlign3, composerStartRestartGroup, 0, 0);
                                }
                                z5 = true;
                                SelectedLegIndicatorPill(z5, instrumentRow2.getSelectedLegIndicatorOnCallRow(), modifierAlign2, composerStartRestartGroup, 0, 0);
                                Modifier modifierAlign32 = boxScopeInstance.align(companion, companion2.getCenterEnd());
                                if (instrumentRow2.getSelectedLegIndicatorOnPutRow() == selectedLegIndicator) {
                                    z6 = z3;
                                    SelectedLegIndicatorPill(z6, instrumentRow2.getSelectedLegIndicatorOnPutRow(), modifierAlign32, composerStartRestartGroup, 0, 0);
                                }
                            } else {
                                optionSideBySideChainDataState2 = callPutSwitcherState;
                            }
                            z5 = z3;
                            SelectedLegIndicatorPill(z5, instrumentRow2.getSelectedLegIndicatorOnCallRow(), modifierAlign2, composerStartRestartGroup, 0, 0);
                            Modifier modifierAlign322 = boxScopeInstance.align(companion, companion2.getCenterEnd());
                            if (instrumentRow2.getSelectedLegIndicatorOnPutRow() == selectedLegIndicator) {
                            }
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        dragTarget2 = dragTarget4;
                        function34 = function311;
                        function35 = function312;
                        function18 = function113;
                        function02 = function04;
                        function19 = function114;
                        function110 = function112;
                        function36 = function310;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final TwoSidedScrollableRow twoSidedScrollableRow2 = twoSidedScrollableRow;
                        final SpreadSelectionState spreadSelectionState5 = spreadSelectionState3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return OptionSideBySideChainTableKt.OptionSideBySideChainTableRow_irZm130$lambda$68(f, twoSidedScrollableRow2, callPutSwitcherState, f2, f3, f4, f5, f6, stickyCellBackgroundBrush, f7, z, spreadSelectionState5, dragTarget2, function110, function19, function36, function34, function35, function18, function02, i, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i15 = i13 | 24576;
                i16 = i3 & 32768;
                if (i16 == 0) {
                }
                i17 = i3 & 65536;
                if (i17 == 0) {
                }
                i18 = i3 & 131072;
                if (i18 == 0) {
                }
                i19 = i3 & 262144;
                if (i19 == 0) {
                }
                i20 = i3 & 524288;
                if (i20 == 0) {
                }
                i21 = i15;
                if ((i24 & 306783379) != 306783378) {
                    if (i7 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    Alignment.Companion companion22 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        OptionContractType optionContractType3 = OptionContractType.CALL;
                        Modifier modifierM5125offsetVpY3zN4$default3 = OffsetKt.m5125offsetVpY3zN4$default(SizeKt.m5174width3ABfNKs(companion4, f3), f2, 0.0f, 2, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((i21 & 7168) != 2048) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z2) {
                            function16 = function14;
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return OptionSideBySideChainTableKt.m2347xd159d609(function16, (LayoutCoordinates) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierOnGloballyPositioned3 = OnGloballyPositionedModifier3.onGloballyPositioned(modifierM5125offsetVpY3zN4$default3, (Function1) objRememberedValue);
                            int i282 = i21 << 12;
                            int i292 = (i24 & 14) | 48 | ((i24 >> 21) & 896) | ((i24 << 6) & 7168) | (458752 & i282) | (i282 & 3670016);
                            int i302 = i21 << 6;
                            int i312 = i292 | (29360128 & i302) | (234881024 & i302) | (i302 & 1879048192);
                            int i322 = (i21 >> 24) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                            Function1<? super Offset, Unit> function1122 = function16;
                            Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3102 = function37;
                            Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3112 = function38;
                            Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3122 = function39;
                            Function1<? super DragTarget, Unit> function1132 = function111;
                            Function0<Unit> function042 = function03;
                            boolean z62 = true;
                            spreadSelectionState3 = spreadSelectionState2;
                            DragTarget dragTarget42 = dragTarget3;
                            m17265OptionOneSideScrollableRow5Azxhi0(f8, optionContractType3, f7, tableRowState, modifierOnGloballyPositioned3, spreadSelectionState3, dragTarget42, function3102, function3112, function3122, function1132, function042, composerStartRestartGroup, i312, i322, 0);
                            Modifier modifierBackground$default2 = Background3.background$default(OffsetKt.m5125offsetVpY3zN4$default(companion4, f6, 0.0f, 2, null), stickyCellBackgroundBrush, null, 0.0f, 6, null);
                            if (!(tableRowState instanceof TableRowState.Header)) {
                            }
                            OptionContractType optionContractType22 = OptionContractType.PUT;
                            Modifier modifierM5125offsetVpY3zN4$default22 = OffsetKt.m5125offsetVpY3zN4$default(SizeKt.m5174width3ABfNKs(companion4, f5), f4, f9, i23, obj);
                            composer2.startReplaceGroup(5004770);
                            if ((i21 & 57344) != 16384) {
                            }
                            objRememberedValue2 = composer2.rememberedValue();
                            if (z4) {
                                function17 = function15;
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return OptionSideBySideChainTableKt.m2349x24eca111(function17, (LayoutCoordinates) obj2);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                                composer2.endReplaceGroup();
                                Modifier modifierOnGloballyPositioned22 = OnGloballyPositionedModifier3.onGloballyPositioned(modifierM5125offsetVpY3zN4$default22, (Function1) objRememberedValue2);
                                twoSidedScrollableRow = tableRowState;
                                Function1<? super Offset, Unit> function1142 = function17;
                                composerStartRestartGroup = composer2;
                                m17265OptionOneSideScrollableRow5Azxhi0(f, optionContractType22, f7, twoSidedScrollableRow, modifierOnGloballyPositioned22, spreadSelectionState3, dragTarget42, function3102, function3112, function3122, function1132, function042, composerStartRestartGroup, i22, i322, 0);
                                composerStartRestartGroup.startReplaceGroup(1089896985);
                                if (!(twoSidedScrollableRow instanceof TableRowState.InstrumentRow)) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                dragTarget2 = dragTarget42;
                                function34 = function3112;
                                function35 = function3122;
                                function18 = function1132;
                                function02 = function042;
                                function19 = function1142;
                                function110 = function1122;
                                function36 = function3102;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i8 = i9;
            i10 = i3 & 4096;
            if (i10 != 0) {
            }
            i12 = i3 & 8192;
            if (i12 != 0) {
            }
            i14 = i3 & 16384;
            if (i14 == 0) {
            }
            i16 = i3 & 32768;
            if (i16 == 0) {
            }
            i17 = i3 & 65536;
            if (i17 == 0) {
            }
            i18 = i3 & 131072;
            if (i18 == 0) {
            }
            i19 = i3 & 262144;
            if (i19 == 0) {
            }
            i20 = i3 & 524288;
            if (i20 == 0) {
            }
            i21 = i15;
            if ((i24 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 1024) == 0) {
        }
        int i252 = i5;
        i6 = i3 & 2048;
        if (i6 == 0) {
        }
        i8 = i9;
        i10 = i3 & 4096;
        if (i10 != 0) {
        }
        i12 = i3 & 8192;
        if (i12 != 0) {
        }
        i14 = i3 & 16384;
        if (i14 == 0) {
        }
        i16 = i3 & 32768;
        if (i16 == 0) {
        }
        i17 = i3 & 65536;
        if (i17 == 0) {
        }
        i18 = i3 & 131072;
        if (i18 == 0) {
        }
        i19 = i3 & 262144;
        if (i19 == 0) {
        }
        i20 = i3 & 524288;
        if (i20 == 0) {
        }
        i21 = i15;
        if ((i24 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionSideBySideChainTableRow_irZm130$lambda$67$lambda$62$lambda$61 */
    public static final Unit m2347xd159d609(Function1 function1, LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        if (function1 != null) {
            function1.invoke(Offset.m6534boximpl(LayoutCoordinates2.positionInRoot(layoutCoordinates)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionSideBySideChainTableRow_irZm130$lambda$67$lambda$66$lambda$65 */
    public static final Unit m2349x24eca111(Function1 function1, LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        if (function1 != null) {
            function1.invoke(Offset.m6534boximpl(LayoutCoordinates2.positionInRoot(layoutCoordinates)));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* renamed from: OptionOneSideScrollableRow-5Azxhi0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m17265OptionOneSideScrollableRow5Azxhi0(final float f, final OptionContractType optionContractType, final float f2, final TwoSidedScrollableRow twoSidedScrollableRow, Modifier modifier, SpreadSelectionState spreadSelectionState, DragTarget dragTarget, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function3, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function32, Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function33, Function1<? super DragTarget, Unit> function1, Function0<Unit> function0, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        DragTarget dragTarget2;
        int i8;
        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function34;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        List<TableCellState> callCells;
        DragTarget dragTarget3;
        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function35;
        SpreadSelectionState spreadSelectionState2;
        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function36;
        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function37;
        Function1<? super DragTarget, Unit> function12;
        Function0<Unit> function02;
        final Modifier modifier4;
        final SpreadSelectionState spreadSelectionState3;
        final DragTarget dragTarget4;
        final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function38;
        final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function39;
        final Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function310;
        final Function1<? super DragTarget, Unit> function13;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(626586677);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(optionContractType.ordinal()) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(twoSidedScrollableRow) : composerStartRestartGroup.changedInstance(twoSidedScrollableRow) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(spreadSelectionState) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    dragTarget2 = dragTarget;
                } else {
                    dragTarget2 = dragTarget;
                    if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(dragTarget2) ? 1048576 : 524288;
                    }
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                    function34 = function3;
                } else {
                    function34 = function3;
                    if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function34) ? 8388608 : 4194304;
                    }
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function32) ? 67108864 : 33554432;
                }
                i10 = i3 & 512;
                if (i10 == 0) {
                    if ((i & 805306368) == 0) {
                        i11 = i10;
                        i4 |= composerStartRestartGroup.changedInstance(function33) ? 536870912 : 268435456;
                    }
                    i12 = i3 & 1024;
                    if (i12 == 0) {
                        i14 = i2 | 6;
                        i13 = i12;
                    } else if ((i2 & 6) == 0) {
                        i13 = i12;
                        i14 = i2 | (composerStartRestartGroup.changedInstance(function1) ? 4 : 2);
                    } else {
                        i13 = i12;
                        i14 = i2;
                    }
                    i15 = i3 & 2048;
                    if (i15 == 0) {
                        i14 |= 48;
                        i16 = i15;
                    } else if ((i2 & 48) == 0) {
                        i16 = i15;
                        i14 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
                    } else {
                        i16 = i15;
                    }
                    int i17 = i14;
                    if ((i4 & 306783379) != 306783378 && (i17 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        spreadSelectionState3 = spreadSelectionState;
                        function39 = function32;
                        function310 = function33;
                        dragTarget4 = dragTarget2;
                        function38 = function34;
                        modifier4 = modifier2;
                        function13 = function1;
                        function03 = function0;
                    } else {
                        Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        SpreadSelectionState spreadSelectionState4 = i6 == 0 ? null : spreadSelectionState;
                        if (i7 != 0) {
                            dragTarget2 = null;
                        }
                        if (i8 != 0) {
                            function34 = null;
                        }
                        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function311 = i9 == 0 ? null : function32;
                        Function3<? super Boolean, ? super OptionLegBundle, ? super BidAskCellDisableType, Unit> function312 = i11 == 0 ? null : function33;
                        Function1<? super DragTarget, Unit> function14 = i13 == 0 ? null : function1;
                        Function0<Unit> function04 = i16 == 0 ? null : function0;
                        if (ComposerKt.isTraceInProgress()) {
                            modifier3 = modifier5;
                        } else {
                            modifier3 = modifier5;
                            ComposerKt.traceEventStart(626586677, i4, i17, "com.robinhood.android.optionschain.sbschain.table.OptionOneSideScrollableRow (OptionSideBySideChainTable.kt:957)");
                        }
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        Modifier modifierClipToBounds = Clip.clipToBounds(modifier3);
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Modifier modifierM5125offsetVpY3zN4$default = OffsetKt.m5125offsetVpY3zN4$default(SizeKt.wrapContentWidth(modifierClipToBounds, companion.getStart(), true), C2002Dp.m7995constructorimpl(-density.mo5012toDpu2uoSUM(f)), 0.0f, 2, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5125offsetVpY3zN4$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        if (!(twoSidedScrollableRow instanceof TableRowState.Header)) {
                            composerStartRestartGroup.startReplaceGroup(1309908541);
                            final Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                            Iterator<OptionSideBySideChainMetric> it = ((TableRowState.Header) twoSidedScrollableRow).getMetrics().iterator();
                            while (it.hasNext()) {
                                final OptionSideBySideChainMetric next = it.next();
                                TableCellTextStyle tableCellTextStyle = TableCellTextStyle.HEADER;
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                Iterator<OptionSideBySideChainMetric> it2 = it;
                                boolean zChanged = composerStartRestartGroup.changed(next.ordinal()) | composerStartRestartGroup.changedInstance(resources) | ((i4 & 7168) == 2048 || ((i4 & 4096) != 0 && composerStartRestartGroup.changedInstance(twoSidedScrollableRow)));
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return OptionSideBySideChainTableKt.m2345x3b564880(next, resources, twoSidedScrollableRow);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                TableCell3.m17289TableCellYq1gxAc(new TableCellState.Text(tableCellTextStyle, false, null, LazyKt.lazy((Function0) objRememberedValue), 6, null), f2, -1, null, null, null, null, null, null, null, null, composerStartRestartGroup, ((i4 >> 3) & 112) | 384, 0, 2040);
                                it = it2;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            dragTarget3 = dragTarget2;
                            function35 = function311;
                            spreadSelectionState2 = spreadSelectionState4;
                            function36 = function34;
                            function37 = function312;
                            function12 = function14;
                            function02 = function04;
                        } else {
                            if (!(twoSidedScrollableRow instanceof TableRowState.InstrumentRow)) {
                                composerStartRestartGroup.startReplaceGroup(-1204671732);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(1310736954);
                            int i18 = WhenMappings.$EnumSwitchMapping$2[optionContractType.ordinal()];
                            if (i18 == 1) {
                                callCells = ((TableRowState.InstrumentRow) twoSidedScrollableRow).getCallCells();
                            } else {
                                if (i18 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                callCells = ((TableRowState.InstrumentRow) twoSidedScrollableRow).getPutCells();
                            }
                            Iterator<T> it3 = callCells.iterator();
                            while (it3.hasNext()) {
                                TableCell3.m17289TableCellYq1gxAc((TableCellState) it3.next(), f2, ((TableRowState.InstrumentRow) twoSidedScrollableRow).getRowIndex(), null, spreadSelectionState4, dragTarget2, function34, function311, function312, function14, function04, composerStartRestartGroup, ((i4 >> 3) & 268427376) | ((i17 << 27) & 1879048192), (i17 >> 3) & 14, 8);
                            }
                            dragTarget3 = dragTarget2;
                            function35 = function311;
                            spreadSelectionState2 = spreadSelectionState4;
                            function36 = function34;
                            function37 = function312;
                            function12 = function14;
                            function02 = function04;
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        spreadSelectionState3 = spreadSelectionState2;
                        dragTarget4 = dragTarget3;
                        function38 = function36;
                        function39 = function35;
                        function310 = function37;
                        function13 = function12;
                        function03 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return OptionSideBySideChainTableKt.OptionOneSideScrollableRow_5Azxhi0$lambda$75(f, optionContractType, f2, twoSidedScrollableRow, modifier4, spreadSelectionState3, dragTarget4, function38, function39, function310, function13, function03, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 805306368;
                i11 = i10;
                i12 = i3 & 1024;
                if (i12 == 0) {
                }
                i15 = i3 & 2048;
                if (i15 == 0) {
                }
                int i172 = i14;
                if ((i4 & 306783379) != 306783378) {
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    Modifier modifierClipToBounds2 = Clip.clipToBounds(modifier3);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    Modifier modifierM5125offsetVpY3zN4$default2 = OffsetKt.m5125offsetVpY3zN4$default(SizeKt.wrapContentWidth(modifierClipToBounds2, companion3.getStart(), true), C2002Dp.m7995constructorimpl(-density2.mo5012toDpu2uoSUM(f)), 0.0f, 2, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion3.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5125offsetVpY3zN4$default2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        if (!(twoSidedScrollableRow instanceof TableRowState.Header)) {
                        }
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                        spreadSelectionState3 = spreadSelectionState2;
                        dragTarget4 = dragTarget3;
                        function38 = function36;
                        function39 = function35;
                        function310 = function37;
                        function13 = function12;
                        function03 = function02;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i3 & 512;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 1024;
            if (i12 == 0) {
            }
            i15 = i3 & 2048;
            if (i15 == 0) {
            }
            int i1722 = i14;
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i3 & 512;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 1024;
        if (i12 == 0) {
        }
        i15 = i3 & 2048;
        if (i15 == 0) {
        }
        int i17222 = i14;
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionOneSideScrollableRow_5Azxhi0$lambda$74$lambda$72$lambda$71$lambda$70 */
    public static final String m2345x3b564880(OptionSideBySideChainMetric optionSideBySideChainMetric, Resources resources, TwoSidedScrollableRow twoSidedScrollableRow) {
        Intrinsics.checkNotNull(resources);
        return OptionSideBySideChainMetricStrings.getOptionSideBySideChainMetricShortString(optionSideBySideChainMetric, resources, ((TableRowState.Header) twoSidedScrollableRow).getBidAskPriceLabelType());
    }

    private static final void SelectedLegIndicatorPill(boolean z, final SelectedLegIndicator selectedLegIndicator, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-336826789);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(selectedLegIndicator.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-336826789, i3, -1, "com.robinhood.android.optionschain.sbschain.table.SelectedLegIndicatorPill (OptionSideBySideChainTable.kt:1017)");
            }
            z2 = z;
            AnimatedVisibilityKt.AnimatedVisibility(z2, modifier3, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-2122273149, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt.SelectedLegIndicatorPill.1

                /* compiled from: OptionSideBySideChainTable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$SelectedLegIndicatorPill$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[SelectedLegIndicator.values().length];
                        try {
                            iArr[SelectedLegIndicator.BID.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[SelectedLegIndicator.ASK.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[SelectedLegIndicator.NONE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                    long jM21452getNegative0d7_KjU;
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2122273149, i5, -1, "com.robinhood.android.optionschain.sbschain.table.SelectedLegIndicatorPill.<anonymous> (OptionSideBySideChainTable.kt:1022)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(companion, bentoTheme.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM(), TableConstants.getSelectedLegIndicatorHeightDp());
                    int i7 = WhenMappings.$EnumSwitchMapping$0[selectedLegIndicator.ordinal()];
                    if (i7 == 1) {
                        composer2.startReplaceGroup(604979019);
                        jM21452getNegative0d7_KjU = bentoTheme.getColors(composer2, i6).m21452getNegative0d7_KjU();
                        composer2.endReplaceGroup();
                    } else if (i7 == 2) {
                        composer2.startReplaceGroup(604981547);
                        jM21452getNegative0d7_KjU = bentoTheme.getColors(composer2, i6).m21456getPositive0d7_KjU();
                        composer2.endReplaceGroup();
                    } else {
                        if (i7 != 3) {
                            composer2.startReplaceGroup(604976091);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(604983726);
                        composer2.endReplaceGroup();
                        jM21452getNegative0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                    }
                    BoxKt.Box(Background3.m4871backgroundbw27NRU(modifierM5171sizeVpY3zN4, jM21452getNegative0d7_KjU, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM())), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 196608 | ((i3 >> 3) & 112), 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z2 = z;
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z3 = z2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionSideBySideChainTableKt.SelectedLegIndicatorPill$lambda$76(z3, selectedLegIndicator, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionSideBySideChainTableTopBanner(final TopErrorBannerState topErrorBannerState, final float f, Modifier modifier, final Function0<Unit> onEnableTradeOnExpiration, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onEnableTradeOnExpiration, "onEnableTradeOnExpiration");
        Composer composerStartRestartGroup = composer.startRestartGroup(1068775622);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(topErrorBannerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onEnableTradeOnExpiration) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1068775622, i3, -1, "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableTopBanner (OptionSideBySideChainTable.kt:1043)");
                }
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int iCoerceIn = RangesKt.coerceIn((int) (snapshotIntState2.getIntValue() * (1 - f)), (Range2<Integer>) new PrimitiveRanges2(0, snapshotIntState2.getIntValue()));
                Modifier modifier5 = modifier4;
                AnimatedVisibilityKt.AnimatedVisibility((topErrorBannerState == null ? topErrorBannerState.getMessage() : null) != null, Clip.clipToBounds(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), density.mo5013toDpu2uoSUM(iCoerceIn))), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(-749224210, true, new C246062(modifier5, iCoerceIn, snapshotIntState2, topErrorBannerState, onEnableTradeOnExpiration), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionSideBySideChainTableKt.OptionSideBySideChainTableTopBanner$lambda$81(topErrorBannerState, f, modifier3, onEnableTradeOnExpiration, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            int iCoerceIn2 = RangesKt.coerceIn((int) (snapshotIntState22.getIntValue() * (1 - f)), (Range2<Integer>) new PrimitiveRanges2(0, snapshotIntState22.getIntValue()));
            if ((topErrorBannerState == null ? topErrorBannerState.getMessage() : null) != null) {
            }
            Modifier modifier52 = modifier4;
            AnimatedVisibilityKt.AnimatedVisibility((topErrorBannerState == null ? topErrorBannerState.getMessage() : null) != null, Clip.clipToBounds(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), density2.mo5013toDpu2uoSUM(iCoerceIn2))), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(-749224210, true, new C246062(modifier52, iCoerceIn2, snapshotIntState22, topErrorBannerState, onEnableTradeOnExpiration), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 16);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: OptionSideBySideChainTable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTableTopBanner$2 */
    static final class C246062 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotIntState2 $intrinsicHeight$delegate;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onEnableTradeOnExpiration;
        final /* synthetic */ TopErrorBannerState $state;
        final /* synthetic */ int $visibleHeight;

        /* compiled from: OptionSideBySideChainTable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTableTopBanner$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TopErrorBannerAction.values().length];
                try {
                    iArr[TopErrorBannerAction.ENABLE_TRADE_ON_EXPIRATION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C246062(Modifier modifier, int i, SnapshotIntState2 snapshotIntState2, TopErrorBannerState topErrorBannerState, Function0<Unit> function0) {
            this.$modifier = modifier;
            this.$visibleHeight = i;
            this.$intrinsicHeight$delegate = snapshotIntState2;
            this.$state = topErrorBannerState;
            this.$onEnableTradeOnExpiration = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            String message;
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-749224210, i, -1, "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableTopBanner.<anonymous> (OptionSideBySideChainTable.kt:1057)");
            }
            Modifier modifier = this.$modifier;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier, bentoTheme.getColors(composer, i2).m21372getBg20d7_KjU(), null, 2, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$visibleHeight);
            final int i3 = this.$visibleHeight;
            final SnapshotIntState2 snapshotIntState2 = this.$intrinsicHeight$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTableTopBanner$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionSideBySideChainTableKt.C246062.invoke$lambda$1$lambda$0(i3, snapshotIntState2, (Density) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierOffset = OffsetKt.offset(modifierM4872backgroundbw27NRU$default, (Function1) objRememberedValue);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment center = companion.getCenter();
            final SnapshotIntState2 snapshotIntState22 = this.$intrinsicHeight$delegate;
            final TopErrorBannerState topErrorBannerState = this.$state;
            final Function0<Unit> function0 = this.$onEnableTradeOnExpiration;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierOffset);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 2, null), null, true, 1, null);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue2 = composer.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTableTopBanner$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionSideBySideChainTableKt.C246062.invoke$lambda$7$lambda$3$lambda$2(snapshotIntState22, (IntSize) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(modifierWrapContentHeight$default, (Function1) objRememberedValue2);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierOnSizeChanged);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.ALERT_FILLED_16), null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), PaddingKt.m5142padding3ABfNKs(companion3, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), null, false, composer, BentoIcon4.Size16.$stable | 48, 48);
            if ((topErrorBannerState != null ? topErrorBannerState.getActionText() : null) != null) {
                composer.startReplaceGroup(-1221736033);
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 1, null);
                String message2 = topErrorBannerState.getMessage();
                String actionText = topErrorBannerState.getActionText();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
                composer.startReplaceGroup(-1633490746);
                boolean zChanged2 = composer.changed(topErrorBannerState) | composer.changed(function0);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue3 == companion4.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTableTopBanner$2$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionSideBySideChainTableKt.C246062.invoke$lambda$7$lambda$6$lambda$5$lambda$4(topErrorBannerState, function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(message2, actionText, (Function0) objRememberedValue3, modifierM5144paddingVpY3zN4$default, jM21425getFg0d7_KjU, 0L, textS, 0, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1221044268);
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 1, null);
                if (topErrorBannerState == null || (message = topErrorBannerState.getMessage()) == null) {
                    message = "";
                }
                BentoText2.m20747BentoText38GnDrw(message, modifierM5144paddingVpY3zN4$default2, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8184);
                composer.endReplaceGroup();
            }
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IntOffset invoke$lambda$1$lambda$0(int i, SnapshotIntState2 snapshotIntState2, Density offset) {
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((0 << 32) | (((-(OptionSideBySideChainTableKt.OptionSideBySideChainTableTopBanner$lambda$78(snapshotIntState2) - i)) / 2) & 4294967295L)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$3$lambda$2(SnapshotIntState2 snapshotIntState2, IntSize intSize) {
            OptionSideBySideChainTableKt.OptionSideBySideChainTableTopBanner$lambda$79(snapshotIntState2, (int) (intSize.getPackedValue() & 4294967295L));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6$lambda$5$lambda$4(TopErrorBannerState topErrorBannerState, Function0 function0) {
            TopErrorBannerAction action = topErrorBannerState.getAction();
            int i = action == null ? -1 : WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
            if (i != -1) {
                if (i != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    private static final ViewConfiguration provideShortDoubleTapConfiguration(final ViewConfiguration viewConfiguration) {
        return new ViewConfiguration() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$provideShortDoubleTapConfiguration$modifiedViewConfiguration$1
            @Override // androidx.compose.p011ui.platform.ViewConfiguration
            public long getDoubleTapTimeoutMillis() {
                return 100L;
            }

            @Override // androidx.compose.p011ui.platform.ViewConfiguration
            public /* bridge */ /* synthetic */ float getHandwritingGestureLineMargin() {
                return super.getHandwritingGestureLineMargin();
            }

            @Override // androidx.compose.p011ui.platform.ViewConfiguration
            public /* bridge */ /* synthetic */ float getHandwritingSlop() {
                return super.getHandwritingSlop();
            }

            @Override // androidx.compose.p011ui.platform.ViewConfiguration
            public /* bridge */ /* synthetic */ float getMaximumFlingVelocity() {
                return super.getMaximumFlingVelocity();
            }

            @Override // androidx.compose.p011ui.platform.ViewConfiguration
            /* renamed from: getMinimumTouchTargetSize-MYxV2XQ */
            public /* bridge */ /* synthetic */ long mo7313getMinimumTouchTargetSizeMYxV2XQ() {
                return super.mo7313getMinimumTouchTargetSizeMYxV2XQ();
            }

            @Override // androidx.compose.p011ui.platform.ViewConfiguration
            public long getDoubleTapMinTimeMillis() {
                return viewConfiguration.getDoubleTapMinTimeMillis();
            }

            @Override // androidx.compose.p011ui.platform.ViewConfiguration
            public long getLongPressTimeoutMillis() {
                return viewConfiguration.getLongPressTimeoutMillis();
            }

            @Override // androidx.compose.p011ui.platform.ViewConfiguration
            public float getTouchSlop() {
                return viewConfiguration.getTouchSlop();
            }
        };
    }
}
