package com.robinhood.android.charts.span;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.span.UnifiedSpanSelectorKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.utils.compose.TargetedScrollKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UnifiedSpanSelector.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u008f\u0001\u0010\u0011\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u001b\b\u0002\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\u0002\b\u000e2\u001b\b\u0002\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aJ\u0010\u0013\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001b\b\u0002\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\u0002\b\u000eH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0083\u0001\u0010\u0015\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u001b\b\u0002\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\u0002\b\u000e2\u001b\b\u0002\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\f¢\u0006\u0002\b\u000eH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\nH\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\nH\u0001¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u000f\u0010\u001d\u001a\u00020\nH\u0001¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u000f\u0010\u001e\u001a\u00020\nH\u0001¢\u0006\u0004\b\u001e\u0010\u001b\u001a\u000f\u0010\u001f\u001a\u00020\nH\u0001¢\u0006\u0004\b\u001f\u0010\u001b\u001a\u000f\u0010 \u001a\u00020\nH\u0001¢\u0006\u0004\b \u0010\u001b\u001a\u000f\u0010!\u001a\u00020\nH\u0001¢\u0006\u0004\b!\u0010\u001b\u001a\u000f\u0010\"\u001a\u00020\nH\u0001¢\u0006\u0004\b\"\u0010\u001b\u001a\u000f\u0010#\u001a\u00020\nH\u0001¢\u0006\u0004\b#\u0010\u001b\u001a\u000f\u0010$\u001a\u00020\nH\u0001¢\u0006\u0004\b$\u0010\u001b\u001a\u000f\u0010%\u001a\u00020\nH\u0001¢\u0006\u0004\b%\u0010\u001b\u001a7\u0010,\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007H\u0003¢\u0006\u0004\b,\u0010-\u001a\u000f\u0010.\u001a\u00020\nH\u0001¢\u0006\u0004\b.\u0010\u001b\u001a\u000f\u0010/\u001a\u00020\nH\u0001¢\u0006\u0004\b/\u0010\u001b\"$\u00104\u001a\u000201\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u0000008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\"$\u00107\u001a\u000205\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u0000008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00103¨\u0006;²\u0006\u0010\u00108\u001a\u0004\u0018\u0001058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010:\u001a\u0002098\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"T", "Lcom/robinhood/android/charts/span/UnifiedSpanSelectorState;", "unifiedSpanSelectorState", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/ScrollState;", "scrollState", "", "shouldScrollOverride", "Lkotlin/Function0;", "", "onScrollStart", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "trailingListItem", "trailingButton", "UnifiedDynamicSpanSelector", "(Lcom/robinhood/android/charts/span/UnifiedSpanSelectorState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "UnifiedFixedSpanSelector", "(Lcom/robinhood/android/charts/span/UnifiedSpanSelectorState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "UnifiedScrollableSpanSelector", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/charts/span/UnifiedSpanSelectorState;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/charts/span/SpanSelectorTrailingButton;", "UnifiedSpanSelectorTrailingButton", "(Lcom/robinhood/android/charts/span/SpanSelectorTrailingButton;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "UnifiedDynamicSpanSelectorPreview_Fixed", "(Landroidx/compose/runtime/Composer;I)V", "UnifiedDynamicSpanSelectorPreview_FixedTrailing", "UnifiedDynamicSpanSelectorPreview_Scrollable_Start_StartScrimGone", "UnifiedDynamicSpanSelectorPreview_Scrollable_Start_EndScrimPresent", "UnifiedDynamicSpanSelectorPreview_Scrollable_End_StartScrimPresent", "UnifiedDynamicSpanSelectorPreview_Scrollable_End_EndScrimGone", "UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_Start_StartScrimGone", "UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_Start_StartScrimGone_showTrailingListItem", "UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_Start_EndScrimPresent", "UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_End_StartScrimPresent", "UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_End_EndScrimGone", "", "minimumSpanCountOffset", "initialActiveSpan", "showTrailing", "scrollToEnd", "showTrailingListItem", "PreviewScrollable", "(IIZZZLandroidx/compose/runtime/Composer;I)V", "UnifiedDynamicSpanSelectorPreview_EmptyTrailing", "UnifiedDynamicSpanSelectorPreview_EmptyNoTrailing", "Lcom/robinhood/android/charts/span/UnifiedSpan;", "", "getWeight", "(Lcom/robinhood/android/charts/span/UnifiedSpan;)F", "weight", "Landroidx/compose/ui/unit/Dp;", "getWidth", "width", "height", "", "activeSpanId", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class UnifiedSpanSelectorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewScrollable$lambda$36(int i, int i2, boolean z, boolean z2, boolean z3, int i3, Composer composer, int i4) {
        PreviewScrollable(i, i2, z, z2, z3, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnifiedDynamicSpanSelector$lambda$0(UnifiedSpanSelectorState unifiedSpanSelectorState, Modifier modifier, ScrollState scrollState, Boolean bool, Function0 function0, Function3 function3, Function3 function32, int i, int i2, Composer composer, int i3) {
        UnifiedDynamicSpanSelector(unifiedSpanSelectorState, modifier, scrollState, bool, function0, function3, function32, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnifiedDynamicSpanSelectorPreview_EmptyNoTrailing$lambda$38(int i, Composer composer, int i2) {
        UnifiedDynamicSpanSelectorPreview_EmptyNoTrailing(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnifiedDynamicSpanSelectorPreview_EmptyTrailing$lambda$37(int i, Composer composer, int i2) {
        UnifiedDynamicSpanSelectorPreview_EmptyTrailing(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnifiedDynamicSpanSelectorPreview_Fixed$lambda$18(int i, Composer composer, int i2) {
        UnifiedDynamicSpanSelectorPreview_Fixed(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnifiedDynamicSpanSelectorPreview_FixedTrailing$lambda$19(int i, Composer composer, int i2) {
        UnifiedDynamicSpanSelectorPreview_FixedTrailing(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_End_EndScrimGone$lambda$28 */
    public static final Unit m1821x6bdc67fc(int i, Composer composer, int i2) {
        m1820x8b9ccf9d(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_End_StartScrimPresent$lambda$27 */
    public static final Unit m1823x9cdff662(int i, Composer composer, int i2) {
        m1822x9684e2c4(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_Start_EndScrimPresent$lambda$26 */
    public static final Unit m1825x5d71e9e1(int i, Composer composer, int i2) {
        m1824x83c93644(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_Start_StartScrimGone$lambda$24 */
    public static final Unit m1827xdc3ad2ea(int i, Composer composer, int i2) {
        m1826x3044e10f(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_Start_StartScrimGone_showTrailingListItem$lambda$25 */
    public static final Unit m1829x8561e776(int i, Composer composer, int i2) {
        m1828x8337175a(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UnifiedDynamicSpanSelectorPreview_Scrollable_End_EndScrimGone$lambda$23 */
    public static final Unit m1830x66bd5db3(int i, Composer composer, int i2) {
        UnifiedDynamicSpanSelectorPreview_Scrollable_End_EndScrimGone(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UnifiedDynamicSpanSelectorPreview_Scrollable_End_StartScrimPresent$lambda$22 */
    public static final Unit m1832xc21f3621(int i, Composer composer, int i2) {
        m1831x22984788(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UnifiedDynamicSpanSelectorPreview_Scrollable_Start_EndScrimPresent$lambda$21 */
    public static final Unit m1834x82b129a0(int i, Composer composer, int i2) {
        m1833xfdc9b08(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UnifiedDynamicSpanSelectorPreview_Scrollable_Start_StartScrimGone$lambda$20 */
    public static final Unit m1836xedf28aa2(int i, Composer composer, int i2) {
        m1835x4d8fd3cb(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnifiedFixedSpanSelector$lambda$6(UnifiedSpanSelectorState unifiedSpanSelectorState, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        UnifiedFixedSpanSelector(unifiedSpanSelectorState, modifier, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnifiedScrollableSpanSelector$lambda$16(Modifier modifier, UnifiedSpanSelectorState unifiedSpanSelectorState, ScrollState scrollState, Function0 function0, Function3 function3, Function3 function32, int i, int i2, Composer composer, int i3) {
        UnifiedScrollableSpanSelector(modifier, unifiedSpanSelectorState, scrollState, function0, function3, function32, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnifiedSpanSelectorTrailingButton$lambda$17(SpanSelectorTrailingButton spanSelectorTrailingButton, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UnifiedSpanSelectorTrailingButton(spanSelectorTrailingButton, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0118  */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void UnifiedDynamicSpanSelector(final UnifiedSpanSelectorState<T> unifiedSpanSelectorState, Modifier modifier, ScrollState scrollState, Boolean bool, Function0<Unit> function0, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ScrollState scrollState2;
        int i4;
        Boolean bool2;
        int i5;
        Function0<Unit> function02;
        int i6;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function33;
        int i7;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function34;
        Modifier modifier3;
        boolean z;
        ScrollState scrollStateRememberScrollState;
        int i8;
        ScrollState scrollState3;
        Boolean bool3;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function35;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function36;
        boolean z2;
        Function0<Unit> function03;
        boolean zBooleanValue;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function37;
        final Function0<Unit> function04;
        final ScrollState scrollState4;
        final Modifier modifier4;
        Composer composer2;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function38;
        final Boolean bool4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(unifiedSpanSelectorState, "unifiedSpanSelectorState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-198961471);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(unifiedSpanSelectorState) : composerStartRestartGroup.changedInstance(unifiedSpanSelectorState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    scrollState2 = scrollState;
                    int i10 = composerStartRestartGroup.changed(scrollState2) ? 256 : 128;
                    i3 |= i10;
                } else {
                    scrollState2 = scrollState;
                }
                i3 |= i10;
            } else {
                scrollState2 = scrollState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    bool2 = bool;
                    i3 |= composerStartRestartGroup.changed(bool2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else {
                        if ((196608 & i) == 0) {
                            function33 = function3;
                            i3 |= composerStartRestartGroup.changedInstance(function33) ? 131072 : 65536;
                        }
                        i7 = i2 & 64;
                        if (i7 == 0) {
                            if ((1572864 & i) == 0) {
                                function34 = function32;
                                i3 |= composerStartRestartGroup.changedInstance(function34) ? 1048576 : 524288;
                            }
                            if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                                    if ((i2 & 4) == 0) {
                                        z = false;
                                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                        i3 &= -897;
                                    } else {
                                        z = false;
                                        scrollStateRememberScrollState = scrollState2;
                                    }
                                    if (i4 != 0) {
                                        bool2 = null;
                                    }
                                    if (i5 != 0) {
                                        function02 = null;
                                    }
                                    if (i6 != 0) {
                                        function33 = null;
                                    }
                                    i8 = i3;
                                    scrollState3 = scrollStateRememberScrollState;
                                    bool3 = bool2;
                                    function35 = function33;
                                    function36 = i7 == 0 ? function34 : null;
                                    z2 = z;
                                    function03 = function02;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 4) != 0) {
                                        i3 &= -897;
                                    }
                                    i8 = i3;
                                    modifier3 = modifier2;
                                    scrollState3 = scrollState2;
                                    bool3 = bool2;
                                    function03 = function02;
                                    function35 = function33;
                                    function36 = function34;
                                    z2 = false;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-198961471, i8, -1, "com.robinhood.android.charts.span.UnifiedDynamicSpanSelector (UnifiedSpanSelector.kt:81)");
                                }
                                zBooleanValue = unifiedSpanSelectorState.getSpans().size() + (function36 == null ? 1 : z2) < 8 ? z2 : true;
                                if (bool3 != null) {
                                    zBooleanValue = bool3.booleanValue();
                                }
                                if (!zBooleanValue) {
                                    composerStartRestartGroup.startReplaceGroup(-205665001);
                                    int i11 = i8 >> 3;
                                    UnifiedScrollableSpanSelector(modifier3, unifiedSpanSelectorState, scrollState3, function03, function35, function36, composerStartRestartGroup, (i8 & 896) | (i11 & 14) | ((i8 << 3) & 112) | (i11 & 7168) | (57344 & i11) | (i11 & 458752), 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(-205335905);
                                    UnifiedFixedSpanSelector(unifiedSpanSelectorState, modifier3, function36, composerStartRestartGroup, (i8 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i8 >> 12) & 896), 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function37 = function36;
                                function04 = function03;
                                scrollState4 = scrollState3;
                                modifier4 = modifier3;
                                composer2 = composerStartRestartGroup;
                                function38 = function35;
                                bool4 = bool3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier4 = modifier2;
                                scrollState4 = scrollState2;
                                composer2 = composerStartRestartGroup;
                                bool4 = bool2;
                                function04 = function02;
                                function38 = function33;
                                function37 = function34;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda18
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return UnifiedSpanSelectorKt.UnifiedDynamicSpanSelector$lambda$0(unifiedSpanSelectorState, modifier4, scrollState4, bool4, function04, function38, function37, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 1572864;
                        function34 = function32;
                        if ((i3 & 599187) == 599186) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i9 == 0) {
                                }
                                if ((i2 & 4) == 0) {
                                }
                                if (i4 != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 != 0) {
                                }
                                i8 = i3;
                                scrollState3 = scrollStateRememberScrollState;
                                bool3 = bool2;
                                function35 = function33;
                                if (i7 == 0) {
                                }
                                z2 = z;
                                function03 = function02;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (unifiedSpanSelectorState.getSpans().size() + (function36 == null ? 1 : z2) < 8) {
                                }
                                if (bool3 != null) {
                                }
                                if (!zBooleanValue) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function37 = function36;
                                function04 = function03;
                                scrollState4 = scrollState3;
                                modifier4 = modifier3;
                                composer2 = composerStartRestartGroup;
                                function38 = function35;
                                bool4 = bool3;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function33 = function3;
                    i7 = i2 & 64;
                    if (i7 == 0) {
                    }
                    function34 = function32;
                    if ((i3 & 599187) == 599186) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function02 = function0;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function33 = function3;
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                function34 = function32;
                if ((i3 & 599187) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            bool2 = bool;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function02 = function0;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function33 = function3;
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            function34 = function32;
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        bool2 = bool;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function02 = function0;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function33 = function3;
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        function34 = function32;
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final String PreviewScrollable$lambda$31(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final C2002Dp UnifiedScrollableSpanSelector$lambda$8(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue();
    }

    /* compiled from: UnifiedSpanSelector.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$UnifiedDynamicSpanSelectorPreview_EmptyNoTrailing$1 */
    static final class C110361 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ScrollState $scrollState;

        C110361(ScrollState scrollState) {
            this.$scrollState = scrollState;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1251583689, i, -1, "com.robinhood.android.charts.span.UnifiedDynamicSpanSelectorPreview_EmptyNoTrailing.<anonymous> (UnifiedSpanSelector.kt:556)");
            }
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            ScrollState scrollState = this.$scrollState;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$UnifiedDynamicSpanSelectorPreview_EmptyNoTrailing$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UnifiedSpanSelectorKt.C110361.invoke$lambda$2$lambda$1$lambda$0((String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            UnifiedSpanSelectorKt.UnifiedDynamicSpanSelector(new UnifiedSpanSelectorState(immutableList3PersistentListOf, "", (Function1) objRememberedValue, false, null, false, 0.0f, 112, null), null, scrollState, null, null, null, null, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, 0L, 0.0f, composer, 0, 7);
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
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* compiled from: UnifiedSpanSelector.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$UnifiedDynamicSpanSelectorPreview_EmptyTrailing$1 */
    static final class C110371 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ScrollState $scrollState;

        C110371(ScrollState scrollState) {
            this.$scrollState = scrollState;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1644398952, i, -1, "com.robinhood.android.charts.span.UnifiedDynamicSpanSelectorPreview_EmptyTrailing.<anonymous> (UnifiedSpanSelector.kt:525)");
            }
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            ScrollState scrollState = this.$scrollState;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$UnifiedDynamicSpanSelectorPreview_EmptyTrailing$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UnifiedSpanSelectorKt.C110371.invoke$lambda$2$lambda$1$lambda$0((String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            UnifiedSpanSelectorKt.UnifiedDynamicSpanSelector(new UnifiedSpanSelectorState(immutableList3PersistentListOf, "", (Function1) objRememberedValue, false, null, false, 0.0f, 112, null), null, scrollState, null, null, null, ComposableSingletons$UnifiedSpanSelectorKt.INSTANCE.m12138getLambda$380826289$lib_charts_externalDebug(), composer, 1572864, 58);
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
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <T> void UnifiedFixedSpanSelector(final UnifiedSpanSelectorState<T> unifiedSpanSelectorState, Modifier modifier, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function33;
        final Modifier modifier3;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function34;
        Row6 row6;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function35;
        boolean z;
        Modifier modifierEducationTourId$default;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1450486988);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(unifiedSpanSelectorState) : composerStartRestartGroup.changedInstance(unifiedSpanSelectorState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function32 = function3;
                    i3 |= composerStartRestartGroup.changedInstance(function32) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function34 = function32;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        function32 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1450486988, i3, -1, "com.robinhood.android.charts.span.UnifiedFixedSpanSelector (UnifiedSpanSelector.kt:108)");
                    }
                    ImmutableList<UnifiedSpan<T>> immutableListComponent1 = unifiedSpanSelectorState.component1();
                    T tComponent2 = unifiedSpanSelectorState.component2();
                    final Function1<T, Unit> function1Component3 = unifiedSpanSelectorState.component3();
                    boolean showPlaceholder = unifiedSpanSelectorState.getShowPlaceholder();
                    int i6 = i3 >> 3;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composerStartRestartGroup, i6 & 14, 1);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(unifiedSpanSelectorState.m12170getBetweenSpanSpaceD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
                    Row6 row62 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1337389466);
                    for (final UnifiedSpan<T> unifiedSpan : immutableListComponent1) {
                        boolean zAreEqual = Intrinsics.areEqual(unifiedSpan.getId(), tComponent2);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChanged = composerStartRestartGroup.changed(function1Component3) | composerStartRestartGroup.changedInstance(unifiedSpan);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return UnifiedSpanSelectorKt.UnifiedFixedSpanSelector$lambda$5$lambda$4$lambda$2$lambda$1(function1Component3, unifiedSpan);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierBentoPlaceholder = ModifiersKt.bentoPlaceholder(Row5.weight$default(row62, unifiedSpan.getModifier(), getWeight(unifiedSpan), false, 2, null), zAreEqual && showPlaceholder, SpanSelector3.getSpanButtonShape());
                        String educationId = unifiedSpan.getEducationId();
                        if (educationId != null && (modifierEducationTourId$default = com.robinhood.android.educationtour.compose.ModifiersKt.educationTourId$default(modifierBentoPlaceholder, educationId, function0, null, false, false, 28, null)) != null) {
                            modifierBentoPlaceholder = modifierEducationTourId$default;
                        }
                        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function36 = function32;
                        String text = unifiedSpan.getText();
                        boolean hasCustomIntervals = unifiedSpan.getHasCustomIntervals();
                        SpanDotState spanDotState = unifiedSpan.getHasBlinkingDot() ? new SpanDotState(zAreEqual) : null;
                        if (zAreEqual || !showPlaceholder) {
                            function35 = function36;
                            z = false;
                        } else {
                            function35 = function36;
                            z = true;
                        }
                        SpanSelector3.SpanButton(modifierBentoPlaceholder, function0, text, zAreEqual, spanDotState, hasCustomIntervals, z, composerStartRestartGroup, 0, 0);
                        immutableListComponent1 = immutableListComponent1;
                        function32 = function35;
                        tComponent2 = tComponent2;
                        function1Component3 = function1Component3;
                    }
                    ImmutableList<UnifiedSpan<T>> immutableList = immutableListComponent1;
                    function33 = function32;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1337363492);
                    if (function33 != null) {
                        composerStartRestartGroup.startReplaceGroup(-1337362229);
                        if (immutableList.isEmpty()) {
                            row6 = row62;
                            Spacer2.Spacer(Row5.weight$default(row62, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                        } else {
                            row6 = row62;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function33.invoke(row6, composerStartRestartGroup, Integer.valueOf((i6 & 112) | 6));
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    function34 = function33;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return UnifiedSpanSelectorKt.UnifiedFixedSpanSelector$lambda$6(unifiedSpanSelectorState, modifier3, function34, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            function32 = function3;
            if ((i3 & 147) == 146) {
                if (i5 == 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ImmutableList<UnifiedSpan<T>> immutableListComponent12 = unifiedSpanSelectorState.component1();
                T tComponent22 = unifiedSpanSelectorState.component2();
                final Function1 function1Component32 = unifiedSpanSelectorState.component3();
                boolean showPlaceholder2 = unifiedSpanSelectorState.getShowPlaceholder();
                int i62 = i3 >> 3;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composerStartRestartGroup, i62 & 14, 1);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(unifiedSpanSelectorState.m12170getBetweenSpanSpaceD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
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
                    Row6 row622 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1337389466);
                    while (r23.hasNext()) {
                    }
                    ImmutableList<UnifiedSpan<T>> immutableList2 = immutableListComponent12;
                    function33 = function32;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1337363492);
                    if (function33 != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    function34 = function33;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        function32 = function3;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnifiedFixedSpanSelector$lambda$5$lambda$4$lambda$2$lambda$1(Function1 function1, UnifiedSpan unifiedSpan) {
        function1.invoke(unifiedSpan.getId());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <T> void UnifiedScrollableSpanSelector(Modifier modifier, final UnifiedSpanSelectorState<T> unifiedSpanSelectorState, ScrollState scrollState, Function0<Unit> function0, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        ScrollState scrollState2;
        Function0<Unit> function02;
        int i4;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function33;
        int i5;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function34;
        ScrollState scrollStateRememberScrollState;
        ScrollState scrollState3;
        Function0<Unit> function03;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function35;
        Modifier modifier3;
        int i6;
        boolean showFadeScrim;
        float f;
        final float density;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean zChanged;
        Object objRememberedValue2;
        Composer composer2;
        final Function0<Unit> function04;
        final ScrollState scrollState4;
        final Modifier modifier4;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function36;
        Modifier modifierM5156height3ABfNKs;
        Modifier modifierM5156height3ABfNKs2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1374830031);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(unifiedSpanSelectorState) : composerStartRestartGroup.changedInstance(unifiedSpanSelectorState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                scrollState2 = scrollState;
                int i8 = composerStartRestartGroup.changed(scrollState2) ? 256 : 128;
                i3 |= i8;
            } else {
                scrollState2 = scrollState;
            }
            i3 |= i8;
        } else {
            scrollState2 = scrollState;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    function33 = function3;
                    i3 |= composerStartRestartGroup.changedInstance(function33) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        function34 = function32;
                        i3 |= composerStartRestartGroup.changedInstance(function34) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 4) == 0) {
                                scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                i3 &= -897;
                            } else {
                                scrollStateRememberScrollState = scrollState2;
                            }
                            if (i9 != 0) {
                                function02 = null;
                            }
                            if (i4 != 0) {
                                function33 = null;
                            }
                            scrollState3 = scrollStateRememberScrollState;
                            if (i5 == 0) {
                                function03 = function02;
                                function35 = function33;
                                function34 = null;
                            } else {
                                function03 = function02;
                                function35 = function33;
                            }
                            modifier3 = modifier5;
                            i6 = i3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            Function3<? super Row5, ? super Composer, ? super Integer, Unit> function37 = function33;
                            modifier3 = modifier2;
                            function35 = function37;
                            i6 = i3;
                            scrollState3 = scrollState2;
                            function03 = function02;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1374830031, i6, -1, "com.robinhood.android.charts.span.UnifiedScrollableSpanSelector (UnifiedSpanSelector.kt:158)");
                        }
                        ImmutableList<UnifiedSpan<T>> immutableListComponent1 = unifiedSpanSelectorState.component1();
                        T tComponent2 = unifiedSpanSelectorState.component2();
                        Function1<T, Unit> function1Component3 = unifiedSpanSelectorState.component3();
                        boolean showPlaceholder = unifiedSpanSelectorState.getShowPlaceholder();
                        Brush gradientMaskBrush = unifiedSpanSelectorState.getGradientMaskBrush();
                        showFadeScrim = unifiedSpanSelectorState.getShowFadeScrim();
                        float value = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
                        composerStartRestartGroup.startReplaceGroup(-1638244004);
                        if (function34 == null) {
                            f = value;
                            value = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getSpanButton(composerStartRestartGroup, 0).m21952getTrailingButtonEndScrimWidthD9Ej5fM();
                        } else {
                            f = value;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        density = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity();
                        float f2 = value;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        int i10 = i6;
                        if (objRememberedValue != companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierDrawMask = com.robinhood.android.charts.ModifiersKt.drawMask(modifier3, gradientMaskBrush);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function38 = function35;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierDrawMask);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        Modifier modifierWeight$default = Row5.weight$default(row6, companion4, 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor2);
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged = composerStartRestartGroup.changed(density);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return UnifiedSpanSelectorKt.m1837x70e98e8c(density, snapshotState, (LayoutCoordinates) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        float f3 = f;
                        Function0<Unit> function05 = function03;
                        Modifier modifier6 = modifier3;
                        ScrollState scrollState5 = scrollState3;
                        composer2 = composerStartRestartGroup;
                        TargetedScrollKt.TargetedScrollRow(OnGloballyPositionedModifier3.onGloballyPositioned(companion4, (Function1) objRememberedValue2), scrollState5, arrangement.m5089spacedBy0680j_4(unifiedSpanSelectorState.m12170getBetweenSpanSpaceD9Ej5fM()), companion2.getCenterVertically(), function05, ComposableLambda3.rememberComposableLambda(1685591677, true, new UnifiedSpanSelectorKt$UnifiedScrollableSpanSelector$1$1$2(f3, unifiedSpanSelectorState, immutableListComponent1, function38, f2, tComponent2, function1Component3, showPlaceholder, scrollState3), composerStartRestartGroup, 54), composer2, ((i10 >> 3) & 112) | 199680 | (57344 & (i10 << 3)), 0);
                        composer2.startReplaceGroup(1897790665);
                        if (showFadeScrim) {
                            Modifier modifierAlign = boxScopeInstance.align(companion4, companion2.getCenterStart());
                            Brush.Companion companion5 = Brush.INSTANCE;
                            Color colorM6701boximpl = Color.m6701boximpl(((Styles) composer2.consume(Styles2.getLocalStyles())).getSpanButton(composer2, 0).m21951getScrimColor0d7_KjU());
                            Color.Companion companion6 = Color.INSTANCE;
                            Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(Background3.background$default(modifierAlign, Brush.Companion.m6676horizontalGradient8A3gB4$default(companion5, CollectionsKt.listOf((Object[]) new Color[]{colorM6701boximpl, Color.m6701boximpl(companion6.m6725getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), f3);
                            C2002Dp c2002DpUnifiedScrollableSpanSelector$lambda$8 = UnifiedScrollableSpanSelector$lambda$8(snapshotState);
                            if (c2002DpUnifiedScrollableSpanSelector$lambda$8 != null && (modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(modifierM5174width3ABfNKs, c2002DpUnifiedScrollableSpanSelector$lambda$8.getValue())) != null) {
                                modifierM5174width3ABfNKs = modifierM5156height3ABfNKs2;
                            }
                            BoxKt.Box(modifierM5174width3ABfNKs, composer2, 0);
                            Modifier modifierM5174width3ABfNKs2 = SizeKt.m5174width3ABfNKs(Background3.background$default(boxScopeInstance.align(companion4, companion2.getCenterEnd()), Brush.Companion.m6676horizontalGradient8A3gB4$default(companion5, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(companion6.m6725getTransparent0d7_KjU()), Color.m6701boximpl(((Styles) composer2.consume(Styles2.getLocalStyles())).getSpanButton(composer2, 0).m21951getScrimColor0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), f2);
                            C2002Dp c2002DpUnifiedScrollableSpanSelector$lambda$82 = UnifiedScrollableSpanSelector$lambda$8(snapshotState);
                            if (c2002DpUnifiedScrollableSpanSelector$lambda$82 != null && (modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifierM5174width3ABfNKs2, c2002DpUnifiedScrollableSpanSelector$lambda$82.getValue())) != null) {
                                modifierM5174width3ABfNKs2 = modifierM5156height3ABfNKs;
                            }
                            BoxKt.Box(modifierM5174width3ABfNKs2, composer2, 0);
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        composer2.startReplaceGroup(-842478992);
                        if (function34 != null) {
                            function34.invoke(row6, composer2, Integer.valueOf(((i10 >> 12) & 112) | 6));
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion4, f3), composer2, 0);
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function04 = function05;
                        scrollState4 = scrollState5;
                        modifier4 = modifier6;
                        function36 = function38;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        scrollState4 = scrollState2;
                        function04 = function02;
                        composer2 = composerStartRestartGroup;
                        function36 = function33;
                    }
                    final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function39 = function34;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return UnifiedSpanSelectorKt.UnifiedScrollableSpanSelector$lambda$16(modifier4, unifiedSpanSelectorState, scrollState4, function04, function36, function39, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                function34 = function32;
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 == 0) {
                        }
                        if ((i2 & 4) == 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        scrollState3 = scrollStateRememberScrollState;
                        if (i5 == 0) {
                        }
                        modifier3 = modifier5;
                        i6 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ImmutableList<UnifiedSpan<T>> immutableListComponent12 = unifiedSpanSelectorState.component1();
                        T tComponent22 = unifiedSpanSelectorState.component2();
                        Function1<T, Unit> function1Component32 = unifiedSpanSelectorState.component3();
                        boolean showPlaceholder2 = unifiedSpanSelectorState.getShowPlaceholder();
                        Brush gradientMaskBrush2 = unifiedSpanSelectorState.getGradientMaskBrush();
                        showFadeScrim = unifiedSpanSelectorState.getShowFadeScrim();
                        float value2 = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
                        composerStartRestartGroup.startReplaceGroup(-1638244004);
                        if (function34 == null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        density = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity();
                        float f22 = value2;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        int i102 = i6;
                        if (objRememberedValue != companion.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierDrawMask2 = com.robinhood.android.charts.ModifiersKt.drawMask(modifier3, gradientMaskBrush2);
                        Alignment.Companion companion22 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically2 = companion22.getCenterVertically();
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function382 = function35;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierDrawMask2);
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            Modifier.Companion companion42 = Modifier.INSTANCE;
                            Modifier modifierWeight$default2 = Row5.weight$default(row62, companion42, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                            Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting()) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                zChanged = composerStartRestartGroup.changed(density);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda16
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return UnifiedSpanSelectorKt.m1837x70e98e8c(density, snapshotState, (LayoutCoordinates) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    composerStartRestartGroup.endReplaceGroup();
                                    float f32 = f;
                                    Function0<Unit> function052 = function03;
                                    Modifier modifier62 = modifier3;
                                    ScrollState scrollState52 = scrollState3;
                                    composer2 = composerStartRestartGroup;
                                    TargetedScrollKt.TargetedScrollRow(OnGloballyPositionedModifier3.onGloballyPositioned(companion42, (Function1) objRememberedValue2), scrollState52, arrangement2.m5089spacedBy0680j_4(unifiedSpanSelectorState.m12170getBetweenSpanSpaceD9Ej5fM()), companion22.getCenterVertically(), function052, ComposableLambda3.rememberComposableLambda(1685591677, true, new UnifiedSpanSelectorKt$UnifiedScrollableSpanSelector$1$1$2(f32, unifiedSpanSelectorState, immutableListComponent12, function382, f22, tComponent22, function1Component32, showPlaceholder2, scrollState3), composerStartRestartGroup, 54), composer2, ((i102 >> 3) & 112) | 199680 | (57344 & (i102 << 3)), 0);
                                    composer2.startReplaceGroup(1897790665);
                                    if (showFadeScrim) {
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    composer2.startReplaceGroup(-842478992);
                                    if (function34 != null) {
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    function04 = function052;
                                    scrollState4 = scrollState52;
                                    modifier4 = modifier62;
                                    function36 = function382;
                                }
                            }
                        }
                    }
                }
                final Function3 function392 = function34;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function33 = function3;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            function34 = function32;
            if ((74899 & i3) == 74898) {
            }
            final Function3 function3922 = function34;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function02 = function0;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function33 = function3;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        function34 = function32;
        if ((74899 & i3) == 74898) {
        }
        final Function3 function39222 = function34;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UnifiedScrollableSpanSelector$lambda$15$lambda$14$lambda$11$lambda$10 */
    public static final Unit m1837x70e98e8c(float f, SnapshotState snapshotState, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(((int) (it.mo7241getSizeYbymL2g() & 4294967295L)) / f)));
        return Unit.INSTANCE;
    }

    private static final <T> float getWeight(UnifiedSpan<T> unifiedSpan) {
        return unifiedSpan.getHasBlinkingDot() ? 1.2f : 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> float getWidth(UnifiedSpan<T> unifiedSpan) {
        if (unifiedSpan.getHasBlinkingDot() && unifiedSpan.getHasCustomIntervals()) {
            return C2002Dp.m7995constructorimpl(70);
        }
        return (unifiedSpan.getHasBlinkingDot() || unifiedSpan.getHasCustomIntervals()) ? C2002Dp.m7995constructorimpl(60) : C2002Dp.m7995constructorimpl(50);
    }

    public static final void UnifiedSpanSelectorTrailingButton(final SpanSelectorTrailingButton trailingButton, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(trailingButton, "trailingButton");
        Composer composerStartRestartGroup = composer.startRestartGroup(1067221067);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(trailingButton) : composerStartRestartGroup.changedInstance(trailingButton) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1067221067, i3, -1, "com.robinhood.android.charts.span.UnifiedSpanSelectorTrailingButton (UnifiedSpanSelector.kt:285)");
            }
            SpanSelector3.ChartSpanTrailingButton(trailingButton.getData(), trailingButton.getOnClick(), modifier2, composerStartRestartGroup, (i3 << 3) & 896, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnifiedSpanSelectorKt.UnifiedSpanSelectorTrailingButton$lambda$17(trailingButton, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void UnifiedDynamicSpanSelectorPreview_Fixed(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1498953573);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1498953573, i, -1, "com.robinhood.android.charts.span.UnifiedDynamicSpanSelectorPreview_Fixed (UnifiedSpanSelector.kt:296)");
            }
            PreviewScrollable(0, 1, false, false, false, composerStartRestartGroup, 28086);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnifiedSpanSelectorKt.UnifiedDynamicSpanSelectorPreview_Fixed$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void UnifiedDynamicSpanSelectorPreview_FixedTrailing(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-35502121);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-35502121, i, -1, "com.robinhood.android.charts.span.UnifiedDynamicSpanSelectorPreview_FixedTrailing (UnifiedSpanSelector.kt:309)");
            }
            PreviewScrollable(-1, 1, true, false, false, composerStartRestartGroup, 28086);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnifiedSpanSelectorKt.UnifiedDynamicSpanSelectorPreview_FixedTrailing$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: UnifiedDynamicSpanSelectorPreview_Scrollable_Start_StartScrimGone */
    public static final void m1835x4d8fd3cb(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(996967039);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(996967039, i, -1, "com.robinhood.android.charts.span.UnifiedDynamicSpanSelectorPreview_Scrollable_Start_StartScrimGone (UnifiedSpanSelector.kt:322)");
            }
            PreviewScrollable(2, 1, false, false, false, composerStartRestartGroup, 28086);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnifiedSpanSelectorKt.m1836xedf28aa2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: UnifiedDynamicSpanSelectorPreview_Scrollable_Start_EndScrimPresent */
    public static final void m1833xfdc9b08(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-239304552);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-239304552, i, -1, "com.robinhood.android.charts.span.UnifiedDynamicSpanSelectorPreview_Scrollable_Start_EndScrimPresent (UnifiedSpanSelector.kt:335)");
            }
            PreviewScrollable(2, 6, false, false, false, composerStartRestartGroup, 28086);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnifiedSpanSelectorKt.m1834x82b129a0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: UnifiedDynamicSpanSelectorPreview_Scrollable_End_StartScrimPresent */
    public static final void m1831x22984788(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1184869656);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1184869656, i, -1, "com.robinhood.android.charts.span.UnifiedDynamicSpanSelectorPreview_Scrollable_End_StartScrimPresent (UnifiedSpanSelector.kt:348)");
            }
            PreviewScrollable(2, 4, false, true, false, composerStartRestartGroup, 28086);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnifiedSpanSelectorKt.m1832xc21f3621(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void UnifiedDynamicSpanSelectorPreview_Scrollable_End_EndScrimGone(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-128730611);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-128730611, i, -1, "com.robinhood.android.charts.span.UnifiedDynamicSpanSelectorPreview_Scrollable_End_EndScrimGone (UnifiedSpanSelector.kt:361)");
            }
            PreviewScrollable(2, 8, false, true, false, composerStartRestartGroup, 28086);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnifiedSpanSelectorKt.m1830x66bd5db3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_Start_StartScrimGone */
    public static final void m1826x3044e10f(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(156670403);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(156670403, i, -1, "com.robinhood.android.charts.span.UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_Start_StartScrimGone (UnifiedSpanSelector.kt:374)");
            }
            PreviewScrollable(1, 1, true, false, false, composerStartRestartGroup, 28086);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnifiedSpanSelectorKt.m1827xdc3ad2ea(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_Start_StartScrimGone_showTrailingListItem */
    public static final void m1828x8337175a(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1923217898);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1923217898, i, -1, "com.robinhood.android.charts.span.UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_Start_StartScrimGone_showTrailingListItem (UnifiedSpanSelector.kt:387)");
            }
            PreviewScrollable(1, 1, true, false, true, composerStartRestartGroup, 28086);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnifiedSpanSelectorKt.m1829x8561e776(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_Start_EndScrimPresent */
    public static final void m1824x83c93644(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-518696492);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-518696492, i, -1, "com.robinhood.android.charts.span.UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_Start_EndScrimPresent (UnifiedSpanSelector.kt:400)");
            }
            PreviewScrollable(1, 5, true, false, false, composerStartRestartGroup, 28086);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnifiedSpanSelectorKt.m1825x5d71e9e1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_End_StartScrimPresent */
    public static final void m1822x9684e2c4(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(905477716);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(905477716, i, -1, "com.robinhood.android.charts.span.UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_End_StartScrimPresent (UnifiedSpanSelector.kt:414)");
            }
            PreviewScrollable(1, 4, true, true, false, composerStartRestartGroup, 28086);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnifiedSpanSelectorKt.m1823x9cdff662(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_End_EndScrimGone */
    public static final void m1820x8b9ccf9d(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-598469807);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-598469807, i, -1, "com.robinhood.android.charts.span.UnifiedDynamicSpanSelectorPreview_ScrollableTrailing_End_EndScrimGone (UnifiedSpanSelector.kt:427)");
            }
            PreviewScrollable(1, 8, true, true, false, composerStartRestartGroup, 28086);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnifiedSpanSelectorKt.m1821x6bdc67fc(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewScrollable(final int i, final int i2, final boolean z, final boolean z2, final boolean z3, Composer composer, final int i3) {
        int i4;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(1129615819);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 = i2;
            i4 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
        } else {
            i5 = i2;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
        }
        if ((i4 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1129615819, i4, -1, "com.robinhood.android.charts.span.PreviewScrollable (UnifiedSpanSelector.kt:444)");
            }
            final int i6 = i + 8;
            PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(1, i6);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(primitiveRanges2Until, 10));
            Iterator<Integer> it = primitiveRanges2Until.iterator();
            while (it.hasNext()) {
                int iNextInt = ((PrimitiveIterators6) it).nextInt();
                arrayList.add(new UnifiedSpan(String.valueOf(iNextInt), String.valueOf(iNextInt), iNextInt == 1, iNextInt == 1, null, null, 48, null));
            }
            ImmutableList immutableList = extensions2.toImmutableList(arrayList);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(String.valueOf(i5), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            String strPreviewScrollable$lambda$31 = PreviewScrollable$lambda$31(snapshotState);
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UnifiedSpanSelectorKt.PreviewScrollable$lambda$34$lambda$33(snapshotState, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            final UnifiedSpanSelectorState unifiedSpanSelectorState = new UnifiedSpanSelectorState(immutableList, strPreviewScrollable$lambda$31, (Function1) objRememberedValue2, false, null, false, 0.0f, 112, null);
            final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1685490451, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt.PreviewScrollable.1
                public final void invoke(Composer composer2, int i7) {
                    if ((i7 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1685490451, i7, -1, "com.robinhood.android.charts.span.PreviewScrollable.<anonymous> (UnifiedSpanSelector.kt:468)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composer2, i8).m21371getBg0d7_KjU(), null, 2, null);
                    UnifiedSpanSelectorState<String> unifiedSpanSelectorState2 = unifiedSpanSelectorState;
                    ScrollState scrollState = scrollStateRememberScrollState;
                    boolean z4 = z3;
                    boolean z5 = z;
                    int i9 = i6;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    UnifiedSpanSelectorKt.UnifiedDynamicSpanSelector(unifiedSpanSelectorState2, null, scrollState, null, null, z4 ? ComposableSingletons$UnifiedSpanSelectorKt.INSTANCE.getLambda$2041563570$lib_charts_externalDebug() : null, z5 ? ComposableSingletons$UnifiedSpanSelectorKt.INSTANCE.getLambda$168350033$lib_charts_externalDebug() : null, composer2, 0, 26);
                    composer2.startReplaceGroup(1363488234);
                    if (i9 >= 8) {
                        BentoText2.m20747BentoText38GnDrw("(Previews) Start Interactive Mode to animate scrims and auto-scroll to example position", PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer2, 6, 1), Color.m6701boximpl(Color.INSTANCE.m6720getGray0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i8).getTextS(), composer2, 390, 0, 8184);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (z2) {
                Boolean bool = Boolean.TRUE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new UnifiedSpanSelectorKt$PreviewScrollable$2$1(scrollStateRememberScrollState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnifiedSpanSelectorKt.PreviewScrollable$lambda$36(i, i2, z, z2, z3, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewScrollable$lambda$34$lambda$33(SnapshotState snapshotState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        return Unit.INSTANCE;
    }

    public static final void UnifiedDynamicSpanSelectorPreview_EmptyTrailing(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1349372848);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1349372848, i, -1, "com.robinhood.android.charts.span.UnifiedDynamicSpanSelectorPreview_EmptyTrailing (UnifiedSpanSelector.kt:522)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1644398952, true, new C110371(ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1)), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnifiedSpanSelectorKt.UnifiedDynamicSpanSelectorPreview_EmptyTrailing$lambda$37(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void UnifiedDynamicSpanSelectorPreview_EmptyNoTrailing(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1199339281);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1199339281, i, -1, "com.robinhood.android.charts.span.UnifiedDynamicSpanSelectorPreview_EmptyNoTrailing (UnifiedSpanSelector.kt:553)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1251583689, true, new C110361(ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1)), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnifiedSpanSelectorKt.UnifiedDynamicSpanSelectorPreview_EmptyNoTrailing$lambda$38(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
