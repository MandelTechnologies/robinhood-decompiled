package com.robinhood.tooltips.popup;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.window.AndroidPopup_androidKt;
import androidx.compose.p011ui.window.PopupProperties;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.tooltips.C41664R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;

/* compiled from: PopupTooltip.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u001aÅ\u0001\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001aÉ\u0001\u0010'\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0004\b%\u0010&\u001a\u0099\u0001\u00101\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010#\u001a\u00020\"2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b/\u00100\u001a)\u00106\u001a\u00020\u001b2\u0006\u00103\u001a\u0002022\b\u00105\u001a\u0004\u0018\u0001042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u00107\u001a9\u0010=\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u0001082\u0006\u0010:\u001a\u0002082\u0006\u00105\u001a\u0002042\u0006\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020*H\u0002¢\u0006\u0004\b=\u0010>\u001a9\u0010?\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u0001082\u0006\u0010:\u001a\u0002082\u0006\u00105\u001a\u0002042\u0006\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020*H\u0002¢\u0006\u0004\b?\u0010>¨\u0006F²\u0006\f\u0010@\u001a\u00020*8\nX\u008a\u0084\u0002²\u0006\f\u0010A\u001a\u00020*8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010B\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010C\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010D\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\nX\u008a\u0084\u0002²\u0006\u000e\u0010+\u001a\u00020*8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "", "displayPopup", "Lkotlin/Function0;", "", "onClick", "onAppear", "onAutoClose", "Lcom/robinhood/tooltips/popup/PopupPositioning;", "popupPositioning", "Lkotlin/time/Duration;", "closeAfter", "initialDisplayDelay", "Landroidx/compose/ui/unit/Dp;", "verticalOffset", "showArrow", "bottomPadding", "topPadding", "horizontalPadding", "Landroidx/compose/animation/EnterTransition;", "enter", "Landroidx/compose/animation/ExitTransition;", "exit", "content", "popupTooltip-BgaGok8", "(Landroidx/compose/ui/Modifier;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/tooltips/popup/PopupPositioning;Lkotlin/time/Duration;Lkotlin/time/Duration;FZFFLandroidx/compose/ui/unit/Dp;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "popupTooltip", "Lcom/robinhood/tooltips/popup/TooltipPopupPosition;", "position", "isVisible", "backgroundMinHeight", "backgroundCornerSize", "arrowWidth", "arrowHeight", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "onDismissRequest", "PopupTooltip-sX5mSQc", "(Lcom/robinhood/tooltips/popup/TooltipPopupPosition;Lkotlin/jvm/functions/Function2;ZFFFZFFFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "PopupTooltip", "Lcom/robinhood/tooltips/popup/TooltipAlignment;", "alignment", "", "arrowPositionX", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "TooltipBubble-WOs8eLw", "(Lcom/robinhood/tooltips/popup/TooltipAlignment;FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;JFFFZFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "TooltipBubble", "Landroid/view/View;", "view", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "calculateTooltipPopupPosition", "(Landroid/view/View;Landroidx/compose/ui/layout/LayoutCoordinates;Lcom/robinhood/tooltips/popup/PopupPositioning;)Lcom/robinhood/tooltips/popup/TooltipPopupPosition;", "Landroidx/compose/ui/geometry/Rect;", "parentBoundsInWindow", "boundsInWindow", "offsetX", "centerPositionX", "calculateAbovePosition", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/layout/LayoutCoordinates;FF)Lcom/robinhood/tooltips/popup/TooltipPopupPosition;", "calculateBelowPosition", "maxHeight", "maxWidth", "isClosedAfterDelay", "display", "onScreen", "latestOnAutoClose", "lib-design-system-tooltips_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class PopupTooltipKt {

    /* compiled from: PopupTooltip.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TooltipAlignment.values().length];
            try {
                iArr[TooltipAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TooltipAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PopupPositioning.values().length];
            try {
                iArr2[PopupPositioning.ABOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PopupPositioning.FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PopupPositioning.BELOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PopupTooltip_sX5mSQc$lambda$10(TooltipPopupPosition tooltipPopupPosition, Function2 function2, boolean z, float f, float f2, float f3, boolean z2, float f4, float f5, float f6, PaddingValues paddingValues, EnterTransition enterTransition, ExitTransition exitTransition, Function0 function0, Function0 function02, Function0 function03, int i, int i2, int i3, Composer composer, int i4) {
        m26517PopupTooltipsX5mSQc(tooltipPopupPosition, function2, z, f, f2, f3, z2, f4, f5, f6, paddingValues, enterTransition, exitTransition, function0, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PopupTooltip_sX5mSQc$lambda$3(TooltipPopupPosition tooltipPopupPosition, Function2 function2, boolean z, float f, float f2, float f3, boolean z2, float f4, float f5, float f6, PaddingValues paddingValues, EnterTransition enterTransition, ExitTransition exitTransition, Function0 function0, Function0 function02, Function0 function03, int i, int i2, int i3, Composer composer, int i4) {
        m26517PopupTooltipsX5mSQc(tooltipPopupPosition, function2, z, f, f2, f3, z2, f4, f5, f6, paddingValues, enterTransition, exitTransition, function0, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipBubble_WOs8eLw$lambda$20(TooltipAlignment tooltipAlignment, float f, Modifier modifier, Function0 function0, long j, float f2, float f3, float f4, boolean z, float f5, float f6, PaddingValues paddingValues, Function2 function2, int i, int i2, int i3, Composer composer, int i4) {
        m26518TooltipBubbleWOs8eLw(tooltipAlignment, f, modifier, function0, j, f2, f3, f4, z, f5, f6, paddingValues, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* renamed from: popupTooltip-BgaGok8, reason: not valid java name */
    public static final Modifier m26519popupTooltipBgaGok8(Modifier popupTooltip, Boolean bool, Function0<Unit> onClick, Function0<Unit> onAppear, Function0<Unit> onAutoClose, PopupPositioning popupPositioning, Duration duration, Duration duration2, float f, boolean z, float f2, float f3, C2002Dp c2002Dp, EnterTransition enter, ExitTransition exit, Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(popupTooltip, "$this$popupTooltip");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onAppear, "onAppear");
        Intrinsics.checkNotNullParameter(onAutoClose, "onAutoClose");
        Intrinsics.checkNotNullParameter(popupPositioning, "popupPositioning");
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Intrinsics.checkNotNullParameter(content, "content");
        return ComposedModifier2.composed$default(popupTooltip, null, new PopupTooltipKt$popupTooltip$4(bool, duration2, c2002Dp, content, f, z, enter, exit, onClick, onAppear, onAutoClose, duration, popupPositioning, f3, f2), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0129  */
    /* renamed from: PopupTooltip-sX5mSQc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m26517PopupTooltipsX5mSQc(final TooltipPopupPosition position, final Function2<? super Composer, ? super Integer, Unit> content, boolean z, float f, float f2, float f3, boolean z2, float f4, float f5, float f6, PaddingValues paddingValues, EnterTransition enterTransition, ExitTransition exitTransition, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z3;
        int i5;
        float f7;
        int i6;
        float f8;
        int i7;
        float fM7995constructorimpl;
        int i8;
        boolean z4;
        int i9;
        float fM7995constructorimpl2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float value;
        EnterTransition none;
        ExitTransition none2;
        Function0<Unit> function04;
        Function0<Unit> function05;
        ExitTransition exitTransition2;
        int i19;
        int i20;
        final boolean z5;
        PaddingValues paddingValues2;
        EnterTransition enterTransition2;
        float f9;
        final float f10;
        float f11;
        float f12;
        Function0<Unit> function06;
        int i21;
        Transition transitionUpdateTransition;
        float fMo5016toPx0680j_4;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotFloatState2 snapshotFloatState2;
        int i22;
        Alignment topCenter;
        long jM8035copyiSbpLlY$default;
        long j;
        boolean zChanged;
        Alignment alignment;
        Object objRememberedValue2;
        final float f13;
        final boolean z6;
        final Function0<Unit> function07;
        Composer composer2;
        final float f14;
        final float f15;
        final PaddingValues paddingValues3;
        final Function0<Unit> function08;
        final Function0<Unit> function09;
        final EnterTransition enterTransition3;
        final float f16;
        final float f17;
        final float f18;
        final ExitTransition exitTransition3;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1561256305);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(position) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        int i23 = i3 & 4;
        if (i23 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                z3 = z;
                i4 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    f7 = f;
                    i4 |= composerStartRestartGroup.changed(f7) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        f8 = f2;
                        i4 |= composerStartRestartGroup.changed(f8) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                        fM7995constructorimpl = f3;
                    } else {
                        fM7995constructorimpl = f3;
                        if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        z4 = z2;
                    } else {
                        z4 = z2;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                        fM7995constructorimpl2 = f4;
                    } else {
                        fM7995constructorimpl2 = f4;
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(fM7995constructorimpl2) ? 8388608 : 4194304;
                        }
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changed(f5) ? 67108864 : 33554432;
                    }
                    if ((i & 805306368) == 0) {
                        i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changed(f6)) ? 536870912 : 268435456;
                    }
                    i11 = i3 & 1024;
                    if (i11 == 0) {
                        i13 = i2 | 6;
                        i12 = i11;
                    } else if ((i2 & 6) == 0) {
                        i12 = i11;
                        i13 = i2 | (composerStartRestartGroup.changed(paddingValues) ? 4 : 2);
                    } else {
                        i12 = i11;
                        i13 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i13 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(enterTransition)) ? 32 : 16;
                    }
                    if ((i2 & 384) == 0) {
                        i13 |= ((i3 & 4096) == 0 && composerStartRestartGroup.changed(exitTransition)) ? 256 : 128;
                    }
                    int i24 = i13;
                    i14 = i3 & 8192;
                    if (i14 == 0) {
                        i15 = i24 | 3072;
                    } else if ((i2 & 3072) == 0) {
                        i15 = i24 | (composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024);
                    } else {
                        i15 = i24;
                    }
                    i16 = i3 & 16384;
                    if (i16 != 0) {
                        i17 = i15;
                        if ((i2 & 24576) == 0) {
                            i17 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                        }
                        i18 = i3 & 32768;
                        if (i18 != 0) {
                            i17 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            i17 |= composerStartRestartGroup.changedInstance(function03) ? 131072 : 65536;
                        }
                        if ((i4 & 306783379) == 306783378 && (i17 & 74899) == 74898 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            f18 = f5;
                            f16 = f6;
                            enterTransition3 = enterTransition;
                            function09 = function03;
                            composer2 = composerStartRestartGroup;
                            f13 = f7;
                            f14 = fM7995constructorimpl;
                            z6 = z4;
                            z7 = z3;
                            exitTransition3 = exitTransition;
                            function08 = function0;
                            function07 = function02;
                            f15 = fM7995constructorimpl2;
                            f17 = f8;
                            paddingValues3 = paddingValues;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i23 != 0) {
                                    z3 = true;
                                }
                                float fM7995constructorimpl3 = i5 == 0 ? C2002Dp.m7995constructorimpl(50) : f7;
                                float fM7995constructorimpl4 = i6 == 0 ? C2002Dp.m7995constructorimpl(8) : f8;
                                if (i7 != 0) {
                                    fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                                }
                                if (i8 != 0) {
                                    z4 = true;
                                }
                                if (i9 != 0) {
                                    fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(12);
                                }
                                float fM7995constructorimpl5 = i10 == 0 ? C2002Dp.m7995constructorimpl(8) : f5;
                                if ((i3 & 512) == 0) {
                                    value = ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue();
                                    i4 &= -1879048193;
                                } else {
                                    value = f6;
                                }
                                PaddingValues paddingValuesM5136PaddingValuesYgX7TsA = i12 == 0 ? PaddingKt.m5136PaddingValuesYgX7TsA(C2002Dp.m7995constructorimpl(16), C2002Dp.m7995constructorimpl(8)) : paddingValues;
                                if ((i3 & 2048) == 0) {
                                    none = EnterTransition.INSTANCE.getNone();
                                    i17 &= -113;
                                } else {
                                    none = enterTransition;
                                }
                                int i25 = i17;
                                float f19 = fM7995constructorimpl3;
                                if ((i3 & 4096) == 0) {
                                    none2 = ExitTransition.INSTANCE.getNone();
                                    i25 &= -897;
                                } else {
                                    none2 = exitTransition;
                                }
                                function04 = i14 == 0 ? null : function0;
                                function05 = i16 == 0 ? null : function02;
                                exitTransition2 = none2;
                                i19 = i25;
                                i20 = i4;
                                z5 = z4;
                                paddingValues2 = paddingValuesM5136PaddingValuesYgX7TsA;
                                f7 = f19;
                                enterTransition2 = none;
                                f9 = fM7995constructorimpl2;
                                f10 = fM7995constructorimpl4;
                                f11 = fM7995constructorimpl;
                                f12 = fM7995constructorimpl5;
                                function06 = i18 == 0 ? null : function03;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 512) != 0) {
                                    i4 &= -1879048193;
                                }
                                if ((i3 & 2048) != 0) {
                                    i17 &= -113;
                                }
                                i19 = i17;
                                if ((i3 & 4096) != 0) {
                                    i19 &= -897;
                                }
                                enterTransition2 = enterTransition;
                                exitTransition2 = exitTransition;
                                function04 = function0;
                                function05 = function02;
                                function06 = function03;
                                f9 = fM7995constructorimpl2;
                                i20 = i4;
                                f10 = f8;
                                f11 = fM7995constructorimpl;
                                z5 = z4;
                                f12 = f5;
                                value = f6;
                                paddingValues2 = paddingValues;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1561256305, i20, i19, "com.robinhood.tooltips.popup.PopupTooltip (PopupTooltip.kt:216)");
                            }
                            i21 = i19;
                            transitionUpdateTransition = TransitionKt.updateTransition(Boolean.valueOf(z3), (String) null, composerStartRestartGroup, (i20 >> 6) & 14, 2);
                            if (((Boolean) transitionUpdateTransition.getTargetState()).booleanValue() && ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue() == ((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup2 != null) {
                                    final float f20 = f7;
                                    final float f21 = f11;
                                    final float f22 = value;
                                    final float f23 = f9;
                                    final PaddingValues paddingValues4 = paddingValues2;
                                    final boolean z8 = z3;
                                    final Function0<Unit> function010 = function04;
                                    final Function0<Unit> function011 = function05;
                                    final EnterTransition enterTransition4 = enterTransition2;
                                    final Function0<Unit> function012 = function06;
                                    final float f24 = f12;
                                    final ExitTransition exitTransition4 = exitTransition2;
                                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return PopupTooltipKt.PopupTooltip_sX5mSQc$lambda$3(position, content, z8, f20, f10, f21, z5, f23, f24, f22, paddingValues4, enterTransition4, exitTransition4, function010, function011, function012, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            EnterTransition enterTransition5 = enterTransition2;
                            ExitTransition exitTransition5 = exitTransition2;
                            float f25 = f7;
                            Function0<Unit> function013 = function06;
                            Function0<Unit> function014 = function05;
                            float f26 = f10;
                            float f27 = value;
                            boolean z9 = z3;
                            long jM26526getOffsetnOccac = position.m26526getOffsetnOccac();
                            fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f27);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(position.getCenterPositionX());
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            i22 = WhenMappings.$EnumSwitchMapping$0[position.getAlignment().ordinal()];
                            if (i22 != 1) {
                                topCenter = Alignment.INSTANCE.getTopCenter();
                                jM8035copyiSbpLlY$default = IntOffset.m8035copyiSbpLlY$default(jM26526getOffsetnOccac, 0, IntOffset.m8039getYimpl(position.m26526getOffsetnOccac()), 1, null);
                                Unit unit = Unit.INSTANCE;
                            } else {
                                if (i22 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                topCenter = Alignment.INSTANCE.getBottomCenter();
                                jM8035copyiSbpLlY$default = IntOffset.m8035copyiSbpLlY$default(jM26526getOffsetnOccac, 0, IntOffset.m8039getYimpl(position.m26526getOffsetnOccac()), 1, null);
                                Unit unit2 = Unit.INSTANCE;
                            }
                            j = jM8035copyiSbpLlY$default;
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChanged = composerStartRestartGroup.changed(topCenter) | composerStartRestartGroup.changed(j);
                            alignment = topCenter;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new TooltipAlignmentOffsetPositionProvider(alignment, j, position.getCenterPositionX(), fMo5016toPx0680j_4, new Function1() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return PopupTooltipKt.PopupTooltip_sX5mSQc$lambda$9$lambda$8(snapshotFloatState2, ((Float) obj).floatValue());
                                    }
                                }, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            TooltipAlignmentOffsetPositionProvider tooltipAlignmentOffsetPositionProvider = (TooltipAlignmentOffsetPositionProvider) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            PopupProperties popupProperties = new PopupProperties(false, false, false, false, 13, (DefaultConstructorMarker) null);
                            boolean z10 = z5;
                            Function0<Unit> function015 = function04;
                            PopupTooltipKt$PopupTooltip$6 popupTooltipKt$PopupTooltip$6 = new PopupTooltipKt$PopupTooltip$6(transitionUpdateTransition, enterTransition5, exitTransition5, function013, f27, position, function015, f25, f26, f11, z10, f9, f12, paddingValues2, content, snapshotFloatState2);
                            f13 = f25;
                            z6 = z10;
                            AndroidPopup_androidKt.Popup(tooltipAlignmentOffsetPositionProvider, function014, popupProperties, ComposableLambda3.rememberComposableLambda(-1876225905, true, popupTooltipKt$PopupTooltip$6, composerStartRestartGroup, 54), composerStartRestartGroup, ((i21 >> 9) & 112) | 3456, 0);
                            function07 = function014;
                            composer2 = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f14 = f11;
                            f15 = f9;
                            paddingValues3 = paddingValues2;
                            function08 = function015;
                            function09 = function013;
                            enterTransition3 = enterTransition5;
                            f16 = f27;
                            f17 = f26;
                            f18 = f12;
                            exitTransition3 = exitTransition5;
                            z7 = z9;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return PopupTooltipKt.PopupTooltip_sX5mSQc$lambda$10(position, content, z7, f13, f17, f14, z6, f15, f18, f16, paddingValues3, enterTransition3, exitTransition3, function08, function07, function09, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i17 = i15 | 24576;
                    i18 = i3 & 32768;
                    if (i18 != 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i23 != 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 == 0) {
                            }
                            if ((i3 & 512) == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if ((i3 & 2048) == 0) {
                            }
                            int i252 = i17;
                            float f192 = fM7995constructorimpl3;
                            if ((i3 & 4096) == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            exitTransition2 = none2;
                            i19 = i252;
                            i20 = i4;
                            z5 = z4;
                            paddingValues2 = paddingValuesM5136PaddingValuesYgX7TsA;
                            f7 = f192;
                            enterTransition2 = none;
                            f9 = fM7995constructorimpl2;
                            f10 = fM7995constructorimpl4;
                            f11 = fM7995constructorimpl;
                            f12 = fM7995constructorimpl5;
                            if (i18 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i21 = i19;
                            transitionUpdateTransition = TransitionKt.updateTransition(Boolean.valueOf(z3), (String) null, composerStartRestartGroup, (i20 >> 6) & 14, 2);
                            if (((Boolean) transitionUpdateTransition.getTargetState()).booleanValue()) {
                            }
                            EnterTransition enterTransition52 = enterTransition2;
                            ExitTransition exitTransition52 = exitTransition2;
                            float f252 = f7;
                            Function0<Unit> function0132 = function06;
                            Function0<Unit> function0142 = function05;
                            float f262 = f10;
                            float f272 = value;
                            boolean z92 = z3;
                            long jM26526getOffsetnOccac2 = position.m26526getOffsetnOccac();
                            fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f272);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            i22 = WhenMappings.$EnumSwitchMapping$0[position.getAlignment().ordinal()];
                            if (i22 != 1) {
                            }
                            j = jM8035copyiSbpLlY$default;
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChanged = composerStartRestartGroup.changed(topCenter) | composerStartRestartGroup.changed(j);
                            alignment = topCenter;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue2 = new TooltipAlignmentOffsetPositionProvider(alignment, j, position.getCenterPositionX(), fMo5016toPx0680j_4, new Function1() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return PopupTooltipKt.PopupTooltip_sX5mSQc$lambda$9$lambda$8(snapshotFloatState2, ((Float) obj).floatValue());
                                    }
                                }, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                TooltipAlignmentOffsetPositionProvider tooltipAlignmentOffsetPositionProvider2 = (TooltipAlignmentOffsetPositionProvider) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                PopupProperties popupProperties2 = new PopupProperties(false, false, false, false, 13, (DefaultConstructorMarker) null);
                                boolean z102 = z5;
                                Function0<Unit> function0152 = function04;
                                PopupTooltipKt$PopupTooltip$6 popupTooltipKt$PopupTooltip$62 = new PopupTooltipKt$PopupTooltip$6(transitionUpdateTransition, enterTransition52, exitTransition52, function0132, f272, position, function0152, f252, f262, f11, z102, f9, f12, paddingValues2, content, snapshotFloatState2);
                                f13 = f252;
                                z6 = z102;
                                AndroidPopup_androidKt.Popup(tooltipAlignmentOffsetPositionProvider2, function0142, popupProperties2, ComposableLambda3.rememberComposableLambda(-1876225905, true, popupTooltipKt$PopupTooltip$62, composerStartRestartGroup, 54), composerStartRestartGroup, ((i21 >> 9) & 112) | 3456, 0);
                                function07 = function0142;
                                composer2 = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f14 = f11;
                                f15 = f9;
                                paddingValues3 = paddingValues2;
                                function08 = function0152;
                                function09 = function0132;
                                enterTransition3 = enterTransition52;
                                f16 = f272;
                                f17 = f262;
                                f18 = f12;
                                exitTransition3 = exitTransition52;
                                z7 = z92;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                f8 = f2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i11 = i3 & 1024;
                if (i11 == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if ((i2 & 384) == 0) {
                }
                int i242 = i13;
                i14 = i3 & 8192;
                if (i14 == 0) {
                }
                i16 = i3 & 16384;
                if (i16 != 0) {
                }
                i18 = i3 & 32768;
                if (i18 != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            f7 = f;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            f8 = f2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i11 = i3 & 1024;
            if (i11 == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & 384) == 0) {
            }
            int i2422 = i13;
            i14 = i3 & 8192;
            if (i14 == 0) {
            }
            i16 = i3 & 16384;
            if (i16 != 0) {
            }
            i18 = i3 & 32768;
            if (i18 != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        f7 = f;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        f8 = f2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i11 = i3 & 1024;
        if (i11 == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & 384) == 0) {
        }
        int i24222 = i13;
        i14 = i3 & 8192;
        if (i14 == 0) {
        }
        i16 = i3 & 16384;
        if (i16 != 0) {
        }
        i18 = i3 & 32768;
        if (i18 != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PopupTooltip_sX5mSQc$lambda$9$lambda$8(SnapshotFloatState2 snapshotFloatState2, float f) {
        snapshotFloatState2.setFloatValue(f);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    /* renamed from: TooltipBubble-WOs8eLw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m26518TooltipBubbleWOs8eLw(final TooltipAlignment alignment, final float f, Modifier modifier, Function0<Unit> function0, long j, float f2, float f3, float f4, boolean z, float f5, float f6, PaddingValues paddingValues, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        Function0<Unit> function02;
        long jM21373getBg30d7_KjU;
        int i7;
        float f7;
        int i8;
        float fM7995constructorimpl;
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
        float fM7995constructorimpl2;
        boolean z2;
        Modifier modifier3;
        float fM7995constructorimpl3;
        PaddingValues paddingValuesM5136PaddingValuesYgX7TsA;
        float f8;
        int i21;
        float f9;
        Function0<Unit> function03;
        final float fMo5016toPx0680j_4;
        final float fMo5016toPx0680j_42;
        final float fMo5016toPx0680j_43;
        boolean z3;
        final boolean z4;
        final Painter painterPainterResource;
        float f10;
        float fM7995constructorimpl4;
        boolean zChanged;
        Object objRememberedValue;
        boolean z5;
        Modifier modifier4;
        Function0<Unit> function04;
        Modifier modifierM4893clickableXHw0xAI$default;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final PaddingValues paddingValues2;
        final Function0<Unit> function05;
        final long j2;
        final float f11;
        final float f12;
        final float f13;
        final float f14;
        final Modifier modifier5;
        final float f15;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1356909997);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(alignment.ordinal()) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(f) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function02 = function0;
                        i4 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                    }
                    if ((i & 24576) != 0) {
                        jM21373getBg30d7_KjU = j;
                        i4 |= ((i3 & 16) == 0 && composerStartRestartGroup.changed(jM21373getBg30d7_KjU)) ? 16384 : 8192;
                    } else {
                        jM21373getBg30d7_KjU = j;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                        f7 = f2;
                    } else {
                        f7 = f2;
                        if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changed(f7) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        fM7995constructorimpl = f3;
                    } else {
                        fM7995constructorimpl = f3;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else {
                        if ((i & 12582912) == 0) {
                            i10 = i9;
                            i4 |= composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
                        }
                        i11 = i3 & 256;
                        if (i11 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i4 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
                        }
                        i12 = i3 & 512;
                        if (i12 == 0) {
                            if ((i & 805306368) == 0) {
                                i13 = i12;
                                i4 |= composerStartRestartGroup.changed(f5) ? 536870912 : 268435456;
                            }
                            i14 = i3 & 1024;
                            if (i14 == 0) {
                                i16 = i2 | 6;
                                i15 = i14;
                            } else if ((i2 & 6) == 0) {
                                i15 = i14;
                                i16 = i2 | (composerStartRestartGroup.changed(f6) ? 4 : 2);
                            } else {
                                i15 = i14;
                                i16 = i2;
                            }
                            i17 = i3 & 2048;
                            if (i17 == 0) {
                                i16 |= 48;
                                i18 = i17;
                            } else if ((i2 & 48) == 0) {
                                i18 = i17;
                                i16 |= composerStartRestartGroup.changed(paddingValues) ? 32 : 16;
                            } else {
                                i18 = i17;
                            }
                            int i22 = i16;
                            i19 = i4;
                            if ((i3 & 4096) == 0) {
                                i22 |= 384;
                            } else if ((i2 & 384) == 0) {
                                i22 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
                            }
                            if ((i19 & 306783379) != 306783378 && (i22 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                f12 = f5;
                                composer2 = composerStartRestartGroup;
                                modifier5 = modifier2;
                                function05 = function02;
                                j2 = jM21373getBg30d7_KjU;
                                f11 = f7;
                                f14 = fM7995constructorimpl;
                                f15 = f4;
                                z6 = z;
                                f13 = f6;
                                paddingValues2 = paddingValues;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier6 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i6 != 0) {
                                        function02 = null;
                                    }
                                    if ((i3 & 16) == 0) {
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i23 = BentoTheme.$stable;
                                        if (bentoTheme.getColors(composerStartRestartGroup, i23).getIsDay()) {
                                            composerStartRestartGroup.startReplaceGroup(-1679542993);
                                            jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i23).m21425getFg0d7_KjU();
                                        } else {
                                            composerStartRestartGroup.startReplaceGroup(-1679542160);
                                            jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i23).m21373getBg30d7_KjU();
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        i20 = i19 & (-57345);
                                    } else {
                                        i20 = i19;
                                    }
                                    fM7995constructorimpl2 = i7 == 0 ? C2002Dp.m7995constructorimpl(50) : f7;
                                    if (i8 != 0) {
                                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(8);
                                    }
                                    float fM7995constructorimpl5 = i10 == 0 ? C2002Dp.m7995constructorimpl(0) : f4;
                                    z2 = i11 == 0 ? true : z;
                                    modifier3 = modifier6;
                                    float fM7995constructorimpl6 = i13 == 0 ? C2002Dp.m7995constructorimpl(12) : f5;
                                    fM7995constructorimpl3 = i15 == 0 ? C2002Dp.m7995constructorimpl(8) : f6;
                                    if (i18 == 0) {
                                        fM7995constructorimpl3 = fM7995constructorimpl3;
                                        f8 = fM7995constructorimpl5;
                                        i21 = i20;
                                        paddingValuesM5136PaddingValuesYgX7TsA = PaddingKt.m5136PaddingValuesYgX7TsA(C2002Dp.m7995constructorimpl(16), C2002Dp.m7995constructorimpl(8));
                                    } else {
                                        int i24 = i20;
                                        paddingValuesM5136PaddingValuesYgX7TsA = paddingValues;
                                        f8 = fM7995constructorimpl5;
                                        i21 = i24;
                                    }
                                    f9 = fM7995constructorimpl6;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16) != 0) {
                                        fM7995constructorimpl3 = f6;
                                        i21 = i19 & (-57345);
                                        modifier3 = modifier2;
                                        fM7995constructorimpl2 = f7;
                                        z2 = z;
                                        f9 = f5;
                                    } else {
                                        f9 = f5;
                                        fM7995constructorimpl3 = f6;
                                        i21 = i19;
                                        modifier3 = modifier2;
                                        fM7995constructorimpl2 = f7;
                                        z2 = z;
                                    }
                                    paddingValuesM5136PaddingValuesYgX7TsA = paddingValues;
                                    f8 = f4;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    function03 = function02;
                                } else {
                                    function03 = function02;
                                    ComposerKt.traceEventStart(1356909997, i21, i22, "com.robinhood.tooltips.popup.TooltipBubble (PopupTooltip.kt:413)");
                                }
                                fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(fM7995constructorimpl3);
                                fMo5016toPx0680j_42 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f9);
                                fMo5016toPx0680j_43 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(fM7995constructorimpl);
                                float f16 = f9;
                                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(fM7995constructorimpl);
                                float f17 = fM7995constructorimpl3;
                                z3 = alignment != TooltipAlignment.TOP;
                                z4 = z2;
                                painterPainterResource = PainterResources_androidKt.painterResource(!z3 ? C41664R.drawable.arrow_up : C41664R.drawable.arrow_down, composerStartRestartGroup, 0);
                                if (z3) {
                                    f10 = fM7995constructorimpl;
                                    fM7995constructorimpl4 = C2002Dp.m7995constructorimpl(0);
                                } else {
                                    f10 = fM7995constructorimpl;
                                    fM7995constructorimpl4 = f8;
                                }
                                Modifier modifier7 = modifier3;
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier7, 0.0f, fM7995constructorimpl4, 0.0f, !z3 ? C2002Dp.m7995constructorimpl(0) : f8, 5, null);
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                zChanged = ((((57344 & i21) ^ 24576) <= 16384 && composerStartRestartGroup.changed(jM21373getBg30d7_KjU)) || (i21 & 24576) == 16384) | ((234881024 & i21) != 67108864) | ((i21 & 112) != 32) | composerStartRestartGroup.changed(fMo5016toPx0680j_42) | composerStartRestartGroup.changed(fMo5016toPx0680j_43) | composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | composerStartRestartGroup.changedInstance(painterPainterResource);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    final boolean z7 = z3;
                                    final long j3 = jM21373getBg30d7_KjU;
                                    objRememberedValue = new Function1() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return PopupTooltipKt.TooltipBubble_WOs8eLw$lambda$17$lambda$16(z4, f, fMo5016toPx0680j_42, fMo5016toPx0680j_43, z7, fMo5016toPx0680j_4, painterPainterResource, j3, (DrawScope) obj);
                                        }
                                    };
                                    z5 = z4;
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    z5 = z4;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierClip = Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.m5155defaultMinSizeVpY3zN4$default(DrawModifierKt.drawBehind(modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue), 0.0f, fM7995constructorimpl2, 1, null), jM21373getBg30d7_KjU, roundedCornerShapeM5327RoundedCornerShape0680j_4), roundedCornerShapeM5327RoundedCornerShape0680j_4);
                                if (function03 == null) {
                                    Function0<Unit> function06 = function03;
                                    modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierClip, false, null, null, function06, 7, null);
                                    modifier4 = modifierClip;
                                    function04 = function06;
                                    if (modifierM4893clickableXHw0xAI$default == null) {
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(modifierM4893clickableXHw0xAI$default, paddingValuesM5136PaddingValuesYgX7TsA);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding);
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.createNode(constructor);
                                    } else {
                                        composerStartRestartGroup.useNode();
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer2 = composerStartRestartGroup;
                                    BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-975709333, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$TooltipBubble$3$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i25) {
                                            if ((i25 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-975709333, i25, -1, "com.robinhood.tooltips.popup.TooltipBubble.<anonymous>.<anonymous> (PopupTooltip.kt:476)");
                                            }
                                            content.invoke(composer3, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54), composer2, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    paddingValues2 = paddingValuesM5136PaddingValuesYgX7TsA;
                                    function05 = function04;
                                    j2 = jM21373getBg30d7_KjU;
                                    f11 = fM7995constructorimpl2;
                                    f12 = f16;
                                    f13 = f17;
                                    f14 = f10;
                                    modifier5 = modifier7;
                                    f15 = f8;
                                    z6 = z5;
                                } else {
                                    modifier4 = modifierClip;
                                    function04 = function03;
                                }
                                modifierM4893clickableXHw0xAI$default = modifier4;
                                Modifier modifierPadding2 = PaddingKt.padding(modifierM4893clickableXHw0xAI$default, paddingValuesM5136PaddingValuesYgX7TsA);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding2);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    composer2 = composerStartRestartGroup;
                                    BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-975709333, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$TooltipBubble$3$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i25) {
                                            if ((i25 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-975709333, i25, -1, "com.robinhood.tooltips.popup.TooltipBubble.<anonymous>.<anonymous> (PopupTooltip.kt:476)");
                                            }
                                            content.invoke(composer3, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54), composer2, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    paddingValues2 = paddingValuesM5136PaddingValuesYgX7TsA;
                                    function05 = function04;
                                    j2 = jM21373getBg30d7_KjU;
                                    f11 = fM7995constructorimpl2;
                                    f12 = f16;
                                    f13 = f17;
                                    f14 = f10;
                                    modifier5 = modifier7;
                                    f15 = f8;
                                    z6 = z5;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return PopupTooltipKt.TooltipBubble_WOs8eLw$lambda$20(alignment, f, modifier5, function05, j2, f11, f14, f15, z6, f12, f13, paddingValues2, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 805306368;
                        i13 = i12;
                        i14 = i3 & 1024;
                        if (i14 == 0) {
                        }
                        i17 = i3 & 2048;
                        if (i17 == 0) {
                        }
                        int i222 = i16;
                        i19 = i4;
                        if ((i3 & 4096) == 0) {
                        }
                        if ((i19 & 306783379) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i5 == 0) {
                                }
                                if (i6 != 0) {
                                }
                                if ((i3 & 16) == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                modifier3 = modifier6;
                                float fM7995constructorimpl62 = i13 == 0 ? C2002Dp.m7995constructorimpl(12) : f5;
                                if (i15 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                f9 = fM7995constructorimpl62;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(fM7995constructorimpl3);
                                fMo5016toPx0680j_42 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f9);
                                fMo5016toPx0680j_43 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(fM7995constructorimpl);
                                float f162 = f9;
                                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(fM7995constructorimpl);
                                float f172 = fM7995constructorimpl3;
                                if (alignment != TooltipAlignment.TOP) {
                                }
                                z4 = z2;
                                painterPainterResource = PainterResources_androidKt.painterResource(!z3 ? C41664R.drawable.arrow_up : C41664R.drawable.arrow_down, composerStartRestartGroup, 0);
                                if (z3) {
                                }
                                Modifier modifier72 = modifier3;
                                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifier72, 0.0f, fM7995constructorimpl4, 0.0f, !z3 ? C2002Dp.m7995constructorimpl(0) : f8, 5, null);
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                if (((57344 & i21) ^ 24576) <= 16384) {
                                    zChanged = ((((57344 & i21) ^ 24576) <= 16384 && composerStartRestartGroup.changed(jM21373getBg30d7_KjU)) || (i21 & 24576) == 16384) | ((234881024 & i21) != 67108864) | ((i21 & 112) != 32) | composerStartRestartGroup.changed(fMo5016toPx0680j_42) | composerStartRestartGroup.changed(fMo5016toPx0680j_43) | composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | composerStartRestartGroup.changedInstance(painterPainterResource);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChanged) {
                                        final boolean z72 = z3;
                                        final long j32 = jM21373getBg30d7_KjU;
                                        objRememberedValue = new Function1() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return PopupTooltipKt.TooltipBubble_WOs8eLw$lambda$17$lambda$16(z4, f, fMo5016toPx0680j_42, fMo5016toPx0680j_43, z72, fMo5016toPx0680j_4, painterPainterResource, j32, (DrawScope) obj);
                                            }
                                        };
                                        z5 = z4;
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        composerStartRestartGroup.endReplaceGroup();
                                        Modifier modifierClip2 = Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.m5155defaultMinSizeVpY3zN4$default(DrawModifierKt.drawBehind(modifierM5146paddingqDBjuR0$default2, (Function1) objRememberedValue), 0.0f, fM7995constructorimpl2, 1, null), jM21373getBg30d7_KjU, roundedCornerShapeM5327RoundedCornerShape0680j_42), roundedCornerShapeM5327RoundedCornerShape0680j_42);
                                        if (function03 == null) {
                                        }
                                        modifierM4893clickableXHw0xAI$default = modifier4;
                                        Modifier modifierPadding22 = PaddingKt.padding(modifierM4893clickableXHw0xAI$default, paddingValuesM5136PaddingValuesYgX7TsA);
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPadding22);
                                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting()) {
                                        }
                                    }
                                } else {
                                    zChanged = ((((57344 & i21) ^ 24576) <= 16384 && composerStartRestartGroup.changed(jM21373getBg30d7_KjU)) || (i21 & 24576) == 16384) | ((234881024 & i21) != 67108864) | ((i21 & 112) != 32) | composerStartRestartGroup.changed(fMo5016toPx0680j_42) | composerStartRestartGroup.changed(fMo5016toPx0680j_43) | composerStartRestartGroup.changed(z3) | composerStartRestartGroup.changed(fMo5016toPx0680j_4) | composerStartRestartGroup.changedInstance(painterPainterResource);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChanged) {
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i10 = i9;
                    i11 = i3 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i3 & 512;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    i14 = i3 & 1024;
                    if (i14 == 0) {
                    }
                    i17 = i3 & 2048;
                    if (i17 == 0) {
                    }
                    int i2222 = i16;
                    i19 = i4;
                    if ((i3 & 4096) == 0) {
                    }
                    if ((i19 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function02 = function0;
                if ((i & 24576) != 0) {
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i3 & 256;
                if (i11 != 0) {
                }
                i12 = i3 & 512;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i3 & 1024;
                if (i14 == 0) {
                }
                i17 = i3 & 2048;
                if (i17 == 0) {
                }
                int i22222 = i16;
                i19 = i4;
                if ((i3 & 4096) == 0) {
                }
                if ((i19 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            function02 = function0;
            if ((i & 24576) != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i3 & 512;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i3 & 1024;
            if (i14 == 0) {
            }
            i17 = i3 & 2048;
            if (i17 == 0) {
            }
            int i222222 = i16;
            i19 = i4;
            if ((i3 & 4096) == 0) {
            }
            if ((i19 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        function02 = function0;
        if ((i & 24576) != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i3 & 512;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i3 & 1024;
        if (i14 == 0) {
        }
        i17 = i3 & 2048;
        if (i17 == 0) {
        }
        int i2222222 = i16;
        i19 = i4;
        if ((i3 & 4096) == 0) {
        }
        if ((i19 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TooltipBubble_WOs8eLw$lambda$17$lambda$16(boolean z, float f, float f2, float f3, boolean z2, float f4, Painter painter, long j, DrawScope drawBehind) {
        float f5;
        float fIntBitsToFloat;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        if (!z || f <= 0.0f) {
            return Unit.INSTANCE;
        }
        float fCoerceIn = RangesKt.coerceIn(f - (f2 / 2), f3, Float.intBitsToFloat((int) (drawBehind.getDrawContext().mo6936getSizeNHjbRc() >> 32)) - f3);
        if (z2) {
            f5 = f4;
            fIntBitsToFloat = -f5;
        } else {
            f5 = f4;
            fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.getDrawContext().mo6936getSizeNHjbRc() & 4294967295L));
        }
        drawBehind.getDrawContext().getTransform().translate(fCoerceIn, fIntBitsToFloat);
        try {
            Painter.m7009drawx_KDEd0$default(painter, drawBehind, Size.m6575constructorimpl((Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32)), 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, j, 0, 2, null), 2, null);
            drawBehind.getDrawContext().getTransform().translate(-fCoerceIn, -fIntBitsToFloat);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            drawBehind.getDrawContext().getTransform().translate(-fCoerceIn, -fIntBitsToFloat);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TooltipPopupPosition calculateTooltipPopupPosition(View view, LayoutCoordinates layoutCoordinates, PopupPositioning popupPositioning) {
        if (layoutCoordinates == null) {
            return new TooltipPopupPosition(0L, null, 0.0f, 7, null);
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        androidx.compose.p011ui.geometry.Rect rectBoundsInWindow = LayoutCoordinates2.boundsInWindow(layoutCoordinates);
        LayoutCoordinates parentCoordinates = layoutCoordinates.getParentCoordinates();
        androidx.compose.p011ui.geometry.Rect rectBoundsInWindow2 = parentCoordinates != null ? LayoutCoordinates2.boundsInWindow(parentCoordinates) : null;
        float top = rectBoundsInWindow.getTop() - rect.top;
        float bottom = (rect.bottom - r3) - rectBoundsInWindow.getBottom();
        float right = rectBoundsInWindow.getRight() - ((rectBoundsInWindow.getRight() - rectBoundsInWindow.getLeft()) / 2);
        float fCenterX = right - rect.centerX();
        int i = WhenMappings.$EnumSwitchMapping$1[popupPositioning.ordinal()];
        if (i == 1) {
            return calculateAbovePosition(rectBoundsInWindow2, rectBoundsInWindow, layoutCoordinates, fCenterX, right);
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return calculateBelowPosition(rectBoundsInWindow2, rectBoundsInWindow, layoutCoordinates, fCenterX, right);
        }
        if (top < bottom) {
            return calculateBelowPosition(rectBoundsInWindow2, rectBoundsInWindow, layoutCoordinates, fCenterX, right);
        }
        return calculateAbovePosition(rectBoundsInWindow2, rectBoundsInWindow, layoutCoordinates, fCenterX, right);
    }

    private static final TooltipPopupPosition calculateAbovePosition(androidx.compose.p011ui.geometry.Rect rect, androidx.compose.p011ui.geometry.Rect rect2, LayoutCoordinates layoutCoordinates, float f, float f2) {
        return new TooltipPopupPosition(IntOffset.m8033constructorimpl((((-((int) (layoutCoordinates.mo7241getSizeYbymL2g() & 4294967295L))) - ((int) (rect != null ? rect.getBottom() - rect2.getBottom() : 0.0f))) & 4294967295L) | (((int) f) << 32)), TooltipAlignment.BOTTOM, f2, null);
    }

    private static final TooltipPopupPosition calculateBelowPosition(androidx.compose.p011ui.geometry.Rect rect, androidx.compose.p011ui.geometry.Rect rect2, LayoutCoordinates layoutCoordinates, float f, float f2) {
        float top;
        if (rect != null) {
            top = rect2.getTop() - rect.getTop();
        } else {
            top = 0.0f;
        }
        return new TooltipPopupPosition(IntOffset.m8033constructorimpl((((int) f) << 32) | ((((int) (layoutCoordinates.mo7241getSizeYbymL2g() & 4294967295L)) + ((int) top)) & 4294967295L)), TooltipAlignment.TOP, f2, null);
    }
}
