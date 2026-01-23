package com.robinhood.shared.trading.tradecomponentscompose.input;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.KeyframesWithSplineSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV22;
import com.robinhood.compose.bento.component.numpad.BentoNumpadTextInput;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.trading.tradecomponentscompose.C41061R;
import com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantity2;
import com.robinhood.utils.resource.StringResource;
import com.singular.sdk.internal.Constants;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TradeQuantity.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0091\u0001\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u001c²\u0006\u000e\u0010\u0015\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, m3636d2 = {"Ljava/math/BigDecimal;", "quantity", "", "showQuantityLabel", "Lkotlin/Function0;", "", "buyingPowerDisplay", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2Impl;", "numpadScope", "Lkotlin/Function1;", "onQuantityUpdated", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/shared/trading/tradecomponentscompose/input/TradeQuantityInputMode;", "inputMode", "onInputModeChanged", "defaultShareAmount", "maxShareAmount", "minShareAmount", "TradeQuantity", "(Ljava/math/BigDecimal;ZLkotlin/jvm/functions/Function2;Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2Impl;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trading/tradecomponentscompose/input/TradeQuantityInputMode;Lkotlin/jvm/functions/Function1;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Landroidx/compose/runtime/Composer;III)V", "numberOfShares", "maxValueReached", "minValueError", "playShakeAnimation", "userChangedValue", "Landroidx/compose/ui/unit/IntOffset;", "shakeOffset", "lib-trade-components-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class TradeQuantity2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradeQuantity$lambda$30(BigDecimal bigDecimal, boolean z, Function2 function2, BentoNumpadScopeV22 bentoNumpadScopeV22, Function1 function1, Modifier modifier, TradeQuantity tradeQuantity, Function1 function12, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i, int i2, int i3, Composer composer, int i4) {
        TradeQuantity(bigDecimal, z, function2, bentoNumpadScopeV22, function1, modifier, tradeQuantity, function12, bigDecimal2, bigDecimal3, bigDecimal4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradeQuantity$lambda$1$lambda$0(TradeQuantity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TradeQuantity(final BigDecimal quantity, final boolean z, final Function2<? super Composer, ? super Integer, Unit> buyingPowerDisplay, final BentoNumpadScopeV22 numpadScope, final Function1<? super BigDecimal, Unit> onQuantityUpdated, Modifier modifier, TradeQuantity tradeQuantity, Function1<? super TradeQuantity, Unit> function1, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        Function1<? super TradeQuantity, Unit> function12;
        BigDecimal bigDecimal4;
        char c;
        BigDecimal bigDecimal5;
        BigDecimal bigDecimal6;
        int i7;
        Function1<? super TradeQuantity, Unit> function13;
        BigDecimal bigDecimal7;
        BigDecimal bigDecimal8;
        Function1<? super TradeQuantity, Unit> function14;
        final BigDecimal bigDecimal9;
        int i8;
        int i9;
        BigDecimal bigDecimal10;
        BigDecimal bigDecimal11;
        TradeQuantity tradeQuantity2;
        Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        int i10;
        final SnapshotState snapshotState;
        Object objRememberedValue4;
        final SnapshotState snapshotState2;
        Object objRememberedValue5;
        final SnapshotState snapshotState3;
        Object objRememberedValue6;
        final SnapshotState snapshotState4;
        Object objRememberedValue7;
        Modifier modifier4;
        SnapshotState snapshotState5;
        long j;
        Object objRememberedValue8;
        final BigDecimal bigDecimal12;
        Object objRememberedValue9;
        final BigDecimal bigDecimal13;
        TradeQuantityTextFormatter tradeQuantityTextFormatter;
        boolean zChangedInstance;
        Object objRememberedValue10;
        Object obj;
        boolean zChangedInstance2;
        final TradeQuantity tradeQuantity3;
        Object obj2;
        TradeQuantityTextFormatter tradeQuantityTextFormatter2;
        Composer composer2;
        boolean z2;
        final SnapshotState snapshotState6;
        Function1<? super TradeQuantity, Unit> function15;
        BigDecimal bigDecimal14;
        BigDecimal bigDecimal15;
        SnapshotState snapshotState7;
        SnapshotState snapshotState8;
        Object objRememberedValue11;
        Composer composer3;
        final TradeQuantity tradeQuantity4;
        final BigDecimal bigDecimal16;
        final BigDecimal bigDecimal17;
        final BigDecimal bigDecimal18;
        final Function1<? super TradeQuantity, Unit> function16;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(buyingPowerDisplay, "buyingPowerDisplay");
        Intrinsics.checkNotNullParameter(numpadScope, "numpadScope");
        Intrinsics.checkNotNullParameter(onQuantityUpdated, "onQuantityUpdated");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1442584362);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(quantity) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(buyingPowerDisplay) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(numpadScope) : composerStartRestartGroup.changedInstance(numpadScope) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onQuantityUpdated) ? 16384 : 8192;
        }
        int i11 = i3 & 32;
        if (i11 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changed(tradeQuantity == null ? -1 : tradeQuantity.ordinal()) ? 1048576 : 524288;
            }
            i6 = i3 & 128;
            if (i6 == 0) {
                i4 |= 12582912;
                function12 = function1;
            } else {
                function12 = function1;
                if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function12) ? 8388608 : 4194304;
                }
            }
            if ((i & 100663296) != 0) {
                c = ' ';
                if ((i3 & 256) == 0) {
                    bigDecimal4 = bigDecimal;
                    int i12 = composerStartRestartGroup.changedInstance(bigDecimal4) ? 67108864 : 33554432;
                    i4 |= i12;
                } else {
                    bigDecimal4 = bigDecimal;
                }
                i4 |= i12;
            } else {
                bigDecimal4 = bigDecimal;
                c = ' ';
            }
            if ((i & 805306368) != 0) {
                if ((i3 & 512) == 0) {
                    bigDecimal5 = bigDecimal2;
                    int i13 = composerStartRestartGroup.changedInstance(bigDecimal5) ? 536870912 : 268435456;
                    i4 |= i13;
                } else {
                    bigDecimal5 = bigDecimal2;
                }
                i4 |= i13;
            } else {
                bigDecimal5 = bigDecimal2;
            }
            if ((i2 & 6) != 0) {
                if ((i3 & 1024) == 0) {
                    bigDecimal6 = bigDecimal3;
                    int i14 = composerStartRestartGroup.changedInstance(bigDecimal6) ? 4 : 2;
                    i7 = i2 | i14;
                } else {
                    bigDecimal6 = bigDecimal3;
                }
                i7 = i2 | i14;
            } else {
                bigDecimal6 = bigDecimal3;
                i7 = i2;
            }
            if ((i4 & 306783379) != 306783378 && (i7 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                tradeQuantity4 = tradeQuantity;
                function16 = function12;
                composer3 = composerStartRestartGroup;
                bigDecimal16 = bigDecimal4;
                bigDecimal17 = bigDecimal5;
                modifier5 = modifier2;
                bigDecimal18 = bigDecimal6;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    TradeQuantity tradeQuantity5 = i5 == 0 ? TradeQuantity.APPEND : tradeQuantity;
                    if (i6 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue12 = new Function1() { // from class: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    return TradeQuantity2.TradeQuantity$lambda$1$lambda$0((TradeQuantity) obj3);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                        }
                        function13 = (Function1) objRememberedValue12;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        function13 = function12;
                    }
                    if ((i3 & 256) == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue13 = new BigDecimal(Constants.SdidMigrationStatusCodes.ALREADY_SDID);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                        }
                        bigDecimal7 = (BigDecimal) objRememberedValue13;
                        composerStartRestartGroup.endReplaceGroup();
                        i4 &= -234881025;
                    } else {
                        bigDecimal7 = bigDecimal4;
                    }
                    if ((i3 & 512) == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue14 = new BigDecimal("100000");
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                        }
                        bigDecimal8 = (BigDecimal) objRememberedValue14;
                        composerStartRestartGroup.endReplaceGroup();
                        i4 &= -1879048193;
                    } else {
                        bigDecimal8 = bigDecimal5;
                    }
                    if ((i3 & 1024) != 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue15 = new BigDecimal("0.000001");
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                        }
                        bigDecimal6 = (BigDecimal) objRememberedValue15;
                        composerStartRestartGroup.endReplaceGroup();
                        i7 &= -15;
                    }
                    function14 = function13;
                    bigDecimal9 = bigDecimal7;
                    i8 = i7;
                    i9 = i4;
                    bigDecimal10 = bigDecimal8;
                    bigDecimal11 = bigDecimal6;
                    tradeQuantity2 = tradeQuantity5;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 256) != 0) {
                        i4 &= -234881025;
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                    }
                    if ((i3 & 1024) != 0) {
                        i7 &= -15;
                    }
                    i9 = i4;
                    function14 = function12;
                    bigDecimal9 = bigDecimal4;
                    modifier3 = modifier2;
                    i8 = i7;
                    bigDecimal11 = bigDecimal6;
                    bigDecimal10 = bigDecimal5;
                    tradeQuantity2 = tradeQuantity;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1442584362, i9, i8, "com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantity (TradeQuantity.kt:67)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                FocusRequester focusRequester = (FocusRequester) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 != companion.getEmpty()) {
                    i10 = 2;
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(quantity, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    i10 = 2;
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i10, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                snapshotState2 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 != companion.getEmpty()) {
                    objRememberedValue5 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                snapshotState3 = (SnapshotState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 != companion.getEmpty()) {
                    objRememberedValue6 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                snapshotState4 = (SnapshotState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 != companion.getEmpty()) {
                    modifier4 = modifier3;
                    objRememberedValue7 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                } else {
                    modifier4 = modifier3;
                }
                snapshotState5 = (SnapshotState) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                if (TradeQuantity$lambda$16(snapshotState4)) {
                    long j2 = 0;
                    j = (j2 << c) | (j2 & 4294967295L);
                } else {
                    j = (25 << c) | (0 & 4294967295L);
                }
                long jM8033constructorimpl = IntOffset.m8033constructorimpl(j);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function1() { // from class: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return TradeQuantity2.TradeQuantity$lambda$22$lambda$21((KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig) obj3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i15 = i9;
                bigDecimal12 = bigDecimal11;
                SnapshotState4<IntOffset> snapshotState4M4813animateIntOffsetAsStateHyPO7BM = AnimateAsState.m4813animateIntOffsetAsStateHyPO7BM(jM8033constructorimpl, AnimationSpecKt.keyframesWithSpline((Function1) objRememberedValue8), null, null, composerStartRestartGroup, 0, 12);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 != companion.getEmpty()) {
                    BigDecimal bigDecimal19 = bigDecimal10;
                    objRememberedValue9 = new TradeQuantityTextFormatter(0, bigDecimal19, false, new Function0() { // from class: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TradeQuantity2.TradeQuantity$lambda$25$lambda$24(coroutineScope, snapshotState2, snapshotState4);
                        }
                    }, 5, null);
                    bigDecimal13 = bigDecimal19;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                } else {
                    bigDecimal13 = bigDecimal10;
                }
                tradeQuantityTextFormatter = (TradeQuantityTextFormatter) objRememberedValue9;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                int i16 = i15 & 3670016;
                zChangedInstance = composerStartRestartGroup.changedInstance(tradeQuantityTextFormatter) | composerStartRestartGroup.changedInstance(quantity) | (i16 != 1048576);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue10 == companion.getEmpty()) {
                    obj = null;
                    objRememberedValue10 = new TradeQuantity3(tradeQuantityTextFormatter, quantity, tradeQuantity2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                } else {
                    obj = null;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(quantity, tradeQuantity2, (Function2) objRememberedValue10, composerStartRestartGroup, (i15 & 14) | ((i15 >> 15) & 112));
                String plainString = TradeQuantity$lambda$7(snapshotState).toPlainString();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance2 = (i16 != 1048576) | composerStartRestartGroup.changedInstance(bigDecimal9) | ((i15 & 29360128) != 8388608) | composerStartRestartGroup.changedInstance(bigDecimal12) | composerStartRestartGroup.changedInstance(bigDecimal13) | ((i15 & 57344) != 16384);
                Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue16 == companion.getEmpty()) {
                    tradeQuantity3 = tradeQuantity2;
                    tradeQuantityTextFormatter2 = tradeQuantityTextFormatter;
                    composer2 = composerStartRestartGroup;
                    z2 = true;
                    final Function1<? super TradeQuantity, Unit> function17 = function14;
                    snapshotState6 = snapshotState5;
                    obj2 = new Function1() { // from class: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return TradeQuantity2.TradeQuantity$lambda$28$lambda$27(bigDecimal9, tradeQuantity3, function17, bigDecimal12, bigDecimal13, onQuantityUpdated, snapshotState3, snapshotState6, snapshotState, snapshotState2, (BigDecimal) obj3);
                        }
                    };
                    function15 = function17;
                    bigDecimal14 = bigDecimal12;
                    bigDecimal15 = bigDecimal13;
                    snapshotState7 = snapshotState3;
                    snapshotState8 = snapshotState;
                    composer2.updateRememberedValue(obj2);
                } else {
                    bigDecimal14 = bigDecimal12;
                    tradeQuantityTextFormatter2 = tradeQuantityTextFormatter;
                    composer2 = composerStartRestartGroup;
                    z2 = true;
                    function15 = function14;
                    snapshotState8 = snapshotState;
                    snapshotState6 = snapshotState5;
                    tradeQuantity3 = tradeQuantity2;
                    obj2 = objRememberedValue16;
                    bigDecimal15 = bigDecimal13;
                    snapshotState7 = snapshotState3;
                }
                composer2.endReplaceGroup();
                BigDecimal bigDecimal20 = bigDecimal9;
                TradeQuantity tradeQuantity6 = tradeQuantity3;
                Composer composer4 = composer2;
                BentoNumpadTextInput.BentoNumpadTextInput(numpadScope, (Function1) obj2, null, plainString, false, tradeQuantityTextFormatter2, true, ComposableLambda3.rememberComposableLambda(-678128179, z2, new C410817(modifier4, snapshotState7, snapshotState2, snapshotState4M4813animateIntOffsetAsStateHyPO7BM, focusRequester, onQuantityUpdated, tradeQuantity6, z, snapshotState8, snapshotState6, bigDecimal20, buyingPowerDisplay, resources), composer2, 54), composer4, 14155776 | BentoNumpadScopeV22.$stable | ((i15 >> 9) & 14), 10);
                Unit unit = Unit.INSTANCE;
                composer4.startReplaceGroup(5004770);
                objRememberedValue11 = composer4.rememberedValue();
                if (objRememberedValue11 == companion.getEmpty()) {
                    objRememberedValue11 = new TradeQuantity6(focusRequester, null);
                    composer4.updateRememberedValue(objRememberedValue11);
                }
                composer4.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composer4, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer3 = composer4;
                tradeQuantity4 = tradeQuantity6;
                bigDecimal16 = bigDecimal20;
                bigDecimal17 = bigDecimal15;
                bigDecimal18 = bigDecimal14;
                function16 = function15;
                modifier5 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return TradeQuantity2.TradeQuantity$lambda$30(quantity, z, buyingPowerDisplay, numpadScope, onQuantityUpdated, modifier5, tradeQuantity4, function16, bigDecimal16, bigDecimal17, bigDecimal18, i, i2, i3, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 196608;
        modifier2 = modifier;
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        if ((i & 100663296) != 0) {
        }
        if ((i & 805306368) != 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if ((i3 & 256) == 0) {
                }
                if ((i3 & 512) == 0) {
                }
                if ((i3 & 1024) != 0) {
                }
                function14 = function13;
                bigDecimal9 = bigDecimal7;
                i8 = i7;
                i9 = i4;
                bigDecimal10 = bigDecimal8;
                bigDecimal11 = bigDecimal6;
                tradeQuantity2 = tradeQuantity5;
                modifier3 = modifier2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                final CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                FocusRequester focusRequester2 = (FocusRequester) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 != companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                snapshotState2 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 != companion.getEmpty()) {
                }
                snapshotState3 = (SnapshotState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 != companion.getEmpty()) {
                }
                snapshotState4 = (SnapshotState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 != companion.getEmpty()) {
                }
                snapshotState5 = (SnapshotState) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                if (TradeQuantity$lambda$16(snapshotState4)) {
                }
                long jM8033constructorimpl2 = IntOffset.m8033constructorimpl(j);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                int i152 = i9;
                bigDecimal12 = bigDecimal11;
                SnapshotState4<IntOffset> snapshotState4M4813animateIntOffsetAsStateHyPO7BM2 = AnimateAsState.m4813animateIntOffsetAsStateHyPO7BM(jM8033constructorimpl2, AnimationSpecKt.keyframesWithSpline((Function1) objRememberedValue8), null, null, composerStartRestartGroup, 0, 12);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 != companion.getEmpty()) {
                }
                tradeQuantityTextFormatter = (TradeQuantityTextFormatter) objRememberedValue9;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                int i162 = i152 & 3670016;
                zChangedInstance = composerStartRestartGroup.changedInstance(tradeQuantityTextFormatter) | composerStartRestartGroup.changedInstance(quantity) | (i162 != 1048576);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    obj = null;
                    objRememberedValue10 = new TradeQuantity3(tradeQuantityTextFormatter, quantity, tradeQuantity2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(quantity, tradeQuantity2, (Function2) objRememberedValue10, composerStartRestartGroup, (i152 & 14) | ((i152 >> 15) & 112));
                    String plainString2 = TradeQuantity$lambda$7(snapshotState).toPlainString();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance2 = (i162 != 1048576) | composerStartRestartGroup.changedInstance(bigDecimal9) | ((i152 & 29360128) != 8388608) | composerStartRestartGroup.changedInstance(bigDecimal12) | composerStartRestartGroup.changedInstance(bigDecimal13) | ((i152 & 57344) != 16384);
                    Object objRememberedValue162 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2) {
                        tradeQuantity3 = tradeQuantity2;
                        tradeQuantityTextFormatter2 = tradeQuantityTextFormatter;
                        composer2 = composerStartRestartGroup;
                        z2 = true;
                        final Function1 function172 = function14;
                        snapshotState6 = snapshotState5;
                        obj2 = new Function1() { // from class: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return TradeQuantity2.TradeQuantity$lambda$28$lambda$27(bigDecimal9, tradeQuantity3, function172, bigDecimal12, bigDecimal13, onQuantityUpdated, snapshotState3, snapshotState6, snapshotState, snapshotState2, (BigDecimal) obj3);
                            }
                        };
                        function15 = function172;
                        bigDecimal14 = bigDecimal12;
                        bigDecimal15 = bigDecimal13;
                        snapshotState7 = snapshotState3;
                        snapshotState8 = snapshotState;
                        composer2.updateRememberedValue(obj2);
                        composer2.endReplaceGroup();
                        BigDecimal bigDecimal202 = bigDecimal9;
                        TradeQuantity tradeQuantity62 = tradeQuantity3;
                        Composer composer42 = composer2;
                        BentoNumpadTextInput.BentoNumpadTextInput(numpadScope, (Function1) obj2, null, plainString2, false, tradeQuantityTextFormatter2, true, ComposableLambda3.rememberComposableLambda(-678128179, z2, new C410817(modifier4, snapshotState7, snapshotState2, snapshotState4M4813animateIntOffsetAsStateHyPO7BM2, focusRequester2, onQuantityUpdated, tradeQuantity62, z, snapshotState8, snapshotState6, bigDecimal202, buyingPowerDisplay, resources2), composer2, 54), composer42, 14155776 | BentoNumpadScopeV22.$stable | ((i152 >> 9) & 14), 10);
                        Unit unit2 = Unit.INSTANCE;
                        composer42.startReplaceGroup(5004770);
                        objRememberedValue11 = composer42.rememberedValue();
                        if (objRememberedValue11 == companion.getEmpty()) {
                        }
                        composer42.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composer42, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer3 = composer42;
                        tradeQuantity4 = tradeQuantity62;
                        bigDecimal16 = bigDecimal202;
                        bigDecimal17 = bigDecimal15;
                        bigDecimal18 = bigDecimal14;
                        function16 = function15;
                        modifier5 = modifier4;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void TradeQuantity$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void TradeQuantity$lambda$14(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TradeQuantity$lambda$17(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void TradeQuantity$lambda$20(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradeQuantity$lambda$22$lambda$21(KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig keyframesWithSpline) {
        Intrinsics.checkNotNullParameter(keyframesWithSpline, "$this$keyframesWithSpline");
        keyframesWithSpline.setDurationMillis(100);
        long j = 0;
        long j2 = j << 32;
        long j3 = j & 4294967295L;
        long j4 = j2 | j3;
        keyframesWithSpline.mo91at(IntOffset.m8030boximpl(IntOffset.m8033constructorimpl(j4)), 0);
        keyframesWithSpline.atFraction(IntOffset.m8030boximpl(IntOffset.m8033constructorimpl(((-25) << 32) | j3)), 0.33f);
        keyframesWithSpline.atFraction(IntOffset.m8030boximpl(IntOffset.m8033constructorimpl(j4)), 0.66f);
        keyframesWithSpline.atFraction(IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((25 << 32) | j3)), 1.0f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TradeQuantity$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TradeQuantity$lambda$13(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean TradeQuantity$lambda$16(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TradeQuantity$lambda$19(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long TradeQuantity$lambda$23(SnapshotState4<IntOffset> snapshotState4) {
        return snapshotState4.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal TradeQuantity$lambda$7(SnapshotState<BigDecimal> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradeQuantity$lambda$25$lambda$24(CoroutineScope coroutineScope, SnapshotState snapshotState, SnapshotState snapshotState2) {
        TradeQuantity$lambda$11(snapshotState, true);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new TradeQuantity7(snapshotState2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: TradeQuantity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$TradeQuantity$7 */
    static final class C410817 implements Function5<TextFieldValue, InteractionSource3, Function1<? super TextFieldValue, ? extends Unit>, Composer, Integer, Unit> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $buyingPowerDisplay;
        final /* synthetic */ BigDecimal $defaultShareAmount;
        final /* synthetic */ FocusRequester $focusRequester;
        final /* synthetic */ TradeQuantity $inputMode;
        final /* synthetic */ SnapshotState<Boolean> $maxValueReached$delegate;
        final /* synthetic */ SnapshotState<Boolean> $minValueError$delegate;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ SnapshotState<BigDecimal> $numberOfShares$delegate;
        final /* synthetic */ Function1<BigDecimal, Unit> $onQuantityUpdated;
        final /* synthetic */ Resources $resources;
        final /* synthetic */ SnapshotState4<IntOffset> $shakeOffset$delegate;
        final /* synthetic */ boolean $showQuantityLabel;
        final /* synthetic */ SnapshotState<Boolean> $userChangedValue$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C410817(Modifier modifier, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState4<IntOffset> snapshotState4, FocusRequester focusRequester, Function1<? super BigDecimal, Unit> function1, TradeQuantity tradeQuantity, boolean z, SnapshotState<BigDecimal> snapshotState3, SnapshotState<Boolean> snapshotState5, BigDecimal bigDecimal, Function2<? super Composer, ? super Integer, Unit> function2, Resources resources) {
            this.$modifier = modifier;
            this.$minValueError$delegate = snapshotState;
            this.$maxValueReached$delegate = snapshotState2;
            this.$shakeOffset$delegate = snapshotState4;
            this.$focusRequester = focusRequester;
            this.$onQuantityUpdated = function1;
            this.$inputMode = tradeQuantity;
            this.$showQuantityLabel = z;
            this.$numberOfShares$delegate = snapshotState3;
            this.$userChangedValue$delegate = snapshotState5;
            this.$defaultShareAmount = bigDecimal;
            this.$buyingPowerDisplay = function2;
            this.$resources = resources;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$10$lambda$9$lambda$8$lambda$6(int i) {
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$10$lambda$9$lambda$8$lambda$7(int i) {
            return -i;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x03c0  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x03fb  */
        /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01e8  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0225  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0239  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x025c  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0268  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x02b6  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0354  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0369  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(final TextFieldValue textFieldValue, InteractionSource3 interactionSource, Function1<? super TextFieldValue, Unit> onValueChange, Composer composer, int i) throws Resources.NotFoundException {
            int i2;
            StringResource stringResource;
            StringResource stringResourceInvoke;
            final SnapshotState4<IntOffset> snapshotState4;
            final Function1<BigDecimal, Unit> function1;
            boolean z;
            SnapshotState<BigDecimal> snapshotState;
            int currentCompositeKeyHash;
            Composer composerM6388constructorimpl;
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
            BentoTheme bentoTheme;
            int i3;
            boolean zChanged;
            Object objRememberedValue;
            int currentCompositeKeyHash2;
            Composer composerM6388constructorimpl2;
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
            boolean zChanged2;
            Object objRememberedValue2;
            Object objRememberedValue3;
            Composer.Companion companion;
            DefaultConstructorMarker defaultConstructorMarker;
            int i4;
            long jM21425getFg0d7_KjU;
            String strPluralStringResource;
            Object objRememberedValue4;
            Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
            Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            if ((i & 6) == 0) {
                i2 = (composer.changed(textFieldValue) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(interactionSource) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= composer.changedInstance(onValueChange) ? 256 : 128;
            }
            if ((i2 & 1171) == 1170 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-678128179, i2, -1, "com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantity.<anonymous> (TradeQuantity.kt:142)");
            }
            if (TradeQuantity2.TradeQuantity$lambda$13(this.$minValueError$delegate)) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C41061R.string.trade_amount_bottom_sheet_min_shares_error, new Object[0]);
            } else {
                if (!TradeQuantity2.TradeQuantity$lambda$10(this.$maxValueReached$delegate)) {
                    stringResource = null;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(this.$modifier, 0.0f, 1, null);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    snapshotState4 = this.$shakeOffset$delegate;
                    FocusRequester focusRequester = this.$focusRequester;
                    function1 = this.$onQuantityUpdated;
                    TradeQuantity tradeQuantity = this.$inputMode;
                    int i5 = i2;
                    z = this.$showQuantityLabel;
                    snapshotState = this.$numberOfShares$delegate;
                    SnapshotState<Boolean> snapshotState2 = this.$userChangedValue$delegate;
                    final BigDecimal bigDecimal = this.$defaultShareAmount;
                    final Function2<Composer, Integer, Unit> function2 = this.$buyingPowerDisplay;
                    final Resources resources = this.$resources;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.useNode();
                    } else {
                        composer.createNode(constructor);
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    bentoTheme = BentoTheme.INSTANCE;
                    i3 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21595getXsmallD9Ej5fM(), 7, null);
                    composer.startReplaceGroup(5004770);
                    zChanged = composer.changed(snapshotState4);
                    objRememberedValue = composer.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$TradeQuantity$7$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TradeQuantity2.C410817.invoke$lambda$10$lambda$1$lambda$0(snapshotState4, (Density) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    Modifier modifierOffset = OffsetKt.offset(modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierOffset);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.useNode();
                    } else {
                        composer.createNode(constructor2);
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(Intrinsic3.width(FocusRequesterModifier3.focusRequester(companion4, focusRequester), Intrinsic4.Min), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                    composer.startReplaceGroup(-1633490746);
                    int i6 = i5 & 14;
                    zChanged2 = (i6 != 4) | composer.changed(function1);
                    objRememberedValue2 = composer.rememberedValue();
                    if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$TradeQuantity$7$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TradeQuantity2.C410817.invoke$lambda$10$lambda$5$lambda$3$lambda$2(textFieldValue, function1, (FocusState) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifierM5176widthInVpY3zN4$default, (Function1) objRememberedValue2);
                    composer.startReplaceGroup(1849434622);
                    objRememberedValue3 = composer.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue3 != companion.getEmpty()) {
                        defaultConstructorMarker = null;
                        i4 = 0;
                        objRememberedValue3 = new TradeQuantityNumberVisualFormatter(false, 1, null);
                        composer.updateRememberedValue(objRememberedValue3);
                    } else {
                        defaultConstructorMarker = null;
                        i4 = 0;
                    }
                    TradeQuantityNumberVisualFormatter tradeQuantityNumberVisualFormatter = (TradeQuantityNumberVisualFormatter) objRememberedValue3;
                    composer.endReplaceGroup();
                    SolidColor solidColor = new SolidColor(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU(), defaultConstructorMarker);
                    TextStyle displayCapsuleSmall = bentoTheme.getTypography(composer, i3).getDisplayCapsuleSmall();
                    int iM7920getEnde0LSkKk = TextAlign.INSTANCE.m7920getEnde0LSkKk();
                    if (Intrinsics.areEqual(TradeQuantity2.TradeQuantity$lambda$7(snapshotState), BigDecimal.ONE) || TradeQuantity2.TradeQuantity$lambda$19(snapshotState2) || tradeQuantity != TradeQuantity.REPLACE) {
                        composer.startReplaceGroup(-946678301);
                        jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-946760606);
                        jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21427getFg30d7_KjU();
                        composer.endReplaceGroup();
                    }
                    int i7 = i4;
                    BasicTextFieldKt.BasicTextField(textFieldValue, onValueChange, modifierOnFocusChanged, false, false, TextStyle.m7655copyp1EtxEg$default(displayCapsuleSmall, jM21425getFg0d7_KjU, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, iM7920getEnde0LSkKk, 0, 0L, null, null, null, 0, 0, null, 16744446, null), (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (VisualTransformation) tradeQuantityNumberVisualFormatter, (Function1<? super TextLayoutResult, Unit>) null, interactionSource, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(1020444502, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$TradeQuantity$7$1$2$3
                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> textField, Composer composer2, int i8) {
                            int i9;
                            int i10;
                            Composer composer3 = composer2;
                            Intrinsics.checkNotNullParameter(textField, "textField");
                            if ((i8 & 6) == 0) {
                                i9 = i8 | (composer3.changedInstance(textField) ? 4 : 2);
                            } else {
                                i9 = i8;
                            }
                            if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1020444502, i9, -1, "com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantity.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TradeQuantity.kt:193)");
                            }
                            TextFieldValue textFieldValue2 = textFieldValue;
                            BigDecimal bigDecimal2 = bigDecimal;
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, companion5);
                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer3.startReplaceGroup(487418125);
                            if (Intrinsics.areEqual(textFieldValue2.getText(), "")) {
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i11 = BentoTheme.$stable;
                                Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(companion5, bentoTheme2.getSpacing(composer3, i11).m21590getDefaultD9Ej5fM());
                                String plainString = bigDecimal2.toPlainString();
                                Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                                i10 = i9;
                                BentoText2.m20747BentoText38GnDrw(plainString, modifierM5174width3ABfNKs, Color.m6701boximpl(bentoTheme2.getColors(composer3, i11).m21427getFg30d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composer3, i11).getDisplayCapsuleSmall(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7920getEnde0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer2, 0, 0, 8184);
                                composer3 = composer2;
                            } else {
                                i10 = i9;
                            }
                            composer3.endReplaceGroup();
                            textField.invoke(composer3, Integer.valueOf(i10 & 14));
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function22, Composer composer2, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function22, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer, 54), composer, i6 | ((i5 >> 3) & 112), ((i5 << 6) & 7168) | 196656, 6104);
                    if (z) {
                        composer.startReplaceGroup(-945566145);
                        strPluralStringResource = StringResources_androidKt.pluralStringResource(C11048R.plurals.general_number_of_shares, TradeQuantity2.TradeQuantity$lambda$7(snapshotState).intValue(), new Object[]{""}, composer, i7);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-945716030);
                        strPluralStringResource = StringResources_androidKt.stringResource(C41061R.string.quantity_label, composer, i7);
                        composer.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(strPluralStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleSmall(), composer, 0, 0, 8190);
                    composer.endNode();
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    composer.startReplaceGroup(1849434622);
                    objRememberedValue4 = composer.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$TradeQuantity$7$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TradeQuantity2.C410817.invoke$lambda$10$lambda$9$lambda$8((AnimatedContentTransitionScope) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    composer.endReplaceGroup();
                    AnimatedContentKt.AnimatedContent(stringResource, modifierFillMaxWidth$default2, (Function1) objRememberedValue4, null, null, null, ComposableLambda3.rememberComposableLambda(-776987713, true, new Function4<AnimatedContentScope, StringResource, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$TradeQuantity$7$1$4
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, StringResource stringResource2, Composer composer2, Integer num) {
                            invoke(animatedContentScope, stringResource2, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedContentScope AnimatedContent, StringResource stringResource2, Composer composer2, int i8) {
                            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-776987713, i8, -1, "com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantity.<anonymous>.<anonymous>.<anonymous> (TradeQuantity.kt:230)");
                            }
                            Function2<Composer, Integer, Unit> function22 = function2;
                            Resources resources2 = resources;
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, companion5);
                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function22.invoke(composer2, 0);
                            composer2.startReplaceGroup(-1618258717);
                            if (stringResource2 != null) {
                                Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion5);
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i9 = BentoTheme.$stable;
                                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierMatchParentSize, bentoTheme2.getColors(composer2, i9).m21371getBg0d7_KjU(), null, 2, null);
                                Intrinsics.checkNotNull(resources2);
                                String string2 = stringResource2.getText(resources2).toString();
                                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                                TextStyle textS = bentoTheme2.getTypography(composer2, i9).getTextS();
                                BentoText2.m20747BentoText38GnDrw(string2, modifierM4872backgroundbw27NRU$default, Color.m6701boximpl(bentoTheme2.getColors(composer2, i9).m21452getNegative0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, textS, composer2, 24576, 0, 8104);
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, StringResource.$stable | 1573296, 56);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        return;
                    }
                    ComposerKt.traceEventEnd();
                    return;
                }
                stringResourceInvoke = StringResource.INSTANCE.invoke(C41061R.string.trade_amount_bottom_sheet_max_shares_error, new Object[0]);
            }
            stringResource = stringResourceInvoke;
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(this.$modifier, 0.0f, 1, null);
            Alignment.Companion companion22 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally2 = companion22.getCenterHorizontally();
            snapshotState4 = this.$shakeOffset$delegate;
            FocusRequester focusRequester2 = this.$focusRequester;
            function1 = this.$onQuantityUpdated;
            TradeQuantity tradeQuantity2 = this.$inputMode;
            int i52 = i2;
            z = this.$showQuantityLabel;
            snapshotState = this.$numberOfShares$delegate;
            SnapshotState<Boolean> snapshotState22 = this.$userChangedValue$delegate;
            final BigDecimal bigDecimal2 = this.$defaultShareAmount;
            final Function2<? super Composer, ? super Integer, Unit> function22 = this.$buyingPowerDisplay;
            final Resources resources2 = this.$resources;
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composer, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default3);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
            if (composer.getApplier() == null) {
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
            Column6 column62 = Column6.INSTANCE;
            Modifier.Companion companion42 = Modifier.INSTANCE;
            bentoTheme = BentoTheme.INSTANCE;
            i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion42, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21595getXsmallD9Ej5fM(), 7, null);
            composer.startReplaceGroup(5004770);
            zChanged = composer.changed(snapshotState4);
            objRememberedValue = composer.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$TradeQuantity$7$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TradeQuantity2.C410817.invoke$lambda$10$lambda$1$lambda$0(snapshotState4, (Density) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierOffset2 = OffsetKt.offset(modifierM5146paddingqDBjuR0$default2, (Function1) objRememberedValue);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion22.getCenterVertically(), composer, 48);
            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap22 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer, modifierOffset2);
            Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
            if (composer.getApplier() == null) {
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
            }
            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl2.getInserting()) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
            Row6 row62 = Row6.INSTANCE;
            Modifier modifierM5176widthInVpY3zN4$default2 = SizeKt.m5176widthInVpY3zN4$default(Intrinsic3.width(FocusRequesterModifier3.focusRequester(companion42, focusRequester2), Intrinsic4.Min), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
            composer.startReplaceGroup(-1633490746);
            int i62 = i52 & 14;
            zChanged2 = (i62 != 4) | composer.changed(function1);
            objRememberedValue2 = composer.rememberedValue();
            if (!zChanged2) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$TradeQuantity$7$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TradeQuantity2.C410817.invoke$lambda$10$lambda$5$lambda$3$lambda$2(textFieldValue, function1, (FocusState) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierOnFocusChanged2 = FocusChangedModifier2.onFocusChanged(modifierM5176widthInVpY3zN4$default2, (Function1) objRememberedValue2);
            composer.startReplaceGroup(1849434622);
            objRememberedValue3 = composer.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue3 != companion.getEmpty()) {
            }
            TradeQuantityNumberVisualFormatter tradeQuantityNumberVisualFormatter2 = (TradeQuantityNumberVisualFormatter) objRememberedValue3;
            composer.endReplaceGroup();
            SolidColor solidColor2 = new SolidColor(bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU(), defaultConstructorMarker);
            TextStyle displayCapsuleSmall2 = bentoTheme.getTypography(composer, i3).getDisplayCapsuleSmall();
            int iM7920getEnde0LSkKk2 = TextAlign.INSTANCE.m7920getEnde0LSkKk();
            if (Intrinsics.areEqual(TradeQuantity2.TradeQuantity$lambda$7(snapshotState), BigDecimal.ONE)) {
                composer.startReplaceGroup(-946678301);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
                composer.endReplaceGroup();
            }
            int i72 = i4;
            BasicTextFieldKt.BasicTextField(textFieldValue, onValueChange, modifierOnFocusChanged2, false, false, TextStyle.m7655copyp1EtxEg$default(displayCapsuleSmall2, jM21425getFg0d7_KjU, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, iM7920getEnde0LSkKk2, 0, 0L, null, null, null, 0, 0, null, 16744446, null), (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (VisualTransformation) tradeQuantityNumberVisualFormatter2, (Function1<? super TextLayoutResult, Unit>) null, interactionSource, (Brush) solidColor2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(1020444502, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$TradeQuantity$7$1$2$3
                public final void invoke(Function2<? super Composer, ? super Integer, Unit> textField, Composer composer2, int i8) {
                    int i9;
                    int i10;
                    Composer composer3 = composer2;
                    Intrinsics.checkNotNullParameter(textField, "textField");
                    if ((i8 & 6) == 0) {
                        i9 = i8 | (composer3.changedInstance(textField) ? 4 : 2);
                    } else {
                        i9 = i8;
                    }
                    if ((i9 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020444502, i9, -1, "com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantity.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TradeQuantity.kt:193)");
                    }
                    TextFieldValue textFieldValue2 = textFieldValue;
                    BigDecimal bigDecimal22 = bigDecimal2;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer3, companion5);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor32 = companion6.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor32);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion6.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer3.startReplaceGroup(487418125);
                    if (Intrinsics.areEqual(textFieldValue2.getText(), "")) {
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i11 = BentoTheme.$stable;
                        Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(companion5, bentoTheme2.getSpacing(composer3, i11).m21590getDefaultD9Ej5fM());
                        String plainString = bigDecimal22.toPlainString();
                        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                        i10 = i9;
                        BentoText2.m20747BentoText38GnDrw(plainString, modifierM5174width3ABfNKs, Color.m6701boximpl(bentoTheme2.getColors(composer3, i11).m21427getFg30d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composer3, i11).getDisplayCapsuleSmall(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7920getEnde0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer2, 0, 0, 8184);
                        composer3 = composer2;
                    } else {
                        i10 = i9;
                    }
                    composer3.endReplaceGroup();
                    textField.invoke(composer3, Integer.valueOf(i10 & 14));
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function222, Composer composer2, Integer num) {
                    invoke((Function2<? super Composer, ? super Integer, Unit>) function222, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composer, 54), composer, i62 | ((i52 >> 3) & 112), ((i52 << 6) & 7168) | 196656, 6104);
            if (z) {
            }
            BentoText2.m20747BentoText38GnDrw(strPluralStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleSmall(), composer, 0, 0, 8190);
            composer.endNode();
            Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null);
            composer.startReplaceGroup(1849434622);
            objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            composer.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(stringResource, modifierFillMaxWidth$default22, (Function1) objRememberedValue4, null, null, null, ComposableLambda3.rememberComposableLambda(-776987713, true, new Function4<AnimatedContentScope, StringResource, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$TradeQuantity$7$1$4
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, StringResource stringResource2, Composer composer2, Integer num) {
                    invoke(animatedContentScope, stringResource2, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, StringResource stringResource2, Composer composer2, int i8) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-776987713, i8, -1, "com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantity.<anonymous>.<anonymous>.<anonymous> (TradeQuantity.kt:230)");
                    }
                    Function2<Composer, Integer, Unit> function222 = function22;
                    Resources resources22 = resources2;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, companion5);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor32 = companion6.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor32);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion6.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    function222.invoke(composer2, 0);
                    composer2.startReplaceGroup(-1618258717);
                    if (stringResource2 != null) {
                        Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion5);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierMatchParentSize, bentoTheme2.getColors(composer2, i9).m21371getBg0d7_KjU(), null, 2, null);
                        Intrinsics.checkNotNull(resources22);
                        String string2 = stringResource2.getText(resources22).toString();
                        int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        TextStyle textS = bentoTheme2.getTypography(composer2, i9).getTextS();
                        BentoText2.m20747BentoText38GnDrw(string2, modifierM4872backgroundbw27NRU$default, Color.m6701boximpl(bentoTheme2.getColors(composer2, i9).m21452getNegative0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, textS, composer2, 24576, 0, 8104);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, StringResource.$stable | 1573296, 56);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
            }
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue, InteractionSource3 interactionSource3, Function1<? super TextFieldValue, ? extends Unit> function1, Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(textFieldValue, interactionSource3, (Function1<? super TextFieldValue, Unit>) function1, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IntOffset invoke$lambda$10$lambda$1$lambda$0(SnapshotState4 snapshotState4, Density offset) {
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            return IntOffset.m8030boximpl(TradeQuantity2.TradeQuantity$lambda$23(snapshotState4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$5$lambda$3$lambda$2(TextFieldValue textFieldValue, Function1 function1, FocusState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (!it.getHasFocus() && Intrinsics.areEqual(textFieldValue.getText(), "")) {
                BigDecimal ONE = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                function1.invoke(ONE);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ContentTransform invoke$lambda$10$lambda$9$lambda$8(AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically$default(null, new Function1() { // from class: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$TradeQuantity$7$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(TradeQuantity2.C410817.invoke$lambda$10$lambda$9$lambda$8$lambda$6(((Integer) obj).intValue()));
                }
            }, 1, null), EnterExitTransitionKt.slideOutVertically$default(null, new Function1() { // from class: com.robinhood.shared.trading.tradecomponentscompose.input.TradeQuantityKt$TradeQuantity$7$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(TradeQuantity2.C410817.invoke$lambda$10$lambda$9$lambda$8$lambda$7(((Integer) obj).intValue()));
                }
            }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradeQuantity$lambda$28$lambda$27(BigDecimal bigDecimal, TradeQuantity tradeQuantity, Function1 function1, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Function1 function12, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotState snapshotState4, BigDecimal bigDecimal4) {
        BigDecimal bigDecimal5 = bigDecimal4 == null ? BigDecimal.ZERO : bigDecimal4;
        BigDecimal bigDecimal6 = BigDecimal.ZERO;
        if (Intrinsics.areEqual(bigDecimal5, bigDecimal6) && bigDecimal4 != null) {
            TradeQuantity$lambda$14(snapshotState, true);
            return Unit.INSTANCE;
        }
        if (!Intrinsics.areEqual(bigDecimal5, bigDecimal6)) {
            bigDecimal = bigDecimal5;
        }
        TradeQuantity$lambda$20(snapshotState2, true);
        if (tradeQuantity == TradeQuantity.REPLACE) {
            function1.invoke(TradeQuantity.APPEND);
        }
        boolean zAreEqual = Intrinsics.areEqual(bigDecimal, TradeQuantity$lambda$7(snapshotState3));
        Intrinsics.checkNotNull(bigDecimal);
        snapshotState3.setValue(bigDecimal);
        if (!zAreEqual && bigDecimal.compareTo(bigDecimal2) >= 0 && bigDecimal.compareTo(bigDecimal3) <= 0) {
            TradeQuantity$lambda$11(snapshotState4, false);
            TradeQuantity$lambda$14(snapshotState, false);
            BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal);
            Intrinsics.checkNotNullExpressionValue(bigDecimalM822m, "stripTrailingZeros(...)");
            function12.invoke(bigDecimalM822m);
        }
        return Unit.INSTANCE;
    }
}
