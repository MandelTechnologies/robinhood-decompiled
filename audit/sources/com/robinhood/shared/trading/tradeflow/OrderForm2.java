package com.robinhood.shared.trading.tradeflow;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: OrderForm.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u001a¿\u0002\u0010'\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u001b\b\u0002\u0010\u0014\u001a\u0015\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152O\b\u0002\u0010 \u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00182\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b%\u0010&\u001aæ\u0001\u0010.\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020#2\b\b\u0002\u0010\r\u001a\u00020\f2O\b\u0002\u0010+\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018H\u0003¢\u0006\u0004\b,\u0010-¨\u00060²\u0006\u000e\u0010/\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"", "OrderData", "Lcom/robinhood/shared/trading/tradeflow/OrderFormState;", "currentState", "orderData", "Lkotlin/Function1;", "", "onSwipeToTrade", "Lkotlin/Function0;", "orderFormTopBar", "orderFormContent", "orderReceiptCardContent", "Landroidx/compose/ui/Modifier;", "modifier", "orderFormNumpad", "orderFormBottomContent", "", "orderFormNumpadVisible", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Lkotlin/ExtensionFunctionType;", "orderReceiptScreenContent", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "foregroundColor", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "isReviewing", "", "swipeCardHeight", "", "yOffset", "swipeToTradeBackground", "Lcom/robinhood/shared/trading/tradeflow/OrderInProgressLoadingState;", "orderInProgressLoadingState", "", "swipeTextOverride", "OrderForm-VzGUr2s", "(Lcom/robinhood/shared/trading/tradeflow/OrderFormState;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function3;JJLkotlin/jvm/functions/Function5;Lcom/robinhood/shared/trading/tradeflow/OrderInProgressLoadingState;Ljava/lang/String;Landroidx/compose/runtime/Composer;III)V", "OrderForm", "swipeIndicatorAnimationDelay", "numpadHeight", "swipeText", "background", "SwipeToTradeContainer-E1AOrGg", "(Lcom/robinhood/shared/trading/tradeflow/OrderFormState;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JIILjava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;III)V", "SwipeToTradeContainer", "numPadHeight", "lib-trade-flow-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trading.tradeflow.OrderFormKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class OrderForm2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int OrderForm_VzGUr2s$lambda$12$lambda$11$lambda$10(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int OrderForm_VzGUr2s$lambda$12$lambda$9$lambda$8(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderForm_VzGUr2s$lambda$13(OrderForm6 orderForm6, Object obj, Function1 function1, Function2 function2, Function2 function22, Function2 function23, Modifier modifier, Function3 function3, Function2 function24, boolean z, Function3 function32, long j, long j2, Function5 function5, OrderInProgressLoadingState orderInProgressLoadingState, String str, int i, int i2, int i3, Composer composer, int i4) {
        m26341OrderFormVzGUr2s(orderForm6, obj, function1, function2, function22, function23, modifier, function3, function24, z, function32, j, j2, function5, orderInProgressLoadingState, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeToTradeContainer_E1AOrGg$lambda$14(OrderForm6 orderForm6, Object obj, Function1 function1, Function2 function2, Function2 function22, Function2 function23, long j, int i, int i2, String str, Modifier modifier, Function5 function5, int i3, int i4, int i5, Composer composer, int i6) {
        m26342SwipeToTradeContainerE1AOrGg(orderForm6, obj, function1, function2, function22, function23, j, i, i2, str, modifier, function5, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), RecomposeScopeImpl4.updateChangedFlags(i4), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* renamed from: OrderForm-VzGUr2s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <OrderData> void m26341OrderFormVzGUr2s(OrderForm6 currentState, final OrderData orderdata, final Function1<? super OrderData, Unit> onSwipeToTrade, final Function2<? super Composer, ? super Integer, Unit> orderFormTopBar, final Function2<? super Composer, ? super Integer, Unit> orderFormContent, final Function2<? super Composer, ? super Integer, Unit> orderReceiptCardContent, Modifier modifier, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, boolean z, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function32, long j, long j2, Function5<? super Boolean, ? super Integer, ? super Float, ? super Composer, ? super Integer, Unit> function5, OrderInProgressLoadingState orderInProgressLoadingState, String str, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function33;
        int i5;
        int i6;
        Function5<? super Boolean, ? super Integer, ? super Float, ? super Composer, ? super Integer, Unit> function52;
        int i7;
        int i8;
        boolean z2;
        long jM21368getAccent0d7_KjU;
        Function2<? super Composer, ? super Integer, Unit> function22;
        long nova;
        OrderInProgressLoadingState orderInProgressLoadingState2;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i9;
        Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function34;
        String str2;
        OrderInProgressLoadingState orderInProgressLoadingState3;
        Modifier modifier3;
        Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function35;
        long j3;
        Function5<? super Boolean, ? super Integer, ? super Float, ? super Composer, ? super Integer, Unit> function53;
        boolean z3;
        int i10;
        long j4;
        Object objRememberedValue;
        Composer.Companion companion;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue2;
        final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function36;
        Composer composer2;
        OrderForm6 orderForm6;
        String str3;
        final Function5<? super Boolean, ? super Integer, ? super Float, ? super Composer, ? super Integer, Unit> function54;
        final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function37;
        final String str4;
        final long j5;
        final OrderInProgressLoadingState orderInProgressLoadingState4;
        final Modifier modifier4;
        final long j6;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function38;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(onSwipeToTrade, "onSwipeToTrade");
        Intrinsics.checkNotNullParameter(orderFormTopBar, "orderFormTopBar");
        Intrinsics.checkNotNullParameter(orderFormContent, "orderFormContent");
        Intrinsics.checkNotNullParameter(orderReceiptCardContent, "orderReceiptCardContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1534600582);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(currentState.ordinal()) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? composerStartRestartGroup.changed(orderdata) : composerStartRestartGroup.changedInstance(orderdata) ? 32 : 16;
        }
        int i11 = 128;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onSwipeToTrade) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(orderFormTopBar) ? 2048 : 1024;
        }
        int i12 = 8192;
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(orderFormContent) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(orderReceiptCardContent) ? 131072 : 65536;
        }
        int i13 = i3 & 64;
        if (i13 != 0) {
            i4 |= 1572864;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
        }
        int i14 = i3 & 128;
        if (i14 != 0) {
            i4 |= 12582912;
            function33 = function3;
        } else {
            function33 = function3;
            if ((i & 12582912) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function33) ? 8388608 : 4194304;
            }
        }
        int i15 = i3 & 256;
        if (i15 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changed(z)) ? 536870912 : 268435456;
        }
        int i16 = i3 & 1024;
        if (i16 != 0) {
            i6 = i2 | 6;
            i5 = i16;
        } else if ((i2 & 6) == 0) {
            i5 = i16;
            i6 = i2 | (composerStartRestartGroup.changedInstance(function32) ? 4 : 2);
        } else {
            i5 = i16;
            i6 = i2;
        }
        if ((i2 & 48) == 0) {
            i6 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(j)) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4096) == 0 && composerStartRestartGroup.changed(j2)) {
                i11 = 256;
            }
            i6 |= i11;
        }
        int i17 = i6;
        int i18 = i3 & 8192;
        if (i18 == 0) {
            if ((i2 & 3072) == 0) {
                function52 = function5;
                i17 |= composerStartRestartGroup.changedInstance(function52) ? 2048 : 1024;
            }
            int i19 = i17;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0 && composerStartRestartGroup.changed(orderInProgressLoadingState)) {
                    i12 = 16384;
                }
                i7 = i19 | i12;
            } else {
                i7 = i19;
            }
            i8 = i3 & 32768;
            if (i8 == 0) {
                i7 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i7 |= composerStartRestartGroup.changed(str) ? 131072 : 65536;
            }
            if ((i4 & 306783379) != 306783378 && (i7 & 74899) == 74898 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                z4 = z;
                j5 = j;
                orderInProgressLoadingState4 = orderInProgressLoadingState;
                str4 = str;
                function54 = function52;
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
                function38 = function33;
                function24 = function2;
                function37 = function32;
                j6 = j2;
                orderForm6 = currentState;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        function33 = null;
                    }
                    Function2<? super Composer, ? super Integer, Unit> function25 = i15 == 0 ? null : function2;
                    if ((i3 & 512) == 0) {
                        z2 = currentState == OrderForm6.EDITING;
                        i4 &= -1879048193;
                    } else {
                        z2 = z;
                    }
                    Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function39 = i5 == 0 ? null : function32;
                    if ((i3 & 2048) == 0) {
                        jM21368getAccent0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU();
                        i7 &= -113;
                    } else {
                        jM21368getAccent0d7_KjU = j;
                    }
                    int i20 = i7;
                    if ((i3 & 4096) == 0) {
                        function22 = function25;
                        nova = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getNova();
                        i20 &= -897;
                    } else {
                        function22 = function25;
                        nova = j2;
                    }
                    if (i18 != 0) {
                        function52 = null;
                    }
                    if ((i3 & 16384) == 0) {
                        orderInProgressLoadingState2 = new OrderInProgressLoadingState(0, 0, null, 7, null);
                        i20 &= -57345;
                    } else {
                        orderInProgressLoadingState2 = orderInProgressLoadingState;
                    }
                    function23 = function22;
                    i9 = i4;
                    function34 = function33;
                    str2 = i8 == 0 ? null : str;
                    long j7 = nova;
                    orderInProgressLoadingState3 = orderInProgressLoadingState2;
                    modifier3 = modifier2;
                    function35 = function39;
                    j3 = jM21368getAccent0d7_KjU;
                    function53 = function52;
                    z3 = z2;
                    i10 = i20;
                    j4 = j7;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                    }
                    if ((i3 & 2048) != 0) {
                        i7 &= -113;
                    }
                    int i21 = i7;
                    if ((i3 & 4096) != 0) {
                        i21 &= -897;
                    }
                    if ((i3 & 16384) != 0) {
                        i21 &= -57345;
                    }
                    function23 = function2;
                    z3 = z;
                    function35 = function32;
                    orderInProgressLoadingState3 = orderInProgressLoadingState;
                    i10 = i21;
                    i9 = i4;
                    modifier3 = modifier2;
                    str2 = str;
                    function53 = function52;
                    j4 = j2;
                    function34 = function33;
                    j3 = j;
                }
                composerStartRestartGroup.endDefaults();
                long j8 = j4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1534600582, i9, i10, "com.robinhood.shared.trading.tradeflow.OrderForm (OrderForm.kt:93)");
                }
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.trading.tradeflow.OrderFormKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OrderForm2.OrderForm_VzGUr2s$lambda$1$lambda$0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), j3, null, 2, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Modifier modifier5 = modifier3;
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
                int i22 = i9;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.trading.tradeflow.OrderFormKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OrderForm2.OrderForm_VzGUr2s$lambda$12$lambda$5$lambda$4((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function1 = (Function1) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                function36 = function34;
                String str5 = str2;
                composer2 = composerStartRestartGroup;
                AnimatedContentKt.AnimatedContent(currentState, null, function1, null, "swipeToTradeOrderFormAnimatedContent", null, ComposableLambda3.rememberComposableLambda(-428169444, true, new OrderForm3(function36, str5, currentState, orderdata, onSwipeToTrade, orderFormTopBar, orderFormContent, function23, j8, function53, i22, j3, orderInProgressLoadingState3, function35, snapshotIntState2, orderReceiptCardContent), composer2, 54), composer2, (i22 & 14) | 1597824, 42);
                orderForm6 = currentState;
                composer2.startReplaceGroup(370366196);
                if (function36 == null) {
                    Modifier modifierAlign = boxScopeInstance.align(Modifier.INSTANCE, companion2.getBottomCenter());
                    composer2.startReplaceGroup(5004770);
                    boolean zChanged = composer2.changed(snapshotIntState2);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.trading.tradeflow.OrderFormKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OrderForm2.OrderForm_VzGUr2s$lambda$12$lambda$7$lambda$6(snapshotIntState2, (IntSize) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(modifierAlign, (Function1) objRememberedValue3);
                    boolean z5 = z3 && (orderForm6 == OrderForm6.EDITING || orderForm6 == OrderForm6.REVIEWING);
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.trading.tradeflow.OrderFormKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Integer.valueOf(OrderForm2.OrderForm_VzGUr2s$lambda$12$lambda$9$lambda$8(((Integer) obj).intValue()));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    EnterTransition enterTransitionSlideInVertically$default = EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue4, 1, null);
                    str3 = str5;
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(150, 0, null, 6, null);
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.trading.tradeflow.OrderFormKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Integer.valueOf(OrderForm2.OrderForm_VzGUr2s$lambda$12$lambda$11$lambda$10(((Integer) obj).intValue()));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceGroup();
                    AnimatedVisibilityKt.AnimatedVisibility(z5, modifierOnSizeChanged, enterTransitionSlideInVertically$default, EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default, (Function1) objRememberedValue5), (String) null, ComposableLambda3.rememberComposableLambda(1883768993, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trading.tradeflow.OrderFormKt$OrderForm$1$6
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                            invoke(animatedVisibilityScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i23) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1883768993, i23, -1, "com.robinhood.shared.trading.tradeflow.OrderForm.<anonymous>.<anonymous> (OrderForm.kt:203)");
                            }
                            function36.invoke(SizeKt.fillMaxWidth$default(WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), 0.0f, 1, null), composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 200064, 16);
                } else {
                    str3 = str5;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function310 = function35;
                function54 = function53;
                function37 = function310;
                str4 = str3;
                j5 = j3;
                orderInProgressLoadingState4 = orderInProgressLoadingState3;
                modifier4 = modifier5;
                j6 = j8;
                z4 = z3;
                function24 = function23;
                function38 = function36;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final OrderForm6 orderForm62 = orderForm6;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trading.tradeflow.OrderFormKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OrderForm2.OrderForm_VzGUr2s$lambda$13(orderForm62, orderdata, onSwipeToTrade, orderFormTopBar, orderFormContent, orderReceiptCardContent, modifier4, function38, function24, z4, function37, j5, j6, function54, orderInProgressLoadingState4, str4, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i17 |= 3072;
        function52 = function5;
        int i192 = i17;
        if ((i2 & 24576) != 0) {
        }
        i8 = i3 & 32768;
        if (i8 == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                if (i5 == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                int i202 = i7;
                if ((i3 & 4096) == 0) {
                }
                if (i18 != 0) {
                }
                if ((i3 & 16384) == 0) {
                }
                function23 = function22;
                i9 = i4;
                function34 = function33;
                if (i8 == 0) {
                }
                long j72 = nova;
                orderInProgressLoadingState3 = orderInProgressLoadingState2;
                modifier3 = modifier2;
                function35 = function39;
                j3 = jM21368getAccent0d7_KjU;
                function53 = function52;
                z3 = z2;
                i10 = i202;
                j4 = j72;
                composerStartRestartGroup.endDefaults();
                long j82 = j4;
                if (ComposerKt.isTraceInProgress()) {
                }
                Object[] objArr2 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), j3, null, 2, null);
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Modifier modifier52 = modifier3;
                Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                int i222 = i9;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    Function1 function12 = (Function1) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    function36 = function34;
                    String str52 = str2;
                    composer2 = composerStartRestartGroup;
                    AnimatedContentKt.AnimatedContent(currentState, null, function12, null, "swipeToTradeOrderFormAnimatedContent", null, ComposableLambda3.rememberComposableLambda(-428169444, true, new OrderForm3(function36, str52, currentState, orderdata, onSwipeToTrade, orderFormTopBar, orderFormContent, function23, j82, function53, i222, j3, orderInProgressLoadingState3, function35, snapshotIntState22, orderReceiptCardContent), composer2, 54), composer2, (i222 & 14) | 1597824, 42);
                    orderForm6 = currentState;
                    composer2.startReplaceGroup(370366196);
                    if (function36 == null) {
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3102 = function35;
                    function54 = function53;
                    function37 = function3102;
                    str4 = str3;
                    j5 = j3;
                    orderInProgressLoadingState4 = orderInProgressLoadingState3;
                    modifier4 = modifier52;
                    j6 = j82;
                    z4 = z3;
                    function24 = function23;
                    function38 = function36;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 OrderForm_VzGUr2s$lambda$1$lambda$0() {
        return SnapshotIntState3.mutableIntStateOf(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform OrderForm_VzGUr2s$lambda$12$lambda$5$lambda$4(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return new ContentTransform(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone(), 0.0f, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderForm_VzGUr2s$lambda$12$lambda$7$lambda$6(SnapshotIntState2 snapshotIntState2, IntSize intSize) {
        snapshotIntState2.setIntValue((int) (intSize.getPackedValue() & 4294967295L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fc  */
    /* renamed from: SwipeToTradeContainer-E1AOrGg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <OrderData> void m26342SwipeToTradeContainerE1AOrGg(final OrderForm6 orderForm6, final OrderData orderdata, final Function1<? super OrderData, Unit> function1, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final long j, final int i, final int i2, final String str, Modifier modifier, Function5<? super Boolean, ? super Integer, ? super Float, ? super Composer, ? super Integer, Unit> function5, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        Function1<? super OrderData, Unit> function12;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i7;
        String str2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        SwipeToTrade2 swipeToTrade2;
        final Modifier modifier2;
        final Function5<? super Boolean, ? super Integer, ? super Float, ? super Composer, ? super Integer, Unit> function52;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-4849639);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(orderForm6.ordinal()) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= (i3 & 64) == 0 ? composerStartRestartGroup.changed(orderdata) : composerStartRestartGroup.changedInstance(orderdata) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else {
            if ((i3 & 384) == 0) {
                function12 = function1;
                i6 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
            }
            if ((i5 & 8) == 0) {
                i6 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    function24 = function2;
                    i6 |= composerStartRestartGroup.changedInstance(function24) ? 2048 : 1024;
                }
                if ((i5 & 16) != 0) {
                    i6 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        function25 = function22;
                        i6 |= composerStartRestartGroup.changedInstance(function25) ? 16384 : 8192;
                    }
                    if ((i5 & 32) == 0) {
                        i6 |= 196608;
                    } else {
                        if ((i3 & 196608) == 0) {
                            function26 = function23;
                            i6 |= composerStartRestartGroup.changedInstance(function26) ? 131072 : 65536;
                        }
                        if ((i5 & 64) != 0) {
                            i6 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i6 |= composerStartRestartGroup.changed(j) ? 1048576 : 524288;
                        }
                        if ((i5 & 128) != 0) {
                            i6 |= 12582912;
                        } else {
                            if ((i3 & 12582912) == 0) {
                                i6 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
                            }
                            if ((i5 & 256) == 0) {
                                i6 |= 100663296;
                            } else {
                                if ((i3 & 100663296) == 0) {
                                    i7 = i2;
                                    i6 |= composerStartRestartGroup.changed(i7) ? 67108864 : 33554432;
                                }
                                if ((i5 & 512) == 0) {
                                    if ((805306368 & i3) == 0) {
                                        str2 = str;
                                        i6 |= composerStartRestartGroup.changed(str2) ? 536870912 : 268435456;
                                    }
                                    i8 = i5 & 1024;
                                    if (i8 == 0) {
                                        i9 = i4 | 6;
                                    } else if ((i4 & 6) == 0) {
                                        i9 = i4 | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
                                    } else {
                                        i9 = i4;
                                    }
                                    i10 = i5 & 2048;
                                    if (i10 == 0) {
                                        i9 |= 48;
                                        i11 = i10;
                                    } else if ((i4 & 48) == 0) {
                                        i11 = i10;
                                        i9 |= composerStartRestartGroup.changedInstance(function5) ? 32 : 16;
                                    } else {
                                        i11 = i10;
                                    }
                                    i12 = i9;
                                    if ((i6 & 306783379) == 306783378 || (i12 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                                        Modifier modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier;
                                        Function5<? super Boolean, ? super Integer, ? super Float, ? super Composer, ? super Integer, Unit> function53 = i11 == 0 ? null : function5;
                                        if (!ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-4849639, i6, i12, "com.robinhood.shared.trading.tradeflow.SwipeToTradeContainer (OrderForm.kt:227)");
                                        }
                                        if (orderForm6 != OrderForm6.EDITING) {
                                            swipeToTrade2 = SwipeToTrade2.EDITING;
                                        } else {
                                            swipeToTrade2 = SwipeToTrade2.REVIEWING;
                                        }
                                        final SwipeToTrade2 swipeToTrade22 = swipeToTrade2;
                                        final int i13 = i7;
                                        final Function2<? super Composer, ? super Integer, Unit> function27 = function24;
                                        final Function2<? super Composer, ? super Integer, Unit> function28 = function25;
                                        final Function2<? super Composer, ? super Integer, Unit> function29 = function26;
                                        int i14 = i6 >> 3;
                                        int i15 = (i6 & 3670016) | (i14 & 112) | (i14 & 8) | 100663296 | (i14 & 14) | ((i6 >> 15) & 896) | ((i6 >> 18) & 7168) | ((i12 << 12) & 57344) | ((i12 << 18) & 29360128);
                                        Modifier modifier4 = modifier3;
                                        Function5<? super Boolean, ? super Integer, ? super Float, ? super Composer, ? super Integer, Unit> function54 = function53;
                                        SwipeToTrade4.m26350SwipeToTrademwpFuRA(orderdata, function12, i, str2, modifier4, swipeToTrade22, j, function54, ComposableLambda3.rememberComposableLambda(1961166636, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trading.tradeflow.OrderFormKt$SwipeToTradeContainer$1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier5, Composer composer2, Integer num) {
                                                invoke(modifier5, composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Modifier swipeTradeModifier, Composer composer2, int i16) {
                                                int i17;
                                                Shape rectangleShape;
                                                Intrinsics.checkNotNullParameter(swipeTradeModifier, "swipeTradeModifier");
                                                if ((i16 & 6) == 0) {
                                                    i17 = i16 | (composer2.changed(swipeTradeModifier) ? 4 : 2);
                                                } else {
                                                    i17 = i16;
                                                }
                                                if ((i17 & 19) == 18 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1961166636, i17, -1, "com.robinhood.shared.trading.tradeflow.SwipeToTradeContainer.<anonymous> (OrderForm.kt:244)");
                                                }
                                                final boolean z = swipeToTrade22 == SwipeToTrade2.REVIEWING;
                                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(swipeTradeModifier, 0.0f, 1, null);
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i18 = BentoTheme.$stable;
                                                long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i18).m21371getBg0d7_KjU();
                                                composer2.startReplaceGroup(-809496932);
                                                if (z) {
                                                    float f = 0;
                                                    rectangleShape = RoundedCornerShape2.m5328RoundedCornerShapea9UjIt4(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), bentoTheme.getSpacing(composer2, i18).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i18).m21590getDefaultD9Ej5fM());
                                                } else {
                                                    rectangleShape = RectangleShape2.getRectangleShape();
                                                }
                                                composer2.endReplaceGroup();
                                                Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(modifierFillMaxSize$default, jM21371getBg0d7_KjU, rectangleShape);
                                                if (function29 == null) {
                                                    composer2.startReplaceGroup(675818440);
                                                    Function2<Composer, Integer, Unit> function210 = function27;
                                                    Function2<Composer, Integer, Unit> function211 = function28;
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4871backgroundbw27NRU);
                                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                                    Column6 column6 = Column6.INSTANCE;
                                                    function210.invoke(composer2, 0);
                                                    function211.invoke(composer2, 0);
                                                    composer2.endNode();
                                                    composer2.endReplaceGroup();
                                                } else {
                                                    composer2.startReplaceGroup(676046879);
                                                    final float fMo5013toDpu2uoSUM = ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(i13);
                                                    final Function2<Composer, Integer, Unit> function212 = function29;
                                                    final Function2<Composer, Integer, Unit> function213 = function27;
                                                    final Function2<Composer, Integer, Unit> function214 = function28;
                                                    BoxWithConstraints.BoxWithConstraints(modifierM4871backgroundbw27NRU, null, false, ComposableLambda3.rememberComposableLambda(-1180621710, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trading.tradeflow.OrderFormKt$SwipeToTradeContainer$1.2
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer3, Integer num) {
                                                            invoke(boxWithConstraints4, composer3, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* JADX WARN: Type inference failed for: r3v12 */
                                                        /* JADX WARN: Type inference failed for: r3v3 */
                                                        /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
                                                        public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer3, int i19) {
                                                            int i20;
                                                            ?? r3;
                                                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                                            if ((i19 & 6) == 0) {
                                                                i20 = i19 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                                                            } else {
                                                                i20 = i19;
                                                            }
                                                            if ((i20 & 19) == 18 && composer3.getSkipping()) {
                                                                composer3.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1180621710, i20, -1, "com.robinhood.shared.trading.tradeflow.SwipeToTradeContainer.<anonymous>.<anonymous> (OrderForm.kt:278)");
                                                            }
                                                            float fMo5102getMaxHeightD9Ej5fM = BoxWithConstraints.mo5102getMaxHeightD9Ej5fM();
                                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                                            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                                            boolean z2 = z;
                                                            float f2 = fMo5013toDpu2uoSUM;
                                                            Function2<Composer, Integer, Unit> function215 = function212;
                                                            Function2<Composer, Integer, Unit> function216 = function213;
                                                            Function2<Composer, Integer, Unit> function217 = function214;
                                                            Arrangement arrangement = Arrangement.INSTANCE;
                                                            Arrangement.Vertical top = arrangement.getTop();
                                                            Alignment.Companion companion3 = Alignment.INSTANCE;
                                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default2);
                                                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                            }
                                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                                            Column6 column62 = Column6.INSTANCE;
                                                            if (z2) {
                                                                r3 = 0;
                                                            } else {
                                                                r3 = 0;
                                                                fMo5102getMaxHeightD9Ej5fM = ((C2002Dp) RangesKt.coerceAtLeast(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(fMo5102getMaxHeightD9Ej5fM - f2)), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)))).getValue();
                                                            }
                                                            Modifier modifierWeight = column62.weight(companion2, 1.0f, true);
                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), r3);
                                                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, r3);
                                                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierWeight);
                                                            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                                            if (composer3.getApplier() == null) {
                                                                Composables.invalidApplier();
                                                            }
                                                            composer3.startReusableNode();
                                                            if (composer3.getInserting()) {
                                                                composer3.createNode(constructor3);
                                                            } else {
                                                                composer3.useNode();
                                                            }
                                                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                                                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                            }
                                                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            Modifier modifierM5158heightInVpY3zN4$default = SizeKt.m5158heightInVpY3zN4$default(companion2, 0.0f, fMo5102getMaxHeightD9Ej5fM, 1, null);
                                                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer3, 0);
                                                            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                            CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer3, modifierM5158heightInVpY3zN4$default);
                                                            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                                                            if (composer3.getApplier() == null) {
                                                                Composables.invalidApplier();
                                                            }
                                                            composer3.startReusableNode();
                                                            if (composer3.getInserting()) {
                                                                composer3.createNode(constructor4);
                                                            } else {
                                                                composer3.useNode();
                                                            }
                                                            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer3);
                                                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                            }
                                                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
                                                            function216.invoke(composer3, 0);
                                                            function217.invoke(composer3, 0);
                                                            composer3.endNode();
                                                            composer3.endNode();
                                                            function215.invoke(composer3, 0);
                                                            composer3.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer2, 54), composer2, 3072, 6);
                                                    composer2.endReplaceGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54), composerStartRestartGroup, i15, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier2 = modifier4;
                                        function52 = function54;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        modifier2 = modifier;
                                        function52 = function5;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trading.tradeflow.OrderFormKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return OrderForm2.SwipeToTradeContainer_E1AOrGg$lambda$14(orderForm6, orderdata, function1, function2, function22, function23, j, i, i2, str, modifier2, function52, i3, i4, i5, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i6 |= 805306368;
                                str2 = str;
                                i8 = i5 & 1024;
                                if (i8 == 0) {
                                }
                                i10 = i5 & 2048;
                                if (i10 == 0) {
                                }
                                i12 = i9;
                                if ((i6 & 306783379) == 306783378) {
                                    if (i8 == 0) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    if (!ComposerKt.isTraceInProgress()) {
                                    }
                                    if (orderForm6 != OrderForm6.EDITING) {
                                    }
                                    final SwipeToTrade2 swipeToTrade222 = swipeToTrade2;
                                    final int i132 = i7;
                                    final Function2<? super Composer, ? super Integer, Unit> function272 = function24;
                                    final Function2<? super Composer, ? super Integer, Unit> function282 = function25;
                                    final Function2<? super Composer, ? super Integer, Unit> function292 = function26;
                                    int i142 = i6 >> 3;
                                    int i152 = (i6 & 3670016) | (i142 & 112) | (i142 & 8) | 100663296 | (i142 & 14) | ((i6 >> 15) & 896) | ((i6 >> 18) & 7168) | ((i12 << 12) & 57344) | ((i12 << 18) & 29360128);
                                    Modifier modifier42 = modifier3;
                                    Function5<? super Boolean, ? super Integer, ? super Float, ? super Composer, ? super Integer, Unit> function542 = function53;
                                    SwipeToTrade4.m26350SwipeToTrademwpFuRA(orderdata, function12, i, str2, modifier42, swipeToTrade222, j, function542, ComposableLambda3.rememberComposableLambda(1961166636, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trading.tradeflow.OrderFormKt$SwipeToTradeContainer$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier5, Composer composer2, Integer num) {
                                            invoke(modifier5, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Modifier swipeTradeModifier, Composer composer2, int i16) {
                                            int i17;
                                            Shape rectangleShape;
                                            Intrinsics.checkNotNullParameter(swipeTradeModifier, "swipeTradeModifier");
                                            if ((i16 & 6) == 0) {
                                                i17 = i16 | (composer2.changed(swipeTradeModifier) ? 4 : 2);
                                            } else {
                                                i17 = i16;
                                            }
                                            if ((i17 & 19) == 18 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1961166636, i17, -1, "com.robinhood.shared.trading.tradeflow.SwipeToTradeContainer.<anonymous> (OrderForm.kt:244)");
                                            }
                                            final boolean z = swipeToTrade222 == SwipeToTrade2.REVIEWING;
                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(swipeTradeModifier, 0.0f, 1, null);
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i18 = BentoTheme.$stable;
                                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i18).m21371getBg0d7_KjU();
                                            composer2.startReplaceGroup(-809496932);
                                            if (z) {
                                                float f = 0;
                                                rectangleShape = RoundedCornerShape2.m5328RoundedCornerShapea9UjIt4(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), bentoTheme.getSpacing(composer2, i18).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i18).m21590getDefaultD9Ej5fM());
                                            } else {
                                                rectangleShape = RectangleShape2.getRectangleShape();
                                            }
                                            composer2.endReplaceGroup();
                                            Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(modifierFillMaxSize$default, jM21371getBg0d7_KjU, rectangleShape);
                                            if (function292 == null) {
                                                composer2.startReplaceGroup(675818440);
                                                Function2<Composer, Integer, Unit> function210 = function272;
                                                Function2<Composer, Integer, Unit> function211 = function282;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4871backgroundbw27NRU);
                                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                                Column6 column6 = Column6.INSTANCE;
                                                function210.invoke(composer2, 0);
                                                function211.invoke(composer2, 0);
                                                composer2.endNode();
                                                composer2.endReplaceGroup();
                                            } else {
                                                composer2.startReplaceGroup(676046879);
                                                final float fMo5013toDpu2uoSUM = ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(i132);
                                                final Function2<? super Composer, ? super Integer, Unit> function212 = function292;
                                                final Function2<? super Composer, ? super Integer, Unit> function213 = function272;
                                                final Function2<? super Composer, ? super Integer, Unit> function214 = function282;
                                                BoxWithConstraints.BoxWithConstraints(modifierM4871backgroundbw27NRU, null, false, ComposableLambda3.rememberComposableLambda(-1180621710, true, new Function3<BoxWithConstraints4, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trading.tradeflow.OrderFormKt$SwipeToTradeContainer$1.2
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer3, Integer num) {
                                                        invoke(boxWithConstraints4, composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX WARN: Type inference failed for: r3v12 */
                                                    /* JADX WARN: Type inference failed for: r3v3 */
                                                    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
                                                    public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer3, int i19) {
                                                        int i20;
                                                        ?? r3;
                                                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                                        if ((i19 & 6) == 0) {
                                                            i20 = i19 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                                                        } else {
                                                            i20 = i19;
                                                        }
                                                        if ((i20 & 19) == 18 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1180621710, i20, -1, "com.robinhood.shared.trading.tradeflow.SwipeToTradeContainer.<anonymous>.<anonymous> (OrderForm.kt:278)");
                                                        }
                                                        float fMo5102getMaxHeightD9Ej5fM = BoxWithConstraints.mo5102getMaxHeightD9Ej5fM();
                                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                                        boolean z2 = z;
                                                        float f2 = fMo5013toDpu2uoSUM;
                                                        Function2<Composer, Integer, Unit> function215 = function212;
                                                        Function2<Composer, Integer, Unit> function216 = function213;
                                                        Function2<Composer, Integer, Unit> function217 = function214;
                                                        Arrangement arrangement = Arrangement.INSTANCE;
                                                        Arrangement.Vertical top = arrangement.getTop();
                                                        Alignment.Companion companion3 = Alignment.INSTANCE;
                                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default2);
                                                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                        }
                                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                                        Column6 column62 = Column6.INSTANCE;
                                                        if (z2) {
                                                            r3 = 0;
                                                        } else {
                                                            r3 = 0;
                                                            fMo5102getMaxHeightD9Ej5fM = ((C2002Dp) RangesKt.coerceAtLeast(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(fMo5102getMaxHeightD9Ej5fM - f2)), C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)))).getValue();
                                                        }
                                                        Modifier modifierWeight = column62.weight(companion2, 1.0f, true);
                                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), r3);
                                                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, r3);
                                                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierWeight);
                                                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                                        if (composer3.getApplier() == null) {
                                                            Composables.invalidApplier();
                                                        }
                                                        composer3.startReusableNode();
                                                        if (composer3.getInserting()) {
                                                            composer3.createNode(constructor3);
                                                        } else {
                                                            composer3.useNode();
                                                        }
                                                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                        }
                                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        Modifier modifierM5158heightInVpY3zN4$default = SizeKt.m5158heightInVpY3zN4$default(companion2, 0.0f, fMo5102getMaxHeightD9Ej5fM, 1, null);
                                                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer3, 0);
                                                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer3, modifierM5158heightInVpY3zN4$default);
                                                        Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                                                        if (composer3.getApplier() == null) {
                                                            Composables.invalidApplier();
                                                        }
                                                        composer3.startReusableNode();
                                                        if (composer3.getInserting()) {
                                                            composer3.createNode(constructor4);
                                                        } else {
                                                            composer3.useNode();
                                                        }
                                                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer3);
                                                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                                                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                        }
                                                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
                                                        function216.invoke(composer3, 0);
                                                        function217.invoke(composer3, 0);
                                                        composer3.endNode();
                                                        composer3.endNode();
                                                        function215.invoke(composer3, 0);
                                                        composer3.endNode();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer2, 54), composer2, 3072, 6);
                                                composer2.endReplaceGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, i152, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier2 = modifier42;
                                    function52 = function542;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i7 = i2;
                            if ((i5 & 512) == 0) {
                            }
                            str2 = str;
                            i8 = i5 & 1024;
                            if (i8 == 0) {
                            }
                            i10 = i5 & 2048;
                            if (i10 == 0) {
                            }
                            i12 = i9;
                            if ((i6 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        if ((i5 & 256) == 0) {
                        }
                        i7 = i2;
                        if ((i5 & 512) == 0) {
                        }
                        str2 = str;
                        i8 = i5 & 1024;
                        if (i8 == 0) {
                        }
                        i10 = i5 & 2048;
                        if (i10 == 0) {
                        }
                        i12 = i9;
                        if ((i6 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function26 = function23;
                    if ((i5 & 64) != 0) {
                    }
                    if ((i5 & 128) != 0) {
                    }
                    if ((i5 & 256) == 0) {
                    }
                    i7 = i2;
                    if ((i5 & 512) == 0) {
                    }
                    str2 = str;
                    i8 = i5 & 1024;
                    if (i8 == 0) {
                    }
                    i10 = i5 & 2048;
                    if (i10 == 0) {
                    }
                    i12 = i9;
                    if ((i6 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function25 = function22;
                if ((i5 & 32) == 0) {
                }
                function26 = function23;
                if ((i5 & 64) != 0) {
                }
                if ((i5 & 128) != 0) {
                }
                if ((i5 & 256) == 0) {
                }
                i7 = i2;
                if ((i5 & 512) == 0) {
                }
                str2 = str;
                i8 = i5 & 1024;
                if (i8 == 0) {
                }
                i10 = i5 & 2048;
                if (i10 == 0) {
                }
                i12 = i9;
                if ((i6 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function24 = function2;
            if ((i5 & 16) != 0) {
            }
            function25 = function22;
            if ((i5 & 32) == 0) {
            }
            function26 = function23;
            if ((i5 & 64) != 0) {
            }
            if ((i5 & 128) != 0) {
            }
            if ((i5 & 256) == 0) {
            }
            i7 = i2;
            if ((i5 & 512) == 0) {
            }
            str2 = str;
            i8 = i5 & 1024;
            if (i8 == 0) {
            }
            i10 = i5 & 2048;
            if (i10 == 0) {
            }
            i12 = i9;
            if ((i6 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function12 = function1;
        if ((i5 & 8) == 0) {
        }
        function24 = function2;
        if ((i5 & 16) != 0) {
        }
        function25 = function22;
        if ((i5 & 32) == 0) {
        }
        function26 = function23;
        if ((i5 & 64) != 0) {
        }
        if ((i5 & 128) != 0) {
        }
        if ((i5 & 256) == 0) {
        }
        i7 = i2;
        if ((i5 & 512) == 0) {
        }
        str2 = str;
        i8 = i5 & 1024;
        if (i8 == 0) {
        }
        i10 = i5 & 2048;
        if (i10 == 0) {
        }
        i12 = i9;
        if ((i6 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
