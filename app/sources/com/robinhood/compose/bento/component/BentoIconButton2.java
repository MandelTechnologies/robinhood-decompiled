package com.robinhood.compose.bento.component;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.IconButtonStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoIconButton.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0018¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u000fX\u008a\u0084\u0002"}, m3636d2 = {"BentoIconButton", "", "onClick", "Lkotlin/Function0;", "icon", "Lcom/robinhood/compose/bento/component/BentoIconButtons$Icon;", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "type", "Lcom/robinhood/compose/bento/component/BentoIconButtons$Type;", "enabled", "", "foregroundColorOverride", "Landroidx/compose/ui/graphics/Color;", "backgroundColorOverride", "borderColorOverride", "buttonSizeOverride", "Landroidx/compose/ui/unit/Dp;", "useIconAssetSize", "BentoIconButton-cqYvz4g", "(Lkotlin/jvm/functions/Function0;Lcom/robinhood/compose/bento/component/BentoIconButtons$Icon;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/BentoIconButtons$Type;ZLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/unit/Dp;ZLandroidx/compose/runtime/Composer;III)V", "BentoIconButtonPrimaryPreview", "(Landroidx/compose/runtime/Composer;I)V", "BentoIconButtonSecondaryPreview", "lib-compose-bento_externalRelease", "currentBorderColor", "currentForegroundColor"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoIconButtonKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoIconButton2 {

    /* compiled from: BentoIconButton.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.BentoIconButtonKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BentoIconButton4.Type.values().length];
            try {
                iArr[BentoIconButton4.Type.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BentoIconButton4.Type.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoIconButtonPrimaryPreview$lambda$3(int i, Composer composer, int i2) {
        BentoIconButtonPrimaryPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoIconButtonSecondaryPreview$lambda$4(int i, Composer composer, int i2) {
        BentoIconButtonSecondaryPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoIconButton_cqYvz4g$lambda$2(Function0 function0, BentoIconButton4.Icon icon, String str, Modifier modifier, BentoIconButton4.Type type2, boolean z, Color color, Color color2, Color color3, C2002Dp c2002Dp, boolean z2, int i, int i2, int i3, Composer composer, int i4) {
        m20641BentoIconButtoncqYvz4g(function0, icon, str, modifier, type2, z, color, color2, color3, c2002Dp, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0107  */
    /* renamed from: BentoIconButton-cqYvz4g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20641BentoIconButtoncqYvz4g(final Function0<Unit> onClick, final BentoIconButton4.Icon icon, final String contentDescription, Modifier modifier, BentoIconButton4.Type type2, boolean z, Color color, Color color2, Color color3, C2002Dp c2002Dp, boolean z2, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        Color color4;
        int i8;
        Color color5;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        IconButtonStyle.Style primary;
        IconButtonStyle.StateColor borderColor;
        RoundedCornerShape roundedCornerShape;
        BorderStroke borderStrokeM4886BorderStrokecXLIe8U;
        final boolean z4;
        Composer composer2;
        final Color color6;
        final boolean z5;
        final Modifier modifier3;
        final BentoIconButton4.Type type3;
        final Color color7;
        final Color color8;
        final C2002Dp c2002Dp2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Composer composerStartRestartGroup = composer.startRestartGroup(-382049948);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(icon) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(contentDescription) ? 256 : 128;
        }
        int i17 = i3 & 8;
        if (i17 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= composerStartRestartGroup.changed(type2 == null ? -1 : type2.ordinal()) ? 16384 : 8192;
            }
            i6 = i3 & 32;
            if (i6 == 0) {
                i4 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    z3 = z;
                    i4 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    color4 = color;
                } else {
                    color4 = color;
                    if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(color4) ? 1048576 : 524288;
                    }
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                    color5 = color2;
                } else {
                    color5 = color2;
                    if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changed(color5) ? 8388608 : 4194304;
                    }
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i10 = i9;
                        i4 |= composerStartRestartGroup.changed(color3) ? 67108864 : 33554432;
                    }
                    i11 = i3 & 512;
                    if (i11 != 0) {
                        if ((i & 805306368) == 0) {
                            i12 = i11;
                            i4 |= composerStartRestartGroup.changed(c2002Dp) ? 536870912 : 268435456;
                        }
                        i13 = i3 & 1024;
                        if (i13 != 0) {
                            i14 = i13;
                            i15 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i14 = i13;
                            i15 = i2 | (composerStartRestartGroup.changed(z2) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i2;
                        }
                        if ((i4 & 306783379) != 306783378 || (i15 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i17 == 0 ? Modifier.INSTANCE : modifier2;
                            BentoIconButton4.Type type4 = i5 == 0 ? BentoIconButton4.Type.Primary : type2;
                            if (i6 != 0) {
                                z3 = true;
                            }
                            if (i7 != 0) {
                                color4 = null;
                            }
                            Color color9 = i8 == 0 ? null : color5;
                            Color color10 = i10 == 0 ? null : color3;
                            C2002Dp c2002Dp3 = i12 == 0 ? null : c2002Dp;
                            boolean z6 = i14 == 0 ? false : z2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-382049948, i4, i15, "com.robinhood.compose.bento.component.BentoIconButton (BentoIconButton.kt:50)");
                            }
                            i16 = WhenMappings.$EnumSwitchMapping$0[type4.ordinal()];
                            if (i16 != 1) {
                                composerStartRestartGroup.startReplaceGroup(-2077755381);
                                primary = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getIconButton(composerStartRestartGroup, 0).getPrimary();
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                if (i16 != 2) {
                                    composerStartRestartGroup.startReplaceGroup(-2077757957);
                                    composerStartRestartGroup.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composerStartRestartGroup.startReplaceGroup(-2077752755);
                                primary = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getIconButton(composerStartRestartGroup, 0).getSecondary();
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            Modifier modifierWithBentoCirclePlaceholder$default = LocalShowPlaceholder.withBentoCirclePlaceholder$default(SizeKt.m5169size3ABfNKs(modifier4, c2002Dp3 == null ? c2002Dp3.getValue() : icon.mo20642getButtonSizeD9Ej5fM()), false, 1, null);
                            BentoIconButton bentoIconButton = BentoIconButton.INSTANCE;
                            RoundedCornerShape shape$lib_compose_bento_externalRelease = bentoIconButton.getShape$lib_compose_bento_externalRelease();
                            borderColor = primary.getColors().getBorderColor();
                            composerStartRestartGroup.startReplaceGroup(-2077741596);
                            if (borderColor != null) {
                                borderStrokeM4886BorderStrokecXLIe8U = null;
                                roundedCornerShape = shape$lib_compose_bento_externalRelease;
                            } else {
                                if (color10 != null) {
                                    borderColor = IconButtonStyle.StateColor.m21784copyOWjLjI$default(borderColor, color10.getValue(), 0L, 2, null);
                                }
                                SnapshotState4<Color> snapshotState4 = borderColor.get(z3, composerStartRestartGroup, ((i4 >> 15) & 14) | (IconButtonStyle.StateColor.$stable << 3));
                                float fM20640getOutlinedBorderSizeD9Ej5fM = bentoIconButton.m20640getOutlinedBorderSizeD9Ej5fM();
                                long jBentoIconButton_cqYvz4g$lambda$1$lambda$0 = BentoIconButton_cqYvz4g$lambda$1$lambda$0(snapshotState4);
                                roundedCornerShape = shape$lib_compose_bento_externalRelease;
                                borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(fM20640getOutlinedBorderSizeD9Ej5fM, Color.m6705copywmQWz5c$default(jBentoIconButton_cqYvz4g$lambda$1$lambda$0, 0.5f, 0.0f, 0.0f, 0.0f, 14, null));
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            final IconButtonStyle.Style style = primary;
                            final Color color11 = color4;
                            final boolean z7 = z6;
                            final boolean z8 = z3;
                            Modifier modifier5 = modifier4;
                            ButtonKt.Button(onClick, modifierWithBentoCirclePlaceholder$default, z8, roundedCornerShape, ButtonDefaults.INSTANCE.m5719buttonColorsro_MJ88(color9 == null ? color9.getValue() : primary.getColors().getBackgroundColor().m21789getEnabledColor0d7_KjU(), primary.getColors().getForegroundColor().m21789getEnabledColor0d7_KjU(), color9 == null ? color9.getValue() : primary.getColors().getBackgroundColor().m21788getDisabledColor0d7_KjU(), primary.getColors().getForegroundColor().m21788getDisabledColor0d7_KjU(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), null, borderStrokeM4886BorderStrokecXLIe8U, bentoIconButton.getContentPadding(), null, ComposableLambda3.rememberComposableLambda(-1218822828, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoIconButtonKt$BentoIconButton$2
                                private static final long invoke$lambda$0(SnapshotState4<Color> snapshotState42) {
                                    return snapshotState42.getValue().getValue();
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                    invoke(row5, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 Button, Composer composer3, int i18) {
                                    BentoIcon4 size24;
                                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                    if ((i18 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1218822828, i18, -1, "com.robinhood.compose.bento.component.BentoIconButton.<anonymous> (BentoIconButton.kt:85)");
                                    }
                                    SnapshotState4<Color> snapshotState42 = (color11 != null ? IconButtonStyle.StateColor.m21784copyOWjLjI$default(style.getColors().getForegroundColor(), color11.getValue(), 0L, 2, null) : style.getColors().getForegroundColor()).get(z8, composer3, IconButtonStyle.StateColor.$stable << 3);
                                    BentoIconButton4.Icon icon2 = icon;
                                    if (icon2 instanceof BentoIconButton4.Icon.StandardSize16) {
                                        size24 = new BentoIcon4.Size16(((BentoIconButton4.Icon.StandardSize16) icon).getAsset());
                                    } else {
                                        if (!(icon2 instanceof BentoIconButton4.Icon.HeroSize24)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        size24 = new BentoIcon4.Size24(((BentoIconButton4.Icon.HeroSize24) icon).getAsset());
                                    }
                                    BentoIcon2.m20644BentoIconFU0evQE(size24, contentDescription, invoke$lambda$0(snapshotState42), null, null, z7, composer3, 0, 24);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i4 & 14) | 818088960 | ((i4 >> 9) & 896), 256);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z4 = z8;
                            composer2 = composerStartRestartGroup;
                            color6 = color11;
                            z5 = z7;
                            modifier3 = modifier5;
                            type3 = type4;
                            color7 = color9;
                            color8 = color10;
                            c2002Dp2 = c2002Dp3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            color8 = color3;
                            z5 = z2;
                            color6 = color4;
                            modifier3 = modifier2;
                            composer2 = composerStartRestartGroup;
                            type3 = type2;
                            c2002Dp2 = c2002Dp;
                            color7 = color5;
                            z4 = z3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoIconButtonKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoIconButton2.BentoIconButton_cqYvz4g$lambda$2(onClick, icon, contentDescription, modifier3, type3, z4, color6, color7, color8, c2002Dp2, z5, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i12 = i11;
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                        if (i17 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i16 = WhenMappings.$EnumSwitchMapping$0[type4.ordinal()];
                        if (i16 != 1) {
                        }
                        Modifier modifierWithBentoCirclePlaceholder$default2 = LocalShowPlaceholder.withBentoCirclePlaceholder$default(SizeKt.m5169size3ABfNKs(modifier4, c2002Dp3 == null ? c2002Dp3.getValue() : icon.mo20642getButtonSizeD9Ej5fM()), false, 1, null);
                        BentoIconButton bentoIconButton2 = BentoIconButton.INSTANCE;
                        RoundedCornerShape shape$lib_compose_bento_externalRelease2 = bentoIconButton2.getShape$lib_compose_bento_externalRelease();
                        borderColor = primary.getColors().getBorderColor();
                        composerStartRestartGroup.startReplaceGroup(-2077741596);
                        if (borderColor != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        final IconButtonStyle.Style style2 = primary;
                        final Color color112 = color4;
                        final boolean z72 = z6;
                        final boolean z82 = z3;
                        Modifier modifier52 = modifier4;
                        ButtonKt.Button(onClick, modifierWithBentoCirclePlaceholder$default2, z82, roundedCornerShape, ButtonDefaults.INSTANCE.m5719buttonColorsro_MJ88(color9 == null ? color9.getValue() : primary.getColors().getBackgroundColor().m21789getEnabledColor0d7_KjU(), primary.getColors().getForegroundColor().m21789getEnabledColor0d7_KjU(), color9 == null ? color9.getValue() : primary.getColors().getBackgroundColor().m21788getDisabledColor0d7_KjU(), primary.getColors().getForegroundColor().m21788getDisabledColor0d7_KjU(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), null, borderStrokeM4886BorderStrokecXLIe8U, bentoIconButton2.getContentPadding(), null, ComposableLambda3.rememberComposableLambda(-1218822828, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoIconButtonKt$BentoIconButton$2
                            private static final long invoke$lambda$0(SnapshotState4<Color> snapshotState42) {
                                return snapshotState42.getValue().getValue();
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                invoke(row5, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 Button, Composer composer3, int i18) {
                                BentoIcon4 size24;
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i18 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1218822828, i18, -1, "com.robinhood.compose.bento.component.BentoIconButton.<anonymous> (BentoIconButton.kt:85)");
                                }
                                SnapshotState4<Color> snapshotState42 = (color112 != null ? IconButtonStyle.StateColor.m21784copyOWjLjI$default(style2.getColors().getForegroundColor(), color112.getValue(), 0L, 2, null) : style2.getColors().getForegroundColor()).get(z82, composer3, IconButtonStyle.StateColor.$stable << 3);
                                BentoIconButton4.Icon icon2 = icon;
                                if (icon2 instanceof BentoIconButton4.Icon.StandardSize16) {
                                    size24 = new BentoIcon4.Size16(((BentoIconButton4.Icon.StandardSize16) icon).getAsset());
                                } else {
                                    if (!(icon2 instanceof BentoIconButton4.Icon.HeroSize24)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    size24 = new BentoIcon4.Size24(((BentoIconButton4.Icon.HeroSize24) icon).getAsset());
                                }
                                BentoIcon2.m20644BentoIconFU0evQE(size24, contentDescription, invoke$lambda$0(snapshotState42), null, null, z72, composer3, 0, 24);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, (i4 & 14) | 818088960 | ((i4 >> 9) & 896), 256);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z4 = z82;
                        composer2 = composerStartRestartGroup;
                        color6 = color112;
                        z5 = z72;
                        modifier3 = modifier52;
                        type3 = type4;
                        color7 = color9;
                        color8 = color10;
                        c2002Dp2 = c2002Dp3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i3 & 1024;
                if (i13 != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z3 = z;
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i3 & 1024;
            if (i13 != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        z3 = z;
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final long BentoIconButton_cqYvz4g$lambda$1$lambda$0(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    public static final void BentoIconButtonPrimaryPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-232128950);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-232128950, i, -1, "com.robinhood.compose.bento.component.BentoIconButtonPrimaryPreview (BentoIconButton.kt:206)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BentoIconButton5.INSTANCE.m20786getLambda$490587646$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoIconButtonKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoIconButton2.BentoIconButtonPrimaryPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BentoIconButtonSecondaryPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-46216232);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-46216232, i, -1, "com.robinhood.compose.bento.component.BentoIconButtonSecondaryPreview (BentoIconButton.kt:262)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BentoIconButton5.INSTANCE.getLambda$683080080$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoIconButtonKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoIconButton2.BentoIconButtonSecondaryPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
