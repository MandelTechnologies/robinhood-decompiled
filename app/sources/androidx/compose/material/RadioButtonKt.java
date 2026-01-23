package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.Selectable3;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope3;
import androidx.compose.p011ui.graphics.drawscope.Stroke;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RadioButton.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aQ\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010¨\u0006\u0016"}, m3636d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/RadioButtonColors;", "colors", "RadioButton", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/RadioButtonColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "RadioButtonRippleRadius", "F", "RadioButtonPadding", "RadioButtonSize", "RadioRadius", "RadioButtonDotSize", "RadioStrokeWidth", "material_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RadioButtonKt {
    private static final float RadioButtonDotSize;
    private static final float RadioButtonPadding;
    private static final float RadioButtonRippleRadius = C2002Dp.m7995constructorimpl(24);
    private static final float RadioButtonSize;
    private static final float RadioRadius;
    private static final float RadioStrokeWidth;

    /* JADX WARN: Removed duplicated region for block: B:119:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioButton(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, InteractionSource3 interactionSource3, RadioButtonColors radioButtonColors, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        InteractionSource3 interactionSource32;
        RadioButtonColors radioButtonColors2;
        final Modifier modifier3;
        final boolean z4;
        final InteractionSource3 interactionSource33;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        boolean z5;
        Composer composer2;
        int i6;
        RadioButtonColors radioButtonColorsM5619colorsRGew2ao;
        InteractionSource3 interactionSource34;
        int i7;
        float fM7995constructorimpl;
        ?? r14;
        Modifier modifier5;
        int i8;
        Modifier modifierM5313selectableO2vRcR0;
        Modifier modifierMinimumInteractiveComponentSize;
        Composer composerStartRestartGroup = composer.startRestartGroup(1314435585);
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
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
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
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        interactionSource32 = interactionSource3;
                        i3 |= composerStartRestartGroup.changed(interactionSource32) ? 16384 : 8192;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            radioButtonColors2 = radioButtonColors;
                            int i10 = composerStartRestartGroup.changed(radioButtonColors2) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            radioButtonColors2 = radioButtonColors;
                        }
                        i3 |= i10;
                    } else {
                        radioButtonColors2 = radioButtonColors;
                    }
                    if (!composerStartRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                            z5 = i4 != 0 ? true : z3;
                            InteractionSource3 interactionSource35 = i5 != 0 ? null : interactionSource32;
                            if ((i2 & 32) != 0) {
                                composer2 = composerStartRestartGroup;
                                i6 = i3 & (-458753);
                                radioButtonColorsM5619colorsRGew2ao = RadioButtonDefaults.INSTANCE.m5619colorsRGew2ao(0L, 0L, 0L, composer2, 3072, 7);
                            } else {
                                composer2 = composerStartRestartGroup;
                                i6 = i3;
                                radioButtonColorsM5619colorsRGew2ao = radioButtonColors2;
                            }
                            interactionSource34 = interactionSource35;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i6 = i3;
                            modifier4 = modifier2;
                            z5 = z3;
                            interactionSource34 = interactionSource32;
                            composer2 = composerStartRestartGroup;
                            radioButtonColorsM5619colorsRGew2ao = radioButtonColors2;
                        }
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1314435585, i6, -1, "androidx.compose.material.RadioButton (RadioButton.kt:81)");
                        }
                        if (z) {
                            i7 = 2;
                            fM7995constructorimpl = C2002Dp.m7995constructorimpl(RadioButtonDotSize / 2);
                        } else {
                            i7 = 2;
                            fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                        }
                        int i11 = i7;
                        int i12 = i6;
                        composerStartRestartGroup = composer2;
                        final SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI = AnimateAsState.m4812animateDpAsStateAjpBEmI(fM7995constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                        int i13 = i12 >> 9;
                        final SnapshotState4<Color> snapshotState4RadioColor = radioButtonColorsM5619colorsRGew2ao.radioColor(z5, z, composerStartRestartGroup, ((i12 << 3) & 112) | (i13 & 14) | (i13 & 896));
                        if (function0 != null) {
                            Modifier.Companion companion = Modifier.INSTANCE;
                            int iM7484getRadioButtono7Vup1c = Role.INSTANCE.m7484getRadioButtono7Vup1c();
                            IndicationNodeFactory indicationNodeFactoryM5624rippleH2RKhps$default = RippleKt.m5624rippleH2RKhps$default(false, RadioButtonRippleRadius, 0L, 4, null);
                            Role roleM7472boximpl = Role.m7472boximpl(iM7484getRadioButtono7Vup1c);
                            modifier5 = modifier4;
                            radioButtonColors2 = radioButtonColorsM5619colorsRGew2ao;
                            r14 = 0;
                            z4 = z5;
                            i8 = i11;
                            modifierM5313selectableO2vRcR0 = Selectable3.m5313selectableO2vRcR0(companion, z, interactionSource34, indicationNodeFactoryM5624rippleH2RKhps$default, z4, roleM7472boximpl, function0);
                        } else {
                            radioButtonColors2 = radioButtonColorsM5619colorsRGew2ao;
                            r14 = 0;
                            modifier5 = modifier4;
                            z4 = z5;
                            i8 = i11;
                            modifierM5313selectableO2vRcR0 = Modifier.INSTANCE;
                        }
                        if (function0 != null) {
                            modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                        } else {
                            modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                        }
                        Modifier modifierM5162requiredSize3ABfNKs = SizeKt.m5162requiredSize3ABfNKs(PaddingKt.m5142padding3ABfNKs(SizeKt.wrapContentSize$default(modifier5.then(modifierMinimumInteractiveComponentSize).then(modifierM5313selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r14, i8, null), RadioButtonPadding), RadioButtonSize);
                        boolean zChanged = composerStartRestartGroup.changed(snapshotState4RadioColor) | composerStartRestartGroup.changed(snapshotState4M4812animateDpAsStateAjpBEmI);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope drawScope) {
                                    float fMo5016toPx0680j_4 = drawScope.mo5016toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                    float f = fMo5016toPx0680j_4 / 2;
                                    DrawScope.m6947drawCircleVaOC9Bg$default(drawScope, snapshotState4RadioColor.getValue().getValue(), drawScope.mo5016toPx0680j_4(RadioButtonKt.RadioRadius) - f, 0L, 0.0f, new Stroke(fMo5016toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                    if (C2002Dp.m7994compareTo0680j_4(snapshotState4M4812animateDpAsStateAjpBEmI.getValue().getValue(), C2002Dp.m7995constructorimpl(0)) > 0) {
                                        DrawScope.m6947drawCircleVaOC9Bg$default(drawScope, snapshotState4RadioColor.getValue().getValue(), drawScope.mo5016toPx0680j_4(snapshotState4M4812animateDpAsStateAjpBEmI.getValue().getValue()) - f, 0L, 0.0f, DrawScope3.INSTANCE, null, 0, 108, null);
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Canvas2.Canvas(modifierM5162requiredSize3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, r14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        interactionSource33 = interactionSource34;
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z3;
                        interactionSource33 = interactionSource32;
                    }
                    final RadioButtonColors radioButtonColors3 = radioButtonColors2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt.RadioButton.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i14) {
                                RadioButtonKt.RadioButton(z, function0, modifier3, z4, interactionSource33, radioButtonColors3, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                interactionSource32 = interactionSource3;
                if ((196608 & i) != 0) {
                }
                if (!composerStartRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                final RadioButtonColors radioButtonColors32 = radioButtonColors2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            interactionSource32 = interactionSource3;
            if ((196608 & i) != 0) {
            }
            if (!composerStartRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            final RadioButtonColors radioButtonColors322 = radioButtonColors2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        interactionSource32 = interactionSource3;
        if ((196608 & i) != 0) {
        }
        if (!composerStartRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        final RadioButtonColors radioButtonColors3222 = radioButtonColors2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    static {
        float f = 2;
        RadioButtonPadding = C2002Dp.m7995constructorimpl(f);
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(20);
        RadioButtonSize = fM7995constructorimpl;
        RadioRadius = C2002Dp.m7995constructorimpl(fM7995constructorimpl / f);
        RadioButtonDotSize = C2002Dp.m7995constructorimpl(12);
        RadioStrokeWidth = C2002Dp.m7995constructorimpl(f);
    }
}
