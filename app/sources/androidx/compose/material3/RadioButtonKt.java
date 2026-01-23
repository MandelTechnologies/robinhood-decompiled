package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.Selectable3;
import androidx.compose.material3.tokens.RadioButtonTokens;
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
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aQ\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, m3636d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/material3/RadioButtonColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "RadioButton", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "RadioButtonPadding", "F", "RadioButtonDotSize", "RadioStrokeWidth", "material3_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RadioButtonKt {
    private static final float RadioButtonDotSize = C2002Dp.m7995constructorimpl(12);
    private static final float RadioButtonPadding;
    private static final float RadioStrokeWidth;

    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioButton(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, RadioButtonColors radioButtonColors, InteractionSource3 interactionSource3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        RadioButtonColors radioButtonColorsColors;
        int i5;
        InteractionSource3 interactionSource32;
        Modifier modifier3;
        InteractionSource3 interactionSource33;
        int i6;
        boolean z4;
        RadioButtonColors radioButtonColors2;
        float fM7995constructorimpl;
        ?? r11;
        final SnapshotState4<Color> snapshotState4;
        SnapshotState4<C2002Dp> snapshotState42;
        Modifier modifier4;
        final boolean z5;
        Modifier modifierM5313selectableO2vRcR0;
        Modifier modifierMinimumInteractiveComponentSize;
        final SnapshotState4<C2002Dp> snapshotState43;
        boolean zChanged;
        Object objRememberedValue;
        final InteractionSource3 interactionSource34;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(408580840);
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
        int i7 = i2 & 4;
        if (i7 != 0) {
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
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        radioButtonColorsColors = radioButtonColors;
                        int i8 = composerStartRestartGroup.changed(radioButtonColorsColors) ? 16384 : 8192;
                        i3 |= i8;
                    } else {
                        radioButtonColorsColors = radioButtonColors;
                    }
                    i3 |= i8;
                } else {
                    radioButtonColorsColors = radioButtonColors;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        interactionSource32 = interactionSource3;
                        i3 |= composerStartRestartGroup.changed(interactionSource32) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            }
                            if (i5 == 0) {
                                i6 = i3;
                                z4 = z3;
                                radioButtonColors2 = radioButtonColorsColors;
                                interactionSource33 = null;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(408580840, i6, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
                                }
                                if (!z) {
                                    fM7995constructorimpl = C2002Dp.m7995constructorimpl(RadioButtonDotSize / 2);
                                } else {
                                    fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                                }
                                SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI = AnimateAsState.m4812animateDpAsStateAjpBEmI(fM7995constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                                SnapshotState4<Color> snapshotState4RadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i6 >> 6) & 896) | ((i6 >> 9) & 14) | ((i6 << 3) & 112));
                                composerStartRestartGroup.startReplaceGroup(1327106656);
                                if (function0 == null) {
                                    snapshotState42 = snapshotState4M4812animateDpAsStateAjpBEmI;
                                    Modifier modifier6 = modifier3;
                                    z5 = z4;
                                    modifier4 = modifier6;
                                    radioButtonColorsColors = radioButtonColors2;
                                    snapshotState4 = snapshotState4RadioColor$material3_release;
                                    r11 = 0;
                                    modifierM5313selectableO2vRcR0 = Selectable3.m5313selectableO2vRcR0(Modifier.INSTANCE, z, interactionSource33, RippleKt.m5938rippleOrFallbackImplementation9IZ8Weo(false, C2002Dp.m7995constructorimpl(RadioButtonTokens.INSTANCE.m6283getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z5, Role.m7472boximpl(Role.INSTANCE.m7484getRadioButtono7Vup1c()), function0);
                                } else {
                                    r11 = 0;
                                    radioButtonColorsColors = radioButtonColors2;
                                    snapshotState4 = snapshotState4RadioColor$material3_release;
                                    snapshotState42 = snapshotState4M4812animateDpAsStateAjpBEmI;
                                    modifier4 = modifier3;
                                    z5 = z4;
                                    modifierM5313selectableO2vRcR0 = Modifier.INSTANCE;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                if (function0 == null) {
                                    modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                                } else {
                                    modifierMinimumInteractiveComponentSize = Modifier.INSTANCE;
                                }
                                Modifier modifierM5162requiredSize3ABfNKs = SizeKt.m5162requiredSize3ABfNKs(PaddingKt.m5142padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM5313selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r11, 2, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m6282getIconSizeD9Ej5fM());
                                snapshotState43 = snapshotState42;
                                zChanged = composerStartRestartGroup.changed(snapshotState4) | composerStartRestartGroup.changed(snapshotState43);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$1$1
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
                                            float f = 2;
                                            float f2 = fMo5016toPx0680j_4 / f;
                                            DrawScope.m6947drawCircleVaOC9Bg$default(drawScope, snapshotState4.getValue().getValue(), drawScope.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(RadioButtonTokens.INSTANCE.m6282getIconSizeD9Ej5fM() / f)) - f2, 0L, 0.0f, new Stroke(fMo5016toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                            if (C2002Dp.m7994compareTo0680j_4(snapshotState43.getValue().getValue(), C2002Dp.m7995constructorimpl(0)) > 0) {
                                                DrawScope.m6947drawCircleVaOC9Bg$default(drawScope, snapshotState4.getValue().getValue(), drawScope.mo5016toPx0680j_4(snapshotState43.getValue().getValue()) - f2, 0L, 0.0f, DrawScope3.INSTANCE, null, 0, 108, null);
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                Canvas2.Canvas(modifierM5162requiredSize3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, r11);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                interactionSource34 = interactionSource33;
                                modifier5 = modifier4;
                            } else {
                                interactionSource33 = interactionSource3;
                                i6 = i3;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            interactionSource33 = interactionSource3;
                            i6 = i3;
                            modifier3 = modifier2;
                        }
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (!z) {
                        }
                        SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI2 = AnimateAsState.m4812animateDpAsStateAjpBEmI(fM7995constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                        SnapshotState4<Color> snapshotState4RadioColor$material3_release2 = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i6 >> 6) & 896) | ((i6 >> 9) & 14) | ((i6 << 3) & 112));
                        composerStartRestartGroup.startReplaceGroup(1327106656);
                        if (function0 == null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (function0 == null) {
                        }
                        Modifier modifierM5162requiredSize3ABfNKs2 = SizeKt.m5162requiredSize3ABfNKs(PaddingKt.m5142padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(modifierMinimumInteractiveComponentSize).then(modifierM5313selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r11, 2, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m6282getIconSizeD9Ej5fM());
                        snapshotState43 = snapshotState42;
                        zChanged = composerStartRestartGroup.changed(snapshotState4) | composerStartRestartGroup.changed(snapshotState43);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$1$1
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
                                    float f = 2;
                                    float f2 = fMo5016toPx0680j_4 / f;
                                    DrawScope.m6947drawCircleVaOC9Bg$default(drawScope, snapshotState4.getValue().getValue(), drawScope.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(RadioButtonTokens.INSTANCE.m6282getIconSizeD9Ej5fM() / f)) - f2, 0L, 0.0f, new Stroke(fMo5016toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                    if (C2002Dp.m7994compareTo0680j_4(snapshotState43.getValue().getValue(), C2002Dp.m7995constructorimpl(0)) > 0) {
                                        DrawScope.m6947drawCircleVaOC9Bg$default(drawScope, snapshotState4.getValue().getValue(), drawScope.mo5016toPx0680j_4(snapshotState43.getValue().getValue()) - f2, 0L, 0.0f, DrawScope3.INSTANCE, null, 0, 108, null);
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            Canvas2.Canvas(modifierM5162requiredSize3ABfNKs2, (Function1) objRememberedValue, composerStartRestartGroup, r11);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            interactionSource34 = interactionSource33;
                            modifier5 = modifier4;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier5 = modifier2;
                        z5 = z3;
                        interactionSource34 = interactionSource32;
                    }
                    final RadioButtonColors radioButtonColors3 = radioButtonColorsColors;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.RadioButtonKt.RadioButton.2
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
                                RadioButtonKt.RadioButton(z, function0, modifier5, z5, radioButtonColors3, interactionSource34, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                interactionSource32 = interactionSource3;
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if (i5 == 0) {
                        }
                    }
                }
                final RadioButtonColors radioButtonColors32 = radioButtonColorsColors;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            interactionSource32 = interactionSource3;
            if ((74899 & i3) == 74898) {
            }
            final RadioButtonColors radioButtonColors322 = radioButtonColorsColors;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        interactionSource32 = interactionSource3;
        if ((74899 & i3) == 74898) {
        }
        final RadioButtonColors radioButtonColors3222 = radioButtonColorsColors;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    static {
        float f = 2;
        RadioButtonPadding = C2002Dp.m7995constructorimpl(f);
        RadioStrokeWidth = C2002Dp.m7995constructorimpl(f);
    }
}
