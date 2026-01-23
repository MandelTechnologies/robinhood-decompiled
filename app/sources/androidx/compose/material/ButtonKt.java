package androidx.compose.material;

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
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
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
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
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
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008c\u0001\u0010\u0017\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u008c\u0001\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u008c\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u0018¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/ButtonElevation;", "elevation", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/material/ButtonColors;", "colors", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "content", "Button", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/ButtonElevation;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ButtonColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedButton", "TextButton", "Landroidx/compose/ui/graphics/Color;", "contentColor", "material_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ButtonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long Button$lambda$1(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fb  */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(final Function0<Unit> function0, Modifier modifier, boolean z, InteractionSource3 interactionSource3, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        InteractionSource3 interactionSource32;
        ButtonElevation buttonElevationM5543elevationR_JCAzs;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        final Shape shape2;
        final BorderStroke borderStroke2;
        final Modifier modifier3;
        final boolean z3;
        final InteractionSource3 interactionSource33;
        final ButtonElevation buttonElevation2;
        final ButtonColors buttonColors2;
        final PaddingValues paddingValues2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        InteractionSource3 interactionSource34;
        int i10;
        Shape small;
        Composer composer3;
        boolean z4;
        int i11;
        boolean z5;
        ButtonColors buttonColorsM5542buttonColorsro_MJ88;
        final PaddingValues contentPadding;
        Shape shape3;
        BorderStroke borderStroke3;
        boolean z6;
        int i12;
        ?? r6;
        ?? r4;
        InteractionSource3 interactionSource35;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2116133464);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
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
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        interactionSource32 = interactionSource3;
                        i3 |= composerStartRestartGroup.changed(interactionSource32) ? 2048 : 1024;
                    }
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            buttonElevationM5543elevationR_JCAzs = buttonElevation;
                            int i14 = composerStartRestartGroup.changed(buttonElevationM5543elevationR_JCAzs) ? 16384 : 8192;
                            i3 |= i14;
                        } else {
                            buttonElevationM5543elevationR_JCAzs = buttonElevation;
                        }
                        i3 |= i14;
                    } else {
                        buttonElevationM5543elevationR_JCAzs = buttonElevation;
                    }
                    if ((196608 & i) == 0) {
                        i3 |= ((i2 & 32) == 0 && composerStartRestartGroup.changed(shape)) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(buttonColors)) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 != 0) {
                        if ((i & 100663296) == 0) {
                            i8 = i7;
                            i3 |= composerStartRestartGroup.changed(paddingValues) ? 67108864 : 33554432;
                        }
                        if ((i2 & 512) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                        }
                        i9 = i3;
                        if (composerStartRestartGroup.shouldExecute((306783379 & i9) != 306783378, i9 & 1)) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
                                boolean z7 = i4 != 0 ? true : z2;
                                interactionSource34 = i5 != 0 ? null : interactionSource32;
                                if ((i2 & 16) != 0) {
                                    i10 = i9 & (-57345);
                                    buttonElevationM5543elevationR_JCAzs = ButtonDefaults.INSTANCE.m5543elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 196608, 31);
                                } else {
                                    i10 = i9;
                                }
                                if ((i2 & 32) != 0) {
                                    small = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall();
                                    i10 &= -458753;
                                } else {
                                    small = shape;
                                }
                                BorderStroke borderStroke4 = i6 != 0 ? null : borderStroke;
                                if ((i2 & 128) != 0) {
                                    z4 = true;
                                    i11 = i8;
                                    z5 = false;
                                    buttonColorsM5542buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m5542buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    composer3 = composerStartRestartGroup;
                                    i10 &= -29360129;
                                } else {
                                    composer3 = composerStartRestartGroup;
                                    z4 = true;
                                    i11 = i8;
                                    z5 = false;
                                    buttonColorsM5542buttonColorsro_MJ88 = buttonColors;
                                }
                                contentPadding = i11 != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
                                shape3 = small;
                                borderStroke3 = borderStroke4;
                                z6 = z7;
                                modifier2 = modifier4;
                                i12 = i10;
                                r4 = z4;
                                r6 = z5;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                i12 = (i2 & 16) != 0 ? i9 & (-57345) : i9;
                                if ((i2 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                if ((i2 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                shape3 = shape;
                                borderStroke3 = borderStroke;
                                z6 = z2;
                                interactionSource34 = interactionSource32;
                                r4 = 1;
                                r6 = 0;
                                contentPadding = paddingValues;
                                composer3 = composerStartRestartGroup;
                                buttonColorsM5542buttonColorsro_MJ88 = buttonColors;
                            }
                            composer3.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2116133464, i12, -1, "androidx.compose.material.Button (Button.kt:106)");
                            }
                            if (interactionSource34 == null) {
                                composer3.startReplaceGroup(1050689923);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSource2.MutableInteractionSource();
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                interactionSource35 = (InteractionSource3) objRememberedValue;
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(-243202092);
                                composer3.endReplaceGroup();
                                interactionSource35 = interactionSource34;
                            }
                            int i15 = i12 >> 6;
                            int i16 = (i15 & 14) | ((i12 >> 18) & 112);
                            final SnapshotState4<Color> snapshotState4ContentColor = buttonColorsM5542buttonColorsro_MJ88.contentColor(z6, composer3, i16);
                            SnapshotState4<C2002Dp> snapshotState4Elevation = null;
                            Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier2, r6, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.m7496setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m7479getButtono7Vup1c());
                                }
                            }, r4, null);
                            long value = buttonColorsM5542buttonColorsro_MJ88.backgroundColor(z6, composer3, i16).getValue().getValue();
                            long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(Button$lambda$1(snapshotState4ContentColor), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                            if (buttonElevationM5543elevationR_JCAzs == null) {
                                composer3.startReplaceGroup(1051096580);
                            } else {
                                composer3.startReplaceGroup(-243188323);
                                snapshotState4Elevation = buttonElevationM5543elevationR_JCAzs.elevation(z6, interactionSource35, composer3, i15 & 910);
                            }
                            composer3.endReplaceGroup();
                            Composer composer4 = composer3;
                            SurfaceKt.m5644SurfaceLPr_se0(function0, modifierSemantics$default, z6, shape3, value, jM6705copywmQWz5c$default, borderStroke3, snapshotState4Elevation != null ? snapshotState4Elevation.getValue().getValue() : C2002Dp.m7995constructorimpl((float) r6), interactionSource35, ComposableLambda3.rememberComposableLambda(7524271, r4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i17) {
                                    if (composer5.shouldExecute((i17 & 3) != 2, i17 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(7524271, i17, -1, "androidx.compose.material.Button.<anonymous> (Button.kt:121)");
                                        }
                                        ProvidedValue<Float> providedValueProvides = ContentAlpha2.getLocalContentAlpha().provides(Float.valueOf(Color.m6708getAlphaimpl(ButtonKt.Button$lambda$1(snapshotState4ContentColor))));
                                        final PaddingValues paddingValues3 = contentPadding;
                                        final Function3<Row5, Composer, Integer, Unit> function32 = function3;
                                        CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(-1699085201, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                invoke(composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer6, int i18) {
                                                if (!composer6.shouldExecute((i18 & 3) != 2, i18 & 1)) {
                                                    composer6.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1699085201, i18, -1, "androidx.compose.material.Button.<anonymous>.<anonymous> (Button.kt:122)");
                                                }
                                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer6, 6).getButton();
                                                final PaddingValues paddingValues4 = paddingValues3;
                                                final Function3<Row5, Composer, Integer, Unit> function33 = function32;
                                                TextKt.ProvideTextStyle(button, ComposableLambda3.rememberComposableLambda(-630330208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                        invoke(composer7, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer7, int i19) {
                                                        if (composer7.shouldExecute((i19 & 3) != 2, i19 & 1)) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-630330208, i19, -1, "androidx.compose.material.Button.<anonymous>.<anonymous>.<anonymous> (Button.kt:123)");
                                                            }
                                                            Modifier.Companion companion = Modifier.INSTANCE;
                                                            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                                            Modifier modifierPadding = PaddingKt.padding(SizeKt.m5154defaultMinSizeVpY3zN4(companion, buttonDefaults.m5545getMinWidthD9Ej5fM(), buttonDefaults.m5544getMinHeightD9Ej5fM()), paddingValues4);
                                                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                            Function3<Row5, Composer, Integer, Unit> function34 = function33;
                                                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(center, centerVertically, composer7, 54);
                                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer7, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer7, modifierPadding);
                                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                            if (composer7.getApplier() == null) {
                                                                Composables.invalidApplier();
                                                            }
                                                            composer7.startReusableNode();
                                                            if (composer7.getInserting()) {
                                                                composer7.createNode(constructor);
                                                            } else {
                                                                composer7.useNode();
                                                            }
                                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer7);
                                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            }
                                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                                            function34.invoke(Row6.INSTANCE, composer7, 6);
                                                            composer7.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer7.skipToGroupEnd();
                                                    }
                                                }, composer6, 54), composer6, 48);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer5, 54), composer5, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            }, composer3, 54), composer4, (i15 & 7168) | (i12 & 14) | 805306368 | (i12 & 896) | (i12 & 3670016), 0);
                            composer2 = composer4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            ButtonElevation buttonElevation3 = buttonElevationM5543elevationR_JCAzs;
                            paddingValues2 = contentPadding;
                            buttonElevation2 = buttonElevation3;
                            modifier3 = modifier2;
                            buttonColors2 = buttonColorsM5542buttonColorsro_MJ88;
                            z3 = z6;
                            shape2 = shape3;
                            borderStroke2 = borderStroke3;
                            interactionSource33 = interactionSource34;
                        } else {
                            composer2 = composerStartRestartGroup;
                            composer2.skipToGroupEnd();
                            shape2 = shape;
                            borderStroke2 = borderStroke;
                            modifier3 = modifier2;
                            z3 = z2;
                            interactionSource33 = interactionSource32;
                            buttonElevation2 = buttonElevationM5543elevationR_JCAzs;
                            buttonColors2 = buttonColors;
                            paddingValues2 = paddingValues;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i17) {
                                    ButtonKt.Button(function0, modifier3, z3, interactionSource33, buttonElevation2, shape2, borderStroke2, buttonColors2, paddingValues2, function3, composer5, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 100663296;
                    i8 = i7;
                    if ((i2 & 512) != 0) {
                    }
                    i9 = i3;
                    if (composerStartRestartGroup.shouldExecute((306783379 & i9) != 306783378, i9 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                interactionSource32 = interactionSource3;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) == 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                }
                i8 = i7;
                if ((i2 & 512) != 0) {
                }
                i9 = i3;
                if (composerStartRestartGroup.shouldExecute((306783379 & i9) != 306783378, i9 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            interactionSource32 = interactionSource3;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) == 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i2 & 512) != 0) {
            }
            i9 = i3;
            if (composerStartRestartGroup.shouldExecute((306783379 & i9) != 306783378, i9 & 1)) {
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
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        interactionSource32 = interactionSource3;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) == 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i2 & 512) != 0) {
        }
        i9 = i3;
        if (composerStartRestartGroup.shouldExecute((306783379 & i9) != 306783378, i9 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void OutlinedButton(Function0<Unit> function0, Modifier modifier, boolean z, InteractionSource3 interactionSource3, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i, int i2) {
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        InteractionSource3 interactionSource32 = (i2 & 8) != 0 ? null : interactionSource3;
        ButtonElevation buttonElevation2 = (i2 & 16) != 0 ? null : buttonElevation;
        Shape small = (i2 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape;
        BorderStroke outlinedBorder = (i2 & 64) != 0 ? ButtonDefaults.INSTANCE.getOutlinedBorder(composer, 6) : borderStroke;
        ButtonColors buttonColorsM5546outlinedButtonColorsRGew2ao = (i2 & 128) != 0 ? ButtonDefaults.INSTANCE.m5546outlinedButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7) : buttonColors;
        PaddingValues contentPadding = (i2 & 256) != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1776134358, i, -1, "androidx.compose.material.OutlinedButton (Button.kt:183)");
        }
        Button(function0, modifier2, z2, interactionSource32, buttonElevation2, small, outlinedBorder, buttonColorsM5546outlinedButtonColorsRGew2ao, contentPadding, function3, composer, i & 2147483646, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void TextButton(Function0<Unit> function0, Modifier modifier, boolean z, InteractionSource3 interactionSource3, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i, int i2) {
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        InteractionSource3 interactionSource32 = (i2 & 8) != 0 ? null : interactionSource3;
        ButtonElevation buttonElevation2 = (i2 & 16) != 0 ? null : buttonElevation;
        Shape small = (i2 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape;
        BorderStroke borderStroke2 = (i2 & 64) == 0 ? borderStroke : null;
        ButtonColors buttonColorsM5547textButtonColorsRGew2ao = (i2 & 128) != 0 ? ButtonDefaults.INSTANCE.m5547textButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7) : buttonColors;
        PaddingValues textButtonContentPadding = (i2 & 256) != 0 ? ButtonDefaults.INSTANCE.getTextButtonContentPadding() : paddingValues;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(288797557, i, -1, "androidx.compose.material.TextButton (Button.kt:241)");
        }
        Button(function0, modifier2, z2, interactionSource32, buttonElevation2, small, borderStroke2, buttonColorsM5547textButtonColorsRGew2ao, textButtonContentPadding, function3, composer, i & 2147483646, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
