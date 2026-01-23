package com.robinhood.compose.bento.component;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HorizontalStaggeredGrid.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001aO\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000f\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "rows", "Landroidx/compose/foundation/layout/PaddingValues;", "edgePadding", "Landroidx/compose/ui/unit/Dp;", "horizontalSpacing", "verticalSpacing", "Lkotlin/Function0;", "", "content", "HorizontalStaggeredGrid-nSlTg7c", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/foundation/layout/PaddingValues;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "HorizontalStaggeredGrid", "HorizontalStaggeredGridPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.HorizontalStaggeredGridKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class HorizontalStaggeredGrid4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalStaggeredGridPreview$lambda$2(int i, Composer composer, int i2) {
        HorizontalStaggeredGridPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalStaggeredGrid_nSlTg7c$lambda$1(Modifier modifier, int i, PaddingValues paddingValues, float f, float f2, Function2 function2, int i2, int i3, Composer composer, int i4) {
        m20813HorizontalStaggeredGridnSlTg7c(modifier, i, paddingValues, f, f2, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0142  */
    /* renamed from: HorizontalStaggeredGrid-nSlTg7c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20813HorizontalStaggeredGridnSlTg7c(Modifier modifier, int i, PaddingValues paddingValues, float f, float f2, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        int i6;
        PaddingValues paddingValues2;
        int i7;
        float f3;
        int i8;
        float f4;
        Modifier modifier3;
        int i9;
        PaddingValues paddingValuesM5135PaddingValues0680j_4;
        float fM7995constructorimpl;
        float fM7995constructorimpl2;
        LayoutDirection layoutDirection;
        boolean zChanged;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final PaddingValues paddingValues3;
        final float f5;
        final float f6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1067395652);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
            }
            i6 = i3 & 4;
            if (i6 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    paddingValues2 = paddingValues;
                    i4 |= composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        f3 = f;
                        i4 |= composerStartRestartGroup.changed(f3) ? 2048 : 1024;
                    }
                    i8 = i3 & 16;
                    if (i8 != 0) {
                        if ((i2 & 24576) == 0) {
                            f4 = f2;
                            i4 |= composerStartRestartGroup.changed(f4) ? 16384 : 8192;
                        }
                        if ((i3 & 32) != 0) {
                            i4 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(content) ? 131072 : 65536;
                        }
                        if ((i4 & 74899) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                            i9 = i11 == 0 ? 3 : i5;
                            paddingValuesM5135PaddingValues0680j_4 = i6 == 0 ? PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0)) : paddingValues2;
                            fM7995constructorimpl = i7 == 0 ? C2002Dp.m7995constructorimpl(0) : f3;
                            fM7995constructorimpl2 = i8 == 0 ? C2002Dp.m7995constructorimpl(0) : f4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1067395652, i4, -1, "com.robinhood.compose.bento.component.HorizontalStaggeredGrid (HorizontalStaggeredGrid.kt:28)");
                            }
                            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChanged = ((i4 & 896) != 256) | composerStartRestartGroup.changed(layoutDirection.ordinal()) | ((i4 & 112) != 32) | ((i4 & 7168) != 2048) | ((57344 & i4) == 16384);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new HorizontalStaggeredGrid5(paddingValuesM5135PaddingValues0680j_4, layoutDirection, i9, fM7995constructorimpl, fM7995constructorimpl2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            int i12 = ((i4 >> 15) & 14) | ((i4 << 3) & 112);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            int i13 = ((i12 << 6) & 896) | 6;
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            content.invoke(composerStartRestartGroup, Integer.valueOf((i13 >> 6) & 14));
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            paddingValues3 = paddingValuesM5135PaddingValues0680j_4;
                            f5 = fM7995constructorimpl;
                            f6 = fM7995constructorimpl2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            i9 = i5;
                            paddingValues3 = paddingValues2;
                            f6 = f4;
                            f5 = f3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier3;
                            final int i14 = i9;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.HorizontalStaggeredGridKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return HorizontalStaggeredGrid4.HorizontalStaggeredGrid_nSlTg7c$lambda$1(modifier4, i14, paddingValues3, f5, f6, content, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 24576;
                    f4 = f2;
                    if ((i3 & 32) != 0) {
                    }
                    if ((i4 & 74899) != 74898) {
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChanged = ((i4 & 896) != 256) | composerStartRestartGroup.changed(layoutDirection.ordinal()) | ((i4 & 112) != 32) | ((i4 & 7168) != 2048) | ((57344 & i4) == 16384);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = new HorizontalStaggeredGrid5(paddingValuesM5135PaddingValues0680j_4, layoutDirection, i9, fM7995constructorimpl, fM7995constructorimpl2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            int i122 = ((i4 >> 15) & 14) | ((i4 << 3) & 112);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            int i132 = ((i122 << 6) & 896) | 6;
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                content.invoke(composerStartRestartGroup, Integer.valueOf((i132 >> 6) & 14));
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                paddingValues3 = paddingValuesM5135PaddingValues0680j_4;
                                f5 = fM7995constructorimpl;
                                f6 = fM7995constructorimpl2;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                f3 = f;
                i8 = i3 & 16;
                if (i8 != 0) {
                }
                f4 = f2;
                if ((i3 & 32) != 0) {
                }
                if ((i4 & 74899) != 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            paddingValues2 = paddingValues;
            i7 = i3 & 8;
            if (i7 != 0) {
            }
            f3 = f;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            f4 = f2;
            if ((i3 & 32) != 0) {
            }
            if ((i4 & 74899) != 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i5 = i;
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        paddingValues2 = paddingValues;
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        f3 = f;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        f4 = f2;
        if ((i3 & 32) != 0) {
        }
        if ((i4 & 74899) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void HorizontalStaggeredGridPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1196947980);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1196947980, i, -1, "com.robinhood.compose.bento.component.HorizontalStaggeredGridPreview (HorizontalStaggeredGrid.kt:91)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, HorizontalStaggeredGrid.INSTANCE.getLambda$60517716$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.HorizontalStaggeredGridKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HorizontalStaggeredGrid4.HorizontalStaggeredGridPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
