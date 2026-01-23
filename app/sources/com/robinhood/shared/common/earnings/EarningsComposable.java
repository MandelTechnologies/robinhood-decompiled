package com.robinhood.shared.common.earnings;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
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
import com.robinhood.Logger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.charts.cursor.ChartLabelTrack;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.segmented.UtilKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.sdui.chartgroup.AdvancedChartGroupState5;
import com.robinhood.android.sdui.chartgroup.ProtoAdvancedChartGroupState;
import com.robinhood.android.sdui.chartgroup.ProtoAxisConfig;
import com.robinhood.android.sdui.chartgroup.ScrubConfig;
import com.robinhood.android.sdui.chartgroup.ScrubState;
import com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt;
import com.robinhood.android.sdui.chartgroup.YAxisLocation;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EarningsCallContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.earnings.EarningsDuxo;
import com.robinhood.shared.common.earnings.EarningsViewState;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.ChartAxisDto;
import rh_server_driven_ui.p531v1.ChartDto;
import rh_server_driven_ui.p531v1.ChartGroupDto;
import rh_server_driven_ui.p531v1.ChartLegendItemDto;
import rh_server_driven_ui.p531v1.ChartLegendItemListDto;
import rh_server_driven_ui.p531v1.DisplayTextDto;
import rh_server_driven_ui.p531v1.TextStyleDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: EarningsComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0000\u001a'\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u001a\u001a:\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u0002H\u001d0\u001c0\u0012\"\u0004\b\u0000\u0010\u001d2\u0018\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\u001d0\u001f0\u0015H\u0000\u001a\u0017\u0010 \u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010!\u001au\u0010\"\u001a\u00020\u00012\b\u0010#\u001a\u0004\u0018\u00010\t2\b\u0010$\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\t2\b\u0010&\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010*\u001a?\u0010+\u001a\u00020\u00012\b\u0010$\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\t2\b\u0010&\u001a\u0004\u0018\u00010\t2\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0004\b.\u0010/\u001a;\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020-2\u0006\u00103\u001a\u00020-2\b\u00104\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0004\b5\u00106\u001aI\u00107\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010,\u001a\u00020-2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0004\b8\u00109\u001a\"\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020<2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010=\u001a\u00020>H\u0002\"\u000e\u0010?\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006@²\u0006\n\u0010A\u001a\u00020BX\u008a\u0084\u0002²\u0006\f\u0010C\u001a\u0004\u0018\u00010DX\u008a\u008e\u0002"}, m3636d2 = {"EarningsComposable", "", "instrumentUuid", "Ljava/util/UUID;", "showHeader", "", "modifier", "Landroidx/compose/ui/Modifier;", "headerOverride", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "onCallClicked", "Lkotlin/Function1;", "duxo", "Lcom/robinhood/shared/common/earnings/EarningsDuxo;", "(Ljava/util/UUID;ZLandroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;Lkotlin/jvm/functions/Function1;Lcom/robinhood/shared/common/earnings/EarningsDuxo;Landroidx/compose/runtime/Composer;II)V", "parseXAxisSnapPoints", "Lkotlinx/collections/immutable/ImmutableList;", "", "keys", "", "EarningsChartCursor", "chartGroup", "Lrh_server_driven_ui/v1/ChartGroupDto;", "xPosition", "(Lrh_server_driven_ui/v1/ChartGroupDto;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "parseFloatKeys", "Lkotlin/Pair;", "T", "entries", "", "EarningsEmpty", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EarningsContent", "header", "estimatedEpsText", "actualEpsText", "epsAvailabilityText", "earningsCall", "Lcom/robinhood/shared/common/earnings/EarningsCall;", "sduiChart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/common/earnings/EarningsCall;Lrh_server_driven_ui/v1/ChartGroupDto;Landroidx/compose/ui/Modifier;Lcom/robinhood/rosetta/eventlogging/Screen;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "EarningsEpsLabels", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "EarningsEpsLabels-uDo3WH8", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EarningsLabel", "labelText", "textColor", "circleColor", "valueText", "EarningsLabel-DTcfvLk", "(Ljava/lang/String;JJLjava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EarningsCall", "EarningsCall-8V94_ZQ", "(Lcom/robinhood/shared/common/earnings/EarningsCall;JLcom/robinhood/rosetta/eventlogging/Screen;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "logViewEarningsCallAnalytics", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "earningsCallType", "Lcom/robinhood/rosetta/eventlogging/EarningsCallContext$CallType;", "earningsV2EmptyTestTag", "lib-earnings_externalDebug", "viewState", "Lcom/robinhood/shared/common/earnings/EarningsViewState;", "scrubState", "Lcom/robinhood/android/sdui/chartgroup/ScrubState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.earnings.EarningsComposableKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class EarningsComposable {
    public static final String earningsV2EmptyTestTag = "EarningsV2Empty";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EarningsCall_8V94_ZQ$lambda$37(EarningsCall earningsDuxo2, long j, Screen screen, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        m24822EarningsCall8V94_ZQ(earningsDuxo2, j, screen, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EarningsCall_8V94_ZQ$lambda$40(EarningsCall earningsDuxo2, long j, Screen screen, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        m24822EarningsCall8V94_ZQ(earningsDuxo2, j, screen, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EarningsChartCursor$lambda$14(ChartGroupDto chartGroupDto, float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EarningsChartCursor(chartGroupDto, f, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EarningsComposable$lambda$5(UUID uuid, boolean z, Modifier modifier, String str, Screen screen, Function1 function1, EarningsDuxo earningsDuxo, int i, int i2, Composer composer, int i3) {
        EarningsComposable(uuid, z, modifier, str, screen, function1, earningsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EarningsContent$lambda$31(String str, String str2, String str3, String str4, EarningsCall earningsDuxo2, ChartGroupDto chartGroupDto, Modifier modifier, Screen screen, Function1 function1, int i, int i2, Composer composer, int i3) {
        EarningsContent(str, str2, str3, str4, earningsDuxo2, chartGroupDto, modifier, screen, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EarningsEmpty$lambda$16(Modifier modifier, int i, int i2, Composer composer, int i3) {
        EarningsEmpty(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EarningsEpsLabels_uDo3WH8$lambda$33(String str, String str2, String str3, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m24823EarningsEpsLabelsuDo3WH8(str, str2, str3, j, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EarningsLabel_DTcfvLk$lambda$36(String str, long j, long j2, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m24824EarningsLabelDTcfvLk(str, j, j2, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EarningsComposable$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private static final EarningsViewState EarningsComposable$lambda$2(SnapshotState4<? extends EarningsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrubState EarningsContent$lambda$30$lambda$29$lambda$20(SnapshotState<ScrubState> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EarningsComposable(final UUID instrumentUuid, final boolean z, Modifier modifier, String str, Screen screen, Function1<? super String, Unit> function1, EarningsDuxo earningsDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        int i5;
        Screen screen2;
        int i6;
        Function1<? super String, Unit> function12;
        EarningsDuxo earningsDuxo2;
        Modifier modifier3;
        Function1<? super String, Unit> function13;
        int i7;
        Screen screen3;
        Function1<? super String, Unit> function14;
        int i8;
        int i9;
        EarningsDuxo earningsDuxo3;
        EarningsViewState earningsViewStateEarningsComposable$lambda$2;
        Modifier modifier4;
        final String str3;
        final Screen screen4;
        final Function1<? super String, Unit> function15;
        final EarningsDuxo earningsDuxo4;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(instrumentUuid, "instrumentUuid");
        Composer composerStartRestartGroup = composer.startRestartGroup(1046487511);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(instrumentUuid) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        screen2 = screen;
                        i3 |= composerStartRestartGroup.changedInstance(screen2) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        if ((196608 & i) == 0) {
                            function12 = function1;
                            i3 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                earningsDuxo2 = earningsDuxo;
                                int i11 = composerStartRestartGroup.changedInstance(earningsDuxo2) ? 1048576 : 524288;
                                i3 |= i11;
                            } else {
                                earningsDuxo2 = earningsDuxo;
                            }
                            i3 |= i11;
                        } else {
                            earningsDuxo2 = earningsDuxo;
                        }
                        if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier5 = modifier2;
                            str3 = str2;
                            screen4 = screen2;
                            function15 = function12;
                            earningsDuxo4 = earningsDuxo2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    str2 = null;
                                }
                                Screen screen5 = i5 == 0 ? screen2 : null;
                                if (i6 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return EarningsComposable.EarningsComposable$lambda$1$lambda$0((String) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    function13 = (Function1) objRememberedValue;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function13 = function12;
                                }
                                if ((i2 & 64) == 0) {
                                    String str4 = instrumentUuid + "_Earnings";
                                    EarningsDuxo.InitArgs initArgs = new EarningsDuxo.InitArgs(instrumentUuid, z, str2);
                                    composerStartRestartGroup.startReplaceGroup(2050738472);
                                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                    if (current == null) {
                                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    }
                                    CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                                    creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                                    i7 = 0;
                                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(EarningsDuxo.class), current, str4, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$EarningsComposable$$inlined$duxo$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                                lifecycle.addObserver(duxoLifecycleObserver);
                                                final Lifecycle lifecycle2 = lifecycle;
                                                return new DisposableEffectResult() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$EarningsComposable$$inlined$duxo$1.1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void dispose() {
                                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                                    }
                                                };
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                    screen3 = screen5;
                                    function14 = function13;
                                    i8 = 1046487511;
                                    i9 = i3 & (-3670017);
                                    earningsDuxo3 = (EarningsDuxo) baseDuxo;
                                } else {
                                    i7 = 0;
                                    screen3 = screen5;
                                    function14 = function13;
                                    i8 = 1046487511;
                                    i9 = i3;
                                    earningsDuxo3 = earningsDuxo2;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                i9 = i3;
                                modifier3 = modifier2;
                                screen3 = screen2;
                                function14 = function12;
                                earningsDuxo3 = earningsDuxo2;
                                i7 = 0;
                                i8 = 1046487511;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i8, i9, -1, "com.robinhood.shared.common.earnings.EarningsComposable (EarningsComposable.kt:85)");
                            }
                            earningsViewStateEarningsComposable$lambda$2 = EarningsComposable$lambda$2(FlowExtKt.collectAsStateWithLifecycle(earningsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                            if (!(earningsViewStateEarningsComposable$lambda$2 instanceof EarningsViewState.Loading) || Intrinsics.areEqual(earningsViewStateEarningsComposable$lambda$2, EarningsViewState.LoadedNoEarnings.INSTANCE)) {
                                modifier4 = modifier3;
                                composerStartRestartGroup.startReplaceGroup(-1257555535);
                                EarningsEmpty(modifier4, composerStartRestartGroup, (i9 >> 6) & 14, i7);
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                if (!(earningsViewStateEarningsComposable$lambda$2 instanceof EarningsViewState.Loaded)) {
                                    composerStartRestartGroup.startReplaceGroup(652167701);
                                    composerStartRestartGroup.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composerStartRestartGroup.startReplaceGroup(-1257439967);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, i7);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i7);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-2048155573);
                                EarningsViewState.Loaded loaded = (EarningsViewState.Loaded) earningsViewStateEarningsComposable$lambda$2;
                                ChartGroupDto sduiChart = loaded.getSduiChart();
                                String estimatedEpsText = loaded.getEstimatedEpsText();
                                String actualEpsText = loaded.getActualEpsText();
                                String epsAvailabilityText = loaded.getEpsAvailabilityText();
                                Composer composer2 = composerStartRestartGroup;
                                EarningsCall earningsCall = loaded.getEarningsCall();
                                String header = loaded.getHeader();
                                int i12 = (i9 << 12) & 3670016;
                                int i13 = i9 << 9;
                                modifier4 = modifier3;
                                EarningsContent(header, estimatedEpsText, actualEpsText, epsAvailabilityText, earningsCall, sduiChart, modifier4, screen3, function14, composer2, i12 | (29360128 & i13) | (i13 & 234881024), 0);
                                composerStartRestartGroup = composer2;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str3 = str2;
                            screen4 = screen3;
                            function15 = function14;
                            earningsDuxo4 = earningsDuxo3;
                            modifier5 = modifier4;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return EarningsComposable.EarningsComposable$lambda$5(instrumentUuid, z, modifier5, str3, screen4, function15, earningsDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    function12 = function1;
                    if ((1572864 & i) == 0) {
                    }
                    if ((599187 & i3) == 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 64) == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            earningsViewStateEarningsComposable$lambda$2 = EarningsComposable$lambda$2(FlowExtKt.collectAsStateWithLifecycle(earningsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                            if (earningsViewStateEarningsComposable$lambda$2 instanceof EarningsViewState.Loading) {
                                modifier4 = modifier3;
                                composerStartRestartGroup.startReplaceGroup(-1257555535);
                                EarningsEmpty(modifier4, composerStartRestartGroup, (i9 >> 6) & 14, i7);
                                composerStartRestartGroup.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                str3 = str2;
                                screen4 = screen3;
                                function15 = function14;
                                earningsDuxo4 = earningsDuxo3;
                                modifier5 = modifier4;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                screen2 = screen;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                function12 = function1;
                if ((1572864 & i) == 0) {
                }
                if ((599187 & i3) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str2 = str;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            screen2 = screen;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            function12 = function1;
            if ((1572864 & i) == 0) {
            }
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str2 = str;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        screen2 = screen;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        function12 = function1;
        if ((1572864 & i) == 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final ImmutableList<Float> parseXAxisSnapPoints(Collection<String> keys) {
        Float fValueOf;
        Intrinsics.checkNotNullParameter(keys, "keys");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            try {
                fValueOf = Float.valueOf(Float.parseFloat((String) it.next()));
            } catch (NumberFormatException e) {
                Logger.INSTANCE.mo1682e(e, "Failed to parse x-axis snap points", new Object[0]);
                fValueOf = null;
            }
            if (fValueOf != null) {
                arrayList.add(fValueOf);
            }
        }
        return extensions2.toImmutableList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EarningsChartCursor(final ChartGroupDto chartGroup, final float f, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        ChartAxisDto x_axis;
        Map<String, DisplayTextDto> scrubbing_labels;
        Object objRememberedValue3;
        Composer.Companion companion;
        Tuples2 tuples2;
        Object objRememberedValue4;
        BentoTheme bentoTheme;
        int i4;
        long jM21372getBg20d7_KjU;
        Composer composer2;
        final Modifier modifier3;
        ChartLegendItemListDto chartLegendItemListDto;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(chartGroup, "chartGroup");
        Composer composerStartRestartGroup = composer.startRestartGroup(2023402404);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(chartGroup) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2023402404, i3, -1, "com.robinhood.shared.common.earnings.EarningsChartCursor (EarningsComposable.kt:129)");
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(chartGroup);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = parseFloatKeys(((ChartDto) CollectionsKt.first((List) chartGroup.getCharts())).getLegend_data().entrySet());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ImmutableList immutableList = (ImmutableList) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(chartGroup);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    x_axis = chartGroup.getX_axis();
                    if (x_axis != null || (scrubbing_labels = x_axis.getScrubbing_labels()) == null || (objPersistentListOf = parseFloatKeys(scrubbing_labels.entrySet())) == null) {
                        Object objPersistentListOf = extensions2.persistentListOf();
                    }
                    objRememberedValue2 = objPersistentListOf;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ImmutableList immutableList2 = (ImmutableList) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(EarningsComposable.EarningsChartCursor$lambda$11$lambda$10((Tuples2) obj));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                tuples2 = (Tuples2) UtilKt.getClosestItemByValue(immutableList, f, (Function1) objRememberedValue3);
                if (tuples2 != null || (chartLegendItemListDto = (ChartLegendItemListDto) tuples2.getSecond()) == null || (listPersistentListOf = chartLegendItemListDto.getItems()) == null) {
                    List<ChartLegendItemDto> listPersistentListOf = extensions2.persistentListOf();
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(EarningsComposable.EarningsChartCursor$lambda$13$lambda$12((Tuples2) obj));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                Tuples2 tuples22 = (Tuples2) UtilKt.getClosestItemByValue(immutableList2, f, (Function1) objRememberedValue4);
                final DisplayTextDto displayTextDto = tuples22 == null ? (DisplayTextDto) tuples22.getSecond() : null;
                CardDefaults cardDefaults = CardDefaults.INSTANCE;
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                if (bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                    composerStartRestartGroup.startReplaceGroup(-1130443705);
                    jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21372getBg20d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1130444538);
                    jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                int i6 = CardDefaults.$stable;
                final List<ChartLegendItemDto> list = listPersistentListOf;
                CardColors cardColorsM5729cardColorsro_MJ88 = cardDefaults.m5729cardColorsro_MJ88(jM21372getBg20d7_KjU, 0L, 0L, 0L, composerStartRestartGroup, i6 << 12, 14);
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                CardKt.Card(modifier5, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), cardColorsM5729cardColorsro_MJ88, cardDefaults.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i6 << 18) | 6, 62), null, ComposableLambda3.rememberComposableLambda(-1512198634, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt.EarningsChartCursor.1
                    public final void invoke(Column5 Card, Composer composer3, int i7) {
                        Modifier.Companion companion2;
                        Arrangement arrangement;
                        BentoTheme bentoTheme2;
                        int i8;
                        List<ChartLegendItemDto> list2;
                        Composer composer4 = composer3;
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i7 & 17) == 16 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1512198634, i7, -1, "com.robinhood.shared.common.earnings.EarningsChartCursor.<anonymous> (EarningsComposable.kt:153)");
                        }
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        Modifier modifierWidth = Intrinsic3.width(PaddingKt.m5143paddingVpY3zN4(companion3, bentoTheme3.getSpacing(composer4, i9).m21593getSmallD9Ej5fM(), bentoTheme3.getSpacing(composer4, i9).m21593getSmallD9Ej5fM()), Intrinsic4.Min);
                        DisplayTextDto displayTextDto2 = displayTextDto;
                        List<ChartLegendItemDto> list3 = list;
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement2.getTop();
                        Alignment.Companion companion4 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion4.getStart(), composer4, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierWidth);
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion5.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        composer4.startReplaceGroup(-551953499);
                        if (displayTextDto2 != null) {
                            String value = displayTextDto2.getValue();
                            long jM18897toComposeColorDefaultediJQMabo = SduiColors2.m18897toComposeColorDefaultediJQMabo(displayTextDto2.getColor(), 0L, composer4, 0, 1);
                            TextStyleDto text_style = displayTextDto2.getText_style();
                            FontWeight fontWeight = text_style != null ? com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getFontWeight(text_style) : null;
                            TextStyleDto text_style2 = displayTextDto2.getText_style();
                            composer4.startReplaceGroup(-551944068);
                            TextStyle composeTextStyle = text_style2 == null ? null : com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getComposeTextStyle(text_style2, composer4, 0);
                            composer4.endReplaceGroup();
                            composer4.startReplaceGroup(-551944874);
                            if (composeTextStyle == null) {
                                composeTextStyle = bentoTheme3.getTypography(composer4, i9).getTextS();
                            }
                            composer4.endReplaceGroup();
                            arrangement = arrangement2;
                            list2 = list3;
                            companion2 = companion3;
                            bentoTheme2 = bentoTheme3;
                            i8 = i9;
                            BentoText2.m20747BentoText38GnDrw(value, PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme3.getSpacing(composer4, i9).m21595getXsmallD9Ej5fM(), 7, null), Color.m6701boximpl(jM18897toComposeColorDefaultediJQMabo), null, fontWeight, null, null, 0, false, 0, 0, null, 0, composeTextStyle, composer4, 0, 0, 8168);
                        } else {
                            companion2 = companion3;
                            arrangement = arrangement2;
                            bentoTheme2 = bentoTheme3;
                            i8 = i9;
                            list2 = list3;
                        }
                        composer4.endReplaceGroup();
                        int i10 = 0;
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composer4, i8).m21595getXsmallD9Ej5fM()), companion4.getStart(), composer4, 0);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, companion2);
                        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor2);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                        composer4.startReplaceGroup(1525254481);
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            ChartLegendItemDto chartLegendItemDto = (ChartLegendItemDto) it.next();
                            Modifier.Companion companion6 = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composer4, 54);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, i10);
                            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierFillMaxWidth$default);
                            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor3);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion7.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            String title = chartLegendItemDto.getTitle();
                            BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                            int i11 = BentoTheme.$stable;
                            TextStyle textS = bentoTheme4.getTypography(composer4, i11).getTextS();
                            Composer composer5 = composer4;
                            long jM18897toComposeColorDefaultediJQMabo2 = SduiColors2.m18897toComposeColorDefaultediJQMabo(chartLegendItemDto.getColor(), 0L, composer5, 0, 1);
                            TextOverflow.Companion companion8 = TextOverflow.INSTANCE;
                            Iterator it2 = it;
                            composer4 = composer3;
                            BentoText2.m20747BentoText38GnDrw(title, Row5.weight$default(row6, PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, 0.0f, bentoTheme4.getSpacing(composer5, i11).m21593getSmallD9Ej5fM(), 0.0f, 11, null), 1.0f, false, 2, null), Color.m6701boximpl(jM18897toComposeColorDefaultediJQMabo2), null, null, null, null, companion8.m7962getVisiblegIe3tQ8(), false, 1, 0, null, 0, textS, composer4, 817889280, 0, 7544);
                            BentoText2.m20747BentoText38GnDrw(chartLegendItemDto.getValue(), row6.weight(companion6, 1.0f, false), Color.m6701boximpl(SduiColors2.m18897toComposeColorDefaultediJQMabo(chartLegendItemDto.getValue_color(), 0L, composer4, 0, 1)), null, null, null, null, companion8.m7962getVisiblegIe3tQ8(), false, 1, 0, null, 0, bentoTheme4.getTypography(composer4, i11).getTextS(), composer4, 817889280, 0, 7544);
                            composer3.endNode();
                            it = it2;
                            i10 = 0;
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                        invoke(column5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composer2, 54), composer2, ((i3 >> 6) & 14) | 196608, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EarningsComposable.EarningsChartCursor$lambda$14(chartGroup, f, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(chartGroup);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = parseFloatKeys(((ChartDto) CollectionsKt.first((List) chartGroup.getCharts())).getLegend_data().entrySet());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                ImmutableList immutableList3 = (ImmutableList) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(chartGroup);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    x_axis = chartGroup.getX_axis();
                    if (x_axis != null) {
                        Object objPersistentListOf2 = extensions2.persistentListOf();
                        objRememberedValue2 = objPersistentListOf2;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        ImmutableList immutableList22 = (ImmutableList) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        tuples2 = (Tuples2) UtilKt.getClosestItemByValue(immutableList3, f, (Function1) objRememberedValue3);
                        if (tuples2 != null) {
                            List<ChartLegendItemDto> listPersistentListOf2 = extensions2.persistentListOf();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Tuples2 tuples222 = (Tuples2) UtilKt.getClosestItemByValue(immutableList22, f, (Function1) objRememberedValue4);
                            if (tuples222 == null) {
                            }
                            CardDefaults cardDefaults2 = CardDefaults.INSTANCE;
                            bentoTheme = BentoTheme.INSTANCE;
                            i4 = BentoTheme.$stable;
                            if (bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int i62 = CardDefaults.$stable;
                            final List<ChartLegendItemDto> list2 = listPersistentListOf2;
                            CardColors cardColorsM5729cardColorsro_MJ882 = cardDefaults2.m5729cardColorsro_MJ88(jM21372getBg20d7_KjU, 0L, 0L, 0L, composerStartRestartGroup, i62 << 12, 14);
                            composer2 = composerStartRestartGroup;
                            Modifier modifier52 = modifier4;
                            CardKt.Card(modifier52, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), cardColorsM5729cardColorsro_MJ882, cardDefaults2.m5730cardElevationaqJV_2Y(C2002Dp.m7995constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (i62 << 18) | 6, 62), null, ComposableLambda3.rememberComposableLambda(-1512198634, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt.EarningsChartCursor.1
                                public final void invoke(Column5 Card, Composer composer3, int i7) {
                                    Modifier.Companion companion2;
                                    Arrangement arrangement;
                                    BentoTheme bentoTheme2;
                                    int i8;
                                    List<ChartLegendItemDto> list22;
                                    Composer composer4 = composer3;
                                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                    if ((i7 & 17) == 16 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1512198634, i7, -1, "com.robinhood.shared.common.earnings.EarningsChartCursor.<anonymous> (EarningsComposable.kt:153)");
                                    }
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                    int i9 = BentoTheme.$stable;
                                    Modifier modifierWidth = Intrinsic3.width(PaddingKt.m5143paddingVpY3zN4(companion3, bentoTheme3.getSpacing(composer4, i9).m21593getSmallD9Ej5fM(), bentoTheme3.getSpacing(composer4, i9).m21593getSmallD9Ej5fM()), Intrinsic4.Min);
                                    DisplayTextDto displayTextDto2 = displayTextDto;
                                    List<ChartLegendItemDto> list3 = list2;
                                    Arrangement arrangement2 = Arrangement.INSTANCE;
                                    Arrangement.Vertical top = arrangement2.getTop();
                                    Alignment.Companion companion4 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion4.getStart(), composer4, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierWidth);
                                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    composer4.startReplaceGroup(-551953499);
                                    if (displayTextDto2 != null) {
                                        String value = displayTextDto2.getValue();
                                        long jM18897toComposeColorDefaultediJQMabo = SduiColors2.m18897toComposeColorDefaultediJQMabo(displayTextDto2.getColor(), 0L, composer4, 0, 1);
                                        TextStyleDto text_style = displayTextDto2.getText_style();
                                        FontWeight fontWeight = text_style != null ? com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getFontWeight(text_style) : null;
                                        TextStyleDto text_style2 = displayTextDto2.getText_style();
                                        composer4.startReplaceGroup(-551944068);
                                        TextStyle composeTextStyle = text_style2 == null ? null : com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt.getComposeTextStyle(text_style2, composer4, 0);
                                        composer4.endReplaceGroup();
                                        composer4.startReplaceGroup(-551944874);
                                        if (composeTextStyle == null) {
                                            composeTextStyle = bentoTheme3.getTypography(composer4, i9).getTextS();
                                        }
                                        composer4.endReplaceGroup();
                                        arrangement = arrangement2;
                                        list22 = list3;
                                        companion2 = companion3;
                                        bentoTheme2 = bentoTheme3;
                                        i8 = i9;
                                        BentoText2.m20747BentoText38GnDrw(value, PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme3.getSpacing(composer4, i9).m21595getXsmallD9Ej5fM(), 7, null), Color.m6701boximpl(jM18897toComposeColorDefaultediJQMabo), null, fontWeight, null, null, 0, false, 0, 0, null, 0, composeTextStyle, composer4, 0, 0, 8168);
                                    } else {
                                        companion2 = companion3;
                                        arrangement = arrangement2;
                                        bentoTheme2 = bentoTheme3;
                                        i8 = i9;
                                        list22 = list3;
                                    }
                                    composer4.endReplaceGroup();
                                    int i10 = 0;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composer4, i8).m21595getXsmallD9Ej5fM()), companion4.getStart(), composer4, 0);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, companion2);
                                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                    composer4.startReplaceGroup(1525254481);
                                    Iterator it = list22.iterator();
                                    while (it.hasNext()) {
                                        ChartLegendItemDto chartLegendItemDto = (ChartLegendItemDto) it.next();
                                        Modifier.Companion companion6 = Modifier.INSTANCE;
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composer4, 54);
                                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, i10);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierFillMaxWidth$default);
                                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor3);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion7.getSetModifier());
                                        Row6 row6 = Row6.INSTANCE;
                                        String title = chartLegendItemDto.getTitle();
                                        BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                                        int i11 = BentoTheme.$stable;
                                        TextStyle textS = bentoTheme4.getTypography(composer4, i11).getTextS();
                                        Composer composer5 = composer4;
                                        long jM18897toComposeColorDefaultediJQMabo2 = SduiColors2.m18897toComposeColorDefaultediJQMabo(chartLegendItemDto.getColor(), 0L, composer5, 0, 1);
                                        TextOverflow.Companion companion8 = TextOverflow.INSTANCE;
                                        Iterator it2 = it;
                                        composer4 = composer3;
                                        BentoText2.m20747BentoText38GnDrw(title, Row5.weight$default(row6, PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, 0.0f, bentoTheme4.getSpacing(composer5, i11).m21593getSmallD9Ej5fM(), 0.0f, 11, null), 1.0f, false, 2, null), Color.m6701boximpl(jM18897toComposeColorDefaultediJQMabo2), null, null, null, null, companion8.m7962getVisiblegIe3tQ8(), false, 1, 0, null, 0, textS, composer4, 817889280, 0, 7544);
                                        BentoText2.m20747BentoText38GnDrw(chartLegendItemDto.getValue(), row6.weight(companion6, 1.0f, false), Color.m6701boximpl(SduiColors2.m18897toComposeColorDefaultediJQMabo(chartLegendItemDto.getValue_color(), 0L, composer4, 0, 1)), null, null, null, null, companion8.m7962getVisiblegIe3tQ8(), false, 1, 0, null, 0, bentoTheme4.getTypography(composer4, i11).getTextS(), composer4, 817889280, 0, 7544);
                                        composer3.endNode();
                                        it = it2;
                                        i10 = 0;
                                    }
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                    invoke(column5, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer2, 54), composer2, ((i3 >> 6) & 14) | 196608, 16);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EarningsChartCursor$lambda$11$lambda$10(Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((Number) it.getFirst()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EarningsChartCursor$lambda$13$lambda$12(Tuples2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((Number) it.getFirst()).floatValue();
    }

    public static final <T> ImmutableList<Tuples2<Float, T>> parseFloatKeys(Collection<? extends Map.Entry<String, ? extends T>> entries) {
        Tuples2 tuples2M3642to;
        Intrinsics.checkNotNullParameter(entries, "entries");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            try {
                tuples2M3642to = Tuples4.m3642to(Float.valueOf(Float.parseFloat((String) entry.getKey())), entry.getValue());
            } catch (NumberFormatException e) {
                Logger.INSTANCE.mo1682e(e, "Failed to parse float from key", new Object[0]);
                tuples2M3642to = null;
            }
            if (tuples2M3642to != null) {
                arrayList.add(tuples2M3642to);
            }
        }
        return extensions2.toImmutableList(arrayList);
    }

    private static final void EarningsEmpty(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(715212155);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(715212155, i3, -1, "com.robinhood.shared.common.earnings.EarningsEmpty (EarningsComposable.kt:231)");
            }
            Spacer2.Spacer(TestTag3.testTag(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(modifier, C2002Dp.m7995constructorimpl(1)), 0.0f, 1, null), null, false, 3, null), earningsV2EmptyTestTag), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EarningsComposable.EarningsEmpty$lambda$16(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EarningsContent$lambda$18$lambda$17(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EarningsContent(final String str, final String str2, final String str3, final String str4, final EarningsCall earningsDuxo2, final ChartGroupDto chartGroupDto, Modifier modifier, Screen screen, Function1<? super String, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        String str5;
        ChartGroupDto chartGroupDto2;
        int i4;
        Modifier modifier2;
        int i5;
        Screen screen2;
        int i6;
        Function1<? super String, Unit> function12;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        final Measurer2 measurer2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Modifier modifier3;
        final SnapshotState snapshotState;
        Object objRememberedValue4;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue5;
        final SnapshotState snapshotState2;
        final int i7;
        boolean zChanged;
        Object objRememberedValue6;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl2;
        final SnapshotState snapshotState3;
        Object objRememberedValue7;
        boolean zChangedInstance;
        Object objRememberedValue8;
        final Screen screen3;
        final Function1<? super String, Unit> function13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1790173501);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str5 = str2;
        } else {
            str5 = str2;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str5) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(earningsDuxo2) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else {
                    if ((i & 196608) == 0) {
                        chartGroupDto2 = chartGroupDto;
                        i3 |= composerStartRestartGroup.changedInstance(chartGroupDto2) ? 131072 : 65536;
                    }
                    i4 = i2 & 64;
                    if (i4 == 0) {
                        i3 |= 1572864;
                    } else {
                        if ((1572864 & i) == 0) {
                            modifier2 = modifier;
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                        }
                        i5 = i2 & 128;
                        if (i5 == 0) {
                            if ((12582912 & i) == 0) {
                                screen2 = screen;
                                i3 |= composerStartRestartGroup.changedInstance(screen2) ? 8388608 : 4194304;
                            }
                            i6 = i2 & 256;
                            if (i6 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
                            }
                            if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                                Screen screen4 = i5 == 0 ? null : screen2;
                                if (i6 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue9 = new Function1() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return EarningsComposable.EarningsContent$lambda$18$lambda$17((String) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    function12 = (Function1) objRememberedValue9;
                                } else {
                                    function12 = function1;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1790173501, i3, -1, "com.robinhood.shared.common.earnings.EarningsContent (EarningsComposable.kt:252)");
                                }
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                long jM21368getAccent0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU();
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-1003410150);
                                composerStartRestartGroup.startReplaceGroup(212064437);
                                composerStartRestartGroup.endReplaceGroup();
                                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = new Measurer2(density);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                measurer2 = (Measurer2) objRememberedValue;
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new ConstraintLayoutScope();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 != companion.getEmpty()) {
                                    modifier3 = modifier4;
                                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                } else {
                                    modifier3 = modifier4;
                                }
                                snapshotState = (SnapshotState) objRememberedValue3;
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == companion.getEmpty()) {
                                    objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                snapshotState2 = (SnapshotState) objRememberedValue5;
                                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                                i7 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                                zChanged = zChangedInstance2 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue6 == companion.getEmpty()) {
                                    objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$EarningsContent$lambda$30$$inlined$ConstraintLayout$2
                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        /* renamed from: measure-3p2s80s */
                                        public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            snapshotState2.getValue();
                                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i7);
                                            snapshotState.getValue();
                                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                            final Measurer2 measurer22 = measurer2;
                                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$EarningsContent$lambda$30$$inlined$ConstraintLayout$2.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                    invoke2(placementScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                                    measurer22.performLayout(placementScope, list, linkedHashMap);
                                                }
                                            }, 4, null);
                                        }
                                    };
                                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                                    snapshotState3 = snapshotState;
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                } else {
                                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                                    snapshotState3 = snapshotState;
                                }
                                MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
                                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                int i8 = i3;
                                if (objRememberedValue7 == companion.getEmpty()) {
                                    objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$EarningsContent$lambda$30$$inlined$ConstraintLayout$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            snapshotState3.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                            constraintSetForInlineDsl2.setKnownDirty(true);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                }
                                final Function0 function0 = (Function0) objRememberedValue7;
                                zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance || objRememberedValue8 == companion.getEmpty()) {
                                    objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$EarningsContent$lambda$30$$inlined$ConstraintLayout$4
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                }
                                final ChartGroupDto chartGroupDto3 = chartGroupDto2;
                                LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(companion3, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$EarningsContent$lambda$30$$inlined$ConstraintLayout$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i9) {
                                        List<ChartDto> charts;
                                        ChartDto chartDto;
                                        Map<String, ChartLegendItemListDto> legend_data;
                                        Set<String> setKeySet;
                                        SnapshotState snapshotState4;
                                        Point point;
                                        Composer composer3 = composer2;
                                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1200550679, i9, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                        }
                                        snapshotState2.setValue(Unit.INSTANCE);
                                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                        constraintLayoutScope.reset();
                                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                        composer3.startReplaceGroup(337304976);
                                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                        composer3.startReplaceGroup(1849434622);
                                        Object objRememberedValue10 = composer3.rememberedValue();
                                        Composer.Companion companion4 = Composer.INSTANCE;
                                        if (objRememberedValue10 == companion4.getEmpty()) {
                                            objRememberedValue10 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                            composer3.updateRememberedValue(objRememberedValue10);
                                        }
                                        SnapshotState snapshotState5 = (SnapshotState) objRememberedValue10;
                                        composer3.endReplaceGroup();
                                        composer3.startReplaceGroup(5004770);
                                        boolean zChanged2 = composer3.changed(chartGroupDto3);
                                        Object objRememberedValue11 = composer3.rememberedValue();
                                        if (zChanged2 || objRememberedValue11 == companion4.getEmpty()) {
                                            ChartGroupDto chartGroupDto4 = chartGroupDto3;
                                            objRememberedValue11 = (chartGroupDto4 == null || (charts = chartGroupDto4.getCharts()) == null || (chartDto = (ChartDto) CollectionsKt.firstOrNull((List) charts)) == null || (legend_data = chartDto.getLegend_data()) == null || (setKeySet = legend_data.keySet()) == null) ? null : EarningsComposable.parseXAxisSnapPoints(setKeySet);
                                            composer3.updateRememberedValue(objRememberedValue11);
                                        }
                                        ImmutableList immutableList = (ImmutableList) objRememberedValue11;
                                        composer3.endReplaceGroup();
                                        Modifier.Companion companion5 = Modifier.INSTANCE;
                                        composer3.startReplaceGroup(5004770);
                                        boolean zChanged3 = composer3.changed(constraintLayoutBaseScope4Component2);
                                        Object objRememberedValue12 = composer3.rememberedValue();
                                        if (zChanged3 || objRememberedValue12 == companion4.getEmpty()) {
                                            objRememberedValue12 = new EarningsComposable2(constraintLayoutBaseScope4Component2);
                                            composer3.updateRememberedValue(objRememberedValue12);
                                        }
                                        composer3.endReplaceGroup();
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(constraintLayoutScope2.constrainAs(companion5, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue12), 0.0f, 1, null);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i10 = BentoTheme.$stable;
                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer3, i10).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, composer3, 0, 1), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM() + bentoTheme.getSpacing(composer3, i10).m21595getXsmallD9Ej5fM()), 7, null);
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor2);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                                        Row6 row6 = Row6.INSTANCE;
                                        String str6 = str;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        BentoText2.m20747BentoText38GnDrw(str6, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i10).getDisplayCapsuleMedium(), composer3, 0, 0, 8190);
                                        composer3.endNode();
                                        composer3.startReplaceGroup(1534937605);
                                        if (chartGroupDto3 != null) {
                                            UIComponentDto.ConcreteDto.ChartGroup chartGroup = new UIComponentDto.ConcreteDto.ChartGroup(chartGroupDto3);
                                            composer3.startReplaceGroup(5004770);
                                            boolean zChanged4 = composer3.changed(constraintLayoutBaseScope4Component1);
                                            Object objRememberedValue13 = composer3.rememberedValue();
                                            if (zChanged4 || objRememberedValue13 == companion4.getEmpty()) {
                                                objRememberedValue13 = new EarningsComposable3(constraintLayoutBaseScope4Component1);
                                                composer3.updateRememberedValue(objRememberedValue13);
                                            }
                                            composer3.endReplaceGroup();
                                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(constraintLayoutScope2.constrainAs(companion5, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue13), 0.0f, 1, null), 0.0f, composer3, 0, 1);
                                            ProtoAdvancedChartGroupState protoAdvancedChartGroupState = new ProtoAdvancedChartGroupState(new ProtoAxisConfig(0.0f, 0.0f, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), null, null, false, YAxisLocation.START, null, false, null, 1847, null), new ScrubConfig(true, false, null, false, false, false, true, immutableList, false, 256, null), AdvancedChartGroupState5.NONE, 0, true, null, 40, null);
                                            composer3.startReplaceGroup(5004770);
                                            Object objRememberedValue14 = composer3.rememberedValue();
                                            if (objRememberedValue14 == companion4.getEmpty()) {
                                                snapshotState4 = snapshotState5;
                                                objRememberedValue14 = new EarningsComposable4(snapshotState4);
                                                composer3.updateRememberedValue(objRememberedValue14);
                                            } else {
                                                snapshotState4 = snapshotState5;
                                            }
                                            composer3.endReplaceGroup();
                                            SnapshotState snapshotState6 = snapshotState4;
                                            SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup(chartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, protoAdvancedChartGroupState, null, null, (Function1) objRememberedValue14, null, null, composer3, 1572864 | (ProtoAdvancedChartGroupState.$stable << 9), 436);
                                            ScrubState scrubStateEarningsContent$lambda$30$lambda$29$lambda$20 = EarningsComposable.EarningsContent$lambda$30$lambda$29$lambda$20(snapshotState6);
                                            Float fValueOf = (scrubStateEarningsContent$lambda$30$lambda$29$lambda$20 == null || (point = scrubStateEarningsContent$lambda$30$lambda$29$lambda$20.getPoint()) == null) ? null : Float.valueOf(point.getX());
                                            composer3.startReplaceGroup(5004770);
                                            boolean zChanged5 = composer3.changed(constraintLayoutBaseScope4Component2);
                                            Object objRememberedValue15 = composer3.rememberedValue();
                                            if (zChanged5 || objRememberedValue15 == companion4.getEmpty()) {
                                                objRememberedValue15 = new EarningsComposable5(constraintLayoutBaseScope4Component2);
                                                composer3.updateRememberedValue(objRememberedValue15);
                                            }
                                            composer3.endReplaceGroup();
                                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(constraintLayoutScope2.constrainAs(companion5, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue15), 0.0f, 1, null);
                                            ScrubState scrubStateEarningsContent$lambda$30$lambda$29$lambda$202 = EarningsComposable.EarningsContent$lambda$30$lambda$29$lambda$20(snapshotState6);
                                            ChartLabelTrack.ChartCursorTrack(fValueOf, modifierFillMaxWidth$default2, scrubStateEarningsContent$lambda$30$lambda$29$lambda$202 != null ? scrubStateEarningsContent$lambda$30$lambda$29$lambda$202.getChartStartXOffset() : 0.0f, ComposableLambda3.rememberComposableLambda(-2000901038, true, new EarningsComposable6(snapshotState6, chartGroupDto3), composer3, 54), composer3, 3072, 0);
                                            composer3 = composer3;
                                        }
                                        composer3.endReplaceGroup();
                                        composer3.endReplaceGroup();
                                        if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                            EffectsKt.SideEffect(function0, composer3, 6);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), measurePolicy, composerStartRestartGroup, 48, 0);
                                composerStartRestartGroup.endReplaceGroup();
                                m24823EarningsEpsLabelsuDo3WH8(str5, str3, str4, jM21368getAccent0d7_KjU, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1), composerStartRestartGroup, (i8 >> 3) & 1022, 0);
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1);
                                int i9 = i8 >> 12;
                                Screen screen5 = screen4;
                                Function1<? super String, Unit> function14 = function12;
                                m24822EarningsCall8V94_ZQ(earningsDuxo2, jM21368getAccent0d7_KjU, screen5, modifierM21623defaultHorizontalPaddingrAjV9yQ, function14, composerStartRestartGroup, (i9 & 14) | ((i8 >> 15) & 896) | (i9 & 57344), 0);
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                screen3 = screen5;
                                function13 = function14;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                function13 = function1;
                                screen3 = screen2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final Modifier modifier5 = modifier2;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return EarningsComposable.EarningsContent$lambda$31(str, str2, str3, str4, earningsDuxo2, chartGroupDto, modifier5, screen3, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        screen2 = screen;
                        i6 = i2 & 256;
                        if (i6 == 0) {
                        }
                        if ((i3 & 38347923) == 38347922) {
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                long jM21368getAccent0d7_KjU2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU();
                                Modifier.Companion companion32 = Modifier.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-1003410150);
                                composerStartRestartGroup.startReplaceGroup(212064437);
                                composerStartRestartGroup.endReplaceGroup();
                                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                }
                                measurer2 = (Measurer2) objRememberedValue;
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                }
                                final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue2;
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 != companion.getEmpty()) {
                                }
                                snapshotState = (SnapshotState) objRememberedValue3;
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == companion.getEmpty()) {
                                }
                                constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == companion.getEmpty()) {
                                }
                                snapshotState2 = (SnapshotState) objRememberedValue5;
                                boolean zChangedInstance22 = composerStartRestartGroup.changedInstance(measurer2);
                                i7 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                                zChanged = zChangedInstance22 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$EarningsContent$lambda$30$$inlined$ConstraintLayout$2
                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i82) {
                                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i82);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i82) {
                                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i82);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i82) {
                                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i82);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i82) {
                                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i82);
                                        }

                                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                        /* renamed from: measure-3p2s80s */
                                        public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                                            final Map linkedHashMap = new LinkedHashMap();
                                            snapshotState2.getValue();
                                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i7);
                                            snapshotState.getValue();
                                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                            final Measurer2 measurer22 = measurer2;
                                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$EarningsContent$lambda$30$$inlined$ConstraintLayout$2.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                    invoke2(placementScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                                    measurer22.performLayout(placementScope, list, linkedHashMap);
                                                }
                                            }, 4, null);
                                        }
                                    };
                                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                                    snapshotState3 = snapshotState;
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                    MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue6;
                                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                    int i82 = i3;
                                    if (objRememberedValue7 == companion.getEmpty()) {
                                    }
                                    final Function0 function02 = (Function0) objRememberedValue7;
                                    zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                    if (!zChangedInstance) {
                                        objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$EarningsContent$lambda$30$$inlined$ConstraintLayout$4
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                invoke2(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                        final ChartGroupDto chartGroupDto32 = chartGroupDto2;
                                        LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(companion32, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$EarningsContent$lambda$30$$inlined$ConstraintLayout$5
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i92) {
                                                List<ChartDto> charts;
                                                ChartDto chartDto;
                                                Map<String, ChartLegendItemListDto> legend_data;
                                                Set<String> setKeySet;
                                                SnapshotState snapshotState4;
                                                Point point;
                                                Composer composer3 = composer2;
                                                if ((i92 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1200550679, i92, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                                }
                                                snapshotState2.setValue(Unit.INSTANCE);
                                                int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                                                constraintLayoutScope2.reset();
                                                ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                                                composer3.startReplaceGroup(337304976);
                                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                                composer3.startReplaceGroup(1849434622);
                                                Object objRememberedValue10 = composer3.rememberedValue();
                                                Composer.Companion companion4 = Composer.INSTANCE;
                                                if (objRememberedValue10 == companion4.getEmpty()) {
                                                    objRememberedValue10 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                                                    composer3.updateRememberedValue(objRememberedValue10);
                                                }
                                                SnapshotState snapshotState5 = (SnapshotState) objRememberedValue10;
                                                composer3.endReplaceGroup();
                                                composer3.startReplaceGroup(5004770);
                                                boolean zChanged2 = composer3.changed(chartGroupDto32);
                                                Object objRememberedValue11 = composer3.rememberedValue();
                                                if (zChanged2 || objRememberedValue11 == companion4.getEmpty()) {
                                                    ChartGroupDto chartGroupDto4 = chartGroupDto32;
                                                    objRememberedValue11 = (chartGroupDto4 == null || (charts = chartGroupDto4.getCharts()) == null || (chartDto = (ChartDto) CollectionsKt.firstOrNull((List) charts)) == null || (legend_data = chartDto.getLegend_data()) == null || (setKeySet = legend_data.keySet()) == null) ? null : EarningsComposable.parseXAxisSnapPoints(setKeySet);
                                                    composer3.updateRememberedValue(objRememberedValue11);
                                                }
                                                ImmutableList immutableList = (ImmutableList) objRememberedValue11;
                                                composer3.endReplaceGroup();
                                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                                composer3.startReplaceGroup(5004770);
                                                boolean zChanged3 = composer3.changed(constraintLayoutBaseScope4Component2);
                                                Object objRememberedValue12 = composer3.rememberedValue();
                                                if (zChanged3 || objRememberedValue12 == companion4.getEmpty()) {
                                                    objRememberedValue12 = new EarningsComposable2(constraintLayoutBaseScope4Component2);
                                                    composer3.updateRememberedValue(objRememberedValue12);
                                                }
                                                composer3.endReplaceGroup();
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(constraintLayoutScope22.constrainAs(companion5, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue12), 0.0f, 1, null);
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i10 = BentoTheme.$stable;
                                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer3, i10).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, composer3, 0, 1), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM() + bentoTheme.getSpacing(composer3, i10).m21595getXsmallD9Ej5fM()), 7, null);
                                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor22 = companion6.getConstructor();
                                                if (composer3.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor22);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion6.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion6.getSetModifier());
                                                Row6 row6 = Row6.INSTANCE;
                                                String str6 = str;
                                                if (str6 == null) {
                                                    str6 = "";
                                                }
                                                BentoText2.m20747BentoText38GnDrw(str6, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i10).getDisplayCapsuleMedium(), composer3, 0, 0, 8190);
                                                composer3.endNode();
                                                composer3.startReplaceGroup(1534937605);
                                                if (chartGroupDto32 != null) {
                                                    UIComponentDto.ConcreteDto.ChartGroup chartGroup = new UIComponentDto.ConcreteDto.ChartGroup(chartGroupDto32);
                                                    composer3.startReplaceGroup(5004770);
                                                    boolean zChanged4 = composer3.changed(constraintLayoutBaseScope4Component1);
                                                    Object objRememberedValue13 = composer3.rememberedValue();
                                                    if (zChanged4 || objRememberedValue13 == companion4.getEmpty()) {
                                                        objRememberedValue13 = new EarningsComposable3(constraintLayoutBaseScope4Component1);
                                                        composer3.updateRememberedValue(objRememberedValue13);
                                                    }
                                                    composer3.endReplaceGroup();
                                                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(constraintLayoutScope22.constrainAs(companion5, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue13), 0.0f, 1, null), 0.0f, composer3, 0, 1);
                                                    ProtoAdvancedChartGroupState protoAdvancedChartGroupState = new ProtoAdvancedChartGroupState(new ProtoAxisConfig(0.0f, 0.0f, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), null, null, false, YAxisLocation.START, null, false, null, 1847, null), new ScrubConfig(true, false, null, false, false, false, true, immutableList, false, 256, null), AdvancedChartGroupState5.NONE, 0, true, null, 40, null);
                                                    composer3.startReplaceGroup(5004770);
                                                    Object objRememberedValue14 = composer3.rememberedValue();
                                                    if (objRememberedValue14 == companion4.getEmpty()) {
                                                        snapshotState4 = snapshotState5;
                                                        objRememberedValue14 = new EarningsComposable4(snapshotState4);
                                                        composer3.updateRememberedValue(objRememberedValue14);
                                                    } else {
                                                        snapshotState4 = snapshotState5;
                                                    }
                                                    composer3.endReplaceGroup();
                                                    SnapshotState snapshotState6 = snapshotState4;
                                                    SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup(chartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2, null, protoAdvancedChartGroupState, null, null, (Function1) objRememberedValue14, null, null, composer3, 1572864 | (ProtoAdvancedChartGroupState.$stable << 9), 436);
                                                    ScrubState scrubStateEarningsContent$lambda$30$lambda$29$lambda$20 = EarningsComposable.EarningsContent$lambda$30$lambda$29$lambda$20(snapshotState6);
                                                    Float fValueOf = (scrubStateEarningsContent$lambda$30$lambda$29$lambda$20 == null || (point = scrubStateEarningsContent$lambda$30$lambda$29$lambda$20.getPoint()) == null) ? null : Float.valueOf(point.getX());
                                                    composer3.startReplaceGroup(5004770);
                                                    boolean zChanged5 = composer3.changed(constraintLayoutBaseScope4Component2);
                                                    Object objRememberedValue15 = composer3.rememberedValue();
                                                    if (zChanged5 || objRememberedValue15 == companion4.getEmpty()) {
                                                        objRememberedValue15 = new EarningsComposable5(constraintLayoutBaseScope4Component2);
                                                        composer3.updateRememberedValue(objRememberedValue15);
                                                    }
                                                    composer3.endReplaceGroup();
                                                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(constraintLayoutScope22.constrainAs(companion5, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue15), 0.0f, 1, null);
                                                    ScrubState scrubStateEarningsContent$lambda$30$lambda$29$lambda$202 = EarningsComposable.EarningsContent$lambda$30$lambda$29$lambda$20(snapshotState6);
                                                    ChartLabelTrack.ChartCursorTrack(fValueOf, modifierFillMaxWidth$default2, scrubStateEarningsContent$lambda$30$lambda$29$lambda$202 != null ? scrubStateEarningsContent$lambda$30$lambda$29$lambda$202.getChartStartXOffset() : 0.0f, ComposableLambda3.rememberComposableLambda(-2000901038, true, new EarningsComposable6(snapshotState6, chartGroupDto32), composer3, 54), composer3, 3072, 0);
                                                    composer3 = composer3;
                                                }
                                                composer3.endReplaceGroup();
                                                composer3.endReplaceGroup();
                                                if (constraintLayoutScope2.getHelpersHashCode() != helpersHashCode) {
                                                    EffectsKt.SideEffect(function02, composer3, 6);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54), measurePolicy2, composerStartRestartGroup, 48, 0);
                                        composerStartRestartGroup.endReplaceGroup();
                                        m24823EarningsEpsLabelsuDo3WH8(str5, str3, str4, jM21368getAccent0d7_KjU2, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, 0.0f, composerStartRestartGroup, 6, 1), composerStartRestartGroup, (i82 >> 3) & 1022, 0);
                                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, 0.0f, composerStartRestartGroup, 6, 1);
                                        int i92 = i82 >> 12;
                                        Screen screen52 = screen4;
                                        Function1<? super String, Unit> function142 = function12;
                                        m24822EarningsCall8V94_ZQ(earningsDuxo2, jM21368getAccent0d7_KjU2, screen52, modifierM21623defaultHorizontalPaddingrAjV9yQ2, function142, composerStartRestartGroup, (i92 & 14) | ((i82 >> 15) & 896) | (i92 & 57344), 0);
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier2 = modifier3;
                                        screen3 = screen52;
                                        function13 = function142;
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    modifier2 = modifier;
                    i5 = i2 & 128;
                    if (i5 == 0) {
                    }
                    screen2 = screen;
                    i6 = i2 & 256;
                    if (i6 == 0) {
                    }
                    if ((i3 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                chartGroupDto2 = chartGroupDto;
                i4 = i2 & 64;
                if (i4 == 0) {
                }
                modifier2 = modifier;
                i5 = i2 & 128;
                if (i5 == 0) {
                }
                screen2 = screen;
                i6 = i2 & 256;
                if (i6 == 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i2 & 32) != 0) {
            }
            chartGroupDto2 = chartGroupDto;
            i4 = i2 & 64;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            i5 = i2 & 128;
            if (i5 == 0) {
            }
            screen2 = screen;
            i6 = i2 & 256;
            if (i6 == 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        chartGroupDto2 = chartGroupDto;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        screen2 = screen;
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: EarningsEpsLabels-uDo3WH8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m24823EarningsEpsLabelsuDo3WH8(final String str, final String str2, String str3, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        String str4;
        int i3;
        final String str5;
        long j2;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2083110753);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str4 = str;
        } else {
            str4 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str4) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                str5 = str3;
                i3 |= composerStartRestartGroup.changed(str5) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
                j2 = j;
            } else {
                j2 = j;
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
                }
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2083110753, i3, -1, "com.robinhood.shared.common.earnings.EarningsEpsLabels (EarningsComposable.kt:370)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
                    int i6 = i3;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    m24824EarningsLabelDTcfvLk(StringResources_androidKt.stringResource(C37450R.string.instrument_detail_earnings_estimated_eps_label, composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), Color.m6705copywmQWz5c$default(j2, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), str4, Row5.weight$default(row6, companion2, 0.5f, false, 2, null), composerStartRestartGroup, (i6 << 9) & 7168, 0);
                    m24824EarningsLabelDTcfvLk(StringResources_androidKt.stringResource(C37450R.string.instrument_detail_earnings_actual_eps_label, composerStartRestartGroup, 0), j, j, str2 != null ? str5 : str2, Row5.weight$default(row6, companion2, 0.5f, false, 2, null), composerStartRestartGroup, ((i6 >> 6) & 112) | ((i6 >> 3) & 896), 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EarningsComposable.EarningsEpsLabels_uDo3WH8$lambda$33(str, str2, str5, j, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                int i62 = i3;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    m24824EarningsLabelDTcfvLk(StringResources_androidKt.stringResource(C37450R.string.instrument_detail_earnings_estimated_eps_label, composerStartRestartGroup, 0), bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU(), Color.m6705copywmQWz5c$default(j2, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), str4, Row5.weight$default(row62, companion22, 0.5f, false, 2, null), composerStartRestartGroup, (i62 << 9) & 7168, 0);
                    m24824EarningsLabelDTcfvLk(StringResources_androidKt.stringResource(C37450R.string.instrument_detail_earnings_actual_eps_label, composerStartRestartGroup, 0), j, j, str2 != null ? str5 : str2, Row5.weight$default(row62, companion22, 0.5f, false, 2, null), composerStartRestartGroup, ((i62 >> 6) & 112) | ((i62 >> 3) & 896), 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str5 = str3;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0263  */
    /* renamed from: EarningsLabel-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m24824EarningsLabelDTcfvLk(final String str, long j, final long j2, final String str2, Modifier modifier, Composer composer, final int i, final int i2) {
        String str3;
        int i3;
        long j3;
        int i4;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-391484204);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str3 = str;
        } else {
            str3 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                j3 = j;
                i3 |= composerStartRestartGroup.changed(j3) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-391484204, i3, -1, "com.robinhood.shared.common.earnings.EarningsLabel (EarningsComposable.kt:403)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
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
                    int i5 = i3;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Alignment.Vertical centerVertically = companion.getCenterVertically();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(j3), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composerStartRestartGroup, (i5 & 14) | ((i5 << 3) & 896), 0, 8186);
                    float f = 8;
                    BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5169size3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(companion3, C2002Dp.m7995constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), C2002Dp.m7995constructorimpl(f)), RoundedCornerShape2.getCircleShape()), j2, null, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.startReplaceGroup(1068730269);
                    String strStringResource = str2 != null ? StringResources_androidKt.stringResource(C41827R.string.general_label_n_a, composerStartRestartGroup, 0) : str2;
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composer2, 0, 0, 8190);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final long j4 = j3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EarningsComposable.EarningsLabel_DTcfvLk$lambda$36(str, j4, j2, str2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) != 9362) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                int i52 = i3;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i62 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(j3), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextS(), composerStartRestartGroup, (i52 & 14) | ((i52 << 3) & 896), 0, 8186);
                        float f2 = 8;
                        BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5169size3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(companion32, C2002Dp.m7995constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null), C2002Dp.m7995constructorimpl(f2)), RoundedCornerShape2.getCircleShape()), j2, null, 2, null), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.startReplaceGroup(1068730269);
                        if (str2 != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composer2, 0, 0, 8190);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        j3 = j;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* renamed from: EarningsCall-8V94_ZQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m24822EarningsCall8V94_ZQ(final EarningsCall earningsDuxo2, final long j, final Screen screen, Modifier modifier, final Function1<? super String, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1299930459);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(earningsDuxo2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screen) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1299930459, i3, -1, "com.robinhood.shared.common.earnings.EarningsCall (EarningsComposable.kt:437)");
                }
                if (earningsDuxo2 != null || earningsDuxo2.getCallUrl().length() == 0) {
                    final Modifier modifier5 = modifier3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return EarningsComposable.EarningsCall_8V94_ZQ$lambda$37(earningsDuxo2, j, screen, modifier5, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = ((i3 & 14) == 4) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(screen) | ((57344 & i3) == 16384);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EarningsComposable.EarningsCall_8V94_ZQ$lambda$39$lambda$38(current, screen, earningsDuxo2, function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier6 = modifier3;
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, StringResources_androidKt.stringResource(earningsDuxo2.getCallType().getStringRes(), composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, false, Color.m6701boximpl(j2), composerStartRestartGroup, (i3 << 15) & 3670016, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.shared.common.earnings.EarningsComposableKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EarningsComposable.EarningsCall_8V94_ZQ$lambda$40(earningsDuxo2, j, screen, modifier4, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (earningsDuxo2 != null) {
            }
            final Modifier modifier52 = modifier3;
            if (ComposerKt.isTraceInProgress()) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EarningsCall_8V94_ZQ$lambda$39$lambda$38(EventLogger eventLogger, Screen screen, EarningsCall earningsDuxo2, Function1 function1) {
        logViewEarningsCallAnalytics(eventLogger, screen, earningsDuxo2.getCallType().getAnalyticsCallType());
        function1.invoke(earningsDuxo2.getCallUrl());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void logViewEarningsCallAnalytics(EventLogger eventLogger, Screen screen, EarningsCallContext.CallType callType) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_EARNINGS_CALL, screen, new Component(Component.ComponentType.LINK_BUTTON, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EarningsCallContext(callType, null, 2, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -16385, 16383, null), false, 40, null);
    }
}
