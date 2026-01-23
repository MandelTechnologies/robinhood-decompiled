package com.robinhood.android.psp;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.gestures.TapGestureDetector2;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
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
import com.plaid.internal.EnumC7081g;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HoldToActionButton.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u000eX\u008a\u008e\u0002"}, m3636d2 = {"HoldToActionButton", "", "modifier", "Landroidx/compose/ui/Modifier;", "duration", "", "accentColor", "Landroidx/compose/ui/graphics/Color;", "strokeColor", "strokeWidth", "Landroidx/compose/ui/unit/Dp;", "onProgress", "Lkotlin/Function2;", "", "", "onDown", "Lkotlin/Function0;", "onUp", "onThreshold", "HoldToActionButton-By00fGY", "(Landroidx/compose/ui/Modifier;IJJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-partner-stock-program_externalDebug", "isDown", "hasReachedThreshold"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.psp.HoldToActionButtonKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class HoldToActionButton {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HoldToActionButton_By00fGY$lambda$20(Modifier modifier, int i, long j, long j2, float f, Function2 function2, Function0 function0, Function0 function02, Function0 function03, int i2, int i3, Composer composer, int i4) {
        m17778HoldToActionButtonBy00fGY(modifier, i, j, j2, f, function2, function0, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HoldToActionButton_By00fGY$lambda$1$lambda$0(float f, boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    /* renamed from: HoldToActionButton-By00fGY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17778HoldToActionButtonBy00fGY(Modifier modifier, int i, long j, long j2, float f, Function2<? super Float, ? super Boolean, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        int millis;
        int i5;
        long j3;
        int i6;
        float fM7995constructorimpl;
        int i7;
        Function2<? super Float, ? super Boolean, Unit> function22;
        int i8;
        Function0<Unit> function04;
        int i9;
        int i10;
        long jColor;
        long jColor2;
        final Function0<Unit> function05;
        final Function0<Unit> function06;
        final Function0<Unit> function07;
        long j4;
        Object objRememberedValue;
        Composer.Companion companion;
        Function2<? super Float, ? super Boolean, Unit> function23;
        int i11;
        Animatable animatable;
        Object objRememberedValue2;
        final long j5;
        SnapshotState snapshotState;
        Object objRememberedValue3;
        SnapshotState snapshotState2;
        boolean zChangedInstance;
        Object objRememberedValue4;
        final SnapshotState snapshotState3;
        Animatable animatable2;
        Function2<? super Float, ? super Boolean, Unit> function24;
        final SnapshotState snapshotState4;
        boolean z;
        Object objRememberedValue5;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance2;
        Object objRememberedValue6;
        long j6;
        long j7;
        final Function2<? super Float, ? super Boolean, Unit> function25;
        final int i12;
        final Function0<Unit> function08;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(605568103);
        int i13 = i3 & 1;
        if (i13 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                millis = i;
                int i14 = composerStartRestartGroup.changed(millis) ? 32 : 16;
                i4 |= i14;
            } else {
                millis = i;
            }
            i4 |= i14;
        } else {
            millis = i;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(j) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
                j3 = j2;
            } else {
                j3 = j2;
                if ((i2 & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(j3) ? 2048 : 1024;
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
                if ((i2 & 24576) == 0) {
                    fM7995constructorimpl = f;
                    i4 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 16384 : 8192;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                    function22 = function2;
                } else {
                    function22 = function2;
                    if ((i2 & 196608) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
                    }
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 1572864;
                    function04 = function0;
                } else {
                    function04 = function0;
                    if ((i2 & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function04) ? 1048576 : 524288;
                    }
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function03) ? 67108864 : 33554432;
                }
                if ((i4 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    function07 = function03;
                    i12 = millis;
                    function25 = function22;
                    j5 = j3;
                    j7 = j;
                    function06 = function02;
                    function08 = function04;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                            millis = (int) TimeUnit.SECONDS.toMillis(2L);
                        }
                        jColor = i15 == 0 ? Color2.Color(4286642175L) : j;
                        jColor2 = i5 == 0 ? Color2.Color(4294967295L) : j3;
                        if (i6 != 0) {
                            fM7995constructorimpl = C2002Dp.m7995constructorimpl(8);
                        }
                        if (i7 != 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function2() { // from class: com.robinhood.android.psp.HoldToActionButtonKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return HoldToActionButton.HoldToActionButton_By00fGY$lambda$1$lambda$0(((Float) obj).floatValue(), ((Boolean) obj2).booleanValue());
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function22 = (Function2) objRememberedValue7;
                        }
                        if (i8 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue8 = new Function0() { // from class: com.robinhood.android.psp.HoldToActionButtonKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                            }
                            function05 = (Function0) objRememberedValue8;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function05 = function0;
                        }
                        if (i9 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue9 = new Function0() { // from class: com.robinhood.android.psp.HoldToActionButtonKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                            }
                            function06 = (Function0) objRememberedValue9;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function06 = function02;
                        }
                        if (i10 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue10 = new Function0() { // from class: com.robinhood.android.psp.HoldToActionButtonKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                            }
                            function07 = (Function0) objRememberedValue10;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function07 = function03;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                        }
                        function07 = function03;
                        function05 = function04;
                        jColor2 = j3;
                        jColor = j;
                        function06 = function02;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        j4 = jColor;
                    } else {
                        j4 = jColor;
                        ComposerKt.traceEventStart(605568103, i4, -1, "com.robinhood.android.psp.HoldToActionButton (HoldToActionButton.kt:36)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    function23 = function22;
                    if (objRememberedValue != companion.getEmpty()) {
                        i11 = 2;
                        objRememberedValue = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        i11 = 2;
                    }
                    animatable = (Animatable) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    j5 = jColor2;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, i11, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i11, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    Boolean boolHoldToActionButton_By00fGY$lambda$10 = HoldToActionButton_By00fGY$lambda$10(snapshotState);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = ((458752 & i4) == 131072) | ((((i4 & 112) ^ 48) <= 32 && composerStartRestartGroup.changed(millis)) || (i4 & 48) == 32) | composerStartRestartGroup.changedInstance(animatable) | ((234881024 & i4) == 67108864);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new HoldToActionButton2(snapshotState, millis, animatable, function07, function23, snapshotState2, null);
                        snapshotState3 = snapshotState;
                        animatable2 = animatable;
                        function24 = function23;
                        snapshotState4 = snapshotState2;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        function24 = function23;
                        snapshotState4 = snapshotState2;
                        snapshotState3 = snapshotState;
                        animatable2 = animatable;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function2<? super Float, ? super Boolean, Unit> function26 = function24;
                    EffectsKt.LaunchedEffect(boolHoldToActionButton_By00fGY$lambda$10, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                    Boolean boolValueOf = Boolean.valueOf(HoldToActionButton_By00fGY$lambda$13(snapshotState4));
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    int i16 = millis;
                    z = ((29360128 & i4) != 8388608) | ((3670016 & i4) != 1048576);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new PointerInputEventHandler() { // from class: com.robinhood.android.psp.HoldToActionButtonKt$HoldToActionButton$6$1

                            /* compiled from: HoldToActionButton.kt */
                            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.psp.HoldToActionButtonKt$HoldToActionButton$6$1$1", m3645f = "HoldToActionButton.kt", m3646l = {70}, m3647m = "invokeSuspend")
                            /* renamed from: com.robinhood.android.psp.HoldToActionButtonKt$HoldToActionButton$6$1$1 */
                            static final class C259471 extends ContinuationImpl7 implements Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> {
                                final /* synthetic */ SnapshotState<Boolean> $isDown$delegate;
                                final /* synthetic */ Function0<Unit> $onDown;
                                final /* synthetic */ Function0<Unit> $onUp;
                                private /* synthetic */ Object L$0;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C259471(Function0<Unit> function0, Function0<Unit> function02, SnapshotState<Boolean> snapshotState, Continuation<? super C259471> continuation) {
                                    super(3, continuation);
                                    this.$onDown = function0;
                                    this.$onUp = function02;
                                    this.$isDown$delegate = snapshotState;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Object invoke(TapGestureDetector2 tapGestureDetector2, Offset offset, Continuation<? super Unit> continuation) {
                                    return m17779invoked4ec7I(tapGestureDetector2, offset.getPackedValue(), continuation);
                                }

                                /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                                public final Object m17779invoked4ec7I(TapGestureDetector2 tapGestureDetector2, long j, Continuation<? super Unit> continuation) {
                                    C259471 c259471 = new C259471(this.$onDown, this.$onUp, this.$isDown$delegate, continuation);
                                    c259471.L$0 = tapGestureDetector2;
                                    return c259471.invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        TapGestureDetector2 tapGestureDetector2 = (TapGestureDetector2) this.L$0;
                                        this.$onDown.invoke();
                                        this.$isDown$delegate.setValue(boxing.boxBoolean(true));
                                        this.label = 1;
                                        if (tapGestureDetector2.tryAwaitRelease(this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    this.$onUp.invoke();
                                    this.$isDown$delegate.setValue(boxing.boxBoolean(false));
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                if (!HoldToActionButton.HoldToActionButton_By00fGY$lambda$13(snapshotState4)) {
                                    Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, null, new C259471(function05, function06, snapshotState3, null), null, continuation, 11, null);
                                    return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier2, boolValueOf, (PointerInputEventHandler) objRememberedValue5);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput);
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
                    Function0<Unit> function09 = function05;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance2 = ((57344 & i4) != 16384) | ((i4 & 896) != 256) | composerStartRestartGroup.changedInstance(animatable2) | ((i4 & 7168) != 2048);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                        final float f2 = 360.0f;
                        final long j8 = j4;
                        final Animatable animatable3 = animatable2;
                        final float f3 = fM7995constructorimpl;
                        objRememberedValue6 = new Function1() { // from class: com.robinhood.android.psp.HoldToActionButtonKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return HoldToActionButton.HoldToActionButton_By00fGY$lambda$19$lambda$18$lambda$17(f3, j8, animatable3, f2, j5, (DrawScope) obj);
                            }
                        };
                        j6 = j8;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        j6 = j4;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Canvas2.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue6, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j7 = j6;
                    function25 = function26;
                    i12 = i16;
                    function08 = function09;
                }
                final float f4 = fM7995constructorimpl;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier3 = modifier2;
                    final long j9 = j7;
                    final long j10 = j5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.psp.HoldToActionButtonKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return HoldToActionButton.HoldToActionButton_By00fGY$lambda$20(modifier3, i12, j9, j10, f4, function25, function08, function06, function07, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            fM7995constructorimpl = f;
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            if ((i4 & 38347923) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                    }
                    if ((i3 & 2) != 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    function23 = function22;
                    if (objRememberedValue != companion.getEmpty()) {
                    }
                    animatable = (Animatable) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    j5 = jColor2;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    Boolean boolHoldToActionButton_By00fGY$lambda$102 = HoldToActionButton_By00fGY$lambda$10(snapshotState);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    if (((i4 & 112) ^ 48) <= 32) {
                        zChangedInstance = ((458752 & i4) == 131072) | ((((i4 & 112) ^ 48) <= 32 && composerStartRestartGroup.changed(millis)) || (i4 & 48) == 32) | composerStartRestartGroup.changedInstance(animatable) | ((234881024 & i4) == 67108864);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            objRememberedValue4 = new HoldToActionButton2(snapshotState, millis, animatable, function07, function23, snapshotState2, null);
                            snapshotState3 = snapshotState;
                            animatable2 = animatable;
                            function24 = function23;
                            snapshotState4 = snapshotState2;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            composerStartRestartGroup.endReplaceGroup();
                            Function2<? super Float, ? super Boolean, Unit> function262 = function24;
                            EffectsKt.LaunchedEffect(boolHoldToActionButton_By00fGY$lambda$102, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                            Boolean boolValueOf2 = Boolean.valueOf(HoldToActionButton_By00fGY$lambda$13(snapshotState4));
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            if ((3670016 & i4) != 1048576) {
                            }
                            int i162 = millis;
                            z = ((29360128 & i4) != 8388608) | ((3670016 & i4) != 1048576);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (!z) {
                                objRememberedValue5 = new PointerInputEventHandler() { // from class: com.robinhood.android.psp.HoldToActionButtonKt$HoldToActionButton$6$1

                                    /* compiled from: HoldToActionButton.kt */
                                    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @DebugMetadata(m3644c = "com.robinhood.android.psp.HoldToActionButtonKt$HoldToActionButton$6$1$1", m3645f = "HoldToActionButton.kt", m3646l = {70}, m3647m = "invokeSuspend")
                                    /* renamed from: com.robinhood.android.psp.HoldToActionButtonKt$HoldToActionButton$6$1$1 */
                                    static final class C259471 extends ContinuationImpl7 implements Function3<TapGestureDetector2, Offset, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ SnapshotState<Boolean> $isDown$delegate;
                                        final /* synthetic */ Function0<Unit> $onDown;
                                        final /* synthetic */ Function0<Unit> $onUp;
                                        private /* synthetic */ Object L$0;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        C259471(Function0<Unit> function0, Function0<Unit> function02, SnapshotState<Boolean> snapshotState, Continuation<? super C259471> continuation) {
                                            super(3, continuation);
                                            this.$onDown = function0;
                                            this.$onUp = function02;
                                            this.$isDown$delegate = snapshotState;
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Object invoke(TapGestureDetector2 tapGestureDetector2, Offset offset, Continuation<? super Unit> continuation) {
                                            return m17779invoked4ec7I(tapGestureDetector2, offset.getPackedValue(), continuation);
                                        }

                                        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                                        public final Object m17779invoked4ec7I(TapGestureDetector2 tapGestureDetector2, long j, Continuation<? super Unit> continuation) {
                                            C259471 c259471 = new C259471(this.$onDown, this.$onUp, this.$isDown$delegate, continuation);
                                            c259471.L$0 = tapGestureDetector2;
                                            return c259471.invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                        public final Object invokeSuspend(Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                TapGestureDetector2 tapGestureDetector2 = (TapGestureDetector2) this.L$0;
                                                this.$onDown.invoke();
                                                this.$isDown$delegate.setValue(boxing.boxBoolean(true));
                                                this.label = 1;
                                                if (tapGestureDetector2.tryAwaitRelease(this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj);
                                            }
                                            this.$onUp.invoke();
                                            this.$isDown$delegate.setValue(boxing.boxBoolean(false));
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                                    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                        if (!HoldToActionButton.HoldToActionButton_By00fGY$lambda$13(snapshotState4)) {
                                            Object objDetectTapGestures$default = TapGestureDetector4.detectTapGestures$default(pointerInputScope, null, null, new C259471(function05, function06, snapshotState3, null), null, continuation, 11, null);
                                            return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifier2, boolValueOf2, (PointerInputEventHandler) objRememberedValue5);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput2);
                                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Function0<Unit> function092 = function05;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    zChangedInstance2 = ((57344 & i4) != 16384) | ((i4 & 896) != 256) | composerStartRestartGroup.changedInstance(animatable2) | ((i4 & 7168) != 2048);
                                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance2) {
                                        final float f22 = 360.0f;
                                        final long j82 = j4;
                                        final Animatable animatable32 = animatable2;
                                        final float f32 = fM7995constructorimpl;
                                        objRememberedValue6 = new Function1() { // from class: com.robinhood.android.psp.HoldToActionButtonKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return HoldToActionButton.HoldToActionButton_By00fGY$lambda$19$lambda$18$lambda$17(f32, j82, animatable32, f22, j5, (DrawScope) obj);
                                            }
                                        };
                                        j6 = j82;
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                        composerStartRestartGroup.endReplaceGroup();
                                        Canvas2.Canvas(modifierFillMaxSize$default2, (Function1) objRememberedValue6, composerStartRestartGroup, 6);
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        j7 = j6;
                                        function25 = function262;
                                        i12 = i162;
                                        function08 = function092;
                                    }
                                }
                            }
                        }
                    } else {
                        zChangedInstance = ((458752 & i4) == 131072) | ((((i4 & 112) ^ 48) <= 32 && composerStartRestartGroup.changed(millis)) || (i4 & 48) == 32) | composerStartRestartGroup.changedInstance(animatable) | ((234881024 & i4) == 67108864);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                        }
                    }
                }
            }
            final float f42 = fM7995constructorimpl;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        fM7995constructorimpl = f;
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        if ((i4 & 38347923) == 38347922) {
        }
        final float f422 = fM7995constructorimpl;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HoldToActionButton_By00fGY$lambda$14(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HoldToActionButton_By00fGY$lambda$19$lambda$18$lambda$17(float f, long j, Animatable animatable, float f2, long j2, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m6947drawCircleVaOC9Bg$default(Canvas, j, ((Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) / 2) - Canvas.mo5016toPx0680j_4(f)) - Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(6)), 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(j, 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) - Canvas.mo5016toPx0680j_4(f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)) - Canvas.mo5016toPx0680j_4(f);
        long jM6575constructorimpl = Size.m6575constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        Stroke stroke = new Stroke(Canvas.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(1)), 0.0f, 0, 0, null, 30, null);
        float fMo5016toPx0680j_4 = Canvas.mo5016toPx0680j_4(f) / 2.0f;
        float fMo5016toPx0680j_42 = Canvas.mo5016toPx0680j_4(f) / 2.0f;
        DrawScope.m6945drawArcyD3GUKo$default(Canvas, jM6705copywmQWz5c$default, -90.0f, 360.0f, false, Offset.m6535constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(fMo5016toPx0680j_4) << 32)), jM6575constructorimpl, 0.0f, stroke, null, 0, 832, null);
        float fFloatValue = ((Number) animatable.getValue()).floatValue() * f2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() >> 32)) - Canvas.mo5016toPx0680j_4(f);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (Canvas.mo6963getSizeNHjbRc() & 4294967295L)) - Canvas.mo5016toPx0680j_4(f);
        long jM6575constructorimpl2 = Size.m6575constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
        Stroke stroke2 = new Stroke(Canvas.mo5016toPx0680j_4(f), 0.0f, 0, 0, null, 30, null);
        float fMo5016toPx0680j_43 = Canvas.mo5016toPx0680j_4(f) / 2.0f;
        float fMo5016toPx0680j_44 = Canvas.mo5016toPx0680j_4(f) / 2.0f;
        DrawScope.m6945drawArcyD3GUKo$default(Canvas, j2, -90.0f, fFloatValue, false, Offset.m6535constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_43) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_44) & 4294967295L)), jM6575constructorimpl2, 0.0f, stroke2, null, 0, 832, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean HoldToActionButton_By00fGY$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HoldToActionButton_By00fGY$lambda$13(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
