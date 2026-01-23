package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyle;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Button.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008c\u0001\u0010\u0017\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u008c\u0001\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u008c\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, m3636d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/ButtonColors;", "colors", "Landroidx/compose/material3/ButtonElevation;", "elevation", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "content", "Button", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedButton", "TextButton", "material3_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ButtonKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, InteractionSource3 interactionSource3, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevationM5720buttonElevationR_JCAzs;
        int i5;
        Object obj;
        int i6;
        int i7;
        int i8;
        int i9;
        Shape shape3;
        ButtonColors buttonColors3;
        Modifier modifier3;
        InteractionSource3 interactionSource32;
        int i10;
        final PaddingValues contentPadding;
        InteractionSource3 interactionSource33;
        int i11;
        Shape shape4;
        int i12;
        Modifier modifier4;
        BorderStroke borderStroke2;
        boolean z3;
        InteractionSource3 interactionSource34;
        Composer composer2;
        final ButtonColors buttonColors4;
        final boolean z4;
        final Shape shape5;
        final BorderStroke borderStroke3;
        final PaddingValues paddingValues2;
        final Modifier modifier5;
        final ButtonElevation buttonElevation2;
        final InteractionSource3 interactionSource35;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(650121315);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        int i14 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i3 |= i14;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i14;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColors2 = buttonColors;
                        int i15 = composerStartRestartGroup.changed(buttonColors2) ? 16384 : 8192;
                        i3 |= i15;
                    } else {
                        buttonColors2 = buttonColors;
                    }
                    i3 |= i15;
                } else {
                    buttonColors2 = buttonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        buttonElevationM5720buttonElevationR_JCAzs = buttonElevation;
                        int i16 = composerStartRestartGroup.changed(buttonElevationM5720buttonElevationR_JCAzs) ? 131072 : 65536;
                        i3 |= i16;
                    } else {
                        buttonElevationM5720buttonElevationR_JCAzs = buttonElevation;
                    }
                    i3 |= i16;
                } else {
                    buttonElevationM5720buttonElevationR_JCAzs = buttonElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else {
                    if ((1572864 & i) == 0) {
                        obj = borderStroke;
                        i3 |= composerStartRestartGroup.changed(obj) ? 1048576 : 524288;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                        i7 = i13;
                    } else {
                        i7 = i13;
                        if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                        }
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
                        if ((i & 100663296) == 0) {
                            i9 = i8;
                            i3 |= composerStartRestartGroup.changed(interactionSource3) ? 67108864 : 33554432;
                        }
                        if ((i2 & 512) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                        }
                        if ((306783379 & i3) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier6 = i7 == 0 ? Modifier.INSTANCE : modifier;
                                boolean z5 = i4 == 0 ? true : z2;
                                if ((i2 & 8) == 0) {
                                    i3 &= -7169;
                                    shape3 = ButtonDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                } else {
                                    shape3 = shape2;
                                }
                                if ((i2 & 16) == 0) {
                                    i3 &= -57345;
                                    buttonColors3 = ButtonDefaults.INSTANCE.buttonColors(composerStartRestartGroup, 6);
                                } else {
                                    buttonColors3 = buttonColors2;
                                }
                                int i17 = i3;
                                if ((i2 & 32) == 0) {
                                    modifier3 = modifier6;
                                    interactionSource32 = null;
                                    buttonElevationM5720buttonElevationR_JCAzs = ButtonDefaults.INSTANCE.m5720buttonElevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 196608, 31);
                                    i10 = i17 & (-458753);
                                } else {
                                    modifier3 = modifier6;
                                    interactionSource32 = null;
                                    i10 = i17;
                                }
                                if (i5 != 0) {
                                    obj = interactionSource32;
                                }
                                contentPadding = i6 == 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                interactionSource33 = i9 == 0 ? interactionSource32 : interactionSource3;
                                i11 = i10;
                                buttonColors2 = buttonColors3;
                                shape4 = shape3;
                                i12 = 650121315;
                                modifier4 = modifier3;
                                borderStroke2 = obj;
                                z3 = z5;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                i11 = i3;
                                shape4 = shape2;
                                borderStroke2 = obj;
                                modifier4 = modifier;
                                contentPadding = paddingValues;
                                interactionSource33 = interactionSource3;
                                z3 = z2;
                                i12 = 650121315;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i12, i11, -1, "androidx.compose.material3.Button (Button.kt:118)");
                            }
                            composerStartRestartGroup.startReplaceGroup(-239156623);
                            if (interactionSource33 != null) {
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSource2.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                interactionSource34 = (InteractionSource3) objRememberedValue;
                            } else {
                                interactionSource34 = interactionSource33;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            long jM5714containerColorvNxB06k$material3_release = buttonColors2.m5714containerColorvNxB06k$material3_release(z3);
                            Modifier modifier7 = modifier4;
                            final long jM5715contentColorvNxB06k$material3_release = buttonColors2.m5715contentColorvNxB06k$material3_release(z3);
                            composerStartRestartGroup.startReplaceGroup(-239150048);
                            SnapshotState4<C2002Dp> snapshotState4ShadowElevation$material3_release = buttonElevationM5720buttonElevationR_JCAzs != null ? null : buttonElevationM5720buttonElevationR_JCAzs.shadowElevation$material3_release(z3, interactionSource34, composerStartRestartGroup, ((i11 >> 9) & 896) | ((i11 >> 6) & 14));
                            composerStartRestartGroup.endReplaceGroup();
                            InteractionSource3 interactionSource36 = interactionSource33;
                            SurfaceKt.m5969Surfaceo_FOJdg(function02, SemanticsModifier6.semantics$default(modifier7, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.m7496setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m7479getButtono7Vup1c());
                                }
                            }, 1, null), z3, shape4, jM5714containerColorvNxB06k$material3_release, jM5715contentColorvNxB06k$material3_release, 0.0f, snapshotState4ShadowElevation$material3_release == null ? snapshotState4ShadowElevation$material3_release.getValue().getValue() : C2002Dp.m7995constructorimpl(0), borderStroke2, interactionSource34, ComposableLambda3.rememberComposableLambda(956488494, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i18) {
                                    if ((i18 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(956488494, i18, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:135)");
                                        }
                                        long j = jM5715contentColorvNxB06k$material3_release;
                                        TextStyle labelLarge = MaterialTheme.INSTANCE.getTypography(composer3, 6).getLabelLarge();
                                        final PaddingValues paddingValues3 = contentPadding;
                                        final Function3<Row5, Composer, Integer, Unit> function32 = function3;
                                        ProvideContentColorTextStyle.m6093ProvideContentColorTextStyle3JVO9M(j, labelLarge, ComposableLambda3.rememberComposableLambda(1327513942, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i19) {
                                                if ((i19 & 3) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1327513942, i19, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:139)");
                                                    }
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                                    Modifier modifierPadding = PaddingKt.padding(SizeKt.m5154defaultMinSizeVpY3zN4(companion, buttonDefaults.m5723getMinWidthD9Ej5fM(), buttonDefaults.m5722getMinHeightD9Ej5fM()), paddingValues3);
                                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                    Function3<Row5, Composer, Integer, Unit> function33 = function32;
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(center, centerVertically, composer4, 54);
                                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierPadding);
                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                                    function33.invoke(Row6.INSTANCE, composer4, 6);
                                                    composer4.endNode();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }, composer3, 54), composer3, 384);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 8078) | (234881024 & (i11 << 6)), 6, 64);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = composerStartRestartGroup;
                            buttonColors4 = buttonColors2;
                            z4 = z3;
                            shape5 = shape4;
                            borderStroke3 = borderStroke2;
                            paddingValues2 = contentPadding;
                            modifier5 = modifier7;
                            buttonElevation2 = buttonElevationM5720buttonElevationR_JCAzs;
                            interactionSource35 = interactionSource36;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier5 = modifier2;
                            z4 = z2;
                            shape5 = shape2;
                            composer2 = composerStartRestartGroup;
                            buttonColors4 = buttonColors2;
                            buttonElevation2 = buttonElevationM5720buttonElevationR_JCAzs;
                            borderStroke3 = obj;
                            paddingValues2 = paddingValues;
                            interactionSource35 = interactionSource3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i18) {
                                    ButtonKt.Button(function0, modifier5, z4, shape5, buttonColors4, buttonElevation2, borderStroke3, paddingValues2, interactionSource35, function3, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 100663296;
                    i9 = i8;
                    if ((i2 & 512) != 0) {
                    }
                    if ((306783379 & i3) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i7 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 8) == 0) {
                            }
                            if ((i2 & 16) == 0) {
                            }
                            int i172 = i3;
                            if ((i2 & 32) == 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            i11 = i10;
                            buttonColors2 = buttonColors3;
                            shape4 = shape3;
                            i12 = 650121315;
                            modifier4 = modifier3;
                            borderStroke2 = obj;
                            z3 = z5;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceGroup(-239156623);
                            if (interactionSource33 != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            long jM5714containerColorvNxB06k$material3_release2 = buttonColors2.m5714containerColorvNxB06k$material3_release(z3);
                            Modifier modifier72 = modifier4;
                            final long jM5715contentColorvNxB06k$material3_release2 = buttonColors2.m5715contentColorvNxB06k$material3_release(z3);
                            composerStartRestartGroup.startReplaceGroup(-239150048);
                            if (buttonElevationM5720buttonElevationR_JCAzs != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            InteractionSource3 interactionSource362 = interactionSource33;
                            SurfaceKt.m5969Surfaceo_FOJdg(function02, SemanticsModifier6.semantics$default(modifier72, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.m7496setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m7479getButtono7Vup1c());
                                }
                            }, 1, null), z3, shape4, jM5714containerColorvNxB06k$material3_release2, jM5715contentColorvNxB06k$material3_release2, 0.0f, snapshotState4ShadowElevation$material3_release == null ? snapshotState4ShadowElevation$material3_release.getValue().getValue() : C2002Dp.m7995constructorimpl(0), borderStroke2, interactionSource34, ComposableLambda3.rememberComposableLambda(956488494, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i18) {
                                    if ((i18 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(956488494, i18, -1, "androidx.compose.material3.Button.<anonymous> (Button.kt:135)");
                                        }
                                        long j = jM5715contentColorvNxB06k$material3_release2;
                                        TextStyle labelLarge = MaterialTheme.INSTANCE.getTypography(composer3, 6).getLabelLarge();
                                        final PaddingValues paddingValues3 = contentPadding;
                                        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32 = function3;
                                        ProvideContentColorTextStyle.m6093ProvideContentColorTextStyle3JVO9M(j, labelLarge, ComposableLambda3.rememberComposableLambda(1327513942, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.Button.2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i19) {
                                                if ((i19 & 3) != 2 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1327513942, i19, -1, "androidx.compose.material3.Button.<anonymous>.<anonymous> (Button.kt:139)");
                                                    }
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                                    Modifier modifierPadding = PaddingKt.padding(SizeKt.m5154defaultMinSizeVpY3zN4(companion, buttonDefaults.m5723getMinWidthD9Ej5fM(), buttonDefaults.m5722getMinHeightD9Ej5fM()), paddingValues3);
                                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                    Function3<Row5, Composer, Integer, Unit> function33 = function32;
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(center, centerVertically, composer4, 54);
                                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierPadding);
                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                                    function33.invoke(Row6.INSTANCE, composer4, 6);
                                                    composer4.endNode();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }, composer3, 54), composer3, 384);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 8078) | (234881024 & (i11 << 6)), 6, 64);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = composerStartRestartGroup;
                            buttonColors4 = buttonColors2;
                            z4 = z3;
                            shape5 = shape4;
                            borderStroke3 = borderStroke2;
                            paddingValues2 = contentPadding;
                            modifier5 = modifier72;
                            buttonElevation2 = buttonElevationM5720buttonElevationR_JCAzs;
                            interactionSource35 = interactionSource362;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                obj = borderStroke;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                }
                i9 = i8;
                if ((i2 & 512) != 0) {
                }
                if ((306783379 & i3) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            obj = borderStroke;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            i9 = i8;
            if ((i2 & 512) != 0) {
            }
            if ((306783379 & i3) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        obj = borderStroke;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        i9 = i8;
        if ((i2 & 512) != 0) {
        }
        if ((306783379 & i3) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, InteractionSource3 interactionSource3, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape outlinedShape;
        ButtonColors buttonColorsOutlinedButtonColors;
        int i5;
        ButtonElevation buttonElevation2;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        int i8;
        BorderStroke borderStrokeOutlinedButtonBorder;
        InteractionSource3 interactionSource32;
        PaddingValues paddingValues2;
        Modifier modifier3;
        BorderStroke borderStroke3;
        boolean z3;
        Shape shape2;
        ButtonColors buttonColors2;
        ButtonElevation buttonElevation3;
        int i9;
        Composer composer2;
        final Modifier modifier4;
        final boolean z4;
        final Shape shape3;
        final ButtonColors buttonColors3;
        final ButtonElevation buttonElevation4;
        final BorderStroke borderStroke4;
        final PaddingValues paddingValues3;
        final InteractionSource3 interactionSource33;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1694808287);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        outlinedShape = shape;
                        int i11 = composerStartRestartGroup.changed(outlinedShape) ? 2048 : 1024;
                        i3 |= i11;
                    } else {
                        outlinedShape = shape;
                    }
                    i3 |= i11;
                } else {
                    outlinedShape = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColorsOutlinedButtonColors = buttonColors;
                        int i12 = composerStartRestartGroup.changed(buttonColorsOutlinedButtonColors) ? 16384 : 8192;
                        i3 |= i12;
                    } else {
                        buttonColorsOutlinedButtonColors = buttonColors;
                    }
                    i3 |= i12;
                } else {
                    buttonColorsOutlinedButtonColors = buttonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        buttonElevation2 = buttonElevation;
                        i3 |= composerStartRestartGroup.changed(buttonElevation2) ? 131072 : 65536;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            borderStroke2 = borderStroke;
                            int i13 = composerStartRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                            i3 |= i13;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        i3 |= i13;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            i8 = i7;
                            i3 |= composerStartRestartGroup.changed(interactionSource3) ? 67108864 : 33554432;
                        }
                        if ((i2 & 512) == 0) {
                            if ((i & 805306368) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                            }
                            if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i10 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                        outlinedShape = ButtonDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                        buttonColorsOutlinedButtonColors = ButtonDefaults.INSTANCE.outlinedButtonColors(composerStartRestartGroup, 6);
                                    }
                                    if (i5 != 0) {
                                        buttonElevation2 = null;
                                    }
                                    if ((i2 & 64) == 0) {
                                        borderStrokeOutlinedButtonBorder = ButtonDefaults.INSTANCE.outlinedButtonBorder(z2, composerStartRestartGroup, ((i3 >> 6) & 14) | 48, 0);
                                        i3 &= -3670017;
                                    } else {
                                        borderStrokeOutlinedButtonBorder = borderStroke2;
                                    }
                                    PaddingValues contentPadding = i6 == 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                    interactionSource32 = i8 == 0 ? null : interactionSource3;
                                    paddingValues2 = contentPadding;
                                    modifier3 = modifier2;
                                    borderStroke3 = borderStrokeOutlinedButtonBorder;
                                    z3 = z2;
                                    shape2 = outlinedShape;
                                    buttonColors2 = buttonColorsOutlinedButtonColors;
                                    buttonElevation3 = buttonElevation2;
                                    i9 = -1694808287;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    paddingValues2 = paddingValues;
                                    interactionSource32 = interactionSource3;
                                    z3 = z2;
                                    shape2 = outlinedShape;
                                    buttonColors2 = buttonColorsOutlinedButtonColors;
                                    buttonElevation3 = buttonElevation2;
                                    borderStroke3 = borderStroke2;
                                    i9 = -1694808287;
                                    modifier3 = modifier2;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i9, i3, -1, "androidx.compose.material3.OutlinedButton (Button.kt:357)");
                                }
                                composer2 = composerStartRestartGroup;
                                Button(function02, modifier3, z3, shape2, buttonColors2, buttonElevation3, borderStroke3, paddingValues2, interactionSource32, function3, composer2, i3 & 2147483646, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                z4 = z3;
                                shape3 = shape2;
                                buttonColors3 = buttonColors2;
                                buttonElevation4 = buttonElevation3;
                                borderStroke4 = borderStroke3;
                                paddingValues3 = paddingValues2;
                                interactionSource33 = interactionSource32;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                interactionSource33 = interactionSource3;
                                composer2 = composerStartRestartGroup;
                                modifier4 = modifier2;
                                z4 = z2;
                                shape3 = outlinedShape;
                                buttonColors3 = buttonColorsOutlinedButtonColors;
                                buttonElevation4 = buttonElevation2;
                                borderStroke4 = borderStroke2;
                                paddingValues3 = paddingValues;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.OutlinedButton.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i14) {
                                        ButtonKt.OutlinedButton(function0, modifier4, z4, shape3, buttonColors3, buttonElevation4, borderStroke4, paddingValues3, interactionSource33, function3, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 805306368;
                        if ((i3 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                }
                                if (i4 != 0) {
                                }
                                if ((i2 & 8) != 0) {
                                }
                                if ((i2 & 16) != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if ((i2 & 64) == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                paddingValues2 = contentPadding;
                                modifier3 = modifier2;
                                borderStroke3 = borderStrokeOutlinedButtonBorder;
                                z3 = z2;
                                shape2 = outlinedShape;
                                buttonColors2 = buttonColorsOutlinedButtonColors;
                                buttonElevation3 = buttonElevation2;
                                i9 = -1694808287;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer2 = composerStartRestartGroup;
                                Button(function02, modifier3, z3, shape2, buttonColors2, buttonElevation3, borderStroke3, paddingValues2, interactionSource32, function3, composer2, i3 & 2147483646, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier4 = modifier3;
                                z4 = z3;
                                shape3 = shape2;
                                buttonColors3 = buttonColors2;
                                buttonElevation4 = buttonElevation3;
                                borderStroke4 = borderStroke3;
                                paddingValues3 = paddingValues2;
                                interactionSource33 = interactionSource32;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i8 = i7;
                    if ((i2 & 512) == 0) {
                    }
                    if ((i3 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                buttonElevation2 = buttonElevation;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i7;
                if ((i2 & 512) == 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            buttonElevation2 = buttonElevation;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i7;
            if ((i2 & 512) == 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        buttonElevation2 = buttonElevation;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i2 & 512) == 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, InteractionSource3 interactionSource3, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape textShape;
        ButtonColors buttonColorsTextButtonColors;
        int i5;
        ButtonElevation buttonElevation2;
        int i6;
        BorderStroke borderStroke2;
        int i7;
        int i8;
        int i9;
        int i10;
        InteractionSource3 interactionSource32;
        PaddingValues paddingValues2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape2;
        final ButtonColors buttonColors2;
        final ButtonElevation buttonElevation3;
        final BorderStroke borderStroke3;
        final PaddingValues paddingValues3;
        final InteractionSource3 interactionSource33;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2106428362);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        textShape = shape;
                        int i12 = composerStartRestartGroup.changed(textShape) ? 2048 : 1024;
                        i3 |= i12;
                    } else {
                        textShape = shape;
                    }
                    i3 |= i12;
                } else {
                    textShape = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        buttonColorsTextButtonColors = buttonColors;
                        int i13 = composerStartRestartGroup.changed(buttonColorsTextButtonColors) ? 16384 : 8192;
                        i3 |= i13;
                    } else {
                        buttonColorsTextButtonColors = buttonColors;
                    }
                    i3 |= i13;
                } else {
                    buttonColorsTextButtonColors = buttonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        buttonElevation2 = buttonElevation;
                        i3 |= composerStartRestartGroup.changed(buttonElevation2) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else {
                        if ((1572864 & i) == 0) {
                            borderStroke2 = borderStroke;
                            i3 |= composerStartRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else {
                            if ((i & 12582912) == 0) {
                                i8 = i7;
                                i3 |= composerStartRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                            }
                            i9 = i2 & 256;
                            if (i9 == 0) {
                                i3 |= 100663296;
                            } else {
                                if ((i & 100663296) == 0) {
                                    i10 = i9;
                                    i3 |= composerStartRestartGroup.changed(interactionSource3) ? 67108864 : 33554432;
                                }
                                if ((i2 & 512) == 0) {
                                    if ((i & 805306368) == 0) {
                                        i3 |= composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                                    }
                                    if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            if (i11 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            if (i4 != 0) {
                                                z2 = true;
                                            }
                                            if ((i2 & 8) != 0) {
                                                i3 &= -7169;
                                                textShape = ButtonDefaults.INSTANCE.getTextShape(composerStartRestartGroup, 6);
                                            }
                                            if ((i2 & 16) != 0) {
                                                i3 &= -57345;
                                                buttonColorsTextButtonColors = ButtonDefaults.INSTANCE.textButtonColors(composerStartRestartGroup, 6);
                                            }
                                            if (i5 != 0) {
                                                buttonElevation2 = null;
                                            }
                                            if (i6 != 0) {
                                                borderStroke2 = null;
                                            }
                                            PaddingValues textButtonContentPadding = i8 == 0 ? ButtonDefaults.INSTANCE.getTextButtonContentPadding() : paddingValues;
                                            interactionSource32 = i10 == 0 ? null : interactionSource3;
                                            paddingValues2 = textButtonContentPadding;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i2 & 8) != 0) {
                                                i3 &= -7169;
                                            }
                                            if ((i2 & 16) != 0) {
                                                i3 &= -57345;
                                            }
                                            paddingValues2 = paddingValues;
                                            interactionSource32 = interactionSource3;
                                        }
                                        Modifier modifier4 = modifier2;
                                        Shape shape3 = textShape;
                                        ButtonColors buttonColors3 = buttonColorsTextButtonColors;
                                        ButtonElevation buttonElevation4 = buttonElevation2;
                                        BorderStroke borderStroke4 = borderStroke2;
                                        boolean z4 = z2;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2106428362, i3, -1, "androidx.compose.material3.TextButton (Button.kt:430)");
                                        }
                                        composer2 = composerStartRestartGroup;
                                        Button(function02, modifier4, z4, shape3, buttonColors3, buttonElevation4, borderStroke4, paddingValues2, interactionSource32, function3, composer2, i3 & 2147483646, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier4;
                                        z3 = z4;
                                        shape2 = shape3;
                                        buttonColors2 = buttonColors3;
                                        buttonElevation3 = buttonElevation4;
                                        borderStroke3 = borderStroke4;
                                        paddingValues3 = paddingValues2;
                                        interactionSource33 = interactionSource32;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        interactionSource33 = interactionSource3;
                                        composer2 = composerStartRestartGroup;
                                        modifier3 = modifier2;
                                        z3 = z2;
                                        shape2 = textShape;
                                        buttonColors2 = buttonColorsTextButtonColors;
                                        buttonElevation3 = buttonElevation2;
                                        borderStroke3 = borderStroke2;
                                        paddingValues3 = paddingValues;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt.TextButton.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i14) {
                                                ButtonKt.TextButton(function0, modifier3, z3, shape2, buttonColors2, buttonElevation3, borderStroke3, paddingValues3, interactionSource33, function3, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i3 |= 805306368;
                                if ((i3 & 306783379) == 306783378) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0) {
                                        if (i11 != 0) {
                                        }
                                        if (i4 != 0) {
                                        }
                                        if ((i2 & 8) != 0) {
                                        }
                                        if ((i2 & 16) != 0) {
                                        }
                                        if (i5 != 0) {
                                        }
                                        if (i6 != 0) {
                                        }
                                        if (i8 == 0) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        paddingValues2 = textButtonContentPadding;
                                        Modifier modifier42 = modifier2;
                                        Shape shape32 = textShape;
                                        ButtonColors buttonColors32 = buttonColorsTextButtonColors;
                                        ButtonElevation buttonElevation42 = buttonElevation2;
                                        BorderStroke borderStroke42 = borderStroke2;
                                        boolean z42 = z2;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        composer2 = composerStartRestartGroup;
                                        Button(function02, modifier42, z42, shape32, buttonColors32, buttonElevation42, borderStroke42, paddingValues2, interactionSource32, function3, composer2, i3 & 2147483646, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier3 = modifier42;
                                        z3 = z42;
                                        shape2 = shape32;
                                        buttonColors2 = buttonColors32;
                                        buttonElevation3 = buttonElevation42;
                                        borderStroke3 = borderStroke42;
                                        paddingValues3 = paddingValues2;
                                        interactionSource33 = interactionSource32;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i10 = i9;
                            if ((i2 & 512) == 0) {
                            }
                            if ((i3 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i8 = i7;
                        i9 = i2 & 256;
                        if (i9 == 0) {
                        }
                        i10 = i9;
                        if ((i2 & 512) == 0) {
                        }
                        if ((i3 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    borderStroke2 = borderStroke;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    i9 = i2 & 256;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    if ((i2 & 512) == 0) {
                    }
                    if ((i3 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                buttonElevation2 = buttonElevation;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                borderStroke2 = borderStroke;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i7;
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i2 & 512) == 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            buttonElevation2 = buttonElevation;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            borderStroke2 = borderStroke;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i2 & 512) == 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        buttonElevation2 = buttonElevation;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        borderStroke2 = borderStroke;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i2 & 512) == 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
